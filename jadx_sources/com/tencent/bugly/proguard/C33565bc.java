package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.common.heapdump.ForkJvmHeapDumper;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.common.utils.RecyclablePool;
import com.tencent.rmonitor.base.meta.DumpResult;
import com.tencent.rmonitor.base.meta.InspectUUID;
import com.tencent.rmonitor.base.plugin.listener.IMemoryLeakListener;
import com.tencent.rmonitor.base.plugin.monitor.PluginController;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.bc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33565bc {

    /* JADX INFO: renamed from: d */
    public static final String f69166d = "RMonitor_MemoryLeak_LeakInspector";

    /* JADX INFO: renamed from: e */
    public static final int f69167e = 5000;

    /* JADX INFO: renamed from: f */
    public static final int f69168f = 1000;

    /* JADX INFO: renamed from: g */
    public static final int f69169g = 20;

    /* JADX INFO: renamed from: j */
    public static ReferenceQueue<Object> f69172j = null;

    /* JADX INFO: renamed from: m */
    public static final long f69175m = 5;

    /* JADX INFO: renamed from: n */
    public static final long f69176n = 180000;

    /* JADX INFO: renamed from: o */
    public static final long f69177o = 30000;

    /* JADX INFO: renamed from: a */
    public final Handler f69178a;

    /* JADX INFO: renamed from: b */
    public final IMemoryLeakListener f69179b;

    /* JADX INFO: renamed from: c */
    public final C33628ec f69180c = new C33628ec();

    /* JADX INFO: renamed from: h */
    public static final RecyclablePool f69170h = new RecyclablePool(InspectUUID.class, 20);

    /* JADX INFO: renamed from: i */
    public static long f69171i = 0;

    /* JADX INFO: renamed from: k */
    public static List<d> f69173k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public static final Object f69174l = new Object();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InspectUUID f69181a;

        public a(InspectUUID inspectUUID) {
            this.f69181a = inspectUUID;
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            InspectUUID inspectUUID = this.f69181a;
            Handler handler = C33565bc.this.f69178a;
            C33565bc c33565bc = C33565bc.this;
            C33565bc.this.f69178a.post(new c(inspectUUID, 0, handler, c33565bc.f69179b, c33565bc.f69180c));
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bc$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public int f69184b;

        /* JADX INFO: renamed from: c */
        public final InspectUUID f69185c;

        /* JADX INFO: renamed from: d */
        public final Handler f69186d;

        /* JADX INFO: renamed from: e */
        public final IMemoryLeakListener f69187e;

        /* JADX INFO: renamed from: f */
        public final C33628ec f69188f;

        /* JADX INFO: renamed from: g */
        public long f69189g;

        /* JADX INFO: renamed from: h */
        public boolean f69190h;

        /* JADX INFO: renamed from: a */
        public final boolean m72510a(long j11) {
            if ((this.f69190h ? C33728j7.m73530a() - this.f69189g : 0L) < 20) {
                int i11 = this.f69184b + 1;
                this.f69184b = i11;
                if (i11 < j11) {
                    C33565bc.m72503e();
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            InspectUUID inspectUUID = this.f69185c;
            if (inspectUUID == null) {
                Logger.INSTANCE.mo77134w(C33565bc.f69166d, "uuid is null");
                return;
            }
            String string = inspectUUID.toString();
            try {
                Logger logger = Logger.INSTANCE;
                logger.mo77130d(C33565bc.f69166d, "Inspecting ", string, " Time=", String.valueOf(System.currentTimeMillis()), " count=", String.valueOf(this.f69184b));
                C33607dc c33607dcM75457e = C34019xb.m75457e();
                WeakReference<Object> weakReference = this.f69185c.weakObj;
                if (weakReference == null || weakReference.get() == null || this.f69185c.weakObj.isEnqueued()) {
                    logger.mo77130d(C33565bc.f69166d, "inspect ", string, " finished no leak");
                    C33565bc.f69170h.recycle(this.f69185c);
                } else if (m72511a(c33607dcM75457e, string)) {
                    d dVar = new d(this.f69185c, this.f69187e, System.currentTimeMillis(), this.f69188f);
                    synchronized (C33565bc.f69174l) {
                        C33565bc.f69173k.add(dVar);
                    }
                    ThreadManager.runInDumpThread(new b(), 0L);
                }
            } catch (Throwable th2) {
                Logger logger2 = Logger.INSTANCE;
                logger2.mo77131e(C33565bc.f69166d, "error, ", string, " Time=", String.valueOf(System.currentTimeMillis()), " count=", String.valueOf(this.f69184b), " Throwable: ", logger2.getThrowableMessage(th2));
                C33565bc.f69170h.recycle(this.f69185c);
            }
        }

        public c(InspectUUID inspectUUID, int i11, Handler handler, IMemoryLeakListener iMemoryLeakListener, C33628ec c33628ec) {
            this.f69190h = false;
            this.f69184b = i11;
            this.f69185c = inspectUUID;
            this.f69186d = handler;
            this.f69187e = iMemoryLeakListener;
            this.f69188f = c33628ec;
            this.f69189g = 0L;
            if (AndroidVersion.isOverM()) {
                long jM73530a = C33728j7.m73530a();
                if (jM73530a >= 0) {
                    this.f69190h = true;
                    this.f69189g = jM73530a;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final boolean m72511a(C33607dc c33607dc, String str) {
            if (!m72510a(c33607dc.m72826d())) {
                this.f69187e.onCheckingLeaked(((this.f69184b - 1) * 5000) / 1000, str);
                this.f69186d.postDelayed(this, 5000L);
                return false;
            }
            if (this.f69187e.onLeaked(this.f69185c)) {
                return true;
            }
            if (!c33607dc.m72830h()) {
                C33565bc.f69170h.recycle(this.f69185c);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bc$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public C33607dc f69183b = C34019xb.m75457e();

        /* JADX INFO: renamed from: a */
        public final boolean m72509a() {
            if (C33565bc.f69173k.size() > 5) {
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<d> it = C33565bc.f69173k.iterator();
            while (it.hasNext()) {
                if (it.next().f69194d + 180000 < jCurrentTimeMillis) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            String string;
            try {
                synchronized (C33565bc.f69174l) {
                    List<d> list = C33565bc.f69173k;
                    if (list != null && !list.isEmpty()) {
                        boolean zM72509a = m72509a();
                        if (zM72509a) {
                            HashMap map = new HashMap();
                            synchronized (C33565bc.f69174l) {
                                try {
                                    dVar = C33565bc.f69173k.get(0);
                                    string = dVar.f69191a.toString();
                                    C33565bc.f69173k.remove(0);
                                    for (d dVar2 : C33565bc.f69173k) {
                                        map.put(new String(dVar2.f69191a.uuid), dVar2.f69191a.className);
                                    }
                                    C33565bc.f69173k.clear();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            DumpResult dumpResultM75495a = C34039yb.m75495a(string, string + "_leak", this.f69183b.m72827e(), false, dVar.f69192b, this.f69183b.m72829g(), this.f69183b.f69564n);
                            if (dumpResultM75495a.success) {
                                String str = "";
                                String str2 = dVar.f69191a.uuid;
                                if (str2 != null) {
                                    str = new String(str2);
                                }
                                dVar.f69193c.m72957a(dVar.f69191a.className, str, dumpResultM75495a, map);
                                return;
                            }
                            return;
                        }
                        ThreadManager.runInDumpThread(this, 30000L);
                    }
                }
            } catch (Throwable th3) {
                Logger.INSTANCE.exception(C33565bc.f69166d, th3);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.bc$d */
    /* JADX INFO: compiled from: BUGLY */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final InspectUUID f69191a;

        /* JADX INFO: renamed from: b */
        public final IMemoryLeakListener f69192b;

        /* JADX INFO: renamed from: c */
        public final C33628ec f69193c;

        /* JADX INFO: renamed from: d */
        public final long f69194d;

        public d(InspectUUID inspectUUID, IMemoryLeakListener iMemoryLeakListener, long j11, C33628ec c33628ec) {
            this.f69191a = inspectUUID;
            this.f69192b = iMemoryLeakListener;
            this.f69194d = j11;
            this.f69193c = c33628ec;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m72504f() {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m72508g() {
        this.f69178a.removeCallbacksAndMessages(null);
    }

    public C33565bc(Handler handler, IMemoryLeakListener iMemoryLeakListener) {
        this.f69178a = handler;
        this.f69179b = iMemoryLeakListener;
    }

    /* JADX INFO: renamed from: a */
    public static void m72497a(Object obj, IMemoryLeakListener iMemoryLeakListener) {
        if (obj == null) {
            Logger.INSTANCE.mo77132i(f69166d, "leakObj is null");
            return;
        }
        if (!(C33915s7.m74925a() instanceof ForkJvmHeapDumper)) {
            Logger.INSTANCE.mo77132i(f69166d, "startInspect has not valid dumper");
            return;
        }
        InspectUUID inspectUUID = (InspectUUID) f69170h.obtain(InspectUUID.class);
        if (inspectUUID == null) {
            return;
        }
        PluginController pluginController = PluginController.INSTANCE;
        if (!pluginController.whetherPluginSampling("activity_leak")) {
            Logger.INSTANCE.mo77132i(f69166d, "leakSampleLost for user");
            return;
        }
        if (!pluginController.whetherPluginEventSampling("activity_leak")) {
            Logger.INSTANCE.mo77132i(f69166d, "leakSampleLost for event");
            return;
        }
        if (!pluginController.canCollect("activity_leak")) {
            Logger.INSTANCE.mo77132i(f69166d, "can not report again");
            return;
        }
        inspectUUID.weakObj = new WeakReference<>(obj, f69172j);
        inspectUUID.uuid = UUID.randomUUID().toString();
        inspectUUID.digest = "digest";
        inspectUUID.className = obj.getClass().getSimpleName();
        if (iMemoryLeakListener == null) {
            iMemoryLeakListener = new C34032y4();
        }
        ThreadManager.runInMonitorThread(new c(inspectUUID, 0, new Handler(ThreadManager.getMonitorThreadLooper()), iMemoryLeakListener, new C33628ec()), 0L);
    }

    /* JADX INFO: renamed from: e */
    public static void m72503e() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f69171i >= 5000) {
            Runtime.getRuntime().gc();
            m72504f();
            System.runFinalization();
            f69171i = jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72506b(@NonNull Object obj, String str) {
        InspectUUID inspectUUIDM72505a;
        if (this.f69179b.onFilter(obj) || (inspectUUIDM72505a = m72505a(obj, str)) == null) {
            return;
        }
        Looper.getMainLooper();
        Looper.myQueue().addIdleHandler(new a(inspectUUIDM72505a));
    }

    /* JADX INFO: renamed from: c */
    public void m72507c(@NonNull Object obj, String str) {
        if (this.f69179b == null) {
            Logger.INSTANCE.mo77131e(f69166d, "Please init a listener first!");
            return;
        }
        PluginController pluginController = PluginController.INSTANCE;
        if (!pluginController.whetherPluginEventSampling("activity_leak")) {
            Logger.INSTANCE.mo77132i(f69166d, "leakSampleLost");
        } else if (!pluginController.canCollect("activity_leak")) {
            Logger.INSTANCE.mo77132i(f69166d, "can not report again");
        } else {
            m72506b(obj, str);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final InspectUUID m72505a(@NonNull Object obj, String str) {
        try {
            InspectUUID inspectUUID = (InspectUUID) f69170h.obtain(InspectUUID.class);
            if (inspectUUID == null) {
                return null;
            }
            inspectUUID.weakObj = new WeakReference<>(obj, f69172j);
            inspectUUID.uuid = UUID.randomUUID().toString();
            inspectUUID.digest = str;
            inspectUUID.className = obj.getClass().getName();
            return inspectUUID;
        } catch (Exception unused) {
            return null;
        }
    }
}
