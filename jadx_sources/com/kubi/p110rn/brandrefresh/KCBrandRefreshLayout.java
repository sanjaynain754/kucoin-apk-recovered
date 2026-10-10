package com.kubi.p110rn.brandrefresh;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.kubi.p110rn.brandrefresh.KCBrandRefreshLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.tencent.qcloud.tuicore.TUIConstants;
import hb0.InterfaceC38162f;
import jb0.InterfaceC40373g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCBrandRefreshLayout.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0003:;<B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0015J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0019J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u0007H\u0002J \u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0002J(\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u000eH\u0002J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020\u000eH\u0002J\u000e\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u000eJ\u000e\u0010/\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0007J\u0010\u00101\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u0007H\u0002J0\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\fH\u0014J\b\u00108\u001a\u00020\u0013H\u0002J\b\u00109\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout;", "Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "didLayout", "", "pendingRefreshing", "registeredContent", "Landroid/view/View;", "touchSlop", "", "downX", "", "downY", "touchDirection", "Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout$TouchDirection;", "addReactContent", "", "content", "addReactContent$BReactNativeLib_googleRelease", "getReactContent", "getReactContent$BReactNativeLib_googleRelease", "removeReactContent", "removeReactContent$BReactNativeLib_googleRelease", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "requestOuterParentDisallowIntercept", "disallowIntercept", "canTouchedChildScrollHorizontally", "x", "y", "deltaX", "canScrollHorizontallyAt", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "direction", "allowNearestPagerIntercept", "canPagerScrollInDirection", "pager", "Landroidx/viewpager2/widget/ViewPager2;", "setProgressViewOffsetDp", "offsetDp", "setRefreshingState", "refreshing", "applyRefreshing", ViewProps.ON_LAYOUT, "changed", "left", ViewProps.TOP, "right", ViewProps.BOTTOM, "emitRefresh", "emitAttachFailed", "TouchDirection", "RefreshEvent", "AttachFailedEvent", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nKCBrandRefreshLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCBrandRefreshLayout.kt\ncom/kubi/rn/brandrefresh/KCBrandRefreshLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,271:1\n1#2:272\n*E\n"})
public final class KCBrandRefreshLayout extends SmartRefreshLayout {
    private boolean didLayout;
    private float downX;
    private float downY;
    private boolean pendingRefreshing;

    @NotNull
    private final ReactContext reactContext;

    @Nullable
    private View registeredContent;

    @NotNull
    private TouchDirection touchDirection;
    private final int touchSlop;

    /* JADX INFO: compiled from: KCBrandRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout$TouchDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Undecided", "Vertical", "Horizontal", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum TouchDirection {
        Undecided,
        Vertical,
        Horizontal;


        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ EnumEntries f45544c = EnumEntriesKt.enumEntries(m55682a());

        @NotNull
        public static EnumEntries<TouchDirection> getEntries() {
            return f45544c;
        }
    }

    /* JADX INFO: renamed from: com.kubi.rn.brandrefresh.KCBrandRefreshLayout$a */
    /* JADX INFO: compiled from: KCBrandRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout$AttachFailedEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "<init>", "(II)V", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23209a extends Event<C23209a> {
        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "topAttachFailed";
        }

        public C23209a(int i11, int i12) {
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

    /* JADX INFO: renamed from: com.kubi.rn.brandrefresh.KCBrandRefreshLayout$b */
    /* JADX INFO: compiled from: KCBrandRefreshLayout.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/rn/brandrefresh/KCBrandRefreshLayout$RefreshEvent;", "Lcom/facebook/react/uimanager/events/Event;", "surfaceId", "", "viewTag", "<init>", "(II)V", "getEventName", "", "getEventData", "Lcom/facebook/react/bridge/WritableMap;", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23210b extends Event<C23210b> {
        @Override // com.facebook.react.uimanager.events.Event
        @NotNull
        public String getEventName() {
            return "topRefresh";
        }

        public C23210b(int i11, int i12) {
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

    private final boolean canTouchedChildScrollHorizontally(float x11, float y11, float deltaX) {
        if (deltaX == 0.0f) {
            return false;
        }
        return canScrollHorizontallyAt(this, x11, y11, deltaX < 0.0f ? 1 : -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCBrandRefreshLayout(@NotNull ReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.touchSlop = ViewConfiguration.get(reactContext).getScaledTouchSlop();
        this.touchDirection = TouchDirection.Undecided;
        setRefreshHeader(new KCBrandRnRefreshHeader(reactContext));
        setEnableLoadMore(false);
        setEnableOverScrollDrag(false);
        setEnableNestedScroll(false);
        setOnRefreshListener(new InterfaceC40373g() { // from class: mx.a
            @Override // jb0.InterfaceC40373g
            /* JADX INFO: renamed from: a */
            public final void mo15329a(InterfaceC38162f interfaceC38162f) {
                KCBrandRefreshLayout._init_$lambda$0(this.f94402b, interfaceC38162f);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(KCBrandRefreshLayout kCBrandRefreshLayout, InterfaceC38162f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kCBrandRefreshLayout.performHapticFeedback(1);
        kCBrandRefreshLayout.emitRefresh();
    }

    private final void applyRefreshing(boolean refreshing) {
        if (!refreshing) {
            finishRefresh();
        } else if (getState() != RefreshState.Refreshing) {
            autoRefreshAnimationOnly();
        }
    }

    private final boolean canScrollHorizontallyAt(View view, float x11, float y11, int direction) {
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

    private final void emitAttachFailed() {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        eventDispatcherForReactTag.dispatchEvent(new C23209a(UIManagerHelper.getSurfaceId(this), getId()));
    }

    private final void emitRefresh() {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.reactContext, getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        eventDispatcherForReactTag.dispatchEvent(new C23210b(UIManagerHelper.getSurfaceId(this), getId()));
    }

    public final void addReactContent$BReactNativeLib_googleRelease(@NotNull View content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.registeredContent != null) {
            throw new IllegalStateException("KCBrandRefreshLayout only supports one RN content view");
        }
        setRefreshContent(content);
        this.registeredContent = content;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downX = event.getX();
            this.downY = event.getY();
            this.touchDirection = TouchDirection.Undecided;
            requestOuterParentDisallowIntercept(true);
        } else if (actionMasked == 1) {
            requestOuterParentDisallowIntercept(false);
            this.touchDirection = TouchDirection.Undecided;
        } else if (actionMasked == 2) {
            if (this.touchDirection == TouchDirection.Undecided) {
                float fAbs = Math.abs(event.getX() - this.downX);
                float fAbs2 = Math.abs(event.getY() - this.downY);
                int i11 = this.touchSlop;
                if (fAbs > i11 || fAbs2 > i11) {
                    this.touchDirection = fAbs2 >= fAbs ? TouchDirection.Vertical : TouchDirection.Horizontal;
                }
            }
            if (this.touchDirection == TouchDirection.Horizontal) {
                float x11 = event.getX() - this.downX;
                if (canTouchedChildScrollHorizontally(event.getX(), event.getY(), x11)) {
                    requestOuterParentDisallowIntercept(true);
                } else {
                    allowNearestPagerIntercept(x11);
                }
            } else {
                requestOuterParentDisallowIntercept(true);
            }
        } else if (actionMasked == 3) {
            requestOuterParentDisallowIntercept(false);
            this.touchDirection = TouchDirection.Undecided;
        }
        return super.dispatchTouchEvent(event);
    }

    @Nullable
    /* JADX INFO: renamed from: getReactContent$BReactNativeLib_googleRelease, reason: from getter */
    public final View getRegisteredContent() {
        return this.registeredContent;
    }

    public final void removeReactContent$BReactNativeLib_googleRelease() {
        View view = this.registeredContent;
        if (view == null) {
            return;
        }
        removeView(view);
        this.registeredContent = null;
    }

    public final void setRefreshingState(boolean refreshing) {
        this.pendingRefreshing = refreshing;
        if (this.didLayout) {
            applyRefreshing(refreshing);
        }
    }

    private final void allowNearestPagerIntercept(float deltaX) {
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

    private final boolean canPagerScrollInDirection(ViewPager2 pager, float deltaX) {
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

    private final void requestOuterParentDisallowIntercept(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }

    @Override // com.scwang.smart.refresh.layout.SmartRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!this.didLayout) {
            this.didLayout = true;
            applyRefreshing(this.pendingRefreshing);
            if (this.registeredContent == null) {
                emitAttachFailed();
            }
        }
    }

    public final void setProgressViewOffsetDp(float offsetDp) {
        setHeaderInsetStart(offsetDp);
    }
}
