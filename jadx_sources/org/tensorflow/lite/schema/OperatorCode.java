package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class OperatorCode extends Table {

    public static final class Vector extends BaseVector {
        public OperatorCode get(int i11) {
            return get(new OperatorCode(), i11);
        }

        public OperatorCode get(OperatorCode operatorCode, int i11) {
            return operatorCode.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBuiltinCode(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(3, i11, 0);
    }

    public static void addCustomCode(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addDeprecatedBuiltinCode(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(2, i11, 1);
    }

    public static int createOperatorCode(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, int i12, int i13) {
        flatBufferBuilder.startTable(4);
        addBuiltinCode(flatBufferBuilder, i13);
        addVersion(flatBufferBuilder, i12);
        addCustomCode(flatBufferBuilder, i11);
        addDeprecatedBuiltinCode(flatBufferBuilder, b11);
        return endOperatorCode(flatBufferBuilder);
    }

    public static OperatorCode getRootAsOperatorCode(ByteBuffer byteBuffer) {
        return getRootAsOperatorCode(byteBuffer, new OperatorCode());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, OperatorCodeT operatorCodeT) {
        if (operatorCodeT == null) {
            return 0;
        }
        return createOperatorCode(flatBufferBuilder, operatorCodeT.getDeprecatedBuiltinCode(), operatorCodeT.getCustomCode() != null ? flatBufferBuilder.createString(operatorCodeT.getCustomCode()) : 0, operatorCodeT.getVersion(), operatorCodeT.getBuiltinCode());
    }

    public static void startOperatorCode(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(4);
    }

    public String customCode() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer customCodeAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer customCodeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public byte deprecatedBuiltinCode() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static OperatorCode getRootAsOperatorCode(ByteBuffer byteBuffer, OperatorCode operatorCode) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return operatorCode.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public int builtinCode() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public OperatorCodeT unpack() {
        OperatorCodeT operatorCodeT = new OperatorCodeT();
        unpackTo(operatorCodeT);
        return operatorCodeT;
    }

    public int version() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 1;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endOperatorCode(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public OperatorCode __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(OperatorCodeT operatorCodeT) {
        operatorCodeT.setDeprecatedBuiltinCode(deprecatedBuiltinCode());
        operatorCodeT.setCustomCode(customCode());
        operatorCodeT.setVersion(version());
        operatorCodeT.setBuiltinCode(builtinCode());
    }
}
