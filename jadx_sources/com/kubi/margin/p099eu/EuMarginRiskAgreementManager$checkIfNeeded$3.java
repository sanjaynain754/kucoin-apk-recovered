package com.kubi.margin.p099eu;

import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EuMarginRiskAgreementManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.eu.EuMarginRiskAgreementManager$checkIfNeeded$3", m90122f = "EuMarginRiskAgreementManager.kt", m90123i = {}, m90124l = {52}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EuMarginRiskAgreementManager$checkIfNeeded$3 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseFragment $fragment;
    final /* synthetic */ Function0<Unit> $onPassed;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EuMarginRiskAgreementManager$checkIfNeeded$3(BaseFragment baseFragment, Function0<Unit> function0, Continuation<? super EuMarginRiskAgreementManager$checkIfNeeded$3> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
        this.$onPassed = function0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuMarginRiskAgreementManager$checkIfNeeded$3(this.$fragment, this.$onPassed, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EuMarginRiskAgreementManager$checkIfNeeded$3) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            EuMarginRiskAgreementManager euMarginRiskAgreementManager = EuMarginRiskAgreementManager.f33022a;
            BaseFragment baseFragment = this.$fragment;
            Function0<Unit> function0 = this.$onPassed;
            this.label = 1;
            if (euMarginRiskAgreementManager.m38348k(baseFragment, function0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
