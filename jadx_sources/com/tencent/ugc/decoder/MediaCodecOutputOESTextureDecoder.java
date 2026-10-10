package com.tencent.ugc.decoder;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.GlobalContextManager;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.TextureHolderPool;
import com.tencent.ugc.videobase.utils.HardwareDecoderMediaFormatBuilder;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MediaCodecOutputOESTextureDecoder extends MediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener {
    private int mOESTextureId;
    private Surface mOutputSurface;
    private final PixelFrameDownSampler mPixelFrameDownSampler;
    private SurfaceTexture mSurfaceTexture;
    private TextureHolderPool mTextureHolderPool;

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean handleOutputBuffer(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i11) {
        mediaCodec.releaseOutputBuffer(i11, true);
        if ((bufferInfo.flags & 4) == 0) {
            return true;
        }
        LiteavLog.m76087i(this.mTAG, "meet end of stream.");
        MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener = this.mListener;
        if (mediaCodecDecoderListener == null) {
            return false;
        }
        mediaCodecDecoderListener.onDecodeFrame(null, true);
        return false;
    }

    public static /* synthetic */ void lambda$onFrameAvailable$0(MediaCodecOutputOESTextureDecoder mediaCodecOutputOESTextureDecoder, SurfaceTexture surfaceTexture) {
        TextureHolderPool.TextureHolder textureHolderObtain;
        SurfaceTexture surfaceTexture2 = mediaCodecOutputOESTextureDecoder.mSurfaceTexture;
        if (surfaceTexture2 == null || surfaceTexture != surfaceTexture2) {
            return;
        }
        mediaCodecOutputOESTextureDecoder.mPixelFrameDownSampler.makeCurrent();
        try {
            textureHolderObtain = mediaCodecOutputOESTextureDecoder.mTextureHolderPool.obtain();
        } catch (InterruptedException unused) {
            LiteavLog.m76093w(mediaCodecOutputOESTextureDecoder.mTAG, "textureholderpool obtain interrupted.");
            textureHolderObtain = null;
        }
        if (textureHolderObtain == null) {
            return;
        }
        int i11 = mediaCodecOutputOESTextureDecoder.mOESTextureId;
        Size size = mediaCodecOutputOESTextureDecoder.mResolution;
        textureHolderObtain.updateTexture(36197, i11, size.width, size.height);
        textureHolderObtain.setColorFormat(mediaCodecOutputOESTextureDecoder.getColorRange(), mediaCodecOutputOESTextureDecoder.getColorSpace());
        Object eglContext = mediaCodecOutputOESTextureDecoder.mPixelFrameDownSampler.getEglContext();
        if (eglContext == null) {
            eglContext = GlobalContextManager.getInstance().getGLContext();
        }
        PixelFrame pixelFrameWrap = textureHolderObtain.wrap(eglContext);
        if (pixelFrameWrap.getMatrix() == null) {
            pixelFrameWrap.setMatrix(new float[16]);
        }
        try {
            surfaceTexture.updateTexImage();
            surfaceTexture.getTransformMatrix(pixelFrameWrap.getMatrix());
        } catch (Throwable th2) {
            LiteavLog.m76092w(mediaCodecOutputOESTextureDecoder.mThrottlers.m76042a("updateImage"), mediaCodecOutputOESTextureDecoder.mTAG, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
        long millis = TimeUnit.NANOSECONDS.toMillis(surfaceTexture.getTimestamp());
        if (millis == 0) {
            millis = TimeUnit.MICROSECONDS.toMillis(mediaCodecOutputOESTextureDecoder.mBufferInfo.presentationTimeUs);
        }
        pixelFrameWrap.setTimestamp(millis);
        pixelFrameWrap.setRotation(mediaCodecOutputOESTextureDecoder.mVideoRotation);
        PixelFrame pixelFrameScaleTo1080p = mediaCodecOutputOESTextureDecoder.mPixelFrameDownSampler.scaleTo1080p(pixelFrameWrap);
        pixelFrameScaleTo1080p.setHdrType(mediaCodecOutputOESTextureDecoder.mHDRType);
        GLES20.glFinish();
        mediaCodecOutputOESTextureDecoder.mListener.onDecodeFrame(pixelFrameScaleTo1080p, false);
        textureHolderObtain.release();
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean configureMediaCodec(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaCodecWrapper.configure(mediaCodec, mediaFormat, this.mOutputSurface, null, 0);
        LiteavLog.m76087i(this.mTAG, "configure mediacodec with " + this.mOutputSurface);
        return true;
    }

    public boolean initializeGLComponents(Object obj) {
        if (!this.mPixelFrameDownSampler.initialize(obj)) {
            MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener = this.mListener;
            if (mediaCodecDecoderListener != null) {
                mediaCodecDecoderListener.onDecoderError();
            }
            return false;
        }
        this.mOESTextureId = OpenGlUtils.generateTextureOES();
        this.mTextureHolderPool = new TextureHolderPool(1);
        try {
            this.mSurfaceTexture = new SurfaceTexture(this.mOESTextureId);
            this.mOutputSurface = new Surface(this.mSurfaceTexture);
            this.mSurfaceTexture.setOnFrameAvailableListener(this);
            LiteavLog.m76086i(this.mThrottlers.m76042a("initializeGLComponents"), this.mTAG, "initialize gl components successful.", new Object[0]);
            return true;
        } catch (Surface.OutOfResourcesException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("surface"), this.mTAG, "create SurfaceTexture failed.", e11);
            MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener2 = this.mListener;
            if (mediaCodecDecoderListener2 != null) {
                mediaCodecDecoderListener2.onDecoderError();
            }
            return false;
        }
    }

    public void uninitializeGLComponents() {
        LiteavLog.m76087i(this.mTAG, "unInitialize gl components");
        if (this.mPixelFrameDownSampler.makeCurrent()) {
            TextureHolderPool textureHolderPool = this.mTextureHolderPool;
            if (textureHolderPool != null) {
                textureHolderPool.destroy();
            }
            Surface surface = this.mOutputSurface;
            if (surface != null) {
                surface.release();
                this.mOutputSurface = null;
            }
            SurfaceTexture surfaceTexture = this.mSurfaceTexture;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.mSurfaceTexture = null;
            }
            OpenGlUtils.deleteTexture(this.mOESTextureId);
            this.mOESTextureId = -1;
            this.mPixelFrameDownSampler.uninitialize();
        }
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void updateOutputSurface(MediaCodec mediaCodec) {
        mediaCodec.setOutputSurface(this.mOutputSurface);
    }

    public MediaCodecOutputOESTextureDecoder(HardwareDecoderMediaFormatBuilder hardwareDecoderMediaFormatBuilder, Size size, boolean z11, MediaCodecDecoder.MediaCodecDecoderListener mediaCodecDecoderListener, CustomHandler customHandler) {
        super(hardwareDecoderMediaFormatBuilder, size, z11, mediaCodecDecoderListener, customHandler);
        this.mOESTextureId = -1;
        this.mTAG = "MediaCodecOutputOESTextureDecoder" + hashCode();
        this.mPixelFrameDownSampler = new PixelFrameDownSampler();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        runOnWorkThread(RunnableC35599h.m79096a(this, surfaceTexture));
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public boolean start(Object obj) {
        return initializeGLComponents(obj);
    }

    @Override // com.tencent.ugc.decoder.MediaCodecDecoder
    public void stop() {
        super.stop();
        uninitializeGLComponents();
    }
}
