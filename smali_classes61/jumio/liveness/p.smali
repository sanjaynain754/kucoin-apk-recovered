.class public abstract Ljumio/liveness/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/jumio/liveness/DaClient2$Event;Lcom/jumio/core/MobileContext;)Lcom/jumio/core/data/scan/FileData;
    .locals 5

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 79
    const-string v2, "liveness_blob"

    invoke-virtual {p0, v2}, Lcom/jumio/liveness/DaClient2$Event;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v2, p0, Ljava/nio/ByteBuffer;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast p0, Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_0
    move-object p0, v3

    :goto_0
    if-eqz p0, :cond_1

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "tmp_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 81
    new-instance v3, Ljava/io/File;

    sget-object v4, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    invoke-virtual {v4, p1}, Lcom/jumio/core/environment/Environment;->getDataDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 82
    sget-object v2, Lcom/jumio/commons/utils/FileUtil;->INSTANCE:Lcom/jumio/commons/utils/FileUtil;

    invoke-virtual {p1}, Lcom/jumio/core/MobileContext;->getSessionKey()Lcom/jumio/core/models/AuthorizationModel$SessionKey;

    move-result-object p1

    invoke-virtual {v2, p0, v3, p1}, Lcom/jumio/commons/utils/FileUtil;->saveToFile(Ljava/nio/ByteBuffer;Ljava/io/File;Lcom/jumio/core/models/AuthorizationModel$SessionKey;)Z

    .line 83
    new-instance p0, Lcom/jumio/core/data/scan/FileData;

    invoke-direct {p0}, Lcom/jumio/core/data/scan/FileData;-><init>()V

    .line 84
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getAbsolutePath(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/jumio/core/data/scan/FileData;->setData(Ljava/lang/String;)V

    .line 85
    const-string p1, "application/octet-stream"

    invoke-virtual {p0, p1}, Lcom/jumio/core/data/scan/FileData;->setMimeType(Ljava/lang/String;)V

    .line 86
    const-string p1, "DAT"

    invoke-virtual {p0, p1}, Lcom/jumio/core/data/scan/FileData;->setFileType(Ljava/lang/String;)V

    .line 87
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jumio/core/data/scan/FileData;->setTimestamp(Ljava/lang/Long;)V

    return-object p0

    :cond_1
    return-object v3
.end method

.method public static final a(Ljumio/liveness/B;)Lcom/jumio/liveness/StandardLivenessConfigurations;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Ljumio/liveness/B;->f:Lcom/jumio/core/data/ScanMode;

    .line 2
    sget-object v2, Lcom/jumio/core/data/ScanMode;->JUMIO_PREMIUM:Lcom/jumio/core/data/ScanMode;

    if-ne v1, v2, :cond_3

    .line 3
    iget-object v1, v0, Ljumio/liveness/B;->g:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 4
    iget-object v2, v0, Ljumio/liveness/B;->b:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 5
    iget-boolean v0, v0, Ljumio/liveness/B;->d:Z

    .line 6
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getDelayBetweenDistanceInMs()J

    move-result-wide v3

    long-to-int v11, v3

    .line 7
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getRequiredDistanceMovementRatio()D

    move-result-wide v3

    double-to-float v7, v3

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v3

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v3

    .line 10
    :goto_0
    invoke-virtual {v3}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getNormalizedNearFarCutOffPoint()D

    move-result-wide v3

    double-to-float v6, v3

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v3

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v3

    .line 13
    :goto_1
    invoke-virtual {v3}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getInitialFaceWidthRatioMin()D

    move-result-wide v3

    double-to-float v8, v3

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v0

    goto :goto_2

    .line 15
    :cond_2
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v0

    .line 16
    :goto_2
    invoke-virtual {v0}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getInitialFaceWidthRatioMax()D

    move-result-wide v3

    double-to-float v9, v3

    .line 17
    new-instance v12, Lcom/jumio/liveness/PoseCheckConfigurations;

    .line 18
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getMinimumPitch()I

    move-result v0

    int-to-float v13, v0

    .line 19
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaximumPitch()I

    move-result v0

    int-to-float v14, v0

    .line 20
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getMinimumYaw()I

    move-result v0

    int-to-float v15, v0

    .line 21
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaximumYaw()I

    move-result v0

    int-to-float v0, v0

    .line 22
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaxFaceCenterDifference()D

    move-result-wide v3

    double-to-float v3, v3

    move/from16 v16, v0

    move/from16 v17, v3

    .line 23
    invoke-direct/range {v12 .. v17}, Lcom/jumio/liveness/PoseCheckConfigurations;-><init>(FFFFF)V

    .line 24
    new-instance v13, Lcom/jumio/liveness/PhotinusConfigurations;

    .line 25
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel;->getHardwareLatency()I

    move-result v0

    .line 26
    invoke-direct {v13, v1, v0}, Lcom/jumio/liveness/PhotinusConfigurations;-><init>(Ljava/lang/String;I)V

    .line 27
    new-instance v5, Lcom/jumio/liveness/PremiumLivenessConfigurations;

    const/high16 v10, -0x40800000    # -1.0f

    invoke-direct/range {v5 .. v13}, Lcom/jumio/liveness/PremiumLivenessConfigurations;-><init>(FFFFFILcom/jumio/liveness/PoseCheckConfigurations;Lcom/jumio/liveness/PhotinusConfigurations;)V

    return-object v5

    .line 28
    :cond_3
    iget-object v1, v0, Ljumio/liveness/B;->b:Lcom/jumio/core/models/LivenessSettingsModel;

    .line 29
    iget-boolean v0, v0, Ljumio/liveness/B;->d:Z

    .line 30
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getDelayBetweenDistanceInMs()J

    move-result-wide v2

    long-to-int v10, v2

    .line 31
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getRequiredDistanceMovementRatio()D

    move-result-wide v2

    double-to-float v6, v2

    if-eqz v0, :cond_4

    .line 32
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v2

    goto :goto_3

    .line 33
    :cond_4
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v2

    .line 34
    :goto_3
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getNormalizedNearFarCutOffPoint()D

    move-result-wide v2

    double-to-float v5, v2

    if-eqz v0, :cond_5

    .line 35
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v2

    goto :goto_4

    .line 36
    :cond_5
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v2

    .line 37
    :goto_4
    invoke-virtual {v2}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getInitialFaceWidthRatioMin()D

    move-result-wide v2

    double-to-float v7, v2

    if-eqz v0, :cond_6

    .line 38
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getPortrait()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v0

    goto :goto_5

    .line 39
    :cond_6
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getLandscape()Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;

    move-result-object v0

    .line 40
    :goto_5
    invoke-virtual {v0}, Lcom/jumio/core/models/LivenessSettingsModel$LivenessOrientationSettingsModel;->getInitialFaceWidthRatioMax()D

    move-result-wide v2

    double-to-float v8, v2

    .line 41
    new-instance v11, Lcom/jumio/liveness/PoseCheckConfigurations;

    .line 42
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getMinimumPitch()I

    move-result v0

    int-to-float v12, v0

    .line 43
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaximumPitch()I

    move-result v0

    int-to-float v13, v0

    .line 44
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getMinimumYaw()I

    move-result v0

    int-to-float v14, v0

    .line 45
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaximumYaw()I

    move-result v0

    int-to-float v15, v0

    .line 46
    invoke-virtual {v1}, Lcom/jumio/core/models/LivenessSettingsModel;->getMaxFaceCenterDifference()D

    move-result-wide v0

    double-to-float v0, v0

    move/from16 v16, v0

    .line 47
    invoke-direct/range {v11 .. v16}, Lcom/jumio/liveness/PoseCheckConfigurations;-><init>(FFFFF)V

    .line 48
    new-instance v4, Lcom/jumio/liveness/StandardLivenessConfigurations;

    const/high16 v9, -0x40800000    # -1.0f

    invoke-direct/range {v4 .. v11}, Lcom/jumio/liveness/StandardLivenessConfigurations;-><init>(FFFFFILcom/jumio/liveness/PoseCheckConfigurations;)V

    return-object v4
.end method

.method public static final a(Lcom/jumio/liveness/DaClient2$Event;Lcom/jumio/core/MobileContext;Ljava/util/concurrent/ConcurrentHashMap;)[Lcom/jumio/commons/camera/ImageData;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    const-string v1, "best_image"

    invoke-virtual {p0, v1}, Lcom/jumio/liveness/DaClient2$Event;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, v3

    .line 51
    :goto_0
    invoke-virtual {p0}, Lcom/jumio/liveness/DaClient2$Event;->getAttributes()[Lkotlin/Pair;

    move-result-object v2

    .line 52
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 53
    array-length v5, v2

    const/4 v6, 0x0

    move v7, v6

    :goto_1
    if-ge v7, v5, :cond_2

    aget-object v8, v2, v7

    .line 54
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    new-instance v10, Lkotlin/text/Regex;

    const-string v11, "^liveness_[0-9]+$"

    invoke-direct {v10, v11}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 55
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 56
    :cond_2
    new-instance v2, Ljumio/liveness/o;

    invoke-direct {v2}, Ljumio/liveness/o;-><init>()V

    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    .line 57
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/Pair;

    .line 58
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "_type"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0, v5}, Lcom/jumio/liveness/DaClient2$Event;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_3

    check-cast v5, Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object v5, v3

    :goto_3
    if-nez v5, :cond_4

    goto :goto_2

    .line 59
    :cond_4
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/nio/ByteBuffer;

    if-eqz v8, :cond_5

    check-cast v7, Ljava/nio/ByteBuffer;

    goto :goto_4

    :cond_5
    move-object v7, v3

    :goto_4
    if-nez v7, :cond_6

    goto :goto_2

    .line 60
    :cond_6
    :try_start_0
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Adding "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/jumio/commons/log/Log;->v(Ljava/lang/String;)V

    .line 61
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_timestamp"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8}, Lcom/jumio/liveness/DaClient2$Event;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_7

    check-cast v8, Ljava/lang/String;

    goto :goto_5

    :catch_0
    move-exception v4

    goto/16 :goto_9

    :cond_7
    move-object v8, v3

    :goto_5
    if-eqz v8, :cond_8

    invoke-static {v8}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    goto :goto_6

    :cond_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 62
    :goto_6
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "tmp_"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    const-string v12, "liveness"

    invoke-static {v11, v12}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 63
    new-instance v11, Ljava/io/File;

    sget-object v12, Lcom/jumio/core/environment/Environment;->INSTANCE:Lcom/jumio/core/environment/Environment;

    invoke-virtual {v12, p1}, Lcom/jumio/core/environment/Environment;->getDataDirectory(Landroid/content/Context;)Ljava/io/File;

    move-result-object v12

    invoke-direct {v11, v12, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    sget-object v10, Lcom/jumio/commons/utils/FileUtil;->INSTANCE:Lcom/jumio/commons/utils/FileUtil;

    invoke-virtual {p1}, Lcom/jumio/core/MobileContext;->getSessionKey()Lcom/jumio/core/models/AuthorizationModel$SessionKey;

    move-result-object v12

    invoke-virtual {v10, v7, v11, v12}, Lcom/jumio/commons/utils/FileUtil;->saveToFile(Ljava/nio/ByteBuffer;Ljava/io/File;Lcom/jumio/core/models/AuthorizationModel$SessionKey;)Z

    .line 65
    new-instance v7, Lcom/jumio/liveness/image/LivenessImageData;

    invoke-direct {v7}, Lcom/jumio/liveness/image/LivenessImageData;-><init>()V

    .line 66
    invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v10

    const-string v11, "getAbsolutePath(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Lcom/jumio/core/data/scan/FileData;->setData(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v7, v5}, Lcom/jumio/core/data/scan/FileData;->setMimeType(Ljava/lang/String;)V

    .line 68
    const-string v10, "image/webp"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const-string v5, "WEBP"

    goto :goto_7

    .line 69
    :cond_9
    const-string v10, "image/jpeg"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const-string v5, "JPEG"

    goto :goto_7

    .line 70
    :cond_a
    const-string v5, ""

    .line 71
    :goto_7
    invoke-virtual {v7, v5}, Lcom/jumio/core/data/scan/FileData;->setFileType(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7, v4}, Lcom/jumio/liveness/image/LivenessImageData;->setBestSelfie(Z)V

    .line 73
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/jumio/core/data/scan/FileData;->setTimestamp(Ljava/lang/Long;)V

    if-eqz p2, :cond_b

    .line 74
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jumio/core/camera/CameraConnectionData;

    goto :goto_8

    :cond_b
    move-object v4, v3

    :goto_8
    invoke-virtual {v7, v4}, Lcom/jumio/commons/camera/ImageData;->setCameraConnectionData(Lcom/jumio/core/camera/CameraConnectionData;)V

    .line 75
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    .line 76
    :goto_9
    invoke-static {v4}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    goto/16 :goto_2

    .line 77
    :cond_c
    new-array p0, v6, [Lcom/jumio/commons/camera/ImageData;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lcom/jumio/commons/camera/ImageData;

    return-object p0
.end method

.method public static final a(Lcom/jumio/commons/camera/Frame$Metadata;F)[Lkotlin/Pair;
    .locals 5

    .line 88
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 89
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getIso()I

    move-result v1

    if-eqz v1, :cond_0

    .line 90
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getIso()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "iso"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getShutterSpeed()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_1

    .line 92
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getShutterSpeed()J

    move-result-wide v1

    long-to-float v1, v1

    const v2, 0x4e6e6b28    # 1.0E9f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    const-string v2, "exposure_time"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getAperture()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    goto :goto_0

    .line 94
    :cond_2
    invoke-virtual {p0}, Lcom/jumio/commons/camera/Frame$Metadata;->getAperture()F

    move-result p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    const-string v1, "f_number"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 95
    :goto_0
    invoke-static {}, Lcom/jumio/core/sensors/LightSensorKt;->getLIGHT_SENSOR_DEFAULT_VALUE()[F

    move-result-object p0

    const/4 v1, 0x0

    aget p0, p0, v1

    cmpg-float p0, p1, p0

    if-nez p0, :cond_3

    goto :goto_1

    .line 96
    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object p0

    const-string p1, "lux"

    invoke-static {p1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    :goto_1
    new-array p0, v1, [Lkotlin/Pair;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Lkotlin/Pair;

    return-object p0
.end method
