package p712w3;

/* JADX INFO: renamed from: w3.m */
/* JADX INFO: compiled from: Throwables.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C45713m {
    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    /* JADX INFO: renamed from: b */
    public static <X extends Throwable> void m100909b(Throwable th2, Class<X> cls) throws Throwable {
        if (th2 != null && cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m100910c(Throwable th2) throws Throwable {
        m100909b(th2, Error.class);
        m100909b(th2, RuntimeException.class);
    }

    /* JADX INFO: renamed from: a */
    public static RuntimeException m100908a(Throwable th2) throws Throwable {
        m100910c((Throwable) C45708h.m100896g(th2));
        throw new RuntimeException(th2);
    }
}
