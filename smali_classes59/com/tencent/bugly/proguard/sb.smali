.class public Lcom/tencent/bugly/proguard/sb;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final A:I = 0x10

.field public static final B:I = 0x20

.field public static final o:Ljava/lang/String; = "RMonitor_MemoryCeiling"

.field public static final p:I = 0x1

.field public static final q:I = 0x1388

.field public static final r:I = 0x7530

.field public static final s:I = 0x80

.field public static final t:I = 0x400

.field public static u:Z = false

.field public static final v:Lcom/tencent/bugly/proguard/ub;

.field public static volatile w:Lcom/tencent/bugly/proguard/sb; = null

.field public static final x:I = 0x2

.field public static final y:I = 0x4

.field public static final z:I = 0x8


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/n4;

.field public final c:Landroid/os/Handler;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final d:Ljava/lang/StringBuilder;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final e:Lcom/tencent/bugly/proguard/vb;

.field public f:J

.field public g:I

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:J

.field public n:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/ub;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ub;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/sb;->v:Lcom/tencent/bugly/proguard/ub;

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    sput-object v0, Lcom/tencent/bugly/proguard/sb;->w:Lcom/tencent/bugly/proguard/sb;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/n4;

    .line 6
    .line 7
    const-wide/16 v3, 0x1388

    .line 8
    .line 9
    const-wide/16 v5, 0x7530

    .line 10
    .line 11
    const-wide/16 v1, 0x1388

    .line 12
    .line 13
    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/n4;-><init>(JJJ)V

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const/16 v1, 0x80

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 24
    .line 25
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sb;->d:Ljava/lang/StringBuilder;

    .line 26
    .line 27
    new-instance v0, Lcom/tencent/bugly/proguard/vb;

    .line 28
    .line 29
    sget-object v1, Lcom/tencent/bugly/proguard/sb;->v:Lcom/tencent/bugly/proguard/ub;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/vb;-><init>(Lcom/tencent/bugly/proguard/ub;)V

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sb;->e:Lcom/tencent/bugly/proguard/vb;

    .line 35
    const/4 v0, 0x0

    .line 36
    .line 37
    iput v0, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    .line 38
    const/4 v1, 0x3

    .line 39
    .line 40
    iput v1, p0, Lcom/tencent/bugly/proguard/sb;->h:I

    .line 41
    const/4 v1, 0x5

    .line 42
    .line 43
    iput v1, p0, Lcom/tencent/bugly/proguard/sb;->i:I

    .line 44
    .line 45
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->j:Z

    .line 46
    .line 47
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->l:Z

    .line 50
    .line 51
    const-wide/16 v0, 0x0

    .line 52
    .line 53
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/sb;->m:J

    .line 54
    .line 55
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/sb;->n:J

    .line 56
    .line 57
    new-instance v0, Landroid/os/Handler;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 65
    .line 66
    iput-object v0, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    .line 67
    return-void
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
.end method

