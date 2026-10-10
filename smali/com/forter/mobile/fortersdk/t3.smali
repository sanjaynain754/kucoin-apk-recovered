.class public abstract Lcom/forter/mobile/fortersdk/t3;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->y()Ljava/util/concurrent/ExecutorService;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 7
    return-void
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
.end method

.method public static a(Lcom/forter/mobile/fortersdk/models/NavigationType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/forter/mobile/fortersdk/v3;
    .locals 1
    .param p0    # Lcom/forter/mobile/fortersdk/models/NavigationType;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/forter/mobile/fortersdk/m3;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/forter/mobile/fortersdk/m3;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/f3;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    iput-object p0, v0, Lcom/forter/mobile/fortersdk/m3;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p1, v0, Lcom/forter/mobile/fortersdk/m3;->d:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p2, v0, Lcom/forter/mobile/fortersdk/m3;->e:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p3, v0, Lcom/forter/mobile/fortersdk/m3;->f:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p4, v0, Lcom/forter/mobile/fortersdk/m3;->g:Ljava/lang/String;

    .line 24
    return-object v0
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
    .line 381
.end method

.method public static b()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/forter/mobile/fortersdk/t3$c;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$b;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method

.method public static d(Landroid/content/Context;Landroid/location/Location;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/location/Location;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0x12
    .end annotation

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$h;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/t3$h;-><init>(Landroid/content/Context;Landroid/location/Location;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
    .line 57
    .line 58
    .line 59
.end method

.method public static e(Landroid/content/Intent;)V
    .locals 2
    .param p0    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$g;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$g;-><init>(Landroid/content/Intent;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method

.method public static f(Ljava/lang/String;Lcom/forter/mobile/fortersdk/z3;)V
    .locals 2
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/forter/mobile/fortersdk/z3;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/t3$i;-><init>(Ljava/lang/String;Lcom/forter/mobile/fortersdk/z3;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
    .line 57
    .line 58
    .line 59
.end method

.method public static g(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$d;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$d;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method

.method public static h(Landroid/content/Context;)Lcom/forter/mobile/fortersdk/g3;
    .locals 23
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "deviceFirstBoot"

    .line 5
    .line 6
    const-string v2, "deviceSleepTime"

    .line 7
    .line 8
    const-string v3, "deviceUptime"

    .line 9
    .line 10
    const-string v4, "deviceName"

    .line 11
    .line 12
    const-string v5, "deviceType"

    .line 13
    .line 14
    const-string v6, "currency"

    .line 15
    .line 16
    const-string v7, "appLocale"

    .line 17
    .line 18
    const-string v8, "locale"

    .line 19
    .line 20
    const-string v9, "appInfo"

    .line 21
    .line 22
    const-string v10, "sdkVer"

    .line 23
    .line 24
    const-string v11, "appVer"

    .line 25
    .line 26
    const-string v12, "availableDrmEngines"

    .line 27
    .line 28
    const-string v13, "installationID"

    .line 29
    .line 30
    const-string v14, "deviceAppUID"

    .line 31
    .line 32
    const-string v15, "deviceUID"

    .line 33
    .line 34
    const-string v16, "app/active"

    .line 35
    .line 36
    move-object/from16 v17, v1

    .line 37
    .line 38
    new-instance v1, Lcom/forter/mobile/fortersdk/g3;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Lcom/forter/mobile/fortersdk/g3;-><init>()V

    .line 42
    .line 43
    move-object/from16 v18, v2

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static/range {v16 .. v16}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    move-object/from16 v19, v3

    .line 50
    .line 51
    new-instance v3, Lcom/forter/mobile/fortersdk/f;

    .line 52
    .line 53
    .line 54
    invoke-direct {v3, v2}, Lcom/forter/mobile/fortersdk/f;-><init>(Lcom/forter/mobile/fortersdk/g;)V

    .line 55
    .line 56
    if-eqz v2, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/forter/mobile/fortersdk/g;->a()Z

    .line 60
    move-result v2

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    goto/16 :goto_f

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    .line 67
    goto/16 :goto_e

    .line 68
    .line 69
    .line 70
    :cond_0
    invoke-virtual {v3, v15}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 71
    move-result v2

    .line 72
    .line 73
    if-eqz v2, :cond_1

    .line 74
    .line 75
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 76
    .line 77
    move-object/from16 v20, v4

    .line 78
    .line 79
    .line 80
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 81
    move-result-object v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4, v0}, Lcom/forter/mobile/fortersdk/c;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v15, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_1
    move-object/from16 v20, v4

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-virtual {v3, v14}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 95
    move-result v2

    .line 96
    .line 97
    if-eqz v2, :cond_2

    .line 98
    .line 99
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4, v0}, Lcom/forter/mobile/fortersdk/c;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2, v14, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {v3, v13}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 114
    move-result v2

    .line 115
    .line 116
    if-eqz v2, :cond_3

    .line 117
    .line 118
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 119
    .line 120
    .line 121
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/f3;->c(Landroid/content/Context;)Ljava/lang/String;

    .line 122
    move-result-object v4

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v13, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    :cond_3
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/d0;->d(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 129
    move-result-object v2

    .line 130
    .line 131
    if-eqz v2, :cond_4

    .line 132
    .line 133
    iget-object v4, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 134
    .line 135
    const-string v13, "deviceUIDs"

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    :cond_4
    invoke-static {}, Lcom/forter/mobile/fortersdk/e0;->e()Lorg/json/JSONObject;

    .line 142
    move-result-object v2

    .line 143
    .line 144
    if-eqz v2, :cond_5

    .line 145
    .line 146
    iget-object v4, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 147
    .line 148
    const-string v13, "dri"

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    .line 153
    .line 154
    :cond_5
    invoke-virtual {v3, v12}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 155
    move-result v2

    .line 156
    .line 157
    if-eqz v2, :cond_6

    .line 158
    .line 159
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 160
    .line 161
    .line 162
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/e0;->d(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 163
    move-result-object v4

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v12, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {v3, v11}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 170
    move-result v2

    .line 171
    .line 172
    if-eqz v2, :cond_7

    .line 173
    .line 174
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/f3;->D(Landroid/content/Context;)Ljava/lang/String;

    .line 178
    move-result-object v4

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2, v11, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v3, v10}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 185
    move-result v2

    .line 186
    .line 187
    if-eqz v2, :cond_8

    .line 188
    .line 189
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 190
    .line 191
    .line 192
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->K()Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2, v10, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 197
    .line 198
    .line 199
    :cond_8
    invoke-virtual {v3, v9}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 200
    move-result v2

    .line 201
    .line 202
    if-eqz v2, :cond_9

    .line 203
    .line 204
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    invoke-static {v0, v3}, Lcom/forter/mobile/fortersdk/f3;->n(Landroid/content/Context;Lcom/forter/mobile/fortersdk/f;)Lorg/json/JSONObject;

    .line 208
    move-result-object v4

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 212
    .line 213
    .line 214
    :cond_9
    invoke-virtual {v3, v8}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 215
    move-result v2

    .line 216
    .line 217
    if-eqz v2, :cond_a

    .line 218
    .line 219
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 220
    .line 221
    .line 222
    invoke-static {}, Landroid/os/LocaleList;->getDefault()Landroid/os/LocaleList;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 227
    move-result-object v4

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v8, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 231
    .line 232
    .line 233
    :cond_a
    invoke-virtual {v3, v7}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 234
    move-result v2

    .line 235
    .line 236
    if-eqz v2, :cond_c

    .line 237
    .line 238
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 242
    move-result-object v4

    .line 243
    .line 244
    if-eqz v4, :cond_b

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 248
    move-result-object v4

    .line 249
    .line 250
    if-eqz v4, :cond_b

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    .line 254
    move-result-object v4

    .line 255
    .line 256
    .line 257
    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    .line 258
    move-result-object v4

    .line 259
    goto :goto_1

    .line 260
    .line 261
    :cond_b
    const-string v4, ""

    .line 262
    .line 263
    .line 264
    :goto_1
    invoke-virtual {v2, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 265
    .line 266
    :cond_c
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 267
    const/4 v7, 0x1

    .line 268
    .line 269
    :try_start_1
    const-string v9, "mobileNet"

    .line 270
    .line 271
    .line 272
    invoke-static {v9}, Lcom/forter/mobile/fortersdk/b0;->b(Ljava/lang/String;)[Lcom/forter/mobile/fortersdk/h;

    .line 273
    move-result-object v9

    .line 274
    .line 275
    if-eqz v9, :cond_d

    .line 276
    .line 277
    .line 278
    const-string/jumbo v10, "tel"

    .line 279
    .line 280
    .line 281
    invoke-static {v9, v10}, Lcom/forter/mobile/fortersdk/b3;->h([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 282
    move-result-object v10

    .line 283
    .line 284
    .line 285
    const-string/jumbo v11, "sub"

    .line 286
    .line 287
    .line 288
    invoke-static {v9, v11}, Lcom/forter/mobile/fortersdk/b3;->h([Lcom/forter/mobile/fortersdk/h;Ljava/lang/String;)Lorg/json/JSONObject;

    .line 289
    move-result-object v9

    .line 290
    goto :goto_2

    .line 291
    :cond_d
    const/4 v9, 0x0

    .line 292
    const/4 v10, 0x0

    .line 293
    .line 294
    .line 295
    :goto_2
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/i2;->J(Landroid/content/Context;)Landroid/telephony/TelephonyManager;

    .line 296
    move-result-object v11

    .line 297
    .line 298
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 299
    .line 300
    const/16 v13, 0x1a

    .line 301
    .line 302
    if-lt v12, v13, :cond_e

    .line 303
    .line 304
    .line 305
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->H(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->Q(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 309
    .line 310
    .line 311
    :cond_e
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->X(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->c0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 315
    .line 316
    .line 317
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->g0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 318
    .line 319
    const/16 v14, 0x1d

    .line 320
    .line 321
    if-lt v12, v14, :cond_f

    .line 322
    .line 323
    .line 324
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->j0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 325
    .line 326
    .line 327
    :cond_f
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->m0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 328
    .line 329
    .line 330
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->p0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 331
    .line 332
    .line 333
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->s0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 334
    .line 335
    .line 336
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->v0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 337
    .line 338
    .line 339
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->y0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->B0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 343
    .line 344
    .line 345
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->D0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 346
    .line 347
    .line 348
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->F0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V

    .line 349
    .line 350
    .line 351
    invoke-static {v2, v10, v11}, Lcom/forter/mobile/fortersdk/i2;->H0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 352
    .line 353
    if-eqz v11, :cond_16

    .line 354
    .line 355
    .line 356
    const-string/jumbo v15, "simCards"

    .line 357
    .line 358
    if-eqz v10, :cond_10

    .line 359
    .line 360
    .line 361
    :try_start_2
    invoke-virtual {v10, v15, v7}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 362
    move-result v21

    .line 363
    .line 364
    if-eqz v21, :cond_16

    .line 365
    .line 366
    :cond_10
    const/16 v7, 0x1e

    .line 367
    .line 368
    if-lt v12, v7, :cond_11

    .line 369
    .line 370
    .line 371
    invoke-static {v11}, Lcom/forter/mobile/fortersdk/s3;->a(Landroid/telephony/TelephonyManager;)I

    .line 372
    move-result v7

    .line 373
    goto :goto_3

    .line 374
    .line 375
    .line 376
    :cond_11
    invoke-virtual {v11}, Landroid/telephony/TelephonyManager;->getPhoneCount()I

    .line 377
    move-result v7

    .line 378
    .line 379
    :goto_3
    if-lez v7, :cond_16

    .line 380
    .line 381
    new-instance v12, Lorg/json/JSONArray;

    .line 382
    .line 383
    .line 384
    invoke-direct {v12}, Lorg/json/JSONArray;-><init>()V

    .line 385
    const/4 v4, 0x0

    .line 386
    .line 387
    :goto_4
    if-ge v4, v7, :cond_15

    .line 388
    .line 389
    new-instance v8, Lorg/json/JSONObject;

    .line 390
    .line 391
    .line 392
    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 393
    .line 394
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 395
    .line 396
    if-lt v14, v13, :cond_12

    .line 397
    .line 398
    .line 399
    invoke-static {v8, v10, v11, v4}, Lcom/forter/mobile/fortersdk/i2;->I(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;I)V

    .line 400
    .line 401
    .line 402
    invoke-static {v8, v10, v11, v4}, Lcom/forter/mobile/fortersdk/i2;->R(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;I)V

    .line 403
    .line 404
    .line 405
    :cond_12
    invoke-static {v8, v10, v11, v4}, Lcom/forter/mobile/fortersdk/i2;->Y(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/TelephonyManager;I)V

    .line 406
    .line 407
    if-eqz v9, :cond_14

    .line 408
    .line 409
    .line 410
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/i2;->S(Landroid/content/Context;)Landroid/telephony/SubscriptionManager;

    .line 411
    move-result-object v13

    .line 412
    .line 413
    if-eqz v13, :cond_14

    .line 414
    .line 415
    .line 416
    invoke-static {v13, v4}, Lcom/forter/mobile/fortersdk/i2;->x(Landroid/telephony/SubscriptionManager;I)Landroid/telephony/SubscriptionInfo;

    .line 417
    move-result-object v13

    .line 418
    .line 419
    if-eqz v13, :cond_14

    .line 420
    .line 421
    .line 422
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->G(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 423
    .line 424
    .line 425
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->P(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 426
    .line 427
    .line 428
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->W(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->b0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 432
    .line 433
    .line 434
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->f0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 435
    .line 436
    .line 437
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->i0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 438
    .line 439
    .line 440
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->l0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 441
    .line 442
    move/from16 v22, v4

    .line 443
    .line 444
    const/16 v4, 0x1d

    .line 445
    .line 446
    if-lt v14, v4, :cond_13

    .line 447
    .line 448
    .line 449
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->o0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 450
    .line 451
    .line 452
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->r0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 453
    .line 454
    .line 455
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->u0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 456
    .line 457
    .line 458
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->x0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 459
    .line 460
    .line 461
    :cond_13
    invoke-static {v8, v9, v13}, Lcom/forter/mobile/fortersdk/i2;->A0(Lorg/json/JSONObject;Lorg/json/JSONObject;Landroid/telephony/SubscriptionInfo;)V

    .line 462
    goto :goto_5

    .line 463
    .line 464
    :cond_14
    move/from16 v22, v4

    .line 465
    .line 466
    const/16 v4, 0x1d

    .line 467
    .line 468
    .line 469
    :goto_5
    invoke-virtual {v12, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 470
    .line 471
    add-int/lit8 v8, v22, 0x1

    .line 472
    move v14, v4

    .line 473
    move v4, v8

    .line 474
    .line 475
    const/16 v13, 0x1a

    .line 476
    goto :goto_4

    .line 477
    .line 478
    .line 479
    :cond_15
    :try_start_3
    invoke-virtual {v2, v15, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 480
    .line 481
    .line 482
    :catch_0
    :catchall_1
    :cond_16
    :try_start_4
    invoke-virtual {v3, v6}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 483
    move-result v2

    .line 484
    .line 485
    if-eqz v2, :cond_17

    .line 486
    .line 487
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 488
    .line 489
    .line 490
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->v(Landroid/content/Context;)Ljava/lang/String;

    .line 491
    move-result-object v4

    .line 492
    .line 493
    .line 494
    invoke-virtual {v2, v6, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 495
    .line 496
    .line 497
    :cond_17
    invoke-virtual {v3, v5}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 498
    move-result v2

    .line 499
    .line 500
    if-eqz v2, :cond_18

    .line 501
    .line 502
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 503
    const/4 v4, 0x0

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 507
    .line 508
    :goto_6
    move-object/from16 v2, v20

    .line 509
    goto :goto_7

    .line 510
    :cond_18
    const/4 v4, 0x0

    .line 511
    goto :goto_6

    .line 512
    .line 513
    .line 514
    :goto_7
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 515
    move-result v5

    .line 516
    .line 517
    if-eqz v5, :cond_19

    .line 518
    .line 519
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 520
    .line 521
    const-string v6, "N/A"

    .line 522
    .line 523
    .line 524
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 525
    .line 526
    :cond_19
    move-object/from16 v2, v19

    .line 527
    .line 528
    .line 529
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 530
    move-result v5

    .line 531
    .line 532
    if-eqz v5, :cond_1a

    .line 533
    .line 534
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 535
    .line 536
    .line 537
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 538
    move-result-wide v6

    .line 539
    .line 540
    .line 541
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 542
    move-result-object v6

    .line 543
    .line 544
    .line 545
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 546
    .line 547
    :cond_1a
    move-object/from16 v2, v18

    .line 548
    .line 549
    .line 550
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 551
    move-result v5

    .line 552
    .line 553
    if-eqz v5, :cond_1b

    .line 554
    .line 555
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 556
    .line 557
    .line 558
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 559
    move-result-wide v6

    .line 560
    .line 561
    .line 562
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 563
    move-result-wide v8

    .line 564
    sub-long/2addr v6, v8

    .line 565
    .line 566
    .line 567
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 568
    move-result-object v6

    .line 569
    .line 570
    .line 571
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 572
    .line 573
    :cond_1b
    move-object/from16 v2, v17

    .line 574
    .line 575
    .line 576
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 577
    move-result v5

    .line 578
    .line 579
    if-eqz v5, :cond_1c

    .line 580
    .line 581
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 582
    .line 583
    .line 584
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->I()Ljava/lang/String;

    .line 585
    move-result-object v6

    .line 586
    .line 587
    .line 588
    invoke-virtual {v5, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 589
    .line 590
    :cond_1c
    const-string v2, "deviceBootCount"

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 594
    move-result v2

    .line 595
    .line 596
    if-eqz v2, :cond_1d

    .line 597
    .line 598
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 599
    .line 600
    const-string v5, "deviceBootCount"

    .line 601
    .line 602
    .line 603
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/f3;->M(Landroid/content/Context;)I

    .line 604
    move-result v6

    .line 605
    .line 606
    .line 607
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 608
    .line 609
    .line 610
    :cond_1d
    const-string/jumbo v2, "userFormatLocalTime"

    .line 611
    .line 612
    .line 613
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 614
    move-result v2

    .line 615
    .line 616
    if-eqz v2, :cond_1e

    .line 617
    .line 618
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 619
    .line 620
    .line 621
    const-string/jumbo v5, "userFormatLocalTime"

    .line 622
    .line 623
    .line 624
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->z()Ljava/lang/String;

    .line 625
    move-result-object v6

    .line 626
    .line 627
    .line 628
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 629
    .line 630
    :cond_1e
    const-string v2, "normalizedLocalTime"

    .line 631
    .line 632
    .line 633
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 634
    move-result v2

    .line 635
    .line 636
    if-eqz v2, :cond_1f

    .line 637
    .line 638
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 639
    .line 640
    const-string v5, "normalizedLocalTime"

    .line 641
    .line 642
    .line 643
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->C()Ljava/lang/String;

    .line 644
    move-result-object v6

    .line 645
    .line 646
    .line 647
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 648
    .line 649
    .line 650
    :cond_1f
    const-string/jumbo v2, "timeZoneName"

    .line 651
    .line 652
    .line 653
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 654
    move-result v2

    .line 655
    .line 656
    if-eqz v2, :cond_20

    .line 657
    .line 658
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 659
    .line 660
    .line 661
    const-string/jumbo v5, "timeZoneName"

    .line 662
    .line 663
    .line 664
    invoke-static {}, Lcom/forter/mobile/fortersdk/f3;->F()Ljava/lang/String;

    .line 665
    move-result-object v6

    .line 666
    .line 667
    .line 668
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 669
    .line 670
    :cond_20
    const-string v2, "displayResolution"

    .line 671
    .line 672
    .line 673
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 674
    move-result v2

    .line 675
    .line 676
    if-eqz v2, :cond_21

    .line 677
    .line 678
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 679
    .line 680
    const-string v5, "displayResolution"

    .line 681
    .line 682
    .line 683
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->I(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    .line 684
    move-result-object v6

    .line 685
    .line 686
    .line 687
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->n(Landroid/util/DisplayMetrics;)Ljava/lang/String;

    .line 688
    move-result-object v6

    .line 689
    .line 690
    .line 691
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 692
    .line 693
    :cond_21
    const-string v2, "realDisplayResolution"

    .line 694
    .line 695
    .line 696
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 697
    move-result v2

    .line 698
    .line 699
    if-eqz v2, :cond_22

    .line 700
    .line 701
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 702
    .line 703
    const-string v5, "realDisplayResolution"

    .line 704
    .line 705
    .line 706
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->K(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    .line 707
    move-result-object v6

    .line 708
    .line 709
    .line 710
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->n(Landroid/util/DisplayMetrics;)Ljava/lang/String;

    .line 711
    move-result-object v6

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 715
    .line 716
    :cond_22
    const-string v2, "displaySize"

    .line 717
    .line 718
    .line 719
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 720
    move-result v2

    .line 721
    .line 722
    if-eqz v2, :cond_24

    .line 723
    .line 724
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 725
    .line 726
    const-string v5, "displaySize"

    .line 727
    .line 728
    .line 729
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->K(Landroid/content/Context;)Landroid/util/DisplayMetrics;

    .line 730
    move-result-object v6

    .line 731
    .line 732
    if-eqz v6, :cond_23

    .line 733
    .line 734
    iget v7, v6, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 735
    int-to-double v7, v7

    .line 736
    .line 737
    iget v9, v6, Landroid/util/DisplayMetrics;->xdpi:F

    .line 738
    float-to-double v9, v9

    .line 739
    div-double/2addr v7, v9

    .line 740
    .line 741
    iget v9, v6, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 742
    int-to-double v9, v9

    .line 743
    .line 744
    iget v6, v6, Landroid/util/DisplayMetrics;->ydpi:F

    .line 745
    float-to-double v11, v6

    .line 746
    div-double/2addr v9, v11

    .line 747
    .line 748
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 749
    .line 750
    .line 751
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 752
    move-result-wide v6

    .line 753
    .line 754
    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    .line 755
    .line 756
    .line 757
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    .line 758
    move-result-wide v8

    .line 759
    add-double/2addr v6, v8

    .line 760
    .line 761
    .line 762
    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    .line 763
    move-result-wide v6

    .line 764
    .line 765
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    .line 766
    mul-double/2addr v6, v8

    .line 767
    .line 768
    .line 769
    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    .line 770
    move-result-wide v6

    .line 771
    long-to-double v6, v6

    .line 772
    .line 773
    const-wide/high16 v8, 0x4059000000000000L    # 100.0

    .line 774
    div-double/2addr v6, v8

    .line 775
    .line 776
    .line 777
    invoke-static {v6, v7}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    .line 778
    move-result-object v6

    .line 779
    goto :goto_8

    .line 780
    .line 781
    :cond_23
    const-string v6, "FAILURE"

    .line 782
    .line 783
    .line 784
    :goto_8
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 785
    .line 786
    :cond_24
    const-string v2, "availableStorageCapacity"

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 790
    move-result v2

    .line 791
    .line 792
    if-eqz v2, :cond_25

    .line 793
    .line 794
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 795
    .line 796
    const-string v5, "availableStorageCapacity"

    .line 797
    .line 798
    .line 799
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 800
    move-result-object v6

    .line 801
    .line 802
    .line 803
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 804
    move-result-object v6

    .line 805
    .line 806
    .line 807
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->j(Ljava/lang/String;)J

    .line 808
    move-result-wide v6

    .line 809
    .line 810
    .line 811
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 812
    move-result-object v6

    .line 813
    .line 814
    .line 815
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 816
    .line 817
    .line 818
    :cond_25
    const-string/jumbo v2, "totalStorageCapacity"

    .line 819
    .line 820
    .line 821
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 822
    move-result v2

    .line 823
    .line 824
    if-eqz v2, :cond_26

    .line 825
    .line 826
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 827
    .line 828
    .line 829
    const-string/jumbo v5, "totalStorageCapacity"

    .line 830
    .line 831
    .line 832
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    .line 833
    move-result-object v6

    .line 834
    .line 835
    .line 836
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 837
    move-result-object v6

    .line 838
    .line 839
    .line 840
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->t(Ljava/lang/String;)J

    .line 841
    move-result-wide v6

    .line 842
    .line 843
    .line 844
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 845
    move-result-object v6

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 849
    .line 850
    :cond_26
    const-string v2, "availableExtStorageCapacity"

    .line 851
    .line 852
    .line 853
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 854
    move-result v2

    .line 855
    .line 856
    .line 857
    const-string/jumbo v5, "totalExtStorageCapacity"

    .line 858
    .line 859
    .line 860
    invoke-virtual {v3, v5}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 861
    move-result v5

    .line 862
    .line 863
    if-nez v2, :cond_27

    .line 864
    .line 865
    if-eqz v5, :cond_29

    .line 866
    .line 867
    .line 868
    :cond_27
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->B(Landroid/content/Context;)Ljava/lang/String;

    .line 869
    move-result-object v6

    .line 870
    .line 871
    .line 872
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 873
    move-result v7

    .line 874
    .line 875
    if-nez v7, :cond_29

    .line 876
    .line 877
    if-eqz v2, :cond_28

    .line 878
    .line 879
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 880
    .line 881
    const-string v7, "availableExtStorageCapacity"

    .line 882
    .line 883
    .line 884
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->j(Ljava/lang/String;)J

    .line 885
    move-result-wide v8

    .line 886
    .line 887
    .line 888
    invoke-static {v8, v9}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 889
    move-result-object v8

    .line 890
    .line 891
    .line 892
    invoke-virtual {v2, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 893
    .line 894
    :cond_28
    if-eqz v5, :cond_29

    .line 895
    .line 896
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 897
    .line 898
    .line 899
    const-string/jumbo v5, "totalExtStorageCapacity"

    .line 900
    .line 901
    .line 902
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->t(Ljava/lang/String;)J

    .line 903
    move-result-wide v6

    .line 904
    .line 905
    .line 906
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 907
    move-result-object v6

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 911
    .line 912
    :cond_29
    const-string v2, "availableSystemCapacity"

    .line 913
    .line 914
    .line 915
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 916
    move-result v2

    .line 917
    .line 918
    if-eqz v2, :cond_2a

    .line 919
    .line 920
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 921
    .line 922
    const-string v5, "availableSystemCapacity"

    .line 923
    .line 924
    .line 925
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 926
    move-result-object v6

    .line 927
    .line 928
    .line 929
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 930
    move-result-object v6

    .line 931
    .line 932
    .line 933
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->j(Ljava/lang/String;)J

    .line 934
    move-result-wide v6

    .line 935
    .line 936
    .line 937
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 938
    move-result-object v6

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 942
    .line 943
    .line 944
    :cond_2a
    const-string/jumbo v2, "totalSystemCapacity"

    .line 945
    .line 946
    .line 947
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 948
    move-result v2

    .line 949
    .line 950
    if-eqz v2, :cond_2b

    .line 951
    .line 952
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 953
    .line 954
    .line 955
    const-string/jumbo v5, "totalSystemCapacity"

    .line 956
    .line 957
    .line 958
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 959
    move-result-object v6

    .line 960
    .line 961
    .line 962
    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 963
    move-result-object v6

    .line 964
    .line 965
    .line 966
    invoke-static {v6}, Lcom/forter/mobile/fortersdk/a3;->t(Ljava/lang/String;)J

    .line 967
    move-result-wide v6

    .line 968
    .line 969
    .line 970
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 971
    move-result-object v6

    .line 972
    .line 973
    .line 974
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 975
    .line 976
    .line 977
    :cond_2b
    const-string/jumbo v2, "totalMemoryCapacity"

    .line 978
    .line 979
    .line 980
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 981
    move-result v2

    .line 982
    .line 983
    if-eqz v2, :cond_2c

    .line 984
    .line 985
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 986
    .line 987
    .line 988
    const-string/jumbo v5, "totalMemoryCapacity"

    .line 989
    .line 990
    .line 991
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->F(Landroid/content/Context;)J

    .line 992
    move-result-wide v6

    .line 993
    .line 994
    .line 995
    invoke-static {v6, v7}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 996
    move-result-object v6

    .line 997
    .line 998
    .line 999
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1000
    .line 1001
    :cond_2c
    const-string v2, "cpuCount"

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1005
    move-result v2

    .line 1006
    .line 1007
    if-eqz v2, :cond_2d

    .line 1008
    .line 1009
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1010
    .line 1011
    const-string v5, "cpuCount"

    .line 1012
    .line 1013
    .line 1014
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->E()I

    .line 1015
    move-result v6

    .line 1016
    .line 1017
    .line 1018
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 1019
    move-result-object v6

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1023
    .line 1024
    .line 1025
    :cond_2d
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->L()Lorg/json/JSONObject;

    .line 1026
    move-result-object v2

    .line 1027
    .line 1028
    if-eqz v2, :cond_2e

    .line 1029
    .line 1030
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1031
    .line 1032
    const-string v6, "cpuInfo"

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1036
    .line 1037
    :cond_2e
    const-string v2, "gpuInfo"

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1041
    move-result v2

    .line 1042
    .line 1043
    if-eqz v2, :cond_2f

    .line 1044
    .line 1045
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1046
    .line 1047
    const-string v5, "gpuInfo"

    .line 1048
    .line 1049
    .line 1050
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->P()Lorg/json/JSONObject;

    .line 1051
    move-result-object v6

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1055
    .line 1056
    :cond_2f
    const-string v2, "glVersion"

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1060
    move-result v2

    .line 1061
    .line 1062
    if-eqz v2, :cond_31

    .line 1063
    .line 1064
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1065
    .line 1066
    const-string v5, "glVersion"

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1070
    move-result-object v6

    .line 1071
    .line 1072
    if-eqz v6, :cond_30

    .line 1073
    .line 1074
    const-string v7, "activity"

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1078
    move-result-object v6

    .line 1079
    .line 1080
    check-cast v6, Landroid/app/ActivityManager;

    .line 1081
    .line 1082
    if-eqz v6, :cond_30

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v6}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    .line 1086
    move-result-object v6

    .line 1087
    .line 1088
    if-eqz v6, :cond_30

    .line 1089
    .line 1090
    iget v6, v6, Landroid/content/pm/ConfigurationInfo;->reqGlEsVersion:I

    .line 1091
    .line 1092
    const/high16 v7, -0x10000

    .line 1093
    and-int/2addr v6, v7

    .line 1094
    .line 1095
    shr-int/lit8 v7, v6, 0x10

    .line 1096
    goto :goto_9

    .line 1097
    :cond_30
    const/4 v7, 0x1

    .line 1098
    .line 1099
    .line 1100
    :goto_9
    invoke-virtual {v2, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1101
    .line 1102
    :cond_31
    const-string v2, "secondaryDisplays"

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1106
    move-result v2

    .line 1107
    .line 1108
    if-eqz v2, :cond_32

    .line 1109
    .line 1110
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1111
    .line 1112
    const-string v5, "secondaryDisplays"

    .line 1113
    .line 1114
    .line 1115
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->c0(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 1116
    move-result-object v6

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1120
    .line 1121
    :cond_32
    const-string v2, "osVersion"

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1125
    move-result v2

    .line 1126
    .line 1127
    if-eqz v2, :cond_33

    .line 1128
    .line 1129
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1130
    .line 1131
    const-string v5, "osVersion"

    .line 1132
    .line 1133
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1137
    .line 1138
    sget-object v7, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1142
    .line 1143
    const-string v7, " (API"

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1147
    .line 1148
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1152
    .line 1153
    const-string v7, ")"

    .line 1154
    .line 1155
    .line 1156
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1160
    move-result-object v6

    .line 1161
    .line 1162
    .line 1163
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1164
    .line 1165
    :cond_33
    const-string v2, "osBuild"

    .line 1166
    .line 1167
    .line 1168
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1169
    move-result v2

    .line 1170
    .line 1171
    if-eqz v2, :cond_34

    .line 1172
    .line 1173
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1174
    .line 1175
    const-string v5, "osBuild"

    .line 1176
    .line 1177
    sget-object v6, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1181
    .line 1182
    .line 1183
    :cond_34
    const-string/jumbo v2, "vendor"

    .line 1184
    .line 1185
    .line 1186
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1187
    move-result v2

    .line 1188
    .line 1189
    if-eqz v2, :cond_35

    .line 1190
    .line 1191
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1192
    .line 1193
    .line 1194
    const-string/jumbo v5, "vendor"

    .line 1195
    .line 1196
    sget-object v6, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1200
    .line 1201
    :cond_35
    const-string v2, "platform"

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1205
    move-result v2

    .line 1206
    .line 1207
    if-eqz v2, :cond_36

    .line 1208
    .line 1209
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1210
    .line 1211
    const-string v5, "platform"

    .line 1212
    .line 1213
    const-string v6, "Android"

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1217
    .line 1218
    :cond_36
    const-string v2, "defaultBrowser"

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1222
    move-result v2

    .line 1223
    .line 1224
    if-eqz v2, :cond_37

    .line 1225
    .line 1226
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1227
    .line 1228
    const-string v5, "defaultBrowser"

    .line 1229
    .line 1230
    .line 1231
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->u()Ljava/lang/String;

    .line 1232
    move-result-object v6

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1236
    .line 1237
    .line 1238
    :cond_37
    const-string/jumbo v2, "wvPkg"

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1242
    move-result v2

    .line 1243
    .line 1244
    if-eqz v2, :cond_38

    .line 1245
    .line 1246
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1247
    .line 1248
    .line 1249
    const-string/jumbo v5, "wvPkg"

    .line 1250
    .line 1251
    .line 1252
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->A()Ljava/lang/String;

    .line 1253
    move-result-object v6

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1257
    .line 1258
    :cond_38
    const-string v2, "romBuildInfo"

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1262
    move-result v2

    .line 1263
    .line 1264
    if-eqz v2, :cond_39

    .line 1265
    .line 1266
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1267
    .line 1268
    const-string v5, "romBuildInfo"

    .line 1269
    .line 1270
    .line 1271
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->p()Lorg/json/JSONObject;

    .line 1272
    move-result-object v6

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1276
    .line 1277
    :cond_39
    const-string v2, "kernelInfo"

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1281
    move-result v2

    .line 1282
    .line 1283
    if-eqz v2, :cond_3a

    .line 1284
    .line 1285
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1286
    .line 1287
    const-string v5, "kernelInfo"

    .line 1288
    .line 1289
    .line 1290
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->N()Lorg/json/JSONObject;

    .line 1291
    move-result-object v6

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1295
    .line 1296
    .line 1297
    :cond_3a
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->T()Lorg/json/JSONObject;

    .line 1298
    move-result-object v2

    .line 1299
    .line 1300
    if-eqz v2, :cond_3b

    .line 1301
    .line 1302
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1303
    .line 1304
    const-string v6, "environ"

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1308
    .line 1309
    :cond_3b
    const-string v2, "isSimulator"

    .line 1310
    .line 1311
    .line 1312
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1313
    move-result v2

    .line 1314
    .line 1315
    if-eqz v2, :cond_3c

    .line 1316
    .line 1317
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1318
    .line 1319
    const-string v5, "isSimulator"

    .line 1320
    .line 1321
    .line 1322
    invoke-static {}, Lcom/forter/mobile/fortersdk/i0;->a()Ljava/lang/String;

    .line 1323
    move-result-object v6

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1327
    .line 1328
    :cond_3c
    const-string v2, "isJailbroken"

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1332
    move-result v2

    .line 1333
    .line 1334
    if-eqz v2, :cond_40

    .line 1335
    .line 1336
    .line 1337
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 1338
    move-result-object v2

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v2}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 1342
    move-result-object v2

    .line 1343
    .line 1344
    if-eqz v2, :cond_3d

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v2}, Lt7/a;->v()Ljava/lang/Boolean;

    .line 1348
    move-result-object v2

    .line 1349
    goto :goto_a

    .line 1350
    :cond_3d
    move-object v2, v4

    .line 1351
    .line 1352
    :goto_a
    if-eqz v2, :cond_3e

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1356
    move-result v5

    .line 1357
    .line 1358
    if-nez v5, :cond_3f

    .line 1359
    .line 1360
    .line 1361
    :cond_3e
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->b0(Landroid/content/Context;)Ljava/lang/Boolean;

    .line 1362
    move-result-object v2

    .line 1363
    .line 1364
    :cond_3f
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1365
    .line 1366
    const-string v6, "isJailbroken"

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v5, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1370
    .line 1371
    :cond_40
    const-string v2, "hooks"

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1375
    move-result v2

    .line 1376
    .line 1377
    if-eqz v2, :cond_41

    .line 1378
    .line 1379
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1380
    .line 1381
    const-string v5, "hooks"

    .line 1382
    .line 1383
    .line 1384
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->R()Lorg/json/JSONArray;

    .line 1385
    move-result-object v6

    .line 1386
    .line 1387
    .line 1388
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1389
    .line 1390
    :cond_41
    const-string v2, "isLocked"

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1394
    move-result v2

    .line 1395
    .line 1396
    if-eqz v2, :cond_42

    .line 1397
    .line 1398
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1399
    .line 1400
    const-string v5, "isLocked"

    .line 1401
    .line 1402
    .line 1403
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->d0(Landroid/content/Context;)Z

    .line 1404
    move-result v6

    .line 1405
    .line 1406
    .line 1407
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1408
    .line 1409
    :cond_42
    const-string v2, "bat"

    .line 1410
    .line 1411
    .line 1412
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1413
    move-result v2

    .line 1414
    .line 1415
    if-eqz v2, :cond_43

    .line 1416
    .line 1417
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1418
    .line 1419
    const-string v5, "bat"

    .line 1420
    .line 1421
    .line 1422
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->e0(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 1423
    move-result-object v6

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1427
    .line 1428
    :cond_43
    const-string v2, "isFirstRun"

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1432
    move-result v2

    .line 1433
    .line 1434
    if-eqz v2, :cond_44

    .line 1435
    .line 1436
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1437
    .line 1438
    const-string v5, "isFirstRun"

    .line 1439
    .line 1440
    .line 1441
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/f3;->B(Landroid/content/Context;)Z

    .line 1442
    move-result v6

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 1446
    .line 1447
    :cond_44
    const-string v2, "canInstallUnknownApps"

    .line 1448
    .line 1449
    .line 1450
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1451
    move-result v2

    .line 1452
    .line 1453
    if-eqz v2, :cond_45

    .line 1454
    .line 1455
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1456
    .line 1457
    const-string v5, "canInstallUnknownApps"

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->X(Landroid/content/Context;)Ljava/lang/String;

    .line 1461
    move-result-object v6

    .line 1462
    .line 1463
    .line 1464
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1465
    .line 1466
    :cond_45
    const-string v2, "ringtones"

    .line 1467
    .line 1468
    .line 1469
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1470
    move-result v2

    .line 1471
    .line 1472
    if-eqz v2, :cond_46

    .line 1473
    .line 1474
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1475
    .line 1476
    const-string v5, "ringtones"

    .line 1477
    .line 1478
    .line 1479
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->Y(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 1480
    move-result-object v6

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1484
    .line 1485
    .line 1486
    :cond_46
    const-string/jumbo v2, "wallpapers"

    .line 1487
    .line 1488
    .line 1489
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1490
    move-result v2

    .line 1491
    .line 1492
    if-eqz v2, :cond_47

    .line 1493
    .line 1494
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1495
    .line 1496
    .line 1497
    const-string/jumbo v5, "wallpapers"

    .line 1498
    .line 1499
    .line 1500
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->Z(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 1501
    move-result-object v6

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1505
    .line 1506
    .line 1507
    :cond_47
    const-string/jumbo v2, "usersInfo"

    .line 1508
    .line 1509
    .line 1510
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1511
    move-result v2

    .line 1512
    .line 1513
    if-eqz v2, :cond_48

    .line 1514
    .line 1515
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1516
    .line 1517
    .line 1518
    const-string/jumbo v5, "usersInfo"

    .line 1519
    .line 1520
    .line 1521
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->a0(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 1522
    move-result-object v6

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1526
    .line 1527
    :cond_48
    const-string v2, "accounts"

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1531
    move-result v2

    .line 1532
    .line 1533
    if-eqz v2, :cond_49

    .line 1534
    .line 1535
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1536
    .line 1537
    const-string v5, "accounts"

    .line 1538
    .line 1539
    .line 1540
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->M(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 1541
    move-result-object v6

    .line 1542
    .line 1543
    .line 1544
    invoke-virtual {v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1545
    .line 1546
    :cond_49
    const-string v2, "app/applications"

    .line 1547
    .line 1548
    .line 1549
    invoke-static {v2}, Lcom/forter/mobile/fortersdk/b0;->b(Ljava/lang/String;)[Lcom/forter/mobile/fortersdk/h;

    .line 1550
    move-result-object v2

    .line 1551
    .line 1552
    if-nez v2, :cond_4a

    .line 1553
    move-object v8, v4

    .line 1554
    goto :goto_b

    .line 1555
    .line 1556
    .line 1557
    :cond_4a
    invoke-static {v0, v2}, Lcom/forter/mobile/fortersdk/x;->c(Landroid/content/Context;[Lcom/forter/mobile/fortersdk/h;)Lorg/json/JSONObject;

    .line 1558
    move-result-object v8

    .line 1559
    .line 1560
    :goto_b
    if-eqz v8, :cond_4b

    .line 1561
    .line 1562
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1563
    .line 1564
    const-string v4, "applicationsInfo"

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v2, v4, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1568
    .line 1569
    .line 1570
    :cond_4b
    const-string/jumbo v2, "sysFeatures"

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1574
    move-result v2

    .line 1575
    .line 1576
    if-eqz v2, :cond_4c

    .line 1577
    .line 1578
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1579
    .line 1580
    .line 1581
    const-string/jumbo v4, "sysFeatures"

    .line 1582
    .line 1583
    .line 1584
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->O(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 1585
    move-result-object v5

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1589
    .line 1590
    :cond_4c
    const-string v2, "hasManufacturerFeatures"

    .line 1591
    .line 1592
    .line 1593
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1594
    move-result v2

    .line 1595
    .line 1596
    if-eqz v2, :cond_4d

    .line 1597
    .line 1598
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1599
    .line 1600
    const-string v4, "hasManufacturerFeatures"

    .line 1601
    .line 1602
    .line 1603
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->Q(Landroid/content/Context;)Ljava/lang/String;

    .line 1604
    move-result-object v5

    .line 1605
    .line 1606
    .line 1607
    invoke-virtual {v2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1608
    .line 1609
    :cond_4d
    const-string v2, "enabledKeyboardsLanguages"

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 1613
    move-result v2

    .line 1614
    .line 1615
    if-eqz v2, :cond_4f

    .line 1616
    .line 1617
    .line 1618
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/a3;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 1619
    move-result-object v2

    .line 1620
    .line 1621
    .line 1622
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1623
    move-result v4

    .line 1624
    .line 1625
    const/16 v5, 0xfa

    .line 1626
    .line 1627
    if-ge v4, v5, :cond_4e

    .line 1628
    .line 1629
    .line 1630
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1631
    move-result v4

    .line 1632
    :goto_c
    const/4 v5, 0x0

    .line 1633
    goto :goto_d

    .line 1634
    .line 1635
    :cond_4e
    const/16 v4, 0xf9

    .line 1636
    goto :goto_c

    .line 1637
    .line 1638
    .line 1639
    :goto_d
    invoke-virtual {v2, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 1640
    move-result-object v2

    .line 1641
    .line 1642
    iget-object v4, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1643
    .line 1644
    const-string v5, "enabledKeyboardsLanguages"

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v4, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1648
    .line 1649
    .line 1650
    :cond_4f
    const-string/jumbo v2, "userCerts"

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v3, v2}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 1654
    move-result v2

    .line 1655
    .line 1656
    if-eqz v2, :cond_50

    .line 1657
    .line 1658
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1659
    .line 1660
    .line 1661
    const-string/jumbo v3, "userCerts"

    .line 1662
    .line 1663
    .line 1664
    invoke-static {}, Lcom/forter/mobile/fortersdk/a3;->J()Lorg/json/JSONArray;

    .line 1665
    move-result-object v4

    .line 1666
    .line 1667
    .line 1668
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1669
    .line 1670
    .line 1671
    :cond_50
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/f0;->b(Landroid/content/Context;)Lorg/json/JSONObject;

    .line 1672
    move-result-object v0

    .line 1673
    .line 1674
    if-eqz v0, :cond_51

    .line 1675
    .line 1676
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1677
    .line 1678
    const-string v3, "deviceSettings"

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1682
    .line 1683
    .line 1684
    :cond_51
    invoke-static {}, Lcom/forter/mobile/fortersdk/h0;->b()Lorg/json/JSONObject;

    .line 1685
    move-result-object v0

    .line 1686
    .line 1687
    if-eqz v0, :cond_52

    .line 1688
    .line 1689
    iget-object v2, v1, Lcom/forter/mobile/fortersdk/g3;->a:Lorg/json/JSONObject;

    .line 1690
    .line 1691
    .line 1692
    const-string/jumbo v3, "systemProps"

    .line 1693
    .line 1694
    .line 1695
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 1696
    goto :goto_f

    .line 1697
    .line 1698
    .line 1699
    :goto_e
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 1700
    move-result-object v2

    .line 1701
    .line 1702
    const-string v3, "Failed generating event %s"

    .line 1703
    .line 1704
    .line 1705
    filled-new-array/range {v16 .. v16}, [Ljava/lang/Object;

    .line 1706
    move-result-object v4

    .line 1707
    .line 1708
    .line 1709
    invoke-static {v3, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1710
    move-result-object v3

    .line 1711
    .line 1712
    .line 1713
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 1714
    move-result-object v0

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v2, v3, v0}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 1718
    :cond_52
    :goto_f
    return-object v1
.end method

.method public static i(Landroid/content/Context;)Lcom/forter/mobile/fortersdk/h3;
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "inputDevices"

    .line 3
    .line 4
    const-string v1, "cameraInfo"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "sensors"

    .line 8
    .line 9
    const-string v3, "app/sensors"

    .line 10
    .line 11
    new-instance v4, Lcom/forter/mobile/fortersdk/h3;

    .line 12
    .line 13
    .line 14
    invoke-direct {v4}, Lcom/forter/mobile/fortersdk/h3;-><init>()V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-static {v3}, Lcom/forter/mobile/fortersdk/b0;->a(Ljava/lang/String;)Lcom/forter/mobile/fortersdk/g;

    .line 18
    move-result-object v5

    .line 19
    .line 20
    new-instance v6, Lcom/forter/mobile/fortersdk/f;

    .line 21
    .line 22
    .line 23
    invoke-direct {v6, v5}, Lcom/forter/mobile/fortersdk/f;-><init>(Lcom/forter/mobile/fortersdk/g;)V

    .line 24
    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5}, Lcom/forter/mobile/fortersdk/g;->a()Z

    .line 29
    move-result v5

    .line 30
    .line 31
    if-eqz v5, :cond_0

    .line 32
    goto :goto_1

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v6, v2}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 38
    move-result v5

    .line 39
    .line 40
    if-eqz v5, :cond_1

    .line 41
    .line 42
    iget-object v5, v4, Lcom/forter/mobile/fortersdk/h3;->a:Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/a3;->V(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 46
    move-result-object v7

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, v2, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-virtual {v6, v1}, Lcom/forter/mobile/fortersdk/f;->a(Ljava/lang/String;)Z

    .line 53
    move-result v2

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    iget-object v2, v4, Lcom/forter/mobile/fortersdk/h3;->a:Lorg/json/JSONObject;

    .line 58
    .line 59
    .line 60
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/a3;->S(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 61
    move-result-object v5

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v1, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-virtual {v6, v0}, Lcom/forter/mobile/fortersdk/f;->b(Ljava/lang/String;)Z

    .line 68
    move-result v1

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    iget-object v1, v4, Lcom/forter/mobile/fortersdk/h3;->a:Lorg/json/JSONObject;

    .line 73
    .line 74
    .line 75
    invoke-static {p0}, Lcom/forter/mobile/fortersdk/a3;->W(Landroid/content/Context;)Lorg/json/JSONArray;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    return-object v4

    .line 81
    .line 82
    .line 83
    :goto_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    const-string v1, "Failed generating event %s"

    .line 87
    .line 88
    .line 89
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 98
    move-result-object p0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, p0}, Lcom/forter/mobile/fortersdk/b;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_3
    :goto_1
    return-object v4
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

.method public static j(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$e;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$e;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method

.method public static k(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$f;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$f;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method

.method public static l(Landroid/content/Context;)V
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/forter/mobile/fortersdk/b;->b()Lcom/forter/mobile/fortersdk/b;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/forter/mobile/fortersdk/b;->l()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, v0, Lcom/forter/mobile/fortersdk/b;->a:Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    new-instance v2, Lcom/forter/mobile/fortersdk/b$j;

    .line 15
    .line 16
    .line 17
    invoke-direct {v2, v0, p0}, Lcom/forter/mobile/fortersdk/b$j;-><init>(Lcom/forter/mobile/fortersdk/b;Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 21
    :cond_0
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
.end method

.method public static m(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/forter/mobile/fortersdk/t3;->a:Ljava/util/concurrent/ExecutorService;

    .line 3
    .line 4
    new-instance v1, Lcom/forter/mobile/fortersdk/t3$a;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/forter/mobile/fortersdk/t3$a;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-void

    .line 12
    .line 13
    .line 14
    :catchall_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 15
    return-void
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
.end method
