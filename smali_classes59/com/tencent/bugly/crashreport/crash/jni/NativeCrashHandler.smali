.class public Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/cd;
.implements Lcom/tencent/bugly/proguard/ad$a;


# static fields
.field public static final A:I = 0x11

.field public static final B:I = 0x12

.field public static final C:I = 0x13

.field public static final D:I = 0x14

.field public static final E:I = 0x15

.field public static final F:I = 0x16

.field public static final G:I = 0x17

.field public static final H:I = 0x18

.field public static final I:I = 0x19

.field public static final J:I = 0x1a

.field public static final K:I = 0x1b

.field public static final L:I = 0x1c

.field public static final M:I = 0x1d

.field public static final N:I = 0x1e

.field public static final O:I = 0x1f

.field public static final P:I = 0x20

.field public static final Q:I = 0x21

.field public static final R:I = 0x22

.field public static final S:I = 0x23

.field public static final T:I = 0x24

.field public static final U:I = 0x25

.field public static final V:I = 0x26

.field public static final W:I = 0x27

.field public static final X:I = 0x28

.field public static final Y:I = 0x800

.field public static final Z:Ljava/lang/String; = "native_record_lock"

.field public static final a0:Ljava/lang/String; = "native_crash_"

.field public static final b0:J = 0x2710L

.field public static final c0:J = 0x2710L

.field public static enableNativeDumpAllThreadStack:Z = false

.field public static k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler; = null

.field public static l:I = 0x1

.field public static m:Ljava/lang/String; = null

.field public static n:Z = false

.field public static o:Z = false

.field public static final p:Ljava/lang/String; = "com.tencent.feedback.eup.jni.NativeExceptionUpload"

.field public static q:Z = true

.field public static final r:I = 0x3e7

.field public static final s:I = 0x3e6

.field public static final t:I = 0xa

.field public static final u:I = 0xb

.field public static final v:I = 0xc

.field public static final w:I = 0xd

.field public static final x:I = 0xe

.field public static final y:I = 0xf

.field public static final z:I = 0x10


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/tencent/bugly/proguard/l2;

.field public final c:Lcom/tencent/bugly/proguard/m0;

.field public d:Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

.field public final e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Lcom/tencent/bugly/proguard/j3;


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

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/m0;ZLjava/lang/String;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SdCardPath"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 p4, 0x0

    .line 5
    .line 6
    iput-boolean p4, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 7
    .line 8
    iput-boolean p4, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 11
    .line 12
    iput-boolean p4, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->i:Z

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;)Landroid/content/Context;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 19
    .line 20
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-static {p7}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_0
    const-string p7, "bugly"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p7, p4}, Landroid/content/Context;->getDir(Ljava/lang/String;I)Ljava/io/File;

    .line 39
    move-result-object p4

    .line 40
    .line 41
    .line 42
    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 43
    move-result-object p7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :catchall_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    .line 48
    move-result-object p4

    .line 49
    .line 50
    iget-object p4, p4, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    .line 51
    .line 52
    const-string p7, "/data/data/"

    .line 53
    .line 54
    const-string v0, "/app_bugly"

    .line 55
    .line 56
    .line 57
    invoke-static {p7, p4, v0}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object p7

    .line 59
    .line 60
    :goto_0
    sput-object p7, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 61
    .line 62
    :cond_1
    iput-object p3, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->j:Lcom/tencent/bugly/proguard/j3;

    .line 63
    .line 64
    iput-object p2, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    .line 65
    .line 66
    iput-object p5, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c:Lcom/tencent/bugly/proguard/m0;

    .line 67
    .line 68
    iput-boolean p6, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->e:Z

    .line 69
    .line 70
    new-instance p4, Lcom/tencent/bugly/proguard/bd;

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    .line 74
    move-result-object p5

    .line 75
    .line 76
    .line 77
    invoke-direct {p4, p1, p2, p3, p5}, Lcom/tencent/bugly/proguard/bd;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;)V

    .line 78
    .line 79
    iput-object p4, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lcom/tencent/bugly/proguard/ad;->b()Lcom/tencent/bugly/proguard/ad;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p0}, Lcom/tencent/bugly/proguard/ad;->a(Lcom/tencent/bugly/proguard/ad$a;)V

    .line 87
    return-void
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

