package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.systrace.Systrace;

/* JADX INFO: loaded from: classes45.dex */
public class TouchesHelper {
    private static final String CHANGED_TOUCHES_KEY = "changedTouches";
    private static final String LOCATION_X_KEY = "locationX";
    private static final String LOCATION_Y_KEY = "locationY";
    private static final String PAGE_X_KEY = "pageX";
    private static final String PAGE_Y_KEY = "pageY";
    private static final String POINTER_IDENTIFIER_KEY = "identifier";
    private static final String TAG = "TouchesHelper";

    @Deprecated
    public static final String TARGET_KEY = "target";
    private static final String TARGET_SURFACE_KEY = "targetSurface";
    private static final String TIMESTAMP_KEY = "timestamp";
    private static final String TOUCHES_KEY = "touches";

    public static void sendTouchEvent(RCTModernEventEmitter rCTModernEventEmitter, TouchEvent touchEvent) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        Systrace.m10662c(0L, "TouchesHelper.sentTouchEventModern(" + touchEvent.getEventName() + ")");
        try {
            TouchEventType touchEventType = touchEvent.getTouchEventType();
            MotionEvent motionEvent = touchEvent.getMotionEvent();
            if (motionEvent == null) {
                ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
                Systrace.m10667i(0L);
                return;
            }
            WritableMap[] writableMapArrCreatePointersArray = createPointersArray(touchEvent);
            int i11 = C61511.$SwitchMap$com$facebook$react$uimanager$events$TouchEventType[touchEventType.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    int actionIndex = motionEvent.getActionIndex();
                    WritableMap writableMap = writableMapArrCreatePointersArray[actionIndex];
                    writableMapArrCreatePointersArray[actionIndex] = null;
                    writableMapArr2 = new WritableMap[]{writableMap};
                } else if (i11 == 3) {
                    writableMapArr2 = new WritableMap[writableMapArrCreatePointersArray.length];
                    for (int i12 = 0; i12 < writableMapArrCreatePointersArray.length; i12++) {
                        writableMapArr2[i12] = writableMapArrCreatePointersArray[i12].copy();
                    }
                } else if (i11 != 4) {
                    writableMapArr = writableMapArrCreatePointersArray;
                    writableMapArrCreatePointersArray = null;
                } else {
                    writableMapArr = new WritableMap[0];
                }
                writableMapArrCreatePointersArray = writableMapArr2;
                writableMapArr = writableMapArrCreatePointersArray;
            } else {
                writableMapArr = writableMapArrCreatePointersArray;
                writableMapArrCreatePointersArray = new WritableMap[]{writableMapArrCreatePointersArray[motionEvent.getActionIndex()].copy()};
            }
            if (writableMapArrCreatePointersArray != null) {
                for (WritableMap writableMap2 : writableMapArrCreatePointersArray) {
                    WritableMap writableMapCopy = writableMap2.copy();
                    WritableArray writableArray = getWritableArray(true, writableMapArrCreatePointersArray);
                    WritableArray writableArray2 = getWritableArray(true, writableMapArr);
                    writableMapCopy.putArray(CHANGED_TOUCHES_KEY, writableArray);
                    writableMapCopy.putArray(TOUCHES_KEY, writableArray2);
                    rCTModernEventEmitter.receiveEvent(touchEvent.getSurfaceId(), touchEvent.getViewTag(), touchEvent.getEventName(), touchEvent.canCoalesce(), 0, writableMapCopy, touchEvent.getEventCategory());
                }
            }
            Systrace.m10667i(0L);
        } catch (Throwable th2) {
            Systrace.m10667i(0L);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.events.TouchesHelper$1 */
    public static /* synthetic */ class C61511 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$events$TouchEventType;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            $SwitchMap$com$facebook$react$uimanager$events$TouchEventType = iArr;
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static WritableMap[] createPointersArray(TouchEvent touchEvent) {
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableMap[] writableMapArr = new WritableMap[motionEvent.getPointerCount()];
        float x11 = motionEvent.getX() - touchEvent.getViewX();
        float y11 = motionEvent.getY() - touchEvent.getViewY();
        for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putDouble(PAGE_X_KEY, PixelUtil.toDIPFromPixel(motionEvent.getX(i11)));
            writableMapCreateMap.putDouble(PAGE_Y_KEY, PixelUtil.toDIPFromPixel(motionEvent.getY(i11)));
            float x12 = motionEvent.getX(i11) - x11;
            float y12 = motionEvent.getY(i11) - y11;
            writableMapCreateMap.putDouble(LOCATION_X_KEY, PixelUtil.toDIPFromPixel(x12));
            writableMapCreateMap.putDouble(LOCATION_Y_KEY, PixelUtil.toDIPFromPixel(y12));
            writableMapCreateMap.putInt(TARGET_SURFACE_KEY, touchEvent.getSurfaceId());
            writableMapCreateMap.putInt("target", touchEvent.getViewTag());
            writableMapCreateMap.putDouble(TIMESTAMP_KEY, touchEvent.getTimestampMs());
            writableMapCreateMap.putDouble(POINTER_IDENTIFIER_KEY, motionEvent.getPointerId(i11));
            writableMapArr[i11] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private static WritableArray getWritableArray(boolean z11, WritableMap... writableMapArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : writableMapArr) {
            if (writableMapCopy != null) {
                if (z11) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        return writableArrayCreateArray;
    }

    public static void sendTouchesLegacy(RCTEventEmitter rCTEventEmitter, TouchEvent touchEvent) {
        TouchEventType touchEventType = touchEvent.getTouchEventType();
        WritableArray writableArray = getWritableArray(false, createPointersArray(touchEvent));
        MotionEvent motionEvent = touchEvent.getMotionEvent();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (touchEventType != TouchEventType.MOVE && touchEventType != TouchEventType.CANCEL) {
            if (touchEventType != TouchEventType.START && touchEventType != TouchEventType.END) {
                throw new RuntimeException("Unknown touch type: " + touchEventType);
            }
            writableArrayCreateArray.pushInt(motionEvent.getActionIndex());
        } else {
            for (int i11 = 0; i11 < motionEvent.getPointerCount(); i11++) {
                writableArrayCreateArray.pushInt(i11);
            }
        }
        rCTEventEmitter.receiveTouches(TouchEventType.getJSEventName(touchEventType), writableArray, writableArrayCreateArray);
    }
}
