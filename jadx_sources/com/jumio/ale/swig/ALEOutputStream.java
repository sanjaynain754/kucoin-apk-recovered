package com.jumio.ale.swig;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes56.dex */
public class ALEOutputStream extends FilterOutputStream {

    /* JADX INFO: renamed from: a */
    public final ALERequest f13394a;

    /* JADX INFO: renamed from: b */
    public final OutputStream f13395b;

    /* JADX INFO: renamed from: c */
    public byte[] f13396c;

    /* JADX INFO: renamed from: d */
    public int f13397d;

    /* JADX INFO: renamed from: e */
    public boolean f13398e;

    public ALEOutputStream(OutputStream outputStream, ALERequest aLERequest, int i11) throws Exception {
        this(outputStream, aLERequest, null, i11);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        if (i11 == 0 && i12 == bArr.length) {
            write(bArr);
            return;
        }
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        write(bArr2);
    }

    public ALEOutputStream(OutputStream outputStream, ALERequest aLERequest, ALEHeader aLEHeader, int i11) throws Exception {
        super(outputStream);
        this.f13397d = 0;
        this.f13398e = false;
        this.f13395b = outputStream;
        this.f13394a = aLERequest;
        byte[] bArr = new byte[aLERequest.calculateRequestInit(aLEHeader, i11)];
        this.f13396c = bArr;
        int iInitRequest = aLERequest.initRequest(aLEHeader, i11, bArr);
        this.f13397d = iInitRequest;
        outputStream.write(this.f13396c, 0, iInitRequest);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f13398e) {
            return;
        }
        this.f13398e = true;
        try {
            byte[] bArr = new byte[this.f13394a.calculateRequestFinish()];
            this.f13396c = bArr;
            this.f13397d = this.f13394a.finishRequest(bArr);
        } catch (Exception unused) {
            this.f13396c = null;
            this.f13397d = 0;
        }
        try {
            flush();
        } catch (IOException unused2) {
        }
        this.f13395b.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        byte[] bArr = this.f13396c;
        if (bArr != null) {
            this.f13395b.write(bArr, 0, this.f13397d);
            this.f13396c = null;
        }
        this.f13395b.flush();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[this.f13394a.calculateRequestUpdate(bArr.length)];
        this.f13396c = bArr2;
        try {
            int iUpdateRequest = this.f13394a.updateRequest(bArr, bArr2);
            this.f13397d = iUpdateRequest;
            byte[] bArr3 = this.f13396c;
            if (bArr3 != null) {
                this.f13395b.write(bArr3, 0, iUpdateRequest);
                this.f13396c = null;
                this.f13397d = 0;
            }
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }
}
