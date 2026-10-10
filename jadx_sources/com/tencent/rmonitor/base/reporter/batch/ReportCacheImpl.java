package com.tencent.rmonitor.base.reporter.batch;

import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.reporter.IReportCache;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppVersionHelper;
import com.tencent.rmonitor.sla.AttaDBManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/batch/ReportCacheImpl;", "Lcom/tencent/rmonitor/base/reporter/IReportCache;", "()V", "reportTask", "Ljava/lang/Runnable;", "cacheReportData", "", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "cacheReportDataSync", "getCollectDataDelay", "", "reportAttaData", "delay", "reportCacheData", "reportDbData", "updateCacheDataStatus", "dbId", "", "status", "Lcom/tencent/rmonitor/base/db/DBDataStatus;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ReportCacheImpl implements IReportCache {
    private static final long DELAY_NEXT_TRY = 3600000;
    private static final long ONE_MINUTE_IN_MS = 60000;
    private static final long ONE_SECOND_IN_MS = 1000;

    @NotNull
    private static final String TAG = "RMonitor_report_ReportCacheImpl";

    @NotNull
    private final Runnable reportTask = new Runnable() { // from class: com.tencent.rmonitor.base.reporter.batch.b
        @Override // java.lang.Runnable
        public final void run() {
            ReportCacheImpl.m103825reportTask$lambda0(this.f75211b);
        }
    };

    private final long getCollectDataDelay() {
        return AppVersionHelper.INSTANCE.apkInDebug(BaseInfo.app) ? 1000L : 60000L;
    }

    private final void reportAttaData(long delay) {
        ReporterMachine.INSTANCE.postDelayed(new Runnable() { // from class: com.tencent.rmonitor.base.reporter.batch.c
            @Override // java.lang.Runnable
            public final void run() {
                ReportCacheImpl.m103824reportAttaData$lambda1();
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reportAttaData$lambda-1, reason: not valid java name */
    public static final void m103824reportAttaData$lambda1() {
        AttaDBManager.INSTANCE.reportLocalData();
    }

    private final void reportDbData(long delay) {
        ReporterMachine.INSTANCE.postDelayed(this.reportTask, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reportTask$lambda-0, reason: not valid java name */
    public static final void m103825reportTask$lambda0(ReportCacheImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.INSTANCE.mo77130d(TAG, "report cache data");
        new CollectRecordDataRunnable().run();
        this$0.reportDbData(3600000L);
    }

    @Override // com.tencent.rmonitor.base.reporter.IReportCache
    public void cacheReportData(@NotNull ReportData reportData) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        ReporterMachine.INSTANCE.post(new StoreRecordDataRunnable(reportData));
    }

    @Override // com.tencent.rmonitor.base.reporter.IReportCache
    public void cacheReportDataSync(@NotNull ReportData reportData) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        if (reportData.getDbId() <= 0) {
            PluginController.INSTANCE.addPluginReportNum(reportData.getPluginName());
        }
        new StoreRecordDataRunnable(reportData).run();
    }

    @Override // com.tencent.rmonitor.base.reporter.IReportCache
    public void reportCacheData() {
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d("RMonitor_report_ReporterMachine", "reportCacheData");
        }
        long collectDataDelay = getCollectDataDelay();
        reportDbData(collectDataDelay);
        reportAttaData(collectDataDelay);
    }

    @Override // com.tencent.rmonitor.base.reporter.IReportCache
    public void updateCacheDataStatus(int dbId, @NotNull DBDataStatus status) {
        DBHelper dBHelper;
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(status, "status");
        if (dbId <= 0 || (dBHelper = BaseInfo.dbHelper) == null || (dbHandler = dBHelper.getDbHandler()) == null) {
            return;
        }
        dbHandler.updateStatus(ReportDataTable.INSTANCE.getTableName(), dbId, status.getValue());
    }
}
