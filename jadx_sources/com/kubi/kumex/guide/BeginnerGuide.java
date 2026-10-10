package com.kubi.kumex.guide;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.p110rn.Constants;
import com.kubi.resources.guideview.C22893a;
import com.kubi.resources.guideview.C22896d;
import com.kubi.resources.guideview.InterfaceC22894b;
import com.kubi.resources.guideview.MaskView;
import com.kubi.resources.guideview.ViewOnKeyListenerC22895c;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import o00.C42916f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.kubi.kumex.guide.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: BeginnerGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0004J\b\u0010\u001d\u001a\u00020\u001aH\u0004J8\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001a\u0018\u00010$H\u0004J&\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0*H\u0004J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020-0,2\u0006\u0010'\u001a\u00020(H\u0014J!\u0010.\u001a\u0004\u0018\u00010(\"\b\b\u0000\u0010/*\u00020\u00052\u0006\u0010\u0004\u001a\u0002H/H\u0014¢\u0006\u0002\u00100J\b\u00101\u001a\u00020\u001aH\u0004J\u0010\u00102\u001a\u00020\u00122\u0006\u00103\u001a\u00020\u0001H\u0016J\n\u00104\u001a\u0004\u0018\u000105H\u0004J\b\u00106\u001a\u00020\u001aH\u0016J\u0012\u00107\u001a\u00020\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0004J\b\u00108\u001a\u00020\u001aH\u0002R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, m90084d2 = {"Lcom/kubi/kumex/guide/BeginnerGuide;", "Lcom/kubi/kumex/guide/StepGuide;", "<init>", "()V", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "getView", "()Landroid/view/View;", "showView", "rect", "Landroid/graphics/Rect;", "getRect", "()Landroid/graphics/Rect;", "setRect", "(Landroid/graphics/Rect;)V", "animator", "Landroid/animation/ValueAnimator;", "isShowing", "", "()Z", "setShowing", "(Z)V", "isInterceptAnim", "loopDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "endGuide", "", "key", "", "doNext", "generateGuide", "target", "", Constants.COMPONENT, "Lcom/kubi/resources/guideview/Component;", TUIConstants.TUIChat.CALL_BACK, "Lkotlin/Function1;", "Lcom/kubi/resources/guideview/GuideBuilder;", "doAnimation", "behavior", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "onEnd", "Lkotlin/Function0;", "needScroll", "Lkotlin/Pair;", "", "getBehavior", ExifInterface.GPS_DIRECTION_TRUE, "(Landroid/view/View;)Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "interceptAnim", "allowOtherStepGuideFloatToDisplayOnUpper", "other", "getGuide", "Lcom/kubi/resources/guideview/Guide;", TIMPushProvider.f75063o, "realNotify", "startLoop", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBeginnerGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginnerGuide.kt\ncom/kubi/kumex/guide/BeginnerGuide\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,192:1\n91#2,14:193\n372#3:207\n1549#4:208\n1620#4,3:209\n1869#4,2:212\n*S KotlinDebug\n*F\n+ 1 BeginnerGuide.kt\ncom/kubi/kumex/guide/BeginnerGuide\n*L\n107#1:193,14\n174#1:207\n174#1:208\n174#1:209,3\n174#1:212,2\n*E\n"})
public abstract class BeginnerGuide implements StepGuide {

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f29144b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Rect f29145c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ValueAnimator f29146d;

    /* JADX INFO: renamed from: e */
    public boolean f29147e;

    /* JADX INFO: renamed from: f */
    public boolean f29148f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public CompositeDisposable f29149g = new CompositeDisposable();

    /* JADX INFO: renamed from: com.kubi.kumex.guide.d$a */
    /* JADX INFO: compiled from: Animator.kt */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 BeginnerGuide.kt\ncom/kubi/kumex/guide/BeginnerGuide\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n108#3,3:125\n94#4:128\n93#5:129\n*E\n"})
    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function0 f29151b;

