.class Lcom/facebook/hermes/intl/UnicodeExtensionKeys$6;
.super Ljava/util/HashMap;
.source "UnicodeExtensionKeys.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/hermes/intl/UnicodeExtensionKeys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "[",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 67

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v65, "wara"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v66, "wcho"

    .line 12
    .line 13
    const-string v1, "adlm"

    .line 14
    .line 15
    const-string v2, "ahom"

    .line 16
    .line 17
    const-string v3, "arab"

    .line 18
    .line 19
    const-string v4, "arabext"

    .line 20
    .line 21
    const-string v5, "bali"

    .line 22
    .line 23
    const-string v6, "beng"

    .line 24
    .line 25
    const-string v7, "bhks"

    .line 26
    .line 27
    const-string v8, "brah"

    .line 28
    .line 29
    const-string v9, "cakm"

    .line 30
    .line 31
    const-string v10, "cham"

    .line 32
    .line 33
    const-string v11, "deva"

    .line 34
    .line 35
    const-string v12, "diak"

    .line 36
    .line 37
    const-string v13, "fullwide"

    .line 38
    .line 39
    const-string v14, "gong"

    .line 40
    .line 41
    const-string v15, "gonm"

    .line 42
    .line 43
    const-string v16, "gujr"

    .line 44
    .line 45
    const-string v17, "guru"

    .line 46
    .line 47
    const-string v18, "hanidec"

    .line 48
    .line 49
    const-string v19, "hmng"

    .line 50
    .line 51
    const-string v20, "hmnp"

    .line 52
    .line 53
    const-string v21, "java"

    .line 54
    .line 55
    const-string v22, "kali"

    .line 56
    .line 57
    const-string v23, "khmr"

    .line 58
    .line 59
    const-string v24, "knda"

    .line 60
    .line 61
    const-string v25, "lana"

    .line 62
    .line 63
    const-string v26, "lanatham"

    .line 64
    .line 65
    const-string v27, "laoo"

    .line 66
    .line 67
    const-string v28, "latn"

    .line 68
    .line 69
    const-string v29, "lepc"

    .line 70
    .line 71
    const-string v30, "limb"

    .line 72
    .line 73
    const-string v31, "mathbold"

    .line 74
    .line 75
    const-string v32, "mathdbl"

    .line 76
    .line 77
    const-string v33, "mathmono"

    .line 78
    .line 79
    const-string v34, "mathsanb"

    .line 80
    .line 81
    const-string v35, "mathsans"

    .line 82
    .line 83
    const-string v36, "mlym"

    .line 84
    .line 85
    const-string v37, "modi"

    .line 86
    .line 87
    const-string v38, "mong"

    .line 88
    .line 89
    const-string v39, "mroo"

    .line 90
    .line 91
    const-string v40, "mtei"

    .line 92
    .line 93
    const-string v41, "mymr"

    .line 94
    .line 95
    const-string v42, "mymrshan"

    .line 96
    .line 97
    const-string v43, "mymrtlng"

    .line 98
    .line 99
    const-string v44, "newa"

    .line 100
    .line 101
    const-string v45, "nkoo"

    .line 102
    .line 103
    const-string v46, "olck"

    .line 104
    .line 105
    .line 106
    const-string/jumbo v47, "orya"

    .line 107
    .line 108
    .line 109
    const-string/jumbo v48, "osma"

    .line 110
    .line 111
    .line 112
    const-string/jumbo v49, "rohg"

    .line 113
    .line 114
    .line 115
    const-string/jumbo v50, "saur"

    .line 116
    .line 117
    .line 118
    const-string/jumbo v51, "segment"

    .line 119
    .line 120
    .line 121
    const-string/jumbo v52, "shrd"

    .line 122
    .line 123
    .line 124
    const-string/jumbo v53, "sind"

    .line 125
    .line 126
    .line 127
    const-string/jumbo v54, "sinh"

    .line 128
    .line 129
    .line 130
    const-string/jumbo v55, "sora"

    .line 131
    .line 132
    .line 133
    const-string/jumbo v56, "sund"

    .line 134
    .line 135
    .line 136
    const-string/jumbo v57, "takr"

    .line 137
    .line 138
    .line 139
    const-string/jumbo v58, "talu"

    .line 140
    .line 141
    .line 142
    const-string/jumbo v59, "tamldec"

    .line 143
    .line 144
    .line 145
    const-string/jumbo v60, "telu"

    .line 146
    .line 147
    .line 148
    const-string/jumbo v61, "thai"

    .line 149
    .line 150
    .line 151
    const-string/jumbo v62, "tibt"

    .line 152
    .line 153
    .line 154
    const-string/jumbo v63, "tirh"

    .line 155
    .line 156
    .line 157
    const-string/jumbo v64, "vaii"

    .line 158
    .line 159
    .line 160
    filled-new-array/range {v1 .. v66}, [Ljava/lang/String;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    const-string v2, "nu"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    const-string/jumbo v18, "unihan"

    .line 170
    .line 171
    .line 172
    const-string/jumbo v19, "zhuyin"

    .line 173
    .line 174
    const-string v3, "big5han"

    .line 175
    .line 176
    const-string v4, "compat"

    .line 177
    .line 178
    const-string v5, "dict"

    .line 179
    .line 180
    const-string v6, "direct"

    .line 181
    .line 182
    const-string v7, "ducet"

    .line 183
    .line 184
    const-string v8, "emoji"

    .line 185
    .line 186
    const-string v9, "eor"

    .line 187
    .line 188
    const-string v10, "gb2312"

    .line 189
    .line 190
    .line 191
    const-string/jumbo v11, "phonebk"

    .line 192
    .line 193
    .line 194
    const-string/jumbo v12, "phonetic"

    .line 195
    .line 196
    .line 197
    const-string/jumbo v13, "pinyin"

    .line 198
    .line 199
    .line 200
    const-string/jumbo v14, "reformed"

    .line 201
    .line 202
    .line 203
    const-string/jumbo v15, "searchjl"

    .line 204
    .line 205
    .line 206
    const-string/jumbo v16, "stroke"

    .line 207
    .line 208
    .line 209
    const-string/jumbo v17, "trad"

    .line 210
    .line 211
    .line 212
    filled-new-array/range {v3 .. v19}, [Ljava/lang/String;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    const-string v2, "co"

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    const-string/jumbo v19, "persian"

    .line 222
    .line 223
    .line 224
    const-string/jumbo v20, "roc"

    .line 225
    .line 226
    const-string v3, "buddhist"

    .line 227
    .line 228
    const-string v4, "chinese"

    .line 229
    .line 230
    const-string v5, "coptic"

    .line 231
    .line 232
    const-string v6, "dangi"

    .line 233
    .line 234
    const-string v7, "ethioaa"

    .line 235
    .line 236
    const-string v8, "ethiopic"

    .line 237
    .line 238
    const-string v9, "gregory"

    .line 239
    .line 240
    const-string v10, "hebrew"

    .line 241
    .line 242
    const-string v11, "indian"

    .line 243
    .line 244
    const-string v12, "islamic"

    .line 245
    .line 246
    const-string v13, "islamic-umalqura"

    .line 247
    .line 248
    const-string v14, "islamic-tbla"

    .line 249
    .line 250
    const-string v15, "islamic-civil"

    .line 251
    .line 252
    const-string v16, "islamic-rgsa"

    .line 253
    .line 254
    const-string v17, "iso8601"

    .line 255
    .line 256
    const-string v18, "japanese"

    .line 257
    .line 258
    .line 259
    filled-new-array/range {v3 .. v20}, [Ljava/lang/String;

    .line 260
    move-result-object v1

    .line 261
    .line 262
    const-string v2, "ca"

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    return-void
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
