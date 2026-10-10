package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.common.MimeTypes;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.thumbplayer.tcmedia.core.thirdparties.LocalCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes63.dex */
public class TPCodecUtils {
    public static final int CAP_AUDIO_AAC = 8;
    public static final int CAP_AUDIO_DD = 16;
    public static final int CAP_AUDIO_DDP = 32;
    public static final int CAP_AUDIO_DTS = 128;
    public static final int CAP_AUDIO_FLAC = 64;
    public static final int CAP_VIDEO_AVC = 1;
    public static final int CAP_VIDEO_HEVC = 2;
    public static final int CAP_VIDEO_VP8 = 256;
    public static final int CAP_VIDEO_VP9 = 4;
    public static final int PLAYER_LEVEL_0 = 0;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_28 = 28;
    public static final int PLAYER_LEVEL_33 = 33;
    public static final int PLAYER_LEVEL_6 = 6;
    public static final int PLAYER_LEVEL_UNKNOWN = -1;
    private static final String TAG = "TPCodecUtils";
    private static final String VVC_SHD_HISI_CPU_NAME = "Kirin9000E";
    private static final String VVC_SHD_MTK_CPU_NAME = "MT6893";
    private static final String VVC_SHD_QUALCOMMN_CPU_NAME = "SM8250";
    private static final String VVC_SHD_SAMSUNG_CPU_NAME = "Exynos2100";
    private static int mAACMaxSupportedBitrate = 510000;
    private static int mAACMaxSupportedChannels = 8;
    private static int mAACMaxSupportedSamplerate = 96000;
    private static TPCodecCapability.TPCodecMaxCapability mAV1SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVCSWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mAVS3WMaxCapability = null;
    private static int mAvs3DeviceLevel = -1;
    private static HashMap<String, Integer> mCodecCapBlackList = null;
    private static HashMap<String, Integer> mCodecCapWhiteList = null;
    private static Context mContext = null;
    private static int mDDPMaxSupportedBitrate = 6144000;
    private static int mDDPMaxSupportedChannels = 8;
    private static int mDDPMaxSupportedSamplerate = 48000;
    private static int mFLACMaxSupportedBitrate = 21000000;
    private static int mFLACMaxSupportedChannels = 8;
    private static int mFLACMaxSupportedSamplerate = 192000;
    private static TPCodecCapability.TPCodecMaxCapability mHEVCSWMaxCapability = null;
    private static int mHevcDeviceLevel = -1;
    private static boolean mIsFFmpegCapGot = false;
    private static LocalCache mLocalCache = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecHwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxACodecSwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecHwCapabilityMap = null;
    private static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> mMaxVCodecSwCapabilityMap = null;
    private static TPCodecCapability.TPCodecMaxCapability mVP8SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mVP9SWMaxCapability = null;
    private static TPCodecCapability.TPCodecMaxCapability mVVCSWMaxCapability = null;
    private static int mVvcDeviceLevel = -1;
    protected static ArrayList<String> mVMediaCodecCapList = new ArrayList<>();
    protected static ArrayList<String> mAMediaCodecCapList = new ArrayList<>();
    private static ArrayList<String> mVMediaCodecBlackListModel = new ArrayList<>();
    private static ArrayList<String> mAMediaCodecBlackListModel = new ArrayList<>();
    private static ArrayList<String> mAMediaCodecBlackListInstance = new ArrayList<>();
    private static ArrayList<String> mSupportedMediaCodec = new ArrayList<>();
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrWhiteMap = new HashMap<>();
    private static HashMap<Integer, HashMap<String, TPCodecCapability.TPHdrSupportVersionRange>> mHdrBlackMap = new HashMap<>();
    private static HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> mHDRVividSupportVersionMap = new HashMap<>();
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRSoftwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> mHDRTypeToHDRHardwareCodecWhiteListMap = new HashMap<>();
    private static HashMap<String, String> mAudioMaxCapCodecInstance = new HashMap<>();
    private static ArrayList<String> mWideVineBlackListModel = new ArrayList<>();
    private static HashMap<Integer, ArrayList<String>> mDrmL1BlackList = new HashMap<>();
    private static boolean mIsInitDone = false;
    private static boolean mPreferredSoftwareComponent = false;
    private static int mShdHevcQualcommIndex = 32;
    private static int mHdHevcQualcommIndex = 20;
    private static int mShdHevcMtkIndex = 12;
    private static int mHdHevcMtkIndex = 8;
    private static int mShdHevcHisiIndex = 8;
    private static int mHdHevcHisiIndex = 3;
    private static int mShdHevcSamsungIndex = 8;
    private static int mHdHevcSamsungIndex = 5;
    private static int mFhdAvs3QualcommIndex = 58;
    private static int mShdAvs3QualcommIndex = 55;
    private static int mFhdAvs3HisiIndex = 14;
    private static SparseArray<VideoSwCapabilityModel> mVideoCodecIdToSwCapabilityModel = new SparseArray<>();
    private static HashMap<DefinitionName, Integer> mDefinitionNameToDecodeLevelTable = new HashMap<>();

    public enum DefinitionName {
        DEFINITION_720P
    }

    public static class VideoSwCapabilityModel {
        SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecTable;

        public static class Builder {
            private SparseArray<HashMap<DefinitionName, String>> mCpuProducerToAllDefinitionDecCapabilities = new SparseArray<>();

            public Builder addVideoDecCap(int i11, DefinitionName definitionName, String str) {
                HashMap<DefinitionName, String> map = this.mCpuProducerToAllDefinitionDecCapabilities.get(i11);
                if (map == null) {
                    map = new HashMap<>();
                    this.mCpuProducerToAllDefinitionDecCapabilities.put(i11, map);
                }
                map.put(definitionName, str);
                return this;
            }

            public VideoSwCapabilityModel build() {
                VideoSwCapabilityModel videoSwCapabilityModel = new VideoSwCapabilityModel();
                videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable = this.mCpuProducerToAllDefinitionDecCapabilities;
                return videoSwCapabilityModel;
            }
        }

