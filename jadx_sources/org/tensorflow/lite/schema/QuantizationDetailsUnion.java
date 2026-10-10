package org.tensorflow.lite.schema;

import com.google.flatbuffers.FlatBufferBuilder;

/* JADX INFO: loaded from: classes61.dex */
public class QuantizationDetailsUnion {
    private byte type = 0;
    private Object value = null;

    public static int pack(FlatBufferBuilder flatBufferBuilder, QuantizationDetailsUnion quantizationDetailsUnion) {
        if (quantizationDetailsUnion.type != 1) {
            return 0;
        }
        return CustomQuantization.pack(flatBufferBuilder, quantizationDetailsUnion.asCustomQuantization());
    }

    public CustomQuantizationT asCustomQuantization() {
        return (CustomQuantizationT) this.value;
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
