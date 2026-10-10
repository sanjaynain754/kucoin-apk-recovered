.class public final Lcom/jumio/sdk/credentials/JumioIDCredential;
.super Lcom/jumio/sdk/credentials/JumioCredential;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B-\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010.\u001a\u00020/H\u0010\u00a2\u0006\u0002\u00080J\u0008\u00101\u001a\u00020/H\u0016J\u0008\u00102\u001a\u00020/H\u0016J\u0008\u00103\u001a\u00020/H\u0002J\u0014\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u00105\u001a\u00020\u001aJ\u0014\u00106\u001a\u0008\u0012\u0004\u0012\u0002070\u00142\u0006\u00105\u001a\u00020\u001aJ\u0016\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u00020/2\u0006\u00109\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020;J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020AH\u0016J\u0015\u0010B\u001a\u00020/2\u0006\u0010C\u001a\u00020>H\u0010\u00a2\u0006\u0002\u0008DJ\u0015\u0010E\u001a\u00020/2\u0006\u0010C\u001a\u00020>H\u0010\u00a2\u0006\u0002\u0008FJ\u0018\u0010G\u001a\u00020>2\u0006\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020AH\u0002J(\u0010H\u001a\u00020>2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010@\u001a\u00020AH\u0002J\u0008\u0010L\u001a\u00020/H\u0002J\u0016\u0010M\u001a\u00020/2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0008\u001a\u00020\tX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0012R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0017R,\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u00140\u00198FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0017\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0017R\u0013\u0010\"\u001a\u0004\u0018\u00010\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0011\u0010)\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u0012R\u0016\u0010+\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/jumio/sdk/credentials/JumioIDCredential;",
        "Lcom/jumio/sdk/credentials/JumioCredential;",
        "controller",
        "Lcom/jumio/core/Controller;",
        "credentialDataModel",
        "Lcom/jumio/core/models/CredentialIDDataModel;",
        "countrySelection",
        "Lcom/jumio/core/credentials/CountrySelectionInterface;",
        "scanPartConfigurator",
        "Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;",
        "<init>",
        "(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialIDDataModel;Lcom/jumio/core/credentials/CountrySelectionInterface;Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;)V",
        "getCountrySelection$jumio_core_release",
        "()Lcom/jumio/core/credentials/CountrySelectionInterface;",
        "getScanPartConfigurator$jumio_core_release",
        "()Lcom/jumio/core/scanpart/IdScanPartConfiguratorInterface;",
        "isConfigured",
        "",
        "()Z",
        "credentialParts",
        "",
        "Lcom/jumio/sdk/enums/JumioCredentialPart;",
        "getCredentialParts",
        "()Ljava/util/List;",
        "countries",
        "",
        "",
        "Lcom/jumio/sdk/document/JumioPhysicalDocument;",
        "getCountries$annotations",
        "()V",
        "getCountries",
        "()Ljava/util/Map;",
        "supportedCountries",
        "getSupportedCountries",
        "suggestedCountry",
        "getSuggestedCountry",
        "()Ljava/lang/String;",
        "lookupResult",
        "Lcom/jumio/sdk/document/JumioLookupResult;",
        "getLookupResult",
        "()Lcom/jumio/sdk/document/JumioLookupResult;",
        "brandingEnabled",
        "getBrandingEnabled",
        "credentialIdDataModel",
        "getCredentialIdDataModel",
        "()Lcom/jumio/core/models/CredentialIDDataModel;",
        "start",
        "",
        "start$jumio_core_release",
        "cancel",
        "finish",
        "cleanUpPreselection",
        "getPhysicalDocumentsForCountry",
        "countryCode",
        "getDigitalDocumentsForCountry",
        "Lcom/jumio/sdk/document/JumioDigitalDocument;",
        "isSupportedConfiguration",
        "country",
        "document",
        "Lcom/jumio/sdk/document/JumioDocument;",
        "setConfiguration",
        "initScanPart",
        "Lcom/jumio/sdk/scanpart/JumioScanPart;",
        "credentialPart",
        "scanPartInterface",
        "Lcom/jumio/sdk/interfaces/JumioScanPartInterface;",
        "cancelScanPart",
        "scanPart",
        "cancelScanPart$jumio_core_release",
        "finishScanPart",
        "finishScanPart$jumio_core_release",
        "createScanPart",
        "createDigitalIdScanPart",
        "idCredential",
        "scanPartModel",
        "Lcom/jumio/core/models/DigitalIdScanPartModel;",
        "buildScanData",
        "userConsented",
        "legalStatement",
        "Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;",
        "userConsent",
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
        "SMAP\nJumioIDCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JumioIDCredential.kt\ncom/jumio/sdk/credentials/JumioIDCredential\n+ 2 Precondition.kt\ncom/jumio/core/util/PreconditionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n15#2,5:299\n15#2,5:304\n1#3:309\n1557#4:310\n1628#4,3:311\n*S KotlinDebug\n*F\n+ 1 JumioIDCredential.kt\ncom/jumio/sdk/credentials/JumioIDCredential\n*L\n192#1:299,5\n193#1:304,5\n238#1:310\n238#1:311,3\n*E\n"
    }
