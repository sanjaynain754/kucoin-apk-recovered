.class public final Lcom/jumio/core/models/FlashSettings$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/FlashSettings;
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
        "Lcom/jumio/core/models/FlashSettings$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/FlashSettings;",
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
        "SMAP\nSupplementalImageModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupplementalImageModel.kt\ncom/jumio/core/models/FlashSettings$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"
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
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/FlashSettings;
    .locals 11
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "json"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "detection"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v1, Lcom/jumio/core/models/FlashDetection;->Companion:Lcom/jumio/core/models/FlashDetection$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lcom/jumio/core/models/FlashDetection$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/FlashDetection;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    new-instance v1, Lcom/jumio/core/models/FlashDetection;

    .line 24
    const/4 v6, 0x3

    .line 25
    const/4 v7, 0x0

    .line 26
    .line 27
    const-wide/16 v2, 0x0

    .line 28
    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    .line 32
    invoke-direct/range {v1 .. v7}, Lcom/jumio/core/models/FlashDetection;-><init>(DJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    move-object v0, v1

    .line 34
    .line 35
    :cond_1
    const-string v1, "adaption"

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    sget-object v2, Lcom/jumio/core/models/FlashAdaption;->Companion:Lcom/jumio/core/models/FlashAdaption$Companion;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v1}, Lcom/jumio/core/models/FlashAdaption$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/FlashAdaption;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    :cond_2
    new-instance v2, Lcom/jumio/core/models/FlashAdaption;

    .line 52
    const/4 v9, 0x7

    .line 53
    const/4 v10, 0x0

    .line 54
    .line 55
    const-wide/16 v3, 0x0

    .line 56
    .line 57
    const-wide/16 v5, 0x0

    .line 58
    .line 59
    const-wide/16 v7, 0x0

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v2 .. v10}, Lcom/jumio/core/models/FlashAdaption;-><init>(DJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    move-object v1, v2

    .line 64
    .line 65
    :cond_3
    const-string v2, "minimumCaptureTime"

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    const-wide v3, 0x3fd999999999999aL    # 0.4

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 74
    move-result-wide v2

    .line 75
    .line 76
    const/16 p1, 0x3e8

    .line 77
    int-to-double v4, p1

    .line 78
    mul-double/2addr v2, v4

    .line 79
    double-to-long v2, v2

    .line 80
    .line 81
    new-instance p1, Lcom/jumio/core/models/FlashSettings;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1, v0, v1, v2, v3}, Lcom/jumio/core/models/FlashSettings;-><init>(Lcom/jumio/core/models/FlashDetection;Lcom/jumio/core/models/FlashAdaption;J)V

    .line 85
    return-object p1
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
