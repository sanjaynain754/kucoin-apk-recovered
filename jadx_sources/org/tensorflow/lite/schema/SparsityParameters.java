package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SparsityParameters extends Table {

    public static final class Vector extends BaseVector {
        public SparsityParameters get(int i11) {
            return get(new SparsityParameters(), i11);
        }

        public SparsityParameters get(SparsityParameters sparsityParameters, int i11) {
            return sparsityParameters.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBlockMap(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addDimMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addTraversalOrder(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createBlockMapVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createDimMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSparsityParameters(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13) {
        flatBufferBuilder.startTable(3);
        addDimMetadata(flatBufferBuilder, i13);
        addBlockMap(flatBufferBuilder, i12);
        addTraversalOrder(flatBufferBuilder, i11);
        return endSparsityParameters(flatBufferBuilder);
    }

    public static int createTraversalOrderVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static SparsityParameters getRootAsSparsityParameters(ByteBuffer byteBuffer) {
        return getRootAsSparsityParameters(byteBuffer, new SparsityParameters());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SparsityParametersT sparsityParametersT) {
        int iCreateDimMetadataVector = 0;
        if (sparsityParametersT == null) {
            return 0;
        }
        int iCreateTraversalOrderVector = sparsityParametersT.getTraversalOrder() != null ? createTraversalOrderVector(flatBufferBuilder, sparsityParametersT.getTraversalOrder()) : 0;
        int iCreateBlockMapVector = sparsityParametersT.getBlockMap() != null ? createBlockMapVector(flatBufferBuilder, sparsityParametersT.getBlockMap()) : 0;
        if (sparsityParametersT.getDimMetadata() != null) {
            int[] iArr = new int[sparsityParametersT.getDimMetadata().length];
            DimensionMetadataT[] dimMetadata = sparsityParametersT.getDimMetadata();
            int length = dimMetadata.length;
            int i11 = 0;
            while (iCreateDimMetadataVector < length) {
                iArr[i11] = DimensionMetadata.pack(flatBufferBuilder, dimMetadata[iCreateDimMetadataVector]);
                i11++;
                iCreateDimMetadataVector++;
            }
            iCreateDimMetadataVector = createDimMetadataVector(flatBufferBuilder, iArr);
        }
        return createSparsityParameters(flatBufferBuilder, iCreateTraversalOrderVector, iCreateBlockMapVector, iCreateDimMetadataVector);
    }

    public static void startBlockMapVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startDimMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSparsityParameters(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(3);
    }

    public static void startTraversalOrderVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public int blockMap(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer blockMapAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer blockMapInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int blockMapLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector blockMapVector() {
        return blockMapVector(new IntVector());
    }

    public DimensionMetadata dimMetadata(int i11) {
        return dimMetadata(new DimensionMetadata(), i11);
    }

    public DimensionMetadata.Vector dimMetadataVector() {
        return dimMetadataVector(new DimensionMetadata.Vector());
    }

    public int traversalOrder(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer traversalOrderAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer traversalOrderInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int traversalOrderLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector traversalOrderVector() {
        return traversalOrderVector(new IntVector());
    }

    public static SparsityParameters getRootAsSparsityParameters(ByteBuffer byteBuffer, SparsityParameters sparsityParameters) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sparsityParameters.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector blockMapVector(IntVector intVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public DimensionMetadata dimMetadata(DimensionMetadata dimensionMetadata, int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return dimensionMetadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int dimMetadataLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public DimensionMetadata.Vector dimMetadataVector(DimensionMetadata.Vector vector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public IntVector traversalOrderVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public SparsityParametersT unpack() {
        SparsityParametersT sparsityParametersT = new SparsityParametersT();
        unpackTo(sparsityParametersT);
        return sparsityParametersT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSparsityParameters(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SparsityParameters __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SparsityParametersT sparsityParametersT) {
        DimensionMetadataT dimensionMetadataTUnpack;
        int[] iArr = new int[traversalOrderLength()];
        for (int i11 = 0; i11 < traversalOrderLength(); i11++) {
            iArr[i11] = traversalOrder(i11);
        }
        sparsityParametersT.setTraversalOrder(iArr);
        int[] iArr2 = new int[blockMapLength()];
        for (int i12 = 0; i12 < blockMapLength(); i12++) {
            iArr2[i12] = blockMap(i12);
        }
        sparsityParametersT.setBlockMap(iArr2);
        DimensionMetadataT[] dimensionMetadataTArr = new DimensionMetadataT[dimMetadataLength()];
        for (int i13 = 0; i13 < dimMetadataLength(); i13++) {
            if (dimMetadata(i13) != null) {
                dimensionMetadataTUnpack = dimMetadata(i13).unpack();
            } else {
                dimensionMetadataTUnpack = null;
            }
            dimensionMetadataTArr[i13] = dimensionMetadataTUnpack;
        }
        sparsityParametersT.setDimMetadata(dimensionMetadataTArr);
    }
}
