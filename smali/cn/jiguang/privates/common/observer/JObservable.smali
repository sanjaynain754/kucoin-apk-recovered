.class public Lcn/jiguang/privates/common/observer/JObservable;
.super Ljava/lang/Object;
.source "JObservable.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "JObservable"

.field public static final WHAT_OBSERVER:I = 0x65

.field private static volatile instance:Lcn/jiguang/privates/common/observer/JObservable;


# instance fields
.field public observeNameQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcn/jiguang/privates/common/observer/JObserver;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeNameQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    return-void
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static getInstance()Lcn/jiguang/privates/common/observer/JObservable;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/common/observer/JObservable;->instance:Lcn/jiguang/privates/common/observer/JObservable;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-class v0, Lcn/jiguang/privates/common/observer/JObservable;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lcn/jiguang/privates/common/observer/JObservable;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcn/jiguang/privates/common/observer/JObservable;-><init>()V

    .line 13
    .line 14
    sput-object v1, Lcn/jiguang/privates/common/observer/JObservable;->instance:Lcn/jiguang/privates/common/observer/JObservable;

    .line 15
    monitor-exit v0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v1

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v1

    .line 20
    .line 21
    :cond_0
    :goto_0
    sget-object v0, Lcn/jiguang/privates/common/observer/JObservable;->instance:Lcn/jiguang/privates/common/observer/JObservable;

    .line 22
    return-object v0
.end method


# virtual methods
.method public dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcn/jiguang/privates/common/observer/JObserver;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p2}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 22
    move-result v2

    .line 23
    .line 24
    if-nez v2, :cond_0

    .line 25
    goto :goto_0

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Lcn/jiguang/privates/common/observer/JObserver;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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
.end method

.method public handleMessage(Landroid/content/Context;ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    check-cast v1, Lcn/jiguang/privates/common/observer/JObserver;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcn/jiguang/privates/common/observer/JObserver;->getThreadName()[Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v1, p4}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 37
    move-result v2

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    goto :goto_0

    .line 41
    .line 42
    :cond_2
    if-nez p2, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p1, p4, p5}, Lcn/jiguang/privates/common/observer/JObserver;->handleMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 46
    :cond_3
    const/4 v2, 0x1

    .line 47
    .line 48
    if-ne p2, v2, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1, p4, p5}, Lcn/jiguang/privates/common/observer/JObserver;->handleDelayMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 52
    goto :goto_0

    .line 53
    :cond_4
    return-void
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
.end method

