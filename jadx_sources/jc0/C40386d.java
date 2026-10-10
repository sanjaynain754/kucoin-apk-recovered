package jc0;

import com.google.common.collect.Iterables;
import java.util.List;
import kc0.C40984a;

/* JADX INFO: renamed from: jc0.d */
/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40386d {

    /* JADX INFO: renamed from: a */
    public final boolean f89695a;

    /* JADX INFO: renamed from: b */
    public final List<C40984a> f89696b;

    /* JADX INFO: renamed from: c */
    public final int f89697c;

    /* JADX INFO: renamed from: a */
    public String m89002a() {
        return ((C40984a) Iterables.getLast(this.f89696b)).m89764a();
    }

    /* JADX INFO: renamed from: b */
    public String m89003b() {
        return ((C40984a) Iterables.getLast(this.f89696b)).m89765b();
    }

    /* JADX INFO: renamed from: c */
    public List<C40984a> m89004c() {
        return this.f89696b;
    }

    /* JADX INFO: renamed from: d */
    public boolean m89005d() {
        return this.f89695a;
    }

    public String toString() {
        return "Result{successful=" + this.f89695a + ", reservedAttempts=" + this.f89696b + ", attemptCount=" + this.f89697c + '}';
    }

    public C40386d(boolean z11, List<C40984a> list, int i11) {
        this.f89695a = z11;
        this.f89696b = list;
        this.f89697c = i11;
    }
}
