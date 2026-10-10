package com.jumio.core.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.lifecycle.LifecycleObserver;
import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.camera.Camera1Manager;
import com.jumio.commons.camera.CameraCapabilities;
import com.jumio.commons.camera.CameraManagerConfig;
import com.jumio.commons.camera.CameraManagerInterface;
import com.jumio.commons.camera.CameraSettings;
import com.jumio.commons.camera.CaptureSettings;
import com.jumio.commons.camera.ImageData;
import com.jumio.commons.camera.Size;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.commons.utils.DeviceRotationManager;
import com.jumio.commons.utils.ScreenUtilKt;
import com.jumio.core.Controller;
import com.jumio.core.ServiceLocator;
import com.jumio.core.camera.CameraManagerModel;
import com.jumio.core.gui.DrawView;
import com.jumio.core.interfaces.ScanViewInterface;
import com.jumio.core.models.SettingsModel;
import com.jumio.core.persistence.DataManager;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.core.util.ConcurrentMutableList;
import com.jumio.core.util.ConcurrentMutableListKt;
import com.jumio.core.views.CameraScanView;
import com.jumio.sdk.JumioSDK;
import com.jumio.sdk.enums.JumioCameraFacing;
import com.jumio.sdk.exceptions.MissingPermissionException;
import com.jumio.sdk.scanpart.JumioScanPart;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import jumio.core.AbstractC40513C1;
import jumio.core.C40648d0;
import jumio.core.InterfaceC40643c0;
import jumio.core.InterfaceC40702o;
import jumio.core.ViewTreeObserverOnGlobalLayoutListenerC40631a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0092\u0001\u0093\u0001B'\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0014J\u0010\u0010[\u001a\u00020X2\u0006\u0010\f\u001a\u00020\rH\u0017J\b\u0010\\\u001a\u00020XH\u0016J\b\u0010]\u001a\u00020XH\u0002J\u0010\u0010^\u001a\u00020X2\u0006\u0010(\u001a\u00020)H\u0003J\u0010\u0010_\u001a\u00020X2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010`\u001a\u00020)2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001b\u0010a\u001a\u0004\u0018\u00010!2\n\b\u0003\u0010b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010cJ)\u0010d\u001a\u00020X2\u0006\u0010e\u001a\u00020:2\b\b\u0002\u0010f\u001a\u00020:2\b\b\u0002\u0010g\u001a\u00020:H\u0000¢\u0006\u0002\bhJ\u0015\u0010i\u001a\u00020X2\u0006\u0010j\u001a\u00020:H\u0000¢\u0006\u0002\bkJ\u0015\u0010l\u001a\u00020X2\u0006\u0010m\u001a\u00020nH\u0000¢\u0006\u0002\boJ\u0015\u0010p\u001a\u00020X2\u0006\u0010q\u001a\u00020rH\u0000¢\u0006\u0002\bsJE\u0010t\u001a\u00020X2\u0006\u0010u\u001a\u00020:2\u0016\b\u0002\u0010v\u001a\u0010\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020X\u0018\u00010w2\u0016\b\u0002\u0010y\u001a\u0010\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020X\u0018\u00010wH\u0000¢\u0006\u0002\bzJ\u0015\u0010{\u001a\u00020X2\u0006\u0010|\u001a\u00020:H\u0001¢\u0006\u0002\b}J\u001b\u0010~\u001a\u0004\u0018\u00010X2\u0006\u0010\u007f\u001a\u00020:H\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001e\u0010\u0082\u0001\u001a\u0004\u0018\u00010X2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010XH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00020X2\u0007\u0010\u008b\u0001\u001a\u00020\u0016H\u0000¢\u0006\u0003\b\u008c\u0001J\u000f\u0010\u008d\u0001\u001a\u00020XH\u0000¢\u0006\u0003\b\u008e\u0001J\t\u0010\u008f\u0001\u001a\u00020XH\u0016J\b\u0010\u007f\u001a\u00020XH\u0016J\t\u0010\u0090\u0001\u001a\u00020XH\u0016J\t\u0010\u0091\u0001\u001a\u00020XH\u0016R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\tX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0012\u00101\u001a\u000202X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0018\u00105\u001a\u000202X¦\u000e¢\u0006\f\u001a\u0004\b6\u00104\"\u0004\b7\u00108R\u0011\u00109\u001a\u00020:8F¢\u0006\u0006\u001a\u0004\b9\u0010;R&\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020=8V@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0014\u0010E\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;R$\u0010G\u001a\u00020:2\u0006\u0010<\u001a\u00020:8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bH\u0010;\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010;R\u0014\u0010L\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bM\u0010;R\u0014\u0010N\u001a\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010;R\u0016\u0010P\u001a\u0004\u0018\u00010Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR$\u0010T\u001a\u00020:2\u0006\u0010<\u001a\u00020:8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bU\u0010;\"\u0004\bV\u0010J¨\u0006\u0094\u0001"}, m90084d2 = {"Lcom/jumio/core/views/CameraScanView;", "Landroid/widget/RelativeLayout;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/jumio/core/interfaces/ScanViewInterface;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "layoutListener", "Lcom/jumio/core/views/CameraLayoutListener;", "scanOverlayView", "Lcom/jumio/core/gui/DrawView;", "cameraCallback", "Lcom/jumio/commons/camera/CameraCallbackInterface;", "userActionOverrides", "", "Lcom/jumio/core/views/CameraScanView$Companion$UserActionOverride;", "cameraScanPartInterface", "Lcom/jumio/core/interfaces/CameraScanPartInterface;", "getCameraScanPartInterface", "()Lcom/jumio/core/interfaces/CameraScanPartInterface;", "brandingLogoTopMargin", "getBrandingLogoTopMargin", "()I", "setBrandingLogoTopMargin", "(I)V", "brandingView", "Lcom/jumio/core/views/BrandingView;", "cameraSettings", "Lcom/jumio/commons/camera/CameraSettings;", "getCameraSettings$jumio_core_release", "()Lcom/jumio/commons/camera/CameraSettings;", "setCameraSettings$jumio_core_release", "(Lcom/jumio/commons/camera/CameraSettings;)V", "cameraManager", "Lcom/jumio/commons/camera/CameraManagerInterface;", "getCameraManager$jumio_core_release", "()Lcom/jumio/commons/camera/CameraManagerInterface;", "setCameraManager$jumio_core_release", "(Lcom/jumio/commons/camera/CameraManagerInterface;)V", "drawView", "getDrawView$jumio_core_release", "()Lcom/jumio/core/gui/DrawView;", "minRatio", "", "getMinRatio", "()F", "ratio", "getRatio", "setRatio", "(F)V", "isAttached", "", "()Z", "value", "Lcom/jumio/sdk/enums/JumioCameraFacing;", "cameraFacing", "getCameraFacing", "()Lcom/jumio/sdk/enums/JumioCameraFacing;", "setCameraFacing", "(Lcom/jumio/sdk/enums/JumioCameraFacing;)V", "hasMultipleCameras", "getHasMultipleCameras", "hasFlash", "getHasFlash", "extraction", "getExtraction", "setExtraction", "(Z)V", "isShutterEnabled", "isFlashOn", "isFlashOn$jumio_core_release", "isExposureAndWhiteBalanceLocked", "isExposureAndWhiteBalanceLocked$jumio_core_release", "cameraCapabilities", "Lcom/jumio/commons/camera/CameraCapabilities;", "getCameraCapabilities$jumio_core_release", "()Lcom/jumio/commons/camera/CameraCapabilities;", "collectCameraConnection", "getCollectCameraConnection$jumio_core_release", "setCollectCameraConnection$jumio_core_release", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "attach", "detach", "cameraFallback", "setupCameraUi", "initCameraManager", "selectCameraManager", "generatePoweredByLogo", "textColor", "(Ljava/lang/Integer;)Lcom/jumio/core/views/BrandingView;", "setFlash", "flash", "sendAnalytics", "isInternal", "setFlash$jumio_core_release", "setExposureAndWhiteBalanceLock", "lock", "setExposureAndWhiteBalanceLock$jumio_core_release", "adjustCameraSettings", "settings", "Lcom/jumio/commons/camera/CaptureSettings;", "adjustCameraSettings$jumio_core_release", "setShader", "shaderProvider", "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;", "setShader$jumio_core_release", "enableShader", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "onEnable", "Lkotlin/Function1;", "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;", "onRender", "enableShader$jumio_core_release", "update", "request", "update$jumio_core_release", "stopPreview", "pause", "stopPreview$jumio_core_release", "(Z)Lkotlin/Unit;", "fillImageData", "data", "Lcom/jumio/commons/camera/ImageData;", "fillImageData$jumio_core_release", "(Lcom/jumio/commons/camera/ImageData;)Lkotlin/Unit;", "captureImage", "captureImage$jumio_core_release", "()Lkotlin/Unit;", "registerUserActionOverride", "actionOverride", "registerUserActionOverride$jumio_core_release", "clearUserActionOverrides", "clearUserActionOverrides$jumio_core_release", "resume", "switchCamera", "takePicture", "ScanViewCameraCallback", "Companion", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCameraScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScanView.kt\ncom/jumio/core/views/CameraScanView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/jumio/kotlin/KotlinExtensionsKt\n*L\n1#1,507:1\n1#2:508\n17#3:509\n*S KotlinDebug\n*F\n+ 1 CameraScanView.kt\ncom/jumio/core/views/CameraScanView\n*L\n318#1:509\n*E\n"})
public abstract class CameraScanView extends RelativeLayout implements LifecycleObserver, ScanViewInterface {
    public static final float DEFAULT_FRAME_RATE_THRESHOLD = 0.8f;

