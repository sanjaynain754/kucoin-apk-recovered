.class public final Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;
.super Ljava/lang/Object;
.source "Emitters.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AnchorManagerDialog.kt\ncom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n50#2:50\n190#3:51\n1#4:52\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic b:Lkotlinx/coroutines/flow/f;

.field public final synthetic c:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/f;Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;->c:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

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


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p2, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;-><init>(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;

    .line 46
    .line 47
    .line 48
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    goto/16 :goto_3

    .line 51
    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    throw p1

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    iget-object p2, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;->b:Lkotlinx/coroutines/flow/f;

    .line 64
    move-object v2, p1

    .line 65
    .line 66
    check-cast v2, Ljava/util/List;

    .line 67
    .line 68
    .line 69
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result v4

    .line 75
    const/4 v5, 0x0

    .line 76
    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    .line 80
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    move-result-object v4

    .line 82
    move-object v6, v4

    .line 83
    .line 84
    check-cast v6, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 88
    move-result-object v6

    .line 89
    .line 90
    .line 91
    invoke-virtual {v6}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getUserID()Ljava/lang/String;

    .line 92
    move-result-object v6

    .line 93
    .line 94
    iget-object v7, p0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2;->c:Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;

    .line 95
    .line 96
    .line 97
    invoke-static {v7}, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;->S(Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog;)Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    .line 98
    move-result-object v7

    .line 99
    .line 100
    if-eqz v7, :cond_4

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;->getUserID()Ljava/lang/String;

    .line 104
    move-result-object v7

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    move-object v7, v5

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    move-result v6

    .line 111
    .line 112
    if-eqz v6, :cond_3

    .line 113
    goto :goto_2

    .line 114
    :cond_5
    move-object v4, v5

    .line 115
    .line 116
    :goto_2
    check-cast v4, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;

    .line 117
    .line 118
    if-eqz v4, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-virtual {v4}, Lio/trtc/tuikit/atomicxcore/api/live/SeatInfo;->getUserInfo()Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;

    .line 122
    move-result-object v2

    .line 123
    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/live/SeatUserInfo;->getAllowOpenCamera()Z

    .line 128
    move-result v2

    .line 129
    .line 130
    .line 131
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    iput-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    iput-object v2, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$1:Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    iput-object p1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$2:Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    iput-object p1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->L$3:Ljava/lang/Object;

    .line 157
    const/4 p1, 0x0

    .line 158
    .line 159
    iput p1, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->I$0:I

    .line 160
    .line 161
    iput v3, v0, Lcom/trtc/uikit/livekit/features/audiencecontainer/view/coguest/panel/AnchorManagerDialog$addObserver$1$2$invokeSuspend$$inlined$map$1$2$1;->label:I

    .line 162
    .line 163
    .line 164
    invoke-interface {p2, v5, v0}, Lkotlinx/coroutines/flow/f;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 165
    move-result-object p1

    .line 166
    .line 167
    if-ne p1, v1, :cond_7

    .line 168
    return-object v1

    .line 169
    .line 170
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 171
    return-object p1
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
