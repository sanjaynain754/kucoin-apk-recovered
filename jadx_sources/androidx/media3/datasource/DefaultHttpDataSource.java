package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.webkit.ProxyConfig;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.common.net.HttpHeaders;
import com.google.common.p069io.ByteStreams;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes34.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;

    @Nullable
    private HttpURLConnection connection;

    @Nullable
    private final Predicate<String> contentTypePredicate;
    private final boolean crossProtocolRedirectsForceOriginal;

    @Nullable
    private DataSpec dataSpec;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;

        @Nullable
        private Predicate<String> contentTypePredicate;
        private boolean crossProtocolRedirectsForceOriginal;
        private boolean keepPostFor302Redirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setAllowCrossProtocolRedirects(boolean z11) {
            this.allowCrossProtocolRedirects = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setConnectTimeoutMs(int i11) {
            this.connectTimeoutMs = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setContentTypePredicate(@Nullable Predicate<String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setCrossProtocolRedirectsForceOriginal(boolean z11) {
            this.crossProtocolRedirectsForceOriginal = z11;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setKeepPostFor302Redirects(boolean z11) {
            this.keepPostFor302Redirects = z11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setReadTimeoutMs(int i11) {
            this.readTimeoutMs = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.crossProtocolRedirectsForceOriginal, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    public static class NullFilteringHeadersMap extends ForwardingMap<String, List<String>> {
        private final Map<String, List<String>> headers;

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ boolean m2990b(String str) {
            return str != null;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<String, List<String>> delegate() {
            return this.headers;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && super.standardEquals(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.headers = map;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m2989a(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.filter(super.entrySet(), new Predicate() { // from class: androidx.media3.datasource.g
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return DefaultHttpDataSource.NullFilteringHeadersMap.m2989a((Map.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty() || (super.size() == 1 && super.containsKey(null))) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<String> keySet() {
            return Sets.filter(super.keySet(), new Predicate() { // from class: androidx.media3.datasource.h
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return DefaultHttpDataSource.NullFilteringHeadersMap.m2990b((String) obj);
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    private URL handleRedirect(URL url, @Nullable String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!ProxyConfig.MATCH_HTTPS.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
            }
            if (this.allowCrossProtocolRedirects || protocol.equals(url.getProtocol())) {
                return url2;
            }
            if (this.crossProtocolRedirectsForceOriginal) {
                try {
                    return new URL(url2.toString().replaceFirst(protocol, url.getProtocol()));
                } catch (MalformedURLException e11) {
                    throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2001, 1);
                }
            }
            throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, 2001, 1);
        } catch (MalformedURLException e12) {
            throw new HttpDataSource.HttpDataSourceException(e12, dataSpec, 2001, 1);
        }
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        URL url = new URL(dataSpec.uri.toString());
        int i11 = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j11 = dataSpec.position;
        long j12 = dataSpec.length;
        int i12 = 1;
        boolean zIsFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects && !this.crossProtocolRedirectsForceOriginal && !this.keepPostFor302Redirects) {
            return makeConnection(url, i11, bArr, j11, j12, zIsFlagSet, true, dataSpec.httpRequestHeaders);
        }
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            if (i13 > 20) {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i14), dataSpec, 2001, 1);
            }
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(url, i11, bArr, j11, j12, zIsFlagSet, false, dataSpec.httpRequestHeaders);
            int responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String headerField = httpURLConnectionMakeConnection.getHeaderField("Location");
            if ((i11 == i12 || i11 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionMakeConnection.disconnect();
                url = handleRedirect(url, headerField, dataSpec);
            } else {
                if (i11 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionMakeConnection;
                }
                httpURLConnectionMakeConnection.disconnect();
                if (!this.keepPostFor302Redirects || responseCode != 302) {
                    bArr = null;
                    i11 = 1;
                }
                url = handleRedirect(url, headerField, dataSpec);
            }
            i13 = i14;
            i12 = 1;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e11) {
                    throw new HttpDataSource.HttpDataSourceException(e11, (DataSpec) Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
        } catch (Throwable th2) {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
            this.connection = null;
            this.dataSpec = null;
            throw th2;
        }
    }

    private DefaultHttpDataSource(@Nullable String str, int i11, int i12, boolean z11, boolean z12, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate, boolean z13) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.allowCrossProtocolRedirects = z11;
        this.crossProtocolRedirectsForceOriginal = z12;
        if (z11 && z12) {
            throw new IllegalArgumentException("crossProtocolRedirectsForceOriginal should not be set if allowCrossProtocolRedirects is true");
        }
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z13;
    }

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e11) {
                Log.m2958e(TAG, "Unexpected error while disconnecting", e11);
            }
        }
    }

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private int readInternal(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.bytesToRead;
        if (j11 != -1) {
            long j12 = j11 - this.bytesRead;
            if (j12 == 0) {
                return -1;
            }
            i12 = (int) Math.min(i12, j12);
        }
        int i13 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i11, i12);
        if (i13 == -1) {
            return -1;
        }
        this.bytesRead += (long) i13;
        bytesTransferred(i13);
        return i13;
    }

    private void skipFully(long j11, DataSpec dataSpec) throws IOException {
        if (j11 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j11 > 0) {
            int i11 = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, 0, (int) Math.min(j11, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (i11 == -1) {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j11 -= (long) i11;
            bytesTransferred(i11);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        int i11;
        if (this.connection == null || (i11 = this.responseCode) <= 0) {
            return -1;
        }
        return i11;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        return httpURLConnection == null ? ImmutableMap.m13458of() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] byteArray;
        this.dataSpec = dataSpec;
        long j11 = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection httpURLConnectionMakeConnection = makeConnection(dataSpec);
            this.connection = httpURLConnectionMakeConnection;
            this.responseCode = httpURLConnectionMakeConnection.getResponseCode();
            String responseMessage = httpURLConnectionMakeConnection.getResponseMessage();
            int i11 = this.responseCode;
            if (i11 < 200 || i11 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionMakeConnection.getHeaderFields();
                if (this.responseCode == 416) {
                    if (dataSpec.position == HttpUtil.getDocumentSize(httpURLConnectionMakeConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                        this.transferStarted = true;
                        transferStarted(dataSpec);
                        long j12 = dataSpec.length;
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionMakeConnection.getErrorStream();
                try {
                    byteArray = errorStream != null ? ByteStreams.toByteArray(errorStream) : Util.EMPTY_BYTE_ARRAY;
                } catch (IOException unused) {
                    byteArray = Util.EMPTY_BYTE_ARRAY;
                }
                byte[] bArr = byteArray;
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, this.responseCode == 416 ? new DataSourceException(2008) : null, headerFields, dataSpec, bArr);
            }
            String contentType = httpURLConnectionMakeConnection.getContentType();
            Predicate<String> predicate = this.contentTypePredicate;
            if (predicate != null && !predicate.apply(contentType)) {
                closeConnectionQuietly();
                throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
            }
            if (this.responseCode == 200) {
                long j13 = dataSpec.position;
                if (j13 != 0) {
                    j11 = j13;
                }
            }
            boolean zIsCompressed = isCompressed(httpURLConnectionMakeConnection);
            if (zIsCompressed) {
                this.bytesToRead = dataSpec.length;
            } else {
                long j14 = dataSpec.length;
                if (j14 != -1) {
                    this.bytesToRead = j14;
                } else {
                    long contentLength = HttpUtil.getContentLength(httpURLConnectionMakeConnection.getHeaderField("Content-Length"), httpURLConnectionMakeConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                    this.bytesToRead = contentLength != -1 ? contentLength - j11 : -1L;
                }
            }
            try {
                this.inputStream = httpURLConnectionMakeConnection.getInputStream();
                if (zIsCompressed) {
                    this.inputStream = new GZIPInputStream(this.inputStream);
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                try {
                    skipFully(j11, dataSpec);
                    return this.bytesToRead;
                } catch (IOException e11) {
                    closeConnectionQuietly();
                    if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e11);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2000, 1);
                }
            } catch (IOException e12) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException(e12, dataSpec, 2000, 1);
            }
        } catch (IOException e13) {
            closeConnectionQuietly();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e13, dataSpec, 1);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @VisibleForTesting
    public HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i11, i12);
        } catch (IOException e11) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e11, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    private HttpURLConnection makeConnection(URL url, int i11, @Nullable byte[] bArr, long j11, long j12, boolean z11, boolean z12, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionOpenConnection = openConnection(url);
        httpURLConnectionOpenConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpURLConnectionOpenConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map2.putAll(requestProperties.getSnapshot());
        }
        map2.putAll(this.requestProperties.getSnapshot());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionOpenConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j11, j12);
        if (strBuildRangeRequestHeader != null) {
            httpURLConnectionOpenConnection.setRequestProperty("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            httpURLConnectionOpenConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionOpenConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, z11 ? "gzip" : InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        httpURLConnectionOpenConnection.setInstanceFollowRedirects(z12);
        httpURLConnectionOpenConnection.setDoOutput(bArr != null);
        httpURLConnectionOpenConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i11));
        if (bArr != null) {
            httpURLConnectionOpenConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionOpenConnection.connect();
            OutputStream outputStream = httpURLConnectionOpenConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpURLConnectionOpenConnection;
        }
        httpURLConnectionOpenConnection.connect();
        return httpURLConnectionOpenConnection;
    }
}
