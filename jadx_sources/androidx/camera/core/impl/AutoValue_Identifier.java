package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_Identifier extends Identifier {
    private final Object value;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Identifier) {
            return this.value.equals(((Identifier) obj).getValue());
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Identifier
    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.value + "}";
    }

    public AutoValue_Identifier(Object obj) {
        if (obj != null) {
            this.value = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
