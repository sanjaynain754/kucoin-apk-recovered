package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SelectOptions extends Table {

    public static final class Vector extends BaseVector {
        public SelectOptions get(int i11) {
            return get(new SelectOptions(), i11);
        }

        public SelectOptions get(SelectOptions selectOptions, int i11) {
            return selectOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SelectOptions getRootAsSelectOptions(ByteBuffer byteBuffer) {
        return getRootAsSelectOptions(byteBuffer, new SelectOptions());
    }

    public static void startSelectOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SelectOptions getRootAsSelectOptions(ByteBuffer byteBuffer, SelectOptions selectOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return selectOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SelectOptionsT selectOptionsT) {
        if (selectOptionsT == null) {
            return 0;
        }
        startSelectOptions(flatBufferBuilder);
        return endSelectOptions(flatBufferBuilder);
    }

    public SelectOptionsT unpack() {
        SelectOptionsT selectOptionsT = new SelectOptionsT();
        unpackTo(selectOptionsT);
        return selectOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSelectOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SelectOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SelectOptionsT selectOptionsT) {
    }
}
