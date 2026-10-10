package com.tencent.bugly.proguard;

import android.app.Application;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.common.util.FileUtil;
import com.tencent.rmonitor.natmem.NatMemMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34040yc {

    /* JADX INFO: renamed from: a */
    public static final String f72554a = "RMonitor_NatMem_Reporter";

    /* JADX INFO: renamed from: b */
    public static final int f72555b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f72556c = 2;

    /* JADX INFO: renamed from: d */
    public static C33862pf f72557d = new C33862pf();

    /* JADX INFO: renamed from: e */
    public static ReportData f72558e = null;

    /* JADX INFO: renamed from: a */
    public static boolean m75499a(String str) {
        return str != null && new File(str).exists();
    }

    /* JADX INFO: renamed from: a */
    public static void m75498a(String str, String str2, String str3, int i11) {
        ArrayList arrayList = new ArrayList();
        if (m75499a(str)) {
            arrayList.add(str);
        }
        if (m75499a(str2)) {
            arrayList.add(str2);
        }
        if (m75499a(str3)) {
            arrayList.add(str3);
        }
        String str4 = C33712ic.m73405b() + "dump_NatMem_" + C33591ch.m72746d() + ".zip";
        File file = new File(str4);
        if (file.exists()) {
            file.delete();
        }
        if (!FileUtil.zipFiles((List<String>) arrayList, str4, false)) {
            Logger.INSTANCE.mo77131e(f72554a, "dump zip file failed!");
            return;
        }
        try {
            JSONObject jSONObjectM74302a = C33820nf.m74302a();
            jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
            jSONObjectM74302a.put("is64bit", BaseInfo.is64Bit);
            jSONObjectM74302a.put(C33811n6.f71045c, str4);
            jSONObjectM74302a.put("stage", C33657g.m73094e());
            if (i11 == 1) {
                jSONObjectM74302a.put("memory_type", "vmsize");
            } else if (i11 == 2) {
                jSONObjectM74302a.put("memory_type", "physical");
            }
            jSONObjectM74302a.put("max_physical_pss", NatMemMonitor.m77197b().m77198a().m75372h());
            jSONObjectM74302a.put("max_vitural_vss", NatMemMonitor.m77197b().m77198a().m75373i());
            jSONObjectM74302a.put("app_min_size", NatMemMonitor.m77197b().m77198a().m75368d());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mem_ceiling_info", str);
            jSONObject.put("mem_history_info", str2);
            jSONObject.put("smaps_info", str3);
            jSONObject.put("file_stacks", str);
            Application application = BaseInfo.app;
            UserMeta userMeta = BaseInfo.userMeta;
            JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69653b, "native_memory", userMeta);
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74302a);
            jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
            jSONObjectM74303a.put(C33820nf.f71162r, 1);
            if (f72558e == null) {
                ReportData reportData = new ReportData(userMeta.uin, 1, "NatMem", jSONObjectM74303a);
                f72558e = reportData;
                reportData.addFile(str4, true, true);
                f72557d.mo74453d(f72558e);
            }
            f72558e.setParams(jSONObjectM74303a);
            f72558e.setShouldRecordLinkData(true);
            C34011x3.a.f72491a.m75423a(f72558e);
            C34011x3.a.f72491a.m75425a(false, f72558e);
            f72557d.mo74451b(f72558e);
        } catch (JSONException e11) {
            Logger.INSTANCE.exception(f72554a, e11);
        }
    }
}
