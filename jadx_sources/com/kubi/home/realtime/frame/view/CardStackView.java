package com.kubi.home.realtime.frame.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.home.realtime.IRealTimeData;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CardStackView.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u001b\u0018\u0000 O2\u00020\u0001:\u0002OPB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010'\u001a\u00020\u00172\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\"\u0010*\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\u0017H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020)H\u0017J\u0016\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u001eJ\u000e\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u000206J\u000e\u00107\u001a\u00020\u001f2\u0006\u00103\u001a\u00020\u001eJ\u0006\u00108\u001a\u00020\u001fJ\b\u00109\u001a\u00020\u001fH\u0002J\b\u0010:\u001a\u0004\u0018\u00010\fJ \u0010;\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0010H\u0002J\b\u0010=\u001a\u00020\u001fH\u0002J\u0010\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u0012H\u0002J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0010H\u0002J\u0018\u0010A\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u0017H\u0002J\u0010\u0010C\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0010H\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\b\u0010E\u001a\u00020\u001fH\u0002J\u0018\u0010F\u001a\u00020\u001f2\u0006\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0007H\u0014J0\u0010I\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u00072\u0006\u0010L\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u0007H\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006Q"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/view/CardStackView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardDataList", "", "Lcom/kubi/home/realtime/frame/view/CardStackView$CardData;", "gestureDetector", "Landroid/view/GestureDetector;", "draggingCard", "Landroid/view/View;", "initialX", "", "initialY", "dragOffsetX", "dragOffsetY", "isDragging", "", "isHomeDragMode", "()Z", "setHomeDragMode", "(Z)V", "onCardSwipedListener", "Lkotlin/Function1;", "Lcom/kubi/home/realtime/IRealTimeData;", "", "getOnCardSwipedListener", "()Lkotlin/jvm/functions/Function1;", "setOnCardSwipedListener", "(Lkotlin/jvm/functions/Function1;)V", "onCardClickListener", "getOnCardClickListener", "setOnCardClickListener", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "findClickableChildAt", "parent", "x", "y", "performClick", "onTouchEvent", "event", "addCard", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "businessData", "removeCard", "uniqueId", "", "updateCard", "clearAllCards", "updateCardIndices", "getTopCard", "isPointInCard", "card", "updateCardPosition", "updateSecondCardWithSwipeProgress", "swipeProgress", "animateCardEntry", "animateCardOut", "isRightSwipe", "animateCardBack", "resetSecondCardPosition", "animateCardReorder", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", ViewProps.ON_LAYOUT, "changed", CmcdData.Factory.STREAM_TYPE_LIVE, "t", "r", "b", "Companion", "CardData", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCardStackView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardStackView.kt\ncom/kubi/home/realtime/frame/view/CardStackView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n360#2,7:544\n360#2,7:552\n1878#2,3:559\n1869#2,2:562\n1878#2,3:564\n1#3:551\n*S KotlinDebug\n*F\n+ 1 CardStackView.kt\ncom/kubi/home/realtime/frame/view/CardStackView\n*L\n274#1:544,7\n317#1:552,7\n340#1:559,3\n469#1:562,2\n502#1:564,3\n*E\n"})
public final class CardStackView extends FrameLayout {

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final Companion f26155m = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<CardData> f26156b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final GestureDetector f26157c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public View f26158d;

    /* JADX INFO: renamed from: e */
    public float f26159e;

    /* JADX INFO: renamed from: f */
    public float f26160f;

    /* JADX INFO: renamed from: g */
    public float f26161g;

    /* JADX INFO: renamed from: h */
    public float f26162h;

    /* JADX INFO: renamed from: i */
    public boolean f26163i;

    /* JADX INFO: renamed from: j */
    public boolean f26164j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Function1<? super IRealTimeData, Unit> f26165k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Function1<? super IRealTimeData, Unit> f26166l;

