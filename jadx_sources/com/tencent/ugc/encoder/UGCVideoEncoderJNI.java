package com.tencent.ugc.encoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCVideoEncoderJNI {
    private UGCVideoEncoderListener mListener;
    private long mNativeHandle = 0;

    public enum EncoderType {
        HARDWARE,
        SOFTWARE
    }

    public interface UGCVideoEncoderListener {
        void onEncodedFail(VideoEncoderError videoEncoderError);

        void onEncodedNAL(EncodedVideoFrame encodedVideoFrame);
    }

    public enum VideoEncoderError {
        SUCCESS(0),
        NOT_IMPLEMENTED(-1),
        INPUT_PARAM_ILLEGAL(-2),
        INIT_FAILED(-3),
        ENCODE_FAILED(-4),
        ENCODE_FAILED_STATUS_ERROR(-5),
        ENCODE_FAILED_GET_ATTACHMENTS_ERROR(-6),
        INPUT_YUV_FORMAT_ERROR(-7),
        INVALID_SESSION(-8),
        INVALID_CALL(-9),
        OUT_OF_MEMORY(-10),
        LOW_PERFORMANCE(-11),
        BITRATE_OUT_OF_CONTROL(-12),
        ENCODER_THREAD_STUCK(-13),
        DRIVER_VERSION_TOO_LOW(-14),
        REQUEST_IDR_FAILED(-15),
        ENCODER_INPUT_FPS_TOO_HIGH_THAN_OUTPUT_FPS(-16),
        ENCODER_COMPLEXITY_DOWNGRADE(-17),
        ENCODER_RESOLUTION_DOWNGRADE(-18),
        ENCODE_BITSTREAM_ERROR(-19),
        UNEXPECTED_B_FRAME(-20);

        final int mValue;

        public static VideoEncoderError valueOf(int i11) {
            for (VideoEncoderError videoEncoderError : values()) {
                if (videoEncoderError.mValue == i11) {
                    return videoEncoderError;
                }
            }
            return SUCCESS;
        }

        public final int getValue() {
            return this.mValue;
        }

        VideoEncoderError(int i11) {
            this.mValue = i11;
        }
    }

    private static native long nativeCreate(UGCVideoEncoderJNI uGCVideoEncoderJNI);

    private static native void nativeDestroy(long j11);

    private static native void nativeEncodeFrame(long j11, int i11, Object obj, int i12, int i13, int i14, long j12);

    private static native boolean nativeIsInputQueueFull(long j11);

    private static native void nativeSignalEndOfStream(long j11);

    private static native void nativeStart(long j11, boolean z11, VideoEncodeParams videoEncodeParams);

    private static native void nativeStopSync(long j11, int i11);

    private void onEncodedFailFromNative(int i11) {
        UGCVideoEncoderListener uGCVideoEncoderListener = this.mListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedFail(VideoEncoderError.valueOf(i11));
        }
    }

    private void onEncodedNALFromNative(EncodedVideoFrame encodedVideoFrame) {
        UGCVideoEncoderListener uGCVideoEncoderListener = this.mListener;
        if (uGCVideoEncoderListener != null) {
            uGCVideoEncoderListener.onEncodedNAL(encodedVideoFrame);
        }
    }

    public void encodeFrame(PixelFrame pixelFrame) {
        if (this.mNativeHandle == 0) {
            return;
        }
        EnumC34747l encodeRotation = EnumC34747l.NORMAL;
        if (pixelFrame.getMetaData() != null) {
            encodeRotation = pixelFrame.getMetaData().getEncodeRotation();
        }
        nativeEncodeFrame(this.mNativeHandle, pixelFrame.getTextureId(), pixelFrame.getGLContext(), pixelFrame.getWidth(), pixelFrame.getHeight(), encodeRotation.mValue, pixelFrame.getTimestamp());
    }

    public boolean isInputQueueFull() {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            return nativeIsInputQueueFull(j11);
        }
        return false;
    }

    public void signalEndOfStream() {
        long j11 = this.mNativeHandle;
        if (j11 != 0) {
            nativeSignalEndOfStream(j11);
        }
    }

    public void start(EncoderType encoderType, VideoEncodeParams videoEncodeParams, UGCVideoEncoderListener uGCVideoEncoderListener) {
        this.mListener = uGCVideoEncoderListener;
        if (this.mNativeHandle != 0) {
            return;
        }
        long jNativeCreate = nativeCreate(this);
        this.mNativeHandle = jNativeCreate;
        nativeStart(jNativeCreate, encoderType == EncoderType.HARDWARE, videoEncodeParams);
    }

    public void stopSync(long j11) {
        long j12 = this.mNativeHandle;
        if (j12 != 0) {
            nativeStopSync(j12, (int) j11);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
    }
}
