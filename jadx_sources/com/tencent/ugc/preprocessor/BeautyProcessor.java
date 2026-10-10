package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.C34743h;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.beauty.gpufilters.BeautyBrightFilter;
import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.beauty.gpufilters.TXCGPUMotionBase;
import com.tencent.ugc.beauty.gpufilters.pitu.BeautyPITUFilter;
import com.tencent.ugc.beauty.gpufilters.smooth.BeautySmoothFilter;
import com.tencent.ugc.beauty.gpufilters.vague.BeautyVagueFilter;
import com.tencent.ugc.common.TXCBuildsUtil;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.FloatUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class BeautyProcessor extends TXCGPUImageFilterChain {
    private static final String TAG = "TXCBeautyManager";
    private BeautyProcessorStatusListener mBeautyManagerStatusListener;
    private final boolean mIsEnterPriseProEnabled;
    private final TXCGPUMotionBase mMotionFilter;
    private TXCGPUImageFilter mCurrentBeautyFilter = null;
    private int mBeautyStyle = -1;
    private float mBeautyLevel = 0.0f;
    private float mWhitenessLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.4f;
    private boolean mIsPerformanceMode = true;
    private float mUserSetSharpnessLevel = 0.0f;
    private final Map<String, String> mBeautyStats = new HashMap();
    private final SparseArray<TXCGPUImageFilter> mBeautyFilters = new SparseArray<>();

    public interface BeautyProcessorStatusListener {
        void onBeautyStatsChanged(String str);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return canBeSkipped(this.mCurrentBeautyFilter) && this.mMotionFilter.canBeSkipped();
    }

    public void setBeautyLevel(float f11) {
        float fM76114a = C34743h.m76114a(f11, 0.0f);
        LiteavLog.m76079d(TAG, "setBeautyLevel beautyLevel:".concat(String.valueOf(f11)));
        runOnDraw(RunnableC35760a.m79250a(this, fM76114a));
    }

    public void setWhitenessLevel(float f11) {
        float fM76114a = C34743h.m76114a(f11, 0.0f);
        LiteavLog.m76079d(TAG, "setWhitenessLevel whitenessLevel:".concat(String.valueOf(f11)));
        runOnDraw(RunnableC35761b.m79251a(this, fM76114a));
    }

    private boolean canBeSkipped(TXCGPUImageFilter tXCGPUImageFilter) {
        if (tXCGPUImageFilter == null) {
            return true;
        }
        return tXCGPUImageFilter.canBeSkipped();
    }

    private float getSharpnessLevel() {
        float f11 = this.mUserSetSharpnessLevel;
        if (f11 != 0.0f) {
            return f11;
        }
        if (!this.mIsPerformanceMode) {
            Size size = this.mOutputSize;
            if (Math.min(size.width, size.height) >= 540) {
                return 0.4f;
            }
        }
        return 0.0f;
    }

    public static /* synthetic */ void lambda$setBeautyLevel$0(BeautyProcessor beautyProcessor, float f11) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, f11, beautyProcessor.mWhitenessLevel, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        beautyProcessor.updateStatsInternal("beautyLevel", f11);
    }

    public static /* synthetic */ void lambda$setPerformanceMode$3(BeautyProcessor beautyProcessor, boolean z11) {
        beautyProcessor.mIsPerformanceMode = z11;
        beautyProcessor.updateSharpenLevelInternal();
    }

    public static /* synthetic */ void lambda$setWhitenessLevel$1(BeautyProcessor beautyProcessor, float f11) {
        beautyProcessor.updateBeautyInternal(beautyProcessor.mBeautyStyle, beautyProcessor.mBeautyLevel, f11, beautyProcessor.mRuddyLevel, beautyProcessor.mSharpnessLevel);
        beautyProcessor.updateStatsInternal("whiteLevel", f11);
    }

    private void updateBeautyInternal(int i11, float f11, float f12, float f13, float f14) {
        Size size = this.mOutputSize;
        if (size.width == -1 || size.height == -1) {
            return;
        }
        if (this.mBeautyStyle != i11) {
            updateStatsOnDraw("beautyStyle", i11);
        }
        TXCGPUImageFilter beautySmoothFilter = this.mBeautyFilters.get(i11);
        if (beautySmoothFilter == null) {
            if (i11 == 0) {
                beautySmoothFilter = new BeautySmoothFilter();
            } else if (i11 != 1) {
                beautySmoothFilter = i11 != 2 ? new BeautyBrightFilter() : new BeautyPITUFilter();
            } else {
                beautySmoothFilter = new BeautyVagueFilter();
            }
            beautySmoothFilter.initialize(this.mTexturePool);
            Size size2 = this.mOutputSize;
            beautySmoothFilter.onOutputSizeChanged(size2.width, size2.height);
            this.mBeautyFilters.put(i11, beautySmoothFilter);
        }
        BeautyInterFace beautyInterFace = (BeautyInterFace) beautySmoothFilter;
        beautyInterFace.setBeautyLevel(f11);
        beautyInterFace.setRuddyLevel(f13);
        beautyInterFace.setWhitenessLevel(f12);
        beautyInterFace.setSharpenLevel(f14);
        if (this.mBeautyStyle == i11 && FloatUtils.isEqual(this.mBeautyLevel, f11) && FloatUtils.isEqual(this.mWhitenessLevel, f12) && FloatUtils.isEqual(this.mRuddyLevel, f13) && FloatUtils.isEqual(this.mSharpnessLevel, f14)) {
            return;
        }
        this.mBeautyStyle = i11;
        this.mBeautyLevel = f11;
        this.mWhitenessLevel = f12;
        this.mRuddyLevel = f13;
        this.mSharpnessLevel = f14;
        removeAllFilterAndInterceptor();
        this.mCurrentBeautyFilter = null;
        if (!isLessOrEqualZero(this.mBeautyLevel) || !isLessOrEqualZero(this.mRuddyLevel) || !isLessOrEqualZero(this.mWhitenessLevel)) {
            addFilter(beautySmoothFilter);
            this.mCurrentBeautyFilter = beautySmoothFilter;
        }
        addFilter(this.mMotionFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateStatsInternal(String str, float f11) {
        this.mBeautyStats.put(str, String.valueOf(f11));
        if (this.mBeautyManagerStatusListener == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : this.mBeautyStats.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(C33844oi.f71346o);
            sb2.append(entry.getValue());
            sb2.append(C33627eb.f69716f);
        }
        this.mBeautyManagerStatusListener.onBeautyStatsChanged("{" + ((Object) sb2) + "}");
    }

    public void setBeautyManagerStatusListener(BeautyProcessorStatusListener beautyProcessorStatusListener) {
        this.mBeautyManagerStatusListener = beautyProcessorStatusListener;
    }

    public void setHomeOrientation(int i11) {
        this.mMotionFilter.setHomeOrientation(i11);
    }

    public void setPerformanceMode(boolean z11) {
        LiteavLog.m76079d(TAG, "setPerformanceMode: ".concat(String.valueOf(z11)));
        runOnDraw(RunnableC35763d.m79253a(this, z11));
    }

    public BeautyProcessor(Context context, boolean z11) {
        this.mIsEnterPriseProEnabled = z11;
        this.mMotionFilter = TXCBuildsUtil.createMotionFilter(context);
    }

    private void updateSharpenLevelInternal() {
        float sharpnessLevel = getSharpnessLevel();
        LiteavLog.m76079d(TAG, "sharpnessLevel: ".concat(String.valueOf(sharpnessLevel)));
        updateBeautyInternal(this.mBeautyStyle, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mMotionFilter.initialize(gLTexturePool);
        int i11 = this.mBeautyStyle;
        if (i11 == -1) {
            i11 = 0;
        }
        updateBeautyInternal(i11, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, this.mSharpnessLevel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        int i13;
        super.onOutputSizeChanged(i11, i12);
        this.mMotionFilter.onOutputSizeChanged(i11, i12);
        float sharpnessLevel = getSharpnessLevel();
        for (int i14 = 0; i14 < this.mBeautyFilters.size(); i14++) {
            TXCGPUImageFilter tXCGPUImageFilterValueAt = this.mBeautyFilters.valueAt(i14);
            tXCGPUImageFilterValueAt.onOutputSizeChanged(i11, i12);
            if (tXCGPUImageFilterValueAt instanceof BeautyInterFace) {
                ((BeautyInterFace) tXCGPUImageFilterValueAt).setSharpenLevel(sharpnessLevel);
            }
        }
        int i15 = this.mBeautyStyle;
        if (i15 == -1) {
            i13 = 0;
        } else {
            i13 = i15;
        }
        updateBeautyInternal(i13, this.mBeautyLevel, this.mWhitenessLevel, this.mRuddyLevel, sharpnessLevel);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        this.mMotionFilter.uninitialize();
        for (int i11 = 0; i11 < this.mBeautyFilters.size(); i11++) {
            this.mBeautyFilters.valueAt(i11).uninitialize();
        }
    }

    public void updateStatsOnDraw(String str, int i11) {
        runOnDraw(RunnableC35762c.m79252a(this, str, i11));
    }
}
