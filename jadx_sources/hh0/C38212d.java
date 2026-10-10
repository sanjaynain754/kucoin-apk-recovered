package hh0;

import okio.Utf8;

/* JADX INFO: renamed from: hh0.d */
/* JADX INFO: compiled from: Parsing.java */
/* JADX INFO: loaded from: classes61.dex */
public class C38212d {

    /* JADX INFO: renamed from: a */
    public static int f85913a = 4;

    /* JADX INFO: renamed from: f */
    public static boolean m86221f(CharSequence charSequence) {
        return m86219d(charSequence, 0) == -1;
    }

    /* JADX INFO: renamed from: a */
    public static int m86216a(int i11) {
        return 4 - (i11 % 4);
    }

    /* JADX INFO: renamed from: k */
    public static int m86226k(char c11, CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            if (charSequence.charAt(i11) != c11) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: renamed from: l */
    public static int m86227l(char c11, CharSequence charSequence, int i11, int i12) {
        while (i11 >= i12) {
            if (charSequence.charAt(i11) != c11) {
                return i11;
            }
            i11--;
        }
        return i12 - 1;
    }

    /* JADX INFO: renamed from: m */
    public static int m86228m(CharSequence charSequence, int i11, int i12) {
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    /* JADX INFO: renamed from: n */
    public static int m86229n(CharSequence charSequence, int i11, int i12) {
        while (i11 >= i12) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i11;
            }
            i11--;
        }
        return i12 - 1;
    }

    /* JADX INFO: renamed from: b */
    public static int m86217b(char c11, CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            if (charSequence.charAt(i11) == c11) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static int m86218c(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != '\n' && cCharAt != '\r') {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m86219d(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != ' ') {
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i11;
                }
            }
            i11++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86220e(CharSequence charSequence) {
        int length = charSequence.length();
        if (m86226k(' ', charSequence, 0, length) == length) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m86222g(CharSequence charSequence, int i11) {
        if (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            switch (cCharAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (cCharAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (cCharAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (cCharAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m86223h(CharSequence charSequence, int i11) {
        return Character.isLetter(Character.codePointAt(charSequence, i11));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m86224i(CharSequence charSequence, int i11) {
        if (i11 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt == '\t' || cCharAt == ' ') {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m86225j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt != 0) {
                if (sb2 != null) {
                    sb2.append(cCharAt);
                }
            } else {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i11);
                }
                sb2.append(Utf8.REPLACEMENT_CHARACTER);
            }
        }
        if (sb2 != null) {
            return sb2.toString();
        }
        return charSequence;
    }
}
