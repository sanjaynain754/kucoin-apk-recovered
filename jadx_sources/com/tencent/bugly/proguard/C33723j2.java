package com.tencent.bugly.proguard;

import android.annotation.TargetApi;
import android.os.Looper;
import android.view.Choreographer;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@TargetApi(16)
public class C33723j2 {

    /* JADX INFO: renamed from: c */
    public static final String f70320c = "RMonitor_looper";

    /* JADX INFO: renamed from: d */
    public static final int f70321d = 10;

    /* JADX INFO: renamed from: a */
    public int f70322a = 0;

    /* JADX INFO: renamed from: b */
    public WeakReference<Choreographer> f70323b = null;

    /* JADX INFO: renamed from: a */
    public Choreographer m73456a() {
        WeakReference<Choreographer> weakReference = this.f70323b;
        Choreographer choreographer = weakReference == null ? null : weakReference.get();
        return (choreographer != null || this.f70322a >= 10) ? choreographer : m73458b();
    }

    /* JADX INFO: renamed from: b */
    public final Choreographer m73458b() {
        Choreographer choreographer = null;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            try {
                choreographer = Choreographer.getInstance();
                this.f70323b = new WeakReference<>(choreographer);
                return choreographer;
            } catch (Throwable th2) {
                this.f70322a++;
                Logger.INSTANCE.exception(f70320c, "init choreographer error (fail count: " + this.f70322a + ")", th2);
            }
        }
        return choreographer;
    }

    public C33723j2() {
        m73458b();
    }

    /* JADX INFO: renamed from: a */
    public void m73457a(Choreographer.FrameCallback frameCallback) {
        Choreographer choreographerM73456a = m73456a();
        if (choreographerM73456a == null) {
            return;
        }
        try {
            choreographerM73456a.postFrameCallback(frameCallback);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70320c, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m73459b(Choreographer.FrameCallback frameCallback) {
        Choreographer choreographerM73456a = m73456a();
        if (choreographerM73456a == null) {
            return;
        }
        try {
            choreographerM73456a.removeFrameCallback(frameCallback);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70320c, th2);
        }
    }
}
