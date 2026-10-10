package uf0;

/* JADX INFO: renamed from: uf0.b */
/* JADX INFO: compiled from: AutoValue_AttributeValue_AttributeValueLong.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45213b extends AbstractC45212a.a {

    /* JADX INFO: renamed from: a */
    public final Long f101733a;

    @Override // uf0.AbstractC45212a.a
    /* JADX INFO: renamed from: d */
    public Long mo99890d() {
        return this.f101733a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45212a.a) {
            return this.f101733a.equals(((AbstractC45212a.a) obj).mo99890d());
        }
        return false;
    }

    public int hashCode() {
        return this.f101733a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueLong{longValue=" + this.f101733a + "}";
    }

    public C45213b(Long l11) {
        if (l11 != null) {
            this.f101733a = l11;
            return;
        }
        throw new NullPointerException("Null longValue");
    }
}
