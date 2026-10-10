.class public final Lcom/jumio/core/models/DocfinderSettingsModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/DocfinderSettingsModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/jumio/core/models/DocfinderSettingsModel$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/DocfinderSettingsModel;",
        "jsonObject",
        "Lorg/json/JSONObject;",
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


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/DocfinderSettingsModel;
    .locals 16
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    const-string v1, "jsonObject"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    new-instance v2, Lcom/jumio/core/models/DocfinderSettingsModel;

    .line 10
    .line 11
    const-string v1, "frameRateThreshold"

    .line 12
    const/4 v3, 0x4

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 16
    move-result v3

    .line 17
    .line 18
    const-string v1, "samplingTimeInMs"

    .line 19
    .line 20
    .line 21
    const-wide/32 v4, 0x3b9aca00

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v4, v5}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 25
    move-result-wide v4

    .line 26
    .line 27
    const-string v1, "violationLimit"

    .line 28
    const/4 v6, 0x3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 32
    move-result v6

    .line 33
    .line 34
    const-string v1, "modelInitTimeoutInMs"

    .line 35
    .line 36
    const-wide/16 v7, 0x1388

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1, v7, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 40
    move-result-wide v7

    .line 41
    .line 42
    const-string v1, "rotationTolerance"

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    const-wide v9, 0x3fd65718eb895076L    # 0.349066

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v9, v10}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 51
    move-result-wide v9

    .line 52
    .line 53
    const-string v1, "minAllowedRatio"

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const-wide v11, 0x3fe4cccccccccccdL    # 0.65

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1, v11, v12}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 62
    move-result-wide v11

    .line 63
    .line 64
    new-instance v13, Lcom/jumio/commons/camera/Size;

    .line 65
    .line 66
    const-string v1, "minDetectionWidth"

    .line 67
    .line 68
    const/16 v14, 0x200

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1, v14}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 72
    move-result v1

    .line 73
    .line 74
    const-string v14, "minDetectionHeight"

    .line 75
    .line 76
    const/16 v15, 0x143

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v14, v15}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 80
    move-result v0

    .line 81
    .line 82
    .line 83
    invoke-direct {v13, v1, v0}, Lcom/jumio/commons/camera/Size;-><init>(II)V

    .line 84
    .line 85
    .line 86
    invoke-direct/range {v2 .. v13}, Lcom/jumio/core/models/DocfinderSettingsModel;-><init>(IJIJDDLcom/jumio/commons/camera/Size;)V

    .line 87
    return-object v2
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
