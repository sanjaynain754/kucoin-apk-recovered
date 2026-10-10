package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.os.Debug;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.plugin.listener.ListenerManager;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import com.tencent.rmonitor.custom.C35153a;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ac */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class HandlerC33544ac extends Handler {

    /* JADX INFO: renamed from: A */
    public static final int f68826A = 1024;

    /* JADX INFO: renamed from: B */
    public static final int f68827B = 5;

    /* JADX INFO: renamed from: C */
    public static HandlerC33544ac f68828C = null;

    /* JADX INFO: renamed from: D */
    public static final int f68829D = 10000;

    /* JADX INFO: renamed from: E */
    public static final int f68830E = 30000;

    /* JADX INFO: renamed from: F */
    public static int f68831F = 0;

    /* JADX INFO: renamed from: G */
    public static final long f68832G = 300000;

    /* JADX INFO: renamed from: t */
    public static final String f68833t = "RMonitor_MemoryQuantile";

    /* JADX INFO: renamed from: u */
    public static final int f68834u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f68835v = 2;

    /* JADX INFO: renamed from: w */
    public static SharedPreferences f68836w;

    /* JADX INFO: renamed from: x */
    public static SharedPreferences.Editor f68837x;

    /* JADX INFO: renamed from: y */
    public static final String f68838y;

    /* JADX INFO: renamed from: z */
    public static final String f68839z;

    /* JADX INFO: renamed from: a */
    public int f68840a;

    /* JADX INFO: renamed from: b */
    public final C33809n4 f68841b;

    /* JADX INFO: renamed from: c */
    public long f68842c;

    /* JADX INFO: renamed from: d */
    public long f68843d;

    /* JADX INFO: renamed from: e */
    public long f68844e;

    /* JADX INFO: renamed from: f */
    public long f68845f;

    /* JADX INFO: renamed from: g */
    public long f68846g;

    /* JADX INFO: renamed from: h */
    public long f68847h;

    /* JADX INFO: renamed from: i */
    public String f68848i;

    /* JADX INFO: renamed from: j */
    public final C33691hc f68849j;

    /* JADX INFO: renamed from: k */
    public final C33691hc f68850k;

    /* JADX INFO: renamed from: l */
    public long f68851l;

    /* JADX INFO: renamed from: m */
    public LinkedList<a> f68852m;

    /* JADX INFO: renamed from: n */
    public LinkedList<a> f68853n;

    /* JADX INFO: renamed from: o */
    public LinkedList<a> f68854o;

    /* JADX INFO: renamed from: p */
    public LinkedList<InterfaceC33667g9> f68855p;

    /* JADX INFO: renamed from: q */
    public LinkedList<InterfaceC33688h9> f68856q;

    /* JADX INFO: renamed from: r */
    public LinkedList<InterfaceC33646f9> f68857r;

    /* JADX INFO: renamed from: s */
    public boolean f68858s;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ac$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a {

        /* JADX INFO: renamed from: a */
        public Long f68859a;

        /* JADX INFO: renamed from: b */
        public Long f68860b;

        public a(Long l11, Long l12) {
            this.f68859a = l11;
            this.f68860b = l12;
        }

        public String toString() {
            return this.f68859a + " : " + this.f68860b;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72332a(InterfaceC33667g9 interfaceC33667g9) {
        if (m72338b() && !this.f68855p.contains(interfaceC33667g9)) {
            this.f68855p.addLast(interfaceC33667g9);
            m72354r();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m72338b() {
        try {
            if (f68836w == null || f68837x == null) {
                BaseInfo.initSp();
                SharedPreferences sharedPreferences = BaseInfo.sharePreference;
                f68836w = sharedPreferences;
                f68837x = sharedPreferences.edit();
            }
        } catch (Throwable unused) {
            f68836w = null;
            f68837x = null;
        }
        return (f68836w == null || f68837x == null) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public C33691hc m72339c() {
        return new C33691hc(this.f68849j);
    }

    /* JADX INFO: renamed from: r */
    public final void m72354r() {
        synchronized (this) {
            try {
                if (!this.f68858s) {
                    m72337b(true);
                    sendEmptyMessage(1);
                    this.f68858s = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m72355s() {
        this.f68842c = m72328a(false) * 1024;
        this.f68843d = m72352p() * 1024;
        this.f68844e = Runtime.getRuntime().totalMemory();
        long jFreeMemory = Runtime.getRuntime().freeMemory();
        this.f68845f = jFreeMemory;
        m72330a(this.f68842c, this.f68843d, this.f68844e - jFreeMemory);
        m72336b(this.f68842c, this.f68843d, this.f68844e - this.f68845f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        r0 = "main";
     */
    static {
        String strSubstring;
        try {
            String strObtainProcessName = AppInfo.obtainProcessName(BaseInfo.app);
            String strM73976a = C33774lb.m73976a(strObtainProcessName.getBytes());
            if (strM73976a != null) {
                strSubstring = strM73976a.substring(10, 20);
            } else {
                strSubstring = strObtainProcessName.contains(C33844oi.f71346o) ? strObtainProcessName.substring(strObtainProcessName.lastIndexOf(C33844oi.f71346o) + 1) : "main";
            }
        } catch (Throwable th2) {
            C34059zb.m75592a(C34059zb.f72628c, th2.toString());
        }
        f68838y = strSubstring;
        f68839z = C33770l7.m73937a("last_mem_valid_", strSubstring);
        f68831F = TXVodDownloadDataSource.QUALITY_360P;
    }

    /* JADX INFO: renamed from: l */
    public static HandlerC33544ac m72327l() {
        if (f68828C == null) {
            synchronized (HandlerC33544ac.class) {
                try {
                    if (f68828C == null) {
                        f68828C = new HandlerC33544ac();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68828C;
    }

    /* JADX INFO: renamed from: c */
    public void m72340c(long j11) {
        Iterator<InterfaceC33688h9> it = this.f68856q.iterator();
        while (it.hasNext()) {
            it.next().mo73256a(j11);
        }
    }

    /* JADX INFO: renamed from: d */
    public long m72341d() {
        return this.f68845f;
    }

    /* JADX INFO: renamed from: e */
    public long m72342e() {
        return this.f68846g;
    }

    /* JADX INFO: renamed from: f */
    public long m72343f() {
        return this.f68842c;
    }

    /* JADX INFO: renamed from: g */
    public long m72344g() {
        return this.f68844e;
    }

    /* JADX INFO: renamed from: h */
    public long m72345h() {
        return this.f68843d;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            m72353q();
        } else {
            if (i11 != 2) {
                return;
            }
            m72355s();
            sendEmptyMessageDelayed(2, this.f68841b.m74229a());
        }
    }

    /* JADX INFO: renamed from: i */
    public LinkedList<a> m72346i() {
        return this.f68854o;
    }

    /* JADX INFO: renamed from: j */
    public LinkedList<a> m72347j() {
        return this.f68852m;
    }

    /* JADX INFO: renamed from: k */
    public LinkedList<a> m72348k() {
        return this.f68853n;
    }

    /* JADX INFO: renamed from: m */
    public boolean m72349m() {
        SharedPreferences sharedPreferences = f68836w;
        if (sharedPreferences != null) {
            return sharedPreferences.getBoolean(f68839z, false);
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public C33691hc m72350n() {
        return new C33691hc(this.f68850k);
    }

    /* JADX INFO: renamed from: o */
    public final String m72351o() {
        C35153a c35153aM75338a = C33991w3.m75338a();
        long jM77154d = c35153aM75338a.m77154d();
        if (jM77154d != this.f68847h) {
            try {
                JSONObject jSONObjectM77159g = c35153aM75338a.m77159g();
                if (jSONObjectM77159g != null) {
                    this.f68848i = jSONObjectM77159g.toString();
                }
            } catch (Throwable th2) {
                Logger.INSTANCE.exception("RMonitor_MemoryQuantile", "getUserCustom", th2);
            }
            this.f68847h = jM77154d;
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_MemoryQuantile", "getUserCustom, seq: " + this.f68847h + ", userCustom: " + this.f68848i);
            }
        }
        return this.f68848i;
    }

    /* JADX INFO: renamed from: p */
    public final long m72352p() {
        Throwable th2;
        BufferedReader bufferedReader;
        long j11 = 0;
        String line = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/self/status"));
            try {
                line = bufferedReader.readLine();
                while (line != null) {
                    if (line.startsWith("VmSize")) {
                        long j12 = Long.parseLong(Pattern.compile("[^0-9]").matcher(line).replaceAll("").trim());
                        this.f68840a = 0;
                        j11 = j12;
                        break;
                    }
                    line = bufferedReader.readLine();
                }
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
            } catch (Throwable th4) {
                th2 = th4;
                try {
                    int i11 = this.f68840a + 1;
                    this.f68840a = i11;
                    if (i11 > 5) {
                        C34059zb.m75592a(C34059zb.f72627b, line);
                        removeMessages(2);
                    }
                    Logger.INSTANCE.mo77131e("RMonitor_MemoryQuantile", th2.toString());
                } finally {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            th2 = th6;
            bufferedReader = null;
        }
        return j11;
    }

    /* JADX INFO: renamed from: q */
    public final void m72353q() {
        this.f68841b.m74230b();
        sendEmptyMessage(2);
    }

    public HandlerC33544ac() {
        super(ThreadManager.getMonitorThreadLooper());
        this.f68840a = 0;
        this.f68841b = new C33809n4(10000L, 10000L, 30000L);
        this.f68847h = 0L;
        this.f68848i = "";
        String str = f68838y;
        C33691hc c33691hc = new C33691hc(str);
        this.f68849j = c33691hc;
        C33691hc c33691hc2 = new C33691hc(str);
        this.f68850k = c33691hc2;
        this.f68851l = -1L;
        this.f68852m = new LinkedList<>();
        this.f68853n = new LinkedList<>();
        this.f68854o = new LinkedList<>();
        this.f68855p = new LinkedList<>();
        this.f68856q = new LinkedList<>();
        this.f68857r = new LinkedList<>();
        this.f68858s = false;
        SharedPreferences sharedPreferences = BaseInfo.sharePreference;
        f68836w = sharedPreferences;
        if (sharedPreferences != null) {
            f68837x = sharedPreferences.edit();
            c33691hc2.m73264a(f68836w);
            this.f68844e = Runtime.getRuntime().totalMemory();
            this.f68845f = Runtime.getRuntime().freeMemory();
            this.f68846g = Runtime.getRuntime().maxMemory();
            long jM72328a = m72328a(false) * 1024;
            this.f68842c = jM72328a;
            long jM72352p = m72352p() * 1024;
            this.f68843d = jM72352p;
            c33691hc.m73261a(jM72328a, jM72352p, this.f68844e - this.f68845f, C33657g.m73094e(), m72351o());
            c33691hc.m73262a(f68837x);
            m72354r();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72333a(InterfaceC33688h9 interfaceC33688h9) {
        if (m72338b() && !this.f68856q.contains(interfaceC33688h9)) {
            this.f68856q.addLast(interfaceC33688h9);
            m72354r();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72335b(long j11) {
        Iterator<InterfaceC33667g9> it = this.f68855p.iterator();
        while (it.hasNext()) {
            it.next().mo73167c(j11);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72331a(InterfaceC33646f9 interfaceC33646f9) {
        if (m72338b() && !this.f68857r.contains(interfaceC33646f9)) {
            this.f68857r.addLast(interfaceC33646f9);
            m72354r();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m72337b(boolean z11) {
        SharedPreferences.Editor editor;
        if (f68836w == null || (editor = f68837x) == null) {
            return;
        }
        editor.putBoolean(f68839z, z11);
        f68837x.commit();
    }

    /* JADX INFO: renamed from: a */
    public void m72329a(long j11) {
        Iterator<InterfaceC33646f9> it = this.f68857r.iterator();
        while (it.hasNext()) {
            it.next().m73018b(j11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72336b(long j11, long j12, long j13) {
        C33649fc c33649fcM73269e = this.f68849j.m73269e();
        long jM73053c = c33649fcM73269e.m73053c();
        boolean z11 = j11 > jM73053c;
        boolean z12 = j12 > c33649fcM73269e.m73055e();
        boolean z13 = j13 > c33649fcM73269e.m73046a();
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_MemoryQuantile", "current's pss = " + j11 + ", max_pss = " + jM73053c);
        }
        if (this.f68841b.m74229a() == 10000) {
            this.f68849j.m73266b().m73049a(f68837x, j11, j12, j13);
        } else {
            this.f68849j.m73259a().m73049a(f68837x, j11, j12, j13);
        }
        this.f68849j.m73269e().m73049a(f68837x, j11, j12, j13);
        if (z11 || z12 || z13) {
            this.f68849j.m73263a(f68837x, C33657g.m73094e(), m72351o(), z13, z11, z12);
        }
        f68837x.commit();
        m72335b(j11);
        m72340c(j12);
        m72329a(j13);
        for (T t11 : ListenerManager.memoryPeakListener.getListenerList()) {
            if (z11) {
                t11.m73401c(j11);
            }
            if (z12) {
                t11.m73399a(j12);
            }
            if (z13) {
                t11.m73400b(j13);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public long m72328a(boolean z11) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f68851l <= 300000 && !z11) {
                return Debug.getPss();
            }
            this.f68851l = jCurrentTimeMillis;
            if (Logger.verbos) {
                Logger.INSTANCE.mo77133v("RMonitor_MemoryQuantile", "get pss info from ActivityManager");
            }
            ActivityManager activityManager = (ActivityManager) C33598d3.m72772c().getSystemService("activity");
            if (activityManager != null) {
                return activityManager.getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss();
            }
            return 0L;
        } catch (Throwable unused) {
            return Debug.getPss();
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m72334a() {
        return this.f68852m.size() == this.f68853n.size() && this.f68852m.size() == this.f68854o.size();
    }

    /* JADX INFO: renamed from: a */
    public final void m72330a(long j11, long j12, long j13) {
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        a aVar = new a(lValueOf, Long.valueOf(j11));
        a aVar2 = new a(lValueOf, Long.valueOf(j12));
        a aVar3 = new a(lValueOf, Long.valueOf(j13));
        this.f68852m.addFirst(aVar);
        this.f68853n.addFirst(aVar2);
        this.f68854o.addFirst(aVar3);
        if (!m72334a()) {
            this.f68852m.clear();
            this.f68853n.clear();
            this.f68854o.clear();
        } else {
            while (this.f68852m.size() > f68831F) {
                this.f68852m.removeLast();
                this.f68853n.removeLast();
                this.f68854o.removeLast();
            }
        }
    }
}
