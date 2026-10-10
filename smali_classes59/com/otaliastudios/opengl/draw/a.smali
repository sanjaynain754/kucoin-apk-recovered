.class public abstract Lcom/otaliastudios/opengl/draw/a;
.super Lcom/otaliastudios/opengl/draw/b;
.source "Gl2dDrawable.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0008\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/otaliastudios/opengl/draw/a;",
        "Lcom/otaliastudios/opengl/draw/b;",
        "<init>",
        "()V",
        "Landroid/graphics/RectF;",
        "Lcom/otaliastudios/opengl/geometry/RectF;",
        "rect",
        "",
        "h",
        "(Landroid/graphics/RectF;)V",
        "",
        "f",
        "I",
        "b",
        "()I",
        "coordsPerVertex",
        "library_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final f:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/otaliastudios/opengl/draw/b;-><init>()V

    .line 4
    const/4 v0, 0x2

    .line 5
    .line 6
    iput v0, p0, Lcom/otaliastudios/opengl/draw/a;->f:I

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


# virtual methods
.method public final b()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/otaliastudios/opengl/draw/a;->f:I

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

.method public final h(Landroid/graphics/RectF;)V
    .locals 7
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "rect"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const v0, -0x800001

    .line 10
    .line 11
    .line 12
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v1

    .line 15
    move v4, v2

    .line 16
    move v1, v0

    .line 17
    move v2, v3

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/otaliastudios/opengl/draw/b;->d()Ljava/nio/FloatBuffer;

    .line 21
    move-result-object v5

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    .line 25
    move-result v5

    .line 26
    .line 27
    if-eqz v5, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/otaliastudios/opengl/draw/b;->d()Ljava/nio/FloatBuffer;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5}, Ljava/nio/FloatBuffer;->get()F

    .line 35
    move-result v5

    .line 36
    .line 37
    rem-int/lit8 v6, v4, 0x2

    .line 38
    .line 39
    if-nez v6, :cond_0

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    .line 43
    move-result v2

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 47
    move-result v1

    .line 48
    goto :goto_1

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    .line 52
    move-result v0

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 56
    move-result v3

    .line 57
    .line 58
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/otaliastudios/opengl/draw/b;->d()Ljava/nio/FloatBuffer;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/nio/FloatBuffer;->rewind()Ljava/nio/Buffer;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v2, v0, v1, v3}, Landroid/graphics/RectF;->set(FFFF)V

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
