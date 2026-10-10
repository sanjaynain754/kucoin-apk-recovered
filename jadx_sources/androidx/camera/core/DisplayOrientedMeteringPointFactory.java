package androidx.camera.core;

import android.graphics.PointF;
import android.view.Display;
import androidx.annotation.RestrictTo;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;

/* JADX INFO: loaded from: classes23.dex */
public final class DisplayOrientedMeteringPointFactory extends MeteringPointFactory {
    private final CameraInfo mCameraInfo;
    private final Display mDisplay;
    private final float mHeight;
    private final float mWidth;

    private int getRelativeCameraOrientation(boolean z11) {
        try {
            int sensorRotationDegrees = this.mCameraInfo.getSensorRotationDegrees(this.mDisplay.getRotation());
            return z11 ? (360 - sensorRotationDegrees) % TXVodDownloadDataSource.QUALITY_360P : sensorRotationDegrees;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.camera.core.MeteringPointFactory
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PointF convertPoint(float f11, float f12) {
        float f13 = this.mWidth;
        float f14 = this.mHeight;
        boolean z11 = this.mCameraInfo.getLensFacing() == 0;
        int relativeCameraOrientation = getRelativeCameraOrientation(z11);
        if (relativeCameraOrientation != 90 && relativeCameraOrientation != 270) {
            f12 = f11;
            f11 = f12;
            f14 = f13;
            f13 = f14;
        }
        if (relativeCameraOrientation == 90) {
            f11 = f13 - f11;
        } else if (relativeCameraOrientation == 180) {
            f12 = f14 - f12;
            f11 = f13 - f11;
        } else if (relativeCameraOrientation == 270) {
            f12 = f14 - f12;
        }
        if (z11) {
            f12 = f14 - f12;
        }
        return new PointF(f12 / f14, f11 / f13);
    }

    public DisplayOrientedMeteringPointFactory(Display display, CameraInfo cameraInfo, float f11, float f12) {
        this.mWidth = f11;
        this.mHeight = f12;
        this.mDisplay = display;
        this.mCameraInfo = cameraInfo;
    }
}
