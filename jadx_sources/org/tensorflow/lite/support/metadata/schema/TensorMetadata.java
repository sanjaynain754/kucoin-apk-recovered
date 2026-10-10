package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TensorMetadata extends Table {

    public static final class Vector extends BaseVector {
        public TensorMetadata get(int i11) {
            return get(new TensorMetadata(), i11);
        }

        public TensorMetadata get(TensorMetadata tensorMetadata, int i11) {
            return tensorMetadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAssociatedFiles(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addContent(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addDescription(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addDimensionNames(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addProcessUnits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addStats(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static int createAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createDimensionNamesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createTensorMetadata(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        flatBufferBuilder.startTable(7);
        addAssociatedFiles(flatBufferBuilder, i17);
        addStats(flatBufferBuilder, i16);
        addProcessUnits(flatBufferBuilder, i15);
        addContent(flatBufferBuilder, i14);
        addDimensionNames(flatBufferBuilder, i13);
        addDescription(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        return endTensorMetadata(flatBufferBuilder);
    }

    public static TensorMetadata getRootAsTensorMetadata(ByteBuffer byteBuffer) {
        return getRootAsTensorMetadata(byteBuffer, new TensorMetadata());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TensorMetadataT tensorMetadataT) {
        int iCreateDimensionNamesVector;
        int iCreateProcessUnitsVector;
        int iCreateAssociatedFilesVector = 0;
        if (tensorMetadataT == null) {
            return 0;
        }
        int iCreateString = tensorMetadataT.getName() == null ? 0 : flatBufferBuilder.createString(tensorMetadataT.getName());
        int iCreateString2 = tensorMetadataT.getDescription() == null ? 0 : flatBufferBuilder.createString(tensorMetadataT.getDescription());
        if (tensorMetadataT.getDimensionNames() != null) {
            int[] iArr = new int[tensorMetadataT.getDimensionNames().length];
            int i11 = 0;
            for (String str : tensorMetadataT.getDimensionNames()) {
                iArr[i11] = flatBufferBuilder.createString(str);
                i11++;
            }
            iCreateDimensionNamesVector = createDimensionNamesVector(flatBufferBuilder, iArr);
        } else {
            iCreateDimensionNamesVector = 0;
        }
        int iPack = tensorMetadataT.getContent() == null ? 0 : Content.pack(flatBufferBuilder, tensorMetadataT.getContent());
        if (tensorMetadataT.getProcessUnits() != null) {
            int[] iArr2 = new int[tensorMetadataT.getProcessUnits().length];
            int i12 = 0;
            for (ProcessUnitT processUnitT : tensorMetadataT.getProcessUnits()) {
                iArr2[i12] = ProcessUnit.pack(flatBufferBuilder, processUnitT);
                i12++;
            }
            iCreateProcessUnitsVector = createProcessUnitsVector(flatBufferBuilder, iArr2);
        } else {
            iCreateProcessUnitsVector = 0;
        }
        int iPack2 = tensorMetadataT.getStats() == null ? 0 : Stats.pack(flatBufferBuilder, tensorMetadataT.getStats());
        if (tensorMetadataT.getAssociatedFiles() != null) {
            int[] iArr3 = new int[tensorMetadataT.getAssociatedFiles().length];
            AssociatedFileT[] associatedFiles = tensorMetadataT.getAssociatedFiles();
            int length = associatedFiles.length;
            int i13 = 0;
            while (iCreateAssociatedFilesVector < length) {
                iArr3[i13] = AssociatedFile.pack(flatBufferBuilder, associatedFiles[iCreateAssociatedFilesVector]);
                i13++;
                iCreateAssociatedFilesVector++;
            }
            iCreateAssociatedFilesVector = createAssociatedFilesVector(flatBufferBuilder, iArr3);
        }
        return createTensorMetadata(flatBufferBuilder, iCreateString, iCreateString2, iCreateDimensionNamesVector, iPack, iCreateProcessUnitsVector, iPack2, iCreateAssociatedFilesVector);
    }

    public static void startAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startDimensionNamesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startTensorMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(7);
    }

    public AssociatedFile associatedFiles(int i11) {
        return associatedFiles(new AssociatedFile(), i11);
    }

    public AssociatedFile.Vector associatedFilesVector() {
        return associatedFilesVector(new AssociatedFile.Vector());
    }

    public Content content() {
        return content(new Content());
    }

    public String description() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer descriptionAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer descriptionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public StringVector dimensionNamesVector() {
        return dimensionNamesVector(new StringVector());
    }

    public String name() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer nameAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer nameInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public ProcessUnit processUnits(int i11) {
        return processUnits(new ProcessUnit(), i11);
    }

    public ProcessUnit.Vector processUnitsVector() {
        return processUnitsVector(new ProcessUnit.Vector());
    }

    public Stats stats() {
        return stats(new Stats());
    }

    public static TensorMetadata getRootAsTensorMetadata(ByteBuffer byteBuffer, TensorMetadata tensorMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tensorMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public AssociatedFile associatedFiles(AssociatedFile associatedFile, int i11) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return associatedFile.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int associatedFilesLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public AssociatedFile.Vector associatedFilesVector(AssociatedFile.Vector vector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public Content content(Content content) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return content.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public String dimensionNames(int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i11 * 4));
        }
        return null;
    }

    public int dimensionNamesLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public StringVector dimensionNamesVector(StringVector stringVector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public ProcessUnit processUnits(ProcessUnit processUnit, int i11) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return processUnit.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int processUnitsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ProcessUnit.Vector processUnitsVector(ProcessUnit.Vector vector) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public Stats stats(Stats stats) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return stats.__assign(__indirect(i__offset + this.bb_pos), this.f12714bb);
        }
        return null;
    }

    public TensorMetadataT unpack() {
        TensorMetadataT tensorMetadataT = new TensorMetadataT();
        unpackTo(tensorMetadataT);
        return tensorMetadataT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTensorMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TensorMetadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TensorMetadataT tensorMetadataT) {
        AssociatedFileT associatedFileTUnpack;
        ProcessUnitT processUnitTUnpack;
        tensorMetadataT.setName(name());
        tensorMetadataT.setDescription(description());
        String[] strArr = new String[dimensionNamesLength()];
        for (int i11 = 0; i11 < dimensionNamesLength(); i11++) {
            strArr[i11] = dimensionNames(i11);
        }
        tensorMetadataT.setDimensionNames(strArr);
        if (content() != null) {
            tensorMetadataT.setContent(content().unpack());
        } else {
            tensorMetadataT.setContent(null);
        }
        ProcessUnitT[] processUnitTArr = new ProcessUnitT[processUnitsLength()];
        for (int i12 = 0; i12 < processUnitsLength(); i12++) {
            if (processUnits(i12) != null) {
                processUnitTUnpack = processUnits(i12).unpack();
            } else {
                processUnitTUnpack = null;
            }
            processUnitTArr[i12] = processUnitTUnpack;
        }
        tensorMetadataT.setProcessUnits(processUnitTArr);
        if (stats() != null) {
            tensorMetadataT.setStats(stats().unpack());
        } else {
            tensorMetadataT.setStats(null);
        }
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[associatedFilesLength()];
        for (int i13 = 0; i13 < associatedFilesLength(); i13++) {
            if (associatedFiles(i13) != null) {
                associatedFileTUnpack = associatedFiles(i13).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr[i13] = associatedFileTUnpack;
        }
        tensorMetadataT.setAssociatedFiles(associatedFileTArr);
    }
}
