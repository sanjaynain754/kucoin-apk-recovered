.class public synthetic Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;
.super Ljava/lang/Object;
.source "IPlatformNumberFormatter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/IPlatformNumberFormatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1009
    name = null
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I

.field public static final synthetic c:[I

.field public static final synthetic d:[I

.field public static final synthetic e:[I

.field public static final synthetic f:[I

.field public static final synthetic g:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;

    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    sput-object v0, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->g:[I

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    :try_start_0
    sget-object v2, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;->ACCOUNTING:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;

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
    sget-object v2, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->g:[I

    .line 22
    .line 23
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;->STANDARD:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencySign;

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
    .line 31
    .line 32
    :catch_1
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;

    .line 33
    move-result-object v2

    .line 34
    array-length v2, v2

    .line 35
    .line 36
    new-array v2, v2, [I

    .line 37
    .line 38
    sput-object v2, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->f:[I

    .line 39
    .line 40
    :try_start_2
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;->SYMBOL:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 44
    move-result v3

    .line 45
    .line 46
    aput v1, v2, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    .line 47
    .line 48
    :catch_2
    :try_start_3
    sget-object v2, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->f:[I

    .line 49
    .line 50
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;->NARROWSYMBOL:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 54
    move-result v3

    .line 55
    .line 56
    aput v0, v2, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 57
    :catch_3
    const/4 v2, 0x3

    .line 58
    .line 59
    :try_start_4
    sget-object v3, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->f:[I

    .line 60
    .line 61
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;->CODE:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 65
    move-result v4

    .line 66
    .line 67
    aput v2, v3, v4
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    .line 68
    :catch_4
    const/4 v3, 0x4

    .line 69
    .line 70
    :try_start_5
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->f:[I

    .line 71
    .line 72
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;->NAME:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CurrencyDisplay;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 76
    move-result v5

    .line 77
    .line 78
    aput v3, v4, v5
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    .line 79
    .line 80
    .line 81
    :catch_5
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;

    .line 82
    move-result-object v4

    .line 83
    array-length v4, v4

    .line 84
    .line 85
    new-array v4, v4, [I

    .line 86
    .line 87
    sput-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->e:[I

    .line 88
    .line 89
    :try_start_6
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;->SHORT:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 93
    move-result v5

    .line 94
    .line 95
    aput v1, v4, v5
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    .line 96
    .line 97
    :catch_6
    :try_start_7
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->e:[I

    .line 98
    .line 99
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;->NARROW:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 103
    move-result v5

    .line 104
    .line 105
    aput v0, v4, v5
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    .line 106
    .line 107
    :catch_7
    :try_start_8
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->e:[I

    .line 108
    .line 109
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;->LONG:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$UnitDisplay;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 113
    move-result v5

    .line 114
    .line 115
    aput v2, v4, v5
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    .line 116
    .line 117
    .line 118
    :catch_8
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;

    .line 119
    move-result-object v4

    .line 120
    array-length v4, v4

    .line 121
    .line 122
    new-array v4, v4, [I

    .line 123
    .line 124
    sput-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->d:[I

    .line 125
    .line 126
    :try_start_9
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;->AUTO:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 130
    move-result v5

    .line 131
    .line 132
    aput v1, v4, v5
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    .line 133
    .line 134
    :catch_9
    :try_start_a
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->d:[I

    .line 135
    .line 136
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;->ALWAYS:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 140
    move-result v5

    .line 141
    .line 142
    aput v0, v4, v5
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    .line 143
    .line 144
    :catch_a
    :try_start_b
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->d:[I

    .line 145
    .line 146
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;->NEVER:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 150
    move-result v5

    .line 151
    .line 152
    aput v2, v4, v5
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    .line 153
    .line 154
    :catch_b
    :try_start_c
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->d:[I

    .line 155
    .line 156
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;->EXCEPTZERO:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$SignDisplay;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 160
    move-result v5

    .line 161
    .line 162
    aput v3, v4, v5
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    .line 163
    .line 164
    .line 165
    :catch_c
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;

    .line 166
    move-result-object v4

    .line 167
    array-length v4, v4

    .line 168
    .line 169
    new-array v4, v4, [I

    .line 170
    .line 171
    sput-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->c:[I

    .line 172
    .line 173
    :try_start_d
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;->SHORT:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 177
    move-result v5

    .line 178
    .line 179
    aput v1, v4, v5
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    .line 180
    .line 181
    :catch_d
    :try_start_e
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->c:[I

    .line 182
    .line 183
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;->LONG:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$CompactDisplay;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 187
    move-result v5

    .line 188
    .line 189
    aput v0, v4, v5
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    .line 190
    .line 191
    .line 192
    :catch_e
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;

    .line 193
    move-result-object v4

    .line 194
    array-length v4, v4

    .line 195
    .line 196
    new-array v4, v4, [I

    .line 197
    .line 198
    sput-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->b:[I

    .line 199
    .line 200
    :try_start_f
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;->STANDARD:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 204
    move-result v5

    .line 205
    .line 206
    aput v1, v4, v5
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    .line 207
    .line 208
    :catch_f
    :try_start_10
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->b:[I

    .line 209
    .line 210
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;->SCIENTIFIC:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 214
    move-result v5

    .line 215
    .line 216
    aput v0, v4, v5
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    .line 217
    .line 218
    :catch_10
    :try_start_11
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->b:[I

    .line 219
    .line 220
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;->ENGINEERING:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 224
    move-result v5

    .line 225
    .line 226
    aput v2, v4, v5
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    .line 227
    .line 228
    :catch_11
    :try_start_12
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->b:[I

    .line 229
    .line 230
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;->COMPACT:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Notation;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 234
    move-result v5

    .line 235
    .line 236
    aput v3, v4, v5
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    .line 237
    .line 238
    .line 239
    :catch_12
    invoke-static {}, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;->values()[Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;

    .line 240
    move-result-object v4

    .line 241
    array-length v4, v4

    .line 242
    .line 243
    new-array v4, v4, [I

    .line 244
    .line 245
    sput-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->a:[I

    .line 246
    .line 247
    :try_start_13
    sget-object v5, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;->DECIMAL:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 251
    move-result v5

    .line 252
    .line 253
    aput v1, v4, v5
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    .line 254
    .line 255
    :catch_13
    :try_start_14
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->a:[I

    .line 256
    .line 257
    sget-object v4, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;->PERCENT:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 261
    move-result v4

    .line 262
    .line 263
    aput v0, v1, v4
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    .line 264
    .line 265
    :catch_14
    :try_start_15
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->a:[I

    .line 266
    .line 267
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;->CURRENCY:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 271
    move-result v1

    .line 272
    .line 273
    aput v2, v0, v1
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    .line 274
    .line 275
    :catch_15
    :try_start_16
    sget-object v0, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$a;->a:[I

    .line 276
    .line 277
    sget-object v1, Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;->UNIT:Lcom/facebook/hermes/intl/IPlatformNumberFormatter$Style;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 281
    move-result v1

    .line 282
    .line 283
    aput v3, v0, v1
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    .line 284
    :catch_16
    return-void
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
.end method
