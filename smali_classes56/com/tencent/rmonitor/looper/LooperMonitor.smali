.class public final Lcom/tencent/rmonitor/looper/LooperMonitor;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/looper/LooperMonitor$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0008\u0010\u0005\u001a\u00020\u0004H\u0002J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002J\u0008\u0010\t\u001a\u00020\u0008H\u0016J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0008\u0010\u000c\u001a\u00020\u0008H\u0016J\u0008\u0010\r\u001a\u00020\u0008H\u0016J\u0008\u0010\u000e\u001a\u00020\u0008H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0008\u0010\u0011\u001a\u00020\nH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/LooperMonitor;",
        "Lcom/tencent/bugly/proguard/df;",
        "Lcom/tencent/bugly/proguard/pa;",
        "createLagObserver",
        "Lcom/tencent/bugly/proguard/qa;",
        "createLagParam",
        "Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;",
        "createLooperStackProvider",
        "",
        "start",
        "",
        "isResume",
        "pause",
        "resume",
        "stop",
        "",
        "getPluginName",
        "isRunning",
        "lagObserver",
        "Lcom/tencent/bugly/proguard/pa;",
        "isStart",
        "Z",
        "<init>",
        "()V",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/rmonitor/looper/LooperMonitor$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_lag"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private isStart:Z

.field private lagObserver:Lcom/tencent/bugly/proguard/pa;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/LooperMonitor$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/looper/LooperMonitor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/looper/LooperMonitor;->Companion:Lcom/tencent/rmonitor/looper/LooperMonitor$Companion;

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
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

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

