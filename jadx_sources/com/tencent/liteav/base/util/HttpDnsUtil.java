package com.tencent.liteav.base.util;

import android.net.SSLCertificateSocketFactory;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::dns")
public class HttpDnsUtil {
    private static final String TAG = "HttpDnsUtil";
    private static final List<String> WHITE_LIST_HOST;
    private static InterfaceC34732a mCustomHttpDNSCallback = null;
    private static boolean mEnableCustomHttpDNS = false;
    private static final Object mLock = new Object();
    private static final String sIPV4Regular = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
    private static final String sVClass = "amF2YXgubmV0LnNzbC5Ib3N0bmFtZVZlcmlmaWVy";
    private static Pattern sValidIPV4Pattern = null;
    private static final String sVerifyMethodBase64 = "c2V0SG9zdG5hbWVWZXJpZmllcg";

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.HttpDnsUtil$a */
    public interface InterfaceC34732a {
        /* JADX INFO: renamed from: a */
        void mo76077a(String str, List<String> list);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.HttpDnsUtil$b */
    public static class C34733b extends SSLSocketFactory {

        /* JADX INFO: renamed from: a */
        private HttpsURLConnection f73514a;

        @Override // javax.net.SocketFactory
        public final Socket createSocket() throws IOException {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getDefaultCipherSuites() {
            return new String[0];
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getSupportedCipherSuites() {
            return new String[0];
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i11) throws IOException {
            return null;
        }

        public C34733b(HttpsURLConnection httpsURLConnection) {
            this.f73514a = httpsURLConnection;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
            return null;
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
            return null;
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
            String requestProperty = this.f73514a.getRequestProperty("Host");
            if (requestProperty != null) {
                str = requestProperty;
            }
            InetAddress inetAddress = socket.getInetAddress();
            if (z11) {
                socket.close();
            }
            SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
            SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i11);
            sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
            LiteavLog.m76087i(HttpDnsUtil.TAG, "Setting SNI hostname");
            sSLCertificateSocketFactory.setHostname(sSLSocket, str);
            SSLSession session = sSLSocket.getSession();
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                LiteavLog.m76087i(HttpDnsUtil.TAG, "Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
                return sSLSocket;
            }
            throw new SSLPeerUnverifiedException("Cannot verify hostname: ".concat(String.valueOf(str)));
        }
    }

    public static boolean isIpAddress(String str) {
        if (str != null && !"".equals(str)) {
            if (sValidIPV4Pattern == null) {
                try {
                    sValidIPV4Pattern = Pattern.compile(sIPV4Regular, 2);
                } catch (Exception e11) {
                    LiteavLog.m76083e(TAG, "Pattern.compile fail " + Log.getStackTraceString(e11));
                    return false;
                }
            }
            if (sValidIPV4Pattern.matcher(str).matches() || str.contains(C33844oi.f71346o)) {
                return true;
            }
        }
        return false;
    }

    static {
        ArrayList arrayList = new ArrayList();
        WHITE_LIST_HOST = arrayList;
        arrayList.add("YVc1MGJDMXpaR3RzYjJjdWRISjBZeTUwWlc1alpXNTBMV05zYjNWa0xtTnZiUT09");
        arrayList.add("WVZjMU1HSkRNWHBhUjNSellqSmpkV1JJU2pCWmVUVXdXbGMxYWxwWE5UQk1WMDV6WWpOV2EweHRUblppVVQwOQ==");
        arrayList.add("aW5sYW5kLXNka2xvZy50cnRjLnRlbmNlbnQtY2xvdWQuY29t");
        arrayList.add("dHJ0Yy1zZGstbG9nLTEyNTgzNDQ2OTkuY29zLmFwLWd1YW5nemhvdS5teXFjbG91ZC5jb20=");
        arrayList.add("dHJ0Yy1zZGstY29uZmlnLTEyNTgzNDQ2OTkuZmlsZS5teXFjbG91ZC5jb20=");
        arrayList.add("bGl0ZWF2LnNkay5xY2xvdWQuY29t");
        arrayList.add("eXVuLnRpbS5xcS5jb20=");
        arrayList.add("dmlkZW9hcGktc2dwLmltLnFjbG91ZC5jb20=");
        arrayList.add("c2RrZGMubGl2ZS5xY2xvdWQuY29t");
        arrayList.add("bWx2YmRjLmxpdmUucWNsb3VkLmNvbQ==");
        arrayList.add("Y29uZi5zZGsucWNsb3VkLmNvbQ==");
        arrayList.add("c3BlZWR0ZXN0aW50LnRydGMudGVuY2VudC1jbG91ZC5jb20=");
        arrayList.add("c3BlZWR0ZXN0LnRydGMudGVuY2VudC1jbG91ZC5jb20=");
        arrayList.add("d2VicnRjLXNpZ25hbC1zY2hlZHVsZXIudGxpdmVzb3VyY2UuY29t");
        arrayList.add("Y2xvdWQudGltLnFxLmNvbQ==");
        arrayList.add("bGl2ZXB1bGwubXlxY2xvdWQuY29t");
        arrayList.add("bGl2ZXB1bGxpcHY2Lm15cWNsb3VkLmNvbQ==");
        arrayList.add("dGNkbnMubXlxY2xvdWQuY29t");
        arrayList.add("dGNkbnNpcHY2Lm15cWNsb3VkLmNvbQ==");
        arrayList.add("bGl0ZWF2YXBwLnFjbG91ZC5jb20=");
        arrayList.add("bGljZW5zZS10ZXN0LnZvZDIubXlxY2xvdWQuY29t");
        arrayList.add("c2RrY29uZmlnLnRsaXZlc291cmNlLmNvbQ==");
        arrayList.add("bWx2YmRjLmxpdmUudGxpdmVzb3VyY2UuY29t");
        arrayList.add("bGljZW5zZS52b2RnbGNkbi5jb20=");
        arrayList.add("bGljZW5zZS52b2QtY29tbW9uLmNvbQ==");
        arrayList.add("bGljZW5zZS52b2RnbGNkbjEuY29t");
        arrayList.add("bGljZW5zZS52b2QtY29tbW9uMS5jb20=");
        arrayList.add("bGljZW5zZS52b2RwbGF5dmlkZW8ubmV0");
        arrayList.add("bGljZW5zZS52b2RwbGF5dmlkZW8uY29t");
    }

