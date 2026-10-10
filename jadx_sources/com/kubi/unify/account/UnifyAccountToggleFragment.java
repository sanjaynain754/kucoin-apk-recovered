package com.kubi.unify.account;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.flexbox.FlexboxLayout;
import com.google.firebase.messaging.Constants;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.util.C24252m0;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.search.searchresult.SearchCategory$Companion;
import com.kubi.unify.R$color;
import com.kubi.unify.R$drawable;
import com.kubi.unify.R$font;
import com.kubi.unify.R$layout;
import com.kubi.unify.R$string;
import com.kubi.unify.UnifyConstant;
import com.kubi.unify.UnifyGlobalDataManager;
import com.kubi.unify.api.entity.UnifyAccountType;
import com.kubi.unify.api.entity.UnifySupportService;
import com.kubi.unify.entity.UnifyConfig;
import com.kubi.utils.C27018c0;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C41696j;
import l60.C42106a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
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
import p852kotlin.text.Typography;
import w00.C45681e;

/* JADX INFO: compiled from: UnifyAccountToggleFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0016\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u001eH\u0002J\u001a\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u00112\b\b\u0002\u0010-\u001a\u00020.H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/unify/account/UnifyAccountToggleFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/unify/databinding/FragmentUnifyAccountToggleBinding;", "getBinding", "()Lcom/kubi/unify/databinding/FragmentUnifyAccountToggleBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "vm", "Lcom/kubi/unify/account/UnifyAccountViewModel;", "getVm", "()Lcom/kubi/unify/account/UnifyAccountViewModel;", "vm$delegate", "Lkotlin/Lazy;", "fromType", "", "getFromType", "()Ljava/lang/String;", "fromType$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "titleY", "", "addScrollListener", "getBottomDistanceFromParentTop", "childView", "Landroid/widget/TextView;", "parentView", "bindConfigUI", "config", "Lcom/kubi/unify/entity/UnifyConfig;", "bindView", "generateTradeTextView", Constants.ScionAnalytics.PARAM_LABEL, "isSupport", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nUnifyAccountToggleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountToggleFragment.kt\ncom/kubi/unify/account/UnifyAccountToggleFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,252:1\n147#2,16:253\n106#3,15:269\n*S KotlinDebug\n*F\n+ 1 UnifyAccountToggleFragment.kt\ncom/kubi/unify/account/UnifyAccountToggleFragment\n*L\n51#1:253,16\n52#1:269,15\n*E\n"})
public final class UnifyAccountToggleFragment extends BaseFragment {

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f53099Y = {Reflection.property1(new PropertyReference1Impl(UnifyAccountToggleFragment.class, "binding", "getBinding()Lcom/kubi/unify/databinding/FragmentUnifyAccountToggleBinding;", 0))};

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f53100U = C45681e.m100799e(this, new Function1<UnifyAccountToggleFragment, C42106a>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C42106a invoke(@NotNull UnifyAccountToggleFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C42106a.m92367a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C42106a, Unit>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C42106a it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C42106a c42106a) {
            invoke(c42106a);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f53101V;

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f53102W;

    /* JADX INFO: renamed from: X */
    public int f53103X;

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountToggleFragment$a */
    /* JADX INFO: compiled from: UnifyAccountToggleFragment.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/unify/account/UnifyAccountToggleFragment$addScrollListener$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class ViewTreeObserverOnGlobalLayoutListenerC26464a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C42106a f53104b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ UnifyAccountToggleFragment f53105c;

        public ViewTreeObserverOnGlobalLayoutListenerC26464a(C42106a c42106a, UnifyAccountToggleFragment unifyAccountToggleFragment) {
            this.f53104b = c42106a;
            this.f53105c = unifyAccountToggleFragment;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f53104b.f93442j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            UnifyAccountToggleFragment unifyAccountToggleFragment = this.f53105c;
            BaseTextView title = this.f53104b.f93442j;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            NestedScrollView scrollView = this.f53104b.f93438f;
            Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
            unifyAccountToggleFragment.f53103X = unifyAccountToggleFragment.m64931I3(title, scrollView);
        }
    }

    /* JADX INFO: renamed from: com.kubi.unify.account.UnifyAccountToggleFragment$b */
    /* JADX INFO: compiled from: UnifyAccountToggleFragment.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26465b implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f53106b;

        public C26465b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f53106b = function;
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
            return this.f53106b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53106b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    /* JADX INFO: renamed from: B3 */
    public static final Unit m64901B3(C42106a c42106a) {
        if (c42106a.f93452t.getTag() != null) {
            Object tag = c42106a.f93452t.getTag();
            Boolean bool = Boolean.FALSE;
            if (Intrinsics.areEqual(tag, bool)) {
                FlexboxLayout supportTradeListUnifyMore = c42106a.f93441i;
                Intrinsics.checkNotNullExpressionValue(supportTradeListUnifyMore, "supportTradeListUnifyMore");
                ViewExtKt.m66594y(supportTradeListUnifyMore);
                c42106a.f93452t.setTag(Boolean.TRUE);
                BaseTextView tvMoreTrade = c42106a.f93452t;
                Intrinsics.checkNotNullExpressionValue(tvMoreTrade, "tvMoreTrade");
                C27046k.m66694i(tvMoreTrade, R$drawable.ic2_arrow_up_12, 0, 0, 6, null);
            } else {
                FlexboxLayout supportTradeListUnifyMore2 = c42106a.f93441i;
                Intrinsics.checkNotNullExpressionValue(supportTradeListUnifyMore2, "supportTradeListUnifyMore");
                ViewExtKt.m66577h(supportTradeListUnifyMore2);
                c42106a.f93452t.setTag(bool);
                BaseTextView tvMoreTrade2 = c42106a.f93452t;
                Intrinsics.checkNotNullExpressionValue(tvMoreTrade2, "tvMoreTrade");
                C27046k.m66694i(tvMoreTrade2, R$drawable.ic2_arrow_down_12, 0, 0, 6, null);
            }
        } else {
            FlexboxLayout supportTradeListUnifyMore3 = c42106a.f93441i;
            Intrinsics.checkNotNullExpressionValue(supportTradeListUnifyMore3, "supportTradeListUnifyMore");
            ViewExtKt.m66594y(supportTradeListUnifyMore3);
            c42106a.f93452t.setTag(Boolean.TRUE);
            BaseTextView tvMoreTrade3 = c42106a.f93452t;
            Intrinsics.checkNotNullExpressionValue(tvMoreTrade3, "tvMoreTrade");
            C27046k.m66694i(tvMoreTrade3, R$drawable.ic2_arrow_up_12, 0, 0, 6, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static /* synthetic */ View m64905G3(UnifyAccountToggleFragment unifyAccountToggleFragment, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return unifyAccountToggleFragment.m64929F3(str, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public final String m64906J3() {
        return (String) this.f53102W.getValue();
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m64910O3(final UnifyAccountToggleFragment unifyAccountToggleFragment, List list) {
        UnifyTradeExamFragment unifyTradeExamFragment = new UnifyTradeExamFragment();
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putParcelableArrayList("examList", new ArrayList<>(list));
        unifyTradeExamFragment.setArguments(bundleBundleOf);
        BaseDialogFragment baseDialogFragmentM54192r3 = unifyTradeExamFragment.m54192r3(new DialogInterface.OnDismissListener() { // from class: com.kubi.unify.account.l
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                UnifyAccountToggleFragment.m64911P3(this.f53141b, dialogInterface);
            }
        });
        FragmentManager childFragmentManager = unifyAccountToggleFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseDialogFragmentM54192r3.show(childFragmentManager, "UnifyTradeExamFragment");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m64911P3(UnifyAccountToggleFragment unifyAccountToggleFragment, DialogInterface dialogInterface) {
        if (C27025c.m66566d(UnifyGlobalDataManager.f53084a.m64881s().getValue().isAnswered())) {
            unifyAccountToggleFragment.m64932K3().m64944C(UnifyAccountType.UNIFIED.getValue());
        }
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m64926x3(UnifyAccountToggleFragment unifyAccountToggleFragment, NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
        if (i12 > unifyAccountToggleFragment.f53103X) {
            unifyAccountToggleFragment.getTitleBar().setTitle(unifyAccountToggleFragment.getString(R$string.unify_account_mode));
        } else {
            unifyAccountToggleFragment.getTitleBar().setTitle("");
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final void m64927z3(View view) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, UnifyConstant.f53295a.m65230i(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: A3 */
    public final void m64928A3() {
        final C42106a c42106aM64930H3 = m64930H3();
        if (c42106aM64930H3 != null) {
            c42106aM64930H3.f93447o.setText(" • " + getString(R$string.unify_funds_classic_rule_1));
            c42106aM64930H3.f93449q.setText(" • " + getString(R$string.unify_funds_classic_rule_2));
            c42106aM64930H3.f93458z.setText(" • " + getString(R$string.unify_use_rule_1));
            c42106aM64930H3.f93448p.setText(" • " + getString(R$string.unify_funds_unify_rule_1));
            c42106aM64930H3.f93450r.setText(" • " + getString(R$string.unify_funds_unify_rule_2));
            c42106aM64930H3.f93430A.setMovementMethod(LinkMovementMethod.getInstance());
            c42106aM64930H3.f93439g.removeAllViews();
            FlexboxLayout flexboxLayout = c42106aM64930H3.f93439g;
            int i11 = R$string.unify_trade_type_spot;
            String string = getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            flexboxLayout.addView(m64905G3(this, string, false, 2, null));
            FlexboxLayout flexboxLayout2 = c42106aM64930H3.f93439g;
            int i12 = R$string.unify_trade_type_futures;
            String string2 = getString(i12);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            flexboxLayout2.addView(m64905G3(this, string2, false, 2, null));
            FlexboxLayout flexboxLayout3 = c42106aM64930H3.f93439g;
            String string3 = getString(R$string.lever);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            flexboxLayout3.addView(m64905G3(this, string3, false, 2, null));
            c42106aM64930H3.f93440h.removeAllViews();
            FlexboxLayout flexboxLayout4 = c42106aM64930H3.f93440h;
            String string4 = getString(i11);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            flexboxLayout4.addView(m64905G3(this, string4, false, 2, null));
            FlexboxLayout flexboxLayout5 = c42106aM64930H3.f93440h;
            String string5 = getString(i12);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            flexboxLayout5.addView(m64905G3(this, string5, false, 2, null));
            BaseTextView tvMoreTrade = c42106aM64930H3.f93452t;
            Intrinsics.checkNotNullExpressionValue(tvMoreTrade, "tvMoreTrade");
            C27046k.m66711z(tvMoreTrade, 0L, new Function0() { // from class: com.kubi.unify.account.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAccountToggleFragment.m64901B3(c42106aM64930H3);
                }
            }, 1, null);
            if (UnifyGlobalDataManager.f53084a.m64881s().getValue().isUnifyAccount()) {
                KcPrimaryButton tvClassicCheck = c42106aM64930H3.f93444l;
                Intrinsics.checkNotNullExpressionValue(tvClassicCheck, "tvClassicCheck");
                ViewExtKt.m66577h(tvClassicCheck);
                KcPrimaryButton unifyCheck = c42106aM64930H3.f93432C;
                Intrinsics.checkNotNullExpressionValue(unifyCheck, "unifyCheck");
                ViewExtKt.m66594y(unifyCheck);
                KcPrimaryButton btnToggleClassic = c42106aM64930H3.f93434b;
                Intrinsics.checkNotNullExpressionValue(btnToggleClassic, "btnToggleClassic");
                ViewExtKt.m66594y(btnToggleClassic);
                KcPrimaryButton btnToggleUnify = c42106aM64930H3.f93435c;
                Intrinsics.checkNotNullExpressionValue(btnToggleUnify, "btnToggleUnify");
                ViewExtKt.m66577h(btnToggleUnify);
            } else {
                KcPrimaryButton tvClassicCheck2 = c42106aM64930H3.f93444l;
                Intrinsics.checkNotNullExpressionValue(tvClassicCheck2, "tvClassicCheck");
                ViewExtKt.m66594y(tvClassicCheck2);
                KcPrimaryButton btnToggleClassic2 = c42106aM64930H3.f93434b;
                Intrinsics.checkNotNullExpressionValue(btnToggleClassic2, "btnToggleClassic");
                ViewExtKt.m66577h(btnToggleClassic2);
                KcPrimaryButton btnToggleUnify2 = c42106aM64930H3.f93435c;
                Intrinsics.checkNotNullExpressionValue(btnToggleUnify2, "btnToggleUnify");
                ViewExtKt.m66594y(btnToggleUnify2);
                KcPrimaryButton unifyCheck2 = c42106aM64930H3.f93432C;
                Intrinsics.checkNotNullExpressionValue(unifyCheck2, "unifyCheck");
                ViewExtKt.m66577h(unifyCheck2);
            }
            KcPrimaryButton btnToggleClassic3 = c42106aM64930H3.f93434b;
            Intrinsics.checkNotNullExpressionValue(btnToggleClassic3, "btnToggleClassic");
            C27046k.m66711z(btnToggleClassic3, 0L, new Function0() { // from class: com.kubi.unify.account.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAccountToggleFragment.m64902C3(this.f53143b);
                }
            }, 1, null);
            KcPrimaryButton btnToggleUnify3 = c42106aM64930H3.f93435c;
            Intrinsics.checkNotNullExpressionValue(btnToggleUnify3, "btnToggleUnify");
            C27046k.m66711z(btnToggleUnify3, 0L, new Function0() { // from class: com.kubi.unify.account.o
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UnifyAccountToggleFragment.m64903D3(this.f53144b);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: F3 */
    public final View m64929F3(String str, boolean z11) {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BaseTextView baseTextView = new BaseTextView(contextRequireContext);
        baseTextView.setText(str);
        baseTextView.setTextSize(13.0f);
        baseTextView.setPaddingRelative(0, 0, C27040e.m66658b(12), 0);
        baseTextView.setGravity(16);
        C27046k.m66697l(baseTextView, R$font.regular);
        C27046k.m66693h(baseTextView, R$drawable.ic2_success_16, C27040e.m66658b(4), GravityCompat.START);
        C27046k.m66702q(baseTextView, getColorRes(z11 ? R$color.primary : R$color.c_icon60));
        baseTextView.setTextColor(getColorRes(z11 ? R$color.primary : R$color.c_text40));
        return baseTextView;
    }

    /* JADX INFO: renamed from: H3 */
    public final C42106a m64930H3() {
        return (C42106a) this.f53100U.getValue(this, f53099Y[0]);
    }

    /* JADX INFO: renamed from: I3 */
    public final int m64931I3(@NotNull TextView childView, @NotNull View parentView) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        childView.getLocationInWindow(iArr);
        parentView.getLocationInWindow(iArr2);
        Paint.FontMetrics fontMetrics = childView.getPaint().getFontMetrics();
        return (iArr[1] + ((int) (fontMetrics.descent - fontMetrics.ascent))) - iArr2[1];
    }

    /* JADX INFO: renamed from: K3 */
    public final UnifyAccountViewModel m64932K3() {
        return (UnifyAccountViewModel) this.f53101V.getValue();
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle savedInstanceState, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R$layout.fragment_unify_account_toggle, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String f29614d0 = getF29614d0();
        if (f29614d0 == null) {
            f29614d0 = "";
        }
        C43852m.m96595g(f29614d0, "toggleAccountPage", null, null, 12, null);
        m64928A3();
        C24252m0.m58486v(m64932K3().m64948y()).observe(getViewLifecycleOwner(), new C26465b(new Function1() { // from class: com.kubi.unify.account.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountToggleFragment.m64907L3(this.f53136b, (Boolean) obj);
            }
        }));
        C24252m0.m58486v(m64932K3().m64942A()).observe(getViewLifecycleOwner(), new C26465b(new Function1() { // from class: com.kubi.unify.account.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountToggleFragment.m64908M3(this.f53137b, (Boolean) obj);
            }
        }));
        C24252m0.m58486v(m64932K3().m64949z()).observe(getViewLifecycleOwner(), new C26465b(new Function1() { // from class: com.kubi.unify.account.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountToggleFragment.m64909N3(this.f53138b, (String) obj);
            }
        }));
        C24252m0.m58486v(m64932K3().m64947x()).observe(getViewLifecycleOwner(), new C26465b(new Function1() { // from class: com.kubi.unify.account.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountToggleFragment.m64910O3(this.f53139b, (List) obj);
            }
        }));
        m64933y3(UnifyGlobalDataManager.f53084a.m64884v().getValue());
        m64925w3();
    }

    public UnifyAccountToggleFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewModels$default$1
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
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewModels$default$2
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
        this.f53101V = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(UnifyAccountViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m103549viewModels$lambda1(lazy).getMViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.kubi.unify.account.UnifyAccountToggleFragment$special$$inlined$viewModels$default$5
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
        this.f53102W = LazyKt.lazy(new Function0() { // from class: com.kubi.unify.account.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountToggleFragment.m64904E3(this.f53140b);
            }
        });
        setPageId("B6UnifiedPage");
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m64902C3(UnifyAccountToggleFragment unifyAccountToggleFragment) {
        String f29614d0 = unifyAccountToggleFragment.getF29614d0();
        if (f29614d0 == null) {
            f29614d0 = "";
        }
        C43852m.m96591c(f29614d0, "toggleAccount", "1", null, 8, null);
        unifyAccountToggleFragment.m64932K3().m64944C(UnifyAccountType.CLASSIC.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m64903D3(UnifyAccountToggleFragment unifyAccountToggleFragment) {
        String f29614d0 = unifyAccountToggleFragment.getF29614d0();
        if (f29614d0 == null) {
            f29614d0 = "";
        }
        C43852m.m96591c(f29614d0, "toggleAccount", "2", null, 8, null);
        unifyAccountToggleFragment.m64932K3().m64944C(UnifyAccountType.UNIFIED.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final String m64904E3(UnifyAccountToggleFragment unifyAccountToggleFragment) {
        String strM56284y;
        Bundle arguments = unifyAccountToggleFragment.getArguments();
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "fromType");
        } else {
            strM56284y = null;
        }
        return C27041f.m66669i(strM56284y, SearchCategory$Companion.SPOT);
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m64907L3(UnifyAccountToggleFragment unifyAccountToggleFragment, Boolean bool) {
        if (bool.booleanValue()) {
            unifyAccountToggleFragment.showLoadingDialog();
        } else {
            BaseFragment.hideLoadingDialog$default(unifyAccountToggleFragment, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m64908M3(UnifyAccountToggleFragment unifyAccountToggleFragment, Boolean bool) {
        if (bool.booleanValue()) {
            unifyAccountToggleFragment.m64928A3();
            AccountDialogHelper accountDialogHelper = AccountDialogHelper.f53098a;
            FragmentManager childFragmentManager = unifyAccountToggleFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            String accountType = UnifyGlobalDataManager.f53084a.m64881s().getValue().getAccountType();
            if (accountType == null) {
                accountType = "";
            }
            accountDialogHelper.m64900j(childFragmentManager, accountType, unifyAccountToggleFragment.m64906J3());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m64909N3(UnifyAccountToggleFragment unifyAccountToggleFragment, String str) {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(unifyAccountToggleFragment), null, null, new UnifyAccountToggleFragment$onViewCreated$3$1(unifyAccountToggleFragment, str, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    private final void m64925w3() {
        C42106a c42106aM64930H3 = m64930H3();
        if (c42106aM64930H3 == null) {
            return;
        }
        c42106aM64930H3.f93442j.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC26464a(c42106aM64930H3, this));
        c42106aM64930H3.f93438f.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.kubi.unify.account.p
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i11, int i12, int i13, int i14) {
                UnifyAccountToggleFragment.m64926x3(this.f53145a, nestedScrollView, i11, i12, i13, i14);
            }
        });
    }

    /* JADX INFO: renamed from: y3 */
    public final void m64933y3(UnifyConfig unifyConfig) {
        int i11;
        C42106a c42106aM64930H3 = m64930H3();
        if (c42106aM64930H3 != null) {
            c42106aM64930H3.f93430A.setText(new C27096v0().append(" • " + getString(R$string.unify_use_rule_2, String.valueOf(unifyConfig.getVipLevel()))).m66903c("  " + getString(R$string.unify_review_vip_level) + Typography.greater, new C27018c0(R$color.primary, new View.OnClickListener() { // from class: com.kubi.unify.account.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UnifyAccountToggleFragment.m64927z3(view);
                }
            })));
            List<String> serviceLines = unifyConfig.getServiceLines();
            if (serviceLines == null) {
                serviceLines = CollectionsKt.emptyList();
            }
            boolean zContains = serviceLines.contains(UnifySupportService.MARGIN.getValue());
            FlexboxLayout flexboxLayout = c42106aM64930H3.f93440h;
            if (zContains) {
                i11 = R$string.unify_trade_type_margin;
            } else {
                i11 = R$string.unify_trade_type_margin_offline;
            }
            String string = getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            flexboxLayout.addView(m64929F3(string, zContains));
            c42106aM64930H3.f93441i.removeAllViews();
            FlexboxLayout flexboxLayout2 = c42106aM64930H3.f93441i;
            String string2 = getString(R$string.unify_trade_type_bot);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            flexboxLayout2.addView(m64905G3(this, string2, false, 2, null));
            FlexboxLayout flexboxLayout3 = c42106aM64930H3.f93441i;
            String string3 = getString(R$string.unify_trade_type_copytrading);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            flexboxLayout3.addView(m64905G3(this, string3, false, 2, null));
            FlexboxLayout flexboxLayout4 = c42106aM64930H3.f93441i;
            String string4 = getString(R$string.unify_trade_type_financial);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            flexboxLayout4.addView(m64905G3(this, string4, false, 2, null));
            FlexboxLayout flexboxLayout5 = c42106aM64930H3.f93441i;
            String string5 = getString(R$string.unify_trade_type_kcs);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            flexboxLayout5.addView(m64905G3(this, string5, false, 2, null));
            FlexboxLayout flexboxLayout6 = c42106aM64930H3.f93441i;
            String string6 = getString(R$string.unify_trade_type_redpackage);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            flexboxLayout6.addView(m64905G3(this, string6, false, 2, null));
        }
    }
}
