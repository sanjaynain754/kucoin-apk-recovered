package com.kubi.core.biz.submit.vertical;

import ac.C0230b;
import af.C0296a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.InterfaceC4578a;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.utils.C11677d;
import com.kubi.core.biz.submit.C12089f;
import com.kubi.core.biz.submit.TradeDirectionPanelSubmitContract$UiState;
import com.kubi.core.biz.submit.TradeDirectionPanelSubmitVM;
import com.kubi.core.biz.submit.TradeSubmitVM;
import com.kubi.core.biz.submit.TradeTypeUiData;
import com.kubi.core.biz.submit.UiState;
import com.kubi.core.biz.symbol.SymbolBizUiState;
import com.kubi.core.spot.business.holder.AdvancedLimitOrderHolder;
import com.kubi.core.spot.business.holder.BaseOrderHolder;
import com.kubi.core.spot.business.holder.C12322c0;
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
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FocusedRecyclerView;
import com.kubi.resources.widget.OrderBookItemView;
import com.kubi.resources.widget.OrderBookShowView;
import com.kubi.resources.widget.OrderBookType;
import com.kubi.resources.widget.ShowHideTextView;
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
import com.kubi.utils.C27014a1;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27063n;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37886j;
import io.reactivex.Observable;
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
import p758xe.C46153b;
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
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import rs.C44172b;
import v30.C45409v;
import w00.C45681e;

/* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 r2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000206H\u0014J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u0002092\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010;H\u0016J\b\u0010@\u001a\u000209H\u0002J\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u000209H\u0002J\b\u0010D\u001a\u000209H\u0016J\b\u0010E\u001a\u00020BH\u0002J\b\u0010F\u001a\u000209H\u0002J\u0018\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0017J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020KH\u0002J\u001a\u0010N\u001a\u0002092\u0006\u0010H\u001a\u00020I2\b\u0010O\u001a\u0004\u0018\u00010PH\u0002J\b\u0010Q\u001a\u000209H\u0016J\b\u0010R\u001a\u000209H\u0016J\b\u0010S\u001a\u000209H\u0016J\u0010\u0010T\u001a\u0002092\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010U\u001a\u0002092\u0006\u0010V\u001a\u000206H\u0016J\u0010\u0010W\u001a\u0002092\u0006\u0010V\u001a\u000206H\u0016J\b\u0010X\u001a\u000209H\u0016J\u0018\u0010Y\u001a\u0002092\u0006\u0010H\u001a\u00020I2\u0006\u0010Z\u001a\u00020[H\u0016J\u0010\u0010\\\u001a\u0002092\u0006\u0010Z\u001a\u00020]H\u0016J\u0018\u0010^\u001a\u0002092\u0006\u0010H\u001a\u00020I2\u0006\u0010_\u001a\u00020KH\u0016J\u0018\u0010`\u001a\u0002092\u0006\u0010H\u001a\u00020I2\u0006\u0010a\u001a\u000206H\u0017J\b\u0010b\u001a\u000209H\u0017J\u0018\u0010c\u001a\u0002092\u0006\u0010d\u001a\u00020e2\u0006\u0010V\u001a\u00020!H\u0017J\u0018\u0010f\u001a\u0002092\u0006\u0010d\u001a\u00020e2\u0006\u0010g\u001a\u000206H\u0016J\u0010\u0010h\u001a\u0002092\u0006\u0010g\u001a\u000206H\u0002J\b\u0010i\u001a\u000209H\u0002J\b\u0010j\u001a\u000209H\u0002J\b\u0010k\u001a\u000209H\u0002J\u0010\u0010l\u001a\u0002062\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010m\u001a\u000209H\u0016J\u0016\u0010n\u001a\u0002092\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\r\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\r\u001a\u0004\b)\u0010&R\u001b\u0010+\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\r\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b2\u00103¨\u0006s"}, m90084d2 = {"Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment;", "Lcom/kubi/core/base/arch/mvi/AbsTradeBaseBizFragment;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiIntent;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitContract$UiState;", "Lcom/kubi/core/biz/submit/TradeDirectionPanelSubmitVM;", "Lcom/kubi/core/spot/business/ITradeChildBehavior;", "<init>", "()V", "submitVM", "Lcom/kubi/core/biz/submit/TradeSubmitVM;", "getSubmitVM", "()Lcom/kubi/core/biz/submit/TradeSubmitVM;", "submitVM$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", Constants.BIZ, "Lcom/kubi/core/config/TradeBiz;", "getBiz", "()Lcom/kubi/core/config/TradeBiz;", "vmClass", "Lkotlin/reflect/KClass;", "getVmClass", "()Lkotlin/reflect/KClass;", "createVM", "manager", "Lcom/kubi/core/base/arch/repo/ITradeCoreDataRepoProvider;", "mViewHolders", "", "Lcom/kubi/tradebase/tradetype/TradeType;", "Lcom/kubi/core/spot/business/holder/BaseOrderHolder;", "mBuyAdapter", "Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;", "getMBuyAdapter", "()Lcom/kubi/core/spot/quote/orderBook/OrderBookAdapter;", "mBuyAdapter$delegate", "mSellAdapter", "getMSellAdapter", "mSellAdapter$delegate", "mParent", "Lcom/kubi/core/spot/business/ITradeParentBehavior;", "getMParent", "()Lcom/kubi/core/spot/business/ITradeParentBehavior;", "mParent$delegate", "mHolderImp", "Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "getMHolderImp", "()Lcom/kubi/core/spot/business/holder/ITradeHolderDependDelegate;", "mHolderImp$delegate", "lastPrecision", "", "getLayout", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "initUI", "applyTradeTypeBackgroundColor", "Lkotlinx/coroutines/Job;", "initTabLyoutToggle", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "startCollectData", "resetDirection", "reloadSymbols", "symbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "onlyResetUI", "", "updateEtfViewLabel", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "updateExtValue", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "onAssetGet", "onAvailableTradeAmountChanged", "onClickPriceChange", "hideDialogInType", "type", "showDialogInType", "isSupportBorrow", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "refreshButtonStatus", "isMaintenance", "showOrderBookAmountType", "adapterPosition", "notifyOrderBookAdapter", "tradeModeChanged", "labelStr", "", "onOrderBookPrecisionChanged", "precision", "updateSelectPrecisionTextSize", "addOrderTypeChangeListener", "reSetRcyHeight", "resetMax", "measureViewHeight", "onRefresh", "showNewOrderTypeGuide", "tradeTypes", "", "Lcom/kubi/core/biz/submit/TradeTypeUiData;", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeBaseVerticalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeBaseVerticalSubmitFragment.kt\ncom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,802:1\n106#2,15:803\n147#3,16:818\n1869#4,2:834\n1869#4,2:837\n1869#4,2:839\n1869#4,2:841\n1869#4,2:843\n1869#4,2:845\n1869#4,2:847\n1869#4,2:849\n1563#4:851\n1634#4,3:852\n1869#4,2:859\n1#5:836\n37#6:855\n36#6,3:856\n*S KotlinDebug\n*F\n+ 1 TradeBaseVerticalSubmitFragment.kt\ncom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment\n*L\n92#1:803,15\n94#1:818,16\n267#1:834,2\n413#1:837,2\n435#1:839,2\n439#1:841,2\n443#1:843,2\n468#1:845,2\n499#1:847,2\n522#1:849,2\n155#1:851\n155#1:852,3\n243#1:859,2\n155#1:855\n155#1:856,3\n*E\n"})
public final class TradeBaseVerticalSubmitFragment extends AbsTradeBaseBizFragment<Object, TradeDirectionPanelSubmitContract$UiState, TradeDirectionPanelSubmitVM> implements InterfaceC38174a {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f20817Y;

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final InterfaceC24293a f20818Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final InterfaceC4578a f20819a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final Map<TradeType, BaseOrderHolder> f20820b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f20821c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f20822d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f20823e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final Lazy f20824f0;

    /* JADX INFO: renamed from: h0 */
    public static final /* synthetic */ KProperty<Object>[] f20816h0 = {Reflection.property1(new PropertyReference1Impl(TradeBaseVerticalSubmitFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentCoreTradeVerticalBinding;", 0))};

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public static final Companion f20815g0 = new Companion(null);

    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/core/biz/submit/vertical/TradeBaseVerticalSubmitFragment$Companion;", "", "<init>", "()V", "ORDER_BOOK_ITEM_VIEW_HIGH", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$a */
    /* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C12186a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.LIMIT_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.MARKET_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TradeType.ADVANCED_LIMIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TradeType.SEGMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m22641B4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        ISpotService iSpotService = ISpotService.f49646a.get();
        FragmentManager childFragmentManager = tradeBaseVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotService.mo60006s(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C4 */
    public static final Unit m22642C4(C45409v c45409v, TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        ConstraintLayout flPriceType = c45409v.f102353d;
        Intrinsics.checkNotNullExpressionValue(flPriceType, "flPriceType");
        C12089f.m22533b(flPriceType);
        List<TradeTypeUiData> supportTradeTypes = ((UiState) tradeBaseVerticalSubmitFragment.m22686q4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            supportTradeTypes = CollectionsKt.emptyList();
        }
        C46153b.f103658a.m101748a(tradeBaseVerticalSubmitFragment.m21013D3().m22743w()).mo21625b(supportTradeTypes, tradeBaseVerticalSubmitFragment, tradeBaseVerticalSubmitFragment.m22684o4(), c45409v);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D4 */
    public static final Unit m22643D4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, View it) {
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        List<TradeTypeUiData> supportTradeTypes = ((UiState) tradeBaseVerticalSubmitFragment.m22686q4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            supportTradeTypes = CollectionsKt.emptyList();
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
        FragmentManager childFragmentManager = tradeBaseVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        tradeTypeBizDialogFragmentNewInstance$default.show(childFragmentManager, "showTradeInfoDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final OrderBookAdapter m22644E4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        return new OrderBookAdapter(1, 0, tradeBaseVerticalSubmitFragment.m22684o4().mo22391z0(), 2, null);
    }

    /* JADX INFO: renamed from: H4 */
    public static final OrderBookAdapter m22647H4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        return new OrderBookAdapter(0, 0, tradeBaseVerticalSubmitFragment.m22684o4().mo22391z0(), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q4 */
    public static final Observable m22659Q4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, TradeType tradeType, Ref.ObjectRef objectRef, Map argsMap, String str) {
        Intrinsics.checkNotNullParameter(argsMap, "argsMap");
        TradeSubmitVM tradeSubmitVMM22686q4 = tradeBaseVerticalSubmitFragment.m22686q4();
        BaseOrderHolder baseOrderHolder = (BaseOrderHolder) objectRef.element;
        boolean z11 = false;
        if (baseOrderHolder != null && baseOrderHolder.m22966u0()) {
            z11 = true;
        }
        return tradeSubmitVMM22686q4.m22476q0(tradeType, z11, argsMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R4 */
    public static final Observable m22661R4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, TradeType tradeType, Ref.ObjectRef objectRef, Map argsMap, String str) {
        Intrinsics.checkNotNullParameter(argsMap, "argsMap");
        TradeSubmitVM tradeSubmitVMM22686q4 = tradeBaseVerticalSubmitFragment.m22686q4();
        BaseOrderHolder baseOrderHolder = (BaseOrderHolder) objectRef.element;
        boolean z11 = false;
        if (baseOrderHolder != null && baseOrderHolder.m22966u0()) {
            z11 = true;
        }
        return tradeSubmitVMM22686q4.m22476q0(tradeType, z11, argsMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public final void m22665T4(boolean z11) {
        ShowHideTextView showHideTextView;
        AppCompatImageView appCompatImageView;
        DashTextView dashTextView;
        ShowHideTextView showHideTextView2;
        AppCompatImageView appCompatImageView2;
        DashTextView dashTextView2;
        if (z11) {
            C45409v c45409vM22705l4 = m22705l4();
            if (c45409vM22705l4 != null && (dashTextView2 = c45409vM22705l4.f102367r) != null) {
                ViewExtKt.m66594y(dashTextView2);
            }
            C45409v c45409vM22705l5 = m22705l4();
            if (c45409vM22705l5 != null && (appCompatImageView2 = c45409vM22705l5.f102355f) != null) {
                ViewExtKt.m66594y(appCompatImageView2);
            }
            C45409v c45409vM22705l6 = m22705l4();
            if (c45409vM22705l6 == null || (showHideTextView2 = c45409vM22705l6.f102371v) == null) {
                return;
            }
            C27046k.m66703r(showHideTextView2);
            return;
        }
        C45409v c45409vM22705l7 = m22705l4();
        if (c45409vM22705l7 != null && (dashTextView = c45409vM22705l7.f102367r) != null) {
            C27046k.m66703r(dashTextView);
        }
        C45409v c45409vM22705l8 = m22705l4();
        if (c45409vM22705l8 != null && (appCompatImageView = c45409vM22705l8.f102355f) != null) {
            C27046k.m66703r(appCompatImageView);
        }
        C45409v c45409vM22705l9 = m22705l4();
        if (c45409vM22705l9 == null || (showHideTextView = c45409vM22705l9.f102371v) == null) {
            return;
        }
        ViewExtKt.m66594y(showHideTextView);
    }

    /* JADX INFO: renamed from: V4 */
    private final void m22669V4(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (i11 <= 8) {
            C45409v c45409vM22705l4 = m22705l4();
            if (c45409vM22705l4 == null || (baseTextView3 = c45409vM22705l4.f102352c) == null) {
                return;
            }
            baseTextView3.setTextSize(12.0f);
            return;
        }
        if (i11 <= 10) {
            C45409v c45409vM22705l5 = m22705l4();
            if (c45409vM22705l5 == null || (baseTextView2 = c45409vM22705l5.f102352c) == null) {
                return;
            }
            baseTextView2.setTextSize(11.0f);
            return;
        }
        C45409v c45409vM22705l6 = m22705l4();
        if (c45409vM22705l6 == null || (baseTextView = c45409vM22705l6.f102352c) == null) {
            return;
        }
        baseTextView.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m22681i4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, OrderBookType type) {
        FocusedRecyclerView focusedRecyclerView;
        FocusedRecyclerView focusedRecyclerView2;
        FocusedRecyclerView focusedRecyclerView3;
        FocusedRecyclerView focusedRecyclerView4;
        Intrinsics.checkNotNullParameter(type, "type");
        C45409v c45409vM22705l4 = tradeBaseVerticalSubmitFragment.m22705l4();
        if (c45409vM22705l4 != null && (focusedRecyclerView4 = c45409vM22705l4.f102362m) != null) {
            focusedRecyclerView4.setVisibility(Intrinsics.areEqual(type, OrderBookType.C22937c.f43986b) ? 8 : 0);
        }
        C45409v c45409vM22705l5 = tradeBaseVerticalSubmitFragment.m22705l4();
        if (c45409vM22705l5 != null && (focusedRecyclerView3 = c45409vM22705l5.f102363n) != null) {
            focusedRecyclerView3.setVisibility(Intrinsics.areEqual(type, OrderBookType.C22936b.f43985b) ? 8 : 0);
        }
        tradeBaseVerticalSubmitFragment.m22697J4();
        C45409v c45409vM22705l6 = tradeBaseVerticalSubmitFragment.m22705l4();
        if (c45409vM22705l6 != null && (focusedRecyclerView = c45409vM22705l6.f102362m) != null && focusedRecyclerView.getVisibility() == 8) {
            C45409v c45409vM22705l7 = tradeBaseVerticalSubmitFragment.m22705l4();
            RecyclerView.LayoutManager layoutManager = (c45409vM22705l7 == null || (focusedRecyclerView2 = c45409vM22705l7.f102363n) == null) ? null : focusedRecyclerView2.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(tradeBaseVerticalSubmitFragment.m22685p4().getItemCount() - 1);
        }
        tradeBaseVerticalSubmitFragment.m22700M4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    private final OrderBookAdapter m22682m4() {
        return (OrderBookAdapter) this.f20821c0.getValue();
    }

    /* JADX INFO: renamed from: n4 */
    private final ITradeHolderDependDelegate m22683n4() {
        return (ITradeHolderDependDelegate) this.f20824f0.getValue();
    }

    /* JADX INFO: renamed from: o4 */
    private final InterfaceC38175b m22684o4() {
        return (InterfaceC38175b) this.f20823e0.getValue();
    }

    /* JADX INFO: renamed from: p4 */
    private final OrderBookAdapter m22685p4() {
        return (OrderBookAdapter) this.f20822d0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public final TradeSubmitVM m22686q4() {
        return (TradeSubmitVM) this.f20817Y.getValue();
    }

    /* JADX INFO: renamed from: y4 */
    public static final Unit m22694y4(final C45409v c45409v, final TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        if (!TextUtils.isEmpty(c45409v.f102372w.getText())) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.core.biz.submit.vertical.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22695z4(this.f20839b, c45409v);
                }
            });
        }
        return Unit.INSTANCE;
    }

    @Override // p310he.InterfaceC38174a
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: E */
    public void mo22589E(@NotNull SymbolInfoEntity symbolInfo, int i11) {
        AlignTopTextView alignTopTextView;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        m22682m4().m23379v(i11);
        m22685p4().m23379v(i11);
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (alignTopTextView = c45409vM22705l4.f102365p) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27017c.f54310a.m66516f(m22682m4().getF21269m() == 0 ? R$string.accumulation : R$string.amount, new Object[0]));
            sb2.append("\n(");
            sb2.append(symbolInfo.getBaseCurrencyName());
            sb2.append(')');
            alignTopTextView.setText(sb2.toString());
        }
        mo22604c0();
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: F0 */
    public void mo22591F0(@NotNull OrderBookEntity data) {
        C45409v c45409vM22705l4;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zIsEmpty = m22685p4().getData().isEmpty();
        if (getView() == null || (c45409vM22705l4 = m22705l4()) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = c45409vM22705l4.f102363n.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        m22685p4().m23374q(C27024b.m66559b(data.getAsks()));
        linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
        m22682m4().m23374q(C27024b.m66559b(data.getBids()));
        m22700M4();
        if ((c45409vM22705l4.f102362m.getVisibility() == 0 && c45409vM22705l4.f102363n.getVisibility() == 0) || zIsEmpty) {
            RecyclerView.LayoutManager layoutManager2 = c45409vM22705l4.f102363n.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C27014a1.m66503c((LinearLayoutManager) layoutManager2, m22685p4().getData().size() - 1);
        }
        c45409vM22705l4.f102351b.m54454g(data.getBids(), data.getAsks());
    }

    /* JADX INFO: renamed from: K4 */
    public void m22698K4(@NotNull SymbolInfoEntity symbolInfo, boolean z11) {
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ITradeHolderImpDelegate.m23273a((BaseOrderHolder) it.next(), symbolInfo, z11, false, 4, null);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m22701N4(List<? extends TradeTypeUiData> list) {
        C45409v c45409vM22705l4;
        ConstraintLayout constraintLayout;
        C44128b.m97258b("submitVM.state.supportTradeTypes: " + list);
        if (!list.contains(new TradeTypeUiData.Segment(false, 1, null)) || (c45409vM22705l4 = m22705l4()) == null || (constraintLayout = c45409vM22705l4.f102353d) == null) {
            return;
        }
        C12089f.m22535d(constraintLayout);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: S */
    public void mo22599S() throws Exception {
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22969x0();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: U */
    public void mo22600U() {
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo22942C0();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: a */
    public void mo22601a(@NotNull BigDecimal value) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(value, "value");
        C45409v c45409vM22705l4 = m22705l4();
        if (C27039d.m66650j((c45409vM22705l4 == null || (frameLayout2 = c45409vM22705l4.f102354e) == null) ? null : Integer.valueOf(frameLayout2.getChildCount())) <= 0) {
            return;
        }
        C45409v c45409vM22705l5 = m22705l4();
        View viewM66698m = (c45409vM22705l5 == null || (frameLayout = c45409vM22705l5.f102354e) == null) ? null : C27046k.m66698m(frameLayout, 0);
        BaseOrderHolder baseOrderHolder = viewM66698m instanceof BaseOrderHolder ? (BaseOrderHolder) viewM66698m : null;
        if (baseOrderHolder != null) {
            baseOrderHolder.mo22940A0(value);
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: b */
    public void mo22602b(int i11) {
        AlignTopTextView alignTopTextView;
        C45409v c45409vM22705l4;
        BaseTextView baseTextView;
        if (i11 != 0) {
            if (i11 != 1 || (c45409vM22705l4 = m22705l4()) == null || (baseTextView = c45409vM22705l4.f102352c) == null) {
                return;
            }
            C27046k.m66694i(baseTextView, R$drawable.ic2_triangle_top_12, 0, 0, 4, null);
            return;
        }
        C45409v c45409vM22705l5 = m22705l4();
        if (c45409vM22705l5 == null || (alignTopTextView = c45409vM22705l5.f102365p) == null) {
            return;
        }
        C27046k.m66694i(alignTopTextView, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: c */
    public void mo22603c(int i11) {
        AlignTopTextView alignTopTextView;
        C45409v c45409vM22705l4;
        BaseTextView baseTextView;
        if (i11 != 0) {
            if (i11 != 1 || (c45409vM22705l4 = m22705l4()) == null || (baseTextView = c45409vM22705l4.f102352c) == null) {
                return;
            }
            C27046k.m66694i(baseTextView, R$drawable.ic2_triangle_bottom_12, 0, 0, 4, null);
            return;
        }
        C45409v c45409vM22705l5 = m22705l4();
        if (c45409vM22705l5 == null || (alignTopTextView = c45409vM22705l5.f102365p) == null) {
            return;
        }
        C27046k.m66694i(alignTopTextView, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: d */
    public void mo22605d(@NotNull String labelStr, int i11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (baseTextView = c45409vM22705l4.f102352c) != null) {
            baseTextView.setText(labelStr);
        }
        m22669V4(i11);
        m22682m4().m23375r(i11);
        m22685p4().m23375r(i11);
        m22700M4();
    }

    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19, types: [T, com.kubi.core.spot.business.holder.BaseOrderHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, com.kubi.core.spot.business.holder.LimitOrderHolder] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p310he.InterfaceC38174a
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: f */
    public void mo22606f(@NotNull String labelStr, @NotNull final TradeType type) throws Exception {
        FrameLayout frameLayout;
        RadioGroup radioGroup;
        FrameLayout frameLayout2;
        LinearLayout limitOrderHolder;
        ?? r11;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        Intrinsics.checkNotNullParameter(type, "type");
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (baseTextView = c45409vM22705l4.f102368s) != null) {
            baseTextView.setText(labelStr);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? r12 = this.f20820b0.get(type);
        objectRef.element = r12;
        if (r12 == 0) {
            Function2 function2 = new Function2() { // from class: com.kubi.core.biz.submit.vertical.g
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeBaseVerticalSubmitFragment.m22659Q4(this.f20832b, type, objectRef, (Map) obj, (String) obj2);
                }
            };
            switch (C12186a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    Context contextRequireContext = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    limitOrderHolder = new LimitOrderHolder(contextRequireContext, TradeType.LIMIT_STOP, m22683n4(), true, false, function2, m22686q4().m22475p0(), m22686q4(), null, 272, null);
                    r11 = limitOrderHolder;
                    break;
                case 2:
                    Context contextRequireContext2 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                    limitOrderHolder = new LimitOrderHolder(contextRequireContext2, TradeType.LIMIT, m22683n4(), false, false, function2, m22686q4().m22475p0(), m22686q4(), null, 280, null);
                    r11 = limitOrderHolder;
                    break;
                case 3:
                    Context contextRequireContext3 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                    limitOrderHolder = new MarketOrderHolder(contextRequireContext3, TradeType.MARKET_STOP, m22683n4(), true, false, function2, m22686q4().m22475p0(), m22686q4(), null, 272, null);
                    r11 = limitOrderHolder;
                    break;
                case 4:
                    Context contextRequireContext4 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                    limitOrderHolder = new MarketOrderHolder(contextRequireContext4, TradeType.MARKET, m22683n4(), false, false, function2, m22686q4().m22475p0(), m22686q4(), null, 280, null);
                    r11 = limitOrderHolder;
                    break;
                case 5:
                    Context contextRequireContext5 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                    limitOrderHolder = new AdvancedLimitOrderHolder(contextRequireContext5, TradeType.ADVANCED_LIMIT, m22683n4(), false, false, function2, m22686q4().m22475p0(), m22686q4(), null, 280, null);
                    r11 = limitOrderHolder;
                    break;
                case 6:
                    Context contextRequireContext6 = requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
                    limitOrderHolder = new SegmentOrderHolder(contextRequireContext6, TradeType.SEGMENT, m22683n4(), false, function2, m22686q4().m22475p0(), m22686q4(), null, 136, null);
                    r11 = limitOrderHolder;
                    break;
                default:
                    r11 = 0;
                    break;
            }
            objectRef.element = r11;
            if (r11 != 0) {
                this.f20820b0.put(type, (BaseOrderHolder) r11);
                r11.m22968w0();
            }
        }
        if (objectRef.element == 0) {
            Function2 function3 = new Function2() { // from class: com.kubi.core.biz.submit.vertical.h
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeBaseVerticalSubmitFragment.m22661R4(this.f20835b, type, objectRef, (Map) obj, (String) obj2);
                }
            };
            Context contextRequireContext7 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
            objectRef.element = new LimitOrderHolder(contextRequireContext7, TradeType.LIMIT, m22683n4(), false, false, function3, m22686q4().m22475p0(), m22686q4(), null, 280, null);
        }
        BaseOrderHolder baseOrderHolder = (BaseOrderHolder) objectRef.element;
        if (baseOrderHolder != null) {
            C45409v c45409vM22705l5 = m22705l4();
            if (c45409vM22705l5 != null && (frameLayout2 = c45409vM22705l5.f102354e) != null) {
                frameLayout2.removeAllViews();
            }
            C45409v c45409vM22705l6 = m22705l4();
            boolean z11 = false;
            if (c45409vM22705l6 != null && (radioGroup = c45409vM22705l6.f102364o) != null && radioGroup.getCheckedRadioButtonId() == R$id.tv_buy) {
                z11 = true;
            }
            baseOrderHolder.setIsBuyHolder(z11);
            baseOrderHolder.m22969x0();
            C45409v c45409vM22705l7 = m22705l4();
            if (c45409vM22705l7 != null && (frameLayout = c45409vM22705l7.f102354e) != null) {
                frameLayout.addView(baseOrderHolder);
            }
            baseOrderHolder.m22945F0();
            if (baseOrderHolder.getTag() != null) {
                m22697J4();
            } else {
                baseOrderHolder.post(new Runnable() { // from class: com.kubi.core.biz.submit.vertical.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        TradeBaseVerticalSubmitFragment.m22663S4(this.f20838b);
                    }
                });
            }
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_core_trade_vertical;
    }

    @Override // com.kubi.mvi.state.BaseStateFragment
    @NotNull
    public KClass<TradeDirectionPanelSubmitVM> getVmClass() {
        return Reflection.getOrCreateKotlinClass(TradeDirectionPanelSubmitVM.class);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: h2 */
    public void mo22608h2() {
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22968w0();
        }
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public TradeDirectionPanelSubmitVM mo21017v3(@NotNull AbstractC46753c manager) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new TradeDirectionPanelSubmitVM(manager);
    }

    /* JADX INFO: renamed from: l4 */
    public final C45409v m22705l4() {
        return (C45409v) this.f20818Z.getValue(this, f20816h0[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.clear();
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws Exception {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m22706r4();
        m22689t4();
        m22655O4();
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 == null || (frameLayout = c45409vM22705l4.f102354e) == null || frameLayout.getChildCount() != 0) {
            return;
        }
        mo22606f(C27017c.f54310a.m66516f(R$string.limit_price_order, new Object[0]), TradeType.LIMIT);
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: p2 */
    public void mo22616p2() {
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).m22948H();
        }
    }

    @Override // p310he.InterfaceC38174a
    /* JADX INFO: renamed from: s */
    public void mo22618s(@NotNull SymbolInfoEntity symbolInfo, @NotNull OrderBookCenterEntity data) {
        BaseTextView baseTextView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        TextView textViewM97383c;
        BaseTextView baseTextView4;
        C45409v c45409vM22705l4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ShowHideTextView showHideTextView3;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        Intrinsics.checkNotNullParameter(data, "data");
        if (getView() == null) {
            return;
        }
        if (data.getPrice() == 0.0d) {
            C45409v c45409vM22705l5 = m22705l4();
            if (c45409vM22705l5 != null && (baseTextView8 = c45409vM22705l5.f102372w) != null) {
                baseTextView8.setText("--");
            }
            C45409v c45409vM22705l6 = m22705l4();
            if (c45409vM22705l6 != null && (baseTextView7 = c45409vM22705l6.f102372w) != null) {
                baseTextView7.setTextColor(getColorRes(R$color.c_text40));
            }
            C45409v c45409vM22705l7 = m22705l4();
            if (c45409vM22705l7 == null || (showHideTextView3 = c45409vM22705l7.f102371v) == null) {
                return;
            }
            showHideTextView3.setText("--");
            return;
        }
        Context contextM66513b = C27017c.f54310a.m66513b();
        C45409v c45409vM22705l8 = m22705l4();
        Object tag = (c45409vM22705l8 == null || (baseTextView6 = c45409vM22705l8.f102372w) == null) ? null : baseTextView6.getTag();
        int iM58391a = C24218b.m58391a(contextM66513b, C27039d.m66646f(tag instanceof Double ? (Double) tag : null), data.getPrice());
        if (iM58391a != -1 && (c45409vM22705l4 = m22705l4()) != null && (baseTextView5 = c45409vM22705l4.f102372w) != null) {
            baseTextView5.setTextColor(iM58391a);
        }
        C45409v c45409vM22705l9 = m22705l4();
        if (c45409vM22705l9 != null && (baseTextView4 = c45409vM22705l9.f102372w) != null) {
            baseTextView4.setTag(Double.valueOf(data.getPrice()));
        }
        C45409v c45409vM22705l10 = m22705l4();
        if (c45409vM22705l10 != null && (baseTextView3 = c45409vM22705l10.f102372w) != null && (textViewM97383c = C44172b.m97383c(baseTextView3, null, false, 3, null)) != null) {
            textViewM97383c.setText(C37886j.m85579c(new BigDecimal(String.valueOf(data.getPrice())), symbolInfo.getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        if (m22687s0() < 11) {
            C45409v c45409vM22705l11 = m22705l4();
            if (c45409vM22705l11 != null && (baseTextView2 = c45409vM22705l11.f102372w) != null) {
                baseTextView2.setTextSize(16.0f);
            }
        } else {
            C45409v c45409vM22705l12 = m22705l4();
            if (c45409vM22705l12 != null && (baseTextView = c45409vM22705l12.f102372w) != null) {
                baseTextView.setTextSize(14.0f);
            }
        }
        C45409v c45409vM22705l13 = m22705l4();
        if (c45409vM22705l13 != null && (showHideTextView2 = c45409vM22705l13.f102371v) != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(data.getPrice()));
            String quoteCurrency = symbolInfo.getQuoteCurrency();
            if (quoteCurrency == null) {
                quoteCurrency = "";
            }
            showHideTextView2.setText(C12322c0.m23256f(bigDecimal, quoteCurrency, true));
        }
        C45409v c45409vM22705l14 = m22705l4();
        if (c45409vM22705l14 != null && (showHideTextView = c45409vM22705l14.f102371v) != null) {
            C24256n1.m58513c(showHideTextView);
        }
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo22971z0(new BigDecimal(String.valueOf(m22684o4().getF20635f0().getPrice())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p310he.InterfaceC38174a
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: v */
    public void mo22619v(@NotNull SymbolInfoEntity symbolInfo, boolean z11) throws Exception {
        Object next;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        Intrinsics.checkNotNullParameter(symbolInfo, "symbolInfo");
        List<TradeTypeUiData> supportTradeTypes = ((UiState) m22686q4().getState()).getSupportTradeTypes();
        if (supportTradeTypes == null) {
            supportTradeTypes = CollectionsKt.emptyList();
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
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (constraintLayout = c45409vM22705l4.f102353d) != null) {
            constraintLayout.setBackgroundResource(C46153b.f103658a.m101749c(m21013D3().m22743w()));
        }
        C45409v c45409vM22705l5 = m22705l4();
        if (c45409vM22705l5 != null && (baseTextView = c45409vM22705l5.f102368s) != null) {
            baseTextView.setTextColor(getColorRes(C46153b.f103658a.m101751e(m21013D3().m22743w())));
        }
        C45409v c45409vM22705l6 = m22705l4();
        if (c45409vM22705l6 != null) {
            c45409vM22705l6.f102369t.setText(getString(R$string.price) + "\n(" + symbolInfo.getQuoteCurrencyName() + ')');
            AlignTopTextView alignTopTextView = c45409vM22705l6.f102365p;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C27017c.f54310a.m66516f(m22682m4().getF21269m() == 0 ? R$string.accumulation : R$string.amount, new Object[0]));
            sb2.append("\n(");
            sb2.append(symbolInfo.getBaseCurrencyName());
            sb2.append(')');
            alignTopTextView.setText(sb2.toString());
            m22682m4().m23372o(symbolInfo.getBaseIncrementPrecision());
            m22685p4().m23372o(symbolInfo.getBaseIncrementPrecision());
            m22682m4().m23375r(m22687s0());
            m22685p4().m23375r(m22687s0());
            if (!z11) {
                c45409vM22705l6.f102372w.setText("--");
                c45409vM22705l6.f102371v.setText("--");
                c45409vM22705l6.f102367r.setText("--");
            }
            BaseTextView baseTextView2 = c45409vM22705l6.f102352c;
            ArrayList<String> arrayListM1040b = C0296a.m1040b(symbolInfo.getPriceIncrementPrecision());
            int priceIncrementPrecision = symbolInfo.getPriceIncrementPrecision() - m22687s0();
            baseTextView2.setText((arrayListM1040b.size() <= priceIncrementPrecision || priceIncrementPrecision < 0) ? arrayListM1040b.get(0) : arrayListM1040b.get(priceIncrementPrecision));
            m22669V4(m22687s0());
        }
        if (z11) {
            return;
        }
        mo22618s(symbolInfo, m22684o4().getF20635f0());
        m22682m4().m23365h();
        m22685p4().m23365h();
        Iterator<T> it2 = this.f20820b0.values().iterator();
        while (it2.hasNext()) {
            ((BaseOrderHolder) it2.next()).mo22944E0();
        }
        m22701N4(supportTradeTypes);
    }

    @Override // com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment
    @NotNull
    /* JADX INFO: renamed from: y3, reason: from getter */
    public InterfaceC4578a getF20211b0() {
        return this.f20819a0;
    }

    public TradeBaseVerticalSubmitFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.submit.vertical.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseVerticalSubmitFragment.m22657P4(this.f20827b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewModels$default$1
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
        this.f20817Y = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(TradeSubmitVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewModels$default$4
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
        this.f20818Z = C45681e.m100799e(this, new Function1<TradeBaseVerticalSubmitFragment, C45409v>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45409v invoke(@NotNull TradeBaseVerticalSubmitFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45409v.m100355a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C45409v, Unit>() { // from class: com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C45409v it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45409v c45409v) {
                invoke(c45409v);
                return Unit.INSTANCE;
            }
        });
        this.f20819a0 = InterfaceC4578a.l.f4057a;
        this.f20820b0 = new LinkedHashMap();
        this.f20821c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.vertical.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseVerticalSubmitFragment.m22644E4(this.f20828b);
            }
        });
        this.f20822d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.vertical.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseVerticalSubmitFragment.m22647H4(this.f20829b);
            }
        });
        this.f20823e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.vertical.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseVerticalSubmitFragment.m22646G4(this.f20830b);
            }
        });
        this.f20824f0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.submit.vertical.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeBaseVerticalSubmitFragment.m22645F4(this.f20831b);
            }
        });
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m22640A4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        FragmentManager childFragmentManager = tradeBaseVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        C42806a.m93834a(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final ITradeHolderDependDelegate m22645F4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeBaseVerticalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.core.spot.business.holder.ITradeHolderDependDelegate");
        return (ITradeHolderDependDelegate) parentFragment;
    }

    /* JADX INFO: renamed from: G4 */
    public static final InterfaceC38175b m22646G4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeBaseVerticalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.core.spot.business.ITradeParentBehavior");
        return (InterfaceC38175b) parentFragment;
    }

    /* JADX INFO: renamed from: O4 */
    private final InterfaceC41775x1 m22655O4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new TradeBaseVerticalSubmitFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: P4 */
    public static final ViewModelStoreOwner m22657P4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        Fragment fragmentRequireParentFragment = tradeBaseVerticalSubmitFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: S4 */
    public static final void m22663S4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        if (tradeBaseVerticalSubmitFragment.getView() != null && tradeBaseVerticalSubmitFragment.getHost() != null) {
            tradeBaseVerticalSubmitFragment.m22697J4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public final void m22667U4(SymbolInfoEntity symbolInfoEntity, BigDecimal bigDecimal) {
        DashTextView dashTextView;
        String strM85579c;
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (dashTextView = c45409vM22705l4.f102367r) != null) {
            if (bigDecimal == null) {
                strM85579c = null;
            } else {
                strM85579c = C37886j.m85579c(bigDecimal, symbolInfoEntity.getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            dashTextView.setText(C27041f.m66669i(strM85579c, "--"));
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final int m22687s0() {
        return m22684o4().getF20631b0();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m22688s4(C45409v c45409v, TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, RadioGroup radioGroup, int i11) {
        String str;
        boolean z11;
        String strM23402a = C12462a.m23402a();
        int i12 = R$id.tv_buy;
        if (i11 == i12) {
            str = "buyTab";
        } else {
            str = "sellTab";
        }
        C43852m.m96591c(strM23402a, str, null, null, 12, null);
        if (i11 == i12) {
            RadioButton tvBuy = c45409v.f102366q;
            Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
            C0230b.m848l(tvBuy, false, 1, null);
            RadioButton tvSell = c45409v.f102370u;
            Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
            C0230b.m851o(tvSell, false);
        } else {
            RadioButton tvBuy2 = c45409v.f102366q;
            Intrinsics.checkNotNullExpressionValue(tvBuy2, "tvBuy");
            C0230b.m847k(tvBuy2, false);
            RadioButton tvSell2 = c45409v.f102370u;
            Intrinsics.checkNotNullExpressionValue(tvSell2, "tvSell");
            C0230b.m852p(tvSell2, false, 1, null);
        }
        for (BaseOrderHolder baseOrderHolder : tradeBaseVerticalSubmitFragment.f20820b0.values()) {
            if (c45409v.f102364o.getCheckedRadioButtonId() == R$id.tv_buy) {
                z11 = true;
            } else {
                z11 = false;
            }
            baseOrderHolder.setIsBuyHolder(z11);
        }
    }

    /* JADX INFO: renamed from: t4 */
    private final void m22689t4() {
        final C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null) {
            ConstraintLayout flPriceType = c45409vM22705l4.f102353d;
            Intrinsics.checkNotNullExpressionValue(flPriceType, "flPriceType");
            C27046k.m66711z(flPriceType, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22642C4(c45409vM22705l4, this);
                }
            }, 1, null);
            AppCompatImageView ivPriceTypeInfo = c45409vM22705l4.f102357h;
            Intrinsics.checkNotNullExpressionValue(ivPriceTypeInfo, "ivPriceTypeInfo");
            C11677d.m21216d(ivPriceTypeInfo, 0L, new Function1() { // from class: com.kubi.core.biz.submit.vertical.m
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBaseVerticalSubmitFragment.m22643D4(this.f20844b, (View) obj);
                }
            }, 1, null);
            BaseTextView cbOrderbookSelectPrecision = c45409vM22705l4.f102352c;
            Intrinsics.checkNotNullExpressionValue(cbOrderbookSelectPrecision, "cbOrderbookSelectPrecision");
            C27046k.m66711z(cbOrderbookSelectPrecision, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22690u4(this.f20845b);
                }
            }, 1, null);
            AlignTopTextView tvBaseUnitOut = c45409vM22705l4.f102365p;
            Intrinsics.checkNotNullExpressionValue(tvBaseUnitOut, "tvBaseUnitOut");
            C27046k.m66711z(tvBaseUnitOut, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22691v4(this.f20846b);
                }
            }, 1, null);
            m22702h4();
            m22685p4().bindToRecyclerView(c45409vM22705l4.f102363n);
            m22682m4().bindToRecyclerView(c45409vM22705l4.f102362m);
            OrderBookAdapter orderBookAdapterM22685p4 = m22685p4();
            int i11 = R$layout.trade_core_view_orderbook_loading;
            orderBookAdapterM22685p4.setEmptyView(i11, c45409vM22705l4.f102363n);
            m22682m4().setEmptyView(i11, c45409vM22705l4.f102362m);
            m22685p4().m23378u(5);
            m22682m4().m23378u(5);
            c45409vM22705l4.f102363n.setHasFixedSize(true);
            c45409vM22705l4.f102362m.setHasFixedSize(true);
            FocusedRecyclerView rcvSell = c45409vM22705l4.f102363n;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            C22912t.m54410h(rcvSell, false, 1, null);
            FocusedRecyclerView rcvBuy = c45409vM22705l4.f102362m;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            C22912t.m54410h(rcvBuy, false, 1, null);
            c45409vM22705l4.f102363n.setNestedScrollingEnabled(false);
            c45409vM22705l4.f102362m.setNestedScrollingEnabled(false);
            m22682m4().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.core.biz.submit.vertical.p
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeBaseVerticalSubmitFragment.m22692w4(this.f20847a, i12, strArr);
                }
            });
            m22685p4().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.core.biz.submit.vertical.q
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeBaseVerticalSubmitFragment.m22693x4(this.f20848a, i12, strArr);
                }
            });
            ConstraintLayout llCenter = c45409vM22705l4.f102360k;
            Intrinsics.checkNotNullExpressionValue(llCenter, "llCenter");
            C27046k.m66711z(llCenter, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22694y4(c45409vM22705l4, this);
                }
            }, 1, null);
            DashTextView tvEtfValue = c45409vM22705l4.f102367r;
            Intrinsics.checkNotNullExpressionValue(tvEtfValue, "tvEtfValue");
            C27046k.m66711z(tvEtfValue, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.s
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22640A4(this.f20851b);
                }
            }, 1, null);
            BuySellRatioView buySellRatioView = c45409vM22705l4.f102351b;
            Intrinsics.checkNotNullExpressionValue(buySellRatioView, "buySellRatioView");
            C27046k.m66711z(buySellRatioView, 0L, new Function0() { // from class: com.kubi.core.biz.submit.vertical.t
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeBaseVerticalSubmitFragment.m22641B4(this.f20852b);
                }
            }, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public static final Unit m22690u4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        SymbolInfoEntity symbolInfo = ((UiState) tradeBaseVerticalSubmitFragment.m22686q4().getState()).getSymbolInfo();
        if (symbolInfo != null) {
            tradeBaseVerticalSubmitFragment.m22684o4().mo22384n(symbolInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v4 */
    public static final Unit m22691v4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment) {
        SymbolInfoEntity symbolInfo = ((UiState) tradeBaseVerticalSubmitFragment.m22686q4().getState()).getSymbolInfo();
        if (symbolInfo != null) {
            tradeBaseVerticalSubmitFragment.m22684o4().mo22355D(symbolInfo);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m22692w4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, int i11, String[] strArr) {
        tradeBaseVerticalSubmitFragment.m22684o4().mo22369T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "orderPriceNum", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: x4 */
    public static final void m22693x4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, int i11, String[] strArr) {
        tradeBaseVerticalSubmitFragment.m22684o4().mo22369T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "orderPriceNum", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: z4 */
    public static final Unit m22695z4(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, C45409v c45409v) {
        tradeBaseVerticalSubmitFragment.m22684o4().mo22369T(C41014a.m89922G(C42180b.m92637b(c45409v.f102372w.getText().toString(), null, 1, null), null, 1, null));
        C43852m.m96591c(C12462a.m23402a(), "bidAskPriceClick", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public final int m22696I4(View view) {
        ViewGroup.LayoutParams layoutParams;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        if (view.getLayoutParams() == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams = view.getLayoutParams();
        }
        int i11 = layoutParams.width;
        if (i11 != -2) {
            if (i11 != -1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824);
            }
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i12 = layoutParams.height;
        if (i12 > 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        return view.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: J4 */
    public final void m22697J4() {
        boolean z11;
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null) {
            if (c45409vM22705l4.f102363n.getVisibility() == 0 && c45409vM22705l4.f102362m.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            View childAt = c45409vM22705l4.f102354e.getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            int iM22696I4 = m22696I4(childAt);
            c45409vM22705l4.f102354e.getChildAt(0).setTag(Integer.valueOf(iM22696I4));
            int iM6236a = iM22696I4 + C5275i0.m6236a(96.0f);
            int iM6236a2 = C5275i0.m6236a(391.0f);
            int i11 = 5;
            while (iM6236a - iM6236a2 > 0.0f) {
                iM6236a2 += C5275i0.m6236a(26.0f) * 2;
                i11++;
            }
            m22685p4().m23378u(i11);
            m22682m4().m23378u(i11);
            c45409vM22705l4.f102362m.setSelfScroll(!z11);
            c45409vM22705l4.f102363n.setSelfScroll(!z11);
            m22685p4().m23377t(z11);
            m22682m4().m23377t(z11);
            float f11 = i11 * 26.0f;
            if (!z11) {
                f11 = i11 * 2 * 26.0f;
            }
            FocusedRecyclerView rcvSell = c45409vM22705l4.f102363n;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            ViewExtKt.m66578i(rcvSell, C5275i0.m6236a(f11));
            FocusedRecyclerView rcvBuy = c45409vM22705l4.f102362m;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            ViewExtKt.m66578i(rcvBuy, C5275i0.m6236a(f11));
        }
    }

    /* JADX INFO: renamed from: L4 */
    public final void m22699L4() {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ConstraintLayout constraintLayout;
        RadioGroup radioGroup;
        ConstraintLayout constraintLayout2;
        RadioGroup radioGroup2;
        C45409v c45409vM22705l4 = m22705l4();
        ConstraintLayout.LayoutParams layoutParams4 = null;
        if (c45409vM22705l4 != null && (radioGroup2 = c45409vM22705l4.f102364o) != null) {
            layoutParams = radioGroup2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        C45409v c45409vM22705l5 = m22705l4();
        if (c45409vM22705l5 != null && (constraintLayout2 = c45409vM22705l5.f102360k) != null) {
            layoutParams3 = constraintLayout2.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 instanceof ConstraintLayout.LayoutParams) {
            layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        }
        if (C27063n.m66764b("trade_panel_position", 1) == 0) {
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(0);
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(C5275i0.m6236a(20.0f));
            }
            if (layoutParams2 != null) {
                layoutParams2.endToEnd = -1;
            }
            if (layoutParams2 != null) {
                layoutParams2.startToEnd = -1;
            }
            if (layoutParams2 != null) {
                layoutParams2.startToStart = R$id.parent;
            }
            if (layoutParams2 != null) {
                layoutParams2.endToStart = R$id.ll_center;
            }
            if (layoutParams4 != null) {
                layoutParams4.startToEnd = R$id.rgToggle;
            }
            if (layoutParams4 != null) {
                layoutParams4.endToEnd = R$id.parent;
            }
            if (layoutParams4 != null) {
                layoutParams4.startToStart = -1;
            }
            if (layoutParams4 != null) {
                layoutParams4.endToStart = -1;
            }
        } else {
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(C5275i0.m6236a(20.0f));
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd(0);
            }
            if (layoutParams2 != null) {
                layoutParams2.endToEnd = R$id.parent;
            }
            if (layoutParams2 != null) {
                layoutParams2.startToEnd = R$id.ll_center;
            }
            if (layoutParams2 != null) {
                layoutParams2.startToStart = -1;
            }
            if (layoutParams2 != null) {
                layoutParams2.endToStart = -1;
            }
            if (layoutParams4 != null) {
                layoutParams4.endToStart = R$id.rgToggle;
            }
            if (layoutParams4 != null) {
                layoutParams4.startToStart = R$id.parent;
            }
            if (layoutParams4 != null) {
                layoutParams4.endToEnd = -1;
            }
            if (layoutParams4 != null) {
                layoutParams4.startToEnd = -1;
            }
        }
        C45409v c45409vM22705l6 = m22705l4();
        if (c45409vM22705l6 != null && (radioGroup = c45409vM22705l6.f102364o) != null) {
            radioGroup.setLayoutParams(layoutParams2);
        }
        C45409v c45409vM22705l7 = m22705l4();
        if (c45409vM22705l7 != null && (constraintLayout = c45409vM22705l7.f102360k) != null) {
            constraintLayout.setLayoutParams(layoutParams4);
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final void m22700M4() {
        double dM23370m;
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null) {
            if (c45409vM22705l4.f102362m.getVisibility() == 0 && c45409vM22705l4.f102363n.getVisibility() == 0) {
                dM23370m = Math.max(m22682m4().getF21273q(), m22685p4().getF21273q());
            } else if (c45409vM22705l4.f102363n.getVisibility() == 0) {
                dM23370m = m22685p4().getF21273q();
            } else {
                dM23370m = m22682m4().getF21273q();
            }
            m22682m4().m23373p(dM23370m);
            m22685p4().m23373p(dM23370m);
        }
    }

    @Override // p310he.InterfaceC38174a
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: c0 */
    public void mo22604c0() {
        if (isAdded() && isShowing()) {
            m22682m4().notifyDataSetChanged();
            m22685p4().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m22702h4() {
        OrderBookShowView orderBookShowView;
        C43852m.m96591c(C12462a.m23402a(), "orderShowShift", null, null, 12, null);
        C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null && (orderBookShowView = c45409vM22705l4.f102356g) != null) {
            orderBookShowView.setTypeChangeListener(new Function1() { // from class: com.kubi.core.biz.submit.vertical.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeBaseVerticalSubmitFragment.m22681i4(this.f20841b, (OrderBookType) obj);
                }
            });
        }
    }

    @NotNull
    /* JADX INFO: renamed from: j4 */
    public final InterfaceC41775x1 m22703j4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1(this, null));
    }

    @Override // com.kubi.mvi.state.BaseStateFragment, com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        RadioButton radioButton;
        RadioButton radioButton2;
        if (m22684o4().getF20636g0()) {
            C45409v c45409vM22705l4 = m22705l4();
            if (c45409vM22705l4 != null && (radioButton2 = c45409vM22705l4.f102366q) != null) {
                radioButton2.setChecked(true);
            }
        } else {
            C45409v c45409vM22705l5 = m22705l4();
            if (c45409vM22705l5 != null && (radioButton = c45409vM22705l5.f102370u) != null) {
                radioButton.setChecked(true);
            }
        }
        SymbolBizUiState symbolBizUiStateM22740t = m21013D3().m22740t();
        SymbolInfoEntity symbolInfo = symbolBizUiStateM22740t.getSymbolInfo();
        if (symbolInfo != null) {
            mo22619v(symbolInfo, true);
            m22698K4(symbolInfo, symbolBizUiStateM22740t.getIsMaintenance());
        }
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(m22684o4().getF20635f0().getPrice()));
        Iterator<T> it = this.f20820b0.values().iterator();
        while (it.hasNext()) {
            ((BaseOrderHolder) it.next()).mo23037b(bigDecimal);
        }
        m22699L4();
    }

    /* JADX INFO: renamed from: r4 */
    public final void m22706r4() {
        final C45409v c45409vM22705l4 = m22705l4();
        if (c45409vM22705l4 != null) {
            RadioButton tvBuy = c45409vM22705l4.f102366q;
            Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
            C0230b.m848l(tvBuy, false, 1, null);
            RadioButton tvSell = c45409vM22705l4.f102370u;
            Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
            C0230b.m851o(tvSell, false);
            c45409vM22705l4.f102364o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.core.biz.submit.vertical.a
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                    TradeBaseVerticalSubmitFragment.m22688s4(c45409vM22705l4, this, radioGroup, i11);
                }
            });
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
    }
}
