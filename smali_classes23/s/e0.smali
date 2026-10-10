.class public Ls/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lk/e;

.field public final b:Lk/e;

.field public final c:Lk/e;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Ls/e0;->e:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance v0, Lk/e;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lk/e;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Ls/e0;->a:Lk/e;

    .line 18
    .line 19
    new-instance v0, Lk/e;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lk/e;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Ls/e0;->b:Lk/e;

    .line 25
    .line 26
    new-instance v0, Lk/e;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lk/e;-><init>()V

    .line 30
    .line 31
    iput-object v0, p0, Ls/e0;->c:Lk/e;

    .line 32
    .line 33
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 37
    .line 38
    iput-object v0, p0, Ls/e0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 44
    .line 45
    iput-object v0, p0, Ls/e0;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 46
    .line 47
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 51
    .line 52
    iput-object v0, p0, Ls/e0;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 53
    return-void
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
.end method

.method public static synthetic a(Ls/e0;)Lg/d;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ls/e0;->b()Lg/d;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method


# virtual methods
.method public final synthetic b()Lg/d;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lg/d$b;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "runtime_metrics"

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lg/d$b;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    iget-object v1, p0, Ls/e0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lg/d$b;->i(Ljava/util/Map;)Lg/d$b;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Ls/e0;->b:Lk/e;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lk/e;->b()F

    .line 20
    move-result v1

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-string v2, "compress_avg_cost"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    iget-object v1, p0, Ls/e0;->b:Lk/e;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lk/e;->c()J

    .line 36
    move-result-wide v1

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "detect_frame_count"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iget-object v1, p0, Ls/e0;->a:Lk/e;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lk/e;->c()J

    .line 52
    move-result-wide v1

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    const-string/jumbo v2, "model_avg_cost"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    iget-object v1, p0, Ls/e0;->c:Lk/e;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Lk/e;->b()F

    .line 69
    move-result v1

    .line 70
    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    const-string v2, "camera_call_back_avg_cost"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    iget-object v1, p0, Ls/e0;->c:Lk/e;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Lk/e;->c()J

    .line 85
    move-result-wide v1

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    move-result-object v1

    .line 90
    .line 91
    const-string v2, "camera_call_back_frame_count"

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    iget-object v1, p0, Ls/e0;->b:Lk/e;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lk/e;->c()J

    .line 101
    move-result-wide v1

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 105
    move-result-object v1

    .line 106
    .line 107
    const-string v2, "compress_frame_count"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    iget-object v1, p0, Ls/e0;->c:Lk/e;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Lk/e;->a()F

    .line 117
    move-result v1

    .line 118
    .line 119
    .line 120
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 121
    move-result-object v1

    .line 122
    .line 123
    const-string v2, "camera_fps"

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    iget-object v1, p0, Ls/e0;->b:Lk/e;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lk/e;->a()F

    .line 133
    move-result v1

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    const-string v2, "compress_fps"

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    iget-object v1, p0, Ls/e0;->a:Lk/e;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v1}, Lk/e;->a()F

    .line 149
    move-result v1

    .line 150
    .line 151
    .line 152
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    const-string/jumbo v2, "model_fps"

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 160
    move-result-object v0

    .line 161
    .line 162
    iget-object v1, p0, Ls/e0;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 166
    move-result v1

    .line 167
    .line 168
    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    const-string v2, "discard_processed_frame_count"

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 176
    move-result-object v0

    .line 177
    .line 178
    iget-object v1, p0, Ls/e0;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 182
    move-result v1

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    const-string v2, "discard_camera_frame_count"

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, v2, v1}, Lg/d$b;->k(Ljava/lang/String;Ljava/lang/Object;)Lg/d$b;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Lg/d$b;->m()Lg/d;

    .line 196
    move-result-object v0

    .line 197
    return-object v0
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
.end method

.method public c()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/e0;->c:Lk/e;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lk/e;->d()V

    .line 6
    return-void
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
.end method

.method public d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/e0;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 6
    return-void
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
.end method

.method public e()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ls/e0;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 6
    return-void
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
.end method

.method public f(IILai/advance/sdk/global/iqa/lib/code/ImageWarnCode;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ls/e0;->e:Ljava/lang/Object;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Ls/e0;->b:Lk/e;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, p1}, Lk/e;->e(I)V

    .line 9
    .line 10
    iget-object p1, p0, Ls/e0;->a:Lk/e;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lk/e;->e(I)V

    .line 14
    .line 15
    iget-object p1, p0, Ls/e0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 19
    move-result-object p2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, Ljava/lang/Integer;

    .line 26
    .line 27
    iget-object p2, p0, Ls/e0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 31
    move-result-object p3

    .line 32
    const/4 v1, 0x1

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 39
    move-result p1

    .line 40
    add-int/2addr v1, p1

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2, p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    throw p1
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
.end method

.method public g()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ls/c1;->R()Ls/c1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ls/d0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Ls/d0;-><init>(Ls/e0;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lf/f;->L(Lg/a;)V

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method
