package org.jsoup.parser;

/* JADX INFO: renamed from: org.jsoup.parser.c */
/* JADX INFO: compiled from: ParseError.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43297c {

    /* JADX INFO: renamed from: a */
    public int f95482a;

    /* JADX INFO: renamed from: b */
    public String f95483b;

    public C43297c(int i11, String str) {
        this.f95482a = i11;
        this.f95483b = str;
    }

    public String toString() {
        return this.f95482a + ": " + this.f95483b;
    }

    public C43297c(int i11, String str, Object... objArr) {
        this.f95483b = String.format(str, objArr);
        this.f95482a = i11;
    }
}
