package com.tencent.bugly.proguard;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 18)
public class C33678h {

    /* JADX INFO: renamed from: c */
    public static final String f70025c = "RMonitor_launch_ActivityLaunchWatcher";

    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, b> f70026a = new HashMap<>(10);

    /* JADX INFO: renamed from: b */
    public final d f70027b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.h$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b bVar : C33678h.this.f70026a.values()) {
                Activity activity = bVar.f70030b.get();
                if (activity != null) {
                    C33678h.this.m73219b(activity, bVar);
                }
            }
            C33678h.this.f70026a.clear();
            Logger.INSTANCE.mo77130d(C33678h.f70025c, "destroy end");
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.h$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final String f70029a;

        /* JADX INFO: renamed from: b */
        public final WeakReference<Activity> f70030b;

        /* JADX INFO: renamed from: c */
        public boolean f70031c = false;

        /* JADX INFO: renamed from: d */
        public boolean f70032d = false;

        /* JADX INFO: renamed from: e */
        public boolean f70033e = true;

        /* JADX INFO: renamed from: f */
        public long f70034f = 0;

        /* JADX INFO: renamed from: g */
        public long f70035g = 0;

        /* JADX INFO: renamed from: h */
        public int f70036h = 0;

        /* JADX INFO: renamed from: i */
        public long f70037i = 0;

        /* JADX INFO: renamed from: j */
        public long f70038j = 0;

        /* JADX INFO: renamed from: k */
        public c f70039k = null;

        /* JADX INFO: renamed from: a */
        public void m73224a() {
            this.f70038j = SystemClock.uptimeMillis();
            this.f70031c = true;
            this.f70032d = true;
        }

        public String toString() {
            return "{name: " + this.f70029a + ", firstLaunchCostInMs: " + this.f70034f + ", launchCountExcludeFirstTime: " + this.f70036h + ", launchCostExcludeFirstTimeInMs: " + this.f70035g + "}";
        }

        public b(Activity activity) {
            this.f70030b = new WeakReference<>(activity);
            this.f70029a = activity.getClass().getName();
        }

        /* JADX INFO: renamed from: a */
        public void m73225a(long j11) {
            this.f70031c = false;
            this.f70032d = false;
            if (this.f70033e) {
                this.f70033e = false;
                long j12 = this.f70037i;
                if (j12 != 0) {
                    this.f70034f = j11 - j12;
                    return;
                }
                return;
            }
            long j13 = this.f70038j;
            if (j13 != 0) {
                this.f70036h++;
                this.f70035g = (j11 - j13) + this.f70035g;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.h$c */
    /* JADX INFO: compiled from: BUGLY */
    @RequiresApi(api = 18)
    public class c implements ViewTreeObserver.OnWindowFocusChangeListener, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: f */
        public static final long f70040f = 1000;

        /* JADX INFO: renamed from: b */
        public final b f70041b;

        /* JADX INFO: renamed from: c */
        public long f70042c = 0;

        /* JADX INFO: renamed from: d */
        public long f70043d = 0;

        /* JADX INFO: renamed from: a */
        public final void m73226a() {
            if (this.f70041b.f70031c) {
                long jUptimeMillis = this.f70042c;
                if (jUptimeMillis == 0) {
                    jUptimeMillis = this.f70043d;
                }
                if (jUptimeMillis == 0) {
                    jUptimeMillis = SystemClock.uptimeMillis();
                }
                this.f70041b.m73225a(jUptimeMillis);
                C33678h.this.m73217a(this.f70041b);
            }
        }

        public c(b bVar) {
            this.f70041b = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (this.f70041b.f70032d) {
                m73227a("onDraw");
                this.f70041b.f70032d = false;
                this.f70043d = SystemClock.uptimeMillis();
                ThreadManager.runInMainThread(this, 1000L);
            }
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z11) {
            if (z11 && this.f70041b.f70031c) {
                m73227a("onWindowFocusChanged");
                this.f70042c = SystemClock.uptimeMillis();
                m73226a();
                ThreadManager.cancelFromMainThread(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m73227a("run");
            m73226a();
        }

        /* JADX INFO: renamed from: a */
        public final void m73227a(String str) {
            if (Logger.debug) {
                Logger.INSTANCE.mo77130d(C33678h.f70025c, str + ", activity: " + this.f70041b.f70030b.get());
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.h$d */
    /* JADX INFO: compiled from: BUGLY */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo72381a(b bVar);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final b m73218b(@NotNull Activity activity) {
        int iHashCode = activity.hashCode();
        b bVar = this.f70026a.get(Integer.valueOf(iHashCode));
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(activity);
        this.f70026a.put(Integer.valueOf(iHashCode), bVar2);
        return bVar2;
    }

    /* JADX INFO: renamed from: f */
    public b m73223f(@NotNull Activity activity) {
        return this.f70026a.remove(Integer.valueOf(activity.hashCode()));
    }

    public C33678h(d dVar) {
        this.f70027b = dVar;
    }

    /* JADX INFO: renamed from: c */
    public void m73220c(@NotNull Activity activity) {
        b bVarM73218b = m73218b(activity);
        bVarM73218b.f70037i = SystemClock.uptimeMillis();
        bVarM73218b.f70033e = true;
    }

    /* JADX INFO: renamed from: d */
    public void m73221d(@NotNull Activity activity) {
        b bVarM73223f = m73223f(activity);
        if (bVarM73223f != null) {
            m73219b(activity, bVarM73223f);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m73222e(@NotNull Activity activity) {
        b bVarM73214a = m73214a(activity);
        if (bVarM73214a != null) {
            bVarM73214a.m73224a();
            m73216a(activity, bVarM73214a);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73215a() {
        Logger.INSTANCE.mo77130d(f70025c, "destroy begin");
        ThreadManager.runInMainThread(new a(), 0L);
    }

    /* JADX INFO: renamed from: b */
    public final void m73219b(@NotNull Activity activity, @NotNull b bVar) {
        c cVar = bVar.f70039k;
        if (cVar != null) {
            try {
                bVar.f70039k = null;
                View decorView = activity.getWindow().getDecorView();
                decorView.getViewTreeObserver().removeOnWindowFocusChangeListener(cVar);
                decorView.getViewTreeObserver().removeOnDrawListener(cVar);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f70025c, "removeListener", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public b m73214a(@NotNull Activity activity) {
        return this.f70026a.get(Integer.valueOf(activity.hashCode()));
    }

    /* JADX INFO: renamed from: a */
    public final void m73216a(@NotNull Activity activity, @NotNull b bVar) {
        if (bVar.f70039k == null) {
            try {
                c cVar = new c(bVar);
                bVar.f70039k = cVar;
                View decorView = activity.getWindow().getDecorView();
                decorView.getViewTreeObserver().addOnWindowFocusChangeListener(cVar);
                decorView.getViewTreeObserver().addOnDrawListener(cVar);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f70025c, "addListener", th2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73217a(b bVar) {
        d dVar = this.f70027b;
        if (dVar != null) {
            dVar.mo72381a(bVar);
        }
    }
}
