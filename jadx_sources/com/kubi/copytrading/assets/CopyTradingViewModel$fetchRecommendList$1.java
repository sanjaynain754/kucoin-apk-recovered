package com.kubi.copytrading.assets;

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

/* JADX INFO: compiled from: CopyTradingViewModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.assets.CopyTradingViewModel$fetchRecommendList$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nCopyTradingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel$fetchRecommendList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n25#2:96\n26#2:98\n1#3:97\n*S KotlinDebug\n*F\n+ 1 CopyTradingViewModel.kt\ncom/kubi/copytrading/assets/CopyTradingViewModel$fetchRecommendList$1\n*L\n53#1:96\n53#1:98\n53#1:97\n*E\n"})
public final class CopyTradingViewModel$fetchRecommendList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ LeadTradingItemRequestEntity $leadTradingItemRequestEntity;
    int label;
    final /* synthetic */ CopyTradingViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.copytrading.assets.CopyTradingViewModel$fetchRecommendList$1$1 */
    /* JADX INFO: compiled from: CopyTradingViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/copytrading/assets/LeadTradingEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.copytrading.assets.CopyTradingViewModel$fetchRecommendList$1$1", m90122f = "CopyTradingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C114471 extends SuspendLambda implements Function2<LeadTradingEntity, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CopyTradingViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(LeadTradingEntity leadTradingEntity, Continuation<? super Unit> continuation) {
            return ((C114471) create(leadTradingEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114471(CopyTradingViewModel copyTradingViewModel, Continuation<? super C114471> continuation) {
            super(2, continuation);
            this.this$0 = copyTradingViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C114471 c114471 = new C114471(this.this$0, continuation);
            c114471.L$0 = obj;
            return c114471;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LeadTradingEntity leadTradingEntity = (LeadTradingEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m20648B().setValue(new Pair<>(Boxing.boxBoolean(true), leadTradingEntity != null ? leadTradingEntity.getItems() : null));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingViewModel$fetchRecommendList$1(CopyTradingViewModel copyTradingViewModel, LeadTradingItemRequestEntity leadTradingItemRequestEntity, Continuation<? super CopyTradingViewModel$fetchRecommendList$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingViewModel;
        this.$leadTradingItemRequestEntity = leadTradingItemRequestEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingViewModel$fetchRecommendList$1(this.this$0, this.$leadTradingItemRequestEntity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CopyTradingViewModel$fetchRecommendList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<LeadTradingEntity> interfaceC41634eM20663d = this.this$0.m20655v().m20663d(this.$leadTradingItemRequestEntity);
            C114471 c114471 = new C114471(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42823d(interfaceC41634eM20663d, false, c114471, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CopyTradingViewModel copyTradingViewModel = this.this$0;
        if (((C19334f) obj).getThrowable() != null) {
            copyTradingViewModel.m20648B().setValue(new Pair<>(Boxing.boxBoolean(false), null));
        }
        return Unit.INSTANCE;
    }
}
