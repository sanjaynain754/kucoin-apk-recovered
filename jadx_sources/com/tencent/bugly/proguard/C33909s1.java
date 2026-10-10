package com.tencent.bugly.proguard;

import android.app.Application;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.s1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33909s1 {

    /* JADX INFO: renamed from: e */
    public static final String f71783e = "RMonitor_BigBitmap_Reporter";

    /* JADX INFO: renamed from: f */
    public static final int f71784f = 100;

    /* JADX INFO: renamed from: g */
    public static final String f71785g = "BitmapOverDecode.json";

    /* JADX INFO: renamed from: a */
    public int f71786a;

    /* JADX INFO: renamed from: b */
    public int f71787b;

    /* JADX INFO: renamed from: c */
    public int f71788c;

    /* JADX INFO: renamed from: d */
    public String f71789d;

    /* JADX INFO: renamed from: a */
    public final JSONArray m74898a(List<C33642f5> list) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C33642f5 c33642f5 : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timestamp", c33642f5.f69853l);
                jSONObject.put("activity_name", c33642f5.f69842a);
                jSONObject.put("bitmap_width", c33642f5.f69848g);
                jSONObject.put("bitmap_height", c33642f5.f69849h);
                jSONObject.put("view_width", c33642f5.f69846e);
                jSONObject.put("view_height", c33642f5.f69847f);
                jSONObject.put("view_chain", c33642f5.f69844c);
                jSONObject.put("view_name", c33642f5.f69843b);
                jSONObject.put("view_tag", c33642f5.f69845d);
                jSONObject.put("show_type", c33642f5.f69850i);
                jSONObject.put("allocated_byte_size", c33642f5.f69851j);
                jSONArray.put(jSONObject);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71783e, th2);
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: b */
    public final void m74901b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FileUtil.getRootPath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("dumpfile");
        sb2.append(str);
        sb2.append("big_bitmap");
        sb2.append(str);
        File file = new File(sb2.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        this.f71789d = new File(file, f71785g).getAbsolutePath();
    }

    /* JADX INFO: renamed from: c */
    public final String m74902c(List<C33642f5> list) {
        String canonicalPath;
        try {
            synchronized (this) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("bitmap_over_decode", m74898a(list));
                    File file = new File(this.f71789d);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(jSONObject.toString().getBytes());
                    fileOutputStream.close();
                    File file2 = new File(file.getParent(), System.currentTimeMillis() + "_big_bitmap.zip");
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file.getPath());
                    FileUtil.zipFiles((List<String>) arrayList, file2.getAbsolutePath(), false);
                    canonicalPath = file2.getCanonicalPath();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return canonicalPath;
        } catch (Throwable th3) {
            Logger.INSTANCE.exception(f71783e, th3);
            return null;
        }
    }

    public C33909s1() {
        m74899a();
        m74901b();
    }

    /* JADX INFO: renamed from: b */
    public ReportData m74900b(List<C33642f5> list) {
        boolean z11;
        try {
            if (!list.isEmpty()) {
                JSONObject jSONObjectM74302a = C33820nf.m74302a();
                jSONObjectM74302a.put("process_name", AppInfo.obtainProcessName(BaseInfo.app));
                jSONObjectM74302a.put("stage", C33657g.m73094e());
                jSONObjectM74302a.put("is64bit", BaseInfo.is64Bit);
                jSONObjectM74302a.put("width_pixels", this.f71787b);
                jSONObjectM74302a.put("height_pixels", this.f71788c);
                jSONObjectM74302a.put("density_dpi", this.f71786a);
                jSONObjectM74302a.put("threshold", C33848p1.m74494a());
                JSONObject jSONObject = new JSONObject();
                if (list.size() <= 100) {
                    jSONObject.put("bitmap_over_decode", m74898a(list));
                    z11 = true;
                } else {
                    jSONObjectM74302a.put(C33811n6.f71045c, m74902c(list));
                    jSONObject.put("json_file_path", f71785g);
                    z11 = false;
                }
                Application application = BaseInfo.app;
                UserMeta userMeta = BaseInfo.userMeta;
                JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69653b, "big_bitmap", userMeta);
                jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74302a);
                jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
                ReportData reportData = new ReportData(userMeta.uin, 1, "BigBitmap", jSONObjectM74303a);
                reportData.getReportStrategy().setUploadStrategy(z11 ? ReportStrategy.UploadStrategy.UPLOAD_WIFI : ReportStrategy.UploadStrategy.UPLOAD_NEXT_LAUNCH);
                C34011x3.a.f72491a.m75425a(false, reportData);
                C34011x3.a.f72491a.m75423a(reportData);
                reportData.setShouldRecordLinkData(true);
                ReporterMachine.INSTANCE.reportNow(reportData, null);
                return reportData;
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f71783e, th2);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m74899a() {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (AndroidVersion.isOverJellyBeanMr1()) {
                DisplayManager displayManager = (DisplayManager) BaseInfo.app.getSystemService("display");
                if (displayManager != null) {
                    displayManager.getDisplay(0).getRealMetrics(displayMetrics);
                }
            } else {
                WindowManager windowManager = (WindowManager) BaseInfo.app.getSystemService(InterfaceC33953u5.f72199F);
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                }
            }
            this.f71787b = displayMetrics.widthPixels;
            this.f71788c = displayMetrics.heightPixels;
            this.f71786a = displayMetrics.densityDpi;
        } catch (Throwable unused) {
            this.f71787b = -1;
            this.f71788c = -1;
            this.f71786a = -1;
        }
    }
}
