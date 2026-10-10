package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.liteav.base.util.C34744i;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.filter.TXCGPUImagePerspectiveCorrectionFilter;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PostProcessor {
    private final GLTexturePool mGLTexturePool;
    private boolean mNeedUpdatePerspectivePointsToFilter;
    private FloatBuffer mNormalCubeVerticesBuffer;
    private FloatBuffer mNormalTextureCoordsBuffer;
    private final Size mOutputSize;
    private List<PointF> mPerspectiveCorrectionDstViewPoints;
    private TXCGPUImagePerspectiveCorrectionFilter mPerspectiveCorrectionFilter;
    private List<PointF> mPerspectiveCorrectionSrcViewPoints;
    private PixelFrameRenderer mPixelFrameRender;
    private Matrix mRenderViewTransformMatrix;
    private final String mTAG = "PostProcessor_" + hashCode();

    private static PointF reversePointWithTransformMatrix(PointF pointF, Matrix matrix) {
        if (matrix != null) {
            Matrix matrix2 = new Matrix();
            if (matrix.invert(matrix2)) {
                float[] fArr = new float[2];
                matrix2.mapPoints(fArr, new float[]{pointF.x, pointF.y});
                return new PointF(fArr[0], fArr[1]);
            }
        }
        return pointF;
    }

    private void initializePerspectiveCorrectionFilter() {
        if (this.mPerspectiveCorrectionFilter != null) {
            return;
        }
        TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter = new TXCGPUImagePerspectiveCorrectionFilter();
        this.mPerspectiveCorrectionFilter = tXCGPUImagePerspectiveCorrectionFilter;
        tXCGPUImagePerspectiveCorrectionFilter.initialize(this.mGLTexturePool);
        if (this.mNormalCubeVerticesBuffer == null || this.mNormalTextureCoordsBuffer == null) {
            this.mNormalCubeVerticesBuffer = OpenGlUtils.createNormalCubeVerticesBuffer();
            this.mNormalTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
        }
    }

    private List<PointF> reverseViewPointsToMappingGLPoints(List<PointF> list) {
        ArrayList arrayList = new ArrayList();
        for (PointF pointF : list) {
            float f11 = pointF.x;
            Size size = this.mOutputSize;
            PointF pointFReversePointWithTransformMatrix = reversePointWithTransformMatrix(new PointF(f11 * size.width, pointF.y * size.height), this.mRenderViewTransformMatrix);
            float f12 = pointFReversePointWithTransformMatrix.x;
            Size size2 = this.mOutputSize;
            PointF pointF2 = new PointF(f12 / size2.width, pointFReversePointWithTransformMatrix.y / size2.height);
            pointF2.y = 1.0f - pointF2.y;
            arrayList.add(pointF2);
        }
        return arrayList;
    }

    private void setPerspectivePointsToFilter(List<PointF> list, List<PointF> list2) {
        if (list == null || list.size() != 4 || list2 == null || list2.size() != 4 || !this.mOutputSize.isValid() || this.mPerspectiveCorrectionFilter == null) {
            return;
        }
        this.mPerspectiveCorrectionFilter.setPerspectiveCorrectionPoints(reverseViewPointsToMappingGLPoints(list), reverseViewPointsToMappingGLPoints(list2));
    }

    private void uninitializePerspectiveCorrectionFilter() {
        TXCGPUImagePerspectiveCorrectionFilter tXCGPUImagePerspectiveCorrectionFilter = this.mPerspectiveCorrectionFilter;
        if (tXCGPUImagePerspectiveCorrectionFilter == null) {
            return;
        }
        tXCGPUImagePerspectiveCorrectionFilter.uninitialize();
        this.mPerspectiveCorrectionFilter = null;
    }

    private void uninitializePixelFrameRender() {
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRender;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRender = null;
        }
    }

    public void processFrame(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        if (this.mOutputSize.isValid()) {
            if (this.mPixelFrameRender == null) {
                LiteavLog.m76087i(this.mTAG, "create PixelFrameRenderer, size =" + this.mOutputSize);
                Size size = this.mOutputSize;
                this.mPixelFrameRender = new PixelFrameRenderer(size.width, size.height);
            }
            Size size2 = this.mOutputSize;
            OpenGlUtils.glViewport(0, 0, size2.width, size2.height);
            GLTexturePool gLTexturePool = this.mGLTexturePool;
            Size size3 = this.mOutputSize;
            GLTexture gLTextureObtain = gLTexturePool.obtain(size3.width, size3.height);
            gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
            PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRender;
            Size size4 = this.mOutputSize;
            pixelFrameRenderer.setOutputSize(size4.width, size4.height);
            this.mPixelFrameRender.renderFrame(pixelFrame, gLScaleType, gLTextureObtain);
            if (this.mPerspectiveCorrectionFilter == null) {
                initializePerspectiveCorrectionFilter();
            }
            if (this.mNeedUpdatePerspectivePointsToFilter) {
                setPerspectivePointsToFilter(this.mPerspectiveCorrectionSrcViewPoints, this.mPerspectiveCorrectionDstViewPoints);
                this.mNeedUpdatePerspectivePointsToFilter = false;
            }
            this.mPerspectiveCorrectionFilter.onDraw(gLTextureObtain.getId(), null, this.mNormalCubeVerticesBuffer, this.mNormalTextureCoordsBuffer);
            gLTextureObtain.release();
        }
    }

    public void setOutputSize(int i11, int i12) {
        Size size = this.mOutputSize;
        if (size.width == i11 && size.height == i12) {
            return;
        }
        size.set(i11, i12);
        this.mNeedUpdatePerspectivePointsToFilter = true;
    }

    public void setPerspectiveCorrectionPoints(List<PointF> list, List<PointF> list2) {
        this.mPerspectiveCorrectionSrcViewPoints = list;
        this.mPerspectiveCorrectionDstViewPoints = list2;
        this.mNeedUpdatePerspectivePointsToFilter = true;
    }

    public void setRenderViewTransformMatrix(Matrix matrix) {
        if (C34744i.m76117a(this.mRenderViewTransformMatrix, matrix)) {
            return;
        }
        this.mRenderViewTransformMatrix = matrix;
        this.mNeedUpdatePerspectivePointsToFilter = true;
    }

    public PostProcessor(GLTexturePool gLTexturePool, int i11, int i12) {
        Size size = new Size();
        this.mOutputSize = size;
        this.mNeedUpdatePerspectivePointsToFilter = false;
        this.mGLTexturePool = gLTexturePool;
        size.set(i11, i12);
    }

    public void uninitialize() {
        uninitializePixelFrameRender();
        uninitializePerspectiveCorrectionFilter();
    }
}
