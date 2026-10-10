package com.google.zxing.pdf417.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.pdf417.PDF417ResultMetadata;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
final class DecodedBitStreamParser {

    /* JADX INFO: renamed from: AL */
    private static final int f12799AL = 28;

    /* JADX INFO: renamed from: AS */
    private static final int f12800AS = 27;
    private static final int BEGIN_MACRO_PDF417_CONTROL_BLOCK = 928;
    private static final int BEGIN_MACRO_PDF417_OPTIONAL_FIELD = 923;
    private static final int BYTE_COMPACTION_MODE_LATCH = 901;
    private static final int BYTE_COMPACTION_MODE_LATCH_6 = 924;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final BigInteger[] EXP900;

    /* JADX INFO: renamed from: LL */
    private static final int f12801LL = 27;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_ADDRESSEE = 4;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_CHECKSUM = 6;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_NAME = 0;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_FILE_SIZE = 5;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SEGMENT_COUNT = 1;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_SENDER = 3;
    private static final int MACRO_PDF417_OPTIONAL_FIELD_TIME_STAMP = 2;
    private static final int MACRO_PDF417_TERMINATOR = 922;
    private static final int MAX_NUMERIC_CODEWORDS = 15;

    /* JADX INFO: renamed from: ML */
    private static final int f12802ML = 28;
    private static final int MODE_SHIFT_TO_BYTE_COMPACTION_MODE = 913;
    private static final int NUMBER_OF_SEQUENCE_CODEWORDS = 2;
    private static final int NUMERIC_COMPACTION_MODE_LATCH = 902;
    private static final int PAL = 29;

    /* JADX INFO: renamed from: PL */
    private static final int f12803PL = 25;

