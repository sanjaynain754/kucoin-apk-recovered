package com.tencent.ugc.decoder;

import android.opengl.GLES20;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.GlobalContextManager;
import com.tencent.ugc.videobase.common.EncodedVideoFrame;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFramePool;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class SoftwareVideoDecoder implements VideoDecoderInterface {
    private static final String TAG = "SoftwareVideoDecoder";
    private final boolean mIsUseHevc;
    private VideoDecoderListener mListener;
    private PixelFramePool mPixelFramePool;
    private long mNativeVideoDecoderWrapper = 0;
    private EnumC34747l mVideoRotation = EnumC34747l.NORMAL;
    private PixelFrameDownSampler mPixelFrameDownSampler = new PixelFrameDownSampler();

    private static native void nativeAbandonDecodingFrames(long j11);

    private static native long nativeCreate(SoftwareVideoDecoder softwareVideoDecoder);

    private static native int nativeDecodeFrame(long j11, EncodedVideoFrame encodedVideoFrame);

    private static native void nativeDestroy(long j11);

    private static native int nativeStart(long j11, boolean z11);

    private static native int nativeStop(long j11);

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public boolean decode(EncodedVideoFrame encodedVideoFrame) {
        VideoDecoderListener videoDecoderListener;
        if (encodedVideoFrame == null) {
            return false;
        }
        if (encodedVideoFrame.isEosFrame && (videoDecoderListener = this.mListener) != null) {
            videoDecoderListener.onDecodeCompleted();
            return true;
        }
        ByteBuffer byteBuffer = encodedVideoFrame.data;
        if (byteBuffer == null || byteBuffer.remaining() == 0) {
            return false;
        }
        this.mVideoRotation = EnumC34747l.m76131a(encodedVideoFrame.rotation);
        nativeDecodeFrame(this.mNativeVideoDecoderWrapper, encodedVideoFrame);
        return true;
    }

    private void handleDecoderError() {
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onDecodeFailed();
        }
    }

    private void onDecodedFrame(PixelFrame pixelFrame, long j11) {
        if (j11 != 0) {
            handleDecoderError();
            LiteavLog.m76083e(TAG, "decode failed.".concat(String.valueOf(j11)));
            if (pixelFrame != null) {
                pixelFrame.release();
                return;
            }
            return;
        }
        if (pixelFrame == null) {
            return;
        }
        pixelFrame.setRotation(this.mVideoRotation);
        PixelFrame pixelFrameScaleTo1080p = this.mPixelFrameDownSampler.scaleTo1080p(pixelFrame);
        GLES20.glFinish();
        if (pixelFrameScaleTo1080p == null) {
            return;
        }
        if (this.mListener != null) {
            pixelFrameScaleTo1080p.retain();
            this.mListener.onDecodeFrame(pixelFrameScaleTo1080p, pixelFrameScaleTo1080p.getTimestamp());
        }
        pixelFrameScaleTo1080p.release();
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void abandonDecodingFrames() {
        long j11 = this.mNativeVideoDecoderWrapper;
        if (j11 == 0) {
            LiteavLog.m76093w(TAG, "decoder has already stopped");
            return;
        }
        nativeAbandonDecodingFrames(j11);
        VideoDecoderListener videoDecoderListener = this.mListener;
        if (videoDecoderListener != null) {
            videoDecoderListener.onAbandonDecodingFramesCompleted();
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public VideoDecoderInterface.DecoderType getDecoderType() {
        return VideoDecoderInterface.DecoderType.SOFTWARE;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void start(Object obj, VideoDecoderListener videoDecoderListener) {
        if (this.mNativeVideoDecoderWrapper != 0) {
            LiteavLog.m76093w(TAG, "decoder is already started!");
            return;
        }
        this.mPixelFrameDownSampler.initialize(GlobalContextManager.getInstance().getGLContext());
        this.mPixelFramePool = new PixelFramePool();
        this.mListener = videoDecoderListener;
        long jNativeCreate = nativeCreate(this);
        this.mNativeVideoDecoderWrapper = jNativeCreate;
        if (jNativeCreate == 0) {
            handleDecoderError();
            LiteavLog.m76083e(TAG, "create native instance failed.");
        } else if (nativeStart(jNativeCreate, this.mIsUseHevc) == 0) {
            LiteavLog.m76087i(TAG, "decoder Start success.");
        } else {
            handleDecoderError();
            LiteavLog.m76083e(TAG, "Start software decoder failed.");
        }
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void stop() {
        if (this.mNativeVideoDecoderWrapper == 0) {
            LiteavLog.m76093w(TAG, "decoder has already stopped");
            return;
        }
        this.mPixelFrameDownSampler.uninitialize();
        PixelFramePool pixelFramePool = this.mPixelFramePool;
        if (pixelFramePool != null) {
            pixelFramePool.destroy();
            this.mPixelFramePool = null;
        }
        nativeStop(this.mNativeVideoDecoderWrapper);
        nativeDestroy(this.mNativeVideoDecoderWrapper);
        this.mNativeVideoDecoderWrapper = 0L;
        LiteavLog.m76087i(TAG, "decoder stop.");
    }

    public SoftwareVideoDecoder(boolean z11) {
        this.mIsUseHevc = z11;
    }

    private ByteBuffer getByteBufferFromPixelFrame(PixelFrame pixelFrame) {
        return pixelFrame.getBuffer();
    }

    private PixelFrame obtainPixelFrame(int i11, int i12, int i13, int i14, long j11, int i15, int i16) {
        GLConstants.PixelFormatType pixelFormatTypeM76484a = GLConstants.PixelFormatType.m76484a(i11);
        if (pixelFormatTypeM76484a == null) {
            handleDecoderError();
            LiteavLog.m76083e(TAG, "obtainPixelFrame formatType: ".concat(String.valueOf(i11)));
            return null;
        }
        PixelFramePool pixelFramePool = this.mPixelFramePool;
        if (pixelFramePool == null) {
            LiteavLog.m76087i(TAG, "obtainPixelFrame mPixelFramePool is null.");
            return null;
        }
        PixelFrame pixelFrameObtain = pixelFramePool.obtain(i12, i13, GLConstants.EnumC34866a.BYTE_BUFFER, pixelFormatTypeM76484a);
        pixelFrameObtain.setColorFormat(GLConstants.ColorRange.m76481a(i16), GLConstants.ColorSpace.m76482a(i15));
        pixelFrameObtain.setRotation(EnumC34747l.m76131a(i14));
        pixelFrameObtain.setTimestamp(j11);
        return pixelFrameObtain;
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void initialize() {
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void uninitialize() {
    }

    @Override // com.tencent.ugc.decoder.VideoDecoderInterface
    public void setScene(VideoDecoderDef.ConsumerScene consumerScene) {
    }
}
