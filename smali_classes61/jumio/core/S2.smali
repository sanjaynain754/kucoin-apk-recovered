.class public final Ljumio/core/S2;
.super Lcom/jumio/core/scanpart/JVisionScanPart;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/interfaces/UsabilityInterface;


# instance fields
.field public final t:I

.field public final u:Lcom/jumio/core/sensors/SensorProxy;

.field public final v:Ljava/util/ArrayList;

.field public final w:Z


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioIDCredential;Ljava/util/ArrayList;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V
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
    const-string v0, "scanPartModelList"

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
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/core/scanpart/JVisionScanPart;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Ljava/util/List;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    const-class p3, Lcom/jumio/core/models/SettingsModel;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    check-cast p2, Lcom/jumio/core/models/SettingsModel;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/jumio/core/models/SettingsModel;->getSensorSamplingTime()I

    .line 39
    move-result p2

    .line 40
    .line 41
    iput p2, p0, Ljumio/core/S2;->t:I

    .line 42
    .line 43
    new-instance p2, Lcom/jumio/core/sensors/SensorProxy;

    .line 44
    .line 45
    new-instance p3, Llg0/z;

    .line 46
    .line 47
    .line 48
    invoke-direct {p3, p1, p0}, Llg0/z;-><init>(Lcom/jumio/core/Controller;Ljumio/core/S2;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p2, p3}, Lcom/jumio/core/sensors/SensorProxy;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    iput-object p2, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 54
    .line 55
    new-instance p1, Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    iput-object p1, p0, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    .line 61
    const/4 p1, 0x1

    .line 62
    .line 63
    iput-boolean p1, p0, Ljumio/core/S2;->w:Z

    .line 64
    return-void
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

