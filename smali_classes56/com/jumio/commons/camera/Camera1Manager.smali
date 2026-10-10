.class public final Lcom/jumio/commons/camera/Camera1Manager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/CameraManagerInterface;
.implements Landroid/hardware/Camera$PreviewCallback;
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/commons/camera/Camera1Manager$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00fc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u0095\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u000c\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J \u0010?\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J \u0010D\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\tH\u0016J\u0010\u0010E\u001a\u00020\u00112\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010G\u001a\u00020<2\u0006\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020<2\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tH\u0016J\u0010\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020OH\u0016J$\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020<0TH\u0016J \u0010V\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\u0006\u0010W\u001a\u00020X2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010Y\u001a\u00020<2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\\\u001a\u00020]H\u0002J\u0010\u0010^\u001a\u00020<2\u0006\u0010_\u001a\u00020\u0011H\u0016J\u001c\u0010`\u001a\u00020<2\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010_\u001a\u00020\u0011H\u0002J\u0010\u0010b\u001a\u00020<2\u0006\u0010c\u001a\u00020\u0011H\u0016J\u0010\u0010d\u001a\u00020<2\u0006\u0010e\u001a\u00020fH\u0016J\u0010\u0010g\u001a\u00020<2\u0006\u0010h\u001a\u00020iH\u0016J<\u0010j\u001a\u00020<2\u0006\u0010k\u001a\u00020\u00112\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020<\u0018\u00010T2\u0014\u0010n\u001a\u0010\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020<\u0018\u00010TH\u0016J \u0010o\u001a\u00060[R\u00020\u00072\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010p\u001a\u00020qH\u0002J \u0010r\u001a\u00060[R\u00020\u00072\n\u0010a\u001a\u00060[R\u00020\u00072\u0006\u0010s\u001a\u00020tH\u0002J\u0008\u0010u\u001a\u00020<H\u0016J\u0008\u0010v\u001a\u00020<H\u0016J\u0018\u0010w\u001a\u00020<2\u0006\u0010x\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010y\u001a\u00020\t2\u000c\u0010z\u001a\u0008\u0018\u00010[R\u00020\u0007H\u0002J\u0010\u0010{\u001a\u00020<2\u0006\u0010|\u001a\u00020\u0011H\u0016J\u0008\u0010}\u001a\u00020<H\u0016J\u0008\u0010~\u001a\u00020<H\u0016J\u0008\u0010\u007f\u001a\u00020<H\u0016J\u0013\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002J\u001d\u0010\u0081\u0001\u001a\u00020\u001b2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001d\u0010\u0082\u0001\u001a\u00020\u001b2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\t\u0010\u0083\u0001\u001a\u00020<H\u0002J3\u0010\u0084\u0001\u001a\u00020<2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u00112\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0002J\u001e\u0010\u0087\u0001\u001a\u00020<2\n\u0010Z\u001a\u00060[R\u00020\u00072\u0007\u0010\u0088\u0001\u001a\u00020\u0011H\u0002J/\u0010\u0089\u0001\u001a\u00030\u008a\u00012\n\u0010Z\u001a\u00060[R\u00020\u00072\u0006\u0010B\u001a\u00020\t2\u0006\u0010C\u001a\u00020\t2\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002J\u001c\u0010\u008b\u0001\u001a\u00020\t2\u0008\u0010\u008c\u0001\u001a\u00030\u008d\u00012\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0002J\u001a\u0010\u008e\u0001\u001a\u00020\t2\u0007\u0010\u008f\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u0011H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u001e\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001b@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u001e\u0010)\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u001e\u0010+\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010*R\u001e\u0010,\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0011@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010*R\u001a\u0010.\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010*\"\u0004\u0008/\u00100R\u001a\u00101\u001a\u00020\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010*\"\u0004\u00083\u00100R\u0014\u00104\u001a\u000205X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008:\u0010*\u00a8\u0006\u0096\u0001"
    }
    d2 = {
        "Lcom/jumio/commons/camera/Camera1Manager;",
        "Lcom/jumio/commons/camera/CameraManagerInterface;",
        "Landroid/hardware/Camera$PreviewCallback;",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "<init>",
        "()V",
        "camera",
        "Landroid/hardware/Camera;",
        "cameraId",
        "",
        "callbackBuffer",
        "",
        "cameraAccessLock",
        "",
        "autoFocusCallback",
        "Landroid/hardware/Camera$AutoFocusCallback;",
        "manualFocusEnabled",
        "",
        "defaultExposureLevel",
        "executorService",
        "Ljava/util/concurrent/ExecutorService;",
        "cameraCallback",
        "Lcom/jumio/commons/camera/CameraCallbackInterface;",
        "rotationManager",
        "Lcom/jumio/commons/utils/DeviceRotationManager;",
        "enableFlashOnStart",
        "requestedSize",
        "Lcom/jumio/commons/camera/Size;",
        "hasHighResolutionSupport",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "getCameraSettings",
        "()Lcom/jumio/commons/camera/CameraSettings;",
        "frameMetadata",
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "getFrameMetadata",
        "()Lcom/jumio/commons/camera/Frame$Metadata;",
        "value",
        "previewSize",
        "getPreviewSize",
        "()Lcom/jumio/commons/camera/Size;",
        "isFrontFacing",
        "()Z",
        "isFlashOn",
        "focusing",
        "getFocusing",
        "isPausePreview",
        "setPausePreview",
        "(Z)V",
        "collectCameraConnection",
        "getCollectCameraConnection",
        "setCollectCameraConnection",
        "cameraCapabilities",
        "Lcom/jumio/commons/camera/Camera1Capabilities;",
        "getCameraCapabilities",
        "()Lcom/jumio/commons/camera/Camera1Capabilities;",
        "textureView",
        "Lcom/jumio/commons/camera/RenderTextureView;",
        "isExposureAndWhiteBalanceLocked",
        "fillImageData",
        "",
        "imageData",
        "Lcom/jumio/commons/camera/ImageData;",
        "onSurfaceTextureAvailable",
        "surface",
        "Landroid/graphics/SurfaceTexture;",
        "width",
        "height",
        "onSurfaceTextureSizeChanged",
        "onSurfaceTextureDestroyed",
        "onSurfaceTextureUpdated",
        "setCameraFacing",
        "facing",
        "Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "requestFocus",
        "x",
        "y",
        "requestMetering",
        "meteringConfig",
        "Lcom/jumio/commons/camera/MeteringConfig;",
        "setupUiViews",
        "context",
        "Landroid/content/Context;",
        "addView",
        "Lkotlin/Function1;",
        "Landroid/view/View;",
        "setup",
        "config",
        "Lcom/jumio/commons/camera/CameraManagerConfig;",
        "addAreas",
        "parameters",
        "Landroid/hardware/Camera$Parameters;",
        "focusRect",
        "Landroid/graphics/Rect;",
        "setFlash",
        "turnFlashOn",
        "getFlashMode",
        "params",
        "setExposureAndWhiteBalanceLock",
        "lock",
        "adjustCaptureSettings",
        "settings",
        "Lcom/jumio/commons/camera/CaptureSettings;",
        "setShader",
        "shaderProvider",
        "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;",
        "enableShader",
        "enable",
        "onEnable",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
        "onRender",
        "setExposureLevel",
        "level",
        "Lcom/jumio/commons/camera/ExposureLevel;",
        "setWhiteBalance",
        "whiteBalance",
        "Lcom/jumio/commons/camera/WhiteBalance;",
        "startPreview",
        "reinitCamera",
        "onPreviewFrame",
        "data",
        "getIso",
        "cameraParams",
        "stopPreview",
        "pause",
        "destroy",
        "changeCamera",
        "captureImage",
        "getCameraWithId",
        "getRequestedPreviewSize",
        "getRequestedCaptureSize",
        "initCamera",
        "initPreview",
        "isPortrait",
        "displayRotation",
        "setFocusMode",
        "useSimpleFocus",
        "calculateScaleMatrix",
        "Landroid/graphics/Matrix;",
        "calculateCameraRotation",
        "info",
        "Landroid/hardware/Camera$CameraInfo;",
        "getImageRotation",
        "deviceOrientation",
        "InitCameraRunnable",
        "SurfaceChangedRunnable",
        "RequestMeteringRunnable",
        "StopCameraPreviewRunnable",
        "ReleaseCameraRunnable",
        "Companion",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCamera1Manager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Camera1Manager.kt\ncom/jumio/commons/camera/Camera1Manager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExtensions.kt\ncom/jumio/kotlin/KotlinExtensionsKt\n*L\n1#1,882:1\n774#2:883\n865#2,2:884\n1863#2,2:887\n1#3:886\n17#4:889\n*S KotlinDebug\n*F\n+ 1 Camera1Manager.kt\ncom/jumio/commons/camera/Camera1Manager\n*L\n317#1:883\n317#1:884,2\n406#1:887,2\n364#1:889\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/commons/camera/Camera1Manager$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final FALLBACK_AUTO_FOCUS_LIST:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final FALLBACK_PREVIEW_FORMAT_LIST:[Ljava/lang/String;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Landroid/hardware/Camera;

.field public b:I

.field public c:[B

.field public final d:Ljava/lang/Object;

.field public final e:Landroid/hardware/Camera$AutoFocusCallback;

.field public f:Z

.field public g:I

.field public final h:Ljava/util/concurrent/ExecutorService;

.field public i:Lcom/jumio/commons/camera/CameraCallbackInterface;

.field public j:Lcom/jumio/commons/utils/DeviceRotationManager;

.field public k:Z

.field public l:Lcom/jumio/commons/camera/Size;

.field public m:Z

.field public final n:Lcom/jumio/commons/camera/CameraSettings;

.field public final o:Lcom/jumio/commons/camera/Frame$Metadata;

.field public p:Lcom/jumio/commons/camera/Size;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public final v:Lcom/jumio/commons/camera/Camera1Capabilities;

.field public w:Ljumio/core/j3;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/commons/camera/Camera1Manager$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/commons/camera/Camera1Manager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/commons/camera/Camera1Manager;->Companion:Lcom/jumio/commons/camera/Camera1Manager$Companion;

    .line 9
    .line 10
    const-string v30, "GT-N7005"

    .line 11
    .line 12
    const-string v31, "DROIDX"

    .line 13
    .line 14
    const-string v2, "GT-I9100"

    .line 15
    .line 16
    const-string v3, "SPH-D710"

    .line 17
    .line 18
    const-string v4, "SGH-T989"

    .line 19
    .line 20
    const-string v5, "SCH-I605"

    .line 21
    .line 22
    const-string v6, "SAMSUNG-SGH-I727"

    .line 23
    .line 24
    const-string v7, "GT-I9100G"

    .line 25
    .line 26
    const-string v8, "SAMSUNG-SGH-I777"

    .line 27
    .line 28
    const-string v9, "SPH-D710BST"

    .line 29
    .line 30
    const-string v10, "GT-I9100P"

    .line 31
    .line 32
    const-string v11, "GT-I9100T"

    .line 33
    .line 34
    const-string v12, "SGH-S959G"

    .line 35
    .line 36
    const-string v13, "SGH-T989D"

    .line 37
    .line 38
    const-string v14, "SGH-I727R"

    .line 39
    .line 40
    const-string v15, "GT-I9100M"

    .line 41
    .line 42
    const-string v16, "SPH-D710VMUB"

    .line 43
    .line 44
    const-string v17, "SAMSUNG-SGH-T989"

    .line 45
    .line 46
    const-string v18, "SGH-I757M"

    .line 47
    .line 48
    const-string v19, "SGH-I777"

    .line 49
    .line 50
    const-string v20, "GT-I9210"

    .line 51
    .line 52
    const-string v21, "GT-I9105P"

    .line 53
    .line 54
    const-string v22, "GT-I9105"

    .line 55
    .line 56
    const-string v23, "GT-I9105I"

    .line 57
    .line 58
    const-string v24, "GT-I9105G"

    .line 59
    .line 60
    const-string v25, "SAMSUNG-SGH-I717"

    .line 61
    .line 62
    const-string v26, "SGH-T879"

    .line 63
    .line 64
    const-string v27, "SGH-I717M"

    .line 65
    .line 66
    const-string v28, "SGH-I717R"

    .line 67
    .line 68
    const-string v29, "GT-N7000"

    .line 69
    .line 70
    .line 71
    filled-new-array/range {v2 .. v31}, [Ljava/lang/String;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    sput-object v0, Lcom/jumio/commons/camera/Camera1Manager;->FALLBACK_AUTO_FOCUS_LIST:Ljava/util/List;

    .line 79
    .line 80
    const-string v0, "Nexus 7"

    .line 81
    .line 82
    .line 83
    filled-new-array {v0}, [Ljava/lang/String;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    sput-object v0, Lcom/jumio/commons/camera/Camera1Manager;->FALLBACK_PREVIEW_FORMAT_LIST:[Ljava/lang/String;

    .line 87
    return-void
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public constructor <init>()V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    new-instance v1, Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v1, Lf9/g;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v0}, Lf9/g;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 18
    .line 19
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->e:Landroid/hardware/Camera$AutoFocusCallback;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    const-string v2, "newSingleThreadExecutor(...)"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    new-instance v1, Lcom/jumio/commons/camera/CameraSettings;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1}, Lcom/jumio/commons/camera/CameraSettings;-><init>()V

    .line 36
    .line 37
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->n:Lcom/jumio/commons/camera/CameraSettings;

    .line 38
    .line 39
    new-instance v2, Lcom/jumio/commons/camera/Frame$Metadata;

    .line 40
    .line 41
    const/16 v19, 0x3fff

    .line 42
    .line 43
    const/16 v20, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    .line 48
    const-wide/16 v6, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    .line 56
    const-wide/16 v14, 0x0

    .line 57
    .line 58
    const/16 v16, 0x0

    .line 59
    .line 60
    const/16 v17, 0x0

    .line 61
    .line 62
    const/16 v18, 0x0

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v2 .. v20}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 66
    .line 67
    iput-object v2, v0, Lcom/jumio/commons/camera/Camera1Manager;->o:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 68
    .line 69
    new-instance v1, Lcom/jumio/commons/camera/Size;

    .line 70
    const/4 v2, 0x0

    .line 71
    .line 72
    .line 73
    invoke-direct {v1, v2, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 74
    .line 75
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->p:Lcom/jumio/commons/camera/Size;

    .line 76
    const/4 v1, 0x1

    .line 77
    .line 78
    iput-boolean v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->u:Z

    .line 79
    .line 80
    new-instance v1, Lcom/jumio/commons/camera/Camera1Capabilities;

    .line 81
    .line 82
    new-instance v2, Ljumio/core/T;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, v0}, Ljumio/core/T;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 86
    .line 87
    new-instance v3, Lf9/h;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3, v0}, Lf9/h;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, v2, v3}, Lcom/jumio/commons/camera/Camera1Capabilities;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    iput-object v1, v0, Lcom/jumio/commons/camera/Camera1Manager;->v:Lcom/jumio/commons/camera/Camera1Capabilities;

    .line 96
    return-void
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public static a(Landroid/hardware/Camera$Parameters;)I
    .locals 3

    .line 28
    :try_start_0
    const-string v0, "iso"

    const-string v1, "iso-speed"

    const-string v2, "nv-picture-iso"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz p0, :cond_0

    .line 30
    const-string v2, "<this>"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "key"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, v1}, Landroid/hardware/Camera$Parameters;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 32
    invoke-virtual {p0, v1}, Landroid/hardware/Camera$Parameters;->getInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Landroid/hardware/Camera$Parameters;Lcom/jumio/commons/camera/WhiteBalance;)Landroid/hardware/Camera$Parameters;
    .locals 5

    .line 13
    :try_start_0
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedWhiteBalance()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "auto"

    if-eqz v0, :cond_1

    .line 14
    :try_start_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 16
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 17
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    .line 18
    :cond_1
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 19
    :cond_2
    sget-object v0, Ljumio/core/S;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 20
    :pswitch_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x5

    rem-int/2addr v0, p1

    if-ltz v0, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_3

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_3
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 21
    :pswitch_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x4

    rem-int/2addr v0, p1

    if-ltz v0, :cond_4

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_4

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_4
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 22
    :pswitch_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x3

    rem-int/2addr v0, p1

    if-ltz v0, :cond_5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_5

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_5
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 23
    :pswitch_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    rem-int/2addr v0, p1

    if-ltz v0, :cond_6

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_6

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_6
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 24
    :pswitch_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x1

    rem-int/2addr v0, p1

    if-ltz v0, :cond_7

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-ge v0, p1, :cond_7

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_7
    check-cast v1, Ljava/lang/String;

    goto :goto_1

    .line 25
    :pswitch_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_8

    const/4 p1, 0x0

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    :cond_8
    check-cast v1, Ljava/lang/String;

    .line 26
    :goto_1
    :pswitch_6
    invoke-virtual {p0, v1}, Landroid/hardware/Camera$Parameters;->setWhiteBalance(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    .line 27
    :goto_2
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final a(Lcom/jumio/commons/camera/Camera1Manager;)Landroid/hardware/Camera;
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 6
    monitor-exit v0

    throw p0
.end method

.method public static final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Landroid/hardware/Camera$Parameters;Z)V
    .locals 2

    .line 7
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 8
    const-string p1, "off"

    invoke-virtual {p0, p1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    const-string v1, "torch"

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v0, :cond_1

    .line 10
    invoke-virtual {p0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    return-void

    .line 11
    :cond_1
    invoke-virtual {p0}, Landroid/hardware/Camera$Parameters;->getSupportedFlashModes()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v1, "on"

    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-ne p1, v0, :cond_2

    .line 12
    invoke-virtual {p0, v1}, Landroid/hardware/Camera$Parameters;->setFlashMode(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/Camera1Manager;Landroid/graphics/Matrix;)V
    .locals 2

    .line 91
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V

    .line 92
    :cond_0
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    :cond_1
    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/Camera1Manager;Lkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0

    .line 57
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    if-eqz p0, :cond_0

    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    invoke-interface {p0, p1}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onCameraError(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/Camera1Manager;ZLandroid/hardware/Camera;)V
    .locals 0

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->s:Z

    return-void
.end method

.method public static final a(Lcom/jumio/commons/camera/Camera1Manager;[BLandroid/hardware/Camera;)V
    .locals 22

    .line 33
    new-instance v1, Lcom/jumio/commons/camera/Size;

    invoke-virtual/range {p2 .. p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual {v0}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v0

    iget v0, v0, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual/range {p2 .. p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getPictureSize()Landroid/hardware/Camera$Size;

    move-result-object v2

    iget v2, v2, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v1, v0, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 34
    invoke-virtual/range {p2 .. p2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/hardware/Camera$Parameters;)I

    move-result v3

    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/jumio/commons/camera/Camera1Manager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getRotation()I

    move-result v2

    .line 36
    invoke-virtual/range {p0 .. p0}, Lcom/jumio/commons/camera/Camera1Manager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->getOrientation()I

    move-result v9

    .line 37
    invoke-virtual/range {p0 .. p0}, Lcom/jumio/commons/camera/Camera1Manager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Frame$Metadata;->isPortrait()Z

    move-result v10

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    .line 39
    sget-object v0, Lcom/jumio/core/camera/CameraConnectionData;->Companion:Lcom/jumio/core/camera/CameraConnectionData$Companion;

    invoke-virtual/range {p0 .. p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCollectCameraConnection()Z

    move-result v4

    invoke-virtual {v0, v4}, Lcom/jumio/core/camera/CameraConnectionData$Companion;->get(Z)Lcom/jumio/core/camera/CameraConnectionData;

    move-result-object v15

    .line 40
    new-instance v0, Lcom/jumio/commons/camera/Frame$Metadata;

    const/16 v17, 0x2878

    const/16 v18, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v11, 0x100

    const/4 v14, 0x0

    const/16 v16, 0x0

    .line 41
    invoke-direct/range {v0 .. v18}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v0

    move-object/from16 v0, p0

    .line 42
    iget-object v0, v0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    if-eqz v0, :cond_0

    new-instance v16, Lcom/jumio/commons/camera/Frame;

    invoke-static/range {p1 .. p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, p1

    invoke-direct/range {v16 .. v21}, Lcom/jumio/commons/camera/Frame;-><init>([BLcom/jumio/commons/camera/Frame$Metadata;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onCaptureFrame(Lcom/jumio/commons/camera/Frame;)V

    .line 43
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/hardware/Camera;->startPreview()V

    return-void
.end method

.method public static final access$addAreas(Lcom/jumio/commons/camera/Camera1Manager;Landroid/hardware/Camera$Parameters;Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    new-instance p0, Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    new-instance v0, Landroid/hardware/Camera$Area;

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p2, v1}, Landroid/hardware/Camera$Area;-><init>(Landroid/graphics/Rect;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getMaxNumFocusAreas()I

    .line 21
    move-result p2

    .line 22
    .line 23
    if-lez p2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setFocusAreas(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getMaxNumMeteringAreas()I

    .line 30
    move-result p2

    .line 31
    .line 32
    if-lez p2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p0}, Landroid/hardware/Camera$Parameters;->setMeteringAreas(Ljava/util/List;)V

    .line 36
    :cond_1
    return-void
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public static final synthetic access$getAutoFocusCallback$p(Lcom/jumio/commons/camera/Camera1Manager;)Landroid/hardware/Camera$AutoFocusCallback;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->e:Landroid/hardware/Camera$AutoFocusCallback;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getCamera$p(Lcom/jumio/commons/camera/Camera1Manager;)Landroid/hardware/Camera;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getCameraAccessLock$p(Lcom/jumio/commons/camera/Camera1Manager;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getCameraCallback$p(Lcom/jumio/commons/camera/Camera1Manager;)Lcom/jumio/commons/camera/CameraCallbackInterface;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getHasHighResolutionSupport$p(Lcom/jumio/commons/camera/Camera1Manager;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->m:Z

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getManualFocusEnabled$p(Lcom/jumio/commons/camera/Camera1Manager;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->f:Z

    .line 3
    return p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$getTextureView$p(Lcom/jumio/commons/camera/Camera1Manager;)Ljumio/core/j3;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 3
    return-object p0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$initCamera(Lcom/jumio/commons/camera/Camera1Manager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->b()V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static final synthetic access$initPreview(Lcom/jumio/commons/camera/Camera1Manager;Landroid/graphics/SurfaceTexture;IIZI)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/graphics/SurfaceTexture;IIZI)V

    .line 4
    return-void
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
.end method

.method public static final synthetic access$setCallbackBuffer$p(Lcom/jumio/commons/camera/Camera1Manager;[B)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->c:[B

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final synthetic access$setCamera$p(Lcom/jumio/commons/camera/Camera1Manager;Landroid/hardware/Camera;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final synthetic access$setFocusing$p(Lcom/jumio/commons/camera/Camera1Manager;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->s:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final synthetic access$setHasHighResolutionSupport$p(Lcom/jumio/commons/camera/Camera1Manager;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->m:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public static final b(Lcom/jumio/commons/camera/Camera1Manager;)V
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onCameraAvailable()V

    :cond_0
    return-void
.end method

.method public static final c(Lcom/jumio/commons/camera/Camera1Manager;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 8
    move-result-object v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 22
    move-result v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 26
    move-result v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1, v2, v0}, Ljumio/core/j3;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V

    .line 30
    :cond_1
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method


# virtual methods
.method public final a(Landroid/hardware/Camera$Parameters;IIZ)Landroid/graphics/Matrix;
    .locals 7

    .line 93
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->l:Lcom/jumio/commons/camera/Size;

    if-nez v0, :cond_0

    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getFHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    move-result-object v0

    .line 94
    :cond_0
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/Camera$Size;

    .line 95
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPreviewSizes()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/Camera$Size;

    .line 96
    iget v5, v4, Landroid/hardware/Camera$Size;->width:I

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v6

    if-lt v5, v6, :cond_2

    iget v5, v4, Landroid/hardware/Camera$Size;->height:I

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v6

    if-lt v5, v6, :cond_2

    goto :goto_1

    .line 97
    :cond_2
    iget v5, v4, Landroid/hardware/Camera$Size;->width:I

    iget v6, v1, Landroid/hardware/Camera$Size;->width:I

    if-lt v5, v6, :cond_1

    iget v5, v4, Landroid/hardware/Camera$Size;->height:I

    iget v6, v1, Landroid/hardware/Camera$Size;->height:I

    if-lt v5, v6, :cond_1

    :goto_1
    move-object v1, v4

    goto :goto_0

    .line 98
    :cond_3
    new-instance v0, Lcom/jumio/commons/camera/Size;

    iget v3, v1, Landroid/hardware/Camera$Size;->width:I

    iget v1, v1, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v0, v3, v1}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 99
    iput-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->p:Lcom/jumio/commons/camera/Size;

    .line 100
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    move-result-object v0

    .line 101
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v1

    const-string v3, "getSupportedPictureSizes(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Landroid/hardware/Camera$Size;

    .line 102
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v5

    iget v6, v4, Landroid/hardware/Camera$Size;->width:I

    if-ne v5, v6, :cond_4

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v5

    iget v4, v4, Landroid/hardware/Camera$Size;->height:I

    if-ne v5, v4, :cond_4

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_6

    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    move v1, v2

    .line 103
    :goto_3
    iput-boolean v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->m:Z

    .line 104
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/commons/camera/Camera1Capabilities;->getHasHighResolutionSupport()Z

    move-result v1

    if-eqz v1, :cond_7

    goto :goto_4

    .line 105
    :cond_7
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedPictureSizes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/Camera$Size;

    new-instance v1, Lcom/jumio/commons/camera/Size;

    iget v3, v0, Landroid/hardware/Camera$Size;->width:I

    iget v0, v0, Landroid/hardware/Camera$Size;->height:I

    invoke-direct {v1, v3, v0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    move-object v0, v1

    :goto_4
    if-le p2, p3, :cond_8

    int-to-float v1, p2

    int-to-float v3, p3

    :goto_5
    div-float/2addr v1, v3

    goto :goto_6

    :cond_8
    int-to-float v1, p3

    int-to-float v3, p2

    goto :goto_5

    .line 106
    :goto_6
    :try_start_0
    const-string v3, "metering"

    const-string v4, "center"

    invoke-virtual {p1, v3, v4}, Landroid/hardware/Camera$Parameters;->set(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 107
    :catch_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    .line 108
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v5

    invoke-virtual {v5}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v5

    invoke-virtual {p1, v4, v5}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V

    .line 109
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1, v4, v0}, Landroid/hardware/Camera$Parameters;->setPictureSize(II)V

    const/high16 p1, 0x3f800000    # 1.0f

    cmpg-float v0, v3, p1

    if-nez v0, :cond_a

    .line 110
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object p1

    new-instance p4, Lcom/jumio/commons/camera/Size;

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v1

    invoke-direct {p4, v0, v1}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {p1, p4}, Lcom/jumio/commons/camera/CameraSettings;->setPreview(Lcom/jumio/commons/camera/Size;)V

    if-le p2, p3, :cond_9

    move v2, p2

    goto :goto_7

    :cond_9
    move v2, p3

    :goto_7
    int-to-float p1, v2

    int-to-float p4, p2

    div-float p4, p1, p4

    int-to-float v0, p3

    div-float/2addr p1, v0

    move v0, p4

    move p4, p1

    move p1, v0

    :goto_8
    move v0, v2

    goto/16 :goto_b

    :cond_a
    if-eqz p4, :cond_c

    .line 111
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object p4

    new-instance v0, Lcom/jumio/commons/camera/Size;

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v5

    invoke-virtual {v5}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v5

    invoke-direct {v0, v4, v5}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {p4, v0}, Lcom/jumio/commons/camera/CameraSettings;->setPreview(Lcom/jumio/commons/camera/Size;)V

    cmpl-float p4, v3, v1

    if-ltz p4, :cond_b

    int-to-float p4, p2

    mul-float/2addr v3, p4

    float-to-int v2, v3

    :goto_9
    int-to-float p4, v2

    int-to-float v0, p3

    div-float/2addr p4, v0

    move v0, v2

    move v2, p2

    goto :goto_b

    :cond_b
    cmpg-float p4, v3, v1

    if-gez p4, :cond_e

    int-to-float p4, p3

    div-float/2addr p4, v3

    float-to-int v2, p4

    :goto_a
    int-to-float p4, v2

    int-to-float v0, p2

    div-float/2addr p4, v0

    move v0, p4

    move p4, p1

    move p1, v0

    move v0, p3

    goto :goto_b

    .line 112
    :cond_c
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object p4

    new-instance v0, Lcom/jumio/commons/camera/Size;

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v5

    invoke-virtual {v5}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v5

    invoke-direct {v0, v4, v5}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {p4, v0}, Lcom/jumio/commons/camera/CameraSettings;->setPreview(Lcom/jumio/commons/camera/Size;)V

    cmpg-float p4, v3, v1

    if-gtz p4, :cond_d

    int-to-float p4, p2

    div-float/2addr p4, v3

    float-to-int v2, p4

    goto :goto_9

    :cond_d
    cmpl-float p4, v3, v1

    if-lez p4, :cond_e

    int-to-float p4, p3

    mul-float/2addr v3, p4

    float-to-int v2, v3

    goto :goto_a

    :cond_e
    move p4, p1

    goto :goto_8

    .line 113
    :goto_b
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object v1

    new-instance v3, Lcom/jumio/commons/camera/Size;

    invoke-direct {v3, v2, v0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {v1, v3}, Lcom/jumio/commons/camera/CameraSettings;->setScaledPreview(Lcom/jumio/commons/camera/Size;)V

    .line 114
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    if-eqz v0, :cond_f

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljumio/core/j3;->setFrameSize(Lcom/jumio/commons/camera/Size;)V

    .line 115
    :cond_f
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    int-to-float p2, p2

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr p2, v1

    int-to-float p3, p3

    div-float/2addr p3, v1

    .line 116
    invoke-virtual {v0, p1, p4, p2, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    return-object v0
.end method

.method public final a(I)Landroid/hardware/Camera;
    .locals 9

    .line 44
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_1

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, p1

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    .line 45
    :goto_1
    iput v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 46
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 47
    :try_start_0
    invoke-static {p1, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v2

    .line 48
    invoke-static {v2}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 49
    :goto_2
    iget v0, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    move v1, v2

    :cond_2
    iput-boolean v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->q:Z

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 51
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const/4 v3, 0x0

    :goto_3
    move-object v4, v3

    :goto_4
    if-nez v4, :cond_3

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v0

    const-wide/16 v7, 0x7d0

    cmp-long v5, v5, v7

    if-gtz v5, :cond_3

    .line 53
    :try_start_1
    invoke-static {p1}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v4

    .line 54
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_3

    :cond_3
    if-nez v4, :cond_4

    .line 55
    iget-object p1, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz p1, :cond_4

    .line 56
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    if-eqz p1, :cond_4

    new-instance v0, Lf9/b;

    invoke-direct {v0, p0, v2}, Lf9/b;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_4
    return-object v4
.end method

.method public final a(Landroid/graphics/SurfaceTexture;IIZI)V
    .locals 10

    .line 58
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 59
    :try_start_0
    iget-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_8

    .line 60
    :try_start_1
    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 61
    :try_start_2
    const-string v2, "DefaultCameraManager"

    const-string v3, "Exception in setPreviewTexture()"

    invoke-static {v2, v3, p1}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    :goto_0
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p1

    .line 63
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v1, Lcom/jumio/commons/camera/Camera1Manager;->FALLBACK_AUTO_FOCUS_LIST:Ljava/util/List;

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0, p1, v1}, Lcom/jumio/commons/camera/Camera1Manager;->b(Landroid/hardware/Camera$Parameters;Z)V

    .line 64
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/hardware/Camera$Parameters;IIZ)Landroid/graphics/Matrix;

    move-result-object v1

    .line 65
    new-instance v2, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v2}, Landroid/hardware/Camera$CameraInfo;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    :try_start_3
    iget v3, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    invoke-static {v3, v2}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception v3

    .line 67
    :try_start_4
    invoke-static {v3}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    :goto_1
    const/4 v3, 0x3

    const/16 v4, 0x5a

    const/4 v5, 0x1

    if-eq p5, v5, :cond_2

    const/4 v6, 0x2

    if-eq p5, v6, :cond_1

    if-eq p5, v3, :cond_0

    const/4 p5, 0x0

    goto :goto_2

    :cond_0
    const/16 p5, 0x10e

    goto :goto_2

    :cond_1
    const/16 p5, 0xb4

    goto :goto_2

    :cond_2
    move p5, v4

    .line 68
    :goto_2
    iget v6, v2, Landroid/hardware/Camera$CameraInfo;->facing:I

    if-ne v6, v5, :cond_3

    .line 69
    iget v6, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    add-int/2addr v6, p5

    rem-int/lit16 v6, v6, 0x168

    rsub-int p5, v6, 0x168

    .line 70
    rem-int/lit16 p5, p5, 0x168

    goto :goto_3

    .line 71
    :cond_3
    iget v6, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    sub-int/2addr v6, p5

    add-int/lit16 v6, v6, 0x168

    rem-int/lit16 p5, v6, 0x168

    .line 72
    :goto_3
    iget-object v6, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    if-eqz v6, :cond_4

    invoke-virtual {v6, p5}, Landroid/hardware/Camera;->setDisplayOrientation(I)V

    .line 73
    :cond_4
    iget-object v6, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    if-eqz v6, :cond_5

    invoke-virtual {v6, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 74
    :cond_5
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    move-result-object v6

    .line 75
    new-instance v7, Lcom/jumio/commons/camera/Size;

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v8

    invoke-virtual {v8}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v8

    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v9

    invoke-direct {v7, v8, v9}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {v6, v7}, Lcom/jumio/commons/camera/Frame$Metadata;->setSize(Lcom/jumio/commons/camera/Size;)V

    .line 76
    invoke-virtual {v6, p5}, Lcom/jumio/commons/camera/Frame$Metadata;->setOrientation(I)V

    .line 77
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isFrontFacing()Z

    move-result v7

    .line 78
    div-int/2addr p5, v4

    if-eqz v7, :cond_7

    if-eq p5, v5, :cond_6

    if-ne p5, v3, :cond_7

    :cond_6
    add-int/lit8 p5, p5, 0x2

    .line 79
    rem-int/lit8 p5, p5, 0x4

    :cond_7
    mul-int/2addr p5, v4

    .line 80
    invoke-virtual {v6, p5}, Lcom/jumio/commons/camera/Frame$Metadata;->setRotation(I)V

    .line 81
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getPreviewFormat()I

    move-result p1

    invoke-virtual {v6, p1}, Lcom/jumio/commons/camera/Frame$Metadata;->setImageFormat(I)V

    .line 82
    invoke-virtual {v6, p4}, Lcom/jumio/commons/camera/Frame$Metadata;->setPortrait(Z)V

    .line 83
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object p1

    .line 84
    new-instance p4, Lcom/jumio/commons/camera/Size;

    invoke-direct {p4, p2, p3}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    invoke-virtual {p1, p4}, Lcom/jumio/commons/camera/CameraSettings;->setSurface(Lcom/jumio/commons/camera/Size;)V

    .line 85
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isFrontFacing()Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/jumio/commons/camera/CameraSettings;->setFrontFacing(Z)V

    .line 86
    iget p2, v2, Landroid/hardware/Camera$CameraInfo;->orientation:I

    invoke-virtual {p1, p2}, Lcom/jumio/commons/camera/CameraSettings;->setSensorRotation(I)V

    .line 87
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/jumio/commons/camera/CameraSettings;->setCapabilities(Lcom/jumio/commons/camera/CameraCapabilities;)V

    .line 88
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    if-eqz p1, :cond_8

    new-instance p2, Lf9/f;

    invoke-direct {p2, p0, v1}, Lf9/f;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Landroid/graphics/Matrix;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 89
    :cond_8
    monitor-exit v0

    return-void

    .line 90
    :goto_4
    monitor-exit v0

    throw p1
.end method

.method public adjustCaptureSettings(Lcom/jumio/commons/camera/CaptureSettings;)V
    .locals 5
    .param p1    # Lcom/jumio/commons/camera/CaptureSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "settings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getLevel()Lcom/jumio/commons/camera/ExposureLevel;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getExposureCompensationStep()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    :try_start_1
    sget-object v4, Ljumio/core/S;->a:[I

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result v3

    .line 33
    .line 34
    aget v3, v4, v3

    .line 35
    const/4 v4, 0x1

    .line 36
    .line 37
    if-eq v3, v4, :cond_2

    .line 38
    const/4 v4, 0x2

    .line 39
    .line 40
    if-eq v3, v4, :cond_2

    .line 41
    const/4 v4, 0x3

    .line 42
    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    const/4 v4, 0x4

    .line 45
    .line 46
    if-ne v3, v4, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getMaxExposureCompensation()I

    .line 50
    move-result v3

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :catch_0
    move-exception v3

    .line 55
    goto :goto_1

    .line 56
    .line 57
    :cond_0
    new-instance v3, Lkotlin/NoWhenBranchMatchedException;

    .line 58
    .line 59
    .line 60
    invoke-direct {v3}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 61
    throw v3

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getMinExposureCompensation()I

    .line 65
    move-result v3

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_2
    iget v3, p0, Lcom/jumio/commons/camera/Camera1Manager;->g:I

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v2, v3}, Landroid/hardware/Camera$Parameters;->setExposureCompensation(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    goto :goto_2

    .line 73
    .line 74
    .line 75
    :goto_1
    :try_start_2
    invoke-static {v3}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getWhiteBalance()Lcom/jumio/commons/camera/WhiteBalance;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-static {v2, p1}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/hardware/Camera$Parameters;Lcom/jumio/commons/camera/WhiteBalance;)Landroid/hardware/Camera$Parameters;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, p1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    .line 87
    .line 88
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    :cond_3
    monitor-exit v0

    .line 90
    return-void

    .line 91
    :goto_3
    monitor-exit v0

    .line 92
    throw p1
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    iget v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    invoke-virtual {p0, v1}, Lcom/jumio/commons/camera/Camera1Manager;->a(I)Landroid/hardware/Camera;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/Camera$Parameters;->getExposureCompensation()I

    move-result v2

    iput v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->g:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    .line 4
    :goto_0
    iput-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/commons/camera/Camera1Capabilities;->getHasFlash()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->k:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/Camera1Manager;->setFlash(Z)V

    .line 10
    :cond_1
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    if-eqz v0, :cond_2

    new-instance v1, Lf9/e;

    invoke-direct {v1, p0}, Lf9/e;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void

    .line 12
    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final b(Landroid/hardware/Camera$Parameters;Z)V
    .locals 4

    .line 14
    invoke-virtual {p1}, Landroid/hardware/Camera$Parameters;->getSupportedFocusModes()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 15
    const-string v2, "continuous-picture"

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 16
    invoke-virtual {p1, v2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 17
    iput-boolean v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->f:Z

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 18
    const-string p2, "continuous-video"

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 19
    invoke-virtual {p1, p2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 20
    iput-boolean v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->f:Z

    return-void

    .line 21
    :cond_1
    const-string p2, "auto"

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 22
    invoke-virtual {p1, p2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 23
    iput-boolean v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->f:Z

    return-void

    .line 24
    :cond_2
    const-string p2, "macro"

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 25
    invoke-virtual {p1, p2}, Landroid/hardware/Camera$Parameters;->setFocusMode(Ljava/lang/String;)V

    .line 26
    iput-boolean v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->f:Z

    :cond_3
    return-void
.end method

.method public captureImage()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v2, Lf9/c;

    .line 8
    .line 9
    .line 10
    invoke-direct {v2}, Lf9/c;-><init>()V

    .line 11
    .line 12
    new-instance v3, Lf9/d;

    .line 13
    .line 14
    .line 15
    invoke-direct {v3, p0}, Lf9/d;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2, v1, v3}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onCaptureFrame(Lcom/jumio/commons/camera/Frame;)V

    .line 27
    :cond_1
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public changeCamera()V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

    .line 7
    goto :goto_2

    .line 8
    .line 9
    :cond_0
    iget v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    .line 13
    iput v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 14
    .line 15
    if-lt v1, v0, :cond_1

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    .line 24
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->reinitCamera()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :goto_1
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 29
    :goto_2
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public declared-synchronized destroy()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    new-instance v1, Ljumio/core/N;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljumio/core/N;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public enableShader(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljumio/core/C1;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/core/j3;->c:Ljumio/core/U;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->enableShader(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public fillImageData(Lcom/jumio/commons/camera/ImageData;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/ImageData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "imageData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isFrontFacing()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/jumio/commons/camera/ImageData$CameraPosition;->FRONT:Lcom/jumio/commons/camera/ImageData$CameraPosition;

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/jumio/commons/camera/ImageData$CameraPosition;->BACK:Lcom/jumio/commons/camera/ImageData$CameraPosition;

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p1, v0}, Lcom/jumio/commons/camera/ImageData;->setCameraPosition(Lcom/jumio/commons/camera/ImageData$CameraPosition;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/jumio/commons/utils/DeviceRotationManager;->getScreenOrientation()Lcom/jumio/commons/enums/ScreenAngle;

    .line 27
    move-result-object v0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    .line 31
    .line 32
    :goto_1
    invoke-virtual {p1, v0}, Lcom/jumio/commons/camera/ImageData;->setOrientationMode(Lcom/jumio/commons/enums/ScreenAngle;)V

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->v:Lcom/jumio/commons/camera/Camera1Capabilities;

    return-object v0
.end method

.method public bridge synthetic getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;

    move-result-object v0

    return-object v0
.end method

.method public getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->n:Lcom/jumio/commons/camera/CameraSettings;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getCollectCameraConnection()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->u:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getFocusing()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->s:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->o:Lcom/jumio/commons/camera/Frame$Metadata;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getPreviewSize()Lcom/jumio/commons/camera/Size;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->p:Lcom/jumio/commons/camera/Size;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public isExposureAndWhiteBalanceLocked()Z
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    .line 11
    :try_start_1
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getAutoExposureLock()Z

    .line 16
    move-result v3

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/hardware/Camera$Parameters;->getAutoWhiteBalanceLock()Z

    .line 22
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    const/4 v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_2

    .line 29
    :catch_0
    move-exception v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    monitor-exit v0

    .line 32
    return v2

    .line 33
    .line 34
    .line 35
    :goto_1
    :try_start_2
    invoke-static {v1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return v2

    .line 40
    :goto_2
    monitor-exit v0

    .line 41
    throw v1
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public isFlashOn()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->r:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public isFrontFacing()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->q:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public isPausePreview()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->t:Z

    .line 3
    return v0
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 23
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/hardware/Camera;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in Java"
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    const-string v3, "data"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "camera"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v3, v1, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Camera1Manager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    const/16 v21, 0x3fff

    .line 27
    .line 28
    const/16 v22, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    .line 33
    const-wide/16 v8, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    .line 41
    const-wide/16 v16, 0x0

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x0

    .line 46
    .line 47
    const/16 v20, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v4 .. v22}, Lcom/jumio/commons/camera/Frame$Metadata;->copy$default(Lcom/jumio/commons/camera/Frame$Metadata;Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILjava/lang/Object;)Lcom/jumio/commons/camera/Frame$Metadata;

    .line 51
    move-result-object v4

    .line 52
    const/4 v5, 0x0

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4, v5}, Lcom/jumio/commons/camera/Frame$Metadata;->setIso(I)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    invoke-virtual {v2}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-static {v5}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/hardware/Camera$Parameters;)I

    .line 63
    move-result v5

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Lcom/jumio/commons/camera/Frame$Metadata;->setIso(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    move-result-wide v5

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v5, v6}, Lcom/jumio/commons/camera/Frame$Metadata;->setTimestamp(J)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Camera1Manager;->isFlashOn()Z

    .line 77
    move-result v5

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v5}, Lcom/jumio/commons/camera/Frame$Metadata;->setFlashOn(Z)V

    .line 81
    .line 82
    sget-object v5, Lcom/jumio/core/camera/CameraConnectionData;->Companion:Lcom/jumio/core/camera/CameraConnectionData$Companion;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Camera1Manager;->getCollectCameraConnection()Z

    .line 86
    move-result v6

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v6}, Lcom/jumio/core/camera/CameraConnectionData$Companion;->get(Z)Lcom/jumio/core/camera/CameraConnectionData;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v5}, Lcom/jumio/commons/camera/Frame$Metadata;->setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V

    .line 94
    .line 95
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 96
    .line 97
    new-instance v5, Lcom/jumio/commons/camera/Frame;

    .line 98
    const/4 v6, 0x1

    .line 99
    .line 100
    .line 101
    invoke-direct {v5, v0, v4, v6}, Lcom/jumio/commons/camera/Frame;-><init>([BLcom/jumio/commons/camera/Frame$Metadata;Z)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v3, v5}, Lcom/jumio/commons/camera/CameraCallbackInterface;->onPreviewFrame(Lcom/jumio/commons/camera/Frame;)V

    .line 105
    .line 106
    :cond_0
    iget-object v3, v1, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 107
    monitor-enter v3

    .line 108
    .line 109
    :try_start_1
    iget-object v0, v1, Lcom/jumio/commons/camera/Camera1Manager;->c:[B

    .line 110
    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v0}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    goto :goto_0

    .line 118
    :catchall_0
    move-exception v0

    .line 119
    goto :goto_1

    .line 120
    :cond_1
    :goto_0
    monitor-exit v3

    .line 121
    return-void

    .line 122
    :goto_1
    monitor-exit v3

    .line 123
    throw v0
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public declared-synchronized onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 8
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "surface"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    new-instance v1, Ljumio/core/M;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v2}, Lcom/jumio/commons/utils/DeviceRotationManager;->isScreenPortrait()Z

    .line 18
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    :goto_0
    move v6, v2

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    move-object v2, p0

    .line 24
    goto :goto_5

    .line 25
    :cond_0
    const/4 v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    :try_start_2
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    .line 33
    :try_start_3
    invoke-virtual {v2}, Lcom/jumio/commons/utils/DeviceRotationManager;->getDisplayRotation()I

    .line 34
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    :goto_2
    move-object v3, p1

    .line 36
    move v4, p2

    .line 37
    move v5, p3

    .line 38
    move v7, v2

    .line 39
    move-object v2, p0

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/4 v2, 0x0

    .line 42
    goto :goto_2

    .line 43
    .line 44
    .line 45
    :goto_3
    :try_start_4
    invoke-direct/range {v1 .. v7}, Ljumio/core/M;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Landroid/graphics/SurfaceTexture;IIZI)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :goto_4
    move-object p1, v0

    .line 53
    goto :goto_5

    .line 54
    :catchall_2
    move-exception v0

    .line 55
    move-object v2, p0

    .line 56
    goto :goto_4

    .line 57
    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 58
    throw p1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 1
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surface"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isPausePreview()Z

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/jumio/commons/camera/Camera1Manager;->stopPreview(Z)V

    .line 13
    .line 14
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    new-instance v0, Ljumio/core/N;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Ljumio/core/N;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 23
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public declared-synchronized onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 8
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "surface"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 9
    .line 10
    new-instance v1, Ljumio/core/Q;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    :try_start_1
    invoke-virtual {v2}, Lcom/jumio/commons/utils/DeviceRotationManager;->isScreenPortrait()Z

    .line 18
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    :goto_0
    move v6, v2

    .line 20
    goto :goto_1

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    move-object v2, p0

    .line 24
    goto :goto_5

    .line 25
    :cond_0
    const/4 v2, 0x1

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :goto_1
    :try_start_2
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    .line 33
    :try_start_3
    invoke-virtual {v2}, Lcom/jumio/commons/utils/DeviceRotationManager;->getDisplayRotation()I

    .line 34
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 35
    :goto_2
    move-object v3, p1

    .line 36
    move v4, p2

    .line 37
    move v5, p3

    .line 38
    move v7, v2

    .line 39
    move-object v2, p0

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    const/4 v2, 0x0

    .line 42
    goto :goto_2

    .line 43
    .line 44
    .line 45
    :goto_3
    :try_start_4
    invoke-direct/range {v1 .. v7}, Ljumio/core/Q;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Landroid/graphics/SurfaceTexture;IIZI)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :goto_4
    move-object p1, v0

    .line 53
    goto :goto_5

    .line 54
    :catchall_2
    move-exception v0

    .line 55
    move-object v2, p0

    .line 56
    goto :goto_4

    .line 57
    :goto_5
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 58
    throw p1
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1
    .param p1    # Landroid/graphics/SurfaceTexture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "surface"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public declared-synchronized reinitCamera()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/jumio/commons/camera/Camera1Manager;->stopPreview(Z)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    new-instance v1, Ljumio/core/N;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0}, Ljumio/core/N;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 18
    .line 19
    new-instance v1, Lf9/a;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lf9/a;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public declared-synchronized requestFocus(II)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isPausePreview()Z

    .line 5
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    monitor-exit p0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    :try_start_1
    new-instance v0, Lcom/jumio/commons/camera/MeteringPoint;

    .line 12
    int-to-float p1, p1

    .line 13
    int-to-float p2, p2

    .line 14
    .line 15
    const/high16 v1, 0x42480000    # 50.0f

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1, p2, v1, v1}, Lcom/jumio/commons/camera/MeteringPoint;-><init>(FFFF)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    new-instance p2, Ljumio/core/O;

    .line 23
    .line 24
    .line 25
    invoke-direct {p2, p0, v0}, Ljumio/core/O;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Lcom/jumio/commons/camera/MeteringPoint;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw p1
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public requestMetering(Lcom/jumio/commons/camera/MeteringConfig;)V
    .locals 2
    .param p1    # Lcom/jumio/commons/camera/MeteringConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "meteringConfig"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isPausePreview()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 15
    .line 16
    new-instance v1, Ljumio/core/O;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/jumio/commons/camera/MeteringConfig;->getMeteringPoint()Lcom/jumio/commons/camera/MeteringPoint;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, p0, p1}, Ljumio/core/O;-><init>(Lcom/jumio/commons/camera/Camera1Manager;Lcom/jumio/commons/camera/MeteringPoint;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V
    .locals 6
    .param p1    # Lcom/jumio/sdk/enums/JumioCameraFacing;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "facing"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->FRONT:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    move p1, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v1

    .line 15
    .line 16
    :goto_0
    new-instance v0, Landroid/hardware/Camera$CameraInfo;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    .line 23
    move-result v3

    .line 24
    .line 25
    :try_start_0
    iget v4, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 26
    .line 27
    .line 28
    invoke-static {v4, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    goto :goto_1

    .line 30
    :catch_0
    move-exception v4

    .line 31
    .line 32
    .line 33
    invoke-static {v4}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 34
    .line 35
    :goto_1
    iget v4, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 36
    .line 37
    if-ne v4, v2, :cond_1

    .line 38
    move v4, v2

    .line 39
    goto :goto_2

    .line 40
    :cond_1
    move v4, v1

    .line 41
    .line 42
    :goto_2
    if-eqz p1, :cond_2

    .line 43
    .line 44
    if-nez v4, :cond_9

    .line 45
    .line 46
    :cond_2
    if-nez p1, :cond_3

    .line 47
    .line 48
    if-nez v4, :cond_3

    .line 49
    goto :goto_6

    .line 50
    .line 51
    :cond_3
    iput v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 52
    move v4, v1

    .line 53
    .line 54
    :goto_3
    if-ge v4, v3, :cond_8

    .line 55
    .line 56
    .line 57
    :try_start_1
    invoke-static {v4, v0}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 58
    .line 59
    iget v5, v0, Landroid/hardware/Camera$CameraInfo;->facing:I

    .line 60
    .line 61
    if-ne v5, v2, :cond_4

    .line 62
    move v5, v2

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    move v5, v1

    .line 65
    .line 66
    :goto_4
    if-eqz p1, :cond_5

    .line 67
    .line 68
    if-nez v5, :cond_6

    .line 69
    .line 70
    :cond_5
    if-nez p1, :cond_7

    .line 71
    .line 72
    if-nez v5, :cond_7

    .line 73
    .line 74
    :cond_6
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->q:Z

    .line 75
    .line 76
    iput v4, p0, Lcom/jumio/commons/camera/Camera1Manager;->b:I

    .line 77
    goto :goto_5

    .line 78
    :catch_1
    move-exception v5

    .line 79
    .line 80
    .line 81
    invoke-static {v5}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    :cond_7
    add-int/lit8 v4, v4, 0x1

    .line 84
    goto :goto_3

    .line 85
    .line 86
    .line 87
    :cond_8
    :goto_5
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isPausePreview()Z

    .line 88
    move-result p1

    .line 89
    .line 90
    if-nez p1, :cond_9

    .line 91
    .line 92
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 93
    .line 94
    if-eqz p1, :cond_9

    .line 95
    .line 96
    .line 97
    :try_start_2
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->reinitCamera()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 98
    goto :goto_6

    .line 99
    :catch_2
    move-exception p1

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 103
    :cond_9
    :goto_6
    return-void
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setCollectCameraConnection(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->u:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setExposureAndWhiteBalanceLock(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 3
    monitor-enter p1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    :try_start_1
    invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Landroid/hardware/Camera$Parameters;->setAutoExposureLock(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/hardware/Camera$Parameters;->setAutoWhiteBalanceLock(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :catch_0
    move-exception v0

    .line 26
    .line 27
    .line 28
    :try_start_2
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    :cond_0
    monitor-exit p1

    .line 32
    return-void

    .line 33
    :goto_1
    monitor-exit p1

    .line 34
    throw v0
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setFlash(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getCameraCapabilities()Lcom/jumio/commons/camera/Camera1Capabilities;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Camera1Capabilities;->getHasFlash()Z

    .line 15
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    monitor-exit v0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    :try_start_1
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    :try_start_2
    invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v2, p1}, Lcom/jumio/commons/camera/Camera1Manager;->a(Landroid/hardware/Camera$Parameters;Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :catch_0
    move-exception p1

    .line 39
    .line 40
    .line 41
    :try_start_3
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    :cond_1
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit v0

    .line 47
    throw p1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method

.method public setPausePreview(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->t:Z

    .line 3
    return-void
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setShader(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "shaderProvider"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljumio/core/j3;->setShader(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public setup(Landroid/content/Context;Lcom/jumio/commons/camera/CameraManagerConfig;Lcom/jumio/commons/camera/CameraCallbackInterface;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/commons/camera/CameraManagerConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/commons/camera/CameraCallbackInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "config"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string p1, "cameraCallback"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRequestedCameraFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/jumio/commons/camera/Camera1Manager;->setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRotationManager()Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iput-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->j:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->isFlashOn()Z

    .line 32
    move-result p1

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getEnableFlashOnStart()Z

    .line 38
    move-result p1

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p1, 0x0

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 45
    .line 46
    :goto_1
    iput-boolean p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->k:Z

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRequestedSize()Lcom/jumio/commons/camera/Size;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    iput-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->l:Lcom/jumio/commons/camera/Size;

    .line 53
    .line 54
    iget-object p1, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getShouldUseShader()Z

    .line 60
    move-result p2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Ljumio/core/j3;->setShouldUseShader(Z)V

    .line 64
    .line 65
    :cond_2
    iput-object p3, p0, Lcom/jumio/commons/camera/Camera1Manager;->i:Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 66
    return-void
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method public setupUiViews(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/view/View;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "addView"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ljumio/core/j3;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljumio/core/j3;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    new-instance p1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 22
    const/4 v1, -0x1

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljumio/core/j3;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 32
    const/4 p1, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 36
    const/4 p1, 0x2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->w:Ljumio/core/j3;

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    return-void
    .line 46
    .line 47
.end method

.method public startPreview()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->d:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/commons/camera/Camera1Manager;->a:Landroid/hardware/Camera;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    :try_start_1
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->c:[B

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 47
    move-result v3

    .line 48
    mul-int/2addr v2, v3

    .line 49
    .line 50
    const/16 v3, 0x11

    .line 51
    .line 52
    .line 53
    invoke-static {v3}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    .line 54
    move-result v3

    .line 55
    mul-int/2addr v2, v3

    .line 56
    .line 57
    div-int/lit8 v2, v2, 0x8

    .line 58
    .line 59
    new-array v2, v2, [B

    .line 60
    .line 61
    iput-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->c:[B

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception v1

    .line 64
    goto :goto_3

    .line 65
    :catch_0
    move-exception v1

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/jumio/commons/camera/Camera1Manager;->c:[B

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Landroid/hardware/Camera;->setPreviewCallbackWithBuffer(Landroid/hardware/Camera$PreviewCallback;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Landroid/hardware/Camera;->startPreview()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    goto :goto_2

    .line 79
    .line 80
    .line 81
    :goto_1
    :try_start_2
    invoke-static {v1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Camera1Manager;->reinitCamera()V

    .line 85
    :cond_1
    :goto_2
    const/4 v1, 0x0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v1}, Lcom/jumio/commons/camera/Camera1Manager;->setPausePreview(Z)V

    .line 89
    .line 90
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :goto_3
    monitor-exit v0

    .line 94
    throw v1
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public declared-synchronized stopPreview(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/jumio/commons/camera/Camera1Manager;->h:Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    new-instance v1, Ljumio/core/P;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0}, Ljumio/core/P;-><init>(Lcom/jumio/commons/camera/Camera1Manager;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/jumio/commons/camera/Camera1Manager;->setPausePreview(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    monitor-exit p0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    throw p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
