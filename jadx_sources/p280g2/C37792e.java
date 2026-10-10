package p280g2;

import androidx.annotation.NonNull;
import p219e2.AbstractC37046b;
import p680v1.InterfaceC45356g;

/* JADX INFO: renamed from: g2.e */
/* JADX INFO: compiled from: GifDrawableResource.java */
/* JADX INFO: loaded from: classes34.dex */
public class C37792e extends AbstractC37046b<C37790c> implements InterfaceC45356g {
    @Override // p680v1.InterfaceC45359j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Class<C37790c> mo4266a() {
        return C37790c.class;
    }

    @Override // p680v1.InterfaceC45359j
    public int getSize() {
        return ((C37790c) this.f82301b).m85260i();
    }

    @Override // p219e2.AbstractC37046b, p680v1.InterfaceC45356g
    public void initialize() {
        ((C37790c) this.f82301b).m85256e().prepareToDraw();
    }

    @Override // p680v1.InterfaceC45359j
    public void recycle() {
        ((C37790c) this.f82301b).stop();
        ((C37790c) this.f82301b).m85262k();
    }

    public C37792e(C37790c c37790c) {
        super(c37790c);
    }
}
