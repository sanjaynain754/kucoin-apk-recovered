package com.kubi.futures.trade.welfare.distribution;

import android.text.TextUtils;
import android.view.View;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DistributionManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionManager$checkNeedDistribution$2", m90122f = "DistributionManager.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DistributionManager$checkNeedDistribution$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseFragment $fragment;
    int label;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionManager$checkNeedDistribution$2$1 */
    /* JADX INFO: compiled from: DistributionManager.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionManager$checkNeedDistribution$2$1", m90122f = "DistributionManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nDistributionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionManager.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionManager$checkNeedDistribution$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,78:1\n1#2:79\n*E\n"})
    public static final class C142851 extends SuspendLambda implements Function2<FuturesWelfareTrialItemEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseFragment $fragment;
        /* synthetic */ Object L$0;
        int label;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, Continuation<? super Unit> continuation) {
            return ((C142851) create(futuresWelfareTrialItemEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142851(BaseFragment baseFragment, Continuation<? super C142851> continuation) {
            super(2, continuation);
            this.$fragment = baseFragment;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142851 c142851 = new C142851(this.$fragment, continuation);
            c142851.L$0 = obj;
            return c142851;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (futuresWelfareTrialItemEntity == null || TextUtils.isEmpty(futuresWelfareTrialItemEntity.getCode())) {
                return Unit.INSTANCE;
            }
            if (DistributionManager.f24703a.m28551f(this.$fragment) && BrokerConfig.f19211a.m20201d().mo20229O()) {
                View view = this.$fragment.getView();
                if (view != null) {
                    GuideHelper.f29155a.m33891w(view, futuresWelfareTrialItemEntity);
                }
            } else {
                DistributionManager.f24704b = futuresWelfareTrialItemEntity;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributionManager$checkNeedDistribution$2(BaseFragment baseFragment, Continuation<? super DistributionManager$checkNeedDistribution$2> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DistributionManager$checkNeedDistribution$2(this.$fragment, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DistributionManager$checkNeedDistribution$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            InterfaceC41634e<FuturesWelfareTrialItemEntity> interfaceC41634eMo100562k = RepositoryServiceLocator.f19236a.m20292k().mo100562k();
            C142851 c142851 = new C142851(this.$fragment, null);
            this.label = 1;
            if (RetrofitFlowExKt.m42823d(interfaceC41634eMo100562k, false, c142851, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
