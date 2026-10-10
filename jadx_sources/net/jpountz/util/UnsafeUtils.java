package net.jpountz.util;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import p852kotlin.UShort;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes61.dex */
public enum UnsafeUtils {
    ;


    /* JADX INFO: renamed from: b */
    public static final Unsafe f94868b;

    /* JADX INFO: renamed from: c */
    public static final long f94869c;

    /* JADX INFO: renamed from: d */
    public static final int f94870d;

    /* JADX INFO: renamed from: e */
    public static final long f94871e;

    /* JADX INFO: renamed from: f */
    public static final int f94872f;

    /* JADX INFO: renamed from: g */
    public static final long f94873g;

    /* JADX INFO: renamed from: h */
    public static final int f94874h;

    public static void checkRange(byte[] bArr, int i11) {
        SafeUtils.checkRange(bArr, i11);
    }

    public static int readInt(byte[] bArr, int i11) {
        return f94868b.getInt(bArr, f94869c + ((long) i11));
    }

    public static short readShort(byte[] bArr, int i11) {
        return f94868b.getShort(bArr, f94869c + ((long) i11));
    }

    public static void writeByte(byte[] bArr, int i11, byte b11) {
        f94868b.putByte(bArr, f94869c + ((long) (f94870d * i11)), b11);
    }

    public static void writeInt(byte[] bArr, int i11, int i12) {
        f94868b.putInt(bArr, f94869c + ((long) i11), i12);
    }

    public static void writeShort(byte[] bArr, int i11, short s11) {
        f94868b.putShort(bArr, f94869c + ((long) i11), s11);
    }

    public static void writeShortLE(byte[] bArr, int i11, int i12) {
        writeByte(bArr, i11, (byte) i12);
        writeByte(bArr, i11 + 1, (byte) (i12 >>> 8));
    }

    static {
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Unsafe unsafe = (Unsafe) declaredField.get(null);
            f94868b = unsafe;
            f94869c = unsafe.arrayBaseOffset(byte[].class);
            f94870d = unsafe.arrayIndexScale(byte[].class);
            f94871e = unsafe.arrayBaseOffset(int[].class);
            f94872f = unsafe.arrayIndexScale(int[].class);
            f94873g = unsafe.arrayBaseOffset(short[].class);
            f94874h = unsafe.arrayIndexScale(short[].class);
        } catch (IllegalAccessException unused) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (NoSuchFieldException unused2) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        } catch (SecurityException unused3) {
            throw new ExceptionInInitializerError("Cannot access Unsafe");
        }
    }

    public static void checkRange(byte[] bArr, int i11, int i12) {
        SafeUtils.checkRange(bArr, i11, i12);
    }

    public static byte readByte(byte[] bArr, int i11) {
        return f94868b.getByte(bArr, f94869c + ((long) (f94870d * i11)));
    }

    public static int readInt(int[] iArr, int i11) {
        return f94868b.getInt(iArr, f94871e + ((long) (f94872f * i11)));
    }

    public static long readLong(byte[] bArr, int i11) {
        return f94868b.getLong(bArr, f94869c + ((long) i11));
    }

    public static int readShort(short[] sArr, int i11) {
        return f94868b.getShort(sArr, f94873g + ((long) (f94874h * i11))) & UShort.MAX_VALUE;
    }

    public static void writeByte(byte[] bArr, int i11, int i12) {
        writeByte(bArr, i11, (byte) i12);
    }

    public static void writeInt(int[] iArr, int i11, int i12) {
        f94868b.putInt(iArr, f94871e + ((long) (f94872f * i11)), i12);
    }

    public static void writeLong(byte[] bArr, int i11, long j11) {
        f94868b.putLong(bArr, f94869c + ((long) i11), j11);
    }

    public static void writeShort(short[] sArr, int i11, int i12) {
        f94868b.putShort(sArr, f94873g + ((long) (f94874h * i11)), (short) i12);
    }

    public static void checkLength(int i11) {
        SafeUtils.checkLength(i11);
    }

    public static int readIntLE(byte[] bArr, int i11) {
        int i12 = readInt(bArr, i11);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return Integer.reverseBytes(i12);
        }
        return i12;
    }

    public static long readLongLE(byte[] bArr, int i11) {
        long j11 = readLong(bArr, i11);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return Long.reverseBytes(j11);
        }
        return j11;
    }

    public static int readShortLE(byte[] bArr, int i11) {
        short sReverseBytes = readShort(bArr, i11);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        return sReverseBytes & UShort.MAX_VALUE;
    }
}
