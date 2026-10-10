package com.tencent.liteav.videoproducer2;

import android.os.Looper;
import android.view.OrientationEventListener;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.HandlerC34758w;
import com.tencent.liteav.videobase.videobase.SystemDisplayInfo;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class SystemNotificationMonitor extends OrientationEventListener implements HandlerC34758w.a {
    private static final int SENSOR_ROTATION_DETECTION_THRESHOLD = 30;
    private EnumC34747l mDisplayRotation;
    private int mLastOrientation;
    private volatile long mListenerPtr;
    private EnumC34747l mSensorRotation;
    private volatile HandlerC34758w mTimer;

    private static native synchronized int nativeGetGravitySensorRotationCorrection(long j11);

    private static native void nativeSensorChanged(long j11, int i11, int i12);

    private synchronized void notifyOrientationChanged() {
        int i11;
        try {
            if (this.mListenerPtr == 0) {
                return;
            }
            if (getSensorRotationCorrection() != null) {
                i11 = getSensorRotationCorrection().mValue;
            } else {
                EnumC34747l enumC34747l = this.mSensorRotation;
                i11 = enumC34747l != null ? enumC34747l.mValue : 0;
            }
            EnumC34747l enumC34747l2 = this.mDisplayRotation;
            nativeSensorChanged(this.mListenerPtr, i11, enumC34747l2 != null ? enumC34747l2.mValue : 0);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void initialize(long j11) {
        this.mListenerPtr = j11;
        if (this.mTimer != null) {
            return;
        }
        super.enable();
        this.mTimer = new HandlerC34758w(Looper.getMainLooper(), this);
        this.mTimer.m76148a(200);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i11) {
        EnumC34747l enumC34747l;
        if (i11 == -1) {
            return;
        }
        int i12 = this.mLastOrientation;
        if (i12 == -1 || Math.abs(i11 - i12) > 30) {
            this.mLastOrientation = i11;
            if (i11 <= 45) {
                enumC34747l = EnumC34747l.NORMAL;
            } else if (i11 <= 135) {
                enumC34747l = EnumC34747l.ROTATION_90;
            } else if (i11 <= 225) {
                enumC34747l = EnumC34747l.ROTATION_180;
            } else if (i11 <= 315) {
                enumC34747l = EnumC34747l.ROTATION_270;
            } else {
                enumC34747l = EnumC34747l.NORMAL;
            }
            if (this.mSensorRotation != enumC34747l) {
                this.mSensorRotation = enumC34747l;
                this.mDisplayRotation = EnumC34747l.m76131a(SystemDisplayInfo.getDisplayRotationDegree());
                notifyOrientationChanged();
            }
        }
    }

    public synchronized void uninitialize() {
        super.disable();
        this.mListenerPtr = 0L;
        if (this.mTimer != null) {
            this.mTimer.m76147a();
            this.mTimer = null;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.SystemNotificationMonitor$1 */
    public static /* synthetic */ class C349711 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74781a;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f74781a = iArr;
            try {
                iArr[EnumC34747l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74781a[EnumC34747l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74781a[EnumC34747l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74781a[EnumC34747l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private EnumC34747l getSensorRotationByDisplayRotation(EnumC34747l enumC34747l) {
        if (enumC34747l == null) {
            return EnumC34747l.NORMAL;
        }
        int i11 = C349711.f74781a[enumC34747l.ordinal()];
        if (i11 == 1) {
            return EnumC34747l.ROTATION_270;
        }
        if (i11 != 2) {
            return i11 != 3 ? EnumC34747l.NORMAL : EnumC34747l.ROTATION_90;
        }
        return EnumC34747l.ROTATION_180;
    }

    private EnumC34747l getSensorRotationCorrection() {
        if (this.mListenerPtr == 0) {
            return null;
        }
        int iNativeGetGravitySensorRotationCorrection = nativeGetGravitySensorRotationCorrection(this.mListenerPtr);
        if (EnumC34747l.m76132b(iNativeGetGravitySensorRotationCorrection)) {
            return EnumC34747l.m76131a(iNativeGetGravitySensorRotationCorrection);
        }
        return null;
    }

    public SystemNotificationMonitor() {
        super(ContextUtils.getApplicationContext());
        this.mLastOrientation = -1;
        this.mTimer = null;
        this.mListenerPtr = 0L;
        this.mSensorRotation = null;
        this.mDisplayRotation = null;
    }

    @Override // com.tencent.liteav.base.util.HandlerC34758w.a
    public void onTimeout() {
        EnumC34747l enumC34747lM76131a = EnumC34747l.m76131a(SystemDisplayInfo.getDisplayRotationDegree());
        if (this.mDisplayRotation == enumC34747lM76131a) {
            return;
        }
        this.mDisplayRotation = enumC34747lM76131a;
        if (this.mSensorRotation == null) {
            this.mSensorRotation = getSensorRotationByDisplayRotation(enumC34747lM76131a);
        }
        notifyOrientationChanged();
    }
}
