package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ub */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33959ub {

    /* JADX INFO: renamed from: a */
    public static final String f72255a = "RMonitor_MemoryCeiling_Reporter";

    /* JADX INFO: renamed from: b */
    public static final int f72256b = 100;

    /* JADX INFO: renamed from: a */
    public void m75174a(DumpResult dumpResult, String str) {
        if (!dumpResult.success) {
            Logger.INSTANCE.mo77131e(f72255a, "dump other file failed!");
            return;
        }
        try {
            JSONObject jSONObjectM74302a = C33820nf.m74302a();
            jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
            jSONObjectM74302a.put("is64bit", BaseInfo.is64Bit);
            String str2 = dumpResult.zipFilePath;
            jSONObjectM74302a.put(C33811n6.f71045c, str2);
            jSONObjectM74302a.put("stage", C33657g.m73094e());
            jSONObjectM74302a.put("activity", C33657g.f69911j.m73110k());
            C33694hf c33694hfM77076e = ConfigProxy.INSTANCE.getConfig().m77076e("java_memory_ceiling_hprof");
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            jSONObjectM74302a.put("threshold", (((long) c33694hfM77076e.f70127l) * jMaxMemory) / 100);
            jSONObjectM74302a.put("vm_max_size", jMaxMemory);
            jSONObjectM74302a.put("device_total_mem_size", C33872q4.m74661a());
            jSONObjectM74302a.put("dump_reason", str);
            String str3 = dumpResult.hprofPath;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hprof_file", str3.substring(str3.lastIndexOf(File.separator) + 1));
            Application application = BaseInfo.app;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69653b, "java_memory_ceiling_hprof", userMeta);
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74302a);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            ReportData reportData = new ReportData(userMeta.uin, 1, "MemoryCelling", jSONObjectM74303a);
            reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_WIFI);
            reportData.addFile(str2, true, true);
            reportData.setShouldRecordLinkData(true);
            C34011x3.a.f72491a.m75423a(reportData);
            C34011x3.a.f72491a.m75425a(false, reportData);
            ReporterMachine.INSTANCE.reportNow(reportData, null);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72255a, th2);
        }
    }
}
