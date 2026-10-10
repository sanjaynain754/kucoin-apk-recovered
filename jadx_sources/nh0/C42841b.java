package nh0;

/* JADX INFO: renamed from: nh0.b */
/* JADX INFO: compiled from: Validate.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C42841b {
    /* JADX INFO: renamed from: f */
    public static void m93954f(Object[] objArr, String str) {
        for (Object obj : objArr) {
            if (obj == null) {
                throw new IllegalArgumentException(str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m93949a(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m93950b(boolean z11) {
        if (z11) {
            throw new IllegalArgumentException("Must be false");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m93951c(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException("Must be true");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m93952d(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m93953e(Object[] objArr) {
        m93954f(objArr, "Array must not contain any null objects");
    }

    /* JADX INFO: renamed from: g */
    public static void m93955g(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("String must not be empty");
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m93956h(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m93957i(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m93958j(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
