package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes34.dex */
@SuppressLint({"InlinedApi"})
@UnstableApi
public final class CodecSpecificDataUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_H263 = "s263";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final int EXTENDED_PAR = 15;
    private static final int RECTANGULAR = 0;
    private static final String TAG = "CodecSpecificDataUtil";
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    public static List<byte[]> buildCea708InitializationData(boolean z11) {
        return Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
    }

    private static int findNalStartCode(byte[] bArr, int i11) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i11 <= length) {
            if (isNalStartCode(bArr, i11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Nullable
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int iMp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Log.m2961w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (iMp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iMp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i11;
        if (strArr.length < 4) {
            Log.m2961w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i12 = 1;
        try {
            int i13 = Integer.parseInt(strArr[1]);
            int i14 = Integer.parseInt(strArr[2].substring(0, 2));
            int i15 = Integer.parseInt(strArr[3]);
            if (i13 != 0) {
                Log.m2961w(TAG, "Unknown AV1 profile: " + i13);
                return null;
            }
            if (i15 != 8 && i15 != 10) {
                Log.m2961w(TAG, "Unknown AV1 bit depth: " + i15);
                return null;
            }
            if (i15 != 8) {
                i12 = (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i11 = colorInfo.colorTransfer) == 7 || i11 == 6)) ? 2 : 4096;
            }
            int iAv1LevelNumberToConst = av1LevelNumberToConst(i14);
            if (iAv1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(iAv1LevelNumberToConst));
            }
            Log.m2961w(TAG, "Unknown AV1 level: " + i14);
            return null;
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int i11;
        int i12;
        if (strArr.length < 2) {
            Log.m2961w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i12 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i11 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.m2961w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i13 = Integer.parseInt(strArr[1]);
                i11 = Integer.parseInt(strArr[2]);
                i12 = i13;
            }
            int iAvcProfileNumberToConst = avcProfileNumberToConst(i12);
            if (iAvcProfileNumberToConst == -1) {
                Log.m2961w(TAG, "Unknown AVC profile: " + i12);
                return null;
            }
            int iAvcLevelNumberToConst = avcLevelNumberToConst(i11);
            if (iAvcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iAvcProfileNumberToConst), Integer.valueOf(iAvcLevelNumberToConst));
            }
            Log.m2961w(TAG, "Unknown AVC level: " + i11);
            return null;
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> getCodecProfileAndLevel(Format format) {
        byte b11 = 0;
        String str = format.codecs;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(format.sampleMimeType)) {
            return getDolbyVisionProfileAndLevel(format.codecs, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals(CODEC_ID_AV01)) {
                    b11 = -1;
                }
                break;
            case 3006243:
                b11 = !str2.equals(CODEC_ID_AVC1) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b11 = !str2.equals(CODEC_ID_AVC2) ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b11 = !str2.equals(CODEC_ID_HEV1) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b11 = !str2.equals(CODEC_ID_HVC1) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b11 = !str2.equals(CODEC_ID_MP4A) ? (byte) -1 : (byte) 5;
                break;
            case 3475740:
                b11 = !str2.equals(CODEC_ID_H263) ? (byte) -1 : (byte) 6;
                break;
            case 3624515:
                b11 = !str2.equals(CODEC_ID_VP09) ? (byte) -1 : (byte) 7;
                break;
            default:
                b11 = -1;
                break;
        }
        switch (b11) {
            case 0:
                return getAv1ProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 1:
            case 2:
                return getAvcProfileAndLevel(format.codecs, strArrSplit);
            case 3:
            case 4:
                return getHevcProfileAndLevel(format.codecs, strArrSplit, format.colorInfo);
            case 5:
                return getAacCodecProfileAndLevel(format.codecs, strArrSplit);
            case 6:
                return getH263ProfileAndLevel(format.codecs, strArrSplit);
            case 7:
                return getVp9ProfileAndLevel(format.codecs, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.m2961w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numDolbyVisionStringToProfile = dolbyVisionStringToProfile(strGroup);
        if (numDolbyVisionStringToProfile == null) {
            Log.m2961w(TAG, "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numDolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (numDolbyVisionStringToLevel != null) {
            return new Pair<>(numDolbyVisionStringToProfile, numDolbyVisionStringToLevel);
        }
        Log.m2961w(TAG, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    public static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        if (strArr.length < 4) {
            Log.m2961w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i11 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.m2961w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            i11 = 6;
            if ("2".equals(strGroup)) {
                i11 = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
            } else if (!"6".equals(strGroup)) {
                Log.m2961w(TAG, "Unknown HEVC profile string: " + strGroup);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer numHevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (numHevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i11), numHevcCodecStringToProfileLevel);
        }
        Log.m2961w(TAG, "Unknown HEVC level string: " + str2);
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.m2961w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i11 = Integer.parseInt(strArr[1]);
            int i12 = Integer.parseInt(strArr[2]);
            int iVp9ProfileNumberToConst = vp9ProfileNumberToConst(i11);
            if (iVp9ProfileNumberToConst == -1) {
                Log.m2961w(TAG, "Unknown VP9 profile: " + i11);
                return null;
            }
            int iVp9LevelNumberToConst = vp9LevelNumberToConst(i12);
            if (iVp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(iVp9ProfileNumberToConst), Integer.valueOf(iVp9LevelNumberToConst));
            }
            Log.m2961w(TAG, "Unknown VP9 level: " + i12);
            return null;
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static boolean isNalStartCode(byte[] bArr, int i11) {
        if (bArr.length - i11 <= NAL_START_CODE.length) {
            return false;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i12 >= bArr2.length) {
                return true;
            }
            if (bArr[i11 + i12] != bArr2[i12]) {
                return false;
            }
            i12++;
        }
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iFindNalStartCode = 0;
        do {
            arrayList.add(Integer.valueOf(iFindNalStartCode));
            iFindNalStartCode = findNalStartCode(bArr, iFindNalStartCode + NAL_START_CODE.length);
        } while (iFindNalStartCode != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i11)).intValue();
            int iIntValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }

    private static int vp9ProfileNumberToConst(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 8;
        }
        return 4;
    }

    private static int avcProfileNumberToConst(int i11) {
        if (i11 == 66) {
            return 1;
        }
        if (i11 == 77) {
            return 2;
        }
        if (i11 == 88) {
            return 4;
        }
        if (i11 == 100) {
            return 8;
        }
        if (i11 == 110) {
            return 16;
        }
        if (i11 != 122) {
            return i11 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildHevcCodecString(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        StringBuilder sb2 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, bArr2.length, i12);
        return bArr3;
    }

    public static ImmutableList<byte[]> buildVp9CodecPrivateInitializationData(byte b11, byte b12, byte b13, byte b14) {
        return ImmutableList.m13440of(new byte[]{1, 1, b11, 2, 1, b12, 3, 1, b13, 4, 1, b14});
    }

    @Nullable
    private static Integer dolbyVisionStringToLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    @Nullable
    private static Integer dolbyVisionStringToProfile(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            case "10":
                return 1024;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            Log.m2961w(TAG, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            Log.m2961w(TAG, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z11;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 3;
            if (i13 >= bArr.length) {
                z11 = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i13] & 240) == 32) {
                z11 = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i12++;
        }
        Assertions.checkArgument(z11, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i12 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        Assertions.checkArgument(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        Assertions.checkArgument(parsableBitArray.readBit());
        int bits = parsableBitArray.readBits(16);
        Assertions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            Assertions.checkArgument(bits > 0);
            for (int i14 = bits - 1; i14 > 0; i14 >>= 1) {
                i11++;
            }
            parsableBitArray.skipBits(i11);
        }
        Assertions.checkArgument(parsableBitArray.readBit());
        int bits2 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        int bits3 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(bits2), Integer.valueOf(bits3));
    }

    @Nullable
    private static Integer hevcCodecStringToProfileLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "H30":
                return 2;
            case "H60":
                return 8;
            case "H63":
                return 32;
            case "H90":
                return 128;
            case "H93":
                return 512;
            case "L30":
                return 1;
            case "L60":
                return 4;
            case "L63":
                return 16;
            case "L90":
                return 64;
            case "L93":
                return 256;
            case "H120":
                return 2048;
            case "H123":
                return 8192;
            case "H150":
                return 32768;
            case "H153":
                return 131072;
            case "H156":
                return 524288;
            case "H180":
                return 2097152;
            case "H183":
                return 8388608;
            case "H186":
                return 33554432;
            case "L120":
                return 1024;
            case "L123":
                return 4096;
            case "L150":
                return 16384;
            case "L153":
                return 65536;
            case "L156":
                return 262144;
            case "L180":
                return 1048576;
            case "L183":
                return 4194304;
            case "L186":
                return 16777216;
            default:
                return null;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 20;
            if (i11 != 20) {
                i12 = 23;
                if (i11 != 23) {
                    i12 = 29;
                    if (i11 != 29) {
                        i12 = 39;
                        if (i11 != 39) {
                            i12 = 42;
                            if (i11 != 42) {
                                switch (i11) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i12;
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(unsignedByte));
    }

    private static int vp9LevelNumberToConst(int i11) {
        if (i11 == 10) {
            return 1;
        }
        if (i11 == 11) {
            return 2;
        }
        if (i11 == 20) {
            return 4;
        }
        if (i11 == 21) {
            return 8;
        }
        if (i11 == 30) {
            return 16;
        }
        if (i11 == 31) {
            return 32;
        }
        if (i11 == 40) {
            return 64;
        }
        if (i11 == 41) {
            return 128;
        }
        if (i11 == 50) {
            return 256;
        }
        if (i11 == 51) {
            return 512;
        }
        switch (i11) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private CodecSpecificDataUtil() {
    }

    private static int av1LevelNumberToConst(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i11) {
        switch (i11) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i11) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i11) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i11) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i11) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static String buildAvcCodecString(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static String buildH263CodecString(int i11, int i12) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        if (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1) {
            return false;
        }
        return true;
    }
}
