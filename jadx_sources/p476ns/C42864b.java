package p476ns;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: ns.b */
/* JADX INFO: compiled from: ActivityLifecycle.java */
/* JADX INFO: loaded from: classes30.dex */
public final class C42864b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b */
    public Activity f94924b;

    /* JADX INFO: renamed from: c */
    public RunnableC42867e f94925c;

    /* JADX INFO: renamed from: a */
    public void m94009a() {
        Activity activity = this.f94924b;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m94010b() {
        Activity activity = this.f94924b;
        if (activity == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            activity.unregisterActivityLifecycleCallbacks(this);
        } else {
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f94924b != activity) {
            return;
        }
        this.f94924b = null;
        RunnableC42867e runnableC42867e = this.f94925c;
        if (runnableC42867e == null) {
            return;
        }
        runnableC42867e.m94017g();
        this.f94925c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        RunnableC42867e runnableC42867e;
        Activity activity2 = this.f94924b;
        if (activity2 == activity && activity2.isFinishing() && (runnableC42867e = this.f94925c) != null && runnableC42867e.m94014d()) {
            this.f94925c.m94012b();
        }
    }

    public C42864b(RunnableC42867e runnableC42867e, Activity activity) {
        this.f94924b = activity;
        this.f94925c = runnableC42867e;
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
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
