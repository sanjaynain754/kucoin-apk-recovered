package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.io.File;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ec */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33628ec {

    /* JADX INFO: renamed from: a */
    public static final String f69745a = "RMonitor_MemoryLeakReporter";

    /* JADX INFO: renamed from: a */
    public ReportData m72957a(String str, String str2, DumpResult dumpResult, Map<String, String> map) {
        if (dumpResult != null) {
            try {
                JSONObject jSONObjectM74302a = C33820nf.m74302a();
                if (map != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("uuid", entry.getKey());
                        jSONObject.put("leakobj", entry.getValue());
                        jSONArray.put(jSONObject);
                    }
                    jSONObjectM74302a.put("extra_leak", jSONArray);
                }
                jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
                jSONObjectM74302a.put("is64bit", BaseInfo.is64Bit);
                jSONObjectM74302a.put("leakobj", str);
                jSONObjectM74302a.put("uuid", str2);
                String str3 = dumpResult.zipFilePath;
                jSONObjectM74302a.put(C33811n6.f71045c, str3);
                jSONObjectM74302a.put("stage", C33657g.m73094e());
                String str4 = dumpResult.hprofPath;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("hprof_file", str4.substring(str4.lastIndexOf(File.separator) + 1));
                Application application = BaseInfo.app;
                UserMeta userMeta = BaseInfo.userMeta;
                JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69653b, "activity_leak", userMeta);
                jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74302a);
                jSONObjectM74303a.put(C33820nf.f71161q, jSONObject2);
                ReportData reportData = new ReportData(userMeta.uin, 1, "MemoryLeak", jSONObjectM74303a);
                reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_WIFI);
                reportData.addFile(str3, true, true);
                reportData.setShouldRecordLinkData(true);
                C34011x3.a.f72491a.m75423a(reportData);
                C34011x3.a.f72491a.m75425a(false, reportData);
                ReporterMachine.INSTANCE.reportNow(reportData, null);
                return reportData;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f69745a, th2);
            }
        }
        return null;
    }
}
