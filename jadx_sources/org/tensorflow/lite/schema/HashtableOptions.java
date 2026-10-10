package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class HashtableOptions extends Table {

    public static final class Vector extends BaseVector {
        public HashtableOptions get(int i11) {
            return get(new HashtableOptions(), i11);
        }

        public HashtableOptions get(HashtableOptions hashtableOptions, int i11) {
            return hashtableOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addKeyDtype(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static void addTableId(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static void addValueDtype(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(2, b11, 0);
    }

    public static int createHashtableOptions(FlatBufferBuilder flatBufferBuilder, int i11, byte b11, byte b12) {
        flatBufferBuilder.startTable(3);
        addTableId(flatBufferBuilder, i11);
        addValueDtype(flatBufferBuilder, b12);
        addKeyDtype(flatBufferBuilder, b11);
        return endHashtableOptions(flatBufferBuilder);
    }

    public static HashtableOptions getRootAsHashtableOptions(ByteBuffer byteBuffer) {
        return getRootAsHashtableOptions(byteBuffer, new HashtableOptions());
    }

    public static void startHashtableOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public byte keyDtype() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public int tableId() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static HashtableOptions getRootAsHashtableOptions(ByteBuffer byteBuffer, HashtableOptions hashtableOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return hashtableOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, HashtableOptionsT hashtableOptionsT) {
        if (hashtableOptionsT == null) {
            return 0;
        }
        return createHashtableOptions(flatBufferBuilder, hashtableOptionsT.getTableId(), hashtableOptionsT.getKeyDtype(), hashtableOptionsT.getValueDtype());
    }

    public HashtableOptionsT unpack() {
        HashtableOptionsT hashtableOptionsT = new HashtableOptionsT();
        unpackTo(hashtableOptionsT);
        return hashtableOptionsT;
    }

    public byte valueDtype() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endHashtableOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public HashtableOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(HashtableOptionsT hashtableOptionsT) {
        hashtableOptionsT.setTableId(tableId());
        hashtableOptionsT.setKeyDtype(keyDtype());
        hashtableOptionsT.setValueDtype(valueDtype());
    }
}
