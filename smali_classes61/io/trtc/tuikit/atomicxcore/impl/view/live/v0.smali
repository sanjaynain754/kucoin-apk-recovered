.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    return-void
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
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;

    .line 3
    .line 4
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->a:Ljava/lang/Object;

    .line 10
    return-object v0
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "type is not supported"

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    .line 13
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->a:Ljava/lang/Object;

    .line 14
    move-object v3, v2

    .line 15
    .line 16
    check-cast v3, Lkotlinx/coroutines/m0;

    .line 17
    .line 18
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->c:Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    const-class v9, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const-class v10, Lio/trtc/tuikit/atomicxcore/api/device/AudioEffectStore;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    move-result-object v5

    .line 35
    .line 36
    .line 37
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v4

    .line 39
    .line 40
    const-class v11, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryStore;

    .line 41
    .line 42
    const-class v12, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;

    .line 43
    .line 44
    const-class v13, Lio/trtc/tuikit/atomicxcore/api/live/LiveAudienceStore;

    .line 45
    .line 46
    const-class v14, Lio/trtc/tuikit/atomicxcore/api/live/LikeStore;

    .line 47
    .line 48
    const-class v15, Lio/trtc/tuikit/atomicxcore/api/gift/GiftStore;

    .line 49
    .line 50
    const-class v16, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 51
    .line 52
    const-class v17, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;

    .line 53
    .line 54
    const-class v18, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;

    .line 55
    .line 56
    const-class v19, Lio/trtc/tuikit/atomicxcore/api/barrage/BarrageStore;

    .line 57
    .line 58
    const-string v5, "getName(...)"

    .line 59
    .line 60
    const-string v7, "message"

    .line 61
    .line 62
    const-string v8, " liveID is empty"

    .line 63
    .line 64
    move/from16 p1, v4

    .line 65
    .line 66
    const-string v4, "getStore "

    .line 67
    .line 68
    const-class v20, Lio/trtc/tuikit/atomicxcore/api/device/BaseBeautyStore;

    .line 69
    .line 70
    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.live.LiveListStore"

    .line 71
    .line 72
    move-object/from16 v21, v10

    .line 73
    .line 74
    const-class v10, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 75
    .line 76
    move-object/from16 v22, v11

    .line 77
    .line 78
    const-string v11, ""

    .line 79
    .line 80
    if-eqz p1, :cond_1

    .line 81
    .line 82
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    if-eqz v2, :cond_0

    .line 89
    .line 90
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 91
    .line 92
    move-object/from16 p1, v3

    .line 93
    .line 94
    move-object/from16 v23, v12

    .line 95
    .line 96
    goto/16 :goto_3

    .line 97
    .line 98
    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    .line 99
    .line 100
    .line 101
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 102
    throw v1

    .line 103
    .line 104
    :cond_1
    move-object/from16 p1, v3

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 108
    move-result-object v3

    .line 109
    .line 110
    move-object/from16 v23, v12

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 114
    move-result-object v12

    .line 115
    .line 116
    .line 117
    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    move-result v3

    .line 119
    .line 120
    if-eqz v3, :cond_3

    .line 121
    .line 122
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 123
    .line 124
    .line 125
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 126
    move-result-object v2

    .line 127
    .line 128
    if-eqz v2, :cond_2

    .line 129
    .line 130
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_2
    new-instance v1, Ljava/lang/NullPointerException;

    .line 135
    .line 136
    .line 137
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 138
    throw v1

    .line 139
    .line 140
    .line 141
    :cond_3
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    .line 145
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 146
    move-result-object v12

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    move-result v3

    .line 151
    .line 152
    if-eqz v3, :cond_5

    .line 153
    .line 154
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 155
    .line 156
    .line 157
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    if-eqz v2, :cond_4

    .line 161
    .line 162
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 163
    .line 164
    goto/16 :goto_3

    .line 165
    .line 166
    :cond_4
    new-instance v1, Ljava/lang/NullPointerException;

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 170
    throw v1

    .line 171
    .line 172
    .line 173
    :cond_5
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 174
    move-result-object v3

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 178
    move-result-object v12

    .line 179
    .line 180
    .line 181
    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    move-result v3

    .line 183
    .line 184
    if-eqz v3, :cond_7

    .line 185
    .line 186
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 187
    .line 188
    .line 189
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    if-eqz v2, :cond_6

    .line 193
    .line 194
    goto/16 :goto_3

    .line 195
    .line 196
    :cond_6
    new-instance v1, Ljava/lang/NullPointerException;

    .line 197
    .line 198
    .line 199
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 200
    throw v1

    .line 201
    .line 202
    :cond_7
    iget-object v3, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 203
    .line 204
    new-instance v6, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-direct {v6, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v9, v6, v8, v3, v7}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    move-result-object v6

    .line 212
    const/4 v12, 0x1

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v12, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 216
    .line 217
    iget-object v2, v2, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    move-result-object v3

    .line 222
    .line 223
    if-nez v3, :cond_9

    .line 224
    .line 225
    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    .line 226
    .line 227
    .line 228
    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v2, v11, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    move-result-object v2

    .line 233
    .line 234
    if-nez v2, :cond_8

    .line 235
    goto :goto_0

    .line 236
    :cond_8
    move-object v3, v2

    .line 237
    .line 238
    :cond_9
    :goto_0
    check-cast v3, Ljava/util/Map;

    .line 239
    .line 240
    .line 241
    invoke-static {v3, v9, v5}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 242
    move-result-object v2

    .line 243
    .line 244
    .line 245
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    move-result-object v6

    .line 247
    .line 248
    if-nez v6, :cond_13

    .line 249
    .line 250
    .line 251
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 252
    move-result-object v6

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 256
    move-result-object v12

    .line 257
    .line 258
    .line 259
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    move-result v12

    .line 261
    .line 262
    if-eqz v12, :cond_a

    .line 263
    .line 264
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 265
    .line 266
    .line 267
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    goto/16 :goto_1

    .line 270
    .line 271
    .line 272
    :cond_a
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 273
    move-result-object v12

    .line 274
    .line 275
    .line 276
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    move-result v12

    .line 278
    .line 279
    if-eqz v12, :cond_b

    .line 280
    .line 281
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 282
    .line 283
    .line 284
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 285
    .line 286
    goto/16 :goto_1

    .line 287
    .line 288
    .line 289
    :cond_b
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 290
    move-result-object v12

    .line 291
    .line 292
    .line 293
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 294
    move-result v12

    .line 295
    .line 296
    if-eqz v12, :cond_c

    .line 297
    .line 298
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 299
    .line 300
    .line 301
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 302
    goto :goto_1

    .line 303
    .line 304
    .line 305
    :cond_c
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    move-result-object v12

    .line 307
    .line 308
    .line 309
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    move-result v12

    .line 311
    .line 312
    if-eqz v12, :cond_d

    .line 313
    .line 314
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 315
    .line 316
    .line 317
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 318
    goto :goto_1

    .line 319
    .line 320
    .line 321
    :cond_d
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 322
    move-result-object v12

    .line 323
    .line 324
    .line 325
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    move-result v12

    .line 327
    .line 328
    if-eqz v12, :cond_e

    .line 329
    .line 330
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 331
    .line 332
    .line 333
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 334
    goto :goto_1

    .line 335
    .line 336
    .line 337
    :cond_e
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 338
    move-result-object v12

    .line 339
    .line 340
    .line 341
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 342
    move-result v12

    .line 343
    .line 344
    if-eqz v12, :cond_f

    .line 345
    .line 346
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 347
    .line 348
    .line 349
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 350
    goto :goto_1

    .line 351
    .line 352
    .line 353
    :cond_f
    invoke-virtual {v13}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 354
    move-result-object v12

    .line 355
    .line 356
    .line 357
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 358
    move-result v12

    .line 359
    .line 360
    if-eqz v12, :cond_10

    .line 361
    .line 362
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 363
    .line 364
    .line 365
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 366
    goto :goto_1

    .line 367
    .line 368
    .line 369
    :cond_10
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 370
    move-result-object v12

    .line 371
    .line 372
    .line 373
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    move-result v12

    .line 375
    .line 376
    if-eqz v12, :cond_11

    .line 377
    .line 378
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 379
    .line 380
    .line 381
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 382
    goto :goto_1

    .line 383
    .line 384
    .line 385
    :cond_11
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 386
    move-result-object v12

    .line 387
    .line 388
    .line 389
    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 390
    move-result v6

    .line 391
    .line 392
    if-eqz v6, :cond_12

    .line 393
    .line 394
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 395
    .line 396
    .line 397
    invoke-direct {v6, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :goto_1
    invoke-interface {v3, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    goto :goto_2

    .line 402
    .line 403
    :cond_12
    new-instance v2, Ljava/lang/Exception;

    .line 404
    .line 405
    .line 406
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 407
    throw v2

    .line 408
    :cond_13
    :goto_2
    move-object v2, v6

    .line 409
    .line 410
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 411
    .line 412
    :goto_3
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/p0;

    .line 413
    .line 414
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 415
    const/4 v12, 0x0

    .line 416
    .line 417
    .line 418
    invoke-direct {v6, v3, v2, v12}, Lio/trtc/tuikit/atomicxcore/impl/view/live/p0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;Lkotlin/coroutines/Continuation;)V

    .line 419
    move-object v2, v7

    .line 420
    const/4 v7, 0x3

    .line 421
    move-object v3, v8

    .line 422
    const/4 v8, 0x0

    .line 423
    .line 424
    move-object/from16 v24, v4

    .line 425
    const/4 v4, 0x0

    .line 426
    .line 427
    move-object/from16 v25, v5

    .line 428
    const/4 v5, 0x0

    .line 429
    move-object v12, v2

    .line 430
    .line 431
    move-object/from16 v2, v25

    .line 432
    .line 433
    move-object/from16 v25, v13

    .line 434
    .line 435
    move-object/from16 v13, v24

    .line 436
    .line 437
    move-object/from16 v24, v9

    .line 438
    move-object v9, v3

    .line 439
    .line 440
    move-object/from16 v3, p1

    .line 441
    .line 442
    .line 443
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 444
    .line 445
    .line 446
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/q1;->a()Lio/trtc/tuikit/atomicxcore/impl/live/r1;

    .line 447
    move-result-object v4

    .line 448
    .line 449
    .line 450
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 451
    move-result-object v5

    .line 452
    .line 453
    .line 454
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 455
    move-result-object v6

    .line 456
    .line 457
    .line 458
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 459
    move-result v5

    .line 460
    .line 461
    const-string v6, "null cannot be cast to non-null type io.trtc.tuikit.atomicxcore.api.device.DeviceStore"

    .line 462
    .line 463
    if-eqz v5, :cond_15

    .line 464
    .line 465
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/d;->h:Lkotlin/Lazy;

    .line 466
    .line 467
    .line 468
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/c;->a()Lio/trtc/tuikit/atomicxcore/impl/device/d;

    .line 469
    move-result-object v1

    .line 470
    .line 471
    if-eqz v1, :cond_14

    .line 472
    .line 473
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 474
    .line 475
    goto/16 :goto_8

    .line 476
    .line 477
    :cond_14
    new-instance v1, Ljava/lang/NullPointerException;

    .line 478
    .line 479
    .line 480
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 481
    throw v1

    .line 482
    .line 483
    .line 484
    :cond_15
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 485
    move-result-object v5

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 489
    move-result-object v7

    .line 490
    .line 491
    .line 492
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 493
    move-result v5

    .line 494
    .line 495
    if-eqz v5, :cond_17

    .line 496
    .line 497
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/g;->g:Lkotlin/Lazy;

    .line 498
    .line 499
    .line 500
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/f;->a()Lio/trtc/tuikit/atomicxcore/impl/device/g;

    .line 501
    move-result-object v1

    .line 502
    .line 503
    if-eqz v1, :cond_16

    .line 504
    .line 505
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 506
    .line 507
    goto/16 :goto_8

    .line 508
    .line 509
    :cond_16
    new-instance v1, Ljava/lang/NullPointerException;

    .line 510
    .line 511
    .line 512
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 513
    throw v1

    .line 514
    .line 515
    .line 516
    :cond_17
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 517
    move-result-object v5

    .line 518
    .line 519
    .line 520
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 521
    move-result-object v7

    .line 522
    .line 523
    .line 524
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 525
    move-result v5

    .line 526
    .line 527
    if-eqz v5, :cond_19

    .line 528
    .line 529
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/device/r;->s:Lkotlin/Lazy;

    .line 530
    .line 531
    .line 532
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/device/k;->a()Lio/trtc/tuikit/atomicxcore/impl/device/r;

    .line 533
    move-result-object v1

    .line 534
    .line 535
    if-eqz v1, :cond_18

    .line 536
    .line 537
    goto/16 :goto_8

    .line 538
    .line 539
    :cond_18
    new-instance v1, Ljava/lang/NullPointerException;

    .line 540
    .line 541
    .line 542
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 543
    throw v1

    .line 544
    .line 545
    .line 546
    :cond_19
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 547
    move-result-object v5

    .line 548
    .line 549
    .line 550
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 551
    move-result-object v7

    .line 552
    .line 553
    .line 554
    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 555
    move-result v5

    .line 556
    .line 557
    if-eqz v5, :cond_1b

    .line 558
    .line 559
    sget-object v1, Lio/trtc/tuikit/atomicxcore/impl/live/N0;->j:Lkotlin/Lazy;

    .line 560
    .line 561
    .line 562
    invoke-static {}, Lio/trtc/tuikit/atomicxcore/impl/live/w0;->a()Lio/trtc/tuikit/atomicxcore/impl/live/N0;

    .line 563
    move-result-object v1

    .line 564
    .line 565
    if-eqz v1, :cond_1a

    .line 566
    .line 567
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 568
    .line 569
    goto/16 :goto_8

    .line 570
    .line 571
    :cond_1a
    new-instance v1, Ljava/lang/NullPointerException;

    .line 572
    .line 573
    .line 574
    invoke-direct {v1, v6}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 575
    throw v1

    .line 576
    .line 577
    :cond_1b
    iget-object v5, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->b:Lio/trtc/tuikit/atomicxcore/impl/common/r;

    .line 578
    .line 579
    new-instance v6, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    .line 582
    invoke-direct {v6, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 583
    .line 584
    .line 585
    invoke-static {v10, v6, v9, v5, v12}, Lio/trtc/tuikit/atomicxcore/api/barrage/d;->a(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;Lio/trtc/tuikit/atomicxcore/impl/common/r;Ljava/lang/String;)Ljava/lang/String;

    .line 586
    move-result-object v6

    .line 587
    const/4 v12, 0x1

    .line 588
    .line 589
    .line 590
    invoke-virtual {v5, v12, v6}, Lio/trtc/tuikit/atomicxcore/impl/common/r;->a(ILjava/lang/String;)V

    .line 591
    .line 592
    iget-object v4, v4, Lio/trtc/tuikit/atomicxcore/impl/live/r1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v4, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    move-result-object v5

    .line 597
    .line 598
    if-nez v5, :cond_1d

    .line 599
    .line 600
    new-instance v5, Ljava/util/concurrent/ConcurrentHashMap;

    .line 601
    .line 602
    .line 603
    invoke-direct {v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v4, v11, v5}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 607
    move-result-object v4

    .line 608
    .line 609
    if-nez v4, :cond_1c

    .line 610
    goto :goto_4

    .line 611
    :cond_1c
    move-object v5, v4

    .line 612
    .line 613
    :cond_1d
    :goto_4
    check-cast v5, Ljava/util/Map;

    .line 614
    .line 615
    .line 616
    invoke-static {v5, v10, v2}, Lio/trtc/tuikit/atomicxcore/api/barrage/e;->a(Ljava/util/Map;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 617
    move-result-object v2

    .line 618
    .line 619
    .line 620
    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    move-result-object v4

    .line 622
    .line 623
    if-nez v4, :cond_27

    .line 624
    .line 625
    .line 626
    invoke-virtual {v10}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 627
    move-result-object v4

    .line 628
    .line 629
    .line 630
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 631
    move-result-object v6

    .line 632
    .line 633
    .line 634
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 635
    move-result v6

    .line 636
    .line 637
    if-eqz v6, :cond_1e

    .line 638
    .line 639
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;

    .line 640
    .line 641
    .line 642
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/barrage/e;-><init>(Ljava/lang/String;)V

    .line 643
    :goto_5
    move-object v4, v1

    .line 644
    .line 645
    goto/16 :goto_6

    .line 646
    .line 647
    .line 648
    :cond_1e
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 649
    move-result-object v6

    .line 650
    .line 651
    .line 652
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 653
    move-result v6

    .line 654
    .line 655
    if-eqz v6, :cond_1f

    .line 656
    .line 657
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/q;

    .line 658
    .line 659
    .line 660
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/q;-><init>(Ljava/lang/String;)V

    .line 661
    goto :goto_5

    .line 662
    .line 663
    .line 664
    :cond_1f
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 665
    move-result-object v6

    .line 666
    .line 667
    .line 668
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 669
    move-result v6

    .line 670
    .line 671
    if-eqz v6, :cond_20

    .line 672
    .line 673
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/M;

    .line 674
    .line 675
    .line 676
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/M;-><init>(Ljava/lang/String;)V

    .line 677
    goto :goto_5

    .line 678
    .line 679
    .line 680
    :cond_20
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 681
    move-result-object v6

    .line 682
    .line 683
    .line 684
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 685
    move-result v6

    .line 686
    .line 687
    if-eqz v6, :cond_21

    .line 688
    .line 689
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/c0;

    .line 690
    .line 691
    .line 692
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/c0;-><init>(Ljava/lang/String;)V

    .line 693
    goto :goto_5

    .line 694
    .line 695
    .line 696
    :cond_21
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 697
    move-result-object v6

    .line 698
    .line 699
    .line 700
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 701
    move-result v6

    .line 702
    .line 703
    if-eqz v6, :cond_22

    .line 704
    .line 705
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/gift/f;

    .line 706
    .line 707
    .line 708
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/gift/f;-><init>(Ljava/lang/String;)V

    .line 709
    goto :goto_5

    .line 710
    .line 711
    .line 712
    :cond_22
    invoke-virtual {v14}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 713
    move-result-object v6

    .line 714
    .line 715
    .line 716
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 717
    move-result v6

    .line 718
    .line 719
    if-eqz v6, :cond_23

    .line 720
    .line 721
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/i0;

    .line 722
    .line 723
    .line 724
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/i0;-><init>(Ljava/lang/String;)V

    .line 725
    goto :goto_5

    .line 726
    .line 727
    .line 728
    :cond_23
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 729
    move-result-object v6

    .line 730
    .line 731
    .line 732
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 733
    move-result v6

    .line 734
    .line 735
    if-eqz v6, :cond_24

    .line 736
    .line 737
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/s0;

    .line 738
    .line 739
    .line 740
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/s0;-><init>(Ljava/lang/String;)V

    .line 741
    goto :goto_5

    .line 742
    .line 743
    .line 744
    :cond_24
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 745
    move-result-object v6

    .line 746
    .line 747
    .line 748
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 749
    move-result v6

    .line 750
    .line 751
    if-eqz v6, :cond_25

    .line 752
    .line 753
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;

    .line 754
    .line 755
    .line 756
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/Y0;-><init>(Ljava/lang/String;)V

    .line 757
    goto :goto_5

    .line 758
    .line 759
    .line 760
    :cond_25
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 761
    move-result-object v6

    .line 762
    .line 763
    .line 764
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 765
    move-result v4

    .line 766
    .line 767
    if-eqz v4, :cond_26

    .line 768
    .line 769
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 770
    .line 771
    .line 772
    invoke-direct {v1, v11}, Lio/trtc/tuikit/atomicxcore/impl/live/e1;-><init>(Ljava/lang/String;)V

    .line 773
    .line 774
    goto/16 :goto_5

    .line 775
    .line 776
    .line 777
    :goto_6
    invoke-interface {v5, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    goto :goto_7

    .line 779
    .line 780
    :cond_26
    new-instance v2, Ljava/lang/Exception;

    .line 781
    .line 782
    .line 783
    invoke-direct {v2, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 784
    throw v2

    .line 785
    :cond_27
    :goto_7
    move-object v1, v4

    .line 786
    .line 787
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    .line 788
    .line 789
    :goto_8
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/q0;

    .line 790
    .line 791
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 792
    const/4 v9, 0x0

    .line 793
    .line 794
    .line 795
    invoke-direct {v6, v2, v1, v9}, Lio/trtc/tuikit/atomicxcore/impl/view/live/q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/Continuation;)V

    .line 796
    const/4 v7, 0x3

    .line 797
    const/4 v8, 0x0

    .line 798
    const/4 v4, 0x0

    .line 799
    const/4 v5, 0x0

    .line 800
    .line 801
    .line 802
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 803
    .line 804
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/r0;

    .line 805
    .line 806
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 807
    .line 808
    .line 809
    invoke-direct {v6, v2, v1, v9}, Lio/trtc/tuikit/atomicxcore/impl/view/live/r0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/Continuation;)V

    .line 810
    .line 811
    .line 812
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 813
    .line 814
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/s0;

    .line 815
    .line 816
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 817
    .line 818
    .line 819
    invoke-direct {v6, v2, v1, v9}, Lio/trtc/tuikit/atomicxcore/impl/view/live/s0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/Continuation;)V

    .line 820
    .line 821
    .line 822
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 823
    .line 824
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/t0;

    .line 825
    .line 826
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 827
    .line 828
    .line 829
    invoke-direct {v6, v2, v1, v9}, Lio/trtc/tuikit/atomicxcore/impl/view/live/t0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/Continuation;)V

    .line 830
    .line 831
    .line 832
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 833
    .line 834
    new-instance v6, Lio/trtc/tuikit/atomicxcore/impl/view/live/u0;

    .line 835
    .line 836
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;->b:Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;

    .line 837
    .line 838
    .line 839
    invoke-direct {v6, v2, v1, v9}, Lio/trtc/tuikit/atomicxcore/impl/view/live/u0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/Continuation;)V

    .line 840
    .line 841
    .line 842
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 843
    .line 844
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 845
    return-object v1
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
.end method