.end annotation


# instance fields
.field public final f:Ljumio/core/A0;

.field public final g:Ljumio/core/P1;


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Ljumio/core/G0;Ljumio/core/A0;Ljumio/core/P1;)V
    .locals 1
    .param p1    # Lcom/jumio/core/Controller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljumio/core/G0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljumio/core/A0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljumio/core/P1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "controller"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "credentialDataModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countrySelection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanPartConfigurator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0, p1, p2}, Lcom/jumio/sdk/credentials/JumioCredential;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/core/models/CredentialDataModel;)V

    .line 10
    iput-object p3, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 11
    iput-object p4, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->g:Ljumio/core/P1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jumio/core/Controller;Ljumio/core/G0;Ljumio/core/A0;Ljumio/core/P1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 1
    new-instance p3, Ljumio/core/z0;

    .line 2
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object p6

    const-class v0, Lcom/jumio/core/models/CountryDocumentModel;

    invoke-virtual {p6, v0}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object p6

    check-cast p6, Lcom/jumio/core/models/CountryDocumentModel;

    .line 3
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getCountryForIp()Ljava/lang/String;

    move-result-object v0

    .line 4
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    move-result-object v2

    sget-object v3, Ljumio/core/W2;->e:Ljumio/core/W2;

    invoke-interface {v2, v3}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    move-result-object v2

    check-cast v2, Lcom/jumio/core/plugins/ExtractionPlugin;

    if-eqz v2, :cond_0

    invoke-interface {v2, p1}, Lcom/jumio/core/plugins/Plugin;->isUsable(Lcom/jumio/core/Controller;)Z

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v1

    check-cast v1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v1}, Lcom/jumio/core/models/SettingsModel;->getSkipDocTypeSelection()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 6
    :goto_0
    invoke-direct {p3, p6, v0, p2, v3}, Ljumio/core/z0;-><init>(Lcom/jumio/core/models/CountryDocumentModel;Ljava/lang/String;Ljumio/core/G0;Z)V

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 7
    new-instance p4, Ljumio/core/O1;

    invoke-direct {p4, p1, p3, p2}, Ljumio/core/O1;-><init>(Lcom/jumio/core/Controller;Ljumio/core/A0;Ljumio/core/G0;)V

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/jumio/sdk/credentials/JumioIDCredential;-><init>(Lcom/jumio/core/Controller;Ljumio/core/G0;Ljumio/core/A0;Ljumio/core/P1;)V

    return-void
.end method

