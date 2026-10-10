.class public final Lcom/sumsub/sns/internal/features/data/network/prooface/o;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lokhttp3/OkHttpClient;

.field public final b:Ljava/lang/String;

.field public final c:Lxg0/a;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/sumsub/sns/internal/core/domain/k;

.field public final f:Lkotlinx/coroutines/m0;

.field public g:I

.field public h:Lokhttp3/WebSocket;

.field public i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

.field public j:Z

.field public k:Z

.field public final l:Lcom/sumsub/sns/internal/features/data/network/prooface/l;


# direct methods
.method public constructor <init>(Lokhttp3/OkHttpClient;Ljava/lang/String;Lxg0/a;Ljava/lang/String;Lcom/sumsub/sns/internal/core/domain/r;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->a:Lokhttp3/OkHttpClient;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->b:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->c:Lxg0/a;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->d:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->e:Lcom/sumsub/sns/internal/core/domain/k;

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->f:Lkotlinx/coroutines/m0;

    .line 24
    .line 25
    new-instance p1, Lcom/sumsub/sns/internal/features/data/network/prooface/l;

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/data/network/prooface/l;-><init>(Lcom/sumsub/sns/internal/features/data/network/prooface/o;)V

    .line 29
    .line 30
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->l:Lcom/sumsub/sns/internal/features/data/network/prooface/l;

    .line 31
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/network/prooface/b;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/network/prooface/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/m;-><init>(Lcom/sumsub/sns/internal/features/data/network/prooface/o;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 9
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    const/4 p2, 0x0

    .line 10
    iput p2, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->g:I

    .line 11
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    .line 12
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->e:Lcom/sumsub/sns/internal/core/domain/k;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/o;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/network/prooface/m;->d:I

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/core/domain/k;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, p0

    :goto_1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->a(Ljava/lang/String;)V

    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/prooface/A;)V
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->a:Ljava/lang/String;

    .line 2
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->j:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Liveness3dFaceRepository.send: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " isClosed="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 3
    iget-boolean v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->j:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;

    if-eqz v0, :cond_1

    .line 5
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->c:Lxg0/a;

    .line 6
    invoke-interface {v1}, Ltg0/n;->getSerializersModule()Lyg0/a;

    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/prooface/A;->Companion:Lcom/sumsub/sns/internal/features/data/model/prooface/z;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/prooface/z;->serializer()Ltg0/d;

    move-result-object v2

    check-cast v2, Ltg0/p;

    invoke-interface {v1, v2, p1}, Ltg0/c0;->b(Ltg0/p;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lokhttp3/WebSocket;->send(Ljava/lang/String;)Z

    return-void

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    if-eqz p1, :cond_2

    sget-object v0, Lcom/sumsub/sns/internal/features/data/network/prooface/c;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/c;

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 14
    :try_start_0
    const-string v0, "Liveness3dFaceRepository.newWebSocket"

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;

    if-eqz v0, :cond_0

    const-string/jumbo v1, "reconnect"

    const/16 v2, 0x3e8

    invoke-interface {v0, v2, v1}, Lokhttp3/WebSocket;->close(ILjava/lang/String;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;

    .line 17
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->d:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ws/liveness?token="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    .line 18
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->a:Lokhttp3/OkHttpClient;

    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->l:Lcom/sumsub/sns/internal/features/data/network/prooface/l;

    invoke-virtual {v0, p1, v1}, Lokhttp3/OkHttpClient;->newWebSocket(Lokhttp3/Request;Lokhttp3/WebSocketListener;)Lokhttp3/WebSocket;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->h:Lokhttp3/WebSocket;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 19
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/o;->i:Lcom/sumsub/sns/internal/features/data/network/prooface/b;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/sumsub/sns/internal/features/data/network/prooface/e;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/data/network/prooface/e;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Lcom/sumsub/sns/internal/features/data/network/prooface/b;->a(Lcom/sumsub/sns/internal/features/data/network/prooface/Liveness3dFaceRepository$LivenessRepositoryResult;)V

    :cond_1
    return-void
.end method
