package com.tencent.ugc.videobase.frame;

import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes2.dex */
public class FrameMetaData {
    private EnumC34747l mEncodeRotation;
    private EnumC34747l mPreprocessorRotation;
    private GLConstants.GLScaleType mPreprocessorScaleType;
    private final MirrorInfo mRenderMirror;
    private EnumC34747l mRenderRotation;
    private final Size mRenderSize;
    private boolean mIsFrontCamera = false;
    private final Size mCaptureRealFrameSize = new Size();
    private final MirrorInfo mPreprocessorMirror = new MirrorInfo();

    public Size getCaptureRealSize() {
        return this.mCaptureRealFrameSize;
    }

    public EnumC34747l getEncodeRotation() {
        return this.mEncodeRotation;
    }

    public EnumC34747l getPreprocessorRotation() {
        return this.mPreprocessorRotation;
    }

    public GLConstants.GLScaleType getPreprocessorScaleType() {
        return this.mPreprocessorScaleType;
    }

    public EnumC34747l getRenderRotation() {
        return this.mRenderRotation;
    }

    public Size getRenderSize() {
        return this.mRenderSize;
    }

    public boolean isFrontCamera() {
        return this.mIsFrontCamera;
    }

    public boolean isPreprocessorMirrorHorizontal() {
        return this.mPreprocessorMirror.isHorizontal;
    }

    public boolean isPreprocessorMirrorVertical() {
        return this.mPreprocessorMirror.isVertical;
    }

    public boolean isRenderMirrorHorizontal() {
        return this.mRenderMirror.isHorizontal;
    }

    public boolean isRenderMirrorVertical() {
        return this.mRenderMirror.isVertical;
    }

    public void setEncodeRotation(EnumC34747l enumC34747l) {
        if (enumC34747l == null) {
            return;
        }
        this.mEncodeRotation = enumC34747l;
    }

    public void setRenderRotation(EnumC34747l enumC34747l) {
        if (enumC34747l == null) {
            return;
        }
        this.mRenderRotation = enumC34747l;
    }

    public FrameMetaData() {
        EnumC34747l enumC34747l = EnumC34747l.NORMAL;
        this.mPreprocessorRotation = enumC34747l;
        this.mPreprocessorScaleType = GLConstants.GLScaleType.CENTER_CROP;
        this.mRenderMirror = new MirrorInfo();
        this.mRenderRotation = enumC34747l;
        this.mRenderSize = new Size();
        this.mEncodeRotation = enumC34747l;
    }
}
