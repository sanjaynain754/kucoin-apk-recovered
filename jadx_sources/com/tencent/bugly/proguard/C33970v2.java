package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.v2 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33970v2 implements InterfaceC33771l8 {

    /* JADX INFO: renamed from: c */
    public static final String f72308c = "RMonitor_config";

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArrayList<InterfaceC33771l8> f72309a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f72310b;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.v2$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C33970v2 f72311a = new C33970v2();
    }

    /* JADX INFO: renamed from: c */
    public static C33970v2 m75256c() {
        return b.f72311a;
    }

    /* JADX INFO: renamed from: a */
    public void m75258a(InterfaceC33771l8 interfaceC33771l8) {
        if (interfaceC33771l8 != null) {
            this.f72309a.add(interfaceC33771l8);
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_config", "add config creator {" + interfaceC33771l8 + "}");
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: b */
    public AbstractC34022xe mo73136b(String str) {
        m75257a();
        Iterator<InterfaceC33771l8> it = this.f72309a.iterator();
        AbstractC34022xe abstractC34022xeMo73136b = null;
        while (it.hasNext() && (abstractC34022xeMo73136b = it.next().mo73136b(str)) == null) {
        }
        return abstractC34022xeMo73136b;
    }

    public C33970v2() {
        this.f72309a = new CopyOnWriteArrayList<>();
        this.f72310b = false;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC33771l8 m75260c(String str) {
        try {
            return (InterfaceC33771l8) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            Logger.INSTANCE.mo77132i("RMonitor_config", C33778lf.m73987a("new creator fail {", str, "}"));
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m75261d() {
        return this.f72309a.size() >= 2;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33771l8
    /* JADX INFO: renamed from: a */
    public C33694hf mo73135a(String str) {
        m75257a();
        Iterator<InterfaceC33771l8> it = this.f72309a.iterator();
        C33694hf c33694hfMo73135a = null;
        while (it.hasNext() && (c33694hfMo73135a = it.next().mo73135a(str)) == null) {
        }
        return c33694hfMo73135a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m75259b() {
        if (this.f72310b) {
            return;
        }
        Logger logger = Logger.INSTANCE;
        logger.mo77132i("RMonitor_config", "generate creator");
        m75258a(m75260c("com.tencent.rmonitor.base.config.creator.LagConfigCreator"));
        m75258a(m75260c("com.tencent.rmonitor.base.config.creator.MemoryConfigCreator"));
        m75258a(m75260c("com.tencent.rmonitor.base.config.creator.ResourceConfigCreator"));
        m75258a(m75260c("com.tencent.rmonitor.base.config.creator.DefaultConfigCreator"));
        m75258a(m75260c("com.tencent.bugly.crashreport.common.config.CrashConfigCreator"));
        m75258a(new C33807n2());
        this.f72310b = true;
        logger.mo77132i("RMonitor_config", "generate creator end {" + this.f72309a.size() + "}");
    }

    /* JADX INFO: renamed from: a */
    public final void m75257a() {
        if (this.f72309a.isEmpty()) {
            m75259b();
        }
    }
}
