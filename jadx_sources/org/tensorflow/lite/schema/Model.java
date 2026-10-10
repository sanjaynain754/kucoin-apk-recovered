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
public final class Model extends Table {

    public static final class Vector extends BaseVector {
        public Model get(int i11) {
            return get(new Model(), i11);
        }

        public Model get(Model model, int i11) {
            return model.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addBuffers(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addDescription(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addMetadataBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static void addOperatorCodes(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addSignatureDefs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(7, i11, 0);
    }

    public static void addSubgraphs(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, long j11) {
        flatBufferBuilder.addInt(0, (int) j11, 0);
    }

    public static int createBuffersVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataBufferVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addInt(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOperatorCodesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSignatureDefsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSubgraphsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer) {
        return getRootAsModel(byteBuffer, new Model());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ModelT modelT) {
        int iCreateOperatorCodesVector;
        int iCreateSubgraphsVector;
        int iCreateBuffersVector;
        int iCreateMetadataVector;
        int iCreateSignatureDefsVector = 0;
        if (modelT == null) {
            return 0;
        }
        if (modelT.getOperatorCodes() != null) {
            int[] iArr = new int[modelT.getOperatorCodes().length];
            int i11 = 0;
            for (OperatorCodeT operatorCodeT : modelT.getOperatorCodes()) {
                iArr[i11] = OperatorCode.pack(flatBufferBuilder, operatorCodeT);
                i11++;
            }
            iCreateOperatorCodesVector = createOperatorCodesVector(flatBufferBuilder, iArr);
        } else {
            iCreateOperatorCodesVector = 0;
        }
        if (modelT.getSubgraphs() != null) {
            int[] iArr2 = new int[modelT.getSubgraphs().length];
            int i12 = 0;
            for (SubGraphT subGraphT : modelT.getSubgraphs()) {
                iArr2[i12] = SubGraph.pack(flatBufferBuilder, subGraphT);
                i12++;
            }
            iCreateSubgraphsVector = createSubgraphsVector(flatBufferBuilder, iArr2);
        } else {
            iCreateSubgraphsVector = 0;
        }
        int iCreateString = modelT.getDescription() == null ? 0 : flatBufferBuilder.createString(modelT.getDescription());
        if (modelT.getBuffers() != null) {
            int[] iArr3 = new int[modelT.getBuffers().length];
            int i13 = 0;
            for (BufferT bufferT : modelT.getBuffers()) {
                iArr3[i13] = Buffer.pack(flatBufferBuilder, bufferT);
                i13++;
            }
            iCreateBuffersVector = createBuffersVector(flatBufferBuilder, iArr3);
        } else {
            iCreateBuffersVector = 0;
        }
        int iCreateMetadataBufferVector = modelT.getMetadataBuffer() != null ? createMetadataBufferVector(flatBufferBuilder, modelT.getMetadataBuffer()) : 0;
        if (modelT.getMetadata() != null) {
            int[] iArr4 = new int[modelT.getMetadata().length];
            int i14 = 0;
            for (MetadataT metadataT : modelT.getMetadata()) {
                iArr4[i14] = Metadata.pack(flatBufferBuilder, metadataT);
                i14++;
            }
            iCreateMetadataVector = createMetadataVector(flatBufferBuilder, iArr4);
        } else {
            iCreateMetadataVector = 0;
        }
        if (modelT.getSignatureDefs() != null) {
            int[] iArr5 = new int[modelT.getSignatureDefs().length];
            SignatureDefT[] signatureDefs = modelT.getSignatureDefs();
            int length = signatureDefs.length;
            int i15 = 0;
            while (iCreateSignatureDefsVector < length) {
                iArr5[i15] = SignatureDef.pack(flatBufferBuilder, signatureDefs[iCreateSignatureDefsVector]);
                i15++;
                iCreateSignatureDefsVector++;
            }
            iCreateSignatureDefsVector = createSignatureDefsVector(flatBufferBuilder, iArr5);
        }
        return createModel(flatBufferBuilder, modelT.getVersion(), iCreateOperatorCodesVector, iCreateSubgraphsVector, iCreateString, iCreateBuffersVector, iCreateMetadataBufferVector, iCreateMetadataVector, iCreateSignatureDefsVector);
    }

    public static void startBuffersVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMetadataBufferVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOperatorCodesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSignatureDefsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSubgraphsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public Buffer buffers(int i11) {
        return buffers(new Buffer(), i11);
    }

    public Buffer.Vector buffersVector() {
        return buffersVector(new Buffer.Vector());
    }

    public Metadata metadata(int i11) {
        return metadata(new Metadata(), i11);
    }

    public IntVector metadataBufferVector() {
        return metadataBufferVector(new IntVector());
    }

    public Metadata.Vector metadataVector() {
        return metadataVector(new Metadata.Vector());
    }

    public OperatorCode operatorCodes(int i11) {
        return operatorCodes(new OperatorCode(), i11);
    }

    public int operatorCodesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public OperatorCode.Vector operatorCodesVector() {
        return operatorCodesVector(new OperatorCode.Vector());
    }

    public SignatureDef signatureDefs(int i11) {
        return signatureDefs(new SignatureDef(), i11);
    }

    public SignatureDef.Vector signatureDefsVector() {
        return signatureDefsVector(new SignatureDef.Vector());
    }

    public SubGraph subgraphs(int i11) {
        return subgraphs(new SubGraph(), i11);
    }

    public SubGraph.Vector subgraphsVector() {
        return subgraphsVector(new SubGraph.Vector());
    }

    public long version() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return ((long) this.f12714bb.getInt(i__offset + this.bb_pos)) & KeyboardMap.kValueMask;
        }
        return 0L;
    }

    public static boolean ModelBufferHasIdentifier(ByteBuffer byteBuffer) {
        return Table.__has_identifier(byteBuffer, "TFL3");
    }

    public static int createModel(FlatBufferBuilder flatBufferBuilder, long j11, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        flatBufferBuilder.startTable(8);
        addSignatureDefs(flatBufferBuilder, i17);
        addMetadata(flatBufferBuilder, i16);
        addMetadataBuffer(flatBufferBuilder, i15);
        addBuffers(flatBufferBuilder, i14);
        addDescription(flatBufferBuilder, i13);
        addSubgraphs(flatBufferBuilder, i12);
        addOperatorCodes(flatBufferBuilder, i11);
        addVersion(flatBufferBuilder, j11);
        return endModel(flatBufferBuilder);
    }

    public static void finishModelBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finish(i11, "TFL3");
    }

