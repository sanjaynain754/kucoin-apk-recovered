package io.flutter.embedding.android;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class AndroidTouchProcessor {

    @VisibleForTesting
    static final int BYTES_PER_FIELD = 8;

    @VisibleForTesting
    static final int DEFAULT_HORIZONTAL_SCROLL_FACTOR = 48;

    @VisibleForTesting
    static final int DEFAULT_VERTICAL_SCROLL_FACTOR = 48;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int IMPLICIT_VIEW_ID = 0;

    @VisibleForTesting
    static final int POINTER_DATA_FIELD_COUNT = 36;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final String TAG = "AndroidTouchProcessor";
    private int cachedVerticalScrollFactor;

    @NonNull
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;
    private final Map<Integer, float[]> ongoingPans = new HashMap();

    @NonNull
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();

    /* JADX INFO: loaded from: classes60.dex */
    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;

        /* JADX INFO: renamed from: UP */
        public static final int f86729UP = 6;
    }

    /* JADX INFO: loaded from: classes60.dex */
    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    /* JADX INFO: loaded from: classes60.dex */
    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCALE = 3;
        public static final int SCROLL = 1;
        public static final int SCROLL_INERTIA_CANCEL = 2;
        public static final int UNKNOWN = 4;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i11, int i12, int i13, Matrix matrix, ByteBuffer byteBuffer) {
        addPointerForIndex(motionEvent, i11, i12, i13, matrix, byteBuffer, null);
    }

    @PointerChange
    private int getPointerChangeForAction(int i11) {
        if (i11 == 0) {
            return 4;
        }
        if (i11 == 1) {
            return 6;
        }
        if (i11 == 5) {
            return 4;
        }
        if (i11 == 6) {
            return 6;
        }
        if (i11 == 2) {
            return 5;
        }
        if (i11 == 7) {
            return 3;
        }
        if (i11 == 3) {
            return 0;
        }
        return i11 == 8 ? 3 : -1;
    }

    @PointerChange
    private int getPointerChangeForPanZoom(int i11) {
        if (i11 == 4) {
            return 7;
        }
        if (i11 == 5) {
            return 8;
        }
        return (i11 == 6 || i11 == 0) ? 9 : -1;
    }

    @PointerDeviceKind
    private int getPointerDeviceTypeForToolType(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 != 3) {
            return i11 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent, @NonNull Context context) {
        boolean zIsFromSource = motionEvent.isFromSource(2);
        boolean z11 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!zIsFromSource || !z11) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, byteBufferAllocateDirect, context);
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i11, int i12, int i13, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int i14;
        int i15;
        long buttonState;
        int pointerChangeForPanZoom;
        int i16;
        double min;
        double max;
        double d11;
        double d12;
        double horizontalScrollFactor;
        double verticalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (i12 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(i11);
        int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i11));
        float[] fArr = {motionEvent.getX(i11), motionEvent.getY(i11)};
        matrix.mapPoints(fArr);
        if (pointerDeviceTypeForToolType == 1) {
            i15 = 0;
            i14 = 1;
            buttonState = motionEvent.getButtonState() & 31;
            if (buttonState == 0 && motionEvent.getSource() == 8194 && i12 == 4) {
                this.ongoingPans.put(Integer.valueOf(pointerId), fArr);
            }
        } else {
            i14 = 1;
            i15 = 0;
            buttonState = pointerDeviceTypeForToolType == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean zContainsKey = this.ongoingPans.containsKey(Integer.valueOf(pointerId));
        if (zContainsKey) {
            pointerChangeForPanZoom = getPointerChangeForPanZoom(i12);
            if (pointerChangeForPanZoom == -1) {
                return;
            }
        } else {
            pointerChangeForPanZoom = -1;
        }
        long id2 = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent).getId() : 0L;
        int i17 = motionEvent.getActionMasked() == 8 ? i14 : i15;
        int i18 = pointerChangeForPanZoom;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(id2);
        byteBuffer.putLong(eventTime);
        if (zContainsKey) {
            i16 = i18;
            byteBuffer.putLong(i16);
            byteBuffer.putLong(4L);
        } else {
            i16 = i18;
            byteBuffer.putLong(i12);
            byteBuffer.putLong(pointerDeviceTypeForToolType);
        }
        byteBuffer.putLong(i17);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (zContainsKey) {
            float[] fArr2 = this.ongoingPans.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr2[i15]);
            byteBuffer.putDouble(fArr2[i14]);
        } else {
            byteBuffer.putDouble(fArr[i15]);
            byteBuffer.putDouble(fArr[i14]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(buttonState);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(i11));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            min = 0.0d;
            max = 1.0d;
        } else {
            min = motionRange.getMin();
            max = motionRange.getMax();
        }
        byteBuffer.putDouble(min);
        byteBuffer.putDouble(max);
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, i11));
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
        } else {
            d11 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(i11));
        byteBuffer.putDouble(motionEvent.getToolMajor(i11));
        byteBuffer.putDouble(motionEvent.getToolMinor(i11));
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(d11);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, i11));
        if (pointerDeviceTypeForToolType == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, i11));
        } else {
            byteBuffer.putDouble(d11);
        }
        byteBuffer.putLong(i13);
        if (i17 == i14) {
            if (context != null) {
                horizontalScrollFactor = getHorizontalScrollFactor(context);
                verticalScrollFactor = getVerticalScrollFactor(context);
            } else {
                horizontalScrollFactor = 48.0d;
                verticalScrollFactor = 48.0d;
            }
            double d13 = horizontalScrollFactor * ((double) (-motionEvent.getAxisValue(10, i11)));
            double d14 = verticalScrollFactor * ((double) (-motionEvent.getAxisValue(9, i11)));
            byteBuffer.putDouble(d13);
            byteBuffer.putDouble(d14);
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (zContainsKey) {
            float[] fArr3 = this.ongoingPans.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[i15] - fArr3[i15]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d12 = 0.0d;
        } else {
            d12 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(d12);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d12);
        byteBuffer.putLong(0L);
        if (zContainsKey && i16 == 9) {
            this.ongoingPans.remove(Integer.valueOf(pointerId));
        }
    }

    private float getHorizontalScrollFactor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? ViewConfiguration.get(context).getScaledHorizontalScrollFactor() : getVerticalScrollFactorPre26(context);
    }

    private float getVerticalScrollFactor(@NonNull Context context) {
        return Build.VERSION.SDK_INT >= 26 ? getVerticalScrollFactorAbove26(context) : getVerticalScrollFactorPre26(context);
    }

    private int getVerticalScrollFactorPre26(@NonNull Context context) {
        if (this.cachedVerticalScrollFactor == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                return 48;
            }
            this.cachedVerticalScrollFactor = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.cachedVerticalScrollFactor;
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent, @NonNull Matrix matrix) {
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z11 = actionMasked == 0 || actionMasked == 5;
        boolean z12 = !z11 && (actionMasked == 1 || actionMasked == 6);
        int i11 = (z12 && getPointerDeviceTypeForToolType(motionEvent.getToolType(motionEvent.getActionIndex())) == 0) ? 1 : 0;
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((pointerCount + i11) * 288);
        byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        if (z11) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
        } else if (z12) {
            for (int i12 = 0; i12 < pointerCount; i12++) {
                if (i12 != motionEvent.getActionIndex() && motionEvent.getToolType(i12) == 1) {
                    addPointerForIndex(motionEvent, i12, 5, 1, matrix, byteBufferAllocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            if (i11 != 0) {
                addPointerForIndex(motionEvent, motionEvent.getActionIndex(), 2, 0, matrix, byteBufferAllocateDirect);
            }
        } else {
            for (int i13 = 0; i13 < pointerCount; i13++) {
                addPointerForIndex(motionEvent, i13, pointerChangeForAction, 0, matrix, byteBufferAllocateDirect);
            }
        }
        if (byteBufferAllocateDirect.position() % 288 != 0) {
            throw new AssertionError("Packet position is not on field boundary");
        }
        this.renderer.dispatchPointerDataPacket(byteBufferAllocateDirect, byteBufferAllocateDirect.position());
        return true;
    }

    public AndroidTouchProcessor(@NonNull FlutterRenderer flutterRenderer, boolean z11) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z11;
    }

    @TargetApi(26)
    private float getVerticalScrollFactorAbove26(@NonNull Context context) {
        return ViewConfiguration.get(context).getScaledVerticalScrollFactor();
    }
}
