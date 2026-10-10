.class public Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;
.super Ljava/lang/Object;
.source "HeatMapService.java"


# static fields
.field private static instance:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;

.field private static mVTrack:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;


# direct methods
.method private constructor <init>()V
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

.method public static getInstance()Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->instance:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;-><init>()V

    .line 10
    .line 11
    sput-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->instance:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->instance:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public isServiceRunning()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->mVTrack:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/AbstractViewCrawler;->isServiceRunning()Z

    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public resume()V
    .locals 1

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->mVTrack:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/sensorsdata/analytics/android/sdk/visual/AbstractViewCrawler;->startUpdates()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    return-void

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 13
    :cond_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public start(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const/16 v2, 0x80

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    new-instance v0, Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 32
    goto :goto_0

    .line 33
    :catch_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    .line 36
    :cond_0
    :goto_0
    const-string v1, "com.sensorsdata.analytics.android.ResourcePackageName"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    :cond_1
    new-instance v1, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, p1, v0, p2, p3}, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;-><init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    sput-object v1, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->mVTrack:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/sensorsdata/analytics/android/sdk/visual/AbstractViewCrawler;->startUpdates()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    return-void

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 61
    return-void
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
.end method

.method public stop()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapService;->mVTrack:Lcom/sensorsdata/analytics/android/sdk/visual/HeatMapViewCrawler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/sensorsdata/analytics/android/sdk/visual/AbstractViewCrawler;->stopUpdates(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-void

    .line 10
    :catch_0
    move-exception v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 14
    :cond_0
    return-void
    .line 15
    .line 16
    .line 17
.end method
