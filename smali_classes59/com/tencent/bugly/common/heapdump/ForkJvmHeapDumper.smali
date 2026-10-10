.class public Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;
.super Lcom/tencent/bugly/common/heapdump/StripHeapDumper;
.source "BUGLY"


# static fields
.field public static final p:Ljava/lang/String; = "RMonitor_ForkDumper"

.field public static final q:J = 0xea60L

.field public static r:Z

.field public static s:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/a9;",
            ">;"
        }
    .end annotation
.end field

.field public static final t:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->s:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->t:Ljava/lang/Object;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/u4;->c()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    sget-boolean v0, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->m:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-boolean v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->r:Z

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/ie;->k()Lcom/tencent/bugly/proguard/ie;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ie;->c()I

    .line 26
    move-result v0

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->nInitForkDump(I)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    sput-boolean v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->r:Z

    .line 33
    :cond_1
    :goto_0
    return-void
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

.method public static a(Lcom/tencent/bugly/proguard/a9;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->t:Ljava/lang/Object;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->s:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 3
    sget-object v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->s:Ljava/util/ArrayList;

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Z)V
    .locals 3

    .line 5
    sget-object v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->t:Ljava/lang/Object;

    monitor-enter v0

    .line 6
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->s:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/a9;

    if-eqz p0, :cond_0

    .line 7
    invoke-interface {v2}, Lcom/tencent/bugly/proguard/a9;->b()V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 8
    :cond_0
    invoke-interface {v2}, Lcom/tencent/bugly/proguard/a9;->a()V

    goto :goto_0

    .line 9
    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static b(Lcom/tencent/bugly/proguard/a9;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->t:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->s:Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    throw p0
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

.method private static native nInitForkDump(I)Z
.end method

.method private static native nResumeVM(J)V
.end method

.method private static native nSuspendVM(JLjava/lang/String;I)I
.end method

.method private static native nWaitProcessExit(I)I
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I
    .locals 3
    .param p2    # Lcom/tencent/bugly/proguard/r7;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "dump "

    const-string v2, "RMonitor_ForkDumper"

    filled-new-array {v2, v1, p1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 11
    sget-boolean v1, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->m:Z

    if-nez v1, :cond_0

    .line 12
    const-string p1, "dump failed caused by so not loaded!"

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/16 p1, 0x65

    return p1

    .line 13
    :cond_0
    sget-boolean v1, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->r:Z

    if-nez v1, :cond_1

    .line 14
    const-string p1, "dump failed caused by Symbol is not resolved!"

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/16 p1, 0x66

    return p1

    .line 15
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/u4;->b()Z

    move-result v1

    if-nez v1, :cond_2

    .line 16
    const-string p1, "dump failed caused by disk space not enough!"

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/16 p1, 0x67

    return p1

    .line 17
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverL()Z

    move-result v1

    if-nez v1, :cond_3

    .line 18
    const-string p1, "dump failed caused by version net permitted!"

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/16 p1, 0x68

    return p1

    .line 19
    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 20
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 21
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 22
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->c(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I

    move-result p1

    return p1
.end method

.method public a()Z
    .locals 1

    .line 23
    sget-boolean v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->r:Z

    return v0
.end method

.method public final c(Ljava/lang/String;Lcom/tencent/bugly/proguard/r7;)I
    .locals 8
    .param p2    # Lcom/tencent/bugly/proguard/r7;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->a(Z)V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/tencent/bugly/proguard/k0;->a(Ljava/lang/Thread;)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/r7;->c()I

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->nSuspendVM(JLjava/lang/String;I)I

    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->a(Z)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-static {v2}, Lcom/tencent/bugly/proguard/k0;->a(Ljava/lang/Thread;)J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->nResumeVM(J)V

    .line 38
    .line 39
    const-string v2, "main process waiting dump result."

    .line 40
    .line 41
    const-string v3, "RMonitor_ForkDumper"

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 45
    .line 46
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 50
    .line 51
    new-instance v4, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper$a;

    .line 52
    .line 53
    .line 54
    invoke-direct {v4, p0, v2, v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper$a;-><init>(Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->b()Landroid/os/Handler;

    .line 58
    move-result-object v5

    .line 59
    .line 60
    .line 61
    const-wide/32 v6, 0xea60

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;->nWaitProcessExit(I)I

    .line 68
    move-result v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->b()Landroid/os/Handler;

    .line 72
    move-result-object v5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    new-instance v4, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v5, "main process wait result: "

    .line 80
    .line 81
    .line 82
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    .line 94
    if-eqz v0, :cond_1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 98
    move-result p1

    .line 99
    .line 100
    if-eqz p1, :cond_0

    .line 101
    .line 102
    const/16 p1, 0x6a

    .line 103
    goto :goto_0

    .line 104
    .line 105
    :cond_0
    const/16 p1, 0x69

    .line 106
    .line 107
    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/common/heapdump/StripHeapDumper;->a(Lcom/tencent/bugly/proguard/r7;Ljava/lang/Exception;)V

    .line 114
    return p1

    .line 115
    .line 116
    :cond_1
    new-instance p2, Ljava/io/File;

    .line 117
    .line 118
    .line 119
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 123
    move-result p1

    .line 124
    .line 125
    if-eqz p1, :cond_2

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 129
    move-result-wide p1

    .line 130
    .line 131
    .line 132
    const-wide/32 v2, 0x100000

    .line 133
    .line 134
    cmp-long p1, p1, v2

    .line 135
    .line 136
    if-lez p1, :cond_2

    .line 137
    return v1

    .line 138
    .line 139
    :cond_2
    const/16 p1, 0x6c

    .line 140
    return p1
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
.end method
