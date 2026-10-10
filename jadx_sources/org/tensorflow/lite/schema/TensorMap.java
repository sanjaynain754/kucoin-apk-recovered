package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TensorMap extends Table {

    public static final class Vector extends BaseVector {
        public TensorMap get(int i11) {
            return get(new TensorMap(), i11);
        }

        public TensorMap get(TensorMap tensorMap, int i11) {
            return tensorMap.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addTensorIndex(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(1, (int) j11, 0);
    }

    public static int createTensorMap(FlatBufferBuilder flatBufferBuilder, int i11, long j11) {
        flatBufferBuilder.startTable(2);
        addTensorIndex(flatBufferBuilder, j11);
        addName(flatBufferBuilder, i11);
        return endTensorMap(flatBufferBuilder);
    }

    public static TensorMap getRootAsTensorMap(ByteBuffer byteBuffer) {
        return getRootAsTensorMap(byteBuffer, new TensorMap());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TensorMapT tensorMapT) {
        if (tensorMapT == null) {
            return 0;
        }
        return createTensorMap(flatBufferBuilder, tensorMapT.getName() != null ? flatBufferBuilder.createString(tensorMapT.getName()) : 0, tensorMapT.getTensorIndex());
    }

    public static void startTensorMap(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public String name() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public long tensorIndex() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public static TensorMap getRootAsTensorMap(ByteBuffer byteBuffer, TensorMap tensorMap) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tensorMap.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TensorMapT unpack() {
        TensorMapT tensorMapT = new TensorMapT();
        unpackTo(tensorMapT);
        return tensorMapT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTensorMap(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TensorMap __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TensorMapT tensorMapT) {
        tensorMapT.setName(name());
        tensorMapT.setTensorIndex(tensorIndex());
    }
}
