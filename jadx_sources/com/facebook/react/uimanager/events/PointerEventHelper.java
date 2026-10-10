package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.react.C5771R;

/* JADX INFO: loaded from: classes45.dex */
public class PointerEventHelper {
    public static final String CLICK = "topClick";
    public static final String POINTER_CANCEL = "topPointerCancel";
    public static final String POINTER_DOWN = "topPointerDown";
    public static final String POINTER_ENTER = "topPointerEnter";
    public static final String POINTER_LEAVE = "topPointerLeave";
    public static final String POINTER_MOVE = "topPointerMove";
    public static final String POINTER_OUT = "topPointerOut";
    public static final String POINTER_OVER = "topPointerOver";
    public static final String POINTER_TYPE_MOUSE = "mouse";
    public static final String POINTER_TYPE_PEN = "pen";
    public static final String POINTER_TYPE_TOUCH = "touch";
    public static final String POINTER_TYPE_UNKNOWN = "";
    public static final String POINTER_UP = "topPointerUp";
    private static final int X_FLAG_SUPPORTS_HOVER = 16777216;

    public enum EVENT {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE
    }

    public static int getEventCategory(String str) {
        if (str == null) {
            return 2;
        }
        switch (str) {
            case "topPointerEnter":
            case "topPointerLeave":
            case "topPointerMove":
            case "topPointerOver":
            case "topPointerOut":
                return 4;
            case "topPointerDown":
            case "topPointerUp":
            case "topPointerCancel":
                return 3;
            default:
                return 2;
        }
    }

    public static String getW3CPointerType(int i11) {
        if (i11 == 1) {
            return POINTER_TYPE_TOUCH;
        }
        if (i11 != 2) {
            return i11 != 3 ? "" : POINTER_TYPE_MOUSE;
        }
        return POINTER_TYPE_PEN;
    }

    public static boolean isBubblingEvent(String str) {
        str.getClass();
        switch (str) {
            case "topPointerDown":
            case "topPointerMove":
            case "topPointerOver":
            case "topPointerUp":
            case "topPointerCancel":
            case "topPointerOut":
                return true;
            default:
                return false;
        }
    }

    public static boolean isExitEvent(String str) {
        str.getClass();
        switch (str) {
            case "topPointerLeave":
            case "topPointerUp":
            case "topPointerOut":
                return true;
            default:
                return false;
        }
    }

    public static boolean isListening(@Nullable View view, EVENT event) {
        if (view == null) {
            return true;
        }
        switch (C61501.f9929x82302621[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Integer num = (Integer) view.getTag(C5771R.id.pointer_events);
                return (num == null || (num.intValue() & (1 << event.ordinal())) == 0) ? false : true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.events.PointerEventHelper$1 */
    public static /* synthetic */ class C61501 {

        /* JADX INFO: renamed from: $SwitchMap$com$facebook$react$uimanager$events$PointerEventHelper$EVENT */
        static final /* synthetic */ int[] f9929x82302621;

        static {
            int[] iArr = new int[EVENT.values().length];
            f9929x82302621 = iArr;
            try {
                iArr[EVENT.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9929x82302621[EVENT.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9929x82302621[EVENT.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9929x82302621[EVENT.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9929x82302621[EVENT.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9929x82302621[EVENT.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9929x82302621[EVENT.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9929x82302621[EVENT.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int getButtonChange(String str, int i11, int i12) {
        int i13 = 0;
        if (POINTER_TYPE_TOUCH.equals(str)) {
            return 0;
        }
        int i14 = i12 ^ i11;
        if (i14 == 0) {
            return -1;
        }
        if (i14 != 1) {
            i13 = 2;
            if (i14 != 2) {
                if (i14 == 4) {
                    return 1;
                }
                if (i14 != 8) {
                    if (i14 != 16) {
                        return -1;
                    }
                    return 4;
                }
                return 3;
            }
        }
        return i13;
    }

    public static int getButtons(String str, String str2, int i11) {
        if (isExitEvent(str)) {
            return 0;
        }
        if (POINTER_TYPE_TOUCH.equals(str2)) {
            return 1;
        }
        return i11;
    }

    public static double getPressure(int i11, String str) {
        if (isExitEvent(str) || i11 == 0) {
            return 0.0d;
        }
        return 0.5d;
    }

    public static boolean supportsHover(MotionEvent motionEvent) {
        if ((motionEvent.getFlags() & 16777216) != 0) {
            return true;
        }
        return motionEvent.isFromSource(8194);
    }
}
