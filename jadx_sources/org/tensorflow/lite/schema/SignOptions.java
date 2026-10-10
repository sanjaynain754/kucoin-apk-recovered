package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SignOptions extends Table {

    public static final class Vector extends BaseVector {
        public SignOptions get(int i11) {
            return get(new SignOptions(), i11);
        }

        public SignOptions get(SignOptions signOptions, int i11) {
            return signOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static SignOptions getRootAsSignOptions(ByteBuffer byteBuffer) {
        return getRootAsSignOptions(byteBuffer, new SignOptions());
    }

    public static void startSignOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static SignOptions getRootAsSignOptions(ByteBuffer byteBuffer, SignOptions signOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return signOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SignOptionsT signOptionsT) {
        if (signOptionsT == null) {
            return 0;
        }
        startSignOptions(flatBufferBuilder);
        return endSignOptions(flatBufferBuilder);
    }

    public SignOptionsT unpack() {
        SignOptionsT signOptionsT = new SignOptionsT();
        unpackTo(signOptionsT);
        return signOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSignOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SignOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SignOptionsT signOptionsT) {
    }
}
