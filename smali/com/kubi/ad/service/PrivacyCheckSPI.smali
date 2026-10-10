.class public final Lcom/kubi/ad/service/PrivacyCheckSPI;
.super Ljava/lang/Object;
.source "PrivacyCheckSPI.kt"

# interfaces
.implements Lun/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0002\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/kubi/ad/service/PrivacyCheckSPI;",
        "Lcom/kubi/launch/spi/IPrivacyCheckSPI;",
        "<init>",
        "()V",
        "privacyCheck",
        "",
        "activity",
        "Lcom/kubi/sdk/BaseActivity;",
        "(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "AdLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPrivacyCheckSPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivacyCheckSPI.kt\ncom/kubi/ad/service/PrivacyCheckSPI\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,25:1\n17#2,2:26\n*S KotlinDebug\n*F\n+ 1 PrivacyCheckSPI.kt\ncom/kubi/ad/service/PrivacyCheckSPI\n*L\n21#1:26,2\n*E\n"
    }
.end annotation


# direct methods
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
.end method


# virtual methods
.method public a(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lcom/kubi/sdk/BaseActivity;
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
            "Lcom/kubi/sdk/BaseActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p2, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p2

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->label:I

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
    iput v1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;-><init>(Lcom/kubi/ad/service/PrivacyCheckSPI;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->label:I

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
    iget-object p1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/kubi/sdk/BaseActivity;

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    goto :goto_3

    .line 49
    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p1

    .line 57
    .line 58
    :cond_2
    iget-object p1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$2:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lca/b;

    .line 61
    .line 62
    iget-object p1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p1, Lcom/kubi/sdk/BaseActivity;

    .line 65
    .line 66
    .line 67
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    goto :goto_1

    .line 69
    .line 70
    .line 71
    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    const-string p2, "StartupDispatcher"

    .line 74
    .line 75
    const-string v2, "checkGuide"

    .line 76
    .line 77
    .line 78
    invoke-static {p2, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    sget-object p2, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 81
    .line 82
    sget-object v2, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    const-class v5, Lca/b;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v5, v2}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    move-result-object p2

    .line 93
    const/4 v2, 0x0

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    move-object v3, p2

    .line 97
    .line 98
    check-cast v3, Lca/b;

    .line 99
    .line 100
    iput-object p1, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$0:Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    move-result-object p2

    .line 105
    .line 106
    iput-object p2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$1:Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    move-result-object p2

    .line 111
    .line 112
    iput-object p2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$2:Ljava/lang/Object;

    .line 113
    .line 114
    iput v2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->I$0:I

    .line 115
    .line 116
    iput v2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->I$1:I

    .line 117
    .line 118
    iput v4, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->label:I

    .line 119
    .line 120
    .line 121
    invoke-interface {v3, p1, v0}, Lca/b;->a(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 122
    move-result-object p2

    .line 123
    .line 124
    if-ne p2, v1, :cond_4

    .line 125
    goto :goto_2

    .line 126
    .line 127
    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    move-result p1

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    .line 138
    .line 139
    :cond_5
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    move-result-object v4

    .line 141
    .line 142
    iput-object v4, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$0:Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    move-result-object p2

    .line 147
    .line 148
    iput-object p2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$1:Ljava/lang/Object;

    .line 149
    const/4 p2, 0x0

    .line 150
    .line 151
    iput-object p2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->L$2:Ljava/lang/Object;

    .line 152
    .line 153
    iput v2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->I$0:I

    .line 154
    .line 155
    iput v2, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->I$1:I

    .line 156
    .line 157
    iput v3, v0, Lcom/kubi/ad/service/PrivacyCheckSPI$privacyCheck$1;->label:I

    .line 158
    .line 159
    .line 160
    invoke-static {p1, v0}, Lcom/kubi/ad/service/k;->b(Lcom/kubi/sdk/BaseActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    if-ne p2, v1, :cond_6

    .line 164
    :goto_2
    return-object v1

    .line 165
    .line 166
    :cond_6
    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 170
    move-result p1

    .line 171
    .line 172
    .line 173
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 174
    move-result-object p1

    .line 175
    return-object p1
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
.end method
