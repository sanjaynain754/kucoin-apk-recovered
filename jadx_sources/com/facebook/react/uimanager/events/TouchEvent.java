package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.Pools;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ReplaceWith;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TouchEvent.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001*B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0007JJ\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0017J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010$\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u0016H\u0014J\b\u0010)\u001a\u00020!H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006+"}, m90084d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent;", "Lcom/facebook/react/uimanager/events/Event;", "<init>", "()V", "motionEvent", "Landroid/view/MotionEvent;", "touchEventType", "Lcom/facebook/react/uimanager/events/TouchEventType;", "coalescingKey", "", "value", "", "viewX", "getViewX", "()F", "viewY", "getViewY", "getMotionEvent", "getTouchEventType", "init", "", "surfaceId", "", "viewTag", "motionEventToCopy", "gestureStartTime", "", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "onDispose", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "dispatch", "rctEventEmitter", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "dispatchModern", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "getEventCategory", "verifyMotionEvent", "Companion", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class TouchEvent extends Event<TouchEvent> {
    private static final int TOUCH_EVENTS_POOL_SIZE = 3;
    public static final long UNSET = Long.MIN_VALUE;
    private short coalescingKey;

    @Nullable
    private MotionEvent motionEvent;

    @Nullable
    private TouchEventType touchEventType;
    private float viewX;
    private float viewY;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = TouchEvent.class.getSimpleName();

    @NotNull
    private static final Pools.SynchronizedPool<TouchEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(3);

    /* JADX INFO: compiled from: TouchEvent.kt */
    @Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007JL\u0010\u000f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0007R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/facebook/react/uimanager/events/TouchEvent$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "Lcom/facebook/react/uimanager/events/TouchEvent;", "UNSET", "", "obtain", "viewTag", "touchEventType", "Lcom/facebook/react/uimanager/events/TouchEventType;", "motionEventToCopy", "Landroid/view/MotionEvent;", "gestureStartTime", "viewX", "", "viewY", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/TouchEventCoalescingKeyHelper;", "surfaceId", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Please use the other overload of the obtain method, which explicitly provides surfaceId", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
        @JvmStatic
        @NotNull
        public final TouchEvent obtain(int viewTag, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            return obtain(-1, viewTag, touchEventType, (MotionEvent) C38115a.m86047c(motionEventToCopy), gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
        }

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final TouchEvent obtain(int surfaceId, int viewTag, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
            Intrinsics.checkNotNullParameter(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            TouchEvent touchEvent = (TouchEvent) TouchEvent.EVENTS_POOL.acquire();
            if (touchEvent == null) {
                touchEvent = new TouchEvent(null);
            }
            TouchEvent touchEvent2 = touchEvent;
            Object objM86047c = C38115a.m86047c(motionEventToCopy);
            Intrinsics.checkNotNullExpressionValue(objM86047c, "assertNotNull(...)");
            touchEvent2.init(surfaceId, viewTag, touchEventType, (MotionEvent) objM86047c, gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
            return touchEvent2;
        }
    }

    public /* synthetic */ TouchEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final TouchEvent obtain(int i11, int i12, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEvent, long j11, float f11, float f12, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i11, i12, touchEventType, motionEvent, j11, f11, f12, touchEventCoalescingKeyHelper);
    }

    /* JADX INFO: compiled from: TouchEvent.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TouchEvent() {
    }

    @Deprecated(message = "Please use the other overload of the obtain method, which explicitly provides surfaceId", replaceWith = @ReplaceWith(expression = "obtain(surfaceId, ...)", imports = {}))
    @JvmStatic
    @NotNull
    public static final TouchEvent obtain(int i11, @Nullable TouchEventType touchEventType, @Nullable MotionEvent motionEvent, long j11, float f11, float f12, @NotNull TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return INSTANCE.obtain(i11, touchEventType, motionEvent, j11, f11, f12, touchEventCoalescingKeyHelper);
    }

    private final boolean verifyMotionEvent() {
        if (this.motionEvent != null) {
            return true;
        }
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG2, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        TouchEventType touchEventType = (TouchEventType) C38115a.m86047c(this.touchEventType);
        int i11 = touchEventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return false;
        }
        if (i11 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.touchEventType);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public int getEventCategory() {
        TouchEventType touchEventType = this.touchEventType;
        if (touchEventType == null) {
            return 2;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[touchEventType.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2 || i11 == 3) {
            return 1;
        }
        if (i11 == 4) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.uimanager.events.Event
    @NotNull
    public String getEventName() {
        TouchEventType.Companion companion = TouchEventType.INSTANCE;
        Object objM86047c = C38115a.m86047c(this.touchEventType);
        Intrinsics.checkNotNullExpressionValue(objM86047c, "assertNotNull(...)");
        return companion.getJSEventName((TouchEventType) objM86047c);
    }

    @NotNull
    public final MotionEvent getMotionEvent() {
        Object objM86047c = C38115a.m86047c(this.motionEvent);
        Intrinsics.checkNotNullExpressionValue(objM86047c, "assertNotNull(...)");
        return (MotionEvent) objM86047c;
    }

    @NotNull
    public final TouchEventType getTouchEventType() {
        Object objM86047c = C38115a.m86047c(this.touchEventType);
        Intrinsics.checkNotNullExpressionValue(objM86047c, "assertNotNull(...)");
        return (TouchEventType) objM86047c;
    }

    public final float getViewX() {
        return this.viewX;
    }

    public final float getViewY() {
        return this.viewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e11) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG2, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(int surfaceId, int viewTag, TouchEventType touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        boolean z11;
        super.init(surfaceId, viewTag, motionEventToCopy.getEventTime());
        short coalescingKey = 0;
        if (gestureStartTime != Long.MIN_VALUE) {
            z11 = true;
        } else {
            z11 = false;
        }
        SoftAssertions.assertCondition(z11, "Gesture start time must be initialized");
        int action = motionEventToCopy.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5 && action != 6) {
                            throw new RuntimeException("Unhandled MotionEvent action: " + action);
                        }
                        touchEventCoalescingKeyHelper.incrementCoalescingKey(gestureStartTime);
                    } else {
                        touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
                    }
                } else {
                    coalescingKey = touchEventCoalescingKeyHelper.getCoalescingKey(gestureStartTime);
                }
            } else {
                touchEventCoalescingKeyHelper.removeCoalescingKey(gestureStartTime);
            }
        } else {
            touchEventCoalescingKeyHelper.addCoalescingKey(gestureStartTime);
        }
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.touchEventType = touchEventType;
        this.coalescingKey = coalescingKey;
        this.viewX = viewX;
        this.viewY = viewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    @Deprecated(message = "Deprecated in Java")
    public void dispatch(@NotNull RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            TouchesHelper.sendTouchesLegacy(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(@NotNull RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        if (verifyMotionEvent()) {
            rctEventEmitter.receiveTouches(this);
        }
    }
}
