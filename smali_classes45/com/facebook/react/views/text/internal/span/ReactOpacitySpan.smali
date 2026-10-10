.class public final Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;
.super Landroid/text/style/CharacterStyle;
.source "ReactOpacitySpan.kt"

# interfaces
.implements Landroid/text/style/UpdateAppearance;
.implements Lcom/facebook/react/views/text/internal/span/ReactSpan;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;",
        "Landroid/text/style/CharacterStyle;",
        "Landroid/text/style/UpdateAppearance;",
        "Lcom/facebook/react/views/text/internal/span/ReactSpan;",
        "opacity",
        "",
        "<init>",
        "(F)V",
        "getOpacity",
        "()F",
        "updateDrawState",
        "",
        "paint",
        "Landroid/text/TextPaint;",
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


# instance fields
.field private final opacity:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;->opacity:F

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
.end method


# virtual methods
.method public final getOpacity()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;->opacity:F

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
    .line 18
.end method

.method public updateDrawState(Landroid/text/TextPaint;)V
    .locals 4
    .param p1    # Landroid/text/TextPaint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "paint"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/graphics/Paint;->getColor()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 13
    move-result v0

    .line 14
    int-to-float v0, v0

    .line 15
    .line 16
    iget v1, p0, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;->opacity:F

    .line 17
    mul-float/2addr v0, v1

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 25
    .line 26
    iget v0, p1, Landroid/text/TextPaint;->bgColor:I

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 32
    move-result v0

    .line 33
    int-to-float v0, v0

    .line 34
    .line 35
    iget v1, p0, Lcom/facebook/react/views/text/internal/span/ReactOpacitySpan;->opacity:F

    .line 36
    mul-float/2addr v0, v1

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 40
    move-result v0

    .line 41
    .line 42
    iget v1, p1, Landroid/text/TextPaint;->bgColor:I

    .line 43
    .line 44
    .line 45
    invoke-static {v1}, Landroid/graphics/Color;->red(I)I

    .line 46
    move-result v1

    .line 47
    .line 48
    iget v2, p1, Landroid/text/TextPaint;->bgColor:I

    .line 49
    .line 50
    .line 51
    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    .line 52
    move-result v2

    .line 53
    .line 54
    iget v3, p1, Landroid/text/TextPaint;->bgColor:I

    .line 55
    .line 56
    .line 57
    invoke-static {v3}, Landroid/graphics/Color;->blue(I)I

    .line 58
    move-result v3

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    .line 62
    move-result v0

    .line 63
    .line 64
    iput v0, p1, Landroid/text/TextPaint;->bgColor:I

    .line 65
    :cond_0
    return-void
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
.end method
