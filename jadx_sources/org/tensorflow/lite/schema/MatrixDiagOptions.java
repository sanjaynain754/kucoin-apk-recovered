package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class MatrixDiagOptions extends Table {

    public static final class Vector extends BaseVector {
        public MatrixDiagOptions get(int i11) {
            return get(new MatrixDiagOptions(), i11);
        }

        public MatrixDiagOptions get(MatrixDiagOptions matrixDiagOptions, int i11) {
            return matrixDiagOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static MatrixDiagOptions getRootAsMatrixDiagOptions(ByteBuffer byteBuffer) {
        return getRootAsMatrixDiagOptions(byteBuffer, new MatrixDiagOptions());
    }

    public static void startMatrixDiagOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static MatrixDiagOptions getRootAsMatrixDiagOptions(ByteBuffer byteBuffer, MatrixDiagOptions matrixDiagOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return matrixDiagOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MatrixDiagOptionsT matrixDiagOptionsT) {
        if (matrixDiagOptionsT == null) {
            return 0;
        }
        startMatrixDiagOptions(flatBufferBuilder);
        return endMatrixDiagOptions(flatBufferBuilder);
    }

    public MatrixDiagOptionsT unpack() {
        MatrixDiagOptionsT matrixDiagOptionsT = new MatrixDiagOptionsT();
        unpackTo(matrixDiagOptionsT);
        return matrixDiagOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMatrixDiagOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MatrixDiagOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MatrixDiagOptionsT matrixDiagOptionsT) {
    }
}
