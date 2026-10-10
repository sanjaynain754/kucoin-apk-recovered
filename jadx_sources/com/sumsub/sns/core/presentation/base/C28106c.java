package com.sumsub.sns.core.presentation.base;

import p852kotlin.Unit;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.c */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28106c extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public C28106c(AbstractActivityC28115f abstractActivityC28115f) {
        super(2, abstractActivityC28115f, AbstractActivityC28115f.class, "handleEvent", "handleEvent(Lcom/sumsub/sns/core/presentation/base/SNSBaseViewModel$SNSViewModelEvent;)V", 4);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AbstractActivityC28115f) this.receiver).mo69075a((InterfaceC28145r) obj);
        return Unit.INSTANCE;
    }
}
