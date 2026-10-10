package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BatchToSpaceNDOptions extends Table {

    public static final class Vector extends BaseVector {
        public BatchToSpaceNDOptions get(int i11) {
            return get(new BatchToSpaceNDOptions(), i11);
        }

        public BatchToSpaceNDOptions get(BatchToSpaceNDOptions batchToSpaceNDOptions, int i11) {
            return batchToSpaceNDOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static BatchToSpaceNDOptions getRootAsBatchToSpaceNDOptions(ByteBuffer byteBuffer) {
        return getRootAsBatchToSpaceNDOptions(byteBuffer, new BatchToSpaceNDOptions());
    }

    public static void startBatchToSpaceNDOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static BatchToSpaceNDOptions getRootAsBatchToSpaceNDOptions(ByteBuffer byteBuffer, BatchToSpaceNDOptions batchToSpaceNDOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return batchToSpaceNDOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BatchToSpaceNDOptionsT batchToSpaceNDOptionsT) {
        if (batchToSpaceNDOptionsT == null) {
            return 0;
        }
        startBatchToSpaceNDOptions(flatBufferBuilder);
        return endBatchToSpaceNDOptions(flatBufferBuilder);
    }

    public BatchToSpaceNDOptionsT unpack() {
        BatchToSpaceNDOptionsT batchToSpaceNDOptionsT = new BatchToSpaceNDOptionsT();
        unpackTo(batchToSpaceNDOptionsT);
        return batchToSpaceNDOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBatchToSpaceNDOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BatchToSpaceNDOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BatchToSpaceNDOptionsT batchToSpaceNDOptionsT) {
    }
}
