.class public Lcom/facebook/imagepipeline/producers/h1$a;
.super Lcom/facebook/imagepipeline/producers/s;
.source "ThrottlingProducer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/producers/h1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/imagepipeline/producers/s<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/facebook/imagepipeline/producers/h1;


# direct methods
.method public constructor <init>(Lcom/facebook/imagepipeline/producers/h1;Lcom/facebook/imagepipeline/producers/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;)V"
        }
    .end annotation

    .line 2
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/imagepipeline/producers/s;-><init>(Lcom/facebook/imagepipeline/producers/m;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/producers/h1;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/i1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/h1$a;-><init>(Lcom/facebook/imagepipeline/producers/h1;Lcom/facebook/imagepipeline/producers/m;)V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/facebook/imagepipeline/producers/m;->a()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/h1$a;->p()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public g(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/facebook/imagepipeline/producers/m;->onFailure(Ljava/lang/Throwable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/h1$a;->p()V

    .line 11
    return-void
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

.method public h(Ljava/lang/Object;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/s;->o()Lcom/facebook/imagepipeline/producers/m;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/facebook/imagepipeline/producers/m;->b(Ljava/lang/Object;I)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lcom/facebook/imagepipeline/producers/c;->d(I)Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/h1$a;->p()V

    .line 17
    :cond_0
    return-void
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

.method public final p()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/facebook/imagepipeline/producers/h1;->e(Lcom/facebook/imagepipeline/producers/h1;)Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    check-cast v1, Landroid/util/Pair;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lcom/facebook/imagepipeline/producers/h1;->d(Lcom/facebook/imagepipeline/producers/h1;)I

    .line 23
    move-result v3

    .line 24
    .line 25
    add-int/lit8 v3, v3, -0x1

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/h1;->f(Lcom/facebook/imagepipeline/producers/h1;I)V

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h1$a;->c:Lcom/facebook/imagepipeline/producers/h1;

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lcom/facebook/imagepipeline/producers/h1;->c(Lcom/facebook/imagepipeline/producers/h1;)Ljava/util/concurrent/Executor;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    new-instance v2, Lcom/facebook/imagepipeline/producers/h1$a$a;

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, p0, v1}, Lcom/facebook/imagepipeline/producers/h1$a$a;-><init>(Lcom/facebook/imagepipeline/producers/h1$a;Landroid/util/Pair;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    :cond_1
    return-void

    .line 50
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v1
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
