package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class AssignVariableOptions extends Table {

    public static final class Vector extends BaseVector {
        public AssignVariableOptions get(int i11) {
            return get(new AssignVariableOptions(), i11);
        }

        public AssignVariableOptions get(AssignVariableOptions assignVariableOptions, int i11) {
            return assignVariableOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static AssignVariableOptions getRootAsAssignVariableOptions(ByteBuffer byteBuffer) {
        return getRootAsAssignVariableOptions(byteBuffer, new AssignVariableOptions());
    }

    public static void startAssignVariableOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static AssignVariableOptions getRootAsAssignVariableOptions(ByteBuffer byteBuffer, AssignVariableOptions assignVariableOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return assignVariableOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, AssignVariableOptionsT assignVariableOptionsT) {
        if (assignVariableOptionsT == null) {
            return 0;
        }
        startAssignVariableOptions(flatBufferBuilder);
        return endAssignVariableOptions(flatBufferBuilder);
    }

    public AssignVariableOptionsT unpack() {
        AssignVariableOptionsT assignVariableOptionsT = new AssignVariableOptionsT();
        unpackTo(assignVariableOptionsT);
        return assignVariableOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endAssignVariableOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public AssignVariableOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(AssignVariableOptionsT assignVariableOptionsT) {
    }
}