.method public static synthetic getCountries$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use supportedCountries together with getPhysical/DigitalDocumentsForCountry(country) instead"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "countrySelection.countryMap"
            imports = {}
        .end subannotation
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->g:Ljumio/core/P1;

    .line 3
    .line 4
    check-cast v0, Ljumio/core/O1;

    .line 5
    .line 6
    iget-object v1, v0, Ljumio/core/O1;->b:Ljumio/core/A0;

    .line 7
    .line 8
    check-cast v1, Ljumio/core/z0;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljumio/core/z0;->b()Lcom/jumio/core/models/SelectionModel;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    iget-object v2, v0, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 19
    .line 20
    iget-object v2, v2, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Ljava/util/Map;->clear()V

    .line 24
    .line 25
    instance-of v2, v1, Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 26
    .line 27
    const/16 v3, 0x10

    .line 28
    .line 29
    const/16 v4, 0xa

    .line 30
    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    check-cast v1, Lcom/jumio/core/models/PhysicalSelectionModel;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/jumio/core/models/PhysicalSelectionModel;->getVariant()Lcom/jumio/core/data/document/DocumentVariant;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/jumio/core/data/document/DocumentVariant;->getParts()Ljava/util/List;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 45
    move-result v4

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 49
    move-result v4

    .line 50
    .line 51
    .line 52
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 53
    move-result v3

    .line 54
    .line 55
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    .line 58
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    move-result v3

    .line 67
    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    .line 71
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    check-cast v3, Lcom/jumio/core/data/document/DocumentPart;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v3, v1}, Ljumio/core/O1;->a(Lcom/jumio/core/data/document/DocumentPart;Lcom/jumio/core/models/PhysicalSelectionModel;)Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    .line 85
    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 90
    move-result-object v5

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_1
    instance-of v2, v1, Lcom/jumio/core/models/DigitalSelectionModel;

    .line 101
    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    check-cast v1, Lcom/jumio/core/models/DigitalSelectionModel;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Lcom/jumio/core/models/DigitalSelectionModel;->getDigitalDocumentType()Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 108
    move-result-object v2

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getParts()Ljava/util/List;

    .line 112
    move-result-object v2

    .line 113
    .line 114
    .line 115
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 116
    move-result v4

    .line 117
    .line 118
    .line 119
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    .line 120
    move-result v4

    .line 121
    .line 122
    .line 123
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 124
    move-result v3

    .line 125
    .line 126
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    .line 129
    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    move-result v3

    .line 138
    .line 139
    if-eqz v3, :cond_2

    .line 140
    .line 141
    .line 142
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    move-result-object v3

    .line 144
    .line 145
    check-cast v3, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;

    .line 146
    .line 147
    sget-object v5, Lcom/jumio/sdk/enums/JumioCredentialPart;->DIGITAL:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 148
    .line 149
    new-instance v6, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentPart;->getExtraction()Lcom/jumio/core/data/ScanMode;

    .line 153
    move-result-object v3

    .line 154
    .line 155
    .line 156
    invoke-direct {v6, v3, v1}, Lcom/jumio/core/models/DigitalIdScanPartModel;-><init>(Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/DigitalSelectionModel;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 160
    move-result-object v3

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 164
    move-result-object v5

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 168
    move-result-object v3

    .line 169
    .line 170
    .line 171
    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    goto :goto_1

    .line 173
    .line 174
    :cond_2
    iget-object v0, v0, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 175
    .line 176
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 177
    .line 178
    .line 179
    invoke-interface {v0, v4}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 180
    .line 181
    :goto_2
    sget-object v0, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 182
    .line 183
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 184
    .line 185
    check-cast v1, Ljumio/core/z0;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Ljumio/core/z0;->b()Lcom/jumio/core/models/SelectionModel;

    .line 189
    move-result-object v1

    .line 190
    .line 191
    const-string v2, "configuration"

    .line 192
    const/4 v3, 0x2

    .line 193
    const/4 v4, 0x0

    .line 194
    .line 195
    .line 196
    invoke-static {v2, v4, v1, v3, v4}, Lcom/jumio/analytics/MobileEvents;->userAction$default(Ljava/lang/String;Lcom/jumio/sdk/enums/JumioScanStep;Ljava/lang/Object;ILjava/lang/Object;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 197
    move-result-object v1

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 201
    return-void

    .line 202
    .line 203
    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 204
    .line 205
    .line 206
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 207
    throw v0
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public final b()Ljumio/core/G0;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Ljumio/core/G0;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Ljumio/core/G0;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
.end method

.method public cancel()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->cancel()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2, v3}, Ljumio/core/k2;->a(Lcom/jumio/core/Controller;ZZ)V

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 26
    move-result-object v0

    .line 27
    const/4 v1, 0x0

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    const-string v2, "controller"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    const-class v2, Lcom/jumio/core/models/LegalStatementModel;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    check-cast v0, Lcom/jumio/core/models/LegalStatementModel;

    .line 55
    .line 56
    iput-object v1, v0, Lcom/jumio/core/models/LegalStatementModel;->c:Ljava/lang/Boolean;

    .line 57
    .line 58
    iput-object v1, v0, Lcom/jumio/core/models/LegalStatementModel;->b:Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;

    .line 59
    .line 60
    .line 61
    :cond_1
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    const-string v2, "null cannot be cast to non-null type com.jumio.core.models.CredentialIDDataModel"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    check-cast v0, Ljumio/core/G0;

    .line 70
    .line 71
    iput-object v1, v0, Ljumio/core/G0;->k:Ljava/lang/String;

    .line 72
    .line 73
    iput-object v1, v0, Ljumio/core/G0;->l:Lcom/jumio/sdk/document/JumioDocument;

    .line 74
    .line 75
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 76
    .line 77
    check-cast v0, Ljumio/core/z0;

    .line 78
    .line 79
    iput-object v1, v0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 80
    .line 81
    iput-object v1, v0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 82
    .line 83
    iput-object v1, v0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 84
    .line 85
    iput-object v1, v0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 86
    return-void
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
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public declared-synchronized cancelScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 5
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "scanPart"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getActiveScanPart$jumio_core_release()Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget-object v1, Lcom/jumio/sdk/enums/JumioCredentialPart;->NFC:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 31
    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getScanStep()Lcom/jumio/sdk/enums/JumioScanStep;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sget-object v1, Lcom/jumio/sdk/enums/JumioScanStep;->CAN_FINISH:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, v2, v2}, Ljumio/core/k2;->a(Lcom/jumio/core/Controller;ZZ)V

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 73
    move-result-object v0

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 78
    .line 79
    if-eqz v0, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    const-string v2, "controller"

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    const-class v2, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 98
    move-result-object v2

    .line 99
    .line 100
    check-cast v2, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 101
    .line 102
    iget-object v2, v2, Lcom/jumio/core/models/ReusableIdLookupResult;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 103
    .line 104
    if-eqz v2, :cond_1

    .line 105
    .line 106
    new-instance v3, Lcom/jumio/sdk/document/JumioLookupResult;

    .line 107
    .line 108
    const-class v4, Lcom/jumio/core/models/LegalStatementModel;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v4}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    check-cast v1, Lcom/jumio/core/models/LegalStatementModel;

    .line 115
    .line 116
    iget-object v1, v1, Lcom/jumio/core/models/LegalStatementModel;->a:Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    invoke-direct {v3, v2, v1}, Lcom/jumio/sdk/document/JumioLookupResult;-><init>(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/lang/String;)V

    .line 120
    .line 121
    iput-object v3, v0, Ljumio/core/k2;->a:Lcom/jumio/sdk/document/JumioLookupResult;

    .line 122
    .line 123
    .line 124
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/jumio/sdk/credentials/JumioCredential;->cancelScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit p0

    .line 126
    return-void

    .line 127
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    throw p1
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method public finish()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->finish()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->getLookupResult()Lcom/jumio/sdk/document/JumioLookupResult;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/jumio/sdk/document/JumioLookupResult;->getDocumentType()Lcom/jumio/sdk/document/JumioDocumentType;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    const/4 v3, 0x1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1, v2, v3}, Ljumio/core/k2;->a(Lcom/jumio/core/Controller;ZZ)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    const-string v1, "null cannot be cast to non-null type com.jumio.core.models.CredentialIDDataModel"

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    check-cast v0, Ljumio/core/G0;

    .line 46
    const/4 v1, 0x0

    .line 47
    .line 48
    iput-object v1, v0, Ljumio/core/G0;->k:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v1, v0, Ljumio/core/G0;->l:Lcom/jumio/sdk/document/JumioDocument;

    .line 51
    .line 52
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 53
    .line 54
    check-cast v0, Ljumio/core/z0;

    .line 55
    .line 56
    iput-object v1, v0, Ljumio/core/z0;->e:Lcom/jumio/core/data/country/Country;

    .line 57
    .line 58
    iput-object v1, v0, Ljumio/core/z0;->f:Lcom/jumio/core/data/document/PhysicalDocumentType;

    .line 59
    .line 60
    iput-object v1, v0, Ljumio/core/z0;->g:Lcom/jumio/core/data/document/DocumentVariant;

    .line 61
    .line 62
    iput-object v1, v0, Ljumio/core/z0;->h:Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 63
    return-void
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

