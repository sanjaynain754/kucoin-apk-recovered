package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};
    private final int[] decodeMiddleCounters = new int[4];
    private final StringBuilder decodeRowStringBuffer = new StringBuilder();

    private static int determineCheckDigit(int i11) throws NotFoundException {
        for (int i12 = 0; i12 < 10; i12++) {
            if (i11 == CHECK_DIGIT_ENCODINGS[i12]) {
                return i12;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static String parseExtension5String(String str) {
        String str2;
        byte b11 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        if (!str.equals("90000")) {
                            b11 = -1;
                        }
                        break;
                    case 54395376:
                        b11 = !str.equals("99990") ? (byte) -1 : (byte) 1;
                        break;
                    case 54395377:
                        b11 = !str.equals("99991") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int i11 = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i11 / 100);
        int i12 = i11 % 100;
        return str2 + strValueOf + '.' + (i12 < 10 ? "0".concat(String.valueOf(i12)) : String.valueOf(i12));
    }

    private int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int nextUnset = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && nextUnset < size; i12++) {
            int iDecodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, nextUnset, UPCEANReader.L_AND_G_PATTERNS);
            sb2.append((char) ((iDecodeDigit % 10) + 48));
            for (int i13 : iArr2) {
                nextUnset += i13;
            }
            if (iDecodeDigit >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                nextUnset = bitArray.getNextUnset(bitArray.getNextSet(nextUnset));
            }
        }
        if (sb2.length() != 5) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (extensionChecksum(sb2.toString()) == determineCheckDigit(i11)) {
            return nextUnset;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i11, BitArray bitArray, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.decodeRowStringBuffer;
        sb2.setLength(0);
        int iDecodeMiddle = decodeMiddle(bitArray, iArr, sb2);
        String string = sb2.toString();
        Map<ResultMetadataType, Object> extensionString = parseExtensionString(string);
        float f11 = i11;
        Result result = new Result(string, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f11), new ResultPoint(iDecodeMiddle, f11)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (extensionString != null) {
            result.putAllMetadata(extensionString);
        }
        return result;
    }

    private static int extensionChecksum(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            iCharAt += charSequence.charAt(i11) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i12 = length - 1; i12 >= 0; i12 -= 2) {
            iCharAt2 += charSequence.charAt(i12) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    private static Map<ResultMetadataType, Object> parseExtensionString(String str) {
        String extension5String;
        if (str.length() != 5 || (extension5String = parseExtension5String(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put(ResultMetadataType.SUGGESTED_PRICE, extension5String);
        return enumMap;
    }
}
