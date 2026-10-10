package com.kubi.tradefacade.tabs.settings;

import a40.C0123f;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.R$string;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.tradefacade.utils.StorageIds;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;
import w30.C45716c;
import y70.C46392a;

/* JADX INFO: compiled from: TradeTabSortSettingFragment.kt */
/* JADX INFO: loaded from: classes50.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment;", "Lcom/kubi/sdk/BaseFragment;", "<init>", "()V", "binding", "Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeTabSortSettingBinding;", "getBinding", "()Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeTabSortSettingBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adapter", "Lcom/kubi/tradefacade/tabs/settings/TabSortAdapter;", "getAdapter", "()Lcom/kubi/tradefacade/tabs/settings/TabSortAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "inflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "showHandGuideIfNeeded", "dismissHandGuide", "Companion", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeTabSortSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeTabSortSettingFragment.kt\ncom/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,129:1\n147#2,16:130\n136#3:146\n126#3,2:147\n*S KotlinDebug\n*F\n+ 1 TradeTabSortSettingFragment.kt\ncom/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment\n*L\n26#1:130,16\n88#1:146\n91#1:147,2\n*E\n"})
public final class TradeTabSortSettingFragment extends BaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final InterfaceC24293a f52019U = C45681e.m100799e(this, new Function1<TradeTabSortSettingFragment, C45716c>() { // from class: com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C45716c invoke(@NotNull TradeTabSortSettingFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C45716c.m100915a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C45716c, Unit>() { // from class: com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C45716c it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C45716c c45716c) {
            invoke(c45716c);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f52020V = LazyKt.lazy(new Function0() { // from class: com.kubi.tradefacade.tabs.settings.j
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TradeTabSortSettingFragment.m63643o3();
        }
    });

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f52018X = {Reflection.property1(new PropertyReference1Impl(TradeTabSortSettingFragment.class, "binding", "getBinding()Lcom/kubi/tradefacade/databinding/KucoinFragmentTradeTabSortSettingBinding;", 0))};

    /* JADX INFO: renamed from: W */
    @NotNull
    public static final Companion f52017W = new Companion(null);

    /* JADX INFO: compiled from: TradeTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment$Companion;", "", "<init>", "()V", "launchPage", "", "context", "Landroid/content/Context;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launchPage(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            String string = context.getString(R$string.kc_trade_tab_order_settings);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            companion.launch(context, TradeTabSortSettingFragment.class, string);
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment$a */
    /* JADX INFO: compiled from: TradeTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment$onViewCreated$1$4", "Landroidx/recyclerview/widget/RecyclerView$SimpleOnItemTouchListener;", "onInterceptTouchEvent", "", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26003a extends RecyclerView.SimpleOnItemTouchListener {
        public C26003a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.SimpleOnItemTouchListener, androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
        public boolean onInterceptTouchEvent(RecyclerView rv2, MotionEvent e11) {
            Intrinsics.checkNotNullParameter(rv2, "rv");
            Intrinsics.checkNotNullParameter(e11, "e");
            if (e11.getAction() != 0) {
                return false;
            }
            TradeTabSortSettingFragment.this.m63644p3();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.kubi.tradefacade.tabs.settings.TradeTabSortSettingFragment$b */
    /* JADX INFO: compiled from: TradeTabSortSettingFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/tradefacade/tabs/settings/TradeTabSortSettingFragment$showHandGuideIfNeeded$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "TradeFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26004b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LottieAnimationView f52022a;

        public C26004b(LottieAnimationView lottieAnimationView) {
            this.f52022a = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.f52022a.getVisibility() != 0) {
                return;
            }
            final LottieAnimationView lottieAnimationView = this.f52022a;
            lottieAnimationView.post(new Runnable() { // from class: com.kubi.tradefacade.tabs.settings.k
                @Override // java.lang.Runnable
                public final void run() {
                    TradeTabSortSettingFragment.C26004b.m63653b(lottieAnimationView);
                }
            });
        }

        /* JADX INFO: renamed from: b */
        public static final void m63653b(LottieAnimationView lottieAnimationView) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.removeAllUpdateListeners();
            lottieAnimationView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o3 */
    public static final TabSortAdapter m63643o3() {
        return new TabSortAdapter(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: t3 */
    public static final Unit m63645t3(C45716c c45716c, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c45716c.f103090d.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u3 */
    public static final Unit m63646u3(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C0123f.f448a.m588k(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v3 */
    public static final Unit m63647v3(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C0123f.f448a.m589l(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    private final void m63648w3() {
        C45716c c45716cM63650r3;
        StorageIds storageIds = StorageIds.f52040a;
        if (C46392a.m102322d(storageIds.m63673g(), false) || (c45716cM63650r3 = m63650r3()) == null) {
            return;
        }
        C46392a.m102328k(storageIds.m63673g(), true);
        LottieAnimationView lottieAnimationView = c45716cM63650r3.f103092f;
        lottieAnimationView.setRepeatCount(1);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.addAnimatorListener(new C26004b(lottieAnimationView));
        lottieAnimationView.playAnimation();
    }

    @Override // com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final C45716c c45716cM63650r3 = m63650r3();
        if (c45716cM63650r3 != null) {
            AppCompatImageView ivCloseBanner = c45716cM63650r3.f103089c;
            Intrinsics.checkNotNullExpressionValue(ivCloseBanner, "ivCloseBanner");
            ViewExtKt.m66575f(ivCloseBanner, new Function1() { // from class: com.kubi.tradefacade.tabs.settings.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeTabSortSettingFragment.m63645t3(c45716cM63650r3, (View) obj);
                }
            });
            c45716cM63650r3.f103093g.setLayoutManager(new LinearLayoutManager(getContext()));
            RecyclerView recyclerView = c45716cM63650r3.f103093g;
            TabSortAdapter tabSortAdapterM63649q3 = m63649q3();
            C0123f c0123f = C0123f.f448a;
            TabSortAdapter tabSortAdapterM63636x = tabSortAdapterM63649q3.m63636x(c0123f.m586i(), c0123f.m584g(C0123f.a.C46955a.f451a));
            HorizontalScrollView flPreviewTabLayout = c45716cM63650r3.f103088b;
            Intrinsics.checkNotNullExpressionValue(flPreviewTabLayout, "flPreviewTabLayout");
            LinearLayout tabContainer = c45716cM63650r3.f103094h;
            Intrinsics.checkNotNullExpressionValue(tabContainer, "tabContainer");
            recyclerView.setAdapter(tabSortAdapterM63636x.m63634v(new PreviewTabHorizontalLayoutHelper(flPreviewTabLayout, tabContainer)).m63637y(c45716cM63650r3.f103093g).m63635w(new Function1() { // from class: com.kubi.tradefacade.tabs.settings.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeTabSortSettingFragment.m63646u3((List) obj);
                }
            }).m63630A(new Function1() { // from class: com.kubi.tradefacade.tabs.settings.i
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradeTabSortSettingFragment.m63647v3((List) obj);
                }
            }));
            c45716cM63650r3.f103093g.addOnItemTouchListener(new C26003a());
        }
        m63648w3();
    }

    /* JADX INFO: renamed from: q3 */
    public final TabSortAdapter m63649q3() {
        return (TabSortAdapter) this.f52020V.getValue();
    }

    /* JADX INFO: renamed from: r3 */
    public final C45716c m63650r3() {
        return (C45716c) this.f52019U.getValue(this, f52018X[0]);
    }

    @Override // com.kubi.sdk.BaseFragment
    @NotNull
    /* JADX INFO: renamed from: s3, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout onCreateView(@NotNull LayoutInflater inflater, @Nullable Bundle bundle, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ConstraintLayout root = C45716c.m100916c(inflater, viewGroup, false).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public final void m63644p3() {
        LottieAnimationView lottieAnimationView;
        C45716c c45716cM63650r3 = m63650r3();
        if (c45716cM63650r3 != null && (lottieAnimationView = c45716cM63650r3.f103092f) != null && lottieAnimationView.getVisibility() == 0) {
            lottieAnimationView.removeAllAnimatorListeners();
            lottieAnimationView.removeAllUpdateListeners();
            lottieAnimationView.cancelAnimation();
            lottieAnimationView.setVisibility(8);
        }
    }
}
