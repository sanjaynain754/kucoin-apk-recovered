package bw;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.view.OneShotPreDrawListener;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$drawable;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: bw.d0 */
/* JADX INFO: compiled from: DialogMotionHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002J0\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J2\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eJ0\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eH\u0002JF\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eJ<\u0010#\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eJ8\u0010%\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eH\u0002J<\u0010&\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001eJ2\u0010(\u001a\u00020\f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0*2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, m90084d2 = {"Lcom/kubi/resources/dialog/DialogMotionHelper;", "", "<init>", "()V", "DEFAULT_TARGET_DIM_AMOUNT", "", "activeSpringAnimations", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/dynamicanimation/animation/SpringAnimation;", "addActiveSpringAnimation", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "springAnim", "cancelActiveSpringAnimations", "createDimAnimator", "Landroid/animation/ValueAnimator;", InterfaceC33953u5.f72199F, "Landroid/view/Window;", "startDim", "endDim", TypedValues.TransitionType.S_DURATION, "", "interpolator", "Landroid/view/animation/Interpolator;", "playCenterEnter", "contentView", "targetDimAmount", "onEnd", "Lkotlin/Function0;", "innerPlayCenterEnter", "playCenterExit", "exitYOffsetDp", "durationMs", "playBottomEnter", "initialOffsetDp", "innerPlayBottomEnter", "playBottomExit", "exitOffsetDp", "startAnimationsTogether", "springAnimations", "", "propertyAnimations", "Landroid/animation/Animator;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDialogMotionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,374:1\n1869#2,2:375\n1869#2,2:404\n1869#2,2:406\n93#3,13:377\n93#3,13:391\n1#4:390\n*S KotlinDebug\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper\n*L\n44#1:375,2\n356#1:404,2\n360#1:406,2\n76#1:377,13\n199#1:391,13\n*E\n"})
public final class C4715d0 {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C4715d0 f4670a = new C4715d0();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final WeakHashMap<View, CopyOnWriteArrayList<SpringAnimation>> f4671b = new WeakHashMap<>();

    /* JADX INFO: renamed from: bw.d0$a */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper\n*L\n1#1,414:1\n200#2,13:415\n*E\n"})
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f4672b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4673c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Window f4674d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f4675e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f4676f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Function0 f4677g;

        public a(View view, View view2, Window window, float f11, float f12, Function0 function0) {
            this.f4672b = view;
            this.f4673c = view2;
            this.f4674d = window;
            this.f4675e = f11;
            this.f4676f = f12;
            this.f4677g = function0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            this.f4672b.removeOnAttachStateChangeListener(this);
            if (this.f4673c.isLaidOut()) {
                C4715d0.f4670a.m4760t(this.f4673c, this.f4674d, this.f4675e, this.f4676f, this.f4677g);
            } else {
                View view2 = this.f4673c;
                view2.post(new b(view2, this.f4674d, this.f4675e, this.f4676f, this.f4677g));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* JADX INFO: renamed from: bw.d0$b */
    /* JADX INFO: compiled from: DialogMotionHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDialogMotionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playBottomEnter$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,374:1\n81#2:375\n*S KotlinDebug\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playBottomEnter$2$1\n*L\n204#1:375\n*E\n"})
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f4678b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Window f4679c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f4680d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f4681e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function0<Unit> f4682f;

        /* JADX INFO: renamed from: bw.d0$b$a */
        /* JADX INFO: compiled from: View.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "run", "androidx/core/view/ViewKt$doOnPreDraw$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playBottomEnter$2$1\n*L\n1#1,414:1\n205#2,4:415\n*E\n"})
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f4683b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ View f4684c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Window f4685d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ float f4686e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ float f4687f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Function0 f4688g;

            public a(View view, View view2, Window window, float f11, float f12, Function0 function0) {
                this.f4683b = view;
                this.f4684c = view2;
                this.f4685d = window;
                this.f4686e = f11;
                this.f4687f = f12;
                this.f4688g = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4715d0.f4670a.m4760t(this.f4684c, this.f4685d, this.f4686e, this.f4687f, this.f4688g);
            }
        }

        public b(View view, Window window, float f11, float f12, Function0<Unit> function0) {
            this.f4678b = view;
            this.f4679c = window;
            this.f4680d = f11;
            this.f4681e = f12;
            this.f4682f = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f4678b;
            OneShotPreDrawListener.add(view, new a(view, view, this.f4679c, this.f4680d, this.f4681e, this.f4682f));
            this.f4678b.invalidate();
        }
    }

    /* JADX INFO: renamed from: bw.d0$c */
    /* JADX INFO: compiled from: DialogMotionHelper.kt */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/dialog/DialogMotionHelper$playBottomExit$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4689a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Window f4690b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f4691c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<Unit> f4692d;

        public c(View view, Window window, float f11, Function0<Unit> function0) {
            this.f4689a = view;
            this.f4690b = window;
            this.f4691c = f11;
            this.f4692d = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f4689a.setTranslationY(0.0f);
            this.f4689a.setAlpha(0.0f);
            this.f4690b.setDimAmount(this.f4691c);
            Function0<Unit> function0 = this.f4692d;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: bw.d0$d */
    /* JADX INFO: compiled from: View.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007¸\u0006\u0000"}, m90084d2 = {"androidx/core/view/ViewKt$doOnAttach$1", "Landroid/view/View$OnAttachStateChangeListener;", "onViewAttachedToWindow", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onViewDetachedFromWindow", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnAttach$1\n+ 2 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper\n*L\n1#1,414:1\n77#2,11:415\n*E\n"})
    public static final class d implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f4693b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f4694c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Window f4695d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f4696e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Function0 f4697f;

        public d(View view, View view2, Window window, float f11, Function0 function0) {
            this.f4693b = view;
            this.f4694c = view2;
            this.f4695d = window;
            this.f4696e = f11;
            this.f4697f = function0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            this.f4693b.removeOnAttachStateChangeListener(this);
            if (this.f4694c.isLaidOut()) {
                C4715d0.f4670a.m4761v(this.f4694c, this.f4695d, this.f4696e, this.f4697f);
            } else {
                View view2 = this.f4694c;
                view2.post(new e(view2, this.f4695d, this.f4696e, this.f4697f));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
        }
    }

    /* JADX INFO: renamed from: bw.d0$e */
    /* JADX INFO: compiled from: DialogMotionHelper.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDialogMotionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playCenterEnter$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,374:1\n81#2:375\n*S KotlinDebug\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playCenterEnter$2$1\n*L\n81#1:375\n*E\n"})
    public static final class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f4698b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Window f4699c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f4700d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Function0<Unit> f4701e;

        /* JADX INFO: renamed from: bw.d0$e$a */
        /* JADX INFO: compiled from: View.kt */
        @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, m90084d2 = {"<anonymous>", "", "run", "androidx/core/view/ViewKt$doOnPreDraw$1"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        @SourceDebugExtension({"SMAP\nView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 View.kt\nandroidx/core/view/ViewKt$doOnPreDraw$1\n+ 2 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$playCenterEnter$2$1\n*L\n1#1,414:1\n82#2,2:415\n*E\n"})
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f4702b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ View f4703c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Window f4704d;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ float f4705e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ Function0 f4706f;

            public a(View view, View view2, Window window, float f11, Function0 function0) {
                this.f4702b = view;
                this.f4703c = view2;
                this.f4704d = window;
                this.f4705e = f11;
                this.f4706f = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4715d0.f4670a.m4761v(this.f4703c, this.f4704d, this.f4705e, this.f4706f);
            }
        }

        public e(View view, Window window, float f11, Function0<Unit> function0) {
            this.f4698b = view;
            this.f4699c = window;
            this.f4700d = f11;
            this.f4701e = function0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            View view = this.f4698b;
            OneShotPreDrawListener.add(view, new a(view, view, this.f4699c, this.f4700d, this.f4701e));
            this.f4698b.invalidate();
        }
    }

    /* JADX INFO: renamed from: bw.d0$f */
    /* JADX INFO: compiled from: DialogMotionHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/resources/dialog/DialogMotionHelper$playCenterExit$startAnimationAction$1$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f4707a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Window f4708b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f4709c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0<Unit> f4710d;

        public f(View view, Window window, float f11, Function0<Unit> function0) {
            this.f4707a = view;
            this.f4708b = window;
            this.f4709c = f11;
            this.f4710d = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f4707a.setTranslationY(0.0f);
            this.f4707a.setAlpha(0.0f);
            this.f4708b.setDimAmount(this.f4709c);
            Function0<Unit> function0 = this.f4710d;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: bw.d0$g */
    /* JADX INFO: compiled from: DialogMotionHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"com/kubi/resources/dialog/DialogMotionHelper$startAnimationsTogether$1$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationCancel", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nDialogMotionHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$startAnimationsTogether$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,374:1\n1869#2,2:375\n1869#2,2:377\n*S KotlinDebug\n*F\n+ 1 DialogMotionHelper.kt\ncom/kubi/resources/dialog/DialogMotionHelper$startAnimationsTogether$1$1\n*L\n339#1:375,2\n349#1:377,2\n*E\n"})
    public static final class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<SpringAnimation> f4711a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref.BooleanRef f4712b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0<Unit> f4713c;

        public g(List<SpringAnimation> list, Ref.BooleanRef booleanRef, Function0<Unit> function0) {
            this.f4711a = list;
            this.f4712b = booleanRef;
            this.f4713c = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f4712b.element = true;
            Iterator<T> it = this.f4711a.iterator();
            while (it.hasNext()) {
                ((SpringAnimation) it.next()).cancel();
            }
            this.f4713c.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            this.f4712b.element = true;
            this.f4713c.invoke();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            for (SpringAnimation springAnimation : this.f4711a) {
                if (!springAnimation.isRunning()) {
                    springAnimation.start();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x005d  */
    /* JADX INFO: renamed from: F */
    public static final AnimatorSet m4731F(View view, float f11, Window window, float f12, long j11, Function0 function0) {
        float fFloatValue;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY() + C5275i0.m6236a(f11));
        objectAnimatorOfFloat.setDuration(j11);
        objectAnimatorOfFloat.setInterpolator(new FastOutLinearInInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f);
        objectAnimatorOfFloat2.setDuration(j11);
        objectAnimatorOfFloat2.setInterpolator(new FastOutLinearInInterpolator());
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            Float fValueOf = Float.valueOf(attributes.dimAmount);
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 0.32f;
            }
        } else {
            fFloatValue = 0.32f;
        }
        ValueAnimator valueAnimatorM4759r = f4670a.m4759r(window, fFloatValue, f12, j11, new FastOutLinearInInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorM4759r);
        animatorSet.addListener(new f(view, window, f12, function0));
        animatorSet.start();
        return animatorSet;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m4733I(int i11, Ref.IntRef intRef, List list, Ref.BooleanRef booleanRef, Function0 function0) {
        boolean z11 = true;
        boolean z12 = i11 == 0 || intRef.element == i11;
        if (!list.isEmpty() && !booleanRef.element) {
            z11 = false;
        }
        if (z12 && z11) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m4751u(View view, Window window, float f11, ViewGroup viewGroup, Drawable drawable, Function0 function0) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        window.setDimAmount(f11);
        viewGroup.setBackground(drawable);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m4752w(View view, Window window, float f11, Function0 function0) {
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
        window.setDimAmount(f11);
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public final ValueAnimator m4759r(final Window window, float f11, float f12, long j11, Interpolator interpolator) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f12);
        valueAnimatorOfFloat.setDuration(j11);
        valueAnimatorOfFloat.setInterpolator(interpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bw.t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C4715d0.m4750s(window, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "apply(...)");
        return valueAnimatorOfFloat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m4728A(C4715d0 c4715d0, View view, Window window, float f11, float f12, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f11 = 250.0f;
        }
        float f13 = f11;
        if ((i11 & 8) != 0) {
            f12 = 0.0f;
        }
        float f14 = f12;
        if ((i11 & 16) != 0) {
            function0 = null;
        }
        c4715d0.m4763z(view, window, f13, f14, function0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m4729C(C4715d0 c4715d0, View view, Window window, float f11, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                Float fValueOf = Float.valueOf(attributes.dimAmount);
                if (fValueOf.floatValue() <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    f11 = fValueOf.floatValue();
                } else {
                    f11 = 0.32f;
                }
            } else {
                f11 = 0.32f;
            }
        }
        if ((i11 & 8) != 0) {
            function0 = null;
        }
        c4715d0.m4754B(view, window, f11, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m4730E(C4715d0 c4715d0, View view, Window window, float f11, long j11, float f12, Function0 function0, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f11 = 150.0f;
        }
        float f13 = f11;
        if ((i11 & 8) != 0) {
            j11 = 140;
        }
        long j12 = j11;
        if ((i11 & 16) != 0) {
            f12 = 0.0f;
        }
        c4715d0.m4755D(view, window, f13, j12, f12, (i11 & 32) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: J */
    public static final void m4734J(Ref.IntRef intRef, Function0 function0, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        intRef.element++;
        function0.invoke();
    }

    /* JADX INFO: renamed from: n */
    public static final CopyOnWriteArrayList m4747n(View view) {
        return new CopyOnWriteArrayList();
    }

    /* JADX INFO: renamed from: p */
    public static final void m4749p(View view, SpringAnimation springAnimation, DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
        WeakHashMap<View, CopyOnWriteArrayList<SpringAnimation>> weakHashMap = f4671b;
        CopyOnWriteArrayList<SpringAnimation> copyOnWriteArrayList = weakHashMap.get(view);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(springAnimation);
        }
        CopyOnWriteArrayList<SpringAnimation> copyOnWriteArrayList2 = weakHashMap.get(view);
        if (copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.isEmpty()) {
            return;
        }
        weakHashMap.remove(view);
    }

    /* JADX INFO: renamed from: s */
    public static final void m4750s(Window window, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        window.setDimAmount(((Float) animatedValue).floatValue());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m4753y(C4715d0 c4715d0, View view, Window window, float f11, float f12, Function0 function0, int i11, Object obj) {
        float fFloatValue;
        if ((i11 & 4) != 0) {
            f11 = 250.0f;
        }
        float f13 = f11;
        if ((i11 & 8) != 0) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                Float fValueOf = Float.valueOf(attributes.dimAmount);
                if (fValueOf.floatValue() <= 0.0f) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 0.32f;
                }
            } else {
                fFloatValue = 0.32f;
            }
            f12 = fFloatValue;
        }
        c4715d0.m4762x(view, window, f13, f12, (i11 & 16) != 0 ? null : function0);
    }

    /* JADX INFO: renamed from: B */
    public final void m4754B(@NotNull View contentView, @NotNull Window window, float f11, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(window, "window");
        m4758q(contentView);
        contentView.setAlpha(0.0f);
        if (!contentView.isAttachedToWindow()) {
            contentView.addOnAttachStateChangeListener(new d(contentView, contentView, window, f11, function0));
        } else if (contentView.isLaidOut()) {
            f4670a.m4761v(contentView, window, f11, function0);
        } else {
            contentView.post(new e(contentView, window, f11, function0));
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4755D(@NotNull final View contentView, @NotNull final Window window, final float f11, final long j11, final float f12, @Nullable final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(window, "window");
        final Function0 function1 = new Function0() { // from class: bw.u
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4715d0.m4731F(contentView, f11, window, f12, j11, function0);
            }
        };
        if (contentView.getHeight() != 0 || f11 == 0.0f) {
            function1.invoke();
        } else {
            contentView.post(new Runnable() { // from class: bw.v
                @Override // java.lang.Runnable
                public final void run() {
                    C4715d0.m4732G(function1);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m4757m(final View view, final SpringAnimation springAnimation) {
        WeakHashMap<View, CopyOnWriteArrayList<SpringAnimation>> weakHashMap = f4671b;
        final Function1 function1 = new Function1() { // from class: bw.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4715d0.m4747n((View) obj);
            }
        };
        weakHashMap.computeIfAbsent(view, new Function() { // from class: bw.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return C4715d0.m4748o(function1, obj);
            }
        }).add(springAnimation);
        springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: bw.c0
            @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                C4715d0.m4749p(view, springAnimation, dynamicAnimation, z11, f11, f12);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m4758q(View view) {
        CopyOnWriteArrayList<SpringAnimation> copyOnWriteArrayList = f4671b.get(view);
        if (copyOnWriteArrayList != null) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((SpringAnimation) it.next()).cancel();
            }
        }
        f4671b.remove(view);
    }

    /* JADX INFO: renamed from: v */
    public final void m4761v(final View view, final Window window, final float f11, final Function0<Unit> function0) {
        view.setTranslationY(C5275i0.m6236a(150.0f));
        window.setDimAmount(0.0f);
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.TRANSLATION_Y, 0.0f);
        springAnimation.getSpring().setStiffness(400.0f);
        springAnimation.getSpring().setDampingRatio(0.7f);
        m4757m(view, springAnimation);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(new FastOutLinearInInterpolator());
        m4756H(CollectionsKt.listOf(springAnimation), CollectionsKt.listOf((Object[]) new ValueAnimator[]{objectAnimatorOfFloat, m4759r(window, 0.0f, f11, 250L, new FastOutLinearInInterpolator())}), new Function0() { // from class: bw.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4715d0.m4752w(view, window, f11, function0);
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final void m4762x(@NotNull View contentView, @NotNull Window window, float f11, float f12, @Nullable Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(window, "window");
        m4758q(contentView);
        contentView.setAlpha(0.0f);
        if (!contentView.isAttachedToWindow()) {
            contentView.addOnAttachStateChangeListener(new a(contentView, contentView, window, f11, f12, function0));
        } else if (contentView.isLaidOut()) {
            f4670a.m4760t(contentView, window, f11, f12, function0);
        } else {
            contentView.post(new b(contentView, window, f11, f12, function0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x006b  */
    /* JADX INFO: renamed from: z */
    public final void m4763z(@NotNull View contentView, @NotNull Window window, float f11, float f12, @Nullable Function0<Unit> function0) {
        float fFloatValue;
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        Intrinsics.checkNotNullParameter(window, "window");
        m4758q(contentView);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) View.TRANSLATION_Y, contentView.getTranslationY() + C5275i0.m6236a(f11));
        objectAnimatorOfFloat.setDuration(230L);
        objectAnimatorOfFloat.setInterpolator(new FastOutLinearInInterpolator());
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) View.ALPHA, contentView.getAlpha(), 0.0f);
        objectAnimatorOfFloat2.setDuration(230L);
        objectAnimatorOfFloat2.setInterpolator(new FastOutLinearInInterpolator());
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (attributes != null) {
            Float fValueOf = Float.valueOf(attributes.dimAmount);
            if (fValueOf.floatValue() <= 0.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 0.32f;
            }
        } else {
            fFloatValue = 0.32f;
        }
        ValueAnimator valueAnimatorM4759r = m4759r(window, fFloatValue, f12, 230L, new FastOutLinearInInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, valueAnimatorM4759r);
        animatorSet.addListener(new c(contentView, window, f12, function0));
        animatorSet.start();
    }

    /* JADX INFO: renamed from: G */
    public static final void m4732G(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: o */
    public static final CopyOnWriteArrayList m4748o(Function1 function1, Object obj) {
        return (CopyOnWriteArrayList) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: H */
    public final void m4756H(List<SpringAnimation> list, final List<? extends Animator> list2, final Function0<Unit> function0) {
        if (list.isEmpty() && list2.isEmpty()) {
            function0.invoke();
            return;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final int size = list.size();
        final Function0 function1 = new Function0() { // from class: bw.y
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4715d0.m4733I(size, intRef, list2, booleanRef, function0);
            }
        };
        if (!list2.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(list2);
            animatorSet.addListener(new g(list, booleanRef, function1));
            animatorSet.start();
        } else {
            for (SpringAnimation springAnimation : list) {
                if (!springAnimation.isRunning()) {
                    springAnimation.start();
                }
            }
        }
        if (size > 0) {
            for (SpringAnimation springAnimation2 : list) {
                springAnimation2.addEndListener(new DynamicAnimation.OnAnimationEndListener() { // from class: bw.z
                    @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z11, float f11, float f12) {
                        C4715d0.m4734J(intRef, function1, dynamicAnimation, z11, f11, f12);
                    }
                });
                if (list2.isEmpty() && !springAnimation2.isRunning()) {
                    springAnimation2.start();
                }
            }
            return;
        }
        function1.invoke();
    }

    /* JADX INFO: renamed from: t */
    public final void m4760t(final View view, final Window window, float f11, final float f12, final Function0<Unit> function0) {
        ViewGroup viewGroup;
        float fM6236a = C5275i0.m6236a(f11);
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        final ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 == null) {
            return;
        }
        final Drawable background = viewGroup2.getBackground();
        viewGroup2.setBackground(ContextCompat.getDrawable(viewGroup2.getContext(), R$drawable.shape_bottom_sheet_dlaog_anim_back));
        view.setTranslationY(fM6236a);
        view.setAlpha(1.0f);
        window.setDimAmount(0.0f);
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.TRANSLATION_Y, 0.0f);
        springAnimation.getSpring().setStiffness(210.0f);
        springAnimation.getSpring().setDampingRatio(0.7f);
        m4757m(view, springAnimation);
        m4756H(CollectionsKt.listOf(springAnimation), CollectionsKt.listOf(m4759r(window, 0.0f, f12, 300L, new FastOutLinearInInterpolator())), new Function0() { // from class: bw.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C4715d0.m4751u(view, window, f12, viewGroup2, background, function0);
            }
        });
    }
}
