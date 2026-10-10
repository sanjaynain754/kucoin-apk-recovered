.class public Lo5/c;
.super Ljava/lang/Object;
.source "AnimatedFrameCache.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo5/c$b;
    }
.end annotation


# instance fields
.field public final a:Lq3/a;

.field public final b:Lcom/facebook/imagepipeline/cache/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/facebook/imagepipeline/cache/c$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/cache/c$b<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Lq3/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq3/a;Lcom/facebook/imagepipeline/cache/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            "Lcom/facebook/imagepipeline/cache/c<",
            "Lq3/a;",
            "Lx5/e;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lo5/c;->a:Lq3/a;

    .line 6
    .line 7
    iput-object p2, p0, Lo5/c;->b:Lcom/facebook/imagepipeline/cache/c;

    .line 8
    .line 9
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 13
    .line 14
    iput-object p1, p0, Lo5/c;->d:Ljava/util/LinkedHashSet;

    .line 15
    .line 16
    new-instance p1, Lo5/c$a;

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, p0}, Lo5/c$a;-><init>(Lo5/c;)V

    .line 20
    .line 21
    iput-object p1, p0, Lo5/c;->c:Lcom/facebook/imagepipeline/cache/c$b;

    .line 22
    return-void
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
.method public a(ILa4/a;)La4/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "La4/a<",
            "Lx5/e;",
            ">;)",
            "La4/a<",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo5/c;->b:Lcom/facebook/imagepipeline/cache/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lo5/c;->e(I)Lo5/c$b;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    iget-object v1, p0, Lo5/c;->c:Lcom/facebook/imagepipeline/cache/c$b;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2, v1}, Lcom/facebook/imagepipeline/cache/c;->d(Ljava/lang/Object;La4/a;Lcom/facebook/imagepipeline/cache/c$b;)La4/a;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public b(I)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lo5/c;->b:Lcom/facebook/imagepipeline/cache/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lo5/c;->e(I)Lo5/c$b;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->contains(Ljava/lang/Object;)Z

    .line 10
    move-result p1

    .line 11
    return p1
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

.method public c(I)La4/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "La4/a<",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lo5/c;->b:Lcom/facebook/imagepipeline/cache/c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lo5/c;->e(I)Lo5/c$b;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/cache/f;->get(Ljava/lang/Object;)La4/a;

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
.end method

.method public d()La4/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La4/a<",
            "Lx5/e;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    :cond_0
    invoke-virtual {p0}, Lo5/c;->g()Lq3/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    :cond_1
    iget-object v1, p0, Lo5/c;->b:Lcom/facebook/imagepipeline/cache/c;

    .line 11
    .line 12
    .line 13
    invoke-interface {v1, v0}, Lcom/facebook/imagepipeline/cache/c;->b(Ljava/lang/Object;)La4/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    return-object v0
    .line 18
.end method

.method public final e(I)Lo5/c$b;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lo5/c$b;

    .line 3
    .line 4
    iget-object v1, p0, Lo5/c;->a:Lq3/a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p1}, Lo5/c$b;-><init>(Lq3/a;I)V

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
    .line 23
.end method

.method public declared-synchronized f(Lq3/a;Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-object p2, p0, Lo5/c;->d:Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception p1

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    iget-object p2, p0, Lo5/c;->d:Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
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

.method public final declared-synchronized g()Lq3/a;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lo5/c;->d:Ljava/util/LinkedHashSet;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    check-cast v1, Lq3/a;

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    monitor-exit p0

    .line 28
    return-object v1

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
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
