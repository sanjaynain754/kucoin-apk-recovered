.class public abstract Lcom/tencent/bugly/proguard/w0;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final i:Ljava/lang/String; = "BaseBatteryInfo"


# instance fields
.field public a:[Ljava/lang/StackTraceElement;

.field public b:J

.field public c:J

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/w0;->a:[Ljava/lang/StackTraceElement;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/w0;->c:J

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    iput-object v0, p0, Lcom/tencent/bugly/proguard/w0;->d:Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    iput-object v0, p0, Lcom/tencent/bugly/proguard/w0;->e:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/w0;->f:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/w0;->g:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/w0;->h:Z

    .line 47
    return-void
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


# virtual methods
.method public a(J)J
    .locals 4

    .line 9
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/w0;->c:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 10
    iget-wide p1, p0, Lcom/tencent/bugly/proguard/w0;->b:J

    sub-long/2addr v0, p1

    return-wide v0

    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/w0;->b:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public final a()Ljava/lang/String;
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/w0;->a:[Ljava/lang/StackTraceElement;

    if-eqz v1, :cond_5

    .line 3
    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    move v6, v5

    :goto_0
    if-ge v4, v2, :cond_5

    aget-object v7, v1, v4

    const/4 v8, 0x1

    if-eqz v5, :cond_1

    if-nez v6, :cond_0

    goto :goto_1

    :cond_0
    move v9, v3

    goto :goto_2

    :cond_1
    :goto_1
    move v9, v8

    .line 4
    :goto_2
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "java.lang.reflect.Proxy.invoke"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    move v6, v8

    .line 5
    :cond_2
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "$Proxy"

    invoke-virtual {v10, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_3

    move v5, v8

    :cond_3
    if-eqz v9, :cond_4

    goto :goto_3

    .line 6
    :cond_4
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 7
    const-string v7, "\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 8
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(J)Lorg/json/JSONObject;
    .locals 4

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "scene"

    .line 9
    .line 10
    iget-object v2, p0, Lcom/tencent/bugly/proguard/w0;->e:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    .line 15
    .line 16
    const-string/jumbo v1, "timestamp"

    .line 17
    .line 18
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/w0;->b:J

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 22
    .line 23
    const-string v1, "call_stack"

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/w0;->a()Ljava/lang/String;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 31
    .line 32
    const-string v1, "duration_in_ms"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/w0;->a(J)J

    .line 36
    move-result-wide p1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    const-string/jumbo p1, "thread_name"

    .line 43
    .line 44
    iget-object p2, p0, Lcom/tencent/bugly/proguard/w0;->d:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    return-object v0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    .line 51
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 52
    .line 53
    const-string v0, "BaseBatteryInfo"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    new-instance p1, Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 62
    return-object p1
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
.end method