    public static void finishSizePrefixedModelBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finishSizePrefixed(i11, "TFL3");
    }

    public static Model getRootAsModel(ByteBuffer byteBuffer, Model model) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return model.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModel(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(8);
    }

    public Buffer buffers(Buffer buffer, int i11) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return buffer.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int buffersLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public Buffer.Vector buffersVector(Buffer.Vector vector) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public String description() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer descriptionAsByteBuffer() {
        return __vector_as_bytebuffer(10, 1);
    }

    public ByteBuffer descriptionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 10, 1);
    }

    public Metadata metadata(Metadata metadata, int i11) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return metadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int metadataBuffer(int i11) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return this.f12714bb.getInt(__vector(i__offset) + (i11 * 4));
        }
        return 0;
    }

    public ByteBuffer metadataBufferAsByteBuffer() {
        return __vector_as_bytebuffer(14, 4);
    }

    public ByteBuffer metadataBufferInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 4);
    }

    public int metadataBufferLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public IntVector metadataBufferVector(IntVector intVector) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return intVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public int metadataLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public Metadata.Vector metadataVector(Metadata.Vector vector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public OperatorCode operatorCodes(OperatorCode operatorCode, int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return operatorCode.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public OperatorCode.Vector operatorCodesVector(OperatorCode.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public SignatureDef signatureDefs(SignatureDef signatureDef, int i11) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return signatureDef.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int signatureDefsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public SignatureDef.Vector signatureDefsVector(SignatureDef.Vector vector) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public SubGraph subgraphs(SubGraph subGraph, int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return subGraph.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int subgraphsLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public SubGraph.Vector subgraphsVector(SubGraph.Vector vector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public ModelT unpack() {
        ModelT modelT = new ModelT();
        unpackTo(modelT);
        return modelT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endModel(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Model __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ModelT modelT) {
        SignatureDefT signatureDefTUnpack;
        MetadataT metadataTUnpack;
        BufferT bufferTUnpack;
        SubGraphT subGraphTUnpack;
        modelT.setVersion(version());
        OperatorCodeT[] operatorCodeTArr = new OperatorCodeT[operatorCodesLength()];
        int i11 = 0;
        while (true) {
            OperatorCodeT operatorCodeTUnpack = null;
            if (i11 >= operatorCodesLength()) {
                break;
            }
            if (operatorCodes(i11) != null) {
                operatorCodeTUnpack = operatorCodes(i11).unpack();
            }
            operatorCodeTArr[i11] = operatorCodeTUnpack;
            i11++;
        }
        modelT.setOperatorCodes(operatorCodeTArr);
        SubGraphT[] subGraphTArr = new SubGraphT[subgraphsLength()];
        for (int i12 = 0; i12 < subgraphsLength(); i12++) {
            if (subgraphs(i12) != null) {
                subGraphTUnpack = subgraphs(i12).unpack();
            } else {
                subGraphTUnpack = null;
            }
            subGraphTArr[i12] = subGraphTUnpack;
        }
        modelT.setSubgraphs(subGraphTArr);
        modelT.setDescription(description());
        BufferT[] bufferTArr = new BufferT[buffersLength()];
        for (int i13 = 0; i13 < buffersLength(); i13++) {
            if (buffers(i13) != null) {
                bufferTUnpack = buffers(i13).unpack();
            } else {
                bufferTUnpack = null;
            }
            bufferTArr[i13] = bufferTUnpack;
        }
        modelT.setBuffers(bufferTArr);
        int[] iArr = new int[metadataBufferLength()];
        for (int i14 = 0; i14 < metadataBufferLength(); i14++) {
            iArr[i14] = metadataBuffer(i14);
        }
        modelT.setMetadataBuffer(iArr);
        MetadataT[] metadataTArr = new MetadataT[metadataLength()];
        for (int i15 = 0; i15 < metadataLength(); i15++) {
            if (metadata(i15) != null) {
                metadataTUnpack = metadata(i15).unpack();
            } else {
                metadataTUnpack = null;
            }
            metadataTArr[i15] = metadataTUnpack;
        }
        modelT.setMetadata(metadataTArr);
        SignatureDefT[] signatureDefTArr = new SignatureDefT[signatureDefsLength()];
        for (int i16 = 0; i16 < signatureDefsLength(); i16++) {
            if (signatureDefs(i16) != null) {
                signatureDefTUnpack = signatureDefs(i16).unpack();
            } else {
                signatureDefTUnpack = null;
            }
            signatureDefTArr[i16] = signatureDefTUnpack;
        }
        modelT.setSignatureDefs(signatureDefTArr);
    }
}
