package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ma */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33794ma {

    /* JADX INFO: renamed from: a */
    public static final int f70946a = 37;

    /* JADX INFO: renamed from: b */
    public static final int f70947b = 17;

    /* JADX INFO: renamed from: c */
    public static final byte[] f70948c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f70949d;

    /* JADX INFO: renamed from: a */
    public static int m74063a(byte b11) {
        return b11 + BuiltinOptions.DynamicUpdateSliceOptions;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74103b(byte b11, byte b12) {
        return b11 == b12;
    }

    static {
        byte[] bArr = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.SquareOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = bArr[i11 >>> 4];
            bArr3[i11] = bArr[i11 & 15];
        }
        f70948c = bArr2;
        f70949d = bArr3;
    }

    /* JADX INFO: renamed from: a */
    public static int m74064a(byte b11, byte b12) {
        if (b11 < b12) {
            return -1;
        }
        return b11 > b12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74104b(char c11, char c12) {
        return c11 == c12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74065a(char c11) {
        return c11 + 629;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74105b(double d11, double d12) {
        return d11 == d12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74066a(char c11, char c12) {
        if (c11 < c12) {
            return -1;
        }
        return c11 > c12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74106b(float f11, float f12) {
        return f11 == f12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74068a(double d11, double d12) {
        if (d11 < d12) {
            return -1;
        }
        return d11 > d12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74107b(int i11, int i12) {
        return i11 == i12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74070a(float f11, float f12) {
        if (f11 < f12) {
            return -1;
        }
        return f11 > f12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74108b(long j11, long j12) {
        return j11 == j12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74071a(int i11) {
        return i11 + 629;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74109b(short s11, short s12) {
        return s11 == s12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74072a(int i11, int i12) {
        if (i11 < i12) {
            return -1;
        }
        return i11 > i12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m74110b(boolean z11, boolean z12) {
        return z11 == z12;
    }

    /* JADX INFO: renamed from: a */
    public static int m74073a(long j11) {
        return ((int) (j11 ^ (j11 >> 32))) + 629;
    }

    /* JADX INFO: renamed from: b */
    public static int m74102b(byte[] bArr) {
        if (bArr == null) {
            return 629;
        }
        int i11 = 17;
        for (byte b11 : bArr) {
            i11 = (i11 * 37) + b11;
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74074a(long j11, long j12) {
        if (j11 < j12) {
            return -1;
        }
        return j11 > j12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m74078a(short s11) {
        return s11 + 629;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m74111b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, iPosition);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static int m74079a(short s11, short s12) {
        if (s11 < s12) {
            return -1;
        }
        return s11 > s12 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public static int m74080a(boolean z11) {
        return (!z11 ? 1 : 0) + 629;
    }

    /* JADX INFO: renamed from: a */
    public static int m74081a(boolean z11, boolean z12) {
        return (z11 ? 1 : 0) - (z12 ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74101a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Comparable<T>> int m74075a(T t11, T t12) {
        return t11.compareTo(t12);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Comparable<T>> int m74077a(List<T> list, List<T> list2) {
        Iterator<T> it = list.iterator();
        Iterator<T> it2 = list2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = it.next().compareTo(it2.next());
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return (it.hasNext() ? 1 : 0) - (it2.hasNext() ? 1 : 0);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Comparable<T>> int m74094a(T[] tArr, T[] tArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < tArr.length && i12 < tArr2.length; i12++) {
            int iCompareTo = tArr[i11].compareTo(tArr2[i12]);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i11++;
        }
        return m74072a(tArr.length, tArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74098a(boolean[] zArr, boolean[] zArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < zArr.length && i12 < zArr2.length; i12++) {
            int i13 = (zArr[i11] ? 1 : 0) - (zArr2[i12] ? 1 : 0);
            if (i13 != 0) {
                return i13;
            }
            i11++;
        }
        return m74072a(zArr.length, zArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74082a(byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < bArr.length && i12 < bArr2.length; i12++) {
            int iM74064a = m74064a(bArr[i11], bArr2[i12]);
            if (iM74064a != 0) {
                return iM74064a;
            }
            i11++;
        }
        return m74072a(bArr.length, bArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74084a(char[] cArr, char[] cArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < cArr.length && i12 < cArr2.length; i12++) {
            int iM74066a = m74066a(cArr[i11], cArr2[i12]);
            if (iM74066a != 0) {
                return iM74066a;
            }
            i11++;
        }
        return m74072a(cArr.length, cArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74096a(short[] sArr, short[] sArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < sArr.length && i12 < sArr2.length; i12++) {
            int iM74079a = m74079a(sArr[i11], sArr2[i12]);
            if (iM74079a != 0) {
                return iM74079a;
            }
            i11++;
        }
        return m74072a(sArr.length, sArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74090a(int[] iArr, int[] iArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < iArr.length && i12 < iArr2.length; i12++) {
            int iM74072a = m74072a(iArr[i11], iArr2[i12]);
            if (iM74072a != 0) {
                return iM74072a;
            }
            i11++;
        }
        return m74072a(iArr.length, iArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74092a(long[] jArr, long[] jArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < jArr.length && i12 < jArr2.length; i12++) {
            int iM74074a = m74074a(jArr[i11], jArr2[i12]);
            if (iM74074a != 0) {
                return iM74074a;
            }
            i11++;
        }
        return m74072a(jArr.length, jArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74088a(float[] fArr, float[] fArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < fArr.length && i12 < fArr2.length; i12++) {
            int iM74070a = m74070a(fArr[i11], fArr2[i12]);
            if (iM74070a != 0) {
                return iM74070a;
            }
            i11++;
        }
        return m74072a(fArr.length, fArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74086a(double[] dArr, double[] dArr2) {
        int i11 = 0;
        for (int i12 = 0; i11 < dArr.length && i12 < dArr2.length; i12++) {
            int iM74068a = m74068a(dArr[i11], dArr2[i12]);
            if (iM74068a != 0) {
                return iM74068a;
            }
            i11++;
        }
        return m74072a(dArr.length, dArr2.length);
    }

    /* JADX INFO: renamed from: a */
    public static int m74097a(boolean[] zArr) {
        if (zArr == null) {
            return 629;
        }
        int i11 = 17;
        for (boolean z11 : zArr) {
            i11 = (i11 * 37) + (!z11 ? 1 : 0);
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74083a(char[] cArr) {
        if (cArr == null) {
            return 629;
        }
        int i11 = 17;
        for (char c11 : cArr) {
            i11 = (i11 * 37) + c11;
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74067a(double d11) {
        return m74073a(Double.doubleToLongBits(d11));
    }

    /* JADX INFO: renamed from: a */
    public static int m74085a(double[] dArr) {
        if (dArr == null) {
            return 629;
        }
        int iDoubleToLongBits = 17;
        for (int i11 = 0; i11 < dArr.length; i11++) {
            iDoubleToLongBits = (iDoubleToLongBits * 37) + ((int) (Double.doubleToLongBits(dArr[i11]) ^ (Double.doubleToLongBits(dArr[i11]) >> 32)));
        }
        return iDoubleToLongBits;
    }

    /* JADX INFO: renamed from: a */
    public static int m74069a(float f11) {
        return Float.floatToIntBits(f11) + 629;
    }

    /* JADX INFO: renamed from: a */
    public static int m74087a(float[] fArr) {
        if (fArr == null) {
            return 629;
        }
        int iFloatToIntBits = 17;
        for (float f11 : fArr) {
            iFloatToIntBits = (iFloatToIntBits * 37) + Float.floatToIntBits(f11);
        }
        return iFloatToIntBits;
    }

    /* JADX INFO: renamed from: a */
    public static int m74095a(short[] sArr) {
        if (sArr == null) {
            return 629;
        }
        int i11 = 17;
        for (short s11 : sArr) {
            i11 = (i11 * 37) + s11;
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74089a(int[] iArr) {
        if (iArr == null) {
            return 629;
        }
        int i11 = 17;
        for (int i12 : iArr) {
            i11 = (i11 * 37) + i12;
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74091a(long[] jArr) {
        if (jArr == null) {
            return 629;
        }
        int i11 = 17;
        for (long j11 : jArr) {
            i11 = (i11 * 37) + ((int) (j11 ^ (j11 >> 32)));
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static int m74093a(JceStruct[] jceStructArr) {
        if (jceStructArr == null) {
            return 629;
        }
        int iHashCode = 17;
        for (JceStruct jceStruct : jceStructArr) {
            iHashCode = (iHashCode * 37) + jceStruct.hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: a */
    public static int m74076a(Object obj) {
        if (obj == null) {
            return 629;
        }
        if (obj.getClass().isArray()) {
            if (obj instanceof long[]) {
                return m74091a((long[]) obj);
            }
            if (obj instanceof int[]) {
                return m74089a((int[]) obj);
            }
            if (obj instanceof short[]) {
                return m74095a((short[]) obj);
            }
            if (obj instanceof char[]) {
                return m74083a((char[]) obj);
            }
            if (obj instanceof byte[]) {
                return m74102b((byte[]) obj);
            }
            if (obj instanceof double[]) {
                return m74085a((double[]) obj);
            }
            if (obj instanceof float[]) {
                return m74087a((float[]) obj);
            }
            if (obj instanceof boolean[]) {
                return m74097a((boolean[]) obj);
            }
            if (obj instanceof JceStruct[]) {
                return m74093a((JceStruct[]) obj);
            }
            return m74076a((Object[]) obj);
        }
        if (obj instanceof JceStruct) {
            return obj.hashCode();
        }
        return obj.hashCode() + 629;
    }

    /* JADX INFO: renamed from: a */
    public static String m74100a(byte[] bArr) {
        return m74099a(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: renamed from: a */
    public static String m74099a(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining == 0) {
            return "empty";
        }
        StringBuffer stringBuffer = new StringBuffer((byteBuffer.remaining() * 3) - 1);
        int iPosition = byteBuffer.position();
        int i11 = byteBuffer.get() & 255;
        stringBuffer.append((char) f70948c[i11]);
        stringBuffer.append((char) f70949d[i11]);
        while (true) {
            iRemaining--;
            if (iRemaining > 0) {
                stringBuffer.append(' ');
                int i12 = byteBuffer.get() & 255;
                stringBuffer.append((char) f70948c[i12]);
                stringBuffer.append((char) f70949d[i12]);
            } else {
                byteBuffer.position(iPosition);
                return stringBuffer.toString();
            }
        }
    }
}
