.class public final Ljumio/liveness/I;
.super Lcom/jumio/core/scanpart/FaceScanPart;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public final A:Lcom/jumio/sdk/enums/JumioCameraFacing;

.field public y:Lkotlinx/coroutines/x1;

.field public final z:[Lcom/jumio/sdk/enums/JumioCameraFacing;


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioFaceCredential;Lcom/jumio/core/models/LivenessScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "controller"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "credential"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "scanPartModel"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    const-string v0, "scanPartInterface"

    .line 18
    .line 19
    .line 20
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/scanpart/FaceScanPart;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioFaceCredential;Lcom/jumio/core/models/FaceScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    .line 24
    .line 25
    sget-object p1, Lcom/jumio/sdk/enums/JumioCameraFacing;->FRONT:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 26
    .line 27
    .line 28
    filled-new-array {p1}, [Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    iput-object p2, p0, Ljumio/liveness/I;->z:[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 32
    .line 33
    iput-object p1, p0, Ljumio/liveness/I;->A:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 34
    return-void
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
.end method

.method public static final a(Ljumio/liveness/I;Lcom/jumio/core/cdn/CDNFeatureModel;Lkotlin/jvm/functions/Function1;Ljumio/liveness/E;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    const-string v0, "livenessAssets"

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lcom/jumio/core/cdn/CDNFeatureModel;->loadSync$default(Lcom/jumio/core/cdn/CDNFeatureModel;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    .line 3
    invoke-virtual {p3}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/z1;->q(Lkotlin/coroutines/CoroutineContext;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_0
    const/4 v0, 0x1

    .line 4
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 5
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/LivenessScanPartModel;->isFallbackEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 6
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/LivenessScanPartModel;

    sget-object v0, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    invoke-virtual {p1, v0}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 7
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {p1, v1}, Lcom/jumio/core/models/LivenessScanPartModel;->setLivenessEnabled(Z)V

    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->initExtractionAndOverlay()V

    .line 9
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 10
    :cond_4
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object p0

    new-instance p1, Lcom/jumio/core/error/Error;

    sget-object p2, Lcom/jumio/core/enums/ErrorCase;->GENERAL_NETWORK_ERROR:Lcom/jumio/core/enums/ErrorCase;

    invoke-direct {p1, p2, v1, v1}, Lcom/jumio/core/error/Error;-><init>(Lcom/jumio/core/enums/ErrorCase;II)V

    invoke-static {p0, p1, v3, v2, v3}, Lcom/jumio/core/Controller;->onError$default(Lcom/jumio/core/Controller;Ljava/lang/Throwable;Ljava/lang/Class;ILjava/lang/Object;)V

    .line 11
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic a(Ljumio/liveness/I;)V
    .locals 0

    .line 12
    invoke-super {p0}, Lcom/jumio/core/scanpart/FaceScanPart;->start()V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    const/4 v2, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    :cond_0
    iput-object v1, p0, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Lcom/jumio/core/scanpart/FaceScanPart;->cancel()V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final consumeError(Lcom/jumio/sdk/error/JumioError;)Z
    .locals 9

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/sdk/error/JumioError;->getCode()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    const-string v0, "A000000"

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

    .line 20
    const/4 v0, 0x1

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1, v0, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljumio/liveness/D;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p0, v1}, Ljumio/liveness/D;-><init>(Ljumio/liveness/I;Lkotlin/coroutines/Continuation;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/jumio/core/Controller;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundScope()Lkotlinx/coroutines/m0;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    new-instance v6, Ljumio/liveness/E;

    .line 46
    .line 47
    .line 48
    invoke-direct {v6, p0, p1, v1}, Ljumio/liveness/E;-><init>(Ljumio/liveness/I;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 49
    const/4 v7, 0x3

    .line 50
    const/4 v8, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    iput-object p1, p0, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

    .line 59
    return v0

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    return p1
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
.end method

.method public final fallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "fallbackReason"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljumio/liveness/I;->getHasFallback()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 14
    .line 15
    if-eq p1, v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->SCANNING_ERROR:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 18
    .line 19
    if-ne p1, v0, :cond_1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getScanView()Lcom/jumio/core/views/CameraScanView;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    :cond_1
    return-void

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/ScanPart;->fallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)V

    .line 30
    .line 31
    sget-object v0, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 32
    .line 33
    if-eq p1, v0, :cond_3

    .line 34
    const/4 v0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_3
    const/4 v0, 0x0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 43
    .line 44
    sget-object v2, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    check-cast v1, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v0}, Lcom/jumio/core/models/LivenessScanPartModel;->setLivenessEnabled(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->initExtractionAndOverlay()V

    .line 60
    .line 61
    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->FALLBACK:Lcom/jumio/sdk/enums/JumioScanUpdate;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdate(Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;)V

    .line 65
    return-void
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
.end method

.method public final getBindingClasses()[Ljava/lang/Class;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/FaceScanPart;->getBindingClasses()[Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/jumio/core/api/calls/AuthenticationCall;

    .line 7
    .line 8
    .line 9
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/collections/ArraysKt;->plus([Ljava/lang/Object;[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, [Ljava/lang/Class;

    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getDefaultFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/I;->A:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public final getEnableExtraction()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getExtractionClient()Lcom/jumio/core/extraction/ExtractionClient;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionClient;->getDataExtraction()Z

    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final getHasFallback()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 13
    .line 14
    if-eq v0, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/core/models/LivenessScanPartModel;->isFallbackEnabled()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    const/4 v0, 0x1

    .line 28
    return v0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    return v0
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
.end method

.method public final getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/I;->z:[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public final initCameraData()V
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
    .line 19
    .line 20
    .line 21
.end method

.method public onResult(Lcom/jumio/core/model/StaticModel;)V
    .locals 8
    .param p1    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    if-ne v0, v1, :cond_0

    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/FaceScanPart;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void

    .line 4
    :cond_0
    instance-of v0, p1, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    goto :goto_0

    :cond_1
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_2

    return-void

    .line 5
    :cond_2
    invoke-virtual {p1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getFrames()[Lcom/jumio/commons/camera/ImageData;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 6
    array-length v2, v0

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_5

    aget-object v4, v0, v3

    .line 7
    instance-of v5, v4, Lcom/jumio/liveness/image/LivenessImageData;

    if-eqz v5, :cond_4

    move-object v5, v4

    check-cast v5, Lcom/jumio/liveness/image/LivenessImageData;

    invoke-virtual {v5}, Lcom/jumio/liveness/image/LivenessImageData;->getBestSelfie()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v5

    check-cast v5, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v5}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v5

    instance-of v6, v5, Lcom/jumio/commons/camera/ImageData;

    if-eqz v6, :cond_3

    check-cast v5, Lcom/jumio/commons/camera/ImageData;

    goto :goto_2

    :cond_3
    move-object v5, v1

    :goto_2
    if-eqz v5, :cond_4

    .line 9
    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getData()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/scan/FileData;->setData(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getMimeType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/scan/FileData;->setMimeType(Ljava/lang/String;)V

    .line 11
    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getFileType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/jumio/core/data/scan/FileData;->setFileType(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v5}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    move-result-object v6

    invoke-virtual {v4}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    move-result-object v7

    invoke-virtual {v7}, Lcom/jumio/commons/camera/Size;->getWidth()I

    move-result v7

    invoke-virtual {v6, v7}, Lcom/jumio/commons/camera/Size;->setWidth(I)V

    .line 13
    invoke-virtual {v5}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    move-result-object v5

    invoke-virtual {v4}, Lcom/jumio/commons/camera/ImageData;->getSize()Lcom/jumio/commons/camera/Size;

    move-result-object v6

    invoke-virtual {v6}, Lcom/jumio/commons/camera/Size;->getHeight()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/jumio/commons/camera/Size;->setHeight(I)V

    .line 14
    :cond_4
    invoke-virtual {p0, v4}, Lcom/jumio/core/scanpart/JVisionScanPart;->addCameraData(Lcom/jumio/commons/camera/ImageDataInterface;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 15
    :cond_5
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v0, p1}, Lcom/jumio/core/models/FaceScanPartModel;->setLivenessData(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V

    .line 16
    new-instance v1, Lcom/jumio/core/extraction/result/ExtractionResult;

    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/extraction/result/ExtractionResult;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lcom/jumio/core/scanpart/JVisionScanPart;->uploadExtractionResult(Lcom/jumio/core/extraction/result/ExtractionResult;)V

    return-void
.end method

.method public onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V
    .locals 3
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "apiCallDataModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object v0

    .line 18
    const-class v1, Lcom/jumio/core/api/calls/UploadCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 19
    instance-of v0, p2, Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lorg/json/JSONObject;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, p1, v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getUsabilityResultKeys(Lcom/jumio/core/models/ApiCallDataModel;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    .line 20
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v1

    instance-of v1, v1, Lcom/jumio/core/models/AuthenticationScanPartModel;

    if-eqz v1, :cond_7

    .line 21
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->isInstantFeedbackEnabled()Z

    move-result v0

    if-nez v0, :cond_7

    .line 22
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->setPassed(Ljava/lang/Boolean;)V

    goto/16 :goto_2

    .line 23
    :cond_2
    const-class v1, Lcom/jumio/core/api/calls/UsabilityCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 24
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    instance-of v0, v0, Lcom/jumio/core/models/AuthenticationScanPartModel;

    if-eqz v0, :cond_7

    .line 25
    const-string v0, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lcom/jumio/core/models/automation/AutomationModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/automation/AutomationModel;->getDecisionType()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/models/automation/AutomationModel$DecisionType;->PASS:Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    if-ne v0, v1, :cond_3

    .line 26
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/api/BackendManager;->authenticate()V

    goto :goto_2

    .line 27
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v0

    if-eqz v0, :cond_7

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->setPassed(Ljava/lang/Boolean;)V

    goto :goto_2

    .line 28
    :cond_4
    const-class v1, Lcom/jumio/core/api/calls/AuthenticationCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 29
    const-string v0, "null cannot be cast to non-null type com.jumio.core.models.AuthenticationModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lcom/jumio/core/models/AuthenticationModel;

    .line 30
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/LivenessScanPartModel;

    invoke-virtual {v1}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 31
    invoke-virtual {v0}, Lcom/jumio/core/models/AuthenticationModel;->getDecisionType()Lcom/jumio/core/models/AuthenticationModel$DecisionType;

    move-result-object v0

    sget-object v2, Lcom/jumio/core/models/AuthenticationModel$DecisionType;->PASS:Lcom/jumio/core/models/AuthenticationModel$DecisionType;

    if-ne v0, v2, :cond_5

    const/4 v0, 0x1

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 32
    invoke-virtual {v1, v0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->setPassed(Ljava/lang/Boolean;)V

    .line 33
    :cond_6
    invoke-virtual {p0}, Ljumio/core/y2;->getAllPartsComplete()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 34
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->processUsabilityResults()V

    .line 35
    :cond_7
    :goto_2
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/FaceScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/model/StaticModel;

    invoke-virtual {p0, p1}, Ljumio/liveness/I;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 6
    .param p1    # Lcom/jumio/core/extraction/ExtractionUpdateInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/extraction/ExtractionUpdateInterface<",
            "*>;)V"
        }
    .end annotation

    const-string/jumbo v0, "update"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getShotTaken()I

    move-result v2

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_1

    .line 4
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/extraction/result/ExtractionResult;

    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getMetaInfo()Lcom/jumio/analytics/MetaInfo;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/jumio/core/scanpart/FaceScanPart;->handleShotTaken(Lcom/jumio/core/extraction/result/ExtractionResult;Lcom/jumio/analytics/MetaInfo;Z)V

    goto/16 :goto_13

    .line 5
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getFallbackRequired()I

    move-result v2

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_3

    invoke-virtual {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleFallback(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    goto/16 :goto_13

    .line 6
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getHoldStill()I

    move-result v1

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_5

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->HOLD_STILL:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type kotlin.Long"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {p0, v0, v1}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered(Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;)V

    goto/16 :goto_13

    .line 7
    :cond_5
    :goto_2
    sget-object v1, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->INSTANCE:Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;

    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceIntoFrame()I

    move-result v2

    const/4 v4, 0x2

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_7

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->MOVE_FACE_INTO_FRAME:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 8
    :cond_7
    :goto_3
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getCenterFace()I

    move-result v2

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_9

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->CENTER_FACE:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 9
    :cond_9
    :goto_4
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltUp()I

    move-result v2

    if-nez v0, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_b

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->TILT_FACE_UP:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 10
    :cond_b
    :goto_5
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltDown()I

    move-result v2

    if-nez v0, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_d

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->TILT_FACE_DOWN:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 11
    :cond_d
    :goto_6
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltLeft()I

    move-result v2

    if-nez v0, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_f

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->TILT_FACE_LEFT:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 12
    :cond_f
    :goto_7
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTiltRight()I

    move-result v2

    if-nez v0, :cond_10

    goto :goto_8

    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_11

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->TILT_FACE_RIGHT:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 13
    :cond_11
    :goto_8
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getLevelEyesAndDevice()I

    move-result v2

    if-nez v0, :cond_12

    goto :goto_9

    :cond_12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_13

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->LEVEL_EYES_AND_DEVICE:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 14
    :cond_13
    :goto_9
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceTooClose()I

    move-result v2

    if-nez v0, :cond_14

    goto :goto_a

    :cond_14
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_15

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->FACE_TOO_CLOSE:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 15
    :cond_15
    :goto_a
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getMoveFaceCloser()I

    move-result v2

    if-nez v0, :cond_16

    goto :goto_b

    :cond_16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_17

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->MOVE_FACE_CLOSER:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdateFiltered$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 16
    :cond_17
    :goto_b
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getNextPosition()I

    move-result v2

    if-nez v0, :cond_18

    goto :goto_c

    :cond_18
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v2, :cond_19

    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->NEXT_POSITION:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-static {p0, v0, v3, v4, v3}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdate$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;ILjava/lang/Object;)V

    goto/16 :goto_13

    .line 17
    :cond_19
    :goto_c
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getLivenessFinished()I

    move-result v2

    if-nez v0, :cond_1a

    goto :goto_d

    :cond_1a
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_1b

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->nextPartOrProcess(Z)V

    goto/16 :goto_13

    .line 18
    :cond_1b
    :goto_d
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getFaceRoiRect()I

    move-result v2

    if-nez v0, :cond_1c

    goto :goto_10

    :cond_1c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v2, :cond_1f

    .line 19
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getExtractionClient()Lcom/jumio/core/extraction/ExtractionClient;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionClient;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    move-result-object v0

    goto :goto_e

    :cond_1d
    move-object v0, v3

    :goto_e
    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/graphics/RectF;

    if-eqz v2, :cond_1e

    check-cast v1, Landroid/graphics/RectF;

    goto :goto_f

    :cond_1e
    move-object v1, v3

    :goto_f
    if-eqz v0, :cond_25

    if-eqz v1, :cond_25

    .line 20
    invoke-static {v0, v1}, Lcom/jumio/commons/camera/CameraUtilsKt;->previewToSurface(Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    goto :goto_13

    .line 21
    :cond_1f
    :goto_10
    invoke-virtual {v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessUpdateState;->getAttachClient()I

    move-result v1

    if-nez v0, :cond_20

    goto :goto_12

    :cond_20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v1, :cond_24

    invoke-interface {p1}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lkotlin/Pair;

    if-eqz v1, :cond_21

    check-cast v0, Lkotlin/Pair;

    goto :goto_11

    :cond_21
    move-object v0, v3

    :goto_11
    if-eqz v0, :cond_25

    .line 22
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getCameraData()Lcom/jumio/core/camera/CameraDataInterface;

    move-result-object v1

    instance-of v1, v1, Lcom/jumio/liveness/DelegateCameraData;

    if-eqz v1, :cond_22

    goto :goto_13

    .line 23
    :cond_22
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getCameraData()Lcom/jumio/core/camera/CameraDataInterface;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 24
    invoke-interface {v1}, Lcom/jumio/core/camera/CameraDataInterface;->stop()V

    .line 25
    invoke-interface {v1}, Lcom/jumio/core/camera/CameraDataInterface;->destroy()V

    .line 26
    :cond_23
    new-instance v1, Lcom/jumio/liveness/DelegateCameraData;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/jumio/liveness/DaClient2;

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljumio/liveness/d;

    invoke-direct {v1, v2, v0}, Lcom/jumio/liveness/DelegateCameraData;-><init>(Lcom/jumio/liveness/DaClient2;Ljumio/liveness/d;)V

    .line 27
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object v0

    .line 28
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getContext()Lcom/jumio/core/MobileContext;

    move-result-object v2

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v4

    const-class v5, Lcom/jumio/core/camera/CameraDataSettingsModel;

    invoke-virtual {v4, v5}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/camera/CameraDataSettingsModel;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    move-result-object v0

    invoke-virtual {v1, v2, v4, v0}, Lcom/jumio/liveness/DelegateCameraData;->init(Landroid/content/Context;Lcom/jumio/core/camera/CameraDataSettingsModel;Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 29
    invoke-virtual {v1}, Lcom/jumio/liveness/CameraData;->start()V

    .line 30
    invoke-virtual {p0, v1}, Lcom/jumio/core/scanpart/JVisionScanPart;->setCameraData(Lcom/jumio/core/camera/CameraDataInterface;)V

    goto :goto_13

    .line 31
    :cond_24
    :goto_12
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    .line 32
    :cond_25
    :goto_13
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    move-result-object v0

    new-instance v1, Ljumio/liveness/F;

    invoke-direct {v1, p0, p1, v3}, Ljumio/liveness/F;-><init>(Ljumio/liveness/I;Lcom/jumio/core/extraction/ExtractionUpdateInterface;Lkotlin/coroutines/Continuation;)V

    invoke-interface {v0, v1}, Lcom/jumio/core/scope/ScopeProviderInterface;->postOnMain(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public bridge synthetic onUpdate(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    invoke-virtual {p0, p1}, Ljumio/liveness/I;->onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void
.end method

.method public final setEnableExtraction(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getExtractionClient()Lcom/jumio/core/extraction/ExtractionClient;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/jumio/core/extraction/ExtractionClient;->setDataExtraction(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->isPresented(Z)V

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
.end method

.method public final start()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/models/LivenessScanPartModel;->isLivenessEnabled()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 25
    .line 26
    if-ne v0, v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 33
    .line 34
    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_LIVENESS:Lcom/jumio/core/data/ScanMode;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->initExtractionAndOverlay()V

    .line 41
    .line 42
    :cond_0
    sget-object v3, Lcom/jumio/sdk/enums/JumioScanStep;->PREPARE:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 43
    const/4 v6, 0x6

    .line 44
    const/4 v7, 0x0

    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    move-object v2, p0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v2 .. v7}, Lcom/jumio/core/scanpart/ScanPart;->sendScanStep$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 51
    .line 52
    iget-object v0, v2, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

    .line 53
    const/4 v1, 0x0

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    const/4 v3, 0x1

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1, v3, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljumio/liveness/H;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, Ljumio/liveness/H;-><init>(Ljumio/liveness/I;Lkotlin/coroutines/Continuation;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 68
    move-result-object v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3}, Lcom/jumio/core/Controller;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundScope()Lkotlinx/coroutines/m0;

    .line 76
    move-result-object v4

    .line 77
    .line 78
    new-instance v7, Ljumio/liveness/E;

    .line 79
    .line 80
    .line 81
    invoke-direct {v7, p0, v0, v1}, Ljumio/liveness/E;-><init>(Ljumio/liveness/I;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 82
    const/4 v8, 0x3

    .line 83
    const/4 v9, 0x0

    .line 84
    const/4 v5, 0x0

    .line 85
    const/4 v6, 0x0

    .line 86
    .line 87
    .line 88
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 89
    move-result-object v0

    .line 90
    .line 91
    iput-object v0, v2, Ljumio/liveness/I;->y:Lkotlinx/coroutines/x1;

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
.end method
