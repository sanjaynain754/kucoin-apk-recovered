.class public final Lio/trtc/tuikit/atomicxcore/impl/device/l;
.super Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/device/r;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/device/r;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/l;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

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
.method public final onError(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "errorCode"

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
    sget-object p2, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;->CAMERA_OCCUPIED:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;

    .line 13
    .line 14
    if-ne p1, p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/device/l;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 17
    .line 18
    iget-object p2, p2, Lio/trtc/tuikit/atomicxcore/impl/device/r;->g:Lkotlinx/coroutines/flow/n;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/impl/device/i;->a(Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$Error;)Lio/trtc/tuikit/atomicxcore/api/device/DeviceError;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 26
    :cond_0
    return-void
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

.method public final onUserNetworkQualityChanged(Ljava/util/Map;)V
    .locals 8

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    check-cast p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    .line 18
    :goto_0
    if-nez p1, :cond_1

    .line 19
    return-void

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/l;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 22
    .line 23
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->m:Lkotlinx/coroutines/flow/n;

    .line 24
    .line 25
    const-string v1, "networkInfo"

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;

    .line 31
    .line 32
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->userId:Ljava/lang/String;

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    const-string v1, ""

    .line 37
    :cond_2
    move-object v3, v1

    .line 38
    .line 39
    iget-object v1, p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->quality:Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkQuality;

    .line 40
    .line 41
    const-string v4, "quality"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    const-string v4, "networkQuality"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/h;->e:[I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 55
    move-result v1

    .line 56
    .line 57
    aget v1, v4, v1

    .line 58
    .line 59
    .line 60
    packed-switch v1, :pswitch_data_0

    .line 61
    .line 62
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 66
    throw p1

    .line 67
    .line 68
    :pswitch_0
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->DOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 69
    :goto_1
    move-object v4, v1

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :pswitch_1
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->VERY_BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 73
    goto :goto_1

    .line 74
    .line 75
    :pswitch_2
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->BAD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :pswitch_3
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->POOR:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :pswitch_4
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->GOOD:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 82
    goto :goto_1

    .line 83
    .line 84
    :pswitch_5
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->EXCELLENT:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :pswitch_6
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;

    .line 88
    goto :goto_1

    .line 89
    .line 90
    :goto_2
    iget v5, p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->upLoss:I

    .line 91
    .line 92
    iget v6, p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->downLoss:I

    .line 93
    .line 94
    iget v7, p1, Lcom/tencent/cloud/tuikit/engine/common/TUICommonDefine$NetworkInfo;->delay:I

    .line 95
    .line 96
    .line 97
    invoke-direct/range {v2 .. v7}, Lio/trtc/tuikit/atomicxcore/api/device/NetworkInfo;-><init>(Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/api/device/NetworkQuality;III)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 101
    return-void

    .line 102
    nop

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
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onUserVideoStateChanged(Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;ZLcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$ChangeReason;)V
    .locals 1

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
    .line 9
    const-string/jumbo v0, "streamType"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    const-string v0, "reason"

    .line 15
    .line 16
    .line 17
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 21
    move-result-object p4

    .line 22
    .line 23
    iget-object p4, p4, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result p1

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    sget-object p1, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->SCREEN_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 32
    .line 33
    if-eq p2, p1, :cond_0

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/device/l;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 37
    .line 38
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->l:Lkotlinx/coroutines/flow/n;

    .line 39
    .line 40
    if-eqz p3, :cond_1

    .line 41
    .line 42
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->ON:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_1
    sget-object p2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 49
    :cond_2
    :goto_1
    return-void
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
.end method

.method public final onUserVoiceVolumeChanged(Ljava/util/Map;)V
    .locals 1

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
    .line 9
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->getSelfInfo()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iget-object v0, v0, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$LoginUserInfo;->userId:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/device/l;->a:Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 26
    move-result p1

    .line 27
    .line 28
    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/device/r;->d:Lkotlinx/coroutines/flow/n;

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 36
    :cond_0
    return-void
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
.end method
