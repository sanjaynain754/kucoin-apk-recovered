package com.jumio.commons.camera;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010À\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/camera/CameraCallbackInterface;", "", "onCameraAvailable", "", "onCameraError", "t", "", "onCameraFallback", "onPreviewAvailable", "settings", "Lcom/jumio/commons/camera/CameraSettings;", "onPreviewFrame", TypedValues.AttributesType.S_FRAME, "Lcom/jumio/commons/camera/Frame;", "onCaptureFrame", "onStopPreview", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CameraCallbackInterface {
    void onCameraAvailable();

    void onCameraError(@Nullable Throwable t11);

    void onCameraFallback();

    void onCaptureFrame(@Nullable Frame frame);

    void onPreviewAvailable(@NotNull CameraSettings settings);

    void onPreviewFrame(@NotNull Frame frame);

    void onStopPreview();
}