.method public static a(Ljava/lang/String;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;)Lcom/tencent/rmonitor/base/meta/DumpResult;
    .locals 8

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    const-string v1, "java_memory_ceiling_hprof"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v2, p0

    move-object v1, p0

    move-object v5, p1

    .line 2
    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/lang/String;Ljava/lang/String;ZZLcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;ZI)Lcom/tencent/rmonitor/base/meta/DumpResult;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lcom/tencent/rmonitor/base/meta/DumpResult;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 3
    iget-boolean v0, p0, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    if-eqz v0, :cond_0

    .line 4
    sget-object v0, Lcom/tencent/bugly/proguard/sb;->v:Lcom/tencent/bugly/proguard/ub;

    const-string v1, "customDump"

    invoke-virtual {v0, p0, v1}, Lcom/tencent/bugly/proguard/ub;->a(Lcom/tencent/rmonitor/base/meta/DumpResult;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static a(Ljava/lang/String;ZI)Z
    .locals 9

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    move-result-object v0

    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 6
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p1, "RMonitor_MemoryCeiling"

    const-string p2, "customDumpAndReportHprof fail for invalid Dumper"

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    const-string v2, "java_memory_ceiling_hprof"

    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v3, p0

    move-object v2, p0

    move v7, p1

    move v8, p2

    .line 8
    invoke-static/range {v2 .. v8}, Lcom/tencent/bugly/proguard/yb;->a(Ljava/lang/String;Ljava/lang/String;ZZLcom/tencent/rmonitor/base/plugin/listener/IMemoryDumpListener;ZI)Lcom/tencent/rmonitor/base/meta/DumpResult;

    move-result-object p0

    .line 9
    iget-boolean p1, p0, Lcom/tencent/rmonitor/base/meta/DumpResult;->success:Z

    if-eqz p1, :cond_1

    .line 10
    sget-object p1, Lcom/tencent/bugly/proguard/sb;->v:Lcom/tencent/bugly/proguard/ub;

    invoke-virtual {p1, p0, v2}, Lcom/tencent/bugly/proguard/ub;->a(Lcom/tencent/rmonitor/base/meta/DumpResult;Ljava/lang/String;)V

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    return v1
.end method

.method public static b()Lcom/tencent/bugly/proguard/sb;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/sb;->w:Lcom/tencent/bugly/proguard/sb;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/sb;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/sb;->w:Lcom/tencent/bugly/proguard/sb;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/sb;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/sb;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/sb;->w:Lcom/tencent/bugly/proguard/sb;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/sb;->w:Lcom/tencent/bugly/proguard/sb;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 11
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_MemoryCeiling"

    const-string/jumbo v2, "start detect memory ceiling"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/n4;->a()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public final a(ZJ)V
    .locals 2

    if-eqz p1, :cond_2

    .line 14
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/sb;->j:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/sb;->l:Z

    if-eqz p1, :cond_1

    .line 15
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/sb;->n:J

    cmp-long p1, p2, v0

    if-lez p1, :cond_0

    .line 16
    iget p1, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    .line 17
    :cond_0
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/sb;->n:J

    return-void

    .line 18
    :cond_1
    iget p1, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    return-void

    :cond_2
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    return-void
.end method

.method public final b(ZJ)Z
    .locals 6

    .line 7
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/n4;->a()J

    move-result-wide v2

    const-wide/16 v4, 0x1388

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->l:Z

    if-eqz v0, :cond_1

    .line 9
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/sb;->m:J

    sub-long v2, p2, v2

    iget v0, p0, Lcom/tencent/bugly/proguard/sb;->i:I

    int-to-long v4, v0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    .line 10
    :cond_0
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/sb;->m:J

    :cond_1
    return v1
.end method

.method public c()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverL()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-string v2, "RMonitor_MemoryCeiling"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-string v0, "cannot start memory ceil monitor due to not support fork dump"

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    return v1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const-string v0, "cannot start memory ceil monitor due to not have valid dumper"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    return v1

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 38
    .line 39
    const-string v3, "java_memory_ceiling_hprof"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v3}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    .line 48
    const-string/jumbo v0, "report num is exceed today, please try next day"

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/fb;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    return v1

    .line 53
    :cond_2
    const/4 v0, 0x1

    .line 54
    return v0
    .line 55
    .line 56
    .line 57
.end method

.method public final d()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/ic;->a()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/sb;->f:J

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/sb;->f:J

    .line 17
    long-to-float v2, v2

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->b()F

    .line 21
    move-result v3

    .line 22
    long-to-float v0, v0

    .line 23
    mul-float/2addr v3, v0

    .line 24
    .line 25
    cmpl-float v0, v2, v3

    .line 26
    .line 27
    if-lez v0, :cond_0

    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    return v0
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
.end method

.method public final e()V
    .locals 5

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/common/util/AppInfo;->getPssMemory()J

    .line 9
    move-result-wide v0

    .line 10
    .line 11
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sb;->d:Ljava/lang/StringBuilder;

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 16
    .line 17
    iget-object v2, p0, Lcom/tencent/bugly/proguard/sb;->d:Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v3, "PSS="

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-wide/16 v3, 0x400

    .line 25
    div-long/2addr v0, v3

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, " KB HeapMax="

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    .line 41
    move-result-wide v0

    .line 42
    div-long/2addr v0, v3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v0, " KB HeapAlloc="

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Runtime;->totalMemory()J

    .line 58
    move-result-wide v0

    .line 59
    div-long/2addr v0, v3

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v0, " KB HeapFree="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Runtime;->freeMemory()J

    .line 75
    move-result-wide v0

    .line 76
    div-long/2addr v0, v3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v0, " KB"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 87
    .line 88
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sb;->d:Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    const-string v2, "RMonitor_MemoryCeiling"

    .line 95
    .line 96
    .line 97
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 102
    return-void
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
.end method

.method public final f()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/sb;->d()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/sb;->l:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/j7;->a()J

    .line 12
    move-result-wide v1

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/bugly/proguard/sb;->a(ZJ)V

    .line 19
    .line 20
    iget v3, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    .line 21
    .line 22
    iget v4, p0, Lcom/tencent/bugly/proguard/sb;->h:I

    .line 23
    .line 24
    if-lt v3, v4, :cond_1

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    iput v0, p0, Lcom/tencent/bugly/proguard/sb;->g:I

    .line 28
    const/4 v0, 0x1

    .line 29
    return v0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0, v0, v1, v2}, Lcom/tencent/bugly/proguard/sb;->b(ZJ)Z

    .line 33
    move-result v0

    .line 34
    return v0
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
.end method

