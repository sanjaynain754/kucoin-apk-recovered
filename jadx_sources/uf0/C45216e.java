package uf0;

import java.util.List;

/* JADX INFO: renamed from: uf0.e */
/* JADX INFO: compiled from: AutoValue_Tracestate.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45216e extends AbstractC45230s {

    /* JADX INFO: renamed from: a */
    public final List<Object> f101739a;

    @Override // uf0.AbstractC45230s
    /* JADX INFO: renamed from: d */
    public List<Object> mo99898d() {
        return this.f101739a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45230s) {
            return this.f101739a.equals(((AbstractC45230s) obj).mo99898d());
        }
        return false;
    }

    public int hashCode() {
        return this.f101739a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Tracestate{entries=" + this.f101739a + "}";
    }

    public C45216e(List<Object> list) {
        if (list != null) {
            this.f101739a = list;
            return;
        }
        throw new NullPointerException("Null entries");
    }
}
