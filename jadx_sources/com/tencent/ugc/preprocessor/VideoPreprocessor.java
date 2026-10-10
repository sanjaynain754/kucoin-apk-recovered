package com.tencent.ugc.preprocessor;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.FrameMetaData;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.videobase.ConvertParams;

/* JADX INFO: loaded from: classes2.dex */
public class VideoPreprocessor {
    private final String TAG = "VideoPreprocessor_" + hashCode();
    private final SparseArray<ConvertParams> mConvertParamsList = new SparseArray<>();
    private final GPUPreprocessor mPreprocessor;

    public synchronized void processFrame(PixelFrame pixelFrame) {
        PixelFrame pixelFrame2 = new PixelFrame(pixelFrame);
        applyMetaData(pixelFrame2);
        this.mPreprocessor.processFrame(pixelFrame2, getScaleTypeFromMetaData(pixelFrame2));
    }

    private void recalculateProcessSizeInternal() {
        if (this.mConvertParamsList.size() == 0) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < this.mConvertParamsList.size(); i13++) {
            ConvertParams convertParamsValueAt = this.mConvertParamsList.valueAt(i13);
            EnumC34747l enumC34747l = convertParamsValueAt.rotation;
            boolean z11 = enumC34747l == EnumC34747l.ROTATION_90 || enumC34747l == EnumC34747l.ROTATION_270;
            int i14 = z11 ? convertParamsValueAt.height : convertParamsValueAt.width;
            int i15 = z11 ? convertParamsValueAt.width : convertParamsValueAt.height;
            if (i11 * i15 != i12 * i14) {
                LiteavLog.m76094w(this.TAG, "video preprocessor has different w/h ratio: %dx%d vs %dx%d", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15));
            }
            if (i14 * i15 > i11 * i12) {
                i12 = i15;
                i11 = i14;
            }
        }
        this.mPreprocessor.setProcessSize(i11, i12);
    }

    public BeautyProcessor getBeautyProcessor() {
        return this.mPreprocessor.getBeautyProcessor();
    }

    public void registerVideoProcessedListener(int i11, ConvertParams convertParams, GLConstants.EnumC34866a enumC34866a, GLConstants.PixelFormatType pixelFormatType, boolean z11, VideoPreprocessorListener videoPreprocessorListener) {
        if (enumC34866a == GLConstants.EnumC34866a.TEXTURE_2D) {
            GLConstants.PixelFormatType pixelFormatType2 = GLConstants.PixelFormatType.I420;
        }
        this.mPreprocessor.registerVideoProcessedListener(i11, convertParams, enumC34866a, pixelFormatType, z11, videoPreprocessorListener);
        this.mConvertParamsList.put(i11, convertParams);
        recalculateProcessSizeInternal();
    }

    public void setFilterGroupImages(float f11, Bitmap bitmap, float f12, Bitmap bitmap2, float f13) {
        this.mPreprocessor.setFilterGroupImages(f11, bitmap, f12, bitmap2, f13);
    }

    public void setFilterMixLevel(float f11) {
        LiteavLog.m76087i(this.TAG, "setFilterMixLevel: ".concat(String.valueOf(f11)));
        this.mPreprocessor.setFilterMixLevel(f11);
    }

    public void setGaussianBlurLevel(float f11) {
        this.mPreprocessor.setGaussianBlurLevel(f11 / 4.0f);
    }

    public void uninitialize() {
        this.mPreprocessor.uninitialize();
    }

    public void unregisterVideoProcessedListener(int i11, VideoPreprocessorListener videoPreprocessorListener) {
        this.mPreprocessor.unregisterVideoProcessedListener(i11, videoPreprocessorListener);
        this.mConvertParamsList.remove(i11);
        recalculateProcessSizeInternal();
    }

    public VideoPreprocessor(Context context, BeautyProcessor beautyProcessor) {
        this.mPreprocessor = new GPUPreprocessor(context, beautyProcessor);
    }

    private void applyMetaData(PixelFrame pixelFrame) {
        FrameMetaData metaData = pixelFrame.getMetaData();
        if (metaData != null) {
            pixelFrame.setRotation(EnumC34747l.NORMAL);
            pixelFrame.postRotate(metaData.getPreprocessorRotation());
            pixelFrame.setMirrorHorizontal(metaData.isPreprocessorMirrorHorizontal());
            pixelFrame.setMirrorVertical(metaData.isPreprocessorMirrorVertical());
            Size renderSize = metaData.getRenderSize();
            if (renderSize.isValid()) {
                this.mPreprocessor.setProcessSize(renderSize.width, renderSize.height);
            }
        }
    }

    private GLConstants.GLScaleType getScaleTypeFromMetaData(PixelFrame pixelFrame) {
        FrameMetaData metaData = pixelFrame.getMetaData();
        if (metaData == null) {
            return GLConstants.GLScaleType.CENTER_CROP;
        }
        return metaData.getPreprocessorScaleType();
    }
}
