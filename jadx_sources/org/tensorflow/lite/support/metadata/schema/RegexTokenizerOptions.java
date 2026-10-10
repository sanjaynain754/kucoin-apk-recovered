package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class RegexTokenizerOptions extends Table {

    public static final class Vector extends BaseVector {
        public RegexTokenizerOptions get(int i11) {
            return get(new RegexTokenizerOptions(), i11);
        }

        public RegexTokenizerOptions get(RegexTokenizerOptions regexTokenizerOptions, int i11) {
            return regexTokenizerOptions.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addDelimRegexPattern(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addVocabFile(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createRegexTokenizerOptions(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addVocabFile(flatBufferBuilder, i12);
        addDelimRegexPattern(flatBufferBuilder, i11);
        return endRegexTokenizerOptions(flatBufferBuilder);
    }

    public static int createVocabFileVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static RegexTokenizerOptions getRootAsRegexTokenizerOptions(ByteBuffer byteBuffer) {
        return getRootAsRegexTokenizerOptions(byteBuffer, new RegexTokenizerOptions());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, RegexTokenizerOptionsT regexTokenizerOptionsT) {
        int iCreateVocabFileVector = 0;
        if (regexTokenizerOptionsT == null) {
            return 0;
        }
        int iCreateString = regexTokenizerOptionsT.getDelimRegexPattern() == null ? 0 : flatBufferBuilder.createString(regexTokenizerOptionsT.getDelimRegexPattern());
        if (regexTokenizerOptionsT.getVocabFile() != null) {
            int[] iArr = new int[regexTokenizerOptionsT.getVocabFile().length];
            AssociatedFileT[] vocabFile = regexTokenizerOptionsT.getVocabFile();
            int length = vocabFile.length;
            int i11 = 0;
            while (iCreateVocabFileVector < length) {
                iArr[i11] = AssociatedFile.pack(flatBufferBuilder, vocabFile[iCreateVocabFileVector]);
                i11++;
                iCreateVocabFileVector++;
            }
            iCreateVocabFileVector = createVocabFileVector(flatBufferBuilder, iArr);
        }
        return createRegexTokenizerOptions(flatBufferBuilder, iCreateString, iCreateVocabFileVector);
    }

    public static void startRegexTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void startVocabFileVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
    }

    public String delimRegexPattern() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __string(i__offset + this.bb_pos);
        }
        return null;
    }

    public ByteBuffer delimRegexPatternAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer delimRegexPatternInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
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

    public static RegexTokenizerOptions getRootAsRegexTokenizerOptions(ByteBuffer byteBuffer, RegexTokenizerOptions regexTokenizerOptions) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return regexTokenizerOptions.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public RegexTokenizerOptionsT unpack() {
        RegexTokenizerOptionsT regexTokenizerOptionsT = new RegexTokenizerOptionsT();
        unpackTo(regexTokenizerOptionsT);
        return regexTokenizerOptionsT;
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

    public static int endRegexTokenizerOptions(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public RegexTokenizerOptions __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(RegexTokenizerOptionsT regexTokenizerOptionsT) {
        AssociatedFileT associatedFileTUnpack;
        regexTokenizerOptionsT.setDelimRegexPattern(delimRegexPattern());
        AssociatedFileT[] associatedFileTArr = new AssociatedFileT[vocabFileLength()];
        for (int i11 = 0; i11 < vocabFileLength(); i11++) {
            if (vocabFile(i11) != null) {
                associatedFileTUnpack = vocabFile(i11).unpack();
            } else {
                associatedFileTUnpack = null;
            }
            associatedFileTArr[i11] = associatedFileTUnpack;
        }
        regexTokenizerOptionsT.setVocabFile(associatedFileTArr);
    }
}
