package com.tencent.bugly.proguard;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.z */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C34047z {

    /* JADX INFO: renamed from: b */
    public static final String f72576b = "RMonitor_launch_impl";

    /* JADX INFO: renamed from: c */
    public static final String f72577c = "RMonitor_launch_monitor";

    /* JADX INFO: renamed from: d */
    public static final String f72578d = "RMonitor_enable_protect";

    /* JADX INFO: renamed from: e */
    public static final int f72579e = 4;

    /* JADX INFO: renamed from: f */
    public static final long f72580f = 20000;

    /* JADX INFO: renamed from: a */
    public WeakReference<Context> f72581a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.z$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C34047z.this.m75556b(true);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.z$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C34047z f72583a = new C34047z();
    }

    public /* synthetic */ C34047z(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static void m75544b(Context context) {
        try {
            C33791m7.m74060h();
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext == null) {
                applicationContext = context;
            }
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                b.f72583a.m75548a((Context) application);
                b.f72583a.m75557c(application);
            } else {
                Logger.INSTANCE.mo77131e(f72576b, "install fail for application context is null, context: " + context);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static C34047z m75545c() {
        return b.f72583a;
    }

    /* JADX INFO: renamed from: a */
    public void m75548a(Context context) {
        if (context != null) {
            this.f72581a = new WeakReference<>(context);
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m75560d() {
        SharedPreferences sharedPreferencesM75562e = m75562e();
        if (sharedPreferencesM75562e != null) {
            return sharedPreferencesM75562e.getInt(InterfaceC33611dg.f69606o, 0);
        }
        return 0;
    }

    public C34047z() {
        this.f72581a = null;
    }

    /* JADX INFO: renamed from: a */
    public void m75551a(boolean z11) {
        if (z11) {
            m75549a(f72577c);
        } else {
            m75555b(f72577c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75557c(Application application) {
        if (m75559c(f72577c)) {
            m75551a(false);
            m75566i();
            m75561d(application);
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m75563f() {
        return m75559c(f72577c);
    }

    /* JADX INFO: renamed from: h */
    public boolean m75565h() {
        return m75559c(f72578d);
    }

    /* JADX INFO: renamed from: i */
    public final void m75566i() {
        if (m75559c(f72578d)) {
            ThreadManager.runInMainThread(new a(), 20000L);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75561d(Application application) {
        if (AndroidVersion.isOverJellyBeanMr2()) {
            m75554b(application);
            m75547a(application);
            C33553b0.m72375g().m72378a(application);
            return;
        }
        Logger.INSTANCE.mo77132i(f72576b, "installAppLaunchMonitor fail for api level below JellyBeanMr2.");
    }

    /* JADX INFO: renamed from: e */
    public final SharedPreferences m75562e() {
        Context contextM75553b = m75553b();
        if (contextM75553b != null) {
            return contextM75553b.getSharedPreferences(InterfaceC33611dg.f69592a, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m75564g() {
        SharedPreferences sharedPreferencesM75562e = m75562e();
        if (sharedPreferencesM75562e == null) {
            return false;
        }
        return sharedPreferencesM75562e.getBoolean(InterfaceC33611dg.f69605n, false);
    }

    /* JADX INFO: renamed from: a */
    public boolean m75552a() {
        try {
            if (m75564g()) {
                m75546a(0);
                return false;
            }
            int iM75560d = m75560d() + 1;
            boolean z11 = iM75560d > 4;
            m75546a(iM75560d);
            return z11;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f72576b, C33799mf.m74131a("isLastLaunchMonitorUnSafe, t: ", th2));
            return true;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m75558c(boolean z11) {
        if (z11) {
            m75549a(f72578d);
        } else {
            m75555b(f72578d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75559c(String str) {
        boolean zExists;
        Context contextM75553b = m75553b();
        if (contextM75553b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(contextM75553b.getFilesDir());
            zExists = new File(C34025xh.m75464a(sb2, File.separator, str)).exists();
        } else {
            zExists = false;
        }
        m75550a("isFileExist", str, zExists, contextM75553b);
        return zExists;
    }

    /* JADX INFO: renamed from: b */
    public void m75556b(boolean z11) {
        SharedPreferences sharedPreferencesM75562e = m75562e();
        if (sharedPreferencesM75562e != null) {
            sharedPreferencesM75562e.edit().putBoolean(InterfaceC33611dg.f69605n, z11).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75546a(int i11) {
        SharedPreferences sharedPreferencesM75562e = m75562e();
        if (sharedPreferencesM75562e != null) {
            sharedPreferencesM75562e.edit().putInt(InterfaceC33611dg.f69606o, i11).commit();
        }
    }

    /* JADX INFO: renamed from: b */
    public final Context m75553b() {
        WeakReference<Context> weakReference = this.f72581a;
        Context context = weakReference != null ? weakReference.get() : null;
        return context == null ? C33598d3.m72772c() : context;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX INFO: renamed from: a */
    public final void m75549a(String str) {
        boolean zCreateNewFile;
        Context contextM75553b = m75553b();
        if (contextM75553b != null) {
            try {
                File file = new File(contextM75553b.getFilesDir() + File.separator + str);
                if (file.exists()) {
                    zCreateNewFile = false;
                } else {
                    zCreateNewFile = file.createNewFile();
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f72576b, th2);
            }
        } else {
            zCreateNewFile = false;
        }
        m75550a("createFile", str, zCreateNewFile, contextM75553b);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    /* JADX INFO: renamed from: b */
    public final void m75555b(String str) {
        boolean zDelete;
        Context contextM75553b = m75553b();
        if (contextM75553b != null) {
            try {
                File file = new File(contextM75553b.getFilesDir() + File.separator + str);
                if (file.exists()) {
                    zDelete = file.delete();
                } else {
                    zDelete = false;
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f72576b, th2);
            }
        } else {
            zDelete = false;
        }
        m75550a("deleteFile", str, zDelete, contextM75553b);
    }

    /* JADX INFO: renamed from: a */
    public final void m75550a(String str, String str2, boolean z11, Context context) {
        if (!z11) {
            Logger.INSTANCE.mo77134w(f72576b, str, ", fileName: ", str2, ", ret: ", String.valueOf(z11), ", context: ", context == null ? "null" : "not null");
        } else {
            Logger.INSTANCE.mo77130d(f72576b, str, ", fileName: ", str2, ", ret: ", String.valueOf(z11), ", context: ", context == null ? "null" : "not null");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m75554b(Application application) {
        if (application == null) {
            return;
        }
        try {
            Resources resources = application.getResources();
            int identifier = resources.getIdentifier("rmonitor_app_launch_monitor_landing_activity", "array", application.getPackageName());
            String[] stringArray = identifier != 0 ? resources.getStringArray(identifier) : null;
            for (int i11 = 0; stringArray != null && i11 < stringArray.length; i11++) {
                C33553b0.m72375g().f68885i.m74804b(stringArray[i11]);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72576b, "get rmonitor config fail ", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m75547a(Application application) {
        if (application == null) {
            return;
        }
        try {
            Resources resources = application.getResources();
            int identifier = resources.getIdentifier("rmonitor_app_launch_monitor_activity_before_landing", "array", application.getPackageName());
            String[] stringArray = identifier != 0 ? resources.getStringArray(identifier) : null;
            C33553b0.m72375g().f68885i.m74803a(stringArray != null && stringArray.length > 0);
            for (int i11 = 0; stringArray != null && i11 < stringArray.length; i11++) {
                C33553b0.m72375g().f68885i.m74802a(stringArray[i11]);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f72576b, "get rmonitor config fail ", th2);
        }
    }
}
