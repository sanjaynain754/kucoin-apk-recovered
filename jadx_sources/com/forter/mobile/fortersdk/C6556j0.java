package com.forter.mobile.fortersdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import p634t7.C44699a;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6556j0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue<InterfaceC6619v3> f10972a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f10973b = AbstractC6539f3.m12291y();

    /* JADX INFO: renamed from: c */
    public C6520c f10974c;

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.j0$a */
    /* JADX INFO: loaded from: classes45.dex */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10975b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10976c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f10977d;

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it;
            int i11 = 1;
            while (this.f10975b.hasNext() && i11 <= this.f10976c) {
                try {
                    i11++;
                    InterfaceC6619v3 interfaceC6619v3 = (InterfaceC6619v3) this.f10975b.next();
                    if (C6556j0.this.m12403d(interfaceC6619v3)) {
                        it = this.f10975b;
                    } else if (C6556j0.this.m12402c().m12197p().m98895u()) {
                        C6556j0.this.m12402c().m12191i(interfaceC6619v3);
                        it = this.f10975b;
                    }
                    it.remove();
                } catch (Exception e11) {
                    e11.getMessage();
                    AbstractC6524c3.m12214f();
                    return;
                }
            }
            System.currentTimeMillis();
            AbstractC6524c3.m12214f();
        }

        public a(Iterator it, int i11, long j11) {
            this.f10975b = it;
            this.f10976c = i11;
            this.f10977d = j11;
        }
    }

    /* JADX INFO: renamed from: com.forter.mobile.fortersdk.j0$b */
    /* JADX INFO: loaded from: classes45.dex */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Iterator f10979b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f10980c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f10981d;

        @Override // java.lang.Runnable
        public final void run() {
            int i11 = 1;
            while (this.f10979b.hasNext() && i11 <= this.f10980c) {
                i11++;
                if (C6556j0.this.m12403d((InterfaceC6619v3) this.f10979b.next())) {
                    this.f10979b.remove();
                }
            }
            System.currentTimeMillis();
            AbstractC6524c3.m12214f();
        }

        public b(Iterator it, int i11, long j11) {
            this.f10979b = it;
            this.f10980c = i11;
            this.f10981d = j11;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12401b(@NonNull InterfaceC6619v3 interfaceC6619v3) {
        try {
            if (m12402c().m12193l(false) && m12404e(interfaceC6619v3)) {
                C44699a c44699aM12197p = m12402c().m12197p();
                if (this.f10972a.size() >= c44699aM12197p.m98876b()) {
                    return false;
                }
                if (c44699aM12197p.m98869F() && (interfaceC6619v3 instanceof InterfaceC6614u3) && C6561k0.m12408a((InterfaceC6614u3) interfaceC6619v3)) {
                    return true;
                }
                interfaceC6619v3.mo12304b();
                AbstractC6524c3.m12216h();
                return this.f10972a.add(interfaceC6619v3);
            }
            return false;
        } catch (Exception unused) {
            AbstractC6524c3.m12212d();
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12404e(@NonNull InterfaceC6619v3 interfaceC6619v3) {
        try {
            if (m12403d(interfaceC6619v3)) {
                return false;
            }
            C44699a c44699aM12197p = m12402c().m12197p();
            String strM12271e = AbstractC6539f3.m12271e(interfaceC6619v3.mo12306d());
            if (strM12271e == null) {
                return false;
            }
            long length = strM12271e.getBytes(Charset.forName("UTF-8")).length;
            interfaceC6619v3.mo12304b();
            AbstractC6524c3.m12216h();
            return length < c44699aM12197p.m98885k();
        } catch (Exception e11) {
            e11.getMessage();
            AbstractC6524c3.m12214f();
            return false;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public final C6520c m12402c() {
        C6520c c6520c = this.f10974c;
        return c6520c != null ? c6520c : C6520c.m12182b();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12400a() {
        int iIntValue;
        if (!m12402c().m12193l(false)) {
            AbstractC6524c3.m12214f();
            return false;
        }
        if (this.f10972a.size() == 0) {
            AbstractC6524c3.m12214f();
            return true;
        }
        try {
            int size = this.f10972a.size();
            C6512am c6512am = m12402c().f10918d;
            if (c6512am != null) {
                iIntValue = c6512am.f10852b.f11031d.intValue();
            } else {
                iIntValue = 0;
            }
            if (size + iIntValue > m12402c().m12197p().m98876b()) {
                AbstractC6524c3.m12214f();
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f10973b.execute(new b(this.f10972a.iterator(), this.f10972a.size(), jCurrentTimeMillis));
                System.currentTimeMillis();
                AbstractC6524c3.m12214f();
                return false;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            this.f10973b.execute(new a(this.f10972a.iterator(), this.f10972a.size(), jCurrentTimeMillis2));
            System.currentTimeMillis();
            AbstractC6524c3.m12214f();
            return true;
        } catch (RejectedExecutionException e11) {
            m12402c().m12187e(String.format("EventsBuffer::internalSendAllEvents() Failed to execute submission, got ex: %s", e11.getMessage()), null);
            AbstractC6524c3.m12214f();
            return false;
        } catch (Exception e12) {
            e12.getMessage();
            AbstractC6524c3.m12209a();
            m12402c().m12187e("Failed to create a thread that will process all buffered events.", null);
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12403d(@Nullable InterfaceC6619v3 interfaceC6619v3) {
        C44699a c44699aM12197p = m12402c().m12197p();
        if (interfaceC6619v3 != null && c44699aM12197p != null && interfaceC6619v3.mo12305c() + ((long) (c44699aM12197p.m98881g() * 1000)) >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
