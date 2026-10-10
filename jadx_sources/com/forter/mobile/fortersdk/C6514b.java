package com.forter.mobile.fortersdk;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6514b implements InterfaceC6525d {

    /* JADX INFO: renamed from: d */
    public static final C6514b f10870d = new C6514b();

    /* JADX INFO: renamed from: a */
    public final ExecutorService f10871a = AbstractC6539f3.m12291y();

    /* JADX INFO: renamed from: b */
    public volatile a f10872b = a.STARTING;

    /* JADX INFO: renamed from: c */
    public final ReentrantLock f10873c = new ReentrantLock();

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$a */
    public enum a {
        STARTING,
        ACTIVE,
        INVALID_CONF,
        ERROR,
        DESTROYED
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ EnumC6620w f10880b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Activity f10881c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Bundle f10882d;

        public b(EnumC6620w enumC6620w, Activity activity, Bundle bundle) {
            this.f10880b = enumC6620w;
            this.f10881c = activity;
            this.f10882d = bundle;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c c6520cM12182b = C6520c.m12182b();
                EnumC6620w enumC6620w = this.f10880b;
                Activity activity = this.f10881c;
                try {
                    if (activity == null) {
                        AbstractC6524c3.m12214f();
                        return;
                    }
                    c6520cM12182b.m12186d(enumC6620w, activity.getApplicationContext());
                    if (enumC6620w.equals(EnumC6620w.ON_RESUMED)) {
                        AbstractC6609t3.m12478e(activity.getIntent());
                    }
                } catch (Throwable th2) {
                    c6520cM12182b.m12187e(String.format("ForterClient::activityEvent(withActivity) -> got exception: %s", th2.getMessage()), null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6619v3 f10884b;

        public c(InterfaceC6619v3 interfaceC6619v3) {
            this.f10884b = interfaceC6619v3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c.m12182b().m12192j(this.f10884b, true);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC6619v3 f10886b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f10887c = true;

        public d(InterfaceC6619v3 interfaceC6619v3) {
            this.f10886b = interfaceC6619v3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c.m12182b().m12192j(this.f10886b, this.f10887c);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$e */
    /* JADX INFO: loaded from: classes45.dex */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10889b;

        public e(String str) {
            this.f10889b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c.m12182b().m12187e(this.f10889b, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$f */
    /* JADX INFO: loaded from: classes45.dex */
    public class f implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f10891b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f10892c;

        public f(String str, String str2) {
            this.f10891b = str;
            this.f10892c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c.m12182b().m12187e(this.f10891b, this.f10892c);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C44699a f10894b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Context f10895c;

        public g(C44699a c44699a, Context context) {
            this.f10894b = c44699a;
            this.f10895c = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6510ae c6510aeM12399a;
            if (this.f10894b.m98871H()) {
                C6555j c6555j = new C6555j();
                String strM98892r = this.f10894b.m98892r();
                String strM98886l = this.f10894b.m98886l();
                if (AbstractC6539f3.m12282p(strM98892r)) {
                    strM98892r = "deadbeefcafe";
                }
                if (AbstractC6539f3.m12282p(strM98886l)) {
                    strM98886l = "null";
                }
                c6510aeM12399a = c6555j.m12399a(strM98892r, strM98886l, new C6511aj(new C6560k()), 3);
            } else {
                C44699a c44699a = this.f10894b;
                C6510ae c6510ae = new C6510ae();
                c6510ae.f10834c = C6510ae.a.f10837a;
                c6510ae.f10832a = c44699a;
                c6510ae.f10836e = true;
                c6510aeM12399a = c6510ae;
            }
            if (c6510aeM12399a.f10834c != C6510ae.a.f10837a) {
                C6514b.this.m12156c(a.DESTROYED);
                C6514b.this.mo12155a(C6508aa.f10805b, null);
                return;
            }
            c6510aeM12399a.m12135c(new C44699a(this.f10894b));
            if (C6520c.m12182b().m12188f(this.f10895c, c6510aeM12399a)) {
                C6514b.this.m12156c(a.ACTIVE);
            } else {
                C6514b.this.m12156c(a.ERROR);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$h */
    /* JADX INFO: loaded from: classes45.dex */
    public class h implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Location f10897b;

        public h(Location location) {
            this.f10897b = location;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c.m12182b().m12189g(this.f10897b);
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f10899b;

        public i(boolean z11) {
            this.f10899b = z11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c c6520cM12182b = C6520c.m12182b();
                boolean z11 = this.f10899b;
                if (c6520cM12182b.m12193l(false)) {
                    c6520cM12182b.f10917c.m98867D(z11);
                    if (c6520cM12182b.m12200t() != null) {
                        if (z11) {
                            c6520cM12182b.m12185c(c6520cM12182b.m12200t());
                        } else {
                            c6520cM12182b.m12194m(c6520cM12182b.m12200t());
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f10901b;

        public j(Context context) {
            this.f10901b = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (C6514b.m12153h(C6514b.this)) {
                C6520c c6520cM12182b = C6520c.m12182b();
                Context context = this.f10901b;
                if (c6520cM12182b.m12193l(false)) {
                    long j11 = c6520cM12182b.f10931q + 1500;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC6524c3.m12216h();
                    if (j11 > jCurrentTimeMillis) {
                        return;
                    }
                    c6520cM12182b.f10931q = System.currentTimeMillis();
                    C6540g c6540gM12133a = c6520cM12182b.f10916b.m12133a("analytics");
                    if (c6540gM12133a == null || !AbstractC6518b3.m12172f(c6540gM12133a.f10953c)) {
                        return;
                    }
                    for (C6545h c6545h : c6540gM12133a.f10954d) {
                        String.format("Queueing analytics call to %s", c6545h.f10959a);
                        AbstractC6524c3.m12216h();
                        c6520cM12182b.f10918d.m12147j(c6545h.f10960b, context);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$k */
    /* JADX INFO: loaded from: classes45.dex */
    public class k implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f10903b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f10904c;

        public k(int i11, Object obj) {
            this.f10903b = i11;
            this.f10904c = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                C6520c.m12182b().mo12155a(this.f10903b, this.f10904c);
            } catch (Throwable unused) {
                AbstractC6524c3.m12212d();
            }
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.b$l */
    public static /* synthetic */ class l {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10906a;

        static {
            int[] iArr = new int[EnumC6620w.values().length];
            f10906a = iArr;
            try {
                iArr[EnumC6620w.ON_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10906a[EnumC6620w.ON_PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C6514b m12151b() {
        return f10870d;
    }

    /* JADX INFO: renamed from: c */
    public final void m12156c(a aVar) {
        this.f10873c.lock();
        this.f10872b = aVar;
        this.f10873c.unlock();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX INFO: renamed from: e */
    public final void m12157e(EnumC6620w enumC6620w, Activity activity, Bundle bundle) {
        C6566l0 c6566l0M12419a;
        int i11 = l.f10906a[enumC6620w.ordinal()];
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 == 2) {
                c6566l0M12419a = C6566l0.m12419a();
                z11 = false;
            }
            if (m12163l()) {
                return;
            }
            this.f10871a.execute(new b(enumC6620w, activity, bundle));
        }
        c6566l0M12419a = C6566l0.m12419a();
        c6566l0M12419a.m12420b(z11);
        if (m12163l()) {
            return;
        }
        this.f10871a.execute(new b(enumC6620w, activity, bundle));
    }

    /* JADX INFO: renamed from: j */
    public final a m12161j() {
        this.f10873c.lock();
        a aVar = this.f10872b;
        this.f10873c.unlock();
        return aVar;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m12153h(C6514b c6514b) {
        if (c6514b.m12161j() == a.ACTIVE) {
            return true;
        }
        return false;
    }

    @Override // com.forter.mobile.fortersdk.InterfaceC6525d
    /* JADX INFO: renamed from: a */
    public final void mo12155a(int i11, Object obj) {
        if (!m12163l() && C6520c.m12182b() != null) {
            this.f10871a.execute(new k(i11, obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12158f(String str) {
        if (m12163l()) {
            return;
        }
        this.f10871a.execute(new e(str));
    }

    /* JADX INFO: renamed from: g */
    public final void m12159g(String str, String str2) {
        if (m12163l()) {
            return;
        }
        this.f10871a.execute(new f(str, str2));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m12160i(InterfaceC6619v3 interfaceC6619v3) {
        if (m12163l()) {
            return false;
        }
        this.f10871a.execute(new c(interfaceC6619v3));
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12162k(InterfaceC6619v3 interfaceC6619v3) {
        if (m12163l()) {
            return false;
        }
        this.f10871a.execute(new d(interfaceC6619v3));
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m12163l() {
        if (m12161j() != a.DESTROYED && m12161j() != a.ERROR && m12161j() != a.INVALID_CONF) {
            return false;
        }
        return true;
    }
}
