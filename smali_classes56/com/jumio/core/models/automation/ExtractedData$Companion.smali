.class public final Lcom/jumio/core/models/automation/ExtractedData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/automation/ExtractedData;
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
        "Lcom/jumio/core/models/automation/ExtractedData$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/automation/ExtractedData;",
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
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/automation/ExtractedData;
    .locals 11
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "jsonObject"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "issuingCountry"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    const/16 v9, 0x1c

    .line 14
    const/4 v10, 0x0

    .line 15
    .line 16
    const-string v4, "dateOfBirth"

    .line 17
    .line 18
    const-string v5, "yyyy-MM-dd"

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    move-object v3, p1

    .line 23
    .line 24
    .line 25
    invoke-static/range {v3 .. v10}, Lcom/jumio/core/util/JsonUtilKt;->optDate$default(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;Ljava/util/Date;ILjava/lang/Object;)Ljava/util/Date;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string v4, "expiryDate"

    .line 29
    .line 30
    const-string v5, "yyyy-MM-dd"

    .line 31
    .line 32
    .line 33
    invoke-static/range {v3 .. v10}, Lcom/jumio/core/util/JsonUtilKt;->optDate$default(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/util/TimeZone;Ljava/util/Date;ILjava/lang/Object;)Ljava/util/Date;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    const-string v0, "documentNumber"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v5

    .line 41
    .line 42
    const-string v0, "mrzLine1"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    const-string v0, "mrzLine2"

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object v7

    .line 53
    .line 54
    const-string v0, "mrzLine3"

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v8

    .line 59
    .line 60
    sget-object v0, Lcom/jumio/sdk/document/JumioDocumentType;->Companion:Lcom/jumio/sdk/document/JumioDocumentType$Companion;

    .line 61
    .line 62
    const-string v1, "idType"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    const-string v3, "optString(...)"

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Lcom/jumio/sdk/document/JumioDocumentType$Companion;->fromString(Ljava/lang/String;)Lcom/jumio/sdk/document/JumioDocumentType;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    new-instance v1, Lcom/jumio/core/models/automation/ExtractedData;

    .line 78
    .line 79
    .line 80
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 93
    move-object v3, p1

    .line 94
    .line 95
    .line 96
    invoke-direct/range {v1 .. v9}, Lcom/jumio/core/models/automation/ExtractedData;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocumentType;)V

    .line 97
    return-object v1
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
