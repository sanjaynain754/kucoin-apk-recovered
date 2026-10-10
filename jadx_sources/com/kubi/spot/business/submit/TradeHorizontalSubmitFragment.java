package com.kubi.spot.business.submit;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
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
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.util.C24218b;
import com.kubi.sdk.util.C24256n1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
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
import com.kubi.spot.service.SpotDepend;
import com.kubi.tradebase.tradetype.TradeType;
import com.kubi.tradebase.tradetype.TradeTypeBizDialogFragment;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import d30.C36606a;
import gf.C37886j;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.Consumer;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p569qq.C43852m;
import p830zf.InterfaceC46793d0;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.reflect.KProperty;
import v30.C45411x;
import w00.C45681e;

/* JADX INFO: compiled from: TradeHorizontalSubmitFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002\u001e!\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u001a\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0006\u0010.\u001a\u00020,J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000200H\u0002J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020,H\u0016J\b\u00105\u001a\u00020,H\u0016J\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020,H\u0002J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u000200H\u0016J\u0010\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020,2\u0006\u0010>\u001a\u000200H\u0016J\u0018\u0010C\u001a\u00020,2\u0006\u0010<\u001a\u00020=2\u0006\u0010D\u001a\u000200H\u0016J\u0010\u0010E\u001a\u00020,2\u0006\u0010@\u001a\u00020FH\u0016J\u0012\u0010G\u001a\u00020,2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020,H\u0016J\b\u0010K\u001a\u00020,H\u0017J\b\u0010L\u001a\u00020,H\u0016J\u0010\u0010M\u001a\u00020,2\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010N\u001a\u00020,H\u0016J\b\u0010O\u001a\u00020,H\u0002J\u0010\u0010P\u001a\u00020,2\u0006\u0010Q\u001a\u000200H\u0016J\u0010\u0010R\u001a\u00020,2\u0006\u0010Q\u001a\u000200H\u0016J\u0010\u0010S\u001a\u00020,2\u0006\u0010D\u001a\u000200H\u0002J\b\u0010T\u001a\u00020,H\u0002J&\u0010Z\u001a\u00020,2\u0006\u0010[\u001a\u0002002\u0006\u0010)\u001a\u00020\\2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\u0010\u0010^\u001a\u00020\u00132\u0006\u0010[\u001a\u000200H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\u0018R\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0010\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u001b\u0010U\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010\u0010\u001a\u0004\bW\u0010X¨\u0006_"}, m90084d2 = {"Lcom/kubi/spot/business/submit/TradeHorizontalSubmitFragment;", "Lcom/kubi/sdk/BaseFragment;", "Lcom/kubi/spot/business/ITradeChildBehavior;", "<init>", "()V", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "mParent", "Lcom/kubi/spot/business/ITradeParentBehavior;", "getMParent", "()Lcom/kubi/spot/business/ITradeParentBehavior;", "mParent$delegate", "Lkotlin/Lazy;", "mViewHoldersBuy", "Landroid/util/SparseArray;", "Lcom/kubi/spot/business/holder/BaseOrderHolder;", "mViewHoldersSell", "mBuyAdapter", "Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "getMBuyAdapter", "()Lcom/kubi/spot/quote/orderBook/OrderBookAdapter;", "mBuyAdapter$delegate", "mSellAdapter", "getMSellAdapter", "mSellAdapter$delegate", "savingModelChangeEvent", "com/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingModelChangeEvent$1;", "savingBalanceChangeEvent", "com/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingBalanceChangeEvent$1", "Lcom/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingBalanceChangeEvent$1;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "setTradeTypeTabBar", "lastPrecision", "", "lastTradeMode", "currentSymbolInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, RNH5InterActionHelperKt.EVENT_NAME_ON_HIDE, "updateSavingWhenShow", "updateSavingWhenHide", "reloadSymbols", "onlyResetUI", "", "tradeModeChanged", "labelStr", "", "adapterPosition", "onBboDataGet", "data", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "showOrderBookAmountType", "onOrderBookPrecisionChanged", "precision", "onOrderBookDataGet", "Lcom/kubi/data/entity/OrderBookEntity;", "updateExtValue", "value", "Ljava/math/BigDecimal;", "onCurrencyChanged", "notifyOrderBookAdapter", "onAssetGet", "onClickPriceChange", "refreshButtonStatus", "updateActionBtn", "hideDialogInType", "type", "showDialogInType", "updateSelectPrecisionTextSize", "mergeMax", "mHolderImp", "Lcom/kubi/spot/business/holder/ITradeHolderDependDelegate;", "getMHolderImp", "()Lcom/kubi/spot/business/holder/ITradeHolderDependDelegate;", "mHolderImp$delegate", "addContainerView", "tradeType", "Landroid/widget/FrameLayout;", "mViewHolders", "getOrderHolder", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeHorizontalSubmitFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeHorizontalSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeHorizontalSubmitFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,504:1\n147#2,16:505\n17#3,2:521\n1563#4:523\n1634#4,3:524\n37#5:527\n36#5,3:528\n*S KotlinDebug\n*F\n+ 1 TradeHorizontalSubmitFragment.kt\ncom/kubi/spot/business/submit/TradeHorizontalSubmitFragment\n*L\n61#1:505,16\n482#1:521,2\n150#1:523\n150#1:524,3\n150#1:527\n150#1:528,3\n*E\n"})
public final class TradeHorizontalSubmitFragment extends BaseFragment implements ITradeChildBehavior {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ KProperty<Object>[] f50328d0 = {Reflection.property1(new PropertyReference1Impl(TradeHorizontalSubmitFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentTradeHorizontalBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f50329U = C45681e.m100799e(this, new Function1<TradeHorizontalSubmitFragment, C45411x>() { // from class: com.kubi.spot.business.submit.TradeHorizontalSubmitFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45411x invoke(@NotNull TradeHorizontalSubmitFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45411x.m100359a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45411x, Unit>() { // from class: com.kubi.spot.business.submit.TradeHorizontalSubmitFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45411x it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45411x c45411x) {
            invoke(c45411x);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f50330V = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.b0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeHorizontalSubmitFragment.m61373W3(this.f50376b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final SparseArray<BaseOrderHolder> f50331W = new SparseArray<>();

    /* JADX INFO: renamed from: X */
    @NotNull
    public final SparseArray<BaseOrderHolder> f50332X = new SparseArray<>();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final Lazy f50333Y = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.c0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeHorizontalSubmitFragment.m61371U3(this.f50380b);
        }
    });

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f50334Z = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.d0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeHorizontalSubmitFragment.m61375X3(this.f50385b);
        }
    });

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final C25117b f50335a0 = new C25117b();

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final C25116a f50336b0 = new C25116a();

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f50337c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.spot.business.submit.e0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeHorizontalSubmitFragment.m61372V3(this.f50392b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.TradeHorizontalSubmitFragment$a */
    /* JADX INFO: compiled from: TradeHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingBalanceChangeEvent$1", "Lcom/kubi/spot/business/saving/SavingBalanceChangeListener;", "onChange", "", "uid", "", FirebaseAnalytics.Param.CURRENCY, "balance", "Ljava/math/BigDecimal;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25116a implements SavingBalanceChangeListener {
        public C25116a() {
        }

        @Override // com.kubi.spot.business.saving.SavingBalanceChangeListener
        /* JADX INFO: renamed from: a */
        public void mo61320a(String str, String currency, BigDecimal balance) throws Exception {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(balance, "balance");
            C27024b.m66561d(TradeHorizontalSubmitFragment.this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.h0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.C25116a.m61426d((BaseOrderHolder) obj);
                }
            });
            C27024b.m66561d(TradeHorizontalSubmitFragment.this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.i0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.C25116a.m61427e((BaseOrderHolder) obj);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public static final void m61426d(BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.j();
        }

        /* JADX INFO: renamed from: e */
        public static final void m61427e(BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.j();
        }
    }

    /* JADX INFO: renamed from: com.kubi.spot.business.submit.TradeHorizontalSubmitFragment$b */
    /* JADX INFO: compiled from: TradeHorizontalSubmitFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/spot/business/submit/TradeHorizontalSubmitFragment$savingModelChangeEvent$1", "Lcom/kubi/spot/business/saving/SavingConfig$ISavingModeChangeEvent;", "onChange", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C25117b implements SavingConfig.a {
        public C25117b() {
        }

        @Override // com.kubi.spot.business.saving.SavingConfig.a
        /* JADX INFO: renamed from: a */
        public void mo61347a(final boolean z11) throws Exception {
            C27024b.m66561d(TradeHorizontalSubmitFragment.this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.j0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.C25117b.m61430d(z11, (BaseOrderHolder) obj);
                }
            });
            C27024b.m66561d(TradeHorizontalSubmitFragment.this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.k0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.C25117b.m61431e(z11, (BaseOrderHolder) obj);
                }
            });
        }

        /* JADX INFO: renamed from: d */
        public static final void m61430d(boolean z11, BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.r0(z11);
        }

        /* JADX INFO: renamed from: e */
        public static final void m61431e(boolean z11, BaseOrderHolder baseOrderHolder) {
            baseOrderHolder.r0(z11);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public static final void m61400p4(BaseOrderHolder baseOrderHolder) {
        com.kubi.spot.business.holder.a0.a(baseOrderHolder, false, 1, (Object) null);
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m61402q4(BaseOrderHolder baseOrderHolder) {
        com.kubi.spot.business.holder.a0.a(baseOrderHolder, false, 1, (Object) null);
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null) {
            BaseTextView cbOrderbookSelectPrecision = c45411xM61367O3.f102381d;
            Intrinsics.checkNotNullExpressionValue(cbOrderbookSelectPrecision, "cbOrderbookSelectPrecision");
            C27046k.m66711z(cbOrderbookSelectPrecision, 0L, new Function0() { // from class: com.kubi.spot.business.submit.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61388j4(this.f50406b);
                }
            }, 1, null);
            BaseTextView tvAmountUnit = c45411xM61367O3.f102390m;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit, "tvAmountUnit");
            BaseTextView tvAmountUnit1 = c45411xM61367O3.f102391n;
            Intrinsics.checkNotNullExpressionValue(tvAmountUnit1, "tvAmountUnit1");
            C27046k.m66681D(new View[]{tvAmountUnit, tvAmountUnit1}, new Function0() { // from class: com.kubi.spot.business.submit.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61390k4(this.f50410b);
                }
            });
            c45411xM61367O3.f102387j.setHasFixedSize(true);
            c45411xM61367O3.f102388k.setHasFixedSize(true);
            m61370S3().bindToRecyclerView(c45411xM61367O3.f102388k);
            m61368P3().bindToRecyclerView(c45411xM61367O3.f102387j);
            OrderBookAdapter orderBookAdapterM61370S3 = m61370S3();
            int i11 = R$layout.kucoin_view_orderbook_loading;
            orderBookAdapterM61370S3.setEmptyView(i11, c45411xM61367O3.f102388k);
            m61368P3().setEmptyView(i11, c45411xM61367O3.f102387j);
            m61368P3().m63017t(5);
            m61370S3().m63017t(5);
            RecyclerView rcvSell = c45411xM61367O3.f102388k;
            Intrinsics.checkNotNullExpressionValue(rcvSell, "rcvSell");
            C22912t.m54410h(rcvSell, false, 1, null);
            RecyclerView rcvBuy = c45411xM61367O3.f102387j;
            Intrinsics.checkNotNullExpressionValue(rcvBuy, "rcvBuy");
            C22912t.m54410h(rcvBuy, false, 1, null);
            m61368P3().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.spot.business.submit.k
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeHorizontalSubmitFragment.m61392l4(this.f50412a, i12, strArr);
                }
            });
            m61370S3().setSelectListener(new OrderBookItemView.InterfaceC22934a() { // from class: com.kubi.spot.business.submit.l
                @Override // com.kubi.resources.widget.OrderBookItemView.InterfaceC22934a
                /* JADX INFO: renamed from: a */
                public final void mo22630a(int i12, String[] strArr) {
                    TradeHorizontalSubmitFragment.m61394m4(this.f50416a, i12, strArr);
                }
            });
            ConstraintLayout llCenter = c45411xM61367O3.f102386i;
            Intrinsics.checkNotNullExpressionValue(llCenter, "llCenter");
            C27046k.m66711z(llCenter, 0L, new Function0() { // from class: com.kubi.spot.business.submit.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61396n4(c45411xM61367O3, this);
                }
            }, 1, null);
            AppCompatImageView ivPriceTypeInfo = c45411xM61367O3.f102385h;
            Intrinsics.checkNotNullExpressionValue(ivPriceTypeInfo, "ivPriceTypeInfo");
            C27046k.m66711z(ivPriceTypeInfo, 0L, new Function0() { // from class: com.kubi.spot.business.submit.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61383f4(this.f50423b);
                }
            }, 1, null);
            DashTextView tvEtfValue = c45411xM61367O3.f102392o;
            Intrinsics.checkNotNullExpressionValue(tvEtfValue, "tvEtfValue");
            C27046k.m66711z(tvEtfValue, 0L, new Function0() { // from class: com.kubi.spot.business.submit.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61384g4(this.f50425b);
                }
            }, 1, null);
            SimpleScrollBarLayout simpleScrollBarLayout = c45411xM61367O3.f102389l;
            String[] stringArray = getResources().getStringArray(C36606a.f79410a.m81923f().mo60492a());
            Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
            simpleScrollBarLayout.setTabData(ArraysKt.toList(stringArray));
            c45411xM61367O3.f102389l.setCurrent(m61374X());
            c45411xM61367O3.f102389l.setPositionChanged(new BiConsumer() { // from class: com.kubi.spot.business.submit.p
                @Override // io.reactivex.functions.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    TradeHorizontalSubmitFragment.m61385h4(this.f50429b, (String) obj, (Integer) obj2);
                }
            });
            BuySellRatioView buySellRatioView = c45411xM61367O3.f102380c;
            Intrinsics.checkNotNullExpressionValue(buySellRatioView, "buySellRatioView");
            C27046k.m66711z(buySellRatioView, 0L, new Function0() { // from class: com.kubi.spot.business.submit.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61386i4(this.f50434b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public static final void m61351A4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.r0(SavingConfig.f50323a.m61333a());
    }

    /* JADX INFO: renamed from: B4 */
    private final void m61353B4(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (i11 <= 8) {
            C45411x c45411xM61367O3 = m61367O3();
            if (c45411xM61367O3 == null || (baseTextView3 = c45411xM61367O3.f102381d) == null) {
                return;
            }
            baseTextView3.setTextSize(12.0f);
            return;
        }
        if (i11 <= 10) {
            C45411x c45411xM61367O4 = m61367O3();
            if (c45411xM61367O4 == null || (baseTextView2 = c45411xM61367O4.f102381d) == null) {
                return;
            }
            baseTextView2.setTextSize(11.0f);
            return;
        }
        C45411x c45411xM61367O5 = m61367O3();
        if (c45411xM61367O5 == null || (baseTextView = c45411xM61367O5.f102381d) == null) {
            return;
        }
        baseTextView.setTextSize(10.0f);
    }

    /* JADX INFO: renamed from: O3 */
    private final C45411x m61367O3() {
        return (C45411x) this.f50329U.getValue(this, f50328d0[0]);
    }

    /* JADX INFO: renamed from: P3 */
    private final OrderBookAdapter m61368P3() {
        return (OrderBookAdapter) this.f50333Y.getValue();
    }

    /* JADX INFO: renamed from: Q3 */
    private final com.kubi.spot.business.holder.z m61369Q3() {
        return (com.kubi.spot.business.holder.z) this.f50337c0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    private final OrderBookAdapter m61370S3() {
        return (OrderBookAdapter) this.f50334Z.getValue();
    }

    /* JADX INFO: renamed from: U3 */
    public static final OrderBookAdapter m61371U3(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        return new OrderBookAdapter(1, 1, tradeHorizontalSubmitFragment.m61419R3().mo60314z0());
    }

    /* JADX INFO: renamed from: X3 */
    public static final OrderBookAdapter m61375X3(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        return new OrderBookAdapter(0, 1, tradeHorizontalSubmitFragment.m61419R3().mo60314z0());
    }

    /* JADX INFO: renamed from: b4 */
    public static final void m61379b4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.g(new BigDecimal(String.valueOf(tradeHorizontalSubmitFragment.m61419R3().getF50346Z().getPrice())));
        baseOrderHolder.b(tradeHorizontalSubmitFragment.m61419R3().getF50346Z());
    }

    /* JADX INFO: renamed from: c4 */
    public static final void m61380c4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.g(new BigDecimal(String.valueOf(tradeHorizontalSubmitFragment.m61419R3().getF50346Z().getPrice())));
        baseOrderHolder.b(tradeHorizontalSubmitFragment.m61419R3().getF50346Z());
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m61383f4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        C43852m.m96591c("B5trading", "orderIntroButton", null, null, 12, null);
        List<TradeType> listM81919b = C36606a.f79410a.m81919b();
        TradeTypeBizDialogFragment.Companion companion = TradeTypeBizDialogFragment.f51635x0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM81919b, 10));
        Iterator<T> it = listM81919b.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeType) it.next()).getValue());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        TradeType tradeType = (TradeType) CollectionsKt.getOrNull(listM81919b, tradeHorizontalSubmitFragment.m61419R3().getF50342V());
        if (tradeType == null) {
            tradeType = TradeType.LIMIT;
        }
        TradeTypeBizDialogFragment tradeTypeBizDialogFragmentNewInstance$default = TradeTypeBizDialogFragment.Companion.newInstance$default(companion, strArr, tradeType, "B5trading", false, false, null, 56, null);
        FragmentManager childFragmentManager = tradeHorizontalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        tradeTypeBizDialogFragmentNewInstance$default.show(childFragmentManager, "showTradeInfoDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i4 */
    public static final Unit m61386i4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        ISpotService iSpotService = ISpotService.f49646a.get();
        FragmentManager childFragmentManager = tradeHorizontalSubmitFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iSpotService.mo60006s(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n4 */
    public static final Unit m61396n4(final C45411x c45411x, final TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        if (!TextUtils.isEmpty(c45411x.f102396s.getText())) {
            C27100x0.m66924e(new Function0() { // from class: com.kubi.spot.business.submit.x
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61398o4(this.f50452b, c45411x);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static final Unit m61412v4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        if (!IUserService.a.get().c()) {
            IUserService.O((IUserService) Router.f46192a.m56192n(IUserService.class), (Map) null, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.spot.business.submit.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61414w4();
                }
            }), 1, (Object) null);
        } else if (tradeHorizontalSubmitFragment.m61365N().isEtfSymbol()) {
            SpotDepend.f51244a.m63033c().mo37920T();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w4 */
    public static final Unit m61414w4() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z4 */
    public static final void m61418z4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.r0(SavingConfig.f50323a.m61333a());
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: F0 */
    public void mo60290F0(@NotNull OrderBookEntity data) {
        BuySellRatioView buySellRatioView;
        Intrinsics.checkNotNullParameter(data, "data");
        m61370S3().m63014p(C27024b.m66559b(data.getAsks()));
        m61368P3().m63014p(C27024b.m66559b(data.getBids()));
        m61376Y3();
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 == null || (buySellRatioView = c45411xM61367O3.f102380c) == null) {
            return;
        }
        buySellRatioView.m54454g(data.getBids(), data.getAsks());
    }

    /* JADX INFO: renamed from: R3 */
    public final ITradeParentBehavior m61419R3() {
        return (ITradeParentBehavior) this.f50330V.getValue();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: S */
    public void mo60292S() throws Exception {
        C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.s
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61377Z3((BaseOrderHolder) obj);
            }
        });
        C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.t
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61378a4((BaseOrderHolder) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T3 */
    public final BaseOrderHolder m61420T3(int i11) {
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46793d0.class, SiteInfoManager.f47913a.m58109c());
        if (!(objM56186h != null ? ((InterfaceC46793d0) objM56186h).m103121a() : true)) {
            if (i11 == 0) {
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext, m61369Q3(), false, true, (com.kubi.spot.business.holder.y) null, 20, (DefaultConstructorMarker) null);
            }
            if (i11 == 1) {
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext2, m61369Q3(), false, true, (com.kubi.spot.business.holder.y) null, 20, (DefaultConstructorMarker) null);
            }
            if (i11 == 2) {
                Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext3, m61369Q3(), true, true, (com.kubi.spot.business.holder.y) null, 16, (DefaultConstructorMarker) null);
            }
            if (i11 == 3) {
                Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext4, m61369Q3(), true, true, (com.kubi.spot.business.holder.y) null, 16, (DefaultConstructorMarker) null);
            }
            if (i11 != 4) {
                Context contextRequireContext5 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "requireContext(...)");
                return new TrailingStopOrderHolder(contextRequireContext5, m61369Q3(), true, (com.kubi.spot.business.holder.y) null, 8, (DefaultConstructorMarker) null);
            }
            Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "requireContext(...)");
            return new TrailingStopOrderHolder(contextRequireContext6, m61369Q3(), true, (com.kubi.spot.business.holder.y) null, 8, (DefaultConstructorMarker) null);
        }
        switch (i11) {
            case 0:
                Context contextRequireContext7 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext7, m61369Q3(), false, true, (com.kubi.spot.business.holder.y) null, 20, (DefaultConstructorMarker) null);
            case 1:
                Context contextRequireContext8 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext8, m61369Q3(), false, true, (com.kubi.spot.business.holder.y) null, 20, (DefaultConstructorMarker) null);
            case 2:
                Context contextRequireContext9 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext9, "requireContext(...)");
                return new AdvancedLimitOrderHolder(contextRequireContext9, m61369Q3(), false, true, (com.kubi.spot.business.holder.y) null, 20, (DefaultConstructorMarker) null);
            case 3:
                Context contextRequireContext10 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext10, "requireContext(...)");
                return new LimitOrderHolder(contextRequireContext10, m61369Q3(), true, true, (com.kubi.spot.business.holder.y) null, 16, (DefaultConstructorMarker) null);
            case 4:
                Context contextRequireContext11 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext11, "requireContext(...)");
                return new MarketOrderHolder(contextRequireContext11, m61369Q3(), true, true, (com.kubi.spot.business.holder.y) null, 16, (DefaultConstructorMarker) null);
            case 5:
                Context contextRequireContext12 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext12, "requireContext(...)");
                return new OcoOrderHolder(contextRequireContext12, m61369Q3(), true, (com.kubi.spot.business.holder.y) null, 8, (DefaultConstructorMarker) null);
            case 6:
                Context contextRequireContext13 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext13, "requireContext(...)");
                return new TrailingStopOrderHolder(contextRequireContext13, m61369Q3(), true, (com.kubi.spot.business.holder.y) null, 8, (DefaultConstructorMarker) null);
            default:
                Context contextRequireContext14 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext14, "requireContext(...)");
                return new OcoOrderHolder(contextRequireContext14, m61369Q3(), true, (com.kubi.spot.business.holder.y) null, 8, (DefaultConstructorMarker) null);
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: U */
    public void mo60293U() throws Exception {
        C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61381d4((BaseOrderHolder) obj);
            }
        });
        C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.q
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61382e4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: a */
    public void mo60294a(@NotNull BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null) {
            if (c45411xM61367O3.f102382e.getChildCount() > 0) {
                FrameLayout flBuy = c45411xM61367O3.f102382e;
                Intrinsics.checkNotNullExpressionValue(flBuy, "flBuy");
                BaseOrderHolder baseOrderHolderM66698m = C27046k.m66698m(flBuy, 0);
                BaseOrderHolder baseOrderHolder = baseOrderHolderM66698m instanceof BaseOrderHolder ? baseOrderHolderM66698m : null;
                if (baseOrderHolder != null) {
                    baseOrderHolder.h(value);
                }
            }
            if (c45411xM61367O3.f102383f.getChildCount() > 0) {
                FrameLayout flSell = c45411xM61367O3.f102383f;
                Intrinsics.checkNotNullExpressionValue(flSell, "flSell");
                View viewM66698m = C27046k.m66698m(flSell, 0);
                BaseOrderHolder baseOrderHolder2 = viewM66698m instanceof BaseOrderHolder ? (BaseOrderHolder) viewM66698m : null;
                if (baseOrderHolder2 != null) {
                    baseOrderHolder2.h(value);
                }
            }
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: b */
    public void mo60295b(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45411x c45411xM61367O3;
        BaseTextView baseTextView3;
        if (i11 != 0) {
            if (i11 != 1 || (c45411xM61367O3 = m61367O3()) == null || (baseTextView3 = c45411xM61367O3.f102381d) == null) {
                return;
            }
            C27046k.m66694i(baseTextView3, R$drawable.ic2_triangle_top_12, 0, 0, 4, null);
            return;
        }
        C45411x c45411xM61367O4 = m61367O3();
        if (c45411xM61367O4 != null && (baseTextView2 = c45411xM61367O4.f102390m) != null) {
            C27046k.m66694i(baseTextView2, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
        }
        C45411x c45411xM61367O5 = m61367O3();
        if (c45411xM61367O5 == null || (baseTextView = c45411xM61367O5.f102391n) == null) {
            return;
        }
        C27046k.m66694i(baseTextView, R$drawable.ic_drop_triangle_small_up, 0, 0, 4, null);
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: c */
    public void mo60297c(int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C45411x c45411xM61367O3;
        BaseTextView baseTextView3;
        if (i11 != 0) {
            if (i11 != 1 || (c45411xM61367O3 = m61367O3()) == null || (baseTextView3 = c45411xM61367O3.f102381d) == null) {
                return;
            }
            C27046k.m66694i(baseTextView3, R$drawable.ic2_triangle_bottom_12, 0, 0, 4, null);
            return;
        }
        C45411x c45411xM61367O4 = m61367O3();
        if (c45411xM61367O4 != null && (baseTextView2 = c45411xM61367O4.f102390m) != null) {
            C27046k.m66694i(baseTextView2, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
        }
        C45411x c45411xM61367O5 = m61367O3();
        if (c45411xM61367O5 == null || (baseTextView = c45411xM61367O5.f102391n) == null) {
            return;
        }
        C27046k.m66694i(baseTextView, R$mipmap.ic_drop_triangle_small, 0, 0, 4, null);
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: d */
    public void mo60299d(@NotNull String labelStr, int i11) {
        BaseTextView baseTextView;
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null && (baseTextView = c45411xM61367O3.f102381d) != null) {
            baseTextView.setText(labelStr);
        }
        m61353B4(i11);
        m61368P3().m63015q(i11);
        m61370S3().m63015q(i11);
        m61376Y3();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: d0 */
    public void mo60300d0(@NotNull String labelStr, int i11) {
        Intrinsics.checkNotNullParameter(labelStr, "labelStr");
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null) {
            c45411xM61367O3.f102389l.setCurrentIndex(i11);
            FrameLayout flSell = c45411xM61367O3.f102383f;
            Intrinsics.checkNotNullExpressionValue(flSell, "flSell");
            m61366N3(i11, flSell, this.f50332X);
            FrameLayout flBuy = c45411xM61367O3.f102382e;
            Intrinsics.checkNotNullExpressionValue(flBuy, "flBuy");
            m61366N3(i11, flBuy, this.f50331W);
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: f0 */
    public void mo60301f0() throws Exception {
        C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.u
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61400p4((BaseOrderHolder) obj);
            }
        });
        C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.v
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61402q4((BaseOrderHolder) obj);
            }
        });
        m61410u4();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: h0 */
    public void mo60302h0(@NotNull OrderBookCenterEntity data) throws Exception {
        ShowHideTextView showHideTextView;
        ShowHideTextView showHideTextView2;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        C45411x c45411xM61367O3;
        ShowHideTextView showHideTextView5;
        ShowHideTextView showHideTextView6;
        ShowHideTextView showHideTextView7;
        ShowHideTextView showHideTextView8;
        ShowHideTextView showHideTextView9;
        Intrinsics.checkNotNullParameter(data, "data");
        if (getView() == null) {
            return;
        }
        if (m61419R3().getF50346Z().getPrice() == 0.0d) {
            C45411x c45411xM61367O4 = m61367O3();
            if (c45411xM61367O4 != null && (showHideTextView9 = c45411xM61367O4.f102396s) != null) {
                showHideTextView9.setText("--");
            }
            C45411x c45411xM61367O5 = m61367O3();
            if (c45411xM61367O5 != null && (showHideTextView8 = c45411xM61367O5.f102396s) != null) {
                showHideTextView8.setTextColor(getColorRes(R$color.c_text40));
            }
            C45411x c45411xM61367O6 = m61367O3();
            if (c45411xM61367O6 == null || (showHideTextView7 = c45411xM61367O6.f102395r) == null) {
                return;
            }
            showHideTextView7.setText("--");
            return;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        C45411x c45411xM61367O7 = m61367O3();
        Object tag = (c45411xM61367O7 == null || (showHideTextView6 = c45411xM61367O7.f102396s) == null) ? null : showHideTextView6.getTag();
        int iM58391a = C24218b.m58391a(contextRequireContext, C27039d.m66646f(tag instanceof Double ? (Double) tag : null), m61419R3().getF50346Z().getPrice());
        if (iM58391a != -1 && (c45411xM61367O3 = m61367O3()) != null && (showHideTextView5 = c45411xM61367O3.f102396s) != null) {
            showHideTextView5.setTextColor(iM58391a);
        }
        C45411x c45411xM61367O8 = m61367O3();
        if (c45411xM61367O8 != null && (showHideTextView4 = c45411xM61367O8.f102396s) != null) {
            showHideTextView4.setTag(Double.valueOf(m61419R3().getF50346Z().getPrice()));
        }
        C45411x c45411xM61367O9 = m61367O3();
        if (c45411xM61367O9 != null && (showHideTextView3 = c45411xM61367O9.f102396s) != null) {
            showHideTextView3.setText(C37886j.m85579c(new BigDecimal(String.valueOf(m61419R3().getF50346Z().getPrice())), m61365N().getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null));
        }
        C45411x c45411xM61367O10 = m61367O3();
        if (c45411xM61367O10 != null && (showHideTextView2 = c45411xM61367O10.f102395r) != null) {
            C24256n1.m58513c(showHideTextView2);
        }
        C45411x c45411xM61367O11 = m61367O3();
        if (c45411xM61367O11 != null && (showHideTextView = c45411xM61367O11.f102395r) != null) {
            showHideTextView.setText(C41014a.m89948v(C41014a.m89939m(m61419R3().getF50346Z().getPrice(), m61365N().getQuoteCurrency()), null, null, 0, false, true, true, 15, null));
        }
        C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.g
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61379b4(this.f50400b, (BaseOrderHolder) obj);
            }
        });
        C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61380c4(this.f50403b, (BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_trade_horizontal, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: x4 */
    public final void m61422x4() {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            savingConfig.m61345m(this.f50335a0);
            SavingCacheManager.f50304a.m61307u(this.f50336b0);
        }
    }

    /* JADX INFO: renamed from: y4 */
    public final void m61423y4() throws Exception {
        SavingConfig savingConfig = SavingConfig.f50323a;
        if (savingConfig.m61340h()) {
            C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.f0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.m61418z4((BaseOrderHolder) obj);
                }
            });
            C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.g0
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    TradeHorizontalSubmitFragment.m61351A4((BaseOrderHolder) obj);
                }
            });
            savingConfig.m61344l(this.f50335a0);
            SavingCacheManager.f50304a.m61305r(this.f50336b0);
        }
    }

    /* JADX INFO: renamed from: N */
    private final SymbolInfoEntity m61365N() {
        return m61419R3().mo60189N();
    }

    /* JADX INFO: renamed from: N3 */
    private final void m61366N3(int i11, FrameLayout frameLayout, SparseArray<BaseOrderHolder> sparseArray) {
        boolean z11;
        BaseOrderHolder baseOrderHolderM61420T3 = sparseArray.get(i11);
        if (baseOrderHolderM61420T3 == null) {
            baseOrderHolderM61420T3 = m61420T3(i11);
            sparseArray.put(i11, baseOrderHolderM61420T3);
        }
        frameLayout.removeAllViews();
        if (frameLayout.getId() == R$id.fl_buy) {
            z11 = true;
        } else {
            z11 = false;
        }
        baseOrderHolderM61420T3.setIsBuyHolder(z11);
        baseOrderHolderM61420T3.j();
        frameLayout.addView(baseOrderHolderM61420T3);
    }

    /* JADX INFO: renamed from: V3 */
    public static final com.kubi.spot.business.holder.z m61372V3(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        com.kubi.spot.business.holder.z parentFragment = tradeHorizontalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.business.holder.ITradeHolderDependDelegate");
        return parentFragment;
    }

    /* JADX INFO: renamed from: W3 */
    public static final ITradeParentBehavior m61373W3(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        ActivityResultCaller parentFragment = tradeHorizontalSubmitFragment.getParentFragment();
        Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.spot.business.ITradeParentBehavior");
        return (ITradeParentBehavior) parentFragment;
    }

    /* JADX INFO: renamed from: X */
    private final int m61374X() {
        return m61419R3().getF50342V();
    }

    /* JADX INFO: renamed from: Y3 */
    private final void m61376Y3() {
        double dCoerceAtLeast = RangesKt.coerceAtLeast(m61368P3().getF51235q(), m61370S3().getF51235q());
        m61368P3().m63013o(dCoerceAtLeast);
        m61370S3().m63013o(dCoerceAtLeast);
    }

    /* JADX INFO: renamed from: Z3 */
    public static final void m61377Z3(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.j();
    }

    /* JADX INFO: renamed from: a4 */
    public static final void m61378a4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.j();
    }

    /* JADX INFO: renamed from: d4 */
    public static final void m61381d4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.c();
    }

    /* JADX INFO: renamed from: e4 */
    public static final void m61382e4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.c();
    }

    /* JADX INFO: renamed from: g4 */
    public static final Unit m61384g4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        tradeHorizontalSubmitFragment.m61419R3().mo60287n0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h4 */
    public static final void m61385h4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, String str, Integer num) {
        ITradeParentBehavior iTradeParentBehaviorM61419R3 = tradeHorizontalSubmitFragment.m61419R3();
        Intrinsics.checkNotNull(str);
        Intrinsics.checkNotNull(num);
        iTradeParentBehaviorM61419R3.mo60311p0(str, num.intValue());
    }

    /* JADX INFO: renamed from: j4 */
    public static final Unit m61388j4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        tradeHorizontalSubmitFragment.m61419R3().mo60308Y();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k4 */
    public static final Unit m61390k4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment) {
        tradeHorizontalSubmitFragment.m61419R3().mo60310l0();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    public static final void m61392l4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, int i11, String[] strArr) {
        tradeHorizontalSubmitFragment.m61419R3().mo60306T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "orderPriceNum", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: m4 */
    public static final void m61394m4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, int i11, String[] strArr) {
        tradeHorizontalSubmitFragment.m61419R3().mo60306T(C41014a.m89922G(C42180b.m92637b(strArr[0], null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "orderPriceNum", "2", null, 8, null);
    }

    /* JADX INFO: renamed from: o4 */
    public static final Unit m61398o4(TradeHorizontalSubmitFragment tradeHorizontalSubmitFragment, C45411x c45411x) {
        tradeHorizontalSubmitFragment.m61419R3().mo60306T(C41014a.m89922G(C42180b.m92637b(c45411x.f102396s.getText().toString(), null, 1, null), null, 1, null));
        C43852m.m96591c("B5trading", "bidAskPriceClick", null, null, 12, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r4 */
    public static final void m61404r4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.f();
    }

    /* JADX INFO: renamed from: s0 */
    private final int m61405s0() {
        return m61419R3().getF50341U();
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m61407s4(BaseOrderHolder baseOrderHolder) {
        baseOrderHolder.f();
    }

    /* JADX INFO: renamed from: u4 */
    private final void m61410u4() {
        KcPrimaryButton kcPrimaryButton;
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null && (kcPrimaryButton = c45411xM61367O3.f102393p) != null) {
            if (m61419R3().mo60188M()) {
                ViewExtKt.m66594y(kcPrimaryButton);
                kcPrimaryButton.setEnabled(false);
                kcPrimaryButton.setText(R$string.outage_tip);
                return;
            }
            kcPrimaryButton.setEnabled(true);
            IUserService.Companion companion = IUserService.a;
            if (!companion.get().c()) {
                kcPrimaryButton.setText(R$string.login);
                ViewExtKt.m66594y(kcPrimaryButton);
            } else if (m61365N().isEtfSymbol() && !companion.get().d0().isAgreeEtf()) {
                ViewExtKt.m66594y(kcPrimaryButton);
                kcPrimaryButton.setText(R$string.etf_agree_terms);
            } else {
                ViewExtKt.m66577h(kcPrimaryButton);
            }
            C27046k.m66711z(kcPrimaryButton, 0L, new Function0() { // from class: com.kubi.spot.business.submit.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradeHorizontalSubmitFragment.m61412v4(this.f50447b);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: R0 */
    public void mo60291R0(int i11) {
        BaseTextView baseTextView;
        int i12;
        BaseTextView baseTextView2;
        int i13;
        m61368P3().m63018u(i11);
        m61370S3().m63018u(i11);
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null && (baseTextView2 = c45411xM61367O3.f102390m) != null) {
            if (m61368P3().getF51231m() == 0) {
                i13 = R$string.total_stub;
            } else {
                i13 = R$string.amount_stub;
            }
            baseTextView2.setText(getString(i13, m61365N().getBaseCurrencyName()));
        }
        C45411x c45411xM61367O4 = m61367O3();
        if (c45411xM61367O4 != null && (baseTextView = c45411xM61367O4.f102391n) != null) {
            if (m61368P3().getF51231m() == 0) {
                i12 = R$string.total_stub;
            } else {
                i12 = R$string.amount_stub;
            }
            baseTextView.setText(getString(i12, m61365N().getBaseCurrencyName()));
        }
        mo60298c0();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: b0 */
    public void mo60296b0(boolean z11) throws Exception {
        C45411x c45411xM61367O3;
        SimpleScrollBarLayout simpleScrollBarLayout;
        ShowHideTextView showHideTextView;
        AppCompatImageView appCompatImageView;
        DashTextView dashTextView;
        ShowHideTextView showHideTextView2;
        AppCompatImageView appCompatImageView2;
        DashTextView dashTextView2;
        BaseTextView baseTextView;
        int i11;
        BaseTextView baseTextView2;
        int i12;
        BaseTextView baseTextView3;
        DashTextView dashTextView3;
        ShowHideTextView showHideTextView3;
        ShowHideTextView showHideTextView4;
        BaseTextView baseTextView4;
        String str;
        SimpleScrollBarLayout simpleScrollBarLayout2;
        String[] stringArray = getResources().getStringArray(C36606a.f79410a.m81923f().mo60492a());
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        C45411x c45411xM61367O4 = m61367O3();
        if ((c45411xM61367O4 == null || (simpleScrollBarLayout2 = c45411xM61367O4.f102389l) == null || simpleScrollBarLayout2.getTabCount() != stringArray.length) && (c45411xM61367O3 = m61367O3()) != null && (simpleScrollBarLayout = c45411xM61367O3.f102389l) != null) {
            simpleScrollBarLayout.setTabData(ArraysKt.toList(stringArray));
        }
        int iM66650j = C27039d.m66650j(Integer.valueOf(m61374X()));
        if (iM66650j >= stringArray.length) {
            iM66650j = 0;
        }
        String str2 = stringArray[iM66650j];
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        mo60300d0(str2, iM66650j);
        m61368P3().m63012n(m61365N().getBaseIncrementPrecision());
        m61370S3().m63012n(m61365N().getBaseIncrementPrecision());
        C45411x c45411xM61367O5 = m61367O3();
        if (c45411xM61367O5 != null && (baseTextView4 = c45411xM61367O5.f102381d) != null) {
            ArrayList<String> arrayListM63003a = C25799u.m63003a(m61365N().getPriceIncrementPrecision());
            int priceIncrementPrecision = m61365N().getPriceIncrementPrecision() - m61405s0();
            if (arrayListM63003a.size() > priceIncrementPrecision && priceIncrementPrecision >= 0) {
                str = arrayListM63003a.get(priceIncrementPrecision);
            } else {
                str = arrayListM63003a.get(0);
            }
            baseTextView4.setText(str);
        }
        m61368P3().m63015q(m61405s0());
        m61370S3().m63015q(m61405s0());
        C45411x c45411xM61367O6 = m61367O3();
        if (c45411xM61367O6 != null && (showHideTextView4 = c45411xM61367O6.f102396s) != null) {
            showHideTextView4.setText("--");
        }
        C45411x c45411xM61367O7 = m61367O3();
        if (c45411xM61367O7 != null && (showHideTextView3 = c45411xM61367O7.f102395r) != null) {
            showHideTextView3.setText("--");
        }
        C45411x c45411xM61367O8 = m61367O3();
        if (c45411xM61367O8 != null && (dashTextView3 = c45411xM61367O8.f102392o) != null) {
            dashTextView3.setText("--");
        }
        C45411x c45411xM61367O9 = m61367O3();
        if (c45411xM61367O9 != null && (baseTextView3 = c45411xM61367O9.f102394q) != null) {
            baseTextView3.setText(C27017c.f54310a.m66516f(R$string.price_order, m61365N().getQuoteCurrencyName()));
        }
        C45411x c45411xM61367O10 = m61367O3();
        if (c45411xM61367O10 != null && (baseTextView2 = c45411xM61367O10.f102390m) != null) {
            C27017c c27017c = C27017c.f54310a;
            if (m61368P3().getF51231m() == 0) {
                i12 = R$string.total_stub;
            } else {
                i12 = R$string.amount_stub;
            }
            baseTextView2.setText(c27017c.m66516f(i12, m61365N().getBaseCurrencyName()));
        }
        C45411x c45411xM61367O11 = m61367O3();
        if (c45411xM61367O11 != null && (baseTextView = c45411xM61367O11.f102391n) != null) {
            C27017c c27017c2 = C27017c.f54310a;
            if (m61368P3().getF51231m() == 0) {
                i11 = R$string.total_stub;
            } else {
                i11 = R$string.amount_stub;
            }
            baseTextView.setText(c27017c2.m66516f(i11, m61365N().getBaseCurrencyName()));
        }
        m61353B4(m61405s0());
        if (m61419R3().mo60283P1()) {
            C45411x c45411xM61367O12 = m61367O3();
            if (c45411xM61367O12 != null && (dashTextView2 = c45411xM61367O12.f102392o) != null) {
                ViewExtKt.m66594y(dashTextView2);
            }
            C45411x c45411xM61367O13 = m61367O3();
            if (c45411xM61367O13 != null && (appCompatImageView2 = c45411xM61367O13.f102384g) != null) {
                ViewExtKt.m66594y(appCompatImageView2);
            }
            C45411x c45411xM61367O14 = m61367O3();
            if (c45411xM61367O14 != null && (showHideTextView2 = c45411xM61367O14.f102395r) != null) {
                C27046k.m66703r(showHideTextView2);
            }
        } else {
            C45411x c45411xM61367O15 = m61367O3();
            if (c45411xM61367O15 != null && (dashTextView = c45411xM61367O15.f102392o) != null) {
                C27046k.m66703r(dashTextView);
            }
            C45411x c45411xM61367O16 = m61367O3();
            if (c45411xM61367O16 != null && (appCompatImageView = c45411xM61367O16.f102384g) != null) {
                C27046k.m66703r(appCompatImageView);
            }
            C45411x c45411xM61367O17 = m61367O3();
            if (c45411xM61367O17 != null && (showHideTextView = c45411xM61367O17.f102395r) != null) {
                ViewExtKt.m66594y(showHideTextView);
            }
        }
        if (z11) {
            return;
        }
        m61368P3().m63007h();
        m61370S3().m63007h();
        mo60302h0(m61419R3().getF50346Z());
        C27024b.m66561d(this.f50331W, new Consumer() { // from class: com.kubi.spot.business.submit.z
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61404r4((BaseOrderHolder) obj);
            }
        });
        C27024b.m66561d(this.f50332X, new Consumer() { // from class: com.kubi.spot.business.submit.a0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                TradeHorizontalSubmitFragment.m61407s4((BaseOrderHolder) obj);
            }
        });
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: c0 */
    public void mo60298c0() {
        m61368P3().notifyDataSetChanged();
        m61370S3().notifyDataSetChanged();
    }

    @Override // com.kubi.spot.business.ITradeChildBehavior
    /* JADX INFO: renamed from: m0 */
    public void mo60303m0(@Nullable BigDecimal bigDecimal) {
        DashTextView dashTextView;
        String strM85579c;
        C45411x c45411xM61367O3 = m61367O3();
        if (c45411xM61367O3 != null && (dashTextView = c45411xM61367O3.f102392o) != null) {
            if (bigDecimal == null) {
                strM85579c = null;
            } else {
                strM85579c = C37886j.m85579c(bigDecimal, m61365N().getCode(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0 ? true : true, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
            }
            dashTextView.setText(C27041f.m66669i(strM85579c, "--"));
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onHide() {
        super.onHide();
        m61422x4();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() throws Exception {
        mo60301f0();
        mo60296b0(true);
        m61423y4();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m61421t4() {
        C45411x c45411xM61367O3;
        SimpleScrollBarLayout simpleScrollBarLayout;
        SimpleScrollBarLayout simpleScrollBarLayout2;
        String[] stringArray = getResources().getStringArray(C36606a.f79410a.m81923f().mo60492a());
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        C45411x c45411xM61367O4 = m61367O3();
        if ((c45411xM61367O4 == null || (simpleScrollBarLayout2 = c45411xM61367O4.f102389l) == null || simpleScrollBarLayout2.getTabCount() != stringArray.length) && (c45411xM61367O3 = m61367O3()) != null && (simpleScrollBarLayout = c45411xM61367O3.f102389l) != null) {
            simpleScrollBarLayout.setTabData(ArraysKt.toList(stringArray));
        }
        int iM66650j = C27039d.m66650j(Integer.valueOf(m61374X()));
        if (iM66650j >= stringArray.length) {
            iM66650j = 0;
        }
        String str = stringArray[iM66650j];
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        mo60300d0(str, iM66650j);
    }
}
