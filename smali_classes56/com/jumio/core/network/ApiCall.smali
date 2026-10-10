.class public abstract Lcom/jumio/core/network/ApiCall;
.super Ljumio/core/a3;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljumio/core/a3;",
        "Ljava/util/concurrent/Callable<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008&\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u00022\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00032\u00020\u0004:\u0001BB\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0014J\n\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0015\u0010*\u001a\u00028\u00002\u0006\u0010+\u001a\u00020\u0015H\'\u00a2\u0006\u0002\u0010,J\u0008\u0010-\u001a\u00020%H\'J\u0010\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u000200H$J\r\u00101\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u00102J\u0014\u00103\u001a\u00020\u00122\n\u00104\u001a\u000605j\u0002`6H\u0014J\u0018\u00107\u001a\u000605j\u0002`62\n\u00104\u001a\u000605j\u0002`6H\u0002J-\u00108\u001a\u00028\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u0015H\u0002\u00a2\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0015H\u0004J\u000f\u0010@\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u00102J\u0008\u0010A\u001a\u00020\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0015\u0010\u0007\u001a\u0006\u0012\u0002\u0008\u00030\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0015X\u0084\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u0015X\u0094D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0017R \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u001fX\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u0006C"
    }
    d2 = {
        "Lcom/jumio/core/network/ApiCall;",
        "T",
        "Lcom/jumio/core/model/Publisher;",
        "Ljava/util/concurrent/Callable;",
        "Lcom/jumio/core/network/MonitorableCall;",
        "apiCallSettings",
        "Lcom/jumio/core/network/ApiCallSettings;",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "<init>",
        "(Lcom/jumio/core/network/ApiCallSettings;Lcom/jumio/core/models/ApiCallDataModel;)V",
        "getApiCallSettings",
        "()Lcom/jumio/core/network/ApiCallSettings;",
        "getApiCallDataModel",
        "()Lcom/jumio/core/models/ApiCallDataModel;",
        "locale",
        "Ljava/util/Locale;",
        "isDeviceOffline",
        "",
        "()Z",
        "uri",
        "",
        "getUri",
        "()Ljava/lang/String;",
        "TAG",
        "getTAG$annotations",
        "()V",
        "getTAG",
        "method",
        "getMethod",
        "headers",
        "",
        "getHeaders",
        "()Ljava/util/Map;",
        "responseReceived",
        "",
        "status",
        "",
        "time",
        "",
        "additionalAnalyticsDetails",
        "Lcom/jumio/analytics/MetaInfo;",
        "parseResponse",
        "plainTextAnswer",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "prepareRequest",
        "fillRequest",
        "outputStream",
        "Ljava/io/OutputStream;",
        "execute",
        "()Ljava/lang/Object;",
        "checkSilentRetry",
        "e",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "mapException",
        "handleHttpResponse",
        "connection",
        "Ljava/net/HttpURLConnection;",
        "httpStatus",
        "roundTripTime",
        "(Ljava/net/HttpURLConnection;IJLjava/lang/String;)Ljava/lang/Object;",
        "createClient",
        "useUrl",
        "call",
        "getCallId",
        "FireForgetRunnable",
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
        "SMAP\nApiCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiCall.kt\ncom/jumio/core/network/ApiCall\n+ 2 Log.kt\ncom/jumio/commons/log/Log\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,353:1\n34#2:354\n560#3:355\n545#3,6:356\n216#4,2:362\n*S KotlinDebug\n*F\n+ 1 ApiCall.kt\ncom/jumio/core/network/ApiCall\n*L\n133#1:354\n282#1:355\n282#1:356,6\n282#1:362,2\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Ljumio/core/f;

.field public final d:Lcom/jumio/core/models/ApiCallDataModel;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/Map;


# direct methods
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

    .line 1
    .line 2
    const-string v0, "apiCallSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "apiCallDataModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljumio/core/f;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v0}, Ljumio/core/a3;-><init>(Lcom/jumio/core/scope/ScopeProviderInterface;)V

    .line 18
    .line 19
    iput-object p1, p0, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    .line 22
    .line 23
    sget-object p2, Lcom/jumio/core/util/LocaleUtil;->INSTANCE:Lcom/jumio/core/util/LocaleUtil;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljumio/core/f;->getContext()Landroid/content/Context;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p2, v0}, Lcom/jumio/core/util/LocaleUtil;->getLocale(Landroid/content/Context;)Ljava/util/Locale;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    if-nez p2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    const-string v0, "getDefault(...)"

    .line 40
    .line 41
    .line 42
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    const-string v1, "Network/"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    iput-object v0, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 59
    .line 60
    const-string v0, "POST"

    .line 61
    .line 62
    iput-object v0, p0, Lcom/jumio/core/network/ApiCall;->f:Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    invoke-interface {p1}, Ljumio/core/f;->getUserAgent()Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    const-string v0, "User-Agent"

    .line 69
    .line 70
    .line 71
    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    .line 75
    invoke-static {p2}, Lcom/jumio/core/util/LocaleUtilKt;->getBcp47(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    move-result-object p2

    .line 77
    .line 78
    const-string v0, "Accept-Language"

    .line 79
    .line 80
    .line 81
    invoke-static {v0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    move-result-object p2

    .line 83
    .line 84
    const-string v0, "Content-Encoding"

    .line 85
    .line 86
    const-string v1, "identity"

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    const-string v2, "Accept-Encoding"

    .line 93
    .line 94
    .line 95
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    const-string v2, "Accept"

    .line 99
    .line 100
    const-string v3, "application/json"

    .line 101
    .line 102
    .line 103
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    filled-new-array {p1, p2, v0, v1, v2}, [Lkotlin/Pair;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 112
    move-result-object p1

    .line 113
    .line 114
    iput-object p1, p0, Lcom/jumio/core/network/ApiCall;->g:Ljava/util/Map;

    .line 115
    return-void
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

.method public static final a()Lcom/jumio/core/interfaces/ConnectionInterface;
    .locals 1

    .line 1
    new-instance v0, Lcom/jumio/core/util/ConnectionChecker;

    invoke-direct {v0}, Lcom/jumio/core/util/ConnectionChecker;-><init>()V

    return-object v0
.end method

.method public static synthetic getTAG$annotations()V
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
.end method


# virtual methods
.method public final a(Ljava/net/HttpURLConnection;IJLjava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 2
    sget-object v0, Lcom/jumio/commons/log/LogUtils;->INSTANCE:Lcom/jumio/commons/log/LogUtils;

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getSimpleName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move v2, p2

    move-wide v3, p3

    move-object v5, p5

    .line 4
    invoke-virtual/range {v0 .. v5}, Lcom/jumio/commons/log/LogUtils;->logServerResponse(Ljava/lang/String;IJLjava/lang/String;)V

    const/16 p2, 0xc8

    if-ne v2, p2, :cond_0

    .line 5
    iget-object p1, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    const-string p2, "parsing response"

    invoke-static {p1, p2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Response: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0, v5}, Lcom/jumio/core/network/ApiCall;->parseResponse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object p1

    .line 9
    :try_start_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 10
    const-string p3, "message"

    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object p2, v0

    .line 11
    invoke-static {p2}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 12
    :goto_0
    new-instance p2, Ljumio/core/T3;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p2, v2, p1}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    throw p2
.end method

.method public additionalAnalyticsDetails()Lcom/jumio/analytics/MetaInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public final b()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/core/ServiceLocator;->INSTANCE:Lcom/jumio/core/ServiceLocator;

    .line 3
    .line 4
    new-instance v1, Lt9/b;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lt9/b;-><init>()V

    .line 8
    .line 9
    const-class v2, Lcom/jumio/core/interfaces/ConnectionInterface;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v2, v1}, Lcom/jumio/core/ServiceLocator;->getServiceImplementation(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/jumio/core/interfaces/ConnectionInterface;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Ljumio/core/f;->getContext()Landroid/content/Context;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1}, Lcom/jumio/core/interfaces/ConnectionInterface;->isConnected(Landroid/content/Context;)Z

    .line 25
    move-result v0

    .line 26
    .line 27
    xor-int/lit8 v0, v0, 0x1

    .line 28
    return v0
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
.end method

.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "-> call()"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->b()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 16
    .line 17
    const-string v1, "execute()"

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    :try_start_1
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->execute()Ljava/lang/Object;

    .line 24
    move-result-object v0
    :try_end_1
    .catch Ljumio/core/b; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :catch_1
    move-exception v0

    .line 29
    .line 30
    :try_start_2
    iget-object v1, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 31
    .line 32
    const-string v2, "### ALE key update required. Re-execute call"

    .line 33
    .line 34
    .line 35
    invoke-static {v1, v2, v0}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->execute()Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p0, v0}, Ljumio/core/a3;->publishResult(Ljava/lang/Object;)V

    .line 43
    .line 44
    iget-object v1, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 45
    .line 46
    const-string v2, "<- call(success)"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v2}, Lcom/jumio/commons/log/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    goto :goto_4

    .line 51
    .line 52
    :cond_0
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 53
    .line 54
    const-string v1, "Device is offline"

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    new-instance v0, Ljumio/core/T0;

    .line 60
    .line 61
    .line 62
    invoke-direct {v0}, Ljumio/core/T0;-><init>()V

    .line 63
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 64
    .line 65
    :goto_1
    instance-of v1, v0, Ljava/net/SocketTimeoutException;

    .line 66
    .line 67
    if-eqz v1, :cond_1

    .line 68
    .line 69
    const-string v1, "<- call(failed timeout)"

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :cond_1
    instance-of v1, v0, Ljumio/core/A2;

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    const-string v1, "<- call(failed network)"

    .line 77
    goto :goto_2

    .line 78
    .line 79
    :cond_2
    const-string v1, "<- call(failed general error)"

    .line 80
    .line 81
    :goto_2
    iget-object v2, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    invoke-static {v2, v1, v0}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    iget-object v1, p0, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/jumio/core/models/ApiCallDataModel;->getIgnoreErrors()Z

    .line 90
    move-result v1

    .line 91
    const/4 v2, 0x0

    .line 92
    .line 93
    if-eqz v1, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v2}, Ljumio/core/a3;->publishResult(Ljava/lang/Object;)V

    .line 97
    goto :goto_3

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0, v0}, Ljumio/core/a3;->publishError(Ljava/lang/Throwable;)V

    .line 101
    :goto_3
    move-object v0, v2

    .line 102
    :goto_4
    return-object v0
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
.end method

