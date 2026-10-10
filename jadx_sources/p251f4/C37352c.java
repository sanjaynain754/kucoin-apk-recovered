package p251f4;

import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: f4.c */
/* JADX INFO: compiled from: DataSources.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37352c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: f4.c$a */
    /* JADX INFO: compiled from: DataSources.java */
    public class a<T> implements InterfaceC45711k<InterfaceC37351b<T>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Throwable f82868a;

        public a(Throwable th2) {
            this.f82868a = th2;
        }

        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC37351b<T> get() {
            return C37352c.m83952b(this.f82868a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> InterfaceC45711k<InterfaceC37351b<T>> m83951a(Throwable th2) {
        return new a(th2);
    }

    /* JADX INFO: renamed from: b */
    public static <T> InterfaceC37351b<T> m83952b(Throwable th2) {
        C37357h c37357hM83984u = C37357h.m83984u();
        c37357hM83984u.mo8599m(th2);
        return c37357hM83984u;
    }
}
