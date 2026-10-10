.class public final Lki/b;
.super Ljava/lang/Object;
.source "QtyUnitFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0005J\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0014J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0017\u001a\u00020\rJ\u0006\u0010\u0018\u001a\u00020\rJ\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\u001a\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/kubi/futures/trade/config/qty/QtyUnitFactory;",
        "",
        "<init>",
        "()V",
        "mIQtyUnitStrategy",
        "Lcom/kubi/futures/trade/config/qty/IQtyUnitStrategy;",
        "mLastIQtyUnitStrategy",
        "mQtyCache",
        "Landroidx/collection/ArrayMap;",
        "",
        "switchByType",
        "",
        "type",
        "",
        "switchByContract",
        "contract",
        "Lcom/kubi/futures/trade/config/IFuturesContractConfig;",
        "current",
        "last",
        "build",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "assignment",
        "strategy",
        "getQtyType",
        "getQtyTypeOfLot",
        "getQtyTypeOfValue",
        "getQtyTypeOfCost",
        "KumexLib_googleRelease"
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
.field public static final a:Lki/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static b:Lki/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static c:Lki/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public static final d:Landroidx/collection/ArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/ArrayMap<",
            "Ljava/lang/Boolean;",
            "Lki/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lki/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lki/b;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lki/b;->a:Lki/b;

    .line 8
    .line 9
    new-instance v0, Lli/b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lli/b;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lki/b;->b:Lki/a;

    .line 15
    .line 16
    new-instance v0, Landroidx/collection/ArrayMap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Landroidx/collection/ArrayMap;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lki/b;->d:Landroidx/collection/ArrayMap;

    .line 22
    return-void
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
.end method