    /* JADX INFO: renamed from: PS */
    private static final int f12804PS = 29;
    private static final int TEXT_COMPACTION_MODE_LATCH = 900;
    private static final char[] PUNCT_CHARS = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] MIXED_CHARS = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    public enum Mode {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0036. Please report as an issue. */
    private static int textCompaction(int[] iArr, int i11, StringBuilder sb2) {
        int i12 = iArr[0];
        int[] iArr2 = new int[(i12 - i11) << 1];
        int[] iArr3 = new int[(i12 - i11) << 1];
        boolean z11 = false;
        int i13 = 0;
        while (i11 < iArr[0] && !z11) {
            int i14 = i11 + 1;
            int i15 = iArr[i11];
            if (i15 < 900) {
                iArr2[i13] = i15 / 30;
                iArr2[i13 + 1] = i15 % 30;
                i13 += 2;
            } else if (i15 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                if (i15 != 928) {
                    switch (i15) {
                        case 900:
                            iArr2[i13] = 900;
                            i13++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i15) {
                                case MACRO_PDF417_TERMINATOR /* 922 */:
                                case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z11 = true;
            } else {
                iArr2[i13] = MODE_SHIFT_TO_BYTE_COMPACTION_MODE;
                i11 += 2;
                iArr3[i13] = iArr[i14];
                i13++;
            }
            i11 = i14;
        }
        decodeTextCompaction(iArr2, iArr3, i13, sb2);
        return i11;
    }

    /* JADX INFO: renamed from: com.google.zxing.pdf417.decoder.DecodedBitStreamParser$1 */
    public static /* synthetic */ class C91551 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$zxing$pdf417$decoder$DecodedBitStreamParser$Mode */
        static final /* synthetic */ int[] f12805x45bba1d;

        static {
            int[] iArr = new int[Mode.values().length];
            f12805x45bba1d = iArr;
            try {
                iArr[Mode.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12805x45bba1d[Mode.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12805x45bba1d[Mode.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12805x45bba1d[Mode.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12805x45bba1d[Mode.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12805x45bba1d[Mode.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        EXP900 = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i11 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = EXP900;
            if (i11 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i11] = bigIntegerArr2[i11 - 1].multiply(bigIntegerValueOf);
            i11++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0089. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x008c. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:31:0x0075 for B:36:0x0089 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:31:0x0075 for B:37:0x008c already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static int byteCompaction(int r19, int[] r20, java.nio.charset.Charset r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.DecodedBitStreamParser.byteCompaction(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    public static DecoderResult decode(int[] iArr, String str) throws FormatException {
        int iTextCompaction;
        StringBuilder sb2 = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i11 = iArr[1];
        PDF417ResultMetadata pDF417ResultMetadata = new PDF417ResultMetadata();
        int i12 = 2;
        while (i12 < iArr[0]) {
            if (i11 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                switch (i11) {
                    case 900:
                        iTextCompaction = textCompaction(iArr, i12, sb2);
                        break;
                    case 901:
                        iTextCompaction = byteCompaction(i11, iArr, charsetForName, i12, sb2);
                        break;
                    case 902:
                        iTextCompaction = numericCompaction(iArr, i12, sb2);
                        break;
                    default:
                        switch (i11) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                                throw FormatException.getFormatInstance();
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                iTextCompaction = byteCompaction(i11, iArr, charsetForName, i12, sb2);
                                break;
                            case ECI_USER_DEFINED /* 925 */:
                                iTextCompaction = i12 + 1;
                                break;
                            case ECI_GENERAL_PURPOSE /* 926 */:
                                iTextCompaction = i12 + 2;
                                break;
                            case ECI_CHARSET /* 927 */:
                                iTextCompaction = i12 + 1;
                                charsetForName = Charset.forName(CharacterSetECI.getCharacterSetECIByValue(iArr[i12]).name());
                                break;
                            case 928:
                                iTextCompaction = decodeMacroBlock(iArr, i12, pDF417ResultMetadata);
                                break;
                            default:
                                iTextCompaction = textCompaction(iArr, i12 - 1, sb2);
                                break;
                        }
                        break;
                }
            } else {
                iTextCompaction = i12 + 1;
                sb2.append((char) iArr[i12]);
            }
            if (iTextCompaction >= iArr.length) {
                throw FormatException.getFormatInstance();
            }
            i12 = iTextCompaction + 1;
            i11 = iArr[iTextCompaction];
        }
        if (sb2.length() == 0) {
            throw FormatException.getFormatInstance();
        }
        DecoderResult decoderResult = new DecoderResult(null, sb2.toString(), null, str);
        decoderResult.setOther(pDF417ResultMetadata);
        return decoderResult;
    }

    private static String decodeBase900toBase10(int[] iArr, int i11) throws FormatException {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i12 = 0; i12 < i11; i12++) {
            bigIntegerAdd = bigIntegerAdd.add(EXP900[(i11 - i12) - 1].multiply(BigInteger.valueOf(iArr[i12])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw FormatException.getFormatInstance();
    }

    public static int decodeMacroBlock(int[] iArr, int i11, PDF417ResultMetadata pDF417ResultMetadata) throws FormatException {
        if (i11 + 2 > iArr[0]) {
            throw FormatException.getFormatInstance();
        }
        int[] iArr2 = new int[2];
        int i12 = 0;
        while (i12 < 2) {
            iArr2[i12] = iArr[i11];
            i12++;
            i11++;
        }
        pDF417ResultMetadata.setSegmentIndex(Integer.parseInt(decodeBase900toBase10(iArr2, 2)));
        StringBuilder sb2 = new StringBuilder();
        int iTextCompaction = textCompaction(iArr, i11, sb2);
        pDF417ResultMetadata.setFileId(sb2.toString());
        int i13 = iArr[iTextCompaction] == BEGIN_MACRO_PDF417_OPTIONAL_FIELD ? iTextCompaction + 1 : -1;
        while (iTextCompaction < iArr[0]) {
            int i14 = iArr[iTextCompaction];
            if (i14 == MACRO_PDF417_TERMINATOR) {
                iTextCompaction++;
                pDF417ResultMetadata.setLastSegment(true);
            } else {
                if (i14 != BEGIN_MACRO_PDF417_OPTIONAL_FIELD) {
                    throw FormatException.getFormatInstance();
                }
                switch (iArr[iTextCompaction + 1]) {
                    case 0:
                        StringBuilder sb3 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, iTextCompaction + 2, sb3);
                        pDF417ResultMetadata.setFileName(sb3.toString());
                        break;
                    case 1:
                        StringBuilder sb4 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, iTextCompaction + 2, sb4);
                        pDF417ResultMetadata.setSegmentCount(Integer.parseInt(sb4.toString()));
                        break;
                    case 2:
                        StringBuilder sb5 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, iTextCompaction + 2, sb5);
                        pDF417ResultMetadata.setTimestamp(Long.parseLong(sb5.toString()));
                        break;
                    case 3:
                        StringBuilder sb6 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, iTextCompaction + 2, sb6);
                        pDF417ResultMetadata.setSender(sb6.toString());
                        break;
                    case 4:
                        StringBuilder sb7 = new StringBuilder();
                        iTextCompaction = textCompaction(iArr, iTextCompaction + 2, sb7);
                        pDF417ResultMetadata.setAddressee(sb7.toString());
                        break;
                    case 5:
                        StringBuilder sb8 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, iTextCompaction + 2, sb8);
                        pDF417ResultMetadata.setFileSize(Long.parseLong(sb8.toString()));
                        break;
                    case 6:
                        StringBuilder sb9 = new StringBuilder();
                        iTextCompaction = numericCompaction(iArr, iTextCompaction + 2, sb9);
                        pDF417ResultMetadata.setChecksum(Integer.parseInt(sb9.toString()));
                        break;
                    default:
                        throw FormatException.getFormatInstance();
                }
            }
        }
        if (i13 != -1) {
            int i15 = iTextCompaction - i13;
            if (pDF417ResultMetadata.isLastSegment()) {
                i15--;
            }
            pDF417ResultMetadata.setOptionalData(Arrays.copyOfRange(iArr, i13, i15 + i13));
        }
        return iTextCompaction;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void decodeTextCompaction(int[] iArr, int[] iArr2, int i11, StringBuilder sb2) {
        Mode mode;
        int i12;
        Mode mode2 = Mode.ALPHA;
        Mode mode3 = mode2;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = iArr[i13];
            char c11 = ' ';
            switch (C91551.f12805x45bba1d[mode2.ordinal()]) {
                case 1:
                    if (i14 < 26) {
                        i12 = i14 + 65;
                        c11 = (char) i12;
                    } else {
                        if (i14 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i14 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i14) {
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode4 = mode;
                                    mode3 = mode2;
                                    mode2 = mode4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                    }
                    break;
                case 2:
                    if (i14 < 26) {
                        i12 = i14 + 97;
                        c11 = (char) i12;
                    } else {
                        if (i14 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i14 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i14) {
                                case 27:
                                    mode = Mode.ALPHA_SHIFT;
                                    Mode mode5 = mode;
                                    mode3 = mode2;
                                    mode2 = mode5;
                                    break;
                                case 28:
                                    mode2 = Mode.MIXED;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode6 = mode;
                                    mode3 = mode2;
                                    mode2 = mode6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                    }
                    break;
                case 3:
                    if (i14 < 25) {
                        c11 = MIXED_CHARS[i14];
                    } else {
                        if (i14 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i14 != MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            switch (i14) {
                                case 25:
                                    mode2 = Mode.PUNCT;
                                    break;
                                case 27:
                                    mode2 = Mode.LOWER;
                                    break;
                                case 28:
                                    mode2 = Mode.ALPHA;
                                    break;
                                case 29:
                                    mode = Mode.PUNCT_SHIFT;
                                    Mode mode7 = mode;
                                    mode3 = mode2;
                                    mode2 = mode7;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                    }
                    break;
                case 4:
                    if (i14 < 29) {
                        c11 = PUNCT_CHARS[i14];
                    } else {
                        if (i14 == 29 || i14 == 900) {
                            mode2 = Mode.ALPHA;
                        } else if (i14 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                    }
                    break;
                case 5:
                    if (i14 < 26) {
                        c11 = (char) (i14 + 65);
                    } else if (i14 != 26) {
                        mode2 = i14 != 900 ? mode3 : Mode.ALPHA;
                        c11 = 0;
                    }
                    mode2 = mode3;
                    break;
                case 6:
                    if (i14 < 29) {
                        c11 = PUNCT_CHARS[i14];
                    } else if (i14 == 29 || i14 == 900) {
                        mode2 = Mode.ALPHA;
                        c11 = 0;
                    } else {
                        if (i14 == MODE_SHIFT_TO_BYTE_COMPACTION_MODE) {
                            sb2.append((char) iArr2[i13]);
                        }
                        c11 = 0;
                    }
                    mode2 = mode3;
                    break;
                default:
                    c11 = 0;
                    break;
            }
            if (c11 != 0) {
                sb2.append(c11);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0007 A[SYNTHETIC] */
    private static int numericCompaction(int[] iArr, int i11, StringBuilder sb2) throws FormatException {
        int[] iArr2 = new int[15];
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            int i13 = iArr[0];
            if (i11 < i13 && !z11) {
                int i14 = i11 + 1;
                int i15 = iArr[i11];
                if (i14 == i13) {
                    z11 = true;
                }
                if (i15 < 900) {
                    iArr2[i12] = i15;
                    i12++;
                } else {
                    if (i15 != 900 && i15 != 901 && i15 != 928) {
                        switch (i15) {
                            case MACRO_PDF417_TERMINATOR /* 922 */:
                            case BEGIN_MACRO_PDF417_OPTIONAL_FIELD /* 923 */:
                            case BYTE_COMPACTION_MODE_LATCH_6 /* 924 */:
                                z11 = true;
                                break;
                        }
                    } else {
                        z11 = true;
                    }
                    if (i12 % 15 != 0 || i15 == 902 || z11) {
                        if (i12 > 0) {
                            sb2.append(decodeBase900toBase10(iArr2, i12));
                            i12 = 0;
                        }
                    }
                }
                i11 = i14;
                if (i12 % 15 != 0) {
                }
                if (i12 > 0) {
                    sb2.append(decodeBase900toBase10(iArr2, i12));
                    i12 = 0;
                }
            }
        }
        return i11;
    }

    private DecodedBitStreamParser() {
    }
}
