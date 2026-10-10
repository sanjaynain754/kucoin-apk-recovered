package org.tensorflow.lite.support.metadata.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CustomMetadata extends Table {

    public static final class Vector extends BaseVector {
        public CustomMetadata get(int i11) {
            return get(new CustomMetadata(), i11);
        }

        public CustomMetadata get(CustomMetadata customMetadata, int i11) {
            return customMetadata.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addData(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(1, i11, 0);
    }

    public static void addName(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createCustomMetadata(FlatBufferBuilder flatBufferBuilder, int i11, int i12) {
        flatBufferBuilder.startTable(2);
        addData(flatBufferBuilder, i12);
        addName(flatBufferBuilder, i11);
        return endCustomMetadata(flatBufferBuilder);
    }

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static CustomMetadata getRootAsCustomMetadata(ByteBuffer byteBuffer) {
        return getRootAsCustomMetadata(byteBuffer, new CustomMetadata());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CustomMetadataT customMetadataT) {
        int iCreateDataVector = 0;
        if (customMetadataT == null) {
            return 0;
        }
        int iCreateString = customMetadataT.getName() == null ? 0 : flatBufferBuilder.createString(customMetadataT.getName());
        if (customMetadataT.getData() != null) {
            byte[] bArr = new byte[customMetadataT.getData().length];
            int[] data = customMetadataT.getData();
            int length = data.length;
            int i11 = 0;
            while (iCreateDataVector < length) {
                bArr[i11] = (byte) data[iCreateDataVector];
                i11++;
                iCreateDataVector++;
            }
            iCreateDataVector = createDataVector(flatBufferBuilder, bArr);
        }
        return createCustomMetadata(flatBufferBuilder, iCreateString, iCreateDataVector);
    }

    public static void startCustomMetadata(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(2);
    }

    public static void startDataVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(1, i11, 1);
    }

    public int data(int i11) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return this.f12714bb.get(__vector(i__offset) + i11) & 255;
        }
        return 0;
    }

    public ByteBuffer dataAsByteBuffer() {
        return __vector_as_bytebuffer(6, 1);
    }

    public ByteBuffer dataInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 6, 1);
    }

    public int dataLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ByteVector dataVector() {
        return dataVector(new ByteVector());
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

    public static int createDataVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static CustomMetadata getRootAsCustomMetadata(ByteBuffer byteBuffer, CustomMetadata customMetadata) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return customMetadata.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ByteVector dataVector(ByteVector byteVector) {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return byteVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public CustomMetadataT unpack() {
        CustomMetadataT customMetadataT = new CustomMetadataT();
        unpackTo(customMetadataT);
        return customMetadataT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCustomMetadata(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CustomMetadata __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CustomMetadataT customMetadataT) {
        customMetadataT.setName(name());
        int[] iArr = new int[dataLength()];
        for (int i11 = 0; i11 < dataLength(); i11++) {
            iArr[i11] = data(i11);
        }
        customMetadataT.setData(iArr);
    }
}
