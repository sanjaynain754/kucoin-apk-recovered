package com.tencent.ugc.videoprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.preprocessor.BeautyProcessor;
import com.tencent.ugc.preprocessor.VideoPreprocessor;
import com.tencent.ugc.preprocessor.VideoPreprocessorListener;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.videobase.ConvertParams;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class VideoProcessManager {
    private static final int IDENTITY = 100;
    private GLTexturePool mGLTexturePool;
    private IVideoProcessManagerListener mListener;
    private final FloatBuffer mNormalCubeVerticesBuffer;
    private final FloatBuffer mNormalTextureCoordsBuffer;
    private final VideoTransitionProcessor mTransitionProcessor;
    private final VideoEffectProcessor mVideoEffectProcessor;
    private final VideoPreprocessor mVideoPreprocessor;
    private final WatermarkProcessor mWatermarkProcessor;
    private final String mTAG = "VideoProcessManager_" + hashCode();
    private boolean mNeedProcess = false;
    private boolean mIsPreprocessorRegister = false;
    private VideoPreprocessorListener mVideoPreprocessorListener = new VideoPreprocessorListener() { // from class: com.tencent.ugc.videoprocessor.VideoProcessManager.1
        @Override // com.tencent.ugc.preprocessor.VideoPreprocessorListener
        public final void didProcessFrame(int i11, PixelFrame pixelFrame) {
            Object gLContext = pixelFrame.getGLContext();
            VideoProcessManager.this.processByVideoEffect(pixelFrame);
            CommonUtil.equals(gLContext, pixelFrame.getGLContext());
        }
    };

    public interface IVideoProcessManagerListener {
        int customProcessFrame(PixelFrame pixelFrame);

        void didProcessFrame(PixelFrame pixelFrame);
    }

    public VideoEffectProcessor getEffectProcessor() {
        this.mNeedProcess = true;
        return this.mVideoEffectProcessor;
    }

    public VideoTransitionProcessor getTransitionProcessor() {
        this.mNeedProcess = true;
        return this.mTransitionProcessor;
    }

    public WatermarkProcessor getWatermarkProcessor() {
        this.mNeedProcess = true;
        return this.mWatermarkProcessor;
    }

    public void setBeautyFilter(int i11, int i12) {
        this.mNeedProcess = true;
        BeautyProcessor beautyProcessor = this.mVideoPreprocessor.getBeautyProcessor();
        if (beautyProcessor != null) {
            beautyProcessor.setBeautyLevel(i11 / 9.0f);
            beautyProcessor.setWhitenessLevel(i12 / 9.0f);
        }
    }

    public void setFilter(Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        this.mNeedProcess = true;
        this.mVideoPreprocessor.setFilterGroupImages(f13, bitmap, f11, bitmap2, f12);
    }

    public void setSpecialRatio(float f11) {
        this.mNeedProcess = true;
        this.mVideoPreprocessor.setFilterMixLevel(f11);
    }

    private PixelFrame applyMotionFilterChain(PixelFrame pixelFrame) {
        VideoEffectProcessor videoEffectProcessor = this.mVideoEffectProcessor;
        if (videoEffectProcessor != null) {
            return videoEffectProcessor.processFrame(pixelFrame, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer, this.mGLTexturePool);
        }
        return null;
    }

    private PixelFrame applyTransitionFilterChain(PixelFrame pixelFrame) {
        VideoTransitionProcessor videoTransitionProcessor = this.mTransitionProcessor;
        if (videoTransitionProcessor == null) {
            return null;
        }
        return videoTransitionProcessor.applyTransitionFilter(pixelFrame, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
    }

    public void initFilter(GLTexturePool gLTexturePool, int i11, int i12) {
        this.mGLTexturePool = gLTexturePool;
        this.mWatermarkProcessor.initialize(gLTexturePool, i11, i12);
        this.mTransitionProcessor.initialize(this.mGLTexturePool);
        if (this.mIsPreprocessorRegister) {
            return;
        }
        this.mVideoPreprocessor.registerVideoProcessedListener(100, new ConvertParams(i11, i12), GLConstants.EnumC34866a.TEXTURE_2D, GLConstants.PixelFormatType.RGBA, false, this.mVideoPreprocessorListener);
        this.mIsPreprocessorRegister = true;
    }

    public void processFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            return;
        }
        IVideoProcessManagerListener iVideoProcessManagerListener = this.mListener;
        int iCustomProcessFrame = iVideoProcessManagerListener != null ? iVideoProcessManagerListener.customProcessFrame(pixelFrame) : -1;
        if (iCustomProcessFrame > 0) {
            PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
            pixelFrame2.setTextureId(iCustomProcessFrame);
            pixelFrame = pixelFrame2;
        }
        VideoPreprocessor videoPreprocessor = this.mVideoPreprocessor;
        if (videoPreprocessor == null || !this.mNeedProcess) {
            IVideoProcessManagerListener iVideoProcessManagerListener2 = this.mListener;
            if (iVideoProcessManagerListener2 != null) {
                iVideoProcessManagerListener2.didProcessFrame(pixelFrame);
            }
        } else {
            WatermarkProcessor watermarkProcessor = this.mWatermarkProcessor;
            if (watermarkProcessor != null) {
                videoPreprocessor.setGaussianBlurLevel(watermarkProcessor.getBlurLevel() * 4.0f);
            } else {
                videoPreprocessor.setGaussianBlurLevel(0.0f);
            }
            this.mVideoPreprocessor.processFrame(pixelFrame);
        }
        if (iCustomProcessFrame > 0) {
            pixelFrame.release();
        }
    }

    public void setListener(IVideoProcessManagerListener iVideoProcessManagerListener) {
        this.mListener = iVideoProcessManagerListener;
    }

    public void setOutputSize(int i11, int i12) {
        WatermarkProcessor watermarkProcessor = this.mWatermarkProcessor;
        if (watermarkProcessor != null) {
            watermarkProcessor.setRenderTargetSize(i11, i12);
        }
    }

    public void setScaleType(GLConstants.GLScaleType gLScaleType) {
        if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            this.mWatermarkProcessor.setRenderMode(2);
        }
    }

    public void unInitFilter() {
        LiteavLog.m76087i(this.mTAG, "unInitialize");
        VideoEffectProcessor videoEffectProcessor = this.mVideoEffectProcessor;
        if (videoEffectProcessor != null) {
            videoEffectProcessor.destroy();
        }
        VideoTransitionProcessor videoTransitionProcessor = this.mTransitionProcessor;
        if (videoTransitionProcessor != null) {
            videoTransitionProcessor.destroy();
        }
        if (this.mIsPreprocessorRegister) {
            this.mVideoPreprocessor.unregisterVideoProcessedListener(100, this.mVideoPreprocessorListener);
            this.mIsPreprocessorRegister = false;
        }
    }

    public void unInitialize() {
        LiteavLog.m76087i(this.mTAG, "unInitialize");
        VideoPreprocessor videoPreprocessor = this.mVideoPreprocessor;
        if (videoPreprocessor != null) {
            videoPreprocessor.uninitialize();
        }
    }

    public VideoProcessManager(Context context, boolean z11) {
        BeautyProcessor beautyProcessor = new BeautyProcessor(context, z11);
        this.mVideoPreprocessor = new VideoPreprocessor(context, beautyProcessor);
        this.mVideoEffectProcessor = new VideoEffectProcessor(context);
        this.mTransitionProcessor = new VideoTransitionProcessor(context);
        this.mWatermarkProcessor = new WatermarkProcessor();
        beautyProcessor.setPerformanceMode(z11);
        this.mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
        this.mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    }

    private PixelFrame processByVideoEffectInner(PixelFrame pixelFrame) {
        PixelFrame pixelFrameApplyTransitionFilterChain;
        pixelFrame.retain();
        VideoEffectProcessor videoEffectProcessor = this.mVideoEffectProcessor;
        if (videoEffectProcessor != null && videoEffectProcessor.getCurrentMotionType(pixelFrame.getTimestamp()) == 1) {
            PixelFrame pixelFrameApplyTransitionFilterChain2 = applyTransitionFilterChain(pixelFrame);
            if (pixelFrameApplyTransitionFilterChain2 != null) {
                pixelFrame.release();
                pixelFrame = pixelFrameApplyTransitionFilterChain2;
            }
            pixelFrameApplyTransitionFilterChain = applyMotionFilterChain(pixelFrame);
            if (pixelFrameApplyTransitionFilterChain != null) {
                pixelFrame.release();
                pixelFrame = pixelFrameApplyTransitionFilterChain;
            }
        } else {
            PixelFrame pixelFrameApplyMotionFilterChain = applyMotionFilterChain(pixelFrame);
            if (pixelFrameApplyMotionFilterChain != null) {
                pixelFrame.release();
                pixelFrame = pixelFrameApplyMotionFilterChain;
            }
            pixelFrameApplyTransitionFilterChain = applyTransitionFilterChain(pixelFrame);
            if (pixelFrameApplyTransitionFilterChain != null) {
                pixelFrame.release();
                pixelFrame = pixelFrameApplyTransitionFilterChain;
            }
        }
        PixelFrame pixelFrameProcess = this.mWatermarkProcessor.process(pixelFrame, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
        if (pixelFrameProcess != null) {
            pixelFrame.release();
            return pixelFrameProcess;
        }
        return pixelFrame;
    }

    public void processByVideoEffect(PixelFrame pixelFrame) {
        IVideoProcessManagerListener iVideoProcessManagerListener;
        PixelFrame pixelFrameProcessByVideoEffectInner = processByVideoEffectInner(pixelFrame);
        if (pixelFrameProcessByVideoEffectInner != null && (iVideoProcessManagerListener = this.mListener) != null) {
            iVideoProcessManagerListener.didProcessFrame(pixelFrameProcessByVideoEffectInner);
            pixelFrameProcessByVideoEffectInner.release();
        }
    }
}
