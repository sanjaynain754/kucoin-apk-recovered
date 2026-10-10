package com.kubi.futures.compliance.leverage;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh.EuropeUnlockLeverageBonusEntity;

/* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1 */
/* JADX INFO: compiled from: EuropeTrialSimulationOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1", m90122f = "EuropeTrialSimulationOrderViewModel.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nEuropeTrialSimulationOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EuropeTrialSimulationOrderViewModel.kt\ncom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n25#2:79\n26#2:81\n1#3:80\n*S KotlinDebug\n*F\n+ 1 EuropeTrialSimulationOrderViewModel.kt\ncom/kubi/futures/compliance/leverage/EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1\n*L\n73#1:79\n73#1:81\n73#1:80\n*E\n"})
public final class C12880x12821da1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EuropeTrialSimulationOrderViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: EuropeTrialSimulationOrderViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageBonusEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeTrialSimulationOrderViewModel$fetchEuropeUnlockLeverageTrial$1$1", m90122f = "EuropeTrialSimulationOrderViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<EuropeUnlockLeverageBonusEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EuropeTrialSimulationOrderViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = europeTrialSimulationOrderViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(EuropeUnlockLeverageBonusEntity europeUnlockLeverageBonusEntity, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(europeUnlockLeverageBonusEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EuropeUnlockLeverageBonusEntity europeUnlockLeverageBonusEntity = (EuropeUnlockLeverageBonusEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m24615v().postValue(new Pair<>(europeUnlockLeverageBonusEntity, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12880x12821da1(EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModel, Continuation<? super C12880x12821da1> continuation) {
        super(2, continuation);
        this.this$0 = europeTrialSimulationOrderViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C12880x12821da1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((C12880x12821da1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C12880x12821da1 c12880x12821da1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                c12880x12821da1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90915g(IComplianceService.f22675a.get().mo97161d()), C42911a.m94120b());
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            c12880x12821da1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, anonymousClass1, c12880x12821da1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        EuropeTrialSimulationOrderViewModel europeTrialSimulationOrderViewModel = c12880x12821da1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            europeTrialSimulationOrderViewModel.m24615v().postValue(new Pair<>(null, throwable));
        }
        return Unit.INSTANCE;
    }
}
