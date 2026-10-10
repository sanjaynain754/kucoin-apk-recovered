.class public abstract Ll2/a;
.super Ljava/lang/Object;
.source "BaseRequestOptions.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ll2/a<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# instance fields
.field public A:Z

.field public b:I

.field public c:F

.field public d:Lv1/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public e:Lcom/bumptech/glide/Priority;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public f:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public g:I

.field public h:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public i:I

.field public j:Z

.field public k:I

.field public l:I

.field public m:Lt1/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public n:Z

.field public o:Z

.field public p:Landroid/graphics/drawable/Drawable;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public q:I

.field public r:Lt1/e;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public s:Ljava/util/Map;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lt1/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field public t:Ljava/lang/Class;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public u:Z

.field public v:Landroid/content/res/Resources$Theme;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    iput v0, p0, Ll2/a;->c:F

    .line 8
    .line 9
    sget-object v0, Lv1/c;->e:Lv1/c;

    .line 10
    .line 11
    iput-object v0, p0, Ll2/a;->d:Lv1/c;

    .line 12
    .line 13
    sget-object v0, Lcom/bumptech/glide/Priority;->NORMAL:Lcom/bumptech/glide/Priority;

    .line 14
    .line 15
    iput-object v0, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 16
    const/4 v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Ll2/a;->j:Z

    .line 19
    const/4 v1, -0x1

    .line 20
    .line 21
    iput v1, p0, Ll2/a;->k:I

    .line 22
    .line 23
    iput v1, p0, Ll2/a;->l:I

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lo2/c;->c()Lo2/c;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    iput-object v1, p0, Ll2/a;->m:Lt1/b;

    .line 30
    .line 31
    iput-boolean v0, p0, Ll2/a;->o:Z

    .line 32
    .line 33
    new-instance v1, Lt1/e;

    .line 34
    .line 35
    .line 36
    invoke-direct {v1}, Lt1/e;-><init>()V

    .line 37
    .line 38
    iput-object v1, p0, Ll2/a;->r:Lt1/e;

    .line 39
    .line 40
    new-instance v1, Lp2/b;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1}, Lp2/b;-><init>()V

    .line 44
    .line 45
    iput-object v1, p0, Ll2/a;->s:Ljava/util/Map;

    .line 46
    .line 47
    const-class v1, Ljava/lang/Object;

    .line 48
    .line 49
    iput-object v1, p0, Ll2/a;->t:Ljava/lang/Class;

    .line 50
    .line 51
    iput-boolean v0, p0, Ll2/a;->z:Z

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
.end method

