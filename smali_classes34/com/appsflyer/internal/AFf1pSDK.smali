.class public final Lcom/appsflyer/internal/AFf1pSDK;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AFAdRevenueData:I = 0x0

.field private static areAllFieldsValid:I = 0x1

.field private static getCurrencyIso4217Code:Z

.field private static getMediationNetwork:I

.field private static getMonetizationNetwork:[C

.field private static getRevenue:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/appsflyer/internal/AFf1pSDK;->getCurrencyIso4217Code()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 9
    .line 10
    sget v0, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x4b

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    .line 17
    return-void
    .line 18
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

.method private static AFAdRevenueData(Lcom/appsflyer/internal/AFi1ySDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1tSDK;
    .locals 5
    .param p0    # Lcom/appsflyer/internal/AFi1ySDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    .line 1
    new-instance p1, Lcom/appsflyer/internal/AFi1tSDK;

    .line 2
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFh1dSDK;

    .line 3
    sget-object p2, Lcom/appsflyer/internal/AFh1dSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFh1dSDK;

    if-ne p0, p2, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    sget-object p0, Lcom/appsflyer/internal/AFi1xSDK;->getMediationNetwork:Lcom/appsflyer/internal/AFi1xSDK;

    invoke-direct {p1, v0, p0}, Lcom/appsflyer/internal/AFi1tSDK;-><init>(ZLcom/appsflyer/internal/AFi1xSDK;)V

    return-object p1

    .line 4
    :cond_1
    invoke-static {v1, v1, v1}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    rsub-int/lit8 v2, v2, 0x7f

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string/jumbo v4, "\u008c\u0085\u0081\u0086\u0087\u0085\u008c\u0082\u008b\u0085\u0082\u0082\u0082\u0081\u0086\u0082\u0086\u0081\u008b\u0082\u008c\u0087\u008d\u0083\u0082\u0087\u008c\u0083\u0086\u0087\u0083\u0083\u008b\u0087\u0081\u0083\u008a\u0086\u0089\u0086\u0088\u0086\u0084\u0085\u0087\u0086\u0083\u0085\u0085\u0086\u0086\u0085\u0084\u0082\u0084\u0081\u0083\u0082\u0083\u0081\u0081\u0082\u0081\u0081"

    invoke-static {v3, v4, v3, v2, v0}, Lcom/appsflyer/internal/AFf1pSDK;->a(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V

    aget-object v0, v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/appsflyer/internal/AFi1ySDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFh1dSDK;

    .line 6
    sget-object v2, Lcom/appsflyer/internal/AFh1dSDK;->getRevenue:Lcom/appsflyer/internal/AFh1dSDK;

    if-ne v1, v2, :cond_2

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 8
    :cond_2
    const-string p2, ""

    move-object p3, v0

    .line 9
    :goto_1
    iget-object p0, p0, Lcom/appsflyer/internal/AFi1ySDK;->getMediationNetwork:Ljava/lang/String;

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->reverse()Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    .line 11
    const-string v0, "android"

    const-string/jumbo v1, "v1"

    invoke-static {p3, p0, v0, v1, p2}, Lcom/appsflyer/internal/AFf1pSDK;->AFAdRevenueData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 12
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    .line 13
    new-instance p1, Lcom/appsflyer/internal/AFi1tSDK;

    if-eqz p0, :cond_3

    sget-object p2, Lcom/appsflyer/internal/AFi1xSDK;->getMonetizationNetwork:Lcom/appsflyer/internal/AFi1xSDK;

    goto :goto_2

    :cond_3
    sget-object p2, Lcom/appsflyer/internal/AFi1xSDK;->AFAdRevenueData:Lcom/appsflyer/internal/AFi1xSDK;

    :goto_2
    invoke-direct {p1, p0, p2}, Lcom/appsflyer/internal/AFi1tSDK;-><init>(ZLcom/appsflyer/internal/AFi1xSDK;)V

    return-object p1
.end method

.method private static AFAdRevenueData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 14
    sget v0, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    add-int/lit8 v0, v0, 0x2d

    rem-int/lit16 v0, v0, 0x80

    sput v0, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    .line 15
    const-string v0, ""

    filled-new-array {p1, p2, p3, p4, v0}, [Ljava/lang/String;

    move-result-object p1

    .line 16
    const-string/jumbo p2, "\u2063"

    invoke-static {p2, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-static {p1, p0}, Lcom/appsflyer/internal/AFj1dSDK;->getRevenue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0xc

    if-ge p1, p2, :cond_1

    .line 19
    sget p1, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    add-int/lit8 p1, p1, 0x45

    rem-int/lit16 p2, p1, 0x80

    sput p2, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    rem-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    .line 20
    throw p0

    :cond_1
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;[II[Ljava/lang/Object;)V
    .locals 10

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1pSDK;->$11:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x75

    .line 5
    .line 6
    rem-int/lit16 v1, v0, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFf1pSDK;->$10:I

    .line 9
    .line 10
    rem-int/lit8 v0, v0, 0x2

    .line 11
    .line 12
    if-nez v0, :cond_a

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v0, "ISO-8859-1"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 20
    move-result-object p1

    .line 21
    .line 22
    :cond_0
    check-cast p1, [B

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 28
    move-result-object p0

    .line 29
    .line 30
    :cond_1
    check-cast p0, [C

    .line 31
    .line 32
    new-instance v0, Lcom/appsflyer/internal/AFk1jSDK;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Lcom/appsflyer/internal/AFk1jSDK;-><init>()V

    .line 36
    .line 37
    sget-object v1, Lcom/appsflyer/internal/AFf1pSDK;->getMonetizationNetwork:[C

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const-wide v2, 0x19569dd871fb8d0aL

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    sget v5, Lcom/appsflyer/internal/AFf1pSDK;->$10:I

    .line 48
    .line 49
    add-int/lit8 v5, v5, 0x9

    .line 50
    .line 51
    rem-int/lit16 v6, v5, 0x80

    .line 52
    .line 53
    sput v6, Lcom/appsflyer/internal/AFf1pSDK;->$11:I

    .line 54
    .line 55
    rem-int/lit8 v5, v5, 0x2

    .line 56
    .line 57
    if-nez v5, :cond_2

    .line 58
    array-length v5, v1

    .line 59
    .line 60
    new-array v6, v5, [C

    .line 61
    const/4 v7, 0x1

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    array-length v5, v1

    .line 64
    .line 65
    new-array v6, v5, [C

    .line 66
    move v7, v4

    .line 67
    .line 68
    :goto_0
    if-ge v7, v5, :cond_3

    .line 69
    .line 70
    aget-char v8, v1, v7

    .line 71
    int-to-long v8, v8

    .line 72
    xor-long/2addr v8, v2

    .line 73
    long-to-int v8, v8

    .line 74
    int-to-char v8, v8

    .line 75
    .line 76
    aput-char v8, v6, v7

    .line 77
    .line 78
    add-int/lit8 v7, v7, 0x1

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_3
    sget v1, Lcom/appsflyer/internal/AFf1pSDK;->$10:I

    .line 82
    .line 83
    add-int/lit8 v1, v1, 0x47

    .line 84
    .line 85
    rem-int/lit16 v1, v1, 0x80

    .line 86
    .line 87
    sput v1, Lcom/appsflyer/internal/AFf1pSDK;->$11:I

    .line 88
    move-object v1, v6

    .line 89
    .line 90
    :cond_4
    sget v5, Lcom/appsflyer/internal/AFf1pSDK;->AFAdRevenueData:I

    .line 91
    int-to-long v5, v5

    .line 92
    xor-long/2addr v2, v5

    .line 93
    long-to-int v2, v2

    .line 94
    .line 95
    sget-boolean v3, Lcom/appsflyer/internal/AFf1pSDK;->getRevenue:Z

    .line 96
    .line 97
    if-eqz v3, :cond_6

    .line 98
    array-length p0, p1

    .line 99
    .line 100
    iput p0, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 101
    .line 102
    new-array p0, p0, [C

    .line 103
    .line 104
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 105
    .line 106
    :goto_1
    iget p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 107
    .line 108
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 109
    .line 110
    if-ge p2, v3, :cond_5

    .line 111
    .line 112
    sget v5, Lcom/appsflyer/internal/AFf1pSDK;->$11:I

    .line 113
    .line 114
    add-int/lit8 v5, v5, 0x13

    .line 115
    .line 116
    rem-int/lit16 v5, v5, 0x80

    .line 117
    .line 118
    sput v5, Lcom/appsflyer/internal/AFf1pSDK;->$10:I

    .line 119
    .line 120
    add-int/lit8 v3, v3, -0x1

    .line 121
    sub-int/2addr v3, p2

    .line 122
    .line 123
    aget-byte v3, p1, v3

    .line 124
    add-int/2addr v3, p3

    .line 125
    .line 126
    aget-char v3, v1, v3

    .line 127
    sub-int/2addr v3, v2

    .line 128
    int-to-char v3, v3

    .line 129
    .line 130
    aput-char v3, p0, p2

    .line 131
    .line 132
    add-int/lit8 p2, p2, 0x1

    .line 133
    .line 134
    iput p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 135
    goto :goto_1

    .line 136
    .line 137
    :cond_5
    new-instance p1, Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 141
    .line 142
    aput-object p1, p4, v4

    .line 143
    return-void

    .line 144
    .line 145
    :cond_6
    sget-boolean p1, Lcom/appsflyer/internal/AFf1pSDK;->getCurrencyIso4217Code:Z

    .line 146
    .line 147
    if-eqz p1, :cond_8

    .line 148
    array-length p1, p0

    .line 149
    .line 150
    iput p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 151
    .line 152
    new-array p1, p1, [C

    .line 153
    .line 154
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 155
    .line 156
    :goto_2
    iget p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 157
    .line 158
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 159
    .line 160
    if-ge p2, v3, :cond_7

    .line 161
    .line 162
    add-int/lit8 v3, v3, -0x1

    .line 163
    sub-int/2addr v3, p2

    .line 164
    .line 165
    aget-char v3, p0, v3

    .line 166
    sub-int/2addr v3, p3

    .line 167
    .line 168
    aget-char v3, v1, v3

    .line 169
    sub-int/2addr v3, v2

    .line 170
    int-to-char v3, v3

    .line 171
    .line 172
    aput-char v3, p1, p2

    .line 173
    .line 174
    add-int/lit8 p2, p2, 0x1

    .line 175
    .line 176
    iput p2, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 177
    goto :goto_2

    .line 178
    .line 179
    :cond_7
    new-instance p0, Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([C)V

    .line 183
    .line 184
    aput-object p0, p4, v4

    .line 185
    return-void

    .line 186
    :cond_8
    array-length p0, p2

    .line 187
    .line 188
    iput p0, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 189
    .line 190
    new-array p0, p0, [C

    .line 191
    .line 192
    iput v4, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 193
    .line 194
    :goto_3
    iget p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 195
    .line 196
    iget v3, v0, Lcom/appsflyer/internal/AFk1jSDK;->getRevenue:I

    .line 197
    .line 198
    if-ge p1, v3, :cond_9

    .line 199
    .line 200
    add-int/lit8 v3, v3, -0x1

    .line 201
    sub-int/2addr v3, p1

    .line 202
    .line 203
    aget v3, p2, v3

    .line 204
    sub-int/2addr v3, p3

    .line 205
    .line 206
    aget-char v3, v1, v3

    .line 207
    sub-int/2addr v3, v2

    .line 208
    int-to-char v3, v3

    .line 209
    .line 210
    aput-char v3, p0, p1

    .line 211
    .line 212
    add-int/lit8 p1, p1, 0x1

    .line 213
    .line 214
    iput p1, v0, Lcom/appsflyer/internal/AFk1jSDK;->getMonetizationNetwork:I

    .line 215
    goto :goto_3

    .line 216
    .line 217
    :cond_9
    new-instance p1, Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([C)V

    .line 221
    .line 222
    aput-object p1, p4, v4

    .line 223
    return-void

    .line 224
    :cond_a
    const/4 p0, 0x0

    .line 225
    throw p0
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
.end method

.method public static getCurrencyIso4217Code()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    new-array v0, v0, [C

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/appsflyer/internal/AFf1pSDK;->getMonetizationNetwork:[C

    .line 10
    .line 11
    .line 12
    const v0, 0x71fb8d1a

    .line 13
    .line 14
    sput v0, Lcom/appsflyer/internal/AFf1pSDK;->AFAdRevenueData:I

    .line 15
    const/4 v0, 0x1

    .line 16
    .line 17
    sput-boolean v0, Lcom/appsflyer/internal/AFf1pSDK;->getCurrencyIso4217Code:Z

    .line 18
    .line 19
    sput-boolean v0, Lcom/appsflyer/internal/AFf1pSDK;->getRevenue:Z

    .line 20
    return-void

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
    :array_0
    .array-data 2
        -0x72b7s
        -0x72b3s
        -0x72b4s
        -0x72bds
        -0x72b8s
        -0x72b2s
        -0x72b1s
        -0x72bes
        -0x72b6s
        -0x72a2s
        -0x72b5s
        -0x72a5s
        -0x72a1s
    .end array-data
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
.end method


# virtual methods
.method public final getMonetizationNetwork(Lcom/appsflyer/internal/AFi1ySDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1tSDK;
    .locals 2
    .param p1    # Lcom/appsflyer/internal/AFi1ySDK;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    sget v0, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    .line 3
    .line 4
    add-int/lit8 v1, v0, 0x13

    .line 5
    .line 6
    rem-int/lit16 v1, v1, 0x80

    .line 7
    .line 8
    sput v1, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x11

    .line 13
    .line 14
    rem-int/lit16 v0, v0, 0x80

    .line 15
    .line 16
    sput v0, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    .line 17
    .line 18
    if-eqz p3, :cond_0

    .line 19
    .line 20
    if-eqz p4, :cond_0

    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x2b

    .line 23
    .line 24
    rem-int/lit16 v0, v0, 0x80

    .line 25
    .line 26
    sput v0, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    .line 27
    .line 28
    .line 29
    invoke-static {p1, p2, p3, p4}, Lcom/appsflyer/internal/AFf1pSDK;->AFAdRevenueData(Lcom/appsflyer/internal/AFi1ySDK;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/appsflyer/internal/AFi1tSDK;

    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    .line 33
    :cond_0
    sget p1, Lcom/appsflyer/internal/AFf1pSDK;->areAllFieldsValid:I

    .line 34
    .line 35
    add-int/lit8 p1, p1, 0x3b

    .line 36
    .line 37
    rem-int/lit16 p1, p1, 0x80

    .line 38
    .line 39
    sput p1, Lcom/appsflyer/internal/AFf1pSDK;->getMediationNetwork:I

    .line 40
    .line 41
    new-instance p1, Lcom/appsflyer/internal/AFi1tSDK;

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    sget-object p3, Lcom/appsflyer/internal/AFi1xSDK;->getCurrencyIso4217Code:Lcom/appsflyer/internal/AFi1xSDK;

    .line 45
    .line 46
    .line 47
    invoke-direct {p1, p2, p3}, Lcom/appsflyer/internal/AFi1tSDK;-><init>(ZLcom/appsflyer/internal/AFi1xSDK;)V

    .line 48
    return-object p1
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
.end method
