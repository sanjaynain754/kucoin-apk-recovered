.class public final Lcom/revolut/revolutpay/data/repository/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/revolut/revolutpay/data/repository/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revolut/revolutpay/data/repository/b$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/revolut/revolutpay/data/repository/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/util/Locale;",
            "Ljava/util/List<",
            "Lcom/revolut/revolutpay/ui/picker/model/a;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 49

    .line 1
    .line 2
    new-instance v0, Lcom/revolut/revolutpay/data/repository/b$a;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/revolut/revolutpay/data/repository/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/revolut/revolutpay/data/repository/b;->d:Lcom/revolut/revolutpay/data/repository/b$a;

    .line 9
    .line 10
    sget-object v0, Lcom/revolut/revolutpay/domain/model/CountryCode;->Companion:Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getAT()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getAU()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getBE()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getBG()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 42
    move-result-object v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getBR()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 50
    move-result-object v6

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getCA()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 58
    move-result-object v7

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getCH()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 66
    move-result-object v8

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getCY()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 74
    move-result-object v9

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getCZ()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 82
    move-result-object v10

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getDE()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 90
    move-result-object v11

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getDK()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 98
    move-result-object v12

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getEE()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 106
    move-result-object v13

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getES()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 110
    move-result-object v1

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 114
    move-result-object v14

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getFI()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 122
    move-result-object v15

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getFR()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 130
    move-result-object v16

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getGB()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 138
    move-result-object v17

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getGR()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 146
    move-result-object v18

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getHK()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 150
    move-result-object v1

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 154
    move-result-object v19

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getHR()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 158
    move-result-object v1

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 162
    move-result-object v20

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getHU()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 166
    move-result-object v1

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 170
    move-result-object v21

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getIE()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 178
    move-result-object v22

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getIN()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 182
    move-result-object v1

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 186
    move-result-object v23

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getIS()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 194
    move-result-object v24

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getIT()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 198
    move-result-object v1

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 202
    move-result-object v25

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getJP()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 206
    move-result-object v1

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 210
    move-result-object v26

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getKZ()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 214
    move-result-object v1

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 218
    move-result-object v27

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getLV()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 222
    move-result-object v1

    .line 223
    .line 224
    .line 225
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 226
    move-result-object v28

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getLI()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 230
    move-result-object v1

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 234
    move-result-object v29

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getLT()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 238
    move-result-object v1

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 242
    move-result-object v30

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getLU()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 246
    move-result-object v1

    .line 247
    .line 248
    .line 249
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 250
    move-result-object v31

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getMC()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 254
    move-result-object v1

    .line 255
    .line 256
    .line 257
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 258
    move-result-object v32

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getMO()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 262
    move-result-object v1

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 266
    move-result-object v33

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getMT()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 270
    move-result-object v1

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 274
    move-result-object v34

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getMX()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 278
    move-result-object v1

    .line 279
    .line 280
    .line 281
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 282
    move-result-object v35

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getNL()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 286
    move-result-object v1

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 290
    move-result-object v36

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getNO()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 298
    move-result-object v37

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getNZ()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 302
    move-result-object v1

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 306
    move-result-object v38

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getPL()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 314
    move-result-object v39

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getPT()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 318
    move-result-object v1

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 322
    move-result-object v40

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getRO()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 326
    move-result-object v1

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 330
    move-result-object v41

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getSE()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 334
    move-result-object v1

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 338
    move-result-object v42

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getSG()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 342
    move-result-object v1

    .line 343
    .line 344
    .line 345
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 346
    move-result-object v43

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getSI()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 350
    move-result-object v1

    .line 351
    .line 352
    .line 353
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 354
    move-result-object v44

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getSK()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 358
    move-result-object v1

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 362
    move-result-object v45

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getUA()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 366
    move-result-object v1

    .line 367
    .line 368
    .line 369
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 370
    move-result-object v46

    .line 371
    .line 372
    .line 373
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getUS()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 374
    move-result-object v1

    .line 375
    .line 376
    .line 377
    invoke-virtual {v1}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 378
    move-result-object v47

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode$Companion;->getVA()Lcom/revolut/revolutpay/domain/model/CountryCode;

    .line 382
    move-result-object v0

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Lcom/revolut/revolutpay/domain/model/CountryCode;->getValue()Ljava/lang/String;

    .line 386
    move-result-object v48

    .line 387
    .line 388
    .line 389
    filled-new-array/range {v2 .. v48}, [Ljava/lang/String;

    .line 390
    move-result-object v0

    .line 391
    .line 392
    .line 393
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    .line 394
    move-result-object v0

    .line 395
    .line 396
    sput-object v0, Lcom/revolut/revolutpay/data/repository/b;->e:Ljava/util/Set;

    .line 397
    return-void
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
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
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
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/revolut/revolutpay/data/repository/b;->a:Landroid/content/Context;

    .line 11
    .line 12
    new-instance p1, Landroid/util/LruCache;

    .line 13
    const/4 v0, 0x3

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, v0}, Landroid/util/LruCache;-><init>(I)V

    .line 17
    .line 18
    iput-object p1, p0, Lcom/revolut/revolutpay/data/repository/b;->b:Landroid/util/LruCache;

    .line 19
    .line 20
    new-instance p1, Lcom/revolut/revolutpay/data/repository/b$b;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1, p0}, Lcom/revolut/revolutpay/data/repository/b$b;-><init>(Lcom/revolut/revolutpay/data/repository/b;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/revolut/revolutpay/data/repository/b;->c:Lkotlin/Lazy;

    .line 30
    return-void
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
.end method

.method public static final synthetic a(Lcom/revolut/revolutpay/data/repository/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revolut/revolutpay/data/repository/b;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic c()Ljava/util/Set;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/revolut/revolutpay/data/repository/b;->e:Ljava/util/Set;

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
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revolut/revolutpay/ui/picker/model/a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/data/repository/b;->b:Landroid/util/LruCache;

    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/repository/b;->f()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/repository/b;->g()Ljava/util/List;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revolut/revolutpay/data/repository/b;->a:Landroid/content/Context;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "country_name_with_article."

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    const-string/jumbo v3, "this as java.lang.String).toLowerCase(Locale.ROOT)"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Lwa0/a;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p1

    .line 37
    :catch_0
    move-exception v0

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    const-string v2, "could not find "

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 60
    throw v0
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
.end method

.method public final d()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revolut/revolutpay/ui/picker/model/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/repository/b;->e()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 12
    move-result v2

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lkotlin/Pair;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    check-cast v3, Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    check-cast v2, Ljava/lang/String;

    .line 44
    .line 45
    new-instance v4, Lcom/revolut/revolutpay/ui/picker/model/a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v2}, Lcom/revolut/revolutpay/data/repository/b;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, v2, v5, v3}, Lcom/revolut/revolutpay/ui/picker/model/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    return-object v1
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/revolut/revolutpay/data/repository/b;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/List;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final f()Ljava/util/Locale;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcb0/a;->a:Lcb0/a;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/revolut/revolutpay/data/repository/b;->a:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcb0/a;->a(Landroid/content/Context;)Ljava/util/Locale;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final g()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/revolut/revolutpay/ui/picker/model/a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/repository/b;->f()Ljava/util/Locale;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/revolut/revolutpay/data/repository/b;->b:Landroid/util/LruCache;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Ljava/util/List;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/revolut/revolutpay/data/repository/b;->d()Ljava/util/List;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object v2, p0, Lcom/revolut/revolutpay/data/repository/b;->b:Landroid/util/LruCache;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v0, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    :cond_0
    return-object v1
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
.end method
