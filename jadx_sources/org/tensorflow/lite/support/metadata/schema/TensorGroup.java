package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.StringVector;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class TensorGroup extends Table {

    public static final class Vector extends BaseVector {
        public TensorGroup get(int i11) {
            return get(new TensorGroup(), i11);
        }

        public TensorGroup get(TensorGroup tensorGroup, int i11) {
            return tensorGroup.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static void addTensorNames(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static int createTensorGroup(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addTensorNames(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        return endTensorGroup(flatBufferBuilder);
    }

    public static int createTensorNamesVector(FlatBufferBuilder flatBufferBuilder, int[] iArr) {
        flatBufferBuilder.startVector(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            flatBufferBuilder.addOffset(iArr[length]);
        }
        return flatBufferBuilder.endVector();
    }

    public static TensorGroup getRootAsTensorGroup(ByteBuffer byteBuffer) {
        return getRootAsTensorGroup(byteBuffer, new TensorGroup());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, TensorGroupT tensorGroupT) {
        int iCreateTensorNamesVector = 0;
        if (tensorGroupT == null) {
            return 0;
        }
        int iCreateString = tensorGroupT.getName() == null ? 0 : flatBufferBuilder.createString(tensorGroupT.getName());
        if (tensorGroupT.getTensorNames() != null) {
            int[] iArr = new int[tensorGroupT.getTensorNames().length];
            String[] tensorNames = tensorGroupT.getTensorNames();
            int length = tensorNames.length;
            int i11 = 0;
            while (iCreateTensorNamesVector < length) {
                iArr[i11] = flatBufferBuilder.createString(tensorNames[iCreateTensorNamesVector]);
                i11++;
                iCreateTensorNamesVector++;
            }
            iCreateTensorNamesVector = createTensorNamesVector(flatBufferBuilder, iArr);
        }
        return createTensorGroup(flatBufferBuilder, iCreateString, iCreateTensorNamesVector);
    }

    public static void startTensorGroup(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void startTensorNamesVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(4, i11, 4);
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

    public String tensorNames(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __string(__vector(i__offset) + (i11 * 4));
        }
        return null;
    }

    public int tensorNamesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public StringVector tensorNamesVector() {
        return tensorNamesVector(new StringVector());
    }

    public static TensorGroup getRootAsTensorGroup(ByteBuffer byteBuffer, TensorGroup tensorGroup) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return tensorGroup.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public StringVector tensorNamesVector(StringVector stringVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return stringVector.__assign(__vector(i__offset), 4, this.f12714bb);
        }
        return null;
    }

    public TensorGroupT unpack() {
        TensorGroupT tensorGroupT = new TensorGroupT();
        unpackTo(tensorGroupT);
        return tensorGroupT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endTensorGroup(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public TensorGroup __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(TensorGroupT tensorGroupT) {
        tensorGroupT.setName(name());
        String[] strArr = new String[tensorNamesLength()];
        for (int i11 = 0; i11 < tensorNamesLength(); i11++) {
            strArr[i11] = tensorNames(i11);
        }
        tensorGroupT.setTensorNames(strArr);
    }
}
