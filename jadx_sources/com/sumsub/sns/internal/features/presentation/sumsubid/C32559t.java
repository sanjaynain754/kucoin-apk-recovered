package com.sumsub.sns.internal.features.presentation.sumsubid;

import com.sumsub.sns.core.presentation.base.InterfaceC28077Q;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C32559t extends FunctionReferenceImpl implements Function1 {
    public C32559t(C32487O0 c32487o0) {
        super(1, c32487o0, C32487O0.class, "intent", "intent(Lcom/sumsub/sns/core/presentation/base/SNSViewModel$SNSViewModelIntent;)V", 0);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((C32487O0) this.receiver).intent((InterfaceC28077Q) obj);
        return Unit.INSTANCE;
    }
}
