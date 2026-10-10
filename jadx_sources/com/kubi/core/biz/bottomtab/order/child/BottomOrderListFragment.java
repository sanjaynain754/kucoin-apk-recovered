package com.kubi.core.biz.bottomtab.order.child;

import ad.InterfaceC0239a;
import af.C0296a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.blankj.utilcode.util.C5275i0;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.arch.mvi.AbsTradeBaseBizFragment;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.biz.BaseTradeCoreFragment;
import com.kubi.core.biz.bottomtab.order.BottomOrderTabsContract$UiIntent;
import com.kubi.core.biz.bottomtab.order.BottomOrderTabsSharedVM;
import com.kubi.core.biz.bottomtab.order.UiState;
import com.kubi.core.biz.menu.more.MoreDialogSectionTab;
import com.kubi.core.biz.symbol.C12247g;
import com.kubi.core.biz.symbol.ShareSymbolBizVM;
import com.kubi.core.spot.business.businessTrack.DurationTrackerHelper;
import com.kubi.core.spot.helper.DialogHelper;
import com.kubi.core.utils.C12464c;
import com.kubi.data.BeepHelper;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.margin.api.IMarginService;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.widget.loading.WrapperLoadingView;
import com.kubi.spot.api.ISpotCommonService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$font;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$mipmap;
import com.kubi.tradecorebiz.R$raw;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlinx.coroutines.InterfaceC41775x1;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p401kd.C41006j;
import p401kd.InterfaceC41007k;
import p569qq.C43841b;
import p671uq.C45290a;
import p722wd.C45795d;
import p827zc.C46755e;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.comparisons.ComparisonsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.sequences.SequencesKt;
import ro.C44128b;
import v30.C45375c0;
import v30.C45377d0;
import v30.C45407t;
import w00.C45681e;

