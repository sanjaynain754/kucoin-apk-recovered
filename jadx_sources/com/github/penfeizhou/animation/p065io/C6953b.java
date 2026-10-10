package com.github.penfeizhou.animation.p065io;

import androidx.work.Data;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.io.b */
/* JADX INFO: compiled from: ByteBufferWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class C6953b implements InterfaceC6956e {

    /* JADX INFO: renamed from: a */
    public ByteBuffer f11610a;

    /* JADX INFO: renamed from: a */
    public int m12798a() {
        return this.f11610a.position();
    }

    /* JADX INFO: renamed from: b */
    public void m12799b(byte b11) {
        this.f11610a.put(b11);
    }

    /* JADX INFO: renamed from: c */
    public void m12800c(byte[] bArr) {
        this.f11610a.put(bArr);
    }

    /* JADX INFO: renamed from: d */
    public void mo4313d(int i11) {
        ByteBuffer byteBuffer = this.f11610a;
        if (byteBuffer == null || i11 > byteBuffer.capacity()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11);
            this.f11610a = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.f11610a.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m12801e(int i11) {
        this.f11610a.position(i11 + m12798a());
    }

    /* JADX INFO: renamed from: f */
    public byte[] m12802f() {
        return this.f11610a.array();
    }

    public C6953b() {
        mo4313d(Data.MAX_DATA_BYTES);
    }

    @Override // com.github.penfeizhou.animation.p065io.InterfaceC6956e
    public void close() {
    }
}
