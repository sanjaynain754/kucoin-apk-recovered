package com.tencent.liteav.videoproducer.encoder;

import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EncodedVideoFrame;
import com.tencent.liteav.videobase.videobase.C34908e;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public interface VideoEncoderDef {

    public enum BitrateMode {
        UNKNOWN(-1),
        CBR(0),
        VBR(1),
        CQ(2);


        /* JADX INFO: renamed from: e */
        private static final BitrateMode[] f74693e = values();
        public int mValue;

        /* JADX INFO: renamed from: a */
        public static BitrateMode m76740a(int i11) {
            for (BitrateMode bitrateMode : f74693e) {
                if (i11 == bitrateMode.mValue) {
                    return bitrateMode;
                }
            }
            return VBR;
        }

        BitrateMode(int i11) {
            this.mValue = i11;
        }
    }

    public static class EncodeAbility {

        /* JADX INFO: renamed from: a */
        public boolean f74695a;

        /* JADX INFO: renamed from: b */
        public boolean f74696b;

        /* JADX INFO: renamed from: c */
        public boolean f74697c;

        /* JADX INFO: renamed from: d */
        public boolean f74698d;

        public boolean isSupportHwHEVC() {
            return this.f74698d;
        }

        public boolean isSupportRPS() {
            return this.f74695a;
        }

        public boolean isSupportSVC() {
            return this.f74696b;
        }

        public boolean isSupportSwHEVC() {
            return this.f74697c;
        }
    }

    public enum EncoderProfile {
        PROFILE_BASELINE(1),
        PROFILE_MAIN(2),
        PROFILE_HIGH(3),
        PROFILE_BASELINERPS(11),
        PROFILE_MAINRPS(12),
        PROFILE_HIGHRPS(13);


        /* JADX INFO: renamed from: g */
        private static final EncoderProfile[] f74715g = values();
        int mValue;

        /* JADX INFO: renamed from: a */
        public static EncoderProfile m76743a(int i11) {
            for (EncoderProfile encoderProfile : f74715g) {
                if (i11 == encoderProfile.mValue) {
                    return encoderProfile;
                }
            }
            return PROFILE_BASELINE;
        }

        EncoderProfile(int i11) {
            this.mValue = i11;
        }
    }

    public static class EncoderProperty {

        /* JADX INFO: renamed from: a */
        public EnumC34962a f74717a;

        /* JADX INFO: renamed from: b */
        public ReferenceStrategy f74718b;

        /* JADX INFO: renamed from: c */
        public CodecType f74719c;

        public int getCodecType() {
            return this.f74719c.mValue;
        }

        public int getEncoderType() {
            return this.f74717a.value;
        }

        public int getReferenceStrategy() {
            return this.f74718b.mValue;
        }
    }

    public enum ReferenceStrategy {
        FIX_GOP(0),
        RPS(1),
        SVC(2),
        UNLIMITED_GOP(3);


        /* JADX INFO: renamed from: e */
        private static final ReferenceStrategy[] f74724e = values();
        int mValue;

        /* JADX INFO: renamed from: a */
        public static ReferenceStrategy m76744a(int i11) {
            for (ReferenceStrategy referenceStrategy : f74724e) {
                if (i11 == referenceStrategy.mValue) {
                    return referenceStrategy;
                }
            }
            return FIX_GOP;
        }

        ReferenceStrategy(int i11) {
            this.mValue = i11;
        }
    }

    public enum EncodeScene {
        kCameraRealTime(0),
        kScreenRealTime(1);

        int mValue;

        EncodeScene(int i11) {
            this.mValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static EncodeScene m76741a(int i11) {
            for (EncodeScene encodeScene : values()) {
                if (encodeScene.mValue == i11) {
                    return encodeScene;
                }
            }
            return kCameraRealTime;
        }
    }

    public enum EncoderComplexity {
        UNKNOWN(65535),
        HYPER_FAST(0),
        ULTRA_FAST(1),
        SUPER_FAST(2),
        VERY_FAST(3),
        FAST(4);

        final int mValue;

        EncoderComplexity(int i11) {
            this.mValue = i11;
        }

        /* JADX INFO: renamed from: a */
        public static EncoderComplexity m76742a(int i11) {
            for (EncoderComplexity encoderComplexity : values()) {
                if (encoderComplexity.mValue == i11) {
                    return encoderComplexity;
                }
            }
            return UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$a */
    public enum EnumC34962a {
        HARDWARE(1),
        SOFTWARE(2);

        int value;

        EnumC34962a(int i11) {
            this.value = i11;
        }
    }

    /* JADX INFO: renamed from: com.tencent.liteav.videoproducer.encoder.VideoEncoderDef$b */
    public static abstract class AbstractC34963b {
        public void onBitrateModeUpdated(BitrateMode bitrateMode) {
        }

        public void onEncodedFail(C34908e.a aVar) {
        }

        public void onOutputFormatChanged(MediaFormat mediaFormat) {
        }

        public void onEncodedNAL(EncodedVideoFrame encodedVideoFrame, boolean z11) {
        }
    }
}
