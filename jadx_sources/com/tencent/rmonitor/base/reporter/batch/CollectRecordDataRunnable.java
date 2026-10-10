package com.tencent.rmonitor.base.reporter.batch;

import android.database.Cursor;
import android.os.Process;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.reporter.data.FileInfo;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.C33588ce;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33675gh;
import com.tencent.bugly.proguard.C33778lf;
import com.tencent.bugly.proguard.C33811n6;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.AttaEventTable;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.base.reporter.DiscardReason;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.common.util.AppVersionHelper;
import com.tencent.rmonitor.common.util.FileUtil;
import com.tencent.rmonitor.common.util.JsonUtil;
import com.tencent.rmonitor.sla.StatisticsReporter;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 52\u00020\u0001:\u00015B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0014J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002J$\u0010\u0016\u001a\u00020\r2\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0002J&\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0002J(\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0002J<\u0010\u001d\u001a\u00020\r2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\b\u0010 \u001a\u00020\rH\u0002J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u0018\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002J\b\u0010)\u001a\u00020\rH\u0016J\u001c\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nH\u0002J,\u0010+\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0002J\b\u0010/\u001a\u00020\u0012H\u0002J-\u00100\u001a\u00020-\"\u0004\b\u0000\u00101*\b\u0012\u0004\u0012\u0002H1022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H1\u0012\u0004\u0012\u00020-04H\u0082\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m90084d2 = {"Lcom/tencent/rmonitor/base/reporter/batch/CollectRecordDataRunnable;", "Ljava/lang/Runnable;", "()V", "lastExceptionFromCache", "Lorg/json/JSONObject;", "listIndex", "", "reportDataList", "Ljava/util/ArrayList;", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "Lkotlin/collections/ArrayList;", "reportDbDataRunnable", "appendExceptionLinkFlag", "", "reportData", "exception", "", "canReport", "", "map", "", "checkFileBeforeReport", "collectDbDataAndDeleteFile", "relatedLagDataList", "collectExceptionRelatedLagData", "couldReport", "hasWifi", "lastException", "isDebugMode", "dealBeforeReport", "inputList", "outputList", "deleteAllSentOrOverTime", "isTooLarge", "recordDiscardData", "dbDataStatus", "Lcom/tencent/rmonitor/base/db/DBDataStatus;", "discardReason", "Lcom/tencent/rmonitor/base/reporter/DiscardReason;", "reportDbData", "reportDbDataOneByOne", "run", "searchNoneSendValidData", "searchRangeData", "start", "", "end", "shouldReportCachedData", "sumByLong", ExifInterface.GPS_DIRECTION_TRUE, "", "selector", "Lkotlin/Function1;", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class CollectRecordDataRunnable implements Runnable {
    private static final long DELAY_NEXT_ITEM = 500;
    private static final long MAX_UPLOAD_SIZE_IN_MOBILE = 2097152;

    @NotNull
    private static final String TAG = "RMonitor_report_cache";

    @Nullable
    private JSONObject lastExceptionFromCache;
    private int listIndex;

    @NotNull
    private final ArrayList<ReportData> reportDataList = new ArrayList<>();

    @NotNull
    private final Runnable reportDbDataRunnable = new Runnable() { // from class: com.tencent.rmonitor.base.reporter.batch.a
        @Override // java.lang.Runnable
        public final void run() {
            CollectRecordDataRunnable.m103823reportDbDataRunnable$lambda0(this.f75210b);
        }
    };

    private final boolean couldReport(ReportData reportData, boolean hasWifi, boolean lastException, boolean isDebugMode) {
        if (!lastException && !isDebugMode && !hasWifi) {
            try {
                if (isTooLarge(reportData)) {
                    return false;
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(TAG, "couldReport error", th2);
            }
        }
        return true;
    }

    private final void collectDbDataAndDeleteFile(ArrayList<ReportData> relatedLagDataList) throws JSONException {
        this.reportDataList.clear();
        this.listIndex = 0;
        if (relatedLagDataList != null) {
            this.reportDataList.addAll(relatedLagDataList);
        }
        dealBeforeReport(searchNoneSendValidData(), this.reportDataList);
        ArrayList<ReportData> arrayListM73207a = C33675gh.m73207a();
        if (arrayListM73207a != null) {
            this.reportDataList.addAll(arrayListM73207a);
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d(TAG, "collect db data count: " + this.reportDataList.size());
        }
    }

    private final ArrayList<ReportData> collectExceptionRelatedLagData(JSONObject exception) throws JSONException {
        if (exception == null || !Intrinsics.areEqual("anr", exception.optString(C33820nf.f71149e))) {
            Logger.INSTANCE.mo77130d(TAG, "collectExceptionRelatedLagData fail for last exception is not anr.");
            return null;
        }
        String strOptString = exception.optString("process_launch_id");
        long jOptLong = exception.optLong(C33820nf.f71148d);
        ArrayList<ReportData> arrayListSearchRangeData = searchRangeData(jOptLong - ((long) 60000), jOptLong + ((long) 10));
        if (arrayListSearchRangeData == null) {
            Logger.INSTANCE.mo77130d(TAG, C33778lf.m73987a("collectExceptionRelatedLagData, targetProcessLaunchId: ", strOptString, ", empty"));
            return arrayListSearchRangeData;
        }
        ArrayList<ReportData> arrayList = new ArrayList<>();
        for (ReportData reportData : arrayListSearchRangeData) {
            String strM74311e = C33820nf.m74311e(reportData.getParams());
            if (Intrinsics.areEqual(strOptString, C33820nf.m74312f(reportData.getParams())) && Intrinsics.areEqual("looper_stack", strM74311e)) {
                String strOptString2 = exception.optString(C33820nf.f71149e);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "exception.optString(Repo…ataBuilder.KEY_BASE_TYPE)");
                appendExceptionLinkFlag(reportData, strOptString2);
                arrayList.add(reportData);
            }
        }
        Logger.INSTANCE.mo77130d(TAG, "collectExceptionRelatedLagData, targetProcessLaunchId: " + strOptString + ", count: " + arrayList.size());
        return arrayList;
    }

    private final void dealBeforeReport(ArrayList<ReportData> inputList, ArrayList<ReportData> outputList) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = outputList.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ReportData) it.next()).getDbId()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (inputList != null) {
            for (ReportData reportData : inputList) {
                if (!arrayList.contains(Integer.valueOf(reportData.getDbId())) && canReport(reportData, linkedHashMap)) {
                    outputList.add(reportData);
                    arrayList.add(Integer.valueOf(reportData.getDbId()));
                }
            }
        }
        Iterator<T> it2 = outputList.iterator();
        while (it2.hasNext()) {
            checkFileBeforeReport((ReportData) it2.next());
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d(TAG, "dealBeforeReport, count: " + outputList.size());
        }
    }

    private final void deleteAllSentOrOverTime() {
        DBHelper dBHelper;
        DBHandler dbHandler;
        Logger.INSTANCE.mo77130d(TAG, "deleteAllSentOrOverTime");
        FileUtil.Companion companion = FileUtil.INSTANCE;
        companion.deleteOvertimeFiles(companion.getRootPath(), 259200000);
        recordDiscardData(DBDataStatus.TO_SEND, DiscardReason.CACHE_EXPIRE);
        recordDiscardData(DBDataStatus.SENT_FAIL, DiscardReason.RETRY_EXCEEDED);
        for (String str : DBHandler.INSTANCE.getTABLES()) {
            try {
                Logger.INSTANCE.mo77130d(TAG, "table: " + str);
                if (!Intrinsics.areEqual(str, AttaEventTable.INSTANCE.getTableName()) && (dBHelper = BaseInfo.dbHelper) != null && (dbHandler = dBHelper.getDbHandler()) != null) {
                    dbHandler.deleteAllSentOrOverTime(str, true);
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.mo77131e(TAG, "delete expired data fail for " + th2.getMessage());
            }
        }
    }

    private final void recordDiscardData(DBDataStatus dbDataStatus, DiscardReason discardReason) {
        DBHandler dbHandler;
        Logger.INSTANCE.mo77130d(TAG, "recordDiscardData");
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 259200000);
        DBHelper dBHelper = BaseInfo.dbHelper;
        Cursor cursorQuery = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : dbHandler.query(ReportDataTable.INSTANCE.getTableName(), new String[]{ReportDataTable.COLUMN_PARAMS}, "status=? AND occur_time<?", new String[]{String.valueOf(dbDataStatus.getValue()), String.valueOf(jCurrentTimeMillis)}, (496 & 16) != 0 ? false : false, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? null : null, (496 & 128) != 0 ? null : null, (496 & 256) != 0 ? null : null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() > 0) {
                    while (cursorQuery.moveToNext()) {
                        JSONObject jSONObject = new JSONObject(cursorQuery.getString(cursorQuery.getColumnIndex(ReportDataTable.COLUMN_PARAMS)));
                        JsonUtil jsonUtil = JsonUtil.INSTANCE;
                        String strSafeGetJsonValue = jsonUtil.safeGetJsonValue(jSONObject, C33820nf.f71149e);
                        String strSafeGetJsonValue2 = jsonUtil.safeGetJsonValue(jSONObject, C33820nf.f71150f);
                        if (!TextUtils.isEmpty(strSafeGetJsonValue) && !TextUtils.isEmpty(strSafeGetJsonValue2)) {
                            StatisticsReporter.INSTANCE.getInstance().recordDiscard(strSafeGetJsonValue, strSafeGetJsonValue2, discardReason);
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
    }

    private final void reportDbDataOneByOne() {
        if (this.reportDataList.isEmpty()) {
            return;
        }
        boolean zIsWiFiConnectedRealtime = NetworkWatcher.INSTANCE.isWiFiConnectedRealtime();
        boolean z11 = this.lastExceptionFromCache != null;
        boolean zApkInDebug = AppVersionHelper.INSTANCE.apkInDebug(BaseInfo.app);
        int i11 = this.listIndex + 1;
        this.listIndex = i11;
        if (i11 <= this.reportDataList.size()) {
            ReportData reportData = this.reportDataList.get(this.listIndex - 1);
            Intrinsics.checkNotNullExpressionValue(reportData, "reportDataList[listIndex - 1]");
            ReportData reportData2 = reportData;
            if (couldReport(reportData2, zIsWiFiConnectedRealtime, z11, zApkInDebug)) {
                reportData2.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_ANY);
                reportData2.getReportStrategy().setRetryTimes(0);
                reportData2.getReportStrategy().setNeedCache(false);
                ReporterMachine.INSTANCE.reportNow(reportData2, null);
                Logger.INSTANCE.mo77132i(TAG, "reportDbDataOneByOne, success, total:" + this.reportDataList.size() + ", index:" + this.listIndex + ", cur: " + reportData2.getPluginName());
            } else {
                Logger.INSTANCE.mo77132i(TAG, "reportDbDataOneByOne failed, total:" + this.reportDataList.size() + ", index:" + this.listIndex + ", cur: " + reportData2.getPluginName());
            }
            ReporterMachine.INSTANCE.postDelayed(this.reportDbDataRunnable, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: reportDbDataRunnable$lambda-0, reason: not valid java name */
    public static final void m103823reportDbDataRunnable$lambda0(CollectRecordDataRunnable this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.reportDbDataOneByOne();
    }

    private final ArrayList<ReportData> searchNoneSendValidData() {
        DBHandler dbHandler;
        UserMeta userMeta = BaseInfo.userMeta;
        ReportDataTable reportDataTable = new ReportDataTable(userMeta.appId, AppInfo.INSTANCE.obtainProcessName(BaseInfo.app), userMeta.appVersion);
        DBHelper dBHelper = BaseInfo.dbHelper;
        Object objSearch = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : dbHandler.search(reportDataTable, new Function0<Object>() { // from class: com.tencent.rmonitor.base.reporter.batch.CollectRecordDataRunnable.searchNoneSendValidData.1
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return 1;
            }
        });
        if (objSearch instanceof ArrayList) {
            return (ArrayList) objSearch;
        }
        return null;
    }

    private final ArrayList<ReportData> searchRangeData(long start, long end) {
        DBHandler dbHandler;
        UserMeta userMeta = BaseInfo.userMeta;
        ReportDataTable reportDataTable = new ReportDataTable(userMeta.appId, AppInfo.INSTANCE.obtainProcessName(BaseInfo.app), userMeta.appVersion);
        reportDataTable.setSearchRange(start, end);
        DBHelper dBHelper = BaseInfo.dbHelper;
        Object objSearch = (dBHelper == null || (dbHandler = dBHelper.getDbHandler()) == null) ? null : dbHandler.search(reportDataTable, new Function0<Object>() { // from class: com.tencent.rmonitor.base.reporter.batch.CollectRecordDataRunnable.searchRangeData.1
            @Override // p852kotlin.jvm.functions.Function0
            @Nullable
            public final Object invoke() {
                return 2;
            }
        });
        if (objSearch instanceof ArrayList) {
            return (ArrayList) objSearch;
        }
        return null;
    }

    private final boolean shouldReportCachedData() {
        return NetworkWatcher.INSTANCE.isNetworkConnectedRealtime();
    }

    public final boolean canReport(@NotNull ReportData reportData, @NotNull Map<Integer, String> map) {
        String str;
        Intrinsics.checkNotNullParameter(reportData, "reportData");
        Intrinsics.checkNotNullParameter(map, "map");
        boolean z11 = false;
        if (reportData.isCurLaunchData()) {
            str = "current launch data";
        } else {
            int iMyPid = Process.myPid();
            if (!map.containsKey(Integer.valueOf(iMyPid))) {
                map.put(Integer.valueOf(iMyPid), ProcessUtil.INSTANCE.getProcessNameByCmdLine(iMyPid));
                Logger.INSTANCE.mo77130d(TAG, "filter, pid: " + iMyPid + ", name: " + map.get(Integer.valueOf(iMyPid)));
            }
            int iM74309c = C33820nf.m74309c(reportData.getParams());
            if (!map.containsKey(Integer.valueOf(iM74309c))) {
                map.put(Integer.valueOf(iM74309c), ProcessUtil.INSTANCE.getProcessNameByCmdLineInner(iM74309c));
                Logger.INSTANCE.mo77130d(TAG, "filter, pid: " + iM74309c + ", name: " + map.get(Integer.valueOf(iM74309c)));
            }
            z11 = map.get(Integer.valueOf(iM74309c)) == null || !TextUtils.equals(map.get(Integer.valueOf(iM74309c)), map.get(Integer.valueOf(iMyPid)));
            str = "same-named surviving process";
        }
        if (!z11 && Logger.debug) {
            String strOptString = reportData.getParams().optString(C33820nf.f71156l);
            Logger.INSTANCE.mo77130d(TAG, "filter data [" + strOptString + "] for " + str);
        }
        return z11;
    }

    @Override // java.lang.Runnable
    public void run() {
        Logger logger = Logger.INSTANCE;
        logger.mo77130d(TAG, "start collect cached data.");
        String currentProcessName = ProcessUtil.INSTANCE.getCurrentProcessName(C33598d3.m72772c());
        this.lastExceptionFromCache = C33588ce.m72684b().m72686a(currentProcessName);
        logger.mo77130d(TAG, "lastExceptionFromCache: " + this.lastExceptionFromCache);
        ArrayList<ReportData> arrayListCollectExceptionRelatedLagData = collectExceptionRelatedLagData(this.lastExceptionFromCache);
        deleteAllSentOrOverTime();
        if (!shouldReportCachedData()) {
            logger.mo77130d(TAG, "should not report cached data.");
            return;
        }
        C33588ce.m72684b().m72687a((C33978va) null, currentProcessName);
        collectDbDataAndDeleteFile(arrayListCollectExceptionRelatedLagData);
        reportDbData();
    }

    private final void appendExceptionLinkFlag(ReportData reportData, String exception) throws JSONException {
        reportData.getParams().put(C33820nf.f71168x, exception);
    }

    private final void checkFileBeforeReport(ReportData reportData) throws JSONException {
        if (reportData.getParams().has(C33820nf.f71160p)) {
            Object obj = reportData.getParams().get(C33820nf.f71160p);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has(C33811n6.f71045c)) {
                    String string = jSONObject.getString(C33811n6.f71045c);
                    Intrinsics.checkNotNullExpressionValue(string, "attributes.getString(\"fileObj\")");
                    reportData.addFile(string, true, true);
                }
            }
        }
    }

    private final boolean isTooLarge(ReportData reportData) {
        long length;
        String pluginName = reportData.getPluginName();
        int iHashCode = pluginName.hashCode();
        if (iHashCode != -1036388717) {
            if (iHashCode != -1009937852) {
                if (iHashCode != 130660606 || !pluginName.equals("java_memory_ceiling_hprof")) {
                    return false;
                }
            } else if (!pluginName.equals("fd_leak")) {
                return false;
            }
        } else if (!pluginName.equals("activity_leak")) {
            return false;
        }
        Iterator<T> it = reportData.getFileList().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            File file = new File(((FileInfo) it.next()).getFilePath());
            if (file.exists()) {
                length = file.length();
            } else {
                length = 0;
            }
            j11 += length;
        }
        Logger.INSTANCE.mo77130d(TAG, "isTooLarge, fileSize: " + j11);
        if (j11 > 2097152) {
            return true;
        }
        return false;
    }

    private final void reportDbData() {
        reportDbDataOneByOne();
    }

    private final <T> long sumByLong(Iterable<? extends T> iterable, Function1<? super T, Long> function1) {
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += function1.invoke(it.next()).longValue();
        }
        return jLongValue;
    }
}
