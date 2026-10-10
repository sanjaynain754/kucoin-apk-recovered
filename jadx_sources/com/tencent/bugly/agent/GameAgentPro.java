package com.tencent.bugly.agent;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.launch.AppLaunchProxy;
import com.tencent.bugly.library.Bugly;
import com.tencent.bugly.library.BuglyBuilder;
import com.tencent.bugly.library.BuglyConstants;
import com.tencent.bugly.proguard.C33597d2;
import com.tencent.bugly.proguard.C33707i7;
import com.tencent.feedback.eup.CrashHandleListener;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class GameAgentPro {

    /* JADX INFO: renamed from: a */
    public static CrashHandleListener f68483a;

    public static void postExceptionAgent(int i11, String str, String str2, String str3, boolean z11) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        Bugly.postException(i11, str, str2, str3, null);
        if (z11) {
            C33707i7.m73356a(3000L);
        }
    }

    public static void setAdditionalAttachmentPathsAgent(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        Log.i(BuglyConstants.TAG, "set additional attachment " + Bugly.setAdditionalAttachmentPaths(strArr));
    }

    public static void setCrashHandlerListenerAgent(CrashHandleListener crashHandleListener) {
        f68483a = crashHandleListener;
    }

    public static void startInspectLeakObjAgent(Object obj) {
        if (obj == null) {
            return;
        }
        Bugly.startInspectLeakObj(obj);
    }

    public static void initAgent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z11, int i11, String[] strArr) {
        Context contextM73381g = C33707i7.m73381g();
        if (contextM73381g != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C33707i7.f70214r = new Handler(Looper.getMainLooper());
            BuglyBuilder buglyBuilder = new BuglyBuilder(str, str2);
            if (!TextUtils.isEmpty(str3)) {
                buglyBuilder.appVersion = str3;
            }
            if (!TextUtils.isEmpty(str4)) {
                buglyBuilder.buildNumber = str4;
            }
            if (!TextUtils.isEmpty(str5)) {
                buglyBuilder.uniqueId = str5;
            }
            if (!TextUtils.isEmpty(str6)) {
                buglyBuilder.userId = str6;
            }
            if (!TextUtils.isEmpty(str7)) {
                buglyBuilder.deviceModel = str7;
            }
            if (!TextUtils.isEmpty(str8)) {
                buglyBuilder.appVersionType = str8;
            }
            if (!TextUtils.isEmpty(str9)) {
                buglyBuilder.appChannel = str9;
            }
            buglyBuilder.debugMode = z11;
            buglyBuilder.logLevel = i11;
            if (strArr != null) {
                for (String str10 : strArr) {
                    buglyBuilder.addMonitor(str10);
                }
            }
            CrashHandleListener crashHandleListener = f68483a;
            if (crashHandleListener != null) {
                buglyBuilder.setCrashHandleListener(crashHandleListener);
            }
            Bugly.init(contextM73381g, buglyBuilder);
        }
    }

    public static void launchAddTagAgent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppLaunchProxy.getAppLaunch().addTag(str);
    }

    public static void launchSpanEndAgent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppLaunchProxy.getAppLaunch().spanEnd(str);
    }

    public static void launchSpanStartAgent(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AppLaunchProxy.getAppLaunch().spanStart(str, str2);
    }

    public static void putUserDataAgent(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Bugly.putUserData(C33707i7.m73381g(), str, str2);
        }
    }

    public static void reportAppFullLaunchAgent() {
        AppLaunchProxy.getAppLaunch().reportAppFullLaunch();
    }

    public static void setGameType(int i11) {
        C33707i7.m73350a(i11);
    }

    public static void setServerHostType(String str) {
        if (!TextUtils.isEmpty(str)) {
            C33597d2.m72767a(str);
        }
    }

    public static void updateLogLevelAgent(int i11) {
        Bugly.updateLogLevel(i11);
    }

    public static void updateUniqueIdAgent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bugly.updateUniqueId(C33707i7.m73381g(), str);
    }

    public static void updateUserIdAgent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Bugly.updateUserId(C33707i7.m73381g(), str);
    }
}
