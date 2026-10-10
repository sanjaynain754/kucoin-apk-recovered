package com.kubi.core.biz.margininfo;

import p309hd.InterfaceC38170b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MarginInfoFragmentBase.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/base/setting/data/TradePanelModel;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.margininfo.MarginInfoFragmentBase$initObserver$3", m90122f = "MarginInfoFragmentBase.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginInfoFragmentBase$initObserver$3 extends SuspendLambda implements Function2<InterfaceC38170b, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginInfoFragmentBase this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC38170b interfaceC38170b, Continuation<? super Unit> continuation) {
        return ((MarginInfoFragmentBase$initObserver$3) create(interfaceC38170b, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginInfoFragmentBase$initObserver$3(MarginInfoFragmentBase marginInfoFragmentBase, Continuation<? super MarginInfoFragmentBase$initObserver$3> continuation) {
        super(2, continuation);
        this.this$0 = marginInfoFragmentBase;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginInfoFragmentBase$initObserver$3 marginInfoFragmentBase$initObserver$3 = new MarginInfoFragmentBase$initObserver$3(this.this$0, continuation);
        marginInfoFragmentBase$initObserver$3.L$0 = obj;
        return marginInfoFragmentBase$initObserver$3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC38170b interfaceC38170b = (InterfaceC38170b) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m21866k4(interfaceC38170b);
        return Unit.INSTANCE;
    }
}