.method public static final a(Lcom/jumio/core/model/StaticModel;Lcom/jumio/core/model/StaticModel;)Lcom/jumio/core/model/StaticModel;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static final a(Lcom/jumio/core/Controller;Ljumio/core/S2;Ljava/util/List;)Lkotlin/Unit;
    .locals 7

    const-string v0, "$this$SensorProxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getSensorDataCollectionEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance v1, Lcom/jumio/core/sensors/SensorConfig;

    .line 4
    invoke-virtual {p0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object p0

    const-class v0, Lcom/jumio/core/models/TimeModel;

    invoke-virtual {p0, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/jumio/core/models/TimeModel;

    .line 5
    iget v3, p1, Ljumio/core/S2;->t:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 6
    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/sensors/SensorConfig;-><init>(Lcom/jumio/core/models/TimeModel;I[FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->GYROSCOPE:Lcom/jumio/core/sensors/SensorType;

    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->ACCELEROMETER:Lcom/jumio/core/sensors/SensorType;

    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    invoke-static {}, Lcom/jumio/core/sensors/SensorFactoryInterfaceKt;->getSensorFactory()Lcom/jumio/core/sensors/SensorFactoryInterface;

    move-result-object p0

    sget-object p1, Lcom/jumio/core/sensors/SensorType;->GRAVITY:Lcom/jumio/core/sensors/SensorType;

    invoke-interface {p0, p1, v1}, Lcom/jumio/core/sensors/SensorFactoryInterface;->getSensor(Lcom/jumio/core/sensors/SensorType;Lcom/jumio/core/sensors/SensorConfig;)Lcom/jumio/core/sensors/SensorInterface;

    move-result-object p0

    invoke-interface {p2, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final cameraAvailable()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->cameraAvailable()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getScanView()Lcom/jumio/core/views/CameraScanView;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object v1, Ljumio/core/g0;->a:Ljumio/core/f0;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/jumio/core/views/CameraScanView;->setShader$jumio_core_release(Lcom/jumio/commons/camera/renderer/opengl/ShaderProvider;)V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final cancel()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->cancel()V

    .line 4
    .line 5
    iget-object v0, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 9
    return-void
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

.method public final checkForAddon(Lkotlin/jvm/functions/Function1;)V
    .locals 14

    .line 1
    .line 2
    const-string v0, "complete"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v1, Ljumio/core/W2;->i:Ljumio/core/W2;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    check-cast v0, Lcom/jumio/core/plugins/ScanPartPlugin;

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Ljumio/core/y2;->getScanPartModelList()Ljava/util/List;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    move-result v3

    .line 41
    .line 42
    if-eqz v3, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    move-result-object v3

    .line 47
    move-object v4, v3

    .line 48
    .line 49
    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 53
    move-result-object v5

    .line 54
    .line 55
    .line 56
    invoke-interface {v0, v5, v4}, Lcom/jumio/core/plugins/Plugin;->isApplicableFor(Lcom/jumio/core/Controller;Lcom/jumio/core/models/ScanPartModel;)Z

    .line 57
    move-result v4

    .line 58
    .line 59
    if-eqz v4, :cond_1

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v3, v1

    .line 62
    .line 63
    :goto_0
    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 64
    .line 65
    if-eqz v3, :cond_6

    .line 66
    .line 67
    new-instance v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 68
    .line 69
    sget-object v5, Lcom/jumio/sdk/enums/JumioCredentialPart;->NFC:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 70
    .line 71
    sget-object v6, Lcom/jumio/core/data/ScanMode;->NFC:Lcom/jumio/core/data/ScanMode;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 75
    move-result-object v7

    .line 76
    .line 77
    const/16 v12, 0x78

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    const/4 v10, 0x0

    .line 82
    const/4 v11, 0x0

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v4 .. v13}, Lcom/jumio/core/models/PhysicalIdScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljumio/core/W;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    .line 89
    move-result-object v2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDocumentData(Lcom/jumio/core/models/DocumentDataModel;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    iget-object v2, v2, Lcom/jumio/core/models/CredentialDataModel;->f:Ljava/util/SortedMap;

    .line 103
    .line 104
    .line 105
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 113
    move-result-object v3

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartInterface()Lcom/jumio/sdk/interfaces/JumioScanPartInterface;

    .line 117
    move-result-object v5

    .line 118
    .line 119
    .line 120
    invoke-interface {v0, v2, v3, v4, v5}, Lcom/jumio/core/plugins/ScanPartPlugin;->getScanPart(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/core/scanpart/ScanPart;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    new-instance v2, Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 124
    .line 125
    .line 126
    invoke-direct {v2, v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;-><init>(Lcom/jumio/core/scanpart/ScanPart;)V

    .line 127
    .line 128
    .line 129
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    new-instance p1, Lcom/jumio/sdk/document/JumioDocumentInfo;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    .line 135
    move-result-object v0

    .line 136
    .line 137
    if-eqz v0, :cond_3

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingCountry()Ljava/lang/String;

    .line 141
    move-result-object v0

    .line 142
    goto :goto_1

    .line 143
    :cond_3
    move-object v0, v1

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-virtual {v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    .line 147
    move-result-object v2

    .line 148
    .line 149
    if-eqz v2, :cond_4

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/jumio/core/models/DocumentDataModel;->getSelectedDocumentType()Lcom/jumio/sdk/document/JumioDocumentType;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    :cond_4
    invoke-direct {p1, v0, v1}, Lcom/jumio/sdk/document/JumioDocumentInfo;-><init>(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocumentType;)V

    .line 157
    .line 158
    new-instance v4, Lcom/jumio/sdk/scanpart/JumioAddonScanPartConfiguration;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 162
    move-result-object v0

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 166
    move-result-object v0

    .line 167
    .line 168
    const-class v1, Lcom/jumio/core/models/NfcSettingsModel;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 172
    move-result-object v0

    .line 173
    .line 174
    check-cast v0, Lcom/jumio/core/models/NfcSettingsModel;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Lcom/jumio/core/models/NfcSettingsModel;->getNfcRetries()I

    .line 178
    move-result v0

    .line 179
    .line 180
    if-ltz v0, :cond_5

    .line 181
    const/4 v0, 0x1

    .line 182
    goto :goto_2

    .line 183
    :cond_5
    const/4 v0, 0x0

    .line 184
    .line 185
    .line 186
    :goto_2
    invoke-direct {v4, p1, v0}, Lcom/jumio/sdk/scanpart/JumioAddonScanPartConfiguration;-><init>(Lcom/jumio/sdk/document/JumioDocumentInfo;Z)V

    .line 187
    .line 188
    sget-object v3, Lcom/jumio/sdk/enums/JumioScanStep;->ADDON_SCAN_PART:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 189
    const/4 v6, 0x4

    .line 190
    const/4 v7, 0x0

    .line 191
    const/4 v5, 0x0

    .line 192
    move-object v2, p0

    .line 193
    .line 194
    .line 195
    invoke-static/range {v2 .. v7}, Lcom/jumio/core/scanpart/ScanPart;->sendScanStep$default(Lcom/jumio/core/scanpart/ScanPart;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 196
    return-void

    .line 197
    .line 198
    .line 199
    :cond_6
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    return-void
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

.method public final configureExtractionClient(Lcom/jumio/core/extraction/ExtractionClient;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "extractionClient"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSubExtraction()Ljava/util/Map;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    check-cast v0, Lcom/jumio/core/data/ScanMode;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v0}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 52
    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/Plugin;->isUsable(Lcom/jumio/core/Controller;)Z

    .line 61
    move-result v1

    .line 62
    const/4 v2, 0x1

    .line 63
    .line 64
    if-ne v1, v2, :cond_0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/ExtractionPlugin;->getExtractionClient(Lcom/jumio/core/Controller;)Lcom/jumio/core/extraction/ExtractionClient;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    new-instance v1, Llg0/a0;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1}, Llg0/a0;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lcom/jumio/core/extraction/ExtractionClient;->addSubExtraction(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/jvm/functions/Function2;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->configureExtractionClient(Lcom/jumio/core/extraction/ExtractionClient;)V

    .line 84
    return-void
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
    .locals 6

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
    invoke-virtual {p0}, Ljumio/core/S2;->getHasFallback()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_a

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getScanView()Lcom/jumio/core/views/CameraScanView;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_a

    .line 18
    .line 19
    iget-object v0, p0, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_a

    .line 26
    .line 27
    sget-object v0, Lcom/jumio/sdk/enums/JumioScanStep;->SCAN_VIEW:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 28
    .line 29
    sget-object v1, Lcom/jumio/sdk/enums/JumioScanStep;->STARTED:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 30
    .line 31
    sget-object v2, Lcom/jumio/sdk/enums/JumioScanStep;->NEXT_PART:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 32
    .line 33
    .line 34
    filled-new-array {v0, v1, v2}, [Lcom/jumio/sdk/enums/JumioScanStep;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getScanStep()Lcom/jumio/sdk/enums/JumioScanStep;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 53
    move-result v0

    .line 54
    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/ScanPart;->fallback(Lcom/jumio/sdk/enums/JumioFallbackReason;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-interface {v0}, Lcom/jumio/core/data/scan/DataInterface;->getHasData()Z

    .line 74
    move-result v0

    .line 75
    const/4 v1, 0x1

    .line 76
    .line 77
    if-eqz v0, :cond_8

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->destroyExtractionClient()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->destroyOverlay()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 87
    move-result-object p1

    .line 88
    .line 89
    check-cast p1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getProcessorConfigs()Ljava/util/List;

    .line 93
    move-result-object p1

    .line 94
    .line 95
    .line 96
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    move-result v0

    .line 102
    .line 103
    if-eqz v0, :cond_7

    .line 104
    .line 105
    .line 106
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    check-cast v0, Lcom/jumio/core/processor/ImageProcessorConfig;

    .line 110
    .line 111
    instance-of v2, v0, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 112
    .line 113
    if-eqz v2, :cond_3

    .line 114
    move-object v2, v0

    .line 115
    .line 116
    check-cast v2, Lcom/jumio/core/processor/SingleImageProcessorConfig;

    .line 117
    .line 118
    .line 119
    invoke-interface {v2}, Lcom/jumio/core/processor/SingleImageProcessorConfig;->getImage()Lcom/jumio/core/processor/ProcessorImage;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    .line 123
    invoke-interface {v2}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDataState(Ljava/lang/String;)Lcom/jumio/core/data/scan/DataState;

    .line 134
    move-result-object v3

    .line 135
    .line 136
    if-eqz v3, :cond_2

    .line 137
    .line 138
    sget-object v4, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v4}, Lcom/jumio/core/data/scan/DataState;->isAtLeast(Lcom/jumio/core/data/scan/DataState;)Z

    .line 142
    move-result v3

    .line 143
    .line 144
    if-ne v3, v1, :cond_2

    .line 145
    goto :goto_2

    .line 146
    .line 147
    .line 148
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 149
    move-result-object v3

    .line 150
    .line 151
    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 152
    .line 153
    sget-object v4, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v2, v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 157
    goto :goto_2

    .line 158
    .line 159
    :cond_3
    instance-of v2, v0, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    .line 160
    .line 161
    if-eqz v2, :cond_5

    .line 162
    move-object v2, v0

    .line 163
    .line 164
    check-cast v2, Lcom/jumio/core/processor/MultiImageProcessorConfig;

    .line 165
    .line 166
    .line 167
    invoke-interface {v2}, Lcom/jumio/core/processor/MultiImageProcessorConfig;->getImages()Ljava/util/List;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    .line 171
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    move-result-object v2

    .line 173
    .line 174
    .line 175
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    move-result v3

    .line 177
    .line 178
    if-eqz v3, :cond_5

    .line 179
    .line 180
    .line 181
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    move-result-object v3

    .line 183
    .line 184
    check-cast v3, Lcom/jumio/core/processor/ProcessorImage;

    .line 185
    .line 186
    .line 187
    invoke-interface {v3}, Lcom/jumio/core/processor/ProcessorImage;->getClassifier()Ljava/lang/String;

    .line 188
    move-result-object v3

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 192
    move-result-object v4

    .line 193
    .line 194
    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDataState(Ljava/lang/String;)Lcom/jumio/core/data/scan/DataState;

    .line 198
    move-result-object v4

    .line 199
    .line 200
    if-eqz v4, :cond_4

    .line 201
    .line 202
    sget-object v5, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v5}, Lcom/jumio/core/data/scan/DataState;->isAtLeast(Lcom/jumio/core/data/scan/DataState;)Z

    .line 206
    move-result v4

    .line 207
    .line 208
    if-ne v4, v1, :cond_4

    .line 209
    goto :goto_1

    .line 210
    .line 211
    .line 212
    :cond_4
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 216
    .line 217
    sget-object v5, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4, v3, v5}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 221
    goto :goto_1

    .line 222
    .line 223
    :cond_5
    :goto_2
    instance-of v2, v0, Lcom/jumio/core/processor/SingleDataProcessorConfig;

    .line 224
    .line 225
    if-eqz v2, :cond_1

    .line 226
    .line 227
    check-cast v0, Lcom/jumio/core/processor/SingleDataProcessorConfig;

    .line 228
    .line 229
    .line 230
    invoke-interface {v0}, Lcom/jumio/core/processor/SingleDataProcessorConfig;->getProcessorData()Lcom/jumio/core/processor/ProcessorData;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0}, Lcom/jumio/core/processor/ProcessorData;->getClassifier()Ljava/lang/String;

    .line 235
    move-result-object v0

    .line 236
    .line 237
    .line 238
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 239
    move-result-object v2

    .line 240
    .line 241
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2, v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDataState(Ljava/lang/String;)Lcom/jumio/core/data/scan/DataState;

    .line 245
    move-result-object v2

    .line 246
    .line 247
    if-eqz v2, :cond_6

    .line 248
    .line 249
    sget-object v3, Lcom/jumio/core/data/scan/DataState;->UPLOADED:Lcom/jumio/core/data/scan/DataState;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v3}, Lcom/jumio/core/data/scan/DataState;->isAtLeast(Lcom/jumio/core/data/scan/DataState;)Z

    .line 253
    move-result v2

    .line 254
    .line 255
    if-ne v2, v1, :cond_6

    .line 256
    .line 257
    goto/16 :goto_0

    .line 258
    .line 259
    .line 260
    :cond_6
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 261
    move-result-object v2

    .line 262
    .line 263
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 264
    .line 265
    sget-object v3, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v0, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 269
    .line 270
    goto/16 :goto_0

    .line 271
    :cond_7
    const/4 p1, 0x0

    .line 272
    const/4 v0, 0x0

    .line 273
    .line 274
    .line 275
    invoke-static {p0, p1, v1, v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->nextPartOrProcess$default(Lcom/jumio/core/scanpart/JVisionScanPart;ZILjava/lang/Object;)V

    .line 276
    return-void

    .line 277
    .line 278
    .line 279
    :cond_8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 280
    move-result-object v0

    .line 281
    .line 282
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 292
    move-result-object v2

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 296
    move-result-object v3

    .line 297
    .line 298
    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 302
    move-result-object v3

    .line 303
    .line 304
    .line 305
    invoke-interface {v3, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 306
    move-result v3

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 310
    move-result-object v4

    .line 311
    .line 312
    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 316
    move-result-object v4

    .line 317
    .line 318
    .line 319
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 320
    move-result v4

    .line 321
    .line 322
    if-eq v3, v4, :cond_9

    .line 323
    .line 324
    .line 325
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 326
    move-result-object v2

    .line 327
    .line 328
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 332
    move-result-object v2

    .line 333
    add-int/2addr v3, v1

    .line 334
    .line 335
    .line 336
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 337
    move-result-object v1

    .line 338
    move-object v2, v1

    .line 339
    .line 340
    check-cast v2, Lcom/jumio/core/data/ScanMode;

    .line 341
    .line 342
    .line 343
    :cond_9
    invoke-virtual {v0, v2}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->initExtractionAndOverlay()V

    .line 347
    .line 348
    sget-object v0, Lcom/jumio/sdk/enums/JumioScanUpdate;->FALLBACK:Lcom/jumio/sdk/enums/JumioScanUpdate;

    .line 349
    .line 350
    .line 351
    invoke-virtual {p0, v0, p1}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdate(Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;)V

    .line 352
    :cond_a
    :goto_3
    return-void
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

.method public final finish()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->finish()V

    .line 4
    .line 5
    iget-object v0, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/jumio/core/sensors/SensorProxy;->stop()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const-class v1, Lcom/jumio/core/models/AdditionalDataPointsModel;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    check-cast v0, Lcom/jumio/core/models/AdditionalDataPointsModel;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    const-string v2, "scanPart"

    .line 36
    .line 37
    .line 38
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingCountry()Ljava/lang/String;

    .line 48
    move-result-object v2

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v2, 0x0

    .line 51
    .line 52
    :goto_0
    if-eqz v2, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 56
    move-result v3

    .line 57
    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/jumio/core/models/SelectionModel;->getCountry()Lcom/jumio/core/data/country/Country;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    :cond_2
    iput-object v2, v0, Lcom/jumio/core/models/AdditionalDataPointsModel;->i:Ljava/lang/String;

    .line 73
    return-void
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

.method public final getExtractionPlugin(Lcom/jumio/core/data/ScanMode;)Lcom/jumio/core/plugins/ExtractionPlugin;
    .locals 2

    .line 1
    .line 2
    const-string v0, "scanMode"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 24
    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/Plugin;->isUsable(Lcom/jumio/core/Controller;)Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    check-cast v0, Lcom/jumio/core/data/ScanMode;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    check-cast p1, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 62
    return-object p1

    .line 63
    .line 64
    .line 65
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 76
    move-result v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 90
    move-result v1

    .line 91
    .line 92
    if-eq v0, v1, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    check-cast p1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    add-int/lit8 v0, v0, 0x1

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    check-cast p1, Lcom/jumio/core/data/ScanMode;

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-static {p1}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    .line 125
    invoke-interface {v0, v1}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    check-cast v0, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 129
    goto :goto_0
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

.method public final getFileDataForResolution(Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/core/extraction/result/ImageExtractionResult;Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/core/data/scan/FileDataInterface;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 3
    .line 4
    const-string v0, "scanPartModel"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "result"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string/jumbo v0, "uploadResolution"

    .line 16
    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/jumio/core/extraction/result/ImageExtractionResult;->getClassifier()Ljava/lang/String;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    if-eqz p2, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2, p3}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 37
    move-result-object p1

    .line 38
    return-object p1
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
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 24
    move-result v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eq v0, v1, :cond_0

    .line 41
    const/4 v0, 0x1

    .line 42
    return v0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    return v0
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

.method public final getMultipartItemsForResultKeys(Lcom/jumio/core/models/ApiCallDataModel;)Ljava/util/List;
    .locals 9

    .line 1
    .line 2
    const-string v0, "apiCallDataModel"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getScanPartId()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljumio/core/y2;->getPartForId(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getContentId()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    new-instance p1, Ljumio/core/a4;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-interface {v1}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v1, v0}, Ljumio/core/a4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 65
    move-result-object p1

    .line 66
    return-object p1

    .line 67
    .line 68
    .line 69
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSavedImages()Ljava/util/Map;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getContentId()Ljava/lang/String;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    if-eqz p1, :cond_a

    .line 83
    .line 84
    new-instance v1, Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    move-result v2

    .line 96
    .line 97
    if-eqz v2, :cond_8

    .line 98
    .line 99
    .line 100
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    check-cast v2, Ljumio/core/s3;

    .line 104
    .line 105
    iget-object v3, v2, Ljumio/core/s3;->a:Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;

    .line 109
    move-result-object v3

    .line 110
    const/4 v4, 0x0

    .line 111
    .line 112
    if-nez v3, :cond_3

    .line 113
    goto :goto_2

    .line 114
    .line 115
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 116
    .line 117
    .line 118
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 119
    .line 120
    sget-object v6, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v6}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 124
    move-result-object v6

    .line 125
    .line 126
    .line 127
    invoke-virtual {v6}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 128
    move-result v7

    .line 129
    .line 130
    if-eqz v7, :cond_4

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move-object v6, v4

    .line 133
    .line 134
    :goto_1
    if-eqz v6, :cond_5

    .line 135
    .line 136
    new-instance v7, Ljumio/core/a4;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6}, Lcom/jumio/core/data/scan/FileData;->getFileName()Ljava/lang/String;

    .line 140
    move-result-object v6

    .line 141
    .line 142
    iget-object v8, v2, Ljumio/core/s3;->a:Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    invoke-direct {v7, v6, v8}, Ljumio/core/a4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    :cond_5
    sget-object v6, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3, v6}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 158
    move-result v6

    .line 159
    .line 160
    if-eqz v6, :cond_6

    .line 161
    move-object v4, v3

    .line 162
    .line 163
    :cond_6
    if-eqz v4, :cond_7

    .line 164
    .line 165
    new-instance v3, Ljumio/core/a4;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getFileName()Ljava/lang/String;

    .line 169
    move-result-object v4

    .line 170
    .line 171
    iget-object v2, v2, Ljumio/core/s3;->a:Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    invoke-direct {v3, v4, v2}, Ljumio/core/a4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    :cond_7
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 181
    move-result-object v4

    .line 182
    .line 183
    :goto_2
    if-eqz v4, :cond_2

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 187
    goto :goto_0

    .line 188
    .line 189
    .line 190
    :cond_8
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    .line 191
    move-result-object p1

    .line 192
    .line 193
    if-nez p1, :cond_9

    .line 194
    goto :goto_3

    .line 195
    :cond_9
    return-object p1

    .line 196
    .line 197
    .line 198
    :cond_a
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 199
    move-result-object p1

    .line 200
    return-object p1
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

.method public final getRejectedImages()Ljava/util/Map;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljumio/core/y2;->getScanPartModelList()Ljava/util/List;

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
    if-eqz v2, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 26
    .line 27
    sget-object v3, Lcom/jumio/core/models/automation/AutomationModel$DecisionType;->REJECT:Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->firstImageDataMatchingDecision(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;)Lcom/jumio/commons/camera/ImageDataInterface;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    .line 45
    :goto_1
    if-eqz v2, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
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

.method public final getRejectedModels()Ljava/util/Map;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljumio/core/y2;->getScanPartModelList()Ljava/util/List;

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
    if-eqz v2, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 26
    .line 27
    sget-object v3, Lcom/jumio/core/models/automation/AutomationModel$DecisionType;->REJECT:Lcom/jumio/core/models/automation/AutomationModel$DecisionType;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->firstAutomationModelMatchingDecision(Lcom/jumio/core/models/automation/AutomationModel$DecisionType;)Lcom/jumio/core/models/automation/AutomationModel;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 41
    move-result-object v2

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    .line 45
    :goto_1
    if-eqz v2, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 53
    move-result-object v0

    .line 54
    return-object v0
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

.method public final getShouldEnableUsability()Z
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
    .line 17
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/jumio/core/models/SettingsModel;->getAutomationMaxRetries()I

    .line 22
    move-result v1

    .line 23
    .line 24
    if-ge v0, v1, :cond_0

    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

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

.method public final getShouldUseShader()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Ljumio/core/S2;->w:Z

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
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final handleChallenge(Lcom/jumio/commons/camera/CaptureSettings;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "captureSettings"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/commons/camera/CaptureSettings;->getStartChallenge()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v1, Lcom/jumio/sdk/enums/JumioFallbackReason;->USER_ACTION:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    :cond_0
    sget-object v1, Lcom/jumio/sdk/enums/JumioFallbackReason;->LOW_PERFORMANCE:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleChallenge(Lcom/jumio/commons/camera/CaptureSettings;)V

    .line 39
    return-void
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
.end method

.method public final handleFlash(Lcom/jumio/sdk/enums/JumioFlashState;Z)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "flashState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getScanView()Lcom/jumio/core/views/CameraScanView;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/core/views/CameraScanView;->getHasFlash()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    .line 21
    :goto_0
    if-nez v0, :cond_1

    .line 22
    goto :goto_1

    .line 23
    .line 24
    :cond_1
    sget-object v0, Lcom/jumio/sdk/enums/JumioFlashState;->ON:Lcom/jumio/sdk/enums/JumioFlashState;

    .line 25
    .line 26
    if-ne p1, v0, :cond_2

    .line 27
    .line 28
    iget-object v0, p0, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    .line 29
    .line 30
    sget-object v1, Lcom/jumio/sdk/enums/JumioFallbackReason;->USER_ACTION:Lcom/jumio/sdk/enums/JumioFallbackReason;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 34
    move-result v2

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleFlash(Lcom/jumio/sdk/enums/JumioFlashState;Z)V

    .line 43
    :cond_3
    :goto_1
    return-void
.end method

.method public final handleShotTaken(Lcom/jumio/core/extraction/result/ExtractionResult;Lcom/jumio/analytics/MetaInfo;Z)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    iget-object v3, v1, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    new-instance v3, Lcom/jumio/analytics/MetaInfo;

    .line 14
    .line 15
    .line 16
    invoke-direct {v3}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 17
    .line 18
    if-eqz v0, :cond_7

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    .line 22
    move-result-object v4

    .line 23
    .line 24
    if-eqz v4, :cond_7

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/jumio/core/extraction/result/ExtractionResult;->getSide()Ljava/lang/String;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v5}, Ljumio/core/y2;->getPartForSide(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    .line 32
    move-result-object v5

    .line 33
    .line 34
    check-cast v5, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 35
    .line 36
    if-nez v5, :cond_0

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-virtual {v5, v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    .line 41
    move-result-object v6

    .line 42
    .line 43
    instance-of v7, v6, Lcom/jumio/core/data/image/ImageResult;

    .line 44
    const/4 v8, 0x0

    .line 45
    .line 46
    if-eqz v7, :cond_1

    .line 47
    move-object v7, v6

    .line 48
    .line 49
    check-cast v7, Lcom/jumio/core/data/image/ImageResult;

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v7, v8

    .line 52
    .line 53
    :goto_0
    if-eqz v7, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Lcom/jumio/core/data/image/ImageResult;->getData()Lcom/jumio/commons/camera/a;

    .line 57
    move-result-object v7

    .line 58
    .line 59
    if-eqz v7, :cond_2

    .line 60
    .line 61
    iget-object v9, v7, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7, v9}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 65
    move-result-object v7

    .line 66
    .line 67
    .line 68
    invoke-virtual {v7}, Lcom/jumio/commons/camera/ImageData;->getMetadata()Lcom/jumio/commons/camera/ImageMetadata;

    .line 69
    move-result-object v7

    .line 70
    .line 71
    if-eqz v7, :cond_2

    .line 72
    .line 73
    const-string v9, "classifier"

    .line 74
    .line 75
    .line 76
    invoke-virtual {v3, v9, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7}, Lcom/jumio/commons/camera/ImageMetadata;->getFlash()Z

    .line 80
    move-result v4

    .line 81
    .line 82
    .line 83
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    const-string v9, "flash"

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v9, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    instance-of v4, v7, Lcom/jumio/commons/camera/ImageMetadata$Tilted;

    .line 92
    .line 93
    if-eqz v4, :cond_2

    .line 94
    .line 95
    check-cast v7, Lcom/jumio/commons/camera/ImageMetadata$Tilted;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7}, Lcom/jumio/commons/camera/ImageMetadata$Tilted;->getAngle()I

    .line 99
    move-result v4

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    const-string v7, "angle"

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, v7, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    :cond_2
    instance-of v4, v0, Lcom/jumio/core/extraction/result/DataExtractionResult;

    .line 111
    .line 112
    if-eqz v4, :cond_3

    .line 113
    move-object v4, v0

    .line 114
    .line 115
    check-cast v4, Lcom/jumio/core/extraction/result/DataExtractionResult;

    .line 116
    goto :goto_1

    .line 117
    :cond_3
    move-object v4, v8

    .line 118
    .line 119
    :goto_1
    if-eqz v4, :cond_6

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/jumio/core/extraction/result/DataExtractionResult;->getData()Lcom/jumio/core/data/scan/DataInterface;

    .line 123
    move-result-object v4

    .line 124
    .line 125
    if-eqz v4, :cond_6

    .line 126
    .line 127
    instance-of v7, v4, Lcom/jumio/core/data/scan/ByteArrayData;

    .line 128
    .line 129
    if-eqz v7, :cond_6

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSavedImages()Ljava/util/Map;

    .line 133
    move-result-object v7

    .line 134
    move-object v9, v0

    .line 135
    .line 136
    check-cast v9, Lcom/jumio/core/extraction/result/DataExtractionResult;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v9}, Lcom/jumio/core/extraction/result/DataExtractionResult;->getBatchId()Ljava/lang/String;

    .line 140
    move-result-object v10

    .line 141
    .line 142
    if-nez v10, :cond_4

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9}, Lcom/jumio/core/extraction/result/DataExtractionResult;->getClassifier()Ljava/lang/String;

    .line 146
    move-result-object v10

    .line 147
    .line 148
    .line 149
    :cond_4
    invoke-interface {v7, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    move-result-object v11

    .line 151
    .line 152
    if-nez v11, :cond_5

    .line 153
    .line 154
    new-instance v11, Ljava/util/ArrayList;

    .line 155
    .line 156
    .line 157
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 158
    .line 159
    .line 160
    invoke-interface {v7, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    :cond_5
    check-cast v11, Ljava/util/List;

    .line 163
    .line 164
    new-instance v7, Ljumio/core/s3;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v9}, Lcom/jumio/core/extraction/result/DataExtractionResult;->getClassifier()Ljava/lang/String;

    .line 168
    move-result-object v9

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 172
    move-result-object v10

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10}, Lcom/jumio/core/Controller;->getScopeProvider()Lcom/jumio/core/scope/ScopeProviderInterface;

    .line 176
    move-result-object v10

    .line 177
    .line 178
    .line 179
    invoke-interface {v10}, Lcom/jumio/core/scope/ScopeProviderInterface;->getBackgroundScope()Lkotlinx/coroutines/m0;

    .line 180
    move-result-object v12

    .line 181
    .line 182
    new-instance v15, Ljumio/core/R2;

    .line 183
    .line 184
    .line 185
    invoke-direct {v15, v6, v4, v8}, Ljumio/core/R2;-><init>(Lcom/jumio/core/data/scan/ScanResult;Lcom/jumio/core/data/scan/DataInterface;Lkotlin/coroutines/Continuation;)V

    .line 186
    .line 187
    const/16 v16, 0x3

    .line 188
    .line 189
    const/16 v17, 0x0

    .line 190
    const/4 v13, 0x0

    .line 191
    const/4 v14, 0x0

    .line 192
    .line 193
    .line 194
    invoke-static/range {v12 .. v17}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 195
    move-result-object v4

    .line 196
    .line 197
    .line 198
    invoke-direct {v7, v9, v4}, Ljumio/core/s3;-><init>(Ljava/lang/String;Lkotlinx/coroutines/x1;)V

    .line 199
    .line 200
    .line 201
    invoke-interface {v11, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    :cond_6
    iget-object v4, v1, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 204
    monitor-enter v4

    .line 205
    .line 206
    :try_start_0
    iget-object v6, v1, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 210
    move-result-object v7

    .line 211
    .line 212
    iget v8, v1, Ljumio/core/S2;->t:I

    .line 213
    .line 214
    .line 215
    invoke-virtual {v6, v7, v8}, Lcom/jumio/core/sensors/SensorProxy;->collectResult(Lcom/jumio/sdk/credentials/JumioCredential;I)Ljumio/core/G3;

    .line 216
    move-result-object v6

    .line 217
    .line 218
    .line 219
    invoke-virtual {v5, v6}, Lcom/jumio/core/models/ScanPartModel;->setSensorData(Ljumio/core/G3;)V

    .line 220
    .line 221
    iget-object v5, v1, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5}, Lcom/jumio/core/sensors/SensorProxy;->reset()V

    .line 225
    .line 226
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 227
    monitor-exit v4

    .line 228
    goto :goto_2

    .line 229
    :catchall_0
    move-exception v0

    .line 230
    monitor-exit v4

    .line 231
    throw v0

    .line 232
    .line 233
    :cond_7
    :goto_2
    if-eqz v2, :cond_8

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3, v2}, Ljava/util/TreeMap;->putAll(Ljava/util/Map;)V

    .line 237
    .line 238
    :cond_8
    move/from16 v2, p3

    .line 239
    .line 240
    .line 241
    invoke-super {v1, v0, v3, v2}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleShotTaken(Lcom/jumio/core/extraction/result/ExtractionResult;Lcom/jumio/analytics/MetaInfo;Z)V

    .line 242
    return-void
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
.end method

.method public final handleUploadOrUsabilityResult(Lcom/jumio/core/models/ApiCallDataModel;Lcom/jumio/core/models/automation/AutomationModel;)V
    .locals 2

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
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getScanPartId()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljumio/core/y2;->getPartForId(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    goto :goto_1

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getContentId()Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSavedImages()Ljava/util/Map;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Ljava/util/List;

    .line 38
    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    move-result v1

    .line 48
    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    check-cast v1, Ljumio/core/s3;

    .line 56
    .line 57
    iget-object v1, v1, Ljumio/core/s3;->a:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataUploaded(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    :goto_1
    return-void

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {v0, p1, p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataUploaded(Ljava/lang/String;Lcom/jumio/core/models/automation/AutomationModel;)Lkotlin/Unit;

    .line 66
    return-void
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
.end method

.method public final handleUsabilityReject(Ljava/util/Map;)V
    .locals 11

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
    invoke-virtual {p0}, Ljumio/core/y2;->getScanPartModelList()Ljava/util/List;

    .line 9
    move-result-object v0

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
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    move-result v1

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    .line 26
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 27
    .line 28
    const-string v3, "401"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->firstAutomationModelMatchingRejectReasonCode(Ljava/lang/String;)Lcom/jumio/core/models/automation/AutomationModel;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    if-eqz v2, :cond_0

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    .line 38
    :goto_0
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    goto :goto_2

    .line 42
    .line 43
    .line 44
    :cond_2
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    goto :goto_2

    .line 49
    .line 50
    .line 51
    :cond_3
    invoke-virtual {p0}, Ljumio/core/y2;->getScanPartModelList()Ljava/util/List;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    const/16 v0, 0xa

    .line 55
    .line 56
    .line 57
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 58
    move-result v0

    .line 59
    .line 60
    .line 61
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 62
    move-result v0

    .line 63
    .line 64
    const/16 v1, 0x10

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 68
    move-result v0

    .line 69
    .line 70
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 71
    .line 72
    .line 73
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    move-result v0

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    .line 86
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 93
    move-result-object v10

    .line 94
    .line 95
    const/16 v8, 0x1f

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v3, 0x0

    .line 98
    const/4 v4, 0x0

    .line 99
    const/4 v5, 0x0

    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x0

    .line 102
    .line 103
    .line 104
    invoke-static/range {v2 .. v9}, Lcom/jumio/core/models/automation/AutomationModel;->copy$default(Lcom/jumio/core/models/automation/AutomationModel;Lcom/jumio/core/models/automation/AutomationModel$DecisionType;Lcom/jumio/core/models/automation/RejectReason;Lcom/jumio/core/models/automation/ExtractedData;Ljava/lang/String;Lcom/jumio/core/models/automation/NfcProperties;ILjava/lang/Object;)Lcom/jumio/core/models/automation/AutomationModel;

    .line 105
    move-result-object v3

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setAutomationModel(Lcom/jumio/core/models/automation/AutomationModel;)V

    .line 109
    .line 110
    .line 111
    invoke-static {v10, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 116
    move-result-object v3

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    goto :goto_1

    .line 125
    :cond_4
    move-object p1, v1

    .line 126
    .line 127
    .line 128
    :goto_2
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->handleUsabilityReject(Ljava/util/Map;)V

    .line 129
    return-void
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

.method public onResult(Lcom/jumio/core/model/StaticModel;)V
    .locals 2
    .param p1    # Lcom/jumio/core/model/StaticModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 2
    instance-of v0, p1, Lcom/jumio/core/models/DocumentDataModel;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    move-object v1, p1

    check-cast v1, Lcom/jumio/core/models/DocumentDataModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDocumentData(Lcom/jumio/core/models/DocumentDataModel;)V

    .line 4
    :cond_0
    invoke-super {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V
    .locals 1
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
    invoke-super {p0, p1, p2}, Lcom/jumio/core/scanpart/JVisionScanPart;->onResult(Lcom/jumio/core/models/ApiCallDataModel;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getCall()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Lcom/jumio/core/api/calls/UsabilityCall;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 7
    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getScanPartId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljumio/core/y2;->getPartForId(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    move-result-object p2

    check-cast p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz p2, :cond_2

    .line 8
    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/jumio/core/models/ApiCallDataModel;->getContentId()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getAutomationModel()Lcom/jumio/core/models/automation/AutomationModel;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/jumio/core/models/automation/AutomationModel;->getExtractedData()Lcom/jumio/core/models/automation/ExtractedData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/models/automation/ExtractedData;->isNfcChipUnlockDataComplete()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/jumio/core/models/automation/AutomationModel;->getNfcProperties()Lcom/jumio/core/models/automation/NfcProperties;

    move-result-object v0

    invoke-virtual {v0}, Lcom/jumio/core/models/automation/NfcProperties;->available()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    new-instance v0, Lcom/jumio/core/models/MrzDataModel;

    invoke-direct {v0}, Lcom/jumio/core/models/MrzDataModel;-><init>()V

    invoke-virtual {p1}, Lcom/jumio/core/models/automation/AutomationModel;->getExtractedData()Lcom/jumio/core/models/automation/ExtractedData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/jumio/core/models/MrzDataModel;->setFromExtractedData(Lcom/jumio/core/models/automation/ExtractedData;)V

    .line 12
    invoke-virtual {p2, v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDocumentData(Lcom/jumio/core/models/DocumentDataModel;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/model/StaticModel;

    invoke-virtual {p0, p1}, Ljumio/core/S2;->onResult(Lcom/jumio/core/model/StaticModel;)V

    return-void
.end method

.method public onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V
    .locals 16
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

    move-object/from16 v0, p0

    const-string/jumbo v1, "update"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getState()Ljava/lang/Integer;

    move-result-object v1

    .line 3
    sget-object v3, Lcom/jumio/core/extraction/ExtractionUpdateState;->Companion:Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;

    invoke-virtual {v3}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getSkipImage()I

    move-result v4

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v4, :cond_2

    .line 4
    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.jumio.core.extraction.result.ExtractionResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/jumio/core/extraction/result/ExtractionResult;

    .line 5
    invoke-virtual {v1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getSide()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljumio/core/y2;->getPartForSide(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    invoke-virtual {v2, v3, v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 6
    :cond_1
    invoke-virtual {v1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getSide()Ljava/lang/String;

    move-result-object v2

    .line 7
    invoke-virtual {v0, v2}, Ljumio/core/y2;->getPartForSide(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz v2, :cond_e

    .line 8
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_GZIP"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    invoke-virtual {v2, v1, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    return-void

    .line 9
    :cond_2
    :goto_0
    invoke-virtual {v3}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getTilt()I

    move-result v4

    const/4 v5, 0x0

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v4, :cond_7

    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    .line 10
    instance-of v3, v1, Lcom/jumio/sdk/data/JumioTiltState;

    if-eqz v3, :cond_6

    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.jumio.sdk.data.JumioTiltState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/jumio/sdk/data/JumioTiltState;

    .line 11
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getScanView()Lcom/jumio/core/views/CameraScanView;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/jumio/core/views/CameraScanView;->getHasFlash()Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v6, v2

    goto :goto_1

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_5

    .line 12
    sget-object v2, Lcom/jumio/core/views/a;->a:Lcom/jumio/core/views/a;

    invoke-virtual {v6, v2}, Lcom/jumio/core/views/CameraScanView;->registerUserActionOverride$jumio_core_release(Lcom/jumio/core/views/a;)V

    .line 13
    :cond_5
    iget-object v2, v0, Ljumio/core/S2;->v:Ljava/util/ArrayList;

    sget-object v3, Lcom/jumio/sdk/enums/JumioFallbackReason;->USER_ACTION:Lcom/jumio/sdk/enums/JumioFallbackReason;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    sget-object v2, Lcom/jumio/sdk/enums/JumioScanUpdate;->TILT:Lcom/jumio/sdk/enums/JumioScanUpdate;

    invoke-virtual {v0, v2, v1}, Lcom/jumio/core/scanpart/ScanPart;->sendUpdate(Lcom/jumio/sdk/enums/JumioScanUpdate;Ljava/lang/Object;)V

    return-void

    .line 15
    :cond_6
    instance-of v1, v1, Lcom/jumio/sdk/enums/JumioFlashState;

    if-eqz v1, :cond_e

    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.jumio.sdk.enums.JumioFlashState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/jumio/sdk/enums/JumioFlashState;

    invoke-virtual {v0, v1, v5}, Ljumio/core/S2;->handleFlash(Lcom/jumio/sdk/enums/JumioFlashState;Z)V

    return-void

    .line 16
    :cond_7
    :goto_2
    invoke-virtual {v3}, Lcom/jumio/core/extraction/ExtractionUpdateState$Companion;->getDocumentClassified()I

    move-result v3

    if-nez v1, :cond_8

    goto/16 :goto_f

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v3, :cond_1e

    .line 17
    invoke-interface {v2}, Lcom/jumio/core/extraction/ExtractionUpdateInterface;->getData()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.jumio.core.data.document.ClassifiedDocument"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/jumio/core/data/document/ClassifiedDocument;

    invoke-virtual {v1}, Lcom/jumio/core/data/document/ClassifiedDocument;->component1()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/jumio/core/data/document/ClassifiedDocument;->component2()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v1

    .line 18
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/core/models/SettingsModel;->getSkipDocTypeSelection()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSettingsModel()Lcom/jumio/core/models/SettingsModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/jumio/core/models/SettingsModel;->getDocClassifierOverride()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 19
    :cond_9
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    move-result-object v3

    instance-of v3, v3, Lcom/jumio/sdk/credentials/JumioIDCredential;

    if-nez v3, :cond_a

    goto :goto_5

    .line 20
    :cond_a
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    move-result-object v3

    check-cast v3, Lcom/jumio/sdk/credentials/JumioIDCredential;

    invoke-virtual {v3}, Lcom/jumio/sdk/credentials/JumioIDCredential;->getCountrySelection$jumio_core_release()Ljumio/core/A0;

    move-result-object v3

    check-cast v3, Ljumio/core/z0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    const-string v4, "countryCode"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {v3, v2}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    move-result-object v4

    if-nez v4, :cond_b

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    goto :goto_3

    .line 23
    :cond_b
    invoke-virtual {v3, v4}, Ljumio/core/z0;->a(Lcom/jumio/core/data/country/Country;)Ljava/util/ArrayList;

    move-result-object v3

    .line 24
    :goto_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    .line 25
    invoke-virtual {v7}, Lcom/jumio/sdk/document/JumioPhysicalDocument;->getType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v7

    if-ne v7, v1, :cond_c

    goto :goto_4

    :cond_d
    const/4 v4, 0x0

    .line 26
    :goto_4
    check-cast v4, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    if-nez v4, :cond_f

    :cond_e
    :goto_5
    return-void

    .line 27
    :cond_f
    const-class v1, Ljumio/core/S2;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getSimpleName(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "Setting re-classified configuration"

    invoke-static {v1, v3}, Lcom/jumio/commons/log/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    move-result-object v1

    check-cast v1, Lcom/jumio/sdk/credentials/JumioIDCredential;

    invoke-virtual {v1}, Lcom/jumio/sdk/credentials/JumioIDCredential;->getScanPartConfigurator$jumio_core_release()Ljumio/core/P1;

    move-result-object v1

    .line 29
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    move-result-object v3

    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v3

    .line 30
    check-cast v1, Ljumio/core/O1;

    invoke-virtual {v1, v2, v4}, Ljumio/core/O1;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)V

    .line 31
    iget-object v2, v1, Ljumio/core/O1;->b:Ljumio/core/A0;

    check-cast v2, Ljumio/core/z0;

    invoke-virtual {v2}, Ljumio/core/z0;->b()Lcom/jumio/core/models/SelectionModel;

    move-result-object v2

    if-nez v2, :cond_10

    goto/16 :goto_c

    .line 32
    :cond_10
    instance-of v4, v2, Lcom/jumio/core/models/PhysicalSelectionModel;

    if-eqz v4, :cond_17

    check-cast v2, Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 33
    new-array v4, v5, [Lkotlin/Pair;

    .line 34
    invoke-static {v4}, Lkotlin/collections/MapsKt;->sortedMapOf([Lkotlin/Pair;)Ljava/util/SortedMap;

    move-result-object v4

    .line 35
    invoke-virtual {v2}, Lcom/jumio/core/models/PhysicalSelectionModel;->getVariant()Lcom/jumio/core/data/document/DocumentVariant;

    move-result-object v7

    invoke-virtual {v7}, Lcom/jumio/core/data/document/DocumentVariant;->getParts()Ljava/util/List;

    move-result-object v7

    .line 36
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/jumio/core/data/document/DocumentPart;

    .line 37
    iget-object v9, v1, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 38
    iget-object v9, v9, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 39
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz v10, :cond_11

    check-cast v9, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    goto :goto_7

    :cond_11
    const/4 v9, 0x0

    .line 40
    :goto_7
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v10

    if-eqz v9, :cond_16

    .line 41
    iget-object v11, v1, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v11}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v11

    const-class v12, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v11, v12}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v11

    check-cast v11, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v11}, Lcom/jumio/core/models/SettingsModel;->getAutomaticBarcodeExtraction()Z

    move-result v11

    if-eqz v11, :cond_13

    .line 42
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v11

    sget-object v13, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    invoke-interface {v11, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_13

    .line 43
    iget-object v11, v1, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v11}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    move-result-object v11

    sget-object v13, Ljumio/core/W2;->e:Ljumio/core/W2;

    invoke-interface {v11, v13}, Lcom/jumio/core/plugins/PluginRegistryInterface;->hasPlugin(Ljumio/core/W2;)Z

    move-result v11

    if-eqz v11, :cond_13

    .line 44
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v11

    .line 45
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 46
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_12
    :goto_8
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_14

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lcom/jumio/core/data/ScanMode;

    .line 47
    sget-object v6, Lcom/jumio/core/data/ScanMode;->PDF417:Lcom/jumio/core/data/ScanMode;

    if-eq v15, v6, :cond_12

    .line 48
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 49
    :cond_13
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v13

    .line 50
    :cond_14
    iget-object v6, v1, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v6}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v6

    invoke-virtual {v6, v12}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v6

    check-cast v6, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v6}, Lcom/jumio/core/models/SettingsModel;->getAutomaticBarcodeExtraction()Z

    move-result v6

    if-eqz v6, :cond_15

    .line 51
    invoke-virtual {v8}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v6

    sget-object v8, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    invoke-interface {v6, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 52
    iget-object v6, v1, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v6}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    move-result-object v6

    sget-object v11, Ljumio/core/W2;->e:Ljumio/core/W2;

    invoke-interface {v6, v11}, Lcom/jumio/core/plugins/PluginRegistryInterface;->hasPlugin(Ljumio/core/W2;)Z

    move-result v6

    if-eqz v6, :cond_15

    .line 53
    sget-object v6, Lcom/jumio/core/data/ScanMode;->PDF417:Lcom/jumio/core/data/ScanMode;

    invoke-static {v8, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    goto :goto_9

    .line 54
    :cond_15
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v6

    .line 55
    :goto_9
    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/jumio/core/data/ScanMode;

    invoke-virtual {v9, v8}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 56
    invoke-virtual {v9, v2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setSelectionModel(Lcom/jumio/core/models/PhysicalSelectionModel;)V

    .line 57
    invoke-virtual {v9, v13}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setExtraction(Ljava/util/List;)V

    .line 58
    invoke-virtual {v9, v6}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setSubExtraction(Ljava/util/Map;)V

    goto :goto_a

    .line 59
    :cond_16
    invoke-virtual {v1, v8, v2}, Ljumio/core/O1;->a(Lcom/jumio/core/data/document/DocumentPart;Lcom/jumio/core/models/PhysicalSelectionModel;)Lcom/jumio/core/models/PhysicalIdScanPartModel;

    move-result-object v9

    .line 60
    :goto_a
    invoke-interface {v4, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_6

    .line 61
    :cond_17
    instance-of v4, v2, Lcom/jumio/core/models/DigitalSelectionModel;

    if-eqz v4, :cond_1d

    check-cast v2, Lcom/jumio/core/models/DigitalSelectionModel;

    .line 62
    invoke-virtual {v2}, Lcom/jumio/core/models/DigitalSelectionModel;->getDigitalDocumentType()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getParts()Ljava/util/List;

    move-result-object v4

    const/16 v5, 0xa

    .line 63
    invoke-static {v4, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 64
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 65
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 66
    check-cast v5, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;

    .line 67
    sget-object v7, Lcom/jumio/sdk/enums/JumioCredentialPart;->DIGITAL:Lcom/jumio/sdk/enums/JumioCredentialPart;

    new-instance v8, Lcom/jumio/core/models/DigitalIdScanPartModel;

    invoke-virtual {v5}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->getExtraction()Lcom/jumio/core/data/ScanMode;

    move-result-object v5

    invoke-direct {v8, v5, v2}, Lcom/jumio/core/models/DigitalIdScanPartModel;-><init>(Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/DigitalSelectionModel;)V

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 68
    invoke-virtual {v5}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v6, v7, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :cond_18
    move-object v4, v6

    .line 69
    :cond_19
    iget-object v1, v1, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 70
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 71
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 72
    invoke-interface {v1, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 73
    :goto_c
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    move-result-object v1

    .line 74
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 75
    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 77
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1a
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 78
    check-cast v4, Lcom/jumio/core/models/ScanPartModel;

    .line 79
    instance-of v5, v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    if-eqz v5, :cond_1b

    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    goto :goto_e

    :cond_1b
    const/4 v4, 0x0

    :goto_e
    if-eqz v4, :cond_1a

    .line 80
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 81
    :cond_1c
    invoke-virtual {v0, v2, v3}, Ljumio/core/y2;->updateScanPartModelList(Ljava/util/List;Lcom/jumio/sdk/enums/JumioCredentialPart;)V

    return-void

    .line 82
    :cond_1d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 83
    :cond_1e
    :goto_f
    invoke-super/range {p0 .. p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void
.end method

.method public bridge synthetic onUpdate(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/jumio/core/extraction/ExtractionUpdateInterface;

    invoke-virtual {p0, p1}, Ljumio/core/S2;->onUpdate(Lcom/jumio/core/extraction/ExtractionUpdateInterface;)V

    return-void
.end method

.method public final persist(Z)V
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
    iget-object p1, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final reset()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/jumio/core/data/ScanMode;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-interface {v2, v3}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    check-cast v2, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 42
    .line 43
    :goto_0
    if-eqz v2, :cond_1

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    invoke-interface {v2, v3}, Lcom/jumio/core/plugins/Plugin;->isUsable(Lcom/jumio/core/Controller;)Z

    .line 51
    move-result v3

    .line 52
    .line 53
    if-nez v3, :cond_0

    .line 54
    goto :goto_1

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    check-cast v1, Lcom/jumio/core/data/ScanMode;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/ScanPartModel;->setMode(Lcom/jumio/core/data/ScanMode;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 74
    const/4 v1, 0x0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDocumentData(Lcom/jumio/core/models/DocumentDataModel;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSavedImages()Ljava/util/Map;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 85
    .line 86
    iget-object v0, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 87
    monitor-enter v0

    .line 88
    .line 89
    :try_start_0
    iget-object v1, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/jumio/core/sensors/SensorProxy;->reset()V

    .line 93
    .line 94
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    monitor-exit v0

    .line 96
    .line 97
    .line 98
    invoke-super {p0}, Ljumio/core/y2;->reset()V

    .line 99
    return-void

    .line 100
    :catchall_0
    move-exception v1

    .line 101
    monitor-exit v0

    .line 102
    throw v1

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 106
    move-result-object v2

    .line 107
    .line 108
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 116
    move-result v2

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 120
    move-result-object v3

    .line 121
    .line 122
    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    .line 130
    move-result v3

    .line 131
    .line 132
    if-eq v2, v3, :cond_2

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 136
    move-result-object v1

    .line 137
    .line 138
    check-cast v1, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getExtraction()Ljava/util/List;

    .line 142
    move-result-object v1

    .line 143
    .line 144
    add-int/lit8 v2, v2, 0x1

    .line 145
    .line 146
    .line 147
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    check-cast v1, Lcom/jumio/core/data/ScanMode;

    .line 151
    .line 152
    .line 153
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 154
    move-result-object v2

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 158
    move-result-object v2

    .line 159
    .line 160
    .line 161
    invoke-static {v1}, Lcom/jumio/core/scanpart/ScanPartKt;->getPluginModule(Lcom/jumio/core/data/ScanMode;)Ljumio/core/W2;

    .line 162
    move-result-object v3

    .line 163
    .line 164
    .line 165
    invoke-interface {v2, v3}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    check-cast v2, Lcom/jumio/core/plugins/ExtractionPlugin;

    .line 169
    goto :goto_0
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
.end method

.method public final restore()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->restore()V

    .line 4
    .line 5
    iget-object v0, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

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
.end method

.method public final start()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->start()V

    .line 4
    .line 5
    iget-object v0, p0, Ljumio/core/S2;->u:Lcom/jumio/core/sensors/SensorProxy;

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
.end method

.method public final uploadExtractionResult(Lcom/jumio/core/extraction/result/ExtractionResult;)V
    .locals 10

    .line 1
    .line 2
    const-string v0, "result"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getSide()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljumio/core/y2;->getPartForSide(Ljava/lang/String;)Lcom/jumio/core/models/ScanPartModel;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_7

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Ljumio/core/S2;->getShouldEnableUsability()Z

    .line 23
    move-result v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/jumio/core/models/ScanPartModel;->setUsability(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    const-string/jumbo v2, "toUpperCase(...)"

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 46
    move-result-object v2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 50
    move-result-object v2

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    sget-object v1, Lcom/jumio/core/data/scan/DataState;->SAVED:Lcom/jumio/core/data/scan/DataState;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1, v1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    instance-of p1, p1, Lcom/jumio/commons/camera/ImageDataInterface;

    .line 72
    .line 73
    if-eqz p1, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    const-string v1, "null cannot be cast to non-null type com.jumio.commons.camera.ImageDataInterface"

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    check-cast p1, Lcom/jumio/commons/camera/ImageDataInterface;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/jumio/core/scanpart/JVisionScanPart;->addCameraData(Lcom/jumio/commons/camera/ImageDataInterface;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v1, v0}, Lcom/jumio/core/api/BackendManager;->uploadPart(Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;)V

    .line 103
    return-void

    .line 104
    .line 105
    .line 106
    :cond_2
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getBatchId()Ljava/lang/String;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    if-eqz v1, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/JVisionScanPart;->getSavedImages()Ljava/util/Map;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    move-result-object v1

    .line 118
    .line 119
    check-cast v1, Ljava/util/List;

    .line 120
    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 124
    .line 125
    .line 126
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    .line 133
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    move-result v3

    .line 135
    .line 136
    if-eqz v3, :cond_5

    .line 137
    .line 138
    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    check-cast v3, Ljumio/core/s3;

    .line 143
    .line 144
    iget-object v3, v3, Ljumio/core/s3;->a:Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 148
    move-result-object v3

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 152
    move-result-object v4

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 156
    move-result-object v3

    .line 157
    .line 158
    .line 159
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    goto :goto_0

    .line 161
    .line 162
    :cond_3
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    .line 165
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 166
    goto :goto_1

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    .line 170
    move-result-object v1

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 174
    move-result-object v1

    .line 175
    .line 176
    .line 177
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 178
    move-result-object v1

    .line 179
    .line 180
    .line 181
    invoke-static {v1}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 182
    move-result-object v2

    .line 183
    .line 184
    .line 185
    :cond_5
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 186
    move-result-object v1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 190
    move-result-object v1

    .line 191
    .line 192
    const-class v3, Lcom/jumio/core/models/UploadSettingsModel;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v3}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 196
    move-result-object v1

    .line 197
    .line 198
    check-cast v1, Lcom/jumio/core/models/UploadSettingsModel;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/jumio/core/models/UploadSettingsModel;->getUploadImageResolution()Lcom/jumio/core/enums/UploadResolution;

    .line 202
    move-result-object v1

    .line 203
    .line 204
    .line 205
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 206
    move-result-object v3

    .line 207
    .line 208
    .line 209
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 210
    move-result-object v3

    .line 211
    .line 212
    .line 213
    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    move-result v4

    .line 215
    const/4 v5, 0x0

    .line 216
    .line 217
    if-eqz v4, :cond_e

    .line 218
    .line 219
    .line 220
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    move-result-object v4

    .line 222
    .line 223
    check-cast v4, Ljava/util/Map$Entry;

    .line 224
    .line 225
    .line 226
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 227
    move-result-object v6

    .line 228
    .line 229
    instance-of v7, v6, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 230
    .line 231
    if-eqz v7, :cond_7

    .line 232
    move-object v5, v6

    .line 233
    .line 234
    check-cast v5, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 235
    .line 236
    :cond_7
    if-eqz v5, :cond_6

    .line 237
    .line 238
    .line 239
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 240
    move-result-object v6

    .line 241
    .line 242
    check-cast v6, Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v6}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;

    .line 246
    move-result-object v5

    .line 247
    .line 248
    if-eqz v5, :cond_6

    .line 249
    .line 250
    const-string v6, "<this>"

    .line 251
    .line 252
    .line 253
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    const-string/jumbo v7, "uploadImageResolution"

    .line 257
    .line 258
    .line 259
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    sget-object v6, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v5, v6}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 271
    move-result-object v7

    .line 272
    .line 273
    .line 274
    invoke-virtual {v7}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 275
    move-result v7

    .line 276
    .line 277
    if-eqz v7, :cond_8

    .line 278
    move-object v7, v6

    .line 279
    goto :goto_3

    .line 280
    .line 281
    :cond_8
    sget-object v7, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v5, v7}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 285
    move-result-object v8

    .line 286
    .line 287
    .line 288
    invoke-virtual {v8}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 289
    move-result v8

    .line 290
    .line 291
    if-eqz v8, :cond_9

    .line 292
    goto :goto_3

    .line 293
    .line 294
    :cond_9
    sget-object v8, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5, v8}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 298
    move-result-object v9

    .line 299
    .line 300
    .line 301
    invoke-virtual {v9}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 302
    move-result v9

    .line 303
    .line 304
    if-eqz v9, :cond_a

    .line 305
    move-object v7, v8

    .line 306
    .line 307
    :cond_a
    :goto_3
    if-ne v1, v7, :cond_b

    .line 308
    goto :goto_4

    .line 309
    .line 310
    :cond_b
    sget-object v8, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    .line 311
    .line 312
    if-ne v7, v8, :cond_c

    .line 313
    move-object v7, v8

    .line 314
    goto :goto_4

    .line 315
    .line 316
    :cond_c
    if-ne v7, v6, :cond_d

    .line 317
    .line 318
    sget-object v7, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 319
    goto :goto_4

    .line 320
    .line 321
    :cond_d
    sget-object v7, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 322
    .line 323
    .line 324
    :goto_4
    invoke-virtual {v5, v7}, Lcom/jumio/commons/camera/a;->b(Lcom/jumio/core/enums/UploadResolution;)V

    .line 325
    .line 326
    iget-object v6, v5, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5, v6}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 330
    move-result-object v5

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 334
    move-result v5

    .line 335
    .line 336
    if-nez v5, :cond_6

    .line 337
    .line 338
    .line 339
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 340
    move-result-object v4

    .line 341
    .line 342
    check-cast v4, Ljava/lang/String;

    .line 343
    .line 344
    sget-object v5, Lcom/jumio/core/data/scan/DataState;->SKIPPED:Lcom/jumio/core/data/scan/DataState;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v4, v5}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 348
    .line 349
    goto/16 :goto_2

    .line 350
    .line 351
    .line 352
    :cond_e
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 353
    move-result v1

    .line 354
    .line 355
    if-nez v1, :cond_15

    .line 356
    .line 357
    .line 358
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 359
    move-result v1

    .line 360
    .line 361
    if-eqz v1, :cond_f

    .line 362
    .line 363
    goto/16 :goto_7

    .line 364
    .line 365
    .line 366
    :cond_f
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 367
    move-result-object v1

    .line 368
    .line 369
    .line 370
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 371
    move-result-object v1

    .line 372
    .line 373
    .line 374
    :cond_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 375
    move-result v3

    .line 376
    .line 377
    if-eqz v3, :cond_15

    .line 378
    .line 379
    .line 380
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 381
    move-result-object v3

    .line 382
    .line 383
    check-cast v3, Ljava/util/Map$Entry;

    .line 384
    .line 385
    .line 386
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    move-result-object v4

    .line 388
    .line 389
    instance-of v6, v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 390
    .line 391
    if-eqz v6, :cond_11

    .line 392
    .line 393
    check-cast v4, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 394
    goto :goto_5

    .line 395
    :cond_11
    move-object v4, v5

    .line 396
    .line 397
    :goto_5
    if-eqz v4, :cond_10

    .line 398
    .line 399
    .line 400
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 401
    move-result-object v3

    .line 402
    .line 403
    check-cast v3, Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v4, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;

    .line 407
    move-result-object v3

    .line 408
    .line 409
    if-eqz v3, :cond_10

    .line 410
    .line 411
    iget-object v4, v3, Lcom/jumio/commons/camera/a;->b:Lcom/jumio/core/enums/UploadResolution;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v3, v4}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    .line 415
    move-result-object v3

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    .line 419
    move-result v3

    .line 420
    const/4 v4, 0x1

    .line 421
    .line 422
    if-ne v3, v4, :cond_10

    .line 423
    .line 424
    .line 425
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 426
    move-result-object v1

    .line 427
    .line 428
    const-string v3, "<get-keys>(...)"

    .line 429
    .line 430
    .line 431
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 435
    move-result-object v1

    .line 436
    .line 437
    .line 438
    :cond_12
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    move-result v3

    .line 440
    .line 441
    if-eqz v3, :cond_13

    .line 442
    .line 443
    .line 444
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    move-result-object v3

    .line 446
    .line 447
    check-cast v3, Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 451
    .line 452
    sget-object v4, Lcom/jumio/core/data/scan/DataState;->SAVED:Lcom/jumio/core/data/scan/DataState;

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v3, v4}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->setDataState(Ljava/lang/String;Lcom/jumio/core/data/scan/DataState;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageDataForClassifier(Ljava/lang/String;)Lcom/jumio/commons/camera/a;

    .line 459
    move-result-object v3

    .line 460
    .line 461
    if-eqz v3, :cond_12

    .line 462
    .line 463
    .line 464
    invoke-virtual {p0, v3}, Lcom/jumio/core/scanpart/JVisionScanPart;->addCameraData(Lcom/jumio/commons/camera/ImageDataInterface;)V

    .line 465
    goto :goto_6

    .line 466
    .line 467
    .line 468
    :cond_13
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getController()Lcom/jumio/core/Controller;

    .line 469
    move-result-object v1

    .line 470
    .line 471
    .line 472
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getBackendManager()Lcom/jumio/core/api/BackendManager;

    .line 473
    move-result-object v1

    .line 474
    .line 475
    .line 476
    invoke-virtual {p0}, Lcom/jumio/core/scanpart/ScanPart;->getCredential()Lcom/jumio/sdk/credentials/JumioCredential;

    .line 477
    move-result-object v3

    .line 478
    .line 479
    .line 480
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getId()Ljava/lang/String;

    .line 481
    move-result-object v0

    .line 482
    .line 483
    .line 484
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getBatchId()Ljava/lang/String;

    .line 485
    move-result-object v4

    .line 486
    .line 487
    if-nez v4, :cond_14

    .line 488
    .line 489
    .line 490
    invoke-virtual {p1}, Lcom/jumio/core/extraction/result/ExtractionResult;->getClassifier()Ljava/lang/String;

    .line 491
    move-result-object v4

    .line 492
    .line 493
    .line 494
    :cond_14
    invoke-virtual {v1, v3, v2, v0, v4}, Lcom/jumio/core/api/BackendManager;->uploadRawData(Lcom/jumio/sdk/credentials/JumioCredential;Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    :cond_15
    :goto_7
    return-void
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
