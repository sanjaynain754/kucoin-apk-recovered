package com.tencent.bugly.proguard;

import android.os.Looper;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.LooperObserver;
import com.tencent.rmonitor.looper.provider.StackQueueProvider;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.aa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33542aa {

    /* JADX INFO: renamed from: e */
    public static final String f68809e = "RMonitor_lag";

    /* JADX INFO: renamed from: a */
    public final Looper f68810a;

    /* JADX INFO: renamed from: b */
    public final C33878qa f68811b;

    /* JADX INFO: renamed from: c */
    public AbstractC33857pa f68812c;

    /* JADX INFO: renamed from: d */
    public boolean f68813d;

    /* JADX INFO: renamed from: a */
    public final boolean m72323a() {
        return this.f68810a.getThread().isAlive();
    }

    /* JADX INFO: renamed from: b */
    public boolean m72324b() {
        return this.f68813d;
    }

    /* JADX INFO: renamed from: c */
    public void m72325c() {
        if (this.f68813d) {
            Logger.INSTANCE.mo77131e(f68809e, "work thread monitor has start yet.");
            return;
        }
        if (!m72323a()) {
            Logger.INSTANCE.mo77131e(f68809e, "start fail for work thread is not alive.");
            return;
        }
        synchronized (this) {
            try {
                if (!this.f68813d) {
                    LooperObserver looperObserver = new LooperObserver(this.f68810a, this.f68811b);
                    looperObserver.setStackProvider(new StackQueueProvider());
                    looperObserver.start();
                    looperObserver.resume();
                    this.f68812c = looperObserver;
                    this.f68813d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Logger.INSTANCE.mo77132i(f68809e, "start work thread monitor.");
    }

    /* JADX INFO: renamed from: d */
    public void m72326d() {
        if (this.f68813d) {
            synchronized (this) {
                try {
                    if (this.f68813d) {
                        AbstractC33857pa abstractC33857pa = this.f68812c;
                        if (abstractC33857pa != null) {
                            abstractC33857pa.stop();
                        }
                        this.f68812c = null;
                        this.f68813d = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Logger.INSTANCE.mo77132i(f68809e, "stop work thread monitor.");
        }
    }

    public C33542aa(Looper looper, C33878qa c33878qa) {
        C33878qa c33878qa2 = new C33878qa();
        this.f68811b = c33878qa2;
        this.f68812c = null;
        this.f68813d = false;
        this.f68810a = looper;
        c33878qa2.m74679a(c33878qa);
    }
}
