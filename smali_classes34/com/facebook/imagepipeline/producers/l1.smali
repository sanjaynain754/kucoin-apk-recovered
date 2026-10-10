.class public final Lcom/facebook/imagepipeline/producers/l1;
.super Ljava/lang/Object;
.source "ThumbnailSizeChecker.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/facebook/imagepipeline/producers/l1;",
        "",
        "<init>",
        "()V",
        "",
        "width",
        "height",
        "Lcom/facebook/imagepipeline/common/ResizeOptions;",
        "resizeOptions",
        "",
        "b",
        "(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z",
        "Lx5/i;",
        "encodedImage",
        "c",
        "(Lx5/i;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z",
        "size",
        "a",
        "(I)I",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/facebook/imagepipeline/producers/l1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/producers/l1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/imagepipeline/producers/l1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/imagepipeline/producers/l1;->a:Lcom/facebook/imagepipeline/producers/l1;

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

.method public constructor <init>()V
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

.method public static final a(I)I
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    int-to-float p0, p0

    .line 2
    .line 3
    .line 4
    const v0, 0x3faaaaab

    .line 5
    mul-float/2addr p0, v0

    .line 6
    float-to-int p0, p0

    .line 7
    return p0
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

.method public static final b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z
    .locals 3
    .param p2    # Lcom/facebook/imagepipeline/common/ResizeOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-nez p2, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/l1;->a(I)I

    .line 8
    move-result p0

    .line 9
    int-to-float p0, p0

    .line 10
    .line 11
    const/high16 p2, 0x45000000    # 2048.0f

    .line 12
    .line 13
    cmpl-float p0, p0, p2

    .line 14
    .line 15
    if-ltz p0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/l1;->a(I)I

    .line 19
    move-result p0

    .line 20
    .line 21
    const/16 p1, 0x800

    .line 22
    .line 23
    if-lt p0, p1, :cond_0

    .line 24
    return v1

    .line 25
    :cond_0
    return v0

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p0}, Lcom/facebook/imagepipeline/producers/l1;->a(I)I

    .line 29
    move-result p0

    .line 30
    .line 31
    iget v2, p2, Lcom/facebook/imagepipeline/common/ResizeOptions;->a:I

    .line 32
    .line 33
    if-lt p0, v2, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/l1;->a(I)I

    .line 37
    move-result p0

    .line 38
    .line 39
    iget p1, p2, Lcom/facebook/imagepipeline/common/ResizeOptions;->b:I

    .line 40
    .line 41
    if-lt p0, p1, :cond_2

    .line 42
    return v1

    .line 43
    :cond_2
    return v0
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
.end method

.method public static final c(Lx5/i;Lcom/facebook/imagepipeline/common/ResizeOptions;)Z
    .locals 2
    .param p0    # Lx5/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Lcom/facebook/imagepipeline/common/ResizeOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Lx5/i;->F()I

    .line 8
    move-result v0

    .line 9
    .line 10
    const/16 v1, 0x5a

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    const/16 v1, 0x10e

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lx5/i;->getWidth()I

    .line 20
    move-result v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lx5/i;->getHeight()I

    .line 24
    move-result p0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/l1;->b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 28
    move-result p0

    .line 29
    return p0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Lx5/i;->getHeight()I

    .line 33
    move-result v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lx5/i;->getWidth()I

    .line 37
    move-result p0

    .line 38
    .line 39
    .line 40
    invoke-static {v0, p0, p1}, Lcom/facebook/imagepipeline/producers/l1;->b(IILcom/facebook/imagepipeline/common/ResizeOptions;)Z

    .line 41
    move-result p0

    .line 42
    return p0
.end method
