package com.kubi.copytrading.futures;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.C5275i0;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.copytrading.CopyTradingConfig;
import com.kubi.copytrading.ICopyTradingFuturesDelegate;
import com.kubi.copytrading.R$color;
import com.kubi.copytrading.R$drawable;
import com.kubi.copytrading.R$id;
import com.kubi.copytrading.R$layout;
import com.kubi.copytrading.R$string;
import com.kubi.copytrading.entity.LeadUserEntity;
import com.kubi.copytrading.view.CopyTradingUserAvatarView;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import io.chad.library.adapter.base.BaseViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p532pc.C43433b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CopyTradingDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001cH\u0016J\u0012\u0010&\u001a\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010'\u001a\u00020\u001cH\u0016J\u001a\u0010(\u001a\u00020\u001c2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010+\u001a\u00020\u001cH\u0002J\u0010\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\n\u001a\u00020\u000b8FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/copytrading/futures/CopyTradingDelegate;", "Lcom/kubi/copytrading/ICopyTradingFuturesDelegate;", "fragment", "Lcom/kubi/sdk/BaseFragment;", "<init>", "(Lcom/kubi/sdk/BaseFragment;)V", "rootView", "Landroid/widget/LinearLayout;", "appBar", "Landroid/view/ViewGroup;", "viewModel", "Lcom/kubi/copytrading/futures/CopyTradingViewModel;", "getViewModel$annotations", "()V", "getViewModel", "()Lcom/kubi/copytrading/futures/CopyTradingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "copyTradeAccountBinding", "Lcom/kubi/copytrading/databinding/BcopytradingViewCopyTradeAccountBinding;", "getCopyTradeAccountBinding$annotations", "getCopyTradeAccountBinding", "()Lcom/kubi/copytrading/databinding/BcopytradingViewCopyTradeAccountBinding;", "setCopyTradeAccountBinding", "(Lcom/kubi/copytrading/databinding/BcopytradingViewCopyTradeAccountBinding;)V", "positionTipsView", "Landroid/widget/TextView;", "onViewCreated", "", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "onAccountChanged", "isMaster", "", "copyPositionChanged", "count", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "refreshCopyTradeStatus", "refresh", "checkJumpToggleLeadTrading", "bundle", "Landroid/os/Bundle;", "toggleLeadTradingAccount", "generateTipsView", "context", "Landroid/content/Context;", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCopyTradingDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyTradingDelegate.kt\ncom/kubi/copytrading/futures/CopyTradingDelegate\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n106#2,15:291\n34#3:306\n1#4:307\n*S KotlinDebug\n*F\n+ 1 CopyTradingDelegate.kt\ncom/kubi/copytrading/futures/CopyTradingDelegate\n*L\n57#1:291,15\n133#1:306\n*E\n"})
public final class CopyTradingDelegate implements ICopyTradingFuturesDelegate {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final BaseFragment f19889a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public LinearLayout f19890b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ViewGroup f19891c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Lazy f19892d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public C43433b f19893e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public TextView f19894f;

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.CopyTradingDelegate$a */
    /* JADX INFO: compiled from: CopyTradingDelegate.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/copytrading/futures/CopyTradingDelegate$onViewCreated$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", ViewProps.POSITION, "", "CopyTradingLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11516a extends ViewPager.SimpleOnPageChangeListener {
        public C11516a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            if (position == 1) {
                TextView textView = CopyTradingDelegate.this.f19894f;
                if (textView != null) {
                    ViewExtKt.m66594y(textView);
                    return;
                }
                return;
            }
            TextView textView2 = CopyTradingDelegate.this.f19894f;
            if (textView2 != null) {
                ViewExtKt.m66577h(textView2);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.copytrading.futures.CopyTradingDelegate$b */
    /* JADX INFO: compiled from: CopyTradingDelegate.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C11517b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f19896b;

        public C11517b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f19896b = function;
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
            return this.f19896b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19896b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public CopyTradingDelegate(@NotNull final BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f19889a = fragment;
        final Function0 function0 = new Function0() { // from class: com.kubi.copytrading.futures.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingDelegate.m20847u(this.f19910b);
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.copytrading.futures.CopyTradingDelegate$special$$inlined$viewModels$default$1
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
        this.f19892d = FragmentViewModelLazyKt.createViewModelLazy(fragment, Reflection.getOrCreateKotlinClass(CopyTradingViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.copytrading.futures.CopyTradingDelegate$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.copytrading.futures.CopyTradingDelegate$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.copytrading.futures.CopyTradingDelegate$special$$inlined$viewModels$default$4
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
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = fragment.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m20842l() {
        C43852m.m96595g("B20CopyTradeFuturesTrade", ViewProps.POSITION, "copyTradePositionGuide", null, 8, null);
        CopyTradingConfig.f19710a.m20588B("myCopy");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m20845s(List list, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        int i11 = R$id.tv_title;
        viewHolder.setVisible(i11, true);
        viewHolder.setText(i11, R$string.copytd_switch_account_info);
        View view = viewHolder.getView(R$id.tv_cancel);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.copytrading.futures.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingDelegate.m20846t(dialogFragmentHelper);
            }
        }, 1, null);
        ((RecyclerView) viewHolder.getView(R$id.recycler_view)).setAdapter(new CopyTradingDelegate$toggleLeadTradingAccount$1$2(list, dialogFragmentHelper, R$layout.bcopytrading_item_copy_trade_account));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final ViewModelStoreOwner m20847u(CopyTradingDelegate copyTradingDelegate) {
        return copyTradingDelegate.f19889a;
    }

    @Override // com.kubi.copytrading.ICopyTradingFuturesDelegate
    /* JADX INFO: renamed from: C0 */
    public void mo20617C0(@Nullable LinearLayout linearLayout, @Nullable ViewGroup viewGroup, @Nullable final ViewPager viewPager) {
        this.f19890b = linearLayout;
        this.f19891c = viewGroup;
        m20852p(linearLayout);
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this.f19889a), null, null, new CopyTradingDelegate$onViewCreated$1(this, null), 3, null);
        m20851n(FutureCopyTradingConfig.f19902a.m20875j().getValue().getIsMasterAccount());
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new C11516a());
        }
        m20850m().m20864t().observe(this.f19889a, new C11517b(new Function1() { // from class: com.kubi.copytrading.futures.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CopyTradingDelegate.m20843o(this.f19908b, viewPager, (Integer) obj);
            }
        }));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d  */
    @Override // com.kubi.copytrading.ICopyTradingFuturesDelegate
    /* JADX INFO: renamed from: D0 */
    public void mo20618D0(@Nullable Bundle bundle, @NotNull BaseFragment fragment) {
        boolean z11;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String strM56284y = bundle != null ? RouteExKt.m56284y(bundle, "leadUserId") : null;
        String strM56284y2 = bundle != null ? RouteExKt.m56284y(bundle, "leadUserConfigId") : null;
        if (UserInfo.a.n()) {
            FutureCopyTradingConfig futureCopyTradingConfig = FutureCopyTradingConfig.f19902a;
            if (futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount()) {
                CopyTradingConfig copyTradingConfig = CopyTradingConfig.f19710a;
                if (copyTradingConfig.m20606w(strM56284y) || copyTradingConfig.m20607x(strM56284y2)) {
                    if (bundle != null) {
                        z11 = RouteExKt.m56250h(bundle, "tooltip");
                    }
                    futureCopyTradingConfig.m20871e(false, z11);
                    ToastCompat.m66465z(R$string.copytd_switch_account_ok_tips);
                }
            }
        }
    }

    @Override // com.kubi.copytrading.ICopyTradingFuturesDelegate
    /* JADX INFO: renamed from: a */
    public void mo20619a() {
        m20852p(this.f19890b);
        mo20616B0();
        CopyTradingConfig.f19710a.m20597n();
    }

    /* JADX INFO: renamed from: j */
    public final void m20848j(ViewPager viewPager, int i11) {
        ViewGroup viewGroup;
        Boolean boolValueOf;
        ViewGroup viewGroup2;
        Context context = this.f19889a.getContext();
        if (context == null) {
            return;
        }
        if (UserInfo.a.n() && i11 > 0 && FutureCopyTradingConfig.f19902a.m20875j().getValue().getIsMasterAccount()) {
            if (this.f19894f == null) {
                this.f19894f = m20849k(context);
            }
            ViewGroup viewGroup3 = this.f19891c;
            if (viewGroup3 != null) {
                TextView textView = this.f19894f;
                Intrinsics.checkNotNull(textView);
                boolValueOf = Boolean.valueOf(viewGroup3.indexOfChild(textView) != -1);
            } else {
                boolValueOf = null;
            }
            if (!C27025c.m66566d(boolValueOf) && (viewGroup2 = this.f19891c) != null) {
                TextView textView2 = this.f19894f;
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.topMargin = C5275i0.m6236a(16.0f);
                marginLayoutParams.leftMargin = C5275i0.m6236a(16.0f);
                marginLayoutParams.rightMargin = C5275i0.m6236a(16.0f);
                marginLayoutParams.bottomMargin = C5275i0.m6236a(8.0f);
                Unit unit = Unit.INSTANCE;
                viewGroup2.addView(textView2, marginLayoutParams);
            }
        } else {
            TextView textView3 = this.f19894f;
            if (textView3 != null && (viewGroup = this.f19891c) != null) {
                viewGroup.removeView(textView3);
            }
        }
        TextView textView4 = this.f19894f;
        if (textView4 != null) {
            textView4.setText(this.f19889a.getString(R$string.copytd_copy_position_tips, String.valueOf(i11)));
        }
        if (viewPager == null || viewPager.getCurrentItem() != 1) {
            TextView textView5 = this.f19894f;
            if (textView5 != null) {
                ViewExtKt.m66577h(textView5);
                return;
            }
            return;
        }
        TextView textView6 = this.f19894f;
        if (textView6 != null) {
            ViewExtKt.m66594y(textView6);
        }
    }

    /* JADX INFO: renamed from: k */
    public final TextView m20849k(Context context) {
        TextView textView = new TextView(context);
        textView.setTextColor(this.f19889a.getColorRes(R$color.c_text60));
        C27046k.m66694i(textView, R$drawable.ic2_arrow_right_16, 0, 0, 6, null);
        C27046k.m66702q(textView, this.f19889a.getColorRes(R$color.c_icon));
        int iM6236a = C5275i0.m6236a(12.0f);
        textView.setTextSize(2, 14.0f);
        textView.setPadding(iM6236a, iM6236a, iM6236a, iM6236a);
        textView.setText(R$string.copytd_copy_position_tips);
        textView.setBackgroundResource(R$drawable.shape_cover4_8r);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.copytrading.futures.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CopyTradingDelegate.m20842l();
            }
        }, 1, null);
        return textView;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final CopyTradingViewModel m20850m() {
        return (CopyTradingViewModel) this.f19892d.getValue();
    }

    /* JADX INFO: renamed from: n */
    public final void m20851n(boolean z11) {
        ViewSwitcher viewSwitcher;
        if (UserInfo.a.n()) {
            m20850m().m20865u(m20850m().m20864t().getValue());
            C43433b c43433b = this.f19893e;
            if (c43433b == null || (viewSwitcher = c43433b.f95890b) == null) {
                return;
            }
            viewSwitcher.setDisplayedChild(!z11 ? 1 : 0);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: p */
    public final void m20852p(@Nullable LinearLayout linearLayout) {
        ConstraintLayout root;
        CopyTradingUserAvatarView copyTradingUserAvatarView;
        CopyTradingUserAvatarView copyTradingUserAvatarView2;
        ConstraintLayout root2;
        ConstraintLayout root3;
        CopyTradingConfig copyTradingConfig = CopyTradingConfig.f19710a;
        if (!copyTradingConfig.m20608y()) {
            C43433b c43433b = this.f19893e;
            if (c43433b == null || (root = c43433b.getRoot()) == null) {
                return;
            }
            C27046k.m66700o(root);
            return;
        }
        C43852m.m96595g("B20CopyTradeFuturesTrade", "accountSwitch", "switchPanel", null, 8, null);
        if (this.f19893e == null) {
            C43433b c43433bM95627a = C43433b.m95627a(LayoutInflater.from(linearLayout != null ? linearLayout.getContext() : null).inflate(R$layout.bcopytrading_view_copy_trade_account, (ViewGroup) null));
            this.f19893e = c43433bM95627a;
            if (linearLayout != null) {
                Intrinsics.checkNotNull(c43433bM95627a);
                linearLayout.addView(c43433bM95627a.getRoot(), 0);
            }
            C43433b c43433b2 = this.f19893e;
            if (c43433b2 != null && (root3 = c43433b2.getRoot()) != null) {
                C27046k.m66711z(root3, 0L, new Function0() { // from class: com.kubi.copytrading.futures.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CopyTradingDelegate.m20844q(this.f19911b);
                    }
                }, 1, null);
            }
        }
        C43433b c43433b3 = this.f19893e;
        if (c43433b3 != null && (root2 = c43433b3.getRoot()) != null) {
            C27046k.m66685H(root2);
        }
        C43433b c43433b4 = this.f19893e;
        if (c43433b4 != null && (copyTradingUserAvatarView2 = c43433b4.f95894f) != null) {
            copyTradingUserAvatarView2.m20958b(UserInfo.c().getAvatar(), UserInfo.c().getShowHeadText());
        }
        C43433b c43433b5 = this.f19893e;
        if (c43433b5 == null || (copyTradingUserAvatarView = c43433b5.f95892d) == null) {
            return;
        }
        LeadUserEntity leadUserEntityM20602s = copyTradingConfig.m20602s();
        String avatar = leadUserEntityM20602s != null ? leadUserEntityM20602s.getAvatar() : null;
        LeadUserEntity leadUserEntityM20602s2 = copyTradingConfig.m20602s();
        copyTradingUserAvatarView.m20958b(avatar, leadUserEntityM20602s2 != null ? leadUserEntityM20602s2.getNickName() : null);
    }

    /* JADX INFO: renamed from: r */
    public final void m20853r() {
        final ArrayList arrayList = new ArrayList();
        String string = this.f19889a.getString(R$string.copytd_master_account);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        arrayList.add(string);
        String string2 = this.f19889a.getString(R$string.copytd_lead_trading_sub_account);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        arrayList.add(string2);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.view_bottom_sheet_dialog, true).m54237f4(new Function2() { // from class: com.kubi.copytrading.futures.e
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CopyTradingDelegate.m20845s(arrayList, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = this.f19889a.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "toggleLeadTradingAccount");
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m20843o(CopyTradingDelegate copyTradingDelegate, ViewPager viewPager, Integer num) {
        Intrinsics.checkNotNull(num);
        copyTradingDelegate.m20848j(viewPager, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m20844q(CopyTradingDelegate copyTradingDelegate) {
        copyTradingDelegate.m20853r();
        C43852m.m96591c("B20CopyTradeFuturesTrade", "accountSwitch", "switchButton", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m20846t(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.copytrading.ICopyTradingFuturesDelegate
    /* JADX INFO: renamed from: B0 */
    public void mo20616B0() {
        m20850m().m20862r();
        FutureCopyTradingConfig futureCopyTradingConfig = FutureCopyTradingConfig.f19902a;
        if (futureCopyTradingConfig.m20875j().getValue().getIsMasterAccount()) {
            futureCopyTradingConfig.m20872g();
        }
    }
}
