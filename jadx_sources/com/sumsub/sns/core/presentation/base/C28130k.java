package com.sumsub.sns.core.presentation.base;

import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.SuspendFunction;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.AdaptedFunctionReference;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final /* synthetic */ class C28130k extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public C28130k(AbstractC28133l abstractC28133l) {
        super(2, abstractC28133l, AbstractC28133l.class, "handleEvent", "handleEvent(Lcom/sumsub/sns/core/presentation/base/SNSBaseViewModel$SNSViewModelEvent;)V", 4);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return AbstractC28133l.access$onViewCreated$handleEvent((AbstractC28133l) this.receiver, (InterfaceC28145r) obj, (Continuation) obj2);
    }
}
