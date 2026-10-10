.class public abstract Lcom/jumio/core/views/CameraScanView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleObserver;
.implements Lcom/jumio/core/interfaces/ScanViewInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/views/CameraScanView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008&\u0018\u0000 \u0093\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0092\u0001\u0093\u0001B\'\u0008\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010Z\u001a\u00020\tH\u0014J\u0010\u0010[\u001a\u00020X2\u0006\u0010\u000c\u001a\u00020\rH\u0017J\u0008\u0010\\\u001a\u00020XH\u0016J\u0008\u0010]\u001a\u00020XH\u0002J\u0010\u0010^\u001a\u00020X2\u0006\u0010(\u001a\u00020)H\u0003J\u0010\u0010_\u001a\u00020X2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010`\u001a\u00020)2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u001b\u0010a\u001a\u0004\u0018\u00010!2\n\u0008\u0003\u0010b\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0002\u0010cJ)\u0010d\u001a\u00020X2\u0006\u0010e\u001a\u00020:2\u0008\u0008\u0002\u0010f\u001a\u00020:2\u0008\u0008\u0002\u0010g\u001a\u00020:H\u0000\u00a2\u0006\u0002\u0008hJ\u0015\u0010i\u001a\u00020X2\u0006\u0010j\u001a\u00020:H\u0000\u00a2\u0006\u0002\u0008kJ\u0015\u0010l\u001a\u00020X2\u0006\u0010m\u001a\u00020nH\u0000\u00a2\u0006\u0002\u0008oJ\u0015\u0010p\u001a\u00020X2\u0006\u0010q\u001a\u00020rH\u0000\u00a2\u0006\u0002\u0008sJE\u0010t\u001a\u00020X2\u0006\u0010u\u001a\u00020:2\u0016\u0008\u0002\u0010v\u001a\u0010\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020X\u0018\u00010w2\u0016\u0008\u0002\u0010y\u001a\u0010\u0012\u0004\u0012\u00020x\u0012\u0004\u0012\u00020X\u0018\u00010wH\u0000\u00a2\u0006\u0002\u0008zJ\u0015\u0010{\u001a\u00020X2\u0006\u0010|\u001a\u00020:H\u0001\u00a2\u0006\u0002\u0008}J\u001b\u0010~\u001a\u0004\u0018\u00010X2\u0006\u0010\u007f\u001a\u00020:H\u0000\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u001e\u0010\u0082\u0001\u001a\u0004\u0018\u00010X2\u0008\u0010\u0083\u0001\u001a\u00030\u0084\u0001H\u0000\u00a2\u0006\u0006\u0008\u0085\u0001\u0010\u0086\u0001J\u0014\u0010\u0087\u0001\u001a\u0004\u0018\u00010XH\u0000\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u0018\u0010\u008a\u0001\u001a\u00020X2\u0007\u0010\u008b\u0001\u001a\u00020\u0016H\u0000\u00a2\u0006\u0003\u0008\u008c\u0001J\u000f\u0010\u008d\u0001\u001a\u00020XH\u0000\u00a2\u0006\u0003\u0008\u008e\u0001J\t\u0010\u008f\u0001\u001a\u00020XH\u0016J\u0008\u0010\u007f\u001a\u00020XH\u0016J\t\u0010\u0090\u0001\u001a\u00020XH\u0016J\t\u0010\u0091\u0001\u001a\u00020XH\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\tX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u0016\u0010.\u001a\u0004\u0018\u00010\u00118@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100R\u0012\u00101\u001a\u000202X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\u0018\u00105\u001a\u000202X\u00a6\u000e\u00a2\u0006\u000c\u001a\u0004\u00086\u00104\"\u0004\u00087\u00108R\u0011\u00109\u001a\u00020:8F\u00a2\u0006\u0006\u001a\u0004\u00089\u0010;R&\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020=8V@VX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR\u0014\u0010C\u001a\u00020:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010;R\u0014\u0010E\u001a\u00020:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010;R$\u0010G\u001a\u00020:2\u0006\u0010<\u001a\u00020:8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008H\u0010;\"\u0004\u0008I\u0010JR\u0014\u0010K\u001a\u00020:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010;R\u0014\u0010L\u001a\u00020:8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008M\u0010;R\u0014\u0010N\u001a\u00020:8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010;R\u0016\u0010P\u001a\u0004\u0018\u00010Q8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008R\u0010SR$\u0010T\u001a\u00020:2\u0006\u0010<\u001a\u00020:8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008U\u0010;\"\u0004\u0008V\u0010J\u00a8\u0006\u0094\u0001"
    }
    d2 = {
        "Lcom/jumio/core/views/CameraScanView;",
        "Landroid/widget/RelativeLayout;",
        "Landroidx/lifecycle/LifecycleObserver;",
        "Lcom/jumio/core/interfaces/ScanViewInterface;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyle",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "scanPart",
        "Lcom/jumio/sdk/scanpart/JumioScanPart;",
        "layoutListener",
        "Lcom/jumio/core/views/CameraLayoutListener;",
        "scanOverlayView",
        "Lcom/jumio/core/gui/DrawView;",
        "cameraCallback",
        "Lcom/jumio/commons/camera/CameraCallbackInterface;",
        "userActionOverrides",
        "",
        "Lcom/jumio/core/views/CameraScanView$Companion$UserActionOverride;",
        "cameraScanPartInterface",
        "Lcom/jumio/core/interfaces/CameraScanPartInterface;",
        "getCameraScanPartInterface",
        "()Lcom/jumio/core/interfaces/CameraScanPartInterface;",
        "brandingLogoTopMargin",
        "getBrandingLogoTopMargin",
        "()I",
        "setBrandingLogoTopMargin",
        "(I)V",
        "brandingView",
        "Lcom/jumio/core/views/BrandingView;",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "getCameraSettings$jumio_core_release",
        "()Lcom/jumio/commons/camera/CameraSettings;",
        "setCameraSettings$jumio_core_release",
        "(Lcom/jumio/commons/camera/CameraSettings;)V",
        "cameraManager",
        "Lcom/jumio/commons/camera/CameraManagerInterface;",
        "getCameraManager$jumio_core_release",
        "()Lcom/jumio/commons/camera/CameraManagerInterface;",
        "setCameraManager$jumio_core_release",
        "(Lcom/jumio/commons/camera/CameraManagerInterface;)V",
        "drawView",
        "getDrawView$jumio_core_release",
        "()Lcom/jumio/core/gui/DrawView;",
        "minRatio",
        "",
        "getMinRatio",
        "()F",
        "ratio",
        "getRatio",
        "setRatio",
        "(F)V",
        "isAttached",
        "",
        "()Z",
        "value",
        "Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "cameraFacing",
        "getCameraFacing",
        "()Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "setCameraFacing",
        "(Lcom/jumio/sdk/enums/JumioCameraFacing;)V",
        "hasMultipleCameras",
        "getHasMultipleCameras",
        "hasFlash",
        "getHasFlash",
        "extraction",
        "getExtraction",
        "setExtraction",
        "(Z)V",
        "isShutterEnabled",
        "isFlashOn",
        "isFlashOn$jumio_core_release",
        "isExposureAndWhiteBalanceLocked",
        "isExposureAndWhiteBalanceLocked$jumio_core_release",
        "cameraCapabilities",
        "Lcom/jumio/commons/camera/CameraCapabilities;",
        "getCameraCapabilities$jumio_core_release",
        "()Lcom/jumio/commons/camera/CameraCapabilities;",
        "collectCameraConnection",
        "getCollectCameraConnection$jumio_core_release",
        "setCollectCameraConnection$jumio_core_release",
        "onMeasure",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "attach",
        "detach",
        "cameraFallback",
        "setupCameraUi",
        "initCameraManager",
        "selectCameraManager",
        "generatePoweredByLogo",
        "textColor",
        "(Ljava/lang/Integer;)Lcom/jumio/core/views/BrandingView;",
        "setFlash",
        "flash",
        "sendAnalytics",
        "isInternal",
        "setFlash$jumio_core_release",
        "setExposureAndWhiteBalanceLock",
        "lock",
        "setExposureAndWhiteBalanceLock$jumio_core_release",
        "adjustCameraSettings",
        "settings",
        "Lcom/jumio/commons/camera/CaptureSettings;",
        "adjustCameraSettings$jumio_core_release",
        "setShader",
        "shaderProvider",
        "Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;",
        "setShader$jumio_core_release",
        "enableShader",
        "enable",
        "onEnable",
        "Lkotlin/Function1;",
        "Lcom/jumio/commons/camera/renderer/opengl/GLUtils$Program2D;",
        "onRender",
        "enableShader$jumio_core_release",
        "update",
        "request",
        "update$jumio_core_release",
        "stopPreview",
        "pause",
        "stopPreview$jumio_core_release",
        "(Z)Lkotlin/Unit;",
        "fillImageData",
        "data",
        "Lcom/jumio/commons/camera/ImageData;",
        "fillImageData$jumio_core_release",
        "(Lcom/jumio/commons/camera/ImageData;)Lkotlin/Unit;",
        "captureImage",
        "captureImage$jumio_core_release",
        "()Lkotlin/Unit;",
        "registerUserActionOverride",
        "actionOverride",
        "registerUserActionOverride$jumio_core_release",
        "clearUserActionOverrides",
        "clearUserActionOverrides$jumio_core_release",
        "resume",
        "switchCamera",
        "takePicture",
        "ScanViewCameraCallback",
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
        "SMAP\nCameraScanView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraScanView.kt\ncom/jumio/core/views/CameraScanView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExtensions.kt\ncom/jumio/kotlin/KotlinExtensionsKt\n*L\n1#1,507:1\n1#2:508\n17#3:509\n*S KotlinDebug\n*F\n+ 1 CameraScanView.kt\ncom/jumio/core/views/CameraScanView\n*L\n318#1:509\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/core/views/CameraScanView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DEFAULT_FRAME_RATE_THRESHOLD:F = 0.8f


# instance fields
.field public a:Lcom/jumio/sdk/scanpart/JumioScanPart;

.field public final b:Ljumio/core/a0;

.field public c:Lcom/jumio/core/gui/DrawView;

.field public d:Ljumio/core/d0;

.field public final e:Lcom/jumio/core/util/ConcurrentMutableList;

.field public f:I

.field public g:Lcom/jumio/core/views/BrandingView;

.field public h:Lcom/jumio/commons/camera/CameraSettings;

.field public i:Lcom/jumio/commons/camera/CameraManagerInterface;

.field public j:Lcom/jumio/sdk/enums/JumioCameraFacing;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/views/CameraScanView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/views/CameraScanView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/views/CameraScanView;->Companion:Lcom/jumio/core/views/CameraScanView$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/views/CameraScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/views/CameraScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Ljumio/core/a0;

    invoke-direct {p1}, Ljumio/core/a0;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->b:Ljumio/core/a0;

    .line 6
    invoke-static {}, Lcom/jumio/core/util/ConcurrentMutableListKt;->concurrentMutableListOf()Lcom/jumio/core/util/ConcurrentMutableList;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 7
    new-instance p1, Lcom/jumio/commons/camera/CameraSettings;

    invoke-direct {p1}, Lcom/jumio/commons/camera/CameraSettings;-><init>()V

    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->h:Lcom/jumio/commons/camera/CameraSettings;

    .line 8
    sget-object p1, Lcom/jumio/sdk/enums/JumioCameraFacing;->BACK:Lcom/jumio/sdk/enums/JumioCameraFacing;

    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/jumio/core/views/CameraScanView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final a()Lcom/jumio/commons/camera/CameraManagerInterface;
    .locals 1

    .line 39
    new-instance v0, Lcom/jumio/commons/camera/Camera1Manager;

    invoke-direct {v0}, Lcom/jumio/commons/camera/Camera1Manager;-><init>()V

    return-object v0
.end method

.method public static a(Lcom/jumio/sdk/scanpart/JumioScanPart;)Lcom/jumio/commons/camera/CameraManagerInterface;
    .locals 2

    .line 33
    invoke-virtual {p0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    move-result-object p0

    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object p0

    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object p0

    .line 34
    const-class v0, Lcom/jumio/core/camera/CameraManagerModel;

    invoke-virtual {p0, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/camera/CameraManagerModel;

    .line 35
    iget-boolean v0, v0, Lcom/jumio/core/camera/CameraManagerModel;->a:Z

    if-eqz v0, :cond_0

    .line 36
    new-instance p0, Lcom/jumio/commons/camera/Camera1Manager;

    invoke-direct {p0}, Lcom/jumio/commons/camera/Camera1Manager;-><init>()V

    return-object p0

    .line 37
    :cond_0
    const-class v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {p0, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p0

    check-cast p0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {p0}, Lcom/jumio/core/models/SettingsModel;->getUseCamera1()Z

    move-result p0

    if-eqz p0, :cond_1

    new-instance p0, Lcom/jumio/commons/camera/Camera1Manager;

    invoke-direct {p0}, Lcom/jumio/commons/camera/Camera1Manager;-><init>()V

    return-object p0

    .line 38
    :cond_1
    sget-object p0, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    new-instance v0, Ly9/k;

    invoke-direct {v0}, Ly9/k;-><init>()V

    const-class v1, Lcom/jumio/commons/camera/CameraManagerInterface;

    invoke-virtual {p0, v1, v0}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/jumio/commons/camera/CameraManagerInterface;

    return-object p0
.end method

.method public static final a(Lcom/jumio/core/views/CameraScanView;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/jumio/core/views/CameraScanView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->d:Ljumio/core/d0;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, v0, Ljumio/core/d0;->a:Ljumio/core/c0;

    invoke-interface {v1}, Ljumio/core/c0;->cameraAvailable()V

    .line 3
    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->h:Lcom/jumio/commons/camera/CameraSettings;

    invoke-virtual {v0, v1}, Ljumio/core/d0;->onPreviewAvailable(Lcom/jumio/commons/camera/CameraSettings;)V

    .line 4
    :cond_0
    iget-object p0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    if-eqz p0, :cond_1

    invoke-interface {p0}, Lcom/jumio/commons/camera/CameraManagerInterface;->startPreview()V

    :cond_1
    return-void
.end method

.method public static final a(Lcom/jumio/core/views/CameraScanView;Lcom/jumio/commons/camera/CameraManagerInterface;Landroid/view/View;)V
    .locals 1

    .line 10
    iget-object p2, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    sget-object v0, Lcom/jumio/core/views/a;->b:Lcom/jumio/core/views/a;

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    invoke-interface {p1, p2, p0}, Lcom/jumio/commons/camera/CameraManagerInterface;->requestFocus(II)V

    return-void
.end method

.method public static final a(Lcom/jumio/core/views/CameraScanView;Lcom/jumio/commons/camera/CameraManagerInterface;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 12
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    float-to-int p2, p2

    .line 13
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 14
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result p3

    const/4 v1, 0x0

    if-nez p3, :cond_1

    .line 15
    iget-object p0, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    sget-object p3, Lcom/jumio/core/views/a;->b:Lcom/jumio/core/views/a;

    invoke-interface {p0, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    return v1

    .line 16
    :cond_0
    invoke-interface {p1, p2, v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->requestFocus(II)V

    :cond_1
    return v1
.end method

.method public static final access$cameraFallback(Lcom/jumio/core/views/CameraScanView;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraManagerInterface;->stopPreview(Z)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->destroy()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    new-instance v2, Lcom/jumio/core/camera/CameraManagerModel;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, v1}, Lcom/jumio/core/camera/CameraManagerModel;-><init>(Z)V

    .line 39
    .line 40
    const-class v1, Lcom/jumio/core/camera/CameraManagerModel;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, v2}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 44
    .line 45
    :cond_1
    new-instance v0, Lcom/jumio/commons/camera/Camera1Manager;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0}, Lcom/jumio/commons/camera/Camera1Manager;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v0}, Lcom/jumio/core/views/CameraScanView;->setupCameraUi(Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lcom/jumio/core/views/CameraScanView;->a(Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 58
    return-void
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

.method public static synthetic enableShader$jumio_core_release$default(Lcom/jumio/core/views/CameraScanView;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    if-nez p5, :cond_2

    .line 3
    .line 4
    and-int/lit8 p5, p4, 0x2

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p5, :cond_0

    .line 8
    move-object p2, v0

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 11
    .line 12
    if-eqz p4, :cond_1

    .line 13
    move-object p3, v0

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/core/views/CameraScanView;->enableShader$jumio_core_release(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 20
    .line 21
    const-string p1, "Super calls with default arguments not supported in this target, function: enableShader"

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p0
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

.method private final getCameraScanPartInterface()Ljumio/core/c0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 9
    move-result-object v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    :goto_0
    instance-of v2, v0, Ljumio/core/c0;

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    check-cast v0, Ljumio/core/c0;

    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object v1
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

.method public static synthetic setFlash$jumio_core_release$default(Lcom/jumio/core/views/CameraScanView;ZZZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    if-nez p5, :cond_2

    .line 3
    .line 4
    and-int/lit8 p5, p4, 0x2

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    const/4 p2, 0x1

    .line 8
    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    const/4 p3, 0x0

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jumio/core/views/CameraScanView;->setFlash$jumio_core_release(ZZZ)V

    .line 16
    return-void

    .line 17
    .line 18
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: setFlash"

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 24
    throw p0
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

.method private final setupCameraUi(Lcom/jumio/commons/camera/CameraManagerInterface;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    const-string v1, "getContext(...)"

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    new-instance v2, Ly9/g;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, p0}, Ly9/g;-><init>(Lcom/jumio/core/views/CameraScanView;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1, v0, v2}, Lcom/jumio/commons/camera/CameraManagerInterface;->setupUiViews(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    new-instance v0, Lcom/jumio/core/gui/DrawView;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, v2}, Lcom/jumio/core/gui/DrawView;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 40
    .line 41
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 42
    const/4 v3, -0x1

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    iget-object v2, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 51
    const/4 v3, 0x0

    .line 52
    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 57
    move-result-object v2

    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v2, v3

    .line 60
    .line 61
    :goto_0
    instance-of v4, v2, Lcom/jumio/core/gui/DrawView$DrawViewInterface;

    .line 62
    .line 63
    if-eqz v4, :cond_2

    .line 64
    .line 65
    check-cast v2, Lcom/jumio/core/gui/DrawView$DrawViewInterface;

    .line 66
    goto :goto_1

    .line 67
    :cond_2
    move-object v2, v3

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-virtual {v0, v2}, Lcom/jumio/core/gui/DrawView;->setDrawViewInterface(Lcom/jumio/core/gui/DrawView$DrawViewInterface;)V

    .line 71
    .line 72
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->g:Lcom/jumio/core/views/BrandingView;

    .line 75
    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 79
    .line 80
    if-eqz v0, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 84
    move-result-object v0

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    move-object v0, v3

    .line 87
    .line 88
    :goto_2
    instance-of v2, v0, Ljumio/core/o;

    .line 89
    .line 90
    if-eqz v2, :cond_4

    .line 91
    .line 92
    check-cast v0, Ljumio/core/o;

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    move-object v0, v3

    .line 95
    .line 96
    :goto_3
    if-eqz v0, :cond_6

    .line 97
    .line 98
    .line 99
    invoke-interface {v0}, Ljumio/core/o;->getPreferredBrandTextColor()I

    .line 100
    move-result v0

    .line 101
    .line 102
    .line 103
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    if-eqz v2, :cond_6

    .line 107
    .line 108
    .line 109
    invoke-interface {v2}, Ljumio/core/c0;->isBrandingEnabled()Z

    .line 110
    move-result v2

    .line 111
    const/4 v4, 0x1

    .line 112
    .line 113
    if-ne v2, v4, :cond_6

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    const/16 v3, 0x18

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v2}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 126
    move-result v2

    .line 127
    .line 128
    new-instance v3, Lcom/jumio/core/views/BrandingView;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    .line 135
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v3, v4, v0}, Lcom/jumio/core/views/BrandingView;-><init>(Landroid/content/Context;I)V

    .line 139
    .line 140
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 141
    const/4 v1, -0x2

    .line 142
    .line 143
    .line 144
    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 145
    .line 146
    const/16 v1, 0xa

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 150
    .line 151
    const/16 v1, 0xe

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 155
    .line 156
    iget v1, p0, Lcom/jumio/core/views/CameraScanView;->f:I

    .line 157
    .line 158
    if-le v1, v2, :cond_5

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 162
    move-result v4

    .line 163
    .line 164
    mul-int/lit8 v5, v2, 0x2

    .line 165
    sub-int/2addr v4, v5

    .line 166
    .line 167
    if-ge v1, v4, :cond_5

    .line 168
    .line 169
    iget v1, p0, Lcom/jumio/core/views/CameraScanView;->f:I

    .line 170
    .line 171
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 172
    goto :goto_4

    .line 173
    .line 174
    :cond_5
    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 175
    .line 176
    .line 177
    :goto_4
    invoke-virtual {v3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 178
    .line 179
    :cond_6
    iput-object v3, p0, Lcom/jumio/core/views/CameraScanView;->g:Lcom/jumio/core/views/BrandingView;

    .line 180
    move-object v0, v3

    .line 181
    .line 182
    :cond_7
    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 186
    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 191
    .line 192
    :cond_8
    new-instance v0, Ly9/h;

    .line 193
    .line 194
    .line 195
    invoke-direct {v0, p0, p1}, Ly9/h;-><init>(Lcom/jumio/core/views/CameraScanView;Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    .line 200
    new-instance v0, Ly9/i;

    .line 201
    .line 202
    .line 203
    invoke-direct {v0, p0, p1}, Ly9/i;-><init>(Lcom/jumio/core/views/CameraScanView;Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 207
    return-void
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


# virtual methods
.method public final a(Lcom/jumio/commons/camera/CameraManagerInterface;)V
    .locals 9

    .line 17
    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 18
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->d:Ljumio/core/d0;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    .line 19
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    move-result-object v2

    instance-of v3, v2, Ljumio/core/c0;

    if-eqz v3, :cond_0

    check-cast v2, Ljumio/core/c0;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    goto :goto_1

    .line 20
    :cond_1
    new-instance v3, Lcom/jumio/commons/camera/CameraManagerConfig;

    .line 21
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getRotationManager()Lcom/jumio/commons/utils/DeviceRotationManager;

    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->isFlashOn$jumio_core_release()Z

    move-result v5

    .line 23
    invoke-interface {v2}, Ljumio/core/c0;->getPreviewSize()Lcom/jumio/commons/camera/Size;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/jumio/commons/camera/Size;

    const/16 v6, 0x780

    const/16 v7, 0x438

    invoke-direct {v0, v6, v7}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    :cond_2
    move-object v6, v0

    .line 24
    invoke-interface {v2}, Ljumio/core/c0;->getDefaultFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;

    move-result-object v7

    .line 25
    invoke-interface {v2}, Ljumio/core/c0;->getShouldUseShader()Z

    move-result v8

    .line 26
    invoke-direct/range {v3 .. v8}, Lcom/jumio/commons/camera/CameraManagerConfig;-><init>(Lcom/jumio/commons/utils/DeviceRotationManager;ZLcom/jumio/commons/camera/Size;Lcom/jumio/sdk/enums/JumioCameraFacing;Z)V

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v2, "getContext(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, v3, v1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setup(Landroid/content/Context;Lcom/jumio/commons/camera/CameraManagerConfig;Lcom/jumio/commons/camera/CameraCallbackInterface;)V

    .line 28
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->b:Ljumio/core/a0;

    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 29
    invoke-virtual {v0}, Ljumio/core/a0;->a()V

    .line 30
    iput-object v1, v0, Ljumio/core/a0;->e:Landroid/view/View;

    .line 31
    iput-object p1, v0, Ljumio/core/a0;->d:Lcom/jumio/commons/camera/CameraManagerInterface;

    if-eqz v1, :cond_3

    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final adjustCameraSettings$jumio_core_release(Lcom/jumio/commons/camera/CaptureSettings;)V
    .locals 1
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
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->adjustCaptureSettings(Lcom/jumio/commons/camera/CaptureSettings;)V

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

.method public attach(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 2
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    .line 2
    const-string v0, "scanPart"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->isAttached()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->h:Lcom/jumio/commons/camera/CameraSettings;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/jumio/commons/camera/CameraSettings;->isEmpty()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->d:Ljumio/core/d0;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance p1, Ly9/j;

    .line 38
    .line 39
    .line 40
    invoke-direct {p1, p0}, Ly9/j;-><init>(Lcom/jumio/core/views/CameraScanView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    return-void

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->detach()V

    .line 48
    .line 49
    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    instance-of v1, v0, Ljumio/core/c0;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    check-cast v0, Ljumio/core/c0;

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v0, 0x0

    .line 62
    .line 63
    :goto_0
    if-nez v0, :cond_2

    .line 64
    goto :goto_1

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-interface {v0, p0}, Ljumio/core/c0;->setScanView(Lcom/jumio/core/views/CameraScanView;)V

    .line 68
    const/4 v1, 0x1

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v1}, Ljumio/core/c0;->isPresented(Z)V

    .line 72
    .line 73
    new-instance v1, Ljumio/core/d0;

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, p0, v0}, Ljumio/core/d0;-><init>(Lcom/jumio/core/views/CameraScanView;Ljumio/core/c0;)V

    .line 77
    .line 78
    iput-object v1, p0, Lcom/jumio/core/views/CameraScanView;->d:Ljumio/core/d0;

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-static {p1}, Lcom/jumio/core/views/CameraScanView;->a(Lcom/jumio/sdk/scanpart/JumioScanPart;)Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 82
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, p1}, Lcom/jumio/core/views/CameraScanView;->setupCameraUi(Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/jumio/core/views/CameraScanView;->a(Lcom/jumio/commons/camera/CameraManagerInterface;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 92
    :catch_0
    :goto_1
    return-void
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

.method public final captureImage$jumio_core_release()Lkotlin/Unit;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->captureImage()V

    .line 8
    .line 9
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final clearUserActionOverrides$jumio_core_release()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

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
.end method

.method public detach()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->b:Ljumio/core/a0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljumio/core/a0;->a()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraManagerInterface;->stopPreview(Z)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->destroy()V

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    .line 19
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v2}, Ljumio/core/c0;->isPresented(Z)V

    .line 30
    .line 31
    :cond_1
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->d:Ljumio/core/d0;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->a:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 34
    return-void
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

.method public final enableShader$jumio_core_release(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2, p3}, Lcom/jumio/commons/camera/CameraManagerInterface;->enableShader(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 8
    :cond_0
    return-void
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

.method public final fillImageData$jumio_core_release(Lcom/jumio/commons/camera/ImageData;)Lkotlin/Unit;
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/ImageData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->fillImageData(Lcom/jumio/commons/camera/ImageData;)V

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final getBrandingLogoTopMargin()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/views/CameraScanView;->f:I

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

.method public final getCameraCapabilities$jumio_core_release()Lcom/jumio/commons/camera/CameraCapabilities;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getCameraFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isFrontFacing()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->FRONT:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->BACK:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 16
    .line 17
    :goto_0
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_1
    sget-object v0, Lcom/jumio/sdk/enums/JumioCameraFacing;->BACK:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 20
    .line 21
    :cond_2
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljumio/core/c0;->getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-nez v1, :cond_3

    .line 42
    const/4 v1, 0x0

    .line 43
    .line 44
    aget-object v0, v0, v1

    .line 45
    .line 46
    iput-object v0, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 47
    .line 48
    iget-object v1, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V

    .line 54
    .line 55
    :cond_3
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 56
    return-object v0
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

.method public final getCameraManager$jumio_core_release()Lcom/jumio/commons/camera/CameraManagerInterface;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

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

.method public final getCameraSettings$jumio_core_release()Lcom/jumio/commons/camera/CameraSettings;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->h:Lcom/jumio/commons/camera/CameraSettings;

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

.method public final getCollectCameraConnection$jumio_core_release()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getCollectCameraConnection()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getDrawView$jumio_core_release()Lcom/jumio/core/gui/DrawView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

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

.method public getExtraction()Z
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljumio/core/c0;->getEnableExtraction()Z

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    return v2

    .line 16
    :cond_0
    return v1
.end method

.method public getHasFlash()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraCapabilities;->getHasFlash()Z

    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-ne v0, v2, :cond_0

    .line 19
    return v2

    .line 20
    :cond_0
    return v1
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

.method public getHasMultipleCameras()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraCapabilities;->getHasMultipleCameras()Z

    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljumio/core/c0;->getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    array-length v0, v0

    .line 31
    .line 32
    if-le v0, v1, :cond_0

    .line 33
    return v1

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    return v0
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

.method public abstract getMinRatio()F
.end method

.method public abstract getRatio()F
.end method

.method public final isAttached()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
.end method

.method public final isExposureAndWhiteBalanceLocked$jumio_core_release()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isExposureAndWhiteBalanceLocked()Z

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    return v2

    .line 14
    :cond_0
    return v1
    .line 15
    .line 16
.end method

.method public final isFlashOn$jumio_core_release()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isFlashOn()Z

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    return v2

    .line 14
    :cond_0
    return v1
    .line 15
    .line 16
.end method

.method public isShutterEnabled()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljumio/core/c0;->getShowShutterButton()Z

    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
.end method

.method public onMeasure(II)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    move-result p2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 28
    move-result-object v2

    .line 29
    .line 30
    iget v2, v2, Landroid/content/res/Configuration;->orientation:I

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    .line 34
    if-eq v2, v4, :cond_1

    .line 35
    .line 36
    sget-object v2, Lcom/jumio/commons/utils/DeviceRotationManager;->Companion:Lcom/jumio/commons/utils/DeviceRotationManager$Companion;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    const-string v6, "getContext(...)"

    .line 43
    .line 44
    .line 45
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v5}, Lcom/jumio/commons/utils/DeviceRotationManager$Companion;->isTabletDevice(Landroid/content/Context;)Z

    .line 49
    move-result v2

    .line 50
    .line 51
    if-eqz v2, :cond_0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v2, v3

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    move v2, v4

    .line 56
    :goto_1
    const/4 v5, 0x0

    .line 57
    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 62
    move-result v6

    .line 63
    .line 64
    cmpg-float v6, v6, v5

    .line 65
    .line 66
    if-nez v6, :cond_2

    .line 67
    goto :goto_2

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 71
    move-result v6

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getMinRatio()F

    .line 75
    move-result v7

    .line 76
    .line 77
    cmpl-float v6, v6, v7

    .line 78
    .line 79
    if-gtz v6, :cond_3

    .line 80
    goto :goto_2

    .line 81
    .line 82
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string p2, "Portrait ratio must be <= "

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getMinRatio()F

    .line 91
    move-result p2

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    throw p2

    .line 109
    .line 110
    :cond_4
    :goto_2
    if-nez v2, :cond_7

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 114
    move-result v2

    .line 115
    .line 116
    cmpg-float v2, v2, v5

    .line 117
    .line 118
    if-nez v2, :cond_5

    .line 119
    goto :goto_3

    .line 120
    .line 121
    .line 122
    :cond_5
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 123
    move-result v2

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getMinRatio()F

    .line 127
    move-result v6

    .line 128
    .line 129
    cmpg-float v2, v2, v6

    .line 130
    .line 131
    if-ltz v2, :cond_6

    .line 132
    goto :goto_3

    .line 133
    .line 134
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string p2, "Landscape ratio must be >= "

    .line 137
    .line 138
    .line 139
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getMinRatio()F

    .line 143
    move-result p2

    .line 144
    .line 145
    .line 146
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    .line 159
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 160
    throw p2

    .line 161
    .line 162
    :cond_7
    :goto_3
    const/high16 v2, -0x80000000

    .line 163
    .line 164
    if-eq v0, v2, :cond_9

    .line 165
    .line 166
    if-nez v0, :cond_8

    .line 167
    goto :goto_4

    .line 168
    :cond_8
    move v0, v3

    .line 169
    goto :goto_5

    .line 170
    :cond_9
    :goto_4
    move v0, v4

    .line 171
    .line 172
    :goto_5
    if-eq v1, v2, :cond_a

    .line 173
    .line 174
    if-nez v1, :cond_b

    .line 175
    :cond_a
    move v3, v4

    .line 176
    .line 177
    :cond_b
    if-eqz p1, :cond_d

    .line 178
    .line 179
    if-eqz v3, :cond_d

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 183
    move-result v1

    .line 184
    .line 185
    cmpg-float v1, v1, v5

    .line 186
    .line 187
    if-nez v1, :cond_c

    .line 188
    goto :goto_6

    .line 189
    :cond_c
    int-to-float p2, p1

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 193
    move-result v1

    .line 194
    div-float/2addr p2, v1

    .line 195
    float-to-int p2, p2

    .line 196
    goto :goto_8

    .line 197
    .line 198
    :cond_d
    :goto_6
    if-eqz v0, :cond_f

    .line 199
    .line 200
    if-eqz p2, :cond_f

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 204
    move-result v1

    .line 205
    .line 206
    cmpg-float v1, v1, v5

    .line 207
    .line 208
    if-nez v1, :cond_e

    .line 209
    goto :goto_7

    .line 210
    :cond_e
    int-to-float p1, p2

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 214
    move-result v1

    .line 215
    mul-float/2addr v1, p1

    .line 216
    float-to-int p1, v1

    .line 217
    goto :goto_8

    .line 218
    .line 219
    :cond_f
    :goto_7
    if-eqz v0, :cond_11

    .line 220
    .line 221
    if-eqz v3, :cond_11

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 225
    move-result v1

    .line 226
    .line 227
    cmpg-float v1, v1, v5

    .line 228
    .line 229
    if-nez v1, :cond_10

    .line 230
    goto :goto_8

    .line 231
    .line 232
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 233
    .line 234
    const-string p2, "layout_width or layout_height should be set to a fixed value when ratio is used"

    .line 235
    .line 236
    .line 237
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    throw p1

    .line 239
    .line 240
    :cond_11
    :goto_8
    if-nez v0, :cond_12

    .line 241
    .line 242
    if-eqz v3, :cond_13

    .line 243
    .line 244
    .line 245
    :cond_12
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getRatio()F

    .line 246
    move-result v0

    .line 247
    .line 248
    cmpg-float v0, v0, v5

    .line 249
    .line 250
    if-eqz v0, :cond_14

    .line 251
    .line 252
    :cond_13
    const/high16 v0, 0x40000000    # 2.0f

    .line 253
    .line 254
    .line 255
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 256
    move-result p1

    .line 257
    .line 258
    .line 259
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 260
    move-result p2

    .line 261
    .line 262
    .line 263
    invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V

    .line 264
    return-void

    .line 265
    .line 266
    :cond_14
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 267
    .line 268
    const-string p2, "ratio should be set"

    .line 269
    .line 270
    .line 271
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 272
    throw p1
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

.method public pause()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isPausePreview()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/jumio/commons/camera/CameraManagerInterface;->stopPreview(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v1}, Ljumio/core/c0;->isPresented(Z)V

    .line 28
    :cond_1
    return-void
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

.method public final registerUserActionOverride$jumio_core_release(Lcom/jumio/core/views/a;)V
    .locals 1
    .param p1    # Lcom/jumio/core/views/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "actionOverride"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public resume()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/sdk/JumioSDK;->Companion:Lcom/jumio/sdk/JumioSDK$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "getContext(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jumio/sdk/JumioSDK$Companion;->hasAllRequiredPermissions(Landroid/content/Context;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isPausePreview()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->startPreview()V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1}, Ljumio/core/c0;->isPresented(Z)V

    .line 45
    return-void

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    new-instance v3, Lcom/jumio/sdk/exceptions/MissingPermissionException;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 57
    move-result-object v4

    .line 58
    .line 59
    .line 60
    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v4}, Lcom/jumio/sdk/JumioSDK$Companion;->getMissingPermissions(Landroid/content/Context;)[Ljava/lang/String;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    .line 67
    invoke-direct {v3, v0}, Lcom/jumio/sdk/exceptions/MissingPermissionException;-><init>([Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v1, v3}, Ljumio/core/c0;->cameraError(Ljava/lang/Throwable;)V

    .line 71
    :cond_2
    return-void
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

.method public final setBrandingLogoTopMargin(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/views/CameraScanView;->f:I

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

.method public setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V
    .locals 4
    .param p1    # Lcom/jumio/sdk/enums/JumioCameraFacing;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "value"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljumio/core/c0;->getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->j:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setCameraFacing(Lcom/jumio/sdk/enums/JumioCameraFacing;)V

    .line 34
    .line 35
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    const-string v1, "camera"

    .line 42
    const/4 v2, 0x2

    .line 43
    const/4 v3, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v3, p1, v2, v3}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 51
    :cond_0
    return-void
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

.method public final setCameraManager$jumio_core_release(Lcom/jumio/commons/camera/CameraManagerInterface;)V
    .locals 0
    .param p1    # Lcom/jumio/commons/camera/CameraManagerInterface;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

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

.method public final setCameraSettings$jumio_core_release(Lcom/jumio/commons/camera/CameraSettings;)V
    .locals 1
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/views/CameraScanView;->h:Lcom/jumio/commons/camera/CameraSettings;

    .line 8
    return-void
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

.method public final setCollectCameraConnection$jumio_core_release(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setCollectCameraConnection(Z)V

    .line 8
    :cond_0
    return-void
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

.method public final setExposureAndWhiteBalanceLock$jumio_core_release(Z)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->isExposureAndWhiteBalanceLocked()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->getCameraCapabilities()Lcom/jumio/commons/camera/CameraCapabilities;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-interface {v2}, Lcom/jumio/commons/camera/CameraCapabilities;->getHasExposureAndWhiteBalanceLock()Z

    .line 16
    move-result v2

    .line 17
    .line 18
    if-eqz v2, :cond_2

    .line 19
    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    :cond_0
    if-eqz v1, :cond_2

    .line 25
    .line 26
    if-nez p1, :cond_2

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setExposureAndWhiteBalanceLock(Z)V

    .line 30
    :cond_2
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

.method public setExtraction(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljumio/core/c0;->setEnableExtraction(Z)V

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

.method public final setFlash$jumio_core_release(ZZZ)V
    .locals 2

    .line 1
    .line 2
    if-nez p3, :cond_0

    .line 3
    .line 4
    iget-object p3, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 5
    .line 6
    sget-object v0, Lcom/jumio/core/views/a;->a:Lcom/jumio/core/views/a;

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result p3

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    goto :goto_1

    .line 14
    .line 15
    :cond_0
    iget-object p3, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    .line 20
    invoke-interface {p3, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setFlash(Z)V

    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    sget-object p2, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const-string p1, "ON"

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_1
    const-string p1, "OFF"

    .line 32
    :goto_0
    const/4 p3, 0x2

    .line 33
    .line 34
    const-string v0, "flash"

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v1, p1, p3, v1}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, p1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 43
    :cond_2
    :goto_1
    return-void
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

.method public abstract setRatio(F)V
.end method

.method public final setShader$jumio_core_release(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V
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
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->setShader(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V

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

.method public final stopPreview$jumio_core_release(Z)Lkotlin/Unit;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/jumio/commons/camera/CameraManagerInterface;->stopPreview(Z)V

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return-object p1
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

.method public switchCamera()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->e:Lcom/jumio/core/util/ConcurrentMutableList;

    .line 3
    .line 4
    sget-object v1, Lcom/jumio/core/views/a;->c:Lcom/jumio/core/views/a;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getHasMultipleCameras()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/jumio/core/views/CameraScanView;->i:Lcom/jumio/commons/camera/CameraManagerInterface;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Lcom/jumio/commons/camera/CameraManagerInterface;->changeCamera()V

    .line 25
    .line 26
    :cond_1
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "camera"

    .line 37
    const/4 v3, 0x2

    .line 38
    const/4 v4, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v4, v1, v3, v4}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 46
    :cond_2
    :goto_0
    return-void
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

.method public takePicture()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/jumio/core/views/CameraScanView;->getCameraScanPartInterface()Ljumio/core/c0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljumio/core/c0;->takePicture()V

    .line 10
    :cond_0
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final update$jumio_core_release(Z)V
    .locals 0
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Lcom/jumio/core/views/CameraScanView;->c:Lcom/jumio/core/gui/DrawView;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 17
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
