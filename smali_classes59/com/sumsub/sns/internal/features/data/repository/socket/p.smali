.class public final Lcom/sumsub/sns/internal/features/data/repository/socket/p;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/socket/a;


# instance fields
.field public final a:Lokhttp3/OkHttpClient;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final c:Lkotlinx/coroutines/m0;

.field public final d:Lcom/sumsub/sns/internal/core/domain/k;

.field public final e:Ljava/lang/String;

.field public final f:Lxg0/a;

.field public final g:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final i:Lkotlinx/coroutines/flow/n;

.field public final j:Lkotlinx/coroutines/flow/w;

.field public final k:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lkotlinx/coroutines/m0;Lcom/sumsub/sns/internal/core/domain/r;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->a:Lokhttp3/OkHttpClient;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 8
    .line 9
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->c:Lkotlinx/coroutines/m0;

    .line 10
    .line 11
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->d:Lcom/sumsub/sns/internal/core/domain/k;

    .line 12
    .line 13
    new-instance p1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string/jumbo p2, "ws/iframe?token="

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->e:Ljava/lang/String;

    .line 32
    .line 33
    sget-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 34
    .line 35
    .line 36
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->f:Lxg0/a;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 42
    const/4 p2, 0x0

    .line 43
    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 46
    .line 47
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 48
    .line 49
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 53
    .line 54
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    sget-object p1, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;->DISCONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lkotlinx/coroutines/flow/x;->a(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->i:Lkotlinx/coroutines/flow/n;

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lkotlinx/coroutines/flow/g;->c(Lkotlinx/coroutines/flow/n;)Lkotlinx/coroutines/flow/w;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->j:Lkotlinx/coroutines/flow/w;

    .line 69
    .line 70
    new-instance p1, Lcom/sumsub/sns/internal/features/data/repository/socket/q;

    .line 71
    .line 72
    .line 73
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/data/repository/socket/q;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->k:Lkotlin/Lazy;

    .line 80
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/repository/socket/p;)Lkotlinx/coroutines/flow/r;
    .locals 12

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/socket/l;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->f(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 3
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/d;

    invoke-direct {v2, v0, p0}, Lcom/sumsub/sns/internal/features/data/repository/socket/d;-><init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/data/repository/socket/p;)V

    .line 4
    invoke-static {v2}, Lkotlinx/coroutines/flow/g;->r(Lkotlinx/coroutines/flow/e;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 5
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/e;

    invoke-direct {v2, p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/socket/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->T(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/f;

    invoke-direct {v2, p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/socket/f;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->U(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 7
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/g;

    invoke-direct {v2, v1}, Lcom/sumsub/sns/internal/features/data/repository/socket/g;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->h(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object v0

    .line 8
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/h;

    invoke-direct {v2, p0, v1}, Lcom/sumsub/sns/internal/features/data/repository/socket/h;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/g;->S(Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/e;

    move-result-object v3

    .line 9
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->c:Lkotlinx/coroutines/m0;

    .line 10
    sget-object v5, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    sget-object p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->f:Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;->a()Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    move-result-object p0

    .line 11
    iget-wide v6, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->e:J

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    .line 12
    invoke-static/range {v5 .. v11}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 13
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/flow/g;->e0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;IILjava/lang/Object;)Lkotlinx/coroutines/flow/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/appdata/e;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/data/repository/socket/m;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/data/repository/socket/m;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 14
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->f:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const-string v5, "WebSocketRepository"

    const-string/jumbo v6, "withLiveIfPossible("

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->b:Lcom/sumsub/sns/internal/features/domain/appdata/e;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->g:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p3

    if-nez p3, :cond_4

    .line 16
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "): no active subscribers, the socket cannot connect"

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 17
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    invoke-virtual {v2, v5, p3, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    :cond_4
    sget-object p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->f:Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/a;->a()Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    move-result-object p3

    .line 21
    iget-boolean v2, p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->c:Z

    if-eqz v2, :cond_8

    .line 22
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->j:Lkotlinx/coroutines/flow/w;

    .line 23
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v8, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;->CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;

    if-eq v2, v8, :cond_8

    .line 24
    iget-wide v8, p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 25
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "): socket is down, waiting up to "

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string/jumbo v8, "ms"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 26
    sget-object v8, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 27
    iget-object v8, v8, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 28
    invoke-virtual {v8, v5, v2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 29
    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    .line 30
    iget-wide v8, p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->d:J

    .line 31
    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v8, v9, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v8

    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/socket/o;

    invoke-direct {v2, p0, v7}, Lcom/sumsub/sns/internal/features/data/repository/socket/o;-><init>(Lcom/sumsub/sns/internal/features/data/repository/socket/p;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->b:Lcom/sumsub/sns/internal/features/domain/appdata/e;

    iput-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->f:I

    invoke-static {v8, v9, v2, v0}, Lkotlinx/coroutines/TimeoutKt;->e(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_5

    goto/16 :goto_3

    :cond_5
    move-object v11, v2

    move-object v2, p1

    move-object p1, p3

    move-object p3, v11

    :goto_1
    if-eqz p3, :cond_6

    .line 32
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "): socket came up"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 33
    sget-object p3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 34
    iget-object p3, p3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 35
    invoke-virtual {p3, v5, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 36
    :cond_6
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;->b:Z

    if-eqz p1, :cond_7

    .line 37
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "): wait timed out, arming refresh on connect"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 39
    sget-object p3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 40
    iget-object p3, p3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 41
    invoke-virtual {p3, v5, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->j:Lkotlinx/coroutines/flow/w;

    .line 43
    invoke-interface {p1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;->CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;

    if-ne p1, p3, :cond_8

    .line 44
    const-string p1, "connected while arming"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->a(Ljava/lang/String;)V

    goto :goto_2

    .line 45
    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "): wait timed out"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 46
    sget-object p3, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 47
    iget-object p3, p3, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 48
    invoke-virtual {p3, v5, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    :cond_8
    :goto_2
    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->a:Ljava/lang/String;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->b:Lcom/sumsub/sns/internal/features/domain/appdata/e;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/b;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/socket/m;->f:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;Ljava/lang/String;)V
    .locals 4

    .line 58
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->i:Lkotlinx/coroutines/flow/n;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;

    if-eq v0, p1, :cond_0

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "connection state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " -> "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 60
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 61
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 62
    const-string v2, "WebSocketRepository"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    :cond_0
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->i:Lkotlinx/coroutines/flow/n;

    invoke-interface {p2, p1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    if-eq v0, p1, :cond_1

    .line 64
    sget-object p2, Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;->CONNECTED:Lcom/sumsub/sns/internal/features/data/repository/socket/WebSocketRepository$ConnectionState;

    if-ne p1, p2, :cond_1

    .line 65
    const-string/jumbo p1, "socket connected"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->a(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 9

    .line 50
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "armed data refresh triggered ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 52
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 53
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 54
    const-string v1, "WebSocketRepository"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/socket/p;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 56
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b:Lkotlinx/coroutines/m0;

    .line 57
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c:Lkotlinx/coroutines/j0;

    new-instance v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/C;

    invoke-direct {v6, p1, v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/C;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_0
    return-void
.end method
