package com.jumio.commons.camera;

import android.content.Context;
import android.view.View;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.core.Injected;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import jumio.core.AbstractC40513C1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes56.dex */
@Injected
@Metadata(m90083d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 N2\u00020\u0001:\u0001NJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H&J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%H&J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H&J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020\u000fH&J\b\u0010,\u001a\u00020 H&J\b\u0010-\u001a\u00020 H&J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\u000fH&J\b\u00100\u001a\u00020 H&J\b\u00101\u001a\u00020 H&J\b\u00102\u001a\u00020 H&J$\u00103\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020 07H&J \u00109\u001a\u00020 2\u0006\u00104\u001a\u0002052\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H&J\u0010\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020@H&J\u0010\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u000fH&J\u0010\u0010C\u001a\u00020 2\u0006\u0010D\u001a\u00020EH&J\u0010\u0010F\u001a\u00020 2\u0006\u0010G\u001a\u00020HH&J@\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020\u000f2\u0016\b\u0002\u0010K\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020 \u0018\u0001072\u0016\b\u0002\u0010M\u001a\u0010\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020 \u0018\u000107H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0012\u0010\u0013\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0010R\u0012\u0010\u0014\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u001b¨\u0006OÀ\u0006\u0003"}, m90084d2 = {"Lcom/jumio/commons/camera/CameraManagerInterface;", "", "previewSize", "Lcom/jumio/commons/camera/Size;", "getPreviewSize", "()Lcom/jumio/commons/camera/Size;", "frameMetadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "getFrameMetadata", "()Lcom/jumio/commons/camera/Frame$Metadata;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "getCameraSettings", "()Lcom/jumio/commons/camera/CameraSettings;", "isFrontFacing", "", "()Z", "focusing", "getFocusing", "isFlashOn", "isExposureAndWhiteBalanceLocked", "cameraCapabilities", "Lcom/jumio/commons/camera/CameraCapabilities;", "getCameraCapabilities", "()Lcom/jumio/commons/camera/CameraCapabilities;", "isPausePreview", "setPausePreview", "(Z)V", "collectCameraConnection", "getCollectCameraConnection", "setCollectCameraConnection", "setCameraFacing", "", "facing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "requestFocus", "x", "", "y", "requestMetering", "meteringConfig", "Lcom/jumio/commons/camera/MeteringConfig;", "setFlash", "turnFlashOn", "startPreview", "reinitCamera", "stopPreview", "pause", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "changeCamera", "captureImage", "setupUiViews", "context", "Landroid/content/Context;", "addView", "Lkotlin/Function1;", "Landroid/view/View;", "setup", "config", "Lcom/jumio/commons/camera/CameraManagerConfig;", "cameraCallback", "Lcom/jumio/commons/camera/CameraCallbackInterface;", "fillImageData", "imageData", "Lcom/jumio/commons/camera/ImageData;", "setExposureAndWhiteBalanceLock", "lock", "adjustCaptureSettings", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "setShader", "shaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "enableShader", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onEnable", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "onRender", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface CameraManagerInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f13511a;
    public static final int IMAGE_FORMAT = 17;

    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/commons/camera/CameraManagerInterface$Companion;", "", "<init>", "()V", "IMAGE_FORMAT", "", "IMAGE_FORMAT_EXCEPTION", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "getIMAGE_FORMAT_EXCEPTION", "()Ljava/lang/IllegalArgumentException;", "FHD_CAMERA_RESOLUTION", "Lcom/jumio/commons/camera/Size;", "getFHD_CAMERA_RESOLUTION", "()Lcom/jumio/commons/camera/Size;", "UHD_CAMERA_RESOLUTION", "getUHD_CAMERA_RESOLUTION", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public static final int IMAGE_FORMAT = 17;

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f13511a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final IllegalArgumentException f13512b = new IllegalArgumentException("Image format 17 is not implemented");

        /* JADX INFO: renamed from: c */
        public static final Size f13513c = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);

        /* JADX INFO: renamed from: d */
        public static final Size f13514d = new Size(3840, 2160);

        @NotNull
        public final Size getFHD_CAMERA_RESOLUTION() {
            return f13513c;
        }

        @NotNull
        public final IllegalArgumentException getIMAGE_FORMAT_EXCEPTION() {
            return f13512b;
        }

        @NotNull
        public final Size getUHD_CAMERA_RESOLUTION() {
            return f13514d;
        }
    }

    void adjustCaptureSettings(@NotNull CaptureSettings settings);

    void captureImage();

    void changeCamera();

    void destroy();

    void enableShader(boolean enable, @Nullable Function1<? super AbstractC40513C1, Unit> onEnable, @Nullable Function1<? super AbstractC40513C1, Unit> onRender);

    void fillImageData(@NotNull ImageData imageData);

    @NotNull
    CameraCapabilities getCameraCapabilities();

    @NotNull
    CameraSettings getCameraSettings();

    boolean getCollectCameraConnection();

    boolean getFocusing();

    @NotNull
    Frame.Metadata getFrameMetadata();

    @NotNull
    Size getPreviewSize();

    boolean isExposureAndWhiteBalanceLocked();

    boolean isFlashOn();

    boolean isFrontFacing();

    boolean isPausePreview();

    void reinitCamera();

    void requestFocus(int x11, int y11);

    void requestMetering(@NotNull MeteringConfig meteringConfig);

    void setCameraFacing(@NotNull JumioCameraFacing facing);

    void setCollectCameraConnection(boolean z11);

    void setExposureAndWhiteBalanceLock(boolean lock);

    void setFlash(boolean turnFlashOn);

    void setPausePreview(boolean z11);

    void setShader(@NotNull ShaderProvider shaderProvider);

    void setup(@NotNull Context context, @NotNull CameraManagerConfig config, @NotNull CameraCallbackInterface cameraCallback);

    void setupUiViews(@NotNull Context context, @NotNull Function1<? super View, Unit> addView);

    void startPreview();

    void stopPreview(boolean pause);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void enableShader$default(CameraManagerInterface cameraManagerInterface, boolean z11, Function1 function1, Function1 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableShader");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        cameraManagerInterface.enableShader(z11, function1, function2);
    }
}
