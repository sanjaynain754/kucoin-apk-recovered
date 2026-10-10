package com.kubi.home.navigation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.home.R$color;
import com.kubi.home.R$font;
import com.kubi.home.R$layout;
import com.kubi.home.exception.HomeException;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.api.IWalletService;
import fj.C37527k;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: Web3TabView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/home/navigation/Web3TabView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/home/databinding/HomeLayoutNavigationWeb3tabBinding;", "getBinding", "()Lcom/kubi/home/databinding/HomeLayoutNavigationWeb3tabBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "adjustTabWidth", "", "durationBlock", "", "onClickAction", "animationTabBlock", "rootViewGroup", "Landroid/view/ViewGroup;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWeb3TabView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Web3TabView.kt\ncom/kubi/home/navigation/Web3TabView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,168:1\n52#2:169\n80#2,7:170\n47#3,4:177\n91#4,14:181\n*S KotlinDebug\n*F\n+ 1 Web3TabView.kt\ncom/kubi/home/navigation/Web3TabView\n*L\n45#1:169\n45#1:170,7\n57#1:177,4\n119#1:181,14\n*E\n"})
public final class Web3TabView extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ KProperty<Object>[] f25891d = {Reflection.property1(new PropertyReference1Impl(Web3TabView.class, "binding", "getBinding()Lcom/kubi/home/databinding/HomeLayoutNavigationWeb3tabBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f25892b;

    /* JADX INFO: renamed from: c */
    public final long f25893c;

    /* JADX INFO: renamed from: com.kubi.home.navigation.Web3TabView$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Web3TabView.kt\ncom/kubi/home/navigation/Web3TabView\n+ 3 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,49:1\n58#2:50\n59#2:53\n47#3,2:51\n*S KotlinDebug\n*F\n+ 1 Web3TabView.kt\ncom/kubi/home/navigation/Web3TabView\n*L\n58#1:51,2\n*E\n"})
    public static final class C14696a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C43846g.m96568c(new HomeException(exception, "Web3TabView", false, null, 8, null), null, 2, null);
        }

        public C14696a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.navigation.Web3TabView$b */
    /* JADX INFO: compiled from: Web3TabView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14698b implements Function0<Unit> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BaseTextView f25894b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Web3TabView f25895c;

        public C14698b(BaseTextView baseTextView, Web3TabView web3TabView) {
            this.f25894b = baseTextView;
            this.f25895c = web3TabView;
        }

        /* JADX INFO: renamed from: a */
        public final void m29694a() {
            BaseTextView baseTextView;
            int color = ContextCompat.getColor(this.f25894b.getContext(), R$color.c_text);
            Typeface font = ResourcesCompat.getFont(this.f25894b.getContext(), R$font.medium);
            C37527k binding = this.f25895c.getBinding();
            if (binding == null || (baseTextView = binding.f83354d) == null) {
                return;
            }
            baseTextView.setTextColor(color);
            baseTextView.setTypeface(font);
        }

        @Override // p852kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m29694a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.navigation.Web3TabView$c */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Web3TabView.kt\ncom/kubi/home/navigation/Web3TabView\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n120#3,9:125\n94#4:134\n93#5:135\n*E\n"})
    public static final class C14699c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BaseTextView f25896a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Web3TabView f25897b;

        public C14699c(BaseTextView baseTextView, Web3TabView web3TabView) {
            this.f25896a = baseTextView;
            this.f25897b = web3TabView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            C27100x0.m66923d(new C14698b(this.f25896a, this.f25897b));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@NotNull Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NotNull Animator animator) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Web3TabView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m29690j(Web3TabView web3TabView) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        int color = ContextCompat.getColor(web3TabView.getContext(), R$color.c_text60);
        Typeface font = ResourcesCompat.getFont(web3TabView.getContext(), R$font.regular);
        C37527k binding = web3TabView.getBinding();
        if (binding != null && (baseTextView3 = binding.f83353c) != null) {
            baseTextView3.setBackgroundColor(0);
            baseTextView3.setTextColor(color);
            baseTextView3.setTypeface(font);
        }
        C37527k binding2 = web3TabView.getBinding();
        if (binding2 != null && (baseTextView = binding2.f83355e) != null) {
            ViewExtKt.m66594y(baseTextView);
            C37527k binding3 = web3TabView.getBinding();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(baseTextView, "translationX", C27039d.m66650j((binding3 == null || (baseTextView2 = binding3.f83353c) == null) ? null : Integer.valueOf(baseTextView2.getLeft())) - baseTextView.getLeft(), 0.0f);
            objectAnimatorOfFloat.setDuration(web3TabView.f25893c);
            objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
            Intrinsics.checkNotNull(objectAnimatorOfFloat);
            objectAnimatorOfFloat.addListener(new C14699c(baseTextView, web3TabView));
            objectAnimatorOfFloat.start();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Web3TabView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C37527k getBinding() {
        return (C37527k) this.f25892b.getValue(this, f25891d[0]);
    }

    /* JADX INFO: renamed from: g */
    public final void m29691g() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Web3TabView.m29689h(this.f25898b);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m29692i() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.home.navigation.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Web3TabView.m29690j(this.f25922b);
            }
        });
    }

    public /* synthetic */ Web3TabView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m29686d(Web3TabView web3TabView) {
        web3TabView.m29693k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m29689h(Web3TabView web3TabView) {
        C37527k binding = web3TabView.getBinding();
        if (binding != null) {
            C41696j.m91104d(C41713n0.m91125a(C42911a.m94120b().plus(new C14696a(CoroutineExceptionHandler.INSTANCE))), null, null, new Web3TabView$adjustTabWidth$1$2(binding, null), 3, null);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public final void m29693k() {
        FragmentActivity fragmentActivity;
        LifecycleCoroutineScope lifecycleScope;
        Context context = getContext();
        if (context instanceof FragmentActivity) {
            fragmentActivity = (FragmentActivity) context;
        } else {
            fragmentActivity = null;
        }
        if (fragmentActivity != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivity)) != null) {
            lifecycleScope.launchWhenStarted(new Web3TabView$onClickAction$1(this, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Web3TabView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f25892b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37527k>() { // from class: com.kubi.home.navigation.Web3TabView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37527k invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37527k.m84516a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.home_layout_navigation_web3tab, (ViewGroup) this, true);
        C37527k binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f83353c) != null) {
            baseTextView2.setText(IWalletService.f54542a.get().mo66943c());
        }
        C37527k binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f83354d) != null) {
            C27046k.m66710y(baseTextView, 1500L, new Function0() { // from class: com.kubi.home.navigation.y
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Web3TabView.m29686d(this.f25921b);
                }
            });
        }
        m29691g();
        this.f25893c = 400L;
    }
}
