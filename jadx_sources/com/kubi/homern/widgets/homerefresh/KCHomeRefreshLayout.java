package com.kubi.homern.widgets.homerefresh;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.jumio.liveness.DaClient;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38160d;
import hb0.InterfaceC38161e;
import hb0.InterfaceC38162f;
import ib0.C38510b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 u2\u00020\u0001:\u0007opqrstuB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\tH\u0000¢\u0006\u0002\b/J\u000f\u00100\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b1J\r\u00102\u001a\u00020+H\u0000¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u000bJ\u000e\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u0010J\u000e\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\u000bJ\u000e\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020\u0010J\u001a\u0010<\u001a\u00020+2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)J\u001a\u0010>\u001a\u00020+2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)J\u0010\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0014J\u0010\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020*H\u0016J\b\u0010D\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010F\u001a\u00020\u000bH\u0002J \u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u0010H\u0002J(\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\t2\u0006\u0010H\u001a\u00020\u00102\u0006\u0010I\u001a\u00020\u00102\u0006\u0010M\u001a\u00020 H\u0002J\u0010\u0010N\u001a\u00020+2\u0006\u0010J\u001a\u00020\u0010H\u0002J\u0018\u0010O\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020Q2\u0006\u0010J\u001a\u00020\u0010H\u0002J0\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020 2\u0006\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020 H\u0014J\b\u0010X\u001a\u00020+H\u0014J\u0010\u0010Y\u001a\u00020+2\u0006\u00105\u001a\u00020\u000bH\u0002J\b\u0010Z\u001a\u00020+H\u0002J\u0018\u0010[\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020 H\u0002J\"\u0010^\u001a\u00020+2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020\u000b2\b\b\u0002\u0010_\u001a\u00020\u000bH\u0002J\b\u0010b\u001a\u00020+H\u0002J\u0012\u0010c\u001a\u0004\u0018\u00010\t2\u0006\u0010L\u001a\u00020\tH\u0002J\b\u0010d\u001a\u00020+H\u0002J\b\u0010e\u001a\u00020+H\u0002J\b\u0010f\u001a\u00020+H\u0002J \u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020\u00102\u0006\u0010i\u001a\u00020\u000b2\u0006\u0010j\u001a\u00020\u000bH\u0002J\u0010\u0010k\u001a\u00020+2\u0006\u0010h\u001a\u00020\u0010H\u0002J\b\u0010l\u001a\u00020 H\u0002J\u0014\u0010m\u001a\u00020+2\n\u0010C\u001a\u0006\u0012\u0002\b\u00030nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R6\u0010'\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)0(j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)`,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006v"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout;", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "refreshHeader", "Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshHeader;", "registeredContent", "Landroid/view/View;", "didLayout", "", "pendingRefreshing", "programmaticRefreshing", "secondFloorEnabled", "secondFloorTriggerDistanceDp", "", "secondFloorReady", "secondFloorArmed", "secondFloorReleased", "secondFloorHapticTriggered", "suppressNextRefresh", "attachFailedEmitted", "pendingDistanceDp", "pendingDragging", "pendingReady", "pendingForce", "pullEventScheduled", "lastDistanceDp", "lastDragging", "lastReady", "touchSlop", "", "downX", "downY", "touchDirection", "Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$TouchDirection;", "gestureSequence", "", "nestedTouchObservers", "Ljava/util/LinkedHashSet;", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "Lkotlin/collections/LinkedHashSet;", "addReactContent", "content", "addReactContent$HomeLib_googleRelease", "getReactContent", "getReactContent$HomeLib_googleRelease", "removeReactContent", "removeReactContent$HomeLib_googleRelease", "setRefreshingState", "refreshing", "setProgressViewOffsetDp", "offsetDp", "setSecondFloorEnabled", "enabled", "setSecondFloorTriggerDistanceDp", "distanceDp", "addNestedTouchObserver", "observer", "removeNestedTouchObserver", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "event", "settleCanceledPull", "requestOuterParentDisallowIntercept", "disallowIntercept", "canTouchedChildScrollHorizontally", "x", "y", "deltaX", "canScrollHorizontallyAt", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "direction", "allowNearestPagerIntercept", "canPagerScrollInDirection", "pager", "Landroidx/viewpager2/widget/ViewPager2;", ViewProps.ON_LAYOUT, "changed", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "onDetachedFromWindow", "applyRefreshing", "releaseSecondFloorIfReady", "onHeaderMoving", "isDragging", "offsetPx", "updatePullState", "force", "flushPullEvent", "Ljava/lang/Runnable;", "validateScrollableContent", "findVerticalScrollableChild", "resetGestureState", "emitRefresh", "emitAttachFailed", "emitPullDistanceChange", DaClient.ATTR_DISTANCE, "dragging", "ready", "emitSecondFloorRelease", "surfaceId", "dispatch", "Lcom/facebook/react/uimanager/events/Event;", "TouchDirection", "HomeRefreshEvent", "HomeAttachFailedEvent", "HomePullDistanceEvent", "HomeSecondFloorReleaseEvent", "Header", "Companion", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nKCHomeRefreshLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHomeRefreshLayout.kt\ncom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,473:1\n1#2:474\n1869#3,2:475\n*S KotlinDebug\n*F\n+ 1 KCHomeRefreshLayout.kt\ncom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout\n*L\n143#1:475,2\n*E\n"})
public final class KCHomeRefreshLayout extends SmartRefreshLayout {

