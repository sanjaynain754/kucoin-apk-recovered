package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.CodecType;
import com.tencent.liteav.videobase.common.EnumC34875c;
import com.tencent.liteav.videoproducer.encoder.C34964a;
import com.tencent.liteav.videoproducer.encoder.VideoEncodeParams;
import com.tencent.liteav.videoproducer.encoder.VideoEncoderDef;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class VideoMediaCodecJni {
    public static final int DRAIN_CODEC_CONFIG_ONLY = 2;
    public static final int DRAIN_ERROR = -1;
    public static final int DRAIN_KEY_FRAME_WITH_CODEC_CONFIG = 1;
    public static final int DRAIN_SUCCESS = 0;
    public static final int DRAIN_TRY_AGAIN_LATER = 4;
    public static final int DRAIN_TRY_AGAIN_ONCE = 3;
    public static final int FEED_ERROR = -1;
    public static final int FEED_SUCCESS = 0;
    public static final int FEED_TRY_AGAIN_LATER = 1;
    private static final String TAG = "VideoMediaCodecJni";

    public static void handleThrowable(MediaCodecExceptionJni mediaCodecExceptionJni, Throwable th2) {
        mediaCodecExceptionJni.hasException = true;
        mediaCodecExceptionJni.systemErrorCode = -2;
        mediaCodecExceptionJni.isErrorRecoverable = false;
    }

    public static boolean updateBitrate(MediaCodec mediaCodec, int i11) {
        if (mediaCodec != null && LiteavSystemInfo.getSystemOSVersionInt() >= 19) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i11);
                mediaCodec.setParameters(bundle);
                return true;
            } catch (Throwable th2) {
                LiteavLog.m76083e(TAG, "update bitrate to MediaCodec failed.".concat(String.valueOf(th2)));
            }
        }
        return false;
    }

    public static MediaFormat configureMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, VideoEncodeParams videoEncodeParams, boolean z11, int i11, boolean z12) {
        MediaFormat mediaFormatM76752a;
        C34964a c34964a = new C34964a(mediaCodec, videoEncodeParams.codecType == CodecType.H265 ? "video/hevc" : "video/avc", videoEncodeParams, null);
        c34964a.f74729a = videoEncodeParams.bitrateMode == VideoEncoderDef.BitrateMode.CBR;
        c34964a.f74730b = z11;
        if (z12) {
            mediaFormatM76752a = c34964a.m76754b();
            if (mediaFormatM76752a == null) {
                mediaFormatM76752a = null;
            } else {
                c34964a.m76753a(mediaFormatM76752a);
            }
        } else {
            mediaFormatM76752a = c34964a.m76752a();
        }
        if (mediaFormatM76752a == null) {
            return null;
        }
        try {
            setMaxBFramesToMediaFormat(mediaFormatM76752a, i11);
            mediaCodec.configure(mediaFormatM76752a, (Surface) null, (MediaCrypto) null, 1);
            LiteavLog.m76087i(TAG, "Configure MediaCodec success, MediaFormat: ".concat(String.valueOf(mediaFormatM76752a)));
            return mediaFormatM76752a;
        } catch (Exception e11) {
            handleException(mediaCodecExceptionJni, e11);
            LiteavLog.m76083e(TAG, "MediaCodec configure failed.".concat(String.valueOf(e11)));
            return null;
        } catch (Throwable th2) {
            handleThrowable(mediaCodecExceptionJni, th2);
            LiteavLog.m76083e(TAG, "MediaCodec configure failed.".concat(String.valueOf(th2)));
            return null;
        }
    }

    public static Surface createInputSurface(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            return mediaCodec.createInputSurface();
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "MediaCodec create input surface failed.".concat(String.valueOf(th2)));
            return null;
        }
    }

    public static MediaCodec createMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, String str) {
        MediaCodec mediaCodecCreateEncoderByType;
        try {
            mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            try {
                LiteavLog.m76088i(TAG, "Use mediacodec name:%s", mediaCodecCreateEncoderByType.getName());
                if (isSoftOnlyEncoder(mediaCodecCreateEncoderByType.getCodecInfo())) {
                    throw new Exception("Shouldn't use software encoder");
                }
                return mediaCodecCreateEncoderByType;
            } catch (Exception e11) {
                e = e11;
                handleException(mediaCodecExceptionJni, e);
                LiteavLog.m76083e(TAG, "create MediaCodec failed.".concat(String.valueOf(e)));
                destroyMediaCodec(mediaCodecCreateEncoderByType);
                return null;
            } catch (Throwable th2) {
                th = th2;
                handleThrowable(mediaCodecExceptionJni, th);
                LiteavLog.m76083e(TAG, "create MediaCodec failed.".concat(String.valueOf(th)));
                destroyMediaCodec(mediaCodecCreateEncoderByType);
                return null;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodecCreateEncoderByType = null;
        } catch (Throwable th3) {
            th = th3;
            mediaCodecCreateEncoderByType = null;
        }
    }

    public static void destroyMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return;
        }
        try {
            mediaCodec.stop();
        } catch (Throwable th2) {
            LiteavLog.m76083e(TAG, "Stop MediaCodec failed.".concat(String.valueOf(th2)));
        }
        try {
            mediaCodec.release();
        } catch (Throwable th3) {
            LiteavLog.m76083e(TAG, "Destroy MediaCodec failed.".concat(String.valueOf(th3)));
        }
        LiteavLog.m76087i(TAG, "Destroy MediaCodec success: ".concat(String.valueOf(mediaCodec)));
    }

    public static int drainOutputBuffer(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, MediaCodecFrameJni mediaCodecFrameJni, int i11) {
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros(i11));
            if (iDequeueOutputBuffer == -1) {
                return 4;
            }
            if (iDequeueOutputBuffer == -2) {
                try {
                    LiteavLog.m76088i(TAG, "encoder output buffers changed %s", mediaCodec.getOutputFormat());
                } catch (Throwable unused) {
                }
                return 3;
            }
            if (iDequeueOutputBuffer == -3) {
                return 3;
            }
            if (iDequeueOutputBuffer < 0) {
                return -1;
            }
            if (bufferInfo.size == 0 && (4 & bufferInfo.flags) == 0) {
                LiteavLog.m76083e(TAG, "size is zero, but it isn't end of stream");
                return -1;
            }
            ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? mediaCodec.getOutputBuffer(iDequeueOutputBuffer) : mediaCodec.getOutputBuffers()[iDequeueOutputBuffer];
            if (outputBuffer == null) {
                return -1;
            }
            outputBuffer.position(bufferInfo.offset);
            outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
            mediaCodecFrameJni.data = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(outputBuffer);
            int i12 = bufferInfo.flags;
            boolean z11 = (i12 & 1) > 0;
            boolean z12 = (i12 & 2) > 0;
            mediaCodecFrameJni.nalType = z11 ? EnumC34875c.IDR : EnumC34875c.P;
            mediaCodecFrameJni.pts = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            if (z12 && z11) {
                return 1;
            }
            return z12 ? 2 : 0;
        } catch (Exception e11) {
            handleException(mediaCodecExceptionJni, e11);
            LiteavLog.m76084e(TAG, "Drain output from MediaCodec failed.", e11);
            return -1;
        } catch (Throwable th2) {
            handleThrowable(mediaCodecExceptionJni, th2);
            LiteavLog.m76084e(TAG, "Drain output from MediaCodec failed.", th2);
            return -1;
        }
    }

    public static int feedYuvBufferToMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, ByteBuffer byteBuffer, long j11, int i11) {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(timeUnit.toMicros(i11));
            if (iDequeueInputBuffer < 0) {
                return 1;
            }
            ByteBuffer byteBuffer2 = mediaCodec.getInputBuffers()[iDequeueInputBuffer];
            byteBuffer2.clear();
            byteBuffer2.put(byteBuffer);
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, byteBuffer.capacity(), timeUnit.toMicros(j11), 0);
            return 0;
        } catch (Exception e11) {
            handleException(mediaCodecExceptionJni, e11);
            LiteavLog.m76083e(TAG, "Feed yuv buffer to MediaCodec failed.".concat(String.valueOf(e11)));
            return -1;
        } catch (Throwable th2) {
            handleThrowable(mediaCodecExceptionJni, th2);
            LiteavLog.m76083e(TAG, "Feed yuv buffer to MediaCodec failed.".concat(String.valueOf(th2)));
            return -1;
        }
    }

    public static int getIntFromMediaFormat(MediaFormat mediaFormat, String str, int i11) {
        if (mediaFormat != null) {
            try {
                return mediaFormat.getInteger(str);
            } catch (Throwable th2) {
                LiteavLog.m76083e(TAG, "Get %s from MediaFormat failed.".concat(String.valueOf(th2)));
            }
        }
        return i11;
    }

    public static void releaseSurface(Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (Throwable th2) {
                LiteavLog.m76083e(TAG, "Release surface failed.".concat(String.valueOf(th2)));
            }
        }
    }

    private static void setMaxBFramesToMediaFormat(MediaFormat mediaFormat, int i11) {
        if (i11 <= 0 || LiteavSystemInfo.getSystemOSVersionInt() < 29) {
            return;
        }
        mediaFormat.setInteger("max-bframes", i11);
    }

    public static boolean startMediaCodec(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return false;
        }
        try {
            mediaCodec.start();
            return true;
        } catch (Exception e11) {
            handleException(mediaCodecExceptionJni, e11);
            LiteavLog.m76083e(TAG, "MediaCodec start failed.".concat(String.valueOf(e11)));
            return false;
        } catch (Throwable th2) {
            handleThrowable(mediaCodecExceptionJni, th2);
            LiteavLog.m76083e(TAG, "MediaCodec start failed.".concat(String.valueOf(th2)));
            return false;
        }
    }

    public static void stopMediaCodec(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Throwable th2) {
                LiteavLog.m76083e(TAG, "Stop MediaCodec failed.".concat(String.valueOf(th2)));
            }
        }
    }

    private static void handleException(MediaCodecExceptionJni mediaCodecExceptionJni, Exception exc) {
        boolean z11 = false;
        if (LiteavSystemInfo.getSystemOSVersionInt() < 21) {
            mediaCodecExceptionJni.hasException = true;
            mediaCodecExceptionJni.systemErrorCode = -1;
            mediaCodecExceptionJni.isErrorRecoverable = false;
        } else {
            if (exc instanceof MediaCodec.CodecException) {
                mediaCodecExceptionJni.hasException = true;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc;
                mediaCodecExceptionJni.systemErrorCode = codecException.getErrorCode();
                if (codecException.isRecoverable() || codecException.isTransient()) {
                    z11 = true;
                }
                mediaCodecExceptionJni.isErrorRecoverable = z11;
                return;
            }
            mediaCodecExceptionJni.hasException = true;
            mediaCodecExceptionJni.systemErrorCode = -1;
            mediaCodecExceptionJni.isErrorRecoverable = false;
        }
    }

    private static boolean isSoftOnlyEncoder(MediaCodecInfo mediaCodecInfo) {
        if (LiteavSystemInfo.getSystemOSVersionInt() > 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (!mediaCodecInfo.getName().contains("android") && !mediaCodecInfo.getName().contains("google")) {
            return false;
        }
        return true;
    }

    public static void requestKeyFrame(MediaCodec mediaCodec) {
        if (LiteavSystemInfo.getSystemOSVersionInt() > 19 && mediaCodec != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putInt("request-sync", 0);
                mediaCodec.setParameters(bundle);
            } catch (Throwable th2) {
                LiteavLog.m76084e(TAG, "requestSyncFrame failed.", th2);
            }
        }
    }

    public static void setCallBack(MediaCodecExceptionJni mediaCodecExceptionJni, MediaCodec mediaCodec, MediaCodec.Callback callback) {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21 && mediaCodec != null && callback != null) {
            try {
                mediaCodec.setCallback(callback);
            } catch (Throwable th2) {
                handleThrowable(mediaCodecExceptionJni, th2);
                LiteavLog.m76083e(TAG, "MediaCodec set callback failed.".concat(String.valueOf(th2)));
            }
        }
    }
}
