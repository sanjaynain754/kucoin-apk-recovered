.class public Lcom/dianping/logan/c;
.super Ljava/lang/Object;
.source "LoganControlCenter.java"


# static fields
.field public static l:Lcom/dianping/logan/c;


# instance fields
.field public a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/dianping/logan/LoganModel;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:J

.field public g:J

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Lcom/dianping/logan/f;

.field public k:Ljava/text/SimpleDateFormat;


# direct methods
.method public constructor <init>(Lcom/dianping/logan/b;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 11
    .line 12
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "yyyy-MM-dd"

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    iput-object v0, p0, Lcom/dianping/logan/c;->k:Ljava/text/SimpleDateFormat;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/dianping/logan/b;->h()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget-object v0, p1, Lcom/dianping/logan/b;->b:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v0, p0, Lcom/dianping/logan/c;->c:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, p1, Lcom/dianping/logan/b;->a:Ljava/lang/String;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/dianping/logan/c;->b:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v0, p1, Lcom/dianping/logan/b;->d:J

    .line 37
    .line 38
    iput-wide v0, p0, Lcom/dianping/logan/c;->d:J

    .line 39
    .line 40
    iget-wide v0, p1, Lcom/dianping/logan/b;->f:J

    .line 41
    .line 42
    iput-wide v0, p0, Lcom/dianping/logan/c;->f:J

    .line 43
    .line 44
    iget-wide v0, p1, Lcom/dianping/logan/b;->c:J

    .line 45
    .line 46
    iput-wide v0, p0, Lcom/dianping/logan/c;->e:J

    .line 47
    .line 48
    iget-wide v0, p1, Lcom/dianping/logan/b;->e:J

    .line 49
    .line 50
    iput-wide v0, p0, Lcom/dianping/logan/c;->g:J

    .line 51
    .line 52
    new-instance v0, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v1, p1, Lcom/dianping/logan/b;->g:[B

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 58
    .line 59
    iput-object v0, p0, Lcom/dianping/logan/c;->h:Ljava/lang/String;

    .line 60
    .line 61
    new-instance v0, Ljava/lang/String;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/dianping/logan/b;->h:[B

    .line 64
    .line 65
    .line 66
    invoke-direct {v0, p1}, Ljava/lang/String;-><init>([B)V

    .line 67
    .line 68
    iput-object v0, p0, Lcom/dianping/logan/c;->i:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/dianping/logan/c;->c()V

    .line 72
    return-void

    .line 73
    .line 74
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 75
    .line 76
    const-string v0, "config\'s param is invalid"

    .line 77
    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 80
    throw p1
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

.method public static d(Lcom/dianping/logan/b;)Lcom/dianping/logan/c;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/dianping/logan/c;->l:Lcom/dianping/logan/c;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lcom/dianping/logan/c;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/dianping/logan/c;->l:Lcom/dianping/logan/c;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/dianping/logan/c;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/dianping/logan/c;-><init>(Lcom/dianping/logan/b;)V

    .line 17
    .line 18
    sput-object v1, Lcom/dianping/logan/c;->l:Lcom/dianping/logan/c;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    .line 27
    :cond_1
    :goto_2
    sget-object p0, Lcom/dianping/logan/c;->l:Lcom/dianping/logan/c;

    .line 28
    return-object p0
    .line 29
    .line 30
    .line 31
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/c;->c:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Lcom/dianping/logan/LoganModel;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Lcom/dianping/logan/LoganModel;-><init>()V

    .line 15
    .line 16
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->FLUSH:Lcom/dianping/logan/LoganModel$Action;

    .line 17
    .line 18
    iput-object v1, v0, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    iget-object v0, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/dianping/logan/f;->n()V

    .line 31
    :cond_1
    :goto_0
    return-void
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
.end method

.method public final b(Ljava/lang/String;)J
    .locals 2

    .line 1
    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/dianping/logan/c;->k:Ljava/text/SimpleDateFormat;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 10
    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    return-wide v0

    .line 12
    :catch_0
    move-exception p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    return-wide v0
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

.method public final c()V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v1, Lcom/dianping/logan/f;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/dianping/logan/c;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v4, p0, Lcom/dianping/logan/c;->c:Ljava/lang/String;

    .line 13
    .line 14
    iget-wide v5, p0, Lcom/dianping/logan/c;->d:J

    .line 15
    .line 16
    iget-wide v7, p0, Lcom/dianping/logan/c;->e:J

    .line 17
    .line 18
    iget-wide v9, p0, Lcom/dianping/logan/c;->f:J

    .line 19
    .line 20
    iget-object v11, p0, Lcom/dianping/logan/c;->h:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v12, p0, Lcom/dianping/logan/c;->i:Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    invoke-direct/range {v1 .. v12}, Lcom/dianping/logan/f;-><init>(Ljava/util/concurrent/ConcurrentLinkedQueue;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    iput-object v1, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 28
    .line 29
    const-string v0, "logan-thread"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 33
    .line 34
    iget-object v0, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 38
    :cond_0
    return-void
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
.end method

.method public e([Ljava/lang/String;Lcom/dianping/logan/i;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/dianping/logan/c;->c:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_3

    .line 9
    .line 10
    if-eqz p1, :cond_3

    .line 11
    array-length v0, p1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    goto :goto_2

    .line 15
    :cond_0
    array-length v0, p1

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    :goto_0
    if-ge v1, v0, :cond_3

    .line 19
    .line 20
    aget-object v2, p1, v1

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 24
    move-result v3

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0, v2}, Lcom/dianping/logan/c;->b(Ljava/lang/String;)J

    .line 31
    move-result-wide v2

    .line 32
    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    cmp-long v4, v2, v4

    .line 36
    .line 37
    if-lez v4, :cond_2

    .line 38
    .line 39
    new-instance v4, Lcom/dianping/logan/LoganModel;

    .line 40
    .line 41
    .line 42
    invoke-direct {v4}, Lcom/dianping/logan/LoganModel;-><init>()V

    .line 43
    .line 44
    new-instance v5, Lcom/dianping/logan/h;

    .line 45
    .line 46
    .line 47
    invoke-direct {v5}, Lcom/dianping/logan/h;-><init>()V

    .line 48
    .line 49
    sget-object v6, Lcom/dianping/logan/LoganModel$Action;->SEND:Lcom/dianping/logan/LoganModel$Action;

    .line 50
    .line 51
    iput-object v6, v4, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    iput-object v2, v5, Lcom/dianping/logan/h;->b:Ljava/lang/String;

    .line 58
    .line 59
    iput-object p2, v5, Lcom/dianping/logan/h;->d:Lcom/dianping/logan/i;

    .line 60
    .line 61
    iput-object v5, v4, Lcom/dianping/logan/LoganModel;->c:Lcom/dianping/logan/h;

    .line 62
    .line 63
    iget-object v2, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    iget-object v2, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/dianping/logan/f;->n()V

    .line 74
    .line 75
    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    :goto_2
    return-void
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

.method public f(Ljava/lang/String;I)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    new-instance v0, Lcom/dianping/logan/LoganModel;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/dianping/logan/LoganModel;-><init>()V

    .line 13
    .line 14
    sget-object v1, Lcom/dianping/logan/LoganModel$Action;->WRITE:Lcom/dianping/logan/LoganModel$Action;

    .line 15
    .line 16
    iput-object v1, v0, Lcom/dianping/logan/LoganModel;->a:Lcom/dianping/logan/LoganModel$Action;

    .line 17
    .line 18
    new-instance v1, Lcom/dianping/logan/k;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/dianping/logan/k;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    .line 37
    move-result-wide v3

    .line 38
    .line 39
    .line 40
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 41
    move-result-object v5

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    if-ne v5, v6, :cond_1

    .line 48
    const/4 v5, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    const/4 v5, 0x0

    .line 51
    .line 52
    :goto_0
    iput-object p1, v1, Lcom/dianping/logan/k;->a:Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 56
    move-result-wide v6

    .line 57
    .line 58
    iput-wide v6, v1, Lcom/dianping/logan/k;->e:J

    .line 59
    .line 60
    iput p2, v1, Lcom/dianping/logan/k;->f:I

    .line 61
    .line 62
    iput-boolean v5, v1, Lcom/dianping/logan/k;->b:Z

    .line 63
    .line 64
    iput-wide v3, v1, Lcom/dianping/logan/k;->c:J

    .line 65
    .line 66
    iput-object v2, v1, Lcom/dianping/logan/k;->d:Ljava/lang/String;

    .line 67
    .line 68
    iput-object v1, v0, Lcom/dianping/logan/LoganModel;->b:Lcom/dianping/logan/k;

    .line 69
    .line 70
    iget-object p1, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    .line 74
    move-result p1

    .line 75
    int-to-long p1, p1

    .line 76
    .line 77
    iget-wide v1, p0, Lcom/dianping/logan/c;->g:J

    .line 78
    .line 79
    cmp-long p1, p1, v1

    .line 80
    .line 81
    if-gez p1, :cond_2

    .line 82
    .line 83
    iget-object p1, p0, Lcom/dianping/logan/c;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    iget-object p1, p0, Lcom/dianping/logan/c;->j:Lcom/dianping/logan/f;

    .line 89
    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/dianping/logan/f;->n()V

    .line 94
    :cond_2
    :goto_1
    return-void
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