    /* JADX INFO: renamed from: E */
    @NotNull
    public static final Companion f27046E = new Companion(null);

    /* JADX INFO: renamed from: A */
    @NotNull
    public TouchDirection f27047A;

    /* JADX INFO: renamed from: B */
    public long f27048B;

    /* JADX INFO: renamed from: C */
    @NotNull
    public final LinkedHashSet<Function1<MotionEvent, Unit>> f27049C;

    /* JADX INFO: renamed from: D */
    @NotNull
    public final Runnable f27050D;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ReactContext f27051b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final KCHomeRefreshHeader f27052c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public View f27053d;

    /* JADX INFO: renamed from: e */
    public boolean f27054e;

    /* JADX INFO: renamed from: f */
    public boolean f27055f;

    /* JADX INFO: renamed from: g */
    public boolean f27056g;

    /* JADX INFO: renamed from: h */
    public boolean f27057h;

    /* JADX INFO: renamed from: i */
    public float f27058i;

    /* JADX INFO: renamed from: j */
    public boolean f27059j;

    /* JADX INFO: renamed from: k */
    public boolean f27060k;

    /* JADX INFO: renamed from: l */
    public boolean f27061l;

    /* JADX INFO: renamed from: m */
    public boolean f27062m;

    /* JADX INFO: renamed from: n */
    public boolean f27063n;

    /* JADX INFO: renamed from: o */
    public boolean f27064o;

    /* JADX INFO: renamed from: p */
    public float f27065p;

    /* JADX INFO: renamed from: q */
    public boolean f27066q;

    /* JADX INFO: renamed from: r */
    public boolean f27067r;

    /* JADX INFO: renamed from: s */
    public boolean f27068s;

    /* JADX INFO: renamed from: t */
    public boolean f27069t;

    /* JADX INFO: renamed from: u */
    public float f27070u;

    /* JADX INFO: renamed from: v */
    public boolean f27071v;

    /* JADX INFO: renamed from: w */
    public boolean f27072w;

    /* JADX INFO: renamed from: x */
    public final int f27073x;

    /* JADX INFO: renamed from: y */
    public float f27074y;

