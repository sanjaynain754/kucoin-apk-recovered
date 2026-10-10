package net.jpountz.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes61.dex */
public enum ByteBufferUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static void checkRange(ByteBuffer byteBuffer, int i11, int i12) {
        SafeUtils.checkLength(i12);
        if (i12 > 0) {
            checkRange(byteBuffer, i11);
            checkRange(byteBuffer, (i11 + i12) - 1);
        }
    }

    public static void writeByte(ByteBuffer byteBuffer, int i11, int i12) {
        byteBuffer.put(i11, (byte) i12);
    }

    public static void writeShortLE(ByteBuffer byteBuffer, int i11, int i12) {
        byteBuffer.put(i11, (byte) i12);
        byteBuffer.put(i11 + 1, (byte) (i12 >>> 8));
    }

    public static void checkNotReadOnly(ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly()) {
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static ByteBuffer inLittleEndianOrder(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (byteOrderOrder.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static ByteBuffer inNativeByteOrder(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = Utils.NATIVE_BYTE_ORDER;
        if (byteOrderOrder.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static byte readByte(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.get(i11);
    }

    public static int readInt(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getInt(i11);
    }

    public static int readIntLE(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getInt(i11);
    }

    public static long readLong(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getLong(i11);
    }

    public static long readLongLE(ByteBuffer byteBuffer, int i11) {
        return byteBuffer.getLong(i11);
    }

    public static int readShortLE(ByteBuffer byteBuffer, int i11) {
        return ((byteBuffer.get(i11 + 1) & 255) << 8) | (byteBuffer.get(i11) & 255);
    }

    public static void writeInt(ByteBuffer byteBuffer, int i11, int i12) {
        byteBuffer.putInt(i11, i12);
    }

    public static void writeLong(ByteBuffer byteBuffer, int i11, long j11) {
        byteBuffer.putLong(i11, j11);
    }

    public static void checkRange(ByteBuffer byteBuffer, int i11) {
        if (i11 < 0 || i11 >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i11);
        }
    }
}
