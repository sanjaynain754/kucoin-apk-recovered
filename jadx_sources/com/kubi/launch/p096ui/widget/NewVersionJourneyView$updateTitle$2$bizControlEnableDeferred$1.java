package com.kubi.launch.p096ui.widget;

import com.kubi.app.bizcontrol.BizControlLoader;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: NewVersionJourneyView.kt */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.ui.widget.NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1", m90122f = "NewVersionJourneyView.kt", m90123i = {}, m90124l = {320}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    final /* synthetic */ BizControlLoader $bizControlLoader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1(BizControlLoader bizControlLoader, Continuation<? super NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1> continuation) {
        super(2, continuation);
        this.$bizControlLoader = bizControlLoader;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1(this.$bizControlLoader, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((NewVersionJourneyView$updateTitle$2$bizControlEnableDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BizControlLoader bizControlLoader = this.$bizControlLoader;
        this.label = 1;
        Object objM14987b = bizControlLoader.m14987b(this);
        if (objM14987b == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM14987b;
    }
}
