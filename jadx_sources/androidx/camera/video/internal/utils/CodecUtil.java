package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.annotation.GuardedBy;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* JADX INFO: loaded from: classes23.dex */
public final class CodecUtil {
    private static final int MAX_CODEC_INFO_CACHE_COUNT = 10;

    @GuardedBy("sCodecInfoCache")
    private static final LruCache<String, MediaCodecInfo> sCodecInfoCache = new LruCache<>(10);

    public static MediaCodec createCodec(EncoderConfig encoderConfig) throws InvalidConfigException {
        return createCodec(encoderConfig.getMimeType());
    }

    private static MediaCodec createCodec(String str) throws InvalidConfigException {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e11) {
            throw new InvalidConfigException(e11);
        }
    }

    public static MediaCodecInfo findCodecAndGetCodecInfo(String str) throws Throwable {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodecCreateCodec;
        LruCache<String, MediaCodecInfo> lruCache = sCodecInfoCache;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(str);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodecCreateCodec = createCodec(str);
            try {
                MediaCodecInfo codecInfo = mediaCodecCreateCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(str, codecInfo);
                }
                mediaCodecCreateCodec.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodecCreateCodec != null) {
                    mediaCodecCreateCodec.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodecCreateCodec = null;
        }
    }

    private CodecUtil() {
    }
}
