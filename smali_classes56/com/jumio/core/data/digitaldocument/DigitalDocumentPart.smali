.class public final Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;",
        "Ljava/io/Serializable;",
        "jsonObject",
        "Lorg/json/JSONObject;",
        "<init>",
        "(Lorg/json/JSONObject;)V",
        "part",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "getPart",
        "()Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "extraction",
        "Lcom/jumio/core/data/ScanMode;",
        "getExtraction",
        "()Lcom/jumio/core/data/ScanMode;",
        "options",
        "Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;",
        "getOptions",
        "()Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;",
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


# instance fields
.field public final a:Lcom/jumio/sdk/enums/JumioCredentialPart;

.field public final b:Lcom/jumio/core/data/ScanMode;

.field public final c:Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;


# direct methods
.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 8
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "jsonObject"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    const-string v0, "part"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    const-string v1, "getString(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/jumio/sdk/enums/JumioCredentialPart;->valueOf(Ljava/lang/String;)Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->a:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 26
    .line 27
    const-string v0, "extraction"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    const-string v1, "PDF"

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v1

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    sget-object v0, Lcom/jumio/core/data/ScanMode;->FILE:Lcom/jumio/core/data/ScanMode;

    .line 42
    goto :goto_0

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lcom/jumio/core/data/ScanMode;->valueOf(Ljava/lang/String;)Lcom/jumio/core/data/ScanMode;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    :goto_0
    iput-object v0, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->b:Lcom/jumio/core/data/ScanMode;

    .line 52
    .line 53
    const-string v0, "options"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    sget-object v0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;->Companion:Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions$Companion;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions$Companion;->fromJson(Lorg/json/JSONObject;)Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    if-nez p1, :cond_2

    .line 68
    .line 69
    :cond_1
    new-instance v0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

    .line 70
    .line 71
    const/16 v6, 0x1f

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v1, 0x0

    .line 74
    const/4 v2, 0x0

    .line 75
    const/4 v3, 0x0

    .line 76
    const/4 v4, 0x0

    .line 77
    const/4 v5, 0x0

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v0 .. v7}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 81
    move-object p1, v0

    .line 82
    .line 83
    :cond_2
    iput-object p1, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->c:Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

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
.end method


# virtual methods
.method public final getExtraction()Lcom/jumio/core/data/ScanMode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->b:Lcom/jumio/core/data/ScanMode;

    .line 3
    return-object v0
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
.end method

.method public final getOptions()Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->c:Lcom/jumio/core/data/digitaldocument/DigitalDocumentOptions;

    .line 3
    return-object v0
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
.end method

.method public final getPart()Lcom/jumio/sdk/enums/JumioCredentialPart;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->a:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 3
    return-object v0
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
.end method
