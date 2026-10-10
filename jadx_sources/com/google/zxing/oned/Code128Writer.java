package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i11, int i12, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i11, i12, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static int chooseCode(CharSequence charSequence, int i11, int i12) {
        CType cTypeFindCType;
        CType cTypeFindCType2;
        char cCharAt;
        CType cTypeFindCType3 = findCType(charSequence, i11);
        CType cType = CType.ONE_DIGIT;
        if (cTypeFindCType3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (cTypeFindCType3 == cType2) {
            if (i11 >= charSequence.length() || ((cCharAt = charSequence.charAt(i11)) >= ' ' && (i12 != 101 || cCharAt >= '`'))) {
                return 100;
            }
            return 101;
        }
        if (i12 == 99) {
            return 99;
        }
        if (i12 == 100) {
            CType cType3 = CType.FNC_1;
            if (cTypeFindCType3 == cType3 || (cTypeFindCType = findCType(charSequence, i11 + 2)) == cType2 || cTypeFindCType == cType) {
                return 100;
            }
            if (cTypeFindCType == cType3) {
                if (findCType(charSequence, i11 + 3) != CType.TWO_DIGITS) {
                    return 100;
                }
                return 99;
            }
            int i13 = i11 + 4;
            while (true) {
                cTypeFindCType2 = findCType(charSequence, i13);
                if (cTypeFindCType2 != CType.TWO_DIGITS) {
                    break;
                }
                i13 += 2;
            }
            if (cTypeFindCType2 == CType.ONE_DIGIT) {
                return 100;
            }
            return 99;
        }
        if (cTypeFindCType3 == CType.FNC_1) {
            cTypeFindCType3 = findCType(charSequence, i11 + 1);
        }
        if (cTypeFindCType3 != CType.TWO_DIGITS) {
            return 100;
        }
        return 99;
    }

    private static CType findCType(CharSequence charSequence, int i11) {
        int length = charSequence.length();
        if (i11 >= length) {
            return CType.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i11);
        if (cCharAt == 241) {
            return CType.FNC_1;
        }
        if (cCharAt >= '0' && cCharAt <= '9') {
            int i12 = i11 + 1;
            if (i12 >= length) {
                return CType.ONE_DIGIT;
            }
            char cCharAt2 = charSequence.charAt(i12);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int iAppendPattern = 0;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                switch (cCharAt) {
                    case 241:
                    case 242:
                    case 243:
                    case TPCodecParamers.TP_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                        break;
                    default:
                        if (cCharAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                        }
                        break;
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 1;
            while (true) {
                int i16 = 103;
                if (i12 < length) {
                    int iChooseCode = chooseCode(str, i12, i14);
                    int iCharAt = 100;
                    if (iChooseCode == i14) {
                        switch (str.charAt(i12)) {
                            case 241:
                                iCharAt = 102;
                                break;
                            case 242:
                                iCharAt = 97;
                                break;
                            case 243:
                                iCharAt = 96;
                                break;
                            case TPCodecParamers.TP_PROFILE_H264_HIGH_444_PREDICTIVE /* 244 */:
                                if (i14 == 101) {
                                    iCharAt = 101;
                                }
                                break;
                            default:
                                if (i14 == 100) {
                                    iCharAt = str.charAt(i12) - ' ';
                                } else if (i14 != 101) {
                                    iCharAt = Integer.parseInt(str.substring(i12, i12 + 2));
                                    i12++;
                                } else {
                                    char cCharAt2 = str.charAt(i12);
                                    iCharAt = cCharAt2 - ' ';
                                    if (iCharAt < 0) {
                                        iCharAt = cCharAt2 + '@';
                                    }
                                }
                                break;
                        }
                        i12++;
                    } else {
                        if (i14 != 0) {
                            i16 = iChooseCode;
                        } else if (iChooseCode == 100) {
                            i16 = 104;
                        } else if (iChooseCode != 101) {
                            i16 = 105;
                        }
                        iCharAt = i16;
                        i14 = iChooseCode;
                    }
                    arrayList.add(Code128Reader.CODE_PATTERNS[iCharAt]);
                    i13 += iCharAt * i15;
                    if (i12 != 0) {
                        i15++;
                    }
                } else {
                    int[][] iArr = Code128Reader.CODE_PATTERNS;
                    arrayList.add(iArr[i13 % 103]);
                    arrayList.add(iArr[106]);
                    int i17 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i18 : iArr2) {
                            i17 += i18;
                        }
                    }
                    boolean[] zArr = new boolean[i17];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        iAppendPattern += OneDimensionalCodeWriter.appendPattern(zArr, iAppendPattern, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
