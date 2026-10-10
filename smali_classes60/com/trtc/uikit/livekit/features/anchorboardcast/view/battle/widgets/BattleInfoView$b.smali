.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$b;
.super Ljava/lang/Object;
.source "BattleInfoView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->y(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/f;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBattleInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$onBattleScoreChanged$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,235:1\n1208#2,2:236\n1236#2,4:238\n*S KotlinDebug\n*F\n+ 1 BattleInfoView.kt\ncom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$onBattleScoreChanged$2\n*L\n94#1:236,2\n94#1:238,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lwd0/l;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lwd0/a;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-eqz p1, :cond_4

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lwd0/a;->b()Lkotlinx/coroutines/flow/w;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_4

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$b;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-nez v0, :cond_4

    .line 31
    .line 32
    const/16 v0, 0xa

    .line 33
    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 40
    move-result v0

    .line 41
    .line 42
    const/16 v1, 0x10

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 46
    move-result v0

    .line 47
    .line 48
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 52
    .line 53
    .line 54
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    move-result v0

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    move-result-object v0

    .line 66
    move-object v2, v0

    .line 67
    .line 68
    check-cast v2, Lwd0/l;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Lwd0/l;->d()Ljava/lang/String;

    .line 72
    move-result-object v2

    .line 73
    .line 74
    .line 75
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    goto :goto_0

    .line 77
    .line 78
    :cond_0
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore$Companion;

    .line 79
    .line 80
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    .line 95
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore$Companion;->create(Ljava/lang/String;)Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->getCoHostState()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;->getConnected()Lkotlinx/coroutines/flow/w;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 118
    move-result-object p1

    .line 119
    .line 120
    check-cast p1, Ljava/util/List;

    .line 121
    .line 122
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    .line 125
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 129
    move-result v2

    .line 130
    const/4 v3, 0x2

    .line 131
    .line 132
    if-ne v2, v3, :cond_2

    .line 133
    .line 134
    .line 135
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    move-result v2

    .line 141
    .line 142
    if-eqz v2, :cond_2

    .line 143
    .line 144
    .line 145
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    move-result-object v2

    .line 147
    .line 148
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 152
    move-result-object v2

    .line 153
    .line 154
    .line 155
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object v2

    .line 157
    .line 158
    check-cast v2, Lwd0/l;

    .line 159
    .line 160
    if-eqz v2, :cond_1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2}, Lwd0/l;->d()Ljava/lang/String;

    .line 164
    move-result-object v4

    .line 165
    .line 166
    .line 167
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    goto :goto_1

    .line 169
    .line 170
    .line 171
    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 172
    move-result p1

    .line 173
    .line 174
    if-ne p1, v3, :cond_4

    .line 175
    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    .line 181
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 182
    move-result-object p1

    .line 183
    const/4 v0, 0x0

    .line 184
    .line 185
    .line 186
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    move-result-object v1

    .line 188
    .line 189
    check-cast v1, Lwd0/l;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lwd0/l;->b()Landroid/graphics/Rect;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    iget v1, v1, Landroid/graphics/Rect;->left:I

    .line 196
    const/4 v2, 0x1

    .line 197
    .line 198
    .line 199
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    check-cast v3, Lwd0/l;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v3}, Lwd0/l;->b()Landroid/graphics/Rect;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 209
    .line 210
    if-ge v1, v3, :cond_3

    .line 211
    .line 212
    .line 213
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 214
    move-result-object v0

    .line 215
    .line 216
    check-cast v0, Lwd0/l;

    .line 217
    .line 218
    .line 219
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 220
    move-result-object p1

    .line 221
    .line 222
    check-cast p1, Lwd0/l;

    .line 223
    .line 224
    .line 225
    invoke-static {p2, v0, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->v(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;Lwd0/l;Lwd0/l;)V

    .line 226
    goto :goto_2

    .line 227
    .line 228
    .line 229
    :cond_3
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    check-cast v1, Lwd0/l;

    .line 233
    .line 234
    .line 235
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    check-cast p1, Lwd0/l;

    .line 239
    .line 240
    .line 241
    invoke-static {p2, v1, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->v(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;Lwd0/l;Lwd0/l;)V

    .line 242
    .line 243
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 244
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$b;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 6
    move-result-object p1

    .line 7
    return-object p1
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
.end method
