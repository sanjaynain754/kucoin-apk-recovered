package com.tencent.bugly.proguard;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.bugly.common.p127sp.ISharedPreferencesProvider;
import com.tencent.rmonitor.base.config.C35100a;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.listener.IBaseListener;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollector;
import com.tencent.rmonitor.base.plugin.listener.ICustomDataCollectorForIssue;
import com.tencent.rmonitor.base.plugin.listener.IDBTracerListener;
import com.tencent.rmonitor.base.plugin.listener.IDeviceInfoListener;
import com.tencent.rmonitor.base.plugin.listener.IDropFrameListener;
import com.tencent.rmonitor.base.plugin.listener.IIoTracerListener;
import com.tencent.rmonitor.base.plugin.listener.ILooperListener;
import com.tencent.rmonitor.base.plugin.listener.IMemoryCeilingListener;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppVersionHelper;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.te */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33942te {

    /* JADX INFO: renamed from: d */
    public static final String f72081d = "RMonitor_manager_Property";

    /* JADX INFO: renamed from: e */
    public static C33942te f72082e;

    /* JADX INFO: renamed from: a */
    public final SparseArray<InterfaceC34057z9> f72083a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<InterfaceC33977v9> f72084b;

    /* JADX INFO: renamed from: c */
    public final SparseArray<InterfaceC33997w9> f72085c;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$e */
    /* JADX INFO: compiled from: BUGLY */
    public static class e implements InterfaceC33977v9 {
        @Override // com.tencent.bugly.proguard.InterfaceC33977v9
        /* JADX INFO: renamed from: a */
        public boolean mo75060a(Object obj) {
            boolean z11;
            if (obj instanceof Application) {
                BaseInfo.app = (Application) obj;
                C33598d3.m72770a((Context) obj);
                z11 = true;
            } else {
                z11 = false;
            }
            if (obj != null && z11) {
                return z11;
            }
            Logger.INSTANCE.mo77134w(C33942te.f72081d, "AppInstance is not instance of android.app.Application.");
            return z11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$f */
    /* JADX INFO: compiled from: BUGLY */
    public static class f implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (!C34042ye.a.f72562a.equals(str)) {
                return false;
            }
            ConfigProxy.INSTANCE.getConfig().m77080g();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$h */
    /* JADX INFO: compiled from: BUGLY */
    public static class h implements InterfaceC33977v9 {
        @Override // com.tencent.bugly.proguard.InterfaceC33977v9
        /* JADX INFO: renamed from: a */
        public boolean mo75060a(Object obj) {
            C33787m3.m74029a(((Boolean) obj).booleanValue());
            return true;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$l */
    /* JADX INFO: compiled from: BUGLY */
    public static class l implements InterfaceC33977v9 {
        @Override // com.tencent.bugly.proguard.InterfaceC33977v9
        /* JADX INFO: renamed from: a */
        public boolean mo75060a(Object obj) {
            if (obj == null) {
                C33716ig.m73433a().m73435a((ISharedPreferencesProvider) null);
                return true;
            }
            if (!(obj instanceof ISharedPreferencesProvider)) {
                return false;
            }
            C33716ig.m73433a().m73435a((ISharedPreferencesProvider) obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33942te m75054a() {
        if (f72082e == null) {
            synchronized (C33942te.class) {
                try {
                    if (f72082e == null) {
                        f72082e = new C33942te();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72082e;
    }

    /* JADX INFO: renamed from: b */
    public final void m75057b() {
        this.f72085c.put(207, new C34058za(IIoTracerListener.class, ListenerManager.ioTracerListener));
        this.f72085c.put(213, new C34058za(IDBTracerListener.class, ListenerManager.dbTracerListener));
        this.f72085c.put(201, new C34058za(IMemoryLeakListener.class, ListenerManager.memoryLeakListener));
        this.f72085c.put(202, new C34058za(IMemoryCeilingListener.class, ListenerManager.memoryCeilingListener));
        this.f72085c.put(203, new C34058za(IDropFrameListener.class, ListenerManager.dropFrameListener));
        this.f72085c.put(205, new C34058za(ILooperListener.class, ListenerManager.looperListener));
        this.f72085c.put(210, new C34058za(IBaseListener.class, ListenerManager.bigBitmapListener));
        this.f72085c.put(208, new C34058za(IBaseListener.class, ListenerManager.fdLeakListener));
        this.f72085c.put(209, new C34058za(IBaseListener.class, ListenerManager.natMemListener));
        this.f72085c.put(211, new C34058za(IDeviceInfoListener.class, ListenerManager.deviceInfoListener));
        this.f72085c.put(212, new C34058za(InterfaceC33645f8.class, ListenerManager.batteryListener));
        this.f72085c.put(215, new C34058za(InterfaceC33856p9.class, ListenerManager.pluginStateListener));
        this.f72085c.put(216, new C34058za(ICustomDataCollector.class, ListenerManager.customDataCollector));
        this.f72085c.put(217, new C34058za(ICustomDataCollectorForIssue.class, ListenerManager.customDataCollectorForIssue));
        this.f72085c.put(219, new C34058za(InterfaceC33709i9.class, ListenerManager.memoryPeakListener));
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$a */
    /* JADX INFO: compiled from: BUGLY */
    public static class a implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            return C33791m7.m74049b(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            return C33791m7.m74051c(str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (C33791m7.m74053d(str)) {
                ConfigProxy.INSTANCE.getConfig().m77080g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (!TextUtils.isEmpty(str)) {
                C33791m7.m74058g(str);
                AppVersionHelper.INSTANCE.setProductVersion(str);
                ConfigProxy.INSTANCE.getConfig().m77080g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$g */
    /* JADX INFO: compiled from: BUGLY */
    public static class g implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if ("v7".equalsIgnoreCase(str)) {
                ConfigProxy.INSTANCE.getConfig().m77065a(C35100a.c.f75188b, true);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$i */
    /* JADX INFO: compiled from: BUGLY */
    public static class i implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (C33791m7.m74057f(str)) {
                ConfigProxy.INSTANCE.getConfig().m77080g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$j */
    /* JADX INFO: compiled from: BUGLY */
    public static class j implements InterfaceC34057z9, InterfaceC33977v9 {
        @Override // com.tencent.bugly.proguard.InterfaceC33977v9
        /* JADX INFO: renamed from: a */
        public boolean mo75060a(Object obj) {
            try {
                Logger.INSTANCE.resetLogLevel(((Integer) obj).intValue());
                return true;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(C33942te.f72081d, th2);
                return false;
            }
        }

        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            try {
                Logger.INSTANCE.resetLogLevel(Integer.parseInt(str));
                return true;
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(C33942te.f72081d, th2);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$k */
    /* JADX INFO: compiled from: BUGLY */
    public static class k implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (!TextUtils.isEmpty(str)) {
                AppVersionHelper.INSTANCE.setRdmUuid(str);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$m */
    /* JADX INFO: compiled from: BUGLY */
    public static class m implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (C33791m7.m74055e(str)) {
                ConfigProxy.INSTANCE.getConfig().m77080g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.te$n */
    /* JADX INFO: compiled from: BUGLY */
    public static class n implements InterfaceC34057z9 {
        @Override // com.tencent.bugly.proguard.InterfaceC34057z9
        /* JADX INFO: renamed from: a */
        public boolean mo75059a(String str) {
            if (C33791m7.m74061h(str)) {
                ConfigProxy.INSTANCE.getConfig().m77080g();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC34057z9 m75058c(int i11) {
        return this.f72083a.get(i11);
    }

    public C33942te() {
        SparseArray<InterfaceC34057z9> sparseArray = new SparseArray<>(8);
        this.f72083a = sparseArray;
        SparseArray<InterfaceC33977v9> sparseArray2 = new SparseArray<>(12);
        this.f72084b = sparseArray2;
        this.f72085c = new SparseArray<>(3);
        j jVar = new j();
        sparseArray.put(104, jVar);
        sparseArray.put(102, new n());
        sparseArray.put(101, new a());
        sparseArray.put(100, new b());
        sparseArray.put(103, new d());
        sparseArray.put(106, new m());
        sparseArray.put(113, new i());
        sparseArray.put(108, new f());
        sparseArray.put(109, new k());
        sparseArray.put(110, new g());
        sparseArray.put(112, new c());
        sparseArray2.put(104, jVar);
        sparseArray2.put(107, new e());
        sparseArray2.put(InterfaceC33568bf.f69245q, new h());
        sparseArray2.put(111, new l());
        m75057b();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC33977v9 m75055a(int i11) {
        return this.f72084b.get(i11);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC33997w9 m75056b(int i11) {
        return this.f72085c.get(i11);
    }
}
