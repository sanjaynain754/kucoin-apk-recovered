.class public abstract Lcom/jumio/sdk/credentials/JumioCredential;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008&\u0018\u00002\u00020\u0001B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H&J\r\u0010#\u001a\u00020$H\u0010\u00a2\u0006\u0002\u0008%J\u0008\u0010&\u001a\u00020$H\u0016J\u0008\u0010\'\u001a\u00020$H\u0016J\u0015\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0015H\u0010\u00a2\u0006\u0002\u0008*J\u0015\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0015H\u0010\u00a2\u0006\u0002\u0008,J\u0015\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\rH\u0000\u00a2\u0006\u0002\u0008/J\r\u00100\u001a\u00020$H\u0000\u00a2\u0006\u0002\u00081J\u0019\u00102\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u000204H\u0000\u00a2\u0006\u0004\u00085\u00106J\u0008\u00107\u001a\u0004\u0018\u00010\u0015R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000eR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\rX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u000e\"\u0004\u0008\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u000e\u00a8\u00068"
    }
    d2 = {
        "Lcom/jumio/sdk/credentials/JumioCredential;",
        "",
        "controller",
        "Lcom/jumio/core/Controller;",
        "data",
        "Lcom/jumio/core/models/CredentialDataModel;",
        "<init>",
        "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialDataModel;)V",
        "getController$jumio_core_release",
        "()Lcom/jumio/core/Controller;",
        "getData$jumio_core_release",
        "()Lcom/jumio/core/models/CredentialDataModel;",
        "isComplete",
        "",
        "()Z",
        "credentialParts",
        "",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "getCredentialParts",
        "()Ljava/util/List;",
        "activeScanPart",
        "Lcom/jumio/sdk/scanpart/JumioScanPart;",
        "getActiveScanPart$jumio_core_release",
        "()Lcom/jumio/sdk/scanpart/JumioScanPart;",
        "setActiveScanPart$jumio_core_release",
        "(Lcom/jumio/sdk/scanpart/JumioScanPart;)V",
        "addonScanPart",
        "isValid",
        "setValid",
        "(Z)V",
        "isConfigured",
        "initScanPart",
        "credentialPart",
        "scanPartInterface",
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "start",
        "",
        "start$jumio_core_release",
        "finish",
        "cancel",
        "cancelScanPart",
        "scanPart",
        "cancelScanPart$jumio_core_release",
        "finishScanPart",
        "finishScanPart$jumio_core_release",
        "persist",
        "stop",
        "persist$jumio_core_release",
        "restore",
        "restore$jumio_core_release",
        "consumeError",
        "error",
        "Lcom/jumio/sdk/error/JumioError;",
        "consumeError$jumio_core_release",
        "(Lcom/jumio/sdk/error/JumioError;)Ljava/lang/Boolean;",
        "getAddonPart",
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
        "SMAP\nJumioCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioCredential.kt\ncom/jumio/sdk/credentials/JumioCredential\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n15#2,5:146\n15#2,5:152\n1#3:151\n*S KotlinDebug\n*F\n+ 1 JumioCredential.kt\ncom/jumio/sdk/credentials/JumioCredential\n*L\n79#1:146,5\n96#1:152,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/jumio/core/Controller;

.field public final b:Lcom/jumio/core/models/CredentialDataModel;

.field public c:Lcom/jumio/sdk/scanpart/JumioScanPart;

.field public d:Lcom/jumio/sdk/scanpart/JumioScanPart;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialDataModel;)V
    .locals 1
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/CredentialDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "controller"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "data"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 18
    const/4 p1, 0x1

    .line 19
    .line 20
    iput-boolean p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 21
    return-void
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
.end method

.method public static final a(Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/sdk/scanpart/JumioScanPart;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->d:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 3
    .line 4
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 5
    .line 6
    iget-object p0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 24
    move-result-object p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    .line 28
    :goto_0
    iput-object p1, p0, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    return-object p0
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


# virtual methods
.method public cancel()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->cancel()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lcom/jumio/core/Controller;->finishCredential$jumio_core_release(Lcom/jumio/sdk/credentials/JumioCredential;)V

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput-boolean v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 20
    .line 21
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    const-class v1, Lcom/jumio/core/models/ReportingModel;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    check-cast v0, Lcom/jumio/core/models/ReportingModel;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    const-string v2, "id"

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v0, v0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    check-cast v0, Ljumio/core/l3;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    iget-object v0, v0, Ljumio/core/l3;->a:Ljumio/core/m3;

    .line 58
    .line 59
    iget-wide v1, v0, Ljumio/core/m3;->a:J

    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    cmp-long v1, v1, v3

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    iget-wide v1, v0, Ljumio/core/m3;->b:J

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    move-result-wide v5

    .line 72
    .line 73
    iget-wide v7, v0, Ljumio/core/m3;->a:J

    .line 74
    sub-long/2addr v5, v7

    .line 75
    add-long/2addr v5, v1

    .line 76
    .line 77
    iput-wide v5, v0, Ljumio/core/m3;->b:J

    .line 78
    .line 79
    :cond_1
    iput-wide v3, v0, Ljumio/core/m3;->a:J

    .line 80
    .line 81
    :cond_2
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 82
    .line 83
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 84
    .line 85
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 86
    const/4 v2, 0x2

    .line 87
    .line 88
    const-string v3, "cancel_credential"

    .line 89
    const/4 v4, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v4, v1, v2, v4}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 97
    return-void

    .line 98
    .line 99
    :cond_3
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 100
    .line 101
    const-string v1, "Credential is not active"

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 105
    throw v0
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

