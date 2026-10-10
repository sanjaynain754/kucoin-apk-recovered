package jumio.camerax;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import com.jumio.core.enums.FlashState;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.camerax.a */
/* JADX INFO: loaded from: classes61.dex */
public final class C40475a extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a */
    public long f89854a;

    /* JADX INFO: renamed from: b */
    public int f89855b;

    /* JADX INFO: renamed from: c */
    public float f89856c;

    /* JADX INFO: renamed from: e */
    public float f89858e;

    /* JADX INFO: renamed from: f */
    public ColorSpaceTransform f89859f;

    /* JADX INFO: renamed from: g */
    public RggbChannelVector f89860g;

    /* JADX INFO: renamed from: d */
    public int f89857d = 4;

    /* JADX INFO: renamed from: h */
    public FlashState f89861h = FlashState.UNAVAILABLE;

    /* JADX INFO: renamed from: a */
    public final C40492r m89125a() {
        long j11 = this.f89854a;
        int i11 = this.f89855b;
        float f11 = this.f89856c;
        int i12 = this.f89857d;
        float f12 = this.f89858e;
        ColorSpaceTransform colorSpaceTransform = this.f89859f;
        ColorSpaceTransform colorSpaceTransformM89126a = colorSpaceTransform != null ? AbstractC40476b.m89126a(colorSpaceTransform) : null;
        RggbChannelVector rggbChannelVector = this.f89860g;
        return new C40492r(j11, i11, f11, i12, f12, colorSpaceTransformM89126a, rggbChannelVector != null ? AbstractC40476b.m89127a(rggbChannelVector) : null, this.f89861h);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(result, "result");
        super.onCaptureCompleted(session, request, result);
        Integer num = (Integer) result.get(TotalCaptureResult.SENSOR_SENSITIVITY);
        if (num != null) {
            this.f89855b = num.intValue();
        }
        Long l11 = (Long) result.get(TotalCaptureResult.SENSOR_EXPOSURE_TIME);
        if (l11 != null) {
            this.f89854a = l11.longValue();
        }
        Float f11 = (Float) result.get(TotalCaptureResult.LENS_APERTURE);
        if (f11 != null) {
            float fFloatValue = f11.floatValue();
            if (!Float.isNaN(fFloatValue) && !Float.isInfinite(fFloatValue)) {
                this.f89856c = fFloatValue;
            }
        }
        Integer num2 = (Integer) result.get(TotalCaptureResult.CONTROL_AF_MODE);
        if (num2 != null) {
            this.f89857d = num2.intValue();
        }
        Float f12 = (Float) result.get(CaptureResult.LENS_FOCUS_DISTANCE);
        if (f12 != null) {
            float fFloatValue2 = f12.floatValue();
            if (!Float.isNaN(fFloatValue2) && !Float.isInfinite(fFloatValue2)) {
                this.f89858e = fFloatValue2;
            }
        }
        ColorSpaceTransform colorSpaceTransform = (ColorSpaceTransform) result.get(CaptureResult.COLOR_CORRECTION_TRANSFORM);
        if (colorSpaceTransform != null) {
            this.f89859f = colorSpaceTransform;
        }
        RggbChannelVector rggbChannelVector = (RggbChannelVector) result.get(CaptureResult.COLOR_CORRECTION_GAINS);
        if (rggbChannelVector != null) {
            this.f89860g = rggbChannelVector;
        }
        Integer num3 = (Integer) result.get(CaptureResult.FLASH_STATE);
        if (num3 != null) {
            this.f89861h = FlashState.INSTANCE.fromCaptureRequest(num3.intValue());
        }
    }
}
