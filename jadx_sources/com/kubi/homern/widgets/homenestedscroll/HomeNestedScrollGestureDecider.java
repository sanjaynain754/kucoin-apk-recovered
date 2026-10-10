package com.kubi.homern.widgets.homenestedscroll;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: HomeNestedScrollGestureDecider.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 '2\u00020\u0001:\u0003%&'BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u000fH\u0002J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u000fH\u0002J-\u0010 \u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u000f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00110\bH\u0082\bJ\u0018\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider;", "Landroid/view/View$OnTouchListener;", "feed", "Landroid/view/View;", "outerProvider", "Lkotlin/Function0;", "headerProvider", "onFeedTouched", "Lkotlin/Function1;", "", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "state", "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureState;", "touchSlop", "", "feedToOuterHandoffDistance", "", "downwardAtFeedTopDistance", "lastFeedOwnsVertical", "", "Ljava/lang/Boolean;", "multiTouchActive", "onTouch", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "event", "Landroid/view/MotionEvent;", "onTouchEvent", "decide", "focalX", "skipIndex", "focalY", "focalCoordinate", "coordinate", "isHeaderPinned", "outer", "header", "GestureAxis", "GestureState", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHomeNestedScrollGestureDecider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNestedScrollGestureDecider.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider\n*L\n1#1,178:1\n155#1,8:179\n155#1,8:187\n*S KotlinDebug\n*F\n+ 1 HomeNestedScrollGestureDecider.kt\ncom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider\n*L\n145#1:179,8\n148#1:187,8\n*E\n"})
public final class HomeNestedScrollGestureDecider implements View.OnTouchListener {

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final Companion f27007l = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public final View f27008b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Function0<View> f27009c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final Function0<View> f27010d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final Function1<View, Unit> f27011e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public final GestureState f27012f;

    /* JADX INFO: renamed from: g */
    public final int f27013g;

    /* JADX INFO: renamed from: h */
    public final float f27014h;

    /* JADX INFO: renamed from: i */
    public float f27015i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public Boolean f27016j;

    /* JADX INFO: renamed from: k */
    public boolean f27017k;

    /* JADX INFO: compiled from: HomeNestedScrollGestureDecider.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$Companion;", "", "<init>", "()V", "FEED_TO_OUTER_HANDOFF_DISTANCE_DP", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: HomeNestedScrollGestureDecider.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;", "", "<init>", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum GestureAxis {
        HORIZONTAL,
        VERTICAL;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f27019c = EnumEntriesKt.enumEntries(m31329a());

        @NotNull
        public static EnumEntries<GestureAxis> getEntries() {
            return f27019c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homenestedscroll.HomeNestedScrollGestureDecider$a, reason: from toString */
    /* JADX INFO: compiled from: HomeNestedScrollGestureDecider.kt */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, m90084d2 = {"Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureState;", "", "downX", "", "downY", "lastY", "axis", "Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;", "<init>", "(FFFLcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;)V", "getDownX", "()F", "setDownX", "(F)V", "getDownY", "setDownY", "getLastY", "setLastY", "getAxis", "()Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;", "setAxis", "(Lcom/kubi/homern/widgets/homenestedscroll/HomeNestedScrollGestureDecider$GestureAxis;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class GestureState {

        /* JADX INFO: renamed from: a, reason: from toString */
        public float downX;

        /* JADX INFO: renamed from: b, reason: from toString */
        public float downY;

        /* JADX INFO: renamed from: c, reason: from toString */
        public float lastY;

        /* JADX INFO: renamed from: d, reason: from toString */
        @Nullable
        public GestureAxis axis;

        public GestureState() {
            this(0.0f, 0.0f, 0.0f, null, 15, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GestureState)) {
                return false;
            }
            GestureState gestureState = (GestureState) other;
            return Float.compare(this.downX, gestureState.downX) == 0 && Float.compare(this.downY, gestureState.downY) == 0 && Float.compare(this.lastY, gestureState.lastY) == 0 && this.axis == gestureState.axis;
        }