.method public static O(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

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
.end method


# virtual methods
.method public final A()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->i:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final B()Lcom/bumptech/glide/Priority;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final C()Ljava/lang/Class;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->t:Ljava/lang/Class;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final D()Lt1/b;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->m:Lt1/b;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final E()F
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->c:F

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final F()Landroid/content/res/Resources$Theme;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->v:Landroid/content/res/Resources$Theme;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final G()Ljava/util/Map;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lt1/h<",
            "*>;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final H()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->A:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final I()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->x:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final J()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final K()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->j:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final L()Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ll2/a;->N(I)Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public M()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->z:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final N(I)Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->b:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Ll2/a;->O(II)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public final P()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->o:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final Q()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->n:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final R()Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x800

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ll2/a;->N(I)Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final S()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->l:I

    .line 3
    .line 4
    iget v1, p0, Ll2/a;->k:I

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lp2/k;->u(II)Z

    .line 8
    move-result v0

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public T()Ll2/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Ll2/a;->u:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ll2/a;->g0()Ll2/a;

    .line 7
    move-result-object v0

    .line 8
    return-object v0
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
.end method

.method public U()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/j;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/j;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->Y(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public V()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->d:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/k;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/k;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->X(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public W()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->c:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/u;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/u;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->X(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public final X(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, v0}, Ll2/a;->f0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;Z)Ll2/a;

    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
.end method

.method public final Y(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ll2/a;->Y(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Ll2/a;->k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Ll2/a;

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p2, p1}, Ll2/a;->p0(Lt1/h;Z)Ll2/a;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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
.end method

.method public Z(I)Ll2/a;
    .locals 0
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p1}, Ll2/a;->a0(II)Ll2/a;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public a(Ll2/a;)Ll2/a;
    .locals 4
    .param p1    # Ll2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll2/a<",
            "*>;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->a(Ll2/a;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iget v0, p1, Ll2/a;->b:I

    .line 16
    const/4 v1, 0x2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget v0, p1, Ll2/a;->c:F

    .line 25
    .line 26
    iput v0, p0, Ll2/a;->c:F

    .line 27
    .line 28
    :cond_1
    iget v0, p1, Ll2/a;->b:I

    .line 29
    .line 30
    const/high16 v1, 0x40000

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 34
    move-result v0

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-boolean v0, p1, Ll2/a;->x:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Ll2/a;->x:Z

    .line 41
    .line 42
    :cond_2
    iget v0, p1, Ll2/a;->b:I

    .line 43
    .line 44
    const/high16 v1, 0x100000

    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-boolean v0, p1, Ll2/a;->A:Z

    .line 53
    .line 54
    iput-boolean v0, p0, Ll2/a;->A:Z

    .line 55
    .line 56
    :cond_3
    iget v0, p1, Ll2/a;->b:I

    .line 57
    const/4 v1, 0x4

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    iget-object v0, p1, Ll2/a;->d:Lv1/c;

    .line 66
    .line 67
    iput-object v0, p0, Ll2/a;->d:Lv1/c;

    .line 68
    .line 69
    :cond_4
    iget v0, p1, Ll2/a;->b:I

    .line 70
    .line 71
    const/16 v1, 0x8

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 75
    move-result v0

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    iget-object v0, p1, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 80
    .line 81
    iput-object v0, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 82
    .line 83
    :cond_5
    iget v0, p1, Ll2/a;->b:I

    .line 84
    .line 85
    const/16 v1, 0x10

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, Ll2/a;->O(II)Z

    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x0

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    iget-object v0, p1, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 95
    .line 96
    iput-object v0, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 97
    .line 98
    iput v1, p0, Ll2/a;->g:I

    .line 99
    .line 100
    iget v0, p0, Ll2/a;->b:I

    .line 101
    .line 102
    and-int/lit8 v0, v0, -0x21

    .line 103
    .line 104
    iput v0, p0, Ll2/a;->b:I

    .line 105
    .line 106
    :cond_6
    iget v0, p1, Ll2/a;->b:I

    .line 107
    .line 108
    const/16 v2, 0x20

    .line 109
    .line 110
    .line 111
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 112
    move-result v0

    .line 113
    const/4 v2, 0x0

    .line 114
    .line 115
    if-eqz v0, :cond_7

    .line 116
    .line 117
    iget v0, p1, Ll2/a;->g:I

    .line 118
    .line 119
    iput v0, p0, Ll2/a;->g:I

    .line 120
    .line 121
    iput-object v2, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    iget v0, p0, Ll2/a;->b:I

    .line 124
    .line 125
    and-int/lit8 v0, v0, -0x11

    .line 126
    .line 127
    iput v0, p0, Ll2/a;->b:I

    .line 128
    .line 129
    :cond_7
    iget v0, p1, Ll2/a;->b:I

    .line 130
    .line 131
    const/16 v3, 0x40

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 135
    move-result v0

    .line 136
    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    iget-object v0, p1, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 140
    .line 141
    iput-object v0, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    iput v1, p0, Ll2/a;->i:I

    .line 144
    .line 145
    iget v0, p0, Ll2/a;->b:I

    .line 146
    .line 147
    and-int/lit16 v0, v0, -0x81

    .line 148
    .line 149
    iput v0, p0, Ll2/a;->b:I

    .line 150
    .line 151
    :cond_8
    iget v0, p1, Ll2/a;->b:I

    .line 152
    .line 153
    const/16 v3, 0x80

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 157
    move-result v0

    .line 158
    .line 159
    if-eqz v0, :cond_9

    .line 160
    .line 161
    iget v0, p1, Ll2/a;->i:I

    .line 162
    .line 163
    iput v0, p0, Ll2/a;->i:I

    .line 164
    .line 165
    iput-object v2, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 166
    .line 167
    iget v0, p0, Ll2/a;->b:I

    .line 168
    .line 169
    and-int/lit8 v0, v0, -0x41

    .line 170
    .line 171
    iput v0, p0, Ll2/a;->b:I

    .line 172
    .line 173
    :cond_9
    iget v0, p1, Ll2/a;->b:I

    .line 174
    .line 175
    const/16 v3, 0x100

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 179
    move-result v0

    .line 180
    .line 181
    if-eqz v0, :cond_a

    .line 182
    .line 183
    iget-boolean v0, p1, Ll2/a;->j:Z

    .line 184
    .line 185
    iput-boolean v0, p0, Ll2/a;->j:Z

    .line 186
    .line 187
    :cond_a
    iget v0, p1, Ll2/a;->b:I

    .line 188
    .line 189
    const/16 v3, 0x200

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 193
    move-result v0

    .line 194
    .line 195
    if-eqz v0, :cond_b

    .line 196
    .line 197
    iget v0, p1, Ll2/a;->l:I

    .line 198
    .line 199
    iput v0, p0, Ll2/a;->l:I

    .line 200
    .line 201
    iget v0, p1, Ll2/a;->k:I

    .line 202
    .line 203
    iput v0, p0, Ll2/a;->k:I

    .line 204
    .line 205
    :cond_b
    iget v0, p1, Ll2/a;->b:I

    .line 206
    .line 207
    const/16 v3, 0x400

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 211
    move-result v0

    .line 212
    .line 213
    if-eqz v0, :cond_c

    .line 214
    .line 215
    iget-object v0, p1, Ll2/a;->m:Lt1/b;

    .line 216
    .line 217
    iput-object v0, p0, Ll2/a;->m:Lt1/b;

    .line 218
    .line 219
    :cond_c
    iget v0, p1, Ll2/a;->b:I

    .line 220
    .line 221
    const/16 v3, 0x1000

    .line 222
    .line 223
    .line 224
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 225
    move-result v0

    .line 226
    .line 227
    if-eqz v0, :cond_d

    .line 228
    .line 229
    iget-object v0, p1, Ll2/a;->t:Ljava/lang/Class;

    .line 230
    .line 231
    iput-object v0, p0, Ll2/a;->t:Ljava/lang/Class;

    .line 232
    .line 233
    :cond_d
    iget v0, p1, Ll2/a;->b:I

    .line 234
    .line 235
    const/16 v3, 0x2000

    .line 236
    .line 237
    .line 238
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 239
    move-result v0

    .line 240
    .line 241
    if-eqz v0, :cond_e

    .line 242
    .line 243
    iget-object v0, p1, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 244
    .line 245
    iput-object v0, p0, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 246
    .line 247
    iput v1, p0, Ll2/a;->q:I

    .line 248
    .line 249
    iget v0, p0, Ll2/a;->b:I

    .line 250
    .line 251
    and-int/lit16 v0, v0, -0x4001

    .line 252
    .line 253
    iput v0, p0, Ll2/a;->b:I

    .line 254
    .line 255
    :cond_e
    iget v0, p1, Ll2/a;->b:I

    .line 256
    .line 257
    const/16 v3, 0x4000

    .line 258
    .line 259
    .line 260
    invoke-static {v0, v3}, Ll2/a;->O(II)Z

    .line 261
    move-result v0

    .line 262
    .line 263
    if-eqz v0, :cond_f

    .line 264
    .line 265
    iget v0, p1, Ll2/a;->q:I

    .line 266
    .line 267
    iput v0, p0, Ll2/a;->q:I

    .line 268
    .line 269
    iput-object v2, p0, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 270
    .line 271
    iget v0, p0, Ll2/a;->b:I

    .line 272
    .line 273
    and-int/lit16 v0, v0, -0x2001

    .line 274
    .line 275
    iput v0, p0, Ll2/a;->b:I

    .line 276
    .line 277
    :cond_f
    iget v0, p1, Ll2/a;->b:I

    .line 278
    .line 279
    .line 280
    const v2, 0x8000

    .line 281
    .line 282
    .line 283
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 284
    move-result v0

    .line 285
    .line 286
    if-eqz v0, :cond_10

    .line 287
    .line 288
    iget-object v0, p1, Ll2/a;->v:Landroid/content/res/Resources$Theme;

    .line 289
    .line 290
    iput-object v0, p0, Ll2/a;->v:Landroid/content/res/Resources$Theme;

    .line 291
    .line 292
    :cond_10
    iget v0, p1, Ll2/a;->b:I

    .line 293
    .line 294
    const/high16 v2, 0x10000

    .line 295
    .line 296
    .line 297
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 298
    move-result v0

    .line 299
    .line 300
    if-eqz v0, :cond_11

    .line 301
    .line 302
    iget-boolean v0, p1, Ll2/a;->o:Z

    .line 303
    .line 304
    iput-boolean v0, p0, Ll2/a;->o:Z

    .line 305
    .line 306
    :cond_11
    iget v0, p1, Ll2/a;->b:I

    .line 307
    .line 308
    const/high16 v2, 0x20000

    .line 309
    .line 310
    .line 311
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 312
    move-result v0

    .line 313
    .line 314
    if-eqz v0, :cond_12

    .line 315
    .line 316
    iget-boolean v0, p1, Ll2/a;->n:Z

    .line 317
    .line 318
    iput-boolean v0, p0, Ll2/a;->n:Z

    .line 319
    .line 320
    :cond_12
    iget v0, p1, Ll2/a;->b:I

    .line 321
    .line 322
    const/16 v2, 0x800

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 326
    move-result v0

    .line 327
    .line 328
    if-eqz v0, :cond_13

    .line 329
    .line 330
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

    .line 331
    .line 332
    iget-object v2, p1, Ll2/a;->s:Ljava/util/Map;

    .line 333
    .line 334
    .line 335
    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 336
    .line 337
    iget-boolean v0, p1, Ll2/a;->z:Z

    .line 338
    .line 339
    iput-boolean v0, p0, Ll2/a;->z:Z

    .line 340
    .line 341
    :cond_13
    iget v0, p1, Ll2/a;->b:I

    .line 342
    .line 343
    const/high16 v2, 0x80000

    .line 344
    .line 345
    .line 346
    invoke-static {v0, v2}, Ll2/a;->O(II)Z

    .line 347
    move-result v0

    .line 348
    .line 349
    if-eqz v0, :cond_14

    .line 350
    .line 351
    iget-boolean v0, p1, Ll2/a;->y:Z

    .line 352
    .line 353
    iput-boolean v0, p0, Ll2/a;->y:Z

    .line 354
    .line 355
    :cond_14
    iget-boolean v0, p0, Ll2/a;->o:Z

    .line 356
    .line 357
    if-nez v0, :cond_15

    .line 358
    .line 359
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

    .line 360
    .line 361
    .line 362
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 363
    .line 364
    iget v0, p0, Ll2/a;->b:I

    .line 365
    .line 366
    iput-boolean v1, p0, Ll2/a;->n:Z

    .line 367
    .line 368
    .line 369
    const v1, -0x20801

    .line 370
    and-int/2addr v0, v1

    .line 371
    .line 372
    iput v0, p0, Ll2/a;->b:I

    .line 373
    const/4 v0, 0x1

    .line 374
    .line 375
    iput-boolean v0, p0, Ll2/a;->z:Z

    .line 376
    .line 377
    :cond_15
    iget v0, p0, Ll2/a;->b:I

    .line 378
    .line 379
    iget v1, p1, Ll2/a;->b:I

    .line 380
    or-int/2addr v0, v1

    .line 381
    .line 382
    iput v0, p0, Ll2/a;->b:I

    .line 383
    .line 384
    iget-object v0, p0, Ll2/a;->r:Lt1/e;

    .line 385
    .line 386
    iget-object p1, p1, Ll2/a;->r:Lt1/e;

    .line 387
    .line 388
    .line 389
    invoke-virtual {v0, p1}, Lt1/e;->d(Lt1/e;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 393
    move-result-object p1

    .line 394
    return-object p1
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
.end method

.method public a0(II)Ll2/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ll2/a;->a0(II)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput p1, p0, Ll2/a;->l:I

    .line 16
    .line 17
    iput p2, p0, Ll2/a;->k:I

    .line 18
    .line 19
    iget p1, p0, Ll2/a;->b:I

    .line 20
    .line 21
    or-int/lit16 p1, p1, 0x200

    .line 22
    .line 23
    iput p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
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
.end method

.method public b()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->u:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    throw v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    .line 20
    iput-boolean v0, p0, Ll2/a;->w:Z

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ll2/a;->T()Ll2/a;

    .line 24
    move-result-object v0

    .line 25
    return-object v0
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
.end method

.method public b0(I)Ll2/a;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->b0(I)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput p1, p0, Ll2/a;->i:I

    .line 16
    .line 17
    iget p1, p0, Ll2/a;->b:I

    .line 18
    .line 19
    or-int/lit16 p1, p1, 0x80

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    and-int/lit8 p1, p1, -0x41

    .line 25
    .line 26
    iput p1, p0, Ll2/a;->b:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public c()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/j;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/j;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->m0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public c0(Landroid/graphics/drawable/Drawable;)Ll2/a;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->c0(Landroid/graphics/drawable/Drawable;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget p1, p0, Ll2/a;->b:I

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x40

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput v0, p0, Ll2/a;->i:I

    .line 23
    .line 24
    and-int/lit16 p1, p1, -0x81

    .line 25
    .line 26
    iput p1, p0, Ll2/a;->b:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public d()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->d:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/k;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/k;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->e0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public d0(Lcom/bumptech/glide/Priority;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/Priority;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/Priority;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->d0(Lcom/bumptech/glide/Priority;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lcom/bumptech/glide/Priority;

    .line 20
    .line 21
    iput-object p1, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 22
    .line 23
    iget p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    or-int/lit8 p1, p1, 0x8

    .line 26
    .line 27
    iput p1, p0, Ll2/a;->b:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public e()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->d:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/l;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/l;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->m0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public final e0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, v0}, Ll2/a;->f0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;Z)Ll2/a;

    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Ll2/a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Ll2/a;

    .line 8
    .line 9
    iget v0, p1, Ll2/a;->c:F

    .line 10
    .line 11
    iget v2, p0, Ll2/a;->c:F

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, Ljava/lang/Float;->compare(FF)I

    .line 15
    move-result v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget v0, p0, Ll2/a;->g:I

    .line 20
    .line 21
    iget v2, p1, Ll2/a;->g:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    iget-object v2, p1, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lp2/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget v0, p0, Ll2/a;->i:I

    .line 36
    .line 37
    iget v2, p1, Ll2/a;->i:I

    .line 38
    .line 39
    if-ne v0, v2, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 42
    .line 43
    iget-object v2, p1, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2}, Lp2/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    iget v0, p0, Ll2/a;->q:I

    .line 52
    .line 53
    iget v2, p1, Ll2/a;->q:I

    .line 54
    .line 55
    if-ne v0, v2, :cond_0

    .line 56
    .line 57
    iget-object v0, p0, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 58
    .line 59
    iget-object v2, p1, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v2}, Lp2/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    iget-boolean v0, p0, Ll2/a;->j:Z

    .line 68
    .line 69
    iget-boolean v2, p1, Ll2/a;->j:Z

    .line 70
    .line 71
    if-ne v0, v2, :cond_0

    .line 72
    .line 73
    iget v0, p0, Ll2/a;->k:I

    .line 74
    .line 75
    iget v2, p1, Ll2/a;->k:I

    .line 76
    .line 77
    if-ne v0, v2, :cond_0

    .line 78
    .line 79
    iget v0, p0, Ll2/a;->l:I

    .line 80
    .line 81
    iget v2, p1, Ll2/a;->l:I

    .line 82
    .line 83
    if-ne v0, v2, :cond_0

    .line 84
    .line 85
    iget-boolean v0, p0, Ll2/a;->n:Z

    .line 86
    .line 87
    iget-boolean v2, p1, Ll2/a;->n:Z

    .line 88
    .line 89
    if-ne v0, v2, :cond_0

    .line 90
    .line 91
    iget-boolean v0, p0, Ll2/a;->o:Z

    .line 92
    .line 93
    iget-boolean v2, p1, Ll2/a;->o:Z

    .line 94
    .line 95
    if-ne v0, v2, :cond_0

    .line 96
    .line 97
    iget-boolean v0, p0, Ll2/a;->x:Z

    .line 98
    .line 99
    iget-boolean v2, p1, Ll2/a;->x:Z

    .line 100
    .line 101
    if-ne v0, v2, :cond_0

    .line 102
    .line 103
    iget-boolean v0, p0, Ll2/a;->y:Z

    .line 104
    .line 105
    iget-boolean v2, p1, Ll2/a;->y:Z

    .line 106
    .line 107
    if-ne v0, v2, :cond_0

    .line 108
    .line 109
    iget-object v0, p0, Ll2/a;->d:Lv1/c;

    .line 110
    .line 111
    iget-object v2, p1, Ll2/a;->d:Lv1/c;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 115
    move-result v0

    .line 116
    .line 117
    if-eqz v0, :cond_0

    .line 118
    .line 119
    iget-object v0, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 120
    .line 121
    iget-object v2, p1, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 122
    .line 123
    if-ne v0, v2, :cond_0

    .line 124
    .line 125
    iget-object v0, p0, Ll2/a;->r:Lt1/e;

    .line 126
    .line 127
    iget-object v2, p1, Ll2/a;->r:Lt1/e;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, Lt1/e;->equals(Ljava/lang/Object;)Z

    .line 131
    move-result v0

    .line 132
    .line 133
    if-eqz v0, :cond_0

    .line 134
    .line 135
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

    .line 136
    .line 137
    iget-object v2, p1, Ll2/a;->s:Ljava/util/Map;

    .line 138
    .line 139
    .line 140
    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 141
    move-result v0

    .line 142
    .line 143
    if-eqz v0, :cond_0

    .line 144
    .line 145
    iget-object v0, p0, Ll2/a;->t:Ljava/lang/Class;

    .line 146
    .line 147
    iget-object v2, p1, Ll2/a;->t:Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 151
    move-result v0

    .line 152
    .line 153
    if-eqz v0, :cond_0

    .line 154
    .line 155
    iget-object v0, p0, Ll2/a;->m:Lt1/b;

    .line 156
    .line 157
    iget-object v2, p1, Ll2/a;->m:Lt1/b;

    .line 158
    .line 159
    .line 160
    invoke-static {v0, v2}, Lp2/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 161
    move-result v0

    .line 162
    .line 163
    if-eqz v0, :cond_0

    .line 164
    .line 165
    iget-object v0, p0, Ll2/a;->v:Landroid/content/res/Resources$Theme;

    .line 166
    .line 167
    iget-object p1, p1, Ll2/a;->v:Landroid/content/res/Resources$Theme;

    .line 168
    .line 169
    .line 170
    invoke-static {v0, p1}, Lp2/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    move-result p1

    .line 172
    .line 173
    if-eqz p1, :cond_0

    .line 174
    const/4 p1, 0x1

    .line 175
    return p1

    .line 176
    :cond_0
    return v1
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
.end method

.method public f()Ll2/a;
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Ll2/a;

    .line 7
    .line 8
    new-instance v1, Lt1/e;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Lt1/e;-><init>()V

    .line 12
    .line 13
    iput-object v1, v0, Ll2/a;->r:Lt1/e;

    .line 14
    .line 15
    iget-object v2, p0, Ll2/a;->r:Lt1/e;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lt1/e;->d(Lt1/e;)V

    .line 19
    .line 20
    new-instance v1, Lp2/b;

    .line 21
    .line 22
    .line 23
    invoke-direct {v1}, Lp2/b;-><init>()V

    .line 24
    .line 25
    iput-object v1, v0, Ll2/a;->s:Ljava/util/Map;

    .line 26
    .line 27
    iget-object v2, p0, Ll2/a;->s:Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 31
    const/4 v1, 0x0

    .line 32
    .line 33
    iput-boolean v1, v0, Ll2/a;->u:Z

    .line 34
    .line 35
    iput-boolean v1, v0, Ll2/a;->w:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object v0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    .line 39
    new-instance v1, Ljava/lang/RuntimeException;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 43
    throw v1
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
.end method

.method public final f0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;Z)Ll2/a;
    .locals 0
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ll2/a;->m0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Ll2/a;->Y(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const/4 p2, 0x1

    .line 13
    .line 14
    iput-boolean p2, p1, Ll2/a;->z:Z

    .line 15
    return-object p1
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
.end method

.method public g(Ljava/lang/Class;)Ll2/a;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->g(Ljava/lang/Class;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Ljava/lang/Class;

    .line 20
    .line 21
    iput-object p1, p0, Ll2/a;->t:Ljava/lang/Class;

    .line 22
    .line 23
    iget p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    or-int/lit16 p1, p1, 0x1000

    .line 26
    .line 27
    iput p1, p0, Ll2/a;->b:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public final g0()Ll2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    return-object p0
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
.end method

.method public h()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/a;->j:Lt1/d;

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method

.method public final h0()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->u:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->g0()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "You cannot modify locked T, consider clone()"

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->c:F

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lp2/k;->l(F)I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget v1, p0, Ll2/a;->g:I

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, Lp2/k;->o(II)I

    .line 12
    move-result v0

    .line 13
    .line 14
    iget-object v1, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 18
    move-result v0

    .line 19
    .line 20
    iget v1, p0, Ll2/a;->i:I

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, Lp2/k;->o(II)I

    .line 24
    move-result v0

    .line 25
    .line 26
    iget-object v1, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 30
    move-result v0

    .line 31
    .line 32
    iget v1, p0, Ll2/a;->q:I

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v0}, Lp2/k;->o(II)I

    .line 36
    move-result v0

    .line 37
    .line 38
    iget-object v1, p0, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 42
    move-result v0

    .line 43
    .line 44
    iget-boolean v1, p0, Ll2/a;->j:Z

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, Lp2/k;->q(ZI)I

    .line 48
    move-result v0

    .line 49
    .line 50
    iget v1, p0, Ll2/a;->k:I

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v0}, Lp2/k;->o(II)I

    .line 54
    move-result v0

    .line 55
    .line 56
    iget v1, p0, Ll2/a;->l:I

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, Lp2/k;->o(II)I

    .line 60
    move-result v0

    .line 61
    .line 62
    iget-boolean v1, p0, Ll2/a;->n:Z

    .line 63
    .line 64
    .line 65
    invoke-static {v1, v0}, Lp2/k;->q(ZI)I

    .line 66
    move-result v0

    .line 67
    .line 68
    iget-boolean v1, p0, Ll2/a;->o:Z

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v0}, Lp2/k;->q(ZI)I

    .line 72
    move-result v0

    .line 73
    .line 74
    iget-boolean v1, p0, Ll2/a;->x:Z

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v0}, Lp2/k;->q(ZI)I

    .line 78
    move-result v0

    .line 79
    .line 80
    iget-boolean v1, p0, Ll2/a;->y:Z

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v0}, Lp2/k;->q(ZI)I

    .line 84
    move-result v0

    .line 85
    .line 86
    iget-object v1, p0, Ll2/a;->d:Lv1/c;

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 90
    move-result v0

    .line 91
    .line 92
    iget-object v1, p0, Ll2/a;->e:Lcom/bumptech/glide/Priority;

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 96
    move-result v0

    .line 97
    .line 98
    iget-object v1, p0, Ll2/a;->r:Lt1/e;

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 102
    move-result v0

    .line 103
    .line 104
    iget-object v1, p0, Ll2/a;->s:Ljava/util/Map;

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 108
    move-result v0

    .line 109
    .line 110
    iget-object v1, p0, Ll2/a;->t:Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 114
    move-result v0

    .line 115
    .line 116
    iget-object v1, p0, Ll2/a;->m:Lt1/b;

    .line 117
    .line 118
    .line 119
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 120
    move-result v0

    .line 121
    .line 122
    iget-object v1, p0, Ll2/a;->v:Landroid/content/res/Resources$Theme;

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v0}, Lp2/k;->p(Ljava/lang/Object;I)I

    .line 126
    move-result v0

    .line 127
    return v0
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
.end method

