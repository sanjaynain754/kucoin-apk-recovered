package com.sumsub.sns.internal.features.data.model.prooface;

import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.prooface.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o
public final class C29828l {

    @NotNull
    public static final C29827k Companion = new C29827k();

    /* JADX INFO: renamed from: a */
    public final String f59906a;

    /* JADX INFO: renamed from: b */
    public final C29825i f59907b;

    public /* synthetic */ C29828l(int i11, String str, C29825i c29825i) {
        if ((i11 & 1) == 0) {
            this.f59906a = null;
        } else {
            this.f59906a = str;
        }
        if ((i11 & 2) == 0) {
            this.f59907b = null;
        } else {
            this.f59907b = c29825i;
        }
    }

    public C29828l(String str) {
        this.f59906a = str;
        this.f59907b = null;
    }
}
