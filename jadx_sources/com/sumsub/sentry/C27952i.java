package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27952i {

    @NotNull
    public static final C27948h Companion = new C27948h();

    /* JADX INFO: renamed from: a */
    public final String f57079a;

    /* JADX INFO: renamed from: b */
    public final String f57080b;

    public /* synthetic */ C27952i(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f57079a = null;
        } else {
            this.f57079a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57080b = null;
        } else {
            this.f57080b = str2;
        }
    }
}
