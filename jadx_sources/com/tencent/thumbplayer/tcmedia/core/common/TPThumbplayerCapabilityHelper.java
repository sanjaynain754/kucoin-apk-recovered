package com.tencent.thumbplayer.tcmedia.core.common;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes63.dex */
public class TPThumbplayerCapabilityHelper {
    public static boolean isACodecCapabilityCanSupport(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (isACodecCapabilitySupport(1, i11, i12, i13, i14, i15, i16)) {
            return true;
        }
        return isACodecCapabilitySupport(102, i11, i12, i13, i14, i15, i16);
    }

    public static boolean isSupportMediaCodecRotateInternal() {
        return true;
    }

    public static boolean isSupportNativeMediaCodec() {
        return true;
    }

    public static boolean isSupportSetOutputSurfaceApi() {
        return true;
    }

    @Deprecated
    public static boolean isVCodecCapabilityCanSupport(int i11, int i12, int i13, int i14, int i15) {
        return isVCodecCapabilityCanSupport(i11, i12, i13, i14, i15, 30);
    }

    @Deprecated
    public static boolean isVCodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16) {
        return isVCodecCapabilitySupport(i11, i12, i13, i14, i15, i16, 30);
    }

    public static TPCodecCapability.TPCodecMaxCapability getVCodecMaxCapability(int i11) throws TPNativeLibraryException {
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability;
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability2;
        TPCodecCapability.TPCodecMaxCapability tPCodecMaxCapability3 = new TPCodecCapability.TPCodecMaxCapability(0, 0, 0, 30);
        HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap = TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(102);
        HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> vCodecDecoderMaxCapabilityMap2 = TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(101);
        if (vCodecDecoderMaxCapabilityMap != null && (tPCodecMaxCapability2 = vCodecDecoderMaxCapabilityMap.get(Integer.valueOf(i11))) != null) {
            tPCodecMaxCapability3 = tPCodecMaxCapability2;
        }
        return (vCodecDecoderMaxCapabilityMap2 == null || (tPCodecMaxCapability = vCodecDecoderMaxCapabilityMap2.get(Integer.valueOf(i11))) == null || tPCodecMaxCapability.maxLumaSamples <= tPCodecMaxCapability3.maxLumaSamples) ? tPCodecMaxCapability3 : tPCodecMaxCapability;
    }

    public static synchronized void init(Context context, boolean z11) {
        TPPlayerDecoderCapability.init(context, z11);
    }

    public static boolean isVCodecCapabilityCanSupport(int i11, int i12, int i13, int i14, int i15, int i16) {
        if (isVCodecCapabilitySupport(101, i11, i12, i13, i14, i15, i16)) {
            return true;
        }
        return isVCodecCapabilitySupport(102, i11, i12, i13, i14, i15, i16);
    }

    public static boolean isVCodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return TPPlayerDecoderCapability.isVCodecCapabilitySupport(i11, i12, i13, i14, i15, i16, i17);
    }

    public static boolean addACodecBlacklist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecBlacklist(i11, i12, tPACodecPropertyRange);
    }

    public static boolean addACodecWhitelist(int i11, int i12, TPCodecCapability.TPACodecPropertyRange tPACodecPropertyRange) {
        return TPPlayerDecoderCapability.addACodecWhitelist(i11, i12, tPACodecPropertyRange);
    }

    public static boolean addDRMLevel1Blacklist(int i11) {
        return TPPlayerDecoderCapability.addDRMLevel1Blacklist(i11);
    }

    public static boolean addHDRBlackList(int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRBlackList(i11, tPHdrSupportVersionRange);
    }

    public static boolean addHDRVideoDecoderTypeWhiteList(int i11, int i12, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRVideoDecoderTypeWhiteList(i11, i12, tPHdrSupportVersionRange);
    }

    public static boolean addHDRWhiteList(int i11, TPCodecCapability.TPHdrSupportVersionRange tPHdrSupportVersionRange) {
        return TPPlayerDecoderCapability.addHDRWhiteList(i11, tPHdrSupportVersionRange);
    }

    public static boolean addVCodecBlacklist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecBlacklist(i11, i12, tPVCodecPropertyRange);
    }

    public static boolean addVCodecWhitelist(int i11, int i12, TPCodecCapability.TPVCodecPropertyRange tPVCodecPropertyRange) {
        return TPPlayerDecoderCapability.addVCodecWhitelist(i11, i12, tPVCodecPropertyRange);
    }

    public static int[] getDRMCapabilities() {
        return TPDrm.getDRMCapabilities();
    }

    public static HashMap<Integer, TPCodecCapability.TPCodecMaxCapability> getVCodecDecoderMaxCapabilityMap(int i11) {
        return TPPlayerDecoderCapability.getVCodecDecoderMaxCapabilityMap(i11);
    }

    public static boolean isACodecCapabilitySupport(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return TPPlayerDecoderCapability.isACodecCapabilitySupport(i11, i12, i13, i14, i15, i16, i17);
    }

    public static boolean isDDPlusSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDDSupported() {
        return TPPlayerDecoderCapability.isDDPlusSupported();
    }

    public static boolean isDRMsupport(int i11) {
        int[] dRMCapabilities = getDRMCapabilities();
        if (dRMCapabilities.length == 0) {
            return false;
        }
        for (int i12 : dRMCapabilities) {
            if (i11 == i12) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDolbyDSSupported() {
        return TPPlayerDecoderCapability.isDolbyDSSupported();
    }

    public static boolean isFeatureSupport(int i11) {
        return TPFeatureCapability.isFeatureSupport(i11);
    }

    public static boolean isHDRsupport(int i11, int i12, int i13) {
        return TPPlayerDecoderCapability.isHDRsupport(i11, i12, i13);
    }

    public static void setMediaCodecPreferredSoftwareComponent(boolean z11) {
        TPPlayerDecoderCapability.setMediaCodecPreferredSoftwareComponent(z11);
    }
}
