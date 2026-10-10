package com.kubi.futures.guide;

import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: DistributionStepGuide.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.guide.DistributionStepGuide$showGuide$1", m90122f = "DistributionStepGuide.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DistributionStepGuide$showGuide$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DistributionStepGuide this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributionStepGuide$showGuide$1(DistributionStepGuide distributionStepGuide, Continuation<? super DistributionStepGuide$showGuide$1> continuation) {
        super(2, continuation);
        this.this$0 = distributionStepGuide;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DistributionStepGuide$showGuide$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DistributionStepGuide$showGuide$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
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
            if (this.this$0.f23062e != null) {
                DistributionStepGuide distributionStepGuide = this.this$0;
                BaseFragment f23059b = distributionStepGuide.getF23059b();
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = this.this$0.f23062e;
                this.label = 1;
                obj = distributionStepGuide.m25581d(f23059b, futuresWelfareTrialItemEntity, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.getF23061d().run();
            }
            return Unit.INSTANCE;
        }
        if (((Boolean) obj).booleanValue()) {
            this.this$0.getF23061d().run();
        }
        return Unit.INSTANCE;
    }
}
