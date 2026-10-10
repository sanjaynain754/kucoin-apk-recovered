package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.util.Pair;
import android.util.Range;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.common.CodecType;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34964a {

    /* JADX INFO: renamed from: a */
    public boolean f74729a = true;

    /* JADX INFO: renamed from: b */
    public boolean f74730b = true;

    /* JADX INFO: renamed from: c */
    private final MediaCodec f74731c;

    /* JADX INFO: renamed from: d */
    private final String f74732d;

    /* JADX INFO: renamed from: e */
    private final VideoEncodeParams f74733e;

    /* JADX INFO: renamed from: f */
    private Boolean f74734f;

    /* JADX INFO: renamed from: c */
    private void m76751c(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesM76745a;
        if (mediaFormat == null || (videoCapabilitiesM76745a = m76745a(i11, i12)) == null) {
            return;
        }
        int widthAlignment = videoCapabilitiesM76745a.getWidthAlignment();
        int heightAlignment = videoCapabilitiesM76745a.getHeightAlignment();
        LiteavLog.m76088i("MediaFormatBuilder", "widthAlignment=%d,heightAlignment=%d", Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
        if (widthAlignment < 2 || heightAlignment < 2 || widthAlignment % 2 != 0 || heightAlignment % 2 != 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        int i13 = (integer / widthAlignment) * widthAlignment;
        int i14 = (integer2 / heightAlignment) * heightAlignment;
        if (integer == i13 && integer2 == i14) {
            return;
        }
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        LiteavLog.m76088i("MediaFormatBuilder", "updateMediaFormatWithAlignment,srcSize=(%d x %d),fixSize=(%d x %d),widthAlignment=%d,heightAlignment=%d", Integer.valueOf(integer), Integer.valueOf(integer2), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(widthAlignment), Integer.valueOf(heightAlignment));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e6  */
    /* JADX INFO: renamed from: a */
    public final MediaFormat m76752a() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Range<Integer> complexityRange;
        MediaFormat mediaFormatM76754b = m76754b();
        if (mediaFormatM76754b == null) {
            return null;
        }
        int codecCount = MediaCodecList.getCodecCount();
        int i18 = 0;
        loop0: while (true) {
            if (i18 >= codecCount) {
                capabilitiesForType = null;
                break;
            }
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i18);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equalsIgnoreCase(this.f74732d)) {
                        capabilitiesForType = codecInfoAt.getCapabilitiesForType(this.f74732d);
                        break loop0;
                    }
                }
            }
            i18++;
        }
        if (capabilitiesForType != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
            if (encoderCapabilities != null && (complexityRange = encoderCapabilities.getComplexityRange()) != null) {
                mediaFormatM76754b.setInteger("complexity", ((Integer) complexityRange.getUpper()).intValue());
            }
            if (this.f74730b) {
                VideoEncodeParams videoEncodeParams = this.f74733e;
                VideoEncoderDef.EncoderProfile encoderProfile = videoEncodeParams.encoderProfile;
                if ((videoEncodeParams.codecType != CodecType.H265 || LiteavSystemInfo.getSystemOSVersionInt() < 21) && encoderProfile != null) {
                    int i19 = AnonymousClass1.f74736b[encoderProfile.ordinal()];
                    if (i19 == 1) {
                        i14 = 2;
                    } else if (i19 != 2) {
                        i14 = 1;
                    } else {
                        i14 = 8;
                    }
                } else {
                    i14 = 1;
                }
                if (this.f74732d.equals("video/avc")) {
                    i15 = 256;
                    i16 = 32768;
                } else {
                    i15 = Integer.MIN_VALUE;
                    i16 = Integer.MAX_VALUE;
                }
                int i21 = 0;
                int iMin = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                    int i22 = codecProfileLevel.level;
                    if (i22 >= i15 && (i17 = codecProfileLevel.profile) <= i14 && (i17 > i21 || (i17 == i21 && i22 > iMin))) {
                        iMin = Math.min(i22, i16);
                        i21 = i17;
                    }
                }
                mediaFormatM76754b.setInteger(Scopes.PROFILE, i21);
                if (LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
                    mediaFormatM76754b.setInteger(FirebaseAnalytics.Param.LEVEL, iMin);
                }
            }
            if (this.f74729a) {
                VideoEncoderDef.BitrateMode bitrateMode = this.f74733e.bitrateMode;
                if (bitrateMode == null || (i12 = AnonymousClass1.f74735a[bitrateMode.ordinal()]) == 1) {
                    i13 = 2;
                } else if (i12 == 2) {
                    i13 = 1;
                } else if (i12 != 3) {
                    i13 = 2;
                } else {
                    i13 = 0;
                }
                MediaCodecInfo.EncoderCapabilities encoderCapabilities2 = capabilitiesForType.getEncoderCapabilities();
                if (encoderCapabilities2 != null) {
                    if (m76747a(i13, encoderCapabilities2)) {
                        mediaFormatM76754b.setInteger("bitrate-mode", i13);
                    } else if (this.f74733e.fullIFrame) {
                        if (m76747a(1, encoderCapabilities2)) {
                            mediaFormatM76754b.setInteger("bitrate-mode", 1);
                        } else if (m76747a(2, encoderCapabilities2)) {
                            mediaFormatM76754b.setInteger("bitrate-mode", 2);
                        }
                    } else if (m76747a(2, encoderCapabilities2)) {
                        mediaFormatM76754b.setInteger("bitrate-mode", 2);
                    }
                }
            }
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() < 23) {
            codecCapabilitiesCreateFromProfileLevel = null;
        } else {
            Pair<Integer, Integer> pairM76748b = m76748b(mediaFormatM76754b);
            codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f74732d, ((Integer) pairM76748b.first).intValue(), ((Integer) pairM76748b.second).intValue());
        }
        if (codecCapabilitiesCreateFromProfileLevel != null) {
            capabilitiesForType = codecCapabilitiesCreateFromProfileLevel;
        }
        VideoEncodeParams videoEncodeParams2 = this.f74733e;
        GLConstants.ColorRange colorRange = videoEncodeParams2.colorRange;
        GLConstants.ColorSpace colorSpace = videoEncodeParams2.colorSpace;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 24) {
            if (colorRange == GLConstants.ColorRange.FULL_RANGE) {
                i11 = 1;
                mediaFormatM76754b.setInteger("color-range", 1);
            } else {
                i11 = 1;
                if (colorRange == GLConstants.ColorRange.VIDEO_RANGE) {
                    mediaFormatM76754b.setInteger("color-range", 2);
                }
            }
            if (colorSpace == GLConstants.ColorSpace.BT709) {
                mediaFormatM76754b.setInteger("color-standard", i11);
            } else if (colorSpace == GLConstants.ColorSpace.BT601) {
                mediaFormatM76754b.setInteger("color-standard", 4);
            }
        }
        if (capabilitiesForType != null && LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
            Range<Integer> bitrateRange = videoCapabilities.getBitrateRange();
            int integer = mediaFormatM76754b.getInteger("bitrate");
            Integer num = (Integer) bitrateRange.clamp(Integer.valueOf(integer));
            int iIntValue = num.intValue();
            LiteavLog.m76088i("MediaFormatBuilder", "bitrateRange=(%d, %d),bitrate=%d,clampBitrate=%d", bitrateRange.getLower(), bitrateRange.getUpper(), Integer.valueOf(integer), num);
            if (integer != iIntValue) {
                mediaFormatM76754b.setInteger("bitrate", iIntValue);
            }
        }
        m76753a(mediaFormatM76754b);
        if (this.f74733e.mediaCodecDeviceRelatedParams != null) {
            for (int i23 = 0; i23 < this.f74733e.mediaCodecDeviceRelatedParams.length(); i23++) {
                try {
                    JSONObject jSONObject = this.f74733e.mediaCodecDeviceRelatedParams.getJSONObject(i23);
                    LiteavLog.m76088i("MediaFormatBuilder", "setDeviceRelatedParams,index=%d,key=%s,value=%d", Integer.valueOf(i23), jSONObject.optString("key"), Integer.valueOf(jSONObject.optInt("value")));
                    mediaFormatM76754b.setInteger(jSONObject.optString("key"), jSONObject.optInt("value"));
                } catch (Throwable th2) {
                    LiteavLog.m76084e("MediaFormatBuilder", "set mediaCodec device related params failed,index=".concat(String.valueOf(i23)), th2);
                }
            }
        }
        return mediaFormatM76754b;
    }

    /* JADX INFO: renamed from: b */
    public final MediaFormat m76754b() {
        int i11;
        MediaFormat mediaFormatCreateVideoFormat;
        VideoEncodeParams videoEncodeParams = this.f74733e;
        int i12 = videoEncodeParams.width;
        if (i12 == 0 || (i11 = videoEncodeParams.height) == 0 || videoEncodeParams.bitrate == 0 || videoEncodeParams.fps == 0 || (mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.f74732d, i12, i11)) == null) {
            return null;
        }
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.f74733e.bitrate * 1024);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.f74733e.fps);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        VideoEncodeParams videoEncodeParams2 = this.f74733e;
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", videoEncodeParams2.fullIFrame ? 0 : videoEncodeParams2.gop);
        return mediaFormatCreateVideoFormat;
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.a$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f74735a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f74736b;

        static {
            int[] iArr = new int[VideoEncoderDef.EncoderProfile.values().length];
            f74736b = iArr;
            try {
                iArr[VideoEncoderDef.EncoderProfile.PROFILE_MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74736b[VideoEncoderDef.EncoderProfile.PROFILE_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74736b[VideoEncoderDef.EncoderProfile.PROFILE_BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[VideoEncoderDef.BitrateMode.values().length];
            f74735a = iArr2;
            try {
                iArr2[VideoEncoderDef.BitrateMode.CBR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f74735a[VideoEncoderDef.BitrateMode.VBR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f74735a[VideoEncoderDef.BitrateMode.CQ.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C34964a(MediaCodec mediaCodec, String str, VideoEncodeParams videoEncodeParams, Boolean bool) {
        this.f74731c = mediaCodec;
        this.f74732d = str;
        this.f74733e = videoEncodeParams;
        this.f74734f = bool;
    }

    /* JADX INFO: renamed from: b */
    private static Pair<Integer, Integer> m76748b(MediaFormat mediaFormat) {
        int integer;
        int integer2 = 0;
        try {
            integer = mediaFormat.getInteger(Scopes.PROFILE);
        } catch (Throwable th2) {
            LiteavLog.m76088i("MediaFormatBuilder", "get profile fail.", th2);
            integer = 0;
        }
        try {
            integer2 = mediaFormat.getInteger(FirebaseAnalytics.Param.LEVEL);
        } catch (Throwable th3) {
            LiteavLog.m76088i("MediaFormatBuilder", "get level fail.", th3);
        }
        return new Pair<>(Integer.valueOf(integer), Integer.valueOf(integer2));
    }

    /* JADX INFO: renamed from: b */
    private void m76749b(MediaFormat mediaFormat, int i11, int i12) {
        MediaCodecInfo.VideoCapabilities videoCapabilitiesM76745a;
        if (mediaFormat == null || (videoCapabilitiesM76745a = m76745a(i11, i12)) == null) {
            return;
        }
        Range<Integer> supportedWidths = videoCapabilitiesM76745a.getSupportedWidths();
        Range<Integer> supportedHeights = videoCapabilitiesM76745a.getSupportedHeights();
        if (supportedWidths == null || supportedHeights == null) {
            return;
        }
        Integer numValueOf = (Integer) supportedWidths.getLower();
        Integer numValueOf2 = (Integer) supportedHeights.getLower();
        MediaCodecInfo.VideoCapabilities videoCapabilitiesM76750c = m76750c();
        if (videoCapabilitiesM76750c != null) {
            Range<Integer> supportedWidths2 = videoCapabilitiesM76750c.getSupportedWidths();
            Range<Integer> supportedHeights2 = videoCapabilitiesM76750c.getSupportedHeights();
            if (supportedWidths2 != null && supportedHeights2 != null) {
                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((Integer) supportedWidths2.getLower()).intValue()));
                numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((Integer) supportedHeights2.getLower()).intValue()));
            }
        }
        if (numValueOf.intValue() < 0 || numValueOf2.intValue() < 0) {
            return;
        }
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        if (numValueOf.intValue() > integer || numValueOf2.intValue() > integer2) {
            float f11 = integer;
            float f12 = integer2;
            float fMax = Math.max(numValueOf.intValue() / (f11 * 1.0f), numValueOf2.intValue() / (1.0f * f12));
            mediaFormat.setInteger("width", (int) (f11 * fMax));
            mediaFormat.setInteger("height", (int) (fMax * f12));
            LiteavLog.m76088i("MediaFormatBuilder", "updateMediaFormatToLowerSize:lowerW=%d,lowerH=%d", numValueOf, numValueOf2);
        }
    }

    /* JADX INFO: renamed from: c */
    private MediaCodecInfo.VideoCapabilities m76750c() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        if (this.f74731c == null || LiteavSystemInfo.getSystemOSVersionInt() < 21 || (capabilitiesForType = this.f74731c.getCodecInfo().getCapabilitiesForType(this.f74732d)) == null) {
            return null;
        }
        return capabilitiesForType.getVideoCapabilities();
    }

    /* JADX INFO: renamed from: a */
    private boolean m76747a(int i11, MediaCodecInfo.EncoderCapabilities encoderCapabilities) {
        Boolean bool;
        if (i11 == 2 && (bool = this.f74734f) != null) {
            return bool.booleanValue();
        }
        return encoderCapabilities.isBitrateModeSupported(i11);
    }

    /* JADX INFO: renamed from: a */
    public final void m76753a(MediaFormat mediaFormat) {
        if (mediaFormat != null && LiteavSystemInfo.getSystemOSVersionInt() >= 23) {
            Pair<Integer, Integer> pairM76748b = m76748b(mediaFormat);
            int iIntValue = ((Integer) pairM76748b.first).intValue();
            int iIntValue2 = ((Integer) pairM76748b.second).intValue();
            m76746a(mediaFormat, iIntValue, iIntValue2);
            m76749b(mediaFormat, iIntValue, iIntValue2);
            m76751c(mediaFormat, iIntValue, iIntValue2);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m76746a(MediaFormat mediaFormat, int i11, int i12) {
        Range<Integer> supportedHeights;
        Range<Integer> supportedWidths;
        Range<Integer> supportedHeights2;
        if (mediaFormat == null) {
            return;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilitiesM76745a = m76745a(i11, i12);
        Range<Integer> supportedWidths2 = null;
        if (videoCapabilitiesM76745a != null) {
            supportedWidths = videoCapabilitiesM76745a.getSupportedWidths();
            supportedHeights = videoCapabilitiesM76745a.getSupportedHeights();
        } else {
            supportedHeights = null;
            supportedWidths = null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilitiesM76750c = m76750c();
        if (videoCapabilitiesM76750c != null) {
            supportedWidths2 = videoCapabilitiesM76750c.getSupportedWidths();
            supportedHeights2 = videoCapabilitiesM76750c.getSupportedHeights();
        } else {
            supportedHeights2 = null;
        }
        Integer numValueOf = Integer.MAX_VALUE;
        Integer numValueOf2 = Integer.MAX_VALUE;
        if (supportedWidths != null && supportedHeights != null) {
            numValueOf = (Integer) supportedWidths.getUpper();
            numValueOf2 = (Integer) supportedHeights.getUpper();
        }
        if (supportedWidths2 != null && supportedHeights2 != null) {
            numValueOf = Integer.valueOf(Math.min(numValueOf.intValue(), ((Integer) supportedWidths2.getUpper()).intValue()));
            numValueOf2 = Integer.valueOf(Math.min(numValueOf2.intValue(), ((Integer) supportedHeights2.getUpper()).intValue()));
        }
        if (numValueOf.intValue() != Integer.MAX_VALUE && numValueOf2.intValue() != Integer.MAX_VALUE) {
            int integer = mediaFormat.getInteger("width");
            int integer2 = mediaFormat.getInteger("height");
            if ((integer > integer2 && numValueOf.intValue() < numValueOf2.intValue()) || (integer < integer2 && numValueOf.intValue() > numValueOf2.intValue())) {
                Integer num = numValueOf2;
                numValueOf2 = numValueOf;
                numValueOf = num;
            }
            if (numValueOf.intValue() < integer || numValueOf2.intValue() < integer2) {
                float f11 = integer;
                float f12 = integer2;
                float fMin = Math.min(numValueOf.intValue() / (f11 * 1.0f), numValueOf2.intValue() / (1.0f * f12));
                mediaFormat.setInteger("width", (int) (f11 * fMin));
                mediaFormat.setInteger("height", (int) (f12 * fMin));
                LiteavLog.m76087i("MediaFormatBuilder", "updateMediaFormatToUpperSize:srcWidth=" + integer + ", srcHeight=" + integer2 + ", scale: " + fMin + ", supportedWidthsByProfile= " + supportedWidths + ", supportedHeightsByProfile=" + supportedHeights + ", supportedWidthsByType=" + supportedWidths2 + ", supportedHeightsByType=" + supportedHeights2);
                return;
            }
            return;
        }
        LiteavLog.m76093w("MediaFormatBuilder", "get supported size failed");
    }

    /* JADX INFO: renamed from: a */
    private MediaCodecInfo.VideoCapabilities m76745a(int i11, int i12) {
        MediaCodecInfo.CodecCapabilities codecCapabilitiesCreateFromProfileLevel;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && (codecCapabilitiesCreateFromProfileLevel = MediaCodecInfo.CodecCapabilities.createFromProfileLevel(this.f74732d, i11, i12)) != null) {
            return codecCapabilitiesCreateFromProfileLevel.getVideoCapabilities();
        }
        return null;
    }
}
