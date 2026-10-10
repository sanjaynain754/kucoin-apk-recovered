package com.fasterxml.jackson.core.p062io;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.c */
/* JADX INFO: compiled from: DataOutputAsStream.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6309c extends OutputStream {

    /* JADX INFO: renamed from: b */
    public final DataOutput f10080b;

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        this.f10080b.write(i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f10080b.write(bArr, 0, bArr.length);
    }

    public C6309c(DataOutput dataOutput) {
        this.f10080b = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f10080b.write(bArr, i11, i12);
    }
}