    public static void applySniForHttpsConnection(HttpURLConnection httpURLConnection, final String str) {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(new C34733b(httpsURLConnection));
            try {
                InvocationHandler invocationHandler = new InvocationHandler() { // from class: com.tencent.liteav.base.util.HttpDnsUtil.1
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                        if (method.getName().equals("verify")) {
                            return Boolean.valueOf(HttpsURLConnection.getDefaultHostnameVerifier().verify(str, (SSLSession) objArr[1]));
                        }
                        return method.invoke(HttpsURLConnection.getDefaultHostnameVerifier(), objArr);
                    }
                };
                Class<?> cls = Class.forName(new String(Base64.decode(sVClass, 0)));
                Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
                Method declaredMethod = HttpsURLConnection.class.getDeclaredMethod(new String(Base64.decode(sVerifyMethodBase64, 0)), cls);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(httpsURLConnection, objNewProxyInstance);
            } catch (Throwable th2) {
                LiteavLog.m76083e(TAG, "applySniForHttpsConnection error: " + Log.getStackTraceString(th2));
            }
        }
    }

    public static void enableCustomHttpDNS(boolean z11, InterfaceC34732a interfaceC34732a) {
        LiteavLog.m76087i(TAG, "enableCustomHttpDNS: ".concat(String.valueOf(z11)));
        synchronized (mLock) {
            mEnableCustomHttpDNS = z11;
            mCustomHttpDNSCallback = interfaceC34732a;
        }
    }

    public static boolean isEnableCustomHttpDNS() {
        return mEnableCustomHttpDNS;
    }

    public static boolean verifyCustomHttpDNS(String str) {
        synchronized (mLock) {
            if (mEnableCustomHttpDNS && mCustomHttpDNSCallback != null) {
                if (isHostInWhiteList(str) || isIpAddress(str)) {
                    return false;
                }
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                if (property == null || property2 == null) {
                    return true;
                }
                LiteavLog.m76093w(TAG, "local proxy is on, don't use httpdns. proxyHost=" + property + " ,proxyPort=" + property2);
                return false;
            }
            return false;
        }
    }

    public static String convertHttpDNSURL(String str, String str2) throws Exception {
        String addressUseCustomHttpDns = parseAddressUseCustomHttpDns(str2);
        if (TextUtils.isEmpty(addressUseCustomHttpDns)) {
            return null;
        }
        InetAddress byName = InetAddress.getByName(addressUseCustomHttpDns);
        if (byName instanceof Inet4Address) {
            return str.replaceFirst(str2, addressUseCustomHttpDns);
        }
        if (!(byName instanceof Inet6Address)) {
            return null;
        }
        return str.replaceFirst(str2, "[" + addressUseCustomHttpDns + "]");
    }

    public static HttpURLConnection createConnectionUseCustomHttpDNS(String str, String str2) throws Exception {
        String strConvertHttpDNSURL = convertHttpDNSURL(str, str2);
        if (TextUtils.isEmpty(strConvertHttpDNSURL)) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(strConvertHttpDNSURL).openConnection()));
        httpURLConnection.setRequestProperty("Host", str2);
        applySniForHttpsConnection(httpURLConnection, str2);
        LiteavLog.m76087i(TAG, "create http conn use httpDns, original url: " + str + " , new url: " + strConvertHttpDNSURL);
        return httpURLConnection;
    }

    public static boolean isHostInWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return WHITE_LIST_HOST.contains(new String(Base64.encode(str.getBytes(), 0)).trim());
    }

    public static String parseAddressUseCustomHttpDns(String str) {
        if (!verifyCustomHttpDNS(str)) {
            return "";
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ArrayList arrayList = new ArrayList();
        synchronized (mLock) {
            mCustomHttpDNSCallback.mo76077a(str, arrayList);
        }
        if (arrayList.size() > 0) {
            String str2 = (String) arrayList.get(0);
            LiteavLog.m76087i(TAG, "parse host: " + str + " and return ipAddress: " + str2 + " ,costTime: " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms");
            return str2;
        }
        LiteavLog.m76087i(TAG, "parse host: " + str + " ,return empty ipAddress");
        return "";
    }
}
