package com.tencent.rmonitor.base.reporter.batch;

import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.common.util.AppInfo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/batch/StoreRecordDataRunnable;", "Ljava/lang/Runnable;", "reportData", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "(Lcom/tencent/bugly/common/reporter/data/ReportData;)V", "run", "", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class StoreRecordDataRunnable implements Runnable {

    @NotNull
    private final ReportData reportData;

    public StoreRecordDataRunnable(@NotNull ReportData reportData) {
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        this.reportData = reportData;
    }

    @Override // java.lang.Runnable
    public void run() {
        DBHandler dbHandler;
        UserMeta userMeta = BaseInfo.userMeta;
        ReportDataTable reportDataTable = new ReportDataTable(userMeta.appId, AppInfo.INSTANCE.obtainProcessName(BaseInfo.app), userMeta.appVersion, this.reportData);
        DBHelper dBHelper = BaseInfo.dbHelper;
        Integer numValueOf = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : Integer.valueOf(dbHandler.insert(reportDataTable, new Function0<Integer>() { // from class: com.tencent.rmonitor.base.reporter.batch.StoreRecordDataRunnable$run$dbId$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p852kotlin.jvm.functions.Function0
            @NotNull
            public final Integer invoke() {
                return 0;
            }
        }));
        ReportData reportData = this.reportData;
        reportData.setDbId(numValueOf != null ? numValueOf.intValue() : reportData.getDbId());
    }
}
