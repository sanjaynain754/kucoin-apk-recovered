package com.jumio.ale.swig;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes56.dex */
public class ALEInputStream extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final ALERequest f13387a;

    /* JADX INFO: renamed from: b */
    public final InputStream f13388b;

    /* JADX INFO: renamed from: c */
    public final byte[] f13389c;

    /* JADX INFO: renamed from: d */
    public boolean f13390d;

    /* JADX INFO: renamed from: e */
    public byte[] f13391e;

    /* JADX INFO: renamed from: f */
    public int f13392f;

    /* JADX INFO: renamed from: g */
    public int f13393g;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return this.f13393g - this.f13392f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13388b.close();
        try {
            if (!this.f13390d) {
                this.f13387a.finishResponse();
            }
            this.f13392f = 0;
            this.f13393g = 0;
        } catch (Exception e11) {
            throw new IOException(e11);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int iUpdateResponse;
        if (this.f13392f >= this.f13393g) {
            int i13 = 0;
            while (i13 == 0) {
                if (this.f13390d) {
                    i13 = -1;
                } else {
                    i13 = this.f13388b.read(this.f13389c);
                    if (i13 == -1) {
                        this.f13390d = true;
                        try {
                            this.f13387a.finishResponse();
                        } catch (Exception e11) {
                            throw new IOException(e11);
                        }
                    } else {
                        try {
                            byte[] bArr2 = this.f13389c;
                            if (i13 != bArr2.length) {
                                byte[] bArr3 = new byte[i13];
                                System.arraycopy(bArr2, 0, bArr3, 0, i13);
                                byte[] bArr4 = new byte[i13 + 32];
                                this.f13391e = bArr4;
                                iUpdateResponse = this.f13387a.updateResponse(bArr3, bArr4);
                            } else {
                                byte[] bArr5 = new byte[bArr2.length + 32];
                                this.f13391e = bArr5;
                                iUpdateResponse = this.f13387a.updateResponse(bArr2, bArr5);
                            }
                            this.f13392f = 0;
                            if (this.f13391e == null) {
                                this.f13393g = 0;
                            } else {
                                this.f13393g = iUpdateResponse;
                            }
                            i13 = this.f13393g;
                        } catch (Exception e12) {
                            this.f13391e = null;
                            throw new IOException(e12);
                        }
                    }
                }
            }
            if (i13 == -1) {
                return -1;
            }
        }
        if (i12 <= 0) {
            return 0;
        }
        int i14 = this.f13393g;
        int i15 = this.f13392f;
        int i16 = i14 - i15;
        if (i12 >= i16) {
            i12 = i16;
        }
        if (bArr != null) {
            System.arraycopy(this.f13391e, i15, bArr, i11, i12);
        }
        this.f13392f += i12;
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) throws IOException {
        int i11 = this.f13393g;
        int i12 = this.f13392f;
        long j12 = i11 - i12;
        if (j11 > j12) {
            j11 = j12;
        }
        if (j11 < 0) {
            return 0L;
        }
        this.f13392f = (int) (((long) i12) + j11);
        return j11;
    }

    public ALEInputStream(InputStream inputStream, ALERequest aLERequest) {
        super(inputStream);
        this.f13389c = new byte[512];
        this.f13390d = false;
        this.f13392f = 0;
        this.f13393g = 0;
        this.f13388b = inputStream;
        this.f13387a = aLERequest;
        aLERequest.initResponse();
    }
}
