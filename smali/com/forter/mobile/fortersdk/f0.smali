.class public final Lcom/forter/mobile/fortersdk/f0;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p0    # Landroid/content/ContentResolver;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
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
    .param p4    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string v0, "global"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    const-string v1, "int"

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v3, "str"

    .line 13
    .line 14
    const-string v4, "long"

    .line 15
    .line 16
    const-string v5, "float"

    .line 17
    const/4 v6, -0x1

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x3

    .line 20
    const/4 v9, 0x2

    .line 21
    .line 22
    if-eqz v0, :cond_5

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 26
    move-result p1

    .line 27
    .line 28
    .line 29
    sparse-switch p1, :sswitch_data_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :sswitch_0
    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    move-result p1

    .line 35
    .line 36
    if-eqz p1, :cond_0

    .line 37
    move v2, v9

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :sswitch_1
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    move v2, v8

    .line 46
    goto :goto_1

    .line 47
    .line 48
    .line 49
    :sswitch_2
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    move-result p1

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    goto :goto_1

    .line 54
    .line 55
    .line 56
    :sswitch_3
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result p1

    .line 58
    .line 59
    if-eqz p1, :cond_0

    .line 60
    move v2, v7

    .line 61
    goto :goto_1

    .line 62
    :cond_0
    :goto_0
    move v2, v6

    .line 63
    .line 64
    :goto_1
    if-eqz v2, :cond_4

    .line 65
    .line 66
    if-eq v2, v7, :cond_3

    .line 67
    .line 68
    if-eq v2, v9, :cond_2

    .line 69
    .line 70
    if-eq v2, v8, :cond_1

    .line 71
    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->i(Ljava/lang/Object;)J

    .line 76
    move-result-wide p3

    .line 77
    .line 78
    .line 79
    invoke-static {p0, p2, p3, p4}, Landroid/provider/Settings$Global;->getLong(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    .line 80
    move-result-wide p0

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    .line 87
    .line 88
    :cond_2
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->h(Ljava/lang/Object;)F

    .line 89
    move-result p1

    .line 90
    .line 91
    .line 92
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 93
    move-result p0

    .line 94
    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->g(Ljava/lang/Object;)I

    .line 102
    move-result p1

    .line 103
    .line 104
    .line 105
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 106
    move-result p0

    .line 107
    .line 108
    .line 109
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    .line 113
    .line 114
    :cond_4
    invoke-static {p0, p2}, Landroid/provider/Settings$Global;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    move-result-object p0

    .line 116
    .line 117
    if-eqz p0, :cond_11

    .line 118
    return-object p0

    .line 119
    .line 120
    .line 121
    :cond_5
    const-string/jumbo v0, "system"

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 125
    move-result v0

    .line 126
    .line 127
    if-eqz v0, :cond_b

    .line 128
    .line 129
    .line 130
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 131
    move-result p1

    .line 132
    .line 133
    .line 134
    sparse-switch p1, :sswitch_data_1

    .line 135
    goto :goto_2

    .line 136
    .line 137
    .line 138
    :sswitch_4
    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    move-result p1

    .line 140
    .line 141
    if-eqz p1, :cond_6

    .line 142
    move v2, v9

    .line 143
    goto :goto_3

    .line 144
    .line 145
    .line 146
    :sswitch_5
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    move-result p1

    .line 148
    .line 149
    if-eqz p1, :cond_6

    .line 150
    move v2, v8

    .line 151
    goto :goto_3

    .line 152
    .line 153
    .line 154
    :sswitch_6
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    move-result p1

    .line 156
    .line 157
    if-eqz p1, :cond_6

    .line 158
    goto :goto_3

    .line 159
    .line 160
    .line 161
    :sswitch_7
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    move-result p1

    .line 163
    .line 164
    if-eqz p1, :cond_6

    .line 165
    move v2, v7

    .line 166
    goto :goto_3

    .line 167
    :cond_6
    :goto_2
    move v2, v6

    .line 168
    .line 169
    :goto_3
    if-eqz v2, :cond_a

    .line 170
    .line 171
    if-eq v2, v7, :cond_9

    .line 172
    .line 173
    if-eq v2, v9, :cond_8

    .line 174
    .line 175
    if-eq v2, v8, :cond_7

    .line 176
    .line 177
    goto/16 :goto_6

    .line 178
    .line 179
    .line 180
    :cond_7
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->i(Ljava/lang/Object;)J

    .line 181
    move-result-wide p3

    .line 182
    .line 183
    .line 184
    invoke-static {p0, p2, p3, p4}, Landroid/provider/Settings$System;->getLong(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    .line 185
    move-result-wide p0

    .line 186
    .line 187
    .line 188
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 189
    move-result-object p0

    .line 190
    return-object p0

    .line 191
    .line 192
    .line 193
    :cond_8
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->h(Ljava/lang/Object;)F

    .line 194
    move-result p1

    .line 195
    .line 196
    .line 197
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$System;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 198
    move-result p0

    .line 199
    .line 200
    .line 201
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->g(Ljava/lang/Object;)I

    .line 207
    move-result p1

    .line 208
    .line 209
    .line 210
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 211
    move-result p0

    .line 212
    .line 213
    .line 214
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    move-result-object p0

    .line 216
    return-object p0

    .line 217
    .line 218
    .line 219
    :cond_a
    invoke-static {p0, p2}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 220
    move-result-object p0

    .line 221
    .line 222
    if-eqz p0, :cond_11

    .line 223
    return-object p0

    .line 224
    .line 225
    :cond_b
    const-string v0, "secure"

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    move-result p1

    .line 230
    .line 231
    if-eqz p1, :cond_12

    .line 232
    .line 233
    .line 234
    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    .line 235
    move-result p1

    .line 236
    .line 237
    .line 238
    sparse-switch p1, :sswitch_data_2

    .line 239
    goto :goto_4

    .line 240
    .line 241
    .line 242
    :sswitch_8
    invoke-virtual {p3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    move-result p1

    .line 244
    .line 245
    if-eqz p1, :cond_c

    .line 246
    move v2, v9

    .line 247
    goto :goto_5

    .line 248
    .line 249
    .line 250
    :sswitch_9
    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    move-result p1

    .line 252
    .line 253
    if-eqz p1, :cond_c

    .line 254
    move v2, v8

    .line 255
    goto :goto_5

    .line 256
    .line 257
    .line 258
    :sswitch_a
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    move-result p1

    .line 260
    .line 261
    if-eqz p1, :cond_c

    .line 262
    goto :goto_5

    .line 263
    .line 264
    .line 265
    :sswitch_b
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    move-result p1

    .line 267
    .line 268
    if-eqz p1, :cond_c

    .line 269
    move v2, v7

    .line 270
    goto :goto_5

    .line 271
    :cond_c
    :goto_4
    move v2, v6

    .line 272
    .line 273
    :goto_5
    if-eqz v2, :cond_10

    .line 274
    .line 275
    if-eq v2, v7, :cond_f

    .line 276
    .line 277
    if-eq v2, v9, :cond_e

    .line 278
    .line 279
    if-eq v2, v8, :cond_d

    .line 280
    goto :goto_6

    .line 281
    .line 282
    .line 283
    :cond_d
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->i(Ljava/lang/Object;)J

    .line 284
    move-result-wide p3

    .line 285
    .line 286
    .line 287
    invoke-static {p0, p2, p3, p4}, Landroid/provider/Settings$Secure;->getLong(Landroid/content/ContentResolver;Ljava/lang/String;J)J

    .line 288
    move-result-wide p0

    .line 289
    .line 290
    .line 291
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    .line 295
    .line 296
    :cond_e
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->h(Ljava/lang/Object;)F

    .line 297
    move-result p1

    .line 298
    .line 299
    .line 300
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$Secure;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 301
    move-result p0

    .line 302
    .line 303
    .line 304
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 305
    move-result-object p0

    .line 306
    return-object p0

    .line 307
    .line 308
    .line 309
    :cond_f
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->g(Ljava/lang/Object;)I

    .line 310
    move-result p1

    .line 311
    .line 312
    .line 313
    invoke-static {p0, p2, p1}, Landroid/provider/Settings$Secure;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 314
    move-result p0

    .line 315
    .line 316
    .line 317
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    move-result-object p0

    .line 319
    return-object p0

    .line 320
    .line 321
    .line 322
    :cond_10
    invoke-static {p0, p2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 323
    move-result-object p0

    .line 324
    .line 325
    if-eqz p0, :cond_11

    .line 326
    return-object p0

    .line 327
    .line 328
    .line 329
    :cond_11
    invoke-static {p4}, Lcom/forter/mobile/fortersdk/g0;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 330
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    return-object p0

    .line 332
    :catchall_0
    :cond_12
    :goto_6
    const/4 p0, 0x0

    .line 333
    return-object p0

    .line 334
    nop

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
    :sswitch_data_0
    .sparse-switch
        0x197ef -> :sswitch_3
        0x1be31 -> :sswitch_2
        0x32c67c -> :sswitch_1
        0x5d0225c -> :sswitch_0
    .end sparse-switch

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
    :sswitch_data_1
    .sparse-switch
        0x197ef -> :sswitch_7
        0x1be31 -> :sswitch_6
        0x32c67c -> :sswitch_5
        0x5d0225c -> :sswitch_4
    .end sparse-switch

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
    :sswitch_data_2
    .sparse-switch
        0x197ef -> :sswitch_b
        0x1be31 -> :sswitch_a
        0x32c67c -> :sswitch_9
        0x5d0225c -> :sswitch_8
    .end sparse-switch
.end method

.method public static b(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    .line 7
    :try_start_0
    const-string v1, "deviceSettings"

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/b0;->b(Ljava/lang/String;)[Lcom/forter/mobile/fortersdk/h;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    .line 17
    .line 18
    :cond_0
    const-string/jumbo v2, "settings"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lcom/forter/mobile/fortersdk/b3;->i([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONArray;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/f3;->s(Lorg/json/JSONArray;)Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    goto :goto_0

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v0}, Lcom/forter/mobile/fortersdk/f0;->c(Landroid/content/ContentResolver;Lorg/json/JSONArray;Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :catchall_0
    :cond_2
    :goto_0
    return-object v0
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
.end method

.method public static c(Landroid/content/ContentResolver;Lorg/json/JSONArray;Lorg/json/JSONObject;)V
    .locals 6
    .param p0    # Landroid/content/ContentResolver;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lorg/json/JSONArray;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 5
    move-result v1

    .line 6
    .line 7
    if-ge v0, v1, :cond_3

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    const-string v2, "name"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v3, "scope"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    .line 28
    const-string/jumbo v4, "type"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    move-result v5

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    const-string v5, "global"

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    move-result v5

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    .line 49
    const-string/jumbo v5, "system"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result v5

    .line 54
    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    const-string v5, "secure"

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    move-result v5

    .line 62
    .line 63
    if-eqz v5, :cond_2

    .line 64
    .line 65
    .line 66
    :cond_0
    const-string/jumbo v5, "str"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    move-result v5

    .line 71
    .line 72
    if-nez v5, :cond_1

    .line 73
    .line 74
    const-string v5, "int"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    move-result v5

    .line 79
    .line 80
    if-nez v5, :cond_1

    .line 81
    .line 82
    const-string v5, "float"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    move-result v5

    .line 87
    .line 88
    if-nez v5, :cond_1

    .line 89
    .line 90
    const-string v5, "long"

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    move-result v5

    .line 95
    .line 96
    if-eqz v5, :cond_2

    .line 97
    .line 98
    .line 99
    :cond_1
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/g0;->f(Lorg/json/JSONObject;)Z

    .line 100
    move-result v5

    .line 101
    .line 102
    if-eqz v5, :cond_2

    .line 103
    .line 104
    const-string v5, "def"

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v5, v4}, Lcom/forter/mobile/fortersdk/g0;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 108
    move-result-object v5

    .line 109
    .line 110
    .line 111
    invoke-static {p0, v3, v2, v4, v5}, Lcom/forter/mobile/fortersdk/f0;->a(Landroid/content/ContentResolver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    move-result-object v3

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v3, v4, v1, p2}, Lcom/forter/mobile/fortersdk/g0;->e(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    .line 116
    .line 117
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
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
