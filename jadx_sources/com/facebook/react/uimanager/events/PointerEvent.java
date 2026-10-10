package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.tencent.bugly.proguard.C33556b3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p302h6.C38115a;

/* JADX INFO: loaded from: classes45.dex */
public class PointerEvent extends Event<PointerEvent> {
    private static final Pools.SynchronizedPool<PointerEvent> EVENTS_POOL = new Pools.SynchronizedPool<>(6);
    private static final int POINTER_EVENTS_POOL_SIZE = 6;
    private static final String TAG = "PointerEvent";
    private static final short UNSET_COALESCING_KEY = -1;
    private short mCoalescingKey = -1;

    @Nullable
    private Event.EventAnimationDriverMatchSpec mEventAnimationDriverMatchSpec;

    @Nullable
    private String mEventName;
    private PointerEventState mEventState;

    @Nullable
    private MotionEvent mMotionEvent;

    @Nullable
    private List<WritableMap> mPointersEventData;

    public static class PointerEventState {
        private int mActivePointerId;
        private Map<Integer, float[]> mEventCoordinatesByPointerId;
        private Map<Integer, List<TouchTargetHelper.ViewTarget>> mHitPathByPointerId;
        private Set<Integer> mHoveringPointerIds;
        private int mLastButtonState;
        private Map<Integer, float[]> mOffsetByPointerId;
        private int mPrimaryPointerId;
        private Map<Integer, float[]> mScreenCoordinatesByPointerId;
        private int mSurfaceId;

        public int getActivePointerId() {
            return this.mActivePointerId;
        }

        public final Map<Integer, float[]> getEventCoordinatesByPointerId() {
            return this.mEventCoordinatesByPointerId;
        }

        public final Map<Integer, List<TouchTargetHelper.ViewTarget>> getHitPathByPointerId() {
            return this.mHitPathByPointerId;
        }

        public final List<TouchTargetHelper.ViewTarget> getHitPathForActivePointer() {
            return this.mHitPathByPointerId.get(Integer.valueOf(this.mActivePointerId));
        }

        public Set<Integer> getHoveringPointerIds() {
            return this.mHoveringPointerIds;
        }

        public int getLastButtonState() {
            return this.mLastButtonState;
        }

        public final Map<Integer, float[]> getOffsetByPointerId() {
            return this.mOffsetByPointerId;
        }

        public int getPrimaryPointerId() {
            return this.mPrimaryPointerId;
        }

        public final Map<Integer, float[]> getScreenCoordinatesByPointerId() {
            return this.mScreenCoordinatesByPointerId;
        }

        public int getSurfaceId() {
            return this.mSurfaceId;
        }

        public boolean supportsHover(int i11) {
            return this.mHoveringPointerIds.contains(Integer.valueOf(i11));
        }

        public PointerEventState(int i11, int i12, int i13, int i14, Map<Integer, float[]> map, Map<Integer, List<TouchTargetHelper.ViewTarget>> map2, Map<Integer, float[]> map3, Map<Integer, float[]> map4, Set<Integer> set) {
            this.mPrimaryPointerId = i11;
            this.mActivePointerId = i12;
            this.mLastButtonState = i13;
            this.mSurfaceId = i14;
            this.mOffsetByPointerId = map;
            this.mHitPathByPointerId = map2;
            this.mEventCoordinatesByPointerId = map3;
            this.mScreenCoordinatesByPointerId = map4;
            this.mHoveringPointerIds = new HashSet(set);
        }
    }

