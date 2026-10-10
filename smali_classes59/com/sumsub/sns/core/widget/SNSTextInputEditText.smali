.class public final Lcom/sumsub/sns/core/widget/SNSTextInputEditText;
.super Lcom/google/android/material/textfield/TextInputEditText;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$EditableProxy;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;,
        Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MyInputConnectionWrapper;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000c\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c*\u00010\u0018\u0000 e2\u00020\u0001:\u0007_`abcdeB\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001d\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0016H\u0007\u00a2\u0006\u0002\u00085J\u0016\u00102\u001a\u0002032\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016J\u0017\u00106\u001a\u0002032\n\u0008\u0002\u00107\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u00108J\u000e\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020\u0007J\u0012\u0010;\u001a\u0002032\u0008\u0010<\u001a\u0004\u0018\u00010=H\u0002J\u0018\u0010>\u001a\u000203*\u0004\u0018\u00010=2\u0008\u0008\u0002\u0010?\u001a\u00020#H\u0002J\'\u0010@\u001a\u000203*\u00060\u001dj\u0002`\u001e2\u0008\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020#H\u0002\u00a2\u0006\u0002\u0010DJ\u0008\u0010E\u001a\u000203H\u0002J\n\u0010F\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010G\u001a\u00020\u00072\u0006\u0010H\u001a\u00020\u0007H\u0002J\u0008\u0010I\u001a\u00020\u0007H\u0002J\u0012\u0010J\u001a\u0002032\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0008\u0010K\u001a\u000203H\u0002J\u0008\u0010L\u001a\u000203H\u0002J\u001c\u0010M\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u001c\u0010N\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0002J\u0008\u0010O\u001a\u00020\u0007H\u0002J\u001a\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0018\u0010T\u001a\u0002032\u0006\u0010U\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u0007H\u0014J\u0012\u0010W\u001a\u0004\u0018\u00010X2\u0006\u0010Y\u001a\u00020ZH\u0016J\u0008\u0010[\u001a\u00020#H\u0016J\n\u0010\\\u001a\u0004\u0018\u00010=H\u0016J\u0012\u0010]\u001a\u0002032\u0008\u0010^\u001a\u0004\u0018\u00010SH\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R6\u0010\u0014\u001a*\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u0016`\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R6\u0010\u0019\u001a*\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u0015j\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u0016`\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u00060\u001dj\u0002`\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R.\u0010)\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00162\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0016@BX\u0082\u000e\u00a2\u0006\u0008\n\u0000\"\u0004\u0008*\u0010+R\u0011\u0010,\u001a\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0010\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00101\u00a8\u0006f"
    }
    d2 = {
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText;",
        "Lcom/google/android/material/textfield/TextInputEditText;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "maskListener",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;",
        "getMaskListener",
        "()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;",
        "setMaskListener",
        "(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;)V",
        "rawText",
        "",
        "getRawText",
        "()Ljava/lang/String;",
        "masksCleared",
        "Ljava/util/HashMap;",
        "",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;",
        "Lkotlin/collections/HashMap;",
        "maskSymbolPositions",
        "mask",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
        "raw",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "lastRaw",
        "buffer",
        "maxRawLength",
        "isTextChangingBefore",
        "",
        "isTextChangingAfter",
        "isSelectionChanging",
        "benchmark",
        "",
        "value",
        "masksInternal",
        "setMasksInternal",
        "(Ljava/util/List;)V",
        "masksEnabled",
        "getMasksEnabled",
        "()Z",
        "textWatcher",
        "com/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;",
        "setMasks",
        "",
        "masks",
        "setMasksString",
        "updateInputType",
        "defaultInputType",
        "(Ljava/lang/Integer;)V",
        "setMaxLength",
        "maxLength",
        "applyMask",
        "s",
        "Landroid/text/Editable;",
        "removeHintSpans",
        "clear",
        "appendMaskChar",
        "char",
        "",
        "escaped",
        "(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V",
        "cleanRaw",
        "findNewMask",
        "prevValidCharPosition",
        "start",
        "getStartingPosition",
        "prepareMask",
        "prepareMasks",
        "setDefaultMask",
        "getMaskSymbolsCount",
        "getSpecialSymbolsInMaskedTextCount",
        "getRemovedSymbolsCount",
        "maskMatches",
        "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;",
        "text",
        "",
        "onSelectionChanged",
        "selStart",
        "selEnd",
        "onCreateInputConnection",
        "Landroid/view/inputmethod/InputConnection;",
        "outAttrs",
        "Landroid/view/inputmethod/EditorInfo;",
        "isSuggestionsEnabled",
        "getText",
        "setError",
        "error",
        "MaskMatchResult",
        "EditableProxy",
        "MyInputConnectionWrapper",
        "CharHolder",
        "Mask",
        "MaskListener",
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
        "SMAP\nSNSTextInputEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,610:1\n1563#2:611\n1634#2,3:612\n1869#2,2:615\n360#2,7:617\n1563#2:633\n1634#2,3:634\n774#2:637\n865#2,2:638\n1740#2,3:640\n1999#2,14:643\n360#2,7:657\n1878#2,2:665\n1880#2:670\n2423#2,14:671\n34#3:624\n13472#4,2:625\n425#5:627\n507#5,5:628\n1188#5,3:667\n1188#5,3:685\n1#6:664\n*S KotlinDebug\n*F\n+ 1 SNSTextInputEditText.kt\ncom/sumsub/sns/core/widget/SNSTextInputEditText\n*L\n233#1:611\n233#1:612,3\n270#1:615,2\n291#1:617,7\n342#1:633\n342#1:634,3\n343#1:637\n343#1:638,2\n344#1:640,3\n351#1:643,14\n375#1:657,7\n389#1:665,2\n389#1:670\n418#1:671,14\n300#1:624\n300#1:625,2\n325#1:627\n325#1:628,5\n398#1:667,3\n468#1:685,3\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final maskSymbols:[Ljava/lang/Character;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private benchmark:J

.field private buffer:Ljava/lang/StringBuilder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isSelectionChanging:Z

.field private isTextChangingAfter:Z

.field private isTextChangingBefore:Z

.field private lastRaw:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maskListener:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maskSymbolPositions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private masksCleared:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private masksInternal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxRawLength:I

.field private raw:Ljava/lang/StringBuilder;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final textWatcher:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 9
    .line 10
    const/16 v0, 0x23

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const/16 v1, 0x3f

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const/16 v2, 0x2a

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    filled-new-array {v0, v1, v2}, [Ljava/lang/Character;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    sput-object v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbols:[Ljava/lang/Character;

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
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
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
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/textfield/TextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksCleared:Ljava/util/HashMap;

    .line 7
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 9
    const-string p1, ""

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->lastRaw:Ljava/lang/String;

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    const p1, 0x7fffffff

    .line 11
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maxRawLength:I

    .line 12
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;-><init>(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)V

    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->textWatcher:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$textWatcher$1;

    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

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
    sget p3, Lcom/sumsub/sns/R$attr;->sns_TextInputEditTextStyle:I

    .line 4
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$applyMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->applyMask(Landroid/text/Editable;)V

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

.method public static final synthetic access$cleanRaw(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->cleanRaw()V

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

.method public static final synthetic access$findNewMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->findNewMask()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

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
.end method

.method public static final synthetic access$getBenchmark$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->benchmark:J

    .line 3
    return-wide v0
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

.method public static final synthetic access$getMask$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

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

.method public static final synthetic access$getMaskSymbolPositions$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/util/HashMap;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

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

.method public static final synthetic access$getMaskSymbols$cp()[Ljava/lang/Character;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbols:[Ljava/lang/Character;

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

.method public static final synthetic access$getRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Ljava/lang/StringBuilder;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

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

.method public static final synthetic access$getRemovedSymbolsCount(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getRemovedSymbolsCount()I

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

.method public static final synthetic access$getStartingPosition(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getStartingPosition()I

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

.method public static final synthetic access$isTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingAfter:Z

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

.method public static final synthetic access$isTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;)Z
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingBefore:Z

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

.method public static final synthetic access$prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

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

.method public static final synthetic access$prevValidCharPosition(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;I)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->prevValidCharPosition(I)I

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

.method public static final synthetic access$setBenchmark$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->benchmark:J

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
.end method

.method public static final synthetic access$setLastRaw$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->lastRaw:Ljava/lang/String;

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
.end method

.method public static final synthetic access$setTextChangingAfter$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingAfter:Z

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
.end method

.method public static final synthetic access$setTextChangingBefore$p(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingBefore:Z

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
.end method

.method private final appendMaskChar(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V
    .locals 0

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    if-eqz p3, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    .line 9
    move-result p2

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    return-void

    .line 14
    .line 15
    :cond_1
    sget-object p3, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    .line 19
    move-result p2

    .line 20
    .line 21
    .line 22
    invoke-static {p3, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;->access$maskCharToPlaceholder(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;C)C

    .line 23
    move-result p2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

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
.end method

.method private final applyMask(Landroid/text/Editable;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_4

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_c

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, p1, v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->removeHintSpans(Landroid/text/Editable;Z)V

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/text/StringsKt;->clear(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    const/4 v2, 0x1

    .line 29
    .line 30
    .line 31
    invoke-static {p0, p1, v1, v2, v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->removeHintSpans$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;ZILjava/lang/Object;)V

    .line 32
    .line 33
    :cond_2
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 36
    .line 37
    if-eqz v3, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    :cond_3
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    check-cast v0, Ljava/util/List;

    .line 48
    .line 49
    if-eqz v0, :cond_6

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 53
    move-result-object v2

    .line 54
    move v3, v1

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    move-result v4

    .line 59
    .line 60
    if-eqz v4, :cond_7

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    move-result-object v4

    .line 65
    .line 66
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getChar()C

    .line 70
    move-result v5

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 74
    move-result v6

    .line 75
    .line 76
    if-gez v6, :cond_4

    .line 77
    .line 78
    iget-object v6, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 82
    move-result-object v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getEscaped()Z

    .line 86
    move-result v4

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, v6, v5, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->appendMaskChar(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V

    .line 90
    goto :goto_0

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 94
    move-result v6

    .line 95
    .line 96
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    .line 100
    move-result v7

    .line 101
    .line 102
    if-ge v6, v7, :cond_5

    .line 103
    .line 104
    sget-object v6, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 105
    .line 106
    .line 107
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    iget-object v7, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 114
    move-result v4

    .line 115
    .line 116
    .line 117
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 118
    move-result v4

    .line 119
    .line 120
    .line 121
    invoke-static {v6, v5, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;->access$modifyCharRegister(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;Ljava/lang/Character;C)C

    .line 122
    move-result v4

    .line 123
    .line 124
    iget-object v5, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    goto :goto_0

    .line 131
    .line 132
    :cond_5
    iget-object v6, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 136
    move-result-object v5

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getEscaped()Z

    .line 140
    move-result v4

    .line 141
    .line 142
    .line 143
    invoke-direct {p0, v6, v5, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->appendMaskChar(Ljava/lang/StringBuilder;Ljava/lang/Character;Z)V

    .line 144
    goto :goto_0

    .line 145
    :cond_6
    move v3, v1

    .line 146
    .line 147
    :cond_7
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 151
    move-result v2

    .line 152
    move v4, v3

    .line 153
    .line 154
    :goto_1
    if-ge v4, v2, :cond_8

    .line 155
    .line 156
    iget-object v5, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 157
    .line 158
    iget-object v6, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    .line 162
    move-result v6

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    add-int/lit8 v4, v4, 0x1

    .line 168
    goto :goto_1

    .line 169
    .line 170
    :cond_8
    if-eqz p1, :cond_9

    .line 171
    .line 172
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->buffer:Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v2}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 176
    .line 177
    :cond_9
    if-eqz v0, :cond_b

    .line 178
    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 181
    move-result-object v0

    .line 182
    move v2, v1

    .line 183
    .line 184
    .line 185
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    move-result v4

    .line 187
    .line 188
    if-eqz v4, :cond_b

    .line 189
    .line 190
    .line 191
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    move-result-object v4

    .line 193
    .line 194
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 198
    move-result v4

    .line 199
    .line 200
    if-ne v4, v3, :cond_a

    .line 201
    goto :goto_3

    .line 202
    .line 203
    :cond_a
    add-int/lit8 v2, v2, 0x1

    .line 204
    goto :goto_2

    .line 205
    :cond_b
    const/4 v2, -0x1

    .line 206
    .line 207
    :goto_3
    if-ltz v2, :cond_c

    .line 208
    .line 209
    if-eqz p1, :cond_c

    .line 210
    .line 211
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentHintTextColor()I

    .line 215
    move-result v3

    .line 216
    .line 217
    .line 218
    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 222
    move-result v3

    .line 223
    .line 224
    .line 225
    invoke-interface {p1, v0, v2, v3, v1}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 226
    :cond_c
    :goto_4
    return-void
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

.method private final cleanRaw()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_1

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    :goto_0
    if-ge v3, v2, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 23
    move-result v4

    .line 24
    .line 25
    sget-object v5, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 26
    .line 27
    .line 28
    invoke-static {v5, v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;->access$isCharMaskPart(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;C)Z

    .line 29
    move-result v5

    .line 30
    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 35
    .line 36
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_2
    iget v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maxRawLength:I

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 47
    move-result v1

    .line 48
    .line 49
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-static {v1}, Lkotlin/text/StringsKt;->clear(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    :cond_3
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 71
    move-result v0

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    .line 76
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setDefaultMask()V

    .line 77
    :cond_4
    :goto_1
    return-void
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

.method private final findNewMask()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskListener:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v2, v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;->preFilterMasks(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksInternal:Ljava/util/List;

    .line 17
    :cond_1
    const/4 v3, 0x0

    .line 18
    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    new-instance v4, Ljava/util/ArrayList;

    .line 22
    .line 23
    const/16 v5, 0xa

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 27
    move-result v5

    .line 28
    .line 29
    .line 30
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    if-eqz v5, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, v1, v5}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskMatches(Ljava/lang/CharSequence;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 50
    move-result-object v5

    .line 51
    .line 52
    .line 53
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v4, v3

    .line 56
    :cond_3
    const/4 v2, 0x0

    .line 57
    .line 58
    if-eqz v4, :cond_5

    .line 59
    .line 60
    new-instance v5, Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 67
    move-result v6

    .line 68
    move v7, v2

    .line 69
    .line 70
    :cond_4
    :goto_1
    if-ge v7, v6, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    move-result-object v8

    .line 75
    .line 76
    add-int/lit8 v7, v7, 0x1

    .line 77
    move-object v9, v8

    .line 78
    .line 79
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v9}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getMatches()Z

    .line 83
    move-result v9

    .line 84
    .line 85
    if-eqz v9, :cond_4

    .line 86
    .line 87
    .line 88
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    move-object v5, v3

    .line 91
    .line 92
    :cond_6
    if-eqz v5, :cond_9

    .line 93
    .line 94
    .line 95
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 96
    move-result v4

    .line 97
    const/4 v6, 0x1

    .line 98
    xor-int/2addr v4, v6

    .line 99
    .line 100
    if-ne v4, v6, :cond_9

    .line 101
    .line 102
    .line 103
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    move-result v4

    .line 105
    .line 106
    if-eqz v4, :cond_7

    .line 107
    goto :goto_3

    .line 108
    .line 109
    .line 110
    :cond_7
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 111
    move-result v4

    .line 112
    move v6, v2

    .line 113
    .line 114
    :goto_2
    if-ge v6, v4, :cond_8

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    move-result-object v7

    .line 119
    .line 120
    add-int/lit8 v6, v6, 0x1

    .line 121
    .line 122
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v7}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 126
    move-result v7

    .line 127
    .line 128
    .line 129
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    move-result-object v8

    .line 131
    .line 132
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 136
    move-result v8

    .line 137
    .line 138
    if-ne v7, v8, :cond_9

    .line 139
    goto :goto_2

    .line 140
    .line 141
    .line 142
    :cond_8
    :goto_3
    invoke-direct {p0, v1, v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskMatches(Ljava/lang/CharSequence;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getMatches()Z

    .line 147
    move-result v4

    .line 148
    .line 149
    if-eqz v4, :cond_9

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 153
    move-result v1

    .line 154
    .line 155
    .line 156
    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    move-result-object v2

    .line 158
    .line 159
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 163
    move-result v2

    .line 164
    .line 165
    if-lt v1, v2, :cond_9

    .line 166
    return-object v0

    .line 167
    .line 168
    :cond_9
    if-eqz v5, :cond_e

    .line 169
    .line 170
    .line 171
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    move-result v1

    .line 177
    .line 178
    if-nez v1, :cond_a

    .line 179
    move-object v1, v3

    .line 180
    goto :goto_4

    .line 181
    .line 182
    .line 183
    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    .line 187
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 188
    move-result v2

    .line 189
    .line 190
    if-nez v2, :cond_b

    .line 191
    goto :goto_4

    .line 192
    :cond_b
    move-object v2, v1

    .line 193
    .line 194
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 198
    move-result v2

    .line 199
    .line 200
    .line 201
    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 202
    move-result-object v4

    .line 203
    move-object v5, v4

    .line 204
    .line 205
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getWeight()I

    .line 209
    move-result v5

    .line 210
    .line 211
    if-ge v2, v5, :cond_d

    .line 212
    move-object v1, v4

    .line 213
    move v2, v5

    .line 214
    .line 215
    .line 216
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 217
    move-result v4

    .line 218
    .line 219
    if-nez v4, :cond_c

    .line 220
    .line 221
    :goto_4
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 222
    goto :goto_5

    .line 223
    :cond_e
    move-object v1, v3

    .line 224
    .line 225
    :goto_5
    if-eqz v1, :cond_f

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;->getMask()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :cond_f
    return-object v3
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
.end method

.method private final getMaskSymbolsCount(ILjava/lang/String;)I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    return v1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 16
    move-result v2

    .line 17
    move v3, v1

    .line 18
    .line 19
    :goto_0
    if-ge v1, v2, :cond_2

    .line 20
    .line 21
    if-eq v1, p1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 31
    move-result v4

    .line 32
    .line 33
    if-ltz v4, :cond_1

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_2
    if-le p1, v3, :cond_3

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount(ILjava/lang/String;)I

    .line 44
    move-result p2

    .line 45
    sub-int/2addr p1, p2

    .line 46
    return p1

    .line 47
    :cond_3
    return v3
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

.method public static synthetic getMaskSymbolsCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMaskSymbolsCount(ILjava/lang/String;)I

    .line 18
    move-result p0

    .line 19
    return p0
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

.method private final getRemovedSymbolsCount()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->lastRaw:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 12
    move-result v1

    .line 13
    sub-int/2addr v0, v1

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method private final getSpecialSymbolsInMaskedTextCount(ILjava/lang/String;)I
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-gtz p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object p2

    .line 11
    .line 12
    check-cast p2, Ljava/util/List;

    .line 13
    .line 14
    if-nez p2, :cond_1

    .line 15
    return v0

    .line 16
    .line 17
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 25
    move-result v2

    .line 26
    move v3, v0

    .line 27
    move v4, v3

    .line 28
    .line 29
    :goto_0
    if-ge v0, v2, :cond_4

    .line 30
    .line 31
    if-eq v0, p1, :cond_4

    .line 32
    .line 33
    if-ne v3, v1, :cond_2

    .line 34
    goto :goto_2

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    move-result-object v5

    .line 39
    .line 40
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 44
    move-result v5

    .line 45
    .line 46
    if-gez v5, :cond_3

    .line 47
    .line 48
    add-int/lit8 v4, v4, 0x1

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 54
    goto :goto_0

    .line 55
    :cond_4
    :goto_2
    return v4
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

.method public static synthetic getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_1

    .line 5
    .line 6
    iget-object p2, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 12
    move-result-object p2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p2, 0x0

    .line 15
    .line 16
    .line 17
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount(ILjava/lang/String;)I

    .line 18
    move-result p0

    .line 19
    return p0
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

.method private final getStartingPosition()I
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v1, v2

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Ljava/util/List;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    if-eqz v0, :cond_4

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    move-result-object v0

    .line 27
    move v3, v1

    .line 28
    .line 29
    .line 30
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v4

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v4

    .line 38
    .line 39
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 43
    move-result v4

    .line 44
    .line 45
    if-ltz v4, :cond_1

    .line 46
    goto :goto_2

    .line 47
    .line 48
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    const/4 v3, -0x1

    .line 51
    .line 52
    .line 53
    :goto_2
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-ltz v3, :cond_3

    .line 57
    move-object v2, v0

    .line 58
    .line 59
    :cond_3
    if-eqz v2, :cond_4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 63
    move-result v0

    .line 64
    return v0

    .line 65
    :cond_4
    return v1
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

.method private final maskMatches(Ljava/lang/CharSequence;Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1, v0, v0, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;-><init>(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksCleared:Ljava/util/HashMap;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, v0, v0, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;-><init>(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 29
    return-object p1

    .line 30
    :cond_1
    move v2, v0

    .line 31
    move v3, v2

    .line 32
    move v4, v3

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v5

    .line 37
    const/4 v6, 0x1

    .line 38
    .line 39
    if-ge v2, v5, :cond_7

    .line 40
    .line 41
    .line 42
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 43
    move-result v5

    .line 44
    .line 45
    add-int/lit8 v7, v4, 0x1

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 49
    move-result v8

    .line 50
    .line 51
    if-lt v4, v8, :cond_2

    .line 52
    .line 53
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMaskValidIfOverflow()Z

    .line 57
    move-result v0

    .line 58
    .line 59
    .line 60
    invoke-direct {p1, v0, v3, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;-><init>(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 61
    return-object p1

    .line 62
    .line 63
    :cond_2
    sget-object v8, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 64
    .line 65
    .line 66
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    move-result-object v9

    .line 68
    .line 69
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getSoftMatch()Z

    .line 73
    move-result v10

    .line 74
    .line 75
    .line 76
    invoke-static {v8, v5, v9, v10}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;->access$symbolMatches(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;CLcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;Z)Z

    .line 77
    move-result v8

    .line 78
    .line 79
    if-nez v8, :cond_3

    .line 80
    .line 81
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, v0, v3, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;-><init>(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 85
    return-object p1

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 89
    move-result-object v8

    .line 90
    .line 91
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getChar()C

    .line 95
    move-result v8

    .line 96
    .line 97
    .line 98
    invoke-static {v5, v8, v6}, Lkotlin/text/CharsKt;->equals(CCZ)Z

    .line 99
    move-result v8

    .line 100
    .line 101
    if-eqz v8, :cond_4

    .line 102
    const/4 v6, 0x4

    .line 103
    goto :goto_2

    .line 104
    .line 105
    .line 106
    :cond_4
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    move-result-object v8

    .line 108
    .line 109
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v8}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getChar()C

    .line 113
    move-result v8

    .line 114
    .line 115
    const/16 v9, 0x23

    .line 116
    .line 117
    if-ne v8, v9, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    .line 121
    move-result v8

    .line 122
    .line 123
    if-eqz v8, :cond_5

    .line 124
    goto :goto_1

    .line 125
    .line 126
    .line 127
    :cond_5
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 128
    move-result-object v4

    .line 129
    .line 130
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getChar()C

    .line 134
    move-result v4

    .line 135
    .line 136
    const/16 v8, 0x3f

    .line 137
    .line 138
    if-ne v4, v8, :cond_6

    .line 139
    .line 140
    .line 141
    invoke-static {v5}, Ljava/lang/Character;->isLetter(C)Z

    .line 142
    move-result v4

    .line 143
    .line 144
    if-eqz v4, :cond_6

    .line 145
    :goto_1
    const/4 v6, 0x2

    .line 146
    :cond_6
    :goto_2
    add-int/2addr v3, v6

    .line 147
    .line 148
    add-int/lit8 v2, v2, 0x1

    .line 149
    move v4, v7

    .line 150
    goto :goto_0

    .line 151
    .line 152
    :cond_7
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;

    .line 153
    .line 154
    .line 155
    invoke-direct {p1, v6, v3, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskMatchResult;-><init>(ZILcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 156
    return-object p1
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

.method private final prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "prepareMask "

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    const/4 v5, 0x4

    .line 31
    const/4 v6, 0x0

    .line 32
    .line 33
    const-string v2, "SNSInputEditText"

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v1 .. v6}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 38
    .line 39
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskListener:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;->onMaskChanged(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

    .line 47
    :cond_1
    :goto_0
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
.end method

.method private final prepareMasks()V
    .locals 22

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    iget-object v1, v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksInternal:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v1, :cond_4

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v4

    .line 17
    .line 18
    if-eqz v4, :cond_4

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    add-int/lit8 v5, v3, 0x1

    .line 25
    .line 26
    if-gez v3, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    .line 30
    .line 31
    :cond_0
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 32
    .line 33
    new-instance v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    iget-object v6, v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 42
    move-result-object v7

    .line 43
    .line 44
    .line 45
    invoke-interface {v6, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    new-instance v6, Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    iget-object v7, v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksCleared:Ljava/util/HashMap;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 56
    move-result-object v8

    .line 57
    .line 58
    .line 59
    invoke-interface {v7, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 63
    move-result-object v7

    .line 64
    move v8, v2

    .line 65
    move v12, v8

    .line 66
    move v15, v12

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 70
    move-result v9

    .line 71
    .line 72
    if-ge v8, v9, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-interface {v7, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 76
    move-result v10

    .line 77
    .line 78
    const/16 v9, 0x5c

    .line 79
    .line 80
    if-ne v10, v9, :cond_1

    .line 81
    .line 82
    if-nez v12, :cond_1

    .line 83
    const/4 v9, 0x1

    .line 84
    move v12, v9

    .line 85
    goto :goto_3

    .line 86
    .line 87
    :cond_1
    sget-object v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->Companion:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;

    .line 88
    .line 89
    .line 90
    invoke-static {v9, v10}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;->access$isCharMaskPart(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Companion;C)Z

    .line 91
    move-result v9

    .line 92
    .line 93
    if-eqz v9, :cond_2

    .line 94
    .line 95
    if-nez v12, :cond_2

    .line 96
    .line 97
    new-instance v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 98
    const/4 v13, 0x2

    .line 99
    const/4 v14, 0x0

    .line 100
    const/4 v11, 0x0

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v9 .. v14}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;-><init>(CIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    new-instance v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v9, v10, v15, v12}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;-><init>(CIZ)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    add-int/lit8 v15, v15, 0x1

    .line 117
    :goto_2
    move v12, v2

    .line 118
    goto :goto_3

    .line 119
    .line 120
    :cond_2
    new-instance v9, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 121
    const/4 v11, -0x1

    .line 122
    .line 123
    .line 124
    invoke-direct {v9, v10, v11, v12}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;-><init>(CIZ)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    goto :goto_2

    .line 129
    .line 130
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 131
    goto :goto_1

    .line 132
    .line 133
    :cond_3
    sget-object v16, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 134
    .line 135
    .line 136
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    move-result-object v17

    .line 138
    .line 139
    new-instance v3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    const-string v7, "Mask "

    .line 145
    .line 146
    .line 147
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v4, " cleared "

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    move-result-object v18

    .line 163
    .line 164
    const/16 v20, 0x4

    .line 165
    .line 166
    const/16 v21, 0x0

    .line 167
    .line 168
    const/16 v19, 0x0

    .line 169
    .line 170
    .line 171
    invoke-static/range {v16 .. v21}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 172
    move v3, v5

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    .line 177
    :cond_4
    invoke-direct {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setDefaultMask()V

    .line 178
    return-void
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

.method private final prevValidCharPosition(I)I
    .locals 3

    .line 1
    .line 2
    if-gez p1, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    move-object v1, v2

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ljava/util/List;

    .line 24
    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    .line 28
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    goto :goto_1

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 38
    move-result v1

    .line 39
    .line 40
    if-gez v1, :cond_3

    .line 41
    .line 42
    add-int/lit8 p1, p1, -0x1

    .line 43
    .line 44
    .line 45
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->prevValidCharPosition(I)I

    .line 46
    move-result p1

    .line 47
    return p1

    .line 48
    .line 49
    .line 50
    :cond_3
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 51
    move-result p1

    .line 52
    return p1

    .line 53
    :cond_4
    :goto_1
    const/4 v0, 0x2

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1, v2, v0, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 57
    move-result v0

    .line 58
    sub-int/2addr p1, v0

    .line 59
    return p1
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

.method private final removeHintSpans(Landroid/text/Editable;Z)V
    .locals 3

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_1

    .line 4
    .line 5
    :cond_0
    if-eqz p2, :cond_1

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 9
    .line 10
    .line 11
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result p2

    .line 13
    .line 14
    const-class v0, Landroid/text/style/ForegroundColorSpan;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1, p2, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 19
    move-result-object p2

    .line 20
    array-length v0, p2

    .line 21
    .line 22
    :goto_0
    if-ge v1, v0, :cond_2

    .line 23
    .line 24
    aget-object v2, p2, v1

    .line 25
    .line 26
    check-cast v2, Landroid/text/style/ForegroundColorSpan;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v2}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    :goto_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static synthetic removeHintSpans$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    .line 2
    and-int/2addr p3, p4

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    move p2, p4

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->removeHintSpans(Landroid/text/Editable;Z)V

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

.method private final setDefaultMask()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksInternal:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-nez v2, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v2, v1

    .line 29
    .line 30
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    move-result v2

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    move-result-object v3

    .line 43
    move-object v4, v3

    .line 44
    .line 45
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 49
    move-result-object v4

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 53
    move-result v4

    .line 54
    .line 55
    if-le v2, v4, :cond_3

    .line 56
    move-object v1, v3

    .line 57
    move v2, v4

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v3

    .line 62
    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    :goto_0
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-direct {p0, v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->prepareMask(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;)V

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

.method private final setMasksInternal(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksInternal:Ljava/util/List;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x1

    .line 10
    xor-int/2addr p1, v0

    .line 11
    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    const/4 p1, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1, v0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->updateInputType$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->prepareMasks()V

    .line 20
    return-void
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic updateInputType$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->updateInputType(Ljava/lang/Integer;)V

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
.end method


# virtual methods
.method public final getMaskListener()Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskListener:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;

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

.method public final getMasksEnabled()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->masksInternal:Ljava/util/List;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    xor-int/2addr v0, v2

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    return v2

    .line 15
    :cond_0
    return v1
    .line 16
    .line 17
.end method

.method public final getRawText()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    return-object v0
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

.method public getText()Landroid/text/Editable;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 2
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$EditableProxy;

    invoke-direct {v1, p0, v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$EditableProxy;-><init>(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/text/Editable;)V

    return-object v1

    :cond_0
    return-object v0
.end method

.method public bridge synthetic getText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    return-object v0
.end method

.method public isSuggestionsEnabled()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0}, Landroid/widget/TextView;->isSuggestionsEnabled()Z

    .line 12
    move-result v0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 2
    .param p1    # Landroid/view/inputmethod/EditorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-super {p0, p1}, Lcom/google/android/material/textfield/TextInputEditText;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    const/4 p1, 0x0

    .line 19
    return-object p1

    .line 20
    .line 21
    :cond_1
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MyInputConnectionWrapper;

    .line 22
    const/4 v1, 0x1

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p0, p1, v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MyInputConnectionWrapper;-><init>(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Landroid/view/inputmethod/InputConnection;Z)V

    .line 26
    return-object v0
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
.end method

.method public onSelectionChanged(II)V
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingAfter:Z

    .line 3
    .line 4
    if-nez v0, :cond_5

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isTextChangingBefore:Z

    .line 7
    .line 8
    if-nez v0, :cond_5

    .line 9
    .line 10
    iget-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isSelectionChanging:Z

    .line 11
    .line 12
    if-nez v0, :cond_5

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getMasksEnabled()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onSelectionChanged(II)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskSymbolPositions:Ljava/util/HashMap;

    .line 26
    .line 27
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->mask:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;->getMask()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v1, v2

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, Ljava/util/List;

    .line 43
    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 52
    move-result v1

    .line 53
    const/4 v3, 0x2

    .line 54
    .line 55
    .line 56
    invoke-static {p0, p1, v2, v3, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 57
    move-result v4

    .line 58
    add-int/2addr v4, v1

    .line 59
    .line 60
    iget-object v1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->raw:Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 64
    move-result v1

    .line 65
    .line 66
    .line 67
    invoke-static {p0, p2, v2, v3, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getSpecialSymbolsInMaskedTextCount$default(Lcom/sumsub/sns/core/widget/SNSTextInputEditText;ILjava/lang/String;ILjava/lang/Object;)I

    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v1

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getStartingPosition()I

    .line 73
    move-result v1

    .line 74
    .line 75
    .line 76
    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    .line 77
    move-result v3

    .line 78
    .line 79
    .line 80
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 81
    move-result v3

    .line 82
    .line 83
    .line 84
    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    .line 85
    move-result v2

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 89
    move-result v1

    .line 90
    .line 91
    .line 92
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 93
    move-result v2

    .line 94
    .line 95
    if-ge v3, v2, :cond_3

    .line 96
    .line 97
    .line 98
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 99
    move-result-object v2

    .line 100
    .line 101
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 105
    move-result v2

    .line 106
    .line 107
    if-gez v2, :cond_3

    .line 108
    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    goto :goto_1

    .line 111
    .line 112
    .line 113
    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 114
    move-result v2

    .line 115
    .line 116
    if-ge v1, v2, :cond_4

    .line 117
    .line 118
    .line 119
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$CharHolder;->getPos()I

    .line 126
    move-result v2

    .line 127
    .line 128
    if-gez v2, :cond_4

    .line 129
    .line 130
    add-int/lit8 v1, v1, 0x1

    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const/4 v0, 0x1

    .line 133
    .line 134
    iput-boolean v0, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isSelectionChanging:Z

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v3, v1}, Landroid/widget/EditText;->setSelection(II)V

    .line 138
    .line 139
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 140
    .line 141
    .line 142
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 143
    move-result-object v5

    .line 144
    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string/jumbo v2, "onSelectionChanged, selStart="

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const-string p1, ", selEnd="

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    const-string p1, ", start="

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    const-string p1, ", end="

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    move-result-object v6

    .line 186
    const/4 v8, 0x4

    .line 187
    const/4 v9, 0x0

    .line 188
    const/4 v7, 0x0

    .line 189
    .line 190
    .line 191
    invoke-static/range {v4 .. v9}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->i$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 192
    const/4 p1, 0x0

    .line 193
    .line 194
    iput-boolean p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->isSelectionChanging:Z

    .line 195
    :cond_5
    :goto_3
    return-void
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

.method public setError(Ljava/lang/CharSequence;)V
    .locals 0
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

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

.method public final setMaskListener(Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;)V
    .locals 0
    .param p1    # Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maskListener:Lcom/sumsub/sns/core/widget/SNSTextInputEditText$MaskListener;

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

.method public final setMasks(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMasksInternal(Ljava/util/List;)V

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

.method public final setMasksString(Ljava/util/List;)V
    .locals 10
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "setMasksString"
    .end annotation

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 10
    move-result v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    move-object v3, v1

    .line 29
    .line 30
    check-cast v3, Ljava/lang/String;

    .line 31
    .line 32
    new-instance v2, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;

    .line 33
    .line 34
    const/16 v8, 0x1e

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v2 .. v9}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText$Mask;-><init>(Ljava/lang/String;ZZZLjava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v0, 0x0

    .line 48
    .line 49
    .line 50
    :cond_1
    invoke-direct {p0, v0}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->setMasksInternal(Ljava/util/List;)V

    .line 51
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
.end method

.method public final setMaxLength(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->maxRawLength:I

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

.method public final updateInputType(Ljava/lang/Integer;)V
    .locals 2
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    const v1, 0x80090

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    move-result p1

    .line 14
    or-int/2addr v1, p1

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setInputType(I)V

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    new-array p1, p1, [Landroid/text/InputFilter;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

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
.end method
