package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class GeluOptions extends Table {

    public static final class Vector extends BaseVector {
        public GeluOptions get(int i11) {
            return get(new GeluOptions(), i11);
        }

        public GeluOptions get(GeluOptions geluOptions, int i11) {
            return geluOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addApproximate(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static int createGeluOptions(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.startTable(1);
        addApproximate(flatBufferBuilder, z11);
        return endGeluOptions(flatBufferBuilder);
    }

    public static GeluOptions getRootAsGeluOptions(ByteBuffer byteBuffer) {
        return getRootAsGeluOptions(byteBuffer, new GeluOptions());
    }

    public static void startGeluOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public boolean approximate() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static GeluOptions getRootAsGeluOptions(ByteBuffer byteBuffer, GeluOptions geluOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return geluOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, GeluOptionsT geluOptionsT) {
        if (geluOptionsT == null) {
            return 0;
        }
        return createGeluOptions(flatBufferBuilder, geluOptionsT.getApproximate());
    }

    public GeluOptionsT unpack() {
        GeluOptionsT geluOptionsT = new GeluOptionsT();
        unpackTo(geluOptionsT);
        return geluOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endGeluOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public GeluOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(GeluOptionsT geluOptionsT) {
        geluOptionsT.setApproximate(approximate());
    }
}
