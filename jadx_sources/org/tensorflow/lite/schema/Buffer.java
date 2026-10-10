package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class Buffer extends Table {

    public static final class Vector extends BaseVector {
        public Buffer get(int i11) {
            return get(new Buffer(), i11);
        }

        public Buffer get(Buffer buffer, int i11) {
            return buffer.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addData(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createBuffer(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addData(flatBufferBuilder, i11);
        return endBuffer(flatBufferBuilder);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static Buffer getRootAsBuffer(ByteBuffer byteBuffer) {
        return getRootAsBuffer(byteBuffer, new Buffer());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, BufferT bufferT) {
        int iCreateDataVector = 0;
        if (bufferT == null) {
            return 0;
        }
        if (bufferT.getData() != null) {
            byte[] bArr = new byte[bufferT.getData().length];
            int[] data = bufferT.getData();
            int length = data.length;
            int i11 = 0;
            while (iCreateDataVector < length) {
                bArr[i11] = (byte) data[iCreateDataVector];
                i11++;
                iCreateDataVector++;
            }
            iCreateDataVector = createDataVector(flatBufferBuilder, bArr);
        }
        return createBuffer(flatBufferBuilder, iCreateDataVector);
    }

    public static void startBuffer(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(1, i11, 1);
    }

    public int data(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(__vector(i__offset) + i11) & 255;
        }
        return 0;
    }

    public ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public int dataLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ByteVector dataVector() {
        return dataVector(new ByteVector());
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static Buffer getRootAsBuffer(ByteBuffer byteBuffer, Buffer buffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return buffer.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ByteVector dataVector(ByteVector byteVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return byteVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public BufferT unpack() {
        BufferT bufferT = new BufferT();
        unpackTo(bufferT);
        return bufferT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endBuffer(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public Buffer __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(BufferT bufferT) {
        int[] iArr = new int[dataLength()];
        for (int i11 = 0; i11 < dataLength(); i11++) {
            iArr[i11] = data(i11);
        }
        bufferT.setData(iArr);
    }
}
