package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SignatureDef extends Table {

    public static final class Vector extends BaseVector {
        public SignatureDef get(int i11) {
            return get(new SignatureDef(), i11);
        }

        public SignatureDef get(SignatureDef signatureDef, int i11) {
            return signatureDef.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addInputs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addOutputs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addSignatureKey(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addSubgraphIndex(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(4, (int) j11, 0);
    }

    public static int createInputsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOutputsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSignatureDef(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, long j11) {
        flatBufferBuilder.startTable(5);
        addSubgraphIndex(flatBufferBuilder, j11);
        addSignatureKey(flatBufferBuilder, i13);
        addOutputs(flatBufferBuilder, i12);
        addInputs(flatBufferBuilder, i11);
        return endSignatureDef(flatBufferBuilder);
    }

    public static SignatureDef getRootAsSignatureDef(ByteBuffer byteBuffer) {
        return getRootAsSignatureDef(byteBuffer, new SignatureDef());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SignatureDefT signatureDefT) {
        int iCreateInputsVector;
        int iCreateOutputsVector;
        if (signatureDefT == null) {
            return 0;
        }
        if (signatureDefT.getInputs() != null) {
            int[] iArr = new int[signatureDefT.getInputs().length];
            int i11 = 0;
            for (TensorMapT tensorMapT : signatureDefT.getInputs()) {
                iArr[i11] = TensorMap.pack(flatBufferBuilder, tensorMapT);
                i11++;
            }
            iCreateInputsVector = createInputsVector(flatBufferBuilder, iArr);
        } else {
            iCreateInputsVector = 0;
        }
        if (signatureDefT.getOutputs() != null) {
            int[] iArr2 = new int[signatureDefT.getOutputs().length];
            int i12 = 0;
            for (TensorMapT tensorMapT2 : signatureDefT.getOutputs()) {
                iArr2[i12] = TensorMap.pack(flatBufferBuilder, tensorMapT2);
                i12++;
            }
            iCreateOutputsVector = createOutputsVector(flatBufferBuilder, iArr2);
        } else {
            iCreateOutputsVector = 0;
        }
        return createSignatureDef(flatBufferBuilder, iCreateInputsVector, iCreateOutputsVector, signatureDefT.getSignatureKey() != null ? flatBufferBuilder.createString(signatureDefT.getSignatureKey()) : 0, signatureDefT.getSubgraphIndex());
    }

    public static void startInputsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOutputsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSignatureDef(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(5);
    }

    public TensorMap inputs(int i11) {
        return inputs(new TensorMap(), i11);
    }

    public int inputsLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorMap.Vector inputsVector() {
        return inputsVector(new TensorMap.Vector());
    }

    public TensorMap outputs(int i11) {
        return outputs(new TensorMap(), i11);
    }

    public int outputsLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorMap.Vector outputsVector() {
        return outputsVector(new TensorMap.Vector());
    }

    public static SignatureDef getRootAsSignatureDef(ByteBuffer byteBuffer, SignatureDef signatureDef) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return signatureDef.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public TensorMap inputs(TensorMap tensorMap, int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return tensorMap.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public TensorMap.Vector inputsVector(TensorMap.Vector vector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorMap outputs(TensorMap tensorMap, int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return tensorMap.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public TensorMap.Vector outputsVector(TensorMap.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public String signatureKey() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer signatureKeyAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer signatureKeyInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public long subgraphIndex() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public SignatureDefT unpack() {
        SignatureDefT signatureDefT = new SignatureDefT();
        unpackTo(signatureDefT);
        return signatureDefT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSignatureDef(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SignatureDef __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SignatureDefT signatureDefT) {
        TensorMapT tensorMapTUnpack;
        TensorMapT[] tensorMapTArr = new TensorMapT[inputsLength()];
        int i11 = 0;
        while (true) {
            TensorMapT tensorMapTUnpack2 = null;
            if (i11 >= inputsLength()) {
                break;
            }
            if (inputs(i11) != null) {
                tensorMapTUnpack2 = inputs(i11).unpack();
            }
            tensorMapTArr[i11] = tensorMapTUnpack2;
            i11++;
        }
        signatureDefT.setInputs(tensorMapTArr);
        TensorMapT[] tensorMapTArr2 = new TensorMapT[outputsLength()];
        for (int i12 = 0; i12 < outputsLength(); i12++) {
            if (outputs(i12) != null) {
                tensorMapTUnpack = outputs(i12).unpack();
            } else {
                tensorMapTUnpack = null;
            }
            tensorMapTArr2[i12] = tensorMapTUnpack;
        }
        signatureDefT.setOutputs(tensorMapTArr2);
        signatureDefT.setSignatureKey(signatureKey());
        signatureDefT.setSubgraphIndex(subgraphIndex());
    }
}
