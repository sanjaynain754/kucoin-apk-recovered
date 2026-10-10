package com.tencent.rmonitor.base.config;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33547af;
import com.tencent.bugly.proguard.C33574c0;
import com.tencent.bugly.proguard.C33637f0;
import com.tencent.bugly.proguard.C33653fg;
import com.tencent.bugly.proguard.C33690hb;
import com.tencent.bugly.proguard.C33694hf;
import com.tencent.bugly.proguard.C33787m3;
import com.tencent.bugly.proguard.C33791m7;
import com.tencent.bugly.proguard.C33805n0;
import com.tencent.bugly.proguard.C33868q0;
import com.tencent.bugly.proguard.InterfaceC33630ee;
import com.tencent.bugly.proguard.InterfaceC33792m8;
import com.tencent.bugly.proguard.InterfaceC33855p8;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.tencent.rmonitor.base.config.a */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class C35100a implements InterfaceC33792m8 {

    /* JADX INFO: renamed from: h */
    public static final String f75176h = "RMonitor_config";

    /* JADX INFO: renamed from: a */
    public final Set<InterfaceC33855p8> f75177a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Boolean> f75178b;

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArraySet<InterfaceC33792m8> f75179c;

    /* JADX INFO: renamed from: d */
    public InterfaceC35102c f75180d;

    /* JADX INFO: renamed from: e */
    public boolean f75181e;

    /* JADX INFO: renamed from: f */
    public boolean f75182f;

    /* JADX INFO: renamed from: g */
    public boolean f75183g;

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.a$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35100a.this.m77064a(InterfaceC35102c.a.LAUNCH);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.a$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC35102c.a f75185b;

        public b(InterfaceC35102c.a aVar) {
            this.f75185b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C35100a.this.m77077e();
            C35101b.c.f75199a.m77089a(this.f75185b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.config.a$c */
    /* JADX INFO: compiled from: BUGLY */
    public interface c {

        /* JADX INFO: renamed from: a */
        public static final String f75187a = "JVM_TI_OPEN";

        /* JADX INFO: renamed from: b */
        public static final String f75188b = "CONFIG_USE_V7";
    }

    public C35100a(InterfaceC35102c interfaceC35102c) {
        this.f75177a = new CopyOnWriteArraySet();
        this.f75178b = new HashMap<>(3);
        this.f75180d = null;
        this.f75181e = false;
        this.f75182f = false;
        this.f75183g = false;
        this.f75179c = new CopyOnWriteArraySet<>();
        this.f75180d = interfaceC35102c;
        m77073c();
    }

    /* JADX INFO: renamed from: b */
    public AbstractC34022xe m77068b(String str) {
        return C35101b.c.f75199a.m77083a(str);
    }

    /* JADX INFO: renamed from: c */
    public final void m77073c() {
        this.f75178b.put(c.f75187a, Boolean.FALSE);
        this.f75178b.put(c.f75188b, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public void m77075d() {
        if (this.f75183g) {
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_config", "init config");
        this.f75183g = true;
        m77060a();
        ThreadManager.runInMonitorThread(new a(), 200L);
    }

    /* JADX INFO: renamed from: e */
    public C33694hf m77076e(String str) {
        return C35101b.c.f75199a.m77091b(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m77078f() {
        Logger.INSTANCE.mo77130d("RMonitor_config", "merge list_metric");
        C33694hf c33694hfM77091b = C35101b.c.f75199a.m77091b("looper_metric");
        C33694hf c33694hfM77091b2 = C35101b.c.f75199a.m77091b(C33690hb.f70089t);
        if ((c33694hfM77091b2 instanceof C33690hb) && (c33694hfM77091b instanceof C33690hb)) {
            ((C33690hb) c33694hfM77091b).m73257a((C33690hb) c33694hfM77091b2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m77080g() {
        if (!this.f75183g) {
            Logger.INSTANCE.mo77130d("RMonitor_config", "refresh config fail for not init yet.");
            return;
        }
        Logger.INSTANCE.mo77132i("RMonitor_config", "refresh config");
        C35101b.c.f75199a.m77087a(BaseInfo.userMeta);
        m77064a(InterfaceC35102c.a.APPLY_PARAM_CHANGE);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public void m77066a(boolean z11) {
        this.f75182f = z11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: b */
    public void m77070b(InterfaceC33855p8 interfaceC33855p8) {
        if (interfaceC33855p8 == null || !m77071b()) {
            return;
        }
        this.f75177a.remove(interfaceC33855p8);
    }

    /* JADX INFO: renamed from: c */
    public DefaultPluginConfig m77072c(String str) {
        m77075d();
        return m77074d(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m77077e() {
        if (this.f75181e) {
            return;
        }
        this.f75181e = true;
        PluginController.INSTANCE.resetReportNum();
        C35101b c35101b = C35101b.c.f75199a;
        InterfaceC35102c interfaceC35102c = this.f75180d;
        if (interfaceC35102c != null) {
            c35101b.m77090a(interfaceC35102c);
            c35101b.m77086a(ThreadManager.getMonitorThreadLooper());
        } else {
            C33791m7.m74044a("RMonitorModule");
        }
        c35101b.m77088a(this);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public void m77063a(InterfaceC33855p8 interfaceC33855p8) {
        if (interfaceC33855p8 == null || !m77071b()) {
            return;
        }
        this.f75177a.add(interfaceC33855p8);
    }

    /* JADX INFO: renamed from: b */
    public void m77069b(InterfaceC33792m8 interfaceC33792m8) {
        if (interfaceC33792m8 != null) {
            this.f75179c.remove(interfaceC33792m8);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m77062a(InterfaceC33792m8 interfaceC33792m8) {
        if (interfaceC33792m8 != null) {
            this.f75179c.add(interfaceC33792m8);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m77071b() {
        return this.f75182f;
    }

    /* JADX INFO: renamed from: a */
    public List<String> m77059a(List<String> list) {
        m77075d();
        return C35101b.c.f75199a.m77084a(list);
    }

    /* JADX INFO: renamed from: d */
    public final DefaultPluginConfig m77074d(String str) {
        for (DefaultPluginConfig defaultPluginConfig : PluginCombination.INSTANCE.getAllPlugin()) {
            if (TextUtils.equals(str, defaultPluginConfig.pluginName)) {
                return defaultPluginConfig;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m77064a(InterfaceC35102c.a aVar) {
        Logger.INSTANCE.mo77132i("RMonitor_config", "load config");
        b bVar = new b(aVar);
        if (ThreadManager.inMonitorThread()) {
            bVar.run();
        } else {
            ThreadManager.runInMonitorThread(bVar, 0L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m77079f(String str) {
        for (String str2 : InterfaceC33630ee.f69751A) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    public C35100a() {
        this.f75177a = new CopyOnWriteArraySet();
        this.f75178b = new HashMap<>(3);
        this.f75180d = null;
        this.f75181e = false;
        this.f75182f = false;
        this.f75183g = false;
        this.f75179c = new CopyOnWriteArraySet<>();
        m77073c();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33792m8
    /* JADX INFO: renamed from: a */
    public void mo74062a(C33547af c33547af) {
        m77078f();
        m77060a();
        Iterator<InterfaceC33792m8> it = this.f75179c.iterator();
        while (it.hasNext()) {
            it.next().mo74062a(c33547af);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m77067a(String str) {
        Boolean bool;
        if (TextUtils.isEmpty(str) || (bool = this.f75178b.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public void m77065a(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f75178b.put(str, Boolean.valueOf(z11));
    }

    /* JADX INFO: renamed from: a */
    public final void m77061a(C33694hf c33694hf, String str) {
        try {
            if (m77071b()) {
                for (InterfaceC33855p8 interfaceC33855p8 : this.f75177a) {
                    if (!m77079f(str)) {
                        interfaceC33855p8.m74512a(c33694hf);
                    }
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_config", th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m77060a() {
        Logger.INSTANCE.mo77130d("RMonitor_config", "apply config");
        C35101b c35101b = C35101b.c.f75199a;
        for (String str : InterfaceC33630ee.f69777z) {
            C33694hf c33694hfM77091b = c35101b.m77091b(str);
            m77061a(c33694hfM77091b, str);
            DefaultPluginConfig defaultPluginConfigM77074d = m77074d(str);
            if (c33694hfM77091b != null && defaultPluginConfigM77074d != null) {
                defaultPluginConfigM77074d.config = c33694hfM77091b;
            }
        }
        AbstractC34022xe abstractC34022xeM77083a = c35101b.m77083a(C33653fg.f69897g);
        if (abstractC34022xeM77083a instanceof C33653fg) {
            C33787m3.m74028a(((C33653fg) abstractC34022xeM77083a).f69898f);
        }
        AbstractC34022xe abstractC34022xeM77083a2 = c35101b.m77083a(AbstractC34022xe.f72512c);
        if (abstractC34022xeM77083a2 instanceof C33805n0) {
            C33868q0.a.f71513a.m74636a((C33805n0) abstractC34022xeM77083a2);
        }
        C33694hf c33694hfM77091b2 = c35101b.m77091b("launch_metric");
        if ((c33694hfM77091b2 instanceof C33574c0) && ProcessUtil.isMainProcess(BaseInfo.app)) {
            new C33637f0().m72974a((C33574c0) c33694hfM77091b2);
        }
    }
}
