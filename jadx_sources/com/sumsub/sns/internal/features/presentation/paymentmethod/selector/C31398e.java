package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import androidx.fragment.app.FragmentViewModelLazyKt;
import p852kotlin.Lazy;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31398e extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lazy f63622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31398e(Lazy lazy) {
        super(0);
        this.f63622a = lazy;
    }

    @Override // p852kotlin.jvm.functions.Function0
    public final Object invoke() {
        return FragmentViewModelLazyKt.m103549viewModels$lambda1(this.f63622a).getViewModelStore();
    }
}
