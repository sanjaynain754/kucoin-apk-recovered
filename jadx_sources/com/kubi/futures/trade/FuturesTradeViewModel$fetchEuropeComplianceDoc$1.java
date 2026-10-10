package com.kubi.futures.trade;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sh.EuropeComplianceSymbolDocEntity;

/* JADX INFO: compiled from: FuturesTradeViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeViewModel$fetchEuropeComplianceDoc$1", m90122f = "FuturesTradeViewModel.kt", m90123i = {}, m90124l = {558}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFuturesTradeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModel$fetchEuropeComplianceDoc$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,596:1\n25#2:597\n26#2:599\n1#3:598\n*S KotlinDebug\n*F\n+ 1 FuturesTradeViewModel.kt\ncom/kubi/futures/trade/FuturesTradeViewModel$fetchEuropeComplianceDoc$1\n*L\n562#1:597\n562#1:599\n562#1:598\n*E\n"})
public final class FuturesTradeViewModel$fetchEuropeComplianceDoc$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ FuturesTradeViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.trade.FuturesTradeViewModel$fetchEuropeComplianceDoc$1$1 */
    /* JADX INFO: compiled from: FuturesTradeViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/futures/data/compliance/entity/EuropeComplianceSymbolDocEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesTradeViewModel$fetchEuropeComplianceDoc$1$1", m90122f = "FuturesTradeViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C136081 extends SuspendLambda implements Function2<EuropeComplianceSymbolDocEntity, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $symbol;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FuturesTradeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136081(String str, FuturesTradeViewModel futuresTradeViewModel, Continuation<? super C136081> continuation) {
            super(2, continuation);
            this.$symbol = str;
            this.this$0 = futuresTradeViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C136081 c136081 = new C136081(this.$symbol, this.this$0, continuation);
            c136081.L$0 = obj;
            return c136081;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(EuropeComplianceSymbolDocEntity europeComplianceSymbolDocEntity, Continuation<? super Unit> continuation) {
            return ((C136081) create(europeComplianceSymbolDocEntity, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            EuropeComplianceSymbolDocEntity europeComplianceSymbolDocEntity = (EuropeComplianceSymbolDocEntity) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            europeComplianceSymbolDocEntity.m97957l(this.$symbol);
            this.this$0.m26693e1().postValue(europeComplianceSymbolDocEntity);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTradeViewModel$fetchEuropeComplianceDoc$1(String str, FuturesTradeViewModel futuresTradeViewModel, Continuation<? super FuturesTradeViewModel$fetchEuropeComplianceDoc$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.this$0 = futuresTradeViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTradeViewModel$fetchEuropeComplianceDoc$1(this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTradeViewModel$fetchEuropeComplianceDoc$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM42824e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90915g(IComplianceService.f22675a.get().mo97162e(this.$symbol)), C42911a.m94120b());
            C136081 c136081 = new C136081(this.$symbol, this.this$0, null);
            this.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c136081, this, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM42824e = obj;
        }
        FuturesTradeViewModel futuresTradeViewModel = this.this$0;
        Throwable throwable = ((C19334f) objM42824e).getThrowable();
        if (throwable != null) {
            futuresTradeViewModel.m26693e1().postValue(new EuropeComplianceSymbolDocEntity(null, null, null, null, null, null, null, null, null, null, 1023, null));
            C37214b.m83255a(throwable, "FuturesTradeViewModel-fetchEuropeComplianceDoc");
        }
        return Unit.INSTANCE;
    }
}
