package com.kubi.core.biz.order.record.active;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.base.TradeAccountType;
import com.kubi.core.base.order.data.C11623a;
import com.kubi.core.base.order.data.OrderItem;
import com.kubi.core.base.order.data.OrderLevelType;
import com.kubi.core.biz.bottomtab.order.child.DelegationCustomItemBind;
import com.kubi.core.spot.business.businessTrack.DurationTrackerHelper;
import com.kubi.data.BeepHelper;
import com.kubi.monitor.EventParametersBuilder;
import com.kubi.resources.widget.StrictDividerItemDecoration;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.sdk.base.p113ui.BasePagingFragment;
import com.kubi.sdk.util.LoadingViewUtils;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.tradecorebiz.R$raw;
import com.kubi.tradecorebiz.R$string;
import com.kubi.user.api.IUserService;
import com.kubi.utils.C27051h;
import com.kubi.utils.ToastCompat;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p401kd.InterfaceC41007k;
import p569qq.C43841b;
import p671uq.C45290a;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import td.C44931a;
import v30.C45389j0;

/* JADX INFO: compiled from: OpenOrdersRecordFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u001aH\u0014J\b\u0010\u001e\u001a\u00020\u001aH\u0014J\u001c\u0010\u001f\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0014J\b\u0010&\u001a\u00020$H\u0016J\b\u0010'\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020$H\u0014J\b\u0010*\u001a\u00020\u0011H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\u0012\u0010,\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0006\u0010/\u001a\u00020\u001aJ\u0006\u00100\u001a\u00020\u0011J\b\u00101\u001a\u000202H\u0002J'\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020$2\u0006\u00105\u001a\u00020$2\b\u00106\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0002\u00107J\b\u00108\u001a\u00020\u0011H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006:"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment;", "Lcom/kubi/sdk/base/ui/BasePagingFragment;", "Lcom/kubi/core/base/order/data/ActiveOrdersData$OrderItem;", "<init>", "()V", "openOrdersRecordVM", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordVM;", "getOpenOrdersRecordVM", "()Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordVM;", "openOrdersRecordVM$delegate", "Lkotlin/Lazy;", "delegateType", "Lcom/kubi/core/base/order/data/OrderLevelType;", "getDelegateType", "()Lcom/kubi/core/base/order/data/OrderLevelType;", "delegateType$delegate", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "getDataLoader", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "pageIndex", "", "pageSize", "showContent", "getLayout", "getItemLayout", "bindDataToView", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "canLoad", "", "needDefaultBackground", "needAutoLoad", "onLoad", "onNetworkFinished", "success", "showNetWorkError", "showEmpty", "showError", "errorMsg", "", "orderSize", "cancelAllOrders", "startCollectEventFlow", "Lkotlinx/coroutines/Job;", "consumeCancelOrderResult", "isSuccess", "isNeedRefresh", "toastResId", "(ZZLjava/lang/Integer;)V", "updateCancelAllBtnVisible", "Companion", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOpenOrdersRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenOrdersRecordFragment.kt\ncom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n*L\n1#1,225:1\n106#2,15:226\n46#3,14:241\n46#3,14:255\n*S KotlinDebug\n*F\n+ 1 OpenOrdersRecordFragment.kt\ncom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment\n*L\n42#1:226,15\n153#1:241,14\n94#1:255,14\n*E\n"})
public final class OpenOrdersRecordFragment extends BasePagingFragment<OrderItem> {

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public static final Companion f20577b0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final Lazy f20578Z;

    /* JADX INFO: renamed from: a0 */
    @NotNull
    public final Lazy f20579a0;

    /* JADX INFO: compiled from: OpenOrdersRecordFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordFragment;", "type", "Lcom/kubi/core/base/order/data/OrderLevelType;", "symbol", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final OpenOrdersRecordFragment newInstance(@NotNull OrderLevelType type, @Nullable String symbol) {
            Intrinsics.checkNotNullParameter(type, "type");
            OpenOrdersRecordFragment openOrdersRecordFragment = new OpenOrdersRecordFragment();
            openOrdersRecordFragment.setArguments(new C27051h().m66724h("data", type.getParam()).m66724h("symbol", symbol).m66717a());
            return openOrdersRecordFragment;
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

    /* JADX INFO: renamed from: N3 */
    public static final Unit m22108N3(OpenOrdersRecordFragment openOrdersRecordFragment, InterfaceC41007k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ("unified_spot_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(unified_spot_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", C33789m5.f70921k);
            C45290a.f101823a.m100101b("unified_spot_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        openOrdersRecordFragment.showDialogLoading();
        openOrdersRecordFragment.m22116S3().m22136A(new OpenOrdersRecordContract$UiIntent.CancelOrder(it.getOrderId(), it.getSymbol()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public final void m22109P3(boolean z11, boolean z12, Integer num) {
        if (z11) {
            BeepHelper.m23642f("beep_revoke", R$raw.revoke);
            ToastCompat.m66437C(R$string.cancel_order_ok);
            C43841b.m96557d("unified_spot_cancel_order", "show_toast", null, 4, null);
        }
        if (num != null) {
            ToastCompat.m66437C(num.intValue());
            C43841b.m96557d("unified_spot_cancel_order", "show_toast", null, 4, null);
        }
        if (z12) {
            mo15906F3();
        } else {
            C43841b.m96557d("unified_spot_cancel_order", "page_load_end", null, 4, null);
        }
        if (z11) {
            return;
        }
        C43841b.m96555b("unified_spot_cancel_order", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: M3, reason: merged with bridge method [inline-methods] */
    public void mo16439o3(@Nullable BaseViewHolder baseViewHolder, @Nullable OrderItem orderItem) {
        View view;
        RecordOrderItemUiBind recordOrderItemUiBind = RecordOrderItemUiBind.f20596a;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        DelegationCustomItemBind.m21490a(recordOrderItemUiBind, contextRequireContext, baseViewHolder, orderItem, ((UiState) m22116S3().getState()).getSymbol(), false, Intrinsics.areEqual(m22116S3().getF20070W(), TradeAccountType.Margin.INSTANCE), new Function1() { // from class: com.kubi.core.biz.order.record.active.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OpenOrdersRecordFragment.m22108N3(this.f20586b, (InterfaceC41007k) obj);
            }
        }, 16, null);
        if (baseViewHolder == null || (view = baseViewHolder.itemView) == null) {
            return;
        }
        C45389j0 c45389j0M100312a = C45389j0.m100312a(view);
        Intrinsics.checkNotNullExpressionValue(c45389j0M100312a, "bind(...)");
        if (Intrinsics.areEqual(m22115R3(), OrderLevelType.Advanced.INSTANCE)) {
            C44931a.f101319a.m99352b(c45389j0M100312a);
        } else {
            C44931a.f101319a.m99354d(c45389j0M100312a);
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final void m22114O3() {
        if (this.f46495W.getData().isEmpty()) {
            return;
        }
        if ("unified_spot_cancel_order".length() == 0 || "click_start_btn".length() == 0) {
            C44128b.m97270n("Monitor", "eventName(unified_spot_cancel_order) or pointName(click_start_btn) is null");
        } else {
            EventParametersBuilder eventParametersBuilderAcquire = EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42382c("type", TtmlNode.COMBINE_ALL);
            C45290a.f101823a.m100101b("unified_spot_cancel_order", "click_start_btn", "", eventParametersBuilderAcquire.m42380a());
        }
        showDialogLoading();
        m22116S3().m22136A(new OpenOrdersRecordContract$UiIntent.CancelAllOrder(m22115R3()));
    }

    @NotNull
    /* JADX INFO: renamed from: R3 */
    public final OrderLevelType m22115R3() {
        return (OrderLevelType) this.f20579a0.getValue();
    }

    /* JADX INFO: renamed from: S3 */
    public final OpenOrdersRecordVM m22116S3() {
        return (OpenOrdersRecordVM) this.f20578Z.getValue();
    }

    /* JADX INFO: renamed from: U3 */
    public final int m22117U3() {
        List data;
        BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter = this.f46495W;
        if (baseQuickAdapter == 0 || (data = baseQuickAdapter.getData()) == null) {
            return 0;
        }
        return data.size();
    }

    /* JADX INFO: renamed from: W3 */
    public final void m22119W3() {
        BaseQuickAdapter<T, BaseViewHolder> baseQuickAdapter = this.f46495W;
        m22116S3().m22136A(new OpenOrdersRecordContract$UiIntent.UpdateOrderEmptyStatus((baseQuickAdapter != 0 ? baseQuickAdapter.getData() : null) == null || this.f46495W.getData().isEmpty(), m22115R3()));
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.fragment_delegation_open_orders;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LoadingViewUtils.f48255a.m58509b(this);
        this.f46496X.getRecyclerView().addItemDecoration(new StrictDividerItemDecoration(getColorRes(R$color.emphasis8), C5275i0.m6236a(0.5f), C5275i0.m6236a(16.0f)));
        m22118V3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: p3 */
    public boolean mo21477p3() {
        return IUserService.a.get().c();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showEmpty() {
        showEmpty(R$string.no_order, R$drawable.ic2_common_empty);
        m22119W3();
        DurationTrackerHelper.f21018a.m22868a();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: x3 */
    public int mo15925x3() {
        return R$layout.trade_core_item_delegation_view_single_list;
    }

    public OpenOrdersRecordFragment() {
        final Function0 function0 = new Function0() { // from class: com.kubi.core.biz.order.record.active.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenOrdersRecordFragment.m22111T3(this.f20584b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$special$$inlined$viewModels$default$1
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
        this.f20578Z = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OpenOrdersRecordVM.class), new Function0<ViewModelStore>() { // from class: com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.core.biz.order.record.active.OpenOrdersRecordFragment$special$$inlined$viewModels$default$4
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
        this.f20579a0 = LazyKt.lazy(new Function0() { // from class: com.kubi.core.biz.order.record.active.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OpenOrdersRecordFragment.m22110Q3(this.f20585b);
            }
        });
    }

    /* JADX INFO: renamed from: Q3 */
    public static final OrderLevelType m22110Q3(OpenOrdersRecordFragment openOrdersRecordFragment) {
        String string;
        Bundle arguments = openOrdersRecordFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C11623a.m21086e(string, OrderLevelType.Normal.INSTANCE);
    }

    /* JADX INFO: renamed from: T3 */
    public static final ViewModelStoreOwner m22111T3(OpenOrdersRecordFragment openOrdersRecordFragment) {
        Fragment fragmentRequireParentFragment = openOrdersRecordFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    /* JADX INFO: renamed from: E3 */
    public void mo22112E3(boolean z11) {
        super.mo22112E3(z11);
        m22119W3();
        DurationTrackerHelper.f21018a.m22868a();
    }

    /* JADX INFO: renamed from: V3 */
    public final InterfaceC41775x1 m22118V3() {
        return LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new OpenOrdersRecordFragment$startCollectEventFlow$1(this, null));
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onLoad() {
        mo15906F3();
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment
    @Nullable
    /* JADX INFO: renamed from: r3 */
    public Observable<BasePageEntity<OrderItem>> mo16440r3(int i11, int i12) {
        return m22116S3().m22137w(i11, i12, m22115R3());
    }

    @Override // com.kubi.sdk.base.p113ui.BasePagingFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.base.p113ui.InterfaceC23686g
    public void showContent() {
        super.showContent();
        m22119W3();
        DurationTrackerHelper.f21018a.m22869b();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showError(@Nullable String errorMsg) {
        super.showError(errorMsg);
        DurationTrackerHelper.f21018a.m22868a();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public void showNetWorkError() {
        super.showNetWorkError();
        m22119W3();
        DurationTrackerHelper.f21018a.m22868a();
    }
}
