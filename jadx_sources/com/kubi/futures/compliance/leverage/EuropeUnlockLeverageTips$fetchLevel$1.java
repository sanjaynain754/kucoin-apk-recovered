package com.kubi.futures.compliance.leverage;

import dm.C36760f2;
import java.util.List;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EuropeUnlockLeverageTips.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$fetchLevel$1", m90122f = "EuropeUnlockLeverageTips.kt", m90123i = {}, m90124l = {75}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EuropeUnlockLeverageTips$fetchLevel$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ C36760f2 $binding;
    int label;
    final /* synthetic */ EuropeUnlockLeverageTips this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuropeUnlockLeverageTips$fetchLevel$1(EuropeUnlockLeverageTips europeUnlockLeverageTips, C36760f2 c36760f2, Continuation<? super EuropeUnlockLeverageTips$fetchLevel$1> continuation) {
        super(2, continuation);
        this.this$0 = europeUnlockLeverageTips;
        this.$binding = c36760f2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuropeUnlockLeverageTips$fetchLevel$1(this.this$0, this.$binding, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EuropeUnlockLeverageTips$fetchLevel$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            EuropeUnlockLeverageTips$fetchLevel$1$list$1 europeUnlockLeverageTips$fetchLevel$1$list$1 = new EuropeUnlockLeverageTips$fetchLevel$1$list$1(null);
            this.label = 1;
            obj = C41686h.m91049g(abstractC41697j0M94120b, europeUnlockLeverageTips$fetchLevel$1$list$1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.this$0.m24679j((List) obj, this.$binding);
        return Unit.INSTANCE;
    }
}
