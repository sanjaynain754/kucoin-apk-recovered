package p302h6;

/* JADX INFO: renamed from: h6.a */
/* JADX INFO: compiled from: Assertions.java */
/* JADX INFO: loaded from: classes34.dex */
public class C38115a {
    /* JADX INFO: renamed from: a */
    public static void m86045a(boolean z11) {
        if (!z11) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86046b(boolean z11, String str) {
        if (!z11) {
            throw new AssertionError(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m86047c(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m86048d(T t11, String str) {
        if (t11 != null) {
            return t11;
        }
        throw new AssertionError(str);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m86049e(T t11) {
        return t11;
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m86050f(T t11, String str) {
        return t11;
    }
}
