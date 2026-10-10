package com.facebook.imagepipeline.memory;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.facebook.soloader.nativeloader.NativeLoader;
import java.io.Closeable;
import java.nio.ByteBuffer;
import p008a6.C0165y;
import p008a6.InterfaceC0164x;
import p712w3.C45708h;
import p712w3.InterfaceC45704d;

/* JADX INFO: loaded from: classes34.dex */
@InterfaceC45704d
public class NativeMemoryChunk implements InterfaceC0164x, Closeable {

    /* JADX INFO: renamed from: b */
    public final long f9165b;

    /* JADX INFO: renamed from: c */
    public final int f9166c;

    /* JADX INFO: renamed from: d */
    public boolean f9167d;

    public NativeMemoryChunk(int i11) {
        C45708h.m100891b(Boolean.valueOf(i11 > 0));
        this.f9166c = i11;
        this.f9165b = nativeAllocate(i11);
        this.f9167d = false;
    }

    @InterfaceC45704d
    private static native long nativeAllocate(int i11);

    @InterfaceC45704d
    private static native void nativeCopyFromByteArray(long j11, byte[] bArr, int i11, int i12);

    @InterfaceC45704d
    private static native void nativeCopyToByteArray(long j11, byte[] bArr, int i11, int i12);

    @InterfaceC45704d
    private static native void nativeFree(long j11);

    @InterfaceC45704d
    private static native void nativeMemcpy(long j11, long j12, int i11);

    @InterfaceC45704d
    private static native byte nativeReadByte(long j11);

    @Override // p008a6.InterfaceC0164x, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f9167d) {
            this.f9167d = true;
            nativeFree(this.f9165b);
        }
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: d */
    public synchronized int mo657d(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100898i(!isClosed());
        iM728a = C0165y.m728a(i11, i13, this.f9166c);
        C0165y.m729b(i11, bArr.length, i12, iM728a, this.f9166c);
        nativeCopyToByteArray(this.f9165b + ((long) i11), bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: e */
    public synchronized byte mo658e(int i11) {
        C45708h.m100898i(!isClosed());
        C45708h.m100891b(Boolean.valueOf(i11 >= 0));
        C45708h.m100891b(Boolean.valueOf(i11 < this.f9166c));
        return nativeReadByte(this.f9165b + ((long) i11));
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: g */
    public synchronized int mo659g(int i11, byte[] bArr, int i12, int i13) {
        int iM728a;
        C45708h.m100896g(bArr);
        C45708h.m100898i(!isClosed());
        iM728a = C0165y.m728a(i11, i13, this.f9166c);
        C0165y.m729b(i11, bArr.length, i12, iM728a, this.f9166c);
        nativeCopyFromByteArray(this.f9165b + ((long) i11), bArr, i12, iM728a);
        return iM728a;
    }

    @Override // p008a6.InterfaceC0164x
    public ByteBuffer getByteBuffer() {
        return null;
    }

    @Override // p008a6.InterfaceC0164x
    public synchronized boolean isClosed() {
        return this.f9167d;
    }

    static {
        NativeLoader.loadLibrary("imagepipeline");
    }

    /* JADX INFO: renamed from: a */
    private void m9491a(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        if (!(interfaceC0164x instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        C45708h.m100898i(!isClosed());
        C45708h.m100898i(!interfaceC0164x.isClosed());
        C0165y.m729b(i11, interfaceC0164x.getSize(), i12, i13, this.f9166c);
        nativeMemcpy(interfaceC0164x.mo656c() + ((long) i12), this.f9165b + ((long) i11), i13);
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: c */
    public long mo656c() {
        return this.f9165b;
    }

    @Override // p008a6.InterfaceC0164x
    public int getSize() {
        return this.f9166c;
    }

    @Override // p008a6.InterfaceC0164x
    public long getUniqueId() {
        return this.f9165b;
    }

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // p008a6.InterfaceC0164x
    /* JADX INFO: renamed from: h */
    public void mo660h(int i11, InterfaceC0164x interfaceC0164x, int i12, int i13) {
        C45708h.m100896g(interfaceC0164x);
        if (interfaceC0164x.getUniqueId() == getUniqueId()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(interfaceC0164x)) + " which share the same address " + Long.toHexString(this.f9165b));
            C45708h.m100891b(Boolean.FALSE);
        }
        if (interfaceC0164x.getUniqueId() < getUniqueId()) {
            synchronized (interfaceC0164x) {
                synchronized (this) {
                    m9491a(i11, interfaceC0164x, i12, i13);
                }
            }
        } else {
            synchronized (this) {
                synchronized (interfaceC0164x) {
                    m9491a(i11, interfaceC0164x, i12, i13);
                }
            }
        }
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.f9166c = 0;
        this.f9165b = 0L;
        this.f9167d = true;
    }
}