.method public observer(Landroid/content/Context;Lcn/jiguang/privates/common/observer/JObserver;)V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    iget-object v1, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeNameQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    .line 23
    move-result v1

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    :goto_0
    return-void

    .line 27
    .line 28
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    const-string v2, "observer "

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    const-string v2, "JObservable"

    .line 46
    .line 47
    .line 48
    invoke-static {v2, v1}, Lcn/jiguang/privates/common/log/JCommonLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    iget-object v1, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    iget-object v1, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeNameQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    new-instance v1, Landroid/os/Bundle;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 64
    .line 65
    const-string v2, "observer_name"

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lcn/jiguang/privates/common/global/JGlobal;->isMainProcess(Landroid/content/Context;)Z

    .line 72
    move-result v0

    .line 73
    .line 74
    if-eqz v0, :cond_6

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getLifecycleState()Z

    .line 78
    move-result v0

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getCurrentActivityName()Ljava/lang/String;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 86
    move-result v3

    .line 87
    const/4 v4, 0x0

    .line 88
    .line 89
    .line 90
    const-string/jumbo v5, "state"

    .line 91
    .line 92
    if-nez v3, :cond_3

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v5, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 96
    .line 97
    const-string v0, "activity"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    const/16 v0, 0x3ed

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, v0}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 106
    move-result v2

    .line 107
    .line 108
    if-nez v2, :cond_2

    .line 109
    .line 110
    const/16 v2, 0x3ee

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, v2}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 114
    move-result v2

    .line 115
    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    .line 119
    :cond_2
    invoke-virtual {p2, p1, v0, v4}, Lcn/jiguang/privates/common/observer/JObserver;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 120
    .line 121
    .line 122
    :cond_3
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getNetworkState()Z

    .line 123
    move-result v0

    .line 124
    .line 125
    .line 126
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getNetworkType()I

    .line 127
    move-result v2

    .line 128
    .line 129
    .line 130
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getNetworkName()Ljava/lang/String;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    .line 134
    invoke-static {}, Lcn/jiguang/privates/common/global/JGlobal;->getNetworkRadio()Ljava/lang/String;

    .line 135
    move-result-object v6

    .line 136
    .line 137
    .line 138
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    move-result v7

    .line 140
    .line 141
    if-nez v7, :cond_6

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v5, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 145
    .line 146
    .line 147
    const-string/jumbo v5, "type"

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v5, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 151
    .line 152
    const-string v2, "name"

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    const-string v2, "radio"

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    const/16 v2, 0x3eb

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v2}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 166
    move-result v3

    .line 167
    .line 168
    const/16 v5, 0x3ec

    .line 169
    .line 170
    if-nez v3, :cond_4

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, v5}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 174
    move-result v3

    .line 175
    .line 176
    if-eqz v3, :cond_6

    .line 177
    .line 178
    :cond_4
    if-eqz v0, :cond_5

    .line 179
    goto :goto_1

    .line 180
    :cond_5
    move v2, v5

    .line 181
    .line 182
    .line 183
    :goto_1
    invoke-virtual {p2, p1, v2, v4}, Lcn/jiguang/privates/common/observer/JObserver;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 184
    .line 185
    .line 186
    :cond_6
    invoke-static {}, Lcn/jiguang/privates/common/binder/JMessenger;->getInstance()Lcn/jiguang/privates/common/binder/JMessenger;

    .line 187
    move-result-object p2

    .line 188
    .line 189
    const/16 v0, 0x65

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2, p1, v0, v1}, Lcn/jiguang/privates/common/binder/JMessenger;->sendMessageToRemoteProcess(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 193
    return-void
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
.end method

.method public observerOnRemoteProcess(Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 7

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "state"

    .line 4
    .line 5
    :try_start_0
    const-string v1, "observer_name"

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    iget-object v2, p0, Lcn/jiguang/privates/common/observer/JObservable;->observeNameQueue:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->contains(Ljava/lang/Object;)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    instance-of v2, v1, Lcn/jiguang/privates/common/observer/JObserver;

    .line 30
    .line 31
    if-eqz v2, :cond_6

    .line 32
    .line 33
    check-cast v1, Lcn/jiguang/privates/common/observer/JObserver;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1, v1}, Lcn/jiguang/privates/common/observer/JObservable;->observer(Landroid/content/Context;Lcn/jiguang/privates/common/observer/JObserver;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 40
    move-result v2

    .line 41
    .line 42
    const-string v3, "activity"

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v3

    .line 47
    .line 48
    .line 49
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 50
    move-result v4

    .line 51
    const/4 v5, 0x0

    .line 52
    .line 53
    if-nez v4, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lcn/jiguang/privates/common/global/JGlobal;->setLifecycleState(Z)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Lcn/jiguang/privates/common/global/JGlobal;->setCurrentActivityName(Ljava/lang/String;)V

    .line 60
    .line 61
    const/16 v3, 0x7cb

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v3}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 65
    move-result v4

    .line 66
    .line 67
    const/16 v6, 0x7ca

    .line 68
    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v6}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 73
    move-result v4

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    goto :goto_3

    .line 79
    .line 80
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v3, v6

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-virtual {v1, p1, v3, v5}, Lcn/jiguang/privates/common/observer/JObserver;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 89
    move-result v0

    .line 90
    .line 91
    .line 92
    const-string/jumbo v3, "type"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 96
    move-result v3

    .line 97
    .line 98
    const-string v4, "name"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    move-result-object v4

    .line 103
    .line 104
    const-string v6, "radio"

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 112
    move-result v6

    .line 113
    .line 114
    if-nez v6, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-static {v0}, Lcn/jiguang/privates/common/global/JGlobal;->setNetworkState(Z)V

    .line 118
    .line 119
    .line 120
    invoke-static {v3}, Lcn/jiguang/privates/common/global/JGlobal;->setNetworkType(I)V

    .line 121
    .line 122
    .line 123
    invoke-static {v4}, Lcn/jiguang/privates/common/global/JGlobal;->setNetworkName(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {p2}, Lcn/jiguang/privates/common/global/JGlobal;->setNetworkRadio(Ljava/lang/String;)V

    .line 127
    .line 128
    const/16 p2, 0x7cd

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p2}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 132
    move-result v0

    .line 133
    .line 134
    const/16 v3, 0x7cc

    .line 135
    .line 136
    if-nez v0, :cond_4

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v3}, Lcn/jiguang/privates/common/observer/JObserver;->isSupport(I)Z

    .line 140
    move-result v0

    .line 141
    .line 142
    if-eqz v0, :cond_6

    .line 143
    .line 144
    :cond_4
    if-eqz v2, :cond_5

    .line 145
    goto :goto_2

    .line 146
    :cond_5
    move p2, v3

    .line 147
    .line 148
    .line 149
    :goto_2
    invoke-virtual {v1, p1, p2, v5}, Lcn/jiguang/privates/common/observer/JObserver;->dispatchMessage(Landroid/content/Context;ILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 150
    return-void

    .line 151
    .line 152
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    const-string v0, "observer failed "

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    const-string p2, "JObservable"

    .line 174
    .line 175
    .line 176
    invoke-static {p2, p1}, Lcn/jiguang/privates/common/log/JCommonLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 177
    :cond_6
    :goto_4
    return-void
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
.end method
