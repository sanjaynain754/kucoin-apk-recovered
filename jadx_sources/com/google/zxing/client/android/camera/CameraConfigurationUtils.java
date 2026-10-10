package com.google.zxing.client.android.camera;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import com.journeyapps.barcodescanner.camera.CameraSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes56.dex */
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final Pattern SEMICOLON = Pattern.compile(";");
    private static final String TAG = "CameraConfiguration";

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats(parameters.flatten());
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @TargetApi(15)
    private static List<Camera.Area> buildMiddleArea(int i11) {
        int i12 = -i11;
        return Collections.singletonList(new Camera.Area(new Rect(i12, i12, i11, i11), 1));
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(1000);
        sb2.append("BOARD=");
        sb2.append(Build.BOARD);
        sb2.append('\n');
        sb2.append("BRAND=");
        sb2.append(Build.BRAND);
        sb2.append('\n');
        sb2.append("CPU_ABI=");
        sb2.append(Build.CPU_ABI);
        sb2.append('\n');
        sb2.append("DEVICE=");
        sb2.append(Build.DEVICE);
        sb2.append('\n');
        sb2.append("DISPLAY=");
        sb2.append(Build.DISPLAY);
        sb2.append('\n');
        sb2.append("FINGERPRINT=");
        sb2.append(Build.FINGERPRINT);
        sb2.append('\n');
        sb2.append("HOST=");
        sb2.append(Build.HOST);
        sb2.append('\n');
        sb2.append("ID=");
        sb2.append(Build.ID);
        sb2.append('\n');
        sb2.append("MANUFACTURER=");
        sb2.append(Build.MANUFACTURER);
        sb2.append('\n');
        sb2.append("MODEL=");
        sb2.append(Build.MODEL);
        sb2.append('\n');
        sb2.append("PRODUCT=");
        sb2.append(Build.PRODUCT);
        sb2.append('\n');
        sb2.append("TAGS=");
        sb2.append(Build.TAGS);
        sb2.append('\n');
        sb2.append("TIME=");
        sb2.append(Build.TIME);
        sb2.append('\n');
        sb2.append("TYPE=");
        sb2.append(Build.TYPE);
        sb2.append('\n');
        sb2.append("USER=");
        sb2.append(Build.USER);
        sb2.append('\n');
        sb2.append("VERSION.CODENAME=");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append('\n');
        sb2.append("VERSION.INCREMENTAL=");
        sb2.append(Build.VERSION.INCREMENTAL);
        sb2.append('\n');
        sb2.append("VERSION.RELEASE=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append('\n');
        sb2.append("VERSION.SDK_INT=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append('\n');
        if (charSequence != null) {
            String[] strArrSplit = SEMICOLON.split(charSequence);
            Arrays.sort(strArrSplit);
            for (String str : strArrSplit) {
                sb2.append(str);
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
        Log.i(TAG, "Requesting " + str + " value from among: " + Arrays.toString(strArr));
        Log.i(TAG, "Supported " + str + " values: " + collection);
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    Log.i(TAG, "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i(TAG, "No supported values match");
        return null;
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i11, int i12) {
        int[] next;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        Log.i(TAG, "Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange));
        if (supportedPreviewFpsRange == null || supportedPreviewFpsRange.isEmpty()) {
            return;
        }
        Iterator<int[]> it = supportedPreviewFpsRange.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i13 = next[0];
            int i14 = next[1];
            if (i13 >= i11 * 1000 && i14 <= i12 * 1000) {
                break;
            }
        }
        if (next == null) {
            Log.i(TAG, "No suitable FPS range?");
            return;
        }
        int[] iArr = new int[2];
        parameters.getPreviewFpsRange(iArr);
        if (Arrays.equals(iArr, next)) {
            Log.i(TAG, "FPS range already set to " + Arrays.toString(next));
            return;
        }
        Log.i(TAG, "Setting FPS range to " + Arrays.toString(next));
        parameters.setPreviewFpsRange(next[0], next[1]);
    }

    private CameraConfigurationUtils() {
    }

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d11) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        Log.i(TAG, "Zoom ratios: " + zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios != null && !zoomRatios.isEmpty() && zoomRatios.size() == maxZoom + 1) {
            double d12 = d11 * 100.0d;
            double d13 = Double.POSITIVE_INFINITY;
            int i11 = 0;
            for (int i12 = 0; i12 < zoomRatios.size(); i12++) {
                double dAbs = Math.abs(((double) zoomRatios.get(i12).intValue()) - d12);
                if (dAbs < d13) {
                    i11 = i12;
                    d13 = dAbs;
                }
            }
            Log.i(TAG, "Chose zoom ratio of " + (((double) zoomRatios.get(i11).intValue()) / 100.0d));
            return Integer.valueOf(i11);
        }
        Log.w(TAG, "Invalid zoom ratios!");
        return null;
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        if (OptionalModuleUtils.BARCODE.equals(parameters.getSceneMode())) {
            Log.i(TAG, "Barcode scene mode already set");
            return;
        }
        String strFindSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), OptionalModuleUtils.BARCODE);
        if (strFindSettableValue != null) {
            parameters.setSceneMode(strFindSettableValue);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z11) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f11 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z11) {
                    f11 = 1.5f;
                }
                int iRound = Math.round(f11 / exposureCompensationStep);
                float f12 = exposureCompensationStep * iRound;
                int iMax = Math.max(Math.min(iRound, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == iMax) {
                    Log.i(TAG, "Exposure compensation already set to " + iMax + " / " + f12);
                    return;
                }
                Log.i(TAG, "Setting exposure compensation to " + iMax + " / " + f12);
                parameters.setExposureCompensation(iMax);
                return;
            }
        }
        Log.i(TAG, "Camera does not support exposure compensation");
    }

    public static void setFocus(Camera.Parameters parameters, CameraSettings.FocusMode focusMode, boolean z11) {
        String strFindSettableValue;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!z11 && focusMode != CameraSettings.FocusMode.AUTO) {
            if (focusMode == CameraSettings.FocusMode.CONTINUOUS) {
                strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
            } else if (focusMode == CameraSettings.FocusMode.INFINITY) {
                strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "infinity");
            } else if (focusMode == CameraSettings.FocusMode.MACRO) {
                strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro");
            } else {
                strFindSettableValue = null;
            }
        } else {
            strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "auto");
        }
        if (!z11 && strFindSettableValue == null) {
            strFindSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFocusMode())) {
                Log.i(TAG, "Focus mode already set to " + strFindSettableValue);
                return;
            }
            parameters.setFocusMode(strFindSettableValue);
        }
    }

    @TargetApi(15)
    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            Log.i(TAG, "Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas()));
            List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
            Log.i(TAG, "Setting focus area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
            parameters.setFocusAreas(listBuildMiddleArea);
            return;
        }
        Log.i(TAG, "Device does not support focus areas");
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        if ("negative".equals(parameters.getColorEffect())) {
            Log.i(TAG, "Negative effect already set");
            return;
        }
        String strFindSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative");
        if (strFindSettableValue != null) {
            parameters.setColorEffect(strFindSettableValue);
        }
    }

    @TargetApi(15)
    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            Log.i(TAG, "Old metering areas: " + parameters.getMeteringAreas());
            List<Camera.Area> listBuildMiddleArea = buildMiddleArea(400);
            Log.i(TAG, "Setting metering area to : " + toString((Iterable<Camera.Area>) listBuildMiddleArea));
            parameters.setMeteringAreas(listBuildMiddleArea);
            return;
        }
        Log.i(TAG, "Device does not support metering areas");
    }

    public static void setTorch(Camera.Parameters parameters, boolean z11) {
        String strFindSettableValue;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z11) {
            strFindSettableValue = findSettableValue("flash mode", supportedFlashModes, "torch", ViewProps.f9928ON);
        } else {
            strFindSettableValue = findSettableValue("flash mode", supportedFlashModes, "off");
        }
        if (strFindSettableValue != null) {
            if (strFindSettableValue.equals(parameters.getFlashMode())) {
                Log.i(TAG, "Flash mode already set to " + strFindSettableValue);
                return;
            }
            Log.i(TAG, "Setting flash mode to " + strFindSettableValue);
            parameters.setFlashMode(strFindSettableValue);
        }
    }

    @TargetApi(15)
    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported()) {
            if (parameters.getVideoStabilization()) {
                Log.i(TAG, "Video stabilization already enabled");
                return;
            } else {
                Log.i(TAG, "Enabling video stabilization...");
                parameters.setVideoStabilization(true);
                return;
            }
        }
        Log.i(TAG, "This device does not support video stabilization");
    }

    public static void setZoom(Camera.Parameters parameters, double d11) {
        if (parameters.isZoomSupported()) {
            Integer numIndexOfClosestZoom = indexOfClosestZoom(parameters, d11);
            if (numIndexOfClosestZoom == null) {
                return;
            }
            if (parameters.getZoom() == numIndexOfClosestZoom.intValue()) {
                Log.i(TAG, "Zoom is already set to " + numIndexOfClosestZoom);
                return;
            }
            Log.i(TAG, "Setting zoom to " + numIndexOfClosestZoom);
            parameters.setZoom(numIndexOfClosestZoom.intValue());
            return;
        }
        Log.i(TAG, "Zoom is not supported");
    }

    @TargetApi(15)
    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area area : iterable) {
            sb2.append(area.rect);
            sb2.append(':');
            sb2.append(area.weight);
            sb2.append(' ');
        }
        return sb2.toString();
    }
}