/* JADX INFO: compiled from: BottomOrderListFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0016J\b\u00104\u001a\u000205H\u0014J\b\u00106\u001a\u000205H\u0014J\u001c\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010<\u001a\u00020&H\u0014J\b\u0010=\u001a\u00020&H\u0016J\u001a\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u000208H\u0016J&\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020F\u0018\u00010E2\u0006\u0010G\u001a\u0002052\u0006\u0010H\u001a\u000205H\u0014J\b\u0010I\u001a\u000208H\u0016J\b\u0010J\u001a\u000208H\u0016J\b\u0010K\u001a\u000208H\u0016J\"\u0010K\u001a\u0002082\u0006\u0010L\u001a\u0002052\u0006\u0010M\u001a\u0002052\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010P\u001a\u000208H\u0016J\u0012\u0010Q\u001a\u0002082\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u0002082\b\u0010U\u001a\u0004\u0018\u00010SJ\b\u0010V\u001a\u000208H\u0002J\b\u0010W\u001a\u000208H\u0002J\b\u0010X\u001a\u000208H\u0002J\b\u0010Y\u001a\u00020ZH\u0002J\b\u0010[\u001a\u00020ZH\u0002J'\u0010\\\u001a\u0002082\u0006\u0010]\u001a\u00020&2\u0006\u0010^\u001a\u00020&2\b\u0010_\u001a\u0004\u0018\u000105H\u0002¢\u0006\u0002\u0010`J.\u0010a\u001a\u0002082\u0006\u0010b\u001a\u00020&2\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010S2\b\u0010f\u001a\u0004\u0018\u00010gH\u0002J+\u0010h\u001a\u00020Z2\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010S2\b\u0010f\u001a\u0004\u0018\u00010gH\u0000¢\u0006\u0002\biJ\u001c\u0010j\u001a\u0002082\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010SH\u0002J&\u0010k\u001a\u0002082\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010S2\b\u0010f\u001a\u0004\u0018\u00010gH\u0002J\u001c\u0010l\u001a\u0002082\b\u0010m\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010SH\u0002J\u000e\u0010n\u001a\u0004\u0018\u00010o*\u00020pH\u0002J\u001c\u0010q\u001a\u0002082\b\u0010c\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010SH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\u0004\u0018\u00010!8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020&X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b/\u00100¨\u0006s"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "<init>", "()V", "orderListOperatorVM", "Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorVM;", "getOrderListOperatorVM", "()Lcom/kubi/core/biz/bottomtab/order/child/OrderListOperatorVM;", "orderListOperatorVM$delegate", "Lkotlin/Lazy;", "bottomOrderTabsSharedVM", "Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsSharedVM;", "getBottomOrderTabsSharedVM", "()Lcom/kubi/core/biz/bottomtab/order/BottomOrderTabsSharedVM;", "bottomOrderTabsSharedVM$delegate", "binding", "Lcom/kubi/tradecorebiz/databinding/FragmentCoreDelegationTodoTradeBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/FragmentCoreDelegationTodoTradeBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "guideBinding", "Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "getGuideBinding$TradeCoreBizLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideLayoutBinding;", "guideBinding$delegate", "symbolBizVM", "Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "getSymbolBizVM", "()Lcom/kubi/core/biz/symbol/ShareSymbolBizVM;", "symbolBizVM$delegate", "guideTradeBinding", "Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideTradeLayoutBinding;", "getGuideTradeBinding$TradeCoreBizLib_googleRelease", "()Lcom/kubi/tradecorebiz/databinding/KucoinDelegationGuideTradeLayoutBinding;", "guideTradeBinding$delegate", "needLoadingView", "", "getNeedLoadingView", "()Z", "setNeedLoadingView", "(Z)V", "selfLoadingView", "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;", "delegateType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "getDelegateType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "delegateType$delegate", "isMargin", "needAutoLoad", "getLayout", "", "getItemLayout", "bindDataToView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "needDefaultBackground", "canLoad", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "refreshData", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "pageSize", "showLoading", "showContent", "showEmpty", "res1", "res2", "onClickListener", "Landroid/view/View$OnClickListener;", "showNetWorkError", "showError", "errorMsg", "", "sendCancelAllOrderAction", "symbol", "initUI", "initVM", "initPageState", "startCollectData", "Lkotlinx/coroutines/Job;", "startCollectOrderOperatorEvent", "consumeCancelOrderResult", "isSuccess", "isNeedRefresh", "toastResId", "(ZZLjava/lang/Integer;)V", "updateGuideDepositLayout", "needGuideDeposit", "quoteBalanceDisplayStr", "", FirebaseAnalytics.Param.CURRENCY, "quoteBalance", "Ljava/math/BigDecimal;", "showGuideLayout", "showGuideLayout$TradeCoreBizLib_googleRelease", "showSpotGuideLayout", "showMarginGuideLayout", "showMarginTradeGuideLayout", "availableBalanceDisplayStr", "findTradeCoreFragment", "Lcom/kubi/core/biz/BaseTradeCoreFragment;", "Landroidx/fragment/app/Fragment;", "showMarginDepositGuideLayout", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBottomOrderListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomOrderListFragment.kt\ncom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,560:1\n106#2,15:561\n106#2,15:576\n147#3,16:591\n1#4:607\n183#5,2:608\n46#6,14:610\n*S KotlinDebug\n*F\n+ 1 BottomOrderListFragment.kt\ncom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment\n*L\n77#1:561,15\n79#1:576,15\n83#1:591,16\n93#1:608,2\n136#1:610,14\n*E\n"})
public final class BottomOrderListFragment extends BasePagingFragment<OrderItem> {

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20229Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f20230a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final InterfaceC24293a f20231b0;

    /* JADX INFO: renamed from: c0 */
    @NotNull
    public final Lazy f20232c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final Lazy f20233d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final Lazy f20234e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f20235f0;

    /* JADX INFO: renamed from: g0 */
    @Nullable
    public WrapperLoadingView f20236g0;

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public final Lazy f20237h0;

    /* JADX INFO: renamed from: j0 */
    public static final /* synthetic */ KProperty<Object>[] f20228j0 = {Reflection.property1(new PropertyReference1Impl(BottomOrderListFragment.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/FragmentCoreDelegationTodoTradeBinding;", 0))};

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f20227i0 = new Companion(null);

    /* JADX INFO: compiled from: BottomOrderListFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/bottomtab/order/child/BottomOrderListFragment;", "type", "Lcom/kubi/core/base/order/data/OrderLevelType;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BottomOrderListFragment newInstance(@NotNull OrderLevelType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            BottomOrderListFragment bottomOrderListFragment = new BottomOrderListFragment();
            bottomOrderListFragment.setArguments(new C27051h().m66724h("data", type.getParam()).m66717a());
            return bottomOrderListFragment;
        }
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: B3 */
    public boolean mo21464B3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: C3 */
    public boolean mo15903C3() {
        return false;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        ConstraintLayout root;
        C45377d0 c45377d0M21476o4;
        ConstraintLayout root2;
        WrapperLoadingView wrapperLoadingView;
        WrapperLoadingView wrapperLoadingView2 = this.f20236g0;
        if (wrapperLoadingView2 != null) {
            wrapperLoadingView2.showContent();
        }
        C45375c0 c45375c0M21475n4 = m21475n4();
        if (c45375c0M21475n4 != null && (root = c45375c0M21475n4.getRoot()) != null && !ViewExtKt.m66581l(root) && (c45377d0M21476o4 = m21476o4()) != null && (root2 = c45377d0M21476o4.getRoot()) != null && !ViewExtKt.m66581l(root2) && (wrapperLoadingView = this.f20236g0) != null) {
            wrapperLoadingView.showEmpty(R$string.no_order, R$drawable.ic2_common_empty, (View.OnClickListener) null);
        }
        m21474l4().m21415F(new BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable(false, m21459m4()));
        DurationTrackerHelper.f21018a.m22869b();
    }

    /* JADX INFO: renamed from: w4 */
    public final boolean m21481w4() {
        return Intrinsics.areEqual(C46755e.m103018c(this, null, 1, null).getF97159i(), TradeAccountType.Margin.INSTANCE);
    }

    /* JADX INFO: renamed from: A4 */
    public static final Unit m21424A4(String str, BottomOrderListFragment bottomOrderListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DialogHelper dialogHelper = DialogHelper.f21241a;
        InterfaceC0239a f97158h = bottomOrderListFragment.m21474l4().getF20069V().getF97158h();
        FragmentManager childFragmentManager = bottomOrderListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogHelper.m23322d(str, f97158h, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B4 */
    public static final Unit m21425B4(BottomOrderListFragment bottomOrderListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = bottomOrderListFragment.getParentFragment();
        AbsTradeBaseBizFragment absTradeBaseBizFragment = parentFragment instanceof AbsTradeBaseBizFragment ? (AbsTradeBaseBizFragment) parentFragment : null;
        if (absTradeBaseBizFragment != null) {
            absTradeBaseBizFragment.m21014E3(new C45795d(MoreDialogSectionTab.b.f20521a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E4 */
    public static final Unit m21426E4(BottomOrderListFragment bottomOrderListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BaseTradeCoreFragment baseTradeCoreFragmentM21472j4 = bottomOrderListFragment.m21472j4(bottomOrderListFragment);
        if (baseTradeCoreFragmentM21472j4 != null) {
            baseTradeCoreFragmentM21472j4.m21236H3();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F4 */
    public static final void m21427F4(BottomOrderListFragment bottomOrderListFragment, View view) {
        C45377d0 c45377d0;
        ConstraintLayout root;
        C45375c0 c45375c0;
        ConstraintLayout root2;
        WrapperLoadingView wrapperLoadingView = bottomOrderListFragment.f20236g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        C45407t c45407tM21473k4 = bottomOrderListFragment.m21473k4();
        if (c45407tM21473k4 != null && (c45375c0 = c45407tM21473k4.f102340b) != null && (root2 = c45375c0.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C45407t c45407tM21473k5 = bottomOrderListFragment.m21473k4();
        if (c45407tM21473k5 != null && (c45377d0 = c45407tM21473k5.f102341c) != null && (root = c45377d0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        bottomOrderListFragment.mo15906F3();
    }

    /* JADX INFO: renamed from: H4 */
    public static final Unit m21429H4(String str, BottomOrderListFragment bottomOrderListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DialogHelper dialogHelper = DialogHelper.f21241a;
        InterfaceC0239a f97158h = bottomOrderListFragment.m21474l4().getF20069V().getF97158h();
        FragmentManager childFragmentManager = bottomOrderListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogHelper.m23322d(str, f97158h, childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I4 */
    public static final Unit m21431I4(BottomOrderListFragment bottomOrderListFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Fragment parentFragment = bottomOrderListFragment.getParentFragment();
        AbsTradeBaseBizFragment absTradeBaseBizFragment = parentFragment instanceof AbsTradeBaseBizFragment ? (AbsTradeBaseBizFragment) parentFragment : null;
        if (absTradeBaseBizFragment != null) {
            absTradeBaseBizFragment.m21014E3(new C45795d(MoreDialogSectionTab.b.f20521a));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M4 */
    public static final Fragment m21438M4(Fragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getParentFragment();
    }

    /* JADX INFO: renamed from: f4 */
    public static final Unit m21456f4(BottomOrderListFragment bottomOrderListFragment, InterfaceC41007k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ("unified_spot_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(unified_spot_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", C33789m5.f70921k);
            C45290a.f101823a.m100101b("unified_spot_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        bottomOrderListFragment.showDialogLoading();
        bottomOrderListFragment.m21478p4().m21503p(new OrderListOperatorContract$UiIntent.CancelOrder(it.getOrderId(), it.getSymbol()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public final OrderLevelType m21459m4() {
        return (OrderLevelType) this.f20237h0.getValue();
    }

    /* JADX INFO: renamed from: q4 */
    private final ShareSymbolBizVM m21460q4() {
        return (ShareSymbolBizVM) this.f20233d0.getValue();
    }

    /* JADX INFO: renamed from: u4 */
    private final void m21463u4() {
        WrapperLoadingView wrapperLoadingViewInjectView = WrapperLoadingView.injectView(this.f46496X);
        this.f20236g0 = wrapperLoadingViewInjectView;
        if (wrapperLoadingViewInjectView != null) {
            LoadingViewUtils.f48255a.m58510c(wrapperLoadingViewInjectView);
        }
        this.f46496X.setEnabled(false);
        this.f46496X.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: F3 */
    public void mo15906F3() {
        if (!IUserService.a.get().c()) {
            showEmpty();
        } else {
            super.mo15906F3();
            m21474l4().m21415F(BottomOrderTabsContract$UiIntent.RefreshData.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: N4 */
    public final void m21469N4(boolean z11, CharSequence charSequence, String str, BigDecimal bigDecimal) {
        ConstraintLayout root;
        ConstraintLayout root2;
        if (z11) {
            m21483y4(charSequence, str, bigDecimal);
            return;
        }
        C45375c0 c45375c0M21475n4 = m21475n4();
        if (c45375c0M21475n4 != null && (root2 = c45375c0M21475n4.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C45377d0 c45377d0M21476o4 = m21476o4();
        if (c45377d0M21476o4 == null || (root = c45377d0M21476o4.getRoot()) == null) {
            return;
        }
        ViewExtKt.m66577h(root);
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_core_delegation_todo_trade;
    }

    @Override // com.kubi.sdk.BaseFragment
    /* JADX INFO: renamed from: getNeedLoadingView, reason: from getter */
    public boolean getF46760W() {
        return this.f20235f0;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m21471h4(boolean z11, boolean z12, Integer num) {
        if (z11) {
            BeepHelper.m23642f("beep_revoke", R$raw.revoke);
            ToastCompat.m66437C(R$string.cancel_order_ok);
            C43841b.m96557d("unified_spot_cancel_order", "show_toast", null, 4, null);
        } else {
            C43841b.m96554a("unified_spot_cancel_order", "show_toast");
        }
        if (z12) {
            mo15906F3();
        } else {
            C43841b.m96557d("unified_spot_cancel_order", "page_load_end", null, 4, null);
        }
        if (num != null) {
            ToastCompat.m66437C(num.intValue());
            C43841b.m96557d("unified_spot_cancel_order", "show_toast", null, 4, null);
        }
        C43841b.m96557d("unified_spot_cancel_order", "page_load_end", null, 4, null);
    }

    /* JADX INFO: renamed from: k4 */
    public final C45407t m21473k4() {
        return (C45407t) this.f20231b0.getValue(this, f20228j0[0]);
    }

    /* JADX INFO: renamed from: l4 */
    public final BottomOrderTabsSharedVM m21474l4() {
        return (BottomOrderTabsSharedVM) this.f20230a0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: n4 */
    public final C45375c0 m21475n4() {
        return (C45375c0) this.f20232c0.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public final C45377d0 m21476o4() {
        return (C45377d0) this.f20234e0.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21463u4();
        m21479t4();
        m21480v4();
        m21433J4();
        m21468K4();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return IUserService.a.get().c();
    }

    /* JADX INFO: renamed from: p4 */
    public final OrderListOperatorVM m21478p4() {
        return (OrderListOperatorVM) this.f20229Z.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    public void setNeedLoadingView(boolean z11) {
        this.f20235f0 = z11;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        WrapperLoadingView wrapperLoadingView = this.f20236g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
        m21474l4().m21415F(new BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable(true, m21459m4()));
        DurationTrackerHelper.f21018a.m22869b();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showLoading() {
        C45377d0 c45377d0;
        ConstraintLayout root;
        C45375c0 c45375c0;
        ConstraintLayout root2;
        WrapperLoadingView wrapperLoadingView = this.f20236g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showLoading();
        }
        C45407t c45407tM21473k4 = m21473k4();
        if (c45407tM21473k4 != null && (c45375c0 = c45407tM21473k4.f102340b) != null && (root2 = c45375c0.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C45407t c45407tM21473k5 = m21473k4();
        if (c45407tM21473k5 != null && (c45377d0 = c45407tM21473k5.f102341c) != null && (root = c45377d0.getRoot()) != null) {
            ViewExtKt.m66577h(root);
        }
        m21474l4().m21415F(new BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable(false, m21459m4()));
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showNetWorkError() {
        WrapperLoadingView wrapperLoadingView = this.f20236g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showEmpty(R$string.network_error, R$drawable.ic2_common_network_error, new View.OnClickListener() { // from class: com.kubi.core.biz.bottomtab.order.child.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomOrderListFragment.m21427F4(this.f20251b, view);
                }
            });
        }
        m21474l4().m21415F(new BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable(false, m21459m4()));
        DurationTrackerHelper.f21018a.m22868a();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.kucoin_item_delegation_view_single;
    }

    /* JADX INFO: renamed from: z4 */
    public final void m21484z4(CharSequence charSequence, final String str) {
        ConstraintLayout root;
        ConstraintLayout root2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        if (charSequence == null) {
            charSequence = getString(R$string.stub);
            Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
        }
        C45375c0 c45375c0M21475n4 = m21475n4();
        if (c45375c0M21475n4 != null && (baseTextView6 = c45375c0M21475n4.f102035c) != null) {
            baseTextView6.setText(getStringRes(R$string.kc_trade_brand_opt_available, charSequence));
        }
        C45375c0 c45375c0M21475n5 = m21475n4();
        if (c45375c0M21475n5 != null && (baseTextView5 = c45375c0M21475n5.f102036d) != null) {
            ViewExtKt.m66594y(baseTextView5);
        }
        C45375c0 c45375c0M21475n6 = m21475n4();
        if (c45375c0M21475n6 != null && (baseTextView4 = c45375c0M21475n6.f102036d) != null) {
            ViewExtKt.m66575f(baseTextView4, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderListFragment.m21424A4(str, this, (View) obj);
                }
            });
        }
        C45375c0 c45375c0M21475n7 = m21475n4();
        if (c45375c0M21475n7 != null && (baseTextView3 = c45375c0M21475n7.f102037e) != null) {
            baseTextView3.setText(getString(R$string.kc_trade_brand_opt_margin_tutorial));
        }
        C45375c0 c45375c0M21475n8 = m21475n4();
        if (c45375c0M21475n8 != null && (baseTextView2 = c45375c0M21475n8.f102037e) != null) {
            ViewExtKt.m66575f(baseTextView2, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.k
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderListFragment.m21425B4(this.f20249b, (View) obj);
                }
            });
        }
        C45375c0 c45375c0M21475n9 = m21475n4();
        if (c45375c0M21475n9 != null && (baseTextView = c45375c0M21475n9.f102037e) != null) {
            C0296a.m1042d(baseTextView, IMarginService.f32724a.get().mo37927a());
        }
        C45375c0 c45375c0M21475n10 = m21475n4();
        if (c45375c0M21475n10 != null && (root2 = c45375c0M21475n10.getRoot()) != null) {
            C27046k.m66685H(root2);
        }
        C45377d0 c45377d0M21476o4 = m21476o4();
        if (c45377d0M21476o4 == null || (root = c45377d0M21476o4.getRoot()) == null) {
            return;
        }
        ViewExtKt.m66577h(root);
    }

    public BottomOrderListFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Fragment invoke() {
                return this;
            }

            {
                super(0);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$2
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
        this.f20229Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OrderListOperatorVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$5
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
        final Function0 function2 = new Function0() { // from class: com.kubi.core.biz.bottomtab.order.child.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderListFragment.m21457g4(this.f20240b);
            }
        };
        final Lazy lazy2 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function2.invoke();
            }

            {
                super(0);
            }
        });
        this.f20230a0 = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BottomOrderTabsSharedVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function3 = function1;
                if (function3 != null && (creationExtras = (CreationExtras) function3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM103549viewModels$lambda1 = FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM103549viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM103549viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.f20231b0 = C45681e.m100799e(this, new Function1<BottomOrderListFragment, C45407t>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewBindingFragment$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45407t invoke(@NotNull BottomOrderListFragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                return C45407t.m100351a(this.this$0.getContentView());
            }

            {
                super(1);
            }
        }, new Function1<C45407t, Unit>() { // from class: com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$special$$inlined$viewBindingFragment$1
            public final void invoke(@NotNull C45407t it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // p852kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C45407t c45407t) {
                invoke(c45407t);
                return Unit.INSTANCE;
            }
        });
        this.f20232c0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.bottomtab.order.child.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderListFragment.m21461r4(this.f20243b);
            }
        });
        this.f20233d0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.bottomtab.order.child.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderListFragment.m21436L4(this.f20244b);
            }
        });
        this.f20234e0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.bottomtab.order.child.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderListFragment.m21462s4(this.f20245b);
            }
        });
        this.f20237h0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.bottomtab.order.child.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BottomOrderListFragment.m21458i4(this.f20246b);
            }
        });
    }

    /* JADX INFO: renamed from: J4 */
    private final InterfaceC41775x1 m21433J4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BottomOrderListFragment$startCollectData$1(this, null));
    }

    /* JADX INFO: renamed from: L4 */
    public static final ShareSymbolBizVM m21436L4(BottomOrderListFragment bottomOrderListFragment) {
        Object next;
        BaseTradeCoreFragment baseTradeCoreFragment;
        ShareSymbolBizVM shareSymbolBizVMM21244w3;
        Iterator it = SequencesKt.generateSequence(bottomOrderListFragment.requireParentFragment(), (Function1<? super Fragment, ? extends Fragment>) new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomOrderListFragment.m21438M4((Fragment) obj);
            }
        }).iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!(((Fragment) next) instanceof BaseTradeCoreFragment));
        if (next instanceof BaseTradeCoreFragment) {
            baseTradeCoreFragment = (BaseTradeCoreFragment) next;
        } else {
            baseTradeCoreFragment = null;
        }
        if (baseTradeCoreFragment != null && (shareSymbolBizVMM21244w3 = baseTradeCoreFragment.m21244w3()) != null) {
            return shareSymbolBizVMM21244w3;
        }
        return C12247g.m22750b(bottomOrderListFragment, null, 2, null);
    }

    /* JADX INFO: renamed from: g4 */
    public static final ViewModelStoreOwner m21457g4(BottomOrderListFragment bottomOrderListFragment) {
        Fragment fragmentRequireParentFragment = bottomOrderListFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: renamed from: i4 */
    public static final OrderLevelType m21458i4(BottomOrderListFragment bottomOrderListFragment) {
        String string;
        Bundle arguments = bottomOrderListFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C11623a.m21086e(string, OrderLevelType.Normal.INSTANCE);
    }

    /* JADX INFO: renamed from: r4 */
    public static final C45375c0 m21461r4(BottomOrderListFragment bottomOrderListFragment) {
        C45375c0 c45375c0;
        C45407t c45407tM21473k4 = bottomOrderListFragment.m21473k4();
        if (c45407tM21473k4 != null && (c45375c0 = c45407tM21473k4.f102340b) != null) {
            return C45375c0.m100280a(c45375c0.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: s4 */
    public static final C45377d0 m21462s4(BottomOrderListFragment bottomOrderListFragment) {
        C45377d0 c45377d0;
        C45407t c45407tM21473k4 = bottomOrderListFragment.m21473k4();
        if (c45407tM21473k4 != null && (c45377d0 = c45407tM21473k4.f102341c) != null) {
            return C45377d0.m100284a(c45377d0.getRoot());
        }
        return null;
    }

    /* JADX INFO: renamed from: C4 */
    public final void m21465C4(CharSequence charSequence, String str, BigDecimal bigDecimal) {
        Double dValueOf;
        SymbolInfoEntity symbolInfo = m21460q4().m22740t().getSymbolInfo();
        BigDecimal bigDecimalM66656p = C27039d.m66656p(bigDecimal);
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(C27041f.m66668h(str))));
        if (symbolInfo != null) {
            dValueOf = Double.valueOf(symbolInfo.getQuoteMinSize());
        } else {
            dValueOf = null;
        }
        if (bigDecimalM66656p.compareTo((BigDecimal) ComparisonsKt.maxOf(bigDecimal2, new BigDecimal(String.valueOf(C27039d.m66646f(dValueOf))))) >= 0) {
            m21466D4(charSequence, str);
        } else {
            m21484z4(charSequence, str);
        }
    }

    /* JADX INFO: renamed from: D4 */
    public final void m21466D4(CharSequence charSequence, String str) {
        ConstraintLayout root;
        ConstraintLayout root2;
        KcPrimaryButton kcPrimaryButton;
        BaseTextView baseTextView;
        Double dValueOf;
        BaseTextView baseTextView2;
        ImageView imageView;
        ImageView imageView2;
        C45377d0 c45377d0M21476o4 = m21476o4();
        if (c45377d0M21476o4 != null && (imageView2 = c45377d0M21476o4.f102042c) != null) {
            imageView2.setLayoutDirection(0);
        }
        C45377d0 c45377d0M21476o5 = m21476o4();
        if (c45377d0M21476o5 != null && (imageView = c45377d0M21476o5.f102042c) != null) {
            imageView.setImageResource(R$mipmap.kc_margin_trade_guide_icon);
        }
        C45377d0 c45377d0M21476o6 = m21476o4();
        if (c45377d0M21476o6 != null && (baseTextView2 = c45377d0M21476o6.f102043d) != null) {
            int i11 = R$string.kc_trade_brand_opt_available;
            if (charSequence == null) {
                charSequence = getString(R$string.stub);
                Intrinsics.checkNotNullExpressionValue(charSequence, "getString(...)");
            }
            baseTextView2.setText(getStringRes(i11, charSequence));
        }
        SymbolInfoEntity symbolInfo = m21460q4().m22740t().getSymbolInfo();
        C45377d0 c45377d0M21476o7 = m21476o4();
        if (c45377d0M21476o7 != null && (baseTextView = c45377d0M21476o7.f102044e) != null) {
            int i12 = R$string.kc_trade_brand_opt_welcome_to_margin_trade;
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(C37890n.f85269a.m85618z(C27041f.m66668h(str))));
            if (symbolInfo != null) {
                dValueOf = Double.valueOf(symbolInfo.getQuoteMinSize());
            } else {
                dValueOf = null;
            }
            C12464c.m23404a(baseTextView, i12, C42828b.m93906g(C6447a.m11724a((BigDecimal) ComparisonsKt.maxOf(bigDecimal, new BigDecimal(String.valueOf(C27039d.m66646f(dValueOf))))).toPlainString(), C27041f.m66668h(str), true, false, 4, null), ResourcesCompat.getFont(baseTextView.getContext(), R$font.medium), ContextCompat.getColor(baseTextView.getContext(), R$color.c_text));
        }
        C45377d0 c45377d0M21476o8 = m21476o4();
        if (c45377d0M21476o8 != null && (kcPrimaryButton = c45377d0M21476o8.f102041b) != null) {
            ViewExtKt.m66575f(kcPrimaryButton, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.l
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderListFragment.m21426E4(this.f20250b, (View) obj);
                }
            });
        }
        C45375c0 c45375c0M21475n4 = m21475n4();
        if (c45375c0M21475n4 != null && (root2 = c45375c0M21475n4.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C45377d0 c45377d0M21476o9 = m21476o4();
        if (c45377d0M21476o9 != null && (root = c45377d0M21476o9.getRoot()) != null) {
            C27046k.m66685H(root);
        }
    }

    /* JADX INFO: renamed from: G4 */
    public final void m21467G4(CharSequence charSequence, final String str) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        ConstraintLayout root;
        ConstraintLayout root2;
        C45377d0 c45377d0M21476o4 = m21476o4();
        if (c45377d0M21476o4 != null && (root2 = c45377d0M21476o4.getRoot()) != null) {
            ViewExtKt.m66577h(root2);
        }
        C45375c0 c45375c0M21475n4 = m21475n4();
        if (c45375c0M21475n4 != null && (root = c45375c0M21475n4.getRoot()) != null) {
            C27046k.m66685H(root);
        }
        C45375c0 c45375c0M21475n5 = m21475n4();
        if (c45375c0M21475n5 != null && (baseTextView5 = c45375c0M21475n5.f102035c) != null) {
            baseTextView5.setText(getStringRes(R$string.kc_trade_brand_opt_available, charSequence));
        }
        C45375c0 c45375c0M21475n6 = m21475n4();
        if (c45375c0M21475n6 != null && (baseTextView4 = c45375c0M21475n6.f102036d) != null) {
            ViewExtKt.m66575f(baseTextView4, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.n
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderListFragment.m21429H4(str, this, (View) obj);
                }
            });
        }
        C45375c0 c45375c0M21475n7 = m21475n4();
        if (c45375c0M21475n7 != null && (baseTextView3 = c45375c0M21475n7.f102037e) != null) {
            C0296a.m1042d(baseTextView3, ISpotCommonService.f49644a.get().mo59957a());
        }
        C45375c0 c45375c0M21475n8 = m21475n4();
        if (c45375c0M21475n8 != null && (baseTextView2 = c45375c0M21475n8.f102037e) != null) {
            baseTextView2.setText(getString(R$string.kc_trade_brand_opt_spo_tutorial));
        }
        C45375c0 c45375c0M21475n9 = m21475n4();
        if (c45375c0M21475n9 != null && (baseTextView = c45375c0M21475n9.f102037e) != null) {
            ViewExtKt.m66575f(baseTextView, new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BottomOrderListFragment.m21431I4(this.f20241b, (View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K4 */
    public final InterfaceC41775x1 m21468K4() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new BottomOrderListFragment$startCollectOrderOperatorEvent$1(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: e4, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable OrderItem orderItem) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        C41006j.f91144a.mo21491b(context, baseViewHolder, orderItem, ((UiState) m21474l4().getState()).getSymbol(), true, m21481w4(), new Function1() { // from class: com.kubi.core.biz.bottomtab.order.child.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BottomOrderListFragment.m21456f4(this.f20242b, (InterfaceC41007k) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j4 */
    public final BaseTradeCoreFragment m21472j4(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        while (parentFragment != null && !(parentFragment instanceof BaseTradeCoreFragment)) {
            parentFragment = parentFragment.getParentFragment();
        }
        return (BaseTradeCoreFragment) parentFragment;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OrderItem>> mo16440r3(int i11, int i12) {
        IOnlyCurrentSymbolState iOnlyCurrentSymbolState;
        ActivityResultCaller parentFragment = getParentFragment();
        if (parentFragment instanceof IOnlyCurrentSymbolState) {
            iOnlyCurrentSymbolState = (IOnlyCurrentSymbolState) parentFragment;
        } else {
            iOnlyCurrentSymbolState = null;
        }
        boolean z11 = false;
        if (iOnlyCurrentSymbolState != null && iOnlyCurrentSymbolState.mo21384X1()) {
            z11 = true;
        }
        return m21474l4().m21412C(z11, i11, i12, m21459m4());
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showError(@Nullable String errorMsg) {
        super.showError(errorMsg);
        DurationTrackerHelper.f21018a.m22868a();
    }

    /* JADX INFO: renamed from: t4 */
    public final void m21479t4() {
        if (mo21477p3()) {
            showLoading();
        } else {
            showEmpty();
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final void m21480v4() {
        m21478p4().m21502o(C46755e.m103018c(this, null, 1, null).mo96893b());
    }

    /* JADX INFO: renamed from: x4 */
    public final void m21482x4(@Nullable String str) {
        showDialogLoading();
        m21478p4().m21503p(new OrderListOperatorContract$UiIntent.CancelAllOrder(m21459m4(), str));
    }

    @NotNull
    /* JADX INFO: renamed from: y4 */
    public final InterfaceC41775x1 m21483y4(@Nullable CharSequence charSequence, @Nullable String str, @Nullable BigDecimal bigDecimal) {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new BottomOrderListFragment$showGuideLayout$1(this, charSequence, str, bigDecimal, null));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty(int res1, int res2, @Nullable View.OnClickListener onClickListener) {
        WrapperLoadingView wrapperLoadingView = this.f20236g0;
        if (wrapperLoadingView != null) {
            wrapperLoadingView.showContent();
        }
        m21474l4().m21415F(new BottomOrderTabsContract$UiIntent.SupportCancelAllBtnEnable(false, m21459m4()));
        DurationTrackerHelper.f21018a.m22869b();
    }
}