.method public declared-synchronized finishScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    .locals 3
    .param p1    # Lcom/jumio/sdk/scanpart/JumioScanPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "scanPart"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getActiveScanPart$jumio_core_release()Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getCredentialPart()Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    sget-object v1, Lcom/jumio/sdk/enums/JumioCredentialPart;->NFC:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;->getScanPart$jumio_core_release()Lcom/jumio/core/scanpart/ScanPart;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/jumio/core/scanpart/ScanPart;->getScanPartModel()Lcom/jumio/core/models/ScanPartModel;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getScanStep()Lcom/jumio/sdk/enums/JumioScanStep;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    sget-object v1, Lcom/jumio/sdk/enums/JumioScanStep;->CAN_FINISH:Lcom/jumio/sdk/enums/JumioScanStep;

    .line 47
    .line 48
    if-ne v0, v1, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 62
    move-result-object v1

    .line 63
    const/4 v2, 0x1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1, v2, v2}, Ljumio/core/k2;->a(Lcom/jumio/core/Controller;ZZ)V

    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_1

    .line 70
    .line 71
    .line 72
    :cond_0
    :goto_0
    invoke-super {p0, p1}, Lcom/jumio/sdk/credentials/JumioCredential;->finishScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    monitor-exit p0

    .line 74
    return-void

    .line 75
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    throw p1
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

