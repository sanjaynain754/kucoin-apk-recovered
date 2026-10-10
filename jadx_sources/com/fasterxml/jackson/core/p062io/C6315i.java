package com.fasterxml.jackson.core.p062io;

import com.fasterxml.jackson.core.util.C6322a;
import com.fasterxml.jackson.core.util.C6330i;
import java.io.Writer;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.io.i */
/* JADX INFO: compiled from: SegmentedStringWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6315i extends Writer {

    /* JADX INFO: renamed from: b */
    public final C6330i f10112b;

    @Override // java.io.Writer
    public void write(char[] cArr) {
        this.f10112b.m11097c(cArr, 0, cArr.length);
    }

    /* JADX INFO: renamed from: a */
    public String m11046a() {
        String strM11106l = this.f10112b.m11106l();
        this.f10112b.m11117x();
        return strM11106l;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        this.f10112b.m11097c(cArr, i11, i12);
    }

    public C6315i(C6322a c6322a) {
        this.f10112b = new C6330i(c6322a);
    }

    @Override // java.io.Writer
    public void write(int i11) {
        this.f10112b.m11095a((char) i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) {
        write(c11);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        this.f10112b.m11096b(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        String string = charSequence.toString();
        this.f10112b.m11096b(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i11, int i12) {
        this.f10112b.m11096b(str, i11, i12);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i11, int i12) {
        String string = charSequence.subSequence(i11, i12).toString();
        this.f10112b.m11096b(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}
