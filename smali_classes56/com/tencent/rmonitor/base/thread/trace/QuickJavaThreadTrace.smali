.class public Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_ThreadTrace"

.field public static h:Z


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Ljava/lang/Thread;

.field public e:J

.field public f:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "RMonitor_ThreadTrace"

    .line 3
    .line 4
    const-string v1, "init error, initResult = "

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    const-string v2, "rmonitor_base"

    .line 13
    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/bugly/proguard/ie;->k()Lcom/tencent/bugly/proguard/ie;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ie;->c()I

    .line 23
    move-result v2

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeInit(I)I

    .line 27
    move-result v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    const/4 v1, 0x1

    .line 31
    .line 32
    sput-boolean v1, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->h:Z

    .line 33
    .line 34
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 35
    .line 36
    const-string v2, "init success"

    .line 37
    .line 38
    .line 39
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    :cond_0
    sget-object v3, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    return-void

    .line 69
    .line 70
    :goto_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 71
    .line 72
    const-string v3, "init failed: "

    .line 73
    .line 74
    .line 75
    invoke-static {v3, v1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 84
    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread;ZZ)V
    .locals 13

    .line 1
    .line 2
    const-string v1, "RMonitor_ThreadTrace"

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a:Z

    .line 9
    .line 10
    iput v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->b:I

    .line 11
    .line 12
    iput v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c:I

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    iput-wide v3, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    .line 20
    .line 21
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 22
    .line 23
    sget-boolean v5, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->h:Z

    .line 24
    .line 25
    if-eqz v5, :cond_2

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    .line 31
    move-result v5

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5, p1}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->a(Ljava/lang/Thread;)I

    .line 41
    move-result v5

    .line 42
    int-to-long v9, v5

    .line 43
    .line 44
    cmp-long v5, v3, v9

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 49
    .line 50
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 51
    .line 52
    const-string p2, "NativeGetThreadID error"

    .line 53
    .line 54
    .line 55
    filled-new-array {v1, p2}, [Ljava/lang/String;

    .line 56
    move-result-object p2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/tencent/bugly/proguard/we;->b()V

    .line 63
    return-void

    .line 64
    :catchall_0
    move-exception v0

    .line 65
    move-object p1, v0

    .line 66
    goto :goto_0

    .line 67
    .line 68
    .line 69
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/k0;->a(Ljava/lang/Thread;)J

    .line 70
    move-result-wide v7

    .line 71
    move-object v6, p0

    .line 72
    move v11, p2

    .line 73
    .line 74
    move/from16 v12, p3

    .line 75
    .line 76
    .line 77
    invoke-virtual/range {v6 .. v12}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeCreate(JJZZ)J

    .line 78
    move-result-wide v7

    .line 79
    .line 80
    iput-wide v7, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    .line 81
    .line 82
    cmp-long v3, v7, v3

    .line 83
    .line 84
    if-eqz v3, :cond_1

    .line 85
    .line 86
    iput-object p1, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    .line 87
    .line 88
    iput-boolean p2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a:Z

    .line 89
    const/4 p1, 0x1

    .line 90
    .line 91
    iput-boolean p1, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 92
    return-void

    .line 93
    .line 94
    :cond_1
    iput-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    .line 95
    .line 96
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a:Z

    .line 97
    .line 98
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/tencent/bugly/proguard/we;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    return-void

    .line 103
    .line 104
    :goto_0
    iput-boolean v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 105
    .line 106
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 107
    .line 108
    const-string v0, "nativeCreate faild: "

    .line 109
    .line 110
    .line 111
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    .line 115
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 120
    :cond_2
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    return-wide v0
.end method

.method public static synthetic b(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->b:I

    return p0
.end method

.method public static synthetic c(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c:I

    return p0
.end method

.method public static c()Z
    .locals 1

    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->h:Z

    return v0
.end method

.method public static native nativeInit(I)I
.end method


# virtual methods
.method public a(JJ)Ljava/util/ArrayList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/xg;",
            ">;"
        }
    .end annotation

    .line 9
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v1, p0

    goto :goto_0

    .line 11
    :cond_1
    iget-wide v2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    move-object v1, p0

    move-wide v4, p1

    move-wide v6, p3

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeGetStackTrace(JJJ)Ljava/lang/String;

    move-result-object p1

    .line 12
    invoke-static {p1}, Lcom/tencent/bugly/proguard/yg;->a(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    .line 13
    invoke-static {p2}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 14
    iget-boolean p3, v1, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->a:Z

    if-eqz p3, :cond_2

    .line 15
    const-string p3, "#"

    invoke-virtual {p1, p3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p3

    add-int/lit8 p3, p3, 0x1

    invoke-virtual {p1, p3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    :cond_2
    return-object p2

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public a()V
    .locals 2

    .line 16
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 19
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    invoke-virtual {p0, v0, v1}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeDestroy(J)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(II)Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iput p1, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->b:I

    .line 5
    iput p2, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c:I

    .line 6
    new-instance p1, Ljava/lang/Thread;

    new-instance p2, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;

    invoke-direct {p2, p0}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace$a;-><init>(Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 7
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "QST-"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public b()Z
    .locals 1

    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeStart(J)V

    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 24
    return v0
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
.end method

.method public e()Z
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->f:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->d:Ljava/lang/Thread;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    iget-wide v0, p0, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->e:J

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->nativeStop(J)V

    .line 21
    const/4 v0, 0x1

    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 24
    return v0
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
.end method

.method public native nativeCreate(JJZZ)J
.end method

.method public native nativeDestroy(J)V
.end method

.method public native nativeGetStackTrace(JJJ)Ljava/lang/String;
.end method

.method public native nativePrepare(JJZII)V
.end method

.method public native nativeStart(J)V
.end method

.method public native nativeStop(J)V
.end method
