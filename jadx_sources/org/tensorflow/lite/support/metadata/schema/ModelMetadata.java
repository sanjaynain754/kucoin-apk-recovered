package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class ModelMetadata extends Table {

    public static final class Vector extends BaseVector {
        public ModelMetadata get(int i11) {
            return get(new ModelMetadata(), i11);
        }

        public ModelMetadata get(ModelMetadata modelMetadata, int i11) {
            return modelMetadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addAssociatedFiles(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(6, i11, 0);
    }

    public static void addAuthor(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(4, i11, 0);
    }

    public static void addDescription(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addLicense(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(5, i11, 0);
    }

    public static void addMinParserVersion(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(7, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addSubgraphMetadata(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(3, i11, 0);
    }

    public static void addVersion(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(2, i11, 0);
    }

    public static int createAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSubgraphMetadataVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static ModelMetadata getRootAsModelMetadata(ByteBuffer byteBuffer) {
        return getRootAsModelMetadata(byteBuffer, new ModelMetadata());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, ModelMetadataT modelMetadataT) {
        int iCreateSubgraphMetadataVector;
        int iCreateAssociatedFilesVector;
        if (modelMetadataT == null) {
            return 0;
        }
        int iCreateString = modelMetadataT.getName() == null ? 0 : flatBufferBuilder.createString(modelMetadataT.getName());
        int iCreateString2 = modelMetadataT.getDescription() == null ? 0 : flatBufferBuilder.createString(modelMetadataT.getDescription());
        int iCreateString3 = modelMetadataT.getVersion() == null ? 0 : flatBufferBuilder.createString(modelMetadataT.getVersion());
        if (modelMetadataT.getSubgraphMetadata() != null) {
            int[] iArr = new int[modelMetadataT.getSubgraphMetadata().length];
            int i11 = 0;
            for (SubGraphMetadataT subGraphMetadataT : modelMetadataT.getSubgraphMetadata()) {
                iArr[i11] = SubGraphMetadata.pack(flatBufferBuilder, subGraphMetadataT);
                i11++;
            }
            iCreateSubgraphMetadataVector = createSubgraphMetadataVector(flatBufferBuilder, iArr);
        } else {
            iCreateSubgraphMetadataVector = 0;
        }
        int iCreateString4 = modelMetadataT.getAuthor() == null ? 0 : flatBufferBuilder.createString(modelMetadataT.getAuthor());
        int iCreateString5 = modelMetadataT.getLicense() == null ? 0 : flatBufferBuilder.createString(modelMetadataT.getLicense());
        if (modelMetadataT.getAssociatedFiles() != null) {
            int[] iArr2 = new int[modelMetadataT.getAssociatedFiles().length];
            int i12 = 0;
            for (AssociatedFileT associatedFileT : modelMetadataT.getAssociatedFiles()) {
                iArr2[i12] = AssociatedFile.pack(flatBufferBuilder, associatedFileT);
                i12++;
            }
            iCreateAssociatedFilesVector = createAssociatedFilesVector(flatBufferBuilder, iArr2);
        } else {
            iCreateAssociatedFilesVector = 0;
        }
        return createModelMetadata(flatBufferBuilder, iCreateString, iCreateString2, iCreateString3, iCreateSubgraphMetadataVector, iCreateString4, iCreateString5, iCreateAssociatedFilesVector, modelMetadataT.getMinParserVersion() != null ? flatBufferBuilder.createString(modelMetadataT.getMinParserVersion()) : 0);
    }

    public static void startAssociatedFilesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSubgraphMetadataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public AssociatedFile associatedFiles(int i11) {
        return associatedFiles(new AssociatedFile(), i11);
    }

    public AssociatedFile.Vector associatedFilesVector() {
        return associatedFilesVector(new AssociatedFile.Vector());
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

    public SubGraphMetadata subgraphMetadata(int i11) {
        return subgraphMetadata(new SubGraphMetadata(), i11);
    }

    public SubGraphMetadata.Vector subgraphMetadataVector() {
        return subgraphMetadataVector(new SubGraphMetadata.Vector());
    }

    public static boolean ModelMetadataBufferHasIdentifier(ByteBuffer byteBuffer) {
        return Table.__has_identifier(byteBuffer, "M001");
    }

    public static int createModelMetadata(FlatBufferBuilder flatBufferBuilder, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        flatBufferBuilder.startTable(8);
        addMinParserVersion(flatBufferBuilder, i18);
        addAssociatedFiles(flatBufferBuilder, i17);
        addLicense(flatBufferBuilder, i16);
        addAuthor(flatBufferBuilder, i15);
        addSubgraphMetadata(flatBufferBuilder, i14);
        addVersion(flatBufferBuilder, i13);
        addDescription(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        return endModelMetadata(flatBufferBuilder);
    }

    public static void finishModelMetadataBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finish(i11, "M001");
    }

    public static void finishSizePrefixedModelMetadataBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.finishSizePrefixed(i11, "M001");
    }

    public static ModelMetadata getRootAsModelMetadata(ByteBuffer byteBuffer, ModelMetadata modelMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return modelMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void startModelMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(8);
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

    public String author() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer authorAsByteBuffer() {
        return __vector_as_bytebuffer(12, 1);
    }

    public ByteBuffer authorInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 12, 1);
    }

    public String license() {
        int i__offset = __offset(14);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer licenseAsByteBuffer() {
        return __vector_as_bytebuffer(14, 1);
    }

    public ByteBuffer licenseInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 14, 1);
    }

    public String minParserVersion() {
        int i__offset = __offset(18);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer minParserVersionAsByteBuffer() {
        return __vector_as_bytebuffer(18, 1);
    }

    public ByteBuffer minParserVersionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 18, 1);
    }

    public SubGraphMetadata subgraphMetadata(SubGraphMetadata subGraphMetadata, int i11) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return subGraphMetadata.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public int subgraphMetadataLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public SubGraphMetadata.Vector subgraphMetadataVector(SubGraphMetadata.Vector vector) {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public ModelMetadataT unpack() {
        ModelMetadataT modelMetadataT = new ModelMetadataT();
        unpackTo(modelMetadataT);
        return modelMetadataT;
    }

    public String version() {
        int i__offset = __offset(8);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer versionAsByteBuffer() {
        return __vector_as_bytebuffer(8, 1);
    }

    public ByteBuffer versionInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 8, 1);
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endModelMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public ModelMetadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(ModelMetadataT modelMetadataT) {
        AssociatedFileT associatedFileTUnpack;
        modelMetadataT.setName(name());
        modelMetadataT.setDescription(description());
        modelMetadataT.setVersion(version());
        SubGraphMetadataT[] subGraphMetadataTArr = new SubGraphMetadataT[subgraphMetadataLength()];
        int i11 = 0;
        while (true) {
            SubGraphMetadataT subGraphMetadataTUnpack = null;
            if (i11 >= subgraphMetadataLength()) {
                break;
            }
            if (subgraphMetadata(i11) != null) {
                subGraphMetadataTUnpack = subgraphMetadata(i11).unpack();
            }
            subGraphMetadataTArr[i11] = subGraphMetadataTUnpack;
            i11++;
        }
        modelMetadataT.setSubgraphMetadata(subGraphMetadataTArr);
        modelMetadataT.setAuthor(author());
        modelMetadataT.setLicense(license());
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[associatedFilesLength()];
        for (int i12 = 0; i12 < associatedFilesLength(); i12++) {
            if (associatedFiles(i12) != null) {
                associatedFileTUnpack = associatedFiles(i12).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr[i12] = associatedFileTUnpack;
        }
        modelMetadataT.setAssociatedFiles(associatedFileTArr);
        modelMetadataT.setMinParserVersion(minParserVersion());
    }
}
