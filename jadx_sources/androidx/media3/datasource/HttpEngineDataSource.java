package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresExtension;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.common.base.Ascii;
import com.google.common.base.Predicate;
import com.google.common.net.HttpHeaders;
import com.google.common.primitives.Longs;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
@RequiresExtension(extension = 31, version = 7)
@UnstableApi
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {

    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;

    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int READ_BUFFER_SIZE_BYTES = 32768;
    private long bytesRemaining;
    private final Clock clock;
    private final int connectTimeoutMs;

    @Nullable
    private Predicate<String> contentTypePredicate;
    private volatile long currentConnectTimeoutMs;

    @Nullable
    private DataSpec currentDataSpec;

    @Nullable
    private UrlRequestWrapper currentUrlRequestWrapper;

    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;

    @Nullable
    private IOException exception;
    private final Executor executor;
    private boolean finished;
    private final boolean handleSetCookieRequests;
    private final HttpEngine httpEngine;
    private final boolean keepPostFor302Redirects;
    private final ConditionVariable operation;

    @Nullable
    private ByteBuffer readBuffer;
    private final int readTimeoutMs;
    private final int requestPriority;
    private final HttpDataSource.RequestProperties requestProperties;
    private final boolean resetTimeoutOnRedirects;

    @Nullable
    private UrlResponseInfo responseInfo;
    private boolean transferStarted;

    @Nullable
    private final String userAgent;

    public static final class Factory implements HttpDataSource.Factory {

        @Nullable
        private Predicate<String> contentTypePredicate;
        private final Executor executor;
        private boolean handleSetCookieRequests;
        private final HttpEngine httpEngine;
        private boolean keepPostFor302Redirects;
        private boolean resetTimeoutOnRedirects;

        @Nullable
        private TransferListener transferListener;

        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int requestPriority = 3;
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory, androidx.media3.datasource.DataSource.Factory
        @UnstableApi
        public HttpDataSource createDataSource() {
            HttpEngineDataSource httpEngineDataSource = new HttpEngineDataSource(this.httpEngine, this.executor, this.requestPriority, this.connectTimeoutMs, this.readTimeoutMs, this.resetTimeoutOnRedirects, this.handleSetCookieRequests, this.userAgent, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                httpEngineDataSource.addTransferListener(transferListener);
            }
            return httpEngineDataSource;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setConnectionTimeoutMs(int i11) {
            this.connectTimeoutMs = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setContentTypePredicate(@Nullable Predicate<String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        @Override // androidx.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setHandleSetCookieRequests(boolean z11) {
            this.handleSetCookieRequests = z11;
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
        public Factory setRequestPriority(int i11) {
            this.requestPriority = i11;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setResetTimeoutOnRedirects(boolean z11) {
            this.resetTimeoutOnRedirects = z11;
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

        public Factory(HttpEngine httpEngine, Executor executor) {
            this.httpEngine = C2888t.m3013a(Assertions.checkNotNull(httpEngine));
            this.executor = executor;
        }
    }

    public final class UrlRequestCallback implements UrlRequest$Callback {
        private volatile boolean isClosed;

        private UrlRequestCallback() {
            this.isClosed = false;
        }

        public void close() {
            this.isClosed = true;
        }

        public synchronized void onCanceled(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo) {
        }

        public synchronized void onFailed(UrlRequest urlRequest, @Nullable UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (this.isClosed) {
                    return;
                }
                if (C2894z.m3019a(httpException) && C2859a0.m2993a(httpException).getErrorCode() == 1) {
                    HttpEngineDataSource.this.exception = new UnknownHostException();
                } else {
                    HttpEngineDataSource.this.exception = httpException;
                }
                HttpEngineDataSource.this.operation.open();
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.operation.open();
        }

        public synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            if (this.isClosed) {
                return;
            }
            DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(HttpEngineDataSource.this.currentDataSpec);
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (dataSpec.httpMethod == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                HttpEngineDataSource.this.exception = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfo.getHttpStatusText(), null, urlResponseInfo.getHeaders().getAsMap(), dataSpec, Util.EMPTY_BYTE_ARRAY);
                HttpEngineDataSource.this.operation.open();
                return;
            }
            if (HttpEngineDataSource.this.resetTimeoutOnRedirects) {
                HttpEngineDataSource.this.resetConnectTimeout();
            }
            boolean z11 = HttpEngineDataSource.this.keepPostFor302Redirects && dataSpec.httpMethod == 2 && httpStatusCode == 302;
            if (!z11 && !HttpEngineDataSource.this.handleSetCookieRequests) {
                urlRequest.followRedirect();
                return;
            }
            String cookies = HttpEngineDataSource.parseCookies((List) urlResponseInfo.getHeaders().getAsMap().get(HttpHeaders.SET_COOKIE));
            if (!z11 && TextUtils.isEmpty(cookies)) {
                urlRequest.followRedirect();
                return;
            }
            urlRequest.cancel();
            DataSpec dataSpecWithUri = (z11 || dataSpec.httpMethod != 2) ? dataSpec.withUri(Uri.parse(str)) : dataSpec.buildUpon().setUri(str).setHttpMethod(1).setHttpBody(null).build();
            if (!TextUtils.isEmpty(cookies)) {
                HashMap map = new HashMap();
                map.putAll(dataSpec.httpRequestHeaders);
                map.put(HttpHeaders.COOKIE, cookies);
                dataSpecWithUri = dataSpecWithUri.buildUpon().setHttpRequestHeaders(map).build();
            }
            try {
                UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = HttpEngineDataSource.this.buildRequestWrapper(dataSpecWithUri);
                if (HttpEngineDataSource.this.currentUrlRequestWrapper != null) {
                    HttpEngineDataSource.this.currentUrlRequestWrapper.close();
                }
                HttpEngineDataSource.this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
                HttpEngineDataSource.this.currentUrlRequestWrapper.start();
            } catch (IOException e11) {
                HttpEngineDataSource.this.exception = e11;
            }
        }

        public synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.responseInfo = urlResponseInfo;
            HttpEngineDataSource.this.operation.open();
        }

        public synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (this.isClosed) {
                return;
            }
            HttpEngineDataSource.this.finished = true;
            HttpEngineDataSource.this.operation.open();
        }
    }

    public static final class UrlRequestWrapper {
        private final UrlRequest urlRequest;
        private final UrlRequestCallback urlRequestCallback;

        public void close() {
            this.urlRequestCallback.close();
            this.urlRequest.cancel();
        }

        public int getStatus() throws InterruptedException {
            final ConditionVariable conditionVariable = new ConditionVariable();
            final int[] iArr = new int[1];
            this.urlRequest.getStatus(new UrlRequest$StatusListener() { // from class: androidx.media3.datasource.HttpEngineDataSource.UrlRequestWrapper.1
                public void onStatus(int i11) {
                    iArr[0] = i11;
                    conditionVariable.open();
                }
            });
            conditionVariable.block();
            return iArr[0];
        }

        public UrlRequest$Callback getUrlRequestCallback() {
            return this.urlRequestCallback;
        }

        public void read(ByteBuffer byteBuffer) {
            this.urlRequest.read(byteBuffer);
        }

        public void start() {
            this.urlRequest.start();
        }

        public UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.urlRequest = urlRequest;
            this.urlRequestCallback = urlRequestCallback;
        }
    }

    @UnstableApi
    public HttpEngineDataSource(HttpEngine httpEngine, Executor executor, int i11, int i12, int i13, boolean z11, boolean z12, @Nullable String str, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate, boolean z13) {
        super(true);
        this.httpEngine = C2888t.m3013a(Assertions.checkNotNull(httpEngine));
        this.executor = (Executor) Assertions.checkNotNull(executor);
        this.requestPriority = i11;
        this.connectTimeoutMs = i12;
        this.readTimeoutMs = i13;
        this.resetTimeoutOnRedirects = z11;
        this.handleSetCookieRequests = z12;
        this.userAgent = str;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.keepPostFor302Redirects = z13;
        this.clock = Clock.DEFAULT;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.operation = new ConditionVariable();
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public synchronized void close() {
        try {
            UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
            if (urlRequestWrapper != null) {
                urlRequestWrapper.close();
                this.currentUrlRequestWrapper = null;
            }
            ByteBuffer byteBuffer = this.readBuffer;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.currentDataSpec = null;
            this.responseInfo = null;
            this.exception = null;
            this.finished = false;
            if (this.transferStarted) {
                this.transferStarted = false;
                transferEnded();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i11, int i12) throws HttpDataSource.HttpDataSourceException {
        Assertions.checkState(this.transferStarted);
        if (i12 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        if (!orCreateReadBuffer.hasRemaining()) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            orCreateReadBuffer.flip();
            Assertions.checkState(orCreateReadBuffer.hasRemaining());
        }
        long j11 = this.bytesRemaining;
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        int iMin = (int) Longs.min(j11, orCreateReadBuffer.remaining(), i12);
        orCreateReadBuffer.get(bArr, i11, iMin);
        long j12 = this.bytesRemaining;
        if (j12 != -1) {
            this.bytesRemaining = j12 - ((long) iMin);
        }
        bytesTransferred(iMin);
        return iMin;
    }

    @UnstableApi
    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
        public final int httpEngineConnectionStatus;

        public OpenException(IOException iOException, DataSpec dataSpec, int i11, int i12) {
            super(iOException, dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }

        public OpenException(String str, DataSpec dataSpec, int i11, int i12) {
            super(str, dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }

        public OpenException(DataSpec dataSpec, int i11, int i12) {
            super(dataSpec, i11, 1);
            this.httpEngineConnectionStatus = i12;
        }
    }

    private boolean blockUntilConnectTimeout() throws InterruptedException {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        boolean zBlock = false;
        while (!zBlock && jElapsedRealtime < this.currentConnectTimeoutMs) {
            zBlock = this.operation.block((this.currentConnectTimeoutMs - jElapsedRealtime) + 5);
            jElapsedRealtime = this.clock.elapsedRealtime();
        }
        return zBlock;
    }

    private UrlRequest.Builder buildRequestBuilder(DataSpec dataSpec, UrlRequest$Callback urlRequest$Callback) throws IOException {
        UrlRequest.Builder directExecutorAllowed = this.httpEngine.newUrlRequestBuilder(dataSpec.uri.toString(), this.executor, urlRequest$Callback).setPriority(this.requestPriority).setDirectExecutorAllowed(true);
        HashMap map = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            map.putAll(requestProperties.getSnapshot());
        }
        map.putAll(this.requestProperties.getSnapshot());
        map.putAll(dataSpec.httpRequestHeaders);
        for (Map.Entry entry : map.entrySet()) {
            directExecutorAllowed.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (dataSpec.httpBody != null && !map.containsKey("Content-Type")) {
            throw new OpenException("HTTP request with non-empty body must set Content-Type", dataSpec, 1004, 0);
        }
        String strBuildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(dataSpec.position, dataSpec.length);
        if (strBuildRangeRequestHeader != null) {
            directExecutorAllowed.addHeader("Range", strBuildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            directExecutorAllowed.addHeader("User-Agent", str);
        }
        directExecutorAllowed.setHttpMethod(dataSpec.getHttpMethodString());
        if (dataSpec.httpBody != null) {
            directExecutorAllowed.setUploadDataProvider(new ByteArrayUploadDataProvider(dataSpec.httpBody), this.executor);
        }
        return directExecutorAllowed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public UrlRequestWrapper buildRequestWrapper(DataSpec dataSpec) throws IOException {
        UrlRequestCallback urlRequestCallback = new UrlRequestCallback();
        return new UrlRequestWrapper(buildRequestBuilder(dataSpec, urlRequestCallback).build(), urlRequestCallback);
    }

    private ByteBuffer getOrCreateReadBuffer() {
        if (this.readBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.readBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.readBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String parseCookies(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return TextUtils.join(";", list);
    }

    private void readInternal(ByteBuffer byteBuffer, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        ((UrlRequestWrapper) Util.castNonNull(this.currentUrlRequestWrapper)).read(byteBuffer);
        try {
            if (!this.operation.block(this.readTimeoutMs)) {
                throw new SocketTimeoutException();
            }
        } catch (InterruptedException unused) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            Thread.currentThread().interrupt();
            this.exception = new InterruptedIOException();
        } catch (SocketTimeoutException e11) {
            if (byteBuffer == this.readBuffer) {
                this.readBuffer = null;
            }
            this.exception = new HttpDataSource.HttpDataSourceException(e11, dataSpec, 2002, 2);
        }
        IOException iOException = this.exception;
        if (iOException != null) {
            if (!(iOException instanceof HttpDataSource.HttpDataSourceException)) {
                throw HttpDataSource.HttpDataSourceException.createForIOException(iOException, dataSpec, 2);
            }
            throw ((HttpDataSource.HttpDataSourceException) iOException);
        }
    }

    private byte[] readResponseBody() throws IOException {
        byte[] bArrCopyOf = Util.EMPTY_BYTE_ARRAY;
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (!this.finished) {
            this.operation.close();
            orCreateReadBuffer.clear();
            readInternal(orCreateReadBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            orCreateReadBuffer.flip();
            if (orCreateReadBuffer.remaining() > 0) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + orCreateReadBuffer.remaining());
                orCreateReadBuffer.get(bArrCopyOf, length, orCreateReadBuffer.remaining());
            }
        }
        return bArrCopyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetConnectTimeout() {
        this.currentConnectTimeoutMs = this.clock.elapsedRealtime() + ((long) this.connectTimeoutMs);
    }

    private void skipFully(long j11, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j11 == 0) {
            return;
        }
        ByteBuffer orCreateReadBuffer = getOrCreateReadBuffer();
        while (j11 > 0) {
            try {
                this.operation.close();
                orCreateReadBuffer.clear();
                readInternal(orCreateReadBuffer, dataSpec);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (this.finished) {
                    throw new OpenException(dataSpec, 2008, 14);
                }
                orCreateReadBuffer.flip();
                Assertions.checkState(orCreateReadBuffer.hasRemaining());
                int iMin = (int) Math.min(orCreateReadBuffer.remaining(), j11);
                orCreateReadBuffer.position(orCreateReadBuffer.position() + iMin);
                j11 -= (long) iMin;
            } catch (IOException e11) {
                if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                    throw ((HttpDataSource.HttpDataSourceException) e11);
                }
                throw new OpenException(e11, dataSpec, e11 instanceof SocketTimeoutException ? 2002 : 2001, 14);
            }
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        this.requestProperties.remove(str);
    }

    @Nullable
    @VisibleForTesting
    @UnstableApi
    public UrlRequest$Callback getCurrentUrlRequestCallback() {
        UrlRequestWrapper urlRequestWrapper = this.currentUrlRequestWrapper;
        if (urlRequestWrapper == null) {
            return null;
        }
        return urlRequestWrapper.getUrlRequestCallback();
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo == null || urlResponseInfo.getHttpStatusCode() <= 0) {
            return -1;
        }
        return this.responseInfo.getHttpStatusCode();
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.responseInfo;
        if (urlResponseInfo != null) {
            return Uri.parse(urlResponseInfo.getUrl());
        }
        DataSpec dataSpec = this.currentDataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] responseBody;
        String firstHeader;
        Assertions.checkNotNull(dataSpec);
        Assertions.checkState(!this.transferStarted);
        this.operation.close();
        resetConnectTimeout();
        this.currentDataSpec = dataSpec;
        try {
            UrlRequestWrapper urlRequestWrapperBuildRequestWrapper = buildRequestWrapper(dataSpec);
            this.currentUrlRequestWrapper = urlRequestWrapperBuildRequestWrapper;
            urlRequestWrapperBuildRequestWrapper.start();
            transferInitializing(dataSpec);
            try {
                boolean zBlockUntilConnectTimeout = blockUntilConnectTimeout();
                IOException iOException = this.exception;
                if (iOException != null) {
                    String message = iOException.getMessage();
                    if (message == null || !Ascii.toLowerCase(message).contains("err_cleartext_not_permitted")) {
                        throw new OpenException(iOException, dataSpec, 2001, urlRequestWrapperBuildRequestWrapper.getStatus());
                    }
                    throw new HttpDataSource.CleartextNotPermittedException(iOException, dataSpec);
                }
                if (!zBlockUntilConnectTimeout) {
                    throw new OpenException(new SocketTimeoutException(), dataSpec, 2002, urlRequestWrapperBuildRequestWrapper.getStatus());
                }
                UrlResponseInfo urlResponseInfoM3008a = C2883n.m3008a(Assertions.checkNotNull(this.responseInfo));
                int httpStatusCode = urlResponseInfoM3008a.getHttpStatusCode();
                Map asMap = urlResponseInfoM3008a.getHeaders().getAsMap();
                long j11 = 0;
                if (httpStatusCode < 200 || httpStatusCode > 299) {
                    if (httpStatusCode == 416) {
                        if (dataSpec.position == HttpUtil.getDocumentSize(getFirstHeader(asMap, HttpHeaders.CONTENT_RANGE))) {
                            this.transferStarted = true;
                            transferStarted(dataSpec);
                            long j12 = dataSpec.length;
                            if (j12 != -1) {
                                return j12;
                            }
                            return 0L;
                        }
                    }
                    try {
                        responseBody = readResponseBody();
                    } catch (IOException unused) {
                        responseBody = Util.EMPTY_BYTE_ARRAY;
                    }
                    throw new HttpDataSource.InvalidResponseCodeException(httpStatusCode, urlResponseInfoM3008a.getHttpStatusText(), httpStatusCode == 416 ? new DataSourceException(2008) : null, asMap, dataSpec, responseBody);
                }
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate != null && (firstHeader = getFirstHeader(asMap, "Content-Type")) != null && !predicate.apply(firstHeader)) {
                    throw new HttpDataSource.InvalidContentTypeException(firstHeader, dataSpec);
                }
                if (httpStatusCode == 200) {
                    long j13 = dataSpec.position;
                    if (j13 != 0) {
                        j11 = j13;
                    }
                }
                if (isCompressed(urlResponseInfoM3008a)) {
                    this.bytesRemaining = dataSpec.length;
                } else {
                    long j14 = dataSpec.length;
                    if (j14 != -1) {
                        this.bytesRemaining = j14;
                    } else {
                        long contentLength = HttpUtil.getContentLength(getFirstHeader(asMap, "Content-Length"), getFirstHeader(asMap, HttpHeaders.CONTENT_RANGE));
                        this.bytesRemaining = contentLength != -1 ? contentLength - j11 : -1L;
                    }
                }
                this.transferStarted = true;
                transferStarted(dataSpec);
                skipFully(j11, dataSpec);
                return this.bytesRemaining;
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                throw new OpenException(new InterruptedIOException(), dataSpec, 1004, -1);
            }
        } catch (IOException e11) {
            if (e11 instanceof HttpDataSource.HttpDataSourceException) {
                throw ((HttpDataSource.HttpDataSourceException) e11);
            }
            throw new OpenException(e11, dataSpec, 2000, 0);
        }
    }

    @Override // androidx.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        this.requestProperties.set(str, str2);
    }

    private static int copyByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + iMin);
        byteBuffer2.put(byteBuffer);
        byteBuffer.limit(iLimit);
        return iMin;
    }

    @Nullable
    private static String getFirstHeader(Map<String, List<String>> map, String str) {
        List<String> list = map.get(str);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    private static boolean isCompressed(UrlResponseInfo urlResponseInfo) {
        for (Map.Entry entry : urlResponseInfo.getHeaders().getAsList()) {
            if (((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                return !((String) entry.getValue()).equalsIgnoreCase(InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
            }
        }
        return false;
    }

    @UnstableApi
    public int read(ByteBuffer byteBuffer) throws HttpDataSource.HttpDataSourceException {
        int iCopyByteBuffer;
        Assertions.checkState(this.transferStarted);
        if (byteBuffer.isDirect()) {
            if (!byteBuffer.hasRemaining()) {
                return 0;
            }
            if (this.bytesRemaining == 0) {
                return -1;
            }
            int iRemaining = byteBuffer.remaining();
            ByteBuffer byteBuffer2 = this.readBuffer;
            if (byteBuffer2 != null && (iCopyByteBuffer = copyByteBuffer(byteBuffer2, byteBuffer)) != 0) {
                long j11 = this.bytesRemaining;
                if (j11 != -1) {
                    this.bytesRemaining = j11 - ((long) iCopyByteBuffer);
                }
                bytesTransferred(iCopyByteBuffer);
                return iCopyByteBuffer;
            }
            this.operation.close();
            readInternal(byteBuffer, (DataSpec) Util.castNonNull(this.currentDataSpec));
            if (this.finished) {
                this.bytesRemaining = 0L;
                return -1;
            }
            Assertions.checkState(iRemaining > byteBuffer.remaining());
            int iRemaining2 = iRemaining - byteBuffer.remaining();
            long j12 = this.bytesRemaining;
            if (j12 != -1) {
                this.bytesRemaining = j12 - ((long) iRemaining2);
            }
            bytesTransferred(iRemaining2);
            return iRemaining2;
        }
        throw new IllegalArgumentException("Passed buffer is not a direct ByteBuffer");
    }
}
