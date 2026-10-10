package yb0;

/* JADX INFO: renamed from: yb0.p */
/* JADX INFO: compiled from: DatabaseWorkerPool.java */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC46448p {

    /* JADX INFO: renamed from: yb0.p$a */
    /* JADX INFO: compiled from: DatabaseWorkerPool.java */
    public class a implements InterfaceC46444l {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C46443k f104168a;

        public a(C46443k c46443k) {
            this.f104168a = c46443k;
        }

        @Override // yb0.InterfaceC46444l
        /* JADX INFO: renamed from: a */
        public int mo102480a() {
            return this.f104168a.f104146c;
        }

        @Override // yb0.InterfaceC46444l
        /* JADX INFO: renamed from: b */
        public boolean mo102481b() {
            return this.f104168a.m102458F();
        }
    }

    /* JADX INFO: renamed from: a */
    static InterfaceC46448p m102491a(String str, int i11, int i12) {
        return i11 == 1 ? new C46452t(str, i12) : new C46450r(str, i11, i12);
    }

    /* JADX INFO: renamed from: b */
    void mo102492b(C46445m c46445m);

    /* JADX INFO: renamed from: c */
    void mo102493c();

    void start();

    /* JADX INFO: renamed from: d */
    default void m102494d(C46443k c46443k, Runnable runnable) {
        mo102492b(new C46445m(c46443k == null ? null : new a(c46443k), runnable));
    }
}
