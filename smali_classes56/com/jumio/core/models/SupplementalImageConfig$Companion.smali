.class public final Lcom/jumio/core/models/SupplementalImageConfig$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/SupplementalImageConfig;
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
        "Lcom/jumio/core/models/SupplementalImageConfig$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/SupplementalImageConfig;",
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

.method public static final a(Lorg/json/JSONObject;)Lcom/jumio/core/models/SupplementalImage;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/jumio/core/models/SupplementalImage;->Companion:Lcom/jumio/core/models/SupplementalImage$Companion;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lcom/jumio/core/models/SupplementalImage$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/SupplementalImage;

    .line 11
    move-result-object p0

    .line 12
    return-object p0
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
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/SupplementalImageConfig;
    .locals 4
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
    const-string v0, "side"

    .line 8
    .line 9
    const-string v1, "front"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sget-object v1, Lcom/jumio/core/models/SupplementalImageCategory;->UNSUPPORTED:Lcom/jumio/core/models/SupplementalImageCategory;

    .line 16
    .line 17
    const-string v2, "category"

    .line 18
    .line 19
    .line 20
    invoke-static {p1, v2, v1}, Lcom/jumio/core/util/JsonUtilKt;->optEnum(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Enum;)Ljava/lang/Enum;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lcom/jumio/core/models/SupplementalImageCategory;

    .line 24
    .line 25
    const-string v2, "manualEnabled"

    .line 26
    const/4 v3, 0x0

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    const-string v3, "images"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 36
    move-result-object p1

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    new-instance v3, Lr9/k;

    .line 41
    .line 42
    .line 43
    invoke-direct {v3}, Lr9/k;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v3}, Lcom/jumio/core/util/JsonUtilKt;->map(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    if-nez p1, :cond_1

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    :cond_1
    new-instance v3, Lcom/jumio/core/models/SupplementalImageConfig;

    .line 56
    .line 57
    .line 58
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v3, v0, v1, p1, v2}, Lcom/jumio/core/models/SupplementalImageConfig;-><init>(Ljava/lang/String;Lcom/jumio/core/models/SupplementalImageCategory;Ljava/util/List;Z)V

    .line 62
    return-object v3
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
