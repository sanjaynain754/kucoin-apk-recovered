.class public final Lx0/e;
.super Ljava/lang/Object;
.source "HardwareBitmapService.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lx0/e;",
        "",
        "<init>",
        "()V",
        "",
        "b",
        "Z",
        "IS_BLOCKED",
        "coil-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lx0/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 57

    .line 1
    .line 2
    new-instance v0, Lx0/e;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lx0/e;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lx0/e;->a:Lx0/e;

    .line 8
    .line 9
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v1, 0x1a

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eq v0, v1, :cond_2

    .line 15
    .line 16
    const/16 v1, 0x1b

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_0
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    .line 29
    :cond_1
    const-string/jumbo v55, "st18c10bnn"

    .line 30
    .line 31
    const-string v56, "TECNO-CA8"

    .line 32
    .line 33
    const-string v3, "mcv1s"

    .line 34
    .line 35
    const-string v4, "mcv3"

    .line 36
    .line 37
    const-string v5, "mcv5a"

    .line 38
    .line 39
    const-string v6, "mcv7a"

    .line 40
    .line 41
    const-string v7, "A30ATMO"

    .line 42
    .line 43
    const-string v8, "A70AXLTMO"

    .line 44
    .line 45
    const-string v9, "A3A_8_4G_TMO"

    .line 46
    .line 47
    const-string v10, "Edison_CKT"

    .line 48
    .line 49
    const-string v11, "EDISON_TF"

    .line 50
    .line 51
    const-string v12, "FERMI_TF"

    .line 52
    .line 53
    const-string v13, "U50A_ATT"

    .line 54
    .line 55
    const-string v14, "U50A_PLUS_ATT"

    .line 56
    .line 57
    const-string v15, "U50A_PLUS_TF"

    .line 58
    .line 59
    const-string v16, "U50APLUSTMO"

    .line 60
    .line 61
    const-string v17, "U5A_PLUS_4G"

    .line 62
    .line 63
    const-string v18, "RCT6513W87DK5e"

    .line 64
    .line 65
    const-string v19, "RCT6873W42BMF9A"

    .line 66
    .line 67
    const-string v20, "RCT6A03W13"

    .line 68
    .line 69
    const-string v21, "RCT6B03W12"

    .line 70
    .line 71
    const-string v22, "RCT6B03W13"

    .line 72
    .line 73
    const-string v23, "RCT6T06E13"

    .line 74
    .line 75
    const-string v24, "A3_Pro"

    .line 76
    .line 77
    const-string v25, "One"

    .line 78
    .line 79
    const-string v26, "One_Max"

    .line 80
    .line 81
    const-string v27, "One_Pro"

    .line 82
    .line 83
    const-string v28, "Z2"

    .line 84
    .line 85
    const-string v29, "Z2_PRO"

    .line 86
    .line 87
    const-string v30, "Armor_3"

    .line 88
    .line 89
    const-string v31, "Armor_6"

    .line 90
    .line 91
    const-string v32, "Blackview"

    .line 92
    .line 93
    const-string v33, "BV9500"

    .line 94
    .line 95
    const-string v34, "BV9500Pro"

    .line 96
    .line 97
    const-string v35, "A6L-C"

    .line 98
    .line 99
    const-string v36, "N5002LA"

    .line 100
    .line 101
    const-string v37, "N5501LA"

    .line 102
    .line 103
    const-string v38, "Power_2_Pro"

    .line 104
    .line 105
    const-string v39, "Power_5"

    .line 106
    .line 107
    const-string v40, "Z9"

    .line 108
    .line 109
    const-string v41, "V0310WW"

    .line 110
    .line 111
    const-string v42, "V0330WW"

    .line 112
    .line 113
    const-string v43, "A3"

    .line 114
    .line 115
    const-string v44, "ASUS_X018_4"

    .line 116
    .line 117
    const-string v45, "C210AE"

    .line 118
    .line 119
    const-string v46, "fireball"

    .line 120
    .line 121
    const-string v47, "ILA_X1"

    .line 122
    .line 123
    const-string v48, "Infinix-X605_sprout"

    .line 124
    .line 125
    const-string v49, "j7maxlte"

    .line 126
    .line 127
    const-string v50, "KING_KONG_3"

    .line 128
    .line 129
    const-string v51, "M10500"

    .line 130
    .line 131
    const-string v52, "S70"

    .line 132
    .line 133
    const-string v53, "S80Lite"

    .line 134
    .line 135
    const-string v54, "SGINO6"

    .line 136
    .line 137
    .line 138
    filled-new-array/range {v3 .. v56}, [Ljava/lang/String;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v0}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v2

    .line 144
    goto :goto_0

    .line 145
    .line 146
    :cond_2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 147
    .line 148
    if-nez v0, :cond_3

    .line 149
    goto :goto_0

    .line 150
    .line 151
    :cond_3
    const-string v1, "SAMSUNG-"

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 155
    move-result-object v0

    .line 156
    const/4 v1, 0x2

    .line 157
    const/4 v3, 0x0

    .line 158
    .line 159
    const-string v4, "SM-"

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v4, v2, v1, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 163
    move-result v0

    .line 164
    .line 165
    if-eqz v0, :cond_4

    .line 166
    const/4 v2, 0x1

    .line 167
    goto :goto_0

    .line 168
    .line 169
    :cond_4
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 170
    .line 171
    if-nez v0, :cond_5

    .line 172
    goto :goto_0

    .line 173
    .line 174
    :cond_5
    const-string v38, "manning"

    .line 175
    .line 176
    const-string v39, "N5702L"

    .line 177
    .line 178
    const-string v3, "nora"

    .line 179
    .line 180
    const-string v4, "nora_8917"

    .line 181
    .line 182
    const-string v5, "nora_8917_n"

    .line 183
    .line 184
    const-string v6, "james"

    .line 185
    .line 186
    .line 187
    const-string/jumbo v7, "rjames_f"

    .line 188
    .line 189
    .line 190
    const-string/jumbo v8, "rjames_go"

    .line 191
    .line 192
    .line 193
    const-string/jumbo v9, "pettyl"

    .line 194
    .line 195
    const-string v10, "hannah"

    .line 196
    .line 197
    const-string v11, "ahannah"

    .line 198
    .line 199
    .line 200
    const-string/jumbo v12, "rhannah"

    .line 201
    .line 202
    const-string v13, "ali"

    .line 203
    .line 204
    const-string v14, "ali_n"

    .line 205
    .line 206
    const-string v15, "aljeter"

    .line 207
    .line 208
    const-string v16, "aljeter_n"

    .line 209
    .line 210
    const-string v17, "jeter"

    .line 211
    .line 212
    const-string v18, "evert"

    .line 213
    .line 214
    const-string v19, "evert_n"

    .line 215
    .line 216
    const-string v20, "evert_nt"

    .line 217
    .line 218
    const-string v21, "G3112"

    .line 219
    .line 220
    const-string v22, "G3116"

    .line 221
    .line 222
    const-string v23, "G3121"

    .line 223
    .line 224
    const-string v24, "G3123"

    .line 225
    .line 226
    const-string v25, "G3125"

    .line 227
    .line 228
    const-string v26, "G3412"

    .line 229
    .line 230
    const-string v27, "G3416"

    .line 231
    .line 232
    const-string v28, "G3421"

    .line 233
    .line 234
    const-string v29, "G3423"

    .line 235
    .line 236
    const-string v30, "G3426"

    .line 237
    .line 238
    const-string v31, "G3212"

    .line 239
    .line 240
    const-string v32, "G3221"

    .line 241
    .line 242
    const-string v33, "G3223"

    .line 243
    .line 244
    const-string v34, "G3226"

    .line 245
    .line 246
    const-string v35, "BV6800Pro"

    .line 247
    .line 248
    const-string v36, "CatS41"

    .line 249
    .line 250
    const-string v37, "Hi9Pro"

    .line 251
    .line 252
    .line 253
    filled-new-array/range {v3 .. v39}, [Ljava/lang/String;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    .line 257
    invoke-static {v1, v0}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    move-result v2

    .line 259
    .line 260
    :goto_0
    sput-boolean v2, Lx0/e;->b:Z

    .line 261
    return-void
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
.end method
