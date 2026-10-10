.class public Lg2/g;
.super Ljava/lang/Object;
.source "GifFrameLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg2/g$d;,
        Lg2/g$a;,
        Lg2/g$c;,
        Lg2/g$b;
    }
.end annotation


# instance fields
.field public final a:Lr1/a;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg2/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/bumptech/glide/h;

.field public final e:Lw1/d;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Lcom/bumptech/glide/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/g<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lg2/g$a;

.field public k:Z

.field public l:Lg2/g$a;

.field public m:Landroid/graphics/Bitmap;

.field public n:Lt1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lg2/g$a;

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/c;Lr1/a;IILt1/h;Landroid/graphics/Bitmap;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/c;",
            "Lr1/a;",
            "II",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/bumptech/glide/c;->f()Lw1/d;

    move-result-object v1

    .line 2
    invoke-virtual {p1}, Lcom/bumptech/glide/c;->h()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/c;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object v2

    .line 3
    invoke-virtual {p1}, Lcom/bumptech/glide/c;->h()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/c;->t(Landroid/content/Context;)Lcom/bumptech/glide/h;

    move-result-object p1

    invoke-static {p1, p3, p4}, Lg2/g;->j(Lcom/bumptech/glide/h;II)Lcom/bumptech/glide/g;

    move-result-object v5

    const/4 v4, 0x0

    move-object v0, p0

    move-object v3, p2

    move-object v6, p5

    move-object v7, p6

    .line 4
    invoke-direct/range {v0 .. v7}, Lg2/g;-><init>(Lw1/d;Lcom/bumptech/glide/h;Lr1/a;Landroid/os/Handler;Lcom/bumptech/glide/g;Lt1/h;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public constructor <init>(Lw1/d;Lcom/bumptech/glide/h;Lr1/a;Landroid/os/Handler;Lcom/bumptech/glide/g;Lt1/h;Landroid/graphics/Bitmap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw1/d;",
            "Lcom/bumptech/glide/h;",
            "Lr1/a;",
            "Landroid/os/Handler;",
            "Lcom/bumptech/glide/g<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg2/g;->c:Ljava/util/List;

    .line 7
    iput-object p2, p0, Lg2/g;->d:Lcom/bumptech/glide/h;

    if-nez p4, :cond_0

    .line 8
    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    new-instance v0, Lg2/g$c;

    invoke-direct {v0, p0}, Lg2/g$c;-><init>(Lg2/g;)V

    invoke-direct {p4, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 9
    :cond_0
    iput-object p1, p0, Lg2/g;->e:Lw1/d;

    .line 10
    iput-object p4, p0, Lg2/g;->b:Landroid/os/Handler;

    .line 11
    iput-object p5, p0, Lg2/g;->i:Lcom/bumptech/glide/g;

    .line 12
    iput-object p3, p0, Lg2/g;->a:Lr1/a;

    .line 13
    invoke-virtual {p0, p6, p7}, Lg2/g;->p(Lt1/h;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static g()Lt1/b;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lo2/d;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Lo2/d;-><init>(Ljava/lang/Object;)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public static j(Lcom/bumptech/glide/h;II)Lcom/bumptech/glide/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/h;",
            "II)",
            "Lcom/bumptech/glide/g<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->d()Lcom/bumptech/glide/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    sget-object v0, Lv1/c;->b:Lv1/c;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ll2/f;->v0(Lv1/c;)Ll2/f;

    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ll2/a;->r0(Z)Ll2/a;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Ll2/f;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ll2/a;->l0(Z)Ll2/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ll2/f;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1, p2}, Ll2/a;->a0(II)Ll2/a;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
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
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lg2/g;->o()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lg2/g;->r()V

    .line 12
    .line 13
    iget-object v0, p0, Lg2/g;->j:Lg2/g$a;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Lg2/g;->d:Lcom/bumptech/glide/h;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, Lcom/bumptech/glide/h;->n(Lm2/j;)V

    .line 22
    .line 23
    iput-object v1, p0, Lg2/g;->j:Lg2/g$a;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lg2/g;->l:Lg2/g$a;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object v2, p0, Lg2/g;->d:Lcom/bumptech/glide/h;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v0}, Lcom/bumptech/glide/h;->n(Lm2/j;)V

    .line 33
    .line 34
    iput-object v1, p0, Lg2/g;->l:Lg2/g$a;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lg2/g;->o:Lg2/g$a;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lg2/g;->d:Lcom/bumptech/glide/h;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Lcom/bumptech/glide/h;->n(Lm2/j;)V

    .line 44
    .line 45
    iput-object v1, p0, Lg2/g;->o:Lg2/g$a;

    .line 46
    .line 47
    :cond_2
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Lr1/a;->clear()V

    .line 51
    const/4 v0, 0x1

    .line 52
    .line 53
    iput-boolean v0, p0, Lg2/g;->k:Z

    .line 54
    return-void
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
.end method

.method public b()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lr1/a;->getData()Ljava/nio/ByteBuffer;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public c()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->j:Lg2/g$a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lg2/g$a;->b()Landroid/graphics/Bitmap;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lg2/g;->m:Landroid/graphics/Bitmap;

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->j:Lg2/g$a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget v0, v0, Lg2/g$a;->f:I

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, -0x1

    .line 9
    return v0
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

.method public e()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->m:Landroid/graphics/Bitmap;

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
    .line 18
.end method

.method public f()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lr1/a;->a()I

    .line 6
    move-result v0

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
    .line 18
.end method

.method public h()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lg2/g;->r:I

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

.method public i()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lr1/a;->h()I

    .line 6
    move-result v0

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
    .line 18
.end method

.method public k()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lr1/a;->e()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Lg2/g;->p:I

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public l()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lg2/g;->q:I

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

.method public final m()V
    .locals 5

    .line 1
    .line 2
    iget-boolean v0, p0, Lg2/g;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-boolean v0, p0, Lg2/g;->g:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_1

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lg2/g;->h:Z

    .line 12
    const/4 v1, 0x1

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lg2/g;->o:Lg2/g$a;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    move v0, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move v0, v2

    .line 23
    .line 24
    :goto_0
    const-string v3, "Pending target must be null when starting from the first frame"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v3}, Lp2/j;->a(ZLjava/lang/String;)V

    .line 28
    .line 29
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 30
    .line 31
    .line 32
    invoke-interface {v0}, Lr1/a;->c()V

    .line 33
    .line 34
    iput-boolean v2, p0, Lg2/g;->h:Z

    .line 35
    .line 36
    :cond_2
    iget-object v0, p0, Lg2/g;->o:Lg2/g$a;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    iput-object v1, p0, Lg2/g;->o:Lg2/g$a;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Lg2/g;->n(Lg2/g$a;)V

    .line 45
    return-void

    .line 46
    .line 47
    :cond_3
    iput-boolean v1, p0, Lg2/g;->g:Z

    .line 48
    .line 49
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0}, Lr1/a;->i()I

    .line 53
    move-result v0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 57
    move-result-wide v1

    .line 58
    int-to-long v3, v0

    .line 59
    add-long/2addr v1, v3

    .line 60
    .line 61
    iget-object v0, p0, Lg2/g;->a:Lr1/a;

    .line 62
    .line 63
    .line 64
    invoke-interface {v0}, Lr1/a;->g()V

    .line 65
    .line 66
    new-instance v0, Lg2/g$a;

    .line 67
    .line 68
    iget-object v3, p0, Lg2/g;->b:Landroid/os/Handler;

    .line 69
    .line 70
    iget-object v4, p0, Lg2/g;->a:Lr1/a;

    .line 71
    .line 72
    .line 73
    invoke-interface {v4}, Lr1/a;->d()I

    .line 74
    move-result v4

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v3, v4, v1, v2}, Lg2/g$a;-><init>(Landroid/os/Handler;IJ)V

    .line 78
    .line 79
    iput-object v0, p0, Lg2/g;->l:Lg2/g$a;

    .line 80
    .line 81
    iget-object v0, p0, Lg2/g;->i:Lcom/bumptech/glide/g;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lg2/g;->g()Lt1/b;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    .line 88
    invoke-static {v1}, Ll2/f;->x0(Lt1/b;)Ll2/f;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    iget-object v1, p0, Lg2/g;->a:Lr1/a;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->K0(Ljava/lang/Object;)Lcom/bumptech/glide/g;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    iget-object v1, p0, Lg2/g;->l:Lg2/g$a;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/g;->B0(Lm2/j;)Lm2/j;

    .line 105
    :cond_4
    :goto_1
    return-void
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
.end method

