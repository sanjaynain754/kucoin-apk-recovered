package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BatchMatMulOptions extends Table {

    public static final class Vector extends BaseVector {
        public BatchMatMulOptions get(int i11) {
            return get(new BatchMatMulOptions(), i11);
        }

        public BatchMatMulOptions get(BatchMatMulOptions batchMatMulOptions, int i11) {
            return batchMatMulOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAdjX(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(0, z11, false);
    }

    public static void addAdjY(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(1, z11, false);
    }

    public static void addAsymmetricQuantizeInputs(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(2, z11, false);
    }

    public static int createBatchMatMulOptions(FlatBufferBuilder flatBufferBuilder, boolean z11, boolean z12, boolean z13) {
        flatBufferBuilder.startTable(3);
        addAsymmetricQuantizeInputs(flatBufferBuilder, z13);
        addAdjY(flatBufferBuilder, z12);
        addAdjX(flatBufferBuilder, z11);
        return endBatchMatMulOptions(flatBufferBuilder);
    }

    public static BatchMatMulOptions getRootAsBatchMatMulOptions(ByteBuffer byteBuffer) {
        return getRootAsBatchMatMulOptions(byteBuffer, new BatchMatMulOptions());
    }

    public static void startBatchMatMulOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public boolean adjX() {
        int i__offset = __offset(4);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean adjY() {
        int i__offset = __offset(6);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public static BatchMatMulOptions getRootAsBatchMatMulOptions(ByteBuffer byteBuffer, BatchMatMulOptions batchMatMulOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return batchMatMulOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BatchMatMulOptionsT batchMatMulOptionsT) {
        if (batchMatMulOptionsT == null) {
            return 0;
        }
        return createBatchMatMulOptions(flatBufferBuilder, batchMatMulOptionsT.getAdjX(), batchMatMulOptionsT.getAdjY(), batchMatMulOptionsT.getAsymmetricQuantizeInputs());
    }

    public boolean asymmetricQuantizeInputs() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public BatchMatMulOptionsT unpack() {
        BatchMatMulOptionsT batchMatMulOptionsT = new BatchMatMulOptionsT();
        unpackTo(batchMatMulOptionsT);
        return batchMatMulOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBatchMatMulOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BatchMatMulOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BatchMatMulOptionsT batchMatMulOptionsT) {
        batchMatMulOptionsT.setAdjX(adjX());
        batchMatMulOptionsT.setAdjY(adjY());
        batchMatMulOptionsT.setAsymmetricQuantizeInputs(asymmetricQuantizeInputs());
    }
}
