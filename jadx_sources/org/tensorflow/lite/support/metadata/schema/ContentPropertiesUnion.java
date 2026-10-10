package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.FlatBufferBuilder;

/* JADX INFO: loaded from: classes61.dex */
public class ContentPropertiesUnion {
    private byte type = 0;
    private Object value = null;

    public static int pack(FlatBufferBuilder flatBufferBuilder, ContentPropertiesUnion contentPropertiesUnion) {
        byte b11 = contentPropertiesUnion.type;
        if (b11 == 1) {
            return FeatureProperties.pack(flatBufferBuilder, contentPropertiesUnion.asFeatureProperties());
        }
        if (b11 == 2) {
            return ImageProperties.pack(flatBufferBuilder, contentPropertiesUnion.asImageProperties());
        }
        if (b11 == 3) {
            return BoundingBoxProperties.pack(flatBufferBuilder, contentPropertiesUnion.asBoundingBoxProperties());
        }
        if (b11 != 4) {
            return 0;
        }
        return AudioProperties.pack(flatBufferBuilder, contentPropertiesUnion.asAudioProperties());
    }

    public AudioPropertiesT asAudioProperties() {
        return (AudioPropertiesT) this.value;
    }

    public BoundingBoxPropertiesT asBoundingBoxProperties() {
        return (BoundingBoxPropertiesT) this.value;
    }

    public FeaturePropertiesT asFeatureProperties() {
        return (FeaturePropertiesT) this.value;
    }

    public ImagePropertiesT asImageProperties() {
        return (ImagePropertiesT) this.value;
    }

    public byte getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public void setType(byte b11) {
        this.type = b11;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }
}