.method public static declared-synchronized getDumpFilePath()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;
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

.method public static declared-synchronized getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
    .locals 2

    const-class v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
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

.method public static declared-synchronized getInstance(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/m0;ZLjava/lang/String;)Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
    .locals 10

    const-class v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    monitor-enter v1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    if-nez v0, :cond_0

    .line 2
    new-instance v2, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    move v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v2 .. v9}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;-><init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/m0;ZLjava/lang/String;)V

    sput-object v2, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p0, v0

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    sget-object p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;
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

.method private native getSoCpuAbi()Ljava/lang/String;
.end method

.method public static isShouldHandleInJava()Z
    .locals 1

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->q:Z

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

.method public static setCustomFileUploadAble(Z)V
    .locals 0

    .line 1
    .line 2
    sput-boolean p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->o:Z

    .line 3
    return-void
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
.end method

.method public static declared-synchronized setDumpFilePath(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-class v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->n:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    const/4 p0, 0x0

    .line 9
    .line 10
    new-array p0, p0, [Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "setDumpFilePath after register, just return"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    :try_start_1
    sput-object p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw p0
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
.end method

.method public static setShouldHandleInJava(Z)V
    .locals 3

    .line 1
    .line 2
    sput-boolean p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->q:Z

    .line 3
    .line 4
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->k:Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, ""

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    const/16 v1, 0x3e7

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 26
    :cond_0
    return-void
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
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/bugly/proguard/se;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v2, v1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/l2;->o:Ljava/lang/String;

    invoke-virtual {p0, v0, v2, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setCrashProcessingInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

    invoke-static {v0, p1, v1}, Lcom/tencent/bugly/proguard/dd;->a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 3
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "[Native] Get crash from native record."

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 4
    iget-object v2, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->j:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v2, v0, v1}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    new-array v0, v1, [Ljava/lang/Object;

    .line 6
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v3, "[Native] Native crash record Need to upload."

    invoke-static {v2, v3, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 7
    :cond_0
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/dd;->a(ZLjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final declared-synchronized a(Z)V
    .locals 2

    monitor-enter p0

    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->i:Z

    if-eq v0, p1, :cond_0

    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v1, "user change native %b"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    iput-boolean p1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->i:Z
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

.method public final a(ILjava/lang/String;)Z
    .locals 2

    .line 11
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeInfo(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 13
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :catch_0
    :cond_1
    return v1
.end method

.method public appendLogToNative(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    const-class v0, Ljava/lang/String;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_4

    .line 15
    .line 16
    if-eqz p2, :cond_4

    .line 17
    .line 18
    if-nez p3, :cond_1

    .line 19
    goto :goto_1

    .line 20
    .line 21
    :cond_1
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->appendNativeLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    .line 27
    move-result p1

    .line 28
    return p1

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_2
    const-string v1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    .line 33
    .line 34
    const-string v3, "appendNativeLog"

    .line 35
    .line 36
    .line 37
    filled-new-array {v0, v0, v0}, [Ljava/lang/Class;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    const/4 p2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v3, p2, v0, p1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Boolean;

    .line 50
    .line 51
    if-eqz p1, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    move-result p1
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    return p1

    .line 57
    :cond_3
    return v2

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 61
    move-result p2

    .line 62
    .line 63
    if-nez p2, :cond_4

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    :catch_0
    :cond_4
    :goto_1
    return v2
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

.method public native appendNativeLog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public native appendWholeNativeLog(Ljava/lang/String;)Z
.end method

.method public final b(ILjava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_0

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x800

    if-le v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p2}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    if-nez p2, :cond_3

    .line 4
    const-string p2, ""

    .line 5
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 13

    .line 49
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v0

    sget-wide v2, Lcom/tencent/bugly/proguard/k3;->D:J

    sub-long/2addr v0, v2

    .line 50
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->b()J

    move-result-wide v2

    const-wide/32 v4, 0x5265c00

    add-long/2addr v2, v4

    .line 51
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 52
    :try_start_0
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 53
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 54
    array-length v5, p1

    if-nez v5, :cond_0

    goto :goto_4

    .line 55
    :cond_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/a7;->a([Ljava/io/File;)V

    .line 56
    invoke-static {v4}, Lcom/tencent/bugly/common/utils/FileUtil;->getFolderSize(Ljava/io/File;)J

    move-result-wide v4

    .line 57
    array-length v6, p1

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v8, v6, :cond_4

    aget-object v9, p1, v8

    .line 58
    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    move-result-wide v10

    cmp-long v12, v10, v0

    if-lez v12, :cond_1

    cmp-long v10, v10, v2

    if-gez v10, :cond_1

    .line 59
    sget-wide v10, Lcom/tencent/bugly/proguard/k3;->C:J

    cmp-long v10, v4, v10

    if-lez v10, :cond_3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 60
    :cond_1
    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "[Native] Delete native record: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-array v11, v7, [Ljava/lang/Object;

    invoke-static {v10, v11}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 61
    invoke-virtual {v9}, Ljava/io/File;->isFile()Z

    move-result v10

    if-eqz v10, :cond_2

    .line 62
    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v10

    sub-long/2addr v4, v10

    .line 63
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    goto :goto_2

    .line 64
    :cond_2
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    move-result v10

    if-eqz v10, :cond_3

    .line 65
    invoke-static {v9}, Lcom/tencent/bugly/common/utils/FileUtil;->getFolderSize(Ljava/io/File;)J

    move-result-wide v10

    sub-long/2addr v4, v10

    .line 66
    invoke-static {v9}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFolder(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 67
    :goto_3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    :cond_4
    :goto_4
    return-void
.end method

.method public declared-synchronized b(Z)V
    .locals 12

    monitor-enter p0

    .line 6
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 7
    :try_start_1
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "[Native] Native crash report has already registered."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v3, p0

    goto/16 :goto_4

    .line 8
    :cond_0
    :try_start_2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    .line 9
    :try_start_3
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 10
    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v6, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    sget-object v7, Lcom/tencent/bugly/proguard/l2;->I0:Ljava/lang/String;

    sget v9, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->l:I

    sget-wide v10, Lcom/tencent/bugly/proguard/k3;->K:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v3, p0

    move v8, p1

    .line 12
    :try_start_4
    invoke-virtual/range {v3 .. v11}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->regist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIJ)Ljava/lang/String;

    move-result-object p1

    .line 13
    sput-boolean v2, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->n:Z

    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/Logger;->getLogLevel()Lcom/tencent/rmonitor/common/logger/LogState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/logger/LogState;->getValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAndroidLogLevel(I)V

    .line 15
    sget-boolean v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->enableNativeDumpAllThreadStack:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeEnableDumpAllThread(Ljava/lang/Boolean;)Z

    if-eqz p1, :cond_8

    .line 16
    const-string v0, "[Native] Native Crash Report enable."

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 17
    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/l2;->P:Ljava/lang/String;

    .line 18
    const-string v0, "-"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 19
    sget-boolean v0, Lcom/tencent/bugly/proguard/k3;->o:Z

    if-nez v0, :cond_1

    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 20
    iget-object p1, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, p1, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    const-string v4, "-"

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/l2;->P:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    .line 21
    :cond_1
    const-string p1, "comInfo.sdkVersion %s"

    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 22
    iput-boolean v2, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getRunningCpuAbi()Ljava/lang/String;

    move-result-object p1

    .line 24
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 25
    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/l2;->g(Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_2
    monitor-exit p0

    return-void

    :catchall_1
    move-object v3, p0

    .line 26
    :catchall_2
    :try_start_5
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "[Native] Failed to load Bugly SO file."

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    goto/16 :goto_3

    :catchall_3
    move-exception v0

    :goto_0
    move-object p1, v0

    goto/16 :goto_4

    :cond_3
    move-object v3, p0

    move v8, p1

    .line 27
    iget-boolean p1, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    if-eqz p1, :cond_8

    .line 28
    :try_start_6
    const-string p1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    const-string/jumbo v0, "registNativeExceptionHandler2"

    const-class v4, Ljava/lang/String;

    const-class v5, Ljava/lang/String;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v5, v6, v6}, [Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    iget-object v7, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 29
    invoke-static {v7, v1}, Lcom/tencent/bugly/proguard/o4;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x5

    if-eqz v8, :cond_4

    move v10, v2

    goto :goto_1

    :cond_4
    move v10, v9

    :goto_1
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v5, v7, v10, v11}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x0

    .line 31
    invoke-static {p1, v0, v7, v4, v5}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_5

    .line 32
    const-string p1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    const-string/jumbo v0, "registNativeExceptionHandler"

    const-class v4, Ljava/lang/String;

    const-class v5, Ljava/lang/String;

    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    iget-object v10, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 33
    invoke-static {v10, v1}, Lcom/tencent/bugly/proguard/o4;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object v10

    .line 34
    invoke-static {}, Lcom/tencent/bugly/proguard/l2;->s()Lcom/tencent/bugly/proguard/l2;

    move-result-object v11

    invoke-virtual {v11}, Lcom/tencent/bugly/proguard/l2;->c()I

    move-result v11

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v5, v10, v11}, [Ljava/lang/Object;

    move-result-object v5

    .line 35
    invoke-static {p1, v0, v7, v4, v5}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :cond_5
    if-eqz p1, :cond_8

    .line 36
    iput-boolean v2, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 37
    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/l2;->P:Ljava/lang/String;

    .line 38
    const-string p1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    const-string v0, "enableHandler"

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    .line 39
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    .line 40
    invoke-static {p1, v0, v7, v4, v5}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v8, :cond_6

    goto :goto_2

    :cond_6
    move v2, v9

    .line 41
    :goto_2
    const-string p1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    const-string/jumbo v0, "setLogMode"

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v4

    .line 42
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 43
    invoke-static {p1, v0, v7, v4, v2}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getRunningCpuAbi()Ljava/lang/String;

    move-result-object p1

    .line 45
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 46
    iget-object v0, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/l2;->g(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :cond_7
    monitor-exit p0

    return-void

    .line 47
    :catchall_4
    :cond_8
    :goto_3
    :try_start_7
    iput-boolean v1, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 48
    iput-boolean v1, v3, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    monitor-exit p0

    return-void

    :catchall_5
    move-exception v0

    move-object v3, p0

    goto/16 :goto_0

    :goto_4
    :try_start_8
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw p1
.end method

.method public declared-synchronized b()Z
    .locals 1

    monitor-enter p0

    .line 68
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

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

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppVersion(Ljava/lang/String;)Z

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeSdkVersion(Ljava/lang/String;)Z

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppBuildNum(Ljava/lang/String;)Z

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceModel(Ljava/lang/String;)Z

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeDeviceId(Ljava/lang/String;)Z

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/l2;->i0:Z

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeIsFirstInstall(Z)Z

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppChannel(Ljava/lang/String;)Z

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeAppPackage(Ljava/lang/String;)Z

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeUserId(Ljava/lang/String;)Z

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeIsAppForeground(Z)Z

    .line 11
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    iget-wide v0, v0, Lcom/tencent/bugly/proguard/l2;->c:J

    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeLaunchTime(J)Z

    return-void
.end method

.method public declared-synchronized c(Z)V
    .locals 0

    monitor-enter p0

    if-eqz p1, :cond_0

    .line 12
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->startNativeMonitor()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 13
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->d()V
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

.method public checkSaveRecordCrash()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v1, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "[Native] Check local record file and save db."

    .line 6
    .line 7
    .line 8
    invoke-static {v2, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a:Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "native_record_lock"

    .line 14
    .line 15
    const-wide/16 v3, 0x2710

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2, v3, v4}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;Ljava/lang/String;J)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    new-array v0, v0, [Ljava/lang/Object;

    .line 24
    .line 25
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 26
    .line 27
    const-string v2, "[Native] Failed to lock file for handling native crash record."

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    return-void

    .line 32
    .line 33
    :cond_0
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->q:Z

    .line 34
    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    const-string v1, "false"

    .line 38
    .line 39
    const/16 v2, 0x3e7

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 43
    .line 44
    :cond_1
    sget-object v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Ljava/lang/String;)V

    .line 48
    .line 49
    new-instance v1, Ljava/io/File;

    .line 50
    .line 51
    sget-object v2, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    if-eqz v1, :cond_5

    .line 61
    array-length v2, v1

    .line 62
    .line 63
    :goto_0
    if-ge v0, v2, :cond_5

    .line 64
    .line 65
    aget-object v5, v1, v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    .line 69
    move-result v6

    .line 70
    .line 71
    if-nez v6, :cond_2

    .line 72
    goto :goto_1

    .line 73
    .line 74
    .line 75
    :cond_2
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 76
    move-result-object v6

    .line 77
    .line 78
    .line 79
    const-string/jumbo v7, "native_crash_"

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    move-result v6

    .line 84
    .line 85
    if-nez v6, :cond_3

    .line 86
    goto :goto_1

    .line 87
    .line 88
    .line 89
    :cond_3
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    .line 90
    move-result-wide v6

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    move-result-wide v8

    .line 95
    sub-long/2addr v8, v6

    .line 96
    .line 97
    cmp-long v6, v8, v3

    .line 98
    .line 99
    if-gez v6, :cond_4

    .line 100
    goto :goto_1

    .line 101
    .line 102
    .line 103
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 104
    move-result-object v5

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v5}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Ljava/lang/String;)V

    .line 108
    .line 109
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 110
    goto :goto_0

    .line 111
    .line 112
    :cond_5
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
    :catchall_0
    return-void
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

.method public declared-synchronized d()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-array v0, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v1, "[Native] Native crash report has already unregistered."

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->unregist()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const-string v0, "[Native] Successfully closed native crash report."

    .line 26
    .line 27
    new-array v2, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    .line 32
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    monitor-exit p0

    .line 34
    return-void

    .line 35
    .line 36
    :catchall_1
    :try_start_2
    new-array v0, v1, [Ljava/lang/Object;

    .line 37
    .line 38
    const-string v2, "[Native] Failed to close native crash report."

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    .line 43
    :cond_1
    :try_start_3
    const-string v0, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    .line 44
    .line 45
    const-string v2, "enableHandler"

    .line 46
    .line 47
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 57
    move-result-object v4

    .line 58
    const/4 v5, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {v0, v2, v5, v3, v4}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 64
    .line 65
    const-string v0, "[Native] Successfully closed native crash report."

    .line 66
    .line 67
    new-array v2, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 71
    monitor-exit p0

    .line 72
    return-void

    .line 73
    .line 74
    :catchall_2
    :try_start_4
    new-array v0, v1, [Ljava/lang/Object;

    .line 75
    .line 76
    const-string v2, "[Native] Failed to close native crash report."

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 80
    .line 81
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 82
    .line 83
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 84
    monitor-exit p0

    .line 85
    return-void

    .line 86
    :goto_0
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 87
    throw v0
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

.method public disableCatchAnrTrace()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    sput v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->l:I

    .line 4
    return-void
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

.method public dumpAnrNativeStack()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x13

    .line 3
    .line 4
    const-string v1, "1"

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 8
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

.method public enableCatchAnrTrace()V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->l:I

    .line 3
    .line 4
    or-int/lit8 v0, v0, 0x2

    .line 5
    .line 6
    sput v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->l:I

    .line 7
    return-void
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

.method public filterSigabrtSysLog()Z
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x3e6

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "true"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 9
    move-result v0

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

.method public native getCrashThreadLocalValue()Ljava/lang/String;
.end method

.method public native getFd()V
.end method

.method public getLogFromNative()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    return-object v1

    .line 11
    .line 12
    :cond_0
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getNativeLog()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    return-object v0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_0

    .line 22
    .line 23
    :cond_1
    const-string v0, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    .line 24
    .line 25
    const-string v2, "getNativeLog"

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v2, v1, v1, v1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    return-object v0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 36
    move-result v2

    .line 37
    .line 38
    if-nez v2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 42
    :catch_0
    :cond_2
    return-object v1
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

.method public getNativeExceptionHandler()Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->d:Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;

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

.method public native getNativeLog()Ljava/lang/String;
.end method

.method public native getNativeProcessInfo(Ljava/lang/String;)V
.end method

.method public native getProperties(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public getRunningCpuAbi()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getSoCpuAbi()Ljava/lang/String;

    .line 4
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    const/4 v0, 0x0

    .line 7
    .line 8
    new-array v0, v0, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v1, "get so cpu abi failed\uff0cplease upgrade bugly so version"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    return-object v0
    .line 17
.end method

.method public getSystemProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-string p1, "fail"

    .line 12
    return-object p1

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getProperties(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public isEnableCatchAnrTrace()Z
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->l:I

    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

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

.method public declared-synchronized isUserOpened()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->i:Z
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

.method public native modifyAttachmentState(I)V
.end method

.method public modifyProcessingState(IZ)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZZ)V

    return-void
.end method

.method public native modifyProcessingState(IZZ)V
.end method

.method public declared-synchronized onStrategyChanged(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    :try_start_0
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "server native changed to %b"

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_2

    .line 27
    .line 28
    .line 29
    :cond_0
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-boolean p1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->i:Z

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    const/4 p1, 0x1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const/4 p1, 0x0

    .line 46
    .line 47
    :goto_1
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 48
    .line 49
    if-eq p1, v0, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    const-string/jumbo v1, "native changed to %b"

    .line 61
    .line 62
    .line 63
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    :cond_2
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p1
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

.method public onSubProcessConfigChanged(Z)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "enableNativeSubProcess: "

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeEnableSubProcess(Ljava/lang/Boolean;)Z

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
.end method

.method public putKeyValueToNative(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    .line 2
    const-class v0, Ljava/lang/String;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    return v2

    .line 13
    .line 14
    :cond_0
    if-eqz p1, :cond_4

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_1
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->putNativeKeyValue(Ljava/lang/String;Ljava/lang/String;)Z

    .line 25
    move-result p1

    .line 26
    return p1

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_2
    const-string v1, "com.tencent.feedback.eup.jni.NativeExceptionUpload"

    .line 31
    .line 32
    .line 33
    const-string/jumbo v3, "putNativeKeyValue"

    .line 34
    .line 35
    .line 36
    filled-new-array {v0, v0}, [Ljava/lang/Class;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 41
    move-result-object p1

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3, p2, v0, p1}, Lcom/tencent/bugly/proguard/bi;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    check-cast p1, Ljava/lang/Boolean;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    move-result p1
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    return p1

    .line 56
    :cond_3
    return v2

    .line 57
    .line 58
    .line 59
    :goto_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 60
    move-result p2

    .line 61
    .line 62
    if-nez p2, :cond_4

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 66
    :catch_0
    :cond_4
    :goto_1
    return v2
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

.method public native putNativeKeyValue(Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public reRegisterANRHandler(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    .line 12
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 13
    .line 14
    .line 15
    const-string/jumbo p1, "true"

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_2
    const-string p1, "false"

    .line 19
    .line 20
    :goto_1
    const/16 v0, 0x1f

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 24
    return-void
    .line 25
.end method

.method public reRegisterNativeHandler(Z)V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-void

    .line 11
    .line 12
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 13
    .line 14
    .line 15
    const-string/jumbo p1, "true"

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_2
    const-string p1, "false"

    .line 19
    .line 20
    :goto_1
    const/16 v0, 0x1e

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 24
    return-void
    .line 25
.end method

.method public native recordProcessingState(Ljava/lang/String;I)V
.end method

.method public native regist(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIJ)Ljava/lang/String;
.end method

.method public removeEmptyNativeRecordFiles()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->m:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/tencent/bugly/proguard/dd;->b(Ljava/lang/String;)V

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

.method public native removeNativeKeyValue(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public resendSigquit()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x14

    .line 3
    .line 4
    const-string v1, ""

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 8
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

.method public saveAdditionalAttachmentPaths(Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->saveAdditionalAttachmentPathsNative(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    return-void

    .line 5
    :catchall_0
    move-exception p1

    .line 6
    .line 7
    const-string v0, "Failed to save additional attachment paths. "

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    :cond_0
    return-void
    .line 25
.end method

.method public native saveAdditionalAttachmentPathsNative(Ljava/lang/String;)V
.end method

.method public setAdditionalAttachmentPaths(Ljava/util/ArrayList;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-boolean v1, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->o:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 11
    move-result v1

    .line 12
    .line 13
    new-array v1, v1, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    check-cast p1, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setAdditionalAttachmentPathsNative([Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string/jumbo p1, "setAdditionalAttachmentPaths successful"

    .line 26
    .line 27
    new-array v1, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 31
    const/4 p1, 0x1

    .line 32
    return p1

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_0
    const-string/jumbo p1, "setAdditionalAttachmentPaths failed for sample ratio"

    .line 38
    .line 39
    new-array v1, v0, [Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    goto :goto_1

    .line 44
    .line 45
    :goto_0
    const-string v1, "Failed to set additional attachment paths. "

    .line 46
    .line 47
    .line 48
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    new-array v2, v0, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 61
    :cond_1
    :goto_1
    return v0
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
.end method

.method public native setAdditionalAttachmentPathsNative([Ljava/lang/String;)V
.end method

.method public setAppHotPatchNum(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1c

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setAppVersionLabel(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1d

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setCaseLabel(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x21

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(ILjava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public native setCrashProcessingInfo(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public setCrashThreadLocalKey(Ljava/lang/String;J)Z
    .locals 1

    .line 1
    .line 2
    sput-object p1, Lcom/tencent/bugly/proguard/l2;->J0:Ljava/lang/String;

    .line 3
    .line 4
    const/16 v0, 0x27

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    const/16 p2, 0x28

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 17
    const/4 p1, 0x1

    .line 18
    return p1
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

.method public setCrashWhiteListStr(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x26

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setEnableCrashWhiteList(Z)Z
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "true"

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const-string p1, "false"

    .line 9
    .line 10
    :goto_0
    const/16 v0, 0x25

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 14
    move-result p1

    .line 15
    return p1
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

.method public setNativeAndroidLogLevel(I)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/LogState;->Companion:Lcom/tencent/rmonitor/common/logger/LogState$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/LogState$Companion;->getByValue(I)Lcom/tencent/rmonitor/common/logger/LogState;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler$a;->a:[I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    move-result p1

    .line 16
    .line 17
    aget p1, v0, p1

    .line 18
    .line 19
    .line 20
    packed-switch p1, :pswitch_data_0

    .line 21
    const/4 p1, 0x0

    .line 22
    .line 23
    new-array v0, p1, [Ljava/lang/Object;

    .line 24
    .line 25
    const-string v1, "Unknown log level state!"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 29
    goto :goto_0

    .line 30
    :pswitch_0
    const/4 p1, 0x6

    .line 31
    goto :goto_0

    .line 32
    :pswitch_1
    const/4 p1, 0x5

    .line 33
    goto :goto_0

    .line 34
    :pswitch_2
    const/4 p1, 0x4

    .line 35
    goto :goto_0

    .line 36
    :pswitch_3
    const/4 p1, 0x3

    .line 37
    goto :goto_0

    .line 38
    :pswitch_4
    const/4 p1, 0x2

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :pswitch_5
    const/16 p1, 0x8

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->setNativeLogLevel(I)V

    .line 45
    return-void

    .line 46
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public setNativeAppBuildNum(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x17

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeAppChannel(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xc

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeAppPackage(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeAppVersion(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeDeviceId(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x1a

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeDeviceModel(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x19

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeEnableDumpAllThread(Ljava/lang/Boolean;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "true"

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-string p1, "false"

    .line 13
    .line 14
    :goto_0
    const/16 v0, 0x23

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setNativeEnableSubProcess(Ljava/lang/Boolean;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "true"

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-string p1, "false"

    .line 13
    .line 14
    :goto_0
    const/16 v0, 0x16

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public native setNativeInfo(ILjava/lang/String;)V
.end method

.method public setNativeIsAppForeground(Z)Z
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "true"

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const-string p1, "false"

    .line 9
    .line 10
    :goto_0
    const/16 v0, 0xe

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 14
    move-result p1

    .line 15
    return p1
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

.method public setNativeIsFirstInstall(Z)Z
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    const-string/jumbo p1, "true"

    .line 6
    goto :goto_0

    .line 7
    .line 8
    :cond_0
    const-string p1, "false"

    .line 9
    .line 10
    :goto_0
    const/16 v0, 0x1b

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 14
    move-result p1

    .line 15
    return p1
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

.method public setNativeLaunchTime(J)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    const/16 p2, 0xf

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p2, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 10
    move-result p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return p1

    .line 12
    :catch_0
    move-exception p1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 16
    move-result p2

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1
    .line 24
    .line 25
.end method

.method public native setNativeLogLevel(I)V
.end method

.method public setNativeSdkVersion(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x18

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setNativeUserId(Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xb

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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
.end method

.method public setStage(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x22

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(ILjava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setSupportLoadBias(Ljava/lang/Boolean;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    .line 9
    const-string/jumbo p1, "true"

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    const-string p1, "false"

    .line 13
    .line 14
    :goto_0
    const/16 v0, 0x24

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 18
    move-result p1

    .line 19
    return p1
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setTestLabel(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(ILjava/lang/String;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public declared-synchronized setUserOpened(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(Z)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->isUserOpened()Z

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/pg;->b()Lcom/tencent/bugly/proguard/pg;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 p1, 0x0

    .line 30
    .line 31
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->h:Z

    .line 32
    .line 33
    if-eq p1, v0, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    const-string/jumbo v1, "native changed to %b"

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    :cond_2
    monitor-exit p0

    .line 52
    return-void

    .line 53
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
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
.end method

.method public declared-synchronized startNativeMonitor()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 4
    .line 5
    if-nez v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    goto :goto_3

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    .line 13
    .line 14
    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    xor-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    sget-boolean v2, Lcom/tencent/bugly/proguard/k3;->o:Z

    .line 23
    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    const-string v2, "Bugly_Native"

    .line 27
    .line 28
    const-string v3, "NativeRQD"

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v2, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    .line 33
    .line 34
    iget-object v2, v2, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_4

    .line 38
    .line 39
    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->tryLoadSo(Ljava/lang/String;Z)Z

    .line 41
    move-result v1

    .line 42
    .line 43
    iput-boolean v1, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 44
    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    if-eqz v0, :cond_4

    .line 48
    const/4 v0, 0x0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v3, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->tryLoadSo(Ljava/lang/String;Z)Z

    .line 52
    move-result v0

    .line 53
    .line 54
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z

    .line 55
    goto :goto_2

    .line 56
    .line 57
    :cond_2
    const-string v2, "Bugly_Native"

    .line 58
    .line 59
    iget-object v3, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b:Lcom/tencent/bugly/proguard/l2;

    .line 60
    .line 61
    iget-object v3, v3, Lcom/tencent/bugly/proguard/l2;->O:Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    move-object v2, v3

    .line 66
    .line 67
    .line 68
    :goto_1
    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->tryLoadSo(Ljava/lang/String;Z)Z

    .line 69
    move-result v0

    .line 70
    .line 71
    iput-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 72
    .line 73
    :cond_4
    :goto_2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    if-nez v0, :cond_5

    .line 80
    monitor-exit p0

    .line 81
    return-void

    .line 82
    .line 83
    :cond_5
    :try_start_1
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->e:Z

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->c()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    monitor-exit p0

    .line 94
    return-void

    .line 95
    .line 96
    :cond_6
    :goto_3
    :try_start_2
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->e:Z

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->b(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 100
    monitor-exit p0

    .line 101
    return-void

    .line 102
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    throw v0
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

.method public native testCrash()V
.end method

.method public testNativeCrash()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->g:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "[Native] Bugly SO file has not been load."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->testCrash()V

    return-void
.end method

.method public testNativeCrash(ZZZ)V
    .locals 2

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x10

    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x11

    invoke-virtual {p0, p2, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/16 p2, 0x12

    invoke-virtual {p0, p2, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->testNativeCrash()V

    return-void
.end method

.method public tryLoadSo(Ljava/lang/String;Z)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    const-string v1, "[Native] Trying to load so: %s"

    .line 4
    .line 5
    .line 6
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 7
    move-result-object v2

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/System;->load(Ljava/lang/String;)V

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p2

    .line 18
    move v1, v0

    .line 19
    goto :goto_1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {p1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :goto_0
    const/4 p2, 0x1

    .line 24
    .line 25
    :try_start_1
    const-string v1, "[Native] Successfully loaded SO: %s"

    .line 26
    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 32
    .line 33
    .line 34
    invoke-static {v3, v1, v2}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    return p2

    .line 36
    :catchall_1
    move-exception v1

    .line 37
    move-object v4, v1

    .line 38
    move v1, p2

    .line 39
    move-object p2, v4

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    new-array v0, v0, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    invoke-static {p2, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    sget-object p2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 55
    .line 56
    const-string v0, "[Native] Failed to load so: %s"

    .line 57
    .line 58
    .line 59
    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 60
    return v1
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

.method public unBlockSigquit(Z)V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x15

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    const-string/jumbo p1, "true"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 11
    return-void

    .line 12
    .line 13
    :cond_0
    const-string p1, "false"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->a(ILjava/lang/String;)Z

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public native unregist()Ljava/lang/String;
.end method
