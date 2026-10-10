.class public final Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;
.super Lcom/google/android/material/imageview/ShapeableImageView;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$Companion;,
        Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$GestureListener;,
        Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0083\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0011\u0018\u0000 d2\u00020\u0001:\u0003bcdB\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:H\u0017J\u0008\u0010;\u001a\u00020<H\u0002J\u0008\u0010=\u001a\u00020\u000bH\u0002J\u0008\u0010>\u001a\u00020<H\u0002J\u0012\u0010?\u001a\u00020/2\u0008\u0008\u0002\u0010@\u001a\u00020\u000bH\u0002J\u0012\u0010A\u001a\u00020/2\u0008\u0008\u0002\u0010@\u001a\u00020\u000bH\u0002J\u0012\u0010B\u001a\u00020\u000b2\u0008\u0008\u0002\u0010C\u001a\u00020\u000bH\u0002J\u0012\u0010D\u001a\u00020\u000b2\u0008\u0008\u0002\u0010C\u001a\u00020\u000bH\u0002J\u0008\u0010E\u001a\u00020\u000bH\u0002J\u0008\u0010F\u001a\u00020\u000bH\u0002J\u0008\u0010G\u001a\u00020<H\u0002J\u0008\u0010H\u001a\u00020<H\u0002J \u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u000bH\u0002J\u0018\u0010M\u001a\u00020<2\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0002J\u0012\u0010P\u001a\u00020<2\u0008\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0018\u0010S\u001a\u00020<2\u0006\u0010T\u001a\u00020\u00072\u0006\u0010U\u001a\u00020\u0007H\u0014J\u0008\u0010V\u001a\u00020<H\u0016J\u0008\u0010W\u001a\u00020<H\u0014J\u0006\u0010X\u001a\u00020<J\u0006\u0010Y\u001a\u00020<J\u0018\u0010Z\u001a\u00020<2\u0006\u0010[\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\\\u001a\u00020/J\u0018\u0010]\u001a\u00020<2\u0008\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020\u0007J\u0006\u0010a\u001a\u00020<R\u001e\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R\u0011\u00105\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u00086\u00107\u00a8\u0006e"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;",
        "Lcom/google/android/material/imageview/ShapeableImageView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "value",
        "",
        "rotationAngle",
        "setRotationAngle",
        "(F)V",
        "targetAngle",
        "rotationPositionHolder",
        "com/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1",
        "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;",
        "rotationAnimation",
        "Landroidx/dynamicanimation/animation/SpringAnimation;",
        "getRotationAnimation$annotations",
        "()V",
        "scaleAnimation",
        "Landroid/animation/ValueAnimator;",
        "gestureDetector",
        "Landroid/view/GestureDetector;",
        "mtrx",
        "Landroid/graphics/Matrix;",
        "touchMode",
        "Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;",
        "touchStartDistance",
        "touchStartX",
        "touchStartY",
        "pointerId1",
        "pointerId2",
        "currentScale",
        "minScale",
        "getMinScale",
        "()F",
        "viewPort",
        "Landroid/graphics/RectF;",
        "scroller",
        "Landroid/widget/Scroller;",
        "lastViewPortCenterX",
        "lastViewPortCenterY",
        "lastViewPortCenterSaved",
        "",
        "zoomEnabled",
        "getZoomEnabled",
        "()Z",
        "setZoomEnabled",
        "(Z)V",
        "rotation",
        "getRotation",
        "()I",
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "reduceClipping",
        "",
        "getFitScale",
        "finishScale",
        "canTranslateX",
        "scale",
        "canTranslateY",
        "getDrawableScaledWidth",
        "scaleFactor",
        "getDrawableScaledHeight",
        "getDrawableWidth",
        "getDrawableHeight",
        "computeViewPort",
        "updateMatrix",
        "animateScale",
        "scaleTo",
        "drawableCenterEndX",
        "drawableCenterEndY",
        "fling",
        "velocityX",
        "velocityY",
        "setImageDrawable",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "computeScroll",
        "onDetachedFromWindow",
        "rotateCW",
        "rotateCCW",
        "rotate",
        "angle",
        "exact",
        "setImageBitmapWithRotation",
        "bm",
        "Landroid/graphics/Bitmap;",
        "rotationDegrees",
        "clearImage",
        "GestureListener",
        "TouchMode",
        "Companion",
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
        "SMAP\nSNSRotationZoomableImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSRotationZoomableImageView.kt\ncom/sumsub/sns/core/widget/SNSRotationZoomableImageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,530:1\n37#2:531\n53#2:532\n*S KotlinDebug\n*F\n+ 1 SNSRotationZoomableImageView.kt\ncom/sumsub/sns/core/widget/SNSRotationZoomableImageView\n*L\n407#1:531\n407#1:532\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private currentScale:F

