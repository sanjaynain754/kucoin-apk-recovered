.class public Lcom/jumio/core/overlay/BaseLivenessOverlay;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/overlay/Overlay;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0002\u0008\u0005\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u00108\u001a\u0002092\u0006\u0010\t\u001a\u00020\u000cH\u0016J\u0008\u0010:\u001a\u000209H\u0016J\u0010\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020\'H\u0016J\u0010\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020?H\u0016J\u0014\u0010@\u001a\u0002092\n\u0010A\u001a\u0006\u0012\u0002\u0008\u00030BH\u0016J\u0018\u0010C\u001a\u0002092\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010F\u001a\u0002092\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002092\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u0002092\u0006\u0010M\u001a\u00020*H\u0004J!\u0010N\u001a\u0004\u0018\u00010\'2\u0008\u0008\u0001\u0010O\u001a\u00020\u000c2\u0006\u0010P\u001a\u00020QH\u0004\u00a2\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u0002092\u0006\u0010O\u001a\u00020\u000cH\u0002J\u0010\u0010T\u001a\u0002092\u0006\u0010O\u001a\u00020\u000cH\u0004J\u0008\u0010U\u001a\u000209H\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\u0005R\u0010\u0010\t\u001a\u00020\n8\u0004X\u0085\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c0\u0013X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0014\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010.\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R\u001e\u00103\u001a\u00020\u000c8\u0004@\u0004X\u0085\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00084\u00100\"\u0004\u00085\u00102R\u0014\u00106\u001a\u00020\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u0010\u0019\u00a8\u0006V"
    }
    d2 = {
        "Lcom/jumio/core/overlay/BaseLivenessOverlay;",
        "Lcom/jumio/core/overlay/Overlay;",
        "mobileContext",
        "Lcom/jumio/core/MobileContext;",
        "<init>",
        "(Lcom/jumio/core/MobileContext;)V",
        "getMobileContext",
        "()Lcom/jumio/core/MobileContext;",
        "setMobileContext",
        "visibility",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "width",
        "",
        "height",
        "overlayTopPixel",
        "overlayBottomPixel",
        "overlayLeftPixel",
        "overlayRightPixel",
        "styleMap",
        "",
        "getStyleMap",
        "()Ljava/util/Map;",
        "extractionArea",
        "Landroid/graphics/Rect;",
        "getExtractionArea",
        "()Landroid/graphics/Rect;",
        "setExtractionArea",
        "(Landroid/graphics/Rect;)V",
        "overlayView",
        "Landroidx/appcompat/widget/AppCompatImageView;",
        "getOverlayView",
        "()Landroidx/appcompat/widget/AppCompatImageView;",
        "setOverlayView",
        "(Landroidx/appcompat/widget/AppCompatImageView;)V",
        "paddingViewList",
        "",
        "Landroid/view/View;",
        "photinusView",
        "mirrorOverlay",
        "",
        "portraitMode",
        "scaleFactorWidth",
        "",
        "scaleFactorHeight",
        "lastColorChangeRunnable",
        "Lcom/jumio/core/overlay/ColorChangeRunnable;",
        "overlayCircleMainColor",
        "getOverlayCircleMainColor",
        "()I",
        "setOverlayCircleMainColor",
        "(I)V",
        "defaultOverlayColor",
        "getDefaultOverlayColor",
        "setDefaultOverlayColor",
        "overlayBounds",
        "getOverlayBounds",
        "setVisible",
        "",
        "destroy",
        "prepareDraw",
        "isFrontCamera",
        "doDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "update",
        "extractionUpdate",
        "Lcom/jumio/core/extraction/ExtractionUpdateInterface;",
        "calculate",
        "cameraSettings",
        "Lcom/jumio/commons/camera/CameraSettings;",
        "setScanPart",
        "scanPartModel",
        "Lcom/jumio/core/models/ScanPartModel;",
        "addViews",
        "rootView",
        "Landroid/view/ViewGroup;",
        "resizeOverlay",
        "percent",
        "changeColorOfOverlayCircle",
        "color",
        "delay",
        "",
        "(IJ)Ljava/lang/Boolean;",
        "setOverlayColor",
        "setPhotinusColor",
        "resetOverlayAnimation",
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
        "SMAP\nBaseLivenessOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseLivenessOverlay.kt\ncom/jumio/core/overlay/BaseLivenessOverlay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n1863#2,2:252\n1863#2,2:254\n*S KotlinDebug\n*F\n+ 1 BaseLivenessOverlay.kt\ncom/jumio/core/overlay/BaseLivenessOverlay\n*L\n147#1:252,2\n181#1:254,2\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/jumio/core/MobileContext;

.field public final b:Ljava/util/Map;

.field public c:Landroid/graphics/Rect;

.field public d:Landroidx/appcompat/widget/AppCompatImageView;

.field public final e:Ljava/util/ArrayList;

.field public f:Landroid/view/View;

.field public g:Z

.field public h:F

.field protected height:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public i:F

.field public j:Ljumio/core/i0;

.field public k:I

.field public l:I

.field protected overlayBottomPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayLeftPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayRightPixel:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field protected overlayTopPixel:I
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
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 11
    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 16
    .line 17
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    sget-object p1, Lcom/jumio/core/overlay/Overlay;->Companion:Lcom/jumio/core/overlay/Overlay$Companion;

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/jumio/core/overlay/Overlay$Companion;->getCustomizations$jumio_core_release(Lcom/jumio/core/MobileContext;)Ljava/util/Map;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->b:Ljava/util/Map;

    .line 28
    .line 29
    new-instance v0, Landroid/graphics/Rect;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 33
    .line 34
    iput-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->c:Landroid/graphics/Rect;

    .line 35
    .line 36
    new-instance v0, Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->e:Ljava/util/ArrayList;

    .line 42
    const/4 v0, 0x1

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->g:Z

    .line 45
    .line 46
    const/high16 v0, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iput v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->h:F

    .line 49
    .line 50
    iput v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->i:F

    .line 51
    .line 52
    sget v0, Lcom/jumio/core/R$attr;->jumio_scanOverlay_livenessStroke:I

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    check-cast p1, Ljava/lang/Integer;

    .line 63
    .line 64
    if-eqz p1, :cond_0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 68
    move-result p1

    .line 69
    goto :goto_0

    .line 70
    .line 71
    :cond_0
    iget-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 72
    .line 73
    sget v0, Lcom/jumio/core/R$color;->jumio_gray_8:I

    .line 74
    .line 75
    .line 76
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 77
    move-result p1

    .line 78
    .line 79
    :goto_0
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->k:I

    .line 80
    .line 81
    iget-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 82
    .line 83
    sget v0, Lcom/jumio/core/R$color;->jumio_white_alpha80:I

    .line 84
    .line 85
    .line 86
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 87
    move-result p1

    .line 88
    .line 89
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

    .line 90
    return-void
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
.method public addViews(Landroid/view/ViewGroup;)V
    .locals 4
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
    .line 7
    sget v0, Lcom/jumio/core/R$id;->liveness_overlay_root:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    .line 17
    .line 18
    :cond_0
    iget-boolean v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->g:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget v0, Lcom/jumio/core/R$layout;->jumio_face_liveness_overlay:I

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    sget v0, Lcom/jumio/core/R$layout;->jumio_face_liveness_overlay_land:I

    .line 26
    .line 27
    :goto_0
    iget-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 39
    const/4 v2, -0x1

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 43
    .line 44
    const/16 v2, 0xd

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    .line 52
    sget v1, Lcom/jumio/core/R$id;->iv_liveness_overlay:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Landroidx/appcompat/widget/AppCompatImageView;

    .line 59
    .line 60
    iput-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 61
    .line 62
    sget v1, Lcom/jumio/core/R$id;->photinus_color:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->f:Landroid/view/View;

    .line 69
    .line 70
    sget p1, Lcom/jumio/core/R$id;->top_padding:I

    .line 71
    .line 72
    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    sget v1, Lcom/jumio/core/R$id;->bottom_padding:I

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    sget v2, Lcom/jumio/core/R$id;->left_padding:I

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    sget v3, Lcom/jumio/core/R$id;->right_padding:I

    .line 89
    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    .line 95
    filled-new-array {p1, v1, v2, v3}, [Ljava/lang/Integer;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    move-result v1

    .line 109
    .line 110
    if-eqz v1, :cond_3

    .line 111
    .line 112
    .line 113
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    check-cast v1, Ljava/lang/Number;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 120
    move-result v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 124
    move-result-object v1

    .line 125
    .line 126
    if-eqz v1, :cond_2

    .line 127
    .line 128
    iget-object v2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->e:Ljava/util/ArrayList;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    goto :goto_1

    .line 133
    .line 134
    :cond_3
    iget p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

    .line 135
    .line 136
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 137
    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    sget v1, Lcom/jumio/core/R$id;->liveness_overlay_outer:I

    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->access$layerDrawable(Landroid/widget/ImageView;I)Landroid/graphics/drawable/Drawable;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    if-eqz v0, :cond_4

    .line 147
    .line 148
    .line 149
    invoke-static {v0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->setColor(Landroid/graphics/drawable/Drawable;I)V

    .line 150
    .line 151
    :cond_4
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->e:Ljava/util/ArrayList;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    move-result v1

    .line 160
    .line 161
    if-eqz v1, :cond_5

    .line 162
    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    check-cast v1, Landroid/view/View;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 171
    goto :goto_2

    .line 172
    .line 173
    .line 174
    :cond_5
    const p1, 0x3f366666    # 0.7125f

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resizeOverlay(F)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resetOverlayAnimation()V

    .line 181
    return-void
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

.method public calculate(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V
    .locals 1
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
    move-result-object p2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 18
    move-result p2

    .line 19
    .line 20
    iput p2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->width:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 24
    move-result-object p2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 28
    move-result p2

    .line 29
    .line 30
    iput p2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->height:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 34
    move-result-object p2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 38
    move-result p2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getPreview()Lcom/jumio/commons/camera/Size;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 46
    move-result v0

    .line 47
    .line 48
    if-ge p2, v0, :cond_0

    .line 49
    const/4 p2, 0x1

    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/4 p2, 0x0

    .line 52
    .line 53
    :goto_0
    iput-boolean p2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->g:Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getScaledPreview()Lcom/jumio/commons/camera/Size;

    .line 57
    move-result-object p2

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 61
    move-result p2

    .line 62
    int-to-float p2, p2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/jumio/commons/camera/Size;->getWidth()I

    .line 70
    move-result v0

    .line 71
    int-to-float v0, v0

    .line 72
    div-float/2addr p2, v0

    .line 73
    .line 74
    iput p2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->h:F

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getScaledPreview()Lcom/jumio/commons/camera/Size;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 82
    move-result p2

    .line 83
    int-to-float p2, p2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CameraSettings;->getSurface()Lcom/jumio/commons/camera/Size;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/jumio/commons/camera/Size;->getHeight()I

    .line 91
    move-result p1

    .line 92
    int-to-float p1, p1

    .line 93
    div-float/2addr p2, p1

    .line 94
    .line 95
    iput p2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->i:F

    .line 96
    .line 97
    iget p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->width:I

    .line 98
    .line 99
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayRightPixel:I

    .line 100
    .line 101
    iget p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->height:I

    .line 102
    .line 103
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayBottomPixel:I

    .line 104
    return-void
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

.method public final changeColorOfOverlayCircle(IJ)Ljava/lang/Boolean;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Ljumio/core/i0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, v0, p1}, Ljumio/core/i0;-><init>(Landroidx/appcompat/widget/AppCompatImageView;I)V

    .line 10
    .line 11
    iput-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->j:Ljumio/core/i0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
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

.method public destroy()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->f:Landroid/view/View;

    .line 4
    .line 5
    iput-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->e:Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public doDraw(Landroid/graphics/Canvas;)V
    .locals 1
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

.method public final getDefaultOverlayColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

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

.method public final getExtractionArea()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->c:Landroid/graphics/Rect;

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

.method public final getMobileContext()Lcom/jumio/core/MobileContext;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

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
    iget v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayLeftPixel:I

    .line 5
    .line 6
    iget v2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayTopPixel:I

    .line 7
    .line 8
    iget v3, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayRightPixel:I

    .line 9
    .line 10
    iget v4, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->overlayBottomPixel:I

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

.method public final getOverlayCircleMainColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->k:I

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

.method public final getOverlayView()Landroidx/appcompat/widget/AppCompatImageView;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

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
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->b:Ljava/util/Map;

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

.method public prepareDraw(Z)V
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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final resetOverlayAnimation()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->j:Ljumio/core/i0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    sget v1, Lcom/jumio/core/R$id;->liveness_overlay_main:I

    .line 12
    .line 13
    iget v2, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->k:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, v2}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->access$resetAnyLayerDrawableAnimation(Landroid/widget/ImageView;II)V

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->setPhotinusColor(I)V

    .line 21
    return-void
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

.method public final resizeOverlay(F)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/overlay/BaseLivenessOverlay;->resetOverlayAnimation()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    .line 16
    :goto_0
    instance-of v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    move-object v1, v0

    .line 20
    .line 21
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 22
    .line 23
    :cond_1
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-boolean v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->g:Z

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->h:F

    .line 30
    mul-float/2addr p1, v0

    .line 31
    .line 32
    iput p1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->matchConstraintPercentWidth:F

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_2
    iget v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->i:F

    .line 36
    mul-float/2addr p1, v0

    .line 37
    .line 38
    iput p1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->matchConstraintPercentHeight:F

    .line 39
    .line 40
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    iget v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->access$reset(Landroid/widget/ImageView;I)V

    .line 48
    .line 49
    :cond_4
    iget-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 55
    :cond_5
    return-void
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

.method public final setDefaultOverlayColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

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
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->c:Landroid/graphics/Rect;

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
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->a:Lcom/jumio/core/MobileContext;

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

.method public final setOverlayCircleMainColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->k:I

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

.method public final setOverlayView(Landroidx/appcompat/widget/AppCompatImageView;)V
    .locals 0
    .param p1    # Landroidx/appcompat/widget/AppCompatImageView;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

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

.method public final setPhotinusColor(I)V
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iget p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->l:I

    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const/high16 v0, -0x4e000000

    .line 9
    add-int/2addr v0, p1

    .line 10
    .line 11
    :goto_0
    iget-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    sget v2, Lcom/jumio/core/R$id;->liveness_overlay_outer:I

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->access$layerDrawable(Landroid/widget/ImageView;I)Landroid/graphics/drawable/Drawable;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p1}, Lcom/jumio/core/overlay/BaseLivenessOverlayKt;->setColor(Landroid/graphics/drawable/Drawable;I)V

    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->e:Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    check-cast v2, Landroid/view/View;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->f:Landroid/view/View;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 54
    :cond_3
    return-void
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

.method public setVisible(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/overlay/BaseLivenessOverlay;->visibility:Ljava/util/concurrent/atomic/AtomicInteger;

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
