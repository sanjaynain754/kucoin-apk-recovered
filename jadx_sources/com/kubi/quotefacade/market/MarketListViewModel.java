package com.kubi.quotefacade.market;

import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.quotefacade.R$string;
import com.kubi.quotefacade.entity.MarketListEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.event.MarketListContract$UIIntent;
import com.kubi.quotefacade.event.UIState;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import com.kubi.quotefacade.helper.QuoteWSDataController;
import com.kubi.quotefacade.repository.QuoteMarketRepository;
import com.kubi.utils.C27017c;
import com.kubi.utils.ToastCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p212dv.C36979s;
import p212dv.C36980t;
import p212dv.C36981u;
import p414kv.C41992h;
import p414kv.C41993i;
import p414kv.InterfaceC41991g;
import p814yz.C46614a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: MarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0014J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0094@¢\u0006\u0002\u0010\u001bJ*\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u0010\"JH\u0010#\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u001e2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\b\u0012\u0004\u0012\u00020\u0006`)H\u0082@¢\u0006\u0002\u0010*JD\u0010+\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010,\u001a\u0004\u0018\u00010-2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\b\u0012\u0004\u0012\u00020\u0006`)2\b\b\u0002\u0010.\u001a\u00020/H\u0082@¢\u0006\u0002\u00100J=\u00101\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0016\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00060(j\b\u0012\u0004\u0012\u00020\u0006`)2\f\u00103\u001a\b\u0012\u0004\u0012\u00020 04H\u0002¢\u0006\u0002\u00105R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00066"}, m90084d2 = {"Lcom/kubi/quotefacade/market/MarketListViewModel;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/quotefacade/event/MarketListContract$UIState;", "<init>", "()V", "TAG", "", "wsDataController", "Lcom/kubi/quotefacade/helper/QuoteWSDataController;", "repository", "Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "lastFetchListIntent", "Lcom/kubi/quotefacade/event/MarketListContract$UIIntent$FetchListData;", "networkRecovery", "Lcom/kubi/sdk/network/NetworkRecoveryMonitor;", "initState", "getInitState", "()Lcom/kubi/quotefacade/event/MarketListContract$UIState;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "", "onFirstShow", RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "onCleared", "requestNetworkRecoveryRefresh", "dispatchIntent", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCoinStatus", "marketType", "", "tradeItemBean", "Lcom/kubi/data/entity/TradeItemBean;", ViewProps.POSITION, "(Ljava/lang/Integer;Lcom/kubi/data/entity/TradeItemBean;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchListData", "l1p", "l2p", "pageSize", "symbol", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleData", "marketListEntity", "Lcom/kubi/quotefacade/entity/MarketListEntity;", "needSubscribe", "", "(Ljava/lang/Integer;Lcom/kubi/quotefacade/entity/MarketListEntity;Ljava/util/ArrayList;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageDataSubscribe", "symbols", "futuresSymbols", "", "(Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/List;)V", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nMarketListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketListViewModel.kt\ncom/kubi/quotefacade/market/MarketListViewModel\n+ 2 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,232:1\n25#2:233\n26#2:235\n25#2:236\n26#2:238\n25#2:239\n26#2:241\n25#2:242\n26#2:244\n25#2:245\n26#2:247\n25#2:248\n26#2:250\n1#3:234\n1#3:237\n1#3:240\n1#3:243\n1#3:246\n1#3:249\n1#3:265\n1563#4:251\n1634#4,3:252\n1617#4,9:255\n1869#4:264\n1870#4:266\n1626#4:267\n*S KotlinDebug\n*F\n+ 1 MarketListViewModel.kt\ncom/kubi/quotefacade/market/MarketListViewModel\n*L\n112#1:233\n112#1:235\n122#1:236\n122#1:238\n132#1:239\n132#1:241\n152#1:242\n152#1:244\n163#1:245\n163#1:247\n172#1:248\n172#1:250\n112#1:234\n122#1:237\n132#1:240\n152#1:243\n163#1:246\n172#1:249\n226#1:265\n198#1:251\n198#1:252,3\n226#1:255,9\n226#1:264\n226#1:266\n226#1:267\n*E\n"})
public final class MarketListViewModel extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: a0 */
    @Nullable
    public MarketListContract$UIIntent.FetchListData f42198a0;

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f42195X = "MarketListViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final QuoteWSDataController f42196Y = new QuoteWSDataController();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final QuoteMarketRepository f42197Z = new QuoteMarketRepository();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C46614a f42199b0 = new C46614a("MarketListViewModel", new MarketListViewModel$networkRecovery$1(this));

    /* JADX INFO: renamed from: com.kubi.quotefacade.market.MarketListViewModel$dispatchIntent$1 */
    /* JADX INFO: compiled from: MarketListViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.quotefacade.market.MarketListViewModel", m90122f = "MarketListViewModel.kt", m90123i = {0, 1, 2}, m90124l = {85, 91, 95}, m90125m = "dispatchIntent", m90126n = {"intent", "intent", "intent"}, m90127s = {"L$0", "L$0", "L$0"})
    public static final class C222841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C222841(Continuation<? super C222841> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MarketListViewModel.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m52341A(MarketListViewModel marketListViewModel, List list) {
        marketListViewModel.send(new C36980t(list));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public final void m52342B() {
        MarketListContract$UIIntent.FetchListData fetchListData = this.f42198a0;
        if (fetchListData == null) {
            C44128b.m97266j(this.f42195X, "network recovered: skip FetchListData, no previous params");
        } else {
            sendIntent(new MarketListContract$UIIntent.FetchListData(fetchListData.getMarketType(), fetchListData.getL1p(), fetchListData.getL2p(), fetchListData.getPageSize(), new ArrayList(fetchListData.getSymbol())));
        }
    }

    /* JADX INFO: renamed from: r */
    public static final UIState m52355r(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: s */
    public static final UIState m52356s(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: t */
    public static final UIState m52357t(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, new Object(), 3, null);
    }

    /* JADX INFO: renamed from: w */
    public static final UIState m52358w(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: x */
    public static final UIState m52359x(UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m52360z(MarketListViewModel marketListViewModel, List list) {
        marketListViewModel.send(new C36981u(list));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0094, code lost:
    
        if (r14 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        if (r14 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r14 == r0) goto L66;
     */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52361C(Integer num, TradeItemBean tradeItemBean, int i11, Continuation<? super Unit> continuation) {
        MarketListViewModel$updateCoinStatus$1 marketListViewModel$updateCoinStatus$1;
        if (continuation instanceof MarketListViewModel$updateCoinStatus$1) {
            marketListViewModel$updateCoinStatus$1 = (MarketListViewModel$updateCoinStatus$1) continuation;
            int i12 = marketListViewModel$updateCoinStatus$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                marketListViewModel$updateCoinStatus$1.label = i12 - Integer.MIN_VALUE;
            } else {
                marketListViewModel$updateCoinStatus$1 = new MarketListViewModel$updateCoinStatus$1(this, continuation);
            }
        } else {
            marketListViewModel$updateCoinStatus$1 = new MarketListViewModel$updateCoinStatus$1(this, continuation);
        }
        MarketListViewModel$updateCoinStatus$1 marketListViewModel$updateCoinStatus$2 = marketListViewModel$updateCoinStatus$1;
        Object objM42824e = marketListViewModel$updateCoinStatus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = marketListViewModel$updateCoinStatus$2.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (num != null && num.intValue() == 0) {
                InterfaceC41634e<Object> interfaceC41634eM52996j = this.f42197Z.m52996j(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
                MarketListViewModel$updateCoinStatus$2 marketListViewModel$updateCoinStatus$3 = new MarketListViewModel$updateCoinStatus$2(this, tradeItemBean, i11, null);
                marketListViewModel$updateCoinStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$updateCoinStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
                marketListViewModel$updateCoinStatus$2.I$0 = i11;
                marketListViewModel$updateCoinStatus$2.label = 1;
                objM42824e = RetrofitFlowExKt.m42823d(interfaceC41634eM52996j, false, marketListViewModel$updateCoinStatus$3, marketListViewModel$updateCoinStatus$2);
            } else if (num != null && num.intValue() == 1) {
                InterfaceC41634e<Object> interfaceC41634eM52991e = this.f42197Z.m52991e(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
                MarketListViewModel$updateCoinStatus$4 marketListViewModel$updateCoinStatus$4 = new MarketListViewModel$updateCoinStatus$4(this, tradeItemBean, i11, null);
                marketListViewModel$updateCoinStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$updateCoinStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
                marketListViewModel$updateCoinStatus$2.I$0 = i11;
                marketListViewModel$updateCoinStatus$2.label = 2;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM52991e, false, marketListViewModel$updateCoinStatus$4, marketListViewModel$updateCoinStatus$2, 1, null);
            } else if (num != null && num.intValue() == 2) {
                InterfaceC41634e<Object> interfaceC41634eM52993g = this.f42197Z.m52993g(tradeItemBean != null ? tradeItemBean.getSymbol() : null);
                MarketListViewModel$updateCoinStatus$6 marketListViewModel$updateCoinStatus$6 = new MarketListViewModel$updateCoinStatus$6(this, tradeItemBean, i11, null);
                marketListViewModel$updateCoinStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$updateCoinStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(tradeItemBean);
                marketListViewModel$updateCoinStatus$2.I$0 = i11;
                marketListViewModel$updateCoinStatus$2.label = 3;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM52993g, false, marketListViewModel$updateCoinStatus$6, marketListViewModel$updateCoinStatus$2, 1, null);
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            ResultKt.throwOnFailure(objM42824e);
            Throwable throwable = ((C19334f) objM42824e).getThrowable();
            if (throwable != null && (throwable instanceof ApiException) && Intrinsics.areEqual(((ApiException) throwable).code, "420000")) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
            }
        } else if (i13 == 2) {
            ResultKt.throwOnFailure(objM42824e);
            Throwable throwable2 = ((C19334f) objM42824e).getThrowable();
            if (throwable2 != null && (throwable2 instanceof ApiException) && Intrinsics.areEqual(((ApiException) throwable2).code, "420000")) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
            Throwable throwable3 = ((C19334f) objM42824e).getThrowable();
            if (throwable3 != null && (throwable3 instanceof ApiException) && Intrinsics.areEqual(((ApiException) throwable3).code, "420000")) {
                ToastCompat.m66441G(C27017c.f54310a.m66516f(R$string.rank_fav_limit, Boxing.boxInt(150)), new Object[0]);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (m52362q(r2, r3, r4, r5, r6, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (m52361C(r3, r4, r10, r7) == r0) goto L33;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C222841 c222841;
        if (continuation instanceof C222841) {
            c222841 = (C222841) continuation;
            int i11 = c222841.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c222841.label = i11 - Integer.MIN_VALUE;
            } else {
                c222841 = new C222841(continuation);
            }
        } else {
            c222841 = new C222841(continuation);
        }
        C222841 c222842 = c222841;
        Object obj = c222842.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c222842.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            c222842.L$0 = interfaceC19282d;
            c222842.label = 1;
            if (super.dispatchIntent(interfaceC19282d, c222842) == coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        interfaceC19282d = (InterfaceC19282d) c222842.L$0;
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j(this.f42195X, "dispatchIntent=" + interfaceC19282d);
        if (interfaceC19282d instanceof MarketListContract$UIIntent.FetchListData) {
            MarketListContract$UIIntent.FetchListData fetchListData = (MarketListContract$UIIntent.FetchListData) interfaceC19282d;
            this.f42198a0 = fetchListData;
            Integer numBoxInt = Boxing.boxInt(fetchListData.getMarketType());
            String l1p = fetchListData.getL1p();
            String l2p = fetchListData.getL2p();
            int pageSize = fetchListData.getPageSize();
            ArrayList<String> symbol = fetchListData.getSymbol();
            c222842.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c222842.label = 2;
        } else {
            if (!(interfaceC19282d instanceof MarketListContract$UIIntent.CollectOrCancelCoin)) {
                return Unit.INSTANCE;
            }
            MarketListContract$UIIntent.CollectOrCancelCoin collectOrCancelCoin = (MarketListContract$UIIntent.CollectOrCancelCoin) interfaceC19282d;
            Integer numBoxInt2 = Boxing.boxInt(collectOrCancelCoin.getMarketType());
            TradeItemBean tradeItemBean = collectOrCancelCoin.getTradeItemBean();
            int itemPosition = collectOrCancelCoin.getItemPosition();
            c222842.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
            c222842.label = 3;
        }
        return coroutine_suspended;
    }

    @Override // com.kubi.mvi.state.BaseStateVM, com.kubi.mvi.p102vm.BaseVM, androidx.lifecycle.ViewModel
    public void onCleared() {
        this.f42199b0.m102779e();
        super.onCleared();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onHide() {
        this.f42199b0.m102780f();
        super.onHide();
        this.f42196Y.m51879c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ae, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014f, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52362q(Integer num, String str, String str2, int i11, ArrayList<String> arrayList, Continuation<? super Unit> continuation) {
        MarketListViewModel$fetchListData$1 marketListViewModel$fetchListData$1;
        if (continuation instanceof MarketListViewModel$fetchListData$1) {
            marketListViewModel$fetchListData$1 = (MarketListViewModel$fetchListData$1) continuation;
            int i12 = marketListViewModel$fetchListData$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                marketListViewModel$fetchListData$1.label = i12 - Integer.MIN_VALUE;
            } else {
                marketListViewModel$fetchListData$1 = new MarketListViewModel$fetchListData$1(this, continuation);
            }
        } else {
            marketListViewModel$fetchListData$1 = new MarketListViewModel$fetchListData$1(this, continuation);
        }
        Object objM42823d = marketListViewModel$fetchListData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i13 = marketListViewModel$fetchListData$1.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            if (num != null && num.intValue() == 0) {
                InterfaceC41634e<MarketListEntity> interfaceC41634eM52985T = this.f42197Z.m52985T(str, str2, i11);
                MarketListViewModel$fetchListData$2 marketListViewModel$fetchListData$2 = new MarketListViewModel$fetchListData$2(this, num, arrayList, null);
                marketListViewModel$fetchListData$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$fetchListData$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                marketListViewModel$fetchListData$1.L$2 = SpillingKt.nullOutSpilledVariable(str2);
                marketListViewModel$fetchListData$1.L$3 = SpillingKt.nullOutSpilledVariable(arrayList);
                marketListViewModel$fetchListData$1.I$0 = i11;
                marketListViewModel$fetchListData$1.label = 1;
                objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52985T, false, marketListViewModel$fetchListData$2, marketListViewModel$fetchListData$1);
            } else if (num != null && num.intValue() == 1) {
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                InterfaceC41634e<MarketListEntity> interfaceC41634eM52971F = this.f42197Z.m52971F(str, str2, i11, strM51845i);
                MarketListViewModel$fetchListData$4 marketListViewModel$fetchListData$4 = new MarketListViewModel$fetchListData$4(this, num, arrayList, null);
                marketListViewModel$fetchListData$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$fetchListData$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                marketListViewModel$fetchListData$1.L$2 = SpillingKt.nullOutSpilledVariable(str2);
                marketListViewModel$fetchListData$1.L$3 = SpillingKt.nullOutSpilledVariable(arrayList);
                marketListViewModel$fetchListData$1.L$4 = SpillingKt.nullOutSpilledVariable(strM51845i);
                marketListViewModel$fetchListData$1.I$0 = i11;
                marketListViewModel$fetchListData$1.label = 2;
                objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52971F, false, marketListViewModel$fetchListData$4, marketListViewModel$fetchListData$1);
            } else if (num != null && num.intValue() == 2) {
                InterfaceC41634e<MarketListEntity> interfaceC41634eM52968C = this.f42197Z.m52968C(str, str2, i11);
                MarketListViewModel$fetchListData$6 marketListViewModel$fetchListData$6 = new MarketListViewModel$fetchListData$6(this, num, arrayList, null);
                marketListViewModel$fetchListData$1.L$0 = SpillingKt.nullOutSpilledVariable(num);
                marketListViewModel$fetchListData$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                marketListViewModel$fetchListData$1.L$2 = SpillingKt.nullOutSpilledVariable(str2);
                marketListViewModel$fetchListData$1.L$3 = SpillingKt.nullOutSpilledVariable(arrayList);
                marketListViewModel$fetchListData$1.I$0 = i11;
                marketListViewModel$fetchListData$1.label = 3;
                objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM52968C, false, marketListViewModel$fetchListData$6, marketListViewModel$fetchListData$1);
            }
            return coroutine_suspended;
        }
        if (i13 == 1) {
            ResultKt.throwOnFailure(objM42823d);
            if (((C19334f) objM42823d).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.f0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketListViewModel.m52355r((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
        } else if (i13 == 2) {
            ResultKt.throwOnFailure(objM42823d);
            if (((C19334f) objM42823d).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketListViewModel.m52356s((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
            if (((C19334f) objM42823d).getThrowable() != null) {
                updateState(new Function1() { // from class: com.kubi.quotefacade.market.h0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketListViewModel.m52357t((UIState) obj);
                    }
                });
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: v */
    public final Object m52364v(Integer num, MarketListEntity marketListEntity, ArrayList<String> arrayList, boolean z11, Continuation<? super Unit> continuation) {
        C44128b.m97266j(this.f42195X, "fetchSpotList start " + num);
        if (marketListEntity == null) {
            updateState(new Function1() { // from class: com.kubi.quotefacade.market.i0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketListViewModel.m52359x((UIState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        String str = this.f42195X;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fetchSpotList marketListEntity = ");
        List<MarketListEntityItem> items = marketListEntity.getItems();
        sb2.append(items != null ? Boxing.boxInt(items.size()) : null);
        C44128b.m97266j(str, sb2.toString());
        List<MarketListEntityItem> items2 = marketListEntity.getItems();
        if (items2 == null || items2.isEmpty()) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.quotefacade.market.j0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketListViewModel.m52358w((UIState) obj);
                }
            }));
        } else {
            InterfaceC41991g c41992h = (num != null && num.intValue() == 1) ? new C41992h() : new C41993i();
            ArrayList arrayList2 = new ArrayList();
            List<MarketListEntityItem> items3 = marketListEntity.getItems();
            if (items3 != null) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(items3, 10));
                Iterator<T> it = items3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Boxing.boxBoolean(arrayList2.add(c41992h.mo51723a((MarketListEntityItem) it.next()))));
                }
            }
            C44128b.m97266j(this.f42195X, "updateState!!!");
            send(new C36979s(arrayList2));
            if (z11) {
                m52365y(num, arrayList, arrayList2);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onFirstShow() {
        super.onFirstShow();
    }

    @Override // com.kubi.mvi.p102vm.BaseVM
    public void onShow() throws Throwable {
        super.onShow();
        this.f42199b0.m102781g();
    }

    /* JADX INFO: renamed from: y */
    public final void m52365y(Integer num, ArrayList<String> arrayList, List<? extends TradeItemBean> list) {
        if (!arrayList.isEmpty()) {
            if ((num == null || num.intValue() != 0) && (num == null || num.intValue() != 2)) {
                C44128b.m97266j(this.f42195X, "wsDataController.futureSubscribe");
                QuoteWSDataController quoteWSDataController = this.f42196Y;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String symbol = ((TradeItemBean) it.next()).getSymbol();
                    if (symbol != null) {
                        arrayList2.add(symbol);
                    }
                }
                quoteWSDataController.m51880d(arrayList2, new Function1() { // from class: com.kubi.quotefacade.market.l0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MarketListViewModel.m52341A(this.f42335b, (List) obj);
                    }
                });
                return;
            }
            C44128b.m97266j(this.f42195X, "wsDataController.spotSubscribe");
            this.f42196Y.m51881f(arrayList, new Function1() { // from class: com.kubi.quotefacade.market.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarketListViewModel.m52360z(this.f42333b, (List) obj);
                }
            });
        }
    }
}
