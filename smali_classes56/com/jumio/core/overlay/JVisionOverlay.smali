.class public Lcom/jumio/core/overlay/JVisionOverlay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/overlay/Overlay;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\n\u0010W\u001a\u00020X*\u00020!J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020_H\u0016J\u0010\u0010`\u001a\u00020Z2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020Z2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010f\u001a\u00020Z2\u0006\u0010g\u001a\u00020?H\u0016J\u0008\u0010h\u001a\u00020ZH\u0014J\u0010\u0010i\u001a\u00020Z2\u0006\u0010Q\u001a\u00020\nH\u0016J\u0010\u0010l\u001a\u00020Z2\u0006\u0010m\u001a\u00020nH\u0016J\u0014\u0010o\u001a\u00020Z2\n\u0010p\u001a\u0006\u0012\u0002\u0008\u00030qH\u0016J\u0008\u0010r\u001a\u00020ZH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u0012\u0010\t\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0010\"\u0004\u0008\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\nX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0010\"\u0004\u0008\u001d\u0010\u0012R\u0012\u0010\u001e\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020\n8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0010\u0010&\u001a\u00020\'8\u0004X\u0085\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\'X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0014\u0010+\u001a\u00020\'X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010*R\u000e\u0010-\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u00020/2\u0006\u00102\u001a\u00020/@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0014\u00106\u001a\u0004\u0018\u0001078\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u00108\u001a\u0004\u0018\u000109X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008:\u0010;\"\u0004\u0008<\u0010=R\u0012\u0010>\u001a\u00020?8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010@\u001a\u00020?8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010A\u001a\u00020?8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010B\u001a\u00020?8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010C\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010D\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010F\u001a\u00020E2\u0006\u00102\u001a\u00020E@BX\u0084\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010HR\u000e\u0010I\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010K\u001a\u00020?X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008L\u0010M\"\u0004\u0008N\u0010OR\u000e\u0010P\u001a\u00020?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u00020R8\u0004X\u0085\u0004\u00a2\u0006\u0002\n\u0000R \u0010S\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0TX\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010VR\u0014\u0010j\u001a\u00020!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008k\u0010#\u00a8\u0006s"
    }
    d2 = {
        "Lcom/jumio/core/overlay/JVisionOverlay;",
        "Lcom/jumio/core/overlay/Overlay;",
        "mobileContext",
        "Lcom/jumio/core/MobileContext;",
        "<init>",
        "(Lcom/jumio/core/MobileContext;)V",
        "getMobileContext",
        "()Lcom/jumio/core/MobileContext;",
        "setMobileContext",
        "overlayLeftMargin",
        "",
        "overlayRightMargin",
        "overlayTopMargin",
        "overlayBottomMargin",
        "overlayWidth",
        "getOverlayWidth",
        "()I",
        "setOverlayWidth",
        "(I)V",
        "overlayHeight",
        "overlayTopPixel",
        "overlayBottomPixel",
        "overlayLeftPixel",
        "overlayRightPixel",
        "topOffset",
        "getTopOffset",
        "setTopOffset",
        "leftOffset",
        "getLeftOffset",
        "setLeftOffset",
        "width",
        "height",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "getExtractionArea",
        "()Landroid/graphics/Rect;",
        "setExtractionArea",
        "(Landroid/graphics/Rect;)V",
        "borderPaint",
        "Landroid/graphics/Paint;",
        "largeBorderPaint",
        "getLargeBorderPaint",
        "()Landroid/graphics/Paint;",
        "backgroundPaint",
        "getBackgroundPaint",
        "debugPaint",
        "borderPath",
        "Landroid/graphics/Path;",
        "largeBorderPath",
        "cutoutPath",
        "value",
        "backgroundPath",
        "getBackgroundPath",
        "()Landroid/graphics/Path;",
        "scanMode",
        "Lcom/jumio/core/data/ScanMode;",
        "credentialPart",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "getCredentialPart",
        "()Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "setCredentialPart",
        "(Lcom/jumio/sdk/enums/JumioCredentialPart;)V",
        "useCenterCrop",
        "",
        "dimBackground",
        "drawBrackets",
        "detectLines",
        "topLeftCornerRadius",
        "topRightCornerRadius",
        "Lcom/jumio/core/data/document/DocumentFormat;",
        "documentFormat",
        "getDocumentFormat",
        "()Lcom/jumio/core/data/document/DocumentFormat;",
        "bottomLeftCornerRadius",
        "bottomRightCornerRadius",
        "mirrorOverlay",
        "getMirrorOverlay",
        "()Z",
        "setMirrorOverlay",
        "(Z)V",
        "initialized",
        "visibility",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "styleMap",
        "",
        "getStyleMap",
        "()Ljava/util/Map;",
        "area",
        "",
        "calculate",
        "",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "addViews",
        "rootView",
        "Landroid/view/ViewGroup;",
        "setScanPart",
        "scanPartModel",
        "Lcom/jumio/core/models/ScanPartModel;",
        "updateOverlayConfiguration",
        "context",
        "Landroid/content/Context;",
        "prepareDraw",
        "isFrontCamera",
        "prepareBackground",
        "setVisible",
        "overlayBounds",
        "getOverlayBounds",
        "doDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "update",
        "extractionUpdate",
        "Lcom/jumio/core/extraction/ExtractionUpdateInterface;",
        "destroy",
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
        "SMAP\nJVisionOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JVisionOverlay.kt\ncom/jumio/core/overlay/JVisionOverlay\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,378:1\n34#2:379\n34#2:380\n*S KotlinDebug\n*F\n+ 1 JVisionOverlay.kt\ncom/jumio/core/overlay/JVisionOverlay\n*L\n276#1:379\n365#1:380\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/jumio/core/MobileContext;

.field public b:I

.field protected final borderPaint:Landroid/graphics/Paint;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:I

.field public d:I

.field public detectLines:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public dimBackground:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public drawBrackets:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public e:Landroid/graphics/Rect;

.field public final f:Landroid/graphics/Paint;

.field public final g:Landroid/graphics/Paint;

.field public h:Landroid/graphics/Path;

.field protected height:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public i:Landroid/graphics/Path;

.field public j:Landroid/graphics/Path;

.field public k:Landroid/graphics/Path;

.field public l:Lcom/jumio/sdk/enums/JumioCredentialPart;

.field public m:Lcom/jumio/core/data/document/DocumentFormat;

.field public n:I

.field public o:I

.field protected overlayBottomMargin:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayBottomPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayHeight:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayLeftMargin:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayLeftPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayRightMargin:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayRightPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayTopMargin:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayTopPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public p:Z

.field public q:Z

.field public final r:Ljava/util/Map;

.field protected scanMode:Lcom/jumio/core/data/ScanMode;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public topLeftCornerRadius:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public topRightCornerRadius:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public useCenterCrop:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected final visibility:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field protected width:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/jumio/core/MobileContext;)V
    .locals 1
    .param p1    # Lcom/jumio/core/MobileContext;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "mobileContext"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 11
    .line 12
    new-instance p1, Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

    .line 18
    .line 19
    new-instance p1, Landroid/graphics/Paint;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 25
    .line 26
    new-instance p1, Landroid/graphics/Paint;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 30
    .line 31
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 32
    .line 33
    new-instance p1, Landroid/graphics/Paint;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 37
    .line 38
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/Paint;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 44
    .line 45
    new-instance p1, Landroid/graphics/Path;

    .line 46
    .line 47
    .line 48
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 49
    .line 50
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->h:Landroid/graphics/Path;

    .line 51
    .line 52
    new-instance p1, Landroid/graphics/Path;

    .line 53
    .line 54
    .line 55
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 56
    .line 57
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->i:Landroid/graphics/Path;

    .line 58
    .line 59
    new-instance p1, Landroid/graphics/Path;

    .line 60
    .line 61
    .line 62
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 63
    .line 64
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->j:Landroid/graphics/Path;

    .line 65
    .line 66
    new-instance p1, Landroid/graphics/Path;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 70
    .line 71
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 72
    .line 73
    sget-object p1, Lcom/jumio/core/data/document/DocumentFormat;->NONE:Lcom/jumio/core/data/document/DocumentFormat;

    .line 74
    .line 75
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 76
    .line 77
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 81
    .line 82
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 83
    .line 84
    sget-object p1, Lcom/jumio/core/overlay/Overlay;->Companion:Lcom/jumio/core/overlay/Overlay$Companion;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Lcom/jumio/core/overlay/Overlay$Companion;->getCustomizations$jumio_core_release(Lcom/jumio/core/MobileContext;)Ljava/util/Map;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->r:Ljava/util/Map;

    .line 93
    return-void
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
.method public addViews(Landroid/view/ViewGroup;)V
    .locals 1
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "rootView"

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

.method public final area(Landroid/graphics/Rect;)F
    .locals 1
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<this>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 9
    move-result v0

    .line 10
    int-to-float v0, v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    .line 14
    move-result p1

    .line 15
    int-to-float p1, p1

    .line 16
    mul-float/2addr v0, p1

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 4
    .param p1    # Lcom/jumio/commons/camera/CameraSettings;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "cameraSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "extractionArea"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 18
    move-result v0

    .line 19
    .line 20
    iput v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 28
    move-result p1

    .line 29
    .line 30
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 31
    .line 32
    iput-object p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

    .line 33
    .line 34
    iget-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 39
    .line 40
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftPixel:I

    .line 41
    .line 42
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightPixel:I

    .line 45
    .line 46
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 47
    .line 48
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopPixel:I

    .line 49
    .line 50
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 51
    .line 52
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 53
    return-void

    .line 54
    .line 55
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 56
    .line 57
    sget-object v1, Lcom/jumio/core/data/document/DocumentFormat;->NONE:Lcom/jumio/core/data/document/DocumentFormat;

    .line 58
    const/4 v2, 0x0

    .line 59
    .line 60
    if-ne v0, v1, :cond_1

    .line 61
    .line 62
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftPixel:I

    .line 63
    .line 64
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopPixel:I

    .line 65
    .line 66
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 67
    .line 68
    iput p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightPixel:I

    .line 69
    .line 70
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 71
    return-void

    .line 72
    .line 73
    :cond_1
    sget-object v1, Lcom/jumio/core/data/document/DocumentFormat;->ID1:Lcom/jumio/core/data/document/DocumentFormat;

    .line 74
    .line 75
    if-eq v0, v1, :cond_5

    .line 76
    .line 77
    sget-object v1, Lcom/jumio/core/data/document/DocumentFormat;->ID2:Lcom/jumio/core/data/document/DocumentFormat;

    .line 78
    .line 79
    if-ne v0, v1, :cond_2

    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_2
    sget-object p1, Lcom/jumio/core/data/document/DocumentFormat;->ID3:Lcom/jumio/core/data/document/DocumentFormat;

    .line 84
    .line 85
    if-ne v0, p1, :cond_4

    .line 86
    .line 87
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayLeftInPx(I)I

    .line 91
    move-result p1

    .line 92
    .line 93
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 94
    .line 95
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 96
    .line 97
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRightInPx(I)I

    .line 101
    move-result p1

    .line 102
    .line 103
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 104
    .line 105
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 106
    .line 107
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayTopInPx(I)I

    .line 111
    move-result p1

    .line 112
    .line 113
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 114
    .line 115
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 116
    .line 117
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayBottomInPx(I)I

    .line 121
    move-result p1

    .line 122
    .line 123
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomMargin:I

    .line 124
    .line 125
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 126
    int-to-float p1, p1

    .line 127
    .line 128
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 129
    int-to-float p2, p2

    .line 130
    div-float/2addr p1, p2

    .line 131
    float-to-double p1, p1

    .line 132
    .line 133
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRatio()D

    .line 137
    move-result-wide v0

    .line 138
    .line 139
    cmpl-double p1, p1, v0

    .line 140
    .line 141
    if-ltz p1, :cond_3

    .line 142
    .line 143
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 144
    .line 145
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 146
    .line 147
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 148
    sub-int/2addr p1, p2

    .line 149
    .line 150
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomMargin:I

    .line 151
    sub-int/2addr p1, p2

    .line 152
    int-to-double p1, p1

    .line 153
    .line 154
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRatio()D

    .line 158
    move-result-wide v0

    .line 159
    mul-double/2addr v0, p1

    .line 160
    double-to-int p1, v0

    .line 161
    .line 162
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 163
    add-int/2addr p1, p2

    .line 164
    .line 165
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 166
    add-int/2addr p1, p2

    .line 167
    .line 168
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 169
    sub-int/2addr p2, p1

    .line 170
    .line 171
    div-int/lit8 p2, p2, 0x2

    .line 172
    .line 173
    iput p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 174
    goto :goto_0

    .line 175
    .line 176
    :cond_3
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 177
    .line 178
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 179
    .line 180
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 181
    sub-int/2addr p1, p2

    .line 182
    .line 183
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 184
    sub-int/2addr p1, p2

    .line 185
    int-to-double p1, p1

    .line 186
    .line 187
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRatio()D

    .line 191
    move-result-wide v0

    .line 192
    div-double/2addr p1, v0

    .line 193
    double-to-int p1, p1

    .line 194
    .line 195
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 196
    add-int/2addr p1, p2

    .line 197
    .line 198
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomMargin:I

    .line 199
    add-int/2addr p1, p2

    .line 200
    .line 201
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 202
    sub-int/2addr p2, p1

    .line 203
    .line 204
    div-int/lit8 v2, p2, 0x2

    .line 205
    .line 206
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 207
    .line 208
    :goto_0
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 209
    .line 210
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 211
    .line 212
    mul-int/lit8 v0, p2, 0x2

    .line 213
    .line 214
    sub-int v0, p1, v0

    .line 215
    .line 216
    iput v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

    .line 217
    .line 218
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 219
    .line 220
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 221
    .line 222
    sub-int v3, v0, v1

    .line 223
    sub-int/2addr v3, v2

    .line 224
    .line 225
    iput v3, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayHeight:I

    .line 226
    sub-int/2addr p1, p2

    .line 227
    .line 228
    iget v3, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 229
    sub-int/2addr p1, v3

    .line 230
    .line 231
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightPixel:I

    .line 232
    sub-int/2addr v0, v2

    .line 233
    .line 234
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomMargin:I

    .line 235
    sub-int/2addr v0, p1

    .line 236
    .line 237
    iput v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 238
    .line 239
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 240
    add-int/2addr p1, p2

    .line 241
    .line 242
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftPixel:I

    .line 243
    .line 244
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 245
    add-int/2addr p1, v1

    .line 246
    .line 247
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopPixel:I

    .line 248
    :cond_4
    return-void

    .line 249
    .line 250
    :cond_5
    :goto_1
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 251
    int-to-float v2, v1

    .line 252
    int-to-float v3, p1

    .line 253
    div-float/2addr v2, v3

    .line 254
    .line 255
    .line 256
    const v3, 0x3faaaaab

    .line 257
    .line 258
    cmpl-float v2, v2, v3

    .line 259
    .line 260
    if-ltz v2, :cond_6

    .line 261
    .line 262
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayHeight:I

    .line 263
    .line 264
    mul-int/lit8 p1, p1, 0x4

    .line 265
    .line 266
    div-int/lit8 p1, p1, 0x3

    .line 267
    .line 268
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

    .line 269
    .line 270
    iget v2, p2, Landroid/graphics/Rect;->top:I

    .line 271
    .line 272
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 273
    sub-int/2addr v1, p1

    .line 274
    .line 275
    div-int/lit8 v1, v1, 0x2

    .line 276
    .line 277
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 278
    add-int/2addr v1, p1

    .line 279
    .line 280
    iput v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 281
    goto :goto_2

    .line 282
    .line 283
    :cond_6
    iput v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

    .line 284
    .line 285
    mul-int/lit8 v1, v1, 0x3

    .line 286
    .line 287
    div-int/lit8 v1, v1, 0x4

    .line 288
    .line 289
    iput v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayHeight:I

    .line 290
    sub-int/2addr p1, v1

    .line 291
    .line 292
    div-int/lit8 p1, p1, 0x2

    .line 293
    .line 294
    iget v1, p2, Landroid/graphics/Rect;->top:I

    .line 295
    add-int/2addr p1, v1

    .line 296
    .line 297
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 298
    .line 299
    iget p1, p2, Landroid/graphics/Rect;->left:I

    .line 300
    .line 301
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 302
    .line 303
    :goto_2
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayLeftInPx(I)I

    .line 307
    move-result p1

    .line 308
    .line 309
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 310
    .line 311
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 312
    .line 313
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayRightInPx(I)I

    .line 317
    move-result p1

    .line 318
    .line 319
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 320
    .line 321
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 322
    .line 323
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayHeight:I

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayTopInPx(I)I

    .line 327
    move-result p1

    .line 328
    .line 329
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 330
    .line 331
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 332
    .line 333
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayHeight:I

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1, p2}, Lcom/jumio/core/data/document/DocumentFormat;->getOverlayBottomInPx(I)I

    .line 337
    move-result p1

    .line 338
    .line 339
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomMargin:I

    .line 340
    .line 341
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 342
    .line 343
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightMargin:I

    .line 344
    .line 345
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

    .line 346
    add-int/2addr v0, v1

    .line 347
    sub-int/2addr p2, v0

    .line 348
    .line 349
    iput p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightPixel:I

    .line 350
    .line 351
    iget p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 352
    .line 353
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

    .line 354
    add-int/2addr p1, v0

    .line 355
    sub-int/2addr p2, p1

    .line 356
    .line 357
    iput p2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 358
    .line 359
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftMargin:I

    .line 360
    add-int/2addr p1, v1

    .line 361
    .line 362
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftPixel:I

    .line 363
    .line 364
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopMargin:I

    .line 365
    add-int/2addr p1, v0

    .line 366
    .line 367
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopPixel:I

    .line 368
    return-void
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

.method public destroy()V
    .locals 0

    .line 1
    return-void
    .line 2
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

.method public doDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->q:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    :goto_0
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 25
    move-result v0

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->i:Landroid/graphics/Path;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->i:Landroid/graphics/Path;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->h:Landroid/graphics/Path;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 55
    move-result v0

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->h:Landroid/graphics/Path;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 65
    .line 66
    :cond_4
    sget-object p1, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 67
    .line 68
    sget-object p1, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 69
    return-void
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

.method public final getBackgroundPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

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

.method public final getBackgroundPath()Landroid/graphics/Path;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

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

.method public final getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->l:Lcom/jumio/sdk/enums/JumioCredentialPart;

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

.method public final getDocumentFormat()Lcom/jumio/core/data/document/DocumentFormat;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

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

.method public final getExtractionArea()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

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

.method public final getLargeBorderPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

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

.method public final getLeftOffset()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

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

.method public final getMirrorOverlay()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->p:Z

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

.method public final getMobileContext()Lcom/jumio/core/MobileContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

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

.method public getOverlayBounds()Landroid/graphics/Rect;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/Rect;

    .line 3
    .line 4
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayLeftPixel:I

    .line 5
    .line 6
    iget v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayTopPixel:I

    .line 7
    .line 8
    iget v3, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayRightPixel:I

    .line 9
    .line 10
    iget v4, p0, Lcom/jumio/core/overlay/JVisionOverlay;->overlayBottomPixel:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

.method public final getOverlayWidth()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

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

.method public final getStyleMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->r:Ljava/util/Map;

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

.method public final getTopOffset()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

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

.method public prepareBackground()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 3
    .line 4
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 5
    int-to-float v3, v1

    .line 6
    .line 7
    iget v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 8
    int-to-float v4, v1

    .line 9
    .line 10
    sget-object v5, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Path;->addRect(FFFFLandroid/graphics/Path$Direction;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->j:Landroid/graphics/Path;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 23
    return-void
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

.method public prepareDraw(Z)V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/core/overlay/JVisionOverlay;->updateOverlayConfiguration(Landroid/content/Context;)V

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->p:Z

    .line 8
    .line 9
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->r:Ljava/util/Map;

    .line 12
    .line 13
    sget v1, Lcom/jumio/core/R$attr;->jumio_scanOverlay:I

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    move-result v0

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v0, -0x1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 35
    .line 36
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 37
    .line 38
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    .line 43
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 44
    const/4 v2, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 48
    .line 49
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 50
    .line 51
    sget-object v3, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 55
    .line 56
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 57
    .line 58
    sget-object v4, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 62
    .line 63
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 67
    .line 68
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->borderPaint:Landroid/graphics/Paint;

    .line 69
    .line 70
    iget-object v5, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 71
    const/4 v6, 0x2

    .line 72
    .line 73
    .line 74
    invoke-static {v6, v5}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 75
    move-result v5

    .line 76
    int-to-float v5, v5

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 80
    .line 81
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 82
    .line 83
    iget-object v5, p0, Lcom/jumio/core/overlay/JVisionOverlay;->r:Ljava/util/Map;

    .line 84
    .line 85
    .line 86
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    .line 90
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    check-cast v1, Ljava/lang/Integer;

    .line 94
    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 99
    move-result v1

    .line 100
    goto :goto_1

    .line 101
    .line 102
    :cond_1
    const-string v1, "#80000000"

    .line 103
    .line 104
    .line 105
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 106
    move-result v1

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    .line 111
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 112
    const/4 v1, 0x0

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 116
    .line 117
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 121
    .line 122
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 126
    .line 127
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 131
    .line 132
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 136
    .line 137
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 141
    .line 142
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->f:Landroid/graphics/Paint;

    .line 143
    .line 144
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 145
    const/4 v1, 0x6

    .line 146
    .line 147
    .line 148
    invoke-static {v1, v0}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 149
    move-result v0

    .line 150
    int-to-float v0, v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 154
    .line 155
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 156
    .line 157
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->r:Ljava/util/Map;

    .line 158
    .line 159
    sget v1, Lcom/jumio/core/R$attr;->jumio_scanBackground:I

    .line 160
    .line 161
    .line 162
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    move-result-object v1

    .line 164
    .line 165
    .line 166
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    check-cast v0, Ljava/lang/Integer;

    .line 170
    .line 171
    if-eqz v0, :cond_2

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 175
    move-result v0

    .line 176
    goto :goto_2

    .line 177
    .line 178
    :cond_2
    const-string v0, "#99000000"

    .line 179
    .line 180
    .line 181
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 182
    move-result v0

    .line 183
    .line 184
    .line 185
    :goto_2
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 186
    .line 187
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 188
    .line 189
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 193
    .line 194
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setDither(Z)V

    .line 198
    .line 199
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 203
    .line 204
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 208
    .line 209
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->g:Landroid/graphics/Paint;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 213
    .line 214
    sget-object p1, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 215
    .line 216
    sget-object p1, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 217
    .line 218
    iget-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->drawBrackets:Z

    .line 219
    .line 220
    if-eqz p1, :cond_4

    .line 221
    .line 222
    iget-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 223
    .line 224
    if-nez p1, :cond_3

    .line 225
    .line 226
    sget-object v7, Lcom/jumio/commons/utils/DrawingUtil;->INSTANCE:Lcom/jumio/commons/utils/DrawingUtil;

    .line 227
    .line 228
    .line 229
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 230
    move-result-object v8

    .line 231
    .line 232
    iget v9, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 233
    .line 234
    iget v10, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 235
    .line 236
    iget v11, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 237
    .line 238
    iget v12, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v7 .. v12}, Lcom/jumio/commons/utils/DrawingUtil;->createRectWithRoundedCornersAsPath(Landroid/graphics/Rect;IIII)Landroid/graphics/Path;

    .line 242
    move-result-object p1

    .line 243
    .line 244
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->h:Landroid/graphics/Path;

    .line 245
    .line 246
    :cond_3
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 247
    const/4 v0, 0x4

    .line 248
    .line 249
    .line 250
    invoke-static {v0, p1}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 251
    move-result p1

    .line 252
    div-int/2addr p1, v6

    .line 253
    .line 254
    new-instance v4, Landroid/graphics/Rect;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 258
    move-result-object v0

    .line 259
    .line 260
    iget v0, v0, Landroid/graphics/Rect;->left:I

    .line 261
    sub-int/2addr v0, p1

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 265
    move-result-object v1

    .line 266
    .line 267
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 268
    sub-int/2addr v1, p1

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 272
    move-result-object v3

    .line 273
    .line 274
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 275
    add-int/2addr v3, p1

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 279
    move-result-object v5

    .line 280
    .line 281
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 282
    add-int/2addr v5, p1

    .line 283
    .line 284
    .line 285
    invoke-direct {v4, v0, v1, v3, v5}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 286
    .line 287
    sget-object v3, Lcom/jumio/commons/utils/DrawingUtil;->INSTANCE:Lcom/jumio/commons/utils/DrawingUtil;

    .line 288
    .line 289
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 290
    .line 291
    add-int v5, v0, p1

    .line 292
    .line 293
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 294
    .line 295
    add-int v6, v0, p1

    .line 296
    .line 297
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 298
    .line 299
    add-int v7, v0, p1

    .line 300
    .line 301
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

    .line 302
    .line 303
    add-int v8, v0, p1

    .line 304
    .line 305
    .line 306
    invoke-virtual/range {v3 .. v8}, Lcom/jumio/commons/utils/DrawingUtil;->createRectWithRoundedCornersAsPath(Landroid/graphics/Rect;IIII)Landroid/graphics/Path;

    .line 307
    move-result-object p1

    .line 308
    .line 309
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->i:Landroid/graphics/Path;

    .line 310
    .line 311
    new-instance v7, Landroid/graphics/Rect;

    .line 312
    .line 313
    .line 314
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 315
    move-result-object p1

    .line 316
    .line 317
    iget p1, p1, Landroid/graphics/Rect;->left:I

    .line 318
    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 321
    move-result-object v0

    .line 322
    .line 323
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 327
    move-result-object v1

    .line 328
    .line 329
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->getOverlayBounds()Landroid/graphics/Rect;

    .line 333
    move-result-object v4

    .line 334
    .line 335
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 336
    .line 337
    .line 338
    invoke-direct {v7, p1, v0, v1, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 339
    .line 340
    iget v8, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 341
    .line 342
    iget v9, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 343
    .line 344
    iget v10, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 345
    .line 346
    iget v11, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

    .line 347
    move-object v6, v3

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v6 .. v11}, Lcom/jumio/commons/utils/DrawingUtil;->createRectWithRoundedCornersAsPath(Landroid/graphics/Rect;IIII)Landroid/graphics/Path;

    .line 351
    move-result-object p1

    .line 352
    .line 353
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->j:Landroid/graphics/Path;

    .line 354
    goto :goto_3

    .line 355
    .line 356
    :cond_4
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->h:Landroid/graphics/Path;

    .line 357
    .line 358
    .line 359
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 360
    .line 361
    :goto_3
    iget-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->dimBackground:Z

    .line 362
    .line 363
    if-eqz p1, :cond_5

    .line 364
    .line 365
    new-instance p1, Landroid/graphics/Path;

    .line 366
    .line 367
    .line 368
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 369
    .line 370
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 371
    .line 372
    sget-object v0, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1, v0}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {p0}, Lcom/jumio/core/overlay/JVisionOverlay;->prepareBackground()V

    .line 379
    goto :goto_4

    .line 380
    .line 381
    :cond_5
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->k:Landroid/graphics/Path;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    .line 385
    .line 386
    :goto_4
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->q:Z

    .line 387
    return-void
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

.method public final setCredentialPart(Lcom/jumio/sdk/enums/JumioCredentialPart;)V
    .locals 0
    .param p1    # Lcom/jumio/sdk/enums/JumioCredentialPart;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->l:Lcom/jumio/sdk/enums/JumioCredentialPart;

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

.method public final setExtractionArea(Landroid/graphics/Rect;)V
    .locals 1
    .param p1    # Landroid/graphics/Rect;
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
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

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

.method public final setLeftOffset(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->d:I

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

.method public final setMirrorOverlay(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->p:Z

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

.method public final setMobileContext(Lcom/jumio/core/MobileContext;)V
    .locals 1
    .param p1    # Lcom/jumio/core/MobileContext;
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
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

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

.method public final setOverlayWidth(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->b:I

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

.method public setScanPart(Lcom/jumio/core/models/ScanPartModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/models/ScanPartModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "scanPartModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->scanMode:Lcom/jumio/core/data/ScanMode;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->l:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 18
    .line 19
    instance-of v0, p1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    check-cast p1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFormat()Lcom/jumio/core/data/document/DocumentFormat;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object v0, Lcom/jumio/core/data/document/DocumentFormat;->NONE:Lcom/jumio/core/data/document/DocumentFormat;

    .line 36
    .line 37
    if-eq p1, v0, :cond_0

    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p1, 0x0

    .line 41
    .line 42
    :goto_0
    iput-boolean p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 43
    .line 44
    :cond_1
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lcom/jumio/core/overlay/JVisionOverlay;->updateOverlayConfiguration(Landroid/content/Context;)V

    .line 48
    return-void
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

.method public final setTopOffset(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->c:I

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

.method public setVisible(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

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

.method public update(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/core/extraction/ExtractionUpdateInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/extraction/ExtractionUpdateInterface<",
            "*>;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "extractionUpdate"

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

.method public updateOverlayConfiguration(Landroid/content/Context;)V
    .locals 5
    .param p1    # Landroid/content/Context;
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
    iget-boolean v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->useCenterCrop:Z

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    .line 17
    move-result p1

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    .line 33
    move-result p1

    .line 34
    int-to-float p1, p1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->e:Landroid/graphics/Rect;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 40
    move-result v0

    .line 41
    int-to-float v0, v0

    .line 42
    mul-float/2addr p1, v0

    .line 43
    .line 44
    iget v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->width:I

    .line 45
    int-to-float v0, v0

    .line 46
    .line 47
    iget v3, p0, Lcom/jumio/core/overlay/JVisionOverlay;->height:I

    .line 48
    int-to-float v3, v3

    .line 49
    mul-float/2addr v0, v3

    .line 50
    div-float/2addr p1, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 p1, 0x0

    .line 53
    .line 54
    .line 55
    :goto_0
    const v0, 0x3f428f5c    # 0.76f

    .line 56
    .line 57
    cmpg-float p1, p1, v0

    .line 58
    .line 59
    if-gtz p1, :cond_1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v1, v2

    .line 62
    .line 63
    :goto_1
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->dimBackground:Z

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->drawBrackets:Z

    .line 66
    .line 67
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->detectLines:Z

    .line 68
    .line 69
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 70
    .line 71
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 72
    .line 73
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 74
    .line 75
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

    .line 76
    return-void

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/jumio/core/overlay/JVisionOverlay;->m:Lcom/jumio/core/data/document/DocumentFormat;

    .line 79
    .line 80
    sget-object v3, Lcom/jumio/core/data/document/DocumentFormat;->ID1:Lcom/jumio/core/data/document/DocumentFormat;

    .line 81
    .line 82
    const/16 v4, 0x10

    .line 83
    .line 84
    if-eq v0, v3, :cond_5

    .line 85
    .line 86
    sget-object v3, Lcom/jumio/core/data/document/DocumentFormat;->ID2:Lcom/jumio/core/data/document/DocumentFormat;

    .line 87
    .line 88
    if-ne v0, v3, :cond_3

    .line 89
    goto :goto_2

    .line 90
    .line 91
    :cond_3
    sget-object v3, Lcom/jumio/core/data/document/DocumentFormat;->ID3:Lcom/jumio/core/data/document/DocumentFormat;

    .line 92
    .line 93
    if-ne v0, v3, :cond_4

    .line 94
    .line 95
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->drawBrackets:Z

    .line 96
    .line 97
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->dimBackground:Z

    .line 98
    .line 99
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->detectLines:Z

    .line 100
    .line 101
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 102
    .line 103
    iput v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 104
    .line 105
    .line 106
    invoke-static {v4, p1}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 107
    move-result p1

    .line 108
    .line 109
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 110
    .line 111
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

    .line 112
    return-void

    .line 113
    .line 114
    :cond_4
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->drawBrackets:Z

    .line 115
    .line 116
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->dimBackground:Z

    .line 117
    .line 118
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->detectLines:Z

    .line 119
    return-void

    .line 120
    .line 121
    :cond_5
    :goto_2
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->drawBrackets:Z

    .line 122
    .line 123
    iput-boolean v1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->dimBackground:Z

    .line 124
    .line 125
    iput-boolean v2, p0, Lcom/jumio/core/overlay/JVisionOverlay;->detectLines:Z

    .line 126
    .line 127
    .line 128
    invoke-static {v4, p1}, Lcom/jumio/commons/utils/ScreenUtilKt;->dpToPx(ILandroid/content/Context;)I

    .line 129
    move-result p1

    .line 130
    .line 131
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topLeftCornerRadius:I

    .line 132
    .line 133
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->topRightCornerRadius:I

    .line 134
    .line 135
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->n:I

    .line 136
    .line 137
    iput p1, p0, Lcom/jumio/core/overlay/JVisionOverlay;->o:I

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
