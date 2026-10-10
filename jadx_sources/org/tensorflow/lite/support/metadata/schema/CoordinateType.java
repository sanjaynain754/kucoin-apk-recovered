package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class CoordinateType {
    public static final byte PIXEL = 1;
    public static final byte RATIO = 0;
    public static final String[] names = {"RATIO", "PIXEL"};

    public static String name(int i11) {
        return names[i11];
    }

    private CoordinateType() {
    }
}
