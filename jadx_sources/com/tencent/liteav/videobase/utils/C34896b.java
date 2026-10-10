package com.tencent.liteav.videobase.utils;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34896b {

    /* JADX INFO: renamed from: a */
    public int f74290a;

    /* JADX INFO: renamed from: b */
    public int f74291b;

    /* JADX INFO: renamed from: c */
    public String f74292c;

    /* JADX INFO: renamed from: d */
    public boolean f74293d;

    /* JADX INFO: renamed from: e */
    public MediaCodecInfo.CodecCapabilities f74294e;

    /* JADX INFO: renamed from: f */
    private a f74295f;

    /* JADX INFO: renamed from: g */
    private MediaFormat f74296g;

    /* JADX INFO: renamed from: h */
    private JSONArray f74297h;

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.b$a */
    public enum a {
        kUnKnown,
        kQcom,
        kHisi,
        kExynos,
        kAmlogic
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74298a;

        static {
            int[] iArr = new int[a.values().length];
            f74298a = iArr;
            try {
                iArr[a.kQcom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74298a[a.kHisi.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74298a[a.kExynos.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f74298a[a.kAmlogic.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final MediaFormat m76556a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaFormat mediaFormatCreateVideoFormat = this.f74296g;
        if (mediaFormatCreateVideoFormat == null) {
            mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f74292c, this.f74290a, this.f74291b);
        }
        if (this.f74293d) {
            int systemOSVersionInt = LiteavSystemInfo.getSystemOSVersionInt();
            if (systemOSVersionInt >= 30 && this.f74295f != a.kHisi && (codecCapabilities = this.f74294e) != null && codecCapabilities.isFeatureSupported("low-latency")) {
                mediaFormatCreateVideoFormat.setInteger("low-latency", 1);
            }
            if (systemOSVersionInt > 23 || !LiteavSystemInfo.getManufacturer().toLowerCase().contains(JPushConstants.Manufacturer.XIAOMI)) {
                mediaFormatCreateVideoFormat.setInteger("vdec-lowlatency", 1);
            }
            if (systemOSVersionInt >= 26) {
                int i11 = AnonymousClass1.f74298a[this.f74295f.ordinal()];
                if (i11 == 1) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-dec-low-latency.enable", 1);
                    mediaFormatCreateVideoFormat.setInteger("vendor.qti-ext-dec-picture-order.enable", 1);
                } else if (i11 == 2) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-req", 1);
                    mediaFormatCreateVideoFormat.setInteger("vendor.hisi-ext-low-latency-video-dec.video-scene-for-low-latency-rdy", -1);
                } else if (i11 == 3) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.rtc-ext-dec-low-latency.enable", 1);
                } else if (i11 == 4) {
                    mediaFormatCreateVideoFormat.setInteger("vendor.low-latency.enable", 1);
                }
            }
        }
        JSONArray jSONArray = this.f74297h;
        if (jSONArray != null) {
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    mediaFormatCreateVideoFormat.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                } catch (JSONException e11) {
                    LiteavLog.m76084e("HardwareDecoderMediaFormatBuilder", "set MediaCodec device related params failed.", e11);
                }
            }
        }
        return mediaFormatCreateVideoFormat;
    }

    public C34896b() {
        a aVar = a.kUnKnown;
        this.f74295f = aVar;
        a aVarM76555b = m76555b();
        if (aVarM76555b == aVar) {
            String lowerCase = LiteavSystemInfo.getHardware().toLowerCase();
            if (lowerCase.contains("qcom")) {
                aVar = a.kQcom;
            } else if (lowerCase.contains("kirin")) {
                aVar = a.kHisi;
            } else if (lowerCase.contains("exynos")) {
                aVar = a.kExynos;
            }
            aVarM76555b = aVar;
        }
        this.f74295f = aVarM76555b;
        LiteavLog.m76087i("HardwareDecoderMediaFormatBuilder", "hardware name:" + LiteavSystemInfo.getHardware().toLowerCase() + " chip brand:" + this.f74295f);
    }

    /* JADX INFO: renamed from: b */
    private static a m76555b() {
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            return a.kUnKnown;
        }
        try {
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                String lowerCase = mediaCodecInfo.getName().toLowerCase();
                if (lowerCase.contains("hisi")) {
                    return a.kHisi;
                }
                if (lowerCase.contains("amlogic")) {
                    return a.kAmlogic;
                }
                if (!lowerCase.contains("qcom") && !lowerCase.contains("qti")) {
                }
                return a.kQcom;
            }
        } catch (Throwable th2) {
            LiteavLog.m76083e("HardwareDecoderMediaFormatBuilder", "get mediacode info error:" + th2.getMessage());
        }
        return a.kUnKnown;
    }
}