    /* JADX INFO: compiled from: CardStackView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/view/CardStackView$Companion;", "", "<init>", "()V", "SWIPE_THRESHOLD", "", "ANIMATION_DURATION", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.frame.view.CardStackView$a */
    /* JADX INFO: compiled from: CardStackView.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¨\u0006\r"}, m90084d2 = {"com/kubi/home/realtime/frame/view/CardStackView$1", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "onDown", "", "e", "Landroid/view/MotionEvent;", "onSingleTapUp", "onScroll", "e1", "e2", "distanceX", "", "distanceY", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14831a extends GestureDetector.SimpleOnGestureListener {
        public C14831a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e11) {
            Intrinsics.checkNotNullParameter(e11, "e");
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e11, MotionEvent e12, float distanceX, float distanceY) {
            Intrinsics.checkNotNullParameter(e12, "e2");
            if (CardStackView.this.f26158d == null || !CardStackView.this.f26163i) {
                return false;
            }
            CardStackView.this.f26161g = e12.getX() - CardStackView.this.f26159e;
            CardStackView.this.f26162h = e12.getY() - CardStackView.this.f26160f;
            CardStackView cardStackView = CardStackView.this;
            cardStackView.f26162h = Math.max(-50.0f, Math.min(50.0f, cardStackView.f26162h));
            CardStackView.this.m30180z();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e11) {
            CardData topCard;
            Intrinsics.checkNotNullParameter(e11, "e");
            if (CardStackView.this.f26163i || (topCard = CardStackView.this.getTopCard()) == null || !CardStackView.this.m30175u(e11.getX(), e11.getY(), topCard.getView())) {
                return false;
            }
            CardStackView.this.performClick();
            Function1<IRealTimeData, Unit> onCardClickListener = CardStackView.this.getOnCardClickListener();
            if (onCardClickListener == null) {
                return true;
            }
            onCardClickListener.invoke(topCard.getBusinessData());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.frame.view.CardStackView$b, reason: from toString */
    /* JADX INFO: compiled from: CardStackView.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/home/realtime/frame/view/CardStackView$CardData;", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "businessData", "Lcom/kubi/home/realtime/IRealTimeData;", "currentIndex", "", "<init>", "(Landroid/view/View;Lcom/kubi/home/realtime/IRealTimeData;I)V", "getView", "()Landroid/view/View;", "getBusinessData", "()Lcom/kubi/home/realtime/IRealTimeData;", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CardData {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final View view;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final IRealTimeData businessData;

        /* JADX INFO: renamed from: c, reason: from toString */
        public int currentIndex;

