package p008a6;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.n */
/* JADX INFO: compiled from: BufferMemoryChunk.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0154n implements InterfaceC0164x, Closeable {

    /* JADX INFO: renamed from: b */
    public ByteBuffer f533b;

    /* JADX INFO: renamed from: c */
    public final int f534c;

    /* JADX INFO: renamed from: d */
    public final long f535d = System.identityHashCode(this);

    @Override // p008a6.InterfaceC0164x, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f533b = null;
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: d */
    public synchronized int mo657d(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100898i(!isClosed());
        C45708h.m100896g(this.f533b);
        iM728a = C0165y.m728a(i11, i13, this.f534c);
        C0165y.m729b(i11, bArr.length, i12, iM728a, this.f534c);
        this.f533b.position(i11);
        this.f533b.get(bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: e */
    public synchronized byte mo658e(int i11) {
        C45708h.m100898i(!isClosed());
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f534c));
        C45708h.m100896g(this.f533b);
        return this.f533b.get(i11);
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: g */
    public synchronized int mo659g(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100898i(!isClosed());
        C45708h.m100896g(this.f533b);
        iM728a = C0165y.m728a(i11, i13, this.f534c);
        C0165y.m729b(i11, bArr.length, i12, iM728a, this.f534c);
        this.f533b.position(i11);
        this.f533b.put(bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    public synchronized ByteBuffer getByteBuffer() {
        return this.f533b;
    }

    @Override // p008a6.InterfaceC0164x
    public synchronized boolean isClosed() {
        return this.f533b == null;
    }

    /* JADX INFO: renamed from: a */
    private void m706a(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        if (!(interfaceC0164x instanceof C0154n)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        C45708h.m100898i(!isClosed());
        C45708h.m100898i(!interfaceC0164x.isClosed());
        C45708h.m100896g(this.f533b);
        C0165y.m729b(i11, interfaceC0164x.getSize(), i12, i13, this.f534c);
        this.f533b.position(i11);
        ByteBuffer byteBuffer = (ByteBuffer) C45708h.m100896g(interfaceC0164x.getByteBuffer());
        byteBuffer.position(i12);
        byte[] bArr = new byte[i13];
        this.f533b.get(bArr, 0, i13);
        byteBuffer.put(bArr, 0, i13);
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: c */
    public long mo656c() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // p008a6.InterfaceC0164x
    public int getSize() {
        return this.f534c;
    }

    @Override // p008a6.InterfaceC0164x
    public long getUniqueId() {
        return this.f535d;
    }

    public C0154n(int i11) {
        this.f533b = ByteBuffer.allocateDirect(i11);
        this.f534c = i11;
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: h */
    public void mo660h(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        C45708h.m100896g(interfaceC0164x);
        if (interfaceC0164x.getUniqueId() == getUniqueId()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(getUniqueId()) + " to BufferMemoryChunk " + Long.toHexString(interfaceC0164x.getUniqueId()) + " which are the same ");
            C45708h.m100891b(Boolean.FALSE);
        }
        if (interfaceC0164x.getUniqueId() < getUniqueId()) {
            synchronized (interfaceC0164x) {
                synchronized (this) {
                    m706a(i11, interfaceC0164x, i12, i13);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC0164x) {
                    m706a(i11, interfaceC0164x, i12, i13);
                }
            }
        }
    }
}
