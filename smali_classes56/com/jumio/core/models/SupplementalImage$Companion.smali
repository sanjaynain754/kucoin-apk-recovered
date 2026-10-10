.class public final Lcom/jumio/core/models/SupplementalImage$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/SupplementalImage;
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
        "Lcom/jumio/core/models/SupplementalImage$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/SupplementalImage;",
        "json",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSupplementalImageModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupplementalImageModel.kt\ncom/jumio/core/models/SupplementalImage$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"
    }
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
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/SupplementalImage;
    .locals 17
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
    const-string v1, "json"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v1, "classifier"

    .line 10
    .line 11
    const-string v2, "N/A"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v4

    .line 16
    .line 17
    const-string v1, "optString(...)"

    .line 18
    .line 19
    .line 20
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    const-string v1, "flash"

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 27
    move-result v5

    .line 28
    .line 29
    const-string v1, "tilted"

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    sget-object v3, Lcom/jumio/core/models/TiltRange;->Companion:Lcom/jumio/core/models/TiltRange$Companion;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v1}, Lcom/jumio/core/models/TiltRange$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/TiltRange;

    .line 41
    move-result-object v1

    .line 42
    :goto_0
    move-object v6, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const/4 v1, 0x0

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :goto_1
    const-string v1, "usabilityExpected"

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 51
    move-result v7

    .line 52
    .line 53
    const-string v1, "holdStillTime"

    .line 54
    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 59
    move-result-wide v8

    .line 60
    .line 61
    const-string v1, "flashSettings"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    sget-object v1, Lcom/jumio/core/models/FlashSettings;->Companion:Lcom/jumio/core/models/FlashSettings$Companion;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0}, Lcom/jumio/core/models/FlashSettings$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/FlashSettings;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    if-nez v0, :cond_1

    .line 76
    goto :goto_2

    .line 77
    :cond_1
    move-object v10, v0

    .line 78
    goto :goto_3

    .line 79
    .line 80
    :cond_2
    :goto_2
    new-instance v10, Lcom/jumio/core/models/FlashSettings;

    .line 81
    const/4 v15, 0x7

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x0

    .line 86
    .line 87
    const-wide/16 v13, 0x0

    .line 88
    .line 89
    .line 90
    invoke-direct/range {v10 .. v16}, Lcom/jumio/core/models/FlashSettings;-><init>(Lcom/jumio/core/models/FlashDetection;Lcom/jumio/core/models/FlashAdaption;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 91
    .line 92
    :goto_3
    new-instance v3, Lcom/jumio/core/models/SupplementalImage;

    .line 93
    .line 94
    .line 95
    invoke-direct/range {v3 .. v10}, Lcom/jumio/core/models/SupplementalImage;-><init>(Ljava/lang/String;ZLcom/jumio/core/models/TiltRange;ZJLcom/jumio/core/models/FlashSettings;)V

    .line 96
    return-object v3
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
