package androidx.core.util;

import android.annotation.SuppressLint;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
@SuppressLint({"UnknownNullness"})
public interface Predicate<T> {
    boolean test(T t11);

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new Predicate() { // from class: androidx.core.util.e
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> negate() {
        return new Predicate() { // from class: androidx.core.util.h
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m2468a(this.f2305a, obj);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ boolean m2468a(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ boolean m2469b(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) && predicate2.test(obj)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ boolean m2471d(Predicate predicate, Predicate predicate2, Object obj) {
        if (!predicate.test(obj) && !predicate2.test(obj)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"MissingNullability"})
    static <T> Predicate<T> not(@SuppressLint({"MissingNullability"}) Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }

    @SuppressLint({"MissingNullability"})
    default Predicate<T> and(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.g
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m2469b(this.f2303a, predicate, obj);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: or */
    default Predicate<T> m2473or(@SuppressLint({"MissingNullability"}) final Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: androidx.core.util.d
            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return Predicate.m2471d(this.f2300a, predicate, obj);
            }
        };
    }
}
