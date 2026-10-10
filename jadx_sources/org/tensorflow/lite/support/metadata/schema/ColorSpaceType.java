package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class ColorSpaceType {
    public static final byte GRAYSCALE = 2;
    public static final byte RGB = 1;
    public static final byte UNKNOWN = 0;
    public static final String[] names = {"UNKNOWN", "RGB", "GRAYSCALE"};

    public static String name(int i11) {
        return names[i11];
    }

    private ColorSpaceType() {
    }
}
