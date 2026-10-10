package com.kubi.core.spot.business.holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.submit.TradeSubmitBizContract$UiIntent;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.spot.business.holder.intercept.taskchain.TaskChainEngine;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.core.spot.entity.OrderRequestEntity;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23184z2;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.TradeInputProxyLayoutConfig;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.tradebase.marketamount.C25898h;
import com.kubi.tradebase.marketamount.MarketAmountContext;
import com.kubi.tradebase.marketamount.MarketAmountConverter;
import com.kubi.tradebase.marketamount.MarketAmountSide;
import com.kubi.tradebase.marketamount.MarketAmountTradeInputAdapter;
import com.kubi.tradebase.marketamount.MarketAmountUnit;
import com.kubi.tradebase.marketamount.MarketAmountUnitDialog;
import com.kubi.tradebase.marketamount.MarketAmountUnitState;
import com.kubi.tradebase.marketamount.MarketAmountUnitStoreProvider;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27086s0;
import com.kubi.utils.extensions.DowngradeExKt;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import ge.InterfaceC37872b;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.MarketTradeInputData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p402kf.C41014a;
import p402kf.C41016c;
import p533pd.C43443a;
import p557qe.C43721c;
import p557qe.InterfaceC43720b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import pe.InterfaceC43446b;
import ro.C44128b;
import v30.C45395m0;
import ve.C45518a;