.method public i(Lv1/c;)Ll2/a;
    .locals 1
    .param p1    # Lv1/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/c;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->i(Lv1/c;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lv1/c;

    .line 20
    .line 21
    iput-object p1, p0, Ll2/a;->d:Lv1/c;

    .line 22
    .line 23
    iget p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    or-int/lit8 p1, p1, 0x4

    .line 26
    .line 27
    iput p1, p0, Ll2/a;->b:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public i0(Lt1/d;Ljava/lang/Object;)Ll2/a;
    .locals 1
    .param p1    # Lt1/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Lt1/d<",
            "TY;>;TY;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Ll2/a;->r:Lt1/e;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1, p2}, Lt1/e;->e(Lt1/d;Ljava/lang/Object;)Lt1/e;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 28
    move-result-object p1

    .line 29
    return-object p1
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
.end method

.method public j()Ll2/a;
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ll2/a;->j()Ll2/a;

    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 19
    .line 20
    iget v0, p0, Ll2/a;->b:I

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    iput-boolean v1, p0, Ll2/a;->n:Z

    .line 24
    .line 25
    .line 26
    const v2, -0x20801

    .line 27
    and-int/2addr v0, v2

    .line 28
    .line 29
    iput-boolean v1, p0, Ll2/a;->o:Z

    .line 30
    .line 31
    const/high16 v1, 0x10000

    .line 32
    or-int/2addr v0, v1

    .line 33
    .line 34
    iput v0, p0, Ll2/a;->b:I

    .line 35
    const/4 v0, 0x1

    .line 36
    .line 37
    iput-boolean v0, p0, Ll2/a;->z:Z

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 41
    move-result-object v0

    .line 42
    return-object v0
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
.end method

