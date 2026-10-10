package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.math.DoubleMath;
import com.tencent.bugly.proguard.C33556b3;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    private static int applyConformanceWindowToHeight(int i11, int i12, int i13, int i14) {
        return i11 - ((i12 == 1 ? 2 : 1) * (i13 + i14));
    }

    private static int applyConformanceWindowToWidth(int i11, int i12, int i13, int i14) {
        int i15 = 2;
        if (i12 != 1 && i12 != 2) {
            i15 = 1;
        }
        return i11 - (i15 * (i13 + i14));
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
    }

    private static ImmutableList<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.Builder builder = ImmutableList.builder();
        int i11 = 0;
        while (i11 < bArr.length) {
            int iFindNalUnit = findNalUnit(bArr, i11, bArr.length, zArr);
            if (iFindNalUnit != bArr.length) {
                builder.add(Integer.valueOf(iFindNalUnit));
            }
            i11 = iFindNalUnit + 3;
        }
        return builder.build();
    }

    @Nullable
    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = list.get(i11);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList<Integer> immutableListFindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i12 = 0; i12 < immutableListFindNalUnitPositions.size(); i12++) {
                    if (immutableListFindNalUnitPositions.get(i12).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, immutableListFindNalUnitPositions.get(i12).intValue() + 3, length);
                        H265NalHeader h265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (h265NalHeader.nalUnitType == 33 && h265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean isNalUnitSei(@Nullable String str, byte b11) {
        return ("video/avc".equals(str) && (b11 & 31) == 6) || ("video/hevc".equals(str) && ((b11 & BuiltinOptions.RightShiftOptions) >> 1) == 39);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0227  */
    /* JADX WARN: Code duplicated, block: B:113:0x0236  */
    /* JADX WARN: Code duplicated, block: B:115:0x023d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103 A[LOOP:0: B:53:0x0101->B:54:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0168  */
    /* JADX WARN: Code duplicated, block: B:73:0x016f A[LOOP:1: B:72:0x016d->B:73:0x016f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0182  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x0192  */
    /* JADX WARN: Code duplicated, block: B:82:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f8  */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01ac, please report this as an issue */
    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i11, int i12, H265NalHeader h265NalHeader, @Nullable H265VpsData h265VpsData) {
        int unsignedExpGolombCodedInt;
        int iApplyConformanceWindowToWidth;
        int iApplyConformanceWindowToHeight;
        int unsignedExpGolombCodedInt2;
        int unsignedExpGolombCodedInt3;
        int i13;
        int unsignedExpGolombCodedInt4;
        int iMax;
        float f11;
        int i14;
        int i15;
        int i16;
        int iIsoColorPrimariesToColorSpace;
        int i17;
        int iIsoTransferCharacteristicsToColorTransfer;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i18;
        int bits;
        float[] fArr;
        int bits2;
        int bits3;
        int unsignedExpGolombCodedInt5;
        int i19;
        boolean bit;
        int i21;
        H265RepFormatsAndIndices h265RepFormatsAndIndices;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        parsableNalUnitBitArray.skipBits(4);
        int bits4 = parsableNalUnitBitArray.readBits(3);
        boolean z11 = h265NalHeader.layerId != 0 && bits4 == 7;
        int i22 = (h265VpsData == null || h265VpsData.layerInfos.isEmpty()) ? 0 : h265VpsData.layerInfos.get(Math.min(h265NalHeader.layerId, h265VpsData.layerInfos.size() - 1)).layerIdInVps;
        H265ProfileTierLevel h265ProfileTierLevel = null;
        if (!z11) {
            parsableNalUnitBitArray.skipBit();
            h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits4, null);
        } else if (h265VpsData != null) {
            H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = h265VpsData.profileTierLevelsAndIndices;
            int i23 = h265ProfileTierLevelsAndIndices.indices[i22];
            if (h265ProfileTierLevelsAndIndices.profileTierLevels.size() > i23) {
                h265ProfileTierLevel = h265VpsData.profileTierLevelsAndIndices.profileTierLevels.get(i23);
            }
        }
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z11) {
            int bits5 = parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBits(8) : -1;
            if (h265VpsData != null && (h265RepFormatsAndIndices = h265VpsData.repFormatsAndIndices) != null) {
                if (bits5 == -1) {
                    bits5 = h265RepFormatsAndIndices.indices[i22];
                }
                if (bits5 != -1 && h265RepFormatsAndIndices.repFormats.size() > bits5) {
                    H265RepFormat h265RepFormat = h265VpsData.repFormatsAndIndices.repFormats.get(bits5);
                    unsignedExpGolombCodedInt = h265RepFormat.chromaFormatIdc;
                    iApplyConformanceWindowToWidth = h265RepFormat.width;
                    iApplyConformanceWindowToHeight = h265RepFormat.height;
                    unsignedExpGolombCodedInt2 = h265RepFormat.bitDepthLumaMinus8;
                    unsignedExpGolombCodedInt3 = h265RepFormat.bitDepthChromaMinus8;
                }
                unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (z11) {
                    iMax = -1;
                } else {
                    if (parsableNalUnitBitArray.readBit()) {
                        i21 = 0;
                    } else {
                        i21 = bits4;
                    }
                    iMax = -1;
                    while (i21 <= bits4) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i21++;
                    }
                }
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (parsableNalUnitBitArray.readBit()) {
                    if (z11) {
                        bit = parsableNalUnitBitArray.readBit();
                    } else {
                        bit = false;
                    }
                    if (bit) {
                        parsableNalUnitBitArray.skipBits(6);
                    } else if (parsableNalUnitBitArray.readBit()) {
                        skipH265ScalingList(parsableNalUnitBitArray);
                    }
                }
                parsableNalUnitBitArray.skipBits(2);
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(8);
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
                if (parsableNalUnitBitArray.readBit()) {
                    unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    for (i19 = 0; i19 < unsignedExpGolombCodedInt5; i19++) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt4 + 5);
                    }
                }
                parsableNalUnitBitArray.skipBits(2);
                f11 = 1.0f;
                if (parsableNalUnitBitArray.readBit()) {
                    if (parsableNalUnitBitArray.readBit()) {
                        bits = parsableNalUnitBitArray.readBits(8);
                        if (bits == 255) {
                            bits2 = parsableNalUnitBitArray.readBits(16);
                            bits3 = parsableNalUnitBitArray.readBits(16);
                            if (bits2 != 0 && bits3 != 0) {
                                f11 = bits2 / bits3;
                            }
                        } else {
                            fArr = ASPECT_RATIO_IDC_VALUES;
                            if (bits < fArr.length) {
                                f11 = fArr[bits];
                            } else {
                                Log.m2961w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                            }
                        }
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBits(3);
                        i16 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                        if (parsableNalUnitBitArray.readBit()) {
                            int bits6 = parsableNalUnitBitArray.readBits(8);
                            int bits7 = parsableNalUnitBitArray.readBits(8);
                            parsableNalUnitBitArray.skipBits(8);
                            iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits6);
                            iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits7);
                        } else {
                            iIsoTransferCharacteristicsToColorTransfer = -1;
                            iIsoColorPrimariesToColorSpace = -1;
                        }
                    } else if (h265VpsData != null || (h265VideoSignalInfosAndIndices = h265VpsData.videoSignalInfosAndIndices) == null || h265VideoSignalInfosAndIndices.videoSignalInfos.size() <= (i18 = h265VideoSignalInfosAndIndices.indices[i22])) {
                        iIsoTransferCharacteristicsToColorTransfer = -1;
                        i16 = -1;
                        iIsoColorPrimariesToColorSpace = -1;
                    } else {
                        H265VideoSignalInfo h265VideoSignalInfo = h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.get(i18);
                        iIsoColorPrimariesToColorSpace = h265VideoSignalInfo.colorSpace;
                        i16 = h265VideoSignalInfo.colorRange;
                        iIsoTransferCharacteristicsToColorTransfer = h265VideoSignalInfo.colorTransfer;
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        iApplyConformanceWindowToHeight *= 2;
                    }
                    int i24 = unsignedExpGolombCodedInt3;
                    i17 = iIsoTransferCharacteristicsToColorTransfer;
                    i15 = i24;
                    i14 = iApplyConformanceWindowToHeight;
                } else {
                    i14 = iApplyConformanceWindowToHeight;
                    i15 = unsignedExpGolombCodedInt3;
                    i16 = -1;
                    iIsoColorPrimariesToColorSpace = -1;
                    i17 = -1;
                }
                return new H265SpsData(h265NalHeader, h265ProfileTierLevel, i13, unsignedExpGolombCodedInt2, i15, unsignedExpGolombCodedInt6, iApplyConformanceWindowToWidth, i14, f11, iMax, iIsoColorPrimariesToColorSpace, i16, i17);
            }
            i13 = 0;
            iApplyConformanceWindowToHeight = 0;
            unsignedExpGolombCodedInt2 = 0;
            unsignedExpGolombCodedInt3 = 0;
            iApplyConformanceWindowToWidth = 0;
            unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (z11) {
                if (parsableNalUnitBitArray.readBit()) {
                    i21 = 0;
                } else {
                    i21 = bits4;
                }
                iMax = -1;
                while (i21 <= bits4) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    i21++;
                }
            } else {
                iMax = -1;
            }
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (parsableNalUnitBitArray.readBit()) {
                if (z11) {
                    bit = parsableNalUnitBitArray.readBit();
                } else {
                    bit = false;
                }
                if (bit) {
                    parsableNalUnitBitArray.skipBits(6);
                } else if (parsableNalUnitBitArray.readBit()) {
                    skipH265ScalingList(parsableNalUnitBitArray);
                }
            }
            parsableNalUnitBitArray.skipBits(2);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(8);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.skipBit();
            }
            skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
            if (parsableNalUnitBitArray.readBit()) {
                unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                while (i19 < unsignedExpGolombCodedInt5) {
                    parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt4 + 5);
                }
            }
            parsableNalUnitBitArray.skipBits(2);
            f11 = 1.0f;
            if (parsableNalUnitBitArray.readBit()) {
                if (parsableNalUnitBitArray.readBit()) {
                    bits = parsableNalUnitBitArray.readBits(8);
                    if (bits == 255) {
                        bits2 = parsableNalUnitBitArray.readBits(16);
                        bits3 = parsableNalUnitBitArray.readBits(16);
                        if (bits2 != 0) {
                            f11 = bits2 / bits3;
                        }
                    } else {
                        fArr = ASPECT_RATIO_IDC_VALUES;
                        if (bits < fArr.length) {
                            f11 = fArr[bits];
                        } else {
                            Log.m2961w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                        }
                    }
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(3);
                    if (parsableNalUnitBitArray.readBit()) {
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        int bits8 = parsableNalUnitBitArray.readBits(8);
                        int bits9 = parsableNalUnitBitArray.readBits(8);
                        parsableNalUnitBitArray.skipBits(8);
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits8);
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits9);
                    } else {
                        iIsoTransferCharacteristicsToColorTransfer = -1;
                        iIsoColorPrimariesToColorSpace = -1;
                    }
                } else {
                    if (h265VpsData != null) {
                    }
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                    i16 = -1;
                    iIsoColorPrimariesToColorSpace = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    iApplyConformanceWindowToHeight *= 2;
                }
                int i25 = unsignedExpGolombCodedInt3;
                i17 = iIsoTransferCharacteristicsToColorTransfer;
                i15 = i25;
                i14 = iApplyConformanceWindowToHeight;
            } else {
                i14 = iApplyConformanceWindowToHeight;
                i15 = unsignedExpGolombCodedInt3;
                i16 = -1;
                iIsoColorPrimariesToColorSpace = -1;
                i17 = -1;
            }
            return new H265SpsData(h265NalHeader, h265ProfileTierLevel, i13, unsignedExpGolombCodedInt2, i15, unsignedExpGolombCodedInt6, iApplyConformanceWindowToWidth, i14, f11, iMax, iIsoColorPrimariesToColorSpace, i16, i17);
        }
        unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt == 3) {
            parsableNalUnitBitArray.skipBit();
        }
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            iApplyConformanceWindowToWidth = applyConformanceWindowToWidth(unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10);
            iApplyConformanceWindowToHeight = applyConformanceWindowToHeight(unsignedExpGolombCodedInt8, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt11, unsignedExpGolombCodedInt12);
        } else {
            iApplyConformanceWindowToWidth = unsignedExpGolombCodedInt7;
            iApplyConformanceWindowToHeight = unsignedExpGolombCodedInt8;
        }
        unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        i13 = unsignedExpGolombCodedInt;
        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z11) {
            if (parsableNalUnitBitArray.readBit()) {
                i21 = 0;
            } else {
                i21 = bits4;
            }
            iMax = -1;
            while (i21 <= bits4) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i21++;
            }
        } else {
            iMax = -1;
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            if (z11) {
                bit = parsableNalUnitBitArray.readBit();
            } else {
                bit = false;
            }
            if (bit) {
                parsableNalUnitBitArray.skipBits(6);
            } else if (parsableNalUnitBitArray.readBit()) {
                skipH265ScalingList(parsableNalUnitBitArray);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            while (i19 < unsignedExpGolombCodedInt5) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt4 + 5);
            }
        }
        parsableNalUnitBitArray.skipBits(2);
        f11 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                bits = parsableNalUnitBitArray.readBits(8);
                if (bits == 255) {
                    bits2 = parsableNalUnitBitArray.readBits(16);
                    bits3 = parsableNalUnitBitArray.readBits(16);
                    if (bits2 != 0) {
                        f11 = bits2 / bits3;
                    }
                } else {
                    fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits < fArr.length) {
                        f11 = fArr[bits];
                    } else {
                        Log.m2961w(TAG, "Unexpected aspect_ratio_idc value: " + bits);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                if (parsableNalUnitBitArray.readBit()) {
                }
                if (parsableNalUnitBitArray.readBit()) {
                    int bits10 = parsableNalUnitBitArray.readBits(8);
                    int bits11 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits10);
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits11);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                    iIsoColorPrimariesToColorSpace = -1;
                }
            } else {
                if (h265VpsData != null) {
                }
                iIsoTransferCharacteristicsToColorTransfer = -1;
                i16 = -1;
                iIsoColorPrimariesToColorSpace = -1;
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                iApplyConformanceWindowToHeight *= 2;
            }
            int i26 = unsignedExpGolombCodedInt3;
            i17 = iIsoTransferCharacteristicsToColorTransfer;
            i15 = i26;
            i14 = iApplyConformanceWindowToHeight;
        } else {
            i14 = iApplyConformanceWindowToHeight;
            i15 = unsignedExpGolombCodedInt3;
            i16 = -1;
            iIsoColorPrimariesToColorSpace = -1;
            i17 = -1;
        }
        return new H265SpsData(h265NalHeader, h265ProfileTierLevel, i13, unsignedExpGolombCodedInt2, i15, unsignedExpGolombCodedInt6, iApplyConformanceWindowToWidth, i14, f11, iMax, iIsoColorPrimariesToColorSpace, i16, i17);
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i11 = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(iIsoColorPrimariesToColorSpace, i11, iIsoTransferCharacteristicsToColorTransfer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[] iArr;
        int i11;
        int i12;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i13;
        int i14;
        int i15;
        int[] iArr2;
        ImmutableList immutableList;
        int i16;
        boolean[][] zArr;
        int[] iArr3;
        int i17;
        parsableNalUnitBitArray.skipBits(4);
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        int bits = parsableNalUnitBitArray.readBits(6);
        int i18 = bits + 1;
        int bits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits2, null);
        boolean z11 = false;
        for (int i19 = parsableNalUnitBitArray.readBit() ? 0 : bits2; i19 <= bits2; i19++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int bits3 = parsableNalUnitBitArray.readBits(6);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(ImmutableList.m13440of(h265ProfileTierLevel), new int[1]);
        Object[] objArr = i18 >= 2 && unsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = bit && bit2;
        int i21 = bits3 + 1;
        Object[] objArr3 = i21 >= i18;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, unsignedExpGolombCodedInt, i21);
        int i22 = 1;
        int[] iArr5 = new int[unsignedExpGolombCodedInt];
        int[] iArr6 = new int[unsignedExpGolombCodedInt];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i23 = 1; i23 < unsignedExpGolombCodedInt; i23++) {
            int i24 = 0;
            for (int i25 = 0; i25 <= bits3; i25++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr4[i23][i24] = i25;
                    iArr6[i23] = i25;
                    i24++;
                }
                iArr5[i23] = i24;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i26 = 0;
            while (i26 < unsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i26 == 0 || parsableNalUnitBitArray.readBit()) {
                    z11 = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z11, bits2);
                i26++;
                z11 = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, bits2, h265ProfileTierLevel);
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i27 = 6;
        boolean[] zArr2 = new boolean[16];
        int i28 = 0;
        for (int i29 = 0; i29 < 16; i29++) {
            boolean bit4 = parsableNalUnitBitArray.readBit();
            zArr2[i29] = bit4;
            if (bit4) {
                i28++;
            }
        }
        if (i28 == 0 || !zArr2[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr7 = new int[i28];
        for (int i31 = 0; i31 < i28 - (bit3 ? 1 : 0); i31++) {
            iArr7[i31] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr8 = new int[i28 + 1];
        if (bit3) {
            int i32 = 1;
            while (i32 < i28) {
                int[] iArr9 = iArr8;
                for (int i33 = 0; i33 < i32; i33++) {
                    iArr9[i32] = iArr9[i32] + iArr7[i33] + 1;
                }
                i32++;
                iArr8 = iArr9;
            }
            iArr = iArr8;
            iArr[i28] = 6;
        } else {
            iArr = iArr8;
        }
        int[][] iArr10 = (int[][]) Array.newInstance((Class<?>) cls, i18, i28);
        int[] iArr11 = new int[i18];
        iArr11[0] = 0;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i34 = 1;
        while (i34 < i18) {
            if (bit5) {
                i17 = i34;
                iArr11[i17] = parsableNalUnitBitArray.readBits(i27);
            } else {
                i17 = i34;
                iArr11[i17] = i17;
            }
            if (bit3) {
                int i35 = 0;
                while (i35 < i28) {
                    int i36 = i35 + 1;
                    iArr10[i17][i35] = (iArr11[i17] & ((1 << iArr[i36]) - 1)) >> iArr[i35];
                    i35 = i36;
                }
            } else {
                int i37 = 0;
                while (i37 < i28) {
                    int i38 = i37;
                    iArr10[i17][i38] = parsableNalUnitBitArray.readBits(iArr7[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i34 = i17 + 1;
            i27 = 6;
        }
        int[] iArr12 = new int[i21];
        int i39 = 1;
        int i41 = 0;
        while (i41 < i18) {
            iArr12[iArr11[i41]] = -1;
            int[] iArr13 = iArr12;
            int i42 = 0;
            int i43 = 0;
            while (i42 < 16) {
                if (zArr2[i42]) {
                    if (i42 == i22) {
                        iArr13[iArr11[i41]] = iArr10[i41][i43];
                    }
                    i43++;
                }
                i42++;
                i22 = 1;
            }
            if (i41 > 0) {
                int i44 = 0;
                while (true) {
                    if (i44 >= i41) {
                        i39++;
                        break;
                    }
                    int i45 = i44;
                    if (iArr13[iArr11[i41]] == iArr13[iArr11[i44]]) {
                        break;
                    }
                    i44 = i45 + 1;
                }
            }
            i41++;
            iArr12 = iArr13;
            i22 = 1;
        }
        int[] iArr14 = iArr12;
        int bits4 = parsableNalUnitBitArray.readBits(4);
        if (i39 < 2 || bits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr15 = new int[i39];
        for (int i46 = 0; i46 < i39; i46++) {
            iArr15[i46] = parsableNalUnitBitArray.readBits(bits4);
        }
        int[] iArr16 = new int[i21];
        int i47 = 0;
        while (i47 < i18) {
            int[] iArr17 = iArr16;
            iArr17[Math.min(iArr11[i47], bits3)] = i47;
            i47++;
            iArr16 = iArr17;
        }
        int[] iArr18 = iArr16;
        ImmutableList.Builder builder = ImmutableList.builder();
        int i48 = 0;
        while (i48 <= bits3) {
            int i49 = i39;
            int[] iArr19 = iArr6;
            int iMin = Math.min(iArr14[i48], i49 - 1);
            builder.add(new H265LayerInfo(iArr18[i48], iMin >= 0 ? iArr15[iMin] : -1));
            i48++;
            i39 = i49;
            iArr6 = iArr19;
            iArr15 = iArr15;
        }
        int[] iArr20 = iArr6;
        ImmutableList immutableListBuild = builder.build();
        if (((H265LayerInfo) immutableListBuild.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i51 = 1;
        while (true) {
            if (i51 > bits3) {
                i11 = -1;
                i12 = -1;
                break;
            }
            i11 = -1;
            if (((H265LayerInfo) immutableListBuild.get(i51)).viewId != -1) {
                i12 = i51;
                break;
            }
            i51++;
        }
        if (i12 == i11) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i18, i18);
        int i52 = 1;
        while (i52 < i18) {
            boolean[][] zArr5 = zArr4;
            for (int i53 = 0; i53 < i52; i53++) {
                boolean[] zArr6 = zArr3[i52];
                boolean[] zArr7 = zArr5[i52];
                boolean bit6 = parsableNalUnitBitArray.readBit();
                zArr7[i53] = bit6;
                zArr6[i53] = bit6;
            }
            i52++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i54 = 1; i54 < i18; i54++) {
            int i55 = 0;
            while (i55 < bits) {
                int[] iArr21 = iArr11;
                for (int i56 = 0; i56 < i54; i56++) {
                    boolean[] zArr9 = zArr8[i54];
                    if (zArr9[i56] && zArr8[i56][i55]) {
                        zArr9[i55] = true;
                        break;
                    }
                }
                i55++;
                iArr11 = iArr21;
            }
        }
        int[] iArr22 = iArr11;
        int[] iArr23 = new int[i21];
        for (int i57 = 0; i57 < i18; i57++) {
            int i58 = 0;
            for (int i59 = 0; i59 < i57; i59++) {
                i58 += zArr3[i57][i59] ? 1 : 0;
            }
            iArr23[iArr22[i57]] = i58;
        }
        int i61 = 0;
        for (int i62 = 0; i62 < i18; i62++) {
            if (iArr23[iArr22[i62]] == 0) {
                i61++;
            }
        }
        if (i61 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr24 = new int[i18];
        int[] iArr25 = new int[unsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            int i63 = 0;
            while (i63 < i18) {
                int i64 = i63;
                iArr24[i64] = parsableNalUnitBitArray.readBits(3);
                i63 = i64 + 1;
            }
        } else {
            Arrays.fill(iArr24, 0, i18, bits2);
        }
        int i65 = 0;
        while (i65 < unsignedExpGolombCodedInt) {
            int i66 = i65;
            boolean[][] zArr10 = zArr3;
            int[] iArr26 = iArr24;
            int iMax = 0;
            for (int i67 = 0; i67 < iArr5[i66]; i67++) {
                iMax = Math.max(iMax, iArr26[((H265LayerInfo) immutableListBuild.get(iArr4[i66][i67])).layerIdInVps]);
            }
            iArr25[i66] = iMax + 1;
            i65 = i66 + 1;
            iArr24 = iArr26;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i68 = 0;
            while (i68 < bits) {
                int i69 = i68 + 1;
                int i71 = i69;
                while (i71 < i18) {
                    if (zArr11[i71][i68]) {
                        parsableNalUnitBitArray.skipBits(3);
                    }
                    i71++;
                    i68 = i68;
                }
                i68 = i69;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        ImmutableList.Builder builder2 = ImmutableList.builder();
        builder2.add(h265ProfileTierLevel);
        if (unsignedExpGolombCodedInt3 > 1) {
            builder2.add(h265ProfileTierLevel2);
            for (int i72 = 2; i72 < unsignedExpGolombCodedInt3; i72++) {
                h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), bits2, h265ProfileTierLevel2);
                builder2.add(h265ProfileTierLevel2);
            }
        }
        ImmutableList immutableListBuild2 = builder2.build();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + unsignedExpGolombCodedInt;
        if (unsignedExpGolombCodedInt4 > unsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int bits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, unsignedExpGolombCodedInt4, i21);
        int[] iArr27 = new int[unsignedExpGolombCodedInt4];
        int i73 = 0;
        int[] iArr28 = new int[unsignedExpGolombCodedInt4];
        int i74 = 0;
        while (i74 < unsignedExpGolombCodedInt) {
            iArr27[i74] = i73;
            iArr28[i74] = iArr20[i74];
            if (bits5 == 0) {
                i16 = i74;
                zArr = zArr12;
                immutableList = immutableListBuild2;
                iArr3 = iArr27;
                Arrays.fill(zArr12[i16], i73, iArr5[i16], true);
                iArr3[i16] = iArr5[i16];
            } else {
                immutableList = immutableListBuild2;
                i16 = i74;
                zArr = zArr12;
                iArr3 = iArr27;
                if (bits5 == 1) {
                    int i75 = iArr20[i16];
                    for (int i76 = 0; i76 < iArr5[i16]; i76++) {
                        zArr[i16][i76] = iArr4[i16][i76] == i75;
                    }
                    iArr3[i16] = 1;
                } else {
                    i73 = 0;
                    zArr[0][0] = true;
                    iArr3[0] = 1;
                }
                i74 = i16 + 1;
                zArr12 = zArr;
                iArr27 = iArr3;
                immutableListBuild2 = immutableList;
            }
            i73 = 0;
            i74 = i16 + 1;
            zArr12 = zArr;
            iArr27 = iArr3;
            immutableListBuild2 = immutableList;
        }
        ImmutableList immutableList2 = immutableListBuild2;
        boolean[][] zArr13 = zArr12;
        int[] iArr29 = iArr27;
        int[] iArr30 = new int[i21];
        int i77 = 2;
        int[] iArr31 = new int[2];
        iArr31[1] = i21;
        iArr31[i73] = unsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr31);
        int i78 = 1;
        int i79 = 0;
        while (i78 < unsignedExpGolombCodedInt4) {
            if (bits5 == i77) {
                for (int i81 = 0; i81 < iArr5[i78]; i81++) {
                    zArr13[i78][i81] = parsableNalUnitBitArray.readBit();
                    int i82 = iArr29[i78];
                    boolean z12 = zArr13[i78][i81];
                    iArr29[i78] = i82 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr28[i78] = iArr4[i78][i81];
                    }
                }
            }
            if (i79 == 0) {
                i13 = 0;
                if (iArr4[i78][0] == 0 && zArr13[i78][0]) {
                    for (int i83 = 1; i83 < iArr5[i78]; i83++) {
                        if (iArr4[i78][i83] == i12 && zArr13[i78][i12]) {
                            i79 = i78;
                        }
                    }
                }
            } else {
                i13 = 0;
            }
            int i84 = i13;
            while (i84 < iArr5[i78]) {
                if (unsignedExpGolombCodedInt3 > 1) {
                    zArr14[i78][i84] = zArr13[i78][i84];
                    i15 = i12;
                    iArr2 = iArr30;
                    i14 = unsignedExpGolombCodedInt3;
                    int iLog2 = DoubleMath.log2(unsignedExpGolombCodedInt3, RoundingMode.CEILING);
                    if (!zArr14[i78][i84]) {
                        int i85 = ((H265LayerInfo) immutableListBuild.get(iArr4[i78][i84])).layerIdInVps;
                        int i86 = i13;
                        while (i86 < i84) {
                            int i87 = i85;
                            if (zArr8[i87][((H265LayerInfo) immutableListBuild.get(iArr4[i78][i86])).layerIdInVps]) {
                                zArr14[i78][i84] = true;
                                break;
                            }
                            i86++;
                            i85 = i87;
                        }
                    }
                    if (zArr14[i78][i84]) {
                        if (i79 <= 0 || i78 != i79) {
                            parsableNalUnitBitArray.skipBits(iLog2);
                        } else {
                            iArr2[i84] = parsableNalUnitBitArray.readBits(iLog2);
                        }
                    }
                } else {
                    i14 = unsignedExpGolombCodedInt3;
                    i15 = i12;
                    iArr2 = iArr30;
                }
                i84++;
                i12 = i15;
                iArr30 = iArr2;
                unsignedExpGolombCodedInt3 = i14;
            }
            int i88 = unsignedExpGolombCodedInt3;
            int i89 = i12;
            int[] iArr32 = iArr30;
            if (iArr29[i78] == 1 && iArr23[iArr28[i78]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i78++;
            i12 = i89;
            iArr30 = iArr32;
            unsignedExpGolombCodedInt3 = i88;
            i77 = 2;
        }
        int[] iArr33 = iArr30;
        if (i79 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices h265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i18);
        parsableNalUnitBitArray.skipBits(2);
        for (int i91 = 1; i91 < i18; i91++) {
            if (iArr23[iArr22[i91]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, unsignedExpGolombCodedInt4, iArr25, iArr5, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i18, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i18, unsignedExpGolombCodedInt, iArr25);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, immutableListBuild, new H265ProfileTierLevelsAndIndices(immutableList2, iArr33), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i12 = 1; i12 < i11; i12++) {
            boolean bit = parsableNalUnitBitArray.readBit();
            int i13 = 0;
            while (i13 < iArr[i12]) {
                if ((i13 <= 0 || !bit) ? i13 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i14 = 0; i14 < iArr2[i12]; i14++) {
                        if (zArr[i12][i14]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i13++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z11, int i11) {
        ?? r11;
        ?? r12;
        boolean bit;
        boolean bit2;
        if (z11) {
            boolean bit3 = parsableNalUnitBitArray.readBit();
            boolean bit4 = parsableNalUnitBitArray.readBit();
            if (bit3 || bit4) {
                bit = parsableNalUnitBitArray.readBit();
                if (bit) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (bit) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r12 = bit4;
                r11 = bit3;
            } else {
                bit = false;
                r12 = bit4;
                r11 = bit3;
            }
        } else {
            r11 = 0;
            r12 = 0;
            bit = false;
        }
        for (int i12 = 0; i12 <= i11; i12++) {
            boolean bit5 = parsableNalUnitBitArray.readBit();
            if (!bit5) {
                bit5 = parsableNalUnitBitArray.readBit();
            }
            if (bit5) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                bit2 = false;
            } else {
                bit2 = parsableNalUnitBitArray.readBit();
            }
            int unsignedExpGolombCodedInt = !bit2 ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i13 = r11 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= unsignedExpGolombCodedInt; i15++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (bit) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (i12 < 6) {
                int i13 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i11 << 1) + 4));
                    if (i11 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i14 = 0; i14 < iMin; i14++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i11 == 3) {
                    i13 = 3;
                }
                i12 += i13;
            }
        }
    }

    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i11, int i12) {
            this.layerIdInVps = i11;
            this.viewId = i12;
        }
    }

    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i11, int i12, int i13) {
            this.nalUnitType = i11;
            this.layerId = i12;
            this.temporalId = i13;
        }
    }

    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
            this.generalProfileSpace = i11;
            this.generalTierFlag = z11;
            this.generalProfileIdc = i12;
            this.generalProfileCompatibilityFlags = i13;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i14;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i11, int i12, int i13, int i14, int i15) {
            this.chromaFormatIdc = i11;
            this.bitDepthLumaMinus8 = i12;
            this.bitDepthChromaMinus8 = i13;
            this.width = i14;
            this.height = i15;
        }
    }

    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.precRefDisplayWidth = i11;
            this.precRefViewingDist = i12;
            this.numRefDisplays = i13;
            this.leftViewId = i14;
            this.rightViewId = i15;
            this.exponentRefDisplayWidth = i16;
            this.mantissaRefDisplayWidth = i17;
            this.exponentRefViewingDist = i18;
            this.mantissaRefViewingDist = i19;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int height;
        public final int maxNumReorderPics;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;

        @Nullable
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, @Nullable H265ProfileTierLevel h265ProfileTierLevel, int i11, int i12, int i13, int i14, int i15, int i16, float f11, int i17, int i18, int i19, int i21) {
            this.nalHeader = h265NalHeader;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i11;
            this.bitDepthLumaMinus8 = i12;
            this.bitDepthChromaMinus8 = i13;
            this.seqParameterSetId = i14;
            this.width = i15;
            this.height = i16;
            this.pixelWidthHeightRatio = f11;
            this.maxNumReorderPics = i17;
            this.colorSpace = i18;
            this.colorRange = i19;
            this.colorTransfer = i21;
        }
    }

    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i11, int i12, int i13) {
            this.colorSpace = i11;
            this.colorRange = i12;
            this.colorTransfer = i13;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final ImmutableList<H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    public static final class H265VpsData {
        public final ImmutableList<H265LayerInfo> layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;

        @Nullable
        public final H265RepFormatsAndIndices repFormatsAndIndices;

        @Nullable
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, @Nullable List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, @Nullable H265RepFormatsAndIndices h265RepFormatsAndIndices, @Nullable H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            ImmutableList<H265LayerInfo> immutableListM13439of;
            this.nalHeader = h265NalHeader;
            if (list != null) {
                immutableListM13439of = ImmutableList.copyOf((Collection) list);
            } else {
                immutableListM13439of = ImmutableList.m13439of();
            }
            this.layerInfos = immutableListM13439of;
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i11, int i12, boolean z11) {
            this.picParameterSetId = i11;
            this.seqParameterSetId = i12;
            this.bottomFieldPicOrderInFramePresentFlag = z11;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11, int i18, int i19, boolean z11, boolean z12, int i21, int i22, int i23, boolean z13, int i24, int i25, int i26, int i27) {
            this.profileIdc = i11;
            this.constraintsFlagsAndReservedZero2Bits = i12;
            this.levelIdc = i13;
            this.seqParameterSetId = i14;
            this.maxNumRefFrames = i15;
            this.width = i16;
            this.height = i17;
            this.pixelWidthHeightRatio = f11;
            this.bitDepthLumaMinus8 = i18;
            this.bitDepthChromaMinus8 = i19;
            this.separateColorPlaneFlag = z11;
            this.frameMbsOnlyFlag = z12;
            this.frameNumLength = i21;
            this.picOrderCountType = i22;
            this.picOrderCntLsbLength = i23;
            this.deltaPicOrderAlwaysZeroFlag = z13;
            this.colorSpace = i24;
            this.colorRange = i25;
            this.colorTransfer = i26;
            this.maxNumReorderFrames = i27;
        }
    }

    public static int findNalUnit(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        Assertions.checkState(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            clearPrefixFlags(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & C33556b3.f69083q) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    clearPrefixFlags(zArr);
                    return i16;
                }
                i15 -= 2;
            }
            i15 += 3;
        }
        zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
        zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
        zArr[2] = bArr[i14] == 0;
        return i12;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i11, int i12) {
        while (i11 < i12 - 2) {
            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    public static int getH265NalUnitType(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & BuiltinOptions.RightShiftOptions) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i11) {
        return bArr[i11 + 3] & 31;
    }

    public static boolean isH264NalUnitDependedOn(byte b11) {
        if (((b11 & BuiltinOptions.NonMaxSuppressionV5Options) >> 5) != 0) {
            return true;
        }
        int i11 = b11 & 31;
        return (i11 == 1 || i11 == 9 || i11 == 14) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    private static H265ProfileTierLevel parseH265ProfileTierLevel(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z11, int i11, @Nullable H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i12;
        boolean z12;
        int i13;
        int i14;
        boolean bit;
        int bits;
        int i15;
        int i16;
        int[] iArr2 = new int[6];
        if (!z11) {
            if (h265ProfileTierLevel != null) {
                int i17 = h265ProfileTierLevel.generalProfileSpace;
                bit = h265ProfileTierLevel.generalTierFlag;
                bits = h265ProfileTierLevel.generalProfileIdc;
                i15 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
                iArr2 = h265ProfileTierLevel.constraintBytes;
                i12 = i17;
            } else {
                iArr = iArr2;
                i12 = 0;
                z12 = false;
                i13 = 0;
                i14 = 0;
            }
            int bits2 = parsableNalUnitBitArray.readBits(8);
            i16 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i16 += 88;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    i16 += 8;
                }
            }
            parsableNalUnitBitArray.skipBits(i16);
            if (i11 > 0) {
                parsableNalUnitBitArray.skipBits((8 - i11) * 2);
            }
            return new H265ProfileTierLevel(i12, z12, i13, i14, iArr, bits2);
        }
        int bits3 = parsableNalUnitBitArray.readBits(2);
        bit = parsableNalUnitBitArray.readBit();
        bits = parsableNalUnitBitArray.readBits(5);
        i15 = 0;
        for (int i19 = 0; i19 < 32; i19++) {
            if (parsableNalUnitBitArray.readBit()) {
                i15 |= 1 << i19;
            }
        }
        for (int i21 = 0; i21 < 6; i21++) {
            iArr2[i21] = parsableNalUnitBitArray.readBits(8);
        }
        i12 = bits3;
        iArr = iArr2;
        z12 = bit;
        i13 = bits;
        i14 = i15;
        int bits4 = parsableNalUnitBitArray.readBits(8);
        i16 = 0;
        while (i18 < i11) {
            if (parsableNalUnitBitArray.readBit()) {
                i16 += 88;
            }
            if (parsableNalUnitBitArray.readBit()) {
                i16 += 8;
            }
        }
        parsableNalUnitBitArray.skipBits(i16);
        if (i11 > 0) {
            parsableNalUnitBitArray.skipBits((8 - i11) * 2);
        }
        return new H265ProfileTierLevel(i12, z12, i13, i14, iArr, bits4);
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i11;
        int i12;
        int bits;
        int bits2 = parsableNalUnitBitArray.readBits(16);
        int bits3 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(2);
            if (bits4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int bits5 = parsableNalUnitBitArray.readBits(4);
            bits = parsableNalUnitBitArray.readBits(4);
            i12 = bits5;
            i11 = bits4;
        } else {
            i11 = 0;
            i12 = 0;
            bits = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i11, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i11, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i11, i12, bits, bits2, bits3);
    }

    @Nullable
    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i11, int i12) {
        byte b11;
        int i13 = i11 + 2;
        do {
            i12--;
            b11 = bArr[i12];
            if (b11 != 0) {
                break;
            }
        } while (i12 > i13);
        if (b11 != 0 && i12 > i13) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i13, i12 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int bits = parsableNalUnitBitArray.readBits(8);
                int i14 = 0;
                while (bits == 255) {
                    i14 += 255;
                    bits = parsableNalUnitBitArray.readBits(8);
                }
                int i15 = i14 + bits;
                int bits2 = parsableNalUnitBitArray.readBits(8);
                int i16 = 0;
                while (bits2 == 255) {
                    i16 += 255;
                    bits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i17 = i16 + bits2;
                if (i17 == 0 || !parsableNalUnitBitArray.canReadBits(i17)) {
                    break;
                }
                if (i15 == 176) {
                    int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean bit = parsableNalUnitBitArray.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i18 = -1;
                    int bits5 = -1;
                    for (int i19 = 0; i19 <= unsignedExpGolombCodedInt3; i19++) {
                        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        bits3 = parsableNalUnitBitArray.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = parsableNalUnitBitArray.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = parsableNalUnitBitArray.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            i18 = bits6;
                            bits5 = parsableNalUnitBitArray.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i18, bits5);
                }
            }
        }
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i11, int i12, @Nullable H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i11 + 2, i12, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i11, i12)), h265VpsData);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i11, int i12) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i11, int i12) {
        return parsePpsNalUnitPayload(bArr, i11 + 1, i12);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i11, int i12) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i11, int i12) {
        return parseSpsNalUnitPayload(bArr, i11 + 1, i12);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203  */
    /* JADX WARN: Code duplicated, block: B:122:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0213  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i11, int i12) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        int i13;
        int i14;
        boolean z11;
        int unsignedExpGolombCodedInt3;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean bit2;
        boolean bit3;
        int i23;
        int i24;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        int bits = parsableNalUnitBitArray.readBits(8);
        int bits2 = parsableNalUnitBitArray.readBits(8);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i25 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                i13 = 16;
                int i26 = 0;
                while (i26 < i25) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i26 < 6 ? 16 : 64);
                    }
                    i26++;
                }
            } else {
                i13 = 16;
            }
            i14 = unsignedExpGolombCodedInt5;
        } else {
            unsignedExpGolombCodedInt = 1;
            i13 = 16;
            i14 = 0;
            bit = false;
            unsignedExpGolombCodedInt2 = 0;
        }
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt7 == 0) {
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            bits = bits;
            unsignedExpGolombCodedInt7 = unsignedExpGolombCodedInt7;
            z11 = false;
        } else {
            if (unsignedExpGolombCodedInt7 == 1) {
                boolean bit4 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                long unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i27 = 0; i27 < unsignedExpGolombCodedInt8; i27++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z11 = bit4;
            } else {
                z11 = false;
            }
            unsignedExpGolombCodedInt3 = 0;
        }
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i28 = (2 - (bit5 ? 1 : 0)) * unsignedExpGolombCodedInt11;
        if (!bit5) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i29 = unsignedExpGolombCodedInt10 * 16;
        int i31 = i28 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i24 = 2 - (bit5 ? 1 : 0);
                i23 = 1;
            } else {
                i23 = unsignedExpGolombCodedInt == 3 ? 1 : 2;
                i24 = (unsignedExpGolombCodedInt == 1 ? 2 : 1) * (2 - (bit5 ? 1 : 0));
            }
            i29 -= (unsignedExpGolombCodedInt12 + unsignedExpGolombCodedInt13) * i23;
            i31 -= (unsignedExpGolombCodedInt14 + unsignedExpGolombCodedInt15) * i24;
        }
        int i32 = i29;
        int i33 = bits;
        int unsignedExpGolombCodedInt16 = ((i33 == 44 || i33 == 86 || i33 == 100 || i33 == 110 || i33 == 122 || i33 == 244) && (bits2 & 16) != 0) ? 0 : i13;
        float f12 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits4 = parsableNalUnitBitArray.readBits(8);
                if (bits4 == 255) {
                    int i34 = i13;
                    int bits5 = parsableNalUnitBitArray.readBits(i34);
                    int bits6 = parsableNalUnitBitArray.readBits(i34);
                    if (bits5 != 0 && bits6 != 0) {
                        f12 = bits5 / bits6;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits4 < fArr.length) {
                        f12 = fArr[bits4];
                    } else {
                        Log.m2961w(TAG, "Unexpected aspect_ratio_idc value: " + bits4);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i21 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits7 = parsableNalUnitBitArray.readBits(8);
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits7);
                    int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8);
                    i22 = iIsoColorPrimariesToColorSpace;
                    i19 = iIsoTransferCharacteristicsToColorTransfer;
                } else {
                    i19 = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBits(65);
                }
                bit2 = parsableNalUnitBitArray.readBit();
                if (bit2) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                bit3 = parsableNalUnitBitArray.readBit();
                if (bit3) {
                    skipHrdParameters(parsableNalUnitBitArray);
                }
                if (bit2 || bit3) {
                    parsableNalUnitBitArray.skipBit();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.skipBit();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i18 = i19;
                i17 = i21;
                i15 = unsignedExpGolombCodedInt16;
                f11 = f12;
                i16 = i22;
            } else {
                i19 = -1;
                i21 = -1;
            }
            i22 = -1;
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(65);
            }
            bit2 = parsableNalUnitBitArray.readBit();
            if (bit2) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            bit3 = parsableNalUnitBitArray.readBit();
            if (bit3) {
                skipHrdParameters(parsableNalUnitBitArray);
            }
            if (bit2) {
                parsableNalUnitBitArray.skipBit();
            } else {
                parsableNalUnitBitArray.skipBit();
            }
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            i18 = i19;
            i17 = i21;
            i15 = unsignedExpGolombCodedInt16;
            f11 = f12;
            i16 = i22;
        } else {
            i15 = unsignedExpGolombCodedInt16;
            f11 = 1.0f;
            i16 = -1;
            i17 = -1;
            i18 = -1;
        }
        return new SpsData(i33, bits2, bits3, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt9, i32, i31, f11, unsignedExpGolombCodedInt2, i14, bit, bit5, unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt3, z11, i16, i17, i18, i15);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11) {
        int signedExpGolombCodedInt = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i11; i13++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i12) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i12 = signedExpGolombCodedInt;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i11) {
        int i12;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i13 = 0;
            while (iFindNextUnescapeIndex < i11) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i11);
                    if (iFindNextUnescapeIndex < i11) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i13) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i13] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i13++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i12 = i11 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = scratchEscapePositions[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i12 - i14);
        }
        return i12;
    }

    private NalUnitUtil() {
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            if (i13 < iPosition) {
                int i14 = byteBuffer.get(i11) & 255;
                if (i12 == 3) {
                    if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i11 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i14 == 0) {
                    i12++;
                }
                if (i14 != 0) {
                    i12 = 0;
                }
                i11 = i13;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean isNalUnitSei(Format format, byte b11) {
        return ((Objects.equals(format.sampleMimeType, "video/avc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/avc")) && (b11 & 31) == 6) || ((Objects.equals(format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/hevc")) && ((b11 & BuiltinOptions.RightShiftOptions) >> 1) == 39);
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i12 = unsignedExpGolombCodedInt + 1;
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(i12);
        int[] iArr = new int[i11];
        for (int i13 = 0; i13 < i12; i13++) {
            builderBuilderWithExpectedSize.add(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i14 = 1;
        if (i12 > 1 && parsableNalUnitBitArray.readBit()) {
            int iLog2 = DoubleMath.log2(i12, RoundingMode.CEILING);
            while (i14 < i11) {
                iArr[i14] = parsableNalUnitBitArray.readBits(iLog2);
                i14++;
            }
        } else {
            while (i14 < i11) {
                iArr[i14] = Math.min(i14, unsignedExpGolombCodedInt);
                i14++;
            }
        }
        return new H265RepFormatsAndIndices(builderBuilderWithExpectedSize.build(), iArr);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, int i12, int[] iArr) {
        boolean bit;
        boolean bit2;
        boolean bit3;
        int bits;
        if (!parsableNalUnitBitArray.readBit()) {
            bit = parsableNalUnitBitArray.readBit();
        } else {
            bit = true;
        }
        if (bit) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean bit4 = parsableNalUnitBitArray.readBit();
        boolean bit5 = parsableNalUnitBitArray.readBit();
        if (bit4 || bit5) {
            for (int i13 = 0; i13 < i12; i13++) {
                for (int i14 = 0; i14 < iArr[i13]; i14++) {
                    if (bit4) {
                        bit2 = parsableNalUnitBitArray.readBit();
                    } else {
                        bit2 = false;
                    }
                    if (bit5) {
                        bit3 = parsableNalUnitBitArray.readBit();
                    } else {
                        bit3 = false;
                    }
                    if (bit2) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (bit3) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean bit6 = parsableNalUnitBitArray.readBit();
        if (bit6) {
            bits = parsableNalUnitBitArray.readBits(4) + 1;
        } else {
            bits = i11;
        }
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(bits);
        int[] iArr2 = new int[i11];
        for (int i15 = 0; i15 < bits; i15++) {
            builderBuilderWithExpectedSize.add(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (bit6 && bits > 1) {
            for (int i16 = 0; i16 < i11; i16++) {
                iArr2[i16] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(builderBuilderWithExpectedSize.build(), iArr2);
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i11;
        int i12;
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < unsignedExpGolombCodedInt; i15++) {
            if (i15 != 0 && parsableNalUnitBitArray.readBit()) {
                int i16 = i13 + i14;
                int unsignedExpGolombCodedInt2 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i17 = i16 + 1;
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 <= i16; i18++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i18] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i18] = true;
                    }
                }
                int[] iArr2 = new int[i17];
                int[] iArr3 = new int[i17];
                int i19 = 0;
                for (int i21 = i14 - 1; i21 >= 0; i21--) {
                    int i22 = iArrCopyOf[i21] + unsignedExpGolombCodedInt2;
                    if (i22 < 0 && zArr[i13 + i21]) {
                        iArr2[i19] = i22;
                        i19++;
                    }
                }
                if (unsignedExpGolombCodedInt2 < 0 && zArr[i16]) {
                    iArr2[i19] = unsignedExpGolombCodedInt2;
                    i19++;
                }
                for (int i23 = 0; i23 < i13; i23++) {
                    int i24 = iArr[i23] + unsignedExpGolombCodedInt2;
                    if (i24 < 0 && zArr[i23]) {
                        iArr2[i19] = i24;
                        i19++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i19);
                int i25 = 0;
                for (int i26 = i13 - 1; i26 >= 0; i26--) {
                    int i27 = iArr[i26] + unsignedExpGolombCodedInt2;
                    if (i27 > 0 && zArr[i26]) {
                        iArr3[i25] = i27;
                        i25++;
                    }
                }
                if (unsignedExpGolombCodedInt2 > 0 && zArr[i16]) {
                    iArr3[i25] = unsignedExpGolombCodedInt2;
                    i25++;
                }
                for (int i28 = 0; i28 < i14; i28++) {
                    int i29 = iArrCopyOf[i28] + unsignedExpGolombCodedInt2;
                    if (i29 > 0 && zArr[i13 + i28]) {
                        iArr3[i25] = i29;
                        i25++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i25);
                iArr = iArrCopyOf2;
                i13 = i19;
                i14 = i25;
            } else {
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr4 = new int[unsignedExpGolombCodedInt3];
                for (int i31 = 0; i31 < unsignedExpGolombCodedInt3; i31++) {
                    if (i31 > 0) {
                        i12 = iArr4[i31 - 1];
                    } else {
                        i12 = 0;
                    }
                    iArr4[i31] = i12 - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                }
                int[] iArr5 = new int[unsignedExpGolombCodedInt4];
                for (int i32 = 0; i32 < unsignedExpGolombCodedInt4; i32++) {
                    if (i32 > 0) {
                        i11 = iArr5[i32 - 1];
                    } else {
                        i11 = 0;
                    }
                    iArr5[i32] = i11 + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                }
                i13 = unsignedExpGolombCodedInt3;
                iArr = iArr4;
                i14 = unsignedExpGolombCodedInt4;
                iArrCopyOf = iArr5;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i11 = 0; i11 < unsignedExpGolombCodedInt; i11++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i12 = 1; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i14 = 1; i14 <= unsignedExpGolombCodedInt2; i14++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }
}
