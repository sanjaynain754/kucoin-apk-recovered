package com.jumio.camerax;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.ExposureState;
import androidx.camera.lifecycle.ProcessCameraProvider;
import com.jumio.commons.camera.CameraCapabilities;
import java.util.List;
import jumio.camerax.AbstractC40496v;
import jumio.camerax.C40472A;
import jumio.camerax.C40494t;
import jumio.camerax.InterfaceC40480f;
import jumio.camerax.InterfaceC40489o;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0011R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m90084d2 = {"Lcom/jumio/camerax/CameraXCapabilities;", "Lcom/jumio/commons/camera/CameraCapabilities;", "cameraProvider", "Lcom/jumio/camerax/provider/CameraXProviderInterface;", "hasHighResolutionSupportProvider", "Lkotlin/Function0;", "", "camera", "Lcom/jumio/camerax/camera/CameraXInterface;", "<init>", "(Lcom/jumio/camerax/provider/CameraXProviderInterface;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "hardwareLevel", "", "getHardwareLevel", "()I", "hasFlash", "getHasFlash", "()Z", "hasMultipleCameras", "getHasMultipleCameras", "hasHighResolutionSupport", "getHasHighResolutionSupport", "hasExposureAndWhiteBalanceLock", "getHasExposureAndWhiteBalanceLock", "canAdjustFocus", "getCanAdjustFocus", "canAdjustExposure", "getCanAdjustExposure", "canAdjustWhiteBalance", "getCanAdjustWhiteBalance", "availableWhiteBalanceModes", "", "", "getAvailableWhiteBalanceModes", "()[Ljava/lang/String;", "info", "getInfo", "()Ljava/lang/String;", "toString", "jumio-camerax_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CameraXCapabilities implements CameraCapabilities {

    /* JADX INFO: renamed from: a */
    public final InterfaceC40489o f13420a;

    /* JADX INFO: renamed from: b */
    public final Function0 f13421b;

    /* JADX INFO: renamed from: c */
    public final Function0 f13422c;

    public CameraXCapabilities(@NotNull InterfaceC40489o cameraProvider, @NotNull Function0<Boolean> hasHighResolutionSupportProvider, @NotNull Function0<? extends InterfaceC40480f> camera) {
        Intrinsics.checkNotNullParameter(cameraProvider, "cameraProvider");
        Intrinsics.checkNotNullParameter(hasHighResolutionSupportProvider, "hasHighResolutionSupportProvider");
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f13420a = cameraProvider;
        this.f13421b = hasHighResolutionSupportProvider;
        this.f13422c = camera;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public String[] getAvailableWhiteBalanceModes() {
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        return interfaceC40480f != null ? ((C40494t) interfaceC40480f).m89141b() : new String[0];
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustExposure() {
        CameraInfo cameraInfo;
        ExposureState exposureState;
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        if (interfaceC40480f == null) {
            return false;
        }
        C40494t c40494t = (C40494t) interfaceC40480f;
        if (AbstractC40496v.m89145a().contains(Integer.valueOf(c40494t.m89132a()))) {
            return true;
        }
        Camera camera = c40494t.f89885a;
        return (camera == null || (cameraInfo = camera.getCameraInfo()) == null || (exposureState = cameraInfo.getExposureState()) == null) ? false : exposureState.isExposureCompensationSupported();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustFocus() {
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        if (interfaceC40480f != null) {
            return AbstractC40496v.m89145a().contains(Integer.valueOf(((C40494t) interfaceC40480f).m89132a()));
        }
        return false;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getCanAdjustWhiteBalance() {
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        if (interfaceC40480f != null) {
            return ((C40494t) interfaceC40480f).m89144e();
        }
        return false;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasExposureAndWhiteBalanceLock() {
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        if (interfaceC40480f != null) {
            return ((C40494t) interfaceC40480f).m89142c();
        }
        return false;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasFlash() {
        CameraInfo cameraInfo;
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        if (interfaceC40480f == null || (cameraInfo = ((C40494t) interfaceC40480f).f89885a.getCameraInfo()) == null) {
            return false;
        }
        return cameraInfo.hasFlashUnit();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasHighResolutionSupport() {
        return ((Boolean) this.f13421b.invoke()).booleanValue();
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    public boolean getHasMultipleCameras() {
        List<CameraInfo> availableCameraInfos;
        ProcessCameraProvider processCameraProvider = ((C40472A) this.f13420a).f89850a;
        return ((processCameraProvider == null || (availableCameraInfos = processCameraProvider.getAvailableCameraInfos()) == null) ? 0 : availableCameraInfos.size()) > 1;
    }

    @Override // com.jumio.commons.camera.CameraCapabilities
    @NotNull
    public String getInfo() {
        InterfaceC40480f interfaceC40480f = (InterfaceC40480f) this.f13422c.invoke();
        int iM89132a = interfaceC40480f != null ? ((C40494t) interfaceC40480f).m89132a() : 0;
        if (iM89132a == 0) {
            return "LIMITED";
        }
        if (iM89132a == 1) {
            return "FULL";
        }
        if (iM89132a == 2) {
            return "LEGACY";
        }
        if (iM89132a == 3) {
            return "LEVEL_3";
        }
        if (iM89132a == 4) {
            return "EXTERNAL";
        }
        StringBuilder sb2 = new StringBuilder("Unknown level: ");
        InterfaceC40480f interfaceC40480f2 = (InterfaceC40480f) this.f13422c.invoke();
        sb2.append(interfaceC40480f2 != null ? ((C40494t) interfaceC40480f2).m89132a() : 0);
        return sb2.toString();
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

    @NotNull
    public String toString() {
        return defaultToString();
    }
}
