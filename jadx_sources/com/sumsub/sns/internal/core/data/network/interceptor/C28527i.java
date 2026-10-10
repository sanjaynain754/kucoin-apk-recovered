package com.sumsub.sns.internal.core.data.network.interceptor;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.interceptor.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C28527i {

    @NotNull
    public static final C28526h Companion = new C28526h();

    /* JADX INFO: renamed from: a */
    public final String f58072a;

    /* JADX INFO: renamed from: b */
    public final String f58073b;

    public /* synthetic */ C28527i(int i11, String str, String str2) {
        if ((i11 & 1) == 0) {
            this.f58072a = null;
        } else {
            this.f58072a = str;
        }
        if ((i11 & 2) == 0) {
            this.f58073b = null;
        } else {
            this.f58073b = str2;
        }
    }
}
