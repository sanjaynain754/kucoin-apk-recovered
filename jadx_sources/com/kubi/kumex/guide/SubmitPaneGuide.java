package com.kubi.kumex.guide;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.kumex.utils.Log;
import com.kubi.resources.guideview.C22893a;
import com.kubi.resources.guideview.C22896d;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SubmitPaneGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0016J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u001f2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0012\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010%2\u0006\u0010\u0004\u001a\u00020#H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/kumex/guide/SubmitPaneGuide;", "Lcom/kubi/kumex/guide/BeginnerGuide;", "priority", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "<init>", "(ILandroid/view/View;Ljava/lang/Runnable;)V", "getPriority", "()I", "getView", "()Landroid/view/View;", "getRunnable", "()Ljava/lang/Runnable;", "step", "showGuide", "", "doShowGuide", "order", "target", "generateStepOne", "Landroid/graphics/Rect;", "showOrderInfoGuide", "generateStepTwo", "showOrderNowGudie", "doShowOrderNow", "generateStepThree", "forceNotifyTranslationY", "needScroll", "Lkotlin/Pair;", "", "itemView", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "behavior", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "getCoordinatorLayout", "getCoordinatorLayoutBehavior", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubmitPaneGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitPaneGuide.kt\ncom/kubi/kumex/guide/SubmitPaneGuide\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n372#2:225\n1549#3:226\n1620#3,3:227\n1869#3,2:230\n*S KotlinDebug\n*F\n+ 1 SubmitPaneGuide.kt\ncom/kubi/kumex/guide/SubmitPaneGuide\n*L\n213#1:225\n213#1:226\n213#1:227,3\n213#1:230,2\n*E\n"})
public final class SubmitPaneGuide extends BeginnerGuide {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f29125l = new Companion(null);

    /* JADX INFO: renamed from: h */
    public final int f29126h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final View f29127i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Runnable f29128j;

    /* JADX INFO: renamed from: k */
    public int f29129k;

