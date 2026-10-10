package com.tencent.ugc.videobase.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HardwareDecoderMediaFormatBuilder {
    private static final String TAG = "HardwareDecoderMediaFormatBuilder";
    private ChipBrand mChipBrand;
    private int mHeight;
    private boolean mIsLowLatencyDecodeEnabled;
    private JSONArray mMediaCodecDeviceRelatedParams;
    private MediaFormat mMediaFormat;
    private String mMimeType;
    private int mWidth;

    public enum ChipBrand {
        kUnKnown,
        kQcom,
        kHisi,
        kExynos,
        kAmlogic
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder$1 */
    public static /* synthetic */ class C358261 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77373a;

        static {
            int[] iArr = new int[ChipBrand.values().length];
            f77373a = iArr;
            try {
                iArr[ChipBrand.kQcom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77373a[ChipBrand.kHisi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77373a[ChipBrand.kExynos.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77373a[ChipBrand.kAmlogic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void configVendorLowLatencyAfterApi26(MediaFormat mediaFormat) {
        int i11 = C358261.f77373a[this.mChipBrand.ordinal()];
        if (i11 == 1) {
            mediaFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
            mediaFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
        } else if (i11 == 2) {
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
            mediaFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
        } else if (i11 == 3) {
            mediaFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
        } else {
            if (i11 != 4) {
                return;
            }
            mediaFormat.setInteger("vendor.low-latency.enable", 1);
        }
    }

    private static void fillDeviceRelatedDecodeParams(MediaFormat mediaFormat, JSONArray jSONArray) {
        if (jSONArray == null) {
            return;
        }
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                mediaFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
            } catch (JSONException e11) {
                LiteavLog.m76084e(TAG, "set MediaCodec device related params failed.", e11);
                return;
            }
        }
    }

    private MediaFormat getMediaFormatForConfigure() {
        MediaFormat mediaFormat = this.mMediaFormat;
        return mediaFormat == null ? MediaFormat.createVideoFormat(this.mMimeType, this.mWidth, this.mHeight) : mediaFormat;
    }

    public HardwareDecoderMediaFormatBuilder setHeight(int i11) {
        this.mHeight = i11;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setIsLowLatencyDecodeEnabled(boolean z11) {
        this.mIsLowLatencyDecodeEnabled = z11;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMediaCodecDeviceRelatedParams(JSONArray jSONArray) {
        this.mMediaCodecDeviceRelatedParams = jSONArray;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setMimeType(String str) {
        this.mMimeType = str;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder setWidth(int i11) {
        this.mWidth = i11;
        return this;
    }

    public HardwareDecoderMediaFormatBuilder() {
        ChipBrand chipBrand = ChipBrand.kUnKnown;
        this.mChipBrand = chipBrand;
        ChipBrand chipBrandBySupportedCodecs = getChipBrandBySupportedCodecs();
        this.mChipBrand = chipBrandBySupportedCodecs == chipBrand ? getChipBrandBySystemInfo() : chipBrandBySupportedCodecs;
        LiteavLog.m76087i(TAG, "hardware name:" + LiteavSystemInfo.getHardware().toLowerCase() + " chip brand:" + this.mChipBrand);
    }

    private void configLowLatency(MediaFormat mediaFormat) {
        int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
        if (systemOSVersionInt >= 30 && this.mChipBrand != ChipBrand.kHisi) {
            mediaFormat.setInteger("low-latency", 1);
        }
        if (systemOSVersionInt > 23 || !LiteavSystemInfo.getManufacturer().toLowerCase().contains(JPushConstants.Manufacturer.XIAOMI)) {
            mediaFormat.setInteger("vdec-lowlatency", 1);
        }
        if (systemOSVersionInt >= 26) {
            configVendorLowLatencyAfterApi26(mediaFormat);
        }
    }

    private ChipBrand getChipBrandBySupportedCodecs() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return ChipBrand.kUnKnown;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                String lowerCase = mediaCodecInfo.getName().toLowerCase();
                if (lowerCase.contains("hisi")) {
                    return ChipBrand.kHisi;
                }
                if (lowerCase.contains("amlogic")) {
                    return ChipBrand.kAmlogic;
                }
                if (!lowerCase.contains("qcom") && !lowerCase.contains("qti")) {
                }
                return ChipBrand.kQcom;
            }
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "get mediacode info error:" + th2.getMessage());
        }
        return ChipBrand.kUnKnown;
    }

    private ChipBrand getChipBrandBySystemInfo() {
        String lowerCase = LiteavSystemInfo.getHardware().toLowerCase();
        if (lowerCase.contains("qcom")) {
            return ChipBrand.kQcom;
        }
        if (lowerCase.contains("kirin")) {
            return ChipBrand.kHisi;
        }
        if (lowerCase.contains("exynos")) {
            return ChipBrand.kExynos;
        }
        return ChipBrand.kUnKnown;
    }

    public MediaFormat build() {
        MediaFormat mediaFormatForConfigure = getMediaFormatForConfigure();
        if (this.mIsLowLatencyDecodeEnabled) {
            configLowLatency(mediaFormatForConfigure);
        }
        fillDeviceRelatedDecodeParams(mediaFormatForConfigure, this.mMediaCodecDeviceRelatedParams);
        return mediaFormatForConfigure;
    }
}
