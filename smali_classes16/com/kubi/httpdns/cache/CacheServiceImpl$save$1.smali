.class final Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;
.super Lkotlin/jvm/internal/Lambda;
.source "CacheServiceImpl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/httpdns/cache/CacheServiceImpl;->b(Lcom/kubi/httpdns/cache/HostRecord;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $fromDisk:Z

.field final synthetic $record:Lcom/kubi/httpdns/cache/HostRecord;

.field final synthetic $update:I

.field final synthetic this$0:Lcom/kubi/httpdns/cache/CacheServiceImpl;


# direct methods
.method public constructor <init>(Lcom/kubi/httpdns/cache/CacheServiceImpl;ILcom/kubi/httpdns/cache/HostRecord;Z)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->this$0:Lcom/kubi/httpdns/cache/CacheServiceImpl;

    .line 3
    .line 4
    iput p2, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$update:I

    .line 5
    .line 6
    iput-object p3, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$record:Lcom/kubi/httpdns/cache/HostRecord;

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$fromDisk:Z

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

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
    .line 94
    .line 95
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->this$0:Lcom/kubi/httpdns/cache/CacheServiceImpl;

    invoke-static {v0}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->c(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$update:I

    iget-object v2, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->this$0:Lcom/kubi/httpdns/cache/CacheServiceImpl;

    iget-object v3, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$record:Lcom/kubi/httpdns/cache/HostRecord;

    iget-boolean v4, p0, Lcom/kubi/httpdns/cache/CacheServiceImpl$save$1;->$fromDisk:Z

    monitor-enter v0

    const/4 v5, 0x1

    if-lt v1, v5, :cond_0

    .line 3
    :try_start_0
    invoke-static {v2}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->f(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v5

    invoke-virtual {v3}, Lcom/kubi/httpdns/cache/HostRecord;->getHost()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->d(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Lcom/kubi/httpdns/HttpDnsConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/kubi/httpdns/HttpDnsConfig;->getAllowMaxTtl()J

    move-result-wide v7

    invoke-virtual {v3, v4, v7, v8}, Lcom/kubi/httpdns/cache/HostRecord;->toHttpDnsResult(ZJ)Lck/a;

    move-result-object v4

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    invoke-static {v2}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->d(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Lcom/kubi/httpdns/HttpDnsConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/kubi/httpdns/HttpDnsConfig;->getAllowDiskCache()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x2

    if-lt v1, v4, :cond_1

    .line 5
    invoke-static {v2}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->e(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v4

    invoke-virtual {v3}, Lcom/kubi/httpdns/cache/HostRecord;->getHost()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    :cond_1
    invoke-static {v2}, Lcom/kubi/httpdns/cache/CacheServiceImpl;->d(Lcom/kubi/httpdns/cache/CacheServiceImpl;)Lcom/kubi/httpdns/HttpDnsConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kubi/httpdns/HttpDnsConfig;->getAllowDiskCache()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x3

    if-lt v1, v2, :cond_2

    .line 7
    const-string v1, "httpdns-dns-cache"

    invoke-virtual {v3}, Lcom/kubi/httpdns/cache/HostRecord;->getHost()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v3}, Ly70/e;->n(Ljava/lang/String;Ljava/lang/String;Landroid/os/Parcelable;)Ly70/e;

    .line 8
    :cond_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method
