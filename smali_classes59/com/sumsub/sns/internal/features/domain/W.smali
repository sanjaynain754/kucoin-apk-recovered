.class public final Lcom/sumsub/sns/internal/features/domain/W;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/domain/h;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/domain/W;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/domain/W;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 24
    return-void
    .line 25
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/data/model/common/p;Ljava/util/List;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    instance-of v0, p5, Lcom/sumsub/sns/internal/features/domain/V;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p5

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/V;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/domain/V;->d:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/domain/V;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/V;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p5}, Lcom/sumsub/sns/internal/features/domain/V;-><init>(Lcom/sumsub/sns/internal/features/domain/W;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p5, v0, Lcom/sumsub/sns/internal/features/domain/V;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/domain/V;->d:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const/4 v5, 0x0

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    .line 44
    :try_start_0
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 45
    goto :goto_5

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_6

    .line 48
    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    throw p1

    .line 56
    .line 57
    :cond_2
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/domain/V;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 58
    .line 59
    .line 60
    :try_start_1
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    goto :goto_1

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :try_start_2
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a()Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 68
    move-result-object p5

    .line 69
    .line 70
    if-eqz p5, :cond_4

    .line 71
    .line 72
    if-eqz p4, :cond_7

    .line 73
    .line 74
    :cond_4
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/domain/V;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 75
    .line 76
    iput v4, v0, Lcom/sumsub/sns/internal/features/domain/V;->d:I

    .line 77
    .line 78
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p3, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 82
    move-result-object p5

    .line 83
    .line 84
    if-ne p5, v1, :cond_5

    .line 85
    goto :goto_4

    .line 86
    .line 87
    :cond_5
    :goto_1
    check-cast p5, Lcom/sumsub/sns/internal/features/data/model/common/remote/c;

    .line 88
    .line 89
    instance-of p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 90
    .line 91
    if-eqz p1, :cond_6

    .line 92
    .line 93
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 94
    .line 95
    const/16 p1, 0x1fef

    .line 96
    .line 97
    .line 98
    invoke-static {p2, p5, v5, p1}, Lcom/sumsub/sns/internal/features/data/model/common/t3;->a(Lcom/sumsub/sns/internal/features/data/model/common/t3;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/t3;

    .line 99
    move-result-object p1

    .line 100
    :goto_2
    move-object p2, p1

    .line 101
    goto :goto_3

    .line 102
    .line 103
    :cond_6
    instance-of p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 104
    .line 105
    if-eqz p1, :cond_9

    .line 106
    .line 107
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 108
    .line 109
    const/16 p1, 0x7fef

    .line 110
    .line 111
    .line 112
    invoke-static {p2, p5, v5, p1}, Lcom/sumsub/sns/internal/features/data/model/common/a;->a(Lcom/sumsub/sns/internal/features/data/model/common/a;Lcom/sumsub/sns/internal/features/data/model/common/remote/c;Lcom/sumsub/sns/internal/features/data/model/common/o;I)Lcom/sumsub/sns/internal/features/data/model/common/a;

    .line 113
    move-result-object p1

    .line 114
    goto :goto_2

    .line 115
    .line 116
    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/domain/W;->b:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 117
    .line 118
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/domain/V;->a:Lcom/sumsub/sns/internal/features/data/model/common/p;

    .line 119
    .line 120
    iput v3, v0, Lcom/sumsub/sns/internal/features/domain/V;->d:I

    .line 121
    .line 122
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 123
    .line 124
    iget-object p3, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->j:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3, p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->c()V

    .line 131
    .line 132
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 133
    .line 134
    if-ne p1, v1, :cond_8

    .line 135
    :goto_4
    return-object v1

    .line 136
    .line 137
    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 138
    .line 139
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 140
    .line 141
    .line 142
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    move-result-object p1

    .line 144
    return-object p1

    .line 145
    .line 146
    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 147
    .line 148
    .line 149
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 150
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 151
    .line 152
    :goto_6
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    .line 153
    .line 154
    .line 155
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 156
    move-result-object p2

    .line 157
    .line 158
    const-string p3, "Error during agreement acceptance"

    .line 159
    .line 160
    .line 161
    invoke-static {p2, p3, p1}, Lcom/sumsub/sns/internal/log/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 162
    .line 163
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 164
    .line 165
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/domain/W;->a:Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 166
    .line 167
    .line 168
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/domain/base/c;->a(Lcom/sumsub/sns/internal/features/data/repository/common/a;Ljava/lang/Exception;)Ljava/lang/Exception;

    .line 169
    move-result-object p1

    .line 170
    .line 171
    .line 172
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 173
    move-result-object p1

    .line 174
    .line 175
    .line 176
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    move-result-object p1

    .line 178
    return-object p1
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
