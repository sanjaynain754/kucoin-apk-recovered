.class public Lcom/tencent/bugly/proguard/u;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final A:Ljava/lang/String; = "/data/anr/"

.field public static final B:Ljava/lang/String; = "ANR_EXCEPTION"

.field public static final C:I = 0x2710

.field public static final D:I = 0x64

.field public static E:Lcom/tencent/bugly/proguard/u; = null

.field public static volatile F:Ljava/lang/String; = null

.field public static volatile G:J = -0x1L

.field public static final r:I = 0x18c00

.field public static final s:Ljava/lang/String; = "bugly"

.field public static final t:Ljava/lang/String; = "bugly_trace_"

.field public static final u:Ljava/lang/String; = "manual_bugly_trace_"

.field public static final v:Ljava/lang/String; = "main_stack_record_"

.field public static final w:Ljava/lang/String; = ".merged"

.field public static final x:Ljava/lang/String; = ".txt"

.field public static final y:I = 0x2710

.field public static final z:J = 0x5208L


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final b:Landroid/content/Context;

.field public final c:Landroid/app/ActivityManager;

.field public final d:Lcom/tencent/bugly/proguard/l2;

.field public final e:Lcom/tencent/bugly/proguard/m0;

.field public final f:Lcom/tencent/bugly/proguard/pg;

.field public final g:Lcom/tencent/bugly/proguard/j3;

.field public final h:Ljava/lang/Object;

.field public i:Ljava/lang/String;

.field public j:Landroid/os/FileObserver;

.field public k:Z

.field public l:Lcom/tencent/bugly/proguard/wg;

.field public m:I

.field public n:J

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:J


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

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/m0;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/b2$a;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance p5, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    const/4 p7, 0x0

    .line 7
    .line 8
    .line 9
    invoke-direct {p5, p7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 10
    .line 11
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    new-instance p5, Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-direct {p5}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    .line 19
    const/4 p5, 0x1

    .line 20
    .line 21
    iput-boolean p5, p0, Lcom/tencent/bugly/proguard/u;->k:Z

    .line 22
    .line 23
    const-wide/16 v0, 0x0

    .line 24
    .line 25
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/u;->n:J

    .line 26
    .line 27
    const-string p5, ""

    .line 28
    .line 29
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->o:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->p:Ljava/lang/String;

    .line 32
    .line 33
    const-wide/16 v0, -0x1

    .line 34
    .line 35
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/u;->q:J

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 39
    move-result-object p5

    .line 40
    .line 41
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    .line 42
    .line 43
    const-string v0, "activity"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p5, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    move-result-object p5

    .line 48
    .line 49
    check-cast p5, Landroid/app/ActivityManager;

    .line 50
    .line 51
    iput-object p5, p0, Lcom/tencent/bugly/proguard/u;->c:Landroid/app/ActivityManager;

    .line 52
    .line 53
    .line 54
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getDumpFilePath()Ljava/lang/String;

    .line 55
    move-result-object p5

    .line 56
    .line 57
    .line 58
    invoke-static {p5}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 59
    move-result p5

    .line 60
    .line 61
    if-eqz p5, :cond_0

    .line 62
    .line 63
    const-string p5, "bugly"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p5, p7}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    iput-object p1, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 74
    goto :goto_0

    .line 75
    .line 76
    .line 77
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getDumpFilePath()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    iput-object p1, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 81
    .line 82
    :goto_0
    iput-object p3, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    .line 83
    .line 84
    iput-object p4, p0, Lcom/tencent/bugly/proguard/u;->e:Lcom/tencent/bugly/proguard/m0;

    .line 85
    .line 86
    iput-object p2, p0, Lcom/tencent/bugly/proguard/u;->f:Lcom/tencent/bugly/proguard/pg;

    .line 87
    .line 88
    iput-object p6, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    .line 89
    .line 90
    .line 91
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b;->d()Lcom/tencent/rmonitor/base/config/b;

    .line 92
    move-result-object p1

    .line 93
    .line 94
    const-string p2, "common"

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 98
    move-result-object p1

    .line 99
    .line 100
    instance-of p2, p1, Lcom/tencent/bugly/proguard/m2;

    .line 101
    .line 102
    if-eqz p2, :cond_1

    .line 103
    .line 104
    check-cast p1, Lcom/tencent/bugly/proguard/m2;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/m2;->f()Z

    .line 108
    move-result p1

    .line 109
    .line 110
    sput-boolean p1, Lcom/tencent/bugly/proguard/v;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :catchall_0
    :cond_1
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/u;)Lcom/tencent/bugly/proguard/m0;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/u;->e:Lcom/tencent/bugly/proguard/m0;

    return-object p0
