package p050c4;

/* JADX INFO: renamed from: c4.d */
/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4822d implements InterfaceC4819a {

    /* JADX INFO: renamed from: a */
    public static final C4822d f4846a = new C4822d();

    /* JADX INFO: renamed from: a */
    public static C4822d m4916a() {
        return f4846a;
    }

    @Override // p050c4.InterfaceC4819a
    public long now() {
        return System.currentTimeMillis();
    }
}
