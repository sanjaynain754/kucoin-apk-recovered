package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class LeakyReluOptions extends Table {

    public static final class Vector extends BaseVector {
        public LeakyReluOptions get(int i11) {
            return get(new LeakyReluOptions(), i11);
        }

        public LeakyReluOptions get(LeakyReluOptions leakyReluOptions, int i11) {
            return leakyReluOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAlpha(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.addFloat(0, f11, 0.0d);
    }

    public static int createLeakyReluOptions(FlatBufferBuilder flatBufferBuilder, float f11) {
        flatBufferBuilder.startTable(1);
        addAlpha(flatBufferBuilder, f11);
        return endLeakyReluOptions(flatBufferBuilder);
    }

    public static LeakyReluOptions getRootAsLeakyReluOptions(ByteBuffer byteBuffer) {
        return getRootAsLeakyReluOptions(byteBuffer, new LeakyReluOptions());
    }

    public static void startLeakyReluOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public float alpha() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getFloat(i__offset + this.bb_pos);
        }
        return 0.0f;
    }

    public static LeakyReluOptions getRootAsLeakyReluOptions(ByteBuffer byteBuffer, LeakyReluOptions leakyReluOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return leakyReluOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, LeakyReluOptionsT leakyReluOptionsT) {
        if (leakyReluOptionsT == null) {
            return 0;
        }
        return createLeakyReluOptions(flatBufferBuilder, leakyReluOptionsT.getAlpha());
    }

    public LeakyReluOptionsT unpack() {
        LeakyReluOptionsT leakyReluOptionsT = new LeakyReluOptionsT();
        unpackTo(leakyReluOptionsT);
        return leakyReluOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endLeakyReluOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public LeakyReluOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(LeakyReluOptionsT leakyReluOptionsT) {
        leakyReluOptionsT.setAlpha(alpha());
    }
}
