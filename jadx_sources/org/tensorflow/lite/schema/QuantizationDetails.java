package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class QuantizationDetails {
    public static final byte CustomQuantization = 1;
    public static final byte NONE = 0;
    public static final String[] names = {"NONE", "CustomQuantization"};

    public static String name(int i11) {
        return names[i11];
    }

    private QuantizationDetails() {
    }
}
