package com.tencent.ugc.beauty.gpufilters.pitu;

import com.tencent.ugc.beauty.gpufilters.BeautyInterFace;
import com.tencent.ugc.videobase.chain.TXCGPUImageMultipleInputFilter;
import com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;

/* JADX INFO: loaded from: classes2.dex */
public class BeautyPITUFilter extends TXCGPUImageTopoSortFilter implements BeautyInterFace {
    private static final String TAG = "BeautyPITUFilter";
    private final C35532a mBorderBlurFilterHorizontal;
    private final C35532a mBorderBlurFilterVertical;
    private final TXCYTBeautyBorderFilter mBorderFilter;
    private final C35532a mSkinBlurFilterHorizontal;
    private final C35532a mSkinBlurFilterVertical;
    private final TXCYTBeautySmoothFilter mSmoothFilter;
    private float mBeautyLevel = 0.2f;
    private float mWhiteLevel = 0.2f;
    private float mRuddyLevel = 0.2f;
    private float mSharpenLevel = 0.0f;

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public boolean canBeSkipped() {
        return this.mSmoothFilter.canBeSkipped();
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setBeautyLevel(float f11) {
        this.mBeautyLevel = f11;
        this.mSmoothFilter.setBlurStrength(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setRuddyLevel(float f11) {
        this.mRuddyLevel = f11;
        this.mSmoothFilter.setRuddyStrength(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setSharpenLevel(float f11) {
        this.mSharpenLevel = f11;
        this.mSmoothFilter.setSharpenStrength(f11);
    }

    @Override // com.tencent.ugc.beauty.gpufilters.BeautyInterFace
    public void setWhitenessLevel(float f11) {
        this.mWhiteLevel = f11;
        this.mSmoothFilter.setWhitenStrength(f11);
    }

    public BeautyPITUFilter() {
        C35532a c35532a = new C35532a(true);
        this.mSkinBlurFilterVertical = c35532a;
        C35532a c35532a2 = new C35532a(false);
        this.mSkinBlurFilterHorizontal = c35532a2;
        TXCYTBeautyBorderFilter tXCYTBeautyBorderFilter = new TXCYTBeautyBorderFilter();
        this.mBorderFilter = tXCYTBeautyBorderFilter;
        TXCYTBeautySmoothFilter tXCYTBeautySmoothFilter = new TXCYTBeautySmoothFilter();
        this.mSmoothFilter = tXCYTBeautySmoothFilter;
        C35532a c35532a3 = new C35532a(true);
        this.mBorderBlurFilterVertical = c35532a3;
        C35532a c35532a4 = new C35532a(false);
        this.mBorderBlurFilterHorizontal = c35532a4;
        TXCGPUImageTopoSortFilter.Node initNode = getInitNode();
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter = createNodeFromFilter(c35532a);
        nodeCreateNodeFromFilter.setInputForOnDraw(initNode);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter2 = createNodeFromFilter(c35532a2);
        nodeCreateNodeFromFilter2.setInputForOnDraw(nodeCreateNodeFromFilter);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter3 = createNodeFromFilter(tXCYTBeautyBorderFilter);
        nodeCreateNodeFromFilter3.setInputForOnDraw(initNode);
        nodeCreateNodeFromFilter3.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter2);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter4 = createNodeFromFilter(c35532a3);
        nodeCreateNodeFromFilter4.setInputForOnDraw(nodeCreateNodeFromFilter3);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter5 = createNodeFromFilter(c35532a4);
        nodeCreateNodeFromFilter5.setInputForOnDraw(nodeCreateNodeFromFilter4);
        TXCGPUImageTopoSortFilter.Node nodeCreateNodeFromFilter6 = createNodeFromFilter(tXCYTBeautySmoothFilter);
        nodeCreateNodeFromFilter6.setInputForOnDraw(initNode);
        nodeCreateNodeFromFilter6.addExtraInput(TXCGPUImageMultipleInputFilter.SECOND_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter2);
        nodeCreateNodeFromFilter6.addExtraInput(TXCGPUImageMultipleInputFilter.THIRD_INPUT_SAMPLE2D_NAME, nodeCreateNodeFromFilter5);
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageTopoSortFilter, com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        this.mSmoothFilter.setBlurStrength(this.mBeautyLevel);
        this.mSmoothFilter.setWhitenStrength(this.mWhiteLevel);
        this.mSmoothFilter.setRuddyStrength(this.mRuddyLevel);
        this.mSmoothFilter.setSharpenStrength(this.mSharpenLevel);
    }
}
