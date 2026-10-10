package com.kubi.core.spot.business.holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBinding;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.submit.TradeSubmitBizContract$UiIntent;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.spot.business.holder.intercept.taskchain.TaskChainEngine;
import com.kubi.core.spot.entity.OrderRequestEntity;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23184z2;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.resources.widget.TradeInputProxyLayoutConfig;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27086s0;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.qcloud.tuicore.TUIConstants;
import ge.InterfaceC37872b;
import gf.C37890n;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.DisposableKt;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.LimitTradeInputData;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
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
import pe.InterfaceC43445a;
import ro.C44128b;
import v30.C45403q0;
import ve.C45518a;

/* JADX INFO: compiled from: LimitOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012,\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\tH\u0016J\n\u0010*\u001a\u0004\u0018\u00010'H\u0016J\n\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0017J\b\u00102\u001a\u000200H\u0016J\b\u00103\u001a\u000200H\u0002J\b\u00104\u001a\u000200H\u0002J\u0010\u00105\u001a\u0002002\u0006\u00106\u001a\u00020,H\u0002J\u0010\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\tH\u0016J\u0010\u00109\u001a\u0002002\u0006\u00106\u001a\u00020,H\u0016J\b\u0010:\u001a\u000200H\u0016J\u0010\u0010<\u001a\u0002002\u0006\u0010=\u001a\u00020,H\u0016J\u0010\u0010>\u001a\u0002002\u0006\u0010=\u001a\u00020,H\u0016J\b\u0010?\u001a\u000200H\u0016J\u0014\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0AH\u0016J\b\u0010B\u001a\u000200H\u0016J\b\u0010C\u001a\u000200H\u0002J4\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010E\u001a\u00020F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010H\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010I\u001a\u000200H\u0016J\b\u0010J\u001a\u00020\u000eH\u0016J\b\u0010\"\u001a\u00020KH\u0016J\b\u0010L\u001a\u000200H\u0002J\b\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020\tH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR7\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010;\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006P"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/LimitOrderHolder;", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "context", "Landroid/content/Context;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isStop", "", "isHorizontal", "requestOrderExecutor", "Lkotlin/Function2;", "", "", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "interceptionList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "<init>", "(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;ZZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;)V", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getRequestOrderExecutor", "()Lkotlin/jvm/functions/Function2;", "viewBinding", "Lcom/kubi/tradecorebiz/databinding/ViewLimitHolderLayoutBinding;", "getViewBinding", "()Lcom/kubi/tradecorebiz/databinding/ViewLimitHolderLayoutBinding;", "setViewBinding", "(Lcom/kubi/tradecorebiz/databinding/ViewLimitHolderLayoutBinding;)V", "getNumEditText", "Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "getPriceEditText", "isMin", "getAmountEditText", "getMaxDealAmount", "Ljava/math/BigDecimal;", "getLayoutId", "", "initViewBinding", "", "initView", "onActionTypeChanged", "updatePresetData", "initPriceObs", "setFaitAmount", FirebaseAnalytics.Param.PRICE, "getAvailableBalance", "isReal", "onClickPriceCallBack", "onSymbolChanged", "hasSetPrice", "onPanelBecameVisible", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "onBboDataGet", "onSubmitClick", "getParamsForReport", "", "requestOrder", "realRequestOrder", "requestOrderApi", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "requestEntity", "fingerEvent", "onLegalCurrencyChanged", "getTrackOrderType", "Landroidx/viewbinding/ViewBinding;", "wrapperLastLimitPriceRiskConfirm", "createOrderParams", "Lcom/kubi/core/spot/business/holder/intercept/data/LimitTradeInputData;", "showTvTriggerPriceVisible", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor", "KCCyclomaticComplexityCheck", "KCLongMethodCheck"})
@SourceDebugExtension({"SMAP\nLimitOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitOrderHolder.kt\ncom/kubi/core/spot/business/holder/LimitOrderHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,605:1\n808#2,11:606\n*S KotlinDebug\n*F\n+ 1 LimitOrderHolder.kt\ncom/kubi/core/spot/business/holder/LimitOrderHolder\n*L\n572#1:606,11\n*E\n"})
public class LimitOrderHolder extends BaseOrderHolder {

    /* JADX INFO: renamed from: o */
    @NotNull
    public final TradeType f21046o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> f21047p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> f21048q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final TradeSubmitVM f21049r;

    /* JADX INFO: renamed from: s */
    public C45403q0 f21050s;

    /* JADX INFO: renamed from: t */
    public boolean f21051t;

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.LimitOrderHolder$a */
    /* JADX INFO: compiled from: LimitOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/LimitOrderHolder$initPriceObs$11", "Lcom/kubi/utils/SimpleObserver;", "Ljava/math/BigDecimal;", "onNext", "", FirebaseAnalytics.Param.PRICE, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12301a extends C27086s0<BigDecimal> {
        public C12301a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(BigDecimal price) {
            BigDecimal inputBuyPrice;
            BigDecimal inputSellPrice;
            Intrinsics.checkNotNullParameter(price, "price");
            SpotInputProgressView progressPercent = LimitOrderHolder.this.getProgressPercent();
            if (progressPercent != null) {
                progressPercent.m23419J();
            }
            if (Intrinsics.areEqual(((UiState) LimitOrderHolder.this.f21049r.getState()).getPanelModel(), InterfaceC38170b.b.f85867a)) {
                inputBuyPrice = price;
                inputSellPrice = inputBuyPrice;
            } else {
                inputBuyPrice = LimitOrderHolder.this.getF21036i() ? price : ((UiState) LimitOrderHolder.this.f21049r.getState()).getInputBuyPrice();
                inputSellPrice = LimitOrderHolder.this.getF21036i() ? ((UiState) LimitOrderHolder.this.f21049r.getState()).getInputSellPrice() : price;
            }
            LimitOrderHolder.this.f21049r.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateInputPrice(inputBuyPrice, inputSellPrice));
            TradeInputLayoutProxy tradeInputLayoutProxy = LimitOrderHolder.this.getViewBinding().f102297c;
            View viewMo22383j0 = LimitOrderHolder.this.getF21029b().mo22383j0();
            String quoteCurrency = LimitOrderHolder.this.getF21029b().mo22365N().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            ITradeInputLayoutOperations.m55173e(tradeInputLayoutProxy, viewMo22383j0, C12322c0.m23257g(price, quoteCurrency, false, 4, null), LimitOrderHolder.this.getViewBinding().f102306l, 0L, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.LimitOrderHolder$b */
    /* JADX INFO: compiled from: LimitOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/LimitOrderHolder$initPriceObs$13", "Lcom/kubi/utils/SimpleObserver;", "Ljava/math/BigDecimal;", "onNext", "", FirebaseAnalytics.Param.PRICE, "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12302b extends C27086s0<BigDecimal> {
        public C12302b() {
        }

        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(BigDecimal price) {
            Intrinsics.checkNotNullParameter(price, "price");
            TradeInputLayoutProxy tradeInputLayoutProxy = LimitOrderHolder.this.getViewBinding().f102299e;
            View viewMo22383j0 = LimitOrderHolder.this.getF21029b().mo22383j0();
            String quoteCurrency = LimitOrderHolder.this.getF21029b().mo22365N().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            ITradeInputLayoutOperations.m55173e(tradeInputLayoutProxy, viewMo22383j0, C12322c0.m23257g(price, quoteCurrency, false, 4, null), LimitOrderHolder.this.getF21030c() ? LimitOrderHolder.this.getViewBinding().f102308n : null, 0L, 8, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.LimitOrderHolder$c */
    /* JADX INFO: compiled from: LimitOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0017¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/LimitOrderHolder$initPriceObs$15", "Lcom/kubi/utils/SimpleObserver;", "Ljava/math/BigDecimal;", "onNext", "", "dealAmount", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12303c extends C27086s0<BigDecimal> {
        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(BigDecimal dealAmount) {
            Intrinsics.checkNotNullParameter(dealAmount, "dealAmount");
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(LimitOrderHolder.this.getF21029b().mo22365N().getQuoteCurrency())));
            if (!TextUtils.isEmpty(LimitOrderHolder.this.getViewBinding().f102296b.getEditText().getText().toString()) && dealAmount.compareTo(bigDecimal) < 0) {
                TradeInputLayoutProxy tradeInputLayoutProxy = LimitOrderHolder.this.getViewBinding().f102296b;
                View viewMo22383j0 = LimitOrderHolder.this.getF21029b().mo22383j0();
                BigDecimal value = LimitOrderHolder.this.getViewBinding().f102296b.getValue();
                String quoteCurrency = LimitOrderHolder.this.getF21029b().mo22365N().getQuoteCurrency();
                Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
                ITradeInputLayoutOperations.m55173e(tradeInputLayoutProxy, viewMo22383j0, C12322c0.m23257g(value, quoteCurrency, false, 4, null), null, 0L, 8, null);
                BaseTextView tvCurrencyTotal = LimitOrderHolder.this.getViewBinding().f102304j;
                Intrinsics.checkNotNullExpressionValue(tvCurrencyTotal, "tvCurrencyTotal");
                ViewExtKt.m66594y(tvCurrencyTotal);
                LimitOrderHolder.this.getViewBinding().f102304j.setTextColor(ContextCompat.getColor(LimitOrderHolder.this.getContext(), R$color.brandRed));
                BaseTextView baseTextView = LimitOrderHolder.this.getViewBinding().f102304j;
                Context context = LimitOrderHolder.this.getContext();
                int i11 = R$string.kc_trade_vol_morethan_tip;
                String strM92640e = C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null);
                String quoteCurrencyName = LimitOrderHolder.this.getF21029b().mo22365N().getQuoteCurrencyName();
                Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
                baseTextView.setText(context.getString(i11, C42828b.m93906g(strM92640e, quoteCurrencyName, true, false, 4, null)));
            } else {
                LimitOrderHolder.this.setFaitAmount(dealAmount);
            }
            LimitOrderHolder.this.getF21032e().mo23230q(LimitOrderHolder.this);
            LimitOrderHolder.this.getF21032e().mo23234u(LimitOrderHolder.this);
        }

        public C12303c() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LimitOrderHolder(Context context, TradeType tradeType, ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, boolean z12, Function2 function2, LinkedList linkedList, TradeSubmitVM tradeSubmitVM, ITradeDiffBizDefine iTradeDiffBizDefine, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 8) != 0 ? false : z11;
        z12 = (i11 & 16) != 0 ? false : z12;
        this(context, tradeType, iTradeHolderDependDelegate, z11, z12, function2, linkedList, tradeSubmitVM, (i11 & 256) != 0 ? new SpotDiffHolderImp(tradeSubmitVM, iTradeHolderDependDelegate, z12) : iTradeDiffBizDefine);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public final C45403q0 getViewBinding() {
        C45403q0 c45403q0 = this.f21050s;
        if (c45403q0 != null) {
            return c45403q0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        return null;
    }

    /* JADX INFO: renamed from: C1 */
    public static final BigDecimal m22976C1(LimitOrderHolder limitOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return limitOrderHolder.getViewBinding().f102297c.getValue();
    }

    /* JADX INFO: renamed from: D1 */
    public static final BigDecimal m22977D1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: E1 */
    public static final BigDecimal m22978E1(LimitOrderHolder limitOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return limitOrderHolder.getViewBinding().f102299e.getValue();
    }

    /* JADX INFO: renamed from: F1 */
    public static final BigDecimal m22979F1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: G1 */
    public static final BigDecimal m22980G1(LimitOrderHolder limitOrderHolder, CharSequence it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return limitOrderHolder.getViewBinding().f102296b.getValue();
    }

    /* JADX INFO: renamed from: H1 */
    public static final BigDecimal m22981H1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return (BigDecimal) function1.invoke(p11);
    }

    /* JADX INFO: renamed from: I1 */
    public static final void m22982I1(LimitOrderHolder limitOrderHolder, View view, boolean z11) {
        if (z11) {
            limitOrderHolder.getF21032e().mo23216b().mo23262b();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public static final BigDecimal m22983J1(CharSequence price, CharSequence amount) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(amount, "amount");
        try {
            BigDecimal bigDecimalMultiply = new BigDecimal(price.toString()).multiply(new BigDecimal(amount.toString()));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            return bigDecimalMultiply;
        } catch (Exception unused) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
    }

    /* JADX INFO: renamed from: K1 */
    public static final boolean m22984K1(LimitOrderHolder limitOrderHolder, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TextUtils.isEmpty(limitOrderHolder.getViewBinding().f102297c.getEditText().getText());
    }

    /* JADX INFO: renamed from: L1 */
    public static final boolean m22985L1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    /* JADX INFO: renamed from: Z1 */
    public static final Unit m23008Z1(LimitOrderHolder limitOrderHolder, LimitTradeInputData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        limitOrderHolder.m23033T1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final BigDecimal m23029w1(LimitOrderHolder limitOrderHolder, CharSequence price, CharSequence volume) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(volume, "volume");
        try {
            BigDecimal bigDecimalDivide = new BigDecimal(volume.toString()).divide(new BigDecimal(price.toString()), limitOrderHolder.getViewBinding().f102298d.getF44154h(), RoundingMode.DOWN);
            Intrinsics.checkNotNull(bigDecimalDivide);
            return bigDecimalDivide;
        } catch (Exception unused) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.checkNotNull(bigDecimal);
            return bigDecimal;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static final boolean m23030x1(LimitOrderHolder limitOrderHolder, BigDecimal it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TextUtils.isEmpty(limitOrderHolder.getViewBinding().f102297c.getEditText().getText());
    }

    /* JADX INFO: renamed from: y1 */
    public static final boolean m23031y1(Function1 function1, Object p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((Boolean) function1.invoke(p11)).booleanValue();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: A0 */
    public void mo22940A0(@NotNull BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        if (C41014a.m89919D(price)) {
            return;
        }
        if (getViewBinding().f102299e.getVisibility() == 0 && getViewBinding().f102299e.getEditText().isFocused()) {
            getViewBinding().f102299e.mo54627b(price, true);
        } else if (!getF21031d() || (getF21031d() && !getF21029b().getF20634e0())) {
            getViewBinding().f102297c.mo54627b(price, true);
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final void m23033T1() {
        C45518a.m100507a("开始创建订单", "LimitOrderHolder");
        OrderRequestEntity orderRequestEntity = new OrderRequestEntity();
        orderRequestEntity.setAutoBorrow(getF21032e().m23270a());
        orderRequestEntity.setAutoRepay(getF21032e().m23271e());
        orderRequestEntity.setTradeType(getF21032e().mo23220g());
        orderRequestEntity.setSide(getF21036i() ? "buy" : "sell");
        orderRequestEntity.setSymbol(getF21029b().mo22365N().getCode());
        orderRequestEntity.setPrice(getViewBinding().f102297c.getValue().toPlainString());
        orderRequestEntity.setSize(getViewBinding().f102298d.getValue().toPlainString());
        if (getF21030c()) {
            orderRequestEntity.setStop(new BigDecimal(String.valueOf(getF21029b().getF20635f0().getPrice())).compareTo(getViewBinding().f102299e.getValue()) < 0 ? "entry" : "loss");
            orderRequestEntity.setStopPrice(getViewBinding().f102299e.getValue().toPlainString());
        }
        ITradeHolderDependDelegate f21029b = getF21029b();
        Map<String, String> limitStopOderParams = getF21030c() ? orderRequestEntity.getLimitStopOderParams() : orderRequestEntity.getLimitOderParams();
        String strMo23220g = getF21032e().mo23220g();
        if (Intrinsics.areEqual(strMo23220g, "MARGIN_TRADE")) {
            limitStopOderParams.put("HEADER_FINGER_EVENT", "trade-margin");
        } else if (Intrinsics.areEqual(strMo23220g, "MARGIN_ISOLATED_TRADE")) {
            limitStopOderParams.put("HEADER_FINGER_EVENT", "trade-isolated");
        } else {
            limitStopOderParams.put("HEADER_FINGER_EVENT", "trade-spot");
        }
        if (this instanceof AdvancedLimitOrderHolder) {
            limitStopOderParams.putAll(((AdvancedLimitOrderHolder) this).getAdvancedLimitParams());
        }
        Intrinsics.checkNotNullExpressionValue(limitStopOderParams, "apply(...)");
        f21029b.mo22386r1(limitStopOderParams, this, new Function2() { // from class: com.kubi.core.spot.business.holder.a1
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LimitOrderHolder.m23001U1(this.f21099b, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: W1 */
    public final boolean m23035W1() {
        return !TradeInputProxyLayoutConfig.f44243a.m54946b() && getF21030c();
    }

    @Override // com.kubi.core.spot.business.holder.ITradeHolderImpDelegate
    /* JADX INFO: renamed from: b */
    public void mo23037b(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        if (getParent() == null || getF21030c()) {
            return;
        }
        this.f21051t = false;
        getViewBinding().f102297c.getEditText().setText("");
        if (C41014a.m89919D(latestPrice)) {
            return;
        }
        getViewBinding().f102297c.setValue(latestPrice);
        this.f21051t = true;
    }

    @Override // com.kubi.core.spot.helper.ITradeTypeRequestOrder
    @NotNull
    /* JADX INFO: renamed from: d */
    public Observable<OrderResultEntity> mo23038d(@NotNull InterfaceC37872b marketApi, @NotNull Map<String, String> requestEntity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        return this.f21047p.invoke(requestEntity, str);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public Map<String, String> getParamsForReport() {
        HashMap map = new HashMap();
        map.put("symbol", getF21029b().mo22365N().getCode());
        map.put("side", getF21036i() ? "buy" : "sell");
        map.put("type", TUIConstants.TUIContact.LIMIT);
        map.put("orderType", getTrackOrderType());
        map.put("tradeType", getF21032e().mo23220g());
        map.put(FirebaseAnalytics.Param.PRICE, getViewBinding().f102297c.getValue().toString());
        map.put("size", getViewBinding().f102298d.getValue().toString());
        if (getF21030c()) {
            map.put("stopPrice", getViewBinding().f102299e.getValue().toString());
            map.put(InterfaceC33730j9.f70350a, new BigDecimal(String.valueOf(getF21029b().getF20635f0().getPrice())).compareTo(getViewBinding().f102299e.getValue()) < 0 ? "entry" : "loss");
        }
        map.put("autoBorrow", String.valueOf(getF21032e().m23270a()));
        map.put("autoRepay", String.valueOf(getF21032e().m23271e()));
        if (this instanceof AdvancedLimitOrderHolder) {
            map.putAll(((AdvancedLimitOrderHolder) this).getAdvancedLimitParams());
        }
        return map;
    }

    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> getRequestOrderExecutor() {
        return this.f21047p;
    }

    @NotNull
    /* JADX INFO: renamed from: getTradeType, reason: from getter */
    public final TradeType getF21046o() {
        return this.f21046o;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public ViewBinding getViewBinding() {
        return getViewBinding();
    }

    public final void setViewBinding(@NotNull C45403q0 c45403q0) {
        Intrinsics.checkNotNullParameter(c45403q0, "<set-?>");
        this.f21050s = c45403q0;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: z0 */
    public void mo22971z0(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        super.mo22971z0(latestPrice);
        if (getParent() != null && !getF21030c() && !this.f21051t && TextUtils.isEmpty(getViewBinding().f102297c.getEditText().getText())) {
            getViewBinding().f102297c.setValue(latestPrice);
            this.f21051t = true;
        }
        m23005X1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LimitOrderHolder(@NotNull Context context, @NotNull TradeType tradeType, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, boolean z12, @NotNull Function2<? super Map<String, String>, ? super String, ? extends Observable<OrderResultEntity>> requestOrderExecutor, @NotNull LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> interceptionList, @NotNull TradeSubmitVM submitVM, @NotNull ITradeDiffBizDefine diffTradeImp) {
        super(context, parentBehavior, z11, z12, diffTradeImp, submitVM);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(requestOrderExecutor, "requestOrderExecutor");
        Intrinsics.checkNotNullParameter(interceptionList, "interceptionList");
        Intrinsics.checkNotNullParameter(submitVM, "submitVM");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        this.f21046o = tradeType;
        this.f21047p = requestOrderExecutor;
        this.f21048q = interceptionList;
        this.f21049r = submitVM;
    }

    /* JADX INFO: renamed from: A1 */
    public static final void m22974A1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: B1 */
    public static final void m22975B1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: M1 */
    public static final void m22986M1(LimitOrderHolder limitOrderHolder, View view, boolean z11) {
        limitOrderHolder.getF21029b().mo22389y0(z11);
    }

    /* JADX INFO: renamed from: N1 */
    public static final Unit m22988N1(LimitOrderHolder limitOrderHolder, Boolean bool) {
        BaseTextView baseTextView;
        TradeInputLayoutProxy tradeInputLayoutProxy = limitOrderHolder.getViewBinding().f102299e;
        BigDecimal value = limitOrderHolder.getViewBinding().f102299e.getValue();
        String quoteCurrency = limitOrderHolder.getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        String strM23257g = C12322c0.m23257g(value, quoteCurrency, false, 4, null);
        if (limitOrderHolder.getF21030c()) {
            baseTextView = limitOrderHolder.getViewBinding().f102308n;
        } else {
            baseTextView = null;
        }
        tradeInputLayoutProxy.mo54628c(strM23257g, baseTextView);
        TradeInputLayoutProxy tradeInputLayoutProxy2 = limitOrderHolder.getViewBinding().f102297c;
        BigDecimal value2 = limitOrderHolder.getViewBinding().f102297c.getValue();
        String quoteCurrency2 = limitOrderHolder.getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency2, "getQuoteCurrency(...)");
        tradeInputLayoutProxy2.mo54628c(C12322c0.m23257g(value2, quoteCurrency2, false, 4, null), limitOrderHolder.getViewBinding().f102306l);
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(limitOrderHolder.getF21029b().mo22365N().getQuoteCurrency())));
        BigDecimal bigDecimalMultiply = limitOrderHolder.getViewBinding().f102297c.getValue().multiply(limitOrderHolder.getViewBinding().f102298d.getValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (TextUtils.isEmpty(limitOrderHolder.getViewBinding().f102296b.getEditText().getText().toString()) || bigDecimalMultiply.compareTo(bigDecimal) >= 0) {
            TradeInputLayoutProxy tradeInputLayoutProxy3 = limitOrderHolder.getViewBinding().f102296b;
            BigDecimal value3 = limitOrderHolder.getViewBinding().f102296b.getValue();
            String quoteCurrency3 = limitOrderHolder.getF21029b().mo22365N().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency3, "getQuoteCurrency(...)");
            tradeInputLayoutProxy3.mo54628c(C12322c0.m23257g(value3, quoteCurrency3, false, 4, null), limitOrderHolder.getViewBinding().f102304j);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O1 */
    public static final void m22990O1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: P1 */
    public static final Unit m22992P1(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final void m22994Q1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: R1 */
    public static final void m22996R1(LimitOrderHolder limitOrderHolder, BigDecimal bigDecimal) {
        limitOrderHolder.getViewBinding().f102304j.setTextColor(ContextCompat.getColor(limitOrderHolder.getContext(), R$color.brandRed));
        BaseTextView baseTextView = limitOrderHolder.getViewBinding().f102304j;
        Context context = limitOrderHolder.getContext();
        int i11 = R$string.kc_trade_vol_morethan_tip;
        Intrinsics.checkNotNull(bigDecimal);
        String string = context.getString(i11, C42180b.m92640e(bigDecimal, null, 20, false, false, false, 0, null, 125, null));
        String quoteCurrencyName = limitOrderHolder.getF21029b().mo22365N().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        baseTextView.setText(C42828b.m93906g(string, quoteCurrencyName, true, false, 4, null));
    }

    /* JADX INFO: renamed from: S1 */
    public static final boolean m22998S1(LimitOrderHolder limitOrderHolder) {
        if (!limitOrderHolder.getF21032e().mo23236w(limitOrderHolder) || BaseOrderHolder.m22895K(limitOrderHolder, false, 1, null)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: U1 */
    public static final Unit m23001U1(LimitOrderHolder limitOrderHolder, boolean z11, String str) {
        limitOrderHolder.getF21032e().mo23229p(limitOrderHolder, z11, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X1 */
    private final void m23005X1() {
        getViewBinding().f102297c.setLowValue(DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null));
        getViewBinding().f102297c.setInitValue(new BigDecimal(String.valueOf(getF21029b().getF20635f0().getPrice())));
        getViewBinding().f102299e.setLowValue(DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null));
        getViewBinding().f102298d.setLowValue(new BigDecimal(String.valueOf(getF21029b().mo22365N().getBaseMinSize())));
        getViewBinding().f102298d.setInitValue(new BigDecimal(String.valueOf(getF21029b().mo22365N().getBaseMinSize())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFaitAmount(BigDecimal price) {
        getViewBinding().f102304j.setTextColor(ContextCompat.getColor(getContext(), R$color.c_text40));
        TradeInputLayoutProxy tradeInputLayoutProxy = getViewBinding().f102296b;
        View viewMo22383j0 = getF21029b().mo22383j0();
        BigDecimal value = getViewBinding().f102296b.getValue();
        String quoteCurrency = getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        ITradeInputLayoutOperations.m55173e(tradeInputLayoutProxy, viewMo22383j0, C12322c0.m23257g(value, quoteCurrency, false, 4, null), getViewBinding().f102304j, 0L, 8, null);
        BigDecimal bigDecimalMultiply = BaseOrderHolder.m22905X(this, false, 1, null).multiply(price);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        getViewBinding().f102305k.setText(getContext().getString(R$string.fee_colon) + m22954T(bigDecimalMultiply));
    }

    /* JADX INFO: renamed from: t1 */
    public static final Unit m23026t1(LimitOrderHolder limitOrderHolder, BigDecimal bigDecimal) throws Exception {
        BigDecimal percent;
        boolean z11;
        SpotInputProgressView progressPercent = limitOrderHolder.getProgressPercent();
        if (progressPercent != null) {
            percent = progressPercent.getPercent();
        } else {
            percent = null;
        }
        boolean z12 = true;
        BigDecimal bigDecimalM89922G = C41014a.m89922G(percent, null, 1, null);
        if (bigDecimalM89922G.compareTo(BigDecimal.ONE) >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bigDecimalM89922G.compareTo(BigDecimal.ZERO) > 0) {
            z12 = false;
        }
        if (limitOrderHolder.getF21036i() && !z12) {
            limitOrderHolder.setAmountByPercent(false);
        }
        if (!limitOrderHolder.getViewBinding().f102296b.getEditText().isFocused()) {
            if (limitOrderHolder.getF21036i() && limitOrderHolder.getProgressPercent() != null && !z11 && !z12) {
                if (limitOrderHolder.getProgressPercent() != null) {
                    TradeInputLayoutProxy tradeInputLayoutProxy = limitOrderHolder.getViewBinding().f102296b;
                    BigDecimal bigDecimalMultiply = super.mo22953R(false).multiply(bigDecimalM89922G);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                    BigDecimal scale = bigDecimalMultiply.setScale(limitOrderHolder.getViewBinding().f102296b.getF44154h(), RoundingMode.UP);
                    Intrinsics.checkNotNullExpressionValue(scale, "setScale(...)");
                    tradeInputLayoutProxy.setValue(scale);
                }
            } else {
                TradeInputLayoutProxy tradeInputLayoutProxy2 = limitOrderHolder.getViewBinding().f102296b;
                Intrinsics.checkNotNull(bigDecimal);
                tradeInputLayoutProxy2.setValue(bigDecimal);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u1 */
    public static final void m23027u1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m23028v1(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m23032z1(LimitOrderHolder limitOrderHolder, BigDecimal bigDecimal) {
        if (limitOrderHolder.getViewBinding().f102296b.getEditText().isFocused()) {
            TradeInputLayoutProxy tradeInputLayoutProxy = limitOrderHolder.getViewBinding().f102298d;
            Intrinsics.checkNotNull(bigDecimal);
            tradeInputLayoutProxy.setValue(bigDecimal);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: D0 */
    public void mo22943D0() {
        BigDecimal value;
        ITradeDiffBizDefine f21032e = getF21032e();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        InterfaceC43445a interfaceC43445aMo23217c = f21032e.mo23217c(context);
        ITradeHolderDependDelegate f21029b = getF21029b();
        BigDecimal value2 = getViewBinding().f102297c.getValue();
        if (getF21030c()) {
            value = getViewBinding().f102299e.getValue();
        } else {
            value = null;
        }
        if (!interfaceC43445aMo23217c.mo95653a(f21029b, value2, value, getViewBinding().f102298d.getValue(), new Consumer() { // from class: com.kubi.core.spot.business.holder.x0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m22996R1(this.f21211b, (BigDecimal) obj);
            }
        }, new Function0() { // from class: com.kubi.core.spot.business.holder.y0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(LimitOrderHolder.m22998S1(this.f21215b));
            }
        })) {
            m23034V1();
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: E0 */
    public void mo22944E0() {
        super.mo22944E0();
        if (getParent() != null) {
            getViewBinding().f102299e.getEditText().setText("");
            getViewBinding().f102297c.getEditText().setText("");
            this.f21051t = false;
            m23005X1();
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    /* JADX INFO: renamed from: R */
    public BigDecimal mo22953R(boolean z11) {
        if (getF21036i()) {
            if (!C41014a.m89919D(getViewBinding().f102297c.getValue())) {
                BigDecimal bigDecimalDivide = new BigDecimal(super.mo22953R(z11).toString()).divide(new BigDecimal(getViewBinding().f102297c.getValue().toString()), 100, RoundingMode.DOWN);
                Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
                return bigDecimalDivide;
            }
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        return super.mo22953R(z11);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    /* JADX INFO: renamed from: U */
    public TradeInputLayoutProxy mo22955U(boolean z11) {
        return getViewBinding().f102297c;
    }

    /* JADX INFO: renamed from: V1 */
    public void m23034V1() {
        m23036Y1();
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m23036Y1() {
        LimitTradeInputData c42811dM23039r1 = m23039r1();
        InterfaceC43720b interfaceC43720bM96276a = C43721c.m96276a("requestOrderTask", new Function1() { // from class: com.kubi.core.spot.business.holder.z0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m23008Z1(this.f21219b, (LimitTradeInputData) obj);
            }
        });
        LinkedList linkedList = new LinkedList();
        LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> linkedList2 = this.f21048q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList2) {
            if (obj instanceof InterfaceC43720b) {
                arrayList.add(obj);
            }
        }
        linkedList.addAll(arrayList);
        linkedList.add(interfaceC43720bM96276a);
        TaskChainEngine.f21136c.buildTaskChain(linkedList).m23280a(c42811dM23039r1);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    public TradeInputLayoutProxy getAmountEditText() {
        return getViewBinding().f102296b;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    public int getLayoutId() {
        return getF21032e().mo23223j();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    public BigDecimal getMaxDealAmount() {
        return getViewBinding().f102296b.getValue();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public TradeInputLayoutProxy getNumEditText() {
        TradeInputLayoutProxy etNumber = getViewBinding().f102298d;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        return etNumber;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public String getTrackOrderType() {
        if (getF21030c()) {
            return "limitStop";
        }
        if (this instanceof AdvancedLimitOrderHolder) {
            return "advancedLimit";
        }
        return TUIConstants.TUIContact.LIMIT;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @SuppressLint({"SetTextI18n", "CheckResult"})
    /* JADX INFO: renamed from: h0 */
    public void mo22885h0() {
        int i11;
        int i12;
        super.mo22885h0();
        TradeInputLayoutProxy tradeInputLayoutProxy = getViewBinding().f102299e;
        int i13 = 8;
        if (getF21030c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        tradeInputLayoutProxy.setVisibility(i11);
        BaseTextView baseTextView = getViewBinding().f102308n;
        if (m23035W1()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        baseTextView.setVisibility(i12);
        BaseTextView baseTextView2 = getViewBinding().f102304j;
        if (!TradeInputProxyLayoutConfig.f44243a.m54946b()) {
            i13 = 0;
        }
        baseTextView2.setVisibility(i13);
        BaseTextView baseTextView3 = getViewBinding().f102304j;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        String quoteCurrency = getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        baseTextView3.setText(C12322c0.m23257g(ZERO, quoteCurrency, false, 4, null));
        BaseTextView baseTextView4 = getViewBinding().f102305k;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getContext().getString(R$string.fee_colon));
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        sb2.append(m22954T(ZERO));
        baseTextView4.setText(sb2.toString());
        m23040s1();
        mo22970y0();
        if (getF21031d()) {
            getViewBinding().f102299e.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.core.spot.business.holder.h0
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    LimitOrderHolder.m22986M1(this.f21127b, view, z11);
                }
            });
        }
        Observable<Boolean> observableObserveOn = C41016c.m89963a().observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.business.holder.s0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m22988N1(this.f21192b, (Boolean) obj);
            }
        };
        Consumer<? super Boolean> consumer = new Consumer() { // from class: com.kubi.core.spot.business.holder.b1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m22990O1(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.core.spot.business.holder.c1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m22992P1((Throwable) obj);
            }
        };
        observableObserveOn.subscribe(consumer, new Consumer() { // from class: com.kubi.core.spot.business.holder.d1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m22994Q1(function2, obj);
            }
        });
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: o0 */
    public void mo22960o0() {
        C45403q0 c45403q0M100343a = C45403q0.m100343a(this);
        Intrinsics.checkNotNullExpressionValue(c45403q0M100343a, "bind(...)");
        setViewBinding(c45403q0M100343a);
    }

    /* JADX INFO: renamed from: r1 */
    public final LimitTradeInputData m23039r1() {
        ITradeHolderDependDelegate f21029b = getF21029b();
        ITradeDiffBizDefine f21032e = getF21032e();
        BigDecimal value = getViewBinding().f102297c.getValue();
        BigDecimal value2 = getViewBinding().f102298d.getValue();
        BigDecimal value3 = getViewBinding().f102296b.getValue();
        BigDecimal value4 = getViewBinding().f102299e.getValue();
        boolean f21036i = getF21036i();
        String quoteCurrencyName = getF21029b().mo22365N().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        String baseCurrencyName = getF21029b().mo22365N().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        return new LimitTradeInputData(f21029b, value, value2, value3, value4, f21036i, this, f21032e, quoteCurrencyName, baseCurrencyName, new BigDecimal(String.valueOf(getF21029b().mo22365N().getPriceProtectionRate())));
    }

    /* JADX INFO: renamed from: s1 */
    public final void m23040s1() {
        getViewBinding().f102296b.setInnerFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.kubi.core.spot.business.holder.e1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                LimitOrderHolder.m22982I1(this.f21116b, view, z11);
            }
        });
        TradeInputLayoutProxy etLimitPrice = getViewBinding().f102297c;
        Intrinsics.checkNotNullExpressionValue(etLimitPrice, "etLimitPrice");
        TradeInputLayoutProxy etNumber = getViewBinding().f102298d;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        Observable<BigDecimal> observableObserveOn = C23184z2.m55627g(etLimitPrice, etNumber, new Function2() { // from class: com.kubi.core.spot.business.holder.n0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LimitOrderHolder.m22983J1((CharSequence) obj, (CharSequence) obj2);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function1 = new Function1() { // from class: com.kubi.core.spot.business.holder.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LimitOrderHolder.m22984K1(this.f21172b, (BigDecimal) obj));
            }
        };
        Observable<BigDecimal> observableSkipWhile = observableObserveOn.skipWhile(new Predicate() { // from class: com.kubi.core.spot.business.holder.p0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return LimitOrderHolder.m22985L1(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.core.spot.business.holder.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m23026t1(this.f21184b, (BigDecimal) obj);
            }
        };
        Consumer<? super BigDecimal> consumer = new Consumer() { // from class: com.kubi.core.spot.business.holder.r0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m23027u1(function2, obj);
            }
        };
        final LimitOrderHolder$initPriceObs$5 limitOrderHolder$initPriceObs$5 = LimitOrderHolder$initPriceObs$5.INSTANCE;
        Disposable disposableSubscribe = observableSkipWhile.subscribe(consumer, new Consumer() { // from class: com.kubi.core.spot.business.holder.t0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m23028v1(limitOrderHolder$initPriceObs$5, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, getF21029b().mo22357H().getDestroyDisposable());
        TradeInputLayoutProxy etLimitPrice2 = getViewBinding().f102297c;
        Intrinsics.checkNotNullExpressionValue(etLimitPrice2, "etLimitPrice");
        TradeInputLayoutProxy etDealAmount = getViewBinding().f102296b;
        Intrinsics.checkNotNullExpressionValue(etDealAmount, "etDealAmount");
        Observable<BigDecimal> observableObserveOn2 = C23184z2.m55627g(etLimitPrice2, etDealAmount, new Function2() { // from class: com.kubi.core.spot.business.holder.u0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LimitOrderHolder.m23029w1(this.f21200b, (CharSequence) obj, (CharSequence) obj2);
            }
        }).observeOn(AndroidSchedulers.mainThread());
        final Function1 function3 = new Function1() { // from class: com.kubi.core.spot.business.holder.v0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(LimitOrderHolder.m23030x1(this.f21204b, (BigDecimal) obj));
            }
        };
        Observable<BigDecimal> observableSkipWhile2 = observableObserveOn2.skipWhile(new Predicate() { // from class: com.kubi.core.spot.business.holder.w0
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return LimitOrderHolder.m23031y1(function3, obj);
            }
        });
        final Function1 function4 = new Function1() { // from class: com.kubi.core.spot.business.holder.f1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m23032z1(this.f21119b, (BigDecimal) obj);
            }
        };
        Consumer<? super BigDecimal> consumer2 = new Consumer() { // from class: com.kubi.core.spot.business.holder.g1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m22974A1(function4, obj);
            }
        };
        final LimitOrderHolder$initPriceObs$9 limitOrderHolder$initPriceObs$9 = LimitOrderHolder$initPriceObs$9.INSTANCE;
        Disposable disposableSubscribe2 = observableSkipWhile2.subscribe(consumer2, new Consumer() { // from class: com.kubi.core.spot.business.holder.h1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                LimitOrderHolder.m22975B1(limitOrderHolder$initPriceObs$9, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe2, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe2, getF21029b().mo22357H().getDestroyDisposable());
        Observable<CharSequence> observableObserveOn3 = C23184z2.m55630j(getViewBinding().f102297c.getEditText()).observeOn(AndroidSchedulers.mainThread());
        final Function1 function5 = new Function1() { // from class: com.kubi.core.spot.business.holder.i1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m22976C1(this.f21133b, (CharSequence) obj);
            }
        };
        observableObserveOn3.map(new Function() { // from class: com.kubi.core.spot.business.holder.i0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LimitOrderHolder.m22977D1(function5, obj);
            }
        }).subscribe(new C12301a());
        TradeInputLayoutProxy etTriggerPrice = getViewBinding().f102299e;
        Intrinsics.checkNotNullExpressionValue(etTriggerPrice, "etTriggerPrice");
        Observable observableObserveOn4 = C23184z2.m55632l(etTriggerPrice, false, 2, null).observeOn(AndroidSchedulers.mainThread());
        final Function1 function6 = new Function1() { // from class: com.kubi.core.spot.business.holder.j0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m22978E1(this.f21140b, (CharSequence) obj);
            }
        };
        observableObserveOn4.map(new Function() { // from class: com.kubi.core.spot.business.holder.k0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LimitOrderHolder.m22979F1(function6, obj);
            }
        }).subscribe(new C12302b());
        TradeInputLayoutProxy etDealAmount2 = getViewBinding().f102296b;
        Intrinsics.checkNotNullExpressionValue(etDealAmount2, "etDealAmount");
        Observable observableObserveOn5 = C23184z2.m55632l(etDealAmount2, false, 2, null).observeOn(AndroidSchedulers.mainThread());
        final Function1 function7 = new Function1() { // from class: com.kubi.core.spot.business.holder.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LimitOrderHolder.m22980G1(this.f21158b, (CharSequence) obj);
            }
        };
        observableObserveOn5.map(new Function() { // from class: com.kubi.core.spot.business.holder.m0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return LimitOrderHolder.m22981H1(function7, obj);
            }
        }).subscribe(new C12303c());
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: y0 */
    public void mo22970y0() {
        super.mo22970y0();
        int i11 = R$id.et_trigger_price;
        String string = getContext().getString(R$string.ktrigger_price_stub, getF21029b().mo22365N().getQuoteCurrencyName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C12322c0.m23258h(this, i11, string);
        int i12 = R$id.et_limit_price;
        String string2 = getContext().getString(R$string.limit_price_stub, getF21029b().mo22365N().getQuoteCurrencyName());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        C12322c0.m23258h(this, i12, string2);
        int i13 = R$id.et_number;
        String string3 = getContext().getString(R$string.qty_stub, getF21029b().mo22365N().getBaseCurrencyName());
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        C12322c0.m23258h(this, i13, string3);
        C12322c0.m23258h(this, R$id.et_deal_amount, getContext().getString(R$string.deal_vol) + '(' + getF21029b().mo22365N().getQuoteCurrencyName() + ')');
        ITradeInputLayoutOperations.m55172d(getViewBinding().f102299e, DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null), getF21029b().mo22365N().getPriceIncrementPrecisionTrade(), false, 4, null);
        ITradeInputLayoutOperations.m55172d(getViewBinding().f102297c, DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null), getF21029b().mo22365N().getPriceIncrementPrecisionTrade(), false, 4, null);
        getViewBinding().f102296b.mo54629f(DowngradeExKt.m66535e(getF21029b().mo22365N().getQuoteIncrement(), null, 1, null), getF21029b().mo22365N().getQuoteIncrementPrecisionTrade(), false);
        ITradeInputLayoutOperations.m55172d(getViewBinding().f102298d, DowngradeExKt.m66535e(getF21029b().mo22365N().getBaseIncrement(), null, 1, null), getF21029b().mo22365N().getBaseIncrementPrecisionTrade(), false, 4, null);
        m23005X1();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: C0 */
    public void mo22942C0() {
    }
}
