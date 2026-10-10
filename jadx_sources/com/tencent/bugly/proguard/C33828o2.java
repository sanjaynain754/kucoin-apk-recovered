package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.base.reporter.pluginreport.IPluginReport;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33828o2 implements IPluginReport {

    /* JADX INFO: renamed from: d */
    public static final String f71283d = "RMonitor_report_CommonReporter";

    /* JADX INFO: renamed from: a */
    public final String f71284a;

    /* JADX INFO: renamed from: b */
    public final String f71285b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Object f71286c;

    @Override // com.tencent.rmonitor.base.reporter.pluginreport.IPluginReport
    public boolean report(Object obj) {
        if (obj == null) {
            Logger.INSTANCE.mo77131e(f71283d, "report, filePath is null, plugin = ", String.valueOf(this.f71285b));
            return false;
        }
        try {
            String strM74390a = m74390a((String) obj);
            Application application = BaseInfo.app;
            String str = this.f71284a;
            String str2 = this.f71285b;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, str, str2, userMeta);
            if (this.f71286c != null) {
                JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71140S);
                jSONObjectM74304a.put("extra_data", this.f71286c);
                jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            }
            ReportData reportData = new ReportData(userMeta.uin, 1, this.f71285b, jSONObjectM74303a);
            reportData.addFile(strM74390a, true, true);
            reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_NEXT_LAUNCH);
            ReporterMachine.INSTANCE.reportNow(reportData, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public String m74390a(String str) {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            return str;
        }
        String str2 = file.getParent() + "/" + ("out_" + System.currentTimeMillis() + ".zip");
        FileUtil.zipFiles(str, str2, false);
        FileUtil.deleteFile(file);
        return str2;
    }

    @Override // com.tencent.rmonitor.base.reporter.pluginreport.IPluginReport
    public void setExtraData(@Nullable Object obj) {
        this.f71286c = obj;
    }

    public C33828o2(String str, String str2) {
        this.f71284a = str;
        this.f71285b = str2;
    }
}