        public a(Function0 function0) {
            this.f29151b = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            if (BeginnerGuide.this.f29148f) {
                return;
            }
            this.f29151b.invoke();
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

    /* JADX INFO: renamed from: n */
    public final void m33861n() {
        this.f29148f = true;
        ValueAnimator valueAnimator = this.f29146d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m33850f(AppBarLayout.Behavior behavior, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        behavior.setTopAndBottomOffset(((Integer) animatedValue).intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m33851j(BeginnerGuide beginnerGuide, Object obj, InterfaceC22894b interfaceC22894b, View view, Function1 function1, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateGuide");
        }
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        beginnerGuide.m33858i(obj, interfaceC22894b, view, function1);
    }

    /* JADX INFO: renamed from: s */
    private final void m33852s() {
        Observable<Long> observableObserveOn = Observable.interval(16L, TimeUnit.MILLISECONDS).observeOn(C42916f.m94128g());
        final Function1 function1 = new Function1() { // from class: com.kubi.kumex.guide.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeginnerGuide.m33853t(this.f29134b, (Long) obj);
            }
        };
        Disposable disposableSubscribe = observableObserveOn.subscribe(new Consumer() { // from class: com.kubi.kumex.guide.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                BeginnerGuide.m33854u(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        DisposableKt.addTo(disposableSubscribe, this.f29149g);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m33855e(@NotNull final AppBarLayout.Behavior behavior, @NotNull ValueAnimator animator, @NotNull Function0<Unit> onEnd) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(animator, "animator");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.kubi.kumex.guide.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BeginnerGuide.m33850f(behavior, valueAnimator);
            }
        });
        animator.addListener(new a(onEnd));
        animator.setDuration(500L);
        animator.start();
        this.f29146d = animator;
    }

    /* JADX INFO: renamed from: h */
    public final void m33857h(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        String strM66375i = dataMapUtil.m66375i("kumex_open_guide_2", "");
        if (strM66375i.length() != 0) {
            key = strM66375i + ',' + key;
        }
        dataMapUtil.m66380o("kumex_open_guide_2", key);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
        View view = this.f29144b;
        if (view != null && (view.getTag() instanceof ViewOnKeyListenerC22895c)) {
            Object tag = view.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.kubi.resources.guideview.Guide");
            ((ViewOnKeyListenerC22895c) tag).m54306d();
            view.setTag(null);
        }
        this.f29149g.clear();
        this.f29147e = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m33858i(@NotNull Object target, @NotNull InterfaceC22894b component, @NotNull View view, @Nullable Function1<? super C22896d, Unit> function1) {
        Rect rectM54302b;
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(view, "view");
        C22896d c22896d = new C22896d();
        if (target instanceof View) {
            rectM54302b = C22893a.m54302b((View) target, 0, 0);
        } else {
            if (!(target instanceof Rect)) {
                getF29114c().run();
                return;
            }
            rectM54302b = (Rect) target;
        }
        this.f29145c = rectM54302b;
        C22896d c22896dM54332p = c22896d.m54319c(204).m54332p(rectM54302b);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        C22896d c22896dM54320d = c22896dM54332p.m54321e((int) C27025c.m66565c(context, 4)).m54323g(0).m54324h(4).m54317a(component).m54320d(true);
        if (function1 != null) {
            Intrinsics.checkNotNull(c22896dM54320d);
            function1.invoke(c22896dM54320d);
        }
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM54318b = c22896dM54320d.m54318b();
        view.setTag(viewOnKeyListenerC22895cM54318b);
        this.f29144b = view;
        viewOnKeyListenerC22895cM54318b.m54313k(false);
        Context context2 = view.getContext();
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
        viewOnKeyListenerC22895cM54318b.m54314l((Activity) context2);
        this.f29149g.clear();
        m33852s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: k */
    public <T extends View> AppBarLayout.Behavior mo33799k(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object parent = view.getParent();
        if (parent == null) {
            return null;
        }
        if (!(parent instanceof AppBarLayout)) {
            if (parent instanceof View) {
                return mo33799k((View) parent);
            }
            return null;
        }
        ViewGroup.LayoutParams layoutParams = ((AppBarLayout) parent).getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        AppBarLayout.Behavior behavior2 = behavior instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) behavior : null;
        if (behavior2 == null) {
            return null;
        }
        return behavior2;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public final ViewOnKeyListenerC22895c m33859l() {
        View view = this.f29144b;
        Object tag = view != null ? view.getTag() : null;
        if (tag instanceof ViewOnKeyListenerC22895c) {
            return (ViewOnKeyListenerC22895c) tag;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Rect getF29145c() {
        return this.f29145c;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getF29147e() {
        return this.f29147e;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public Pair<Boolean, Integer> m33863p(@NotNull AppBarLayout.Behavior behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        int iAbs = Math.abs(behavior.getTopAndBottomOffset());
        return iAbs > 0 ? new Pair<>(Boolean.TRUE, Integer.valueOf(-iAbs)) : new Pair<>(Boolean.FALSE, 0);
    }

    /* JADX INFO: renamed from: r */
    public final void m33865r(boolean z11) {
        this.f29147e = z11;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m33853t(BeginnerGuide beginnerGuide, Long l11) {
        beginnerGuide.mo33798W1();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final void m33854u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m33856g() {
        hide();
        getF29114c().run();
    }

    /* JADX INFO: renamed from: q */
    public final void m33864q(@Nullable Rect rect) {
        Integer numValueOf;
        ViewOnKeyListenerC22895c viewOnKeyListenerC22895cM33859l = m33859l();
        if (viewOnKeyListenerC22895cM33859l != null && rect != null) {
            this.f29145c = rect;
            int iM66650j = C27039d.m66650j(Integer.valueOf(rect.top));
            Rect rect2 = this.f29145c;
            if (rect2 != null) {
                numValueOf = Integer.valueOf(rect2.top);
            } else {
                numValueOf = null;
            }
            int iM66650j2 = iM66650j - C27039d.m66650j(numValueOf);
            MaskView maskViewM54307e = viewOnKeyListenerC22895cM33859l.m54307e();
            if (maskViewM54307e != null) {
                maskViewM54307e.setTargetRect(rect);
                IntRange intRangeUntil = RangesKt.until(0, maskViewM54307e.getChildCount());
                ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
                Iterator<Integer> it = intRangeUntil.iterator();
                while (it.hasNext()) {
                    arrayList.add(maskViewM54307e.getChildAt(((IntIterator) it).nextInt()));
                }
                for (View view : arrayList) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin += iM66650j2;
                    }
                    view.setLayoutParams(layoutParams);
                }
                maskViewM54307e.requestLayout();
                return;
            }
            return;
        }
        mo25565q2();
    }
}
