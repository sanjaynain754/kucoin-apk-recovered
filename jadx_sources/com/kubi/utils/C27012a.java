package com.kubi.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import java.util.Stack;

/* JADX INFO: renamed from: com.kubi.utils.a */
/* JADX INFO: compiled from: ActivityStashManager.java */
/* JADX INFO: loaded from: classes23.dex */
public class C27012a {

    /* JADX INFO: renamed from: b */
    public static C27012a f54303b;

    /* JADX INFO: renamed from: a */
    public final Stack<Activity> f54304a = new Stack<>();

    /* JADX INFO: renamed from: com.kubi.utils.a$a */
    /* JADX INFO: compiled from: ActivityStashManager.java */
    public static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C27012a.m66486i().m66487a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C27012a.m66486i().m66497l(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: i */
    public static C27012a m66486i() {
        synchronized (ActivityManager.class) {
            try {
                if (f54303b == null) {
                    f54303b = new C27012a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f54303b;
    }

    /* JADX INFO: renamed from: a */
    public void m66487a(Activity activity) {
        this.f54304a.push(activity);
    }

    /* JADX INFO: renamed from: b */
    public final void m66488b(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        activity.finish();
        this.f54304a.remove(activity);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public final void m66489c(Class<? extends Activity>... clsArr) {
        for (int size = this.f54304a.size() - 1; size >= 0; size--) {
            Activity activity = this.f54304a.get(size);
            for (Class<? extends Activity> cls : clsArr) {
                if (cls.getName().equals(activity.getClass().getName())) {
                    m66488b(activity);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m66490d() {
        for (int size = this.f54304a.size() - 1; size >= 0; size--) {
            m66488b(this.f54304a.get(size));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m66491e() {
        Activity activityPop = this.f54304a.pop();
        if (activityPop.isFinishing()) {
            return;
        }
        activityPop.finish();
    }

    /* JADX INFO: renamed from: f */
    public int m66492f() {
        return this.f54304a.size();
    }

    /* JADX INFO: renamed from: g */
    public Stack<Activity> m66493g() {
        return this.f54304a;
    }

    /* JADX INFO: renamed from: h */
    public Activity m66494h() {
        if (this.f54304a.empty()) {
            return null;
        }
        return this.f54304a.peek();
    }

    /* JADX INFO: renamed from: j */
    public void m66495j(Application application) {
        m66496k(application, new a());
    }

    /* JADX INFO: renamed from: l */
    public void m66497l(Activity activity) {
        this.f54304a.remove(activity);
    }

    /* JADX INFO: renamed from: k */
    public void m66496k(Application application, a aVar) {
        application.registerActivityLifecycleCallbacks(aVar);
    }
}
