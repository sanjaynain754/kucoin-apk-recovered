.class public final Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;,
        Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0000\u0018\u00002\u00020\u0001:\u0001CB1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u0010)\u001a\u00020*H\u0014J\u000e\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001bJ\u0010\u0010-\u001a\u00020*2\u0008\u0010.\u001a\u0004\u0018\u00010/J\u0010\u00100\u001a\u00020*2\u0006\u00101\u001a\u000202H\u0014J0\u00103\u001a\u00020*2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020\u0007H\u0014J\u0008\u0010:\u001a\u00020*H\u0014J\u0008\u0010;\u001a\u00020*H\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u0007H\u0002J\u0008\u0010>\u001a\u00020*H\u0002J\u0008\u0010?\u001a\u00020\u0017H\u0002R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010#2\u0008\u0010\u0012\u001a\u0004\u0018\u00010#@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R\u0018\u0010@\u001a\u00020\u0007*\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008A\u0010B\u00a8\u0006D"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "cornersPaint",
        "Landroid/graphics/Paint;",
        "cornersPath",
        "Landroid/graphics/Path;",
        "cornerRadius",
        "",
        "cornerSize",
        "value",
        "cornersWidth",
        "getCornersWidth",
        "()F",
        "stateFrameColors",
        "Landroid/content/res/ColorStateList;",
        "colorAnimator",
        "Landroid/animation/ValueAnimator;",
        "boundPreview",
        "Landroidx/camera/view/PreviewView;",
        "docBoundsView",
        "Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;",
        "halfCornersWidth",
        "getHalfCornersWidth",
        "()I",
        "previewLayoutListener",
        "Landroid/view/View$OnLayoutChangeListener;",
        "Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;",
        "state",
        "getState",
        "()Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;",
        "setState",
        "(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)V",
        "onAttachedToWindow",
        "",
        "bind",
        "previewView",
        "setDocRect",
        "rect",
        "Landroid/graphics/RectF;",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "onLayout",
        "changed",
        "",
        "left",
        "top",
        "right",
        "bottom",
        "onDetachedFromWindow",
        "updateConstraintsToMatchPreview",
        "animateColorTo",
        "targetColor",
        "cancelColorAnimation",
        "loadStateFrameColors",
        "color",
        "getColor",
        "(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)I",
        "State",
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
        "SMAP\nSNSCornersOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSCornersOverlayView.kt\ncom/sumsub/sns/core/widget/camera/SNSCornersOverlayView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n233#2,3:281\n1#3:284\n*S KotlinDebug\n*F\n+ 1 SNSCornersOverlayView.kt\ncom/sumsub/sns/core/widget/camera/SNSCornersOverlayView\n*L\n82#1:281,3\n*E\n"
    }
.end annotation


# instance fields
.field private boundPreview:Landroidx/camera/view/PreviewView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private colorAnimator:Landroid/animation/ValueAnimator;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private cornerRadius:F

.field private cornerSize:F

.field private final cornersPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final cornersPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private cornersWidth:F

