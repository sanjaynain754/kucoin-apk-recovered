package ac0;

/* JADX INFO: renamed from: ac0.a */
/* JADX INFO: compiled from: BaseOperation.java */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC0231a extends AbstractC0232b {
    /* JADX INFO: renamed from: l */
    public abstract InterfaceC0236f mo853l();

    @Override // ac0.InterfaceC0236f
    public void error(String str, String str2, Object obj) {
        mo853l().error(str, str2, obj);
    }

    @Override // ac0.InterfaceC0236f
    public void success(Object obj) {
        mo853l().success(obj);
    }
}
