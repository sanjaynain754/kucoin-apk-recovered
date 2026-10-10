package org.tensorflow.lite.schema;

import com.google.flatbuffers.BaseVector;
import com.google.flatbuffers.ByteVector;
import com.google.flatbuffers.Constants;
import com.google.flatbuffers.FlatBufferBuilder;
import com.google.flatbuffers.Table;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes61.dex */
public final class CustomQuantization extends Table {

    public static final class Vector extends BaseVector {
        public CustomQuantization get(int i11) {
            return get(new CustomQuantization(), i11);
        }

        public CustomQuantization get(CustomQuantization customQuantization, int i11) {
            return customQuantization.__assign(Table.__indirect(__element(i11), this.f12708bb), this.f12708bb);
        }

        public Vector __assign(int i11, int i12, ByteBuffer byteBuffer) {
            __reset(i11, i12, byteBuffer);
            return this;
        }
    }

    public static void addCustom(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.addOffset(0, i11, 0);
    }

    public static int createCustomQuantization(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startTable(1);
        addCustom(flatBufferBuilder, i11);
        return endCustomQuantization(flatBufferBuilder);
    }

    public static int createCustomVector(FlatBufferBuilder flatBufferBuilder, byte[] bArr) {
        return flatBufferBuilder.createByteVector(bArr);
    }

    public static CustomQuantization getRootAsCustomQuantization(ByteBuffer byteBuffer) {
        return getRootAsCustomQuantization(byteBuffer, new CustomQuantization());
    }

    public static int pack(FlatBufferBuilder flatBufferBuilder, CustomQuantizationT customQuantizationT) {
        int iCreateCustomVector = 0;
        if (customQuantizationT == null) {
            return 0;
        }
        if (customQuantizationT.getCustom() != null) {
            byte[] bArr = new byte[customQuantizationT.getCustom().length];
            int[] custom = customQuantizationT.getCustom();
            int length = custom.length;
            int i11 = 0;
            while (iCreateCustomVector < length) {
                bArr[i11] = (byte) custom[iCreateCustomVector];
                i11++;
                iCreateCustomVector++;
            }
            iCreateCustomVector = createCustomVector(flatBufferBuilder, bArr);
        }
        return createCustomQuantization(flatBufferBuilder, iCreateCustomVector);
    }

    public static void startCustomQuantization(FlatBufferBuilder flatBufferBuilder) {
        flatBufferBuilder.startTable(1);
    }

    public static void startCustomVector(FlatBufferBuilder flatBufferBuilder, int i11) {
        flatBufferBuilder.startVector(1, i11, 1);
    }

    public int custom(int i11) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return this.f12714bb.get(__vector(i__offset) + i11) & 255;
        }
        return 0;
    }

    public ByteBuffer customAsByteBuffer() {
        return __vector_as_bytebuffer(4, 1);
    }

    public ByteBuffer customInByteBuffer(ByteBuffer byteBuffer) {
        return __vector_in_bytebuffer(byteBuffer, 4, 1);
    }

    public int customLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    public ByteVector customVector() {
        return customVector(new ByteVector());
    }

    public static int createCustomVector(FlatBufferBuilder flatBufferBuilder, ByteBuffer byteBuffer) {
        return flatBufferBuilder.createByteVector(byteBuffer);
    }

    public static CustomQuantization getRootAsCustomQuantization(ByteBuffer byteBuffer, CustomQuantization customQuantization) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return customQuantization.__assign(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public ByteVector customVector(ByteVector byteVector) {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return byteVector.__assign(__vector(i__offset), this.f12714bb);
        }
        return null;
    }

    public CustomQuantizationT unpack() {
        CustomQuantizationT customQuantizationT = new CustomQuantizationT();
        unpackTo(customQuantizationT);
        return customQuantizationT;
    }

    public static void ValidateVersion() {
        Constants.FLATBUFFERS_23_5_26();
    }

    public static int endCustomQuantization(FlatBufferBuilder flatBufferBuilder) {
        return flatBufferBuilder.endTable();
    }

    public CustomQuantization __assign(int i11, ByteBuffer byteBuffer) {
        __init(i11, byteBuffer);
        return this;
    }

    public void __init(int i11, ByteBuffer byteBuffer) {
        __reset(i11, byteBuffer);
    }

    public void unpackTo(CustomQuantizationT customQuantizationT) {
        int[] iArr = new int[customLength()];
        for (int i11 = 0; i11 < customLength(); i11++) {
            iArr[i11] = custom(i11);
        }
        customQuantizationT.setCustom(iArr);
    }
}
