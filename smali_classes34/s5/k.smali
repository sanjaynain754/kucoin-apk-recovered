.class public Ls5/k;
.super Ljava/lang/Object;
.source "DiskStorageCacheFactory.java"

# interfaces
.implements Ls5/o;


# instance fields
.field public a:Ls5/l;


# direct methods
.method public constructor <init>(Ls5/l;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Ls5/k;->a:Ls5/l;

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

.method public static b(Lr3/b;Lcom/facebook/cache/disk/b;)Lcom/facebook/cache/disk/c;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Ls5/k;->c(Lr3/b;Lcom/facebook/cache/disk/b;Ljava/util/concurrent/Executor;)Lcom/facebook/cache/disk/c;

    .line 8
    move-result-object p0

    .line 9
    return-object p0
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

.method public static c(Lr3/b;Lcom/facebook/cache/disk/b;Ljava/util/concurrent/Executor;)Lcom/facebook/cache/disk/c;
    .locals 9

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/cache/disk/c$c;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lr3/b;->k()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lr3/b;->j()J

    .line 10
    move-result-wide v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lr3/b;->f()J

    .line 14
    move-result-wide v5

    .line 15
    .line 16
    .line 17
    invoke-direct/range {v0 .. v6}, Lcom/facebook/cache/disk/c$c;-><init>(JJJ)V

    .line 18
    .line 19
    new-instance v1, Lcom/facebook/cache/disk/c;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lr3/b;->h()Lr3/d;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lr3/b;->e()Lcom/facebook/cache/common/CacheEventListener;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lr3/b;->d()Lcom/facebook/cache/common/CacheErrorLogger;

    .line 31
    move-result-object v5

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lr3/b;->g()Lt3/b;

    .line 35
    move-result-object v6

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lr3/b;->i()Z

    .line 39
    move-result v8

    .line 40
    move-object v7, p2

    .line 41
    move-object v3, v0

    .line 42
    move-object v0, v1

    .line 43
    move-object v1, p1

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v0 .. v8}, Lcom/facebook/cache/disk/c;-><init>(Lcom/facebook/cache/disk/b;Lr3/d;Lcom/facebook/cache/disk/c$c;Lcom/facebook/cache/common/CacheEventListener;Lcom/facebook/cache/common/CacheErrorLogger;Lt3/b;Ljava/util/concurrent/Executor;Z)V

    .line 47
    return-object v0
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


# virtual methods
.method public a(Lr3/b;)Lr3/e;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls5/k;->a:Ls5/l;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ls5/l;->a(Lr3/b;)Lcom/facebook/cache/disk/b;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {p1, v0}, Ls5/k;->b(Lr3/b;Lcom/facebook/cache/disk/b;)Lcom/facebook/cache/disk/c;

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
