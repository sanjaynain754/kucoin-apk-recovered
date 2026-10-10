package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RandomOptions extends Table {

    public static final class Vector extends BaseVector {
        public RandomOptions get(int i11) {
            return get(new RandomOptions(), i11);
        }

        public RandomOptions get(RandomOptions randomOptions, int i11) {
            return randomOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addSeed(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addLong(0, j11, 0L);
    }

    public static void addSeed2(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addLong(1, j11, 0L);
    }

    public static int createRandomOptions(FlatBufferBuilder flatBufferBuilder, long j11, long j12) {
        flatBufferBuilder.startTable(2);
        addSeed2(flatBufferBuilder, j12);
        addSeed(flatBufferBuilder, j11);
        return endRandomOptions(flatBufferBuilder);
    }

    public static RandomOptions getRootAsRandomOptions(ByteBuffer byteBuffer) {
        return getRootAsRandomOptions(byteBuffer, new RandomOptions());
    }

    public static void startRandomOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public long seed() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public long seed2() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getLong(i__offset + this.bb_pos);
        }
        return 0L;
    }

    public static RandomOptions getRootAsRandomOptions(ByteBuffer byteBuffer, RandomOptions randomOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return randomOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RandomOptionsT randomOptionsT) {
        if (randomOptionsT == null) {
            return 0;
        }
        return createRandomOptions(flatBufferBuilder, randomOptionsT.getSeed(), randomOptionsT.getSeed2());
    }

    public RandomOptionsT unpack() {
        RandomOptionsT randomOptionsT = new RandomOptionsT();
        unpackTo(randomOptionsT);
        return randomOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endRandomOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RandomOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RandomOptionsT randomOptionsT) {
        randomOptionsT.setSeed(seed());
        randomOptionsT.setSeed2(seed2());
    }
}
