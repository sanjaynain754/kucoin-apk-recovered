package jumio.core;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.S3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40594S3 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f90124a;

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        Socket socketCreateSocket = this.f90124a.createSocket(socket, str, i11, z11);
        if (socketCreateSocket instanceof SSLSocket) {
            ((SSLSocket) socketCreateSocket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f90124a.getDefaultCipherSuites();
        Intrinsics.checkNotNullExpressionValue(defaultCipherSuites, "getDefaultCipherSuites(...)");
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f90124a.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "getSupportedCipherSuites(...)");
        return supportedCipherSuites;
    }

    public C40594S3(TrustManager[] trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, trustManager, null);
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getSocketFactory(...)");
        this.f90124a = socketFactory;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) throws IOException {
        Socket socketCreateSocket = this.f90124a.createSocket(str, i11);
        if (socketCreateSocket instanceof SSLSocket) {
            ((SSLSocket) socketCreateSocket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException {
        Socket socketCreateSocket = this.f90124a.createSocket(str, i11, inetAddress, i12);
        if (socketCreateSocket instanceof SSLSocket) {
            ((SSLSocket) socketCreateSocket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.f90124a.createSocket(inetAddress, i11);
        if (socketCreateSocket instanceof SSLSocket) {
            ((SSLSocket) socketCreateSocket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        Socket socketCreateSocket = this.f90124a.createSocket(inetAddress, i11, inetAddress2, i12);
        if (socketCreateSocket instanceof SSLSocket) {
            ((SSLSocket) socketCreateSocket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socketCreateSocket;
    }
}