.method public final getBrandingEnabled()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-class v1, Lcom/jumio/core/models/SettingsModel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->isBrandingEnabled()Z

    .line 20
    move-result v0

    .line 21
    return v0
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

.method public final getCountries()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/document/JumioPhysicalDocument;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 3
    .line 4
    check-cast v0, Ljumio/core/z0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljumio/core/z0;->a()Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public final getCountrySelection$jumio_core_release()Ljumio/core/A0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

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

.method public getCredentialParts()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/enums/JumioCredentialPart;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getCredentialParts()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getCredentialParts()Ljava/util/List;

    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/jumio/sdk/enums/JumioCredentialPart;->MULTIPART:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 22
    move-result-object v0

    .line 23
    return-object v0
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

.method public final getDigitalDocumentsForCountry(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/document/JumioDigitalDocument;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "countryCode"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 8
    .line 9
    check-cast v1, Ljumio/core/z0;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    :cond_0
    iget-object v0, v1, Ljumio/core/z0;->a:Lcom/jumio/core/models/CountryDocumentModel;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    const-string v1, "country"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    iget-object v0, v0, Lcom/jumio/core/models/CountryDocumentModel;->a:Lcom/jumio/core/data/document/CountryDocumentProviderInterface;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0, p1}, Lcom/jumio/core/data/document/CountryDocumentProviderInterface;->getDigitalDocumentTypes(Lcom/jumio/core/data/country/Country;)Ljava/util/List;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    const/16 v1, 0xa

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 50
    move-result v1

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    move-result v1

    .line 62
    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    move-result-object v1

    .line 68
    .line 69
    check-cast v1, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;

    .line 70
    .line 71
    new-instance v2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getType()Ljava/lang/String;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/jumio/core/data/digitaldocument/DigitalDocumentType;->getTitle()Ljava/lang/String;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v3, v1}, Lcom/jumio/sdk/document/JumioDigitalDocument;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    return-object v0
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

.method public final getLookupResult()Lcom/jumio/sdk/document/JumioLookupResult;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Ljumio/core/k2;->a:Lcom/jumio/sdk/document/JumioLookupResult;

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
    .line 16
.end method

.method public final getPhysicalDocumentsForCountry(Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/jumio/sdk/document/JumioPhysicalDocument;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "countryCode"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 8
    .line 9
    check-cast v1, Ljumio/core/z0;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v1, p1}, Ljumio/core/z0;->a(Lcom/jumio/core/data/country/Country;)Ljava/util/ArrayList;

    .line 30
    move-result-object p1

    .line 31
    return-object p1
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

.method public final getScanPartConfigurator$jumio_core_release()Ljumio/core/P1;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->g:Ljumio/core/P1;

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

.method public final getSuggestedCountry()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 3
    .line 4
    check-cast v0, Ljumio/core/z0;

    .line 5
    .line 6
    iget-object v1, v0, Ljumio/core/z0;->b:Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljumio/core/z0;->a(Ljava/lang/String;)Lcom/jumio/core/data/country/Country;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Ljumio/core/z0;->b:Ljava/lang/String;

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
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

.method public final getSupportedCountries()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 3
    .line 4
    check-cast v0, Ljumio/core/z0;

    .line 5
    .line 6
    iget-object v0, v0, Ljumio/core/z0;->d:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    const/16 v2, 0xa

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    move-result v2

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lcom/jumio/core/data/country/Country;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lcom/jumio/core/data/country/Country;->getIsoCode()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v1
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

