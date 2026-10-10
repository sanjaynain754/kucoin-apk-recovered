.class Lcom/datavisorobfus/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/datavisorobfus/i;->d(Landroid/content/Context;)Ljava/lang/String;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/datavisorobfus/i;


# direct methods
.method public constructor <init>(Lcom/datavisorobfus/i;Landroid/content/Context;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/datavisorobfus/i$a;->b:Lcom/datavisorobfus/i;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.end method


# virtual methods
.method public run()V
    .locals 9

    .line 1
    .line 2
    const-string v0, "DVSPLASTTESTINGTIME"

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 6
    move-result-wide v1

    .line 7
    .line 8
    iget-object v3, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    invoke-static {v3, v0}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    .line 12
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    const-wide/16 v5, 0x0

    .line 15
    .line 16
    cmp-long v5, v3, v5

    .line 17
    .line 18
    const-string v6, "DVSPTESTING"

    .line 19
    .line 20
    if-ltz v5, :cond_1

    .line 21
    .line 22
    sub-long v3, v1, v3

    .line 23
    .line 24
    .line 25
    const-wide/32 v7, 0x5265c00

    .line 26
    .line 27
    cmp-long v3, v3, v7

    .line 28
    .line 29
    if-lez v3, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/datavisorobfus/i$a;->b:Lcom/datavisorobfus/i;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v6}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/datavisorobfus/i;->a(Lcom/datavisorobfus/i;Ljava/lang/String;)Ljava/lang/String;

    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception v0

    .line 44
    goto :goto_2

    .line 45
    .line 46
    :cond_1
    :goto_0
    iget-object v3, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    invoke-static {v3, v0, v1, v2}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 50
    .line 51
    iget-object v0, p0, Lcom/datavisorobfus/i$a;->b:Lcom/datavisorobfus/i;

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Lcom/datavisorobfus/i;->a(Lcom/datavisorobfus/i;)Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/config;->testVangogh(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    iget-object v1, p0, Lcom/datavisorobfus/i$a;->b:Lcom/datavisorobfus/i;

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v0}, Lcom/datavisorobfus/i;->a(Lcom/datavisorobfus/i;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 68
    move-result v1

    .line 69
    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v6, v0}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    goto :goto_1

    .line 77
    .line 78
    :cond_2
    iget-object v0, p0, Lcom/datavisorobfus/i$a;->a:Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v6}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 82
    .line 83
    :goto_1
    iget-object v0, p0, Lcom/datavisorobfus/i$a;->b:Lcom/datavisorobfus/i;

    .line 84
    const/4 v1, 0x1

    .line 85
    .line 86
    .line 87
    invoke-static {v0, v1}, Lcom/datavisorobfus/i;->a(Lcom/datavisorobfus/i;Z)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    return-void

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 92
    return-void
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
.end method