.method public j0(Lt1/b;)Ll2/a;
    .locals 1
    .param p1    # Lt1/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/b;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->j0(Lt1/b;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lt1/b;

    .line 20
    .line 21
    iput-object p1, p0, Ll2/a;->m:Lt1/b;

    .line 22
    .line 23
    iget p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    or-int/lit16 p1, p1, 0x400

    .line 26
    .line 27
    iput p1, p0, Ll2/a;->b:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 31
    move-result-object p1

    .line 32
    return-object p1
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
.end method

.method public k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->h:Lt1/d;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method public k0(F)Ll2/a;
    .locals 1
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->k0(F)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    .line 16
    cmpg-float v0, p1, v0

    .line 17
    .line 18
    if-ltz v0, :cond_1

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    cmpl-float v0, p1, v0

    .line 23
    .line 24
    if-gtz v0, :cond_1

    .line 25
    .line 26
    iput p1, p0, Ll2/a;->c:F

    .line 27
    .line 28
    iget p1, p0, Ll2/a;->b:I

    .line 29
    .line 30
    or-int/lit8 p1, p1, 0x2

    .line 31
    .line 32
    iput p1, p0, Ll2/a;->b:I

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v0, "sizeMultiplier must be between 0 and 1"

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    throw p1
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
.end method

