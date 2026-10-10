package com.tencent.bugly.proguard;

import android.app.Activity;
import android.os.Handler;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.RequiresApi;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.g7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@RequiresApi(api = 26)
public final class WindowOnFrameMetricsAvailableListenerC33665g7 extends C33758kg implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: g */
    public static final String f69959g = "RMonitor_FrameMetricsWatcher";

    /* JADX INFO: renamed from: d */
    public final a f69962d;

    /* JADX INFO: renamed from: e */
    public final Handler f69963e;

    /* JADX INFO: renamed from: b */
    public final HashMap<Integer, WeakReference<Activity>> f69960b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final C33644f7 f69961c = new C33644f7();

    /* JADX INFO: renamed from: f */
    public boolean f69964f = false;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.g7$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo73165a(C33644f7 c33644f7);
    }

    /* JADX INFO: renamed from: a */
    public void m73160a() {
        if (this.f69962d == null || this.f69963e == null || this.f69964f) {
            return;
        }
        this.f69964f = true;
        LifecycleCallback.register(this);
        m73161a(C33657g.m73092c());
    }

    /* JADX INFO: renamed from: b */
    public void m73162b() {
        if (this.f69964f) {
            LifecycleCallback.unRegister(this);
            Iterator<Map.Entry<Integer, WeakReference<Activity>>> it = this.f69960b.entrySet().iterator();
            while (it.hasNext()) {
                WeakReference<Activity> value = it.next().getValue();
                if (value != null) {
                    m73164c(value.get());
                }
            }
            this.f69960b.clear();
            this.f69964f = false;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73164c(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().removeOnFrameMetricsAvailableListener(this);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69959g, "removeListenerInner", th2);
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i11) {
        if (Logger.verbos && i11 > 0) {
            Logger.INSTANCE.mo77133v(f69959g, C33986vi.m75326a("onFrameMetricsAvailable dropCount: ", i11));
        }
        if (!this.f69964f || frameMetrics == null) {
            return;
        }
        this.f69961c.m73011a(frameMetrics);
        a aVar = this.f69962d;
        if (aVar != null) {
            aVar.mo73165a(this.f69961c);
        }
    }

    public WindowOnFrameMetricsAvailableListenerC33665g7(a aVar, Handler handler) {
        this.f69962d = aVar;
        this.f69963e = handler;
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(@NotNull Activity activity) {
        m73163b(activity);
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(@NotNull Activity activity) {
        m73161a(activity);
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NotNull Activity activity) {
        m73163b(activity);
    }

    /* JADX INFO: renamed from: a */
    public void m73161a(Activity activity) {
        if (activity == null) {
            return;
        }
        int iHashCode = activity.hashCode();
        if (this.f69960b.get(Integer.valueOf(iHashCode)) != null) {
            return;
        }
        this.f69960b.put(Integer.valueOf(iHashCode), new WeakReference<>(activity));
        try {
            activity.getWindow().addOnFrameMetricsAvailableListener(this, this.f69963e);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f69959g, "addListener", th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73163b(Activity activity) {
        if (activity == null || this.f69960b.isEmpty()) {
            return;
        }
        if (this.f69960b.remove(Integer.valueOf(activity.hashCode())) == null) {
            return;
        }
        m73164c(activity);
    }
}
