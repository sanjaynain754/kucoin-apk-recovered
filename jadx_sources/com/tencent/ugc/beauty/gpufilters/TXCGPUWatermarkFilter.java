package com.tencent.ugc.beauty.gpufilters;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class TXCGPUWatermarkFilter extends TXCGPUImageFilter {
    protected static final short[] DRAW_ORDER;
    protected static final ShortBuffer DRAW_ORDER_BUFFER;
    private static final String TAG = "TXCGPUWatermarkFilter";
    private static final float[] TEXTURE_COORDS;
    protected static final FloatBuffer TEXTURE_COORDS_BUFFER;
    private static final float[] VERTICES_COORDS = new float[8];
    private int mBaseMarkOffset;
    private WatermarkRenderObject mBaseWaterMark;
    protected boolean mDrawWaterMarkEnabled;
    public WatermarkRenderObject[] mRenderObjects;
    protected int mSrcBlendMode;
    protected List<WatermarkItem> mWaterMarkList;
    private WatermarkItem mWatermark;

    public static class WatermarkRenderObject {
        public Bitmap bitmap;
        public FloatBuffer vertexCoordsBuffer = null;
        public int textureId = -1;

        public void releaseResource() {
            this.bitmap = null;
            OpenGlUtils.deleteTexture(this.textureId);
            this.textureId = -1;
        }
    }

    static {
        short[] sArr = {1, 2, 0, 2, 0, 3};
        DRAW_ORDER = sArr;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f};
        TEXTURE_COORDS = fArr;
        TEXTURE_COORDS_BUFFER = (FloatBuffer) ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).asReadOnlyBuffer().position(0);
        DRAW_ORDER_BUFFER = (ShortBuffer) ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr).asReadOnlyBuffer().position(0);
    }

    public TXCGPUWatermarkFilter() {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, TXCGPUImageFilter.NO_FILTER_FRAGMENT_SHADER);
    }

    private void setWatermark(Bitmap bitmap, float f11, float f12, float f13, int i11) {
        Bitmap bitmap2;
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || i11 >= watermarkRenderObjectArr.length || watermarkRenderObjectArr[i11] == null) {
            LiteavLog.m76083e(TAG, "index is too large for mRenderObjects!");
            return;
        }
        if (bitmap == null) {
            LiteavLog.m76088i(TAG, "release %d watermark!", Integer.valueOf(i11));
            this.mRenderObjects[i11].releaseResource();
            this.mRenderObjects[i11] = null;
            return;
        }
        calculateOffsetMatrix(bitmap.getWidth(), bitmap.getHeight(), f11, f12, f13, i11);
        WatermarkRenderObject watermarkRenderObject = this.mRenderObjects[i11];
        Bitmap bitmap3 = watermarkRenderObject.bitmap;
        if (bitmap3 == null || !bitmap3.equals(bitmap)) {
            if (watermarkRenderObject.textureId != -1 && (bitmap2 = watermarkRenderObject.bitmap) != null && (bitmap2.getWidth() != bitmap.getWidth() || watermarkRenderObject.bitmap.getHeight() != bitmap.getHeight())) {
                OpenGlUtils.deleteTexture(watermarkRenderObject.textureId);
                watermarkRenderObject.textureId = -1;
            }
            watermarkRenderObject.textureId = OpenGlUtils.loadTexture(bitmap, watermarkRenderObject.textureId, false);
        }
        watermarkRenderObject.bitmap = bitmap;
    }

    public TXCGPUWatermarkFilter(String str, String str2) {
        super(str, str2);
        this.mRenderObjects = null;
        this.mBaseWaterMark = null;
        this.mWaterMarkList = null;
        this.mDrawWaterMarkEnabled = false;
        this.mSrcBlendMode = 1;
        this.mBaseMarkOffset = 1;
        this.mWatermark = null;
    }

    private void releaseWaterMark() {
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || watermarkRenderObjectArr.length == 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            WatermarkRenderObject[] watermarkRenderObjectArr2 = this.mRenderObjects;
            if (i11 >= watermarkRenderObjectArr2.length) {
                this.mRenderObjects = null;
                return;
            }
            WatermarkRenderObject watermarkRenderObject = watermarkRenderObjectArr2[i11];
            if (watermarkRenderObject != null) {
                watermarkRenderObject.releaseResource();
                this.mRenderObjects[i11] = null;
            }
            i11++;
        }
    }

    public void calculateOffsetMatrix(int i11, int i12, float f11, float f12, float f13, int i13) {
        WatermarkRenderObject watermarkRenderObject;
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr == null || i13 >= watermarkRenderObjectArr.length || (watermarkRenderObject = watermarkRenderObjectArr[i13]) == null) {
            LiteavLog.m76085e(TAG, "calculateOffsetMatrix,index[%d],mRenderObjects=%s", Integer.valueOf(i13), Arrays.toString(this.mRenderObjects));
            return;
        }
        float[] fArr = VERTICES_COORDS;
        watermarkRenderObject.vertexCoordsBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        float[] fArr2 = new float[fArr.length];
        float f14 = (f11 * 2.0f) - 1.0f;
        fArr2[0] = f14;
        float f15 = 1.0f - (f12 * 2.0f);
        fArr2[1] = f15;
        fArr2[2] = f14;
        float f16 = (i12 / i11) * f13;
        Size size = this.mOutputSize;
        float f17 = f15 - (((f16 * size.width) / size.height) * 2.0f);
        fArr2[3] = f17;
        float f18 = f14 + (f13 * 2.0f);
        fArr2[4] = f18;
        fArr2[5] = f17;
        fArr2[6] = f18;
        fArr2[7] = f15;
        for (int i14 = 1; i14 <= 7; i14 += 2) {
            fArr2[i14] = fArr2[i14] * (-1.0f);
        }
        this.mRenderObjects[i13].vertexCoordsBuffer.put(fArr2).position(0);
    }

    public void enableWatermark(boolean z11) {
        this.mDrawWaterMarkEnabled = z11;
    }

    public void setWaterMarkList(List<WatermarkItem> list) {
        List<WatermarkItem> list2 = this.mWaterMarkList;
        if (list2 != null && compareWaterMarkList(list2, list)) {
            LiteavLog.m76087i(TAG, "Same markList");
            return;
        }
        this.mWaterMarkList = list;
        if (this.mRenderObjects != null) {
            int i11 = this.mBaseMarkOffset;
            while (true) {
                WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
                if (i11 >= watermarkRenderObjectArr.length) {
                    break;
                }
                OpenGlUtils.deleteTexture(watermarkRenderObjectArr[i11].textureId);
                this.mRenderObjects[i11].textureId = -1;
                i11++;
            }
        }
        WatermarkRenderObject[] watermarkRenderObjectArr2 = new WatermarkRenderObject[list.size() + this.mBaseMarkOffset];
        this.mRenderObjects = watermarkRenderObjectArr2;
        watermarkRenderObjectArr2[0] = this.mBaseWaterMark;
        for (int i12 = 0; i12 < list.size(); i12++) {
            WatermarkItem watermarkItem = list.get(i12);
            if (watermarkItem != null) {
                this.mRenderObjects[this.mBaseMarkOffset + i12] = new WatermarkRenderObject();
                setWatermark(watermarkItem.bitmap, watermarkItem.xOffset, watermarkItem.yOffset, watermarkItem.fWidth, i12 + this.mBaseMarkOffset);
            }
        }
    }

    private boolean compareWaterMarkList(List<WatermarkItem> list, List<WatermarkItem> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            WatermarkItem watermarkItem = list.get(i11);
            WatermarkItem watermarkItem2 = list2.get(i11);
            if (!watermarkItem.bitmap.equals(watermarkItem2.bitmap) || watermarkItem.xOffset != watermarkItem2.xOffset || watermarkItem.yOffset != watermarkItem2.yOffset || watermarkItem.fWidth != watermarkItem2.fWidth) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void afterDrawArrays() {
        super.afterDrawArrays();
        if (!this.mDrawWaterMarkEnabled) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(this.mSrcBlendMode, 771);
        int i11 = 0;
        while (true) {
            WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
            if (i11 < watermarkRenderObjectArr.length) {
                if (watermarkRenderObjectArr[i11] != null) {
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.mRenderObjects[i11].textureId);
                    GLES20.glUniform1i(this.mGLUniformTexture, 0);
                    GLES20.glVertexAttribPointer(this.mGLAttribPosition, 2, 5126, false, 8, (Buffer) this.mRenderObjects[i11].vertexCoordsBuffer);
                    GLES20.glEnableVertexAttribArray(this.mGLAttribPosition);
                    GLES20.glVertexAttribPointer(this.mGLAttribTextureCoord, 2, 5126, false, 0, (Buffer) TEXTURE_COORDS_BUFFER);
                    GLES20.glEnableVertexAttribArray(this.mGLAttribTextureCoord);
                    GLES20.glDrawElements(4, DRAW_ORDER.length, 5123, DRAW_ORDER_BUFFER);
                    GLES20.glDisableVertexAttribArray(this.mGLAttribPosition);
                    GLES20.glDisableVertexAttribArray(this.mGLAttribTextureCoord);
                }
                i11++;
            } else {
                GLES20.glDisable(3042);
                return;
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onInit(GLTexturePool gLTexturePool) {
        super.onInit(gLTexturePool);
        WatermarkItem watermarkItem = this.mWatermark;
        if (watermarkItem != null) {
            setWatermark(watermarkItem.bitmap, watermarkItem.xOffset, watermarkItem.yOffset, watermarkItem.fWidth);
        }
        List<WatermarkItem> list = this.mWaterMarkList;
        if (list != null) {
            setWaterMarkList(list);
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onOutputSizeChanged(int i11, int i12) {
        Bitmap bitmap;
        Bitmap bitmap2;
        super.onOutputSizeChanged(i11, i12);
        if (this.mRenderObjects != null) {
            WatermarkItem watermarkItem = this.mWatermark;
            if (watermarkItem != null && (bitmap2 = watermarkItem.bitmap) != null) {
                int width = bitmap2.getWidth();
                int height = this.mWatermark.bitmap.getHeight();
                WatermarkItem watermarkItem2 = this.mWatermark;
                calculateOffsetMatrix(width, height, watermarkItem2.xOffset, watermarkItem2.yOffset, watermarkItem2.fWidth, 0);
            }
            if (this.mWaterMarkList != null) {
                for (int i13 = 0; i13 < this.mWaterMarkList.size(); i13++) {
                    WatermarkItem watermarkItem3 = this.mWaterMarkList.get(i13);
                    if (watermarkItem3 != null && (bitmap = watermarkItem3.bitmap) != null) {
                        calculateOffsetMatrix(bitmap.getWidth(), watermarkItem3.bitmap.getHeight(), watermarkItem3.xOffset, watermarkItem3.yOffset, watermarkItem3.fWidth, this.mBaseMarkOffset + i13);
                    }
                }
            }
        }
    }

    @Override // com.tencent.ugc.videobase.chain.TXCGPUImageFilter
    public void onUninit() {
        super.onUninit();
        releaseWaterMark();
    }

    public void setWatermark(Bitmap bitmap, float f11, float f12, float f13) {
        if (this.mRenderObjects == null) {
            this.mRenderObjects = new WatermarkRenderObject[1];
        }
        WatermarkRenderObject[] watermarkRenderObjectArr = this.mRenderObjects;
        if (watermarkRenderObjectArr[0] == null) {
            watermarkRenderObjectArr[0] = new WatermarkRenderObject();
        }
        setWatermark(bitmap, f11, f12, f13, 0);
        this.mBaseWaterMark = this.mRenderObjects[0];
        if (bitmap == null) {
            this.mWatermark = null;
            return;
        }
        if (this.mWatermark == null) {
            this.mWatermark = new WatermarkItem();
        }
        WatermarkItem watermarkItem = this.mWatermark;
        watermarkItem.bitmap = bitmap;
        watermarkItem.xOffset = f11;
        watermarkItem.yOffset = f12;
        watermarkItem.fWidth = f13;
    }
}
