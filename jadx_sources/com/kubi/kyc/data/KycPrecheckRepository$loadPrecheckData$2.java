package com.kubi.kyc.data;

import com.kubi.kyc.api.KycInfoEntity;
import com.kubi.kyc.data.entity.KycClearInfoEntity;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KycPrecheckRepository.kt */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kyc/data/KycPrecheckData;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kyc.data.KycPrecheckRepository$loadPrecheckData$2", m90122f = "KycPrecheckRepository.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {19, 20}, m90125m = "invokeSuspend", m90126n = {"$this$withContext", "kycInfoDeferred", "clearInfoDeferred", "$this$withContext", "kycInfoDeferred", "clearInfoDeferred"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class KycPrecheckRepository$loadPrecheckData$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super KycPrecheckData>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ KycPrecheckRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycPrecheckRepository$loadPrecheckData$2(KycPrecheckRepository kycPrecheckRepository, Continuation<? super KycPrecheckRepository$loadPrecheckData$2> continuation) {
        super(2, continuation);
        this.this$0 = kycPrecheckRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        KycPrecheckRepository$loadPrecheckData$2 kycPrecheckRepository$loadPrecheckData$2 = new KycPrecheckRepository$loadPrecheckData$2(this.this$0, continuation);
        kycPrecheckRepository$loadPrecheckData$2.L$0 = obj;
        return kycPrecheckRepository$loadPrecheckData$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super KycPrecheckData> continuation) {
        return ((KycPrecheckRepository$loadPrecheckData$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41729r0 interfaceC41729r0M91102b;
        InterfaceC41729r0 interfaceC41729r0;
        KycInfoEntity kycInfoEntity;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41729r0M91102b = (InterfaceC41729r0) this.L$2;
                interfaceC41729r0 = (InterfaceC41729r0) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kycInfoEntity = (KycInfoEntity) this.L$3;
                ResultKt.throwOnFailure(obj);
            }
            return new KycPrecheckData(kycInfoEntity, (KycClearInfoEntity) obj);
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(interfaceC41709m0, null, null, new KycPrecheckRepository$loadPrecheckData$2$kycInfoDeferred$1(this.this$0, null), 3, null);
        interfaceC41729r0M91102b = C41696j.m91102b(interfaceC41709m0, null, null, new KycPrecheckRepository$loadPrecheckData$2$clearInfoDeferred$1(this.this$0, null), 3, null);
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b2);
        this.L$2 = interfaceC41729r0M91102b;
        this.label = 1;
        Object objMo91198h = interfaceC41729r0M91102b2.mo91198h(this);
        if (objMo91198h != coroutine_suspended) {
            interfaceC41729r0 = interfaceC41729r0M91102b2;
            obj = objMo91198h;
        }
        return coroutine_suspended;
        KycInfoEntity kycInfoEntity2 = (KycInfoEntity) obj;
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        this.L$3 = kycInfoEntity2;
        this.label = 2;
        Object objMo91198h2 = interfaceC41729r0M91102b.mo91198h(this);
        if (objMo91198h2 != coroutine_suspended) {
            kycInfoEntity = kycInfoEntity2;
            obj = objMo91198h2;
            return new KycPrecheckData(kycInfoEntity, (KycClearInfoEntity) obj);
        }
        return coroutine_suspended;
    }
}