# virtual methods
.method public final a(Lki/a;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lki/b;->b:Lki/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    sget-object v0, Lki/b;->b:Lki/a;

    .line 15
    .line 16
    sput-object v0, Lki/b;->c:Lki/a;

    .line 17
    .line 18
    :cond_0
    sput-object p1, Lki/b;->b:Lki/a;

    .line 19
    return-void
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
.end method

.method public final b(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lki/a;
    .locals 3
    .param p1    # Lcom/kubi/kumex/data/platform/model/ContractEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    new-instance p1, Lli/d;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1}, Lli/d;-><init>()V

    .line 8
    return-object p1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/kumex/data/platform/model/ContractEntity;->isInverse()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    sget-object p1, Lki/b;->b:Lki/a;

    .line 17
    .line 18
    instance-of v0, p1, Lli/c;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_1
    sget-object p1, Lki/b;->d:Landroidx/collection/ArrayMap;

    .line 24
    .line 25
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    check-cast v1, Lki/a;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    new-instance v1, Lli/c;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1}, Lli/c;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_2
    return-object v1

    .line 43
    .line 44
    :cond_3
    sget-object v0, Lki/b;->b:Lki/a;

    .line 45
    .line 46
    instance-of v1, v0, Lli/c;

    .line 47
    .line 48
    if-nez v1, :cond_4

    .line 49
    return-object v0

    .line 50
    .line 51
    :cond_4
    sget-object v0, Lki/b;->d:Landroidx/collection/ArrayMap;

    .line 52
    .line 53
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/collection/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    check-cast v2, Lki/a;

    .line 60
    .line 61
    if-nez v2, :cond_5

    .line 62
    const/4 v2, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lfm/b;->s(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lhi/a;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v2, p1}, Lki/b;->c(Ljava/lang/String;Lhi/a;)Lki/a;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    return-object p1

    .line 75
    :cond_5
    return-object v2
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
.end method

.method public final c(Ljava/lang/String;Lhi/a;)Lki/a;
    .locals 1

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-interface {p2}, Lhi/a;->q()Z

    .line 6
    move-result p2

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    new-instance p1, Lli/c;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1}, Lli/c;-><init>()V

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    sget-object p1, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/broker/r;->i()Luh/b;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Luh/b;->F0()Lcom/kubi/kumex/data/platform/model/UserConfig;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lfm/f;->e(Lcom/kubi/kumex/data/platform/model/UserConfig;)Ljava/lang/String;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 34
    move-result p2

    .line 35
    .line 36
    .line 37
    sparse-switch p2, :sswitch_data_0

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :sswitch_0
    const-string p2, "QtyUnitOfValue"

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result p2

    .line 45
    .line 46
    if-nez p2, :cond_2

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_2
    new-instance p1, Lli/e;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1}, Lli/e;-><init>()V

    .line 53
    return-object p1

    .line 54
    .line 55
    :sswitch_1
    const-string p2, "QtyUnitOfCost"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 59
    move-result p2

    .line 60
    .line 61
    if-nez p2, :cond_3

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_3
    new-instance p1, Lli/a;

    .line 65
    .line 66
    .line 67
    invoke-direct {p1}, Lli/a;-><init>()V

    .line 68
    return-object p1

    .line 69
    .line 70
    :sswitch_2
    const-string p2, "QtyUnitOfCurrency"

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    move-result p2

    .line 75
    .line 76
    if-nez p2, :cond_4

    .line 77
    goto :goto_0

    .line 78
    .line 79
    :cond_4
    new-instance p1, Lli/b;

    .line 80
    .line 81
    .line 82
    invoke-direct {p1}, Lli/b;-><init>()V

    .line 83
    return-object p1

    .line 84
    .line 85
    :sswitch_3
    const-string p2, "QtyUnitOfLot"

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    move-result p2

    .line 90
    .line 91
    if-nez p2, :cond_5

    .line 92
    .line 93
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    const-string v0, "\u521b\u5efa\u6570\u91cf\u7b56\u7565\u51fa\u73b0\u95ee\u9898\uff0ctype:"

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    const-string p2, "QtyUnitFactory"

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p2}, Lem/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    new-instance p1, Lli/b;

    .line 116
    .line 117
    .line 118
    invoke-direct {p1}, Lli/b;-><init>()V

    .line 119
    return-object p1

    .line 120
    .line 121
    :cond_5
    new-instance p1, Lli/d;

    .line 122
    .line 123
    .line 124
    invoke-direct {p1}, Lli/d;-><init>()V

    .line 125
    return-object p1

    .line 126
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x480fd320 -> :sswitch_3
        -0x14eff81e -> :sswitch_2
        0x4611581e -> :sswitch_1
        0x7d1ef340 -> :sswitch_0
    .end sparse-switch
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
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final d()Lki/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lki/b;->b:Lki/a;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final e()Ljava/lang/String;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lki/b;->b:Lki/a;

    .line 3
    .line 4
    instance-of v1, v0, Lli/d;

    .line 5
    .line 6
    const-string v2, "lot"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    return-object v2

    .line 10
    .line 11
    :cond_0
    instance-of v1, v0, Lli/b;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    const-string v0, "currency"

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_1
    instance-of v1, v0, Lli/e;

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    const-string v0, "value"

    .line 23
    return-object v0

    .line 24
    .line 25
    :cond_2
    instance-of v0, v0, Lli/a;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    const-string v0, "cost"

    .line 30
    return-object v0

    .line 31
    :cond_3
    return-object v2
    .line 32
    .line 33
.end method

.method public final f()Lki/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lki/b;->c:Lki/a;

    .line 3
    return-object v0
    .line 4
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
.end method

.method public final g(Lhi/a;)V
    .locals 2
    .param p1    # Lhi/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "contract"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, p1}, Lki/b;->c(Ljava/lang/String;Lhi/a;)Lki/a;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    sput-object p1, Lki/b;->b:Lki/a;

    .line 13
    .line 14
    sget-object v0, Lki/b;->d:Landroidx/collection/ArrayMap;

    .line 15
    .line 16
    instance-of v1, p1, Lli/c;

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final h(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lki/b;->b:Lki/a;

    .line 8
    .line 9
    instance-of v0, v0, Lli/c;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Lki/b;->c(Ljava/lang/String;Lhi/a;)Lki/a;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lki/b;->a(Lki/a;)V

    .line 21
    .line 22
    sget-object v0, Lki/b;->d:Landroidx/collection/ArrayMap;

    .line 23
    .line 24
    instance-of v1, p1, Lli/c;

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    return-void
.end method
