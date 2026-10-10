package com.tencent.ugc.beauty.gpufilters.vague;

import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.beauty.gpufilters.TXCGPUSharpenFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class BeautyVagueFilter extends TXCGPUImageFilterChain implements BeautyInterFace {
    private final TXCGChannelBeautyFilter mGreenBeautyFilter;
    private final TXCGPUSharpenFilter mSharpnessFilter;
    private float mBeautyLevel = 0.0f;
    private float mWhiteLevel = 0.0f;
    private float mRuddyLevel = 0.0f;
    private float mSharpnessLevel = 0.0f;

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return this.mGreenBeautyFilter.canBeSkipped() && this.mSharpnessFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f11) {
        this.mBeautyLevel = f11;
        this.mGreenBeautyFilter.setBeautyLevel(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f11) {
        this.mRuddyLevel = f11;
        this.mGreenBeautyFilter.setRuddyLevel(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f11) {
        this.mSharpnessLevel = f11;
        this.mSharpnessFilter.setSharpness(f11 / 2.0f);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f11) {
        this.mWhiteLevel = f11;
        this.mGreenBeautyFilter.setWhitenessLevel(f11);
    }

    public BeautyVagueFilter() {
        TXCGChannelBeautyFilter tXCGChannelBeautyFilter = new TXCGChannelBeautyFilter();
        this.mGreenBeautyFilter = tXCGChannelBeautyFilter;
        TXCGPUSharpenFilter tXCGPUSharpenFilter = new TXCGPUSharpenFilter();
        this.mSharpnessFilter = tXCGPUSharpenFilter;
        addFilter(tXCGChannelBeautyFilter);
        addFilter(tXCGPUSharpenFilter);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilterChain, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mGreenBeautyFilter.setBeautyLevel(this.mBeautyLevel);
        this.mGreenBeautyFilter.setWhitenessLevel(this.mWhiteLevel);
        this.mGreenBeautyFilter.setRuddyLevel(this.mRuddyLevel);
        this.mSharpnessFilter.setSharpness(this.mSharpnessLevel / 2.0f);
    }
}
