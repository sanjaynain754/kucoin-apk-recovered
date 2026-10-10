package p523p2;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: renamed from: p2.j */
/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes.dex */
public final class C43363j {
    /* JADX INFO: renamed from: a */
    public static void m95503a(boolean z11, @NonNull String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static <T> T m95506d(@Nullable T t11) {
        return (T) m95507e(t11, "Argument must not be null");
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static <T> T m95507e(@Nullable T t11, @NonNull String str) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(str);
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m95504b(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static <T extends Collection<Y>, Y> T m95505c(@NonNull T t11) {
        if (!t11.isEmpty()) {
            return t11;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }
}
