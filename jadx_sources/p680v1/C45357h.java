package p680v1;

import com.bumptech.glide.load.engine.C5347g;
import java.util.HashMap;
import java.util.Map;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: v1.h */
/* JADX INFO: compiled from: Jobs.java */
/* JADX INFO: loaded from: classes.dex */
public final class C45357h {

    /* JADX INFO: renamed from: a */
    public final Map<InterfaceC44610b, C5347g<?>> f101968a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC44610b, C5347g<?>> f101969b = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map<InterfaceC44610b, C5347g<?>> m100256b(boolean z11) {
        return z11 ? this.f101969b : this.f101968a;
    }

    /* JADX INFO: renamed from: a */
    public C5347g<?> m100255a(InterfaceC44610b interfaceC44610b, boolean z11) {
        return m100256b(z11).get(interfaceC44610b);
    }

    /* JADX INFO: renamed from: c */
    public void m100257c(InterfaceC44610b interfaceC44610b, C5347g<?> c5347g) {
        m100256b(c5347g.m6811p()).put(interfaceC44610b, c5347g);
    }

    /* JADX INFO: renamed from: d */
    public void m100258d(InterfaceC44610b interfaceC44610b, C5347g<?> c5347g) {
        Map<InterfaceC44610b, C5347g<?>> mapM100256b = m100256b(c5347g.m6811p());
        if (c5347g.equals(mapM100256b.get(interfaceC44610b))) {
            mapM100256b.remove(interfaceC44610b);
        }
    }
}
