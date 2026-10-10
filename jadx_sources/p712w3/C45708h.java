package p712w3;

/* JADX INFO: renamed from: w3.h */
/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45708h {
    /* JADX INFO: renamed from: a */
    public static String m100890a(int i11, int i12, String str) {
        if (i11 < 0) {
            return m100900k("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return m100900k("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
    }

    /* JADX INFO: renamed from: b */
    public static void m100891b(Boolean bool) {
        if (bool != null && !bool.booleanValue()) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m100892c(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m100893d(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(m100900k(str, objArr));
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m100894e(int i11, int i12) {
        return m100895f(i11, i12, "index");
    }

    /* JADX INFO: renamed from: f */
    public static int m100895f(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(m100890a(i11, i12, str));
        }
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public static <T> T m100897h(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: i */
    public static void m100898i(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m100899j(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m100896g(T t11) {
        t11.getClass();
        return t11;
    }

    /* JADX INFO: renamed from: k */
    public static String m100900k(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i11 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i12)) != -1) {
            sb2.append(strValueOf.substring(i12, iIndexOf));
            sb2.append(objArr[i11]);
            i12 = iIndexOf + 2;
            i11++;
        }
        sb2.append(strValueOf.substring(i12));
        if (i11 < objArr.length) {
            sb2.append(" [");
            sb2.append(objArr[i11]);
            for (int i13 = i11 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
