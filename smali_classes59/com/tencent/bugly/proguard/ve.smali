.class public Lcom/tencent/bugly/proguard/ve;
.super Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ve$b;
    }
.end annotation


# static fields
.field public static final e:I = 0x64


# instance fields
.field public b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

.field public c:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

.field public d:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ve;->c:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ve;->d:Landroid/os/Handler;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ve;)Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/ve;->c:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/ve;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ve;->a(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/xg;",
            ">;)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/ve$b;",
            ">;"
        }
    .end annotation

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/ve$b;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/ve$b;-><init>(Lcom/tencent/bugly/proguard/ve;)V

    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/xg;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/xg;->c:J

    iput-wide v2, v0, Lcom/tencent/bugly/proguard/ve$b;->a:J

    .line 6
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/xg;

    iget-wide v2, v2, Lcom/tencent/bugly/proguard/xg;->c:J

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/proguard/xg;

    iget-wide v4, v4, Lcom/tencent/bugly/proguard/xg;->e:J

    const-wide/16 v6, 0x3e8

    div-long/2addr v4, v6

    add-long/2addr v4, v2

    iput-wide v4, v0, Lcom/tencent/bugly/proguard/ve$b;->b:J

    const/4 v2, 0x1

    .line 7
    iput v2, v0, Lcom/tencent/bugly/proguard/ve$b;->c:I

    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/tencent/bugly/proguard/xg;

    iget-object v3, v3, Lcom/tencent/bugly/proguard/xg;->b:Ljava/lang/String;

    iput-object v3, v0, Lcom/tencent/bugly/proguard/ve$b;->e:Ljava/lang/String;

    .line 9
    iput v1, v0, Lcom/tencent/bugly/proguard/ve$b;->d:I

    .line 10
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    .line 12
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 13
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-object v5, v5, Lcom/tencent/bugly/proguard/xg;->b:Ljava/lang/String;

    iget-object v8, v0, Lcom/tencent/bugly/proguard/ve$b;->e:Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 14
    iget v5, v0, Lcom/tencent/bugly/proguard/ve$b;->c:I

    add-int/2addr v5, v2

    iput v5, v0, Lcom/tencent/bugly/proguard/ve$b;->c:I

    .line 15
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-wide v8, v5, Lcom/tencent/bugly/proguard/xg;->c:J

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-wide v10, v5, Lcom/tencent/bugly/proguard/xg;->e:J

    div-long/2addr v10, v6

    add-long/2addr v10, v8

    iput-wide v10, v0, Lcom/tencent/bugly/proguard/ve$b;->b:J

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/ve$b;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/ve$b;-><init>(Lcom/tencent/bugly/proguard/ve;)V

    .line 17
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-wide v8, v5, Lcom/tencent/bugly/proguard/xg;->c:J

    iput-wide v8, v0, Lcom/tencent/bugly/proguard/ve$b;->a:J

    .line 18
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-wide v8, v5, Lcom/tencent/bugly/proguard/xg;->c:J

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-wide v10, v5, Lcom/tencent/bugly/proguard/xg;->e:J

    div-long/2addr v10, v6

    add-long/2addr v10, v8

    iput-wide v10, v0, Lcom/tencent/bugly/proguard/ve$b;->b:J

    .line 19
    iput v2, v0, Lcom/tencent/bugly/proguard/ve$b;->c:I

    .line 20
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/xg;

    iget-object v5, v5, Lcom/tencent/bugly/proguard/xg;->b:Ljava/lang/String;

    iput-object v5, v0, Lcom/tencent/bugly/proguard/ve$b;->e:Ljava/lang/String;

    .line 21
    iput v1, v0, Lcom/tencent/bugly/proguard/ve$b;->d:I

    .line 22
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    return-object v3

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a()V

    :cond_0
    return-void
.end method

.method public final a(Lcom/tencent/rmonitor/looper/MonitorInfo;Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/rmonitor/looper/MonitorInfo;",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/xg;",
            ">;)V"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ve;->d:Landroid/os/Handler;

    new-instance v1, Lcom/tencent/bugly/proguard/ve$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/tencent/bugly/proguard/ve$a;-><init>(Lcom/tencent/bugly/proguard/ve;Lcom/tencent/rmonitor/looper/MonitorInfo;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c()Z

    .line 4
    move-result v0

    .line 5
    return v0
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

.method public checkStackTraceNormal()V
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

.method public dispatchEnd(Lcom/tencent/rmonitor/looper/MonitorInfo;JJ)V
    .locals 2
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e()Z

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    iget-wide v0, v0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 14
    .line 15
    cmp-long p4, p4, v0

    .line 16
    .line 17
    if-lez p4, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->appendData(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 21
    .line 22
    iget-object p4, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 26
    move-result-wide v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p4, v0, v1, p2, p3}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a(JJ)Ljava/util/ArrayList;

    .line 30
    move-result-object p2

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->copy()Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ve;->a(Lcom/tencent/rmonitor/looper/MonitorInfo;Ljava/util/ArrayList;)V

    .line 38
    :cond_1
    return-void
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

.method public dispatchStart(Lcom/tencent/rmonitor/looper/MonitorInfo;J)V
    .locals 0
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d()Z

    .line 8
    :cond_0
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
.end method

.method public init(Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z
    .locals 6
    .param p1    # Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v2, "looper_stack"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 20
    .line 21
    instance-of v2, v0, Lcom/tencent/bugly/proguard/kb;

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v0, Lcom/tencent/bugly/proguard/kb;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->d()Z

    .line 30
    move-result v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->c()Z

    .line 34
    move-result v0

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v1

    .line 37
    move v0, v3

    .line 38
    .line 39
    :goto_0
    new-instance v4, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThread()Ljava/lang/Thread;

    .line 43
    move-result-object v5

    .line 44
    .line 45
    .line 46
    invoke-direct {v4, v5, v2, v0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;-><init>(Ljava/lang/Thread;ZZ)V

    .line 47
    .line 48
    iput-object v4, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->b()Z

    .line 52
    move-result v0

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    return v3

    .line 56
    .line 57
    :cond_1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ve;->c:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    iget-wide v2, v0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 66
    long-to-int v0, v2

    .line 67
    .line 68
    mul-int/lit16 v0, v0, 0x3e8

    .line 69
    .line 70
    const/16 v2, 0x64

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, v2}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a(II)Z

    .line 74
    .line 75
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d()Z

    .line 79
    .line 80
    new-instance p1, Landroid/os/Handler;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 88
    .line 89
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ve;->d:Landroid/os/Handler;

    .line 90
    return v1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
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
.end method

.method public release()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ve;->b:Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e()Z

    .line 8
    :cond_0
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
.end method
