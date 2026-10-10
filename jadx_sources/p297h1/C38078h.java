package p297h1;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: renamed from: h1.h */
/* JADX INFO: compiled from: MutablePair.java */
/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class C38078h<T> {

    /* JADX INFO: renamed from: a */
    @Nullable
    public T f85722a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public T f85723b;

    /* JADX INFO: renamed from: a */
    public static boolean m85978a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m85979b(T t11, T t12) {
        this.f85722a = t11;
        this.f85723b = t12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return m85978a(pair.first, this.f85722a) && m85978a(pair.second, this.f85723b);
    }

    public int hashCode() {
        T t11 = this.f85722a;
        int iHashCode = t11 == null ? 0 : t11.hashCode();
        T t12 = this.f85723b;
        return iHashCode ^ (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f85722a + C33627eb.f69716f + this.f85723b + "}";
    }
}
