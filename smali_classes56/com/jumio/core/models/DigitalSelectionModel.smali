.class public final Lcom/jumio/core/models/DigitalSelectionModel;
.super Lcom/jumio/core/models/SelectionModel;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/jumio/core/models/DigitalSelectionModel;",
        "Lcom/jumio/core/models/SelectionModel;",
        "country",
        "Lcom/jumio/core/data/country/Country;",
        "digitalDocumentType",
        "Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
        "<init>",
        "(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;)V",
        "getDigitalDocumentType",
        "()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;",
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
.field public final b:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;


# direct methods
.method public constructor <init>(Lcom/jumio/core/data/country/Country;Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;)V
    .locals 1
    .param p1    # Lcom/jumio/core/data/country/Country;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "country"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "digitalDocumentType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, v0}, Lcom/jumio/core/models/SelectionModel;-><init>(Lcom/jumio/core/data/country/Country;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    .line 16
    iput-object p2, p0, Lcom/jumio/core/models/DigitalSelectionModel;->b:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
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
.end method


# virtual methods
.method public final getDigitalDocumentType()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/DigitalSelectionModel;->b:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

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
