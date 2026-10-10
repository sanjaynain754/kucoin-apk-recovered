.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$g;
.super Ljava/lang/Object;
.source "BattleInfoView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->G(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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


# instance fields
.field public final synthetic b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;


# direct methods
.method public constructor <init>(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

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
.method public final a(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->i(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lcom/trtc/uikit/livekit/common/LiveKitLogger;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    const-string v1, "onResultDisplay: "

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Lcom/trtc/uikit/livekit/common/LiveKitLogger;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 27
    .line 28
    if-eqz p1, :cond_5

    .line 29
    .line 30
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$g;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 31
    const/4 v0, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    move-result v1

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lwd0/a;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    if-eqz v1, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lwd0/a;->b()Lkotlinx/coroutines/flow/w;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    if-eqz v1, :cond_5

    .line 82
    .line 83
    .line 84
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 85
    move-result-object v1

    .line 86
    .line 87
    check-cast v1, Ljava/util/List;

    .line 88
    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    .line 92
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    move-result v2

    .line 98
    .line 99
    if-eqz v2, :cond_5

    .line 100
    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    move-result-object v2

    .line 104
    .line 105
    check-cast v2, Lwd0/l;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Lwd0/l;->d()Ljava/lang/String;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    .line 112
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    move-result v3

    .line 114
    .line 115
    if-eqz v3, :cond_0

    .line 116
    .line 117
    .line 118
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->g(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz p1, :cond_1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/store/AnchorBattleStore;->h()Z

    .line 125
    move-result p1

    .line 126
    .line 127
    if-ne p1, v0, :cond_1

    .line 128
    .line 129
    sget-object p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;->DRAW:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;

    .line 130
    goto :goto_0

    .line 131
    .line 132
    .line 133
    :cond_1
    invoke-virtual {v2}, Lwd0/l;->a()I

    .line 134
    move-result p1

    .line 135
    .line 136
    if-ne p1, v0, :cond_2

    .line 137
    .line 138
    sget-object p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;->VICTORY:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;

    .line 139
    goto :goto_0

    .line 140
    .line 141
    :cond_2
    sget-object p1, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;->DEFEAT:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;

    .line 142
    .line 143
    .line 144
    :goto_0
    invoke-static {p2, p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->t(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$BattleResultType;)V

    .line 145
    goto :goto_1

    .line 146
    :cond_3
    const/4 v0, 0x0

    .line 147
    .line 148
    .line 149
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 154
    move-result p1

    .line 155
    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    .line 159
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->u(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)V

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 163
    .line 164
    .line 165
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 166
    throw p1

    .line 167
    .line 168
    :cond_5
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 169
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/lang/Boolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$g;->a(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
