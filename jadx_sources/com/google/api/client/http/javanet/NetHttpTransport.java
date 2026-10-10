package com.google.api.client.http.javanet;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes56.dex */
public final class NetHttpTransport extends HttpTransport {
    private static final String SHOULD_USE_PROXY_FLAG = "com.google.api.client.should_use_proxy";
    private static final String[] SUPPORTED_METHODS;
    private final ConnectionFactory connectionFactory;
    private final HostnameVerifier hostnameVerifier;
    private final boolean isMtls;
    private final SSLSocketFactory sslSocketFactory;

    public static final class Builder {
        private ConnectionFactory connectionFactory;
        private HostnameVerifier hostnameVerifier;
        private boolean isMtls;
        private Proxy proxy;
        private SSLSocketFactory sslSocketFactory;

        public Builder trustCertificates(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory());
            return setSslSocketFactory(tlsSslContext.getSocketFactory());
        }

        public NetHttpTransport build() {
            if (System.getProperty(NetHttpTransport.SHOULD_USE_PROXY_FLAG) != null) {
                setProxy(NetHttpTransport.defaultProxy());
            }
            return this.proxy == null ? new NetHttpTransport(this.connectionFactory, this.sslSocketFactory, this.hostnameVerifier, this.isMtls) : new NetHttpTransport(this.proxy, this.sslSocketFactory, this.hostnameVerifier, this.isMtls);
        }

        public HostnameVerifier getHostnameVerifier() {
            return this.hostnameVerifier;
        }

        public SSLSocketFactory getSslSocketFactory() {
            return this.sslSocketFactory;
        }

        public Builder setConnectionFactory(ConnectionFactory connectionFactory) {
            this.connectionFactory = connectionFactory;
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        public Builder setProxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.sslSocketFactory = sSLSocketFactory;
            return this;
        }

        @Beta
        public Builder doNotValidateCertificate() throws GeneralSecurityException {
            this.hostnameVerifier = SslUtils.trustAllHostnameVerifier();
            this.sslSocketFactory = SslUtils.trustAllSSLContext().getSocketFactory();
            return this;
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(javaKeyStore, inputStream, str);
            return trustCertificates(javaKeyStore);
        }

        public Builder trustCertificatesFromStream(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            javaKeyStore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(javaKeyStore, SecurityUtils.getX509CertificateFactory(), inputStream);
            return trustCertificates(javaKeyStore);
        }

        @Beta
        public Builder trustCertificates(KeyStore keyStore, KeyStore keyStore2, String str) throws GeneralSecurityException {
            if (keyStore2 != null && keyStore2.size() > 0) {
                this.isMtls = true;
            }
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory(), keyStore2, str, SslUtils.getDefaultKeyManagerFactory());
            return setSslSocketFactory(tlsSslContext.getSocketFactory());
        }
    }

    public NetHttpTransport() {
        this((ConnectionFactory) null, (SSLSocketFactory) null, (HostnameVerifier) null, false);
    }

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        SUPPORTED_METHODS = strArr;
        Arrays.sort(strArr);
    }

    public NetHttpTransport(Proxy proxy, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean z11) {
        this(new DefaultConnectionFactory(proxy), sSLSocketFactory, hostnameVerifier, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Proxy defaultProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort"))));
    }

    private ConnectionFactory getConnectionFactory(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            return System.getProperty(SHOULD_USE_PROXY_FLAG) != null ? new DefaultConnectionFactory(defaultProxy()) : new DefaultConnectionFactory();
        }
        return connectionFactory;
    }

    @Override // com.google.api.client.http.HttpTransport
    public NetHttpRequest buildRequest(String str, String str2) throws IOException {
        Preconditions.checkArgument(supportsMethod(str), "HTTP method %s not supported", str);
        HttpURLConnection httpURLConnectionOpenConnection = this.connectionFactory.openConnection(new URL(str2));
        httpURLConnectionOpenConnection.setRequestMethod(str);
        if (httpURLConnectionOpenConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionOpenConnection;
            HostnameVerifier hostnameVerifier = this.hostnameVerifier;
            if (hostnameVerifier != null) {
                httpsURLConnection.setHostnameVerifier(hostnameVerifier);
            }
            SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
            if (sSLSocketFactory != null) {
                httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            }
        }
        return new NetHttpRequest(httpURLConnectionOpenConnection);
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.isMtls;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(SUPPORTED_METHODS, str) >= 0;
    }

    public NetHttpTransport(ConnectionFactory connectionFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, boolean z11) {
        this.connectionFactory = getConnectionFactory(connectionFactory);
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.isMtls = z11;
    }
}