.field private final gestureDetector:Landroid/view/GestureDetector;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private lastViewPortCenterSaved:Z

.field private lastViewPortCenterX:F

.field private lastViewPortCenterY:F

.field private final mtrx:Landroid/graphics/Matrix;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private pointerId1:I

.field private pointerId2:I

.field private rotationAngle:F

.field private final rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rotationPositionHolder:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private scaleAnimation:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final scroller:Landroid/widget/Scroller;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private targetAngle:F

.field private touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private touchStartDistance:F

.field private touchStartX:F

.field private touchStartY:F

.field private final viewPort:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private zoomEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->Companion:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$Companion;

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
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
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

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
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

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/imageview/ShapeableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;-><init>(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationPositionHolder:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$rotationPositionHolder$1;

    .line 7
    new-instance v1, Landroidx/dynamicanimation/animation/SpringAnimation;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Landroidx/dynamicanimation/animation/SpringAnimation;-><init>(Ljava/lang/Object;Landroidx/dynamicanimation/animation/FloatPropertyCompat;F)V

    .line 8
    invoke-virtual {v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Landroidx/dynamicanimation/animation/SpringForce;->setDampingRatio(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 9
    invoke-virtual {v1}, Landroidx/dynamicanimation/animation/SpringAnimation;->getSpring()Landroidx/dynamicanimation/animation/SpringForce;

    move-result-object v0

    const v3, 0x44bb8000    # 1500.0f

    invoke-virtual {v0, v3}, Landroidx/dynamicanimation/animation/SpringForce;->setStiffness(F)Landroidx/dynamicanimation/animation/SpringForce;

    .line 10
    new-instance v0, Lcom/sumsub/sns/core/widget/f0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/f0;-><init>(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V

    invoke-virtual {v1, v0}, Landroidx/dynamicanimation/animation/DynamicAnimation;->addEndListener(Landroidx/dynamicanimation/animation/DynamicAnimation$OnAnimationEndListener;)Landroidx/dynamicanimation/animation/DynamicAnimation;

    .line 11
    iput-object v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 12
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$GestureListener;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$GestureListener;-><init>(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->gestureDetector:Landroid/view/GestureDetector;

    .line 13
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 14
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 15
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 16
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 17
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->NONE:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 18
    iput v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 19
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 20
    new-instance v0, Landroid/widget/Scroller;

    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 21
    sget-object v0, Lcom/sumsub/sns/R$styleable;->SNSRotationZoomableImageView:[I

    const/4 v1, 0x0

    .line 22
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 23
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSRotationZoomableImageView_sns_zoomEnabled:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->zoomEnabled:Z

    .line 24
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 26
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->updateMatrix()V

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

    .line 3
    sget p3, Lcom/sumsub/sns/R$attr;->sns_RotationZoomableImageViewStyle:I

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation$lambda$3$lambda$2(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V

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

.method public static final synthetic access$animateScale(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FFF)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->animateScale(FFF)V

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
.end method

.method public static final synthetic access$computeViewPort(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->computeViewPort()V

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
.end method

.method public static final synthetic access$fling(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->fling(II)V

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
.end method

.method public static final synthetic access$getCurrentScale$p(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

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

.method public static final synthetic access$getFitScale(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)F
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

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

.method public static final synthetic access$getRotationAngle$p(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAngle:F

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

.method public static final synthetic access$getRotationAnimation$p(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)Landroidx/dynamicanimation/animation/SpringAnimation;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

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

.method public static final synthetic access$getScroller$p(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)Landroid/widget/Scroller;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

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

.method public static final synthetic access$getViewPort$p(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)Landroid/graphics/RectF;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

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

.method public static final synthetic access$setRotationAngle(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->setRotationAngle(F)V

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

.method private final animateScale(FFF)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 8
    .line 9
    :cond_0
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 10
    .line 11
    sub-float v3, p1, v2

    .line 12
    .line 13
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 17
    move-result p1

    .line 18
    .line 19
    sub-float v6, p2, p1

    .line 20
    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 25
    move-result p1

    .line 26
    .line 27
    sub-float v7, p3, p1

    .line 28
    .line 29
    new-instance v5, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 30
    .line 31
    .line 32
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 33
    const/4 p1, 0x2

    .line 34
    .line 35
    new-array p1, p1, [F

    .line 36
    .line 37
    .line 38
    fill-array-data p1, :array_0

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-wide/16 p2, 0xfa

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    new-instance p2, Landroid/view/animation/DecelerateInterpolator;

    .line 50
    .line 51
    const/high16 p3, 0x40000000    # 2.0f

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, p3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 58
    .line 59
    new-instance v1, Lcom/sumsub/sns/core/widget/e0;

    .line 60
    move-object v4, p0

    .line 61
    .line 62
    .line 63
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/core/widget/e0;-><init>(FFLcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Lkotlin/jvm/internal/Ref$FloatRef;FF)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 70
    .line 71
    iput-object p1, v4, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 72
    return-void

    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
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
.end method

.method private static final animateScale$lambda$7$lambda$6(FFLcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Lkotlin/jvm/internal/Ref$FloatRef;FFLandroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p6}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 4
    move-result-object p6

    .line 5
    .line 6
    check-cast p6, Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p6}, Ljava/lang/Float;->floatValue()F

    .line 10
    move-result p6

    .line 11
    mul-float/2addr p1, p6

    .line 12
    add-float/2addr p1, p0

    .line 13
    .line 14
    iget p0, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 15
    .line 16
    div-float p0, p1, p0

    .line 17
    .line 18
    iget-object v0, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 19
    .line 20
    iget-object v1, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 24
    move-result v1

    .line 25
    .line 26
    iget-object v2, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    .line 30
    move-result v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p0, p0, v1, v2}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 34
    .line 35
    iget p0, p3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 36
    .line 37
    sub-float p0, p6, p0

    .line 38
    .line 39
    iget-object v0, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 40
    mul-float/2addr p4, p0

    .line 41
    mul-float/2addr p0, p5

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p4, p0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 45
    .line 46
    iput p1, p2, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 47
    .line 48
    iput p6, p3, Lkotlin/jvm/internal/Ref$FloatRef;->element:F

    .line 49
    .line 50
    .line 51
    invoke-direct {p2}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->reduceClipping()V

    .line 52
    return-void
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
.end method

.method public static synthetic b(FFLcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Lkotlin/jvm/internal/Ref$FloatRef;FFLandroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p6}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->animateScale$lambda$7$lambda$6(FFLcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Lkotlin/jvm/internal/Ref$FloatRef;FFLandroid/animation/ValueAnimator;)V

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
.end method

.method private final canTranslateX(F)Z
    .locals 2

    .line 1
    .line 2
    const/high16 v0, 0x40800000    # 4.0f

    .line 3
    .line 4
    cmpg-float v0, p1, v0

    .line 5
    .line 6
    if-gtz v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 9
    .line 10
    const/16 v1, 0xb4

    .line 11
    int-to-float v1, v1

    .line 12
    rem-float/2addr v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    cmpg-float v0, v0, v1

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableScaledWidth(F)F

    .line 21
    move-result p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    .line 28
    cmpl-float p1, p1, v0

    .line 29
    .line 30
    if-lez p1, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableScaledHeight(F)F

    .line 35
    move-result p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 39
    move-result v0

    .line 40
    int-to-float v0, v0

    .line 41
    .line 42
    cmpl-float p1, p1, v0

    .line 43
    .line 44
    if-lez p1, :cond_1

    .line 45
    :goto_0
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return p1
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
.end method

.method public static synthetic canTranslateX$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateX(F)Z

    .line 10
    move-result p0

    .line 11
    return p0
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
.end method

.method private final canTranslateY(F)Z
    .locals 2

    .line 1
    .line 2
    const/high16 v0, 0x40800000    # 4.0f

    .line 3
    .line 4
    cmpg-float v0, p1, v0

    .line 5
    .line 6
    if-gtz v0, :cond_1

    .line 7
    .line 8
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 9
    .line 10
    const/16 v1, 0xb4

    .line 11
    int-to-float v1, v1

    .line 12
    rem-float/2addr v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    cmpg-float v0, v0, v1

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableScaledHeight(F)F

    .line 21
    move-result p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 25
    move-result v0

    .line 26
    int-to-float v0, v0

    .line 27
    .line 28
    cmpl-float p1, p1, v0

    .line 29
    .line 30
    if-lez p1, :cond_1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableScaledWidth(F)F

    .line 35
    move-result p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    move-result v0

    .line 40
    int-to-float v0, v0

    .line 41
    .line 42
    cmpl-float p1, p1, v0

    .line 43
    .line 44
    if-lez p1, :cond_1

    .line 45
    :goto_0
    const/4 p1, 0x1

    .line 46
    return p1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    return p1
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
.end method

.method public static synthetic canTranslateY$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateY(F)Z

    .line 10
    move-result p0

    .line 11
    return p0
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
.end method

.method private final computeViewPort()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 6
    .line 7
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableWidth()F

    .line 11
    move-result v1

    .line 12
    .line 13
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableHeight()F

    .line 17
    move-result v1

    .line 18
    .line 19
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 20
    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

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
.end method

.method private final finishScale()V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getMinScale()F

    .line 6
    move-result v1

    .line 7
    .line 8
    cmpg-float v0, v0, v1

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-gez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    move-result v1

    .line 25
    int-to-float v1, v1

    .line 26
    .line 27
    const/high16 v2, 0x40000000    # 2.0f

    .line 28
    div-float/2addr v1, v2

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    move-result v3

    .line 33
    int-to-float v3, v3

    .line 34
    div-float/2addr v3, v2

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0, v1, v3}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->animateScale(FFF)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_0
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 41
    .line 42
    const/high16 v2, 0x40800000    # 4.0f

    .line 43
    .line 44
    cmpl-float v0, v0, v2

    .line 45
    .line 46
    if-lez v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 52
    const/4 v0, 0x0

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterSaved:Z

    .line 55
    .line 56
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterX:F

    .line 57
    .line 58
    iget v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterY:F

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v2, v0, v1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->animateScale(FFF)V

    .line 62
    :cond_1
    return-void
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
.end method

.method private final fling(II)V
    .locals 11

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 9
    .line 10
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    iput v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 13
    .line 14
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 17
    .line 18
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 19
    float-to-int v3, v1

    .line 20
    float-to-int v4, v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    move-result v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    .line 30
    move-result v1

    .line 31
    float-to-int v1, v1

    .line 32
    .line 33
    sub-int v7, v0, v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 37
    move-result v0

    .line 38
    .line 39
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    .line 43
    move-result v1

    .line 44
    float-to-int v1, v1

    .line 45
    .line 46
    sub-int v9, v0, v1

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    move v5, p1

    .line 50
    move v6, p2

    .line 51
    .line 52
    .line 53
    invoke-virtual/range {v2 .. v10}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 54
    .line 55
    .line 56
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 57
    return-void
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

.method private final getDrawableHeight()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method private final getDrawableScaledHeight(F)F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableHeight()F

    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    return v0
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

.method private final getDrawableScaledWidth(F)F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getDrawableWidth()F

    .line 4
    move-result v0

    .line 5
    mul-float/2addr v0, p1

    .line 6
    return v0
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

.method private final getDrawableWidth()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 10
    move-result v0

    .line 11
    int-to-float v0, v0

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method private final getFitScale()F
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 18
    move-result v0

    .line 19
    int-to-float v0, v0

    .line 20
    .line 21
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 22
    .line 23
    const/16 v3, 0xb4

    .line 24
    int-to-float v3, v3

    .line 25
    rem-float/2addr v2, v3

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    cmpg-float v2, v2, v3

    .line 29
    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    move-result v2

    .line 35
    int-to-float v2, v2

    .line 36
    div-float/2addr v2, v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    move-result v1

    .line 41
    int-to-float v1, v1

    .line 42
    div-float/2addr v1, v0

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 46
    move-result v0

    .line 47
    return v0

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 51
    move-result v2

    .line 52
    int-to-float v2, v2

    .line 53
    div-float/2addr v2, v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 57
    move-result v0

    .line 58
    int-to-float v0, v0

    .line 59
    div-float/2addr v0, v1

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    .line 63
    move-result v0

    .line 64
    return v0
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

.method private final getMinScale()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

    .line 4
    move-result v0

    .line 5
    return v0
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

.method private static synthetic getRotationAnimation$annotations()V
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
.end method

.method private final reduceClipping()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->computeViewPort()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    .line 16
    cmpl-float v0, v0, v1

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-lez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 22
    .line 23
    iget v2, v0, Landroid/graphics/RectF;->left:F

    .line 24
    .line 25
    cmpl-float v2, v2, v1

    .line 26
    .line 27
    if-lez v2, :cond_0

    .line 28
    .line 29
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 33
    move-result v2

    .line 34
    int-to-float v2, v2

    .line 35
    .line 36
    cmpl-float v0, v0, v2

    .line 37
    .line 38
    if-lez v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 41
    .line 42
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 43
    .line 44
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 45
    neg-float v2, v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 49
    .line 50
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 51
    .line 52
    iget v0, v0, Landroid/graphics/RectF;->right:F

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 56
    move-result v2

    .line 57
    int-to-float v2, v2

    .line 58
    .line 59
    cmpg-float v0, v0, v2

    .line 60
    .line 61
    if-gez v0, :cond_1

    .line 62
    .line 63
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 64
    .line 65
    iget v0, v0, Landroid/graphics/RectF;->left:F

    .line 66
    .line 67
    cmpg-float v0, v0, v1

    .line 68
    .line 69
    if-gez v0, :cond_1

    .line 70
    .line 71
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 75
    move-result v2

    .line 76
    int-to-float v2, v2

    .line 77
    .line 78
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 79
    .line 80
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 81
    sub-float/2addr v2, v3

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 85
    .line 86
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 90
    move-result v0

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 94
    move-result v2

    .line 95
    int-to-float v2, v2

    .line 96
    .line 97
    cmpl-float v0, v0, v2

    .line 98
    .line 99
    if-lez v0, :cond_3

    .line 100
    .line 101
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 102
    .line 103
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 104
    .line 105
    cmpl-float v2, v2, v1

    .line 106
    .line 107
    if-lez v2, :cond_2

    .line 108
    .line 109
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 113
    move-result v2

    .line 114
    int-to-float v2, v2

    .line 115
    .line 116
    cmpl-float v0, v0, v2

    .line 117
    .line 118
    if-lez v0, :cond_2

    .line 119
    .line 120
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 121
    .line 122
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 123
    .line 124
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 125
    neg-float v2, v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 129
    .line 130
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 131
    .line 132
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 136
    move-result v2

    .line 137
    int-to-float v2, v2

    .line 138
    .line 139
    cmpg-float v0, v0, v2

    .line 140
    .line 141
    if-gez v0, :cond_3

    .line 142
    .line 143
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 144
    .line 145
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 146
    .line 147
    cmpg-float v0, v0, v1

    .line 148
    .line 149
    if-gez v0, :cond_3

    .line 150
    .line 151
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 155
    move-result v2

    .line 156
    int-to-float v2, v2

    .line 157
    .line 158
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 159
    .line 160
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 161
    sub-float/2addr v2, v3

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 165
    .line 166
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 170
    move-result v0

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 174
    move-result v2

    .line 175
    int-to-float v2, v2

    .line 176
    .line 177
    cmpg-float v0, v0, v2

    .line 178
    .line 179
    const/high16 v2, 0x40000000    # 2.0f

    .line 180
    .line 181
    if-gez v0, :cond_5

    .line 182
    .line 183
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 187
    move-result v0

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 191
    move-result v3

    .line 192
    int-to-float v3, v3

    .line 193
    div-float/2addr v3, v2

    .line 194
    sub-float/2addr v3, v0

    .line 195
    .line 196
    cmpg-float v0, v3, v1

    .line 197
    .line 198
    if-nez v0, :cond_4

    .line 199
    goto :goto_0

    .line 200
    .line 201
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0, v3, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 205
    .line 206
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 210
    move-result v0

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 214
    move-result v3

    .line 215
    int-to-float v3, v3

    .line 216
    .line 217
    cmpg-float v0, v0, v3

    .line 218
    .line 219
    if-gez v0, :cond_7

    .line 220
    .line 221
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 225
    move-result v0

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 229
    move-result v3

    .line 230
    int-to-float v3, v3

    .line 231
    div-float/2addr v3, v2

    .line 232
    sub-float/2addr v3, v0

    .line 233
    .line 234
    cmpg-float v0, v3, v1

    .line 235
    .line 236
    if-nez v0, :cond_6

    .line 237
    goto :goto_1

    .line 238
    .line 239
    :cond_6
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 243
    .line 244
    .line 245
    :cond_7
    :goto_1
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->updateMatrix()V

    .line 246
    return-void
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
.end method

.method public static synthetic rotate$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FZILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotate(FZ)V

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
.end method

.method private static final rotationAnimation$lambda$3$lambda$2(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;Landroidx/dynamicanimation/animation/DynamicAnimation;ZFF)V
    .locals 0

    .line 1
    .line 2
    iget p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 3
    .line 4
    const/16 p2, 0x168

    .line 5
    int-to-float p2, p2

    .line 6
    rem-float/2addr p1, p2

    .line 7
    const/4 p3, 0x0

    .line 8
    .line 9
    cmpg-float p3, p1, p3

    .line 10
    .line 11
    if-gez p3, :cond_0

    .line 12
    add-float/2addr p1, p2

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->setRotationAngle(F)V

    .line 16
    .line 17
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

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

.method private final setRotationAngle(F)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAngle:F

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 12
    move-result v1

    .line 13
    int-to-float v1, v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 17
    move-result v0

    .line 18
    int-to-float v0, v0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 21
    .line 22
    const/high16 v3, 0x40000000    # 2.0f

    .line 23
    .line 24
    div-float v4, v1, v3

    .line 25
    .line 26
    div-float v3, v0, v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, p1, v4, v3}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

    .line 33
    move-result p1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, p1, p1, v4, v3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 40
    move-result v3

    .line 41
    int-to-float v3, v3

    .line 42
    sub-float/2addr v1, v3

    .line 43
    neg-float v1, v1

    .line 44
    const/4 v3, 0x2

    .line 45
    int-to-float v3, v3

    .line 46
    div-float/2addr v1, v3

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 50
    move-result v4

    .line 51
    int-to-float v4, v4

    .line 52
    sub-float/2addr v0, v4

    .line 53
    neg-float v0, v0

    .line 54
    div-float/2addr v0, v3

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 58
    .line 59
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->updateMatrix()V

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
.end method

.method private final updateMatrix()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->computeViewPort()V

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


# virtual methods
.method public final clearImage()V
    .locals 1

    .line 1
    .line 2
    .line 3
    const v0, 0x106000d

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->cancel()V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 22
    return-void
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

.method public computeScroll()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->computeScroll()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    .line 17
    move-result v0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrY()I

    .line 23
    move-result v1

    .line 24
    int-to-float v0, v0

    .line 25
    .line 26
    iget v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 27
    .line 28
    sub-float v2, v0, v2

    .line 29
    int-to-float v1, v1

    .line 30
    .line 31
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 32
    .line 33
    sub-float v3, v1, v3

    .line 34
    .line 35
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x1

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v5, v6, v7}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateX$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z

    .line 42
    move-result v8

    .line 43
    .line 44
    if-eqz v8, :cond_0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move v2, v5

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {p0, v5, v6, v7}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateY$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z

    .line 50
    move-result v6

    .line 51
    .line 52
    if-eqz v6, :cond_1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v3, v5

    .line 55
    .line 56
    .line 57
    :goto_1
    invoke-virtual {v4, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 58
    .line 59
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 60
    .line 61
    iput v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 62
    .line 63
    .line 64
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->reduceClipping()V

    .line 65
    .line 66
    .line 67
    invoke-static {p0}, Landroidx/core/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 68
    :cond_2
    return-void
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

.method public final getRotation()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 3
    float-to-int v0, v0

    .line 4
    return v0
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

.method public final getZoomEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->zoomEnabled:Z

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
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scaleAnimation:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/dynamicanimation/animation/SpringAnimation;->cancel()V

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

.method public onMeasure(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/android/material/imageview/ShapeableImageView;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

    .line 7
    move-result p1

    .line 8
    .line 9
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 10
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->zoomEnabled:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->getFitScale()F

    .line 23
    move-result v4

    .line 24
    .line 25
    cmpg-float v3, v3, v4

    .line 26
    .line 27
    if-nez v3, :cond_1

    .line 28
    move v3, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_0
    xor-int/2addr v3, v2

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->gestureDetector:Landroid/view/GestureDetector;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 43
    move-result v0

    .line 44
    const/4 v3, 0x2

    .line 45
    .line 46
    const/high16 v4, 0x40000000    # 2.0f

    .line 47
    .line 48
    if-eqz v0, :cond_11

    .line 49
    .line 50
    if-eq v0, v2, :cond_10

    .line 51
    .line 52
    if-eq v0, v3, :cond_4

    .line 53
    const/4 v5, 0x3

    .line 54
    .line 55
    if-eq v0, v5, :cond_3

    .line 56
    const/4 v5, 0x5

    .line 57
    .line 58
    if-eq v0, v5, :cond_11

    .line 59
    const/4 v1, 0x6

    .line 60
    .line 61
    if-eq v0, v1, :cond_3

    .line 62
    .line 63
    goto/16 :goto_6

    .line 64
    .line 65
    :cond_3
    sget-object p1, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->NONE:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 66
    .line 67
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 68
    return v2

    .line 69
    .line 70
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 71
    .line 72
    sget-object v3, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->DRAG:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 73
    const/4 v5, 0x0

    .line 74
    .line 75
    if-ne v0, v3, :cond_7

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 79
    move-result v0

    .line 80
    .line 81
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 82
    sub-float/2addr v0, v3

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 86
    move-result v3

    .line 87
    .line 88
    iget v4, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 89
    sub-float/2addr v3, v4

    .line 90
    .line 91
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 92
    const/4 v6, 0x0

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v5, v2, v6}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateX$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z

    .line 96
    move-result v7

    .line 97
    .line 98
    if-eqz v7, :cond_5

    .line 99
    goto :goto_1

    .line 100
    :cond_5
    move v0, v5

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-static {p0, v5, v2, v6}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateY$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FILjava/lang/Object;)Z

    .line 104
    move-result v6

    .line 105
    .line 106
    if-eqz v6, :cond_6

    .line 107
    move v5, v3

    .line 108
    .line 109
    .line 110
    :cond_6
    invoke-virtual {v4, v0, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 114
    move-result v0

    .line 115
    .line 116
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 120
    move-result p1

    .line 121
    .line 122
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 123
    .line 124
    .line 125
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->reduceClipping()V

    .line 126
    return v2

    .line 127
    .line 128
    :cond_7
    sget-object v3, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->ZOOM:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 129
    .line 130
    if-ne v0, v3, :cond_f

    .line 131
    .line 132
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->pointerId1:I

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 136
    move-result v0

    .line 137
    .line 138
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->pointerId2:I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 142
    move-result v3

    .line 143
    .line 144
    if-ltz v0, :cond_e

    .line 145
    .line 146
    if-gez v3, :cond_8

    .line 147
    .line 148
    goto/16 :goto_5

    .line 149
    .line 150
    .line 151
    :cond_8
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 152
    move-result v1

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 156
    move-result v6

    .line 157
    sub-float/2addr v1, v6

    .line 158
    float-to-double v6, v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 162
    move-result v1

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 166
    move-result v8

    .line 167
    sub-float/2addr v1, v8

    .line 168
    float-to-double v8, v1

    .line 169
    .line 170
    .line 171
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    .line 172
    move-result-wide v6

    .line 173
    double-to-float v1, v6

    .line 174
    .line 175
    iget v6, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartDistance:F

    .line 176
    .line 177
    div-float v6, v1, v6

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 181
    move-result v7

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 185
    move-result v8

    .line 186
    add-float/2addr v8, v7

    .line 187
    div-float/2addr v8, v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 191
    move-result v0

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 195
    move-result p1

    .line 196
    add-float/2addr p1, v0

    .line 197
    div-float/2addr p1, v4

    .line 198
    .line 199
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 200
    .line 201
    sub-float v0, v8, v0

    .line 202
    .line 203
    iget v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 204
    .line 205
    sub-float v3, p1, v3

    .line 206
    .line 207
    iget v7, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 208
    mul-float/2addr v7, v6

    .line 209
    .line 210
    .line 211
    invoke-direct {p0, v7}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateX(F)Z

    .line 212
    move-result v7

    .line 213
    .line 214
    iget v9, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 215
    mul-float/2addr v9, v6

    .line 216
    .line 217
    .line 218
    invoke-direct {p0, v9}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->canTranslateY(F)Z

    .line 219
    move-result v9

    .line 220
    .line 221
    iget v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 222
    mul-float/2addr v10, v6

    .line 223
    .line 224
    const/high16 v11, 0x40800000    # 4.0f

    .line 225
    .line 226
    cmpl-float v10, v10, v11

    .line 227
    .line 228
    if-lez v10, :cond_9

    .line 229
    .line 230
    iget-boolean v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterSaved:Z

    .line 231
    .line 232
    if-nez v10, :cond_9

    .line 233
    .line 234
    iget-object v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerX()F

    .line 238
    move-result v10

    .line 239
    .line 240
    iput v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterX:F

    .line 241
    .line 242
    iget-object v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->viewPort:Landroid/graphics/RectF;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerY()F

    .line 246
    move-result v10

    .line 247
    .line 248
    iput v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterY:F

    .line 249
    .line 250
    iput-boolean v2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->lastViewPortCenterSaved:Z

    .line 251
    .line 252
    :cond_9
    iget-object v10, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 253
    .line 254
    if-eqz v7, :cond_a

    .line 255
    .line 256
    iget v11, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 257
    goto :goto_2

    .line 258
    .line 259
    .line 260
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 261
    move-result v11

    .line 262
    int-to-float v11, v11

    .line 263
    div-float/2addr v11, v4

    .line 264
    .line 265
    :goto_2
    if-eqz v9, :cond_b

    .line 266
    .line 267
    iget v4, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 268
    goto :goto_3

    .line 269
    .line 270
    .line 271
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 272
    move-result v12

    .line 273
    int-to-float v12, v12

    .line 274
    .line 275
    div-float v4, v12, v4

    .line 276
    .line 277
    .line 278
    :goto_3
    invoke-virtual {v10, v6, v6, v11, v4}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 279
    .line 280
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->mtrx:Landroid/graphics/Matrix;

    .line 281
    .line 282
    if-eqz v7, :cond_c

    .line 283
    goto :goto_4

    .line 284
    :cond_c
    move v0, v5

    .line 285
    .line 286
    :goto_4
    if-eqz v9, :cond_d

    .line 287
    move v5, v3

    .line 288
    .line 289
    .line 290
    :cond_d
    invoke-virtual {v4, v0, v5}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 291
    .line 292
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 293
    mul-float/2addr v0, v6

    .line 294
    .line 295
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->currentScale:F

    .line 296
    .line 297
    iput v1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartDistance:F

    .line 298
    .line 299
    iput v8, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 300
    .line 301
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 302
    .line 303
    .line 304
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->reduceClipping()V

    .line 305
    return v2

    .line 306
    .line 307
    :cond_e
    :goto_5
    sget-object p1, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->NONE:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 308
    .line 309
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 310
    return v1

    .line 311
    .line 312
    .line 313
    :cond_f
    :goto_6
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 314
    move-result p1

    .line 315
    return p1

    .line 316
    .line 317
    :cond_10
    sget-object p1, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->NONE:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 318
    .line 319
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 320
    .line 321
    .line 322
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->finishScale()V

    .line 323
    return v2

    .line 324
    .line 325
    :cond_11
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v2}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 332
    move-result v0

    .line 333
    .line 334
    if-ne v0, v3, :cond_12

    .line 335
    .line 336
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 337
    .line 338
    sget-object v3, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->ZOOM:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 339
    .line 340
    if-eq v0, v3, :cond_12

    .line 341
    .line 342
    iput-object v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 343
    .line 344
    .line 345
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 346
    move-result v0

    .line 347
    .line 348
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->pointerId1:I

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 352
    move-result v0

    .line 353
    .line 354
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->pointerId2:I

    .line 355
    .line 356
    .line 357
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 358
    move-result v0

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 362
    move-result v3

    .line 363
    sub-float/2addr v0, v3

    .line 364
    float-to-double v5, v0

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 368
    move-result v0

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 372
    move-result v3

    .line 373
    sub-float/2addr v0, v3

    .line 374
    float-to-double v7, v0

    .line 375
    .line 376
    .line 377
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    .line 378
    move-result-wide v5

    .line 379
    double-to-float v0, v5

    .line 380
    .line 381
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartDistance:F

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 385
    move-result v0

    .line 386
    .line 387
    .line 388
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 389
    move-result v3

    .line 390
    add-float/2addr v3, v0

    .line 391
    div-float/2addr v3, v4

    .line 392
    .line 393
    iput v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 394
    .line 395
    .line 396
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 397
    move-result v0

    .line 398
    .line 399
    .line 400
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 401
    move-result p1

    .line 402
    add-float/2addr p1, v0

    .line 403
    div-float/2addr p1, v4

    .line 404
    .line 405
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 406
    goto :goto_7

    .line 407
    .line 408
    .line 409
    :cond_12
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 410
    move-result v0

    .line 411
    .line 412
    if-ne v0, v2, :cond_13

    .line 413
    .line 414
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 415
    .line 416
    sget-object v3, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;->DRAG:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 417
    .line 418
    if-eq v0, v3, :cond_13

    .line 419
    .line 420
    iput-object v3, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchMode:Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$TouchMode;

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 424
    move-result v0

    .line 425
    .line 426
    iput v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartX:F

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 430
    move-result p1

    .line 431
    .line 432
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->touchStartY:F

    .line 433
    :cond_13
    :goto_7
    return v2
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
.end method

.method public final rotate(FZ)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->scroller:Landroid/widget/Scroller;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/Scroller;->forceFinished(Z)V

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget p2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 14
    add-float/2addr p2, p1

    .line 15
    .line 16
    iput p2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 17
    .line 18
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 19
    .line 20
    iget p2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 21
    .line 22
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 23
    mul-float/2addr p2, v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

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
.end method

.method public final rotateCCW()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v2, v3, v0, v1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotate$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FZILjava/lang/Object;)V

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

.method public final rotateCW()V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    const/high16 v2, 0x42b40000    # 90.0f

    .line 5
    const/4 v3, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v2, v3, v0, v1}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotate$default(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;FZILjava/lang/Object;)V

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

.method public final setImageBitmapWithRotation(Landroid/graphics/Bitmap;I)V
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 4
    int-to-float p1, p2

    .line 5
    .line 6
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 7
    .line 8
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 9
    .line 10
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 11
    mul-float/2addr p1, v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->animateToFinalPosition(F)V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->rotationAnimation:Landroidx/dynamicanimation/animation/SpringAnimation;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/dynamicanimation/animation/SpringAnimation;->skipToEnd()V

    .line 20
    return-void
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

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    const/4 p1, 0x0

    .line 5
    .line 6
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->targetAngle:F

    .line 7
    .line 8
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$setImageDrawable$$inlined$doOnNextLayout$1;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView$setImageDrawable$$inlined$doOnNextLayout$1;-><init>(Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 15
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
    .line 25
.end method

.method public final setZoomEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/SNSRotationZoomableImageView;->zoomEnabled:Z

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
