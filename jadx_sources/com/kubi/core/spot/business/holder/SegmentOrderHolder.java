package com.kubi.core.spot.business.holder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import com.blankj.utilcode.util.KeyboardUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.biz.submit.TradeSubmitBizContract$UiIntent;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.spot.business.holder.intercept.taskchain.TaskChainEngine;
import com.kubi.core.spot.entity.OrderResultEntity;
import com.kubi.core.utils.C12462a;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.resources.C22912t;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.C23184z2;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.ITradeInputLayoutOperations;
import com.kubi.resources.widget.KcTradeNumAbInputView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradebase.api.segment.ITradeSegmentUiService;
import com.kubi.tradebase.api.segment.SegmentDistributionType;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27086s0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import ge.InterfaceC37872b;
import gf.C37890n;
import h30.C38104b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import j30.C40266c;
import j30.InterfaceC40264a;
import j30.SegmentOrder;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ne.InterfaceC42808a;
import ne.InterfaceC42809b;
import ne.SegmentTradeInputData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p309hd.InterfaceC38170b;
import p429lf.C42180b;
import p557qe.C43721c;
import p557qe.InterfaceC43720b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import pe.C43449e;
import ps.C43533c;
import ps.C43535e;
import v30.C45405r0;
import ve.C45518a;

