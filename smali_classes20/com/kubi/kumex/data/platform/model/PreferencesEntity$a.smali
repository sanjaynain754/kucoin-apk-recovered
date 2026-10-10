.class public final Lcom/kubi/kumex/data/platform/model/PreferencesEntity$a;
.super Ljava/lang/Object;
.source "PreferencesEntity.kt"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/kubi/kumex/data/platform/model/PreferencesEntity;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
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
.end method


# virtual methods
.method public final a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
    .locals 11

    .line 1
    .line 2
    const-string v0, "parcel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/kumex/data/platform/model/PreferencesEntity;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    move-object v0, v4

    .line 18
    goto :goto_1

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    move v0, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v0, v2

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 35
    move-result v5

    .line 36
    .line 37
    if-nez v5, :cond_2

    .line 38
    move-object v5, v4

    .line 39
    goto :goto_3

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 43
    move-result v5

    .line 44
    .line 45
    if-eqz v5, :cond_3

    .line 46
    move v5, v3

    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move v5, v2

    .line 49
    .line 50
    .line 51
    :goto_2
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 52
    move-result-object v5

    .line 53
    .line 54
    .line 55
    :goto_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 56
    move-result v6

    .line 57
    .line 58
    if-nez v6, :cond_4

    .line 59
    move-object v6, v4

    .line 60
    goto :goto_5

    .line 61
    .line 62
    .line 63
    :cond_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 64
    move-result v6

    .line 65
    .line 66
    if-eqz v6, :cond_5

    .line 67
    move v6, v3

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move v6, v2

    .line 70
    .line 71
    .line 72
    :goto_4
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    move-result-object v6

    .line 74
    .line 75
    .line 76
    :goto_5
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 77
    move-result v7

    .line 78
    .line 79
    if-nez v7, :cond_6

    .line 80
    move-object v7, v4

    .line 81
    goto :goto_7

    .line 82
    .line 83
    .line 84
    :cond_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 85
    move-result v7

    .line 86
    .line 87
    if-eqz v7, :cond_7

    .line 88
    move v7, v3

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move v7, v2

    .line 91
    .line 92
    .line 93
    :goto_6
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    move-result-object v7

    .line 95
    .line 96
    .line 97
    :goto_7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 98
    move-result v8

    .line 99
    .line 100
    if-nez v8, :cond_8

    .line 101
    move-object v8, v4

    .line 102
    goto :goto_9

    .line 103
    .line 104
    .line 105
    :cond_8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 106
    move-result v8

    .line 107
    .line 108
    if-eqz v8, :cond_9

    .line 109
    move v8, v3

    .line 110
    goto :goto_8

    .line 111
    :cond_9
    move v8, v2

    .line 112
    .line 113
    .line 114
    :goto_8
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 115
    move-result-object v8

    .line 116
    .line 117
    .line 118
    :goto_9
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 119
    move-result v9

    .line 120
    .line 121
    if-nez v9, :cond_a

    .line 122
    move-object v9, v4

    .line 123
    goto :goto_b

    .line 124
    .line 125
    .line 126
    :cond_a
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 127
    move-result v9

    .line 128
    .line 129
    if-eqz v9, :cond_b

    .line 130
    move v9, v3

    .line 131
    goto :goto_a

    .line 132
    :cond_b
    move v9, v2

    .line 133
    .line 134
    .line 135
    :goto_a
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 136
    move-result-object v9

    .line 137
    .line 138
    .line 139
    :goto_b
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 140
    move-result v10

    .line 141
    .line 142
    if-nez v10, :cond_c

    .line 143
    :goto_c
    move-object v2, v8

    .line 144
    move-object v8, v4

    .line 145
    move-object v4, v6

    .line 146
    move-object v6, v2

    .line 147
    move-object v2, v0

    .line 148
    move-object v3, v5

    .line 149
    move-object v5, v7

    .line 150
    move-object v7, v9

    .line 151
    goto :goto_d

    .line 152
    .line 153
    .line 154
    :cond_c
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 155
    move-result p1

    .line 156
    .line 157
    if-eqz p1, :cond_d

    .line 158
    move v2, v3

    .line 159
    .line 160
    .line 161
    :cond_d
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    move-result-object v4

    .line 163
    goto :goto_c

    .line 164
    .line 165
    .line 166
    :goto_d
    invoke-direct/range {v1 .. v8}, Lcom/kubi/kumex/data/platform/model/PreferencesEntity;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 167
    return-object v1
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
.end method

.method public final b(I)[Lcom/kubi/kumex/data/platform/model/PreferencesEntity;
    .locals 0

    .line 1
    .line 2
    new-array p1, p1, [Lcom/kubi/kumex/data/platform/model/PreferencesEntity;

    .line 3
    return-object p1
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
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/platform/model/PreferencesEntity$a;->a(Landroid/os/Parcel;)Lcom/kubi/kumex/data/platform/model/PreferencesEntity;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kumex/data/platform/model/PreferencesEntity$a;->b(I)[Lcom/kubi/kumex/data/platform/model/PreferencesEntity;

    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method
