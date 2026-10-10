package com.kubi.utils.netdiagno;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import w70.C45749b;
import w70.InterfaceC45748a;

/* JADX INFO: renamed from: com.kubi.utils.netdiagno.a */
/* JADX INFO: compiled from: LDNetDiagnoService.java */
/* JADX INFO: loaded from: classes54.dex */
public class C27075a extends LDNetAsyncTaskEx<String, String, String> implements C27076b.a, LDNetTraceRoute.InterfaceC27072a, LDNetSocket.InterfaceC27071a {

    /* JADX INFO: renamed from: C */
    public static final BlockingQueue<Runnable> f54379C = new LinkedBlockingQueue(2);

    /* JADX INFO: renamed from: D */
    public static final ThreadFactory f54380D = new a();

    /* JADX INFO: renamed from: E */
    public static ThreadPoolExecutor f54381E = null;

    /* JADX INFO: renamed from: A */
    public TelephonyManager f54382A;

    /* JADX INFO: renamed from: B */
    public volatile boolean f54383B;

    /* JADX INFO: renamed from: e */
    public String f54384e;

    /* JADX INFO: renamed from: f */
    public String f54385f;

    /* JADX INFO: renamed from: g */
    public String f54386g;

    /* JADX INFO: renamed from: h */
    public boolean f54387h;

    /* JADX INFO: renamed from: i */
    public boolean f54388i;

    /* JADX INFO: renamed from: j */
    public boolean f54389j;

    /* JADX INFO: renamed from: k */
    public Context f54390k;

    /* JADX INFO: renamed from: l */
    public String f54391l;

    /* JADX INFO: renamed from: m */
    public String f54392m;

    /* JADX INFO: renamed from: n */
    public String f54393n;

    /* JADX INFO: renamed from: o */
    public String f54394o;

    /* JADX INFO: renamed from: p */
    public String f54395p;

    /* JADX INFO: renamed from: q */
    public InetAddress[] f54396q;

    /* JADX INFO: renamed from: t */
    public LDNetSocket f54399t;

    /* JADX INFO: renamed from: u */
    public C27076b f54400u;

    /* JADX INFO: renamed from: v */
    public LDNetTraceRoute f54401v;

    /* JADX INFO: renamed from: x */
    public InterfaceC45748a f54403x;

    /* JADX INFO: renamed from: s */
    public final StringBuilder f54398s = new StringBuilder(256);

    /* JADX INFO: renamed from: y */
    public boolean f54404y = false;

    /* JADX INFO: renamed from: z */
    public boolean f54405z = true;

    /* JADX INFO: renamed from: w */
    public boolean f54402w = false;

    /* JADX INFO: renamed from: r */
    public List<String> f54397r = new ArrayList();

