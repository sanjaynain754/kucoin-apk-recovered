.class public abstract Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;
.super Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/looper/provider/MultiStackProvider$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008&\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0004J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u000c\u001a\u00020\rJ#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!H&\u00a2\u0006\u0002\u0010#J\u0008\u0010$\u001a\u00020\u000bH\u0016J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u000c\u001a\u00020\rH\u0002J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u000c\u001a\u00020\rH\u0002J \u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\'2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;",
        "Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;",
        "Landroid/os/Handler$Callback;",
        "()V",
        "lastStackRequestTime",
        "",
        "monitorCallBack",
        "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;",
        "stackThreadHandler",
        "Landroid/os/Handler;",
        "beginTrace",
        "",
        "monitorInfo",
        "Lcom/tencent/rmonitor/looper/MonitorInfo;",
        "dispatchEnd",
        "endTime",
        "duration",
        "dispatchStart",
        "startTime",
        "endTrace",
        "isOverThreshold",
        "",
        "getStackThreadHandler",
        "handleCollectCompleted",
        "handleCollectStart",
        "handleMessage",
        "msg",
        "Landroid/os/Message;",
        "init",
        "callback",
        "isCurrentMsg",
        "onTrace",
        "stackTrace",
        "",
        "Ljava/lang/StackTraceElement;",
        "(Lcom/tencent/rmonitor/looper/MonitorInfo;[Ljava/lang/StackTraceElement;)V",
        "release",
        "removeMonitorMessage",
        "what",
        "",
        "sendMonitorMessage",
        "sendMonitorMessageDelay",
        "delay",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/rmonitor/looper/provider/MultiStackProvider$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final LONG_LAG_LIMIT:J = 0x1388L

.field public static final MSG_COLLECT_COMPLETED:I = 0x2

.field public static final MSG_COLLECT_START:I = 0x1

.field public static final TAG:Ljava/lang/String; = "RMonitor_looper_StackProvider"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private lastStackRequestTime:J

.field private monitorCallBack:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private stackThreadHandler:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->Companion:Lcom/tencent/rmonitor/looper/provider/MultiStackProvider$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;-><init>()V

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
.end method

