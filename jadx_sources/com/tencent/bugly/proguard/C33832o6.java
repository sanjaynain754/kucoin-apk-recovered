package com.tencent.bugly.proguard;

import android.text.TextUtils;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.plugin.listener.IBaseListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.p145fd.FdLeakMonitor;
import com.tencent.rmonitor.p145fd.cluser.FdCluster;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33832o6 {

    /* JADX INFO: renamed from: e */
    public static final String f71307e = "RMonitor_FdLeak_Trigger";

    /* JADX INFO: renamed from: f */
    public static final int f71308f = 3;

    /* JADX INFO: renamed from: b */
    public final C33811n6 f71310b;

    /* JADX INFO: renamed from: c */
    public C33769l6 f71311c;

    /* JADX INFO: renamed from: a */
    public final C33622e6 f71309a = new C33622e6();

    /* JADX INFO: renamed from: d */
    public int f71312d = 0;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o6$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C33933t5 f71313b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71314c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C33706i6 f71315d;

        public a(C33933t5 c33933t5, int i11, C33706i6 c33706i6) {
            this.f71313b = c33933t5;
            this.f71314c = i11;
            this.f71315d = c33706i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33832o6.this.m74427a(this.f71313b.m75041d(), this.f71314c, this.f71315d);
            if (C33664g6.m73151a()) {
                FdLeakMonitor.nEnableLeakDetectThisTime(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o6$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b extends C33852p5 {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ int f71317j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ int f71318k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC33916s8 interfaceC33916s8, int i11, int i12) {
            super(interfaceC33916s8);
            this.f71317j = i11;
            this.f71318k = i12;
        }

        @Override // com.tencent.bugly.proguard.C33852p5, com.tencent.bugly.proguard.InterfaceC33916s8
        /* JADX INFO: renamed from: a */
        public void mo73005a(C33748k6 c33748k6) {
            InterfaceC34036y8 interfaceC34036y8M74430b = C33832o6.this.m74430b();
            ArrayList<String> arrayList = new ArrayList<>();
            if (interfaceC34036y8M74430b != null) {
                arrayList = interfaceC34036y8M74430b.mo73003a(this.f71317j, this.f71318k);
            }
            String strM73251b = C33685h6.m73251b(c33748k6.m73723f(), arrayList);
            if (TextUtils.isEmpty(strM73251b)) {
                c33748k6.m74911a(4);
                C33648fb.m73043b(C33832o6.f71307e, "zip dump files failed when analyzed");
            } else {
                C33832o6.this.f71310b.m74240a(c33748k6, strM73251b);
            }
            super.mo73005a(c33748k6);
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC34036y8 m74430b() {
        if (this.f71311c == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ListenerManager.fdLeakListener.getListenerList().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC34036y8) ((IBaseListener) it.next()));
            }
            this.f71311c = new C33769l6(arrayList);
        }
        return this.f71311c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m74431c() {
        if (this.f71312d >= 3) {
            C33648fb.m73041a(f71307e, "fd leak detected, but fd dump empty to many times.");
            return false;
        }
        if (PluginController.INSTANCE.canCollect("fd_leak")) {
            return m74429a();
        }
        C33648fb.m73041a(f71307e, "fd leak detected, but don't collect.");
        return false;
    }

    public C33832o6(C33811n6 c33811n6) {
        this.f71310b = c33811n6;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74429a() {
        C33685h6.m73249a();
        C33706i6 c33706i6M73245a = C33685h6.m73245a(1, m74430b());
        m74428a(c33706i6M73245a);
        if (!c33706i6M73245a.m74914c()) {
            return false;
        }
        C33933t5 c33933t5M77172a = FdCluster.m77172a((Map<Integer, C33933t5>) c33706i6M73245a.m73345d());
        C33648fb.m73044c(f71307e, "top fd: " + c33933t5M77172a);
        if (c33933t5M77172a == null) {
            return false;
        }
        if (!PluginController.whetherPluginSampling("fd_leak", C33664g6.m73154d().f70125j)) {
            C33648fb.m73044c(f71307e, "do fd analyze, but not sampled.");
            return false;
        }
        ThreadManager.runInDumpThread(new a(c33933t5M77172a, C33914s6.m74917d(), c33706i6M73245a), 0L);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m74427a(int i11, int i12, C33706i6 c33706i6) {
        this.f71309a.m72928a(i11, i12, c33706i6, new b(m74430b(), i11, i12));
    }

    /* JADX INFO: renamed from: a */
    public final void m74428a(C33706i6 c33706i6) {
        if (c33706i6.m74910a() == 11) {
            this.f71312d++;
        } else {
            this.f71312d = 0;
        }
    }
}
