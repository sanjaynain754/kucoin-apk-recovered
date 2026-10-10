package com.tencent.ugc.videoprocessor;

import android.content.Context;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.utils.CollectionUtils;
import com.tencent.ugc.videoprocessor.videoeffect.TXCGPUEffectFilterBase;
import com.tencent.ugc.videoprocessor.videoeffect.data.Motion;
import com.tencent.ugc.videoprocessor.videoeffect.data.MotionFilterConfig;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUDarkFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUGhostFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUGhostShadowFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUIllusionFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULightingFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPULinearShadowFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUMirrorFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUPhontomFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPURockFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSpiritOutFilter;
import com.tencent.ugc.videoprocessor.videoeffect.filter.TXCGPUSplitScreenFilter;
import java.nio.FloatBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class VideoEffectProcessor {
    private static final String TAG = "VideoEffectProcessor";
    private final Context mContext;
    private TXCGPUImageFilter mCurrentEffect;
    private boolean mReverse = false;
    private int mCurrentEffectType = -1;
    private long mTotalDuration = -1;
    private final MotionFilterConfig mMotionFilterConfig = new MotionFilterConfig();

    private void destroyCurrentEffect() {
        TXCGPUImageFilter tXCGPUImageFilter = this.mCurrentEffect;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mCurrentEffect = null;
        }
    }

    private Motion getCurrentMotion(long j11) {
        List<Motion> motionList = this.mMotionFilterConfig.getMotionList();
        Motion motion = null;
        if (CollectionUtils.isEmpty(motionList)) {
            return null;
        }
        for (int size = motionList.size() - 1; size >= 0; size--) {
            Motion motion2 = motionList.get(size);
            if (isInMotionTime(motion2, j11)) {
                motion = motion2;
                break;
            }
        }
        Motion currentMotion = this.mMotionFilterConfig.getCurrentMotion();
        return currentMotion.endTime == -1 ? currentMotion : motion;
    }

    private long getMotionStartTime(Motion motion) {
        long j11 = motion.endTime;
        if (j11 < 0) {
            return motion.startTime;
        }
        return this.mReverse ? Math.max(motion.startTime, j11) : Math.min(motion.startTime, j11);
    }

    private long getVideoPts(long j11) {
        long j12 = this.mTotalDuration;
        return j12 == -1 ? j11 : C34743h.m76116a(j12 - j11, 0L, j12);
    }

    private boolean isInMotionTime(Motion motion, long j11) {
        long j12 = motion.startTime;
        if (j12 < 0) {
            return false;
        }
        long j13 = motion.endTime;
        if (j13 > 0) {
            return j11 >= Math.min(j12, j13) && j11 <= Math.max(motion.startTime, motion.endTime);
        }
        return true;
    }

    public void deleteAllEffect() {
        LiteavLog.m76087i(TAG, "==== deleteAllEffect ====");
        this.mMotionFilterConfig.clear();
    }

    public void deleteLastEffect() {
        LiteavLog.m76087i(TAG, "==== deleteLastEffect ====");
        this.mMotionFilterConfig.deleteLastMotionEffect();
    }

    public void setReverse(boolean z11, long j11) {
        this.mReverse = z11;
        if (z11) {
            this.mTotalDuration = j11;
        } else {
            this.mTotalDuration = -1L;
        }
    }

    public void startEffect(int i11, long j11) {
        LiteavLog.m76087i(TAG, "startEffect: type" + i11 + "  startTime:" + j11);
        Motion motion = new Motion(i11);
        motion.startTime = j11;
        this.mMotionFilterConfig.addMotion(motion);
    }

    public void stopEffect(int i11, long j11) {
        LiteavLog.m76087i(TAG, "stopEffect type: " + i11 + ", endTime: " + j11);
        Motion currentMotion = this.mMotionFilterConfig.getCurrentMotion();
        if (currentMotion != null) {
            currentMotion.endTime = j11;
        }
    }

    public VideoEffectProcessor(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private TXCGPUImageFilter createEffect(int i11) {
        switch (i11) {
            case 0:
                return new TXCGPUSpiritOutFilter();
            case 1:
                return new TXCGPUSplitScreenFilter();
            case 2:
                return new TXCGPUDarkFilter();
            case 3:
                return new TXCGPURockFilter();
            case 4:
                return new TXCGPULinearShadowFilter();
            case 5:
                return new TXCGPUGhostShadowFilter();
            case 6:
                return new TXCGPUPhontomFilter();
            case 7:
                return new TXCGPUGhostFilter();
            case 8:
                return new TXCGPULightingFilter(this.mContext);
            case 9:
                return new TXCGPUMirrorFilter();
            case 10:
                return new TXCGPUIllusionFilter();
            default:
                return new TXCGPUImageFilter();
        }
    }

    private long getMotionPts(Motion motion, long j11) {
        if (!isInMotionTime(motion, j11)) {
            return -1L;
        }
        long motionStartTime = getMotionStartTime(motion);
        return motionStartTime + Math.abs(j11 - motionStartTime);
    }

    public void destroy() {
        destroyCurrentEffect();
    }

    public int getCurrentMotionType(long j11) {
        Motion currentMotion = getCurrentMotion(getVideoPts(j11));
        if (currentMotion == null) {
            return -1;
        }
        return currentMotion.type;
    }

    public PixelFrame processFrame(PixelFrame pixelFrame, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, GLTexturePool gLTexturePool) {
        boolean z11;
        long videoPts = getVideoPts(pixelFrame.getTimestamp());
        Motion currentMotion = getCurrentMotion(videoPts);
        if (currentMotion != null && isInMotionTime(currentMotion, videoPts) && pixelFrame.getTimestamp() != 0) {
            if (this.mCurrentEffectType != currentMotion.type) {
                destroyCurrentEffect();
            }
            if (this.mCurrentEffect == null) {
                int i11 = currentMotion.type;
                this.mCurrentEffectType = i11;
                TXCGPUImageFilter tXCGPUImageFilterCreateEffect = createEffect(i11);
                this.mCurrentEffect = tXCGPUImageFilterCreateEffect;
                tXCGPUImageFilterCreateEffect.initialize(gLTexturePool);
                z11 = true;
            } else {
                z11 = false;
            }
            this.mCurrentEffect.onOutputSizeChanged(pixelFrame.getWidth(), pixelFrame.getHeight());
            TXCGPUImageFilter tXCGPUImageFilter = this.mCurrentEffect;
            if (tXCGPUImageFilter instanceof TXCGPUEffectFilterBase) {
                TXCGPUEffectFilterBase tXCGPUEffectFilterBase = (TXCGPUEffectFilterBase) tXCGPUImageFilter;
                if (z11) {
                    tXCGPUEffectFilterBase.setNextFrameTimestamp(getMotionStartTime(currentMotion));
                } else {
                    tXCGPUEffectFilterBase.setNextFrameTimestamp(getMotionPts(currentMotion, videoPts));
                }
            }
            GLTexture gLTextureObtain = gLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
            gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
            GLES20.glViewport(0, 0, pixelFrame.getWidth(), pixelFrame.getHeight());
            this.mCurrentEffect.onDraw(pixelFrame.getTextureId(), gLTextureObtain, floatBuffer, floatBuffer2);
            PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
            pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
            gLTextureObtain.release();
            return pixelFrameWrap;
        }
        destroyCurrentEffect();
        return null;
    }
}
