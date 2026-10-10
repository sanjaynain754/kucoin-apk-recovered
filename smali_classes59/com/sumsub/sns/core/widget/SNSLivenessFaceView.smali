.class public final Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;
.super Landroid/view/View;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$Companion;,
        Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;,
        Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0008*\u0001&\u0018\u0000 h2\u00020\u0001:\u0003hijB1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010Q\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010R\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0010\u0010S\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0007H\u0002J\u0006\u0010T\u001a\u00020OJ\u0006\u0010U\u001a\u00020OJ\u0006\u0010V\u001a\u00020OJ\u0006\u0010W\u001a\u00020OJ\u0008\u0010X\u001a\u00020OH\u0014J(\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u00020\u00072\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u0007H\u0014J\u0018\u0010^\u001a\u00020O2\u0006\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007H\u0014J\u0010\u0010a\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0014J\u0010\u0010d\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010e\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\u0010\u0010f\u001a\u00020O2\u0006\u0010b\u001a\u00020cH\u0002J\u0008\u0010g\u001a\u00020OH\u0002R\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u0012\"\u0004\u0008\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u001c@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\"R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008,\u0010-\"\u0004\u0008.\u0010/R\u001e\u00100\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u00081\u0010\u0017R\u000e\u00102\u001a\u000203X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010;\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008<\u0010\u0017R\u000e\u0010=\u001a\u000209X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020?X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010K\u001a\u00020J2\u0006\u0010\u0013\u001a\u00020J@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008L\u0010M\u00a8\u0006k"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "faceCapturingRect",
        "Landroid/graphics/Rect;",
        "getFaceCapturingRect",
        "()Landroid/graphics/Rect;",
        "helperRectF",
        "Landroid/graphics/RectF;",
        "getHelperRectF",
        "()Landroid/graphics/RectF;",
        "value",
        "",
        "recognizingFactor",
        "setRecognizingFactor",
        "(F)V",
        "faceRectangle",
        "getFaceRectangle",
        "setFaceRectangle",
        "(Landroid/graphics/RectF;)V",
        "Landroid/graphics/Bitmap;",
        "bgBitmap",
        "setBgBitmap",
        "(Landroid/graphics/Bitmap;)V",
        "isAnalyzing",
        "",
        "()Z",
        "maxRadius",
        "focusRadius",
        "radiusHolder",
        "com/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1",
        "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;",
        "radiusAnimation",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        "stateListener",
        "Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;",
        "getStateListener",
        "()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;",
        "setStateListener",
        "(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;)V",
        "detectingFactor",
        "setDetectingFactor",
        "detectingAnimationSpeed",
        "",
        "detectingArc1RotationAngle",
        "detectingArc2RotationAngle",
        "updater",
        "Landroid/animation/ValueAnimator$AnimatorUpdateListener;",
        "recognizingAnimationDirect",
        "Landroid/animation/ValueAnimator;",
        "recognizingAnimationInDirect",
        "progressRotationAngle",
        "setProgressRotationAngle",
        "progressRotationAnimator",
        "mFaceProgressMarkerPaint",
        "Landroid/graphics/Paint;",
        "mFaceDetectionCirclePaint",
        "mFaceCutCirclePaint",
        "mFaceScanCompletePaint",
        "mFaceRecognizingPaint",
        "mFaceRectanglePaint",
        "mColorFaceMarkerActive",
        "mColorFaceMarkerInActive",
        "mColorOverlay",
        "mMarkerSize",
        "mMarkerPadding",
        "Lkotlin/ranges/IntRange;",
        "progressRange",
        "setProgressRange",
        "(Lkotlin/ranges/IntRange;)V",
        "setOverlayColor",
        "",
        "color",
        "setFaceRecognizedColor",
        "setFaceMarkerActiveColor",
        "setFaceMarkerInActiveColor",
        "setRecognizingState",
        "setFaceDetectedState",
        "setFaceAnalyzingState",
        "setScanCompleteState",
        "onDetachedFromWindow",
        "onSizeChanged",
        "w",
        "h",
        "oldw",
        "oldh",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawRecognizingCircle",
        "drawMarkers",
        "drawRecognizingArc",
        "updateOverlay",
        "Companion",
        "SNSFaceViewState",
        "SNSFaceStateListener",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSLivenessFaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSLivenessFaceView.kt\ncom/sumsub/sns/core/widget/SNSLivenessFaceView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,491:1\n30#2:492\n91#2,14:493\n30#2:507\n91#2,14:508\n37#3:522\n37#3:523\n37#3:524\n1#4:525\n43#5,3:526\n*S KotlinDebug\n*F\n+ 1 SNSLivenessFaceView.kt\ncom/sumsub/sns/core/widget/SNSLivenessFaceView\n*L\n131#1:492\n131#1:493,14\n138#1:507\n138#1:508,14\n271#1:522\n275#1:523\n280#1:524\n473#1:526,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private bgBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private detectingAnimationSpeed:J

.field private detectingArc1RotationAngle:F

.field private detectingArc2RotationAngle:F

.field private detectingFactor:F

.field private faceRectangle:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private focusRadius:I

.field private final helperRectF:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mColorFaceMarkerActive:I

.field private mColorFaceMarkerInActive:I

.field private mColorOverlay:I

.field private final mFaceCutCirclePaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mFaceDetectionCirclePaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mFaceProgressMarkerPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mFaceRecognizingPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mFaceRectanglePaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mFaceScanCompletePaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final mMarkerPadding:I

.field private final mMarkerSize:I

.field private maxRadius:I

.field private progressRange:Lkotlin/ranges/IntRange;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private progressRotationAngle:F

.field private final progressRotationAnimator:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final radiusHolder:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recognizingAnimationDirect:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final recognizingAnimationInDirect:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private recognizingFactor:F

.field private stateListener:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final updater:Landroid/animation/ValueAnimator$AnimatorUpdateListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->Companion:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 2
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
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

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    .line 3
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 12
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

    .line 7
    invoke-direct/range {p0 .. p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    const/high16 v0, -0x40800000    # -1.0f

    .line 9
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 10
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    iput-object v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusHolder:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$radiusHolder$1;

    .line 11
    new-instance v2, Landroidx/dynamicanimation/animation/SpringAnimation;

    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    invoke-direct {v2, p0, v1, v3}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;F)V

    .line 12
    invoke-virtual {v2}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v1

    const/high16 v3, 0x3f400000    # 0.75f

    invoke-virtual {v1, v3}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 13
    invoke-virtual {v2}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v1

    const/high16 v3, 0x43480000    # 200.0f

    invoke-virtual {v1, v3}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    const/high16 v1, -0x3b860000    # -1000.0f

    .line 14
    invoke-virtual {v2, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMinValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    const/high16 v1, 0x447a0000    # 1000.0f

    .line 15
    invoke-virtual {v2, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->setMaxValue(F)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 16
    new-instance v1, Lcom/sumsub/sns/core/widget/b0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/core/widget/b0;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    invoke-virtual {v2, v1}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 17
    iput-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 18
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    const-wide/16 v0, 0x3e8

    .line 19
    iput-wide v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingAnimationSpeed:J

    const/high16 v0, 0x41c80000    # 25.0f

    .line 20
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc1RotationAngle:F

    .line 21
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc2RotationAngle:F

    .line 22
    new-instance v0, Lcom/sumsub/sns/core/widget/c0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/c0;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->updater:Landroid/animation/ValueAnimator$AnimatorUpdateListener;

    const/4 v1, 0x2

    .line 23
    new-array v2, v1, [F

    fill-array-data v2, :array_0

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 24
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 25
    iget-wide v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingAnimationSpeed:J

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 26
    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 27
    new-instance v3, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$recognizingAnimationDirect$lambda$4$$inlined$doOnEnd$1;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$recognizingAnimationDirect$lambda$4$$inlined$doOnEnd$1;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    .line 28
    invoke-virtual {v2, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 29
    iput-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 30
    new-array v2, v1, [F

    fill-array-data v2, :array_1

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 31
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 32
    iget-wide v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingAnimationSpeed:J

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 33
    invoke-virtual {v2, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 34
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$recognizingAnimationInDirect$lambda$6$$inlined$doOnEnd$1;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$recognizingAnimationInDirect$lambda$6$$inlined$doOnEnd$1;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    .line 35
    invoke-virtual {v2, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 36
    iput-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    const/4 v0, 0x0

    .line 37
    new-array v2, v1, [F

    fill-array-data v2, :array_2

    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    .line 38
    iget-wide v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingAnimationSpeed:J

    invoke-virtual {v2, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 39
    new-instance v3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 40
    new-instance v3, Lcom/sumsub/sns/core/widget/d0;

    invoke-direct {v3, p0}, Lcom/sumsub/sns/core/widget/d0;-><init>(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)V

    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    const/4 v3, -0x1

    .line 41
    invoke-virtual {v2, v3}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    .line 42
    iput-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 43
    new-instance v2, Landroid/graphics/Paint;

    const/4 v4, 0x1

    invoke-direct {v2, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 44
    sget-object v5, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 45
    sget-object v6, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 46
    sget-object v6, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 47
    iput-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceProgressMarkerPaint:Landroid/graphics/Paint;

    .line 48
    new-instance v7, Landroid/graphics/Paint;

    invoke-direct {v7, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 49
    sget-object v8, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v7, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 50
    iput-object v7, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceDetectionCirclePaint:Landroid/graphics/Paint;

    .line 51
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 52
    new-instance v10, Landroid/graphics/PorterDuffXfermode;

    sget-object v11, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v10, v11}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v9, v10}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 53
    iput-object v9, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceCutCirclePaint:Landroid/graphics/Paint;

    .line 54
    new-instance v9, Landroid/graphics/Paint;

    invoke-direct {v9, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 55
    invoke-virtual {v9, v5}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 56
    iput-object v9, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceScanCompletePaint:Landroid/graphics/Paint;

    .line 57
    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 58
    invoke-virtual {v5, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 59
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 60
    iput-object v5, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRecognizingPaint:Landroid/graphics/Paint;

    .line 61
    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    .line 62
    invoke-virtual {v6, v8}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const v4, -0xff01

    .line 63
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v1, v1

    .line 64
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v1, v8

    float-to-int v1, v1

    int-to-float v1, v1

    .line 65
    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 66
    iput-object v6, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRectanglePaint:Landroid/graphics/Paint;

    .line 67
    sget-object v1, Lkotlin/ranges/IntRange;->Companion:Lkotlin/ranges/IntRange$Companion;

    invoke-virtual {v1}, Lkotlin/ranges/IntRange$Companion;->getEMPTY()Lkotlin/ranges/IntRange;

    move-result-object v1

    iput-object v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRange:Lkotlin/ranges/IntRange;

    .line 68
    sget-object v1, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView:[I

    move/from16 v6, p4

    .line 69
    invoke-virtual {p1, p2, v1, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 70
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceMarkerActiveColor:I

    .line 71
    invoke-static {p1, p2, v4}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerActive:I

    .line 72
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceMarkerInActiveColor:I

    .line 73
    invoke-static {p1, p2, v4}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerInActive:I

    .line 74
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceMarkerStroke:I

    .line 75
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 76
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p2

    invoke-virtual {v7, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 77
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceMarkerSize:I

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerSize:I

    .line 78
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceMarkerPadding:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerPadding:I

    .line 79
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceOverlayColor:I

    invoke-static {p1, p2, v3}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorOverlay:I

    .line 80
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceCompleteOverlayColor:I

    .line 81
    invoke-static {p1, p2, v3}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/content/res/TypedArray;II)I

    move-result p2

    invoke-virtual {v9, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceRecognizingColor:I

    .line 83
    invoke-static {p1, p2, v3}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/content/res/TypedArray;II)I

    move-result p2

    invoke-virtual {v5, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 84
    invoke-virtual {v5}, Landroid/graphics/Paint;->getColor()I

    move-result p2

    invoke-virtual {v7, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 85
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceRecognizingStroke:I

    .line 86
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {v5, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_sns_ProofaceRecognizingAnimationSpeed:I

    const/16 v0, 0x3e8

    .line 88
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    int-to-long v0, p2

    .line 89
    iput-wide v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingAnimationSpeed:J

    .line 90
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_android_padding:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 92
    invoke-virtual {p0, p2, p2, p2, p2}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 93
    :cond_0
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_android_paddingLeft:I

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    .line 95
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 96
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_android_paddingRight:I

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    .line 98
    invoke-virtual {p1, p3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    .line 99
    sget v0, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_android_paddingTop:I

    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    .line 101
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    .line 102
    sget v1, Lcom/sumsub/sns/R$styleable;->SNSLivenessFaceView_android_paddingBottom:I

    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    .line 104
    invoke-virtual {p1, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    .line 105
    invoke-virtual {p0, p2, v0, p3, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 106
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 107
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerActive:I

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 108
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->BACKGROUND_COMMON:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 109
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 110
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-static {p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p3

    .line 111
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 112
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setOverlayColor(I)V

    .line 113
    :cond_1
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_SUCCESS:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 114
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-static {p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p3

    .line 116
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 117
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceRecognizedColor(I)V

    .line 118
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceMarkerActiveColor(I)V

    .line 119
    :cond_2
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 120
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 121
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-static {p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p3

    .line 122
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 123
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setFaceMarkerInActiveColor(I)V

    :cond_3
    return-void

    nop

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x40800000    # 4.0f
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 4
    sget p3, Lcom/sumsub/sns/R$attr;->sns_ProofaceViewStyle:I

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 5
    sget p4, Lcom/sumsub/sns/R$style;->SNSProofaceViewStyle:I

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator$lambda$8$lambda$7(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V

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
.end method

.method public static final synthetic access$getRecognizingAnimationDirect$p(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

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
    .line 25
.end method

.method public static final synthetic access$getRecognizingAnimationInDirect$p(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

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
    .line 25
.end method

.method public static final synthetic access$getRecognizingFactor$p(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

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
    .line 25
.end method

.method public static final synthetic access$isAnalyzing(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic access$setRecognizingFactor(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setRecognizingFactor(F)V

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
.end method

.method public static synthetic b(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->updater$lambda$2(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V

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
.end method

.method public static synthetic c(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation$lambda$1$lambda$0(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V

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
.end method

.method private final drawMarkers(Landroid/graphics/Canvas;)V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x1

    .line 4
    int-to-float v1, v1

    .line 5
    .line 6
    iget v2, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 7
    .line 8
    .line 9
    const v3, -0x421eb852    # -0.11f

    .line 10
    .line 11
    .line 12
    const v4, 0x3de147ae    # 0.11f

    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 16
    move-result v2

    .line 17
    .line 18
    const/16 v3, 0xa

    .line 19
    int-to-float v3, v3

    .line 20
    mul-float/2addr v2, v3

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 24
    move-result v2

    .line 25
    sub-float/2addr v1, v2

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpl-float v2, v1, v2

    .line 30
    .line 31
    if-gtz v2, :cond_6

    .line 32
    const/4 v2, 0x0

    .line 33
    .line 34
    cmpg-float v2, v1, v2

    .line 35
    .line 36
    if-gez v2, :cond_0

    .line 37
    .line 38
    goto/16 :goto_3

    .line 39
    .line 40
    :cond_0
    iget v2, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerSize:I

    .line 41
    int-to-float v2, v2

    .line 42
    mul-float/2addr v2, v1

    .line 43
    .line 44
    iget v1, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->focusRadius:I

    .line 45
    int-to-float v3, v1

    .line 46
    .line 47
    iget v4, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->maxRadius:I

    .line 48
    sub-int/2addr v4, v1

    .line 49
    int-to-float v1, v4

    .line 50
    .line 51
    iget v4, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 52
    mul-float/2addr v1, v4

    .line 53
    sub-float/2addr v3, v1

    .line 54
    .line 55
    iget v1, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerPadding:I

    .line 56
    int-to-float v1, v1

    .line 57
    add-float/2addr v3, v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerX()I

    .line 65
    move-result v1

    .line 66
    int-to-float v1, v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 70
    move-result-object v4

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Landroid/graphics/Rect;->centerY()I

    .line 74
    move-result v4

    .line 75
    int-to-float v4, v4

    .line 76
    .line 77
    .line 78
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 79
    .line 80
    iget v5, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAngle:F

    .line 81
    .line 82
    move-object/from16 v6, p1

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6, v5, v1, v4}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 86
    const/4 v5, 0x0

    .line 87
    .line 88
    const/16 v7, 0x168

    .line 89
    .line 90
    .line 91
    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 92
    move-result-object v5

    .line 93
    const/4 v7, 0x4

    .line 94
    .line 95
    .line 96
    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 101
    move-result v7

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 105
    move-result v12

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Lkotlin/ranges/IntProgression;->getStep()I

    .line 109
    move-result v5

    .line 110
    .line 111
    if-lez v5, :cond_1

    .line 112
    .line 113
    if-le v7, v12, :cond_2

    .line 114
    .line 115
    :cond_1
    if-gez v5, :cond_5

    .line 116
    .line 117
    if-gt v12, v7, :cond_5

    .line 118
    :cond_2
    move v13, v7

    .line 119
    :goto_0
    int-to-double v7, v13

    .line 120
    .line 121
    .line 122
    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    .line 123
    move-result-wide v7

    .line 124
    double-to-float v7, v7

    .line 125
    float-to-double v8, v1

    .line 126
    float-to-double v10, v3

    .line 127
    float-to-double v14, v7

    .line 128
    .line 129
    .line 130
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 131
    move-result-wide v16

    .line 132
    .line 133
    mul-double v16, v16, v10

    .line 134
    .line 135
    move/from16 v19, v1

    .line 136
    .line 137
    move/from16 v18, v2

    .line 138
    .line 139
    add-double v1, v16, v8

    .line 140
    double-to-float v7, v1

    .line 141
    float-to-double v1, v4

    .line 142
    .line 143
    .line 144
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 145
    move-result-wide v16

    .line 146
    .line 147
    mul-double v16, v16, v10

    .line 148
    .line 149
    sub-double v10, v1, v16

    .line 150
    double-to-float v10, v10

    .line 151
    .line 152
    add-float v11, v3, v18

    .line 153
    .line 154
    move-wide/from16 v16, v1

    .line 155
    float-to-double v1, v11

    .line 156
    .line 157
    .line 158
    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    .line 159
    move-result-wide v20

    .line 160
    .line 161
    mul-double v20, v20, v1

    .line 162
    .line 163
    add-double v8, v20, v8

    .line 164
    double-to-float v9, v8

    .line 165
    .line 166
    .line 167
    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    .line 168
    move-result-wide v14

    .line 169
    mul-double/2addr v14, v1

    .line 170
    .line 171
    sub-double v1, v16, v14

    .line 172
    double-to-float v1, v1

    .line 173
    .line 174
    iget-object v2, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceProgressMarkerPaint:Landroid/graphics/Paint;

    .line 175
    .line 176
    .line 177
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 178
    move-result v8

    .line 179
    .line 180
    if-nez v8, :cond_4

    .line 181
    .line 182
    iget-object v8, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRange:Lkotlin/ranges/IntRange;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v8}, Lkotlin/ranges/IntProgression;->getFirst()I

    .line 186
    move-result v11

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8}, Lkotlin/ranges/IntProgression;->getLast()I

    .line 190
    move-result v8

    .line 191
    .line 192
    if-gt v13, v8, :cond_3

    .line 193
    .line 194
    if-gt v11, v13, :cond_3

    .line 195
    goto :goto_1

    .line 196
    .line 197
    :cond_3
    iget v8, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerInActive:I

    .line 198
    goto :goto_2

    .line 199
    .line 200
    :cond_4
    :goto_1
    iget v8, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerActive:I

    .line 201
    .line 202
    .line 203
    :goto_2
    invoke-virtual {v2, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 204
    .line 205
    iget-object v11, v0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceProgressMarkerPaint:Landroid/graphics/Paint;

    .line 206
    move v8, v10

    .line 207
    move v10, v1

    .line 208
    .line 209
    .line 210
    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 211
    .line 212
    if-eq v13, v12, :cond_5

    .line 213
    add-int/2addr v13, v5

    .line 214
    .line 215
    move-object/from16 v6, p1

    .line 216
    .line 217
    move/from16 v2, v18

    .line 218
    .line 219
    move/from16 v1, v19

    .line 220
    goto :goto_0

    .line 221
    .line 222
    .line 223
    :cond_5
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 224
    :cond_6
    :goto_3
    return-void
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
.end method

.method private final drawRecognizingArc(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 12
    const/4 v1, 0x1

    .line 13
    int-to-float v1, v1

    .line 14
    .line 15
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 19
    move-result v2

    .line 20
    sub-float/2addr v1, v2

    .line 21
    .line 22
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 26
    move-result v2

    .line 27
    mul-float/2addr v2, v1

    .line 28
    const/4 v1, 0x2

    .line 29
    int-to-float v1, v1

    .line 30
    div-float/2addr v2, v1

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 35
    .line 36
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 37
    .line 38
    cmpl-float v0, v0, v1

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    .line 42
    const/high16 v1, 0x43340000    # 180.0f

    .line 43
    :cond_0
    move v4, v1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 47
    .line 48
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc1RotationAngle:F

    .line 49
    .line 50
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 54
    move-result v1

    .line 55
    .line 56
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 60
    move-result v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, v1, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 64
    .line 65
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 66
    .line 67
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRecognizingPaint:Landroid/graphics/Paint;

    .line 68
    .line 69
    const/high16 v5, 0x43340000    # 180.0f

    .line 70
    const/4 v6, 0x0

    .line 71
    move-object v2, p1

    .line 72
    .line 73
    .line 74
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 75
    .line 76
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc1RotationAngle:F

    .line 77
    neg-float p1, p1

    .line 78
    .line 79
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc2RotationAngle:F

    .line 80
    sub-float/2addr p1, v0

    .line 81
    .line 82
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 86
    move-result v0

    .line 87
    .line 88
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 92
    move-result v1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, p1, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 96
    .line 97
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

    .line 98
    .line 99
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRecognizingPaint:Landroid/graphics/Paint;

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Landroid/graphics/Canvas;->restore()V

    .line 106
    return-void
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
.end method

.method private final drawRecognizingCircle(Landroid/graphics/Canvas;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    .line 20
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->focusRadius:I

    .line 21
    int-to-float v2, v2

    .line 22
    const/4 v3, 0x1

    .line 23
    int-to-float v3, v3

    .line 24
    .line 25
    iget v4, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 26
    sub-float/2addr v3, v4

    .line 27
    mul-float/2addr v3, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    .line 38
    const/high16 v4, 0x40000000    # 2.0f

    .line 39
    div-float/2addr v2, v4

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 43
    move-result v2

    .line 44
    .line 45
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->bgBitmap:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v3, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 56
    move-result v3

    .line 57
    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceScanCompletePaint:Landroid/graphics/Paint;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_1
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceDetectionCirclePaint:Landroid/graphics/Paint;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 70
    return-void
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
.end method

.method private final isAnalyzing()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    cmpg-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRange:Lkotlin/ranges/IntRange;

    .line 10
    .line 11
    sget-object v1, Lkotlin/ranges/IntRange;->Companion:Lkotlin/ranges/IntRange$Companion;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lkotlin/ranges/IntRange$Companion;->getEMPTY()Lkotlin/ranges/IntRange;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
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
.end method

.method private static final progressRotationAnimator$lambda$8$lambda$7(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setProgressRotationAngle(F)V

    .line 14
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
.end method

.method private static final radiusAnimation$lambda$1$lambda$0(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->stateListener:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;

    .line 3
    .line 4
    if-eqz p1, :cond_3

    .line 5
    .line 6
    iget p2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 7
    const/4 p3, 0x0

    .line 8
    .line 9
    cmpg-float p3, p2, p3

    .line 10
    .line 11
    if-nez p3, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 15
    move-result p0

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Analyzing:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    sget-object p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Recognized:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 23
    goto :goto_0

    .line 24
    .line 25
    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    cmpg-float p0, p2, p0

    .line 28
    .line 29
    if-nez p0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Complete:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_2
    sget-object p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;->Recognizing:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p1, p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;->onState(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceViewState;)V

    .line 38
    :cond_3
    return-void
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
.end method

.method private final setBgBitmap(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->bgBitmap:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->updateOverlay()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method private final setDetectingFactor(F)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 3
    .line 4
    cmpg-float v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 13
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
    .line 25
.end method

.method private final setFaceMarkerActiveColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerActive:I

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
.end method

.method private final setFaceMarkerInActiveColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorFaceMarkerInActive:I

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
.end method

.method private final setFaceRecognizedColor(I)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRecognizingPaint:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceDetectionCirclePaint:Landroid/graphics/Paint;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
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
.end method

.method private final setOverlayColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorOverlay:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
    .line 25
.end method

.method private final setProgressRange(Lkotlin/ranges/IntRange;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRange:Lkotlin/ranges/IntRange;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRange:Lkotlin/ranges/IntRange;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

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
.end method

.method private final setProgressRotationAngle(F)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAngle:F

    .line 3
    .line 4
    cmpg-float v0, p1, v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAngle:F

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 13
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
    .line 25
.end method

.method private final setRecognizingFactor(F)V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 3
    .line 4
    cmpg-float v0, v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    .line 10
    .line 11
    const/high16 v1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 15
    move-result p1

    .line 16
    .line 17
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->updateOverlay()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 24
    return-void
    .line 25
.end method

.method private final updateOverlay()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    .line 8
    move-result v0

    .line 9
    int-to-float v0, v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    .line 20
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->focusRadius:I

    .line 21
    int-to-float v2, v2

    .line 22
    const/4 v3, 0x1

    .line 23
    int-to-float v3, v3

    .line 24
    .line 25
    iget v4, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 26
    sub-float/2addr v3, v4

    .line 27
    mul-float/2addr v3, v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 35
    move-result v2

    .line 36
    int-to-float v2, v2

    .line 37
    .line 38
    const/high16 v4, 0x40000000    # 2.0f

    .line 39
    div-float/2addr v2, v4

    .line 40
    .line 41
    .line 42
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 43
    move-result v2

    .line 44
    .line 45
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->bgBitmap:Landroid/graphics/Bitmap;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    new-instance v4, Landroid/graphics/Canvas;

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 53
    .line 54
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mColorOverlay:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v3}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 58
    .line 59
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceCutCirclePaint:Landroid/graphics/Paint;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 63
    :cond_0
    return-void
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
.end method

.method private static final updater$lambda$2(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setDetectingFactor(F)V

    .line 14
    .line 15
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc1RotationAngle:F

    .line 16
    .line 17
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    const v1, 0x3e99999a    # 0.3f

    .line 25
    mul-float/2addr v0, v1

    .line 26
    add-float/2addr v0, p1

    .line 27
    .line 28
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc1RotationAngle:F

    .line 29
    .line 30
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc2RotationAngle:F

    .line 31
    .line 32
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingFactor:F

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 36
    move-result v0

    .line 37
    .line 38
    const/high16 v1, 0x3f000000    # 0.5f

    .line 39
    mul-float/2addr v0, v1

    .line 40
    add-float/2addr v0, p1

    .line 41
    .line 42
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->detectingArc2RotationAngle:F

    .line 43
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
.end method


# virtual methods
.method public final getFaceCapturingRect()Landroid/graphics/Rect;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerPadding:I

    .line 3
    .line 4
    mul-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mMarkerSize:I

    .line 7
    .line 8
    mul-int/lit8 v1, v1, 0x2

    .line 9
    add-int/2addr v1, v0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceProgressMarkerPaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 15
    move-result v0

    .line 16
    float-to-int v0, v0

    .line 17
    add-int/2addr v1, v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 25
    move-result v2

    .line 26
    sub-int/2addr v0, v2

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 30
    move-result v2

    .line 31
    sub-int/2addr v0, v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    move-result v3

    .line 40
    sub-int/2addr v2, v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 44
    move-result v3

    .line 45
    sub-int/2addr v2, v3

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 49
    move-result v0

    .line 50
    sub-int/2addr v0, v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 58
    move-result v2

    .line 59
    sub-int/2addr v1, v2

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 63
    move-result v2

    .line 64
    sub-int/2addr v1, v2

    .line 65
    sub-int/2addr v1, v0

    .line 66
    .line 67
    div-int/lit8 v1, v1, 0x2

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 71
    move-result v2

    .line 72
    add-int/2addr v2, v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 76
    move-result v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 80
    move-result v3

    .line 81
    sub-int/2addr v1, v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 85
    move-result v3

    .line 86
    sub-int/2addr v1, v3

    .line 87
    sub-int/2addr v1, v0

    .line 88
    .line 89
    div-int/lit8 v1, v1, 0x2

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 93
    move-result v3

    .line 94
    add-int/2addr v3, v1

    .line 95
    .line 96
    new-instance v1, Landroid/graphics/Rect;

    .line 97
    .line 98
    add-int v4, v2, v0

    .line 99
    add-int/2addr v0, v3

    .line 100
    .line 101
    .line 102
    invoke-direct {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 103
    return-object v1
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
.end method

.method public final getFaceRectangle()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->faceRectangle:Landroid/graphics/RectF;

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
    .line 17
.end method

.method public final getHelperRectF()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->helperRectF:Landroid/graphics/RectF;

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
    .line 17
.end method

.method public final getStateListener()Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->stateListener:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;

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
    .line 17
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->cancel()V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 19
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->drawRecognizingCircle(Landroid/graphics/Canvas;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->drawMarkers(Landroid/graphics/Canvas;)V

    .line 19
    .line 20
    :cond_0
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->isAnalyzing()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->drawRecognizingArc(Landroid/graphics/Canvas;)V

    .line 35
    .line 36
    :cond_1
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingFactor:F

    .line 37
    .line 38
    cmpg-float v0, v0, v1

    .line 39
    .line 40
    if-gez v0, :cond_2

    .line 41
    .line 42
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->faceRectangle:Landroid/graphics/RectF;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->mFaceRectanglePaint:Landroid/graphics/Paint;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 53
    return-void
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
.end method

.method public onMeasure(II)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 4
    move-result p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    move-result p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 12
    move-result v0

    .line 13
    sub-int/2addr p1, v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 17
    move-result v0

    .line 18
    sub-int/2addr p1, v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 22
    move-result v0

    .line 23
    sub-int/2addr p2, v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 27
    move-result v0

    .line 28
    sub-int/2addr p2, v0

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 32
    move-result p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 36
    move-result p2

    .line 37
    add-int/2addr p2, p1

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, p2

    .line 43
    .line 44
    const/high16 p2, 0x40000000    # 2.0f

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 48
    move-result v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 52
    move-result v1

    .line 53
    add-int/2addr v1, p1

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 57
    move-result p1

    .line 58
    add-int/2addr p1, v1

    .line 59
    .line 60
    .line 61
    invoke-static {p1, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 62
    move-result p1

    .line 63
    .line 64
    .line 65
    invoke-super {p0, v0, p1}, Landroid/view/View;->onMeasure(II)V

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
.end method

.method public onSizeChanged(IIII)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 7
    move-result-object p3

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 11
    move-result p4

    .line 12
    .line 13
    .line 14
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerX()I

    .line 15
    move-result v0

    .line 16
    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 21
    move-result p4

    .line 22
    int-to-float p4, p4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    .line 26
    move-result v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Landroid/graphics/Rect;->centerY()I

    .line 30
    move-result p3

    .line 31
    .line 32
    sub-int p3, p2, p3

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 36
    move-result p3

    .line 37
    int-to-float p3, p3

    .line 38
    mul-float/2addr p4, p4

    .line 39
    mul-float/2addr p3, p3

    .line 40
    add-float/2addr p3, p4

    .line 41
    float-to-double p3, p3

    .line 42
    .line 43
    .line 44
    invoke-static {p3, p4}, Ljava/lang/Math;->sqrt(D)D

    .line 45
    move-result-wide p3

    .line 46
    double-to-float p3, p3

    .line 47
    float-to-int p3, p3

    .line 48
    .line 49
    iput p3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->maxRadius:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->getFaceCapturingRect()Landroid/graphics/Rect;

    .line 53
    move-result-object p3

    .line 54
    .line 55
    .line 56
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    .line 57
    move-result p3

    .line 58
    .line 59
    div-int/lit8 p3, p3, 0x2

    .line 60
    .line 61
    iput p3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->focusRadius:I

    .line 62
    .line 63
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->bgBitmap:Landroid/graphics/Bitmap;

    .line 64
    .line 65
    if-eqz p3, :cond_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 69
    move-result p3

    .line 70
    .line 71
    if-nez p3, :cond_0

    .line 72
    .line 73
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->bgBitmap:Landroid/graphics/Bitmap;

    .line 74
    .line 75
    if-eqz p3, :cond_0

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 79
    .line 80
    :cond_0
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setBgBitmap(Landroid/graphics/Bitmap;)V

    .line 88
    return-void
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
.end method

.method public final setFaceAnalyzingState()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 7
    .line 8
    sget-object v0, Lkotlin/ranges/IntRange;->Companion:Lkotlin/ranges/IntRange$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lkotlin/ranges/IntRange$Companion;->getEMPTY()Lkotlin/ranges/IntRange;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setProgressRange(Lkotlin/ranges/IntRange;)V

    .line 16
    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 21
    .line 22
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 39
    :cond_0
    return-void
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
.end method

.method public final setFaceDetectedState()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 33
    .line 34
    :cond_0
    new-instance v0, Lkotlin/ranges/IntRange;

    .line 35
    const/4 v1, 0x0

    .line 36
    .line 37
    const/16 v2, 0x168

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setProgressRange(Lkotlin/ranges/IntRange;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 49
    move-result v0

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 57
    :cond_1
    return-void
.end method

.method public final setFaceRectangle(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->faceRectangle:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->faceRectangle:Landroid/graphics/RectF;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
.end method

.method public final setRecognizingState()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 3
    .line 4
    const/high16 v1, -0x3db80000    # -50.0f

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 8
    .line 9
    sget-object v0, Lkotlin/ranges/IntRange;->Companion:Lkotlin/ranges/IntRange$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlin/ranges/IntRange$Companion;->getEMPTY()Lkotlin/ranges/IntRange;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setProgressRange(Lkotlin/ranges/IntRange;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 32
    return-void
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
.end method

.method public final setScanCompleteState()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->radiusAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 3
    .line 4
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 8
    .line 9
    sget-object v0, Lkotlin/ranges/IntRange;->Companion:Lkotlin/ranges/IntRange$Companion;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lkotlin/ranges/IntRange$Companion;->getEMPTY()Lkotlin/ranges/IntRange;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->setProgressRange(Lkotlin/ranges/IntRange;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationDirect:Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->recognizingAnimationInDirect:Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 27
    .line 28
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->progressRotationAnimator:Landroid/animation/ValueAnimator;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 32
    return-void
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
.end method

.method public final setStateListener(Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSLivenessFaceView;->stateListener:Lcom/sumsub/sns/core/widget/SNSLivenessFaceView$SNSFaceStateListener;

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
.end method
