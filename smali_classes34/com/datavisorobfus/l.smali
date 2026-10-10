.class public Lcom/datavisorobfus/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lcom/datavisorobfus/l;

.field private static final e:Ljava/lang/String;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/datavisorobfus/h;->a:Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, Lcom/datavisorobfus/l;->e:Ljava/lang/String;

    .line 5
    return-void
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
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    iput-object v0, p0, Lcom/datavisorobfus/l;->b:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    const-string v0, "DVIDManger initialization error: mContext is null."

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1
.end method

.method public static synthetic a(Lcom/datavisorobfus/l;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Lcom/datavisorobfus/l;
    .locals 2

    .line 2
    sget-object v0, Lcom/datavisorobfus/l;->d:Lcom/datavisorobfus/l;

    if-nez v0, :cond_1

    const-class v0, Lcom/datavisorobfus/l;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/l;->d:Lcom/datavisorobfus/l;

    if-nez v1, :cond_0

    new-instance v1, Lcom/datavisorobfus/l;

    invoke-direct {v1, p0}, Lcom/datavisorobfus/l;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/datavisorobfus/l;->d:Lcom/datavisorobfus/l;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/datavisorobfus/l;->d:Lcom/datavisorobfus/l;

    return-object p0
.end method

.method private a(Ljava/lang/String;)V
    .locals 10

    .line 3
    const-string v0, "barrierException"

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    move-result-object v1

    const-string v2, "main"

    invoke-virtual {v1, v2}, Lcom/datavisorobfus/g;->b(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-object v4, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v1, v4}, Lcom/datavisorobfus/i;->c(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/j;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/j;->a(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/datavisorobfus/l;->a()Z

    move-result v1

    goto :goto_1

    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/datavisorobfus/l;->e()Z

    move-result v1

    :goto_1
    if-nez v1, :cond_4

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/d;->f(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v1

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v4, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-direct {p0, v4, v3}, Lcom/datavisorobfus/l;->a(Ljava/util/Map;Z)V

    invoke-static {v4}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-static {v1, v4}, Lcom/datavisorobfus/m;->a(Ljava/lang/String;I)Lcom/datavisorobfus/m$a;

    move-result-object v1

    if-eqz v1, :cond_d

    iget-object v5, v1, Lcom/datavisorobfus/m$a;->b:[B

    if-nez v5, :cond_5

    goto/16 :goto_8

    :cond_5
    iget v4, v1, Lcom/datavisorobfus/m$a;->a:I

    if-eqz v4, :cond_6

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v3, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    iget v1, v1, Lcom/datavisorobfus/m$a;->a:I

    invoke-virtual {v0, v3, v1, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    move v6, v3

    :goto_2
    const/16 v7, 0x3c

    if-ge v6, v7, :cond_8

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v8

    iget-object v9, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v8, v9}, Lcom/datavisorobfus/r;->j0(Landroid/content/Context;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    const-wide/16 v7, 0x3e8

    :try_start_0
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    if-lt v6, v7, :cond_9

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    const/16 v3, 0xd

    invoke-virtual {v0, v1, v3, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void

    :cond_9
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    iget-object v8, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    sub-long/2addr v6, v4

    const-wide/32 v4, 0xf4240

    div-long/2addr v6, v4

    const-string v4, "DVSPLASTREAL120WAITTIME"

    invoke-static {v8, v4, v6, v7}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;J)V

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v4

    iget-object v1, v1, Lcom/datavisorobfus/m$a;->b:[B

    iput-object v1, v4, Lcom/datavisorobfus/i;->g:[B

    invoke-static {}, Lcom/datavisorobfus/k;->a()Lcom/datavisorobfus/k;

    move-result-object v1

    iget-object v1, v1, Lcom/datavisorobfus/k;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v4, Lcom/datavisorobfus/l$a;

    invoke-direct {v4, p0, p1}, Lcom/datavisorobfus/l$a;-><init>(Lcom/datavisorobfus/l;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    iget-object p1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/datavisorobfus/d;->b(Landroid/content/Context;)Ljava/util/Map;

    move-result-object p1

    :try_start_1
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-object v1, v1, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    invoke-virtual {v1}, Ljava/util/concurrent/CyclicBarrier;->await()I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v1

    iget-object v4, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v0, v1, v4}, Lcom/datavisor/vangogh/util/ExceptionUtil;->b(Ljava/lang/String;Ljava/lang/Throwable;Landroid/content/Context;)V

    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_4
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-boolean v1, v1, Lcom/datavisorobfus/i;->f:Z

    if-nez v1, :cond_a

    goto/16 :goto_7

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v4

    iget-wide v4, v4, Lcom/datavisorobfus/i;->j:J

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "d96"

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-object v1, v1, Lcom/datavisorobfus/i;->k:Ljava/lang/String;

    const-string v5, "d98"

    invoke-interface {p1, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v5

    iget-wide v5, v5, Lcom/datavisorobfus/i;->i:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v4, "d100"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v1

    const-string v4, "H6i37Q=="

    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v4, "v1"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v1

    const-string v4, "H6iqxnPZqQ=="

    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v4, "v2"

    invoke-interface {p1, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-direct {p0, v1, v3}, Lcom/datavisorobfus/l;->a(Ljava/util/Map;Z)V

    invoke-static {v1}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v3}, Lcom/datavisorobfus/m;->a(Ljava/lang/String;I)Lcom/datavisorobfus/m$a;

    move-result-object p1

    if-eqz p1, :cond_c

    iget-object v1, p1, Lcom/datavisorobfus/m$a;->b:[B

    if-eqz v1, :cond_c

    iget v1, p1, Lcom/datavisorobfus/m$a;->a:I

    if-eqz v1, :cond_b

    goto :goto_5

    :cond_b
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v1

    iget-object p1, p1, Lcom/datavisorobfus/m$a;->b:[B

    iput-object p1, v1, Lcom/datavisorobfus/i;->h:[B

    goto :goto_6

    :cond_c
    :goto_5
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object p1

    iput-object v2, p1, Lcom/datavisorobfus/i;->h:[B

    :goto_6
    :try_start_2
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object p1

    iget-object p1, p1, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    invoke-virtual {p1}, Ljava/util/concurrent/CyclicBarrier;->await()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception p1

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v0, p1, v1}, Lcom/datavisor/vangogh/util/ExceptionUtil;->b(Ljava/lang/String;Ljava/lang/Throwable;Landroid/content/Context;)V

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_7
    return-void

    :cond_d
    :goto_8
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, v4, v2, p1}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/Map;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 5
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->a()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "u1"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->c()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "u2"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/datavisorobfus/l;->b:Ljava/lang/String;

    invoke-static {p2}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/datavisorobfus/l;->b:Ljava/lang/String;

    const-string v0, "event_name"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object p2, p0, Lcom/datavisorobfus/l;->c:Ljava/util/Map;

    if-eqz p2, :cond_4

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p2, Ljava/util/HashMap;

    iget-object v0, p0, Lcom/datavisorobfus/l;->c:Ljava/util/Map;

    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const-string v0, "appExternKey"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string/jumbo v2, "u3"

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-static {p2}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "e1"

    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-void
.end method

.method private a()Z
    .locals 7

    .line 6
    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v0

    const-string v1, "H6iqxnPZqQ=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/datavisorobfus/y0;->c()Z

    move-result v1

    invoke-direct {p0}, Lcom/datavisorobfus/l;->c()Z

    move-result v2

    invoke-direct {p0}, Lcom/datavisorobfus/l;->b()Z

    move-result v3

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v5

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v4

    :goto_1
    if-eqz v3, :cond_2

    const/4 v1, 0x2

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    or-int/2addr v1, v2

    if-eqz v0, :cond_3

    const/4 v6, 0x4

    goto :goto_3

    :cond_3
    move v6, v5

    :goto_3
    or-int/2addr v1, v6

    sput v1, Lcom/datavisorobfus/d;->d:I

    if-nez v2, :cond_5

    if-nez v3, :cond_5

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    return v5

    :cond_5
    :goto_4
    return v4
.end method

.method private b()Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 3
    .line 4
    const-string v1, "DVSPDVMA"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    const/4 v3, 0x1

    .line 14
    .line 15
    if-gez v2, :cond_0

    .line 16
    return v3

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    move-result-wide v4

    .line 21
    .line 22
    cmp-long v0, v4, v0

    .line 23
    .line 24
    if-lez v0, :cond_1

    .line 25
    return v3

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
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
.end method

.method private c()Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisorobfus/d;->f(Landroid/content/Context;)Ljava/util/Map;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Ljava/util/TreeMap;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 12
    .line 13
    iget-object v2, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    invoke-static {v2}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    const-string v3, "KIqf3XHfsMgGRJE="

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    move-result-object v3

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v3}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const-string v3, "PZebxXzP"

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 39
    move-result-object v2

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v2, 0x0

    .line 42
    :goto_0
    const/4 v3, 0x0

    .line 43
    .line 44
    if-eqz v2, :cond_4

    .line 45
    move v4, v3

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 49
    move-result v5

    .line 50
    .line 51
    if-ge v4, v5, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v4}, Lorg/json/JSONArray;->optString(I)Ljava/lang/String;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    const-string v6, "e1"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v7

    .line 62
    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    iget-object v5, p0, Lcom/datavisorobfus/l;->c:Ljava/util/Map;

    .line 66
    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    .line 70
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    .line 71
    move-result v5

    .line 72
    .line 73
    if-nez v5, :cond_2

    .line 74
    .line 75
    new-instance v5, Ljava/util/TreeMap;

    .line 76
    .line 77
    iget-object v7, p0, Lcom/datavisorobfus/l;->c:Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    invoke-direct {v5, v7}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 84
    move-result-object v5

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    .line 91
    invoke-interface {v1, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    goto :goto_2

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-static {v5}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 96
    move-result v6

    .line 97
    .line 98
    if-eqz v6, :cond_2

    .line 99
    .line 100
    .line 101
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    move-result-object v6

    .line 103
    .line 104
    check-cast v6, Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    invoke-static {v6}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 108
    move-result v7

    .line 109
    .line 110
    if-eqz v7, :cond_2

    .line 111
    .line 112
    .line 113
    invoke-interface {v1, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    :cond_2
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    move-object v0, v1

    .line 118
    .line 119
    .line 120
    :cond_4
    invoke-static {v0}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Lcom/datavisorobfus/u;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 133
    move-result v1

    .line 134
    const/4 v2, 0x1

    .line 135
    .line 136
    if-eqz v1, :cond_5

    .line 137
    return v2

    .line 138
    .line 139
    :cond_5
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 140
    .line 141
    const-string v4, "DVSPNEEDUPLOAD"

    .line 142
    .line 143
    .line 144
    invoke-static {v1, v4}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    .line 148
    invoke-static {v1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 149
    move-result v5

    .line 150
    .line 151
    if-eqz v5, :cond_6

    .line 152
    .line 153
    :goto_3
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v4, v0}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 157
    return v2

    .line 158
    .line 159
    .line 160
    :cond_6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 161
    move-result v1

    .line 162
    .line 163
    if-eqz v1, :cond_7

    .line 164
    .line 165
    const-string v0, "=========Equallllll,no need to upload"

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 169
    return v3

    .line 170
    .line 171
    :cond_7
    const-string v1, "=========not hit, need to upload"

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    .line 175
    goto :goto_3
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
.end method

.method private e()Z
    .locals 9

    .line 1
    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 3
    .line 4
    const-string v1, "DVSPDVMA"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    if-gez v2, :cond_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    move-result-wide v5

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v7, 0x9a7ec800L

    .line 27
    add-long/2addr v0, v7

    .line 28
    .line 29
    cmp-long v0, v5, v0

    .line 30
    .line 31
    if-lez v0, :cond_1

    .line 32
    :goto_0
    move v0, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v0, v3

    .line 35
    .line 36
    :goto_1
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "H6iqxnPZqQ=="

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    iget-object v2, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    invoke-static {v2}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/datavisorobfus/y0;->c()Z

    .line 60
    move-result v2

    .line 61
    .line 62
    .line 63
    invoke-static {v1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    .line 64
    move-result v1

    .line 65
    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    return v3

    .line 73
    :cond_3
    :goto_2
    return v4
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private f()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, ""

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    const-string v0, "H6ih/XXMmPMrc5VsFNA59i1Y"

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v2}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 22
    .line 23
    const-string v0, "H6ih/XXMmO4KRLN/BOo="

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 31
    return-void
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

.method private g()V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    const-string v0, "dI6MxnuTtMUDVttzEf8a"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/datavisorobfus/t;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    const-string v1, "H6ih/XXMmPAdX5dBI+oF8QZ9zqL6"

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v0, v2}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 31
    .line 32
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v1, 0x1d

    .line 35
    .line 36
    if-lt v0, v1, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 43
    move-result-object v0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    :goto_0
    if-eqz v0, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    const-string v1, "H6ih/XXMmPMrc5VsFNA59i1Y"

    .line 63
    .line 64
    .line 65
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v0, v2}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    :catchall_0
    :cond_2
    return-void
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public a(Ljava/util/Map;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/datavisorobfus/i;->i:J

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, p0, Lcom/datavisorobfus/l;->c:Ljava/util/Map;

    invoke-direct {p0}, Lcom/datavisorobfus/l;->g()V

    invoke-direct {p0, p2}, Lcom/datavisorobfus/l;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/datavisorobfus/l;->f()V

    invoke-static {}, Lcom/datavisorobfus/d;->a()V

    return-void

    :cond_1
    :goto_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object p1

    iget-object v0, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/datavisorobfus/i;->a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public d()Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    invoke-static {v1}, Lcom/datavisorobfus/j;->b(Landroid/content/Context;)Z

    .line 7
    move-result v1

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    invoke-static {v1}, Lcom/datavisorobfus/j;->a(Landroid/content/Context;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-direct {p0}, Lcom/datavisorobfus/l;->b()Z

    .line 22
    move-result v0

    .line 23
    return v0

    .line 24
    .line 25
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/datavisorobfus/l;->a:Landroid/content/Context;

    .line 26
    .line 27
    const-string v2, "DVSPDVMA"

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    .line 31
    move-result-wide v1

    .line 32
    .line 33
    const-wide/16 v3, 0x0

    .line 34
    .line 35
    cmp-long v3, v1, v3

    .line 36
    .line 37
    if-gez v3, :cond_2

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v5, 0x9a7ec800L

    .line 48
    add-long/2addr v1, v5

    .line 49
    .line 50
    cmp-long v1, v3, v1

    .line 51
    .line 52
    if-lez v1, :cond_3

    .line 53
    :goto_1
    const/4 v0, 0x1

    .line 54
    :catchall_0
    :cond_3
    return v0
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
