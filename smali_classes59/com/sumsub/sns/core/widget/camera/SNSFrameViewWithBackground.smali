.class public final Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;
.super Landroid/view/View;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;,
        Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001:\u0001DB1\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0008\u00108\u001a\u000209H\u0002J(\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u00020\u00072\u0006\u0010>\u001a\u00020\u0007H\u0014J\u0010\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\u000eH\u0014J\u0010\u0010A\u001a\u0002092\u0006\u0010@\u001a\u00020\u000eH\u0002J\u0008\u0010B\u001a\u0004\u0018\u00010\u0018J\u0010\u0010C\u001a\u0002092\u0006\u0010\u0019\u001a\u00020\u0018H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0018@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001dR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u001e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\u000e\u0010$\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020\'2\u0006\u0010\u0011\u001a\u00020\'@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u001e\u0010/\u001a\u00020.2\u0006\u0010\u0011\u001a\u00020.@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u00080\u00101R$\u00102\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00083\u0010-\"\u0004\u00084\u00105R\u001e\u00106\u001a\u00020\'2\u0006\u0010\u0011\u001a\u00020\'@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u00087\u0010*\u00a8\u0006E"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;",
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
        "canvasBitmap",
        "Landroid/graphics/Bitmap;",
        "drawCanvas",
        "Landroid/graphics/Canvas;",
        "canvasPaint",
        "Landroid/graphics/Paint;",
        "value",
        "Landroid/util/SizeF;",
        "frameSize",
        "getFrameSize",
        "()Landroid/util/SizeF;",
        "setFrameSize",
        "(Landroid/util/SizeF;)V",
        "Landroid/graphics/RectF;",
        "frameRect",
        "getFrameRect",
        "()Landroid/graphics/RectF;",
        "setFrameRect",
        "(Landroid/graphics/RectF;)V",
        "Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;",
        "state",
        "getState",
        "()Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;",
        "setState",
        "(Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;)V",
        "rectPaint",
        "strokedRectPaint",
        "borderRect",
        "",
        "stateFrameWidth",
        "setStateFrameWidth",
        "(F)V",
        "stateFrameColor",
        "getStateFrameColor",
        "()I",
        "Landroid/content/res/ColorStateList;",
        "stateFrameColors",
        "setStateFrameColors",
        "(Landroid/content/res/ColorStateList;)V",
        "frameBackgroundColor",
        "getFrameBackgroundColor",
        "setFrameBackgroundColor",
        "(I)V",
        "stateFrameRadius",
        "setStateFrameRadius",
        "applyCustomThemeColors",
        "",
        "onSizeChanged",
        "w",
        "h",
        "oldw",
        "oldh",
        "onDraw",
        "canvas",
        "drawWithCanvas",
        "updateFrameRect",
        "updateBorderRect",
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
        "SMAP\nSNSFrameViewWithBackground.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSFrameViewWithBackground.kt\ncom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,243:1\n233#2,3:244\n1#3:247\n*S KotlinDebug\n*F\n+ 1 SNSFrameViewWithBackground.kt\ncom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground\n*L\n105#1:244,3\n*E\n"
    }
.end annotation


# instance fields
.field private borderRect:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private canvasBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final canvasPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private drawCanvas:Landroid/graphics/Canvas;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private frameBackgroundColor:I

.field private frameRect:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private frameSize:Landroid/util/SizeF;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final rectPaint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private state:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stateFrameColors:Landroid/content/res/ColorStateList;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private stateFrameRadius:F

.field private stateFrameWidth:F

