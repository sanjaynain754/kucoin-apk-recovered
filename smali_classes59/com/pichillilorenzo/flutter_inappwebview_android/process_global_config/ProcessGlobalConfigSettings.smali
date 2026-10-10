.class public Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings<",
        "Landroidx/webkit/ProcessGlobalConfig;",
        ">;"
    }
.end annotation


# static fields
.field public static final LOG_TAG:Ljava/lang/String; = "ProcessGlobalConfigSettings"


# instance fields
.field public dataDirectorySuffix:Ljava/lang/String;

.field public directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;


# direct methods
.method public constructor <init>()V
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
.end method


# virtual methods
.method public getRealSettings(Landroidx/webkit/ProcessGlobalConfig;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/webkit/ProcessGlobalConfig;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->toMap()Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getRealSettings(Ljava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Landroidx/webkit/ProcessGlobalConfig;

    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->getRealSettings(Landroidx/webkit/ProcessGlobalConfig;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/ISettings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;

    move-result-object p1

    return-object p1
.end method

.method public parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;"
        }
    .end annotation

    .line 2
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 3
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 4
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "dataDirectorySuffix"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "directoryBasePaths"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    new-instance v1, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    invoke-direct {v1}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;-><init>()V

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v1, v0}, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->parse(Ljava/util/Map;)Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    move-result-object v0

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    goto :goto_0

    .line 7
    :cond_2
    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    goto :goto_0

    :cond_3
    return-object p0
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "dataDirectorySuffix"

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public toProcessGlobalConfig(Landroid/content/Context;)Landroidx/webkit/ProcessGlobalConfig;
    .locals 4

    .line 1
    .line 2
    new-instance v0, Landroidx/webkit/ProcessGlobalConfig;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/webkit/ProcessGlobalConfig;-><init>()V

    .line 6
    .line 7
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX"

    .line 12
    .line 13
    .line 14
    invoke-static {p1, v1}, Landroidx/webkit/WebViewFeature;->isStartupFeatureSupported(Landroid/content/Context;Ljava/lang/String;)Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->dataDirectorySuffix:Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Landroidx/webkit/ProcessGlobalConfig;->setDataDirectorySuffix(Landroid/content/Context;Ljava/lang/String;)Landroidx/webkit/ProcessGlobalConfig;

    .line 23
    .line 24
    :cond_0
    iget-object v1, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const-string v1, "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS"

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1}, Landroidx/webkit/WebViewFeature;->isStartupFeatureSupported(Landroid/content/Context;Ljava/lang/String;)Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    new-instance v1, Ljava/io/File;

    .line 37
    .line 38
    iget-object v2, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 39
    .line 40
    iget-object v2, v2, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->dataDirectoryBasePath:Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    new-instance v2, Ljava/io/File;

    .line 46
    .line 47
    iget-object v3, p0, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings;->directoryBasePaths:Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;

    .line 48
    .line 49
    iget-object v3, v3, Lcom/pichillilorenzo/flutter_inappwebview_android/process_global_config/ProcessGlobalConfigSettings$DirectoryBasePaths;->cacheDirectoryBasePath:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1, v1, v2}, Landroidx/webkit/ProcessGlobalConfig;->setDirectoryBasePaths(Landroid/content/Context;Ljava/io/File;Ljava/io/File;)Landroidx/webkit/ProcessGlobalConfig;

    .line 56
    :cond_1
    return-object v0
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
.end method
