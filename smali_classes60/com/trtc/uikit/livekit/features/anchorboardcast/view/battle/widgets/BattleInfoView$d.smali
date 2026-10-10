.class public final Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;
.super Ljava/lang/Object;
.source "BattleInfoView.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->D(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

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
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;",
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
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lwd0/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lwd0/a;->b()Lkotlinx/coroutines/flow/w;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Ljava/util/List;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-static {p2, v0}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->m(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;Ljava/util/List;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    move-result p2

    .line 34
    const/4 v0, 0x1

    .line 35
    .line 36
    if-gt p2, v0, :cond_2

    .line 37
    .line 38
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->u(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)V

    .line 42
    goto :goto_3

    .line 43
    .line 44
    .line 45
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 46
    move-result p1

    .line 47
    const/4 p2, 0x2

    .line 48
    const/4 v1, 0x0

    .line 49
    .line 50
    const-string v2, "singleBattleScoreView"

    .line 51
    .line 52
    if-ne p1, p2, :cond_5

    .line 53
    .line 54
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->h(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lwd0/a;

    .line 58
    move-result-object p1

    .line 59
    const/4 p2, 0x0

    .line 60
    .line 61
    if-eqz p1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Lwd0/a;->e()Lkotlinx/coroutines/flow/w;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    move-result p1

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    move p1, p2

    .line 82
    .line 83
    :goto_0
    if-eqz p1, :cond_5

    .line 84
    .line 85
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 86
    .line 87
    .line 88
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->j(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/SingleBattleScoreView;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-nez p1, :cond_4

    .line 92
    .line 93
    .line 94
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 95
    goto :goto_1

    .line 96
    :cond_4
    move-object v1, p1

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 100
    goto :goto_3

    .line 101
    .line 102
    :cond_5
    iget-object p1, p0, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->b:Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;->j(Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView;)Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/SingleBattleScoreView;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-nez p1, :cond_6

    .line 109
    .line 110
    .line 111
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 112
    goto :goto_2

    .line 113
    :cond_6
    move-object v1, p1

    .line 114
    .line 115
    :goto_2
    const/16 p1, 0x8

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    return-object p1
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
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/trtc/uikit/livekit/features/anchorboardcast/view/battle/widgets/BattleInfoView$d;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
