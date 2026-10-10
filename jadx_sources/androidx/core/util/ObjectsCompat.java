package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ObjectsCompat {
    @NonNull
    public static <T> T requireNonNull(@Nullable T t11) {
        t11.getClass();
        return t11;
    }

    public static int hashCode(@Nullable Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t11, @NonNull String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    @Nullable
    public static String toString(@Nullable Object obj, @Nullable String str) {
        return obj != null ? obj.toString() : str;
    }

    private ObjectsCompat() {
    }

    public static boolean equals(@Nullable Object obj, @Nullable Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int hash(@Nullable Object... objArr) {
        return Objects.hash(objArr);
    }
}