.method public l(Landroid/graphics/Bitmap$CompressFormat;)Ll2/a;
    .locals 1
    .param p1    # Landroid/graphics/Bitmap$CompressFormat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap$CompressFormat;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lc2/c;->c:Lt1/d;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method public l0(Z)Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ll2/a;->l0(Z)Ll2/a;

    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    xor-int/2addr p1, v1

    .line 16
    .line 17
    iput-boolean p1, p0, Ll2/a;->j:Z

    .line 18
    .line 19
    iget p1, p0, Ll2/a;->b:I

    .line 20
    .line 21
    or-int/lit16 p1, p1, 0x100

    .line 22
    .line 23
    iput p1, p0, Ll2/a;->b:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 27
    move-result-object p1

    .line 28
    return-object p1
    .line 29
    .line 30
    .line 31
.end method

.method public m(I)Ll2/a;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->m(I)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput p1, p0, Ll2/a;->g:I

    .line 16
    .line 17
    iget p1, p0, Ll2/a;->b:I

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x20

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    and-int/lit8 p1, p1, -0x11

    .line 25
    .line 26
    iput p1, p0, Ll2/a;->b:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final m0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;
    .locals 1
    .param p1    # Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ll2/a;->m0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Ll2/a;->k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Ll2/a;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p2}, Ll2/a;->o0(Lt1/h;)Ll2/a;

    .line 20
    move-result-object p1

    .line 21
    return-object p1
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
.end method