.method public declared-synchronized initScanPart(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/sdk/scanpart/JumioScanPart;
    .locals 4
    .param p1    # Lcom/jumio/sdk/enums/JumioCredentialPart;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/interfaces/JumioScanPartInterface;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    const-string v0, "credentialPart"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "scanPartInterface"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isValid()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-eqz v0, :cond_c

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->isConfigured()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_b

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->getCredentialParts()Ljava/util/List;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-eqz v0, :cond_a

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getActiveScanPart$jumio_core_release()Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    if-nez v0, :cond_9

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->getLookupResult()Lcom/jumio/sdk/document/JumioLookupResult;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/jumio/sdk/document/JumioLookupResult;->getDocumentType()Lcom/jumio/sdk/document/JumioDocumentType;

    .line 49
    move-result-object v0

    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    .line 53
    goto/16 :goto_4

    .line 54
    :cond_0
    const/4 v0, 0x0

    .line 55
    .line 56
    :goto_0
    if-eqz v0, :cond_2

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 64
    move-result-object v0

    .line 65
    .line 66
    const-class v1, Lcom/jumio/core/models/LegalStatementModel;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Lcom/jumio/core/models/LegalStatementModel;

    .line 73
    .line 74
    iget-object v1, v0, Lcom/jumio/core/models/LegalStatementModel;->b:Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;

    .line 75
    .line 76
    if-eqz v1, :cond_1

    .line 77
    .line 78
    iget-object v0, v0, Lcom/jumio/core/models/LegalStatementModel;->c:Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v0, :cond_1

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 84
    .line 85
    const-string p2, "Need to consent first"

    .line 86
    .line 87
    .line 88
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    throw p1

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 93
    move-result-object v0

    .line 94
    .line 95
    iput-object p1, v0, Lcom/jumio/core/models/CredentialDataModel;->g:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 109
    move-result-object v1

    .line 110
    const/4 v2, 0x1

    .line 111
    const/4 v3, 0x0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1, v2, v3}, Ljumio/core/k2;->a(Lcom/jumio/core/Controller;ZZ)V

    .line 115
    .line 116
    .line 117
    :cond_3
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    const-string v1, "<get-values>(...)"

    .line 127
    .line 128
    .line 129
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 133
    move-result-object v0

    .line 134
    .line 135
    check-cast v0, Lcom/jumio/core/models/ScanPartModel;

    .line 136
    .line 137
    instance-of v1, v0, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 138
    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 150
    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 153
    move-result-object v0

    .line 154
    .line 155
    const-string v1, "<get-values>(...)"

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    new-instance v1, Ljava/util/ArrayList;

    .line 161
    .line 162
    const/16 v2, 0xa

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 166
    move-result v2

    .line 167
    .line 168
    .line 169
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    .line 176
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    move-result v2

    .line 178
    .line 179
    if-eqz v2, :cond_4

    .line 180
    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    move-result-object v2

    .line 184
    .line 185
    check-cast v2, Lcom/jumio/core/models/ScanPartModel;

    .line 186
    .line 187
    const-string v3, "null cannot be cast to non-null type com.jumio.core.models.PhysicalIdScanPartModel"

    .line 188
    .line 189
    .line 190
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    check-cast v2, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    goto :goto_2

    .line 197
    .line 198
    :cond_4
    new-instance v0, Ljumio/core/S2;

    .line 199
    .line 200
    .line 201
    invoke-direct {v0, p1, p0, v1, p2}, Ljumio/core/S2;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioIDCredential;Ljava/util/ArrayList;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    .line 202
    .line 203
    new-instance p1, Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 204
    .line 205
    .line 206
    invoke-direct {p1, v0}, Lcom/jumio/sdk/scanpart/JumioScanPart;-><init>(Lcom/jumio/core/scanpart/ScanPart;)V

    .line 207
    .line 208
    goto/16 :goto_3

    .line 209
    .line 210
    :cond_5
    instance-of v0, v0, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 211
    .line 212
    if-eqz v0, :cond_8

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 219
    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 222
    move-result-object v0

    .line 223
    .line 224
    const-string v1, "<get-values>(...)"

    .line 225
    .line 226
    .line 227
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 231
    move-result-object v0

    .line 232
    .line 233
    const-string v1, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel"

    .line 234
    .line 235
    .line 236
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    check-cast v0, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Lcom/jumio/core/models/ScanPartModel;->getMode()Lcom/jumio/core/data/ScanMode;

    .line 242
    move-result-object v0

    .line 243
    .line 244
    sget-object v1, Lcom/jumio/core/data/ScanMode;->FILE:Lcom/jumio/core/data/ScanMode;

    .line 245
    .line 246
    if-ne v0, v1, :cond_6

    .line 247
    .line 248
    new-instance v0, Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 249
    .line 250
    new-instance v1, Ljumio/core/p1;

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 254
    move-result-object v2

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 258
    move-result-object v3

    .line 259
    .line 260
    iget-object v3, v3, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 261
    .line 262
    .line 263
    invoke-interface {v3, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    move-result-object p1

    .line 265
    .line 266
    const-string v3, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel"

    .line 267
    .line 268
    .line 269
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 270
    .line 271
    check-cast p1, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 272
    .line 273
    .line 274
    invoke-direct {v1, v2, p0, p1, p2}, Ljumio/core/p1;-><init>(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)V

    .line 275
    .line 276
    .line 277
    invoke-direct {v0, v1}, Lcom/jumio/sdk/scanpart/JumioScanPart;-><init>(Lcom/jumio/core/scanpart/ScanPart;)V

    .line 278
    move-object p1, v0

    .line 279
    goto :goto_3

    .line 280
    .line 281
    .line 282
    :cond_6
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 283
    move-result-object v0

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getData$jumio_core_release()Lcom/jumio/core/models/CredentialDataModel;

    .line 287
    move-result-object v1

    .line 288
    .line 289
    iget-object v1, v1, Lcom/jumio/core/models/CredentialDataModel;->e:Ljava/util/SortedMap;

    .line 290
    .line 291
    .line 292
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    move-result-object p1

    .line 294
    .line 295
    const-string v1, "null cannot be cast to non-null type com.jumio.core.models.DigitalIdScanPartModel"

    .line 296
    .line 297
    .line 298
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 299
    .line 300
    check-cast p1, Lcom/jumio/core/models/DigitalIdScanPartModel;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    .line 304
    move-result-object v1

    .line 305
    .line 306
    sget-object v2, Ljumio/core/W2;->j:Ljumio/core/W2;

    .line 307
    .line 308
    .line 309
    invoke-interface {v1, v2}, Lcom/jumio/core/plugins/PluginRegistryInterface;->getPlugin(Ljumio/core/W2;)Lcom/jumio/core/plugins/Plugin;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    check-cast v1, Lcom/jumio/core/plugins/ScanPartPlugin;

    .line 313
    .line 314
    if-eqz v1, :cond_7

    .line 315
    .line 316
    .line 317
    invoke-interface {v1, v0, p0, p1, p2}, Lcom/jumio/core/plugins/ScanPartPlugin;->getScanPart(Lcom/jumio/core/Controller;Lcom/jumio/sdk/credentials/JumioCredential;Lcom/jumio/core/models/ScanPartModel;Lcom/jumio/sdk/interfaces/JumioScanPartInterface;)Lcom/jumio/core/scanpart/ScanPart;

    .line 318
    move-result-object p1

    .line 319
    .line 320
    new-instance p2, Lcom/jumio/sdk/scanpart/JumioScanPart;

    .line 321
    .line 322
    .line 323
    invoke-direct {p2, p1}, Lcom/jumio/sdk/scanpart/JumioScanPart;-><init>(Lcom/jumio/core/scanpart/ScanPart;)V

    .line 324
    move-object p1, p2

    .line 325
    .line 326
    .line 327
    :goto_3
    invoke-virtual {p0, p1}, Lcom/jumio/sdk/credentials/JumioCredential;->setActiveScanPart$jumio_core_release(Lcom/jumio/sdk/scanpart/JumioScanPart;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 328
    monitor-exit p0

    .line 329
    return-object p1

    .line 330
    .line 331
    :cond_7
    :try_start_1
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 332
    .line 333
    const-string p2, "\'jumio-digital-identity\' module is required to handle digital documents!"

    .line 334
    .line 335
    .line 336
    invoke-direct {p1, p2}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 337
    throw p1

    .line 338
    .line 339
    :cond_8
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 340
    .line 341
    const-string p2, "Country/Document selection not found"

    .line 342
    .line 343
    .line 344
    invoke-direct {p1, p2}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 345
    throw p1

    .line 346
    .line 347
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 348
    .line 349
    const-string p2, "Please finish the active scan part first"

    .line 350
    .line 351
    .line 352
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 353
    throw p1

    .line 354
    .line 355
    :cond_a
    new-instance p2, Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    const-string p1, " not found"

    .line 364
    .line 365
    .line 366
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    .line 368
    .line 369
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 370
    move-result-object p1

    .line 371
    .line 372
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 376
    move-result-object p1

    .line 377
    .line 378
    .line 379
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 380
    throw p2

    .line 381
    .line 382
    :cond_b
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 383
    .line 384
    const-string p2, "Credential is not configured"

    .line 385
    .line 386
    .line 387
    invoke-direct {p1, p2}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 388
    throw p1

    .line 389
    .line 390
    :cond_c
    new-instance p1, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;

    .line 391
    .line 392
    const-string p2, "Credential is not active"

    .line 393
    .line 394
    .line 395
    invoke-direct {p1, p2}, Lcom/jumio/sdk/exceptions/SDKNotConfiguredException;-><init>(Ljava/lang/String;)V

    .line 396
    throw p1

    .line 397
    :goto_4
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 398
    throw p1
.end method

.method public isConfigured()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isValid()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 9
    .line 10
    check-cast v0, Ljumio/core/z0;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljumio/core/z0;->c()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return v0
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

.method public final isSupportedConfiguration(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)Z
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/document/JumioDocument;
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
    const-string v0, "document"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isValid()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    const/4 p1, 0x0

    .line 18
    return p1

    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 21
    .line 22
    check-cast v0, Ljumio/core/z0;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1, p2}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)Z

    .line 26
    move-result p1

    .line 27
    return p1
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

