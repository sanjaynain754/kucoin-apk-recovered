package com.kubi.tradebase.business.kyc;

import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.mine.api.service.IMineService;
import com.kubi.utils.extensions.C27041f;
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

/* JADX INFO: compiled from: KycViewModel.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.kyc.KycViewModel$fetchKycStatus$1", m90122f = "KycViewModel.kt", m90123i = {}, m90124l = {55}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KycViewModel$fetchKycStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KycViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.tradebase.business.kyc.KycViewModel$fetchKycStatus$1$1 */
    /* JADX INFO: compiled from: KycViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.tradebase.business.kyc.KycViewModel$fetchKycStatus$1$1", m90122f = "KycViewModel.kt", m90123i = {}, m90124l = {56}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C258781 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ KycViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C258781(KycViewModel kycViewModel, Continuation<? super C258781> continuation) {
            super(2, continuation);
            this.this$0 = kycViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C258781(this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C258781) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                IMineService iMineService = IMineService.f35025a.get();
                this.label = 1;
                obj = iMineService.mo41624g(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            KycStatusEntity kycStatusEntity = (KycStatusEntity) obj;
            if (kycStatusEntity == null) {
                return Unit.INSTANCE;
            }
            KycStyleType kycStyleType = KycStyleType.SUCCESS;
            if (!kycStyleType.equalString(C27041f.m66668h(kycStatusEntity.getDisplayType()))) {
                kycStyleType = KycStyleType.ERROR;
                if (!kycStyleType.equalString(C27041f.m66668h(kycStatusEntity.getDisplayType()))) {
                    KycStyleType kycStyleType2 = KycStyleType.WARN;
                    if (kycStyleType2.equalString(C27041f.m66668h(kycStatusEntity.getDisplayType()))) {
                        kycStyleType = kycStyleType2;
                    }
                }
            }
            this.this$0.f51544W.postValue(kycStyleType);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycViewModel$fetchKycStatus$1(KycViewModel kycViewModel, Continuation<? super KycViewModel$fetchKycStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = kycViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KycViewModel$fetchKycStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KycViewModel$fetchKycStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C258781 c258781 = new C258781(this.this$0, null);
            this.label = 1;
            if (C41686h.m91049g(abstractC41697j0M94120b, c258781, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
