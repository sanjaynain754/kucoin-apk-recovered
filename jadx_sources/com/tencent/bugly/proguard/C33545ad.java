package com.tencent.bugly.proguard;

import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ad */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33545ad {

    /* JADX INFO: renamed from: c */
    public static C33545ad f68862c;

    /* JADX INFO: renamed from: d */
    public static Object f68863d = new Object();

    /* JADX INFO: renamed from: a */
    public boolean f68864a = false;

    /* JADX INFO: renamed from: b */
    public List<a> f68865b = new ArrayList();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ad$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {
        void onSubProcessConfigChanged(boolean z11);
    }

    /* JADX INFO: renamed from: b */
    public static C33545ad m72356b() {
        if (f68862c == null) {
            synchronized (f68863d) {
                try {
                    if (f68862c == null) {
                        f68862c = new C33545ad();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68862c;
    }

    /* JADX INFO: renamed from: a */
    public void m72358a(boolean z11) {
        this.f68864a = z11;
        Iterator<a> it = this.f68865b.iterator();
        while (it.hasNext()) {
            it.next().onSubProcessConfigChanged(z11);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m72359a() {
        return this.f68864a;
    }

    /* JADX INFO: renamed from: a */
    public void m72357a(a aVar) {
        if (aVar != null) {
            this.f68865b.add(aVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72360b(boolean z11) {
        if (NativeCrashHandler.getInstance() != null) {
            NativeCrashHandler.getInstance().setSupportLoadBias(Boolean.valueOf(z11));
        }
    }
}