.method private final createLagObserver()Lcom/tencent/bugly/proguard/pa;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/LooperMonitor;->createLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, v0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "vsync"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/ei;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v0}, Lcom/tencent/bugly/proguard/ei;-><init>(Lcom/tencent/bugly/proguard/qa;)V

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    new-instance v1, Lcom/tencent/rmonitor/looper/LooperObserver;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    const-string v3, "getMainLooper()"

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Lcom/tencent/rmonitor/looper/LooperObserver;-><init>(Landroid/os/Looper;Lcom/tencent/bugly/proguard/qa;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/LooperMonitor;->createLooperStackProvider()Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/pa;->setStackProvider(Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;)V

    .line 42
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

.method private final createLagParam()Lcom/tencent/bugly/proguard/qa;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/qa;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qa;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/rmonitor/looper/LooperConfig;->INSTANCE:Lcom/tencent/rmonitor/looper/LooperConfig;

    .line 8
    .line 9
    const-string v2, "looper_stack"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/looper/LooperConfig;->getPluginConfig(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    instance-of v2, v1, Lcom/tencent/bugly/proguard/kb;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, Lcom/tencent/bugly/proguard/kb;

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    .line 23
    :goto_0
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget v2, v1, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 26
    .line 27
    iput v2, v0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 28
    .line 29
    iget v2, v1, Lcom/tencent/bugly/proguard/hf;->l:I

    .line 30
    int-to-long v2, v2

    .line 31
    .line 32
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/kb;->l()J

    .line 36
    move-result-wide v2

    .line 37
    .line 38
    iput-wide v2, v0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/kb;->k()Z

    .line 42
    move-result v2

    .line 43
    .line 44
    iput-boolean v2, v0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 45
    .line 46
    iget-object v1, v1, Lcom/tencent/bugly/proguard/kb;->x:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v1, v0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_1
    const v1, 0x3dcccccd    # 0.1f

    .line 53
    .line 54
    iput v1, v0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 55
    .line 56
    const-wide/16 v1, 0xc8

    .line 57
    .line 58
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 59
    .line 60
    const-wide/16 v1, 0x34

    .line 61
    .line 62
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 63
    const/4 v1, 0x1

    .line 64
    .line 65
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/qa;->e:Z

    .line 66
    .line 67
    const-string v1, "msg"

    .line 68
    .line 69
    iput-object v1, v0, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 70
    .line 71
    :goto_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 72
    .line 73
    new-instance v2, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    const-string v3, "createLagParam lagParam: "

    .line 76
    .line 77
    .line 78
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    const-string v3, "RMonitor_lag"

    .line 88
    .line 89
    .line 90
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 91
    move-result-object v2

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 95
    return-object v0
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
.end method

.method private final createLooperStackProvider()Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "looper_stack"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    instance-of v1, v0, Lcom/tencent/bugly/proguard/kb;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 20
    move-result-wide v1

    .line 21
    .line 22
    check-cast v0, Lcom/tencent/bugly/proguard/kb;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->j()F

    .line 26
    move-result v0

    .line 27
    float-to-double v3, v0

    .line 28
    .line 29
    cmpg-double v0, v1, v3

    .line 30
    .line 31
    if-gez v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lcom/tencent/bugly/proguard/ve;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ve;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/trace/QuickJavaThreadTrace;->c()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v0, 0x0

    .line 45
    .line 46
    :goto_0
    if-nez v0, :cond_1

    .line 47
    .line 48
    new-instance v0, Lcom/tencent/rmonitor/looper/provider/StackQueueProvider;

    .line 49
    .line 50
    .line 51
    invoke-direct {v0}, Lcom/tencent/rmonitor/looper/provider/StackQueueProvider;-><init>()V

    .line 52
    .line 53
    :cond_1
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 54
    .line 55
    new-instance v2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v3, "createLooperStackProvider, stackProvider: "

    .line 58
    .line 59
    .line 60
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    const-string v3, "RMonitor_lag"

    .line 70
    .line 71
    .line 72
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 73
    move-result-object v2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 77
    return-object v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method


# virtual methods
.method public getPluginName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "looper_stack"

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

.method public isResume()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->isResume()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

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
.end method

.method public pause()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->pause()V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public resume()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->resume()V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public start()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/LooperConfig;->INSTANCE:Lcom/tencent/rmonitor/looper/LooperConfig;

    .line 3
    .line 4
    const-string v1, "looper_stack"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/looper/LooperConfig;->isCanCollect(Ljava/lang/String;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    const-string v3, "RMonitor_lag"

    .line 17
    .line 18
    const-string v4, "start Lag Monitor fail for can\'t collect."

    .line 19
    .line 20
    .line 21
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    .line 27
    iput-boolean v2, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 28
    .line 29
    const-string v0, "can not collect"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 33
    return-void

    .line 34
    .line 35
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    return-void

    .line 39
    :cond_1
    monitor-enter p0

    .line 40
    .line 41
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/tencent/rmonitor/looper/LooperMonitor;->createLagObserver()Lcom/tencent/bugly/proguard/pa;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->start()V

    .line 53
    .line 54
    iput-object v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 55
    .line 56
    iput-boolean v1, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 57
    goto :goto_0

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_2

    .line 60
    .line 61
    :cond_2
    :goto_0
    sget-object v0, Lcom/tencent/bugly/proguard/k7$d;->a:Lcom/tencent/bugly/proguard/k7;

    .line 62
    .line 63
    const-string v1, "looper_stack"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/k7;->a(Ljava/lang/String;)V

    .line 67
    .line 68
    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    monitor-exit p0

    .line 70
    .line 71
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    const/4 v0, 0x0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 78
    goto :goto_1

    .line 79
    :cond_4
    const/4 v0, 0x2

    .line 80
    .line 81
    const-string v1, "Lag Observer is null"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    :goto_1
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/LooperMonitor;->resume()V

    .line 88
    .line 89
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 90
    .line 91
    const-string v1, "RMonitor_lag"

    .line 92
    .line 93
    const-string v2, "start Lag Monitors."

    .line 94
    .line 95
    .line 96
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 101
    return-void

    .line 102
    :goto_2
    monitor-exit p0

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
.end method

.method public stop()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/rmonitor/looper/LooperMonitor;->pause()V

    .line 9
    monitor-enter p0

    .line 10
    .line 11
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->stop()V

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    :goto_0
    iput-object v2, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->lagObserver:Lcom/tencent/bugly/proguard/pa;

    .line 28
    .line 29
    iput-boolean v1, p0, Lcom/tencent/rmonitor/looper/LooperMonitor;->isStart:Z

    .line 30
    .line 31
    :cond_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    monitor-exit p0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Lcom/tencent/bugly/proguard/df;->notifyStopResult(ILjava/lang/String;)V

    .line 36
    .line 37
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 38
    .line 39
    const-string v1, "RMonitor_lag"

    .line 40
    .line 41
    const-string v2, "stop Lag Monitor."

    .line 42
    .line 43
    .line 44
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0

    .line 51
    throw v0
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
