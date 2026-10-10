.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "type is not supported"

    .line 6
    .line 7
    const-class v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 8
    .line 9
    move-object/from16 v3, p1

    .line 10
    .line 11
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 12
    .line 13
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 17
    move-result-object v4

    .line 18
    .line 19
    new-instance v5, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v6, "onCurrentLiveInfoChanged new OID:"

    .line 22
    .line 23
    .line 24
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    iget-object v6, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 30
    move-result v6

    .line 31
    .line 32
    .line 33
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v6, ",liveId:"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    iget-object v7, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 44
    move-result-object v7

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    const-string v7, "message"

    .line 57
    .line 58
    .line 59
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    const/4 v8, 0x0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4, v8, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 64
    .line 65
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->b:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    .line 76
    invoke-interface {v4}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    iget-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 89
    move-result-object v5

    .line 90
    .line 91
    .line 92
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 93
    move-result v4

    .line 94
    .line 95
    if-eqz v4, :cond_2a

    .line 96
    .line 97
    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 101
    move-result-object v4

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 105
    move-result v4

    .line 106
    .line 107
    if-lez v4, :cond_2a

    .line 108
    .line 109
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 110
    .line 111
    const-string v4, "<this>"

    .line 112
    .line 113
    .line 114
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLogger$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 118
    move-result-object v4

    .line 119
    .line 120
    new-instance v5, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const-string/jumbo v9, "subscribeDataAfterEnterRoom new OID:"

    .line 124
    .line 125
    .line 126
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getOid$atomicxcore_release()I

    .line 130
    move-result v9

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 140
    move-result-object v6

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    move-result-object v5

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4, v8, v5}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getSubscribeStateAfterEnterRoomJob$atomicxcore_release()Lkotlinx/coroutines/x1;

    .line 160
    move-result-object v4

    .line 161
    const/4 v5, 0x0

    .line 162
    const/4 v6, 0x1

    .line 163
    .line 164
    if-eqz v4, :cond_0

    .line 165
    .line 166
    .line 167
    invoke-static {v4, v5, v6, v5}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 168
    .line 169
    :cond_0
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 170
    .line 171
    .line 172
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 173
    move-result-object v4

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 177
    move-result-object v8

    .line 178
    .line 179
    const-class v9, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 183
    move-result-object v10

    .line 184
    .line 185
    const-class v11, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 189
    move-result-object v12

    .line 190
    .line 191
    .line 192
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 193
    move-result v10

    .line 194
    .line 195
    const-class v12, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 196
    .line 197
    const-class v13, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 198
    .line 199
    const-class v14, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 200
    .line 201
    const-class v15, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 202
    .line 203
    const-class v16, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 204
    .line 205
    const-class v17, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 206
    .line 207
    const-string v5, "getName(...)"

    .line 208
    .line 209
    const-string v6, " liveID is empty"

    .line 210
    .line 211
    move-object/from16 v18, v2

    .line 212
    .line 213
    const-string v2, "getStore "

    .line 214
    .line 215
    const-class v19, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 216
    .line 217
    const-class v20, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 218
    .line 219
    const-class v21, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 220
    .line 221
    move/from16 v22, v10

    .line 222
    .line 223
    const-string v10, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveSeatStore"

    .line 224
    .line 225
    move-object/from16 v23, v11

    .line 226
    .line 227
    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 228
    .line 229
    if-eqz v22, :cond_2

    .line 230
    .line 231
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 232
    .line 233
    .line 234
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 235
    move-result-object v4

    .line 236
    .line 237
    if-eqz v4, :cond_1

    .line 238
    .line 239
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 240
    .line 241
    move-object/from16 v22, v12

    .line 242
    .line 243
    move-object/from16 v24, v13

    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :cond_1
    new-instance v1, Ljava/lang/NullPointerException;

    .line 248
    .line 249
    .line 250
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 251
    throw v1

    .line 252
    .line 253
    :cond_2
    move-object/from16 v22, v12

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 257
    move-result-object v12

    .line 258
    .line 259
    move-object/from16 v24, v13

    .line 260
    .line 261
    .line 262
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 263
    move-result-object v13

    .line 264
    .line 265
    .line 266
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    move-result v12

    .line 268
    .line 269
    if-eqz v12, :cond_4

    .line 270
    .line 271
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 272
    .line 273
    .line 274
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 275
    move-result-object v4

    .line 276
    .line 277
    if-eqz v4, :cond_3

    .line 278
    .line 279
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 280
    .line 281
    goto/16 :goto_3

    .line 282
    .line 283
    :cond_3
    new-instance v1, Ljava/lang/NullPointerException;

    .line 284
    .line 285
    .line 286
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 287
    throw v1

    .line 288
    .line 289
    .line 290
    :cond_4
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 291
    move-result-object v12

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 295
    move-result-object v13

    .line 296
    .line 297
    .line 298
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    move-result v12

    .line 300
    .line 301
    if-eqz v12, :cond_6

    .line 302
    .line 303
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 304
    .line 305
    .line 306
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 307
    move-result-object v4

    .line 308
    .line 309
    if-eqz v4, :cond_5

    .line 310
    .line 311
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 312
    .line 313
    goto/16 :goto_3

    .line 314
    .line 315
    :cond_5
    new-instance v1, Ljava/lang/NullPointerException;

    .line 316
    .line 317
    .line 318
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 319
    throw v1

    .line 320
    .line 321
    .line 322
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 323
    move-result-object v12

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 327
    move-result-object v13

    .line 328
    .line 329
    .line 330
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    move-result v12

    .line 332
    .line 333
    if-eqz v12, :cond_8

    .line 334
    .line 335
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 336
    .line 337
    .line 338
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 339
    move-result-object v4

    .line 340
    .line 341
    if-eqz v4, :cond_7

    .line 342
    .line 343
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 344
    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_7
    new-instance v1, Ljava/lang/NullPointerException;

    .line 348
    .line 349
    .line 350
    invoke-direct {v1, v10}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 351
    throw v1

    .line 352
    .line 353
    :cond_8
    iget-object v10, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 354
    .line 355
    new-instance v12, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v9, v12, v6, v10, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 362
    move-result-object v12

    .line 363
    const/4 v13, 0x1

    .line 364
    .line 365
    .line 366
    invoke-virtual {v10, v13, v12}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 367
    .line 368
    iget-object v4, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    move-result-object v10

    .line 373
    .line 374
    if-nez v10, :cond_a

    .line 375
    .line 376
    new-instance v10, Ljava/util/concurrent/ConcurrentHashMap;

    .line 377
    .line 378
    .line 379
    invoke-direct {v10}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4, v8, v10}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    move-result-object v4

    .line 384
    .line 385
    if-nez v4, :cond_9

    .line 386
    goto :goto_0

    .line 387
    :cond_9
    move-object v10, v4

    .line 388
    .line 389
    :cond_a
    :goto_0
    check-cast v10, Ljava/util/Map;

    .line 390
    .line 391
    .line 392
    invoke-static {v10, v9, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 393
    move-result-object v4

    .line 394
    .line 395
    .line 396
    invoke-interface {v10, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    move-result-object v12

    .line 398
    .line 399
    if-nez v12, :cond_14

    .line 400
    .line 401
    .line 402
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 403
    move-result-object v12

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 407
    move-result-object v13

    .line 408
    .line 409
    .line 410
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    move-result v13

    .line 412
    .line 413
    if-eqz v13, :cond_b

    .line 414
    .line 415
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 416
    .line 417
    .line 418
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    goto/16 :goto_1

    .line 421
    .line 422
    .line 423
    :cond_b
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 424
    move-result-object v13

    .line 425
    .line 426
    .line 427
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 428
    move-result v13

    .line 429
    .line 430
    if-eqz v13, :cond_c

    .line 431
    .line 432
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 433
    .line 434
    .line 435
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 436
    .line 437
    goto/16 :goto_1

    .line 438
    .line 439
    .line 440
    :cond_c
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 441
    move-result-object v13

    .line 442
    .line 443
    .line 444
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 445
    move-result v13

    .line 446
    .line 447
    if-eqz v13, :cond_d

    .line 448
    .line 449
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 450
    .line 451
    .line 452
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 453
    goto :goto_1

    .line 454
    .line 455
    .line 456
    :cond_d
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 457
    move-result-object v13

    .line 458
    .line 459
    .line 460
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    move-result v13

    .line 462
    .line 463
    if-eqz v13, :cond_e

    .line 464
    .line 465
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 466
    .line 467
    .line 468
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 469
    goto :goto_1

    .line 470
    .line 471
    .line 472
    :cond_e
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 473
    move-result-object v13

    .line 474
    .line 475
    .line 476
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 477
    move-result v13

    .line 478
    .line 479
    if-eqz v13, :cond_f

    .line 480
    .line 481
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 482
    .line 483
    .line 484
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 485
    goto :goto_1

    .line 486
    .line 487
    .line 488
    :cond_f
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 489
    move-result-object v13

    .line 490
    .line 491
    .line 492
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 493
    move-result v13

    .line 494
    .line 495
    if-eqz v13, :cond_10

    .line 496
    .line 497
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 498
    .line 499
    .line 500
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 501
    goto :goto_1

    .line 502
    .line 503
    .line 504
    :cond_10
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 505
    move-result-object v13

    .line 506
    .line 507
    .line 508
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 509
    move-result v13

    .line 510
    .line 511
    if-eqz v13, :cond_11

    .line 512
    .line 513
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 514
    .line 515
    .line 516
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 517
    goto :goto_1

    .line 518
    .line 519
    .line 520
    :cond_11
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 521
    move-result-object v13

    .line 522
    .line 523
    .line 524
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    move-result v13

    .line 526
    .line 527
    if-eqz v13, :cond_12

    .line 528
    .line 529
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 530
    .line 531
    .line 532
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 533
    goto :goto_1

    .line 534
    .line 535
    .line 536
    :cond_12
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 537
    move-result-object v13

    .line 538
    .line 539
    .line 540
    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 541
    move-result v12

    .line 542
    .line 543
    if-eqz v12, :cond_13

    .line 544
    .line 545
    new-instance v12, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 546
    .line 547
    .line 548
    invoke-direct {v12, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    :goto_1
    invoke-interface {v10, v4, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 552
    goto :goto_2

    .line 553
    .line 554
    :cond_13
    new-instance v2, Ljava/lang/Exception;

    .line 555
    .line 556
    .line 557
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 558
    throw v2

    .line 559
    :cond_14
    :goto_2
    move-object v4, v12

    .line 560
    .line 561
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 562
    .line 563
    .line 564
    :goto_3
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getHasVideoStreamUserList$atomicxcore_release()Ljava/util/Set;

    .line 565
    move-result-object v4

    .line 566
    .line 567
    .line 568
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 569
    move-result-object v4

    .line 570
    .line 571
    .line 572
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 573
    move-result v8

    .line 574
    .line 575
    if-eqz v8, :cond_15

    .line 576
    .line 577
    .line 578
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 579
    move-result-object v8

    .line 580
    .line 581
    check-cast v8, Ljava/lang/String;

    .line 582
    .line 583
    sget-object v10, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;->CAMERA_STREAM:Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;

    .line 584
    const/4 v13, 0x1

    .line 585
    .line 586
    .line 587
    invoke-static {v3, v8, v10, v13}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->a(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Ljava/lang/String;Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$VideoStreamType;Z)V

    .line 588
    goto :goto_4

    .line 589
    .line 590
    :cond_15
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    .line 591
    .line 592
    .line 593
    invoke-direct {v4, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/live/O;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLiveCoreViewImplObserver$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/impl/view/live/O;)V

    .line 597
    .line 598
    .line 599
    invoke-static {}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->sharedInstance()Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;

    .line 600
    move-result-object v4

    .line 601
    .line 602
    .line 603
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLiveCoreViewImplObserver$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/impl/view/live/O;

    .line 604
    move-result-object v8

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4, v8}, Lcom/tencent/cloud/tuikit/engine/room/TUIRoomEngine;->addObserver(Lcom/tencent/cloud/tuikit/engine/room/TUIRoomObserver;)V

    .line 608
    .line 609
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 610
    .line 611
    .line 612
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 613
    move-result-object v4

    .line 614
    .line 615
    .line 616
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDeprecated;->getLiveId$atomicxcore_release()Ljava/lang/String;

    .line 617
    move-result-object v8

    .line 618
    .line 619
    .line 620
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 621
    move-result-object v10

    .line 622
    .line 623
    .line 624
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 625
    move-result-object v12

    .line 626
    .line 627
    .line 628
    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 629
    move-result v10

    .line 630
    .line 631
    const-string v12, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.BattleStore"

    .line 632
    .line 633
    if-eqz v10, :cond_17

    .line 634
    .line 635
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 636
    .line 637
    .line 638
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 639
    move-result-object v1

    .line 640
    .line 641
    if-eqz v1, :cond_16

    .line 642
    .line 643
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 644
    .line 645
    goto/16 :goto_9

    .line 646
    .line 647
    :cond_16
    new-instance v1, Ljava/lang/NullPointerException;

    .line 648
    .line 649
    .line 650
    invoke-direct {v1, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 651
    throw v1

    .line 652
    .line 653
    .line 654
    :cond_17
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 655
    move-result-object v10

    .line 656
    .line 657
    .line 658
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 659
    move-result-object v13

    .line 660
    .line 661
    .line 662
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 663
    move-result v10

    .line 664
    .line 665
    if-eqz v10, :cond_19

    .line 666
    .line 667
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 668
    .line 669
    .line 670
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 671
    move-result-object v1

    .line 672
    .line 673
    if-eqz v1, :cond_18

    .line 674
    .line 675
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 676
    .line 677
    goto/16 :goto_9

    .line 678
    .line 679
    :cond_18
    new-instance v1, Ljava/lang/NullPointerException;

    .line 680
    .line 681
    .line 682
    invoke-direct {v1, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 683
    throw v1

    .line 684
    .line 685
    .line 686
    :cond_19
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 687
    move-result-object v10

    .line 688
    .line 689
    .line 690
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 691
    move-result-object v13

    .line 692
    .line 693
    .line 694
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 695
    move-result v10

    .line 696
    .line 697
    if-eqz v10, :cond_1b

    .line 698
    .line 699
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 700
    .line 701
    .line 702
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 703
    move-result-object v1

    .line 704
    .line 705
    if-eqz v1, :cond_1a

    .line 706
    .line 707
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 708
    .line 709
    goto/16 :goto_9

    .line 710
    .line 711
    :cond_1a
    new-instance v1, Ljava/lang/NullPointerException;

    .line 712
    .line 713
    .line 714
    invoke-direct {v1, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 715
    throw v1

    .line 716
    .line 717
    .line 718
    :cond_1b
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 719
    move-result-object v10

    .line 720
    .line 721
    .line 722
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 723
    move-result-object v13

    .line 724
    .line 725
    .line 726
    invoke-static {v10, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 727
    move-result v10

    .line 728
    .line 729
    if-eqz v10, :cond_1d

    .line 730
    .line 731
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 732
    .line 733
    .line 734
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 735
    move-result-object v1

    .line 736
    .line 737
    if-eqz v1, :cond_1c

    .line 738
    .line 739
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 740
    .line 741
    goto/16 :goto_9

    .line 742
    .line 743
    :cond_1c
    new-instance v1, Ljava/lang/NullPointerException;

    .line 744
    .line 745
    .line 746
    invoke-direct {v1, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 747
    throw v1

    .line 748
    .line 749
    :cond_1d
    iget-object v10, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 750
    .line 751
    new-instance v12, Ljava/lang/StringBuilder;

    .line 752
    .line 753
    .line 754
    invoke-direct {v12, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    invoke-static {v11, v12, v6, v10, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 758
    move-result-object v2

    .line 759
    const/4 v13, 0x1

    .line 760
    .line 761
    .line 762
    invoke-virtual {v10, v13, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 763
    .line 764
    iget-object v2, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 765
    .line 766
    .line 767
    invoke-virtual {v2, v8}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 768
    move-result-object v4

    .line 769
    .line 770
    if-nez v4, :cond_1f

    .line 771
    .line 772
    new-instance v4, Ljava/util/concurrent/ConcurrentHashMap;

    .line 773
    .line 774
    .line 775
    invoke-direct {v4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 776
    .line 777
    .line 778
    invoke-virtual {v2, v8, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 779
    move-result-object v2

    .line 780
    .line 781
    if-nez v2, :cond_1e

    .line 782
    goto :goto_5

    .line 783
    :cond_1e
    move-object v4, v2

    .line 784
    .line 785
    :cond_1f
    :goto_5
    check-cast v4, Ljava/util/Map;

    .line 786
    .line 787
    .line 788
    invoke-static {v4, v11, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 789
    move-result-object v2

    .line 790
    .line 791
    .line 792
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 793
    move-result-object v5

    .line 794
    .line 795
    if-nez v5, :cond_29

    .line 796
    .line 797
    .line 798
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 799
    move-result-object v5

    .line 800
    .line 801
    .line 802
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 803
    move-result-object v6

    .line 804
    .line 805
    .line 806
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 807
    move-result v6

    .line 808
    .line 809
    if-eqz v6, :cond_20

    .line 810
    .line 811
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 812
    .line 813
    .line 814
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 815
    :goto_6
    move-object v5, v1

    .line 816
    .line 817
    goto/16 :goto_7

    .line 818
    .line 819
    .line 820
    :cond_20
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 821
    move-result-object v6

    .line 822
    .line 823
    .line 824
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 825
    move-result v6

    .line 826
    .line 827
    if-eqz v6, :cond_21

    .line 828
    .line 829
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 830
    .line 831
    .line 832
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 833
    goto :goto_6

    .line 834
    .line 835
    .line 836
    :cond_21
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 837
    move-result-object v6

    .line 838
    .line 839
    .line 840
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 841
    move-result v6

    .line 842
    .line 843
    if-eqz v6, :cond_22

    .line 844
    .line 845
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 846
    .line 847
    .line 848
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 849
    goto :goto_6

    .line 850
    .line 851
    .line 852
    :cond_22
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 853
    move-result-object v6

    .line 854
    .line 855
    .line 856
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 857
    move-result v6

    .line 858
    .line 859
    if-eqz v6, :cond_23

    .line 860
    .line 861
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 862
    .line 863
    .line 864
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 865
    goto :goto_6

    .line 866
    .line 867
    .line 868
    :cond_23
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 869
    move-result-object v6

    .line 870
    .line 871
    .line 872
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 873
    move-result v6

    .line 874
    .line 875
    if-eqz v6, :cond_24

    .line 876
    .line 877
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 878
    .line 879
    .line 880
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 881
    goto :goto_6

    .line 882
    .line 883
    .line 884
    :cond_24
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 885
    move-result-object v6

    .line 886
    .line 887
    .line 888
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 889
    move-result v6

    .line 890
    .line 891
    if-eqz v6, :cond_25

    .line 892
    .line 893
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 894
    .line 895
    .line 896
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 897
    goto :goto_6

    .line 898
    .line 899
    .line 900
    :cond_25
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 901
    move-result-object v6

    .line 902
    .line 903
    .line 904
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 905
    move-result v6

    .line 906
    .line 907
    if-eqz v6, :cond_26

    .line 908
    .line 909
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 910
    .line 911
    .line 912
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 913
    goto :goto_6

    .line 914
    .line 915
    .line 916
    :cond_26
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 917
    move-result-object v6

    .line 918
    .line 919
    .line 920
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 921
    move-result v6

    .line 922
    .line 923
    if-eqz v6, :cond_27

    .line 924
    .line 925
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 926
    .line 927
    .line 928
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 929
    goto :goto_6

    .line 930
    .line 931
    .line 932
    :cond_27
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 933
    move-result-object v6

    .line 934
    .line 935
    .line 936
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 937
    move-result v5

    .line 938
    .line 939
    if-eqz v5, :cond_28

    .line 940
    .line 941
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 942
    .line 943
    .line 944
    invoke-direct {v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 945
    .line 946
    goto/16 :goto_6

    .line 947
    .line 948
    .line 949
    :goto_7
    invoke-interface {v4, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 950
    goto :goto_8

    .line 951
    .line 952
    :cond_28
    new-instance v2, Ljava/lang/Exception;

    .line 953
    .line 954
    .line 955
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 956
    throw v2

    .line 957
    :cond_29
    :goto_8
    move-object v1, v5

    .line 958
    .line 959
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 960
    .line 961
    :goto_9
    new-instance v2, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    .line 962
    .line 963
    .line 964
    invoke-direct {v2, v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 965
    .line 966
    .line 967
    invoke-virtual {v3, v2}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setBattleListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;)V

    .line 968
    .line 969
    .line 970
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getBattleListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$BattleListenerImpl;

    .line 971
    move-result-object v2

    .line 972
    .line 973
    .line 974
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->addBattleListener(Lio/trtc/tuikit/atomicxcore/api/live/BattleListener;)V

    .line 975
    .line 976
    new-instance v1, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    .line 977
    .line 978
    .line 979
    invoke-direct {v1, v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v3, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setLeaveRoomListenerImpl$atomicxcore_release(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;)V

    .line 983
    .line 984
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 985
    .line 986
    .line 987
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 988
    move-result-object v1

    .line 989
    .line 990
    .line 991
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->getLeaveRoomListenerImpl$atomicxcore_release()Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView$LeaveRoomListenerImpl;

    .line 992
    move-result-object v2

    .line 993
    .line 994
    iget-object v1, v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->h:Lio/trtc/tuikit/atomicxcore/impl/common/q;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/common/q;->a(Ljava/lang/Object;)V

    .line 998
    .line 999
    .line 1000
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 1001
    move-result-object v1

    .line 1002
    .line 1003
    .line 1004
    invoke-static {v1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 1005
    move-result-object v4

    .line 1006
    .line 1007
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;

    .line 1008
    const/4 v1, 0x0

    .line 1009
    .line 1010
    .line 1011
    invoke-direct {v7, v3, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V

    .line 1012
    const/4 v8, 0x3

    .line 1013
    const/4 v9, 0x0

    .line 1014
    const/4 v5, 0x0

    .line 1015
    const/4 v6, 0x0

    .line 1016
    .line 1017
    .line 1018
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 1019
    move-result-object v1

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v3, v1}, Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;->setSubscribeStateAfterEnterRoomJob$atomicxcore_release(Lkotlinx/coroutines/x1;)V

    .line 1023
    goto :goto_a

    .line 1024
    .line 1025
    .line 1026
    :cond_2a
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 1027
    move-result-object v1

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1031
    move-result v1

    .line 1032
    .line 1033
    if-nez v1, :cond_2b

    .line 1034
    .line 1035
    iget-object v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E;->a:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 1036
    .line 1037
    .line 1038
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/N;->d(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;)V

    .line 1039
    .line 1040
    :cond_2b
    :goto_a
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1041
    return-object v1
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
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
.end method
