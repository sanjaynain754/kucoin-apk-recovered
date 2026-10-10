package com.tencent.bugly.library;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.callback.Callback;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.bugly.common.reporter.data.ReportStrategy;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.C33536a4;
import com.tencent.bugly.proguard.C33565bc;
import com.tencent.bugly.proguard.C33597d2;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33652ff;
import com.tencent.bugly.proguard.C33657g;
import com.tencent.bugly.proguard.C33660g2;
import com.tencent.bugly.proguard.C33673gf;
import com.tencent.bugly.proguard.C33765l2;
import com.tencent.bugly.proguard.C33791m7;
import com.tencent.bugly.proguard.C33808n3;
import com.tencent.bugly.proguard.C33831o5;
import com.tencent.bugly.proguard.C33918sa;
import com.tencent.bugly.proguard.C33938ta;
import com.tencent.bugly.proguard.C33940tc;
import com.tencent.bugly.proguard.C33991w3;
import com.tencent.bugly.proguard.C34029y1;
import com.tencent.bugly.proguard.C34032y4;
import com.tencent.bugly.proguard.InterfaceC33568bf;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollector;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollectorForIssue;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import com.tencent.rmonitor.common.logger.ILogProxy;
import com.tencent.rmonitor.custom.ICustomDataEditor;
import com.tencent.rmonitor.manager.RMonitorLauncher;
import com.tencent.rmonitor.sla.C35185b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class Bugly implements BuglyConstants {

    /* JADX INFO: renamed from: a */
    public static C33831o5 f68728a = null;

    /* JADX INFO: renamed from: b */
    public static final long f68729b = 800;

    public static void addCustomDataCollector(ICustomDataCollector iCustomDataCollector) {
        if (C33673gf.m73198a()) {
            C33652ff.m73063a(216, iCustomDataCollector);
        } else {
            Log.e(BuglyConstants.TAG, "add custom data collector failed, pls init monitor first!");
        }
    }

    public static boolean handleCatchException(Thread thread, Throwable th2, String str, byte[] bArr, boolean z11) {
        if (C33808n3.m74212e()) {
            return C33808n3.m74193a(thread, th2, str, bArr, z11);
        }
        Log.e(BuglyConstants.TAG, "handle catch exception failed, pls init monitor first!");
        return false;
    }

    public static boolean init(Context context, BuglyBuilder buglyBuilder) {
        return init(context, buglyBuilder, ProcessUtil.isMainProcess(context));
    }

    public static boolean monitorEvent(long j11, String str, Map<String, Double> map, Map<String, String> map2) {
        if (C33673gf.m73198a()) {
            return C33536a4.m72292c().m72299b(j11, str, map, map2);
        }
        Log.e(BuglyConstants.TAG, "monitor event failed, pls init monitor first!");
        return false;
    }

    public static void postException(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        if (C33808n3.m74212e()) {
            C33808n3.m74189a(thread, i11, str, str2, str3, map);
        } else {
            Log.e(BuglyConstants.TAG, "post Exception failed, pls init monitor first!");
        }
    }

    public static void removeCustomDataCollector(ICustomDataCollector iCustomDataCollector) {
        if (C33673gf.m73198a()) {
            C33652ff.m73070b(216, iCustomDataCollector);
        } else {
            Log.e(BuglyConstants.TAG, "remove custom data collector failed, pls init monitor first!");
        }
    }

    public static boolean init(Context context, BuglyBuilder buglyBuilder, boolean z11) {
        if (context == null) {
            Log.e(BuglyConstants.TAG, "Bugly init failed, please make sure context not null.");
            return false;
        }
        if (buglyBuilder == null) {
            Log.e(BuglyConstants.TAG, "Bugly init failed, please make sure Bugly builder not null.");
            return false;
        }
        if (!TextUtils.isEmpty(buglyBuilder.serverHostType) && !C33597d2.m72767a(buglyBuilder.serverHostType)) {
            Log.e(BuglyConstants.TAG, "Bugly init failed, please make sure serverHostType is valid.");
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        C33598d3.m72770a(context);
        Context contextM72772c = C33598d3.m72772c();
        C33791m7.m74043a(buglyBuilder.cacheDataIntervalMs);
        C34029y1.m75473a(contextM72772c, buglyBuilder);
        ArrayList<String> emergencyReportPlugins = buglyBuilder.getEmergencyReportPlugins();
        if (emergencyReportPlugins != null && emergencyReportPlugins.size() > 0) {
            Iterator<String> it = emergencyReportPlugins.iterator();
            while (it.hasNext()) {
                ReportStrategy.INSTANCE.addEmergencyPlugin(it.next());
            }
        }
        C33808n3.m74218g(contextM72772c, buglyBuilder.appVersion);
        C33808n3.m74222h(contextM72772c, buglyBuilder.userId);
        C33808n3.m74209e(contextM72772c, buglyBuilder.uniqueId);
        C33808n3.m74210e(buglyBuilder.buildNumber);
        C33808n3.m74213f(contextM72772c, buglyBuilder.deviceModel);
        C33765l2.m73825a(contextM72772c).m73854a(buglyBuilder.enableAllThreadStackCrash, buglyBuilder.enableAllThreadStackAnr);
        C33791m7.m74051c(buglyBuilder.appKey);
        C33791m7.m74053d(buglyBuilder.appVersionType);
        C33791m7.m74046a(buglyBuilder.fetchConfigFromServerInSubProcess);
        C33808n3.m74182a(contextM72772c, buglyBuilder.appId, buglyBuilder.debugMode, buglyBuilder.m72199a(), 0L);
        C33808n3.m74202c(contextM72772c, buglyBuilder.appChannel);
        C33808n3.m74187a(buglyBuilder.hotPatchNum);
        C35185b.c.f75333a.m77231g();
        C33652ff.m73074c(107, contextM72772c);
        C33652ff.m73064a(100, buglyBuilder.appKey);
        C33652ff.m73064a(101, buglyBuilder.appId);
        C33652ff.m73064a(103, buglyBuilder.appVersion);
        C33652ff.m73064a(109, buglyBuilder.buildNumber);
        C33652ff.m73064a(102, buglyBuilder.userId);
        C33652ff.m73064a(106, buglyBuilder.uniqueId);
        C33652ff.m73064a(113, buglyBuilder.deviceModel);
        C33652ff.m73074c(104, Integer.valueOf(buglyBuilder.logLevel));
        C33652ff.m73064a(112, buglyBuilder.appVersionType);
        C33652ff.m73074c(InterfaceC33568bf.f69245q, Boolean.valueOf(buglyBuilder.enableCrashProtect));
        C33652ff.m73074c(111, buglyBuilder.spProvider);
        List<String> listM72200b = buglyBuilder.m72200b();
        if (z11) {
            listM72200b.remove("sub_memory_quantile");
        } else {
            listM72200b.remove("memory_quantile");
        }
        C33652ff.m73069b(listM72200b);
        C33938ta.m75049a(jUptimeMillis, SystemClock.uptimeMillis(), true);
        return C33808n3.f71018c && C33673gf.m73198a();
    }

    public static void setMonitorCallback(String str, MonitorCallback monitorCallback) {
        if (MonitorCallback.EVENT_FPS.equals(str)) {
            C33831o5 c33831o5 = f68728a;
            if (c33831o5 == null) {
                c33831o5 = new C33831o5();
                f68728a = c33831o5;
            }
            c33831o5.m74416a(monitorCallback);
        }
    }

    public static void abolishPerformanceMonitors() {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "abolish monitors failed, pls init monitor first!");
        } else {
            C33652ff.m73059a();
        }
    }

    public static void addCallback(String str, Callback callback, Object obj) {
        long jLongValue;
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "add callback failed, pls init monitor first!");
            return;
        }
        try {
            if ("msg_lag".equals(str)) {
                if (obj instanceof Long) {
                    jLongValue = ((Long) obj).longValue();
                } else {
                    jLongValue = 800;
                }
                C33940tc.m75053a(jLongValue, callback);
                return;
            }
            C33660g2.m73123a(str, callback);
        } catch (Throwable unused) {
        }
    }

    public static boolean checkAllPluginStarted(List<String> list) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "check plugin started failed, pls init monitor first!");
            return false;
        }
        return RMonitorLauncher.INSTANCE.checkAllDesiredPluginStarted(list);
    }

    public static boolean enableHookJavaStackTrace(boolean z11) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "enable hook java stack trace failed, pls init first!");
            return false;
        }
        return ThreadSuspend.m77109c().m77112a(z11);
    }

    public static void enterScene(String str) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "enter scene failed, pls init monitor first!");
        } else {
            C33657g.m73095h().m73104b(str);
        }
    }

    public static void exitScene(String str) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "exit scene failed, pls init monitor first!");
        } else {
            C33657g.m73095h().m73105c(str);
        }
    }

    public static ICustomDataEditor getGlobalCustomDataEditor() {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "get global custom data editor failed, pls init monitor first!");
            return null;
        }
        return C33991w3.m75338a();
    }

    public static BuglyReplayOptions getReplayOptions() {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "get replay options failed, pls init bugly first!");
            return null;
        }
        return C33808n3.m74205d();
    }

    public static String getUniqueId() {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            return C33808n3.m74201c();
        }
        Log.e(BuglyConstants.TAG, "get unique id failed, pls init monitor first!");
        return "";
    }

    public static void putUserData(Context context, String str, String str2) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "put user data failed, pls init monitor first!");
        } else {
            C33808n3.m74181a(context, str, str2);
        }
    }

    public static boolean reRegisterHandler() {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            return C33808n3.m74216f();
        }
        Log.e(BuglyConstants.TAG, "reRegisterHandler failed, pls init monitor first!");
        return false;
    }

    public static void removeCallback(String str) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "remove callback failed, pls init monitor first!");
            return;
        }
        try {
            if ("msg_lag".equals(str)) {
                C33940tc.m75052a();
            } else {
                C33660g2.m73126c(str);
            }
        } catch (Throwable unused) {
        }
    }

    public static String removeUserData(Context context, String str) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "remove user data failed, pls init monitor first!");
            return null;
        }
        return C33808n3.m74197b(context, str);
    }

    public static boolean setAdditionalAttachmentPaths(String[] strArr) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "set additional attachment paths failed, pls init monitor first!");
            return false;
        }
        return C33808n3.m74195a(strArr);
    }

    public static void setCaseLabels(String str) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "set case labels fail, pls init bugly first!");
        } else {
            C33808n3.m74207d(str);
        }
    }

    public static void setCrashMonitorAble(int i11, boolean z11) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "set crash monitor able failed, pls init monitor first!");
        }
        switch (i11) {
            case 100:
                C33808n3.m74211e(z11);
                break;
            case 101:
                C33808n3.m74215f(z11);
                break;
            case 102:
                C33808n3.m74204c(z11);
                break;
            default:
                Log.e(BuglyConstants.TAG, "Crash monitor able set failed, please check crash type.");
                break;
        }
    }

    public static void setForegroundUserInfoReport(boolean z11, long j11) {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            C33918sa.m74931a(z11, j11);
        } else {
            Log.e(BuglyConstants.TAG, "setForegroundUserInfoReport failed, pls init monitor first!");
        }
    }

    public static void setPerformanceMonitorAble(String str, boolean z11) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "set performance monitors able failed, pls init monitor first!");
        } else if (z11) {
            C33652ff.m73069b((List<String>) Collections.singletonList(str));
        } else {
            C33652ff.m73073c((List<String>) Collections.singletonList(str));
        }
    }

    public static void setPerformanceMonitorsAble(List<String> list, boolean z11) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "set performance monitors able failed, pls init monitor first!");
        } else if (z11) {
            C33652ff.m73069b(list);
        } else {
            C33652ff.m73073c(list);
        }
    }

    public static void setSdkLogProxy(ILogProxy iLogProxy) {
        C33808n3.m74186a(iLogProxy);
    }

    public static void setTestLabels(String str) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "set test labels fail, pls init bugly first!");
        } else {
            C33808n3.m74219g(str);
        }
    }

    public static void setUserInfoReportOpt(boolean z11) {
        C33808n3.m74220g(z11);
    }

    public static void startInspectLeakObj(Object obj) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "start inspect leak obj failed, pls init monitor first!");
        } else {
            C33565bc.m72497a(obj, new C34032y4());
        }
    }

    public static void testCrash(int i11) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "test crash failed, pls init monitor first!");
        }
        switch (i11) {
            case 100:
                C33808n3.m74221h();
                break;
            case 101:
                C33808n3.m74192a(false, true, false);
                break;
            case 102:
                C33808n3.m74217g();
                break;
            default:
                Log.e(BuglyConstants.TAG, "test crash failed, please check crash type.");
                break;
        }
    }

    public static void triggerUserDataReport() {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "trigger user info upload failed, pls init monitor first!");
        } else {
            try {
                CrashReport.triggerUserInfoUpload();
            } catch (Throwable unused) {
            }
        }
    }

    public static void updateAppChannel(Context context, String str) {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            C33808n3.m74202c(context, str);
        } else {
            Log.e(BuglyConstants.TAG, "update app channel failed, pls init monitor first!");
        }
    }

    public static void updateDeviceModel(Context context, String str) {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            C33808n3.m74213f(context, str);
            C33652ff.m73064a(113, str);
        } else {
            Log.e(BuglyConstants.TAG, "update device model failed, pls init monitor first!");
        }
    }

    public static void updateLogLevel(int i11) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "update log level failed, pls init monitor first!");
        } else {
            C33652ff.m73074c(104, Integer.valueOf(i11));
        }
    }

    public static void updateUniqueId(Context context, String str) {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            C33808n3.m74209e(context, str);
            C33652ff.m73064a(106, str);
        } else {
            Log.e(BuglyConstants.TAG, "update unique id failed, pls init monitor first!");
        }
    }

    public static void updateUserId(Context context, String str) {
        if (C33808n3.m74212e() && C33673gf.m73198a()) {
            C33808n3.m74222h(context, str);
            C33652ff.m73064a(102, str);
        } else {
            Log.e(BuglyConstants.TAG, "update user id failed, pls init monitor first!");
        }
    }

    public static void addCustomDataCollector(ICustomDataCollectorForIssue iCustomDataCollectorForIssue) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "add custom data collector failed, pls init monitor first!");
        } else {
            C33652ff.m73063a(217, iCustomDataCollectorForIssue);
        }
    }

    public static boolean handleCatchException(Thread thread, Throwable th2, String str, byte[] bArr) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "handle catch exception failed, pls init monitor first!");
            return false;
        }
        return C33808n3.m74193a(thread, th2, str, bArr, true);
    }

    public static boolean monitorEvent(String str, Map<String, Double> map, Map<String, String> map2) {
        return monitorEvent(System.currentTimeMillis(), str, map, map2);
    }

    public static void postException(int i11, String str, String str2, String str3, Map<String, String> map) {
        if (!C33808n3.m74212e()) {
            Log.e(BuglyConstants.TAG, "post Exception failed, pls init monitor first!");
        } else {
            C33808n3.m74189a(Thread.currentThread(), i11, str, str2, str3, map);
        }
    }

    public static void removeCustomDataCollector(ICustomDataCollectorForIssue iCustomDataCollectorForIssue) {
        if (!C33673gf.m73198a()) {
            Log.e(BuglyConstants.TAG, "remove custom data collector failed, pls init monitor first!");
        } else {
            C33652ff.m73070b(217, iCustomDataCollectorForIssue);
        }
    }
}
