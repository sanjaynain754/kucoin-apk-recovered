package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CumsumOptions extends Table {

    public static final class Vector extends BaseVector {
        public CumsumOptions get(int i11) {
            return get(new CumsumOptions(), i11);
        }

        public CumsumOptions get(CumsumOptions cumsumOptions, int i11) {
            return cumsumOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addExclusive(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static void addReverse(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static int createCumsumOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, boolean z12) {
        flatBufferBuilder.startTable(2);
        addReverse(flatBufferBuilder, z12);
        addExclusive(flatBufferBuilder, z11);
        return endCumsumOptions(flatBufferBuilder);
    }

    public static CumsumOptions getRootAsCumsumOptions(ByteBuffer byteBuffer) {
        return getRootAsCumsumOptions(byteBuffer, new CumsumOptions());
    }

    public static void startCumsumOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public boolean exclusive() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean reverse() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static CumsumOptions getRootAsCumsumOptions(ByteBuffer byteBuffer, CumsumOptions cumsumOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return cumsumOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CumsumOptionsT cumsumOptionsT) {
        if (cumsumOptionsT == null) {
            return 0;
        }
        return createCumsumOptions(flatBufferBuilder, cumsumOptionsT.getExclusive(), cumsumOptionsT.getReverse());
    }

    public CumsumOptionsT unpack() {
        CumsumOptionsT cumsumOptionsT = new CumsumOptionsT();
        unpackTo(cumsumOptionsT);
        return cumsumOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCumsumOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CumsumOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CumsumOptionsT cumsumOptionsT) {
        cumsumOptionsT.setExclusive(exclusive());
        cumsumOptionsT.setReverse(reverse());
    }
}
