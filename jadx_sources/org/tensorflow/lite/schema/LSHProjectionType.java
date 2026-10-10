package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class LSHProjectionType {
    public static final byte DENSE = 2;
    public static final byte SPARSE = 1;
    public static final byte UNKNOWN = 0;
    public static final String[] names = {"UNKNOWN", "SPARSE", "DENSE"};

    public static String name(int i11) {
        return names[i11];
    }

    private LSHProjectionType() {
    }
}