    /* JADX INFO: renamed from: z */
    public float f27075z;

    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$Companion;", "", "<init>", "()V", "DEFAULT_SECOND_FLOOR_TRIGGER_DP", "", "DISTANCE_EPSILON_DP", "CANCEL_RECOVERY_DELAY_MS", "", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$TouchDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Undecided", "Vertical", "Horizontal", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TouchDirection {
        Undecided,
        Vertical,
        Horizontal;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f27077c = EnumEntriesKt.enumEntries(m31377a());

        @NotNull
        public static EnumEntries<TouchDirection> getEntries() {
            return f27077c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout$a */
    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0014\u001a\u00070\u0015¢\u0006\u0002\b\u0016H\u0097\u0001J\u000e\u0010\u0017\u001a\u00070\u0018¢\u0006\u0002\b\u0016H\u0097\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u0096\u0001J \u0010\u001a\u001a\u00020\u000b2\r\b\u0001\u0010\u001b\u001a\u00070\u0010¢\u0006\u0002\b\u00162\u0006\u0010\u001c\u001a\u00020\u0007H\u0097\u0001J!\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0097\u0001J(\u0010\u001f\u001a\u00020\u00052\r\b\u0001\u0010\u001b\u001a\u00070 ¢\u0006\u0002\b\u00162\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0097\u0001J(\u0010!\u001a\u00020\u00052\r\b\u0001\u0010\u001b\u001a\u00070\u0010¢\u0006\u0002\b\u00162\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0097\u0001J(\u0010\"\u001a\u00020\u00052\r\b\u0001\u0010\u001b\u001a\u00070\u0010¢\u0006\u0002\b\u00162\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0097\u0001J\u001f\u0010#\u001a\u00020\u00052\u0014\b\u0001\u0010\u001b\u001a\n %*\u0004\u0018\u00010$0$\"\u00020\u000bH\u0097\u0001¨\u0006&"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$Header;", "Lcom/scwang/smart/refresh/layout/api/RefreshHeader;", "<init>", "(Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout;)V", "onMoving", "", "isDragging", "", "percent", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "height", "maxDragHeight", "onStateChanged", "refreshLayout", "Lcom/scwang/smart/refresh/layout/api/RefreshLayout;", "oldState", "Lcom/scwang/smart/refresh/layout/constant/RefreshState;", "newState", "getSpinnerStyle", "Lcom/scwang/smart/refresh/layout/constant/SpinnerStyle;", "Lkotlin/jvm/internal/EnhancedNullability;", "getView", "Landroid/view/View;", "isSupportHorizontalDrag", "onFinish", "p0", "p1", "onHorizontalDrag", "p2", "onInitialized", "Lcom/scwang/smart/refresh/layout/api/RefreshKernel;", "onReleased", "onStartAnimator", "setPrimaryColors", "", "kotlin.jvm.PlatformType", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public final class C15169a implements InterfaceC38160d {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ KCHomeRefreshHeader f27078b;

        public C15169a() {
            this.f27078b = KCHomeRefreshLayout.this.f27052c;
        }

        @Override // hb0.InterfaceC38157a
        @NonNull
        @NotNull
        public C38510b getSpinnerStyle() {
            return this.f27078b.getSpinnerStyle();
        }

        @Override // hb0.InterfaceC38157a
        @NonNull
        @NotNull
        public View getView() {
            return this.f27078b.getView();
        }

        @Override // hb0.InterfaceC38157a
        public boolean isSupportHorizontalDrag() {
            return this.f27078b.isSupportHorizontalDrag();
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public int onFinish(@NonNull @NotNull InterfaceC38162f p11, boolean z11) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            return this.f27078b.onFinish(p11, z11);
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public void onHorizontalDrag(float p11, int p12, int p13) {
            this.f27078b.onHorizontalDrag(p11, p12, p13);
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public void onInitialized(@NonNull @NotNull InterfaceC38161e p11, int i11, int i12) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            this.f27078b.onInitialized(p11, i11, i12);
        }

        @Override // hb0.InterfaceC38157a
        public void onMoving(boolean isDragging, float percent, int offset, int height, int maxDragHeight) {
            KCHomeRefreshLayout.this.f27052c.onMoving(isDragging, percent, offset, height, maxDragHeight);
            KCHomeRefreshLayout.this.m31370r(isDragging, offset);
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public void onReleased(@NonNull @NotNull InterfaceC38162f p11, int i11, int i12) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            this.f27078b.onReleased(p11, i11, i12);
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public void onStartAnimator(@NonNull @NotNull InterfaceC38162f p11, int i11, int i12) {
            Intrinsics.checkNotNullParameter(p11, "p0");
            this.f27078b.onStartAnimator(p11, i11, i12);
        }

        @Override // jb0.InterfaceC40375i
        public void onStateChanged(@NotNull InterfaceC38162f refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
            Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
            Intrinsics.checkNotNullParameter(oldState, "oldState");
            Intrinsics.checkNotNullParameter(newState, "newState");
            KCHomeRefreshLayout.this.f27052c.onStateChanged(refreshLayout, oldState, newState);
            if (newState == RefreshState.None) {
                KCHomeRefreshLayout.this.m31362A(0.0f, false, true);
            }
        }

        @Override // hb0.InterfaceC38157a
        @RestrictTo({RestrictTo.Scope.LIBRARY, RestrictTo.Scope.LIBRARY_GROUP, RestrictTo.Scope.SUBCLASSES})
        public void setPrimaryColors(@ColorInt int... p11) {
            this.f27078b.setPrimaryColors(p11);
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout$b */
    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$HomeAttachFailedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "<init>", "(II)V", "canCoalesce", "", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15170b extends Event<C15170b> {
        @Override // com.facebook.react.uimanager.events.Event
        public boolean canCoalesce() {
            return false;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "onAttachFailed";
        }

        public C15170b(int i11, int i12) {
            super(i11, i12);
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        /* JADX INFO: renamed from: getEventData */
        public WritableMap getExtraData() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            return writableMapCreateMap;
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout$c */
    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$HomePullDistanceEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", DaClient.ATTR_DISTANCE, "", "dragging", "", "ready", "<init>", "(IIDZZ)V", "canCoalesce", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15171c extends Event<C15171c> {

        /* JADX INFO: renamed from: a */
        public final double f27080a;

        /* JADX INFO: renamed from: b */
        public final boolean f27081b;

        /* JADX INFO: renamed from: c */
        public final boolean f27082c;

        @Override // com.facebook.react.uimanager.events.Event
        public boolean canCoalesce() {
            return false;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "onPullDistanceChange";
        }

        public C15171c(int i11, int i12, double d11, boolean z11, boolean z12) {
            super(i11, i12);
            this.f27080a = d11;
            this.f27081b = z11;
            this.f27082c = z12;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        /* JADX INFO: renamed from: getEventData */
        public WritableMap getExtraData() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(DaClient.ATTR_DISTANCE, this.f27080a);
            writableMapCreateMap.putBoolean("isDragging", this.f27081b);
            writableMapCreateMap.putBoolean("secondFloorReady", this.f27082c);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout$d */
    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$HomeRefreshEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "<init>", "(II)V", "canCoalesce", "", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15172d extends Event<C15172d> {
        @Override // com.facebook.react.uimanager.events.Event
        public boolean canCoalesce() {
            return false;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "onRefresh";
        }

        public C15172d(int i11, int i12) {
            super(i11, i12);
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        /* JADX INFO: renamed from: getEventData */
        public WritableMap getExtraData() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            return writableMapCreateMap;
        }
    }

    /* JADX INFO: renamed from: com.kubi.homern.widgets.homerefresh.KCHomeRefreshLayout$e */
    /* JADX INFO: compiled from: KCHomeRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$HomeSecondFloorReleaseEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", DaClient.ATTR_DISTANCE, "", "<init>", "(IID)V", "canCoalesce", "", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nKCHomeRefreshLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCHomeRefreshLayout.kt\ncom/kubi/homern/widgets/homerefresh/KCHomeRefreshLayout$HomeSecondFloorReleaseEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,473:1\n1#2:474\n*E\n"})
    public static final class C15173e extends Event<C15173e> {

        /* JADX INFO: renamed from: a */
        public final double f27083a;

        @Override // com.facebook.react.uimanager.events.Event
        public boolean canCoalesce() {
            return false;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "onSecondFloorRelease";
        }

        public C15173e(int i11, int i12, double d11) {
            super(i11, i12);
            this.f27083a = d11;
        }

        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        /* JADX INFO: renamed from: getEventData */
        public WritableMap getExtraData() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(DaClient.ATTR_DISTANCE, this.f27083a);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            return writableMapCreateMap;
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m31359q(KCHomeRefreshLayout kCHomeRefreshLayout) {
        kCHomeRefreshLayout.f27069t = false;
        boolean z11 = (Math.abs(kCHomeRefreshLayout.f27065p - kCHomeRefreshLayout.f27070u) < 0.5f && kCHomeRefreshLayout.f27066q == kCHomeRefreshLayout.f27071v && kCHomeRefreshLayout.f27067r == kCHomeRefreshLayout.f27072w) ? false : true;
        if (kCHomeRefreshLayout.f27068s || z11) {
            kCHomeRefreshLayout.m31367n(kCHomeRefreshLayout.f27065p, kCHomeRefreshLayout.f27066q, kCHomeRefreshLayout.f27067r);
            kCHomeRefreshLayout.f27070u = kCHomeRefreshLayout.f27065p;
            kCHomeRefreshLayout.f27071v = kCHomeRefreshLayout.f27066q;
            kCHomeRefreshLayout.f27072w = kCHomeRefreshLayout.f27067r;
        }
        kCHomeRefreshLayout.f27068s = false;
    }

    public final boolean canTouchedChildScrollHorizontally(float x11, float y11, float deltaX) {
        if (deltaX == 0.0f) {
            return false;
        }
        return canScrollHorizontallyAt(this, x11, y11, deltaX < 0.0f ? 1 : -1);
    }

    /* JADX INFO: renamed from: r */
    public final void m31370r(boolean z11, int i11) {
        m31348B(this, Math.max(0, i11) / getResources().getDisplayMetrics().density, z11, false, 4, null);
    }

    public final void setProgressViewOffsetDp(float offsetDp) {
        setHeaderInsetStart(Math.max(0.0f, offsetDp));
    }

    public final void setSecondFloorTriggerDistanceDp(float distanceDp) {
        this.f27058i = Math.max(0.0f, distanceDp);
        m31362A(this.f27065p, this.f27066q, true);
    }

    /* JADX INFO: renamed from: w */
    public final void m31374w() {
        this.f27059j = false;
        this.f27060k = false;
        this.f27061l = false;
        this.f27062m = false;
        this.f27052c.setIndicatorVisible(true);
        m31362A(0.0f, false, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCHomeRefreshLayout(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f27051b = reactContext;
        this.f27052c = new KCHomeRefreshHeader(reactContext);
        this.f27058i = 140.0f;
        this.f27070u = -1.0f;
        this.f27073x = ViewConfiguration.get(reactContext).getScaledTouchSlop();
        this.f27047A = TouchDirection.Undecided;
        this.f27049C = new LinkedHashSet<>();
        setRefreshHeader(new C15169a());
        setEnableLoadMore(false);
        setEnableOverScrollDrag(false);
        setEnableNestedScroll(true);
        setOnRefreshListener(new InterfaceC40373g() { // from class: com.kubi.homern.widgets.homerefresh.b
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                KCHomeRefreshLayout.m31354f(this.f27085b, interfaceC38162f);
            }
        });
        this.f27050D = new Runnable() { // from class: com.kubi.homern.widgets.homerefresh.c
            @Override // java.lang.Runnable
            public final void run() {
                KCHomeRefreshLayout.m31359q(this.f27086b);
            }
        };
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m31348B(KCHomeRefreshLayout kCHomeRefreshLayout, float f11, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        kCHomeRefreshLayout.m31362A(f11, z11, z12);
    }

    /* JADX INFO: renamed from: f */
    public static final void m31354f(KCHomeRefreshLayout kCHomeRefreshLayout, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (kCHomeRefreshLayout.f27063n || kCHomeRefreshLayout.f27061l) {
            kCHomeRefreshLayout.f27063n = false;
            kCHomeRefreshLayout.finishRefresh(0);
        } else {
            if (kCHomeRefreshLayout.f27056g) {
                return;
            }
            kCHomeRefreshLayout.performHapticFeedback(1);
            kCHomeRefreshLayout.emitRefresh();
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m31361y(KCHomeRefreshLayout kCHomeRefreshLayout, long j11) {
        if (kCHomeRefreshLayout.f27048B != j11 || kCHomeRefreshLayout.f27066q || kCHomeRefreshLayout.mSpinner == 0 || kCHomeRefreshLayout.getState() == RefreshState.Refreshing) {
            return;
        }
        kCHomeRefreshLayout.closeHeaderOrFooter();
        kCHomeRefreshLayout.m31362A(0.0f, false, true);
    }

    /* JADX INFO: renamed from: A */
    public final void m31362A(float f11, boolean z11, boolean z12) {
        boolean z13 = this.f27057h && f11 > this.f27058i;
        if (z11) {
            this.f27060k = z13;
        }
        if (z13 != this.f27059j) {
            if (z13 && !this.f27062m) {
                this.f27062m = true;
                performHapticFeedback(0);
            }
            this.f27052c.setIndicatorVisible(!z13);
        }
        this.f27059j = z13;
        this.f27065p = f11;
        this.f27066q = z11;
        this.f27067r = z13;
        this.f27068s = this.f27068s || z12 || z11 != this.f27071v || z13 != this.f27072w;
        if (this.f27069t) {
            return;
        }
        this.f27069t = true;
        postOnAnimation(this.f27050D);
    }

    /* JADX INFO: renamed from: C */
    public final void m31363C() {
        View view = this.f27053d;
        if (view != null) {
            Intrinsics.checkNotNull(view);
            if (m31369p(view) != null) {
                return;
            }
        }
        emitAttachFailed();
    }

    public final void applyRefreshing(boolean refreshing) {
        this.f27056g = refreshing;
        if (!refreshing) {
            finishRefresh();
        } else if (getState() != RefreshState.Refreshing) {
            autoRefreshAnimationOnly();
        }
    }

    public final boolean canScrollHorizontallyAt(View view, float x11, float y11, int direction) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                float scrollX = (viewGroup.getScrollX() + x11) - childAt.getLeft();
                float scrollY = (viewGroup.getScrollY() + y11) - childAt.getTop();
                if (0.0f <= scrollX && scrollX <= childAt.getWidth() && 0.0f <= scrollY && scrollY <= childAt.getHeight()) {
                    Intrinsics.checkNotNull(childAt);
                    if (canScrollHorizontallyAt(childAt, scrollX, scrollY, direction)) {
                        return true;
                    }
                }
            }
        }
        return view != this && view.canScrollHorizontally(direction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 0) {
            this.f27048B++;
        }
        Iterator it = CollectionsKt.toList(this.f27049C).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.f27061l = false;
            this.f27060k = false;
            this.f27062m = false;
            this.f27063n = false;
            this.f27074y = event.getX();
            this.f27075z = event.getY();
            this.f27047A = TouchDirection.Undecided;
            requestOuterParentDisallowIntercept(true);
        } else if (actionMasked == 1) {
            m31371t();
            requestOuterParentDisallowIntercept(false);
            this.f27047A = TouchDirection.Undecided;
        } else if (actionMasked == 2) {
            if (this.f27047A == TouchDirection.Undecided) {
                float fAbs = Math.abs(event.getX() - this.f27074y);
                float fAbs2 = Math.abs(event.getY() - this.f27075z);
                int i11 = this.f27073x;
                if (fAbs > i11 || fAbs2 > i11) {
                    this.f27047A = fAbs2 >= fAbs ? TouchDirection.Vertical : TouchDirection.Horizontal;
                }
            }
            if (this.f27047A == TouchDirection.Horizontal) {
                float x11 = event.getX() - this.f27074y;
                if (canTouchedChildScrollHorizontally(event.getX(), event.getY(), x11)) {
                    requestOuterParentDisallowIntercept(true);
                } else {
                    allowNearestPagerIntercept(x11);
                }
            } else {
                requestOuterParentDisallowIntercept(true);
            }
        }
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(event);
        if (event.getActionMasked() == 3) {
            m31375x();
        }
        return zDispatchTouchEvent;
    }

    public final void emitAttachFailed() {
        if (this.f27064o) {
            return;
        }
        this.f27064o = true;
        m31366m(new C15170b(m31376z(), getId()));
    }

    public final void emitRefresh() {
        m31366m(new C15172d(m31376z(), getId()));
    }

    @Nullable
    /* JADX INFO: renamed from: getReactContent$HomeLib_googleRelease, reason: from getter */
    public final View getF27053d() {
        return this.f27053d;
    }

    /* JADX INFO: renamed from: j */
    public final void m31364j(@NotNull Function1<? super MotionEvent, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f27049C.add(observer);
    }

    /* JADX INFO: renamed from: k */
    public final void m31365k(@NotNull View content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.f27053d != null) {
            throw new IllegalStateException("KCHomeRefreshLayout only supports one RN content view");
        }
        setRefreshContent(content);
        this.f27053d = content;
        post(new Runnable() { // from class: com.kubi.homern.widgets.homerefresh.a
            @Override // java.lang.Runnable
            public final void run() {
                KCHomeRefreshLayout.m31358l(this.f27084b);
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public final void m31366m(Event<?> event) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.f27051b, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(event);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m31367n(float f11, boolean z11, boolean z12) {
        m31366m(new C15171c(m31376z(), getId(), f11, z11, z12));
    }

    /* JADX INFO: renamed from: o */
    public final void m31368o(float f11) {
        m31366m(new C15173e(m31376z(), getId(), f11));
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f27049C.clear();
        removeCallbacks(this.f27050D);
        this.f27069t = false;
        finishRefresh(0);
        this.f27059j = false;
        this.f27060k = false;
        this.f27061l = false;
        this.f27062m = false;
        this.f27052c.setIndicatorVisible(true);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: renamed from: p */
    public final View m31369p(View view) {
        if (!(view instanceof ScrollView) && !(view instanceof AbsListView) && !(view instanceof RecyclerView)) {
            String name = view.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "ReactScrollView", false, 2, (Object) null)) {
                String name2 = view.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (!StringsKt.contains$default((CharSequence) name2, (CharSequence) "RecyclerView", false, 2, (Object) null)) {
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        int childCount = viewGroup.getChildCount();
                        for (int i11 = 0; i11 < childCount; i11++) {
                            View childAt = viewGroup.getChildAt(i11);
                            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
                            View viewM31369p = m31369p(childAt);
                            if (viewM31369p != null) {
                                return viewM31369p;
                            }
                        }
                    }
                    return null;
                }
            }
        }
        return view;
    }

    public final void setRefreshingState(boolean refreshing) {
        this.f27055f = refreshing;
        if (this.f27054e) {
            applyRefreshing(refreshing);
        }
    }

    public final void setSecondFloorEnabled(boolean enabled) {
        this.f27057h = enabled;
        if (enabled || !this.f27059j) {
            return;
        }
        m31362A(this.f27065p, this.f27066q, true);
    }

    /* JADX INFO: renamed from: t */
    public final void m31371t() {
        if (this.f27057h && this.f27059j && this.f27060k && !this.f27061l) {
            this.f27061l = true;
            this.f27063n = true;
            this.f27060k = false;
            this.f27052c.setIndicatorVisible(true);
            m31368o(this.f27065p);
            finishRefresh(0);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m31372u(@NotNull Function1<? super MotionEvent, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.f27049C.remove(observer);
    }

    /* JADX INFO: renamed from: v */
    public final void m31373v() {
        View view = this.f27053d;
        if (view != null) {
            removeView(view);
        }
        this.f27053d = null;
        finishRefresh(0);
        m31374w();
    }

    /* JADX INFO: renamed from: l */
    public static final void m31358l(KCHomeRefreshLayout kCHomeRefreshLayout) {
        kCHomeRefreshLayout.m31363C();
    }

    /* JADX INFO: renamed from: s */
    public static final void m31360s(KCHomeRefreshLayout kCHomeRefreshLayout) {
        kCHomeRefreshLayout.m31363C();
    }

    public final void allowNearestPagerIntercept(float deltaX) {
        ViewPager2 viewPager2;
        ViewParent parent = getParent();
        while (true) {
            if (parent != null) {
                if (parent instanceof ViewPager2) {
                    viewPager2 = (ViewPager2) parent;
                    break;
                }
                parent = parent.getParent();
            } else {
                viewPager2 = null;
                break;
            }
        }
        if (viewPager2 != null && canPagerScrollInDirection(viewPager2, deltaX)) {
            requestOuterParentDisallowIntercept(false);
            ViewParent parent2 = viewPager2.getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
                return;
            }
            return;
        }
        requestOuterParentDisallowIntercept(false);
    }

    public final boolean canPagerScrollInDirection(ViewPager2 pager, float deltaX) {
        int itemCount;
        RecyclerView.Adapter adapter = pager.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) <= 1) {
            return false;
        }
        if (pager.getLayoutDirection() != 1 ? deltaX < 0.0f : deltaX > 0.0f) {
            if (pager.getCurrentItem() >= itemCount - 1) {
                return false;
            }
            return true;
        }
        if (pager.getCurrentItem() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!this.f27054e) {
            this.f27054e = true;
            applyRefreshing(this.f27055f);
            post(new Runnable() { // from class: com.kubi.homern.widgets.homerefresh.e
                @Override // java.lang.Runnable
                public final void run() {
                    KCHomeRefreshLayout.m31360s(this.f27089b);
                }
            });
        }
    }

    public final void requestOuterParentDisallowIntercept(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m31375x() {
        RefreshState state = getState();
        Intrinsics.checkNotNullExpressionValue(state, "getState(...)");
        final long j11 = this.f27048B;
        if (this.mNestedInProgress) {
            this.mNestedInProgress = false;
            this.mTotalUnconsumed = 0;
            stopNestedScroll();
        }
        if (state != RefreshState.Refreshing) {
            closeHeaderOrFooter();
        }
        this.f27060k = false;
        this.f27062m = false;
        this.f27052c.setIndicatorVisible(true);
        m31362A(0.0f, false, true);
        requestOuterParentDisallowIntercept(false);
        this.f27047A = TouchDirection.Undecided;
        postDelayed(new Runnable() { // from class: com.kubi.homern.widgets.homerefresh.d
            @Override // java.lang.Runnable
            public final void run() {
                KCHomeRefreshLayout.m31361y(this.f27087b, j11);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: z */
    public final int m31376z() {
        return UIManagerHelper.getSurfaceId(this);
    }
}
