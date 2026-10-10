package com.google.zxing.oned.rss.expanded;

import androidx.media3.extractor.p021ts.PsExtractor;
import androidx.media3.extractor.p021ts.TsExtractor;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.common.detector.MathUtils;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.rss.AbstractRSSReader;
import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import com.google.zxing.oned.rss.RSSUtils;
import com.google.zxing.oned.rss.expanded.decoders.AbstractExpandedDecoder;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import com.tencent.thumbplayer.tcmedia.core.common.TPPixelFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tensorflow.lite.schema.BuiltinOperator;

/* JADX INFO: loaded from: classes56.dex */
public final class RSSExpandedReader extends AbstractRSSReader {
    private static final int FINDER_PAT_A = 0;
    private static final int FINDER_PAT_B = 1;
    private static final int FINDER_PAT_C = 2;
    private static final int FINDER_PAT_D = 3;
    private static final int FINDER_PAT_E = 4;
    private static final int FINDER_PAT_F = 5;
    private static final int MAX_PAIRS = 11;
    private final List<ExpandedPair> pairs = new ArrayList(11);
    private final List<ExpandedRow> rows = new ArrayList();
    private final int[] startEnd = new int[2];
    private boolean startFromEven;
    private static final int[] SYMBOL_WIDEST = {7, 5, 4, 3, 1};
    private static final int[] EVEN_TOTAL_SUBSET = {4, 20, 52, 104, 204};
    private static final int[] GSUM = {0, 348, 1388, 2948, JPushConstants.RemoteWhat.TAG_DELETE};
    private static final int[][] FINDER_PATTERNS = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};
    private static final int[][] WEIGHTS = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{PsExtractor.PRIVATE_STREAM_1, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, BuiltinOperator.UNSORTED_SEGMENT_MIN, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, TsExtractor.TS_PACKET_SIZE, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, BuiltinOperator.UNSORTED_SEGMENT_SUM}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{BuiltinOperator.RANDOM_UNIFORM, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, TPPixelFormat.TP_PIX_FMT_MEDIACODEC}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{BuiltinOperator.RIGHT_SHIFT, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_PROGRESSIVE_DCT, 160, 58, 174, 100, 89}};
    private static final int[][] FINDER_PATTERN_SEQUENCES = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    private List<ExpandedPair> checkRows(boolean z11) {
        List<ExpandedPair> listCheckRows = null;
        if (this.rows.size() > 25) {
            this.rows.clear();
            return null;
        }
        this.pairs.clear();
        if (z11) {
            Collections.reverse(this.rows);
        }
        try {
            listCheckRows = checkRows(new ArrayList(), 0);
        } catch (NotFoundException unused) {
        }
        if (z11) {
            Collections.reverse(this.rows);
        }
        return listCheckRows;
    }

    private FinderPattern parseFoundFinderPattern(BitArray bitArray, int i11, boolean z11) {
        int nextUnset;
        int i12;
        int i13;
        if (z11) {
            int i14 = this.startEnd[0] - 1;
            while (i14 >= 0 && !bitArray.get(i14)) {
                i14--;
            }
            int i15 = i14 + 1;
            int[] iArr = this.startEnd;
            i13 = iArr[0] - i15;
            nextUnset = iArr[1];
            i12 = i15;
        } else {
            int[] iArr2 = this.startEnd;
            int i16 = iArr2[0];
            nextUnset = bitArray.getNextUnset(iArr2[1] + 1);
            i12 = i16;
            i13 = nextUnset - this.startEnd[1];
        }
        int i17 = nextUnset;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        System.arraycopy(decodeFinderCounters, 0, decodeFinderCounters, 1, decodeFinderCounters.length - 1);
        decodeFinderCounters[0] = i13;
        try {
            return new FinderPattern(AbstractRSSReader.parseFinderValue(decodeFinderCounters, FINDER_PATTERNS), new int[]{i12, i17}, i12, i17, i11);
        } catch (NotFoundException unused) {
            return null;
        }
    }

    private static void reverseCounters(int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length / 2; i11++) {
            int i12 = iArr[i11];
            int i13 = (length - i11) - 1;
            iArr[i11] = iArr[i13];
            iArr[i13] = i12;
        }
    }

    private void storeRow(int i11, boolean z11) {
        boolean zIsEquivalent = false;
        int i12 = 0;
        boolean zIsEquivalent2 = false;
        while (i12 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i12);
            if (expandedRow.getRowNumber() > i11) {
                zIsEquivalent = expandedRow.isEquivalent(this.pairs);
                break;
            } else {
                zIsEquivalent2 = expandedRow.isEquivalent(this.pairs);
                i12++;
            }
        }
        if (zIsEquivalent || zIsEquivalent2 || isPartialRow(this.pairs, this.rows)) {
            return;
        }
        this.rows.add(i12, new ExpandedRow(this.pairs, i11, z11));
        removePartialRows(this.pairs, this.rows);
    }

    public List<ExpandedPair> decodeRow2pairs(int i11, BitArray bitArray) throws NotFoundException {
        boolean z11 = false;
        while (!z11) {
            try {
                List<ExpandedPair> list = this.pairs;
                list.add(retrieveNextPair(bitArray, list, i11));
            } catch (NotFoundException e11) {
                if (this.pairs.isEmpty()) {
                    throw e11;
                }
                z11 = true;
            }
        }
        if (checkChecksum()) {
            return this.pairs;
        }
        boolean zIsEmpty = this.rows.isEmpty();
        storeRow(i11, false);
        if (!zIsEmpty) {
            List<ExpandedPair> listCheckRows = checkRows(false);
            if (listCheckRows != null) {
                return listCheckRows;
            }
            List<ExpandedPair> listCheckRows2 = checkRows(true);
            if (listCheckRows2 != null) {
                return listCheckRows2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private boolean checkChecksum() {
        ExpandedPair expandedPair = this.pairs.get(0);
        DataCharacter leftChar = expandedPair.getLeftChar();
        DataCharacter rightChar = expandedPair.getRightChar();
        if (rightChar == null) {
            return false;
        }
        int checksumPortion = rightChar.getChecksumPortion();
        int i11 = 2;
        for (int i12 = 1; i12 < this.pairs.size(); i12++) {
            ExpandedPair expandedPair2 = this.pairs.get(i12);
            checksumPortion += expandedPair2.getLeftChar().getChecksumPortion();
            int i13 = i11 + 1;
            DataCharacter rightChar2 = expandedPair2.getRightChar();
            if (rightChar2 != null) {
                checksumPortion += rightChar2.getChecksumPortion();
                i11 += 2;
            } else {
                i11 = i13;
            }
        }
        return ((i11 + (-4)) * 211) + (checksumPortion % 211) == leftChar.getValue();
    }

    private static boolean isValidSequence(List<ExpandedPair> list) {
        for (int[] iArr : FINDER_PATTERN_SEQUENCES) {
            if (list.size() <= iArr.length) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (list.get(i11).getFinderPattern().getValue() == iArr[i11]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i11, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        this.pairs.clear();
        this.startFromEven = false;
        try {
            return constructResult(decodeRow2pairs(i11, bitArray));
        } catch (NotFoundException unused) {
            this.pairs.clear();
            this.startFromEven = true;
            return constructResult(decodeRow2pairs(i11, bitArray));
        }
    }

    public List<ExpandedRow> getRows() {
        return this.rows;
    }

    @Override // com.google.zxing.oned.OneDReader, com.google.zxing.Reader
    public void reset() {
        this.pairs.clear();
        this.rows.clear();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    private void adjustOddEvenCounts(int i11) throws NotFoundException {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int iSum = MathUtils.sum(getOddCounts());
        int iSum2 = MathUtils.sum(getEvenCounts());
        boolean z16 = true;
        boolean z17 = false;
        if (iSum > 13) {
            z12 = true;
            z11 = false;
        } else if (iSum < 4) {
            z11 = true;
            z12 = false;
        } else {
            z11 = false;
            z12 = false;
        }
        if (iSum2 > 13) {
            z14 = true;
            z13 = false;
        } else if (iSum2 < 4) {
            z13 = true;
            z14 = false;
        } else {
            z13 = false;
            z14 = false;
        }
        int i12 = (iSum + iSum2) - i11;
        if ((iSum & 1) == 1) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((iSum2 & 1) == 0) {
            z17 = true;
        }
        if (i12 == 1) {
            if (z15) {
                if (!z17) {
                    z12 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (z17) {
                z14 = true;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } else {
            if (i12 == -1) {
                if (z15) {
                    if (z17) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (z17) {
                    z13 = true;
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else if (i12 == 0) {
                if (z15) {
                    if (z17) {
                        if (iSum < iSum2) {
                            z14 = true;
                        } else {
                            z13 = true;
                            z12 = true;
                        }
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (z17) {
                    throw NotFoundException.getNotFoundInstance();
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
            if (z16) {
                if (!z12) {
                    AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z12) {
                AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
            }
            if (z13) {
                if (!z14) {
                    AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
                } else {
                    throw NotFoundException.getNotFoundInstance();
                }
            }
            if (z14) {
                AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
            }
        }
        z16 = z11;
        if (z16) {
            if (!z12) {
                AbstractRSSReader.increment(getOddCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z12) {
            AbstractRSSReader.decrement(getOddCounts(), getOddRoundingErrors());
        }
        if (z13) {
            if (!z14) {
                AbstractRSSReader.increment(getEvenCounts(), getOddRoundingErrors());
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
        if (z14) {
            AbstractRSSReader.decrement(getEvenCounts(), getEvenRoundingErrors());
        }
    }

    public static Result constructResult(List<ExpandedPair> list) throws NotFoundException, FormatException {
        String information = AbstractExpandedDecoder.createDecoder(BitArrayBuilder.buildBitArray(list)).parseInformation();
        ResultPoint[] resultPoints = list.get(0).getFinderPattern().getResultPoints();
        ResultPoint[] resultPoints2 = list.get(list.size() - 1).getFinderPattern().getResultPoints();
        return new Result(information, null, new ResultPoint[]{resultPoints[0], resultPoints[1], resultPoints2[0], resultPoints2[1]}, BarcodeFormat.RSS_EXPANDED);
    }

    private void findNextPair(BitArray bitArray, List<ExpandedPair> list, int i11) throws NotFoundException {
        boolean z11;
        int[] decodeFinderCounters = getDecodeFinderCounters();
        decodeFinderCounters[0] = 0;
        decodeFinderCounters[1] = 0;
        decodeFinderCounters[2] = 0;
        decodeFinderCounters[3] = 0;
        int size = bitArray.getSize();
        if (i11 < 0) {
            if (list.isEmpty()) {
                i11 = 0;
            } else {
                i11 = list.get(list.size() - 1).getFinderPattern().getStartEnd()[1];
            }
        }
        if (list.size() % 2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.startFromEven) {
            z11 = !z11;
        }
        boolean z12 = false;
        while (i11 < size) {
            boolean z13 = bitArray.get(i11);
            boolean z14 = !z13;
            if (!z13) {
                i11++;
                z12 = z14;
            } else {
                z12 = z14;
                break;
            }
        }
        int i12 = 0;
        boolean z15 = z12;
        int i13 = i11;
        while (i11 < size) {
            if (bitArray.get(i11) != z15) {
                decodeFinderCounters[i12] = decodeFinderCounters[i12] + 1;
            } else {
                if (i12 == 3) {
                    if (z11) {
                        reverseCounters(decodeFinderCounters);
                    }
                    if (AbstractRSSReader.isFinderPattern(decodeFinderCounters)) {
                        int[] iArr = this.startEnd;
                        iArr[0] = i13;
                        iArr[1] = i11;
                        return;
                    }
                    if (z11) {
                        reverseCounters(decodeFinderCounters);
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
                z15 = !z15;
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int getNextSecondBar(BitArray bitArray, int i11) {
        if (bitArray.get(i11)) {
            return bitArray.getNextSet(bitArray.getNextUnset(i11));
        }
        return bitArray.getNextUnset(bitArray.getNextSet(i11));
    }

    private static boolean isNotA1left(FinderPattern finderPattern, boolean z11, boolean z12) {
        if (finderPattern.getValue() == 0 && z11 && z12) {
            return false;
        }
        return true;
    }

    private static boolean isPartialRow(Iterable<ExpandedPair> iterable, Iterable<ExpandedRow> iterable2) {
        for (ExpandedRow expandedRow : iterable2) {
            for (ExpandedPair expandedPair : iterable) {
                Iterator<ExpandedPair> it = expandedRow.getPairs().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (expandedPair.equals(it.next())) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private static void removePartialRows(List<ExpandedPair> list, List<ExpandedRow> list2) {
        Iterator<ExpandedRow> it = list2.iterator();
        while (it.hasNext()) {
            ExpandedRow next = it.next();
            if (next.getPairs().size() != list.size()) {
                Iterator<ExpandedPair> it2 = next.getPairs().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ExpandedPair next2 = it2.next();
                        Iterator<ExpandedPair> it3 = list.iterator();
                        do {
                            if (!it3.hasNext()) {
                                break;
                            }
                        } while (!next2.equals(it3.next()));
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
    }

    public DataCharacter decodeDataCharacter(BitArray bitArray, FinderPattern finderPattern, boolean z11, boolean z12) throws NotFoundException {
        int i11;
        int[] dataCharacterCounters = getDataCharacterCounters();
        for (int i12 = 0; i12 < dataCharacterCounters.length; i12++) {
            dataCharacterCounters[i12] = 0;
        }
        if (z12) {
            OneDReader.recordPatternInReverse(bitArray, finderPattern.getStartEnd()[0], dataCharacterCounters);
        } else {
            OneDReader.recordPattern(bitArray, finderPattern.getStartEnd()[1], dataCharacterCounters);
            int i13 = 0;
            for (int length = dataCharacterCounters.length - 1; i13 < length; length--) {
                int i14 = dataCharacterCounters[i13];
                dataCharacterCounters[i13] = dataCharacterCounters[length];
                dataCharacterCounters[length] = i14;
                i13++;
            }
        }
        float fSum = MathUtils.sum(dataCharacterCounters) / 17.0f;
        float f11 = (finderPattern.getStartEnd()[1] - finderPattern.getStartEnd()[0]) / 15.0f;
        if (Math.abs(fSum - f11) / f11 <= 0.3f) {
            int[] oddCounts = getOddCounts();
            int[] evenCounts = getEvenCounts();
            float[] oddRoundingErrors = getOddRoundingErrors();
            float[] evenRoundingErrors = getEvenRoundingErrors();
            for (int i15 = 0; i15 < dataCharacterCounters.length; i15++) {
                float f12 = (dataCharacterCounters[i15] * 1.0f) / fSum;
                int i16 = (int) (0.5f + f12);
                if (i16 <= 0) {
                    if (f12 >= 0.3f) {
                        i16 = 1;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                } else if (i16 > 8) {
                    if (f12 <= 8.7f) {
                        i16 = 8;
                    } else {
                        throw NotFoundException.getNotFoundInstance();
                    }
                }
                int i17 = i15 / 2;
                if ((i15 & 1) == 0) {
                    oddCounts[i17] = i16;
                    oddRoundingErrors[i17] = f12 - i16;
                } else {
                    evenCounts[i17] = i16;
                    evenRoundingErrors[i17] = f12 - i16;
                }
            }
            adjustOddEvenCounts(17);
            int value = finderPattern.getValue() * 4;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 2;
            }
            int i18 = ((value + i11) + (!z12 ? 1 : 0)) - 1;
            int i19 = 0;
            int i21 = 0;
            for (int length2 = oddCounts.length - 1; length2 >= 0; length2--) {
                if (isNotA1left(finderPattern, z11, z12)) {
                    i19 += oddCounts[length2] * WEIGHTS[i18][length2 * 2];
                }
                i21 += oddCounts[length2];
            }
            int i22 = 0;
            for (int length3 = evenCounts.length - 1; length3 >= 0; length3--) {
                if (isNotA1left(finderPattern, z11, z12)) {
                    i22 += evenCounts[length3] * WEIGHTS[i18][(length3 * 2) + 1];
                }
            }
            int i23 = i19 + i22;
            if ((i21 & 1) == 0 && i21 <= 13 && i21 >= 4) {
                int i24 = (13 - i21) / 2;
                int i25 = SYMBOL_WIDEST[i24];
                int i26 = 9 - i25;
                return new DataCharacter((RSSUtils.getRSSvalue(oddCounts, i25, true) * EVEN_TOTAL_SUBSET[i24]) + RSSUtils.getRSSvalue(evenCounts, i26, false) + GSUM[i24], i23);
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ExpandedPair retrieveNextPair(BitArray bitArray, List<ExpandedPair> list, int i11) throws NotFoundException {
        boolean z11;
        FinderPattern foundFinderPattern;
        DataCharacter dataCharacterDecodeDataCharacter;
        if (list.size() % 2 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.startFromEven) {
            z11 = !z11;
        }
        int nextSecondBar = -1;
        boolean z12 = true;
        do {
            findNextPair(bitArray, list, nextSecondBar);
            foundFinderPattern = parseFoundFinderPattern(bitArray, i11, z11);
            if (foundFinderPattern == null) {
                nextSecondBar = getNextSecondBar(bitArray, this.startEnd[0]);
            } else {
                z12 = false;
            }
        } while (z12);
        DataCharacter dataCharacterDecodeDataCharacter2 = decodeDataCharacter(bitArray, foundFinderPattern, z11, true);
        if (!list.isEmpty() && list.get(list.size() - 1).mustBeLast()) {
            throw NotFoundException.getNotFoundInstance();
        }
        try {
            dataCharacterDecodeDataCharacter = decodeDataCharacter(bitArray, foundFinderPattern, z11, false);
        } catch (NotFoundException unused) {
            dataCharacterDecodeDataCharacter = null;
        }
        return new ExpandedPair(dataCharacterDecodeDataCharacter2, dataCharacterDecodeDataCharacter, foundFinderPattern, true);
    }

    private List<ExpandedPair> checkRows(List<ExpandedRow> list, int i11) throws NotFoundException {
        while (i11 < this.rows.size()) {
            ExpandedRow expandedRow = this.rows.get(i11);
            this.pairs.clear();
            Iterator<ExpandedRow> it = list.iterator();
            while (it.hasNext()) {
                this.pairs.addAll(it.next().getPairs());
            }
            this.pairs.addAll(expandedRow.getPairs());
            if (isValidSequence(this.pairs)) {
                if (checkChecksum()) {
                    return this.pairs;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.add(expandedRow);
                try {
                    return checkRows(arrayList, i11 + 1);
                } catch (NotFoundException unused) {
                    continue;
                }
            }
            i11++;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
