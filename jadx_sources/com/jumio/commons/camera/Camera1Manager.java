package com.jumio.commons.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.camera.CameraConnectionData;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jumio.core.AbstractC40513C1;
import jumio.core.AbstractC40590S;
import jumio.core.RunnableC40561M;
import jumio.core.RunnableC40566N;
import jumio.core.RunnableC40571O;
import jumio.core.RunnableC40576P;
import jumio.core.RunnableC40581Q;
import jumio.core.TextureViewSurfaceTextureListenerC40681j3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference0Impl;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\f\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J \u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J \u0010D\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0016J\u0010\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020OH\u0016J$\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020<0TH\u0016J \u0010V\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\u0006\u0010W\u001a\u00020X2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010Y\u001a\u00020<2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020<2\u0006\u0010_\u001a\u00020\u0011H\u0016J\u001c\u0010`\u001a\u00020<2\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010_\u001a\u00020\u0011H\u0002J\u0010\u0010b\u001a\u00020<2\u0006\u0010c\u001a\u00020\u0011H\u0016J\u0010\u0010d\u001a\u00020<2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010h\u001a\u00020iH\u0016J<\u0010j\u001a\u00020<2\u0006\u0010k\u001a\u00020\u00112\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020<\u0018\u00010T2\u0014\u0010n\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020<\u0018\u00010TH\u0016J \u0010o\u001a\u00060[R\u00020\u00072\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010p\u001a\u00020qH\u0002J \u0010r\u001a\u00060[R\u00020\u00072\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010s\u001a\u00020tH\u0002J\b\u0010u\u001a\u00020<H\u0016J\b\u0010v\u001a\u00020<H\u0016J\u0018\u0010w\u001a\u00020<2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010y\u001a\u00020\t2\f\u0010z\u001a\b\u0018\u00010[R\u00020\u0007H\u0002J\u0010\u0010{\u001a\u00020<2\u0006\u0010|\u001a\u00020\u0011H\u0016J\b\u0010}\u001a\u00020<H\u0016J\b\u0010~\u001a\u00020<H\u0016J\b\u0010\u007f\u001a\u00020<H\u0016J\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u001d\u0010\u0081\u0001\u001a\u00020\u001b2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010\u0082\u0001\u001a\u00020\u001b2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\t\u0010\u0083\u0001\u001a\u00020<H\u0002J3\u0010\u0084\u0001\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u00112\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0002J\u001e\u0010\u0087\u0001\u001a\u00020<2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0002J/\u0010\u0089\u0001\u001a\u00030\u008a\u00012\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002J\u001c\u0010\u008b\u0001\u001a\u00020\t2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0002J\u001a\u0010\u008e\u0001\u001a\u00020\t2\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0011H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001e\u0010+\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u001e\u0010,\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010*\"\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u0011X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010*\"\u0004\b3\u00100R\u0014\u00104\u001a\u000205X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010*¨\u0006\u0096\u0001"}, m90084d2 = {"Lcom/jumio/commons/camera/Camera1Manager;", "Lcom/jumio/commons/camera/CameraManagerInterface;", "Landroid/hardware/Camera$PreviewCallback;", "Landroid/view/TextureView$SurfaceTextureListener;", "<init>", "()V", "camera", "Landroid/hardware/Camera;", "cameraId", "", "callbackBuffer", "", "cameraAccessLock", "", "autoFocusCallback", "Landroid/hardware/Camera$AutoFocusCallback;", "manualFocusEnabled", "", "defaultExposureLevel", "executorService", "Ljava/util/concurrent/ExecutorService;", "cameraCallback", "Lcom/jumio/commons/camera/CameraCallbackInterface;", "rotationManager", "Lcom/jumio/commons/utils/DeviceRotationManager;", "enableFlashOnStart", "requestedSize", "Lcom/jumio/commons/camera/Size;", "hasHighResolutionSupport", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "getCameraSettings", "()Lcom/jumio/commons/camera/CameraSettings;", "frameMetadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "getFrameMetadata", "()Lcom/jumio/commons/camera/Frame$Metadata;", "value", "previewSize", "getPreviewSize", "()Lcom/jumio/commons/camera/Size;", "isFrontFacing", "()Z", "isFlashOn", "focusing", "getFocusing", "isPausePreview", "setPausePreview", "(Z)V", "collectCameraConnection", "getCollectCameraConnection", "setCollectCameraConnection", "cameraCapabilities", "Lcom/jumio/commons/camera/Camera1Capabilities;", "getCameraCapabilities", "()Lcom/jumio/commons/camera/Camera1Capabilities;", "textureView", "Lcom/jumio/commons/camera/RenderTextureView;", "isExposureAndWhiteBalanceLocked", "fillImageData", "", "imageData", "Lcom/jumio/commons/camera/ImageData;", "onSurfaceTextureAvailable", "surface", "Landroid/graphics/SurfaceTexture;", "width", "height", "onSurfaceTextureSizeChanged", "onSurfaceTextureDestroyed", "onSurfaceTextureUpdated", "setCameraFacing", "facing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "requestFocus", "x", "y", "requestMetering", "meteringConfig", "Lcom/jumio/commons/camera/MeteringConfig;", "setupUiViews", "context", "Landroid/content/Context;", "addView", "Lkotlin/Function1;", "Landroid/view/View;", "setup", "config", "Lcom/jumio/commons/camera/CameraManagerConfig;", "addAreas", "parameters", "Landroid/hardware/Camera$Parameters;", "focusRect", "Landroid/graphics/Rect;", "setFlash", "turnFlashOn", "getFlashMode", ReportDataTable.COLUMN_PARAMS, "setExposureAndWhiteBalanceLock", "lock", "adjustCaptureSettings", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "setShader", "shaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "enableShader", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onEnable", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "onRender", "setExposureLevel", FirebaseAnalytics.Param.LEVEL, "Lcom/jumio/commons/camera/ExposureLevel;", "setWhiteBalance", "whiteBalance", "Lcom/jumio/commons/camera/WhiteBalance;", "startPreview", "reinitCamera", "onPreviewFrame", "data", "getIso", "cameraParams", "stopPreview", "pause", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "changeCamera", "captureImage", "getCameraWithId", "getRequestedPreviewSize", "getRequestedCaptureSize", "initCamera", "initPreview", "isPortrait", "displayRotation", "setFocusMode", "useSimpleFocus", "calculateScaleMatrix", "Landroid/graphics/Matrix;", "calculateCameraRotation", "info", "Landroid/hardware/Camera$CameraInfo;", "getImageRotation", "deviceOrientation", "InitCameraRunnable", "SurfaceChangedRunnable", "RequestMeteringRunnable", "StopCameraPreviewRunnable", "ReleaseCameraRunnable", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCamera1Manager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera1Manager.kt\ncom/jumio/commons/camera/Camera1Manager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/jumio/kotlin/KotlinExtensionsKt\n*L\n1#1,882:1\n774#2:883\n865#2,2:884\n1863#2,2:887\n1#3:886\n17#4:889\n*S KotlinDebug\n*F\n+ 1 Camera1Manager.kt\ncom/jumio/commons/camera/Camera1Manager\n*L\n317#1:883\n317#1:884,2\n406#1:887,2\n364#1:889\n*E\n"})
public final class Camera1Manager implements CameraManagerInterface, Camera.PreviewCallback, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final List<String> FALLBACK_AUTO_FOCUS_LIST = CollectionsKt.listOf((Object[]) new String[]{"GT-I9100", "SPH-D710", "SGH-T989", "SCH-I605", "SAMSUNG-SGH-I727", "GT-I9100G", "SAMSUNG-SGH-I777", "SPH-D710BST", "GT-I9100P", "GT-I9100T", "SGH-S959G", "SGH-T989D", "SGH-I727R", "GT-I9100M", "SPH-D710VMUB", "SAMSUNG-SGH-T989", "SGH-I757M", "SGH-I777", "GT-I9210", "GT-I9105P", "GT-I9105", "GT-I9105I", "GT-I9105G", "SAMSUNG-SGH-I717", "SGH-T879", "SGH-I717M", "SGH-I717R", "GT-N7000", "GT-N7005", "DROIDX"});

    @JvmField
    @NotNull
    public static final String[] FALLBACK_PREVIEW_FORMAT_LIST = {"Nexus 7"};

    /* JADX INFO: renamed from: a */
    public Camera f13483a;

    /* JADX INFO: renamed from: b */
    public int f13484b;

    /* JADX INFO: renamed from: c */
    public byte[] f13485c;

    /* JADX INFO: renamed from: d */
    public final Object f13486d = new Object();

    /* JADX INFO: renamed from: e */
    public final Camera.AutoFocusCallback f13487e = new Camera.AutoFocusCallback() { // from class: f9.g
        @Override // android.hardware.Camera.AutoFocusCallback
        public final void onAutoFocus(boolean z11, Camera camera) {
            Camera1Manager.m14437a(this.f82994a, z11, camera);
        }
    };

    /* JADX INFO: renamed from: f */
    public boolean f13488f;

    /* JADX INFO: renamed from: g */
    public int f13489g;

    /* JADX INFO: renamed from: h */
    public final ExecutorService f13490h;

    /* JADX INFO: renamed from: i */
    public CameraCallbackInterface f13491i;

    /* JADX INFO: renamed from: j */
    public DeviceRotationManager f13492j;

    /* JADX INFO: renamed from: k */
    public boolean f13493k;

    /* JADX INFO: renamed from: l */
    public Size f13494l;

    /* JADX INFO: renamed from: m */
    public boolean f13495m;

    /* JADX INFO: renamed from: n */
    public final CameraSettings f13496n;

    /* JADX INFO: renamed from: o */
    public final Frame.Metadata f13497o;

    /* JADX INFO: renamed from: p */
    public Size f13498p;

    /* JADX INFO: renamed from: q */
    public boolean f13499q;

    /* JADX INFO: renamed from: r */
    public boolean f13500r;

    /* JADX INFO: renamed from: s */
    public boolean f13501s;

    /* JADX INFO: renamed from: t */
    public boolean f13502t;

    /* JADX INFO: renamed from: u */
    public boolean f13503u;

    /* JADX INFO: renamed from: v */
    public final Camera1Capabilities f13504v;

    /* JADX INFO: renamed from: w */
    public TextureViewSurfaceTextureListenerC40681j3 f13505w;

    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/jumio/commons/camera/Camera1Manager$Companion;", "", "<init>", "()V", "CAMERA_OPEN_TIMEOUT", "", "TAG", "", "FALLBACK_AUTO_FOCUS_LIST", "", "FALLBACK_PREVIEW_FORMAT_LIST", "", "[Ljava/lang/String;", "hasFrontFacingCamera", "", "context", "Landroid/content/Context;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public final boolean hasFrontFacingCamera(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getPackageManager().hasSystemFeature("android.hardware.camera.front");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14433a() {
    }

    /* JADX INFO: renamed from: b */
    public final void m14444b() {
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3;
        synchronized (this.f13486d) {
            try {
                Camera cameraM14442a = m14442a(this.f13484b);
                if (cameraM14442a != null) {
                    this.f13489g = cameraM14442a.getParameters().getExposureCompensation();
                } else {
                    cameraM14442a = null;
                }
                this.f13483a = cameraM14442a;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (getF13504v().getHasFlash() && this.f13493k) {
            setFlash(true);
        }
        if (this.f13483a == null || (textureViewSurfaceTextureListenerC40681j3 = this.f13505w) == null) {
            return;
        }
        textureViewSurfaceTextureListenerC40681j3.post(new Runnable() { // from class: f9.e
            @Override // java.lang.Runnable
            public final void run() {
                Camera1Manager.m14439b(this.f82991b);
            }
        });
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public synchronized void destroy() {
        this.f13490h.submit(new RunnableC40566N(this));
        this.f13492j = null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) throws Throwable {
        Throwable th2;
        boolean zIsScreenPortrait;
        try {
            try {
                Intrinsics.checkNotNullParameter(surface, "surface");
                ExecutorService executorService = this.f13490h;
                DeviceRotationManager deviceRotationManager = this.f13492j;
                if (deviceRotationManager != null) {
                    try {
                        zIsScreenPortrait = deviceRotationManager.isScreenPortrait();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    zIsScreenPortrait = true;
                }
                boolean z11 = zIsScreenPortrait;
                DeviceRotationManager deviceRotationManager2 = this.f13492j;
                executorService.submit(new RunnableC40561M(this, surface, width, height, z11, deviceRotationManager2 != null ? deviceRotationManager2.getDisplayRotation() : 0));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public synchronized void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) throws Throwable {
        Throwable th2;
        boolean zIsScreenPortrait;
        try {
            try {
                Intrinsics.checkNotNullParameter(surface, "surface");
                ExecutorService executorService = this.f13490h;
                DeviceRotationManager deviceRotationManager = this.f13492j;
                if (deviceRotationManager != null) {
                    try {
                        zIsScreenPortrait = deviceRotationManager.isScreenPortrait();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    zIsScreenPortrait = true;
                }
                boolean z11 = zIsScreenPortrait;
                DeviceRotationManager deviceRotationManager2 = this.f13492j;
                executorService.submit(new RunnableC40581Q(this, surface, width, height, z11, deviceRotationManager2 != null ? deviceRotationManager2.getDisplayRotation() : 0));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public synchronized void reinitCamera() {
        stopPreview(false);
        this.f13490h.submit(new RunnableC40566N(this));
        this.f13490h.submit(new Runnable() { // from class: f9.a
            @Override // java.lang.Runnable
            public final void run() {
                Camera1Manager.m14440c(this.f82987b);
            }
        });
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public synchronized void requestFocus(int x11, int y11) {
        if (getF13502t()) {
            return;
        }
        this.f13490h.submit(new RunnableC40571O(this, new MeteringPoint(x11, y11, 50.0f, 50.0f)));
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public synchronized void stopPreview(boolean pause) {
        this.f13490h.submit(new RunnableC40576P(this));
        setPausePreview(pause);
    }

    public Camera1Manager() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.f13490h = executorServiceNewSingleThreadExecutor;
        this.f13496n = new CameraSettings();
        this.f13497o = new Frame.Metadata(null, 0, 0, 0L, 0.0f, null, 0.0f, 0, false, 0, 0L, false, null, null, 16383, null);
        this.f13498p = new Size(0, 0);
        this.f13503u = true;
        this.f13504v = new Camera1Capabilities(new MutablePropertyReference0Impl(this) { // from class: jumio.core.T
            {
                super(this, Camera1Manager.class, "hasHighResolutionSupport", "getHasHighResolutionSupport()Z", 0);
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((Camera1Manager) this.receiver).f13495m);
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public final void set(Object obj) {
                ((Camera1Manager) this.receiver).f13495m = ((Boolean) obj).booleanValue();
            }
        }, new Function0() { // from class: f9.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera1Manager.m14432a(this.f82995b);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final void m14437a(Camera1Manager camera1Manager, boolean z11, Camera camera) {
        camera1Manager.f13501s = false;
    }

    /* JADX INFO: renamed from: c */
    public static final void m14440c(Camera1Manager camera1Manager) {
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3;
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j4 = camera1Manager.f13505w;
        SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC40681j4 != null ? textureViewSurfaceTextureListenerC40681j4.getSurfaceTexture() : null;
        if (textureViewSurfaceTextureListenerC40681j4 == null || surfaceTexture == null || (textureViewSurfaceTextureListenerC40681j3 = camera1Manager.f13505w) == null) {
            return;
        }
        textureViewSurfaceTextureListenerC40681j3.onSurfaceTextureAvailable(surfaceTexture, textureViewSurfaceTextureListenerC40681j4.getWidth(), textureViewSurfaceTextureListenerC40681j4.getHeight());
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void adjustCaptureSettings(@NotNull CaptureSettings settings) {
        int minExposureCompensation;
        Intrinsics.checkNotNullParameter(settings, "settings");
        synchronized (this.f13486d) {
            try {
                Camera camera = this.f13483a;
                if (camera != null) {
                    Camera.Parameters parameters = camera.getParameters();
                    Intrinsics.checkNotNull(parameters);
                    ExposureLevel level = settings.getLevel();
                    parameters.getExposureCompensationStep();
                    try {
                        int i11 = AbstractC40590S.f90113a[level.ordinal()];
                        if (i11 == 1 || i11 == 2) {
                            minExposureCompensation = this.f13489g;
                        } else if (i11 == 3) {
                            minExposureCompensation = parameters.getMinExposureCompensation();
                        } else {
                            if (i11 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            minExposureCompensation = parameters.getMaxExposureCompensation();
                        }
                        parameters.setExposureCompensation(minExposureCompensation);
                    } catch (Exception e11) {
                        Log.printStackTrace(e11);
                    }
                    camera.setParameters(m14431a(parameters, settings.getWhiteBalance()));
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void captureImage() {
        Camera camera = this.f13483a;
        if (camera != null) {
            camera.takePicture(new Camera.ShutterCallback() { // from class: f9.c
                @Override // android.hardware.Camera.ShutterCallback
                public final void onShutter() {
                    Camera1Manager.m14433a();
                }
            }, null, new Camera.PictureCallback() { // from class: f9.d
                @Override // android.hardware.Camera.PictureCallback
                public final void onPictureTaken(byte[] bArr, Camera camera2) {
                    Camera1Manager.m14438a(this.f82990a, bArr, camera2);
                }
            });
            return;
        }
        CameraCallbackInterface cameraCallbackInterface = this.f13491i;
        if (cameraCallbackInterface != null) {
            cameraCallbackInterface.onCaptureFrame(null);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void enableShader(boolean enable, @Nullable Function1<? super AbstractC40513C1, Unit> onEnable, @Nullable Function1<? super AbstractC40513C1, Unit> onRender) {
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 != null) {
            textureViewSurfaceTextureListenerC40681j3.f90306c.enableShader(enable, onEnable, onRender);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void fillImageData(@NotNull ImageData imageData) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        imageData.setCameraPosition(getF13499q() ? ImageData.CameraPosition.FRONT : ImageData.CameraPosition.BACK);
        DeviceRotationManager deviceRotationManager = this.f13492j;
        imageData.setOrientationMode(deviceRotationManager != null ? deviceRotationManager.getScreenOrientation() : null);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    /* JADX INFO: renamed from: getCameraCapabilities, reason: from getter */
    public Camera1Capabilities getF13504v() {
        return this.f13504v;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    /* JADX INFO: renamed from: getCameraSettings, reason: from getter */
    public CameraSettings getF13496n() {
        return this.f13496n;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: getCollectCameraConnection, reason: from getter */
    public boolean getF13503u() {
        return this.f13503u;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: getFocusing, reason: from getter */
    public boolean getF13501s() {
        return this.f13501s;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    /* JADX INFO: renamed from: getFrameMetadata, reason: from getter */
    public Frame.Metadata getF13497o() {
        return this.f13497o;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    /* JADX INFO: renamed from: getPreviewSize, reason: from getter */
    public Size getF13498p() {
        return this.f13498p;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public boolean isExposureAndWhiteBalanceLocked() {
        synchronized (this.f13486d) {
            Camera camera = this.f13483a;
            boolean z11 = false;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    if (parameters.getAutoExposureLock() && parameters.getAutoWhiteBalanceLock()) {
                        z11 = true;
                    }
                    return z11;
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                    Unit unit = Unit.INSTANCE;
                    return false;
                }
            }
            return false;
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isFlashOn, reason: from getter */
    public boolean getF13500r() {
        return this.f13500r;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isFrontFacing, reason: from getter */
    public boolean getF13499q() {
        return this.f13499q;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isPausePreview, reason: from getter */
    public boolean getF13502t() {
        return this.f13502t;
    }

    @Override // android.hardware.Camera.PreviewCallback
    @Deprecated(message = "Deprecated in Java")
    public void onPreviewFrame(@NotNull byte[] data, @NotNull Camera camera) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(camera, "camera");
        CameraCallbackInterface cameraCallbackInterface = this.f13491i;
        if (cameraCallbackInterface != null) {
            Frame.Metadata metadataCopy$default = Frame.Metadata.copy$default(getF13497o(), null, 0, 0, 0L, 0.0f, null, 0.0f, 0, false, 0, 0L, false, null, null, 16383, null);
            metadataCopy$default.setIso(0);
            try {
                metadataCopy$default.setIso(m14430a(camera.getParameters()));
            } catch (Exception unused) {
            }
            metadataCopy$default.setTimestamp(System.currentTimeMillis());
            metadataCopy$default.setFlashOn(getF13500r());
            metadataCopy$default.setCameraConnectionData(CameraConnectionData.INSTANCE.get(getF13503u()));
            Unit unit = Unit.INSTANCE;
            cameraCallbackInterface.onPreviewFrame(new Frame(data, metadataCopy$default, true));
        }
        synchronized (this.f13486d) {
            byte[] bArr = this.f13485c;
            if (bArr != null) {
                camera.addCallbackBuffer(bArr);
                Unit unit2 = Unit.INSTANCE;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        stopPreview(getF13502t());
        this.f13490h.submit(new RunnableC40566N(this));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void requestMetering(@NotNull MeteringConfig meteringConfig) {
        Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
        if (getF13502t()) {
            return;
        }
        this.f13490h.submit(new RunnableC40571O(this, meteringConfig.getMeteringPoint()));
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setCameraFacing(@NotNull JumioCameraFacing facing) {
        Intrinsics.checkNotNullParameter(facing, "facing");
        boolean z11 = facing == JumioCameraFacing.FRONT;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        try {
            Camera.getCameraInfo(this.f13484b, cameraInfo);
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        boolean z12 = cameraInfo.facing == 1;
        if (z11 && z12) {
            return;
        }
        if (z11 || z12) {
            this.f13484b = 0;
            for (int i11 = 0; i11 < numberOfCameras; i11++) {
                try {
                    Camera.getCameraInfo(i11, cameraInfo);
                    boolean z13 = cameraInfo.facing == 1;
                    if ((z11 && z13) || (!z11 && !z13)) {
                        this.f13499q = z11;
                        this.f13484b = i11;
                        break;
                    }
                } catch (Exception e12) {
                    Log.printStackTrace(e12);
                }
            }
            if (getF13502t() || this.f13483a == null) {
                return;
            }
            try {
                reinitCamera();
            } catch (Exception e13) {
                Log.printStackTrace(e13);
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setCollectCameraConnection(boolean z11) {
        this.f13503u = z11;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setExposureAndWhiteBalanceLock(boolean lock) {
        synchronized (this.f13486d) {
            Camera camera = this.f13483a;
            if (camera != null) {
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    parameters.setAutoExposureLock(true);
                    parameters.setAutoWhiteBalanceLock(true);
                    camera.setParameters(parameters);
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setFlash(boolean turnFlashOn) {
        synchronized (this.f13486d) {
            Camera camera = this.f13483a;
            if (camera != null) {
                if (!getF13504v().getHasFlash()) {
                    return;
                }
                this.f13500r = turnFlashOn;
                try {
                    Camera.Parameters parameters = camera.getParameters();
                    Intrinsics.checkNotNull(parameters);
                    m14434a(parameters, turnFlashOn);
                    camera.setParameters(parameters);
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setPausePreview(boolean z11) {
        this.f13502t = z11;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setShader(@NotNull ShaderProvider shaderProvider) {
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 != null) {
            textureViewSurfaceTextureListenerC40681j3.setShader(shaderProvider);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setup(@NotNull Context context, @NotNull CameraManagerConfig config, @NotNull CameraCallbackInterface cameraCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraCallback, "cameraCallback");
        setCameraFacing(config.getRequestedCameraFacing());
        this.f13492j = config.getRotationManager();
        this.f13493k = getF13500r() || config.getEnableFlashOnStart();
        this.f13494l = config.getRequestedSize();
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 != null) {
            textureViewSurfaceTextureListenerC40681j3.setShouldUseShader(config.getShouldUseShader());
        }
        this.f13491i = cameraCallback;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setupUiViews(@NotNull Context context, @NotNull Function1<? super View, Unit> addView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addView, "addView");
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 == null) {
            textureViewSurfaceTextureListenerC40681j3 = new TextureViewSurfaceTextureListenerC40681j3(context);
            textureViewSurfaceTextureListenerC40681j3.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            textureViewSurfaceTextureListenerC40681j3.setSurfaceTextureListener(this);
            textureViewSurfaceTextureListenerC40681j3.setOpaque(false);
            textureViewSurfaceTextureListenerC40681j3.setImportantForAccessibility(2);
            this.f13505w = textureViewSurfaceTextureListenerC40681j3;
        }
        addView.invoke(textureViewSurfaceTextureListenerC40681j3);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void startPreview() {
        synchronized (this.f13486d) {
            try {
                Camera camera = this.f13483a;
                if (camera != null) {
                    try {
                        if (this.f13485c == null && getF13498p().getWidth() != 0 && getF13498p().getHeight() != 0) {
                            this.f13485c = new byte[((getF13498p().getWidth() * getF13498p().getHeight()) * ImageFormat.getBitsPerPixel(17)) / 8];
                        }
                        camera.addCallbackBuffer(this.f13485c);
                        camera.setPreviewCallbackWithBuffer(this);
                        camera.startPreview();
                    } catch (Exception e11) {
                        Log.printStackTrace(e11);
                        reinitCamera();
                    }
                }
                setPausePreview(false);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Camera m14432a(Camera1Manager camera1Manager) {
        Camera camera;
        synchronized (camera1Manager.f13486d) {
            camera = camera1Manager.f13483a;
        }
        return camera;
    }

    public static final void access$addAreas(Camera1Manager camera1Manager, Camera.Parameters parameters, Rect rect) {
        camera1Manager.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, 1));
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void changeCamera() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0) {
                int i11 = this.f13484b + 1;
                this.f13484b = i11;
                if (i11 >= numberOfCameras) {
                    this.f13484b = 0;
                }
                reinitCamera();
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m14434a(Camera.Parameters parameters, boolean z11) {
        if (parameters.getSupportedFlashModes() != null && !z11) {
            parameters.setFlashMode("off");
            return;
        }
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (supportedFlashModes != null && supportedFlashModes.contains("torch")) {
            parameters.setFlashMode("torch");
            return;
        }
        List<String> supportedFlashModes2 = parameters.getSupportedFlashModes();
        if (supportedFlashModes2 == null || !supportedFlashModes2.contains(ViewProps.ON)) {
            return;
        }
        parameters.setFlashMode(ViewProps.ON);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: a */
    public static Camera.Parameters m14431a(Camera.Parameters parameters, WhiteBalance whiteBalance) {
        ?? ListOf;
        try {
            List<String> supportedWhiteBalance = parameters.getSupportedWhiteBalance();
            String str = "auto";
            if (supportedWhiteBalance != null) {
                ListOf = new ArrayList();
                for (Object obj : supportedWhiteBalance) {
                    if (!Intrinsics.areEqual((String) obj, "auto")) {
                        ListOf.add(obj);
                    }
                }
            } else {
                ListOf = CollectionsKt.listOf("auto");
            }
            String str2 = str;
            switch (AbstractC40590S.f90114b[whiteBalance.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                    Object obj2 = str;
                    if (ListOf.size() > 0) {
                        obj2 = ListOf.get(0);
                    }
                    str2 = (String) obj2;
                    break;
                case 4:
                    int size = 1 % ListOf.size();
                    Object obj3 = str;
                    if (size >= 0 && size < ListOf.size()) {
                        obj3 = str;
                        obj3 = ListOf.get(size);
                    }
                    obj3 = str;
                    str2 = (String) obj3;
                    break;
                case 5:
                    int size2 = 2 % ListOf.size();
                    Object obj4 = str;
                    if (size2 >= 0 && size2 < ListOf.size()) {
                        obj4 = str;
                        obj4 = ListOf.get(size2);
                    }
                    obj4 = str;
                    str2 = (String) obj4;
                    break;
                case 6:
                    int size3 = 3 % ListOf.size();
                    Object obj5 = str;
                    if (size3 >= 0 && size3 < ListOf.size()) {
                        obj5 = str;
                        obj5 = ListOf.get(size3);
                    }
                    obj5 = str;
                    str2 = (String) obj5;
                    break;
                case 7:
                    int size4 = 4 % ListOf.size();
                    Object obj6 = str;
                    if (size4 >= 0 && size4 < ListOf.size()) {
                        obj6 = str;
                        obj6 = ListOf.get(size4);
                    }
                    obj6 = str;
                    str2 = (String) obj6;
                    break;
                case 8:
                    int size5 = 5 % ListOf.size();
                    Object obj7 = str;
                    if (size5 >= 0 && size5 < ListOf.size()) {
                        obj7 = str;
                        obj7 = ListOf.get(size5);
                    }
                    obj7 = str;
                    str2 = (String) obj7;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            parameters.setWhiteBalance(str2);
            return parameters;
        } catch (Exception e11) {
            Log.printStackTrace(e11);
            return parameters;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14439b(Camera1Manager camera1Manager) {
        CameraCallbackInterface cameraCallbackInterface = camera1Manager.f13491i;
        if (cameraCallbackInterface != null) {
            cameraCallbackInterface.onCameraAvailable();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14445b(Camera.Parameters parameters, boolean z11) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (!z11 && supportedFocusModes.contains("continuous-picture")) {
            parameters.setFocusMode("continuous-picture");
            this.f13488f = false;
            return;
        }
        if (!z11 && supportedFocusModes.contains("continuous-video")) {
            parameters.setFocusMode("continuous-video");
            this.f13488f = false;
        } else if (supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
            this.f13488f = true;
        } else if (supportedFocusModes.contains("macro")) {
            parameters.setFocusMode("macro");
            this.f13488f = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m14430a(Camera.Parameters parameters) {
        try {
            for (String key : CollectionsKt.listOf((Object[]) new String[]{"iso", "iso-speed", "nv-picture-iso"})) {
                if (parameters != null) {
                    Intrinsics.checkNotNullParameter(parameters, "<this>");
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (parameters.get(key) != null) {
                        return parameters.getInt(key);
                    }
                }
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14438a(Camera1Manager camera1Manager, byte[] bArr, Camera camera) {
        Size size = new Size(camera.getParameters().getPictureSize().width, camera.getParameters().getPictureSize().height);
        Camera.Parameters parameters = camera.getParameters();
        camera1Manager.getClass();
        Frame.Metadata metadata = new Frame.Metadata(size, camera1Manager.getF13497o().getRotation(), m14430a(parameters), 0L, 0.0f, null, 0.0f, camera1Manager.getF13497o().getOrientation(), camera1Manager.getF13497o().isPortrait(), 256, System.currentTimeMillis(), false, CameraConnectionData.INSTANCE.get(camera1Manager.getF13503u()), null, 10360, null);
        CameraCallbackInterface cameraCallbackInterface = camera1Manager.f13491i;
        if (cameraCallbackInterface != null) {
            Intrinsics.checkNotNull(bArr);
            cameraCallbackInterface.onCaptureFrame(new Frame(bArr, metadata, false, 4, null));
        }
        camera.startPreview();
    }

    /* JADX INFO: renamed from: a */
    public final Camera m14442a(int i11) {
        long jCurrentTimeMillis;
        final Ref.ObjectRef objectRef;
        Camera cameraOpen;
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3;
        int numberOfCameras = Camera.getNumberOfCameras();
        this.f13484b = (numberOfCameras <= 0 || i11 >= numberOfCameras) ? 0 : i11;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        try {
            Camera.getCameraInfo(i11, cameraInfo);
            loop0: while (true) {
                cameraOpen = null;
                while (cameraOpen == null && System.currentTimeMillis() - jCurrentTimeMillis <= 2000) {
                    try {
                        cameraOpen = Camera.open(i11);
                    } catch (Throwable th2) {
                        objectRef.element = th2;
                    }
                }
                break loop0;
            }
        } catch (Exception e11) {
            Log.printStackTrace(e11);
        }
        this.f13499q = cameraInfo.facing == 1;
        jCurrentTimeMillis = System.currentTimeMillis();
        objectRef = new Ref.ObjectRef();
        if (cameraOpen == null && objectRef.element != 0 && (textureViewSurfaceTextureListenerC40681j3 = this.f13505w) != null) {
            textureViewSurfaceTextureListenerC40681j3.post(new Runnable() { // from class: f9.b
                @Override // java.lang.Runnable
                public final void run() {
                    Camera1Manager.m14436a(this.f82988b, objectRef);
                }
            });
        }
        return cameraOpen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m14436a(Camera1Manager camera1Manager, Ref.ObjectRef objectRef) {
        CameraCallbackInterface cameraCallbackInterface = camera1Manager.f13491i;
        if (cameraCallbackInterface != null) {
            cameraCallbackInterface.onCameraError((Throwable) objectRef.element);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14443a(SurfaceTexture surfaceTexture, int i11, int i12, boolean z11, int i13) {
        int i14;
        int i15;
        synchronized (this.f13486d) {
            Camera camera = this.f13483a;
            if (camera != null) {
                try {
                    camera.setPreviewTexture(surfaceTexture);
                } catch (Throwable th2) {
                    Log.m14470e("DefaultCameraManager", "Exception in setPreviewTexture()", th2);
                }
                Camera.Parameters parameters = camera.getParameters();
                Intrinsics.checkNotNull(parameters);
                m14445b(parameters, FALLBACK_AUTO_FOCUS_LIST.contains(Build.MODEL));
                final Matrix matrixM14441a = m14441a(parameters, i11, i12, z11);
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                try {
                    Camera.getCameraInfo(this.f13484b, cameraInfo);
                } catch (Exception e11) {
                    Log.printStackTrace(e11);
                }
                if (i13 == 1) {
                    i14 = 90;
                } else if (i13 != 2) {
                    i14 = i13 != 3 ? 0 : 270;
                } else {
                    i14 = 180;
                }
                if (cameraInfo.facing == 1) {
                    i15 = (360 - ((cameraInfo.orientation + i14) % TXVodDownloadDataSource.QUALITY_360P)) % TXVodDownloadDataSource.QUALITY_360P;
                } else {
                    i15 = ((cameraInfo.orientation - i14) + TXVodDownloadDataSource.QUALITY_360P) % TXVodDownloadDataSource.QUALITY_360P;
                }
                Camera camera2 = this.f13483a;
                if (camera2 != null) {
                    camera2.setDisplayOrientation(i15);
                }
                Camera camera3 = this.f13483a;
                if (camera3 != null) {
                    camera3.setParameters(parameters);
                }
                Frame.Metadata f13497o = getF13497o();
                f13497o.setSize(new Size(getF13498p().getWidth(), getF13498p().getHeight()));
                f13497o.setOrientation(i15);
                int i16 = i15 / 90;
                if (getF13499q() && (i16 == 1 || i16 == 3)) {
                    i16 = (i16 + 2) % 4;
                }
                f13497o.setRotation(i16 * 90);
                f13497o.setImageFormat(parameters.getPreviewFormat());
                f13497o.setPortrait(z11);
                CameraSettings f13496n = getF13496n();
                f13496n.setSurface(new Size(i11, i12));
                f13496n.setFrontFacing(getF13499q());
                f13496n.setSensorRotation(cameraInfo.orientation);
                f13496n.setCapabilities(getF13504v());
                TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
                if (textureViewSurfaceTextureListenerC40681j3 != null) {
                    textureViewSurfaceTextureListenerC40681j3.post(new Runnable() { // from class: f9.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            Camera1Manager.m14435a(this.f82992b, matrixM14441a);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m14435a(Camera1Manager camera1Manager, Matrix matrix) {
        CameraCallbackInterface cameraCallbackInterface = camera1Manager.f13491i;
        if (cameraCallbackInterface != null) {
            cameraCallbackInterface.onPreviewAvailable(camera1Manager.getF13496n());
        }
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3 = camera1Manager.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 != null) {
            textureViewSurfaceTextureListenerC40681j3.setTransform(matrix);
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX INFO: renamed from: a */
    public final Matrix m14441a(Camera.Parameters parameters, int i11, int i12, boolean z11) {
        Object next;
        float f11;
        float f12;
        int i13;
        float f13;
        int i14;
        TextureViewSurfaceTextureListenerC40681j3 textureViewSurfaceTextureListenerC40681j3;
        Size fhd_camera_resolution = this.f13494l;
        if (fhd_camera_resolution == null) {
            fhd_camera_resolution = CameraManagerInterface.INSTANCE.getFHD_CAMERA_RESOLUTION();
        }
        int i15 = 0;
        Camera.Size size = parameters.getSupportedPreviewSizes().get(0);
        for (Camera.Size size2 : parameters.getSupportedPreviewSizes()) {
            if ((size2.width >= fhd_camera_resolution.getWidth() && size2.height >= fhd_camera_resolution.getHeight()) || (size2.width >= size.width && size2.height >= size.height)) {
                size = size2;
            }
        }
        this.f13498p = new Size(size.width, size.height);
        Size uhd_camera_resolution = CameraManagerInterface.INSTANCE.getUHD_CAMERA_RESOLUTION();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Intrinsics.checkNotNullExpressionValue(supportedPictureSizes, "getSupportedPictureSizes(...)");
        Iterator<T> it = supportedPictureSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Camera.Size size3 = (Camera.Size) next;
            if (uhd_camera_resolution.getWidth() == size3.width && uhd_camera_resolution.getHeight() == size3.height) {
                break;
            }
        }
        this.f13495m = next != null;
        if (!getF13504v().getHasHighResolutionSupport()) {
            Camera.Size size4 = parameters.getSupportedPictureSizes().get(0);
            uhd_camera_resolution = new Size(size4.width, size4.height);
        }
        if (i11 > i12) {
            f11 = i11;
            f12 = i12;
        } else {
            f11 = i12;
            f12 = i11;
        }
        float f14 = f11 / f12;
        try {
            parameters.set("metering", TtmlNode.CENTER);
        } catch (Exception unused) {
        }
        float width = getF13498p().getWidth() / getF13498p().getHeight();
        parameters.setPreviewSize(getF13498p().getWidth(), getF13498p().getHeight());
        parameters.setPictureSize(uhd_camera_resolution.getWidth(), uhd_camera_resolution.getHeight());
        float f15 = 1.0f;
        if (width == 1.0f) {
            getF13496n().setPreview(new Size(getF13498p().getWidth(), getF13498p().getHeight()));
            i15 = i11 > i12 ? i11 : i12;
            float f16 = i15;
            f13 = f16 / i12;
            f15 = f16 / i11;
        } else {
            if (z11) {
                getF13496n().setPreview(new Size(getF13498p().getHeight(), getF13498p().getWidth()));
                if (width >= f14) {
                    i13 = (int) (width * i11);
                    f13 = i13 / i12;
                    i14 = i13;
                    i15 = i11;
                } else {
                    if (width < f14) {
                        i15 = (int) (i12 / width);
                        f13 = 1.0f;
                        f15 = i15 / i11;
                        i14 = i12;
                    }
                    f13 = 1.0f;
                }
            } else {
                getF13496n().setPreview(new Size(getF13498p().getWidth(), getF13498p().getHeight()));
                if (width <= f14) {
                    i13 = (int) (i11 / width);
                    f13 = i13 / i12;
                    i14 = i13;
                    i15 = i11;
                } else {
                    if (width > f14) {
                        i15 = (int) (width * i12);
                        f13 = 1.0f;
                        f15 = i15 / i11;
                        i14 = i12;
                    }
                    f13 = 1.0f;
                }
            }
            getF13496n().setScaledPreview(new Size(i15, i14));
            textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
            if (textureViewSurfaceTextureListenerC40681j3 != null) {
                textureViewSurfaceTextureListenerC40681j3.setFrameSize(getF13496n().getF13517c());
            }
            Matrix matrix = new Matrix();
            float f17 = 2;
            matrix.setScale(f15, f13, i11 / f17, i12 / f17);
            return matrix;
        }
        i14 = i15;
        getF13496n().setScaledPreview(new Size(i15, i14));
        textureViewSurfaceTextureListenerC40681j3 = this.f13505w;
        if (textureViewSurfaceTextureListenerC40681j3 != null) {
            textureViewSurfaceTextureListenerC40681j3.setFrameSize(getF13496n().getF13517c());
        }
        Matrix matrix2 = new Matrix();
        float f18 = 2;
        matrix2.setScale(f15, f13, i11 / f18, i12 / f18);
        return matrix2;
    }
}
