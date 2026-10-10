package com.github.penfeizhou.animation.p065io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.io.a */
/* JADX INFO: compiled from: ByteBufferReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C6952a implements Reader {

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f11609b;

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int available() throws IOException {
        return this.f11609b.limit() - this.f11609b.position();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public byte peek() throws IOException {
        return this.f11609b.get();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int position() {
        return this.f11609b.position();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        this.f11609b.get(bArr, i11, i12);
        return i12;
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public void reset() throws IOException {
        this.f11609b.position(0);
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public long skip(long j11) throws IOException {
        ByteBuffer byteBuffer = this.f11609b;
        byteBuffer.position((int) (((long) byteBuffer.position()) + j11));
        return j11;
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public InputStream toInputStream() throws IOException {
        return new ByteArrayInputStream(this.f11609b.array());
    }

    public C6952a(ByteBuffer byteBuffer) {
        this.f11609b = byteBuffer;
        byteBuffer.position(0);
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public void close() throws IOException {
    }
}
