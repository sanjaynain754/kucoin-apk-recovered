package com.kubi.sdk.mode.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.airbnb.lottie.C5080h;
import com.airbnb.lottie.InterfaceC5089l0;
import com.airbnb.lottie.LottieAnimationView;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.R$layout;
import com.kubi.sdk.mode.R$raw;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.widget.SwitchLayout;
import com.kubi.sdk.site.SiteType;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27100x0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p610rz.C44202c;
import p742wz.C45960a;
import p742wz.C45962c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import ro.C44128b;
import w00.C45682f;

/* JADX INFO: compiled from: SwitchLayout.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J&\u0010\u001d\u001a\u00020\u00192\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001f2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fJ\u0018\u0010!\u001a\u00020\u00192\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001fJ\u0014\u0010\"\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001fJ\u0016\u0010#\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0002J\u000e\u0010%\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010&\u001a\u00020\u00192\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0002J\u001e\u0010'\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00190\u001fH\u0002R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\u0016\u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00170\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/sdk/mode/widget/SwitchLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/kubi/sdk/mode/databinding/SwitchLayoutBinding;", "getBinding", "()Lcom/kubi/sdk/mode/databinding/SwitchLayoutBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "config", "Lcom/kubi/sdk/mode/SwitchConfig;", "uiHandler", "Landroid/os/Handler;", "animMap", "", "Lcom/kubi/sdk/mode/AppMode;", "Lkotlin/Pair;", "displayLayout", "", "fromEqualTo", "", "initLayoutView", "showAnimationAction", "onStartOut", "Lkotlin/Function0;", "onFinish", "showAnimationIn", "showAnimationOut", "animationIn", "onEnd", "fadeInAnim", "animationOut", "animationOther", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSwitchLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwitchLayout.kt\ncom/kubi/sdk/mode/widget/SwitchLayout\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,247:1\n52#2:248\n80#2,7:249\n1#3:256\n91#4,14:257\n*S KotlinDebug\n*F\n+ 1 SwitchLayout.kt\ncom/kubi/sdk/mode/widget/SwitchLayout\n*L\n39#1:248\n39#1:249,7\n240#1:257,14\n*E\n"})
public final class SwitchLayout extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f47147f = {Reflection.property1(new PropertyReference1Impl(SwitchLayout.class, "binding", "getBinding()Lcom/kubi/sdk/mode/databinding/SwitchLayoutBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f47148b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public SwitchConfig f47149c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Handler f47150d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Map<AppMode, Map<AppMode, Pair<Integer, Integer>>> f47151e;

    /* JADX INFO: renamed from: com.kubi.sdk.mode.widget.SwitchLayout$a */
    /* JADX INFO: compiled from: SwitchLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/sdk/mode/widget/SwitchLayout$animationIn$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23896a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LottieAnimationView f47152a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0<Unit> f47153b;

        public C23896a(LottieAnimationView lottieAnimationView, Function0<Unit> function0) {
            this.f47152a = lottieAnimationView;
            this.f47153b = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f47152a.removeAnimatorListener(this);
            this.f47153b.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: q */
    public static final void m57303q(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, C5080h c5080h) {
        booleanRef.element = true;
        m57305s(booleanRef, booleanRef2, booleanRef3, lottieAnimationView, lottieAnimationView2);
    }

    /* JADX INFO: renamed from: r */
    public static final void m57304r(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, C5080h c5080h) {
        booleanRef.element = true;
        m57305s(booleanRef2, booleanRef, booleanRef3, lottieAnimationView, lottieAnimationView2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public static final void m57281A() {
        C44128b.m97266j("LiteTag", "fadeInAnim");
    }

    /* JADX INFO: renamed from: D */
    public static final Unit m57282D(SwitchLayout switchLayout, SwitchConfig switchConfig) {
        Integer numValueOf;
        Pair<Integer, Integer> pair;
        C44128b.m97266j("LiteTag", "SwitchLayout initLayoutView1");
        C44202c binding = switchLayout.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        AppMode fromAppMode = switchConfig.getFromAppMode();
        AppMode toAppMode = switchConfig.getToAppMode();
        C44128b.m97266j("LiteTag", "from=" + fromAppMode + ",to=" + toAppMode + " [isZh=" + MultiLanguageManager.m56980j() + ']');
        if (C45960a.f103398a.m101389d() && Intrinsics.areEqual(SiteInfoManager.f47913a.m58109c(), SiteType.Global.getSiteType())) {
            Map<AppMode, Pair<Integer, Integer>> map = switchLayout.f47151e.get(fromAppMode);
            if (map == null || (pair = map.get(toAppMode)) == null) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf((MultiLanguageManager.m56980j() ? pair.getSecond() : pair.getFirst()).intValue());
            }
        } else {
            numValueOf = Integer.valueOf(R$raw.logo_common);
        }
        C44128b.m97266j("LiteTag", "anim=" + numValueOf);
        if (numValueOf != null) {
            binding.f97548d.setAnimation(numValueOf.intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F */
    public static final Unit m57283F(final SwitchLayout switchLayout, SwitchConfig switchConfig, final Function0 function0, final Function0 function1) {
        switchLayout.f47150d.postDelayed(new Runnable() { // from class: xz.o
            @Override // java.lang.Runnable
            public final void run() {
                SwitchLayout.m57284G(function0, switchLayout, function1);
            }
        }, switchConfig.getAnimationDurationHold());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G */
    public static final void m57284G(Function0 function0, SwitchLayout switchLayout, final Function0 function1) {
        if (function0 != null) {
            function0.invoke();
        }
        switchLayout.m57316v(new Function0() { // from class: xz.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57285H(function1);
            }
        });
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m57285H(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m57286J(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C44202c getBinding() {
        return (C44202c) this.f47148b.getValue(this, f47147f[0]);
    }

    /* JADX INFO: renamed from: s */
    public static final void m57305s(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.BooleanRef booleanRef3, final LottieAnimationView lottieAnimationView, final LottieAnimationView lottieAnimationView2) {
        if (booleanRef.element && booleanRef2.element && !booleanRef3.element) {
            booleanRef3.element = true;
            lottieAnimationView.postDelayed(new Runnable() { // from class: xz.e
                @Override // java.lang.Runnable
                public final void run() {
                    SwitchLayout.m57306t(lottieAnimationView, lottieAnimationView2);
                }
            }, 100L);
            return;
        }
        C45962c.m101397c(C45962c.f103401a, "[animationIn] tryStart return bgReady:" + booleanRef.element + ", logoReady:" + booleanRef2.element + ", waited:" + booleanRef3.element, null, 1, null);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m57310B() {
        SwitchConfig switchConfig = this.f47149c;
        if (switchConfig != null) {
            return switchConfig.fromEqualTo();
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final void m57311C(final SwitchConfig switchConfig) {
        C27100x0.m66923d(new Function0() { // from class: xz.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57282D(this.f103915b, switchConfig);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m57312E(@Nullable final Function0<Unit> function0, @Nullable final Function0<Unit> function1) {
        final SwitchConfig switchConfig = this.f47149c;
        if (switchConfig == null) {
            return;
        }
        m57315o(new Function0() { // from class: xz.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57283F(this.f103925b, switchConfig, function0, function1);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final void m57313I(@Nullable final Function0<Unit> function0) {
        C44128b.m97266j("LiteTag", "showAnimationIn");
        m57315o(new Function0() { // from class: xz.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57286J(function0);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final void m57314K(@NotNull final Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        C44128b.m97266j("LiteTag", "showAnimationOut");
        m57316v(new Function0() { // from class: xz.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57287L(onFinish);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public final void m57315o(final Function0<Unit> function0) {
        C27100x0.m66923d(new Function0() { // from class: xz.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57302p(this.f103929b, function0);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m57316v(final Function0<Unit> function0) {
        C27100x0.m66923d(new Function0() { // from class: xz.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SwitchLayout.m57308w(this.f103931b, function0);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m57317y(@NotNull SwitchConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f47149c = config;
        C44128b.m97266j("LiteTag", "SwitchLayout displayLayout");
        m57311C(config);
    }

    /* JADX INFO: renamed from: z */
    public final void m57318z(@NotNull SwitchConfig config) {
        FrameLayout frameLayout;
        Intrinsics.checkNotNullParameter(config, "config");
        C44202c binding = getBinding();
        if (binding == null || (frameLayout = binding.f97549e) == null) {
            return;
        }
        m57311C(config);
        C45962c.m101397c(C45962c.f103401a, "[fadeInAnim] config:" + config, null, 1, null);
        frameLayout.setAlpha(0.0f);
        frameLayout.animate().alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: xz.g
            @Override // java.lang.Runnable
            public final void run() {
                SwitchLayout.m57281A();
            }
        }).start();
    }

    public /* synthetic */ SwitchLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m57287L(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m57302p(SwitchLayout switchLayout, Function0 function0) {
        C44202c binding = switchLayout.getBinding();
        if (binding == null) {
            return Unit.INSTANCE;
        }
        final LottieAnimationView modeBg = binding.f97547c;
        Intrinsics.checkNotNullExpressionValue(modeBg, "modeBg");
        final LottieAnimationView modeLogo = binding.f97548d;
        Intrinsics.checkNotNullExpressionValue(modeLogo, "modeLogo");
        FrameLayout modeLottie = binding.f97549e;
        Intrinsics.checkNotNullExpressionValue(modeLottie, "modeLottie");
        C45962c.m101397c(C45962c.f103401a, "[animationIn] fadeView alpha 1", null, 1, null);
        modeLottie.setAlpha(1.0f);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        modeLogo.removeAllAnimatorListeners();
        modeLogo.addAnimatorListener(new C23896a(modeLogo, function0));
        modeBg.addLottieOnCompositionLoadedListener(new InterfaceC5089l0() { // from class: xz.m
            @Override // com.airbnb.lottie.InterfaceC5089l0
            /* JADX INFO: renamed from: a */
            public final void mo5522a(C5080h c5080h) {
                SwitchLayout.m57303q(booleanRef2, booleanRef3, booleanRef, modeBg, modeLogo, c5080h);
            }
        });
        modeLogo.addLottieOnCompositionLoadedListener(new InterfaceC5089l0() { // from class: xz.n
            @Override // com.airbnb.lottie.InterfaceC5089l0
            /* JADX INFO: renamed from: a */
            public final void mo5522a(C5080h c5080h) {
                SwitchLayout.m57304r(booleanRef3, booleanRef2, booleanRef, modeBg, modeLogo, c5080h);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final void m57306t(final LottieAnimationView lottieAnimationView, final LottieAnimationView lottieAnimationView2) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: xz.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                SwitchLayout.m57307u(lottieAnimationView, lottieAnimationView2, j11);
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static final void m57307u(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, long j11) {
        lottieAnimationView.playAnimation();
        lottieAnimationView2.playAnimation();
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m57308w(SwitchLayout switchLayout, final Function0 function0) {
        switchLayout.animate().alpha(0.0f).setDuration(400L).setInterpolator(new DecelerateInterpolator()).withEndAction(new Runnable() { // from class: xz.c
            @Override // java.lang.Runnable
            public final void run() {
                SwitchLayout.m57309x(function0);
            }
        }).start();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final void m57309x(Function0 function0) {
        function0.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SwitchLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47148b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44202c>() { // from class: com.kubi.sdk.mode.widget.SwitchLayout$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44202c invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44202c.m97426a(C45682f.m100800a(viewGroup));
            }
        });
        this.f47150d = new Handler(Looper.getMainLooper());
        C44128b.m97266j("LiteTag", "SwitchLayout init");
        LayoutInflater.from(context).inflate(R$layout.switch_layout, (ViewGroup) this, true);
        AppMode appMode = AppMode.Pro;
        AppMode appMode2 = AppMode.Lite;
        Pair pairM90091to = TuplesKt.m90091to(appMode2, new Pair(Integer.valueOf(R$raw.pro_lite), Integer.valueOf(R$raw.pro_lite_ch)));
        AppMode appMode3 = AppMode.Web3;
        this.f47151e = MapsKt.mapOf(TuplesKt.m90091to(appMode, MapsKt.mapOf(pairM90091to, TuplesKt.m90091to(appMode3, new Pair(Integer.valueOf(R$raw.pro_web3), Integer.valueOf(R$raw.pro_web3_ch))))), TuplesKt.m90091to(appMode3, MapsKt.mapOf(TuplesKt.m90091to(appMode2, new Pair(Integer.valueOf(R$raw.web3_lite), Integer.valueOf(R$raw.web3_lite_ch))), TuplesKt.m90091to(appMode, new Pair(Integer.valueOf(R$raw.web3_pro), Integer.valueOf(R$raw.web3_pro_ch))))), TuplesKt.m90091to(appMode2, MapsKt.mapOf(TuplesKt.m90091to(appMode, new Pair(Integer.valueOf(R$raw.lite_pro), Integer.valueOf(R$raw.lite_pro_ch))), TuplesKt.m90091to(appMode3, new Pair(Integer.valueOf(R$raw.lite_web3), Integer.valueOf(R$raw.lite_web3_ch))))));
    }
}
