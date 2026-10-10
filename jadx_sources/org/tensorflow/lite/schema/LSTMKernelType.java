package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class LSTMKernelType {
    public static final byte BASIC = 1;
    public static final byte FULL = 0;
    public static final String[] names = {"FULL", "BASIC"};

    public static String name(int i11) {
        return names[i11];
    }

    private LSTMKernelType() {
    }
}
