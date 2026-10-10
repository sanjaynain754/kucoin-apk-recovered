package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes23.dex */
final class AutoValue_Config_Option<T> extends Config.Option<T> {

    /* JADX INFO: renamed from: id */
    private final String f1652id;
    private final Object token;
    private final Class<T> valueClass;

    public boolean equals(Object obj) {
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Config.Option) {
            Config.Option option = (Config.Option) obj;
            if (this.f1652id.equals(option.getId()) && this.valueClass.equals(option.getValueClass()) && ((obj2 = this.token) != null ? obj2.equals(option.getToken()) : option.getToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public String getId() {
        return this.f1652id;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Object getToken() {
        return this.token;
    }

    @Override // androidx.camera.core.impl.Config.Option
    public Class<T> getValueClass() {
        return this.valueClass;
    }

    public int hashCode() {
        int iHashCode = (((this.f1652id.hashCode() ^ 1000003) * 1000003) ^ this.valueClass.hashCode()) * 1000003;
        Object obj = this.token;
        return iHashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f1652id + ", valueClass=" + this.valueClass + ", token=" + this.token + "}";
    }

    public AutoValue_Config_Option(String str, Class<T> cls, Object obj) {
        if (str != null) {
            this.f1652id = str;
            if (cls != null) {
                this.valueClass = cls;
                this.token = obj;
                return;
            }
            throw new NullPointerException("Null valueClass");
        }
        throw new NullPointerException("Null id");
    }
}
