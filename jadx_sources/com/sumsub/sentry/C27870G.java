package com.sumsub.sentry;

import com.sumsub.sns.BuildConfig;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p852kotlin.collections.CollectionsKt;

/* JADX INFO: renamed from: com.sumsub.sentry.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27870G implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C27864D f56917a;

    /* JADX INFO: renamed from: b */
    public final C27898U0 f56918b;

    /* JADX INFO: renamed from: c */
    public final C27989r0 f56919c;

    /* JADX INFO: renamed from: d */
    public final C27868F f56920d;

    public C27870G(C27864D c27864d) {
        C27898U0 c27898u0 = new C27898U0(new C27891Q0());
        C27989r0 c27989r0 = new C27989r0(new C27891Q0());
        C33048a c33048a = C33048a.f67464a;
        C27868F c27868f = new C27868F();
        this.f56917a = c27864d;
        this.f56918b = c27898u0;
        this.f56919c = c27989r0;
        this.f56920d = c27868f;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX INFO: renamed from: a */
    public final C27973n0 m68966a(C27973n0 c27973n0) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C27885N0 c27885n0;
        List<C27985q0> list;
        if (c27973n0.f57005f == null) {
            c27973n0.f57005f = "java";
        }
        C28015y c28015y = c27973n0.f57011l;
        if (c28015y != null) {
            c27973n0.f57101t = new C27904X0(CollectionsKt.toList(CollectionsKt.filterNotNull(this.f56919c.m69022a(c28015y))));
        }
        if (c27973n0.f57004e == null) {
            c27973n0.f57004e = BuildConfig.SENTRY_ENVIRONMENT;
        }
        C27864D c27864d = this.f56917a;
        boolean z11 = true;
        boolean z12 = false;
        if (c27864d != null && c27973n0.f57007h == null) {
            if (c27864d.f56908d < System.currentTimeMillis() && c27864d.f56909e.compareAndSet(false, true)) {
                c27864d.m68963c();
            }
            c27973n0.f57007h = c27864d.f56907c;
        }
        if (c27973n0.f57001b == null) {
            c27973n0.f57001b = new C27903X();
        }
        if (c27973n0.f57006g == null) {
            c27973n0.f57006g = new C27950h1(null, 15);
        }
        if (c27973n0.f57100s == null) {
            C27904X0 c27904x0 = c27973n0.f57101t;
            if (c27904x0 == null || (list = c27904x0.f56992a) == null) {
                arrayList = null;
            } else {
                arrayList = null;
                for (C27985q0 c27985q0 : list) {
                    if (c27985q0.f57123f != null && c27985q0.f57121d != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c27985q0.f57121d);
                    }
                }
            }
            C27898U0 c27898u0 = this.f56918b;
            c27898u0.getClass();
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            Thread threadCurrentThread = Thread.currentThread();
            if (allStackTraces.isEmpty()) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList();
                if (!allStackTraces.containsKey(threadCurrentThread)) {
                    allStackTraces.put(threadCurrentThread, threadCurrentThread.getStackTrace());
                }
                for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                    Thread key = entry.getKey();
                    StackTraceElement[] value = entry.getValue();
                    boolean z13 = (key == threadCurrentThread || (arrayList != null && arrayList.contains(Long.valueOf(key.getId())))) ? z11 : z12;
                    ArrayList arrayListM68979a = c27898u0.f56984a.m68979a(value);
                    String name = key.getName();
                    int priority = key.getPriority();
                    long id2 = key.getId();
                    boolean zIsDaemon = key.isDaemon();
                    String strName = key.getState().name();
                    if (arrayListM68979a == null) {
                        c27885n0 = null;
                    } else {
                        if (arrayListM68979a.isEmpty()) {
                            arrayListM68979a = null;
                        }
                        if (arrayListM68979a != null) {
                            c27885n0 = new C27885N0(arrayListM68979a, Boolean.TRUE);
                        } else {
                            c27885n0 = null;
                        }
                    }
                    arrayList2.add(new C27896T0(Long.valueOf(id2), Integer.valueOf(priority), name, strName, Boolean.valueOf(z13), Boolean.valueOf(zIsDaemon), c27885n0));
                    z11 = true;
                    z12 = false;
                }
            }
            if (arrayList2 != null) {
                c27973n0.f57100s = new C27904X0(arrayList2);
            }
        }
        Object objInvoke = this.f56920d.invoke();
        List list2 = (List) (((List) objInvoke).isEmpty() ? null : objInvoke);
        if (list2 != null) {
            Map linkedHashMap = c27973n0.f57010k;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                c27973n0.f57010k = linkedHashMap;
            }
            linkedHashMap.put("enabledFFs", list2);
        }
        String str = AbstractC27905Y.f56994b;
        if (str == null) {
            return c27973n0;
        }
        C27984q c27984q = new C27984q();
        c27984q.f57110b = "proguard";
        c27984q.f57109a = str;
        c27973n0.f57106y.f57131b.add(c27984q);
        return c27973n0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C27864D c27864d = this.f56917a;
        if (c27864d != null) {
            c27864d.f56910f.shutdown();
        }
    }
}
