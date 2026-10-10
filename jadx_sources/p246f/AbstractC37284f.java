package p246f;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import android.os.Looper;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import p277g.C37738d;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40832g;
import p387k.C40833h;
import p442m.AbstractC42333c;

/* JADX INFO: renamed from: f.f */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC37284f extends AbstractC37293o {

    /* JADX INFO: renamed from: i */
    public static boolean f82665i;

    /* JADX INFO: renamed from: g */
    public AbstractC42333c f82666g;

    /* JADX INFO: renamed from: h */
    public ScheduledExecutorService f82667h;

    /* JADX INFO: renamed from: f.f$a */
    public class a extends AbstractC42333c {
        public a() {
        }

        @Override // p442m.AbstractC42333c
        /* JADX INFO: renamed from: d */
        public void mo83483d(String str) {
            try {
                if (!AbstractC37284f.f82665i) {
                    boolean unused = AbstractC37284f.f82665i = true;
                    AbstractC37284f abstractC37284f = AbstractC37284f.this;
                    abstractC37284f.m83466F(str, abstractC37284f.mo83477k());
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public static File m83452B(String str, byte[] bArr, Context context) {
        if (bArr == null) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.toLowerCase(Locale.ENGLISH));
            sb2.append("_");
            sb2.append(System.currentTimeMillis());
            MonitorType monitorType = MonitorType.MIXED_EVENT;
            sb2.append(monitorType.fileExtension);
            String string = sb2.toString();
            File file = new File(context.getFilesDir(), monitorType.fileDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, string);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return file2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: I */
    public abstract /* bridge */ /* synthetic */ boolean mo83467I();

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ C37738d m83451A(String str) {
        return new C37738d.b("sdk_crashed").m85090g("Crash").m85095l(str).m85096m();
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ C37738d m83454G(String str) {
        return new C37738d.b("exception_handled").m85090g(HttpHeaders.WARNING).m85095l(str).m85096m();
    }

    /* JADX INFO: renamed from: H */
    public static String m83455H(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th2.printStackTrace(printWriter);
                String string = stringWriter.toString();
                printWriter.close();
                return string;
            } catch (Throwable th3) {
                try {
                    printWriter.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ C37738d m83462w(String str) {
        return new C37738d.b(str).m85096m();
    }

    /* JADX INFO: renamed from: C */
    public final JSONObject m83464C(C37738d c37738d, C37739e c37739e) {
        JSONObject jSONObject = new JSONObject();
        if (!mo83480q()) {
            C40832g.m89354i(jSONObject, "relative_time_in_milli_seconds", Long.valueOf(c37739e.m85103f() == null ? 0L : System.currentTimeMillis() - c37739e.m85103f().longValue()));
            if (c37739e.m85101d() != null) {
                C40832g.m89354i(jSONObject, "relative_detection_time_in_milli_seconds", Long.valueOf(System.currentTimeMillis() - c37739e.m85101d().longValue()));
            }
            C40832g.m89354i(jSONObject, "event_name", c37738d.m85081d());
            C40832g.m89354i(jSONObject, "session_id", c37739e.m85104g());
            Map<String, Object> mapM85082e = c37738d.m85082e();
            if (mapM85082e != null) {
                for (String str : mapM85082e.keySet()) {
                    C40832g.m89354i(jSONObject, str.toString(), mapM85082e.get(str));
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: N */
    public void m83471N(final String str, C37739e c37739e) {
        m83468K(new InterfaceC37735a() { // from class: f.a
            @Override // p277g.InterfaceC37735a
            /* JADX INFO: renamed from: a */
            public final Object mo92a() {
                return AbstractC37284f.m83462w(str);
            }
        }, c37739e);
    }

    public AbstractC37284f(Context context) {
        super(context);
        this.f82667h = Executors.newScheduledThreadPool(1);
    }

    /* JADX INFO: renamed from: F */
    public final void m83466F(final String str, C37739e c37739e) {
        if (!mo83480q()) {
            try {
                if (mo83467I()) {
                    final File fileM83465E = m83465E(new InterfaceC37735a() { // from class: f.d
                        @Override // p277g.InterfaceC37735a
                        /* JADX INFO: renamed from: a */
                        public final Object mo92a() {
                            return AbstractC37284f.m83451A(str);
                        }
                    }, c37739e);
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        new Thread(new Runnable() { // from class: f.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f82663b.m83481x(fileM83465E);
                            }
                        }).start();
                    } else {
                        m83554f(fileM83465E);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public File m83468K(final InterfaceC37735a<C37738d> interfaceC37735a, final C37739e c37739e) {
        if (mo83480q()) {
            return null;
        }
        this.f82667h.submit(new Runnable() { // from class: f.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f82658b.m83465E(interfaceC37735a, c37739e);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: L */
    public void m83469L(InterfaceC37735a<C37738d> interfaceC37735a) {
        m83468K(interfaceC37735a, mo83477k());
    }

    /* JADX INFO: renamed from: M */
    public void m83470M(String str) {
        m83471N(str, mo83477k());
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public File m83465E(InterfaceC37735a<C37738d> interfaceC37735a, C37739e c37739e) {
        File fileM83452B = null;
        if (mo83480q()) {
            return null;
        }
        try {
            C37738d c37738dMo92a = interfaceC37735a.mo92a();
            if (c37738dMo92a == null) {
                C40833h.m89363g("eventData is null，不存储本次神策埋点");
                return null;
            }
            if (c37739e == null) {
                return null;
            }
            try {
                String strM85081d = c37738dMo92a.m85081d();
                JSONObject jSONObjectM83464C = m83464C(c37738dMo92a, c37739e);
                HashMap<String, Object> mapM85100c = c37739e.m85100c();
                for (String str : mapM85100c.keySet()) {
                    C40832g.m89354i(jSONObjectM83464C, str, mapM85100c.get(str));
                }
                fileM83452B = m83452B(strM85081d.toLowerCase(Locale.ENGLISH), C37294p.m83560b(jSONObjectM83464C.toString()), mo83476i());
            } catch (Exception unused) {
            }
            m83555g(c37738dMo92a.m85083f());
            return fileM83452B;
        } catch (Exception e11) {
            m83474Q(e11, c37739e);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m83473P(Throwable th2) {
        m83474Q(th2, mo83477k());
    }

    /* JADX INFO: renamed from: Q */
    public void m83474Q(Throwable th2, C37739e c37739e) {
        if (!mo83480q()) {
            try {
                final String strM83455H = m83455H(th2);
                m83468K(new InterfaceC37735a() { // from class: f.c
                    @Override // p277g.InterfaceC37735a
                    /* JADX INFO: renamed from: a */
                    public final Object mo92a() {
                        return AbstractC37284f.m83454G(strM83455H);
                    }
                }, c37739e);
            } catch (Exception unused) {
            }
        }
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: h */
    public void mo83475h() {
        super.mo83475h();
        if (mo83480q()) {
            return;
        }
        m83482z();
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ Context mo83476i() {
        return super.mo83476i();
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ C37739e mo83477k() {
        return super.mo83477k();
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void mo83478o() {
        super.mo83478o();
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ C37739e mo83479p(C37287i c37287i) {
        return super.mo83479p(c37287i);
    }

    @Override // p246f.AbstractC37293o
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo83480q() {
        return super.mo83480q();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m83481x(File file) {
        m83554f(file);
    }

    /* JADX INFO: renamed from: z */
    public final void m83482z() {
        if (mo83467I()) {
            a aVar = new a();
            this.f82666g = aVar;
            aVar.m92892c();
        }
    }
}