.method public n(Landroid/graphics/drawable/Drawable;)Ll2/a;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->n(Landroid/graphics/drawable/Drawable;)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    iget p1, p0, Ll2/a;->b:I

    .line 18
    .line 19
    or-int/lit8 p1, p1, 0x10

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput v0, p0, Ll2/a;->g:I

    .line 23
    .line 24
    and-int/lit8 p1, p1, -0x21

    .line 25
    .line 26
    iput p1, p0, Ll2/a;->b:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TY;>;",
            "Lt1/h<",
            "TY;>;Z)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2, p3}, Ll2/a;->n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Ll2/a;->s:Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    iget p1, p0, Ll2/a;->b:I

    .line 27
    const/4 p2, 0x1

    .line 28
    .line 29
    iput-boolean p2, p0, Ll2/a;->o:Z

    .line 30
    .line 31
    .line 32
    const v0, 0x10800

    .line 33
    or-int/2addr v0, p1

    .line 34
    .line 35
    iput v0, p0, Ll2/a;->b:I

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    iput-boolean v0, p0, Ll2/a;->z:Z

    .line 39
    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    .line 43
    const p3, 0x30800

    .line 44
    or-int/2addr p1, p3

    .line 45
    .line 46
    iput p1, p0, Ll2/a;->b:I

    .line 47
    .line 48
    iput-boolean p2, p0, Ll2/a;->n:Z

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 52
    move-result-object p1

    .line 53
    return-object p1
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
.end method

