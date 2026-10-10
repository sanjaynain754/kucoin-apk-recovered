package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class RunnableC33925sh implements Runnable {

    /* JADX INFO: renamed from: u */
    public static final int f71987u = 0;

    /* JADX INFO: renamed from: v */
    public static final int f71988v = 1;

    /* JADX INFO: renamed from: w */
    public static final int f71989w = 2;

    /* JADX INFO: renamed from: x */
    public static final int f71990x = 30000;

    /* JADX INFO: renamed from: y */
    public static final int f71991y = 2;

    /* JADX INFO: renamed from: b */
    public int f71992b;

    /* JADX INFO: renamed from: c */
    public int f71993c;

    /* JADX INFO: renamed from: d */
    public final Context f71994d;

    /* JADX INFO: renamed from: e */
    public final int f71995e;

    /* JADX INFO: renamed from: f */
    public final byte[] f71996f;

    /* JADX INFO: renamed from: g */
    public final C33765l2 f71997g;

    /* JADX INFO: renamed from: h */
    public final C33863pg f71998h;

    /* JADX INFO: renamed from: i */
    public final C33903rf f71999i;

    /* JADX INFO: renamed from: j */
    public final C33905rh f72000j;

    /* JADX INFO: renamed from: k */
    public final int f72001k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC33885qh f72002l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC33885qh f72003m;

    /* JADX INFO: renamed from: n */
    public String f72004n;

    /* JADX INFO: renamed from: o */
    public final String f72005o;

    /* JADX INFO: renamed from: p */
    public final Map<String, String> f72006p;

    /* JADX INFO: renamed from: q */
    public int f72007q;

    /* JADX INFO: renamed from: r */
    public long f72008r;

    /* JADX INFO: renamed from: s */
    public long f72009s;

    /* JADX INFO: renamed from: t */
    public boolean f72010t;

    public RunnableC33925sh(Context context, int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, boolean z11, boolean z12) {
        this(context, i11, i12, bArr, str, str2, interfaceC33885qh, z11, 2, 30000, z12, null);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74989b(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            C34012x4.m75444f("[Upload] Headers is empty.", new Object[0]);
            return false;
        }
        if (!map.containsKey("status")) {
            C34012x4.m75444f("[Upload] Headers does not contain %s", "status");
            return false;
        }
        if (!map.containsKey("Bugly-Version")) {
            C34012x4.m75444f("[Upload] Headers does not contain %s", "Bugly-Version");
            return false;
        }
        String str = map.get("Bugly-Version");
        if (str.contains(C33947u.f72135s)) {
            C34012x4.m75434a("[Upload] Bugly version from headers is: %s", str);
            return true;
        }
        C34012x4.m75444f("[Upload] Bugly version is not valid: %s", str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m74993a() {
        if (C33765l2.m73827s().f70786z0) {
            return;
        }
        this.f72000j.m74882a(this.f72001k, System.currentTimeMillis());
        InterfaceC33885qh interfaceC33885qh = this.f72002l;
        if (interfaceC33885qh != null) {
            interfaceC33885qh.onUploadStart(this.f71995e);
        }
        InterfaceC33885qh interfaceC33885qh2 = this.f72003m;
        if (interfaceC33885qh2 != null) {
            interfaceC33885qh2.onUploadStart(this.f71995e);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f72007q = 0;
            this.f72008r = 0L;
            this.f72009s = 0L;
            String strM75001c = m75001c();
            if (strM75001c != null) {
                m74996a(null, false, 0, strM75001c);
                return;
            }
            byte[] bArrM72611b = C33571bi.m72611b(this.f71996f, 2);
            if (bArrM72611b == null) {
                m74996a(null, false, 0, "failed to zip request body");
                return;
            }
            Map<String, String> mapM75000b = m75000b();
            m74993a();
            String strM74988a = this.f72004n;
            StrategyBean strategyBeanM74582c = this.f71998h.m74582c();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= this.f71992b) {
                    m74996a(null, false, i12, "failed after many attempts");
                    return;
                }
                i12 = 1;
                if (i13 > 1) {
                    C34012x4.m75444f("[Upload] Failed to upload last time, wait and try(%d) again.", Integer.valueOf(i13));
                    C33571bi.m72615c(this.f71993c);
                    if (i13 == this.f71992b) {
                        C34012x4.m75444f("[Upload] Use the back-up url at the last time: %s", this.f72005o);
                        strM74988a = this.f72005o;
                    }
                }
                C34012x4.m75434a("[Upload] Send %d bytes", Integer.valueOf(bArrM72611b.length));
                strM74988a = m74988a(strM74988a);
                C34012x4.m75434a("[Upload] Upload to %s with cmd %d (pid=%d | tid=%d).", strM74988a, Integer.valueOf(this.f71995e), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                if (!m74999a(this.f71999i.m74866a(strM74988a, bArrM72611b, this, mapM75000b), this.f71999i.f71739b, strategyBeanM74582c)) {
                    return;
                } else {
                    i11 = i13;
                }
            }
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    public RunnableC33925sh(Context context, int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, boolean z11, int i13, int i14, boolean z12, Map<String, String> map) {
        this.f71992b = 2;
        this.f71993c = 30000;
        this.f72004n = null;
        this.f72007q = 0;
        this.f72008r = 0L;
        this.f72009s = 0L;
        this.f72010t = false;
        this.f71994d = context;
        this.f71997g = C33765l2.m73825a(context);
        this.f71996f = bArr;
        this.f71998h = C33863pg.m74576b();
        this.f71999i = C33903rf.m74861a(context);
        C33905rh c33905rhM74876d = C33905rh.m74876d();
        this.f72000j = c33905rhM74876d;
        this.f72001k = i11;
        this.f72004n = str;
        this.f72005o = str2;
        this.f72002l = interfaceC33885qh;
        this.f72003m = c33905rhM74876d.f71762c;
        this.f71995e = i12;
        if (i13 > 0) {
            this.f71992b = i13;
        }
        if (i14 > 0) {
            this.f71993c = i14;
        }
        this.f72010t = z12;
        this.f72006p = map;
    }

    /* JADX INFO: renamed from: c */
    public String m75001c() {
        C33863pg c33863pg;
        if (C33830o4.m74391a(this.f71994d) == null) {
            return "network is not available";
        }
        byte[] bArr = this.f71996f;
        if (bArr == null || bArr.length == 0) {
            return "request package is empty!";
        }
        if (this.f71994d == null || this.f71997g == null || (c33863pg = this.f71998h) == null || this.f71999i == null) {
            return "illegal access error";
        }
        if (c33863pg.m74582c() == null) {
            return "illegal local strategy";
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m74994a(int i11, String str) {
        C34012x4.m75437b("[Upload] Failed to upload(%d): %s", Integer.valueOf(i11), str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017  */
    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX INFO: renamed from: a */
    public void m74996a(C33983vf c33983vf, boolean z11, int i11, String str) {
        String strValueOf;
        String str2;
        int i12 = this.f71995e;
        if (i12 == 630) {
            strValueOf = "crash";
        } else if (i12 == 640) {
            strValueOf = "userinfo";
        } else if (i12 == 830) {
            strValueOf = "crash";
        } else if (i12 != 840) {
            strValueOf = String.valueOf(i12);
        } else {
            strValueOf = "userinfo";
        }
        if (z11) {
            C34012x4.m75442d("[Upload] Success: %s", strValueOf);
            str2 = str;
        } else {
            str2 = str;
            C34012x4.m75437b("[Upload] Failed to upload(%d) %s: %s", Integer.valueOf(i11), strValueOf, str2);
        }
        if (C33765l2.m73827s().f70786z0) {
            return;
        }
        if (this.f72008r + this.f72009s > 0) {
            this.f72000j.m74887a(this.f72000j.m74877a(this.f72010t) + this.f72008r + this.f72009s, this.f72010t);
        }
        InterfaceC33885qh interfaceC33885qh = this.f72002l;
        if (interfaceC33885qh != null) {
            interfaceC33885qh.mo74226a(this.f71995e, c33983vf, this.f72008r, this.f72009s, z11, str2, "userinfo", System.currentTimeMillis());
        }
        InterfaceC33885qh interfaceC33885qh2 = this.f72003m;
        if (interfaceC33885qh2 != null) {
            interfaceC33885qh2.mo74226a(this.f71995e, c33983vf, this.f72008r, this.f72009s, z11, str, "userinfo", System.currentTimeMillis());
        }
    }

    /* JADX INFO: renamed from: b */
    public Map<String, String> m75000b() {
        HashMap map = new HashMap(10);
        map.put("tls", "1");
        map.put(C33556b3.f69054i2, this.f71997g.m73872e());
        map.put(C33556b3.f69066l2, this.f71997g.f70743e);
        map.put(C33556b3.f69062k2, this.f71997g.f70714F);
        Map<String, String> map2 = this.f72006p;
        if (map2 != null) {
            map.putAll(map2);
        }
        map.put(C33556b3.f69058j2, Integer.toString(this.f71995e));
        map.put(C33556b3.f69050h2, Byte.toString((byte) 1));
        map.put(C33556b3.f69070m2, this.f71997g.f70755k);
        map.put(C33556b3.f69082p2, Long.toString(this.f71998h.m74582c().f68577m));
        return map;
    }

    /* JADX INFO: renamed from: a */
    public boolean m74998a(C33983vf c33983vf, C33765l2 c33765l2, C33863pg c33863pg) {
        if (c33983vf == null) {
            C34012x4.m75444f("resp == null!", new Object[0]);
            return false;
        }
        byte b11 = c33983vf.f72377q;
        if (b11 != 0) {
            C34012x4.m75437b("resp result error %d", Byte.valueOf(b11));
            return false;
        }
        try {
            if (!C33571bi.m72617c(c33983vf.f72383w) && !C33765l2.m73827s().m73899w().equals(c33983vf.f72383w)) {
                C33620e4.m72891a().m72912a(C33863pg.f71436f, "device", c33983vf.f72383w.getBytes("UTF-8"), (InterfaceC33599d4) null, true);
                c33765l2.m73887l(c33983vf.f72383w);
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
        c33765l2.f70775u = c33983vf.f72381u;
        int i11 = c33983vf.f72378r;
        if (i11 != 510) {
            return true;
        }
        byte[] bArr = c33983vf.f72379s;
        if (bArr == null) {
            C34012x4.m75437b("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(i11));
            return false;
        }
        C33569bg c33569bg = (C33569bg) C33962ue.m75180a(bArr, C33569bg.class);
        if (c33569bg == null) {
            C34012x4.m75437b("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(c33983vf.f72378r));
            return false;
        }
        c33863pg.m74581a(c33569bg);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Boolean, Boolean> m74992a(byte[] bArr, Map<String, String> map) {
        if (bArr == null) {
            m74994a(1, "Failed to upload for no response!");
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        C34012x4.m75434a("[Upload] Received %d bytes", Integer.valueOf(bArr.length));
        if (bArr.length == 0) {
            m74996a(null, false, 1, "response data from server is empty");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C34012x4.m75431a(LogState.DEBUG, "[Upload] HTTP headers from server: key = %s, value = %s", entry.getKey(), entry.getValue());
                }
            }
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Boolean bool2 = Boolean.TRUE;
        return new Pair<>(bool2, bool2);
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Boolean, Boolean> m74990a(Map<String, String> map) {
        int i11;
        if (!m74989b(map)) {
            C34012x4.m75434a("[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d).", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            m74994a(1, "[Upload] Failed to upload for no status header.");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    C34012x4.m75431a(LogState.DEBUG, String.format("[key]: %s, [value]: %s", entry.getKey(), entry.getValue()), new Object[0]);
                }
            }
            C34012x4.m75431a(LogState.DEBUG, "[Upload] Failed to upload for no status header.", new Object[0]);
            return new Pair<>(Boolean.FALSE, Boolean.TRUE);
        }
        try {
            i11 = Integer.parseInt(map.get("status"));
            try {
                C34012x4.m75434a("[Upload] Status from server is %d (pid=%d | tid=%d).", Integer.valueOf(i11), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                if (i11 != 0) {
                    m74996a(null, false, 1, C33986vi.m75326a("status of server is ", i11));
                    Boolean bool = Boolean.FALSE;
                    return new Pair<>(bool, bool);
                }
                Boolean bool2 = Boolean.TRUE;
                return new Pair<>(bool2, bool2);
            } catch (Throwable unused) {
                m74994a(1, "[Upload] Failed to upload for format of status header is invalid: " + Integer.toString(i11));
                return new Pair<>(Boolean.FALSE, Boolean.TRUE);
            }
        } catch (Throwable unused2) {
            i11 = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair<Boolean, Boolean> m74991a(byte[] bArr, StrategyBean strategyBean) {
        byte[] bArrM72598a = C33571bi.m72598a(bArr, 2);
        if (bArrM72598a != null) {
            bArr = bArrM72598a;
        }
        C33983vf c33983vfM75183a = C33962ue.m75183a(bArr, strategyBean, true);
        if (c33983vfM75183a == null) {
            m74996a(null, false, 1, "failed to decode response package");
            Boolean bool = Boolean.FALSE;
            return new Pair<>(bool, bool);
        }
        Integer numValueOf = Integer.valueOf(c33983vfM75183a.f72378r);
        byte[] bArr2 = c33983vfM75183a.f72379s;
        C34012x4.m75434a("[Upload] Response cmd is: %d, length of sBuffer is: %d", numValueOf, Integer.valueOf(bArr2 == null ? 0 : bArr2.length));
        if (!m74998a(c33983vfM75183a, this.f71997g, this.f71998h)) {
            m74996a(c33983vfM75183a, false, 2, "failed to process response package");
            Boolean bool2 = Boolean.FALSE;
            return new Pair<>(bool2, bool2);
        }
        m74996a(c33983vfM75183a, true, 2, "successfully uploaded");
        Boolean bool3 = Boolean.TRUE;
        return new Pair<>(bool3, bool3);
    }

    /* JADX INFO: renamed from: a */
    public boolean m74999a(byte[] bArr, Map<String, String> map, StrategyBean strategyBean) {
        Pair<Boolean, Boolean> pairM74992a = m74992a(bArr, map);
        if (!((Boolean) pairM74992a.first).booleanValue()) {
            return ((Boolean) pairM74992a.second).booleanValue();
        }
        Pair<Boolean, Boolean> pairM74990a = m74990a(map);
        if (!((Boolean) pairM74990a.first).booleanValue()) {
            return ((Boolean) pairM74990a.second).booleanValue();
        }
        Pair<Boolean, Boolean> pairM74991a = m74991a(bArr, strategyBean);
        if (((Boolean) pairM74991a.first).booleanValue()) {
            return false;
        }
        return ((Boolean) pairM74991a.second).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public void m74997a(String str, long j11, String str2) {
        this.f72007q++;
        this.f72008r += j11;
    }

    /* JADX INFO: renamed from: a */
    public void m74995a(long j11) {
        this.f72009s += j11;
    }

    /* JADX INFO: renamed from: a */
    public static String m74988a(String str) {
        if (C33571bi.m72617c(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", str, UUID.randomUUID().toString());
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
            return str;
        }
    }
}
