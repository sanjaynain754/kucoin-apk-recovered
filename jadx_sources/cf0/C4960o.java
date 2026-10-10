package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: cf0.o */
/* JADX INFO: compiled from: Prop.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4960o<T> {

    /* JADX INFO: renamed from: a */
    public final String f5537a;

    @NonNull
    /* JADX INFO: renamed from: b */
    public static <T> C4960o<T> m5236b(@NonNull String str) {
        return new C4960o<>(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5537a.equals(((C4960o) obj).f5537a);
    }

    public int hashCode() {
        return this.f5537a.hashCode();
    }

    public String toString() {
        return "Prop{name='" + this.f5537a + "'}";
    }

    public C4960o(@NonNull String str) {
        this.f5537a = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public T m5237a(@NonNull InterfaceC4962q interfaceC4962q) {
        return (T) interfaceC4962q.mo5245b(this);
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public T m5238c(@NonNull InterfaceC4962q interfaceC4962q) {
        T tM5237a = m5237a(interfaceC4962q);
        if (tM5237a != null) {
            return tM5237a;
        }
        throw new NullPointerException(this.f5537a);
    }

    /* JADX INFO: renamed from: d */
    public void m5239d(@NonNull InterfaceC4962q interfaceC4962q, @Nullable T t11) {
        interfaceC4962q.mo5244a(this, t11);
    }
}
