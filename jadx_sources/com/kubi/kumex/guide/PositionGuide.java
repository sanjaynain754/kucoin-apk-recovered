package com.kubi.kumex.guide;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.kubi.kumex.R$id;
import com.kubi.kumex.utils.C17060n0;
import com.kubi.resources.guideview.C22893a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.IntRange;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: PositionGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 (2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u001c2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0012H\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0016H\u0002J!\u0010$\u001a\u0004\u0018\u00010!\"\b\b\u0000\u0010%*\u00020\u00052\u0006\u0010\u0004\u001a\u0002H%H\u0014¢\u0006\u0002\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/kumex/guide/PositionGuide;", "Lcom/kubi/kumex/guide/BeginnerGuide;", "priority", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "runnable", "Ljava/lang/Runnable;", "<init>", "(ILandroid/view/View;Ljava/lang/Runnable;)V", "getPriority", "()I", "getView", "()Landroid/view/View;", "getRunnable", "()Ljava/lang/Runnable;", "step", "showGuide", "", "forceNotifyTranslationY", "getItemView", "generateStepOneRect", "Landroid/graphics/Rect;", "realShowStepOne", "itemView", "showPositionStepTwo", "generateStepTwoRect", "needScroll", "Lkotlin/Pair;", "", "coordinatorLayout", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "behavior", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "showPositionStepThree", "generateStepThreeRect", "getBehavior", ExifInterface.GPS_DIRECTION_TRUE, "(Landroid/view/View;)Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "getCoordinatorLayout", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPositionGuide.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionGuide.kt\ncom/kubi/kumex/guide/PositionGuide\n+ 2 ViewExt.kt\ncom/kubi/utils/extensions/core/ViewExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n372#2:231\n1549#3:232\n1620#3,3:233\n1869#3,2:236\n*S KotlinDebug\n*F\n+ 1 PositionGuide.kt\ncom/kubi/kumex/guide/PositionGuide\n*L\n209#1:231\n209#1:232\n209#1:233,3\n209#1:236,2\n*E\n"})
public final class PositionGuide extends BeginnerGuide {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f29116l = new Companion(null);

    /* JADX INFO: renamed from: h */
    public final int f29117h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final View f29118i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final Runnable f29119j;

    /* JADX INFO: renamed from: k */
    public int f29120k;

    /* JADX INFO: compiled from: PositionGuide.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kumex/guide/PositionGuide$Companion;", "", "<init>", "()V", "Key", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m33796R() {
        View viewFindViewById;
        this.f29120k = 2;
        View viewM33792I = m33792I();
        if (viewM33792I == null || (viewFindViewById = viewM33792I.findViewById(R$id.closeLayout)) == null) {
            return;
        }
        if (ViewExtKt.m66579j(viewFindViewById)) {
            m33856g();
        } else {
            BeginnerGuide.m33851j(this, viewFindViewById, new LitePositionStepThree(new Function0() { // from class: com.kubi.kumex.guide.d0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionGuide.m33780S(this.f29152b);
                }
            }), getF29118i(), null, 8, null);
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m33797T(View view) {
        View viewFindViewById;
        this.f29120k = 1;
        View viewFindViewById2 = view.findViewById(R$id.markValue);
        if (viewFindViewById2 == null || (viewFindViewById = view.findViewById(R$id.openLabel)) == null) {
            return;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById2, 0, 0);
        BeginnerGuide.m33851j(this, viewFindViewById2.getLayoutDirection() == 1 ? new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b.right), rectM54302b2.bottom) : new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom), new LitePositionStepTwo(new Function0() { // from class: com.kubi.kumex.guide.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionGuide.m33781U(this.f29141b);
            }
        }, new Function0() { // from class: com.kubi.kumex.guide.c0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionGuide.m33782V(this.f29143b);
            }
        }), getF29118i(), null, 8, null);
    }

    public PositionGuide(int i11, @NotNull View view, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f29117h = i11;
        this.f29118i = view;
        this.f29119j = runnable;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m33777O(CoordinatorLayout coordinatorLayout, final PositionGuide positionGuide, final View view) {
        coordinatorLayout.post(new Runnable() { // from class: com.kubi.kumex.guide.y
            @Override // java.lang.Runnable
            public final void run() {
                PositionGuide.m33778P(this.f29224b, view);
            }
        });
        return Unit.INSTANCE;
    }

    @NotNull
    /* JADX INFO: renamed from: J, reason: from getter */
    public View getF29118i() {
        return this.f29118i;
    }

