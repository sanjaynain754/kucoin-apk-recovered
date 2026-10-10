.class public Lcom/tencent/bugly/proguard/fa;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field public static final i:I = 0xa

.field public static j:Ljava/lang/String;

.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/tencent/bugly/proguard/j3;

.field public final c:Lcom/tencent/bugly/proguard/pg;

.field public final d:Lcom/tencent/bugly/proguard/l2;

.field public e:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public f:Ljava/lang/Thread$UncaughtExceptionHandler;

.field public g:Z

.field public h:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/fa;->k:Ljava/lang/Object;

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

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/bugly/proguard/j3;Lcom/tencent/bugly/proguard/pg;Lcom/tencent/bugly/proguard/l2;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/fa;->g:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/fa;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/tencent/bugly/proguard/fa;->c:Lcom/tencent/bugly/proguard/pg;

    .line 13
    .line 14
    iput-object p4, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    .line 15
    return-void
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

.method public static a(Ljava/lang/Throwable;I)Ljava/lang/String;
    .locals 2

    .line 302
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    .line 303
    const-string p0, ""

    return-object p0

    :cond_0
    if-ltz p1, :cond_2

    .line 304
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, p1, :cond_1

    goto :goto_0

    .line 305
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\n[Message over limit size:"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ", has been cutted!]"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0
.end method

