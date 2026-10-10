package com.tencent.thumbplayer.tcmedia.core.common;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes63.dex */
public class TPUnitendCodecUtils {
    private static int DolbyVisionProfileDvavPen = 1;
    private static int DolbyVisionProfileDvavPer = 0;
    private static int DolbyVisionProfileDvavSe = 9;
    private static int DolbyVisionProfileDvheDen = 3;
    private static int DolbyVisionProfileDvheDer = 2;
    private static int DolbyVisionProfileDvheDtb = 7;
    private static int DolbyVisionProfileDvheDth = 6;
    private static int DolbyVisionProfileDvheDtr = 4;
    private static int DolbyVisionProfileDvheSt = 8;
    private static int DolbyVisionProfileDvheStn = 5;
    private static HashMap<String, String> mSecureDecoderNameMaps;

    public static int convertOmxProfileToDolbyVision(int i11) {
        int i12;
        if (i11 == 1) {
            i12 = DolbyVisionProfileDvavPer;
        } else if (i11 == 2) {
            i12 = DolbyVisionProfileDvavPen;
        } else if (i11 == 4) {
            i12 = DolbyVisionProfileDvheDer;
        } else if (i11 == 8) {
            i12 = DolbyVisionProfileDvheDen;
        } else if (i11 == 16) {
            i12 = DolbyVisionProfileDvheDtr;
        } else if (i11 == 32) {
            i12 = DolbyVisionProfileDvheStn;
        } else if (i11 == 64) {
            i12 = DolbyVisionProfileDvheDth;
        } else if (i11 == 128) {
            i12 = DolbyVisionProfileDvheDtb;
        } else if (i11 != 256) {
            i12 = i11 != 512 ? 0 : DolbyVisionProfileDvavSe;
        } else {
            i12 = DolbyVisionProfileDvheSt;
        }
        TPNativeLog.printLog(2, "TPUnitendCodecUtils", "convertOmxProfileToDolbyVision omxProfile:" + i11 + " dolbyVisionProfile:" + i12);
        return i12;
    }

    public static synchronized String getDolbyVisionDecoderName(String str, int i11, int i12, boolean z11) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities codecCapabilities = null;
        if (!TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        int length = codecInfos.length;
        String name = null;
        int i13 = 0;
        while (i13 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i13];
            TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:" + mediaCodecInfo.getName());
            if (!mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                } catch (Exception unused) {
                    capabilitiesForType = codecCapabilities;
                }
                if (capabilitiesForType != null) {
                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                    for (int i14 = 0; i14 < codecProfileLevelArr.length; i14++) {
                        int iConvertOmxProfileToDolbyVision = convertOmxProfileToDolbyVision(codecProfileLevelArr[i14].profile);
                        if (iConvertOmxProfileToDolbyVision == i11) {
                            TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName i:" + i14 + " profile:" + iConvertOmxProfileToDolbyVision + " dvProfile:" + i11 + " bSecure:" + z11 + " name:" + mediaCodecInfo.getName());
                            if (!z11 || capabilitiesForType.isFeatureSupported("secure-playback")) {
                                name = mediaCodecInfo.getName();
                                break;
                            }
                        }
                    }
                    if (name != null) {
                        TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:".concat(name));
                        break;
                    }
                } else {
                    continue;
                }
            }
            i13++;
            codecCapabilities = null;
        }
        return name;
    }

    public static synchronized String getSecureDecoderName(String str) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        String name = null;
        if (!TextUtils.equals("video/avc", str) && !TextUtils.equals("video/hevc", str) && !TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        if (mSecureDecoderNameMaps == null) {
            mSecureDecoderNameMaps = new HashMap<>();
        }
        if (mSecureDecoderNameMaps.containsKey(str)) {
            return mSecureDecoderNameMaps.get(str);
        }
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                try {
                    capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                } catch (Exception unused) {
                    capabilitiesForType = null;
                }
                if (capabilitiesForType != null && capabilitiesForType.isFeatureSupported("secure-playback")) {
                    name = mediaCodecInfo.getName();
                    break;
                }
            }
        }
        mSecureDecoderNameMaps.put(str, name);
        return name;
    }
}
