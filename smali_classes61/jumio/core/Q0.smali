.class public final Ljumio/core/Q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljumio/core/X3;


# instance fields
.field public final a:Lcom/jumio/core/persistence/DataManager;

.field public final b:Ljumio/core/I0;

.field public final c:Lorg/json/JSONArray;

.field public final d:Lorg/json/JSONArray;

.field public e:Z

.field public final f:Lcom/jumio/analytics/MetaInfo;

.field public g:Ljumio/core/U3;


# direct methods
.method public constructor <init>(Lcom/jumio/core/persistence/DataManager;Ljumio/core/I0;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "dataManager"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dataAccessEncryption"

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
    iput-object p1, p0, Ljumio/core/Q0;->a:Lcom/jumio/core/persistence/DataManager;

    .line 16
    .line 17
    iput-object p2, p0, Ljumio/core/Q0;->b:Ljumio/core/I0;

    .line 18
    .line 19
    new-instance p1, Lorg/json/JSONArray;

    .line 20
    .line 21
    .line 22
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 23
    .line 24
    iput-object p1, p0, Ljumio/core/Q0;->c:Lorg/json/JSONArray;

    .line 25
    .line 26
    new-instance p1, Lorg/json/JSONArray;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 30
    .line 31
    iput-object p1, p0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    .line 32
    .line 33
    new-instance p1, Lcom/jumio/analytics/MetaInfo;

    .line 34
    .line 35
    .line 36
    invoke-direct {p1}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 37
    .line 38
    iput-object p1, p0, Ljumio/core/Q0;->f:Lcom/jumio/analytics/MetaInfo;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final a(Ljava/lang/String;Lorg/json/JSONObject;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    const-string v0, "resolution"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v1}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 120
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 121
    :cond_0
    new-instance v0, Llg0/u;

    invoke-direct {v0}, Llg0/u;-><init>()V

    const-string v1, "riskSignals"

    invoke-static {p1, v1, v0}, Lcom/jumio/core/util/JsonUtilKt;->getOrPut(Lorg/json/JSONObject;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    .line 122
    const-string v0, "installationId"

    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Ljumio/core/Q0;Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)Lkotlin/Unit;
    .locals 1

    const-string v0, "metaData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    instance-of v0, p2, Lcom/jumio/commons/camera/ImageDataInterface;

    if-eqz v0, :cond_0

    .line 107
    move-object v0, p2

    check-cast v0, Lcom/jumio/commons/camera/ImageDataInterface;

    invoke-virtual {p0, v0}, Ljumio/core/Q0;->a(Lcom/jumio/commons/camera/ImageDataInterface;)V

    .line 108
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljumio/core/Q0;->a(Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)V

    .line 109
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a()Lorg/json/JSONObject;
    .locals 1

    .line 124
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public static final b(Ljumio/core/Q0;Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "metaData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "fileData"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    instance-of v0, p2, Lcom/jumio/commons/camera/ImageDataInterface;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    move-object v0, p2

    .line 16
    .line 17
    check-cast v0, Lcom/jumio/commons/camera/ImageDataInterface;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljumio/core/Q0;->a(Lcom/jumio/commons/camera/ImageDataInterface;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1, p2}, Ljumio/core/Q0;->a(Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)V

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p0
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
.method public final a(Lcom/jumio/commons/camera/ImageDataInterface;)V
    .locals 3

    .line 62
    iget-object v0, p0, Ljumio/core/Q0;->f:Lcom/jumio/analytics/MetaInfo;

    .line 63
    invoke-interface {p1}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v1, "toLowerCase(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "camera"

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    iget-object p1, p0, Ljumio/core/Q0;->a:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/models/UploadSettingsModel;

    invoke-virtual {p1, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/UploadSettingsModel;

    .line 65
    invoke-virtual {p1}, Lcom/jumio/core/models/UploadSettingsModel;->getUploadImageResolution()Lcom/jumio/core/enums/UploadResolution;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "actualResolution"

    invoke-virtual {v0, v2, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    iget-object p1, p0, Ljumio/core/Q0;->a:Lcom/jumio/core/persistence/DataManager;

    invoke-virtual {p1, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/jumio/core/models/UploadSettingsModel;

    .line 67
    invoke-virtual {p1}, Lcom/jumio/core/models/UploadSettingsModel;->getRequestedImageResolution()Lcom/jumio/core/enums/UploadResolution;

    move-result-object p1

    invoke-virtual {p1}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "requestedResolution"

    invoke-virtual {v0, v1, p1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/core/models/PhysicalIdScanPartModel;Lcom/jumio/core/data/scan/FileDataInterface;Z)V
    .locals 11

    .line 1
    iget-object v0, p0, Ljumio/core/Q0;->a:Lcom/jumio/core/persistence/DataManager;

    const-class v1, Lcom/jumio/core/models/UploadSettingsModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/UploadSettingsModel;

    .line 2
    invoke-virtual {v0}, Lcom/jumio/core/models/UploadSettingsModel;->getUploadImageResolution()Lcom/jumio/core/enums/UploadResolution;

    move-result-object v0

    .line 3
    const-string v1, "<this>"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "uploadImageResolution"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    instance-of v1, p3, Lcom/jumio/commons/camera/a;

    if-eqz v1, :cond_2

    .line 5
    move-object v2, p3

    check-cast v2, Lcom/jumio/commons/camera/a;

    .line 6
    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v2, v3}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v2, v3}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    sget-object v4, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    invoke-virtual {v2, v4}, Lcom/jumio/commons/camera/a;->a(Lcom/jumio/core/enums/UploadResolution;)Lcom/jumio/commons/camera/ImageData;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jumio/core/data/scan/FileData;->getHasData()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v3, v4

    goto :goto_0

    .line 9
    :cond_2
    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    :cond_3
    :goto_0
    if-ne v0, v3, :cond_4

    goto :goto_1

    .line 10
    :cond_4
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->DEBUG:Lcom/jumio/core/enums/UploadResolution;

    if-ne v3, v0, :cond_5

    move-object v3, v0

    goto :goto_1

    .line 11
    :cond_5
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    if-ne v3, v0, :cond_6

    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    goto :goto_1

    .line 12
    :cond_6
    sget-object v3, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    .line 13
    :goto_1
    sget-object v0, Lcom/jumio/core/enums/UploadResolution;->UHD:Lcom/jumio/core/enums/UploadResolution;

    const/4 v2, 0x1

    const/4 v4, 0x0

    if-ne v3, v0, :cond_7

    move v0, v2

    goto :goto_2

    :cond_7
    move v0, v4

    :goto_2
    iput-boolean v0, p0, Ljumio/core/Q0;->e:Z

    .line 14
    new-instance v0, Llg0/w;

    invoke-direct {v0, p0}, Llg0/w;-><init>(Ljumio/core/Q0;)V

    const/4 v5, 0x0

    if-eqz v1, :cond_8

    .line 15
    move-object v1, p3

    check-cast v1, Lcom/jumio/commons/camera/a;

    goto :goto_3

    :cond_8
    move-object v1, v5

    :goto_3
    if-eqz v1, :cond_9

    invoke-virtual {v1, v3}, Lcom/jumio/commons/camera/a;->b(Lcom/jumio/core/enums/UploadResolution;)V

    .line 16
    :cond_9
    invoke-interface {p3}, Lcom/jumio/core/data/scan/DataInterface;->getHasData()Z

    move-result v1

    const-string v6, "idType"

    const-string/jumbo v7, "uploadType"

    const-string v8, "multipartName"

    if-nez v1, :cond_a

    goto/16 :goto_a

    .line 17
    :cond_a
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 18
    invoke-interface {p3}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 19
    invoke-interface {p3}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileType()Ljava/lang/String;

    move-result-object v9

    const-string v10, "fileType"

    invoke-virtual {v1, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 20
    invoke-virtual {v1, v7, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 21
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    move-result-object v9

    if-eqz v9, :cond_b

    invoke-virtual {v9}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingCountry()Ljava/lang/String;

    move-result-object v9

    goto :goto_4

    :cond_b
    move-object v9, v5

    :goto_4
    if-eqz v9, :cond_c

    .line 22
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    move-object v9, v5

    :cond_d
    if-nez v9, :cond_e

    .line 23
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/core/models/SelectionModel;->getCountry()Lcom/jumio/core/data/country/Country;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    move-result-object v9

    .line 24
    :cond_e
    const-string v10, "country"

    invoke-virtual {v1, v10, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 25
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/core/models/PhysicalSelectionModel;->getPhysicalDocumentType()Lcom/jumio/core/data/document/PhysicalDocumentType;

    move-result-object v9

    invoke-virtual {v9}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v6, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    .line 26
    invoke-virtual {v3}, Lcom/jumio/core/enums/UploadResolution;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v9, "resolution"

    invoke-virtual {v1, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v1

    const-string/jumbo v3, "usabilityExpected"

    if-eqz p4, :cond_f

    .line 27
    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getUsability()Z

    move-result v2

    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    goto :goto_7

    .line 28
    :cond_f
    invoke-virtual {p2, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->imageForClassifier(Ljava/lang/String;)Lcom/jumio/core/processor/ProcessorImage;

    move-result-object v9

    if-eqz v9, :cond_10

    invoke-interface {v9}, Lcom/jumio/core/processor/ProcessorImage;->getUsabilityExpected()Z

    move-result v9

    goto :goto_5

    :cond_10
    move v9, v4

    :goto_5
    if-eqz v9, :cond_11

    .line 29
    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getUsability()Z

    move-result v9

    if-eqz v9, :cond_11

    goto :goto_6

    :cond_11
    move v2, v4

    :goto_6
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 30
    :goto_7
    instance-of v2, p3, Lcom/jumio/commons/camera/ImageDataInterface;

    if-eqz v2, :cond_12

    move-object v2, p3

    check-cast v2, Lcom/jumio/commons/camera/ImageDataInterface;

    goto :goto_8

    :cond_12
    move-object v2, v5

    :goto_8
    if-eqz v2, :cond_17

    .line 31
    const-string v3, "FRONT_WITH_FLASH"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    const-string v3, "FRONT_CAMERA_CHALLENGE"

    const/4 v9, 0x2

    invoke-static {p1, v3, v4, v9, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    .line 32
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraPosition()Lcom/jumio/commons/camera/ImageData$CameraPosition;

    move-result-object v3

    if-eqz v3, :cond_14

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 33
    sget-object v4, Lcom/jumio/commons/camera/ImageData$CameraPosition;->FRONT:Lcom/jumio/commons/camera/ImageData$CameraPosition;

    if-ne v3, v4, :cond_13

    .line 34
    const-string v3, "front"

    goto :goto_9

    .line 35
    :cond_13
    const-string v3, "back"

    .line 36
    :goto_9
    const-string v4, "captureMode"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 37
    :cond_14
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getMetadata()Lcom/jumio/commons/camera/ImageMetadata;

    move-result-object v3

    if-eqz v3, :cond_15

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 38
    invoke-virtual {v3}, Lcom/jumio/commons/camera/ImageMetadata;->asJson()Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "fileMetaData"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 39
    :cond_15
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraDataModel()Lcom/jumio/core/camera/CameraDataModel;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    invoke-virtual {v3}, Lcom/jumio/core/camera/CameraDataModel;->getFrame()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object v4

    invoke-static {v4}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object v4

    const-string v9, "cls"

    invoke-virtual {v1, v9, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    invoke-virtual {v3}, Lcom/jumio/core/camera/CameraDataModel;->getSession()Lcom/jumio/core/camera/CameraStatistics;

    move-result-object v3

    invoke-static {v3}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraStatistics;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "clsm"

    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 42
    :cond_16
    invoke-interface {v2}, Lcom/jumio/commons/camera/ImageDataInterface;->getCameraConnectionData()Lcom/jumio/core/camera/CameraConnectionData;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v1}, Ljumio/core/R0;->a(Lcom/jumio/core/camera/CameraConnectionData;Lorg/json/JSONObject;)V

    .line 43
    :cond_17
    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getSensorData()Ljumio/core/G3;

    move-result-object v2

    if-eqz v2, :cond_18

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2, v1}, Ljumio/core/R0;->a(Ljumio/core/G3;Lorg/json/JSONObject;)V

    .line 44
    :cond_18
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, v1, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_a
    if-eqz p4, :cond_1e

    .line 45
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 46
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    move-result-object p4

    if-eqz p4, :cond_19

    invoke-virtual {p4, p3, p2}, Lcom/jumio/core/models/DocumentDataModel;->fillRequest(Lorg/json/JSONObject;Lcom/jumio/core/models/ScanPartModel;)V

    .line 47
    :cond_19
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    move-result-object p4

    invoke-virtual {p4}, Lcom/jumio/core/models/PhysicalSelectionModel;->getPhysicalDocumentType()Lcom/jumio/core/data/document/PhysicalDocumentType;

    move-result-object p4

    invoke-virtual {p4}, Lcom/jumio/core/data/document/PhysicalDocumentType;->getIdType()Lcom/jumio/sdk/document/JumioDocumentType;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, v6, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    move-result-object p4

    invoke-virtual {p4}, Lcom/jumio/core/models/PhysicalSelectionModel;->getVariant()Lcom/jumio/core/data/document/DocumentVariant;

    move-result-object p4

    invoke-virtual {p4}, Lcom/jumio/core/data/document/DocumentVariant;->getVariant()Lcom/jumio/sdk/document/JumioDocumentVariant;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p4

    const-string v0, "documentVariant"

    invoke-virtual {p3, v0, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getDocumentData()Lcom/jumio/core/models/DocumentDataModel;

    move-result-object p4

    if-eqz p4, :cond_1a

    invoke-virtual {p4}, Lcom/jumio/core/models/DocumentDataModel;->getIssuingCountry()Ljava/lang/String;

    move-result-object p4

    goto :goto_b

    :cond_1a
    move-object p4, v5

    :goto_b
    if-eqz p4, :cond_1c

    .line 50
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_c

    :cond_1b
    move-object v5, p4

    :cond_1c
    :goto_c
    if-nez v5, :cond_1d

    .line 51
    invoke-virtual {p2}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getSelectionModel()Lcom/jumio/core/models/PhysicalSelectionModel;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jumio/core/models/SelectionModel;->getCountry()Lcom/jumio/core/data/country/Country;

    move-result-object p2

    invoke-virtual {p2}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    move-result-object v5

    .line 52
    :cond_1d
    const-string p2, "issuingCountry"

    invoke-static {p3, p2, v5}, Lcom/jumio/core/util/JsonUtilKt;->putIfNotNullOrBlank(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    invoke-virtual {p3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo p3, "toString(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "data"

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    invoke-virtual {p4}, Lorg/json/JSONArray;->length()I

    move-result p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    .line 55
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p4

    .line 56
    const-string v0, "application/json; charset=UTF-8"

    invoke-static {p3, v0, p4}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p4

    const/4 v0, -0x1

    .line 57
    invoke-virtual {p0, p4, p2, v0}, Ljumio/core/Q0;->a([Ljava/lang/String;Ljava/io/Serializable;I)V

    .line 58
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 59
    invoke-virtual {p2, v8, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    invoke-virtual {p2, v7, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    iget-object p1, p0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    invoke-virtual {p1, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_1e
    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/core/models/ScanPartModel;)V
    .locals 6

    .line 70
    instance-of v0, p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    const-string/jumbo v1, "uploadType"

    const-string v2, "multipartName"

    if-eqz v0, :cond_5

    .line 71
    const-string v0, "BACKSIDE"

    const-string v3, "FACE"

    const-string v4, "FRONTSIDE"

    filled-new-array {v4, v0, v3}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    move-object v3, p2

    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    invoke-virtual {v3}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object v3

    goto :goto_0

    .line 73
    :cond_0
    move-object v3, p2

    check-cast v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    invoke-virtual {v3, p1}, Lcom/jumio/core/models/PhysicalIdScanPartModel;->scanResultForClassifier(Ljava/lang/String;)Lcom/jumio/core/data/scan/ScanResult;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lcom/jumio/core/data/scan/ScanResult;->getData()Lcom/jumio/core/data/scan/DataInterface;

    move-result-object v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_2

    goto/16 :goto_2

    .line 74
    :cond_2
    instance-of v4, v3, Lcom/jumio/core/data/scan/FileDataInterface;

    if-eqz v4, :cond_3

    check-cast p2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    check-cast v3, Lcom/jumio/core/data/scan/FileDataInterface;

    invoke-virtual {p0, p1, p2, v3, v0}, Ljumio/core/Q0;->a(Ljava/lang/String;Lcom/jumio/core/models/PhysicalIdScanPartModel;Lcom/jumio/core/data/scan/FileDataInterface;Z)V

    return-void

    .line 75
    :cond_3
    const-string p2, "_GZIP"

    invoke-static {p1, p2}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-interface {v3}, Lcom/jumio/core/data/scan/DataInterface;->getMimeType()Ljava/lang/String;

    move-result-object p2

    const-string v0, "application/x-gzip-compressed"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 77
    const-string p2, "_gzip"

    goto :goto_1

    .line 78
    :cond_4
    const-string p2, ""

    .line 79
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "data"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 80
    instance-of v0, v3, Lcom/jumio/core/data/scan/ByteArrayData;

    if-eqz v0, :cond_9

    .line 81
    check-cast v3, Lcom/jumio/core/data/scan/ByteArrayData;

    invoke-virtual {v3}, Lcom/jumio/core/data/scan/ByteArrayData;->getData()[B

    move-result-object v0

    .line 82
    array-length v4, v0

    .line 83
    invoke-virtual {v3}, Lcom/jumio/core/data/scan/ByteArrayData;->getMimeType()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2, v3, v4}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, -0x1

    .line 84
    invoke-virtual {p0, v3, v0, v4}, Ljumio/core/Q0;->a([Ljava/lang/String;Ljava/io/Serializable;I)V

    .line 85
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 86
    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    iget-object p1, p0, Ljumio/core/Q0;->d:Lorg/json/JSONArray;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-void

    .line 89
    :cond_5
    instance-of v0, p2, Lcom/jumio/core/models/DigitalIdScanPartModel;

    if-eqz v0, :cond_7

    .line 90
    move-object v0, p2

    check-cast v0, Lcom/jumio/core/models/DigitalIdScanPartModel;

    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getFileData()Lcom/jumio/core/data/scan/FileDataInterface;

    move-result-object p2

    new-instance v3, Llg0/t;

    invoke-direct {v3, p0}, Llg0/t;-><init>(Ljumio/core/Q0;)V

    .line 91
    invoke-interface {p2}, Lcom/jumio/core/data/scan/DataInterface;->getHasData()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    move-result-object v4

    sget-object v5, Lcom/jumio/core/data/ScanMode;->FILE:Lcom/jumio/core/data/ScanMode;

    if-eq v4, v5, :cond_6

    goto/16 :goto_2

    .line 92
    :cond_6
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 93
    invoke-virtual {v4, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 94
    invoke-interface {p2}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 95
    invoke-virtual {v0}, Lcom/jumio/core/models/DigitalIdScanPartModel;->getDocumentType()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getTitle()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "type"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 96
    invoke-virtual {v0}, Lcom/jumio/core/models/DigitalIdScanPartModel;->getCountry()Lcom/jumio/core/data/country/Country;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    move-result-object v1

    const-string v2, "country"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 97
    invoke-virtual {v0}, Lcom/jumio/core/models/DigitalIdScanPartModel;->getParts()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;

    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->getOptions()Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;->getFileType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "fileType"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 98
    invoke-virtual {v0}, Lcom/jumio/core/models/DigitalIdScanPartModel;->getParts()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;

    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->getOptions()Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

    move-result-object v1

    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;->getIdType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "docType"

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object p1

    .line 99
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getUsability()Z

    move-result v0

    const-string/jumbo v1, "usabilityExpected"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object p1

    .line 100
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v3, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 101
    :cond_7
    instance-of v0, p2, Lcom/jumio/core/models/LivenessScanPartModel;

    if-eqz v0, :cond_9

    .line 102
    check-cast p2, Lcom/jumio/core/models/LivenessScanPartModel;

    new-instance v0, Ljumio/core/N0;

    invoke-direct {v0, p0}, Ljumio/core/N0;-><init>(Ljumio/core/Q0;)V

    .line 103
    sget-object v1, Lcom/jumio/core/data/ScanMode;->JUMIO_LIVENESS:Lcom/jumio/core/data/ScanMode;

    sget-object v2, Lcom/jumio/core/data/ScanMode;->JUMIO_PREMIUM:Lcom/jumio/core/data/ScanMode;

    filled-new-array {v1, v2}, [Lcom/jumio/core/data/ScanMode;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 104
    invoke-virtual {p2}, Lcom/jumio/core/models/FaceScanPartModel;->getLivenessData()Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-virtual {p2}, Lcom/jumio/core/models/ScanPartModel;->getUsability()Z

    move-result p2

    invoke-static {v1, p1, p2, v0}, Ljumio/core/R0;->a(Lcom/jumio/core/extraction/liveness/extraction/LivenessDataModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-void

    .line 105
    :cond_8
    sget-object v1, Lcom/jumio/core/enums/UploadResolution;->FHD:Lcom/jumio/core/enums/UploadResolution;

    invoke-static {p2, p1, v1, v0}, Ljumio/core/R0;->a(Lcom/jumio/core/models/ScanPartModel;Ljava/lang/String;Lcom/jumio/core/enums/UploadResolution;Lkotlin/jvm/functions/Function2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_9
    :goto_2
    return-void
.end method

.method public final a(Lorg/json/JSONArray;)V
    .locals 3

    .line 116
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 117
    :cond_0
    invoke-static {}, Lcom/jumio/core/util/DeviceUtilKt;->getDeviceUtil()Lcom/jumio/core/interfaces/DeviceUtilInterface;

    move-result-object v0

    iget-object v1, p0, Ljumio/core/Q0;->b:Ljumio/core/I0;

    const-string v2, "null cannot be cast to non-null type android.content.Context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/jumio/core/interfaces/DeviceUtilInterface;->installationId(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 118
    new-instance v1, Llg0/v;

    invoke-direct {v1, v0}, Llg0/v;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v1}, Lcom/jumio/core/util/JsonUtilKt;->forEach(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final a(Lorg/json/JSONObject;Lcom/jumio/core/data/scan/FileDataInterface;)V
    .locals 2

    .line 110
    iget-object v0, p0, Ljumio/core/Q0;->c:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 111
    :try_start_0
    sget-object p1, Lcom/jumio/commons/utils/FileUtil;->INSTANCE:Lcom/jumio/commons/utils/FileUtil;

    invoke-interface {p2}, Lcom/jumio/core/data/scan/DataInterface;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Ljumio/core/Q0;->b:Ljumio/core/I0;

    invoke-interface {v1}, Ljumio/core/I0;->getSessionKey()Lcom/jumio/core/models/AuthorizationModel$SessionKey;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/jumio/commons/utils/FileUtil;->readFile(Ljava/lang/String;Lcom/jumio/core/models/AuthorizationModel$SessionKey;)[B

    move-result-object p1

    .line 112
    invoke-interface {p2}, Lcom/jumio/core/data/scan/FileDataInterface;->getFileName()Ljava/lang/String;

    move-result-object v0

    array-length v1, p1

    invoke-interface {p2}, Lcom/jumio/core/data/scan/DataInterface;->getMimeType()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, p2, v1}, Ljumio/core/V3;->a(Ljava/lang/String;Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p2

    const/4 v0, -0x1

    .line 113
    invoke-virtual {p0, p2, p1, v0}, Ljumio/core/Q0;->a([Ljava/lang/String;Ljava/io/Serializable;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 114
    const-string p2, "DefaultUploadProcessor"

    const-string v0, "Error adding file data"

    invoke-static {p2, v0, p1}, Lcom/jumio/commons/log/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 115
    throw p1
.end method

.method public final a([Ljava/lang/String;Ljava/io/Serializable;I)V
    .locals 1

    .line 68
    iget-object v0, p0, Ljumio/core/Q0;->g:Ljumio/core/U3;

    if-eqz v0, :cond_0

    .line 69
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljumio/core/U3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
