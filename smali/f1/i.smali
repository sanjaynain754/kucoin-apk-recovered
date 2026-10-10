.class public Lf1/i;
.super Lp1/a;
.source "PathKeyframe.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp1/a<",
        "Landroid/graphics/PointF;",
        ">;"
    }
.end annotation


# instance fields
.field public q:Landroid/graphics/Path;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final r:Lp1/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/a<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/h;Lp1/a;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/airbnb/lottie/h;",
            "Lp1/a<",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p2, Lp1/a;->b:Ljava/lang/Object;

    .line 3
    move-object v3, v0

    .line 4
    .line 5
    check-cast v3, Landroid/graphics/PointF;

    .line 6
    .line 7
    iget-object v0, p2, Lp1/a;->c:Ljava/lang/Object;

    .line 8
    move-object v4, v0

    .line 9
    .line 10
    check-cast v4, Landroid/graphics/PointF;

    .line 11
    .line 12
    iget-object v5, p2, Lp1/a;->d:Landroid/view/animation/Interpolator;

    .line 13
    .line 14
    iget-object v6, p2, Lp1/a;->e:Landroid/view/animation/Interpolator;

    .line 15
    .line 16
    iget-object v7, p2, Lp1/a;->f:Landroid/view/animation/Interpolator;

    .line 17
    .line 18
    iget v8, p2, Lp1/a;->g:F

    .line 19
    .line 20
    iget-object v9, p2, Lp1/a;->h:Ljava/lang/Float;

    .line 21
    move-object v1, p0

    .line 22
    move-object v2, p1

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v1 .. v9}, Lp1/a;-><init>(Lcom/airbnb/lottie/h;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;Landroid/view/animation/Interpolator;FLjava/lang/Float;)V

    .line 26
    .line 27
    iput-object p2, v1, Lf1/i;->r:Lp1/a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lf1/i;->j()V

    .line 31
    return-void
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
.method public j()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lp1/a;->c:Ljava/lang/Object;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v1, Landroid/graphics/PointF;

    .line 11
    move-object v2, v0

    .line 12
    .line 13
    check-cast v2, Landroid/graphics/PointF;

    .line 14
    .line 15
    iget v2, v2, Landroid/graphics/PointF;->x:F

    .line 16
    .line 17
    check-cast v0, Landroid/graphics/PointF;

    .line 18
    .line 19
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2, v0}, Landroid/graphics/PointF;->equals(FF)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    .line 30
    :goto_0
    iget-object v1, p0, Lp1/a;->b:Ljava/lang/Object;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v2, p0, Lp1/a;->c:Ljava/lang/Object;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    check-cast v1, Landroid/graphics/PointF;

    .line 41
    .line 42
    check-cast v2, Landroid/graphics/PointF;

    .line 43
    .line 44
    iget-object v0, p0, Lf1/i;->r:Lp1/a;

    .line 45
    .line 46
    iget-object v3, v0, Lp1/a;->o:Landroid/graphics/PointF;

    .line 47
    .line 48
    iget-object v0, v0, Lp1/a;->p:Landroid/graphics/PointF;

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2, v3, v0}, Lo1/l;->d(Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/Path;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iput-object v0, p0, Lf1/i;->q:Landroid/graphics/Path;

    .line 55
    :cond_1
    return-void
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

.method public k()Landroid/graphics/Path;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/i;->q:Landroid/graphics/Path;

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
