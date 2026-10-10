.class public Lcom/bumptech/glide/load/engine/g$a;
.super Ljava/lang/Object;
.source "EngineJob.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/engine/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final b:Ll2/g;

.field public final synthetic c:Lcom/bumptech/glide/load/engine/g;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/g;Ll2/g;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/g$a;->c:Lcom/bumptech/glide/load/engine/g;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/g$a;->b:Ll2/g;

    .line 8
    return-void
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
.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/g$a;->b:Ll2/g;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ll2/g;->g()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/g$a;->c:Lcom/bumptech/glide/load/engine/g;

    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$a;->c:Lcom/bumptech/glide/load/engine/g;

    .line 13
    .line 14
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/g;->b:Lcom/bumptech/glide/load/engine/g$e;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$a;->b:Ll2/g;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g$e;->b(Ll2/g;)Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$a;->c:Lcom/bumptech/glide/load/engine/g;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$a;->b:Ll2/g;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g;->f(Ll2/g;)V

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$a;->c:Lcom/bumptech/glide/load/engine/g;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/g;->i()V

    .line 38
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 40
    return-void

    .line 41
    :catchall_1
    move-exception v1

    .line 42
    goto :goto_2

    .line 43
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    :try_start_4
    throw v2

    .line 45
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 46
    throw v1
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
