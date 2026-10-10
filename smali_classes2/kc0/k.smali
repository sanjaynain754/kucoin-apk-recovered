.class public Lkc0/k;
.super Ljava/lang/Object;
.source "SendProducerBatchTask.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lkc0/i;

.field public final c:Ljc0/b;

.field public final d:Lkc0/j;

.field public final e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Lkc0/i;Ljc0/b;Lkc0/j;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkc0/i;",
            "Ljc0/b;",
            "Lkc0/j;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lkc0/k;->b:Lkc0/i;

    .line 6
    .line 7
    iput-object p2, p0, Lkc0/k;->c:Ljc0/b;

    .line 8
    .line 9
    iput-object p3, p0, Lkc0/k;->d:Lkc0/j;

    .line 10
    .line 11
    iput-object p4, p0, Lkc0/k;->e:Ljava/util/concurrent/BlockingQueue;

    .line 12
    .line 13
    iput-object p5, p0, Lkc0/k;->f:Ljava/util/concurrent/BlockingQueue;

    .line 14
    .line 15
    iput-object p6, p0, Lkc0/k;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 16
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
.end method

.method public static c(Ljava/net/URI;Ljava/util/Map;Ljava/util/Map;[BJ)Lmc0/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URI;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[BJ)",
            "Lmc0/b;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lmc0/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lmc0/b;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;->POST:Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lmc0/b;->k(Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lmc0/b;->j(Ljava/net/URI;)V

    .line 14
    .line 15
    const-string p0, "/structuredlog"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lmc0/b;->m(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lmc0/b;->l(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p2}, Lmc0/a;->e(Ljava/util/Map;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p3}, Lmc0/a;->c([B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p4, p5}, Lmc0/a;->d(J)V

    .line 31
    return-object v0
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
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;JLjava/lang/String;)Lkc0/a;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 7
    .line 8
    new-instance v0, Lkc0/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;->GetErrorCode()Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;->GetErrorMessage()Ljava/lang/String;

    .line 16
    move-result-object v4

    .line 17
    const/4 v1, 0x0

    .line 18
    move-wide v5, p2

    .line 19
    move-object v2, p4

    .line 20
    .line 21
    .line 22
    invoke-direct/range {v0 .. v6}, Lkc0/a;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 23
    return-object v0

    .line 24
    :cond_0
    move-wide v5, p2

    .line 25
    .line 26
    new-instance v1, Lkc0/a;

    .line 27
    .line 28
    const-string v4, "BadResponse"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    const/4 v2, 0x0

    .line 34
    .line 35
    const-string v3, ""

    .line 36
    move-wide v6, v5

    .line 37
    move-object v5, p1

    .line 38
    .line 39
    .line 40
    invoke-direct/range {v1 .. v7}, Lkc0/a;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 41
    return-object v1
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
.end method

.method public final b(Lkc0/i;)Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lkc0/i;->g()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/tencentcloudapi/cls/android/cls/Cls$LogGroup;->newBuilder()Lcom/tencentcloudapi/cls/android/cls/Cls$LogGroup$a;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    move-result v2

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    check-cast v2, Lkc0/f;

    .line 25
    .line 26
    iget-object v2, v2, Lkc0/f;->a:Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Lcom/tencentcloudapi/cls/android/cls/Cls$LogGroup$a;->a(Lcom/tencentcloudapi/cls/android/cls/Cls$Log$a;)Lcom/tencentcloudapi/cls/android/cls/Cls$LogGroup$a;

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    new-instance v0, Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lkc0/i;->k()Ljava/lang/String;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    iget-object v2, p0, Lkc0/k;->c:Ljc0/b;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljc0/b;->o()Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    const-string v3, ""

    .line 45
    .line 46
    .line 47
    invoke-direct {v0, p1, v2, v3, v1}, Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencentcloudapi/cls/android/cls/Cls$LogGroup$a;)V

    .line 48
    return-object v0
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
.end method

.method public final d()J
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lkc0/k;->b:Lkc0/i;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkc0/i;->j()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lkc0/k;->c:Ljc0/b;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljc0/b;->a()J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    const-wide/16 v3, 0x2

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v4, v0}, Lcom/google/common/math/LongMath;->pow(JI)J

    .line 18
    move-result-wide v3

    .line 19
    mul-long/2addr v1, v3

    .line 20
    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    cmp-long v0, v1, v3

    .line 24
    .line 25
    if-gtz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lkc0/k;->c:Ljc0/b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljc0/b;->i()J

    .line 31
    move-result-wide v1

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lkc0/k;->c:Ljc0/b;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljc0/b;->i()J

    .line 37
    move-result-wide v3

    .line 38
    .line 39
    .line 40
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 41
    move-result-wide v0

    .line 42
    return-wide v0
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

