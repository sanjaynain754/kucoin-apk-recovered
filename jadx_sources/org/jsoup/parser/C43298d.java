package org.jsoup.parser;

import oh0.C43092b;
import org.jsoup.nodes.C43184b;

/* JADX INFO: renamed from: org.jsoup.parser.d */
/* JADX INFO: compiled from: ParseSettings.java */
/* JADX INFO: loaded from: classes61.dex */
public class C43298d {

    /* JADX INFO: renamed from: c */
    public static final C43298d f95484c = new C43298d(false, false);

    /* JADX INFO: renamed from: d */
    public static final C43298d f95485d = new C43298d(true, true);

    /* JADX INFO: renamed from: a */
    public final boolean f95486a;

    /* JADX INFO: renamed from: b */
    public final boolean f95487b;

    /* JADX INFO: renamed from: b */
    public C43184b m95185b(C43184b c43184b) {
        if (c43184b != null && !this.f95487b) {
            c43184b.m94933F();
        }
        return c43184b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m95187d() {
        return this.f95487b;
    }

    /* JADX INFO: renamed from: e */
    public boolean m95188e() {
        return this.f95486a;
    }

    public C43298d(boolean z11, boolean z12) {
        this.f95486a = z11;
        this.f95487b = z12;
    }

    /* JADX INFO: renamed from: a */
    public String m95184a(String str) {
        String strTrim = str.trim();
        if (!this.f95487b) {
            return C43092b.m94679a(strTrim);
        }
        return strTrim;
    }

    /* JADX INFO: renamed from: c */
    public String m95186c(String str) {
        String strTrim = str.trim();
        if (!this.f95486a) {
            return C43092b.m94679a(strTrim);
        }
        return strTrim;
    }
}