    /* JADX INFO: renamed from: a */
    public JumioScanPart f14584a;

    /* JADX INFO: renamed from: b */
    public final ViewTreeObserverOnGlobalLayoutListenerC40631a0 f14585b;

    /* JADX INFO: renamed from: c */
    public DrawView f14586c;

    /* JADX INFO: renamed from: d */
    public C40648d0 f14587d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentMutableList f14588e;

    /* JADX INFO: renamed from: f */
    public int f14589f;

    /* JADX INFO: renamed from: g */
    public BrandingView f14590g;

    /* JADX INFO: renamed from: h */
    public CameraSettings f14591h;

    /* JADX INFO: renamed from: i */
    public CameraManagerInterface f14592i;

    /* JADX INFO: renamed from: j */
    public JumioCameraFacing f14593j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraScanView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public static final void m14611a(CameraScanView cameraScanView) {
        C40648d0 c40648d0 = cameraScanView.f14587d;
        if (c40648d0 != null) {
            c40648d0.f90241a.cameraAvailable();
            c40648d0.onPreviewAvailable(cameraScanView.f14591h);
        }
        CameraManagerInterface cameraManagerInterface = cameraScanView.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.startPreview();
        }
    }

    public abstract float getMinRatio();

    /* JADX INFO: renamed from: getRatio */
    public abstract float getF14760l();

    public abstract void setRatio(float f11);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraScanView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$cameraFallback(CameraScanView cameraScanView) {
        ScanPart<?> scanPart$jumio_core_release;
        Controller f14541a;
        DataManager f13603d;
        CameraManagerInterface cameraManagerInterface = cameraScanView.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.stopPreview(true);
            cameraManagerInterface.destroy();
        }
        JumioScanPart jumioScanPart = cameraScanView.f14584a;
        if (jumioScanPart != null && (scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release()) != null && (f14541a = scanPart$jumio_core_release.getF14541a()) != null && (f13603d = f14541a.getF13603d()) != null) {
            f13603d.put(CameraManagerModel.class, new CameraManagerModel(true));
        }
        Camera1Manager camera1Manager = new Camera1Manager();
        cameraScanView.setupCameraUi(camera1Manager);
        cameraScanView.m14614a(camera1Manager);
        cameraScanView.invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void enableShader$jumio_core_release$default(CameraScanView cameraScanView, boolean z11, Function1 function1, Function1 function2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enableShader");
        }
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        if ((i11 & 4) != 0) {
            function2 = null;
        }
        cameraScanView.enableShader$jumio_core_release(z11, function1, function2);
    }

    private final InterfaceC40643c0 getCameraScanPartInterface() {
        JumioScanPart jumioScanPart = this.f14584a;
        Object scanPart$jumio_core_release = jumioScanPart != null ? jumioScanPart.getScanPart$jumio_core_release() : null;
        if (scanPart$jumio_core_release instanceof InterfaceC40643c0) {
            return (InterfaceC40643c0) scanPart$jumio_core_release;
        }
        return null;
    }

    public static /* synthetic */ void setFlash$jumio_core_release$default(CameraScanView cameraScanView, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFlash");
        }
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            z13 = false;
        }
        cameraScanView.setFlash$jumio_core_release(z11, z12, z13);
    }

    public final void adjustCameraSettings$jumio_core_release(@NotNull CaptureSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.adjustCaptureSettings(settings);
        }
    }

    @Override // com.jumio.core.interfaces.ScanViewInterface
    @CallSuper
    public void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        if (isAttached() && Intrinsics.areEqual(this.f14584a, scanPart) && !this.f14591h.isEmpty() && this.f14587d != null && this.f14592i != null) {
            post(new Runnable() { // from class: y9.j
                @Override // java.lang.Runnable
                public final void run() {
                    CameraScanView.m14611a(this.f104084b);
                }
            });
            return;
        }
        detach();
        this.f14584a = scanPart;
        Object scanPart$jumio_core_release = scanPart.getScanPart$jumio_core_release();
        InterfaceC40643c0 interfaceC40643c0 = scanPart$jumio_core_release instanceof InterfaceC40643c0 ? (InterfaceC40643c0) scanPart$jumio_core_release : null;
        if (interfaceC40643c0 == null) {
            return;
        }
        interfaceC40643c0.setScanView(this);
        interfaceC40643c0.isPresented(true);
        this.f14587d = new C40648d0(this, interfaceC40643c0);
        try {
            CameraManagerInterface cameraManagerInterfaceM14609a = m14609a(scanPart);
            setupCameraUi(cameraManagerInterfaceM14609a);
            m14614a(cameraManagerInterfaceM14609a);
            invalidate();
        } catch (RuntimeException unused) {
        }
    }

    @Nullable
    public final Unit captureImage$jumio_core_release() {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface == null) {
            return null;
        }
        cameraManagerInterface.captureImage();
        return Unit.INSTANCE;
    }

    public final void clearUserActionOverrides$jumio_core_release() {
        this.f14588e.clear();
    }

    @Override // com.jumio.core.interfaces.ScanViewInterface
    public void detach() {
        this.f14585b.m89250a();
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.stopPreview(true);
            cameraManagerInterface.destroy();
        }
        this.f14592i = null;
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null) {
            cameraScanPartInterface.isPresented(false);
        }
        this.f14587d = null;
        this.f14584a = null;
    }

    public final void enableShader$jumio_core_release(boolean enable, @Nullable Function1<? super AbstractC40513C1, Unit> onEnable, @Nullable Function1<? super AbstractC40513C1, Unit> onRender) {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.enableShader(enable, onEnable, onRender);
        }
    }

    @Nullable
    public final Unit fillImageData$jumio_core_release(@NotNull ImageData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface == null) {
            return null;
        }
        cameraManagerInterface.fillImageData(data);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getBrandingLogoTopMargin, reason: from getter */
    public final int getF14589f() {
        return this.f14589f;
    }

    @Nullable
    public final CameraCapabilities getCameraCapabilities$jumio_core_release() {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            return cameraManagerInterface.getF13504v();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @NotNull
    public JumioCameraFacing getCameraFacing() {
        JumioCameraFacing jumioCameraFacing;
        JumioCameraFacing[] supportedFacing;
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface == null) {
            jumioCameraFacing = JumioCameraFacing.BACK;
        } else {
            jumioCameraFacing = cameraManagerInterface.getF13499q() ? JumioCameraFacing.FRONT : JumioCameraFacing.BACK;
            if (jumioCameraFacing == null) {
                jumioCameraFacing = JumioCameraFacing.BACK;
            }
        }
        this.f14593j = jumioCameraFacing;
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null && (supportedFacing = cameraScanPartInterface.getSupportedFacing()) != null && !ArraysKt.contains(supportedFacing, this.f14593j)) {
            JumioCameraFacing jumioCameraFacing2 = supportedFacing[0];
            this.f14593j = jumioCameraFacing2;
            CameraManagerInterface cameraManagerInterface2 = this.f14592i;
            if (cameraManagerInterface2 != null) {
                cameraManagerInterface2.setCameraFacing(jumioCameraFacing2);
            }
        }
        return this.f14593j;
    }

    @Nullable
    /* JADX INFO: renamed from: getCameraManager$jumio_core_release, reason: from getter */
    public final CameraManagerInterface getF14592i() {
        return this.f14592i;
    }

    @NotNull
    /* JADX INFO: renamed from: getCameraSettings$jumio_core_release, reason: from getter */
    public final CameraSettings getF14591h() {
        return this.f14591h;
    }

    public final boolean getCollectCameraConnection$jumio_core_release() {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            return cameraManagerInterface.getF13503u();
        }
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: getDrawView$jumio_core_release, reason: from getter */
    public final DrawView getF14586c() {
        return this.f14586c;
    }

    public boolean getHasFlash() {
        CameraCapabilities f13504v;
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        return (cameraManagerInterface == null || (f13504v = cameraManagerInterface.getF13504v()) == null || !f13504v.getHasFlash()) ? false : true;
    }

    public boolean getHasMultipleCameras() {
        CameraCapabilities f13504v;
        InterfaceC40643c0 cameraScanPartInterface;
        JumioCameraFacing[] supportedFacing;
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        return (cameraManagerInterface == null || (f13504v = cameraManagerInterface.getF13504v()) == null || !f13504v.getHasMultipleCameras() || (cameraScanPartInterface = getCameraScanPartInterface()) == null || (supportedFacing = cameraScanPartInterface.getSupportedFacing()) == null || supportedFacing.length <= 1) ? false : true;
    }

    public final boolean isExposureAndWhiteBalanceLocked$jumio_core_release() {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        return cameraManagerInterface != null && cameraManagerInterface.isExposureAndWhiteBalanceLocked();
    }

    public final boolean isFlashOn$jumio_core_release() {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        return cameraManagerInterface != null && cameraManagerInterface.getF13500r();
    }

    public void pause() {
        CameraManagerInterface cameraManagerInterface;
        CameraManagerInterface cameraManagerInterface2 = this.f14592i;
        if (cameraManagerInterface2 != null && !cameraManagerInterface2.getF13502t() && (cameraManagerInterface = this.f14592i) != null) {
            cameraManagerInterface.stopPreview(false);
        }
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null) {
            cameraScanPartInterface.isPresented(false);
        }
    }

    public final void registerUserActionOverride$jumio_core_release(@NotNull EnumC9313a actionOverride) {
        Intrinsics.checkNotNullParameter(actionOverride, "actionOverride");
        if (this.f14588e.contains(actionOverride)) {
            return;
        }
        this.f14588e.add(actionOverride);
    }

    public void resume() {
        CameraManagerInterface cameraManagerInterface;
        JumioSDK.Companion companion = JumioSDK.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!companion.hasAllRequiredPermissions(context)) {
            InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
            if (cameraScanPartInterface != null) {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                cameraScanPartInterface.cameraError(new MissingPermissionException(companion.getMissingPermissions(context2)));
                return;
            }
            return;
        }
        CameraManagerInterface cameraManagerInterface2 = this.f14592i;
        if (cameraManagerInterface2 != null && !cameraManagerInterface2.getF13502t() && (cameraManagerInterface = this.f14592i) != null) {
            cameraManagerInterface.startPreview();
        }
        InterfaceC40643c0 cameraScanPartInterface2 = getCameraScanPartInterface();
        if (cameraScanPartInterface2 != null) {
            cameraScanPartInterface2.isPresented(true);
        }
    }

    public final void setBrandingLogoTopMargin(int i11) {
        this.f14589f = i11;
    }

    public void setCameraFacing(@NotNull JumioCameraFacing value) {
        JumioCameraFacing[] supportedFacing;
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface == null || (supportedFacing = cameraScanPartInterface.getSupportedFacing()) == null || !ArraysKt.contains(supportedFacing, value)) {
            return;
        }
        this.f14593j = value;
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.setCameraFacing(value);
            Analytics.INSTANCE.add(MobileEvents.userAction$default("camera", null, value.name(), 2, null));
        }
    }

    public final void setCameraManager$jumio_core_release(@Nullable CameraManagerInterface cameraManagerInterface) {
        this.f14592i = cameraManagerInterface;
    }

    public final void setCameraSettings$jumio_core_release(@NotNull CameraSettings cameraSettings) {
        Intrinsics.checkNotNullParameter(cameraSettings, "<set-?>");
        this.f14591h = cameraSettings;
    }

    public final void setCollectCameraConnection$jumio_core_release(boolean z11) {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.setCollectCameraConnection(z11);
        }
    }

    public final void setExposureAndWhiteBalanceLock$jumio_core_release(boolean lock) {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            boolean zIsExposureAndWhiteBalanceLocked = cameraManagerInterface.isExposureAndWhiteBalanceLocked();
            if (cameraManagerInterface.getF13504v().getHasExposureAndWhiteBalanceLock()) {
                if ((zIsExposureAndWhiteBalanceLocked || !lock) && (!zIsExposureAndWhiteBalanceLocked || lock)) {
                    return;
                }
                cameraManagerInterface.setExposureAndWhiteBalanceLock(lock);
            }
        }
    }

    public final void setFlash$jumio_core_release(boolean flash, boolean sendAnalytics, boolean isInternal) {
        CameraManagerInterface cameraManagerInterface;
        if ((isInternal || !this.f14588e.contains(EnumC9313a.FLASH)) && (cameraManagerInterface = this.f14592i) != null) {
            cameraManagerInterface.setFlash(flash);
            if (sendAnalytics) {
                Analytics.INSTANCE.add(MobileEvents.userAction$default("flash", null, flash ? "ON" : "OFF", 2, null));
            }
        }
    }

    public final void setShader$jumio_core_release(@NotNull ShaderProvider shaderProvider) {
        Intrinsics.checkNotNullParameter(shaderProvider, "shaderProvider");
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface != null) {
            cameraManagerInterface.setShader(shaderProvider);
        }
    }

    @Nullable
    public final Unit stopPreview$jumio_core_release(boolean pause) {
        CameraManagerInterface cameraManagerInterface = this.f14592i;
        if (cameraManagerInterface == null) {
            return null;
        }
        cameraManagerInterface.stopPreview(pause);
        return Unit.INSTANCE;
    }

    public void switchCamera() {
        if (!this.f14588e.contains(EnumC9313a.SWITCH_CAMERA) && getHasMultipleCameras()) {
            CameraManagerInterface cameraManagerInterface = this.f14592i;
            if (cameraManagerInterface != null) {
                cameraManagerInterface.changeCamera();
            }
            Analytics.INSTANCE.add(MobileEvents.userAction$default("camera", null, getCameraFacing().name(), 2, null));
        }
    }

    @UiThread
    public final void update$jumio_core_release(boolean request) {
        DrawView drawView;
        if (request && (drawView = this.f14586c) != null) {
            drawView.requestLayout();
        }
        DrawView drawView2 = this.f14586c;
        if (drawView2 != null) {
            drawView2.invalidate();
        }
    }

    public /* synthetic */ CameraScanView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void setupCameraUi(final CameraManagerInterface cameraManager) {
        Object scanPart$jumio_core_release;
        DrawView.DrawViewInterface drawViewInterface;
        Object scanPart$jumio_core_release2;
        InterfaceC40702o interfaceC40702o;
        removeAllViews();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cameraManager.setupUiViews(context, new Function1() { // from class: y9.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CameraScanView.m14610a(this.f104079b, (View) obj);
            }
        });
        DrawView drawView = this.f14586c;
        if (drawView == null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            drawView = new DrawView(context2);
        }
        drawView.removeAllViews();
        drawView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        JumioScanPart jumioScanPart = this.f14584a;
        BrandingView brandingView = null;
        if (jumioScanPart != null) {
            scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release();
        } else {
            scanPart$jumio_core_release = null;
        }
        if (scanPart$jumio_core_release instanceof DrawView.DrawViewInterface) {
            drawViewInterface = (DrawView.DrawViewInterface) scanPart$jumio_core_release;
        } else {
            drawViewInterface = null;
        }
        drawView.setDrawViewInterface(drawViewInterface);
        this.f14586c = drawView;
        View view = this.f14590g;
        if (view == null) {
            JumioScanPart jumioScanPart2 = this.f14584a;
            if (jumioScanPart2 != null) {
                scanPart$jumio_core_release2 = jumioScanPart2.getScanPart$jumio_core_release();
            } else {
                scanPart$jumio_core_release2 = null;
            }
            if (scanPart$jumio_core_release2 instanceof InterfaceC40702o) {
                interfaceC40702o = (InterfaceC40702o) scanPart$jumio_core_release2;
            } else {
                interfaceC40702o = null;
            }
            if (interfaceC40702o != null) {
                int preferredBrandTextColor = interfaceC40702o.getPreferredBrandTextColor();
                InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
                if (cameraScanPartInterface != null && cameraScanPartInterface.isBrandingEnabled()) {
                    Context context3 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    int iDpToPx = ScreenUtilKt.dpToPx(24, context3);
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                    brandingView = new BrandingView(context4, preferredBrandTextColor);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                    int i11 = this.f14589f;
                    if (i11 > iDpToPx && i11 < brandingView.getMeasuredHeight() - (iDpToPx * 2)) {
                        layoutParams.topMargin = this.f14589f;
                    } else {
                        layoutParams.topMargin = iDpToPx;
                    }
                    brandingView.setLayoutParams(layoutParams);
                }
            }
            this.f14590g = brandingView;
            view = brandingView;
        }
        addView(this.f14586c);
        if (view != null) {
            addView(view);
        }
        setOnClickListener(new View.OnClickListener() { // from class: y9.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraScanView.m14612a(this.f104080b, cameraManager, view2);
            }
        });
        setOnTouchListener(new View.OnTouchListener() { // from class: y9.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return CameraScanView.m14613a(this.f104082b, cameraManager, view2, motionEvent);
            }
        });
    }

    public boolean getExtraction() {
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface == null || !cameraScanPartInterface.getEnableExtraction()) {
            return false;
        }
        return true;
    }

    public final boolean isAttached() {
        if (getCameraScanPartInterface() != null && this.f14592i != null) {
            return true;
        }
        return false;
    }

    public boolean isShutterEnabled() {
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null) {
            return cameraScanPartInterface.getShowShutterButton();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0036  */
    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        boolean z11;
        boolean z12;
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        boolean z13 = false;
        if (getContext().getResources().getConfiguration().orientation != 1) {
            DeviceRotationManager.Companion companion = DeviceRotationManager.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!companion.isTabletDevice(context)) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = true;
        }
        if (z11 && getF14760l() != 0.0f && getF14760l() > getMinRatio()) {
            throw new IllegalArgumentException(("Portrait ratio must be <= " + getMinRatio()).toString());
        }
        if (!z11 && getF14760l() != 0.0f && getF14760l() < getMinRatio()) {
            throw new IllegalArgumentException(("Landscape ratio must be >= " + getMinRatio()).toString());
        }
        if (mode != Integer.MIN_VALUE && mode != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            z13 = true;
        }
        if (size != 0 && z13 && getF14760l() != 0.0f) {
            size2 = (int) (size / getF14760l());
        } else if (z12 && size2 != 0 && getF14760l() != 0.0f) {
            size = (int) (getF14760l() * size2);
        } else if (z12 && z13 && getF14760l() != 0.0f) {
            throw new IllegalArgumentException("layout_width or layout_height should be set to a fixed value when ratio is used");
        }
        if ((!z12 && !z13) || getF14760l() != 0.0f) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            return;
        }
        throw new IllegalArgumentException("ratio should be set");
    }

    public void setExtraction(boolean z11) {
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null) {
            cameraScanPartInterface.setEnableExtraction(z11);
        }
    }

    public void takePicture() {
        InterfaceC40643c0 cameraScanPartInterface = getCameraScanPartInterface();
        if (cameraScanPartInterface != null) {
            cameraScanPartInterface.takePicture();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CameraScanView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14585b = new ViewTreeObserverOnGlobalLayoutListenerC40631a0();
        this.f14588e = ConcurrentMutableListKt.concurrentMutableListOf();
        this.f14591h = new CameraSettings();
        this.f14593j = JumioCameraFacing.BACK;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m14610a(CameraScanView cameraScanView, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() != null) {
            Reflection.getOrCreateKotlinClass(view.getClass()).getSimpleName();
            view.hashCode();
            return Unit.INSTANCE;
        }
        cameraScanView.addView(view);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final void m14612a(CameraScanView cameraScanView, CameraManagerInterface cameraManagerInterface, View view) {
        if (cameraScanView.f14588e.contains(EnumC9313a.FOCUS)) {
            return;
        }
        cameraManagerInterface.requestFocus(cameraScanView.getWidth() / 2, cameraScanView.getHeight() / 2);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m14613a(CameraScanView cameraScanView, CameraManagerInterface cameraManagerInterface, View view, MotionEvent motionEvent) {
        int x11 = (int) motionEvent.getX();
        int y11 = (int) motionEvent.getY();
        if (motionEvent.getAction() != 0 || cameraScanView.f14588e.contains(EnumC9313a.FOCUS)) {
            return false;
        }
        cameraManagerInterface.requestFocus(x11, y11);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m14614a(CameraManagerInterface cameraManagerInterface) {
        ViewTreeObserver viewTreeObserver;
        this.f14592i = cameraManagerInterface;
        JumioScanPart jumioScanPart = this.f14584a;
        C40648d0 c40648d0 = this.f14587d;
        if (jumioScanPart == null || c40648d0 == null) {
            return;
        }
        Object scanPart$jumio_core_release = jumioScanPart.getScanPart$jumio_core_release();
        InterfaceC40643c0 interfaceC40643c0 = scanPart$jumio_core_release instanceof InterfaceC40643c0 ? (InterfaceC40643c0) scanPart$jumio_core_release : null;
        if (interfaceC40643c0 == null) {
            return;
        }
        DeviceRotationManager f13602c = jumioScanPart.getScanPart$jumio_core_release().getF14541a().getF13602c();
        boolean zIsFlashOn$jumio_core_release = isFlashOn$jumio_core_release();
        Size previewSize = interfaceC40643c0.getPreviewSize();
        if (previewSize == null) {
            previewSize = new Size(1920, TXVodDownloadDataSource.QUALITY_1080P);
        }
        CameraManagerConfig cameraManagerConfig = new CameraManagerConfig(f13602c, zIsFlashOn$jumio_core_release, previewSize, interfaceC40643c0.getDefaultFacing(), interfaceC40643c0.getShouldUseShader());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        cameraManagerInterface.setup(context, cameraManagerConfig, c40648d0);
        ViewTreeObserverOnGlobalLayoutListenerC40631a0 viewTreeObserverOnGlobalLayoutListenerC40631a0 = this.f14585b;
        DrawView drawView = this.f14586c;
        viewTreeObserverOnGlobalLayoutListenerC40631a0.m89250a();
        viewTreeObserverOnGlobalLayoutListenerC40631a0.f90208e = drawView;
        viewTreeObserverOnGlobalLayoutListenerC40631a0.f90207d = cameraManagerInterface;
        if (drawView == null || (viewTreeObserver = drawView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC40631a0);
    }

    /* JADX INFO: renamed from: a */
    public static CameraManagerInterface m14609a(JumioScanPart jumioScanPart) {
        DataManager f13603d = jumioScanPart.getScanPart$jumio_core_release().getF14541a().getF13603d();
        if (((CameraManagerModel) f13603d.get(CameraManagerModel.class)).f13728a) {
            return new Camera1Manager();
        }
        return ((SettingsModel) f13603d.get(SettingsModel.class)).getUseCamera1() ? new Camera1Manager() : (CameraManagerInterface) ServiceLocator.INSTANCE.getServiceImplementation(CameraManagerInterface.class, new Function0() { // from class: y9.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScanView.m14608a();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static final CameraManagerInterface m14608a() {
        return new Camera1Manager();
    }
}
