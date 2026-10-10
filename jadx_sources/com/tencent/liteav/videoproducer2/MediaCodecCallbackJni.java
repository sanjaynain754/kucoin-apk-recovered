package com.tencent.liteav.videoproducer2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.common.EnumC34875c;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class MediaCodecCallbackJni extends MediaCodec.Callback {
    private static final String TAG = "MediaCodecCallbackJni";
    private MediaCodec mMediaCodec;
    private long mNativeHandler;

    private native void nativeOnError(long j11, MediaCodec mediaCodec, MediaCodecExceptionJni mediaCodecExceptionJni);

    private native void nativeOnOutputBufferAvailable(long j11, MediaCodec mediaCodec, MediaCodecFrameJni mediaCodecFrameJni, int i11);

    private native void nativeOnOutputFormatChanged(long j11, MediaCodec mediaCodec, MediaFormat mediaFormat);

    public void destroy() {
        LiteavLog.m76087i(TAG, "Destroy callback for:" + this.mMediaCodec);
        this.mMediaCodec = null;
        this.mNativeHandler = 0L;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        MediaCodecExceptionJni mediaCodecExceptionJniCreateException = MediaCodecExceptionJni.createException();
        boolean z11 = true;
        mediaCodecExceptionJniCreateException.hasException = true;
        mediaCodecExceptionJniCreateException.systemErrorCode = codecException.getErrorCode();
        if (!codecException.isRecoverable() && !codecException.isTransient()) {
            z11 = false;
        }
        mediaCodecExceptionJniCreateException.isErrorRecoverable = z11;
        nativeOnError(this.mNativeHandler, mediaCodec, mediaCodecExceptionJniCreateException);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        if (bufferInfo.size == 0 && (bufferInfo.flags & 4) == 0) {
            LiteavLog.m76083e(TAG, "size is zero, but it isn't end of stream");
            return;
        }
        ByteBuffer outputBuffer = LiteavSystemInfo.getSystemOSVersionInt() >= 21 ? mediaCodec.getOutputBuffer(i11) : mediaCodec.getOutputBuffers()[i11];
        if (outputBuffer == null) {
            return;
        }
        outputBuffer.position(bufferInfo.offset);
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        MediaCodecFrameJni mediaCodecFrameJni = new MediaCodecFrameJni();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
        mediaCodecFrameJni.data = byteBufferAllocateDirect;
        byteBufferAllocateDirect.put(outputBuffer);
        mediaCodecFrameJni.nalType = (bufferInfo.flags & 1) > 0 ? EnumC34875c.IDR : EnumC34875c.P;
        mediaCodecFrameJni.pts = TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs);
        mediaCodec.releaseOutputBuffer(i11, false);
        nativeOnOutputBufferAvailable(this.mNativeHandler, mediaCodec, mediaCodecFrameJni, bufferInfo.flags);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.mMediaCodec != mediaCodec || this.mNativeHandler == 0) {
            return;
        }
        LiteavLog.m76088i(TAG, "encoder output format changed %s", mediaFormat);
        nativeOnOutputFormatChanged(this.mNativeHandler, mediaCodec, mediaFormat);
    }

    public MediaCodecCallbackJni(MediaCodec mediaCodec, long j11) {
        this.mMediaCodec = mediaCodec;
        this.mNativeHandler = j11;
        LiteavLog.m76087i(TAG, "Create callback for:".concat(String.valueOf(mediaCodec)));
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
    }
}