/* JADX INFO: compiled from: SegmentOrderHolder.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 \u0089\u00012\u00020\u00012\u00020\u0002:\u0002\u0089\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012,\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000208H\u0016J\n\u00109\u001a\u0004\u0018\u000108H\u0016J\n\u0010:\u001a\u0004\u0018\u00010/H\u0016J\b\u0010;\u001a\u00020\u000eH\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000206H\u0017J\b\u0010?\u001a\u000206H\u0016J\b\u0010@\u001a\u000206H\u0002J\b\u0010A\u001a\u000206H\u0002J\u0010\u0010B\u001a\u0002062\u0006\u0010C\u001a\u00020\u000eH\u0002J\b\u0010D\u001a\u000206H\u0002J\b\u0010E\u001a\u000206H\u0002J\b\u0010F\u001a\u000206H\u0002J\b\u0010G\u001a\u000206H\u0002J\u0018\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020KH\u0002J\b\u0010L\u001a\u000206H\u0002J\b\u0010M\u001a\u000206H\u0002J\b\u0010N\u001a\u000206H\u0002J\n\u0010O\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u0010P\u001a\u0002062\u0006\u0010Q\u001a\u00020\u000e2\u0006\u0010R\u001a\u00020SH\u0002J\b\u0010T\u001a\u000206H\u0002J\b\u0010U\u001a\u000206H\u0014J\b\u0010V\u001a\u000206H\u0002J\u0010\u0010W\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010XH\u0002J\b\u0010Z\u001a\u000206H\u0016J\b\u0010[\u001a\u000206H\u0016J\b\u0010\\\u001a\u000206H\u0002J\n\u0010]\u001a\u0004\u0018\u00010^H\u0002J\u0010\u0010_\u001a\u0002062\u0006\u0010`\u001a\u00020^H\u0002J4\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010b\u001a\u00020c2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r2\b\u0010e\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010f\u001a\u0002062\u0006\u0010I\u001a\u00020/H\u0016J\b\u0010g\u001a\u000206H\u0016J\u0010\u0010h\u001a\u0002062\u0006\u0010i\u001a\u00020/H\u0016J\u0014\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0kH\u0016J\b\u0010l\u001a\u000206H\u0016J\u0010\u0010m\u001a\u0002062\u0006\u0010n\u001a\u00020$H\u0016J@\u0010o\u001a\u0002062\u0006\u0010p\u001a\u00020/2\u0006\u0010q\u001a\u00020/2\u0006\u0010r\u001a\u0002042\u0006\u0010s\u001a\u00020/2\u0006\u0010t\u001a\u00020$2\u0006\u0010u\u001a\u0002042\u0006\u0010v\u001a\u000204H\u0016JL\u0010w\u001a\u0002062\u0006\u0010x\u001a\u00020y2:\u0010z\u001a6\u0012\u0015\u0012\u0013\u0018\u00010/¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(}\u0012\u0015\u0012\u0013\u0018\u00010/¢\u0006\f\b{\u0012\b\b|\u0012\u0004\b\b(~\u0012\u0004\u0012\u0002060\fH\u0016J\"\u0010\u007f\u001a\u0002062\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010/2\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010/H\u0002J\u0014\u0010\u0082\u0001\u001a\u0002062\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010/H\u0002J\u0007\u0010\u0083\u0001\u001a\u00020/J\u0007\u0010\u0084\u0001\u001a\u00020/J\t\u0010\u0085\u0001\u001a\u000206H\u0002J\u001b\u0010\u0086\u0001\u001a\u00020/2\u0007\u0010\u0087\u0001\u001a\u00020/2\u0007\u0010\u0088\u0001\u001a\u000204H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR7\u0010\u000b\u001a(\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008a\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/SegmentOrderHolder;", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "Lcom/kubi/tradebase/api/segment/SegmentDistributionDialogHost;", "context", "Landroid/content/Context;", "tradeType", "Lcom/kubi/tradebase/tradetype/TradeType;", "parentBehavior", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "isHorizontal", "", "requestOrderExecutor", "Lkotlin/Function2;", "", "", "Lio/reactivex/Observable;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "interceptionList", "Ljava/util/LinkedList;", "Lcom/kubi/core/spot/business/holder/intercept/taskchain/ITask;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputData;", "Lcom/kubi/core/spot/business/holder/intercept/data/ITradeInputInterceptResult;", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "diffTradeImp", "Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;", "<init>", "(Landroid/content/Context;Lcom/kubi/tradebase/tradetype/TradeType;Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;ZLkotlin/jvm/functions/Function2;Ljava/util/LinkedList;Lcom/kubi/core/biz/submit/TradeSubmitVM;Lcom/kubi/core/spot/business/holder/ITradeDiffBizDefine;)V", "getTradeType", "()Lcom/kubi/tradebase/tradetype/TradeType;", "getRequestOrderExecutor", "()Lkotlin/jvm/functions/Function2;", "viewBinding", "Lcom/kubi/tradecorebiz/databinding/ViewSegmentHolderLayoutBinding;", "isClampingOrderCount", "_distributionType", "Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "value", "currentDistributionType", "getCurrentDistributionType", "()Lcom/kubi/tradebase/api/segment/SegmentDistributionType;", "setCurrentDistributionType", "(Lcom/kubi/tradebase/api/segment/SegmentDistributionType;)V", "hasMinQtyError", "activeBubblePopup", "Landroid/widget/PopupWindow;", "_avgPrice", "Ljava/math/BigDecimal;", "_totalQuoteAmount", "bubbleAutoDismissRunnable", "Ljava/lang/Runnable;", "getLayoutId", "", "initViewBinding", "", "getNumEditText", "Lcom/kubi/resources/widget/TradeInputLayoutProxy;", "getAmountEditText", "getMaxDealAmount", "getTrackOrderType", "getViewBinding", "Landroidx/viewbinding/ViewBinding;", "initView", "onActionTypeChanged", "initDistributionCard", "showAvgPriceTipsDialog", "trackViewClick", "blockId", "showDistributionDialog", "updateDistributionLabel", "updateDistributionValueState", "initInputObservers", "tradePriceTextChanges", FirebaseAnalytics.Param.PRICE, "priceInput", "Lcom/kubi/resources/widget/ITradeInputLayoutOperations;", "checkMinQtyAndShowBubble", "checkPriceRangeAndShowBubble", "syncMinQtyErrorState", "calcMinQtyError", "showBubble", "message", "anchor", "Landroid/view/View;", "dismissBubble", "onDetachedFromWindow", "refreshAvgPrice", "buildOrdersOrNull", "", "Lcom/kubi/tradebase/api/segment/SegmentOrder;", "onSubmitClick", "requestOrder", "wrapperSegmentOrderConfirm", "createSegmentOrderParams", "Lcom/kubi/core/spot/business/holder/intercept/data/SegmentTradeInputData;", "realRequestOrder", "data", "requestOrderApi", "marketApi", "Lcom/kubi/core/spot/api/MarketApi;", "requestEntity", "fingerEvent", "onClickPriceCallBack", "onSymbolChanged", "onBboDataGet", KlineFlutterMiniConstants.PROP_LATEST_PRICE, "getParamsForReport", "", "onLegalCurrencyChanged", "setDistributionType", "type", "setPreviewForDialog", "priceMin", "priceMax", "orderCount", "totalQty", "distributionType", "pricePrecision", "qtyPrecision", "observeCostForMarginEstimate", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onChanged", "Lkotlin/ParameterName;", "name", "buyValue", "sellValue", "updateAvgPriceCalculateDiff", "avgPrice", "totalQuoteAmount", "fetchMaxAvailableByAvgPrice", "getAvgPrice", "getTotalQuoteAmount", "updatePresetData", "beforeCheckFee", "amountValue", "scale", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nSegmentOrderHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentOrderHolder.kt\ncom/kubi/core/spot/business/holder/SegmentOrderHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,804:1\n13472#2,2:805\n1869#3,2:807\n808#3,11:810\n1#4:809\n*S KotlinDebug\n*F\n+ 1 SegmentOrderHolder.kt\ncom/kubi/core/spot/business/holder/SegmentOrderHolder\n*L\n332#1:805,2\n346#1:807,2\n593#1:810,11\n*E\n"})
public final class SegmentOrderHolder extends BaseOrderHolder implements InterfaceC40264a {

    /* JADX INFO: renamed from: A */
    @NotNull
    public static final Companion f21067A = new Companion(null);

    /* JADX INFO: renamed from: B */
    @NotNull
    public static final BigDecimal f21068B = new BigDecimal("10000000");

    /* JADX INFO: renamed from: o */
    @NotNull
    public final TradeType f21069o;

    /* JADX INFO: renamed from: p */
    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> f21070p;

    /* JADX INFO: renamed from: q */
    @NotNull
    public final LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> f21071q;

    /* JADX INFO: renamed from: r */
    @NotNull
    public final TradeSubmitVM f21072r;

    /* JADX INFO: renamed from: s */
    public C45405r0 f21073s;

    /* JADX INFO: renamed from: t */
    public boolean f21074t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public SegmentDistributionType f21075u;

    /* JADX INFO: renamed from: v */
    public boolean f21076v;

    /* JADX INFO: renamed from: w */
    @Nullable
    public PopupWindow f21077w;

    /* JADX INFO: renamed from: x */
    @Nullable
    public BigDecimal f21078x;

    /* JADX INFO: renamed from: y */
    @Nullable
    public BigDecimal f21079y;

    /* JADX INFO: renamed from: z */
    @NotNull
    public final Runnable f21080z;

    /* JADX INFO: compiled from: SegmentOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/core/spot/business/holder/SegmentOrderHolder$Companion;", "", "<init>", "()V", "BUBBLE_AUTO_DISMISS_MS", "", "MAX_ORDER_COUNT_DIGITS", "", "MAX_PRICE", "Ljava/math/BigDecimal;", "MAX_QTY_INTEGER_DIGITS", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SegmentOrderHolder$b */
    /* JADX INFO: compiled from: SegmentOrderHolder.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/core/spot/business/holder/SegmentOrderHolder$initInputObservers$1$1", "Lcom/kubi/utils/SimpleObserver;", "", "onNext", "", "t", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12306b extends C27086s0<CharSequence> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f21082c;

        public C12306b(Object obj) {
            this.f21082c = obj;
        }

        @Override // com.kubi.utils.C27086s0, io.reactivex.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(CharSequence t11) {
            Intrinsics.checkNotNullParameter(t11, "t");
            if (SegmentOrderHolder.this.f21074t) {
                return;
            }
            SegmentOrderHolder.this.m23166H1();
            SegmentOrderHolder.this.m23140T1();
            SegmentOrderHolder.this.m23169N1();
            Object obj = this.f21082c;
            C45405r0 c45405r0 = SegmentOrderHolder.this.f21073s;
            C45405r0 c45405r1 = null;
            if (c45405r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r0 = null;
            }
            if (!Intrinsics.areEqual(obj, c45405r0.f102319e)) {
                Object obj2 = this.f21082c;
                C45405r0 c45405r2 = SegmentOrderHolder.this.f21073s;
                if (c45405r2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                } else {
                    c45405r1 = c45405r2;
                }
                if (!Intrinsics.areEqual(obj2, c45405r1.f102318d)) {
                    return;
                }
            }
            SegmentOrderHolder.this.m23171P1(((ITradeInputLayoutOperations) this.f21082c).getValue(), (ITradeInputLayoutOperations) this.f21082c);
        }
    }

    public /* synthetic */ SegmentOrderHolder(Context context, TradeType tradeType, ITradeHolderDependDelegate iTradeHolderDependDelegate, boolean z11, Function2 function2, LinkedList linkedList, TradeSubmitVM tradeSubmitVM, ITradeDiffBizDefine iTradeDiffBizDefine, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        TradeSubmitVM tradeSubmitVM2;
        ITradeDiffBizDefine spotDiffHolderImp;
        boolean z12 = (i11 & 8) != 0 ? false : z11;
        if ((i11 & 128) != 0) {
            tradeSubmitVM2 = tradeSubmitVM;
            spotDiffHolderImp = new SpotDiffHolderImp(tradeSubmitVM2, iTradeHolderDependDelegate, z12);
        } else {
            tradeSubmitVM2 = tradeSubmitVM;
            spotDiffHolderImp = iTradeDiffBizDefine;
        }
        this(context, tradeType, iTradeHolderDependDelegate, z12, function2, linkedList, tradeSubmitVM2, spotDiffHolderImp);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    public TradeInputLayoutProxy getAmountEditText() {
        return null;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @Nullable
    public BigDecimal getMaxDealAmount() {
        return null;
    }

    /* JADX INFO: renamed from: com.kubi.core.spot.business.holder.SegmentOrderHolder$a */
    /* JADX INFO: compiled from: SegmentOrderHolder.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12305a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentDistributionType.values().length];
            try {
                iArr[SegmentDistributionType.Uniform.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentDistributionType.Increasing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentDistributionType.Decreasing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: A1 */
    public static final Unit m23123A1(SegmentOrderHolder segmentOrderHolder, View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!z11) {
            segmentOrderHolder.m23180m1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B1 */
    public static final Unit m23124B1(SegmentOrderHolder segmentOrderHolder, View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!z11) {
            segmentOrderHolder.m23181n1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C1 */
    public static final Unit m23125C1(SegmentOrderHolder segmentOrderHolder, View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!z11) {
            segmentOrderHolder.m23181n1();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F1 */
    public static final CharSequence m23127F1(SegmentOrder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getPrice().toPlainString() + ':' + it.getQty().toPlainString();
    }

    /* JADX INFO: renamed from: J1 */
    private final void m23129J1() {
        AlertDialogFragmentHelper alertDialogFragmentHelperNewInstanceAlert = AlertDialogFragmentHelper.f43512a1.newInstanceAlert();
        C27017c c27017c = C27017c.f54310a;
        alertDialogFragmentHelperNewInstanceAlert.m54168Y4(c27017c.m66516f(R$string.kumex_segmented_average_price, new Object[0])).m54146C4(R$drawable.ic2_close_withcircle_24).m54156M4(c27017c.m66516f(R$string.kumex_segmented_average_price_desc, new Object[0])).m54162S4(R$string.already_know, new DialogInterface.OnClickListener() { // from class: com.kubi.core.spot.business.holder.a3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SegmentOrderHolder.m23130K1(dialogInterface, i11);
            }
        }).m54193s3(getF21029b().mo22357H(), "PriceStrategyDialog");
        m23170O1("averageEntryPriceDesc");
    }

    /* JADX INFO: renamed from: M1 */
    private final void m23131M1() {
        Integer intOrNull;
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        BigDecimal value = c45405r0.f102319e.getValue();
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        BigDecimal value2 = c45405r2.f102318d.getValue();
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        Editable text = c45405r3.f102317c.getEditText().getText();
        String string = text != null ? text.toString() : null;
        int iIntValue = (string == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r4;
        }
        BigDecimal value3 = c45405r1.f102316b.getValue();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (value.compareTo(bigDecimal) <= 0 || iIntValue < 2 || value3.compareTo(bigDecimal) <= 0) {
            return;
        }
        if (value2.compareTo(value) <= 0) {
            ToastCompat.m66437C(R$string.kumex_segment_input_price_verification);
            return;
        }
        ITradeSegmentUiService iTradeSegmentUiService = ITradeSegmentUiService.f51506a.get();
        BaseFragment baseFragmentMo22357H = getF21029b().mo22357H();
        SegmentDistributionType currentDistributionType = getCurrentDistributionType();
        String baseCurrencyName = symbolInfoEntityMo22365N.getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        String quoteCurrencyName = symbolInfoEntityMo22365N.getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        iTradeSegmentUiService.mo63108a(baseFragmentMo22357H, value3, value, value2, iIntValue, currentDistributionType, quoteCurrencyName, baseCurrencyName, symbolInfoEntityMo22365N.getPriceIncrementPrecision(), symbolInfoEntityMo22365N.getBaseIncrementPrecision(), new BigDecimal(String.valueOf(symbolInfoEntityMo22365N.getBaseMinSize())), false, C12462a.m23402a(), getF21036i() ? "buy" : "sell", this, "SegmentDistributionDialog");
    }

    /* JADX INFO: renamed from: R1 */
    public static /* synthetic */ void m23137R1(SegmentOrderHolder segmentOrderHolder, BigDecimal bigDecimal, BigDecimal bigDecimal2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = null;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = null;
        }
        segmentOrderHolder.m23172Q1(bigDecimal, bigDecimal2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX INFO: renamed from: T1 */
    public final void m23140T1() {
        boolean z11;
        String string;
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        String inputNumberStr = c45405r0.f102319e.getInputNumberStr();
        if ((inputNumberStr != null ? StringsKt.toBigDecimalOrNull(inputNumberStr) : null) == null) {
            z11 = false;
        } else {
            C45405r0 c45405r2 = this.f21073s;
            if (c45405r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r2 = null;
            }
            String inputNumberStr2 = c45405r2.f102318d.getInputNumberStr();
            if ((inputNumberStr2 != null ? StringsKt.toBigDecimalOrNull(inputNumberStr2) : null) == null) {
                z11 = false;
            } else {
                C45405r0 c45405r3 = this.f21073s;
                if (c45405r3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                    c45405r3 = null;
                }
                Editable text = c45405r3.f102317c.getEditText().getText();
                if (((text == null || (string = text.toString()) == null) ? null : StringsKt.toIntOrNull(string)) == null) {
                    z11 = false;
                } else {
                    C45405r0 c45405r4 = this.f21073s;
                    if (c45405r4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                        c45405r4 = null;
                    }
                    String inputNumberStr3 = c45405r4.f102316b.getInputNumberStr();
                    if ((inputNumberStr3 != null ? StringsKt.toBigDecimalOrNull(inputNumberStr3) : null) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        int i11 = z11 ? R$color.c_text : R$color.c_text30;
        int i12 = z11 ? R$color.c_text40 : R$color.c_text30;
        C45405r0 c45405r5 = this.f21073s;
        if (c45405r5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r5 = null;
        }
        BaseTextView baseTextView = c45405r5.f102327m;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        baseTextView.setTextColor(C27046k.m66699n(context, i11));
        C45405r0 c45405r6 = this.f21073s;
        if (c45405r6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r6 = null;
        }
        Drawable[] compoundDrawablesRelative = c45405r6.f102327m.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        for (Drawable drawable : compoundDrawablesRelative) {
            if (drawable != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                drawable.setTint(C27046k.m66699n(context2, i12));
            }
        }
        C45405r0 c45405r7 = this.f21073s;
        if (c45405r7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r7 = null;
        }
        c45405r7.f102327m.setClickable(z11);
        C45405r0 c45405r8 = this.f21073s;
        if (c45405r8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r8;
        }
        c45405r1.f102322h.setClickable(z11);
    }

    /* JADX INFO: renamed from: W1 */
    public static final Unit m23144W1(SegmentOrderHolder segmentOrderHolder, SegmentTradeInputData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        segmentOrderHolder.m23165E1(it);
        return Unit.INSTANCE;
    }

    private final SegmentDistributionType getCurrentDistributionType() {
        SegmentDistributionType segmentDistributionType = this.f21075u;
        return segmentDistributionType == null ? SegmentDistributionType.Uniform : segmentDistributionType;
    }

    /* JADX INFO: renamed from: s1 */
    public static final Unit m23158s1(final SegmentOrderHolder segmentOrderHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C45405r0 c45405r0 = segmentOrderHolder.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        KeyboardUtils.m6034f(c45405r0.f102327m);
        C22912t.m54417o(segmentOrderHolder, new Runnable() { // from class: com.kubi.core.spot.business.holder.m2
            @Override // java.lang.Runnable
            public final void run() {
                SegmentOrderHolder.m23159t1(this.f21165b);
            }
        }, 300L);
        return Unit.INSTANCE;
    }

    private final void setCurrentDistributionType(SegmentDistributionType segmentDistributionType) {
        this.f21075u = segmentDistributionType;
    }

    /* JADX INFO: renamed from: u1 */
    public static final Unit m23160u1(final SegmentOrderHolder segmentOrderHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C45405r0 c45405r0 = segmentOrderHolder.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        KeyboardUtils.m6034f(c45405r0.f102327m);
        C22912t.m54417o(segmentOrderHolder, new Runnable() { // from class: com.kubi.core.spot.business.holder.n2
            @Override // java.lang.Runnable
            public final void run() {
                SegmentOrderHolder.m23161v1(this.f21170b);
            }
        }, 300L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w1 */
    public static final Unit m23162w1(SegmentOrderHolder segmentOrderHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        segmentOrderHolder.m23129J1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x1 */
    public static final Unit m23163x1(SegmentOrderHolder segmentOrderHolder, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ITradeSegmentUiService iTradeSegmentUiService = ITradeSegmentUiService.f51506a.get();
        FragmentManager childFragmentManager = segmentOrderHolder.getF21029b().mo22357H().getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iTradeSegmentUiService.mo63109c(childFragmentManager, "SegmentDistributionInfoDialog");
        segmentOrderHolder.m23170O1("orderAllocationDesc");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z1 */
    public static final Unit m23164z1(SegmentOrderHolder segmentOrderHolder, View view, boolean z11) {
        Integer intOrNull;
        int iCoerceIn;
        String string;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        if (!z11) {
            C45405r0 c45405r0 = segmentOrderHolder.f21073s;
            C45405r0 c45405r1 = null;
            if (c45405r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r0 = null;
            }
            String inputNumberStr = c45405r0.f102317c.getInputNumberStr();
            if (((inputNumberStr == null || (string = StringsKt.trim((CharSequence) inputNumberStr).toString()) == null) ? 0 : string.length()) > 4) {
                intOrNull = 21;
            } else {
                intOrNull = inputNumberStr != null ? StringsKt.toIntOrNull(inputNumberStr) : null;
            }
            if (intOrNull != null && (iCoerceIn = RangesKt.coerceIn(intOrNull.intValue(), 2, 20)) != intOrNull.intValue()) {
                segmentOrderHolder.f21074t = true;
                C45405r0 c45405r2 = segmentOrderHolder.f21073s;
                if (c45405r2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                    c45405r2 = null;
                }
                c45405r2.f102317c.getEditText().setText(String.valueOf(iCoerceIn));
                C45405r0 c45405r3 = segmentOrderHolder.f21073s;
                if (c45405r3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                } else {
                    c45405r1 = c45405r3;
                }
                c45405r1.f102317c.getEditText().setSelection(String.valueOf(iCoerceIn).length());
                segmentOrderHolder.f21074t = false;
            }
            segmentOrderHolder.m23180m1();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: A0 */
    public void mo22940A0(@NotNull BigDecimal price) {
        Intrinsics.checkNotNullParameter(price, "price");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (price.compareTo(bigDecimal) <= 0) {
            return;
        }
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        if (c45405r0.f102319e.getValue().compareTo(bigDecimal) <= 0) {
            C45405r0 c45405r2 = this.f21073s;
            if (c45405r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            } else {
                c45405r1 = c45405r2;
            }
            c45405r1.f102319e.mo54627b(price, true);
            return;
        }
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r3;
        }
        c45405r1.f102318d.mo54627b(price, true);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: D0 */
    public void mo22943D0() {
        String string;
        Integer intOrNull;
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        BigDecimal value = c45405r0.f102319e.getValue();
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        BigDecimal value2 = c45405r2.f102318d.getValue();
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        Editable text = c45405r3.f102317c.getEditText().getText();
        int iIntValue = (text == null || (string = text.toString()) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) ? 0 : intOrNull.intValue();
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r4;
        }
        BigDecimal value3 = c45405r1.f102316b.getValue();
        ITradeDiffBizDefine f21032e = getF21032e();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (f21032e.mo23237x(context).mo95655a(getF21029b(), value, value2, iIntValue, value3, getAvgPrice(), getCurrentDistributionType(), this.f21076v, new Function0() { // from class: com.kubi.core.spot.business.holder.o2
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SegmentOrderHolder.m23126D1(this.f21174b);
            }
        })) {
            return;
        }
        m23167I1();
    }

    /* JADX INFO: renamed from: E1 */
    public final void m23165E1(SegmentTradeInputData c42814g) {
        try {
            List listM88647c = C40266c.f89505a.m88647c(c42814g.getPriceMin(), c42814g.getPriceMax(), c42814g.getOrderCount(), c42814g.getTotalQty(), getCurrentDistributionType(), getF21029b().mo22365N().getPriceIncrementPrecision(), getF21029b().mo22365N().getBaseIncrementPrecision(), (128 & 128) != 0 ? null : null);
            if (listM88647c.isEmpty()) {
                return;
            }
            C45518a.m100507a("开始创建分段订单，共 " + listM88647c.size() + " 笔", "SegmentOrderHolder");
            String strJoinToString$default = CollectionsKt.joinToString$default(listM88647c, ",", null, null, 0, null, new Function1() { // from class: com.kubi.core.spot.business.holder.q2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SegmentOrderHolder.m23127F1((SegmentOrder) obj);
                }
            }, 30, null);
            Pair pairM90091to = TuplesKt.m90091to("symbol", getF21029b().mo22365N().getCode());
            String upperCase = (getF21036i() ? "buy" : "sell").toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            getF21029b().mo22386r1(MapsKt.mutableMapOf(pairM90091to, TuplesKt.m90091to("side", upperCase), TuplesKt.m90091to(FirebaseAnalytics.Param.ITEMS, strJoinToString$default), TuplesKt.m90091to("HEADER_FINGER_EVENT", "unified-trade-spot")), this, new Function2() { // from class: com.kubi.core.spot.business.holder.r2
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SegmentOrderHolder.m23128G1(this.f21190b, ((Boolean) obj).booleanValue(), (String) obj2);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    /* JADX INFO: renamed from: G */
    public BigDecimal mo22946G(@NotNull BigDecimal amountValue, int i11) {
        Intrinsics.checkNotNullParameter(amountValue, "amountValue");
        return amountValue;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m23166H1() {
        List<SegmentOrder> listM23178k1 = m23178k1();
        C45405r0 c45405r0 = null;
        if (listM23178k1 == null) {
            C45405r0 c45405r1 = this.f21073s;
            if (c45405r1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r1 = null;
            }
            c45405r1.f102325k.setText("--");
            m23137R1(this, null, null, 3, null);
            return;
        }
        int priceIncrementPrecision = getF21029b().mo22365N().getPriceIncrementPrecision();
        C40266c c40266c = C40266c.f89505a;
        BigDecimal bigDecimalM88648e = c40266c.m88648e(listM23178k1, priceIncrementPrecision);
        if (bigDecimalM88648e == null) {
            C45405r0 c45405r2 = this.f21073s;
            if (c45405r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r2 = null;
            }
            c45405r2.f102325k.setText("--");
            m23137R1(this, null, null, 3, null);
            return;
        }
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r0 = c45405r3;
        }
        c45405r0.f102325k.setText(C42180b.m92640e(bigDecimalM88648e, null, priceIncrementPrecision, false, false, false, 0, null, 125, null));
        m23172Q1(bigDecimalM88648e, c40266c.m88654l(listM23178k1));
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m23172Q1(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        this.f21078x = bigDecimal;
        m23184q1(bigDecimal);
        this.f21079y = bigDecimal2;
        getF21032e().mo23230q(this);
        getF21032e().mo23234u(this);
    }

    /* JADX INFO: renamed from: S1 */
    public final void m23173S1() {
        int i11;
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        BaseTextView baseTextView = c45405r0.f102327m;
        Context context = getContext();
        int i12 = C12305a.$EnumSwitchMapping$0[getCurrentDistributionType().ordinal()];
        if (i12 == 1) {
            i11 = R$string.kumex_segment_average;
        } else if (i12 == 2) {
            i11 = R$string.kumex_segment_incremental;
        } else {
            if (i12 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = R$string.kumex_segment_decreasing;
        }
        baseTextView.setText(context.getString(i11));
    }

    /* JADX INFO: renamed from: U1 */
    public final void m23174U1() {
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        c45405r0.f102319e.setLowValue(DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null));
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        c45405r2.f102318d.setLowValue(DowngradeExKt.m66535e(getF21029b().mo22365N().getPriceIncrement(), null, 1, null));
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        c45405r3.f102319e.setInitValue(new BigDecimal(String.valueOf(getF21029b().getF20635f0().getPrice())));
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r4;
        }
        c45405r1.f102318d.setInitValue(new BigDecimal(String.valueOf(getF21029b().getF20635f0().getPrice())));
    }

    @Override // j30.InterfaceC40264a
    /* JADX INFO: renamed from: W2 */
    public void mo23176W2(@NotNull BigDecimal priceMin, @NotNull BigDecimal priceMax, int i11, @NotNull BigDecimal totalQty, @NotNull SegmentDistributionType distributionType, int i12, int i13) {
        Intrinsics.checkNotNullParameter(priceMin, "priceMin");
        Intrinsics.checkNotNullParameter(priceMax, "priceMax");
        Intrinsics.checkNotNullParameter(totalQty, "totalQty");
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
    }

    @Override // com.kubi.core.spot.helper.ITradeTypeRequestOrder
    @NotNull
    /* JADX INFO: renamed from: d */
    public Observable<OrderResultEntity> mo23038d(@NotNull InterfaceC37872b marketApi, @NotNull Map<String, String> requestEntity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(marketApi, "marketApi");
        Intrinsics.checkNotNullParameter(requestEntity, "requestEntity");
        return this.f21070p.invoke(requestEntity, str);
    }

    @NotNull
    public final BigDecimal getAvgPrice() {
        BigDecimal bigDecimal = this.f21078x;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    public int getLayoutId() {
        return R$layout.view_segment_holder_layout;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public TradeInputLayoutProxy getNumEditText() {
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        TradeInputLayoutProxy etNumber = c45405r0.f102316b;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        return etNumber;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public Map<String, String> getParamsForReport() {
        String string;
        HashMap map = new HashMap();
        map.put("symbol", getF21029b().mo22365N().getCode());
        map.put("side", getF21036i() ? "buy" : "sell");
        map.put("type", "segment");
        map.put("orderType", getTrackOrderType());
        map.put("tradeType", getF21032e().mo23220g());
        map.put("distribution", getCurrentDistributionType().name());
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        Editable text = c45405r0.f102317c.getEditText().getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        map.put("orderCount", string);
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        map.put("priceMin", c45405r2.f102319e.getValue().toPlainString());
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        map.put("priceMax", c45405r3.f102318d.getValue().toPlainString());
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r4;
        }
        map.put("totalQty", c45405r1.f102316b.getValue().toPlainString());
        return map;
    }

    @NotNull
    public final Function2<Map<String, String>, String, Observable<OrderResultEntity>> getRequestOrderExecutor() {
        return this.f21070p;
    }

    @NotNull
    public final BigDecimal getTotalQuoteAmount() {
        BigDecimal bigDecimal = this.f21079y;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return ZERO;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public String getTrackOrderType() {
        return "segment";
    }

    @NotNull
    /* JADX INFO: renamed from: getTradeType, reason: from getter */
    public final TradeType getF21069o() {
        return this.f21069o;
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @NotNull
    public ViewBinding getViewBinding() {
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 != null) {
            return c45405r0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        return null;
    }

    @Override // j30.InterfaceC40264a
    /* JADX INFO: renamed from: j */
    public void mo23177j(@NotNull LifecycleOwner lifecycleOwner, @NotNull Function2<? super BigDecimal, ? super BigDecimal, Unit> onChanged) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(onChanged, "onChanged");
    }

    /* JADX INFO: renamed from: k1 */
    public final List<SegmentOrder> m23178k1() {
        String string;
        Integer intOrNull;
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        BigDecimal value = c45405r0.f102319e.getValue();
        C45405r0 c45405r1 = this.f21073s;
        if (c45405r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r1 = null;
        }
        BigDecimal value2 = c45405r1.f102318d.getValue();
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        Editable text = c45405r2.f102317c.getEditText().getText();
        if (text != null && (string = text.toString()) != null && (intOrNull = StringsKt.toIntOrNull(string)) != null) {
            int iIntValue = intOrNull.intValue();
            C45405r0 c45405r3 = this.f21073s;
            if (c45405r3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r3 = null;
            }
            BigDecimal value3 = c45405r3.f102316b.getValue();
            BigDecimal bigDecimal = BigDecimal.ZERO;
            if (value.compareTo(bigDecimal) > 0 && value2.compareTo(value) > 0 && iIntValue >= 2 && value3.compareTo(bigDecimal) > 0) {
                try {
                    return C40266c.f89505a.m88647c(value, value2, iIntValue, value3, getCurrentDistributionType(), getF21029b().mo22365N().getPriceIncrementPrecision(), getF21029b().mo22365N().getBaseIncrementPrecision(), (128 & 128) != 0 ? null : null);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l1 */
    public final String m23179l1() {
        BigDecimal bigDecimalOrNull;
        String string;
        Integer intOrNull;
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        String inputNumberStr = c45405r0.f102316b.getInputNumberStr();
        if (inputNumberStr != null && (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(inputNumberStr)) != null) {
            if (bigDecimalOrNull.compareTo(BigDecimal.ZERO) <= 0) {
                bigDecimalOrNull = null;
            }
            if (bigDecimalOrNull != null) {
                C45405r0 c45405r2 = this.f21073s;
                if (c45405r2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                    c45405r2 = null;
                }
                Editable text = c45405r2.f102317c.getEditText().getText();
                if (text != null && (string = text.toString()) != null && (intOrNull = StringsKt.toIntOrNull(string)) != null) {
                    if (intOrNull.intValue() < 2) {
                        intOrNull = null;
                    }
                    if (intOrNull != null) {
                        int iIntValue = intOrNull.intValue();
                        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
                        BigDecimal bigDecimal = new BigDecimal(String.valueOf(symbolInfoEntityMo22365N.getBaseMinSize()));
                        int baseIncrementPrecision = symbolInfoEntityMo22365N.getBaseIncrementPrecision();
                        C40266c c40266c = C40266c.f89505a;
                        BigDecimal bigDecimalM88651i = c40266c.m88651i(iIntValue, getCurrentDistributionType(), bigDecimal, baseIncrementPrecision);
                        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(symbolInfoEntityMo22365N.getQuoteCurrency())));
                        SegmentDistributionType currentDistributionType = getCurrentDistributionType();
                        C45405r0 c45405r3 = this.f21073s;
                        if (c45405r3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                            c45405r3 = null;
                        }
                        BigDecimal bigDecimalMax = bigDecimalM88651i.max(c40266c.m88652j(iIntValue, currentDistributionType, bigDecimal2, c45405r3.f102319e.getValue(), baseIncrementPrecision)).max(bigDecimal);
                        if (bigDecimalOrNull.compareTo(bigDecimalMax) < 0) {
                            C45405r0 c45405r4 = this.f21073s;
                            if (c45405r4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                            } else {
                                c45405r1 = c45405r4;
                            }
                            Context context = c45405r1.f102316b.getContext();
                            int i11 = R$string.futures_min_quantity_for_make_order;
                            Intrinsics.checkNotNull(bigDecimalMax);
                            return context.getString(i11, C42180b.m92640e(bigDecimalMax, null, baseIncrementPrecision, false, false, false, 0, null, 125, null), symbolInfoEntityMo22365N.getBaseCurrencyName());
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n1 */
    public final void m23181n1() {
        BigDecimal bigDecimalOrNull;
        BigDecimal bigDecimalOrNull2;
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        String inputNumberStr = c45405r0.f102319e.getInputNumberStr();
        if (inputNumberStr == null || (bigDecimalOrNull = StringsKt.toBigDecimalOrNull(inputNumberStr)) == null) {
            return;
        }
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        String inputNumberStr2 = c45405r2.f102318d.getInputNumberStr();
        if (inputNumberStr2 == null || (bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(inputNumberStr2)) == null) {
            return;
        }
        if (bigDecimalOrNull2.compareTo(bigDecimalOrNull) > 0) {
            m23183p1();
            return;
        }
        String string = getContext().getString(R$string.kumex_segment_input_price_verification);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r3;
        }
        KcTradeNumAbInputView etPriceMax = c45405r1.f102318d;
        Intrinsics.checkNotNullExpressionValue(etPriceMax, "etPriceMax");
        m23168L1(string, etPriceMax);
    }

    /* JADX INFO: renamed from: o1 */
    public final SegmentTradeInputData m23182o1() {
        String string;
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        Editable text = c45405r0.f102317c.getEditText().getText();
        if (text == null || (string = text.toString()) == null) {
            return null;
        }
        Integer intOrNull = StringsKt.toIntOrNull(string);
        if (intOrNull == null) {
            return null;
        }
        int iIntValue = intOrNull.intValue();
        ITradeHolderDependDelegate f21029b = getF21029b();
        C45405r0 c45405r1 = this.f21073s;
        if (c45405r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r1 = null;
        }
        BigDecimal value = c45405r1.f102319e.getValue();
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        BigDecimal value2 = c45405r2.f102318d.getValue();
        C45405r0 c45405r3 = null;
        BigDecimal avgPrice = getAvgPrice();
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r3 = c45405r4;
        }
        BigDecimal value3 = c45405r3.f102316b.getValue();
        SegmentDistributionType currentDistributionType = getCurrentDistributionType();
        boolean f21036i = getF21036i();
        ITradeDiffBizDefine f21032e = getF21032e();
        String quoteCurrencyName = getF21029b().mo22365N().getQuoteCurrencyName();
        Intrinsics.checkNotNullExpressionValue(quoteCurrencyName, "getQuoteCurrencyName(...)");
        String baseCurrencyName = getF21029b().mo22365N().getBaseCurrencyName();
        Intrinsics.checkNotNullExpressionValue(baseCurrencyName, "getBaseCurrencyName(...)");
        return new SegmentTradeInputData(f21029b, value, value2, avgPrice, iIntValue, value3, currentDistributionType, f21036i, this, f21032e, quoteCurrencyName, baseCurrencyName);
    }

    /* JADX INFO: renamed from: p1 */
    public final void m23183p1() {
        removeCallbacks(this.f21080z);
        PopupWindow popupWindow = this.f21077w;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f21077w = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q1 */
    public final void m23184q1(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2;
        if (Intrinsics.areEqual(((UiState) this.f21072r.getState()).getPanelModel(), InterfaceC38170b.b.f85867a)) {
            bigDecimal2 = bigDecimal;
        } else {
            BigDecimal inputBuyPrice = getF21036i() ? bigDecimal : ((UiState) this.f21072r.getState()).getInputBuyPrice();
            if (getF21036i()) {
                bigDecimal = ((UiState) this.f21072r.getState()).getInputSellPrice();
            }
            BigDecimal bigDecimal3 = inputBuyPrice;
            bigDecimal2 = bigDecimal;
            bigDecimal = bigDecimal3;
        }
        this.f21072r.m22455B0(new TradeSubmitBizContract$UiIntent.UpdateInputPrice(bigDecimal, bigDecimal2));
    }

    /* JADX INFO: renamed from: r1 */
    public final void m23185r1() {
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        c45405r0.f102324j.setNeedDash(true);
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        c45405r2.f102326l.setNeedDash(true);
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        BaseTextView tvDistributionValue = c45405r3.f102327m;
        Intrinsics.checkNotNullExpressionValue(tvDistributionValue, "tvDistributionValue");
        ViewExtKt.m66575f(tvDistributionValue, new Function1() { // from class: com.kubi.core.spot.business.holder.w2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentOrderHolder.m23158s1(this.f21209b, (View) obj);
            }
        });
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r4 = null;
        }
        LinearLayout llDistributionRow = c45405r4.f102322h;
        Intrinsics.checkNotNullExpressionValue(llDistributionRow, "llDistributionRow");
        ViewExtKt.m66575f(llDistributionRow, new Function1() { // from class: com.kubi.core.spot.business.holder.x2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentOrderHolder.m23160u1(this.f21213b, (View) obj);
            }
        });
        C45405r0 c45405r5 = this.f21073s;
        if (c45405r5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r5 = null;
        }
        DashTextView tvAvgPriceLabel = c45405r5.f102324j;
        Intrinsics.checkNotNullExpressionValue(tvAvgPriceLabel, "tvAvgPriceLabel");
        ViewExtKt.m66575f(tvAvgPriceLabel, new Function1() { // from class: com.kubi.core.spot.business.holder.y2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentOrderHolder.m23162w1(this.f21217b, (View) obj);
            }
        });
        C45405r0 c45405r6 = this.f21073s;
        if (c45405r6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r6;
        }
        DashTextView tvDistributionLabel = c45405r1.f102326l;
        Intrinsics.checkNotNullExpressionValue(tvDistributionLabel, "tvDistributionLabel");
        ViewExtKt.m66575f(tvDistributionLabel, new Function1() { // from class: com.kubi.core.spot.business.holder.z2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentOrderHolder.m23163x1(this.f21221b, (View) obj);
            }
        });
        m23173S1();
        m23140T1();
    }

    @Override // j30.InterfaceC40264a
    public void setDistributionType(@NotNull SegmentDistributionType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        setCurrentDistributionType(type);
        m23173S1();
        m23166H1();
        m23180m1();
    }

    /* JADX INFO: renamed from: y1 */
    public final void m23186y1() {
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        KcTradeNumAbInputView etPriceMin = c45405r0.f102319e;
        Intrinsics.checkNotNullExpressionValue(etPriceMin, "etPriceMin");
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        KcTradeNumAbInputView etPriceMax = c45405r2.f102318d;
        Intrinsics.checkNotNullExpressionValue(etPriceMax, "etPriceMax");
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        KcTradeNumAbInputView etOrderCount = c45405r3.f102317c;
        Intrinsics.checkNotNullExpressionValue(etOrderCount, "etOrderCount");
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r4;
        }
        TradeInputLayoutProxy etNumber = c45405r1.f102316b;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        for (Object obj : CollectionsKt.listOf(etPriceMin, etPriceMax, etOrderCount, etNumber)) {
            C23184z2.m55630j(((ITradeInputLayoutOperations) obj).getEditText()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C12306b(obj));
        }
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: z0 */
    public void mo22971z0(@NotNull BigDecimal latestPrice) {
        Intrinsics.checkNotNullParameter(latestPrice, "latestPrice");
        super.mo22971z0(latestPrice);
        m23174U1();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentOrderHolder(@NotNull Context context, @NotNull TradeType tradeType, @NotNull ITradeHolderDependDelegate parentBehavior, boolean z11, @NotNull Function2<? super Map<String, String>, ? super String, ? extends Observable<OrderResultEntity>> requestOrderExecutor, @NotNull LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> interceptionList, @NotNull TradeSubmitVM submitVM, @NotNull ITradeDiffBizDefine diffTradeImp) {
        super(context, parentBehavior, false, z11, diffTradeImp, submitVM);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(parentBehavior, "parentBehavior");
        Intrinsics.checkNotNullParameter(requestOrderExecutor, "requestOrderExecutor");
        Intrinsics.checkNotNullParameter(interceptionList, "interceptionList");
        Intrinsics.checkNotNullParameter(submitVM, "submitVM");
        Intrinsics.checkNotNullParameter(diffTradeImp, "diffTradeImp");
        this.f21069o = tradeType;
        this.f21070p = requestOrderExecutor;
        this.f21071q = interceptionList;
        this.f21072r = submitVM;
        this.f21080z = new Runnable() { // from class: com.kubi.core.spot.business.holder.l2
            @Override // java.lang.Runnable
            public final void run() {
                SegmentOrderHolder.m23157j1(this.f21160b);
            }
        };
    }

    /* JADX INFO: renamed from: D1 */
    public static final Unit m23126D1(SegmentOrderHolder segmentOrderHolder) {
        segmentOrderHolder.m23180m1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G1 */
    public static final Unit m23128G1(SegmentOrderHolder segmentOrderHolder, boolean z11, String str) {
        segmentOrderHolder.getF21032e().mo23229p(segmentOrderHolder, z11, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K1 */
    public static final void m23130K1(DialogInterface dialogInterface, int i11) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: j1 */
    public static final void m23157j1(SegmentOrderHolder segmentOrderHolder) {
        segmentOrderHolder.m23183p1();
    }

    /* JADX INFO: renamed from: t1 */
    public static final void m23159t1(SegmentOrderHolder segmentOrderHolder) {
        segmentOrderHolder.m23131M1();
    }

    /* JADX INFO: renamed from: v1 */
    public static final void m23161v1(SegmentOrderHolder segmentOrderHolder) {
        segmentOrderHolder.m23131M1();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: E0 */
    public void mo22944E0() {
        super.mo22944E0();
        if (getParent() != null) {
            C45405r0 c45405r0 = this.f21073s;
            C45405r0 c45405r1 = null;
            if (c45405r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r0 = null;
            }
            c45405r0.f102319e.getEditText().setText("");
            C45405r0 c45405r2 = this.f21073s;
            if (c45405r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r2 = null;
            }
            c45405r2.f102318d.getEditText().setText("");
            C45405r0 c45405r3 = this.f21073s;
            if (c45405r3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r3 = null;
            }
            c45405r3.f102317c.getEditText().setText("");
            C45405r0 c45405r4 = this.f21073s;
            if (c45405r4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
                c45405r4 = null;
            }
            c45405r4.f102316b.getEditText().setText("");
            C45405r0 c45405r5 = this.f21073s;
            if (c45405r5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            } else {
                c45405r1 = c45405r5;
            }
            c45405r1.f102325k.setText("--");
        }
        m23174U1();
    }

    /* JADX INFO: renamed from: I1 */
    public void m23167I1() {
        m23175V1();
    }

    /* JADX INFO: renamed from: L1 */
    public final void m23168L1(String str, View view) {
        m23183p1();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R$layout.view_segment_min_qty_bubble, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R$id.tvBubbleContent);
        if (textView != null) {
            textView.setText(str);
        }
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        PopupWindow popupWindow = new PopupWindow(viewInflate, viewInflate.getMeasuredWidth(), -2);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(false);
        this.f21077w = popupWindow;
        int i11 = -(view.getHeight() + viewInflate.getMeasuredHeight() + ((int) C27040e.m66657a(6.0f)));
        int width = (view.getWidth() - viewInflate.getMeasuredWidth()) / 2;
        if (!view.isShown()) {
            return;
        }
        popupWindow.showAsDropDown(view, width, i11);
        postDelayed(this.f21080z, 3000L);
    }

    /* JADX INFO: renamed from: N1 */
    public final void m23169N1() {
        boolean z11;
        if (m23179l1() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f21076v = z11;
        if (!z11) {
            m23183p1();
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final void m23170O1(String str) {
        String str2;
        String strM23402a = C12462a.m23402a();
        if (getF21036i()) {
            str2 = "buy";
        } else {
            str2 = "sell";
        }
        C43852m.m96590b(strM23402a, str, "1", TuplesKt.m90091to("trade_type", str2));
    }

    /* JADX INFO: renamed from: P1 */
    public final void m23171P1(BigDecimal bigDecimal, ITradeInputLayoutOperations iTradeInputLayoutOperations) {
        View viewMo22383j0 = getF21029b().mo22383j0();
        String quoteCurrency = getF21029b().mo22365N().getQuoteCurrency();
        Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
        ITradeInputLayoutOperations.m55173e(iTradeInputLayoutOperations, viewMo22383j0, C12322c0.m23257g(bigDecimal, quoteCurrency, false, 4, null), null, 0L, 12, null);
    }

    /* JADX INFO: renamed from: V1 */
    public final void m23175V1() {
        SegmentTradeInputData c42814gM23182o1 = m23182o1();
        if (c42814gM23182o1 == null) {
            return;
        }
        InterfaceC43720b interfaceC43720bM96276a = C43721c.m96276a("segmentRequestOrderTask", new Function1() { // from class: com.kubi.core.spot.business.holder.p2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SegmentOrderHolder.m23144W1(this.f21180b, (SegmentTradeInputData) obj);
            }
        });
        LinkedList linkedList = new LinkedList();
        LinkedList<InterfaceC43720b<InterfaceC42808a, InterfaceC42809b>> linkedList2 = this.f21071q;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList2) {
            if (obj instanceof InterfaceC43720b) {
                arrayList.add(obj);
            }
        }
        linkedList.addAll(arrayList);
        linkedList.add(new C43449e());
        linkedList.add(interfaceC43720bM96276a);
        TaskChainEngine.f21136c.buildTaskChain(linkedList).m23280a(c42814gM23182o1);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    @SuppressLint({"SetTextI18n", "CheckResult"})
    /* JADX INFO: renamed from: h0 */
    public void mo22885h0() {
        super.mo22885h0();
        C45405r0 c45405r0 = this.f21073s;
        C45405r0 c45405r1 = null;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        c45405r0.f102317c.getEditText().setInputType(2);
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        C38104b.m86032d(c45405r2.f102317c.getEditText(), new Function2() { // from class: com.kubi.core.spot.business.holder.s2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SegmentOrderHolder.m23164z1(this.f21194b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        C38104b.m86032d(c45405r3.f102316b.getEditText(), new Function2() { // from class: com.kubi.core.spot.business.holder.t2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SegmentOrderHolder.m23123A1(this.f21198b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        C45405r0 c45405r4 = this.f21073s;
        if (c45405r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r4 = null;
        }
        C38104b.m86032d(c45405r4.f102319e.getEditText(), new Function2() { // from class: com.kubi.core.spot.business.holder.u2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SegmentOrderHolder.m23124B1(this.f21202b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        C45405r0 c45405r5 = this.f21073s;
        if (c45405r5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
        } else {
            c45405r1 = c45405r5;
        }
        C38104b.m86032d(c45405r1.f102318d.getEditText(), new Function2() { // from class: com.kubi.core.spot.business.holder.v2
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SegmentOrderHolder.m23125C1(this.f21206b, (View) obj, ((Boolean) obj2).booleanValue());
            }
        });
        m23185r1();
        m23186y1();
    }

    /* JADX INFO: renamed from: m1 */
    public final void m23180m1() {
        String strM23179l1 = m23179l1();
        if (strM23179l1 == null) {
            this.f21076v = false;
            m23183p1();
            return;
        }
        this.f21076v = true;
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        TradeInputLayoutProxy etNumber = c45405r0.f102316b;
        Intrinsics.checkNotNullExpressionValue(etNumber, "etNumber");
        m23168L1(strM23179l1, etNumber);
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: o0 */
    public void mo22960o0() {
        C45405r0 c45405r0M100347a = C45405r0.m100347a(this);
        Intrinsics.checkNotNullExpressionValue(c45405r0M100347a, "bind(...)");
        this.f21073s = c45405r0M100347a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m23183p1();
        super.onDetachedFromWindow();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: y0 */
    public void mo22970y0() {
        super.mo22970y0();
        SymbolInfoEntity symbolInfoEntityMo22365N = getF21029b().mo22365N();
        String quoteCurrencyName = symbolInfoEntityMo22365N.getQuoteCurrencyName();
        String baseCurrencyName = symbolInfoEntityMo22365N.getBaseCurrencyName();
        int priceIncrementPrecision = symbolInfoEntityMo22365N.getPriceIncrementPrecision();
        int baseIncrementPrecision = symbolInfoEntityMo22365N.getBaseIncrementPrecision();
        C45405r0 c45405r0 = this.f21073s;
        if (c45405r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r0 = null;
        }
        KcTradeNumAbInputView kcTradeNumAbInputView = c45405r0.f102319e;
        kcTradeNumAbInputView.setHint(kcTradeNumAbInputView.getContext().getString(R$string.kumex_segment_mini_price, quoteCurrencyName));
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView, DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getPriceIncrement(), null, 1, null), priceIncrementPrecision, false, 4, null);
        kcTradeNumAbInputView.setLowValue(DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getPriceIncrement(), null, 1, null));
        BigDecimal bigDecimal = f21068B;
        kcTradeNumAbInputView.setHighValue(bigDecimal);
        EditText editText = kcTradeNumAbInputView.getEditText();
        InputFilter[] filters = editText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        editText.setFilters((InputFilter[]) ArraysKt.plus((C43535e[]) filters, new C43535e(bigDecimal)));
        C45405r0 c45405r1 = this.f21073s;
        if (c45405r1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r1 = null;
        }
        KcTradeNumAbInputView kcTradeNumAbInputView2 = c45405r1.f102318d;
        kcTradeNumAbInputView2.setHint(kcTradeNumAbInputView2.getContext().getString(R$string.kumex_segment_max_price, quoteCurrencyName));
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView2, DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getPriceIncrement(), null, 1, null), priceIncrementPrecision, false, 4, null);
        kcTradeNumAbInputView2.setLowValue(DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getPriceIncrement(), null, 1, null));
        kcTradeNumAbInputView2.setHighValue(bigDecimal);
        EditText editText2 = kcTradeNumAbInputView2.getEditText();
        InputFilter[] filters2 = editText2.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters2, "getFilters(...)");
        editText2.setFilters((InputFilter[]) ArraysKt.plus((C43535e[]) filters2, new C43535e(bigDecimal)));
        C45405r0 c45405r2 = this.f21073s;
        if (c45405r2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r2 = null;
        }
        KcTradeNumAbInputView kcTradeNumAbInputView3 = c45405r2.f102317c;
        kcTradeNumAbInputView3.setHint(kcTradeNumAbInputView3.getContext().getString(R$string.kumex_segment_order_mum, "2", "20"));
        BigDecimal ONE = BigDecimal.ONE;
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        ITradeInputLayoutOperations.m55172d(kcTradeNumAbInputView3, ONE, 0, false, 4, null);
        Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
        kcTradeNumAbInputView3.setEnsureIncrement(ONE);
        kcTradeNumAbInputView3.setLowValue(new BigDecimal(2));
        kcTradeNumAbInputView3.setInitValue(new BigDecimal(2));
        kcTradeNumAbInputView3.setHighValue(new BigDecimal(20));
        C45405r0 c45405r3 = this.f21073s;
        if (c45405r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewBinding");
            c45405r3 = null;
        }
        TradeInputLayoutProxy tradeInputLayoutProxy = c45405r3.f102316b;
        tradeInputLayoutProxy.setHint(tradeInputLayoutProxy.getContext().getString(R$string.qty_stub, baseCurrencyName));
        ITradeInputLayoutOperations.m55172d(tradeInputLayoutProxy, DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getBaseIncrement(), null, 1, null), baseIncrementPrecision, false, 4, null);
        tradeInputLayoutProxy.setEnsureIncrement(DowngradeExKt.m66535e(symbolInfoEntityMo22365N.getBaseIncrement(), null, 1, null));
        tradeInputLayoutProxy.setLowValue(new BigDecimal(String.valueOf(symbolInfoEntityMo22365N.getBaseMinSize())));
        EditText editText3 = tradeInputLayoutProxy.getEditText();
        InputFilter[] filters3 = editText3.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters3, "getFilters(...)");
        editText3.setFilters((InputFilter[]) ArraysKt.plus((C43533c[]) filters3, new C43533c(20)));
        m23174U1();
    }

    @Override // com.kubi.core.spot.business.holder.BaseOrderHolder
    /* JADX INFO: renamed from: C0 */
    public void mo22942C0() {
    }
}
