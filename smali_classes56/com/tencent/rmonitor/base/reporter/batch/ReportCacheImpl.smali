.class public final Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/base/reporter/IReportCache;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016J\u0008\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0008\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;",
        "Lcom/tencent/rmonitor/base/reporter/IReportCache;",
        "()V",
        "reportTask",
        "Ljava/lang/Runnable;",
        "cacheReportData",
        "",
        "reportData",
        "Lcom/tencent/bugly/common/reporter/data/ReportData;",
        "cacheReportDataSync",
        "getCollectDataDelay",
        "",
        "reportAttaData",
        "delay",
        "reportCacheData",
        "reportDbData",
        "updateCacheDataStatus",
        "dbId",
        "",
        "status",
        "Lcom/tencent/rmonitor/base/db/DBDataStatus;",
        "Companion",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DELAY_NEXT_TRY:J = 0x36ee80L

.field private static final ONE_MINUTE_IN_MS:J = 0xea60L

.field private static final ONE_SECOND_IN_MS:J = 0x3e8L

.field private static final TAG:Ljava/lang/String; = "RMonitor_report_ReportCacheImpl"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final reportTask:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->Companion:Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl$Companion;

    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/rmonitor/base/reporter/batch/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/tencent/rmonitor/base/reporter/batch/b;-><init>(Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;)V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportTask:Ljava/lang/Runnable;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportTask$lambda-0(Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public static synthetic b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportAttaData$lambda-1()V

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
.end method

.method private final getCollectDataDelay()J
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/util/AppVersionHelper;->INSTANCE:Lcom/tencent/rmonitor/common/util/AppVersionHelper;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/util/AppVersionHelper;->apkInDebug(Landroid/content/Context;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-wide/16 v0, 0x3e8

    .line 13
    return-wide v0

    .line 14
    .line 15
    .line 16
    :cond_0
    const-wide/32 v0, 0xea60

    .line 17
    return-wide v0
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

.method private final reportAttaData(J)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 3
    .line 4
    new-instance v1, Lcom/tencent/rmonitor/base/reporter/batch/c;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/tencent/rmonitor/base/reporter/batch/c;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->postDelayed(Ljava/lang/Runnable;J)V

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final reportAttaData$lambda-1()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/sla/AttaDBManager;->INSTANCE:Lcom/tencent/rmonitor/sla/AttaDBManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/sla/AttaDBManager;->reportLocalData()V

    .line 6
    return-void
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

.method private final reportDbData(J)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportTask:Ljava/lang/Runnable;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, p1, p2}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->postDelayed(Ljava/lang/Runnable;J)V

    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private static final reportTask$lambda-0(Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "this$0"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    .line 9
    const-string v1, "RMonitor_report_ReportCacheImpl"

    .line 10
    .line 11
    const-string v2, "report cache data"

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 19
    .line 20
    new-instance v0, Lcom/tencent/rmonitor/base/reporter/batch/CollectRecordDataRunnable;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/tencent/rmonitor/base/reporter/batch/CollectRecordDataRunnable;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/reporter/batch/CollectRecordDataRunnable;->run()V

    .line 27
    .line 28
    .line 29
    const-wide/32 v0, 0x36ee80

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportDbData(J)V

    .line 33
    return-void
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


# virtual methods
.method public cacheReportData(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 2
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "reportData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 8
    .line 9
    new-instance v1, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, p1}, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;-><init>(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->post(Ljava/lang/Runnable;)V

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
.end method

.method public cacheReportDataSync(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 2
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "reportData"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getPluginName()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->addPluginReportNum(Ljava/lang/String;)V

    .line 21
    .line 22
    :cond_0
    new-instance v0, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, p1}, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;-><init>(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;->run()V

    .line 29
    return-void
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
.end method

.method public reportCacheData()V
    .locals 3

    .line 1
    .line 2
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 7
    .line 8
    const-string v1, "RMonitor_report_ReporterMachine"

    .line 9
    .line 10
    const-string v2, "reportCacheData"

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->getCollectDataDelay()J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportDbData(J)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;->reportAttaData(J)V

    .line 28
    return-void
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

.method public updateCacheDataStatus(ILcom/tencent/rmonitor/base/db/DBDataStatus;)V
    .locals 4
    .param p2    # Lcom/tencent/rmonitor/base/db/DBDataStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "status"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-lez p1, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object v1, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;->Companion:Lcom/tencent/rmonitor/base/db/table/ReportDataTable$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable$Companion;->getTableName()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    int-to-long v2, p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/tencent/rmonitor/base/db/DBDataStatus;->getValue()I

    .line 28
    move-result p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/tencent/rmonitor/base/db/DBHandler;->updateStatus(Ljava/lang/String;JI)I

    .line 32
    :cond_0
    return-void
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