.method public final setConfiguration(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/jumio/sdk/document/JumioDocument;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "country"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "document"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isValid()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/jumio/sdk/credentials/JumioIDCredential;->isSupportedConfiguration(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->g:Ljumio/core/P1;

    .line 26
    .line 27
    check-cast v0, Ljumio/core/O1;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Ljumio/core/O1;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->a()V

    .line 34
    return-void

    .line 35
    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string p2, "The selected country/document combination is not valid"

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    throw p1
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public start$jumio_core_release()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->start$jumio_core_release()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "controller"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    const-class v2, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    check-cast v2, Lcom/jumio/core/models/ReusableIdLookupResult;

    .line 35
    .line 36
    iget-object v2, v2, Lcom/jumio/core/models/ReusableIdLookupResult;->a:Lcom/jumio/sdk/document/JumioDocumentType;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    new-instance v3, Lcom/jumio/sdk/document/JumioLookupResult;

    .line 41
    .line 42
    const-class v4, Lcom/jumio/core/models/LegalStatementModel;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v4}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    check-cast v1, Lcom/jumio/core/models/LegalStatementModel;

    .line 49
    .line 50
    iget-object v1, v1, Lcom/jumio/core/models/LegalStatementModel;->a:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, v2, v1}, Lcom/jumio/sdk/document/JumioLookupResult;-><init>(Lcom/jumio/sdk/document/JumioDocumentType;Ljava/lang/String;)V

    .line 54
    .line 55
    iput-object v3, v0, Ljumio/core/k2;->a:Lcom/jumio/sdk/document/JumioLookupResult;

    .line 56
    .line 57
    :cond_0
    iget-object v0, p0, Lcom/jumio/sdk/credentials/JumioIDCredential;->f:Ljumio/core/A0;

    .line 58
    .line 59
    check-cast v0, Ljumio/core/z0;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljumio/core/z0;->c()Z

    .line 63
    move-result v0

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->a()V

    .line 69
    :cond_1
    return-void
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

