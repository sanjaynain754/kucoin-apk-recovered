package io.reactivex.internal.functions;

import io.reactivex.functions.BiPredicate;

/* JADX INFO: loaded from: classes23.dex */
public final class ObjectHelper {
    static final BiPredicate<Object, Object> EQUALS = new BiObjectPredicate();

    public static int compare(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 > i12 ? 1 : 0;
    }

    public static <T> T requireNonNull(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    public static int verifyPositive(int i11, String str) {
        if (i11 > 0) {
            return i11;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i11);
    }

    public static final class BiObjectPredicate implements BiPredicate<Object, Object> {
        @Override // io.reactivex.functions.BiPredicate
        public boolean test(Object obj, Object obj2) {
            return ObjectHelper.equals(obj, obj2);
        }
    }

    public static int compare(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 > j12 ? 1 : 0;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> BiPredicate<T, T> equalsPredicate() {
        return (BiPredicate<T, T>) EQUALS;
    }

    public static int hashCode(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @Deprecated
    public static long requireNonNull(long j11, String str) {
        throw new InternalError("Null check on a primitive: " + str);
    }

    public static long verifyPositive(long j11, String str) {
        if (j11 > 0) {
            return j11;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + j11);
    }

    private ObjectHelper() {
        throw new IllegalStateException("No instances!");
    }
}
