package com.tencent.bugly.proguard;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.util.AppVersionHelper;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.gf */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33673gf {

    /* JADX INFO: renamed from: a */
    public static boolean f69983a = true;

    /* JADX INFO: renamed from: b */
    public static boolean f69984b = false;

    /* JADX INFO: renamed from: c */
    public static final String f69985c = "RMonitorUtil";

    /* JADX INFO: renamed from: a */
    public static void m73197a(Runnable runnable) {
        if (f69983a) {
            ThreadManager.runInMonitorThread(runnable, 0L);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73201b(boolean z11) {
        f69983a = z11;
    }

    /* JADX INFO: renamed from: b */
    public static long m73200b() {
        return SystemClock.uptimeMillis() * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m73202c() {
        return f69984b;
    }

    /* JADX INFO: renamed from: d */
    public static String m73203d() {
        String strConcat = BaseInfo.app == null ? "you should set PROPERTY_KEY_APP_INSTANCE. " : "";
        UserMeta userMeta = BaseInfo.userMeta;
        if (TextUtils.isEmpty(userMeta.appId) || TextUtils.isEmpty(userMeta.appKey)) {
            strConcat = strConcat.concat("you should set PROPERTY_KEY_APP_ID. ");
        }
        if (!TextUtils.isEmpty(userMeta.appVersion)) {
            return strConcat;
        }
        return strConcat + "we can not get your app version, you should set PROPERTY_KEY_APP_VERSION ";
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73198a() {
        if (BaseInfo.app == null) {
            return false;
        }
        UserMeta userMeta = BaseInfo.userMeta;
        if (TextUtils.isEmpty(userMeta.appVersion)) {
            userMeta.appVersion = AppVersionHelper.INSTANCE.checkAndGetAppVersion(BaseInfo.app.getApplicationContext());
        }
        if (TextUtils.isEmpty(userMeta.buildNumber)) {
            userMeta.buildNumber = AppVersionHelper.INSTANCE.checkAndGetUuid(BaseInfo.app.getApplicationContext());
        }
        return (TextUtils.isEmpty(userMeta.appId) || TextUtils.isEmpty(userMeta.appKey) || TextUtils.isEmpty(userMeta.appVersion)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73199a(boolean z11) {
        f69984b = z11;
        return z11;
    }
}