.method public final userConsented(Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;Z)V
    .locals 5
    .param p1    # Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "legalStatement"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->isValid()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioIDCredential;->b()Ljumio/core/G0;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v1, v1, Ljumio/core/G0;->j:Ljumio/core/k2;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/jumio/sdk/credentials/JumioCredential;->getController$jumio_core_release()Lcom/jumio/core/Controller;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    const-string v3, "controller"

    .line 29
    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    iget-object v3, v1, Ljumio/core/k2;->a:Lcom/jumio/sdk/document/JumioLookupResult;

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3}, Lcom/jumio/sdk/document/JumioLookupResult;->getDocumentType()Lcom/jumio/sdk/document/JumioDocumentType;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    iput-object v4, v1, Ljumio/core/k2;->b:Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    const-class v2, Lcom/jumio/core/models/LegalStatementModel;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v2}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Lcom/jumio/core/models/LegalStatementModel;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    iput-object p1, v1, Lcom/jumio/core/models/LegalStatementModel;->b:Lcom/jumio/sdk/document/JumioLookupResult$JumioLegalStatement;

    .line 71
    .line 72
    .line 73
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    iput-object p1, v1, Lcom/jumio/core/models/LegalStatementModel;->c:Ljava/lang/Boolean;

    .line 77
    .line 78
    sget-object p1, Lcom/jumio/analytics/Analytics;->Companion:Lcom/jumio/analytics/Analytics$Companion;

    .line 79
    .line 80
    new-instance v0, Lcom/jumio/analytics/MetaInfo;

    .line 81
    .line 82
    .line 83
    invoke-direct {v0}, Lcom/jumio/analytics/MetaInfo;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3}, Lcom/jumio/sdk/document/JumioDocumentType;->toString()Ljava/lang/String;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    const-string v2, "idType"

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 96
    move-result-object p2

    .line 97
    .line 98
    const-string v1, "IDShareConsent"

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 104
    .line 105
    const-string p2, "lookupResult"

    .line 106
    .line 107
    .line 108
    invoke-static {p2, v0}, Lcom/jumio/analytics/MobileEvents;->alert(Ljava/lang/String;Lcom/jumio/analytics/MetaInfo;)Lcom/jumio/analytics/AnalyticsEvent;

    .line 109
    move-result-object p2

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, p2}, Lcom/jumio/analytics/Analytics$Companion;->add(Lcom/jumio/analytics/AnalyticsEvent;)V

    .line 113
    :cond_1
    :goto_0
    return-void
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method
