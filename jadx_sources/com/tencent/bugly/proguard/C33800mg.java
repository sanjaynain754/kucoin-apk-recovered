package com.tencent.bugly.proguard;

import android.annotation.SuppressLint;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.mg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33800mg {

    /* JADX INFO: renamed from: d */
    public static final String f70967d = "RMonitor_looper_StackThreadProvider";

    /* JADX INFO: renamed from: e */
    public static final C33800mg f70968e = new C33800mg();

    /* JADX INFO: renamed from: b */
    public HandlerThread f70970b = null;

    /* JADX INFO: renamed from: c */
    public Looper f70971c = null;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<Thread, HandlerThread> f70969a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static Looper m74132a(Thread thread) {
        return m74133d(thread) ? f70968e.m74135a() : f70968e.m74137b(thread);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m74134e(Thread thread) {
        return f70968e.m74139f(thread);
    }

    /* JADX INFO: renamed from: b */
    public final Looper m74137b(Thread thread) {
        if (m74138c(thread)) {
            return null;
        }
        HandlerThread handlerThread = this.f70969a.get(thread);
        if (handlerThread == null) {
            synchronized (this.f70969a) {
                try {
                    handlerThread = this.f70969a.get(thread);
                    if (handlerThread == null) {
                        String name = thread.getName();
                        HandlerThread handlerThread2 = new HandlerThread("RStack_Of_" + name);
                        handlerThread2.start();
                        this.f70969a.put(thread, handlerThread2);
                        Logger.INSTANCE.mo77132i(f70967d, "create stack thread for [" + name + "]");
                        handlerThread = handlerThread2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return handlerThread.getLooper();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74138c(Thread thread) {
        return thread == null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m74133d(Thread thread) {
        if (thread == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m74139f(Thread thread) {
        if (m74138c(thread) || m74133d(thread)) {
            return false;
        }
        HandlerThread handlerThreadRemove = this.f70969a.remove(thread);
        m74136a(handlerThreadRemove);
        if (handlerThreadRemove != null) {
            Logger.INSTANCE.mo77132i(f70967d, "release stack thread for [" + thread.getName() + "]");
        }
        if (handlerThreadRemove == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final Looper m74135a() {
        if (this.f70971c == null) {
            synchronized (this) {
                try {
                    if (this.f70971c == null) {
                        HandlerThread handlerThread = new HandlerThread("RStack_Of_Main");
                        this.f70970b = handlerThread;
                        handlerThread.setPriority(10);
                        this.f70970b.start();
                        this.f70971c = this.f70970b.getLooper();
                        Logger.INSTANCE.mo77132i(f70967d, "create stack thread for main thread. looper[" + this.f70971c + "]");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f70971c;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a */
    public final void m74136a(HandlerThread handlerThread) {
        if (handlerThread == null) {
            return;
        }
        if (AndroidVersion.isOverJellyBeanMr2()) {
            handlerThread.quitSafely();
        } else {
            handlerThread.quit();
        }
        Logger.INSTANCE.mo77132i(f70967d, "quit stack thread [" + handlerThread.getName() + "]");
    }
}
