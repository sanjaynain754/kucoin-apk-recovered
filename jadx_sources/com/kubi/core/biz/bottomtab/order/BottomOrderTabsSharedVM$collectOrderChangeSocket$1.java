package com.kubi.core.biz.bottomtab.order;

import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BottomOrderTabsSharedVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.BottomOrderTabsSharedVM$collectOrderChangeSocket$1", m90122f = "BottomOrderTabsSharedVM.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BottomOrderTabsSharedVM$collectOrderChangeSocket$1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BottomOrderTabsSharedVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrderTabsSharedVM$collectOrderChangeSocket$1(BottomOrderTabsSharedVM bottomOrderTabsSharedVM, Continuation<? super BottomOrderTabsSharedVM$collectOrderChangeSocket$1> continuation) {
        super(2, continuation);
        this.this$0 = bottomOrderTabsSharedVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BottomOrderTabsSharedVM$collectOrderChangeSocket$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
        return ((BottomOrderTabsSharedVM$collectOrderChangeSocket$1) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m21419z();
            this.this$0.f20217X.mo90855d(new InterfaceC11746a.a());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
