package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27941f0 {

    @NotNull
    public static final C27937e0 Companion = new C27937e0();

    /* JADX INFO: renamed from: a */
    public final String f57069a;

    /* JADX INFO: renamed from: b */
    public final C27903X f57070b;

    public /* synthetic */ C27941f0(int i11, String str, C27903X c27903x) {
        if ((i11 & 1) == 0) {
            this.f57069a = null;
        } else {
            this.f57069a = str;
        }
        if ((i11 & 2) == 0) {
            this.f57070b = null;
        } else {
            this.f57070b = c27903x;
        }
    }

    public C27941f0(String str) {
        this.f57069a = str;
        this.f57070b = null;
    }
}
