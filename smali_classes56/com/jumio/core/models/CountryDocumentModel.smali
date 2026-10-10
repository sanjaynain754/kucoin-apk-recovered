.class public final Lcom/jumio/core/models/CountryDocumentModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "CountryDocumentModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00072\u0006\u0010\u0010\u001a\u00020\u0008J\u0014\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00072\u0006\u0010\u0010\u001a\u00020\u0008J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J&\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0014\u001a\u00020\u0015J\u0011\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u0008H\u0086\u0002J\t\u0010\u001e\u001a\u00020\u0003H\u00c2\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020\u000c2\u0008\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0015H\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u000c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\r\u00a8\u0006&"
    }
    d2 = {
        "Lcom/jumio/core/models/CountryDocumentModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "countryDocumentProvider",
        "Lcom/jumio/core/data/document/CountryDocumentProviderInterface;",
        "<init>",
        "(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;)V",
        "countries",
        "",
        "Lcom/jumio/core/data/country/Country;",
        "getCountries",
        "()Ljava/util/List;",
        "isEmpty",
        "",
        "()Z",
        "getDigitalDocumentTypesFor",
        "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
        "country",
        "getPhysicalDocumentTypesFor",
        "Lcom/jumio/core/data/document/PhysicalDocumentType;",
        "getPhysicalDocumentTypeFor",
        "iso3",
        "",
        "jumioDocumentType",
        "Lcom/jumio/sdk/document/JumioDocumentType;",
        "getCountriesFor",
        "supportedDocumentTypes",
        "restrictVariant",
        "Lcom/jumio/sdk/document/JumioDocumentVariant;",
        "getCountryForIso3",
        "contains",
        "component1",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field public final a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/jumio/core/models/CountryDocumentModel;-><init>(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/core/data/document/CountryDocumentProviderInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "countryDocumentProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    new-instance p1, Lcom/jumio/core/data/document/DefaultCountryDocumentProvider;

    const/4 p2, 0x0

    const/4 p3, 0x3

    const/4 v0, 0x0

    invoke-direct {p1, v0, p2, p3, v0}, Lcom/jumio/core/data/document/DefaultCountryDocumentProvider;-><init>(Lorg/json/JSONArray;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lcom/jumio/core/models/CountryDocumentModel;-><init>(Lcom/jumio/core/data/document/CountryDocumentProviderInterface;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    return v0

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, Lcom/jumio/core/models/CountryDocumentModel;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    return v2

    .line 11
    .line 12
    :cond_1
    check-cast p1, Lcom/jumio/core/models/CountryDocumentModel;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 17
    .line 18
    .line 19
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_2

    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    move-result v0

    .line 7
    return v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "CountryDocumentModel(countryDocumentProvider="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget-object v1, p0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const/16 v1, 0x29

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object v0

    .line 22
    return-object v0
    .line 23
    .line 24
    .line 25
    .line 26
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
.end method