.method public checkSilentRetry(Ljava/lang/Exception;)Z
    .locals 1
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
    const/4 p1, 0x0

    .line 7
    return p1
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

.method public final createClient(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/KeyManagementException;,
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/KeyStoreException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    const-string v2, "useUrl"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v2, Ljava/net/URL;

    .line 10
    .line 11
    .line 12
    invoke-direct {v2, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    const-string v3, "https"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->instrument(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Ljava/net/URLConnection;

    .line 35
    .line 36
    const-string v2, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    check-cast p1, Ljavax/net/ssl/HttpsURLConnection;

    .line 42
    .line 43
    new-instance v2, Ljumio/core/S3;

    .line 44
    .line 45
    iget-object v3, p0, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    .line 46
    .line 47
    .line 48
    invoke-interface {v3}, Ljumio/core/f;->getTrustManager()Lcom/jumio/core/network/TrustManagerInterface;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    new-array v4, v1, [Ljavax/net/ssl/TrustManager;

    .line 52
    .line 53
    aput-object v3, v4, v0

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v4}, Ljumio/core/S3;-><init>([Ljavax/net/ssl/TrustManager;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v2}, Ljavax/net/ssl/HttpsURLConnection;->setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getMethod()Ljava/lang/String;

    .line 63
    move-result-object v2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getMethod()Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    const-string v2, "GET"

    .line 79
    .line 80
    .line 81
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    move-result v0

    .line 83
    xor-int/2addr v0, v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->getHeaders()Ljava/util/Map;

    .line 90
    move-result-object v0

    .line 91
    .line 92
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    .line 95
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    .line 102
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 103
    move-result-object v0

    .line 104
    .line 105
    .line 106
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 107
    move-result v2

    .line 108
    .line 109
    const-string v3, "Content-Type"

    .line 110
    .line 111
    if-eqz v2, :cond_1

    .line 112
    .line 113
    .line 114
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    move-result-object v2

    .line 116
    .line 117
    check-cast v2, Ljava/util/Map$Entry;

    .line 118
    .line 119
    .line 120
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    move-result v3

    .line 126
    .line 127
    if-nez v3, :cond_0

    .line 128
    .line 129
    .line 130
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 131
    move-result-object v3

    .line 132
    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 135
    move-result-object v2

    .line 136
    .line 137
    .line 138
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    goto :goto_0

    .line 140
    .line 141
    .line 142
    :cond_1
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 143
    move-result-object v0

    .line 144
    .line 145
    .line 146
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    move-result v1

    .line 152
    .line 153
    if-eqz v1, :cond_2

    .line 154
    .line 155
    .line 156
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    move-result-object v1

    .line 158
    .line 159
    check-cast v1, Ljava/util/Map$Entry;

    .line 160
    .line 161
    .line 162
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 163
    move-result-object v2

    .line 164
    .line 165
    check-cast v2, Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 169
    move-result-object v1

    .line 170
    .line 171
    check-cast v1, Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1, v2, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    goto :goto_1

    .line 176
    .line 177
    :cond_2
    const-string v0, "application/ale"

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v3, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0}, Lcom/jumio/core/models/ApiCallDataModel;->getTimeout()I

    .line 186
    move-result v0

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 190
    .line 191
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Lcom/jumio/core/models/ApiCallDataModel;->getTimeout()I

    .line 195
    move-result v0

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 199
    return-object p1

    .line 200
    .line 201
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    .line 202
    .line 203
    const-string v0, "Only https ApiCalls are supported!"

    .line 204
    .line 205
    .line 206
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 207
    throw p1
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
.end method

.method public final execute()Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/SocketTimeoutException;,
            Ljumio/core/A2;,
            Ljumio/core/T3;,
            Ljavax/net/ssl/SSLException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    move-object/from16 v1, p0

    .line 1
    const-string v0, "format(...)"

    const-string v2, "Sending request "

    .line 2
    invoke-virtual {v1}, Lcom/jumio/core/network/ApiCall;->getCallId()Ljava/lang/String;

    const/4 v3, 0x0

    .line 3
    :try_start_0
    iget-object v4, v1, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    invoke-interface {v4}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v4

    const-class v5, Lcom/jumio/core/models/BackendModel;

    invoke-virtual {v4, v5}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/models/BackendModel;

    .line 4
    iget-object v5, v1, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    invoke-interface {v5}, Ljumio/core/f;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v5

    const-class v6, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v5, v6}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v5

    check-cast v5, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v5}, Lcom/jumio/core/models/SettingsModel;->getThrottlingLimit()I

    move-result v5

    .line 5
    iget-object v6, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v6}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lcom/jumio/core/models/BackendModel;->checkAndIncreaseCounter(Ljava/lang/Class;I)Z

    move-result v4

    if-nez v4, :cond_c

    .line 6
    invoke-virtual {v1}, Lcom/jumio/core/network/ApiCall;->prepareRequest()I

    move-result v4

    .line 7
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v1, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    invoke-interface {v6}, Ljumio/core/f;->getHost()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/jumio/core/network/ApiCall;->getUri()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/jumio/core/network/ApiCall;->createClient(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 8
    :try_start_1
    invoke-virtual {v5}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v6

    invoke-virtual {v6}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "toString(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v7, v1, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with length "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    sget-object v2, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 11
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    .line 12
    iget-object v2, v1, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

    invoke-interface {v2}, Ljumio/core/f;->getEncryptionProvider()Lcom/jumio/core/network/EncryptionProvider;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    if-nez v2, :cond_1

    .line 13
    :try_start_2
    new-instance v8, Lcom/jumio/core/error/Error;

    sget-object v9, Lcom/jumio/core/enums/ErrorCase;->OCR_LOADING_FAILED:Lcom/jumio/core/enums/ErrorCase;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/jumio/core/error/Error;-><init>(Lcom/jumio/core/enums/ErrorCase;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v8}, Ljumio/core/a3;->publishError(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 14
    iget-object v0, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v0

    if-nez v0, :cond_0

    .line 15
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_0
    return-object v3

    :catchall_0
    move-exception v0

    move-object v3, v5

    goto/16 :goto_b

    :catch_0
    move-exception v0

    move-object v3, v5

    goto/16 :goto_8

    :cond_1
    const-wide v8, 0x412e848000000000L    # 1000000.0

    const/4 v10, 0x0

    .line 16
    :try_start_3
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v11

    const-string v12, "GET"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    .line 17
    invoke-virtual {v5}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v11

    const-string v12, "getOutputStream(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1}, Lcom/jumio/core/network/ApiCall;->getHeaders()Ljava/util/Map;

    move-result-object v12

    const-string v13, "Content-Type"

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_2

    const-string v12, "application/json"

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v2, v5

    move-wide/from16 v16, v8

    goto/16 :goto_7

    .line 19
    :cond_2
    :goto_0
    invoke-interface {v2, v11, v4, v12}, Lcom/jumio/core/network/EncryptionProvider;->createRequest(Ljava/io/OutputStream;ILjava/lang/String;)Ljava/io/OutputStream;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 20
    :try_start_4
    invoke-virtual {v1, v4}, Lcom/jumio/core/network/ApiCall;->fillRequest(Ljava/io/OutputStream;)V

    .line 21
    invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V

    .line 22
    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 23
    :try_start_5
    invoke-static {v4, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v2, v0

    .line 24
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    :try_start_7
    invoke-static {v4, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 25
    :cond_3
    :goto_1
    iget-object v3, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 26
    new-instance v0, Ljava/lang/Thread;

    new-instance v3, Ljumio/core/d;

    invoke-direct {v3, v5, v2}, Ljumio/core/d;-><init>(Ljava/net/HttpURLConnection;Lcom/jumio/core/network/EncryptionProvider;)V

    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 27
    iget-object v0, v1, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    const-string v2, "Started fire&forget call - return with empty response"

    invoke-static {v0, v2}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    const-string v0, ""

    invoke-virtual {v1, v0}, Lcom/jumio/core/network/ApiCall;->parseResponse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 29
    :try_start_8
    iget-object v2, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v2}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v2

    if-nez v2, :cond_4

    .line 30
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    sub-long/2addr v2, v6

    long-to-double v2, v2

    div-double/2addr v2, v8

    double-to-long v2, v2

    .line 31
    invoke-virtual {v1, v10, v2, v3}, Lcom/jumio/core/network/ApiCall;->responseReceived(IJ)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 32
    :cond_4
    iget-object v2, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v2}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v2

    if-nez v2, :cond_5

    .line 33
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_5
    return-object v0

    .line 34
    :cond_6
    :try_start_9
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v3
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 35
    :try_start_a
    iget-object v4, v1, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 36
    sget-object v10, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v11, "Response was %d, %s"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    move-result-object v13

    filled-new-array {v12, v13}, [Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x2

    invoke-static {v12, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10, v11, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-static {v4, v11}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    iget-object v4, v1, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

    .line 39
    const-string v11, "Received response for %s in %d ms"

    .line 40
    invoke-virtual {v5}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v12

    invoke-virtual {v12}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v12
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    const-wide/16 v14, 0x0

    move-wide/from16 v16, v8

    .line 41
    :try_start_b
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    filled-new-array {v12, v8}, [Ljava/lang/Object;

    move-result-object v8

    .line 42
    invoke-static {v8, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10, v11, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-static {v4, v8}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 44
    :try_start_c
    iget-object v0, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    if-nez v0, :cond_7

    .line 45
    :try_start_d
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long/2addr v8, v6

    long-to-double v6, v8

    div-double v6, v6, v16

    double-to-long v14, v6

    .line 46
    invoke-virtual {v1, v3, v14, v15}, Lcom/jumio/core/network/ApiCall;->responseReceived(IJ)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :cond_7
    const/16 v0, 0xc8

    if-ne v3, v0, :cond_8

    .line 47
    :try_start_e
    invoke-virtual {v5}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_e
    .catch Ljumio/core/T3; {:try_start_e .. :try_end_e} :catch_1
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object v2, v5

    goto :goto_5

    .line 48
    :cond_8
    :try_start_f
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    .line 49
    :goto_2
    invoke-interface {v2, v0}, Lcom/jumio/core/network/EncryptionProvider;->getResponse(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v6
    :try_end_f
    .catch Ljumio/core/T3; {:try_start_f .. :try_end_f} :catch_1
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    move-object v2, v5

    move-wide v4, v14

    .line 50
    :try_start_10
    invoke-virtual/range {v1 .. v6}, Lcom/jumio/core/network/ApiCall;->a(Ljava/net/HttpURLConnection;IJLjava/lang/String;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 51
    iget-object v3, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v3

    if-nez v3, :cond_9

    .line 52
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_9
    return-object v0

    :catchall_4
    move-exception v0

    :goto_3
    move-object v3, v2

    goto/16 :goto_b

    :catch_2
    move-exception v0

    :goto_4
    move-object v3, v2

    goto :goto_8

    :catchall_5
    move-exception v0

    move-object v2, v5

    goto :goto_3

    :catch_3
    move-exception v0

    move-object v2, v5

    goto :goto_4

    .line 53
    :goto_5
    :try_start_11
    iget v4, v0, Ljumio/core/T3;->a:I

    if-nez v4, :cond_a

    .line 54
    iput v3, v0, Ljumio/core/T3;->a:I

    .line 55
    :cond_a
    throw v0

    :catchall_6
    move-exception v0

    move-object v2, v5

    :goto_6
    move v10, v3

    goto :goto_7

    :catchall_7
    move-exception v0

    move-object v2, v5

    move-wide/from16 v16, v8

    goto :goto_6

    .line 56
    :goto_7
    iget-object v3, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v3

    if-nez v3, :cond_b

    .line 57
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long/2addr v3, v6

    long-to-double v3, v3

    div-double v3, v3, v16

    double-to-long v3, v3

    .line 58
    invoke-virtual {v1, v10, v3, v4}, Lcom/jumio/core/network/ApiCall;->responseReceived(IJ)V

    .line 59
    :cond_b
    throw v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_2
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    :catchall_8
    move-exception v0

    goto :goto_b

    :catch_4
    move-exception v0

    goto :goto_8

    .line 60
    :cond_c
    :try_start_12
    new-instance v0, Ljumio/core/T3;

    const-string v2, "Throttling limit reached"

    const/16 v4, 0x1ad

    invoke-direct {v0, v4, v2}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    throw v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    .line 61
    :goto_8
    :try_start_13
    invoke-virtual {v1, v0}, Lcom/jumio/core/network/ApiCall;->checkSilentRetry(Ljava/lang/Exception;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 62
    invoke-virtual {v1}, Lcom/jumio/core/network/ApiCall;->execute()Ljava/lang/Object;

    move-result-object v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 63
    iget-object v2, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v2}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v2

    if-nez v2, :cond_d

    if-eqz v3, :cond_d

    .line 64
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_d
    return-object v0

    .line 65
    :cond_e
    :try_start_14
    invoke-static {v0}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 66
    instance-of v2, v0, Ljava/net/SocketTimeoutException;

    if-nez v2, :cond_10

    .line 67
    instance-of v2, v0, Ljumio/core/b;

    if-nez v2, :cond_10

    .line 68
    instance-of v2, v0, Ljumio/core/T3;

    if-nez v2, :cond_10

    .line 69
    instance-of v2, v0, Ljavax/net/ssl/SSLException;

    if-nez v2, :cond_10

    .line 70
    instance-of v2, v0, Ljava/net/ConnectException;

    if-eqz v2, :cond_f

    new-instance v2, Ljumio/core/T3;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const/16 v4, 0x384

    invoke-direct {v2, v4, v0}, Ljumio/core/T3;-><init>(ILjava/lang/String;)V

    :goto_9
    move-object v0, v2

    goto :goto_a

    .line 71
    :cond_f
    new-instance v2, Ljumio/core/A2;

    invoke-direct {v2, v0}, Ljumio/core/A2;-><init>(Ljava/lang/Exception;)V

    goto :goto_9

    .line 72
    :cond_10
    :goto_a
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    .line 73
    :goto_b
    iget-object v2, v1, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

    invoke-virtual {v2}, Lcom/jumio/core/models/ApiCallDataModel;->getFireAndForget()Z

    move-result v2

    if-nez v2, :cond_11

    if-eqz v3, :cond_11

    .line 74
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 75
    :cond_11
    throw v0
.end method

.method public abstract fillRequest(Ljava/io/OutputStream;)V
    .param p1    # Ljava/io/OutputStream;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final getApiCallDataModel()Lcom/jumio/core/models/ApiCallDataModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->d:Lcom/jumio/core/models/ApiCallDataModel;

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
.end method

.method public final getApiCallSettings()Ljumio/core/f;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->c:Ljumio/core/f;

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
.end method

.method public getCallId()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "getSimpleName(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    return-object v0
    .line 15
    .line 16
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->g:Ljava/util/Map;

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
.end method

.method public getMethod()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->f:Ljava/lang/String;

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
.end method

.method public final getTAG()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/ApiCall;->e:Ljava/lang/String;

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
.end method

.method public abstract getUri()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract parseResponse(Ljava/lang/String;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
        otherwise = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract prepareRequest()I
    .annotation build Landroidx/annotation/VisibleForTesting;
        otherwise = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation
.end method

.method public responseReceived(IJ)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 3
    .line 4
    sget-object v1, Lcom/jumio/core/api/BackendManager;->Companion:Lcom/jumio/core/api/BackendManager$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/jumio/core/api/BackendManager$Companion;->requestCode$jumio_core_release(Ljava/lang/Class;)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/jumio/core/network/ApiCall;->additionalAnalyticsDetails()Lcom/jumio/analytics/MetaInfo;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-static {v1, p1, p2, p3, v2}, Lcom/jumio/analytics/MobileEvents;->networkRequest(IIJLcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 24
    return-void
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
.end method
