package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SubGraphMetadata extends Table {

    public static final class Vector extends BaseVector {
        public SubGraphMetadata get(int i11) {
            return get(new SubGraphMetadata(), i11);
        }

        public SubGraphMetadata get(SubGraphMetadata subGraphMetadata, int i11) {
            return subGraphMetadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAssociatedFiles(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addDescription(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addInputProcessUnits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static void addInputTensorGroups(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(7, i11, 0);
    }

    public static void addInputTensorMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addOutputProcessUnits(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addOutputTensorMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static int createAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createCustomMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createInputProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createInputTensorGroupsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createInputTensorMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOutputProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOutputTensorGroupsVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createOutputTensorMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static SubGraphMetadata getRootAsSubGraphMetadata(ByteBuffer byteBuffer) {
        return getRootAsSubGraphMetadata(byteBuffer, new SubGraphMetadata());
    }

    public static void startAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startCustomMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startInputProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startInputTensorGroupsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startInputTensorMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOutputProcessUnitsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOutputTensorGroupsVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startOutputTensorMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public AssociatedFile associatedFiles(int i11) {
        return associatedFiles(new AssociatedFile(), i11);
    }

    public AssociatedFile.Vector associatedFilesVector() {
        return associatedFilesVector(new AssociatedFile.Vector());
    }

    public CustomMetadata customMetadata(int i11) {
        return customMetadata(new CustomMetadata(), i11);
    }

    public CustomMetadata.Vector customMetadataVector() {
        return customMetadataVector(new CustomMetadata.Vector());
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

    public ProcessUnit inputProcessUnits(int i11) {
        return inputProcessUnits(new ProcessUnit(), i11);
    }

    public ProcessUnit.Vector inputProcessUnitsVector() {
        return inputProcessUnitsVector(new ProcessUnit.Vector());
    }

    public TensorGroup inputTensorGroups(int i11) {
        return inputTensorGroups(new TensorGroup(), i11);
    }

    public TensorGroup.Vector inputTensorGroupsVector() {
        return inputTensorGroupsVector(new TensorGroup.Vector());
    }

    public TensorMetadata inputTensorMetadata(int i11) {
        return inputTensorMetadata(new TensorMetadata(), i11);
    }

    public TensorMetadata.Vector inputTensorMetadataVector() {
        return inputTensorMetadataVector(new TensorMetadata.Vector());
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

    public ProcessUnit outputProcessUnits(int i11) {
        return outputProcessUnits(new ProcessUnit(), i11);
    }

    public ProcessUnit.Vector outputProcessUnitsVector() {
        return outputProcessUnitsVector(new ProcessUnit.Vector());
    }

    public TensorGroup outputTensorGroups(int i11) {
        return outputTensorGroups(new TensorGroup(), i11);
    }

    public TensorGroup.Vector outputTensorGroupsVector() {
        return outputTensorGroupsVector(new TensorGroup.Vector());
    }

    public TensorMetadata outputTensorMetadata(int i11) {
        return outputTensorMetadata(new TensorMetadata(), i11);
    }

    public TensorMetadata.Vector outputTensorMetadataVector() {
        return outputTensorMetadataVector(new TensorMetadata.Vector());
    }

    public static void addCustomMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(9, i11, 0);
    }

    public static void addOutputTensorGroups(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(8, i11, 0);
    }

    public static int createSubGraphMetadata(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        flatBufferBuilder.startTable(10);
        addCustomMetadata(flatBufferBuilder, i21);
        addOutputTensorGroups(flatBufferBuilder, i19);
        addInputTensorGroups(flatBufferBuilder, i18);
        addOutputProcessUnits(flatBufferBuilder, i17);
        addInputProcessUnits(flatBufferBuilder, i16);
        addAssociatedFiles(flatBufferBuilder, i15);
        addOutputTensorMetadata(flatBufferBuilder, i14);
        addInputTensorMetadata(flatBufferBuilder, i13);
        addDescription(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        return endSubGraphMetadata(flatBufferBuilder);
    }

    public static SubGraphMetadata getRootAsSubGraphMetadata(ByteBuffer byteBuffer, SubGraphMetadata subGraphMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return subGraphMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SubGraphMetadataT subGraphMetadataT) {
        int iCreateInputTensorMetadataVector;
        int iCreateOutputTensorMetadataVector;
        int iCreateAssociatedFilesVector;
        int iCreateInputProcessUnitsVector;
        int iCreateOutputProcessUnitsVector;
        int iCreateInputTensorGroupsVector;
        int iCreateOutputTensorGroupsVector;
        int iCreateCustomMetadataVector = 0;
        if (subGraphMetadataT == null) {
            return 0;
        }
        int iCreateString = subGraphMetadataT.getName() == null ? 0 : flatBufferBuilder.createString(subGraphMetadataT.getName());
        int iCreateString2 = subGraphMetadataT.getDescription() == null ? 0 : flatBufferBuilder.createString(subGraphMetadataT.getDescription());
        if (subGraphMetadataT.getInputTensorMetadata() != null) {
            int[] iArr = new int[subGraphMetadataT.getInputTensorMetadata().length];
            int i11 = 0;
            for (TensorMetadataT tensorMetadataT : subGraphMetadataT.getInputTensorMetadata()) {
                iArr[i11] = TensorMetadata.pack(flatBufferBuilder, tensorMetadataT);
                i11++;
            }
            iCreateInputTensorMetadataVector = createInputTensorMetadataVector(flatBufferBuilder, iArr);
        } else {
            iCreateInputTensorMetadataVector = 0;
        }
        if (subGraphMetadataT.getOutputTensorMetadata() != null) {
            int[] iArr2 = new int[subGraphMetadataT.getOutputTensorMetadata().length];
            int i12 = 0;
            for (TensorMetadataT tensorMetadataT2 : subGraphMetadataT.getOutputTensorMetadata()) {
                iArr2[i12] = TensorMetadata.pack(flatBufferBuilder, tensorMetadataT2);
                i12++;
            }
            iCreateOutputTensorMetadataVector = createOutputTensorMetadataVector(flatBufferBuilder, iArr2);
        } else {
            iCreateOutputTensorMetadataVector = 0;
        }
        if (subGraphMetadataT.getAssociatedFiles() != null) {
            int[] iArr3 = new int[subGraphMetadataT.getAssociatedFiles().length];
            int i13 = 0;
            for (AssociatedFileT associatedFileT : subGraphMetadataT.getAssociatedFiles()) {
                iArr3[i13] = AssociatedFile.pack(flatBufferBuilder, associatedFileT);
                i13++;
            }
            iCreateAssociatedFilesVector = createAssociatedFilesVector(flatBufferBuilder, iArr3);
        } else {
            iCreateAssociatedFilesVector = 0;
        }
        if (subGraphMetadataT.getInputProcessUnits() != null) {
            int[] iArr4 = new int[subGraphMetadataT.getInputProcessUnits().length];
            int i14 = 0;
            for (ProcessUnitT processUnitT : subGraphMetadataT.getInputProcessUnits()) {
                iArr4[i14] = ProcessUnit.pack(flatBufferBuilder, processUnitT);
                i14++;
            }
            iCreateInputProcessUnitsVector = createInputProcessUnitsVector(flatBufferBuilder, iArr4);
        } else {
            iCreateInputProcessUnitsVector = 0;
        }
        if (subGraphMetadataT.getOutputProcessUnits() != null) {
            int[] iArr5 = new int[subGraphMetadataT.getOutputProcessUnits().length];
            int i15 = 0;
            for (ProcessUnitT processUnitT2 : subGraphMetadataT.getOutputProcessUnits()) {
                iArr5[i15] = ProcessUnit.pack(flatBufferBuilder, processUnitT2);
                i15++;
            }
            iCreateOutputProcessUnitsVector = createOutputProcessUnitsVector(flatBufferBuilder, iArr5);
        } else {
            iCreateOutputProcessUnitsVector = 0;
        }
        if (subGraphMetadataT.getInputTensorGroups() != null) {
            int[] iArr6 = new int[subGraphMetadataT.getInputTensorGroups().length];
            int i16 = 0;
            for (TensorGroupT tensorGroupT : subGraphMetadataT.getInputTensorGroups()) {
                iArr6[i16] = TensorGroup.pack(flatBufferBuilder, tensorGroupT);
                i16++;
            }
            iCreateInputTensorGroupsVector = createInputTensorGroupsVector(flatBufferBuilder, iArr6);
        } else {
            iCreateInputTensorGroupsVector = 0;
        }
        if (subGraphMetadataT.getOutputTensorGroups() != null) {
            int[] iArr7 = new int[subGraphMetadataT.getOutputTensorGroups().length];
            int i17 = 0;
            for (TensorGroupT tensorGroupT2 : subGraphMetadataT.getOutputTensorGroups()) {
                iArr7[i17] = TensorGroup.pack(flatBufferBuilder, tensorGroupT2);
                i17++;
            }
            iCreateOutputTensorGroupsVector = createOutputTensorGroupsVector(flatBufferBuilder, iArr7);
        } else {
            iCreateOutputTensorGroupsVector = 0;
        }
        if (subGraphMetadataT.getCustomMetadata() != null) {
            int[] iArr8 = new int[subGraphMetadataT.getCustomMetadata().length];
            CustomMetadataT[] customMetadata = subGraphMetadataT.getCustomMetadata();
            int length = customMetadata.length;
            int i18 = 0;
            while (iCreateCustomMetadataVector < length) {
                iArr8[i18] = CustomMetadata.pack(flatBufferBuilder, customMetadata[iCreateCustomMetadataVector]);
                i18++;
                iCreateCustomMetadataVector++;
            }
            iCreateCustomMetadataVector = createCustomMetadataVector(flatBufferBuilder, iArr8);
        }
        return createSubGraphMetadata(flatBufferBuilder, iCreateString, iCreateString2, iCreateInputTensorMetadataVector, iCreateOutputTensorMetadataVector, iCreateAssociatedFilesVector, iCreateInputProcessUnitsVector, iCreateOutputProcessUnitsVector, iCreateInputTensorGroupsVector, iCreateOutputTensorGroupsVector, iCreateCustomMetadataVector);
    }

    public static void startSubGraphMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(10);
    }

    public AssociatedFile associatedFiles(AssociatedFile associatedFile, int i11) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return associatedFile.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int associatedFilesLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public AssociatedFile.Vector associatedFilesVector(AssociatedFile.Vector vector) {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public CustomMetadata customMetadata(CustomMetadata customMetadata, int i11) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return customMetadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int customMetadataLength() {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public CustomMetadata.Vector customMetadataVector(CustomMetadata.Vector vector) {
        int i__offset = __offset(22);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public ProcessUnit inputProcessUnits(ProcessUnit processUnit, int i11) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return processUnit.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int inputProcessUnitsLength() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ProcessUnit.Vector inputProcessUnitsVector(ProcessUnit.Vector vector) {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorGroup inputTensorGroups(TensorGroup tensorGroup, int i11) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return tensorGroup.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int inputTensorGroupsLength() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorGroup.Vector inputTensorGroupsVector(TensorGroup.Vector vector) {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorMetadata inputTensorMetadata(TensorMetadata tensorMetadata, int i11) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return tensorMetadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int inputTensorMetadataLength() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorMetadata.Vector inputTensorMetadataVector(TensorMetadata.Vector vector) {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public ProcessUnit outputProcessUnits(ProcessUnit processUnit, int i11) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return processUnit.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int outputProcessUnitsLength() {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ProcessUnit.Vector outputProcessUnitsVector(ProcessUnit.Vector vector) {
        int i__offset = __offset(16);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorGroup outputTensorGroups(TensorGroup tensorGroup, int i11) {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return tensorGroup.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int outputTensorGroupsLength() {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorGroup.Vector outputTensorGroupsVector(TensorGroup.Vector vector) {
        int i__offset = __offset(20);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorMetadata outputTensorMetadata(TensorMetadata tensorMetadata, int i11) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return tensorMetadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int outputTensorMetadataLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public TensorMetadata.Vector outputTensorMetadataVector(TensorMetadata.Vector vector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public SubGraphMetadataT unpack() {
        SubGraphMetadataT subGraphMetadataT = new SubGraphMetadataT();
        unpackTo(subGraphMetadataT);
        return subGraphMetadataT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSubGraphMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SubGraphMetadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SubGraphMetadataT subGraphMetadataT) {
        CustomMetadataT customMetadataTUnpack;
        TensorGroupT tensorGroupTUnpack;
        TensorGroupT tensorGroupTUnpack2;
        ProcessUnitT processUnitTUnpack;
        ProcessUnitT processUnitTUnpack2;
        AssociatedFileT associatedFileTUnpack;
        TensorMetadataT tensorMetadataTUnpack;
        subGraphMetadataT.setName(name());
        subGraphMetadataT.setDescription(description());
        TensorMetadataT[] tensorMetadataTArr = new TensorMetadataT[inputTensorMetadataLength()];
        int i11 = 0;
        while (true) {
            TensorMetadataT tensorMetadataTUnpack2 = null;
            if (i11 >= inputTensorMetadataLength()) {
                break;
            }
            if (inputTensorMetadata(i11) != null) {
                tensorMetadataTUnpack2 = inputTensorMetadata(i11).unpack();
            }
            tensorMetadataTArr[i11] = tensorMetadataTUnpack2;
            i11++;
        }
        subGraphMetadataT.setInputTensorMetadata(tensorMetadataTArr);
        TensorMetadataT[] tensorMetadataTArr2 = new TensorMetadataT[outputTensorMetadataLength()];
        for (int i12 = 0; i12 < outputTensorMetadataLength(); i12++) {
            if (outputTensorMetadata(i12) != null) {
                tensorMetadataTUnpack = outputTensorMetadata(i12).unpack();
            } else {
                tensorMetadataTUnpack = null;
            }
            tensorMetadataTArr2[i12] = tensorMetadataTUnpack;
        }
        subGraphMetadataT.setOutputTensorMetadata(tensorMetadataTArr2);
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[associatedFilesLength()];
        for (int i13 = 0; i13 < associatedFilesLength(); i13++) {
            if (associatedFiles(i13) != null) {
                associatedFileTUnpack = associatedFiles(i13).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr[i13] = associatedFileTUnpack;
        }
        subGraphMetadataT.setAssociatedFiles(associatedFileTArr);
        ProcessUnitT[] processUnitTArr = new ProcessUnitT[inputProcessUnitsLength()];
        for (int i14 = 0; i14 < inputProcessUnitsLength(); i14++) {
            if (inputProcessUnits(i14) != null) {
                processUnitTUnpack2 = inputProcessUnits(i14).unpack();
            } else {
                processUnitTUnpack2 = null;
            }
            processUnitTArr[i14] = processUnitTUnpack2;
        }
        subGraphMetadataT.setInputProcessUnits(processUnitTArr);
        ProcessUnitT[] processUnitTArr2 = new ProcessUnitT[outputProcessUnitsLength()];
        for (int i15 = 0; i15 < outputProcessUnitsLength(); i15++) {
            if (outputProcessUnits(i15) != null) {
                processUnitTUnpack = outputProcessUnits(i15).unpack();
            } else {
                processUnitTUnpack = null;
            }
            processUnitTArr2[i15] = processUnitTUnpack;
        }
        subGraphMetadataT.setOutputProcessUnits(processUnitTArr2);
        TensorGroupT[] tensorGroupTArr = new TensorGroupT[inputTensorGroupsLength()];
        for (int i16 = 0; i16 < inputTensorGroupsLength(); i16++) {
            if (inputTensorGroups(i16) != null) {
                tensorGroupTUnpack2 = inputTensorGroups(i16).unpack();
            } else {
                tensorGroupTUnpack2 = null;
            }
            tensorGroupTArr[i16] = tensorGroupTUnpack2;
        }
        subGraphMetadataT.setInputTensorGroups(tensorGroupTArr);
        TensorGroupT[] tensorGroupTArr2 = new TensorGroupT[outputTensorGroupsLength()];
        for (int i17 = 0; i17 < outputTensorGroupsLength(); i17++) {
            if (outputTensorGroups(i17) != null) {
                tensorGroupTUnpack = outputTensorGroups(i17).unpack();
            } else {
                tensorGroupTUnpack = null;
            }
            tensorGroupTArr2[i17] = tensorGroupTUnpack;
        }
        subGraphMetadataT.setOutputTensorGroups(tensorGroupTArr2);
        CustomMetadataT[] customMetadataTArr = new CustomMetadataT[customMetadataLength()];
        for (int i18 = 0; i18 < customMetadataLength(); i18++) {
            if (customMetadata(i18) != null) {
                customMetadataTUnpack = customMetadata(i18).unpack();
            } else {
                customMetadataTUnpack = null;
            }
            customMetadataTArr[i18] = customMetadataTUnpack;
        }
        subGraphMetadataT.setCustomMetadata(customMetadataTArr);
    }
}
