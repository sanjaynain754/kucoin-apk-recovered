.class Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;
.super Ljava/lang/Object;
.source "SensorsABTestApiRequestHelper.java"

# interfaces
.implements Lcom/sensorsdata/abtest/core/IApiCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->requestExperimentByParamName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/Map;ILcom/sensorsdata/abtest/OnABTestReceivedData;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sensorsdata/abtest/core/IApiCallback<",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Lcom/sensorsdata/abtest/entity/Experiment;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

.field final synthetic val$anonymousId:Ljava/lang/String;

.field final synthetic val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

.field final synthetic val$distinctId:Ljava/lang/String;

.field final synthetic val$loginId:Ljava/lang/String;

.field final synthetic val$runnable:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;


# direct methods
.method public constructor <init>(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$runnable:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$distinctId:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$loginId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$anonymousId:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/sensorsdata/abtest/util/TaskRunner;->getBackHandler()Landroid/os/Handler;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    iget-object p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$runnable:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->getInstance()Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    iget-object p2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->removeTask(Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;)V

    .line 19
    .line 20
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$000(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;)Z

    .line 24
    move-result p1

    .line 25
    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;->getRequestingExperimentList()Ljava/util/List;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    const-string v0, "Task merged request size is "

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    move-result v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    move-result-object p2

    .line 54
    .line 55
    const-string v0, "SAB.SensorsABTestApiRequestHelper"

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result p2

    .line 67
    .line 68
    if-eqz p2, :cond_0

    .line 69
    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    check-cast p2, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;->getResultCallBack()Lcom/sensorsdata/abtest/OnABTestReceivedData;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p2}, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;->getDefaultValue()Ljava/lang/Object;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    iget-object v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 85
    .line 86
    .line 87
    invoke-static {v2, v1, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 88
    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 93
    .line 94
    .line 95
    const-string/jumbo v2, "onFailure and return default value: "

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    move-result-object p2

    .line 106
    .line 107
    .line 108
    invoke-static {v0, p2}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_0
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    .line 112
    const/4 p2, 0x1

    .line 113
    .line 114
    .line 115
    invoke-static {p1, p2}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$002(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Z)Z

    .line 116
    :cond_1
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
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->onSuccess(Ljava/util/Map;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/sensorsdata/abtest/entity/Experiment;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->getInstance()Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;

    move-result-object v0

    iget-object v1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    invoke-virtual {v0, v1}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorderManager;->removeTask(Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;)V

    .line 3
    iget-object v0, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$currentTask:Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;

    invoke-virtual {v0}, Lcom/sensorsdata/abtest/core/RequestExperimentTaskRecorder;->getRequestingExperimentList()Ljava/util/List;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/sensorsdata/abtest/util/TaskRunner;->getBackHandler()Landroid/os/Handler;

    move-result-object v1

    iget-object v2, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$runnable:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$TimeoutRunnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 5
    iget-object v1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$000(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;)Z

    move-result v1

    const-string v2, "SAB.SensorsABTestApiRequestHelper"

    if-eqz v1, :cond_0

    .line 6
    const-string p1, "Request success! but all callbacks has been returned with default value!"

    invoke-static {v2, p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Task merged request size is "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;

    .line 9
    invoke-virtual {v1}, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;->getResultCallBack()Lcom/sensorsdata/abtest/OnABTestReceivedData;

    move-result-object v3

    .line 10
    invoke-virtual {v1}, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;->getParamName()Ljava/lang/String;

    move-result-object v4

    .line 11
    invoke-virtual {v1}, Lcom/sensorsdata/abtest/entity/RequestingExperimentInfo;->getDefaultValue()Ljava/lang/Object;

    move-result-object v1

    if-nez p1, :cond_2

    .line 12
    :try_start_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onSuccess response is empty and return default value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object v4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v4, v3, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    goto :goto_0

    .line 14
    :cond_2
    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/sensorsdata/abtest/entity/Experiment;

    if-nez v5, :cond_3

    .line 15
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onSuccess experiment is empty and return default value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v4, v3, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    goto :goto_0

    .line 17
    :cond_3
    invoke-virtual {v5, v4, v1}, Lcom/sensorsdata/abtest/entity/Experiment;->checkTypeIsValid(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    if-eqz v1, :cond_5

    .line 18
    const-string v6, ""

    .line 19
    invoke-virtual {v5, v4}, Lcom/sensorsdata/abtest/entity/Experiment;->getVariableByParamName(Ljava/lang/String;)Lcom/sensorsdata/abtest/entity/Experiment$Variable;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 20
    iget-object v6, v5, Lcom/sensorsdata/abtest/entity/Experiment$Variable;->type:Ljava/lang/String;

    .line 21
    :cond_4
    sget-object v5, Lcom/sensorsdata/abtest/entity/SABErrorEnum;->ASYNC_REQUEST_PARAMS_TYPE_NOT_VALID:Lcom/sensorsdata/abtest/entity/SABErrorEnum;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->toString()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v4, v6, v7}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Lcom/sensorsdata/abtest/core/SABErrorDispatcher;->dispatchSABException(Lcom/sensorsdata/abtest/entity/SABErrorEnum;[Ljava/lang/Object;)V

    .line 22
    :cond_5
    iget-object v4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v4, v3, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    goto :goto_0

    .line 23
    :cond_6
    invoke-virtual {v5, v4, v1}, Lcom/sensorsdata/abtest/entity/Experiment;->getVariableValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 24
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "onSuccess return value: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v6, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v6, v3, v4}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    .line 26
    iget-boolean v4, v5, Lcom/sensorsdata/abtest/entity/Experiment;->isWhiteList:Z

    if-nez v4, :cond_1

    .line 27
    invoke-static {}, Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;->getInstance()Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;

    move-result-object v4

    iget-object v6, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$distinctId:Ljava/lang/String;

    iget-object v7, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$loginId:Ljava/lang/String;

    iget-object v8, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->val$anonymousId:Ljava/lang/String;

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/sensorsdata/abtest/core/SensorsABTestTrackHelper;->trackABTestTrigger(Lcom/sensorsdata/abtest/entity/Experiment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 28
    :catch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v5, "onSuccess Exception and return default value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/sensorsdata/analytics/android/sdk/SALog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    iget-object v4, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    invoke-static {v4, v3, v1}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$100(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Lcom/sensorsdata/abtest/OnABTestReceivedData;Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 30
    :cond_7
    iget-object p1, p0, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper$1;->this$0:Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;->access$002(Lcom/sensorsdata/abtest/core/SensorsABTestApiRequestHelper;Z)Z

    return-void
.end method
