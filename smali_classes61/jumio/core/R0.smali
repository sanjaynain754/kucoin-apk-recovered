.class public abstract Ljumio/core/R0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()Lorg/json/JSONObject;
    .locals 1

    .line 57
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public static final a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;
    .locals 4

    .line 75
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 76
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getTimestamp()J

    move-result-wide v1

    const-string/jumbo v3, "t"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 77
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getLabel()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 78
    const-string v2, "l"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getSequence()Z

    move-result v1

    const-string/jumbo v2, "y"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 80
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getSequence()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 81
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getStart_time()J

    move-result-wide v1

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 82
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getCount()I

    move-result v1

    const-string v2, "p"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 83
    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraStatistics;->getDuration()J

    move-result-wide v1

    const-string p0, "q"

    invoke-virtual {v0, p0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    :cond_1
    return-object v0
.end method

.method public static final a(Lcom/jumio/core/camera/CameraConnectionData;Lorg/json/JSONObject;)V
    .locals 2

    .line 54
    const-string v0, "resolution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v1}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 55
    :cond_0
    new-instance v0, Llg0/x;

    invoke-direct {v0}, Llg0/x;-><init>()V

    const-string v1, "riskSignals"

    invoke-static {p1, v1, v0}, Lcom/jumio/core/util/JsonUtilKt;->getOrPut(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    .line 56
    new-instance v0, Lorg/json/JSONArray;

    invoke-virtual {p0}, Lcom/jumio/core/camera/CameraConnectionData;->getData()[Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/Object;)V

    const-string p0, "cameraStackTrace"

    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public static final a(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getFrames()[Lcom/jumio/commons/camera/ImageData;

    move-result-object v2

    const-string/jumbo v3, "usabilityExpected"

    const-string/jumbo v4, "uploadType"

    const-string v5, "fileType"

    const-string v6, "multipartName"

    if-eqz v2, :cond_5

    .line 2
    array-length v8, v2

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v9, v8, :cond_5

    aget-object v11, v2, v9

    add-int/lit8 v12, v10, 0x1

    .line 3
    new-instance v13, Lorg/json/JSONObject;

    invoke-direct {v13}, Lorg/json/JSONObject;-><init>()V

    .line 4
    invoke-virtual {v11}, Lcom/jumio/core/data/scan/FileData;->getFileName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v6, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v13

    .line 5
    invoke-virtual {v11}, Lcom/jumio/core/data/scan/FileData;->getFileType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v5, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v13

    .line 6
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v15, 0x5f

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v4, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v13

    move/from16 v14, p2

    .line 7
    invoke-virtual {v13, v3, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v13

    .line 8
    invoke-virtual {v11}, Lcom/jumio/commons/camera/ImageData;->getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;

    move-result-object v15

    if-eqz v15, :cond_1

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 9
    sget-object v7, Lcom/jumio/commons/camera/ImageData$CameraPosition;->FRONT:Lcom/jumio/commons/camera/ImageData$CameraPosition;

    if-ne v15, v7, :cond_0

    .line 10
    const-string v7, "front"

    goto :goto_1

    .line 11
    :cond_0
    const-string v7, "back"

    .line 12
    :goto_1
    const-string v15, "captureMode"

    invoke-virtual {v13, v15, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 13
    :cond_1
    invoke-virtual {v11}, Lcom/jumio/commons/camera/ImageData;->getUploadMetadata()Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_2

    .line 14
    const-string v15, "order"

    invoke-virtual {v7, v15, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 15
    const-string v10, "fileMetaData"

    invoke-virtual {v13, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 16
    :cond_2
    invoke-virtual {v11}, Lcom/jumio/commons/camera/ImageData;->getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {v7}, Lcom/jumio/core/camera/CameraDataModel;->getFrame()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object v10

    invoke-static {v10}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object v10

    const-string v15, "cls"

    invoke-virtual {v13, v15, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    invoke-virtual {v7}, Lcom/jumio/core/camera/CameraDataModel;->getSession()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object v7

    invoke-static {v7}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v10, "clsm"

    invoke-virtual {v13, v10, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 19
    :cond_3
    invoke-virtual {v11}, Lcom/jumio/commons/camera/ImageData;->getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7, v13}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraConnectionData;Lorg/json/JSONObject;)V

    .line 20
    :cond_4
    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, v13, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v9, v9, 0x1

    move v10, v12

    goto/16 :goto_0

    .line 21
    :cond_5
    invoke-virtual/range {p0 .. p0}, Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;->getBlob()Lcom/jumio/core/data/scan/FileData;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 22
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 23
    invoke-virtual {v2}, Lcom/jumio/core/data/scan/FileData;->getFileName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v6, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v6

    .line 24
    invoke-virtual {v2}, Lcom/jumio/core/data/scan/FileData;->getFileType()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v5, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v5

    .line 25
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_BLOB"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const/4 v4, 0x0

    .line 26
    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method public static final a(Lcom/jumio/core/models/ScanPartModel;Ljava/lang/String;Lcom/jumio/core/enums/UploadResolution;Lkotlin/jvm/functions/Function2;)V
    .locals 3

    .line 28
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/jumio/commons/camera/a;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/jumio/commons/camera/a;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0, p2}, Lcom/jumio/commons/camera/a;->b(Lcom/jumio/core/enums/UploadResolution;)V

    .line 29
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object p2

    invoke-interface {p2}, Lcom/jumio/core/data/scan/DataInterface;->getHasData()Z

    move-result p2

    if-nez p2, :cond_2

    return-void

    .line 30
    :cond_2
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 31
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multipartName"

    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    .line 32
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fileType"

    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p2

    .line 33
    const-string/jumbo v0, "uploadType"

    invoke-virtual {p2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 34
    instance-of p2, p0, Lcom/jumio/core/models/DocumentScanPartModel;

    if-eqz p2, :cond_3

    .line 35
    move-object p2, p0

    check-cast p2, Lcom/jumio/core/models/DocumentScanPartModel;

    .line 36
    iget-object v0, p2, Lcom/jumio/core/models/DocumentScanPartModel;->l:Ljava/lang/String;

    .line 37
    const-string v1, "country"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    iget-object p2, p2, Lcom/jumio/core/models/DocumentScanPartModel;->m:Lcom/jumio/core/data/document/Document;

    .line 39
    invoke-virtual {p2}, Lcom/jumio/core/data/document/Document;->getCode()Ljava/lang/String;

    move-result-object p2

    const-string v0, "docType"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 40
    :cond_3
    instance-of p2, p0, Lcom/jumio/core/models/FaceScanPartModel;

    if-eqz p2, :cond_4

    .line 41
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getUsability()Z

    move-result p2

    const-string/jumbo v0, "usabilityExpected"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_1

    :cond_4
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 42
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object p2

    instance-of v0, p2, Lcom/jumio/commons/camera/ImageDataInterface;

    if-eqz v0, :cond_5

    move-object v2, p2

    check-cast v2, Lcom/jumio/commons/camera/ImageDataInterface;

    :cond_5
    if-eqz v2, :cond_9

    .line 43
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;

    move-result-object p2

    if-eqz p2, :cond_7

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 44
    sget-object v0, Lcom/jumio/commons/camera/ImageData$CameraPosition;->FRONT:Lcom/jumio/commons/camera/ImageData$CameraPosition;

    if-ne p2, v0, :cond_6

    .line 45
    const-string p2, "front"

    goto :goto_2

    .line 46
    :cond_6
    const-string p2, "back"

    .line 47
    :goto_2
    const-string v0, "captureMode"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    :cond_7
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;

    move-result-object p2

    if-eqz p2, :cond_8

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p2}, Lcom/jumio/core/camera/CameraDataModel;->getFrame()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object v0

    invoke-static {v0}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "cls"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    invoke-virtual {p2}, Lcom/jumio/core/camera/CameraDataModel;->getSession()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object p2

    invoke-static {p2}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object p2

    const-string v0, "clsm"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 51
    :cond_8
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;

    move-result-object p2

    if-eqz p2, :cond_9

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2, p1}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraConnectionData;Lorg/json/JSONObject;)V

    .line 52
    :cond_9
    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getSensorData()Ljumio/core/G3;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {p2, p1}, Ljumio/core/R0;->a(Ljumio/core/G3;Lorg/json/JSONObject;)V

    .line 53
    :cond_a
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object p0

    invoke-interface {p3, p1, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final a(Ljumio/core/G3;Lorg/json/JSONObject;)V
    .locals 6

    .line 58
    const-string v0, "resolution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v1}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 59
    :cond_0
    new-instance v0, Llg0/y;

    invoke-direct {v0}, Llg0/y;-><init>()V

    const-string v1, "riskSignals"

    invoke-static {p1, v1, v0}, Lcom/jumio/core/util/JsonUtilKt;->getOrPut(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    .line 60
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 61
    iget-wide v1, p0, Ljumio/core/G3;->a:J

    .line 62
    new-instance v3, Ljava/text/SimpleDateFormat;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string/jumbo v5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    invoke-direct {v3, v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 63
    const-string v4, "UTC"

    invoke-static {v4}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 64
    new-instance v4, Ljava/util/Date;

    invoke-direct {v4, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 65
    const-string/jumbo v2, "startTime"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 66
    const-string v1, "credentialId"

    .line 67
    iget-object v2, p0, Ljumio/core/G3;->b:Ljava/lang/String;

    .line 68
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 69
    iget v1, p0, Ljumio/core/G3;->c:I

    .line 70
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "samplingIntervalMs"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    iget-object p0, p0, Ljumio/core/G3;->d:Ljava/util/ArrayList;

    .line 72
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljumio/core/J3;

    .line 73
    invoke-interface {v1}, Ljumio/core/J3;->getType()Lcom/jumio/core/sensors/SensorType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jumio/core/sensors/SensorType;->getUploadName()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    const-string v4, "getDefault(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "toLowerCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljumio/core/J3;->a()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 74
    :cond_1
    const-string p0, "sensorData"

    invoke-virtual {p1, p0, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method public static final b()Lorg/json/JSONObject;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lorg/json/JSONObject;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 6
    return-object v0
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
