package com.tencent.bugly.proguard;

import androidx.annotation.Nullable;
import androidx.emoji2.text.flatbuffer.C2510b;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.tencent.bugly.network.BuglyListenerFactory;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.security.AccessControlException;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import okio.BufferedSink;
import okio.Okio;
import okio.Pipe;
import okio.Timeout;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33860pd implements URLStreamHandlerFactory, Cloneable {

    /* JADX INFO: renamed from: c */
    public static final String f71387c = "RMonitor_ObsoleteUrlFactory";

    /* JADX INFO: renamed from: d */
    public static final String f71388d = "ObsoleteUrlFactory-Selected-Protocol";

    /* JADX INFO: renamed from: e */
    public static final String f71389e = "ObsoleteUrlFactory-Response-Source";

    /* JADX INFO: renamed from: h */
    public static final int f71392h = 100;

    /* JADX INFO: renamed from: b */
    public OkHttpClient f71395b;

    /* JADX INFO: renamed from: f */
    public static final Set<String> f71390f = new LinkedHashSet(Arrays.asList("OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH"));

    /* JADX INFO: renamed from: g */
    public static final TimeZone f71391g = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: i */
    public static final ThreadLocal<DateFormat> f71393i = new C2510b(new Supplier() { // from class: com.tencent.bugly.proguard.lj
        @Override // java.util.function.Supplier
        public final Object get() {
            return C33860pd.m74541d();
        }
    });

    /* JADX INFO: renamed from: j */
    public static final Comparator<String> f71394j = new Comparator() { // from class: com.tencent.bugly.proguard.mj
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C33860pd.m74536b((String) obj, (String) obj2);
        }
    };

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends URLStreamHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f71396a;

        @Override // java.net.URLStreamHandler
        public URLConnection openConnection(URL url) {
            return C33860pd.this.m74543a(url);
        }

        public a(String str) {
            this.f71396a = str;
        }

        @Override // java.net.URLStreamHandler
        public int getDefaultPort() {
            if (this.f71396a.equals("http")) {
                return 80;
            }
            if (this.f71396a.equals(ProxyConfig.MATCH_HTTPS)) {
                return 443;
            }
            throw new AssertionError();
        }

        @Override // java.net.URLStreamHandler
        public URLConnection openConnection(URL url, Proxy proxy) {
            return C33860pd.this.m74544a(url, proxy);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b extends f {

        /* JADX INFO: renamed from: e */
        public final Buffer f71398e;

        /* JADX INFO: renamed from: f */
        public long f71399f;

        @Override // com.tencent.bugly.proguard.C33860pd.f
        /* JADX INFO: renamed from: a */
        public Request mo74547a(Request request) throws IOException {
            if (request.header("Content-Length") != null) {
                return request;
            }
            this.f71420c.close();
            this.f71399f = this.f71398e.size();
            return request.newBuilder().removeHeader(HttpHeaders.TRANSFER_ENCODING).header("Content-Length", Long.toString(this.f71398e.size())).build();
        }

        @Override // com.tencent.bugly.proguard.C33860pd.f, okhttp3.RequestBody
        public long contentLength() {
            return this.f71399f;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) {
            this.f71398e.copyTo(bufferedSink.getBufferField(), 0L, this.f71398e.size());
        }

        public b(long j11) {
            Buffer buffer = new Buffer();
            this.f71398e = buffer;
            this.f71399f = -1L;
            m74559a(buffer, j11);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$c */
    /* JADX INFO: compiled from: BUGLY */
    public static abstract class c extends HttpsURLConnection {

        /* JADX INFO: renamed from: a */
        public final HttpURLConnection f71400a;

        /* JADX INFO: renamed from: a */
        public abstract Handshake mo74548a();

        @Override // java.net.URLConnection
        public void connect() throws IOException {
            ((HttpsURLConnection) this).connected = true;
            this.f71400a.connect();
        }

        @Override // java.net.URLConnection
        public Object getContent() throws IOException {
            return this.f71400a.getContent();
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public String getHeaderField(int i11) {
            return this.f71400a.getHeaderField(i11);
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public abstract HostnameVerifier getHostnameVerifier();

        @Override // javax.net.ssl.HttpsURLConnection
        public abstract SSLSocketFactory getSSLSocketFactory();

        @Override // java.net.HttpURLConnection
        public void setFixedLengthStreamingMode(long j11) {
            this.f71400a.setFixedLengthStreamingMode(j11);
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public abstract void setHostnameVerifier(HostnameVerifier hostnameVerifier);

        @Override // javax.net.ssl.HttpsURLConnection
        public abstract void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory);

        @Override // java.net.URLConnection
        public void addRequestProperty(String str, String str2) {
            this.f71400a.addRequestProperty(str, str2);
        }

        @Override // java.net.HttpURLConnection
        public void disconnect() {
            this.f71400a.disconnect();
        }

        @Override // java.net.URLConnection
        public boolean getAllowUserInteraction() {
            return this.f71400a.getAllowUserInteraction();
        }

        @Override // java.net.URLConnection
        public int getConnectTimeout() {
            return this.f71400a.getConnectTimeout();
        }

        @Override // java.net.URLConnection
        public Object getContent(Class[] clsArr) throws IOException {
            return this.f71400a.getContent(clsArr);
        }

        @Override // java.net.URLConnection
        public String getContentEncoding() {
            return this.f71400a.getContentEncoding();
        }

        @Override // java.net.URLConnection
        public int getContentLength() {
            return this.f71400a.getContentLength();
        }

        @Override // java.net.URLConnection
        public long getContentLengthLong() {
            return this.f71400a.getContentLengthLong();
        }

        @Override // java.net.URLConnection
        public String getContentType() {
            return this.f71400a.getContentType();
        }

        @Override // java.net.URLConnection
        public long getDate() {
            return this.f71400a.getDate();
        }

        @Override // java.net.URLConnection
        public boolean getDefaultUseCaches() {
            return this.f71400a.getDefaultUseCaches();
        }

        @Override // java.net.URLConnection
        public boolean getDoInput() {
            return this.f71400a.getDoInput();
        }

        @Override // java.net.URLConnection
        public boolean getDoOutput() {
            return this.f71400a.getDoOutput();
        }

        @Override // java.net.HttpURLConnection
        public InputStream getErrorStream() {
            return this.f71400a.getErrorStream();
        }

        @Override // java.net.URLConnection
        public long getExpiration() {
            return this.f71400a.getExpiration();
        }

        @Override // java.net.URLConnection
        public String getHeaderField(String str) {
            return this.f71400a.getHeaderField(str);
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public long getHeaderFieldDate(String str, long j11) {
            return this.f71400a.getHeaderFieldDate(str, j11);
        }

        @Override // java.net.URLConnection
        public int getHeaderFieldInt(String str, int i11) {
            return this.f71400a.getHeaderFieldInt(str, i11);
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public String getHeaderFieldKey(int i11) {
            return this.f71400a.getHeaderFieldKey(i11);
        }

        @Override // java.net.URLConnection
        public long getHeaderFieldLong(String str, long j11) {
            return this.f71400a.getHeaderFieldLong(str, j11);
        }

        @Override // java.net.URLConnection
        public Map<String, List<String>> getHeaderFields() {
            return this.f71400a.getHeaderFields();
        }

        @Override // java.net.URLConnection
        public long getIfModifiedSince() {
            return this.f71400a.getIfModifiedSince();
        }

        @Override // java.net.URLConnection
        public InputStream getInputStream() throws IOException {
            return this.f71400a.getInputStream();
        }

        @Override // java.net.HttpURLConnection
        public boolean getInstanceFollowRedirects() {
            return this.f71400a.getInstanceFollowRedirects();
        }

        @Override // java.net.URLConnection
        public long getLastModified() {
            return this.f71400a.getLastModified();
        }

        @Override // java.net.URLConnection
        public OutputStream getOutputStream() throws IOException {
            return this.f71400a.getOutputStream();
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public Permission getPermission() throws IOException {
            return this.f71400a.getPermission();
        }

        @Override // java.net.URLConnection
        public int getReadTimeout() {
            return this.f71400a.getReadTimeout();
        }

        @Override // java.net.HttpURLConnection
        public String getRequestMethod() {
            return this.f71400a.getRequestMethod();
        }

        @Override // java.net.URLConnection
        public Map<String, List<String>> getRequestProperties() {
            return this.f71400a.getRequestProperties();
        }

        @Override // java.net.URLConnection
        public String getRequestProperty(String str) {
            return this.f71400a.getRequestProperty(str);
        }

        @Override // java.net.HttpURLConnection
        public int getResponseCode() throws IOException {
            return this.f71400a.getResponseCode();
        }

        @Override // java.net.HttpURLConnection
        public String getResponseMessage() throws IOException {
            return this.f71400a.getResponseMessage();
        }

        @Override // java.net.URLConnection
        public URL getURL() {
            return this.f71400a.getURL();
        }

        @Override // java.net.URLConnection
        public boolean getUseCaches() {
            return this.f71400a.getUseCaches();
        }

        @Override // java.net.URLConnection
        public void setAllowUserInteraction(boolean z11) {
            this.f71400a.setAllowUserInteraction(z11);
        }

        @Override // java.net.HttpURLConnection
        public void setChunkedStreamingMode(int i11) {
            this.f71400a.setChunkedStreamingMode(i11);
        }

        @Override // java.net.URLConnection
        public void setConnectTimeout(int i11) {
            this.f71400a.setConnectTimeout(i11);
        }

        @Override // java.net.URLConnection
        public void setDefaultUseCaches(boolean z11) {
            this.f71400a.setDefaultUseCaches(z11);
        }

        @Override // java.net.URLConnection
        public void setDoInput(boolean z11) {
            this.f71400a.setDoInput(z11);
        }

        @Override // java.net.URLConnection
        public void setDoOutput(boolean z11) {
            this.f71400a.setDoOutput(z11);
        }

        @Override // java.net.HttpURLConnection
        public void setFixedLengthStreamingMode(int i11) {
            this.f71400a.setFixedLengthStreamingMode(i11);
        }

        @Override // java.net.URLConnection
        public void setIfModifiedSince(long j11) {
            this.f71400a.setIfModifiedSince(j11);
        }

        @Override // java.net.HttpURLConnection
        public void setInstanceFollowRedirects(boolean z11) {
            this.f71400a.setInstanceFollowRedirects(z11);
        }

        @Override // java.net.URLConnection
        public void setReadTimeout(int i11) {
            this.f71400a.setReadTimeout(i11);
        }

        @Override // java.net.HttpURLConnection
        public void setRequestMethod(String str) throws ProtocolException {
            this.f71400a.setRequestMethod(str);
        }

        @Override // java.net.URLConnection
        public void setRequestProperty(String str, String str2) {
            this.f71400a.setRequestProperty(str, str2);
        }

        @Override // java.net.URLConnection
        public void setUseCaches(boolean z11) {
            this.f71400a.setUseCaches(z11);
        }

        @Override // java.net.URLConnection
        public String toString() {
            return this.f71400a.toString();
        }

        @Override // java.net.HttpURLConnection
        public boolean usingProxy() {
            return this.f71400a.usingProxy();
        }

        public c(HttpURLConnection httpURLConnection) {
            super(httpURLConnection.getURL());
            this.f71400a = httpURLConnection;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public String getCipherSuite() {
            Handshake handshakeMo74548a = mo74548a();
            if (handshakeMo74548a != null) {
                return handshakeMo74548a.cipherSuite().javaName();
            }
            return null;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Certificate[] getLocalCertificates() {
            Handshake handshakeMo74548a = mo74548a();
            if (handshakeMo74548a == null) {
                return null;
            }
            List<Certificate> listLocalCertificates = handshakeMo74548a.localCertificates();
            if (listLocalCertificates.isEmpty()) {
                return null;
            }
            return (Certificate[]) listLocalCertificates.toArray(new Certificate[listLocalCertificates.size()]);
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Principal getLocalPrincipal() {
            Handshake handshakeMo74548a = mo74548a();
            if (handshakeMo74548a != null) {
                return handshakeMo74548a.localPrincipal();
            }
            return null;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Principal getPeerPrincipal() {
            Handshake handshakeMo74548a = mo74548a();
            if (handshakeMo74548a != null) {
                return handshakeMo74548a.peerPrincipal();
            }
            return null;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Certificate[] getServerCertificates() {
            Handshake handshakeMo74548a = mo74548a();
            if (handshakeMo74548a == null) {
                return null;
            }
            List<Certificate> listPeerCertificates = handshakeMo74548a.peerCertificates();
            if (listPeerCertificates.isEmpty()) {
                return null;
            }
            return (Certificate[]) listPeerCertificates.toArray(new Certificate[listPeerCertificates.size()]);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$d */
    /* JADX INFO: compiled from: BUGLY */
    public static final class d extends HttpURLConnection implements Callback {

        /* JADX INFO: renamed from: a */
        public OkHttpClient f71401a;

        /* JADX INFO: renamed from: b */
        public final a f71402b;

        /* JADX INFO: renamed from: c */
        public Headers.Builder f71403c;

        /* JADX INFO: renamed from: d */
        public Headers f71404d;

        /* JADX INFO: renamed from: e */
        public boolean f71405e;

        /* JADX INFO: renamed from: f */
        public Call f71406f;

        /* JADX INFO: renamed from: g */
        public long f71407g;

        /* JADX INFO: renamed from: h */
        public final Object f71408h;

        /* JADX INFO: renamed from: i */
        public Response f71409i;

        /* JADX INFO: renamed from: j */
        public Throwable f71410j;

        /* JADX INFO: renamed from: k */
        public Response f71411k;

        /* JADX INFO: renamed from: l */
        public boolean f71412l;

        /* JADX INFO: renamed from: m */
        public Proxy f71413m;

        /* JADX INFO: renamed from: n */
        public Handshake f71414n;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$d$a */
        /* JADX INFO: compiled from: BUGLY */
        public final class a implements Interceptor {

            /* JADX INFO: renamed from: a */
            public boolean f71415a;

            public a() {
            }

            /* JADX INFO: renamed from: a */
            public void m74558a() {
                synchronized (d.this.f71408h) {
                    this.f71415a = true;
                    d.this.f71408h.notifyAll();
                }
            }

            @Override // okhttp3.Interceptor
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request();
                synchronized (d.this.f71408h) {
                    d dVar = d.this;
                    dVar.f71412l = false;
                    dVar.f71413m = chain.connection().getRoute().proxy();
                    d.this.f71414n = chain.connection().getHandshake();
                    d.this.f71408h.notifyAll();
                    while (!this.f71415a) {
                        try {
                            d.this.f71408h.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                }
                if (request.body() instanceof f) {
                    request = ((f) request.body()).mo74547a(request);
                }
                Response responseProceed = chain.proceed(request);
                synchronized (d.this.f71408h) {
                    d dVar2 = d.this;
                    dVar2.f71411k = responseProceed;
                    ((HttpURLConnection) dVar2).url = responseProceed.request().url().url();
                }
                return responseProceed;
            }
        }

        /* JADX INFO: renamed from: b */
        public final f m74553b() {
            if (!C33860pd.m74534a(((HttpURLConnection) this).method)) {
                return null;
            }
            if (this.f71403c.get("Content-Type") == null) {
                this.f71403c.add("Content-Type", "application/x-www-form-urlencoded");
            }
            long j11 = -1;
            boolean z11 = this.f71407g != -1 || ((HttpURLConnection) this).chunkLength > 0;
            String str = this.f71403c.get("Content-Length");
            long j12 = this.f71407g;
            if (j12 != -1) {
                j11 = j12;
            } else if (str != null) {
                j11 = Long.parseLong(str);
            }
            f gVar = z11 ? new g(j11) : new b(j11);
            gVar.f71418a.timeout(this.f71401a.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
            return gVar;
        }

        @Override // java.net.HttpURLConnection
        public InputStream getErrorStream() {
            try {
                Response responseM74554b = m74554b(true);
                if (C33860pd.m74535a(responseM74554b) && responseM74554b.code() >= 400) {
                    return responseM74554b.body().byteStream();
                }
            } catch (IOException unused) {
            }
            return null;
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public String getHeaderField(int i11) {
            try {
                Headers headersM74557e = m74557e();
                if (i11 >= 0 && i11 < headersM74557e.size()) {
                    return headersM74557e.value(i11);
                }
            } catch (IOException unused) {
            }
            return null;
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public String getHeaderFieldKey(int i11) {
            try {
                Headers headersM74557e = m74557e();
                if (i11 >= 0 && i11 < headersM74557e.size()) {
                    return headersM74557e.name(i11);
                }
            } catch (IOException unused) {
            }
            return null;
        }

        @Override // java.net.HttpURLConnection
        public int getResponseCode() throws IOException {
            return m74554b(true).code();
        }

        @Override // java.net.HttpURLConnection
        public String getResponseMessage() throws IOException {
            return m74554b(true).message();
        }

        @Override // java.net.HttpURLConnection
        public void setFixedLengthStreamingMode(int i11) {
            setFixedLengthStreamingMode(i11);
        }

        @Override // java.net.URLConnection
        public void addRequestProperty(String str, String str2) {
            if (((HttpURLConnection) this).connected) {
                throw new IllegalStateException("Cannot add request property after connection is made");
            }
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                return;
            }
            this.f71403c.add(str, str2);
        }

        @Override // java.net.URLConnection
        public void connect() throws IOException {
            if (this.f71405e) {
                return;
            }
            Call callM74551a = m74551a();
            this.f71405e = true;
            FirebasePerfOkHttpClient.enqueue(callM74551a, this);
            synchronized (this.f71408h) {
                while (this.f71412l && this.f71409i == null && this.f71410j == null) {
                    try {
                        try {
                            this.f71408h.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Throwable th3 = this.f71410j;
                if (th3 != null) {
                    throw C33860pd.m74530a(th3);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final Response m74556d() throws IOException {
            synchronized (this.f71408h) {
                try {
                    Throwable th2 = this.f71410j;
                    if (th2 != null) {
                        throw C33860pd.m74530a(th2);
                    }
                    Response response = this.f71409i;
                    if (response != null) {
                        return response;
                    }
                    throw new AssertionError("Response should have been set by this point.");
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // java.net.HttpURLConnection
        public void disconnect() {
            if (this.f71406f == null) {
                return;
            }
            this.f71402b.m74558a();
            this.f71406f.cancel();
        }

        /* JADX INFO: renamed from: e */
        public Headers m74557e() throws IOException {
            if (this.f71404d == null) {
                Response responseM74554b = m74554b(true);
                this.f71404d = responseM74554b.headers().newBuilder().add(C33860pd.f71388d, responseM74554b.protocol().getProtocol()).add(C33860pd.f71389e, C33860pd.m74538b(responseM74554b)).build();
            }
            return this.f71404d;
        }

        @Override // java.net.URLConnection
        public int getConnectTimeout() {
            return this.f71401a.connectTimeoutMillis();
        }

        @Override // java.net.URLConnection
        public InputStream getInputStream() throws IOException {
            if (!((HttpURLConnection) this).doInput) {
                throw new ProtocolException("This protocol does not support input");
            }
            Response responseM74554b = m74554b(false);
            if (responseM74554b.code() < 400) {
                return responseM74554b.body().byteStream();
            }
            throw new FileNotFoundException(((HttpURLConnection) this).url.toString());
        }

        @Override // java.net.HttpURLConnection
        public boolean getInstanceFollowRedirects() {
            return this.f71401a.followRedirects();
        }

        @Override // java.net.URLConnection
        public int getReadTimeout() {
            return this.f71401a.readTimeoutMillis();
        }

        @Override // java.net.URLConnection
        public Map<String, List<String>> getRequestProperties() {
            if (((HttpURLConnection) this).connected) {
                throw new IllegalStateException("Cannot access request header fields after connection is set");
            }
            return C33860pd.m74533a(this.f71403c.build(), (String) null);
        }

        @Override // java.net.URLConnection
        public String getRequestProperty(String str) {
            if (str == null) {
                return null;
            }
            return this.f71403c.get(str);
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            synchronized (this.f71408h) {
                try {
                    boolean z11 = iOException instanceof h;
                    IOException cause = iOException;
                    if (z11) {
                        cause = iOException.getCause();
                    }
                    this.f71410j = cause;
                    this.f71408h.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            synchronized (this.f71408h) {
                this.f71409i = response;
                this.f71414n = response.handshake();
                ((HttpURLConnection) this).url = response.request().url().url();
                this.f71408h.notifyAll();
            }
        }

        @Override // java.net.URLConnection
        public void setConnectTimeout(int i11) {
            this.f71401a = this.f71401a.newBuilder().connectTimeout(i11, TimeUnit.MILLISECONDS).build();
        }

        @Override // java.net.HttpURLConnection
        public void setFixedLengthStreamingMode(long j11) {
            if (((HttpURLConnection) this).connected) {
                throw new IllegalStateException("Already connected");
            }
            if (((HttpURLConnection) this).chunkLength > 0) {
                throw new IllegalStateException("Already in chunked mode");
            }
            if (j11 < 0) {
                throw new IllegalArgumentException("contentLength < 0");
            }
            this.f71407g = j11;
            ((HttpURLConnection) this).fixedContentLength = (int) Math.min(j11, 2147483647L);
        }

        @Override // java.net.HttpURLConnection
        public void setInstanceFollowRedirects(boolean z11) {
            this.f71401a = this.f71401a.newBuilder().followRedirects(z11).build();
        }

        @Override // java.net.URLConnection
        public void setReadTimeout(int i11) {
            this.f71401a = this.f71401a.newBuilder().readTimeout(i11, TimeUnit.MILLISECONDS).build();
        }

        @Override // java.net.HttpURLConnection
        public void setRequestMethod(String str) throws ProtocolException {
            Set<String> set = C33860pd.f71390f;
            if (set.contains(str)) {
                ((HttpURLConnection) this).method = str;
                return;
            }
            throw new ProtocolException("Expected one of " + set + " but was " + str);
        }

        @Override // java.net.URLConnection
        public void setRequestProperty(String str, String str2) {
            if (((HttpURLConnection) this).connected) {
                throw new IllegalStateException("Cannot set request property after connection is made");
            }
            if (str == null) {
                throw new NullPointerException("field == null");
            }
            if (str2 == null) {
                return;
            }
            this.f71403c.set(str, str2);
        }

        @Override // java.net.HttpURLConnection
        public boolean usingProxy() {
            if (this.f71413m != null) {
                return true;
            }
            Proxy proxy = this.f71401a.proxy();
            return (proxy == null || proxy.type() == Proxy.Type.DIRECT) ? false : true;
        }

        public d(URL url, OkHttpClient okHttpClient) {
            super(url);
            this.f71402b = new a();
            this.f71403c = new Headers.Builder();
            this.f71407g = -1L;
            this.f71408h = new Object();
            this.f71412l = true;
            this.f71401a = okHttpClient;
        }

        /* JADX INFO: renamed from: a */
        public final Call m74551a() throws IOException {
            Call call = this.f71406f;
            if (call != null) {
                return call;
            }
            ((HttpURLConnection) this).connected = true;
            if (((HttpURLConnection) this).doOutput) {
                if (((HttpURLConnection) this).method.equals("GET")) {
                    ((HttpURLConnection) this).method = "POST";
                } else if (!C33860pd.m74534a(((HttpURLConnection) this).method)) {
                    throw new ProtocolException(C34025xh.m75464a(new StringBuilder(), ((HttpURLConnection) this).method, " does not support writing"));
                }
            }
            if (this.f71403c.get("User-Agent") == null) {
                this.f71403c.add("User-Agent", C33860pd.m74539c());
            }
            OkHttpClient.Builder builderNewBuilder = this.f71401a.newBuilder();
            builderNewBuilder.interceptors().clear();
            builderNewBuilder.interceptors().add(C34049z1.f72585a);
            builderNewBuilder.interceptors().add(h.f71427b);
            builderNewBuilder.networkInterceptors().clear();
            builderNewBuilder.networkInterceptors().add(this.f71402b);
            builderNewBuilder.dispatcher(new Dispatcher(this.f71401a.dispatcher().executorService()));
            if (!getUseCaches()) {
                builderNewBuilder.cache(null);
            }
            try {
                Call callNewCall = builderNewBuilder.build().newCall(new Request.Builder().url(HttpUrl.get(getURL().toString())).headers(this.f71403c.build()).method(((HttpURLConnection) this).method, m74553b()).build());
                this.f71406f = callNewCall;
                return callNewCall;
            } catch (IllegalArgumentException e11) {
                MalformedURLException malformedURLException = new MalformedURLException();
                malformedURLException.initCause(e11);
                throw malformedURLException;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m74555c() throws IOException {
            Call callM74551a = m74551a();
            this.f71402b.m74558a();
            f fVar = (f) callM74551a.request().body();
            if (fVar != null) {
                fVar.f71420c.close();
            }
            if (this.f71405e) {
                synchronized (this.f71408h) {
                    while (this.f71409i == null && this.f71410j == null) {
                        try {
                            this.f71408h.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                }
                return;
            }
            this.f71405e = true;
            try {
                onResponse(callM74551a, FirebasePerfOkHttpClient.execute(callM74551a));
            } catch (IOException e11) {
                onFailure(callM74551a, e11);
            }
        }

        @Override // java.net.URLConnection
        public Map<String, List<String>> getHeaderFields() {
            try {
                return C33860pd.m74533a(m74557e(), C33860pd.m74540c(m74554b(true)));
            } catch (IOException unused) {
                return Collections.EMPTY_MAP;
            }
        }

        @Override // java.net.URLConnection
        public OutputStream getOutputStream() throws IOException {
            f fVar = (f) m74551a().request().body();
            if (fVar != null) {
                if (fVar instanceof g) {
                    connect();
                    this.f71402b.m74558a();
                }
                if (!fVar.f71421d) {
                    return fVar.f71420c;
                }
                throw new ProtocolException("cannot write request body after response has been read");
            }
            throw new ProtocolException("method does not support a request body: " + ((HttpURLConnection) this).method);
        }

        @Override // java.net.HttpURLConnection, java.net.URLConnection
        public Permission getPermission() {
            int iDefaultPort;
            URL url = getURL();
            String host = url.getHost();
            if (url.getPort() != -1) {
                iDefaultPort = url.getPort();
            } else {
                iDefaultPort = HttpUrl.defaultPort(url.getProtocol());
            }
            if (usingProxy()) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) this.f71401a.proxy().address();
                host = inetSocketAddress.getHostName();
                iDefaultPort = inetSocketAddress.getPort();
            }
            return new SocketPermission(host + C33844oi.f71346o + iDefaultPort, "connect, resolve");
        }

        @Override // java.net.URLConnection
        public void setIfModifiedSince(long j11) {
            super.setIfModifiedSince(j11);
            if (((HttpURLConnection) this).ifModifiedSince != 0) {
                this.f71403c.set(HttpHeaders.IF_MODIFIED_SINCE, C33860pd.m74532a(new Date(((HttpURLConnection) this).ifModifiedSince)));
            } else {
                this.f71403c.removeAll(HttpHeaders.IF_MODIFIED_SINCE);
            }
        }

        @Override // java.net.URLConnection
        public String getHeaderField(String str) {
            try {
                if (str == null) {
                    return C33860pd.m74540c(m74554b(true));
                }
                return m74557e().get(str);
            } catch (IOException unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public final Response m74554b(boolean z11) throws IOException {
            Response responseM74552a = m74552a(z11);
            if (responseM74552a != null) {
                return responseM74552a;
            }
            m74555c();
            return m74556d();
        }

        /* JADX INFO: renamed from: a */
        public final Response m74552a(boolean z11) throws IOException {
            Response response;
            synchronized (this.f71408h) {
                try {
                    Response response2 = this.f71409i;
                    if (response2 != null) {
                        return response2;
                    }
                    Throwable th2 = this.f71410j;
                    if (th2 == null) {
                        return null;
                    }
                    if (!z11 || (response = this.f71411k) == null) {
                        throw C33860pd.m74530a(th2);
                    }
                    return response;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e extends c {

        /* JADX INFO: renamed from: b */
        public final d f71417b;

        public e(URL url, OkHttpClient okHttpClient) {
            this(new d(url, okHttpClient));
        }

        public e(d dVar) {
            super(dVar);
            this.f71417b = dVar;
        }

        @Override // com.tencent.bugly.proguard.C33860pd.c
        /* JADX INFO: renamed from: a */
        public Handshake mo74548a() {
            d dVar = this.f71417b;
            if (dVar.f71406f != null) {
                return dVar.f71414n;
            }
            throw new IllegalStateException("Connection has not yet been established");
        }

        @Override // com.tencent.bugly.proguard.C33860pd.c, javax.net.ssl.HttpsURLConnection
        public HostnameVerifier getHostnameVerifier() {
            return this.f71417b.f71401a.hostnameVerifier();
        }

        @Override // com.tencent.bugly.proguard.C33860pd.c, javax.net.ssl.HttpsURLConnection
        public SSLSocketFactory getSSLSocketFactory() {
            return this.f71417b.f71401a.sslSocketFactory();
        }

        @Override // com.tencent.bugly.proguard.C33860pd.c, javax.net.ssl.HttpsURLConnection
        public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            d dVar = this.f71417b;
            dVar.f71401a = dVar.f71401a.newBuilder().hostnameVerifier(hostnameVerifier).build();
        }

        @Override // com.tencent.bugly.proguard.C33860pd.c, javax.net.ssl.HttpsURLConnection
        public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory == null) {
                throw new IllegalArgumentException("sslSocketFactory == null");
            }
            try {
                X509TrustManager x509TrustManagerM73820a = C33759kh.m73820a();
                if (x509TrustManagerM73820a == null) {
                    Logger.INSTANCE.mo77130d(C33860pd.f71387c, "set SSLSocketFactory fail, so use default.");
                } else {
                    d dVar = this.f71417b;
                    dVar.f71401a = dVar.f71401a.newBuilder().sslSocketFactory(sSLSocketFactory, x509TrustManagerM73820a).build();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$f */
    /* JADX INFO: compiled from: BUGLY */
    public static abstract class f extends RequestBody {

        /* JADX INFO: renamed from: a */
        public Timeout f71418a;

        /* JADX INFO: renamed from: b */
        public long f71419b;

        /* JADX INFO: renamed from: c */
        public OutputStream f71420c;

        /* JADX INFO: renamed from: d */
        public boolean f71421d;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$f$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a extends OutputStream {

            /* JADX INFO: renamed from: b */
            public long f71422b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f71423c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ BufferedSink f71424d;

            @Override // java.io.OutputStream
            public void write(int i11) throws IOException {
                write(new byte[]{(byte) i11}, 0, 1);
            }

            public a(long j11, BufferedSink bufferedSink) {
                this.f71423c = j11;
                this.f71424d = bufferedSink;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                f.this.f71421d = true;
                long j11 = this.f71423c;
                if (j11 == -1 || this.f71422b >= j11) {
                    this.f71424d.close();
                    return;
                }
                throw new ProtocolException("expected " + this.f71423c + " bytes but received " + this.f71422b);
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                if (f.this.f71421d) {
                    return;
                }
                this.f71424d.flush();
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i11, int i12) throws IOException {
                if (f.this.f71421d) {
                    throw new IOException("closed");
                }
                long j11 = this.f71423c;
                if (j11 == -1 || this.f71422b + ((long) i12) <= j11) {
                    this.f71422b += (long) i12;
                    try {
                        this.f71424d.write(bArr, i11, i12);
                        return;
                    } catch (InterruptedIOException e11) {
                        throw new SocketTimeoutException(e11.getMessage());
                    }
                }
                throw new ProtocolException("expected " + this.f71423c + " bytes but received " + this.f71422b + i12);
            }
        }

        /* JADX INFO: renamed from: a */
        public Request mo74547a(Request request) throws IOException {
            return request;
        }

        @Override // okhttp3.RequestBody
        @Nullable
        /* JADX INFO: renamed from: contentType */
        public final MediaType getF27464i() {
            return null;
        }

        /* JADX INFO: renamed from: a */
        public void m74559a(BufferedSink bufferedSink, long j11) {
            this.f71418a = bufferedSink.getTimeout();
            this.f71419b = j11;
            this.f71420c = new a(j11, bufferedSink);
        }

        @Override // okhttp3.RequestBody
        public long contentLength() {
            return this.f71419b;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$g */
    /* JADX INFO: compiled from: BUGLY */
    public static final class g extends f {

        /* JADX INFO: renamed from: e */
        public final Pipe f71426e;

        /* JADX INFO: renamed from: a */
        public boolean m74560a() {
            return true;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            Buffer buffer = new Buffer();
            while (this.f71426e.source().read(buffer, 8192L) != -1) {
                bufferedSink.write(buffer, buffer.size());
            }
        }

        public g(long j11) {
            Pipe pipe = new Pipe(8192L);
            this.f71426e = pipe;
            m74559a(Okio.buffer(pipe.sink()), j11);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m74536b(String str, String str2) {
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
    }

    /* JADX INFO: renamed from: c */
    public static String m74540c(Response response) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(response.protocol() == Protocol.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(response.code());
        sb2.append(' ');
        sb2.append(response.message());
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public OkHttpClient m74545a() {
        return this.f71395b;
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pd$h */
    /* JADX INFO: compiled from: BUGLY */
    public static final class h extends IOException {

        /* JADX INFO: renamed from: b */
        public static final Interceptor f71427b = new Interceptor() { // from class: com.tencent.bugly.proguard.nj
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return C33860pd.h.m74561a(chain);
            }
        };

        public h(Throwable th2) {
            super(th2);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ Response m74561a(Interceptor.Chain chain) throws IOException {
            try {
                return chain.proceed(chain.request());
            } catch (Error | RuntimeException e11) {
                h hVar = new h(e11);
                BuglyListenerFactory.getInstance().onCallEnd(chain.call(), true, hVar);
                throw hVar;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ DateFormat m74541d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(f71391g);
        return simpleDateFormat;
    }

    /* JADX INFO: renamed from: a */
    public C33860pd m74542a(OkHttpClient okHttpClient) {
        this.f71395b = okHttpClient;
        return this;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C33860pd clone() {
        return new C33860pd(this.f71395b);
    }

    @Override // java.net.URLStreamHandlerFactory
    public URLStreamHandler createURLStreamHandler(String str) {
        if (str.equals("http") || str.equals(ProxyConfig.MATCH_HTTPS)) {
            return new a(str);
        }
        return null;
    }

    public C33860pd(OkHttpClient okHttpClient) {
        this.f71395b = okHttpClient;
    }

    /* JADX INFO: renamed from: b */
    public static String m74538b(Response response) {
        if (response.networkResponse() == null) {
            if (response.cacheResponse() == null) {
                return "NONE";
            }
            return "CACHE " + response.code();
        }
        if (response.cacheResponse() == null) {
            return "NETWORK " + response.code();
        }
        return "CONDITIONAL_CACHE " + response.networkResponse().code();
    }

    /* JADX INFO: renamed from: a */
    public HttpURLConnection m74543a(URL url) {
        return m74544a(url, this.f71395b.proxy());
    }

    /* JADX INFO: renamed from: c */
    public static String m74539c() {
        String strM74531a = m74531a("http.agent", (String) null);
        return strM74531a != null ? m74537b(strM74531a) : "ObsoleteUrlFactory";
    }

    /* JADX INFO: renamed from: a */
    public HttpURLConnection m74544a(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient okHttpClientBuild = this.f71395b.newBuilder().proxy(proxy).build();
        if (protocol.equals("http")) {
            return new d(url, okHttpClientBuild);
        }
        if (protocol.equals(ProxyConfig.MATCH_HTTPS)) {
            return new e(url, okHttpClientBuild);
        }
        throw new IllegalArgumentException("Unexpected protocol: ".concat(protocol));
    }

    /* JADX INFO: renamed from: b */
    public static String m74537b(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt > 31 && iCodePointAt < 127) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                buffer.writeUtf8CodePoint(63);
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                while (iCharCount2 < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount2);
                    buffer.writeUtf8CodePoint((iCodePointAt2 <= 31 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                    iCharCount2 += Character.charCount(iCodePointAt2);
                }
                return buffer.readUtf8();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static String m74532a(Date date) {
        return f71393i.get().format(date);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74534a(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74535a(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && m74529a(response.headers()) == -1 && !"chunked".equalsIgnoreCase(response.header(HttpHeaders.TRANSFER_ENCODING))) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static long m74529a(Headers headers) {
        String str = headers.get("Content-Length");
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, List<String>> m74533a(Headers headers, @Nullable String str) {
        TreeMap treeMap = new TreeMap(f71394j);
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strName = headers.name(i11);
            String strValue = headers.value(i11);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(strName);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(strValue);
            treeMap.put(strName, Collections.unmodifiableList(arrayList));
        }
        if (str != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str)));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    /* JADX INFO: renamed from: a */
    public static String m74531a(String str, @Nullable String str2) {
        try {
            String property = System.getProperty(str);
            return property != null ? property : str2;
        } catch (AccessControlException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static IOException m74530a(Throwable th2) throws IOException {
        if (!(th2 instanceof IOException)) {
            if (!(th2 instanceof Error)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw new AssertionError();
            }
            throw ((Error) th2);
        }
        throw ((IOException) th2);
    }
}
