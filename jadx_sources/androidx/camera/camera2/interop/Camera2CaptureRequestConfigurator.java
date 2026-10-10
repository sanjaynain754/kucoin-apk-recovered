package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Camera2CaptureRequestConfigurator.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m90084d2 = {"Landroidx/camera/camera2/interop/Camera2CaptureRequestConfigurator;", "", "configureWith", "", "captureRequest", "Landroid/hardware/camera2/CaptureRequest;", "camera-camera2_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface Camera2CaptureRequestConfigurator {
    void configureWith(@NotNull CaptureRequest captureRequest);
}
