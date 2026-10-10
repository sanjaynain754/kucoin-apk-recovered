package com.github.penfeizhou.animation.p065io;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.github.penfeizhou.animation.io.c */
/* JADX INFO: compiled from: FilterReader.java */
/* JADX INFO: loaded from: classes.dex */
public class C6954c implements Reader {
    protected Reader reader;

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int available() throws IOException {
        return this.reader.available();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public byte peek() throws IOException {
        return this.reader.peek();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int position() {
        return this.reader.position();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        return this.reader.read(bArr, i11, i12);
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public void reset() throws IOException {
        this.reader.reset();
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public long skip(long j11) throws IOException {
        return this.reader.skip(j11);
    }

    public C6954c(Reader reader) {
        this.reader = reader;
    }

    @Override // com.github.penfeizhou.animation.p065io.Reader
    public InputStream toInputStream() throws IOException {
        reset();
        return this.reader.toInputStream();
    }
}
