.class public interface abstract Lcom/tencent/rmonitor/base/reporter/IReportCache;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/tencent/rmonitor/base/reporter/IReportCache;",
        "",
        "cacheReportData",
        "",
        "reportData",
        "Lcom/tencent/bugly/common/reporter/data/ReportData;",
        "cacheReportDataSync",
        "reportCacheData",
        "updateCacheDataStatus",
        "dbId",
        "",
        "status",
        "Lcom/tencent/rmonitor/base/db/DBDataStatus;",
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


# virtual methods
.method public abstract cacheReportData(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract cacheReportDataSync(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .param p1    # Lcom/tencent/bugly/common/reporter/data/ReportData;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract reportCacheData()V
.end method

.method public abstract updateCacheDataStatus(ILcom/tencent/rmonitor/base/db/DBDataStatus;)V
    .param p2    # Lcom/tencent/rmonitor/base/db/DBDataStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
