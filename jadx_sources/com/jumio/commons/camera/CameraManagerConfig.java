package com.jumio.commons.camera;

import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.sdk.enums.JumioCameraFacing;
import jumio.core.AbstractC40637b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, m90084d2 = {"Lcom/jumio/commons/camera/CameraManagerConfig;", "", "rotationManager", "Lcom/jumio/commons/utils/DeviceRotationManager;", "enableFlashOnStart", "", "requestedSize", "Lcom/jumio/commons/camera/Size;", "requestedCameraFacing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "shouldUseShader", "<init>", "(Lcom/jumio/commons/utils/DeviceRotationManager;ZLcom/jumio/commons/camera/Size;Lcom/jumio/sdk/enums/JumioCameraFacing;Z)V", "getRotationManager", "()Lcom/jumio/commons/utils/DeviceRotationManager;", "getEnableFlashOnStart", "()Z", "getRequestedSize", "()Lcom/jumio/commons/camera/Size;", "getRequestedCameraFacing", "()Lcom/jumio/sdk/enums/JumioCameraFacing;", "getShouldUseShader", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CameraManagerConfig {

    /* JADX INFO: renamed from: a */
    public final DeviceRotationManager f13506a;

    /* JADX INFO: renamed from: b */
    public final boolean f13507b;

    /* JADX INFO: renamed from: c */
    public final Size f13508c;

    /* JADX INFO: renamed from: d */
    public final JumioCameraFacing f13509d;

    /* JADX INFO: renamed from: e */
    public final boolean f13510e;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraManagerConfig)) {
            return false;
        }
        CameraManagerConfig cameraManagerConfig = (CameraManagerConfig) other;
        return Intrinsics.areEqual(this.f13506a, cameraManagerConfig.f13506a) && this.f13507b == cameraManagerConfig.f13507b && Intrinsics.areEqual(this.f13508c, cameraManagerConfig.f13508c) && this.f13509d == cameraManagerConfig.f13509d && this.f13510e == cameraManagerConfig.f13510e;
    }

    public CameraManagerConfig(@NotNull DeviceRotationManager rotationManager, boolean z11, @NotNull Size requestedSize, @NotNull JumioCameraFacing requestedCameraFacing, boolean z12) {
        Intrinsics.checkNotNullParameter(rotationManager, "rotationManager");
        Intrinsics.checkNotNullParameter(requestedSize, "requestedSize");
        Intrinsics.checkNotNullParameter(requestedCameraFacing, "requestedCameraFacing");
        this.f13506a = rotationManager;
        this.f13507b = z11;
        this.f13508c = requestedSize;
        this.f13509d = requestedCameraFacing;
        this.f13510e = z12;
    }

    public static /* synthetic */ CameraManagerConfig copy$default(CameraManagerConfig cameraManagerConfig, DeviceRotationManager deviceRotationManager, boolean z11, Size size, JumioCameraFacing jumioCameraFacing, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            deviceRotationManager = cameraManagerConfig.f13506a;
        }
        if ((i11 & 2) != 0) {
            z11 = cameraManagerConfig.f13507b;
        }
        if ((i11 & 4) != 0) {
            size = cameraManagerConfig.f13508c;
        }
        if ((i11 & 8) != 0) {
            jumioCameraFacing = cameraManagerConfig.f13509d;
        }
        if ((i11 & 16) != 0) {
            z12 = cameraManagerConfig.f13510e;
        }
        boolean z13 = z12;
        Size size2 = size;
        return cameraManagerConfig.copy(deviceRotationManager, z11, size2, jumioCameraFacing, z13);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DeviceRotationManager getF13506a() {
        return this.f13506a;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getF13507b() {
        return this.f13507b;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Size getF13508c() {
        return this.f13508c;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final JumioCameraFacing getF13509d() {
        return this.f13509d;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getF13510e() {
        return this.f13510e;
    }

    @NotNull
    public final CameraManagerConfig copy(@NotNull DeviceRotationManager rotationManager, boolean enableFlashOnStart, @NotNull Size requestedSize, @NotNull JumioCameraFacing requestedCameraFacing, boolean shouldUseShader) {
        Intrinsics.checkNotNullParameter(rotationManager, "rotationManager");
        Intrinsics.checkNotNullParameter(requestedSize, "requestedSize");
        Intrinsics.checkNotNullParameter(requestedCameraFacing, "requestedCameraFacing");
        return new CameraManagerConfig(rotationManager, enableFlashOnStart, requestedSize, requestedCameraFacing, shouldUseShader);
    }

    public final boolean getEnableFlashOnStart() {
        return this.f13507b;
    }

    @NotNull
    public final JumioCameraFacing getRequestedCameraFacing() {
        return this.f13509d;
    }

    @NotNull
    public final Size getRequestedSize() {
        return this.f13508c;
    }

    @NotNull
    public final DeviceRotationManager getRotationManager() {
        return this.f13506a;
    }

    public final boolean getShouldUseShader() {
        return this.f13510e;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f13510e) + ((this.f13509d.hashCode() + ((this.f13508c.hashCode() + AbstractC40637b0.m89251a(this.f13507b, this.f13506a.hashCode() * 31, 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CameraManagerConfig(rotationManager=" + this.f13506a + ", enableFlashOnStart=" + this.f13507b + ", requestedSize=" + this.f13508c + ", requestedCameraFacing=" + this.f13509d + ", shouldUseShader=" + this.f13510e + ')';
    }
}
