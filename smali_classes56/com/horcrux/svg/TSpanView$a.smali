.class public synthetic Lcom/horcrux/svg/TSpanView$a;
.super Ljava/lang/Object;
.source "TSpanView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/horcrux/svg/TSpanView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->values()[Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sput-object v0, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    :try_start_0
    sget-object v2, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->baseline:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 16
    move-result v2

    .line 17
    .line 18
    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    :catch_0
    const/4 v0, 0x2

    .line 20
    .line 21
    :try_start_1
    sget-object v2, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 22
    .line 23
    sget-object v3, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 27
    move-result v3

    .line 28
    .line 29
    aput v0, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    .line 30
    :catch_1
    const/4 v2, 0x3

    .line 31
    .line 32
    :try_start_2
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 33
    .line 34
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->afterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 38
    move-result v4

    .line 39
    .line 40
    aput v2, v3, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 41
    .line 42
    :catch_2
    :try_start_3
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 43
    .line 44
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textAfterEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x4

    .line 50
    .line 51
    aput v5, v3, v4
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 52
    .line 53
    :catch_3
    :try_start_4
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 54
    .line 55
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->alphabetic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 59
    move-result v4

    .line 60
    const/4 v5, 0x5

    .line 61
    .line 62
    aput v5, v3, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 63
    .line 64
    :catch_4
    :try_start_5
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 65
    .line 66
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->ideographic:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x6

    .line 72
    .line 73
    aput v5, v3, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 74
    .line 75
    :catch_5
    :try_start_6
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 76
    .line 77
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->middle:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 81
    move-result v4

    .line 82
    const/4 v5, 0x7

    .line 83
    .line 84
    aput v5, v3, v4
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 85
    .line 86
    :catch_6
    :try_start_7
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 87
    .line 88
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->central:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 92
    move-result v4

    .line 93
    .line 94
    const/16 v5, 0x8

    .line 95
    .line 96
    aput v5, v3, v4
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 97
    .line 98
    :catch_7
    :try_start_8
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 99
    .line 100
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->mathematical:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 104
    move-result v4

    .line 105
    .line 106
    const/16 v5, 0x9

    .line 107
    .line 108
    aput v5, v3, v4
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 109
    .line 110
    :catch_8
    :try_start_9
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 111
    .line 112
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->hanging:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 116
    move-result v4

    .line 117
    .line 118
    const/16 v5, 0xa

    .line 119
    .line 120
    aput v5, v3, v4
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 121
    .line 122
    :catch_9
    :try_start_a
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 123
    .line 124
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textTop:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 128
    move-result v4

    .line 129
    .line 130
    const/16 v5, 0xb

    .line 131
    .line 132
    aput v5, v3, v4
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 133
    .line 134
    :catch_a
    :try_start_b
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 135
    .line 136
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->beforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 140
    move-result v4

    .line 141
    .line 142
    const/16 v5, 0xc

    .line 143
    .line 144
    aput v5, v3, v4
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 145
    .line 146
    :catch_b
    :try_start_c
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 147
    .line 148
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->textBeforeEdge:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 152
    move-result v4

    .line 153
    .line 154
    const/16 v5, 0xd

    .line 155
    .line 156
    aput v5, v3, v4
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 157
    .line 158
    :catch_c
    :try_start_d
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 159
    .line 160
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->bottom:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 164
    move-result v4

    .line 165
    .line 166
    const/16 v5, 0xe

    .line 167
    .line 168
    aput v5, v3, v4
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 169
    .line 170
    :catch_d
    :try_start_e
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 171
    .line 172
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->center:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 176
    move-result v4

    .line 177
    .line 178
    const/16 v5, 0xf

    .line 179
    .line 180
    aput v5, v3, v4
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 181
    .line 182
    :catch_e
    :try_start_f
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->c:[I

    .line 183
    .line 184
    sget-object v4, Lcom/horcrux/svg/TextProperties$AlignmentBaseline;->top:Lcom/horcrux/svg/TextProperties$AlignmentBaseline;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 188
    move-result v4

    .line 189
    .line 190
    const/16 v5, 0x10

    .line 191
    .line 192
    aput v5, v3, v4
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 193
    .line 194
    .line 195
    :catch_f
    invoke-static {}, Lcom/horcrux/svg/TextProperties$TextLengthAdjust;->values()[Lcom/horcrux/svg/TextProperties$TextLengthAdjust;

    .line 196
    move-result-object v3

    .line 197
    array-length v3, v3

    .line 198
    .line 199
    new-array v3, v3, [I

    .line 200
    .line 201
    sput-object v3, Lcom/horcrux/svg/TSpanView$a;->b:[I

    .line 202
    .line 203
    :try_start_10
    sget-object v4, Lcom/horcrux/svg/TextProperties$TextLengthAdjust;->spacing:Lcom/horcrux/svg/TextProperties$TextLengthAdjust;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 207
    move-result v4

    .line 208
    .line 209
    aput v1, v3, v4
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 210
    .line 211
    :catch_10
    :try_start_11
    sget-object v3, Lcom/horcrux/svg/TSpanView$a;->b:[I

    .line 212
    .line 213
    sget-object v4, Lcom/horcrux/svg/TextProperties$TextLengthAdjust;->spacingAndGlyphs:Lcom/horcrux/svg/TextProperties$TextLengthAdjust;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 217
    move-result v4

    .line 218
    .line 219
    aput v0, v3, v4
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    .line 220
    .line 221
    .line 222
    :catch_11
    invoke-static {}, Lcom/horcrux/svg/TextProperties$TextAnchor;->values()[Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 223
    move-result-object v3

    .line 224
    array-length v3, v3

    .line 225
    .line 226
    new-array v3, v3, [I

    .line 227
    .line 228
    sput-object v3, Lcom/horcrux/svg/TSpanView$a;->a:[I

    .line 229
    .line 230
    :try_start_12
    sget-object v4, Lcom/horcrux/svg/TextProperties$TextAnchor;->start:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 234
    move-result v4

    .line 235
    .line 236
    aput v1, v3, v4
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    .line 237
    .line 238
    :catch_12
    :try_start_13
    sget-object v1, Lcom/horcrux/svg/TSpanView$a;->a:[I

    .line 239
    .line 240
    sget-object v3, Lcom/horcrux/svg/TextProperties$TextAnchor;->middle:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 244
    move-result v3

    .line 245
    .line 246
    aput v0, v1, v3
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    .line 247
    .line 248
    :catch_13
    :try_start_14
    sget-object v0, Lcom/horcrux/svg/TSpanView$a;->a:[I

    .line 249
    .line 250
    sget-object v1, Lcom/horcrux/svg/TextProperties$TextAnchor;->end:Lcom/horcrux/svg/TextProperties$TextAnchor;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 254
    move-result v1

    .line 255
    .line 256
    aput v2, v0, v1
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    .line 257
    :catch_14
    return-void
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
.end method
