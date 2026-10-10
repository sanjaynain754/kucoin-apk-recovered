package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class SentencePieceTokenizerOptions extends Table {

    public static final class Vector extends BaseVector {
        public SentencePieceTokenizerOptions get(int i11) {
            return get(new SentencePieceTokenizerOptions(), i11);
        }

        public SentencePieceTokenizerOptions get(SentencePieceTokenizerOptions sentencePieceTokenizerOptions, int i11) {
            return sentencePieceTokenizerOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addSentencePieceModel(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addVocabFile(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createSentencePieceModelVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static int createSentencePieceTokenizerOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addVocabFile(flatBufferBuilder, i12);
        addSentencePieceModel(flatBufferBuilder, i11);
        return endSentencePieceTokenizerOptions(flatBufferBuilder);
    }

    public static int createVocabFileVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static SentencePieceTokenizerOptions getRootAsSentencePieceTokenizerOptions(ByteBuffer byteBuffer) {
        return getRootAsSentencePieceTokenizerOptions(byteBuffer, new SentencePieceTokenizerOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, SentencePieceTokenizerOptionsT sentencePieceTokenizerOptionsT) {
        int iCreateSentencePieceModelVector;
        int iCreateVocabFileVector = 0;
        if (sentencePieceTokenizerOptionsT == null) {
            return 0;
        }
        if (sentencePieceTokenizerOptionsT.getSentencePieceModel() != null) {
            int[] iArr = new int[sentencePieceTokenizerOptionsT.getSentencePieceModel().length];
            int i11 = 0;
            for (AssociatedFileT associatedFileT : sentencePieceTokenizerOptionsT.getSentencePieceModel()) {
                iArr[i11] = AssociatedFile.pack(flatBufferBuilder, associatedFileT);
                i11++;
            }
            iCreateSentencePieceModelVector = createSentencePieceModelVector(flatBufferBuilder, iArr);
        } else {
            iCreateSentencePieceModelVector = 0;
        }
        if (sentencePieceTokenizerOptionsT.getVocabFile() != null) {
            int[] iArr2 = new int[sentencePieceTokenizerOptionsT.getVocabFile().length];
            AssociatedFileT[] vocabFile = sentencePieceTokenizerOptionsT.getVocabFile();
            int length = vocabFile.length;
            int i12 = 0;
            while (iCreateVocabFileVector < length) {
                iArr2[i12] = AssociatedFile.pack(flatBufferBuilder, vocabFile[iCreateVocabFileVector]);
                i12++;
                iCreateVocabFileVector++;
            }
            iCreateVocabFileVector = createVocabFileVector(flatBufferBuilder, iArr2);
        }
        return createSentencePieceTokenizerOptions(flatBufferBuilder, iCreateSentencePieceModelVector, iCreateVocabFileVector);
    }

    public static void startSentencePieceModelVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public static void startSentencePieceTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void startVocabFileVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public AssociatedFile sentencePieceModel(int i11) {
        return sentencePieceModel(new AssociatedFile(), i11);
    }

    public int sentencePieceModelLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public AssociatedFile.Vector sentencePieceModelVector() {
        return sentencePieceModelVector(new AssociatedFile.Vector());
    }

    public AssociatedFile vocabFile(int i11) {
        return vocabFile(new AssociatedFile(), i11);
    }

    public int vocabFileLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public AssociatedFile.Vector vocabFileVector() {
        return vocabFileVector(new AssociatedFile.Vector());
    }

    public static SentencePieceTokenizerOptions getRootAsSentencePieceTokenizerOptions(ByteBuffer byteBuffer, SentencePieceTokenizerOptions sentencePieceTokenizerOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return sentencePieceTokenizerOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public AssociatedFile sentencePieceModel(AssociatedFile associatedFile, int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return associatedFile.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public AssociatedFile.Vector sentencePieceModelVector(AssociatedFile.Vector vector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public SentencePieceTokenizerOptionsT unpack() {
        SentencePieceTokenizerOptionsT sentencePieceTokenizerOptionsT = new SentencePieceTokenizerOptionsT();
        unpackTo(sentencePieceTokenizerOptionsT);
        return sentencePieceTokenizerOptionsT;
    }

    public AssociatedFile vocabFile(AssociatedFile associatedFile, int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return associatedFile.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public AssociatedFile.Vector vocabFileVector(AssociatedFile.Vector vector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endSentencePieceTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public SentencePieceTokenizerOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(SentencePieceTokenizerOptionsT sentencePieceTokenizerOptionsT) {
        AssociatedFileT associatedFileTUnpack;
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[sentencePieceModelLength()];
        int i11 = 0;
        while (true) {
            AssociatedFileT associatedFileTUnpack2 = null;
            if (i11 >= sentencePieceModelLength()) {
                break;
            }
            if (sentencePieceModel(i11) != null) {
                associatedFileTUnpack2 = sentencePieceModel(i11).unpack();
            }
            associatedFileTArr[i11] = associatedFileTUnpack2;
            i11++;
        }
        sentencePieceTokenizerOptionsT.setSentencePieceModel(associatedFileTArr);
        AssociatedFileT[] associatedFileTArr2 = new AssociatedFileT[vocabFileLength()];
        for (int i12 = 0; i12 < vocabFileLength(); i12++) {
            if (vocabFile(i12) != null) {
                associatedFileTUnpack = vocabFile(i12).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr2[i12] = associatedFileTUnpack;
        }
        sentencePieceTokenizerOptionsT.setVocabFile(associatedFileTArr2);
    }
}
