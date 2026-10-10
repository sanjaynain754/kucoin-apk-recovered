.class public final Lcom/jumio/core/models/TimeoutModel$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jumio/core/models/TimeoutModel;
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
        "Lcom/jumio/core/models/TimeoutModel$Companion;",
        "",
        "<init>",
        "()V",
        "fromJson",
        "Lcom/jumio/core/models/TimeoutModel;",
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
.method public final fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/models/TimeoutModel;
    .locals 12
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    new-instance v1, Lcom/jumio/core/models/TimeoutModel;

    .line 8
    .line 9
    const-string v0, "upload"

    .line 10
    .line 11
    const/16 v2, 0x4e20

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 15
    move-result v0

    .line 16
    .line 17
    const-string v3, "upload4K"

    .line 18
    .line 19
    const/16 v4, 0x2710

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 23
    move-result v3

    .line 24
    .line 25
    const-string v5, "usability"

    .line 26
    .line 27
    const/16 v6, 0x3a98

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v5, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 31
    move-result v5

    .line 32
    .line 33
    const-string v7, "finalize"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v7, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 37
    move-result v7

    .line 38
    .line 39
    const-string v8, "extractdata"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v8, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 43
    move-result v2

    .line 44
    .line 45
    const-string v8, "analytics"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v8, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 49
    move-result v8

    .line 50
    .line 51
    const-string v9, "reporting"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v9, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 55
    move-result v4

    .line 56
    .line 57
    const-string v9, "cdn"

    .line 58
    .line 59
    const/16 v10, 0x7530

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v9, v10}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 63
    move-result v9

    .line 64
    .line 65
    const-string v10, "authentication"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v10, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 69
    move-result v10

    .line 70
    .line 71
    const-string v11, "lookup"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v11, v6}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 75
    move-result v11

    .line 76
    move v6, v8

    .line 77
    move v8, v4

    .line 78
    move v4, v5

    .line 79
    move v5, v7

    .line 80
    move v7, v6

    .line 81
    move v6, v2

    .line 82
    move v2, v0

    .line 83
    .line 84
    .line 85
    invoke-direct/range {v1 .. v11}, Lcom/jumio/core/models/TimeoutModel;-><init>(IIIIIIIIII)V

    .line 86
    return-object v1
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
