package oc0;

/* JADX INFO: renamed from: oc0.a */
/* JADX INFO: compiled from: Args.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C43014a {
    /* JADX INFO: renamed from: a */
    public static void m94481a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("[" + str + "] must not be null");
    }

    /* JADX INFO: renamed from: b */
    public static void m94482b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("[" + str2 + "] must not be null or empty!");
        }
    }
}
