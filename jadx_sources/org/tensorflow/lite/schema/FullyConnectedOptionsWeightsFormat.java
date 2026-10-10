package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class FullyConnectedOptionsWeightsFormat {
    public static final byte DEFAULT = 0;
    public static final byte SHUFFLED4x16INT8 = 1;
    public static final String[] names = {"DEFAULT", "SHUFFLED4x16INT8"};

    public static String name(int i11) {
        return names[i11];
    }

    private FullyConnectedOptionsWeightsFormat() {
    }
}
