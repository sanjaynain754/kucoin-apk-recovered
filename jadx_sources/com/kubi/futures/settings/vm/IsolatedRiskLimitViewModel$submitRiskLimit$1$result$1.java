package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import ug.InterfaceC45234c;

/* JADX INFO: compiled from: IsolatedRiskLimitViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1", m90122f = "IsolatedRiskLimitViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ int $level;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1(boolean z11, String str, int i11, Continuation<? super IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1> continuation) {
        super(1, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$level = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1(this.$isTrial, this.$symbol, this.$level, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((IsolatedRiskLimitViewModel$submitRiskLimit$1$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC45234c.m99946P(MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null), this.$isTrial, this.$symbol, this.$level, null, 8, null);
            return Boxing.boxBoolean(true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