.method public final e()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    const/4 v1, 0x3

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 7
    .line 8
    const-string v1, "Content-Length"

    .line 9
    .line 10
    const-string v2, "0"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    const-string v1, "Content-Type"

    .line 16
    .line 17
    const-string v2, "application/x-protobuf"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v1, p0, Lkc0/k;->c:Ljc0/b;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljc0/b;->d()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    const-string v2, "Host"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    return-object v0
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

.method public final f()Ljava/net/URI;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lkc0/k;->c:Ljc0/b;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljc0/b;->e()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    iget-object v1, p0, Lkc0/k;->c:Ljc0/b;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljc0/b;->d()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    :try_start_0
    new-instance v1, Ljava/net/URI;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    return-object v1

    .line 34
    :catch_0
    move-exception v0

    .line 35
    .line 36
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v2, "EndpointInvalid"

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    throw v1
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

.method public final g(Ljava/lang/Exception;)Z
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;->GetErrorCode()Ljava/lang/String;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    const-string v2, "SendFailed"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;->GetErrorCode()Ljava/lang/String;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    const-string v0, "SpeedQuotaExceed"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    move-result p1

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return v1

    .line 34
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 35
    return p1

    .line 36
    :cond_2
    return v1
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
.end method

.method public final h(Ljava/lang/Exception;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lkc0/k;->g(Ljava/lang/Exception;)Z

    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    return v0

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lkc0/k;->d:Lkc0/j;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lkc0/j;->b()Z

    .line 14
    move-result p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    return v0

    .line 18
    .line 19
    :cond_1
    iget-object p1, p0, Lkc0/k;->b:Lkc0/i;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lkc0/i;->j()I

    .line 23
    move-result p1

    .line 24
    .line 25
    iget-object v1, p0, Lkc0/k;->c:Ljc0/b;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljc0/b;->j()I

    .line 29
    move-result v1

    .line 30
    .line 31
    if-lt p1, v1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lkc0/k;->f:Ljava/util/concurrent/BlockingQueue;

    .line 34
    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 37
    move-result p1

    .line 38
    .line 39
    iget-object v1, p0, Lkc0/k;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 43
    move-result v1

    .line 44
    .line 45
    div-int/lit8 v1, v1, 0x2

    .line 46
    .line 47
    if-gt p1, v1, :cond_2

    .line 48
    return v0

    .line 49
    :cond_2
    const/4 p1, 0x0

    .line 50
    return p1
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
.end method

.method public final i(Ljava/util/Map;Ljava/util/Map;[B)Lcom/tencentcloudapi/cls/android/producer/response/PutLogsResponse;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B)",
            "Lcom/tencentcloudapi/cls/android/producer/response/PutLogsResponse;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/tencentcloudapi/cls/android/producer/common/LogException;
        }
    .end annotation

    .line 1
    array-length v0, p3

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    const-string v1, "Content-Length"

    .line 8
    .line 9
    .line 10
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    :try_start_0
    iget-object v0, p0, Lkc0/k;->c:Ljc0/b;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljc0/b;->k()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    iget-object v0, p0, Lkc0/k;->c:Ljc0/b;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljc0/b;->l()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    sget-object v0, Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;->POST:Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencentcloudapi/cls/android/producer/http/comm/HttpMethod;->toString()Ljava/lang/String;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-string v5, "/structuredlog"

    .line 31
    .line 32
    .line 33
    const-wide/32 v8, 0x493e0

    .line 34
    move-object v6, p1

    .line 35
    move-object v7, p2

    .line 36
    .line 37
    .line 38
    invoke-static/range {v2 .. v9}, Loc0/e;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;J)Ljava/lang/String;

    .line 39
    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 40
    move-object v3, v6

    .line 41
    move-object v4, v7

    .line 42
    .line 43
    const-string p2, "Authorization"

    .line 44
    .line 45
    .line 46
    invoke-interface {v4, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    const-string p1, "x-cls-compress-type"

    .line 49
    .line 50
    const-string p2, "lz4"

    .line 51
    .line 52
    .line 53
    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    const-string p1, "x-cls-add-source"

    .line 56
    .line 57
    const-string p2, "1"

    .line 58
    .line 59
    .line 60
    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    iget-object p1, p0, Lkc0/k;->c:Ljc0/b;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljc0/b;->m()Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 70
    move-result p1

    .line 71
    .line 72
    if-nez p1, :cond_0

    .line 73
    .line 74
    iget-object p1, p0, Lkc0/k;->c:Ljc0/b;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Ljc0/b;->m()Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    const-string p2, "X-Cls-Token"

    .line 81
    .line 82
    .line 83
    invoke-interface {v4, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    :cond_0
    const-string p1, "User-Agent"

    .line 86
    .line 87
    const-string p2, "cls-android-sdk-1.0.3"

    .line 88
    .line 89
    .line 90
    invoke-interface {v4, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lkc0/k;->f()Ljava/net/URI;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    .line 97
    invoke-static {p3}, Loc0/c;->a([B)[B

    .line 98
    move-result-object v5

    .line 99
    array-length p1, v5

    .line 100
    int-to-long v6, p1

    .line 101
    .line 102
    .line 103
    invoke-static/range {v2 .. v7}, Lkc0/k;->c(Ljava/net/URI;Ljava/util/Map;Ljava/util/Map;[BJ)Lmc0/b;

    .line 104
    move-result-object p1

    .line 105
    array-length p2, v5

    .line 106
    .line 107
    .line 108
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 109
    move-result-object p2

    .line 110
    .line 111
    .line 112
    invoke-interface {v4, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    :try_start_1
    invoke-static {p1}, Llc0/a;->b(Lmc0/b;)Lcom/tencentcloudapi/cls/android/producer/response/PutLogsResponse;

    .line 116
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/response/Response;->GetHttpStatusCode()Ljava/lang/Integer;

    .line 120
    move-result-object p2

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 124
    move-result p2

    .line 125
    .line 126
    const/16 p3, 0xc8

    .line 127
    .line 128
    if-eq p2, p3, :cond_3

    .line 129
    .line 130
    const/16 p3, 0x1ad

    .line 131
    .line 132
    if-eq p2, p3, :cond_2

    .line 133
    .line 134
    const/16 p3, 0x1f4

    .line 135
    .line 136
    if-eq p2, p3, :cond_1

    .line 137
    .line 138
    new-instance p2, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/tencentcloudapi/cls/android/producer/response/Response;->GetAllHeaders()Ljava/util/Map;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    const-string p3, "BadResponse"

    .line 149
    .line 150
    .line 151
    invoke-direct {p2, p3, p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    throw p2

    .line 153
    .line 154
    :cond_1
    new-instance p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 155
    .line 156
    const-string p2, "InternalError"

    .line 157
    .line 158
    const-string p3, "internal server error"

    .line 159
    .line 160
    .line 161
    invoke-direct {p1, p2, p3}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    throw p1

    .line 163
    .line 164
    :cond_2
    new-instance p1, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 165
    .line 166
    const-string p2, "SpeedQuotaExceed"

    .line 167
    .line 168
    const-string p3, "speed quota exceed"

    .line 169
    .line 170
    .line 171
    invoke-direct {p1, p2, p3}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    throw p1

    .line 173
    :cond_3
    return-object p1

    .line 174
    :catch_0
    move-exception v0

    .line 175
    move-object p1, v0

    .line 176
    .line 177
    new-instance p2, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 178
    .line 179
    const-string p3, "SendFailed"

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 183
    move-result-object p1

    .line 184
    .line 185
    .line 186
    invoke-direct {p2, p3, p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    throw p2

    .line 188
    :catch_1
    move-exception v0

    .line 189
    move-object p1, v0

    .line 190
    .line 191
    new-instance p2, Lcom/tencentcloudapi/cls/android/producer/common/LogException;

    .line 192
    .line 193
    const-string p3, "EncodingException"

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 197
    move-result-object p1

    .line 198
    .line 199
    .line 200
    invoke-direct {p2, p3, p1}, Lcom/tencentcloudapi/cls/android/producer/common/LogException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 201
    throw p2
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
.end method

.method public final j(J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;
        }
    .end annotation

    .line 1
    const/4 v1, 0x0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lkc0/k;->b:Lkc0/i;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lkc0/k;->b(Lkc0/i;)Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkc0/k;->e()Ljava/util/Map;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const-string v3, "topic_id"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;->GetTopic()Ljava/lang/String;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3, v4}, Lcom/tencentcloudapi/cls/android/producer/request/Request;->SetParam(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/tencentcloudapi/cls/android/producer/request/Request;->GetAllParams()Ljava/util/Map;

    .line 24
    move-result-object v3

    .line 25
    .line 26
    iget-object v4, p0, Lkc0/k;->c:Ljc0/b;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4}, Ljc0/b;->o()Ljava/lang/String;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    iget-object v5, p0, Lkc0/k;->b:Lkc0/i;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Lkc0/i;->i()Ljava/lang/String;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v4, v5}, Lcom/tencentcloudapi/cls/android/producer/request/PutLogsRequest;->GetLogGroupBytes(Ljava/lang/String;Ljava/lang/String;)[B

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3, v2, v0}, Lkc0/k;->i(Ljava/util/Map;Ljava/util/Map;[B)Lcom/tencentcloudapi/cls/android/producer/response/PutLogsResponse;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    new-instance v2, Lkc0/a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/tencentcloudapi/cls/android/producer/response/Response;->GetRequestId()Ljava/lang/String;

    .line 50
    move-result-object v4

    .line 51
    .line 52
    const-string v5, ""

    .line 53
    .line 54
    const-string v6, ""
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 55
    const/4 v3, 0x1

    .line 56
    move-wide v7, p1

    .line 57
    .line 58
    .line 59
    :try_start_1
    invoke-direct/range {v2 .. v8}, Lkc0/a;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 60
    .line 61
    iget-object p1, p0, Lkc0/k;->b:Lkc0/i;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v2}, Lkc0/i;->a(Lkc0/a;)V

    .line 65
    .line 66
    iget-object p1, p0, Lkc0/k;->e:Ljava/util/concurrent/BlockingQueue;

    .line 67
    .line 68
    iget-object p2, p0, Lkc0/k;->b:Lkc0/i;

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 72
    return-void

    .line 73
    :catch_0
    move-exception v0

    .line 74
    :goto_0
    move-object p1, v0

    .line 75
    goto :goto_1

    .line 76
    :catch_1
    move-exception v0

    .line 77
    move-wide v7, p1

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :goto_1
    if-eqz v1, :cond_0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/tencentcloudapi/cls/android/producer/response/Response;->GetRequestId()Ljava/lang/String;

    .line 84
    move-result-object p2

    .line 85
    goto :goto_2

    .line 86
    .line 87
    :cond_0
    const-string p2, ""

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-virtual {p0, p1, v7, v8, p2}, Lkc0/k;->a(Ljava/lang/Exception;JLjava/lang/String;)Lkc0/a;

    .line 91
    move-result-object p2

    .line 92
    .line 93
    iget-object v0, p0, Lkc0/k;->b:Lkc0/i;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p2}, Lkc0/i;->a(Lkc0/a;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, p1}, Lkc0/k;->h(Ljava/lang/Exception;)Z

    .line 100
    move-result p1

    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    iget-object p1, p0, Lkc0/k;->f:Ljava/util/concurrent/BlockingQueue;

    .line 105
    .line 106
    iget-object p2, p0, Lkc0/k;->b:Lkc0/i;

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 110
    goto :goto_3

    .line 111
    .line 112
    .line 113
    :cond_1
    invoke-virtual {p0}, Lkc0/k;->d()J

    .line 114
    move-result-wide p1

    .line 115
    .line 116
    iget-object v0, p0, Lkc0/k;->b:Lkc0/i;

    .line 117
    .line 118
    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 120
    move-result-wide v1

    .line 121
    add-long/2addr v1, p1

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v1, v2}, Lkc0/i;->p(J)V

    .line 125
    .line 126
    :try_start_2
    iget-object p1, p0, Lkc0/k;->d:Lkc0/j;

    .line 127
    .line 128
    iget-object p2, p0, Lkc0/k;->b:Lkc0/i;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1, p2}, Lkc0/j;->c(Lkc0/i;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_2

    .line 132
    goto :goto_3

    .line 133
    .line 134
    :catch_2
    iget-object p1, p0, Lkc0/k;->d:Lkc0/j;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lkc0/j;->b()Z

    .line 138
    move-result p1

    .line 139
    .line 140
    if-eqz p1, :cond_2

    .line 141
    .line 142
    iget-object p1, p0, Lkc0/k;->f:Ljava/util/concurrent/BlockingQueue;

    .line 143
    .line 144
    iget-object p2, p0, Lkc0/k;->b:Lkc0/i;

    .line 145
    .line 146
    .line 147
    invoke-interface {p1, p2}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    .line 148
    :cond_2
    :goto_3
    return-void
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
.end method

.method public run()V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lkc0/k;->j(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    const-string v2, "Uncaught error in send producer batch task, topic_id="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    iget-object v2, p0, Lkc0/k;->b:Lkc0/i;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lkc0/i;->k()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, ", e=%s"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, Lhc0/a;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    const-string v1, "producer"

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v0}, Lhc0/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    return-void
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
