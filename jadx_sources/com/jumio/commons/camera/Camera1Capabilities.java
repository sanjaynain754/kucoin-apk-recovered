package com.jumio.commons.camera;

import android.hardware.Camera;
import com.facebook.react.uimanager.ViewProps;
import com.jumio.commons.log.Log;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010 \u001a\u00020\u001aH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m90084d2 = {"Lcom/jumio/commons/camera/Camera1Capabilities;", "Lcom/jumio/commons/camera/CameraCapabilities;", "hasHighResolutionSupportProvider", "Lkotlin/Function0;", "", "camera", "Landroid/hardware/Camera;", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "hasFlash", "getHasFlash", "()Z", "hasMultipleCameras", "getHasMultipleCameras", "hasHighResolutionSupport", "getHasHighResolutionSupport", "hasExposureAndWhiteBalanceLock", "getHasExposureAndWhiteBalanceLock", "canAdjustFocus", "getCanAdjustFocus", "canAdjustExposure", "getCanAdjustExposure", "canAdjustWhiteBalance", "getCanAdjustWhiteBalance", "availableWhiteBalanceModes", "", "", "getAvailableWhiteBalanceModes", "()[Ljava/lang/String;", "info", "getInfo", "()Ljava/lang/String;", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCamera1Capabilities.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera1Capabilities.kt\ncom/jumio/commons/camera/Camera1Capabilities\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,79:1\n774#2:80\n865#2,2:81\n37#3:83\n36#3,3:84\n*S KotlinDebug\n*F\n+ 1 Camera1Capabilities.kt\ncom/jumio/commons/camera/Camera1Capabilities\n*L\n68#1:80\n68#1:81,2\n73#1:83\n73#1:84,3\n*E\n"})
public final class Camera1Capabilities implements CameraCapabilities {

    /* JADX INFO: renamed from: a */
    public final Function0 f13481a;

    /* JADX INFO: renamed from: b */
    public final Function0 f13482b;

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustFocus() {
        return false;
    }

    public Camera1Capabilities(@NotNull Function0<Boolean> hasHighResolutionSupportProvider, @NotNull Function0<? extends Camera> camera) {
        Intrinsics.checkNotNullParameter(hasHighResolutionSupportProvider, "hasHighResolutionSupportProvider");
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f13481a = hasHighResolutionSupportProvider;
        this.f13482b = camera;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public String[] getAvailableWhiteBalanceModes() {
        ArrayList arrayList = new ArrayList();
        Camera camera = (Camera) this.f13482b.invoke();
        if (camera != null) {
            try {
                List<String> supportedWhiteBalance = camera.getParameters().getSupportedWhiteBalance();
                Intrinsics.checkNotNullExpressionValue(supportedWhiteBalance, "getSupportedWhiteBalance(...)");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : supportedWhiteBalance) {
                    if (!Intrinsics.areEqual((String) obj, "auto")) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(arrayList2);
            } catch (Exception e11) {
                Log.printStackTrace(e11);
                Unit unit = Unit.INSTANCE;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustExposure() {
        Camera camera = (Camera) this.f13482b.invoke();
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                return (parameters.getMinExposureCompensation() == 0 && parameters.getMaxExposureCompensation() == 0) ? false : true;
            } catch (Exception e11) {
                Log.printStackTrace(e11);
            }
        }
        return false;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasExposureAndWhiteBalanceLock() {
        Camera camera = (Camera) this.f13482b.invoke();
        if (camera != null) {
            try {
                Camera.Parameters parameters = camera.getParameters();
                return parameters.isAutoExposureLockSupported() && parameters.isAutoWhiteBalanceLockSupported();
            } catch (Exception e11) {
                Log.printStackTrace(e11);
            }
        }
        return false;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasFlash() {
        Camera camera = (Camera) this.f13482b.invoke();
        if (camera == null) {
            return false;
        }
        try {
            List<String> supportedFlashModes = camera.getParameters().getSupportedFlashModes();
            if (supportedFlashModes != null) {
                return supportedFlashModes.contains("torch") || supportedFlashModes.contains(ViewProps.ON);
            }
            return false;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return false;
        }
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasHighResolutionSupport() {
        return ((Boolean) this.f13481a.invoke()).booleanValue();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public String getInfo() {
        return "Camera1";
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public CameraCapabilities copy() {
        return super.copy();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public String defaultToString() {
        return super.defaultToString();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustWhiteBalance() {
        boolean z11;
        if (getAvailableWhiteBalanceModes().length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        return !z11;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasMultipleCameras() {
        if (Camera.getNumberOfCameras() > 1) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return defaultToString();
    }
}
