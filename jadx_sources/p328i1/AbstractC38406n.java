package p328i1;

import java.util.Arrays;
import java.util.List;
import p522p1.C43348a;

/* JADX INFO: renamed from: i1.n */
/* JADX INFO: compiled from: BaseAnimatableValue.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC38406n<V, O> implements InterfaceC38405m<V, O> {

    /* JADX INFO: renamed from: a */
    public final List<C43348a<V>> f86187a;

    @Override // p328i1.InterfaceC38405m
    /* JADX INFO: renamed from: b */
    public List<C43348a<V>> mo86575b() {
        return this.f86187a;
    }

    @Override // p328i1.InterfaceC38405m
    public boolean isStatic() {
        return this.f86187a.isEmpty() || (this.f86187a.size() == 1 && this.f86187a.get(0).m95458i());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f86187a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f86187a.toArray()));
        }
        return sb2.toString();
    }

    public AbstractC38406n(List<C43348a<V>> list) {
        this.f86187a = list;
    }
}
