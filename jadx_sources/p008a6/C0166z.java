package p008a6;

import androidx.annotation.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;
import p006a4.AbstractC0110a;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.z */
/* JADX INFO: compiled from: MemoryPooledByteBuffer.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0166z implements PooledByteBuffer {

    /* JADX INFO: renamed from: b */
    public final int f554b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public AbstractC0110a<InterfaceC0164x> f555c;

    /* JADX INFO: renamed from: a */
    public synchronized void m730a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: c */
    public synchronized long mo731c() throws UnsupportedOperationException {
        m730a();
        C45708h.m100896g(this.f555c);
        return this.f555c.m565l().mo656c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        AbstractC0110a.m555j(this.f555c);
        this.f555c = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: d */
    public synchronized int mo732d(int i11, byte[] bArr, int i12, int i13) {
        m730a();
        C45708h.m100891b(Boolean.valueOf(i11 + i13 <= this.f554b));
        C45708h.m100896g(this.f555c);
        return this.f555c.m565l().mo657d(i11, bArr, i12, i13);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    /* JADX INFO: renamed from: e */
    public synchronized byte mo733e(int i11) {
        m730a();
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f554b));
        C45708h.m100896g(this.f555c);
        return this.f555c.m565l().mo658e(i11);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer getByteBuffer() {
        C45708h.m100896g(this.f555c);
        return this.f555c.m565l().getByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !AbstractC0110a.m557o(this.f555c);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        m730a();
        return this.f554b;
    }

    public C0166z(AbstractC0110a<InterfaceC0164x> abstractC0110a, int i11) {
        boolean z11;
        C45708h.m100896g(abstractC0110a);
        if (i11 >= 0 && i11 <= abstractC0110a.m565l().getSize()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        this.f555c = abstractC0110a.clone();
        this.f554b = i11;
    }
}
