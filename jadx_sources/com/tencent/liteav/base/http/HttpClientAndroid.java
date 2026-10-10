package com.tencent.liteav.base.http;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import cn.jiguang.privates.common.constants.JCommonConstants;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.HttpDnsUtil;
import com.tencent.liteav.base.util.LiteavLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class HttpClientAndroid {
    private static final int ERROR_CODE_INVALID_REQUEST = 0;
    private static final String HTTPS_PREFIX = "https://";
    private static final String HTTP_PREFIX = "http://";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final int READ_STREAM_SIZE = 8192;
    private static final int REDIRECT_REQUEST_MAX = 3;
    private static final String TAG = "HttpClientAndroid";
    private static final Object mLock = new Object();
    private HttpURLConnection mConnection;
    private C34696b mHttpConfig;
    private final Handler mHttpHandler;
    private String mLastRequestURL;
    private long mNativeHttpClientAndroidJni;
    private final ConcurrentHashMap<Long, C34699e> mRunningRequestMap = new ConcurrentHashMap<>();
    private final Object mLocker = new Object();
    private volatile EnumC34697c mInternalState = EnumC34697c.NONE;
    private long mTotalReadBytes = 0;
    private long mStartReadTime = 0;
    byte[] mReadDataBytes = new byte[8192];
    private boolean mPausedRepeatDownloading = false;
    private EnumC34698d mReallyNetworkChannel = EnumC34698d.DEFAULT;
    private ConnectivityManager.NetworkCallback mNetworkCallback = null;
    private EnumC34702h mRepeatDownloadingStatusCode = EnumC34702h.kUnknownError;
    private ByteBuffer mRepeatByteBuffer = null;

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$a */
    public static class C34695a extends Authenticator {

        /* JADX INFO: renamed from: a */
        String f73404a;

        /* JADX INFO: renamed from: b */
        String f73405b;

        @Override // java.net.Authenticator
        public final PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(this.f73404a, this.f73405b.toCharArray());
        }

        public C34695a(String str, String str2) {
            this.f73404a = str;
            this.f73405b = str2;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$c */
    public enum EnumC34697c {
        NONE,
        RUNNING_REPEAT,
        RUNNING_ONCE
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$e */
    public static class C34699e {

        /* JADX INFO: renamed from: a */
        long f73424a;

        /* JADX INFO: renamed from: b */
        String f73425b;

        /* JADX INFO: renamed from: c */
        String f73426c;

        /* JADX INFO: renamed from: d */
        byte[] f73427d;

        /* JADX INFO: renamed from: e */
        Map<String, String> f73428e;

        /* JADX INFO: renamed from: f */
        int f73429f;

        /* JADX INFO: renamed from: g */
        String f73430g;

        /* JADX INFO: renamed from: h */
        boolean f73431h;

        /* JADX INFO: renamed from: i */
        String f73432i;

        /* JADX INFO: renamed from: j */
        byte[] f73433j;

        /* JADX INFO: renamed from: k */
        byte[] f73434k;

        public C34699e(String str, String str2, byte[] bArr, Map<String, String> map, boolean z11) {
            this(str, str2, bArr, map, z11, "", null, null);
        }

        public C34699e(String str, String str2, byte[] bArr, Map<String, String> map, boolean z11, String str3, byte[] bArr2, byte[] bArr3) {
            this.f73425b = str;
            this.f73426c = str2;
            this.f73427d = bArr;
            this.f73428e = map;
            this.f73429f = 0;
            this.f73430g = "";
            this.f73431h = z11;
            this.f73432i = str3;
            this.f73433j = bArr2;
            this.f73434k = bArr3;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m76044a() {
            if (TextUtils.isEmpty(this.f73425b)) {
                return false;
            }
            return this.f73425b.startsWith(HttpClientAndroid.HTTP_PREFIX) || this.f73425b.startsWith(HttpClientAndroid.HTTPS_PREFIX);
        }

        /* JADX INFO: renamed from: b */
        public final boolean m76045b() {
            byte[] bArr = this.f73427d;
            return bArr != null && bArr.length > 0;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m76046c() {
            return "POST".equals(m76047d()) || "PUT".equals(m76047d());
        }

        /* JADX INFO: renamed from: d */
        public final String m76047d() {
            if (TextUtils.isEmpty(this.f73426c)) {
                return "";
            }
            if ("POST".equalsIgnoreCase(this.f73426c)) {
                return "POST";
            }
            if ("GET".equalsIgnoreCase(this.f73426c)) {
                return "GET";
            }
            return "PUT".equalsIgnoreCase(this.f73426c) ? "PUT" : "";
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Request{requestId=");
            sb2.append(this.f73424a);
            sb2.append(", url='");
            sb2.append(this.f73425b);
            sb2.append('\'');
            sb2.append(", method='");
            sb2.append(this.f73426c);
            sb2.append('\'');
            sb2.append(", body.size=");
            sb2.append(m76045b() ? this.f73427d.length : 0);
            sb2.append(", headers=");
            sb2.append(this.f73428e);
            sb2.append(", autoRedirect=");
            sb2.append(this.f73431h);
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$f */
    public static class C34700f {

        /* JADX INFO: renamed from: c */
        ByteBuffer f73437c;

        /* JADX INFO: renamed from: a */
        EnumC34702h f73435a = EnumC34702h.kUnknownError;

        /* JADX INFO: renamed from: b */
        String f73436b = "";

        /* JADX INFO: renamed from: d */
        int f73438d = 0;

        /* JADX INFO: renamed from: e */
        String f73439e = "";

        /* JADX INFO: renamed from: f */
        Map<String, String> f73440f = null;

        /* JADX INFO: renamed from: g */
        int f73441g = 0;

        /* JADX INFO: renamed from: h */
        int f73442h = 0;

        /* JADX INFO: renamed from: i */
        String f73443i = "";
    }

    private HttpURLConnection createConnection(C34699e c34699e) throws Exception {
        Proxy proxy;
        HttpURLConnection httpURLConnectionCreateConnection;
        String strReplace = c34699e.f73425b.replace(C33627eb.f69716f, "%20");
        URL url = new URL(strReplace);
        if (TextUtils.isEmpty(this.mHttpConfig.f73412g) || this.mHttpConfig.f73411f <= 0) {
            proxy = ("127.0.0.1".equals(url.getHost()) || AndroidInfoHelpers.DEVICE_LOCALHOST.equals(url.getHost())) ? Proxy.NO_PROXY : null;
        } else {
            Proxy.Type type = Proxy.Type.SOCKS;
            C34696b c34696b = this.mHttpConfig;
            proxy = new Proxy(type, new InetSocketAddress(c34696b.f73412g, c34696b.f73411f));
            C34696b c34696b2 = this.mHttpConfig;
            Authenticator.setDefault(new C34695a(c34696b2.f73413h, c34696b2.f73414i));
        }
        if (proxy != null) {
            httpURLConnectionCreateConnection = createConnection(url, proxy);
        } else if (HttpDnsUtil.verifyCustomHttpDNS(url.getHost())) {
            try {
                String strConvertHttpDNSURL = HttpDnsUtil.convertHttpDNSURL(strReplace, url.getHost());
                if (TextUtils.isEmpty(strConvertHttpDNSURL)) {
                    httpURLConnectionCreateConnection = createConnection(new URL(strReplace), null);
                } else {
                    httpURLConnectionCreateConnection = createConnection(new URL(strConvertHttpDNSURL), null);
                    httpURLConnectionCreateConnection.setRequestProperty("Host", url.getHost());
                    HttpDnsUtil.applySniForHttpsConnection(httpURLConnectionCreateConnection, url.getHost());
                }
            } catch (Exception e11) {
                LiteavLog.m76093w(TAG, "(" + hashCode() + ")createConnectionUseCustomHttpDNS failed. error: " + Log.getStackTraceString(e11));
                httpURLConnectionCreateConnection = createConnection(url, null);
            }
        } else {
            httpURLConnectionCreateConnection = createConnection(url, null);
        }
        httpURLConnectionCreateConnection.setInstanceFollowRedirects(false);
        httpURLConnectionCreateConnection.setConnectTimeout(this.mHttpConfig.f73406a);
        httpURLConnectionCreateConnection.setReadTimeout(this.mHttpConfig.f73407b);
        httpURLConnectionCreateConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        httpURLConnectionCreateConnection.setRequestMethod(c34699e.m76047d());
        if (c34699e.m76046c()) {
            httpURLConnectionCreateConnection.setDoOutput(true);
        }
        if (this.mHttpConfig.f73409d) {
            httpURLConnectionCreateConnection.setRequestProperty("Connection", HttpHeaders.KEEP_ALIVE);
        } else {
            httpURLConnectionCreateConnection.setRequestProperty("Connection", "close");
        }
        Map<String, String> map = c34699e.f73428e;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : c34699e.f73428e.entrySet()) {
                httpURLConnectionCreateConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        return httpURLConnectionCreateConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRequest(C34699e c34699e) {
        EnumC34702h enumC34702h;
        C34700f c34700fInternalRequest = null;
        for (int i11 = 0; i11 < 4; i11++) {
            c34700fInternalRequest = internalRequest(c34699e);
            if (c34700fInternalRequest == null) {
                return;
            }
            if (!c34699e.f73431h || ((enumC34702h = c34700fInternalRequest.f73435a) != EnumC34702h.kHTTP301MovedPermanently && enumC34702h != EnumC34702h.kHTTP302Found)) {
                break;
            }
            String headerField = this.mConnection.getHeaderField("Location");
            c34699e.f73425b = headerField;
            c34699e.f73429f++;
            c34699e.f73430g = headerField;
        }
        this.mTotalReadBytes = 0L;
        this.mStartReadTime = SystemClock.elapsedRealtime();
        doReadData(c34699e.f73424a, c34700fInternalRequest);
    }

    public static String[] getMapValue(Map<String, String> map, String[] strArr) {
        if (map == null || map.isEmpty() || strArr == null || strArr.length == 0) {
            return new String[0];
        }
        String[] strArr2 = new String[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i11] = map.get(strArr[i11]);
        }
        return strArr2;
    }

    private EnumC34702h getStatusCode(int i11) {
        EnumC34702h enumC34702h = EnumC34702h.kUnknownError;
        if (i11 == 200) {
            return EnumC34702h.kHTTP200OK;
        }
        if (i11 == 204) {
            return EnumC34702h.kHTTP204NoContent;
        }
        if (i11 == 206) {
            return EnumC34702h.kHTTP206PartialContent;
        }
        if (i11 == 301) {
            return EnumC34702h.kHTTP301MovedPermanently;
        }
        if (i11 == 302) {
            return EnumC34702h.kHTTP302Found;
        }
        if (i11 == 303) {
            return EnumC34702h.kHTTP303SeeOther;
        }
        if (i11 == 304) {
            return EnumC34702h.kHTTP304NotModified;
        }
        if (i11 == 307) {
            return EnumC34702h.kHTTP307TemporaryRedirect;
        }
        if (i11 == 308) {
            return EnumC34702h.kHTTP308PermanentRedirect;
        }
        if (i11 == 403) {
            return EnumC34702h.kHTTP403Forbidden;
        }
        if (i11 == 404) {
            return EnumC34702h.kHTTP404NotFound;
        }
        if (i11 == 405) {
            return EnumC34702h.kHTTP405MethodNotAllowed;
        }
        if (i11 == 503) {
            return EnumC34702h.kHTTP503ServiceUnavailable;
        }
        Log.m76036w(TAG, "(" + hashCode() + ")Failed to convert status code：" + i11, new Object[0]);
        return enumC34702h;
    }

    private static native boolean nativeOnCallback(long j11, boolean z11, int i11, long j12, int i12, String str, int i13, ByteBuffer byteBuffer, String str2, Map map, int i14, int i15, String str3, int i16);

    private static native void nativeOnUploadProgress(long j11, long j12, long j13, long j14);

    private void writeRequestBody(C34699e c34699e) {
        OutputStream outputStream = null;
        try {
            if (c34699e.m76046c() && c34699e.m76045b()) {
                outputStream = this.mConnection.getOutputStream();
                outputStream.write(c34699e.f73427d);
                outputStream.flush();
            } else if (c34699e.m76046c() && !TextUtils.isEmpty(c34699e.f73432i)) {
                outputStream = this.mConnection.getOutputStream();
                byte[] bArr = c34699e.f73433j;
                if (bArr != null && bArr.length > 0) {
                    outputStream.write(bArr);
                }
                uploadFileByPath(c34699e, outputStream);
                byte[] bArr2 = c34699e.f73434k;
                if (bArr2 != null && bArr2.length > 0) {
                    outputStream.write(bArr2);
                }
                outputStream.flush();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")Do write request body failed.");
        } finally {
            closeIO(null);
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$b */
    public static class C34696b {

        /* JADX INFO: renamed from: a */
        int f73406a;

        /* JADX INFO: renamed from: b */
        int f73407b;

        /* JADX INFO: renamed from: c */
        int f73408c;

        /* JADX INFO: renamed from: d */
        boolean f73409d;

        /* JADX INFO: renamed from: e */
        int f73410e;

        /* JADX INFO: renamed from: f */
        int f73411f;

        /* JADX INFO: renamed from: g */
        String f73412g;

        /* JADX INFO: renamed from: h */
        String f73413h;

        /* JADX INFO: renamed from: i */
        String f73414i;

        /* JADX INFO: renamed from: j */
        EnumC34698d f73415j;

        public C34696b(int i11, int i12, int i13, boolean z11, int i14, int i15, String str, String str2, String str3, EnumC34698d enumC34698d) {
            this.f73406a = i11;
            this.f73407b = i12;
            this.f73408c = i13;
            this.f73409d = z11;
            this.f73410e = i14;
            this.f73411f = i15;
            this.f73412g = str;
            this.f73413h = str2;
            this.f73414i = str3;
            this.f73415j = enumC34698d;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$d */
    public enum EnumC34698d {
        DEFAULT(0),
        WIFI(1),
        CELLULAR(2);

        int nativeValue;

        EnumC34698d(int i11) {
            this.nativeValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static EnumC34698d m76043a(int i11) {
            for (EnumC34698d enumC34698d : values()) {
                if (enumC34698d.nativeValue == i11) {
                    return enumC34698d;
                }
            }
            LiteavLog.m76087i(HttpClientAndroid.TAG, "Invalid value:".concat(String.valueOf(i11)));
            return DEFAULT;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$g */
    public enum EnumC34701g {
        CONNECTED(0),
        DISCONNECTED(1),
        FINISHED(2);

        int nativeValue;

        EnumC34701g(int i11) {
            this.nativeValue = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.http.HttpClientAndroid$h */
    public enum EnumC34702h {
        kHTTP200OK(200),
        kHTTP204NoContent(204),
        kHTTP206PartialContent(206),
        kHTTP301MovedPermanently(301),
        kHTTP302Found(302),
        kHTTP303SeeOther(303),
        kHTTP304NotModified(304),
        kHTTP307TemporaryRedirect(307),
        kHTTP308PermanentRedirect(308),
        kHTTP403Forbidden(403),
        kHTTP404NotFound(404),
        kHTTP405MethodNotAllowed(405),
        kHTTP503ServiceUnavailable(503),
        kSystemFileOpenFailed(1001),
        kSystemFileWriteFailed(1002),
        kSystemUnknownHost(1003),
        kSystemConnectHostFailed(1004),
        kSystemCreateSocketFailed(1005),
        kSystemNetworkDisabled(1006),
        kSystemConnectTimeout(1007),
        kSystemConnectRefused(1008),
        kSystemProtocolError(1009),
        kSystemSSLError(1010),
        kUnknownError(JCommonConstants.RemoteWhat.ON_SERVICE_CONNECTED);

        final int nativeValue;

        EnumC34702h(int i11) {
            this.nativeValue = i11;
        }
    }

    private boolean checkNativeValid() {
        boolean z11;
        synchronized (this.mLocker) {
            z11 = this.mNativeHttpClientAndroidJni != -1;
        }
        return z11;
    }

    private boolean checkRequestValid(long j11) {
        return this.mRunningRequestMap.containsKey(Long.valueOf(j11));
    }

    private void closeConnectionSafely(HttpURLConnection httpURLConnection) {
        if (this.mNetworkCallback != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            try {
                try {
                    ((ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity")).unregisterNetworkCallback(this.mNetworkCallback);
                } catch (Throwable th2) {
                    this.mNetworkCallback = null;
                    throw th2;
                }
            } catch (Exception e11) {
                LiteavLog.m76093w(TAG, "(" + hashCode() + ")" + Log.getStackTraceString(e11));
            }
            this.mNetworkCallback = null;
        }
        if (httpURLConnection != null) {
            try {
                closeIO(httpURLConnection.getInputStream());
            } catch (Exception e12) {
                e12.printStackTrace();
            } finally {
                try {
                    httpURLConnection.disconnect();
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
    }

    private void closeIO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    private HttpURLConnection createConnectionByNetworkType(final URL url, final Proxy proxy) {
        int i11;
        EnumC34698d enumC34698d = this.mHttpConfig.f73415j;
        if (enumC34698d == EnumC34698d.WIFI) {
            i11 = 1;
        } else {
            if (enumC34698d != EnumC34698d.CELLULAR) {
                return null;
            }
            i11 = 0;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final HttpURLConnection[] httpURLConnectionArr = {null};
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(i11).build();
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.2
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                HttpClientAndroid httpClientAndroid = HttpClientAndroid.this;
                httpClientAndroid.mReallyNetworkChannel = httpClientAndroid.mHttpConfig.f73415j;
                LiteavLog.m76087i(HttpClientAndroid.TAG, "(" + HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork onAvailable.");
                try {
                    try {
                        Proxy proxy2 = proxy;
                        if (proxy2 == null) {
                            httpURLConnectionArr[0] = (HttpURLConnection) network.openConnection(url);
                        } else {
                            httpURLConnectionArr[0] = (HttpURLConnection) network.openConnection(url, proxy2);
                        }
                    } catch (IOException e11) {
                        LiteavLog.m76093w(HttpClientAndroid.TAG, "(" + HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork failed. error: " + Log.getStackTraceString(e11));
                    }
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                LiteavLog.m76093w(HttpClientAndroid.TAG, "(" + HttpClientAndroid.this.hashCode() + ")createConnectionSpecifyNetwork onLost.");
                countDownLatch.countDown();
            }
        };
        this.mNetworkCallback = networkCallback;
        connectivityManager.requestNetwork(networkRequestBuild, networkCallback);
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork timeout.");
        }
        if (httpURLConnectionArr[0] != null) {
            LiteavLog.m76087i(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork success.");
        } else {
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")createConnectionSpecifyNetwork lost or timeout.");
        }
        return httpURLConnectionArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000f, B:14:0x0020, B:18:0x0029, B:20:0x003a, B:22:0x0040, B:23:0x006d), top: B:29:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0007, B:6:0x000f, B:14:0x0020, B:18:0x0029, B:20:0x003a, B:22:0x0040, B:23:0x006d), top: B:29:0x0007 }] */
    private void doCallbackAndResetState(EnumC34701g enumC34701g, long j11, C34700f c34700f, boolean z11) {
        long j12;
        boolean z12;
        boolean z13;
        synchronized (this.mLocker) {
            try {
                if (checkNativeValid()) {
                    j12 = j11;
                    if (checkRequestValid(j12) && c34700f != null) {
                        z12 = true;
                    }
                    if (EnumC34697c.RUNNING_REPEAT == this.mInternalState) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    this.mRunningRequestMap.remove(Long.valueOf(j12));
                    if (this.mRunningRequestMap.size() == 0) {
                        this.mInternalState = EnumC34697c.NONE;
                    }
                    if (z12) {
                        nativeOnCallback(this.mNativeHttpClientAndroidJni, z13, enumC34701g.nativeValue, j12, c34700f.f73435a.nativeValue, c34700f.f73436b, c34700f.f73441g, c34700f.f73437c, c34700f.f73439e, c34700f.f73440f, c34700f.f73438d, c34700f.f73442h, c34700f.f73443i, this.mReallyNetworkChannel.nativeValue);
                    }
                } else {
                    j12 = j11;
                }
                z12 = false;
                if (EnumC34697c.RUNNING_REPEAT == this.mInternalState) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.mRunningRequestMap.remove(Long.valueOf(j12));
                if (this.mRunningRequestMap.size() == 0) {
                    this.mInternalState = EnumC34697c.NONE;
                }
                if (z12) {
                    nativeOnCallback(this.mNativeHttpClientAndroidJni, z13, enumC34701g.nativeValue, j12, c34700f.f73435a.nativeValue, c34700f.f73436b, c34700f.f73441g, c34700f.f73437c, c34700f.f73439e, c34700f.f73440f, c34700f.f73438d, c34700f.f73442h, c34700f.f73443i, this.mReallyNetworkChannel.nativeValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
    }

    private boolean doOnCallback(EnumC34701g enumC34701g, long j11, C34700f c34700f) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid() || !checkRequestValid(j11) || c34700f == null) {
                    return false;
                }
                return nativeOnCallback(this.mNativeHttpClientAndroidJni, EnumC34697c.RUNNING_REPEAT == this.mInternalState, enumC34701g.nativeValue, j11, c34700f.f73435a.nativeValue, c34700f.f73436b, c34700f.f73441g, c34700f.f73437c, c34700f.f73439e, c34700f.f73440f, c34700f.f73438d, c34700f.f73442h, c34700f.f73443i, this.mReallyNetworkChannel.nativeValue);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void doReadData(long j11, C34700f c34700f) {
        boolean z11;
        long jElapsedRealtime;
        if (!checkRequestValid(j11)) {
            closeConnectionSafely(this.mConnection);
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")Do read data failed. Invalid request id. id:" + j11);
            return;
        }
        try {
            InputStream inputStream = this.mConnection.getInputStream();
            synchronized (this.mLocker) {
                z11 = this.mInternalState == EnumC34697c.RUNNING_ONCE;
            }
            long j12 = 0;
            if (z11) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    do {
                        int i11 = inputStream.read(this.mReadDataBytes);
                        if (i11 > 0) {
                            byteArrayOutputStream.write(this.mReadDataBytes, 0, i11);
                        }
                        if (i11 <= 0) {
                            break;
                        }
                    } while (checkRequestValid(j11));
                    int size = byteArrayOutputStream.size();
                    if (size > 0) {
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size);
                        c34700f.f73437c = byteBufferAllocateDirect;
                        byteBufferAllocateDirect.put(byteArrayOutputStream.toByteArray(), 0, size);
                        c34700f.f73438d = size;
                    }
                    jElapsedRealtime = 0;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    c34700f.f73435a = getStatusCode(th2);
                    c34700f.f73436b = th2.toString();
                    doCallbackAndResetState(EnumC34701g.DISCONNECTED, j11, c34700f, true);
                    return;
                }
            } else {
                try {
                    int i12 = inputStream.read(this.mReadDataBytes);
                    this.mTotalReadBytes += (long) i12;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (i12 > 0) {
                        ByteBuffer byteBuffer = this.mRepeatByteBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i12) {
                            this.mRepeatByteBuffer = ByteBuffer.allocateDirect(i12);
                        }
                        this.mRepeatByteBuffer.clear();
                        this.mRepeatByteBuffer.put(this.mReadDataBytes, 0, i12);
                        c34700f.f73437c = this.mRepeatByteBuffer;
                        c34700f.f73438d = i12;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Do read data failed. Catch error when reading.");
                    c34700f.f73435a = getStatusCode(e11);
                    c34700f.f73436b = e11.toString();
                    doCallbackAndResetState(EnumC34701g.DISCONNECTED, j11, c34700f, true);
                    return;
                }
            }
            if (c34700f.f73438d == 0 && !z11) {
                LiteavLog.m76093w(TAG, "(" + hashCode() + ")Do read data failed. Rsp size is 0.");
                doCallbackAndResetState(EnumC34701g.FINISHED, j11, c34700f, this.mHttpConfig.f73409d ^ true);
                return;
            }
            if (z11) {
                doCallbackAndResetState(EnumC34701g.FINISHED, j11, c34700f, !this.mHttpConfig.f73409d);
                return;
            }
            long j13 = jElapsedRealtime;
            boolean zDoOnCallback = doOnCallback(EnumC34701g.CONNECTED, j11, c34700f);
            this.mPausedRepeatDownloading = zDoOnCallback;
            this.mRepeatDownloadingStatusCode = c34700f.f73435a;
            if (zDoOnCallback) {
                return;
            }
            int i13 = this.mHttpConfig.f73410e;
            if (i13 > 0) {
                long j14 = this.mStartReadTime;
                long j15 = j13 - j14 == 0 ? 1L : j13 - j14;
                long j16 = this.mTotalReadBytes;
                if (j16 / j15 > i13 / 1000) {
                    j12 = ((j16 * 1000) / ((long) i13)) - j15;
                }
            }
            this.mHttpHandler.postDelayed(RunnableC34708f.m76053a(this, c34700f, j11), j12);
        } catch (Exception e12) {
            e12.printStackTrace();
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")Do read data failed. Fail to get InputStream.");
            c34700f.f73435a = getStatusCode(e12);
            c34700f.f73436b = e12.toString();
            doCallbackAndResetState(EnumC34701g.DISCONNECTED, j11, c34700f, true);
        }
    }

    public static HashMap getJavaHashMap(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0 || strArr2 == null || strArr2.length == 0) {
            return new HashMap();
        }
        if (strArr.length != strArr2.length) {
            LiteavLog.m76093w(TAG, "Invalid parameter, keys and values do not match.");
            return new HashMap();
        }
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < strArr.length; i11++) {
            map.put(strArr[i11], strArr2[i11]);
        }
        return map;
    }

    public static String[] getMapKeys(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        Set<String> setKeySet = map.keySet();
        return (String[]) setKeySet.toArray(new String[setKeySet.size()]);
    }

    private Map<String, String> getResponseHeaders(Map<String, List<String>> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (!TextUtils.isEmpty(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue().get(0));
            }
        }
        return map2;
    }

    public static /* synthetic */ void lambda$cancelAll$1(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
    }

    public static /* synthetic */ void lambda$destroy$4(HttpClientAndroid httpClientAndroid) {
        httpClientAndroid.closeConnectionSafely(httpClientAndroid.mConnection);
        httpClientAndroid.mConnection = null;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            httpClientAndroid.mHttpHandler.getLooper().quitSafely();
        } else {
            httpClientAndroid.mHttpHandler.getLooper().quit();
        }
    }

    public static /* synthetic */ void lambda$doReadData$5(HttpClientAndroid httpClientAndroid, C34700f c34700f, long j11) {
        C34700f c34700f2 = new C34700f();
        c34700f2.f73435a = c34700f.f73435a;
        httpClientAndroid.doReadData(j11, c34700f2);
    }

    public static /* synthetic */ void lambda$resumeRepeatDownload$2(HttpClientAndroid httpClientAndroid, Long l11) {
        C34700f c34700f = new C34700f();
        c34700f.f73435a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(l11.longValue(), c34700f);
    }

    public static /* synthetic */ void lambda$resumeRepeatDownload$3(HttpClientAndroid httpClientAndroid, long j11) {
        C34700f c34700f = new C34700f();
        c34700f.f73435a = httpClientAndroid.mRepeatDownloadingStatusCode;
        httpClientAndroid.doReadData(j11, c34700f);
    }

    private HttpURLConnection openConnection(URL url, Proxy proxy) throws Exception {
        return proxy != null ? (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxy))) : (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private long sendInternal(long j11, C34699e c34699e, boolean z11) {
        if (c34699e == null || !c34699e.m76044a()) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")upload file failed. Invalid request url(" + c34699e.f73425b + ").");
            return 0L;
        }
        if (TextUtils.isEmpty(c34699e.m76047d())) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")upload file failed. Request method(" + c34699e.f73426c + ") is not supported.");
            return 0L;
        }
        synchronized (this.mLocker) {
            try {
                if (this.mInternalState == EnumC34697c.NONE) {
                    this.mInternalState = z11 ? EnumC34697c.RUNNING_REPEAT : EnumC34697c.RUNNING_ONCE;
                } else if (this.mInternalState != EnumC34697c.RUNNING_ONCE) {
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Send request failed. Invalid state:" + this.mInternalState);
                    return 0L;
                }
                c34699e.f73424a = j11;
                this.mRunningRequestMap.put(Long.valueOf(j11), c34699e);
                this.mHttpHandler.post(RunnableC34703a.m76048a(this, c34699e));
                return c34699e.f73424a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void uploadFileByPath(C34699e c34699e, OutputStream outputStream) throws Exception {
        Throwable th2;
        long j11;
        if (TextUtils.isEmpty(c34699e.f73432i)) {
            return;
        }
        Closeable closeable = null;
        try {
            File file = new File(c34699e.f73432i);
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[524288];
                long length = file.length();
                long j12 = 0;
                while (true) {
                    int i11 = fileInputStream.read(bArr);
                    if (i11 != -1) {
                        synchronized (this.mLocker) {
                            try {
                                if (!checkRequestValid(c34699e.f73424a) || !checkNativeValid()) {
                                    break;
                                    break;
                                } else {
                                    j11 = j12 + ((long) i11);
                                    outputStream.write(bArr, 0, i11);
                                    nativeOnUploadProgress(this.mNativeHttpClientAndroidJni, c34699e.f73424a, j11, length);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    closeIO(fileInputStream);
                    j12 = j11;
                }
                closeIO(fileInputStream);
            } catch (Throwable th4) {
                th2 = th4;
                closeable = fileInputStream;
                closeIO(closeable);
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }

    public void cancel(long j11) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                    return;
                }
                if (this.mRunningRequestMap.size() == 0) {
                    return;
                }
                LiteavLog.m76087i(TAG, "(" + hashCode() + ")Cancel request. request:" + this.mRunningRequestMap.remove(Long.valueOf(j11)));
                if (this.mRunningRequestMap.size() == 0) {
                    this.mInternalState = EnumC34697c.NONE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void cancelAll() {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Cancel all request failed. Invalid native handle.");
                    return;
                }
                EnumC34697c enumC34697c = this.mInternalState;
                EnumC34697c enumC34697c2 = EnumC34697c.NONE;
                if (enumC34697c == enumC34697c2) {
                    return;
                }
                this.mInternalState = enumC34697c2;
                LiteavLog.m76087i(TAG, "(" + hashCode() + ")Cancel all. size:" + this.mRunningRequestMap.size());
                this.mRunningRequestMap.clear();
                this.mHttpHandler.post(RunnableC34704b.m76049a(this));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void destroy() {
        synchronized (this.mLocker) {
            this.mRunningRequestMap.clear();
            this.mNativeHttpClientAndroidJni = -1L;
            this.mHttpHandler.post(RunnableC34707e.m76052a(this));
        }
    }

    public void resumeRepeatDownload(long j11) {
        synchronized (this.mLocker) {
            try {
                if (!checkNativeValid()) {
                    LiteavLog.m76083e(TAG, "(" + hashCode() + ")Cancel request failed. Invalid native handle.");
                    return;
                }
                if (this.mRunningRequestMap.size() == 0) {
                    return;
                }
                if (this.mInternalState == EnumC34697c.RUNNING_REPEAT && this.mPausedRepeatDownloading) {
                    this.mPausedRepeatDownloading = false;
                    if (j11 == 0) {
                        Iterator<Long> it = this.mRunningRequestMap.keySet().iterator();
                        while (it.hasNext()) {
                            this.mHttpHandler.post(RunnableC34705c.m76050a(this, it.next()));
                        }
                    } else if (checkRequestValid(j11)) {
                        if (this.mRunningRequestMap.get(Long.valueOf(j11)) == null) {
                        } else {
                            this.mHttpHandler.post(RunnableC34706d.m76051a(this, j11));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void updateConfig(final int i11, final int i12, final int i13, final boolean z11, final int i14, final int i15, final String str, final String str2, final String str3, final int i16, long j11) {
        this.mHttpHandler.post(new Runnable() { // from class: com.tencent.liteav.base.http.HttpClientAndroid.1
            @Override // java.lang.Runnable
            public final void run() {
                HttpClientAndroid.this.mHttpConfig = new C34696b(i11, i12, i13, z11, i14, i15, str, str2, str3, EnumC34698d.m76043a(i16));
                HttpClientAndroid.this.mReallyNetworkChannel = EnumC34698d.DEFAULT;
                if (i14 > 0) {
                    HttpClientAndroid.this.mTotalReadBytes = 0L;
                    HttpClientAndroid.this.mStartReadTime = SystemClock.elapsedRealtime();
                }
            }
        });
    }

    public HttpClientAndroid(int i11, int i12, int i13, boolean z11, int i14, int i15, String str, String str2, String str3, int i16, long j11) {
        this.mHttpConfig = new C34696b(i11, i12, i13, z11, i14, i15, str, str2, str3, EnumC34698d.m76043a(i16));
        this.mNativeHttpClientAndroidJni = j11;
        HandlerThread handlerThread = new HandlerThread("HttpClient_" + hashCode());
        handlerThread.start();
        LiteavLog.m76087i(TAG, "Create http client(" + hashCode() + "). [ThreadName:" + handlerThread.getName() + "][ThreadId:" + handlerThread.getId() + "]");
        this.mHttpHandler = new Handler(handlerThread.getLooper());
    }

    private C34700f internalRequest(C34699e c34699e) {
        boolean z11;
        if (!c34699e.m76044a()) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")Send request failed. Invalid request url(" + c34699e.f73425b + ").");
            return null;
        }
        if (!checkRequestValid(c34699e.f73424a)) {
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")Do send failed. ignore request when cancelled. request:" + c34699e);
            return null;
        }
        C34700f c34700f = new C34700f();
        c34700f.f73442h = c34699e.f73429f;
        c34700f.f73443i = c34699e.f73430g;
        synchronized (this.mLocker) {
            if (this.mInternalState == EnumC34697c.RUNNING_ONCE) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        if (z11 && this.mConnection != null && !c34699e.f73425b.equals(this.mLastRequestURL)) {
            closeConnectionSafely(this.mConnection);
            this.mConnection = null;
        }
        this.mLastRequestURL = c34699e.f73425b;
        try {
            this.mConnection = createConnection(c34699e);
            writeRequestBody(c34699e);
            try {
                c34700f.f73435a = getStatusCode(this.mConnection.getResponseCode());
                c34700f.f73436b = this.mConnection.getResponseMessage();
                c34700f.f73439e = parseHostAddress(this.mConnection.getURL().getHost());
                c34700f.f73441g = this.mConnection.getURL().getPort();
                c34700f.f73440f = getResponseHeaders(this.mConnection.getHeaderFields());
                if (!checkRequestValid(c34699e.f73424a)) {
                    closeConnectionSafely(this.mConnection);
                    LiteavLog.m76093w(TAG, "(" + hashCode() + ")Do send failed. Invalid request, abort request.");
                    return null;
                }
                return c34700f;
            } catch (Exception e11) {
                e11.printStackTrace();
                LiteavLog.m76083e(TAG, "(" + hashCode() + ")Do send failed. Catch error. ex= " + Log.getStackTraceString(e11));
                c34700f.f73435a = getStatusCode(e11);
                c34700f.f73436b = e11.toString();
                doCallbackAndResetState(EnumC34701g.DISCONNECTED, c34699e.f73424a, c34700f, true);
                return null;
            }
        } catch (Exception e12) {
            e12.printStackTrace();
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")Do send failed. Fail to create http connection. ex= " + Log.getStackTraceString(e12));
            c34700f.f73435a = getStatusCode(e12);
            c34700f.f73436b = e12.toString();
            doCallbackAndResetState(EnumC34701g.DISCONNECTED, c34699e.f73424a, c34700f, true);
            return null;
        }
    }

    private String parseHostAddress(String str) {
        try {
            return InetAddress.getByName(str).getHostAddress();
        } catch (Exception unused) {
            LiteavLog.m76093w(TAG, "(" + hashCode() + ")Parse host error. host:" + str);
            return "";
        }
    }

    public long send(long j11, String str, String str2, byte[] bArr, Map<String, String> map, boolean z11, boolean z12) {
        if (!checkNativeValid()) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")Send request failed. Invalid native handle.");
            return 0L;
        }
        return sendInternal(j11, new C34699e(str, str2, bArr, map, z12), z11);
    }

    public long uploadFile(long j11, String str, String str2, byte[] bArr, Map<String, String> map, boolean z11, boolean z12, String str3, byte[] bArr2, byte[] bArr3) {
        if (!checkNativeValid()) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")upload file failed. Invalid native handle.");
            return 0L;
        }
        if (str3.isEmpty()) {
            LiteavLog.m76083e(TAG, "(" + hashCode() + ")upload file failed. Invalid file path(" + str3 + ").");
            return 0L;
        }
        return sendInternal(j11, new C34699e(str, str2, bArr, map, z12, str3, bArr2, bArr3), z11);
    }

    private EnumC34702h getStatusCode(Throwable th2) {
        EnumC34702h enumC34702h = EnumC34702h.kUnknownError;
        if (th2 instanceof FileNotFoundException) {
            return EnumC34702h.kSystemFileOpenFailed;
        }
        if (th2 instanceof EOFException) {
            return EnumC34702h.kSystemFileWriteFailed;
        }
        if (th2 instanceof UnknownHostException) {
            return EnumC34702h.kSystemUnknownHost;
        }
        if (th2 instanceof NoRouteToHostException) {
            return EnumC34702h.kSystemConnectHostFailed;
        }
        if (!(th2 instanceof SocketException) && !(th2 instanceof MalformedURLException)) {
            if (th2 instanceof SocketTimeoutException) {
                return EnumC34702h.kSystemConnectTimeout;
            }
            if (th2 instanceof ConnectException) {
                return EnumC34702h.kSystemConnectRefused;
            }
            if (th2 instanceof ProtocolException) {
                return EnumC34702h.kSystemProtocolError;
            }
            if (th2 instanceof SSLException) {
                return EnumC34702h.kSystemSSLError;
            }
            Log.m76036w(TAG, "(" + hashCode() + ")Failed to convert status code, exception：", th2.toString());
            return enumC34702h;
        }
        return EnumC34702h.kSystemCreateSocketFailed;
    }

    private HttpURLConnection createConnection(URL url, Proxy proxy) throws Exception {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            return openConnection(url, proxy);
        }
        if (this.mHttpConfig.f73415j == EnumC34698d.DEFAULT) {
            return openConnection(url, proxy);
        }
        HttpURLConnection httpURLConnectionCreateConnectionByNetworkType = createConnectionByNetworkType(url, proxy);
        return httpURLConnectionCreateConnectionByNetworkType != null ? httpURLConnectionCreateConnectionByNetworkType : openConnection(url, proxy);
    }
}
