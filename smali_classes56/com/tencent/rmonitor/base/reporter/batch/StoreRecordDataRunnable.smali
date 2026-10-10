.class public final Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0008\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;",
        "Ljava/lang/Runnable;",
        "reportData",
        "Lcom/tencent/bugly/common/reporter/data/ReportData;",
        "(Lcom/tencent/bugly/common/reporter/data/ReportData;)V",
        "run",
        "",
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


# instance fields
.field private final reportData:Lcom/tencent/bugly/common/reporter/data/ReportData;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 1
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;->reportData:Lcom/tencent/bugly/common/reporter/data/ReportData;

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


# virtual methods
.method public run()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/tencent/bugly/common/meta/UserMeta;->appId:Ljava/lang/String;

    .line 7
    .line 8
    sget-object v3, Lcom/tencent/rmonitor/common/util/AppInfo;->Companion:Lcom/tencent/rmonitor/common/util/AppInfo$Companion;

    .line 9
    .line 10
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lcom/tencent/rmonitor/common/util/AppInfo$Companion;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->appVersion:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v4, p0, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;->reportData:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2, v3, v1, v4}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    sget-object v2, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable$run$dbId$1;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable$run$dbId$1;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0, v2}, Lcom/tencent/rmonitor/base/db/DBHandler;->insert(Lcom/tencent/rmonitor/base/db/BaseTable;Lkotlin/jvm/functions/Function0;)I

    .line 37
    move-result v0

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    move-result-object v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x0

    .line 44
    .line 45
    :goto_0
    iget-object v1, p0, Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;->reportData:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 46
    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    move-result v0

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setDbId(I)V

    .line 60
    return-void
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
