package com.kubi.futures.compliance.leverage;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelTaskEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.utils.extensions.C27025c;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: EuropeUnlockLeverageTips.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$fetchLevel$1$list$1", m90122f = "EuropeUnlockLeverageTips.kt", m90123i = {1}, m90124l = {76, 80}, m90125m = "invokeSuspend", m90126n = {FirebaseAnalytics.Param.LEVEL}, m90127s = {"L$0"})
public final class EuropeUnlockLeverageTips$fetchLevel$1$list$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends EuropeUnlockLeverageLevelTaskEntity>>, Object> {
    Object L$0;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$fetchLevel$1$list$1$1 */
    /* JADX INFO: compiled from: EuropeUnlockLeverageTips.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelTaskEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageTips$fetchLevel$1$list$1$1", m90122f = "EuropeUnlockLeverageTips.kt", m90123i = {}, m90124l = {81}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C128871 extends SuspendLambda implements Function1<Continuation<? super List<? extends EuropeUnlockLeverageLevelTaskEntity>>, Object> {
        int label;

        public C128871(Continuation<? super C128871> continuation) {
            super(1, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends EuropeUnlockLeverageLevelTaskEntity>> continuation) {
            return invoke2((Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>>) continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C128871(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>> continuation) {
            return ((C128871) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
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
            IComplianceService iComplianceService = IComplianceService.f22675a.get();
            this.label = 1;
            Object objMo97158a = iComplianceService.mo97158a(this);
            if (objMo97158a == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objMo97158a;
        }
    }

    public EuropeUnlockLeverageTips$fetchLevel$1$list$1(Continuation<? super EuropeUnlockLeverageTips$fetchLevel$1$list$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends EuropeUnlockLeverageLevelTaskEntity>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>>) continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EuropeUnlockLeverageTips$fetchLevel$1$list$1(continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<EuropeUnlockLeverageLevelTaskEntity>> continuation) {
        return ((EuropeUnlockLeverageTips$fetchLevel$1$list$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Boolean guide;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) obj;
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            return list;
        }
        ResultKt.throwOnFailure(obj);
        EuropeUnlockLeverageTips$fetchLevel$1$list$1$level$1 europeUnlockLeverageTips$fetchLevel$1$list$1$level$1 = new EuropeUnlockLeverageTips$fetchLevel$1$list$1$level$1(null);
        this.label = 1;
        obj = CoroutineExKt.m36472b(europeUnlockLeverageTips$fetchLevel$1$list$1$level$1, null, this, 2, null);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        EuropeUnlockLeverageLevelEntity europeUnlockLeverageLevelEntity = (EuropeUnlockLeverageLevelEntity) obj;
        if (europeUnlockLeverageLevelEntity != null) {
            guide = europeUnlockLeverageLevelEntity.getGuide();
        } else {
            guide = null;
        }
        if (C27025c.m66566d(guide)) {
            C128871 c128871 = new C128871(null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(europeUnlockLeverageLevelEntity);
            this.label = 2;
            obj = CoroutineExKt.m36472b(c128871, null, this, 2, null);
        } else {
            return CollectionsKt.emptyList();
        }
    }
}
