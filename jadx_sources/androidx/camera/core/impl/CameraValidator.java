package androidx.camera.core.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ExperimentalLensFacing;
import androidx.camera.core.Logger;

/* JADX INFO: loaded from: classes23.dex */
@OptIn(markerClass = {ExperimentalLensFacing.class})
public final class CameraValidator {
    private static final CameraSelector EXTERNAL_LENS_FACING = new CameraSelector.Builder().requireLensFacing(2).build();
    private static final String TAG = "CameraValidator";

    public static class CameraIdListIncorrectException extends Exception {
        private final int mAvailableCameraCount;

        public int getAvailableCameraCount() {
            return this.mAvailableCameraCount;
        }

        public CameraIdListIncorrectException(String str, int i11, Throwable th2) {
            super(str, th2);
            this.mAvailableCameraCount = i11;
        }
    }

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static int getDeviceId(Context context) {
            return context.getDeviceId();
        }
    }

    public static void validateCameras(Context context, CameraRepository cameraRepository, CameraSelector cameraSelector) throws CameraIdListIncorrectException {
        Integer lensFacing;
        if (Build.VERSION.SDK_INT >= 34 && Api34Impl.getDeviceId(context) != 0) {
            Logger.m1866d(TAG, "Virtual device with ID: " + Api34Impl.getDeviceId(context) + " has " + cameraRepository.getCameras().size() + " cameras. Skipping validation.");
            return;
        }
        IllegalArgumentException e11 = null;
        if (cameraSelector != null) {
            try {
                lensFacing = cameraSelector.getLensFacing();
                if (lensFacing == null) {
                    Logger.m1872w(TAG, "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e12) {
                Logger.m1869e(TAG, "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e12);
                return;
            }
        } else {
            lensFacing = null;
        }
        Logger.m1866d(TAG, "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + lensFacing);
        PackageManager packageManager = context.getPackageManager();
        int i11 = 0;
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (cameraSelector == null || lensFacing.intValue() == 1)) {
                CameraSelector.DEFAULT_BACK_CAMERA.select(cameraRepository.getCameras());
                i11 = 1;
            }
        } catch (IllegalArgumentException e13) {
            e11 = e13;
            Logger.m1873w(TAG, "Camera LENS_FACING_BACK verification failed", e11);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (cameraSelector == null || lensFacing.intValue() == 0)) {
                CameraSelector.DEFAULT_FRONT_CAMERA.select(cameraRepository.getCameras());
                i11++;
            }
        } catch (IllegalArgumentException e14) {
            e11 = e14;
            Logger.m1873w(TAG, "Camera LENS_FACING_FRONT verification failed", e11);
        }
        try {
            EXTERNAL_LENS_FACING.select(cameraRepository.getCameras());
            Logger.m1866d(TAG, "Found a LENS_FACING_EXTERNAL camera");
            i11++;
        } catch (IllegalArgumentException unused) {
        }
        if (e11 == null) {
            return;
        }
        Logger.m1868e(TAG, "Camera LensFacing verification failed, existing cameras: " + cameraRepository.getCameras());
        throw new CameraIdListIncorrectException("Expected camera missing from device.", i11, e11);
    }

    private CameraValidator() {
    }
}
