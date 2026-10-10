package com.kubi.spot.business.submit;

import ac.C0230b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.C5275i0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.business.holder.C12322c0;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
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
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24218b;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.spot.R$color;
import com.kubi.spot.R$drawable;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$mipmap;
import com.kubi.spot.R$string;
import com.kubi.spot.api.ISpotService;
import com.kubi.spot.business.ITradeChildBehavior;
import com.kubi.spot.business.ITradeParentBehavior;
import com.kubi.spot.business.holder.AdvancedLimitOrderHolder;
import com.kubi.spot.business.holder.BaseOrderHolder;
import com.kubi.spot.business.holder.LimitOrderHolder;
import com.kubi.spot.business.holder.MarketOrderHolder;
import com.kubi.spot.business.holder.OcoOrderHolder;
import com.kubi.spot.business.holder.tradingStop.TrailingStopOrderHolder;
import com.kubi.spot.business.saving.SavingBalanceChangeListener;
import com.kubi.spot.business.saving.SavingCacheManager;
import com.kubi.spot.business.saving.SavingConfig;
import com.kubi.spot.quote.market.trade.C25799u;
import com.kubi.spot.quote.orderBook.OrderBookAdapter;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment;
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
import d30.C36606a;
import d30.C36607b;
import d30.C36608c;
import gf.C37886j;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p758xe.InterfaceC46152a;
import p830zf.InterfaceC46793d0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import rs.C44172b;
import v30.C45412y;
import w00.C45681e;

