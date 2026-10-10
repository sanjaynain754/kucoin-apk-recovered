package com.tencent.bugly.library;

import android.text.TextUtils;
import com.tencent.bugly.common.p127sp.ISharedPreferencesProvider;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33808n3;
import com.tencent.bugly.proguard.C33951u3;
import com.tencent.feedback.eup.CrashHandleListener;
import com.tencent.feedback.upload.UploadHandleListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class BuglyBuilder implements BuglyConstants {
    public static final String APP_STATE_BACKGROUND = "background";
    public static final String APP_STATE_FOREGROUND = "foreground";
    public static final String ServerHostTypeBuglyCloud = "https://cloud.bugly.qq.com";
    public static final String ServerHostTypeBuglyCloudSGP = "https://buglycloud.sgp.tencent.com";
    public static final String ServerHostTypeBuglyIOT = "https://buglypro.iot-tencent.com";
    public static final String ServerHostTypeBuglyOversea = "https://android.bugly.tencent.com";
    public static final String ServerHostTypeBuglyPro = "https://pro.bugly.qq.com";
    public static final String ServerHostTypeDefault = "https://rmonitor.qq.com";

    /* JADX INFO: renamed from: a */
    public final List<String> f68730a;
    public final String appId;
    public final String appKey;

    /* JADX INFO: renamed from: b */
    public final C33951u3 f68731b;
    public String appVersion = null;
    public String buildNumber = null;
    public String uniqueId = null;
    public String userId = null;
    public String deviceModel = "unknown";
    public boolean debugMode = false;
    public String appVersionType = "Unknown";
    public int logLevel = BuglyLogLevel.LEVEL_WARN;
    public String appChannel = null;
    public boolean enableAllThreadStackCrash = true;
    public boolean enableAllThreadStackAnr = true;
    public boolean enableCrashProtect = true;
    public String hotPatchNum = null;
    public boolean fetchConfigFromServerInSubProcess = false;
    public ISharedPreferencesProvider spProvider = null;
    public String serverHostType = null;
    public String initAppState = null;
    public long cacheDataIntervalMs = C33536a4.f68797g;

    /* JADX INFO: renamed from: c */
    public final ArrayList<String> f68732c = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public C33951u3 m72199a() {
        return this.f68731b;
    }

    public void addMonitor(String str) {
        if (this.f68730a.contains(str)) {
            return;
        }
        this.f68730a.add(str);
    }

    /* JADX INFO: renamed from: b */
    public List<String> m72200b() {
        return this.f68730a;
    }

    public ArrayList<String> getEmergencyReportPlugins() {
        return this.f68732c;
    }

    public void removeMonitor(String str) {
        this.f68730a.remove(str);
    }

    public void setCrashHandleListener(CrashHandleListener crashHandleListener) {
        this.f68731b.m75119a(crashHandleListener);
    }

    public void setEnableRecordAnrMainStack(boolean z11) {
        C33951u3 c33951u3 = this.f68731b;
        if (c33951u3 != null) {
            c33951u3.m75136e(z11);
        }
    }

    public void setUploadHandleListener(UploadHandleListener uploadHandleListener) {
        this.f68731b.m75120a(uploadHandleListener);
    }

    public BuglyBuilder(String str, String str2) {
        this.appId = str;
        this.appKey = str2;
        C33951u3 c33951u3 = new C33951u3();
        this.f68731b = c33951u3;
        c33951u3.m75133d(true);
        c33951u3.m75125b(true);
        c33951u3.m75130c(true);
        c33951u3.m75119a((CrashHandleListener) null);
        c33951u3.m75120a((UploadHandleListener) null);
        ArrayList arrayList = new ArrayList();
        this.f68730a = arrayList;
        arrayList.add("looper_metric");
        arrayList.add("looper_stack");
        arrayList.add("launch_metric");
        arrayList.add("memory_quantile");
        arrayList.add("sub_memory_quantile");
        arrayList.add("activity_leak");
        arrayList.add("big_bitmap");
        arrayList.add("net_quality");
        arrayList.add("java_memory_ceiling_hprof");
        arrayList.add("page_launch");
        arrayList.add("custom_event");
    }

    public void addEmergencyReportPlugin(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f68732c.add(str);
    }

    public void removeEmergencyReportPlugin(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f68732c.remove(str);
    }

    public void setQutLibraryPath(ArrayList<String> arrayList) {
        C33808n3.m74190a(arrayList);
    }

    public void setServerHostType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.serverHostType = str;
        }
    }
}
