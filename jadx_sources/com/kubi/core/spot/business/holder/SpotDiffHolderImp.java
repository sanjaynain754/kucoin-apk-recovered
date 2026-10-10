package com.kubi.core.spot.business.holder;

import ad.InterfaceC0239a;
import android.content.Context;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.viewbinding.ViewBinding;
import com.blankj.utilcode.util.C5303w0;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.biz.coupon.UnifiedCouponAvailableEntity;
import com.kubi.core.biz.coupon.UnifiedCouponPanelMapper;
import com.kubi.core.biz.coupon.UnifiedCouponPanelState;
import com.kubi.core.biz.coupon.UnifiedCouponRepository;
import com.kubi.core.biz.coupon.UnifiedCouponRouter;
import com.kubi.core.biz.submit.SubmitOrderConfig;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.spot.helper.DialogHelper;
import com.kubi.core.utils.C12462a;
import com.kubi.data.DataInitPlugins;
import com.kubi.data.coin.TransferJumper;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.functions.Action;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;
import me.C42514a;
import me.C42515b;
import me.C42519e;
import me.C42520f;
import me.C42521g;
import me.InterfaceC42516c;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p756xc.BalanceData;
import p756xc.TradeSymbolBalance;
import p827zc.AbstractC46753c;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import pe.C43450f;
import pe.C43451g;
import pe.C43452h;
import ro.C44128b;
import v30.C45371a0;

