package org.tensorflow.lite.support.metadata;

/* JADX INFO: loaded from: classes61.dex */
final class Preconditions {
    public static void checkArgument(boolean z11) {
        if (!z11) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkElementIndex(int i11, int i12) {
        return checkElementIndex(i11, i12, "index");
    }

    public static String checkNotEmpty(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Given String is empty or null.");
        }
        return str;
    }

    public static <T> T checkNotNull(T t11) {
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("The object reference is null.");
    }

    public static void checkState(boolean z11) {
        if (!z11) {
            throw new IllegalStateException();
        }
    }

    private static String badElementIndex(int i11, int i12, String str) {
        if (i11 < 0) {
            return String.format("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return String.format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        throw new IllegalArgumentException("negative size: " + i12);
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

    public static void checkState(boolean z11, Object obj) {
        if (!z11) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    private Preconditions() {
        throw new AssertionError("Preconditions is Uninstantiable.");
    }

    public static String checkNotEmpty(String str, Object obj) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }
}
