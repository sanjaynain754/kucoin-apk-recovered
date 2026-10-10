.class public final Lcom/forter/mobile/fortersdk/p;
.super Ljava/lang/Object;


# instance fields
.field public a:Lt7/a;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Lcom/forter/mobile/fortersdk/aj;

.field public final d:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 7
    .line 8
    new-instance v0, Lcom/forter/mobile/fortersdk/aj;

    .line 9
    .line 10
    new-instance v1, Lcom/forter/mobile/fortersdk/k;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1}, Lcom/forter/mobile/fortersdk/k;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Lcom/forter/mobile/fortersdk/aj;-><init>(Lcom/forter/mobile/fortersdk/k;)V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/p;->c:Lcom/forter/mobile/fortersdk/aj;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/forter/mobile/fortersdk/p;->e()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lt7/a;->m()I

    .line 38
    move-result v0

    .line 39
    .line 40
    if-lez v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lt7/a;->m()I

    .line 46
    move-result v0

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v0, 0x1

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 55
    return-void
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
.end method

.method public static synthetic a(Lcom/forter/mobile/fortersdk/p;Lcom/forter/mobile/fortersdk/as;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    :try_start_0
    new-instance v1, Lcom/forter/mobile/fortersdk/p$b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/p$b;-><init>(Lcom/forter/mobile/fortersdk/p;Lcom/forter/mobile/fortersdk/as;)V

    .line 13
    .line 14
    sget-object v2, Lcom/forter/mobile/fortersdk/p$d;->a:[I

    .line 15
    .line 16
    iget v3, p1, Lcom/forter/mobile/fortersdk/as;->d:I

    .line 17
    const/4 v4, 0x1

    .line 18
    sub-int/2addr v3, v4

    .line 19
    .line 20
    aget v2, v2, v3

    .line 21
    .line 22
    if-eq v2, v4, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/p;->c:Lcom/forter/mobile/fortersdk/aj;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/forter/mobile/fortersdk/as;->e:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, p1, Lcom/forter/mobile/fortersdk/as;->c:Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3, v4, v1}, Lcom/forter/mobile/fortersdk/aj;->a(Ljava/lang/String;Ljava/util/Map;Lcom/forter/mobile/fortersdk/l;)Lcom/forter/mobile/fortersdk/aj$d;

    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    .line 36
    goto/16 :goto_6

    .line 37
    :catch_0
    move-exception v1

    .line 38
    .line 39
    goto/16 :goto_4

    .line 40
    :catch_1
    move-exception v1

    .line 41
    .line 42
    goto/16 :goto_5

    .line 43
    .line 44
    :cond_1
    iget-object v2, p0, Lcom/forter/mobile/fortersdk/p;->c:Lcom/forter/mobile/fortersdk/aj;

    .line 45
    .line 46
    iget-object v3, p1, Lcom/forter/mobile/fortersdk/as;->e:Ljava/lang/String;

    .line 47
    .line 48
    iget-object v5, p1, Lcom/forter/mobile/fortersdk/as;->c:Ljava/util/Map;

    .line 49
    .line 50
    iget-object v2, v2, Lcom/forter/mobile/fortersdk/aj;->a:Lcom/forter/mobile/fortersdk/k;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v3}, Lcom/forter/mobile/fortersdk/k;->a(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    .line 54
    move-result-object v2

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v5}, Lcom/forter/mobile/fortersdk/k;->b(Ljava/net/HttpURLConnection;Ljava/util/Map;)Z

    .line 58
    .line 59
    const-string v3, "POST"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 69
    move-result-object v3

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 73
    move-result-object v3
    :try_end_0
    .catch Lcom/forter/mobile/fortersdk/aj$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    const-string v4, "gzip"

    .line 76
    .line 77
    const-string v5, "Content-Encoding"

    .line 78
    .line 79
    if-eqz v3, :cond_2

    .line 80
    .line 81
    .line 82
    :try_start_1
    invoke-virtual {v3}, Lt7/a;->t()Z

    .line 83
    move-result v3

    .line 84
    .line 85
    if-eqz v3, :cond_2

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v5, v4}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    const/4 v3, 0x0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 93
    .line 94
    .line 95
    :cond_2
    invoke-interface {v1, v2}, Lcom/forter/mobile/fortersdk/l;->a(Ljava/net/HttpURLConnection;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2, v5}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-static {v4, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 103
    move-result v1

    .line 104
    .line 105
    if-eqz v1, :cond_3

    .line 106
    .line 107
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 111
    move-result-object v3

    .line 112
    .line 113
    .line 114
    invoke-direct {v1, v3}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 115
    goto :goto_0

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-virtual {v2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    :goto_0
    new-instance v3, Lcom/forter/mobile/fortersdk/aj$a;

    .line 122
    .line 123
    .line 124
    invoke-direct {v3, v2, v1}, Lcom/forter/mobile/fortersdk/aj$a;-><init>(Ljava/net/HttpURLConnection;Ljava/io/OutputStream;)V
    :try_end_1
    .catch Lcom/forter/mobile/fortersdk/aj$b; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    move-object v1, v3

    .line 126
    .line 127
    :goto_1
    :try_start_2
    instance-of v2, p1, Lcom/forter/mobile/fortersdk/t;

    .line 128
    .line 129
    if-eqz v2, :cond_5

    .line 130
    move-object v2, p1

    .line 131
    .line 132
    check-cast v2, Lcom/forter/mobile/fortersdk/t;

    .line 133
    .line 134
    iget-object v3, v2, Lcom/forter/mobile/fortersdk/t;->g:Ljava/lang/String;
    :try_end_2
    .catch Lcom/forter/mobile/fortersdk/aj$b; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    :try_start_3
    new-instance v3, Ljava/io/BufferedWriter;

    .line 139
    .line 140
    new-instance v4, Ljava/io/OutputStreamWriter;

    .line 141
    .line 142
    iget-object v5, v1, Lcom/forter/mobile/fortersdk/aj$d;->d:Ljava/io/OutputStream;

    .line 143
    .line 144
    const-string v6, "UTF-8"

    .line 145
    .line 146
    .line 147
    invoke-static {v6}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 148
    move-result-object v6

    .line 149
    .line 150
    .line 151
    invoke-direct {v4, v5, v6}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    .line 152
    .line 153
    .line 154
    invoke-direct {v3, v4}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 155
    .line 156
    :try_start_4
    iget-object v0, v2, Lcom/forter/mobile/fortersdk/t;->g:Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 160
    .line 161
    const-string v2, "BODY: "

    .line 162
    .line 163
    .line 164
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 172
    .line 173
    .line 174
    :try_start_5
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 175
    goto :goto_3

    .line 176
    :catchall_1
    move-exception p0

    .line 177
    move-object v0, v1

    .line 178
    goto :goto_6

    .line 179
    :catchall_2
    move-exception v0

    .line 180
    goto :goto_2

    .line 181
    :catchall_3
    move-exception v2

    .line 182
    move-object v3, v0

    .line 183
    move-object v0, v2

    .line 184
    .line 185
    :goto_2
    if-eqz v3, :cond_4

    .line 186
    .line 187
    .line 188
    :try_start_6
    invoke-virtual {v3}, Ljava/io/Writer;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 189
    :catch_2
    :cond_4
    :try_start_7
    throw v0

    .line 190
    :catch_3
    move-exception v0

    .line 191
    move-object v7, v1

    .line 192
    move-object v1, v0

    .line 193
    move-object v0, v7

    .line 194
    goto :goto_4

    .line 195
    :catch_4
    move-exception v0

    .line 196
    move-object v7, v1

    .line 197
    move-object v1, v0

    .line 198
    move-object v0, v7

    .line 199
    goto :goto_5

    .line 200
    .line 201
    :catch_5
    :cond_5
    :goto_3
    new-instance v0, Lcom/forter/mobile/fortersdk/r;

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, v1}, Lcom/forter/mobile/fortersdk/r;-><init>(Lcom/forter/mobile/fortersdk/aj$d;)V

    .line 205
    .line 206
    .line 207
    invoke-static {p1, v0}, Lcom/forter/mobile/fortersdk/p;->b(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V

    .line 208
    .line 209
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 213
    .line 214
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 215
    .line 216
    .line 217
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->h()V
    :try_end_7
    .catch Lcom/forter/mobile/fortersdk/aj$b; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 221
    .line 222
    .line 223
    invoke-static {v1}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 224
    return-void

    .line 225
    .line 226
    .line 227
    :goto_4
    :try_start_8
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, p1, v1}, Lcom/forter/mobile/fortersdk/p;->c(Lcom/forter/mobile/fortersdk/as;Ljava/io/IOException;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 231
    .line 232
    .line 233
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 234
    return-void

    .line 235
    .line 236
    .line 237
    :goto_5
    :try_start_9
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->f()V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, p1, v1}, Lcom/forter/mobile/fortersdk/p;->c(Lcom/forter/mobile/fortersdk/as;Ljava/io/IOException;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 244
    return-void

    .line 245
    .line 246
    .line 247
    :goto_6
    invoke-static {v0}, Lcom/forter/mobile/fortersdk/p;->d(Ljava/io/Closeable;)V

    .line 248
    throw p0
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
.end method

.method public static b(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/as;->f:Lcom/forter/mobile/fortersdk/w3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, p0, p1}, Lcom/forter/mobile/fortersdk/w3;->a(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V

    .line 8
    :cond_0
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

.method public static d(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    .line 2
    if-nez p0, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    :catch_0
    :goto_0
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


# virtual methods
.method public final c(Lcom/forter/mobile/fortersdk/as;Ljava/io/IOException;)V
    .locals 3

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p1, Lcom/forter/mobile/fortersdk/as;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 6
    move-result v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lt7/a;->o()I

    .line 12
    move-result v1

    .line 13
    .line 14
    if-gt v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, Lcom/forter/mobile/fortersdk/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 17
    .line 18
    new-instance v0, Lcom/forter/mobile/fortersdk/p$c;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Lcom/forter/mobile/fortersdk/p$c;-><init>(Lcom/forter/mobile/fortersdk/p;Lcom/forter/mobile/fortersdk/as;)V

    .line 22
    .line 23
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 24
    .line 25
    const-wide/16 v1, 0x3e8

    .line 26
    .line 27
    .line 28
    invoke-interface {p2, v0, v1, v2, p1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 29
    return-void

    .line 30
    .line 31
    :cond_0
    instance-of v0, p2, Lcom/forter/mobile/fortersdk/aj$b;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    check-cast p2, Lcom/forter/mobile/fortersdk/aj$b;

    .line 36
    .line 37
    new-instance v0, Lcom/forter/mobile/fortersdk/r;

    .line 38
    .line 39
    iget v1, p2, Lcom/forter/mobile/fortersdk/aj$b;->a:I

    .line 40
    .line 41
    iget-object p2, p2, Lcom/forter/mobile/fortersdk/aj$b;->c:Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1, p2}, Lcom/forter/mobile/fortersdk/r;-><init>(ILjava/lang/String;)V

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :cond_1
    new-instance v0, Lcom/forter/mobile/fortersdk/r;

    .line 48
    .line 49
    const-string p2, "IOException -> can not parse result"

    .line 50
    .line 51
    const/16 v1, 0x3e7

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1, p2}, Lcom/forter/mobile/fortersdk/r;-><init>(ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-static {p1, v0}, Lcom/forter/mobile/fortersdk/p;->b(Lcom/forter/mobile/fortersdk/as;Lcom/forter/mobile/fortersdk/r;)V

    .line 58
    .line 59
    iget-object p1, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    return-void

    .line 64
    .line 65
    .line 66
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 67
    .line 68
    iget-object p1, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 72
    return-void
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
.end method

.method public final e()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/forter/mobile/fortersdk/c;->b()Lcom/forter/mobile/fortersdk/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/forter/mobile/fortersdk/c;->p()Lt7/a;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/forter/mobile/fortersdk/p;->a:Lt7/a;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final f(Lcom/forter/mobile/fortersdk/as;)Z
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/forter/mobile/fortersdk/p;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 8
    .line 9
    new-instance v1, Lcom/forter/mobile/fortersdk/p$a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p0, p1}, Lcom/forter/mobile/fortersdk/p$a;-><init>(Lcom/forter/mobile/fortersdk/p;Lcom/forter/mobile/fortersdk/as;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    .line 19
    .line 20
    :catch_0
    invoke-static {}, Lcom/forter/mobile/fortersdk/c3;->d()V

    .line 21
    const/4 p1, 0x0

    .line 22
    return p1
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
