package com.tencent.ugc.videoprocessor;

import android.content.Context;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videoprocessor.transitions.BounceFilter;
import com.tencent.ugc.videoprocessor.transitions.BurnFilter;
import com.tencent.ugc.videoprocessor.transitions.CircleCropFilter;
import com.tencent.ugc.videoprocessor.transitions.CircleFilter;
import com.tencent.ugc.videoprocessor.transitions.CrossWarpFilter;
import com.tencent.ugc.videoprocessor.transitions.CrossZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.CubeFilter;
import com.tencent.ugc.videoprocessor.transitions.DirectionalFilter;
import com.tencent.ugc.videoprocessor.transitions.DirectionalWarpFilter;
import com.tencent.ugc.videoprocessor.transitions.DoorWayFilter;
import com.tencent.ugc.videoprocessor.transitions.DreamyZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.FadeColorFilter;
import com.tencent.ugc.videoprocessor.transitions.FadeGrayScaleFilter;
import com.tencent.ugc.videoprocessor.transitions.FlyEyeFilter;
import com.tencent.ugc.videoprocessor.transitions.GlitchDisplaceFilter;
import com.tencent.ugc.videoprocessor.transitions.GlitchMemoriesFilter;
import com.tencent.ugc.videoprocessor.transitions.GridFlipFilter;
import com.tencent.ugc.videoprocessor.transitions.HexagonalizeFilter;
import com.tencent.ugc.videoprocessor.transitions.InvertedPageCurlFilter;
import com.tencent.ugc.videoprocessor.transitions.KaleidoScopeFilter;
import com.tencent.ugc.videoprocessor.transitions.LinearBlurFilter;
import com.tencent.ugc.videoprocessor.transitions.MosaicFilter;
import com.tencent.ugc.videoprocessor.transitions.PixelizeFilter;
import com.tencent.ugc.videoprocessor.transitions.SimpleZoomFilter;
import com.tencent.ugc.videoprocessor.transitions.SqueezeFilter;
import com.tencent.ugc.videoprocessor.transitions.StereoViewerFilter;
import com.tencent.ugc.videoprocessor.transitions.SwapFilter;
import com.tencent.ugc.videoprocessor.transitions.SwirlFilter;
import com.tencent.ugc.videoprocessor.transitions.TXCGPUTransitionFilterBase;
import com.tencent.ugc.videoprocessor.transitions.WaterDropFilter;
import com.tencent.ugc.videoprocessor.transitions.data.TransitionConfig;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoTransitionProcessor {
    private static final String TAG = "TransitionProcessor";
    private final Context mContext;
    private GLTexturePool mGLTexturePool;
    private TXCGPUTransitionFilterBase mTransitionFilter;
    private long mFirstFrameTime = -1;
    private boolean mIsReverse = false;
    private long mVideoDuration = -1;
    private final TransitionConfig mTransitionConfig = new TransitionConfig();

    private void createTransitionFilter(int i11) {
        DirectionalFilter directionalFilter;
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase;
        TXCGPUTransitionFilterBase fadeColorFilter;
        switch (i11) {
            case 1:
                directionalFilter = new DirectionalFilter(i11, new float[]{1.0f, 0.0f});
                tXCGPUTransitionFilterBase = directionalFilter;
                break;
            case 2:
                directionalFilter = new DirectionalFilter(i11, new float[]{-1.0f, 0.0f});
                tXCGPUTransitionFilterBase = directionalFilter;
                break;
            case 3:
                directionalFilter = new DirectionalFilter(i11, new float[]{0.0f, -1.0f});
                tXCGPUTransitionFilterBase = directionalFilter;
                break;
            case 4:
                directionalFilter = new DirectionalFilter(i11, new float[]{0.0f, 1.0f});
                tXCGPUTransitionFilterBase = directionalFilter;
                break;
            case 5:
                fadeColorFilter = new FadeColorFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 6:
            case 20:
            case 21:
            case 26:
            default:
                tXCGPUTransitionFilterBase = null;
                break;
            case 7:
                fadeColorFilter = new SimpleZoomFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 8:
                fadeColorFilter = new LinearBlurFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 9:
                fadeColorFilter = new WaterDropFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 10:
                fadeColorFilter = new InvertedPageCurlFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 11:
                fadeColorFilter = new GlitchMemoriesFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 12:
                fadeColorFilter = new StereoViewerFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 13:
                fadeColorFilter = new DirectionalWarpFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 14:
                fadeColorFilter = new BounceFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 15:
                fadeColorFilter = new CircleCropFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 16:
                fadeColorFilter = new SwirlFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 17:
                fadeColorFilter = new CrossZoomFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 18:
                fadeColorFilter = new GridFlipFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 19:
                fadeColorFilter = new MosaicFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 22:
                fadeColorFilter = new KaleidoScopeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 23:
                fadeColorFilter = new HexagonalizeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 24:
                fadeColorFilter = new GlitchDisplaceFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 25:
                fadeColorFilter = new DreamyZoomFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 27:
                fadeColorFilter = new BurnFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 28:
                fadeColorFilter = new CircleFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 29:
                fadeColorFilter = new CrossWarpFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 30:
                fadeColorFilter = new CubeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 31:
                fadeColorFilter = new DoorWayFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 32:
                fadeColorFilter = new FadeGrayScaleFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 33:
                fadeColorFilter = new FlyEyeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 34:
                fadeColorFilter = new PixelizeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 35:
                fadeColorFilter = new SqueezeFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
            case 36:
                fadeColorFilter = new SwapFilter(i11);
                tXCGPUTransitionFilterBase = fadeColorFilter;
                break;
        }
        if (tXCGPUTransitionFilterBase != null) {
            tXCGPUTransitionFilterBase.initialize(this.mGLTexturePool);
        }
        this.mTransitionFilter = tXCGPUTransitionFilterBase;
    }

    private TransitionConfig.TransitionBean getCurrentTransition(long j11) {
        List<TransitionConfig.TransitionBean> transitionList = this.mTransitionConfig.getTransitionList();
        if (CollectionUtils.isEmpty(transitionList)) {
            return null;
        }
        for (int size = transitionList.size() - 1; size >= 0; size--) {
            TransitionConfig.TransitionBean transitionBean = transitionList.get(size);
            if (isInTransitionRange(j11, transitionBean)) {
                return transitionBean;
            }
        }
        return null;
    }

    private float getTransitionProgress(TransitionConfig.TransitionBean transitionBean, long j11) {
        if (this.mFirstFrameTime == -1) {
            this.mFirstFrameTime = j11;
        }
        long jAbs = Math.abs(j11 - this.mFirstFrameTime);
        long jAbs2 = Math.abs(transitionBean.endTimeMs - transitionBean.startTimeMs);
        if (jAbs2 <= 0) {
            return -1.0f;
        }
        return C34743h.m76114a((jAbs * 1.0f) / jAbs2, 0.0f);
    }

    private boolean isInTransitionRange(long j11, TransitionConfig.TransitionBean transitionBean) {
        long j12 = transitionBean.startTimeMs;
        if (j11 < j12 || j11 > transitionBean.endTimeMs) {
            return j11 >= transitionBean.endTimeMs && j11 <= j12;
        }
        return true;
    }

    public void deleteLastTransitionEffect() {
        this.mTransitionConfig.deleteLastTransitionEffect();
    }

    public void destroy() {
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase != null) {
            tXCGPUTransitionFilterBase.uninitialize();
            this.mTransitionFilter = null;
        }
    }

    public void initialize(GLTexturePool gLTexturePool) {
        this.mGLTexturePool = gLTexturePool;
    }

    public void setReverse(boolean z11, long j11) {
        this.mIsReverse = z11;
        this.mVideoDuration = j11;
    }

    public boolean setTransitionEffect(int i11, long j11, long j12, long j13) {
        if (j12 <= j11) {
            long j14 = j13 + j12;
            if (j14 <= j11) {
                List<TransitionConfig.TransitionBean> transitionList = this.mTransitionConfig.getTransitionList();
                if (transitionList.size() != 0) {
                    for (TransitionConfig.TransitionBean transitionBean : transitionList) {
                        if (j12 >= transitionBean.startTimeMs && j12 <= transitionBean.endTimeMs) {
                            LiteavLog.m76093w(TAG, "setTransitionEffect,start time invalid");
                        } else if (isInTransitionRange(j14, transitionBean)) {
                            LiteavLog.m76093w(TAG, "setTransitionEffect,end time invalid");
                        }
                        return false;
                    }
                }
                TransitionConfig.TransitionBean transitionBean2 = new TransitionConfig.TransitionBean(i11);
                transitionBean2.startTimeMs = j12;
                transitionBean2.endTimeMs = j14;
                this.mTransitionConfig.addTransition(transitionBean2);
                LiteavLog.m76079d(TAG, "setTransitionEffect,success:".concat(String.valueOf(transitionBean2)));
                return true;
            }
        }
        LiteavLog.m76093w(TAG, "setTransitionEffect,not suitable for videoTotalDurationMs");
        return false;
    }

    public VideoTransitionProcessor(Context context) {
        this.mContext = context;
    }

    public PixelFrame applyTransitionFilter(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        long timestamp = pixelFrame.getTimestamp();
        if (this.mIsReverse) {
            long j11 = this.mVideoDuration;
            timestamp = C34743h.m76116a(j11 - timestamp, 0L, j11);
        }
        TransitionConfig.TransitionBean currentTransition = getCurrentTransition(timestamp);
        if (currentTransition == null) {
            this.mFirstFrameTime = -1L;
            return null;
        }
        float transitionProgress = getTransitionProgress(currentTransition, timestamp);
        if (transitionProgress < 0.0f) {
            return null;
        }
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase != null && tXCGPUTransitionFilterBase.mType != currentTransition.type) {
            tXCGPUTransitionFilterBase.uninitialize();
            this.mTransitionFilter = null;
        }
        if (this.mTransitionFilter == null) {
            createTransitionFilter(currentTransition.type);
        }
        TXCGPUTransitionFilterBase tXCGPUTransitionFilterBase2 = this.mTransitionFilter;
        if (tXCGPUTransitionFilterBase2 == null) {
            return null;
        }
        tXCGPUTransitionFilterBase2.onOutputSizeChanged(pixelFrame.getWidth(), pixelFrame.getHeight());
        this.mTransitionFilter.setProgressForTransition(transitionProgress);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mTransitionFilter.onDraw(pixelFrame.getTextureId(), gLTextureObtain, floatBuffer, floatBuffer2);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        gLTextureObtain.release();
        return pixelFrameWrap;
    }
}
