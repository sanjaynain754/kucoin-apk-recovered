package com.tencent.bugly.proguard;

import android.app.Application;
import android.content.Context;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33598d3 {

    /* JADX INFO: renamed from: a */
    public static final String f69501a = "CrashReport";

    /* JADX INFO: renamed from: b */
    public static Context f69502b;

    /* JADX INFO: renamed from: a */
    public static Context m72769a() {
        Application application = null;
        try {
            Method declaredMethod = Class.forName("android.app.AppGlobals").getDeclaredMethod("getInitialApplication", new Class[0]);
            declaredMethod.setAccessible(true);
            Application application2 = (Application) declaredMethod.invoke(null, new Object[0]);
            try {
                Logger.INSTANCE.mo77132i("CrashReport", "fetch getInitialApplication: " + application2);
                return application2;
            } catch (Throwable th2) {
                th = th2;
                application = application2;
                Logger.INSTANCE.mo77131e("CrashReport", C33799mf.m74131a("fetch getInitialApplication error ", th));
                return application;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Context m72771b() {
        Application application = null;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]);
            declaredMethod.setAccessible(true);
            Application application2 = (Application) declaredMethod.invoke(null, new Object[0]);
            try {
                Logger.INSTANCE.mo77132i("CrashReport", "fetch currentApplication: " + application2);
                return application2;
            } catch (Throwable th2) {
                th = th2;
                application = application2;
                Logger.INSTANCE.mo77131e("CrashReport", C33799mf.m74131a("fetch currentApplication error ", th));
                return application;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Context m72772c() {
        Context context = f69502b;
        if (context == null) {
            Context contextM72771b = m72771b();
            f69502b = contextM72771b;
            if (contextM72771b == null) {
                f69502b = m72769a();
            }
        } else if (!(context instanceof Application)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = f69502b;
            }
            f69502b = applicationContext;
        }
        return f69502b;
    }

    /* JADX INFO: renamed from: a */
    public static void m72770a(Context context) {
        if (context != null) {
            if (context instanceof Application) {
                f69502b = context;
                return;
            }
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            f69502b = context;
        }
    }
}
