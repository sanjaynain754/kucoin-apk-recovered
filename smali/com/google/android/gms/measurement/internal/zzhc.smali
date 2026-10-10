.class public final Lcom/google/android/gms/measurement/internal/zzhc;
.super Ljava/lang/Object;
.source "com.google.android.gms:play-services-measurement-impl@@22.5.0"


# instance fields
.field final synthetic zza:Lcom/google/android/gms/measurement/internal/zzhg;

.field private final zzb:Ljava/lang/String;

.field private final zzc:Landroid/os/Bundle;

.field private zzd:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/internal/zzhg;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotEmpty(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzb:Ljava/lang/String;

    .line 14
    .line 15
    new-instance p1, Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzc:Landroid/os/Bundle;

    .line 21
    return-void
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
.end method


# virtual methods
.method public final zza()Landroid/os/Bundle;
    .locals 15
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_7

    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzb:Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzhg;->zzd()Landroid/content/SharedPreferences;

    .line 14
    move-result-object v2

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    .line 18
    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    if-eqz v1, :cond_10

    .line 22
    .line 23
    :try_start_0
    new-instance v2, Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 27
    .line 28
    new-instance v4, Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    invoke-direct {v4, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 32
    const/4 v1, 0x0

    .line 33
    move v5, v1

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    .line 37
    move-result v6
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 38
    .line 39
    if-ge v5, v6, :cond_f

    .line 40
    .line 41
    .line 42
    :try_start_1
    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    const-string v7, "n"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v7

    .line 50
    .line 51
    .line 52
    const-string/jumbo v8, "t"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v8

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 60
    move-result v9
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    const/16 v10, 0x64

    .line 63
    const/4 v11, 0x2

    .line 64
    const/4 v12, 0x3

    .line 65
    const/4 v13, 0x4

    .line 66
    const/4 v14, 0x1

    .line 67
    .line 68
    if-eq v9, v10, :cond_5

    .line 69
    .line 70
    const/16 v10, 0x6c

    .line 71
    .line 72
    if-eq v9, v10, :cond_4

    .line 73
    .line 74
    const/16 v10, 0x73

    .line 75
    .line 76
    if-eq v9, v10, :cond_3

    .line 77
    .line 78
    const/16 v10, 0xd18

    .line 79
    .line 80
    if-eq v9, v10, :cond_2

    .line 81
    .line 82
    const/16 v10, 0xd75

    .line 83
    .line 84
    if-eq v9, v10, :cond_1

    .line 85
    goto :goto_1

    .line 86
    .line 87
    :cond_1
    const-string v9, "la"

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    move-result v9

    .line 92
    .line 93
    if-eqz v9, :cond_6

    .line 94
    move v9, v13

    .line 95
    goto :goto_2

    .line 96
    .line 97
    :cond_2
    const-string v9, "ia"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result v9

    .line 102
    .line 103
    if-eqz v9, :cond_6

    .line 104
    move v9, v12

    .line 105
    goto :goto_2

    .line 106
    .line 107
    :cond_3
    const-string v9, "s"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 111
    move-result v9

    .line 112
    .line 113
    if-eqz v9, :cond_6

    .line 114
    move v9, v1

    .line 115
    goto :goto_2

    .line 116
    .line 117
    :cond_4
    const-string v9, "l"

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    move-result v9

    .line 122
    .line 123
    if-eqz v9, :cond_6

    .line 124
    move v9, v11

    .line 125
    goto :goto_2

    .line 126
    .line 127
    :cond_5
    const-string v9, "d"

    .line 128
    .line 129
    .line 130
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    move-result v9

    .line 132
    .line 133
    if-eqz v9, :cond_6

    .line 134
    move v9, v14

    .line 135
    goto :goto_2

    .line 136
    :cond_6
    :goto_1
    const/4 v9, -0x1

    .line 137
    .line 138
    .line 139
    :goto_2
    const-string/jumbo v10, "v"

    .line 140
    .line 141
    if-eqz v9, :cond_d

    .line 142
    .line 143
    if-eq v9, v14, :cond_c

    .line 144
    .line 145
    if-eq v9, v11, :cond_b

    .line 146
    .line 147
    if-eq v9, v12, :cond_9

    .line 148
    .line 149
    if-eq v9, v13, :cond_7

    .line 150
    .line 151
    :try_start_2
    iget-object v6, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 155
    move-result-object v6

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 159
    move-result-object v6

    .line 160
    .line 161
    const-string v7, "Unrecognized persisted bundle type. Type"

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v7, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 165
    .line 166
    goto/16 :goto_5

    .line 167
    .line 168
    .line 169
    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 170
    .line 171
    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 175
    move-result-object v8

    .line 176
    .line 177
    sget-object v9, Lcom/google/android/gms/measurement/internal/zzfx;->zzaQ:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v8, v3, v9}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 181
    move-result v8

    .line 182
    .line 183
    if-eqz v8, :cond_e

    .line 184
    .line 185
    new-instance v8, Lorg/json/JSONArray;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 189
    move-result-object v6

    .line 190
    .line 191
    .line 192
    invoke-direct {v8, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 196
    move-result v6

    .line 197
    .line 198
    new-array v9, v6, [J

    .line 199
    move v10, v1

    .line 200
    .line 201
    :goto_3
    if-ge v10, v6, :cond_8

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->optLong(I)J

    .line 205
    move-result-wide v11

    .line 206
    .line 207
    aput-wide v11, v9, v10

    .line 208
    .line 209
    add-int/lit8 v10, v10, 0x1

    .line 210
    goto :goto_3

    .line 211
    .line 212
    .line 213
    :cond_8
    invoke-virtual {v2, v7, v9}, Landroid/os/BaseBundle;->putLongArray(Ljava/lang/String;[J)V

    .line 214
    goto :goto_5

    .line 215
    .line 216
    .line 217
    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 218
    .line 219
    iget-object v8, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 223
    move-result-object v8

    .line 224
    .line 225
    sget-object v9, Lcom/google/android/gms/measurement/internal/zzfx;->zzaQ:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8, v3, v9}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 229
    move-result v8

    .line 230
    .line 231
    if-eqz v8, :cond_e

    .line 232
    .line 233
    new-instance v8, Lorg/json/JSONArray;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 237
    move-result-object v6

    .line 238
    .line 239
    .line 240
    invoke-direct {v8, v6}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    .line 244
    move-result v6

    .line 245
    .line 246
    new-array v9, v6, [I

    .line 247
    move v10, v1

    .line 248
    .line 249
    :goto_4
    if-ge v10, v6, :cond_a

    .line 250
    .line 251
    .line 252
    invoke-virtual {v8, v10}, Lorg/json/JSONArray;->optInt(I)I

    .line 253
    move-result v11

    .line 254
    .line 255
    aput v11, v9, v10

    .line 256
    .line 257
    add-int/lit8 v10, v10, 0x1

    .line 258
    goto :goto_4

    .line 259
    .line 260
    .line 261
    :cond_a
    invoke-virtual {v2, v7, v9}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 262
    goto :goto_5

    .line 263
    .line 264
    .line 265
    :cond_b
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 266
    move-result-object v6

    .line 267
    .line 268
    .line 269
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 270
    move-result-wide v8

    .line 271
    .line 272
    .line 273
    invoke-virtual {v2, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 274
    goto :goto_5

    .line 275
    .line 276
    .line 277
    :cond_c
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    move-result-object v6

    .line 279
    .line 280
    .line 281
    invoke-static {v6}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 282
    move-result-wide v8

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v7, v8, v9}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 286
    goto :goto_5

    .line 287
    .line 288
    .line 289
    :cond_d
    invoke-virtual {v6, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 290
    move-result-object v6

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    .line 294
    goto :goto_5

    .line 295
    .line 296
    :catch_0
    :try_start_3
    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 297
    .line 298
    iget-object v6, v6, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 302
    move-result-object v6

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 306
    move-result-object v6

    .line 307
    .line 308
    const-string v7, "Error reading value from SharedPreferences. Value dropped"

    .line 309
    .line 310
    .line 311
    invoke-virtual {v6, v7}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 312
    .line 313
    :cond_e
    :goto_5
    add-int/lit8 v5, v5, 0x1

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_f
    iput-object v2, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_1

    .line 318
    goto :goto_6

    .line 319
    .line 320
    :catch_1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 321
    .line 322
    iget-object v0, v0, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 326
    move-result-object v0

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 330
    move-result-object v0

    .line 331
    .line 332
    const-string v1, "Error loading bundle from SharedPreferences. Values will be lost"

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/internal/zzgr;->zza(Ljava/lang/String;)V

    .line 336
    .line 337
    :cond_10
    :goto_6
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;

    .line 338
    .line 339
    if-nez v0, :cond_11

    .line 340
    .line 341
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzc:Landroid/os/Bundle;

    .line 342
    .line 343
    iput-object v0, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;

    .line 344
    .line 345
    :cond_11
    :goto_7
    new-instance v0, Landroid/os/Bundle;

    .line 346
    .line 347
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;

    .line 348
    .line 349
    .line 350
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    move-result-object v1

    .line 352
    .line 353
    check-cast v1, Landroid/os/Bundle;

    .line 354
    .line 355
    .line 356
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 357
    return-object v0
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
.end method

.method public final zzb(Landroid/os/Bundle;)V
    .locals 16
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Landroid/os/Bundle;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 12
    move-object v2, v0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    new-instance v2, Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 19
    .line 20
    :goto_0
    iget-object v3, v1, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lcom/google/android/gms/measurement/internal/zzhg;->zzd()Landroid/content/SharedPreferences;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/os/BaseBundle;->size()I

    .line 32
    move-result v0

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzhc;->zzb:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-interface {v4, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 40
    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_1
    iget-object v5, v1, Lcom/google/android/gms/measurement/internal/zzhc;->zzb:Ljava/lang/String;

    .line 44
    .line 45
    new-instance v6, Lorg/json/JSONArray;

    .line 46
    .line 47
    .line 48
    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    move-result-object v7

    .line 57
    .line 58
    .line 59
    :cond_2
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-eqz v0, :cond_c

    .line 63
    .line 64
    .line 65
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    check-cast v0, Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 72
    move-result-object v8

    .line 73
    .line 74
    if-eqz v8, :cond_2

    .line 75
    .line 76
    :try_start_0
    new-instance v9, Lorg/json/JSONObject;

    .line 77
    .line 78
    .line 79
    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    .line 80
    .line 81
    const-string v10, "n"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzql;->zza()Z

    .line 88
    .line 89
    iget-object v0, v3, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzib;->zzc()Lcom/google/android/gms/measurement/internal/zzal;

    .line 93
    move-result-object v10

    .line 94
    .line 95
    sget-object v11, Lcom/google/android/gms/measurement/internal/zzfx;->zzaQ:Lcom/google/android/gms/measurement/internal/zzfw;

    .line 96
    const/4 v12, 0x0

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10, v12, v11}, Lcom/google/android/gms/measurement/internal/zzal;->zzp(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/zzfw;)Z

    .line 100
    move-result v10
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    .line 102
    const-string v11, "Cannot serialize bundle value to SharedPreferences. Type"

    .line 103
    .line 104
    const-string v12, "d"

    .line 105
    .line 106
    const-string v13, "l"

    .line 107
    .line 108
    const-string v14, "s"

    .line 109
    .line 110
    .line 111
    const-string/jumbo v15, "v"

    .line 112
    .line 113
    move-object/from16 p1, v0

    .line 114
    .line 115
    .line 116
    const-string/jumbo v0, "t"

    .line 117
    .line 118
    if-eqz v10, :cond_8

    .line 119
    .line 120
    :try_start_1
    instance-of v10, v8, Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v10, :cond_3

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    move-result-object v8

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v9, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    goto/16 :goto_2

    .line 135
    :catch_0
    move-exception v0

    .line 136
    .line 137
    goto/16 :goto_3

    .line 138
    .line 139
    :cond_3
    instance-of v10, v8, Ljava/lang/Long;

    .line 140
    .line 141
    if-eqz v10, :cond_4

    .line 142
    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    move-result-object v8

    .line 146
    .line 147
    .line 148
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    goto :goto_2

    .line 153
    .line 154
    :cond_4
    instance-of v10, v8, [I

    .line 155
    .line 156
    if-eqz v10, :cond_5

    .line 157
    .line 158
    check-cast v8, [I

    .line 159
    .line 160
    .line 161
    invoke-static {v8}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    .line 162
    move-result-object v8

    .line 163
    .line 164
    .line 165
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 166
    .line 167
    const-string v8, "ia"

    .line 168
    .line 169
    .line 170
    invoke-virtual {v9, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 171
    goto :goto_2

    .line 172
    .line 173
    :cond_5
    instance-of v10, v8, [J

    .line 174
    .line 175
    if-eqz v10, :cond_6

    .line 176
    .line 177
    check-cast v8, [J

    .line 178
    .line 179
    .line 180
    invoke-static {v8}, Ljava/util/Arrays;->toString([J)Ljava/lang/String;

    .line 181
    move-result-object v8

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    const-string v8, "la"

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    goto :goto_2

    .line 191
    .line 192
    :cond_6
    instance-of v10, v8, Ljava/lang/Double;

    .line 193
    .line 194
    if-eqz v10, :cond_7

    .line 195
    .line 196
    .line 197
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 198
    move-result-object v8

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v15, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    goto :goto_2

    .line 206
    .line 207
    .line 208
    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    move-result-object v8

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v11, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 221
    .line 222
    goto/16 :goto_1

    .line 223
    .line 224
    .line 225
    :cond_8
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 226
    move-result-object v10

    .line 227
    .line 228
    .line 229
    invoke-virtual {v9, v15, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 230
    .line 231
    instance-of v10, v8, Ljava/lang/String;

    .line 232
    .line 233
    if-eqz v10, :cond_9

    .line 234
    .line 235
    .line 236
    invoke-virtual {v9, v0, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 237
    goto :goto_2

    .line 238
    .line 239
    :cond_9
    instance-of v10, v8, Ljava/lang/Long;

    .line 240
    .line 241
    if-eqz v10, :cond_a

    .line 242
    .line 243
    .line 244
    invoke-virtual {v9, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 245
    goto :goto_2

    .line 246
    .line 247
    :cond_a
    instance-of v10, v8, Ljava/lang/Double;

    .line 248
    .line 249
    if-eqz v10, :cond_b

    .line 250
    .line 251
    .line 252
    invoke-virtual {v9, v0, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    :goto_2
    invoke-virtual {v6, v9}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 256
    .line 257
    goto/16 :goto_1

    .line 258
    .line 259
    .line 260
    :cond_b
    invoke-virtual/range {p1 .. p1}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 261
    move-result-object v0

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 265
    move-result-object v0

    .line 266
    .line 267
    .line 268
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    move-result-object v8

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v11, v8}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :goto_3
    iget-object v8, v1, Lcom/google/android/gms/measurement/internal/zzhc;->zza:Lcom/google/android/gms/measurement/internal/zzhg;

    .line 277
    .line 278
    iget-object v8, v8, Lcom/google/android/gms/measurement/internal/zzjd;->zzu:Lcom/google/android/gms/measurement/internal/zzib;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzib;->zzaV()Lcom/google/android/gms/measurement/internal/zzgt;

    .line 282
    move-result-object v8

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8}, Lcom/google/android/gms/measurement/internal/zzgt;->zzb()Lcom/google/android/gms/measurement/internal/zzgr;

    .line 286
    move-result-object v8

    .line 287
    .line 288
    const-string v9, "Cannot serialize bundle value to SharedPreferences"

    .line 289
    .line 290
    .line 291
    invoke-virtual {v8, v9, v0}, Lcom/google/android/gms/measurement/internal/zzgr;->zzb(Ljava/lang/String;Ljava/lang/Object;)V

    .line 292
    .line 293
    goto/16 :goto_1

    .line 294
    .line 295
    .line 296
    :cond_c
    invoke-virtual {v6}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 297
    move-result-object v0

    .line 298
    .line 299
    .line 300
    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 301
    .line 302
    .line 303
    :goto_4
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 304
    .line 305
    iput-object v2, v1, Lcom/google/android/gms/measurement/internal/zzhc;->zzd:Landroid/os/Bundle;

    .line 306
    return-void
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
.end method
