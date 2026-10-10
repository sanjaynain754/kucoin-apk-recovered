package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;

    @Nullable
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        return parseImpl(parsableByteArray, false, null);
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z11, @Nullable NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z12;
        int i11;
        NalUnitUtil.H265Sei3dRefDisplayInfoData h265Sei3dRefDisplayInfo;
        try {
            if (z11) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z12 = true;
                if (i13 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i15 = 0; i15 < unsignedShort; i15++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i14 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i13++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i14];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f11 = 1.0f;
            String strBuildHevcCodecString = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i28 = i12;
                NalUnitUtil.H265VpsData h265VpsNalUnit = h265VpsData2;
                while (i28 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z13 = z12;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i29 = unsignedByte;
                    System.arraycopy(bArr2, i12, bArr, i27, bArr2.length);
                    int length = i27 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 32 && i28 == 0) {
                        h265VpsNalUnit = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + unsignedShort4);
                        i11 = unsignedByte2;
                    } else if (unsignedByte3 == 33 && i28 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4, h265VpsNalUnit);
                        i16 = h265SpsNalUnit.width;
                        i17 = h265SpsNalUnit.height;
                        i18 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                        i19 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                        int i31 = h265SpsNalUnit.colorSpace;
                        int i32 = h265SpsNalUnit.colorRange;
                        i11 = unsignedByte2;
                        int i33 = h265SpsNalUnit.colorTransfer;
                        float f12 = h265SpsNalUnit.pixelWidthHeightRatio;
                        int i34 = h265SpsNalUnit.maxNumReorderPics;
                        NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
                        if (h265ProfileTierLevel != null) {
                            strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                        }
                        f11 = f12;
                        i25 = i34;
                        i22 = i32;
                        i23 = i33;
                        i12 = 0;
                        i21 = i31;
                    } else {
                        i11 = unsignedByte2;
                        if (unsignedByte3 != 39 || i28 != 0 || (h265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + unsignedShort4)) == null || h265VpsNalUnit == null) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            i24 = h265Sei3dRefDisplayInfo.leftViewId == h265VpsNalUnit.layerInfos.get(0).viewId ? 4 : 5;
                        }
                    }
                    i27 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i28++;
                    z12 = z13;
                    unsignedByte = i29;
                    unsignedByte2 = i11;
                }
                i26++;
                h265VpsData2 = h265VpsNalUnit;
            }
            return new HevcConfig(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i16, i17, i18, i19, i21, i22, i23, i24, f11, i25, strBuildHevcCodecString, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z11 ? "L-HEVC config" : "HEVC config");
            throw ParserException.createForMalformedContainer(sb2.toString(), e11);
        }
    }

    private HevcConfig(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f11, int i21, @Nullable String str, @Nullable NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i11;
        this.width = i12;
        this.height = i13;
        this.bitdepthLuma = i14;
        this.bitdepthChroma = i15;
        this.colorSpace = i16;
        this.colorRange = i17;
        this.colorTransfer = i18;
        this.stereoMode = i19;
        this.pixelWidthHeightRatio = f11;
        this.maxNumReorderPics = i21;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }
}