.method public n(Lg2/g$a;)V
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lg2/g;->g:Z

    .line 4
    .line 5
    iget-boolean v0, p0, Lg2/g;->k:Z

    .line 6
    const/4 v1, 0x2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lg2/g;->b:Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 18
    return-void

    .line 19
    .line 20
    :cond_0
    iget-boolean v0, p0, Lg2/g;->f:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-boolean v0, p0, Lg2/g;->h:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object v0, p0, Lg2/g;->b:Landroid/os/Handler;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_1
    iput-object p1, p0, Lg2/g;->o:Lg2/g$a;

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p1}, Lg2/g$a;->b()Landroid/graphics/Bitmap;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lg2/g;->o()V

    .line 49
    .line 50
    iget-object v0, p0, Lg2/g;->j:Lg2/g$a;

    .line 51
    .line 52
    iput-object p1, p0, Lg2/g;->j:Lg2/g$a;

    .line 53
    .line 54
    iget-object p1, p0, Lg2/g;->c:Ljava/util/List;

    .line 55
    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 58
    move-result p1

    .line 59
    .line 60
    add-int/lit8 p1, p1, -0x1

    .line 61
    .line 62
    :goto_0
    if-ltz p1, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, Lg2/g;->c:Ljava/util/List;

    .line 65
    .line 66
    .line 67
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    check-cast v2, Lg2/g$b;

    .line 71
    .line 72
    .line 73
    invoke-interface {v2}, Lg2/g$b;->a()V

    .line 74
    .line 75
    add-int/lit8 p1, p1, -0x1

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_3
    if-eqz v0, :cond_4

    .line 79
    .line 80
    iget-object p1, p0, Lg2/g;->b:Landroid/os/Handler;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0}, Lg2/g;->m()V

    .line 91
    return-void
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
.end method

