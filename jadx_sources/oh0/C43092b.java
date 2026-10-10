package oh0;

import java.util.Locale;

/* JADX INFO: renamed from: oh0.b */
/* JADX INFO: compiled from: Normalizer.java */
/* JADX INFO: loaded from: classes61.dex */
public final class C43092b {
    /* JADX INFO: renamed from: a */
    public static String m94679a(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: c */
    public static String m94681c(String str, boolean z11) {
        return z11 ? m94679a(str) : m94680b(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m94680b(String str) {
        return m94679a(str).trim();
    }
}