        private VideoSwCapabilityModel() {
            this.mCpuProducerToAllDefinitionDecTable = new SparseArray<>();
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        mCodecCapWhiteList = map;
        map.put("NX511J", 11);
        mCodecCapWhiteList.put("Hi3798MV100", 11);
        mCodecCapWhiteList.put("长虹智能电视", 11);
        mCodecCapWhiteList.put("Android TV on Tcl 901", 11);
        mCodecCapWhiteList.put("xt880b", 11);
        mSupportedMediaCodec.add("video/avc");
        mSupportedMediaCodec.add("video/hevc");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp8");
        mSupportedMediaCodec.add("video/x-vnd.on2.vp9");
        mSupportedMediaCodec.add("video/av01");
        mSupportedMediaCodec.add("audio/mp4a-latm");
        mSupportedMediaCodec.add(MimeTypes.AUDIO_AC3);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_E_AC3);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_E_AC3_JOC);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_FLAC);
        mSupportedMediaCodec.add(MimeTypes.AUDIO_DTS);
        mAMediaCodecBlackListInstance.add("OMX.qti.audio.decoder.flac");
        mVMediaCodecBlackListModel.add("SM-J7008");
        mVMediaCodecBlackListModel.add("SM-J5008");
        mVMediaCodecBlackListModel.add("TCL i806");
        mVMediaCodecBlackListModel.add("NX511J");
        mVMediaCodecBlackListModel.add("vivo Y11i T");
        mVMediaCodecBlackListModel.add("长虹智能电视");
        mVMediaCodecBlackListModel.add("MI 1S");
        mVMediaCodecBlackListModel.add("SP9832A");
        mVMediaCodecBlackListModel.add("SP9830A");
        mVMediaCodecBlackListModel.add("VOTO GT17");
        mVMediaCodecBlackListModel.add("EVA-AL10");
        mHDRVividSupportVersionMap.put("TAS-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("TAS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00P", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AN00m", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-TL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("LIO-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ANA-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-TN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100165, 99, 3));
        mHDRVividSupportVersionMap.put("ELS-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100166, 99, 3));
        mHDRVividSupportVersionMap.put("MRX-AL09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AL19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-AN19", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("MRX-W39", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 1100150, 99, 5));
        mHDRVividSupportVersionMap.put("OCE-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("OCE-AN50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-NX9", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AN01", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOH-AL00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("NOP-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN00", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AN10", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL50", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-AL60", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N29", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("JAD-N09", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550X", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-550AX", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-560B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("HEGE-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200187, 99, 0));
        mHDRVividSupportVersionMap.put("PLAT-760", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200172, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350B", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350C", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-360S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-370S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200185, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-359", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("KANT-369", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 200183, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-550", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-560", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-570", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("THAL-580", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("FREG-770", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-220", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-250", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SY", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260SZ", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-260", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200557, 99, 0));
        mHDRVividSupportVersionMap.put("DESC-270", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 10200547, 99, 0));
        mHDRVividSupportVersionMap.put("SOKR-790A", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mHDRVividSupportVersionMap.put("VOLT-350S", new TPCodecCapability.TPHdrSupportVersionRange(9999999, 0, 99, 0));
        mWideVineBlackListModel.add("RVL-AL09");
        mWideVineBlackListModel.add("CLT-L29");
        mWideVineBlackListModel.add("ASUS_Z00AD");
        mDrmL1BlackList.put(0, mWideVineBlackListModel);
        SparseArray<VideoSwCapabilityModel> sparseArray = mVideoCodecIdToSwCapabilityModel;
        VideoSwCapabilityModel.Builder builder = new VideoSwCapabilityModel.Builder();
        DefinitionName definitionName = DefinitionName.DEFINITION_720P;
        sparseArray.put(193, builder.addVideoDecCap(0, definitionName, VVC_SHD_QUALCOMMN_CPU_NAME).addVideoDecCap(1, definitionName, VVC_SHD_MTK_CPU_NAME).addVideoDecCap(2, definitionName, VVC_SHD_HISI_CPU_NAME).addVideoDecCap(3, definitionName, VVC_SHD_SAMSUNG_CPU_NAME).build());
        mDefinitionNameToDecodeLevelTable.put(definitionName, 21);
        mIsFFmpegCapGot = false;
        mAVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mHEVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP9SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAVS3WMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mAV1SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVP8SWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mVVCSWMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        mMaxVCodecHwCapabilityMap = new HashMap<>();
        mMaxVCodecSwCapabilityMap = new HashMap<>();
        mMaxACodecHwCapabilityMap = new HashMap<>();
        mMaxACodecSwCapabilityMap = new HashMap<>();
    }

    public static int convertDolbyVisionToOmxLevel(int i11) {
        int i12 = 1 << i11;
        if (i12 <= 0 || i12 > 256) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel Unsupported level".concat(String.valueOf(i11)));
            return i11;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxLevel dolbyVisionLevel:" + i11 + " omxLevel:" + i12);
        return i12;
    }

    public static int convertDolbyVisionToOmxProfile(int i11) {
        int i12 = 1 << i11;
        if (i11 <= 0 || i11 > 512) {
            TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile Unsupported profile".concat(String.valueOf(i11)));
            return i11;
        }
        TPNativeLog.printLog(2, TAG, "convertDolbyVisionToOmxProfile dolbyVisionProfile:" + i11 + " omxProfile:" + i12);
        return i12;
    }

    public static String getDisplayVersion() {
        return null;
    }

    private static int getSoftMaxSamples(int i11) {
        if (i11 == 1) {
            return 129600;
        }
        if (i11 == 6) {
            return 307200;
        }
        if (i11 == 11) {
            return 407040;
        }
        if (i11 == 16) {
            return 480000;
        }
        if (i11 == 21) {
            return 921600;
        }
        if (i11 == 26) {
            return 2073600;
        }
        if (i11 != 28) {
            return i11 != 33 ? 0 : 8847360;
        }
        return 8294400;
    }

    public static String getSystemPatchVersion() {
        return null;
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecSWMaxCapabilityMap() {
        if (mIsFFmpegCapGot) {
            return mMaxVCodecSwCapabilityMap;
        }
        try {
            int hevcSWDecodeLevel = getHevcSWDecodeLevel();
            int softMaxSamples = getSoftMaxSamples(hevcSWDecodeLevel);
            int avs3SWDecodeLevel = getAvs3SWDecodeLevel();
            int aV1SWDecodeLevel = getAV1SWDecodeLevel();
            int vvcSWDecodeLevel = getVvcSWDecodeLevel();
            int softMaxSamples2 = getSoftMaxSamples(avs3SWDecodeLevel);
            int softMaxSamples3 = getSoftMaxSamples(aV1SWDecodeLevel);
            int softMaxSamples4 = getSoftMaxSamples(vvcSWDecodeLevel);
            TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap, hevcDecodeLevel:" + hevcSWDecodeLevel + ", avs3DecodeLevel:" + avs3SWDecodeLevel + ", AV1DecodeLevel:" + aV1SWDecodeLevel + ", vvcDecodeLevel:" + vvcSWDecodeLevel);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = mAVCSWMaxCapability;
            tPCodecMaxCapability.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability.maxProfile = 64;
            tPCodecMaxCapability.maxLevel = 65536;
            mMaxVCodecSwCapabilityMap.put(26, mAVCSWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = mHEVCSWMaxCapability;
            tPCodecMaxCapability2.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability2.maxProfile = 2;
            tPCodecMaxCapability2.maxLevel = 33554432;
            mMaxVCodecSwCapabilityMap.put(172, mHEVCSWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = mVP9SWMaxCapability;
            tPCodecMaxCapability3.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability3.maxProfile = 8;
            tPCodecMaxCapability3.maxLevel = 8192;
            mMaxVCodecSwCapabilityMap.put(166, mVP9SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = mVP8SWMaxCapability;
            tPCodecMaxCapability4.maxLumaSamples = softMaxSamples;
            tPCodecMaxCapability4.maxProfile = 1;
            tPCodecMaxCapability4.maxLevel = 8;
            mMaxVCodecSwCapabilityMap.put(138, mVP8SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability5 = mAVS3WMaxCapability;
            tPCodecMaxCapability5.maxLumaSamples = softMaxSamples2;
            tPCodecMaxCapability5.maxProfile = 0;
            tPCodecMaxCapability5.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(192, mAVS3WMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability6 = mAV1SWMaxCapability;
            tPCodecMaxCapability6.maxLumaSamples = softMaxSamples3;
            tPCodecMaxCapability6.maxProfile = 0;
            tPCodecMaxCapability6.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(1029, mAV1SWMaxCapability);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability7 = mVVCSWMaxCapability;
            tPCodecMaxCapability7.maxLumaSamples = softMaxSamples4;
            tPCodecMaxCapability7.maxProfile = 0;
            tPCodecMaxCapability7.maxLevel = 0;
            mMaxVCodecSwCapabilityMap.put(193, mVVCSWMaxCapability);
            TPNativeLog.printLog(2, "getVCodecSWMaxCapabilityMap success, maxHevcLumaSamples:" + softMaxSamples + ", maxAvs3LumaSamples:" + softMaxSamples2 + ", maxAV1LumaSamples:" + softMaxSamples3 + ", maxVvcLumaSamples:" + softMaxSamples4);
            mIsFFmpegCapGot = true;
            return mMaxVCodecSwCapabilityMap;
        } catch (Exception unused) {
            TPNativeLog.printLog(4, TAG, "getVCodecSWMaxCapabilityMap exception");
            return null;
        }
    }

    public static boolean isHDRDecoderTypeSupport(int i11, int i12) {
        String strConcat;
        if (i12 == 102 || i12 == 101) {
            HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map = i12 == 102 ? mHDRTypeToHDRHardwareCodecWhiteListMap : mHDRTypeToHDRSoftwareCodecWhiteListMap;
            if (map.containsKey(Integer.valueOf(i11))) {
                return isInHDRVersionRangeWhiteList(map.get(Integer.valueOf(i11)));
            }
            strConcat = "isHDRDecodeTypeSupport, not config hdrType whiteList, hdrType = ".concat(String.valueOf(i11));
        } else {
            strConcat = "isHDRDecodeTypeSupport, not support decoderType, decoderType = ".concat(String.valueOf(i12));
        }
        TPNativeLog.printLog(3, TAG, strConcat);
        return false;
    }

    public static boolean isHDRsupport(int i11, int i12, int i13) {
        if (i11 == 2) {
            return isHDRDVSupport(i12, i13);
        }
        if (i11 == 0) {
            return isHDR10Support(4096);
        }
        if (i11 == 1) {
            return isHDR10Support(8192);
        }
        if (i11 != 4) {
            return false;
        }
        String displayVersion = getDisplayVersion();
        String systemPatchVersion = getSystemPatchVersion();
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):display version:".concat(String.valueOf(displayVersion)));
        TPNativeLog.printLog(2, TAG, "isHDRsupport(HDRVivid):patch version:".concat(String.valueOf(systemPatchVersion)));
        return checkHDRVividSupportByVersion(TPSystemInfo.getDeviceName(), displayVersion, systemPatchVersion);
    }

    private static boolean isInHDRVersionRangeWhiteList(ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList) {
        if (arrayList == null) {
            return false;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = arrayList.get(i11);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 <= tPHdrSupportVersionRange.upperboundAndroidAPILevel && i12 >= tPHdrSupportVersionRange.lowerboundAndroidAPILevel) {
                TPNativeLog.printLog(2, TAG, "inHDRVersionRangeWhiteList!");
                return true;
            }
        }
        return false;
    }

    private static boolean isLimitMaxWidthOrMaxHeight(int i11, int i12, int i13, int i14, int i15, int i16) {
        if ((i15 <= i16 || (i15 <= i11 && i16 <= i14)) && (i15 >= i16 || (i15 <= i13 && i16 <= i12))) {
            return false;
        }
        int i17 = i15 > i16 ? i14 * i11 : i13 * i12;
        if (i11 < i15 || i12 < i16 || i17 < i15 * i16) {
            TPNativeLog.printLog(4, TAG, "getSupportedFrameRatesFor width:" + i15 + " height:" + i16 + " do not support! maxWidth:" + i11 + " maxHeight:" + i12);
            return true;
        }
        TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor width:" + i15 + " height:" + i16 + " limit maxLumaWidth or maxLumaHeight, but not limit maxLumaSamples, do support! maxWidth:" + i11 + " maxHeight:" + i12 + " maxLumaSamples:" + i17);
        return false;
    }

    public static boolean addDRMLevel1Blacklist(int i11) {
        if (!mDrmL1BlackList.containsKey(Integer.valueOf(i11))) {
            return true;
        }
        ArrayList<String> arrayList = mDrmL1BlackList.get(Integer.valueOf(i11));
        if (!arrayList.contains(TPSystemInfo.getDeviceName())) {
            arrayList.add(TPSystemInfo.getDeviceName());
        }
        mDrmL1BlackList.remove(Integer.valueOf(i11));
        mDrmL1BlackList.put(Integer.valueOf(i11), arrayList);
        return true;
    }

    public static boolean addHDRBlackList(int i11, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map;
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrBlackMap.containsKey(Integer.valueOf(i11))) {
            map = mHdrBlackMap.get(Integer.valueOf(i11));
            mHdrBlackMap.remove(Integer.valueOf(i11));
            if (!map.containsKey(str)) {
                map.put(str, tPHdrSupportVersionRange);
            }
            map.remove(str);
        } else {
            map = new HashMap<>();
        }
        map.put(str, tPHdrSupportVersionRange);
        mHdrBlackMap.put(Integer.valueOf(i11), map);
        return true;
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i11, int i12, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map;
        if (i12 == 101) {
            map = mHDRTypeToHDRSoftwareCodecWhiteListMap;
        } else {
            if (i12 != 102) {
                TPNativeLog.printLog(3, TAG, "addHDRVideoDecoderTypeWhiteList, decoder not support.");
                return false;
            }
            map = mHDRTypeToHDRHardwareCodecWhiteListMap;
        }
        addHDRVersionRangeToWhiteList(i11, tPHdrSupportVersionRange, map);
        return true;
    }

    public static boolean addHDRWhiteList(int i11, String str, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map;
        if (tPHdrSupportVersionRange == null) {
            return false;
        }
        if (mHdrWhiteMap.containsKey(Integer.valueOf(i11))) {
            map = mHdrWhiteMap.get(Integer.valueOf(i11));
            mHdrWhiteMap.remove(Integer.valueOf(i11));
            if (!map.containsKey(str)) {
                map.put(str, tPHdrSupportVersionRange);
            }
            map.remove(str);
        } else {
            map = new HashMap<>();
        }
        map.put(str, tPHdrSupportVersionRange);
        mHdrWhiteMap.put(Integer.valueOf(i11), map);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[EDGE_INSN: B:54:0x00b9->B:55:0x00ba BREAK  A[LOOP:0: B:17:0x0040->B:23:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00f9  */
    public static boolean checkHDRVividSupportByVersion(String str, String str2, String str3) {
        int i11;
        int valueFromSubstring;
        String str4;
        int valueFromSubstring2;
        int valueFromSubstring3;
        int valueFromSubstring4;
        int valueFromSubstring5;
        String str5;
        String str6;
        int[] iArr = {2, 1, 1, 3};
        if (!TextUtils.isEmpty(str2)) {
            String[] strArrSplit = str2.split("\\.");
            if (strArrSplit.length != 4) {
                i11 = 0;
                break;
            }
            String[] strArrSplit2 = strArrSplit[0].split(C33627eb.f69716f);
            if (strArrSplit2.length == 2 && (str6 = strArrSplit2[1]) != null) {
                strArrSplit[0] = str6;
            }
            String[] strArrSplit3 = strArrSplit[3].split("\\(");
            if (strArrSplit3.length == 2 && (str5 = strArrSplit3[0]) != null) {
                strArrSplit[3] = str5;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    try {
                        int iIndexOf = str2.indexOf(C33978va.f72339h);
                        valueFromSubstring3 = iIndexOf == -1 ? 0 : getValueFromSubstring(str2, iIndexOf - 2, iIndexOf);
                        try {
                            int iIndexOf2 = str2.indexOf(C33978va.f72339h, iIndexOf + 1);
                            valueFromSubstring4 = iIndexOf2 == -1 ? 0 : getValueFromSubstring(str2, iIndexOf2 - 1, iIndexOf2);
                            try {
                                int iIndexOf3 = str2.indexOf(C33978va.f72339h, iIndexOf2 + 1);
                                valueFromSubstring2 = iIndexOf3 == -1 ? 0 : getValueFromSubstring(str2, iIndexOf3 - 1, iIndexOf3);
                                if (iIndexOf3 == -1) {
                                    valueFromSubstring5 = 0;
                                } else {
                                    try {
                                        valueFromSubstring5 = getValueFromSubstring(str2, iIndexOf3 + 1, iIndexOf3 + 4);
                                    } catch (NumberFormatException e11) {
                                        e = e11;
                                        TPNativeLog.printLog(4, TAG, "checkHDRVividSupportByVersion failed(versionValue):" + e.getMessage());
                                        valueFromSubstring5 = 0;
                                    }
                                }
                            } catch (NumberFormatException e12) {
                                e = e12;
                                valueFromSubstring2 = 0;
                            }
                        } catch (NumberFormatException e13) {
                            e = e13;
                            valueFromSubstring2 = 0;
                            valueFromSubstring4 = 0;
                        }
                    } catch (NumberFormatException e14) {
                        e = e14;
                        valueFromSubstring2 = 0;
                        valueFromSubstring3 = 0;
                        valueFromSubstring4 = 0;
                    }
                    i11 = (valueFromSubstring3 * 100000) + (valueFromSubstring4 * 10000) + (valueFromSubstring2 * 1000) + valueFromSubstring5;
                    break;
                }
                String str7 = strArrSplit[i12];
                if (str7 == null || str7.length() != iArr[i12]) {
                    i11 = 0;
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
            break;
        }
        if (TextUtils.isEmpty(str3)) {
            valueFromSubstring = 0;
        } else {
            String[] strArrSplit4 = str3.split("patch");
            if (strArrSplit4.length == 2 && (str4 = strArrSplit4[1]) != null && str4.length() == 3) {
                try {
                    int iIndexOf4 = str3.indexOf("patch");
                    if (iIndexOf4 == -1) {
                        valueFromSubstring = 0;
                    } else {
                        valueFromSubstring = getValueFromSubstring(str3, iIndexOf4 + 5, iIndexOf4 + 7);
                    }
                } catch (NumberFormatException e15) {
                    TPNativeLog.printLog(4, TAG, "checkHDRVividSupportByVersion failed(patchValue):" + e15.getMessage());
                }
            } else {
                valueFromSubstring = 0;
            }
        }
        if (isInHDRVividWhiteList(str, i11, valueFromSubstring)) {
            TPNativeLog.printLog(2, TAG, "checkHDRVividSupportByVersion in HDRVivid whitelist, model:" + str + " version:" + i11 + " patch:" + str3);
            return true;
        }
        if (isInHDRVividBlackList(str, i11, valueFromSubstring)) {
            TPNativeLog.printLog(2, TAG, "checkHDRVividSupportByVersion in HDRVivid blacklist, model:" + str + " version:" + i11 + " patch:" + str3);
            return false;
        }
        if (mHDRVividSupportVersionMap.containsKey(str)) {
            TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = mHDRVividSupportVersionMap.get(str);
            if (i11 <= tPHdrSupportVersionRange.upperboundSystemVersion) {
                int i13 = tPHdrSupportVersionRange.lowerboundSystemVersion;
                if (i11 > i13) {
                    return true;
                }
                if (i11 == i13 && valueFromSubstring <= tPHdrSupportVersionRange.upperboundPatchVersion && valueFromSubstring >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int convertDefinitionNameToDecodeLevel(DefinitionName definitionName) {
        Integer num = mDefinitionNameToDecodeLevelTable.get(definitionName);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getACodecSWMaxCapabilityMap() {
        if (!mMaxACodecSwCapabilityMap.isEmpty()) {
            return mMaxACodecSwCapabilityMap;
        }
        try {
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(0, 0, mAACMaxSupportedSamplerate, mAACMaxSupportedBitrate, mAACMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mFLACMaxSupportedSamplerate, mFLACMaxSupportedBitrate, mFLACMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
            TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability4 = new TPCodecCapability.TPCodecMaxCapability(0, 0, mDDPMaxSupportedSamplerate, mDDPMaxSupportedBitrate, mDDPMaxSupportedChannels);
            mMaxACodecSwCapabilityMap.put(5002, tPCodecMaxCapability);
            mMaxACodecSwCapabilityMap.put(5012, tPCodecMaxCapability2);
            mMaxACodecSwCapabilityMap.put(5003, tPCodecMaxCapability3);
            mMaxACodecSwCapabilityMap.put(5040, tPCodecMaxCapability4);
            return mMaxACodecSwCapabilityMap;
        } catch (Exception unused) {
            TPNativeLog.printLog(4, TAG, "getACodecSWMaxCapabilityMap exception");
            return null;
        }
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getAMediaCodecMaxCapabilityMap() {
        try {
            if (!mMaxACodecHwCapabilityMap.isEmpty()) {
                return mMaxACodecHwCapabilityMap;
            }
            try {
                for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                    String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                    if (tPMediaDecoderInfo.isAudio() && isSupportedMediaCodec(decoderMimeType) && !isInMediaCodecBlackList(decoderMimeType) && !isAMediaCodecBlackListInstance(tPMediaDecoderInfo.getDecoderName())) {
                        TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getMaxAudioSampleRate(), tPMediaDecoderInfo.getMaxAudioBitRate(), tPMediaDecoderInfo.getMaxAudioChannels());
                        if (!mMaxACodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType)))) {
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                            mAMediaCodecCapList.add(decoderMimeType);
                        } else if (tPMediaDecoderInfo.getMaxAudioSampleRate() > mMaxACodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxSampleRate || TextUtils.equals(decoderMimeType, MimeTypes.AUDIO_E_AC3_JOC)) {
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxACodecHwCapabilityMap);
                            replace(decoderMimeType, tPMediaDecoderInfo.getDecoderName(), mAudioMaxCapCodecInstance);
                        }
                    }
                }
            } catch (Exception e11) {
                TPNativeLog.printLog(4, TAG, "getAMediaCodecMaxCapabilityMap failed:" + e11.getMessage());
            }
            return mMaxACodecHwCapabilityMap;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean getAudioMediaCodecPassThroughCap(int i11, int i12, int i13) {
        int i14;
        if (i11 != 5004) {
            return false;
        }
        if (i12 == 20) {
            i14 = 7;
        } else {
            i14 = (i12 == 50 || i12 == 60) ? 8 : 1;
        }
        return TPAudioPassThroughPluginDetector.isAudioPassThroughSupport(i14, i13);
    }

    public static synchronized void getDecoderMaxCapabilityMapAsync() {
        if (mIsInitDone) {
            return;
        }
        Thread thread = new Thread(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.common.TPCodecUtils.1
            @Override // java.lang.Runnable
            public final void run() {
                TPCodecUtils.getVMediaCodecMaxCapabilityMap();
                TPCodecUtils.getAMediaCodecMaxCapabilityMap();
                TPCodecUtils.getVCodecSWMaxCapabilityMap();
                TPCodecUtils.getACodecSWMaxCapabilityMap();
                boolean unused = TPCodecUtils.mIsInitDone = true;
            }
        });
        thread.setName("TP_codec_init_thread");
        thread.start();
    }

    public static String getDecoderName(String str, boolean z11) {
        if (str.contains("audio")) {
            if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3) && mAudioMaxCapCodecInstance.containsKey(MimeTypes.AUDIO_E_AC3_JOC)) {
                return mAudioMaxCapCodecInstance.get(MimeTypes.AUDIO_E_AC3_JOC);
            }
            if (mAudioMaxCapCodecInstance.containsKey(str)) {
                return mAudioMaxCapCodecInstance.get(str);
            }
            return null;
        }
        ArrayList<TPMediaDecoderInfo> arrayList = new ArrayList();
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            if (TextUtils.equals(str, tPMediaDecoderInfo.getDecoderMimeType()) && tPMediaDecoderInfo.isSecureDecoder() == z11) {
                arrayList.add(tPMediaDecoderInfo);
            }
        }
        for (TPMediaDecoderInfo tPMediaDecoderInfo2 : arrayList) {
            if ((tPMediaDecoderInfo2.isVideo() && tPMediaDecoderInfo2.isVideoSofwareDecoder() == mPreferredSoftwareComponent) || (tPMediaDecoderInfo2.isAudio() && tPMediaDecoderInfo2.isAudioSofwareDecoder() == mPreferredSoftwareComponent)) {
                return tPMediaDecoderInfo2.getDecoderName();
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((TPMediaDecoderInfo) arrayList.get(0)).getDecoderName();
    }

    public static String getDolbyVisionDecoderName(String str, int i11, int i12, boolean z11) {
        if (!TextUtils.equals("video/dolby-vision", str)) {
            return null;
        }
        int iConvertDolbyVisionToOmxProfile = convertDolbyVisionToOmxProfile(i11);
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            TPMediaDecoderInfo.DecoderProfileLevel[] profileLevels = tPMediaDecoderInfo.getProfileLevels();
            if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), str)) {
                for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : profileLevels) {
                    if (decoderProfileLevel.profile == iConvertDolbyVisionToOmxProfile) {
                        TPNativeLog.printLog(1, TAG, "getDolbyVisionDecoderName  profile:" + decoderProfileLevel.profile + " dvProfile:" + i11 + " bSecure:" + z11 + " name:" + tPMediaDecoderInfo.getDecoderName());
                        if (tPMediaDecoderInfo.isSecureDecoder() == z11) {
                            return tPMediaDecoderInfo.getDecoderName();
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getMaxLumaSample(String str, int i11) {
        if (TextUtils.equals(str, "video/avc")) {
            return TPMediaCodecProfileLevel.getAVCMaxLumaSample(i11);
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return TPMediaCodecProfileLevel.getHEVCMaxLumaSample(i11);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return TPMediaCodecProfileLevel.getVP8MaxLumaSample(i11);
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return TPMediaCodecProfileLevel.getVP9MaxLumaSample(i11);
        }
        if (TextUtils.equals(str, "video/av01")) {
            return TPMediaCodecProfileLevel.getAV1MaxLumaSample(i11);
        }
        return 0;
    }

    public static synchronized int getMaxSupportedFrameRatesFor(int i11, int i12, int i13, int i14) {
        if (i11 == 101 || i11 == -1) {
            return 30;
        }
        String supportedHWMimeType = getSupportedHWMimeType(i12);
        if (supportedHWMimeType.isEmpty()) {
            return 30;
        }
        Integer numValueOf = 30;
        try {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (supportedHWMimeType.equals(tPMediaDecoderInfo.getDecoderMimeType())) {
                    int decoderMaxWidth = tPMediaDecoderInfo.getDecoderMaxWidth();
                    int decoderMaxHeight = tPMediaDecoderInfo.getDecoderMaxHeight();
                    int decoderLumaWidth = tPMediaDecoderInfo.getDecoderLumaWidth();
                    int decoderLumaHeight = tPMediaDecoderInfo.getDecoderLumaHeight();
                    int decoderMaxFrameRateForMaxLuma = tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma();
                    int decoderMaxFrameRate = tPMediaDecoderInfo.getDecoderMaxFrameRate();
                    if (!isLimitMaxWidthOrMaxHeight(decoderMaxWidth, decoderMaxHeight, decoderLumaWidth, decoderLumaHeight, i13, i14)) {
                        numValueOf = Integer.valueOf(Math.min(decoderMaxFrameRate, Math.max(1, ((int) (((long) (decoderMaxWidth * decoderLumaHeight)) / Math.max(i13 * i14, 1L))) * decoderMaxFrameRateForMaxLuma)));
                        TPNativeLog.printLog(2, TAG, "getSupportedFrameRatesFor max width:" + decoderMaxWidth + " max height:" + decoderLumaHeight + " max framerate for max resolution:" + decoderMaxFrameRateForMaxLuma + " current width:" + i13 + " height:" + i14 + " max support framerate:" + numValueOf);
                        break;
                    }
                    return 0;
                }
            }
        } catch (Exception e11) {
            TPNativeLog.printLog(4, TAG, "getMaxSupportedFrameRatesFor failed:" + e11.getMessage());
        }
        return numValueOf.intValue();
    }

    private static int getSupportedCodecId(String str) {
        if (TextUtils.equals(str, "video/avc")) {
            return 26;
        }
        if (TextUtils.equals(str, "video/hevc")) {
            return 172;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
            return 138;
        }
        if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
            return 166;
        }
        if (TextUtils.equals(str, "video/av01")) {
            return 1029;
        }
        if (TextUtils.equals(str, "audio/mp4a-latm")) {
            return 5002;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_AC3)) {
            return 5003;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3) || TextUtils.equals(str, MimeTypes.AUDIO_E_AC3_JOC)) {
            return 5040;
        }
        if (TextUtils.equals(str, MimeTypes.AUDIO_FLAC)) {
            return 5012;
        }
        return TextUtils.equals(str, MimeTypes.AUDIO_DTS) ? 5004 : -1;
    }

    private static String getSupportedHWMimeType(int i11) {
        if (i11 == 26) {
            return "video/avc";
        }
        if (i11 == 138) {
            return "video/x-vnd.on2.vp8";
        }
        if (i11 == 166) {
            return "video/x-vnd.on2.vp9";
        }
        if (i11 != 172) {
            return i11 != 1029 ? "" : "video/av01";
        }
        return "video/hevc";
    }

    public static synchronized HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVMediaCodecMaxCapabilityMap() {
        if (!mMaxVCodecHwCapabilityMap.isEmpty()) {
            TPNativeLog.printLog(2, TAG, "return memory stored video max cap map");
            return mMaxVCodecHwCapabilityMap;
        }
        try {
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                String decoderMimeType = tPMediaDecoderInfo.getDecoderMimeType();
                if (tPMediaDecoderInfo.isVideo()) {
                    mVMediaCodecCapList.add(decoderMimeType);
                    if (isSupportedMediaCodec(decoderMimeType) && !tPMediaDecoderInfo.isSecureDecoder()) {
                        TPMediaDecoderInfo.DecoderProfileLevel maxProfileLevel = tPMediaDecoderInfo.getMaxProfileLevel();
                        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability = new TPCodecCapability.TPCodecMaxCapability(getMaxLumaSample(decoderMimeType, maxProfileLevel.level), maxProfileLevel.profile, maxProfileLevel.level, tPMediaDecoderInfo.getDecoderMaxFrameRateForMaxLuma());
                        if (!mMaxVCodecHwCapabilityMap.containsKey(Integer.valueOf(getSupportedCodecId(decoderMimeType))) || maxProfileLevel.level > mMaxVCodecHwCapabilityMap.get(Integer.valueOf(getSupportedCodecId(decoderMimeType))).maxLevel) {
                            replace(Integer.valueOf(getSupportedCodecId(decoderMimeType)), tPCodecMaxCapability, mMaxVCodecHwCapabilityMap);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            TPNativeLog.printLog(4, TAG, "getVMediaCodecMaxCapabilityMap failed:" + Log.getStackTraceString(e11));
        }
        return mMaxVCodecHwCapabilityMap;
    }

    private static int getValueFromSubstring(String str, int i11, int i12) {
        if (i11 < 0) {
            i11 = 0;
        }
        if (i12 >= str.length()) {
            i12 = str.length() - 1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        return Integer.parseInt(str.substring(i11, i12));
    }

    private static int getVvcSWDecodeLevel() {
        String str;
        String strValueOf;
        int i11 = mVvcDeviceLevel;
        if (i11 != -1) {
            return i11;
        }
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getVvcSWDecodeLevel], mCpuHWProducer = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx = " + cpuHWProductIndex + ", hardware = " + cpuHarewareName);
        if (cpuHWProducter == -1) {
            str = "current cpu manufacturer is not listed in the performance list, cpuHwProducer:";
            strValueOf = String.valueOf(cpuHWProducter);
        } else {
            if (cpuHWProductIndex != -1) {
                int iSelectBestDecodeLevelFromCapabilityTable = selectBestDecodeLevelFromCapabilityTable(193, cpuHWProducter, cpuHWProductIndex);
                int i12 = iSelectBestDecodeLevelFromCapabilityTable != -1 ? iSelectBestDecodeLevelFromCapabilityTable : 0;
                mVvcDeviceLevel = i12;
                return i12;
            }
            str = "current cpu model is not listed in the performance list, cpuHwProductIdx:";
            strValueOf = String.valueOf(cpuHWProductIndex);
        }
        TPNativeLog.printLog(3, TAG, str.concat(strValueOf));
        mVvcDeviceLevel = 0;
        return 0;
    }

    public static synchronized void init(Context context, boolean z11) {
        try {
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (z11) {
                mLocalCache = LocalCache.get(applicationContext);
            }
            getDecoderMaxCapabilityMapAsync();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean isAMediaCodecBlackListInstance(String str) {
        return mAMediaCodecBlackListInstance.contains(str);
    }

    public static boolean isAMediaCodecBlackListModel() {
        return mAMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    public static boolean isBlackListType(String str) {
        return Arrays.asList("PRO 7 Plus", "PRO 7-H", "PRO+7+Plus").contains(TPSystemInfo.getDeviceName()) && TextUtils.equals(str, "video/hevc");
    }

    private static synchronized boolean isHDR10Support(int i11) {
        for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
            if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/hevc")) {
                for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                    if (decoderProfileLevel.profile == i11) {
                        TPNativeLog.printLog(2, TAG, "support hdr10 ".concat(String.valueOf(i11)));
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static synchronized boolean isHDRDVSupport(int i11, int i12) {
        try {
            if (i11 == 0 && i12 == 0) {
                return mVMediaCodecCapList.contains("video/dolby-vision");
            }
            for (TPMediaDecoderInfo tPMediaDecoderInfo : TPMediaDecoderList.getTPMediaDecoderInfos(mLocalCache)) {
                if (TextUtils.equals(tPMediaDecoderInfo.getDecoderMimeType(), "video/dolby-vision")) {
                    for (TPMediaDecoderInfo.DecoderProfileLevel decoderProfileLevel : tPMediaDecoderInfo.getProfileLevels()) {
                        if (decoderProfileLevel.profile == i11 && decoderProfileLevel.level == i12) {
                            TPNativeLog.printLog(2, TAG, "support dolbyvision");
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean isInDRMLevel1Blacklist(int i11) {
        if (mDrmL1BlackList.containsKey(Integer.valueOf(i11))) {
            return mDrmL1BlackList.get(Integer.valueOf(i11)).contains(TPSystemInfo.getDeviceName());
        }
        return false;
    }

    public static boolean isInHDRVividBlackList(String str, int i11, int i12) {
        if (mHdrBlackMap.containsKey(4)) {
            HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map = mHdrBlackMap.get(4);
            if (map.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = map.get(str);
                if (i11 <= tPHdrSupportVersionRange.upperboundSystemVersion && i11 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i12 <= tPHdrSupportVersionRange.upperboundPatchVersion && i12 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInHDRVividWhiteList(String str, int i11, int i12) {
        if (mHdrWhiteMap.containsKey(4)) {
            HashMap<String, TPCodecCapability.TPHdrSupportVersionRange> map = mHdrWhiteMap.get(4);
            if (map.containsKey(str)) {
                TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange = map.get(str);
                if (i11 <= tPHdrSupportVersionRange.upperboundSystemVersion && i11 >= tPHdrSupportVersionRange.lowerboundSystemVersion && i12 <= tPHdrSupportVersionRange.upperboundPatchVersion && i12 >= tPHdrSupportVersionRange.lowerboundPatchVersion) {
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized boolean isMediaCodecDDPlusSupported() {
        if (isAMediaCodecBlackListModel()) {
            return false;
        }
        return mAMediaCodecCapList.contains(MimeTypes.AUDIO_E_AC3) || mAMediaCodecCapList.contains(MimeTypes.AUDIO_E_AC3_JOC);
    }

    public static synchronized boolean isMediaCodecDolbyDSSupported() {
        if (isAMediaCodecBlackListModel()) {
            return false;
        }
        return mAMediaCodecCapList.contains(MimeTypes.AUDIO_AC3);
    }

    private static boolean isSupportedMediaCodec(String str) {
        return mSupportedMediaCodec.contains(str);
    }

    private static boolean isTheSameVersionRange(TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange2) {
        return tPHdrSupportVersionRange.lowerboundPatchVersion == tPHdrSupportVersionRange2.lowerboundPatchVersion && tPHdrSupportVersionRange.lowerboundSystemVersion == tPHdrSupportVersionRange2.lowerboundSystemVersion && tPHdrSupportVersionRange.upperboundPatchVersion == tPHdrSupportVersionRange2.upperboundPatchVersion && tPHdrSupportVersionRange.upperboundSystemVersion == tPHdrSupportVersionRange2.upperboundSystemVersion;
    }

    public static boolean isVMediaCodecBlackListModel() {
        return mVMediaCodecBlackListModel.contains(TPSystemInfo.getDeviceName());
    }

    private static int selectBestDecodeLevelFromCapabilityTable(int i11, int i12, int i13) {
        String strConcat;
        VideoSwCapabilityModel videoSwCapabilityModel = mVideoCodecIdToSwCapabilityModel.get(i11);
        if (videoSwCapabilityModel == null) {
            strConcat = "No corresponding codec id found, codecId:".concat(String.valueOf(i11));
        } else {
            HashMap<DefinitionName, String> map = videoSwCapabilityModel.mCpuProducerToAllDefinitionDecTable.get(i12);
            if (map != null && !map.isEmpty()) {
                for (DefinitionName definitionName : DefinitionName.values()) {
                    String str = map.get(definitionName);
                    if (!TextUtils.isEmpty(str) && i13 >= TPSystemInfo.getCpuHWProductIndex(i12, str)) {
                        return convertDefinitionNameToDecodeLevel(definitionName);
                    }
                }
                return -1;
            }
            strConcat = "No corresponding cpu producer found, cpuHwProducer:".concat(String.valueOf(i12));
        }
        TPNativeLog.printLog(3, TAG, strConcat);
        return -1;
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z11) {
        mPreferredSoftwareComponent = z11;
    }

    private static void addHDRVersionRangeToWhiteList(int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange, HashMap<Integer, ArrayList<TPCodecCapability.TPHdrSupportVersionRange>> map) {
        ArrayList<TPCodecCapability.TPHdrSupportVersionRange> arrayList;
        if (map.containsKey(Integer.valueOf(i11))) {
            arrayList = map.get(Integer.valueOf(i11));
        } else {
            arrayList = new ArrayList<>();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (isTheSameVersionRange(tPHdrSupportVersionRange, arrayList.get(i12))) {
                return;
            }
        }
        arrayList.add(tPHdrSupportVersionRange);
        map.put(Integer.valueOf(i11), arrayList);
    }

    public static void enableDrmL3(boolean z11) {
        String deviceName = TPSystemInfo.getDeviceName();
        if (z11) {
            if (!mWideVineBlackListModel.contains(deviceName)) {
                mWideVineBlackListModel.add(TPSystemInfo.getDeviceName());
            } else {
                return;
            }
        } else if (mWideVineBlackListModel.contains(deviceName)) {
            mWideVineBlackListModel.remove(TPSystemInfo.getDeviceName());
        } else {
            return;
        }
        mDrmL1BlackList.remove(0);
        mDrmL1BlackList.put(0, mWideVineBlackListModel);
    }

    public static int getAV1SWDecodeLevel() {
        return getDecodeLevelByCoresAndFreq();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005d, code lost:
    
        if (r1 != 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getAvs3SWDecodeLevel() {
        int decodeLevelByCoresAndFreq;
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getAvs3SWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i11 = mAvs3DeviceLevel;
        if (-1 != i11) {
            return i11;
        }
        mAvs3DeviceLevel = 0;
        if (-1 != cpuHWProducter) {
            decodeLevelByCoresAndFreq = 26;
            if (cpuHWProducter != 0) {
                if (cpuHWProducter != 1) {
                    if (cpuHWProducter == 2) {
                        if (cpuHWProductIndex < mFhdAvs3HisiIndex) {
                        }
                        mAvs3DeviceLevel = decodeLevelByCoresAndFreq;
                    }
                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                    mAvs3DeviceLevel = decodeLevelByCoresAndFreq;
                } else {
                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                    mAvs3DeviceLevel = decodeLevelByCoresAndFreq;
                }
            } else {
                if (cpuHWProductIndex < mFhdAvs3QualcommIndex) {
                    if (cpuHWProductIndex < mShdAvs3QualcommIndex) {
                        decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                    } else {
                        decodeLevelByCoresAndFreq = 21;
                    }
                }
                mAvs3DeviceLevel = decodeLevelByCoresAndFreq;
            }
        } else {
            decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
            mAvs3DeviceLevel = decodeLevelByCoresAndFreq;
        }
        return mAvs3DeviceLevel;
    }

    private static int getDecodeLevelByCoresAndFreq() {
        if (TPSystemInfo.getNumCores() >= 8) {
            if (TPSystemInfo.getMaxCpuFreq() / 1000 < 1200) {
                return 16;
            }
            return 21;
        }
        if (TPSystemInfo.getNumCores() >= 6) {
            if (TPSystemInfo.getMaxCpuFreq() / 1000 < 1400) {
                return 16;
            }
            return 21;
        }
        if (TPSystemInfo.getNumCores() < 4) {
            return 6;
        }
        if (TPSystemInfo.getMaxCpuFreq() / 1000 < 1600) {
            return 16;
        }
        return 21;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    public static int getHevcSWDecodeLevel() {
        int decodeLevelByCoresAndFreq;
        String cpuHarewareName = TPSystemInfo.getCpuHarewareName();
        int cpuHWProducter = TPSystemInfo.getCpuHWProducter(cpuHarewareName);
        int cpuHWProductIndex = TPSystemInfo.getCpuHWProductIndex(cpuHarewareName);
        TPNativeLog.printLog(2, TAG, "[getHevcSWDecodeLevel], mCpuHWProducter = " + cpuHWProducter + ", getMaxCpuFreq() = " + TPSystemInfo.getMaxCpuFreq() + ", numCores = " + TPSystemInfo.getNumCores() + ", mCpuHWProductIdx=" + cpuHWProductIndex + ", hardware=" + cpuHarewareName);
        int i11 = mHevcDeviceLevel;
        if (-1 != i11) {
            return i11;
        }
        mHevcDeviceLevel = 0;
        if (-1 != cpuHWProducter) {
            decodeLevelByCoresAndFreq = 16;
            if (cpuHWProducter != 0) {
                if (cpuHWProducter != 1) {
                    if (cpuHWProducter != 2) {
                        if (cpuHWProducter == 3) {
                            if (cpuHWProductIndex >= mShdHevcSamsungIndex) {
                                mHevcDeviceLevel = 21;
                            } else {
                                if (cpuHWProductIndex < mHdHevcSamsungIndex) {
                                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                                }
                                mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                            }
                        }
                    } else if (cpuHWProductIndex >= mShdHevcHisiIndex) {
                        mHevcDeviceLevel = 21;
                    } else {
                        if (cpuHWProductIndex < mHdHevcHisiIndex) {
                            decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                        }
                        mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                    }
                } else if (cpuHWProductIndex >= mShdHevcMtkIndex) {
                    mHevcDeviceLevel = 21;
                } else {
                    if (cpuHWProductIndex < mHdHevcMtkIndex) {
                        decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                    }
                    mHevcDeviceLevel = decodeLevelByCoresAndFreq;
                }
            } else if (cpuHWProductIndex >= mShdHevcQualcommIndex) {
                mHevcDeviceLevel = 21;
            } else {
                if (cpuHWProductIndex < mHdHevcQualcommIndex) {
                    decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
                }
                mHevcDeviceLevel = decodeLevelByCoresAndFreq;
            }
        } else {
            decodeLevelByCoresAndFreq = getDecodeLevelByCoresAndFreq();
            mHevcDeviceLevel = decodeLevelByCoresAndFreq;
        }
        return mHevcDeviceLevel;
    }

    public static boolean isInMediaCodecBlackList(String str) {
        HashMap<String, Integer> map;
        String deviceName = TPSystemInfo.getDeviceName();
        if (!TextUtils.isEmpty(deviceName) && (map = mCodecCapBlackList) != null && map.containsKey(deviceName)) {
            Integer num = mCodecCapBlackList.get(deviceName);
            if (TextUtils.equals(str, "video/avc")) {
                if ((num.intValue() & 1) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/hevc")) {
                if ((num.intValue() & 2) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
                if ((num.intValue() & 256) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
                if ((num.intValue() & 4) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "audio/mp4a-latm")) {
                if ((num.intValue() & 8) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_AC3)) {
                if ((num.intValue() & 16) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3)) {
                if ((num.intValue() & 32) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_FLAC)) {
                if ((num.intValue() & 64) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_DTS)) {
                if ((num.intValue() & 128) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3_JOC) && (num.intValue() & 32) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInMediaCodecWhiteList(String str) {
        HashMap<String, Integer> map;
        String deviceName = TPSystemInfo.getDeviceName();
        if (!TextUtils.isEmpty(deviceName) && (map = mCodecCapWhiteList) != null && map.containsKey(deviceName)) {
            Integer num = mCodecCapWhiteList.get(deviceName);
            if (TextUtils.equals(str, "video/avc")) {
                if ((num.intValue() & 1) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/hevc")) {
                if ((num.intValue() & 2) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/x-vnd.on2.vp8")) {
                if ((num.intValue() & 256) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "video/x-vnd.on2.vp9")) {
                if ((num.intValue() & 4) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, "audio/mp4a-latm")) {
                if ((num.intValue() & 8) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_AC3)) {
                if ((num.intValue() & 16) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_E_AC3)) {
                if ((num.intValue() & 32) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_FLAC)) {
                if ((num.intValue() & 64) == 0) {
                    return false;
                }
                return true;
            }
            if (TextUtils.equals(str, MimeTypes.AUDIO_DTS) && (num.intValue() & 128) != 0) {
                return true;
            }
        }
        return false;
    }

    private static <K, T> void replace(K k11, T t11, HashMap<K, T> map) {
        if (map.containsKey(k11)) {
            map.remove(k11);
            map.put(k11, t11);
        } else {
            map.put(k11, t11);
        }
    }
}
