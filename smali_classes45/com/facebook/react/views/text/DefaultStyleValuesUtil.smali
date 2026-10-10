.class public final Lcom/facebook/react/views/text/DefaultStyleValuesUtil;
.super Ljava/lang/Object;
.source "DefaultStyleValuesUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\nH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/react/views/text/DefaultStyleValuesUtil;",
        "",
        "<init>",
        "()V",
        "getDefaultTextColorHint",
        "Landroid/content/res/ColorStateList;",
        "context",
        "Landroid/content/Context;",
        "getDefaultTextColor",
        "getDefaultTextColorHighlight",
        "",
        "getDefaultTextAttribute",
        "attribute",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDefaultStyleValuesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultStyleValuesUtil.kt\ncom/facebook/react/views/text/DefaultStyleValuesUtil\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,54:1\n233#2,3:55\n*S KotlinDebug\n*F\n+ 1 DefaultStyleValuesUtil.kt\ncom/facebook/react/views/text/DefaultStyleValuesUtil\n*L\n49#1:55,3\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/views/text/DefaultStyleValuesUtil;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->INSTANCE:Lcom/facebook/react/views/text/DefaultStyleValuesUtil;

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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method private final getDefaultTextAttribute(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    filled-new-array {p2}, [I

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string p2, "obtainStyledAttributes(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    const/4 p2, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 22
    move-result-object p1

    .line 23
    return-object p1
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
.end method

.method public static final getDefaultTextColor(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->INSTANCE:Lcom/facebook/react/views/text/DefaultStyleValuesUtil;

    .line 8
    .line 9
    .line 10
    const v1, 0x1010098

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getDefaultTextAttribute(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final getDefaultTextColorHighlight(Landroid/content/Context;)I
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->INSTANCE:Lcom/facebook/react/views/text/DefaultStyleValuesUtil;

    .line 8
    .line 9
    .line 10
    const v1, 0x1010099

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getDefaultTextAttribute(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static final getDefaultTextColorHint(Landroid/content/Context;)Landroid/content/res/ColorStateList;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->INSTANCE:Lcom/facebook/react/views/text/DefaultStyleValuesUtil;

    .line 8
    .line 9
    .line 10
    const v1, 0x101009a

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lcom/facebook/react/views/text/DefaultStyleValuesUtil;->getDefaultTextAttribute(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 14
    move-result-object p0

    .line 15
    return-object p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