        public CardData(@NotNull View view, @NotNull IRealTimeData businessData, int i11) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(businessData, "businessData");
            this.view = view;
            this.businessData = businessData;
            this.currentIndex = i11;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardData)) {
                return false;
            }
            CardData cardData = (CardData) other;
            return Intrinsics.areEqual(this.view, cardData.view) && Intrinsics.areEqual(this.businessData, cardData.businessData) && this.currentIndex == cardData.currentIndex;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ CardData m30181b(CardData cardData, View view, IRealTimeData iRealTimeData, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                view = cardData.view;
            }
            if ((i12 & 2) != 0) {
                iRealTimeData = cardData.businessData;
            }
            if ((i12 & 4) != 0) {
                i11 = cardData.currentIndex;
            }
            return cardData.m30182a(view, iRealTimeData, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final CardData m30182a(@NotNull View view, @NotNull IRealTimeData businessData, int i11) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(businessData, "businessData");
            return new CardData(view, businessData, i11);
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final IRealTimeData getBusinessData() {
            return this.businessData;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final View getView() {
            return this.view;
        }

        /* JADX INFO: renamed from: e */
        public final void m30185e(int i11) {
            this.currentIndex = i11;
        }

        public int hashCode() {
            return (((this.view.hashCode() * 31) + this.businessData.hashCode()) * 31) + Integer.hashCode(this.currentIndex);
        }

        @NotNull
        public String toString() {
            return "CardData(view=" + this.view + ", businessData=" + this.businessData + ", currentIndex=" + this.currentIndex + ')';
        }

        public /* synthetic */ CardData(View view, IRealTimeData iRealTimeData, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(view, iRealTimeData, (i12 & 4) != 0 ? 0 : i11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.frame.view.CardStackView$c */
    /* JADX INFO: compiled from: CardStackView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/realtime/frame/view/CardStackView$animateCardBack$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14833c extends AnimatorListenerAdapter {
        public C14833c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            CardStackView.this.f26158d = null;
            CardStackView.this.f26163i = false;
            CardStackView.this.m30177w();
        }
    }

    /* JADX INFO: renamed from: com.kubi.home.realtime.frame.view.CardStackView$d */
    /* JADX INFO: compiled from: CardStackView.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/home/realtime/frame/view/CardStackView$animateCardOut$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCardStackView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardStackView.kt\ncom/kubi/home/realtime/frame/view/CardStackView$animateCardOut$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    public static final class C14834d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f26173b;

        public C14834d(View view) {
            this.f26173b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Object next;
            Intrinsics.checkNotNullParameter(animation, "animation");
            List list = CardStackView.this.f26156b;
            View view = this.f26173b;
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((CardData) next).getView(), view));
            CardData cardData = (CardData) next;
            if (cardData != null) {
                Function1<IRealTimeData, Unit> onCardSwipedListener = CardStackView.this.getOnCardSwipedListener();
                if (onCardSwipedListener != null) {
                    onCardSwipedListener.invoke(cardData.getBusinessData());
                }
                CardStackView.this.m30176v(cardData.getBusinessData().getUniqueId());
            }
            CardStackView.this.f26158d = null;
            CardStackView.this.f26163i = false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStackView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStackView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: A */
    public final void m30167A(float f11) {
        View view = this.f26156b.size() > 1 ? this.f26156b.get(1).getView() : null;
        if (view != null) {
            int i11 = (int) (16 * getResources().getDisplayMetrics().density);
            int i12 = (int) (4 * getResources().getDisplayMetrics().density);
            float fMin = Math.min(1.0f, Math.max(0.0f, f11));
            float f12 = 1 - fMin;
            int i13 = (int) (i11 * f12);
            int i14 = (int) (i12 * f12);
            view.layout(getPaddingLeft() + i13, getPaddingTop() + i14, (getPaddingLeft() + ((getWidth() - getPaddingLeft()) - getPaddingRight())) - i13, getPaddingTop() + view.getMeasuredHeight() + i14);
            if (fMin > 0.3f) {
                view.setTranslationZ(1.5f);
            }
        }
    }

    @Nullable
    public final Function1<IRealTimeData, Unit> getOnCardClickListener() {
        return this.f26166l;
    }

    @Nullable
    public final Function1<IRealTimeData, Unit> getOnCardSwipedListener() {
        return this.f26165k;
    }

    @Nullable
    public final CardData getTopCard() {
        return (CardData) CollectionsKt.firstOrNull((List) this.f26156b);
    }

    /* JADX INFO: renamed from: n */
    public final void m30168n(@NotNull View view, @NotNull IRealTimeData businessData) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(businessData, "businessData");
        CardData cardData = new CardData(view, businessData, 0, 4, null);
        Iterator<CardData> it = this.f26156b.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getBusinessData().getAutoIncreaseId() < businessData.getAutoIncreaseId()) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            this.f26156b.add(cardData);
        } else {
            this.f26156b.add(i11, cardData);
        }
        addView(view);
        m30179y();
        requestLayout();
        m30170p(view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@Nullable MotionEvent ev2) {
        if (this.f26164j) {
            return super.onInterceptTouchEvent(ev2);
        }
        if (ev2 != null) {
            CardData topCard = getTopCard();
            if (topCard != null && m30175u(ev2.getX(), ev2.getY(), topCard.getView())) {
                if (m30174t(topCard.getView(), ev2.getX(), ev2.getY()) != null) {
                    return false;
                }
                this.f26157c.onTouchEvent(ev2);
                return true;
            }
            this.f26157c.onTouchEvent(ev2);
            if (this.f26163i) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        ViewParent parent;
        View view;
        float x11;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f26164j) {
            return super.onTouchEvent(event);
        }
        boolean zOnTouchEvent = this.f26157c.onTouchEvent(event);
        int action = event.getAction();
        if (action == 0) {
            CardData topCard = getTopCard();
            if (topCard != null && m30175u(event.getX(), event.getY(), topCard.getView())) {
                this.f26158d = topCard.getView();
                this.f26159e = event.getX();
                this.f26160f = event.getY();
                this.f26163i = false;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
        } else if (action == 1) {
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            view = this.f26158d;
            if (view != null) {
                if (this.f26163i) {
                    x11 = event.getX() - this.f26159e;
                    if (Math.abs(x11) > getWidth() * 0.25f) {
                        m30171q(view, x11 > 0.0f);
                        return true;
                    }
                    m30169o(view);
                    return true;
                }
                this.f26158d = null;
                this.f26163i = false;
            }
        } else if (action == 2) {
            View view2 = this.f26158d;
            if (view2 != null) {
                float x12 = event.getX() - this.f26159e;
                float y11 = event.getY() - this.f26160f;
                double d11 = (x12 * x12) + (y11 * y11);
                float fSqrt = (float) Math.sqrt(d11);
                if (!this.f26163i && fSqrt > 20.0f) {
                    this.f26163i = true;
                }
                if (this.f26163i) {
                    if (Math.abs(x12) > Math.abs(y11)) {
                        ViewParent parent3 = getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(true);
                        }
                    } else {
                        ViewParent parent4 = getParent();
                        if (parent4 != null) {
                            parent4.requestDisallowInterceptTouchEvent(false);
                        }
                    }
                    view2.setTranslationX(x12);
                    view2.setTranslationY(y11);
                    view2.setRotation((x12 / getWidth()) * 30.0f);
                    view2.setAlpha(Math.max(0.3f, 1.0f - (((float) Math.sqrt(d11)) / (getWidth() * 0.5f))));
                    return true;
                }
            }
        } else if (action == 3) {
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            view = this.f26158d;
            if (view != null) {
                if (this.f26163i) {
                    x11 = event.getX() - this.f26159e;
                    if (Math.abs(x11) > getWidth() * 0.25f) {
                        m30171q(view, x11 > 0.0f);
                        return true;
                    }
                    m30169o(view);
                    return true;
                }
                this.f26158d = null;
                this.f26163i = false;
            }
        }
        return zOnTouchEvent || super.onTouchEvent(event);
    }

    /* JADX INFO: renamed from: r */
    public final void m30172r() {
        Iterator it = CollectionsKt.toList(this.f26156b).iterator();
        while (it.hasNext()) {
            ((CardData) it.next()).getView().animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m30173s() {
        this.f26156b.clear();
        removeAllViews();
    }

    public final void setHomeDragMode(boolean z11) {
        this.f26164j = z11;
    }

    public final void setOnCardClickListener(@Nullable Function1<? super IRealTimeData, Unit> function1) {
        this.f26166l = function1;
    }

    public final void setOnCardSwipedListener(@Nullable Function1<? super IRealTimeData, Unit> function1) {
        this.f26165k = function1;
    }

    /* JADX INFO: renamed from: t */
    public final View m30174t(View view, float f11, float f12) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                float left = f11 - childAt.getLeft();
                float top = f12 - childAt.getTop();
                if (left >= 0.0f && left < childAt.getWidth() && top >= 0.0f && top < childAt.getHeight()) {
                    Intrinsics.checkNotNull(childAt);
                    View viewM30174t = m30174t(childAt, left, top);
                    if (viewM30174t != null) {
                        return viewM30174t;
                    }
                    if (childAt.isClickable() || childAt.isLongClickable() || (childAt instanceof Button) || (childAt instanceof ImageButton) || (childAt instanceof AppCompatButton)) {
                        return childAt;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m30176v(@NotNull String uniqueId) {
        Object next;
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        Iterator<T> it = this.f26156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CardData) next).getBusinessData().getUniqueId(), uniqueId));
        CardData cardData = (CardData) next;
        if (cardData != null) {
            this.f26156b.remove(cardData);
            removeView(cardData.getView());
            m30179y();
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m30177w() {
        View view = this.f26156b.size() > 1 ? this.f26156b.get(1).getView() : null;
        if (view != null) {
            view.setTranslationZ(1.0f);
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m30178x(@NotNull IRealTimeData businessData) {
        Object next;
        Intrinsics.checkNotNullParameter(businessData, "businessData");
        Iterator<T> it = this.f26156b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((CardData) next).getBusinessData().getUniqueId(), businessData.getUniqueId()));
        CardData cardData = (CardData) next;
        if (cardData != null) {
            CardData cardDataM30181b = CardData.m30181b(cardData, null, businessData, 0, 5, null);
            this.f26156b.set(this.f26156b.indexOf(cardData), cardDataM30181b);
            this.f26156b.remove(cardDataM30181b);
            Iterator<CardData> it2 = this.f26156b.iterator();
            int i11 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it2.next().getBusinessData().getAutoIncreaseId() < businessData.getAutoIncreaseId()) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                this.f26156b.add(cardDataM30181b);
            } else {
                this.f26156b.add(i11, cardDataM30181b);
            }
            m30179y();
            requestLayout();
            m30172r();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m30179y() {
        int i11 = 0;
        for (Object obj : CollectionsKt.toList(this.f26156b)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ((CardData) obj).m30185e(i11);
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m30180z() {
        View view = this.f26158d;
        if (view != null) {
            view.setTranslationX(this.f26161g);
            view.setTranslationY(this.f26162h);
            view.setRotation(this.f26161g * 0.1f);
            float fAbs = Math.abs(this.f26161g) / 200.0f;
            view.setAlpha(1.0f - Math.min(fAbs * 0.5f, 0.5f));
            m30167A(fAbs);
        }
    }

    public /* synthetic */ CardStackView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: renamed from: o */
    public final void m30169o(View view) {
        view.animate().translationX(0.0f).translationY(0.0f).rotation(0.0f).alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).setListener(new C14833c()).start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int measuredHeight;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        if (!this.f26156b.isEmpty()) {
            measuredHeight = this.f26156b.get(0).getView().getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        int i11 = 0;
        for (Object obj : CollectionsKt.toList(this.f26156b)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            View view = ((CardData) obj).getView();
            if (i11 != 0) {
                if (i11 != 1) {
                    view.setVisibility(4);
                } else {
                    int i13 = (int) (16 * getResources().getDisplayMetrics().density);
                    int i14 = (int) (4 * getResources().getDisplayMetrics().density);
                    view.layout(getPaddingLeft() + i13, getPaddingTop() + i14, (getPaddingLeft() + width) - i13, getPaddingTop() + measuredHeight + i14);
                    view.setTranslationZ(1.0f);
                    view.setVisibility(0);
                }
            } else {
                view.layout(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + width, getPaddingTop() + measuredHeight);
                view.setTranslationZ(2.0f);
                view.setVisibility(0);
            }
            i11 = i12;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            measureChild(getChildAt(i11), widthMeasureSpec, heightMeasureSpec);
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: renamed from: p */
    public final void m30170p(View view) {
        view.setScaleX(0.8f);
        view.setScaleY(0.8f);
        view.setAlpha(0.0f);
        view.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m30171q(View view, boolean z11) {
        float f11;
        float width = getWidth();
        if (!z11) {
            width = -width;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = view.animate().translationX(width).alpha(0.0f);
        if (z11) {
            f11 = 30.0f;
        } else {
            f11 = -30.0f;
        }
        viewPropertyAnimatorAlpha.rotation(f11).setDuration(300L).setListener(new C14834d(view)).start();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m30175u(float f11, float f12, View view) {
        if (f11 >= view.getLeft() && f11 <= view.getRight() && f12 >= view.getTop() && f12 <= view.getBottom()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardStackView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26156b = new ArrayList();
        setWillNotDraw(false);
        this.f26157c = new GestureDetector(context, new C14831a());
    }
}
