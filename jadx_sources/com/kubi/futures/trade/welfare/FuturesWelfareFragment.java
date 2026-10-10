package com.kubi.futures.trade.welfare;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import bi.C4622n;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.event.api.C12572a;
import com.kubi.event.api.C12573b;
import com.kubi.futures.trade.welfare.history.WelfareHistoryFragment;
import com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel;
import com.kubi.kumex.R$id;
import com.kubi.kumex.R$layout;
import com.kubi.kumex.R$string;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialWithDrawPopupInfoEntity;
import com.kubi.resources.widget.flyco.SlidingTabLayout;
import com.kubi.resources.widget.rtlviewpager.RtlViewPager;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24252m0;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27103z;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import dm.C36802m2;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FuturesWelfareFragment.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J4\u0010#\u001a.\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&0%j\b\u0012\u0004\u0012\u00020&`'\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020(0%j\b\u0012\u0004\u0012\u00020(`'0$H\u0002J\u0018\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+H\u0003J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020+R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/FuturesWelfareFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "viewBinding", "Lcom/kubi/kumex/databinding/BkumexFragmentFuturesWelfareBinding;", "getViewBinding", "()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesWelfareBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "viewModel", "Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "getViewModel", "()Lcom/kubi/futures/trade/welfare/vm/FuturesTrialViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "availableTrial", "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialItemEntity;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "initObserver", "showWithdrawRiskDialog", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/kumex/data/platform/model/FuturesWelfareTrialWithDrawPopupInfoEntity;", "initAppBarScroll", "initViewPager", "createWelfareFragments", "Lkotlin/Pair;", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "", "updateTabLayoutTitle", "count", "", "id", "updateCouponList", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFuturesWelfareFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesWelfareFragment.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,222:1\n147#2,16:223\n76#3,7:239\n220#4,5:246\n*S KotlinDebug\n*F\n+ 1 FuturesWelfareFragment.kt\ncom/kubi/futures/trade/welfare/FuturesWelfareFragment\n*L\n50#1:223,16\n144#1:239,7\n54#1:246,5\n*E\n"})
public final class FuturesWelfareFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f24494W = {Reflection.property1(new PropertyReference1Impl(FuturesWelfareFragment.class, "viewBinding", "getViewBinding()Lcom/kubi/kumex/databinding/BkumexFragmentFuturesWelfareBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f24495U = C45681e.m100799e(this, new Function1<FuturesWelfareFragment, C36802m2>() { // from class: com.kubi.futures.trade.welfare.FuturesWelfareFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C36802m2 invoke(@NotNull FuturesWelfareFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C36802m2.m82465a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C36802m2, Unit>() { // from class: com.kubi.futures.trade.welfare.FuturesWelfareFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C36802m2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C36802m2 c36802m2) {
            invoke(c36802m2);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f24496V = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.trade.welfare.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FuturesWelfareFragment.m28122M3(this.f24868b);
        }
    });

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.FuturesWelfareFragment$a */
    /* JADX INFO: compiled from: FuturesWelfareFragment.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/futures/trade/welfare/FuturesWelfareFragment$initAppBarScroll$2", "Lcom/google/android/material/appbar/AppBarLayout$Behavior$DragCallback;", "canDrag", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14176a extends AppBarLayout.Behavior.DragCallback {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.FuturesWelfareFragment$b */
    /* JADX INFO: compiled from: FuturesWelfareFragment.kt */
    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14177b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f24497b;

        public C14177b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f24497b = function;
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
            return this.f24497b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f24497b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m28134y3(C36802m2 c36802m2, AppBarLayout appBarLayout, int i11) {
        float fAbs = 1 - Math.abs((i11 * 1.0f) / c36802m2.f80559b.getTotalScrollRange());
        c36802m2.f80566i.setAlpha(fAbs);
        c36802m2.f80563f.setAlpha(fAbs);
        c36802m2.f80568k.setAlpha(fAbs);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m28137K3(int i11) {
        m28138L3(i11, 2);
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m28121I3(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C43852m.m96591c("B11FuturesBonus", "bonusHistory", null, null, 12, null);
        BaseActivity.Companion companion = BaseActivity.INSTANCE;
        Context context = it.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BaseActivity.Companion.launch$default(companion, context, WelfareHistoryFragment.class, null, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final FuturesTrialViewModel m28122M3(FuturesWelfareFragment futuresWelfareFragment) {
        return (FuturesTrialViewModel) new ViewModelProvider(futuresWelfareFragment).get(FuturesTrialViewModel.class);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m28136J3(FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntity) {
        if (futuresWelfareTrialWithDrawPopupInfoEntity != null) {
            FuturesTrialWithdrawRiskDialog futuresTrialWithdrawRiskDialog = new FuturesTrialWithdrawRiskDialog();
            futuresTrialWithdrawRiskDialog.setArguments(BundleKt.bundleOf(new Pair("data", futuresWelfareTrialWithDrawPopupInfoEntity), new Pair("type", 4)));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            futuresTrialWithdrawRiskDialog.show(childFragmentManager, "FuturesTrialWithdrawRiskDialog");
        }
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.bkumex_fragment_futures_welfare, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    /* JADX INFO: renamed from: u3 */
    public final Pair<ArrayList<Fragment>, ArrayList<String>> m28139u3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WelfareAirdropListFragment());
        arrayList.add(new WelfareTrialListFragment());
        arrayList.add(new WelfareCouponListFragment());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getString(R$string.airdrop_coupon));
        arrayList2.add(getString(R$string.kumex_welfare_trial));
        arrayList2.add(getString(R$string.coupon_records));
        return TuplesKt.m90091to(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: v3 */
    public final C36802m2 m28140v3() {
        return (C36802m2) this.f24495U.getValue(this, f24494W[0]);
    }

    /* JADX INFO: renamed from: w3 */
    public final FuturesTrialViewModel m28141w3() {
        return (FuturesTrialViewModel) this.f24496V.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public static final Unit m28113A3(FuturesWelfareFragment futuresWelfareFragment, Pair pair) {
        List<FuturesWelfareTrialItemEntity> items;
        int size;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            return Unit.INSTANCE;
        }
        if (pair.getSecond() != null) {
            FuturesWelfareTrialEntity futuresWelfareTrialEntity = (FuturesWelfareTrialEntity) pair.getSecond();
            if (futuresWelfareTrialEntity != null) {
                items = futuresWelfareTrialEntity.getItems();
            } else {
                items = null;
            }
            if (items != null) {
                size = items.size();
            } else {
                size = 0;
            }
            futuresWelfareFragment.m28138L3(size, 0);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m28114B3(FuturesWelfareFragment futuresWelfareFragment, Pair pair) {
        List<FuturesWelfareTrialItemEntity> items;
        int size;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            return Unit.INSTANCE;
        }
        if (pair.getSecond() != null) {
            FuturesWelfareTrialEntity futuresWelfareTrialEntity = (FuturesWelfareTrialEntity) pair.getSecond();
            if (futuresWelfareTrialEntity != null) {
                items = futuresWelfareTrialEntity.getItems();
            } else {
                items = null;
            }
            if (items != null) {
                size = items.size();
            } else {
                size = 0;
            }
            futuresWelfareFragment.m28138L3(size, 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m28115C3(Boolean bool) {
        if (bool.booleanValue()) {
            ToastCompat.m66437C(R$string.pay_advcash_withdraw_result_suc_title);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m28116D3(FuturesWelfareFragment futuresWelfareFragment, Boolean bool) {
        if (bool.booleanValue()) {
            futuresWelfareFragment.showLoadingDialog();
        } else {
            futuresWelfareFragment.hideLoadingDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m28117E3(FuturesWelfareFragment futuresWelfareFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            futuresWelfareFragment.hideLoadingDialog(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m28118F3(FuturesWelfareFragment futuresWelfareFragment, FuturesWelfareTrialWithDrawPopupInfoEntity futuresWelfareTrialWithDrawPopupInfoEntity) {
        futuresWelfareFragment.m28136J3(futuresWelfareTrialWithDrawPopupInfoEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    private final void m28119G3() {
        C36802m2 c36802m2M28140v3 = m28140v3();
        if (c36802m2M28140v3 == null) {
            return;
        }
        Pair<ArrayList<Fragment>, ArrayList<String>> pairM28139u3 = m28139u3();
        RtlViewPager rtlViewPager = c36802m2M28140v3.f80567j;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rtlViewPager.setAdapter(new C27103z(childFragmentManager, pairM28139u3.getFirst(), pairM28139u3.getSecond()));
        c36802m2M28140v3.f80567j.setOffscreenPageLimit(2);
        c36802m2M28140v3.f80564g.setViewPager(c36802m2M28140v3.f80567j);
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m28120H3(FuturesWelfareFragment futuresWelfareFragment, View view) {
        futuresWelfareFragment.preformBackPressed();
    }

    /* JADX INFO: renamed from: z3 */
    private final void m28135z3() {
        m28141w3().m28767t().observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.l0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28113A3(this.f24876b, (Pair) obj);
            }
        }));
        m28141w3().m28768u().observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.m0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28114B3(this.f24879b, (Pair) obj);
            }
        }));
        m28141w3().m28756B().observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.n0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28115C3((Boolean) obj);
            }
        }));
        m28141w3().m28770w().observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.o0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28116D3(this.f24884b, (Boolean) obj);
            }
        }));
        m28141w3().m28772y().observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28117E3(this.f24888b, (Boolean) obj);
            }
        }));
        C24252m0.m58486v(m28141w3().m28773z()).observe(getViewLifecycleOwner(), new C14177b(new Function1() { // from class: com.kubi.futures.trade.welfare.q0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28118F3(this.f24890b, (FuturesWelfareTrialWithDrawPopupInfoEntity) obj);
            }
        }));
        String name = C4622n.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (C12573b.f21598a.m23696a()) {
            name.length();
        }
        C12572a.m23692a(this, false, new C14178x6dcf3142(name, null, this));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: L3 */
    public final void m28138L3(int i11, int i12) {
        View viewM55288r;
        SlidingTabLayout slidingTabLayout;
        C36802m2 c36802m2M28140v3 = m28140v3();
        TextView textView = null;
        if (c36802m2M28140v3 != null && (slidingTabLayout = c36802m2M28140v3.f80564g) != null) {
            viewM55288r = slidingTabLayout.m55288r(i12);
        } else {
            viewM55288r = null;
        }
        if (viewM55288r != null) {
            textView = (TextView) viewM55288r.findViewById(R$id.tv_tab_title);
        }
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2 && textView != null) {
                    textView.setText(getString(R$string.coupon_records) + '(' + i11 + ')');
                    return;
                }
                return;
            }
            if (textView != null) {
                textView.setText(getString(R$string.kumex_welfare_trial) + '(' + i11 + ')');
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setText(getString(R$string.kumex_airdrop_label_stub, String.valueOf(i11)));
        }
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C36802m2 c36802m2M28140v3 = m28140v3();
        if (c36802m2M28140v3 == null) {
            return;
        }
        C43852m.m96595g("B11FuturesBonus", "bonusHistory", null, null, 12, null);
        EdgeToEdgeCompat edgeToEdgeCompat = EdgeToEdgeCompat.f48106a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        View statusBar = c36802m2M28140v3.f80562e;
        Intrinsics.checkNotNullExpressionValue(statusBar, "statusBar");
        edgeToEdgeCompat.m58268f(fragmentActivityRequireActivity, statusBar);
        View statusBar2 = c36802m2M28140v3.f80562e;
        Intrinsics.checkNotNullExpressionValue(statusBar2, "statusBar");
        ViewExtKt.m66577h(statusBar2);
        ViewExtKt.m66577h(getTitleBar());
        ViewGroup.LayoutParams layoutParams = c36802m2M28140v3.f80565h.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = edgeToEdgeCompat.m58272j();
        c36802m2M28140v3.f80565h.setLayoutParams(layoutParams2);
        c36802m2M28140v3.f80565h.setTitle(getStringRes(R$string.futures_rewards, new Object[0]));
        c36802m2M28140v3.f80565h.setOnNavigationListener(new View.OnClickListener() { // from class: com.kubi.futures.trade.welfare.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FuturesWelfareFragment.m28120H3(this.f24827b, view2);
            }
        });
        AppCompatImageView history = c36802m2M28140v3.f80561d;
        Intrinsics.checkNotNullExpressionValue(history, "history");
        ViewExtKt.m66575f(history, new Function1() { // from class: com.kubi.futures.trade.welfare.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FuturesWelfareFragment.m28121I3((View) obj);
            }
        });
        m28135z3();
        m28142x3();
        m28119G3();
    }

    /* JADX INFO: renamed from: x3 */
    public final void m28142x3() {
        final C36802m2 c36802m2M28140v3 = m28140v3();
        if (c36802m2M28140v3 == null) {
            return;
        }
        ViewCompat.setBackground(c36802m2M28140v3.f80559b, null);
        c36802m2M28140v3.f80559b.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.kubi.futures.trade.welfare.k0
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i11) {
                FuturesWelfareFragment.m28134y3(c36802m2M28140v3, appBarLayout, i11);
            }
        });
        ViewGroup.LayoutParams layoutParams = c36802m2M28140v3.f80559b.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        Intrinsics.checkNotNull(behavior, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
        ((AppBarLayout.Behavior) behavior).setDragCallback(new C14176a());
    }
}
