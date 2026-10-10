package io.noties.markwon.html.jsoup.parser;

/* JADX INFO: renamed from: io.noties.markwon.html.jsoup.parser.b */
/* JADX INFO: compiled from: ParseError.java */
/* JADX INFO: loaded from: classes60.dex */
public class C39214b {

    /* JADX INFO: renamed from: a */
    public int f87040a;

    /* JADX INFO: renamed from: b */
    public String f87041b;

    public C39214b(int i11, String str) {
        this.f87040a = i11;
        this.f87041b = str;
    }

    public String toString() {
        return this.f87040a + ": " + this.f87041b;
    }

    public C39214b(int i11, String str, Object... objArr) {
        this.f87041b = String.format(str, objArr);
        this.f87040a = i11;
    }
}
