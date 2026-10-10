package com.kubi.futures.trade.welfare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kubi.futures.trade.welfare.vm.FuturesCouponViewModel;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareCouponItemEntity;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36867x1;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p729wl.C45875l0;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45681e;

/* JADX INFO: compiled from: WelfareCouponListFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001e\u0010\u001b\u001a\u00020\u00192\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dH\u0002J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006$"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/WelfareCouponListFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentCouponListBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentCouponListBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesCouponViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesCouponViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "handleFetchCouponCallback", "pair", "Lkotlin/Pair;", "", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponEntity;", "bindCoupons", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "showEmpty", "showContent", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWelfareCouponListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WelfareCouponListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareCouponListFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,121:1\n147#2,16:122\n220#3,5:138\n*S KotlinDebug\n*F\n+ 1 WelfareCouponListFragment.kt\ncom/kubi/futures/trade/welfare/WelfareCouponListFragment\n*L\n32#1:122,16\n36#1:138,5\n*E\n"})
public final class WelfareCouponListFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f24524W = {Reflection.property1(new PropertyReference1Impl(WelfareCouponListFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentCouponListBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24525U = C45681e.m100799e(this, new Function1<WelfareCouponListFragment, C36867x1>() { // from class: com.kubi.futures.trade.welfare.WelfareCouponListFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36867x1 invoke(@NotNull WelfareCouponListFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36867x1.m82600a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36867x1, Unit>() { // from class: com.kubi.futures.trade.welfare.WelfareCouponListFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36867x1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36867x1 c36867x1) {
            invoke(c36867x1);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f24526V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.x1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WelfareCouponListFragment.m28244u3(this.f24961b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.WelfareCouponListFragment$a */
    /* JADX INFO: compiled from: WelfareCouponListFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14188a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24527b;

        public C14188a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24527b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f24527b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24527b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m28243t3() {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C45875l0.f103336a.m101358z0(), null, null, null, null, null, null, 126, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final FuturesCouponViewModel m28244u3(WelfareCouponListFragment welfareCouponListFragment) {
        return (FuturesCouponViewModel) new ViewModelProvider(welfareCouponListFragment).get(FuturesCouponViewModel.class);
    }

    /* JADX INFO: renamed from: o3 */
    public final C36867x1 m28246o3() {
        return (C36867x1) this.f24525U.getValue(this, f24524W[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_coupon_list, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36867x1 c36867x1M28246o3 = m28246o3();
        if (c36867x1M28246o3 == null) {
            return;
        }
        c36867x1M28246o3.f81322b.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = c36867x1M28246o3.f81322b;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        recyclerView.setAdapter(new FuturesWelfareAdapter(childFragmentManager, false, null, null, 14, null));
        m28247p3().m28741e("EFFECTIVE", 1, 1000);
        m28247p3().m28742n().observe(getViewLifecycleOwner(), new C14188a(new Function1() { // from class: com.kubi.futures.trade.welfare.w1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WelfareCouponListFragment.m28242s3(this.f24958b, (Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p3 */
    public final FuturesCouponViewModel m28247p3() {
        return (FuturesCouponViewModel) this.f24526V.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public static final void m28241r3(WelfareCouponListFragment welfareCouponListFragment, View view) {
        welfareCouponListFragment.m28247p3().m28741e("EFFECTIVE", 1, 1000);
    }

    /* JADX INFO: renamed from: s3 */
    public static final Unit m28242s3(WelfareCouponListFragment welfareCouponListFragment, Pair pair) {
        Intrinsics.checkNotNull(pair);
        welfareCouponListFragment.m28248q3(pair);
        return Unit.INSTANCE;
    }

    private final void showContent() {
        C36867x1 c36867x1M28246o3 = m28246o3();
        if (c36867x1M28246o3 == null) {
            return;
        }
        LinearLayoutCompat root = c36867x1M28246o3.f81323c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewExtKt.m66577h(root);
        RecyclerView recyclerView = c36867x1M28246o3.f81322b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66685H(recyclerView);
    }

    private final void showEmpty() {
        C36867x1 c36867x1M28246o3 = m28246o3();
        if (c36867x1M28246o3 == null) {
            return;
        }
        LinearLayoutCompat root = c36867x1M28246o3.f81323c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66685H(root);
        RecyclerView recyclerView = c36867x1M28246o3.f81322b;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        C27046k.m66703r(recyclerView);
        KcPrimaryButton tvConfirm = c36867x1M28246o3.f81323c.f81341b;
        Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
        C27046k.m66711z(tvConfirm, 0L, new Function0() { // from class: com.kubi.futures.trade.welfare.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WelfareCouponListFragment.m28243t3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: n3 */
    public final void m28245n3(FuturesWelfareCouponEntity futuresWelfareCouponEntity) {
        C36867x1 c36867x1M28246o3 = m28246o3();
        if (c36867x1M28246o3 == null) {
            return;
        }
        List<FuturesWelfareCouponItemEntity> items = futuresWelfareCouponEntity.getItems();
        if (items == null) {
            items = CollectionsKt.emptyList();
        }
        showContentView();
        if (futuresWelfareCouponEntity.getCurrentPage() == 1 && items.isEmpty()) {
            showEmpty();
            return;
        }
        showContent();
        RecyclerView.Adapter adapter = c36867x1M28246o3.f81322b.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareAdapter");
        ((FuturesWelfareAdapter) adapter).m28634J(items);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m28248q3(Pair<Boolean, FuturesWelfareCouponEntity> pair) {
        int size = 0;
        if (pair.getFirst().booleanValue()) {
            BaseFragment.showLoadingView$default(this, 0, 0, 3, null);
            return;
        }
        if (pair.getSecond() == null) {
            BaseFragment.showFailView$default(this, 0, 0, new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.y1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WelfareCouponListFragment.m28241r3(this.f24963b, view);
                }
            }, 3, (Object) null);
            return;
        }
        FuturesWelfareCouponEntity second = pair.getSecond();
        Intrinsics.checkNotNull(second);
        FuturesWelfareCouponEntity futuresWelfareCouponEntity = second;
        List<FuturesWelfareCouponItemEntity> items = futuresWelfareCouponEntity.getItems();
        if (items != null) {
            size = items.size();
        }
        try {
            Fragment parentFragment = getParentFragment();
            Intrinsics.checkNotNull(parentFragment, "null cannot be cast to non-null type com.kubi.futures.trade.welfare.FuturesWelfareFragment");
            ((FuturesWelfareFragment) parentFragment).m28137K3(size);
        } catch (Exception e11) {
            C44128b.m97260d("WelfareCouponListFragment updateCouponList failed " + e11);
        }
        m28245n3(futuresWelfareCouponEntity);
    }
}
