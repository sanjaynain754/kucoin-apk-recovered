package p008a6;

import java.util.LinkedList;
import p006a4.C0115f;
import p712w3.C45708h;

/* JADX INFO: renamed from: a6.c0 */
/* JADX INFO: compiled from: OOMSoftReferenceBucket.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0138c0<V> extends C0150j<V> {

    /* JADX INFO: renamed from: f */
    public LinkedList<C0115f<V>> f465f;

    public C0138c0(int i11, int i12, int i13) {
        super(i11, i12, i13, false);
        this.f465f = new LinkedList<>();
    }

    @Override // p008a6.C0150j
    /* JADX INFO: renamed from: a */
    public void mo623a(V v11) {
        C0115f<V> c0115fPoll = this.f465f.poll();
        if (c0115fPoll == null) {
            c0115fPoll = new C0115f<>();
        }
        c0115fPoll.m573c(v11);
        this.f523c.add(c0115fPoll);
    }

    @Override // p008a6.C0150j
    /* JADX INFO: renamed from: g */
    public V mo624g() {
        C0115f<V> c0115f = (C0115f) this.f523c.poll();
        C45708h.m100896g(c0115f);
        V vM572b = c0115f.m572b();
        c0115f.m571a();
        this.f465f.add(c0115f);
        return vM572b;
    }
}
