package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class CombinerType {
    public static final byte MEAN = 1;
    public static final byte SQRTN = 2;
    public static final byte SUM = 0;
    public static final String[] names = {"SUM", "MEAN", "SQRTN"};

    public static String name(int i11) {
        return names[i11];
    }

    private CombinerType() {
    }
}
