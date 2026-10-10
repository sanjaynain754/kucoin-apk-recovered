package org.tensorflow.lite.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class MirrorPadMode {
    public static final byte REFLECT = 0;
    public static final byte SYMMETRIC = 1;
    public static final String[] names = {"REFLECT", "SYMMETRIC"};

    public static String name(int i11) {
        return names[i11];
    }

    private MirrorPadMode() {
    }
}
