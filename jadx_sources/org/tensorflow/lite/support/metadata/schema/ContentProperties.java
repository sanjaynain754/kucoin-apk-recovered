package org.tensorflow.lite.support.metadata.schema;

/* JADX INFO: loaded from: classes61.dex */
public final class ContentProperties {
    public static final byte AudioProperties = 4;
    public static final byte BoundingBoxProperties = 3;
    public static final byte FeatureProperties = 1;
    public static final byte ImageProperties = 2;
    public static final byte NONE = 0;
    public static final String[] names = {"NONE", "FeatureProperties", "ImageProperties", "BoundingBoxProperties", "AudioProperties"};

    public static String name(int i11) {
        return names[i11];
    }

    private ContentProperties() {
    }
}
