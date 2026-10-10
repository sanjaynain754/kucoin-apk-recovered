package p543q;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes23.dex */
public class C43568a {

    /* JADX INFO: renamed from: a */
    public static final Map<String, SSLSocketFactory> f96122a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q.a$a */
    public class a implements X509TrustManager {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f96123a;

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        public a(String str) {
            this.f96123a = str;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            if (x509CertificateArr == null || x509CertificateArr.length == 0) {
                throw new IllegalArgumentException("Null or zero-length certificate chain");
            }
            X509Certificate x509Certificate = x509CertificateArr[0];
            if (x509Certificate == null) {
                throw new IllegalArgumentException("Not a X509Certificate");
            }
            try {
                if (this.f96123a.equals(Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(x509Certificate.getPublicKey().getEncoded()), 2))) {
                } else {
                    throw new CertificateException("Server public key does not match pinned public key");
                }
            } catch (Exception e11) {
                throw new CertificateException("Failed to verify server certificate", e11);
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static SSLSocketFactory m95845b(String str, C43569b.a aVar) throws Exception {
        TrustManager[] trustManagerArr = {new a(str)};
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        return new C43569b(sSLContext.getSocketFactory(), aVar);
    }

    /* JADX INFO: renamed from: a */
    public static void m95844a(HttpsURLConnection httpsURLConnection, String str, C43569b.a aVar) {
        try {
            String host = httpsURLConnection.getURL().getHost();
            Map<String, SSLSocketFactory> map = f96122a;
            SSLSocketFactory sSLSocketFactoryM95845b = map.get(host);
            if (sSLSocketFactoryM95845b == null) {
                sSLSocketFactoryM95845b = m95845b(str, aVar);
                map.put(host, sSLSocketFactoryM95845b);
            }
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryM95845b);
        } catch (Exception unused) {
        }
    }
}
