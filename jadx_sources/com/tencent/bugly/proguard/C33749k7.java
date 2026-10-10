package com.tencent.bugly.proguard;

import android.os.Debug;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33749k7 {

    /* JADX INFO: renamed from: e */
    public static final String f70564e = "GcInfoStatHelper";

    /* JADX INFO: renamed from: f */
    public static final int f70565f = 100;

    /* JADX INFO: renamed from: g */
    public static final int f70566g = 10;

    /* JADX INFO: renamed from: h */
    public static final int f70567h = 1024;

    /* JADX INFO: renamed from: a */
    public WeakReference<c> f70568a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f70569b;

    /* JADX INFO: renamed from: c */
    public final LinkedBlockingDeque<b> f70570c;

    /* JADX INFO: renamed from: d */
    public b f70571d;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k7$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j11;
            long j12;
            try {
                b bVarM73738d = C33749k7.this.m73738d();
                if (bVarM73738d == null) {
                    return;
                }
                C33749k7 c33749k7 = C33749k7.this;
                b bVar = c33749k7.f70571d;
                if (bVar != null) {
                    long j13 = bVarM73738d.f70585c > bVar.f70585c ? 1L : 0L;
                    bVarM73738d.f70593k = j13;
                    if (j13 == 1) {
                        j11 = bVarM73738d.f70586d;
                        j12 = bVar.f70586d;
                    } else {
                        j11 = bVarM73738d.f70584b;
                        j12 = bVar.f70584b;
                    }
                    bVarM73738d.f70594l = j11 - j12;
                }
                c33749k7.f70571d = bVarM73738d;
                synchronized (c33749k7.f70570c) {
                    try {
                        if (!C33749k7.this.f70570c.offer(bVarM73738d)) {
                            C33749k7.this.f70570c.poll();
                            C33749k7.this.f70570c.offer(bVarM73738d);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Logger.INSTANCE.exception(C33749k7.f70564e, th3);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k7$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b {

        /* JADX INFO: renamed from: n */
        public static final String f70573n = "count";

        /* JADX INFO: renamed from: o */
        public static final String f70574o = "time";

        /* JADX INFO: renamed from: p */
        public static final String f70575p = "block_gc_count";

        /* JADX INFO: renamed from: q */
        public static final String f70576q = "block_gc_time";

        /* JADX INFO: renamed from: r */
        public static final String f70577r = "alloc_size";

        /* JADX INFO: renamed from: s */
        public static final String f70578s = "free_size";

        /* JADX INFO: renamed from: t */
        public static final String f70579t = "histogram";

        /* JADX INFO: renamed from: u */
        public static final String f70580u = "block_histogram";

        /* JADX INFO: renamed from: v */
        public static final String f70581v = "gc_time_stamp";

        /* JADX INFO: renamed from: w */
        public static final String f70582w = "heap_size";

        /* JADX INFO: renamed from: a */
        public long f70583a = -1;

        /* JADX INFO: renamed from: b */
        public long f70584b = -1;

        /* JADX INFO: renamed from: c */
        public long f70585c = -1;

        /* JADX INFO: renamed from: d */
        public long f70586d = -1;

        /* JADX INFO: renamed from: e */
        public long f70587e = -1;

        /* JADX INFO: renamed from: f */
        public long f70588f = -1;

        /* JADX INFO: renamed from: g */
        public String f70589g = "";

        /* JADX INFO: renamed from: h */
        public String f70590h = "";

        /* JADX INFO: renamed from: i */
        public long f70591i = -1;

        /* JADX INFO: renamed from: j */
        public long f70592j = -1;

        /* JADX INFO: renamed from: k */
        public long f70593k = 2;

        /* JADX INFO: renamed from: l */
        public long f70594l = -1;

        public b() {
        }

        /* JADX INFO: renamed from: a */
        public final boolean m73739a() {
            long j11 = this.f70583a;
            if (j11 < 0 || j11 < this.f70585c) {
                return false;
            }
            long j12 = this.f70584b;
            return j12 >= 0 && j12 >= this.f70586d;
        }

        /* JADX INFO: renamed from: b */
        public JSONObject m73740b() {
            if (!m73739a()) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("count", this.f70583a);
                jSONObject.put("time", this.f70584b);
                jSONObject.put(f70575p, this.f70585c);
                jSONObject.put(f70576q, this.f70586d);
                jSONObject.put(f70577r, this.f70587e / 1024);
                jSONObject.put(f70582w, this.f70592j / 1024);
                jSONObject.put(f70578s, this.f70588f / 1024);
                jSONObject.put(f70579t, this.f70589g);
                jSONObject.put(f70580u, this.f70590h);
                jSONObject.put(f70581v, this.f70591i);
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k7$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c {
        public c() {
        }

        public /* synthetic */ c(C33749k7 c33749k7, a aVar) {
            this();
        }

        public void finalize() throws Throwable {
            super.finalize();
            d.f70597a.m73737c();
            C33749k7.this.f70568a = new WeakReference<>(C33749k7.this.new c());
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k7$d */
    /* JADX INFO: compiled from: BUGLY */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final C33749k7 f70597a = new C33749k7();
    }

    public /* synthetic */ C33749k7(a aVar) {
        this();
    }

    public C33749k7() {
        this.f70568a = null;
        this.f70569b = new AtomicBoolean(false);
        this.f70570c = new LinkedBlockingDeque<>(100);
        this.f70571d = null;
    }

    /* JADX INFO: renamed from: b */
    public b m73736b() {
        return this.f70571d;
    }

    /* JADX INFO: renamed from: c */
    public void m73737c() {
        ThreadManager.runInMonitorThread(new a(), 0L);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX INFO: renamed from: d */
    public final b m73738d() {
        try {
            Map<String, String> runtimeStats = Debug.getRuntimeStats();
            b bVar = new b();
            bVar.f70591i = System.currentTimeMillis();
            bVar.f70592j = Runtime.getRuntime().totalMemory();
            for (Map.Entry<String, String> entry : runtimeStats.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                switch (key) {
                    case "art.gc.gc-count":
                        bVar.f70583a = Long.parseLong(value);
                        break;
                    case "art.gc.gc-time":
                        bVar.f70584b = Long.parseLong(value);
                        break;
                    case "art.gc.blocking-gc-count":
                        bVar.f70585c = Long.parseLong(value);
                        break;
                    case "art.gc.blocking-gc-time":
                        bVar.f70586d = Long.parseLong(value);
                        break;
                    case "art.gc.bytes-allocated":
                        bVar.f70587e = Long.parseLong(value);
                        break;
                    case "art.gc.bytes-freed":
                        bVar.f70588f = Long.parseLong(value);
                        break;
                    case "art.gc.gc-count-rate-histogram":
                        bVar.f70589g = value;
                        break;
                    case "art.gc.blocking-gc-count-rate-histogram":
                        bVar.f70590h = value;
                        break;
                    default:
                        Logger.INSTANCE.mo77132i(f70564e, key + " is not parsed, and it's value is " + value);
                        break;
                }
            }
            return bVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33749k7 m73729a() {
        return d.f70597a;
    }

    /* JADX INFO: renamed from: a */
    public void m73735a(String str) {
        try {
            Logger logger = Logger.INSTANCE;
            logger.mo77132i(f70564e, "try to start gc stat for " + str);
            if (this.f70569b.get()) {
                logger.mo77132i(f70564e, "sStartedStat is true");
                return;
            }
            if (!AndroidVersion.isOverM()) {
                logger.mo77132i(f70564e, "don't support gc stat below Android M");
                return;
            }
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33786m2.f70892t);
            if (!(abstractC34022xeM77083a instanceof C33786m2)) {
                logger.mo77132i(f70564e, "it is not CommonConfig");
                return;
            }
            if (!((C33786m2) abstractC34022xeM77083a).m74022e() && !EnumC33662g4.INSTANCE.f69954b) {
                logger.mo77132i(f70564e, "startGCStat fail for config");
                return;
            }
            logger.mo77132i(f70564e, "start gc stat success");
            this.f70569b.compareAndSet(false, true);
            this.f70568a = new WeakReference<>(new c());
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70564e, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m73734a(b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_block", bVar.f70593k);
            jSONObject.put("time", bVar.f70594l);
            jSONObject.put("size", (bVar.f70587e - bVar.f70588f) / 1024);
            jSONObject.put("max_size", bVar.f70592j / 1024);
            jSONObject.put("time_stamp", bVar.f70591i);
            return jSONObject;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70564e, th2);
            return new JSONObject();
        }
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m73733a(long j11, long j12) {
        JSONObject jSONObject;
        if (j11 <= j12 && !this.f70570c.isEmpty()) {
            synchronized (this.f70570c) {
                try {
                    try {
                        Iterator<b> itDescendingIterator = this.f70570c.descendingIterator();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        int i11 = 0;
                        while (itDescendingIterator.hasNext() && i11 < 10) {
                            b next = itDescendingIterator.next();
                            long j13 = next.f70591i;
                            if (j13 >= j11 && j13 <= j12) {
                                if (i11 == 0) {
                                    jSONObject2 = next.m73740b();
                                }
                                jSONArray.put(m73734a(next));
                                i11++;
                            }
                        }
                        jSONObject = new JSONObject();
                        if (i11 > 0) {
                            jSONObject.put("statistic", jSONObject2);
                            jSONObject.put(C33556b3.f68963J, jSONArray);
                        }
                    } catch (Throwable unused) {
                        return new JSONObject();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return jSONObject;
        }
        return new JSONObject();
    }
}
