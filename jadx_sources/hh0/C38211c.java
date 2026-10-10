package hh0;

/* JADX INFO: renamed from: hh0.c */
/* JADX INFO: compiled from: LinkScanner.java */
/* JADX INFO: loaded from: classes61.dex */
public class C38211c {
    /* JADX INFO: renamed from: b */
    public static int m86212b(CharSequence charSequence, int i11) {
        int i12 = 0;
        int i13 = i11;
        while (i13 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != 0 && cCharAt != ' ') {
                if (cCharAt == '\\') {
                    int i14 = i13 + 1;
                    if (C38212d.m86222g(charSequence, i14)) {
                        i13 = i14;
                    }
                } else if (cCharAt == '(') {
                    i12++;
                    if (i12 > 32) {
                        return -1;
                    }
                } else if (cCharAt != ')') {
                    if (Character.isISOControl(cCharAt)) {
                        if (i13 == i11) {
                            return -1;
                        }
                    }
                } else if (i12 != 0) {
                    i12--;
                }
                i13++;
            } else if (i13 == i11) {
                return -1;
            }
            return i13;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: a */
    public static int m86211a(CharSequence charSequence, int i11) {
        char cCharAt;
        if (i11 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i11) == '<') {
            while (true) {
                i11++;
                if (i11 >= charSequence.length() || (cCharAt = charSequence.charAt(i11)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt != '>') {
                    if (cCharAt == '\\') {
                        int i12 = i11 + 1;
                        if (C38212d.m86222g(charSequence, i12)) {
                            i11 = i12;
                        }
                    }
                } else {
                    return i11 + 1;
                }
            }
            return -1;
        }
        return m86212b(charSequence, i11);
    }

    /* JADX INFO: renamed from: c */
    public static int m86213c(CharSequence charSequence, int i11) {
        while (i11 < charSequence.length()) {
            switch (charSequence.charAt(i11)) {
                case '[':
                    return -1;
                case '\\':
                    int i12 = i11 + 1;
                    if (C38212d.m86222g(charSequence, i12)) {
                        i11 = i12;
                    }
                    break;
                case ']':
                    return i11;
            }
            i11++;
        }
        return charSequence.length();
    }

    /* JADX INFO: renamed from: d */
    public static int m86214d(CharSequence charSequence, int i11) {
        if (i11 >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i11);
        char c11 = '\"';
        if (cCharAt != '\"') {
            c11 = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c11 = ')';
            }
        }
        int iM86215e = m86215e(charSequence, i11 + 1, c11);
        if (iM86215e == -1 || iM86215e >= charSequence.length() || charSequence.charAt(iM86215e) != c11) {
            return -1;
        }
        return iM86215e + 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    /* JADX INFO: renamed from: e */
    public static int m86215e(CharSequence charSequence, int i11, char c11) {
        while (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == '\\') {
                int i12 = i11 + 1;
                if (C38212d.m86222g(charSequence, i12)) {
                    i11 = i12;
                } else {
                    if (cCharAt == c11) {
                        return i11;
                    }
                    if (c11 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c11) {
                    return i11;
                }
                if (c11 == ')') {
                    continue;
                }
            }
            i11++;
        }
        return charSequence.length();
    }
}
