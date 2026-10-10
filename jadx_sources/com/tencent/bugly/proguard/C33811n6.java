package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33811n6 {

    /* JADX INFO: renamed from: a */
    public static final String f71043a = "FdLeakReporter";

    /* JADX INFO: renamed from: b */
    public static final String f71044b = "process_name";

    /* JADX INFO: renamed from: c */
    public static final String f71045c = "fileObj";

    /* JADX INFO: renamed from: d */
    public static final String f71046d = "fd_max_limit";

    /* JADX INFO: renamed from: e */
    public static final String f71047e = "fd_count";

    /* JADX INFO: renamed from: f */
    public static final String f71048f = "fd_threshold";

    /* JADX INFO: renamed from: g */
    public static final String f71049g = "stage";

    /* JADX INFO: renamed from: h */
    public static final String f71050h = "fd_type";

    /* JADX INFO: renamed from: i */
    public static final String f71051i = "fd_issue_content";

    /* JADX INFO: renamed from: j */
    public static final String f71052j = "is64bit";

    /* JADX INFO: renamed from: a */
    public void m74240a(C33748k6 c33748k6, String str) {
        try {
            JSONObject jSONObjectM74302a = C33820nf.m74302a();
            jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
            jSONObjectM74302a.put("is64bit", BaseInfo.is64Bit);
            jSONObjectM74302a.put(f71045c, str);
            jSONObjectM74302a.put("stage", C33657g.m73094e());
            jSONObjectM74302a.put(f71047e, c33748k6.m73722e());
            jSONObjectM74302a.put(f71046d, C33914s6.m74922g());
            jSONObjectM74302a.put(f71048f, C33664g6.m73155e());
            jSONObjectM74302a.put(f71050h, C33914s6.m74915b(c33748k6.m73725h()));
            jSONObjectM74302a.put(f71051i, c33748k6.m73724g());
            JSONObject jSONObject = new JSONObject();
            Iterator<C33706i6> it = c33748k6.m73723f().iterator();
            while (it.hasNext()) {
                int iM73348g = it.next().m73348g();
                if (iM73348g == 1) {
                    jSONObject.put("fd_info", InterfaceC33953u5.f72201H);
                } else if (iM73348g == 2) {
                    jSONObject.put("thread_info", InterfaceC33953u5.f72202I);
                } else if (iM73348g == 3) {
                    jSONObject.put("heap_info", InterfaceC33953u5.f72203J);
                } else if (iM73348g != 4) {
                    Logger.INSTANCE.mo77131e(f71043a, "get file name failed");
                } else {
                    jSONObject.put("file_stacks", InterfaceC33953u5.f72204K);
                }
            }
            Application application = BaseInfo.app;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69653b, "fd_leak", userMeta);
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74302a);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            jSONObjectM74303a.put(C33820nf.f71162r, 1);
            ReportData reportData = new ReportData(userMeta.uin, 1, "FdLeakAnalyzed", jSONObjectM74303a);
            reportData.getReportStrategy().setUploadStrategy(ReportStrategy.UploadStrategy.UPLOAD_WIFI);
            reportData.addFile(str, true, true);
            reportData.setShouldRecordLinkData(true);
            C34011x3.a.f72491a.m75425a(false, reportData);
            C34011x3.a.f72491a.m75423a(reportData);
            ReporterMachine.INSTANCE.reportNow(reportData, null);
        } catch (JSONException e11) {
            C33648fb.m73043b(f71043a, "reportAnalyzeResult failed: " + e11.getMessage());
        }
    }
}
