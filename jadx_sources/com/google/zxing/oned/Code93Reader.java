package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class Code93Reader extends OneDReader {
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private final int[] counters = new int[6];

    private static char patternToChar(int i11) throws NotFoundException {
        int i12 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i12 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i12] == i11) {
                return ALPHABET[i12];
            }
            i12++;
        }
    }

    private static int toPattern(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int iRound = Math.round((iArr[i14] * 9.0f) / i11);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i14 & 1) == 0) {
                for (int i15 = 0; i15 < iRound; i15++) {
                    i13 = (i13 << 1) | 1;
                }
            } else {
                i13 <<= iRound;
            }
        }
        return i13;
    }

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, 402, 394, TXVodDownloadDataSource.QUALITY_360P, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkOneChecksum(CharSequence charSequence, int i11, int i12) throws ChecksumException {
        int iIndexOf = 0;
        int i13 = 1;
        for (int i14 = i11 - 1; i14 >= 0; i14--) {
            iIndexOf += ALPHABET_STRING.indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i12) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i11) != ALPHABET[iIndexOf % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static void checkChecksums(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static String decodeExtended(CharSequence charSequence) throws FormatException {
        int i11;
        char c11;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i12 = 0;
        while (i12 < length) {
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt >= 'a' && cCharAt <= 'd') {
                if (i12 < length - 1) {
                    i12++;
                    char cCharAt2 = charSequence.charAt(i12);
                    switch (cCharAt) {
                        case 'a':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                                i11 = cCharAt2 - '@';
                                c11 = (char) i11;
                                sb2.append(c11);
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        case 'b':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                i11 = cCharAt2 - '&';
                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                i11 = cCharAt2 - 11;
                            } else if (cCharAt2 >= 'K' && cCharAt2 <= 'O') {
                                i11 = cCharAt2 + 16;
                            } else {
                                if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                    i11 = cCharAt2 + '+';
                                } else if (cCharAt2 >= 'T' && cCharAt2 <= 'Z') {
                                    c11 = Ascii.MAX;
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                                sb2.append(c11);
                            }
                            c11 = (char) i11;
                            sb2.append(c11);
                            break;
                        case 'c':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                i11 = cCharAt2 - ' ';
                                c11 = (char) i11;
                            } else if (cCharAt2 == 'Z') {
                                c11 = ':';
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            sb2.append(c11);
                            break;
                        case 'd':
                            if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                                i11 = cCharAt2 + ' ';
                                c11 = (char) i11;
                                sb2.append(c11);
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        default:
                            c11 = 0;
                            sb2.append(c11);
                            break;
                    }
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                sb2.append(cCharAt);
            }
            i12++;
        }
        return sb2.toString();
    }

    private int[] findAsteriskPattern(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
        int length = iArr.length;
        boolean z11 = false;
        int i11 = 0;
        int i12 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z11) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 == length - 1) {
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
                        return new int[]{i12, nextSet};
                    }
                    i12 += iArr[0] + iArr[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i11] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z11 = !z11;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] iArrFindAsteriskPattern = findAsteriskPattern(bitArray);
        int nextSet = bitArray.getNextSet(iArrFindAsteriskPattern[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.decodeRowResult;
        sb2.setLength(0);
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern >= 0) {
                char cPatternToChar = patternToChar(pattern);
                sb2.append(cPatternToChar);
                int i12 = nextSet;
                for (int i13 : iArr) {
                    i12 += i13;
                }
                int nextSet2 = bitArray.getNextSet(i12);
                if (cPatternToChar == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i14 = 0;
                    for (int i15 : iArr) {
                        i14 += i15;
                    }
                    if (nextSet2 != size && bitArray.get(nextSet2)) {
                        if (sb2.length() >= 2) {
                            checkChecksums(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f11 = i11;
                            return new Result(decodeExtended(sb2), null, new ResultPoint[]{new ResultPoint((iArrFindAsteriskPattern[1] + iArrFindAsteriskPattern[0]) / 2.0f, f11), new ResultPoint(nextSet + (i14 / 2.0f), f11)}, BarcodeFormat.CODE_93);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
