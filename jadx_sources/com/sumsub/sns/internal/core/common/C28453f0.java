package com.sumsub.sns.internal.core.common;

import android.net.Uri;
import android.view.View;
import cf0.C4949d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.f0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28453f0 extends C4949d {
    @Override // cf0.C4949d, cf0.InterfaceC4948c
    public final void resolve(View view, String str) {
        try {
            super.resolve(view, str);
        } catch (Exception unused) {
            AbstractC28458h.m69345a(view.getContext(), Uri.parse(str));
        }
    }
}
