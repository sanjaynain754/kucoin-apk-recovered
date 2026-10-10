package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.h1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27950h1 {

    @NotNull
    public static final C27946g1 Companion = new C27946g1();

    /* JADX INFO: renamed from: a */
    public final String f57075a;

    /* JADX INFO: renamed from: b */
    public String f57076b;

    /* JADX INFO: renamed from: c */
    public final String f57077c;

    /* JADX INFO: renamed from: d */
    public final String f57078d;

    public /* synthetic */ C27950h1(int i11, String str, String str2, String str3, String str4) {
        if ((i11 & 1) == 0) {
            this.f57075a = null;
        } else {
            this.f57075a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57076b = null;
        } else {
            this.f57076b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f57077c = null;
        } else {
            this.f57077c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f57078d = null;
        } else {
            this.f57078d = str4;
        }
    }

    public C27950h1(String str, int i11) {
        this.f57075a = (i11 & 1) != 0 ? null : str;
        this.f57076b = null;
        this.f57077c = null;
        this.f57078d = null;
    }
}
