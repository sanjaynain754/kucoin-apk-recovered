.class public interface abstract Lcom/jumio/core/data/document/CountryDocumentProviderInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00062\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u0006H&J\u0008\u0010\u0011\u001a\u00020\u000bH&J\u0016\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u00062\u0006\u0010\u000c\u001a\u00020\u0007H&J\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000c\u001a\u00020\u0007H&J(\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00062\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u001bH&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001bH&J\u0011\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u0007H\u00a6\u0002R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0004R\u0018\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/jumio/core/data/document/CountryDocumentProviderInterface;",
        "",
        "isEmpty",
        "",
        "()Z",
        "countries",
        "",
        "Lcom/jumio/core/data/country/Country;",
        "getCountries",
        "()Ljava/util/List;",
        "initDocuments",
        "",
        "country",
        "physicalDocuments",
        "Lcom/jumio/core/data/document/PhysicalDocumentType;",
        "digitalDocuments",
        "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
        "clear",
        "getDigitalDocumentTypes",
        "getPhysicalDocumentTypes",
        "getCountriesFor",
        "documentTypes",
        "Lcom/jumio/sdk/document/JumioDocumentType;",
        "documentVariant",
        "Lcom/jumio/sdk/document/JumioDocumentVariant;",
        "getCountryForIso3",
        "iso3",
        "",
        "getCountryForIso2",
        "iso2",
        "contains",
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


# virtual methods
.method public abstract clear()V
.end method

.method public abstract contains(Lcom/jumio/core/data/country/Country;)Z
    .param p1    # Lcom/jumio/core/data/country/Country;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract getCountries()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/country/Country;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getCountriesFor(Ljava/util/List;Lcom/jumio/sdk/document/JumioDocumentVariant;)Ljava/util/List;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/document/JumioDocumentVariant;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/jumio/sdk/document/JumioDocumentType;",
            ">;",
            "Lcom/jumio/sdk/document/JumioDocumentVariant;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/country/Country;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getCountryForIso2(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCountryForIso3(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getDigitalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;
    .param p1    # Lcom/jumio/core/data/country/Country;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/data/country/Country;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getPhysicalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;
    .param p1    # Lcom/jumio/core/data/country/Country;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/data/country/Country;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/document/PhysicalDocumentType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract initDocuments(Lcom/jumio/core/data/country/Country;Ljava/util/List;Ljava/util/List;)V
    .param p1    # Lcom/jumio/core/data/country/Country;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/jumio/core/data/country/Country;",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/document/PhysicalDocumentType;",
            ">;",
            "Ljava/util/List<",
            "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract isEmpty()Z
.end method
