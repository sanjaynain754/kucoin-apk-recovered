package tf0;

/* JADX INFO: renamed from: tf0.b */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes60.dex */
public final class C44941b {
    /* JADX INFO: renamed from: a */
    public static void m99388a(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m99389b(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: c */
    public static void m99390c(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m99391d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
