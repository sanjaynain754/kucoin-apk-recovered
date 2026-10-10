.class public Lcom/tencent/bugly/proguard/k3;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static A:I = 0xbb8

.field public static B:I = 0x5000

.field public static C:J = 0xc800000L

.field public static D:J = 0x240c8400L

.field public static E:Ljava/lang/String; = null

.field public static F:Z = false

.field public static G:Ljava/lang/String; = null

.field public static H:I = 0x1388

.field public static I:Z = true

.field public static J:Z = true

.field public static K:J = 0x2L

.field public static L:J = 0x7530L

.field public static M:J = 0x2710L

.field public static final N:Ljava/lang/String; = "local_crash_lock"

.field public static final O:J = 0x2710L

.field public static P:Ljava/lang/String; = null

.field public static Q:Ljava/lang/String; = null

.field public static R:Lcom/tencent/bugly/proguard/k3; = null

.field public static n:I = 0x0

.field public static o:Z = false

.field public static final p:I = 0x5265c00

.field public static final q:I = 0xbb8

.field public static final r:I = 0x3e8

.field public static final s:I = 0x5265c00

.field public static final t:J = 0x3L

.field public static final u:J = 0x14L

.field public static v:I = 0x2

.field public static w:Z = false

.field public static x:I = 0xf000

.field public static y:I = 0x2800

.field public static z:I = 0x32


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/tencent/bugly/proguard/j3;

.field public final c:Lcom/tencent/bugly/proguard/fa;

.field public final d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

.field public final e:Lcom/tencent/bugly/proguard/pg;

.field public final f:Lcom/tencent/bugly/proguard/m0;

.field public final g:Lcom/tencent/bugly/proguard/u;

.field public h:Lcom/tencent/bugly/proguard/b2$a;

.field public i:Lcom/tencent/bugly/proguard/zf;

.field public j:Ljava/lang/Boolean;

.field public k:I

.field public l:Z

.field public final m:Lcom/tencent/bugly/proguard/o3;


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

.method public constructor <init>(ILandroid/content/Context;Lcom/tencent/bugly/proguard/m0;ZLcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;Ljava/lang/String;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x1f

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k3;->l:Z

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/bugly/proguard/o3;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/o3;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 18
    .line 19
    sput p1, Lcom/tencent/bugly/proguard/k3;->n:I

    .line 20
    .line 21
    .line 22
    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    iput-object v1, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    iput-object v2, p0, Lcom/tencent/bugly/proguard/k3;->e:Lcom/tencent/bugly/proguard/pg;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/tencent/bugly/proguard/k3;->f:Lcom/tencent/bugly/proguard/m0;

    .line 34
    .line 35
    iput-object p5, p0, Lcom/tencent/bugly/proguard/k3;->h:Lcom/tencent/bugly/proguard/b2$a;

    .line 36
    .line 37
    iput-object p6, p0, Lcom/tencent/bugly/proguard/k3;->i:Lcom/tencent/bugly/proguard/zf;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lcom/tencent/bugly/proguard/rh;->d()Lcom/tencent/bugly/proguard/rh;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 45
    move-result-object v5

    .line 46
    .line 47
    new-instance v3, Lcom/tencent/bugly/proguard/j3;

    .line 48
    move-object v6, v3

    .line 49
    move-object v3, v1

    .line 50
    move-object v1, v6

    .line 51
    move-object v7, p5

    .line 52
    move-object v8, p6

    .line 53
    move-object v6, v2

    .line 54
    move v2, p1

    .line 55
    .line 56
    .line 57
    invoke-direct/range {v1 .. v8}, Lcom/tencent/bugly/proguard/j3;-><init>(ILandroid/content/Context;Lcom/tencent/bugly/proguard/rh;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;)V

    .line 58
    move-object p1, v3

    .line 59
    move-object v3, v1

    .line 60
    move-object v1, p1

    .line 61
    move-object p1, v5

    .line 62
    move-object v2, v6

    .line 63
    .line 64
    iput-object v3, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    .line 65
    .line 66
    .line 67
    invoke-static {v1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    new-instance v0, Lcom/tencent/bugly/proguard/fa;

    .line 71
    .line 72
    .line 73
    invoke-direct {v0, v1, v3, v2, p2}, Lcom/tencent/bugly/proguard/fa;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;)V

    .line 74
    .line 75
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    .line 76
    move-object v5, p3

    .line 77
    move v6, p4

    .line 78
    .line 79
    move-object/from16 v7, p7

    .line 80
    move-object v4, v2

    .line 81
    move-object v2, p2

    .line 82
    .line 83
    .line 84
    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/m0;ZLjava/lang/String;)Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 85
    move-result-object p2

    .line 86
    move-object p4, v2

    .line 87
    move-object v2, v4

    .line 88
    .line 89
    iput-object p2, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 90
    .line 91
    iput-object p2, p4, Lcom/tencent/bugly/proguard/l2;->l0:Lcom/tencent/bugly/proguard/cd;

    .line 92
    move-object v5, p1

    .line 93
    move-object v4, p3

    .line 94
    move-object v7, p5

    .line 95
    move-object v6, v3

    .line 96
    move-object v3, p4

    .line 97
    .line 98
    .line 99
    invoke-static/range {v1 .. v7}, Lcom/tencent/bugly/proguard/u;->a(Landroid/content/Context;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/m0;Lcom/tencent/bugly/proguard/e4;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/b2$a;)Lcom/tencent/bugly/proguard/u;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    .line 103
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/k3;)Lcom/tencent/bugly/proguard/fa;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    return-object p0
.end method

