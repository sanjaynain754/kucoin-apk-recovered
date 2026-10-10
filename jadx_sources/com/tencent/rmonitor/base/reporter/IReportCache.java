package com.tencent.rmonitor.base.reporter;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/IReportCache;", "", "cacheReportData", "", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "cacheReportDataSync", "reportCacheData", "updateCacheDataStatus", "dbId", "", "status", "Lcom/tencent/rmonitor/base/db/DBDataStatus;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public interface IReportCache {
    void cacheReportData(@NotNull ReportData reportData);

    void cacheReportDataSync(@NotNull ReportData reportData);

    void reportCacheData();

    void updateCacheDataStatus(int dbId, @NotNull DBDataStatus status);
}
