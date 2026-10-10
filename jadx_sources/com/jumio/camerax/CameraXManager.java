package com.jumio.camerax;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.camera.camera2.interop.Camera2Interop;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraInfoUnavailableException;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraState;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.ResolutionInfo;
import androidx.camera.core.resolutionselector.ResolutionFilter;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MetaInfo;
import com.jumio.analytics.MobileEvents;
import com.jumio.camerax.CameraXManager;
import com.jumio.commons.camera.CameraCallbackInterface;
import com.jumio.commons.camera.CameraCapabilities;
import com.jumio.commons.camera.CameraManagerConfig;
import com.jumio.commons.camera.CameraManagerInterface;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.Frame;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.MeteringConfig;
import com.jumio.commons.camera.Size;
import com.jumio.commons.camera.renderer.opengl.GLUtils;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.commons.log.Log;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.core.Controller;
import com.jumio.core.models.ScanPartModel;
import com.jumio.core.plugins.Plugin;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import jumio.camerax.C40472A;
import jumio.camerax.C40473B;
import jumio.camerax.C40475a;
import jumio.camerax.C40477c;
import jumio.camerax.C40478d;
import jumio.camerax.C40482h;
import jumio.camerax.C40483i;
import jumio.camerax.C40485k;
import jumio.camerax.C40486l;
import jumio.camerax.C40487m;
import jumio.camerax.C40488n;
import jumio.camerax.C40494t;
import jumio.camerax.C40499y;
import jumio.camerax.C40500z;
import jumio.camerax.InterfaceC40479e;
import jumio.camerax.InterfaceC40480f;
import jumio.camerax.InterfaceC40481g;
import jumio.camerax.InterfaceC40489o;
import jumio.camerax.InterfaceC40491q;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.C41783z1;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.MutablePropertyReference0Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u008b\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010U\u001a\u00020GH\u0002J\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020W2\u0006\u0010[\u001a\u00020\u0016H\u0016J\u0010\u0010\\\u001a\u00020W2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020W2\u0006\u0010`\u001a\u00020aH\u0016J<\u0010b\u001a\u00020W2\u0006\u0010c\u001a\u00020\u00162\u0014\u0010d\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020W\u0018\u00010e2\u0014\u0010g\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020W\u0018\u00010eH\u0016J\u0018\u0010h\u001a\u00020W2\u0006\u0010i\u001a\u00020G2\u0006\u0010j\u001a\u00020GH\u0016J\u0010\u0010k\u001a\u00020W2\u0006\u0010l\u001a\u00020mH\u0016J\b\u0010n\u001a\u00020WH\u0016J\b\u0010o\u001a\u00020WH\u0016J\u0010\u0010p\u001a\u00020W2\u0006\u0010q\u001a\u00020rH\u0016J$\u0010s\u001a\u00020W2\u0006\u00101\u001a\u0002032\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020W0eH\u0016J \u0010v\u001a\u00020W2\u0006\u00101\u001a\u0002032\u0006\u0010w\u001a\u00020x2\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010y\u001a\u00020W2\u0006\u0010z\u001a\u00020\u0016H\u0016J\b\u0010{\u001a\u00020WH\u0016J\b\u0010|\u001a\u00020WH\u0016J\u0010\u0010}\u001a\u00020W2\u0006\u0010~\u001a\u00020\u0016H\u0016J\b\u0010\u007f\u001a\u00020WH\u0016J\u0014\u0010\u0080\u0001\u001a\u00020W2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\u001d\u0010\u0082\u0001\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020G2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\t\u0010\u0084\u0001\u001a\u00020WH\u0002J\u001d\u0010\u0085\u0001\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020G2\t\b\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\u001b\u0010\u0086\u0001\u001a\u00020W2\u0007\u0010\u0087\u0001\u001a\u00020\u00162\u0007\u0010\u0088\u0001\u001a\u00020GH\u0002J\n\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001e\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u001a\u0010'\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0016X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010)R\u0014\u0010-\u001a\u00020.X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0018R\u0014\u0010L\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0018R\u000e\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010R¨\u0006\u008c\u0001"}, m90084d2 = {"Lcom/jumio/camerax/CameraXManager;", "Lcom/jumio/commons/camera/CameraManagerInterface;", "Lcom/jumio/core/plugins/Plugin;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "cameraProvider", "Lcom/jumio/camerax/provider/CameraXProviderInterface;", "lifecycleHandler", "Lcom/jumio/camerax/lifecycle/CameraXLifecycleHandlerInterface;", "cameraUi", "Lcom/jumio/camerax/ui/CameraXUiInterface;", "executor", "Ljava/util/concurrent/Executor;", "cameraXEffectHandler", "Lcom/jumio/camerax/effects/CameraXEffectHandlerInterface;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/jumio/camerax/provider/CameraXProviderInterface;Lcom/jumio/camerax/lifecycle/CameraXLifecycleHandlerInterface;Lcom/jumio/camerax/ui/CameraXUiInterface;Ljava/util/concurrent/Executor;Lcom/jumio/camerax/effects/CameraXEffectHandlerInterface;)V", "version", "", "getVersion", "()Ljava/lang/String;", "focusing", "", "getFocusing", "()Z", "previewSize", "Lcom/jumio/commons/camera/Size;", "getPreviewSize", "()Lcom/jumio/commons/camera/Size;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "getCameraSettings", "()Lcom/jumio/commons/camera/CameraSettings;", "frameMetadata", "Lcom/jumio/commons/camera/Frame$Metadata;", "getFrameMetadata", "()Lcom/jumio/commons/camera/Frame$Metadata;", "value", "isFrontFacing", "isPausePreview", "setPausePreview", "(Z)V", "collectCameraConnection", "getCollectCameraConnection", "setCollectCameraConnection", "cameraCapabilities", "Lcom/jumio/commons/camera/CameraCapabilities;", "getCameraCapabilities", "()Lcom/jumio/commons/camera/CameraCapabilities;", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "camera", "Lcom/jumio/camerax/camera/CameraXInterface;", "cameraCallback", "Lcom/jumio/commons/camera/CameraCallbackInterface;", "cameraAccessLock", "", "preview", "Landroidx/camera/core/Preview;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "imageAnalysis", "Landroidx/camera/core/ImageAnalysis;", "rotationManager", "Lcom/jumio/commons/utils/DeviceRotationManager;", "enableFlashOnStart", "requestedSize", "hasHighResolutionSupport", "shouldUseShader", "currentLensFacing", "", "stateObserver", "Landroidx/lifecycle/Observer;", "Landroidx/camera/core/CameraState;", "isFlashOn", "isExposureAndWhiteBalanceLocked", "imageAnalysisCaptureCallback", "Lcom/jumio/camerax/utils/CameraDataCaptureCallback;", "previewResolutionSelector", "Landroidx/camera/core/resolutionselector/ResolutionSelector;", "getPreviewResolutionSelector", "()Landroidx/camera/core/resolutionselector/ResolutionSelector;", "captureResolutionSelector", "getCaptureResolutionSelector", "getAndroidImageFormat", "fillImageData", "", "imageData", "Lcom/jumio/commons/camera/ImageData;", "setExposureAndWhiteBalanceLock", "lock", "adjustCaptureSettings", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "setShader", "shaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "enableShader", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onEnable", "Lkotlin/Function1;", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "onRender", "requestFocus", "x", "y", "requestMetering", "meteringConfig", "Lcom/jumio/commons/camera/MeteringConfig;", "changeCamera", "captureImage", "setCameraFacing", "facing", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "setupUiViews", "addView", "Landroid/view/View;", "setup", "config", "Lcom/jumio/commons/camera/CameraManagerConfig;", "setFlash", "turnFlashOn", "startPreview", "reinitCamera", "stopPreview", "pause", TUIConstants.TUIBeauty.METHOD_DESTROY_XMAGIC, "initCamera", "withCameraCallbacks", "bindUseCases", "lensFacing", "unbindUseCases", "initPreview", "updateCameraSettings", "isPortrait", "sensorRotationDegrees", "fallbackToCamera1", "Lkotlinx/coroutines/Job;", "PreviewImageAnalyzer", "jumio-camerax_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraXManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraXManager.kt\ncom/jumio/camerax/CameraXManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1#2:595\n774#3:596\n865#3,2:597\n774#3:599\n865#3,2:600\n*S KotlinDebug\n*F\n+ 1 CameraXManager.kt\ncom/jumio/camerax/CameraXManager\n*L\n161#1:596\n161#1:597,2\n183#1:599\n183#1:600,2\n*E\n"})
public final class CameraXManager implements CameraManagerInterface, Plugin {

    @Nullable
    private InterfaceC40480f camera;

    @NotNull
    private final Object cameraAccessLock;

    @Nullable
    private WeakReference<CameraCallbackInterface> cameraCallback;

    @NotNull
    private final CameraCapabilities cameraCapabilities;

    @NotNull
    private final InterfaceC40489o cameraProvider;

    @NotNull
    private final CameraSettings cameraSettings;

    @NotNull
    private final InterfaceC40491q cameraUi;

    @NotNull
    private InterfaceC40479e cameraXEffectHandler;
    private boolean collectCameraConnection;

    @Nullable
    private WeakReference<Context> context;
    private int currentLensFacing;
    private boolean enableFlashOnStart;

    @NotNull
    private Executor executor;
    private final boolean focusing;

    @NotNull
    private final Frame.Metadata frameMetadata;
    private boolean hasHighResolutionSupport;

    @Nullable
    private ImageAnalysis imageAnalysis;

    @NotNull
    private final C40475a imageAnalysisCaptureCallback;

    @Nullable
    private ImageCapture imageCapture;
    private boolean isFrontFacing;
    private boolean isPausePreview;

    @NotNull
    private final InterfaceC40481g lifecycleHandler;

    @NotNull
    private final InterfaceC41709m0 mainScope;

    @Nullable
    private Preview preview;

    @NotNull
    private final Size previewSize;

    @Nullable
    private Size requestedSize;

    @Nullable
    private DeviceRotationManager rotationManager;
    private boolean shouldUseShader;

    @NotNull
    private final Observer<CameraState> stateObserver;

    @NotNull
    private final String version;

    public CameraXManager() {
        this(null, null, null, null, null, null, 63, null);
    }

    private final void bindUseCases(int lensFacing, boolean withCameraCallbacks) {
        LiveData<CameraState> cameraState;
        LiveData<CameraState> cameraState2;
        CameraCallbackInterface cameraCallbackInterface;
        ImageAnalysis imageAnalysis;
        Preview preview;
        PreviewView previewView;
        unbindUseCases();
        CameraSelector cameraSelectorBuild = new CameraSelector.Builder().requireLensFacing(lensFacing).build();
        Intrinsics.checkNotNullExpressionValue(cameraSelectorBuild, "build(...)");
        this.currentLensFacing = lensFacing;
        InterfaceC40489o interfaceC40489o = this.cameraProvider;
        ResolutionSelector resolutionSelector = getPreviewResolutionSelector();
        C40475a c40475a = this.imageAnalysisCaptureCallback;
        ((C40472A) interfaceC40489o).getClass();
        Intrinsics.checkNotNullParameter(resolutionSelector, "resolutionSelector");
        Preview.Builder resolutionSelector2 = new Preview.Builder().setResolutionSelector(resolutionSelector);
        if (c40475a != null) {
            new Camera2Interop.Extender(resolutionSelector2).setSessionCaptureCallback(c40475a);
        }
        Preview previewBuild = resolutionSelector2.build();
        Intrinsics.checkNotNullExpressionValue(previewBuild, "build(...)");
        this.preview = previewBuild;
        WeakReference weakReference = ((C40473B) this.cameraUi).f89851a;
        Preview.SurfaceProvider surfaceProvider = (weakReference == null || (previewView = (PreviewView) weakReference.get()) == null) ? null : previewView.getSurfaceProvider();
        if (surfaceProvider != null && (preview = this.preview) != null) {
            preview.setSurfaceProvider(surfaceProvider);
        }
        InterfaceC40489o interfaceC40489o2 = this.cameraProvider;
        ResolutionSelector resolutionSelector3 = getPreviewResolutionSelector();
        int androidImageFormat = getAndroidImageFormat();
        ((C40472A) interfaceC40489o2).getClass();
        Intrinsics.checkNotNullParameter(resolutionSelector3, "resolutionSelector");
        ImageAnalysis imageAnalysisBuild = new ImageAnalysis.Builder().setResolutionSelector(resolutionSelector3).setOutputImageFormat(androidImageFormat).setBackpressureStrategy(0).build();
        Intrinsics.checkNotNullExpressionValue(imageAnalysisBuild, "build(...)");
        this.imageAnalysis = imageAnalysisBuild;
        InterfaceC40489o interfaceC40489o3 = this.cameraProvider;
        ResolutionSelector resolutionSelector4 = getCaptureResolutionSelector();
        boolean z11 = this.enableFlashOnStart;
        ((C40472A) interfaceC40489o3).getClass();
        Intrinsics.checkNotNullParameter(resolutionSelector4, "resolutionSelector");
        ImageCapture imageCaptureBuild = new ImageCapture.Builder().setCaptureMode(1).setResolutionSelector(resolutionSelector4).setFlashMode(z11 ? 1 : 2).build();
        Intrinsics.checkNotNullExpressionValue(imageCaptureBuild, "build(...)");
        this.imageCapture = imageCaptureBuild;
        WeakReference<CameraCallbackInterface> weakReference2 = this.cameraCallback;
        if (weakReference2 != null && (cameraCallbackInterface = weakReference2.get()) != null && (imageAnalysis = this.imageAnalysis) != null) {
            imageAnalysis.setAnalyzer(this.executor, new C40482h(this, cameraCallbackInterface));
        }
        if (this.shouldUseShader) {
            C40478d c40478d = (C40478d) this.cameraXEffectHandler;
            C40477c c40477c = c40478d.f89864a;
            if (c40477c != null) {
                c40477c.f89862a.release();
                c40478d.f89864a = null;
            }
            c40478d.f89864a = new C40477c();
        }
        try {
            InterfaceC40489o interfaceC40489o4 = this.cameraProvider;
            C40499y c40499y = ((C40500z) this.lifecycleHandler).f89903a;
            C40477c c40477c2 = ((C40478d) this.cameraXEffectHandler).f89864a;
            C40494t c40494tM89119a = ((C40472A) interfaceC40489o4).m89119a(c40499y, cameraSelectorBuild, c40477c2 != null ? c40477c2.f89863b : null, this.preview, this.imageCapture, this.imageAnalysis);
            InterfaceC40480f interfaceC40480f = this.camera;
            if (interfaceC40480f != null) {
                Observer<CameraState> observer = this.stateObserver;
                Intrinsics.checkNotNullParameter(observer, "observer");
                CameraInfo cameraInfo = ((C40494t) interfaceC40480f).f89885a.getCameraInfo();
                if (cameraInfo != null && (cameraState2 = cameraInfo.getCameraState()) != null) {
                    cameraState2.removeObserver(observer);
                }
            }
            if (c40494tM89119a != null) {
                C40499y lifecycle = ((C40500z) this.lifecycleHandler).f89903a;
                Observer<CameraState> observer2 = this.stateObserver;
                Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
                Intrinsics.checkNotNullParameter(observer2, "observer");
                CameraInfo cameraInfo2 = c40494tM89119a.f89885a.getCameraInfo();
                if (cameraInfo2 != null && (cameraState = cameraInfo2.getCameraState()) != null) {
                    cameraState.observe(lifecycle, observer2);
                }
            }
            this.camera = c40494tM89119a;
            if (withCameraCallbacks) {
                C41696j.m91104d(this.mainScope, null, null, new C40483i(this, null), 3, null);
            }
        } catch (Exception e11) {
            Log.m14469e("CameraXManager", "Use case binding failed " + e11);
            fallbackToCamera1();
        }
    }

    private final int getAndroidImageFormat() {
        return 1;
    }

    public static /* synthetic */ void initCamera$default(CameraXManager cameraXManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        cameraXManager.initCamera(z11);
    }

    public CameraXManager(@NotNull InterfaceC41709m0 mainScope, @NotNull InterfaceC40489o cameraProvider, @NotNull InterfaceC40481g lifecycleHandler, @NotNull InterfaceC40491q cameraUi, @NotNull Executor executor, @NotNull InterfaceC40479e cameraXEffectHandler) {
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        Intrinsics.checkNotNullParameter(cameraProvider, "cameraProvider");
        Intrinsics.checkNotNullParameter(lifecycleHandler, "lifecycleHandler");
        Intrinsics.checkNotNullParameter(cameraUi, "cameraUi");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(cameraXEffectHandler, "cameraXEffectHandler");
        this.mainScope = mainScope;
        this.cameraProvider = cameraProvider;
        this.lifecycleHandler = lifecycleHandler;
        this.cameraUi = cameraUi;
        this.executor = executor;
        this.cameraXEffectHandler = cameraXEffectHandler;
        this.version = "4.17.0 (1)";
        this.previewSize = new Size(0, 0);
        this.cameraSettings = new CameraSettings();
        this.frameMetadata = new Frame.Metadata(null, 0, 0, 0L, 0.0f, null, 0.0f, 0, false, 0, 0L, false, null, null, 16383, null);
        this.collectCameraConnection = true;
        this.cameraCapabilities = new CameraXCapabilities(cameraProvider, new MutablePropertyReference0Impl(this) { // from class: jumio.camerax.j
            {
                super(this, CameraXManager.class, "hasHighResolutionSupport", "getHasHighResolutionSupport()Z", 0);
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KProperty0
            public final Object get() {
                return Boolean.valueOf(((CameraXManager) this.receiver).hasHighResolutionSupport);
            }

            @Override // p852kotlin.jvm.internal.MutablePropertyReference0Impl, p852kotlin.reflect.KMutableProperty0
            public final void set(Object obj) {
                ((CameraXManager) this.receiver).hasHighResolutionSupport = ((Boolean) obj).booleanValue();
            }
        }, new Function0() { // from class: e9.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraXManager.cameraCapabilities$lambda$1(this.f82367b);
            }
        });
        this.cameraAccessLock = new Object();
        this.stateObserver = new Observer() { // from class: e9.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                CameraXManager.stateObserver$lambda$3(this.f82368b, (CameraState) obj);
            }
        };
        this.imageAnalysisCaptureCallback = new C40475a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_captureResolutionSelector_$lambda$11(CameraXManager cameraXManager, List supportedSizes, int i11) {
        Object next;
        Intrinsics.checkNotNullParameter(supportedSizes, "supportedSizes");
        Iterator it = supportedSizes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            android.util.Size size = (android.util.Size) next;
            CameraManagerInterface.Companion companion = CameraManagerInterface.INSTANCE;
            if (companion.getUHD_CAMERA_RESOLUTION().getWidth() == size.getWidth() && companion.getUHD_CAMERA_RESOLUTION().getHeight() == size.getHeight()) {
                break;
            }
        }
        cameraXManager.hasHighResolutionSupport = next != null;
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSizes) {
            android.util.Size size2 = (android.util.Size) obj;
            if (size2.getWidth() / size2.getHeight() == CameraManagerInterface.INSTANCE.getUHD_CAMERA_RESOLUTION().getRatio()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List _get_previewResolutionSelector_$lambda$8$lambda$7(Size size, List supportedSizes, int i11) {
        Intrinsics.checkNotNullParameter(supportedSizes, "supportedSizes");
        ArrayList arrayList = new ArrayList();
        for (Object obj : supportedSizes) {
            android.util.Size size2 = (android.util.Size) obj;
            if (size2.getWidth() / size2.getHeight() == size.getRatio()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void bindUseCases$default(CameraXManager cameraXManager, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        cameraXManager.bindUseCases(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC40480f cameraCapabilities$lambda$1(CameraXManager cameraXManager) {
        InterfaceC40480f interfaceC40480f;
        synchronized (cameraXManager.cameraAccessLock) {
            interfaceC40480f = cameraXManager.camera;
        }
        return interfaceC40480f;
    }

    private final InterfaceC41775x1 fallbackToCamera1() {
        return C41696j.m91104d(this.mainScope, null, null, new C40486l(this, null), 3, null);
    }

    private final ResolutionSelector getCaptureResolutionSelector() {
        ResolutionSelector.Builder resolutionFilter = new ResolutionSelector.Builder().setResolutionFilter(new ResolutionFilter() { // from class: e9.g
            @Override // androidx.camera.core.resolutionselector.ResolutionFilter
            public final List filter(List list, int i11) {
                return CameraXManager._get_captureResolutionSelector_$lambda$11(this.f82373a, list, i11);
            }
        });
        CameraManagerInterface.Companion companion = CameraManagerInterface.INSTANCE;
        ResolutionSelector resolutionSelectorBuild = resolutionFilter.setResolutionStrategy(new ResolutionStrategy(new android.util.Size(companion.getUHD_CAMERA_RESOLUTION().getWidth(), companion.getUHD_CAMERA_RESOLUTION().getHeight()), 3)).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "build(...)");
        return resolutionSelectorBuild;
    }

    private final ResolutionSelector getPreviewResolutionSelector() {
        final Size fhd_camera_resolution = this.requestedSize;
        if (fhd_camera_resolution == null) {
            fhd_camera_resolution = CameraManagerInterface.INSTANCE.getFHD_CAMERA_RESOLUTION();
        }
        ResolutionSelector resolutionSelectorBuild = new ResolutionSelector.Builder().setResolutionFilter(new ResolutionFilter() { // from class: e9.a
            @Override // androidx.camera.core.resolutionselector.ResolutionFilter
            public final List filter(List list, int i11) {
                return CameraXManager._get_previewResolutionSelector_$lambda$8$lambda$7(fhd_camera_resolution, list, i11);
            }
        }).setResolutionStrategy(new ResolutionStrategy(new android.util.Size(fhd_camera_resolution.getWidth(), fhd_camera_resolution.getHeight()), 3)).build();
        Intrinsics.checkNotNullExpressionValue(resolutionSelectorBuild, "with(...)");
        return resolutionSelectorBuild;
    }

    private final void initCamera(final boolean withCameraCallbacks) {
        Context context;
        synchronized (this.cameraAccessLock) {
            WeakReference<Context> weakReference = this.context;
            if (weakReference != null && (context = weakReference.get()) != null) {
                ((C40472A) this.cameraProvider).m89120a(context, new Function1() { // from class: e9.d
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CameraXManager.initCamera$lambda$20$lambda$19(this.f82369b, withCameraCallbacks, ((Boolean) obj).booleanValue());
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0030  */
    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    public static final Unit initCamera$lambda$20$lambda$19(CameraXManager cameraXManager, boolean z11, boolean z12) throws CameraInfoUnavailableException {
        CameraSelector cameraSelector;
        ProcessCameraProvider processCameraProvider;
        boolean zHasCamera;
        CameraSelector cameraSelector2;
        ProcessCameraProvider processCameraProvider2;
        boolean zHasCamera2;
        if (!z12) {
            cameraXManager.fallbackToCamera1();
            return Unit.INSTANCE;
        }
        int i11 = 0;
        if (cameraXManager.getIsFrontFacing()) {
            InterfaceC40489o interfaceC40489o = cameraXManager.cameraProvider;
            CameraSelector cameraSelector3 = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector3, "DEFAULT_FRONT_CAMERA");
            C40472A c40472a = (C40472A) interfaceC40489o;
            c40472a.getClass();
            Intrinsics.checkNotNullParameter(cameraSelector3, "cameraSelector");
            ProcessCameraProvider processCameraProvider3 = c40472a.f89850a;
            if (!(processCameraProvider3 != null ? processCameraProvider3.hasCamera(cameraSelector3) : false)) {
                InterfaceC40489o interfaceC40489o2 = cameraXManager.cameraProvider;
                cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
                Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_BACK_CAMERA");
                C40472A c40472a2 = (C40472A) interfaceC40489o2;
                c40472a2.getClass();
                Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
                processCameraProvider = c40472a2.f89850a;
                if (processCameraProvider != null) {
                    zHasCamera = processCameraProvider.hasCamera(cameraSelector);
                } else {
                    zHasCamera = false;
                }
                if (zHasCamera) {
                    i11 = 1;
                } else {
                    InterfaceC40489o interfaceC40489o3 = cameraXManager.cameraProvider;
                    cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
                    Intrinsics.checkNotNullExpressionValue(cameraSelector2, "DEFAULT_FRONT_CAMERA");
                    C40472A c40472a3 = (C40472A) interfaceC40489o3;
                    c40472a3.getClass();
                    Intrinsics.checkNotNullParameter(cameraSelector2, "cameraSelector");
                    processCameraProvider2 = c40472a3.f89850a;
                    if (processCameraProvider2 != null) {
                        zHasCamera2 = processCameraProvider2.hasCamera(cameraSelector2);
                    } else {
                        zHasCamera2 = false;
                    }
                    if (!zHasCamera2) {
                        cameraXManager.fallbackToCamera1();
                        return Unit.INSTANCE;
                    }
                }
            }
        } else {
            InterfaceC40489o interfaceC40489o4 = cameraXManager.cameraProvider;
            cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_BACK_CAMERA");
            C40472A c40472a4 = (C40472A) interfaceC40489o4;
            c40472a4.getClass();
            Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
            processCameraProvider = c40472a4.f89850a;
            if (processCameraProvider != null) {
                zHasCamera = processCameraProvider.hasCamera(cameraSelector);
            } else {
                zHasCamera = false;
            }
            if (zHasCamera) {
                i11 = 1;
            } else {
                InterfaceC40489o interfaceC40489o5 = cameraXManager.cameraProvider;
                cameraSelector2 = CameraSelector.DEFAULT_FRONT_CAMERA;
                Intrinsics.checkNotNullExpressionValue(cameraSelector2, "DEFAULT_FRONT_CAMERA");
                C40472A c40472a5 = (C40472A) interfaceC40489o5;
                c40472a5.getClass();
                Intrinsics.checkNotNullParameter(cameraSelector2, "cameraSelector");
                processCameraProvider2 = c40472a5.f89850a;
                if (processCameraProvider2 != null) {
                    zHasCamera2 = processCameraProvider2.hasCamera(cameraSelector2);
                } else {
                    zHasCamera2 = false;
                }
                if (!zHasCamera2) {
                    cameraXManager.fallbackToCamera1();
                    return Unit.INSTANCE;
                }
            }
        }
        cameraXManager.bindUseCases(i11, z11);
        cameraXManager.initPreview(i11, z11);
        if (!cameraXManager.getIsPausePreview()) {
            cameraXManager.startPreview();
        }
        if (cameraXManager.getCameraCapabilities().getHasFlash() && cameraXManager.enableFlashOnStart) {
            cameraXManager.setFlash(true);
        }
        return Unit.INSTANCE;
    }

    private final void initPreview(int lensFacing, boolean withCameraCallbacks) {
        synchronized (this.cameraAccessLock) {
            try {
                InterfaceC40480f interfaceC40480f = this.camera;
                if (interfaceC40480f != null) {
                    DeviceRotationManager deviceRotationManager = this.rotationManager;
                    boolean zIsScreenPortrait = deviceRotationManager != null ? deviceRotationManager.isScreenPortrait() : true;
                    C40494t c40494t = (C40494t) interfaceC40480f;
                    CameraInfo cameraInfo = c40494t.f89885a.getCameraInfo();
                    int i11 = 0;
                    updateCameraSettings(zIsScreenPortrait, cameraInfo != null ? cameraInfo.getSensorRotationDegrees() : 0);
                    CameraInfo cameraInfo2 = c40494t.f89885a.getCameraInfo();
                    int sensorRotationDegrees = cameraInfo2 != null ? cameraInfo2.getSensorRotationDegrees() : 0;
                    DeviceRotationManager deviceRotationManager2 = this.rotationManager;
                    int displayRotation = deviceRotationManager2 != null ? deviceRotationManager2.getDisplayRotation() : 0;
                    if (displayRotation == 1) {
                        i11 = 90;
                    } else if (displayRotation == 2) {
                        i11 = 180;
                    } else if (displayRotation == 3) {
                        i11 = 270;
                    }
                    int i12 = lensFacing == 0 ? (360 - ((sensorRotationDegrees + i11) % TXVodDownloadDataSource.QUALITY_360P)) % TXVodDownloadDataSource.QUALITY_360P : ((sensorRotationDegrees - i11) + TXVodDownloadDataSource.QUALITY_360P) % TXVodDownloadDataSource.QUALITY_360P;
                    Frame.Metadata frameMetadata = getFrameMetadata();
                    frameMetadata.setOrientation(i12);
                    frameMetadata.setImageFormat(17);
                    frameMetadata.setPortrait(zIsScreenPortrait);
                    if (withCameraCallbacks) {
                        C41696j.m91104d(this.mainScope, null, null, new C40487m(this, null), 3, null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void initPreview$default(CameraXManager cameraXManager, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = true;
        }
        cameraXManager.initPreview(i11, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stateObserver$lambda$3(CameraXManager cameraXManager, CameraState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CameraState.Type type = it.getType();
        CameraState.Type type2 = CameraState.Type.OPEN;
        if (type == type2) {
            ((C40473B) cameraXManager.cameraUi).m89124b();
        }
        CameraState.StateError error = it.getError();
        if (error != null) {
            MetaInfo metaInfo = new MetaInfo();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(it.getType());
            sb2.append('|');
            sb2.append(error);
            metaInfo.put("additionalData", sb2.toString());
            Analytics.INSTANCE.add(MobileEvents.misc("cameraXError", metaInfo));
            Log.m14467e("CameraX Error - State " + it.getType() + " - Error: " + error);
            if (CollectionsKt.listOf((Object[]) new CameraState.Type[]{CameraState.Type.PENDING_OPEN, CameraState.Type.OPENING, type2}).contains(it.getType())) {
                cameraXManager.fallbackToCamera1();
            }
        }
    }

    private final void unbindUseCases() {
        ImageAnalysis imageAnalysis = this.imageAnalysis;
        if (imageAnalysis != null) {
            imageAnalysis.clearAnalyzer();
        }
        ProcessCameraProvider processCameraProvider = ((C40472A) this.cameraProvider).f89850a;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        this.imageCapture = null;
        this.imageAnalysis = null;
        this.preview = null;
    }

    private final void updateCameraSettings(boolean isPortrait, int sensorRotationDegrees) {
        Size sizeFlip;
        float f11;
        float f12;
        int i11;
        ResolutionInfo resolutionInfo;
        android.util.Size resolution;
        PreviewView previewView;
        WeakReference weakReference = ((C40473B) this.cameraUi).f89851a;
        Size surfaceSize = (weakReference == null || (previewView = (PreviewView) weakReference.get()) == null) ? new Size(0, 0) : new Size(previewView.getWidth(), previewView.getHeight());
        if (surfaceSize.isEmpty()) {
            return;
        }
        ImageAnalysis imageAnalysis = this.imageAnalysis;
        if (imageAnalysis != null && (resolutionInfo = imageAnalysis.getResolutionInfo()) != null && (resolution = resolutionInfo.getResolution()) != null) {
            Size previewSize = getPreviewSize();
            previewSize.setWidth(resolution.getWidth());
            previewSize.setHeight(resolution.getHeight());
        }
        CameraSettings cameraSettings = getCameraSettings();
        cameraSettings.setSurface(surfaceSize);
        Size previewSize2 = getPreviewSize();
        Intrinsics.checkNotNullParameter(previewSize2, "previewSize");
        if (previewSize2.getRatio() == 1.0f) {
            sizeFlip = new Size(previewSize2.getWidth(), previewSize2.getHeight());
        } else {
            sizeFlip = isPortrait ? previewSize2.flip() : Size.copy$default(previewSize2, 0, 0, 3, null);
        }
        cameraSettings.setPreview(sizeFlip);
        float ratio = getPreviewSize().getRatio();
        Intrinsics.checkNotNullParameter(surfaceSize, "surfaceSize");
        int width = surfaceSize.getWidth();
        int height = surfaceSize.getHeight();
        if (width > height) {
            f11 = width;
            f12 = height;
        } else {
            f11 = height;
            f12 = width;
        }
        float f13 = f11 / f12;
        if (ratio == 1.0f) {
            if (width > height) {
                height = width;
            } else {
                width = height;
            }
        } else if (isPortrait) {
            if (ratio >= f13) {
                i11 = (int) (ratio * width);
                height = i11;
            } else {
                width = (int) (height / ratio);
            }
        } else if (ratio <= f13) {
            i11 = (int) (width / ratio);
            height = i11;
        } else {
            width = (int) (ratio * height);
        }
        cameraSettings.setScaledPreview(new Size(width, height));
        cameraSettings.setFrontFacing(getIsFrontFacing());
        cameraSettings.setSensorRotation(sensorRotationDegrees);
        cameraSettings.setCapabilities(getCameraCapabilities());
        C40477c c40477c = ((C40478d) this.cameraXEffectHandler).f89864a;
        if (c40477c != null) {
            Size size = getCameraSettings().getF13517c();
            Intrinsics.checkNotNullParameter(size, "size");
            c40477c.f89862a.setFrameSize(size);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void adjustCaptureSettings(@NotNull CaptureSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        InterfaceC40480f interfaceC40480f = this.camera;
        if (interfaceC40480f != null) {
            ((C40494t) interfaceC40480f).m89137a(settings, this.imageAnalysisCaptureCallback.m89125a());
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void captureImage() {
        ImageCapture imageCapture = this.imageCapture;
        if (imageCapture != null) {
            imageCapture.takePicture(this.executor, new C40485k(this));
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void destroy() {
        LiveData<CameraState> cameraState;
        PreviewView previewView;
        ((C40500z) this.lifecycleHandler).f89903a.m89146a(Lifecycle.State.DESTROYED);
        unbindUseCases();
        this.rotationManager = null;
        setPausePreview(false);
        this.requestedSize = null;
        WeakReference<Context> weakReference = this.context;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.context = null;
        C40478d c40478d = (C40478d) this.cameraXEffectHandler;
        C40477c c40477c = c40478d.f89864a;
        if (c40477c != null) {
            c40477c.f89862a.release();
        }
        c40478d.f89864a = null;
        C40473B c40473b = (C40473B) this.cameraUi;
        c40473b.m89124b();
        WeakReference weakReference2 = c40473b.f89851a;
        if (weakReference2 != null && (previewView = (PreviewView) weakReference2.get()) != null) {
            previewView.setOnClickListener(null);
            previewView.setOnTouchListener(null);
        }
        WeakReference weakReference3 = c40473b.f89851a;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        c40473b.f89851a = null;
        WeakReference weakReference4 = c40473b.f89852b;
        if (weakReference4 != null) {
            weakReference4.clear();
        }
        c40473b.f89852b = null;
        InterfaceC40480f interfaceC40480f = this.camera;
        if (interfaceC40480f != null) {
            Observer<CameraState> observer = this.stateObserver;
            Intrinsics.checkNotNullParameter(observer, "observer");
            CameraInfo cameraInfo = ((C40494t) interfaceC40480f).f89885a.getCameraInfo();
            if (cameraInfo != null && (cameraState = cameraInfo.getCameraState()) != null) {
                cameraState.removeObserver(observer);
            }
        }
        this.camera = null;
        C40472A c40472a = (C40472A) this.cameraProvider;
        ProcessCameraProvider processCameraProvider = c40472a.f89850a;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        c40472a.f89850a = null;
        this.cameraCallback = null;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void enableShader(boolean enable, @Nullable Function1<? super GLUtils.Program2D, Unit> onEnable, @Nullable Function1<? super GLUtils.Program2D, Unit> onRender) {
        C40477c c40477c = ((C40478d) this.cameraXEffectHandler).f89864a;
        if (c40477c != null) {
            c40477c.f89862a.enableShader(enable, onEnable, onRender);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void fillImageData(@NotNull ImageData imageData) {
        Intrinsics.checkNotNullParameter(imageData, "imageData");
        imageData.setCameraPosition(getIsFrontFacing() ? ImageData.CameraPosition.FRONT : ImageData.CameraPosition.BACK);
        DeviceRotationManager deviceRotationManager = this.rotationManager;
        imageData.setOrientationMode(deviceRotationManager != null ? deviceRotationManager.getScreenOrientation() : null);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    public CameraCapabilities getCameraCapabilities() {
        return this.cameraCapabilities;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    public CameraSettings getCameraSettings() {
        return this.cameraSettings;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public boolean getCollectCameraConnection() {
        return this.collectCameraConnection;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public boolean getFocusing() {
        return this.focusing;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    public Frame.Metadata getFrameMetadata() {
        return this.frameMetadata;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    @NotNull
    public Size getPreviewSize() {
        return this.previewSize;
    }

    @Override // com.jumio.core.plugins.Plugin
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public boolean isExposureAndWhiteBalanceLocked() {
        boolean zM89143d;
        synchronized (this.cameraAccessLock) {
            InterfaceC40480f interfaceC40480f = this.camera;
            zM89143d = interfaceC40480f != null ? ((C40494t) interfaceC40480f).m89143d() : false;
        }
        return zM89143d;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isFlashOn */
    public boolean getF13500r() {
        boolean z11;
        synchronized (this.cameraAccessLock) {
            InterfaceC40480f interfaceC40480f = this.camera;
            z11 = interfaceC40480f != null ? ((C40494t) interfaceC40480f).f89889e : false;
        }
        return z11;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isFrontFacing, reason: from getter */
    public boolean getIsFrontFacing() {
        return this.isFrontFacing;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    /* JADX INFO: renamed from: isPausePreview, reason: from getter */
    public boolean getIsPausePreview() {
        return this.isPausePreview;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void reinitCamera() {
        this.executor.execute(new Runnable() { // from class: e9.e
            @Override // java.lang.Runnable
            public final void run() {
                CameraXManager.initCamera$default(this.f82371b, false, 1, null);
            }
        });
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void requestMetering(@NotNull MeteringConfig meteringConfig) {
        Intrinsics.checkNotNullParameter(meteringConfig, "meteringConfig");
        InterfaceC40480f interfaceC40480f = this.camera;
        if (interfaceC40480f != null) {
            ((C40494t) interfaceC40480f).m89138a(meteringConfig);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setCameraFacing(@NotNull JumioCameraFacing facing) {
        boolean z11;
        boolean zIsBound;
        Intrinsics.checkNotNullParameter(facing, "facing");
        if (facing == JumioCameraFacing.FRONT) {
            InterfaceC40489o interfaceC40489o = this.cameraProvider;
            CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_FRONT_CAMERA");
            C40472A c40472a = (C40472A) interfaceC40489o;
            c40472a.getClass();
            Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
            ProcessCameraProvider processCameraProvider = c40472a.f89850a;
            if (processCameraProvider != null ? processCameraProvider.hasCamera(cameraSelector) : true) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.isFrontFacing = z11;
        Preview useCase = this.preview;
        if (useCase != null) {
            C40472A c40472a2 = (C40472A) this.cameraProvider;
            c40472a2.getClass();
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            ProcessCameraProvider processCameraProvider2 = c40472a2.f89850a;
            if (processCameraProvider2 != null) {
                zIsBound = processCameraProvider2.isBound(useCase);
            } else {
                zIsBound = false;
            }
        } else {
            zIsBound = false;
        }
        if (!zIsBound || getIsPausePreview() || this.camera == null || !((C40500z) this.lifecycleHandler).f89903a.f89902b.getState().isAtLeast(Lifecycle.State.STARTED)) {
            return;
        }
        synchronized (this.cameraAccessLock) {
            try {
                ((C40473B) this.cameraUi).m89122a();
                setFlash(false);
                int i11 = !getIsFrontFacing() ? 1 : 0;
                bindUseCases$default(this, i11, false, 2, null);
                initPreview$default(this, i11, false, 2, null);
            } catch (Exception e11) {
                Log.printStackTrace(e11);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setCollectCameraConnection(boolean z11) {
        this.collectCameraConnection = z11;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setExposureAndWhiteBalanceLock(boolean lock) {
        InterfaceC40480f interfaceC40480f = this.camera;
        if (interfaceC40480f != null) {
            ((C40494t) interfaceC40480f).m89139a(lock);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setFlash(boolean turnFlashOn) {
        Log.m14474i("CameraXManager", "Flash is turned on: " + turnFlashOn);
        synchronized (this.cameraAccessLock) {
            InterfaceC40480f interfaceC40480f = this.camera;
            if (interfaceC40480f != null) {
                ((C40494t) interfaceC40480f).m89140a(turnFlashOn, this.executor);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setPausePreview(boolean z11) {
        this.isPausePreview = z11;
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setShader(@NotNull ShaderProvider shaderProvider) {
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        C40477c c40477c = ((C40478d) this.cameraXEffectHandler).f89864a;
        if (c40477c != null) {
            Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
            c40477c.f89862a.setShader(shaderProvider);
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setup(@NotNull Context context, @NotNull CameraManagerConfig config, @NotNull CameraCallbackInterface cameraCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(cameraCallback, "cameraCallback");
        Log.m14463d("CameraXManager", "Setting up " + Reflection.getOrCreateKotlinClass(CameraXManager.class).getSimpleName());
        this.context = new WeakReference<>(context);
        C40472A c40472a = (C40472A) this.cameraProvider;
        ProcessCameraProvider processCameraProvider = c40472a.f89850a;
        if (processCameraProvider != null) {
            processCameraProvider.unbindAll();
        }
        c40472a.f89850a = null;
        InterfaceC40481g interfaceC40481g = this.lifecycleHandler;
        InterfaceC41709m0 mainScope = this.mainScope;
        C40500z c40500z = (C40500z) interfaceC40481g;
        c40500z.getClass();
        Intrinsics.checkNotNullParameter(mainScope, "mainScope");
        c40500z.f89903a = new C40499y(mainScope);
        this.rotationManager = config.getRotationManager();
        boolean z11 = false;
        this.enableFlashOnStart = getF13500r() || config.getEnableFlashOnStart();
        this.requestedSize = config.getRequestedSize();
        this.shouldUseShader = config.getShouldUseShader();
        if (config.getRequestedCameraFacing() == JumioCameraFacing.FRONT) {
            InterfaceC40489o interfaceC40489o = this.cameraProvider;
            CameraSelector cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA;
            Intrinsics.checkNotNullExpressionValue(cameraSelector, "DEFAULT_FRONT_CAMERA");
            C40472A c40472a2 = (C40472A) interfaceC40489o;
            c40472a2.getClass();
            Intrinsics.checkNotNullParameter(cameraSelector, "cameraSelector");
            ProcessCameraProvider processCameraProvider2 = c40472a2.f89850a;
            if (processCameraProvider2 != null ? processCameraProvider2.hasCamera(cameraSelector) : true) {
                z11 = true;
            }
        }
        this.isFrontFacing = z11;
        ((C40500z) this.lifecycleHandler).f89903a.m89146a(Lifecycle.State.CREATED);
        InterfaceC40491q interfaceC40491q = this.cameraUi;
        C40488n focusCallback = new C40488n(this);
        ((C40473B) interfaceC40491q).getClass();
        Intrinsics.checkNotNullParameter(focusCallback, "focusCallback");
        this.cameraCallback = new WeakReference<>(cameraCallback);
        this.executor.execute(new Runnable() { // from class: e9.f
            @Override // java.lang.Runnable
            public final void run() {
                CameraXManager.initCamera$default(this.f82372b, false, 1, null);
            }
        });
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void setupUiViews(@NotNull Context context, @NotNull Function1<? super View, Unit> addView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(addView, "addView");
        ((C40473B) this.cameraUi).m89123a(context, addView);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void startPreview() {
        synchronized (this.cameraAccessLock) {
            try {
                Log.m14474i("CameraXManager", "Starting preview");
                if (getIsPausePreview()) {
                    setPausePreview(false);
                    initCamera(false);
                } else {
                    ((C40500z) this.lifecycleHandler).f89903a.m89146a(Lifecycle.State.RESUMED);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void stopPreview(boolean pause) {
        Log.m14474i("CameraXManager", "Stopping preview");
        C41783z1.m91401g(this.mainScope.getF53495b(), new CancellationException("Preview stopped"));
        setFlash(false);
        ((C40500z) this.lifecycleHandler).f89903a.m89146a(Lifecycle.State.CREATED);
        setPausePreview(pause);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void changeCamera() {
        JumioCameraFacing jumioCameraFacing;
        if (getIsFrontFacing()) {
            jumioCameraFacing = JumioCameraFacing.BACK;
        } else {
            jumioCameraFacing = JumioCameraFacing.FRONT;
        }
        setCameraFacing(jumioCameraFacing);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isApplicableFor(@NotNull Controller controller, @NotNull ScanPartModel scanPartModel) {
        return super.isApplicableFor(controller, scanPartModel);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isPreloaded(@NotNull Controller controller) {
        return super.isPreloaded(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public boolean isUsable(@NotNull Controller controller) {
        return super.isUsable(controller);
    }

    @Override // com.jumio.core.plugins.Plugin
    public void preload(@NotNull Controller controller) {
        super.preload(controller);
    }

    @Override // com.jumio.commons.camera.CameraManagerInterface
    public void requestFocus(int x11, int y11) {
        if (!getIsPausePreview()) {
            Log.m14463d("CameraXManager", "Focus requested on " + x11 + ' ' + y11 + '!');
            if (!getCameraSettings().getF13516b().isEmpty()) {
                MeteringConfig.Builder builder = new MeteringConfig.Builder();
                builder.point(x11, y11, getCameraSettings().getF13516b().getWidth(), getCameraSettings().getF13516b().getHeight());
                MeteringConfig.Builder.mode$default(builder, true, false, false, 6, null);
                MeteringConfig meteringConfigBuild = builder.build();
                InterfaceC40480f interfaceC40480f = this.camera;
                if (interfaceC40480f != null) {
                    ((C40494t) interfaceC40480f).m89138a(meteringConfigBuild);
                }
            }
        }
    }

    @Override // com.jumio.core.plugins.Plugin
    public void unload() {
        super.unload();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CameraXManager(InterfaceC41709m0 interfaceC41709m0, InterfaceC40489o interfaceC40489o, InterfaceC40481g interfaceC40481g, InterfaceC40491q interfaceC40491q, Executor executor, InterfaceC40479e interfaceC40479e, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        interfaceC41709m0 = (i11 & 1) != 0 ? C41713n0.m91125a(C41782z0.m91393c().getImmediate()) : interfaceC41709m0;
        interfaceC40489o = (i11 & 2) != 0 ? new C40472A() : interfaceC40489o;
        interfaceC40481g = (i11 & 4) != 0 ? new C40500z(interfaceC41709m0) : interfaceC40481g;
        interfaceC40491q = (i11 & 8) != 0 ? new C40473B() : interfaceC40491q;
        if ((i11 & 16) != 0) {
            executor = Executors.newSingleThreadExecutor();
            Intrinsics.checkNotNullExpressionValue(executor, "newSingleThreadExecutor(...)");
        }
        this(interfaceC41709m0, interfaceC40489o, interfaceC40481g, interfaceC40491q, executor, (i11 & 32) != 0 ? new C40478d() : interfaceC40479e);
    }
}
