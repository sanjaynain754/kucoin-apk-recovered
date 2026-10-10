package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.IntVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SubGraph extends Table {

    public static final class Vector extends BaseVector {
        public SubGraph get(int i11) {
            return get(new SubGraph(), i11);
        }

        public SubGraph get(SubGraph subGraph, int i11) {
            return subGraph.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addInputs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addOperators(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addOutputs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addTensors(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createInputsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOperatorsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOutputsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSubGraph(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, int i15) {
        flatBufferBuilder.startTable(5);
        addName(flatBufferBuilder, i15);
        addOperators(flatBufferBuilder, i14);
        addOutputs(flatBufferBuilder, i13);
        addInputs(flatBufferBuilder, i12);
        addTensors(flatBufferBuilder, i11);
        return endSubGraph(flatBufferBuilder);
    }

    public static int createTensorsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static SubGraph getRootAsSubGraph(ByteBuffer byteBuffer) {
        return getRootAsSubGraph(byteBuffer, new SubGraph());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SubGraphT subGraphT) {
        int iCreateTensorsVector;
        int iCreateOperatorsVector;
        if (subGraphT == null) {
            return 0;
        }
        if (subGraphT.getTensors() != null) {
            int[] iArr = new int[subGraphT.getTensors().length];
            int i11 = 0;
            for (TensorT tensorT : subGraphT.getTensors()) {
                iArr[i11] = Tensor.pack(flatBufferBuilder, tensorT);
                i11++;
            }
            iCreateTensorsVector = createTensorsVector(flatBufferBuilder, iArr);
        } else {
            iCreateTensorsVector = 0;
        }
        int iCreateInputsVector = subGraphT.getInputs() != null ? createInputsVector(flatBufferBuilder, subGraphT.getInputs()) : 0;
        int iCreateOutputsVector = subGraphT.getOutputs() != null ? createOutputsVector(flatBufferBuilder, subGraphT.getOutputs()) : 0;
        if (subGraphT.getOperators() != null) {
            int[] iArr2 = new int[subGraphT.getOperators().length];
            int i12 = 0;
            for (OperatorT operatorT : subGraphT.getOperators()) {
                iArr2[i12] = Operator.pack(flatBufferBuilder, operatorT);
                i12++;
            }
            iCreateOperatorsVector = createOperatorsVector(flatBufferBuilder, iArr2);
        } else {
            iCreateOperatorsVector = 0;
        }
        return createSubGraph(flatBufferBuilder, iCreateTensorsVector, iCreateInputsVector, iCreateOutputsVector, iCreateOperatorsVector, subGraphT.getName() != null ? flatBufferBuilder.createString(subGraphT.getName()) : 0);
    }

    public static void startInputsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOperatorsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOutputsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSubGraph(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(5);
    }

    public static void startTensorsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public int inputs(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer inputsAsByteBuffer() {
        return __vector_as_bytebuffer(6, 4);
    }

    public ByteBuffer inputsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 4);
    }

    public int inputsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector inputsVector() {
        return inputsVector(new IntVector());
    }

    public Operator operators(int i11) {
        return operators(new Operator(), i11);
    }

    public Operator.Vector operatorsVector() {
        return operatorsVector(new Operator.Vector());
    }

    public IntVector outputsVector() {
        return outputsVector(new IntVector());
    }

    public Tensor tensors(int i11) {
        return tensors(new Tensor(), i11);
    }

    public int tensorsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public Tensor.Vector tensorsVector() {
        return tensorsVector(new Tensor.Vector());
    }

    public static SubGraph getRootAsSubGraph(ByteBuffer byteBuffer, SubGraph subGraph) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return subGraph.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public IntVector inputsVector(IntVector intVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public String name() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public Operator operators(Operator operator, int i11) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return operator.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int operatorsLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public Operator.Vector operatorsVector(Operator.Vector vector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public int outputs(int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer outputsAsByteBuffer() {
        return __vector_as_bytebuffer(8, 4);
    }

    public ByteBuffer outputsInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 4);
    }

    public int outputsLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector outputsVector(IntVector intVector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public Tensor tensors(Tensor tensor, int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return tensor.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public Tensor.Vector tensorsVector(Tensor.Vector vector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public SubGraphT unpack() {
        SubGraphT subGraphT = new SubGraphT();
        unpackTo(subGraphT);
        return subGraphT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSubGraph(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SubGraph __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SubGraphT subGraphT) {
        OperatorT operatorTUnpack;
        TensorT[] tensorTArr = new TensorT[tensorsLength()];
        int i11 = 0;
        while (true) {
            TensorT tensorTUnpack = null;
            if (i11 >= tensorsLength()) {
                break;
            }
            if (tensors(i11) != null) {
                tensorTUnpack = tensors(i11).unpack();
            }
            tensorTArr[i11] = tensorTUnpack;
            i11++;
        }
        subGraphT.setTensors(tensorTArr);
        int[] iArr = new int[inputsLength()];
        for (int i12 = 0; i12 < inputsLength(); i12++) {
            iArr[i12] = inputs(i12);
        }
        subGraphT.setInputs(iArr);
        int[] iArr2 = new int[outputsLength()];
        for (int i13 = 0; i13 < outputsLength(); i13++) {
            iArr2[i13] = outputs(i13);
        }
        subGraphT.setOutputs(iArr2);
        OperatorT[] operatorTArr = new OperatorT[operatorsLength()];
        for (int i14 = 0; i14 < operatorsLength(); i14++) {
            if (operators(i14) != null) {
                operatorTUnpack = operators(i14).unpack();
            } else {
                operatorTUnpack = null;
            }
            operatorTArr[i14] = operatorTUnpack;
        }
        subGraphT.setOperators(operatorTArr);
        subGraphT.setName(name());
    }
}
