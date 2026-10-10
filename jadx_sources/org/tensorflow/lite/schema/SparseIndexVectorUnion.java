package org.tensorflow.lite.schema;

import com.google.flatbuffers.FlatBufferBuilder;

/* JADX INFO: loaded from: classes61.dex */
public class SparseIndexVectorUnion {
    private byte type = 0;
    private Object value = null;

    public static int pack(FlatBufferBuilder flatBufferBuilder, SparseIndexVectorUnion sparseIndexVectorUnion) {
        byte b11 = sparseIndexVectorUnion.type;
        if (b11 == 1) {
            return Int32Vector.pack(flatBufferBuilder, sparseIndexVectorUnion.asInt32Vector());
        }
        if (b11 == 2) {
            return Uint16Vector.pack(flatBufferBuilder, sparseIndexVectorUnion.asUint16Vector());
        }
        if (b11 != 3) {
            return 0;
        }
        return Uint8Vector.pack(flatBufferBuilder, sparseIndexVectorUnion.asUint8Vector());
    }

    public Int32VectorT asInt32Vector() {
        return (Int32VectorT) this.value;
    }

    public Uint16VectorT asUint16Vector() {
        return (Uint16VectorT) this.value;
    }

    public Uint8VectorT asUint8Vector() {
        return (Uint8VectorT) this.value;
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
