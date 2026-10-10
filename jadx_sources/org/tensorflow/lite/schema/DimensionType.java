package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class DimensionType {
    public static final byte DENSE = 0;
    public static final byte SPARSE_CSR = 1;
    public static final String[] names = {"DENSE", "SPARSE_CSR"};

    public static String name(int i11) {
        return names[i11];
    }

    private DimensionType() {
    }
}
