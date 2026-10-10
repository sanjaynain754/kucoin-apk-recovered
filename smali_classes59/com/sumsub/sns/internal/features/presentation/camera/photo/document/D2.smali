.class public final Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/J;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 24

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v13, p3

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/sumsub/sns/internal/ml/autocapture/b;->a()Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iget-object v2, v1, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 11
    .line 12
    sget-object v3, Lcom/sumsub/sns/internal/features/data/model/common/X;->Companion:Lcom/sumsub/sns/internal/features/data/model/common/V;

    .line 13
    .line 14
    const-string v4, "EXTRA_DOCUMENT_TYPE"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v13, v4}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    move-result-object v4

    .line 19
    .line 20
    check-cast v4, Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, Lcom/sumsub/sns/internal/features/data/model/common/V;->a(Ljava/lang/String;)Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 27
    move-result-object v14

    .line 28
    .line 29
    sget-boolean v3, Lcom/sumsub/sns/internal/core/common/P0;->a:Z

    .line 30
    .line 31
    if-eqz v3, :cond_7

    .line 32
    .line 33
    sget-object v3, Lcom/sumsub/sns/internal/core/common/P0;->c:Lcom/sumsub/sns/internal/core/common/SNSSession;

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    if-nez v3, :cond_0

    .line 37
    move-object v3, v4

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/common/SNSSession;->getUrl()Ljava/lang/String;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    const-string v5, "EXTRA_ONLY_ID_DOC"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v13, v5}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 47
    move-result-object v5

    .line 48
    move-object v15, v5

    .line 49
    .line 50
    check-cast v15, Ljava/lang/String;

    .line 51
    .line 52
    const-string v5, "EXTRA_COUNTRY_CODE"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v13, v5}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 56
    move-result-object v5

    .line 57
    .line 58
    move-object/from16 v16, v5

    .line 59
    .line 60
    check-cast v16, Ljava/lang/String;

    .line 61
    .line 62
    const-string v5, "EXTRA_GALLERY_AVAILABLE"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v13, v5}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 66
    move-result-object v5

    .line 67
    .line 68
    check-cast v5, Ljava/lang/Boolean;

    .line 69
    const/4 v6, 0x0

    .line 70
    .line 71
    if-eqz v5, :cond_1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    move-result v5

    .line 76
    .line 77
    move/from16 v17, v5

    .line 78
    goto :goto_0

    .line 79
    .line 80
    :cond_1
    move/from16 v17, v6

    .line 81
    .line 82
    :goto_0
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 83
    .line 84
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 85
    .line 86
    .line 87
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 88
    move-result-object v5

    .line 89
    .line 90
    move-object/from16 v18, v5

    .line 91
    .line 92
    check-cast v18, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 93
    .line 94
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 95
    .line 96
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 97
    .line 98
    .line 99
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 100
    move-result-object v5

    .line 101
    .line 102
    move-object/from16 v19, v5

    .line 103
    .line 104
    check-cast v19, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 105
    .line 106
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 107
    .line 108
    iget-object v7, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 109
    .line 110
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->E:Lkotlin/Lazy;

    .line 111
    .line 112
    .line 113
    invoke-interface {v5}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 114
    move-result-object v5

    .line 115
    .line 116
    check-cast v5, Lokhttp3/OkHttpClient;

    .line 117
    .line 118
    .line 119
    invoke-static {v7, v5, v3, v14}, Lcom/sumsub/sns/internal/ml/badphotos/b;->a(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/ml/core/o;

    .line 120
    move-result-object v5

    .line 121
    .line 122
    instance-of v7, v5, Lcom/sumsub/sns/internal/ml/badphotos/c;

    .line 123
    .line 124
    if-eqz v7, :cond_2

    .line 125
    .line 126
    check-cast v5, Lcom/sumsub/sns/internal/ml/badphotos/c;

    .line 127
    .line 128
    move-object/from16 v20, v5

    .line 129
    goto :goto_1

    .line 130
    .line 131
    :cond_2
    move-object/from16 v20, v4

    .line 132
    .line 133
    :goto_1
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 134
    .line 135
    iget-object v5, v5, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 136
    .line 137
    iget-object v1, v1, Lcom/sumsub/sns/internal/ml/autocapture/d;->j:Lcom/sumsub/sns/internal/ml/autocapture/a;

    .line 138
    .line 139
    iget-object v1, v1, Lcom/sumsub/sns/internal/ml/autocapture/a;->a:Ljava/lang/String;

    .line 140
    .line 141
    new-instance v7, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string/jumbo v3, "resources/sdk/embeddedModels/"

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 163
    .line 164
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->E:Lkotlin/Lazy;

    .line 165
    .line 166
    .line 167
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    check-cast v3, Lokhttp3/OkHttpClient;

    .line 171
    .line 172
    new-instance v7, Lcom/sumsub/sns/internal/ml/docdetector/d;

    .line 173
    .line 174
    .line 175
    invoke-direct {v7, v5, v3, v1, v2}, Lcom/sumsub/sns/internal/ml/docdetector/d;-><init>(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Lcom/sumsub/sns/internal/ml/autocapture/a;)V

    .line 176
    .line 177
    iget-object v1, v2, Lcom/sumsub/sns/internal/ml/autocapture/a;->d:Landroid/util/Size;

    .line 178
    .line 179
    iget v2, v2, Lcom/sumsub/sns/internal/ml/autocapture/a;->e:I

    .line 180
    .line 181
    new-instance v3, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    const-string v5, "autocap config: inputSize="

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, ", outputSize="

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    move-result-object v1

    .line 205
    .line 206
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 207
    .line 208
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 209
    .line 210
    const-string v3, "DocCapture"

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2, v3, v1, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 214
    .line 215
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 216
    .line 217
    .line 218
    invoke-static {}, Lcom/sumsub/sns/internal/ml/badphotos/d;->a()Lcom/sumsub/sns/internal/ml/badphotos/e;

    .line 219
    move-result-object v21

    .line 220
    .line 221
    .line 222
    invoke-static {}, Lcom/sumsub/sns/internal/ml/autocapture/b;->a()Lcom/sumsub/sns/internal/ml/autocapture/d;

    .line 223
    move-result-object v22

    .line 224
    .line 225
    sget v1, Lcom/sumsub/sns/internal/ml/autocapture/g;->f:I

    .line 226
    .line 227
    .line 228
    invoke-static {}, Lcom/sumsub/sns/internal/ml/autocapture/e;->a()Lcom/sumsub/sns/internal/ml/autocapture/g;

    .line 229
    move-result-object v23

    .line 230
    .line 231
    const-string v1, "EXTRA_IS_SEAMLESS"

    .line 232
    .line 233
    .line 234
    invoke-virtual {v13, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 235
    move-result-object v1

    .line 236
    .line 237
    check-cast v1, Ljava/lang/Boolean;

    .line 238
    .line 239
    if-eqz v1, :cond_3

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    move-result v1

    .line 244
    goto :goto_2

    .line 245
    :cond_3
    move v1, v6

    .line 246
    .line 247
    :goto_2
    const-string v2, "EXTRA_ALLOW_IN_PLACE_UPLOAD"

    .line 248
    .line 249
    .line 250
    invoke-virtual {v13, v2}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 251
    move-result-object v2

    .line 252
    .line 253
    check-cast v2, Ljava/lang/Boolean;

    .line 254
    .line 255
    if-eqz v2, :cond_4

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 259
    move-result v6

    .line 260
    .line 261
    :cond_4
    sget-object v2, Lcom/sumsub/sns/internal/ff/a;->u:Lcom/sumsub/sns/internal/ff/core/a;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 265
    move-result v2

    .line 266
    .line 267
    if-eqz v2, :cond_6

    .line 268
    .line 269
    sget-object v2, Lcom/sumsub/sns/internal/ff/a;->A:Lcom/sumsub/sns/internal/ff/core/a;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    .line 273
    move-result v2

    .line 274
    .line 275
    if-eqz v2, :cond_6

    .line 276
    .line 277
    if-eqz v6, :cond_6

    .line 278
    .line 279
    if-nez v1, :cond_6

    .line 280
    .line 281
    .line 282
    invoke-virtual {v14}, Lcom/sumsub/sns/internal/features/data/model/common/X;->d()Z

    .line 283
    move-result v1

    .line 284
    .line 285
    if-eqz v1, :cond_6

    .line 286
    .line 287
    const-string v1, "EXTRA_DOCUMENT"

    .line 288
    .line 289
    .line 290
    invoke-virtual {v13, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 291
    move-result-object v1

    .line 292
    .line 293
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 294
    .line 295
    if-nez v1, :cond_5

    .line 296
    .line 297
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 298
    .line 299
    .line 300
    invoke-direct {v1, v14, v4}, Lcom/sumsub/sns/internal/features/data/model/common/Document;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/model/common/M;)V

    .line 301
    :cond_5
    move-object v2, v1

    .line 302
    .line 303
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 304
    .line 305
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 306
    .line 307
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 308
    .line 309
    .line 310
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 311
    move-result-object v3

    .line 312
    move-object v4, v3

    .line 313
    .line 314
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 315
    .line 316
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 317
    .line 318
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->O:Lkotlin/Lazy;

    .line 319
    .line 320
    .line 321
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 322
    move-result-object v3

    .line 323
    move-object v5, v3

    .line 324
    .line 325
    check-cast v5, Lcom/sumsub/sns/internal/features/domain/t;

    .line 326
    .line 327
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/A;

    .line 328
    .line 329
    .line 330
    invoke-direct {v6}, Lcom/sumsub/sns/internal/features/domain/A;-><init>()V

    .line 331
    move-object v9, v7

    .line 332
    .line 333
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/s0;

    .line 334
    .line 335
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 336
    .line 337
    .line 338
    invoke-direct {v7, v3}, Lcom/sumsub/sns/internal/features/domain/s0;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 339
    .line 340
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 341
    .line 342
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/domain/h;->J:Lkotlin/Lazy;

    .line 343
    .line 344
    .line 345
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 346
    move-result-object v3

    .line 347
    move-object v8, v3

    .line 348
    .line 349
    check-cast v8, Lcom/sumsub/sns/internal/core/common/D0;

    .line 350
    move-object v3, v9

    .line 351
    .line 352
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/e;

    .line 353
    .line 354
    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 355
    .line 356
    iget-object v10, v10, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 357
    .line 358
    .line 359
    invoke-interface {v10}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 360
    move-result-object v10

    .line 361
    .line 362
    check-cast v10, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 363
    .line 364
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 365
    .line 366
    iget-object v11, v11, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 367
    .line 368
    .line 369
    invoke-interface {v11}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 370
    move-result-object v11

    .line 371
    .line 372
    check-cast v11, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 373
    .line 374
    .line 375
    invoke-direct {v9, v10, v11}, Lcom/sumsub/sns/internal/features/domain/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 376
    .line 377
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 378
    .line 379
    .line 380
    invoke-direct {v10}, Lcom/sumsub/sns/internal/features/domain/utils/a;-><init>()V

    .line 381
    .line 382
    new-instance v11, Lcom/sumsub/sns/internal/features/domain/mrtd/e;

    .line 383
    .line 384
    iget-object v12, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 385
    .line 386
    .line 387
    invoke-direct {v11, v12}, Lcom/sumsub/sns/internal/features/domain/mrtd/e;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 388
    .line 389
    new-instance v12, Lcom/sumsub/sns/internal/features/domain/mrtd/i;

    .line 390
    .line 391
    move-object/from16 p1, v1

    .line 392
    .line 393
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/D2;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 394
    .line 395
    .line 396
    invoke-direct {v12, v1}, Lcom/sumsub/sns/internal/features/domain/mrtd/i;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 397
    .line 398
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 399
    .line 400
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;->AlwaysPrompt:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;

    .line 401
    .line 402
    .line 403
    invoke-direct {v1, v13, v2, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;-><init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/utils/SecondSidePolicy;)V

    .line 404
    move-object v0, v3

    .line 405
    move-object v3, v13

    .line 406
    move-object v13, v1

    .line 407
    .line 408
    move-object/from16 v1, p1

    .line 409
    .line 410
    .line 411
    invoke-direct/range {v1 .. v13}, Lcom/sumsub/sns/internal/features/presentation/utils/M;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/t;Lcom/sumsub/sns/internal/features/domain/A;Lcom/sumsub/sns/internal/features/domain/s0;Lcom/sumsub/sns/internal/core/common/D0;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/domain/mrtd/e;Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lcom/sumsub/sns/internal/features/presentation/utils/m;)V

    .line 412
    move-object v4, v1

    .line 413
    goto :goto_3

    .line 414
    :cond_6
    move-object v0, v7

    .line 415
    .line 416
    :goto_3
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;

    .line 417
    .line 418
    move-object/from16 v13, p3

    .line 419
    move-object v9, v0

    .line 420
    move-object v2, v14

    .line 421
    move-object v3, v15

    .line 422
    .line 423
    move/from16 v5, v17

    .line 424
    .line 425
    move-object/from16 v6, v18

    .line 426
    .line 427
    move-object/from16 v7, v19

    .line 428
    .line 429
    move-object/from16 v8, v20

    .line 430
    .line 431
    move-object/from16 v10, v21

    .line 432
    .line 433
    move-object/from16 v11, v22

    .line 434
    .line 435
    move-object/from16 v12, v23

    .line 436
    move-object v14, v4

    .line 437
    .line 438
    move-object/from16 v4, v16

    .line 439
    .line 440
    .line 441
    invoke-direct/range {v1 .. v14}, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/B2;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/X;Ljava/lang/String;Ljava/lang/String;ZLcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/ml/badphotos/c;Lcom/sumsub/sns/internal/ml/docdetector/d;Lcom/sumsub/sns/internal/ml/badphotos/e;Lcom/sumsub/sns/internal/ml/autocapture/d;Lcom/sumsub/sns/internal/ml/autocapture/g;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/presentation/utils/M;)V

    .line 442
    return-object v1

    .line 443
    .line 444
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 445
    .line 446
    const-string v1, "Failed requirement."

    .line 447
    .line 448
    .line 449
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 450
    throw v0
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
.end method