    private List<WritableMap> createPointersEventData() {
        int actionIndex = this.mMotionEvent.getActionIndex();
        String str = this.mEventName;
        str.getClass();
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerDown":
            case "topPointerOver":
            case "topPointerUp":
            case "topClick":
            case "topPointerOut":
                return Arrays.asList(createW3CPointerEvent(actionIndex));
            case "topPointerMove":
            case "topPointerCancel":
                return createW3CPointerEvents();
            default:
                return null;
        }
    }

    public static PointerEvent obtain(String str, int i11, PointerEventState pointerEventState, MotionEvent motionEvent) {
        PointerEvent pointerEventAcquire = EVENTS_POOL.acquire();
        if (pointerEventAcquire == null) {
            pointerEventAcquire = new PointerEvent();
        }
        PointerEvent pointerEvent = pointerEventAcquire;
        pointerEvent.init(str, i11, pointerEventState, (MotionEvent) C38115a.m86047c(motionEvent), (short) 0);
        return pointerEvent;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.mPointersEventData = null;
        MotionEvent motionEvent = this.mMotionEvent;
        this.mMotionEvent = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e11) {
            ReactSoftExceptionLogger.logSoftException(TAG, e11);
        }
    }

    private void addModifierKeyData(WritableMap writableMap, int i11) {
        writableMap.putBoolean("ctrlKey", (i11 & 4096) != 0);
        writableMap.putBoolean("shiftKey", (i11 & 1) != 0);
        writableMap.putBoolean("altKey", (i11 & 2) != 0);
        writableMap.putBoolean("metaKey", (i11 & 65536) != 0);
    }

    private List<WritableMap> createW3CPointerEvents() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.mMotionEvent.getPointerCount(); i11++) {
            arrayList.add(createW3CPointerEvent(i11));
        }
        return arrayList;
    }

    private boolean isClickEvent() {
        return this.mEventName.equals(PointerEventHelper.CLICK);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (this.mMotionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.mPointersEventData == null) {
            this.mPointersEventData = createPointersEventData();
        }
        List<WritableMap> list = this.mPointersEventData;
        if (list == null) {
            return;
        }
        boolean z11 = list.size() > 1;
        for (WritableMap writableMapCopy : this.mPointersEventData) {
            if (z11) {
                writableMapCopy = writableMapCopy.copy();
            }
            rCTEventEmitter.receiveEvent(getViewTag(), this.mEventName, writableMapCopy);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (this.mMotionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a Pointer that has no MotionEvent; the PointerEvehas been recycled"));
            return;
        }
        if (this.mPointersEventData == null) {
            this.mPointersEventData = createPointersEventData();
        }
        List<WritableMap> list = this.mPointersEventData;
        if (list == null) {
            return;
        }
        boolean z11 = list.size() > 1;
        for (WritableMap writableMapCopy : this.mPointersEventData) {
            if (z11) {
                writableMapCopy = writableMapCopy.copy();
            }
            WritableMap writableMap = writableMapCopy;
            int surfaceId = getSurfaceId();
            int viewTag = getViewTag();
            String str = this.mEventName;
            short s11 = this.mCoalescingKey;
            rCTModernEventEmitter.receiveEvent(surfaceId, viewTag, str, s11 != -1, s11, writableMap, PointerEventHelper.getEventCategory(str));
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.mCoalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public Event.EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new Event.EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.PointerEvent.1
                @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
                public boolean match(int i11, String str) {
                    if (!str.equals(PointerEvent.this.mEventName)) {
                        return false;
                    }
                    if (!PointerEventHelper.isBubblingEvent(str)) {
                        return PointerEvent.this.getViewTag() == i11;
                    }
                    Iterator<TouchTargetHelper.ViewTarget> it = PointerEvent.this.mEventState.getHitPathForActivePointer().iterator();
                    while (it.hasNext()) {
                        if (it.next().getViewId() == i11) {
                            return true;
                        }
                    }
                    return false;
                }
            };
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.mEventName;
    }

    private PointerEvent() {
    }

    private WritableMap createW3CPointerEvent(int i11) {
        boolean z11;
        double pressure;
        WritableMap writableMapCreateMap = Arguments.createMap();
        int pointerId = this.mMotionEvent.getPointerId(i11);
        writableMapCreateMap.putDouble("pointerId", pointerId);
        String w3CPointerType = PointerEventHelper.getW3CPointerType(this.mMotionEvent.getToolType(i11));
        writableMapCreateMap.putString("pointerType", w3CPointerType);
        if (!isClickEvent() && (this.mEventState.supportsHover(pointerId) || pointerId == this.mEventState.mPrimaryPointerId)) {
            z11 = true;
        } else {
            z11 = false;
        }
        writableMapCreateMap.putBoolean("isPrimary", z11);
        float[] fArr = this.mEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        double dIPFromPixel = PixelUtil.toDIPFromPixel(fArr[0]);
        double dIPFromPixel2 = PixelUtil.toDIPFromPixel(fArr[1]);
        writableMapCreateMap.putDouble("clientX", dIPFromPixel);
        writableMapCreateMap.putDouble("clientY", dIPFromPixel2);
        float[] fArr2 = this.mEventState.getScreenCoordinatesByPointerId().get(Integer.valueOf(pointerId));
        double dIPFromPixel3 = PixelUtil.toDIPFromPixel(fArr2[0]);
        double dIPFromPixel4 = PixelUtil.toDIPFromPixel(fArr2[1]);
        writableMapCreateMap.putDouble("screenX", dIPFromPixel3);
        writableMapCreateMap.putDouble("screenY", dIPFromPixel4);
        writableMapCreateMap.putDouble("x", dIPFromPixel);
        writableMapCreateMap.putDouble("y", dIPFromPixel2);
        writableMapCreateMap.putDouble("pageX", dIPFromPixel);
        writableMapCreateMap.putDouble("pageY", dIPFromPixel2);
        float[] fArr3 = this.mEventState.getOffsetByPointerId().get(Integer.valueOf(pointerId));
        writableMapCreateMap.putDouble("offsetX", PixelUtil.toDIPFromPixel(fArr3[0]));
        writableMapCreateMap.putDouble("offsetY", PixelUtil.toDIPFromPixel(fArr3[1]));
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("timestamp", getTimestampMs());
        writableMapCreateMap.putInt(C33556b3.f68963J, 0);
        writableMapCreateMap.putDouble("tiltX", 0.0d);
        writableMapCreateMap.putDouble("tiltY", 0.0d);
        writableMapCreateMap.putInt("twist", 0);
        if (!w3CPointerType.equals(PointerEventHelper.POINTER_TYPE_MOUSE) && !isClickEvent()) {
            double dIPFromPixel5 = PixelUtil.toDIPFromPixel(this.mMotionEvent.getTouchMajor(i11));
            writableMapCreateMap.putDouble("width", dIPFromPixel5);
            writableMapCreateMap.putDouble("height", dIPFromPixel5);
        } else {
            writableMapCreateMap.putDouble("width", 1.0d);
            writableMapCreateMap.putDouble("height", 1.0d);
        }
        int buttonState = this.mMotionEvent.getButtonState();
        writableMapCreateMap.putInt("button", PointerEventHelper.getButtonChange(w3CPointerType, this.mEventState.getLastButtonState(), buttonState));
        writableMapCreateMap.putInt("buttons", PointerEventHelper.getButtons(this.mEventName, w3CPointerType, buttonState));
        if (isClickEvent()) {
            pressure = 0.0d;
        } else {
            pressure = PointerEventHelper.getPressure(writableMapCreateMap.getInt("buttons"), this.mEventName);
        }
        writableMapCreateMap.putDouble("pressure", pressure);
        writableMapCreateMap.putDouble("tangentialPressure", 0.0d);
        addModifierKeyData(writableMapCreateMap, this.mMotionEvent.getMetaState());
        return writableMapCreateMap;
    }

    private void init(String str, int i11, PointerEventState pointerEventState, MotionEvent motionEvent, short s11) {
        super.init(pointerEventState.getSurfaceId(), i11, motionEvent.getEventTime());
        this.mEventName = str;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = s11;
        this.mEventState = pointerEventState;
    }

    public static PointerEvent obtain(String str, int i11, PointerEventState pointerEventState, MotionEvent motionEvent, short s11) {
        PointerEvent pointerEventAcquire = EVENTS_POOL.acquire();
        if (pointerEventAcquire == null) {
            pointerEventAcquire = new PointerEvent();
        }
        PointerEvent pointerEvent = pointerEventAcquire;
        pointerEvent.init(str, i11, pointerEventState, (MotionEvent) C38115a.m86047c(motionEvent), s11);
        return pointerEvent;
    }
}
