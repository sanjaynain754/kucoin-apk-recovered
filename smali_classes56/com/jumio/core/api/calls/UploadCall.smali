.class public final Lcom/jumio/core/api/calls/UploadCall;
.super Ljumio/core/z2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/api/calls/UploadCall$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljumio/core/z2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 #2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nB\u001d\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0006\u00a2\u0006\u0004\u0008\t\u0010\u000bJ\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\u0008\u0010\u001a\u001a\u00020\u001bH\u0014J\u0014\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u001fj\u0002` H\u0014J\u0008\u0010!\u001a\u00020\"H\u0014R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f`\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0015\u00a8\u0006$"
    }
    d2 = {
        "Lcom/jumio/core/api/calls/UploadCall;",
        "Lcom/jumio/core/network/MultipartApiCall;",
        "Lorg/json/JSONObject;",
        "apiCallSettings",
        "Lcom/jumio/core/network/ApiCallSettings;",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "uploadProcessor",
        "Lcom/jumio/core/api/calls/upload/UploadProcessorInterface;",
        "<init>",
        "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;Lcom/jumio/core/api/calls/upload/UploadProcessorInterface;)V",
        "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V",
        "data",
        "Ljava/util/LinkedHashMap;",
        "",
        "",
        "Lkotlin/collections/LinkedHashMap;",
        "getData",
        "()Ljava/util/LinkedHashMap;",
        "credentialId",
        "getCredentialId",
        "()Ljava/lang/String;",
        "uri",
        "getUri",
        "parseResponse",
        "plainTextAnswer",
        "prepareData",
        "",
        "checkSilentRetry",
        "",
        "e",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "additionalAnalyticsDetails",
        "Lcom/jumio/analytics/MetaInfo;",
        "Companion",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUploadCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadCall.kt\ncom/jumio/core/api/calls/UploadCall\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/jumio/core/api/calls/UploadCall$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DATA_CREDENTIAL_ID:Ljava/lang/String; = "DATA_CREDENTIAL_ID"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final DATA_PARTS:Ljava/lang/String; = "DATA_PARTS"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final m:Ljumio/core/X3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/api/calls/UploadCall$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/api/calls/UploadCall$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/jumio/core/api/calls/UploadCall;->Companion:Lcom/jumio/core/api/calls/UploadCall$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;)V
    .locals 4
    .param p1    # Ljumio/core/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljumio/core/f;",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "apiCallSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiCallDataModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljumio/core/Q0;

    invoke-interface {p1}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v1

    invoke-interface {p1}, Ljumio/core/f;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type com.jumio.core.persistence.DataAccessEncryption"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljumio/core/I0;

    invoke-direct {v0, v1, v2}, Ljumio/core/Q0;-><init>(Lcom/jumio/core/persistence/DataManager;Ljumio/core/I0;)V

    .line 15
    invoke-direct {p0, p1, p2, v0}, Lcom/jumio/core/api/calls/UploadCall;-><init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;Ljumio/core/X3;)V

    return-void
.end method

