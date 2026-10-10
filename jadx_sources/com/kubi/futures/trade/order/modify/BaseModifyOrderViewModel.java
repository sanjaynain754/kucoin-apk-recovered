package com.kubi.futures.trade.order.modify;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.trade.submit.panel.tradeType.a3;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.data.trade.model.CrossLeverageEntity;
import com.kubi.kumex.data.trade.model.OrderResult;
import com.kubi.kumex.data.trade.model.SubmitModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SubmitTwapModifyOrderEntity;
import com.kubi.kumex.data.trade.model.SymbolsCrossLeverage;
import com.kubi.kumex.helper.TradePwdHelperKt;
import com.kubi.kumex.logic.constant.OrderTradeType;
import com.kubi.kumex.trade.FuturesFragment;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Log;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.sdk.BaseViewModel;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.C27050g0;
import com.kubi.utils.C27099x;
import com.kubi.utils.FlowableCompat;
import com.kubi.utils.extensions.C27041f;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p236em.C37214b;
import p314hi.InterfaceC38213a;
import p402kf.C41014a;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BaseModifyOrderViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ&\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001a2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 H\u0002J:\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 H\u0002J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u001aJ4\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 2\u0006\u0010\u0019\u001a\u00020(2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 H\u0002J4\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002J2\u0010-\u001a\u00020.2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050 2\b\u0010,\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0005J\u0006\u00101\u001a\u00020\u0018J\b\u00102\u001a\u00020\u0018H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR'\u0010\u0013\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u00063"}, m90084d2 = {"Lcom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel;", "Lcom/kubi/sdk/BaseViewModel;", "<init>", "()V", "tag", "", "visibleDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "mTickerLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "getMTickerLiveData", "()Landroidx/lifecycle/MutableLiveData;", "mCrossLeverageLiveData", "Ljava/math/BigDecimal;", "getMCrossLeverageLiveData", "mPriceLiveData", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "getMPriceLiveData", "submitResult", "Lkotlin/Pair;", "", "getSubmitResult", "submitOrder", "", "panel", "Lcom/kubi/futures/trade/submit/validate/IPanelInput;", "inputPanel", "Lcom/kubi/futures/trade/submit/panel/tradeType/IBaseTradeInputAction;", "doSubmitOrder", "panelInput", "request", "", "trackSubmitResult", "input", "isSuccess", "", "failReason", "getTrackPositionMode", "applyClearedTpslPrices", "Lcom/kubi/futures/trade/order/modify/IModifyOrderPanelInput;", "createSubmitModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitModifyOrderEntity;", "orderId", "validationToken", "createSubmitTwapModifyOrderEntity", "Lcom/kubi/kumex/data/trade/model/SubmitTwapModifyOrderEntity;", "subscribe", "symbol", "unSubscribe", "onCleared", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBaseModifyOrderViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseModifyOrderViewModel.kt\ncom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n*L\n1#1,279:1\n47#2,4:280\n35#3,3:284\n*S KotlinDebug\n*F\n+ 1 BaseModifyOrderViewModel.kt\ncom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel\n*L\n70#1:280,4\n95#1:284,3\n*E\n"})
public class BaseModifyOrderViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final String f23888X = "BaseModifyOrderViewModel";

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final CompositeDisposable f23889Y = new CompositeDisposable();

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final MutableLiveData<TickerEntity> f23890Z = new MutableLiveData<>();

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final MutableLiveData<BigDecimal> f23891a0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<PriceEntity> f23892b0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final MutableLiveData<Pair<String, Throwable>> f23893c0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.kubi.futures.trade.order.modify.BaseModifyOrderViewModel$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 BaseModifyOrderViewModel.kt\ncom/kubi/futures/trade/order/modify/BaseModifyOrderViewModel\n*L\n1#1,49:1\n71#2,4:50\n*E\n"})
    public static final class C13788a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseModifyOrderViewModel f23894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13788a(CoroutineExceptionHandler.Companion companion, BaseModifyOrderViewModel baseModifyOrderViewModel) {
            super(companion);
            this.f23894b = baseModifyOrderViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            if (!(exception instanceof CancellationException)) {
                C37214b.m83255a(exception, this.f23894b.f23888X + "-submitOrder");
            }
            this.f23894b.m27227T().setValue(new Pair<>(null, exception));
        }
    }

    /* JADX INFO: renamed from: M */
    public static final void m27193M(BaseModifyOrderViewModel baseModifyOrderViewModel, IModifyOrderPanelInput iModifyOrderPanelInput, com.kubi.futures.trade.submit.validate.f fVar, Map map, Object obj) throws JSONException {
        if (obj instanceof OrderResult) {
            baseModifyOrderViewModel.f23893c0.postValue(new Pair<>(C27041f.m66668h(((OrderResult) obj).getOrderId()), null));
        } else {
            baseModifyOrderViewModel.f23893c0.postValue(new Pair<>(C27041f.m66668h(iModifyOrderPanelInput.getOrderId()), null));
        }
        baseModifyOrderViewModel.m27231j0(fVar, true, null, map);
    }

    /* JADX INFO: renamed from: N */
    public static final void m27194N(BaseModifyOrderViewModel baseModifyOrderViewModel, com.kubi.futures.trade.submit.validate.f fVar, Map map, Throwable th2) throws JSONException {
        baseModifyOrderViewModel.f23893c0.postValue(new Pair<>(null, th2));
        if (th2 instanceof ApiException) {
            baseModifyOrderViewModel.m27231j0(fVar, false, ((ApiException) th2).code, map);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final Observable m27195O(final IModifyOrderPanelInput iModifyOrderPanelInput, final BaseModifyOrderViewModel baseModifyOrderViewModel, final Map map, final String str) {
        Observable<Object> observable = FlowableCompat.f54248a.m66386c(new Function0() { // from class: com.kubi.futures.trade.order.modify.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseModifyOrderViewModel.m27196P(iModifyOrderPanelInput, baseModifyOrderViewModel, map, str);
            }
        }).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g()).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* JADX INFO: renamed from: Q */
    public static final Unit m27197Q(BaseModifyOrderViewModel baseModifyOrderViewModel) {
        baseModifyOrderViewModel.f23893c0.postValue(new Pair<>(null, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a0 */
    public static final Unit m27201a0(BaseModifyOrderViewModel baseModifyOrderViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = baseModifyOrderViewModel.f23888X + "-observeCrossLeverage";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c0 */
    public static final Unit m27203c0(BaseModifyOrderViewModel baseModifyOrderViewModel, PriceEntity priceEntity) {
        baseModifyOrderViewModel.f23892b0.setValue(priceEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e0 */
    public static final Unit m27205e0(BaseModifyOrderViewModel baseModifyOrderViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = baseModifyOrderViewModel.f23888X + "-observePrice";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static final Unit m27207g0(BaseModifyOrderViewModel baseModifyOrderViewModel, TickerEntity tickerEntity) {
        baseModifyOrderViewModel.f23890Z.postValue(tickerEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i0 */
    public static final Unit m27209i0(BaseModifyOrderViewModel baseModifyOrderViewModel, Throwable th2) {
        Log log = Log.f30813a;
        String str = baseModifyOrderViewModel.f23888X + "-observeTicker";
        Intrinsics.checkNotNull(th2);
        log.m36616b(str, th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public final Map<String, String> m27221I(IModifyOrderPanelInput iModifyOrderPanelInput, Map<String, String> map) {
        if (IUnifyAccountService.f53155a.get().mo64979C()) {
            BigDecimal bigDecimalMo27146E1 = iModifyOrderPanelInput.mo27146E1();
            BigDecimal bigDecimalMo27165d1 = iModifyOrderPanelInput.mo27165d1();
            if (!C41014a.m89917B(bigDecimalMo27146E1) || !C41014a.m89917B(bigDecimalMo27165d1)) {
                Map<String, String> mutableMap = MapsKt.toMutableMap(map);
                if (!C41014a.m89917B(bigDecimalMo27146E1) && !mutableMap.containsKey("triggerStopUpPrice")) {
                    mutableMap.put("triggerStopUpPrice", BigDecimal.ZERO.toPlainString());
                }
                if (!C41014a.m89917B(bigDecimalMo27165d1) && !mutableMap.containsKey("triggerStopDownPrice")) {
                    mutableMap.put("triggerStopDownPrice", BigDecimal.ZERO.toPlainString());
                }
                return mutableMap;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: J */
    public final SubmitModifyOrderEntity m27222J(String str, Map<String, String> map, String str2) {
        String str3 = map.get("symbol");
        String str4 = map.get(FirebaseAnalytics.Param.PRICE);
        BigDecimal bigDecimal = str4 != null ? new BigDecimal(str4) : null;
        String str5 = map.get("size");
        BigDecimal bigDecimal2 = str5 != null ? new BigDecimal(str5) : null;
        String str6 = map.get("visibleSize");
        BigDecimal bigDecimal3 = str6 != null ? new BigDecimal(str6) : null;
        String str7 = map.get("triggerStopUpPrice");
        BigDecimal bigDecimal4 = str7 != null ? new BigDecimal(str7) : null;
        String str8 = map.get("triggerStopDownPrice");
        BigDecimal bigDecimal5 = str8 != null ? new BigDecimal(str8) : null;
        return new SubmitModifyOrderEntity(str, str3, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, map.get("stopPriceType"), map.get("side"), "ANDROID", str2);
    }

    /* JADX INFO: renamed from: K */
    public final SubmitTwapModifyOrderEntity m27223K(String str, Map<String, String> map, String str2) {
        String str3 = map.get("symbol");
        String str4 = map.get("size");
        BigDecimal bigDecimal = str4 != null ? new BigDecimal(str4) : null;
        String str5 = map.get("twapDurationSec");
        Long lValueOf = str5 != null ? Long.valueOf(Long.parseLong(str5)) : null;
        String str6 = map.get("twapIntervalSec");
        Long lValueOf2 = str6 != null ? Long.valueOf(Long.parseLong(str6)) : null;
        String str7 = map.get("twapPriceLimit");
        BigDecimal bigDecimal2 = str7 != null ? new BigDecimal(str7) : null;
        String str8 = map.get("twapDistanceType");
        String str9 = map.get("twapDistanceValue");
        return new SubmitTwapModifyOrderEntity(str, str3, bigDecimal, lValueOf, lValueOf2, bigDecimal2, str8, str9 != null ? new BigDecimal(str9) : null, map.get("side"), "ANDROID", str2);
    }

    /* JADX INFO: renamed from: L */
    public final void m27224L(final com.kubi.futures.trade.submit.validate.f fVar, Map<String, String> map) {
        String strM66919i;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type com.kubi.futures.trade.order.modify.IModifyOrderPanelInput");
        final IModifyOrderPanelInput iModifyOrderPanelInput = (IModifyOrderPanelInput) fVar;
        final Map<String, String> mapM27221I = m27221I(iModifyOrderPanelInput, map);
        LifecycleOwner lifecycleOwnerF2 = fVar.F2();
        Intrinsics.checkNotNull(lifecycleOwnerF2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) lifecycleOwnerF2;
        ValidationBizEnum validationBizEnum = ValidationBizEnum.CONTRACT_TRADE;
        if (mapM27221I == null || (strM66919i = C27099x.m66919i(mapM27221I, false, 2, null)) == null) {
            strM66919i = "";
        }
        TradePwdHelperKt.m33943w(fragment, false, validationBizEnum, new Function1() { // from class: com.kubi.futures.trade.order.modify.m
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27195O(iModifyOrderPanelInput, this, mapM27221I, (String) obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.trade.order.modify.k
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                BaseModifyOrderViewModel.m27193M(this.f23936b, iModifyOrderPanelInput, fVar, mapM27221I, obj);
            }
        }, new Consumer() { // from class: com.kubi.futures.trade.order.modify.l
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                BaseModifyOrderViewModel.m27194N(this.f23941b, fVar, mapM27221I, (Throwable) obj);
            }
        }, false, strM66919i, new Function0() { // from class: com.kubi.futures.trade.order.modify.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseModifyOrderViewModel.m27197Q(this.f23984b);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final MutableLiveData<PriceEntity> m27225R() {
        return this.f23892b0;
    }

    @NotNull
    /* JADX INFO: renamed from: S */
    public final MutableLiveData<TickerEntity> m27226S() {
        return this.f23890Z;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final MutableLiveData<Pair<String, Throwable>> m27227T() {
        return this.f23893c0;
    }

    @NotNull
    /* JADX INFO: renamed from: U */
    public final String m27228U(@NotNull com.kubi.futures.trade.submit.validate.f input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return Intrinsics.areEqual(input.a3(), "HEDGE") ? "2" : "1";
    }

    /* JADX INFO: renamed from: V */
    public final void m27229V(@NotNull com.kubi.futures.trade.submit.validate.f panel, @NotNull a3 inputPanel) {
        Intrinsics.checkNotNullParameter(panel, "panel");
        Intrinsics.checkNotNullParameter(inputPanel, "inputPanel");
        InterfaceC38213a interfaceC38213aQ2 = panel.Q2();
        if (interfaceC38213aQ2 == null) {
            this.f23893c0.setValue(new Pair<>(null, null));
            return;
        }
        com.kubi.futures.trade.submit.validate.e eVarF = com.kubi.futures.trade.submit.validate.i.f(inputPanel, panel, interfaceC38213aQ2);
        if (eVarF == null) {
            this.f23893c0.setValue(new Pair<>(null, null));
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), new C13788a(CoroutineExceptionHandler.INSTANCE, this), null, new BaseModifyOrderViewModel$submitOrder$1(inputPanel, eVarF, this, panel, null), 2, null);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m27230W(@NotNull final String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        CompositeDisposable compositeDisposable = this.f23889Y;
        RepositoryServiceLocator repositoryServiceLocator = RepositoryServiceLocator.f19236a;
        Observable<TickerEntity> observableSubscribeOn = repositoryServiceLocator.m20286e().mo24802b(symbol).subscribeOn(C42916f.m94127f());
        final Function1 function1 = new Function1() { // from class: com.kubi.futures.trade.order.modify.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27207g0(this.f23930b, (TickerEntity) obj);
            }
        };
        Consumer<? super TickerEntity> consumer = new Consumer() { // from class: com.kubi.futures.trade.order.modify.r
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27208h0(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.futures.trade.order.modify.s
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27209i0(this.f23997b, (Throwable) obj);
            }
        };
        compositeDisposable.add(observableSubscribeOn.subscribe(consumer, new Consumer() { // from class: com.kubi.futures.trade.order.modify.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27198X(function2, obj);
            }
        }));
        CompositeDisposable compositeDisposable2 = this.f23889Y;
        Observable<SymbolsCrossLeverage> observableSubscribeOn2 = MultiBizFacadeManager.m20256j(MultiBizFacadeManager.f19232a, null, 1, null).mo24472C(false).subscribeOn(C42916f.m94127f());
        final Function1 function3 = new Function1() { // from class: com.kubi.futures.trade.order.modify.u
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27199Y(symbol, this, (SymbolsCrossLeverage) obj);
            }
        };
        Consumer<? super SymbolsCrossLeverage> consumer2 = new Consumer() { // from class: com.kubi.futures.trade.order.modify.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27200Z(function3, obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: com.kubi.futures.trade.order.modify.w
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27201a0(this.f24047b, (Throwable) obj);
            }
        };
        compositeDisposable2.add(observableSubscribeOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.futures.trade.order.modify.x
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27202b0(function4, obj);
            }
        }));
        CompositeDisposable compositeDisposable3 = this.f23889Y;
        Observable observableObserveOn = C27050g0.m66716a(repositoryServiceLocator.m20286e().mo24807g(symbol), FuturesFragment.f30411o0.scrollPredicate()).subscribeOn(C42916f.m94127f()).observeOn(C42916f.m94128g());
        final Function1 function5 = new Function1() { // from class: com.kubi.futures.trade.order.modify.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27203c0(this.f23932b, (PriceEntity) obj);
            }
        };
        Consumer consumer3 = new Consumer() { // from class: com.kubi.futures.trade.order.modify.j
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27204d0(function5, obj);
            }
        };
        final Function1 function6 = new Function1() { // from class: com.kubi.futures.trade.order.modify.p
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseModifyOrderViewModel.m27205e0(this.f23991b, (Throwable) obj);
            }
        };
        compositeDisposable3.add(observableObserveOn.subscribe(consumer3, new Consumer() { // from class: com.kubi.futures.trade.order.modify.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BaseModifyOrderViewModel.m27206f0(function6, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final void m27232m() {
        this.f23889Y.clear();
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m27196P(IModifyOrderPanelInput iModifyOrderPanelInput, BaseModifyOrderViewModel baseModifyOrderViewModel, Map map, String str) {
        if (iModifyOrderPanelInput.A0() == OrderTradeType.Twap) {
            MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4506i(baseModifyOrderViewModel.m27223K(iModifyOrderPanelInput.getOrderId(), map, str));
        } else {
            MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4505h(baseModifyOrderViewModel.m27222J(iModifyOrderPanelInput.getOrderId(), map, str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final void m27198X(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Y */
    public static final Unit m27199Y(String str, BaseModifyOrderViewModel baseModifyOrderViewModel, SymbolsCrossLeverage symbolsCrossLeverage) {
        BigDecimal bigDecimal;
        CrossLeverageEntity crossLeverageEntity = (CrossLeverageEntity) symbolsCrossLeverage.get((Object) str);
        if (crossLeverageEntity == null || (bigDecimal = crossLeverageEntity.getLeverage()) == null) {
            bigDecimal = new BigDecimal(3);
        }
        baseModifyOrderViewModel.f23891a0.postValue(bigDecimal);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final void m27200Z(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m27202b0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m27204d0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m27206f0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: h0 */
    public static final void m27208h0(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m27231j0(com.kubi.futures.trade.submit.validate.f fVar, boolean z11, String str, Map<String, String> map) throws JSONException {
        String symbol;
        BigDecimal bigDecimal;
        Long lValueOf;
        Long lValueOf2;
        String strM36554d = C17060n0.m36554d();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z11);
        if (str == null) {
            str = "none";
        }
        jSONObject.put("fail_reason", str);
        InterfaceC38213a interfaceC38213aQ2 = fVar.Q2();
        BigDecimal bigDecimal2 = null;
        if (interfaceC38213aQ2 != null) {
            symbol = interfaceC38213aQ2.getSymbol();
        } else {
            symbol = null;
        }
        jSONObject.put("trade_pair", C27041f.m66668h(symbol));
        jSONObject.put("trade_type", C27041f.m66668h(fVar.t2()));
        jSONObject.put("pricing_type", fVar.A0().getTrackTypeStr());
        jSONObject.put("trade_service_type", "Futures");
        String lowerCase = fVar.V0().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        jSONObject.put("marginType", lowerCase);
        jSONObject.put("positionMode", m27228U(fVar));
        String str2 = map.get("size");
        if (str2 != null) {
            bigDecimal = new BigDecimal(str2);
        } else {
            bigDecimal = null;
        }
        jSONObject.put("totalQty", bigDecimal);
        String str3 = map.get("twapDurationSec");
        if (str3 != null) {
            lValueOf = Long.valueOf(Long.parseLong(str3));
        } else {
            lValueOf = null;
        }
        jSONObject.put("totalDuration", lValueOf);
        String str4 = map.get("twapIntervalSec");
        if (str4 != null) {
            lValueOf2 = Long.valueOf(Long.parseLong(str4));
        } else {
            lValueOf2 = null;
        }
        jSONObject.put(JPushConstants.Geofence.KEY_INTERVAL, lValueOf2);
        jSONObject.put("market", map.get("twapDistanceType"));
        String str5 = map.get("twapPriceLimit");
        if (str5 != null) {
            bigDecimal2 = new BigDecimal(str5);
        }
        jSONObject.put("protectPrice", bigDecimal2);
        C43852m.m96605q(strM36554d, jSONObject);
    }

    @Override // com.kubi.sdk.BaseViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f23889Y.clear();
    }
}
