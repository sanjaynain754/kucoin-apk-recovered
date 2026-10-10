package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class BertTokenizerOptions extends Table {

    public static final class Vector extends BaseVector {
        public BertTokenizerOptions get(int i11) {
            return get(new BertTokenizerOptions(), i11);
        }

        public BertTokenizerOptions get(BertTokenizerOptions bertTokenizerOptions, int i11) {
            return bertTokenizerOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addVocabFile(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createBertTokenizerOptions(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addVocabFile(flatBufferBuilder, i11);
        return endBertTokenizerOptions(flatBufferBuilder);
    }

    public static int createVocabFileVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static BertTokenizerOptions getRootAsBertTokenizerOptions(ByteBuffer byteBuffer) {
        return getRootAsBertTokenizerOptions(byteBuffer, new BertTokenizerOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BertTokenizerOptionsT bertTokenizerOptionsT) {
        int iCreateVocabFileVector = 0;
        if (bertTokenizerOptionsT == null) {
            return 0;
        }
        if (bertTokenizerOptionsT.getVocabFile() != null) {
            int[] iArr = new int[bertTokenizerOptionsT.getVocabFile().length];
            AssociatedFileT[] vocabFile = bertTokenizerOptionsT.getVocabFile();
            int length = vocabFile.length;
            int i11 = 0;
            while (iCreateVocabFileVector < length) {
                iArr[i11] = AssociatedFile.pack(flatBufferBuilder, vocabFile[iCreateVocabFileVector]);
                i11++;
                iCreateVocabFileVector++;
            }
            iCreateVocabFileVector = createVocabFileVector(flatBufferBuilder, iArr);
        }
        return createBertTokenizerOptions(flatBufferBuilder, iCreateVocabFileVector);
    }

    public static void startBertTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startVocabFileVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public AssociatedFile vocabFile(int i11) {
        return vocabFile(new AssociatedFile(), i11);
    }

    public int vocabFileLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public AssociatedFile.Vector vocabFileVector() {
        return vocabFileVector(new AssociatedFile.Vector());
    }

    public static BertTokenizerOptions getRootAsBertTokenizerOptions(ByteBuffer byteBuffer, BertTokenizerOptions bertTokenizerOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bertTokenizerOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public BertTokenizerOptionsT unpack() {
        BertTokenizerOptionsT bertTokenizerOptionsT = new BertTokenizerOptionsT();
        unpackTo(bertTokenizerOptionsT);
        return bertTokenizerOptionsT;
    }

    public AssociatedFile vocabFile(AssociatedFile associatedFile, int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return associatedFile.__assign(__indirect(__vector(i__offset) + (i11 * 4)), this.f12714bb);
        }
        return null;
    }

    public AssociatedFile.Vector vocabFileVector(AssociatedFile.Vector vector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return vector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBertTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public BertTokenizerOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BertTokenizerOptionsT bertTokenizerOptionsT) {
        AssociatedFileT associatedFileTUnpack;
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[vocabFileLength()];
        for (int i11 = 0; i11 < vocabFileLength(); i11++) {
            if (vocabFile(i11) != null) {
                associatedFileTUnpack = vocabFile(i11).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr[i11] = associatedFileTUnpack;
        }
        bertTokenizerOptionsT.setVocabFile(associatedFileTArr);
    }
}
