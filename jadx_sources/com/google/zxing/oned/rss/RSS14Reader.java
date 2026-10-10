package com.google.zxing.oned.rss;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.tencent.rtmp.TXLiveConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOperator;

/* JADX INFO: loaded from: classes56.dex */
public final class RSS14Reader extends AbstractRSSReader {
    private final List<Pair> possibleLeftPairs = new ArrayList();
    private final List<Pair> possibleRightPairs = new ArrayList();
    private static final int[] OUTSIDE_EVEN_TOTAL_SUBSET = {1, 10, 34, 70, 126};
    private static final int[] INSIDE_ODD_TOTAL_SUBSET = {4, 20, 48, 81};
    private static final int[] OUTSIDE_GSUM = {0, BuiltinOperator.RIGHT_SHIFT, 961, TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC, 2715};
    private static final int[] INSIDE_GSUM = {0, 336, 1036, 1516};
    private static final int[] OUTSIDE_ODD_WIDEST = {8, 6, 4, 3, 1};
    private static final int[] INSIDE_ODD_WIDEST = {2, 4, 6, 8};
    private static final int[][] FINDER_PATTERNS = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    private Pair decodePair(BitArray bitArray, boolean z11, int i11, Map<DecodeHintType, ?> map) {
        try {
            int[] iArrFindFinderPattern = findFinderPattern(bitArray, z11);
            FinderPattern foundFinderPattern = parseFoundFinderPattern(bitArray, i11, z11, iArrFindFinderPattern);
            ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (resultPointCallback != null) {
                float size = (iArrFindFinderPattern[0] + iArrFindFinderPattern[1]) / 2.0f;
                if (z11) {
                    size = (bitArray.getSize() - 1) - size;
                }
                resultPointCallback.foundPossibleResultPoint(new ResultPoint(size, i11));
            }
            DataCharacter dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, true);
            DataCharacter dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, false);
            return new Pair((dataCharacterDecodeDataCharacter.getValue() * 1597) + dataCharacterDecodeDataCharacter2.getValue(), dataCharacterDecodeDataCharacter.getChecksumPortion() + (dataCharacterDecodeDataCharacter2.getChecksumPortion() * 4), foundFinderPattern);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i11, boolean z11, int[] iArr) throws NotFoundException {
        int i12;
        boolean z12 = bitArray.get(iArr[0]);
        int i13 = iArr[0] - 1;
        while (i13 >= 0 && z12 != bitArray.get(i13)) {
            i13--;
        }
        int i14 = i13 + 1;
        int i15 = iArr[0] - i14;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i15;
        int finderValue = AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS);
        int size = iArr[1];
        if (z11) {
            int size2 = (bitArray.getSize() - 1) - i14;
            size = (bitArray.getSize() - 1) - size;
            i12 = size2;
        } else {
            i12 = i14;
        }
        return new FinderPattern(finderValue, new int[]{i14, iArr[1]}, i12, size, i11);
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        addOrTally(this.possibleLeftPairs, decodePair(bitArray, false, i11, map));
        bitArray.reverse();
        addOrTally(this.possibleRightPairs, decodePair(bitArray, true, i11, map));
        bitArray.reverse();
        for (Pair pair : this.possibleLeftPairs) {
            if (pair.getCount() > 1) {
                for (Pair pair2 : this.possibleRightPairs) {
                    if (pair2.getCount() > 1 && checkChecksum(pair, pair2)) {
                        return constructResult(pair, pair2);
                    }
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static void addOrTally(Collection<Pair> collection, Pair pair) {
        if (pair == null) {
            return;
        }
        for (Pair pair2 : collection) {
            if (pair2.getValue() == pair.getValue()) {
                pair2.incrementCount();
                return;
            }
        }
        collection.add(pair);
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.possibleLeftPairs.clear();
        this.possibleRightPairs.clear();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025 A[PHI: r6 r7
      0x0025: PHI (r6v7 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0025: PHI (r7v11 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:23:0x0041, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x002a A[PHI: r6 r7
      0x002a: PHI (r6v5 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002a: PHI (r7v5 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x002d A[PHI: r6 r7
      0x002d: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x002d: PHI (r7v4 boolean) = (r7v2 boolean), (r7v14 boolean) binds: [B:25:0x0044, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:67:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x009c  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00af  */
    /* JADX WARN: Code duplicated, block: B:74:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    private void adjustOddEvenCounts(boolean z11, int i11) throws NotFoundException {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z17 = true;
        boolean z18 = false;
        if (z11) {
            if (iSum > 12) {
                z13 = true;
                z12 = false;
            } else if (iSum < 4) {
                z12 = true;
                z13 = false;
            } else {
                z12 = false;
                z13 = false;
            }
            if (iSum2 > 12) {
                z15 = true;
                z14 = false;
            } else if (iSum2 < 4) {
                z14 = true;
                z15 = false;
            } else {
                z14 = false;
                z15 = false;
            }
        } else {
            if (iSum > 11) {
                z13 = true;
                z12 = false;
            } else if (iSum < 5) {
                z12 = true;
                z13 = false;
            } else {
                z12 = false;
                z13 = false;
            }
            if (iSum2 > 10) {
                z15 = true;
                z14 = false;
            } else if (iSum2 < 4) {
                z14 = true;
                z15 = false;
            } else {
                z14 = false;
                z15 = false;
            }
        }
        int i12 = (iSum + iSum2) - i11;
        if ((iSum & 1) == z11) {
            z16 = true;
        } else {
            z16 = false;
        }
        if ((iSum2 & 1) == 1) {
            z18 = true;
        }
        if (i12 == 1) {
            if (z16) {
                if (!z18) {
                    z13 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z18) {
                z15 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            if (i12 == -1) {
                if (z16) {
                    if (z18) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (z18) {
                    z14 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (i12 == 0) {
                if (z16) {
                    if (z18) {
                        if (iSum < iSum2) {
                            z15 = true;
                        } else {
                            z14 = true;
                            z13 = true;
                        }
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (z18) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z17) {
                if (!z13) {
                    AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z13) {
                AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
            }
            if (z14) {
                if (!z15) {
                    AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z15) {
                AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
            }
        }
        z17 = z12;
        if (z17) {
            if (!z13) {
                AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z13) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z14) {
            if (!z15) {
                AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z15) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    private static boolean checkChecksum(Pair pair, Pair pair2) {
        int checksumPortion = (pair.getChecksumPortion() + (pair2.getChecksumPortion() * 16)) % 79;
        int value = (pair.getFinderPattern().getValue() * 9) + pair2.getFinderPattern().getValue();
        if (value > 72) {
            value--;
        }
        if (value > 8) {
            value--;
        }
        if (checksumPortion == value) {
            return true;
        }
        return false;
    }

    private static Result constructResult(Pair pair, Pair pair2) {
        String strValueOf = String.valueOf((((long) pair.getValue()) * 4537077) + ((long) pair2.getValue()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(strValueOf);
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int iCharAt = sb2.charAt(i12) - '0';
            if ((i12 & 1) == 0) {
                iCharAt *= 3;
            }
            i11 += iCharAt;
        }
        int i13 = 10 - (i11 % 10);
        if (i13 == 10) {
            i13 = 0;
        }
        sb2.append(i13);
        ResultPoint[] resultPoints = pair.getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = pair2.getFinderPattern().getResultPoints();
        return new Result(sb2.toString(), null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_14);
    }

    private DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z11) throws NotFoundException {
        int i11;
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i12 = 0; i12 < dataCharacterCounters.length; i12++) {
            dataCharacterCounters[i12] = 0;
        }
        if (z11) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1] + 1, dataCharacterCounters);
            int i13 = 0;
            for (int length = dataCharacterCounters.length - 1; i13 < length; length--) {
                int i14 = dataCharacterCounters[i13];
                dataCharacterCounters[i13] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i14;
                i13++;
            }
        }
        if (z11) {
            i11 = 16;
        } else {
            i11 = 15;
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / i11;
        int[] oddCounts = getOddCounts();
        int[] evenCounts = getEvenCounts();
        float[] oddRoundingErrors = getOddRoundingErrors();
        float[] evenRoundingErrors = getEvenRoundingErrors();
        for (int i15 = 0; i15 < dataCharacterCounters.length; i15++) {
            float f11 = dataCharacterCounters[i15] / fSum;
            int i16 = (int) (0.5f + f11);
            if (i16 <= 0) {
                i16 = 1;
            } else if (i16 > 8) {
                i16 = 8;
            }
            int i17 = i15 / 2;
            if ((i15 & 1) == 0) {
                oddCounts[i17] = i16;
                oddRoundingErrors[i17] = f11 - i16;
            } else {
                evenCounts[i17] = i16;
                evenRoundingErrors[i17] = f11 - i16;
            }
        }
        adjustOddEvenCounts(z11, i11);
        int i18 = 0;
        int i19 = 0;
        for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
            int i21 = oddCounts[length2];
            i18 = (i18 * 9) + i21;
            i19 += i21;
        }
        int i22 = 0;
        int i23 = 0;
        for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
            int i24 = evenCounts[length3];
            i22 = (i22 * 9) + i24;
            i23 += i24;
        }
        int i25 = i18 + (i22 * 3);
        if (z11) {
            if ((i19 & 1) == 0 && i19 <= 12 && i19 >= 4) {
                int i26 = (12 - i19) / 2;
                int i27 = OUTSIDE_ODD_WIDEST[i26];
                int i28 = 9 - i27;
                return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i27, false) * OUTSIDE_EVEN_TOTAL_SUBSET[i26]) + RSSUtils.getRSSvalue(evenCounts, i28, true) + OUTSIDE_GSUM[i26], i25);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        if ((i23 & 1) == 0 && i23 <= 10 && i23 >= 4) {
            int i29 = (10 - i23) / 2;
            int i31 = INSIDE_ODD_WIDEST[i29];
            return new DataCharacter((RSSUtils.getRSSvalue(evenCounts, 9 - i31, false) * INSIDE_ODD_TOTAL_SUBSET[i29]) + RSSUtils.getRSSvalue(oddCounts, i31, true) + INSIDE_GSUM[i29], i25);
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int[] findFinderPattern(BitArray bitArray, boolean z11) throws NotFoundException {
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < size) {
            z12 = !bitArray.get(i11);
            if (z11 == z12) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        int i13 = i11;
        while (i11 < size) {
            if (bitArray.get(i11) != z12) {
                decodeFinderCounters[i12] = decodeFinderCounters[i12] + 1;
            } else {
                if (i12 == 3) {
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        return new int[]{i13, i11};
                    }
                    i13 += decodeFinderCounters[0] + decodeFinderCounters[1];
                    decodeFinderCounters[0] = decodeFinderCounters[2];
                    decodeFinderCounters[1] = decodeFinderCounters[3];
                    decodeFinderCounters[2] = 0;
                    decodeFinderCounters[3] = 0;
                    i12--;
                } else {
                    i12++;
                }
                decodeFinderCounters[i12] = 1;
                z12 = !z12;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
