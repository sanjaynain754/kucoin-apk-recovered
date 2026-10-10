package uf0;

/* JADX INFO: renamed from: uf0.c */
/* JADX INFO: compiled from: AutoValue_AttributeValue_AttributeValueString.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C45214c extends AbstractC45212a.b {

    /* JADX INFO: renamed from: a */
    public final String f101734a;

    @Override // uf0.AbstractC45212a.b
    /* JADX INFO: renamed from: d */
    public String mo99892d() {
        return this.f101734a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC45212a.b) {
            return this.f101734a.equals(((AbstractC45212a.b) obj).mo99892d());
        }
        return false;
    }

    public int hashCode() {
        return this.f101734a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "AttributeValueString{stringValue=" + this.f101734a + "}";
    }

    public C45214c(String str) {
        if (str != null) {
            this.f101734a = str;
            return;
        }
        throw new NullPointerException("Null stringValue");
    }
}
