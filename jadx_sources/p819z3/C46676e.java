package p819z3;

/* JADX INFO: renamed from: z3.e */
/* JADX INFO: compiled from: NoOpMemoryTrimmableRegistry.java */
/* JADX INFO: loaded from: classes34.dex */
public class C46676e implements InterfaceC46675d {

    /* JADX INFO: renamed from: a */
    public static C46676e f104508a;

    /* JADX INFO: renamed from: b */
    public static synchronized C46676e m102898b() {
        try {
            if (f104508a == null) {
                f104508a = new C46676e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f104508a;
    }

    @Override // p819z3.InterfaceC46675d
    /* JADX INFO: renamed from: a */
    public void mo102897a(InterfaceC46674c interfaceC46674c) {
    }
}
