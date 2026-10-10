.class public Lf1/e;
.super Lf1/g;
.source "GradientColorKeyframeAnimation.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf1/g<",
        "Lj1/d;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lj1/d;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp1/a<",
            "Lj1/d;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lf1/g;-><init>(Ljava/util/List;)V

    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 9
    move-result v2

    .line 10
    .line 11
    if-ge v0, v2, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    check-cast v2, Lp1/a;

    .line 18
    .line 19
    iget-object v2, v2, Lp1/a;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lj1/d;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lj1/d;->f()I

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 31
    move-result v1

    .line 32
    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    new-instance p1, Lj1/d;

    .line 37
    .line 38
    new-array v0, v1, [F

    .line 39
    .line 40
    new-array v1, v1, [I

    .line 41
    .line 42
    .line 43
    invoke-direct {p1, v0, v1}, Lj1/d;-><init>([F[I)V

    .line 44
    .line 45
    iput-object p1, p0, Lf1/e;->i:Lj1/d;

    .line 46
    return-void
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


# virtual methods
.method public bridge synthetic i(Lp1/a;F)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lf1/e;->q(Lp1/a;F)Lj1/d;

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
.end method

.method public q(Lp1/a;F)Lj1/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/a<",
            "Lj1/d;",
            ">;F)",
            "Lj1/d;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lf1/e;->i:Lj1/d;

    .line 3
    .line 4
    iget-object v1, p1, Lp1/a;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Lj1/d;

    .line 7
    .line 8
    iget-object p1, p1, Lp1/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lj1/d;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, p2}, Lj1/d;->g(Lj1/d;Lj1/d;F)V

    .line 14
    .line 15
    iget-object p1, p0, Lf1/e;->i:Lj1/d;

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
.end method
