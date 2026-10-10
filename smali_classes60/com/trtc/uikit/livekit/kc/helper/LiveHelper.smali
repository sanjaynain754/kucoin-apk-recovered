.class public final Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;
.super Ljava/lang/Object;
.source "LiveHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0008\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u000cJ \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00102\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0086@\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;",
        "",
        "<init>",
        "()V",
        "login",
        "",
        "context",
        "Landroid/content/Context;",
        "roomId",
        "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "loadLiveTxUserInfo",
        "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "txUserInfo",
        "(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reportShare",
        "",
        "fromInviteOpenId",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "reportReplay",
        "eventId",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->a:Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;

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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
    .line 5
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
.end method

.method public static final synthetic a(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->c(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->label:I

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
    iput v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;-><init>(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->label:I

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
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    :try_start_1
    sget-object p2, Lje0/b;->a:Lje0/b;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lje0/b;->b()Lle0/a;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    new-instance v2, Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;

    .line 67
    .line 68
    .line 69
    invoke-direct {v2, p1}, Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->L$0:Ljava/lang/Object;

    .line 76
    .line 77
    iput v3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$loadLiveTxUserInfo$1;->label:I

    .line 78
    .line 79
    .line 80
    invoke-interface {p2, v2, v0}, Lle0/a;->c(Lcom/trtc/uikit/livekit/kc/data/entity/LiveRoomInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    if-ne p2, v1, :cond_3

    .line 84
    return-object v1

    .line 85
    .line 86
    :cond_3
    :goto_1
    check-cast p2, Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 87
    return-object p2

    .line 88
    .line 89
    :goto_2
    instance-of p2, p1, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 90
    .line 91
    if-eqz p2, :cond_5

    .line 92
    move-object p2, p1

    .line 93
    .line 94
    check-cast p2, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 95
    .line 96
    iget-object p2, p2, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 97
    .line 98
    const-string v0, "500004"

    .line 99
    .line 100
    .line 101
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    move-result p2

    .line 103
    .line 104
    if-nez p2, :cond_6

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    move-result-object p2

    .line 109
    .line 110
    .line 111
    invoke-static {p2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    .line 115
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 116
    move-result p2

    .line 117
    .line 118
    if-lez p2, :cond_4

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 122
    move-result-object p2

    .line 123
    const/4 v0, 0x0

    .line 124
    .line 125
    new-array v0, v0, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-static {p2, v0}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    goto :goto_3

    .line 130
    .line 131
    :cond_4
    sget p2, Lcom/trtc/uikit/livekit/R$string;->live_kc_common_error:I

    .line 132
    .line 133
    .line 134
    invoke-static {p2}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 135
    goto :goto_3

    .line 136
    .line 137
    :cond_5
    sget p2, Lcom/trtc/uikit/livekit/R$string;->live_kc_common_error:I

    .line 138
    .line 139
    .line 140
    invoke-static {p2}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 141
    .line 142
    :cond_6
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    const-string v0, "loadLiveTxUserInfo error "

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    const-string p2, "Live"

    .line 164
    .line 165
    .line 166
    invoke-static {p2, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    const/4 p1, 0x0

    .line 168
    return-object p1
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

.method public final c(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->label:I

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
    iput v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;-><init>(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->label:I

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
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->L$1:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroid/content/Context;

    .line 46
    .line 47
    .line 48
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    goto :goto_1

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    new-instance p3, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$3;

    .line 63
    const/4 v2, 0x0

    .line 64
    .line 65
    .line 66
    invoke-direct {p3, p1, p2, v2}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$3;-><init>(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->L$0:Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->L$1:Ljava/lang/Object;

    .line 79
    .line 80
    iput v3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$2;->label:I

    .line 81
    .line 82
    const-wide/16 p1, 0x3a98

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2, p3, v0}, Lkotlinx/coroutines/TimeoutKt;->d(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 86
    move-result-object p3

    .line 87
    .line 88
    if-ne p3, v1, :cond_3

    .line 89
    return-object v1

    .line 90
    :cond_3
    :goto_1
    move-object p1, p3

    .line 91
    .line 92
    check-cast p1, Ljava/lang/String;

    .line 93
    .line 94
    if-nez p1, :cond_4

    .line 95
    .line 96
    sget p1, Lcom/trtc/uikit/livekit/R$string;->live_kc_common_error:I

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 100
    .line 101
    const-string p1, "Live"

    .line 102
    .line 103
    const-string p2, "login tx timeout after 15s"

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    :cond_4
    return-object p3
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
.end method

.method public final d(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->label:I

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
    iput v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;-><init>(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->label:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$2:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;

    .line 45
    .line 46
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$1:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Ljava/lang/String;

    .line 49
    .line 50
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$0:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    goto :goto_3

    .line 57
    .line 58
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 59
    .line 60
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    throw p1

    .line 65
    .line 66
    :cond_2
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$1:Ljava/lang/Object;

    .line 67
    move-object p2, p1

    .line 68
    .line 69
    check-cast p2, Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$0:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 77
    goto :goto_1

    .line 78
    .line 79
    .line 80
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 81
    .line 82
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$0:Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    move-result-object p3

    .line 87
    .line 88
    iput-object p3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    iput v4, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->label:I

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p2, v0}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->b(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 94
    move-result-object p3

    .line 95
    .line 96
    if-ne p3, v1, :cond_4

    .line 97
    goto :goto_2

    .line 98
    .line 99
    :cond_4
    :goto_1
    check-cast p3, Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;

    .line 100
    .line 101
    if-nez p3, :cond_5

    .line 102
    const/4 p1, 0x0

    .line 103
    return-object p1

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    iput-object v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$0:Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    iput-object p2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$1:Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    iput-object p2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->L$2:Ljava/lang/Object;

    .line 122
    .line 123
    iput v3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$login$1;->label:I

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1, p3, v0}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;->c(Landroid/content/Context;Lcom/trtc/uikit/livekit/kc/data/entity/LiveTxUserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 127
    move-result-object p3

    .line 128
    .line 129
    if-ne p3, v1, :cond_6

    .line 130
    :goto_2
    return-object v1

    .line 131
    .line 132
    :cond_6
    :goto_3
    check-cast p3, Ljava/lang/String;

    .line 133
    return-object p3
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
.end method

.method public final e(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->label:I

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
    iput v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;-><init>(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    const-string v4, "Live"

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object p2, v0

    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    .line 75
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 76
    move-result p3

    .line 77
    .line 78
    if-eqz p3, :cond_3

    .line 79
    .line 80
    goto/16 :goto_4

    .line 81
    .line 82
    :cond_3
    if-eqz p2, :cond_7

    .line 83
    .line 84
    .line 85
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 86
    move-result p3

    .line 87
    .line 88
    if-eqz p3, :cond_4

    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_4
    :try_start_1
    new-instance p3, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;

    .line 93
    .line 94
    const-string v2, "enterReplay"

    .line 95
    .line 96
    new-instance v5, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;

    .line 97
    .line 98
    const-string v7, "leave"

    .line 99
    const/4 v9, 0x1

    .line 100
    const/4 v10, 0x0

    .line 101
    const/4 v6, 0x0

    .line 102
    move-object v8, p2

    .line 103
    .line 104
    .line 105
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {p3, p1, v2, v5}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;)V

    .line 109
    .line 110
    sget-object p2, Lje0/b;->a:Lje0/b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Lje0/b;->b()Lle0/a;

    .line 114
    move-result-object p2

    .line 115
    .line 116
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    iput-object v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$1:Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    move-result-object v2

    .line 127
    .line 128
    iput-object v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->L$2:Ljava/lang/Object;

    .line 129
    .line 130
    iput v3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportReplay$1;->label:I

    .line 131
    .line 132
    .line 133
    invoke-interface {p2, p3, v0}, Lle0/a;->g(Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 134
    move-result-object p3

    .line 135
    .line 136
    if-ne p3, v1, :cond_5

    .line 137
    return-object v1

    .line 138
    .line 139
    :cond_5
    :goto_1
    check-cast p3, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;->getResult()Ljava/lang/Boolean;

    .line 143
    move-result-object p2

    .line 144
    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 147
    move-result-object p3

    .line 148
    .line 149
    .line 150
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    move-result p2

    .line 152
    .line 153
    if-eqz p2, :cond_6

    .line 154
    .line 155
    new-instance p2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    const-string p3, "reportReplay success, roomId: "

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    move-result-object p2

    .line 171
    .line 172
    .line 173
    invoke-static {v4, p2}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 174
    goto :goto_3

    .line 175
    .line 176
    :cond_6
    new-instance p2, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    const-string p3, "reportReplay failed, roomId: "

    .line 182
    .line 183
    .line 184
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 191
    move-result-object p2

    .line 192
    .line 193
    .line 194
    invoke-static {v4, p2}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 195
    goto :goto_3

    .line 196
    .line 197
    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 201
    .line 202
    const-string v0, "reportReplay error, roomId: "

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    move-result-object p1

    .line 213
    .line 214
    .line 215
    invoke-static {v4, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-static {v4, p2}, Lro/b;->g(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 219
    .line 220
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 221
    return-object p1

    .line 222
    .line 223
    :cond_7
    :goto_4
    const-string p1, "reportReplay failed: roomId is blank"

    .line 224
    .line 225
    .line 226
    invoke-static {v4, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    .line 228
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 229
    return-object p1
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
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->label:I

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
    iput v1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;-><init>(Lcom/trtc/uikit/livekit/kc/helper/LiveHelper;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->label:I

    .line 33
    .line 34
    const-string v3, "Live"

    .line 35
    const/4 v4, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-ne v2, v4, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$2:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$1:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/String;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$0:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    goto :goto_1

    .line 56
    :catch_0
    move-exception v0

    .line 57
    move-object p1, v0

    .line 58
    goto :goto_2

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    throw p1

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 73
    move-result p3

    .line 74
    .line 75
    if-nez p3, :cond_5

    .line 76
    .line 77
    .line 78
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 79
    move-result p3

    .line 80
    .line 81
    if-eqz p3, :cond_3

    .line 82
    goto :goto_4

    .line 83
    .line 84
    :cond_3
    :try_start_1
    new-instance p3, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;

    .line 85
    .line 86
    const-string v2, "userUseInvitedLinkToRoom"

    .line 87
    .line 88
    new-instance v5, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;

    .line 89
    const/4 v9, 0x6

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v7, 0x0

    .line 92
    const/4 v8, 0x0

    .line 93
    move-object v6, p2

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v5 .. v10}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {p3, p1, v2, v5}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request$ReportData;)V

    .line 100
    .line 101
    sget-object p2, Lje0/b;->a:Lje0/b;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2}, Lje0/b;->b()Lle0/a;

    .line 105
    move-result-object p2

    .line 106
    .line 107
    iput-object p1, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-result-object v2

    .line 112
    .line 113
    iput-object v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$1:Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object v2

    .line 118
    .line 119
    iput-object v2, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->L$2:Ljava/lang/Object;

    .line 120
    .line 121
    iput v4, v0, Lcom/trtc/uikit/livekit/kc/helper/LiveHelper$reportShare$1;->label:I

    .line 122
    .line 123
    .line 124
    invoke-interface {p2, p3, v0}, Lle0/a;->g(Lcom/trtc/uikit/livekit/kc/data/entity/Report$Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 125
    move-result-object p3

    .line 126
    .line 127
    if-ne p3, v1, :cond_4

    .line 128
    return-object v1

    .line 129
    .line 130
    :cond_4
    :goto_1
    check-cast p3, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3}, Lcom/trtc/uikit/livekit/kc/data/entity/Report$Response;->getResult()Ljava/lang/Boolean;

    .line 134
    move-result-object p2

    .line 135
    .line 136
    .line 137
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 138
    move-result-object p3

    .line 139
    .line 140
    .line 141
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    move-result p2

    .line 143
    .line 144
    new-instance p3, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    const-string v0, "reportShare result:"

    .line 150
    .line 151
    .line 152
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    const-string p2, ", roomId: "

    .line 158
    .line 159
    .line 160
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    move-result-object p1

    .line 168
    .line 169
    .line 170
    invoke-static {v3, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 171
    goto :goto_3

    .line 172
    .line 173
    :goto_2
    const-string p2, "reportShare"

    .line 174
    .line 175
    .line 176
    invoke-static {v3, p2, p1}, Lro/b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 177
    .line 178
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 179
    return-object p1

    .line 180
    .line 181
    :cond_5
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 182
    return-object p1
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
.end method
