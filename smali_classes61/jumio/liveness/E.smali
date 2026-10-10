.class public final Ljumio/liveness/E;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:I

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljumio/liveness/I;

.field public final synthetic g:Lkotlin/coroutines/jvm/internal/SuspendLambda;


# direct methods
.method public constructor <init>(Ljumio/liveness/I;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 5
    .line 6
    iput-object p2, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 7
    const/4 p1, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 11
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljumio/liveness/E;

    .line 3
    .line 4
    iget-object v1, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 5
    .line 6
    iget-object v2, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p2}, Ljumio/liveness/E;-><init>(Ljumio/liveness/I;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    iput-object p1, v0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 12
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Ljumio/liveness/E;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    check-cast p1, Ljumio/liveness/E;

    .line 11
    .line 12
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, p2}, Ljumio/liveness/E;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget v2, p0, Ljumio/liveness/E;->d:I

    .line 11
    const/4 v3, 0x5

    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x3

    .line 14
    const/4 v6, 0x2

    .line 15
    const/4 v7, 0x1

    .line 16
    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    if-eq v2, v7, :cond_2

    .line 20
    .line 21
    if-eq v2, v6, :cond_2

    .line 22
    .line 23
    if-eq v2, v5, :cond_3

    .line 24
    .line 25
    if-eq v2, v4, :cond_1

    .line 26
    .line 27
    if-ne v2, v3, :cond_0

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    throw p1

    .line 37
    .line 38
    :cond_1
    iget-object v0, p0, Ljumio/liveness/E;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/Exception;

    .line 41
    .line 42
    :cond_2
    :goto_0
    iget-object v0, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/jumio/core/cdn/CDNEncryptedEntry;

    .line 45
    .line 46
    iget-object v0, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_3
    iget-object v2, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lcom/jumio/core/cdn/CDNEncryptedEntry;

    .line 58
    .line 59
    iget-object v3, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 62
    .line 63
    .line 64
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    goto/16 :goto_3

    .line 67
    :catch_0
    move-exception p1

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    iget-object p1, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    const-class v2, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    check-cast p1, Lcom/jumio/core/cdn/CDNFeatureModel;

    .line 91
    .line 92
    const-string v2, "livenessAssets"

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v2}, Lcom/jumio/core/cdn/CDNFeatureModel;->get(Ljava/lang/String;)Lcom/jumio/core/cdn/CDNEncryptedEntry;

    .line 96
    move-result-object v8

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lkotlinx/coroutines/n0;->h(Lkotlinx/coroutines/m0;)Z

    .line 100
    move-result v9

    .line 101
    .line 102
    if-nez v9, :cond_5

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p1

    .line 106
    .line 107
    :cond_5
    if-nez v8, :cond_6

    .line 108
    .line 109
    iget-object v2, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    check-cast v3, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 116
    .line 117
    sget-object v4, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v4}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 124
    move-result-object v3

    .line 125
    .line 126
    check-cast v3, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 127
    const/4 v4, 0x0

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3, v4}, Lcom/jumio/core/models/LivenessScanPartModel;->setLivenessEnabled(Z)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Lcom/jumio/core/scanpart/JVisionScanPart;->initExtractionAndOverlay()V

    .line 134
    .line 135
    iget-object v2, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    iput-object v0, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    iput-object p1, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    move-result-object p1

    .line 152
    .line 153
    iput-object p1, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 154
    .line 155
    iput v7, p0, Ljumio/liveness/E;->d:I

    .line 156
    .line 157
    .line 158
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    if-ne p1, v1, :cond_9

    .line 162
    .line 163
    goto/16 :goto_2

    .line 164
    .line 165
    .line 166
    :cond_6
    filled-new-array {v2}, [Ljava/lang/String;

    .line 167
    move-result-object v2

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v2}, Lcom/jumio/core/cdn/CDNFeatureModel;->has([Ljava/lang/String;)Z

    .line 171
    move-result v2

    .line 172
    .line 173
    if-nez v2, :cond_7

    .line 174
    .line 175
    iget-object v2, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 176
    .line 177
    iget-object v3, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 178
    .line 179
    .line 180
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    iput-object v0, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    move-result-object v0

    .line 188
    .line 189
    iput-object v0, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    iput-object v0, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 196
    .line 197
    iput v6, p0, Ljumio/liveness/E;->d:I

    .line 198
    .line 199
    .line 200
    invoke-static {v2, p1, v3, p0}, Ljumio/liveness/I;->a(Ljumio/liveness/I;Lcom/jumio/core/cdn/CDNFeatureModel;Lkotlin/jvm/functions/Function1;Ljumio/liveness/E;)Ljava/lang/Object;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    if-ne p1, v1, :cond_9

    .line 204
    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_7
    iget-object v2, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 211
    move-result-object v2

    .line 212
    .line 213
    check-cast v2, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessScanPartModel;->isFallbackEnabled()Z

    .line 217
    move-result v2

    .line 218
    .line 219
    if-nez v2, :cond_8

    .line 220
    .line 221
    :try_start_1
    iget-object v2, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 225
    move-result-object v2

    .line 226
    .line 227
    .line 228
    invoke-virtual {v2}, Lcom/jumio/core/Controller;->getContext()Lcom/jumio/core/MobileContext;

    .line 229
    move-result-object v2

    .line 230
    .line 231
    iget-object v3, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Lcom/jumio/core/scanpart/FaceScanPart;->getLivenessSettingsModel()Lcom/jumio/core/models/LivenessSettingsModel;

    .line 235
    move-result-object v3

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3}, Lcom/jumio/core/models/LivenessSettingsModel;->getModelInitTimeoutInMs()J

    .line 239
    move-result-wide v6

    .line 240
    .line 241
    .line 242
    invoke-virtual {v8, v2, v6, v7}, Lcom/jumio/core/cdn/CDNEncryptedEntry;->load(Landroid/content/Context;J)Ljava/nio/ByteBuffer;

    .line 243
    .line 244
    iget-object v2, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 245
    .line 246
    .line 247
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    move-result-object v3

    .line 249
    .line 250
    iput-object v3, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 251
    .line 252
    iput-object p1, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    move-result-object v3

    .line 257
    .line 258
    iput-object v3, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 259
    .line 260
    iput v5, p0, Ljumio/liveness/E;->d:I

    .line 261
    .line 262
    .line 263
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 265
    .line 266
    if-ne p1, v1, :cond_9

    .line 267
    goto :goto_2

    .line 268
    :catch_1
    move-exception v2

    .line 269
    move-object v3, p1

    .line 270
    move-object p1, v2

    .line 271
    move-object v2, v8

    .line 272
    .line 273
    :goto_1
    iget-object v5, p0, Ljumio/liveness/E;->f:Ljumio/liveness/I;

    .line 274
    .line 275
    iget-object v6, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 276
    .line 277
    .line 278
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    move-result-object v0

    .line 280
    .line 281
    iput-object v0, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    move-result-object v0

    .line 286
    .line 287
    iput-object v0, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    move-result-object v0

    .line 292
    .line 293
    iput-object v0, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    move-result-object p1

    .line 298
    .line 299
    iput-object p1, p0, Ljumio/liveness/E;->c:Ljava/lang/Object;

    .line 300
    .line 301
    iput v4, p0, Ljumio/liveness/E;->d:I

    .line 302
    .line 303
    .line 304
    invoke-static {v5, v3, v6, p0}, Ljumio/liveness/I;->a(Ljumio/liveness/I;Lcom/jumio/core/cdn/CDNFeatureModel;Lkotlin/jvm/functions/Function1;Ljumio/liveness/E;)Ljava/lang/Object;

    .line 305
    move-result-object p1

    .line 306
    .line 307
    if-ne p1, v1, :cond_9

    .line 308
    goto :goto_2

    .line 309
    .line 310
    :cond_8
    iget-object v2, p0, Ljumio/liveness/E;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    move-result-object v0

    .line 315
    .line 316
    iput-object v0, p0, Ljumio/liveness/E;->e:Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    move-result-object p1

    .line 321
    .line 322
    iput-object p1, p0, Ljumio/liveness/E;->a:Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    move-result-object p1

    .line 327
    .line 328
    iput-object p1, p0, Ljumio/liveness/E;->b:Ljava/lang/Object;

    .line 329
    .line 330
    iput v3, p0, Ljumio/liveness/E;->d:I

    .line 331
    .line 332
    .line 333
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    move-result-object p1

    .line 335
    .line 336
    if-ne p1, v1, :cond_9

    .line 337
    :goto_2
    return-object v1

    .line 338
    .line 339
    :cond_9
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 340
    return-object p1
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
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
.end method
