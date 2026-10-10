.class public final Lio/trtc/tuikit/atomicxcore/impl/live/V0;
.super Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;-><init>()V

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
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method


# virtual methods
.method public final onSeatListChanged(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "roomId"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "seatList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v1, "newlySeatedUsers"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string p3, "newlyLeftUsers"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 23
    .line 24
    iget-object p3, p3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a:Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result p3

    .line 29
    .line 30
    if-nez p3, :cond_0

    .line 31
    return-void

    .line 32
    .line 33
    :cond_0
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 34
    .line 35
    iget-object p3, p3, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 36
    .line 37
    new-instance p4, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v1, "onSeatListChanged:"

    .line 40
    .line 41
    .line 42
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string p1, ", seatList: "

    .line 48
    .line 49
    .line 50
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    const-string p1, "seatList is empty"

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v1, "seatList:"

    .line 70
    .line 71
    .line 72
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 76
    move-result v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    move-result v1

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 108
    .line 109
    const-string v2, "<this>"

    .line 110
    .line 111
    .line 112
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    new-instance v2, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v3, "SeatFullInfo {"

    .line 117
    .line 118
    .line 119
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    new-instance v3, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v4, "  roomId: "

    .line 124
    .line 125
    .line 126
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->roomId:Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    move-result-object v3

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    new-instance v3, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v4, "  seatIndex: "

    .line 143
    .line 144
    .line 145
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    iget v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->seatIndex:I

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    new-instance v3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v4, "  isSeatLocked: "

    .line 162
    .line 163
    .line 164
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    iget-boolean v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->isSeatLocked:Z

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    move-result-object v3

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    new-instance v3, Ljava/lang/StringBuilder;

    .line 179
    .line 180
    const-string v4, "  userId: "

    .line 181
    .line 182
    .line 183
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    move-result-object v3

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    new-instance v3, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v4, "  userName: "

    .line 200
    .line 201
    .line 202
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 203
    .line 204
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userName:Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    move-result-object v3

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    .line 216
    new-instance v3, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v4, "  userAvatar: "

    .line 219
    .line 220
    .line 221
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userAvatar:Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    new-instance v3, Ljava/lang/StringBuilder;

    .line 236
    .line 237
    const-string v4, "  userMicrophoneStatus: "

    .line 238
    .line 239
    .line 240
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    move-result-object v3

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    new-instance v3, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v4, "  userCameraStatus: "

    .line 257
    .line 258
    .line 259
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 260
    .line 261
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    move-result-object v3

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    new-instance v3, Ljava/lang/StringBuilder;

    .line 274
    .line 275
    const-string v4, "  userSuspendStatus: "

    .line 276
    .line 277
    .line 278
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    iget-object v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userSuspendStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SuspendStatus;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 287
    move-result-object v3

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 291
    .line 292
    new-instance v3, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    const-string v4, "  x: "

    .line 295
    .line 296
    .line 297
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 298
    .line 299
    iget v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->x:I

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    move-result-object v3

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    new-instance v3, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    const-string v4, "  y: "

    .line 314
    .line 315
    .line 316
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 317
    .line 318
    iget v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->y:I

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    move-result-object v3

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    new-instance v3, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v4, "  width: "

    .line 333
    .line 334
    .line 335
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    iget v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->width:I

    .line 338
    .line 339
    .line 340
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    move-result-object v3

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    new-instance v3, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    const-string v4, "  height: "

    .line 352
    .line 353
    .line 354
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    iget v4, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->height:I

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 363
    move-result-object v3

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    new-instance v3, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    const-string v4, "  zorder: "

    .line 371
    .line 372
    .line 373
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 374
    .line 375
    iget v1, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->zorder:I

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 382
    move-result-object v1

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    const-string/jumbo v1, "}"

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    move-result-object v1

    .line 396
    .line 397
    const-string v2, "StringBuilder().apply(builderAction).toString()"

    .line 398
    .line 399
    .line 400
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    const-string v1, "\n"

    .line 406
    .line 407
    .line 408
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    goto/16 :goto_0

    .line 411
    .line 412
    .line 413
    :cond_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 414
    move-result-object p1

    .line 415
    .line 416
    .line 417
    const-string/jumbo v0, "toString(...)"

    .line 418
    .line 419
    .line 420
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    :goto_1
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 427
    move-result-object p1

    .line 428
    .line 429
    .line 430
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    const-string p4, "message"

    .line 433
    .line 434
    .line 435
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    const/4 p4, 0x0

    .line 437
    .line 438
    .line 439
    invoke-virtual {p3, p4, p1}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 443
    move-result-object p1

    .line 444
    .line 445
    .line 446
    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 447
    move-result p3

    .line 448
    .line 449
    if-eqz p3, :cond_4

    .line 450
    .line 451
    .line 452
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 453
    move-result-object p3

    .line 454
    move-object p4, p3

    .line 455
    .line 456
    check-cast p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 457
    .line 458
    iget-object p4, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userId:Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 462
    move-result-object v0

    .line 463
    .line 464
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 468
    move-result p4

    .line 469
    .line 470
    if-eqz p4, :cond_3

    .line 471
    goto :goto_2

    .line 472
    :cond_4
    const/4 p3, 0x0

    .line 473
    .line 474
    :goto_2
    check-cast p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 475
    .line 476
    if-eqz p3, :cond_b

    .line 477
    .line 478
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 479
    .line 480
    iget-object p4, p1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->l:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 481
    .line 482
    if-eqz p4, :cond_a

    .line 483
    .line 484
    iget-object v0, p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 485
    .line 486
    iget-object v1, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userCameraStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 487
    .line 488
    sget-object v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;->CLOSED_BY_ADMIN:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 489
    .line 490
    if-eq v0, v2, :cond_5

    .line 491
    .line 492
    if-ne v1, v2, :cond_7

    .line 493
    goto :goto_3

    .line 494
    .line 495
    :cond_5
    if-eq v1, v2, :cond_7

    .line 496
    .line 497
    :goto_3
    if-ne v0, v2, :cond_6

    .line 498
    .line 499
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 500
    .line 501
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/S0;

    .line 502
    .line 503
    .line 504
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/S0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 508
    goto :goto_4

    .line 509
    .line 510
    :cond_6
    iget-object v0, p1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 511
    .line 512
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/T0;

    .line 513
    .line 514
    .line 515
    invoke-direct {v1, p1}, Lio/trtc/tuikit/atomicxcore/impl/live/T0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 519
    .line 520
    :cond_7
    :goto_4
    iget-object v0, p3, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 521
    .line 522
    iget-object p4, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;->userMicrophoneStatus:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$DeviceStatus;

    .line 523
    .line 524
    if-eq v0, v2, :cond_8

    .line 525
    .line 526
    if-ne p4, v2, :cond_a

    .line 527
    goto :goto_5

    .line 528
    .line 529
    :cond_8
    if-eq p4, v2, :cond_a

    .line 530
    .line 531
    :goto_5
    if-ne v0, v2, :cond_9

    .line 532
    .line 533
    iget-object p4, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 534
    .line 535
    iget-object v0, p4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 536
    .line 537
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Q0;

    .line 538
    .line 539
    .line 540
    invoke-direct {v1, p4}, Lio/trtc/tuikit/atomicxcore/impl/live/Q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 544
    goto :goto_6

    .line 545
    .line 546
    :cond_9
    iget-object p4, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 547
    .line 548
    iget-object v0, p4, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 549
    .line 550
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/R0;

    .line 551
    .line 552
    .line 553
    invoke-direct {v1, p4}, Lio/trtc/tuikit/atomicxcore/impl/live/R0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v0, v1}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Lkotlin/jvm/functions/Function1;)V

    .line 557
    .line 558
    :cond_a
    :goto_6
    iput-object p3, p1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->l:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatFullInfo;

    .line 559
    .line 560
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 561
    goto :goto_7

    .line 562
    .line 563
    :cond_b
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/live/U0;

    .line 564
    .line 565
    iget-object p3, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 566
    .line 567
    .line 568
    invoke-direct {p1, p3}, Lio/trtc/tuikit/atomicxcore/impl/live/U0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/Y0;)V

    .line 569
    .line 570
    :goto_7
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 571
    .line 572
    .line 573
    invoke-virtual {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->a(Ljava/util/List;)V

    .line 574
    return-void
.end method

.method public final onUserAudioStateChanged(Ljava/lang/String;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "userID"

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v2, "reason"

    .line 13
    .line 14
    move-object/from16 v3, p3

    .line 15
    .line 16
    .line 17
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getHasAudioStreamUserList$atomicxcore_release()Ljava/util/Set;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 29
    goto :goto_0

    .line 30
    .line 31
    :cond_0
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getHasAudioStreamUserList$atomicxcore_release()Ljava/util/Set;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 39
    .line 40
    :goto_0
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 41
    .line 42
    iget-object v3, v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v3, v4

    .line 52
    .line 53
    :goto_1
    if-eqz v3, :cond_8

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 57
    move-result v3

    .line 58
    .line 59
    if-nez v3, :cond_2

    .line 60
    .line 61
    goto/16 :goto_8

    .line 62
    .line 63
    :cond_2
    new-instance v3, Lkotlin/ranges/IntRange;

    .line 64
    const/4 v5, 0x1

    .line 65
    .line 66
    const/16 v6, 0xc7

    .line 67
    .line 68
    .line 69
    invoke-direct {v3, v5, v6}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 70
    .line 71
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->k:Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 72
    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getSeatLayoutTemplateID()I

    .line 77
    move-result v2

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    :cond_3
    if-eqz v4, :cond_8

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 87
    move-result v2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v3, v2}, Lkotlin/ranges/IntRange;->contains(I)Z

    .line 91
    move-result v2

    .line 92
    .line 93
    if-eqz v2, :cond_8

    .line 94
    .line 95
    if-eqz p2, :cond_4

    .line 96
    .line 97
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 98
    :goto_2
    move-object v9, v2

    .line 99
    goto :goto_3

    .line 100
    .line 101
    :cond_4
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 102
    goto :goto_2

    .line 103
    .line 104
    :goto_3
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 105
    .line 106
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->c:Lkotlinx/coroutines/flow/n;

    .line 107
    .line 108
    .line 109
    :goto_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 110
    move-result-object v3

    .line 111
    move-object v4, v3

    .line 112
    .line 113
    check-cast v4, Ljava/util/List;

    .line 114
    .line 115
    new-instance v5, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v6, 0xa

    .line 118
    .line 119
    .line 120
    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 121
    move-result v6

    .line 122
    .line 123
    .line 124
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    move-result-object v16

    .line 129
    .line 130
    .line 131
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    move-result v4

    .line 133
    .line 134
    if-eqz v4, :cond_6

    .line 135
    .line 136
    .line 137
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    move-result-object v4

    .line 139
    .line 140
    move-object/from16 v17, v4

    .line 141
    .line 142
    check-cast v17, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 146
    move-result-object v4

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 150
    move-result-object v4

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    move-result v4

    .line 155
    .line 156
    if-eqz v4, :cond_5

    .line 157
    move-object v4, v3

    .line 158
    .line 159
    .line 160
    invoke-virtual/range {v17 .. v17}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 161
    move-result-object v3

    .line 162
    .line 163
    const/16 v14, 0x3df

    .line 164
    const/4 v15, 0x0

    .line 165
    move-object v6, v4

    .line 166
    const/4 v4, 0x0

    .line 167
    move-object v7, v5

    .line 168
    const/4 v5, 0x0

    .line 169
    move-object v8, v6

    .line 170
    const/4 v6, 0x0

    .line 171
    move-object v10, v7

    .line 172
    const/4 v7, 0x0

    .line 173
    move-object v11, v8

    .line 174
    const/4 v8, 0x0

    .line 175
    move-object v12, v10

    .line 176
    const/4 v10, 0x0

    .line 177
    move-object v13, v11

    .line 178
    const/4 v11, 0x0

    .line 179
    .line 180
    move-object/from16 v18, v12

    .line 181
    const/4 v12, 0x0

    .line 182
    .line 183
    move-object/from16 v19, v13

    .line 184
    const/4 v13, 0x0

    .line 185
    .line 186
    move-object/from16 v1, v18

    .line 187
    .line 188
    move-object/from16 v0, v19

    .line 189
    .line 190
    .line 191
    invoke-static/range {v3 .. v15}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/live/Role;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;ZLio/trtc/tuikit/atomicxcore/api/live/SuspendStatus;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 192
    move-result-object v20

    .line 193
    .line 194
    const/16 v22, 0xb

    .line 195
    .line 196
    const/16 v23, 0x0

    .line 197
    .line 198
    const/16 v18, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    const/16 v21, 0x0

    .line 203
    .line 204
    .line 205
    invoke-static/range {v17 .. v23}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->copy$default(Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;IZLio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;Lio/trtc/tuikit/atomicxcore/api/live/RegionInfo;ILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 206
    move-result-object v17

    .line 207
    .line 208
    :goto_6
    move-object/from16 v3, v17

    .line 209
    goto :goto_7

    .line 210
    :cond_5
    move-object v0, v3

    .line 211
    move-object v1, v5

    .line 212
    goto :goto_6

    .line 213
    .line 214
    .line 215
    :goto_7
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 216
    move-object v3, v0

    .line 217
    move-object v5, v1

    .line 218
    .line 219
    move-object/from16 v0, p0

    .line 220
    .line 221
    move-object/from16 v1, p1

    .line 222
    goto :goto_5

    .line 223
    :cond_6
    move-object v0, v3

    .line 224
    move-object v1, v5

    .line 225
    .line 226
    .line 227
    invoke-interface {v2, v0, v1}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    move-result v0

    .line 229
    .line 230
    if-eqz v0, :cond_7

    .line 231
    goto :goto_8

    .line 232
    .line 233
    :cond_7
    move-object/from16 v0, p0

    .line 234
    .line 235
    move-object/from16 v1, p1

    .line 236
    .line 237
    goto/16 :goto_4

    .line 238
    :cond_8
    :goto_8
    return-void
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
.end method

.method public final onUserVideoStateChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "userID"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 9
    .line 10
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->g:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "onUserVideoStateChanged:userID"

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, ", streamType"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string p2, ", hasVideo"

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string p2, ", reason"

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object p2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    const-string p4, "message"

    .line 54
    .line 55
    .line 56
    invoke-static {p2, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    const/4 p4, 0x0

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p4, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 61
    .line 62
    if-eqz p3, :cond_0

    .line 63
    .line 64
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getHasVideoStreamUserList$atomicxcore_release()Ljava/util/Set;

    .line 68
    move-result-object p2

    .line 69
    .line 70
    .line 71
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 72
    return-void

    .line 73
    .line 74
    :cond_0
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getHasVideoStreamUserList$atomicxcore_release()Ljava/util/Set;

    .line 78
    move-result-object p2

    .line 79
    .line 80
    .line 81
    invoke-interface {p2, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 82
    return-void
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
.end method

.method public final onUserVoiceVolumeChanged(Ljava/util/Map;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "volumeMap"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/V0;->a:Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 9
    .line 10
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;->e:Lkotlinx/coroutines/flow/n;

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    .line 17
    check-cast v2, Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/n;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    move-result v1

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    return-void
    .line 29
    .line 30
.end method