.field private docBoundsView:Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final previewLayoutListener:Landroid/view/View$OnLayoutChangeListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private state:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stateFrameColors:Landroid/content/res/ColorStateList;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2
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
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPath:Landroid/graphics/Path;

    const v0, -0xff01

    .line 9
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 10
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/a;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/camera/a;-><init>(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;)V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->previewLayoutListener:Landroid/view/View$OnLayoutChangeListener;

    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 12
    sget-object v1, Lcom/sumsub/sns/R$styleable;->SNSCornersOverlayView:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 13
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSCornersOverlayView_sns_cameraCornersColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 14
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 15
    :cond_0
    sget p1, Lcom/sumsub/sns/R$styleable;->SNSCornersOverlayView_sns_cameraCornersRadius:I

    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget p4, Lcom/sumsub/sns/R$dimen;->sns_state_frame_radius:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 17
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    .line 18
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 19
    sget p1, Lcom/sumsub/sns/R$styleable;->SNSCornersOverlayView_sns_cameraCornersSize:I

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget p4, Lcom/sumsub/sns/R$dimen;->sns_frame_corners_size:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 21
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    .line 22
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 23
    sget p1, Lcom/sumsub/sns/R$styleable;->SNSCornersOverlayView_sns_cameraCornersWidth:I

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget p4, Lcom/sumsub/sns/R$dimen;->sns_frame_corners_width:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 25
    invoke-virtual {p2, p1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    int-to-float p1, p1

    .line 26
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

    .line 27
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->loadStateFrameColors()Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 30
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 32
    :cond_1
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_CORNER_SIZE:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 33
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 34
    :cond_2
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_BORDER_WIDTH:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {p1}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 35
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

    .line 36
    :cond_3
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 37
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 38
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 39
    iget p2, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 40
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    return-void
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
    sget p3, Lcom/sumsub/sns/R$attr;->snsCornersOverlayViewStyle:I

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 5
    sget p4, Lcom/sumsub/sns/R$style;->Widget_SNSCornersOverlayView:I

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static synthetic a(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->animateColorTo$lambda$10$lambda$9(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/animation/ValueAnimator;)V

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

.method private final animateColorTo(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cancelColorAnimation()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v1, Lcom/google/android/material/animation/ArgbEvaluatorCompat;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1}, Lcom/google/android/material/animation/ArgbEvaluatorCompat;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-static {v1, p1}, Landroid/animation/ValueAnimator;->ofObject(Landroid/animation/TypeEvaluator;[Ljava/lang/Object;)Landroid/animation/ValueAnimator;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    const/high16 v1, 0x10e0000

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    .line 43
    move-result v0

    .line 44
    int-to-long v0, v0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 48
    .line 49
    new-instance v0, Lcom/sumsub/sns/core/widget/camera/b;

    .line 50
    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/camera/b;-><init>(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 59
    .line 60
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->colorAnimator:Landroid/animation/ValueAnimator;

    .line 61
    return-void
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

.method private static final animateColorTo$lambda$10$lambda$9(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    move-result p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public static synthetic b(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static/range {p0 .. p9}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->previewLayoutListener$lambda$0(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/view/View;IIIIIIII)V

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
.end method

.method private final cancelColorAnimation()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->colorAnimator:Landroid/animation/ValueAnimator;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->colorAnimator:Landroid/animation/ValueAnimator;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private final getColor(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)I
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    move-result p1

    .line 7
    .line 8
    aget p1, v0, p1

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-eq p1, v1, :cond_3

    .line 13
    const/4 v2, 0x2

    .line 14
    .line 15
    if-eq p1, v2, :cond_2

    .line 16
    const/4 v2, 0x3

    .line 17
    .line 18
    if-eq p1, v2, :cond_1

    .line 19
    const/4 v2, 0x4

    .line 20
    .line 21
    if-ne p1, v2, :cond_0

    .line 22
    .line 23
    new-array p1, v1, [I

    .line 24
    .line 25
    sget v1, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 26
    .line 27
    aput v1, p1, v0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 31
    .line 32
    .line 33
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 34
    throw p1

    .line 35
    .line 36
    :cond_1
    new-array p1, v1, [I

    .line 37
    .line 38
    sget v1, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 39
    .line 40
    aput v1, p1, v0

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_2
    new-array p1, v1, [I

    .line 44
    .line 45
    sget v1, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 46
    .line 47
    aput v1, p1, v0

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_3
    new-array p1, v1, [I

    .line 51
    .line 52
    sget v1, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 53
    .line 54
    aput v1, p1, v0

    .line 55
    .line 56
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 57
    .line 58
    .line 59
    const v1, -0xff01

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    move-result p1

    .line 64
    .line 65
    const/16 v0, 0xff

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 69
    move-result p1

    .line 70
    return p1
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

.method private final getHalfCornersWidth()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

    .line 3
    const/4 v1, 0x2

    .line 4
    int-to-float v1, v1

    .line 5
    div-float/2addr v0, v1

    .line 6
    float-to-int v0, v0

    .line 7
    return v0
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

.method private final loadStateFrameColors()Landroid/content/res/ColorStateList;
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WARNING:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    const v1, -0xff01

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 19
    .line 20
    sget v2, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 21
    .line 22
    .line 23
    filled-new-array {v2}, [I

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 28
    move-result v0

    .line 29
    .line 30
    :goto_0
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_SUCCESS:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    move-result v2

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 44
    .line 45
    sget v3, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 46
    .line 47
    .line 48
    filled-new-array {v3}, [I

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 53
    move-result v2

    .line 54
    .line 55
    :goto_1
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_CRITICAL:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v3}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 59
    move-result-object v3

    .line 60
    .line 61
    if-eqz v3, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 65
    move-result v1

    .line 66
    goto :goto_2

    .line 67
    .line 68
    :cond_2
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    sget v4, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 71
    .line 72
    .line 73
    filled-new-array {v4}, [I

    .line 74
    move-result-object v4

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v4, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 78
    move-result v1

    .line 79
    .line 80
    :goto_2
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 81
    .line 82
    sget v4, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 83
    .line 84
    .line 85
    filled-new-array {v4}, [I

    .line 86
    move-result-object v4

    .line 87
    .line 88
    sget v5, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 89
    .line 90
    .line 91
    filled-new-array {v5}, [I

    .line 92
    move-result-object v5

    .line 93
    .line 94
    sget v6, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 95
    .line 96
    .line 97
    filled-new-array {v6}, [I

    .line 98
    move-result-object v6

    .line 99
    .line 100
    sget v7, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 101
    .line 102
    .line 103
    filled-new-array {v7}, [I

    .line 104
    move-result-object v7

    .line 105
    .line 106
    .line 107
    filled-new-array {v4, v5, v6, v7}, [[I

    .line 108
    move-result-object v4

    .line 109
    const/4 v5, -0x1

    .line 110
    .line 111
    .line 112
    filled-new-array {v0, v2, v1, v5}, [I

    .line 113
    move-result-object v0

    .line 114
    .line 115
    .line 116
    invoke-direct {v3, v4, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 117
    return-object v3
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

.method private static final previewLayoutListener$lambda$0(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    .line 2
    if-ne p2, p6, :cond_1

    .line 3
    .line 4
    if-ne p3, p7, :cond_1

    .line 5
    .line 6
    if-ne p4, p8, :cond_1

    .line 7
    .line 8
    if-eq p5, p9, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    .line 12
    .line 13
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->updateConstraintsToMatchPreview()V

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
.end method

.method private final updateConstraintsToMatchPreview()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->boundPreview:Landroidx/camera/view/PreviewView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_1

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->getHalfCornersWidth()I

    .line 9
    move-result v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    instance-of v3, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v2, 0x0

    .line 22
    .line 23
    :goto_0
    if-nez v2, :cond_2

    .line 24
    goto :goto_1

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 28
    move-result v3

    .line 29
    sub-int/2addr v3, v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 33
    move-result v4

    .line 34
    sub-int/2addr v4, v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 38
    move-result v5

    .line 39
    .line 40
    mul-int/lit8 v1, v1, 0x2

    .line 41
    add-int/2addr v5, v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 45
    move-result v0

    .line 46
    add-int/2addr v0, v1

    .line 47
    .line 48
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 49
    .line 50
    if-ne v1, v3, :cond_3

    .line 51
    .line 52
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 53
    .line 54
    if-ne v1, v4, :cond_3

    .line 55
    .line 56
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 57
    .line 58
    if-ne v1, v5, :cond_3

    .line 59
    .line 60
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 61
    .line 62
    if-ne v1, v0, :cond_3

    .line 63
    :goto_1
    return-void

    .line 64
    :cond_3
    const/4 v1, 0x0

    .line 65
    .line 66
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->leftToLeft:I

    .line 67
    .line 68
    iput v1, v2, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 69
    .line 70
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 71
    .line 72
    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 73
    .line 74
    iput v5, v2, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 75
    .line 76
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 80
    return-void
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


# virtual methods
.method public final bind(Landroidx/camera/view/PreviewView;)V
    .locals 2
    .param p1    # Landroidx/camera/view/PreviewView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->boundPreview:Landroidx/camera/view/PreviewView;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->previewLayoutListener:Landroid/view/View$OnLayoutChangeListener;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 10
    .line 11
    :cond_0
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->boundPreview:Landroidx/camera/view/PreviewView;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->previewLayoutListener:Landroid/view/View$OnLayoutChangeListener;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 23
    move-result p1

    .line 24
    .line 25
    if-lez p1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->updateConstraintsToMatchPreview()V

    .line 29
    :cond_1
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
.end method

.method public final getCornersWidth()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

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

.method public final getState()Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->state:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

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

.method public onAttachedToWindow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    instance-of v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "SNSCornersOverlayView must be a direct child of ConstraintLayout"

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    throw v0
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

.method public onDetachedFromWindow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cancelColorAnimation()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->boundPreview:Landroidx/camera/view/PreviewView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->previewLayoutListener:Landroid/view/View$OnLayoutChangeListener;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 8
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
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersWidth:F

    .line 28
    const/4 v1, 0x2

    .line 29
    int-to-float v1, v1

    .line 30
    div-float/2addr v0, v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 34
    move-result v1

    .line 35
    int-to-float v1, v1

    .line 36
    sub-float/2addr v1, v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    move-result v2

    .line 41
    int-to-float v2, v2

    .line 42
    sub-float/2addr v2, v0

    .line 43
    .line 44
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPath:Landroid/graphics/Path;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    .line 48
    .line 49
    iget v4, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 50
    .line 51
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 52
    add-float/2addr v5, v0

    .line 53
    add-float/2addr v5, v4

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v0, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 57
    .line 58
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 59
    neg-float v5, v5

    .line 60
    const/4 v6, 0x0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v6, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 64
    .line 65
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 66
    neg-float v7, v5

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, v6, v7, v5, v7}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 70
    .line 71
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, v5, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 75
    .line 76
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 77
    .line 78
    sub-float v5, v1, v5

    .line 79
    sub-float/2addr v5, v4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v5, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 83
    .line 84
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v5, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 88
    .line 89
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v5, v6, v5, v5}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 93
    .line 94
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3, v6, v5}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 98
    .line 99
    iget v5, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 100
    .line 101
    sub-float v5, v2, v5

    .line 102
    sub-float/2addr v5, v4

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3, v1, v5}, Landroid/graphics/Path;->moveTo(FF)V

    .line 106
    .line 107
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v6, v1}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 111
    .line 112
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 113
    neg-float v5, v1

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3, v6, v1, v5, v1}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 117
    .line 118
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 119
    neg-float v1, v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v1, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 123
    .line 124
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 125
    add-float/2addr v0, v1

    .line 126
    add-float/2addr v0, v4

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3, v0, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 130
    .line 131
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 132
    neg-float v0, v0

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v0, v6}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 136
    .line 137
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerRadius:F

    .line 138
    neg-float v0, v0

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v0, v6, v0, v0}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    .line 142
    .line 143
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornerSize:F

    .line 144
    neg-float v0, v0

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v6, v0}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 148
    .line 149
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPath:Landroid/graphics/Path;

    .line 150
    .line 151
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 155
    :cond_1
    :goto_0
    return-void
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

.method public onLayout(ZIIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 4
    move-object p1, p0

    .line 5
    .line 6
    iget-object p2, p1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->boundPreview:Landroidx/camera/view/PreviewView;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object p3, p1, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->docBoundsView:Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;

    .line 12
    .line 13
    if-nez p3, :cond_1

    .line 14
    :goto_0
    return-void

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->getHalfCornersWidth()I

    .line 18
    move-result p4

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 22
    move-result p5

    .line 23
    add-int/2addr p5, p4

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    .line 27
    move-result p2

    .line 28
    add-int/2addr p2, p4

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p4, p4, p5, p2}, Landroid/view/View;->layout(IIII)V

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

.method public final setDocRect(Landroid/graphics/RectF;)V
    .locals 7
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->docBoundsView:Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    move-result-object v2

    .line 13
    const/4 v5, 0x6

    .line 14
    const/4 v6, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    const/4 v2, -0x1

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 29
    .line 30
    iput-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->docBoundsView:Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;

    .line 31
    .line 32
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->docBoundsView:Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSDocBoundsCheckResultView;->setDocRectF(Landroid/graphics/RectF;)V

    .line 38
    :cond_1
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
.end method

.method public final setState(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)V
    .locals 2
    .param p1    # Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->state:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->state:Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->getColor(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)I

    .line 18
    move-result p1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 24
    move-result v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->animateColorTo(I)V

    .line 31
    return-void

    .line 32
    .line 33
    :cond_1
    if-nez p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->cornersPaint:Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 39
    move-result p1

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 43
    move-result p1

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->animateColorTo(I)V

    .line 47
    return-void

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->getColor(Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView$State;)I

    .line 51
    move-result p1

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSCornersOverlayView;->animateColorTo(I)V

    .line 55
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
.end method
