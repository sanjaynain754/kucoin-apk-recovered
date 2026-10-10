.class public Lcom/facebook/cache/disk/c$a;
.super Ljava/lang/Object;
.source "DiskStorageCache.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/cache/disk/c;-><init>(Lcom/facebook/cache/disk/b;Lr3/d;Lcom/facebook/cache/disk/c$c;Lcom/facebook/cache/common/CacheEventListener;Lcom/facebook/cache/common/CacheErrorLogger;Lt3/b;Ljava/util/concurrent/Executor;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/facebook/cache/disk/c;


# direct methods
.method public constructor <init>(Lcom/facebook/cache/disk/c;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/facebook/cache/disk/c$a;->b:Lcom/facebook/cache/disk/c;

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
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/cache/disk/c$a;->b:Lcom/facebook/cache/disk/c;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/cache/disk/c;->i(Lcom/facebook/cache/disk/c;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/facebook/cache/disk/c$a;->b:Lcom/facebook/cache/disk/c;

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lcom/facebook/cache/disk/c;->k(Lcom/facebook/cache/disk/c;)Z

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/cache/disk/c$a;->b:Lcom/facebook/cache/disk/c;

    .line 16
    const/4 v1, 0x1

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lcom/facebook/cache/disk/c;->j(Lcom/facebook/cache/disk/c;Z)V

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/cache/disk/c$a;->b:Lcom/facebook/cache/disk/c;

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lcom/facebook/cache/disk/c;->h(Lcom/facebook/cache/disk/c;)Ljava/util/concurrent/CountDownLatch;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v1
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
