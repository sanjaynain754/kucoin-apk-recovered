package com.forter.mobile.fortersdk;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.p */
/* JADX INFO: loaded from: classes.dex */
public final class C6585p {

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f11029b;

    /* JADX INFO: renamed from: a */
    public C44699a f11028a = null;

    /* JADX INFO: renamed from: c */
    public final C6511aj f11030c = new C6511aj(new C6560k());

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f11031d = new AtomicInteger(0);

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.p$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6513as f11032b;

        public a(C6513as c6513as) {
            this.f11032b = c6513as;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C6585p.m12458a(C6585p.this, this.f11032b);
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.p$b */
    public class b implements InterfaceC6565l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C6513as f11034a;

        public b(C6513as c6513as) {
            this.f11034a = c6513as;
        }

        @Override // com.forter.mobile.fortersdk.InterfaceC6565l
        /* JADX INFO: renamed from: a */
        public final void mo12418a(HttpURLConnection httpURLConnection) {
            C6585p c6585p = C6585p.this;
            C6513as c6513as = this.f11034a;
            c6585p.m12462e();
            float fM98891q = c6585p.f11028a.m98891q();
            int iM98888n = c6585p.f11028a.m98888n();
            int i11 = c6513as.f10861a.get();
            float f11 = c6513as.f10862b;
            if (i11 == 0) {
                f11 = iM98888n;
            } else if (i11 > 0) {
                f11 += fM98891q * f11;
            }
            c6513as.f10862b = f11;
            httpURLConnection.setConnectTimeout(Math.round(f11));
            if (i11 > c6585p.f11028a.m98889o()) {
                AbstractC6524c3.m12209a();
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.p$c */
    /* JADX INFO: loaded from: classes45.dex */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C6513as f11036b;

        public c(C6513as c6513as) {
            this.f11036b = c6513as;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            C6585p.m12458a(C6585p.this, this.f11036b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12458a(C6585p c6585p, C6513as c6513as) throws Throwable {
        C6511aj.d aVar;
        BufferedWriter bufferedWriter;
        Throwable th2;
        C6511aj.d dVar = null;
        try {
            if (c6513as == null) {
                m12460d(null);
                return;
            }
            try {
                b bVar = c6585p.new b(c6513as);
                if (d.f11038a[c6513as.f10864d - 1] != 1) {
                    aVar = c6585p.f11030c.m12137a(c6513as.f10865e, c6513as.f10863c, bVar);
                } else {
                    C6511aj c6511aj = c6585p.f11030c;
                    String str = c6513as.f10865e;
                    Map<String, String> map = c6513as.f10863c;
                    HttpURLConnection httpURLConnectionM12407a = c6511aj.f10842a.m12407a(str);
                    C6560k.m12406b(httpURLConnectionM12407a, map);
                    httpURLConnectionM12407a.setRequestMethod("POST");
                    httpURLConnectionM12407a.setDoOutput(true);
                    C44699a c44699aM12197p = C6520c.m12182b().m12197p();
                    if (c44699aM12197p != null && c44699aM12197p.m98894t()) {
                        httpURLConnectionM12407a.setRequestProperty("Content-Encoding", "gzip");
                        httpURLConnectionM12407a.setChunkedStreamingMode(0);
                    }
                    bVar.mo12418a(httpURLConnectionM12407a);
                    aVar = new C6511aj.a(httpURLConnectionM12407a, TextUtils.equals("gzip", httpURLConnectionM12407a.getRequestProperty("Content-Encoding")) ? new GZIPOutputStream(httpURLConnectionM12407a.getOutputStream()) : httpURLConnectionM12407a.getOutputStream());
                }
                try {
                    try {
                        if (c6513as instanceof C6605t) {
                            C6605t c6605t = (C6605t) c6513as;
                            if (c6605t.f11058g != null) {
                                try {
                                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(aVar.f10848d, Charset.forName("UTF-8")));
                                    try {
                                        String str2 = c6605t.f11058g;
                                        bufferedWriter.write(str2);
                                        "BODY: ".concat(String.valueOf(str2));
                                        AbstractC6524c3.m12214f();
                                        try {
                                            bufferedWriter.close();
                                        } catch (IOException unused) {
                                        }
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        if (bufferedWriter != null) {
                                            try {
                                                bufferedWriter.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    bufferedWriter = null;
                                    th2 = th4;
                                }
                            }
                        }
                        m12459b(c6513as, new C6595r(aVar));
                        c6585p.f11031d.decrementAndGet();
                        Objects.toString(c6585p.f11031d);
                        AbstractC6524c3.m12216h();
                        m12460d(aVar);
                    } catch (Throwable th5) {
                        th = th5;
                        dVar = aVar;
                        m12460d(dVar);
                        throw th;
                    }
                } catch (C6511aj.b e11) {
                    C6511aj.d dVar2 = aVar;
                    e = e11;
                    dVar = dVar2;
                    AbstractC6524c3.m12214f();
                    c6585p.m12461c(c6513as, e);
                    m12460d(dVar);
                } catch (IOException e12) {
                    C6511aj.d dVar3 = aVar;
                    e = e12;
                    dVar = dVar3;
                    AbstractC6524c3.m12214f();
                    c6585p.m12461c(c6513as, e);
                    m12460d(dVar);
                }
            } catch (C6511aj.b e13) {
                e = e13;
            } catch (IOException e14) {
                e = e14;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.p$d */
    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11038a;

        static {
            int[] iArr = new int[C6513as.a.m12150a().length];
            f11038a = iArr;
            try {
                iArr[C6513as.a.f10868b - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11038a[C6513as.a.f10867a - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12459b(C6513as c6513as, C6595r c6595r) {
        InterfaceC6624w3 interfaceC6624w3 = c6513as.f10866f;
        if (interfaceC6624w3 != null) {
            interfaceC6624w3.mo12149a(c6513as, c6595r);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m12460d(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12461c(C6513as c6513as, IOException iOException) {
        C6595r c6595r;
        try {
            if (c6513as.f10861a.getAndIncrement() <= this.f11028a.m98889o()) {
                this.f11029b.schedule(new c(c6513as), 1000L, TimeUnit.MILLISECONDS);
                return;
            }
            if (iOException instanceof C6511aj.b) {
                C6511aj.b bVar = (C6511aj.b) iOException;
                c6595r = new C6595r(bVar.f10843a, bVar.f10845c);
            } else {
                c6595r = new C6595r(999, "IOException -> can not parse result");
            }
            m12459b(c6513as, c6595r);
            this.f11031d.decrementAndGet();
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            this.f11031d.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m12463f(C6513as c6513as) {
        try {
            this.f11031d.incrementAndGet();
            this.f11029b.submit(new a(c6513as));
            return true;
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            return false;
        }
    }

    public C6585p() {
        int iM98887m;
        if (m12462e() && this.f11028a.m98887m() > 0) {
            iM98887m = this.f11028a.m98887m();
        } else {
            iM98887m = 1;
        }
        this.f11029b = Executors.newScheduledThreadPool(iM98887m);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12462e() {
        C44699a c44699aM12197p = C6520c.m12182b().m12197p();
        this.f11028a = c44699aM12197p;
        if (c44699aM12197p != null) {
            return true;
        }
        return false;
    }
}
