package com.kubi.core.biz.submit.horizontal;

import af.C0296a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import be.InterfaceC4578a;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.utils.C11677d;
import com.kubi.core.biz.submit.C12097h;
import com.kubi.core.biz.submit.TradeDirectionPanelSubmitContract$UiState;
import com.kubi.core.biz.submit.TradeDirectionPanelSubmitVM;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.spot.business.holder.AdvancedLimitOrderHolder;
import com.kubi.core.spot.business.holder.BaseOrderHolder;
import com.kubi.core.spot.business.holder.ITradeHolderDependDelegate;
import com.kubi.core.spot.business.holder.ITradeHolderImpDelegate;
import com.kubi.core.spot.business.holder.LimitOrderHolder;
import com.kubi.core.spot.business.holder.MarketOrderHolder;
import com.kubi.core.spot.business.holder.SegmentOrderHolder;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.core.spot.quote.orderBook.OrderBookAdapter;
import com.kubi.core.utils.C12462a;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.p110rn.Constants;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.C22912t;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.resources.widget.flyco.SimpleScrollBarLayout;
import com.kubi.router.core.Router;
import com.kubi.router.model.IRedirect;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.util.C24218b;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$mipmap;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import ee.C37136a;
import gf.C37886j;
import io.reactivex.Observable;
import io.reactivex.functions.BiConsumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p310he.InterfaceC38174a;
import p310he.InterfaceC38175b;
import p402kf.C41014a;
import p429lf.C42180b;
import p469nd.C42806a;
import p569qq.C43852m;
import p827zc.AbstractC46753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import v30.C45411x;
import w00.C45681e;

/* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000202H\u0002J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020<H\u0014J\u001a\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u000104H\u0016J\b\u0010A\u001a\u000202H\u0002J\u0014\u0010B\u001a\u0002062\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DJ\b\u0010F\u001a\u00020<H\u0002J\b\u0010G\u001a\u000202H\u0016J\u0018\u0010H\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020:H\u0016J\u0018\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020&H\u0016J\u0018\u0010P\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010Q\u001a\u00020RH\u0016J\u0018\u0010S\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010T\u001a\u00020<H\u0016J\u0018\u0010U\u001a\u0002022\u0006\u0010M\u001a\u00020N2\u0006\u0010V\u001a\u00020<H\u0016J\u0010\u0010W\u001a\u0002022\u0006\u0010Q\u001a\u00020XH\u0016J\u001a\u0010Y\u001a\u0002022\u0006\u0010I\u001a\u00020J2\b\u0010Z\u001a\u0004\u0018\u00010[H\u0002J\b\u0010\\\u001a\u000202H\u0016J\b\u0010]\u001a\u000202H\u0017J\b\u0010^\u001a\u000202H\u0016J\b\u0010_\u001a\u000202H\u0016J\u0010\u0010`\u001a\u0002022\u0006\u0010Z\u001a\u00020[H\u0016J\u0018\u0010a\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010b\u001a\u00020:H\u0016J\u0018\u0010c\u001a\u0002022\u0006\u0010I\u001a\u00020J2\u0006\u0010b\u001a\u00020:H\u0002J\u0010\u0010d\u001a\u0002022\u0006\u0010O\u001a\u00020<H\u0016J\u0010\u0010e\u001a\u0002022\u0006\u0010O\u001a\u00020<H\u0016J\b\u0010f\u001a\u000202H\u0016J\u0010\u0010g\u001a\u0002022\u0006\u0010V\u001a\u00020<H\u0002J\b\u0010h\u001a\u000202H\u0002J,\u0010n\u001a\u0002022\u0006\u0010o\u001a\u00020&2\u0006\u0010p\u001a\u00020q2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0002J\b\u0010s\u001a\u000202H\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\r\u001a\u0004\b!\u0010\"R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\r\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b/\u0010,R\u001b\u0010i\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010\r\u001a\u0004\bk\u0010l¨\u0006t"}, m90084d2 = {"Lcom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiIntent;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitVM;", "Lcom/kubi/core/spot/business/ITradeChildBehavior;", "<init>", "()V", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "getSubmitVM", "()Lcom/kubi/core/biz/submit/TradeSubmitVM;", "submitVM$delegate", "Lkotlin/Lazy;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mParent", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "getMParent", "()Lcom/kubi/core/spot/business/ITradeParentBehavior;", "mParent$delegate", "mViewHoldersBuy", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "mViewHoldersSell", "mBuyAdapter", "Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;", "getMBuyAdapter", "()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;", "mBuyAdapter$delegate", "mSellAdapter", "getMSellAdapter", "mSellAdapter$delegate", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "startCollectData", "Lkotlinx/coroutines/Job;", "updateSupportTradeTypes", "updateEtfViewLabel", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "getLayout", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "initUI", "setTradeTypeTabBar", "tradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "lastPrecision", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "reloadSymbols", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "onlyResetUI", "tradeModeChanged", "labelStr", "", "type", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "showOrderBookAmountType", "adapterPosition", "onOrderBookPrecisionChanged", "precision", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "updateExtValue", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "notifyOrderBookAdapter", "onAssetGet", "onAvailableTradeAmountChanged", "onClickPriceChange", "refreshButtonStatus", "isMaintenance", "updateActionBtn", "hideDialogInType", "showDialogInType", "isSupportBorrow", "updateSelectPrecisionTextSize", "mergeMax", "mHolderImp", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "getMHolderImp", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "mHolderImp$delegate", "addContainerView", "tradeType", TtmlNode.RUBY_CONTAINER, "Landroid/widget/FrameLayout;", "mViewHolders", "onRefresh", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeBaseHorizontalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBaseHorizontalSubmitFragment.kt\ncom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,652:1\n106#2,15:653\n147#3,16:668\n360#4,7:684\n1869#4,2:691\n1869#4,2:693\n1869#4,2:696\n1869#4,2:698\n360#4,7:700\n1869#4,2:707\n1869#4,2:709\n1869#4,2:711\n1869#4,2:713\n1869#4,2:715\n1869#4,2:717\n1869#4,2:719\n1869#4,2:721\n1869#4,2:723\n1869#4,2:725\n1869#4,2:727\n1869#4,2:729\n1563#4:731\n1634#4,3:732\n1#5:695\n37#6:735\n36#6,3:736\n*S KotlinDebug\n*F\n+ 1 TradeBaseHorizontalSubmitFragment.kt\ncom/kubi/core/biz/submit/horizontal/TradeBaseHorizontalSubmitFragment\n*L\n70#1:653,15\n79#1:668,16\n173#1:684,7\n302#1:691,2\n303#1:693,2\n354#1:696,2\n355#1:698,2\n361#1:700,7\n395#1:707,2\n396#1:709,2\n434#1:711,2\n435#1:713,2\n445#1:715,2\n446#1:717,2\n450#1:719,2\n451#1:721,2\n466#1:723,2\n467#1:725,2\n535#1:727,2\n536#1:729,2\n254#1:731\n254#1:732,3\n254#1:735\n254#1:736,3\n*E\n"})
public final class TradeBaseHorizontalSubmitFragment extends AbsTradeBaseBizFragment<Object, TradeDirectionPanelSubmitContract$UiState, TradeDirectionPanelSubmitVM> implements InterfaceC38174a {

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f20709h0 = {Reflection.property1(new PropertyReference1Impl(TradeBaseHorizontalSubmitFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20710Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC4578a f20711Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC24293a f20712a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Lazy f20713b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Map<TradeType, BaseOrderHolder> f20714c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Map<TradeType, BaseOrderHolder> f20715d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f20716e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f20717f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final Lazy f20718g0;

    /* JADX INFO: renamed from: p4 */
    public final void m22617p4() {
        final C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null) {
            BaseTextView cbOrderbookSelectPrecision = c45411xM22610j4.f102381d;
            Intrinsics.checkNotNullExpressionValue(cbOrderbookSelectPrecision, "cbOrderbookSelectPrecision");
            C27046k.m66711z(cbOrderbookSelectPrecision, 0L, new Function0() { // from class: com.kubi.core.biz.submit.horizontal.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22586y4(this.f20732b);
                }
            }, 1, null);
            BaseTextView tvAmountUnit = c45411xM22610j4.f102390m;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit, "tvAmountUnit");
            BaseTextView tvAmountUnit1 = c45411xM22610j4.f102391n;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit1, "tvAmountUnit1");
            C27046k.m66681D(new View[]{tvAmountUnit, tvAmountUnit1}, new Function0() { // from class: com.kubi.core.biz.submit.horizontal.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22577q4(this.f20733b);
                }
            });
            c45411xM22610j4.f102387j.setHasFixedSize(true);
            c45411xM22610j4.f102388k.setHasFixedSize(true);
            m22614n4().bindToRecyclerView(c45411xM22610j4.f102388k);
            m22611k4().bindToRecyclerView(c45411xM22610j4.f102387j);
            OrderBookAdapter orderBookAdapterM22614n4 = m22614n4();
            int i11 = R$layout.trade_core_view_orderbook_loading;
            orderBookAdapterM22614n4.setEmptyView(i11, c45411xM22610j4.f102388k);
            m22611k4().setEmptyView(i11, c45411xM22610j4.f102387j);
            m22611k4().m23378u(5);
            m22614n4().m23378u(5);
            RecyclerView rcvSell = c45411xM22610j4.f102388k;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            C22912t.m54410h(rcvSell, false, 1, null);
            RecyclerView rcvBuy = c45411xM22610j4.f102387j;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            C22912t.m54410h(rcvBuy, false, 1, null);
            m22611k4().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.core.biz.submit.horizontal.l
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeBaseHorizontalSubmitFragment.m22578r4(this.f20734a, i12, strArr);
                }
            });
            m22614n4().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.core.biz.submit.horizontal.m
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeBaseHorizontalSubmitFragment.m22580s4(this.f20735a, i12, strArr);
                }
            });
            ConstraintLayout llCenter = c45411xM22610j4.f102386i;
            Intrinsics.checkNotNullExpressionValue(llCenter, "llCenter");
            C27046k.m66711z(llCenter, 0L, new Function0() { // from class: com.kubi.core.biz.submit.horizontal.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22581t4(c45411xM22610j4, this);
                }
            }, 1, null);
            AppCompatImageView ivPriceTypeInfo = c45411xM22610j4.f102385h;
            Intrinsics.checkNotNullExpressionValue(ivPriceTypeInfo, "ivPriceTypeInfo");
            C11677d.m21216d(ivPriceTypeInfo, 0L, new Function1() { // from class: com.kubi.core.biz.submit.horizontal.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBaseHorizontalSubmitFragment.m22583v4(this.f20738b, (View) obj);
                }
            }, 1, null);
            DashTextView tvEtfValue = c45411xM22610j4.f102392o;
            Intrinsics.checkNotNullExpressionValue(tvEtfValue, "tvEtfValue");
            C11677d.m21216d(tvEtfValue, 0L, new Function1() { // from class: com.kubi.core.biz.submit.horizontal.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBaseHorizontalSubmitFragment.m22584w4(this.f20739b, (View) obj);
                }
            }, 1, null);
            BuySellRatioView buySellRatioView = c45411xM22610j4.f102380c;
            Intrinsics.checkNotNullExpressionValue(buySellRatioView, "buySellRatioView");
            C27046k.m66711z(buySellRatioView, 0L, new Function0() { // from class: com.kubi.core.biz.submit.horizontal.q
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22585x4(this.f20740b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$a */
    /* JADX INFO: compiled from: TradeBaseHorizontalSubmitFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12101a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.SEGMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: C4 */
    public static final OrderBookAdapter m22547C4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        return new OrderBookAdapter(0, 1, tradeBaseHorizontalSubmitFragment.m22613m4().mo22391z0());
    }

    /* JADX INFO: renamed from: J4 */
    public static final Unit m22551J4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, SymbolInfoEntity symbolInfoEntity) {
        if (IUserService.a.get().c()) {
            TradeDirectionPanelSubmitVM tradeDirectionPanelSubmitVMM21011A3 = tradeBaseHorizontalSubmitFragment.m21011A3();
            if (tradeDirectionPanelSubmitVMM21011A3 != null && tradeDirectionPanelSubmitVMM21011A3.m22527r(symbolInfoEntity)) {
                C37136a.f82407a.m83062a().mo37920T();
            }
        } else {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22553K4();
                }
            }), 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K4 */
    public static final Unit m22553K4() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public static final Observable m22576h4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, TradeType tradeType, Ref.ObjectRef objectRef, Map requestData, String str) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        TradeSubmitVM tradeSubmitVMM22615o4 = tradeBaseHorizontalSubmitFragment.m22615o4();
        BaseOrderHolder baseOrderHolder = (BaseOrderHolder) objectRef.element;
        boolean z11 = false;
        if (baseOrderHolder != null && baseOrderHolder.m22966u0()) {
            z11 = true;
        }
        return tradeSubmitVMM22615o4.m22476q0(tradeType, z11, requestData);
    }

    /* JADX INFO: renamed from: t4 */
    public static final Unit m22581t4(final C45411x c45411x, final TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        if (!TextUtils.isEmpty(c45411x.f102396s.getText())) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22582u4(this.f20730b, c45411x);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public static final Unit m22583v4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, View it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c(C12462a.m23402a(), "orderIntroButton", null, null, 12, null);
        List<TradeTypeUiData> supportTradeTypes = ((UiState) tradeBaseHorizontalSubmitFragment.m22615o4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            return Unit.INSTANCE;
        }
        Iterator<T> it2 = supportTradeTypes.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!((TradeTypeUiData) next).getIsChecked());
        TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) next;
        if (tradeTypeUiData == null) {
            return Unit.INSTANCE;
        }
        TradeTypeBizDialogFragment.Companion companion = TradeTypeBizDialogFragment.f51635x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(supportTradeTypes, 10));
        Iterator<T> it3 = supportTradeTypes.iterator();
        while (it3.hasNext()) {
            arrayList.add(((TradeTypeUiData) it3.next()).getF20771b().getValue());
        }
        TradeTypeBizDialogFragment tradeTypeBizDialogFragmentNewInstance$default = TradeTypeBizDialogFragment.Companion.newInstance$default(companion, (String[]) arrayList.toArray(new String[0]), tradeTypeUiData.getF20771b(), C12462a.m23402a(), false, false, null, 56, null);
        FragmentManager childFragmentManager = tradeBaseHorizontalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        tradeTypeBizDialogFragmentNewInstance$default.show(childFragmentManager, "showTradeInfoDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m22584w4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentManager childFragmentManager = tradeBaseHorizontalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C42806a.m93834a(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x4 */
    public static final Unit m22585x4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        ISpotService iSpotService = ISpotService.f49646a.get();
        FragmentManager childFragmentManager = tradeBaseHorizontalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotService.mo60006s(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final OrderBookAdapter m22587z4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        return new OrderBookAdapter(1, 1, tradeBaseHorizontalSubmitFragment.m22613m4().mo22391z0());
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: E */
    public void mo22589E(@NotNull SymbolInfoEntity symbolInfo, int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        m22611k4().m23379v(i11);
        m22614n4().m23379v(i11);
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null && (baseTextView2 = c45411xM22610j4.f102390m) != null) {
            baseTextView2.setText(getString(m22611k4().getF21269m() == 0 ? R$string.total_stub : R$string.amount_stub, symbolInfo.getBaseCurrencyName()));
        }
        C45411x c45411xM22610j5 = m22610j4();
        if (c45411xM22610j5 != null && (baseTextView = c45411xM22610j5.f102391n) != null) {
            baseTextView.setText(getString(m22611k4().getF21269m() == 0 ? R$string.total_stub : R$string.amount_stub, symbolInfo.getBaseCurrencyName()));
        }
        mo22604c0();
    }

    /* JADX INFO: renamed from: E4 */
    public void m22590E4(@NotNull SymbolInfoEntity symbolInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Iterator<T> it = this.f20715d0.values().iterator();
        while (it.hasNext()) {
            ITradeHolderImpDelegate.m23273a((BaseOrderHolder) it.next(), symbolInfo, z11, false, 4, null);
        }
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ITradeHolderImpDelegate.m23273a((BaseOrderHolder) it2.next(), symbolInfo, z11, false, 4, null);
        }
        m22594I4(symbolInfo, z11);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: F0 */
    public void mo22591F0(@NotNull OrderBookEntity data) {
        BuySellRatioView buySellRatioView;
        Intrinsics.checkNotNullParameter(data, "data");
        m22614n4().m23374q(C27024b.m66559b(data.getAsks()));
        m22611k4().m23374q(C27024b.m66559b(data.getBids()));
        m22588D4();
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 == null || (buySellRatioView = c45411xM22610j4.f102380c) == null) {
            return;
        }
        buySellRatioView.m54454g(data.getBids(), data.getAsks());
    }

    @NotNull
    /* JADX INFO: renamed from: F4 */
    public final InterfaceC41775x1 m22592F4(@NotNull List<? extends TradeTypeUiData> tradeTypes) {
        Intrinsics.checkNotNullParameter(tradeTypes, "tradeTypes");
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TradeBaseHorizontalSubmitFragment$setTradeTypeTabBar$1(tradeTypes, this, null));
    }

    /* JADX INFO: renamed from: L4 */
    public final void m22595L4(boolean z11) {
        ShowHideTextView showHideTextView;
        AppCompatImageView appCompatImageView;
        DashTextView dashTextView;
        ShowHideTextView showHideTextView2;
        AppCompatImageView appCompatImageView2;
        DashTextView dashTextView2;
        if (z11) {
            C45411x c45411xM22610j4 = m22610j4();
            if (c45411xM22610j4 != null && (dashTextView2 = c45411xM22610j4.f102392o) != null) {
                ViewExtKt.m66594y(dashTextView2);
            }
            C45411x c45411xM22610j5 = m22610j4();
            if (c45411xM22610j5 != null && (appCompatImageView2 = c45411xM22610j5.f102384g) != null) {
                ViewExtKt.m66594y(appCompatImageView2);
            }
            C45411x c45411xM22610j6 = m22610j4();
            if (c45411xM22610j6 == null || (showHideTextView2 = c45411xM22610j6.f102395r) == null) {
                return;
            }
            C27046k.m66703r(showHideTextView2);
            return;
        }
        C45411x c45411xM22610j7 = m22610j4();
        if (c45411xM22610j7 != null && (dashTextView = c45411xM22610j7.f102392o) != null) {
            C27046k.m66703r(dashTextView);
        }
        C45411x c45411xM22610j8 = m22610j4();
        if (c45411xM22610j8 != null && (appCompatImageView = c45411xM22610j8.f102384g) != null) {
            C27046k.m66703r(appCompatImageView);
        }
        C45411x c45411xM22610j9 = m22610j4();
        if (c45411xM22610j9 == null || (showHideTextView = c45411xM22610j9.f102395r) == null) {
            return;
        }
        ViewExtKt.m66594y(showHideTextView);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m22597N4(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (i11 <= 8) {
            C45411x c45411xM22610j4 = m22610j4();
            if (c45411xM22610j4 == null || (baseTextView3 = c45411xM22610j4.f102381d) == null) {
                return;
            }
            baseTextView3.setTextSize(12.0f);
            return;
        }
        if (i11 <= 10) {
            C45411x c45411xM22610j5 = m22610j4();
            if (c45411xM22610j5 == null || (baseTextView2 = c45411xM22610j5.f102381d) == null) {
                return;
            }
            baseTextView2.setTextSize(11.0f);
            return;
        }
        C45411x c45411xM22610j6 = m22610j4();
        if (c45411xM22610j6 == null || (baseTextView = c45411xM22610j6.f102381d) == null) {
            return;
        }
        baseTextView.setTextSize(10.0f);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: S */
    public void mo22599S() throws Exception {
        Iterator<T> it = this.f20715d0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22969x0();
        }
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).m22969x0();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: U */
    public void mo22600U() {
        Iterator<T> it = this.f20715d0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo22942C0();
        }
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).mo22942C0();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: a */
    public void mo22601a(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null) {
            if (c45411xM22610j4.f102382e.getChildCount() > 0) {
                FrameLayout flBuy = c45411xM22610j4.f102382e;
                Intrinsics.checkNotNullExpressionValue(flBuy, "flBuy");
                View viewM66698m = C27046k.m66698m(flBuy, 0);
                BaseOrderHolder baseOrderHolder = viewM66698m instanceof BaseOrderHolder ? (BaseOrderHolder) viewM66698m : null;
                if (baseOrderHolder != null) {
                    baseOrderHolder.mo22940A0(value);
                }
            }
            if (c45411xM22610j4.f102383f.getChildCount() > 0) {
                FrameLayout flSell = c45411xM22610j4.f102383f;
                Intrinsics.checkNotNullExpressionValue(flSell, "flSell");
                View viewM66698m2 = C27046k.m66698m(flSell, 0);
                BaseOrderHolder baseOrderHolder2 = viewM66698m2 instanceof BaseOrderHolder ? (BaseOrderHolder) viewM66698m2 : null;
                if (baseOrderHolder2 != null) {
                    baseOrderHolder2.mo22940A0(value);
                }
            }
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: b */
    public void mo22602b(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45411x c45411xM22610j4;
        BaseTextView baseTextView3;
        if (i11 != 0) {
            if (i11 != 1 || (c45411xM22610j4 = m22610j4()) == null || (baseTextView3 = c45411xM22610j4.f102381d) == null) {
                return;
            }
            C27046k.m66694i(baseTextView3, R$drawable.ic2_triangle_top_12, 0, 0, 4, null);
            return;
        }
        C45411x c45411xM22610j5 = m22610j4();
        if (c45411xM22610j5 != null && (baseTextView2 = c45411xM22610j5.f102390m) != null) {
            C27046k.m66694i(baseTextView2, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
        }
        C45411x c45411xM22610j6 = m22610j4();
        if (c45411xM22610j6 == null || (baseTextView = c45411xM22610j6.f102391n) == null) {
            return;
        }
        C27046k.m66694i(baseTextView, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: c */
    public void mo22603c(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45411x c45411xM22610j4;
        BaseTextView baseTextView3;
        if (i11 != 0) {
            if (i11 != 1 || (c45411xM22610j4 = m22610j4()) == null || (baseTextView3 = c45411xM22610j4.f102381d) == null) {
                return;
            }
            C27046k.m66694i(baseTextView3, R$drawable.ic2_triangle_bottom_12, 0, 0, 4, null);
            return;
        }
        C45411x c45411xM22610j5 = m22610j4();
        if (c45411xM22610j5 != null && (baseTextView2 = c45411xM22610j5.f102390m) != null) {
            C27046k.m66694i(baseTextView2, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
        }
        C45411x c45411xM22610j6 = m22610j4();
        if (c45411xM22610j6 == null || (baseTextView = c45411xM22610j6.f102391n) == null) {
            return;
        }
        C27046k.m66694i(baseTextView, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: d */
    public void mo22605d(@NotNull String labelStr, int i11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null && (baseTextView = c45411xM22610j4.f102381d) != null) {
            baseTextView.setText(labelStr);
        }
        m22597N4(i11);
        m22611k4().m23375r(i11);
        m22614n4().m23375r(i11);
        m22588D4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: f */
    public void mo22606f(@NotNull String labelStr, @NotNull TradeType type) throws Exception {
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        Intrinsics.checkNotNullParameter(type, "type");
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null) {
            List<TradeTypeUiData> supportTradeTypes = ((UiState) m22615o4().getState()).getSupportTradeTypes();
            if (supportTradeTypes == null) {
                supportTradeTypes = CollectionsKt.emptyList();
            }
            Iterator<TradeTypeUiData> it = supportTradeTypes.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next().getF20771b() == type) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return;
            }
            c45411xM22610j4.f102389l.setCurrentIndex(i11);
            FrameLayout flSell = c45411xM22610j4.f102383f;
            Intrinsics.checkNotNullExpressionValue(flSell, "flSell");
            m22607g4(type, flSell, this.f20715d0);
            FrameLayout flBuy = c45411xM22610j4.f102382e;
            Intrinsics.checkNotNullExpressionValue(flBuy, "flBuy");
            m22607g4(type, flBuy, this.f20714c0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, com.kubi.core.spot.business.holder.BaseOrderHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: g4 */
    public final void m22607g4(final TradeType tradeType, FrameLayout frameLayout, Map<TradeType, BaseOrderHolder> map) throws Exception {
        ?? limitOrderHolder;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r11 = map.get(tradeType);
        objectRef.element = r11;
        if (r11 == 0) {
            Function2 function2 = new Function2() { // from class: com.kubi.core.biz.submit.horizontal.f
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeBaseHorizontalSubmitFragment.m22576h4(this.f20725b, tradeType, objectRef, (Map) obj, (String) obj2);
                }
            };
            switch (C12101a.$EnumSwitchMapping$0[tradeType.ordinal()]) {
                case 1:
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    limitOrderHolder = new LimitOrderHolder(contextRequireContext, TradeType.LIMIT, m22612l4(), false, true, function2, m22615o4().m22475p0(), m22615o4(), null, 264, null);
                    break;
                case 2:
                    Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    limitOrderHolder = new MarketOrderHolder(contextRequireContext2, TradeType.MARKET, m22612l4(), false, true, function2, m22615o4().m22475p0(), m22615o4(), null, 264, null);
                    break;
                case 3:
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                    limitOrderHolder = new AdvancedLimitOrderHolder(contextRequireContext3, TradeType.ADVANCED_LIMIT, m22612l4(), false, true, function2, m22615o4().m22475p0(), m22615o4(), null, 264, null);
                    break;
                case 4:
                    Context contextRequireContext4 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                    limitOrderHolder = new LimitOrderHolder(contextRequireContext4, TradeType.LIMIT_STOP, m22612l4(), true, true, function2, m22615o4().m22475p0(), m22615o4(), null, 256, null);
                    break;
                case 5:
                    Context contextRequireContext5 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                    limitOrderHolder = new MarketOrderHolder(contextRequireContext5, TradeType.MARKET_STOP, m22612l4(), true, true, function2, m22615o4().m22475p0(), m22615o4(), null, 256, null);
                    break;
                case 6:
                    Context contextRequireContext6 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
                    limitOrderHolder = new SegmentOrderHolder(contextRequireContext6, TradeType.SEGMENT, m22612l4(), true, function2, m22615o4().m22475p0(), m22615o4(), null, 128, null);
                    break;
                default:
                    limitOrderHolder = 0;
                    break;
            }
            objectRef.element = limitOrderHolder;
            if (limitOrderHolder != 0) {
                map.put(tradeType, limitOrderHolder);
                limitOrderHolder.m22968w0();
            }
        }
        BaseOrderHolder baseOrderHolder = (BaseOrderHolder) objectRef.element;
        if (baseOrderHolder != null) {
            frameLayout.removeAllViews();
            baseOrderHolder.setIsBuyHolder(frameLayout.getId() == R$id.fl_buy);
            baseOrderHolder.m22969x0();
            frameLayout.addView(baseOrderHolder);
            baseOrderHolder.m22945F0();
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_trade_horizontal;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<TradeDirectionPanelSubmitVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TradeDirectionPanelSubmitVM.class);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: h2 */
    public void mo22608h2() {
        Iterator<T> it = this.f20715d0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22968w0();
        }
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).m22968w0();
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: i4, reason: merged with bridge method [inline-methods] */
    public TradeDirectionPanelSubmitVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new TradeDirectionPanelSubmitVM(manager);
    }

    /* JADX INFO: renamed from: j4 */
    public final C45411x m22610j4() {
        return (C45411x) this.f20712a0.getValue(this, f20709h0[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public final OrderBookAdapter m22611k4() {
        return (OrderBookAdapter) this.f20716e0.getValue();
    }

    /* JADX INFO: renamed from: l4 */
    public final ITradeHolderDependDelegate m22612l4() {
        return (ITradeHolderDependDelegate) this.f20718g0.getValue();
    }

    /* JADX INFO: renamed from: m4 */
    public final InterfaceC38175b m22613m4() {
        return (InterfaceC38175b) this.f20713b0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    public final OrderBookAdapter m22614n4() {
        return (OrderBookAdapter) this.f20717f0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    public final TradeSubmitVM m22615o4() {
        return (TradeSubmitVM) this.f20710Y.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.clear();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22617p4();
        m22593G4();
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: p2 */
    public void mo22616p2() {
        Iterator<T> it = this.f20715d0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22948H();
        }
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).m22948H();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: s */
    public void mo22618s(@NotNull SymbolInfoEntity symbolInfo, @NotNull OrderBookCenterEntity data) {
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        C45411x c45411xM22610j4;
        ShowHideTextView showHideTextView5;
        ShowHideTextView showHideTextView6;
        ShowHideTextView showHideTextView7;
        ShowHideTextView showHideTextView8;
        ShowHideTextView showHideTextView9;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Intrinsics.checkNotNullParameter(data, "data");
        if (getView() == null) {
            return;
        }
        if (m22613m4().getF20635f0().getPrice() == 0.0d) {
            C45411x c45411xM22610j5 = m22610j4();
            if (c45411xM22610j5 != null && (showHideTextView9 = c45411xM22610j5.f102396s) != null) {
                showHideTextView9.setText("--");
            }
            C45411x c45411xM22610j6 = m22610j4();
            if (c45411xM22610j6 != null && (showHideTextView8 = c45411xM22610j6.f102396s) != null) {
                showHideTextView8.setTextColor(getColorRes(R$color.c_text40));
            }
            C45411x c45411xM22610j7 = m22610j4();
            if (c45411xM22610j7 == null || (showHideTextView7 = c45411xM22610j7.f102395r) == null) {
                return;
            }
            showHideTextView7.setText("--");
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        C45411x c45411xM22610j8 = m22610j4();
        Object tag = (c45411xM22610j8 == null || (showHideTextView6 = c45411xM22610j8.f102396s) == null) ? null : showHideTextView6.getTag();
        int iM58391a = C24218b.m58391a(contextRequireContext, C27039d.m66646f(tag instanceof Double ? (Double) tag : null), m22613m4().getF20635f0().getPrice());
        if (iM58391a != -1 && (c45411xM22610j4 = m22610j4()) != null && (showHideTextView5 = c45411xM22610j4.f102396s) != null) {
            showHideTextView5.setTextColor(iM58391a);
        }
        C45411x c45411xM22610j9 = m22610j4();
        if (c45411xM22610j9 != null && (showHideTextView4 = c45411xM22610j9.f102396s) != null) {
            showHideTextView4.setTag(Double.valueOf(m22613m4().getF20635f0().getPrice()));
        }
        C45411x c45411xM22610j10 = m22610j4();
        if (c45411xM22610j10 != null && (showHideTextView3 = c45411xM22610j10.f102396s) != null) {
            showHideTextView3.setText(C37886j.m85579c(new BigDecimal(String.valueOf(m22613m4().getF20635f0().getPrice())), symbolInfo.getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        C45411x c45411xM22610j11 = m22610j4();
        if (c45411xM22610j11 != null && (showHideTextView2 = c45411xM22610j11.f102395r) != null) {
            C24256n1.m58513c(showHideTextView2);
        }
        C45411x c45411xM22610j12 = m22610j4();
        if (c45411xM22610j12 != null && (showHideTextView = c45411xM22610j12.f102395r) != null) {
            showHideTextView.setText(C41014a.m89948v(C41014a.m89939m(m22613m4().getF20635f0().getPrice(), symbolInfo.getQuoteCurrency()), null, null, 0, false, true, true, 15, null));
        }
        Iterator<T> it = this.f20714c0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo22971z0(new BigDecimal(String.valueOf(m22613m4().getF20635f0().getPrice())));
        }
        Iterator<T> it2 = this.f20715d0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).mo22971z0(new BigDecimal(String.valueOf(m22613m4().getF20635f0().getPrice())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: v */
    public void mo22619v(@NotNull SymbolInfoEntity symbolInfo, boolean z11) throws Exception {
        C45411x c45411xM22610j4;
        SimpleScrollBarLayout simpleScrollBarLayout;
        Object next;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        DashTextView dashTextView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        BaseTextView baseTextView4;
        SimpleScrollBarLayout simpleScrollBarLayout2;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        List<TradeTypeUiData> supportTradeTypes = ((UiState) m22615o4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            supportTradeTypes = CollectionsKt.emptyList();
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        List<String> listM22544a = C12097h.m22544a(supportTradeTypes, contextRequireContext);
        C45411x c45411xM22610j5 = m22610j4();
        if ((c45411xM22610j5 == null || (simpleScrollBarLayout2 = c45411xM22610j5.f102389l) == null || simpleScrollBarLayout2.getTabCount() != listM22544a.size()) && (c45411xM22610j4 = m22610j4()) != null && (simpleScrollBarLayout = c45411xM22610j4.f102389l) != null) {
            simpleScrollBarLayout.setTabData(CollectionsKt.toList(listM22544a));
        }
        Iterator<T> it = supportTradeTypes.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((TradeTypeUiData) next).getIsChecked());
        TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) next;
        if (tradeTypeUiData == null) {
            return;
        }
        String string = requireContext().getString(tradeTypeUiData.getF20772c());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mo22606f(string, tradeTypeUiData.getF20771b());
        m22611k4().m23372o(symbolInfo.getBaseIncrementPrecision());
        m22614n4().m23372o(symbolInfo.getBaseIncrementPrecision());
        C45411x c45411xM22610j6 = m22610j4();
        if (c45411xM22610j6 != null && (baseTextView4 = c45411xM22610j6.f102381d) != null) {
            ArrayList<String> arrayListM1040b = C0296a.m1040b(symbolInfo.getPriceIncrementPrecision());
            int priceIncrementPrecision = symbolInfo.getPriceIncrementPrecision() - m22579s0();
            baseTextView4.setText((arrayListM1040b.size() <= priceIncrementPrecision || priceIncrementPrecision < 0) ? arrayListM1040b.get(0) : arrayListM1040b.get(priceIncrementPrecision));
        }
        m22611k4().m23375r(m22579s0());
        m22614n4().m23375r(m22579s0());
        if (!z11) {
            C45411x c45411xM22610j7 = m22610j4();
            if (c45411xM22610j7 != null && (showHideTextView2 = c45411xM22610j7.f102396s) != null) {
                showHideTextView2.setText("--");
            }
            C45411x c45411xM22610j8 = m22610j4();
            if (c45411xM22610j8 != null && (showHideTextView = c45411xM22610j8.f102395r) != null) {
                showHideTextView.setText("--");
            }
            C45411x c45411xM22610j9 = m22610j4();
            if (c45411xM22610j9 != null && (dashTextView = c45411xM22610j9.f102392o) != null) {
                dashTextView.setText("--");
            }
        }
        C45411x c45411xM22610j10 = m22610j4();
        if (c45411xM22610j10 != null && (baseTextView3 = c45411xM22610j10.f102394q) != null) {
            baseTextView3.setText(C27017c.f54310a.m66516f(R$string.price_order, symbolInfo.getQuoteCurrencyName()));
        }
        C45411x c45411xM22610j11 = m22610j4();
        if (c45411xM22610j11 != null && (baseTextView2 = c45411xM22610j11.f102390m) != null) {
            baseTextView2.setText(C27017c.f54310a.m66516f(m22611k4().getF21269m() == 0 ? R$string.total_stub : R$string.amount_stub, symbolInfo.getBaseCurrencyName()));
        }
        C45411x c45411xM22610j12 = m22610j4();
        if (c45411xM22610j12 != null && (baseTextView = c45411xM22610j12.f102391n) != null) {
            baseTextView.setText(C27017c.f54310a.m66516f(m22611k4().getF21269m() == 0 ? R$string.total_stub : R$string.amount_stub, symbolInfo.getBaseCurrencyName()));
        }
        m22597N4(m22579s0());
        if (z11) {
            return;
        }
        m22611k4().m23365h();
        m22614n4().m23365h();
        mo22618s(symbolInfo, m22613m4().getF20635f0());
        Iterator<T> it2 = this.f20714c0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).mo22944E0();
        }
        Iterator<T> it3 = this.f20715d0.values().iterator();
        while (it3.hasNext()) {
            ((BaseOrderHolder) it3.next()).mo22944E0();
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20819a0() {
        return this.f20711Z;
    }

    public TradeBaseHorizontalSubmitFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.submit.horizontal.r
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseHorizontalSubmitFragment.m22548H4(this.f20741b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }

            {
                super(0);
            }
        });
        final Function0 function1 = null;
        this.f20710Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TradeSubmitVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function2 = function1;
                if (function2 != null && (creationExtras = (CreationExtras) function2.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f20711Z = InterfaceC4578a.j.f4055a;
        this.f20712a0 = C45681e.m100799e(this, new Function1<TradeBaseHorizontalSubmitFragment, C45411x>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45411x invoke(@NotNull TradeBaseHorizontalSubmitFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45411x.m100359a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C45411x, Unit>() { // from class: com.kubi.core.biz.submit.horizontal.TradeBaseHorizontalSubmitFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C45411x it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45411x c45411x) {
                invoke(c45411x);
                return Unit.INSTANCE;
            }
        });
        this.f20713b0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseHorizontalSubmitFragment.m22546B4(this.f20721b);
            }
        });
        this.f20714c0 = new LinkedHashMap();
        this.f20715d0 = new LinkedHashMap();
        this.f20716e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseHorizontalSubmitFragment.m22587z4(this.f20722b);
            }
        });
        this.f20717f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseHorizontalSubmitFragment.m22547C4(this.f20723b);
            }
        });
        this.f20718g0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.horizontal.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseHorizontalSubmitFragment.m22545A4(this.f20724b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final ITradeHolderDependDelegate m22545A4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeBaseHorizontalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.core.spot.business.holder.ITradeHolderDependDelegate");
        return (ITradeHolderDependDelegate) parentFragment;
    }

    /* JADX INFO: renamed from: B4 */
    public static final InterfaceC38175b m22546B4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeBaseHorizontalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.core.spot.business.ITradeParentBehavior");
        return (InterfaceC38175b) parentFragment;
    }

    /* JADX INFO: renamed from: H4 */
    public static final ViewModelStoreOwner m22548H4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        Fragment fragmentRequireParentFragment = tradeBaseHorizontalSubmitFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: P4 */
    public static final void m22559P4(List list, TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, String str, Integer num) {
        TradeType f20771b;
        Intrinsics.checkNotNull(num);
        TradeTypeUiData tradeTypeUiData = (TradeTypeUiData) CollectionsKt.getOrNull(list, num.intValue());
        if (tradeTypeUiData != null && (f20771b = tradeTypeUiData.getF20771b()) != null) {
            InterfaceC38175b interfaceC38175bM22613m4 = tradeBaseHorizontalSubmitFragment.m22613m4();
            Intrinsics.checkNotNull(str);
            interfaceC38175bM22613m4.mo22376e(str, f20771b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public static final Unit m22577q4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        SymbolInfoEntity symbolInfo = ((UiState) tradeBaseHorizontalSubmitFragment.m22615o4().getState()).getSymbolInfo();
        if (symbolInfo == null) {
            return Unit.INSTANCE;
        }
        tradeBaseHorizontalSubmitFragment.m22613m4().mo22355D(symbolInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m22578r4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, int i11, String[] strArr) {
        tradeBaseHorizontalSubmitFragment.m22613m4().mo22369T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "orderPriceNum", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: s0 */
    private final int m22579s0() {
        return m22613m4().getF20631b0();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m22580s4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, int i11, String[] strArr) {
        tradeBaseHorizontalSubmitFragment.m22613m4().mo22369T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "orderPriceNum", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: u4 */
    public static final Unit m22582u4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment, C45411x c45411x) {
        tradeBaseHorizontalSubmitFragment.m22613m4().mo22369T(C41014a.m89922G(C42180b.m92637b(c45411x.f102396s.getText().toString(), null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "bidAskPriceClick", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public static final Unit m22586y4(TradeBaseHorizontalSubmitFragment tradeBaseHorizontalSubmitFragment) {
        SymbolInfoEntity symbolInfo = ((UiState) tradeBaseHorizontalSubmitFragment.m22615o4().getState()).getSymbolInfo();
        if (symbolInfo != null) {
            tradeBaseHorizontalSubmitFragment.m22613m4().mo22384n(symbolInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D4 */
    public final void m22588D4() {
        double dCoerceAtLeast = RangesKt.coerceAtLeast(m22611k4().getF21273q(), m22614n4().getF21273q());
        m22611k4().m23373p(dCoerceAtLeast);
        m22614n4().m23373p(dCoerceAtLeast);
    }

    /* JADX INFO: renamed from: G4 */
    public final InterfaceC41775x1 m22593G4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TradeBaseHorizontalSubmitFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: I4 */
    public final void m22594I4(final SymbolInfoEntity symbolInfoEntity, boolean z11) {
        KcPrimaryButton kcPrimaryButton;
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null && (kcPrimaryButton = c45411xM22610j4.f102393p) != null) {
            if (z11) {
                ViewExtKt.m66594y(kcPrimaryButton);
                kcPrimaryButton.setEnabled(false);
                kcPrimaryButton.setAlpha(1.0f);
                kcPrimaryButton.setText(R$string.outage_tip);
                kcPrimaryButton.setBackgroundResource(R$drawable.shape_complementary16_24r);
                kcPrimaryButton.setTextColor(ContextCompat.getColor(kcPrimaryButton.getContext(), R$color.complementary));
                return;
            }
            kcPrimaryButton.setEnabled(true);
            kcPrimaryButton.setBackgroundColor(ContextCompat.getColor(kcPrimaryButton.getContext(), R$color.primary));
            kcPrimaryButton.setTextColor(ContextCompat.getColor(kcPrimaryButton.getContext(), R$color.c_textEmphasis));
            IUserService.Companion companion = IUserService.a;
            if (!companion.get().c()) {
                kcPrimaryButton.setText(R$string.login);
                ViewExtKt.m66594y(kcPrimaryButton);
            } else {
                TradeDirectionPanelSubmitVM tradeDirectionPanelSubmitVMM21011A3 = m21011A3();
                if (tradeDirectionPanelSubmitVMM21011A3 != null && tradeDirectionPanelSubmitVMM21011A3.m22527r(symbolInfoEntity) && !companion.get().d0().isAgreeEtf()) {
                    ViewExtKt.m66594y(kcPrimaryButton);
                    kcPrimaryButton.setText(R$string.etf_agree_terms);
                } else {
                    ViewExtKt.m66577h(kcPrimaryButton);
                }
            }
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.core.biz.submit.horizontal.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseHorizontalSubmitFragment.m22551J4(this.f20719b, symbolInfoEntity);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m22596M4(SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal) {
        DashTextView dashTextView;
        String strM85579c;
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null && (dashTextView = c45411xM22610j4.f102392o) != null) {
            if (bigDecimal == null) {
                strM85579c = null;
            } else {
                strM85579c = C37886j.m85579c(bigDecimal, symbolInfoEntity.getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            dashTextView.setText(C27041f.m66669i(strM85579c, "--"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O4 */
    public final void m22598O4() {
        final List<TradeTypeUiData> supportTradeTypes = ((UiState) m22615o4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            supportTradeTypes = CollectionsKt.emptyList();
        }
        C45411x c45411xM22610j4 = m22610j4();
        if (c45411xM22610j4 != null) {
            SimpleScrollBarLayout simpleScrollBarLayout = c45411xM22610j4.f102389l;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            simpleScrollBarLayout.setTabData(C12097h.m22544a(supportTradeTypes, contextRequireContext));
            SimpleScrollBarLayout simpleScrollBarLayout2 = c45411xM22610j4.f102389l;
            Iterator<TradeTypeUiData> it = supportTradeTypes.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                if (!it.next().getIsChecked()) {
                    i11++;
                } else {
                    simpleScrollBarLayout2.setCurrent(i11);
                    c45411xM22610j4.f102389l.setPositionChanged(new BiConsumer() { // from class: com.kubi.core.biz.submit.horizontal.g
                        @Override // io.reactivex.functions.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            TradeBaseHorizontalSubmitFragment.m22559P4(supportTradeTypes, this, (String) obj, (Integer) obj2);
                        }
                    });
                }
            }
            i11 = -1;
            simpleScrollBarLayout2.setCurrent(i11);
            c45411xM22610j4.f102389l.setPositionChanged(new BiConsumer() { // from class: com.kubi.core.biz.submit.horizontal.g
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    TradeBaseHorizontalSubmitFragment.m22559P4(supportTradeTypes, this, (String) obj, (Integer) obj2);
                }
            });
        }
    }

    @Override // p310he.InterfaceC38174a
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: c0 */
    public void mo22604c0() {
        m22611k4().notifyDataSetChanged();
        m22614n4().notifyDataSetChanged();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        SymbolBizUiState symbolBizUiStateM22740t = m21013D3().m22740t();
        SymbolInfoEntity symbolInfo = symbolBizUiStateM22740t.getSymbolInfo();
        if (symbolInfo != null) {
            m22590E4(symbolInfo, symbolBizUiStateM22740t.getIsMaintenance());
            mo22619v(symbolInfo, true);
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(m22613m4().getF20635f0().getPrice()));
        Iterator<T> it = this.f20714c0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo23037b(bigDecimal);
        }
        Iterator<T> it2 = this.f20715d0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).mo23037b(bigDecimal);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
    }
}
