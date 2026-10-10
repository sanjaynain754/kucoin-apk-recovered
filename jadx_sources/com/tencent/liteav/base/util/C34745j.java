package com.tencent.liteav.base.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.tencent.liteav.base.util.j */
/* JADX INFO: loaded from: classes59.dex */
public final class C34745j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    private static final C34754s<Boolean> f73532b = new C34754s<>(CallableC34746k.m76129a());

    /* JADX INFO: renamed from: a */
    public volatile boolean f73533a;

    /* JADX INFO: renamed from: c */
    private volatile WeakReference<Activity> f73534c;

    /* JADX INFO: renamed from: d */
    private volatile Boolean f73535d;

    /* JADX INFO: renamed from: e */
    private volatile a f73536e;

    /* JADX INFO: renamed from: f */
    private final Set<Integer> f73537f;

    /* JADX INFO: renamed from: g */
    private final Set<Integer> f73538g;

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.j$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo76060a(boolean z11);
    }

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.j$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private static final C34745j f73539a = new C34745j(0);
    }

    public /* synthetic */ C34745j(byte b11) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static void m76119a(boolean z11) {
        f73532b.m76144a(Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m76126b() {
        try {
            if (this.f73535d == null) {
                this.f73535d = f73532b.m76143a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f73535d.booleanValue();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityDestroyed(Activity activity) {
        try {
            if (this.f73533a) {
                StringBuilder sb2 = new StringBuilder("onActivityDestroyed, activity=");
                sb2.append(activity);
                sb2.append(" mActivity=");
                sb2.append(this.f73534c != null ? this.f73534c.get() : "null");
                Log.m76034i("ProcessLifecycleOwner", sb2.toString(), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityPaused(Activity activity) {
        this.f73538g.add(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        m76121b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        m76121b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.f73533a) {
                StringBuilder sb2 = new StringBuilder("onActivityStopped, activity=");
                sb2.append(activity);
                sb2.append(" mActivity=");
                sb2.append(this.f73534c != null ? this.f73534c.get() : "null");
                Log.m76034i("ProcessLifecycleOwner", sb2.toString(), new Object[0]);
            }
            int iHashCode = activity.hashCode();
            if (this.f73537f.contains(Integer.valueOf(iHashCode))) {
                this.f73537f.remove(Integer.valueOf(iHashCode));
                m76122b(this.f73537f.size() == 0);
                if (this.f73534c != null && this.f73534c.get() == activity) {
                    this.f73534c = null;
                }
            } else if (this.f73537f.size() != 0) {
                m76122b(false);
            } else if (this.f73538g.contains(Integer.valueOf(iHashCode))) {
                m76122b(true);
            }
            this.f73538g.remove(Integer.valueOf(iHashCode));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private C34745j() {
        this.f73534c = null;
        this.f73535d = null;
        this.f73537f = new HashSet();
        this.f73538g = new HashSet();
        this.f73533a = false;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            Log.m76033e("ProcessLifecycleOwner", "ProcessStateOwner init failed. Context is null", new Object[0]);
        } else {
            ((Application) applicationContext.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C34745j m76118a() {
        return b.f73539a;
    }

    /* JADX INFO: renamed from: c */
    public final Activity m76127c() {
        WeakReference<Activity> weakReference = this.f73534c;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m76124a(Activity activity) {
        if (activity == null) {
            return;
        }
        if (m76127c() != null) {
            Log.m76034i("ProcessLifecycleOwner", "activity is exists, don't need activity from user", new Object[0]);
            return;
        }
        this.f73534c = new WeakReference<>(activity);
        Log.m76034i("ProcessLifecycleOwner", "update activity to " + activity + " from user", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    private synchronized void m76122b(boolean z11) {
        try {
            if (this.f73535d == null || this.f73535d.booleanValue() != z11) {
                this.f73535d = Boolean.valueOf(z11);
                f73532b.m76144a(Boolean.valueOf(z11));
                if (this.f73536e != null && this.f73533a) {
                    this.f73536e.mo76060a(this.f73535d.booleanValue());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m76121b(Activity activity) {
        this.f73537f.add(Integer.valueOf(activity.hashCode()));
        this.f73534c = new WeakReference<>(activity);
        m76122b(false);
        if (this.f73533a) {
            Log.m76034i("ProcessLifecycleOwner", "update activity to ".concat(String.valueOf(activity)), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m76125a(a aVar) {
        this.f73536e = aVar;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m76120a(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                Log.m76033e("ProcessLifecycleOwner", "activityManager is null.", new Object[0]);
                return false;
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                Log.m76033e("ProcessLifecycleOwner", "processInfoList is null.", new Object[0]);
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            Log.m76033e("ProcessLifecycleOwner", "Get App background state failed. ".concat(String.valueOf(e11)), new Object[0]);
            return false;
        }
    }
}