    /* JADX INFO: renamed from: com.kubi.utils.netdiagno.a$a */
    /* JADX INFO: compiled from: LDNetDiagnoService.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: b */
        public final AtomicInteger f54406b = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Trace #" + this.f54406b.getAndIncrement());
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m66812u(String str) throws Throwable {
        Map<String, Object> mapM100990a = C45749b.m100990a(str);
        String str2 = (String) mapM100990a.get("useTime");
        this.f54396q = (InetAddress[]) mapM100990a.get("remoteInet");
        String str3 = Integer.parseInt(str2) > 5000 ? " (" + (Integer.parseInt(str2) / 1000) + "s)" : " (" + str2 + "ms)";
        InetAddress[] inetAddressArr = this.f54396q;
        String str4 = "";
        if (inetAddressArr != null) {
            int length = inetAddressArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                this.f54397r.add(this.f54396q[i11].getHostAddress());
                str4 = str4 + this.f54396q[i11].getHostAddress() + ",";
            }
            m66815x("DNS解析结果:\t" + str4.substring(0, str4.length() - 1) + str3);
            return true;
        }
        if (Integer.parseInt(str2) <= 10000) {
            m66815x("DNS解析结果:\t解析失败" + str3);
            return false;
        }
        Map<String, Object> mapM100990a2 = C45749b.m100990a(str);
        String str5 = (String) mapM100990a2.get("useTime");
        this.f54396q = (InetAddress[]) mapM100990a2.get("remoteInet");
        String str6 = Integer.parseInt(str5) > 5000 ? " (" + (Integer.parseInt(str5) / 1000) + "s)" : " (" + str5 + "ms)";
        InetAddress[] inetAddressArr2 = this.f54396q;
        if (inetAddressArr2 == null) {
            m66815x("DNS解析结果:\t解析失败" + str6);
            return false;
        }
        int length2 = inetAddressArr2.length;
        for (int i12 = 0; i12 < length2; i12++) {
            this.f54397r.add(this.f54396q[i12].getHostAddress());
            str4 = str4 + this.f54396q[i12].getHostAddress() + ",";
        }
        m66815x("DNS解析结果:\t" + str4.substring(0, str4.length() - 1) + str6);
        return true;
    }

    @Override // com.kubi.utils.netdiagno.LDNetSocket.InterfaceC27071a
    /* JADX INFO: renamed from: c */
    public void mo66794c(String str) {
        this.f54398s.append(str);
        m66785q(str);
    }

    @Override // com.kubi.utils.netdiagno.LDNetSocket.InterfaceC27071a
    /* JADX INFO: renamed from: d */
    public void mo66795d(String str) {
        this.f54398s.append(str);
        m66785q(str);
    }

    @Override // com.kubi.utils.netdiagno.LDNetTraceRoute.InterfaceC27072a
    /* JADX INFO: renamed from: e */
    public void mo66803e(String str) {
        if (str == null) {
            return;
        }
        LDNetTraceRoute lDNetTraceRoute = this.f54401v;
        if (lDNetTraceRoute == null || !lDNetTraceRoute.f54373c) {
            m66815x(str);
            return;
        }
        if (str.contains("ms") || str.contains("***")) {
            str = str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
        }
        this.f54398s.append(str);
        m66785q(str);
    }

    @Override // com.kubi.utils.netdiagno.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: k */
    public ThreadPoolExecutor mo66779k() {
        return f54381E;
    }

    /* JADX INFO: renamed from: w */
    public final void m66814w() {
        if (C45749b.m100995f(this.f54390k).booleanValue()) {
            this.f54387h = true;
            m66815x("当前是否联网:\t已联网");
        } else {
            this.f54387h = false;
            m66815x("当前是否联网:\t未联网");
        }
        this.f54391l = C45749b.m100994e(this.f54390k);
        m66815x("当前联网类型:\t" + this.f54391l);
        if (this.f54387h) {
            if ("WIFI".equals(this.f54391l)) {
                this.f54392m = C45749b.m100993d(this.f54390k);
                this.f54393n = C45749b.m100998i(this.f54390k);
            } else {
                this.f54392m = C45749b.m100992c();
            }
            m66815x("本地IP:\t" + this.f54392m);
        } else {
            m66815x("本地IP:\t127.0.0.1");
        }
        if (this.f54393n != null) {
            m66815x("本地网关:\t" + this.f54393n);
        }
        if (this.f54387h) {
            this.f54394o = C45749b.m100991b("dns1");
            this.f54395p = C45749b.m100991b("dns2");
            m66815x("本地DNS:\t" + this.f54394o + "," + this.f54395p);
        } else {
            m66815x("本地DNS:\t0.0.0.0,0.0.0.0");
        }
        if (this.f54387h) {
            this.f54388i = m66812u(this.f54385f);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m66815x(String str) {
        this.f54398s.append(str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        m66785q(str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
    }

    /* JADX INFO: renamed from: y */
    public String m66816y() throws Throwable {
        if (TextUtils.isEmpty(this.f54385f)) {
            return "";
        }
        this.f54402w = true;
        this.f54398s.setLength(0);
        m66815x("******网络诊断开始******");
        m66813v();
        m66814w();
        if (!this.f54387h) {
            m66815x("\n\n当前主机未联网,请检查网络！");
            return this.f54398s.toString();
        }
        m66815x("\n开始TCP连接测试...");
        LDNetSocket lDNetSocketM66787e = LDNetSocket.m66787e();
        this.f54399t = lDNetSocketM66787e;
        lDNetSocketM66787e.f54365c = this.f54396q;
        lDNetSocketM66787e.f54366d = this.f54397r;
        lDNetSocketM66787e.m66792f(this);
        LDNetSocket lDNetSocket = this.f54399t;
        lDNetSocket.f54369g = this.f54404y;
        this.f54389j = lDNetSocket.m66788a(this.f54385f);
        m66815x("\n开始ping...");
        this.f54400u = new C27076b(this, 4);
        m66815x("ping本机IP..." + this.f54392m);
        this.f54400u.m66818a(this.f54392m, false);
        m66815x("ping本地网关..." + this.f54393n);
        this.f54400u.m66818a(this.f54393n, false);
        m66815x("ping本地DNS1..." + this.f54394o);
        this.f54400u.m66818a(this.f54394o, false);
        m66815x("ping本地DNS2..." + this.f54395p);
        this.f54400u.m66818a(this.f54395p, false);
        m66815x("\n开始traceroute...");
        LDNetTraceRoute lDNetTraceRouteM66796c = LDNetTraceRoute.m66796c();
        this.f54401v = lDNetTraceRouteM66796c;
        lDNetTraceRouteM66796c.m66799d(this);
        LDNetTraceRoute lDNetTraceRoute = this.f54401v;
        lDNetTraceRoute.f54373c = this.f54405z;
        lDNetTraceRoute.m66801f(this.f54385f);
        return this.f54398s.toString();
    }

    /* JADX INFO: renamed from: z */
    public void m66817z() {
        if (this.f54402w) {
            LDNetSocket lDNetSocket = this.f54399t;
            if (lDNetSocket != null) {
                lDNetSocket.m66793g();
                this.f54399t = null;
            }
            if (this.f54400u != null) {
                this.f54400u = null;
            }
            LDNetTraceRoute lDNetTraceRoute = this.f54401v;
            if (lDNetTraceRoute != null) {
                lDNetTraceRoute.m66800e();
                this.f54401v = null;
            }
            m66775g(true);
            ThreadPoolExecutor threadPoolExecutor = f54381E;
            if (threadPoolExecutor != null && !threadPoolExecutor.isShutdown()) {
                f54381E.shutdown();
                f54381E = null;
            }
            this.f54402w = false;
        }
    }

    public C27075a(Context context, String str, String str2, String str3, InterfaceC45748a interfaceC45748a) {
        this.f54382A = null;
        this.f54390k = context;
        this.f54384e = str;
        this.f54385f = str2;
        this.f54386g = str3;
        this.f54403x = interfaceC45748a;
        this.f54382A = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        f54381E = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, f54379C, f54380D);
    }

    @Override // com.kubi.utils.netdiagno.C27076b.a
    /* JADX INFO: renamed from: a */
    public void mo66808a(String str) {
        m66815x(str);
    }

    @Override // com.kubi.utils.netdiagno.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: m */
    public void mo66781m() {
        m66817z();
    }

    @Override // com.kubi.utils.netdiagno.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public String mo66776h(String... strArr) {
        if (m66780l()) {
            return null;
        }
        try {
            return m66816y();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    @Override // com.kubi.utils.netdiagno.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo66782n(String str) {
        if (!m66780l()) {
            super.mo66782n(str);
            if (!this.f54383B) {
                this.f54383B = true;
                m66815x("\n******网络诊断结束******\n");
            }
            m66817z();
            InterfaceC45748a interfaceC45748a = this.f54403x;
            if (interfaceC45748a != null) {
                interfaceC45748a.mo42175k(this.f54398s.toString());
            }
        }
    }

    @Override // com.kubi.utils.netdiagno.LDNetAsyncTaskEx
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo66784p(String... strArr) {
        if (!m66780l()) {
            super.mo66784p(strArr);
            InterfaceC45748a interfaceC45748a = this.f54403x;
            if (interfaceC45748a != null) {
                interfaceC45748a.mo42176o(strArr[0]);
            }
        }
    }

    @Override // com.kubi.utils.netdiagno.LDNetTraceRoute.InterfaceC27072a
    /* JADX INFO: renamed from: b */
    public void mo66802b() {
    }

    /* JADX INFO: renamed from: v */
    public final void m66813v() {
    }
}