    /* JADX INFO: compiled from: SubmitPaneGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/guide/SubmitPaneGuide$Companion;", "", "<init>", "()V", "Key", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m33828G(View view, View view2) {
        Rect rectM54302b = C22893a.m54302b(view, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(view2, 0, 0);
        m33858i(view.getLayoutDirection() == 1 ? new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b.right), rectM54302b2.bottom) : new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom), new SelectDirectionStep(getF29127i().getLayoutDirection() == 1 ? Math.abs(rectM54302b.right) - rectM54302b2.left : rectM54302b2.right - rectM54302b.left, new Function0() { // from class: com.kubi.kumex.guide.n0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33811H(this.f29188b);
            }
        }, new Function0() { // from class: com.kubi.kumex.guide.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33812I(this.f29190b);
            }
        }), view2, new Function1() { // from class: com.kubi.kumex.guide.p0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitPaneGuide.m33813J((C22896d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public final void m33834U() {
        View viewFindViewById;
        this.f29129k = 1;
        Log log = Log.f30813a;
        log.m36615a("pitttttt", "showOrderInfoGuide-1");
        View viewFindViewById2 = getF29127i().findViewById(R$id.tradeType);
        if (viewFindViewById2 == null || (viewFindViewById = getF29127i().findViewById(R$id.percent)) == null) {
            return;
        }
        log.m36615a("pitttttt", "showOrderInfoGuide-2");
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        final boolean z11 = getF29127i().getLayoutDirection() == 1;
        m33858i(z11 ? new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b2.right), rectM54302b2.bottom) : new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom), new OrderInfoStep(rectM54302b2.right - rectM54302b.left, new Function0() { // from class: com.kubi.kumex.guide.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33819V(this.f29199b);
            }
        }, new Function0() { // from class: com.kubi.kumex.guide.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33820W(this.f29201b);
            }
        }), viewFindViewById, new Function1() { // from class: com.kubi.kumex.guide.t0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SubmitPaneGuide.m33821X(z11, (C22896d) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Y */
    public final void m33835Y() {
        CoordinatorLayout coordinatorLayoutM33815O;
        AppBarLayout.Behavior behaviorM33832P;
        this.f29129k = 2;
        View viewFindViewById = getF29127i().findViewById(R$id.action);
        if (viewFindViewById == null || (coordinatorLayoutM33815O = m33815O(getF29127i())) == null || (behaviorM33832P = m33832P(coordinatorLayoutM33815O)) == null) {
            return;
        }
        Pair<Boolean, Integer> pairM33816R = m33816R(viewFindViewById, coordinatorLayoutM33815O, behaviorM33832P);
        if (!pairM33816R.getFirst().booleanValue()) {
            m33829K();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -pairM33816R.getSecond().intValue());
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
        m33855e(behaviorM33832P, valueAnimatorOfInt, new Function0() { // from class: com.kubi.kumex.guide.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33822Z(this.f29208b);
            }
        });
    }

    public SubmitPaneGuide(int i11, @NotNull View view, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29126h = i11;
        this.f29127i = view;
        this.f29128j = runnable;
    }

    /* JADX INFO: renamed from: J */
    public static final Unit m33813J(C22896d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m54324h(4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X */
    public static final Unit m33821X(boolean z11, C22896d builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m54328l(8).m54325i(6).m54326j(z11 ? -6 : 6).m54327k(-6);
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: Q, reason: from getter */
    public View getF29127i() {
        return this.f29127i;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: W1 */
    public void mo33798W1() {
        Rect rectM33830M;
        int i11 = this.f29129k;
        if (i11 != 0) {
            rectM33830M = i11 != 1 ? null : m33831N();
        } else {
            rectM33830M = m33830M();
        }
        if (rectM33830M == null || Intrinsics.areEqual(rectM33830M, getF29145c())) {
            return;
        }
        m33861n();
        m33864q(rectM33830M);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23048c() {
        return this.f29126h;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23049d() {
        return this.f29128j;
    }

    /* JADX INFO: renamed from: H */
    public static final Unit m33811H(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "OrderGuide", "4", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m33812I(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.hide();
        submitPaneGuide.m33834U();
        C43852m.m96591c(C17060n0.m36552b(), "OrderGuide", "1", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static final Unit m33814L(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "OrderGuide", "3", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    private final CoordinatorLayout m33815O(View view) {
        Object parent = view.getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof CoordinatorLayout) {
            return (CoordinatorLayout) parent;
        }
        return m33815O((View) parent);
    }

    /* JADX INFO: renamed from: R */
    private final Pair<Boolean, Integer> m33816R(View view, CoordinatorLayout coordinatorLayout, AppBarLayout.Behavior behavior) {
        int i11;
        int height = coordinatorLayout.getHeight() + behavior.getTopAndBottomOffset();
        boolean z11 = false;
        if (view.getMeasuredHeight() <= 0) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            i11 = C22893a.m54302b(view, 0, 0).bottom;
        } else {
            i11 = C22893a.m54302b(view, 0, 0).bottom;
        }
        coordinatorLayout.getGlobalVisibleRect(new Rect());
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iM66565c = ((int) C27025c.m66565c(context, 54)) + height;
        if (i11 >= iM66565c) {
            z11 = true;
        }
        return new Pair<>(Boolean.valueOf(z11), Integer.valueOf(i11 - iM66565c));
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m33817S(final SubmitPaneGuide submitPaneGuide, final View view, final View view2) {
        submitPaneGuide.getF29127i().post(new Runnable() { // from class: com.kubi.kumex.guide.q0
            @Override // java.lang.Runnable
            public final void run() {
                SubmitPaneGuide.m33818T(this.f29195b, view, view2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T */
    public static final void m33818T(SubmitPaneGuide submitPaneGuide, View view, View view2) {
        submitPaneGuide.m33828G(view, view2);
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m33819V(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "OrderGuide", "4", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W */
    public static final Unit m33820W(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.hide();
        submitPaneGuide.m33835Y();
        C43852m.m96591c(C17060n0.m36552b(), "OrderGuide", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z */
    public static final Unit m33822Z(SubmitPaneGuide submitPaneGuide) {
        submitPaneGuide.m33829K();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public final void m33829K() {
        View viewFindViewById = getF29127i().findViewById(R$id.action);
        if (viewFindViewById == null) {
            return;
        }
        BeginnerGuide.m33851j(this, viewFindViewById, new OrderNowStep((viewFindViewById.getWidth() / 2) + C22893a.m54302b(viewFindViewById, 0, 0).left, new Function0() { // from class: com.kubi.kumex.guide.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SubmitPaneGuide.m33814L(this.f29212b);
            }
        }), viewFindViewById, null, 8, null);
    }

    /* JADX INFO: renamed from: M */
    public final Rect m33830M() {
        View viewFindViewById;
        View viewFindViewById2 = getF29127i().findViewById(R$id.buy);
        if (viewFindViewById2 == null || (viewFindViewById = getF29127i().findViewById(R$id.sell)) == null) {
            return null;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        if (viewFindViewById2.getLayoutDirection() == 1) {
            return new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b.right), rectM54302b2.bottom);
        }
        return new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom);
    }

    /* JADX INFO: renamed from: N */
    public final Rect m33831N() {
        View viewFindViewById;
        View viewFindViewById2 = getF29127i().findViewById(R$id.tradeType);
        if (viewFindViewById2 == null || (viewFindViewById = getF29127i().findViewById(R$id.percent)) == null) {
            return null;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        if (getF29127i().getLayoutDirection() == 1) {
            return new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b2.right), rectM54302b2.bottom);
        }
        return new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom);
    }

    /* JADX INFO: renamed from: P */
    public final AppBarLayout.Behavior m33832P(CoordinatorLayout coordinatorLayout) {
        IntRange intRangeUntil = RangesKt.until(0, coordinatorLayout.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(coordinatorLayout.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view : arrayList) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                if (!(appBarLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
                    break;
                }
                ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
                if (!(behavior instanceof AppBarLayout.Behavior)) {
                    break;
                }
                return (AppBarLayout.Behavior) behavior;
            }
        }
        return null;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        final View viewFindViewById;
        final View viewFindViewById2;
        AppBarLayout.Behavior behaviorMo33799k;
        if (getF29147e() || (viewFindViewById = getF29127i().findViewById(R$id.buy)) == null || (viewFindViewById2 = getF29127i().findViewById(R$id.sell)) == null || (behaviorMo33799k = mo33799k(getF29127i())) == null) {
            return;
        }
        m33865r(true);
        m33857h("OrderGuide");
        C43852m.m96595g(C17060n0.m36552b(), "OrderGuide", null, null, 12, null);
        Pair<Boolean, Integer> pairM33863p = m33863p(behaviorMo33799k);
        if (pairM33863p.getFirst().booleanValue()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(pairM33863p.getSecond().intValue(), 0);
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
            m33855e(behaviorMo33799k, valueAnimatorOfInt, new Function0() { // from class: com.kubi.kumex.guide.m0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SubmitPaneGuide.m33817S(this.f29184b, viewFindViewById, viewFindViewById2);
                }
            });
            return;
        }
        m33828G(viewFindViewById, viewFindViewById2);
    }
}
