package p562qj;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.C6184u;
import com.facebook.react.uimanager.C6185v;
import com.kubi.event.api.C12572a;
import com.kubi.home.R$color;
import com.kubi.home.R$drawable;
import com.kubi.home.R$id;
import com.kubi.home.R$mipmap;
import com.kubi.home.R$string;
import com.kubi.home.common.card.HomeCardViewHolderProxy;
import com.kubi.home.v2.guide.WidgetGuideCenter;
import com.kubi.kucoin.home.p090v2.cards.BaseCardDataV2;
import com.kubi.kucoin.home.p090v2.cards.CardStyle;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.sdk.util.EdgeToEdgeCompat;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27023a;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import com.tencent.qcloud.tuicore.TUIConstants;
import fj.C37546t0;
import fj.C37556y0;
import fj.C37558z0;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p575qw.C43881b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: qj.t */
/* JADX INFO: compiled from: HomePopMenu.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\t28\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010H\u0007J\u0012\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007J&\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!H\u0002J\b\u0010\"\u001a\u00020\u0015H\u0003J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0002J(\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u000bH\u0002J(\u00103\u001a\u0002042\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0002J0\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020\u000bH\u0002J@\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u000bH\u0002J\u0018\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020(2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010F\u001a\u00020\u0015H\u0002J\b\u0010G\u001a\u00020\u0015H\u0002J \u0010H\u001a\u00020\u00152\u0006\u0010I\u001a\u00020J2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u0012\u0010K\u001a\u0004\u0018\u00010\u00052\u0006\u0010L\u001a\u00020MH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\u000f\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/HomePopMenu;", "", "<init>", "()V", "overlayContainer", "Landroid/widget/FrameLayout;", "anchor", "Landroid/view/View;", "cardData", "Lcom/kubi/kucoin/home/v2/cards/BaseCardDataV2;", "cardID", "", "menuID", "onClickListener", "Landroid/view/View$OnClickListener;", "quickChangeListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "oldData", "newData", "", TIMPushProvider.f75062n, "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "anchorView", "clear", "delay", "", "animateCardToAnchorPosition", "fromView", "toView", "onComplete", "Lkotlin/Function0;", "removeOverlay", "showBottomBar", "captureViewBitmap", "Landroid/graphics/Bitmap;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "createMenuView", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "configQuickChangeMenu", "quickChangeView", "Landroid/widget/LinearLayout;", "createQuickSelectItemView", "data", TtmlNode.TAG_STYLE, "Lcom/kubi/kucoin/home/v2/cards/CardStyle;", "gridType", "calculateCardPosition", "Lcom/kubi/home/v2/container/ui/HomePopMenu$Position;", "originalX", "originalY", "animateCardPosition", "cardView", "fromX", "fromY", "toX", "toY", "calculateMenuPosition", "anchorRelativeX", "anchorRelativeY", "anchorWidth", "anchorHeight", "menuWidth", "menuHeight", "setupMenuClickListeners", "menuContainer", "applyBlurEffect", "removeBlurEffect", "adjustEventCoordinates", "event", "Landroid/view/MotionEvent;", "getRootContent", "activity", "Landroid/app/Activity;", "Position", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
@SourceDebugExtension({"SMAP\nHomePopMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePopMenu.kt\ncom/kubi/home/v2/container/ui/HomePopMenu\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,647:1\n28#2:648\n30#3:649\n91#3,14:650\n95#4:664\n1869#5,2:665\n1321#6,2:667\n470#7:669\n*S KotlinDebug\n*F\n+ 1 HomePopMenu.kt\ncom/kubi/home/v2/container/ui/HomePopMenu\n*L\n140#1:648\n264#1:649\n264#1:650,14\n352#1:664\n403#1:665,2\n577#1:667,2\n599#1:669\n*E\n"})
public final class C43764t {

    /* JADX INFO: renamed from: a */
    @Nullable
    public FrameLayout f96758a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f96759b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BaseCardDataV2 f96760c;

    /* JADX INFO: renamed from: d */
    public final int f96761d = View.generateViewId();

    /* JADX INFO: renamed from: e */
    public final int f96762e = View.generateViewId();

    /* JADX INFO: renamed from: f */
    @Nullable
    public View.OnClickListener f96763f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> f96764g;

    /* JADX INFO: renamed from: qj.t$a, reason: from toString */
    /* JADX INFO: compiled from: HomePopMenu.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/home/v2/container/ui/HomePopMenu$Position;", "", "x", "", "y", "<init>", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Position {

        /* JADX INFO: renamed from: a, reason: from toString */
        public final int x;

        /* JADX INFO: renamed from: b, reason: from toString */
        public final int y;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return this.x == position.x && this.y == position.y;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getY() {
            return this.y;
        }

        public int hashCode() {
            return (Integer.hashCode(this.x) * 31) + Integer.hashCode(this.y);
        }

        @NotNull
        public String toString() {
            return "Position(x=" + this.x + ", y=" + this.y + ')';
        }

        public Position(int i11, int i12) {
            this.x = i11;
            this.y = i12;
        }
    }

    /* JADX INFO: renamed from: qj.t$b */
    /* JADX INFO: compiled from: Animator.kt */
    /* JADX INFO: loaded from: classes15.dex */
    @Metadata(m90083d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\n"}, m90084d2 = {"androidx/core/animation/AnimatorKt$addListener$listener$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animator", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "core-ktx_release", "androidx/core/animation/AnimatorKt$doOnEnd$$inlined$addListener$default$1"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 HomePopMenu.kt\ncom/kubi/home/v2/container/ui/HomePopMenu\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n265#3,2:125\n94#4:127\n93#5:128\n*E\n"})
    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function0 f96767a;

        public b(Function0 function0) {
            this.f96767a = function0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NotNull Animator animator) {
            this.f96767a.invoke();
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

    /* JADX INFO: renamed from: G */
    public static final Unit m96379G(FrameLayout frameLayout, C43764t c43764t) {
        frameLayout.setOnTouchListener(null);
        Context context = frameLayout.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        FrameLayout frameLayoutM96401D = c43764t.m96401D((Activity) context);
        if (frameLayoutM96401D != null) {
            frameLayoutM96401D.removeView(c43764t.f96758a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m96397v(C43764t c43764t, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        c43764t.m96414u(z11);
    }

    /* JADX INFO: renamed from: l */
    public final void m96407l(MotionEvent motionEvent, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        motionEvent.offsetLocation(iArr[0] - iArr2[0], iArr[1] - iArr2[1]);
    }

    /* JADX INFO: renamed from: m */
    public final void m96408m(final View view, final int i11, final int i12, final int i13, final int i14) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qj.s
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43764t.m96395n(i11, i13, i12, i14, view, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: o */
    public final void m96409o(final View view, View view2, Function0<Unit> function0) {
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        final int i11 = iArr[0];
        final int i12 = iArr[1];
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        final int i13 = layoutParams2.leftMargin;
        final int i14 = layoutParams2.topMargin;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qj.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43764t.m96396p(i13, i11, i14, i12, view, valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new b(function0));
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: renamed from: r */
    public final Position m96411r(View view, RecyclerView recyclerView, int i11, int i12) {
        int[] iArr = new int[2];
        recyclerView.getLocationInWindow(iArr);
        int i13 = iArr[1];
        int height = recyclerView.getHeight() + i13;
        if (i11 < 0) {
            i11 = 0;
        } else if (view.getWidth() + i11 > recyclerView.getWidth()) {
            i11 = recyclerView.getWidth() - view.getWidth();
        }
        if (i12 < i13) {
            i12 = i13;
        } else if (view.getHeight() + i12 > height) {
            i12 = height - view.getHeight();
        }
        return new Position(i11, i12);
    }

    /* JADX INFO: renamed from: C */
    public static final Unit m96378C(BaseCardDataV2 baseCardDataV2, CardStyle cardStyle, C43764t c43764t, View view) {
        Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> function2;
        if (baseCardDataV2.getStyle().getGridType() != cardStyle.getGridType() && (function2 = c43764t.f96764g) != null) {
            function2.invoke(baseCardDataV2, BaseCardDataV2.m32246b(baseCardDataV2, null, cardStyle, null, null, null, false, false, null, null, 509, null));
        }
        View.OnClickListener onClickListener = c43764t.f96763f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M */
    public static final Unit m96382M(View.OnClickListener onClickListener, C37546t0 c37546t0) throws JSONException {
        onClickListener.onClick(c37546t0.f83417b);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "addWidgetpage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m96383N(View.OnClickListener onClickListener, C37546t0 c37546t0) throws JSONException {
        onClickListener.onClick(c37546t0.f83419d);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "saveWidget", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final void m96395n(int i11, int i12, int i13, int i14, View view, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f11 = i11 + ((i12 - i11) * fFloatValue);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = (int) f11;
        layoutParams2.topMargin = (int) (i13 + ((i14 - i13) * fFloatValue));
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: p */
    public static final void m96396p(int i11, int i12, int i13, int i14, View view, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f11 = i11 + ((i12 - i11) * fFloatValue);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.leftMargin = (int) f11;
        layoutParams2.topMargin = (int) (i13 + ((i14 - i13) * fFloatValue));
        view.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: renamed from: B */
    public final View m96400B(final BaseCardDataV2 baseCardDataV2, final CardStyle cardStyle, final View view, int i11) {
        LinearLayout linearLayout = new LinearLayout(view.getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.setGravity(17);
        int iM96650a = C43881b.m96650a(40);
        int iM96650a2 = C43881b.m96650a(7);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iM96650a, iM96650a));
        imageView.setBackground(ContextCompat.getDrawable(imageView.getContext(), R$drawable.selector_btn_emphasis4_12r));
        imageView.setPadding(0, iM96650a2, 0, iM96650a2);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (cardStyle.getGridType() == 2) {
            imageView.setImageResource(R$drawable.ic2_small_widget_24);
        } else {
            imageView.setImageResource(R$drawable.ic2_medium_widget_24);
        }
        imageView.setImageTintList(ContextCompat.getColorStateList(imageView.getContext(), R$color.c_text));
        imageView.setSelected(cardStyle.getGridType() == i11);
        C27046k.m66711z(imageView, 0L, new Function0() { // from class: qj.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43764t.m96378C(baseCardDataV2, cardStyle, this, view);
            }
        }, 1, null);
        linearLayout.addView(imageView);
        return linearLayout;
    }

    /* JADX INFO: renamed from: E */
    public final void m96402E() {
        FrameLayout frameLayout = this.f96758a;
        Context context = frameLayout != null ? frameLayout.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        FrameLayout frameLayoutM96401D = m96401D(activity);
        View viewFindViewById = frameLayoutM96401D != null ? frameLayoutM96401D.findViewById(R$id.base_activity_layout) : null;
        if (Build.VERSION.SDK_INT >= 31) {
            if (viewFindViewById != null) {
                viewFindViewById.setRenderEffect(null);
            }
        } else if (viewFindViewById != null) {
            viewFindViewById.setAlpha(1.0f);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: J */
    public final void m96405J(@NotNull final RecyclerView recyclerView, @NotNull View anchorView, @NotNull View.OnClickListener onClickListener, @Nullable BaseCardDataV2 baseCardDataV2, @Nullable Function2<? super BaseCardDataV2, ? super BaseCardDataV2, Unit> function2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(anchorView, "anchorView");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        if (this.f96758a != null) {
            m96397v(this, false, 1, null);
            return;
        }
        this.f96759b = anchorView;
        this.f96760c = baseCardDataV2;
        this.f96763f = onClickListener;
        this.f96764g = function2;
        Context context = recyclerView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        Object systemService = activity.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(1L);
        final FrameLayout frameLayout = new FrameLayout(anchorView.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setClickable(false);
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: qj.o
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C43764t.m96381K(this.f96743b, frameLayout, recyclerView, view, motionEvent);
            }
        });
        frameLayout.setLayoutDirection(0);
        this.f96758a = frameLayout;
        int[] iArr = new int[2];
        anchorView.getLocationInWindow(iArr);
        int i11 = iArr[0];
        int i12 = iArr[1];
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(anchorView.getWidth(), anchorView.getHeight());
        layoutParams.leftMargin = i11;
        layoutParams.topMargin = i12;
        Position positionM96411r = m96411r(anchorView, recyclerView, i11, i12);
        Bitmap bitmapM96413t = m96413t(anchorView);
        CardView cardView = new CardView(anchorView.getContext());
        cardView.setId(this.f96761d);
        ImageView imageView = new ImageView(cardView.getContext());
        Resources resources = anchorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        imageView.setBackground(new BitmapDrawable(resources, bitmapM96413t));
        cardView.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        cardView.setLayoutParams(layoutParams);
        ViewGroup viewGroup = anchorView instanceof ViewGroup ? (ViewGroup) anchorView : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        CardView cardView2 = childAt instanceof CardView ? (CardView) childAt : null;
        cardView.setRadius(cardView2 != null ? cardView2.getRadius() : 0.0f);
        FrameLayout frameLayout2 = this.f96758a;
        if (frameLayout2 != null) {
            frameLayout2.addView(cardView);
        }
        C43766v c43766v = C43766v.f96768a;
        C43766v.m96420b(c43766v, cardView, 1.05f, 100L, null, 8, null);
        c43766v.m96422c(cardView, true);
        if (positionM96411r.getX() != i11 || positionM96411r.getY() != i12) {
            m96408m(cardView, i11, i12, positionM96411r.getX(), positionM96411r.getY());
        }
        Context context2 = anchorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ViewGroup viewGroupM96416y = m96416y(context2, onClickListener);
        viewGroupM96416y.setLayoutDirection(recyclerView.getLayoutDirection());
        viewGroupM96416y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int width = (int) (anchorView.getWidth() * 1.05f);
        int height = (int) (anchorView.getHeight() * 1.05f);
        Position positionM96412s = m96412s(positionM96411r.getX() - ((width - anchorView.getWidth()) / 2), positionM96411r.getY() - ((height - anchorView.getHeight()) / 2), width, height, recyclerView, viewGroupM96416y.getMeasuredWidth(), viewGroupM96416y.getMeasuredHeight());
        ViewGroup.LayoutParams layoutParams2 = viewGroupM96416y.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.width = viewGroupM96416y.getMeasuredWidth();
        marginLayoutParams.height = viewGroupM96416y.getMeasuredHeight();
        marginLayoutParams.leftMargin = positionM96412s.getX();
        marginLayoutParams.topMargin = positionM96412s.getY();
        FrameLayout frameLayout3 = this.f96758a;
        if (frameLayout3 != null) {
            frameLayout3.addView(viewGroupM96416y, marginLayoutParams);
        }
        m96404H(viewGroupM96416y, onClickListener);
        FrameLayout frameLayoutM96401D = m96401D(activity);
        if (frameLayoutM96401D != null) {
            frameLayoutM96401D.addView(this.f96758a, new ViewGroup.LayoutParams(-1, -1));
        }
        m96410q();
    }

    @UiThread
    /* JADX INFO: renamed from: L */
    public final void m96406L(@NotNull final View.OnClickListener onClickListener, @NotNull RecyclerView recyclerView) throws JSONException {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        FrameLayout frameLayout = this.f96758a;
        if (frameLayout != null && frameLayout.findViewById(R$id.home_card_edit_bottom) == null) {
            frameLayout.removeAllViews();
            m96402E();
            Context context = frameLayout.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                return;
            }
            final C37546t0 c37546t0M84563c = C37546t0.m84563c(LayoutInflater.from(activity), frameLayout, false);
            Intrinsics.checkNotNullExpressionValue(c37546t0M84563c, "inflate(...)");
            int[] iArr = new int[2];
            frameLayout.getLocationInWindow(iArr);
            int height = iArr[1] + frameLayout.getHeight();
            recyclerView.getLocationInWindow(iArr);
            int height2 = height - (iArr[1] + recyclerView.getHeight());
            if (height2 > 0) {
                c37546t0M84563c.getRoot().setMinimumHeight((int) (height2 / 0.35f));
                c37546t0M84563c.getRoot().setBackgroundResource(R$drawable.home_card_edit_gradient);
            }
            frameLayout.addView(c37546t0M84563c.getRoot());
            C43766v c43766v = C43766v.f96768a;
            CardView homeCardEditBottom = c37546t0M84563c.f83418c;
            Intrinsics.checkNotNullExpressionValue(homeCardEditBottom, "homeCardEditBottom");
            c43766v.m96422c(homeCardEditBottom, true);
            ImageButton homeCardAdd = c37546t0M84563c.f83417b;
            Intrinsics.checkNotNullExpressionValue(homeCardAdd, "homeCardAdd");
            C27046k.m66710y(homeCardAdd, 1000L, new Function0() { // from class: qj.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C43764t.m96382M(onClickListener, c37546t0M84563c);
                }
            });
            ImageButton homeCardOk = c37546t0M84563c.f83419d;
            Intrinsics.checkNotNullExpressionValue(homeCardOk, "homeCardOk");
            C27046k.m66710y(homeCardOk, 1000L, new Function0() { // from class: qj.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C43764t.m96383N(onClickListener, c37546t0M84563c);
                }
            });
            WidgetGuideCenter widgetGuideCenter = WidgetGuideCenter.f26561a;
            ImageButton homeCardAdd2 = c37546t0M84563c.f83417b;
            Intrinsics.checkNotNullExpressionValue(homeCardAdd2, "homeCardAdd");
            widgetGuideCenter.m30918r(frameLayout, homeCardAdd2);
            C12572a.m23695d("com.kubi.home.event.HomeEvent:home_show_home_add_card_dialog", Boolean.TRUE, 0L, 4, null);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "addWidgetpage", null, jSONObject, 4, null);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("norm_version", "1");
            C27023a.m66557d(HomeCardViewHolderProxy.PAGE_ID, "saveWidget", null, jSONObject2, 4, null);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m96410q() {
        FrameLayout frameLayout = this.f96758a;
        Context context = frameLayout != null ? frameLayout.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        FrameLayout frameLayoutM96401D = m96401D(activity);
        View viewFindViewById = frameLayoutM96401D != null ? frameLayoutM96401D.findViewById(R$id.base_activity_layout) : null;
        if (Build.VERSION.SDK_INT < 31) {
            if (viewFindViewById != null) {
                viewFindViewById.setAlpha(0.2f);
                return;
            }
            return;
        }
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(70.0f, 70.0f, Shader.TileMode.CLAMP);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        if (DayNightThemeManager.f28592a.m33187l()) {
            if (viewFindViewById != null) {
                viewFindViewById.setRenderEffect(renderEffectCreateBlurEffect);
                return;
            }
            return;
        }
        C6185v.m10570a();
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(C6184u.m10569a(Color.parseColor("#B3000000"), BlendMode.SRC_OVER));
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateChainEffect = RenderEffect.createChainEffect(renderEffectCreateColorFilterEffect, renderEffectCreateBlurEffect);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateChainEffect, "createChainEffect(...)");
        if (viewFindViewById != null) {
            viewFindViewById.setRenderEffect(renderEffectCreateChainEffect);
        }
    }

    /* JADX INFO: renamed from: s */
    public final Position m96412s(int i11, int i12, int i13, int i14, RecyclerView recyclerView, int i15, int i16) {
        int width = (i11 + (i13 / 2)) - (i15 / 2);
        int iM66658b = C27040e.m66658b(12);
        if (width < 0) {
            width = iM66658b;
        } else if (width + i15 > recyclerView.getWidth()) {
            width = (recyclerView.getWidth() - i15) - iM66658b;
        }
        int iMax = (i12 - i16) - iM66658b;
        int i17 = i14 + i12;
        int i18 = iM66658b + i17;
        if (iMax < EdgeToEdgeCompat.f48106a.m58272j()) {
            if (i18 + i16 <= recyclerView.getHeight()) {
                iMax = i18;
            } else {
                iMax = i12 > recyclerView.getHeight() - i17 ? Math.max(0, iMax) : Math.min(recyclerView.getHeight() - i16, i18);
            }
        }
        return new Position(width, iMax);
    }

    @UiThread
    /* JADX INFO: renamed from: u */
    public final void m96414u(boolean z11) {
        FrameLayout frameLayout;
        CardView cardView;
        View view;
        if (!z11 || (frameLayout = this.f96758a) == null || (cardView = (CardView) frameLayout.findViewById(this.f96761d)) == null || (view = this.f96759b) == null) {
            m96402E();
            m96403F();
        } else {
            View viewFindViewById = frameLayout.findViewById(this.f96762e);
            if (viewFindViewById != null) {
                frameLayout.removeView(viewFindViewById);
            }
            m96409o(cardView, view, new Function0() { // from class: qj.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C43764t.m96398w(this.f96735b);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m96415x(LinearLayout linearLayout) {
        BaseCardDataV2 baseCardDataV2 = this.f96760c;
        if (baseCardDataV2 == null) {
            return;
        }
        C27046k.m66685H(linearLayout);
        Collection<CardStyle> collectionValues = baseCardDataV2.m32256k().values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (CardStyle cardStyle : collectionValues) {
            Intrinsics.checkNotNull(cardStyle);
            linearLayout.addView(m96400B(baseCardDataV2, cardStyle, linearLayout, baseCardDataV2.getStyle().getGridType()));
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m96377A(View.OnClickListener onClickListener, C37558z0 c37558z0) throws JSONException {
        onClickListener.onClick(c37558z0.getRoot());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "editHomepage", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m96380I(View.OnClickListener onClickListener, View view, C43764t c43764t) {
        onClickListener.onClick(view);
        m96397v(c43764t, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m96381K(C43764t c43764t, FrameLayout frameLayout, RecyclerView recyclerView, View view, MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Intrinsics.checkNotNull(motionEventObtain);
        c43764t.m96407l(motionEventObtain, frameLayout, recyclerView);
        recyclerView.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m96398w(C43764t c43764t) {
        c43764t.m96402E();
        c43764t.m96403F();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m96399z(View.OnClickListener onClickListener, C37558z0 c37558z0) throws JSONException {
        onClickListener.onClick(c37558z0.getRoot());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C27023a.m66555b(HomeCardViewHolderProxy.PAGE_ID, "removeWidget", null, jSONObject, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D */
    public final FrameLayout m96401D(Activity activity) {
        return (FrameLayout) activity.findViewById(R.id.content);
    }

    @UiThread
    /* JADX INFO: renamed from: F */
    public final void m96403F() {
        m96402E();
        final FrameLayout frameLayout = this.f96758a;
        if (frameLayout != null) {
            C27100x0.m66923d(new Function0() { // from class: qj.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C43764t.m96379G(frameLayout, this);
                }
            });
        }
        this.f96758a = null;
        this.f96759b = null;
    }

    /* JADX INFO: renamed from: H */
    public final void m96404H(ViewGroup viewGroup, final View.OnClickListener onClickListener) {
        for (final View view : ViewGroupKt.getChildren(viewGroup)) {
            C27046k.m66711z(view, 0L, new Function0() { // from class: qj.r
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C43764t.m96380I(onClickListener, view, this);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final Bitmap m96413t(View view) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: y */
    public final ViewGroup m96416y(Context context, final View.OnClickListener onClickListener) {
        LinkedHashMap<String, CardStyle> linkedHashMapM32256k;
        int size = 0;
        C37556y0 c37556y0M84586c = C37556y0.m84586c(LayoutInflater.from(context), this.f96758a, false);
        Intrinsics.checkNotNullExpressionValue(c37556y0M84586c, "inflate(...)");
        BaseCardDataV2 baseCardDataV2 = this.f96760c;
        if (baseCardDataV2 != null && (linkedHashMapM32256k = baseCardDataV2.m32256k()) != null) {
            size = linkedHashMapM32256k.size();
        }
        if (size > 1) {
            LinearLayout quickChangeStyle = c37556y0M84586c.f83506d;
            Intrinsics.checkNotNullExpressionValue(quickChangeStyle, "quickChangeStyle");
            m96415x(quickChangeStyle);
        } else {
            LinearLayout quickChangeStyle2 = c37556y0M84586c.f83506d;
            Intrinsics.checkNotNullExpressionValue(quickChangeStyle2, "quickChangeStyle");
            ViewExtKt.m66577h(quickChangeStyle2);
        }
        final C37558z0 c37558z0 = c37556y0M84586c.f83507e;
        LinearLayout root = c37558z0.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        C27046k.m66710y(root, 500L, new Function0() { // from class: qj.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43764t.m96399z(onClickListener, c37558z0);
            }
        });
        c37558z0.f83514c.setText(context.getResources().getString(R$string.homepage_remove_widget));
        c37558z0.f83514c.setTextColor(ContextCompat.getColor(context, R$color.secondary));
        c37558z0.f83513b.setBackgroundResource(R$mipmap.home_card_menu_remove);
        final C37558z0 c37558z1 = c37556y0M84586c.f83504b;
        LinearLayout root2 = c37558z1.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        C27046k.m66710y(root2, 500L, new Function0() { // from class: qj.q
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C43764t.m96377A(onClickListener, c37558z1);
            }
        });
        c37558z1.f83514c.setText(ContextCompat.getString(context, R$string.homepage_edit_homepage));
        TextView textView = c37558z1.f83514c;
        int i11 = R$color.c_text;
        textView.setTextColor(ContextCompat.getColor(context, i11));
        c37558z1.f83513b.setBackgroundTintList(ContextCompat.getColorStateList(context, i11));
        c37558z1.f83513b.setBackgroundResource(R$mipmap.home_card_menu_edit);
        c37556y0M84586c.getRoot().setId(this.f96762e);
        C43766v c43766v = C43766v.f96768a;
        CardView root3 = c37556y0M84586c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        c43766v.m96422c(root3, true);
        CardView root4 = c37556y0M84586c.getRoot();
        Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
        return root4;
    }
}
