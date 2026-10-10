package com.google.zxing.aztec.decoder;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.webkit.ProxyConfig;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.jumio.commons.log.LogUtils;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes56.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", C33627eb.f69716f, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", C33627eb.f69716f, CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", "f", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "i", "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, "m", "n", "o", "p", "q", "r", CmcdData.Factory.STREAMING_FORMAT_SS, "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", C33627eb.f69716f, "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"", "\r", LogUtils.NEW_LINE, ". ", ", ", ": ", "!", "\"", RunnableC33958ua.f72251f, "$", "%", "&", "'", "(", ")", ProxyConfig.MATCH_ALL_SCHEMES, "+", ",", C33820nf.f71144W, C33978va.f72339h, "/", C33844oi.f71346o, ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", C33627eb.f69716f, "0", "1", "2", "3", "4", "5", "6", TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO, "8", "9", ",", C33978va.f72339h, "CTRL_UL", "CTRL_US"};

    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = readByte(zArr, i11 << 3);
        }
        return bArr;
    }

    private static String getEncodedData(boolean[] zArr) {
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb2 = new StringBuilder(20);
        Table table2 = table;
        int i11 = 0;
        while (i11 < length) {
            if (table != Table.BINARY) {
                int i12 = table == Table.DIGIT ? 4 : 5;
                if (length - i11 < i12) {
                    break;
                }
                int code = readCode(zArr, i11, i12);
                i11 += i12;
                String character = getCharacter(table, code);
                if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb2.append(character);
                }
                table = table2;
            } else {
                if (length - i11 < 5) {
                    break;
                }
                int code2 = readCode(zArr, i11, 5);
                int i13 = i11 + 5;
                if (code2 == 0) {
                    if (length - i13 < 11) {
                        break;
                    }
                    code2 = readCode(zArr, i13, 11) + 31;
                    i13 = i11 + 16;
                }
                int i14 = 0;
                while (true) {
                    if (i14 >= code2) {
                        i11 = i13;
                        break;
                    }
                    if (length - i13 < 8) {
                        i11 = length;
                        break;
                    }
                    sb2.append((char) readCode(zArr, i13, 8));
                    i13 += 8;
                    i14++;
                }
                table = table2;
            }
        }
        return sb2.toString();
    }

    private static byte readByte(boolean[] zArr, int i11) {
        int length = zArr.length - i11;
        return (byte) (length >= 8 ? readCode(zArr, i11, 8) : readCode(zArr, i11, length) << (8 - length));
    }

    private static int readCode(boolean[] zArr, int i11, int i12) {
        int i13 = 0;
        for (int i14 = i11; i14 < i11 + i12; i14++) {
            i13 <<= 1;
            if (zArr[i14]) {
                i13 |= 1;
            }
        }
        return i13;
    }

    /* JADX INFO: renamed from: com.google.zxing.aztec.decoder.Decoder$1 */
    public static /* synthetic */ class C91421 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private boolean[] correctBits(boolean[] zArr) throws FormatException {
        int i11;
        GenericGF genericGF;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i11 = 6;
        } else {
            i11 = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i11 = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i11 = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i11;
        if (length < nbDatablocks) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i11;
        int[] iArr = new int[length];
        int i12 = 0;
        while (i12 < length) {
            iArr[i12] = readCode(zArr, length2, i11);
            i12++;
            length2 += i11;
        }
        try {
            new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
            int i13 = 1 << i11;
            int i14 = i13 - 1;
            int i15 = 0;
            for (int i16 = 0; i16 < nbDatablocks; i16++) {
                int i17 = iArr[i16];
                if (i17 == 0 || i17 == i14) {
                    throw FormatException.getFormatInstance();
                }
                if (i17 == 1 || i17 == i13 - 2) {
                    i15++;
                }
            }
            boolean[] zArr2 = new boolean[(nbDatablocks * i11) - i15];
            int i18 = 0;
            for (int i19 = 0; i19 < nbDatablocks; i19++) {
                int i21 = iArr[i19];
                if (i21 == 1 || i21 == i13 - 2) {
                    Arrays.fill(zArr2, i18, (i18 + i11) - 1, i21 > 1);
                    i18 += i11 - 1;
                } else {
                    int i22 = i11 - 1;
                    while (i22 >= 0) {
                        int i23 = i18 + 1;
                        zArr2[i18] = ((1 << i22) & i21) != 0;
                        i22--;
                        i18 = i23;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e11) {
            throw FormatException.getFormatInstance(e11);
        }
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        boolean zIsCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        int i11 = (zIsCompact ? 11 : 14) + (nbLayers << 2);
        int[] iArr = new int[i11];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, zIsCompact)];
        int i12 = 2;
        if (zIsCompact) {
            for (int i13 = 0; i13 < i11; i13++) {
                iArr[i13] = i13;
            }
        } else {
            int i14 = i11 / 2;
            int i15 = ((i11 + 1) + (((i14 - 1) / 15) * 2)) / 2;
            for (int i16 = 0; i16 < i14; i16++) {
                int i17 = (i16 / 15) + i16;
                iArr[(i14 - i16) - 1] = (i15 - i17) - 1;
                iArr[i14 + i16] = i17 + i15 + 1;
            }
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < nbLayers) {
            int i21 = ((nbLayers - i18) << i12) + (zIsCompact ? 9 : 12);
            int i22 = i18 << 1;
            int i23 = (i11 - 1) - i22;
            int i24 = 0;
            while (i24 < i21) {
                int i25 = i24 << 1;
                int i26 = 0;
                while (i26 < i12) {
                    int i27 = i22 + i26;
                    int i28 = i22 + i24;
                    zArr[i19 + i25 + i26] = bitMatrix.get(iArr[i27], iArr[i28]);
                    int i29 = i23 - i26;
                    zArr[(i21 * 2) + i19 + i25 + i26] = bitMatrix.get(iArr[i28], iArr[i29]);
                    int i31 = iArr[i29];
                    int i32 = i23 - i24;
                    zArr[(i21 * 4) + i19 + i25 + i26] = bitMatrix.get(i31, iArr[i32]);
                    zArr[(i21 * 6) + i19 + i25 + i26] = bitMatrix.get(iArr[i32], iArr[i27]);
                    i26++;
                    i12 = 2;
                }
                i24++;
                i12 = 2;
            }
            i19 += i21 << 3;
            i18++;
            i12 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i11) {
        int i12 = C91421.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i12 == 1) {
            return UPPER_TABLE[i11];
        }
        if (i12 == 2) {
            return LOWER_TABLE[i11];
        }
        if (i12 == 3) {
            return MIXED_TABLE[i11];
        }
        if (i12 == 4) {
            return PUNCT_TABLE[i11];
        }
        if (i12 == 5) {
            return DIGIT_TABLE[i11];
        }
        throw new IllegalStateException("Bad table");
    }

    private static Table getTable(char c11) {
        if (c11 == 'B') {
            return Table.BINARY;
        }
        if (c11 == 'D') {
            return Table.DIGIT;
        }
        if (c11 == 'P') {
            return Table.PUNCT;
        }
        if (c11 != 'L') {
            return c11 != 'M' ? Table.UPPER : Table.MIXED;
        }
        return Table.LOWER;
    }

    private static int totalBitsInLayer(int i11, boolean z11) {
        return ((z11 ? 88 : 112) + (i11 << 4)) * i11;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) throws FormatException {
        this.ddata = aztecDetectorResult;
        boolean[] zArrCorrectBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(zArrCorrectBits), getEncodedData(zArrCorrectBits), null, null);
        decoderResult.setNumBits(zArrCorrectBits.length);
        return decoderResult;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }
}
