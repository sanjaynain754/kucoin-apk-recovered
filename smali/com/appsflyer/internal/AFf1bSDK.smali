.class public final Lcom/appsflyer/internal/AFf1bSDK;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/appsflyer/internal/AFg1zSDK;


# instance fields
.field private final getCurrencyIso4217Code:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final getMediationNetwork:Lcom/appsflyer/AppsFlyerProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/appsflyer/AppsFlyerProperties;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/appsflyer/AppsFlyerProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    iput-object p1, p0, Lcom/appsflyer/internal/AFf1bSDK;->getCurrencyIso4217Code:Landroid/content/Context;

    .line 14
    .line 15
    iput-object p2, p0, Lcom/appsflyer/internal/AFf1bSDK;->getMediationNetwork:Lcom/appsflyer/AppsFlyerProperties;

    .line 16
    return-void
    .line 17
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
.end method


# virtual methods
.method public final AFAdRevenueData()Lcom/appsflyer/internal/AFg1ySDK;
    .locals 12
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1bSDK;->getMediationNetwork:Lcom/appsflyer/AppsFlyerProperties;

    .line 3
    .line 4
    const-string v1, "enableTCFDataCollection"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    return-object v1

    .line 17
    .line 18
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/appsflyer/internal/AFf1bSDK;->getCurrencyIso4217Code:Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v2, "IABTCF_gdprApplies"

    .line 25
    const/4 v3, -0x1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 29
    move-result v6

    .line 30
    .line 31
    const-string v2, "IABTCF_CmpSdkID"

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 35
    move-result v7

    .line 36
    .line 37
    const-string v2, "IABTCF_PolicyVersion"

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 41
    move-result v5

    .line 42
    .line 43
    const-string v2, "IABTCF_CmpSdkVersion"

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 47
    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    const/4 v2, 0x1

    .line 49
    .line 50
    const-string v3, ""

    .line 51
    .line 52
    if-ne v6, v2, :cond_2

    .line 53
    .line 54
    :try_start_1
    const-string v2, "IABTCF_TCString"

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    goto :goto_0

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    move-object v3, v0

    .line 66
    :cond_2
    :goto_0
    move-object v9, v3

    .line 67
    goto :goto_1

    .line 68
    :catch_0
    move-exception v0

    .line 69
    move-object v5, v0

    .line 70
    goto :goto_2

    .line 71
    .line 72
    :goto_1
    new-instance v4, Lcom/appsflyer/internal/AFg1ySDK;

    .line 73
    .line 74
    .line 75
    invoke-direct/range {v4 .. v9}, Lcom/appsflyer/internal/AFg1ySDK;-><init>(IIIILjava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    return-object v4

    .line 77
    .line 78
    :goto_2
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 79
    .line 80
    sget-object v3, Lcom/appsflyer/internal/AFh1ySDK;->afErrorLogForExcManagerOnly:Lcom/appsflyer/internal/AFh1ySDK;

    .line 81
    .line 82
    const/16 v10, 0x78

    .line 83
    const/4 v11, 0x0

    .line 84
    .line 85
    const-string v4, "TCF data collection exception"

    .line 86
    const/4 v6, 0x0

    .line 87
    const/4 v7, 0x0

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v2 .. v11}, Lcom/appsflyer/internal/AFg1bSDK;->e$default(Lcom/appsflyer/internal/AFg1bSDK;Lcom/appsflyer/internal/AFh1ySDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 93
    return-object v1
    .line 94
    .line 95
.end method
