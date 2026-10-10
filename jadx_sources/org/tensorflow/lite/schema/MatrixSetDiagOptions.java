package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class MatrixSetDiagOptions extends Table {

    public static final class Vector extends BaseVector {
        public MatrixSetDiagOptions get(int i11) {
            return get(new MatrixSetDiagOptions(), i11);
        }

        public MatrixSetDiagOptions get(MatrixSetDiagOptions matrixSetDiagOptions, int i11) {
            return matrixSetDiagOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static MatrixSetDiagOptions getRootAsMatrixSetDiagOptions(ByteBuffer byteBuffer) {
        return getRootAsMatrixSetDiagOptions(byteBuffer, new MatrixSetDiagOptions());
    }

    public static void startMatrixSetDiagOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(0);
    }

    public static MatrixSetDiagOptions getRootAsMatrixSetDiagOptions(ByteBuffer byteBuffer, MatrixSetDiagOptions matrixSetDiagOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return matrixSetDiagOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, MatrixSetDiagOptionsT matrixSetDiagOptionsT) {
        if (matrixSetDiagOptionsT == null) {
            return 0;
        }
        startMatrixSetDiagOptions(flatBufferBuilder);
        return endMatrixSetDiagOptions(flatBufferBuilder);
    }

    public MatrixSetDiagOptionsT unpack() {
        MatrixSetDiagOptionsT matrixSetDiagOptionsT = new MatrixSetDiagOptionsT();
        unpackTo(matrixSetDiagOptionsT);
        return matrixSetDiagOptionsT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endMatrixSetDiagOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public MatrixSetDiagOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(MatrixSetDiagOptionsT matrixSetDiagOptionsT) {
    }
}