.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "java_memory_ceiling_hprof"

    .line 3
    return-object v0
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

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-ne p1, v0, :cond_2

    .line 6
    .line 7
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    .line 9
    const-string v1, "handle memory detect ceiling message."

    .line 10
    .line 11
    const-string v2, "RMonitor_MemoryCeiling"

    .line 12
    .line 13
    .line 14
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/sb;->e()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/sb;->f()Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sb;->e:Lcom/tencent/bugly/proguard/vb;

    .line 30
    .line 31
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/sb;->f:J

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v3, v4}, Lcom/tencent/bugly/proguard/vb;->b(J)V

    .line 35
    .line 36
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 37
    .line 38
    const-string v3, "java_memory_ceiling_hprof"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v3}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 42
    move-result v1

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->a()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    iget-object v1, v1, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 51
    .line 52
    iget v1, v1, Lcom/tencent/bugly/proguard/hf;->h:I

    .line 53
    .line 54
    const-string v3, " max report num: "

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    const-string v4, "memory celling report count above, remove MSG_MEMORY_CALCULATE msg,"

    .line 61
    .line 62
    .line 63
    filled-new-array {v2, v4, v3, v1}, [Ljava/lang/String;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 68
    .line 69
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 73
    goto :goto_0

    .line 74
    .line 75
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    .line 76
    .line 77
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/n4;->a()J

    .line 81
    move-result-wide v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 85
    :cond_2
    :goto_0
    return v0
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

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 3
    return v0
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

.method public start()V
    .locals 7

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 3
    .line 4
    const-string v1, "RMonitor_MemoryCeiling"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v2, "MemoryCeilingMonitor is alreay started"

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/sb;->c()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 27
    .line 28
    const-string v2, "Start MemoryCeilingMonitor"

    .line 29
    .line 30
    .line 31
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 36
    const/4 v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 39
    .line 40
    iget-object v1, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/n4;->b()V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    iget v1, v1, Lcom/tencent/bugly/proguard/tb;->o:I

    .line 50
    .line 51
    iput v1, p0, Lcom/tencent/bugly/proguard/sb;->h:I

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    iget v1, v1, Lcom/tencent/bugly/proguard/tb;->p:I

    .line 58
    .line 59
    iput v1, p0, Lcom/tencent/bugly/proguard/sb;->i:I

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    .line 63
    move-result v1

    .line 64
    const/4 v2, 0x0

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    iget-boolean v1, v1, Lcom/tencent/bugly/proguard/tb;->q:Z

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    move v1, v0

    .line 76
    goto :goto_0

    .line 77
    :cond_1
    move v1, v2

    .line 78
    .line 79
    :goto_0
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/sb;->j:Z

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lcom/tencent/bugly/proguard/j7;->a()J

    .line 83
    move-result-wide v3

    .line 84
    .line 85
    iput-wide v3, p0, Lcom/tencent/bugly/proguard/sb;->n:J

    .line 86
    .line 87
    iput-wide v3, p0, Lcom/tencent/bugly/proguard/sb;->m:J

    .line 88
    .line 89
    const-wide/16 v5, 0x0

    .line 90
    .line 91
    cmp-long v1, v3, v5

    .line 92
    .line 93
    if-ltz v1, :cond_2

    .line 94
    goto :goto_1

    .line 95
    :cond_2
    move v0, v2

    .line 96
    .line 97
    :goto_1
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->l:Z

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/sb;->a()V

    .line 101
    .line 102
    .line 103
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    const-string v1, "java_memory_ceiling_hprof"

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 117
    .line 118
    const-string v2, "has not valid dumper, start failed"

    .line 119
    .line 120
    .line 121
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 126
    return-void
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
.end method

.method public stop()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 3
    .line 4
    const-string v1, "RMonitor_MemoryCeiling"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v2, "MemoryCeilingMonitor is already stop"

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    const/4 v0, 0x0

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/sb;->k:Z

    .line 29
    .line 30
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 31
    .line 32
    const-string v2, "Stop MemoryCeilingMonitor"

    .line 33
    .line 34
    .line 35
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sb;->b:Lcom/tencent/bugly/proguard/n4;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/n4;->c()V

    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/bugly/proguard/sb;->c:Landroid/os/Handler;

    .line 47
    const/4 v1, 0x1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    const-string v1, "java_memory_ceiling_hprof"

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

    .line 64
    :cond_1
    return-void
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
.end method
