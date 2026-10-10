package androidx.camera.core.impl.utils;

import androidx.camera.core.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes23.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final Charset ASCII = StandardCharsets.US_ASCII;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {BuiltinOptions.FloorDivOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.RangeOptions, BuiltinOptions.RangeOptions, 0, 0, 0};

    public ExifAttribute(int i11, int i12, byte[] bArr) {
        this(i11, i12, -1L, bArr);
    }

    public static ExifAttribute createByte(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new ExifAttribute(1, bytes.length, bytes);
    }

    public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d11 : dArr) {
            byteBufferWrap.putDouble(d11);
        }
        return new ExifAttribute(12, dArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putInt(i11);
        }
        return new ExifAttribute(9, iArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createSRational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        byteBufferWrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            byteBufferWrap.putInt((int) longRational.getNumerator());
            byteBufferWrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j11 : jArr) {
            byteBufferWrap.putInt((int) j11);
        }
        return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createURational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        byteBufferWrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            byteBufferWrap.putInt((int) longRational.getNumerator());
            byteBufferWrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i11 : iArr) {
            byteBufferWrap.putShort((short) i11);
        }
        return new ExifAttribute(3, iArr.length, byteBufferWrap.array());
    }

    /* JADX WARN: Code duplicated, block: B:162:0x018f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0030: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:49), block:B:17:0x0030 */
    public Object getValue(ByteOrder byteOrder) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        InputStream inputStream;
        byte b11;
        byte b12;
        int length = 0;
        InputStream inputStream2 = null;
        try {
            try {
                byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.bytes);
                try {
                    byteOrderedDataInputStream.setByteOrder(byteOrder);
                    switch (this.format) {
                        case 1:
                        case 6:
                            byte[] bArr = this.bytes;
                            if (bArr.length != 1 || (b11 = bArr[0]) < 0 || b11 > 1) {
                                String str = new String(bArr, ASCII);
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str;
                                } catch (IOException e11) {
                                    Logger.m1869e(TAG, "IOException occurred while closing InputStream", e11);
                                    return str;
                                }
                            }
                            String str2 = new String(new char[]{(char) (b11 + BuiltinOptions.SliceOptions)});
                            try {
                                byteOrderedDataInputStream.close();
                                return str2;
                            } catch (IOException e12) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e12);
                                return str2;
                            }
                        case 2:
                        case 7:
                            if (this.numberOfComponents >= EXIF_ASCII_PREFIX.length) {
                                int i11 = 0;
                                while (true) {
                                    byte[] bArr2 = EXIF_ASCII_PREFIX;
                                    if (i11 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (this.bytes[i11] == bArr2[i11]) {
                                        i11++;
                                    }
                                }
                            }
                            StringBuilder sb2 = new StringBuilder();
                            while (length < this.numberOfComponents && (b12 = this.bytes[length]) != 0) {
                                if (b12 >= 32) {
                                    sb2.append((char) b12);
                                } else {
                                    sb2.append('?');
                                }
                                length++;
                            }
                            String string = sb2.toString();
                            try {
                                byteOrderedDataInputStream.close();
                                return string;
                            } catch (IOException e13) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e13);
                                return string;
                            }
                        case 3:
                            int[] iArr = new int[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                iArr[length] = byteOrderedDataInputStream.readUnsignedShort();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return iArr;
                            } catch (IOException e14) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e14);
                                return iArr;
                            }
                        case 4:
                            long[] jArr = new long[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                jArr[length] = byteOrderedDataInputStream.readUnsignedInt();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return jArr;
                            } catch (IOException e15) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e15);
                                return jArr;
                            }
                        case 5:
                            LongRational[] longRationalArr = new LongRational[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                longRationalArr[length] = new LongRational(byteOrderedDataInputStream.readUnsignedInt(), byteOrderedDataInputStream.readUnsignedInt());
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return longRationalArr;
                            } catch (IOException e16) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e16);
                                return longRationalArr;
                            }
                        case 8:
                            int[] iArr2 = new int[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                iArr2[length] = byteOrderedDataInputStream.readShort();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return iArr2;
                            } catch (IOException e17) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e17);
                                return iArr2;
                            }
                        case 9:
                            int[] iArr3 = new int[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                iArr3[length] = byteOrderedDataInputStream.readInt();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return iArr3;
                            } catch (IOException e18) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e18);
                                return iArr3;
                            }
                        case 10:
                            LongRational[] longRationalArr2 = new LongRational[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                longRationalArr2[length] = new LongRational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return longRationalArr2;
                            } catch (IOException e19) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e19);
                                return longRationalArr2;
                            }
                        case 11:
                            double[] dArr = new double[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                dArr[length] = byteOrderedDataInputStream.readFloat();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return dArr;
                            } catch (IOException e21) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e21);
                                return dArr;
                            }
                        case 12:
                            double[] dArr2 = new double[this.numberOfComponents];
                            while (length < this.numberOfComponents) {
                                dArr2[length] = byteOrderedDataInputStream.readDouble();
                                length++;
                            }
                            try {
                                byteOrderedDataInputStream.close();
                                return dArr2;
                            } catch (IOException e22) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e22);
                                return dArr2;
                            }
                        default:
                            try {
                                byteOrderedDataInputStream.close();
                                return null;
                            } catch (IOException e23) {
                                Logger.m1869e(TAG, "IOException occurred while closing InputStream", e23);
                                return null;
                            }
                    }
                } catch (IOException e24) {
                    e = e24;
                    Logger.m1873w(TAG, "IOException occurred during reading a value", e);
                    if (byteOrderedDataInputStream != null) {
                        try {
                            byteOrderedDataInputStream.close();
                        } catch (IOException e25) {
                            Logger.m1869e(TAG, "IOException occurred while closing InputStream", e25);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e26) {
                        Logger.m1869e(TAG, "IOException occurred while closing InputStream", e26);
                    }
                }
                throw th;
            }
        } catch (IOException e27) {
            e = e27;
            byteOrderedDataInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream2 != null) {
                inputStream2.close();
            }
            throw th;
        }
    }

    public ExifAttribute(int i11, int i12, long j11, byte[] bArr) {
        this.format = i11;
        this.numberOfComponents = i12;
        this.bytesOffset = j11;
        this.bytes = bArr;
    }

    public static ExifAttribute createString(String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes.length, bytes);
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public String toString() {
        return "(" + IFD_FORMAT_NAMES[this.format] + ", data length:" + this.bytes.length + ")";
    }

    public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value != null) {
            if (value instanceof String) {
                return Double.parseDouble((String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof double[]) {
                double[] dArr = (double[]) value;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof LongRational[]) {
                LongRational[] longRationalArr = (LongRational[]) value;
                if (longRationalArr.length == 1) {
                    return longRationalArr[0].toDouble();
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public int getIntValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value != null) {
            if (value instanceof String) {
                return Integer.parseInt((String) value);
            }
            if (value instanceof long[]) {
                long[] jArr = (long[]) value;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (value instanceof int[]) {
                int[] iArr = (int[]) value;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public String getStringValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i11 < jArr.length) {
                sb2.append(jArr[i11]);
                i11++;
                if (i11 != jArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i11 < iArr.length) {
                sb2.append(iArr[i11]);
                i11++;
                if (i11 != iArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i11 < dArr.length) {
                sb2.append(dArr[i11]);
                i11++;
                if (i11 != dArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }
        if (!(value instanceof LongRational[])) {
            return null;
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        while (i11 < longRationalArr.length) {
            sb2.append(longRationalArr[i11].getNumerator());
            sb2.append('/');
            sb2.append(longRationalArr[i11].getDenominator());
            i11++;
            if (i11 != longRationalArr.length) {
                sb2.append(",");
            }
        }
        return sb2.toString();
    }

    public static ExifAttribute createDouble(double d11, ByteOrder byteOrder) {
        return createDouble(new double[]{d11}, byteOrder);
    }

    public static ExifAttribute createSLong(int i11, ByteOrder byteOrder) {
        return createSLong(new int[]{i11}, byteOrder);
    }

    public static ExifAttribute createULong(long j11, ByteOrder byteOrder) {
        return createULong(new long[]{j11}, byteOrder);
    }

    public static ExifAttribute createUShort(int i11, ByteOrder byteOrder) {
        return createUShort(new int[]{i11}, byteOrder);
    }

    public static ExifAttribute createSRational(LongRational longRational, ByteOrder byteOrder) {
        return createSRational(new LongRational[]{longRational}, byteOrder);
    }

    public static ExifAttribute createURational(LongRational longRational, ByteOrder byteOrder) {
        return createURational(new LongRational[]{longRational}, byteOrder);
    }
}
