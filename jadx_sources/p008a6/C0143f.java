package p008a6;

import android.annotation.TargetApi;
import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.f */
/* JADX INFO: compiled from: AshmemMemoryChunk.java */
/* JADX INFO: loaded from: classes34.dex */
@TargetApi(27)
public class C0143f implements InterfaceC0164x, Closeable {

    /* JADX INFO: renamed from: b */
    public SharedMemory f492b;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f493c;

    /* JADX INFO: renamed from: d */
    public final long f494d;

    @Override // p008a6.InterfaceC0164x, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f492b;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f493c;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f493c = null;
                this.f492b = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: d */
    public synchronized int mo657d(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100896g(this.f493c);
        iM728a = C0165y.m728a(i11, i13, getSize());
        C0165y.m729b(i11, bArr.length, i12, iM728a, getSize());
        this.f493c.position(i11);
        this.f493c.get(bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: e */
    public synchronized byte mo658e(int i11) {
        C45708h.m100898i(!isClosed());
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < getSize()));
        C45708h.m100896g(this.f493c);
        return this.f493c.get(i11);
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: g */
    public synchronized int mo659g(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100896g(this.f493c);
        iM728a = C0165y.m728a(i11, i13, getSize());
        C0165y.m729b(i11, bArr.length, i12, iM728a, getSize());
        this.f493c.position(i11);
        this.f493c.put(bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    public synchronized boolean isClosed() {
        return this.f493c == null || this.f492b == null;
    }

    /* JADX INFO: renamed from: a */
    public final void m655a(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        if (!(interfaceC0164x instanceof C0143f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        C45708h.m100898i(!isClosed());
        C45708h.m100898i(!interfaceC0164x.isClosed());
        C45708h.m100896g(this.f493c);
        C45708h.m100896g(interfaceC0164x.getByteBuffer());
        C0165y.m729b(i11, interfaceC0164x.getSize(), i12, i13, getSize());
        this.f493c.position(i11);
        interfaceC0164x.getByteBuffer().position(i12);
        byte[] bArr = new byte[i13];
        this.f493c.get(bArr, 0, i13);
        interfaceC0164x.getByteBuffer().put(bArr, 0, i13);
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: c */
    public long mo656c() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // p008a6.InterfaceC0164x
    public ByteBuffer getByteBuffer() {
        return this.f493c;
    }

    @Override // p008a6.InterfaceC0164x
    public int getSize() {
        C45708h.m100896g(this.f492b);
        return this.f492b.getSize();
    }

    @Override // p008a6.InterfaceC0164x
    public long getUniqueId() {
        return this.f494d;
    }

    public C0143f(int i11) {
        boolean z11;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C45708h.m100891b(Boolean.valueOf(z11));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i11);
            this.f492b = sharedMemoryCreate;
            this.f493c = sharedMemoryCreate.mapReadWrite();
            this.f494d = System.identityHashCode(this);
        } catch (ErrnoException e11) {
            throw new RuntimeException("Fail to create AshmemMemory", e11);
        }
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: h */
    public void mo660h(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        C45708h.m100896g(interfaceC0164x);
        if (interfaceC0164x.getUniqueId() == getUniqueId()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(getUniqueId()) + " to AshmemMemoryChunk " + Long.toHexString(interfaceC0164x.getUniqueId()) + " which are the same ");
            C45708h.m100891b(Boolean.FALSE);
        }
        if (interfaceC0164x.getUniqueId() < getUniqueId()) {
            synchronized (interfaceC0164x) {
                synchronized (this) {
                    m655a(i11, interfaceC0164x, i12, i13);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC0164x) {
                    m655a(i11, interfaceC0164x, i12, i13);
                }
            }
        }
    }
}
