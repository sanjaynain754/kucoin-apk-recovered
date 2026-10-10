.class public Lcom/tencent/bugly/proguard/bd;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/crashreport/crash/jni/NativeExceptionHandler;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/tencent/bugly/proguard/j3;

.field public final c:Lcom/tencent/bugly/proguard/l2;

.field public final d:Lcom/tencent/bugly/proguard/pg;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/l2;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/tencent/bugly/proguard/bd;->a:Landroid/content/Context;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/tencent/bugly/proguard/bd;->b:Lcom/tencent/bugly/proguard/j3;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/tencent/bugly/proguard/bd;->d:Lcom/tencent/bugly/proguard/pg;

    .line 12
    return-void
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
.end method

.method public static a(II)Ljava/lang/String;
    .locals 1

    .line 3
    const-string v0, "UNKNOWN"

    if-lez p0, :cond_0

    return-object v0

    :cond_0
    if-lez p1, :cond_1

    .line 4
    invoke-static {p1}, Lcom/tencent/bugly/proguard/x;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 5
    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    .line 6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "("

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static a(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-lez p0, :cond_0

    .line 2
    const-string p0, "KERNEL"

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-lez p1, :cond_0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "("

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static a(Ljava/util/Map;I)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 24
    const-string v0, "ExceptionThreadName"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 25
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "crash thread name:%s tid:%s"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 26
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ")"

    const-string v2, "("

    if-eqz v0, :cond_0

    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 29
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/util/Map;Lcom/tencent/bugly/proguard/l2;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/bugly/proguard/l2;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 20
    const-string v0, "ExceptionProcessName"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 21
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 22
    :cond_0
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Name of crash process: %s"

    invoke-static {v0, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object p0

    .line 23
    :cond_1
    :goto_0
    iget-object p0, p1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    return-object p0
.end method

.method public static a([Ljava/lang/String;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 7
    new-instance v0, Ljava/util/HashMap;

    const/4 v1, 0x1

    if-nez p0, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    array-length v2, p0

    :goto_0
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    const/4 v2, 0x0

    if-eqz p0, :cond_4

    move v3, v2

    .line 8
    :goto_1
    array-length v4, p0

    if-ge v3, v4, :cond_3

    .line 9
    aget-object v4, p0, v3

    if-eqz v4, :cond_2

    .line 10
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5, v4}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "Extra message[%d]: %s"

    invoke-static {v6, v5}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 11
    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 12
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_1

    .line 13
    aget-object v4, v5, v2

    aget-object v5, v5, v1

    invoke-virtual {v0, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 14
    :cond_1
    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 15
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v6, "bad extraMsg %s"

    invoke-static {v5, v6, v4}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    return-object v0

    .line 16
    :cond_4
    new-array p0, v2, [Ljava/lang/Object;

    const-string/jumbo v1, "not found extraMsg"

    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v0
.end method

.method public static a(Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 17
    const-string v0, "HasPendingException"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 18
    const-string/jumbo v1, "true"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 19
    new-array p0, v0, [Ljava/lang/Object;

    const-string v0, "Native crash happened with a Java pending exception."

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0

    :cond_0
    return v0
.end method


# virtual methods
.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ILjava/lang/String;)V
    .locals 3

    .line 30
    iget-object v0, p0, Lcom/tencent/bugly/proguard/bd;->b:Lcom/tencent/bugly/proguard/j3;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 31
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "crashHandler is null. Won\'t upload native crash."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 32
    invoke-static {v0, p3}, Lcom/tencent/bugly/proguard/dd;->a(ZLjava/lang/String;)V

    .line 33
    iget-object p3, p0, Lcom/tencent/bugly/proguard/bd;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p3, p1, p2, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;IZ)Z

    move-result p2

    .line 34
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p3

    if-eqz p3, :cond_1

    .line 35
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getCrashThreadLocalValue()Ljava/lang/String;

    move-result-object p3

    .line 36
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 37
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    sget-object v2, Lcom/tencent/bugly/proguard/l2;->J0:Ljava/lang/String;

    invoke-interface {v1, v2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    :cond_1
    iget-object p3, p0, Lcom/tencent/bugly/proguard/bd;->a:Landroid/content/Context;

    const-string/jumbo v1, "native_record_lock"

    invoke-static {p3, v1}, Lcom/tencent/bugly/proguard/bi;->b(Landroid/content/Context;Ljava/lang/String;)Z

    if-nez p2, :cond_2

    .line 39
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->b:Lcom/tencent/bugly/proguard/j3;

    const-wide/16 v1, 0xbb8

    invoke-virtual {p2, p1, v1, v2, v0}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V

    .line 40
    :cond_2
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p2, p1}, Lcom/tencent/bugly/proguard/j3;->g(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k3;->e()V

    return-void
.end method

.method public clearPreDumpAnrInfo()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/u;->c()Lcom/tencent/bugly/proguard/u;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    const-class v0, Lcom/tencent/bugly/proguard/u;

    .line 11
    monitor-enter v0

    .line 12
    .line 13
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/u;->a()Z

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
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

.method public handleNativeException(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 22

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "Native Crash Happen v1"

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    .line 10
    const/16 v21, 0x0

    .line 11
    .line 12
    move-object/from16 v2, p0

    .line 13
    .line 14
    move/from16 v3, p1

    .line 15
    .line 16
    move/from16 v4, p2

    .line 17
    .line 18
    move-wide/from16 v5, p3

    .line 19
    .line 20
    move-wide/from16 v7, p5

    .line 21
    .line 22
    move-object/from16 v9, p7

    .line 23
    .line 24
    move-object/from16 v10, p8

    .line 25
    .line 26
    move-object/from16 v11, p9

    .line 27
    .line 28
    move-object/from16 v12, p10

    .line 29
    .line 30
    move-object/from16 v13, p11

    .line 31
    .line 32
    move/from16 v14, p12

    .line 33
    .line 34
    move-object/from16 v15, p13

    .line 35
    .line 36
    move/from16 v16, p14

    .line 37
    .line 38
    move/from16 v17, p15

    .line 39
    .line 40
    move/from16 v18, p16

    .line 41
    .line 42
    move-object/from16 v19, p17

    .line 43
    .line 44
    move-object/from16 v20, p18

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {v2 .. v21}, Lcom/tencent/bugly/proguard/bd;->handleNativeException2(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 48
    return-void
.end method

.method public handleNativeException2(IIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v6, p8

    move/from16 v0, p12

    const/4 v15, 0x0

    .line 1
    new-array v2, v15, [Ljava/lang/Object;

    const-string v3, "Native Crash Happen v2"

    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    move-object/from16 v2, p7

    move-object/from16 v3, p13

    .line 2
    :try_start_0
    invoke-static {v2, v0, v3}, Lcom/tencent/bugly/proguard/bd;->a(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static/range {p9 .. p9}, Lcom/tencent/bugly/proguard/dd;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 4
    invoke-static/range {p19 .. p19}, Lcom/tencent/bugly/proguard/bd;->a([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 5
    iget-object v4, v1, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    invoke-static {v2, v4}, Lcom/tencent/bugly/proguard/bd;->a(Ljava/util/Map;Lcom/tencent/bugly/proguard/l2;)Ljava/lang/String;

    move-result-object v4

    move/from16 v8, p2

    .line 6
    invoke-static {v2, v8}, Lcom/tencent/bugly/proguard/bd;->a(Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v8

    const-wide/16 v9, 0x3e8

    mul-long v11, p3, v9

    .line 7
    div-long v9, p5, v9

    add-long/2addr v11, v9

    .line 8
    const-string v9, "SysLogPath"

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 9
    const-string v10, "JniLogPath"

    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    .line 10
    invoke-static/range {p11 .. p11}, Lcom/tencent/bugly/common/utils/FileUtil;->getFileParentPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 11
    iget-object v10, v1, Lcom/tencent/bugly/proguard/bd;->d:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v10}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v10

    if-nez v10, :cond_0

    .line 12
    const-string/jumbo v10, "no remote but still store!"

    new-array v14, v15, [Ljava/lang/Object;

    .line 13
    sget-object v15, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v15, v10, v14}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1

    .line 14
    :cond_0
    :goto_0
    iget-object v10, v1, Lcom/tencent/bugly/proguard/bd;->d:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v10}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v10

    .line 15
    iget-boolean v10, v10, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v15, "\n"

    if-nez v10, :cond_1

    :try_start_1
    iget-object v10, v1, Lcom/tencent/bugly/proguard/bd;->d:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v10}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v10

    if-eqz v10, :cond_1

    .line 16
    const-string v0, "crash report was closed by remote , will not upload to Bugly , print local for helpful!"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    .line 17
    sget-object v9, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v9, v0, v3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 18
    const-string v0, "NATIVE_CRASH"

    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    move-object/from16 p1, v0

    move-object/from16 p2, v3

    move-object/from16 p3, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p4, v8

    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 19
    invoke-static {v2}, Lcom/tencent/bugly/common/utils/FileUtil;->deleteFile(Ljava/lang/String;)V

    return-void

    :cond_1
    move-object/from16 v16, v4

    move-object v4, v2

    move-object v2, v8

    if-lez v0, :cond_2

    .line 20
    const-string v3, "KERNEL"

    :cond_2
    move/from16 v8, p14

    .line 21
    invoke-static {v0, v8}, Lcom/tencent/bugly/proguard/bd;->a(II)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v8, p10

    move-object/from16 v14, p18

    move-object/from16 v17, v4

    move-wide/from16 v20, v11

    move-object/from16 v11, p11

    move-object v12, v9

    move-object v9, v3

    move-wide/from16 v3, v20

    .line 22
    invoke-virtual/range {v1 .. v14}, Lcom/tencent/bugly/proguard/bd;->packageCrashBasicDatas(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v18, v2

    if-nez v3, :cond_3

    .line 23
    :try_start_2
    const-string/jumbo v0, "pkg crash datas fail!"

    const/4 v3, 0x0

    new-array v1, v3, [Ljava/lang/Object;

    .line 24
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_1

    :cond_3
    const-wide/16 v11, -0x1

    const-wide/16 v13, -0x1

    const/4 v4, 0x0

    move-object v1, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, v7

    const-wide/16 v7, -0x1

    const-wide/16 v9, -0x1

    move-object v0, v1

    move-object/from16 v19, v2

    move-object v2, v3

    move-object/from16 v3, v16

    move-object/from16 v1, p0

    .line 25
    :try_start_3
    invoke-virtual/range {v1 .. v14}, Lcom/tencent/bugly/proguard/bd;->packageCrashDetailDatas(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;[BLjava/util/Map;ZJJJJ)V

    .line 26
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v3

    sget-object v4, Lcom/tencent/bugly/proguard/se$c;->h:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyProcessingState(IZ)V

    .line 27
    const-string v3, "NATIVE_CRASH"

    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, p8

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v19

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 p5, v0

    move-object/from16 p6, v2

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move-object/from16 p3, v16

    move-object/from16 p4, v18

    invoke-static/range {p1 .. p6}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    move-object/from16 v2, p6

    move/from16 v0, p12

    move-object/from16 v4, v17

    .line 28
    invoke-virtual {v1, v2, v0, v4}, Lcom/tencent/bugly/proguard/bd;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ILjava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    .line 29
    :goto_1
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->WARN:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 30
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    return-void
.end method

.method public packageCrashBasicDatas(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 10

    .line 1
    .line 2
    move-object/from16 v0, p10

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/k3;->p()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    new-array v2, v2, [Ljava/lang/Object;

    .line 16
    .line 17
    const-string v3, "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"

    .line 18
    .line 19
    .line 20
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 21
    .line 22
    :cond_0
    new-instance v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 26
    const/4 v3, 0x1

    .line 27
    .line 28
    iput v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 29
    .line 30
    iget-object v3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 47
    .line 48
    iget-object v4, v3, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v4, v3, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v4, v3, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    .line 57
    .line 58
    iput-object v4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 65
    .line 66
    sget-object v3, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->getOperationLogString()Ljava/util/List;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    .line 73
    .line 74
    if-eqz v3, :cond_1

    .line 75
    .line 76
    .line 77
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 78
    move-result v3

    .line 79
    .line 80
    if-nez v3, :cond_1

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    sget-object v4, Lcom/tencent/bugly/proguard/se$b;->c:Lcom/tencent/bugly/proguard/se$b;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 90
    move-result v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v4}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->modifyAttachmentState(I)V

    .line 94
    .line 95
    :cond_1
    iget-object v3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 96
    .line 97
    iget-boolean v4, v3, Lcom/tencent/bugly/proguard/l2;->i0:Z

    .line 98
    .line 99
    iput-boolean v4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Z

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    iput-object v3, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    .line 114
    .line 115
    iput-object p4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 116
    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    new-instance p4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    move-object/from16 v1, p7

    .line 125
    .line 126
    .line 127
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    const-string v1, "\n[Bugly]This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    move-result-object p4

    .line 137
    goto :goto_0

    .line 138
    .line 139
    :cond_2
    move-object/from16 v1, p7

    .line 140
    move-object p4, v1

    .line 141
    .line 142
    :goto_0
    iput-object p4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    .line 143
    .line 144
    iput-object p5, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 145
    .line 146
    if-nez p6, :cond_3

    .line 147
    .line 148
    const-string p4, ""

    .line 149
    goto :goto_1

    .line 150
    .line 151
    :cond_3
    move-object/from16 p4, p6

    .line 152
    .line 153
    :goto_1
    iput-object p4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 154
    .line 155
    iput-wide p2, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    .line 156
    .line 157
    .line 158
    invoke-virtual {p4}, Ljava/lang/String;->getBytes()[B

    .line 159
    move-result-object p4

    .line 160
    .line 161
    .line 162
    invoke-static {p4}, Lcom/tencent/bugly/proguard/bi;->c([B)Ljava/lang/String;

    .line 163
    move-result-object p4

    .line 164
    .line 165
    iput-object p4, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    .line 166
    .line 167
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 168
    .line 169
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->W:Ljava/lang/String;

    .line 176
    .line 177
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->v()Ljava/util/Map;

    .line 181
    move-result-object p1

    .line 182
    .line 183
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    .line 184
    .line 185
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->u()Ljava/util/Map;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->r:Ljava/util/Map;

    .line 192
    .line 193
    iput-object v0, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->E:Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Lcom/tencent/bugly/common/utils/FileUtil;->getFileParentPath(Ljava/lang/String;)Ljava/lang/String;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    .line 200
    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/dd;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    .line 204
    invoke-static {p1}, Lcom/tencent/bugly/proguard/bi;->c(Ljava/lang/String;)Z

    .line 205
    move-result p4

    .line 206
    .line 207
    if-nez p4, :cond_4

    .line 208
    .line 209
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    .line 210
    .line 211
    :cond_4
    sget v4, Lcom/tencent/bugly/proguard/k3;->x:I

    .line 212
    .line 213
    sget v5, Lcom/tencent/bugly/proguard/k3;->y:I

    .line 214
    .line 215
    sget v6, Lcom/tencent/bugly/proguard/k3;->z:I

    .line 216
    .line 217
    sget-object v7, Lcom/tencent/bugly/proguard/k3;->E:Ljava/lang/String;

    .line 218
    move-wide v8, p2

    .line 219
    .line 220
    move-object/from16 v3, p11

    .line 221
    .line 222
    .line 223
    invoke-static/range {v3 .. v9}, Lcom/tencent/bugly/proguard/dd;->a(Ljava/lang/String;IIILjava/lang/String;J)Ljava/lang/String;

    .line 224
    move-result-object p1

    .line 225
    .line 226
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    .line 227
    .line 228
    sget v4, Lcom/tencent/bugly/proguard/k3;->x:I

    .line 229
    .line 230
    sget v5, Lcom/tencent/bugly/proguard/k3;->y:I

    .line 231
    .line 232
    sget v6, Lcom/tencent/bugly/proguard/k3;->z:I

    .line 233
    const/4 v7, 0x0

    .line 234
    .line 235
    move-object/from16 v3, p12

    .line 236
    .line 237
    .line 238
    invoke-static/range {v3 .. v9}, Lcom/tencent/bugly/proguard/dd;->a(Ljava/lang/String;IIILjava/lang/String;J)Ljava/lang/String;

    .line 239
    move-result-object p1

    .line 240
    .line 241
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->G:Ljava/lang/String;

    .line 242
    .line 243
    move-object/from16 p1, p9

    .line 244
    .line 245
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Y:Ljava/lang/String;

    .line 246
    .line 247
    move-object/from16 p1, p8

    .line 248
    .line 249
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Z:Ljava/lang/String;

    .line 250
    .line 251
    move-object/from16 p1, p13

    .line 252
    .line 253
    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->a0:Ljava/lang/String;

    .line 254
    .line 255
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->C()J

    .line 259
    move-result-wide p1

    .line 260
    .line 261
    iput-wide p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    .line 262
    .line 263
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->D()J

    .line 267
    move-result-wide p1

    .line 268
    .line 269
    iput-wide p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    .line 270
    .line 271
    iget-object p1, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/l2;->E()J

    .line 275
    move-result-wide p1

    .line 276
    .line 277
    iput-wide p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    .line 278
    return-object v2
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
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
.end method

.method public packageCrashDetailDatas(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;[BLjava/util/Map;ZJJJJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;ZJJJJ)V"
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p5, :cond_2

    .line 3
    .line 4
    iget-object p3, p0, Lcom/tencent/bugly/proguard/bd;->a:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Lcom/tencent/bugly/proguard/o4;->b(Landroid/content/Context;)J

    .line 8
    move-result-wide p3

    .line 9
    .line 10
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->o()J

    .line 14
    move-result-wide p3

    .line 15
    .line 16
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->f()J

    .line 20
    move-result-wide p3

    .line 21
    .line 22
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 26
    move-result-object p3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/lang/Runtime;->maxMemory()J

    .line 30
    move-result-wide p3

    .line 31
    .line 32
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    .line 36
    move-result-object p3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/Runtime;->totalMemory()J

    .line 40
    move-result-wide p3

    .line 41
    .line 42
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->i()J

    .line 46
    move-result-wide p3

    .line 47
    .line 48
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->k()J

    .line 52
    move-result-wide p3

    .line 53
    .line 54
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->e()J

    .line 58
    move-result-wide p3

    .line 59
    .line 60
    iput-wide p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lcom/tencent/bugly/proguard/eb;->b()[B

    .line 64
    move-result-object p3

    .line 65
    .line 66
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    .line 67
    .line 68
    iget-object p3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 69
    .line 70
    iget-wide p4, p3, Lcom/tencent/bugly/proguard/l2;->c:J

    .line 71
    .line 72
    iput-wide p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 73
    .line 74
    .line 75
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/l2;->K()Z

    .line 76
    move-result p3

    .line 77
    .line 78
    iput-boolean p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 79
    .line 80
    iget-object p3, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/l2;->M()Z

    .line 84
    move-result p3

    .line 85
    .line 86
    sget p4, Lcom/tencent/bugly/proguard/k3;->B:I

    .line 87
    const/4 p5, 0x0

    .line 88
    .line 89
    .line 90
    invoke-static {p3, p4, p5, p5}, Lcom/tencent/bugly/proguard/bi;->a(ZIZZ)Ljava/util/Map;

    .line 91
    move-result-object p3

    .line 92
    .line 93
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 94
    .line 95
    iget-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 96
    .line 97
    const-string p4, "java:\n"

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 101
    move-result p3

    .line 102
    .line 103
    if-lez p3, :cond_0

    .line 104
    .line 105
    add-int/lit8 p3, p3, 0x6

    .line 106
    .line 107
    iget-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 111
    move-result p4

    .line 112
    .line 113
    if-ge p3, p4, :cond_0

    .line 114
    .line 115
    iget-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 119
    move-result p6

    .line 120
    .line 121
    add-int/lit8 p6, p6, -0x1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p4, p3, p6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 125
    move-result-object p4

    .line 126
    .line 127
    .line 128
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 129
    move-result p6

    .line 130
    .line 131
    if-lez p6, :cond_0

    .line 132
    .line 133
    iget-object p6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 134
    .line 135
    iget-object p7, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    invoke-interface {p6, p7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 139
    move-result p6

    .line 140
    .line 141
    if-eqz p6, :cond_0

    .line 142
    .line 143
    iget-object p6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 144
    .line 145
    iget-object p7, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    invoke-interface {p6, p7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    move-result-object p6

    .line 150
    .line 151
    check-cast p6, Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p6, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 155
    move-result p4

    .line 156
    .line 157
    if-lez p4, :cond_0

    .line 158
    .line 159
    .line 160
    invoke-virtual {p6, p4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 161
    move-result-object p4

    .line 162
    .line 163
    iget-object p6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 164
    .line 165
    iget-object p7, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    invoke-interface {p6, p7, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    iget-object p6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p6, p5, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 174
    move-result-object p3

    .line 175
    .line 176
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 177
    .line 178
    new-instance p3, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    iget-object p5, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    invoke-static {p3, p5, p4}, Lcom/tencent/bugly/proguard/xh;->a(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 187
    move-result-object p3

    .line 188
    .line 189
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 193
    move-result p3

    .line 194
    .line 195
    if-eqz p3, :cond_1

    .line 196
    .line 197
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 198
    .line 199
    iget-object p2, p2, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    .line 200
    .line 201
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 202
    goto :goto_0

    .line 203
    .line 204
    :cond_1
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 205
    .line 206
    :goto_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->H()I

    .line 210
    move-result p2

    .line 211
    .line 212
    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 213
    .line 214
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->A()I

    .line 218
    move-result p2

    .line 219
    .line 220
    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 221
    .line 222
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    .line 226
    move-result-object p2

    .line 227
    .line 228
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 229
    .line 230
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    .line 234
    move-result-object p2

    .line 235
    .line 236
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 237
    .line 238
    .line 239
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    .line 240
    move-result-object p2

    .line 241
    .line 242
    .line 243
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    .line 244
    move-result-object p2

    .line 245
    .line 246
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m0:Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    .line 250
    move-result-object p2

    .line 251
    .line 252
    .line 253
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->b()Ljava/lang/String;

    .line 254
    move-result-object p2

    .line 255
    .line 256
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n0:Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    invoke-static {p1}, Lcom/tencent/bugly/proguard/g5;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 260
    goto :goto_1

    .line 261
    .line 262
    :cond_2
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 263
    .line 264
    iput-wide p6, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    .line 265
    .line 266
    iput-wide p8, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 267
    .line 268
    iput-wide p10, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 269
    .line 270
    iput-wide p12, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    .line 271
    .line 272
    iget-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    .line 273
    .line 274
    if-nez p2, :cond_3

    .line 275
    .line 276
    const-string p2, "This crash occurred at last process! Log is miss, when get an terrible ABRT Native Exception etc."

    .line 277
    .line 278
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->F:Ljava/lang/String;

    .line 279
    .line 280
    :cond_3
    const-wide/16 p5, -0x1

    .line 281
    .line 282
    iput-wide p5, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 283
    const/4 p2, -0x1

    .line 284
    .line 285
    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 286
    .line 287
    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 288
    .line 289
    iput-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 290
    .line 291
    iget-object p2, p0, Lcom/tencent/bugly/proguard/bd;->c:Lcom/tencent/bugly/proguard/l2;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    .line 295
    move-result-object p2

    .line 296
    .line 297
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 298
    const/4 p2, 0x0

    .line 299
    .line 300
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 301
    .line 302
    const-string p2, ""

    .line 303
    .line 304
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m0:Ljava/lang/String;

    .line 305
    .line 306
    const-string p2, "0"

    .line 307
    .line 308
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n0:Ljava/lang/String;

    .line 309
    .line 310
    if-eqz p3, :cond_4

    .line 311
    .line 312
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    .line 313
    .line 314
    :cond_4
    :goto_1
    iget-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 318
    move-result p2

    .line 319
    .line 320
    if-eqz p2, :cond_5

    .line 321
    .line 322
    .line 323
    const-string/jumbo p2, "unknown(record)"

    .line 324
    .line 325
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 326
    :cond_5
    return-void
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
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public preDumpAnrInfo()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/u;->c()Lcom/tencent/bugly/proguard/u;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    const-class v0, Lcom/tencent/bugly/proguard/u;

    .line 11
    monitor-enter v0

    .line 12
    .line 13
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/u;->h()Z

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
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

.method public updateStateAndHandleAnr()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/u;->c()Lcom/tencent/bugly/proguard/u;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    const-class v0, Lcom/tencent/bugly/proguard/u;

    .line 11
    monitor-enter v0

    .line 12
    .line 13
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/u;->E:Lcom/tencent/bugly/proguard/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    monitor-exit v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/u;->q()Z

    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0

    .line 22
    throw v1
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
