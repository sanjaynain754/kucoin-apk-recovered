package com.tencent.rmonitor.pagelaunch;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.ViewTreeObserver;
import com.tencent.bugly.proguard.C33602d7;
import com.tencent.bugly.proguard.C33758kg;
import com.tencent.bugly.proguard.C33961ud;
import com.tencent.bugly.proguard.InterfaceC33562b9;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class PageLaunchMonitor {
    public static final int MAX_CUSTOM_ACTIVITY_NAME = 100;
    public static final String TAG = "PageLaunchMonitor";

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<Integer, C35171a> f75301a;

    /* JADX INFO: renamed from: b */
    public C35169d f75302b;

    /* JADX INFO: renamed from: c */
    public C35167b f75303c;

    /* JADX INFO: renamed from: d */
    public final LruCache<Integer, String> f75304d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f75305e;

    /* JADX INFO: renamed from: com.tencent.rmonitor.pagelaunch.PageLaunchMonitor$b */
    /* JADX INFO: compiled from: BUGLY */
    public class C35167b implements InterfaceC33562b9 {
        public C35167b() {
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33562b9
        public void onFragmentPreAttached(Object obj) {
            Integer numValueOf = Integer.valueOf(obj.hashCode());
            if (PageLaunchMonitor.getInstance().f75301a.contains(numValueOf)) {
                PageLaunchMonitor.getInstance().f75301a.remove(numValueOf);
            }
            C35171a c35171a = new C35171a(obj.hashCode(), obj.getClass().getName());
            c35171a.f75314c = SystemClock.uptimeMillis();
            c35171a.f75315d = System.currentTimeMillis();
            PageLaunchMonitor.getInstance().f75301a.put(numValueOf, c35171a);
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33562b9
        public void onFragmentResumed(Object obj) {
            C35171a c35171a = PageLaunchMonitor.getInstance().f75301a.get(Integer.valueOf(obj.hashCode()));
            if (c35171a != null && c35171a.f75316e == 0) {
                c35171a.f75316e = SystemClock.uptimeMillis();
            }
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33562b9
        public void onFragmentDestroyed(Object obj) {
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33562b9
        public void onFragmentViewDestroyed(Object obj) {
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.pagelaunch.PageLaunchMonitor$c */
    /* JADX INFO: compiled from: BUGLY */
    public class ViewTreeObserverOnWindowFocusChangeListenerC35168c implements ViewTreeObserver.OnWindowFocusChangeListener {

        /* JADX INFO: renamed from: b */
        public final int f75307b;

        public ViewTreeObserverOnWindowFocusChangeListenerC35168c(int i11) {
            this.f75307b = i11;
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z11) {
            C35171a c35171a = PageLaunchMonitor.this.f75301a.get(Integer.valueOf(this.f75307b));
            if (z11 && c35171a != null && c35171a.f75316e == 0) {
                c35171a.f75316e = SystemClock.uptimeMillis();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.pagelaunch.PageLaunchMonitor$d */
    /* JADX INFO: compiled from: BUGLY */
    public class C35169d extends C33758kg {
        public C35169d() {
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onBackground() {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(PageLaunchMonitor.this.f75301a);
            PageLaunchMonitor.this.f75301a.clear();
            C33961ud.m75176a((ConcurrentHashMap<Integer, C35171a>) concurrentHashMap);
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onStop(@NotNull Activity activity) {
            C35171a c35171a = PageLaunchMonitor.this.f75301a.get(Integer.valueOf(activity.hashCode()));
            if (c35171a == null || c35171a.f75318g == null) {
                return;
            }
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnWindowFocusChangeListener(c35171a.f75318g);
                c35171a.f75318g = null;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(PageLaunchMonitor.TAG, "removeOnWindowFocusChangeListener", th2);
            }
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onCreate(@NotNull Activity activity) {
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            if (PageLaunchMonitor.this.f75301a.contains(numValueOf)) {
                PageLaunchMonitor.this.f75301a.remove(numValueOf);
            }
            C35171a c35171a = new C35171a(activity.hashCode(), activity.getClass().getName());
            c35171a.f75314c = SystemClock.uptimeMillis();
            c35171a.f75315d = System.currentTimeMillis();
            PageLaunchMonitor.this.f75301a.put(numValueOf, c35171a);
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onPostCreate(@NotNull Activity activity) {
            try {
                int iHashCode = activity.hashCode();
                C35171a c35171a = PageLaunchMonitor.this.f75301a.get(Integer.valueOf(iHashCode));
                if (c35171a != null) {
                    ViewTreeObserverOnWindowFocusChangeListenerC35168c viewTreeObserverOnWindowFocusChangeListenerC35168c = PageLaunchMonitor.this.new ViewTreeObserverOnWindowFocusChangeListenerC35168c(iHashCode);
                    c35171a.f75318g = viewTreeObserverOnWindowFocusChangeListenerC35168c;
                    activity.getWindow().getDecorView().getViewTreeObserver().addOnWindowFocusChangeListener(viewTreeObserverOnWindowFocusChangeListenerC35168c);
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(PageLaunchMonitor.TAG, "addOnWindowFocusChangeListener", th2);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.pagelaunch.PageLaunchMonitor$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class C35170e {

        /* JADX INFO: renamed from: a */
        public static final PageLaunchMonitor f75310a = new PageLaunchMonitor();
    }

    /* JADX INFO: renamed from: a */
    public void m77205a() {
        LifecycleCallback.register(this.f75302b);
        C33602d7.c.f69516a.m72784a(this.f75303c);
        this.f75305e.compareAndSet(false, true);
    }

    public PageLaunchMonitor() {
        this.f75301a = new ConcurrentHashMap<>();
        this.f75302b = new C35169d();
        this.f75303c = new C35167b();
        this.f75304d = new LruCache<>(100);
        this.f75305e = new AtomicBoolean(false);
    }

    public static PageLaunchMonitor getInstance() {
        return C35170e.f75310a;
    }

    public boolean addOrUpdateCustomName(Object obj, String str) {
        if (!this.f75305e.get()) {
            return false;
        }
        if (obj == null) {
            Logger.INSTANCE.mo77131e(TAG, "activity param is null");
            return false;
        }
        synchronized (this.f75304d) {
            this.f75304d.put(Integer.valueOf(obj.hashCode()), str);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m77206b() {
        this.f75305e.compareAndSet(true, false);
        LifecycleCallback.unRegister(this.f75302b);
        C33602d7.c.f69516a.m72786b(this.f75303c);
    }

    public void endSpan(Object obj, String str) {
        if (!this.f75305e.get() || obj == null) {
            Logger.INSTANCE.mo77130d(TAG, "endSpan, please check param");
            return;
        }
        C35171a c35171a = this.f75301a.get(Integer.valueOf(obj.hashCode()));
        if (c35171a != null) {
            c35171a.m77211b(str);
        }
    }

    public void reportActivityFullLaunch(Object obj) {
        if (!this.f75305e.get() || obj == null) {
            Logger.INSTANCE.mo77130d(TAG, "reportActivityFullLaunch, please check param");
            return;
        }
        C35171a c35171a = this.f75301a.get(Integer.valueOf(obj.hashCode()));
        if (c35171a != null) {
            c35171a.m77213c();
        }
    }

    public void startSpan(Object obj, String str, String str2) {
        if (!this.f75305e.get() || obj == null) {
            Logger.INSTANCE.mo77130d(TAG, "startSpan, please check param");
            return;
        }
        C35171a c35171a = this.f75301a.get(Integer.valueOf(obj.hashCode()));
        if (c35171a != null) {
            c35171a.m77208a(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public String m77204a(int i11, String str) {
        synchronized (this.f75304d) {
            try {
                String str2 = this.f75304d.get(Integer.valueOf(i11));
                return !TextUtils.isEmpty(str2) ? str2 : str;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
