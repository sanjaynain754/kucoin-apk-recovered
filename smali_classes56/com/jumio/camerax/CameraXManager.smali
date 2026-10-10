.class public final Lcom/jumio/camerax/CameraXManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/commons/camera/CameraManagerInterface;
.implements Lcom/jumio/core/plugins/Plugin;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u008b\u0001BC\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0008\u0010U\u001a\u00020GH\u0002J\u0010\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020W2\u0006\u0010[\u001a\u00020\u0016H\u0016J\u0010\u0010\\\u001a\u00020W2\u0006\u0010]\u001a\u00020^H\u0016J\u0010\u0010_\u001a\u00020W2\u0006\u0010`\u001a\u00020aH\u0016J<\u0010b\u001a\u00020W2\u0006\u0010c\u001a\u00020\u00162\u0014\u0010d\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020W\u0018\u00010e2\u0014\u0010g\u001a\u0010\u0012\u0004\u0012\u00020f\u0012\u0004\u0012\u00020W\u0018\u00010eH\u0016J\u0018\u0010h\u001a\u00020W2\u0006\u0010i\u001a\u00020G2\u0006\u0010j\u001a\u00020GH\u0016J\u0010\u0010k\u001a\u00020W2\u0006\u0010l\u001a\u00020mH\u0016J\u0008\u0010n\u001a\u00020WH\u0016J\u0008\u0010o\u001a\u00020WH\u0016J\u0010\u0010p\u001a\u00020W2\u0006\u0010q\u001a\u00020rH\u0016J$\u0010s\u001a\u00020W2\u0006\u00101\u001a\u0002032\u0012\u0010t\u001a\u000e\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020W0eH\u0016J \u0010v\u001a\u00020W2\u0006\u00101\u001a\u0002032\u0006\u0010w\u001a\u00020x2\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010y\u001a\u00020W2\u0006\u0010z\u001a\u00020\u0016H\u0016J\u0008\u0010{\u001a\u00020WH\u0016J\u0008\u0010|\u001a\u00020WH\u0016J\u0010\u0010}\u001a\u00020W2\u0006\u0010~\u001a\u00020\u0016H\u0016J\u0008\u0010\u007f\u001a\u00020WH\u0016J\u0014\u0010\u0080\u0001\u001a\u00020W2\t\u0008\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\u001d\u0010\u0082\u0001\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020G2\t\u0008\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\t\u0010\u0084\u0001\u001a\u00020WH\u0002J\u001d\u0010\u0085\u0001\u001a\u00020W2\u0007\u0010\u0083\u0001\u001a\u00020G2\t\u0008\u0002\u0010\u0081\u0001\u001a\u00020\u0016H\u0002J\u001b\u0010\u0086\u0001\u001a\u00020W2\u0007\u0010\u0087\u0001\u001a\u00020\u00162\u0007\u0010\u0088\u0001\u001a\u00020GH\u0002J\n\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u001e\u0010&\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0018R\u001a\u0010\'\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\'\u0010\u0018\"\u0004\u0008(\u0010)R\u001a\u0010*\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010\u0018\"\u0004\u0008,\u0010)R\u0014\u0010-\u001a\u00020.X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0016\u00101\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010H\u001a\u0008\u0012\u0004\u0012\u00020J0IX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010K\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010\u0018R\u0014\u0010L\u001a\u00020\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010\u0018R\u000e\u0010M\u001a\u00020NX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010O\u001a\u00020P8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008Q\u0010RR\u0014\u0010S\u001a\u00020P8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010R\u00a8\u0006\u008c\u0001"
    }
    d2 = {
        "Lcom/jumio/camerax/CameraXManager;",
        "Lcom/jumio/commons/camera/CameraManagerInterface;",
        "Lcom/jumio/core/plugins/Plugin;",
        "mainScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "cameraProvider",
        "Lcom/jumio/camerax/provider/CameraXProviderInterface;",
        "lifecycleHandler",
        "Lcom/jumio/camerax/lifecycle/CameraXLifecycleHandlerInterface;",
        "cameraUi",
        "Lcom/jumio/camerax/ui/CameraXUiInterface;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "cameraXEffectHandler",
        "Lcom/jumio/camerax/effects/CameraXEffectHandlerInterface;",
        "<init>",
        "(Lkotlinx/coroutines/CoroutineScope;Lcom/jumio/camerax/provider/CameraXProviderInterface;Lcom/jumio/camerax/lifecycle/CameraXLifecycleHandlerInterface;Lcom/jumio/camerax/ui/CameraXUiInterface;Ljava/util/concurrent/Executor;Lcom/jumio/camerax/effects/CameraXEffectHandlerInterface;)V",
        "version",
        "",
        "getVersion",
        "()Ljava/lang/String;",
        "focusing",
        "",
        "getFocusing",
        "()Z",
        "previewSize",
        "Lcom/jumio/commons/camera/Size;",
        "getPreviewSize",
        "()Lcom/jumio/commons/camera/Size;",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "getCameraSettings",
        "()Lcom/jumio/commons/camera/CameraSettings;",
        "frameMetadata",
        "Lcom/jumio/commons/camera/Frame$Metadata;",
        "getFrameMetadata",
        "()Lcom/jumio/commons/camera/Frame$Metadata;",
        "value",
        "isFrontFacing",
        "isPausePreview",
        "setPausePreview",
        "(Z)V",
        "collectCameraConnection",
        "getCollectCameraConnection",
        "setCollectCameraConnection",
        "cameraCapabilities",
        "Lcom/jumio/commons/camera/CameraCapabilities;",
        "getCameraCapabilities",
        "()Lcom/jumio/commons/camera/CameraCapabilities;",
        "context",
        "Ljava/lang/ref/WeakReference;",
        "Landroid/content/Context;",
        "camera",
        "Lcom/jumio/camerax/camera/CameraXInterface;",
        "cameraCallback",
        "Lcom/jumio/commons/camera/CameraCallbackInterface;",
        "cameraAccessLock",
        "",
        "preview",
        "Landroidx/camera/core/Preview;",
        "imageCapture",
        "Landroidx/camera/core/ImageCapture;",
        "imageAnalysis",
        "Landroidx/camera/core/ImageAnalysis;",
        "rotationManager",
        "Lcom/jumio/commons/utils/DeviceRotationManager;",
        "enableFlashOnStart",
        "requestedSize",
        "hasHighResolutionSupport",
        "shouldUseShader",
        "currentLensFacing",
        "",
        "stateObserver",
        "Landroidx/lifecycle/Observer;",
        "Landroidx/camera/core/CameraState;",
        "isFlashOn",
        "isExposureAndWhiteBalanceLocked",
        "imageAnalysisCaptureCallback",
        "Lcom/jumio/camerax/utils/CameraDataCaptureCallback;",
        "previewResolutionSelector",
        "Landroidx/camera/core/resolutionselector/ResolutionSelector;",
        "getPreviewResolutionSelector",
        "()Landroidx/camera/core/resolutionselector/ResolutionSelector;",
        "captureResolutionSelector",
        "getCaptureResolutionSelector",
        "getAndroidImageFormat",
        "fillImageData",
        "",
        "imageData",
        "Lcom/jumio/commons/camera/ImageData;",
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
        "Lkotlin/Function1;",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
        "onRender",
        "requestFocus",
        "x",
        "y",
        "requestMetering",
        "meteringConfig",
        "Lcom/jumio/commons/camera/MeteringConfig;",
        "changeCamera",
        "captureImage",
        "setCameraFacing",
        "facing",
        "Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "setupUiViews",
        "addView",
        "Landroid/view/View;",
        "setup",
        "config",
        "Lcom/jumio/commons/camera/CameraManagerConfig;",
        "setFlash",
        "turnFlashOn",
        "startPreview",
        "reinitCamera",
        "stopPreview",
        "pause",
        "destroy",
        "initCamera",
        "withCameraCallbacks",
        "bindUseCases",
        "lensFacing",
        "unbindUseCases",
        "initPreview",
        "updateCameraSettings",
        "isPortrait",
        "sensorRotationDegrees",
        "fallbackToCamera1",
        "Lkotlinx/coroutines/Job;",
        "PreviewImageAnalyzer",
        "jumio-camerax_release"
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
        "SMAP\nCameraXManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraXManager.kt\ncom/jumio/camerax/CameraXManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n1#2:595\n774#3:596\n865#3,2:597\n774#3:599\n865#3,2:600\n*S KotlinDebug\n*F\n+ 1 CameraXManager.kt\ncom/jumio/camerax/CameraXManager\n*L\n161#1:596\n161#1:597,2\n183#1:599\n183#1:600,2\n*E\n"
    }
.end annotation


# instance fields
.field private camera:Ljumio/camerax/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final cameraAccessLock:Ljava/lang/Object;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private cameraCallback:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/jumio/commons/camera/CameraCallbackInterface;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final cameraCapabilities:Lcom/jumio/commons/camera/CameraCapabilities;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraProvider:Ljumio/camerax/o;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraSettings:Lcom/jumio/commons/camera/CameraSettings;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cameraUi:Ljumio/camerax/q;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private cameraXEffectHandler:Ljumio/camerax/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private collectCameraConnection:Z

.field private context:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private currentLensFacing:I

.field private enableFlashOnStart:Z

.field private executor:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusing:Z

.field private final frameMetadata:Lcom/jumio/commons/camera/Frame$Metadata;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private hasHighResolutionSupport:Z

.field private imageAnalysis:Landroidx/camera/core/ImageAnalysis;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final imageAnalysisCaptureCallback:Ljumio/camerax/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private imageCapture:Landroidx/camera/core/ImageCapture;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private isFrontFacing:Z

.field private isPausePreview:Z

.field private final lifecycleHandler:Ljumio/camerax/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mainScope:Lkotlinx/coroutines/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private preview:Landroidx/camera/core/Preview;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final previewSize:Lcom/jumio/commons/camera/Size;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private requestedSize:Lcom/jumio/commons/camera/Size;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private shouldUseShader:Z

.field private final stateObserver:Landroidx/lifecycle/Observer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/Observer<",
            "Landroidx/camera/core/CameraState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final version:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    .line 1
    invoke-direct/range {v0 .. v8}, Lcom/jumio/camerax/CameraXManager;-><init>(Lkotlinx/coroutines/m0;Ljumio/camerax/o;Ljumio/camerax/g;Ljumio/camerax/q;Ljava/util/concurrent/Executor;Ljumio/camerax/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/m0;Ljumio/camerax/o;Ljumio/camerax/g;Ljumio/camerax/q;Ljava/util/concurrent/Executor;Ljumio/camerax/e;)V
    .locals 22
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljumio/camerax/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljumio/camerax/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljumio/camerax/q;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljumio/camerax/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "mainScope"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cameraProvider"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "lifecycleHandler"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cameraUi"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "executor"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "cameraXEffectHandler"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 4
    iput-object v2, v0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 5
    iput-object v3, v0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 6
    iput-object v4, v0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 7
    iput-object v5, v0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 8
    iput-object v6, v0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 9
    const-string v1, "4.17.0 (1)"

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->version:Ljava/lang/String;

    .line 10
    new-instance v1, Lcom/jumio/commons/camera/Size;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->previewSize:Lcom/jumio/commons/camera/Size;

    .line 11
    new-instance v1, Lcom/jumio/commons/camera/CameraSettings;

    invoke-direct {v1}, Lcom/jumio/commons/camera/CameraSettings;-><init>()V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->cameraSettings:Lcom/jumio/commons/camera/CameraSettings;

    .line 12
    new-instance v3, Lcom/jumio/commons/camera/Frame$Metadata;

    const/16 v20, 0x3fff

    const/16 v21, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v3 .. v21}, Lcom/jumio/commons/camera/Frame$Metadata;-><init>(Lcom/jumio/commons/camera/Size;IIJF[FFIZIJZLcom/jumio/core/camera/CameraConnectionData;Lcom/jumio/core/enums/FlashState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v3, v0, Lcom/jumio/camerax/CameraXManager;->frameMetadata:Lcom/jumio/commons/camera/Frame$Metadata;

    const/4 v1, 0x1

    .line 13
    iput-boolean v1, v0, Lcom/jumio/camerax/CameraXManager;->collectCameraConnection:Z

    .line 14
    new-instance v1, Lcom/jumio/camerax/CameraXCapabilities;

    new-instance v3, Ljumio/camerax/j;

    invoke-direct {v3, v0}, Ljumio/camerax/j;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    new-instance v4, Le9/b;

    invoke-direct {v4, v0}, Le9/b;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    invoke-direct {v1, v2, v3, v4}, Lcom/jumio/camerax/CameraXCapabilities;-><init>(Ljumio/camerax/o;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->cameraCapabilities:Lcom/jumio/commons/camera/CameraCapabilities;

    .line 15
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 16
    new-instance v1, Le9/c;

    invoke-direct {v1, v0}, Le9/c;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->stateObserver:Landroidx/lifecycle/Observer;

    .line 17
    new-instance v1, Ljumio/camerax/a;

    invoke-direct {v1}, Ljumio/camerax/a;-><init>()V

    iput-object v1, v0, Lcom/jumio/camerax/CameraXManager;->imageAnalysisCaptureCallback:Ljumio/camerax/a;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlinx/coroutines/m0;Ljumio/camerax/o;Ljumio/camerax/g;Ljumio/camerax/q;Ljava/util/concurrent/Executor;Ljumio/camerax/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 18
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    move-result-object p1

    invoke-virtual {p1}, Lkotlinx/coroutines/e2;->getImmediate()Lkotlinx/coroutines/e2;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    .line 19
    new-instance p2, Ljumio/camerax/A;

    invoke-direct {p2}, Ljumio/camerax/A;-><init>()V

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    .line 20
    new-instance p3, Ljumio/camerax/z;

    invoke-direct {p3, p1}, Ljumio/camerax/z;-><init>(Lkotlinx/coroutines/m0;)V

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    .line 21
    new-instance p4, Ljumio/camerax/B;

    invoke-direct {p4}, Ljumio/camerax/B;-><init>()V

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    .line 22
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p5

    const-string p8, "newSingleThreadExecutor(...)"

    invoke-static {p5, p8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    .line 23
    new-instance p6, Ljumio/camerax/d;

    invoke-direct {p6}, Ljumio/camerax/d;-><init>()V

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    .line 24
    invoke-direct/range {p2 .. p8}, Lcom/jumio/camerax/CameraXManager;-><init>(Lkotlinx/coroutines/m0;Ljumio/camerax/o;Ljumio/camerax/g;Ljumio/camerax/q;Ljava/util/concurrent/Executor;Ljumio/camerax/e;)V

    return-void
.end method

.method private static final _get_captureResolutionSelector_$lambda$11(Lcom/jumio/camerax/CameraXManager;Ljava/util/List;I)Ljava/util/List;
    .locals 5

    .line 1
    .line 2
    const-string p2, "supportedSizes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v0

    .line 20
    move-object v1, v0

    .line 21
    .line 22
    check-cast v1, Landroid/util/Size;

    .line 23
    .line 24
    sget-object v2, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 32
    move-result v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 36
    move-result v4

    .line 37
    .line 38
    if-ne v3, v4, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 46
    move-result v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 50
    move-result v1

    .line 51
    .line 52
    if-ne v2, v1, :cond_0

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    const/4 v0, 0x0

    .line 55
    .line 56
    :goto_0
    if-eqz v0, :cond_2

    .line 57
    const/4 p2, 0x1

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    const/4 p2, 0x0

    .line 60
    .line 61
    :goto_1
    iput-boolean p2, p0, Lcom/jumio/camerax/CameraXManager;->hasHighResolutionSupport:Z

    .line 62
    .line 63
    new-instance p0, Ljava/util/ArrayList;

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result p2

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    move-result-object p2

    .line 81
    move-object v0, p2

    .line 82
    .line 83
    check-cast v0, Landroid/util/Size;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 87
    move-result v1

    .line 88
    int-to-float v1, v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 92
    move-result v0

    .line 93
    int-to-float v0, v0

    .line 94
    div-float/2addr v1, v0

    .line 95
    .line 96
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getRatio()F

    .line 104
    move-result v0

    .line 105
    .line 106
    cmpg-float v0, v1, v0

    .line 107
    .line 108
    if-nez v0, :cond_3

    .line 109
    .line 110
    .line 111
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 112
    goto :goto_2

    .line 113
    :cond_4
    return-object p0
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

.method private static final _get_previewResolutionSelector_$lambda$8$lambda$7(Lcom/jumio/commons/camera/Size;Ljava/util/List;I)Ljava/util/List;
    .locals 3

    .line 1
    .line 2
    const-string p2, "supportedSizes"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p2, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    move-object v1, v0

    .line 26
    .line 27
    check-cast v1, Landroid/util/Size;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 31
    move-result v2

    .line 32
    int-to-float v2, v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 36
    move-result v1

    .line 37
    int-to-float v1, v1

    .line 38
    div-float/2addr v2, v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Size;->getRatio()F

    .line 42
    move-result v1

    .line 43
    .line 44
    cmpg-float v1, v2, v1

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object p2
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

.method public static synthetic a(Lcom/jumio/camerax/CameraXManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/jumio/camerax/CameraXManager;->reinitCamera$lambda$18(Lcom/jumio/camerax/CameraXManager;)V

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

.method public static final synthetic access$getCameraCallback$p(Lcom/jumio/camerax/CameraXManager;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/camerax/CameraXManager;->cameraCallback:Ljava/lang/ref/WeakReference;

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

.method public static final synthetic access$getHasHighResolutionSupport$p(Lcom/jumio/camerax/CameraXManager;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/jumio/camerax/CameraXManager;->hasHighResolutionSupport:Z

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

.method public static final synthetic access$getImageAnalysisCaptureCallback$p(Lcom/jumio/camerax/CameraXManager;)Ljumio/camerax/a;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysisCaptureCallback:Ljumio/camerax/a;

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

.method public static final synthetic access$setHasHighResolutionSupport$p(Lcom/jumio/camerax/CameraXManager;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->hasHighResolutionSupport:Z

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

.method public static synthetic b(Lcom/jumio/camerax/CameraXManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/jumio/camerax/CameraXManager;->setup$lambda$15(Lcom/jumio/camerax/CameraXManager;)V

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

.method private final bindUseCases(IZ)V
    .locals 11

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->unbindUseCases()V

    .line 7
    .line 8
    new-instance v3, Landroidx/camera/core/CameraSelector$Builder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v3}, Landroidx/camera/core/CameraSelector$Builder;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3, p1}, Landroidx/camera/core/CameraSelector$Builder;->requireLensFacing(I)Landroidx/camera/core/CameraSelector$Builder;

    .line 15
    move-result-object v3

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Landroidx/camera/core/CameraSelector$Builder;->build()Landroidx/camera/core/CameraSelector;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    const-string v4, "build(...)"

    .line 22
    .line 23
    .line 24
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    iput p1, p0, Lcom/jumio/camerax/CameraXManager;->currentLensFacing:I

    .line 27
    .line 28
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->getPreviewResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    iget-object v6, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysisCaptureCallback:Ljumio/camerax/a;

    .line 35
    .line 36
    check-cast p1, Ljumio/camerax/A;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string p1, "resolutionSelector"

    .line 42
    .line 43
    .line 44
    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    new-instance v7, Landroidx/camera/core/Preview$Builder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v7}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v7, v5}, Landroidx/camera/core/Preview$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/Preview$Builder;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    new-instance v7, Landroidx/camera/camera2/interop/Camera2Interop$Extender;

    .line 58
    .line 59
    .line 60
    invoke-direct {v7, v5}, Landroidx/camera/camera2/interop/Camera2Interop$Extender;-><init>(Landroidx/camera/core/ExtendableBuilder;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v7, v6}, Landroidx/camera/camera2/interop/Camera2Interop$Extender;->setSessionCaptureCallback(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/interop/Camera2Interop$Extender;

    .line 64
    .line 65
    .line 66
    :cond_0
    invoke-virtual {v5}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    .line 70
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    iput-object v5, p0, Lcom/jumio/camerax/CameraXManager;->preview:Landroidx/camera/core/Preview;

    .line 73
    .line 74
    iget-object v5, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 75
    .line 76
    check-cast v5, Ljumio/camerax/B;

    .line 77
    .line 78
    iget-object v5, v5, Ljumio/camerax/B;->a:Ljava/lang/ref/WeakReference;

    .line 79
    const/4 v6, 0x0

    .line 80
    .line 81
    if-eqz v5, :cond_1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 85
    move-result-object v5

    .line 86
    .line 87
    check-cast v5, Landroidx/camera/view/PreviewView;

    .line 88
    .line 89
    if-eqz v5, :cond_1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    .line 93
    move-result-object v5

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move-object v5, v6

    .line 96
    .line 97
    :goto_0
    if-eqz v5, :cond_2

    .line 98
    .line 99
    iget-object v7, p0, Lcom/jumio/camerax/CameraXManager;->preview:Landroidx/camera/core/Preview;

    .line 100
    .line 101
    if-eqz v7, :cond_2

    .line 102
    .line 103
    .line 104
    invoke-virtual {v7, v5}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 105
    .line 106
    :cond_2
    iget-object v5, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->getPreviewResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 110
    move-result-object v7

    .line 111
    .line 112
    .line 113
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->getAndroidImageFormat()I

    .line 114
    move-result v8

    .line 115
    .line 116
    check-cast v5, Ljumio/camerax/A;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    new-instance v5, Landroidx/camera/core/ImageAnalysis$Builder;

    .line 125
    .line 126
    .line 127
    invoke-direct {v5}, Landroidx/camera/core/ImageAnalysis$Builder;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v7}, Landroidx/camera/core/ImageAnalysis$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageAnalysis$Builder;

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v8}, Landroidx/camera/core/ImageAnalysis$Builder;->setOutputImageFormat(I)Landroidx/camera/core/ImageAnalysis$Builder;

    .line 135
    move-result-object v5

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v2}, Landroidx/camera/core/ImageAnalysis$Builder;->setBackpressureStrategy(I)Landroidx/camera/core/ImageAnalysis$Builder;

    .line 139
    move-result-object v5

    .line 140
    .line 141
    .line 142
    invoke-virtual {v5}, Landroidx/camera/core/ImageAnalysis$Builder;->build()Landroidx/camera/core/ImageAnalysis;

    .line 143
    move-result-object v5

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    iput-object v5, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 149
    .line 150
    iget-object v5, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 151
    .line 152
    .line 153
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->getCaptureResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 154
    move-result-object v7

    .line 155
    .line 156
    iget-boolean v8, p0, Lcom/jumio/camerax/CameraXManager;->enableFlashOnStart:Z

    .line 157
    .line 158
    check-cast v5, Ljumio/camerax/A;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    new-instance p1, Landroidx/camera/core/ImageCapture$Builder;

    .line 167
    .line 168
    .line 169
    invoke-direct {p1}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v1}, Landroidx/camera/core/ImageCapture$Builder;->setCaptureMode(I)Landroidx/camera/core/ImageCapture$Builder;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v7}, Landroidx/camera/core/ImageCapture$Builder;->setResolutionSelector(Landroidx/camera/core/resolutionselector/ResolutionSelector;)Landroidx/camera/core/ImageCapture$Builder;

    .line 177
    move-result-object p1

    .line 178
    .line 179
    if-eqz v8, :cond_3

    .line 180
    move v5, v1

    .line 181
    goto :goto_1

    .line 182
    :cond_3
    move v5, v0

    .line 183
    .line 184
    .line 185
    :goto_1
    invoke-virtual {p1, v5}, Landroidx/camera/core/ImageCapture$Builder;->setFlashMode(I)Landroidx/camera/core/ImageCapture$Builder;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    .line 190
    move-result-object p1

    .line 191
    .line 192
    .line 193
    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    iput-object p1, p0, Lcom/jumio/camerax/CameraXManager;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 196
    .line 197
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraCallback:Ljava/lang/ref/WeakReference;

    .line 198
    .line 199
    if-eqz p1, :cond_4

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    check-cast p1, Lcom/jumio/commons/camera/CameraCallbackInterface;

    .line 206
    .line 207
    if-eqz p1, :cond_4

    .line 208
    .line 209
    iget-object v4, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 210
    .line 211
    if-eqz v4, :cond_4

    .line 212
    .line 213
    iget-object v5, p0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 214
    .line 215
    new-instance v7, Ljumio/camerax/h;

    .line 216
    .line 217
    .line 218
    invoke-direct {v7, p0, p1}, Ljumio/camerax/h;-><init>(Lcom/jumio/camerax/CameraXManager;Lcom/jumio/commons/camera/CameraCallbackInterface;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v5, v7}, Landroidx/camera/core/ImageAnalysis;->setAnalyzer(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageAnalysis$Analyzer;)V

    .line 222
    .line 223
    :cond_4
    iget-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->shouldUseShader:Z

    .line 224
    .line 225
    if-eqz p1, :cond_6

    .line 226
    .line 227
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 228
    .line 229
    check-cast p1, Ljumio/camerax/d;

    .line 230
    .line 231
    iget-object v4, p1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 232
    .line 233
    if-eqz v4, :cond_5

    .line 234
    .line 235
    iget-object v4, v4, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->release()V

    .line 239
    .line 240
    iput-object v6, p1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 241
    .line 242
    :cond_5
    new-instance v4, Ljumio/camerax/c;

    .line 243
    .line 244
    .line 245
    invoke-direct {v4}, Ljumio/camerax/c;-><init>()V

    .line 246
    .line 247
    iput-object v4, p1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 248
    .line 249
    :cond_6
    :try_start_0
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 250
    .line 251
    iget-object v4, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 252
    .line 253
    check-cast v4, Ljumio/camerax/z;

    .line 254
    .line 255
    iget-object v4, v4, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 256
    .line 257
    iget-object v5, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 258
    .line 259
    check-cast v5, Ljumio/camerax/d;

    .line 260
    .line 261
    iget-object v5, v5, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 262
    .line 263
    if-eqz v5, :cond_7

    .line 264
    .line 265
    iget-object v5, v5, Ljumio/camerax/c;->b:Ljumio/camerax/c;

    .line 266
    goto :goto_2

    .line 267
    :catch_0
    move-exception v0

    .line 268
    move-object p1, v0

    .line 269
    goto :goto_3

    .line 270
    :cond_7
    move-object v5, v6

    .line 271
    .line 272
    :goto_2
    iget-object v7, p0, Lcom/jumio/camerax/CameraXManager;->preview:Landroidx/camera/core/Preview;

    .line 273
    .line 274
    iget-object v8, p0, Lcom/jumio/camerax/CameraXManager;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 275
    .line 276
    iget-object v9, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 277
    const/4 v10, 0x3

    .line 278
    .line 279
    new-array v10, v10, [Landroidx/camera/core/UseCase;

    .line 280
    .line 281
    aput-object v7, v10, v2

    .line 282
    .line 283
    aput-object v8, v10, v1

    .line 284
    .line 285
    aput-object v9, v10, v0

    .line 286
    .line 287
    check-cast p1, Ljumio/camerax/A;

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, v4, v3, v5, v10}, Ljumio/camerax/A;->a(Ljumio/camerax/y;Landroidx/camera/core/CameraSelector;Ljumio/camerax/c;[Landroidx/camera/core/UseCase;)Ljumio/camerax/t;

    .line 291
    move-result-object p1

    .line 292
    .line 293
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    .line 295
    const-string v1, "observer"

    .line 296
    .line 297
    if-eqz v0, :cond_8

    .line 298
    .line 299
    :try_start_1
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->stateObserver:Landroidx/lifecycle/Observer;

    .line 300
    .line 301
    check-cast v0, Ljumio/camerax/t;

    .line 302
    .line 303
    .line 304
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    .line 306
    iget-object v0, v0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 307
    .line 308
    .line 309
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 310
    move-result-object v0

    .line 311
    .line 312
    if-eqz v0, :cond_8

    .line 313
    .line 314
    .line 315
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    .line 316
    move-result-object v0

    .line 317
    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 322
    .line 323
    :cond_8
    if-eqz p1, :cond_9

    .line 324
    .line 325
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 326
    .line 327
    check-cast v0, Ljumio/camerax/z;

    .line 328
    .line 329
    iget-object v0, v0, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 330
    .line 331
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->stateObserver:Landroidx/lifecycle/Observer;

    .line 332
    .line 333
    const-string v3, "lifecycle"

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .line 341
    iget-object v1, p1, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 342
    .line 343
    .line 344
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 345
    move-result-object v1

    .line 346
    .line 347
    if-eqz v1, :cond_9

    .line 348
    .line 349
    .line 350
    invoke-interface {v1}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    .line 351
    move-result-object v1

    .line 352
    .line 353
    if-eqz v1, :cond_9

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 357
    .line 358
    :cond_9
    iput-object p1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 359
    .line 360
    if-eqz p2, :cond_a

    .line 361
    .line 362
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 363
    .line 364
    new-instance v3, Ljumio/camerax/i;

    .line 365
    .line 366
    .line 367
    invoke-direct {v3, p0, v6}, Ljumio/camerax/i;-><init>(Lcom/jumio/camerax/CameraXManager;Lkotlin/coroutines/Continuation;)V

    .line 368
    const/4 v4, 0x3

    .line 369
    const/4 v5, 0x0

    .line 370
    const/4 v1, 0x0

    .line 371
    const/4 v2, 0x0

    .line 372
    .line 373
    .line 374
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 375
    return-void

    .line 376
    .line 377
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 378
    .line 379
    const-string v0, "Use case binding failed "

    .line 380
    .line 381
    .line 382
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    move-result-object p1

    .line 390
    .line 391
    const-string p2, "CameraXManager"

    .line 392
    .line 393
    .line 394
    invoke-static {p2, p1}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->fallbackToCamera1()Lkotlinx/coroutines/x1;

    .line 398
    :cond_a
    return-void
.end method

.method public static synthetic bindUseCases$default(Lcom/jumio/camerax/CameraXManager;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/jumio/camerax/CameraXManager;->bindUseCases(IZ)V

    .line 9
    return-void
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
.end method

.method public static synthetic c(Lcom/jumio/camerax/CameraXManager;Ljava/util/List;I)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/jumio/camerax/CameraXManager;->_get_captureResolutionSelector_$lambda$11(Lcom/jumio/camerax/CameraXManager;Ljava/util/List;I)Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private static final cameraCapabilities$lambda$1(Lcom/jumio/camerax/CameraXManager;)Ljumio/camerax/f;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object p0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    return-object p0

    .line 8
    :catchall_0
    move-exception p0

    .line 9
    monitor-exit v0

    .line 10
    throw p0
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

.method public static synthetic d(Lcom/jumio/commons/camera/Size;Ljava/util/List;I)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/jumio/camerax/CameraXManager;->_get_previewResolutionSelector_$lambda$8$lambda$7(Lcom/jumio/commons/camera/Size;Ljava/util/List;I)Ljava/util/List;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic e(Lcom/jumio/camerax/CameraXManager;)Ljumio/camerax/f;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/jumio/camerax/CameraXManager;->cameraCapabilities$lambda$1(Lcom/jumio/camerax/CameraXManager;)Ljumio/camerax/f;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method public static synthetic f(Lcom/jumio/camerax/CameraXManager;Landroidx/camera/core/CameraState;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/jumio/camerax/CameraXManager;->stateObserver$lambda$3(Lcom/jumio/camerax/CameraXManager;Landroidx/camera/core/CameraState;)V

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
.end method

.method private final fallbackToCamera1()Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    new-instance v3, Ljumio/camerax/l;

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p0, v1}, Ljumio/camerax/l;-><init>(Lcom/jumio/camerax/CameraXManager;Lkotlin/coroutines/Continuation;)V

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public static synthetic g(Lcom/jumio/camerax/CameraXManager;ZZ)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/jumio/camerax/CameraXManager;->initCamera$lambda$20$lambda$19(Lcom/jumio/camerax/CameraXManager;ZZ)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private final getAndroidImageFormat()I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
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

.method private final getCaptureResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 6
    .line 7
    new-instance v1, Le9/g;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Le9/g;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionFilter(Landroidx/camera/core/resolutionselector/ResolutionFilter;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    new-instance v1, Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 17
    .line 18
    new-instance v2, Landroid/util/Size;

    .line 19
    .line 20
    sget-object v3, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 24
    move-result-object v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 28
    move-result v4

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getUHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 36
    move-result v3

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, v4, v3}, Landroid/util/Size;-><init>(II)V

    .line 40
    const/4 v3, 0x3

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2, v3}, Landroidx/camera/core/resolutionselector/ResolutionStrategy;-><init>(Landroid/util/Size;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    const-string v1, "build(...)"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    return-object v0
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

.method private final getPreviewResolutionSelector()Landroidx/camera/core/resolutionselector/ResolutionSelector;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->requestedSize:Lcom/jumio/commons/camera/Size;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/jumio/commons/camera/CameraManagerInterface;->Companion:Lcom/jumio/commons/camera/CameraManagerInterface$Companion;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraManagerInterface$Companion;->getFHD_CAMERA_RESOLUTION()Lcom/jumio/commons/camera/Size;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    :cond_0
    new-instance v1, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;-><init>()V

    .line 16
    .line 17
    new-instance v2, Le9/a;

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v0}, Le9/a;-><init>(Lcom/jumio/commons/camera/Size;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionFilter(Landroidx/camera/core/resolutionselector/ResolutionFilter;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    new-instance v2, Landroidx/camera/core/resolutionselector/ResolutionStrategy;

    .line 27
    .line 28
    new-instance v3, Landroid/util/Size;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 32
    move-result v4

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-direct {v3, v4, v0}, Landroid/util/Size;-><init>(II)V

    .line 40
    const/4 v0, 0x3

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v3, v0}, Landroidx/camera/core/resolutionselector/ResolutionStrategy;-><init>(Landroid/util/Size;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->setResolutionStrategy(Landroidx/camera/core/resolutionselector/ResolutionStrategy;)Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/camera/core/resolutionselector/ResolutionSelector$Builder;->build()Landroidx/camera/core/resolutionselector/ResolutionSelector;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    const-string v1, "with(...)"

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    return-object v0
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

.method private final initCamera(Z)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->context:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    check-cast v1, Landroid/content/Context;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 19
    .line 20
    new-instance v3, Le9/d;

    .line 21
    .line 22
    .line 23
    invoke-direct {v3, p0, p1}, Le9/d;-><init>(Lcom/jumio/camerax/CameraXManager;Z)V

    .line 24
    .line 25
    check-cast v2, Ljumio/camerax/A;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1, v3}, Ljumio/camerax/A;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    monitor-exit v0

    .line 32
    return-void

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    :goto_0
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw p1
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

.method public static synthetic initCamera$default(Lcom/jumio/camerax/CameraXManager;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    and-int/2addr p2, p3

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    move p1, p3

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1}, Lcom/jumio/camerax/CameraXManager;->initCamera(Z)V

    .line 9
    return-void
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
.end method

.method private static final initCamera$lambda$20$lambda$19(Lcom/jumio/camerax/CameraXManager;ZZ)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->fallbackToCamera1()Lkotlinx/coroutines/x1;

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    return-object p0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFrontFacing()Z

    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    const-string v1, "DEFAULT_FRONT_CAMERA"

    .line 16
    .line 17
    const-string v2, "cameraSelector"

    .line 18
    const/4 v3, 0x0

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    iget-object p2, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 23
    .line 24
    sget-object v4, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 25
    .line 26
    .line 27
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    check-cast p2, Ljumio/camerax/A;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    iget-object p2, p2, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v4}, Landroidx/camera/lifecycle/ProcessCameraProvider;->hasCamera(Landroidx/camera/core/CameraSelector;)Z

    .line 43
    move-result p2

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p2, v3

    .line 46
    .line 47
    :goto_0
    if-eqz p2, :cond_2

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_2
    iget-object p2, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 51
    .line 52
    sget-object v4, Landroidx/camera/core/CameraSelector;->DEFAULT_BACK_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 53
    .line 54
    const-string v5, "DEFAULT_BACK_CAMERA"

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    check-cast p2, Ljumio/camerax/A;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    iget-object p2, p2, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 68
    .line 69
    if-eqz p2, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, v4}, Landroidx/camera/lifecycle/ProcessCameraProvider;->hasCamera(Landroidx/camera/core/CameraSelector;)Z

    .line 73
    move-result p2

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move p2, v3

    .line 76
    .line 77
    :goto_1
    if-eqz p2, :cond_4

    .line 78
    move v3, v0

    .line 79
    goto :goto_3

    .line 80
    .line 81
    :cond_4
    iget-object p2, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 82
    .line 83
    sget-object v4, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    check-cast p2, Ljumio/camerax/A;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    iget-object p2, p2, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 97
    .line 98
    if-eqz p2, :cond_5

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v4}, Landroidx/camera/lifecycle/ProcessCameraProvider;->hasCamera(Landroidx/camera/core/CameraSelector;)Z

    .line 102
    move-result p2

    .line 103
    goto :goto_2

    .line 104
    :cond_5
    move p2, v3

    .line 105
    .line 106
    :goto_2
    if-eqz p2, :cond_8

    .line 107
    .line 108
    .line 109
    :goto_3
    invoke-direct {p0, v3, p1}, Lcom/jumio/camerax/CameraXManager;->bindUseCases(IZ)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0, v3, p1}, Lcom/jumio/camerax/CameraXManager;->initPreview(IZ)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isPausePreview()Z

    .line 116
    move-result p1

    .line 117
    .line 118
    if-nez p1, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->startPreview()V

    .line 122
    .line 123
    .line 124
    :cond_6
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 125
    move-result-object p1

    .line 126
    .line 127
    .line 128
    invoke-interface {p1}, Lcom/jumio/commons/camera/CameraCapabilities;->getHasFlash()Z

    .line 129
    move-result p1

    .line 130
    .line 131
    if-eqz p1, :cond_7

    .line 132
    .line 133
    iget-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->enableFlashOnStart:Z

    .line 134
    .line 135
    if-eqz p1, :cond_7

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0, v0}, Lcom/jumio/camerax/CameraXManager;->setFlash(Z)V

    .line 139
    .line 140
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 141
    return-object p0

    .line 142
    .line 143
    .line 144
    :cond_8
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->fallbackToCamera1()Lkotlinx/coroutines/x1;

    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 147
    return-object p0
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
.end method

.method private final initPreview(IZ)V
    .locals 9

    .line 1
    .line 2
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 6
    .line 7
    if-eqz v0, :cond_9

    .line 8
    .line 9
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 10
    const/4 v3, 0x1

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/jumio/commons/utils/DeviceRotationManager;->isScreenPortrait()Z

    .line 16
    move-result v2

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    move-object p1, v0

    .line 20
    .line 21
    goto/16 :goto_6

    .line 22
    :cond_0
    move v2, v3

    .line 23
    .line 24
    :goto_0
    check-cast v0, Ljumio/camerax/t;

    .line 25
    .line 26
    iget-object v4, v0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 27
    .line 28
    .line 29
    invoke-interface {v4}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 30
    move-result-object v4

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-interface {v4}, Landroidx/camera/core/CameraInfo;->getSensorRotationDegrees()I

    .line 37
    move-result v4

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v4, v5

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-direct {p0, v2, v4}, Lcom/jumio/camerax/CameraXManager;->updateCameraSettings(ZI)V

    .line 43
    .line 44
    iget-object v0, v0, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getSensorRotationDegrees()I

    .line 54
    move-result v0

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move v0, v5

    .line 57
    .line 58
    :goto_2
    iget-object v4, p0, Lcom/jumio/camerax/CameraXManager;->rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Lcom/jumio/commons/utils/DeviceRotationManager;->getDisplayRotation()I

    .line 64
    move-result v4

    .line 65
    goto :goto_3

    .line 66
    :cond_3
    move v4, v5

    .line 67
    .line 68
    :goto_3
    if-eq v4, v3, :cond_6

    .line 69
    const/4 v3, 0x2

    .line 70
    .line 71
    if-eq v4, v3, :cond_5

    .line 72
    const/4 v3, 0x3

    .line 73
    .line 74
    if-eq v4, v3, :cond_4

    .line 75
    goto :goto_4

    .line 76
    .line 77
    :cond_4
    const/16 v5, 0x10e

    .line 78
    goto :goto_4

    .line 79
    .line 80
    :cond_5
    const/16 v5, 0xb4

    .line 81
    goto :goto_4

    .line 82
    .line 83
    :cond_6
    const/16 v5, 0x5a

    .line 84
    .line 85
    :goto_4
    if-nez p1, :cond_7

    .line 86
    add-int/2addr v0, v5

    .line 87
    .line 88
    rem-int/lit16 v0, v0, 0x168

    .line 89
    .line 90
    rsub-int p1, v0, 0x168

    .line 91
    .line 92
    rem-int/lit16 p1, p1, 0x168

    .line 93
    goto :goto_5

    .line 94
    :cond_7
    sub-int/2addr v0, v5

    .line 95
    .line 96
    add-int/lit16 v0, v0, 0x168

    .line 97
    .line 98
    rem-int/lit16 p1, v0, 0x168

    .line 99
    .line 100
    .line 101
    :goto_5
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getFrameMetadata()Lcom/jumio/commons/camera/Frame$Metadata;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/Frame$Metadata;->setOrientation(I)V

    .line 106
    .line 107
    const/16 p1, 0x11

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/Frame$Metadata;->setImageFormat(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lcom/jumio/commons/camera/Frame$Metadata;->setPortrait(Z)V

    .line 114
    .line 115
    if-eqz p2, :cond_8

    .line 116
    .line 117
    iget-object v3, p0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 118
    .line 119
    new-instance v6, Ljumio/camerax/m;

    .line 120
    const/4 p1, 0x0

    .line 121
    .line 122
    .line 123
    invoke-direct {v6, p0, p1}, Ljumio/camerax/m;-><init>(Lcom/jumio/camerax/CameraXManager;Lkotlin/coroutines/Continuation;)V

    .line 124
    const/4 v7, 0x3

    .line 125
    const/4 v8, 0x0

    .line 126
    const/4 v4, 0x0

    .line 127
    const/4 v5, 0x0

    .line 128
    .line 129
    .line 130
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 131
    .line 132
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    :cond_9
    monitor-exit v1

    .line 134
    return-void

    .line 135
    :goto_6
    monitor-exit v1

    .line 136
    throw p1
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

.method public static synthetic initPreview$default(Lcom/jumio/camerax/CameraXManager;IZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/jumio/camerax/CameraXManager;->initPreview(IZ)V

    .line 9
    return-void
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
.end method

.method private static final reinitCamera$lambda$18(Lcom/jumio/camerax/CameraXManager;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v2, v0, v1}, Lcom/jumio/camerax/CameraXManager;->initCamera$default(Lcom/jumio/camerax/CameraXManager;ZILjava/lang/Object;)V

    .line 7
    return-void
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

.method private static final setup$lambda$15(Lcom/jumio/camerax/CameraXManager;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v2, v0, v1}, Lcom/jumio/camerax/CameraXManager;->initCamera$default(Lcom/jumio/camerax/CameraXManager;ZILjava/lang/Object;)V

    .line 7
    return-void
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

.method private static final stateObserver$lambda$3(Lcom/jumio/camerax/CameraXManager;Landroidx/camera/core/CameraState;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Landroidx/camera/core/CameraState$Type;->OPEN:Landroidx/camera/core/CameraState$Type;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 16
    .line 17
    check-cast v0, Ljumio/camerax/B;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljumio/camerax/B;->b()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getError()Landroidx/camera/core/CameraState$StateError;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v2, Lcom/jumio/analytics/MetaInfo;

    .line 29
    .line 30
    .line 31
    invoke-direct {v2}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    const/16 v4, 0x7c

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    move-result-object v3

    .line 56
    .line 57
    const-string v4, "additionalData"

    .line 58
    .line 59
    .line 60
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    sget-object v3, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 63
    .line 64
    const-string v4, "cameraXError"

    .line 65
    .line 66
    .line 67
    invoke-static {v4, v2}, Lcom/jumio/analytics/MobileEvents;->misc(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v3, "CameraX Error - State "

    .line 76
    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    const-string v3, " - Error: "

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;)V

    .line 101
    .line 102
    sget-object v0, Landroidx/camera/core/CameraState$Type;->PENDING_OPEN:Landroidx/camera/core/CameraState$Type;

    .line 103
    .line 104
    sget-object v2, Landroidx/camera/core/CameraState$Type;->OPENING:Landroidx/camera/core/CameraState$Type;

    .line 105
    .line 106
    .line 107
    filled-new-array {v0, v2, v1}, [Landroidx/camera/core/CameraState$Type;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Landroidx/camera/core/CameraState;->getType()Landroidx/camera/core/CameraState$Type;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 120
    move-result p1

    .line 121
    .line 122
    if-eqz p1, :cond_1

    .line 123
    .line 124
    .line 125
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->fallbackToCamera1()Lkotlinx/coroutines/x1;

    .line 126
    :cond_1
    return-void
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

.method private final unbindUseCases()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/camera/core/ImageAnalysis;->clearAnalyzer()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 10
    .line 11
    check-cast v0, Ljumio/camerax/A;

    .line 12
    .line 13
    iget-object v0, v0, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 22
    .line 23
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 24
    .line 25
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->preview:Landroidx/camera/core/Preview;

    .line 26
    return-void
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

.method private final updateCameraSettings(ZI)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 3
    .line 4
    check-cast v0, Ljumio/camerax/B;

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/camerax/B;->a:Ljava/lang/ref/WeakReference;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroidx/camera/view/PreviewView;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_0
    new-instance v2, Lcom/jumio/commons/camera/Size;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 24
    move-result v3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 28
    move-result v0

    .line 29
    .line 30
    .line 31
    invoke-direct {v2, v3, v0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_1
    :goto_0
    new-instance v2, Lcom/jumio/commons/camera/Size;

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v1, v1}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->isEmpty()Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    goto/16 :goto_7

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysis:Landroidx/camera/core/ImageAnalysis;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Landroidx/camera/core/ImageAnalysis;->getResolutionInfo()Landroidx/camera/core/ResolutionInfo;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroidx/camera/core/ResolutionInfo;->getResolution()Landroid/util/Size;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    .line 69
    move-result v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v4}, Lcom/jumio/commons/camera/Size;->setWidth(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    .line 76
    move-result v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3, v0}, Lcom/jumio/commons/camera/Size;->setHeight(I)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Lcom/jumio/commons/camera/CameraSettings;->setSurface(Lcom/jumio/commons/camera/Size;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    const-string v4, "previewSize"

    .line 93
    .line 94
    .line 95
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getRatio()F

    .line 99
    move-result v4

    .line 100
    .line 101
    const/high16 v5, 0x3f800000    # 1.0f

    .line 102
    .line 103
    cmpg-float v4, v4, v5

    .line 104
    .line 105
    if-nez v4, :cond_4

    .line 106
    .line 107
    new-instance v1, Lcom/jumio/commons/camera/Size;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 111
    move-result v4

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 115
    move-result v3

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v4, v3}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 119
    goto :goto_2

    .line 120
    .line 121
    :cond_4
    if-eqz p1, :cond_5

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3}, Lcom/jumio/commons/camera/Size;->flip()Lcom/jumio/commons/camera/Size;

    .line 125
    move-result-object v1

    .line 126
    goto :goto_2

    .line 127
    :cond_5
    const/4 v4, 0x3

    .line 128
    const/4 v6, 0x0

    .line 129
    .line 130
    .line 131
    invoke-static {v3, v1, v1, v4, v6}, Lcom/jumio/commons/camera/Size;->copy$default(Lcom/jumio/commons/camera/Size;IIILjava/lang/Object;)Lcom/jumio/commons/camera/Size;

    .line 132
    move-result-object v1

    .line 133
    .line 134
    .line 135
    :goto_2
    invoke-virtual {v0, v1}, Lcom/jumio/commons/camera/CameraSettings;->setPreview(Lcom/jumio/commons/camera/Size;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/jumio/commons/camera/Size;->getRatio()F

    .line 143
    move-result v1

    .line 144
    .line 145
    const-string v3, "surfaceSize"

    .line 146
    .line 147
    .line 148
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 152
    move-result v3

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 156
    move-result v2

    .line 157
    .line 158
    if-le v3, v2, :cond_6

    .line 159
    int-to-float v4, v3

    .line 160
    int-to-float v6, v2

    .line 161
    :goto_3
    div-float/2addr v4, v6

    .line 162
    goto :goto_4

    .line 163
    :cond_6
    int-to-float v4, v2

    .line 164
    int-to-float v6, v3

    .line 165
    goto :goto_3

    .line 166
    .line 167
    :goto_4
    cmpg-float v5, v1, v5

    .line 168
    .line 169
    if-nez v5, :cond_8

    .line 170
    .line 171
    if-le v3, v2, :cond_7

    .line 172
    move v2, v3

    .line 173
    goto :goto_6

    .line 174
    :cond_7
    move v3, v2

    .line 175
    goto :goto_6

    .line 176
    .line 177
    :cond_8
    if-eqz p1, :cond_a

    .line 178
    .line 179
    cmpl-float p1, v1, v4

    .line 180
    .line 181
    if-ltz p1, :cond_9

    .line 182
    int-to-float p1, v3

    .line 183
    mul-float/2addr v1, p1

    .line 184
    float-to-int p1, v1

    .line 185
    :goto_5
    move v2, p1

    .line 186
    goto :goto_6

    .line 187
    :cond_9
    int-to-float p1, v2

    .line 188
    div-float/2addr p1, v1

    .line 189
    float-to-int v3, p1

    .line 190
    goto :goto_6

    .line 191
    .line 192
    :cond_a
    cmpg-float p1, v1, v4

    .line 193
    .line 194
    if-gtz p1, :cond_b

    .line 195
    int-to-float p1, v3

    .line 196
    div-float/2addr p1, v1

    .line 197
    float-to-int p1, p1

    .line 198
    goto :goto_5

    .line 199
    :cond_b
    int-to-float p1, v2

    .line 200
    mul-float/2addr v1, p1

    .line 201
    float-to-int v3, v1

    .line 202
    .line 203
    :goto_6
    new-instance p1, Lcom/jumio/commons/camera/Size;

    .line 204
    .line 205
    .line 206
    invoke-direct {p1, v3, v2}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/CameraSettings;->setScaledPreview(Lcom/jumio/commons/camera/Size;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFrontFacing()Z

    .line 213
    move-result p1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/CameraSettings;->setFrontFacing(Z)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, p2}, Lcom/jumio/commons/camera/CameraSettings;->setSensorRotation(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 223
    move-result-object p1

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/CameraSettings;->setCapabilities(Lcom/jumio/commons/camera/CameraCapabilities;)V

    .line 227
    .line 228
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 229
    .line 230
    check-cast p1, Ljumio/camerax/d;

    .line 231
    .line 232
    iget-object p1, p1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 233
    .line 234
    if-eqz p1, :cond_c

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 238
    move-result-object p2

    .line 239
    .line 240
    .line 241
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 242
    move-result-object p2

    .line 243
    .line 244
    const-string v0, "size"

    .line 245
    .line 246
    .line 247
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    iget-object p1, p1, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p1, p2}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->setFrameSize(Lcom/jumio/commons/camera/Size;)V

    .line 253
    :cond_c
    :goto_7
    return-void
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


# virtual methods
.method public adjustCaptureSettings(Lcom/jumio/commons/camera/CaptureSettings;)V
    .locals 2
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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->imageAnalysisCaptureCallback:Ljumio/camerax/a;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljumio/camerax/a;->a()Ljumio/camerax/r;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    check-cast v0, Ljumio/camerax/t;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, v1}, Ljumio/camerax/t;->a(Lcom/jumio/commons/camera/CaptureSettings;Ljumio/camerax/r;)V

    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method public captureImage()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->imageCapture:Landroidx/camera/core/ImageCapture;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    new-instance v2, Ljumio/camerax/k;

    .line 9
    .line 10
    .line 11
    invoke-direct {v2, p0}, Ljumio/camerax/k;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/ImageCapture;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    .line 15
    :cond_0
    return-void
    .line 16
.end method

.method public changeCamera()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFrontFacing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->BACK:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->FRONT:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v0}, Lcom/jumio/camerax/CameraXManager;->setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V

    .line 15
    return-void
    .line 16
.end method

.method public destroy()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 3
    .line 4
    check-cast v0, Ljumio/camerax/z;

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 7
    .line 8
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljumio/camerax/y;->a(Landroidx/lifecycle/Lifecycle$State;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/jumio/camerax/CameraXManager;->unbindUseCases()V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/jumio/camerax/CameraXManager;->setPausePreview(Z)V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->requestedSize:Lcom/jumio/commons/camera/Size;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->context:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 31
    .line 32
    :cond_0
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->context:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 35
    .line 36
    check-cast v1, Ljumio/camerax/d;

    .line 37
    .line 38
    iget-object v2, v1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    iget-object v2, v2, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->release()V

    .line 46
    .line 47
    :cond_1
    iput-object v0, v1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 50
    .line 51
    check-cast v1, Ljumio/camerax/B;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljumio/camerax/B;->b()V

    .line 55
    .line 56
    iget-object v2, v1, Ljumio/camerax/B;->a:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    check-cast v2, Landroidx/camera/view/PreviewView;

    .line 65
    .line 66
    if-eqz v2, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 73
    .line 74
    :cond_2
    iget-object v2, v1, Ljumio/camerax/B;->a:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->clear()V

    .line 80
    .line 81
    :cond_3
    iput-object v0, v1, Ljumio/camerax/B;->a:Ljava/lang/ref/WeakReference;

    .line 82
    .line 83
    iget-object v2, v1, Ljumio/camerax/B;->b:Ljava/lang/ref/WeakReference;

    .line 84
    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->clear()V

    .line 89
    .line 90
    :cond_4
    iput-object v0, v1, Ljumio/camerax/B;->b:Ljava/lang/ref/WeakReference;

    .line 91
    .line 92
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->stateObserver:Landroidx/lifecycle/Observer;

    .line 97
    .line 98
    check-cast v1, Ljumio/camerax/t;

    .line 99
    .line 100
    const-string v3, "observer"

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    iget-object v1, v1, Ljumio/camerax/t;->a:Landroidx/camera/core/Camera;

    .line 106
    .line 107
    .line 108
    invoke-interface {v1}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 109
    move-result-object v1

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    .line 114
    invoke-interface {v1}, Landroidx/camera/core/CameraInfo;->getCameraState()Landroidx/lifecycle/LiveData;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroidx/lifecycle/LiveData;->removeObserver(Landroidx/lifecycle/Observer;)V

    .line 121
    .line 122
    :cond_5
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 123
    .line 124
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 125
    .line 126
    check-cast v1, Ljumio/camerax/A;

    .line 127
    .line 128
    iget-object v2, v1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 134
    .line 135
    :cond_6
    iput-object v0, v1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 136
    .line 137
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraCallback:Ljava/lang/ref/WeakReference;

    .line 138
    return-void
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
            "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 3
    .line 4
    check-cast v0, Ljumio/camerax/d;

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->enableShader(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 14
    :cond_0
    return-void
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
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFrontFacing()Z

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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;

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

.method public getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraCapabilities:Lcom/jumio/commons/camera/CameraCapabilities;

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

.method public getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraSettings:Lcom/jumio/commons/camera/CameraSettings;

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
    iget-boolean v0, p0, Lcom/jumio/camerax/CameraXManager;->collectCameraConnection:Z

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
    iget-boolean v0, p0, Lcom/jumio/camerax/CameraXManager;->focusing:Z

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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->frameMetadata:Lcom/jumio/commons/camera/Frame$Metadata;

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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->previewSize:Lcom/jumio/commons/camera/Size;

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

.method public getVersion()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->version:Ljava/lang/String;

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

.method public isApplicableFor(Lcom/jumio/core/Controller;Lcom/jumio/core/models/ScanPartModel;)Z
    .locals 0
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/ScanPartModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/jumio/core/plugins/Plugin;->isApplicableFor(Lcom/jumio/core/Controller;Lcom/jumio/core/models/ScanPartModel;)Z

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public isExposureAndWhiteBalanceLocked()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Ljumio/camerax/t;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljumio/camerax/t;->d()Z

    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    const/4 v1, 0x0

    .line 18
    :goto_0
    monitor-exit v0

    .line 19
    return v1

    .line 20
    :goto_1
    monitor-exit v0

    .line 21
    throw v1
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

.method public isFlashOn()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v1, Ljumio/camerax/t;

    .line 10
    .line 11
    iget-boolean v1, v1, Ljumio/camerax/t;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    monitor-exit v0

    .line 17
    return v1

    .line 18
    :goto_1
    monitor-exit v0

    .line 19
    throw v1
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

.method public isFrontFacing()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/camerax/CameraXManager;->isFrontFacing:Z

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
    iget-boolean v0, p0, Lcom/jumio/camerax/CameraXManager;->isPausePreview:Z

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

.method public isPreloaded(Lcom/jumio/core/Controller;)Z
    .locals 0
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/plugins/Plugin;->isPreloaded(Lcom/jumio/core/Controller;)Z

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public isUsable(Lcom/jumio/core/Controller;)Z
    .locals 0
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/plugins/Plugin;->isUsable(Lcom/jumio/core/Controller;)Z

    .line 4
    move-result p1

    .line 5
    return p1
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

.method public preload(Lcom/jumio/core/Controller;)V
    .locals 0
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/plugins/Plugin;->preload(Lcom/jumio/core/Controller;)V

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

.method public reinitCamera()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 3
    .line 4
    new-instance v1, Le9/e;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Le9/e;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public requestFocus(II)V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isPausePreview()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v1, "Focus requested on "

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const/16 v1, 0x20

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const/16 v1, 0x21

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "CameraXManager"

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->isEmpty()Z

    .line 51
    move-result v0

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_1
    new-instance v1, Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, Lcom/jumio/commons/camera/MeteringConfig$Builder;-><init>()V

    .line 60
    int-to-float p1, p1

    .line 61
    int-to-float p2, p2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 73
    move-result v0

    .line 74
    int-to-float v0, v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 78
    move-result-object v2

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 86
    move-result v2

    .line 87
    int-to-float v2, v2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p1, p2, v0, v2}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->point(FFFF)Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 91
    const/4 v5, 0x6

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v2, 0x1

    .line 94
    const/4 v3, 0x0

    .line 95
    const/4 v4, 0x0

    .line 96
    .line 97
    .line 98
    invoke-static/range {v1 .. v6}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->mode$default(Lcom/jumio/commons/camera/MeteringConfig$Builder;ZZZILjava/lang/Object;)Lcom/jumio/commons/camera/MeteringConfig$Builder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Lcom/jumio/commons/camera/MeteringConfig$Builder;->build()Lcom/jumio/commons/camera/MeteringConfig;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    iget-object p2, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 105
    .line 106
    if-eqz p2, :cond_2

    .line 107
    .line 108
    check-cast p2, Ljumio/camerax/t;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p1}, Ljumio/camerax/t;->a(Lcom/jumio/commons/camera/MeteringConfig;)V

    .line 112
    :cond_2
    :goto_0
    return-void
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
.end method

.method public requestMetering(Lcom/jumio/commons/camera/MeteringConfig;)V
    .locals 1
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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljumio/camerax/t;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljumio/camerax/t;->a(Lcom/jumio/commons/camera/MeteringConfig;)V

    .line 15
    :cond_0
    return-void
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

.method public setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V
    .locals 4
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
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 14
    .line 15
    sget-object v0, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 16
    .line 17
    const-string v3, "DEFAULT_FRONT_CAMERA"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    check-cast p1, Ljumio/camerax/A;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    const-string v3, "cameraSelector"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    iget-object p1, p1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->hasCamera(Landroidx/camera/core/CameraSelector;)Z

    .line 38
    move-result p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move p1, v1

    .line 41
    .line 42
    :goto_0
    if-eqz p1, :cond_1

    .line 43
    move p1, v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move p1, v2

    .line 46
    .line 47
    :goto_1
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->isFrontFacing:Z

    .line 48
    .line 49
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->preview:Landroidx/camera/core/Preview;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 54
    .line 55
    check-cast v0, Ljumio/camerax/A;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    const-string v3, "useCase"

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    iget-object v0, v0, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p1}, Landroidx/camera/lifecycle/ProcessCameraProvider;->isBound(Landroidx/camera/core/UseCase;)Z

    .line 71
    move-result p1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move p1, v2

    .line 74
    .line 75
    :goto_2
    if-eqz p1, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isPausePreview()Z

    .line 79
    move-result p1

    .line 80
    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 84
    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 88
    .line 89
    check-cast p1, Ljumio/camerax/z;

    .line 90
    .line 91
    iget-object p1, p1, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 92
    .line 93
    iget-object p1, p1, Ljumio/camerax/y;->b:Landroidx/lifecycle/LifecycleRegistry;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroidx/lifecycle/Lifecycle;->getCurrentState()Landroidx/lifecycle/Lifecycle$State;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v0}, Landroidx/lifecycle/Lifecycle$State;->isAtLeast(Landroidx/lifecycle/Lifecycle$State;)Z

    .line 103
    move-result p1

    .line 104
    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 108
    monitor-enter p1

    .line 109
    .line 110
    :try_start_0
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 111
    .line 112
    check-cast v0, Ljumio/camerax/B;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljumio/camerax/B;->a()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lcom/jumio/camerax/CameraXManager;->setFlash(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFrontFacing()Z

    .line 122
    move-result v0

    .line 123
    xor-int/2addr v0, v1

    .line 124
    const/4 v1, 0x0

    .line 125
    const/4 v3, 0x2

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v0, v2, v3, v1}, Lcom/jumio/camerax/CameraXManager;->bindUseCases$default(Lcom/jumio/camerax/CameraXManager;IZILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v0, v2, v3, v1}, Lcom/jumio/camerax/CameraXManager;->initPreview$default(Lcom/jumio/camerax/CameraXManager;IZILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    goto :goto_3

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    goto :goto_4

    .line 135
    :catch_0
    move-exception v0

    .line 136
    .line 137
    .line 138
    :try_start_1
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 139
    .line 140
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    monitor-exit p1

    .line 142
    goto :goto_5

    .line 143
    :goto_4
    monitor-exit p1

    .line 144
    throw v0

    .line 145
    :cond_3
    :goto_5
    return-void
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
.end method

.method public setCollectCameraConnection(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->collectCameraConnection:Z

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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast v0, Ljumio/camerax/t;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljumio/camerax/t;->a(Z)V

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
.end method

.method public setFlash(Z)V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "Flash is turned on: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "CameraXManager"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 22
    monitor-enter v0

    .line 23
    .line 24
    :try_start_0
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->camera:Ljumio/camerax/f;

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v2, p0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    check-cast v1, Ljumio/camerax/t;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1, v2}, Ljumio/camerax/t;->a(ZLjava/util/concurrent/Executor;)V

    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    :goto_0
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0

    .line 42
    throw p1
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

.method public setPausePreview(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->isPausePreview:Z

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
    .locals 2
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
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->cameraXEffectHandler:Ljumio/camerax/e;

    .line 8
    .line 9
    check-cast v1, Ljumio/camerax/d;

    .line 10
    .line 11
    iget-object v1, v1, Ljumio/camerax/d;->a:Ljumio/camerax/c;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    iget-object v0, v1, Ljumio/camerax/c;->a:Ljumio/camerax/p;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/jumio/commons/camera/renderer/CameraRenderer;->setShader(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method public setup(Landroid/content/Context;Lcom/jumio/commons/camera/CameraManagerConfig;Lcom/jumio/commons/camera/CameraCallbackInterface;)V
    .locals 3
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
    const-string v0, "config"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "cameraCallback"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "Setting up "

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    const-class v1, Lcom/jumio/camerax/CameraXManager;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    const-string v1, "CameraXManager"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 47
    .line 48
    .line 49
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    iput-object v0, p0, Lcom/jumio/camerax/CameraXManager;->context:Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 54
    .line 55
    check-cast p1, Ljumio/camerax/A;

    .line 56
    .line 57
    iget-object v0, p1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 58
    .line 59
    if-eqz v0, :cond_0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 63
    :cond_0
    const/4 v0, 0x0

    .line 64
    .line 65
    iput-object v0, p1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 66
    .line 67
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 68
    .line 69
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 70
    .line 71
    check-cast p1, Ljumio/camerax/z;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    const-string v1, "mainScope"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    new-instance v1, Ljumio/camerax/y;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v0}, Ljumio/camerax/y;-><init>(Lkotlinx/coroutines/m0;)V

    .line 85
    .line 86
    iput-object v1, p1, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRotationManager()Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    iput-object p1, p0, Lcom/jumio/camerax/CameraXManager;->rotationManager:Lcom/jumio/commons/utils/DeviceRotationManager;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isFlashOn()Z

    .line 96
    move-result p1

    .line 97
    const/4 v0, 0x0

    .line 98
    const/4 v1, 0x1

    .line 99
    .line 100
    if-nez p1, :cond_2

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getEnableFlashOnStart()Z

    .line 104
    move-result p1

    .line 105
    .line 106
    if-eqz p1, :cond_1

    .line 107
    goto :goto_0

    .line 108
    :cond_1
    move p1, v0

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    :goto_0
    move p1, v1

    .line 111
    .line 112
    :goto_1
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->enableFlashOnStart:Z

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRequestedSize()Lcom/jumio/commons/camera/Size;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    iput-object p1, p0, Lcom/jumio/camerax/CameraXManager;->requestedSize:Lcom/jumio/commons/camera/Size;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getShouldUseShader()Z

    .line 122
    move-result p1

    .line 123
    .line 124
    iput-boolean p1, p0, Lcom/jumio/camerax/CameraXManager;->shouldUseShader:Z

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Lcom/jumio/commons/camera/CameraManagerConfig;->getRequestedCameraFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    sget-object p2, Lcom/jumio/sdk/enums/JumioCameraFacing;->FRONT:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 131
    .line 132
    if-ne p1, p2, :cond_4

    .line 133
    .line 134
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraProvider:Ljumio/camerax/o;

    .line 135
    .line 136
    sget-object p2, Landroidx/camera/core/CameraSelector;->DEFAULT_FRONT_CAMERA:Landroidx/camera/core/CameraSelector;

    .line 137
    .line 138
    const-string v2, "DEFAULT_FRONT_CAMERA"

    .line 139
    .line 140
    .line 141
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    check-cast p1, Ljumio/camerax/A;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    const-string v2, "cameraSelector"

    .line 149
    .line 150
    .line 151
    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    iget-object p1, p1, Ljumio/camerax/A;->a:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 154
    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, p2}, Landroidx/camera/lifecycle/ProcessCameraProvider;->hasCamera(Landroidx/camera/core/CameraSelector;)Z

    .line 159
    move-result p1

    .line 160
    goto :goto_2

    .line 161
    :cond_3
    move p1, v1

    .line 162
    .line 163
    :goto_2
    if-eqz p1, :cond_4

    .line 164
    move v0, v1

    .line 165
    .line 166
    :cond_4
    iput-boolean v0, p0, Lcom/jumio/camerax/CameraXManager;->isFrontFacing:Z

    .line 167
    .line 168
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 169
    .line 170
    check-cast p1, Ljumio/camerax/z;

    .line 171
    .line 172
    iget-object p1, p1, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 173
    .line 174
    sget-object p2, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, p2}, Ljumio/camerax/y;->a(Landroidx/lifecycle/Lifecycle$State;)V

    .line 178
    .line 179
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 180
    .line 181
    new-instance p2, Ljumio/camerax/n;

    .line 182
    .line 183
    .line 184
    invoke-direct {p2, p0}, Ljumio/camerax/n;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    .line 185
    .line 186
    check-cast p1, Ljumio/camerax/B;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    const-string p1, "focusCallback"

    .line 192
    .line 193
    .line 194
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 197
    .line 198
    .line 199
    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 200
    .line 201
    iput-object p1, p0, Lcom/jumio/camerax/CameraXManager;->cameraCallback:Ljava/lang/ref/WeakReference;

    .line 202
    .line 203
    iget-object p1, p0, Lcom/jumio/camerax/CameraXManager;->executor:Ljava/util/concurrent/Executor;

    .line 204
    .line 205
    new-instance p2, Le9/f;

    .line 206
    .line 207
    .line 208
    invoke-direct {p2, p0}, Le9/f;-><init>(Lcom/jumio/camerax/CameraXManager;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 212
    return-void
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
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
.end method

.method public setupUiViews(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V
    .locals 1
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
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraUi:Ljumio/camerax/q;

    .line 13
    .line 14
    check-cast v0, Ljumio/camerax/B;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1, p2}, Ljumio/camerax/B;->a(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 18
    return-void
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

.method public startPreview()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->cameraAccessLock:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    const-string v1, "CameraXManager"

    .line 6
    .line 7
    const-string v2, "Starting preview"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/camerax/CameraXManager;->isPausePreview()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lcom/jumio/camerax/CameraXManager;->setPausePreview(Z)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v1}, Lcom/jumio/camerax/CameraXManager;->initCamera(Z)V

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    iget-object v1, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 29
    .line 30
    check-cast v1, Ljumio/camerax/z;

    .line 31
    .line 32
    iget-object v1, v1, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 33
    .line 34
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->RESUMED:Landroidx/lifecycle/Lifecycle$State;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljumio/camerax/y;->a(Landroidx/lifecycle/Lifecycle$State;)V

    .line 38
    .line 39
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    monitor-exit v0

    .line 41
    return-void

    .line 42
    :goto_1
    monitor-exit v0

    .line 43
    throw v1
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

.method public stopPreview(Z)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "CameraXManager"

    .line 3
    .line 4
    const-string v1, "Stopping preview"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->mainScope:Lkotlinx/coroutines/m0;

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Lkotlinx/coroutines/m0;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 16
    .line 17
    const-string v2, "Preview stopped"

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlinx/coroutines/z1;->g(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/jumio/camerax/CameraXManager;->setFlash(Z)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jumio/camerax/CameraXManager;->lifecycleHandler:Ljumio/camerax/g;

    .line 30
    .line 31
    check-cast v0, Ljumio/camerax/z;

    .line 32
    .line 33
    iget-object v0, v0, Ljumio/camerax/z;->a:Ljumio/camerax/y;

    .line 34
    .line 35
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljumio/camerax/y;->a(Landroidx/lifecycle/Lifecycle$State;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lcom/jumio/camerax/CameraXManager;->setPausePreview(Z)V

    .line 42
    return-void
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

.method public unload()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/plugins/Plugin;->unload()V

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
.end method
