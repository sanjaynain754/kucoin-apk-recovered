package com.tencent.bugly.proguard;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.util.ClassUtil;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.FileUtil;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.r1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33889r1 extends QAPMMonitorPlugin {

    /* JADX INFO: renamed from: g */
    public static final String f71589g = "RMonitor_BigBitmap_Monitor";

    /* JADX INFO: renamed from: h */
    public static volatile C33889r1 f71590h;

    /* JADX INFO: renamed from: b */
    public final a f71591b = new a();

    /* JADX INFO: renamed from: c */
    public final C33869q1 f71592c = new C33869q1(new C33725j4());

    /* JADX INFO: renamed from: d */
    public final C33909s1 f71593d = new C33909s1();

    /* JADX INFO: renamed from: e */
    public final Set<String> f71594e = new HashSet();

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f71595f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.r1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends C33758kg {

        /* JADX INFO: renamed from: e */
        public static final int f71596e = 1;

        /* JADX INFO: renamed from: b */
        public final SparseArray<ViewTreeObserverOnGlobalLayoutListenerC34043yf> f71597b = new SparseArray<>();

        /* JADX INFO: renamed from: c */
        public final Handler f71598c = new HandlerC46994a(Looper.getMainLooper());

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.r1$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class HandlerC46994a extends Handler {
            public HandlerC46994a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                Activity activity;
                if (message.what != 1 || (activity = (Activity) message.obj) == null || activity.isFinishing()) {
                    return;
                }
                a.this.m74718a(activity);
            }
        }

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public final void m74718a(@NonNull Activity activity) {
            View decorView = activity.getWindow().getDecorView();
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            String className = ClassUtil.getClassName(activity, null);
            C33889r1 c33889r1 = C33889r1.this;
            ViewTreeObserverOnGlobalLayoutListenerC34043yf viewTreeObserverOnGlobalLayoutListenerC34043yf = new ViewTreeObserverOnGlobalLayoutListenerC34043yf(className, decorView, c33889r1.f71592c, c33889r1.f71593d);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC34043yf);
            this.f71597b.put(decorView.hashCode(), viewTreeObserverOnGlobalLayoutListenerC34043yf);
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onDestroy(@NonNull Activity activity) {
            this.f71598c.removeMessages(1, activity);
            View decorView = activity.getWindow().getDecorView();
            ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
            ViewTreeObserverOnGlobalLayoutListenerC34043yf viewTreeObserverOnGlobalLayoutListenerC34043yf = this.f71597b.get(decorView.hashCode());
            if (viewTreeObserverOnGlobalLayoutListenerC34043yf == null || !AndroidVersion.isOverJellyBean()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC34043yf);
        }

        @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onPostCreate(@NonNull Activity activity) {
            String simpleName = activity.getClass().getSimpleName();
            if (C33889r1.this.m74716b(simpleName)) {
                Logger.INSTANCE.mo77130d(C33889r1.f71589g, simpleName, " is excluded");
            } else if (AndroidVersion.isOverN()) {
                m74718a(activity);
            } else {
                Handler handler = this.f71598c;
                handler.sendMessage(Message.obtain(handler, 1, activity));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74715b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FileUtil.getRootPath());
        String str = File.separator;
        sb2.append(str);
        sb2.append("dumpfile");
        sb2.append(str);
        sb2.append("big_bitmap");
        sb2.append(str);
        File file = new File(sb2.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.f71595f.compareAndSet(false, true)) {
            this.f71592c.m74640a(new C33949u1());
            this.f71592c.m74640a(new C33842og());
            this.f71592c.m74640a(new C34023xf());
        }
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        LifecycleCallback.unRegister(this.f71591b);
        C33589cf.m72692a().m72693a(C33981vd.m75302a("big_bitmap"));
    }

    /* JADX INFO: renamed from: a */
    public static C33889r1 m74711a() {
        if (f71590h == null) {
            synchronized (C33889r1.class) {
                try {
                    if (f71590h == null) {
                        f71590h = new C33889r1();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71590h;
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (!AndroidVersion.isOverJellyBean()) {
            Logger.INSTANCE.mo77134w(f71589g, "BigBitMap don't support below JellyBean");
            return;
        }
        m74715b();
        stop();
        LifecycleCallback.register(this.f71591b);
        C33589cf.m72692a().m72696b(C33981vd.m75302a("big_bitmap"));
    }

    /* JADX INFO: renamed from: a */
    public C33889r1 m74714a(List<String> list) {
        this.f71594e.addAll(list);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m74716b(String str) {
        return this.f71594e.contains(str);
    }
}
