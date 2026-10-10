package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class ScoreTransformationType {
    public static final byte IDENTITY = 0;
    public static final byte INVERSE_LOGISTIC = 2;
    public static final byte LOG = 1;
    public static final String[] names = {"IDENTITY", "LOG", "INVERSE_LOGISTIC"};

    public static String name(int i11) {
        return names[i11];
    }

    private ScoreTransformationType() {
    }
}
