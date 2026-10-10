package p359j5;

/* JADX INFO: renamed from: j5.c */
/* JADX INFO: compiled from: IntlTextUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40274c {
    /* JADX INFO: renamed from: e */
    public static boolean m88669e(CharSequence charSequence, int i11, int i12) {
        return m88668d(charSequence, i11, i12, 3, 8);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m88665a(char c11) {
        return c11 >= '0' && c11 <= '9';
    }

    /* JADX INFO: renamed from: b */
    public static boolean m88666b(char c11) {
        if (c11 < 'a' || c11 > 'z') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m88667c(char c11) {
        if (!m88666b(c11) && !m88665a(c11)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m88668d(CharSequence charSequence, int i11, int i12, int i13, int i14) {
        int i15;
        if (i12 >= charSequence.length() || (i15 = (i12 - i11) + 1) < i13 || i15 > i14) {
            return false;
        }
        while (i11 <= i12) {
            if (!m88667c(charSequence.charAt(i11))) {
                return false;
            }
            i11++;
        }
        return true;
    }
}
