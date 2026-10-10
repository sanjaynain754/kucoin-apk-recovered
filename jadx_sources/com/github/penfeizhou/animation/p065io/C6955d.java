package com.github.penfeizhou.animation.p065io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.io.d */
/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C6955d extends FilterInputStream implements Reader {

    /* JADX INFO: renamed from: b */
    public int f11611b;

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.p065io.Reader
    public synchronized void reset() throws IOException {
        super.reset();
        this.f11611b = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.p065io.Reader
    public long skip(long j11) throws IOException {
        long j12 = j11;
        while (j12 > 0) {
            long jSkip = super.skip(j12);
            if (jSkip > 0) {
                j12 -= jSkip;
            } else {
                if (super.read() == -1) {
                    break;
                }
                j12--;
            }
        }
        long j13 = j11 - j12;
        this.f11611b = (int) (((long) this.f11611b) + j13);
        return j13;
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int position() {
        return this.f11611b;
    }

    public C6955d(InputStream inputStream) {
        super(inputStream);
        try {
            inputStream.reset();
        } catch (IOException unused) {
        }
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public byte peek() throws IOException {
        byte b11 = (byte) read();
        this.f11611b++;
        return b11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, com.github.penfeizhou.animation.p065io.Reader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = super.read(bArr, i11, i12);
        this.f11611b += Math.max(0, i13);
        return i13;
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public InputStream toInputStream() throws IOException {
        return this;
    }
}
