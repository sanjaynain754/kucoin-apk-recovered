package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class Padding {
    public static final byte SAME = 0;
    public static final byte VALID = 1;
    public static final String[] names = {"SAME", "VALID"};

    public static String name(int i11) {
        return names[i11];
    }

    private Padding() {
    }
}