.field private final strokedRectPaint:Landroid/graphics/Paint;
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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 5
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

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    new-instance v2, Landroid/graphics/Paint;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasPaint:Landroid/graphics/Paint;

    .line 9
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->rectPaint:Landroid/graphics/Paint;

    .line 10
    new-instance v3, Landroid/graphics/Paint;

    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    iput-object v3, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->strokedRectPaint:Landroid/graphics/Paint;

    .line 11
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    iput-object v4, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->borderRect:Landroid/graphics/RectF;

    const v4, -0xff01

    .line 12
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    iput-object v4, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 13
    sget-object v4, Lcom/sumsub/sns/R$styleable;->SNSFrameViewWithBackground:[I

    .line 14
    invoke-virtual {p1, p2, v4, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 15
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSFrameViewWithBackground_sns_stateFrameColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_0

    .line 16
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-direct {p0, p3}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameColors(Landroid/content/res/ColorStateList;)V

    .line 17
    :cond_0
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSFrameViewWithBackground_sns_stateFrameRadius:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_1

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget v4, Lcom/sumsub/sns/R$dimen;->sns_state_frame_radius:I

    invoke-virtual {p4, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    .line 19
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    .line 20
    invoke-direct {p0, p3}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameRadius(F)V

    .line 21
    :cond_1
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSFrameViewWithBackground_sns_stateFrameWidth:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_2

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget v4, Lcom/sumsub/sns/R$dimen;->sns_frame_stroke_width:I

    invoke-virtual {p4, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p4

    .line 23
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p3

    int-to-float p3, p3

    .line 24
    invoke-direct {p0, p3}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameWidth(F)V

    .line 25
    :cond_2
    sget p3, Lcom/sumsub/sns/R$styleable;->SNSFrameViewWithBackground_sns_frameBackgroundColor:I

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p4

    if-eqz p4, :cond_3

    .line 26
    sget p4, Lcom/sumsub/sns/R$color;->sns_cameraBackgroundOverlay:I

    invoke-static {p1, p4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p4

    .line 27
    invoke-virtual {p2, p3, p4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p3

    invoke-direct {p0, p3}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setFrameBackgroundColor(I)V

    .line 28
    :cond_3
    sget-object p3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 30
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->applyCustomThemeColors()V

    .line 31
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_BORDER_WIDTH:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 32
    invoke-direct {p0, p2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameWidth(F)V

    .line 33
    :cond_4
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSMetricElement;->DOCUMENT_FRAME_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {p2}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    .line 34
    invoke-direct {p0, p2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameRadius(F)V

    .line 35
    :cond_5
    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CAMERA_BACKGROUND_OVERLAY:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p0, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    .line 36
    invoke-direct {p0, p2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setFrameBackgroundColor(I)V

    .line 37
    :cond_6
    new-instance p2, Landroid/graphics/PorterDuffXfermode;

    sget-object p3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {p2, p3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, p2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 38
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setDither(Z)V

    .line 39
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 40
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->getStateFrameColor()I

    move-result p2

    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 41
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 42
    new-instance p2, Landroid/graphics/DashPathEffect;

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget p4, Lcom/sumsub/sns/R$dimen;->sns_frame_stroke_interval:I

    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    int-to-float p3, p3

    .line 44
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    const/4 p4, 0x2

    new-array p4, p4, [F

    aput p3, p4, v0

    aput p1, p4, v1

    const/4 p1, 0x0

    .line 45
    invoke-direct {p2, p4, p1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-virtual {v3, p2}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

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
    sget p3, Lcom/sumsub/sns/R$attr;->snsFrameViewWithBackgroundStyle:I

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 5
    sget p4, Lcom/sumsub/sns/R$style;->Widget_SNSFrameViewWithBackground:I

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final applyCustomThemeColors()V
    .locals 9

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
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

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
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

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
    move-result-object v4

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 65
    move-result v4

    .line 66
    goto :goto_2

    .line 67
    .line 68
    :cond_2
    iget-object v4, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    sget v5, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 71
    .line 72
    .line 73
    filled-new-array {v5}, [I

    .line 74
    move-result-object v5

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v5, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 78
    move-result v4

    .line 79
    .line 80
    .line 81
    :goto_2
    invoke-static {p0, v3}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    if-eqz v3, :cond_3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 88
    move-result v1

    .line 89
    goto :goto_3

    .line 90
    .line 91
    :cond_3
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 92
    .line 93
    sget v5, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 94
    .line 95
    .line 96
    filled-new-array {v5}, [I

    .line 97
    move-result-object v5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v5, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 101
    move-result v1

    .line 102
    .line 103
    :goto_3
    new-instance v3, Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    sget v5, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 106
    .line 107
    .line 108
    filled-new-array {v5}, [I

    .line 109
    move-result-object v5

    .line 110
    .line 111
    sget v6, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 112
    .line 113
    .line 114
    filled-new-array {v6}, [I

    .line 115
    move-result-object v6

    .line 116
    .line 117
    sget v7, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 118
    .line 119
    .line 120
    filled-new-array {v7}, [I

    .line 121
    move-result-object v7

    .line 122
    .line 123
    sget v8, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 124
    .line 125
    .line 126
    filled-new-array {v8}, [I

    .line 127
    move-result-object v8

    .line 128
    .line 129
    .line 130
    filled-new-array {v5, v6, v7, v8}, [[I

    .line 131
    move-result-object v5

    .line 132
    .line 133
    .line 134
    filled-new-array {v0, v2, v4, v1}, [I

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-direct {v3, v5, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0, v3}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setStateFrameColors(Landroid/content/res/ColorStateList;)V

    .line 142
    return-void
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

.method private final drawWithCanvas(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameRect:Landroid/graphics/RectF;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->updateFrameRect()Landroid/graphics/RectF;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    :cond_0
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameBackgroundColor:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 23
    .line 24
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameRadius:F

    .line 25
    .line 26
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->rectPaint:Landroid/graphics/Paint;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 30
    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->borderRect:Landroid/graphics/RectF;

    .line 32
    .line 33
    iget v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameRadius:F

    .line 34
    .line 35
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->strokedRectPaint:Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 39
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

.method private final getStateFrameColor()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->state:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, -0x1

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    sget-object v1, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    move-result v0

    .line 13
    .line 14
    aget v0, v1, v0

    .line 15
    :goto_0
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-eq v0, v2, :cond_3

    .line 19
    const/4 v3, 0x2

    .line 20
    .line 21
    if-eq v0, v3, :cond_2

    .line 22
    const/4 v3, 0x3

    .line 23
    .line 24
    if-eq v0, v3, :cond_1

    .line 25
    .line 26
    new-array v0, v2, [I

    .line 27
    .line 28
    sget v2, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 29
    .line 30
    aput v2, v0, v1

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_1
    new-array v0, v2, [I

    .line 34
    .line 35
    sget v2, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 36
    .line 37
    aput v2, v0, v1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    :cond_2
    new-array v0, v2, [I

    .line 41
    .line 42
    sget v2, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    .line 43
    .line 44
    aput v2, v0, v1

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_3
    new-array v0, v2, [I

    .line 48
    .line 49
    sget v2, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    .line 50
    .line 51
    aput v2, v0, v1

    .line 52
    .line 53
    :goto_1
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

    .line 54
    .line 55
    .line 56
    const v2, -0xff01

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v0, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 60
    move-result v0

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 64
    move-result v1

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 68
    move-result v2

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 72
    move-result v0

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v2, v0}, Landroid/graphics/Color;->rgb(III)I

    .line 76
    move-result v0

    .line 77
    return v0
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

.method private final setFrameBackgroundColor(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameBackgroundColor:I

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

.method private final setFrameRect(Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameRect:Landroid/graphics/RectF;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->updateBorderRect(Landroid/graphics/RectF;)V

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
.end method

.method private final setStateFrameColors(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameColors:Landroid/content/res/ColorStateList;

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

.method private final setStateFrameRadius(F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameRadius:F

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

.method private final setStateFrameWidth(F)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameWidth:F

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->strokedRectPaint:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 11
    return-void
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

.method private final updateBorderRect(Landroid/graphics/RectF;)V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/RectF;

    .line 3
    .line 4
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 5
    .line 6
    iget v2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->stateFrameWidth:F

    .line 7
    sub-float/2addr v1, v2

    .line 8
    .line 9
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 10
    sub-float/2addr v3, v2

    .line 11
    .line 12
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 13
    add-float/2addr v4, v2

    .line 14
    .line 15
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 16
    add-float/2addr p1, v2

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1, v3, v4, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->borderRect:Landroid/graphics/RectF;

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method


# virtual methods
.method public final getFrameBackgroundColor()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameBackgroundColor:I

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

.method public final getFrameRect()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameRect:Landroid/graphics/RectF;

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

.method public final getFrameSize()Landroid/util/SizeF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameSize:Landroid/util/SizeF;

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

.method public final getState()Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->state:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3
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
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasBitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->drawCanvas:Landroid/graphics/Canvas;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    :goto_0
    return-void

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-direct {p0, v1}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->drawWithCanvas(Landroid/graphics/Canvas;)V

    .line 17
    .line 18
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasPaint:Landroid/graphics/Paint;

    .line 19
    const/4 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 23
    return-void
    .line 24
    .line 25
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasBitmap:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    if-eqz p3, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 11
    move-result p3

    .line 12
    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasBitmap:Landroid/graphics/Bitmap;

    .line 16
    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    .line 21
    .line 22
    :cond_0
    if-lez p1, :cond_2

    .line 23
    .line 24
    if-gtz p2, :cond_1

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_1
    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    new-instance p2, Landroid/graphics/Canvas;

    .line 34
    .line 35
    .line 36
    invoke-direct {p2, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 37
    .line 38
    iput-object p2, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->drawCanvas:Landroid/graphics/Canvas;

    .line 39
    .line 40
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasBitmap:Landroid/graphics/Bitmap;

    .line 41
    return-void

    .line 42
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 43
    .line 44
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->canvasBitmap:Landroid/graphics/Bitmap;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->drawCanvas:Landroid/graphics/Canvas;

    .line 47
    return-void
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

.method public final setFrameSize(Landroid/util/SizeF;)V
    .locals 1
    .param p1    # Landroid/util/SizeF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setFrameRect(Landroid/graphics/RectF;)V

    .line 5
    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameSize:Landroid/util/SizeF;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setState(Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;)V
    .locals 1
    .param p1    # Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->state:Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground$State;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameRect:Landroid/graphics/RectF;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->updateBorderRect(Landroid/graphics/RectF;)V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->strokedRectPaint:Landroid/graphics/Paint;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->getStateFrameColor()I

    .line 15
    move-result v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public final updateFrameRect()Landroid/graphics/RectF;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->frameSize:Landroid/util/SizeF;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    return-object v1

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 23
    move-result v1

    .line 24
    int-to-float v1, v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/util/SizeF;->getWidth()F

    .line 28
    move-result v2

    .line 29
    sub-float/2addr v1, v2

    .line 30
    const/4 v2, 0x2

    .line 31
    int-to-float v2, v2

    .line 32
    div-float/2addr v1, v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 36
    move-result v3

    .line 37
    int-to-float v3, v3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/util/SizeF;->getHeight()F

    .line 41
    move-result v4

    .line 42
    sub-float/2addr v3, v4

    .line 43
    div-float/2addr v3, v2

    .line 44
    .line 45
    new-instance v2, Landroid/graphics/RectF;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/util/SizeF;->getWidth()F

    .line 49
    move-result v4

    .line 50
    add-float/2addr v4, v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Landroid/util/SizeF;->getHeight()F

    .line 54
    move-result v0

    .line 55
    add-float/2addr v0, v3

    .line 56
    .line 57
    .line 58
    invoke-direct {v2, v1, v3, v4, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v2}, Lcom/sumsub/sns/core/widget/camera/SNSFrameViewWithBackground;->setFrameRect(Landroid/graphics/RectF;)V

    .line 62
    return-object v2

    .line 63
    :cond_2
    :goto_0
    return-object v1
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