.method private final handleCollectCompleted(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->endTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;Z)V

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->monitorCallBack:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;->onAfterStack(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 12
    :cond_0
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
.end method

.method private final handleCollectStart(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 9

    .line 1
    .line 2
    const-string v0, "handleCollectStart, deal msg not latest msg after trace, latest: "

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->isCurrentMsg(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z

    .line 6
    move-result v1

    .line 7
    .line 8
    const-string v2, ", deal: "

    .line 9
    .line 10
    const-string v3, "RMonitor_looper_StackProvider"

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v4, "handleCollectStart, deal msg not latest msg before trace, latest: "

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    iget-wide v4, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->lastStackRequestTime:J

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 33
    move-result-wide v4

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    filled-new-array {v3, p1}, [Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 48
    return-void

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->appendData(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 52
    .line 53
    .line 54
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    move-result-wide v4

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 59
    move-result-wide v6

    .line 60
    sub-long/2addr v4, v6

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    iget-wide v6, v1, Lcom/tencent/bugly/proguard/qa;->c:J

    .line 67
    .line 68
    cmp-long v1, v4, v6

    .line 69
    const/4 v6, 0x1

    .line 70
    .line 71
    const-wide/16 v7, 0x0

    .line 72
    .line 73
    if-lez v1, :cond_2

    .line 74
    .line 75
    const-wide/16 v0, 0x1388

    .line 76
    .line 77
    sub-long v2, v0, v4

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->copy()Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 85
    move-result-wide v0

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0, v1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setDuration(J)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v6}, Lcom/tencent/rmonitor/looper/MonitorInfo;->setDetectedLongLag(Z)V

    .line 92
    .line 93
    cmp-long v0, v2, v7

    .line 94
    .line 95
    if-gtz v0, :cond_1

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->handleCollectCompleted(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 99
    return-void

    .line 100
    :cond_1
    const/4 v0, 0x2

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, v0, p1, v2, v3}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->sendMonitorMessageDelay(ILcom/tencent/rmonitor/looper/MonitorInfo;J)V

    .line 104
    return-void

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThread()Ljava/lang/Thread;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    if-eqz v1, :cond_6

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 114
    move-result v4

    .line 115
    .line 116
    if-eqz v4, :cond_6

    .line 117
    .line 118
    .line 119
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->shouldSuspendBeforeGetStack()Z

    .line 120
    move-result v4

    .line 121
    .line 122
    if-eqz v4, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 126
    move-result-object v4

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, v1}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->b(Ljava/lang/Thread;)J

    .line 130
    move-result-wide v4

    .line 131
    goto :goto_0

    .line 132
    :catchall_0
    move-exception p1

    .line 133
    goto :goto_1

    .line 134
    :cond_3
    move-wide v4, v7

    .line 135
    .line 136
    .line 137
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 138
    move-result-object v1

    .line 139
    .line 140
    cmp-long v7, v4, v7

    .line 141
    .line 142
    if-eqz v7, :cond_4

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 146
    move-result-object v7

    .line 147
    .line 148
    .line 149
    invoke-virtual {v7, v4, v5}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->a(J)Z

    .line 150
    .line 151
    .line 152
    :cond_4
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->isCurrentMsg(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z

    .line 153
    move-result v4

    .line 154
    .line 155
    if-eqz v4, :cond_5

    .line 156
    .line 157
    const-string v0, "stackTrace"

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, p1, v1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->onTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;[Ljava/lang/StackTraceElement;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    iget-wide v0, v0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 170
    .line 171
    .line 172
    invoke-direct {p0, v6, p1, v0, v1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->sendMonitorMessageDelay(ILcom/tencent/rmonitor/looper/MonitorInfo;J)V

    .line 173
    return-void

    .line 174
    .line 175
    :cond_5
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 176
    .line 177
    new-instance v4, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    iget-wide v5, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->lastStackRequestTime:J

    .line 183
    .line 184
    .line 185
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 192
    move-result-wide v5

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    .line 202
    filled-new-array {v3, p1}, [Ljava/lang/String;

    .line 203
    move-result-object p1

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    return-void

    .line 208
    .line 209
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 210
    .line 211
    const-string v1, "on trace fail for "

    .line 212
    .line 213
    .line 214
    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    .line 218
    filled-new-array {v3, p1}, [Ljava/lang/String;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 223
    :cond_6
    return-void
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
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
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
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method private final removeMonitorMessage(ILcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

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
.end method

.method private final sendMonitorMessage(ILcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput p1, v0, Landroid/os/Message;->what:I

    .line 7
    .line 8
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    :cond_0
    return-void
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
.end method

.method private final sendMonitorMessageDelay(ILcom/tencent/rmonitor/looper/MonitorInfo;J)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iput p1, v0, Landroid/os/Message;->what:I

    .line 7
    .line 8
    iput-object p2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0, p3, p4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 16
    :cond_0
    return-void
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
.end method


# virtual methods
.method public abstract beginTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public dispatchEnd(Lcom/tencent/rmonitor/looper/MonitorInfo;JJ)V
    .locals 0
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "monitorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 p2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, p2, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->removeMonitorMessage(ILcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 13
    move-result-object p2

    .line 14
    .line 15
    iget-wide p2, p2, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 16
    .line 17
    cmp-long p2, p4, p2

    .line 18
    .line 19
    if-ltz p2, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->appendData(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->copy()Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 26
    move-result-object p1

    .line 27
    const/4 p2, 0x2

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p2, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->sendMonitorMessage(ILcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p2, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, p2}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->endTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;Z)V

    .line 36
    .line 37
    :goto_0
    const-wide/16 p1, 0x0

    .line 38
    .line 39
    iput-wide p1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->lastStackRequestTime:J

    .line 40
    return-void
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
.end method

.method public dispatchStart(Lcom/tencent/rmonitor/looper/MonitorInfo;J)V
    .locals 1
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string p2, "monitorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 9
    move-result-wide p2

    .line 10
    .line 11
    iput-wide p2, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->lastStackRequestTime:J

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->beginTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    iget-wide p2, p2, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 21
    const/4 v0, 0x1

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->sendMonitorMessageDelay(ILcom/tencent/rmonitor/looper/MonitorInfo;J)V

    .line 25
    return-void
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
.end method

.method public abstract endTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;Z)V
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public final getStackThreadHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

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
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 9
    .param p1    # Landroid/os/Message;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "msg"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/tencent/rmonitor/looper/MonitorInfo;

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    .line 17
    :goto_0
    if-nez v0, :cond_1

    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    .line 21
    :cond_1
    iget v1, p1, Landroid/os/Message;->what:I

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    if-eq v1, v2, :cond_3

    .line 25
    const/4 p1, 0x2

    .line 26
    .line 27
    if-eq v1, p1, :cond_2

    .line 28
    goto :goto_1

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-direct {p0, v0}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->handleCollectCompleted(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 32
    goto :goto_1

    .line 33
    .line 34
    .line 35
    :cond_3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 36
    move-result-wide v3

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->b()J

    .line 40
    move-result-wide v5

    .line 41
    .line 42
    .line 43
    invoke-direct {p0, v0}, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->handleCollectStart(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->b()J

    .line 47
    move-result-wide v7

    .line 48
    sub-long/2addr v7, v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/os/Message;->getWhen()J

    .line 52
    move-result-wide v5

    .line 53
    sub-long/2addr v3, v5

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v3, v4, v7, v8}, Lcom/tencent/rmonitor/looper/MonitorInfo;->addCollectStackMsgSample(JJ)V

    .line 57
    :goto_1
    return v2
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
.end method

.method public init(Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z
    .locals 3
    .param p1    # Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->monitorCallBack:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThread()Ljava/lang/Thread;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lcom/tencent/bugly/proguard/mg;->a(Ljava/lang/Thread;)Landroid/os/Looper;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    .line 29
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "prepare stack provider fail for exception {"

    .line 34
    .line 35
    .line 36
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const/16 p1, 0x7d

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    const-string v1, "RMonitor_looper_StackProvider"

    .line 51
    .line 52
    .line 53
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 58
    :cond_0
    const/4 p1, 0x0

    .line 59
    return p1
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
.end method

.method public final isCurrentMsg(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z
    .locals 4
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "monitorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->lastStackRequestTime:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v2, v0, v2

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 17
    move-result-wide v2

    .line 18
    .line 19
    cmp-long p1, v0, v2

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    const/4 p1, 0x1

    .line 23
    return p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return p1
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
.end method

.method public abstract onTrace(Lcom/tencent/rmonitor/looper/MonitorInfo;[Ljava/lang/StackTraceElement;)V
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/StackTraceElement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public release()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->stackThreadHandler:Landroid/os/Handler;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;->getLooperThread()Ljava/lang/Thread;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/bugly/proguard/mg;->e(Ljava/lang/Thread;)Z

    .line 18
    .line 19
    iput-object v1, p0, Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;->monitorCallBack:Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;

    .line 20
    return-void
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
.end method
