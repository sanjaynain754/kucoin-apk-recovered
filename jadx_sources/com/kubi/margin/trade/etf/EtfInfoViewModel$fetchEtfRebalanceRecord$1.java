package com.kubi.margin.trade.etf;

import com.kubi.data.entity.EtfRebalanceRecord;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.utils.extensions.C27024b;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p698vp.C45611a;
import p768xo.InterfaceC46301b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: EtfInfoViewModel.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.etf.EtfInfoViewModel$fetchEtfRebalanceRecord$1", m90122f = "EtfInfoViewModel.kt", m90123i = {}, m90124l = {48}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nEtfInfoViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtfInfoViewModel.kt\ncom/kubi/margin/trade/etf/EtfInfoViewModel$fetchEtfRebalanceRecord$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n25#2:53\n26#2:55\n1#3:54\n*S KotlinDebug\n*F\n+ 1 EtfInfoViewModel.kt\ncom/kubi/margin/trade/etf/EtfInfoViewModel$fetchEtfRebalanceRecord$1\n*L\n49#1:53\n49#1:55\n49#1:54\n*E\n"})
public final class EtfInfoViewModel$fetchEtfRebalanceRecord$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ EtfInfoViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.margin.trade.etf.EtfInfoViewModel$fetchEtfRebalanceRecord$1$1 */
    /* JADX INFO: compiled from: EtfInfoViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/data/entity/EtfRebalanceRecord;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.margin.trade.etf.EtfInfoViewModel$fetchEtfRebalanceRecord$1$1", m90122f = "EtfInfoViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C183161 extends SuspendLambda implements Function2<BasePageEntity<EtfRebalanceRecord>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ EtfInfoViewModel this$0;

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(BasePageEntity<EtfRebalanceRecord> basePageEntity, Continuation<? super Unit> continuation) {
            return ((C183161) create(basePageEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C183161(EtfInfoViewModel etfInfoViewModel, Continuation<? super C183161> continuation) {
            super(2, continuation);
            this.this$0 = etfInfoViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C183161 c183161 = new C183161(this.this$0, continuation);
            c183161.L$0 = obj;
            return c183161;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            BasePageEntity basePageEntity = (BasePageEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.m40307r().postValue(C45611a.m100694a(C27024b.m66560c(basePageEntity.getItems()), 0, 2));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtfInfoViewModel$fetchEtfRebalanceRecord$1(EtfInfoViewModel etfInfoViewModel, Continuation<? super EtfInfoViewModel$fetchEtfRebalanceRecord$1> continuation) {
        super(2, continuation);
        this.this$0 = etfInfoViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EtfInfoViewModel$fetchEtfRebalanceRecord$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((EtfInfoViewModel$fetchEtfRebalanceRecord$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            InterfaceC41634e<BasePageEntity<EtfRebalanceRecord>> interfaceC41634eM102058c = ((InterfaceC46301b) RetrofitFlowExKt.m42820a(InterfaceC46301b.class)).m102058c(this.this$0.m40305p().getValue());
            C183161 c183161 = new C183161(this.this$0, null);
            this.label = 1;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM102058c, false, c183161, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            C44128b.m97264h(throwable);
        }
        return Unit.INSTANCE;
    }
}
