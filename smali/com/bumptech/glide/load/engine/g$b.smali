.class public Lcom/bumptech/glide/load/engine/g$b;
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
    name = "b"
.end annotation


# instance fields
.field public final b:Ll2/g;

.field public final synthetic c:Lcom/bumptech/glide/load/engine/g;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/g;Ll2/g;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    iput-object p2, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Ll2/g;

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
.method public run()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Ll2/g;

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
    iget-object v1, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 13
    .line 14
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/g;->b:Lcom/bumptech/glide/load/engine/g$e;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Ll2/g;

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
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/bumptech/glide/load/engine/g;->w:Lcom/bumptech/glide/load/engine/h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/h;->b()V

    .line 30
    .line 31
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Ll2/g;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g;->g(Ll2/g;)V

    .line 37
    .line 38
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/bumptech/glide/load/engine/g$b;->b:Ll2/g;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v3}, Lcom/bumptech/glide/load/engine/g;->r(Ll2/g;)V

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v2

    .line 46
    goto :goto_1

    .line 47
    .line 48
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/bumptech/glide/load/engine/g$b;->c:Lcom/bumptech/glide/load/engine/g;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/bumptech/glide/load/engine/g;->i()V

    .line 52
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    :try_start_4
    throw v2

    .line 59
    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 60
    throw v1
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
