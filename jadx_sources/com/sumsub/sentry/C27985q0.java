package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.q0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27985q0 {

    @NotNull
    public static final C27981p0 Companion = new C27981p0();

    /* JADX INFO: renamed from: a */
    public final String f57118a;

    /* JADX INFO: renamed from: b */
    public final String f57119b;

    /* JADX INFO: renamed from: c */
    public final String f57120c;

    /* JADX INFO: renamed from: d */
    public final Long f57121d;

    /* JADX INFO: renamed from: e */
    public final C27885N0 f57122e;

    /* JADX INFO: renamed from: f */
    public final C27876J f57123f;

    public /* synthetic */ C27985q0(int i11, String str, String str2, String str3, Long l11, C27885N0 c27885n0, C27876J c27876j) {
        if ((i11 & 1) == 0) {
            this.f57118a = null;
        } else {
            this.f57118a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57119b = null;
        } else {
            this.f57119b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f57120c = null;
        } else {
            this.f57120c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f57121d = null;
        } else {
            this.f57121d = l11;
        }
        if ((i11 & 16) == 0) {
            this.f57122e = null;
        } else {
            this.f57122e = c27885n0;
        }
        if ((i11 & 32) == 0) {
            this.f57123f = null;
        } else {
            this.f57123f = c27876j;
        }
    }

    public C27985q0(String str, String str2, String str3, Long l11, C27885N0 c27885n0, C27876J c27876j) {
        this.f57118a = str;
        this.f57119b = str2;
        this.f57120c = str3;
        this.f57121d = l11;
        this.f57122e = c27885n0;
        this.f57123f = c27876j;
    }
}
