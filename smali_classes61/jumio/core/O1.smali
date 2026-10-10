.class public final Ljumio/core/O1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljumio/core/P1;


# instance fields
.field public final a:Lcom/jumio/core/Controller;

.field public final b:Ljumio/core/A0;

.field public final c:Ljumio/core/G0;


# direct methods
.method public constructor <init>(Lcom/jumio/core/Controller;Ljumio/core/A0;Ljumio/core/G0;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "controller"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "countrySelection"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "data"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    .line 21
    .line 22
    iput-object p2, p0, Ljumio/core/O1;->b:Ljumio/core/A0;

    .line 23
    .line 24
    iput-object p3, p0, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 25
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/jumio/core/data/document/DocumentPart;Lcom/jumio/core/models/PhysicalSelectionModel;)Lcom/jumio/core/models/PhysicalIdScanPartModel;
    .locals 11

    .line 9
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getAutomaticBarcodeExtraction()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v0

    sget-object v2, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 11
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    move-result-object v0

    sget-object v2, Ljumio/core/W2;->e:Ljumio/core/W2;

    invoke-interface {v0, v2}, Lcom/jumio/core/plugins/PluginRegistryInterface;->hasPlugin(Ljumio/core/W2;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 12
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v0

    .line 13
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/jumio/core/data/ScanMode;

    .line 15
    sget-object v5, Lcom/jumio/core/data/ScanMode;->PDF417:Lcom/jumio/core/data/ScanMode;

    if-eq v4, v5, :cond_0

    .line 16
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    move-object v7, v2

    goto :goto_2

    .line 17
    :cond_2
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v2

    goto :goto_1

    .line 18
    :goto_2
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SettingsModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/SettingsModel;->getAutomaticBarcodeExtraction()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 19
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getExtraction()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/jumio/core/data/ScanMode;->DOCFINDER:Lcom/jumio/core/data/ScanMode;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 20
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getPluginRegistry()Lcom/jumio/core/plugins/PluginRegistryInterface;

    move-result-object v0

    sget-object v2, Ljumio/core/W2;->e:Ljumio/core/W2;

    invoke-interface {v0, v2}, Lcom/jumio/core/plugins/PluginRegistryInterface;->hasPlugin(Ljumio/core/W2;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 21
    sget-object v0, Lcom/jumio/core/data/ScanMode;->PDF417:Lcom/jumio/core/data/ScanMode;

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :goto_3
    move-object v8, v0

    goto :goto_4

    .line 22
    :cond_3
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto :goto_3

    .line 23
    :goto_4
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/SupplementalImageModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/SupplementalImageModel;

    invoke-virtual {v0}, Lcom/jumio/core/models/SupplementalImageModel;->getImageConfigs()Ljava/util/List;

    move-result-object v0

    .line 24
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/jumio/core/models/SupplementalImageConfig;

    .line 26
    invoke-virtual {v2}, Lcom/jumio/core/models/SupplementalImageConfig;->getSide()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v4, "toLowerCase(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 27
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 28
    :cond_5
    iget-object v0, p0, Ljumio/core/O1;->a:Lcom/jumio/core/Controller;

    invoke-virtual {v0}, Lcom/jumio/core/Controller;->getDataManager()Lcom/jumio/core/persistence/DataManager;

    move-result-object v0

    const-class v1, Lcom/jumio/core/models/CameraChallengeModel;

    invoke-virtual {v0, v1}, Lcom/jumio/core/persistence/DataManager;->get(Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/jumio/core/models/CameraChallengeModel;

    .line 29
    iget-object v0, v0, Lcom/jumio/core/models/CameraChallengeModel;->a:Ljava/util/List;

    .line 30
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljumio/core/V;

    .line 31
    iget-object v2, v2, Ljumio/core/V;->a:Lcom/jumio/sdk/enums/JumioCredentialPart;

    .line 32
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v3

    if-ne v2, v3, :cond_6

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    .line 33
    :goto_6
    check-cast v1, Ljumio/core/V;

    if-eqz v1, :cond_8

    .line 34
    iget-object v0, p0, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 35
    iget-object v0, v0, Lcom/jumio/core/models/CredentialDataModel;->a:Ljava/lang/String;

    .line 36
    const-string v2, "id"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-static {v1, v0}, Ljumio/core/Y;->a(Ljumio/core/V;Ljava/lang/String;)Ljumio/core/W;

    move-result-object v0

    :goto_7
    move-object v10, v0

    goto :goto_8

    .line 38
    :cond_8
    new-instance v0, Ljumio/core/W;

    invoke-direct {v0}, Ljumio/core/W;-><init>()V

    goto :goto_7

    .line 39
    :goto_8
    new-instance v3, Lcom/jumio/core/models/PhysicalIdScanPartModel;

    .line 40
    invoke-virtual {p1}, Lcom/jumio/core/data/document/DocumentPart;->getSide()Lcom/jumio/sdk/enums/JumioCredentialPart;

    move-result-object v4

    const/4 p1, 0x0

    .line 41
    invoke-interface {v7, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Lcom/jumio/core/data/ScanMode;

    move-object v6, p2

    .line 42
    invoke-direct/range {v3 .. v10}, Lcom/jumio/core/models/PhysicalIdScanPartModel;-><init>(Lcom/jumio/sdk/enums/JumioCredentialPart;Lcom/jumio/core/data/ScanMode;Lcom/jumio/core/models/PhysicalSelectionModel;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljumio/core/W;)V

    return-object v3
.end method

.method public final a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)V
    .locals 2

    const-string v0, "country"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "document"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Ljumio/core/O1;->b:Ljumio/core/A0;

    check-cast v0, Ljumio/core/z0;

    invoke-virtual {v0, p1, p2}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDocument;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    instance-of v0, p2, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    if-eqz v0, :cond_1

    .line 3
    iget-object v0, p0, Ljumio/core/O1;->b:Ljumio/core/A0;

    move-object v1, p2

    check-cast v1, Lcom/jumio/sdk/document/JumioPhysicalDocument;

    check-cast v0, Ljumio/core/z0;

    invoke-virtual {v0, p1, v1}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioPhysicalDocument;)V

    goto :goto_0

    .line 4
    :cond_1
    instance-of v0, p2, Lcom/jumio/sdk/document/JumioDigitalDocument;

    if-eqz v0, :cond_2

    .line 5
    iget-object v0, p0, Ljumio/core/O1;->b:Ljumio/core/A0;

    move-object v1, p2

    check-cast v1, Lcom/jumio/sdk/document/JumioDigitalDocument;

    check-cast v0, Ljumio/core/z0;

    invoke-virtual {v0, p1, v1}, Ljumio/core/z0;->a(Ljava/lang/String;Lcom/jumio/sdk/document/JumioDigitalDocument;)V

    .line 6
    :cond_2
    :goto_0
    iget-object v0, p0, Ljumio/core/O1;->c:Ljumio/core/G0;

    .line 7
    iput-object p1, v0, Ljumio/core/G0;->k:Ljava/lang/String;

    .line 8
    iput-object p2, v0, Ljumio/core/G0;->l:Lcom/jumio/sdk/document/JumioDocument;

    return-void
.end method
