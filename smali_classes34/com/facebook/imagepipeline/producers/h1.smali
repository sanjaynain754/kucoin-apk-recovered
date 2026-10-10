.class public Lcom/facebook/imagepipeline/producers/h1;
.super Ljava/lang/Object;
.source "ThrottlingProducer.java"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/v0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/h1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/facebook/imagepipeline/producers/v0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/facebook/imagepipeline/producers/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:I

.field public c:I

.field public final d:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Landroid/util/Pair<",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ">;>;"
        }
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(ILjava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/v0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/concurrent/Executor;",
            "Lcom/facebook/imagepipeline/producers/v0<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput p1, p0, Lcom/facebook/imagepipeline/producers/h1;->b:I

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h1;->e:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    invoke-static {p3}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, Lcom/facebook/imagepipeline/producers/v0;

    .line 20
    .line 21
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h1;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 24
    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 27
    .line 28
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/h1;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 29
    const/4 p1, 0x0

    .line 30
    .line 31
    iput p1, p0, Lcom/facebook/imagepipeline/producers/h1;->c:I

    .line 32
    return-void
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

.method public static bridge synthetic c(Lcom/facebook/imagepipeline/producers/h1;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/h1;->e:Ljava/util/concurrent/Executor;

    .line 3
    return-object p0
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

.method public static bridge synthetic d(Lcom/facebook/imagepipeline/producers/h1;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/facebook/imagepipeline/producers/h1;->c:I

    .line 3
    return p0
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

.method public static bridge synthetic e(Lcom/facebook/imagepipeline/producers/h1;)Ljava/util/concurrent/ConcurrentLinkedQueue;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/facebook/imagepipeline/producers/h1;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    return-object p0
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

.method public static bridge synthetic f(Lcom/facebook/imagepipeline/producers/h1;I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/facebook/imagepipeline/producers/h1;->c:I

    .line 3
    return-void
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
.method public a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "ThrottlingProducer"

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, p2, v1}, Lcom/facebook/imagepipeline/producers/y0;->b(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;)V

    .line 10
    monitor-enter p0

    .line 11
    .line 12
    :try_start_0
    iget v0, p0, Lcom/facebook/imagepipeline/producers/h1;->c:I

    .line 13
    .line 14
    iget v1, p0, Lcom/facebook/imagepipeline/producers/h1;->b:I

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h1;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/2addr v0, v2

    .line 31
    .line 32
    iput v0, p0, Lcom/facebook/imagepipeline/producers/h1;->c:I

    .line 33
    const/4 v2, 0x0

    .line 34
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/producers/h1;->g(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 40
    :cond_1
    return-void

    .line 41
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p1
.end method

.method public g(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/m<",
            "TT;>;",
            "Lcom/facebook/imagepipeline/producers/w0;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/w0;->g()Lcom/facebook/imagepipeline/producers/y0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "ThrottlingProducer"

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p2, v1, v2}, Lcom/facebook/imagepipeline/producers/y0;->j(Lcom/facebook/imagepipeline/producers/w0;Ljava/lang/String;Ljava/util/Map;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/h1;->a:Lcom/facebook/imagepipeline/producers/v0;

    .line 13
    .line 14
    new-instance v1, Lcom/facebook/imagepipeline/producers/h1$a;

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, p0, p1, v2}, Lcom/facebook/imagepipeline/producers/h1$a;-><init>(Lcom/facebook/imagepipeline/producers/h1;Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/i1;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, p2}, Lcom/facebook/imagepipeline/producers/v0;->a(Lcom/facebook/imagepipeline/producers/m;Lcom/facebook/imagepipeline/producers/w0;)V

    .line 21
    return-void
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
