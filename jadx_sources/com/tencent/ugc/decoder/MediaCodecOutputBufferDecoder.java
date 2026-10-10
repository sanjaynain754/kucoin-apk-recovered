package com.tencent.ugc.decoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFramePool;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecOutputBufferDecoder extends MediaCodecDecoder {
    private final PixelFrameDownSampler mPixelFrameDownSampler;
    private int mSliceHeight;
    private int mStride;
    private PixelFramePool mYuvFramePool;

    private void copyI420Buffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12, int i13, int i14) {
        copyPlane(byteBuffer, 0, byteBuffer2, 0, i13, i11, i12);
        int i15 = i13 * i14;
        int i16 = i11 * i12;
        int i17 = i13 / 2;
        int i18 = i11 / 2;
        int i19 = i12 / 2;
        copyPlane(byteBuffer, i15, byteBuffer2, i16, i17, i18, i19);
        copyPlane(byteBuffer, i15 + (i15 / 4), byteBuffer2, i16 + (i16 / 4), i17, i18, i19);
    }

    private void copyNV12Buffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12, int i13, int i14) {
        copyPlane(byteBuffer, 0, byteBuffer2, 0, i13, i11, i12);
        copyPlane(byteBuffer, i13 * i14, byteBuffer2, i11 * i12, i13, i11, i12 / 2);
    }

    private PixelFrame createPixFrameFromYuvBuffer(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, MediaFormat mediaFormat, long j11) {
        GLConstants.PixelFormatType pixelFormatType;
        if (byteBuffer == null) {
            return null;
        }
        int integer = mediaFormat.getInteger("color-format");
        if (integer == 19) {
            pixelFormatType = GLConstants.PixelFormatType.I420;
        } else {
            if (integer != 21) {
                return null;
            }
            pixelFormatType = GLConstants.PixelFormatType.NV12;
        }
        if (this.mYuvFramePool == null) {
            this.mYuvFramePool = new PixelFramePool();
        }
        PixelFramePool pixelFramePool = this.mYuvFramePool;
        Size size = this.mResolution;
        PixelFrame pixelFrameObtain = pixelFramePool.obtain(size.width, size.height, GLConstants.EnumC34866a.BYTE_BUFFER, pixelFormatType);
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.rewind();
        if (integer == 19) {
            ByteBuffer buffer = pixelFrameObtain.getBuffer();
            Size size2 = this.mResolution;
            copyI420Buffer(byteBuffer, buffer, size2.width, size2.height, this.mStride, this.mSliceHeight);
        } else {
            ByteBuffer buffer2 = pixelFrameObtain.getBuffer();
            Size size3 = this.mResolution;
            copyNV12Buffer(byteBuffer, buffer2, size3.width, size3.height, this.mStride, this.mSliceHeight);
        }
        pixelFrameObtain.setTimestamp(TimeUnit.MICROSECONDS.toMillis(j11));
        pixelFrameObtain.setColorFormat(getColorRange(), getColorSpace());
        return pixelFrameObtain;
    }

    public static boolean isSupportColorFormat(int i11) {
        return i11 == 19 || i11 == 21;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i11) {
        if (this.mListener != null && mediaCodec != null && bufferInfo != null) {
            if ((bufferInfo.flags & 4) != 0) {
                LiteavLog.m76087i(this.mTAG, "meet end of stream.");
                this.mListener.onDecodeFrame(null, true);
            } else {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i11);
                MediaFormat outputFormat = mediaCodec.getOutputFormat();
                PixelFrame pixelFrameCreatePixFrameFromYuvBuffer = createPixFrameFromYuvBuffer(outputBuffer, bufferInfo, outputFormat, bufferInfo.presentationTimeUs);
                if (pixelFrameCreatePixFrameFromYuvBuffer != null) {
                    pixelFrameCreatePixFrameFromYuvBuffer.setRotation(this.mVideoRotation);
                }
                PixelFrame pixelFrameScaleTo1080p = this.mPixelFrameDownSampler.scaleTo1080p(pixelFrameCreatePixFrameFromYuvBuffer);
                GLES20.glFinish();
                if (pixelFrameScaleTo1080p != null) {
                    this.mListener.onDecodeFrame(pixelFrameScaleTo1080p, false);
                } else {
                    LiteavLog.m76082e(this.mThrottlers.m76042a("handleOutputBuffer"), this.mTAG, String.format(Locale.ENGLISH, "output color format(%d) is unknown", Integer.valueOf(outputFormat.getInteger("color-format"))), new Object[0]);
                    this.mListener.onDecoderError();
                }
            }
            mediaCodec.releaseOutputBuffer(i11, false);
        }
        return false;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void outputFormatChange(MediaFormat mediaFormat) {
        LiteavLog.m76087i(this.mTAG, "decode output format changed: ".concat(String.valueOf(mediaFormat)));
        int integer = mediaFormat.getInteger("width");
        int integer2 = mediaFormat.getInteger("height");
        this.mStride = integer;
        this.mSliceHeight = integer2;
        if (mediaFormat.containsKey("stride")) {
            this.mStride = mediaFormat.getInteger("stride");
        }
        if (mediaFormat.containsKey("slice-height")) {
            this.mSliceHeight = mediaFormat.getInteger("slice-height");
        }
        this.mStride = Math.max(integer, this.mStride);
        this.mSliceHeight = Math.max(integer2, this.mSliceHeight);
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean start(Object obj) {
        return this.mPixelFrameDownSampler.initialize(obj);
    }

    public void uninitializeGLComponents() {
        if (this.mPixelFrameDownSampler.makeCurrent()) {
            PixelFramePool pixelFramePool = this.mYuvFramePool;
            if (pixelFramePool != null) {
                pixelFramePool.evictAll();
                this.mYuvFramePool.destroy();
                this.mYuvFramePool = null;
            }
            this.mPixelFrameDownSampler.uninitialize();
        }
    }

    public MediaCodecOutputBufferDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z11, MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        super(hardwareDecoderMediaFormatBuilder, size, z11, mediaCodecDecoderListener, customHandler);
        this.mStride = 0;
        this.mSliceHeight = 0;
        this.mTAG = "MediaCodecOutputBufferDecoder_" + hashCode();
        this.mPixelFrameDownSampler = new PixelFrameDownSampler();
    }

    private void copyPlane(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14, int i15) {
        OpenGlUtils.nativeCopyYuvFromByteBufferToByteBuffer(byteBuffer, i11, byteBuffer2, i12, i13, i14, i15);
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int supportColorFormat = DecodeAbilityProvider.getInstance().getSupportColorFormat(mediaFormat.getString("mime"));
        if (supportColorFormat <= 0) {
            return false;
        }
        mediaFormat.setInteger("color-format", supportColorFormat);
        MediaCodecWrapper.configure(mediaCodec, mediaFormat, null, null, 0);
        return true;
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void stop() {
        super.stop();
        uninitializeGLComponents();
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void updateOutputSurface(MediaCodec mediaCodec) {
    }
}