.method public o()Ll2/a;
    .locals 2
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->c:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 3
    .line 4
    new-instance v1, Lc2/u;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lc2/u;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ll2/a;->e0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lt1/h;)Ll2/a;

    .line 11
    move-result-object v0

    .line 12
    return-object v0
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
.end method

.method public o0(Lt1/h;)Ll2/a;
    .locals 1
    .param p1    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Ll2/a;->p0(Lt1/h;Z)Ll2/a;

    .line 5
    move-result-object p1

    .line 6
    return-object p1
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
.end method

.method public p(Lcom/bumptech/glide/load/DecodeFormat;)Ll2/a;
    .locals 2
    .param p1    # Lcom/bumptech/glide/load/DecodeFormat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/DecodeFormat;",
            ")TT;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lp2/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/a;->f:Lt1/d;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Lg2/i;->a:Lt1/d;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Ll2/a;->i0(Lt1/d;Ljava/lang/Object;)Ll2/a;

    .line 15
    move-result-object p1

    .line 16
    return-object p1
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
.end method

.method public p0(Lt1/h;Z)Ll2/a;
    .locals 2
    .param p1    # Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;Z)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p2}, Ll2/a;->p0(Lt1/h;Z)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lc2/s;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lc2/s;-><init>(Lt1/h;Z)V

    .line 19
    .line 20
    const-class v1, Landroid/graphics/Bitmap;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1, p1, p2}, Ll2/a;->n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;

    .line 24
    .line 25
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1, v0, p2}, Ll2/a;->n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;

    .line 29
    .line 30
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lc2/s;->c()Lt1/h;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, p2}, Ll2/a;->n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;

    .line 38
    .line 39
    new-instance v0, Lg2/f;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p1}, Lg2/f;-><init>(Lt1/h;)V

    .line 43
    .line 44
    const-class p1, Lg2/c;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v0, p2}, Ll2/a;->n0(Ljava/lang/Class;Lt1/h;Z)Ll2/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 51
    move-result-object p1

    .line 52
    return-object p1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
