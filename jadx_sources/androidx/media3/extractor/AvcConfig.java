package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
@UnstableApi
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String strBuildAvcCodecString;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i19 = 0; i19 < unsignedByte2; i19++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i21 = 0; i21 < unsignedByte3; i21++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), unsignedByte, ((byte[]) arrayList.get(0)).length);
                int i22 = spsNalUnit.width;
                int i23 = spsNalUnit.height;
                int i24 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i25 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i26 = spsNalUnit.colorSpace;
                int i27 = spsNalUnit.colorRange;
                int i28 = spsNalUnit.colorTransfer;
                int i29 = spsNalUnit.maxNumReorderFrames;
                float f12 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i15 = i28;
                i16 = i29;
                f11 = f12;
                i14 = i25;
                i17 = i26;
                i18 = i27;
                i11 = i22;
                i12 = i23;
                i13 = i24;
            } else {
                strBuildAvcCodecString = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                f11 = 1.0f;
                i17 = -1;
                i18 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i11, i12, i13, i14, i17, i18, i15, i16, f11, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e11);
        }
    }

    private AvcConfig(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f11, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i11;
        this.width = i12;
        this.height = i13;
        this.bitdepthLuma = i14;
        this.bitdepthChroma = i15;
        this.colorSpace = i16;
        this.colorRange = i17;
        this.colorTransfer = i18;
        this.maxNumReorderFrames = i19;
        this.pixelWidthHeightRatio = f11;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }
}