/* JADX INFO: compiled from: TradeVerticalSubmitFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n*\u000258\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0001_B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0006\u00100\u001a\u00020.J\b\u00101\u001a\u00020.H\u0002J\b\u00102\u001a\u000203H\u0002J\b\u0010:\u001a\u00020.H\u0016J\b\u0010;\u001a\u00020.H\u0016J\b\u0010<\u001a\u00020.H\u0002J\b\u0010=\u001a\u00020.H\u0002J\b\u0010>\u001a\u00020.H\u0002J\u0010\u0010?\u001a\u00020.2\u0006\u0010@\u001a\u00020AH\u0017J\u0012\u0010B\u001a\u00020.2\b\u0010C\u001a\u0004\u0018\u00010DH\u0016J\b\u0010E\u001a\u00020.H\u0016J\b\u0010F\u001a\u00020.H\u0016J\u0010\u0010G\u001a\u00020.2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020\"H\u0016J\u0010\u0010J\u001a\u00020.2\u0006\u0010I\u001a\u00020\"H\u0016J\u0010\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020.2\u0006\u0010L\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020.H\u0016J\u0010\u0010Q\u001a\u00020.2\u0006\u0010R\u001a\u00020\"H\u0017J\b\u0010S\u001a\u00020.H\u0017J\u0018\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010R\u001a\u00020\"H\u0017J\u0010\u0010W\u001a\u00020\r2\u0006\u0010R\u001a\u00020\"H\u0002J\u0018\u0010X\u001a\u00020.2\u0006\u0010U\u001a\u00020V2\u0006\u0010Y\u001a\u00020\"H\u0016J\u0010\u0010Z\u001a\u00020.2\u0006\u0010Y\u001a\u00020\"H\u0002J\b\u0010[\u001a\u00020.H\u0002J\b\u0010\\\u001a\u00020.H\u0002J\b\u0010]\u001a\u00020.H\u0002J\u0010\u0010^\u001a\u00020\"2\u0006\u0010/\u001a\u00020&H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u0010\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0004\n\u0002\u00106R\u0010\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0004\n\u0002\u00109¨\u0006`"}, m90084d2 = {"Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/spot/business/ITradeChildBehavior;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mViewHolders", "Landroid/util/SparseArray;", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "mBuyAdapter", "Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "getMBuyAdapter", "()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "mBuyAdapter$delegate", "Lkotlin/Lazy;", "mSellAdapter", "getMSellAdapter", "mSellAdapter$delegate", "mParent", "Lcom/kubi/spot/business/ITradeParentBehavior;", "getMParent", "()Lcom/kubi/spot/business/ITradeParentBehavior;", "mParent$delegate", "mHolderImp", "Lcom/kubi/spot/business/holder/ITradeHolderDependDelegate;", "getMHolderImp", "()Lcom/kubi/spot/business/holder/ITradeHolderDependDelegate;", "mHolderImp$delegate", "lastPrecision", "", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "applyTradeTypeBackgroundColor", "initTabLyoutToggle", "getTradeTypeInfo", "Lcom/kubi/core/spot/trade/ITradeTypeInfo;", "savingModelChangeEvent", "com/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingModelChangeEvent$1;", "savingBalanceChangeEvent", "com/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingBalanceChangeEvent$1", "Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingBalanceChangeEvent$1;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "updateSavingWhenShow", "updateSavingWhenHide", "resetDirection", "reloadSymbols", "onlyResetUI", "", "updateExtValue", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "onAssetGet", "onClickPriceChange", "hideDialogInType", "type", "showDialogInType", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "refreshButtonStatus", "showOrderBookAmountType", "adapterPosition", "notifyOrderBookAdapter", "tradeModeChanged", "labelStr", "", "getOrderHolder", "onOrderBookPrecisionChanged", "precision", "updateSelectPrecisionTextSize", "addOrderTypeChangeListener", "reSetRcyHeight", "resetMax", "measureViewHeight", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeVerticalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeVerticalSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeVerticalSubmitFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,654:1\n147#2,16:655\n17#3,2:671\n1563#4:673\n1634#4,3:674\n37#5:677\n36#5,3:678\n*S KotlinDebug\n*F\n+ 1 TradeVerticalSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeVerticalSubmitFragment\n*L\n81#1:655,16\n501#1:671,2\n127#1:673\n127#1:674,3\n127#1:677\n127#1:678,3\n*E\n"})
public final class TradeVerticalSubmitFragment extends BaseFragment implements ITradeChildBehavior {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50360U = C45681e.m100799e(this, new Function1<TradeVerticalSubmitFragment, C45412y>() { // from class: com.kubi.spot.business.submit.TradeVerticalSubmitFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45412y invoke(@NotNull TradeVerticalSubmitFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45412y.m100361a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45412y, Unit>() { // from class: com.kubi.spot.business.submit.TradeVerticalSubmitFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45412y it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45412y c45412y) {
            invoke(c45412y);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final SparseArray<BaseOrderHolder> f50361V = new SparseArray<>(7);

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f50362W = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.p2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeVerticalSubmitFragment.m61588V3(this.f50430b);
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f50363X = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.q2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeVerticalSubmitFragment.m61591Y3(this.f50433b);
        }
    });

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50364Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.r2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeVerticalSubmitFragment.m61590X3(this.f50437b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50365Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.s2
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeVerticalSubmitFragment.m61589W3(this.f50440b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C25122b f50366a0 = new C25122b();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C25121a f50367b0 = new C25121a();

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f50359d0 = {Reflection.property1(new PropertyReference1Impl(TradeVerticalSubmitFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentTradeVerticalBinding;", 0))};

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public static final Companion f50358c0 = new Companion(null);

    /* JADX INFO: compiled from: TradeVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/spot/business/submit/TradeVerticalSubmitFragment$Companion;", "", "<init>", "()V", "ORDER_BOOK_ITEM_VIEW_HIGH", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.TradeVerticalSubmitFragment$a */
    /* JADX INFO: compiled from: TradeVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingBalanceChangeEvent$1", "Lcom/kubi/spot/business/saving/SavingBalanceChangeListener;", "onChange", "", "uid", "", FirebaseAnalytics.Param.CURRENCY, "balance", "Ljava/math/BigDecimal;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25121a implements SavingBalanceChangeListener {
        public C25121a() {
        }

        @Override // com.kubi.spot.business.saving.SavingBalanceChangeListener
        /* JADX INFO: renamed from: a */
        public void mo61320a(String str, String currency, BigDecimal balance) throws Exception {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(balance, "balance");
            C27024b.m66561d(TradeVerticalSubmitFragment.this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.h3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeVerticalSubmitFragment.C25121a.m61638c((BaseOrderHolder) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m61638c(BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.j();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.TradeVerticalSubmitFragment$b */
    /* JADX INFO: compiled from: TradeVerticalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/submit/TradeVerticalSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;", "onChange", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25122b implements SavingConfig.a {
        public C25122b() {
        }

        @Override // com.kubi.spot.business.saving.SavingConfig.a
        /* JADX INFO: renamed from: a */
        public void mo61347a(final boolean z11) throws Exception {
            C27024b.m66561d(TradeVerticalSubmitFragment.this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.i3
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeVerticalSubmitFragment.C25122b.m61640c(z11, (BaseOrderHolder) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c */
        public static final void m61640c(boolean z11, BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.r0(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public static final void m61613o4(BaseOrderHolder baseOrderHolder) {
        com.kubi.spot.business.holder.a0.a(baseOrderHolder, false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: I3 */
    private final void m61577I3() {
        OrderBookShowView orderBookShowView;
        C43852m.m96591c("B5trading", "orderShowShift", null, null, 12, null);
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 == null || (orderBookShowView = c45412yM61635L3.f102403g) == null) {
            return;
        }
        orderBookShowView.setTypeChangeListener(new Function1() { // from class: com.kubi.spot.business.submit.t2
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradeVerticalSubmitFragment.m61578J3(this.f50441b, (OrderBookType) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public static final Unit m61578J3(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, OrderBookType type) {
        FocusedRecyclerView focusedRecyclerView;
        FocusedRecyclerView focusedRecyclerView2;
        FocusedRecyclerView focusedRecyclerView3;
        FocusedRecyclerView focusedRecyclerView4;
        Intrinsics.checkNotNullParameter(type, "type");
        C45412y c45412yM61635L3 = tradeVerticalSubmitFragment.m61635L3();
        if (c45412yM61635L3 != null && (focusedRecyclerView4 = c45412yM61635L3.f102409m) != null) {
            focusedRecyclerView4.setVisibility(Intrinsics.areEqual(type, OrderBookType.C22937c.f43986b) ? 8 : 0);
        }
        C45412y c45412yM61635L4 = tradeVerticalSubmitFragment.m61635L3();
        if (c45412yM61635L4 != null && (focusedRecyclerView3 = c45412yM61635L4.f102410n) != null) {
            focusedRecyclerView3.setVisibility(Intrinsics.areEqual(type, OrderBookType.C22936b.f43985b) ? 8 : 0);
        }
        tradeVerticalSubmitFragment.m61611n4();
        C45412y c45412yM61635L5 = tradeVerticalSubmitFragment.m61635L3();
        if (c45412yM61635L5 != null && (focusedRecyclerView = c45412yM61635L5.f102409m) != null && focusedRecyclerView.getVisibility() == 8) {
            C45412y c45412yM61635L6 = tradeVerticalSubmitFragment.m61635L3();
            RecyclerView.LayoutManager layoutManager = (c45412yM61635L6 == null || (focusedRecyclerView2 = c45412yM61635L6.f102410n) == null) ? null : focusedRecyclerView2.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            ((LinearLayoutManager) layoutManager).scrollToPosition(tradeVerticalSubmitFragment.m61583P3().getItemCount() - 1);
        }
        tradeVerticalSubmitFragment.m61619r4();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    private final OrderBookAdapter m61579M3() {
        return (OrderBookAdapter) this.f50362W.getValue();
    }

    /* JADX INFO: renamed from: N3 */
    private final com.kubi.spot.business.holder.z m61581N3() {
        return (com.kubi.spot.business.holder.z) this.f50365Z.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    private final ITradeParentBehavior m61582O3() {
        return (ITradeParentBehavior) this.f50364Y.getValue();
    }

    /* JADX INFO: renamed from: P3 */
    private final OrderBookAdapter m61583P3() {
        return (OrderBookAdapter) this.f50363X.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final BaseOrderHolder m61584Q3(int i11) {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46793d0.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC46793d0) objM56186h).m103121a() : true)) {
            if (i11 == 0) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext, m61581N3(), false, false, (com.kubi.spot.business.holder.y) null, 28, (DefaultConstructorMarker) null);
            }
            if (i11 == 1) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext2, m61581N3(), false, false, (com.kubi.spot.business.holder.y) null, 28, (DefaultConstructorMarker) null);
            }
            if (i11 == 2) {
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext3, m61581N3(), true, false, (com.kubi.spot.business.holder.y) null, 24, (DefaultConstructorMarker) null);
            }
            if (i11 == 3) {
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext4, m61581N3(), true, false, (com.kubi.spot.business.holder.y) null, 24, (DefaultConstructorMarker) null);
            }
            if (i11 != 4) {
                Context contextRequireContext5 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                return new TrailingStopOrderHolder(contextRequireContext5, m61581N3(), false, (com.kubi.spot.business.holder.y) null, 12, (DefaultConstructorMarker) null);
            }
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
            return new TrailingStopOrderHolder(contextRequireContext6, m61581N3(), false, (com.kubi.spot.business.holder.y) null, 12, (DefaultConstructorMarker) null);
        }
        switch (i11) {
            case 0:
                Context contextRequireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext7, m61581N3(), false, false, (com.kubi.spot.business.holder.y) null, 28, (DefaultConstructorMarker) null);
            case 1:
                Context contextRequireContext8 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext8, m61581N3(), false, false, (com.kubi.spot.business.holder.y) null, 28, (DefaultConstructorMarker) null);
            case 2:
                Context contextRequireContext9 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "requireContext(...)");
                return new AdvancedLimitOrderHolder(contextRequireContext9, m61581N3(), false, false, (com.kubi.spot.business.holder.y) null, 28, (DefaultConstructorMarker) null);
            case 3:
                Context contextRequireContext10 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext10, m61581N3(), true, false, (com.kubi.spot.business.holder.y) null, 24, (DefaultConstructorMarker) null);
            case 4:
                Context contextRequireContext11 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext11, m61581N3(), true, false, (com.kubi.spot.business.holder.y) null, 24, (DefaultConstructorMarker) null);
            case 5:
                Context contextRequireContext12 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "requireContext(...)");
                return new OcoOrderHolder(contextRequireContext12, m61581N3(), false, (com.kubi.spot.business.holder.y) null, 12, (DefaultConstructorMarker) null);
            case 6:
                Context contextRequireContext13 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext13, "requireContext(...)");
                return new TrailingStopOrderHolder(contextRequireContext13, m61581N3(), false, (com.kubi.spot.business.holder.y) null, 12, (DefaultConstructorMarker) null);
            default:
                Context contextRequireContext14 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext14, "requireContext(...)");
                return new OcoOrderHolder(contextRequireContext14, m61581N3(), false, (com.kubi.spot.business.holder.y) null, 12, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: renamed from: T3 */
    public static final void m61586T3(final C45412y c45412y, TradeVerticalSubmitFragment tradeVerticalSubmitFragment, RadioGroup radioGroup, int i11) throws Exception {
        int i12 = R$id.tv_buy;
        C43852m.m96591c("B5trading", i11 == i12 ? "buyTab" : "sellTab", null, null, 12, null);
        if (i11 == i12) {
            RadioButton tvBuy = c45412y.f102413q;
            Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
            C0230b.m848l(tvBuy, false, 1, null);
            RadioButton tvSell = c45412y.f102417u;
            Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
            C0230b.m851o(tvSell, false);
        } else {
            RadioButton tvBuy2 = c45412y.f102413q;
            Intrinsics.checkNotNullExpressionValue(tvBuy2, "tvBuy");
            C0230b.m847k(tvBuy2, false);
            RadioButton tvSell2 = c45412y.f102417u;
            Intrinsics.checkNotNullExpressionValue(tvSell2, "tvSell");
            C0230b.m852p(tvSell2, false, 1, null);
        }
        C27024b.m66561d(tradeVerticalSubmitFragment.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.y2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61587U3(c45412y, (BaseOrderHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public static final void m61587U3(C45412y c45412y, BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.setIsBuyHolder(c45412y.f102411o.getCheckedRadioButtonId() == R$id.tv_buy);
    }

    /* JADX INFO: renamed from: V3 */
    public static final OrderBookAdapter m61588V3(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        return new OrderBookAdapter(1, 0, tradeVerticalSubmitFragment.m61582O3().mo60314z0(), 2, null);
    }

    /* JADX INFO: renamed from: Y3 */
    public static final OrderBookAdapter m61591Y3(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        return new OrderBookAdapter(0, 0, tradeVerticalSubmitFragment.m61582O3().mo60314z0(), 2, null);
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m61594b4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.g(new BigDecimal(String.valueOf(tradeVerticalSubmitFragment.m61582O3().getF50346Z().getPrice())));
        baseOrderHolder.b(tradeVerticalSubmitFragment.m61582O3().getF50346Z());
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m61598f4(final C45412y c45412y, final TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        if (!TextUtils.isEmpty(c45412y.f102419w.getText())) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.spot.business.submit.x2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61599g4(this.f50456b, c45412y);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m61601i4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        ISpotService iSpotService = ISpotService.f49646a.get();
        FragmentManager childFragmentManager = tradeVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotService.mo60006s(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m61603j4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, C45412y c45412y) {
        C36606a.f79410a.m81921d().mo60487b(tradeVerticalSubmitFragment, tradeVerticalSubmitFragment.m61582O3(), c45412y);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m61605k4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        FragmentActivity activity;
        FragmentActivity activity2;
        C43852m.m96591c("B5trading", "orderIntroButton", null, null, 12, null);
        if (!tradeVerticalSubmitFragment.isAdded() || tradeVerticalSubmitFragment.isDetached() || (((activity = tradeVerticalSubmitFragment.getActivity()) != null && activity.isFinishing()) || ((activity2 = tradeVerticalSubmitFragment.getActivity()) != null && activity2.isDestroyed()))) {
            return Unit.INSTANCE;
        }
        List<TradeType> listM81919b = C36606a.f79410a.m81919b();
        TradeTypeBizDialogFragment.Companion companion = TradeTypeBizDialogFragment.f51635x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81919b, 10));
        Iterator<T> it = listM81919b.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeType) it.next()).getValue());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        TradeType tradeType = (TradeType) CollectionsKt.getOrNull(listM81919b, tradeVerticalSubmitFragment.m61582O3().getF50342V());
        if (tradeType == null) {
            tradeType = TradeType.LIMIT;
        }
        TradeTypeBizDialogFragment tradeTypeBizDialogFragmentNewInstance$default = TradeTypeBizDialogFragment.Companion.newInstance$default(companion, strArr, tradeType, "B5trading", false, false, null, 56, null);
        FragmentManager childFragmentManager = tradeVerticalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        tradeTypeBizDialogFragmentNewInstance$default.show(childFragmentManager, "showTradeInfoDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t4 */
    private final void m61624t4() {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            savingConfig.m61345m(this.f50366a0);
            SavingCacheManager.f50304a.m61307u(this.f50367b0);
        }
    }

    /* JADX INFO: renamed from: u4 */
    private final void m61626u4() throws Exception {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.j2
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeVerticalSubmitFragment.m61628v4((BaseOrderHolder) obj);
                }
            });
            savingConfig.m61344l(this.f50366a0);
            SavingCacheManager.f50304a.m61305r(this.f50367b0);
        }
    }

    /* JADX INFO: renamed from: v4 */
    public static final void m61628v4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.r0(SavingConfig.f50323a.m61333a());
    }

    /* JADX INFO: renamed from: w4 */
    private final void m61630w4(int i11) {
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        if (i11 <= 8) {
            C45412y c45412yM61635L3 = m61635L3();
            if (c45412yM61635L3 == null || (shapeTextView3 = c45412yM61635L3.f102399c) == null) {
                return;
            }
            shapeTextView3.setTextSize(12.0f);
            return;
        }
        if (i11 <= 10) {
            C45412y c45412yM61635L4 = m61635L3();
            if (c45412yM61635L4 == null || (shapeTextView2 = c45412yM61635L4.f102399c) == null) {
                return;
            }
            shapeTextView2.setTextSize(11.0f);
            return;
        }
        C45412y c45412yM61635L5 = m61635L3();
        if (c45412yM61635L5 == null || (shapeTextView = c45412yM61635L5.f102399c) == null) {
            return;
        }
        shapeTextView.setTextSize(10.0f);
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: F0 */
    public void mo60290F0(@NotNull OrderBookEntity data) {
        C45412y c45412yM61635L3;
        Intrinsics.checkNotNullParameter(data, "data");
        boolean zIsEmpty = m61583P3().getData().isEmpty();
        if (getView() == null || (c45412yM61635L3 = m61635L3()) == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = c45412yM61635L3.f102410n.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        m61583P3().m63014p(C27024b.m66559b(data.getAsks()));
        linearLayoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, 0);
        m61579M3().m63014p(C27024b.m66559b(data.getBids()));
        m61619r4();
        if ((c45412yM61635L3.f102409m.getVisibility() == 0 && c45412yM61635L3.f102410n.getVisibility() == 0) || zIsEmpty) {
            RecyclerView.LayoutManager layoutManager2 = c45412yM61635L3.f102410n.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            C27014a1.m66503c((LinearLayoutManager) layoutManager2, m61583P3().getData().size() - 1);
        }
        c45412yM61635L3.f102398b.m54454g(data.getBids(), data.getAsks());
    }

    /* JADX INFO: renamed from: L3 */
    public final C45412y m61635L3() {
        return (C45412y) this.f50360U.getValue(this, f50359d0[0]);
    }

    /* JADX INFO: renamed from: R3 */
    public final InterfaceC46152a m61636R3() {
        InterfaceC46152a interfaceC46152a = C36607b.f79411a.m81927b().get(C36606a.f79410a.m81924g());
        return interfaceC46152a == null ? new C36608c() : interfaceC46152a;
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: S */
    public void mo60292S() throws Exception {
        C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.l2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61593a4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: U */
    public void mo60293U() throws Exception {
        C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.u2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61595c4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: a */
    public void mo60294a(@NotNull BigDecimal value) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Intrinsics.checkNotNullParameter(value, "value");
        C45412y c45412yM61635L3 = m61635L3();
        if (C27039d.m66650j((c45412yM61635L3 == null || (frameLayout2 = c45412yM61635L3.f102401e) == null) ? null : Integer.valueOf(frameLayout2.getChildCount())) <= 0) {
            return;
        }
        C45412y c45412yM61635L4 = m61635L3();
        View viewM66698m = (c45412yM61635L4 == null || (frameLayout = c45412yM61635L4.f102401e) == null) ? null : C27046k.m66698m(frameLayout, 0);
        BaseOrderHolder baseOrderHolder = viewM66698m instanceof BaseOrderHolder ? (BaseOrderHolder) viewM66698m : null;
        if (baseOrderHolder != null) {
            baseOrderHolder.h(value);
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: b */
    public void mo60295b(int i11) {
        AlignTopTextView alignTopTextView;
        C45412y c45412yM61635L3;
        ShapeTextView shapeTextView;
        if (i11 != 0) {
            if (i11 != 1 || (c45412yM61635L3 = m61635L3()) == null || (shapeTextView = c45412yM61635L3.f102399c) == null) {
                return;
            }
            C27046k.m66694i(shapeTextView, R$drawable.ic2_triangle_top_12, 0, 0, 4, null);
            return;
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 == null || (alignTopTextView = c45412yM61635L4.f102412p) == null) {
            return;
        }
        C27046k.m66694i(alignTopTextView, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: c */
    public void mo60297c(int i11) {
        AlignTopTextView alignTopTextView;
        C45412y c45412yM61635L3;
        ShapeTextView shapeTextView;
        if (i11 != 0) {
            if (i11 != 1 || (c45412yM61635L3 = m61635L3()) == null || (shapeTextView = c45412yM61635L3.f102399c) == null) {
                return;
            }
            C27046k.m66694i(shapeTextView, R$drawable.ic2_triangle_bottom_12, 0, 0, 4, null);
            return;
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 == null || (alignTopTextView = c45412yM61635L4.f102412p) == null) {
            return;
        }
        C27046k.m66694i(alignTopTextView, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: d */
    public void mo60299d(@NotNull String labelStr, int i11) {
        ShapeTextView shapeTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (shapeTextView = c45412yM61635L3.f102399c) != null) {
            shapeTextView.setText(labelStr);
        }
        m61630w4(i11);
        m61579M3().m63015q(i11);
        m61583P3().m63015q(i11);
        m61619r4();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: d0 */
    public void mo60300d0(@NotNull String labelStr, int i11) {
        FrameLayout frameLayout;
        RadioGroup radioGroup;
        FrameLayout frameLayout2;
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (baseTextView = c45412yM61635L3.f102415s) != null) {
            baseTextView.setText(labelStr);
        }
        BaseOrderHolder baseOrderHolderM61584Q3 = this.f50361V.get(i11);
        if (baseOrderHolderM61584Q3 == null) {
            baseOrderHolderM61584Q3 = m61584Q3(i11);
            this.f50361V.put(i11, baseOrderHolderM61584Q3);
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 != null && (frameLayout2 = c45412yM61635L4.f102401e) != null) {
            frameLayout2.removeAllViews();
        }
        C45412y c45412yM61635L5 = m61635L3();
        boolean z11 = false;
        if (c45412yM61635L5 != null && (radioGroup = c45412yM61635L5.f102411o) != null && radioGroup.getCheckedRadioButtonId() == R$id.tv_buy) {
            z11 = true;
        }
        baseOrderHolderM61584Q3.setIsBuyHolder(z11);
        baseOrderHolderM61584Q3.j();
        C45412y c45412yM61635L6 = m61635L3();
        if (c45412yM61635L6 != null && (frameLayout = c45412yM61635L6.f102401e) != null) {
            frameLayout.addView(baseOrderHolderM61584Q3);
        }
        if (baseOrderHolderM61584Q3.getTag() != null) {
            m61611n4();
        } else {
            baseOrderHolderM61584Q3.post(new Runnable() { // from class: com.kubi.spot.business.submit.v2
                @Override // java.lang.Runnable
                public final void run() {
                    TradeVerticalSubmitFragment.m61622s4(this.f50446b);
                }
            });
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: f0 */
    public void mo60301f0() throws Exception {
        C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.m2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61613o4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: h0 */
    public void mo60302h0(@NotNull OrderBookCenterEntity data) throws Exception {
        BaseTextView baseTextView;
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        TextView textViewM97383c;
        BaseTextView baseTextView4;
        C45412y c45412yM61635L3;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ShowHideTextView showHideTextView3;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        Intrinsics.checkNotNullParameter(data, "data");
        if (getView() == null) {
            return;
        }
        if (data.getPrice() == 0.0d) {
            C45412y c45412yM61635L4 = m61635L3();
            if (c45412yM61635L4 != null && (baseTextView8 = c45412yM61635L4.f102419w) != null) {
                baseTextView8.setText("--");
            }
            C45412y c45412yM61635L5 = m61635L3();
            if (c45412yM61635L5 != null && (baseTextView7 = c45412yM61635L5.f102419w) != null) {
                baseTextView7.setTextColor(getColorRes(R$color.c_text40));
            }
            C45412y c45412yM61635L6 = m61635L3();
            if (c45412yM61635L6 == null || (showHideTextView3 = c45412yM61635L6.f102418v) == null) {
                return;
            }
            showHideTextView3.setText("--");
            return;
        }
        Context contextM66513b = C27017c.f54310a.m66513b();
        C45412y c45412yM61635L7 = m61635L3();
        Object tag = (c45412yM61635L7 == null || (baseTextView6 = c45412yM61635L7.f102419w) == null) ? null : baseTextView6.getTag();
        int iM58391a = C24218b.m58391a(contextM66513b, C27039d.m66646f(tag instanceof Double ? (Double) tag : null), data.getPrice());
        if (iM58391a != -1 && (c45412yM61635L3 = m61635L3()) != null && (baseTextView5 = c45412yM61635L3.f102419w) != null) {
            baseTextView5.setTextColor(iM58391a);
        }
        C45412y c45412yM61635L8 = m61635L3();
        if (c45412yM61635L8 != null && (baseTextView4 = c45412yM61635L8.f102419w) != null) {
            baseTextView4.setTag(Double.valueOf(data.getPrice()));
        }
        C45412y c45412yM61635L9 = m61635L3();
        if (c45412yM61635L9 != null && (baseTextView3 = c45412yM61635L9.f102419w) != null && (textViewM97383c = C44172b.m97383c(baseTextView3, null, false, 3, null)) != null) {
            textViewM97383c.setText(C37886j.m85579c(new BigDecimal(String.valueOf(data.getPrice())), m61580N().getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        if (m61620s0() < 11) {
            C45412y c45412yM61635L10 = m61635L3();
            if (c45412yM61635L10 != null && (baseTextView2 = c45412yM61635L10.f102419w) != null) {
                baseTextView2.setTextSize(16.0f);
            }
        } else {
            C45412y c45412yM61635L11 = m61635L3();
            if (c45412yM61635L11 != null && (baseTextView = c45412yM61635L11.f102419w) != null) {
                baseTextView.setTextSize(14.0f);
            }
        }
        C45412y c45412yM61635L12 = m61635L3();
        if (c45412yM61635L12 != null && (showHideTextView2 = c45412yM61635L12.f102418v) != null) {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(data.getPrice()));
            String quoteCurrency = m61580N().getQuoteCurrency();
            Intrinsics.checkNotNullExpressionValue(quoteCurrency, "getQuoteCurrency(...)");
            showHideTextView2.setText(C12322c0.m23256f(bigDecimal, quoteCurrency, true));
        }
        C45412y c45412yM61635L13 = m61635L3();
        if (c45412yM61635L13 != null && (showHideTextView = c45412yM61635L13.f102418v) != null) {
            C24256n1.m58513c(showHideTextView);
        }
        C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.o2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61594b4(this.f50428b, (BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_trade_vertical, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m61585S3();
        final C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null) {
            ConstraintLayout flPriceType = c45412yM61635L3.f102400d;
            Intrinsics.checkNotNullExpressionValue(flPriceType, "flPriceType");
            C27046k.m66711z(flPriceType, 0L, new Function0() { // from class: com.kubi.spot.business.submit.z2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61603j4(this.f50464b, c45412yM61635L3);
                }
            }, 1, null);
            AppCompatImageView ivPriceTypeInfo = c45412yM61635L3.f102404h;
            Intrinsics.checkNotNullExpressionValue(ivPriceTypeInfo, "ivPriceTypeInfo");
            C27046k.m66711z(ivPriceTypeInfo, 0L, new Function0() { // from class: com.kubi.spot.business.submit.a3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61605k4(this.f50374b);
                }
            }, 1, null);
            ShapeTextView cbOrderbookSelectPrecision = c45412yM61635L3.f102399c;
            Intrinsics.checkNotNullExpressionValue(cbOrderbookSelectPrecision, "cbOrderbookSelectPrecision");
            C27046k.m66711z(cbOrderbookSelectPrecision, 0L, new Function0() { // from class: com.kubi.spot.business.submit.b3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61607l4(this.f50379b);
                }
            }, 1, null);
            AlignTopTextView tvBaseUnitOut = c45412yM61635L3.f102412p;
            Intrinsics.checkNotNullExpressionValue(tvBaseUnitOut, "tvBaseUnitOut");
            C27046k.m66711z(tvBaseUnitOut, 0L, new Function0() { // from class: com.kubi.spot.business.submit.c3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61609m4(this.f50383b);
                }
            }, 1, null);
            m61577I3();
            m61583P3().bindToRecyclerView(c45412yM61635L3.f102410n);
            m61579M3().bindToRecyclerView(c45412yM61635L3.f102409m);
            OrderBookAdapter orderBookAdapterM61583P3 = m61583P3();
            int i11 = R$layout.kucoin_view_orderbook_loading;
            orderBookAdapterM61583P3.setEmptyView(i11, c45412yM61635L3.f102410n);
            m61579M3().setEmptyView(i11, c45412yM61635L3.f102409m);
            m61583P3().m63017t(5);
            m61579M3().m63017t(5);
            c45412yM61635L3.f102410n.setHasFixedSize(true);
            c45412yM61635L3.f102409m.setHasFixedSize(true);
            FocusedRecyclerView rcvSell = c45412yM61635L3.f102410n;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            C22912t.m54410h(rcvSell, false, 1, null);
            FocusedRecyclerView rcvBuy = c45412yM61635L3.f102409m;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            C22912t.m54410h(rcvBuy, false, 1, null);
            c45412yM61635L3.f102410n.setNestedScrollingEnabled(false);
            c45412yM61635L3.f102409m.setNestedScrollingEnabled(false);
            m61579M3().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.spot.business.submit.d3
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeVerticalSubmitFragment.m61596d4(this.f50388a, i12, strArr);
                }
            });
            m61583P3().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.spot.business.submit.e3
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeVerticalSubmitFragment.m61597e4(this.f50395a, i12, strArr);
                }
            });
            ConstraintLayout llCenter = c45412yM61635L3.f102407k;
            Intrinsics.checkNotNullExpressionValue(llCenter, "llCenter");
            C27046k.m66711z(llCenter, 0L, new Function0() { // from class: com.kubi.spot.business.submit.f3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61598f4(c45412yM61635L3, this);
                }
            }, 1, null);
            DashTextView tvEtfValue = c45412yM61635L3.f102414r;
            Intrinsics.checkNotNullExpressionValue(tvEtfValue, "tvEtfValue");
            C27046k.m66711z(tvEtfValue, 0L, new Function0() { // from class: com.kubi.spot.business.submit.g3
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61600h4(this.f50402b);
                }
            }, 1, null);
            BuySellRatioView buySellRatioView = c45412yM61635L3.f102398b;
            Intrinsics.checkNotNullExpressionValue(buySellRatioView, "buySellRatioView");
            C27046k.m66711z(buySellRatioView, 0L, new Function0() { // from class: com.kubi.spot.business.submit.k2
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeVerticalSubmitFragment.m61601i4(this.f50415b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: N */
    private final SymbolInfoEntity m61580N() {
        return m61582O3().mo60189N();
    }

    /* JADX INFO: renamed from: S3 */
    private final void m61585S3() {
        final C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null) {
            RadioButton tvBuy = c45412yM61635L3.f102413q;
            Intrinsics.checkNotNullExpressionValue(tvBuy, "tvBuy");
            C0230b.m848l(tvBuy, false, 1, null);
            RadioButton tvSell = c45412yM61635L3.f102417u;
            Intrinsics.checkNotNullExpressionValue(tvSell, "tvSell");
            C0230b.m851o(tvSell, false);
            c45412yM61635L3.f102411o.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.kubi.spot.business.submit.w2
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i11) throws Exception {
                    TradeVerticalSubmitFragment.m61586T3(c45412yM61635L3, this, radioGroup, i11);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W3 */
    public static final com.kubi.spot.business.holder.z m61589W3(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        com.kubi.spot.business.holder.z parentFragment = tradeVerticalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.business.holder.ITradeHolderDependDelegate");
        return parentFragment;
    }

    /* JADX INFO: renamed from: X3 */
    public static final ITradeParentBehavior m61590X3(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeVerticalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.business.ITradeParentBehavior");
        return (ITradeParentBehavior) parentFragment;
    }

    /* JADX INFO: renamed from: Z3 */
    private final int m61592Z3(View view) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final void m61593a4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final void m61595c4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.c();
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m61596d4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, int i11, String[] strArr) {
        tradeVerticalSubmitFragment.m61582O3().mo60306T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "orderPriceNum", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m61597e4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, int i11, String[] strArr) {
        tradeVerticalSubmitFragment.m61582O3().mo60306T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "orderPriceNum", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m61599g4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment, C45412y c45412y) {
        tradeVerticalSubmitFragment.m61582O3().mo60306T(C41014a.m89922G(C42180b.m92637b(c45412y.f102419w.getText().toString(), null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "bidAskPriceClick", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final Unit m61600h4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        FragmentActivity activity;
        FragmentActivity activity2;
        if (tradeVerticalSubmitFragment.isAdded() && !tradeVerticalSubmitFragment.isDetached() && (((activity = tradeVerticalSubmitFragment.getActivity()) == null || !activity.isFinishing()) && ((activity2 = tradeVerticalSubmitFragment.getActivity()) == null || !activity2.isDestroyed()))) {
            tradeVerticalSubmitFragment.m61582O3().mo60287n0();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final Unit m61607l4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        FragmentActivity activity;
        FragmentActivity activity2;
        if (tradeVerticalSubmitFragment.isAdded() && !tradeVerticalSubmitFragment.isDetached() && (((activity = tradeVerticalSubmitFragment.getActivity()) == null || !activity.isFinishing()) && ((activity2 = tradeVerticalSubmitFragment.getActivity()) == null || !activity2.isDestroyed()))) {
            tradeVerticalSubmitFragment.m61582O3().mo60308Y();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m4 */
    public static final Unit m61609m4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        FragmentActivity activity;
        FragmentActivity activity2;
        if (tradeVerticalSubmitFragment.isAdded() && !tradeVerticalSubmitFragment.isDetached() && (((activity = tradeVerticalSubmitFragment.getActivity()) == null || !activity.isFinishing()) && ((activity2 = tradeVerticalSubmitFragment.getActivity()) == null || !activity2.isDestroyed()))) {
            tradeVerticalSubmitFragment.m61582O3().mo60310l0();
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    private final void m61611n4() {
        boolean z11;
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null) {
            if (c45412yM61635L3.f102410n.getVisibility() == 0 && c45412yM61635L3.f102409m.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            View childAt = c45412yM61635L3.f102401e.getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            int iM61592Z3 = m61592Z3(childAt);
            c45412yM61635L3.f102401e.getChildAt(0).setTag(Integer.valueOf(iM61592Z3));
            int iM6236a = iM61592Z3 + C5275i0.m6236a(70.0f);
            int iM6236a2 = C5275i0.m6236a(377.0f);
            int i11 = 5;
            while (iM6236a - iM6236a2 > 0.0f) {
                iM6236a2 += C5275i0.m6236a(26.0f) * 2;
                i11++;
            }
            m61583P3().m63017t(i11);
            m61579M3().m63017t(i11);
            c45412yM61635L3.f102409m.setSelfScroll(!z11);
            c45412yM61635L3.f102410n.setSelfScroll(!z11);
            m61583P3().m63016s(z11);
            m61579M3().m63016s(z11);
            float f11 = i11 * 26.0f;
            if (!z11) {
                f11 = i11 * 2 * 26.0f;
            }
            FocusedRecyclerView rcvSell = c45412yM61635L3.f102410n;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            ViewExtKt.m66578i(rcvSell, C5275i0.m6236a(f11));
            FocusedRecyclerView rcvBuy = c45412yM61635L3.f102409m;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            ViewExtKt.m66578i(rcvBuy, C5275i0.m6236a(f11));
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m61615p4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.f();
    }

    /* JADX INFO: renamed from: q4 */
    private final void m61617q4() {
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        ConstraintLayout constraintLayout;
        RadioGroup radioGroup;
        ConstraintLayout constraintLayout2;
        RadioGroup radioGroup2;
        C45412y c45412yM61635L3 = m61635L3();
        ConstraintLayout.LayoutParams layoutParams4 = null;
        if (c45412yM61635L3 != null && (radioGroup2 = c45412yM61635L3.f102411o) != null) {
            layoutParams = radioGroup2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        } else {
            layoutParams2 = null;
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 != null && (constraintLayout2 = c45412yM61635L4.f102407k) != null) {
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
        C45412y c45412yM61635L5 = m61635L3();
        if (c45412yM61635L5 != null && (radioGroup = c45412yM61635L5.f102411o) != null) {
            radioGroup.setLayoutParams(layoutParams2);
        }
        C45412y c45412yM61635L6 = m61635L3();
        if (c45412yM61635L6 != null && (constraintLayout = c45412yM61635L6.f102407k) != null) {
            constraintLayout.setLayoutParams(layoutParams4);
        }
    }

    /* JADX INFO: renamed from: r4 */
    private final void m61619r4() {
        double dM63011m;
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null) {
            if (c45412yM61635L3.f102409m.getVisibility() == 0 && c45412yM61635L3.f102410n.getVisibility() == 0) {
                dM63011m = Math.max(m61579M3().getF51235q(), m61583P3().getF51235q());
            } else if (c45412yM61635L3.f102410n.getVisibility() == 0) {
                dM63011m = m61583P3().getF51235q();
            } else {
                dM63011m = m61579M3().getF51235q();
            }
            m61579M3().m63013o(dM63011m);
            m61583P3().m63013o(dM63011m);
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final int m61620s0() {
        return m61582O3().getF50341U();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m61622s4(TradeVerticalSubmitFragment tradeVerticalSubmitFragment) {
        if (tradeVerticalSubmitFragment.getView() != null && tradeVerticalSubmitFragment.getHost() != null && tradeVerticalSubmitFragment.isAdded() && !tradeVerticalSubmitFragment.isDetached()) {
            tradeVerticalSubmitFragment.m61611n4();
        }
    }

    /* JADX INFO: renamed from: K3 */
    public final void m61634K3() {
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (constraintLayout = c45412yM61635L3.f102400d) != null) {
            constraintLayout.setBackgroundResource(C36606a.f79410a.m81922e());
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 != null && (baseTextView = c45412yM61635L4.f102415s) != null) {
            baseTextView.setTextColor(getColorRes(C36606a.f79410a.m81925h()));
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: R0 */
    public void mo60291R0(int i11) {
        AlignTopTextView alignTopTextView;
        int i12;
        m61579M3().m63018u(i11);
        m61583P3().m63018u(i11);
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (alignTopTextView = c45412yM61635L3.f102412p) != null) {
            StringBuilder sb2 = new StringBuilder();
            C27017c c27017c = C27017c.f54310a;
            if (m61579M3().getF51231m() == 0) {
                i12 = R$string.accumulation;
            } else {
                i12 = R$string.amount;
            }
            sb2.append(c27017c.m66516f(i12, new Object[0]));
            sb2.append("\n(");
            sb2.append(m61580N().getBaseCurrencyName());
            sb2.append(')');
            alignTopTextView.setText(sb2.toString());
        }
        mo60298c0();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: b0 */
    public void mo60296b0(boolean z11) throws Exception {
        int i11;
        String str;
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        String[] stringArray = getResources().getStringArray(m61636R3().mo60492a());
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        int iM66650j = C27039d.m66650j(Integer.valueOf(m61582O3().getF50342V()));
        if (iM66650j >= stringArray.length) {
            iM66650j = 0;
        }
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (constraintLayout = c45412yM61635L3.f102400d) != null) {
            constraintLayout.setBackgroundResource(C36606a.f79410a.m81922e());
        }
        C45412y c45412yM61635L4 = m61635L3();
        if (c45412yM61635L4 != null && (baseTextView = c45412yM61635L4.f102415s) != null) {
            baseTextView.setTextColor(getColorRes(C36606a.f79410a.m81925h()));
        }
        String str2 = stringArray[iM66650j];
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        mo60300d0(str2, iM66650j);
        C45412y c45412yM61635L5 = m61635L3();
        if (c45412yM61635L5 != null) {
            c45412yM61635L5.f102416t.setText(getString(R$string.price) + "\n(" + m61580N().getQuoteCurrencyName() + ')');
            AlignTopTextView alignTopTextView = c45412yM61635L5.f102412p;
            StringBuilder sb2 = new StringBuilder();
            C27017c c27017c = C27017c.f54310a;
            if (m61579M3().getF51231m() == 0) {
                i11 = R$string.accumulation;
            } else {
                i11 = R$string.amount;
            }
            sb2.append(c27017c.m66516f(i11, new Object[0]));
            sb2.append("\n(");
            sb2.append(m61580N().getBaseCurrencyName());
            sb2.append(')');
            alignTopTextView.setText(sb2.toString());
            m61579M3().m63012n(m61580N().getBaseIncrementPrecision());
            m61583P3().m63012n(m61580N().getBaseIncrementPrecision());
            m61579M3().m63015q(m61620s0());
            m61583P3().m63015q(m61620s0());
            c45412yM61635L5.f102419w.setText("--");
            c45412yM61635L5.f102418v.setText("--");
            c45412yM61635L5.f102414r.setText("--");
            ShapeTextView shapeTextView = c45412yM61635L5.f102399c;
            ArrayList<String> arrayListM63003a = C25799u.m63003a(m61580N().getPriceIncrementPrecision());
            int priceIncrementPrecision = m61580N().getPriceIncrementPrecision() - m61620s0();
            if (arrayListM63003a.size() > priceIncrementPrecision && priceIncrementPrecision >= 0) {
                str = arrayListM63003a.get(priceIncrementPrecision);
            } else {
                str = arrayListM63003a.get(0);
            }
            shapeTextView.setText(str);
            m61630w4(m61620s0());
            if (m61582O3().mo60283P1()) {
                DashTextView tvEtfValue = c45412yM61635L5.f102414r;
                Intrinsics.checkNotNullExpressionValue(tvEtfValue, "tvEtfValue");
                ViewExtKt.m66594y(tvEtfValue);
                AppCompatImageView ivEtfIcon = c45412yM61635L5.f102402f;
                Intrinsics.checkNotNullExpressionValue(ivEtfIcon, "ivEtfIcon");
                ViewExtKt.m66594y(ivEtfIcon);
                ShowHideTextView tvTradeCurrency = c45412yM61635L5.f102418v;
                Intrinsics.checkNotNullExpressionValue(tvTradeCurrency, "tvTradeCurrency");
                C27046k.m66703r(tvTradeCurrency);
            } else {
                DashTextView tvEtfValue2 = c45412yM61635L5.f102414r;
                Intrinsics.checkNotNullExpressionValue(tvEtfValue2, "tvEtfValue");
                C27046k.m66703r(tvEtfValue2);
                AppCompatImageView ivEtfIcon2 = c45412yM61635L5.f102402f;
                Intrinsics.checkNotNullExpressionValue(ivEtfIcon2, "ivEtfIcon");
                C27046k.m66703r(ivEtfIcon2);
                ShowHideTextView tvTradeCurrency2 = c45412yM61635L5.f102418v;
                Intrinsics.checkNotNullExpressionValue(tvTradeCurrency2, "tvTradeCurrency");
                ViewExtKt.m66594y(tvTradeCurrency2);
            }
        }
        if (z11) {
            return;
        }
        mo60302h0(m61582O3().getF50346Z());
        m61579M3().m63007h();
        m61583P3().m63007h();
        C27024b.m66561d(this.f50361V, new Consumer() { // from class: com.kubi.spot.business.submit.n2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeVerticalSubmitFragment.m61615p4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: c0 */
    public void mo60298c0() {
        m61579M3().notifyDataSetChanged();
        m61583P3().notifyDataSetChanged();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: m0 */
    public void mo60303m0(@Nullable BigDecimal bigDecimal) {
        DashTextView dashTextView;
        String strM85579c;
        C45412y c45412yM61635L3 = m61635L3();
        if (c45412yM61635L3 != null && (dashTextView = c45412yM61635L3.f102414r) != null) {
            if (bigDecimal == null) {
                strM85579c = null;
            } else {
                strM85579c = C37886j.m85579c(bigDecimal, m61580N().getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            dashTextView.setText(C27041f.m66669i(strM85579c, "--"));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m61624t4();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        RadioButton radioButton;
        RadioButton radioButton2;
        if (m61582O3().getF50348b0()) {
            C45412y c45412yM61635L3 = m61635L3();
            if (c45412yM61635L3 != null && (radioButton2 = c45412yM61635L3.f102413q) != null) {
                radioButton2.setChecked(true);
            }
        } else {
            C45412y c45412yM61635L4 = m61635L3();
            if (c45412yM61635L4 != null && (radioButton = c45412yM61635L4.f102417u) != null) {
                radioButton.setChecked(true);
            }
        }
        mo60301f0();
        mo60296b0(true);
        m61617q4();
        m61626u4();
    }
}
