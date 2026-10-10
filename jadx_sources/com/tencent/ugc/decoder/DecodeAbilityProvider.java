package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.text.TextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.storage.PersistStorage;
import com.tencent.liteav.base.storage.PersistStorageMmkv;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.base.VideoPersistStorageKey;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class DecodeAbilityProvider {
    private static final String TAG = "DecodeAbilityProvider";
    private final C34748m mAsyncRunner;
    private boolean mEnableBT709Support;
    private boolean mEnableHDRSupport;

    /* JADX INFO: renamed from: com.tencent.ugc.decoder.DecodeAbilityProvider$a */
    public static class C35589a {

        /* JADX INFO: renamed from: a */
        private static final DecodeAbilityProvider f76939a = new DecodeAbilityProvider();
    }

    private DecodeAbilityProvider() {
        this.mEnableHDRSupport = true;
        this.mEnableBT709Support = true;
        C34748m c34748m = new C34748m();
        this.mAsyncRunner = c34748m;
        c34748m.mo76133a(RunnableC35592a.m79089a(this));
    }

    private int getMediaCodecSupportColorFormat(String str) {
        int i11 = 0;
        try {
            for (int i12 : MediaCodec.createDecoderByType(str).getCodecInfo().getCapabilitiesForType(str).colorFormats) {
                int i13 = 19;
                if (i12 != 19) {
                    i13 = 21;
                    if (i12 != 21) {
                    }
                }
                i11 = i13;
                break;
            }
            LiteavLog.m76088i(TAG, "decoder(%s) support color format %d ", str, Integer.valueOf(i11));
            return i11;
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "get support color format error ", th2);
            return i11;
        }
    }

    private void setEnableBT709Support(boolean z11) {
        LiteavLog.m76087i(TAG, "set enable BT709 support. enable: ".concat(String.valueOf(z11)));
        this.mEnableBT709Support = z11;
    }

    private void setEnableHDRSupport(boolean z11) {
        LiteavLog.m76087i(TAG, "set enable HDR support. enable: ".concat(String.valueOf(z11)));
        this.mEnableHDRSupport = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDecoderAbility() {
        PersistStorageMmkv persistStorageMmkv = new PersistStorageMmkv(PersistStorage.GLOBAL_DOMAIN);
        int mediaCodecSupportColorFormat = getMediaCodecSupportColorFormat("video/avc");
        if (mediaCodecSupportColorFormat > 0) {
            persistStorageMmkv.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_AVC_COLOR_FORMAT, mediaCodecSupportColorFormat);
        }
        int mediaCodecSupportColorFormat2 = getMediaCodecSupportColorFormat("video/hevc");
        if (mediaCodecSupportColorFormat2 > 0) {
            persistStorageMmkv.put(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_HEVC_COLOR_FORMAT, mediaCodecSupportColorFormat2);
        }
        persistStorageMmkv.commit();
    }

    public boolean getEnableBT709Support() {
        return this.mEnableBT709Support;
    }

    public boolean getEnableHDRSupport() {
        return this.mEnableHDRSupport;
    }

    public static DecodeAbilityProvider getInstance() {
        return C35589a.f76939a;
    }

    public int getSupportColorFormat(String str) {
        Integer num;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        PersistStorageMmkv persistStorageMmkv = new PersistStorageMmkv(PersistStorage.GLOBAL_DOMAIN);
        if (str.equals("video/avc")) {
            num = persistStorageMmkv.getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_AVC_COLOR_FORMAT);
        } else if (str.equals("video/hevc")) {
            num = persistStorageMmkv.getInt(VideoPersistStorageKey.CONFIG_KEY_LOCAL_DECODER_HEVC_COLOR_FORMAT);
        } else {
            num = null;
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
