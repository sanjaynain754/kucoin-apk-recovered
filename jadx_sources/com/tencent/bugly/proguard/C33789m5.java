package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.upload.UploadProxy;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33789m5 {

    /* JADX INFO: renamed from: g */
    public static final String f70917g = C33597d2.m72768b();

    /* JADX INFO: renamed from: h */
    public static final String f70918h = "exception";

    /* JADX INFO: renamed from: i */
    public static final String f70919i = "application_exit";

    /* JADX INFO: renamed from: j */
    public static final String f70920j = "exception";

    /* JADX INFO: renamed from: k */
    public static final String f70921k = "normal";

    /* JADX INFO: renamed from: l */
    public static C33789m5 f70922l;

    /* JADX INFO: renamed from: a */
    public Context f70923a;

    /* JADX INFO: renamed from: b */
    public UserMeta f70924b;

    /* JADX INFO: renamed from: c */
    public C33765l2 f70925c;

    /* JADX INFO: renamed from: d */
    public UploadProxy f70926d = null;

    /* JADX INFO: renamed from: e */
    public String f70927e = "";

    /* JADX INFO: renamed from: f */
    public String f70928f = "";

    /* JADX INFO: renamed from: a */
    public static C33789m5 m74036a() {
        if (f70922l == null) {
            synchronized (C33789m5.class) {
                f70922l = new C33789m5();
            }
        }
        return f70922l;
    }

    /* JADX INFO: renamed from: a */
    public final File m74037a(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            C34012x4.m75434a("Exit file do not exist.", new Object[0]);
            return null;
        }
        String name = file.getName();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        String str3 = str2 + File.separator + name + ".zip";
        File file2 = FileUtil.zipFiles((List<String>) arrayList, str3, false) ? new File(str3) : null;
        FileUtil.deleteFile(file);
        return file2;
    }

    /* JADX INFO: renamed from: a */
    public void m74039a(Context context) {
        try {
            this.f70923a = context;
            this.f70924b = new UserMeta();
            C33765l2 c33765l2M73825a = C33765l2.m73825a(this.f70923a);
            this.f70925c = c33765l2M73825a;
            this.f70924b.uin = c33765l2M73825a.m73833F();
            UserMeta userMeta = this.f70924b;
            C33765l2 c33765l2 = this.f70925c;
            userMeta.buildNumber = c33765l2.f70748g0;
            userMeta.appKey = "unknow_app_key";
            userMeta.appId = c33765l2.m73872e();
            UserMeta userMeta2 = this.f70924b;
            userMeta2.appVersion = this.f70925c.f70714F;
            userMeta2.sharePreference = C33716ig.m73433a().getSharedPreferences(this.f70923a, InterfaceC33611dg.f69592a, true);
            this.f70924b.crashSharedPreferences = C33716ig.m73433a().getSharedPreferences(this.f70923a, "BUGLY_COMMON_VALUES", true);
            UserMeta userMeta3 = this.f70924b;
            C33765l2 c33765l3 = this.f70925c;
            userMeta3.sdkVersion = c33765l3.f70755k;
            userMeta3.setModel(c33765l3.m73892o());
            this.f70924b.setUniqueID(this.f70925c.m73890n());
            this.f70924b.setAppVersionMode(C33791m7.m74054e().getAppVersionMode());
            this.f70926d = new UploadProxy(this.f70923a, this.f70925c.m73872e());
            StringBuilder sb2 = new StringBuilder();
            String str = f70917g;
            sb2.append(str);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("v1");
            sb2.append(str2);
            sb2.append(C33765l2.m73825a(this.f70923a).m73872e());
            sb2.append(str2);
            sb2.append("upload-file");
            this.f70927e = sb2.toString();
            this.f70928f = str + str2 + "v1" + str2 + C33765l2.m73825a(this.f70923a).m73872e() + str2 + "upload-json";
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74040a(C33747k5 c33747k5, String str) {
        try {
            File fileM74037a = (TextUtils.isEmpty(c33747k5.m73707c()) || TextUtils.isEmpty(str)) ? null : m74037a(c33747k5.m73707c(), str);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            jSONObject.put("process_id", c33747k5.m73710e());
            jSONObject.put("process_name", c33747k5.m73712f());
            jSONObject.put("exit_time", c33747k5.m73715i());
            jSONObject.put("reason", c33747k5.m73713g());
            jSONObject.put(TUIConstants.TUIPlugin.PLUGIN_DESCRIPTION, c33747k5.m73704b());
            jSONObject.put("crash_identify", c33747k5.m73701a());
            jSONObject.put("importance", c33747k5.m73708d());
            jSONObjectM74304a.put("type", "exception");
            jSONObjectM74304a.put("data", jSONObject);
            jSONObjectM74304a.put("stage", c33747k5.m73714h());
            if (c33747k5.m73716j() != null) {
                jSONObjectM74304a.put(C33820nf.f71130I, new JSONObject(c33747k5.m73716j()));
            }
            JSONObject jSONObjectM74303a = C33820nf.m74303a(this.f70923a, "exception", "application_exit", this.f70924b);
            if (jSONObjectM74303a == null) {
                return;
            }
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            ReportData reportData = new ReportData(this.f70924b.uin, 1, "ExitInfo", jSONObjectM74303a);
            if (fileM74037a != null) {
                reportData.addFile(fileM74037a.getCanonicalPath(), true, true);
                this.f70926d.reportFile(reportData, this.f70927e + this.f70926d.getMD5Params(reportData), null);
                return;
            }
            this.f70926d.reportJson(reportData, this.f70928f + this.f70926d.getMD5Params(reportData), null);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74038a(int i11) {
        try {
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            jSONObjectM74304a.put("type", f70921k);
            jSONObjectM74304a.put("count", i11);
            JSONObject jSONObjectM74303a = C33820nf.m74303a(this.f70923a, "exception", "application_exit", this.f70924b);
            if (jSONObjectM74303a == null) {
                return;
            }
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            ReportData reportData = new ReportData(this.f70924b.uin, 1, "ExitInfo", jSONObjectM74303a);
            this.f70926d.reportJson(reportData, this.f70928f + this.f70926d.getMD5Params(reportData), null);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }
}
