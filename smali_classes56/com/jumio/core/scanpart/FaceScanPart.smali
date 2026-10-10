.class public Lcom/jumio/core/scanpart/FaceScanPart;
.super Lcom/jumio/core/scanpart/JVisionScanPart;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/interfaces/UsabilityInterface;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/jumio/core/models/FaceScanPartModel;",
        ">",
        "Lcom/jumio/core/scanpart/JVisionScanPart<",
        "TT;>;",
        "Lcom/jumio/core/interfaces/UsabilityInterface;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0016\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u0008\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010(\u001a\u00020)H\u0016J\u0008\u0010*\u001a\u00020)H\u0016J\u0008\u0010+\u001a\u00020)H\u0016J\u0008\u0010,\u001a\u00020)H\u0014J\u0008\u0010-\u001a\u00020)H\u0016J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020%H\u0016J\u0012\u00100\u001a\u00020)2\u0008\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00103\u001a\u00020)2\u0006\u00104\u001a\u000205H\u0017J\u0008\u00106\u001a\u00020\u000fH\u0016J\u001a\u00107\u001a\u0008\u0012\u0004\u0012\u000209082\n\u0010:\u001a\u0006\u0012\u0002\u0008\u00030;H\u0016J\u001e\u00100\u001a\u00020)2\n\u0010:\u001a\u0006\u0012\u0002\u0008\u00030;2\u0008\u00101\u001a\u0004\u0018\u00010<H\u0016J$\u0010=\u001a\u00020)2\u0008\u00101\u001a\u0004\u0018\u00010>2\u0008\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010A\u001a\u00020%H\u0014J\u001c\u0010B\u001a\u00020)2\n\u0010:\u001a\u0006\u0012\u0002\u0008\u00030;2\u0006\u0010C\u001a\u00020DH\u0014J\u001c\u0010E\u001a\u00020)2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020D0GH\u0014J\u0006\u0010I\u001a\u00020)R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0008\u0001\u0012\u0006\u0012\u0002\u0008\u00030\u00130\u00120\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0011X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\u0008\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u001dX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008&\u0010\'\u00a8\u0006J"
    }
    d2 = {
        "Lcom/jumio/core/scanpart/FaceScanPart;",
        "T",
        "Lcom/jumio/core/models/FaceScanPartModel;",
        "Lcom/jumio/core/scanpart/JVisionScanPart;",
        "Lcom/jumio/core/interfaces/UsabilityInterface;",
        "controller",
        "Lcom/jumio/core/Controller;",
        "credential",
        "Lcom/jumio/sdk/credentials/JumioFaceCredential;",
        "scanPartModel",
        "scanPartInterface",
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "<init>",
        "(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioFaceCredential;Lcom/jumio/core/models/FaceScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V",
        "sensorSamplingTime",
        "",
        "bindingClasses",
        "",
        "Ljava/lang/Class;",
        "Lcom/jumio/core/network/ApiCall;",
        "getBindingClasses",
        "()[Ljava/lang/Class;",
        "sensorProxy",
        "Lcom/jumio/core/sensors/SensorProxy;",
        "livenessSettingsModel",
        "Lcom/jumio/core/models/LivenessSettingsModel;",
        "getLivenessSettingsModel",
        "()Lcom/jumio/core/models/LivenessSettingsModel;",
        "supportedFacing",
        "Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "getSupportedFacing",
        "()[Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "[Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "defaultFacing",
        "getDefaultFacing",
        "()Lcom/jumio/sdk/enums/JumioCameraFacing;",
        "shouldEnableUsability",
        "",
        "getShouldEnableUsability",
        "()Z",
        "start",
        "",
        "finish",
        "cancel",
        "reset",
        "restore",
        "persist",
        "stop",
        "onResult",
        "result",
        "Lcom/jumio/core/model/StaticModel;",
        "getHelpAnimation",
        "animationView",
        "Lcom/jumio/sdk/views/JumioAnimationView;",
        "getPreferredBrandTextColor",
        "getMultipartItemsForResultKeys",
        "",
        "Lcom/jumio/core/interfaces/UsabilityInterface$MultipartItem;",
        "apiCallDataModel",
        "Lcom/jumio/core/models/ApiCallDataModel;",
        "",
        "handleShotTaken",
        "Lcom/jumio/core/extraction/result/ExtractionResult;",
        "metaInfo",
        "Lcom/jumio/analytics/MetaInfo;",
        "vibrate",
        "handleUploadOrUsabilityResult",
        "automationModel",
        "Lcom/jumio/core/models/automation/AutomationModel;",
        "handleUsabilityReject",
        "rejectedModels",
        "",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "clearReusableIdLookUp",
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
        "SMAP\nFaceScanPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceScanPart.kt\ncom/jumio/core/scanpart/FaceScanPart\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Log.kt\ncom/jumio/commons/log/Log\n*L\n1#1,247:1\n13402#2:248\n13403#2:250\n34#3:249\n*S KotlinDebug\n*F\n+ 1 FaceScanPart.kt\ncom/jumio/core/scanpart/FaceScanPart\n*L\n210#1:248\n210#1:250\n212#1:249\n*E\n"
    }
.end annotation


# instance fields
.field public final t:I

.field public final u:Lcom/jumio/core/sensors/SensorProxy;

.field public final v:Lcom/jumio/core/models/LivenessSettingsModel;

.field public final w:[Lcom/jumio/sdk/enums/JumioCameraFacing;

.field public final x:Lcom/jumio/sdk/enums/JumioCameraFacing;


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioFaceCredential;Lcom/jumio/core/models/FaceScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/credentials/JumioFaceCredential;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/jumio/core/models/FaceScanPartModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/Controller;",
            "Lcom/jumio/sdk/credentials/JumioFaceCredential;",
            "TT;",
            "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
            ")V"
        }
    .end annotation

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
    invoke-static {p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 24
    move-result-object p3

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/scanpart/JVisionScanPart;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Ljava/util/List;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 31
    move-result-object p2

    .line 32
    .line 33
    const-class p3, Lcom/jumio/core/models/SettingsModel;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    check-cast p2, Lcom/jumio/core/models/SettingsModel;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/jumio/core/models/SettingsModel;->getSensorSamplingTime()I

    .line 43
    move-result p2

    .line 44
    .line 45
    iput p2, p0, Lcom/jumio/core/scanpart/FaceScanPart;->t:I

    .line 46
    .line 47
    new-instance p2, Lcom/jumio/core/sensors/SensorProxy;

    .line 48
    .line 49
    new-instance p3, Lu9/a;

    .line 50
    .line 51
    .line 52
    invoke-direct {p3, p1, p0}, Lu9/a;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/core/scanpart/FaceScanPart;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p2, p3}, Lcom/jumio/core/sensors/SensorProxy;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    iput-object p2, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    const-class p2, Lcom/jumio/core/models/LivenessSettingsModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    check-cast p1, Lcom/jumio/core/models/LivenessSettingsModel;

    .line 70
    .line 71
    iput-object p1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->v:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 72
    .line 73
    sget-object p1, Lcom/jumio/sdk/enums/JumioCameraFacing;->Companion:Lcom/jumio/sdk/enums/JumioCameraFacing$Companion;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    .line 77
    move-result-object p2

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/jumio/core/models/SettingsModel;->getFaceCaptureMode()Ljava/lang/String;

    .line 81
    move-result-object p2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, p2}, Lcom/jumio/sdk/enums/JumioCameraFacing$Companion;->fromFaceCaptureMode(Ljava/lang/String;)Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    .line 88
    filled-new-array {p2}, [Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    iput-object p2, p0, Lcom/jumio/core/scanpart/FaceScanPart;->w:[Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    .line 95
    move-result-object p2

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/jumio/core/models/SettingsModel;->getFaceCaptureMode()Ljava/lang/String;

    .line 99
    move-result-object p2

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p2}, Lcom/jumio/sdk/enums/JumioCameraFacing$Companion;->fromFaceCaptureMode(Ljava/lang/String;)Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 103
    move-result-object p1

    .line 104
    .line 105
    iput-object p1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->x:Lcom/jumio/sdk/enums/JumioCameraFacing;

    .line 106
    return-void
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

.method public static final a(Lcom/jumio/core/Controller;Lcom/jumio/core/scanpart/FaceScanPart;Ljava/util/List;)Lkotlin/Unit;
    .locals 7

    .line 1
    .line 2
    const-string v0, "$this$SensorProxy"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-class v1, Lcom/jumio/core/models/SettingsModel;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getSensorDataCollectionEnabled()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    new-instance v1, Lcom/jumio/core/sensors/SensorConfig;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    const-class v0, Lcom/jumio/core/models/TimeModel;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 35
    move-result-object p0

    .line 36
    move-object v2, p0

    .line 37
    .line 38
    check-cast v2, Lcom/jumio/core/models/TimeModel;

    .line 39
    .line 40
    iget v3, p1, Lcom/jumio/core/scanpart/FaceScanPart;->t:I

    .line 41
    const/4 v5, 0x4

    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/sensors/SensorConfig;-><init>(Lcom/jumio/core/models/TimeModel;I[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    sget-object p1, Lcom/jumio/core/sensors/SensorType;->GYROSCOPE:Lcom/jumio/core/sensors/SensorType;

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    sget-object p1, Lcom/jumio/core/sensors/SensorType;->ACCELEROMETER:Lcom/jumio/core/sensors/SensorType;

    .line 66
    .line 67
    .line 68
    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    .line 69
    move-result-object p0

    .line 70
    .line 71
    .line 72
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    .line 76
    move-result-object p0

    .line 77
    .line 78
    sget-object p1, Lcom/jumio/core/sensors/SensorType;->GRAVITY:Lcom/jumio/core/sensors/SensorType;

    .line 79
    .line 80
    .line 81
    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    .line 82
    move-result-object p0

    .line 83
    .line 84
    .line 85
    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 88
    return-object p0
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
.end method


# virtual methods
.method public cancel()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/FaceScanPart;->clearReusableIdLookUp()V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final clearReusableIdLookUp()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-class v1, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    iput-object v1, v0, Lcom/jumio/core/models/ReusableIdLookupResult;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 20
    return-void
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

.method public finish()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->finish()V

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

.method public getBindingClasses()[Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "+",
            "Lcom/jumio/core/network/ApiCall<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getBindingClasses()[Ljava/lang/Class;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/jumio/core/api/calls/ReusableIdLookupCall;

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

.method public getDefaultFacing()Lcom/jumio/sdk/enums/JumioCameraFacing;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->x:Lcom/jumio/sdk/enums/JumioCameraFacing;

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

.method public getHelpAnimation(Lcom/jumio/sdk/views/JumioAnimationView;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/views/JumioAnimationView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/Deprecated;
        message = "Deprecated in core, moved to defaultui module"
    .end annotation

    .line 1
    .line 2
    const-string v0, "animationView"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public final getLivenessSettingsModel()Lcom/jumio/core/models/LivenessSettingsModel;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->v:Lcom/jumio/core/models/LivenessSettingsModel;

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

.method public getMultipartItemsForResultKeys(Lcom/jumio/core/models/ApiCallDataModel;)Ljava/util/List;
    .locals 2
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;)",
            "Ljava/util/List<",
            "Ljumio/core/a4;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "apiCallDataModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance p1, Ljumio/core/a4;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v0, v1}, Ljumio/core/a4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
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

.method public getPreferredBrandTextColor()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/jumio/core/R$color;->jumio_gray_12:I

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

.method public getShouldEnableUsability()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->isInstantFeedbackEnabled()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getNumOfRetries()I

    .line 14
    move-result v0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->v:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getRetries()I

    .line 20
    move-result v1

    .line 21
    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
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

.method public getSupportedFacing()[Lcom/jumio/sdk/enums/JumioCameraFacing;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->w:[Lcom/jumio/sdk/enums/JumioCameraFacing;

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

.method public handleShotTaken(Lcom/jumio/core/extraction/result/ExtractionResult;Lcom/jumio/analytics/MetaInfo;Z)V
    .locals 5
    .param p1    # Lcom/jumio/core/extraction/result/ExtractionResult;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/analytics/MetaInfo;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 15
    monitor-enter v0

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    iget-object v2, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 25
    move-result-object v3

    .line 26
    .line 27
    iget v4, p0, Lcom/jumio/core/scanpart/FaceScanPart;->t:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Lcom/jumio/core/sensors/SensorProxy;->collectResult(Lcom/jumio/sdk/credentials/JumioCredential;I)Ljumio/core/G3;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lcom/jumio/core/models/ScanPartModel;->setSensorData(Ljumio/core/G3;)V

    .line 35
    .line 36
    iget-object v1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Lcom/jumio/core/sensors/SensorProxy;->reset()V

    .line 40
    .line 41
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    monitor-exit v0

    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    monitor-exit v0

    .line 46
    throw p1

    .line 47
    .line 48
    .line 49
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2, p3}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleShotTaken(Lcom/jumio/core/extraction/result/ExtractionResult;Lcom/jumio/analytics/MetaInfo;Z)V

    .line 50
    return-void
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
.end method

.method public handleUploadOrUsabilityResult(Lcom/jumio/core/models/ApiCallDataModel;Lcom/jumio/core/models/automation/AutomationModel;)V
    .locals 3
    .param p1    # Lcom/jumio/core/models/ApiCallDataModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/models/automation/AutomationModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/models/ApiCallDataModel<",
            "*>;",
            "Lcom/jumio/core/models/automation/AutomationModel;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "apiCallDataModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "automationModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleUploadOrUsabilityResult(Lcom/jumio/core/models/ApiCallDataModel;Lcom/jumio/core/models/automation/AutomationModel;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    sget-object v0, Lcom/jumio/core/data/ScanMode;->FACE_MANUAL:Lcom/jumio/core/data/ScanMode;

    .line 24
    .line 25
    if-ne p1, v0, :cond_5

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 35
    move-result-object p1

    .line 36
    const/4 v0, 0x0

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getState()Lcom/jumio/core/data/scan/DataState;

    .line 42
    move-result-object p1

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object p1, v0

    .line 45
    .line 46
    :goto_0
    sget-object v1, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 47
    .line 48
    if-eq p1, v1, :cond_5

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getState()Lcom/jumio/core/data/scan/DataState;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    :cond_1
    sget-object p1, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 67
    .line 68
    if-ne v0, p1, :cond_2

    .line 69
    goto :goto_2

    .line 70
    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/jumio/core/models/automation/AutomationModel;->getDecisionType()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    sget-object v0, Lcom/jumio/core/models/automation/AutomationModel$DecisionType;->REJECT:Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 88
    .line 89
    if-eq p2, v0, :cond_4

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getFrames()[Lcom/jumio/commons/camera/ImageData;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    if-eqz p2, :cond_3

    .line 96
    array-length v0, p2

    .line 97
    const/4 v1, 0x0

    .line 98
    .line 99
    :goto_1
    if-ge v1, v0, :cond_3

    .line 100
    .line 101
    aget-object v2, p2, v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v2}, Lcom/jumio/core/scanpart/JVisionScanPart;->addCameraData(Lcom/jumio/commons/camera/ImageDataInterface;)V

    .line 105
    .line 106
    sget-object v2, Lcom/jumio/commons/log/Log;->INSTANCE:Lcom/jumio/commons/log/Log;

    .line 107
    .line 108
    sget-object v2, Lcom/jumio/commons/log/LogLevel;->OFF:Lcom/jumio/commons/log/LogLevel;

    .line 109
    .line 110
    add-int/lit8 v1, v1, 0x1

    .line 111
    goto :goto_1

    .line 112
    .line 113
    .line 114
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 115
    move-result-object p2

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    .line 119
    move-result-object p2

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    const-string v1, "LIVENESS_SERIES"

    .line 126
    .line 127
    .line 128
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getId()Ljava/lang/String;

    .line 145
    move-result-object v1

    .line 146
    .line 147
    const-string v2, "liveness_series"

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v0, p1, v1, v2}, Lcom/jumio/core/api/BackendManager;->uploadRawData(Lcom/jumio/sdk/credentials/JumioCredential;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 151
    return-void

    .line 152
    .line 153
    :cond_4
    if-eqz p1, :cond_5

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1, v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->setState(Lcom/jumio/core/data/scan/DataState;)V

    .line 157
    :cond_5
    :goto_2
    return-void
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

.method public handleUsabilityReject(Ljava/util/Map;)V
    .locals 7
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/jumio/sdk/enums/JumioCredentialPart;",
            "Lcom/jumio/core/models/automation/AutomationModel;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "rejectedModels"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getNumOfRetries()I

    .line 9
    move-result v0

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->setNumOfRetries(I)V

    .line 15
    .line 16
    sget-object v2, Lcom/jumio/sdk/enums/JumioScanStep;->RETRY:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 17
    .line 18
    new-instance v3, Lcom/jumio/sdk/retry/JumioRetryReason;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/jumio/core/models/automation/AutomationModel;

    .line 33
    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/AutomationModel;->getRejectReason()Lcom/jumio/core/models/automation/RejectReason;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/RejectReason;->getCode()Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-eqz p1, :cond_0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 56
    move-result p1

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 p1, 0x0

    .line 59
    .line 60
    :goto_0
    const-string v0, ""

    .line 61
    .line 62
    .line 63
    invoke-direct {v3, p1, v0}, Lcom/jumio/sdk/retry/JumioRetryReason;-><init>(ILjava/lang/String;)V

    .line 64
    const/4 v5, 0x4

    .line 65
    const/4 v6, 0x0

    .line 66
    const/4 v4, 0x0

    .line 67
    move-object v1, p0

    .line 68
    .line 69
    .line 70
    invoke-static/range {v1 .. v6}, Lcom/jumio/core/scanpart/ScanPart;->sendScanStep$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 71
    return-void
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

.method public onResult(Lcom/jumio/core/model/StaticModel;)V
    .locals 2
    .param p1    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    instance-of v0, p1, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/FaceScanPartModel;

    invoke-virtual {v1, v0}, Lcom/jumio/core/models/FaceScanPartModel;->setLivenessData(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V

    .line 4
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V
    .locals 6
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

    .line 5
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getContentId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "liveness_series"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_LIVENESS:Lcom/jumio/core/data/ScanMode;

    if-ne v0, v1, :cond_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/FaceScanPartModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    invoke-virtual {v0, v1}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->setState(Lcom/jumio/core/data/scan/DataState;)V

    .line 7
    :cond_1
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object v0

    .line 8
    const-class v1, Lcom/jumio/core/api/calls/ReusableIdLookupCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 9
    instance-of v0, p2, Lcom/jumio/core/models/ReusableIdLookupResult;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lcom/jumio/core/models/ReusableIdLookupResult;

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_3

    new-instance v0, Lcom/jumio/core/models/ReusableIdLookupResult;

    invoke-direct {v0}, Lcom/jumio/core/models/ReusableIdLookupResult;-><init>()V

    .line 10
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v1

    const-class v3, Lcom/jumio/core/models/ReusableIdLookupResult;

    invoke-virtual {v1, v3, v0}, Lcom/jumio/core/persistence/DataManager;->put(Ljava/lang/Class;Ljava/io/Serializable;)V

    .line 11
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v1

    instance-of v3, v1, Lcom/jumio/core/models/FaceScanPartModel;

    if-eqz v3, :cond_4

    move-object v2, v1

    check-cast v2, Lcom/jumio/core/models/FaceScanPartModel;

    :cond_4
    if-eqz v2, :cond_5

    invoke-virtual {v2, v0}, Lcom/jumio/core/models/FaceScanPartModel;->setLookupResult(Lcom/jumio/core/models/ReusableIdLookupResult;)V

    .line 12
    :cond_5
    invoke-virtual {p0}, Ljumio/core/y2;->getAllPartsComplete()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->processUsabilityResults()V

    .line 14
    :cond_6
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    return-void

    .line 15
    :cond_7
    const-class v1, Lcom/jumio/core/api/calls/UsabilityCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "null cannot be cast to non-null type com.jumio.core.models.FaceScanPartModel"

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_a

    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    instance-of v1, v0, Lcom/jumio/core/models/FaceScanPartModel;

    if-eqz v1, :cond_8

    move-object v2, v0

    check-cast v2, Lcom/jumio/core/models/FaceScanPartModel;

    :cond_8
    if-eqz v2, :cond_e

    .line 17
    invoke-virtual {v2}, Lcom/jumio/core/models/FaceScanPartModel;->getShouldUseLookupResult()Z

    move-result v0

    if-eqz v0, :cond_9

    const-string v0, "null cannot be cast to non-null type com.jumio.core.models.automation.AutomationModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, Lcom/jumio/core/models/automation/AutomationModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/automation/AutomationModel;->getDecisionType()Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/models/automation/AutomationModel$DecisionType;->REJECT:Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    if-eq v0, v1, :cond_9

    move v4, v5

    .line 18
    :cond_9
    invoke-virtual {v2, v4}, Lcom/jumio/core/models/FaceScanPartModel;->setShouldUseLookupResult(Z)V

    .line 19
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    .line 20
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getUploadAndUsabilityComplete()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {v2}, Lcom/jumio/core/models/FaceScanPartModel;->getShouldUseLookupResult()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 21
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/api/BackendManager;->reusableIdLookup()V

    return-void

    .line 22
    :cond_a
    const-class v1, Lcom/jumio/core/api/calls/UploadCall;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 23
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    instance-of v1, v0, Lcom/jumio/core/models/FaceScanPartModel;

    if-eqz v1, :cond_b

    check-cast v0, Lcom/jumio/core/models/FaceScanPartModel;

    goto :goto_1

    :cond_b
    move-object v0, v2

    :goto_1
    if-eqz v0, :cond_e

    .line 24
    instance-of v1, p2, Lorg/json/JSONObject;

    if-eqz v1, :cond_c

    move-object v2, p2

    check-cast v2, Lorg/json/JSONObject;

    :cond_c
    invoke-virtual {p0, p1, v2}, Lcom/jumio/core/scanpart/JVisionScanPart;->getUsabilityResultKeys(Lcom/jumio/core/models/ApiCallDataModel;Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v1

    .line 25
    invoke-virtual {v0}, Lcom/jumio/core/models/FaceScanPartModel;->getShouldUseLookupResult()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_d

    move v4, v5

    .line 26
    :cond_d
    invoke-virtual {v0, v4}, Lcom/jumio/core/models/FaceScanPartModel;->setShouldUseLookupResult(Z)V

    .line 27
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getUploadAndUsabilityComplete()Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/FaceScanPartModel;

    invoke-virtual {p1}, Lcom/jumio/core/models/FaceScanPartModel;->getShouldUseLookupResult()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 29
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/api/BackendManager;->reusableIdLookup()V

    :cond_e
    return-void

    .line 30
    :cond_f
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/model/StaticModel;

    invoke-virtual {p0, p1}, Lcom/jumio/core/scanpart/FaceScanPart;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public persist(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->persist(Z)V

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 11
    :cond_0
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
.end method

.method public reset()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/jumio/core/sensors/SensorProxy;->reset()V

    .line 9
    .line 10
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    instance-of v1, v0, Lcom/jumio/core/models/FaceScanPartModel;

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Lcom/jumio/core/models/FaceScanPartModel;

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v2

    .line 25
    .line 26
    :goto_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-class v3, Lcom/jumio/core/models/CredentialsModel;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Lcom/jumio/core/models/CredentialsModel;

    .line 43
    .line 44
    iget-object v1, v1, Lcom/jumio/core/models/CredentialsModel;->b:Ljava/lang/String;

    .line 45
    .line 46
    const-string v3, "REUSABLE_IDENTITY"

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    move-result v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/FaceScanPartModel;->setShouldUseLookupResult(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    check-cast v0, Lcom/jumio/core/models/FaceScanPartModel;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Lcom/jumio/core/models/FaceScanPartModel;->setLivenessData(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;)V

    .line 63
    .line 64
    .line 65
    invoke-super {p0}, Ljumio/core/y2;->reset()V

    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    monitor-exit v0

    .line 69
    throw v1
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

.method public restore()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->restore()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getContext()Lcom/jumio/core/MobileContext;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/jumio/core/sensors/SensorProxy;->start(Landroid/content/Context;)V

    .line 17
    return-void
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
.end method

.method public start()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/scanpart/FaceScanPart;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getContext()Lcom/jumio/core/MobileContext;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/jumio/core/sensors/SensorProxy;->start(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/FaceScanPart;->clearReusableIdLookUp()V

    .line 17
    .line 18
    .line 19
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->start()V

    .line 20
    return-void
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
