package re0;

/* JADX INFO: renamed from: re0.b */
/* JADX INFO: compiled from: Preconditions.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C43996b {
    /* JADX INFO: renamed from: a */
    public static <T> void m96962a(T t11, Class<T> cls) {
        if (t11 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m96964c(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m96963b(T t11) {
        t11.getClass();
        return t11;
    }
}
