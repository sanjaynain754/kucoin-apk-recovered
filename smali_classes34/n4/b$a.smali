.class public Ln4/b$a;
.super Ljava/lang/Object;
.source "DeferredReleaserConcurrentImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ln4/b;


# direct methods
.method public constructor <init>(Ln4/b;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ln4/b$a;->b:Ln4/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public run()V
    .locals 4
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ln4/b$a;->b:Ln4/b;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ln4/b;->e(Ln4/b;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Ln4/b$a;->b:Ln4/b;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ln4/b;->g(Ln4/b;)Ljava/util/ArrayList;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iget-object v2, p0, Ln4/b$a;->b:Ln4/b;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ln4/b;->f(Ln4/b;)Ljava/util/ArrayList;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    .line 22
    invoke-static {v2, v3}, Ln4/b;->i(Ln4/b;Ljava/util/ArrayList;)V

    .line 23
    .line 24
    iget-object v2, p0, Ln4/b$a;->b:Ln4/b;

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v1}, Ln4/b;->h(Ln4/b;Ljava/util/ArrayList;)V

    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    .line 30
    iget-object v0, p0, Ln4/b$a;->b:Ln4/b;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ln4/b;->g(Ln4/b;)Ljava/util/ArrayList;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    :goto_0
    if-ge v1, v0, :cond_0

    .line 42
    .line 43
    iget-object v2, p0, Ln4/b$a;->b:Ln4/b;

    .line 44
    .line 45
    .line 46
    invoke-static {v2}, Ln4/b;->g(Ln4/b;)Ljava/util/ArrayList;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    check-cast v2, Ln4/a$a;

    .line 54
    .line 55
    .line 56
    invoke-interface {v2}, Ln4/a$a;->release()V

    .line 57
    .line 58
    add-int/lit8 v1, v1, 0x1

    .line 59
    goto :goto_0

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, Ln4/b$a;->b:Ln4/b;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Ln4/b;->g(Ln4/b;)Ljava/util/ArrayList;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 69
    return-void

    .line 70
    :catchall_0
    move-exception v1

    .line 71
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw v1
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
