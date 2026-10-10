.class final Lcom/tencent/rtmp/a/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/rtmp/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/rtmp/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/rtmp/a/a;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rtmp/a/a$a;->a:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/tencent/rtmp/a/a$a;->b:Ljava/lang/String;

    .line 13
    return-void
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
.end method

.method private static a(Ljava/lang/String;)F
    .locals 5

    .line 1
    .line 2
    const-string v0, ":"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    array-length v0, p0

    .line 8
    const/4 v1, 0x3

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    aget-object v0, p0, v4

    .line 16
    .line 17
    aget-object v0, p0, v3

    .line 18
    .line 19
    aget-object p0, p0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    array-length v0, p0

    .line 22
    .line 23
    if-ne v0, v2, :cond_1

    .line 24
    .line 25
    aget-object v0, p0, v4

    .line 26
    .line 27
    aget-object p0, p0, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    array-length v0, p0

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    if-ne v0, v3, :cond_2

    .line 33
    .line 34
    aget-object p0, p0, v4

    .line 35
    move-object v0, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move-object p0, v1

    .line 38
    move-object v0, p0

    .line 39
    :goto_0
    const/4 v1, 0x0

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 49
    move-result v0

    .line 50
    .line 51
    const/high16 v2, 0x42700000    # 60.0f

    .line 52
    mul-float/2addr v0, v2

    .line 53
    add-float/2addr v1, v0

    .line 54
    .line 55
    :cond_3
    if-eqz p0, :cond_4

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 63
    move-result p0

    .line 64
    add-float/2addr v1, p0

    .line 65
    :cond_4
    return v1
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
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    .line 2
    const-string v0, "TXImageSprite"

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/rtmp/a/a$a;->a:Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    check-cast v1, Lcom/tencent/rtmp/a/a;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    :try_start_0
    iget-object v3, p0, Lcom/tencent/rtmp/a/a$a;->b:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-static {v3}, Lcom/tencent/rtmp/a/a;->a(Ljava/lang/String;)Ljava/io/InputStream;

    .line 17
    move-result-object v3

    .line 18
    .line 19
    if-nez v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance v4, Ljava/io/BufferedReader;

    .line 24
    .line 25
    new-instance v5, Ljava/io/InputStreamReader;

    .line 26
    .line 27
    .line 28
    invoke-direct {v5, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    if-eqz v2, :cond_6

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 41
    move-result v3

    .line 42
    .line 43
    if-eqz v3, :cond_6

    .line 44
    .line 45
    const-string v3, "WEBVTT"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    move-result v2

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto/16 :goto_2

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 57
    move-result-object v2

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    const-string v3, "-->"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 65
    move-result v3

    .line 66
    .line 67
    if-eqz v3, :cond_4

    .line 68
    .line 69
    const-string v3, " --> "

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    move-result-object v3

    .line 74
    array-length v5, v3

    .line 75
    const/4 v6, 0x2

    .line 76
    .line 77
    if-ne v5, v6, :cond_4

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 81
    move-result-object v5

    .line 82
    .line 83
    new-instance v7, Lcom/tencent/rtmp/a/a$c;

    .line 84
    const/4 v8, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct {v7, v8}, Lcom/tencent/rtmp/a/a$c;-><init>(B)V

    .line 88
    .line 89
    aget-object v9, v3, v8

    .line 90
    .line 91
    .line 92
    invoke-static {v9}, Lcom/tencent/rtmp/a/a$a;->a(Ljava/lang/String;)F

    .line 93
    move-result v9

    .line 94
    .line 95
    iput v9, v7, Lcom/tencent/rtmp/a/a$c;->a:F

    .line 96
    const/4 v9, 0x1

    .line 97
    .line 98
    aget-object v3, v3, v9

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lcom/tencent/rtmp/a/a$a;->a(Ljava/lang/String;)F

    .line 102
    move-result v3

    .line 103
    .line 104
    iput v3, v7, Lcom/tencent/rtmp/a/a$c;->b:F

    .line 105
    .line 106
    iput-object v5, v7, Lcom/tencent/rtmp/a/a$c;->c:Ljava/lang/String;

    .line 107
    .line 108
    const-string v3, "#"

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 112
    move-result v3

    .line 113
    const/4 v10, -0x1

    .line 114
    .line 115
    if-eq v3, v10, :cond_2

    .line 116
    .line 117
    .line 118
    invoke-virtual {v5, v8, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 119
    move-result-object v3

    .line 120
    .line 121
    iput-object v3, v7, Lcom/tencent/rtmp/a/a$c;->d:Ljava/lang/String;

    .line 122
    goto :goto_0

    .line 123
    :catchall_0
    move-exception v0

    .line 124
    move-object v2, v4

    .line 125
    .line 126
    goto/16 :goto_5

    .line 127
    :catch_0
    move-exception v1

    .line 128
    move-object v2, v4

    .line 129
    .line 130
    goto/16 :goto_3

    .line 131
    .line 132
    :cond_2
    :goto_0
    const-string v3, "="

    .line 133
    .line 134
    .line 135
    invoke-virtual {v5, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 136
    move-result v3

    .line 137
    .line 138
    if-eq v3, v10, :cond_3

    .line 139
    .line 140
    add-int/lit8 v3, v3, 0x1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 144
    move-result v10

    .line 145
    .line 146
    if-ge v3, v10, :cond_3

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 150
    move-result v10

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5, v3, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    const-string v5, ","

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    move-result-object v3

    .line 161
    array-length v5, v3

    .line 162
    const/4 v10, 0x4

    .line 163
    .line 164
    if-ne v5, v10, :cond_3

    .line 165
    .line 166
    aget-object v5, v3, v8

    .line 167
    .line 168
    .line 169
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 170
    move-result-object v5

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 174
    move-result v5

    .line 175
    .line 176
    iput v5, v7, Lcom/tencent/rtmp/a/a$c;->e:I

    .line 177
    .line 178
    aget-object v5, v3, v9

    .line 179
    .line 180
    .line 181
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 182
    move-result-object v5

    .line 183
    .line 184
    .line 185
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 186
    move-result v5

    .line 187
    .line 188
    iput v5, v7, Lcom/tencent/rtmp/a/a$c;->f:I

    .line 189
    .line 190
    aget-object v5, v3, v6

    .line 191
    .line 192
    .line 193
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 194
    move-result-object v5

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 198
    move-result v5

    .line 199
    .line 200
    iput v5, v7, Lcom/tencent/rtmp/a/a$c;->g:I

    .line 201
    const/4 v5, 0x3

    .line 202
    .line 203
    aget-object v3, v3, v5

    .line 204
    .line 205
    .line 206
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 207
    move-result-object v3

    .line 208
    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 211
    move-result v3

    .line 212
    .line 213
    iput v3, v7, Lcom/tencent/rtmp/a/a$c;->h:I

    .line 214
    .line 215
    :cond_3
    if-eqz v1, :cond_4

    .line 216
    .line 217
    .line 218
    invoke-static {v1}, Lcom/tencent/rtmp/a/a;->a(Lcom/tencent/rtmp/a/a;)Ljava/util/List;

    .line 219
    move-result-object v3

    .line 220
    .line 221
    if-eqz v3, :cond_4

    .line 222
    .line 223
    .line 224
    invoke-static {v1}, Lcom/tencent/rtmp/a/a;->a(Lcom/tencent/rtmp/a/a;)Ljava/util/List;

    .line 225
    move-result-object v3

    .line 226
    .line 227
    .line 228
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 229
    .line 230
    :cond_4
    if-nez v2, :cond_1

    .line 231
    .line 232
    .line 233
    :cond_5
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 234
    return-void

    .line 235
    .line 236
    :cond_6
    :goto_2
    :try_start_3
    const-string v2, "DownloadAndParseVTTFileTask : getVTT File Error!"

    .line 237
    .line 238
    .line 239
    invoke-static {v0, v2}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    .line 241
    if-eqz v1, :cond_5

    .line 242
    .line 243
    .line 244
    invoke-static {v1}, Lcom/tencent/rtmp/a/a;->c(Lcom/tencent/rtmp/a/a;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 245
    goto :goto_1

    .line 246
    :catchall_1
    move-exception v0

    .line 247
    goto :goto_5

    .line 248
    :catch_1
    move-exception v1

    .line 249
    .line 250
    :goto_3
    :try_start_4
    const-string v3, "load image sprite failed."

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v3, v1}, Lcom/tencent/liteav/base/util/LiteavLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 254
    .line 255
    if-eqz v2, :cond_7

    .line 256
    .line 257
    .line 258
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 259
    :catch_2
    :cond_7
    :goto_4
    return-void

    .line 260
    .line 261
    :goto_5
    if-eqz v2, :cond_8

    .line 262
    .line 263
    .line 264
    :try_start_6
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    .line 265
    :catch_3
    :cond_8
    throw v0
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
