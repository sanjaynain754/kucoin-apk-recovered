package kc0;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.Iterables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.tencentcloudapi.cls.android.producer.errors.ResultFailedException;
import hc0.C38168a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import jc0.C40386d;
import jc0.InterfaceC40385c;

/* JADX INFO: renamed from: kc0.i */
/* JADX INFO: compiled from: ProducerBatch.java */
/* JADX INFO: loaded from: classes2.dex */
public class DelayedC40992i implements Delayed {

    /* JADX INFO: renamed from: b */
    public long f91096b;

    /* JADX INFO: renamed from: c */
    public final String f91097c;

    /* JADX INFO: renamed from: d */
    public final String f91098d;

    /* JADX INFO: renamed from: e */
    public final int f91099e;

    /* JADX INFO: renamed from: f */
    public final int f91100f;

    /* JADX INFO: renamed from: g */
    public final long f91101g;

    /* JADX INFO: renamed from: m */
    public final EvictingQueue<C40984a> f91107m;

    /* JADX INFO: renamed from: k */
    public final List<C40989f> f91105k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final List<a> f91106l = new ArrayList();

    /* JADX INFO: renamed from: i */
    public int f91103i = 0;

    /* JADX INFO: renamed from: h */
    public int f91102h = 0;

    /* JADX INFO: renamed from: j */
    public int f91104j = 0;

    /* JADX INFO: renamed from: kc0.i$a */
    /* JADX INFO: compiled from: ProducerBatch.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC40385c f91108a;

        /* JADX INFO: renamed from: b */
        public final SettableFuture<C40386d> f91109b;

        public a(InterfaceC40385c interfaceC40385c, SettableFuture<C40386d> settableFuture) {
            this.f91108a = interfaceC40385c;
            this.f91109b = settableFuture;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m89789a(C40984a c40984a) {
        this.f91107m.add(c40984a);
        this.f91104j++;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return (int) (this.f91096b - ((DelayedC40992i) delayed).m89796h());
    }

    /* JADX INFO: renamed from: c */
    public final long m89791c(long j11) {
        return Math.max(0L, j11 - this.f91101g);
    }

    /* JADX INFO: renamed from: d */
    public final void m89792d(C40386d c40386d) {
        Iterator<a> it = this.f91106l.iterator();
        while (it.hasNext()) {
            try {
                InterfaceC40385c interfaceC40385c = it.next().f91108a;
                if (interfaceC40385c != null) {
                    interfaceC40385c.mo89001a(c40386d);
                }
            } catch (Exception e11) {
                C38168a.m86124a("producer", C38168a.m86126c("Failed to execute user-provided callback, topic_id=%s, e=%s", this.f91098d, e11.getMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m89793e() {
        ArrayList arrayList = new ArrayList(this.f91107m);
        C40386d c40386d = new C40386d(((C40984a) Iterables.getLast(arrayList)).m89766c(), arrayList, this.f91104j);
        m89792d(c40386d);
        m89803o(c40386d);
    }

    /* JADX INFO: renamed from: f */
    public int m89794f() {
        return this.f91102h;
    }

    /* JADX INFO: renamed from: g */
    public List<C40989f> m89795g() {
        return this.f91105k;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f91096b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: h */
    public long m89796h() {
        return this.f91096b;
    }

    /* JADX INFO: renamed from: i */
    public String m89797i() {
        return this.f91097c;
    }

    /* JADX INFO: renamed from: j */
    public int m89798j() {
        return Math.max(0, this.f91104j - 1);
    }

    /* JADX INFO: renamed from: k */
    public String m89799k() {
        return this.f91098d;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m89800l(int i11, int i12) {
        return this.f91102h + i11 > 5242880 || this.f91103i + i12 > 10000;
    }

    /* JADX INFO: renamed from: m */
    public boolean m89801m() {
        return this.f91102h >= this.f91099e || this.f91103i >= this.f91100f;
    }

    /* JADX INFO: renamed from: o */
    public final void m89803o(C40386d c40386d) {
        for (a aVar : this.f91106l) {
            try {
                if (c40386d.m89005d()) {
                    aVar.f91109b.set(c40386d);
                } else {
                    aVar.f91109b.setException(new ResultFailedException(c40386d));
                }
            } catch (Exception e11) {
                C38168a.m86124a("producer", C38168a.m86126c("Failed to set future, topic_id={}, e=", this.f91098d, e11));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m89804p(long j11) {
        this.f91096b = j11;
    }

    public DelayedC40992i(String str, String str2, int i11, int i12, int i13, long j11) {
        this.f91098d = str;
        this.f91097c = str2;
        this.f91101g = j11;
        this.f91099e = i11;
        this.f91100f = i12;
        this.f91107m = EvictingQueue.create(i13);
    }

    /* JADX INFO: renamed from: n */
    public long m89802n(long j11, long j12) {
        return j12 - m89791c(j11);
    }

    /* JADX INFO: renamed from: q */
    public ListenableFuture<C40386d> m89805q(List<C40989f> list, int i11, InterfaceC40385c interfaceC40385c) {
        if (m89800l(i11, list.size())) {
            return null;
        }
        SettableFuture settableFutureCreate = SettableFuture.create();
        this.f91105k.addAll(list);
        this.f91106l.add(new a(interfaceC40385c, settableFutureCreate));
        this.f91103i += list.size();
        this.f91102h += i11;
        return settableFutureCreate;
    }
}