    /* JADX INFO: renamed from: L */
    public final void m33795L(final View view) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R$id.pnlLabel);
        if (viewFindViewById3 == null || (viewFindViewById = view.findViewById(R$id.pnlLegal)) == null || (viewFindViewById2 = view.findViewById(R$id.pnlValue)) == null) {
            return;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById3, 0, 0);
        Rect rectM54302b3 = C22893a.m54302b(viewFindViewById, 0, 0);
        BeginnerGuide.m33851j(this, new Rect(rectM54302b2.left, rectM54302b2.top, Math.max(rectM54302b.right, Math.max(rectM54302b2.right, rectM54302b3.right)), rectM54302b3.bottom), new LitePositionStepOne(new Function0() { // from class: com.kubi.kumex.guide.z
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionGuide.m33775M(this.f29227b);
            }
        }, new Function0() { // from class: com.kubi.kumex.guide.a0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PositionGuide.m33776N(this.f29135b, view);
            }
        }), getF29118i(), null, 8, null);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: W1 */
    public void mo33798W1() {
        Rect rectM33788E;
        int i11 = this.f29120k;
        if (i11 == 0) {
            rectM33788E = m33788E();
        } else if (i11 != 1) {
            rectM33788E = i11 != 2 ? null : m33789F();
        } else {
            rectM33788E = m33790G();
        }
        if (rectM33788E == null || Intrinsics.areEqual(rectM33788E, getF29145c())) {
            return;
        }
        m33861n();
        m33864q(rectM33788E);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: getPriority, reason: from getter */
    public int getF23048c() {
        return this.f29117h;
    }

    @Override // com.kubi.kumex.guide.StepGuide
    @NotNull
    /* JADX INFO: renamed from: getRunnable, reason: from getter */
    public Runnable getF23049d() {
        return this.f29119j;
    }

    @Override // com.kubi.kumex.guide.BeginnerGuide
    @Nullable
    /* JADX INFO: renamed from: k */
    public <T extends View> AppBarLayout.Behavior mo33799k(@NotNull T view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        IntRange intRangeUntil = RangesKt.until(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((IntIterator) it).nextInt()));
        }
        for (View view2 : arrayList) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
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

    /* JADX INFO: renamed from: M */
    public static final Unit m33775M(PositionGuide positionGuide) {
        positionGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "PositionGuide", "4", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m33776N(PositionGuide positionGuide, View view) {
        positionGuide.hide();
        C43852m.m96591c(C17060n0.m36552b(), "PositionGuide", "1", null, 8, null);
        positionGuide.m33797T(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final void m33778P(PositionGuide positionGuide, View view) {
        positionGuide.m33795L(view);
    }

    /* JADX INFO: renamed from: Q */
    public static final void m33779Q(PositionGuide positionGuide, View view) {
        positionGuide.m33795L(view);
    }

    /* JADX INFO: renamed from: S */
    public static final Unit m33780S(PositionGuide positionGuide) {
        positionGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "PositionGuide", "3", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U */
    public static final Unit m33781U(PositionGuide positionGuide) {
        positionGuide.m33856g();
        C43852m.m96591c(C17060n0.m36552b(), "PositionGuide", "4", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V */
    public static final Unit m33782V(PositionGuide positionGuide) {
        positionGuide.hide();
        positionGuide.m33796R();
        C43852m.m96591c(C17060n0.m36552b(), "PositionGuide", "2", null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E */
    public final Rect m33788E() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewM33792I = m33792I();
        if (viewM33792I == null || (viewFindViewById = viewM33792I.findViewById(R$id.pnlLabel)) == null || (viewFindViewById2 = viewM33792I.findViewById(R$id.pnlLegal)) == null || (viewFindViewById3 = viewM33792I.findViewById(R$id.pnlValue)) == null) {
            return null;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById3, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        Rect rectM54302b3 = C22893a.m54302b(viewFindViewById2, 0, 0);
        return new Rect(rectM54302b2.left, rectM54302b2.top, Math.max(rectM54302b.right, Math.max(rectM54302b2.right, rectM54302b3.right)), rectM54302b3.bottom);
    }

    /* JADX INFO: renamed from: F */
    public final Rect m33789F() {
        View viewFindViewById;
        View viewM33792I = m33792I();
        if (viewM33792I == null || (viewFindViewById = viewM33792I.findViewById(R$id.closeLayout)) == null || ViewExtKt.m66579j(viewFindViewById)) {
            return null;
        }
        return C22893a.m54302b(viewFindViewById, 0, 0);
    }

    /* JADX INFO: renamed from: G */
    public final Rect m33790G() {
        View viewFindViewById;
        View viewFindViewById2;
        View viewM33792I = m33792I();
        if (viewM33792I == null || (viewFindViewById = viewM33792I.findViewById(R$id.markValue)) == null || (viewFindViewById2 = viewM33792I.findViewById(R$id.openLabel)) == null) {
            return null;
        }
        Rect rectM54302b = C22893a.m54302b(viewFindViewById2, 0, 0);
        Rect rectM54302b2 = C22893a.m54302b(viewFindViewById, 0, 0);
        if (viewFindViewById.getLayoutDirection() == 1) {
            return new Rect(rectM54302b2.left, rectM54302b.top, Math.abs(rectM54302b.right), rectM54302b2.bottom);
        }
        return new Rect(rectM54302b.left, rectM54302b.top, rectM54302b2.right, rectM54302b2.bottom);
    }

    /* JADX INFO: renamed from: H */
    public final CoordinatorLayout m33791H(View view) {
        Object parent = view.getParent();
        if (parent == null) {
            return null;
        }
        if (parent instanceof CoordinatorLayout) {
            return (CoordinatorLayout) parent;
        }
        return m33791H((View) parent);
    }

    /* JADX INFO: renamed from: I */
    public final View m33792I() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.Adapter adapter;
        if (!(getF29118i() instanceof RecyclerView)) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) getF29118i()).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager == null || (adapter = ((RecyclerView) getF29118i()).getAdapter()) == null || adapter.getItemCount() <= 0) {
            return null;
        }
        int itemCount = adapter.getItemCount();
        for (int i11 = 0; i11 < itemCount; i11++) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i11);
            if (viewFindViewByPosition != null) {
                RecyclerView.ViewHolder childViewHolder = ((RecyclerView) getF29118i()).getChildViewHolder(viewFindViewByPosition);
                if ((childViewHolder instanceof com.kubi.futures.trade.position.adapter.a1) || (childViewHolder instanceof com.kubi.futures.trade.position.adapter.c0)) {
                    return viewFindViewByPosition;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final Pair<Boolean, Integer> m33794K(View view, CoordinatorLayout coordinatorLayout, AppBarLayout.Behavior behavior) {
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

    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: q2 */
    public void mo25565q2() {
        final View viewM33792I;
        final CoordinatorLayout coordinatorLayoutM33791H;
        AppBarLayout.Behavior behaviorMo33799k;
        if (getF29147e() || (viewM33792I = m33792I()) == null || (coordinatorLayoutM33791H = m33791H(getF29118i())) == null || (behaviorMo33799k = mo33799k(coordinatorLayoutM33791H)) == null) {
            return;
        }
        Pair<Boolean, Integer> pairM33794K = m33794K(viewM33792I, coordinatorLayoutM33791H, behaviorMo33799k);
        m33865r(true);
        m33857h("PositionGuide");
        C43852m.m96595g(C17060n0.m36552b(), "PositionGuide", null, null, 12, null);
        if (pairM33794K.getFirst().booleanValue()) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, -pairM33794K.getSecond().intValue());
            Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
            m33855e(behaviorMo33799k, valueAnimatorOfInt, new Function0() { // from class: com.kubi.kumex.guide.w
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PositionGuide.m33777O(coordinatorLayoutM33791H, this, viewM33792I);
                }
            });
            return;
        }
        coordinatorLayoutM33791H.post(new Runnable() { // from class: com.kubi.kumex.guide.x
            @Override // java.lang.Runnable
            public final void run() {
                PositionGuide.m33779Q(this.f29219b, viewM33792I);
            }
        });
    }
}
