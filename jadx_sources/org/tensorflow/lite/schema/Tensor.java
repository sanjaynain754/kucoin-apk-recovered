package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Tensor extends Table {

    public static final class Vector extends BaseVector {
        public Tensor get(int i11) {
            return get(new Tensor(), i11);
        }

        public Tensor get(Tensor tensor, int i11) {
            return tensor.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBuffer(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(2, (int) j11, 0);
    }

    public static void addIsVariable(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(5, z11, false);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addQuantization(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addShape(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addShapeSignature(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(7, i11, 0);
    }

    public static void addSparsity(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addType(FlatBufferBuilder flatBufferBuilder, byte b11) {
        flatBufferBuilder.addByte(1, b11, 0);
    }

    public static int createShapeSignatureVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createShapeVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createVariantTensorsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static Tensor getRootAsTensor(ByteBuffer byteBuffer) {
        return getRootAsTensor(byteBuffer, new Tensor());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TensorT tensorT) {
        int iCreateVariantTensorsVector = 0;
        if (tensorT == null) {
            return 0;
        }
        int iCreateShapeVector = tensorT.getShape() != null ? createShapeVector(flatBufferBuilder, tensorT.getShape()) : 0;
        int iCreateString = tensorT.getName() == null ? 0 : flatBufferBuilder.createString(tensorT.getName());
        int iPack = tensorT.getQuantization() == null ? 0 : QuantizationParameters.pack(flatBufferBuilder, tensorT.getQuantization());
        int iPack2 = tensorT.getSparsity() == null ? 0 : SparsityParameters.pack(flatBufferBuilder, tensorT.getSparsity());
        int iCreateShapeSignatureVector = tensorT.getShapeSignature() != null ? createShapeSignatureVector(flatBufferBuilder, tensorT.getShapeSignature()) : 0;
        if (tensorT.getVariantTensors() != null) {
            int[] iArr = new int[tensorT.getVariantTensors().length];
            VariantSubTypeT[] variantTensors = tensorT.getVariantTensors();
            int length = variantTensors.length;
            int i11 = 0;
            while (iCreateVariantTensorsVector < length) {
                iArr[i11] = VariantSubType.pack(flatBufferBuilder, variantTensors[iCreateVariantTensorsVector]);
                i11++;
                iCreateVariantTensorsVector++;
            }
            iCreateVariantTensorsVector = createVariantTensorsVector(flatBufferBuilder, iArr);
        }
        return createTensor(flatBufferBuilder, iCreateShapeVector, tensorT.getType(), tensorT.getBuffer(), iCreateString, iPack, tensorT.getIsVariable(), iPack2, iCreateShapeSignatureVector, tensorT.getHasRank(), iCreateVariantTensorsVector);
    }

    public static void startShapeSignatureVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startShapeVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startVariantTensorsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public QuantizationParameters quantization() {
        return quantization(new QuantizationParameters());
    }

    public int shape(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer shapeAsByteBuffer() {
        return __vector_as_bytebuffer(4, 4);
    }

    public ByteBuffer shapeInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 4);
    }

    public int shapeLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector shapeSignatureVector() {
        return shapeSignatureVector(new IntVector());
    }

    public IntVector shapeVector() {
        return shapeVector(new IntVector());
    }

    public SparsityParameters sparsity() {
        return sparsity(new SparsityParameters());
    }

    public byte type() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(i__offset + this.bb_pos);
        }
        return (byte) 0;
    }

    public VariantSubType variantTensors(int i11) {
        return variantTensors(new VariantSubType(), i11);
    }

    public VariantSubType.Vector variantTensorsVector() {
        return variantTensorsVector(new VariantSubType.Vector());
    }

    public static void addHasRank(FlatBufferBuilder flatBufferBuilder, boolean z11) {
        flatBufferBuilder.addBoolean(8, z11, false);
    }

    public static void addVariantTensors(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(9, i11, 0);
    }

    public static int createTensor(FlatBufferBuilder flatBufferBuilder, int i11, byte b11, long j11, int i12, int i13, boolean z11, int i14, int i15, boolean z12, int i16) {
        flatBufferBuilder.startTable(10);
        addVariantTensors(flatBufferBuilder, i16);
        addShapeSignature(flatBufferBuilder, i15);
        addSparsity(flatBufferBuilder, i14);
        addQuantization(flatBufferBuilder, i13);
        addName(flatBufferBuilder, i12);
        addBuffer(flatBufferBuilder, j11);
        addShape(flatBufferBuilder, i11);
        addHasRank(flatBufferBuilder, z12);
        addIsVariable(flatBufferBuilder, z11);
        addType(flatBufferBuilder, b11);
        return endTensor(flatBufferBuilder);
    }

    public static Tensor getRootAsTensor(ByteBuffer byteBuffer, Tensor tensor) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tensor.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startTensor(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(10);
    }

    public long buffer() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public boolean hasRank() {
        int i__offset = __offset(20);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public boolean isVariable() {
        int i__offset = __offset(14);
        return (i__offset == 0 || this.f12714bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    public String name() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public QuantizationParameters quantization(QuantizationParameters quantizationParameters) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return quantizationParameters.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public int shapeSignature(int i11) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer shapeSignatureAsByteBuffer() {
        return __vector_as_bytebuffer(18, 4);
    }

    public ByteBuffer shapeSignatureInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 4);
    }

    public int shapeSignatureLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector shapeSignatureVector(IntVector intVector) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public IntVector shapeVector(IntVector intVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public SparsityParameters sparsity(SparsityParameters sparsityParameters) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return sparsityParameters.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public TensorT unpack() {
        TensorT tensorT = new TensorT();
        unpackTo(tensorT);
        return tensorT;
    }

    public VariantSubType variantTensors(VariantSubType variantSubType, int i11) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return variantSubType.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int variantTensorsLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public VariantSubType.Vector variantTensorsVector(VariantSubType.Vector vector) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTensor(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Tensor __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TensorT tensorT) {
        VariantSubTypeT variantSubTypeTUnpack;
        int[] iArr = new int[shapeLength()];
        for (int i11 = 0; i11 < shapeLength(); i11++) {
            iArr[i11] = shape(i11);
        }
        tensorT.setShape(iArr);
        tensorT.setType(type());
        tensorT.setBuffer(buffer());
        tensorT.setName(name());
        if (quantization() != null) {
            tensorT.setQuantization(quantization().unpack());
        } else {
            tensorT.setQuantization(null);
        }
        tensorT.setIsVariable(isVariable());
        if (sparsity() != null) {
            tensorT.setSparsity(sparsity().unpack());
        } else {
            tensorT.setSparsity(null);
        }
        int[] iArr2 = new int[shapeSignatureLength()];
        for (int i12 = 0; i12 < shapeSignatureLength(); i12++) {
            iArr2[i12] = shapeSignature(i12);
        }
        tensorT.setShapeSignature(iArr2);
        tensorT.setHasRank(hasRank());
        VariantSubTypeT[] variantSubTypeTArr = new VariantSubTypeT[variantTensorsLength()];
        for (int i13 = 0; i13 < variantTensorsLength(); i13++) {
            if (variantTensors(i13) != null) {
                variantSubTypeTUnpack = variantTensors(i13).unpack();
            } else {
                variantSubTypeTUnpack = null;
            }
            variantSubTypeTArr[i13] = variantSubTypeTUnpack;
        }
        tensorT.setVariantTensors(variantSubTypeTArr);
    }
}
