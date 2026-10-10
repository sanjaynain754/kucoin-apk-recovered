package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27867E0 {

    @NotNull
    public static final C27865D0 Companion = new C27865D0();

    /* JADX INFO: renamed from: a */
    public final String f56913a;

    /* JADX INFO: renamed from: b */
    public final String f56914b;

    /* JADX INFO: renamed from: c */
    public final String f56915c;

    public /* synthetic */ C27867E0(int i11, String str, String str2, String str3) {
        if ((i11 & 1) == 0) {
            this.f56913a = null;
        } else {
            this.f56913a = str;
        }
        if ((i11 & 2) == 0) {
            this.f56914b = null;
        } else {
            this.f56914b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f56915c = null;
        } else {
            this.f56915c = str3;
        }
    }
}
