.class public final Ljumio/core/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljumio/core/A0;
.implements Ljava/io/Serializable;


# instance fields
.field public final a:Lcom/jumio/core/models/CountryDocumentModel;

.field public final b:Ljava/lang/String;

.field public final c:Ljumio/core/Q2;

.field public final d:Ljava/util/List;

.field public e:Lcom/jumio/core/data/country/Country;

.field public f:Lcom/jumio/core/data/document/PhysicalDocumentType;

.field public g:Lcom/jumio/core/data/document/DocumentVariant;

.field public h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

.field public final i:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/models/CountryDocumentModel;Ljava/lang/String;Ljumio/core/G0;Z)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "countryModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "countryForIp"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "credentialsDataModel"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    .line 21
    .line 22
    iput-object p2, p0, Ljumio/core/z0;->b:Ljava/lang/String;

    .line 23
    .line 24
    new-instance p2, Ljumio/core/Q2;

    .line 25
    .line 26
    iget-object v0, p3, Ljumio/core/G0;->i:Ljava/util/ArrayList;

    .line 27
    .line 28
    .line 29
    invoke-direct {p2, v0}, Ljumio/core/Q2;-><init>(Ljava/util/ArrayList;)V

    .line 30
    .line 31
    iput-object p2, p0, Ljumio/core/z0;->c:Ljumio/core/Q2;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 34
    const/4 p2, 0x0

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, v0, p2}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getCountriesFor(Ljava/util/List;Lcom/jumio/sdk/document/JumioDocumentVariant;)Ljava/util/List;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    iget-object v0, p3, Ljumio/core/G0;->h:Ljava/util/ArrayList;

    .line 41
    const/4 v1, 0x1

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 47
    move-result v0

    .line 48
    xor-int/2addr v0, v1

    .line 49
    .line 50
    if-ne v0, v1, :cond_2

    .line 51
    .line 52
    new-instance v0, Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    move-result v2

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    move-result-object v2

    .line 70
    move-object v3, v2

    .line 71
    .line 72
    check-cast v3, Lcom/jumio/core/data/country/Country;

    .line 73
    .line 74
    iget-object v4, p3, Ljumio/core/G0;->h:Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    .line 78
    move-result-object v3

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 82
    move-result v3

    .line 83
    .line 84
    if-eqz v3, :cond_0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    move-object p1, v0

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 93
    move-result v0

    .line 94
    const/4 v2, 0x0

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    iget-object p1, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    .line 99
    .line 100
    iget-object p1, p1, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 101
    .line 102
    .line 103
    invoke-interface {p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getCountries()Ljava/util/List;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    iget-object v0, p0, Ljumio/core/z0;->c:Ljumio/core/Q2;

    .line 111
    .line 112
    iput-boolean v2, v0, Ljumio/core/Q2;->b:Z

    .line 113
    .line 114
    .line 115
    :cond_3
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->sorted(Ljava/lang/Iterable;)Ljava/util/List;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    iput-object p1, p0, Ljumio/core/z0;->d:Ljava/util/List;

    .line 119
    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 122
    move-result v0

    .line 123
    .line 124
    if-ne v0, v1, :cond_4

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    check-cast v0, Lcom/jumio/core/data/country/Country;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    .line 138
    move-result-object v0

    .line 139
    .line 140
    if-eqz v0, :cond_4

    .line 141
    goto :goto_1

    .line 142
    :cond_4
    move-object p1, p2

    .line 143
    .line 144
    :goto_1
    if-eqz p1, :cond_5

    .line 145
    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 148
    move-result-object p1

    .line 149
    .line 150
    check-cast p1, Lcom/jumio/core/data/country/Country;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    .line 158
    move-result-object p1

    .line 159
    goto :goto_2

    .line 160
    :cond_5
    move-object p1, p2

    .line 161
    .line 162
    .line 163
    :goto_2
    const-string/jumbo v0, "skipDoctype"

    .line 164
    const/4 v3, 0x2

    .line 165
    .line 166
    if-eqz p1, :cond_d

    .line 167
    .line 168
    iget-object v4, p0, Ljumio/core/z0;->c:Ljumio/core/Q2;

    .line 169
    .line 170
    iget-boolean v5, v4, Ljumio/core/Q2;->b:Z

    .line 171
    .line 172
    if-eqz v5, :cond_6

    .line 173
    .line 174
    iget-object v4, v4, Ljumio/core/Q2;->a:Ljava/util/ArrayList;

    .line 175
    goto :goto_3

    .line 176
    :cond_6
    move-object v4, p2

    .line 177
    .line 178
    :goto_3
    if-eqz v4, :cond_8

    .line 179
    .line 180
    .line 181
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 182
    move-result v4

    .line 183
    .line 184
    if-eqz v4, :cond_7

    .line 185
    goto :goto_4

    .line 186
    :cond_7
    move v4, v2

    .line 187
    goto :goto_5

    .line 188
    :cond_8
    :goto_4
    move v4, v1

    .line 189
    .line 190
    .line 191
    :goto_5
    invoke-static {p0, p1}, Ljumio/core/z0;->a(Ljumio/core/z0;Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    .line 192
    move-result-object v5

    .line 193
    .line 194
    iget-object v6, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    const-string v7, "country"

    .line 200
    .line 201
    .line 202
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    .line 204
    iget-object v6, v6, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 205
    .line 206
    .line 207
    invoke-interface {v6, p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getDigitalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    .line 208
    move-result-object v6

    .line 209
    move-object v7, v5

    .line 210
    .line 211
    check-cast v7, Ljava/util/ArrayList;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 215
    move-result v7

    .line 216
    .line 217
    if-gt v7, v1, :cond_c

    .line 218
    .line 219
    if-eqz v4, :cond_9

    .line 220
    .line 221
    .line 222
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    move-result v4

    .line 224
    .line 225
    if-nez v4, :cond_9

    .line 226
    goto :goto_7

    .line 227
    .line 228
    .line 229
    :cond_9
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 230
    move-result-object v4

    .line 231
    .line 232
    check-cast v4, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getVariants()Ljava/util/List;

    .line 236
    move-result-object v5

    .line 237
    .line 238
    .line 239
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 240
    move-result v5

    .line 241
    .line 242
    if-ne v5, v1, :cond_a

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getVariants()Ljava/util/List;

    .line 246
    move-result-object v5

    .line 247
    .line 248
    .line 249
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 250
    move-result-object v5

    .line 251
    .line 252
    check-cast v5, Lcom/jumio/core/data/document/DocumentVariant;

    .line 253
    goto :goto_6

    .line 254
    :cond_a
    move-object v5, p2

    .line 255
    .line 256
    :goto_6
    iget-boolean v6, p0, Ljumio/core/z0;->i:Z

    .line 257
    .line 258
    if-nez v6, :cond_b

    .line 259
    .line 260
    sget-object v6, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 261
    .line 262
    .line 263
    invoke-static {v0, p2, v3, p2}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 264
    move-result-object v7

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6, v7}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 268
    .line 269
    iput-boolean v1, p0, Ljumio/core/z0;->i:Z

    .line 270
    .line 271
    :cond_b
    new-instance v6, Lkotlin/Pair;

    .line 272
    .line 273
    .line 274
    invoke-direct {v6, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 275
    goto :goto_8

    .line 276
    .line 277
    :cond_c
    :goto_7
    new-instance v6, Lkotlin/Pair;

    .line 278
    .line 279
    .line 280
    invoke-direct {v6, p2, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :goto_8
    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 284
    move-result-object v4

    .line 285
    .line 286
    check-cast v4, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 290
    move-result-object v5

    .line 291
    .line 292
    check-cast v5, Lcom/jumio/core/data/document/DocumentVariant;

    .line 293
    .line 294
    iput-object v4, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 295
    .line 296
    iput-object v5, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 297
    goto :goto_9

    .line 298
    :cond_d
    move-object p1, p2

    .line 299
    .line 300
    :goto_9
    iput-object p1, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 301
    .line 302
    if-eqz p4, :cond_14

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0}, Ljumio/core/z0;->a()Ljava/util/Map;

    .line 306
    move-result-object p1

    .line 307
    .line 308
    .line 309
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 310
    move-result p1

    .line 311
    .line 312
    if-nez p1, :cond_12

    .line 313
    .line 314
    .line 315
    invoke-virtual {p0}, Ljumio/core/z0;->a()Ljava/util/Map;

    .line 316
    move-result-object p1

    .line 317
    .line 318
    .line 319
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 320
    move-result p4

    .line 321
    .line 322
    if-eqz p4, :cond_e

    .line 323
    goto :goto_c

    .line 324
    .line 325
    .line 326
    :cond_e
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 327
    move-result-object p1

    .line 328
    .line 329
    .line 330
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 331
    move-result-object p1

    .line 332
    .line 333
    .line 334
    :cond_f
    :goto_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    move-result p4

    .line 336
    .line 337
    if-eqz p4, :cond_11

    .line 338
    .line 339
    .line 340
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    move-result-object p4

    .line 342
    .line 343
    check-cast p4, Ljava/util/Map$Entry;

    .line 344
    .line 345
    .line 346
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 347
    move-result-object p4

    .line 348
    .line 349
    check-cast p4, Ljava/lang/Iterable;

    .line 350
    .line 351
    instance-of v4, p4, Ljava/util/Collection;

    .line 352
    .line 353
    if-eqz v4, :cond_10

    .line 354
    move-object v4, p4

    .line 355
    .line 356
    check-cast v4, Ljava/util/Collection;

    .line 357
    .line 358
    .line 359
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 360
    move-result v4

    .line 361
    .line 362
    if-eqz v4, :cond_10

    .line 363
    goto :goto_a

    .line 364
    .line 365
    .line 366
    :cond_10
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 367
    move-result-object p4

    .line 368
    .line 369
    .line 370
    :goto_b
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    move-result v4

    .line 372
    .line 373
    if-eqz v4, :cond_f

    .line 374
    .line 375
    .line 376
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    move-result-object v4

    .line 378
    .line 379
    check-cast v4, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    .line 380
    .line 381
    .line 382
    invoke-virtual {v4}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getParts()Ljava/util/List;

    .line 383
    move-result-object v5

    .line 384
    .line 385
    .line 386
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 387
    move-result v5

    .line 388
    .line 389
    if-ne v5, v1, :cond_12

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getParts()Ljava/util/List;

    .line 393
    move-result-object v4

    .line 394
    .line 395
    sget-object v5, Lcom/jumio/sdk/enums/JumioCredentialPart;->FRONT:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 396
    .line 397
    .line 398
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 399
    move-result v4

    .line 400
    .line 401
    if-eqz v4, :cond_12

    .line 402
    goto :goto_b

    .line 403
    .line 404
    :cond_11
    :goto_c
    sget-object p1, Ljumio/core/B0;->b:Ljava/util/List;

    .line 405
    .line 406
    sget-object p4, Ljumio/core/B0;->c:Lcom/jumio/core/data/document/DocumentFormat;

    .line 407
    .line 408
    sget-object v4, Ljumio/core/B0;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 409
    goto :goto_d

    .line 410
    .line 411
    :cond_12
    sget-object p1, Ljumio/core/B0;->e:Ljava/util/List;

    .line 412
    .line 413
    sget-object p4, Ljumio/core/B0;->f:Lcom/jumio/core/data/document/DocumentFormat;

    .line 414
    .line 415
    sget-object v4, Ljumio/core/B0;->d:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 416
    .line 417
    :goto_d
    sget-object v5, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    .line 418
    .line 419
    sget-object v6, Lcom/jumio/core/data/ScanMode;->MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 420
    .line 421
    .line 422
    filled-new-array {v5, v6}, [Lcom/jumio/core/data/ScanMode;

    .line 423
    move-result-object v5

    .line 424
    .line 425
    .line 426
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 427
    move-result-object v5

    .line 428
    .line 429
    sget-object v6, Ljumio/core/B0;->g:Lcom/jumio/sdk/document/JumioDocumentVariant;

    .line 430
    .line 431
    new-instance v7, Ljava/util/ArrayList;

    .line 432
    .line 433
    const/16 v8, 0xa

    .line 434
    .line 435
    .line 436
    invoke-static {p1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 437
    move-result v8

    .line 438
    .line 439
    .line 440
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 444
    move-result-object p1

    .line 445
    .line 446
    .line 447
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    move-result v8

    .line 449
    .line 450
    if-eqz v8, :cond_13

    .line 451
    .line 452
    .line 453
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    move-result-object v8

    .line 455
    .line 456
    check-cast v8, Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 457
    .line 458
    new-instance v9, Lcom/jumio/core/data/document/DocumentPart;

    .line 459
    .line 460
    .line 461
    invoke-direct {v9, v8, v5}, Lcom/jumio/core/data/document/DocumentPart;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Ljava/util/List;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 465
    goto :goto_e

    .line 466
    .line 467
    :cond_13
    new-instance p1, Lcom/jumio/core/data/document/DocumentVariant;

    .line 468
    .line 469
    .line 470
    invoke-direct {p1, v6, v7, p4}, Lcom/jumio/core/data/document/DocumentVariant;-><init>(Lcom/jumio/sdk/document/JumioDocumentVariant;Ljava/util/List;Lcom/jumio/core/data/document/DocumentFormat;)V

    .line 471
    .line 472
    iput-object p1, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 473
    .line 474
    new-instance p4, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 475
    .line 476
    .line 477
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 478
    move-result-object p1

    .line 479
    .line 480
    .line 481
    invoke-direct {p4, v4, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;-><init>(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/util/List;)V

    .line 482
    .line 483
    iput-object p4, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 484
    .line 485
    new-instance p1, Lcom/jumio/core/data/country/Country;

    .line 486
    .line 487
    const-string p4, "USA"

    .line 488
    .line 489
    .line 490
    invoke-direct {p1, p4, v2, v3, p2}, Lcom/jumio/core/data/country/Country;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 491
    .line 492
    iput-object p1, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 493
    .line 494
    iget-boolean p1, p0, Ljumio/core/z0;->i:Z

    .line 495
    .line 496
    if-nez p1, :cond_14

    .line 497
    .line 498
    sget-object p1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 499
    .line 500
    .line 501
    invoke-static {v0, p2, v3, p2}, Lcom/jumio/analytics/MobileEvents;->misc$default(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 502
    move-result-object p2

    .line 503
    .line 504
    .line 505
    invoke-virtual {p1, p2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 506
    .line 507
    iput-boolean v1, p0, Ljumio/core/z0;->i:Z

    .line 508
    .line 509
    :cond_14
    iget-object p1, p3, Ljumio/core/G0;->k:Ljava/lang/String;

    .line 510
    .line 511
    iget-object p2, p3, Ljumio/core/G0;->l:Lcom/jumio/sdk/document/JumioDocument;

    .line 512
    .line 513
    if-nez p1, :cond_15

    .line 514
    goto :goto_f

    .line 515
    .line 516
    :cond_15
    instance-of p3, p2, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    .line 517
    .line 518
    if-eqz p3, :cond_16

    .line 519
    .line 520
    check-cast p2, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p0, p1, p2}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioPhysicalDocument;)V

    .line 524
    return-void

    .line 525
    .line 526
    :cond_16
    instance-of p3, p2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    .line 527
    .line 528
    if-eqz p3, :cond_17

    .line 529
    .line 530
    check-cast p2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    .line 531
    .line 532
    .line 533
    invoke-virtual {p0, p1, p2}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDigitalDocument;)V

    .line 534
    :cond_17
    :goto_f
    return-void
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
.end method

.method public static a(Ljumio/core/z0;Lcom/jumio/core/data/country/Country;)Ljava/util/List;
    .locals 6

    .line 70
    iget-object v0, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    const-string v1, "country"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, v0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    invoke-interface {v0, p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getPhysicalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    .line 74
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 75
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 76
    iget-object v3, p0, Ljumio/core/z0;->c:Ljumio/core/Q2;

    invoke-virtual {v2}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v2

    .line 77
    const-string/jumbo v4, "type"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-boolean v4, v3, Ljumio/core/Q2;->b:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    iget-object v4, v3, Ljumio/core/Q2;->a:Ljava/util/ArrayList;

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_4

    .line 79
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    .line 80
    :cond_2
    iget-boolean v4, v3, Ljumio/core/Q2;->b:Z

    if-eqz v4, :cond_3

    iget-object v5, v3, Ljumio/core/Q2;->a:Ljava/util/ArrayList;

    :cond_3
    if-eqz v5, :cond_0

    .line 81
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 82
    :cond_4
    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;
    .locals 4

    .line 23
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 24
    :cond_0
    iget-object v0, p0, Ljumio/core/z0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/jumio/core/data/country/Country;

    invoke-virtual {v3}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    :cond_2
    check-cast v1, Lcom/jumio/core/data/country/Country;

    return-object v1
.end method

.method public final a(Lcom/jumio/core/data/country/Country;)Ljava/util/ArrayList;
    .locals 10

    .line 48
    invoke-static {p0, p1}, Ljumio/core/z0;->a(Ljumio/core/z0;Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 51
    check-cast v1, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 52
    invoke-virtual {v1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getVariants()Ljava/util/List;

    move-result-object v2

    .line 53
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 54
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/jumio/core/data/document/DocumentVariant;

    .line 55
    invoke-virtual {v5}, Lcom/jumio/core/data/document/DocumentVariant;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object v5

    .line 56
    const-string/jumbo v6, "variant"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 58
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 60
    check-cast v5, Lcom/jumio/core/data/document/DocumentVariant;

    .line 61
    invoke-virtual {v1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v6

    invoke-virtual {v5}, Lcom/jumio/core/data/document/DocumentVariant;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object v7

    invoke-virtual {v5}, Lcom/jumio/core/data/document/DocumentVariant;->getParts()Ljava/util/List;

    move-result-object v5

    .line 62
    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 64
    check-cast v9, Lcom/jumio/core/data/document/DocumentPart;

    .line 65
    invoke-virtual {v9}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v9

    .line 66
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 67
    :cond_1
    new-instance v5, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    invoke-direct {v5, v6, v7, v8}, Lcom/jumio/sdk/document/JumioPhysicalDocument;-><init>(Lcom/jumio/sdk/document/JumioDocumentType;Lcom/jumio/sdk/document/JumioDocumentVariant;Ljava/util/List;)V

    .line 68
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 69
    :cond_2
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto/16 :goto_0

    :cond_3
    return-object v0
.end method

.method public final a()Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    iget-object v1, p0, Ljumio/core/z0;->d:Ljava/util/List;

    .line 3
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/data/country/Country;

    .line 4
    invoke-virtual {p0, v2}, Ljumio/core/z0;->a(Lcom/jumio/core/data/country/Country;)Ljava/util/ArrayList;

    move-result-object v3

    .line 5
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    .line 6
    invoke-virtual {v2}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    const-string/jumbo v1, "unmodifiableMap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDigitalDocument;)V
    .locals 4

    const-string v0, "isoCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "digitalDocument"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 26
    iput-object p1, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 27
    iget-object v0, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    const-string v1, "country"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, v0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    invoke-interface {v0, p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getDigitalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 31
    invoke-virtual {v2}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioDigitalDocument;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 32
    :goto_0
    check-cast v0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    if-eqz v0, :cond_2

    .line 33
    iput-object v1, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 34
    iput-object v1, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 35
    iput-object v0, p0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    return-void

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported digital document"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 37
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported country code"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioPhysicalDocument;)V
    .locals 4

    const-string v0, "isoCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "document"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-virtual {p0, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 39
    iput-object p1, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 40
    invoke-static {p0, p1}, Ljumio/core/z0;->a(Ljumio/core/z0;Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/jumio/core/data/document/PhysicalDocumentType;

    invoke-virtual {v2}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v3

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Lcom/jumio/core/data/document/PhysicalDocumentType;

    if-eqz v0, :cond_3

    .line 41
    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->hasVariant(Lcom/jumio/sdk/document/JumioDocumentVariant;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 42
    iput-object v1, p0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 43
    iput-object v0, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 44
    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getVariant(Lcom/jumio/sdk/document/JumioDocumentVariant;)Lcom/jumio/core/data/document/DocumentVariant;

    move-result-object p1

    iput-object p1, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    return-void

    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported document variant"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 46
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported document type"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 47
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Unsupported country code"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)Z
    .locals 4

    const-string v0, "isoCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "document"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 9
    :cond_0
    instance-of v1, p2, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    if-eqz v1, :cond_4

    .line 10
    check-cast p2, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    .line 11
    invoke-static {p0, p1}, Ljumio/core/z0;->a(Ljumio/core/z0;Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 12
    invoke-virtual {v2}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v2

    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v3

    if-ne v2, v3, :cond_1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 13
    :goto_0
    check-cast v1, Lcom/jumio/core/data/document/PhysicalDocumentType;

    if-nez v1, :cond_3

    return v0

    .line 14
    :cond_3
    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/jumio/core/data/document/PhysicalDocumentType;->hasVariant(Lcom/jumio/sdk/document/JumioDocumentVariant;)Z

    move-result p1

    return p1

    .line 15
    :cond_4
    instance-of v1, p2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    if-eqz v1, :cond_7

    .line 16
    check-cast p2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    .line 17
    iget-object v1, p0, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    const-string v2, "country"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v1, v1, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    invoke-interface {v1, p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getDigitalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 20
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    return v0

    .line 21
    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 22
    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jumio/sdk/document/JumioDigitalDocument;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 p1, 0x1

    return p1

    :cond_7
    return v0
.end method

.method public final b()Lcom/jumio/core/models/SelectionModel;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljumio/core/z0;->c()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-object v1

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v2, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    iget-object v3, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 19
    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    new-instance v1, Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1, v0, v2, v3}, Lcom/jumio/core/models/PhysicalSelectionModel;-><init>(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/document/PhysicalDocumentType;Lcom/jumio/core/data/document/DocumentVariant;)V

    .line 26
    return-object v1

    .line 27
    .line 28
    :cond_1
    iget-object v2, p0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    new-instance v1, Lcom/jumio/core/models/DigitalSelectionModel;

    .line 33
    .line 34
    .line 35
    invoke-direct {v1, v0, v2}, Lcom/jumio/core/models/DigitalSelectionModel;-><init>(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;)V

    .line 36
    :cond_2
    return-object v1
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
.end method

.method public final c()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 3
    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-object v0, p0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    :cond_1
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_2
    const/4 v0, 0x0

    .line 20
    return v0
    .line 21
.end method