/* JADX INFO: compiled from: SpotDiffHolderImp.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0016J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00122\b\u0010,\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J \u00101\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00122\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u000204H\u0016J\u0012\u00105\u001a\u00020.2\b\u00106\u001a\u0004\u0018\u00010\u0016H\u0016J \u00107\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\u0016H\u0016J\"\u0010?\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010B\u001a\u00020C2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010D\u001a\u00020E2\u0006\u0010<\u001a\u00020=H\u0016J\u0018\u0010F\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010G\u001a\u000204H\u0016J\u0018\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010J\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0012H\u0016J4\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020O2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Q2\b\u0010R\u001a\u0004\u0018\u00010\u0016H\u0016J4\u0010S\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020O2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Q2\b\u0010R\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010W\u001a\u00020.2\u0006\u00108\u001a\u00020\u0007H\u0016J\u0010\u0010X\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0012H\u0016J\u001a\u0010Y\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\b\b\u0002\u0010Z\u001a\u00020\u0007H\u0002J \u0010[\u001a\u00020\u00162\u0006\u0010\\\u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u0016H\u0002J\u000f\u0010_\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010`J\"\u0010a\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\u001f2\b\u0010b\u001a\u0004\u0018\u00010cH\u0002J\u0018\u0010d\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010e\u001a\u00020fH\u0002J\u0018\u0010g\u001a\u00020\u00162\u0006\u0010h\u001a\u00020\u00162\u0006\u0010I\u001a\u00020\u0016H\u0002J\u0018\u0010i\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010e\u001a\u00020jH\u0002J\u0018\u0010k\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010e\u001a\u00020lH\u0002J\"\u0010m\u001a\u00020.2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010n\u001a\u00020\u00162\b\b\u0002\u0010o\u001a\u00020\u001fH\u0002J\u0010\u0010p\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0012H\u0002J\u0010\u0010q\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0012\u0010r\u001a\u0004\u0018\u00010\u00192\u0006\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010s\u001a\u00020.2\u0006\u0010(\u001a\u00020\u0012H\u0016J\b\u0010t\u001a\u00020\u0016H\u0002J\b\u0010u\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006v"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/SpotDiffHolderImp;", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isHorizontal", "", "<init>", "(Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;Z)V", "getSubmitVM", "()Lcom/kubi/core/biz/submit/TradeSubmitVM;", "getParentBehavior", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "()Z", "setHorizontal", "(Z)V", "couponHolder", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "couponJob", "Lkotlinx/coroutines/Job;", "couponRequestKey", "", "baseAvailableEquity", "Lkotlinx/coroutines/flow/StateFlow;", "Ljava/math/BigDecimal;", "quoteAvailableEquity", "isMarginTrade", "trackImp", "Lcom/kubi/core/spot/business/holder/IHolderTrackDefine;", "limitLayoutRes", "", "marketLayoutRes", "ocoLayoutRes", "trailingLayoutRes", "preIntercepts", "", "Lcom/kubi/core/spot/business/holder/intercept/IOrderIntercept;", "formatterBaseBalanceDisplay", "", "baseOrderHolder", "tvBaseUnit", "Lcom/kubi/resources/widget/DashTextView;", "formatterQuoteBalanceDisplay", "tvQuoteUnit", "trackPercentClick", "", "radioGroup", "Landroid/widget/RadioGroup;", "checkAvailableSizeOk", "needHint", "insufficientCallBack", "Lio/reactivex/functions/Action;", "toTransfer", "targetCurrency", "getHolderDiffAvailableBalance", "isBuyHolder", "isReal", "checkSpotSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/SpotLimitTradeInputIntercept;", "context", "Landroid/content/Context;", "requestTradeType", "trackOrderSuccessOrFail", "success", "errorMsg", "checkMarketSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/SpotMarketTradeInputIntercept;", "checkSegmentSubmitClickIntercept", "Lcom/kubi/core/spot/business/holder/intercept/input/SpotSegmentTradeInputIntercept;", "needTipsMarginPriceOffset", TUIConstants.TIMPush.NOTIFICATION.ACTION, "showTransferDialog", FirebaseAnalytics.Param.CURRENCY, "needCheckAvailable", "requestOcoOrderApi", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "requestEntity", "", "fingerEvent", "requestTsoOderApi", "initMarginViewBind", "viewBinding", "Landroidx/viewbinding/ViewBinding;", "onCouponsDataGet", "initBottomBizView", "fetchUnifiedCoupon", "forceRefresh", "buildUnifiedCouponRequestKey", "prizeType", "symbol", "userId", "getUnifiedPrizeType", "()Ljava/lang/Integer;", "bindUnifiedCoupon", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "showFeeDeductionCoupon", "state", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$FeeDeduction;", "formatFeeDeductionCouponValue", "amount", "showInterestCountCoupon", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestCount;", "showInterestUsingCoupon", "Lcom/kubi/core/biz/coupon/UnifiedCouponPanelState$InterestUsing;", "showUnifiedCoupon", "value", "labelRes", "hideUnifiedCoupon", "calculateBorrowAmount", "getBorrowAmount", "calculateRepayDebtAmount", "getBaseCurrency", "getQuoteCurrency", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotDiffHolderImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotDiffHolderImp.kt\ncom/kubi/core/spot/business/holder/SpotDiffHolderImp\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,563:1\n49#2:564\n51#2:568\n49#2:570\n51#2:574\n46#3:565\n51#3:567\n46#3:571\n51#3:573\n105#4:566\n105#4:572\n189#5:569\n189#5:575\n774#6:576\n865#6,2:577\n*S KotlinDebug\n*F\n+ 1 SpotDiffHolderImp.kt\ncom/kubi/core/spot/business/holder/SpotDiffHolderImp\n*L\n77#1:564\n77#1:568\n89#1:570\n89#1:574\n77#1:565\n77#1:567\n89#1:571\n89#1:573\n77#1:566\n89#1:572\n79#1:569\n91#1:575\n368#1:576\n368#1:577,2\n*E\n"})
public final class SpotDiffHolderImp implements ITradeDiffBizDefine {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final TradeSubmitVM f21083a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ITradeHolderDependDelegate f21084b;

    /* JADX INFO: renamed from: c */
    public boolean f21085c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BaseOrderHolder f21086d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public InterfaceC41775x1 f21087e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f21088f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public final InterfaceC41678w<BigDecimal> f21089g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC41678w<BigDecimal> f21090h;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: q */
    public void mo23230q(@NotNull BaseOrderHolder baseOrderHolder) {
        BigDecimal avgPrice;
        BigDecimal bigDecimal;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        ((UiState) this.f21083a.getState()).getSymbolInfo();
        if (!IUserService.a.get().c()) {
            C45371a0 binding = baseOrderHolder.getBinding();
            if (binding != null && (baseTextView6 = binding.f102010k) != null) {
                baseTextView6.setText("--");
            }
            C45371a0 binding2 = baseOrderHolder.getBinding();
            if (binding2 == null || (baseTextView5 = binding2.f102015p) == null) {
                return;
            }
            baseTextView5.setText("--");
            return;
        }
        if (!baseOrderHolder.getF21036i() || baseOrderHolder.m22965t0()) {
            if (baseOrderHolder.getF21036i() || baseOrderHolder.m22964s0()) {
                C44128b.m97258b("calculateBorrowAmount: numEditText.value=" + baseOrderHolder.getNumEditText().getValue());
                BigDecimal value = baseOrderHolder.getNumEditText().getValue();
                BigDecimal ZERO = BigDecimal.ZERO;
                if (value.compareTo(ZERO) <= 0) {
                    C44128b.m97258b("calculateBorrowAmount: numEditText.value <= 0, setting borrow amount to 0");
                    C45371a0 binding3 = baseOrderHolder.getBinding();
                    if (binding3 != null && (baseTextView4 = binding3.f102010k) != null) {
                        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                        baseTextView4.setText(C42828b.m93906g(C37886j.m85578b(ZERO, m23208Q(), null, false, false, false, 0, null, 0, 254, null), m23208Q(), true, false, 4, null));
                    }
                    C45371a0 binding4 = baseOrderHolder.getBinding();
                    if (binding4 == null || (baseTextView3 = binding4.f102015p) == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    baseTextView3.setText(C42828b.m93906g(C37886j.m85578b(ZERO, m23209R(), null, false, false, false, 0, null, 0, 254, null), m23209R(), true, false, 4, null));
                    return;
                }
                if ((baseOrderHolder instanceof LimitOrderHolder) && baseOrderHolder.getF21036i()) {
                    TradeInputLayoutProxy tradeInputLayoutProxyM22904V = BaseOrderHolder.m22904V(baseOrderHolder, false, 1, null);
                    avgPrice = C41014a.m89922G(tradeInputLayoutProxyM22904V != null ? tradeInputLayoutProxyM22904V.getValue() : null, null, 1, null);
                } else {
                    avgPrice = ((baseOrderHolder instanceof SegmentOrderHolder) && baseOrderHolder.getF21036i()) ? ((SegmentOrderHolder) baseOrderHolder).getAvgPrice() : BigDecimal.ONE;
                }
                BigDecimal value2 = baseOrderHolder.getNumEditText().getValue();
                Intrinsics.checkNotNull(avgPrice);
                BigDecimal bigDecimalMultiply = value2.multiply(avgPrice);
                Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
                BigDecimal bigDecimalM22905X = BaseOrderHolder.m22905X(baseOrderHolder, false, 1, null);
                BigDecimal value3 = this.f21089g.getValue();
                BigDecimal value4 = this.f21090h.getValue();
                if (baseOrderHolder.getF21036i()) {
                    bigDecimal = ZERO;
                } else {
                    BigDecimal bigDecimalSubtract = baseOrderHolder.getNumEditText().getValue().subtract(value3);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    bigDecimal = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO);
                }
                if (baseOrderHolder.getF21036i()) {
                    BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(BigDecimal.ONE.add(bigDecimalM22905X));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
                    BigDecimal bigDecimalSubtract2 = bigDecimalMultiply2.subtract(value4);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
                    Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                    ZERO = (BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract2, ZERO);
                }
                BigDecimal bigDecimal2 = ZERO;
                C45371a0 binding5 = baseOrderHolder.getBinding();
                if (binding5 != null && (baseTextView2 = binding5.f102015p) != null) {
                    Intrinsics.checkNotNull(bigDecimal2);
                    baseTextView2.setText(C42828b.m93906g(C37886j.m85578b(bigDecimal2, m23209R(), RoundingMode.UP, false, false, false, 0, null, 0, 248, null), m23209R(), true, false, 4, null));
                }
                C45371a0 binding6 = baseOrderHolder.getBinding();
                if (binding6 != null && (baseTextView = binding6.f102010k) != null) {
                    Intrinsics.checkNotNull(bigDecimal);
                    baseTextView.setText(C42828b.m93906g(C37886j.m85578b(bigDecimal, m23208Q(), RoundingMode.UP, false, false, false, 0, null, 0, 248, null), m23208Q(), true, false, 4, null));
                }
                C44128b.m97258b("calculateBorrowAmount: set quote borrow amount=" + bigDecimal2 + ", base borrow amount=" + bigDecimal);
            }
        }
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @Nullable
    /* JADX INFO: renamed from: s */
    public BigDecimal mo23232s(@NotNull BaseOrderHolder baseOrderHolder) {
        BigDecimal bigDecimalM89922G;
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        if (!IUserService.a.get().c()) {
            return null;
        }
        if (baseOrderHolder.getF21036i() && !baseOrderHolder.m22965t0()) {
            return null;
        }
        if (!baseOrderHolder.getF21036i() && !baseOrderHolder.m22964s0()) {
            return null;
        }
        BigDecimal value = baseOrderHolder.getNumEditText().getValue();
        BigDecimal ZERO = BigDecimal.ZERO;
        if (value.compareTo(ZERO) <= 0) {
            return null;
        }
        if ((baseOrderHolder instanceof LimitOrderHolder) && baseOrderHolder.getF21036i()) {
            TradeInputLayoutProxy tradeInputLayoutProxyM22904V = BaseOrderHolder.m22904V(baseOrderHolder, false, 1, null);
            bigDecimalM89922G = C41014a.m89922G(tradeInputLayoutProxyM22904V != null ? tradeInputLayoutProxyM22904V.getValue() : null, null, 1, null);
        } else {
            bigDecimalM89922G = BigDecimal.ONE;
        }
        if (baseOrderHolder instanceof SegmentOrderHolder) {
            bigDecimalMultiply = ((SegmentOrderHolder) baseOrderHolder).getTotalQuoteAmount();
        } else {
            BigDecimal value2 = baseOrderHolder.getNumEditText().getValue();
            Intrinsics.checkNotNull(bigDecimalM89922G);
            bigDecimalMultiply = value2.multiply(bigDecimalM89922G);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        }
        BigDecimal bigDecimalM22905X = BaseOrderHolder.m22905X(baseOrderHolder, false, 1, null);
        BigDecimal value3 = this.f21089g.getValue();
        BigDecimal value4 = this.f21090h.getValue();
        if (!baseOrderHolder.getF21036i()) {
            BigDecimal bigDecimalSubtract = baseOrderHolder.getNumEditText().getValue().subtract(value3);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ((BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract, ZERO)).setScale(C27039d.m66651k(DataInitPlugins.f21489a.m23681b().m23685a(m23208Q()), 12), RoundingMode.UP);
        }
        BigDecimal bigDecimalMultiply2 = bigDecimalMultiply.multiply(BigDecimal.ONE.add(bigDecimalM22905X));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        BigDecimal bigDecimalSubtract2 = bigDecimalMultiply2.subtract(value4);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ((BigDecimal) RangesKt.coerceAtLeast(bigDecimalSubtract2, ZERO)).setScale(C27039d.m66651k(DataInitPlugins.f21489a.m23681b().m23685a(m23209R()), 12), RoundingMode.UP);
    }

    public SpotDiffHolderImp(@NotNull TradeSubmitVM submitVM, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11) {
        Intrinsics.checkNotNullParameter(submitVM, "submitVM");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        this.f21083a = submitVM;
        this.f21084b = parentBehavior;
        this.f21085c = z11;
        final InterfaceC41634e<S> stateFlow = submitVM.getStateFlow();
        InterfaceC41634e interfaceC41634eM90930n0 = C41636g.m90930n0(C41636g.m90939v(new InterfaceC41634e<String>() { // from class: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$1

            /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$1$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotDiffHolderImp.kt\ncom/kubi/core/spot/business/holder/SpotDiffHolderImp\n*L\n1#1,49:1\n50#2:50\n77#3:51\n*E\n"})
            public static final class C123092<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f21092b;

                /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$1$2", m90122f = "SpotDiffHolderImp.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C123092.this.emit(null, this);
                    }
                }

                public C123092(InterfaceC41635f interfaceC41635f) {
                    this.f21092b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BalanceData base;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f21092b;
                        TradeSymbolBalance tradeBalance = ((UiState) obj).getTradeBalance();
                        String currencyCode = (tradeBalance == null || (base = tradeBalance.getBase()) == null) ? null : base.getCurrencyCode();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(currencyCode, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super String> interfaceC41635f, Continuation continuation) {
                Object objCollect = stateFlow.collect(new C123092(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new SpotDiffHolderImp$special$$inlined$flatMapLatest$1(null));
        InterfaceC41709m0 viewModelScope = ViewModelKt.getViewModelScope(submitVM);
        SharingStarted.Companion companion = SharingStarted.INSTANCE;
        SharingStarted eagerly = companion.getEagerly();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.f21089g = C41636g.m90916g0(interfaceC41634eM90930n0, viewModelScope, eagerly, bigDecimal);
        final InterfaceC41634e<S> stateFlow2 = submitVM.getStateFlow();
        this.f21090h = C41636g.m90916g0(C41636g.m90930n0(C41636g.m90939v(new InterfaceC41634e<String>() { // from class: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$2

            /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$2$2 */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SpotDiffHolderImp.kt\ncom/kubi/core/spot/business/holder/SpotDiffHolderImp\n*L\n1#1,49:1\n50#2:50\n89#3:51\n*E\n"})
            public static final class C123102<T> implements InterfaceC41635f {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ InterfaceC41635f f21094b;

                /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
                @DebugMetadata(m90121c = "com.kubi.core.spot.business.holder.SpotDiffHolderImp$special$$inlined$map$2$2", m90122f = "SpotDiffHolderImp.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {50}, m90125m = "emit", m90126n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C123102.this.emit(null, this);
                    }
                }

                public C123102(InterfaceC41635f interfaceC41635f) {
                    this.f21094b = interfaceC41635f;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC41635f
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    BalanceData quote;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i11 = anonymousClass1.label;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i11 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = anonymousClass1.label;
                    if (i12 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        InterfaceC41635f interfaceC41635f = this.f21094b;
                        TradeSymbolBalance tradeBalance = ((UiState) obj).getTradeBalance();
                        String currencyCode = (tradeBalance == null || (quote = tradeBalance.getQuote()) == null) ? null : quote.getCurrencyCode();
                        anonymousClass1.L$0 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$1 = SpillingKt.nullOutSpilledVariable(anonymousClass1);
                        anonymousClass1.L$2 = SpillingKt.nullOutSpilledVariable(obj);
                        anonymousClass1.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41635f);
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC41635f.emit(currencyCode, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41634e
            public Object collect(InterfaceC41635f<? super String> interfaceC41635f, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C123102(interfaceC41635f), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }), new SpotDiffHolderImp$special$$inlined$flatMapLatest$2(null)), ViewModelKt.getViewModelScope(submitVM), companion.getEagerly(), bigDecimal);
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m23196O(SpotDiffHolderImp spotDiffHolderImp, BaseOrderHolder baseOrderHolder, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        spotDiffHolderImp.m23206N(baseOrderHolder, z11);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m23198V(int i11, String str) {
        UnifiedCouponRouter.f20385a.m21734b(i11, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m23199Z(String str, SpotDiffHolderImp spotDiffHolderImp) {
        DialogHelper dialogHelper = DialogHelper.f21241a;
        AbstractC46753c abstractC46753cMo22375b2 = spotDiffHolderImp.f21084b.mo22375b2();
        InterfaceC0239a f97158h = abstractC46753cMo22375b2 != null ? abstractC46753cMo22375b2.getF104581f() : null;
        FragmentManager childFragmentManager = spotDiffHolderImp.f21084b.mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogHelper.m23322d(str, f97158h, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m23200b0(SpotDiffHolderImp spotDiffHolderImp, BaseOrderHolder baseOrderHolder, String str, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = R$string.kc_tb_coupon_page_title;
        }
        spotDiffHolderImp.m23215a0(baseOrderHolder, str, i11);
    }

    /* JADX INFO: renamed from: I */
    public final void m23201I(BaseOrderHolder baseOrderHolder, int i11, UnifiedCouponAvailableEntity unifiedCouponAvailableEntity) {
        UnifiedCouponPanelState unifiedCouponPanelStateM21725b = UnifiedCouponPanelMapper.f20379a.m21725b(i11, unifiedCouponAvailableEntity);
        if (unifiedCouponPanelStateM21725b instanceof UnifiedCouponPanelState.FeeDeduction) {
            m23212W(baseOrderHolder, (UnifiedCouponPanelState.FeeDeduction) unifiedCouponPanelStateM21725b);
            return;
        }
        if (unifiedCouponPanelStateM21725b instanceof UnifiedCouponPanelState.InterestCount) {
            m23213X(baseOrderHolder, (UnifiedCouponPanelState.InterestCount) unifiedCouponPanelStateM21725b);
        } else if (unifiedCouponPanelStateM21725b instanceof UnifiedCouponPanelState.InterestUsing) {
            m23214Y(baseOrderHolder, (UnifiedCouponPanelState.InterestUsing) unifiedCouponPanelStateM21725b);
        } else {
            if (!Intrinsics.areEqual(unifiedCouponPanelStateM21725b, UnifiedCouponPanelState.b.f20382a)) {
                throw new NoWhenBranchMatchedException();
            }
            m23211T(baseOrderHolder);
        }
    }

    /* JADX INFO: renamed from: J */
    public final String m23202J(int i11, String str, String str2) {
        return str2 + ':' + i11 + ':' + str;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public C43451g mo23222i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C43451g(context);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C43452h mo23237x(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C43452h(context);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public C43450f mo23217c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new C43450f(context);
    }

    /* JADX INFO: renamed from: Q */
    public final String m23208Q() {
        if (!TextUtils.isEmpty(this.f21084b.mo22358I().getCurrencyName())) {
            return C27041f.m66668h(this.f21084b.mo22358I().getCurrencyName());
        }
        String baseCurrencyName = this.f21084b.mo22365N().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        return baseCurrencyName;
    }

    /* JADX INFO: renamed from: R */
    public final String m23209R() {
        if (!TextUtils.isEmpty(this.f21084b.mo22358I().getCurrencyName())) {
            return C27041f.m66668h(this.f21084b.mo22366O().getCurrencyName());
        }
        String quoteCurrencyName = this.f21084b.mo22365N().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        return quoteCurrencyName;
    }

    /* JADX INFO: renamed from: S */
    public final Integer m23210S() {
        TradeAccountType f20070w = this.f21083a.getF20070W();
        if (Intrinsics.areEqual(f20070w, TradeAccountType.Unified.INSTANCE)) {
            return 7;
        }
        return Intrinsics.areEqual(f20070w, TradeAccountType.Margin.INSTANCE) ? 2 : null;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: b */
    public IHolderTrackDefine mo23216b() {
        return new SpotHolderTrack();
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: d */
    public int mo23218d() {
        return R$layout.trade_core_view_market_hoder;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: f */
    public boolean mo23219f() {
        return Intrinsics.areEqual(this.f21083a.getF20070W(), TradeAccountType.Margin.INSTANCE);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: g */
    public String mo23220g() {
        return "TRADE";
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: h */
    public void mo23221h(boolean z11) {
        BaseOrderHolder baseOrderHolder = this.f21086d;
        if (baseOrderHolder == null) {
            return;
        }
        m23206N(baseOrderHolder, true);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: j */
    public int mo23223j() {
        return R$layout.view_limit_holder_layout;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: k */
    public List<InterfaceC42516c> mo23224k() {
        SubmitOrderConfig f97157g;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C42520f());
        arrayList.add(new C42519e());
        AbstractC46753c abstractC46753cMo22375b2 = this.f21084b.mo22375b2();
        if (abstractC46753cMo22375b2 != null && (f97157g = abstractC46753cMo22375b2.getF104580e()) != null && f97157g.mo22543g()) {
            arrayList.add(new C42515b());
        }
        arrayList.add(new C42514a());
        arrayList.add(new C42521g());
        return arrayList;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: l */
    public void mo23225l(@Nullable String str) {
        TransferJumper.Companion.jumpToTransfer$default(TransferJumper.f21427a, str, null, null, "MAIN", "TRADE", false, null, 102, null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: m */
    public void mo23226m(@NotNull ViewBinding viewBinding) {
        Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: n */
    public void mo23227n(@NotNull BaseOrderHolder baseOrderHolder) {
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        this.f21086d = baseOrderHolder;
        C45371a0 binding = baseOrderHolder.getBinding();
        if (binding != null && (constraintLayout = binding.f102006g) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.core.spot.business.holder.b3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SpotDiffHolderImp.m23197U(this.f21105b, view);
                }
            });
        }
        m23196O(this, baseOrderHolder, false, 2, null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: o */
    public CharSequence mo23228o(@NotNull BaseOrderHolder baseOrderHolder, @Nullable DashTextView dashTextView) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        boolean zIsEmpty = TextUtils.isEmpty(this.f21084b.mo22358I().getCurrencyName());
        ITradeHolderDependDelegate iTradeHolderDependDelegate = this.f21084b;
        String baseCurrencyName = zIsEmpty ? iTradeHolderDependDelegate.mo22365N().getBaseCurrencyName() : C27041f.m66668h(iTradeHolderDependDelegate.mo22358I().getCurrencyName());
        if (!IUserService.a.get().c() || zIsEmpty) {
            return "-- " + baseCurrencyName;
        }
        BigDecimal bigDecimalM101662b = this.f21084b.mo22358I().m101662b();
        String strM66669i = C27041f.m66669i(bigDecimalM101662b != null ? C42180b.m92640e(bigDecimalM101662b, null, this.f21084b.mo22365N().getBaseIncrementPrecision(), false, false, false, 0, null, 125, null) : null, "--");
        Intrinsics.checkNotNull(baseCurrencyName);
        return C42828b.m93906g(strM66669i, baseCurrencyName, true, false, 4, null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: p */
    public void mo23229p(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, @Nullable String str) throws JSONException {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        C12322c0.m23259i(baseOrderHolder, z11, str);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: r */
    public CharSequence mo23231r(@NotNull BaseOrderHolder baseOrderHolder, @Nullable DashTextView dashTextView) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        boolean zIsEmpty = TextUtils.isEmpty(this.f21084b.mo22366O().getCurrencyName());
        ITradeHolderDependDelegate iTradeHolderDependDelegate = this.f21084b;
        String quoteCurrencyName = zIsEmpty ? iTradeHolderDependDelegate.mo22365N().getQuoteCurrencyName() : C27041f.m66668h(iTradeHolderDependDelegate.mo22366O().getCurrencyName());
        if (!IUserService.a.get().c() || zIsEmpty) {
            return "-- " + quoteCurrencyName;
        }
        BigDecimal bigDecimalM101662b = this.f21084b.mo22366O().m101662b();
        String strM66669i = C27041f.m66669i(bigDecimalM101662b != null ? C42180b.m92640e(bigDecimalM101662b, null, this.f21084b.mo22365N().getQuoteIncrementPrecision(), false, false, false, 0, null, 125, null) : null, "--");
        Intrinsics.checkNotNull(quoteCurrencyName);
        return C42828b.m93906g(strM66669i, quoteCurrencyName, true, false, 4, null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: t */
    public void mo23233t(@NotNull BaseOrderHolder baseOrderHolder, @NotNull Action action) throws Exception {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        Intrinsics.checkNotNullParameter(action, "action");
        action.run();
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: u */
    public void mo23234u(@NotNull BaseOrderHolder baseOrderHolder) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: v */
    public void mo23235v(@NotNull final String currency, @NotNull BaseOrderHolder baseOrderHolder) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        C43852m.m96591c(C12462a.m23402a(), "transfer", null, null, 12, null);
        IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.core.spot.business.holder.d3
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SpotDiffHolderImp.m23199Z(currency, this);
            }
        }, 1, (Object) null);
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: w */
    public boolean mo23236w(@NotNull BaseOrderHolder baseOrderHolder) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        return true;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    /* JADX INFO: renamed from: y */
    public boolean mo23238y(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, @NotNull Action insufficientCallBack) throws Exception {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        Intrinsics.checkNotNullParameter(insufficientCallBack, "insufficientCallBack");
        if (baseOrderHolder.getNumEditText().getValue().compareTo(baseOrderHolder.mo22953R(false)) <= 0) {
            return true;
        }
        insufficientCallBack.run();
        return false;
    }

    @Override // com.kubi.core.spot.business.holder.ITradeDiffBizDefine
    @NotNull
    /* JADX INFO: renamed from: z */
    public BigDecimal mo23239z(@NotNull BaseOrderHolder baseOrderHolder, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(baseOrderHolder, "baseOrderHolder");
        return C41014a.m89921F(z11 ? this.f21084b.mo22366O().m101662b() : this.f21084b.mo22358I().m101662b(), "0");
    }

    /* JADX INFO: renamed from: U */
    public static final void m23197U(SpotDiffHolderImp spotDiffHolderImp, View view) {
        Integer numM23210S = spotDiffHolderImp.m23210S();
        if (numM23210S != null) {
            final int iIntValue = numM23210S.intValue();
            final String strM66668h = C27041f.m66668h(spotDiffHolderImp.f21084b.mo22365N().getCode());
            IUserService.E0(IUserService.a.get(), (Map) null, new Function0() { // from class: com.kubi.core.spot.business.holder.c3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotDiffHolderImp.m23198V(iIntValue, strM66668h);
                }
            }, 1, (Object) null);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m23206N(BaseOrderHolder baseOrderHolder, boolean z11) {
        String strD;
        Integer numM23210S = m23210S();
        if (numM23210S != null) {
            int iIntValue = numM23210S.intValue();
            String strM66668h = C27041f.m66668h(this.f21084b.mo22365N().getCode());
            IUserService.Companion companion = IUserService.a;
            boolean zC = companion.get().c();
            if (zC) {
                strD = companion.get().d();
            } else {
                strD = "";
            }
            if (zC && !StringsKt.isBlank(strM66668h) && !StringsKt.isBlank(strD)) {
                String strM23202J = m23202J(iIntValue, strM66668h, strD);
                UnifiedCouponAvailableEntity unifiedCouponAvailableEntityM21722f = UnifiedCouponRepository.f20373a.m21722f(iIntValue, strM66668h, strD);
                if (unifiedCouponAvailableEntityM21722f != null) {
                    m23201I(baseOrderHolder, iIntValue, unifiedCouponAvailableEntityM21722f);
                } else {
                    m23211T(baseOrderHolder);
                }
                if (!z11 && Intrinsics.areEqual(this.f21088f, strM23202J)) {
                    return;
                }
                InterfaceC41775x1 interfaceC41775x1 = this.f21087e;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                this.f21088f = strM23202J;
                this.f21087e = C41696j.m91104d(ViewModelKt.getViewModelScope(this.f21083a), null, null, new SpotDiffHolderImp$fetchUnifiedCoupon$1(iIntValue, strM66668h, strD, this, strM23202J, baseOrderHolder, null), 3, null);
                return;
            }
            this.f21088f = null;
            InterfaceC41775x1 interfaceC41775x2 = this.f21087e;
            if (interfaceC41775x2 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x2, null, 1, null);
            }
            this.f21087e = null;
            m23211T(baseOrderHolder);
            return;
        }
        this.f21088f = null;
        InterfaceC41775x1 interfaceC41775x3 = this.f21087e;
        if (interfaceC41775x3 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x3, null, 1, null);
        }
        this.f21087e = null;
        m23211T(baseOrderHolder);
    }

    /* JADX INFO: renamed from: P */
    public final String m23207P(String str, String str2) {
        List listListOf;
        if (C5303w0.m6511a()) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{str2, str});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{str, str2});
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listListOf) {
            if (!StringsKt.isBlank((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, C33627eb.f69716f, null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m23211T(BaseOrderHolder baseOrderHolder) {
        ConstraintLayout constraintLayout;
        C45371a0 binding = baseOrderHolder.getBinding();
        if (binding != null && (constraintLayout = binding.f102006g) != null) {
            constraintLayout.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m23212W(BaseOrderHolder baseOrderHolder, UnifiedCouponPanelState.FeeDeduction feeDeduction) {
        m23215a0(baseOrderHolder, m23207P(feeDeduction.getAmount(), feeDeduction.getCurrency()), R$string.coupon_records);
    }

    /* JADX INFO: renamed from: X */
    public final void m23213X(BaseOrderHolder baseOrderHolder, UnifiedCouponPanelState.InterestCount interestCount) {
        String string = baseOrderHolder.getContext().getString(R$string.kumex_welfare_trial_lot, String.valueOf(interestCount.getCount()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m23200b0(this, baseOrderHolder, string, 0, 4, null);
    }

    /* JADX INFO: renamed from: Y */
    public final void m23214Y(BaseOrderHolder baseOrderHolder, UnifiedCouponPanelState.InterestUsing interestUsing) {
        BaseTextView baseTextView;
        String string = baseOrderHolder.getContext().getString(R$string.margin_coupons_discount, interestUsing.getDiscountRate());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m23200b0(this, baseOrderHolder, StringsKt.replace$default(string, ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, C33627eb.f69716f, false, 4, (Object) null), 0, 4, null);
        C45371a0 binding = baseOrderHolder.getBinding();
        if (binding != null && (baseTextView = binding.f102020u) != null) {
            HighlightTextHelper.f43497a.m54120f(baseTextView, new Pair(HighlightTextHelper.TextTagEnum.SPAN1, new AbsoluteSizeSpan(12, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN2, new AbsoluteSizeSpan(12, true)), new Pair(HighlightTextHelper.TextTagEnum.SPAN3, new AbsoluteSizeSpan(12, true)));
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m23215a0(BaseOrderHolder baseOrderHolder, String str, int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ConstraintLayout constraintLayout;
        C45371a0 binding = baseOrderHolder.getBinding();
        if (binding != null && (constraintLayout = binding.f102006g) != null) {
            constraintLayout.setVisibility(0);
        }
        C45371a0 binding2 = baseOrderHolder.getBinding();
        if (binding2 != null && (baseTextView2 = binding2.f102019t) != null) {
            baseTextView2.setText(i11);
        }
        C45371a0 binding3 = baseOrderHolder.getBinding();
        if (binding3 != null && (baseTextView = binding3.f102020u) != null) {
            baseTextView.setText(str);
        }
    }
}
