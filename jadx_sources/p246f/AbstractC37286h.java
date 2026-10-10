package p246f;

import aai.telemetry.enums.MonitorType;
import android.content.Context;
import com.google.common.net.HttpHeaders;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p027b.C4403a;
import p027b.C4404b;
import p027b.C4407e;
import p277g.C37736b;
import p277g.C37737c;
import p277g.C37739e;
import p277g.InterfaceC37735a;
import p387k.C40833h;

/* JADX INFO: renamed from: f.h */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC37286h extends AbstractC37290l {

    /* JADX INFO: renamed from: k */
    public ExecutorService f82672k;

    /* JADX INFO: renamed from: f.h$a */
    public class a implements InterfaceC37735a<C37737c> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f82673a;

        public a(String str) {
            this.f82673a = str;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37737c mo92a() {
            return new C37737c.b(this.f82673a).m85076d();
        }
    }

    /* JADX INFO: renamed from: f.h$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC37735a f82675b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C37739e f82676c;

        public b(InterfaceC37735a interfaceC37735a, C37739e c37739e) {
            this.f82675b = interfaceC37735a;
            this.f82676c = c37739e;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C37736b c37736b = (C37736b) this.f82675b.mo92a();
                if (c37736b == null) {
                    C40833h.m89363g("eventData is null，不存储本次神策埋点");
                } else {
                    C4404b.m4061f().m4064i(c37736b, this.f82676c, AbstractC37286h.this.mo83494n());
                    AbstractC37286h.this.m83540e(MonitorType.EVENT, !c37736b.m85057f());
                }
            } catch (Exception e11) {
                AbstractC37286h.this.m83493I(e11, this.f82676c);
            }
        }
    }

    /* JADX INFO: renamed from: f.h$c */
    public class c implements InterfaceC37735a<C37736b> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f82678a;

        public c(String str) {
            this.f82678a = str;
        }

        @Override // p277g.InterfaceC37735a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C37736b mo92a() {
            return new C37736b.b(this.f82678a).m85063f();
        }
    }

    /* JADX INFO: renamed from: D */
    public abstract /* bridge */ /* synthetic */ boolean mo83488D();

    /* JADX INFO: renamed from: E */
    public abstract /* bridge */ /* synthetic */ boolean mo83489E();

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: s */
    public abstract /* bridge */ /* synthetic */ boolean mo83497s();

    /* JADX INFO: renamed from: C */
    public static String m83484C(Throwable th2) {
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

    /* JADX INFO: renamed from: G */
    public void m83491G(String str, C37739e c37739e) {
        m83490F(new a(str), c37739e);
    }

    /* JADX INFO: renamed from: z */
    public void m83502z(String str, C37739e c37739e) {
        m83501y(new c(str), c37739e);
    }

    public AbstractC37286h(Context context) {
        super(context);
        this.f82672k = Executors.newCachedThreadPool();
    }

    /* JADX INFO: renamed from: A */
    public void m83486A(String str, C37739e c37739e) {
        if (mo83488D()) {
            C4404b.m4061f().m4062g(str, c37739e, mo83494n());
            m83540e(MonitorType.EVENT, true);
        }
        if (mo83489E()) {
            C4407e.m4070f().m4073i(str, c37739e, mo83494n());
        }
    }

    /* JADX INFO: renamed from: B */
    public Long m83487B(String str, C37739e c37739e) {
        return c37739e.m85102e(str);
    }

    /* JADX INFO: renamed from: F */
    public void m83490F(final InterfaceC37735a<C37737c> interfaceC37735a, final C37739e c37739e) {
        if (mo83489E()) {
            this.f82672k.submit(new Runnable() { // from class: f.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82669b.m83500x(interfaceC37735a, c37739e);
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public void m83492H(Throwable th2) {
        m83493I(th2, mo83495p());
    }

    /* JADX INFO: renamed from: I */
    public void m83493I(Throwable th2, C37739e c37739e) {
        try {
            if (mo83497s()) {
                C4403a.m4058f().m4060g(m83484C(th2), HttpHeaders.WARNING, c37739e, mo83494n());
                m83540e(MonitorType.CRASH, true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ Context mo83494n() {
        return super.mo83494n();
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ C37739e mo83495p() {
        return super.mo83495p();
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ int mo83496r(MonitorType monitorType) {
        return super.mo83496r(monitorType);
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo83498u() {
        super.mo83498u();
    }

    @Override // p246f.AbstractC37290l
    /* JADX INFO: renamed from: v */
    public /* bridge */ /* synthetic */ C37739e mo83499v(C37287i c37287i) {
        return super.mo83499v(c37287i);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m83500x(InterfaceC37735a interfaceC37735a, C37739e c37739e) {
        try {
            C37737c c37737c = (C37737c) interfaceC37735a.mo92a();
            if (c37737c == null) {
                C40833h.m89363g("logData is null，不存储本次日志");
                return;
            }
            c37737c.m85071g().put("index", Integer.valueOf(this.f82722i.incrementAndGet()));
            C4407e.m4070f().m4072h(c37737c, c37739e, mo83494n());
            m83540e(MonitorType.LOG, !c37737c.m85072h());
        } catch (Exception e11) {
            m83493I(e11, c37739e);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m83501y(InterfaceC37735a<C37736b> interfaceC37735a, C37739e c37739e) {
        if (mo83488D()) {
            this.f82672k.submit(new b(interfaceC37735a, c37739e));
        }
    }
}
