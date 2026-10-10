package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.upload.UploadProxy;
import com.tencent.bugly.common.utils.FileUtil;
import com.tencent.bugly.common.utils.HprofFileIUtil;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.b4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33557b4 {

    /* JADX INFO: renamed from: k */
    public static final String f69123k = "CustomFileUploadManager";

    /* JADX INFO: renamed from: l */
    public static final String f69124l = "bugly_asan";

    /* JADX INFO: renamed from: m */
    public static final String f69125m = "bugly_asan_zip";

    /* JADX INFO: renamed from: n */
    public static final String f69126n = "asan_info_";

    /* JADX INFO: renamed from: o */
    public static final String f69127o = "asan_info.zip";

    /* JADX INFO: renamed from: p */
    public static final String f69128p = "custom_file_record.txt";

    /* JADX INFO: renamed from: q */
    public static final String f69129q = "bugly_custom_zips";

    /* JADX INFO: renamed from: r */
    public static final String f69130r = "/bugly_upload_file";

    /* JADX INFO: renamed from: s */
    public static final String f69131s = "/bugly_upload_zip";

    /* JADX INFO: renamed from: t */
    public static final long f69132t = 604800000;

    /* JADX INFO: renamed from: u */
    public static final int f69133u = 10;

    /* JADX INFO: renamed from: v */
    public static final long f69134v = 10485760;

    /* JADX INFO: renamed from: w */
    public static C33557b4 f69135w = null;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ boolean f69136x = true;

    /* JADX INFO: renamed from: a */
    public Context f69137a;

    /* JADX INFO: renamed from: c */
    public C33765l2 f69139c;

    /* JADX INFO: renamed from: b */
    public Boolean f69138b = Boolean.FALSE;

    /* JADX INFO: renamed from: d */
    public JSONObject f69140d = null;

    /* JADX INFO: renamed from: e */
    public URL f69141e = null;

    /* JADX INFO: renamed from: f */
    public UserMeta f69142f = null;

    /* JADX INFO: renamed from: g */
    public UploadProxy f69143g = null;

    /* JADX INFO: renamed from: h */
    public String f69144h = "";

    /* JADX INFO: renamed from: i */
    public String f69145i = "";

    /* JADX INFO: renamed from: j */
    public String f69146j = C33597d2.m72768b();

    /* JADX INFO: renamed from: c */
    public static C33557b4 m72455c() {
        if (f69135w == null) {
            synchronized (C33557b4.class) {
                f69135w = new C33557b4();
            }
        }
        return f69135w;
    }

    /* JADX INFO: renamed from: a */
    public boolean m72464a(File file, String str, String str2, String str3) {
        if (!this.f69138b.booleanValue()) {
            C34012x4.m75442d("CustomFileManager.upload failed, please call init first", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(str3)) {
            C34012x4.m75434a("upload custom file failed, identify is empty.", new Object[0]);
            return false;
        }
        String strM72466b = m72466b(str, str2);
        if (strM72466b == null) {
            return false;
        }
        try {
            JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
            jSONObjectM74304a.put(InterfaceC33826o0.f71244p, strM72466b);
            JSONObject jSONObjectM74303a = C33820nf.m74303a(this.f69137a, str, str2, this.f69142f);
            if (jSONObjectM74303a == null) {
                C34012x4.m75444f("failed to build upload params, return.", new Object[0]);
                return false;
            }
            if (C33765l2.f70705H0) {
                jSONObjectM74303a.put("process_launch_id", str3);
            } else {
                jSONObjectM74304a.put("crash_identify", str3);
            }
            jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
            ReportData reportData = new ReportData(this.f69142f.uin, 1, str2, jSONObjectM74303a);
            reportData.addFile(file.getCanonicalPath(), true, false);
            this.f69143g.reportFile(reportData, this.f69144h + this.f69143g.getMD5Params(reportData), null);
            return true;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final URL m72467b() {
        StringBuilder sb2 = new StringBuilder(512);
        sb2.append(this.f69146j);
        sb2.append("/v1/");
        sb2.append(C33765l2.m73825a(this.f69137a).m73872e());
        sb2.append("/quota/check");
        try {
            return new URL(sb2.toString());
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m72473d(Context context) {
        try {
            this.f69137a = context;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f69137a.getFilesDir().getCanonicalPath());
            String str = File.separator;
            sb2.append(str);
            sb2.append(f69129q);
            sb2.append(str);
            this.f69145i = sb2.toString();
            m72460a(new File(this.f69145i));
            this.f69140d = m72457a();
            this.f69141e = m72467b();
            this.f69142f = new UserMeta();
            C33765l2 c33765l2M73825a = C33765l2.m73825a(this.f69137a);
            this.f69139c = c33765l2M73825a;
            this.f69142f.uin = c33765l2M73825a.m73833F();
            UserMeta userMeta = this.f69142f;
            C33765l2 c33765l2 = this.f69139c;
            userMeta.buildNumber = c33765l2.f70748g0;
            userMeta.appKey = "unknow_app_key";
            userMeta.appId = c33765l2.m73872e();
            UserMeta userMeta2 = this.f69142f;
            userMeta2.appVersion = this.f69139c.f70714F;
            userMeta2.sharePreference = C33716ig.m73433a().getSharedPreferences(this.f69137a, InterfaceC33611dg.f69592a, true);
            this.f69142f.crashSharedPreferences = C33716ig.m73433a().getSharedPreferences(this.f69137a, "BUGLY_COMMON_VALUES", true);
            UserMeta userMeta3 = this.f69142f;
            C33765l2 c33765l3 = this.f69139c;
            userMeta3.sdkVersion = c33765l3.f70755k;
            userMeta3.setModel(c33765l3.m73892o());
            this.f69142f.setUniqueID(this.f69139c.m73890n());
            this.f69142f.setAppVersionMode(C33791m7.m74054e().getAppVersionMode());
            this.f69143g = new UploadProxy(this.f69137a, this.f69139c.m73872e());
            this.f69144h = this.f69146j + "/v1/" + C33765l2.m73825a(this.f69137a).m73872e() + "/custom/upload-file";
            this.f69138b = Boolean.TRUE;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m72476f(Context context, String str) {
        File file = new File(context.getFilesDir(), f69128p);
        try {
            String outputFromFile = FileUtil.readOutputFromFile(file.getCanonicalPath());
            FileUtil.writeFile(file.getAbsolutePath(), "", false);
            if (!this.f69138b.booleanValue()) {
                C34012x4.m75442d("uploadLastCustomFiles failed, please call init first", new Object[0]);
                return;
            }
            String[] strArrSplit = outputFromFile.split("######");
            if (strArrSplit != null && strArrSplit.length >= 1) {
                for (String str2 : strArrSplit) {
                    String[] strArrSplit2 = str2.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    if (strArrSplit2 != null && strArrSplit2.length >= 2) {
                        List listAsList = Arrays.asList(strArrSplit2);
                        m72463a(listAsList.subList(2, listAsList.size()), (String) listAsList.get(0), (String) listAsList.get(1), this.f69145i);
                    }
                }
            }
            File file2 = new File(this.f69145i);
            if (!file2.exists() || file2.listFiles() == null || file2.listFiles().length < 1) {
                return;
            }
            for (File file3 : file2.listFiles()) {
                String name = file3.getName();
                if (name.contains(str) && m72464a(file3, name.substring(0, name.indexOf("%")), "custom_log", str)) {
                    C34012x4.m75442d("Successfully upload custom zip file, identify is: " + str, new Object[0]);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m72475e(Context context, String str) {
        m72474d(context, str);
        m72476f(context, str);
        m72469b(context, str);
        m72459a(context, str);
        m72471c(context, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m72470c(Context context) {
        File[] fileArrListFiles;
        String name;
        String strM72465b;
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            String str = File.separator;
            sb2.append(str);
            sb2.append(f69124l);
            File file = new File(sb2.toString());
            if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                File file2 = new File(absolutePath + str + f69125m);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                for (File file3 : fileArrListFiles) {
                    if (file3.isFile() && (strM72465b = m72465b((name = file3.getName()))) != null) {
                        File file4 = new File(file2, strM72465b);
                        if (!file4.exists()) {
                            file4.mkdirs();
                        }
                        boolean zZipFiles = FileUtil.zipFiles((List<String>) Collections.singletonList(file3.getAbsoluteFile().toString()), file4.getAbsoluteFile() + File.separator + f69127o, false);
                        if (zZipFiles) {
                            FileUtil.deleteFile(file3);
                        }
                        C34012x4.m75442d("fetch and zip asan file " + name + ", result: " + zZipFiles, new Object[0]);
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75437b("failed to fetch and zip asan file.", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m72466b(String str, String str2) {
        JSONObject jSONObject;
        try {
            if (this.f69141e != null && (jSONObject = this.f69140d) != null) {
                if (str != null && str2 != null) {
                    jSONObject.put(C33820nf.f71149e, str);
                    this.f69140d.put(C33820nf.f71150f, str2);
                }
                C33674gg c33674gg = new C33674gg(this.f69141e, this.f69140d);
                c33674gg.request();
                JSONObject jSONObject2 = c33674gg.f69988c;
                if (jSONObject2 != null && jSONObject2.has("code") && jSONObject2.getInt("code") == 0 && jSONObject2.has(InterfaceC33826o0.f71244p)) {
                    return jSONObject2.getString(InterfaceC33826o0.f71244p);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m72457a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", C33765l2.m73825a(this.f69137a).m73872e());
            jSONObject.put("app_version", C33765l2.m73825a(this.f69137a).f70714F);
            jSONObject.put("sdk_version", C33765l2.m73825a(this.f69137a).f70755k);
            return jSONObject;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72468b(Context context) {
        m72461a(context.getFilesDir().getAbsolutePath() + f69130r);
        m72461a(context.getFilesDir().getAbsolutePath() + f69131s);
    }

    /* JADX INFO: renamed from: b */
    public final String m72465b(String str) {
        int iIndexOf = str.indexOf(f69126n) + 10;
        int iLastIndexOf = str.lastIndexOf(C33978va.f72339h);
        if (iIndexOf < 0 || iLastIndexOf < 0 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        return str.substring(iIndexOf, iLastIndexOf);
    }

    /* JADX INFO: renamed from: a */
    public final void m72463a(List<String> list, String str, String str2, String str3) {
        try {
            String str4 = str3 + File.separator + str + "%" + str2 + ".zip";
            if (FileUtil.zipFiles(list, str4, false)) {
                File file = new File(str4);
                if (file.length() > f69134v) {
                    C34012x4.m75442d("attachment's size is too larger, more than 10MB, just delete it", new Object[0]);
                    file.delete();
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72469b(Context context, String str) {
        C33765l2 c33765l2;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(HprofFileIUtil.getOOMHprofPath());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            sb2.append(".suc");
            String string = sb2.toString();
            String str3 = HprofFileIUtil.getOOMHprofPath() + str2 + str + ".hprof";
            String str4 = HprofFileIUtil.getOOMHprofZipPath() + str2 + str + str2 + "oom_hprof.zip";
            File file = new File(str3);
            File file2 = new File(string);
            if (file.exists() && file2.exists()) {
                File file3 = new File(str4);
                if (file3.exists()) {
                    file3.delete();
                }
                UploadProxy uploadProxy = new UploadProxy(context, C33765l2.m73827s().m73872e());
                JSONObject jSONObjectM74303a = C33820nf.m74303a(this.f69137a, "crash", "common_file", this.f69142f);
                try {
                    if (!f69136x && jSONObjectM74303a == null) {
                        throw new AssertionError();
                    }
                    String strM72466b = m72466b("crash", "common_file");
                    JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
                    jSONObjectM74304a.put(InterfaceC33826o0.f71244p, strM72466b);
                    jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
                    jSONObjectM74303a.put("process_launch_id", str);
                    synchronized (C33765l2.class) {
                        c33765l2 = C33765l2.f70700C0;
                    }
                    ReportData reportData = new ReportData(c33765l2.m73833F(), 1, "CrashUploadEvent", jSONObjectM74303a);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str3);
                    FileUtil.zipFiles((List<String>) arrayList, str4, false);
                    reportData.addFile(str4, true, true);
                    uploadProxy.reportFile(reportData, this.f69144h + this.f69143g.getMD5Params(reportData), null);
                    file.delete();
                    file2.delete();
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69123k, th2);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m72474d(Context context, String str) {
        String str2 = context.getFilesDir().getAbsolutePath() + f69130r;
        String str3 = context.getFilesDir().getAbsolutePath() + f69131s;
        File file = new File(str3);
        m72462a(str2, str3);
        try {
            if (file.listFiles() == null || file.listFiles().length <= 0) {
                return;
            }
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                int iIndexOf = name.indexOf("%");
                if (iIndexOf > 0) {
                    String strSubstring = name.substring(0, iIndexOf);
                    String strSubstring2 = name.substring(iIndexOf + 1, name.length() - 4);
                    if (strSubstring2.equals(str) && m72464a(file2, strSubstring, "state_file", strSubstring2)) {
                        C34012x4.m75442d("Successfully upload process and thread record zip file, identify is: " + str, new Object[0]);
                        FileUtil.deleteFile(file2);
                    }
                } else {
                    FileUtil.deleteFile(file2);
                    return;
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m72472c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f69146j = str;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m72471c(Context context, String str) {
        C33765l2 c33765l2;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FileUtil.getRootPath());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("bugly_replay");
            sb2.append(str2);
            sb2.append(str);
            String string = sb2.toString();
            String str3 = FileUtil.getRootPath() + str2 + "bugly_replay" + str2 + "replay.zip";
            File file = new File(string);
            if (file.exists() && file.isDirectory()) {
                File file2 = new File(str3);
                if (file2.exists()) {
                    file2.delete();
                }
                UploadProxy uploadProxy = new UploadProxy(context, C33765l2.m73827s().m73872e());
                JSONObject jSONObjectM74303a = C33820nf.m74303a(this.f69137a, "crash", "common_file", this.f69142f);
                try {
                    if (!f69136x && jSONObjectM74303a == null) {
                        throw new AssertionError();
                    }
                    String strM72466b = m72466b("crash", "common_file");
                    JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
                    jSONObjectM74304a.put(InterfaceC33826o0.f71244p, strM72466b);
                    jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
                    jSONObjectM74303a.put("process_launch_id", str);
                    synchronized (C33765l2.class) {
                        c33765l2 = C33765l2.f70700C0;
                    }
                    ReportData reportData = new ReportData(c33765l2.m73833F(), 1, "CrashUploadEvent", jSONObjectM74303a);
                    ArrayList arrayList = new ArrayList();
                    File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: com.tencent.bugly.proguard.aj
                        @Override // java.io.FilenameFilter
                        public final boolean accept(File file3, String str4) {
                            return str4.toLowerCase().endsWith(".jpg");
                        }
                    });
                    if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                        for (File file3 : fileArrListFiles) {
                            arrayList.add(file3.getAbsolutePath());
                        }
                        Logger.INSTANCE.mo77130d("success add jpg files : " + fileArrListFiles.length);
                    } else {
                        Logger.INSTANCE.mo77130d("fail to  add jpg files");
                    }
                    FileUtil.zipFiles((List<String>) arrayList, str3, false);
                    reportData.addFile(str3, true, true);
                    uploadProxy.reportFile(reportData, this.f69144h + this.f69143g.getMD5Params(reportData), null);
                    FileUtil.deleteFolder(file);
                    file2.delete();
                } catch (JSONException e11) {
                    throw new RuntimeException(e11);
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69123k, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72462a(String str, String str2) {
        try {
            File file = new File(str);
            File file2 = new File(str2);
            if (!file.exists() || file.listFiles() == null || file.listFiles().length < 1) {
                return;
            }
            if (!file2.exists()) {
                file.mkdirs();
            }
            for (File file3 : file.listFiles()) {
                String str3 = str2 + File.separator + file3.getName() + ".zip";
                if (FileUtil.zipFiles(file3.getCanonicalPath(), str3, false)) {
                    FileUtil.deleteFile(file3);
                    File file4 = new File(str3);
                    if (file4.length() > f69134v) {
                        file4.delete();
                    }
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72460a(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int length = fileArrListFiles.length > 10 ? fileArrListFiles.length - 10 : 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C33539a7.m72314a(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (length > 0) {
                FileUtil.deleteFile(file2);
                length--;
            } else if (jCurrentTimeMillis - file2.lastModified() > 604800000) {
                FileUtil.deleteFile(file2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72458a(Context context) {
        m72461a(context.getFilesDir().getAbsolutePath() + File.separator + f69125m);
    }

    /* JADX INFO: renamed from: a */
    public final void m72461a(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            m72460a(file);
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72459a(Context context, String str) {
        m72470c(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getFilesDir().getAbsolutePath());
        String strM75464a = C34025xh.m75464a(sb2, File.separator, f69125m);
        File[] fileArrListFiles = new File(strM75464a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        try {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strM75464a);
                String str2 = File.separator;
                sb3.append(str2);
                sb3.append(name);
                sb3.append(str2);
                sb3.append(f69127o);
                File file2 = new File(sb3.toString());
                if (name.equals(str) && m72464a(file2, "crash", "common_file", name)) {
                    C34012x4.m75442d("Successfully upload asan info file, identify is: " + name, new Object[0]);
                    FileUtil.deleteFile(file);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m72456a(Context context, String str, String str2) {
        return context.getFilesDir().getAbsolutePath() + f69130r + File.separator + str + "%" + str2;
    }
}