.method public final o()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->m:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lg2/g;->e:Lw1/d;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1, v0}, Lw1/d;->b(Landroid/graphics/Bitmap;)V

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-object v0, p0, Lg2/g;->m:Landroid/graphics/Bitmap;

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public p(Lt1/h;Landroid/graphics/Bitmap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lt1/h;

    .line 7
    .line 8
    iput-object v0, p0, Lg2/g;->n:Lt1/h;

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Landroid/graphics/Bitmap;

    .line 15
    .line 16
    iput-object v0, p0, Lg2/g;->m:Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iget-object v0, p0, Lg2/g;->i:Lcom/bumptech/glide/g;

    .line 19
    .line 20
    new-instance v1, Ll2/f;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Ll2/f;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ll2/a;->o0(Lt1/h;)Ll2/a;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/g;->t0(Ll2/a;)Lcom/bumptech/glide/g;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lg2/g;->i:Lcom/bumptech/glide/g;

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Lp2/k;->h(Landroid/graphics/Bitmap;)I

    .line 37
    move-result p1

    .line 38
    .line 39
    iput p1, p0, Lg2/g;->p:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 43
    move-result p1

    .line 44
    .line 45
    iput p1, p0, Lg2/g;->q:I

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 49
    move-result p1

    .line 50
    .line 51
    iput p1, p0, Lg2/g;->r:I

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
.end method

.method public final q()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lg2/g;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Lg2/g;->f:Z

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-boolean v0, p0, Lg2/g;->k:Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lg2/g;->m()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
.end method

.method public final r()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lg2/g;->f:Z

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

.method public s(Lg2/g$b;)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lg2/g;->k:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Lg2/g;->c:Ljava/util/List;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Lg2/g;->c:Ljava/util/List;

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    iget-object v1, p0, Lg2/g;->c:Ljava/util/List;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lg2/g;->q()V

    .line 29
    :cond_0
    return-void

    .line 30
    .line 31
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "Cannot subscribe twice in a row"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1

    .line 38
    .line 39
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v0, "Cannot subscribe to a cleared frame loader"

    .line 42
    .line 43
    .line 44
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 45
    throw p1
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
.end method

.method public setOnEveryFrameReadyListener(Lg2/g$d;)V
    .locals 0
    .param p1    # Lg2/g$d;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public t(Lg2/g$b;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lg2/g;->c:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    iget-object p1, p0, Lg2/g;->c:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lg2/g;->r()V

    .line 17
    :cond_0
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method
