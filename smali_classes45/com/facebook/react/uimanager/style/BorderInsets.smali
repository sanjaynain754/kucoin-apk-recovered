.class public final Lcom/facebook/react/uimanager/style/BorderInsets;
.super Ljava/lang/Object;
.source "BorderInsets.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001d\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BorderInsets;",
        "",
        "<init>",
        "()V",
        "edgeInsets",
        "",
        "",
        "[Ljava/lang/Float;",
        "setBorderWidth",
        "",
        "edge",
        "Lcom/facebook/react/uimanager/style/LogicalEdge;",
        "width",
        "(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V",
        "resolve",
        "Landroid/graphics/RectF;",
        "layoutDirection",
        "",
        "context",
        "Landroid/content/Context;",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final edgeInsets:[Ljava/lang/Float;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->values()[Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 7
    move-result-object v0

    .line 8
    array-length v0, v0

    .line 9
    .line 10
    new-array v0, v0, [Ljava/lang/Float;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method


# virtual methods
.method public final resolve(ILandroid/content/Context;)Landroid/graphics/RectF;
    .locals 5
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_26

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-ne p1, v1, :cond_25

    .line 12
    .line 13
    sget-object p1, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->Companion:Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 21
    move-result p1

    .line 22
    .line 23
    if-eqz p1, :cond_12

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/RectF;

    .line 26
    .line 27
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 28
    .line 29
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 33
    move-result v1

    .line 34
    .line 35
    aget-object p2, p2, v1

    .line 36
    .line 37
    if-eqz p2, :cond_0

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 41
    move-result p2

    .line 42
    goto :goto_1

    .line 43
    .line 44
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 45
    .line 46
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 50
    move-result v1

    .line 51
    .line 52
    aget-object p2, p2, v1

    .line 53
    .line 54
    if-eqz p2, :cond_1

    .line 55
    goto :goto_0

    .line 56
    .line 57
    :cond_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 58
    .line 59
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 63
    move-result v1

    .line 64
    .line 65
    aget-object p2, p2, v1

    .line 66
    .line 67
    if-eqz p2, :cond_2

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 71
    .line 72
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 76
    move-result v1

    .line 77
    .line 78
    aget-object p2, p2, v1

    .line 79
    .line 80
    if-eqz p2, :cond_3

    .line 81
    goto :goto_0

    .line 82
    :cond_3
    move p2, v0

    .line 83
    .line 84
    :goto_1
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 85
    .line 86
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 90
    move-result v2

    .line 91
    .line 92
    aget-object v1, v1, v2

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    .line 97
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 98
    move-result v1

    .line 99
    goto :goto_3

    .line 100
    .line 101
    :cond_4
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 102
    .line 103
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 107
    move-result v2

    .line 108
    .line 109
    aget-object v1, v1, v2

    .line 110
    .line 111
    if-eqz v1, :cond_5

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_5
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 115
    .line 116
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 120
    move-result v2

    .line 121
    .line 122
    aget-object v1, v1, v2

    .line 123
    .line 124
    if-eqz v1, :cond_6

    .line 125
    goto :goto_2

    .line 126
    .line 127
    :cond_6
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 128
    .line 129
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 133
    move-result v2

    .line 134
    .line 135
    aget-object v1, v1, v2

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    goto :goto_2

    .line 139
    .line 140
    :cond_7
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 141
    .line 142
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 146
    move-result v2

    .line 147
    .line 148
    aget-object v1, v1, v2

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    goto :goto_2

    .line 152
    :cond_8
    move v1, v0

    .line 153
    .line 154
    :goto_3
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 155
    .line 156
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 160
    move-result v3

    .line 161
    .line 162
    aget-object v2, v2, v3

    .line 163
    .line 164
    if-eqz v2, :cond_9

    .line 165
    .line 166
    .line 167
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 168
    move-result v2

    .line 169
    goto :goto_5

    .line 170
    .line 171
    :cond_9
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 172
    .line 173
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 177
    move-result v3

    .line 178
    .line 179
    aget-object v2, v2, v3

    .line 180
    .line 181
    if-eqz v2, :cond_a

    .line 182
    goto :goto_4

    .line 183
    .line 184
    :cond_a
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 185
    .line 186
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 190
    move-result v3

    .line 191
    .line 192
    aget-object v2, v2, v3

    .line 193
    .line 194
    if-eqz v2, :cond_b

    .line 195
    goto :goto_4

    .line 196
    .line 197
    :cond_b
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 198
    .line 199
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 203
    move-result v3

    .line 204
    .line 205
    aget-object v2, v2, v3

    .line 206
    .line 207
    if-eqz v2, :cond_c

    .line 208
    goto :goto_4

    .line 209
    :cond_c
    move v2, v0

    .line 210
    .line 211
    :goto_5
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 212
    .line 213
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 217
    move-result v4

    .line 218
    .line 219
    aget-object v3, v3, v4

    .line 220
    .line 221
    if-eqz v3, :cond_d

    .line 222
    .line 223
    .line 224
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 225
    move-result v0

    .line 226
    goto :goto_7

    .line 227
    .line 228
    :cond_d
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 229
    .line 230
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 234
    move-result v4

    .line 235
    .line 236
    aget-object v3, v3, v4

    .line 237
    .line 238
    if-eqz v3, :cond_e

    .line 239
    goto :goto_6

    .line 240
    .line 241
    :cond_e
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 242
    .line 243
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 247
    move-result v4

    .line 248
    .line 249
    aget-object v3, v3, v4

    .line 250
    .line 251
    if-eqz v3, :cond_f

    .line 252
    goto :goto_6

    .line 253
    .line 254
    :cond_f
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 255
    .line 256
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 260
    move-result v4

    .line 261
    .line 262
    aget-object v3, v3, v4

    .line 263
    .line 264
    if-eqz v3, :cond_10

    .line 265
    goto :goto_6

    .line 266
    .line 267
    :cond_10
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 268
    .line 269
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 273
    move-result v4

    .line 274
    .line 275
    aget-object v3, v3, v4

    .line 276
    .line 277
    if-eqz v3, :cond_11

    .line 278
    goto :goto_6

    .line 279
    .line 280
    .line 281
    :cond_11
    :goto_7
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 282
    return-object p1

    .line 283
    .line 284
    :cond_12
    new-instance p1, Landroid/graphics/RectF;

    .line 285
    .line 286
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 287
    .line 288
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 292
    move-result v1

    .line 293
    .line 294
    aget-object p2, p2, v1

    .line 295
    .line 296
    if-eqz p2, :cond_13

    .line 297
    .line 298
    .line 299
    :goto_8
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 300
    move-result p2

    .line 301
    goto :goto_9

    .line 302
    .line 303
    :cond_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 304
    .line 305
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 309
    move-result v1

    .line 310
    .line 311
    aget-object p2, p2, v1

    .line 312
    .line 313
    if-eqz p2, :cond_14

    .line 314
    goto :goto_8

    .line 315
    .line 316
    :cond_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 317
    .line 318
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 322
    move-result v1

    .line 323
    .line 324
    aget-object p2, p2, v1

    .line 325
    .line 326
    if-eqz p2, :cond_15

    .line 327
    goto :goto_8

    .line 328
    .line 329
    :cond_15
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 330
    .line 331
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 332
    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 335
    move-result v1

    .line 336
    .line 337
    aget-object p2, p2, v1

    .line 338
    .line 339
    if-eqz p2, :cond_16

    .line 340
    goto :goto_8

    .line 341
    :cond_16
    move p2, v0

    .line 342
    .line 343
    :goto_9
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 344
    .line 345
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 349
    move-result v2

    .line 350
    .line 351
    aget-object v1, v1, v2

    .line 352
    .line 353
    if-eqz v1, :cond_17

    .line 354
    .line 355
    .line 356
    :goto_a
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 357
    move-result v1

    .line 358
    goto :goto_b

    .line 359
    .line 360
    :cond_17
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 361
    .line 362
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 366
    move-result v2

    .line 367
    .line 368
    aget-object v1, v1, v2

    .line 369
    .line 370
    if-eqz v1, :cond_18

    .line 371
    goto :goto_a

    .line 372
    .line 373
    :cond_18
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 374
    .line 375
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 379
    move-result v2

    .line 380
    .line 381
    aget-object v1, v1, v2

    .line 382
    .line 383
    if-eqz v1, :cond_19

    .line 384
    goto :goto_a

    .line 385
    .line 386
    :cond_19
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 387
    .line 388
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 392
    move-result v2

    .line 393
    .line 394
    aget-object v1, v1, v2

    .line 395
    .line 396
    if-eqz v1, :cond_1a

    .line 397
    goto :goto_a

    .line 398
    .line 399
    :cond_1a
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 400
    .line 401
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 405
    move-result v2

    .line 406
    .line 407
    aget-object v1, v1, v2

    .line 408
    .line 409
    if-eqz v1, :cond_1b

    .line 410
    goto :goto_a

    .line 411
    :cond_1b
    move v1, v0

    .line 412
    .line 413
    :goto_b
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 414
    .line 415
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 419
    move-result v3

    .line 420
    .line 421
    aget-object v2, v2, v3

    .line 422
    .line 423
    if-eqz v2, :cond_1c

    .line 424
    .line 425
    .line 426
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 427
    move-result v2

    .line 428
    goto :goto_d

    .line 429
    .line 430
    :cond_1c
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 431
    .line 432
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 436
    move-result v3

    .line 437
    .line 438
    aget-object v2, v2, v3

    .line 439
    .line 440
    if-eqz v2, :cond_1d

    .line 441
    goto :goto_c

    .line 442
    .line 443
    :cond_1d
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 444
    .line 445
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 449
    move-result v3

    .line 450
    .line 451
    aget-object v2, v2, v3

    .line 452
    .line 453
    if-eqz v2, :cond_1e

    .line 454
    goto :goto_c

    .line 455
    .line 456
    :cond_1e
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 457
    .line 458
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 459
    .line 460
    .line 461
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 462
    move-result v3

    .line 463
    .line 464
    aget-object v2, v2, v3

    .line 465
    .line 466
    if-eqz v2, :cond_1f

    .line 467
    goto :goto_c

    .line 468
    :cond_1f
    move v2, v0

    .line 469
    .line 470
    :goto_d
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 471
    .line 472
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 476
    move-result v4

    .line 477
    .line 478
    aget-object v3, v3, v4

    .line 479
    .line 480
    if-eqz v3, :cond_20

    .line 481
    .line 482
    .line 483
    :goto_e
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 484
    move-result v0

    .line 485
    goto :goto_f

    .line 486
    .line 487
    :cond_20
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 488
    .line 489
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 493
    move-result v4

    .line 494
    .line 495
    aget-object v3, v3, v4

    .line 496
    .line 497
    if-eqz v3, :cond_21

    .line 498
    goto :goto_e

    .line 499
    .line 500
    :cond_21
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 501
    .line 502
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 506
    move-result v4

    .line 507
    .line 508
    aget-object v3, v3, v4

    .line 509
    .line 510
    if-eqz v3, :cond_22

    .line 511
    goto :goto_e

    .line 512
    .line 513
    :cond_22
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 514
    .line 515
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 519
    move-result v4

    .line 520
    .line 521
    aget-object v3, v3, v4

    .line 522
    .line 523
    if-eqz v3, :cond_23

    .line 524
    goto :goto_e

    .line 525
    .line 526
    :cond_23
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 527
    .line 528
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 532
    move-result v4

    .line 533
    .line 534
    aget-object v3, v3, v4

    .line 535
    .line 536
    if-eqz v3, :cond_24

    .line 537
    goto :goto_e

    .line 538
    .line 539
    .line 540
    :cond_24
    :goto_f
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 541
    return-object p1

    .line 542
    .line 543
    :cond_25
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 544
    .line 545
    const-string p2, "Expected resolved layout direction"

    .line 546
    .line 547
    .line 548
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 549
    throw p1

    .line 550
    .line 551
    :cond_26
    new-instance p1, Landroid/graphics/RectF;

    .line 552
    .line 553
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 554
    .line 555
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 556
    .line 557
    .line 558
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 559
    move-result v1

    .line 560
    .line 561
    aget-object p2, p2, v1

    .line 562
    .line 563
    if-eqz p2, :cond_27

    .line 564
    .line 565
    .line 566
    :goto_10
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 567
    move-result p2

    .line 568
    goto :goto_11

    .line 569
    .line 570
    :cond_27
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 571
    .line 572
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 576
    move-result v1

    .line 577
    .line 578
    aget-object p2, p2, v1

    .line 579
    .line 580
    if-eqz p2, :cond_28

    .line 581
    goto :goto_10

    .line 582
    .line 583
    :cond_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 584
    .line 585
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 589
    move-result v1

    .line 590
    .line 591
    aget-object p2, p2, v1

    .line 592
    .line 593
    if-eqz p2, :cond_29

    .line 594
    goto :goto_10

    .line 595
    .line 596
    :cond_29
    iget-object p2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 597
    .line 598
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 602
    move-result v1

    .line 603
    .line 604
    aget-object p2, p2, v1

    .line 605
    .line 606
    if-eqz p2, :cond_2a

    .line 607
    goto :goto_10

    .line 608
    :cond_2a
    move p2, v0

    .line 609
    .line 610
    :goto_11
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 611
    .line 612
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 616
    move-result v2

    .line 617
    .line 618
    aget-object v1, v1, v2

    .line 619
    .line 620
    if-eqz v1, :cond_2b

    .line 621
    .line 622
    .line 623
    :goto_12
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 624
    move-result v1

    .line 625
    goto :goto_13

    .line 626
    .line 627
    :cond_2b
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 628
    .line 629
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 630
    .line 631
    .line 632
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 633
    move-result v2

    .line 634
    .line 635
    aget-object v1, v1, v2

    .line 636
    .line 637
    if-eqz v1, :cond_2c

    .line 638
    goto :goto_12

    .line 639
    .line 640
    :cond_2c
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 641
    .line 642
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 646
    move-result v2

    .line 647
    .line 648
    aget-object v1, v1, v2

    .line 649
    .line 650
    if-eqz v1, :cond_2d

    .line 651
    goto :goto_12

    .line 652
    .line 653
    :cond_2d
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 654
    .line 655
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 659
    move-result v2

    .line 660
    .line 661
    aget-object v1, v1, v2

    .line 662
    .line 663
    if-eqz v1, :cond_2e

    .line 664
    goto :goto_12

    .line 665
    .line 666
    :cond_2e
    iget-object v1, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 667
    .line 668
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 672
    move-result v2

    .line 673
    .line 674
    aget-object v1, v1, v2

    .line 675
    .line 676
    if-eqz v1, :cond_2f

    .line 677
    goto :goto_12

    .line 678
    :cond_2f
    move v1, v0

    .line 679
    .line 680
    :goto_13
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 681
    .line 682
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 686
    move-result v3

    .line 687
    .line 688
    aget-object v2, v2, v3

    .line 689
    .line 690
    if-eqz v2, :cond_30

    .line 691
    .line 692
    .line 693
    :goto_14
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 694
    move-result v2

    .line 695
    goto :goto_15

    .line 696
    .line 697
    :cond_30
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 698
    .line 699
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 700
    .line 701
    .line 702
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 703
    move-result v3

    .line 704
    .line 705
    aget-object v2, v2, v3

    .line 706
    .line 707
    if-eqz v2, :cond_31

    .line 708
    goto :goto_14

    .line 709
    .line 710
    :cond_31
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 711
    .line 712
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 716
    move-result v3

    .line 717
    .line 718
    aget-object v2, v2, v3

    .line 719
    .line 720
    if-eqz v2, :cond_32

    .line 721
    goto :goto_14

    .line 722
    .line 723
    :cond_32
    iget-object v2, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 724
    .line 725
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 729
    move-result v3

    .line 730
    .line 731
    aget-object v2, v2, v3

    .line 732
    .line 733
    if-eqz v2, :cond_33

    .line 734
    goto :goto_14

    .line 735
    :cond_33
    move v2, v0

    .line 736
    .line 737
    :goto_15
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 738
    .line 739
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 743
    move-result v4

    .line 744
    .line 745
    aget-object v3, v3, v4

    .line 746
    .line 747
    if-eqz v3, :cond_34

    .line 748
    .line 749
    .line 750
    :goto_16
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    .line 751
    move-result v0

    .line 752
    goto :goto_17

    .line 753
    .line 754
    :cond_34
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 755
    .line 756
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 760
    move-result v4

    .line 761
    .line 762
    aget-object v3, v3, v4

    .line 763
    .line 764
    if-eqz v3, :cond_35

    .line 765
    goto :goto_16

    .line 766
    .line 767
    :cond_35
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 768
    .line 769
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 770
    .line 771
    .line 772
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 773
    move-result v4

    .line 774
    .line 775
    aget-object v3, v3, v4

    .line 776
    .line 777
    if-eqz v3, :cond_36

    .line 778
    goto :goto_16

    .line 779
    .line 780
    :cond_36
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 781
    .line 782
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 783
    .line 784
    .line 785
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 786
    move-result v4

    .line 787
    .line 788
    aget-object v3, v3, v4

    .line 789
    .line 790
    if-eqz v3, :cond_37

    .line 791
    goto :goto_16

    .line 792
    .line 793
    :cond_37
    iget-object v3, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 794
    .line 795
    sget-object v4, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 796
    .line 797
    .line 798
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 799
    move-result v4

    .line 800
    .line 801
    aget-object v3, v3, v4

    .line 802
    .line 803
    if-eqz v3, :cond_38

    .line 804
    goto :goto_16

    .line 805
    .line 806
    .line 807
    :cond_38
    :goto_17
    invoke-direct {p1, p2, v1, v2, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 808
    return-object p1
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
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
.end method

.method public final setBorderWidth(Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V
    .locals 1
    .param p1    # Lcom/facebook/react/uimanager/style/LogicalEdge;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Float;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "edge"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderInsets;->edgeInsets:[Ljava/lang/Float;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    move-result p1

    .line 12
    .line 13
    aput-object p2, v0, p1

    .line 14
    return-void
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
.end method
