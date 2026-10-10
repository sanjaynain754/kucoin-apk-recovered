package hf0;

/* JADX INFO: renamed from: hf0.b */
/* JADX INFO: compiled from: Validate.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C38193b {
    /* JADX INFO: renamed from: a */
    public static void m86176a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m86177b(boolean z11) {
        if (z11) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m86178c(boolean z11, String str) {
        if (z11) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m86179d(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m86180e(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m86181f(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }
}
