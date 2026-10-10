package p543q;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: q.b */
/* JADX INFO: loaded from: classes23.dex */
public class C43569b extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final SSLSocketFactory f96124a;

    /* JADX INFO: renamed from: b */
    public final a f96125b;

    /* JADX INFO: renamed from: q.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo93505a(int i11);
    }

    /* JADX INFO: renamed from: q.b$b */
    public static class b extends SSLSocket {

        /* JADX INFO: renamed from: b */
        public final SSLSocket f96126b;

        /* JADX INFO: renamed from: c */
        public final long f96127c = System.currentTimeMillis();

        /* JADX INFO: renamed from: d */
        public final a f96128d;

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f96126b.close();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) throws IOException {
            this.f96126b.connect(socketAddress);
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() throws SocketException {
            return this.f96126b.getReceiveBufferSize();
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() throws SocketException {
            return this.f96126b.getSendBufferSize();
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() throws SocketException {
            return this.f96126b.getSoTimeout();
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i11) throws SocketException {
            this.f96126b.setReceiveBufferSize(i11);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i11) throws SocketException {
            this.f96126b.setSendBufferSize(i11);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i11) throws SocketException {
            this.f96126b.setSoTimeout(i11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f96126b.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) throws IOException {
            this.f96126b.bind(socketAddress);
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i11) throws IOException {
            this.f96126b.connect(socketAddress, i11);
        }

        public boolean equals(Object obj) {
            return this.f96126b.equals(obj);
        }

        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return this.f96126b.getChannel();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return this.f96126b.getEnableSessionCreation();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return this.f96126b.getEnabledCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return this.f96126b.getEnabledProtocols();
        }

        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return this.f96126b.getInetAddress();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() throws SocketException {
            return this.f96126b.getKeepAlive();
        }

        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return this.f96126b.getLocalAddress();
        }

        @Override // java.net.Socket
        public int getLocalPort() {
            return this.f96126b.getLocalPort();
        }

        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return this.f96126b.getLocalSocketAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return this.f96126b.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() throws SocketException {
            return this.f96126b.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() throws IOException {
            return this.f96126b.getOutputStream();
        }

        @Override // java.net.Socket
        public int getPort() {
            return this.f96126b.getPort();
        }

        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return this.f96126b.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() throws SocketException {
            return this.f96126b.getReuseAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return this.f96126b.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() throws SocketException {
            return this.f96126b.getSoLinger();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return this.f96126b.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return this.f96126b.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() throws SocketException {
            return this.f96126b.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() throws SocketException {
            return this.f96126b.getTrafficClass();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return this.f96126b.getUseClientMode();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return this.f96126b.getWantClientAuth();
        }

        @Override // java.net.Socket
        public boolean isBound() {
            return this.f96126b.isBound();
        }

        @Override // java.net.Socket
        public boolean isClosed() {
            return this.f96126b.isClosed();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.f96126b.isConnected();
        }

        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return this.f96126b.isInputShutdown();
        }

        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return this.f96126b.isOutputShutdown();
        }

        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f96126b.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i11) throws IOException {
            this.f96126b.sendUrgentData(i11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z11) {
            this.f96126b.setEnableSessionCreation(z11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
            this.f96126b.setEnabledCipherSuites(strArr);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            this.f96126b.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z11) throws SocketException {
            this.f96126b.setKeepAlive(z11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z11) {
            this.f96126b.setNeedClientAuth(z11);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z11) throws SocketException {
            this.f96126b.setOOBInline(z11);
        }

        @Override // java.net.Socket
        public void setPerformancePreferences(int i11, int i12, int i13) {
            this.f96126b.setPerformancePreferences(i11, i12, i13);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z11) throws SocketException {
            this.f96126b.setReuseAddress(z11);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z11, int i11) throws SocketException {
            this.f96126b.setSoLinger(z11, i11);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z11) throws SocketException {
            this.f96126b.setTcpNoDelay(z11);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i11) throws SocketException {
            this.f96126b.setTrafficClass(i11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z11) {
            this.f96126b.setUseClientMode(z11);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z11) {
            this.f96126b.setWantClientAuth(z11);
        }

        @Override // java.net.Socket
        public void shutdownInput() throws IOException {
            this.f96126b.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() throws IOException {
            this.f96126b.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() throws IOException {
            this.f96126b.startHandshake();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return this.f96126b.toString();
        }

        public b(SSLSocket sSLSocket, a aVar) {
            this.f96126b = sSLSocket;
            this.f96128d = aVar;
        }

        @Override // java.net.Socket
        public InputStream getInputStream() throws IOException {
            long jCurrentTimeMillis = System.currentTimeMillis();
            a aVar = this.f96128d;
            if (aVar != null) {
                aVar.mo93505a((int) (jCurrentTimeMillis - this.f96127c));
            }
            return this.f96126b.getInputStream();
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) throws IOException {
        return new b((SSLSocket) this.f96124a.createSocket(str, i11), this.f96125b);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException {
        return new b((SSLSocket) this.f96124a.createSocket(str, i11, inetAddress, i12), this.f96125b);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f96124a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f96124a.getSupportedCipherSuites();
    }

    public C43569b(SSLSocketFactory sSLSocketFactory, a aVar) {
        this.f96124a = sSLSocketFactory;
        this.f96125b = aVar;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        return new b((SSLSocket) this.f96124a.createSocket(inetAddress, i11), this.f96125b);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        return new b((SSLSocket) this.f96124a.createSocket(inetAddress, i11, inetAddress2, i12), this.f96125b);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        return new b((SSLSocket) this.f96124a.createSocket(socket, str, i11, z11), this.f96125b);
    }
}
