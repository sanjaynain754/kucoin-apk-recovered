.class public Lcom/sumsub/sns/internal/features/presentation/utils/M;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

.field public static final synthetic x:[Lkotlin/reflect/KProperty;

.field public static final y:[Ljava/lang/String;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

.field public final b:Landroidx/lifecycle/SavedStateHandle;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

.field public final d:Lcom/sumsub/sns/internal/features/domain/t;

.field public final e:Lcom/sumsub/sns/internal/features/domain/A;

.field public final f:Lcom/sumsub/sns/internal/features/domain/s0;

.field public final g:Lcom/sumsub/sns/internal/core/common/D0;

.field public final h:Lcom/sumsub/sns/internal/features/domain/e;

.field public final i:Lcom/sumsub/sns/internal/features/domain/utils/a;

.field public final j:Lcom/sumsub/sns/internal/features/domain/mrtd/e;

.field public final k:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

.field public final l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

.field public m:Lcom/sumsub/sns/core/presentation/base/C;

.field public final n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public final u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

.field public v:Lcom/sumsub/sns/internal/features/data/model/common/h;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;

    .line 3
    .line 4
    const-string v1, "isSeamlessMode"

    .line 5
    .line 6
    const-string v2, "isSeamlessMode()Z"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "acceptMultiplePages"

    .line 14
    .line 15
    const-string v4, "getAcceptMultiplePages()Z"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v4, "compositePickerResults"

    .line 22
    .line 23
    const-string v5, "getCompositePickerResults()Lcom/sumsub/sns/internal/features/data/model/common/CompositeDocumentPickerResult;"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v4, v5, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 27
    move-result-object v4

    .line 28
    .line 29
    .line 30
    const-string/jumbo v5, "pickerResults"

    .line 31
    .line 32
    const-string v6, "getPickerResults()Ljava/util/List;"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v5, v6, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 36
    move-result-object v5

    .line 37
    .line 38
    .line 39
    const-string/jumbo v6, "uploadPerformed"

    .line 40
    .line 41
    const-string v7, "getUploadPerformed()Z"

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v6, v7, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    const-string v7, "documentProperties"

    .line 48
    .line 49
    const-string v8, "getDocumentProperties$idensic_mobile_sdk_aar_defaultRelease()Ljava/util/Map;"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v7, v8, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 53
    move-result-object v7

    .line 54
    .line 55
    const-string v8, "country"

    .line 56
    .line 57
    const-string v9, "getCountry()Ljava/lang/String;"

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v8, v9, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 61
    move-result-object v8

    .line 62
    .line 63
    const-string v9, "idDocType"

    .line 64
    .line 65
    const-string v10, "getIdDocType()Ljava/lang/String;"

    .line 66
    .line 67
    .line 68
    invoke-static {v0, v9, v10, v3}, Lcom/sumsub/sns/internal/core/presentation/android/a;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KMutableProperty1;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const/16 v9, 0x8

    .line 72
    .line 73
    new-array v9, v9, [Lkotlin/reflect/KProperty;

    .line 74
    .line 75
    aput-object v1, v9, v3

    .line 76
    const/4 v1, 0x1

    .line 77
    .line 78
    aput-object v2, v9, v1

    .line 79
    const/4 v1, 0x2

    .line 80
    .line 81
    aput-object v4, v9, v1

    .line 82
    const/4 v1, 0x3

    .line 83
    .line 84
    aput-object v5, v9, v1

    .line 85
    const/4 v1, 0x4

    .line 86
    .line 87
    aput-object v6, v9, v1

    .line 88
    const/4 v1, 0x5

    .line 89
    .line 90
    aput-object v7, v9, v1

    .line 91
    const/4 v1, 0x6

    .line 92
    .line 93
    aput-object v8, v9, v1

    .line 94
    const/4 v1, 0x7

    .line 95
    .line 96
    aput-object v0, v9, v1

    .line 97
    .line 98
    sput-object v9, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 99
    .line 100
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/s;

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/s;-><init>()V

    .line 104
    .line 105
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    .line 106
    .line 107
    .line 108
    const-string/jumbo v0, "sameSides"

    .line 109
    .line 110
    const-string v1, "inconsistentDocument"

    .line 111
    .line 112
    .line 113
    const-string/jumbo v2, "shouldBeDoubleSided"

    .line 114
    .line 115
    .line 116
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->y:[Ljava/lang/String;

    .line 120
    return-void
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
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/domain/t;Lcom/sumsub/sns/internal/features/domain/A;Lcom/sumsub/sns/internal/features/domain/s0;Lcom/sumsub/sns/internal/core/common/D0;Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/utils/a;Lcom/sumsub/sns/internal/features/domain/mrtd/e;Lcom/sumsub/sns/internal/features/domain/mrtd/i;Lcom/sumsub/sns/internal/features/presentation/utils/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 10
    .line 11
    iput-object p4, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d:Lcom/sumsub/sns/internal/features/domain/t;

    .line 12
    .line 13
    iput-object p5, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e:Lcom/sumsub/sns/internal/features/domain/A;

    .line 14
    .line 15
    iput-object p6, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->f:Lcom/sumsub/sns/internal/features/domain/s0;

    .line 16
    .line 17
    iput-object p7, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g:Lcom/sumsub/sns/internal/core/common/D0;

    .line 18
    .line 19
    iput-object p8, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->h:Lcom/sumsub/sns/internal/features/domain/e;

    .line 20
    .line 21
    iput-object p9, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 22
    .line 23
    iput-object p10, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->j:Lcom/sumsub/sns/internal/features/domain/mrtd/e;

    .line 24
    .line 25
    iput-object p11, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->k:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

    .line 26
    .line 27
    iput-object p12, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 28
    .line 29
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 30
    .line 31
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    const-string p4, "isSeamlessMode"

    .line 34
    const/4 p5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p2, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 38
    .line 39
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 40
    .line 41
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 42
    .line 43
    const-string p4, "KEY_DOCUMENT_ACCEPT_MULTIPLE_PAGES"

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, p2, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 47
    .line 48
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 49
    .line 50
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 51
    .line 52
    const-string p4, "KEY_COMPOSITE_RESULTS"

    .line 53
    const/4 p6, 0x0

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, p2, p4, p6, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 57
    .line 58
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 59
    .line 60
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 61
    .line 62
    .line 63
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 64
    move-result-object p4

    .line 65
    .line 66
    const-string p7, "KEY_RESULTS"

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p2, p7, p4, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 70
    .line 71
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 72
    .line 73
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 74
    .line 75
    const-string p4, "KEY_UPLOAD_PERFORMED"

    .line 76
    .line 77
    .line 78
    invoke-direct {p1, p2, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 79
    .line 80
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 81
    .line 82
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 83
    .line 84
    .line 85
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 86
    move-result-object p3

    .line 87
    .line 88
    const-string p4, "documentProperties"

    .line 89
    .line 90
    .line 91
    invoke-direct {p1, p2, p4, p3, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 92
    .line 93
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 94
    .line 95
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 96
    .line 97
    const-string p3, "KEY_COUNTRY"

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p2, p3, p6, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 101
    .line 102
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 103
    .line 104
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 105
    .line 106
    const-string p3, "KEY_ID_DOC_TYPE"

    .line 107
    .line 108
    const-string p4, "OTHER"

    .line 109
    .line 110
    .line 111
    invoke-direct {p1, p2, p3, p4, p5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Ljava/lang/Object;Z)V

    .line 112
    .line 113
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 114
    return-void
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
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/utils/B;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/B;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 198
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->b:Ljava/util/List;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, p1

    move-object p1, p0

    move-object p0, v7

    goto/16 :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 199
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "on picker result: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 200
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 201
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 202
    const-string v6, "DocCapture"

    invoke-virtual {v2, v6, p2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_7

    .line 203
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    .line 204
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object p1

    .line 205
    sget-object p2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne p1, p2, :cond_4

    .line 206
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 207
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 208
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 209
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 210
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 211
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 212
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object p2

    .line 213
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 214
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    invoke-interface {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->a(Z)V

    .line 216
    :cond_6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 217
    :cond_7
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    .line 218
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v5

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 219
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_8
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 220
    :goto_1
    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->b:Ljava/util/List;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->e:I

    invoke-static {p0, p1, v0, v4}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_3

    .line 221
    :cond_9
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/utils/q;

    .line 222
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    if-eqz p0, :cond_b

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->b:Ljava/util/List;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/utils/B;->e:I

    invoke-interface {p0, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_a

    :goto_3
    return-object v1

    .line 223
    :cond_a
    :goto_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_b
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/utils/I;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/I;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 82
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 83
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p2

    .line 84
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 85
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/m;->c()Z

    move-result p1

    if-ne p1, v3, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 86
    :goto_1
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->h:Lcom/sumsub/sns/internal/features/domain/e;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/I;->d:I

    invoke-virtual {p2, p1, v0}, Lcom/sumsub/sns/internal/features/domain/e;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    move-object p1, v0

    :cond_5
    check-cast p1, Lcom/sumsub/sns/internal/features/domain/n;

    if-eqz p1, :cond_6

    .line 87
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/domain/n;->e:Ljava/lang/String;

    goto :goto_3

    :cond_6
    move-object p1, v0

    .line 88
    :goto_3
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 89
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    .line 90
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 91
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 92
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p2, "resolve country, country = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 93
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 94
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 95
    const-string p2, "DocCapture"

    invoke-virtual {p1, p2, p0, v0}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 96
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;
    .locals 1

    and-int/lit8 v0, p3, 0x1

    if-eqz v0, :cond_0

    .line 521
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/16 p3, 0x780

    goto :goto_0

    :cond_1
    const/16 p3, 0xc8

    .line 522
    :goto_0
    invoke-virtual {p0, p1, p3, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/features/presentation/utils/M;ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/utils/x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 97
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, 0x2

    const-string v6, "DocCapture"

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v8, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-boolean p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->c:Z

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->c:Z

    iget-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i:Lcom/sumsub/sns/internal/features/domain/utils/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "showCamera, retake="

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 99
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 100
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 101
    invoke-virtual {v2, v6, p2, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_5

    .line 102
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    if-eqz p2, :cond_5

    .line 103
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eqz p2, :cond_5

    .line 104
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 105
    :cond_5
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->c:Z

    iput v8, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    .line 106
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {p2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto/16 :goto_3

    .line 107
    :cond_6
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p2, :cond_7

    .line 108
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 109
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 110
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 111
    const-string p1, "applicant is null"

    invoke-virtual {p0, v6, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v7

    .line 112
    :cond_7
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->c:Z

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    .line 113
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_8

    goto :goto_3

    :cond_8
    move-object v9, v2

    move-object v2, p0

    move p0, p1

    move-object p1, p2

    move-object p2, v9

    .line 114
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-nez p2, :cond_9

    .line 115
    iget-object p0, v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->i:Lcom/sumsub/sns/internal/features/domain/utils/a;

    .line 116
    sget-object p0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 117
    iget-object p0, p0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 118
    const-string p1, "config is null"

    invoke-virtual {p0, v6, p1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v7

    .line 119
    :cond_9
    iget-object v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 120
    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v6, v5, v8

    invoke-virtual {v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_a

    .line 121
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 122
    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    const/4 v7, 0x5

    aget-object v5, v5, v7

    .line 123
    iget-object v5, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 124
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v5, v6, v3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 125
    :cond_a
    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->a:Lcom/sumsub/sns/internal/features/presentation/utils/M;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->b:Lcom/sumsub/sns/internal/features/data/model/common/p;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/utils/x;->f:I

    invoke-virtual {v2, p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(ZLcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;)Lcom/sumsub/sns/internal/features/domain/documents/M;

    move-result-object p2

    if-ne p2, v1, :cond_b

    :goto_3
    return-object v1

    :cond_b
    move-object p0, p1

    move-object p1, v2

    .line 126
    :goto_4
    check-cast p2, Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 127
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p0

    if-eqz p0, :cond_c

    .line 128
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/m;->f()Z

    move-result v0

    if-ne v0, v8, :cond_c

    goto :goto_5

    :cond_c
    if-eqz p0, :cond_e

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/m;->e()Z

    move-result p0

    if-ne p0, v8, :cond_e

    .line 129
    :goto_5
    iget-boolean p0, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->f:Z

    if-eqz p0, :cond_d

    .line 130
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/A;

    invoke-direct {p0, p2}, Lcom/sumsub/sns/internal/features/domain/documents/A;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/M;)V

    return-object p0

    .line 131
    :cond_d
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->PHOTOSELFIE:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object v2

    .line 132
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/N;

    .line 133
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 134
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 135
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 136
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 137
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    .line 138
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x28

    .line 139
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/data/model/common/t2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    .line 140
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/documents/A;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/domain/documents/A;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/M;)V

    .line 141
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/features/domain/documents/N;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/t2;Lcom/sumsub/sns/internal/features/domain/documents/B;)V

    return-object p0

    .line 142
    :cond_e
    iget-boolean p0, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->f:Z

    if-eqz p0, :cond_f

    .line 143
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/y;

    invoke-direct {p0, p2}, Lcom/sumsub/sns/internal/features/domain/documents/y;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/M;)V

    return-object p0

    .line 144
    :cond_f
    iget-object p0, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->c:Ljava/util/List;

    .line 145
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne p0, v0, :cond_10

    .line 146
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->SCAN_BACKSIDE:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object p0

    :goto_6
    move-object v2, p0

    goto :goto_7

    .line 147
    :cond_10
    sget-object p0, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->SCAN_FRONTSIDE:Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/intro/IntroScene;->getSceneName()Ljava/lang/String;

    move-result-object p0

    goto :goto_6

    .line 148
    :goto_7
    new-instance p0, Lcom/sumsub/sns/internal/features/domain/documents/N;

    .line 149
    new-instance v0, Lcom/sumsub/sns/internal/features/data/model/common/t2;

    .line 150
    iget-object v1, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->b:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 151
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v1

    .line 152
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 153
    iget-object v3, p2, Lcom/sumsub/sns/internal/features/domain/documents/M;->e:Ljava/lang/String;

    .line 154
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v6, 0x28

    .line 155
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/data/model/common/t2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    .line 156
    new-instance p1, Lcom/sumsub/sns/internal/features/domain/documents/y;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/domain/documents/y;-><init>(Lcom/sumsub/sns/internal/features/domain/documents/M;)V

    .line 157
    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/features/domain/documents/N;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/t2;Lcom/sumsub/sns/internal/features/domain/documents/B;)V

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/data/model/common/T;)Z
    .locals 0

    .line 11
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iget-object p0, p0, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eq p1, p0, :cond_1

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;I)Landroid/graphics/Bitmap;
    .locals 9

    const/4 v1, 0x0

    .line 2
    :try_start_0
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/B0;->a(Ljava/io/File;II)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_0

    :cond_0
    return-object v1

    .line 4
    :goto_0
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    .line 5
    :cond_1
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v2, p2, v0, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "decodePdf errro: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 7
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 8
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 9
    const-string v2, "DocCapture"

    invoke-virtual {v0, v2, p2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    sget-object v3, Lkotlinx/coroutines/q1;->b:Lkotlinx/coroutines/q1;

    sget-object v4, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/g2;

    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/utils/v;

    invoke-direct {v6, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/v;-><init>(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-object v1
.end method

.method public a(ZLcom/sumsub/sns/internal/features/data/model/common/p;Lcom/sumsub/sns/internal/features/data/model/common/h;)Lcom/sumsub/sns/internal/features/domain/documents/M;
    .locals 10

    .line 343
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    .line 344
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;->e()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 345
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_5

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 346
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 347
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 348
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/T;->i:Z

    if-nez v0, :cond_1

    goto :goto_1

    .line 349
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 350
    invoke-static {p3, v1}, Lcom/sumsub/sns/internal/features/data/model/common/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_5

    .line 351
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/X;->f()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p2, v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 352
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/data/model/common/m;->d:Ljava/lang/String;

    goto :goto_0

    :cond_3
    const/4 p3, 0x0

    .line 353
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->Disabled:Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/VideoRequiredType;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    const/4 p3, 0x0

    :goto_2
    move v4, p3

    goto :goto_4

    :cond_5
    :goto_3
    const/4 p3, 0x1

    goto :goto_2

    .line 354
    :goto_4
    new-instance v0, Lcom/sumsub/sns/internal/features/domain/documents/M;

    .line 355
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    move-result v1

    .line 356
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 357
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->f()Ljava/util/List;

    move-result-object v3

    .line 358
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v7

    .line 359
    invoke-virtual {p0, p2, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;Z)Z

    move-result v8

    const/4 v6, 0x0

    const/16 v9, 0x10

    move v5, p1

    .line 360
    invoke-direct/range {v0 .. v9}, Lcom/sumsub/sns/internal/features/domain/documents/M;-><init>(ZLcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/util/List;ZZLcom/sumsub/sns/internal/features/presentation/camera/photo/document/DocCapture$PreferredMode;Ljava/lang/String;ZI)V

    return-object v0
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/J;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/utils/D;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 158
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->d:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v3, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->a:Ljava/util/ArrayList;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 159
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "on picker results: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 160
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 161
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 162
    const-string v6, "DocCapture"

    invoke-virtual {v2, v6, p2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-nez p1, :cond_4

    .line 163
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 164
    :cond_4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->p:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v4

    .line 165
    iget-object v2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 166
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 167
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/data/model/common/J;->a:Ljava/util/List;

    .line 168
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 169
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v8, "result: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 170
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 171
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 172
    invoke-virtual {v7, v6, v2, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 173
    :cond_5
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/J;->a:Ljava/util/List;

    .line 174
    new-instance p2, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 175
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v6, "IDENTITY_VIDEO"

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 176
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 177
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v7

    .line 178
    iget-object v8, v2, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 179
    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    move-object v7, v5

    :goto_3
    if-nez v7, :cond_7

    goto :goto_4

    :cond_7
    move-object v6, v7

    :goto_4
    const/16 v7, 0x3f7

    .line 180
    invoke-static {v2, v5, v6, v5, v7}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object v2

    .line 181
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 182
    :cond_8
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 183
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 184
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_a

    .line 185
    :cond_9
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object p1

    .line 186
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object p1

    .line 187
    :cond_a
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    .line 189
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 190
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 191
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 192
    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_b

    .line 193
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 194
    :cond_c
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->a:Ljava/util/ArrayList;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->d:I

    invoke-static {p0, p2, v0, v4}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_d

    goto :goto_7

    :cond_d
    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    .line 195
    :goto_6
    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/utils/q;

    .line 196
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    if-eqz v2, :cond_f

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->a:Ljava/util/ArrayList;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/utils/D;->d:I

    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_e

    :goto_7
    return-object v1

    .line 197
    :cond_e
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_f
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/utils/t;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/utils/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 558
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 559
    :try_start_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    if-eqz p1, :cond_4

    .line 560
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/t;->c:I

    .line 561
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object p3

    new-instance v2, Lcom/sumsub/sns/internal/core/common/y0;

    invoke-direct {v2, p1, p2, v4}, Lcom/sumsub/sns/internal/core/common/y0;-><init>(Ljava/io/File;ILkotlin/coroutines/Continuation;)V

    invoke-static {p3, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_3

    return-object v1

    .line 562
    :cond_3
    :goto_1
    check-cast p3, Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p3

    :cond_4
    return-object v4

    .line 563
    :goto_2
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_5

    const-string p3, ""

    .line 564
    :cond_5
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    invoke-virtual {v0, p2, p3, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 565
    sget-object p2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 566
    iget-object p2, p2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 567
    const-string p3, "DocCapture"

    const-string v0, "Can\'t decode image"

    invoke-virtual {p2, p3, v0, p1}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 568
    sget-object v5, Lkotlinx/coroutines/q1;->b:Lkotlinx/coroutines/q1;

    sget-object v6, Lkotlinx/coroutines/g2;->b:Lkotlinx/coroutines/g2;

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/utils/u;

    invoke-direct {v8, p1, v4}, Lcom/sumsub/sns/internal/features/presentation/utils/u;-><init>(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-object v4
.end method

.method public a(Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/T;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/utils/z;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/utils/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 37
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->a:Ljava/lang/Object;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->b:Ljava/lang/String;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 38
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "initForCamera: country="

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", idDocType="

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 39
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 40
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 41
    const-string v7, "DocCapture"

    invoke-virtual {v2, v7, p3, v5}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 42
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->a:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->b:Ljava/lang/String;

    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    .line 43
    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p3, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto/16 :goto_3

    .line 44
    :cond_5
    :goto_1
    check-cast p3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p3, :cond_8

    .line 45
    invoke-virtual {p0, p3}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    if-nez p2, :cond_7

    .line 46
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p2

    invoke-virtual {p3, p2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    if-eqz p2, :cond_6

    .line 47
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    if-nez p2, :cond_7

    .line 48
    :cond_6
    const-string p2, "OTHER"

    .line 49
    :cond_7
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v7, 0x7

    aget-object v2, v2, v7

    .line 50
    iget-object v2, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 51
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, p3, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 52
    :cond_8
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object p3, p3, v2

    .line 53
    iget-object p3, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 54
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p3, p2, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 55
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d:Lcom/sumsub/sns/internal/features/domain/t;

    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v2

    iput-object p0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->a:Ljava/lang/Object;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->b:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    invoke-virtual {p2, p3, p1, v2, v0}, Lcom/sumsub/sns/internal/features/domain/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    goto :goto_3

    :cond_9
    move-object p1, p0

    :goto_2
    check-cast p3, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 56
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 57
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 58
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    aget-object p2, p2, v6

    .line 59
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 60
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, p3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    iput-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->a:Ljava/lang/Object;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/z;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    .line 62
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/util/List;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/utils/w;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->j:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->j:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 487
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->j:I

    const-string v5, "DocCapture"

    const/4 v6, 0x5

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_1

    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->a:I

    iget-object v10, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->f:Ljava/util/Map;

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->e:Ljava/lang/String;

    iget-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->d:Ljava/util/Iterator;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->c:Ljava/util/Map;

    iget-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->b:Ljava/util/Map;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 p3, v6

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->g:Z

    iget v10, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->a:I

    iget-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->e:Ljava/lang/String;

    iget-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->d:Ljava/util/Iterator;

    iget-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->c:Ljava/util/Map;

    iget-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->b:Ljava/util/Map;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 p3, v6

    goto/16 :goto_6

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 488
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v4, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v4, v4, v6

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .line 489
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 490
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 491
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v14, v1

    move-object v13, v4

    move-object v12, v10

    move/from16 v1, p2

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 492
    iget-object v10, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    if-eqz v10, :cond_4

    .line 493
    invoke-static {v10}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v10

    invoke-virtual {v10}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_4

    .line 494
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v11

    invoke-virtual {v11, v10}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_4
    move-object v10, v9

    .line 495
    :goto_2
    iget-object v11, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v11, :cond_5

    .line 496
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_5
    move-object v11, v9

    :goto_3
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 p3, v6

    const-string/jumbo v6, "processing "

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ", mimeType="

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 497
    sget-object v11, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 498
    iget-object v11, v11, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 499
    invoke-virtual {v11, v5, v6, v9}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 500
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    iget-object v6, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v6, :cond_6

    .line 502
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    move-object v11, v6

    goto :goto_4

    :cond_6
    move-object v11, v9

    :goto_4
    if-nez v11, :cond_8

    :cond_7
    :goto_5
    move/from16 v6, p3

    goto :goto_1

    .line 503
    :cond_8
    const-string v6, "application/pdf"

    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    .line 504
    invoke-virtual {v0, v4, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;I)Landroid/graphics/Bitmap;

    move-result-object v4

    goto :goto_7

    .line 505
    :cond_9
    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->b:Ljava/util/Map;

    iput-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->c:Ljava/util/Map;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->d:Ljava/util/Iterator;

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->e:Ljava/lang/String;

    iput-object v9, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->f:Ljava/util/Map;

    iput v1, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->a:I

    iput-boolean v6, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->g:Z

    iput v8, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->j:I

    invoke-virtual {v0, v4, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_a

    goto :goto_8

    :cond_a
    move v10, v1

    move-object v1, v4

    move v4, v6

    .line 506
    :goto_6
    check-cast v1, Landroid/graphics/Bitmap;

    move v6, v4

    move-object v4, v1

    move v1, v10

    :goto_7
    if-nez v4, :cond_b

    .line 507
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 508
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 509
    const-string v6, "bitmap null"

    invoke-virtual {v4, v5, v6, v9}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    .line 510
    :cond_b
    invoke-interface {v13, v11, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v6, :cond_7

    .line 511
    invoke-interface {v14, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    .line 512
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    iget-object v10, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->g:Lcom/sumsub/sns/internal/core/common/D0;

    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->b:Ljava/util/Map;

    iput-object v13, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->c:Ljava/util/Map;

    iput-object v12, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->d:Ljava/util/Iterator;

    iput-object v11, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->e:Ljava/lang/String;

    iput-object v14, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->f:Ljava/util/Map;

    iput v1, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->a:I

    iput v7, v2, Lcom/sumsub/sns/internal/features/presentation/utils/w;->j:I

    invoke-static {v6, v10, v4, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/presentation/utils/s;Lcom/sumsub/sns/internal/core/common/D0;Landroid/graphics/Bitmap;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_c

    :goto_8
    return-object v3

    :cond_c
    move-object v10, v4

    move v4, v1

    move-object v1, v10

    move-object v10, v14

    :goto_9
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 513
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/documents/c;

    invoke-direct {v6, v1}, Lcom/sumsub/sns/internal/features/domain/documents/c;-><init>(I)V

    invoke-interface {v10, v11, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v6, p3

    move v1, v4

    goto/16 :goto_1

    :cond_d
    move/from16 p3, v6

    .line 514
    invoke-interface {v14}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 515
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_a

    .line 516
    :cond_e
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v14}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    .line 517
    :goto_a
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v3, v3, p3

    .line 518
    iget-object v3, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 519
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v3, v2, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 520
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/utils/q;

    invoke-direct {v1, v13, v14}, Lcom/sumsub/sns/internal/features/presentation/utils/q;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public final a(Ljava/util/List;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/utils/C;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/utils/C;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 224
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->a:Lcom/sumsub/sns/core/presentation/base/C;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/utils/N;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 225
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "on forwarded results: "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", sideness="

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 226
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 227
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 228
    const-string v6, "DocCapture"

    invoke-virtual {v2, v6, p3, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v6, 0x4

    aget-object v2, v2, v6

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 230
    iget-object v6, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 231
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v6, p3, v2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p2, :cond_4

    .line 232
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 233
    iget-object p3, p3, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 234
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    aget-object v2, v2, v5

    .line 235
    iget-object v2, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 236
    iget-object p3, p3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v2, p3, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 237
    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 238
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    goto :goto_1

    .line 239
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    if-eqz p1, :cond_8

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->a:Lcom/sumsub/sns/core/presentation/base/C;

    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->d:I

    const/4 p2, 0x3

    invoke-static {p0, v4, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;I)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast p3, Lcom/sumsub/sns/internal/features/presentation/utils/q;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p2

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->a:Lcom/sumsub/sns/core/presentation/base/C;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/C;->d:I

    invoke-interface {p1, p3, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->a(Lcom/sumsub/sns/internal/features/presentation/utils/q;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_3
    return-object v1

    .line 240
    :cond_7
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/E;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;

    iget v4, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;

    invoke-direct {v3, v0, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 375
    iget v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    const/4 v6, 0x5

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v11, "DocCapture"

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v5, :cond_6

    if-eq v5, v12, :cond_5

    if-eq v5, v8, :cond_4

    if-eq v5, v7, :cond_3

    if-eq v5, v9, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    check-cast v1, Lcom/sumsub/sns/internal/features/domain/h0;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_15

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    iget-object v4, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v3

    move-object v8, v4

    :goto_1
    move v7, v1

    goto/16 :goto_11

    :cond_3
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto/16 :goto_8

    :cond_4
    iget-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    iget-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    check-cast v5, Lcom/sumsub/sns/internal/features/data/model/common/m;

    iget-object v8, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v6, v5

    move-object v5, v8

    goto/16 :goto_6

    :cond_5
    iget-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 376
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    .line 377
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 378
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Data for document is uploaded. Document is "

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " idDocs: "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 379
    sget-object v5, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 380
    iget-object v5, v5, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 381
    invoke-virtual {v5, v11, v2, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 382
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v5, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v5, v5, v9

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 383
    iget-object v14, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 384
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v14, v2, v5}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 385
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    iput v12, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    .line 386
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    invoke-virtual {v2, v10, v3}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    goto/16 :goto_14

    .line 387
    :cond_7
    :goto_2
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz v2, :cond_2f

    .line 388
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/sumsub/sns/internal/features/data/model/common/p;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)Lcom/sumsub/sns/internal/features/data/model/common/m;

    move-result-object v5

    if-eqz v5, :cond_2e

    .line 389
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/domain/l0;->a(Ljava/util/List;)Z

    move-result v2

    .line 390
    iget-object v14, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->j:Lcom/sumsub/sns/internal/features/domain/mrtd/e;

    .line 391
    iget-object v15, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 392
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v6, v17

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 393
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v6, :cond_8

    .line 394
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->e:Ljava/lang/String;

    goto :goto_4

    :cond_8
    move-object v6, v13

    :goto_4
    if-eqz v6, :cond_9

    goto :goto_5

    :cond_9
    const/4 v6, 0x5

    goto :goto_3

    :cond_a
    move-object v6, v13

    .line 395
    :goto_5
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    iput-boolean v2, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    invoke-virtual {v14, v15, v6, v3}, Lcom/sumsub/sns/internal/features/domain/mrtd/e;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_b

    goto/16 :goto_14

    :cond_b
    move-object/from16 v18, v5

    move-object v5, v1

    move v1, v2

    move-object v2, v6

    move-object/from16 v6, v18

    .line 396
    :goto_6
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/mrtd/D;

    if-eqz v2, :cond_f

    .line 397
    iget-object v6, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v6}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Document requires NFC but it\'s unavailable, document type: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 398
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 399
    iget-object v7, v7, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 400
    invoke-virtual {v7, v11, v6, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 401
    invoke-interface {v2}, Lcom/sumsub/sns/internal/features/domain/mrtd/D;->getThrowable()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 402
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/documents/g;

    instance-of v3, v2, Ljava/lang/Exception;

    if-eqz v3, :cond_c

    move-object v13, v2

    check-cast v13, Ljava/lang/Exception;

    :cond_c
    if-nez v13, :cond_d

    new-instance v13, Ljava/lang/Exception;

    invoke-direct {v13, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    :cond_d
    invoke-direct {v1, v13}, Lcom/sumsub/sns/internal/features/domain/documents/g;-><init>(Ljava/lang/Exception;)V

    return-object v1

    :cond_e
    move-object v2, v13

    goto :goto_9

    .line 403
    :cond_f
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->k:Lcom/sumsub/sns/internal/features/domain/mrtd/i;

    .line 404
    iget-object v8, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 405
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 406
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_7
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_11

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 407
    move-object/from16 v9, v16

    check-cast v9, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 408
    iget-object v9, v9, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v9, :cond_10

    .line 409
    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    const/4 v9, 0x4

    goto :goto_7

    .line 410
    :cond_11
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    iput v7, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    invoke-virtual {v2, v8, v6, v14, v3}, Lcom/sumsub/sns/internal/features/domain/mrtd/i;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/data/model/common/m;Ljava/util/ArrayList;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_12

    goto/16 :goto_14

    .line 411
    :cond_12
    :goto_8
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_13

    .line 412
    sget-object v7, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v7, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v7}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v7

    .line 413
    invoke-static {v7}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v7

    .line 414
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "Error while extracting MRTD document"

    invoke-virtual {v7, v8, v9, v6}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 415
    :cond_13
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_14

    move-object v2, v13

    :cond_14
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/A2;

    .line 416
    :goto_9
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    if-ne v6, v12, :cond_18

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 417
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v6, :cond_15

    .line 418
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    goto :goto_a

    :cond_15
    move-object v6, v13

    .line 419
    :goto_a
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 420
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v6, :cond_16

    .line 421
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    goto :goto_b

    :cond_16
    move-object v6, v13

    .line 422
    :goto_b
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    :cond_17
    move v10, v12

    .line 423
    :cond_18
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_19

    goto/16 :goto_f

    .line 424
    :cond_19
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1a
    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 425
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v7, :cond_1a

    .line 426
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    if-eqz v7, :cond_1a

    .line 427
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_1b

    goto :goto_c

    .line 428
    :cond_1b
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_1c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 429
    sget-object v9, Lcom/sumsub/sns/internal/features/presentation/utils/M;->y:[Ljava/lang/String;

    invoke-static {v9, v8}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1c

    if-eqz v10, :cond_1f

    .line 430
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d()Z

    move-result v6

    if-eqz v6, :cond_1f

    .line 431
    sget-object v6, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 432
    iget-object v6, v6, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 433
    const-string v7, "Sideness fast fail"

    invoke-virtual {v6, v11, v7, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 434
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/sumsub/sns/internal/features/domain/h0;

    if-eqz v6, :cond_1d

    .line 435
    iget-object v7, v6, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v7, :cond_1d

    .line 436
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    goto :goto_d

    :cond_1d
    move-object v7, v13

    :goto_d
    if-eqz v6, :cond_1e

    .line 437
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v6, :cond_1e

    .line 438
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    goto :goto_e

    :cond_1e
    move-object v6, v13

    .line 439
    :goto_e
    sget-object v8, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;->UNKNOWN:Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 440
    invoke-virtual {v0, v7, v6, v8}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    :cond_1f
    :goto_f
    if-eqz v1, :cond_24

    .line 441
    invoke-static {v5}, Lcom/sumsub/sns/internal/features/domain/l0;->a(Ljava/util/List;)Z

    move-result v1

    .line 442
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 443
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_22

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 444
    check-cast v7, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 445
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v7, :cond_20

    .line 446
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->d:Ljava/util/List;

    if-nez v7, :cond_21

    .line 447
    :cond_20
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v7

    .line 448
    :cond_21
    invoke-static {v2, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_10

    .line 449
    :cond_22
    iput-object v5, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    iput-object v2, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    iput-boolean v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->c:Z

    const/4 v6, 0x4

    iput v6, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    invoke-virtual {v0, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_23

    goto :goto_14

    :cond_23
    move-object v8, v2

    move-object v2, v3

    move-object v10, v5

    goto/16 :goto_1

    .line 450
    :goto_11
    move-object v9, v2

    check-cast v9, Ljava/util/List;

    .line 451
    new-instance v6, Lcom/sumsub/sns/internal/features/domain/documents/p;

    .line 452
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v11

    .line 453
    invoke-direct/range {v6 .. v11}, Lcom/sumsub/sns/internal/features/domain/documents/p;-><init>(ZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    return-object v6

    :cond_24
    if-eqz v2, :cond_25

    .line 454
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 455
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 456
    const-string v3, "Got MRTD seed"

    invoke-virtual {v1, v11, v3, v13}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/documents/i;

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/domain/documents/i;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/A2;)V

    return-object v1

    :cond_25
    if-eqz v10, :cond_2d

    .line 458
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/domain/h0;

    .line 459
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->d:Lcom/sumsub/sns/internal/features/domain/t;

    .line 460
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    if-eqz v1, :cond_26

    .line 461
    iget-object v6, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v6, :cond_26

    .line 462
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    goto :goto_12

    :cond_26
    move-object v6, v13

    :goto_12
    if-eqz v1, :cond_27

    .line 463
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v7, :cond_27

    .line 464
    iget-object v7, v7, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    goto :goto_13

    :cond_27
    move-object v7, v13

    .line 465
    :goto_13
    iput-object v1, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->a:Ljava/lang/Object;

    iput-object v13, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->b:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v3, Lcom/sumsub/sns/internal/features/presentation/utils/E;->f:I

    invoke-virtual {v2, v5, v6, v7, v3}, Lcom/sumsub/sns/internal/features/domain/t;->a(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_28

    :goto_14
    return-object v4

    .line 466
    :cond_28
    :goto_15
    check-cast v2, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    if-eqz v1, :cond_29

    .line 467
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v3, :cond_29

    .line 468
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    goto :goto_16

    :cond_29
    move-object v3, v13

    :goto_16
    if-eqz v1, :cond_2a

    .line 469
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v4, :cond_2a

    .line 470
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    goto :goto_17

    :cond_2a
    move-object v4, v13

    .line 471
    :goto_17
    invoke-virtual {v0, v3, v4, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    .line 472
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/documents/e;

    if-eqz v1, :cond_2b

    .line 473
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v4, :cond_2b

    .line 474
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->b:Ljava/lang/String;

    goto :goto_18

    :cond_2b
    move-object v4, v13

    :goto_18
    if-eqz v1, :cond_2c

    .line 475
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/domain/h0;->b:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    if-eqz v1, :cond_2c

    .line 476
    iget-object v13, v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;->a:Ljava/lang/String;

    .line 477
    :cond_2c
    invoke-direct {v3, v4, v13, v2}, Lcom/sumsub/sns/internal/features/domain/documents/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V

    return-object v3

    .line 478
    :cond_2d
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/documents/l;

    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-direct {v1, v2}, Lcom/sumsub/sns/internal/features/domain/documents/l;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;)V

    return-object v1

    .line 479
    :cond_2e
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v1

    .line 480
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    .line 481
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "docSetItem null!"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    new-instance v1, Ljava/lang/IllegalStateException;

    .line 482
    const-string v2, "docSetItem is null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 483
    :cond_2f
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object v1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {v1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object v1

    .line 484
    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v2

    .line 485
    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "applicant null!"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    new-instance v1, Ljava/lang/IllegalStateException;

    .line 486
    const-string v2, "Applicant is null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 16
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    const/4 v3, 0x0

    const-string v4, "DocCapture"

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 18
    iget-object p1, p1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 19
    const-string v2, "init photo picker"

    invoke-virtual {p1, v4, v2, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v7, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    .line 21
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    .line 22
    :cond_5
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_9

    .line 23
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V

    .line 24
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b:Landroidx/lifecycle/SavedStateHandle;

    const-string v7, "KEY_ID_DOC_TYPE"

    invoke-virtual {v2, v7}, Landroidx/lifecycle/SavedStateHandle;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 25
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    if-eqz v2, :cond_6

    .line 26
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    if-nez v2, :cond_7

    .line 27
    :cond_6
    const-string v2, "OTHER"

    .line 28
    :cond_7
    invoke-virtual {p0, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/lang/String;)V

    .line 29
    :cond_8
    iput v6, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    .line 30
    invoke-static {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lcom/sumsub/sns/internal/features/data/model/common/p;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    goto :goto_3

    .line 31
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "isSeamlessMode="

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 33
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 34
    invoke-virtual {v2, v4, p1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    iput v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/y;->c:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_3
    return-object v1

    .line 36
    :cond_a
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public a(Lkotlin/coroutines/jvm/internal/SuspendLambda;)Ljava/lang/Object;
    .locals 3

    .line 365
    sget-object p1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 366
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 367
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 368
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 369
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 370
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    .line 371
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 372
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 373
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->m:Lcom/sumsub/sns/core/presentation/base/C;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/N;->b(Z)V

    .line 374
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lcom/sumsub/sns/internal/features/domain/n0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/presentation/utils/J;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;

    iget v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->e:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->e:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/J;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object v1, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 273
    iget v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->e:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_e

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->b:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function3;

    iget-object v6, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->a:Ljava/lang/Object;

    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v8, v4

    move-object v4, v6

    goto/16 :goto_a

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 275
    sget-object v8, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lcom/sumsub/sns/internal/features/presentation/utils/s;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;)Ljava/lang/String;

    move-result-object v8

    .line 276
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v10, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v11, 0x5

    aget-object v10, v10, v11

    invoke-virtual {v9}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    .line 277
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-eqz v8, :cond_5

    .line 278
    iget v8, v8, Lcom/sumsub/sns/internal/features/domain/documents/c;->a:I

    .line 279
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    goto :goto_2

    :cond_5
    move-object v8, v7

    .line 280
    :goto_2
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    if-eqz v8, :cond_4

    if-eqz v4, :cond_4

    .line 281
    iget-object v9, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e:Lcom/sumsub/sns/internal/features/domain/A;

    .line 282
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 283
    invoke-virtual {v9, v8, v4}, Lcom/sumsub/sns/internal/features/domain/A;->a(ILjava/io/File;)V

    goto :goto_1

    .line 284
    :cond_6
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    .line 285
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 286
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "IDENTITY_VIDEO"

    if-eqz v8, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 287
    iget-object v10, v10, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 288
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 289
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 290
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v6, :cond_c

    .line 291
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_9

    .line 292
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_5

    .line 293
    :cond_9
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 294
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eqz v4, :cond_a

    .line 295
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    .line 296
    new-instance v4, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v1, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 297
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 298
    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    const/16 v10, 0x3ef

    .line 299
    invoke-static {v8, v7, v7, v7, v10}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object v8

    .line 300
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 301
    :cond_b
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 302
    :cond_c
    :goto_5
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 303
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_d

    goto :goto_6

    .line 304
    :cond_d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 305
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    .line 306
    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    move v14, v4

    goto :goto_7

    :cond_f
    :goto_6
    move v14, v6

    .line 307
    :goto_7
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    .line 308
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_10

    goto :goto_8

    .line 309
    :cond_10
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 310
    iget-boolean v9, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->f:Z

    if-eqz v9, :cond_11

    .line 311
    iget-object v8, v8, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 312
    sget-object v9, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-ne v8, v9, :cond_11

    move v15, v6

    goto :goto_9

    :cond_12
    :goto_8
    move v15, v4

    .line 313
    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "uploading docs, parallel="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", hasUploadedFrontSiede="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 314
    sget-object v4, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 315
    iget-object v4, v4, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 316
    const-string v8, "DocCapture"

    invoke-virtual {v4, v8, v1, v7}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 317
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->f:Lcom/sumsub/sns/internal/features/domain/s0;

    move-object/from16 v4, p3

    .line 318
    iput-object v4, v1, Lcom/sumsub/sns/internal/features/domain/s0;->d:Lcom/sumsub/sns/internal/features/domain/n0;

    .line 319
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/m0;

    .line 320
    iget-object v11, v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 321
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v12

    .line 322
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v13

    .line 323
    invoke-direct/range {v10 .. v15}, Lcom/sumsub/sns/internal/features/domain/m0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Ljava/lang/String;Ljava/util/List;ZZ)V

    move-object/from16 v4, p1

    .line 324
    iput-object v4, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->a:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->b:Ljava/lang/Object;

    iput v6, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->e:I

    .line 325
    invoke-static {v1, v10, v2}, Lcom/sumsub/sns/internal/features/domain/k0;->a(Lcom/sumsub/sns/internal/features/domain/k0;Lcom/sumsub/sns/internal/features/domain/f0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_13

    goto :goto_d

    .line 326
    :cond_13
    :goto_a
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/a0;

    .line 327
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/utils/K;

    invoke-direct {v6, v8, v0, v7}, Lcom/sumsub/sns/internal/features/presentation/utils/K;-><init>(Lkotlin/jvm/functions/Function3;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    new-instance v9, Lcom/sumsub/sns/internal/features/presentation/utils/L;

    invoke-direct {v9, v0, v4, v8, v7}, Lcom/sumsub/sns/internal/features/presentation/utils/L;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)V

    iput-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->a:Ljava/lang/Object;

    iput-object v7, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->b:Ljava/lang/Object;

    iput v5, v2, Lcom/sumsub/sns/internal/features/presentation/utils/J;->e:I

    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/Z;

    if-eqz v4, :cond_14

    .line 330
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Z;

    .line 331
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/Z;->a:Ljava/lang/Object;

    .line 332
    check-cast v1, Ljava/util/List;

    .line 333
    invoke-virtual {v9, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/L;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/utils/L;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/L;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 334
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_16

    :goto_b
    move-object v2, v1

    goto :goto_c

    .line 335
    :cond_14
    instance-of v4, v1, Lcom/sumsub/sns/internal/features/data/model/common/Y;

    if-eqz v4, :cond_15

    .line 336
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/Y;

    .line 337
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/Y;->a:Ljava/lang/Object;

    .line 338
    check-cast v1, Ljava/lang/Exception;

    .line 339
    invoke-virtual {v6, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/K;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/utils/K;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/internal/features/presentation/utils/K;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 340
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne v1, v4, :cond_16

    goto :goto_b

    .line 341
    :cond_15
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_16
    :goto_c
    if-ne v2, v3, :cond_17

    :goto_d
    return-object v3

    .line 342
    :cond_17
    :goto_e
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method public final a()Ljava/lang/String;
    .locals 3

    .line 15
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final a(I)V
    .locals 4

    .line 257
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "removeDocAt "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 258
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 259
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v3, 0x0

    .line 260
    invoke-virtual {v2, v0, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 261
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    if-nez p1, :cond_0

    return-void

    .line 262
    :cond_0
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    return-void
.end method

.method public final a(ILjava/io/File;)V
    .locals 4

    .line 523
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "onPhotoRotationChanged: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 524
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 525
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 526
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 527
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    .line 528
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v3, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 529
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 530
    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/domain/documents/c;

    if-nez v3, :cond_0

    goto :goto_0

    .line 531
    :cond_0
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/documents/c;

    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/domain/documents/c;-><init>(I)V

    .line 532
    invoke-interface {v0, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object p2, v1, v2

    .line 534
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 535
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V
    .locals 3

    .line 248
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 249
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object v1

    if-ne p1, v1, :cond_0

    return-void

    .line 250
    :cond_0
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 251
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 252
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 253
    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 254
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-result-object v0

    .line 255
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 256
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/T;)V
    .locals 4

    .line 241
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 242
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getHasNoSideness()Z

    move-result v1

    if-nez v1, :cond_0

    .line 243
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/utils/a0;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/a0;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 244
    :cond_0
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->d:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 245
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3f7

    const/4 v3, 0x0

    invoke-static {p1, v3, v1, v3, v2}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 246
    :cond_1
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    :goto_0
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;)V
    .locals 3

    .line 63
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->k()Lcom/sumsub/sns/internal/features/data/model/common/n;

    move-result-object p1

    .line 64
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/n;->a:Ljava/util/List;

    .line 65
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/m;

    .line 66
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 67
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 68
    :goto_0
    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/m;

    if-eqz v0, :cond_3

    .line 69
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/X;->d()Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/m;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 70
    sget-object p1, Lcom/sumsub/sns/internal/ff/a;->r:Lcom/sumsub/sns/internal/ff/core/a;

    .line 71
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/ff/core/a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    move p1, v1

    .line 72
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    aget-object v1, v2, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 73
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 74
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 5

    .line 263
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f;->a:Lcom/sumsub/sns/internal/features/presentation/camera/photo/document/f;

    invoke-static {v0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "removeDoc "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 264
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 265
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    const/4 v3, 0x0

    .line 266
    invoke-virtual {v2, v0, v1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 267
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 268
    iget-object v4, v2, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 269
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 270
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/T;->a:Ljava/io/File;

    .line 271
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_1
    move-object v3, v1

    :cond_2
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    if-nez v3, :cond_3

    return-void

    .line 272
    :cond_3
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b(Lcom/sumsub/sns/internal/features/data/model/common/T;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "setIdDocTypeInfo, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 76
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 77
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 78
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    .line 80
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 81
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;)V
    .locals 4

    .line 536
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Try apply new country="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " and idDocType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 537
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 538
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 539
    const-string v2, "DocCapture"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    if-eqz p1, :cond_0

    .line 540
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->t:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    .line 541
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 542
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    if-eqz p2, :cond_1

    .line 543
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v1, 0x7

    aget-object v0, v0, v1

    .line 544
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 545
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 546
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 547
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 548
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    const/4 v0, 0x1

    aget-object p2, p2, v0

    .line 549
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 550
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {p2, p1, p3}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 551
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p1

    .line 552
    new-instance p2, Ljava/util/ArrayList;

    const/16 p3, 0xa

    invoke-static {p1, p3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 553
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 554
    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 555
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x3d3

    invoke-static {p3, v1, v0, v3, v2}, Lcom/sumsub/sns/internal/features/data/model/common/T;->a(Lcom/sumsub/sns/internal/features/data/model/common/T;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;I)Lcom/sumsub/sns/internal/features/data/model/common/T;

    move-result-object p3

    .line 556
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 557
    :cond_2
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 3

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    .line 13
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 14
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/p;Z)Z
    .locals 3

    .line 361
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ne p2, v1, :cond_1

    .line 362
    :cond_0
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->r:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x4

    aget-object v0, v0, v2

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_1

    .line 363
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {p2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->isSubmitted()Z

    move-result p2

    if-nez p2, :cond_1

    .line 364
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->p()Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/A;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/A;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/A;->c:I

    .line 4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 5
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_4

    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->v:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 7
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->u:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final b(Lcom/sumsub/sns/internal/features/data/model/common/T;)V
    .locals 11

    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 10
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Ljava/util/List;)V

    .line 11
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    if-eqz v0, :cond_0

    .line 12
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a(Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;)V

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x5

    aget-object v3, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 14
    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 15
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->w:Lcom/sumsub/sns/internal/features/presentation/utils/s;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 17
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    .line 18
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableMap(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->s:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    aget-object v1, v1, v2

    .line 20
    iget-object v1, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 21
    iget-object v2, v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 22
    sget-object v5, Lkotlinx/coroutines/q1;->b:Lkotlinx/coroutines/q1;

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v6

    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/utils/G;

    invoke-direct {v8, p1, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/utils/G;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/T;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/utils/F;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/utils/F;-><init>(Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/utils/F;->c:I

    .line 4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 5
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-nez p1, :cond_4

    .line 6
    sget-object p1, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    sget-object p1, Lcom/sumsub/sns/internal/log/LoggerType;->KIBANA:Lcom/sumsub/sns/internal/log/LoggerType;

    filled-new-array {p1}, [Lcom/sumsub/sns/internal/log/LoggerType;

    move-result-object p1

    .line 7
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/sumsub/sns/internal/log/c;->b(Ljava/util/List;)Lcom/sumsub/sns/internal/log/logger/b;

    move-result-object v0

    .line 8
    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "applicant null!"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->e$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 10
    :cond_4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/model/common/p;->b(Lcom/sumsub/sns/internal/features/data/model/common/X;)Ljava/util/List;

    move-result-object p1

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 13
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/q2;

    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/q2;->a:Ljava/lang/String;

    .line 15
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 16
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->v:Lcom/sumsub/sns/internal/features/data/model/common/h;

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->e:Ljava/util/Map;

    if-eqz p1, :cond_6

    .line 18
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_3

    :cond_6
    move-object p1, v1

    .line 19
    :goto_3
    instance-of v2, p1, Ljava/util/Map;

    if-eqz v2, :cond_7

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    :cond_7
    if-eqz v1, :cond_a

    .line 20
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 21
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 23
    :cond_9
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    invoke-static {v1, p1}, Lkotlin/collections/CollectionsKt;->intersect(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    if-eqz p1, :cond_a

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_a

    return-object p1

    .line 24
    :cond_a
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->q:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final d()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->v:Lcom/sumsub/sns/internal/features/data/model/common/h;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v2}, Lcom/sumsub/sns/internal/features/data/model/common/i;->b(Lcom/sumsub/sns/internal/features/data/model/common/h;Ljava/lang/String;)Z

    .line 17
    move-result v0

    .line 18
    const/4 v2, 0x1

    .line 19
    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    return v2

    .line 22
    :cond_0
    return v1
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
.end method

.method public final e()Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->n:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    move-result v0

    .line 18
    return v0
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
.end method

.method public final f()Ljava/util/List;
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v2, "isSeamlessMode="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 26
    .line 27
    const-string v2, "DocCapture"

    .line 28
    const/4 v3, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v0, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->e()Z

    .line 37
    move-result v1

    .line 38
    .line 39
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->o:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 40
    .line 41
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/M;->x:[Lkotlin/reflect/KProperty;

    .line 42
    const/4 v4, 0x1

    .line 43
    .line 44
    aget-object v3, v3, v4

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    check-cast v2, Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    move-result v2

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 58
    move-result-object v3

    .line 59
    .line 60
    if-nez v1, :cond_0

    .line 61
    .line 62
    if-nez v2, :cond_0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    .line 69
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    .line 73
    :cond_0
    iget-object v5, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 74
    .line 75
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 76
    .line 77
    aget-object v6, v6, v4

    .line 78
    .line 79
    .line 80
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 81
    move-result-object v5

    .line 82
    .line 83
    check-cast v5, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 84
    .line 85
    sget-object v6, Lcom/sumsub/sns/internal/features/presentation/utils/l;->a:[I

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 89
    move-result v5

    .line 90
    .line 91
    aget v5, v6, v5

    .line 92
    .line 93
    if-eq v5, v4, :cond_6

    .line 94
    const/4 v3, 0x2

    .line 95
    .line 96
    if-eq v5, v3, :cond_5

    .line 97
    const/4 v3, 0x3

    .line 98
    .line 99
    if-ne v5, v3, :cond_4

    .line 100
    .line 101
    if-eqz v1, :cond_1

    .line 102
    .line 103
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 104
    .line 105
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 106
    .line 107
    .line 108
    filled-new-array {v0, v1}, [Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    .line 116
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getHasNoSideness()Z

    .line 120
    move-result v1

    .line 121
    .line 122
    if-eqz v1, :cond_2

    .line 123
    .line 124
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 125
    .line 126
    .line 127
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    .line 131
    :cond_2
    if-eqz v2, :cond_3

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 139
    move-result-object v0

    .line 140
    return-object v0

    .line 141
    .line 142
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    .line 149
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 150
    .line 151
    .line 152
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 153
    throw v0

    .line 154
    .line 155
    :cond_5
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 159
    move-result-object v0

    .line 160
    return-object v0

    .line 161
    .line 162
    :cond_6
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 163
    .line 164
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 165
    .line 166
    .line 167
    filled-new-array {v0, v1}, [Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 168
    move-result-object v0

    .line 169
    .line 170
    .line 171
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    new-instance v1, Ljava/util/ArrayList;

    .line 175
    .line 176
    .line 177
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    .line 184
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 185
    move-result v2

    .line 186
    .line 187
    if-eqz v2, :cond_a

    .line 188
    .line 189
    .line 190
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 191
    move-result-object v2

    .line 192
    move-object v4, v2

    .line 193
    .line 194
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 195
    .line 196
    if-eqz v3, :cond_7

    .line 197
    .line 198
    .line 199
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 200
    move-result v5

    .line 201
    .line 202
    if-eqz v5, :cond_7

    .line 203
    goto :goto_1

    .line 204
    .line 205
    .line 206
    :cond_7
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 207
    move-result-object v5

    .line 208
    .line 209
    .line 210
    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    move-result v6

    .line 212
    .line 213
    if-eqz v6, :cond_9

    .line 214
    .line 215
    .line 216
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    move-result-object v6

    .line 218
    .line 219
    check-cast v6, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 220
    .line 221
    iget-object v6, v6, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 222
    .line 223
    if-ne v6, v4, :cond_8

    .line 224
    goto :goto_0

    .line 225
    .line 226
    .line 227
    :cond_9
    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    goto :goto_0

    .line 229
    :cond_a
    return-object v1
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
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
.end method

.method public final g()V
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 26
    .line 27
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/model/common/T;->b:Ljava/io/File;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 44
    move-result v0

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    const-string v3, "deleting "

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v0, " files"

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    sget-object v2, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 69
    .line 70
    iget-object v2, v2, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 71
    .line 72
    const-string v3, "DocCapture"

    .line 73
    const/4 v4, 0x0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v3, v0, v4}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    sget-object v5, Lkotlinx/coroutines/q1;->b:Lkotlinx/coroutines/q1;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 82
    move-result-object v6

    .line 83
    .line 84
    new-instance v8, Lcom/sumsub/sns/internal/features/presentation/utils/H;

    .line 85
    .line 86
    .line 87
    invoke-direct {v8, v1, p0, v4}, Lcom/sumsub/sns/internal/features/presentation/utils/H;-><init>(Ljava/util/ArrayList;Lcom/sumsub/sns/internal/features/presentation/utils/M;Lkotlin/coroutines/Continuation;)V

    .line 88
    const/4 v9, 0x2

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v7, 0x0

    .line 91
    .line 92
    .line 93
    invoke-static/range {v5 .. v10}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 94
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
.end method

.method public final h()Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 30
    .line 31
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/T;->j:Ljava/lang/Boolean;

    .line 32
    .line 33
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Proceed:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 42
    return-object v0

    .line 43
    .line 44
    .line 45
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    goto :goto_1

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    move-result v1

    .line 64
    .line 65
    if-eqz v1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 72
    .line 73
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 74
    .line 75
    sget-object v2, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 76
    .line 77
    if-ne v1, v2, :cond_4

    .line 78
    .line 79
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Proceed:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 80
    return-object v0

    .line 81
    .line 82
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 83
    .line 84
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->d:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 85
    .line 86
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 87
    const/4 v2, 0x1

    .line 88
    .line 89
    aget-object v1, v1, v2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a()Ljava/lang/Object;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    check-cast v0, Lcom/sumsub/sns/internal/features/domain/documents/DocumentSideness;

    .line 96
    .line 97
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/utils/l;->a:[I

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 101
    move-result v0

    .line 102
    .line 103
    aget v0, v1, v0

    .line 104
    .line 105
    if-eq v0, v2, :cond_8

    .line 106
    const/4 v1, 0x2

    .line 107
    .line 108
    if-eq v0, v1, :cond_7

    .line 109
    const/4 v1, 0x3

    .line 110
    .line 111
    if-ne v0, v1, :cond_6

    .line 112
    .line 113
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Prompt:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 114
    return-object v0

    .line 115
    .line 116
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 117
    .line 118
    .line 119
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 120
    throw v0

    .line 121
    .line 122
    :cond_7
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->Proceed:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 123
    return-object v0

    .line 124
    .line 125
    :cond_8
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;->RequestBackSide:Lcom/sumsub/sns/internal/features/presentation/utils/SecondSideStep;

    .line 126
    return-object v0
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
.end method

.method public final i()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/utils/M;->c()Ljava/util/List;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    move-result v3

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v3

    .line 21
    .line 22
    .line 23
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v4

    .line 25
    .line 26
    if-eqz v4, :cond_6

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v4

    .line 31
    .line 32
    check-cast v4, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 33
    .line 34
    iget-object v4, v4, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 35
    .line 36
    sget-object v5, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    move-result v3

    .line 45
    .line 46
    if-eqz v3, :cond_2

    .line 47
    goto :goto_0

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v3

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v3

    .line 62
    .line 63
    check-cast v3, Lcom/sumsub/sns/internal/features/data/model/common/T;

    .line 64
    .line 65
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/data/model/common/T;->e:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 66
    .line 67
    sget-object v4, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 68
    .line 69
    if-ne v3, v4, :cond_3

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_4
    :goto_0
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Back:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    if-ne v1, v3, :cond_5

    .line 79
    goto :goto_2

    .line 80
    .line 81
    :cond_5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 82
    .line 83
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 84
    .line 85
    aget-object v2, v3, v2

    .line 86
    .line 87
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 88
    .line 89
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    goto :goto_3

    .line 94
    .line 95
    :cond_6
    :goto_1
    sget-object v1, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->Front:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 99
    move-result-object v3

    .line 100
    .line 101
    if-ne v1, v3, :cond_7

    .line 102
    :goto_2
    return-void

    .line 103
    .line 104
    :cond_7
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/utils/m;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 105
    .line 106
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/utils/m;->e:[Lkotlin/reflect/KProperty;

    .line 107
    .line 108
    aget-object v2, v3, v2

    .line 109
    .line 110
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 116
    .line 117
    :goto_3
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/e;->a:Lcom/sumsub/sns/internal/features/data/repository/analytics/a;

    .line 118
    .line 119
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;->IdDocSubType:Lcom/sumsub/sns/internal/core/analytics/GlobalStatePayload;

    .line 120
    .line 121
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/utils/M;->l:Lcom/sumsub/sns/internal/features/presentation/utils/m;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/presentation/utils/m;->a()Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    .line 125
    move-result-object v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;->getValue()Ljava/lang/String;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/e;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    return-void
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
.end method