/* JADX INFO: compiled from: MarketOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012,\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u000206H\u0017J\b\u0010:\u001a\u00020+H\u0002J\b\u0010;\u001a\u00020\tH\u0002J\b\u0010<\u001a\u00020-H\u0002J\b\u0010=\u001a\u00020-H\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u000204H\u0002J\u0014\u0010A\u001a\u0002062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010-H\u0002J\b\u0010C\u001a\u000206H\u0002J\b\u0010D\u001a\u000206H\u0014J\b\u0010E\u001a\u000206H\u0014J\u001a\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020\u000e2\b\b\u0002\u0010H\u001a\u00020\tH\u0002J\u0010\u0010I\u001a\u0002062\u0006\u0010J\u001a\u00020\tH\u0016J\u0010\u0010K\u001a\u0002062\u0006\u0010L\u001a\u000208H\u0016J\b\u0010M\u001a\u000206H\u0002J\b\u0010N\u001a\u000206H\u0016J\b\u0010O\u001a\u000208H\u0002J\b\u0010P\u001a\u000206H\u0016J\b\u0010Q\u001a\u000206H\u0016J\u0014\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0SH\u0016J\b\u0010T\u001a\u000206H\u0016J\b\u0010U\u001a\u00020VH\u0002J\b\u0010W\u001a\u000206H\u0002J\b\u0010X\u001a\u000206H\u0002J4\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010Z\u001a\u00020[2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010]\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010^\u001a\u0002062\u0006\u0010_\u001a\u000208H\u0016J\b\u0010`\u001a\u000206H\u0016J\b\u0010a\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020bH\u0016J\b\u0010c\u001a\u00020\tH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR7\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006d"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/MarketOrderHolder;", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "context", "Landroid/content/Context;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isStop", "", "isHorizontal", "requestOrderExecutor", "Lkotlin/Function2;", "", "", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "interceptionList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "<init>", "(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;)V", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getRequestOrderExecutor", "()Lkotlin/jvm/functions/Function2;", "viewBinding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreViewMarketHoderBinding;", "getViewBinding", "()Lcom/kubi/tradecorebiz/databinding/TradeCoreViewMarketHoderBinding;", "setViewBinding", "(Lcom/kubi/tradecorebiz/databinding/TradeCoreViewMarketHoderBinding;)V", "marketAmountInputAdapter", "Lcom/kubi/tradebase/marketamount/MarketAmountTradeInputAdapter;", "amountUnitDisposable", "Lio/reactivex/disposables/Disposable;", "boundSide", "Lcom/kubi/tradebase/marketamount/MarketAmountSide;", "boundUnit", "Lcom/kubi/tradebase/marketamount/MarketAmountUnit;", "isSwitchingMarketAmountSide", "marketAmountBindingVersion", "", "getNumEditText", "Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "getLayoutId", "", "initViewBinding", "", "getMaxDealAmount", "Ljava/math/BigDecimal;", "initView", "marketAmountSide", "isMarketAmountUnitEnabled", "defaultMarketAmountUnit", "marketAmountUnit", "marketAmountContext", "Lcom/kubi/tradebase/marketamount/MarketAmountContext;", "marketAmountBusinessPrecision", "bindMarketAmountUnit", "convertFrom", "showMarketAmountUnitDialog", "onAttachedToWindow", "onDetachedFromWindow", "showErrorTip", "amount", "needToast", "setIsBuyHolder", "isBuyHolder", "onBboDataGet", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "updatePresetData", "onActionTypeChanged", "getLargeAmount", "onSubmitClick", "onSymbolChanged", "getParamsForReport", "", "requestOrder", "createOrderParams", "Lcom/kubi/core/spot/business/holder/intercept/data/MarketTradeInputData;", "wrapperLastRiskConfirm", "realRequestOrder", "requestOrderApi", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "requestEntity", "fingerEvent", "onClickPriceCallBack", FirebaseAnalytics.Param.PRICE, "onLegalCurrencyChanged", "getTrackOrderType", "Landroidx/viewbinding/ViewBinding;", "showTvTriggerPriceVisible", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nMarketOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketOrderHolder.kt\ncom/kubi/core/spot/business/holder/MarketOrderHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,552:1\n1#2:553\n*E\n"})
public final class MarketOrderHolder extends BaseOrderHolder {

    /* JADX INFO: renamed from: o */
    @NotNull
    public final TradeType f21055o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> f21056p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> f21057q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final TradeSubmitVM f21058r;

    /* JADX INFO: renamed from: s */
    public C45395m0 f21059s;

    /* JADX INFO: renamed from: t */
    public MarketAmountTradeInputAdapter f21060t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public Disposable f21061u;

    /* JADX INFO: renamed from: v */
    @Nullable
    public MarketAmountSide f21062v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public MarketAmountUnit f21063w;

    /* JADX INFO: renamed from: x */
    public boolean f21064x;

    /* JADX INFO: renamed from: y */
    public long f21065y;

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.MarketOrderHolder$a */
    /* JADX INFO: compiled from: MarketOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/MarketOrderHolder$initView$7", "Lcom/kubi/utils/SimpleObserver;", "Ljava/math/BigDecimal;", "onNext", "", FirebaseAnalytics.Param.PRICE, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12304a extends C27086s0<BigDecimal> {
        public C12304a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(BigDecimal price) {
            BigDecimal inputBuyTriggerPrice;
            BigDecimal inputSellTriggerPrice;
            Intrinsics.checkNotNullParameter(price, "price");
            if (MarketOrderHolder.this.getF21030c()) {
                if (Intrinsics.areEqual(((UiState) MarketOrderHolder.this.f21058r.getState()).getPanelModel(), InterfaceC38170b.b.f85867a)) {
                    inputBuyTriggerPrice = price;
                    inputSellTriggerPrice = inputBuyTriggerPrice;
                } else {
                    inputBuyTriggerPrice = MarketOrderHolder.this.getF21036i() ? price : ((UiState) MarketOrderHolder.this.f21058r.getState()).getInputBuyTriggerPrice();
                    inputSellTriggerPrice = MarketOrderHolder.this.getF21036i() ? ((UiState) MarketOrderHolder.this.f21058r.getState()).getInputSellTriggerPrice() : price;
                }
                MarketOrderHolder.this.f21058r.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateInputTriggerPrice(inputBuyTriggerPrice, inputSellTriggerPrice));
            }
            TradeInputLayoutProxy tradeInputLayoutProxy = MarketOrderHolder.this.getViewBinding().f102207c;
            View viewMo22383j0 = MarketOrderHolder.this.getF21029b().mo22383j0();
            String quoteCurrency = MarketOrderHolder.this.getF21029b().mo22365N().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            ITradeInputLayoutOperations.m55173e(tradeInputLayoutProxy, viewMo22383j0, C12322c0.m23257g(price, quoteCurrency, false, 4, null), MarketOrderHolder.this.getF21030c() ? MarketOrderHolder.this.getViewBinding().f102213i : null, 0L, 8, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MarketOrderHolder(Context context, TradeType tradeType, ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, boolean z12, Function2 function2, LinkedList linkedList, TradeSubmitVM tradeSubmitVM, ITradeDiffBizDefine iTradeDiffBizDefine, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 8) != 0 ? false : z11;
        z12 = (i11 & 16) != 0 ? false : z12;
        this(context, tradeType, iTradeHolderDependDelegate, z11, z12, function2, linkedList, tradeSubmitVM, (i11 & 256) != 0 ? new SpotDiffHolderImp(tradeSubmitVM, iTradeHolderDependDelegate, z12) : iTradeDiffBizDefine);
    }

    /* JADX INFO: renamed from: I1 */
    public static final Unit m23052I1(MarketOrderHolder marketOrderHolder, CharSequence charSequence) {
        m23089g2(marketOrderHolder, "", false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c2 */
    public static final void m23083c2(final MarketOrderHolder marketOrderHolder) {
        C45518a.m100507a("开始创建订单", "MarketOrderHolder");
        OrderRequestEntity orderRequestEntity = new OrderRequestEntity();
        orderRequestEntity.setTradeType(marketOrderHolder.getF21032e().mo23220g());
        orderRequestEntity.setAutoBorrow(marketOrderHolder.getF21032e().m23270a());
        orderRequestEntity.setAutoRepay(marketOrderHolder.getF21032e().m23271e());
        orderRequestEntity.setSide(marketOrderHolder.getF21036i() ? "buy" : "sell");
        orderRequestEntity.setSymbol(marketOrderHolder.getF21029b().mo22365N().getCode());
        if (marketOrderHolder.getF21036i()) {
            orderRequestEntity.setFunds(marketOrderHolder.getViewBinding().f102206b.getValue().toPlainString());
        } else {
            orderRequestEntity.setSize(marketOrderHolder.getViewBinding().f102206b.getValue().toPlainString());
        }
        if (marketOrderHolder.getF21030c()) {
            orderRequestEntity.setStopPrice(marketOrderHolder.getViewBinding().f102207c.getValue().toPlainString());
            orderRequestEntity.setStop(new BigDecimal(String.valueOf(marketOrderHolder.getF21029b().mo22356G().getPrice())).compareTo(marketOrderHolder.getViewBinding().f102207c.getValue()) < 0 ? "entry" : "loss");
        }
        ITradeHolderDependDelegate f21029b = marketOrderHolder.getF21029b();
        Map<String, String> marketStopOderParams = marketOrderHolder.getF21030c() ? orderRequestEntity.getMarketStopOderParams() : orderRequestEntity.getMarketOderParams();
        String strMo23220g = marketOrderHolder.getF21032e().mo23220g();
        if (Intrinsics.areEqual(strMo23220g, "MARGIN_TRADE")) {
            marketStopOderParams.put("HEADER_FINGER_EVENT", "trade-margin");
        } else if (Intrinsics.areEqual(strMo23220g, "MARGIN_ISOLATED_TRADE")) {
            marketStopOderParams.put("HEADER_FINGER_EVENT", "trade-isolated");
        } else {
            marketStopOderParams.put("HEADER_FINGER_EVENT", "trade-spot");
        }
        Intrinsics.checkNotNullExpressionValue(marketStopOderParams, "apply(...)");
        f21029b.mo22386r1(marketStopOderParams, marketOrderHolder, new Function2() { // from class: com.kubi.core.spot.business.holder.c2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarketOrderHolder.m23085d2(this.f21107b, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public final C45395m0 getViewBinding() {
        C45395m0 c45395m0 = this.f21059s;
        if (c45395m0 != null) {
            return c45395m0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        return null;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    public void setIsBuyHolder(boolean isBuyHolder) {
        this.f21064x = true;
        try {
            super.setIsBuyHolder(isBuyHolder);
            getViewBinding().f102206b.getEditText().setText("");
            getViewBinding().f102211g.setVisibility(isBuyHolder ? 0 : 4);
            this.f21064x = false;
            this.f21062v = null;
            this.f21063w = null;
            m23107v1(this, null, 1, null);
        } catch (Throwable th2) {
            this.f21064x = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final void m23119u1(MarketAmountUnit marketAmountUnit) {
        Editable text;
        final long j11 = this.f21065y + 1;
        this.f21065y = j11;
        final TradeInputLayoutProxy etNumber = getViewBinding().f102206b;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        BigDecimal displayValue = (marketAmountUnit == null || (text = etNumber.getEditText().getText()) == null || text.length() == 0) ? null : etNumber.getDisplayValue();
        final MarketAmountSide marketAmountSideM23113V1 = m23113V1();
        final MarketAmountUnit marketAmountUnitM23114W1 = m23114W1();
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        MarketAmountUnit marketAmountUnit2 = MarketAmountUnit.BASE;
        String baseCurrencyName = marketAmountUnitM23114W1 == marketAmountUnit2 ? symbolInfoEntityMo22365N.getBaseCurrencyName() : symbolInfoEntityMo22365N.getQuoteCurrencyName();
        int i11 = marketAmountUnitM23114W1 == marketAmountUnit2 ? R$string.amount_stub : R$string.decimal_order;
        BigDecimal bigDecimalM66535e = marketAmountUnitM23114W1 == marketAmountUnit2 ? DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getBaseIncrement(), null, 1, null) : DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getQuoteIncrement(), null, 1, null);
        int baseIncrementPrecisionTrade = marketAmountUnitM23114W1 == marketAmountUnit2 ? symbolInfoEntityMo22365N.getBaseIncrementPrecisionTrade() : symbolInfoEntityMo22365N.getQuoteIncrementPrecisionTrade();
        MarketAmountTradeInputAdapter marketAmountTradeInputAdapter = this.f21060t;
        if (marketAmountTradeInputAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketAmountInputAdapter");
            marketAmountTradeInputAdapter = null;
        }
        etNumber.setValueAdapter(marketAmountTradeInputAdapter);
        Intrinsics.checkNotNull(baseCurrencyName);
        etNumber.setTypeSelectorText(baseCurrencyName);
        ITradeInputLayoutOperations.m55172d(etNumber, bigDecimalM66535e, baseIncrementPrecisionTrade, false, 4, null);
        int i12 = R$id.et_number;
        String string = getContext().getString(i11, baseCurrencyName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C12322c0.m23258h(this, i12, string);
        this.f21062v = marketAmountSideM23113V1;
        this.f21063w = marketAmountUnitM23114W1;
        if (displayValue == null || marketAmountUnit == null) {
            return;
        }
        final BigDecimal bigDecimalM63236b = MarketAmountConverter.f51569a.m63236b(displayValue, marketAmountUnit, marketAmountUnitM23114W1, marketAmountSideM23113V1, m23112U1());
        if (bigDecimalM63236b == null) {
            etNumber.m54855i();
            SpotInputProgressView progressPercent = getProgressPercent();
            if (progressPercent != null) {
                progressPercent.m23419J();
                return;
            }
            return;
        }
        final SpotInputProgressView progressPercent2 = getProgressPercent();
        final BigDecimal percent = progressPercent2 != null ? progressPercent2.getPercent() : null;
        TradeInputLayoutProxy.m54854n(etNumber, bigDecimalM63236b, false, 2, null);
        if (percent == null || percent.compareTo(BigDecimal.ZERO) <= 0) {
            return;
        }
        etNumber.post(new Runnable() { // from class: com.kubi.core.spot.business.holder.j1
            @Override // java.lang.Runnable
            public final void run() {
                MarketOrderHolder.m23108w1(this.f21141b, j11, marketAmountSideM23113V1, marketAmountUnitM23114W1, etNumber, bigDecimalM63236b, progressPercent2, percent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final Unit m23044A1(Throwable th2) {
        C44128b.m97263g("MarketOrderHolder", th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G1 */
    public static final boolean m23050G1(MarketOrderHolder marketOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Editable text = marketOrderHolder.getViewBinding().f102206b.getEditText().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text.length() == 0;
    }

    /* JADX INFO: renamed from: H1 */
    public static final boolean m23051H1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: K1 */
    public static final BigDecimal m23054K1(MarketOrderHolder marketOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marketOrderHolder.getViewBinding().f102207c.getValue();
    }

    /* JADX INFO: renamed from: L1 */
    public static final BigDecimal m23055L1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: M1 */
    public static final boolean m23056M1(MarketOrderHolder marketOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Editable text = marketOrderHolder.getViewBinding().f102206b.getEditText().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text.length() > 0;
    }

    /* JADX INFO: renamed from: N1 */
    public static final boolean m23058N1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: O1 */
    public static final BigDecimal m23060O1(MarketOrderHolder marketOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return marketOrderHolder.getViewBinding().f102206b.getValue();
    }

    /* JADX INFO: renamed from: P1 */
    public static final BigDecimal m23062P1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: Z1 */
    public static final boolean m23077Z1(MarketOrderHolder marketOrderHolder, String amountString) {
        Intrinsics.checkNotNullParameter(amountString, "amountString");
        return marketOrderHolder.m23116f2(amountString, true);
    }

    /* JADX INFO: renamed from: g2 */
    public static /* synthetic */ boolean m23089g2(MarketOrderHolder marketOrderHolder, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return marketOrderHolder.m23116f2(str, z11);
    }

    private final BigDecimal getLargeAmount() {
        return new BigDecimal(String.valueOf(RangesKt.coerceAtLeast(getF21029b().mo22365N().getQuoteMinSize(), C37890n.f85269a.m85618z(getF21029b().mo22365N().getQuoteCurrency()))));
    }

    /* JADX INFO: renamed from: i2 */
    public static final Unit m23092i2(MarketOrderHolder marketOrderHolder, MarketAmountUnit selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        MarketAmountUnitStoreProvider.f51583a.m63251b().m63248f(marketOrderHolder.m23113V1(), selected);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j2 */
    private final boolean m23094j2() {
        return !TradeInputProxyLayoutConfig.f44243a.m54946b() && getF21030c();
    }

    /* JADX INFO: renamed from: m2 */
    public static final Unit m23099m2(MarketOrderHolder marketOrderHolder, InterfaceC42808a it) {
        Intrinsics.checkNotNullParameter(it, "it");
        marketOrderHolder.m23081b2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v1 */
    public static /* synthetic */ void m23107v1(MarketOrderHolder marketOrderHolder, MarketAmountUnit marketAmountUnit, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            marketAmountUnit = null;
        }
        marketOrderHolder.m23119u1(marketAmountUnit);
    }

    /* JADX INFO: renamed from: w1 */
    public static final void m23108w1(MarketOrderHolder marketOrderHolder, long j11, MarketAmountSide marketAmountSide, MarketAmountUnit marketAmountUnit, TradeInputLayoutProxy tradeInputLayoutProxy, BigDecimal bigDecimal, SpotInputProgressView spotInputProgressView, BigDecimal bigDecimal2) {
        Editable text;
        if (marketOrderHolder.f21065y == j11 && marketOrderHolder.f21062v == marketAmountSide && marketOrderHolder.f21063w == marketAmountUnit && marketOrderHolder.m23113V1() == marketAmountSide && marketOrderHolder.m23114W1() == marketAmountUnit && (text = tradeInputLayoutProxy.getEditText().getText()) != null && text.length() != 0 && tradeInputLayoutProxy.getDisplayValue().compareTo(bigDecimal) == 0) {
            spotInputProgressView.setProgress(bigDecimal2.movePointRight(2).floatValue());
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: A0 */
    public void mo22940A0(@NotNull BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (!C41014a.m89919D(price) && getViewBinding().f102207c.getVisibility() == 0) {
            getViewBinding().f102207c.mo54627b(price, true);
        }
    }

    /* JADX INFO: renamed from: S1 */
    public final boolean m23110S1() {
        return C24129b.m58030b(SiteVisibleConfigKey.MarketOrderBaseQuote);
    }

    @Override // com.kubi.core.spot.helper.ITradeTypeRequestOrder
    @NotNull
    /* JADX INFO: renamed from: d */
    public Observable<OrderResultEntity> mo23038d(@NotNull InterfaceC37872b marketApi, @NotNull Map<String, String> requestEntity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        return this.f21056p.invoke(requestEntity, str);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public Map<String, String> getParamsForReport() {
        HashMap map = new HashMap();
        map.put("symbol", getF21029b().mo22365N().getCode());
        map.put("side", getF21036i() ? "buy" : "sell");
        map.put("type", "market");
        map.put("orderType", getTrackOrderType());
        map.put("tradeType", getF21032e().mo23220g());
        if (getF21036i()) {
        }
        if (getF21030c()) {
            map.put("stopPrice", getViewBinding().f102207c.getValue().toString());
            map.put(InterfaceC33730j9.f70350a, new BigDecimal(String.valueOf(getF21029b().mo22356G().getPrice())).compareTo(getViewBinding().f102207c.getValue()) < 0 ? "entry" : "loss");
        }
        map.put("autoBorrow", String.valueOf(getF21032e().m23270a()));
        map.put("autoRepay", String.valueOf(getF21032e().m23271e()));
        return map;
    }

    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> getRequestOrderExecutor() {
        return this.f21056p;
    }

    @NotNull
    /* JADX INFO: renamed from: getTradeType, reason: from getter */
    public final TradeType getF21055o() {
        return this.f21055o;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public ViewBinding getViewBinding() {
        return getViewBinding();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Disposable disposable = this.f21061u;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f21061u = null;
        super.onDetachedFromWindow();
    }

    public final void setViewBinding(@NotNull C45395m0 c45395m0) {
        Intrinsics.checkNotNullParameter(c45395m0, "<set-?>");
        this.f21059s = c45395m0;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: z0 */
    public void mo22971z0(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        super.mo22971z0(latestPrice);
        m23096k2();
        getF21032e().mo23230q(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketOrderHolder(@NotNull Context context, @NotNull TradeType tradeType, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, boolean z12, @NotNull Function2<? super Map<String, String>, ? super String, ? extends Observable<OrderResultEntity>> requestOrderExecutor, @NotNull LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> interceptionList, @NotNull TradeSubmitVM submitVM, @NotNull ITradeDiffBizDefine diffTradeImp) {
        super(context, parentBehavior, z11, z12, diffTradeImp, submitVM);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(requestOrderExecutor, "requestOrderExecutor");
        Intrinsics.checkNotNullParameter(interceptionList, "interceptionList");
        Intrinsics.checkNotNullParameter(submitVM, "submitVM");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        this.f21055o = tradeType;
        this.f21056p = requestOrderExecutor;
        this.f21057q = interceptionList;
        this.f21058r = submitVM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final void m23045B1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: C1 */
    public static final Unit m23046C1(MarketOrderHolder marketOrderHolder, Boolean bool) {
        TradeInputLayoutProxy tradeInputLayoutProxy = marketOrderHolder.getViewBinding().f102207c;
        BigDecimal value = marketOrderHolder.getViewBinding().f102207c.getValue();
        String quoteCurrency = marketOrderHolder.getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        BaseTextView baseTextView = null;
        String strM23257g = C12322c0.m23257g(value, quoteCurrency, false, 4, null);
        if (marketOrderHolder.getF21030c()) {
            baseTextView = marketOrderHolder.getViewBinding().f102213i;
        }
        tradeInputLayoutProxy.mo54628c(strM23257g, baseTextView);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final void m23047D1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E1 */
    public static final Unit m23048E1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m23049F1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: J1 */
    public static final void m23053J1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: Q1 */
    public static final Unit m23064Q1(MarketOrderHolder marketOrderHolder, BigDecimal bigDecimal) {
        String string = bigDecimal.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        m23089g2(marketOrderHolder, string, false, 2, null);
        BigDecimal bigDecimalMultiply = BaseOrderHolder.m22905X(marketOrderHolder, false, 1, null).multiply(marketOrderHolder.getViewBinding().f102206b.getValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        marketOrderHolder.getViewBinding().f102211g.setText(marketOrderHolder.getContext().getString(R$string.fee_colon) + marketOrderHolder.m22954T(bigDecimalMultiply));
        marketOrderHolder.getF21032e().mo23230q(marketOrderHolder);
        marketOrderHolder.getF21032e().mo23234u(marketOrderHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final void m23066R1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: X1 */
    public static final Unit m23073X1(MarketOrderHolder marketOrderHolder, MarketAmountUnitState marketAmountUnitState) {
        MarketAmountUnit marketAmountUnitM23121y1;
        MarketAmountSide marketAmountSideM23113V1 = marketOrderHolder.m23113V1();
        MarketAmountUnit marketAmountUnit = marketOrderHolder.f21063w;
        MarketAmountUnit marketAmountUnit2 = null;
        if (marketOrderHolder.f21062v != marketAmountSideM23113V1) {
            marketAmountUnit = null;
        }
        if (marketOrderHolder.m23110S1()) {
            marketAmountUnitM23121y1 = marketAmountUnitState.m63242c(marketAmountSideM23113V1);
        } else {
            marketAmountUnitM23121y1 = marketOrderHolder.m23121y1();
        }
        if (marketAmountUnit == null || marketAmountUnit != marketAmountUnitM23121y1) {
            if (marketAmountUnit != null && marketAmountUnit != marketAmountUnitM23121y1) {
                marketAmountUnit2 = marketAmountUnit;
            }
            marketOrderHolder.m23119u1(marketAmountUnit2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y1 */
    public static final void m23075Y1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: a2 */
    public static final boolean m23079a2(MarketOrderHolder marketOrderHolder) {
        if (!marketOrderHolder.getF21032e().mo23236w(marketOrderHolder) || BaseOrderHolder.m22895K(marketOrderHolder, false, 1, null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: b2 */
    private final void m23081b2() {
        getF21032e().mo23233t(this, new Action() { // from class: com.kubi.core.spot.business.holder.b2
            @Override // io.reactivex.functions.Action
            public final void run() {
                MarketOrderHolder.m23083c2(this.f21104b);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    public static final Unit m23085d2(MarketOrderHolder marketOrderHolder, boolean z11, String str) {
        marketOrderHolder.getF21032e().mo23229p(marketOrderHolder, z11, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k2 */
    private final void m23096k2() {
        getViewBinding().f102207c.setLowValue(DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null));
        if (getF21036i()) {
            getViewBinding().f102206b.setLowValue(getLargeAmount());
            getViewBinding().f102206b.setInitValue(getLargeAmount());
        } else {
            getViewBinding().f102206b.setLowValue(new BigDecimal(String.valueOf(getF21029b().mo22365N().getBaseMinSize())));
            getViewBinding().f102206b.setInitValue(new BigDecimal(String.valueOf(getF21029b().mo22365N().getBaseMinSize())));
        }
    }

    /* JADX INFO: renamed from: z1 */
    public static final void m23109z1(MarketOrderHolder marketOrderHolder, View view) {
        marketOrderHolder.m23117h2();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: D0 */
    public void mo22943D0() {
        BigDecimal value;
        ITradeDiffBizDefine f21032e = getF21032e();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC43446b interfaceC43446bMo23222i = f21032e.mo23222i(context);
        ITradeHolderDependDelegate f21029b = getF21029b();
        boolean f21036i = getF21036i();
        if (getF21030c()) {
            value = getViewBinding().f102207c.getValue();
        } else {
            value = null;
        }
        if (!interfaceC43446bMo23222i.mo95654a(f21029b, f21036i, value, getViewBinding().f102206b.getValue(), new Function1() { // from class: com.kubi.core.spot.business.holder.y1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketOrderHolder.m23077Z1(this.f21216b, (String) obj));
            }
        }, new Function0() { // from class: com.kubi.core.spot.business.holder.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(MarketOrderHolder.m23079a2(this.f21220b));
            }
        })) {
            m23115e2();
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: E0 */
    public void mo22944E0() {
        super.mo22944E0();
        getViewBinding().f102207c.getEditText().setText("");
        this.f21062v = null;
        this.f21063w = null;
        m23107v1(this, null, 1, null);
        m23096k2();
    }

    /* JADX INFO: renamed from: T1 */
    public final int m23111T1() {
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        if (getF21036i()) {
            return symbolInfoEntityMo22365N.getQuoteIncrementPrecisionTrade();
        }
        return symbolInfoEntityMo22365N.getBaseIncrementPrecisionTrade();
    }

    /* JADX INFO: renamed from: U1 */
    public final MarketAmountContext m23112U1() {
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        OrderBookCenterEntity orderBookCenterEntityMo22356G = getF21029b().mo22356G();
        return new MarketAmountContext(DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getBaseIncrement(), null, 1, null), DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getQuoteIncrement(), null, 1, null), C25898h.m63239a(orderBookCenterEntityMo22356G.getBestAsk()), C25898h.m63239a(orderBookCenterEntityMo22356G.getBestBid()));
    }

    /* JADX INFO: renamed from: V1 */
    public final MarketAmountSide m23113V1() {
        if (getF21036i()) {
            return MarketAmountSide.BUY;
        }
        return MarketAmountSide.SELL;
    }

    /* JADX INFO: renamed from: W1 */
    public final MarketAmountUnit m23114W1() {
        if (m23110S1()) {
            return MarketAmountUnitStoreProvider.f51583a.m63251b().m63247e(m23113V1());
        }
        return m23121y1();
    }

    /* JADX INFO: renamed from: e2 */
    public void m23115e2() {
        m23118l2();
    }

    /* JADX INFO: renamed from: f2 */
    public final boolean m23116f2(String str, boolean z11) {
        boolean f21036i = getF21036i();
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        OrderBookCenterEntity orderBookCenterEntityMo22356G = getF21029b().mo22356G();
        BaseTextView tvErrorTip = getViewBinding().f102210f;
        Intrinsics.checkNotNullExpressionValue(tvErrorTip, "tvErrorTip");
        return C43443a.m95644d(f21036i, symbolInfoEntityMo22365N, orderBookCenterEntityMo22356G, tvErrorTip, str, z11);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    public int getLayoutId() {
        return getF21032e().mo23218d();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    public BigDecimal getMaxDealAmount() {
        if (getF21036i()) {
            return getNumEditText().getValue();
        }
        return null;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public TradeInputLayoutProxy getNumEditText() {
        TradeInputLayoutProxy etNumber = getViewBinding().f102206b;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        return etNumber;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public String getTrackOrderType() {
        if (getF21030c()) {
            return "limitMarket";
        }
        return "market";
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @SuppressLint({"CheckResult", "SetTextI18n"})
    /* JADX INFO: renamed from: h0 */
    public void mo22885h0() {
        int i11;
        int i12;
        super.mo22885h0();
        this.f21060t = new MarketAmountTradeInputAdapter(new MarketOrderHolder$initView$1(this), new MarketOrderHolder$initView$2(this), new MarketOrderHolder$initView$3(this), new MarketOrderHolder$initView$4(this));
        TradeInputLayoutProxy tradeInputLayoutProxy = getViewBinding().f102206b;
        MarketAmountTradeInputAdapter marketAmountTradeInputAdapter = this.f21060t;
        if (marketAmountTradeInputAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("marketAmountInputAdapter");
            marketAmountTradeInputAdapter = null;
        }
        tradeInputLayoutProxy.setValueAdapter(marketAmountTradeInputAdapter);
        if (m23110S1()) {
            tradeInputLayoutProxy.m54857k();
            tradeInputLayoutProxy.setTypeSelectorClickListener(new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MarketOrderHolder.m23109z1(this.f21117b, view);
                }
            });
        }
        m23107v1(this, null, 1, null);
        TradeInputLayoutProxy tradeInputLayoutProxy2 = getViewBinding().f102207c;
        int i13 = 8;
        if (getF21030c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tradeInputLayoutProxy2.setVisibility(i11);
        BaseTextView baseTextView = getViewBinding().f102213i;
        if (m23094j2()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        baseTextView.setVisibility(i12);
        BaseTextView baseTextView2 = getViewBinding().f102212h;
        if (!getF21030c()) {
            i13 = 0;
        }
        baseTextView2.setVisibility(i13);
        BaseTextView baseTextView3 = getViewBinding().f102211g;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getContext().getString(R$string.fee_colon));
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        sb2.append(m22954T(ZERO));
        baseTextView3.setText(sb2.toString());
        TradeInputLayoutProxy etTriggerPrice = getViewBinding().f102207c;
        Intrinsics.checkNotNullExpressionValue(etTriggerPrice, "etTriggerPrice");
        Observable observableObserveOn = C23184z2.m55632l(etTriggerPrice, false, 2, null).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.business.holder.n1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23054K1(this.f21169b, (CharSequence) obj);
            }
        };
        observableObserveOn.map(new Function() { // from class: com.kubi.core.spot.business.holder.o1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketOrderHolder.m23055L1(function1, obj);
            }
        }).subscribe(new C12304a());
        Observable<CharSequence> observableM55630j = C23184z2.m55630j(getViewBinding().f102206b.getEditText());
        final Function1 function2 = new Function1() { // from class: com.kubi.core.spot.business.holder.p1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketOrderHolder.m23056M1(this.f21179b, (CharSequence) obj));
            }
        };
        Observable<CharSequence> observableFilter = observableM55630j.filter(new Predicate() { // from class: com.kubi.core.spot.business.holder.q1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketOrderHolder.m23058N1(function2, obj);
            }
        });
        final Function1 function3 = new Function1() { // from class: com.kubi.core.spot.business.holder.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23060O1(this.f21189b, (CharSequence) obj);
            }
        };
        Observable<R> map = observableFilter.map(new Function() { // from class: com.kubi.core.spot.business.holder.s1
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return MarketOrderHolder.m23062P1(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.core.spot.business.holder.t1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23064Q1(this.f21197b, (BigDecimal) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.core.spot.business.holder.v1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23066R1(function4, obj);
            }
        };
        final Function1 function5 = new Function1() { // from class: com.kubi.core.spot.business.holder.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23044A1((Throwable) obj);
            }
        };
        map.subscribe(consumer, new Consumer() { // from class: com.kubi.core.spot.business.holder.f2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23045B1(function5, obj);
            }
        });
        mo22970y0();
        Observable<Boolean> observableObserveOn2 = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.core.spot.business.holder.g2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23046C1(this.f21123b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer2 = new Consumer() { // from class: com.kubi.core.spot.business.holder.h2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23047D1(function6, obj);
            }
        };
        final Function1 function7 = new Function1() { // from class: com.kubi.core.spot.business.holder.i2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23048E1((Throwable) obj);
            }
        };
        observableObserveOn2.subscribe(consumer2, new Consumer() { // from class: com.kubi.core.spot.business.holder.j2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23049F1(function7, obj);
            }
        });
        Observable<CharSequence> observableM55630j2 = C23184z2.m55630j(getViewBinding().f102206b.getEditText());
        final Function1 function8 = new Function1() { // from class: com.kubi.core.spot.business.holder.k2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(MarketOrderHolder.m23050G1(this.f21156b, (CharSequence) obj));
            }
        };
        Observable<CharSequence> observableFilter2 = observableM55630j2.filter(new Predicate() { // from class: com.kubi.core.spot.business.holder.k1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return MarketOrderHolder.m23051H1(function8, obj);
            }
        });
        final Function1 function9 = new Function1() { // from class: com.kubi.core.spot.business.holder.l1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23052I1(this.f21159b, (CharSequence) obj);
            }
        };
        observableFilter2.subscribe(new Consumer() { // from class: com.kubi.core.spot.business.holder.m1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23053J1(function9, obj);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final void m23117h2() {
        if (!m23110S1()) {
            return;
        }
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        MarketAmountUnitDialog.Companion companion = MarketAmountUnitDialog.f51558v0;
        String baseCurrencyName = symbolInfoEntityMo22365N.getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        String quoteCurrencyName = symbolInfoEntityMo22365N.getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        MarketAmountUnitDialog marketAmountUnitDialogM63227w4 = companion.newInstance(baseCurrencyName, quoteCurrencyName, m23114W1()).m63227w4(new Function1() { // from class: com.kubi.core.spot.business.holder.x1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23092i2(this.f21212b, (MarketAmountUnit) obj);
            }
        });
        FragmentManager childFragmentManager = getF21029b().mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        marketAmountUnitDialogM63227w4.show(childFragmentManager, "MarketAmountUnitDialog");
    }

    /* JADX INFO: renamed from: l2 */
    public final void m23118l2() {
        MarketTradeInputData c42813fM23120x1 = m23120x1();
        InterfaceC43720b interfaceC43720bM96276a = C43721c.m96276a("requestOrderTask", new Function1() { // from class: com.kubi.core.spot.business.holder.a2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23099m2(this.f21100b, (InterfaceC42808a) obj);
            }
        });
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f21057q);
        linkedList.add(interfaceC43720bM96276a);
        TaskChainEngine.f21136c.buildTaskChain(linkedList).m23280a(c42813fM23120x1);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: o0 */
    public void mo22960o0() {
        C45395m0 c45395m0M100324a = C45395m0.m100324a(this);
        Intrinsics.checkNotNullExpressionValue(c45395m0M100324a, "bind(...)");
        setViewBinding(c45395m0M100324a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Disposable disposable = this.f21061u;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable<MarketAmountUnitState> observableObserveOn = MarketAmountUnitStoreProvider.f51583a.m63251b().m63244b().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.business.holder.u1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MarketOrderHolder.m23073X1(this.f21201b, (MarketAmountUnitState) obj);
            }
        };
        this.f21061u = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.core.spot.business.holder.d2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                MarketOrderHolder.m23075Y1(function1, obj);
            }
        });
    }

    /* JADX INFO: renamed from: x1 */
    public final MarketTradeInputData m23120x1() {
        ITradeHolderDependDelegate f21029b = getF21029b();
        ITradeDiffBizDefine f21032e = getF21032e();
        BigDecimal value = getViewBinding().f102206b.getValue();
        BigDecimal displayValue = getViewBinding().f102206b.getDisplayValue();
        MarketAmountUnit marketAmountUnitM23114W1 = m23114W1();
        BigDecimal value2 = getViewBinding().f102207c.getValue();
        boolean f21036i = getF21036i();
        String quoteCurrencyName = getF21029b().mo22365N().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        String baseCurrencyName = getF21029b().mo22365N().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        return new MarketTradeInputData(f21029b, value, displayValue, marketAmountUnitM23114W1, value2, f21036i, this, f21032e, quoteCurrencyName, baseCurrencyName);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: y0 */
    public void mo22970y0() {
        int i11;
        super.mo22970y0();
        BaseTextView baseTextView = getViewBinding().f102212h;
        if (getF21036i()) {
            i11 = R$string.market_price_buy;
        } else {
            i11 = R$string.market_price_sell;
        }
        baseTextView.setText(i11);
        ITradeInputLayoutOperations.m55172d(getViewBinding().f102207c, DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null), getF21029b().mo22365N().getPriceIncrementPrecisionTrade(), false, 4, null);
        int i12 = R$id.et_trigger_price;
        String string = getContext().getString(R$string.ktrigger_price_stub, getF21029b().mo22365N().getQuoteCurrencyName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C12322c0.m23258h(this, i12, string);
        if (!this.f21064x) {
            m23107v1(this, null, 1, null);
        }
        m23096k2();
    }

    /* JADX INFO: renamed from: y1 */
    public final MarketAmountUnit m23121y1() {
        if (getF21036i()) {
            return MarketAmountUnit.QUOTE;
        }
        return MarketAmountUnit.BASE;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: C0 */
    public void mo22942C0() {
    }
}