        public GestureState(float f11, float f12, float f13, @Nullable GestureAxis gestureAxis) {
            this.downX = f11;
            this.downY = f12;
            this.lastY = f13;
            this.axis = gestureAxis;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final GestureAxis getAxis() {
            return this.axis;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getDownX() {
            return this.downX;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getDownY() {
            return this.downY;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getLastY() {
            return this.lastY;
        }

        /* JADX INFO: renamed from: e */
        public final void m31334e(@Nullable GestureAxis gestureAxis) {
            this.axis = gestureAxis;
        }

        /* JADX INFO: renamed from: f */
        public final void m31335f(float f11) {
            this.downX = f11;
        }

        /* JADX INFO: renamed from: g */
        public final void m31336g(float f11) {
            this.downY = f11;
        }

        /* JADX INFO: renamed from: h */
        public final void m31337h(float f11) {
            this.lastY = f11;
        }

        public int hashCode() {
            int iHashCode = ((((Float.hashCode(this.downX) * 31) + Float.hashCode(this.downY)) * 31) + Float.hashCode(this.lastY)) * 31;
            GestureAxis gestureAxis = this.axis;
            return iHashCode + (gestureAxis == null ? 0 : gestureAxis.hashCode());
        }

        @NotNull
        public String toString() {
            return "GestureState(downX=" + this.downX + ", downY=" + this.downY + ", lastY=" + this.lastY + ", axis=" + this.axis + ')';
        }

        public /* synthetic */ GestureState(float f11, float f12, float f13, GestureAxis gestureAxis, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12, (i11 & 4) != 0 ? 0.0f : f13, (i11 & 8) != 0 ? null : gestureAxis);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m31324a(MotionEvent motionEvent) {
        boolean z11 = false;
        float fM31322c = m31322c(this, motionEvent, 0, 2, null);
        float fM31323e = m31323e(this, motionEvent, 0, 2, null);
        if (this.f27012f.getAxis() == null) {
            float downX = fM31322c - this.f27012f.getDownX();
            float downY = fM31323e - this.f27012f.getDownY();
            if (Math.max(Math.abs(downX), Math.abs(downY)) < this.f27013g) {
                return;
            } else {
                this.f27012f.m31334e(Math.abs(downX) > Math.abs(downY) ? GestureAxis.HORIZONTAL : GestureAxis.VERTICAL);
            }
        }
        float lastY = fM31323e - this.f27012f.getLastY();
        this.f27012f.m31337h(fM31323e);
        if (this.f27012f.getAxis() == GestureAxis.HORIZONTAL) {
            this.f27015i = 0.0f;
            ViewParent parent = this.f27008b.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        View viewInvoke = this.f27009c.invoke();
        View viewInvoke2 = this.f27010d.invoke();
        boolean z12 = (viewInvoke == null || viewInvoke2 == null || !m31327f(viewInvoke, viewInvoke2)) ? false : true;
        boolean z13 = lastY > 0.0f;
        boolean zCanScrollVertically = this.f27008b.canScrollVertically(-1);
        if (z12) {
            if (zCanScrollVertically || lastY < 0.0f) {
                this.f27015i = 0.0f;
            } else if (z13 || this.f27015i > 0.0f) {
                float fCoerceAtLeast = this.f27015i + RangesKt.coerceAtLeast(lastY, 0.0f);
                this.f27015i = fCoerceAtLeast;
                if (fCoerceAtLeast < this.f27014h) {
                }
            }
            z11 = true;
        } else {
            this.f27015i = 0.0f;
        }
        ViewParent parent2 = this.f27008b.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(z11);
        }
        this.f27016j = Boolean.valueOf(z11);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m31327f(View view, View view2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        return ((float) iArr2[1]) <= ((float) (iArr[1] + view.getPaddingTop())) + view.getResources().getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeNestedScrollGestureDecider(@NotNull View feed, @NotNull Function0<? extends View> outerProvider, @NotNull Function0<? extends View> headerProvider, @NotNull Function1<? super View, Unit> onFeedTouched) {
        Intrinsics.checkNotNullParameter(feed, "feed");
        Intrinsics.checkNotNullParameter(outerProvider, "outerProvider");
        Intrinsics.checkNotNullParameter(headerProvider, "headerProvider");
        Intrinsics.checkNotNullParameter(onFeedTouched, "onFeedTouched");
        this.f27008b = feed;
        this.f27009c = outerProvider;
        this.f27010d = headerProvider;
        this.f27011e = onFeedTouched;
        this.f27012f = new GestureState(0.0f, 0.0f, 0.0f, null, 15, null);
        int scaledTouchSlop = ViewConfiguration.get(feed.getContext()).getScaledTouchSlop();
        this.f27013g = scaledTouchSlop;
        this.f27014h = Math.max(scaledTouchSlop * 2.0f, feed.getResources().getDisplayMetrics().density * 32.0f);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ float m31322c(HomeNestedScrollGestureDecider homeNestedScrollGestureDecider, MotionEvent motionEvent, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        return homeNestedScrollGestureDecider.m31325b(motionEvent, i11);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ float m31323e(HomeNestedScrollGestureDecider homeNestedScrollGestureDecider, MotionEvent motionEvent, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = -1;
        }
        return homeNestedScrollGestureDecider.m31326d(motionEvent, i11);
    }

    /* JADX INFO: renamed from: g */
    public final void m31328g(@NotNull MotionEvent event) {
        boolean zBooleanValue;
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f27012f.m31335f(event.getX());
            this.f27012f.m31336g(event.getY());
            this.f27012f.m31337h(event.getY());
            this.f27012f.m31334e(null);
            this.f27015i = 0.0f;
            this.f27016j = null;
            this.f27017k = false;
            this.f27011e.invoke(this.f27008b);
            ViewParent parent = this.f27008b.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (!this.f27017k) {
                    m31324a(event);
                    return;
                }
                this.f27012f.m31337h(m31323e(this, event, 0, 2, null));
                ViewParent parent2 = this.f27008b.getParent();
                if (parent2 != null) {
                    Boolean bool = this.f27016j;
                    parent2.requestDisallowInterceptTouchEvent(bool != null ? bool.booleanValue() : true);
                    return;
                }
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    this.f27017k = true;
                    this.f27012f.m31337h(m31323e(this, event, 0, 2, null));
                    Boolean bool2 = this.f27016j;
                    zBooleanValue = bool2 != null ? bool2.booleanValue() : true;
                    ViewParent parent3 = this.f27008b.getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(zBooleanValue);
                        return;
                    }
                    return;
                }
                if (actionMasked != 6) {
                    return;
                }
                this.f27012f.m31337h(m31326d(event, event.getActionIndex()));
                this.f27017k = event.getPointerCount() > 2;
                Boolean bool3 = this.f27016j;
                zBooleanValue = bool3 != null ? bool3.booleanValue() : true;
                ViewParent parent4 = this.f27008b.getParent();
                if (parent4 != null) {
                    parent4.requestDisallowInterceptTouchEvent(zBooleanValue);
                    return;
                }
                return;
            }
        }
        this.f27012f.m31334e(null);
        this.f27015i = 0.0f;
        this.f27016j = null;
        this.f27017k = false;
        ViewParent parent5 = this.f27008b.getParent();
        if (parent5 != null) {
            parent5.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        m31328g(event);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final float m31325b(MotionEvent motionEvent, int i11) {
        int pointerCount = motionEvent.getPointerCount();
        float x11 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (i13 != i11) {
                x11 += motionEvent.getX(i13);
                i12++;
            }
        }
        if (i12 <= 0) {
            return 0.0f;
        }
        return x11 / i12;
    }

    /* JADX INFO: renamed from: d */
    public final float m31326d(MotionEvent motionEvent, int i11) {
        int pointerCount = motionEvent.getPointerCount();
        float y11 = 0.0f;
        int i12 = 0;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (i13 != i11) {
                y11 += motionEvent.getY(i13);
                i12++;
            }
        }
        if (i12 <= 0) {
            return 0.0f;
        }
        return y11 / i12;
    }
}
