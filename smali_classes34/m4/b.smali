.class public Lm4/b;
.super Lcom/facebook/fresco/ui/common/BaseControllerListener2;
.source "ImagePerfStateManager.java"

# interfaces
.implements Ljava/io/Closeable;
.implements Lcom/facebook/drawee/drawable/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/fresco/ui/common/BaseControllerListener2<",
        "Lx5/k;",
        ">;",
        "Ljava/io/Closeable;",
        "Lcom/facebook/drawee/drawable/g0;"
    }
.end annotation


# instance fields
.field public final d:Lc4/b;

.field public final e:Lcom/facebook/fresco/ui/common/a;

.field public final f:Lg5/d;

.field public g:Lg5/d;

.field public final h:Z


# direct methods
.method public constructor <init>(Lc4/b;Lcom/facebook/fresco/ui/common/a;Lg5/d;)V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-direct {p0, p1, p2, p3, v0}, Lm4/b;-><init>(Lc4/b;Lcom/facebook/fresco/ui/common/a;Lg5/d;Z)V

    return-void
.end method

.method public constructor <init>(Lc4/b;Lcom/facebook/fresco/ui/common/a;Lg5/d;Z)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/facebook/fresco/ui/common/BaseControllerListener2;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lm4/b;->g:Lg5/d;

    .line 4
    iput-object p1, p0, Lm4/b;->d:Lc4/b;

    .line 5
    iput-object p2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 6
    iput-object p3, p0, Lm4/b;->f:Lg5/d;

    .line 7
    iput-boolean p4, p0, Lm4/b;->h:Z

    return-void
.end method


# virtual methods
.method public b(Z)V
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 5
    .line 6
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lc4/b;->now()J

    .line 10
    move-result-wide v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, v0, v1}, Lm4/b;->o(Lcom/facebook/fresco/ui/common/a;J)V

    .line 14
    return-void

    .line 15
    .line 16
    :cond_0
    iget-object p1, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 17
    .line 18
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lc4/b;->now()J

    .line 22
    move-result-wide v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1, v0, v1}, Lm4/b;->n(Lcom/facebook/fresco/ui/common/a;J)V

    .line 26
    return-void
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
.end method

.method public close()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lm4/b;->p()V

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

.method public bridge synthetic g(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lx5/k;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lm4/b;->l(Ljava/lang/String;Lx5/k;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

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
.end method

.method public h(Ljava/lang/String;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/b;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, p2}, Lcom/facebook/fresco/ui/common/a;->F(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lcom/facebook/fresco/ui/common/a;->B(Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->RELEASED:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v2, p1}, Lm4/b;->q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 20
    .line 21
    iget-boolean p1, p0, Lm4/b;->h:Z

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v2, v0, v1}, Lm4/b;->n(Lcom/facebook/fresco/ui/common/a;J)V

    .line 27
    :cond_0
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
.end method

.method public i(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/b;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/facebook/fresco/ui/common/a;->x()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0, v1}, Lcom/facebook/fresco/ui/common/a;->D(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lcom/facebook/fresco/ui/common/a;->B(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p2}, Lcom/facebook/fresco/ui/common/a;->y(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p3}, Lcom/facebook/fresco/ui/common/a;->F(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 24
    .line 25
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->REQUESTED:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v2, p1}, Lm4/b;->q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 29
    .line 30
    iget-boolean p1, p0, Lm4/b;->h:Z

    .line 31
    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v2, v0, v1}, Lm4/b;->o(Lcom/facebook/fresco/ui/common/a;J)V

    .line 36
    :cond_0
    return-void
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

.method public j(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/b;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, p3}, Lcom/facebook/fresco/ui/common/a;->F(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0, v1}, Lcom/facebook/fresco/ui/common/a;->z(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Lcom/facebook/fresco/ui/common/a;->B(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p2}, Lcom/facebook/fresco/ui/common/a;->E(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->ERROR:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v2, p1}, Lm4/b;->q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v2, v0, v1}, Lm4/b;->n(Lcom/facebook/fresco/ui/common/a;J)V

    .line 29
    return-void
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
.end method

.method public l(Ljava/lang/String;Lx5/k;Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/b;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, p3}, Lcom/facebook/fresco/ui/common/a;->F(Lcom/facebook/fresco/ui/common/ControllerListener2$Extras;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v0, v1}, Lcom/facebook/fresco/ui/common/a;->A(J)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v0, v1}, Lcom/facebook/fresco/ui/common/a;->J(J)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p1}, Lcom/facebook/fresco/ui/common/a;->B(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, p2}, Lcom/facebook/fresco/ui/common/a;->G(Ljava/lang/Object;)V

    .line 24
    .line 25
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->SUCCESS:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v2, p1}, Lm4/b;->q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 29
    return-void
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
.end method

.method public m(Ljava/lang/String;Lx5/k;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->d:Lc4/b;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lc4/b;->now()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    iget-object v2, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v0, v1}, Lcom/facebook/fresco/ui/common/a;->C(J)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p1}, Lcom/facebook/fresco/ui/common/a;->B(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p2}, Lcom/facebook/fresco/ui/common/a;->G(Ljava/lang/Object;)V

    .line 18
    .line 19
    sget-object p1, Lcom/facebook/fresco/ui/common/ImageLoadStatus;->INTERMEDIATE_AVAILABLE:Lcom/facebook/fresco/ui/common/ImageLoadStatus;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2, p1}, Lm4/b;->q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 23
    return-void
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

.method public final n(Lcom/facebook/fresco/ui/common/a;J)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lcom/facebook/fresco/ui/common/a;->R(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2, p3}, Lcom/facebook/fresco/ui/common/a;->L(J)V

    .line 8
    .line 9
    sget-object p2, Lcom/facebook/fresco/ui/common/VisibilityState;->INVISIBLE:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lm4/b;->u(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V

    .line 13
    return-void
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

.method public o(Lcom/facebook/fresco/ui/common/a;J)V
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Lcom/facebook/fresco/ui/common/a;->R(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2, p3}, Lcom/facebook/fresco/ui/common/a;->Q(J)V

    .line 8
    .line 9
    sget-object p2, Lcom/facebook/fresco/ui/common/VisibilityState;->VISIBLE:Lcom/facebook/fresco/ui/common/VisibilityState;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lm4/b;->u(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V

    .line 13
    return-void
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

.method public onDraw()V
    .locals 0

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
.end method

.method public bridge synthetic onIntermediateImageSet(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lx5/k;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lm4/b;->m(Ljava/lang/String;Lx5/k;)V

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

.method public p()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->e:Lcom/facebook/fresco/ui/common/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/facebook/fresco/ui/common/a;->w()V

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
.end method

.method public final q(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lcom/facebook/fresco/ui/common/a;->H(Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 4
    .line 5
    iget-object v0, p0, Lm4/b;->f:Lg5/d;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Lg5/d;->b(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 9
    .line 10
    iget-object v0, p0, Lm4/b;->g:Lg5/d;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Lg5/d;->b(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/ImageLoadStatus;)V

    .line 16
    :cond_0
    return-void
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

.method public final u(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lm4/b;->f:Lg5/d;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lg5/d;->a(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V

    .line 6
    .line 7
    iget-object v0, p0, Lm4/b;->g:Lg5/d;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Lg5/d;->a(Lcom/facebook/fresco/ui/common/a;Lcom/facebook/fresco/ui/common/VisibilityState;)V

    .line 13
    :cond_0
    return-void
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
