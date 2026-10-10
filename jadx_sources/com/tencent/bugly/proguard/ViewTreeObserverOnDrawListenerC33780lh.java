package com.tencent.bugly.proguard;

import android.app.Activity;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.lh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 16)
public final class ViewTreeObserverOnDrawListenerC33780lh extends C33758kg implements ViewTreeObserver.OnDrawListener, Runnable {

    /* JADX INFO: renamed from: e */
    public static final String f70849e = "RMonitor_looper_UIRefreshTracer";

    /* JADX INFO: renamed from: f */
    public static final long f70850f = 1000;

    /* JADX INFO: renamed from: d */
    public boolean f70853d = false;

    /* JADX INFO: renamed from: c */
    public final ArrayList<b> f70852c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final HashMap<Integer, WeakReference<Activity>> f70851b = new HashMap<>();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.lh$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final ViewTreeObserverOnDrawListenerC33780lh f70854a = new ViewTreeObserverOnDrawListenerC33780lh();
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.lh$b */
    /* JADX INFO: compiled from: BUGLY */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo73977a();
    }

    /* JADX INFO: renamed from: b */
    public static ViewTreeObserverOnDrawListenerC33780lh m73988b() {
        return a.f70854a;
    }

    /* JADX INFO: renamed from: a */
    public void m73991a(b bVar) {
        if (bVar == null || this.f70852c.contains(bVar)) {
            return;
        }
        this.f70852c.add(bVar);
        WeakReference<Activity> lastResumeActivityRef = LifecycleCallback.INSTANCE.getLastResumeActivityRef();
        m73990a(lastResumeActivityRef == null ? null : lastResumeActivityRef.get());
        if (!this.f70853d) {
            LifecycleCallback.register(this);
            this.f70853d = true;
        }
        Logger.INSTANCE.mo77130d(f70849e, "register, listener: ", bVar.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m73995c(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70849e, "removeOnDrawListenerInner", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73993b(b bVar) {
        if (bVar == null) {
            return;
        }
        this.f70852c.remove(bVar);
        if (this.f70852c.isEmpty()) {
            ThreadManager.runInMainThread(this, 1000L);
        }
        Logger.INSTANCE.mo77130d(f70849e, "unRegister, listener: ", bVar.toString());
    }

    /* JADX INFO: renamed from: d */
    public boolean m73996d() {
        return this.f70853d;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        try {
            Iterator<b> it = this.f70852c.iterator();
            while (it.hasNext()) {
                it.next().mo73977a();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f70852c.isEmpty()) {
            if (this.f70853d) {
                LifecycleCallback.unRegister(this);
                this.f70853d = false;
            }
            Iterator<Map.Entry<Integer, WeakReference<Activity>>> it = this.f70851b.entrySet().iterator();
            while (it.hasNext()) {
                WeakReference<Activity> value = it.next().getValue();
                if (value != null) {
                    m73995c(value.get());
                }
            }
            this.f70851b.clear();
        }
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(@NotNull Activity activity) {
        m73992b(activity);
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(@NotNull Activity activity) {
        m73990a(activity);
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NotNull Activity activity) {
        m73992b(activity);
    }

    /* JADX INFO: renamed from: c */
    public int m73994c() {
        return this.f70852c.size();
    }

    /* JADX INFO: renamed from: b */
    public void m73992b(Activity activity) {
        if (activity == null || this.f70851b.isEmpty()) {
            return;
        }
        if (this.f70851b.remove(Integer.valueOf(activity.hashCode())) == null) {
            return;
        }
        m73995c(activity);
    }

    /* JADX INFO: renamed from: a */
    public void m73990a(Activity activity) {
        if (activity == null || this.f70852c.isEmpty()) {
            return;
        }
        int iHashCode = activity.hashCode();
        if (this.f70851b.get(Integer.valueOf(iHashCode)) != null) {
            return;
        }
        this.f70851b.put(Integer.valueOf(iHashCode), new WeakReference<>(activity));
        try {
            activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(this);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70849e, "addOnDrawListener", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public int m73989a() {
        return this.f70851b.size();
    }
}