.method public static synthetic a(Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 24
    invoke-static {}, Lcom/tencent/bugly/common/utils/HprofFileIUtil;->dumpOOMHprof()V

    .line 25
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public static b(Ljava/lang/Throwable;I)Ljava/lang/String;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 13
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    if-lez p1, :cond_1

    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-lt v4, p1, :cond_1

    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\n[Stack over limit size :"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " , has been cutted !]"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\n"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 18
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "gen stack error %s"

    invoke-static {p1, p0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 19
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BLjava/util/concurrent/CountDownLatch;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    .line 26
    new-array p1, v1, [Ljava/lang/Object;

    const-string p2, "We can do nothing with a null throwable."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 27
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/se$c;->c:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2, v0, p3}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    const/4 p1, 0x0

    return-object p1

    .line 28
    :cond_0
    new-instance v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    invoke-direct {v2}, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;-><init>()V

    .line 29
    invoke-virtual {p0, v2, p2, p1, p3}, Lcom/tencent/bugly/proguard/fa;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/Throwable;Ljava/lang/Thread;Z)Ljava/lang/String;

    move-result-object p1

    .line 30
    iget-object v3, p0, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v3, v2}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 31
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v3

    sget-object v4, Lcom/tencent/bugly/proguard/se$c;->d:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v3, v4, v0, p3}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 32
    invoke-virtual {p0, p2, p3, p6}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Throwable;ZLjava/util/concurrent/CountDownLatch;)V

    .line 33
    invoke-virtual {p0, v2, p1}, Lcom/tencent/bugly/proguard/fa;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;)V

    .line 34
    iget-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    .line 35
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/se$b;->c:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2, p3}, Lcom/tencent/bugly/proguard/se;->a(IZ)V

    .line 36
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/se$c;->e:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2, v1, p3}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 37
    invoke-virtual {p0, v2, p3}, Lcom/tencent/bugly/proguard/fa;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)V

    .line 38
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/se$c;->f:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2, v1, p3}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 39
    invoke-virtual {p0, v2, p3, p4, p5}, Lcom/tencent/bugly/proguard/fa;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ZLjava/lang/String;[B)V

    .line 40
    iget-object p1, p0, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {p1, v2}, Lcom/tencent/bugly/proguard/j3;->i(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 41
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/proguard/se$c;->g:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {p1, p2, v0, p3}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 42
    invoke-static {}, Lcom/tencent/bugly/proguard/eb;->b()[B

    move-result-object p1

    iput-object p1, v2, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->H:[B

    if-nez p1, :cond_2

    goto :goto_0

    .line 43
    :cond_2
    array-length v1, p1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo p2, "user log size:%d"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-object v2
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/Throwable;Ljava/lang/Thread;Z)Ljava/lang/String;
    .locals 7

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->A:J

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    .line 80
    :goto_0
    iput v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c:I

    .line 81
    iget-object v1, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v1, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->J:Ljava/lang/String;

    .line 82
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, ")"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    const/16 v1, 0x3e8

    .line 84
    invoke-static {p2, v1}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    array-length v3, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 86
    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    .line 87
    const-string/jumbo v4, "stack frame :%d, has cause %b"

    invoke-static {v4, v3}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 88
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    array-length v3, v3

    const-string v4, ""

    if-lez v3, :cond_2

    .line 89
    invoke-virtual {p2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v3

    aget-object v3, v3, v0

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v4

    :goto_2
    move-object v5, p2

    :goto_3
    if-eqz v5, :cond_3

    .line 90
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 91
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v5

    goto :goto_3

    :cond_3
    if-eqz v5, :cond_5

    if-eq v5, p2, :cond_5

    .line 92
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 93
    invoke-static {v5, v1}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object p4

    iput-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    .line 94
    invoke-virtual {v5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p4

    array-length p4, p4

    if-lez p4, :cond_4

    .line 95
    invoke-virtual {v5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p4

    aget-object p4, p4, v0

    invoke-virtual {p4}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 96
    :cond_4
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ":"

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    sget v1, Lcom/tencent/bugly/proguard/k3;->B:I

    invoke-static {p2, v1}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    const-string p2, "\nCaused by:\n"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    sget p2, Lcom/tencent/bugly/proguard/k3;->B:I

    invoke-static {v5, p2}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object p2

    .line 103
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    return-object p2

    .line 105
    :cond_5
    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    .line 106
    invoke-static {}, Lcom/tencent/bugly/proguard/k3;->l()Lcom/tencent/bugly/proguard/k3;

    move-result-object p3

    invoke-virtual {p3}, Lcom/tencent/bugly/proguard/k3;->p()Z

    move-result p3

    if-eqz p3, :cond_6

    if-eqz p4, :cond_6

    .line 107
    new-array p3, v0, [Ljava/lang/Object;

    .line 108
    sget-object p4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string v0, "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!"

    invoke-static {p4, v0, p3}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 109
    const-string p3, " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]"

    goto :goto_4

    :cond_6
    move-object p3, v4

    .line 110
    :goto_4
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->x:Ljava/lang/String;

    .line 111
    iput-object v3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->y:Ljava/lang/String;

    .line 112
    sget p3, Lcom/tencent/bugly/proguard/k3;->B:I

    invoke-static {p2, p3}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object p2

    .line 113
    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    return-object p2
.end method

.method public declared-synchronized a()Ljava/lang/Thread$UncaughtExceptionHandler;
    .locals 1

    monitor-enter p0

    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;
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

.method public declared-synchronized a(Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;)V
    .locals 2

    monitor-enter p0

    if-eqz p1, :cond_1

    .line 295
    :try_start_0
    iget-boolean v0, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/fa;->g:Z

    if-eq v0, v1, :cond_1

    .line 296
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "java changed to %b"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 297
    iget-boolean p1, p1, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z

    if-eqz p1, :cond_0

    .line 298
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fa;->c()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    .line 299
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fa;->d()V

    goto :goto_1

    .line 300
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 301
    :cond_1
    :goto_1
    monitor-exit p0

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Ljava/lang/String;)V
    .locals 3

    .line 59
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->F()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->v:Ljava/lang/String;

    .line 60
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->n()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i:Ljava/lang/String;

    .line 61
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->o()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j:Ljava/lang/String;

    .line 62
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->F:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->l:Ljava/lang/String;

    .line 63
    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->k:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k:Ljava/lang/String;

    .line 64
    iget-object v1, v0, Lcom/tencent/bugly/proguard/l2;->g0:Ljava/lang/String;

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m:Ljava/lang/String;

    .line 65
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n:Ljava/lang/String;

    .line 66
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->getOperationLogString()Ljava/util/List;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->p:Ljava/util/List;

    .line 67
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-boolean v1, v0, Lcom/tencent/bugly/proguard/l2;->i0:Z

    iput-boolean v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h:Z

    .line 68
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->j()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->o:Ljava/lang/String;

    .line 69
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->W:Ljava/lang/String;

    .line 70
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->v()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->q:Ljava/util/Map;

    .line 71
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->u()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->r:Ljava/util/Map;

    .line 72
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-wide v1, v0, Lcom/tencent/bugly/proguard/l2;->c:J

    iput-wide v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->b0:J

    .line 73
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->K()Z

    move-result v0

    iput-boolean v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->c0:Z

    .line 74
    iget-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->z:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/bi;->c([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->D:Ljava/lang/String;

    .line 75
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    .line 76
    iget-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->K:Ljava/lang/String;

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->a()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->m0:Ljava/lang/String;

    .line 78
    invoke-static {}, Lcom/tencent/bugly/proguard/u7;->c()Lcom/tencent/bugly/proguard/u7;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/u7;->b()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->n0:Ljava/lang/String;

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)V
    .locals 2

    .line 44
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->i()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->L:J

    .line 45
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->k()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->M:J

    .line 46
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->e()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->N:J

    .line 47
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->C()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->O:J

    .line 48
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->D()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->P:J

    .line 49
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->E()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->Q:J

    if-nez p2, :cond_0

    .line 50
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->c()I

    move-result p2

    const/16 v0, 0x1f

    if-lt p2, v0, :cond_0

    const-wide/16 v0, 0x0

    .line 51
    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    goto :goto_0

    .line 52
    :cond_0
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/tencent/bugly/proguard/o4;->b(Landroid/content/Context;)J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->R:J

    .line 53
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->o()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->S:J

    .line 54
    invoke-static {}, Lcom/tencent/bugly/proguard/o4;->f()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->T:J

    .line 55
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    .line 56
    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->U:J

    .line 57
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Runtime;->totalMemory()J

    move-result-wide v0

    .line 58
    iput-wide v0, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->V:J

    return-void
.end method

.method public final a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;ZLjava/lang/String;[B)V
    .locals 3

    if-nez p2, :cond_3

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    .line 114
    :try_start_0
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    move v1, v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    move v1, p2

    :goto_0
    if-eqz p4, :cond_1

    .line 115
    array-length v2, p4

    if-lez v2, :cond_1

    move p2, v0

    :cond_1
    if-eqz v1, :cond_2

    .line 116
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    iput-object v1, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->d0:Ljava/util/Map;

    .line 117
    const-string v0, "UserData"

    invoke-interface {v1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    if-eqz p2, :cond_3

    .line 118
    iput-object p4, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->j0:[B

    .line 119
    :cond_3
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->H()I

    move-result p2

    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->f0:I

    .line 120
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->A()I

    move-result p2

    iput p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->g0:I

    .line 121
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->i()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    .line 122
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p2

    if-eqz p2, :cond_4

    .line 123
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p2

    invoke-virtual {p2}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getCrashThreadLocalValue()Ljava/lang/String;

    move-result-object p2

    .line 124
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_4

    .line 125
    iget-object p3, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->h0:Ljava/util/Map;

    sget-object p4, Lcom/tencent/bugly/proguard/l2;->J0:Ljava/lang/String;

    invoke-interface {p3, p4, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    :cond_4
    iget-object p2, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/l2;->h()Ljava/util/Map;

    move-result-object p2

    iput-object p2, p1, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->i0:Ljava/util/Map;

    .line 127
    invoke-static {p1}, Lcom/tencent/bugly/proguard/g5;->b(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 128
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "handle crash error %s"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 0

    const/4 p1, 0x0

    .line 12
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "current process die"

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 13
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p1

    invoke-static {p1}, Landroid/os/Process;->killProcess(I)V

    const/4 p1, 0x1

    .line 14
    invoke-static {p1}, Ljava/lang/System;->exit(I)V

    return-void
.end method

.method public a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZ)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    const-string v8, "crashreport last handle end!"

    const-string v9, "crashreport last handle start!"

    const-string/jumbo v10, "system handle end!"

    const-string/jumbo v11, "system handle start!"

    const-string/jumbo v12, "sys default last handle end!"

    const-string/jumbo v13, "sys default last handle start!"

    const/4 v14, 0x0

    if-eqz v4, :cond_1

    .line 135
    invoke-virtual {v1, v3}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 136
    new-array v0, v14, [Ljava/lang/Object;

    const-string/jumbo v5, "this crash is in white list, bugly will not handle it"

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 137
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 139
    :cond_0
    new-array v0, v14, [Ljava/lang/Object;

    .line 140
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v3, "this crash is in white list and not looper thread, just return"

    invoke-static {v2, v3, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_1
    :goto_0
    if-eqz v4, :cond_3

    .line 141
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    filled-new-array {v0, v5}, [Ljava/lang/Object;

    move-result-object v0

    const-string v5, "Java Crash Happen cause by %s(%d)"

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 142
    invoke-virtual/range {p0 .. p1}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 143
    new-array v0, v14, [Ljava/lang/Object;

    .line 144
    sget-object v5, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    const-string/jumbo v6, "this class has handled this exception"

    invoke-static {v5, v6, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 145
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_2

    .line 146
    const-string v0, "call system handler"

    new-array v6, v14, [Ljava/lang/Object;

    .line 147
    invoke-static {v5, v0, v6}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 148
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 149
    :cond_2
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 150
    :cond_3
    new-array v0, v14, [Ljava/lang/Object;

    const-string v5, "Java Catch Happen"

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 151
    :cond_4
    :goto_1
    :try_start_0
    iget-boolean v0, v1, Lcom/tencent/bugly/proguard/fa;->g:Z

    if-nez v0, :cond_8

    .line 152
    const-string v0, "Java crash handler is disable. Just return."

    new-array v5, v14, [Ljava/lang/Object;

    invoke-static {v0, v5}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_7

    .line 153
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_5

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 154
    new-array v0, v14, [Ljava/lang/Object;

    .line 155
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v13, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 156
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 157
    new-array v0, v14, [Ljava/lang/Object;

    .line 158
    invoke-static {v4, v12, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 159
    :cond_5
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_6

    .line 160
    new-array v0, v14, [Ljava/lang/Object;

    .line 161
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v11, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 162
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 163
    new-array v0, v14, [Ljava/lang/Object;

    .line 164
    invoke-static {v4, v10, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 165
    :cond_6
    new-array v0, v14, [Ljava/lang/Object;

    .line 166
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v9, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 167
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 168
    new-array v0, v14, [Ljava/lang/Object;

    .line 169
    invoke-static {v4, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :cond_7
    move-object v7, v1

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    move-object v7, v1

    move-object v15, v2

    move-object v2, v8

    move v8, v4

    goto/16 :goto_c

    .line 170
    :cond_8
    :try_start_1
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->c:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v0

    if-nez v0, :cond_9

    .line 171
    const-string/jumbo v0, "no remote but still store!"

    new-array v5, v14, [Ljava/lang/Object;

    invoke-static {v0, v5}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 172
    :cond_9
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->c:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->c()Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;

    move-result-object v0

    .line 173
    iget-boolean v0, v0, Lcom/tencent/bugly/crashreport/common/strategy/StrategyBean;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v15, "JAVA_CATCH"

    const-string v16, "JAVA_CRASH"

    if-nez v0, :cond_d

    :try_start_2
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->c:Lcom/tencent/bugly/proguard/pg;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pg;->d()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 174
    const-string v0, "crash report was closed by remote , will not upload to Bugly , print local for helpful!"

    new-array v5, v14, [Ljava/lang/Object;

    invoke-static {v0, v5}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    if-eqz v4, :cond_a

    move-object/from16 v17, v16

    goto :goto_2

    :cond_a
    move-object/from16 v17, v15

    .line 175
    :goto_2
    invoke-static {}, Lcom/tencent/bugly/proguard/bi;->a()Ljava/lang/String;

    move-result-object v18

    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v0, v0, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v20

    invoke-static {v3}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v21

    const/16 v22, 0x0

    move-object/from16 v19, v0

    .line 176
    invoke-static/range {v17 .. v22}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_7

    .line 177
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_b

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 178
    new-array v0, v14, [Ljava/lang/Object;

    .line 179
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v13, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 180
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 181
    new-array v0, v14, [Ljava/lang/Object;

    .line 182
    invoke-static {v4, v12, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 183
    :cond_b
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_c

    .line 184
    new-array v0, v14, [Ljava/lang/Object;

    .line 185
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v11, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 186
    iget-object v0, v1, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v2, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 187
    new-array v0, v14, [Ljava/lang/Object;

    .line 188
    invoke-static {v4, v10, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 189
    :cond_c
    new-array v0, v14, [Ljava/lang/Object;

    .line 190
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v9, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 191
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 192
    new-array v0, v14, [Ljava/lang/Object;

    .line 193
    invoke-static {v4, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 194
    :cond_d
    :try_start_3
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v0

    sget-object v5, Lcom/tencent/bugly/proguard/se$c;->b:Lcom/tencent/bugly/proguard/se$c;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    invoke-virtual {v0, v5, v4, v3}, Lcom/tencent/bugly/proguard/se;->a(IZLjava/lang/Throwable;)V

    .line 195
    new-instance v7, Ljava/util/concurrent/CountDownLatch;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    .line 196
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BLjava/util/concurrent/CountDownLatch;)Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;

    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v17, v7

    move-object v7, v1

    move-object v1, v2

    move-object v2, v3

    move v3, v4

    if-nez v6, :cond_10

    .line 197
    :try_start_4
    const-string/jumbo v0, "pkg crash data fail!"

    new-array v4, v14, [Ljava/lang/Object;

    invoke-static {v0, v4}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v3, :cond_1c

    .line 198
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_e

    invoke-virtual {v7, v0}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 199
    new-array v0, v14, [Ljava/lang/Object;

    .line 200
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v13, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 201
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 202
    new-array v0, v14, [Ljava/lang/Object;

    .line 203
    invoke-static {v3, v12, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 204
    :cond_e
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_f

    .line 205
    new-array v0, v14, [Ljava/lang/Object;

    .line 206
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v11, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 207
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v1, v2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 208
    new-array v0, v14, [Ljava/lang/Object;

    .line 209
    invoke-static {v3, v10, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    .line 210
    :cond_f
    new-array v0, v14, [Ljava/lang/Object;

    .line 211
    sget-object v3, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v3, v9, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 212
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 213
    new-array v0, v14, [Ljava/lang/Object;

    .line 214
    invoke-static {v3, v8, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void

    :catchall_1
    move-exception v0

    move v15, v3

    move-object v3, v2

    move-object v2, v8

    move v8, v15

    move-object v15, v1

    goto/16 :goto_c

    .line 215
    :cond_10
    :try_start_5
    iget-object v4, v6, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->I:Ljava/util/Map;

    sget v5, Lcom/tencent/bugly/proguard/k3;->B:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move/from16 v1, p6

    :try_start_6
    invoke-static {v1, v5, v0, v14}, Lcom/tencent/bugly/proguard/bi;->a(ZIZZ)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    if-eqz v3, :cond_11

    .line 216
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    .line 217
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-eqz v0, :cond_11

    .line 218
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->a:Landroid/content/Context;

    .line 219
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v1

    .line 220
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/bi;->a(Landroid/content/Context;Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v6, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    goto :goto_4

    :catchall_2
    move-exception v0

    move-object/from16 v15, p1

    :goto_3
    move-object/from16 v16, v8

    move v8, v3

    goto/16 :goto_6

    .line 221
    :cond_11
    :goto_4
    iget-object v0, v6, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->k0:Ljava/lang/String;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-lt v0, v1, :cond_12

    .line 222
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v0

    sget-object v1, Lcom/tencent/bugly/proguard/se$b;->b:Lcom/tencent/bugly/proguard/se$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1, v3}, Lcom/tencent/bugly/proguard/se;->a(IZ)V

    :cond_12
    if-eqz v3, :cond_13

    move-object/from16 v1, v16

    goto :goto_5

    :cond_13
    move-object v1, v15

    .line 223
    :goto_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/bi;->a(J)Ljava/lang/String;

    move-result-object v0

    .line 224
    iget-object v4, v7, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    iget-object v4, v4, Lcom/tencent/bugly/proguard/l2;->f:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    move-object v3, v4

    .line 225
    :try_start_7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Lcom/tencent/bugly/proguard/bi;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move-object/from16 v15, p1

    move-object v2, v0

    move-object/from16 v16, v8

    move/from16 v8, p3

    .line 226
    :try_start_8
    invoke-static/range {v1 .. v6}, Lcom/tencent/bugly/proguard/j3;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V

    .line 227
    invoke-static {}, Lcom/tencent/bugly/proguard/se;->a()Lcom/tencent/bugly/proguard/se;

    move-result-object v0

    sget-object v1, Lcom/tencent/bugly/proguard/se$c;->h:Lcom/tencent/bugly/proguard/se$c;

    .line 228
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    .line 229
    invoke-virtual {v0, v1, v14, v8}, Lcom/tencent/bugly/proguard/se;->a(IZZ)V

    .line 230
    iget-object v0, v6, Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;->w:Ljava/lang/String;

    const-class v1, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_14

    .line 231
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object v0

    const-string v1, "crash"

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getNativeProcessInfo(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_6

    :catchall_4
    move-exception v0

    move-object/from16 v15, p1

    move-object/from16 v16, v8

    move/from16 v8, p3

    goto :goto_6

    :catchall_5
    move-exception v0

    move-object v15, v1

    goto :goto_3

    .line 232
    :goto_6
    :try_start_9
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 233
    :cond_14
    :goto_7
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v0, v6, v8}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;Z)Z

    move-result v0

    if-nez v0, :cond_15

    .line 234
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getId()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_15

    .line 235
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, v6, v1, v2, v8}, Lcom/tencent/bugly/proguard/j3;->a(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;JZ)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object/from16 v3, p2

    :goto_8
    move-object/from16 v2, v16

    goto :goto_c

    :cond_15
    :goto_9
    if-eqz v8, :cond_16

    move-object/from16 v3, p2

    .line 236
    :try_start_a
    invoke-virtual {v7, v3}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 237
    :try_start_b
    invoke-virtual/range {v17 .. v17}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    goto :goto_a

    :catchall_7
    move-exception v0

    .line 238
    :try_start_c
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 239
    :goto_a
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->b:Lcom/tencent/bugly/proguard/j3;

    invoke-virtual {v0, v6}, Lcom/tencent/bugly/proguard/j3;->g(Lcom/tencent/bugly/crashreport/crash/CrashDetailBean;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    goto :goto_b

    :catchall_8
    move-exception v0

    goto :goto_8

    :cond_16
    move-object/from16 v3, p2

    :goto_b
    if-eqz v8, :cond_1c

    .line 240
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_17

    invoke-virtual {v7, v0}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 241
    new-array v0, v14, [Ljava/lang/Object;

    invoke-static {v13, v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 242
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 243
    new-array v0, v14, [Ljava/lang/Object;

    .line 244
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v12, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto/16 :goto_e

    .line 245
    :cond_17
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_18

    .line 246
    new-array v0, v14, [Ljava/lang/Object;

    invoke-static {v11, v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 247
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 248
    new-array v0, v14, [Ljava/lang/Object;

    .line 249
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v10, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_e

    .line 250
    :cond_18
    new-array v0, v14, [Ljava/lang/Object;

    invoke-static {v9, v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 251
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 252
    new-array v0, v14, [Ljava/lang/Object;

    .line 253
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    move-object/from16 v2, v16

    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_e

    .line 254
    :goto_c
    :try_start_d
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_19

    .line 255
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    goto :goto_d

    :catchall_9
    move-exception v0

    goto :goto_f

    :cond_19
    :goto_d
    if-eqz v8, :cond_1c

    .line 256
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1a

    invoke-virtual {v7, v0}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v0

    if-eqz v0, :cond_1a

    .line 257
    new-array v0, v14, [Ljava/lang/Object;

    .line 258
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v13, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 259
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 260
    new-array v0, v14, [Ljava/lang/Object;

    .line 261
    invoke-static {v1, v12, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_e

    .line 262
    :cond_1a
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1b

    .line 263
    new-array v0, v14, [Ljava/lang/Object;

    .line 264
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v11, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 265
    iget-object v0, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 266
    new-array v0, v14, [Ljava/lang/Object;

    .line 267
    invoke-static {v1, v10, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_e

    .line 268
    :cond_1b
    new-array v0, v14, [Ljava/lang/Object;

    .line 269
    sget-object v1, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v1, v9, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 270
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 271
    new-array v0, v14, [Ljava/lang/Object;

    .line 272
    invoke-static {v1, v2, v0}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_1c
    :goto_e
    return-void

    :goto_f
    if-eqz v8, :cond_20

    .line 273
    iget-object v1, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_1e

    invoke-virtual {v7, v1}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto :goto_10

    .line 274
    :cond_1d
    new-array v1, v14, [Ljava/lang/Object;

    invoke-static {v13, v1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 275
    iget-object v1, v7, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 276
    new-array v1, v14, [Ljava/lang/Object;

    .line 277
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v12, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_11

    .line 278
    :cond_1e
    :goto_10
    iget-object v1, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v1, :cond_1f

    .line 279
    new-array v1, v14, [Ljava/lang/Object;

    invoke-static {v11, v1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 280
    iget-object v1, v7, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v1, v15, v3}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 281
    new-array v1, v14, [Ljava/lang/Object;

    .line 282
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v2, v10, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    goto :goto_11

    .line 283
    :cond_1f
    new-array v1, v14, [Ljava/lang/Object;

    .line 284
    sget-object v4, Lcom/tencent/rmonitor/common/logger/LogState;->ERROR:Lcom/tencent/rmonitor/common/logger/LogState;

    invoke-static {v4, v9, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 285
    invoke-virtual/range {p0 .. p2}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 286
    new-array v1, v14, [Ljava/lang/Object;

    .line 287
    invoke-static {v4, v2, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 288
    :cond_20
    :goto_11
    throw v0
.end method

.method public final a(Ljava/lang/Throwable;ZLjava/util/concurrent/CountDownLatch;)V
    .locals 2

    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-class v0, Ljava/lang/OutOfMemoryError;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 16
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p1

    .line 17
    const-string p2, "common"

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object p1

    .line 18
    instance-of p2, p1, Lcom/tencent/bugly/proguard/m2;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/tencent/bugly/proguard/m2;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/m2;->g()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 19
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getId()J

    move-result-wide p1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-nez p1, :cond_0

    .line 20
    invoke-static {}, Lcom/tencent/bugly/proguard/m0;->c()Lcom/tencent/bugly/proguard/m0;

    move-result-object p1

    new-instance p2, Lcom/tencent/bugly/proguard/cj;

    invoke-direct {p2, p3}, Lcom/tencent/bugly/proguard/cj;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/m0;->a(Ljava/lang/Runnable;)Z

    return-void

    .line 21
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/HprofFileIUtil;->dumpOOMHprof()V

    .line 22
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 23
    :cond_1
    invoke-virtual {p3}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public final a(Ljava/lang/Thread$UncaughtExceptionHandler;)Z
    .locals 7

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 289
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 290
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    .line 291
    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v1, v4

    .line 292
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v6

    .line 293
    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    .line 294
    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const-string/jumbo v6, "uncaughtException"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final a(Ljava/lang/Thread;)Z
    .locals 3

    .line 129
    sget-object v0, Lcom/tencent/bugly/proguard/fa;->k:Ljava/lang/Object;

    monitor-enter v0

    .line 130
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/fa;->j:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/tencent/bugly/proguard/fa;->j:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 131
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 132
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    sput-object p1, Lcom/tencent/bugly/proguard/fa;->j:Ljava/lang/String;

    const/4 p1, 0x0

    .line 133
    monitor-exit v0

    return p1

    .line 134
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final a(Ljava/lang/Throwable;)Z
    .locals 4

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object v1

    .line 2
    const-string v2, "crash"

    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/b;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/xe;

    move-result-object v1

    .line 3
    instance-of v2, v1, Lcom/tencent/bugly/proguard/f3;

    if-nez v2, :cond_0

    return v0

    .line 4
    :cond_0
    check-cast v1, Lcom/tencent/bugly/proguard/f3;

    .line 5
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/f3;->g()Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    .line 6
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/tencent/bugly/proguard/k3;->B:I

    .line 7
    invoke-static {p1, v3}, Lcom/tencent/bugly/proguard/fa;->b(Ljava/lang/Throwable;I)Ljava/lang/String;

    move-result-object v3

    .line 8
    invoke-virtual {v1, v2, v3}, Lcom/tencent/bugly/proguard/f3;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 9
    const-string v1, "Crash in white list: %s"

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v1, "check crash white list error %s"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_2
    return v0
.end method

.method public declared-synchronized b()V
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_1
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public declared-synchronized b(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    monitor-enter p0

    .line 4
    :try_start_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;
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

.method public final b(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 8

    .line 6
    :cond_0
    :goto_0
    :try_start_0
    const-string/jumbo v0, "tryRestoreFromException: %s"

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 7
    invoke-static {}, Landroid/os/Looper;->loop()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v0

    .line 8
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s is not in white list, exit process"

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->M()Z

    move-result v7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v4, 0x1

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZ)V

    goto :goto_0
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 1

    .line 5
    invoke-static {}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->getInstance()Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;

    move-result-object p1

    const-string v0, "crash"

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/crashreport/crash/jni/NativeCrashHandler;->saveAdditionalAttachmentPaths(Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized c()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget v0, p0, Lcom/tencent/bugly/proguard/fa;->h:I

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    if-lt v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const-string v1, "java crash handler over %d, no need set."

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v0, 0x1

    .line 26
    .line 27
    :try_start_1
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/fa;->g:Z

    .line 28
    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    if-eqz v1, :cond_3

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    .line 59
    .line 60
    :cond_1
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    const-string v3, "com.android.internal.os.RuntimeInit$UncaughtHandler"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result v2

    .line 72
    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 77
    move-result-object v2

    .line 78
    .line 79
    .line 80
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    const-string v3, "backup system java handler: %s"

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 87
    .line 88
    iput-object v1, p0, Lcom/tencent/bugly/proguard/fa;->f:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 89
    goto :goto_0

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 93
    move-result-object v2

    .line 94
    .line 95
    .line 96
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    const-string v3, "backup java handler: %s"

    .line 100
    .line 101
    .line 102
    invoke-static {v3, v2}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 103
    .line 104
    :goto_0
    iput-object v1, p0, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 105
    .line 106
    .line 107
    :cond_3
    invoke-static {p0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 108
    .line 109
    iget v1, p0, Lcom/tencent/bugly/proguard/fa;->h:I

    .line 110
    add-int/2addr v1, v0

    .line 111
    .line 112
    iput v1, p0, Lcom/tencent/bugly/proguard/fa;->h:I

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    const-string/jumbo v1, "registered java monitor: %s"

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 127
    monitor-exit p0

    .line 128
    return-void

    .line 129
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 130
    throw v0
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
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    .line 4
    :try_start_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/fa;->g:Z

    .line 5
    .line 6
    new-array v0, v0, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v1, "close java monitor!"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->d(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const-string v0, "Java monitor to unregister: %s"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    sget-object v2, Lcom/tencent/rmonitor/common/logger/LogState;->INFO:Lcom/tencent/rmonitor/common/logger/LogState;

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v0, v1}, Lcom/tencent/bugly/proguard/x4;->a(Lcom/tencent/rmonitor/common/logger/LogState;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 55
    .line 56
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->e:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 60
    .line 61
    iget v0, p0, Lcom/tencent/bugly/proguard/fa;->h:I

    .line 62
    .line 63
    add-int/lit8 v0, v0, -0x1

    .line 64
    .line 65
    iput v0, p0, Lcom/tencent/bugly/proguard/fa;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_1

    .line 69
    :cond_0
    :goto_0
    monitor-exit p0

    .line 70
    return-void

    .line 71
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

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

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 9

    .line 1
    .line 2
    sget-object v1, Lcom/tencent/bugly/proguard/fa;->k:Ljava/lang/Object;

    .line 3
    monitor-enter v1

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/fa;->d:Lcom/tencent/bugly/proguard/l2;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/l2;->M()Z

    .line 9
    move-result v8

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    move-object v2, p0

    .line 14
    move-object v3, p1

    .line 15
    move-object v4, p2

    .line 16
    .line 17
    .line 18
    invoke-virtual/range {v2 .. v8}, Lcom/tencent/bugly/proguard/fa;->a(Ljava/lang/Thread;Ljava/lang/Throwable;ZLjava/lang/String;[BZ)V

    .line 19
    monitor-exit v1

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    move-object p1, v0

    .line 23
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
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
