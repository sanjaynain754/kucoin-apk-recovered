.class public Lcom/jumio/core/models/CredentialDataModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/model/StaticModel;


# annotations
.annotation runtime Lcom/jumio/commons/PersistWith;
    value = "CredentialsDataModel"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jumio/core/models/CredentialDataModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0017\u0018\u0000 -2\u00020\u0001:\u0001-B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eB\u0011\u0008\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000fJ\u0015\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0010\u00a2\u0006\u0002\u0008,R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001d\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u001eR\u0014\u0010!\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(\u00a8\u0006."
    }
    d2 = {
        "Lcom/jumio/core/models/CredentialDataModel;",
        "Lcom/jumio/core/model/StaticModel;",
        "id",
        "",
        "category",
        "Lcom/jumio/sdk/credentials/JumioCredentialCategory;",
        "capabilities",
        "",
        "Lcom/jumio/core/credentials/CredentialCapability;",
        "requiredParts",
        "Lcom/jumio/core/credentials/RequiredPart;",
        "executionOrder",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;I)V",
        "(Lcom/jumio/sdk/credentials/JumioCredentialCategory;)V",
        "getId",
        "()Ljava/lang/String;",
        "getCategory",
        "()Lcom/jumio/sdk/credentials/JumioCredentialCategory;",
        "getCapabilities",
        "()Ljava/util/List;",
        "getRequiredParts",
        "getExecutionOrder",
        "()I",
        "scanData",
        "Ljava/util/SortedMap;",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "Lcom/jumio/core/models/ScanPartModel;",
        "getScanData",
        "()Ljava/util/SortedMap;",
        "addonScanData",
        "getAddonScanData",
        "isComplete",
        "",
        "()Z",
        "activeCredentialPart",
        "getActiveCredentialPart",
        "()Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "setActiveCredentialPart",
        "(Lcom/jumio/sdk/enums/JumioCredentialPart;)V",
        "isNotSupported",
        "controller",
        "Lcom/jumio/core/Controller;",
        "isNotSupported$jumio_core_release",
        "Companion",
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
        "SMAP\nCredentialDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CredentialDataModel.kt\ncom/jumio/core/models/CredentialDataModel\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,92:1\n168#2,3:93\n*S KotlinDebug\n*F\n+ 1 CredentialDataModel.kt\ncom/jumio/core/models/CredentialDataModel\n*L\n37#1:93,3\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:Ljava/util/SortedMap;

.field public final f:Ljava/util/SortedMap;

.field public g:Lcom/jumio/sdk/enums/JumioCredentialPart;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/jumio/core/models/CredentialDataModel$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/jumio/core/models/CredentialDataModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    return-void
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

.method public constructor <init>(Lcom/jumio/sdk/credentials/JumioCredentialCategory;)V
    .locals 7
    .param p1    # Lcom/jumio/sdk/credentials/JumioCredentialCategory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "category"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    const-string v2, ""

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Lcom/jumio/core/models/CredentialDataModel;-><init>(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;I)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/credentials/JumioCredentialCategory;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jumio/sdk/credentials/JumioCredentialCategory;",
            "Ljava/util/List<",
            "Ljumio/core/C0;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/jumio/core/credentials/RequiredPart;",
            ">;I)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capabilities"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requiredParts"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/jumio/core/models/CredentialDataModel;->b:Lcom/jumio/sdk/credentials/JumioCredentialCategory;

    .line 4
    iput-object p3, p0, Lcom/jumio/core/models/CredentialDataModel;->c:Ljava/util/List;

    .line 5
    iput p5, p0, Lcom/jumio/core/models/CredentialDataModel;->d:I

    const/4 p1, 0x0

    .line 6
    new-array p2, p1, [Lkotlin/Pair;

    invoke-static {p2}, Lkotlin/collections/MapsKt;->sortedMapOf([Lkotlin/Pair;)Ljava/util/SortedMap;

    move-result-object p2

    iput-object p2, p0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 7
    new-array p1, p1, [Lkotlin/Pair;

    invoke-static {p1}, Lkotlin/collections/MapsKt;->sortedMapOf([Lkotlin/Pair;)Ljava/util/SortedMap;

    move-result-object p1

    iput-object p1, p0, Lcom/jumio/core/models/CredentialDataModel;->f:Ljava/util/SortedMap;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/jumio/core/models/CredentialDataModel;-><init>(Ljava/lang/String;Lcom/jumio/sdk/credentials/JumioCredentialCategory;Ljava/util/List;Ljava/util/List;I)V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 5
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/ScanPartModel;

    invoke-virtual {v1}, Lcom/jumio/core/models/ScanPartModel;->isComplete()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_3
    :goto_1
    const/4 v0, 0x0

    return v0
.end method

.method public a(Lcom/jumio/core/Controller;)Z
    .locals 1

    .line 1
    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
