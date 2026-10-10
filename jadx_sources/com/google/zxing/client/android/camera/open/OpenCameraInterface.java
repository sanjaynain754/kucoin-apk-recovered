package com.google.zxing.client.android.camera.open;

import android.hardware.Camera;
import android.util.Log;

/* JADX INFO: loaded from: classes56.dex */
public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;
    private static final String TAG = "com.google.zxing.client.android.camera.open.OpenCameraInterface";

    private OpenCameraInterface() {
    }

    public static int getCameraId(int i11) {
        boolean z11;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(TAG, "No cameras!");
            return -1;
        }
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 0;
            while (i11 < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i11, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i11++;
            }
        }
        if (i11 < numberOfCameras) {
            return i11;
        }
        if (z11) {
            return -1;
        }
        return 0;
    }

    public static Camera open(int i11) {
        int cameraId = getCameraId(i11);
        if (cameraId == -1) {
            return null;
        }
        return Camera.open(cameraId);
    }
}
