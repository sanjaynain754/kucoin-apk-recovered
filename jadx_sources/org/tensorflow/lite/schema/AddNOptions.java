package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class AddNOptions extends Table {

    public static final class Vector extends BaseVector {
        public AddNOptions get(int i11) {
            return get(new AddNOptions(), i11);
        }

        public AddNOptions get(AddNOptions addNOptions, int i11) {
            return addNOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static AddNOptions getRootAsAddNOptions(ByteBuffer byteBuffer) {
        return getRootAsAddNOptions(byteBuffer, new AddNOptions());
    }

    public static void startAddNOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static AddNOptions getRootAsAddNOptions(ByteBuffer byteBuffer, AddNOptions addNOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return addNOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, AddNOptionsT addNOptionsT) {
        if (addNOptionsT == null) {
            return 0;
        }
        startAddNOptions(flatBufferBuilder);
        return endAddNOptions(flatBufferBuilder);
    }

    public AddNOptionsT unpack() {
        AddNOptionsT addNOptionsT = new AddNOptionsT();
        unpackTo(addNOptionsT);
        return addNOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endAddNOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public AddNOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(AddNOptionsT addNOptionsT) {
    }
}
