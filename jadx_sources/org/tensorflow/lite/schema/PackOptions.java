package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class PackOptions extends Table {

    public static final class Vector extends BaseVector {
        public PackOptions get(int i11) {
            return get(new PackOptions(), i11);
        }

        public PackOptions get(PackOptions packOptions, int i11) {
            return packOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAxis(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addValuesCount(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(0, i11, 0);
    }

    public static int createPackOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addAxis(flatBufferBuilder, i12);
        addValuesCount(flatBufferBuilder, i11);
        return endPackOptions(flatBufferBuilder);
    }

    public static PackOptions getRootAsPackOptions(ByteBuffer byteBuffer) {
        return getRootAsPackOptions(byteBuffer, new PackOptions());
    }

    public static void startPackOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public int axis() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public int valuesCount() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public static PackOptions getRootAsPackOptions(ByteBuffer byteBuffer, PackOptions packOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return packOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, PackOptionsT packOptionsT) {
        if (packOptionsT == null) {
            return 0;
        }
        return createPackOptions(flatBufferBuilder, packOptionsT.getValuesCount(), packOptionsT.getAxis());
    }

    public PackOptionsT unpack() {
        PackOptionsT packOptionsT = new PackOptionsT();
        unpackTo(packOptionsT);
        return packOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endPackOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public PackOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(PackOptionsT packOptionsT) {
        packOptionsT.setValuesCount(valuesCount());
        packOptionsT.setAxis(axis());
    }
}
