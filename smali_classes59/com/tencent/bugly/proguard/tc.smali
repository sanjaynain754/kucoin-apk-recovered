.class public Lcom/tencent/bugly/proguard/tc;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/looper/ILooperDispatchListener;
.implements Lcom/tencent/bugly/proguard/y9;


# static fields
.field public static final d:Ljava/lang/String; = "msg_lag"

.field public static volatile e:Lcom/tencent/bugly/proguard/tc;


# instance fields
.field public volatile b:J

.field public volatile c:Ljava/lang/String;


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

.method public constructor <init>(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/tc;->b:J

    .line 6
    .line 7
    const-string p1, ""

    .line 8
    .line 9
    iput-object p1, p0, Lcom/tencent/bugly/proguard/tc;->c:Ljava/lang/String;

    .line 10
    return-void
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
.end method

.method public static declared-synchronized a()V
    .locals 4

    const-class v0, Lcom/tencent/bugly/proguard/tc;

    monitor-enter v0

    .line 7
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    .line 8
    :cond_0
    :try_start_1
    sget-object v1, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;->Companion:Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    sget-object v3, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    invoke-virtual {v1, v2, v3}, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;->unregister(Landroid/os/Looper;Lcom/tencent/bugly/common/looper/ILooperDispatchListener;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object v1

    sget-object v2, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/g;->b(Lcom/tencent/bugly/proguard/y9;)V

    const/4 v1, 0x0

    .line 10
    sput-object v1, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    .line 11
    const-string/jumbo v1, "msg_lag"

    invoke-static {v1}, Lcom/tencent/bugly/proguard/g2;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public static declared-synchronized a(JLcom/tencent/bugly/callback/Callback;)V
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/tc;

    monitor-enter v0

    .line 1
    :try_start_0
    const-string/jumbo v1, "msg_lag"

    invoke-static {v1, p2}, Lcom/tencent/bugly/proguard/g2;->a(Ljava/lang/String;Lcom/tencent/bugly/callback/Callback;)V

    .line 2
    sget-object p2, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    if-eqz p2, :cond_0

    .line 3
    sget-object p2, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    iput-wide p0, p2, Lcom/tencent/bugly/proguard/tc;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    .line 4
    :cond_0
    :try_start_1
    new-instance p2, Lcom/tencent/bugly/proguard/tc;

    invoke-direct {p2, p0, p1}, Lcom/tencent/bugly/proguard/tc;-><init>(J)V

    sput-object p2, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    .line 5
    sget-object p0, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;->Companion:Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;->register(Landroid/os/Looper;Lcom/tencent/bugly/common/looper/ILooperDispatchListener;)V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    move-result-object p0

    sget-object p1, Lcom/tencent/bugly/proguard/tc;->e:Lcom/tencent/bugly/proguard/tc;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/g;->a(Lcom/tencent/bugly/proguard/y9;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/tc;->c:Ljava/lang/String;

    return-void
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public onDispatchEnd(Ljava/lang/String;JJ)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/tc;->b:J

    .line 3
    .line 4
    cmp-long p1, p4, p1

    .line 5
    .line 6
    if-ltz p1, :cond_1

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "msg_lag"

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lcom/tencent/bugly/proguard/g2;->a(Ljava/lang/String;)Z

    .line 13
    move-result p2

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    goto :goto_0

    .line 17
    .line 18
    :cond_0
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    .line 19
    .line 20
    .line 21
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string/jumbo p3, "name"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    const-string/jumbo p1, "timeStamp"

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    move-result-wide v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2, p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    const-string/jumbo p1, "scene"

    .line 41
    .line 42
    iget-object p3, p0, Lcom/tencent/bugly/proguard/tc;->c:Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, p1, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    const-string p1, "delay"

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1, p4, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, Lcom/tencent/bugly/proguard/g2;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :catchall_0
    :cond_1
    :goto_0
    return-void
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
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method

.method public onDispatchStart(Ljava/lang/String;J)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
.end method
