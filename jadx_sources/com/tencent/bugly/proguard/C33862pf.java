package com.tencent.bugly.proguard;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import p852kotlin.Pair;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33862pf implements InterfaceC33841of {

    /* JADX INFO: renamed from: a */
    public final Function0<Integer> f71434a = new a();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pf$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Function0<Integer> {
        @Override // p852kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer invoke() {
            return 0;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m74565a(int i11) {
        return (i11 == -1 || i11 == -2) ? false : true;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33841of
    /* JADX INFO: renamed from: b */
    public boolean mo74451b(ReportData reportData) {
        if (reportData == null) {
            return false;
        }
        if (reportData.getDbId() == 0) {
            return mo74453d(reportData);
        }
        ReportDataTable reportDataTableM74567e = m74567e(reportData);
        DBHandler dBHandlerM74564a = m74564a();
        if (dBHandlerM74564a != null) {
            ContentValues contentValuesMakeContentValues = reportDataTableM74567e.makeContentValues();
            contentValuesMakeContentValues.put("_id", Integer.valueOf(reportData.getDbId()));
            int iReplace = dBHandlerM74564a.replace(ReportDataTable.TABLE_REPORT_DATA, "_id", contentValuesMakeContentValues);
            if (m74565a(iReplace)) {
                reportData.setDbId(iReplace);
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33841of
    /* JADX INFO: renamed from: c */
    public boolean mo74452c(ReportData reportData) {
        if (reportData == null) {
            return false;
        }
        ReportDataTable reportDataTableM74567e = m74567e(reportData);
        DBHandler dBHandlerM74564a = m74564a();
        if (dBHandlerM74564a != null) {
            Pair<String, String[]> whereAndArgs = reportDataTableM74567e.getWhereAndArgs();
            if (dBHandlerM74564a.delete(ReportDataTable.TABLE_REPORT_DATA, whereAndArgs.getFirst(), whereAndArgs.getSecond()) > 0) {
                reportData.setDbId(0);
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33841of
    /* JADX INFO: renamed from: a */
    public boolean mo74450a(ReportData reportData) {
        return m74566a(reportData, DBDataStatus.SENT);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33841of
    /* JADX INFO: renamed from: d */
    public boolean mo74453d(ReportData reportData) {
        return m74566a(reportData, DBDataStatus.TO_SEND);
    }

    /* JADX INFO: renamed from: e */
    public ReportDataTable m74567e(@NonNull ReportData reportData) {
        UserMeta userMeta = BaseInfo.userMeta;
        return new ReportDataTable(userMeta.appId, ProcessUtil.getCurrentProcessName(C33598d3.m72772c()), userMeta.appVersion, reportData);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74566a(ReportData reportData, DBDataStatus dBDataStatus) {
        DBHandler dBHandlerM74564a;
        if (reportData != null && (dBHandlerM74564a = m74564a()) != null) {
            ReportDataTable reportDataTableM74567e = m74567e(reportData);
            reportDataTableM74567e.setInsertStatus(dBDataStatus);
            int iInsert = dBHandlerM74564a.insert(reportDataTableM74567e, this.f71434a);
            if (m74565a(iInsert)) {
                reportData.setDbId(iInsert);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public DBHandler m74564a() {
        DBHelper dBHelper = BaseInfo.dbHelper;
        if (dBHelper != null) {
            return dBHelper.getDbHandler();
        }
        return null;
    }
}
