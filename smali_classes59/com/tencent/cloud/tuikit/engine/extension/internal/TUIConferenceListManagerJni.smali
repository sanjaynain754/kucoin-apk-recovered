.class public Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;
.super Ljava/lang/Object;
.source "TUIConferenceListManagerJni.java"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "tuikit::extension"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchConferenceInfoCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledConferenceListCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledAttendeesCallback;,
        Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TUIConferenceListManagerJni"


# instance fields
.field private mNativeTUIConferenceListManagerJni:J

.field private final mObserverList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mObserverList:Ljava/util/List;

    .line 11
    .line 12
    iput-wide p1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    cmp-long v0, p1, v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2, p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeSetObserver(JLjava/lang/Object;)V

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public static synthetic access$000(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToConferenceInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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

.method private static convertConferenceInfoToJSON(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lorg/json/JSONObject;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleStartTime:J

    .line 8
    .line 9
    const-wide/16 v3, 0x3e8

    .line 10
    div-long/2addr v1, v3

    .line 11
    .line 12
    .line 13
    const-string/jumbo v5, "scheduleStartTime"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v5, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 17
    .line 18
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleEndTime:J

    .line 19
    div-long/2addr v1, v3

    .line 20
    .line 21
    .line 22
    const-string/jumbo v3, "scheduleEndTime"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    const-string/jumbo v1, "reminderSecondsBeforeStart"

    .line 29
    .line 30
    iget v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->reminderSecondsBeforeStart:I

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 34
    .line 35
    new-instance v1, Lorg/json/JSONArray;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 39
    .line 40
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleAttendees:Ljava/util/List;

    .line 41
    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    move-result v3

    .line 49
    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    .line 53
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    check-cast v3, Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_0
    const-string/jumbo v2, "scheduleAttendees"

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 67
    .line 68
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    new-instance v1, Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 76
    .line 77
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 78
    .line 79
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    const-string/jumbo v3, "roomId"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 88
    .line 89
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    const-string/jumbo v3, "ownerId"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 98
    .line 99
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    const-string/jumbo v3, "ownerName"

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    .line 107
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 108
    .line 109
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    const-string/jumbo v3, "ownerAvatarUrl"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 118
    .line 119
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->getValue()I

    .line 123
    move-result v2

    .line 124
    .line 125
    .line 126
    const-string/jumbo v3, "roomType"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 130
    .line 131
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 132
    .line 133
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    const-string/jumbo v3, "roomName"

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 140
    .line 141
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 142
    .line 143
    iget-boolean v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 144
    .line 145
    const-string v3, "cameraDisable"

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 149
    .line 150
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 151
    .line 152
    iget-boolean v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 153
    .line 154
    .line 155
    const-string/jumbo v3, "microphoneDisable"

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 159
    .line 160
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 161
    .line 162
    iget-boolean v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 163
    .line 164
    .line 165
    const-string/jumbo v3, "screenShareDisable"

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 169
    .line 170
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 171
    .line 172
    iget-boolean v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 173
    .line 174
    .line 175
    const-string/jumbo v3, "messageDisable"

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 179
    .line 180
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 181
    .line 182
    iget-boolean v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 183
    .line 184
    const-string v3, "isSeatEnabled"

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 188
    .line 189
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 190
    .line 191
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->getValue()I

    .line 195
    move-result v2

    .line 196
    .line 197
    .line 198
    const-string/jumbo v3, "seatMode"

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 202
    .line 203
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 204
    .line 205
    iget v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 206
    .line 207
    const-string v3, "maxSeatCount"

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 211
    .line 212
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 213
    .line 214
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    const-string/jumbo v3, "password"

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    iget-object v2, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 223
    .line 224
    iget-wide v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 225
    .line 226
    const-string v4, "createTime"

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v4, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 230
    .line 231
    iget-object p0, p0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 232
    .line 233
    iget p0, p0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->memberCount:I

    .line 234
    .line 235
    .line 236
    const-string/jumbo v2, "roomMemberCount"

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 240
    .line 241
    const-string p0, "basicRoomInfo"

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, p0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 245
    :cond_1
    return-object v0
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
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
.end method

.method private static convertJSONToConferenceInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "scheduleStartTime"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 12
    move-result-wide v1

    .line 13
    .line 14
    const-wide/16 v3, 0x3e8

    .line 15
    mul-long/2addr v1, v3

    .line 16
    .line 17
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleStartTime:J

    .line 18
    .line 19
    .line 20
    const-string/jumbo v1, "scheduleEndTime"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 24
    move-result-wide v1

    .line 25
    mul-long/2addr v1, v3

    .line 26
    .line 27
    iput-wide v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->scheduleEndTime:J

    .line 28
    .line 29
    .line 30
    const-string/jumbo v1, "reminderSecondsBeforeStart"

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 34
    move-result v1

    .line 35
    .line 36
    iput v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->reminderSecondsBeforeStart:I

    .line 37
    .line 38
    .line 39
    const-string/jumbo v1, "status"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 43
    move-result v1

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->status:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 50
    .line 51
    new-instance v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 52
    .line 53
    .line 54
    invoke-direct {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;-><init>()V

    .line 55
    .line 56
    const-string v2, "basicRoomInfo"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 60
    move-result-object p0

    .line 61
    .line 62
    .line 63
    const-string/jumbo v2, "roomId"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    const-string/jumbo v2, "ownerId"

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerId:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    const-string/jumbo v2, "ownerName"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerName:Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    const-string/jumbo v2, "ownerAvatarUrl"

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->ownerAvatarUrl:Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    const-string/jumbo v2, "roomType"

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 103
    move-result v2

    .line 104
    .line 105
    .line 106
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomType:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomType;

    .line 110
    .line 111
    .line 112
    const-string/jumbo v2, "roomName"

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    move-result-object v2

    .line 117
    .line 118
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->name:Ljava/lang/String;

    .line 119
    .line 120
    const-string v2, "cameraDisable"

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 124
    move-result v2

    .line 125
    .line 126
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isCameraDisableForAllUser:Z

    .line 127
    .line 128
    .line 129
    const-string/jumbo v2, "microphoneDisable"

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 133
    move-result v2

    .line 134
    .line 135
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMicrophoneDisableForAllUser:Z

    .line 136
    .line 137
    .line 138
    const-string/jumbo v2, "screenShareDisable"

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 142
    move-result v2

    .line 143
    .line 144
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isScreenShareDisableForAllUser:Z

    .line 145
    .line 146
    .line 147
    const-string/jumbo v2, "messageDisable"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 151
    move-result v2

    .line 152
    .line 153
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isMessageDisableForAllUser:Z

    .line 154
    .line 155
    const-string v2, "isSeatEnabled"

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 159
    move-result v2

    .line 160
    .line 161
    iput-boolean v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->isSeatEnabled:Z

    .line 162
    .line 163
    .line 164
    const-string/jumbo v2, "seatMode"

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 168
    move-result v2

    .line 169
    .line 170
    .line 171
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 172
    move-result-object v2

    .line 173
    .line 174
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->seatMode:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$SeatMode;

    .line 175
    .line 176
    const-string v2, "maxSeatCount"

    .line 177
    .line 178
    .line 179
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 180
    move-result v2

    .line 181
    .line 182
    iput v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->maxSeatCount:I

    .line 183
    .line 184
    .line 185
    const-string/jumbo v2, "password"

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    move-result-object v2

    .line 190
    .line 191
    iput-object v2, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->password:Ljava/lang/String;

    .line 192
    .line 193
    const-string v2, "createTime"

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 197
    move-result-wide v5

    .line 198
    mul-long/2addr v5, v3

    .line 199
    .line 200
    iput-wide v5, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->createTime:J

    .line 201
    .line 202
    .line 203
    const-string/jumbo v2, "roomMemberCount"

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 207
    move-result p0

    .line 208
    .line 209
    iput p0, v1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->memberCount:I

    .line 210
    .line 211
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 212
    return-object v0
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
.end method

.method private static convertJSONToConferenceList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToConferenceInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
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

.method private static convertJSONToUserIdList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0
    .line 24
    .line 25
.end method

.method private static convertJSONToUserInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v1, "userId"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userId:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "userName"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userName:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    const-string/jumbo v1, "nameCard"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->nameCard:Ljava/lang/String;

    .line 33
    .line 34
    const-string v1, "avatarUrl"

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->avatarUrl:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v1, "userRole"

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    iput-object v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->userRole:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$Role;

    .line 54
    .line 55
    const-string v1, "hasAudioStream"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 59
    move-result v1

    .line 60
    .line 61
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasAudioStream:Z

    .line 62
    .line 63
    const-string v1, "hasVideoStream"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 67
    move-result v1

    .line 68
    .line 69
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasVideoStream:Z

    .line 70
    .line 71
    const-string v1, "hasScreenStream"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 75
    move-result v1

    .line 76
    .line 77
    iput-boolean v1, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->hasScreenStream:Z

    .line 78
    .line 79
    const-string v1, "isMessageDisabled"

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    .line 83
    move-result p0

    .line 84
    .line 85
    iput-boolean p0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;->isMessageDisabled:Z

    .line 86
    return-object v0
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
.end method

.method private static convertJSONToUserInfoList(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lorg/json/JSONObject;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToUserInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
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

.method private convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToConferenceInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 9
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    .line 13
    const-string v0, "TUIConferenceListManagerJni"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;-><init>()V

    .line 26
    return-object p1
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

.method private convertToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;
    .locals 1

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToUserInfo(Lorg/json/JSONObject;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 9
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    .line 13
    const-string v0, "TUIConferenceListManagerJni"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    new-instance p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;-><init>()V

    .line 26
    return-object p1
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

.method private convertToUserInfoList(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToUserInfoList(Lorg/json/JSONArray;)Ljava/util/List;

    .line 9
    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    return-object p1

    .line 11
    :catch_0
    move-exception p1

    .line 12
    .line 13
    const-string v0, "TUIConferenceListManagerJni"

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 26
    return-object p1
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

.method private copyOnReadListeners()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    .line 8
    return-object v0
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

.method public static createAttendeesResult(ILjava/lang/String;Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;-><init>()V

    .line 6
    .line 7
    iput-object p1, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->cursor:Ljava/lang/String;

    .line 8
    .line 9
    iput p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->totalAttendeeCount:I

    .line 10
    .line 11
    :try_start_0
    new-instance p0, Lorg/json/JSONArray;

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToUserInfoList(Lorg/json/JSONArray;)Ljava/util/List;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->scheduleAttendees:Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    return-object v0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    .line 24
    const-string p1, "TUIConferenceListManagerJni"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    new-instance p0, Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledAttendeesResult;->scheduleAttendees:Ljava/util/List;

    .line 39
    return-object v0
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
.end method

.method public static createConferenceListResult(Ljava/lang/String;Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;
    .locals 1
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;-><init>()V

    .line 6
    .line 7
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;->cursor:Ljava/lang/String;

    .line 8
    .line 9
    :try_start_0
    new-instance p0, Lorg/json/JSONArray;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertJSONToConferenceList(Lorg/json/JSONArray;)Ljava/util/List;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;->conferenceInfoList:Ljava/util/List;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object v0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    .line 22
    const-string p1, "TUIConferenceListManagerJni"

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p0}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    new-instance p0, Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    iput-object p0, v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ScheduledConferenceListResult;->conferenceInfoList:Ljava/util/List;

    .line 37
    return-object v0
.end method

.method private isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string v1, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v0, v1}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method private static native nativeAddAttendeesByAdmin(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method

.method private static native nativeCancelConference(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method

.method private static native nativeFetchAttendeeList(JLjava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledAttendeesCallback;)V
.end method

.method private static native nativeFetchConferenceInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchConferenceInfoCallback;)V
.end method

.method private static native nativeFetchScheduledConferenceList(JILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledConferenceListCallback;)V
.end method

.method private static native nativeRemoveAttendeesByAdmin(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method

.method private static native nativeScheduleConference(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method

.method private static native nativeSetObserver(JLjava/lang/Object;)V
.end method

.method private static native nativeTransferConferenceOwner(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method

.method private static native nativeUpdateConferenceInfo(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
.end method


# virtual methods
.method public addAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    new-array v2, v2, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeAddAttendeesByAdmin(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V

    .line 27
    return-void
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
.end method

.method public addObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mObserverList:Ljava/util/List;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mObserverList:Ljava/util/List;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    :cond_1
    :goto_0
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

.method public cancelConference(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeCancelConference(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V

    .line 18
    return-void
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

.method public fetchAttendeeList(Ljava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;)V
    .locals 6

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string p2, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p4, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    :cond_1
    new-instance v5, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledAttendeesCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v5, p4}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledAttendeesCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledAttendeesCallback;)V

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move v4, p3

    .line 27
    .line 28
    .line 29
    invoke-static/range {v0 .. v5}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeFetchAttendeeList(JLjava/lang/String;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledAttendeesCallback;)V

    .line 30
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

.method public fetchConferenceInfo(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v2, v0, v2

    .line 7
    .line 8
    if-nez v2, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string v0, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    :cond_1
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchConferenceInfoCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchConferenceInfoCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchConferenceInfoCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeFetchConferenceInfo(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchConferenceInfoCallback;)V

    .line 27
    return-void
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

.method public fetchScheduledConferenceList(Ljava/util/List;Ljava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;",
            ">;",
            "Ljava/lang/String;",
            "I",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    if-eqz p4, :cond_0

    .line 11
    .line 12
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    const-string p2, "conferenceListManager is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p4, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    :cond_0
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object p1

    .line 23
    const/4 v0, 0x0

    .line 24
    move v3, v0

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->getValue()I

    .line 40
    move-result v0

    .line 41
    or-int/2addr v3, v0

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :cond_2
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 45
    .line 46
    new-instance v6, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledConferenceListCallback;

    .line 47
    .line 48
    .line 49
    invoke-direct {v6, p4}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledConferenceListCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$FetchScheduledConferenceListCallback;)V

    .line 50
    move-object v4, p2

    .line 51
    move v5, p3

    .line 52
    .line 53
    .line 54
    invoke-static/range {v1 .. v6}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeFetchScheduledConferenceList(JILjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$FetchScheduledConferenceListCallback;)V

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

.method public onConferenceCancelled(Ljava/lang/String;ILjava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 8
    move-result-object p3

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceCancelReason;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceCancelReason;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceDidCancelled(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceCancelReason;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 36
    .line 37
    iget-object v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceCancelled(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceCancelReason;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
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
.end method

.method public onConferenceInfoChanged(Ljava/lang/String;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->SCHEDULE_START_TIME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->getValue()I

    .line 11
    move-result v2

    .line 12
    and-int/2addr v2, p2

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    :cond_0
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->SCHEDULE_END_TIME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->getValue()I

    .line 23
    move-result v2

    .line 24
    and-int/2addr v2, p2

    .line 25
    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->ROOM_NAME:Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->getValue()I

    .line 35
    move-result v2

    .line 36
    and-int/2addr p2, v2

    .line 37
    .line 38
    if-eqz p2, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    .line 48
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    move-result v1

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    .line 58
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2, v0}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceInfoChanged(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Ljava/util/List;)V

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    return-void
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

.method public onConferenceOwnerChanged(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToUserInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceOwnerChanged(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
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
.end method

.method public onConferenceScheduled(Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceScheduled(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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

.method public onConferenceStatusChanged(Ljava/lang/String;I)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-static {p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;->fromInt(I)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p1, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceStatusUpdated(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;)V

    .line 32
    .line 33
    iget-object v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 34
    .line 35
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceStatusChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceStatus;)V

    .line 39
    goto :goto_0

    .line 40
    :cond_0
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

.method public onConferenceWillStart(Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onConferenceWillStart(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)V

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
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

.method public onScheduleAttendeesChanged(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .annotation build Lcom/tencent/liteav/base/annotations/CalledByNative;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToConferenceInfo(Ljava/lang/String;)Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToUserInfoList(Ljava/lang/String;)Ljava/util/List;

    .line 8
    move-result-object p2

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertToUserInfoList(Ljava/lang/String;)Ljava/util/List;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->copyOnReadListeners()Ljava/util/List;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onScheduleAttendeesUpdated(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Ljava/util/List;Ljava/util/List;)V

    .line 36
    .line 37
    iget-object v2, p1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;->basicRoomInfo:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;

    .line 38
    .line 39
    iget-object v2, v2, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$RoomInfo;->roomId:Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2, p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;->onScheduleAttendeesChanged(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
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
.end method

.method public removeAttendeesByAdmin(Ljava/lang/String;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    new-array v2, v2, [Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, [Ljava/lang/String;

    .line 19
    .line 20
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeRemoveAttendeesByAdmin(JLjava/lang/String;[Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V

    .line 27
    return-void
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
.end method

.method public removeObserver(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$Observer;)V
    .locals 1

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    return-void

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mObserverList:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 9
    return-void
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

.method public scheduleConference(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_0

    .line 8
    .line 9
    .line 10
    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertConferenceInfoToJSON(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lorg/json/JSONObject;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 18
    .line 19
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeScheduleConference(JLjava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    return-void

    .line 27
    .line 28
    :catch_0
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 29
    .line 30
    const-string v0, "conferenceInfo convert error"

    .line 31
    .line 32
    .line 33
    invoke-interface {p2, p1, v0}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 34
    :goto_0
    return-void
    .line 35
    .line 36
    .line 37
.end method

.method public transferConferenceOwner(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-wide v0, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 10
    .line 11
    new-instance v2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 12
    .line 13
    .line 14
    invoke-direct {v2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p1, p2, v2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeTransferConferenceOwner(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V

    .line 18
    return-void
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
.end method

.method public updateConferenceInfo(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;Ljava/util/List;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;",
            "Ljava/util/List<",
            "Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;",
            ">;",
            "Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->isConferenceListManagerNull(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->INVALID_PARAMETER:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 12
    .line 13
    .line 14
    const-string/jumbo p2, "modifyFlagList is null"

    .line 15
    .line 16
    .line 17
    invoke-interface {p3, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    move-result-object p2

    .line 23
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v1

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    check-cast v1, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceModifyFlag;->getValue()I

    .line 39
    move-result v1

    .line 40
    or-int/2addr v0, v1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_2
    :try_start_0
    invoke-static {p1}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->convertConferenceInfoToJSON(Lcom/tencent/cloud/tuikit/engine/extension/TUIConferenceListManager$ConferenceInfo;)Lorg/json/JSONObject;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    iget-wide v1, p0, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->mNativeTUIConferenceListManagerJni:J

    .line 52
    .line 53
    new-instance p2, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, p3}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;-><init>(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2, p1, v0, p2}, Lcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni;->nativeUpdateConferenceInfo(JLjava/lang/String;ILcom/tencent/cloud/tuikit/engine/extension/internal/TUIConferenceListManagerJni$ActionCallback;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-void

    .line 61
    .line 62
    :catch_0
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->FAILED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 63
    .line 64
    const-string p2, "conferenceInfo convert error"

    .line 65
    .line 66
    .line 67
    invoke-interface {p3, p1, p2}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ActionCallback;->onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V

    .line 68
    :goto_1
    return-void
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