.end method

.method public final q()Lv1/c;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->d:Lv1/c;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public varargs q0([Lt1/h;)Ll2/a;
    .locals 2
    .param p1    # [Lt1/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lt1/h<",
            "Landroid/graphics/Bitmap;",
            ">;)TT;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    if-le v0, v1, :cond_0

    .line 5
    .line 6
    new-instance v0, Lt1/c;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p1}, Lt1/c;-><init>([Lt1/h;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, v1}, Ll2/a;->p0(Lt1/h;Z)Ll2/a;

    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    array-length v0, p1

    .line 16
    .line 17
    if-ne v0, v1, :cond_1

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    aget-object p1, p1, v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ll2/a;->o0(Lt1/h;)Ll2/a;

    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 29
    move-result-object p1

    .line 30
    return-object p1
    .line 31
.end method

.method public final r()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->g:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public r0(Z)Ll2/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)TT;"
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->w:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ll2/a;->f()Ll2/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ll2/a;->r0(Z)Ll2/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    :cond_0
    iput-boolean p1, p0, Ll2/a;->A:Z

    .line 16
    .line 17
    iget p1, p0, Ll2/a;->b:I

    .line 18
    .line 19
    const/high16 v0, 0x100000

    .line 20
    or-int/2addr p1, v0

    .line 21
    .line 22
    iput p1, p0, Ll2/a;->b:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ll2/a;->h0()Ll2/a;

    .line 26
    move-result-object p1

    .line 27
    return-object p1
    .line 28
    .line 29
    .line 30
    .line 31
.end method

.method public final s()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->f:Landroid/graphics/drawable/Drawable;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final t()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->p:Landroid/graphics/drawable/Drawable;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final u()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->q:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final v()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ll2/a;->y:Z

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final w()Lt1/e;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->r:Lt1/e;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final x()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->k:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final y()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Ll2/a;->l:I

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final z()Landroid/graphics/drawable/Drawable;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ll2/a;->h:Landroid/graphics/drawable/Drawable;

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
    .line 19
    .line 20
    .line 21
    .line 22
.end method
