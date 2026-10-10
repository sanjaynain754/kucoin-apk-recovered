package com.sumsub.sentry;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.T */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C27895T {

    @NotNull
    public static final C27893S Companion = new C27893S();

    /* JADX INFO: renamed from: a */
    public final String f56972a;

    /* JADX INFO: renamed from: b */
    public final Integer f56973b;

    /* JADX INFO: renamed from: c */
    public final Integer f56974c;

    /* JADX INFO: renamed from: d */
    public final Integer f56975d;

    public /* synthetic */ C27895T(int i11, String str, Integer num, Integer num2, Integer num3) {
        if ((i11 & 1) == 0) {
            this.f56972a = null;
        } else {
            this.f56972a = str;
        }
        if ((i11 & 2) == 0) {
            this.f56973b = null;
        } else {
            this.f56973b = num;
        }
        if ((i11 & 4) == 0) {
            this.f56974c = null;
        } else {
            this.f56974c = num2;
        }
        if ((i11 & 8) == 0) {
            this.f56975d = null;
        } else {
            this.f56975d = num3;
        }
    }
}
