.class public final Lcom/sumsub/sns/core/widget/pincode/SNSPinView;
.super Landroid/widget/EditText;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "AppCompatCustomView"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;,
        Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Companion;,
        Lcom/sumsub/sns/core/widget/pincode/SNSPinView$DefaultActionModeCallback;,
        Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010\r\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0007\u0018\u0000 u2\u00020\u0001:\u0004vwuxB1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0010J\u000f\u0010\u001a\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0010J\u0015\u0010!\u001a\u00020\u000c2\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010%\u001a\u00020\u000c2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008%\u0010&J/\u0010,\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u0008,\u0010-J)\u00102\u001a\u00020\u000c2\u0006\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00062\u0008\u00101\u001a\u0004\u0018\u000100H\u0014\u00a2\u0006\u0004\u00082\u00103J\u001f\u00106\u001a\u00020\u000c2\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u0006H\u0014\u00a2\u0006\u0004\u00086\u0010&J\u0017\u00107\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014\u00a2\u0006\u0004\u00087\u0010\u0014J\u000f\u00109\u001a\u000208H\u0014\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010<\u001a\u00020\u000c2\u0006\u0010;\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008<\u0010\u000eJ\u000f\u0010=\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008=\u0010\u0010J\u000f\u0010>\u001a\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008>\u0010\u0010J\u000f\u0010?\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008?\u0010\u0017R\u001c\u0010A\u001a\u0008\u0018\u00010@R\u00020\u00008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0016\u0010C\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008C\u0010DR\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008E\u0010DR\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0016\u0010I\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010JR\u0014\u0010L\u001a\u0002008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR$\u0010Q\u001a\u0004\u0018\u00010F8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Q\u0010H\u001a\u0004\u0008R\u0010S\"\u0004\u0008T\u0010UR\"\u0010V\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008V\u0010D\u001a\u0004\u0008V\u0010\u0017\"\u0004\u0008W\u0010\u001dR$\u0010Y\u001a\u0004\u0018\u00010X8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008Y\u0010Z\u001a\u0004\u0008[\u0010\\\"\u0004\u0008]\u0010^R*\u0010`\u001a\u00020\u00062\u0006\u0010_\u001a\u00020\u00068\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010J\u001a\u0004\u0008a\u0010b\"\u0004\u0008c\u0010\u000eR*\u0010e\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00158\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008e\u0010D\u001a\u0004\u0008e\u0010\u0017\"\u0004\u0008f\u0010\u001dR(\u0010l\u001a\u0004\u0018\u00010g2\u0008\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008h\u0010i\"\u0004\u0008j\u0010kR(\u0010o\u001a\u0004\u0018\u00010g2\u0008\u0010d\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008m\u0010i\"\u0004\u0008n\u0010kR(\u0010t\u001a\u0004\u0018\u00010\u001f2\u0008\u0010d\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008p\u0010q\"\u0004\u0008r\u0010s\u00a8\u0006y"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/pincode/SNSPinView;",
        "Landroid/widget/EditText;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "defStyleRes",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "maxLength",
        "",
        "setMaxLength",
        "(I)V",
        "moveSelectionToEnd",
        "()V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "drawPinView",
        "(Landroid/graphics/Canvas;)V",
        "",
        "shouldBlink",
        "()Z",
        "makeBlink",
        "suspendBlink",
        "resumeBlink",
        "showCursor",
        "invalidateCursor",
        "(Z)V",
        "disableSelectionMenu",
        "",
        "radius",
        "setCornerSize",
        "(F)V",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "(II)V",
        "",
        "text",
        "start",
        "lengthBefore",
        "lengthAfter",
        "onTextChanged",
        "(Ljava/lang/CharSequence;III)V",
        "focused",
        "direction",
        "Landroid/graphics/Rect;",
        "previouslyFocusedRect",
        "onFocusChanged",
        "(ZILandroid/graphics/Rect;)V",
        "selStart",
        "selEnd",
        "onSelectionChanged",
        "onDraw",
        "Landroid/text/method/MovementMethod;",
        "getDefaultMovementMethod",
        "()Landroid/text/method/MovementMethod;",
        "screenState",
        "onScreenStateChanged",
        "onAttachedToWindow",
        "onDetachedFromWindow",
        "isSuggestionsEnabled",
        "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;",
        "mBlink",
        "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;",
        "isCursorVisible",
        "Z",
        "drawCursor",
        "Landroid/graphics/drawable/Drawable;",
        "cursorDrawable",
        "Landroid/graphics/drawable/Drawable;",
        "itemSpacing",
        "I",
        "itemPadding",
        "rect",
        "Landroid/graphics/Rect;",
        "Lcom/google/android/material/shape/ShapeAppearanceModel;",
        "shapeAppearance",
        "Lcom/google/android/material/shape/ShapeAppearanceModel;",
        "itemBackground",
        "getItemBackground",
        "()Landroid/graphics/drawable/Drawable;",
        "setItemBackground",
        "(Landroid/graphics/drawable/Drawable;)V",
        "isPassword",
        "setPassword",
        "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;",
        "onTextCompleteListener",
        "Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;",
        "getOnTextCompleteListener",
        "()Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;",
        "setOnTextCompleteListener",
        "(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V",
        "count",
        "itemCount",
        "getItemCount",
        "()I",
        "setItemCount",
        "value",
        "isError",
        "setError",
        "Landroid/content/res/ColorStateList;",
        "getBoxBackgroundColor",
        "()Landroid/content/res/ColorStateList;",
        "setBoxBackgroundColor",
        "(Landroid/content/res/ColorStateList;)V",
        "boxBackgroundColor",
        "getBoxStrokeColor",
        "setBoxStrokeColor",
        "boxStrokeColor",
        "getBoxStrokeWidth",
        "()Ljava/lang/Float;",
        "setBoxStrokeWidth",
        "(Ljava/lang/Float;)V",
        "boxStrokeWidth",
        "Companion",
        "Blink",
        "DefaultActionModeCallback",
        "OnTextCompleteListener",
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
        "SMAP\nSNSPinView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSPinView.kt\ncom/sumsub/sns/core/widget/pincode/SNSPinView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 ViewThemeExtensions.kt\ncom/sumsub/sns/core/presentation/helper/ViewThemeExtensionsKt\n+ 4 ThemeHelper.kt\ncom/sumsub/sns/core/presentation/helper/ThemeHelper\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n233#2,3:459\n37#3:462\n37#3:463\n54#4:464\n54#4:465\n1#5:466\n*S KotlinDebug\n*F\n+ 1 SNSPinView.kt\ncom/sumsub/sns/core/widget/pincode/SNSPinView\n*L\n101#1:459,3\n140#1:462\n144#1:463\n148#1:464\n152#1:465\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final ERROR_STATE:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final INIT_STATE:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final NO_FILTERS:[Landroid/text/InputFilter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private cursorDrawable:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private drawCursor:Z

