package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class DimensionMetadata extends Table {

    public static final class Vector extends BaseVector {
        public DimensionMetadata get(int i11) {
            return get(new DimensionMetadata(), i11);
        }

        public DimensionMetadata get(DimensionMetadata dimensionMetadata, int i11) {
            return dimensionMetadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addArrayIndices(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static void addArrayIndicesType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(4, b11, 0);
    }

    public static void addArraySegments(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addArraySegmentsType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(2, b11, 0);
    }

    public static void addDenseSize(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addInt(1, i11, 0);
    }

    public static void addFormat(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(0, b11, 0);
    }

    public static int createDimensionMetadata(FlatBufferBuilder flatBufferBuilder, byte b11, int i11, byte b12, int i12, byte b13, int i13) {
        flatBufferBuilder.startTable(6);
        addArrayIndices(flatBufferBuilder, i13);
        addArraySegments(flatBufferBuilder, i12);
        addDenseSize(flatBufferBuilder, i11);
        addArrayIndicesType(flatBufferBuilder, b13);
        addArraySegmentsType(flatBufferBuilder, b12);
        addFormat(flatBufferBuilder, b11);
        return endDimensionMetadata(flatBufferBuilder);
    }

    public static DimensionMetadata getRootAsDimensionMetadata(ByteBuffer byteBuffer) {
        return getRootAsDimensionMetadata(byteBuffer, new DimensionMetadata());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, DimensionMetadataT dimensionMetadataT) {
        if (dimensionMetadataT == null) {
            return 0;
        }
        return createDimensionMetadata(flatBufferBuilder, dimensionMetadataT.getFormat(), dimensionMetadataT.getDenseSize(), dimensionMetadataT.getArraySegments() == null ? (byte) 0 : dimensionMetadataT.getArraySegments().getType(), dimensionMetadataT.getArraySegments() == null ? 0 : SparseIndexVectorUnion.pack(flatBufferBuilder, dimensionMetadataT.getArraySegments()), dimensionMetadataT.getArrayIndices() == null ? (byte) 0 : dimensionMetadataT.getArrayIndices().getType(), dimensionMetadataT.getArrayIndices() != null ? SparseIndexVectorUnion.pack(flatBufferBuilder, dimensionMetadataT.getArrayIndices()) : 0);
    }

    public static void startDimensionMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(6);
    }

    public int denseSize() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(i__offset + this.bb_pos);
        }
        return 0;
    }

    public byte format() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public static DimensionMetadata getRootAsDimensionMetadata(ByteBuffer byteBuffer, DimensionMetadata dimensionMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return dimensionMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public Table arrayIndices(Table table) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __union(table, i__offset + this.bb_pos);
        }
        return null;
    }

    public byte arrayIndicesType() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public Table arraySegments(Table table) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __union(table, i__offset + this.bb_pos);
        }
        return null;
    }

    public byte arraySegmentsType() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public DimensionMetadataT unpack() {
        DimensionMetadataT dimensionMetadataT = new DimensionMetadataT();
        unpackTo(dimensionMetadataT);
        return dimensionMetadataT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endDimensionMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public DimensionMetadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(DimensionMetadataT dimensionMetadataT) {
        Int32VectorT int32VectorTUnpack;
        Uint16VectorT uint16VectorTUnpack;
        Uint8VectorT uint8VectorTUnpack;
        dimensionMetadataT.setFormat(format());
        dimensionMetadataT.setDenseSize(denseSize());
        SparseIndexVectorUnion sparseIndexVectorUnion = new SparseIndexVectorUnion();
        byte bArraySegmentsType = arraySegmentsType();
        sparseIndexVectorUnion.setType(bArraySegmentsType);
        Object objUnpack = null;
        if (bArraySegmentsType != 1) {
            if (bArraySegmentsType != 2) {
                if (bArraySegmentsType == 3) {
                    Table tableArraySegments = arraySegments(new Uint8Vector());
                    if (tableArraySegments != null) {
                        uint8VectorTUnpack = ((Uint8Vector) tableArraySegments).unpack();
                    } else {
                        uint8VectorTUnpack = null;
                    }
                    sparseIndexVectorUnion.setValue(uint8VectorTUnpack);
                }
            } else {
                Table tableArraySegments2 = arraySegments(new Uint16Vector());
                if (tableArraySegments2 != null) {
                    uint16VectorTUnpack = ((Uint16Vector) tableArraySegments2).unpack();
                } else {
                    uint16VectorTUnpack = null;
                }
                sparseIndexVectorUnion.setValue(uint16VectorTUnpack);
            }
        } else {
            Table tableArraySegments3 = arraySegments(new Int32Vector());
            if (tableArraySegments3 != null) {
                int32VectorTUnpack = ((Int32Vector) tableArraySegments3).unpack();
            } else {
                int32VectorTUnpack = null;
            }
            sparseIndexVectorUnion.setValue(int32VectorTUnpack);
        }
        dimensionMetadataT.setArraySegments(sparseIndexVectorUnion);
        SparseIndexVectorUnion sparseIndexVectorUnion2 = new SparseIndexVectorUnion();
        byte bArrayIndicesType = arrayIndicesType();
        sparseIndexVectorUnion2.setType(bArrayIndicesType);
        if (bArrayIndicesType != 1) {
            if (bArrayIndicesType != 2) {
                if (bArrayIndicesType == 3) {
                    Table tableArrayIndices = arrayIndices(new Uint8Vector());
                    if (tableArrayIndices != null) {
                        objUnpack = ((Uint8Vector) tableArrayIndices).unpack();
                    }
                    sparseIndexVectorUnion2.setValue(objUnpack);
                }
            } else {
                Table tableArrayIndices2 = arrayIndices(new Uint16Vector());
                if (tableArrayIndices2 != null) {
                    objUnpack = ((Uint16Vector) tableArrayIndices2).unpack();
                }
                sparseIndexVectorUnion2.setValue(objUnpack);
            }
        } else {
            Table tableArrayIndices3 = arrayIndices(new Int32Vector());
            if (tableArrayIndices3 != null) {
                objUnpack = ((Int32Vector) tableArrayIndices3).unpack();
            }
            sparseIndexVectorUnion2.setValue(objUnpack);
        }
        dimensionMetadataT.setArrayIndices(sparseIndexVectorUnion2);
    }
}
