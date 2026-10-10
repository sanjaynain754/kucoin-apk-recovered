package com.kubi.spot.business.delegation;

import com.google.firebase.messaging.Constants;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.Resource;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import java.util.ArrayList;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41016c;
import p569qq.C43852m;
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

/* JADX INFO: compiled from: TradeFundsListViewModel.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.business.delegation.TradeFundsListViewModel$fetchCurrencyList$1", m90122f = "TradeFundsListViewModel.kt", m90123i = {}, m90124l = {120}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nTradeFundsListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel$fetchCurrencyList$1\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,434:1\n25#2:435\n26#2:437\n1#3:436\n*S KotlinDebug\n*F\n+ 1 TradeFundsListViewModel.kt\ncom/kubi/spot/business/delegation/TradeFundsListViewModel$fetchCurrencyList$1\n*L\n125#1:435\n125#1:437\n125#1:436\n*E\n"})
public final class TradeFundsListViewModel$fetchCurrencyList$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeItemBean $currentTradeItem;
    int label;
    final /* synthetic */ TradeFundsListViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.spot.business.delegation.TradeFundsListViewModel$fetchCurrencyList$1$1 */
    /* JADX INFO: compiled from: TradeFundsListViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n"}, m90084d2 = {"<anonymous>", "", "data", "Ljava/util/ArrayList;", "Lcom/kubi/spot/business/delegation/assets/AccountItemEntity;", "Lkotlin/collections/ArrayList;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.spot.business.delegation.TradeFundsListViewModel$fetchCurrencyList$1$1", m90122f = "TradeFundsListViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C248021 extends SuspendLambda implements Function2<ArrayList<AccountItemEntity>, Continuation<? super Unit>, Object> {
        final /* synthetic */ TradeItemBean $currentTradeItem;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TradeFundsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C248021(TradeFundsListViewModel tradeFundsListViewModel, TradeItemBean tradeItemBean, Continuation<? super C248021> continuation) {
            super(2, continuation);
            this.this$0 = tradeFundsListViewModel;
            this.$currentTradeItem = tradeItemBean;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C248021 c248021 = new C248021(this.this$0, this.$currentTradeItem, continuation);
            c248021.L$0 = obj;
            return c248021;
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(ArrayList<AccountItemEntity> arrayList, Continuation<? super Unit> continuation) {
            return ((C248021) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList = (ArrayList) this.L$0;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97259c(this.this$0.getF46844V(), "fetchCurrencyList: " + arrayList.size() + ", " + this.$currentTradeItem);
            this.this$0.f49937c0.clear();
            this.this$0.f49937c0.addAll(arrayList);
            this.this$0.m60745P(this.$currentTradeItem);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeFundsListViewModel$fetchCurrencyList$1(TradeFundsListViewModel tradeFundsListViewModel, TradeItemBean tradeItemBean, Continuation<? super TradeFundsListViewModel$fetchCurrencyList$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeFundsListViewModel;
        this.$currentTradeItem = tradeItemBean;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeFundsListViewModel$fetchCurrencyList$1(this.this$0, this.$currentTradeItem, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeFundsListViewModel$fetchCurrencyList$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws JSONException {
        TradeFundsListViewModel$fetchCurrencyList$1 tradeFundsListViewModel$fetchCurrencyList$1;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                tradeFundsListViewModel$fetchCurrencyList$1 = this;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(this.this$0.f49932X.mo60962c().m89460j("USDT", C41016c.m89965c()), C42911a.m94121c());
            C248021 c248021 = new C248021(this.this$0, this.$currentTradeItem, null);
            this.label = 1;
            tradeFundsListViewModel$fetchCurrencyList$1 = this;
            obj = RetrofitFlowExKt.m42824e(interfaceC41634eM90890N, false, c248021, tradeFundsListViewModel$fetchCurrencyList$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TradeFundsListViewModel tradeFundsListViewModel = tradeFundsListViewModel$fetchCurrencyList$1.this$0;
        Throwable throwable = ((C19334f) obj).getThrowable();
        if (throwable != null) {
            JSONObject jSONObject = new JSONObject();
            if (throwable instanceof ApiException) {
                str = ((ApiException) throwable).code;
            } else {
                str = "-200";
            }
            jSONObject.put("code", str);
            String message = throwable.getMessage();
            if (message == null) {
                message = "";
            }
            jSONObject.put(Constants.IPC_BUNDLE_KEY_SEND_ERROR, message);
            jSONObject.put("url", "v2/account/trade-balances");
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e("asset_api_request", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "1", jSONObject);
            tradeFundsListViewModel.f49938d0.postValue(Resource.f46439d.error(throwable, null));
            C44128b.m97263g(tradeFundsListViewModel.getF46844V(), throwable);
        }
        return Unit.INSTANCE;
    }
}
