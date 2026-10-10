.class public final Lcom/tencent/bugly/proguard/g2;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static volatile d:Lcom/tencent/bugly/proguard/g2;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/tencent/bugly/callback/Callback;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/Thread;


# direct methods
.method public static constructor <clinit>()V
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
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g2;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 18
    .line 19
    new-instance v0, Ljava/lang/Thread;

    .line 20
    .line 21
    new-instance v1, Lcom/tencent/bugly/proguard/g2$a;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/g2$a;-><init>(Lcom/tencent/bugly/proguard/g2;)V

    .line 25
    .line 26
    const-string v2, "Bugly-CBM"

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/g2;->c:Ljava/lang/Thread;

    .line 32
    const/4 v1, 0x1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 39
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/g2;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/g2;->b()V

    return-void
.end method

.method public static declared-synchronized a(Ljava/lang/String;Lcom/tencent/bugly/callback/Callback;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/g2;

    monitor-enter v0

    if-eqz p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    if-nez v1, :cond_1

    .line 3
    new-instance v1, Lcom/tencent/bugly/proguard/g2;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/g2;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    .line 5
    iget-object v1, v1, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    invoke-virtual {v1, p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    :goto_2
    monitor-exit v0

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)V
    .locals 1

    .line 9
    sget-object v0, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, v0, Lcom/tencent/bugly/proguard/g2;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 2

    .line 7
    sget-object v0, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    :try_start_0
    iget-object v0, v0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    :cond_1
    :goto_0
    return v1
.end method

.method public static declared-synchronized c(Ljava/lang/String;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/g2;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    if-eqz v1, :cond_2

    if-nez p0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    .line 3
    iget-object v1, v1, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    invoke-virtual {v1, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    sget-object p0, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    .line 6
    iget-object p0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 8
    sget-object p0, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    .line 9
    iget-object p0, p0, Lcom/tencent/bugly/proguard/g2;->c:Ljava/lang/Thread;

    .line 10
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    const/4 p0, 0x0

    .line 11
    sput-object p0, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized d()V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/g2;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    if-eqz v1, :cond_0

    .line 2
    sget-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;

    .line 3
    iget-object v1, v1, Lcom/tencent/bugly/proguard/g2;->c:Ljava/lang/Thread;

    .line 4
    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const/4 v1, 0x0

    .line 5
    sput-object v1, Lcom/tencent/bugly/proguard/g2;->d:Lcom/tencent/bugly/proguard/g2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->c:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 3
    :catchall_0
    :goto_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/g2;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 6
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/String;Lcom/tencent/bugly/callback/Callback;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 2

    .line 7
    const-string/jumbo v0, "name"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/callback/Callback;

    if-nez v0, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    :try_start_0
    invoke-interface {v0, p1}, Lcom/tencent/bugly/callback/Callback;->onCallback(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final c()Z
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/g2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