.method public declared-synchronized cancelScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "scanPart"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 p1, 0x0

    .line 8
    .line 9
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->d:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 14
    .line 15
    iput-object p1, v0, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public final consumeError$jumio_core_release(Lcom/jumio/sdk/error/JumioError;)Ljava/lang/Boolean;
    .locals 1
    .param p1    # Lcom/jumio/sdk/error/JumioError;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "error"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->consumeError(Lcom/jumio/sdk/error/JumioError;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
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
.end method

.method public finish()V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;,
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isComplete()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Lcom/jumio/core/Controller;->finishCredential$jumio_core_release(Lcom/jumio/sdk/credentials/JumioCredential;)V

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    iput-boolean v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 19
    .line 20
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    const-class v1, Lcom/jumio/core/models/ReportingModel;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    check-cast v0, Lcom/jumio/core/models/ReportingModel;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    const-string v2, "id"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    iget-object v0, v0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    check-cast v0, Ljumio/core/l3;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v0, v0, Ljumio/core/l3;->a:Ljumio/core/m3;

    .line 57
    .line 58
    iget-wide v1, v0, Ljumio/core/m3;->a:J

    .line 59
    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    cmp-long v1, v1, v3

    .line 63
    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    iget-wide v1, v0, Ljumio/core/m3;->b:J

    .line 67
    .line 68
    .line 69
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 70
    move-result-wide v5

    .line 71
    .line 72
    iget-wide v7, v0, Ljumio/core/m3;->a:J

    .line 73
    sub-long/2addr v5, v7

    .line 74
    add-long/2addr v5, v1

    .line 75
    .line 76
    iput-wide v5, v0, Ljumio/core/m3;->b:J

    .line 77
    .line 78
    :cond_0
    iput-wide v3, v0, Ljumio/core/m3;->a:J

    .line 79
    .line 80
    :cond_1
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 83
    .line 84
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 85
    const/4 v2, 0x2

    .line 86
    .line 87
    const-string v3, "finish_credential"

    .line 88
    const/4 v4, 0x0

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v4, v1, v2, v4}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 96
    return-void

    .line 97
    .line 98
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 99
    .line 100
    const-string v1, "Workflow is not completed"

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 104
    throw v0

    .line 105
    .line 106
    :cond_3
    new-instance v0, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 107
    .line 108
    const-string v1, "Credential is not active"

    .line 109
    .line 110
    .line 111
    invoke-direct {v0, v1}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 112
    throw v0
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

.method public declared-synchronized finishScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "scanPart"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Laa/a;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0}, Laa/a;-><init>(Lcom/jumio/sdk/credentials/JumioCredential;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/jumio/core/scanpart/ScanPart;->checkForAddon(Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    monitor-exit p0

    .line 32
    return-void

    .line 33
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    throw p1
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
.end method

.method public final getActiveScanPart$jumio_core_release()Lcom/jumio/sdk/scanpart/JumioScanPart;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

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

.method public final getAddonPart()Lcom/jumio/sdk/scanpart/JumioScanPart;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->d:Lcom/jumio/sdk/scanpart/JumioScanPart;

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

.method public final getController$jumio_core_release()Lcom/jumio/core/Controller;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

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

.method public getCredentialParts()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/enums/JumioCredentialPart;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/SortedMap;->keySet()Ljava/util/Set;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "<get-keys>(...)"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    move-result-object v0

    .line 18
    return-object v0
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
.end method

.method public final getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

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

.method public abstract initScanPart(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/sdk/scanpart/JumioScanPart;
    .param p1    # Lcom/jumio/sdk/enums/JumioCredentialPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalStateException;,
            Ljava/lang/IllegalArgumentException;,
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final isComplete()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/models/CredentialDataModel;->a()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public abstract isConfigured()Z
.end method

.method public final isValid()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 3
    return v0
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

.method public final persist$jumio_core_release(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->persist(Z)V

    .line 14
    :cond_0
    return-void
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

.method public final restore$jumio_core_release()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->restore()V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
.end method

.method public final setActiveScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 0
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->c:Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
.end method

.method public final setValid(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->e:Z

    .line 3
    return-void
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
    .line 22
    .line 23
    .line 24
.end method

.method public start$jumio_core_release()V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioCredential;->a:Lcom/jumio/core/Controller;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-class v1, Lcom/jumio/core/models/ReportingModel;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/jumio/core/models/ReportingModel;

    .line 15
    .line 16
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 17
    .line 18
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    const-string v2, "id"

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    iput-object v1, v0, Lcom/jumio/core/models/ReportingModel;->c:Ljava/lang/String;

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    iput-object v2, v0, Lcom/jumio/core/models/ReportingModel;->d:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 32
    .line 33
    iput-object v2, v0, Lcom/jumio/core/models/ReportingModel;->e:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 34
    .line 35
    iget-object v3, v0, Lcom/jumio/core/models/ReportingModel;->a:Ljava/util/TreeMap;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    move-result-object v4

    .line 40
    .line 41
    if-nez v4, :cond_0

    .line 42
    .line 43
    new-instance v4, Ljumio/core/l3;

    .line 44
    .line 45
    .line 46
    invoke-direct {v4, v0}, Ljumio/core/l3;-><init>(Lcom/jumio/core/models/ReportingModel;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v1, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    :cond_0
    check-cast v4, Ljumio/core/l3;

    .line 52
    .line 53
    iget-object v0, v4, Ljumio/core/l3;->a:Ljumio/core/m3;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    move-result-wide v3

    .line 58
    .line 59
    iput-wide v3, v0, Ljumio/core/m3;->a:J

    .line 60
    .line 61
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 62
    .line 63
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioCredential;->b:Lcom/jumio/core/models/CredentialDataModel;

    .line 64
    .line 65
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 66
    const/4 v3, 0x2

    .line 67
    .line 68
    const-string v4, "start_credential"

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v2, v1, v3, v2}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 76
    return-void
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method
