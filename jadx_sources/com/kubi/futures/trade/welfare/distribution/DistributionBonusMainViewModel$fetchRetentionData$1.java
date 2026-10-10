package com.kubi.futures.trade.welfare.distribution;

import com.kubi.kumex.data.market.model.DistributionRetentionEntity;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionBonusMainViewModel$fetchRetentionData$1", m90122f = "DistributionBonusMainDialog.kt", m90123i = {}, m90124l = {334}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nDistributionBonusMainDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DistributionBonusMainDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionBonusMainViewModel$fetchRetentionData$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n25#2:346\n26#2:348\n1#3:347\n*S KotlinDebug\n*F\n+ 1 DistributionBonusMainDialog.kt\ncom/kubi/futures/trade/welfare/distribution/DistributionBonusMainViewModel$fetchRetentionData$1\n*L\n336#1:346\n336#1:348\n336#1:347\n*E\n"})
public final class DistributionBonusMainViewModel$fetchRetentionData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    int label;
    final /* synthetic */ DistributionBonusMainViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.DistributionBonusMainViewModel$fetchRetentionData$1$1 */
    /* JADX INFO: compiled from: DistributionBonusMainDialog.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/kumex/data/market/model/DistributionRetentionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.distribution.DistributionBonusMainViewModel$fetchRetentionData$1$1", m90122f = "DistributionBonusMainDialog.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C142721 extends SuspendLambda implements Function2<DistributionRetentionEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DistributionBonusMainViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(DistributionRetentionEntity distributionRetentionEntity, Continuation<? super Unit> continuation) {
            return ((C142721) create(distributionRetentionEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142721(DistributionBonusMainViewModel distributionBonusMainViewModel, Continuation<? super C142721> continuation) {
            super(2, continuation);
            this.this$0 = distributionBonusMainViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C142721 c142721 = new C142721(this.this$0, continuation);
            c142721.L$0 = obj;
            return c142721;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DistributionRetentionEntity distributionRetentionEntity = (DistributionRetentionEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m28478u().postValue(new Pair<>(Boxing.boxBoolean(true), distributionRetentionEntity));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistributionBonusMainViewModel$fetchRetentionData$1(DistributionBonusMainViewModel distributionBonusMainViewModel, String str, Continuation<? super DistributionBonusMainViewModel$fetchRetentionData$1> continuation) {
        super(2, continuation);
        this.this$0 = distributionBonusMainViewModel;
        this.$code = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DistributionBonusMainViewModel$fetchRetentionData$1(this.this$0, this.$code, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((DistributionBonusMainViewModel$fetchRetentionData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        DistributionBonusMainViewModel$fetchRetentionData$1 distributionBonusMainViewModel$fetchRetentionData$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                distributionBonusMainViewModel$fetchRetentionData$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e<DistributionRetentionEntity> interfaceC41634eMo101249b = this.this$0.m28476t().mo101249b(this.$code);
            C142721 c142721 = new C142721(this.this$0, null);
            this.label = 1;
            distributionBonusMainViewModel$fetchRetentionData$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eMo101249b, false, c142721, distributionBonusMainViewModel$fetchRetentionData$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        DistributionBonusMainViewModel distributionBonusMainViewModel = distributionBonusMainViewModel$fetchRetentionData$1.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            distributionBonusMainViewModel.m28478u().postValue(new Pair<>(Boxing.boxBoolean(false), null));
        }
        return Unit.INSTANCE;
    }
}
