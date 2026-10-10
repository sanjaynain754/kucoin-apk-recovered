package com.tencent.rmonitor.looper;

import android.app.Application;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.IReporter;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.C33694hf;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33749k7;
import com.tencent.bugly.proguard.C33753kb;
import com.tencent.bugly.proguard.C33770l7;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33862pf;
import com.tencent.bugly.proguard.C33868q0;
import com.tencent.bugly.proguard.C34011x3;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.LooperMeta;
import com.tencent.rmonitor.base.p144db.DBDataStatus;
import com.tencent.rmonitor.base.p144db.DBHandler;
import com.tencent.rmonitor.base.p144db.DBHelper;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import com.tencent.rmonitor.base.plugin.listener.ILooperListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.common.util.FileUtil;
import com.tencent.rmonitor.looper.LooperReport;
import com.tencent.rmonitor.sla.AttaEvent;
import com.tencent.rmonitor.sla.AttaEventReporter;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/LooperReport;", "", "()V", "COLLECT_STACK_MSG_MAX_DELAY", "", "HAS_FULL_STACK", "", "LONG_LAG_LIMIT", "MAX_LONG_LAG_MAP_SIZE", "", "NO_FULL_STACK", "TAG", "longLagMap", "Ljava/util/HashMap;", "Lcom/tencent/bugly/common/reporter/data/ReportData;", "Lkotlin/collections/HashMap;", "buildReportData", "monitorInfo", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "cancelCachedReportData", "", "reportData", "checkValid", "", "dealLongLag", "gotoReport", "gotoReportInner", "realReport", "reportSLA", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LooperReport {
    private static final long COLLECT_STACK_MSG_MAX_DELAY = 20;

    @NotNull
    private static final String HAS_FULL_STACK = "1";
    private static final long LONG_LAG_LIMIT = 5000;
    private static final int MAX_LONG_LAG_MAP_SIZE = 20;

    @NotNull
    private static final String NO_FULL_STACK = "0";

    @NotNull
    private static final String TAG = "RMonitor_lag_report";

    @NotNull
    public static final LooperReport INSTANCE = new LooperReport();

    @NotNull
    private static final HashMap<Long, ReportData> longLagMap = new HashMap<>(20);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: cancelCachedReportData$lambda-0, reason: not valid java name */
    public static final void m103830cancelCachedReportData$lambda0(ReportData reportData) {
        DBHelper dBHelper;
        DBHandler dbHandler;
        Intrinsics.checkNotNullParameter(reportData, "$reportData");
        if (reportData.getDbId() > 0 && (dBHelper = BaseInfo.dbHelper) != null && (dbHandler = dBHelper.getDbHandler()) != null) {
            dbHandler.updateStatus(ReportDataTable.INSTANCE.getTableName(), reportData.getDbId(), DBDataStatus.SENT.getValue());
        }
        if (Logger.debug) {
            Logger.INSTANCE.mo77130d(TAG, C33770l7.m73937a("deal cached report data, clientIdentify: ", reportData.getParams().optString(C33820nf.f71156l)));
        }
    }

    private final boolean checkValid(MonitorInfo monitorInfo) {
        C33694hf pluginConfig = LooperConfig.INSTANCE.getPluginConfig("looper_stack");
        C33753kb c33753kb = pluginConfig instanceof C33753kb ? (C33753kb) pluginConfig : null;
        boolean z11 = true;
        if (c33753kb != null && c33753kb.m73794e()) {
            long duration = monitorInfo.getDuration();
            if (duration > c33753kb.m73796g()) {
                Logger.INSTANCE.mo77132i(TAG, "not valid sample for " + duration + " exceed " + c33753kb.m73796g());
                return false;
            }
            int collectStackMsgCount = monitorInfo.getCollectStackMsgCount();
            long j11 = monitorInfo.getLagParam().f71553d;
            long j12 = collectStackMsgCount;
            long j13 = duration - (j11 * j12);
            long jM73795f = (c33753kb.m73795f() * j12) + j11;
            if (collectStackMsgCount < c33753kb.m73798i() && j13 > jM73795f) {
                z11 = false;
            }
            if (!z11) {
                Logger.INSTANCE.mo77132i(TAG, "not valid sample for {totalCost: " + duration + ", sliceCount: " + collectStackMsgCount + ", stackInterval: " + j11 + ", delay: " + j13 + ", delayLimit: " + jM73795f + '}');
            }
        }
        return z11;
    }

    private final boolean realReport(ReportData reportData, MonitorInfo monitorInfo) {
        try {
            LooperMeta looperMeta = new LooperMeta(reportData.getParams(), monitorInfo.getThreadId(), monitorInfo.getThreadName());
            Iterator it = ListenerManager.looperListener.getListenerList().iterator();
            while (it.hasNext()) {
                ((ILooperListener) it.next()).onBeforeReport(looperMeta);
            }
            if (PluginController.INSTANCE.whetherPluginReportSampling("looper_stack")) {
                IReporter.DefaultImpls.reportNow$default(ReporterMachine.INSTANCE, reportData, null, 2, null);
                return true;
            }
            if (!Logger.verbos) {
                return true;
            }
            Logger.INSTANCE.mo77133v(TAG, "miss report for sampling. [ThreadName: " + monitorInfo.getThreadName() + ", CostInMs: " + monitorInfo.getDuration() + ", Scene: " + monitorInfo.getScene() + ", Foreground: " + monitorInfo.getIsAppInForeground() + ']');
            return true;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77134w(TAG, "looper data may be error, " + th2.getMessage());
            return false;
        }
    }

    public final boolean gotoReport(@NotNull MonitorInfo monitorInfo) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        boolean zGotoReportInner = monitorInfo.getFullStack() != null ? gotoReportInner(monitorInfo) : false;
        reportSLA(monitorInfo);
        return zGotoReportInner;
    }

    private LooperReport() {
    }

    private final ReportData buildReportData(MonitorInfo monitorInfo) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectM74302a = C33820nf.m74302a();
        jSONObjectM74302a.put("process_name", AppInfo.INSTANCE.obtainProcessName(BaseInfo.app));
        jSONObjectM74302a.put("time_cost", monitorInfo.getDuration());
        jSONObjectM74302a.put("stage", monitorInfo.getScene());
        jSONObjectM74302a.put("stack_interval", monitorInfo.getLagParam().f71553d);
        jSONObjectM74302a.put("start_time", monitorInfo.getLastStackRequestTime());
        jSONObjectM74302a.put("monitored_thread_name", monitorInfo.getThreadName());
        jSONObjectM74302a.put("app_in_foreground", monitorInfo.getIsAppInForeground());
        jSONObjectM74302a.put("detect_strategy", monitorInfo.getLagParam().f71555f);
        C34011x3.a.f72491a.m75426a(false, "looper_stack", monitorInfo.getScene(), jSONObjectM74302a);
        C34011x3.a.f72491a.m75424a(jSONObjectM74302a);
        if (jSONObjectM74302a.has(C33820nf.f71130I)) {
            jSONObject = jSONObjectM74302a.getJSONObject(C33820nf.f71130I);
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("detect_strategy", monitorInfo.getLagParam().f71555f);
        jSONObjectM74302a.put(C33820nf.f71130I, jSONObject);
        JSONObject jSONObjectM73733a = C33749k7.d.f70597a.m73733a(monitorInfo.getLastStackRequestTime() - 1000, monitorInfo.getDuration() + monitorInfo.getLastStackRequestTime());
        if (jSONObjectM73733a != null) {
            jSONObjectM74302a.put(C33820nf.f71136O, jSONObjectM73733a);
        }
        Application application = BaseInfo.app;
        UserMeta userMeta = BaseInfo.userMeta;
        JSONObject params = C33820nf.m74303a(application, InterfaceC33617e1.f69652a, "looper_stack", userMeta);
        params.put(C33820nf.f71160p, jSONObjectM74302a);
        long duration = monitorInfo.getDuration() + monitorInfo.getLastStackRequestTime();
        params.put(C33820nf.f71148d, duration);
        params.put("event_time", duration / 1000);
        String str = userMeta.uin;
        Intrinsics.checkNotNullExpressionValue(params, "params");
        ReportData reportData = new ReportData(str, 1, "Looper single", params);
        reportData.setShouldRecordLinkData(true);
        if (monitorInfo.checkUseFileToTransStacks()) {
            FileUtil.Companion companion = FileUtil.INSTANCE;
            String strMakeTempFileName = companion.makeTempFileName("rmonitor_trace", JPushConstants.Analysis.KEY_JSON);
            File file = new File(companion.getTempPath(), strMakeTempFileName);
            companion.writeFile(file.getAbsolutePath(), String.valueOf(monitorInfo.getFullStack()), false);
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            reportData.addFile(absolutePath, true, true);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("file_stacks", strMakeTempFileName);
            params.put(C33820nf.f71161q, jSONObject2);
            return reportData;
        }
        params.put(C33820nf.f71161q, monitorInfo.getFullStack());
        return reportData;
    }

    private final void cancelCachedReportData(final ReportData reportData) {
        long j11;
        if (reportData.getDbId() == 0) {
            j11 = 1000;
        } else {
            j11 = 200;
        }
        ThreadManager.INSTANCE.runInMonitorThread(new Runnable() { // from class: fc0.a
            @Override // java.lang.Runnable
            public final void run() {
                LooperReport.m103830cancelCachedReportData$lambda0(reportData);
            }
        }, j11);
    }

    private final void dealLongLag(MonitorInfo monitorInfo, ReportData reportData) {
        if (monitorInfo.getIsDetectedLongLag()) {
            HashMap<Long, ReportData> map = longLagMap;
            if (map.size() >= 20) {
                map.clear();
            }
            map.put(Long.valueOf(monitorInfo.getLastStackRequestTime()), reportData);
            reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_NEXT_LAUNCH);
            if (Logger.verbos) {
                String strOptString = reportData.getParams().optString(C33820nf.f71156l);
                Logger.INSTANCE.mo77133v(TAG, "record unfinished long lag clientIdentify, duration: " + monitorInfo.getDuration() + ", requestTime: " + monitorInfo.getLastStackRequestTime() + ", clientIdentify: " + strOptString);
                return;
            }
            return;
        }
        if (monitorInfo.getDuration() >= 5000) {
            ReportData reportDataRemove = longLagMap.remove(Long.valueOf(monitorInfo.getLastStackRequestTime()));
            if (reportDataRemove != null) {
                cancelCachedReportData(reportDataRemove);
            }
            if (Logger.verbos) {
                String strOptString2 = reportData.getParams().optString(C33820nf.f71156l);
                Logger.INSTANCE.mo77133v(TAG, "deal finished long lag clientIdentify, duration: " + monitorInfo.getDuration() + ", requestTime: " + monitorInfo.getLastStackRequestTime() + ", clientIdentify: " + strOptString2);
            }
        }
    }

    private final boolean gotoReportInner(MonitorInfo monitorInfo) throws JSONException {
        ReportData reportDataBuildReportData = buildReportData(monitorInfo);
        dealLongLag(monitorInfo, reportDataBuildReportData);
        if (checkValid(monitorInfo)) {
            return realReport(reportDataBuildReportData, monitorInfo);
        }
        new C33862pf().m74566a(reportDataBuildReportData, DBDataStatus.SENT);
        return false;
    }

    private final void reportSLA(MonitorInfo monitorInfo) {
        int i11;
        if (!C33868q0.a.f71513a.m74637a(AttaEvent.EventCode.RM_LOOPER_STACK_COLLECT_STACK)) {
            return;
        }
        AttaEvent attaEvent = new AttaEvent(AttaEvent.EventCode.RM_LOOPER_STACK_COLLECT_STACK);
        double avgCollectStackMsgCost = monitorInfo.getAvgCollectStackMsgCost();
        attaEvent.setParam0(String.valueOf(avgCollectStackMsgCost));
        long avgCollectStackMsgDelay = monitorInfo.getAvgCollectStackMsgDelay();
        attaEvent.setParam1(String.valueOf(avgCollectStackMsgDelay));
        attaEvent.setParam2(String.valueOf(monitorInfo.getCollectStackMsgCount()));
        attaEvent.setParam3(String.valueOf(monitorInfo.getDuration()));
        attaEvent.setEventCost((int) monitorInfo.getDuration());
        if (monitorInfo.getFullStack() == null) {
            attaEvent.setParam4("0");
        } else {
            attaEvent.setParam4("1");
        }
        String strMo73419g = C33714ie.m73408k().mo73419g();
        Intrinsics.checkNotNullExpressionValue(strMo73419g, "getInstance().osVersion");
        attaEvent.setParam5(strMo73419g);
        C33714ie c33714ie = C33714ie.f70270o;
        String strMo73413b = c33714ie.mo73413b();
        Intrinsics.checkNotNullExpressionValue(strMo73413b, "getInstance().manufacture");
        attaEvent.setParam6(strMo73413b);
        String strMo73416d = c33714ie.mo73416d();
        Intrinsics.checkNotNullExpressionValue(strMo73416d, "getInstance().model");
        attaEvent.setParam7(strMo73416d);
        attaEvent.setParam8(String.valueOf(monitorInfo.getQuickTraceFlag()));
        if ((avgCollectStackMsgCost / ((double) 1000)) + avgCollectStackMsgDelay > 20.0d) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        attaEvent.setEventResult(i11);
        AttaEventReporter.INSTANCE.getInstance().addEvent(attaEvent);
    }
}
