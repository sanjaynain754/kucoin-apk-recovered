.class public Lu4/a;
.super Ljava/lang/Object;
.source "DraweeHolder.java"

# interfaces
.implements Lcom/facebook/drawee/drawable/g0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DH::",
        "Lt4/b;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/drawee/drawable/g0;"
    }
.end annotation


# instance fields
.field public b:Z

.field public c:Z

.field public d:Z

.field public e:Lt4/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDH;"
        }
    .end annotation
.end field

.field public f:Lt4/a;

.field public final g:Lcom/facebook/drawee/components/DraweeEventTracker;


# direct methods
.method public constructor <init>(Lt4/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDH;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lu4/a;->b:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Lu4/a;->c:Z

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lu4/a;->d:Z

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/drawee/components/DraweeEventTracker;->a()Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lu4/a;->q(Lt4/b;)V

    .line 26
    :cond_0
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

.method public static d(Lt4/b;Landroid/content/Context;)Lu4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<DH::",
            "Lt4/b;",
            ">(TDH;",
            "Landroid/content/Context;",
            ")",
            "Lu4/a<",
            "TDH;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lu4/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lu4/a;-><init>(Lt4/b;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lu4/a;->n(Landroid/content/Context;)V

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


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 8
    .line 9
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_ATTACH_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    iput-boolean v0, p0, Lu4/a;->b:Z

    .line 16
    .line 17
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Lt4/a;->e()Lt4/b;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Lt4/a;->c()V

    .line 31
    :cond_1
    :goto_0
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

.method public b(Z)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->d:Z

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DRAWABLE_SHOW:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_1
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DRAWABLE_HIDE:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 18
    .line 19
    iput-boolean p1, p0, Lu4/a;->d:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lu4/a;->c()V

    .line 23
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean v0, p0, Lu4/a;->d:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lu4/a;->a()V

    .line 12
    return-void

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lu4/a;->e()V

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public final e()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->b:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 8
    .line 9
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_DETACH_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-boolean v0, p0, Lu4/a;->b:Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lu4/a;->j()Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lt4/a;->d()V

    .line 27
    :cond_1
    :goto_0
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
.end method

.method public f()Lt4/a;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

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

.method public g()Lt4/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TDH;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->e:Lt4/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lt4/b;

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
.end method

.method public h()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->e:Lt4/b;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-interface {v0}, Lt4/b;->b()Landroid/graphics/drawable/Drawable;

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

.method public i()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->e:Lt4/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public j()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lt4/a;->e()Lt4/b;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget-object v1, p0, Lu4/a;->e:Lt4/b;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
.end method

.method public k()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_HOLDER_ATTACH:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 8
    const/4 v0, 0x1

    .line 9
    .line 10
    iput-boolean v0, p0, Lu4/a;->c:Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lu4/a;->c()V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_HOLDER_DETACH:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lu4/a;->c:Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lu4/a;->c()V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public m(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lu4/a;->j()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1}, Lt4/a;->b(Landroid/view/MotionEvent;)Z

    .line 14
    move-result p1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public n(Landroid/content/Context;)V
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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lu4/a;->p(Lt4/a;)V

    .line 5
    return-void
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

.method public onDraw()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lu4/a;->f:Lt4/a;

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 19
    move-result v1

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lu4/a;->toString()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-class v1, Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 34
    .line 35
    const-string v2, "%x: Draw requested for a non-attached controller %x. %s"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Lx3/a;->G(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    const/4 v0, 0x1

    .line 40
    .line 41
    iput-boolean v0, p0, Lu4/a;->c:Z

    .line 42
    .line 43
    iput-boolean v0, p0, Lu4/a;->d:Z

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lu4/a;->c()V

    .line 47
    return-void
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
.end method

.method public p(Lt4/a;)V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lu4/a;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lu4/a;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lu4/a;->j()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 16
    .line 17
    sget-object v2, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_CLEAR_OLD_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 21
    .line 22
    iget-object v1, p0, Lu4/a;->f:Lt4/a;

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-interface {v1, v2}, Lt4/a;->f(Lt4/b;)V

    .line 27
    .line 28
    :cond_1
    iput-object p1, p0, Lu4/a;->f:Lt4/a;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 33
    .line 34
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_SET_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 38
    .line 39
    iget-object p1, p0, Lu4/a;->f:Lt4/a;

    .line 40
    .line 41
    iget-object v1, p0, Lu4/a;->e:Lt4/b;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v1}, Lt4/a;->f(Lt4/b;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_2
    iget-object p1, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 48
    .line 49
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_CLEAR_CONTROLLER:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 53
    .line 54
    :goto_0
    if-eqz v0, :cond_3

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lu4/a;->a()V

    .line 58
    :cond_3
    return-void
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

.method public q(Lt4/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDH;)V"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 3
    .line 4
    sget-object v1, Lcom/facebook/drawee/components/DraweeEventTracker$Event;->ON_SET_HIERARCHY:Lcom/facebook/drawee/components/DraweeEventTracker$Event;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->b(Lcom/facebook/drawee/components/DraweeEventTracker$Event;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lu4/a;->j()Z

    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lu4/a;->r(Lcom/facebook/drawee/drawable/g0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Lt4/b;

    .line 22
    .line 23
    iput-object v1, p0, Lu4/a;->e:Lt4/b;

    .line 24
    .line 25
    .line 26
    invoke-interface {v1}, Lt4/b;->b()Landroid/graphics/drawable/Drawable;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0, v1}, Lu4/a;->b(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p0}, Lu4/a;->r(Lcom/facebook/drawee/drawable/g0;)V

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    iget-object v0, p0, Lu4/a;->f:Lt4/a;

    .line 50
    .line 51
    .line 52
    invoke-interface {v0, p1}, Lt4/a;->f(Lt4/b;)V

    .line 53
    :cond_2
    return-void
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

.method public final r(Lcom/facebook/drawee/drawable/g0;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lu4/a;->h()Landroid/graphics/drawable/Drawable;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/facebook/drawee/drawable/f0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Lcom/facebook/drawee/drawable/f0;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/facebook/drawee/drawable/f0;->g(Lcom/facebook/drawee/drawable/g0;)V

    .line 14
    :cond_0
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lw3/f;->b(Ljava/lang/Object;)Lw3/f$a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "controllerAttached"

    .line 7
    .line 8
    iget-boolean v2, p0, Lu4/a;->b:Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    const-string v1, "holderAttached"

    .line 15
    .line 16
    iget-boolean v2, p0, Lu4/a;->c:Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "drawableVisible"

    .line 23
    .line 24
    iget-boolean v2, p0, Lu4/a;->d:Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Lw3/f$a;->c(Ljava/lang/String;Z)Lw3/f$a;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iget-object v1, p0, Lu4/a;->g:Lcom/facebook/drawee/components/DraweeEventTracker;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/facebook/drawee/components/DraweeEventTracker;->toString()Ljava/lang/String;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "events"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v1}, Lw3/f$a;->b(Ljava/lang/String;Ljava/lang/Object;)Lw3/f$a;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lw3/f$a;->toString()Ljava/lang/String;

    .line 44
    move-result-object v0

    .line 45
    return-object v0
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
.end method
