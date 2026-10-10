package com.kubi.margin.p099eu;

import com.kubi.sdk.base.entity.BaseEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p768xo.InterfaceC46305f;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EuMarginRiskAgreementManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.eu.EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1", m90122f = "EuMarginRiskAgreementManager.kt", m90123i = {}, m90124l = {59}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Boolean>, Object> {
    int label;

    public EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1(Continuation<? super EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Boolean> continuation) {
        return ((EuMarginRiskAgreementManager$fetchAgreementStatus$signed$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC46305f interfaceC46305fM38349l = EuMarginRiskAgreementManager.f33022a.m38349l();
            this.label = 1;
            obj = interfaceC46305fM38349l.m102083S(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(Intrinsics.areEqual(((BaseEntity) obj).getData(), Boxing.boxBoolean(true)));
    }
}
