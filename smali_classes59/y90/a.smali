.class public Ly90/a;
.super Ljava/lang/Object;
.source "AtMostResizer.java"

# interfaces
.implements Ly90/d;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Ly90/a;->a:I

    const p1, 0x7fffffff

    .line 3
    iput p1, p0, Ly90/a;->b:I

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Ly90/a;->a:I

    .line 6
    iput p2, p0, Ly90/a;->b:I

    return-void
.end method


# virtual methods
.method public a(Lr90/b;)Lr90/b;
    .locals 3
    .param p1    # Lr90/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lr90/b;->b()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget v1, p0, Ly90/a;->a:I

    .line 7
    .line 8
    if-gt v0, v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lr90/b;->a()I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget v1, p0, Ly90/a;->b:I

    .line 15
    .line 16
    if-gt v0, v1, :cond_0

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Lr90/b;->b()I

    .line 21
    move-result v0

    .line 22
    int-to-float v0, v0

    .line 23
    .line 24
    iget v1, p0, Ly90/a;->a:I

    .line 25
    int-to-float v1, v1

    .line 26
    div-float/2addr v0, v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lr90/b;->a()I

    .line 30
    move-result v1

    .line 31
    int-to-float v1, v1

    .line 32
    .line 33
    iget v2, p0, Ly90/a;->b:I

    .line 34
    int-to-float v2, v2

    .line 35
    div-float/2addr v1, v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lr90/b;->b()I

    .line 39
    move-result v2

    .line 40
    int-to-float v2, v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lr90/b;->a()I

    .line 44
    move-result p1

    .line 45
    int-to-float p1, p1

    .line 46
    div-float/2addr v2, p1

    .line 47
    .line 48
    cmpl-float p1, v1, v0

    .line 49
    .line 50
    if-ltz p1, :cond_1

    .line 51
    .line 52
    iget p1, p0, Ly90/a;->b:I

    .line 53
    int-to-float v0, p1

    .line 54
    mul-float/2addr v0, v2

    .line 55
    float-to-int v0, v0

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_1
    iget v0, p0, Ly90/a;->a:I

    .line 59
    int-to-float p1, v0

    .line 60
    div-float/2addr p1, v2

    .line 61
    float-to-int p1, p1

    .line 62
    .line 63
    :goto_0
    rem-int/lit8 v1, v0, 0x2

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    add-int/lit8 v0, v0, -0x1

    .line 68
    .line 69
    :cond_2
    rem-int/lit8 v1, p1, 0x2

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    add-int/lit8 p1, p1, -0x1

    .line 74
    .line 75
    :cond_3
    new-instance v1, Lr90/b;

    .line 76
    .line 77
    .line 78
    invoke-direct {v1, v0, p1}, Lr90/b;-><init>(II)V

    .line 79
    return-object v1
    .line 80
    .line 81
.end method
