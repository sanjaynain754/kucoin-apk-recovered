package com.tencent.bugly.proguard;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33995w7 extends EventListener {

    /* JADX INFO: renamed from: e */
    public static final String f72417e = "RMonitor_net_quality";

    /* JADX INFO: renamed from: f */
    public static final long f72418f = 30000;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33540a8 f72420b;

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<Call, C33603d8> f72419a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f72421c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final a f72422d = new a();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.w7$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final AtomicBoolean f72423b = new AtomicBoolean(false);

        public a() {
        }

        /* JADX INFO: renamed from: a */
        public void m75358a() {
            if (this.f72423b.compareAndSet(false, true)) {
                C33734jd c33734jdM75353b = C33995w7.this.m75353b();
                long j11 = c33734jdM75353b != null ? c33734jdM75353b.f70390p : 30000L;
                if (Logger.verbos) {
                    Logger.INSTANCE.mo77133v("RMonitor_net_quality", "startDelayCheck, delay: " + j11);
                }
                ThreadManager.runInMonitorThread(this, j11);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C33995w7.this.m75348a();
            } catch (Throwable th2) {
                Logger.INSTANCE.exception("RMonitor_net_quality", th2);
            }
            this.f72423b.compareAndSet(true, false);
            if (C33995w7.this.m75355c()) {
                return;
            }
            m75358a();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m75351a(IOException iOException, int i11) {
        if (i11 < 200 || i11 >= 300) {
            return false;
        }
        String message = iOException == null ? "" : iOException.getMessage();
        return "timeout".equals(message) || "deadline reached".equals(message) || TextUtils.isEmpty(message);
    }

    /* JADX INFO: renamed from: b */
    public C33603d8 m75352b(Call call) {
        C33603d8 c33603d8M72788b = null;
        if (call == null || !this.f72421c.get()) {
            return null;
        }
        try {
            C33734jd c33734jdM75353b = m75353b();
            if (this.f72419a.size() > (c33734jdM75353b != null ? c33734jdM75353b.f70393s : 5000)) {
                return null;
            }
            c33603d8M72788b = C33603d8.m72788b();
            this.f72419a.put(call, c33603d8M72788b);
            return c33603d8M72788b;
        } catch (Throwable unused) {
            return c33603d8M72788b;
        }
    }

    /* JADX INFO: renamed from: c */
    public C33603d8 m75354c(Call call) {
        if (call == null) {
            return null;
        }
        return this.f72419a.remove(call);
    }

    /* JADX INFO: renamed from: c */
    public boolean m75355c() {
        return this.f72419a.isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public void m75356d() {
        this.f72421c.compareAndSet(false, true);
    }

    /* JADX INFO: renamed from: e */
    public void m75357e() {
        if (this.f72421c.compareAndSet(true, false)) {
            m75350a(this.f72419a.keySet());
            this.f72419a.clear();
        }
    }

    public C33995w7(InterfaceC33540a8 interfaceC33540a8) {
        this.f72420b = interfaceC33540a8;
    }

    /* JADX INFO: renamed from: a */
    public void m75349a(@NonNull C33603d8 c33603d8) {
        InterfaceC33540a8 interfaceC33540a8 = this.f72420b;
        if (interfaceC33540a8 != null) {
            interfaceC33540a8.mo72320a(c33603d8.m72809e());
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_net_quality", "onCallFinished, data: " + c33603d8);
        }
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        C33603d8 c33603d8M75354c = m75354c(call);
        if (c33603d8M75354c == null) {
            return;
        }
        c33603d8M75354c.f69555u = call.isCanceled();
        c33603d8M75354c.m72793a("callEnd");
        c33603d8M75354c.m72794a("callEnd", (IOException) null);
        m75349a(c33603d8M75354c);
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        boolean z11;
        C33603d8 c33603d8M75354c = m75354c(call);
        if (c33603d8M75354c == null) {
            return;
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_net_quality", "callFailed, isCanceled: " + call.isCanceled() + ", " + iOException);
        }
        if (!call.isCanceled() && !m75351a(iOException, c33603d8M75354c.f69530H)) {
            z11 = false;
        } else {
            z11 = true;
        }
        c33603d8M75354c.f69555u = z11;
        if (z11) {
            c33603d8M75354c.m72793a("callEnd");
            c33603d8M75354c.m72794a("callEnd", iOException);
        } else {
            c33603d8M75354c.m72793a("callFailed");
            c33603d8M75354c.m72794a("callFailed", iOException);
        }
        m75349a(c33603d8M75354c);
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        C33603d8 c33603d8M75352b = m75352b(call);
        if (c33603d8M75352b == null) {
            return;
        }
        c33603d8M75352b.m72793a("callStart");
        c33603d8M75352b.m72796a("callStart", call.request());
        this.f72422d.m75358a();
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("connectEnd");
        c33603d8M75346a.m72799a(false, inetSocketAddress, protocol, null);
        c33603d8M75346a.m72795a("connectEnd", m75347a(inetSocketAddress));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, @Nullable Protocol protocol, IOException iOException) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("connectFailed");
        c33603d8M75346a.m72799a(true, inetSocketAddress, protocol, iOException);
        c33603d8M75346a.m72795a("connectFailed", m75347a(inetSocketAddress));
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("connectStart");
        c33603d8M75346a.m72795a("connectStart", m75347a(inetSocketAddress));
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("connectionAcquired");
        c33603d8M75346a.m72797a(connection);
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("dnsEnd");
        c33603d8M75346a.m72808d(str);
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("dnsStart");
        c33603d8M75346a.m72795a("dnsStart", str);
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j11) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("requestBodyEnd");
        c33603d8M75346a.m72792a(j11);
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("requestHeadersEnd");
        c33603d8M75346a.m72796a("requestHeadersEnd", request);
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j11) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("responseBodyEnd");
        c33603d8M75346a.m72804b(j11);
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("responseHeadersEnd");
        c33603d8M75346a.m72798a(response);
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("responseHeadersStart");
        c33603d8M75346a.m72806c();
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, @Nullable Handshake handshake) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("secureConnectEnd");
        c33603d8M75346a.m72807d();
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        C33603d8 c33603d8M75346a = m75346a(call);
        if (c33603d8M75346a == null) {
            return;
        }
        c33603d8M75346a.m72793a("secureConnectStart");
    }

    /* JADX INFO: renamed from: a */
    public void m75348a() {
        if (m75355c()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        for (Map.Entry<Call, C33603d8> entry : this.f72419a.entrySet()) {
            C33603d8 value = entry.getValue();
            Call key = entry.getKey();
            if (value != null && value.m72801a(jElapsedRealtime, m75353b())) {
                hashSet.add(key);
            }
        }
        if (Logger.verbos) {
            Logger.INSTANCE.mo77133v("RMonitor_net_quality", "checkCallEnd, count: " + hashSet.size());
        }
        m75350a(hashSet);
    }

    /* JADX INFO: renamed from: b */
    public C33734jd m75353b() {
        InterfaceC33540a8 interfaceC33540a8 = this.f72420b;
        C33734jd c33734jdMo72319a = interfaceC33540a8 != null ? interfaceC33540a8.mo72319a() : null;
        return c33734jdMo72319a == null ? new C33734jd() : c33734jdMo72319a;
    }

    /* JADX INFO: renamed from: a */
    public void m75350a(Set<Call> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        Iterator<Call> it = set.iterator();
        while (it.hasNext()) {
            C33603d8 c33603d8M75354c = m75354c(it.next());
            if (c33603d8M75354c != null) {
                c33603d8M75354c.m72794a("forceCallEnd", (IOException) null);
                m75349a(c33603d8M75354c);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C33603d8 m75346a(Call call) {
        if (call == null) {
            return null;
        }
        return this.f72419a.get(call);
    }

    /* JADX INFO: renamed from: a */
    public final String m75347a(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress != null) {
            try {
                InetAddress address = inetSocketAddress.getAddress();
                String hostAddress = address != null ? address.getHostAddress() : null;
                String hostString = inetSocketAddress.getHostString();
                if (!TextUtils.equals(hostAddress, hostString)) {
                    return hostString;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
