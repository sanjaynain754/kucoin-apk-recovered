package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;

    /* JADX INFO: renamed from: FS */
    private static final char f12790FS = 28;

    /* JADX INFO: renamed from: GS */
    private static final char f12791GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;

    /* JADX INFO: renamed from: NS */
    private static final char f12792NS = 65531;
    private static final char PAD = 65532;

    /* JADX INFO: renamed from: RS */
    private static final char f12793RS = 30;
    private static final String[] SETS = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;

    private static int getInt(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int bit = 0;
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            bit += getBit(bArr2[i11], bArr) << ((bArr2.length - i11) - 1);
        }
        return bit;
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, 31, 32});
    }

    public static DecoderResult decode(byte[] bArr, int i11) {
        String postCode3;
        StringBuilder sb2 = new StringBuilder(144);
        if (i11 == 2 || i11 == 3) {
            if (i11 == 2) {
                postCode3 = new DecimalFormat("0000000000".substring(0, getPostCode2Length(bArr))).format(getPostCode2(bArr));
            } else {
                postCode3 = getPostCode3(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String str = decimalFormat.format(getCountry(bArr));
            String str2 = decimalFormat.format(getServiceClass(bArr));
            sb2.append(getMessage(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, postCode3 + f12791GS + str + f12791GS + str2 + f12791GS);
            } else {
                sb2.insert(0, postCode3 + f12791GS + str + f12791GS + str2 + f12791GS);
            }
        } else if (i11 == 4) {
            sb2.append(getMessage(bArr, 1, 93));
        } else if (i11 == 5) {
            sb2.append(getMessage(bArr, 1, 77));
        }
        return new DecoderResult(bArr, sb2.toString(), null, String.valueOf(i11));
    }

    private static int getBit(int i11, byte[] bArr) {
        int i12 = i11 - 1;
        return ((1 << (5 - (i12 % 6))) & bArr[i12 / 6]) == 0 ? 0 : 1;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions});
    }

    private static String getMessage(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        int i13 = i11;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        while (i13 < i11 + i12) {
            char cCharAt = SETS[i15].charAt(bArr[i13]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i16 = i15;
                    i15 = cCharAt - SHIFTA;
                    i14 = 1;
                    break;
                case 65525:
                    i14 = 2;
                    i16 = i15;
                    i15 = 0;
                    break;
                case 65526:
                    i14 = 3;
                    i16 = i15;
                    i15 = 0;
                    break;
                case 65527:
                    i14 = -1;
                    i15 = 0;
                    break;
                case 65528:
                    i14 = -1;
                    i15 = 1;
                    break;
                case 65529:
                    i14 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(cCharAt);
                    break;
                case 65531:
                    int i17 = (bArr[i13 + 1] << 24) + (bArr[i13 + 2] << 18) + (bArr[i13 + 3] << 12) + (bArr[i13 + 4] << 6);
                    i13 += 5;
                    sb2.append(new DecimalFormat("000000000").format(i17 + bArr[i13]));
                    break;
            }
            int i18 = i14 - 1;
            if (i14 == 0) {
                i15 = i16;
            }
            i13++;
            i14 = i18;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.ExpOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, BuiltinOptions.LogSoftmaxOptions, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static String getPostCode3(byte[] bArr) {
        String[] strArr = SETS;
        return String.valueOf(new char[]{strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, 31, 32})), strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.ExpOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, BuiltinOptions.LogSoftmaxOptions, 25, 26})), strArr[0].charAt(getInt(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(getInt(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(getInt(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(getInt(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions});
    }

    private DecodedBitStreamParser() {
    }
}