.end method

.method public static a(Landroid/content/Context;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/m0;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/b2$a;)Lcom/tencent/bugly/proguard/u;
    .locals 9

    .line 6
    sget-object v0, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;

    if-nez v0, :cond_0

    .line 7
    new-instance v1, Lcom/tencent/bugly/proguard/u;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Lcom/tencent/bugly/proguard/u;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/m0;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/b2$a;)V

    sput-object v1, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;

    .line 8
    :cond_0
    sget-object p0, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/u;JLjava/lang/String;)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/u;->a(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/u;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-void
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/u;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;)Z
    .locals 0

    .line 4
    invoke-static {p0}, Lcom/tencent/bugly/proguard/u;->b(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/u;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->i()V

    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 1

    .line 45
    const-string v0, "manual_bugly_trace_"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ".txt"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/u;)Lcom/tencent/bugly/proguard/l2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    return-object p0
.end method

.method public static declared-synchronized c()Lcom/tencent/bugly/proguard/u;
    .locals 2

    const-class v0, Lcom/tencent/bugly/proguard/u;

    monitor-enter v0

    .line 2
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/u;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 12

    .line 39
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    sget-object v1, Lcom/tencent/bugly/proguard/se$c;->d:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 40
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->p:Ljava/lang/String;

    .line 41
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 42
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Thread;)Ljava/lang/String;

    move-result-object v0

    .line 43
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    sget-object v3, Lcom/tencent/bugly/proguard/se$c;->e:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    .line 44
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-lez v4, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    move v4, v2

    .line 45
    :goto_0
    invoke-virtual {v1, v3, v2, v4}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZZ)V

    .line 46
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/u;->a(Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v11

    if-nez v11, :cond_2

    .line 47
    new-array p1, v2, [Ljava/lang/Object;

    const-string/jumbo v0, "pack anr fail!"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p1, 0x0

    return-object p1

    .line 48
    :cond_2
    sget-object p1, Lcom/tencent/bugly/proguard/k7$d;->a:Lcom/tencent/bugly/proguard/k7;

    .line 49
    iget-wide v0, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    const-wide/32 v3, 0xea60

    sub-long v3, v0, v3

    .line 50
    invoke-virtual {p1, v3, v4, v0, v1}, Lcom/tencent/bugly/proguard/k7;->a(JJ)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 51
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q0:Ljava/lang/String;

    .line 52
    :cond_3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v11}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 53
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$c;->f:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0, v5}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 54
    invoke-virtual {p0, v11}, Lcom/tencent/bugly/proguard/u;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 55
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v11}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 56
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/t;->a()Lcom/tencent/bugly/proguard/t;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/t;->c()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 57
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->o:Ljava/lang/String;

    .line 58
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    new-instance p1, Lcom/tencent/bugly/proguard/nb;

    .line 60
    invoke-static {}, Lcom/tencent/bugly/proguard/t;->a()Lcom/tencent/bugly/proguard/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/t;->b()Lcom/tencent/bugly/proguard/sc;

    move-result-object v0

    invoke-static {}, Lcom/tencent/bugly/proguard/ce;->b()Lcom/tencent/bugly/proguard/ce;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/tencent/bugly/proguard/nb;-><init>(Lcom/tencent/bugly/proguard/sc;Lcom/tencent/bugly/proguard/ae;)V

    .line 61
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/nb;->a()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    .line 62
    :cond_4
    :goto_1
    const-string/jumbo v0, "save main thread\'s message schedule info"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 63
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/tencent/bugly/proguard/b4;->c()Lcom/tencent/bugly/proguard/b4;

    move-result-object v3

    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    const-string v6, "anr"

    sget-object v7, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    .line 64
    invoke-virtual {v3, v4, v6, v7}, Lcom/tencent/bugly/proguard/b4;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_5

    .line 66
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 67
    :cond_5
    new-instance v1, Ljava/io/File;

    const-string v3, "main_thread_msg.json"

    invoke-direct {v1, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_6

    .line 69
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z

    :cond_6
    const-wide/32 v3, 0x7fffffff

    .line 70
    invoke-static {v1, p1, v3, v4, v2}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z

    .line 71
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    .line 72
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$b;->f:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 73
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 74
    :cond_7
    :goto_3
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$c;->g:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0, v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    move p1, v2

    :goto_4
    const/16 v0, 0x2710

    if-ge p1, v0, :cond_9

    .line 75
    sget-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-eqz v0, :cond_8

    sget-object v0, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    if-eqz v0, :cond_8

    .line 76
    sget-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    iput-wide v0, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 77
    sget-object p1, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    iput-object p1, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    .line 78
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v11}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 79
    sget-object p1, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    .line 80
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$b;->i:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V

    goto :goto_5

    :cond_8
    const-wide/16 v0, 0x64

    .line 81
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/bi;->c(J)V

    add-int/lit8 p1, p1, 0x64

    goto :goto_4

    .line 82
    :cond_9
    :goto_5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v11}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 83
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    iget-object v10, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    const-string v6, "ANR"

    const-string v9, "main"

    invoke-static/range {v6 .. v11}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 84
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->L()Z

    move-result p1

    sget v0, Lcom/tencent/bugly/proguard/k3;->B:I

    invoke-static {p1, v0, v2, v5}, Lcom/tencent/bugly/proguard/bi;->a(ZIZZ)Ljava/util/Map;

    move-result-object p1

    .line 85
    iput-object p1, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 86
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    if-eqz p1, :cond_a

    .line 87
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0x32

    if-lt p1, v0, :cond_a

    .line 88
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$b;->b:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V

    .line 89
    :cond_a
    invoke-static {v11}, Lcom/tencent/bugly/proguard/g5;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 90
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v11}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 91
    invoke-static {}, Lcom/tencent/bugly/proguard/eb;->b()[B

    move-result-object p1

    iput-object p1, v11, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    return-object v11
.end method

.method public a(Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 4

    if-nez p2, :cond_0

    .line 9
    :try_start_0
    new-instance p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-direct {p2}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 10
    :cond_0
    :goto_0
    iget-wide v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 11
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/u;->q:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    .line 12
    iput-wide v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    goto :goto_1

    .line 13
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    :cond_2
    :goto_1
    const/4 v0, 0x3

    .line 14
    iput v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 15
    const-string v0, "ANR_EXCEPTION"

    iput-object v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 16
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 17
    :cond_3
    const-string p1, "main stack is null , some error may be encountered."

    :goto_2
    iput-object p1, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 18
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, p1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iput-object v0, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 19
    iget-object p1, p1, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object p1, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 20
    sget-object p1, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {p1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->getOperationLogString()Ljava/util/List;

    move-result-object p1

    iput-object p1, p2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    if-eqz p1, :cond_4

    .line 21
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    .line 22
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/proguard/se$b;->c:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    return-object p2

    .line 23
    :goto_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Ljava/util/List;J)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ng;",
            ">;J)",
            "Ljava/lang/String;"
        }
    .end annotation

    if-eqz p1, :cond_4

    .line 131
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 132
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1000

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 133
    const-string v1, "\n>>>>> \u4ee5\u4e0b\u4e3aanr\u8fc7\u7a0b\u4e2d\u4e3b\u7ebf\u7a0b\u5806\u6808\u8bb0\u5f55\uff0c\u53ef\u6839\u636e\u5806\u6808\u51fa\u73b0\u6b21\u6570\u63a8\u6d4b\u5728\u8be5\u5806\u6808\u963b\u585e\u7684\u65f6\u95f4\uff0c\u51fa\u73b0\u6b21\u6570\u8d8a\u591a\u5bf9anr\u8d21\u732e\u8d8a\u5927\uff0c\u8d8a\u53ef\u80fd\u662f\u9020\u6210anr\u7684\u539f\u56e0 >>>>>\n\n>>>>> Thread Stack Traces Records Start >>>>>\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    .line 134
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 135
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/bugly/proguard/ng;

    .line 136
    const-string v3, "Thread name:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ng;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ng;->b()J

    move-result-wide v4

    sub-long/2addr v4, p2

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-gtz v6, :cond_1

    .line 138
    const-string v6, "before "

    goto :goto_1

    :cond_1
    const-string v6, "after "

    .line 139
    :goto_1
    const-string v7, "Got "

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    const-string v6, "anr:"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v4, "ms\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/ng;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    mul-int/lit8 v2, v2, 0x2

    const v3, 0x18c00

    if-lt v2, v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 143
    :cond_3
    :goto_2
    const-string p1, "\n<<<<< Thread Stack Traces Records End <<<<<\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 145
    :cond_4
    :goto_3
    const-string p1, "main thread stack not enable\n"

    return-object p1
.end method

.method public final a(JLjava/lang/String;)V
    .locals 2

    .line 150
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "anr time:%s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 151
    invoke-virtual {p0, p3, p1, p2}, Lcom/tencent/bugly/proguard/u;->a(Ljava/lang/String;J)V

    return-void
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 1

    monitor-enter p0

    const/4 p1, 0x0

    .line 149
    :try_start_0
    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "customer decides whether to open or close."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/app/ActivityManager$ProcessErrorStateInfo;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 92
    new-array p1, v0, [Ljava/lang/Object;

    const-string/jumbo p2, "pack anr fail!"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 93
    const-string v1, "Find process anr, but unable to get anr message."

    goto :goto_0

    :cond_1
    iget-object v1, p2, Landroid/app/ActivityManager$ProcessErrorStateInfo;->shortMsg:Ljava/lang/String;

    :goto_0
    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    if-nez p2, :cond_2

    .line 94
    const-string p2, ""

    goto :goto_1

    :cond_2
    iget-object p2, p2, Landroid/app/ActivityManager$ProcessErrorStateInfo;->longMsg:Ljava/lang/String;

    .line 95
    :goto_1
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    const-string v2, "BUGLY_CR_01"

    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_3

    .line 96
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v1, 0x32

    if-lt p2, v1, :cond_3

    .line 97
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p2

    sget-object v1, Lcom/tencent/bugly/proguard/se$b;->h:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V

    .line 98
    :cond_3
    iget-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b:J

    const-wide/16 v3, 0x0

    cmp-long p2, v1, v3

    if-ltz p2, :cond_4

    .line 99
    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "backup anr record success!"

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_2

    .line 100
    :cond_4
    new-array p2, v0, [Ljava/lang/Object;

    const-string v0, "backup anr record fail!"

    invoke-static {v0, p2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 101
    :goto_2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/o4;->f(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p2, p1, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z

    move-result p2

    if-nez p2, :cond_5

    .line 102
    iget-object p2, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    const-wide/16 v2, 0xbb8

    invoke-virtual {p2, p1, v2, v3, v1}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V

    .line 103
    :cond_5
    iget-object p2, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/j3;->g(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-void
.end method

.method public final a(Ljava/lang/String;J)V
    .locals 5

    .line 104
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "trace file:%s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_4

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    .line 106
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "bugly_trace_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".txt"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    const-string/jumbo v2, "trace file exists"

    new-array v3, v1, [Ljava/lang/Object;

    .line 108
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 109
    const-string v2, "/data/anr/"

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 110
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 111
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v3

    invoke-static {v3}, Lcom/tencent/bugly/proguard/x;->a(I)Ljava/lang/String;

    move-result-object v3

    .line 112
    invoke-virtual {p0, p1, v2, v3}, Lcom/tencent/bugly/proguard/u;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    .line 113
    const-string v2, "backup trace isOK:%s"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 114
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    .line 115
    :cond_1
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    .line 116
    const-string/jumbo v2, "trace file rename :%s"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 117
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v2, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 118
    :goto_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    monitor-enter p1

    .line 119
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    if-eqz v2, :cond_2

    .line 120
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/wg;->b()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    .line 121
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 122
    invoke-virtual {p0, v2, p2, p3}, Lcom/tencent/bugly/proguard/u;->a(Ljava/util/List;J)Ljava/lang/String;

    move-result-object p1

    .line 123
    const-string/jumbo v2, "save main stack trace"

    new-array v1, v1, [Ljava/lang/Object;

    .line 124
    invoke-static {v4, v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    const-wide/32 v1, 0x7fffffff

    const/4 v3, 0x1

    .line 125
    invoke-static {v0, p1, v1, v2, v3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/io/File;Ljava/lang/String;JZ)Z

    .line 126
    :cond_3
    sput-wide p2, Lcom/tencent/bugly/proguard/u;->G:J

    .line 127
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    return-void

    .line 128
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    .line 129
    :cond_4
    :goto_3
    const-string/jumbo p1, "trace file is null or not exists, just ignore"

    new-array p2, v1, [Ljava/lang/Object;

    .line 130
    sget-object p3, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {p3, p1, p2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final declared-synchronized a(Z)V
    .locals 2

    monitor-enter p0

    .line 146
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/u;->k:Z

    if-eq v0, p1, :cond_0

    .line 147
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "user change anr %b"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 148
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/u;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a()Z
    .locals 2

    const-wide/16 v0, -0x1

    .line 152
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/u;->q:J

    .line 153
    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->p:Ljava/lang/String;

    .line 154
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->o:Ljava/lang/String;

    const/4 v0, 0x1

    return v0
.end method

.method public final a(J)Z
    .locals 4

    .line 155
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/u;->n:J

    sub-long v0, p1, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2710

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/16 p1, 0x2710

    .line 156
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "should not process ANR too Fre in %dms"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p1, 0x1

    return p1

    .line 157
    :cond_0
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/u;->n:J

    const/4 p1, 0x0

    return p1
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 10

    const/4 v0, 0x1

    .line 24
    invoke-static {p3, p1, v0}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_5

    .line 25
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_1

    .line 26
    :cond_0
    new-instance p3, Ljava/lang/StringBuilder;

    const/16 v2, 0x400

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    iget-object v2, p1, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    const-string v3, "main"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    const-string v4, "\n\n"

    const-string v5, "\n"

    const-string v6, " :\n"

    const/4 v7, 0x3

    const/4 v8, 0x2

    if-eqz v2, :cond_1

    .line 28
    array-length v9, v2

    if-lt v9, v7, :cond_1

    .line 29
    const-string v9, "\"main\" tid="

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v9, v2, v8

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v9, v2, v1

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v2, v0

    .line 30
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    :cond_1
    iget-object p1, p1, Lcom/tencent/bugly/proguard/bh$c;->d:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 32
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    .line 33
    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    array-length v9, v9

    if-lt v9, v7, :cond_2

    .line 34
    const-string v9, "\""

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "\" tid="

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    aget-object v9, v9, v8

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    aget-object v9, v9, v1

    invoke-virtual {p3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    aget-object v2, v2, v0

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 37
    :cond_4
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->length()I

    move-result p3

    mul-int/2addr p3, v8

    invoke-static {p2, p1, p3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result p1

    return p1

    .line 38
    :cond_5
    :goto_1
    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "not found trace dump for %s"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v1
.end method

.method public declared-synchronized b()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 3

    .line 2
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->i()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->k()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->e()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->C()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->D()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->E()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/o4;->b(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->o()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->f()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->h()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->g()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 14
    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 15
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    iget-boolean v1, v0, Lcom/tencent/bugly/proguard/l2;->i0:Z

    iput-boolean v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Z

    .line 17
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    .line 21
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e0:Ljava/util/Map;

    .line 22
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 23
    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    const/4 v0, -0x1

    :goto_0
    if-lez v0, :cond_1

    .line 24
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, "GET_FAIL"

    :goto_1
    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 25
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 26
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    .line 27
    :cond_2
    const-string v0, "main(1)"

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->W:Ljava/lang/String;

    .line 29
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->v()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->u()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->r:Ljava/util/Map;

    .line 31
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->P:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a0:Ljava/lang/String;

    .line 32
    iget-wide v1, v0, Lcom/tencent/bugly/proguard/l2;->c:J

    iput-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 33
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result v0

    iput-boolean v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 34
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result v0

    iput v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 35
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->A()I

    move-result v0

    iput v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 36
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m0:Ljava/lang/String;

    .line 39
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u7;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n0:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 40
    :goto_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_3
    return-void
.end method

.method public declared-synchronized b(Z)V
    .locals 0

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 42
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->k()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 7

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 14
    :try_start_0
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    :try_start_1
    iget-object v5, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    if-eqz v5, :cond_0

    .line 16
    const-string v5, "Disable record main stack trace."

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 17
    iget-object v5, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/wg;->a()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 18
    :cond_0
    :goto_0
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    :try_start_2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object p1

    .line 20
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v4

    const-string v5, "anr"

    invoke-virtual {v4, v5}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->saveAdditionalAttachmentPaths(Ljava/lang/String;)V

    .line 21
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v4

    const-string v5, "anr"

    invoke-virtual {v4, v5}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getNativeProcessInfo(Ljava/lang/String;)V

    .line 22
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v4

    sget-object v5, Lcom/tencent/bugly/proguard/se$c;->h:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v4, v5, v3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 23
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v4}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/tencent/bugly/proguard/v;->a(Landroid/content/Context;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 24
    :cond_1
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->c:Landroid/app/ActivityManager;

    const-wide/16 v5, 0x5208

    invoke-static {v4, v5, v6}, Lcom/tencent/bugly/proguard/v;->a(Landroid/app/ActivityManager;J)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    move-result-object v4

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_6

    .line 25
    :cond_2
    :goto_1
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->c:Landroid/app/ActivityManager;

    const-wide/16 v5, 0x0

    invoke-static {v4, v5, v6}, Lcom/tencent/bugly/proguard/v;->a(Landroid/app/ActivityManager;J)Landroid/app/ActivityManager$ProcessErrorStateInfo;

    move-result-object v4

    :goto_2
    if-nez v4, :cond_3

    .line 26
    sget-boolean v5, Lcom/tencent/bugly/proguard/v;->c:Z

    if-nez v5, :cond_3

    .line 27
    const-string/jumbo p1, "proc state is invisible or not my proc!"

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {p1, v4}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 28
    sput-object v2, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    .line 29
    sput-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    .line 30
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    return-void

    .line 31
    :cond_3
    :try_start_3
    invoke-virtual {p0, p1, v4}, Lcom/tencent/bugly/proguard/u;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Landroid/app/ActivityManager$ProcessErrorStateInfo;)V

    .line 32
    iget-object p1, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    monitor-enter p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 33
    :try_start_4
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    if-eqz v4, :cond_4

    .line 34
    const-string v4, "Finish anr process."

    new-array v5, v3, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 35
    iget-object v4, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/tencent/bugly/proguard/wg;->b(Z)V

    goto :goto_3

    :catchall_2
    move-exception v4

    goto :goto_4

    .line 36
    :cond_4
    :goto_3
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 37
    sput-object v2, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    .line 38
    sput-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    .line 39
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    return-void

    .line 40
    :goto_4
    :try_start_5
    monitor-exit p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    throw v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 41
    :goto_5
    :try_start_7
    monitor-exit v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 42
    :goto_6
    :try_start_9
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 43
    sput-object v2, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    .line 44
    sput-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    .line 45
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    return-void

    :catchall_3
    move-exception p1

    .line 46
    sput-object v2, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    .line 47
    sput-wide v0, Lcom/tencent/bugly/proguard/u;->G:J

    .line 48
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    .line 49
    throw p1
.end method

.method public c(Z)V
    .locals 2

    .line 7
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->a(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->f()Z

    move-result p1

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object p1

    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->d()Z

    move-result v0

    if-eq p1, v0, :cond_2

    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "anr changed to %b"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->b(Z)V

    :cond_2
    return-void
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/16 v3, 0x32

    cmp-long p1, v1, v3

    if-lez p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public final d(Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    :try_start_0
    const-string/jumbo v1, "read trace first dump for create time!"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 4
    invoke-static {p1, v2}, Lcom/tencent/bugly/proguard/bh;->a(Ljava/lang/String;Z)Lcom/tencent/bugly/proguard/bh$c;

    move-result-object v1

    const-wide/16 v3, -0x1

    if-eqz v1, :cond_1

    .line 5
    iget-wide v5, v1, Lcom/tencent/bugly/proguard/bh$c;->c:J

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    move-wide v5, v3

    :goto_0
    cmp-long v1, v5, v3

    if-nez v1, :cond_2

    .line 6
    const-string/jumbo v1, "trace dump fail could not get time!"

    new-array v2, v2, [Ljava/lang/Object;

    .line 7
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 9
    :cond_2
    invoke-virtual {p0, v5, v6}, Lcom/tencent/bugly/proguard/u;->a(J)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    .line 10
    :cond_3
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    const-string v2, "ANR"

    sget-object v3, Lcom/tencent/bugly/proguard/se$c;->b:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->recordProcessingState(Ljava/lang/String;I)V

    .line 11
    invoke-virtual {p0, v5, v6, p1}, Lcom/tencent/bugly/proguard/u;->a(JLjava/lang/String;)V

    .line 12
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->g()Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object p1

    .line 13
    iget-object v1, p0, Lcom/tencent/bugly/proguard/u;->g:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 14
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    sget-object v2, Lcom/tencent/bugly/proguard/se$c;->c:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    invoke-virtual {v1, v2, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 15
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/u;->c(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 16
    :goto_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    .line 19
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v1, "handle anr error %s"

    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :goto_2
    return-void
.end method

.method public declared-synchronized d()Z
    .locals 1

    monitor-enter p0

    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final d(Z)Z
    .locals 2

    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    .line 21
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v1, "tryChangeAnrState to %s, success:%s"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0
.end method

.method public declared-synchronized e(Ljava/lang/String;)V
    .locals 0

    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public declared-synchronized f()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/u;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
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

.method public g()Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 6
    .line 7
    sget-wide v1, Lcom/tencent/bugly/proguard/u;->G:J

    .line 8
    .line 9
    iput-wide v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 10
    .line 11
    sget-object v1, Lcom/tencent/bugly/proguard/u;->F:Ljava/lang/String;

    .line 12
    .line 13
    iput-object v1, v0, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public h()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    :try_start_0
    const-string/jumbo v0, "preDumpAnrInfo"

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    new-array v2, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/u;->q:J

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/bugly/proguard/t;->a()Lcom/tencent/bugly/proguard/t;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/t;->c()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    new-instance v0, Lcom/tencent/bugly/proguard/nb;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/tencent/bugly/proguard/t;->a()Lcom/tencent/bugly/proguard/t;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/t;->b()Lcom/tencent/bugly/proguard/sc;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/ce;->b()Lcom/tencent/bugly/proguard/ce;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v2, v3}, Lcom/tencent/bugly/proguard/nb;-><init>(Lcom/tencent/bugly/proguard/sc;Lcom/tencent/bugly/proguard/ae;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/nb;->a()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->o:Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    const-string/jumbo v0, "pre save main thread\'s message schedule info"

    .line 52
    .line 53
    new-array v1, v1, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/Thread;)Ljava/lang/String;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->p:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_2

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 78
    :goto_2
    const/4 v0, 0x1

    .line 79
    return v0
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

.method public final i()V
    .locals 5

    .line 1
    .line 2
    sget-wide v0, Lcom/tencent/bugly/proguard/k3;->D:J

    .line 3
    .line 4
    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v2

    .line 7
    add-long/2addr v2, v0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    .line 11
    move-result-wide v0

    .line 12
    sub-long/2addr v2, v0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 15
    .line 16
    const-string v1, "bugly_trace_"

    .line 17
    .line 18
    const-string v4, ".txt"

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1, v4, v2, v3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "manual_bugly_trace_"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v4, v2, v3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 31
    .line 32
    const-string v1, "main_stack_record_"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v4, v2, v3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 38
    .line 39
    const-string v4, ".txt.merged"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v4, v2, v3}, Lcom/tencent/bugly/proguard/a7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 43
    return-void
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

.method public final j()V
    .locals 5

    .line 1
    .line 2
    const-string v0, "Bugly-ThreadMonitor"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    .line 5
    monitor-enter v1

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Thread;->isAlive()Z

    .line 13
    move-result v2

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_0
    :goto_0
    new-instance v2, Lcom/tencent/bugly/proguard/wg;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2}, Lcom/tencent/bugly/proguard/wg;-><init>()V

    .line 24
    .line 25
    iput-object v2, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->N()Z

    .line 31
    move-result v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/wg;->a(Z)V

    .line 35
    .line 36
    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 37
    .line 38
    new-instance v3, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    iget v0, p0, Lcom/tencent/bugly/proguard/u;->m:I

    .line 44
    .line 45
    add-int/lit8 v4, v0, 0x1

    .line 46
    .line 47
    iput v4, p0, Lcom/tencent/bugly/proguard/u;->m:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 58
    .line 59
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->d:Lcom/tencent/bugly/proguard/l2;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->N()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/wg;->e()Z

    .line 71
    :cond_1
    monitor-exit v1

    .line 72
    return-void

    .line 73
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    throw v0
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

.method public final declared-synchronized k()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->d()Z

    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-array v0, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "start when started!"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 26
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    monitor-exit p0

    .line 30
    return-void

    .line 31
    .line 32
    .line 33
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->j()V

    .line 34
    .line 35
    new-instance v0, Lcom/tencent/bugly/proguard/u$d;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 38
    .line 39
    const/16 v3, 0x8

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, p0, v2, v3}, Lcom/tencent/bugly/proguard/u$d;-><init>(Lcom/tencent/bugly/proguard/u;Ljava/lang/String;I)V

    .line 43
    .line 44
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_3
    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    .line 48
    .line 49
    .line 50
    const-string/jumbo v0, "startWatchingPrivateAnrDir! dumFilePath is %s"

    .line 51
    .line 52
    iget-object v2, p0, Lcom/tencent/bugly/proguard/u;->i:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 56
    move-result-object v2

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->e:Lcom/tencent/bugly/proguard/m0;

    .line 62
    .line 63
    new-instance v2, Lcom/tencent/bugly/proguard/u$e;

    .line 64
    .line 65
    .line 66
    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/u$e;-><init>(Lcom/tencent/bugly/proguard/u;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    goto :goto_0

    .line 71
    :catchall_1
    move-exception v0

    .line 72
    const/4 v2, 0x0

    .line 73
    .line 74
    :try_start_4
    iput-object v2, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 75
    .line 76
    new-array v1, v1, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    const-string/jumbo v2, "startWatchingPrivateAnrDir failed!"

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 83
    .line 84
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 88
    move-result v1

    .line 89
    .line 90
    if-nez v1, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 94
    :cond_2
    :goto_0
    monitor-exit p0

    .line 95
    return-void

    .line 96
    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 97
    throw v0
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

.method public declared-synchronized l()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->d()Z

    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-array v0, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "start when started!"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    .line 22
    :cond_0
    :try_start_1
    new-instance v0, Lcom/tencent/bugly/proguard/u$a;

    .line 23
    .line 24
    const-string v2, "/data/anr/"

    .line 25
    .line 26
    const/16 v3, 0x8

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p0, v2, v3}, Lcom/tencent/bugly/proguard/u$a;-><init>(Lcom/tencent/bugly/proguard/u;Ljava/lang/String;I)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    .line 34
    :try_start_2
    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    .line 35
    .line 36
    .line 37
    const-string/jumbo v0, "start anr monitor!"

    .line 38
    .line 39
    new-array v2, v1, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    .line 44
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->e:Lcom/tencent/bugly/proguard/m0;

    .line 45
    .line 46
    new-instance v2, Lcom/tencent/bugly/proguard/u$b;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/u$b;-><init>(Lcom/tencent/bugly/proguard/u;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    goto :goto_0

    .line 54
    :catchall_1
    move-exception v0

    .line 55
    const/4 v2, 0x0

    .line 56
    .line 57
    :try_start_3
    iput-object v2, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 58
    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const-string/jumbo v2, "start anr monitor failed!"

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 66
    .line 67
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 77
    :cond_1
    :goto_0
    monitor-exit p0

    .line 78
    return-void

    .line 79
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 80
    throw v0
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

.method public final m()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->h:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/wg;->f()Z

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/u;->l:Lcom/tencent/bugly/proguard/wg;

    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    :goto_0
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v1
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
.end method

.method public final declared-synchronized n()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->d()Z

    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-array v0, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v1, "close when closed!"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->m()V

    .line 23
    .line 24
    new-array v0, v1, [Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    const-string/jumbo v2, "stopWatchingPrivateAnrDir"

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    :try_start_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 39
    .line 40
    const-string v0, "close anr monitor!"

    .line 41
    .line 42
    new-array v2, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v0, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 48
    goto :goto_0

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    .line 51
    .line 52
    :try_start_3
    const-string/jumbo v2, "stop anr monitor failed!"

    .line 53
    .line 54
    new-array v1, v1, [Ljava/lang/Object;

    .line 55
    .line 56
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 57
    .line 58
    .line 59
    invoke-static {v3, v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 69
    :cond_1
    :goto_0
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_1
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 72
    throw v0
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

.method public declared-synchronized o()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->d()Z

    .line 5
    move-result v0

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    new-array v0, v1, [Ljava/lang/Object;

    .line 11
    .line 12
    const-string v1, "close when closed!"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/tencent/bugly/proguard/u;->j:Landroid/os/FileObserver;

    .line 28
    .line 29
    const-string v0, "close anr monitor!"

    .line 30
    .line 31
    new-array v2, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    goto :goto_0

    .line 36
    :catchall_1
    move-exception v0

    .line 37
    .line 38
    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    const-string/jumbo v2, "stop anr monitor failed!"

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 45
    .line 46
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 56
    :cond_1
    :goto_0
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    throw v0
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

.method public p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :goto_0
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    const/16 v2, 0x1e

    .line 6
    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    .line 10
    :try_start_0
    const-string/jumbo v0, "try main sleep for make a test anr! try:%d/30 , kill it if you don\'t want to wait!"

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 22
    .line 23
    const-wide/16 v2, 0x1388

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/bi;->c(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 39
    :cond_0
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

.method public q()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/u;->e()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-array v0, v1, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v2, "anr is processing, return"

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 15
    return v1

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/u;->c:Landroid/app/ActivityManager;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/bugly/proguard/v;->b(Landroid/app/ActivityManager;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    new-array v0, v1, [Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "proc is not in anr, wait next check"

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 32
    return v1

    .line 33
    .line 34
    .line 35
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    move-result-wide v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v2, v3}, Lcom/tencent/bugly/proguard/u;->a(J)Z

    .line 40
    move-result v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    return v1

    .line 44
    :cond_2
    const/4 v0, 0x1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/u;->d(Z)Z

    .line 48
    move-result v0

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    sget-object v2, Lcom/tencent/bugly/proguard/se$c;->b:Lcom/tencent/bugly/proguard/se$c;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 60
    move-result v2

    .line 61
    .line 62
    const-string v3, "ANR"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3, v2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->recordProcessingState(Ljava/lang/String;I)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    new-instance v2, Lcom/tencent/bugly/proguard/u$c;

    .line 72
    .line 73
    .line 74
    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/u$c;-><init>(Lcom/tencent/bugly/proguard/u;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    .line 78
    :cond_3
    return v0
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
