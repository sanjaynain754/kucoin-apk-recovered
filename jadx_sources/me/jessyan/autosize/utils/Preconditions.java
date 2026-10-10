package me.jessyan.autosize.utils;

/* JADX INFO: loaded from: classes23.dex */
public final class Preconditions {
    public static void checkArgument(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i11, int i12) {
        return checkElementIndex(i11, i12, "index");
    }

    public static <T> T checkNotNull(T t11) {
        t11.getClass();
        return t11;
    }

    public static int checkPositionIndex(int i11, int i12) {
        return checkPositionIndex(i11, i12, "index");
    }

    public static void checkState(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    private static String badElementIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String badPositionIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i12);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static String badPositionIndexes(int i11, int i12, int i13) {
        if (i11 < 0 || i11 > i13) {
            return badPositionIndex(i11, i13, "start index");
        }
        return (i12 < 0 || i12 > i13) ? badPositionIndex(i12, i13, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public static void checkArgument(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int checkElementIndex(int i11, int i12, String str) {
        if (i11 < 0 || i11 >= i12) {
            throw new IndexOutOfBoundsException(badElementIndex(i11, i12, str));
        }
        return i11;
    }

    public static <T> T checkNotNull(T t11, Object obj) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int checkPositionIndex(int i11, int i12, String str) {
        if (i11 < 0 || i11 > i12) {
            throw new IndexOutOfBoundsException(badPositionIndex(i11, i12, str));
        }
        return i11;
    }

    public static void checkPositionIndexes(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException(badPositionIndexes(i11, i12, i13));
        }
    }

    public static void checkState(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private Preconditions() {
        throw new IllegalStateException("you can't instantiate me!");
    }

    public static void checkArgument(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalArgumentException(format(str, objArr));
        }
    }

    public static <T> T checkNotNull(T t11, String str, Object... objArr) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException(format(str, objArr));
    }

    public static void checkState(boolean z11, String str, Object... objArr) {
        if (!z11) {
            throw new IllegalStateException(format(str, objArr));
        }
    }

    public static String format(String str, Object... objArr) {
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
