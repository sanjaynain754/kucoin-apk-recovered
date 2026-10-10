package com.kubi.tradingbotkit.business.newUserCoupons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.p110rn.modules.RNH5InterActionHelperKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.aggregation.viewmodel.GridTradingListViewModel;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import l50.C42077k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p569qq.InterfaceC43850k;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: NewUseCouponsFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/newUserCoupons/NewUseCouponsFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "btradingBotKitFragmentNewUserCouponsBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentNewUserCouponsBinding;", "getBtradingBotKitFragmentNewUserCouponsBinding", "()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentNewUserCouponsBinding;", "btradingBotKitFragmentNewUserCouponsBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "gridTradingListModel", "Lcom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel;", "getGridTradingListModel", "()Lcom/kubi/tradingbotkit/business/aggregation/viewmodel/GridTradingListViewModel;", "gridTradingListModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "trackEventClick", "getPageIdByType", "", RNH5InterActionHelperKt.EVENT_NAME_ON_SHOW, "trackEventExpose", "dismissParent", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewUseCouponsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUseCouponsFragment.kt\ncom/kubi/tradingbotkit/business/newUserCoupons/NewUseCouponsFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,86:1\n147#2,16:87\n172#3,9:103\n*S KotlinDebug\n*F\n+ 1 NewUseCouponsFragment.kt\ncom/kubi/tradingbotkit/business/newUserCoupons/NewUseCouponsFragment\n*L\n28#1:87,16\n37#1:103,9\n*E\n"})
@InterfaceC43850k(pageId = "bot_page_new_user_coupons")
public final class NewUseCouponsFragment extends BaseFragment {

    /* JADX INFO: renamed from: W */
    public static final /* synthetic */ KProperty<Object>[] f52400W = {Reflection.property1(new PropertyReference1Impl(NewUseCouponsFragment.class, "btradingBotKitFragmentNewUserCouponsBinding", "getBtradingBotKitFragmentNewUserCouponsBinding()Lcom/kubi/tradingbotkit/databinding/BtradingBotKitFragmentNewUserCouponsBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52401U = C45681e.m100799e(this, new Function1<NewUseCouponsFragment, C42077k>() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.NewUseCouponsFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42077k invoke(@NotNull NewUseCouponsFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42077k.m92305a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42077k, Unit>() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.NewUseCouponsFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42077k it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42077k c42077k) {
            invoke(c42077k);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52402V;

    /* JADX INFO: renamed from: p3 */
    public static final Unit m64069p3(NewUseCouponsFragment newUseCouponsFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newUseCouponsFragment.m64071l3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m3 */
    public final C42077k m64072m3() {
        return (C42077k) this.f52401U.getValue(this, f52400W[0]);
    }

    /* JADX INFO: renamed from: n3 */
    public final GridTradingListViewModel m64073n3() {
        return (GridTradingListViewModel) this.f52402V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.btrading_bot_kit_fragment_new_user_coupons, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AppCompatTextView appCompatTextView;
        TextView textView;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C42077k c42077kM64072m3 = m64072m3();
        if (c42077kM64072m3 != null && (imageView = c42077kM64072m3.f93006f) != null) {
            ViewExtKt.m66575f(imageView, new Function1() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewUseCouponsFragment.m64069p3(this.f52404b, (View) obj);
                }
            });
        }
        C42077k c42077kM64072m4 = m64072m3();
        if (c42077kM64072m4 != null && (textView = c42077kM64072m4.f93002b) != null) {
            C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NewUseCouponsFragment.m64070q3(this.f52405b);
                }
            }, 1, null);
        }
        C42077k c42077kM64072m5 = m64072m3();
        if (c42077kM64072m5 == null || (appCompatTextView = c42077kM64072m5.f93010j) == null) {
            return;
        }
        appCompatTextView.setText(getString(R$string.kc_tb_free_expire, "24h"));
    }

    public NewUseCouponsFragment() {
        final Function0 function0 = null;
        this.f52402V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(GridTradingListViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.NewUseCouponsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore mViewModelStore = this.requireActivity().getMViewModelStore();
                Intrinsics.checkNotNullExpressionValue(mViewModelStore, "requireActivity().viewModelStore");
                return mViewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.NewUseCouponsFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = function0;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.tradingbotkit.business.newUserCoupons.NewUseCouponsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public static final Unit m64070q3(NewUseCouponsFragment newUseCouponsFragment) {
        newUseCouponsFragment.m64075r3();
        newUseCouponsFragment.m64071l3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l3 */
    public final void m64071l3() {
        DialogFragment dialogFragment;
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof DialogFragment) {
            dialogFragment = (DialogFragment) parentFragment;
        } else {
            dialogFragment = null;
        }
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
    }

    /* JADX INFO: renamed from: o3 */
    public final String m64074o3() {
        if (Intrinsics.areEqual(m64073n3().m63703s(), "CONTRACT_GRID")) {
            return "B10FutureCreate";
        }
        return "B10SpotCreate";
    }

    @Override // com.kubi.sdk.BaseFragment
    public void onShow() {
        super.onShow();
        m64076s3();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m64075r3() {
        C43852m.m96591c(m64074o3(), "newUserCoupon", "1", null, 8, null);
    }

    /* JADX INFO: renamed from: s3 */
    public final void m64076s3() {
        C43852m.m96595g(m64074o3(), "newUserCoupon", "1", null, 8, null);
    }
}
