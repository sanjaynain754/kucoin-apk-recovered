package androidx.core.util;

import androidx.annotation.NonNull;
import com.tencent.bugly.proguard.C33627eb;

/* JADX INFO: loaded from: classes23.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    @NonNull
    public static <A, B> Pair<A, B> create(A a11, B b11) {
        return new Pair<>(a11, b11);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f11 = this.first;
        int iHashCode = f11 == null ? 0 : f11.hashCode();
        S s11 = this.second;
        return iHashCode ^ (s11 != null ? s11.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + C33627eb.f69716f + this.second + "}";
    }

    public Pair(F f11, S s11) {
        this.first = f11;
        this.second = s11;
    }
}