.method public static declared-synchronized a(ILandroid/content/Context;ZLcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;Ljava/lang/String;)Lcom/tencent/bugly/proguard/k3;
    .locals 10

    const-class v1, Lcom/tencent/bugly/proguard/k3;

    monitor-enter v1

    .line 9
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;

    if-nez v0, :cond_0

    .line 10
    new-instance v2, Lcom/tencent/bugly/proguard/k3;

    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v5

    move v3, p0

    move-object v4, p1

    move v6, p2

    move-object v7, p3

    move-object v8, p4

    move-object v9, p5

    invoke-direct/range {v2 .. v9}, Lcom/tencent/bugly/proguard/k3;-><init>(ILandroid/content/Context;Lcom/tencent/bugly/proguard/m0;ZLcom/tencent/bugly/proguard/b2$a;Lcom/tencent/bugly/proguard/zf;Ljava/lang/String;)V

    sput-object v2, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 11
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/k3;Ljava/util/List;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/k3;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic c(Lcom/tencent/bugly/proguard/k3;)Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    return-object p0
.end method

.method public static synthetic d(Lcom/tencent/bugly/proguard/k3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->n()V

    return-void
.end method

.method public static synthetic e(Lcom/tencent/bugly/proguard/k3;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->a()V

    return-void
.end method

.method public static declared-synchronized l()Lcom/tencent/bugly/proguard/k3;
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/k3;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/k3;->R:Lcom/tencent/bugly/proguard/k3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit v0

    .line 7
    return-object v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    throw v1
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->b:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setUserOpened(Z)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public B()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->disableCatchAnrTrace()V

    .line 6
    return-void
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

.method public declared-synchronized C()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public declared-synchronized D()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->testNativeCrash()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final a()V
    .locals 4

    .line 49
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j3;->a()Ljava/util/List;

    move-result-object v0

    .line 50
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 51
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 52
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 53
    iget-boolean v2, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g:Z

    if-eqz v2, :cond_0

    .line 54
    invoke-static {}, Lcom/tencent/bugly/proguard/b4;->c()Lcom/tencent/bugly/proguard/b4;

    move-result-object v2

    iget-object v3, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    iget-object v1, v1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->e:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lcom/tencent/bugly/proguard/b4;->e(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 55
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_1
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 58
    iput p1, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    return-void
.end method

.method public a(JZ)V
    .locals 2

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/k3$d;

    invoke-direct {v1, p0, p3}, Lcom/tencent/bugly/proguard/k3$d;-><init>(Lcom/tencent/bugly/proguard/k3;Z)V

    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/fa;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->onStrategyChanged(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/u;->a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    return-void
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/proguard/zf;)V
    .locals 1

    monitor-enter p0

    .line 12
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    if-eqz v0, :cond_0

    .line 13
    iput-object p1, v0, Lcom/tencent/bugly/proguard/j3;->e:Lcom/tencent/bugly/proguard/zf;
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

.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZZ)V
    .locals 9

    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v0

    .line 4
    const-string v1, "error_report"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    instance-of v1, v0, Lcom/tencent/bugly/proguard/d5;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/tencent/bugly/proguard/d5;

    .line 6
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/d5;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "java error report is disabled, please modify your project\'s setting"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 8
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/k3$c;

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move v2, p3

    move-object v5, p4

    move-object v6, p5

    move v8, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lcom/tencent/bugly/proguard/k3$c;-><init>(Lcom/tencent/bugly/proguard/k3;ZLjava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZZ)V

    const-wide/16 p1, 0x0

    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInLogThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x14

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    const/4 v5, 0x0

    if-lez v1, :cond_1

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-static {p1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    move v6, v5

    :goto_0
    int-to-long v7, v6

    cmp-long v7, v7, v3

    if-gez v7, :cond_0

    add-int/lit8 v7, v0, -0x1

    sub-int/2addr v7, v6

    .line 23
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 24
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 29
    iget v8, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    const/4 v9, 0x3

    if-ne v8, v9, :cond_2

    iget-wide v10, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    sub-long v10, v6, v10

    sget-wide v12, Lcom/tencent/bugly/proguard/k3;->L:J

    cmp-long v10, v10, v12

    if-ltz v10, :cond_4

    :cond_2
    if-eqz v8, :cond_3

    if-ne v8, v2, :cond_7

    :cond_3
    iget-wide v10, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    sub-long v10, v6, v10

    sget-wide v12, Lcom/tencent/bugly/proguard/k3;->M:J

    cmp-long v8, v10, v12

    if-gez v8, :cond_7

    .line 30
    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v10, "crash may in upload process, try add to delay list, crash type: "

    invoke-direct {v8, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v8, v10}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    iget-boolean v8, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o0:Z

    if-nez v8, :cond_6

    .line 32
    iget v8, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    if-ne v8, v9, :cond_5

    .line 33
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 34
    :cond_5
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    :goto_2
    iput-boolean v2, v4, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o0:Z

    .line 36
    invoke-virtual {p0, v4}, Lcom/tencent/bugly/proguard/k3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    goto :goto_1

    .line 37
    :cond_6
    new-array v4, v5, [Ljava/lang/Object;

    .line 38
    sget-object v8, Lcom/tencent/rmonitor/common/logger/LogState;->DEBUG:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v9, "crash in upload delay process, do not add to delay upload list again."

    invoke-static {v8, v9, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_1

    .line 39
    :cond_7
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 40
    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "try upload crash, "

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " immediately, "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " crash delay, "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " anr delay."

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v5, [Ljava/lang/Object;

    .line 42
    invoke-static {p1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 43
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k3;->b(Ljava/util/List;)V

    .line 44
    sget-wide v4, Lcom/tencent/bugly/proguard/k3;->L:J

    invoke-virtual {p0, v1, v4, v5}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/util/List;J)V

    .line 45
    sget-wide v0, Lcom/tencent/bugly/proguard/k3;->M:J

    invoke-virtual {p0, v3, v0, v1}, Lcom/tencent/bugly/proguard/k3;->a(Ljava/util/List;J)V

    return-void
.end method

.method public final a(Ljava/util/List;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;J)V"
        }
    .end annotation

    .line 46
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "do post a delay upload task to upload crash, delay time: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 48
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object v0

    new-instance v1, Lcom/tencent/bugly/proguard/k3$e;

    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/k3$e;-><init>(Lcom/tencent/bugly/proguard/k3;Ljava/util/List;)V

    invoke-virtual {v0, v1, p2, p3}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/k3;->l:Z

    return-void
.end method

.method public declared-synchronized a(ZZZ)V
    .locals 1

    monitor-enter p0

    .line 17
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    invoke-virtual {v0, p1, p2, p3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->testNativeCrash(ZZZ)V
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

.method public a(Landroid/content/Context;)[B
    .locals 2

    .line 56
    iget-object p1, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/j3;->b()Ljava/util/List;

    move-result-object p1

    .line 57
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;Z)[B

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 2

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/tencent/bugly/proguard/x;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->removeEmptyNativeRecordFiles()V

    :cond_0
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/util/List;JZZZ)V

    .line 4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "do upload db crash immediately, upload crash num: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public declared-synchronized c()V
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->e()V

    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->f()V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public d()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->c:Z

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    new-instance v2, Lcom/tencent/bugly/proguard/k3$b;

    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/k3$b;-><init>(Lcom/tencent/bugly/proguard/k3;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/u;->c(Z)V

    return-void
.end method

.method public e()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->a:Z

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/fa;->d()V

    return-void
.end method

.method public f()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->b:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setUserOpened(Z)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public g()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->b:Lcom/tencent/bugly/proguard/j3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j3;->b()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    move-result v0

    .line 15
    return v0
    .line 16
    .line 17
.end method

.method public h()V
    .locals 3

    .line 1
    .line 2
    const-string v0, "crash upload with json = "

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "crash_report"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    instance-of v2, v1, Lcom/tencent/bugly/proguard/s3;

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    check-cast v1, Lcom/tencent/bugly/proguard/s3;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/s3;->c()Ljava/lang/Boolean;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    move-result v1

    .line 27
    .line 28
    sput-boolean v1, Lcom/tencent/bugly/proguard/l2;->H0:Z

    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    sget-boolean v0, Lcom/tencent/bugly/proguard/l2;->H0:Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    const/4 v1, 0x0

    .line 44
    .line 45
    new-array v1, v1, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 54
    :cond_0
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public i()Lcom/tencent/bugly/proguard/u;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

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

.method public j()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

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

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/k3;->l:Z

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

.method public m()Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getNativeExceptionHandler()Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final n()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/b4;->c()Lcom/tencent/bugly/proguard/b4;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b4;->d(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/b4;->c()Lcom/tencent/bugly/proguard/b4;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b4;->b(Landroid/content/Context;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/b4;->c()Lcom/tencent/bugly/proguard/b4;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->a:Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b4;->a(Landroid/content/Context;)V

    .line 28
    return-void
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

.method public o()Z
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->j:Ljava/lang/Boolean;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Lcom/tencent/bugly/proguard/e4;->a()Lcom/tencent/bugly/proguard/e4;

    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/proguard/e4;->a(I)Ljava/util/List;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    new-instance v3, Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    if-eqz v1, :cond_4

    .line 32
    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    move-result v4

    .line 36
    .line 37
    if-lez v4, :cond_4

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v4

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v4

    .line 52
    .line 53
    check-cast v4, Lcom/tencent/bugly/proguard/ab;

    .line 54
    .line 55
    iget-object v5, v4, Lcom/tencent/bugly/proguard/ab;->c:Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result v5

    .line 60
    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 64
    .line 65
    iput-object v5, p0, Lcom/tencent/bugly/proguard/k3;->j:Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    goto :goto_0

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 73
    move-result v0

    .line 74
    .line 75
    if-lez v0, :cond_3

    .line 76
    .line 77
    const-class v0, Lcom/tencent/bugly/proguard/e4;

    .line 78
    monitor-enter v0

    .line 79
    .line 80
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/e4;->a:Lcom/tencent/bugly/proguard/e4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    monitor-exit v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v3}, Lcom/tencent/bugly/proguard/e4;->a(Ljava/util/List;)V

    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception v1

    .line 87
    monitor-exit v0

    .line 88
    throw v1

    .line 89
    :cond_3
    :goto_1
    return v2

    .line 90
    .line 91
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k3;->j:Ljava/lang/Boolean;

    .line 94
    const/4 v0, 0x0

    .line 95
    return v0
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

.method public p()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/u;->e()Z

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public declared-synchronized q()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 4
    .line 5
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/o3;->a:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/fa;->b()V

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 24
    .line 25
    iget-boolean v1, v1, Lcom/tencent/bugly/proguard/o3;->b:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->reRegisterNativeHandler(Z)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 33
    .line 34
    iget-boolean v1, v1, Lcom/tencent/bugly/proguard/o3;->c:Z

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->reRegisterANRHandler(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    goto :goto_2

    .line 39
    .line 40
    .line 41
    :goto_1
    :try_start_1
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    :cond_1
    :goto_2
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :catchall_1
    move-exception v0

    .line 45
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    throw v0
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

.method public r()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x8

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public s()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x10

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public t()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public u()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public v()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/k3;->k:I

    .line 3
    .line 4
    and-int/lit8 v0, v0, 0x4

    .line 5
    .line 6
    if-lez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public declared-synchronized w()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->z()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->A()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k3;->x()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
    .line 16
    .line 17
.end method

.method public x()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->c:Z

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 25
    move-result-wide v4

    .line 26
    .line 27
    cmp-long v0, v2, v4

    .line 28
    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->unBlockSigquit(Z)V

    .line 37
    .line 38
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/u;->c(Z)V

    .line 42
    return-void

    .line 43
    .line 44
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 52
    .line 53
    new-instance v2, Lcom/tencent/bugly/proguard/k3$a;

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/k3$a;-><init>(Lcom/tencent/bugly/proguard/k3;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->g:Lcom/tencent/bugly/proguard/u;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/u;->c(Z)V

    .line 65
    return-void
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

.method public y()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->enableCatchAnrTrace()V

    .line 6
    return-void
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

.method public z()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->m:Lcom/tencent/bugly/proguard/o3;

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/o3;->a:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k3;->c:Lcom/tencent/bugly/proguard/fa;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/fa;->c()V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