.field private isCursorVisible:Z

.field private isError:Z

.field private isPassword:Z

.field private itemBackground:Landroid/graphics/drawable/Drawable;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private itemCount:I

.field private itemPadding:I

.field private itemSpacing:I

.field private mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private onTextCompleteListener:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final rect:Landroid/graphics/Rect;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final shapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->Companion:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Companion;

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    new-array v0, v0, [Landroid/text/InputFilter;

    .line 12
    .line 13
    sput-object v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->NO_FILTERS:[Landroid/text/InputFilter;

    .line 14
    .line 15
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    .line 16
    .line 17
    .line 18
    filled-new-array {v0}, [I

    .line 19
    move-result-object v0

    .line 20
    .line 21
    sput-object v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->INIT_STATE:[I

    .line 22
    .line 23
    sget v0, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    .line 24
    .line 25
    .line 26
    filled-new-array {v0}, [I

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->ERROR_STATE:[I

    .line 30
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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutDirection(I)V

    .line 9
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 10
    invoke-static {p1, p2, p3, p4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;Landroid/util/AttributeSet;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object v0

    iput-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->shapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 11
    new-instance v1, Lcom/google/android/material/shape/MaterialShapeDrawable;

    invoke-direct {v1, v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    iput-object v1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x6

    .line 12
    iput v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 13
    sget-object v1, Lcom/sumsub/sns/R$styleable;->SNSPinView:[I

    .line 14
    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 15
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_android_itemBackground:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    .line 16
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    goto :goto_3

    .line 17
    :cond_0
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_boxBackgroundColor:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 18
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    instance-of v1, p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v1, :cond_1

    check-cast p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_0

    :cond_1
    move-object p3, p4

    :goto_0
    if-eqz p3, :cond_2

    .line 19
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 20
    :cond_2
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_boxStrokeColor:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 21
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    instance-of v1, p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v1, :cond_3

    check-cast p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_1

    :cond_3
    move-object p3, p4

    :goto_1
    if-eqz p3, :cond_4

    .line 22
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 23
    :cond_4
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_sns_boxStrokeWidth:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 24
    iget-object p3, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    instance-of v1, p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v1, :cond_5

    check-cast p3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_2

    :cond_5
    move-object p3, p4

    :goto_2
    if-eqz p3, :cond_6

    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    invoke-virtual {p3, p2}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeWidth(F)V

    .line 26
    :cond_6
    :goto_3
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_sns_itemSpacing:I

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/sumsub/sns/R$dimen;->sns_pin_view_item_spacing:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 28
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemSpacing:I

    .line 29
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_sns_itemPadding:I

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    sget v1, Lcom/sumsub/sns/R$dimen;->sns_pin_view_item_padding:I

    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 31
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemPadding:I

    .line 32
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_android_cursorVisible:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->isCursorVisible:Z

    .line 33
    sget p2, Lcom/sumsub/sns/R$styleable;->SNSPinView_sns_cursorDrawable:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->cursorDrawable:Landroid/graphics/drawable/Drawable;

    .line 34
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 36
    invoke-virtual {p0, p4}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 37
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->disableSelectionMenu()V

    .line 38
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setMaxLength(I)V

    .line 39
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->HEADLINE1:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    sget-object p2, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Lcom/sumsub/sns/core/theme/SNSTypographyElement;Lcom/sumsub/sns/core/theme/SNSColorElement;)V

    .line 40
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 41
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_7

    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-static {p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p3

    .line 43
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 44
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setBoxBackgroundColor(Landroid/content/res/ColorStateList;)V

    .line 45
    :cond_7
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_BORDER:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 46
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_8

    .line 47
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p3

    invoke-static {p3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p3

    .line 48
    invoke-static {p2, p1, p3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 49
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setBoxStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 50
    :cond_8
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->FIELD_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 51
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-static {p2, p1}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 52
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setCornerSize(F)V

    .line 53
    :cond_9
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->FIELD_BORDER_WIDTH:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 54
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-static {p2, p1}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setBoxStrokeWidth(Ljava/lang/Float;)V

    :cond_a
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
    sget p3, Lcom/sumsub/sns/R$attr;->sns_pinViewStyle:I

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 5
    sget p4, Lcom/sumsub/sns/R$style;->Widget_SNSPinView:I

    .line 6
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public static final synthetic access$getDrawCursor$p(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawCursor:Z

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

.method public static final synthetic access$invalidateCursor(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->invalidateCursor(Z)V

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

.method public static final synthetic access$shouldBlink(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->shouldBlink()Z

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

.method private final disableSelectionMenu()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$DefaultActionModeCallback;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$DefaultActionModeCallback;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 9
    .line 10
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1a

    .line 13
    .line 14
    if-lt v0, v1, :cond_0

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$disableSelectionMenu$1;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$disableSelectionMenu$1;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setCustomInsertionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 23
    :cond_0
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
.end method

.method private final drawPinView(Landroid/graphics/Canvas;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 15
    move-result v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v2, v3

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 21
    move-result v4

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 25
    move-result v5

    .line 26
    sub-int/2addr v4, v5

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 30
    move-result v5

    .line 31
    sub-int/2addr v4, v5

    .line 32
    .line 33
    .line 34
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 35
    move-result v4

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 39
    move-result v5

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 43
    move-result v6

    .line 44
    sub-int/2addr v5, v6

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 48
    move-result v6

    .line 49
    sub-int/2addr v5, v6

    .line 50
    .line 51
    iget v6, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 52
    .line 53
    add-int/lit8 v7, v6, -0x1

    .line 54
    .line 55
    iget v8, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemSpacing:I

    .line 56
    mul-int/2addr v7, v8

    .line 57
    sub-int/2addr v5, v7

    .line 58
    div-int/2addr v5, v6

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    .line 62
    move-result v5

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 66
    move-result v6

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 70
    move-result v7

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 74
    move-result v8

    .line 75
    sub-int/2addr v7, v8

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    .line 79
    move-result v8

    .line 80
    sub-int/2addr v7, v8

    .line 81
    .line 82
    iget v8, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 83
    .line 84
    mul-int v9, v5, v8

    .line 85
    sub-int/2addr v7, v9

    .line 86
    const/4 v9, 0x1

    .line 87
    sub-int/2addr v8, v9

    .line 88
    .line 89
    iget v10, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemSpacing:I

    .line 90
    mul-int/2addr v8, v10

    .line 91
    sub-int/2addr v7, v8

    .line 92
    .line 93
    div-int/lit8 v7, v7, 0x2

    .line 94
    add-int/2addr v7, v6

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 98
    move-result v6

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 102
    move-result v8

    .line 103
    sub-int/2addr v8, v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 107
    move-result v10

    .line 108
    sub-int/2addr v8, v10

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 112
    move-result v10

    .line 113
    sub-int/2addr v8, v10

    .line 114
    .line 115
    div-int/lit8 v8, v8, 0x2

    .line 116
    add-int/2addr v8, v6

    .line 117
    .line 118
    iget v6, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 119
    move v10, v3

    .line 120
    .line 121
    :goto_1
    if-ge v10, v6, :cond_8

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 125
    move-result v11

    .line 126
    .line 127
    if-eqz v11, :cond_1

    .line 128
    .line 129
    if-ne v2, v10, :cond_1

    .line 130
    move v11, v9

    .line 131
    goto :goto_2

    .line 132
    :cond_1
    move v11, v3

    .line 133
    .line 134
    :goto_2
    iget v12, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemSpacing:I

    .line 135
    add-int/2addr v12, v5

    .line 136
    mul-int/2addr v12, v10

    .line 137
    add-int/2addr v12, v7

    .line 138
    .line 139
    add-int v13, v12, v5

    .line 140
    .line 141
    iget-object v14, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    if-eqz v14, :cond_3

    .line 144
    .line 145
    iget-boolean v15, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->isError:Z

    .line 146
    .line 147
    if-eqz v15, :cond_2

    .line 148
    .line 149
    sget-object v15, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->ERROR_STATE:[I

    .line 150
    goto :goto_3

    .line 151
    .line 152
    :cond_2
    sget-object v15, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->INIT_STATE:[I

    .line 153
    .line 154
    .line 155
    :goto_3
    invoke-virtual {v14, v15}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 156
    .line 157
    add-int v15, v8, v4

    .line 158
    .line 159
    .line 160
    invoke-virtual {v14, v12, v8, v13, v15}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 164
    .line 165
    .line 166
    invoke-virtual {v14, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 170
    .line 171
    :cond_3
    if-eqz v11, :cond_4

    .line 172
    .line 173
    iget-boolean v11, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawCursor:Z

    .line 174
    .line 175
    if-eqz v11, :cond_4

    .line 176
    .line 177
    iget-object v11, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->cursorDrawable:Landroid/graphics/drawable/Drawable;

    .line 178
    .line 179
    if-eqz v11, :cond_4

    .line 180
    .line 181
    sub-int v14, v13, v12

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 185
    move-result v15

    .line 186
    sub-int/2addr v14, v15

    .line 187
    .line 188
    div-int/lit8 v14, v14, 0x2

    .line 189
    add-int/2addr v14, v12

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 193
    move-result v15

    .line 194
    float-to-int v15, v15

    .line 195
    .line 196
    sub-int v15, v4, v15

    .line 197
    .line 198
    div-int/lit8 v15, v15, 0x2

    .line 199
    add-int/2addr v15, v8

    .line 200
    .line 201
    .line 202
    invoke-virtual {v11}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 203
    move-result v16

    .line 204
    .line 205
    add-int v3, v16, v14

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 209
    move-result v9

    .line 210
    float-to-int v9, v9

    .line 211
    add-int/2addr v9, v15

    .line 212
    .line 213
    .line 214
    invoke-virtual {v11, v14, v15, v3, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 224
    .line 225
    .line 226
    :cond_4
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 227
    move-result-object v3

    .line 228
    .line 229
    if-eqz v3, :cond_5

    .line 230
    .line 231
    .line 232
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 233
    move-result v3

    .line 234
    goto :goto_4

    .line 235
    :cond_5
    const/4 v3, 0x0

    .line 236
    .line 237
    :goto_4
    if-ge v10, v3, :cond_6

    .line 238
    .line 239
    iget-boolean v3, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->isPassword:Z

    .line 240
    .line 241
    const/high16 v9, 0x40000000    # 2.0f

    .line 242
    .line 243
    if-eqz v3, :cond_7

    .line 244
    sub-int/2addr v13, v12

    .line 245
    int-to-float v3, v13

    .line 246
    .line 247
    const/high16 v11, 0x41100000    # 9.0f

    .line 248
    .line 249
    div-float v11, v3, v11

    .line 250
    int-to-float v12, v12

    .line 251
    div-float/2addr v3, v9

    .line 252
    add-float/2addr v3, v12

    .line 253
    .line 254
    add-int v12, v8, v4

    .line 255
    int-to-float v12, v12

    .line 256
    int-to-float v13, v4

    .line 257
    div-float/2addr v13, v9

    .line 258
    sub-float/2addr v12, v13

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 262
    move-result-object v9

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 266
    move-result v13

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 273
    move-result-object v9

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v3, v12, v11, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 277
    :cond_6
    const/4 v9, 0x1

    .line 278
    const/4 v15, 0x0

    .line 279
    goto :goto_5

    .line 280
    .line 281
    .line 282
    :cond_7
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 283
    move-result-object v3

    .line 284
    .line 285
    add-int/lit8 v11, v10, 0x1

    .line 286
    .line 287
    .line 288
    invoke-interface {v3, v10, v11}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 289
    move-result-object v3

    .line 290
    .line 291
    .line 292
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 293
    move-result-object v3

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 297
    move-result-object v11

    .line 298
    .line 299
    iget-object v14, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 300
    .line 301
    move/from16 v16, v9

    .line 302
    const/4 v9, 0x1

    .line 303
    const/4 v15, 0x0

    .line 304
    .line 305
    .line 306
    invoke-virtual {v11, v3, v15, v9, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 307
    int-to-float v11, v12

    .line 308
    sub-int/2addr v13, v12

    .line 309
    .line 310
    iget-object v12, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v12}, Landroid/graphics/Rect;->width()I

    .line 314
    move-result v12

    .line 315
    sub-int/2addr v13, v12

    .line 316
    int-to-float v12, v13

    .line 317
    .line 318
    div-float v12, v12, v16

    .line 319
    add-float/2addr v12, v11

    .line 320
    .line 321
    add-int v11, v8, v4

    .line 322
    int-to-float v11, v11

    .line 323
    .line 324
    iget-object v13, v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    .line 328
    move-result v13

    .line 329
    .line 330
    sub-int v13, v4, v13

    .line 331
    int-to-float v13, v13

    .line 332
    .line 333
    div-float v13, v13, v16

    .line 334
    sub-float/2addr v11, v13

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 338
    move-result-object v13

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 342
    move-result v14

    .line 343
    .line 344
    .line 345
    invoke-virtual {v13, v14}, Landroid/graphics/Paint;->setColor(I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 349
    move-result-object v13

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v3, v12, v11, v13}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 353
    .line 354
    :goto_5
    add-int/lit8 v10, v10, 0x1

    .line 355
    move v3, v15

    .line 356
    .line 357
    goto/16 :goto_1

    .line 358
    :cond_8
    return-void
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
.end method

.method private final invalidateCursor(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawCursor:Z

    .line 3
    .line 4
    if-eq v0, p1, :cond_0

    .line 5
    .line 6
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawCursor:Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method private final makeBlink()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->shouldBlink()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;-><init>(Lcom/sumsub/sns/core/widget/pincode/SNSPinView;)V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawCursor:Z

    .line 26
    .line 27
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 28
    .line 29
    const-wide/16 v1, 0x1f4

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 33
    return-void

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 41
    :cond_2
    return-void
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

.method private final moveSelectionToEnd()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    move-result v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 16
    return-void
    .line 17
.end method

.method private final resumeBlink()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;->uncancel()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->makeBlink()V

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method private final setMaxLength(I)V
    .locals 2

    .line 1
    .line 2
    if-ltz p1, :cond_0

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    new-array v0, v0, [Landroid/text/InputFilter;

    .line 6
    .line 7
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    .line 11
    const/4 p1, 0x0

    .line 12
    .line 13
    aput-object v1, v0, p1

    .line 14
    goto :goto_0

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->NO_FILTERS:[Landroid/text/InputFilter;

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private final shouldBlink()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->isCursorVisible()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
.end method

.method private final suspendBlink()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->mBlink:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$Blink;->cancel()V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->invalidateCursor(Z)V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public final getBoxBackgroundColor()Landroid/content/res/ColorStateList;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->getFillColor()Landroid/content/res/ColorStateList;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object v2
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

.method public final getBoxStrokeColor()Landroid/content/res/ColorStateList;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->getStrokeColor()Landroid/content/res/ColorStateList;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :cond_1
    return-object v2
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

.method public final getBoxStrokeWidth()Ljava/lang/Float;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v2

    .line 12
    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/google/android/material/shape/MaterialShapeDrawable;->getStrokeWidth()F

    .line 17
    move-result v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_1
    return-object v2
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

.method public getDefaultMovementMethod()Landroid/text/method/MovementMethod;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/pincode/DefaultMovementMethod;->INSTANCE:Lcom/sumsub/sns/core/widget/pincode/DefaultMovementMethod;

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

.method public final getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

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

.method public final getItemCount()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

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

.method public final getOnTextCompleteListener()Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->onTextCompleteListener:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;

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

.method public isSuggestionsEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
    .line 17
.end method

.method public onAttachedToWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->resumeBlink()V

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
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->suspendBlink()V

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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->drawPinView(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

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

.method public onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 0
    .param p3    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Landroid/view/View;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->moveSelectionToEnd()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->makeBlink()V

    .line 12
    :cond_0
    return-void
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

.method public onMeasure(II)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 7
    .line 8
    const-string v2, "8"

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v3, v4, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 14
    .line 15
    iget v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemPadding:I

    .line 16
    .line 17
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    .line 24
    iget v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemPadding:I

    .line 25
    add-int/2addr v1, v0

    .line 26
    .line 27
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->rect:Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    .line 34
    iget v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemPadding:I

    .line 35
    add-int/2addr v2, v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 44
    move-result v1

    .line 45
    add-int/2addr v1, v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 49
    move-result v0

    .line 50
    .line 51
    iget v5, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 52
    mul-int/2addr v2, v5

    .line 53
    add-int/2addr v2, v0

    .line 54
    .line 55
    iget v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemSpacing:I

    .line 56
    sub-int/2addr v5, v4

    .line 57
    mul-int/2addr v5, v0

    .line 58
    add-int/2addr v5, v2

    .line 59
    .line 60
    .line 61
    invoke-static {v5, p1, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 62
    move-result p1

    .line 63
    .line 64
    .line 65
    invoke-static {v1, p2, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 66
    move-result p2

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

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

.method public onScreenStateChanged(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onScreenStateChanged(I)V

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    const/4 v0, 0x1

    .line 7
    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->resumeBlink()V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->suspendBlink()V

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public onSelectionChanged(II)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onSelectionChanged(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 13
    move-result p1

    .line 14
    .line 15
    if-ne p2, p1, :cond_0

    .line 16
    return-void

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->moveSelectionToEnd()V

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

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 4
    move-result p3

    .line 5
    .line 6
    if-eq p2, p3, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->moveSelectionToEnd()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->makeBlink()V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    move-result p2

    .line 17
    .line 18
    iget p3, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 19
    .line 20
    if-ne p2, p3, :cond_2

    .line 21
    .line 22
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->onTextCompleteListener:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;

    .line 23
    const/4 p3, 0x0

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;->onTextComplete(Ljava/lang/String;)Z

    .line 33
    move-result p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move p1, p3

    .line 36
    .line 37
    :goto_0
    if-eqz p1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    const-string p2, "input_method"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p2, p3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 57
    :cond_2
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

.method public final setBoxBackgroundColor(Landroid/content/res/ColorStateList;)V
    .locals 2
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 16
    :cond_1
    return-void
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

.method public final setBoxStrokeColor(Landroid/content/res/ColorStateList;)V
    .locals 2
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeColor(Landroid/content/res/ColorStateList;)V

    .line 16
    :cond_1
    return-void
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

.method public final setBoxStrokeWidth(Ljava/lang/Float;)V
    .locals 2
    .param p1    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 6
    move-result p1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setStrokeWidth(F)V

    .line 22
    :cond_1
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public final setCornerSize(F)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 3
    .line 4
    instance-of v1, v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setCornerSize(F)V

    .line 16
    :cond_1
    return-void
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

.method public final setError(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->isError:Z

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

.method public final setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemBackground:Landroid/graphics/drawable/Drawable;

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

.method public final setItemCount(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->itemCount:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setMaxLength(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

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

.method public final setOnTextCompleteListener(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->onTextCompleteListener:Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;

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

.method public final setPassword(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->isPassword:Z

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
