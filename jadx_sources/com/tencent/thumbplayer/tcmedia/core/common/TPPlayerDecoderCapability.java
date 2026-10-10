package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import androidx.media3.common.MimeTypes;
import java.util.HashMap;

/* JADX INFO: loaded from: classes63.dex */
public class TPPlayerDecoderCapability {
    private static String TAG = "TPPlayerDecoderCapability";
    private static boolean mIsLibLoaded;
    private long mNativeContext = 0;

    static {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded(null);
            mIsLibLoaded = true;
        } catch (UnsupportedOperationException e11) {
            TPNativeLog.printLog(4, e11.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _addACodecBlacklist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addACodecWhitelist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange);

    private static native boolean _addVCodecBlacklist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native boolean _addVCodecWhitelist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange);

    private static native HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> _getDecoderMaxCapabilityMap(int i11);

    private static native boolean _isACodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private static native boolean _isVCodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    public static boolean isACodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws TPNativeLibraryException {
        String str;
        if (2 == i11) {
            if (i12 == 5012) {
                str = MimeTypes.AUDIO_FLAC;
            } else if (i12 != 5040) {
                switch (i12) {
                    case 5002:
                        str = "audio/aac";
                        break;
                    case 5003:
                        str = MimeTypes.AUDIO_AC3;
                        break;
                    case 5004:
                        str = "audio/dts";
                        break;
                    default:
                        str = "";
                        break;
                }
            } else {
                str = MimeTypes.AUDIO_E_AC3;
            }
            if (TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (TPCodecUtils.isAMediaCodecBlackListModel() || TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isACodecCapabilitySupport(i11, i12, i13, i14, i15, i16, i17);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _isACodecCapabilitySupport.");
        }
    }

    public static synchronized void init(Context context, boolean z11) {
        TPCodecUtils.init(context, z11);
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }

    public static boolean isVCodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17) throws TPNativeLibraryException {
        String str;
        if (102 == i11) {
            if (i12 == 26) {
                str = "video/avc";
            } else if (i12 == 138) {
                str = "video/x-vnd.on2.vp8";
            } else if (i12 == 166) {
                str = "video/x-vnd.on2.vp9";
            } else if (i12 != 172) {
                str = i12 != 1029 ? "" : "video/av01";
            } else {
                str = "video/hevc";
            }
            if (TPCodecUtils.isInMediaCodecWhiteList(str)) {
                return true;
            }
            if (TPCodecUtils.isVMediaCodecBlackListModel() || TPCodecUtils.isBlackListType(str)) {
                return false;
            }
        }
        if (!isLibLoaded()) {
            throw new TPNativeLibraryException("Failed to load native library.");
        }
        try {
            return _isVCodecCapabilitySupport(i11, i12, i13, i14, i15, i16, i17);
        } catch (Throwable th2) {
            TPNativeLog.printLog(4, th2.getMessage());
            throw new TPNativeLibraryException("Failed to call _isVCodecCapabilitySupport.");
        }
    }

    public static boolean addACodecBlacklist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _addACodecBlacklist(i11, i12, tPACodecPropertyRange);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _addACodecBlacklist.");
            }
        }
        throw new TPNativeLibraryException("addACodecBlacklist: Failed to load native library.");
    }

    public static boolean addACodecWhitelist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _addACodecWhitelist(i11, i12, tPACodecPropertyRange);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
            }
        }
        throw new TPNativeLibraryException("addACodecWhitelist: Failed to load native library.");
    }

    public static boolean addDRMLevel1Blacklist(int i11) {
        return TPCodecUtils.addDRMLevel1Blacklist(i11);
    }

    public static boolean addHDRBlackList(int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRBlackList(i11, TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i11, int i12, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRVideoDecoderTypeWhiteList(i11, i12, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPCodecUtils.addHDRWhiteList(i11, TPSystemInfo.getDeviceName(), tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _addVCodecBlacklist(i11, i12, tPVCodecPropertyRange);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _addVCodecBlacklist.");
            }
        }
        throw new TPNativeLibraryException("addVCodecBlacklist: Failed to load native library.");
    }

    public static boolean addVCodecWhitelist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _addVCodecWhitelist(i11, i12, tPVCodecPropertyRange);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _addVCodecWhitelist.");
            }
        }
        throw new TPNativeLibraryException("addVCodecWhitelist :Failed to load native library.");
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i11) throws TPNativeLibraryException {
        if (isLibLoaded()) {
            try {
                return _getDecoderMaxCapabilityMap(i11);
            } catch (Throwable th2) {
                TPNativeLog.printLog(4, th2.getMessage());
                throw new TPNativeLibraryException("Failed to call _getDecoderMaxCapabilityMap.");
            }
        }
        throw new TPNativeLibraryException("Failed to load native library.");
    }

    public static boolean isDDPlusSupported() {
        return TPCodecUtils.isMediaCodecDDPlusSupported();
    }

    public static boolean isDolbyDSSupported() {
        return TPCodecUtils.isMediaCodecDolbyDSSupported();
    }

    public static boolean isHDRsupport(int i11, int i12, int i13) {
        return TPCodecUtils.isHDRsupport(i11, i12, i13);
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z11) {
        TPCodecUtils.setMediaCodecPreferredSoftwareComponent(z11);
    }
}
