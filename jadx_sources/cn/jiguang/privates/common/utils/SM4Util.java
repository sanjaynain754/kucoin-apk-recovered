package cn.jiguang.privates.common.utils;

import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
public class SM4Util {
    private static final int BLOCK = 16;
    private static final int ROUND = 32;
    private static final String TAG = "SM4";
    private static byte[] Sbox = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, BuiltinOptions.ArgMaxOptions, -5, BuiltinOptions.GreaterOptions, 5, BuiltinOptions.PadV2Options, BuiltinOptions.CallOnceOptions, -102, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.NegOptions, -66, 4, -61, -86, BuiltinOptions.FillOptions, 19, BuiltinOptions.DequantizeOptions, BuiltinOptions.RangeOptions, -122, 6, -103, -100, BuiltinOptions.SquareOptions, BuiltinOptions.UniqueOptions, -12, -111, -17, -104, BuiltinOptions.ATan2Options, BuiltinOptions.TileOptions, BuiltinOptions.CosOptions, 11, BuiltinOptions.ZerosLikeOptions, -19, -49, -84, BuiltinOptions.SelectV2Options, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, BuiltinOptions.DynamicUpdateSliceOptions, -113, 63, -90, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 7, -89, -4, -13, BuiltinOptions.BucketizeOptions, 23, -70, -125, BuiltinOptions.QuantizeOptions, BuiltinOptions.LogicalOrOptions, 25, -26, -123, BuiltinOptions.SplitVOptions, -88, BuiltinOptions.BroadcastToOptions, BuiltinOptions.HashtableOptions, -127, -78, BuiltinOptions.AssignVariableOptions, BuiltinOptions.SegmentSumOptions, -38, -117, -8, -21, 15, BuiltinOptions.LeakyReluOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.RankOptions, -99, BuiltinOptions.EqualOptions, 30, BuiltinOptions.LogSoftmaxOptions, 14, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.MatrixDiagOptions, -47, -94, BuiltinOptions.CastOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.BitcastOptions, BuiltinOptions.PackOptions, 1, BuiltinOptions.ExpOptions, BuiltinOptions.UnsortedSegmentMinOptions, -121, -44, 0, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, -97, -45, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.NotEqualOptions, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, BuiltinOptions.PowOptions, -75, -93, -9, -14, -50, -7, BuiltinOptions.ScatterNdOptions, 21, -95, -32, -82, BuiltinOptions.WhileOptions, -92, -101, BuiltinOptions.ExpandDimsOptions, 26, BuiltinOptions.WhereOptions, -83, -109, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, -11, -116, -79, -29, 29, -10, -30, BuiltinOptions.LessEqualOptions, -126, BuiltinOptions.CumsumOptions, -54, BuiltinOptions.NonMaxSuppressionV5Options, -64, BuiltinOptions.LessOptions, BuiltinOptions.SplitOptions, -85, 13, BuiltinOptions.GatherNdOptions, BuiltinOptions.AbsOptions, BuiltinOptions.VarHandleOptions, -43, -37, BuiltinOptions.ShapeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -34, -3, -114, BuiltinOptions.SelectOptions, 3, -1, BuiltinOptions.Conv3DOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.ReverseV2Options, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, BuiltinOptions.IfOptions, BuiltinOptions.FloorDivOptions, 31, 16, BuiltinOptions.MatrixSetDiagOptions, -40, 10, -63, BuiltinOptions.TransposeConvOptions, -120, -91, -51, BuiltinOptions.SignOptions, -67, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.GeluOptions, -48, 18, -72, -27, -76, -80, -119, BuiltinOptions.Rfft2dOptions, -105, BuiltinOptions.ResizeNearestNeighborOptions, 12, -106, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.BatchMatMulOptions, -71, -15, 9, -59, BuiltinOptions.HashtableSizeOptions, -58, -124, 24, -16, BuiltinOptions.BitwiseXorOptions, -20, BuiltinOptions.FakeQuantOptions, -36, BuiltinOptions.MirrorPadOptions, 32, BuiltinOptions.UnsortedSegmentSumOptions, -18, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.LogicalAndOptions, -41, -53, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorModOptions};

    /* JADX INFO: renamed from: CK */
    private static int[] f5696CK = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX INFO: renamed from: L1 */
    private static int m5438L1(int i11) {
        return Rotl(i11, 24) ^ (((Rotl(i11, 2) ^ i11) ^ Rotl(i11, 10)) ^ Rotl(i11, 18));
    }

    /* JADX INFO: renamed from: L3 */
    private static int[] m5440L3(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i11 * 4;
            iArr[i11] = (bArr[i12 + 3] & 255) | ((bArr[i12] & 255) << 24) | ((bArr[i12 + 1] & 255) << 16) | ((bArr[i12 + 2] & 255) << 8);
        }
        return iArr;
    }

    private static void cbcXor(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
    }

    private static byte[] pkcs7padding(byte[] bArr) {
        int length = 16 - (bArr.length % 16);
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length + length);
        for (int i11 = 0; i11 < length; i11++) {
            bArrCopyOf[bArr.length + i11] = (byte) length;
        }
        return bArrCopyOf;
    }

    private static byte[] revertPkcs7Padding(byte[] bArr) {
        int length = bArr.length - bArr[bArr.length - 1];
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private static int ByteSub(int i11) {
        byte[] bArr = Sbox;
        return (bArr[i11 & 255] & 255) | ((bArr[(i11 >>> 24) & 255] & 255) << 24) | ((bArr[(i11 >>> 16) & 255] & 255) << 16) | ((bArr[(i11 >>> 8) & 255] & 255) << 8);
    }

    /* JADX INFO: renamed from: L2 */
    private static int m5439L2(int i11) {
        return Rotl(i11, 23) ^ (Rotl(i11, 13) ^ i11);
    }

    private static int Rotl(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    public static byte[] decode(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        int[] iArrSm4KeyExt = sm4KeyExt(bArr2, true);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        byte[] bArr6 = new byte[bArr.length];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 16;
            if (i12 > bArr.length) {
                return revertPkcs7Padding(bArr6);
            }
            System.arraycopy(bArr, i11, bArr4, 0, 16);
            sm4Crypt(bArr4, bArr5, iArrSm4KeyExt);
            if (bArr3 != null) {
                cbcXor(bArr5, bArr3);
            } else {
                bArr3 = new byte[16];
            }
            System.arraycopy(bArr, i11, bArr3, 0, 16);
            System.arraycopy(bArr5, 0, bArr6, i11, 16);
            i11 = i12;
        }
    }

    public static byte[] encode(byte[] bArr, byte[] bArr2, byte[] bArr3) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        if (bArr2 == null || bArr2.length != 16) {
            throw new IllegalArgumentException("key's length should be 16");
        }
        if (bArr3 != null && bArr3.length != 16) {
            bArr3 = null;
        }
        byte[] bArrPkcs7padding = pkcs7padding(bArr);
        int[] iArrSm4KeyExt = sm4KeyExt(bArr2, false);
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[bArrPkcs7padding.length];
        int i11 = 0;
        while (true) {
            int i12 = i11 + 16;
            if (i12 > bArrPkcs7padding.length) {
                return bArr5;
            }
            System.arraycopy(bArrPkcs7padding, i11, bArr4, 0, 16);
            if (bArr3 != null) {
                cbcXor(bArr4, bArr3);
            } else {
                bArr3 = new byte[16];
            }
            sm4Crypt(bArr4, bArr3, iArrSm4KeyExt);
            System.arraycopy(bArr3, 0, bArr5, i11, bArr3.length);
            i11 = i12;
        }
    }

    private static int toByte(char c11) {
        return (byte) "0123456789abcdef".indexOf(c11);
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            throw new IllegalArgumentException("this byteArray must not be null or empty");
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            int i11 = b11 & 255;
            if (i11 < 16) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i11));
        }
        return sb2.toString().toLowerCase();
    }

    public static byte[] decryptBytes(byte[] bArr, String str) throws Exception {
        return decode(bArr, hexStringToByte(str), str.substring(0, 16).getBytes("utf-8"));
    }

    public static byte[] encryptBytes(byte[] bArr, String str, String str2) throws Exception {
        return encode(bArr, hexStringToByte(str), str2.getBytes("utf-8"));
    }

    public static byte[] hexStringToByte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toLowerCase().toCharArray();
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (toByte(charArray[i12 + 1]) | (toByte(charArray[i12]) << 4));
        }
        return bArr;
    }

    public static void sm4Crypt(byte[] bArr, byte[] bArr2, int[] iArr) {
        int[] iArrM5440L3 = m5440L3(bArr);
        for (int i11 = 0; i11 < 32; i11 += 4) {
            int iM5438L1 = iArrM5440L3[0] ^ m5438L1(ByteSub(((iArrM5440L3[1] ^ iArrM5440L3[2]) ^ iArrM5440L3[3]) ^ iArr[i11]));
            iArrM5440L3[0] = iM5438L1;
            int iM5438L2 = m5438L1(ByteSub((iM5438L1 ^ (iArrM5440L3[2] ^ iArrM5440L3[3])) ^ iArr[i11 + 1])) ^ iArrM5440L3[1];
            iArrM5440L3[1] = iM5438L2;
            int iM5438L3 = m5438L1(ByteSub((iM5438L2 ^ (iArrM5440L3[3] ^ iArrM5440L3[0])) ^ iArr[i11 + 2])) ^ iArrM5440L3[2];
            iArrM5440L3[2] = iM5438L3;
            iArrM5440L3[3] = m5438L1(ByteSub((iM5438L3 ^ (iArrM5440L3[1] ^ iArrM5440L3[0])) ^ iArr[i11 + 3])) ^ iArrM5440L3[3];
        }
        for (int i12 = 0; i12 < 16; i12 += 4) {
            int i13 = iArrM5440L3[3 - (i12 / 4)];
            bArr2[i12] = (byte) ((i13 >>> 24) & 255);
            bArr2[i12 + 1] = (byte) ((i13 >>> 16) & 255);
            bArr2[i12 + 2] = (byte) ((i13 >>> 8) & 255);
            bArr2[i12 + 3] = (byte) (i13 & 255);
        }
    }

    public static int[] sm4KeyExt(byte[] bArr, boolean z11) {
        int[] iArrM5440L3 = m5440L3(bArr);
        iArrM5440L3[0] = iArrM5440L3[0] ^ (-1548633402);
        iArrM5440L3[1] = iArrM5440L3[1] ^ 1453994832;
        iArrM5440L3[2] = iArrM5440L3[2] ^ 1736282519;
        iArrM5440L3[3] = iArrM5440L3[3] ^ (-1301273892);
        int[] iArr = new int[32];
        for (int i11 = 0; i11 < 32; i11 += 4) {
            int iM5439L2 = iArrM5440L3[0] ^ m5439L2(ByteSub(((iArrM5440L3[1] ^ iArrM5440L3[2]) ^ iArrM5440L3[3]) ^ f5696CK[i11]));
            iArrM5440L3[0] = iM5439L2;
            iArr[i11] = iM5439L2;
            int i12 = i11 + 1;
            int iM5439L3 = iArrM5440L3[1] ^ m5439L2(ByteSub(((iArrM5440L3[2] ^ iArrM5440L3[3]) ^ iArrM5440L3[0]) ^ f5696CK[i12]));
            iArrM5440L3[1] = iM5439L3;
            iArr[i12] = iM5439L3;
            int i13 = i11 + 2;
            int iM5439L4 = iArrM5440L3[2] ^ m5439L2(ByteSub(((iArrM5440L3[3] ^ iArrM5440L3[0]) ^ iArrM5440L3[1]) ^ f5696CK[i13]));
            iArrM5440L3[2] = iM5439L4;
            iArr[i13] = iM5439L4;
            int i14 = i11 + 3;
            int iM5439L5 = iArrM5440L3[3] ^ m5439L2(ByteSub(((iArrM5440L3[0] ^ iArrM5440L3[1]) ^ iArrM5440L3[2]) ^ f5696CK[i14]));
            iArrM5440L3[3] = iM5439L5;
            iArr[i14] = iM5439L5;
        }
        if (z11) {
            for (int i15 = 0; i15 < 16; i15++) {
                int i16 = iArr[i15];
                int i17 = 31 - i15;
                iArr[i15] = iArr[i17];
                iArr[i17] = i16;
            }
        }
        return iArr;
    }
}
