.class public final Lio/trtc/tuikit/atomicxcore/impl/room/O0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

.field public final synthetic c:Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/room/T0;Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->a:Ljava/lang/String;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->b:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 5
    .line 6
    iput-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->c:Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    return-void
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
.end method


# virtual methods
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "message"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->c:Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->getValue()I

    .line 18
    move-result p1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 22
    :cond_0
    return-void
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
.end method

.method public final onSuccess(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;)V
    .locals 29

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "result"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    iget-object v2, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->scheduleAttendees:Ljava/util/List;

    .line 12
    .line 13
    const-string v3, "scheduleAttendees"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    move-result v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    move-result-object v4

    .line 36
    .line 37
    check-cast v4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 38
    .line 39
    .line 40
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, Lio/trtc/tuikit/atomicxcore/impl/room/m0;->a(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    iget-object v1, v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->cursor:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->a:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->b:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 55
    .line 56
    iget-object v4, v4, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 57
    .line 58
    .line 59
    invoke-interface {v4}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object v4

    .line 61
    .line 62
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    move-result v2

    .line 71
    .line 72
    if-eqz v2, :cond_2

    .line 73
    .line 74
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->b:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 75
    .line 76
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->c:Lkotlinx/coroutines/flow/n;

    .line 77
    .line 78
    .line 79
    :goto_1
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 80
    move-result-object v4

    .line 81
    move-object v5, v4

    .line 82
    move-object v4, v5

    .line 83
    .line 84
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 85
    .line 86
    const/16 v23, 0x7dff

    .line 87
    .line 88
    const/16 v24, 0x0

    .line 89
    move-object v6, v5

    .line 90
    const/4 v5, 0x0

    .line 91
    move-object v7, v6

    .line 92
    const/4 v6, 0x0

    .line 93
    move-object v8, v7

    .line 94
    const/4 v7, 0x0

    .line 95
    move-object v9, v8

    .line 96
    const/4 v8, 0x0

    .line 97
    move-object v11, v9

    .line 98
    .line 99
    const-wide/16 v9, 0x0

    .line 100
    move-object v12, v11

    .line 101
    const/4 v11, 0x0

    .line 102
    move-object v14, v12

    .line 103
    .line 104
    const-wide/16 v12, 0x0

    .line 105
    .line 106
    move-object/from16 v16, v14

    .line 107
    .line 108
    const-wide/16 v14, 0x0

    .line 109
    .line 110
    move-object/from16 v17, v16

    .line 111
    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    const/16 v18, 0x0

    .line 115
    .line 116
    const/16 v19, 0x0

    .line 117
    .line 118
    const/16 v20, 0x0

    .line 119
    .line 120
    const/16 v21, 0x0

    .line 121
    .line 122
    const/16 v22, 0x0

    .line 123
    .line 124
    move-object/from16 v28, v17

    .line 125
    .line 126
    move-object/from16 v17, v3

    .line 127
    .line 128
    move-object/from16 v3, v28

    .line 129
    .line 130
    .line 131
    invoke-static/range {v4 .. v24}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 132
    move-result-object v4

    .line 133
    .line 134
    .line 135
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    move-result v3

    .line 137
    .line 138
    if-eqz v3, :cond_1

    .line 139
    goto :goto_2

    .line 140
    .line 141
    :cond_1
    move-object/from16 v3, v17

    .line 142
    goto :goto_1

    .line 143
    .line 144
    :cond_2
    move-object/from16 v17, v3

    .line 145
    .line 146
    :goto_2
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->b:Lio/trtc/tuikit/atomicxcore/impl/room/T0;

    .line 147
    .line 148
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/room/T0;->a:Lkotlinx/coroutines/flow/n;

    .line 149
    .line 150
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->a:Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    :goto_3
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 154
    move-result-object v4

    .line 155
    move-object v5, v4

    .line 156
    .line 157
    check-cast v5, Ljava/util/List;

    .line 158
    .line 159
    new-instance v6, Ljava/util/ArrayList;

    .line 160
    .line 161
    const/16 v7, 0xa

    .line 162
    .line 163
    .line 164
    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 165
    move-result v7

    .line 166
    .line 167
    .line 168
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    move-result-object v25

    .line 173
    .line 174
    .line 175
    :goto_4
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    move-result v5

    .line 177
    .line 178
    if-eqz v5, :cond_4

    .line 179
    .line 180
    .line 181
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    move-result-object v5

    .line 183
    .line 184
    check-cast v5, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->getRoomID()Ljava/lang/String;

    .line 188
    move-result-object v7

    .line 189
    .line 190
    .line 191
    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 192
    move-result v7

    .line 193
    .line 194
    if-eqz v7, :cond_3

    .line 195
    .line 196
    const/16 v23, 0x7dff

    .line 197
    .line 198
    const/16 v24, 0x0

    .line 199
    move-object v7, v4

    .line 200
    move-object v4, v5

    .line 201
    const/4 v5, 0x0

    .line 202
    move-object v8, v6

    .line 203
    const/4 v6, 0x0

    .line 204
    move-object v9, v7

    .line 205
    const/4 v7, 0x0

    .line 206
    move-object v10, v8

    .line 207
    const/4 v8, 0x0

    .line 208
    move-object v11, v9

    .line 209
    move-object v12, v10

    .line 210
    .line 211
    const-wide/16 v9, 0x0

    .line 212
    move-object v13, v11

    .line 213
    const/4 v11, 0x0

    .line 214
    move-object v15, v12

    .line 215
    move-object v14, v13

    .line 216
    .line 217
    const-wide/16 v12, 0x0

    .line 218
    .line 219
    move-object/from16 v16, v14

    .line 220
    .line 221
    move-object/from16 v18, v15

    .line 222
    .line 223
    const-wide/16 v14, 0x0

    .line 224
    .line 225
    move-object/from16 v19, v16

    .line 226
    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    move-object/from16 v20, v18

    .line 230
    .line 231
    const/16 v18, 0x0

    .line 232
    .line 233
    move-object/from16 v21, v19

    .line 234
    .line 235
    const/16 v19, 0x0

    .line 236
    .line 237
    move-object/from16 v22, v20

    .line 238
    .line 239
    const/16 v20, 0x0

    .line 240
    .line 241
    move-object/from16 v26, v21

    .line 242
    .line 243
    const/16 v21, 0x0

    .line 244
    .line 245
    move-object/from16 v27, v22

    .line 246
    .line 247
    const/16 v22, 0x0

    .line 248
    .line 249
    move-object/from16 p1, v3

    .line 250
    .line 251
    move-object/from16 v3, v26

    .line 252
    .line 253
    move-object/from16 v26, v1

    .line 254
    .line 255
    move-object/from16 v1, v27

    .line 256
    .line 257
    .line 258
    invoke-static/range {v4 .. v24}, Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/room/RoomUser;IJLio/trtc/tuikit/atomicxcore/api/room/RoomStatus;JJILjava/util/List;Ljava/lang/String;ZZZZILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/room/RoomInfo;

    .line 259
    move-result-object v5

    .line 260
    .line 261
    :goto_5
    move-object/from16 v4, v17

    .line 262
    goto :goto_6

    .line 263
    .line 264
    :cond_3
    move-object/from16 v26, v1

    .line 265
    .line 266
    move-object/from16 p1, v3

    .line 267
    move-object v3, v4

    .line 268
    move-object v1, v6

    .line 269
    goto :goto_5

    .line 270
    .line 271
    .line 272
    :goto_6
    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 273
    move-object v6, v1

    .line 274
    .line 275
    move-object/from16 v17, v4

    .line 276
    .line 277
    move-object/from16 v1, v26

    .line 278
    move-object v4, v3

    .line 279
    .line 280
    move-object/from16 v3, p1

    .line 281
    goto :goto_4

    .line 282
    .line 283
    :cond_4
    move-object/from16 v26, v1

    .line 284
    .line 285
    move-object/from16 p1, v3

    .line 286
    move-object v3, v4

    .line 287
    move-object v1, v6

    .line 288
    .line 289
    move-object/from16 v4, v17

    .line 290
    .line 291
    .line 292
    invoke-interface {v2, v3, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 293
    move-result v1

    .line 294
    .line 295
    if-eqz v1, :cond_6

    .line 296
    .line 297
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/room/O0;->c:Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;

    .line 298
    .line 299
    if-eqz v1, :cond_5

    .line 300
    .line 301
    .line 302
    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 303
    .line 304
    move-object/from16 v3, v26

    .line 305
    .line 306
    .line 307
    invoke-interface {v1, v4, v3}, Lio/trtc/tuikit/atomicxcore/api/ListResultCompletionHandler;->onSuccess(Ljava/util/List;Ljava/lang/String;)V

    .line 308
    :cond_5
    return-void

    .line 309
    .line 310
    :cond_6
    move-object/from16 v3, p1

    .line 311
    .line 312
    move-object/from16 v17, v4

    .line 313
    .line 314
    move-object/from16 v1, v26

    .line 315
    .line 316
    goto/16 :goto_3
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
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method
