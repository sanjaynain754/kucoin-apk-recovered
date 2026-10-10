package com.jumio.commons.camera;

import java.util.Arrays;
import jumio.core.C40557L0;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u001a\u001a\u00020\u0000H\u0016J\b\u0010\u001b\u001a\u00020\u0014H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001cÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/camera/CameraCapabilities;", "", "hasFlash", "", "getHasFlash", "()Z", "hasMultipleCameras", "getHasMultipleCameras", "hasHighResolutionSupport", "getHasHighResolutionSupport", "hasExposureAndWhiteBalanceLock", "getHasExposureAndWhiteBalanceLock", "canAdjustFocus", "getCanAdjustFocus", "canAdjustExposure", "getCanAdjustExposure", "canAdjustWhiteBalance", "getCanAdjustWhiteBalance", "availableWhiteBalanceModes", "", "", "getAvailableWhiteBalanceModes", "()[Ljava/lang/String;", "info", "getInfo", "()Ljava/lang/String;", "copy", "defaultToString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CameraCapabilities {
    @NotNull
    String[] getAvailableWhiteBalanceModes();

    boolean getCanAdjustExposure();

    boolean getCanAdjustFocus();

    boolean getCanAdjustWhiteBalance();

    boolean getHasExposureAndWhiteBalanceLock();

    boolean getHasFlash();

    boolean getHasHighResolutionSupport();

    boolean getHasMultipleCameras();

    @NotNull
    String getInfo();

    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static CameraCapabilities copy(@NotNull CameraCapabilities cameraCapabilities) {
            return CameraCapabilities.super.copy();
        }

        @Deprecated
        @NotNull
        public static String defaultToString(@NotNull CameraCapabilities cameraCapabilities) {
            return CameraCapabilities.super.defaultToString();
        }
    }

    @NotNull
    default CameraCapabilities copy() {
        return new C40557L0(getHasFlash(), getHasMultipleCameras(), getHasHighResolutionSupport(), getHasExposureAndWhiteBalanceLock(), getCanAdjustFocus(), getCanAdjustExposure(), getCanAdjustWhiteBalance(), getAvailableWhiteBalanceModes(), getInfo());
    }

    @NotNull
    default String defaultToString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(hasFlash=");
        sb2.append(getHasFlash());
        sb2.append(", hasMultipleCameras=");
        sb2.append(getHasMultipleCameras());
        sb2.append(", hasHighResolutionSupport=");
        sb2.append(getHasHighResolutionSupport());
        sb2.append(", hasExposureAndWhiteBalanceLock=");
        sb2.append(getHasExposureAndWhiteBalanceLock());
        sb2.append(", canAdjustFocus=");
        sb2.append(getCanAdjustFocus());
        sb2.append(", canAdjustExposure=");
        sb2.append(getCanAdjustExposure());
        sb2.append(", canAdjustWhiteBalance=");
        sb2.append(getCanAdjustWhiteBalance());
        sb2.append(", availableWhiteBalanceModes=");
        String string = Arrays.toString(getAvailableWhiteBalanceModes());
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb2.append(string);
        sb2.append(", info=");
        sb2.append(getInfo());
        sb2.append(')');
        return sb2.toString();
    }
}
