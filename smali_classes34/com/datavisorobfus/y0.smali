.class public Lcom/datavisorobfus/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile f:Lcom/datavisorobfus/y0;


# instance fields
.field private a:Landroid/content/Context;

.field public b:I

.field private c:I

.field private d:Lorg/json/JSONArray;

.field private e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/datavisorobfus/y0;->b:I

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    .line 14
    .line 15
    iput v0, p0, Lcom/datavisorobfus/y0;->b:I

    .line 16
    .line 17
    iput v0, p0, Lcom/datavisorobfus/y0;->c:I

    .line 18
    .line 19
    new-instance p1, Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    .line 25
    .line 26
    const-string p1, ""

    .line 27
    .line 28
    iput-object p1, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/datavisorobfus/y0;->d()V

    .line 32
    return-void

    .line 33
    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 35
    .line 36
    const-string v0, "StorageManager initialization error: mContext is null."

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 40
    throw p1
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
.end method

.method public static synthetic a(Lcom/datavisorobfus/y0;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Lcom/datavisorobfus/y0;
    .locals 2

    .line 2
    sget-object v0, Lcom/datavisorobfus/y0;->f:Lcom/datavisorobfus/y0;

    if-nez v0, :cond_1

    const-class v0, Lcom/datavisorobfus/y0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/y0;->f:Lcom/datavisorobfus/y0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/datavisorobfus/y0;

    invoke-direct {v1, p0}, Lcom/datavisorobfus/y0;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/datavisorobfus/y0;->f:Lcom/datavisorobfus/y0;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lcom/datavisorobfus/y0;->f:Lcom/datavisorobfus/y0;

    return-object p0
.end method

.method private b()Z
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/datavisorobfus/j;->b(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/datavisorobfus/j;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string v2, "DVSPDVMA"

    invoke-static {v0, v2}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide v6, 0x9a7ec800L

    add-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_4

    :goto_1
    return v1

    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic b(Lcom/datavisorobfus/y0;)Z
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/datavisorobfus/y0;->b()Z

    move-result p0

    return p0
.end method

.method private d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    iput v0, p0, Lcom/datavisorobfus/y0;->b:I

    .line 4
    .line 5
    new-instance v1, Lcom/datavisorobfus/p0;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v3, "responsekey"

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, v2, v3}, Lcom/datavisorobfus/p0;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 14
    .line 15
    iget-object v2, v1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Lcom/datavisorobfus/e;->b(Ljava/lang/String;)Z

    .line 19
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    const-string v3, "H6i37Q=="

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    :try_start_1
    iget-object v2, v1, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lcom/datavisorobfus/e;->b(Ljava/lang/String;)Z

    .line 29
    move-result v2

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    iget-object v3, v1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 41
    .line 42
    const-string v2, "H6iqxnPZqQ=="

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    iget-object v3, v1, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    invoke-static {v2, v3, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 52
    .line 53
    const-string v2, "H6i9/Q=="

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    iget-object v3, v1, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    iget-object v0, v1, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    .line 65
    .line 66
    iput-object v0, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    .line 69
    .line 70
    const-string v1, "DVSPPRETOKENINDEX"

    .line 71
    .line 72
    .line 73
    invoke-static {v0, v1}, Lcom/datavisorobfus/u0;->c(Landroid/content/Context;Ljava/lang/String;)I

    .line 74
    move-result v0

    .line 75
    .line 76
    iput v0, p0, Lcom/datavisorobfus/y0;->c:I

    .line 77
    const/4 v0, 0x1

    .line 78
    .line 79
    iput v0, p0, Lcom/datavisorobfus/y0;->b:I

    .line 80
    return-void

    .line 81
    .line 82
    :cond_0
    iget-object v1, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    .line 83
    .line 84
    const-string v2, ".__pdvk.sys"

    .line 85
    .line 86
    .line 87
    invoke-static {v1, v2}, Lcom/datavisorobfus/p0;->c(Landroid/content/Context;Ljava/lang/String;)Lcom/datavisorobfus/p0;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    iget-object v2, v1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    invoke-static {v2}, Lcom/datavisorobfus/e;->b(Ljava/lang/String;)Z

    .line 94
    move-result v2

    .line 95
    .line 96
    if-eqz v2, :cond_1

    .line 97
    .line 98
    .line 99
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    iget-object v1, v1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    invoke-static {v2, v1, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    .line 106
    const/4 v0, 0x2

    .line 107
    .line 108
    iput v0, p0, Lcom/datavisorobfus/y0;->b:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    :catchall_0
    :cond_1
    return-void
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
.end method


# virtual methods
.method public declared-synchronized a()Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/datavisorobfus/y0;->c(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string/jumbo v1, "token"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    :try_start_2
    const-string v0, "getPreTokenSync jsonObject is null"

    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    const-string v0, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-static {p1, v0}, Lcom/datavisor/vangogh/bridge/storage;->globalGet(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized a(Lcom/datavisorobfus/p0;)V
    .locals 3

    monitor-enter p0

    .line 5
    :try_start_0
    iget-object v0, p1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "H6i37Q=="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_0
    iget-object v0, p1, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "H6iqxnPZqQ=="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    iget-object v0, p1, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iput-object v0, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    iput v1, p0, Lcom/datavisorobfus/y0;->c:I

    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string v2, "DVSPPRETOKENINDEX"

    invoke-static {v0, v2, v1}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;I)V

    :cond_1
    iget-object v0, p1, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "H6i9/Q=="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p1, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/datavisor/vangogh/bridge/storage;->globalSet(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_2
    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string/jumbo v1, "responsekey"

    invoke-virtual {p1, v0, v1}, Lcom/datavisorobfus/p0;->b(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string v1, ".__pdvk.sys"

    invoke-virtual {p1, v0, v1}, Lcom/datavisorobfus/p0;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    monitor-exit p0

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 8

    .line 1
    :try_start_0
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/i;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v0

    const-string v1, "H6iqxnPZqQ=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v4}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget v0, p0, Lcom/datavisorobfus/y0;->c:I

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v6, p0, Lcom/datavisorobfus/y0;->c:I

    iget-object v0, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    const-string v1, ""

    invoke-virtual {v0, v6, v1}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lcom/datavisorobfus/k;->a()Lcom/datavisorobfus/k;

    move-result-object v0

    iget-object v0, v0, Lcom/datavisorobfus/k;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/datavisorobfus/y0$a;

    move-object v2, p0

    move-object v7, p1

    invoke-direct/range {v1 .. v7}, Lcom/datavisorobfus/y0$a;-><init>(Lcom/datavisorobfus/y0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public declared-synchronized c(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    monitor-enter p0

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string v2, "DVSPDVTTL"

    invoke-static {v1, v2}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    const/4 v4, 0x1

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7

    cmp-long v1, v5, v1

    if-lez v1, :cond_1

    const-string p1, ""

    iput-object p1, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    const-string p1, "expired"

    invoke-virtual {v0, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string/jumbo p1, "token"

    const-string v1, ""

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    :try_start_2
    iget-object v1, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_2

    iget v1, p0, Lcom/datavisorobfus/y0;->c:I

    if-ltz v1, :cond_2

    iget-object v3, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-virtual {p0, p1}, Lcom/datavisorobfus/y0;->b(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    iget v1, p0, Lcom/datavisorobfus/y0;->c:I

    const-string v3, ""

    invoke-virtual {p1, v1, v3}, Lorg/json/JSONArray;->optString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    iget p1, p0, Lcom/datavisorobfus/y0;->c:I

    add-int/2addr p1, v4

    iput p1, p0, Lcom/datavisorobfus/y0;->c:I

    iget-object v1, p0, Lcom/datavisorobfus/y0;->a:Landroid/content/Context;

    const-string v3, "DVSPPRETOKENINDEX"

    invoke-static {v1, v3, p1}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;I)V

    const-string p1, "expired"

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string/jumbo p1, "token"

    iget-object v1, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    :goto_1
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :cond_2
    const-string p1, ""

    iput-object p1, p0, Lcom/datavisorobfus/y0;->e:Ljava/lang/String;

    const-string p1, "expired"

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string/jumbo p1, "token"

    const-string v1, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :goto_2
    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_3
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    const/4 p1, 0x0

    return-object p1

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public declared-synchronized c()Z
    .locals 2

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/y0;->d:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    iget v1, p0, Lcom/datavisorobfus/y0;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-int/2addr v0, v1

    const/4 v1, 0x5

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
