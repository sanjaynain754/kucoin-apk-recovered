package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31343s0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSAppActivity f63532a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31343s0(SNSAppActivity sNSAppActivity) {
        super(0);
        this.f63532a = sNSAppActivity;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f63532a.getMViewModelStore();
    }
}