.method public constructor <init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;Ljumio/core/X3;)V
    .locals 1
    .param p1    # Ljumio/core/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljumio/core/X3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljumio/core/f;",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;",
            "Ljumio/core/X3;",
            ")V"
        }
    .end annotation

    const-string v0, "apiCallSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiCallDataModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uploadProcessor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, p1, p2}, Ljumio/core/z2;-><init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;)V

    .line 7
    iput-object p3, p0, Lcom/jumio/core/api/calls/UploadCall;->m:Ljumio/core/X3;

    .line 8
    invoke-virtual {p2}, Lcom/jumio/core/models/ApiCallDataModel;->getData()Ljava/util/HashMap;

    move-result-object p1

    const-string v0, "DATA_CREDENTIAL_ID"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    invoke-virtual {p2}, Lcom/jumio/core/models/ApiCallDataModel;->getData()Ljava/util/HashMap;

    move-result-object p1

    const-string p2, "DATA_PARTS"

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    new-instance p1, Ljumio/core/U3;

    invoke-direct {p1, p0}, Ljumio/core/U3;-><init>(Lcom/jumio/core/api/calls/UploadCall;)V

    check-cast p3, Ljumio/core/Q0;

    .line 11
    iput-object p1, p3, Ljumio/core/Q0;->g:Ljumio/core/U3;

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Upload Parts are missing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Credential ID is missing"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;Ljumio/core/X3;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    new-instance p3, Ljumio/core/Q0;

    .line 2
    invoke-interface {p1}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object p4

    .line 3
    invoke-interface {p1}, Ljumio/core/f;->getContext()Landroid/content/Context;

    move-result-object p5

    const-string v0, "null cannot be cast to non-null type com.jumio.core.persistence.DataAccessEncryption"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p5, Ljumio/core/I0;

    .line 4
    invoke-direct {p3, p4, p5}, Ljumio/core/Q0;-><init>(Lcom/jumio/core/persistence/DataManager;Ljumio/core/I0;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/jumio/core/api/calls/UploadCall;-><init>(Ljumio/core/f;Lcom/jumio/core/models/ApiCallDataModel;Ljumio/core/X3;)V

    return-void
.end method

.method public static final synthetic access$addPart(Lcom/jumio/core/api/calls/UploadCall;[Ljava/lang/String;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ljumio/core/z2;->addPart([Ljava/lang/String;Ljava/lang/Object;I)V

    .line 4
    return-void
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
.end method


# virtual methods
.method public additionalAnalyticsDetails()Lcom/jumio/analytics/MetaInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/api/calls/UploadCall;->m:Ljumio/core/X3;

    .line 3
    .line 4
    check-cast v0, Ljumio/core/Q0;

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/core/Q0;->f:Lcom/jumio/analytics/MetaInfo;

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public checkSilentRetry(Ljava/lang/Exception;)Z
    .locals 2
    .param p1    # Ljava/lang/Exception;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "e"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/jumio/core/api/calls/UploadCall;->m:Ljumio/core/X3;

    .line 12
    .line 13
    check-cast p1, Ljumio/core/Q0;

    .line 14
    .line 15
    iget-boolean p1, p1, Ljumio/core/Q0;->e:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallSettings()Ljumio/core/f;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    const-class v1, Lcom/jumio/core/models/TimeoutModel;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Lcom/jumio/core/models/TimeoutModel;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/jumio/core/models/TimeoutModel;->getUpload()I

    .line 41
    move-result v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/ApiCallDataModel;->setTimeout(I)V

    .line 45
    .line 46
    const-class v0, Lcom/jumio/core/models/UploadSettingsModel;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    check-cast p1, Lcom/jumio/core/models/UploadSettingsModel;

    .line 53
    .line 54
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/jumio/core/models/UploadSettingsModel;->setUploadImageResolution(Lcom/jumio/core/enums/UploadResolution;)V

    .line 58
    const/4 p1, 0x1

    .line 59
    return p1

    .line 60
    :cond_0
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
.end method

.method public getUri()Ljava/lang/String;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget-object v1, Ljumio/core/e;->a:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    new-array v1, v1, [B

    .line 15
    .line 16
    .line 17
    fill-array-data v1, :array_0

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const-wide v2, 0x6e62969a664103fdL    # 5.375344657063935E223

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2, v3}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/jumio/core/models/ApiCallDataModel;->getData()Ljava/util/HashMap;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    const-string v2, "DATA_CREDENTIAL_ID"

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    const-string v2, "null cannot be cast to non-null type kotlin.String"

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    const/4 v1, 0x7

    .line 55
    .line 56
    new-array v1, v1, [B

    .line 57
    .line 58
    .line 59
    fill-array-data v1, :array_1

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    const-wide v2, 0x25d964780c7bafc6L    # 2.344480106758262E-126

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2, v3}, Lcom/jumio/commons/obfuscate/StringDeobfuscator;->deobfuscate([BJ)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object v0

    .line 76
    return-object v0

    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    :array_0
    .array-data 1
        0x69t
        0x2dt
        0x45t
        0x4ft
        0x1dt
        0x1at
        -0x13t
        0x4t
        -0x3et
        0x3et
        -0x12t
    .end array-data

    :array_1
    .array-data 1
        0x12t
        -0x41t
        0x7t
        -0xat
        0x54t
        -0x28t
        -0x67t
    .end array-data
.end method

.method public bridge synthetic parseResponse(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/jumio/core/api/calls/UploadCall;->parseResponse(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method public parseResponse(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "plainTextAnswer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallSettings()Ljumio/core/f;

    move-result-object v0

    invoke-interface {v0}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/ConsentModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/ConsentModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/ConsentModel;->addConsentOutcome()V

    .line 3
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getTAG()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Exception"

    invoke-static {v0, v1, p1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 5
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    return-object p1
.end method

.method public prepareData()V
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/api/calls/UploadCall;->m:Ljumio/core/X3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/jumio/core/models/ApiCallDataModel;->getData()Ljava/util/HashMap;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "DATA_PARTS"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "null cannot be cast to non-null type java.util.LinkedHashMap<kotlin.String, kotlin.Any>"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    check-cast v0, Ljumio/core/Q0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    const-string v2, "data"

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x0

    .line 47
    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    move-result-object v2

    .line 53
    .line 54
    check-cast v2, Ljava/util/Map$Entry;

    .line 55
    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    instance-of v5, v2, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 67
    .line 68
    if-eqz v5, :cond_0

    .line 69
    .line 70
    check-cast v2, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 71
    .line 72
    new-instance v5, Ljumio/core/O0;

    .line 73
    .line 74
    .line 75
    invoke-direct {v5, v0}, Ljumio/core/O0;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v4, v3, v5}, Ljumio/core/R0;->a(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V

    .line 79
    goto :goto_0

    .line 80
    .line 81
    :cond_0
    instance-of v3, v2, Lcom/jumio/core/models/LivenessScanPartModel;

    .line 82
    .line 83
    if-eqz v3, :cond_1

    .line 84
    .line 85
    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v4, v2}, Ljumio/core/Q0;->a(Ljava/lang/String;Lcom/jumio/core/models/ScanPartModel;)V

    .line 89
    goto :goto_0

    .line 90
    .line 91
    :cond_1
    instance-of v3, v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 92
    .line 93
    if-eqz v3, :cond_2

    .line 94
    .line 95
    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4, v2}, Ljumio/core/Q0;->a(Ljava/lang/String;Lcom/jumio/core/models/ScanPartModel;)V

    .line 99
    goto :goto_0

    .line 100
    .line 101
    :cond_2
    instance-of v3, v2, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 102
    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v4, v2}, Ljumio/core/Q0;->a(Ljava/lang/String;Lcom/jumio/core/models/ScanPartModel;)V

    .line 109
    goto :goto_0

    .line 110
    .line 111
    :cond_3
    instance-of v3, v2, Lcom/jumio/core/models/ScanPartModel;

    .line 112
    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    .line 116
    .line 117
    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 118
    .line 119
    new-instance v5, Ljumio/core/P0;

    .line 120
    .line 121
    .line 122
    invoke-direct {v5, v0}, Ljumio/core/P0;-><init>(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v2, v4, v3, v5}, Ljumio/core/R0;->a(Lcom/jumio/core/models/ScanPartModel;Ljava/lang/String;Lcom/jumio/core/enums/UploadResolution;Lkotlin/jvm/functions/Function2;)V

    .line 126
    goto :goto_0

    .line 127
    .line 128
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    const-string v4, "Given model is not yet supported for upload: "

    .line 131
    .line 132
    .line 133
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;)V

    .line 144
    goto :goto_0

    .line 145
    .line 146
    :cond_5
    iget-object v1, v0, Ljumio/core/Q0;->c:Lorg/json/JSONArray;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v1}, Ljumio/core/Q0;->a(Lorg/json/JSONArray;)V

    .line 150
    .line 151
    iget-object v1, v0, Ljumio/core/Q0;->c:Lorg/json/JSONArray;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 155
    move-result v2

    .line 156
    .line 157
    const-string v4, "toString(...)"

    .line 158
    .line 159
    const-string v5, "application/json; charset=UTF-8"

    .line 160
    .line 161
    if-nez v2, :cond_6

    .line 162
    goto :goto_1

    .line 163
    .line 164
    :cond_6
    new-instance v2, Lorg/json/JSONObject;

    .line 165
    .line 166
    .line 167
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 168
    .line 169
    const-string v6, "files"

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    move-result-object v1

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    .line 180
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 184
    move-result v2

    .line 185
    .line 186
    const-string v6, "uploadFilesMetadata"

    .line 187
    .line 188
    .line 189
    invoke-static {v6, v5, v2}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    .line 190
    move-result-object v2

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v2, v1, v3}, Ljumio/core/Q0;->a([Ljava/lang/String;Ljava/io/Serializable;I)V

    .line 194
    .line 195
    :goto_1
    iget-object v1, v0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    .line 199
    move-result v2

    .line 200
    .line 201
    if-nez v2, :cond_7

    .line 202
    goto :goto_2

    .line 203
    .line 204
    :cond_7
    new-instance v2, Lorg/json/JSONObject;

    .line 205
    .line 206
    .line 207
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 208
    .line 209
    const-string v6, "parts"

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v6, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 217
    move-result-object v1

    .line 218
    .line 219
    .line 220
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 224
    move-result v2

    .line 225
    .line 226
    const-string v4, "uploadDataPartsMetadata"

    .line 227
    .line 228
    .line 229
    invoke-static {v4, v5, v2}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    .line 230
    move-result-object v2

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v2, v1, v3}, Ljumio/core/Q0;->a([Ljava/lang/String;Ljava/io/Serializable;I)V

    .line 234
    .line 235
    .line 236
    :goto_2
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallSettings()Ljumio/core/f;

    .line 237
    move-result-object v0

    .line 238
    .line 239
    .line 240
    invoke-interface {v0}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 241
    move-result-object v0

    .line 242
    .line 243
    const-class v1, Lcom/jumio/core/models/ConsentModel;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 247
    move-result-object v0

    .line 248
    .line 249
    check-cast v0, Lcom/jumio/core/models/ConsentModel;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lcom/jumio/core/models/ConsentModel;->getConsentDataIfNeeded()Ljava/lang/String;

    .line 253
    move-result-object v8

    .line 254
    .line 255
    if-eqz v8, :cond_8

    .line 256
    .line 257
    const-string v0, "consents"

    .line 258
    .line 259
    .line 260
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 261
    move-result v1

    .line 262
    .line 263
    .line 264
    invoke-static {v0, v5, v1}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    .line 265
    move-result-object v7

    .line 266
    const/4 v10, 0x4

    .line 267
    const/4 v11, 0x0

    .line 268
    const/4 v9, 0x0

    .line 269
    move-object v6, p0

    .line 270
    .line 271
    .line 272
    invoke-static/range {v6 .. v11}, Ljumio/core/z2;->addPart$default(Ljumio/core/z2;[Ljava/lang/String;Ljava/lang/Object;IILjava/lang/Object;)V

    .line 273
    goto :goto_3

    .line 274
    :cond_8
    move-object v6, p0

    .line 275
    .line 276
    :goto_3
    iget-object v0, v6, Lcom/jumio/core/api/calls/UploadCall;->m:Ljumio/core/X3;

    .line 277
    .line 278
    check-cast v0, Ljumio/core/Q0;

    .line 279
    .line 280
    iget-boolean v0, v0, Ljumio/core/Q0;->e:Z

    .line 281
    .line 282
    if-eqz v0, :cond_9

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;

    .line 286
    move-result-object v0

    .line 287
    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getApiCallSettings()Ljumio/core/f;

    .line 290
    move-result-object v1

    .line 291
    .line 292
    .line 293
    invoke-interface {v1}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 294
    move-result-object v1

    .line 295
    .line 296
    const-class v2, Lcom/jumio/core/models/TimeoutModel;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 300
    move-result-object v1

    .line 301
    .line 302
    check-cast v1, Lcom/jumio/core/models/TimeoutModel;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v1}, Lcom/jumio/core/models/TimeoutModel;->getUploadHighResolution()I

    .line 306
    move-result v1

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/ApiCallDataModel;->setTimeout(I)V

    .line 310
    :cond_9
    return-void
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
.end method
