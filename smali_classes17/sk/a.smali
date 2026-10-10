.class public final Lsk/a;
.super Ljava/lang/Object;
.source "OneWayCrossCalculator.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJq\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lsk/a;",
        "",
        "<init>",
        "()V",
        "",
        "isInverse",
        "Lrk/b;",
        "crossRiskLimit",
        "markPrice",
        "a",
        "(ZLrk/b;Lrk/b;)Lrk/b;",
        "k",
        "leverage",
        "totalMargin",
        "occupiedMargin",
        "estimatedPrice",
        "takerFee",
        "sameSidePositionQty",
        "totalSameSideOrderQty",
        "reverseSidePositionQty",
        "taxRate",
        "calcCrossRiskLimit",
        "b",
        "(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;",
        "Lrk/b;",
        "ZERO",
        "c",
        "ONE",
        "shared_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOneWayCrossCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneWayCrossCalculator.kt\ncom/kubi/kmm/trade/futures/cross/OneWayCrossCalculator\n+ 2 NumberEx.kt\ncom/kubi/kmm/trade/utils/NumberExKt\n*L\n1#1,112:1\n30#2,4:113\n49#2:117\n30#2,4:118\n30#2,4:122\n30#2,4:126\n46#2:130\n49#2:131\n*S KotlinDebug\n*F\n+ 1 OneWayCrossCalculator.kt\ncom/kubi/kmm/trade/futures/cross/OneWayCrossCalculator\n*L\n40#1:113,4\n81#1:117\n92#1:118,4\n96#1:122,4\n100#1:126,4\n105#1:130\n106#1:131\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lsk/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lrk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lrk/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lsk/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lsk/a;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lsk/a;->a:Lsk/a;

    .line 8
    .line 9
    new-instance v0, Lrk/b;

    .line 10
    .line 11
    const-string v1, "0"

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    sput-object v0, Lsk/a;->b:Lrk/b;

    .line 17
    .line 18
    new-instance v0, Lrk/b;

    .line 19
    .line 20
    const-string v1, "1"

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1}, Lrk/b;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    sput-object v0, Lsk/a;->c:Lrk/b;

    .line 26
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
.end method


# virtual methods
.method public final a(ZLrk/b;Lrk/b;)Lrk/b;
    .locals 2
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4
    .line 5
    if-nez p2, :cond_0

    .line 6
    return-object v0

    .line 7
    .line 8
    :cond_0
    if-nez p3, :cond_1

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_1
    if-eqz p1, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_1

    .line 19
    .line 20
    :cond_2
    sget-object p1, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 21
    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p3, v1, p1}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_2

    .line 32
    .line 33
    :goto_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 45
    move-result p2

    .line 46
    .line 47
    if-eqz p2, :cond_3

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-object v0, p1

    .line 50
    .line 51
    :goto_3
    check-cast v0, Lrk/b;

    .line 52
    return-object v0
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
    .line 359
.end method

.method public final b(ZLrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;Lrk/b;)Lrk/b;
    .locals 3
    .param p2    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lrk/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "k"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leverage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "totalMargin"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "occupiedMargin"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "estimatedPrice"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "takerFee"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sameSidePositionQty"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "totalSameSideOrderQty"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reverseSidePositionQty"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "taxRate"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2
    invoke-virtual {p4, p5}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object p4

    sget-object p5, Lsk/a;->b:Lrk/b;

    .line 3
    invoke-virtual {p4, p5}, Lrk/b;->b(Lrk/b;)I

    move-result v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p4, p5

    .line 4
    :goto_0
    invoke-virtual {p4, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p4

    const/16 v1, 0x14

    if-nez p1, :cond_1

    .line 5
    sget-object v2, Lsk/a;->c:Lrk/b;

    invoke-virtual {v2, p11}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p11

    invoke-virtual {p7, p11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p7

    invoke-virtual {p7, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p3

    invoke-virtual {v2, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 6
    invoke-virtual {p6, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 7
    invoke-virtual {p2, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    .line 8
    :cond_1
    invoke-virtual {p6, p5}, Lrk/b;->b(Lrk/b;)I

    move-result v2

    if-gez v2, :cond_2

    return-object v0

    .line 9
    :cond_2
    sget-object v2, Lsk/a;->c:Lrk/b;

    .line 10
    invoke-virtual {v2, p11}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p11

    invoke-virtual {p7, p11}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p7

    invoke-virtual {p7, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 11
    invoke-virtual {v2, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p3

    .line 12
    sget-object p7, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 13
    invoke-virtual {p6, p3, v1, p7}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object p3

    .line 14
    invoke-virtual {p3, p2, v1, p7}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object p3

    :goto_1
    if-nez p1, :cond_3

    .line 15
    sget-object p1, Lcom/kubi/kmm/trade/KMMRoundingMode;->HALF_UP:Lcom/kubi/kmm/trade/KMMRoundingMode;

    .line 16
    invoke-virtual {p4, p3, v1, p1}, Lrk/b;->c(Lrk/b;ILcom/kubi/kmm/trade/KMMRoundingMode;)Lrk/b;

    move-result-object p1

    .line 17
    sget-object p3, Lsk/a;->c:Lrk/b;

    invoke-virtual {p1, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p1

    invoke-virtual {p1}, Lrk/b;->h()D

    move-result-wide p3

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {p4, p3}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    sget-object p3, Lsk/a;->c:Lrk/b;

    invoke-virtual {p1, p3}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p1

    invoke-virtual {p1}, Lrk/b;->h()D

    move-result-wide p3

    .line 19
    :goto_2
    new-instance p1, Lrk/b;

    invoke-static {p3, p4}, Ljava/lang/Math;->log(D)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p1, p3}, Lrk/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lrk/b;->e(Lrk/b;)Lrk/b;

    move-result-object p1

    if-eqz p12, :cond_6

    .line 20
    invoke-virtual {p12, p1}, Lrk/b;->b(Lrk/b;)I

    move-result p2

    if-gez p2, :cond_4

    goto :goto_3

    :cond_4
    move-object p12, p1

    :goto_3
    if-nez p12, :cond_5

    goto :goto_4

    :cond_5
    move-object p1, p12

    .line 21
    :cond_6
    :goto_4
    invoke-virtual {p8, p9}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lrk/b;->g(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 22
    invoke-virtual {p1, p10}, Lrk/b;->a(Lrk/b;)Lrk/b;

    move-result-object p1

    .line 23
    invoke-virtual {p5, p1}, Lrk/b;->b(Lrk/b;)I

    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lez p2, :cond_7

    return-object p5

    :cond_7
    return-object p1

    .line 24
    :goto_5
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 25
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_6

    :cond_8
    move-object v0, p1

    :goto_6
    check-cast v0, Lrk/b;

    return-object v0
.end method
