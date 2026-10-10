package p630t3;

/* JADX INFO: renamed from: t3.c */
/* JADX INFO: compiled from: NoOpDiskTrimmableRegistry.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44680c implements InterfaceC44679b {

    /* JADX INFO: renamed from: a */
    public static C44680c f99473a;

    /* JADX INFO: renamed from: b */
    public static synchronized C44680c m98833b() {
        try {
            if (f99473a == null) {
                f99473a = new C44680c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f99473a;
    }

    @Override // p630t3.InterfaceC44679b
    /* JADX INFO: renamed from: a */
    public void mo98832a(InterfaceC44678a interfaceC44678a) {
    }
}
