.class public final Lcom/jumio/core/models/DocumentScanPartModel;
.super Lcom/jumio/core/models/ScanPartModel;
.source "SourceFile"


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "DocumentScanPartModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/jumio/core/models/DocumentScanPartModel;",
        "Lcom/jumio/core/models/ScanPartModel;",
        "credentialPart",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "mode",
        "Lcom/jumio/core/data/ScanMode;",
        "country",
        "",
        "type",
        "Lcom/jumio/core/data/document/Document;",
        "fileData",
        "Lcom/jumio/core/data/scan/FileDataInterface;",
        "<init>",
        "(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;Lcom/jumio/core/data/document/Document;Lcom/jumio/core/data/scan/FileDataInterface;)V",
        "getCountry",
        "()Ljava/lang/String;",
        "getType",
        "()Lcom/jumio/core/data/document/Document;",
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
.field public final l:Ljava/lang/String;

.field public final m:Lcom/jumio/core/data/document/Document;


# direct methods
.method public constructor <init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;Lcom/jumio/core/data/document/Document;Lcom/jumio/core/data/scan/FileDataInterface;)V
    .locals 1
    .param p1    # Lcom/jumio/sdk/enums/JumioCredentialPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/core/data/ScanMode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/jumio/core/data/document/Document;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/jumio/core/data/scan/FileDataInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "credentialPart"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p5}, Lcom/jumio/core/models/ScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/data/scan/FileDataInterface;)V

    .line 4
    iput-object p3, p0, Lcom/jumio/core/models/DocumentScanPartModel;->l:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/jumio/core/models/DocumentScanPartModel;->m:Lcom/jumio/core/data/document/Document;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;Lcom/jumio/core/data/document/Document;Lcom/jumio/core/data/scan/FileDataInterface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    .line 1
    new-instance p5, Lcom/jumio/core/data/scan/FileData;

    invoke-direct {p5}, Lcom/jumio/core/data/scan/FileData;-><init>()V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/models/DocumentScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Ljava/lang/String;Lcom/jumio/core/data/document/Document;Lcom/jumio/core/data/scan/FileDataInterface;)V

    return-void
.end method
