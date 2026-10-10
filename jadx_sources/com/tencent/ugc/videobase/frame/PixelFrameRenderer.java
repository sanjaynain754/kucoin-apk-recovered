package com.tencent.ugc.videobase.frame;

import android.opengl.GLES20;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImageOESInputFilter;
import com.tencent.ugc.videobase.filter.TXCGPUImageRGBAInputFilter;
import com.tencent.ugc.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.yuv.TXCGPUImageI420InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageNV12InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageNV21InputFilter;
import com.tencent.ugc.videobase.yuv.TXCGPUImageYUVInputFilter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class PixelFrameRenderer {
    private static final String TAG = "PixelFrameRenderer";
    private final FloatBuffer mCubeVerticesBuffer;
    private GLFrameBuffer mFrameBufferForClear;
    private final FloatBuffer mInputTextureCoordsBuffer;
    private int mOutFrameHeight;
    private int mOutFrameWidth;
    private GLConstants.GLScaleType mScaleType;
    private static final float[] OES_TEXTURE_COORDS_NO_ROTATION = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATE_RIGHT = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATE_LEFT = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    private static final float[] OES_TEXTURE_COORDS_ROTATED_180 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    private final TXCGPUImageFilter[] mRawDataInputFilter = new TXCGPUImageFilter[GLConstants.PixelFormatType.values().length];
    private PixelFrame mFrameParams = null;
    private TXCGPUImageOESInputFilter mOesInputFilter = null;
    private TXCGPUImageFilter mNormalFilter = null;

    private float addDistance(float f11, float f12) {
        return f11 == 0.0f ? f12 : 1.0f - f12;
    }

    private static float flip(float f11) {
        return f11 == 0.0f ? 1.0f : 0.0f;
    }

    public void uninitialize() {
        this.mFrameParams = null;
        destroyGLComponents();
    }

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.frame.PixelFrameRenderer$1 */
    public static /* synthetic */ class C358211 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77367a;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f77367a = iArr;
            try {
                iArr[EnumC34747l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77367a[EnumC34747l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77367a[EnumC34747l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77367a[EnumC34747l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void clearTexture(GLTexture gLTexture) {
        if (this.mFrameBufferForClear == null) {
            GLFrameBuffer gLFrameBuffer = new GLFrameBuffer();
            this.mFrameBufferForClear = gLFrameBuffer;
            gLFrameBuffer.initialize();
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        if (gLTexture == null) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClear(16640);
            return;
        }
        this.mFrameBufferForClear.attachTexture(gLTexture.getId());
        this.mFrameBufferForClear.bindToContext();
        GLES20.glClear(16640);
        this.mFrameBufferForClear.unbindFromContext();
        this.mFrameBufferForClear.detachTexture();
    }

    private void destroyGLComponents() {
        TXCGPUImageOESInputFilter tXCGPUImageOESInputFilter = this.mOesInputFilter;
        if (tXCGPUImageOESInputFilter != null) {
            tXCGPUImageOESInputFilter.uninitialize();
            this.mOesInputFilter = null;
        }
        TXCGPUImageFilter tXCGPUImageFilter = this.mNormalFilter;
        if (tXCGPUImageFilter != null) {
            tXCGPUImageFilter.uninitialize();
            this.mNormalFilter = null;
        }
        GLFrameBuffer gLFrameBuffer = this.mFrameBufferForClear;
        if (gLFrameBuffer != null) {
            gLFrameBuffer.uninitialize();
            this.mFrameBufferForClear = null;
        }
        int i11 = 0;
        while (true) {
            TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
            if (i11 >= tXCGPUImageFilterArr.length) {
                LiteavLog.m76087i(TAG, "uninitialize GL components");
                return;
            }
            TXCGPUImageFilter tXCGPUImageFilter2 = tXCGPUImageFilterArr[i11];
            if (tXCGPUImageFilter2 != null) {
                tXCGPUImageFilter2.uninitialize();
                this.mRawDataInputFilter[i11] = null;
            }
            i11++;
        }
    }

    private void initNormalFilter() {
        if (this.mNormalFilter != null) {
            return;
        }
        TXCGPUImageFilter tXCGPUImageFilter = new TXCGPUImageFilter();
        this.mNormalFilter = tXCGPUImageFilter;
        tXCGPUImageFilter.initialize(null);
    }

    private static void initOESTextureCoordsBuffer(float[] fArr, EnumC34747l enumC34747l, boolean z11, boolean z12) {
        float[] fArr2 = OES_TEXTURE_COORDS_NO_ROTATION;
        if (enumC34747l != null) {
            int i11 = C358211.f77367a[enumC34747l.ordinal()];
            if (i11 == 1) {
                fArr2 = OES_TEXTURE_COORDS_ROTATE_RIGHT;
            } else if (i11 == 2) {
                fArr2 = OES_TEXTURE_COORDS_ROTATED_180;
            } else if (i11 == 3) {
                fArr2 = OES_TEXTURE_COORDS_ROTATE_LEFT;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z11) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z12) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    private boolean isIncompatible(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType) {
        return (gLScaleType == this.mScaleType && pixelFrame.getWidth() == this.mFrameParams.getWidth() && pixelFrame.getHeight() == this.mFrameParams.getHeight() && pixelFrame.getPixelBufferType() == this.mFrameParams.getPixelBufferType() && pixelFrame.getPixelFormatType() == this.mFrameParams.getPixelFormatType() && pixelFrame.isMirrorHorizontal() == this.mFrameParams.isMirrorHorizontal() && pixelFrame.isMirrorVertical() == this.mFrameParams.isMirrorVertical() && pixelFrame.getRotation() == this.mFrameParams.getRotation()) ? false : true;
    }

    private void recalcCubeAndTextureCoordinates() {
        PixelFrame pixelFrame = this.mFrameParams;
        if (pixelFrame == null) {
            return;
        }
        boolean z11 = pixelFrame.getRotation() == EnumC34747l.ROTATION_90 || this.mFrameParams.getRotation() == EnumC34747l.ROTATION_270;
        float width = this.mFrameParams.getWidth();
        float height = this.mFrameParams.getHeight();
        float fMax = Math.max((this.mOutFrameWidth * 1.0f) / width, (this.mOutFrameHeight * 1.0f) / height);
        float fRound = (Math.round(width * fMax) * 1.0f) / this.mOutFrameWidth;
        float fRound2 = (Math.round(height * fMax) * 1.0f) / this.mOutFrameHeight;
        float[] fArr = GLConstants.f74126d;
        float[] fArr2 = new float[8];
        if (this.mFrameParams.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES) {
            initOESTextureCoordsBuffer(fArr2, this.mFrameParams.getRotation(), this.mFrameParams.isMirrorHorizontal(), this.mFrameParams.isMirrorVertical());
        } else {
            OpenGlUtils.initTextureCoordsBuffer(fArr2, this.mFrameParams.getRotation(), this.mFrameParams.isMirrorHorizontal(), this.mFrameParams.isMirrorVertical());
        }
        GLConstants.GLScaleType gLScaleType = this.mScaleType;
        if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
            float f11 = (1.0f - (z11 ? 1.0f / fRound2 : 1.0f / fRound)) / 2.0f;
            float f12 = (1.0f - (z11 ? 1.0f / fRound : 1.0f / fRound2)) / 2.0f;
            fArr2[0] = addDistance(fArr2[0], f11);
            fArr2[1] = addDistance(fArr2[1], f12);
            fArr2[2] = addDistance(fArr2[2], f11);
            fArr2[3] = addDistance(fArr2[3], f12);
            fArr2[4] = addDistance(fArr2[4], f11);
            fArr2[5] = addDistance(fArr2[5], f12);
            fArr2[6] = addDistance(fArr2[6], f11);
            fArr2[7] = addDistance(fArr2[7], f12);
        } else if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            fArr = new float[]{fArr[0] / fRound2, fArr[1] / fRound, fArr[2] / fRound2, fArr[3] / fRound, fArr[4] / fRound2, fArr[5] / fRound, fArr[6] / fRound2, fArr[7] / fRound};
        }
        this.mCubeVerticesBuffer.clear();
        this.mCubeVerticesBuffer.put(fArr).position(0);
        this.mInputTextureCoordsBuffer.clear();
        this.mInputTextureCoordsBuffer.put(fArr2).position(0);
    }

    private void renderRgbaData(GLTexture gLTexture, Buffer buffer) {
        int iOrdinal = GLConstants.PixelFormatType.RGBA.ordinal();
        TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
        if (tXCGPUImageFilterArr[iOrdinal] == null) {
            tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageRGBAInputFilter();
            this.mRawDataInputFilter[iOrdinal].initialize(null);
        }
        TXCGPUImageRGBAInputFilter tXCGPUImageRGBAInputFilter = (TXCGPUImageRGBAInputFilter) this.mRawDataInputFilter[iOrdinal];
        tXCGPUImageRGBAInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        if (this.mFrameParams.getRotation() == EnumC34747l.ROTATION_90 || this.mFrameParams.getRotation() == EnumC34747l.ROTATION_270) {
            tXCGPUImageRGBAInputFilter.loadRgbaData(buffer, this.mFrameParams.getHeight(), this.mFrameParams.getWidth());
        } else {
            tXCGPUImageRGBAInputFilter.loadRgbaData(buffer, this.mFrameParams.getWidth(), this.mFrameParams.getHeight());
        }
        tXCGPUImageRGBAInputFilter.onDraw(-1, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    private void renderTextureOesInput(GLTexture gLTexture, int i11, float[] fArr) {
        if (this.mOesInputFilter == null) {
            TXCGPUImageOESInputFilter tXCGPUImageOESInputFilter = new TXCGPUImageOESInputFilter();
            this.mOesInputFilter = tXCGPUImageOESInputFilter;
            tXCGPUImageOESInputFilter.initialize(null);
        }
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        this.mOesInputFilter.setTextureTransform(fArr);
        this.mOesInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        this.mOesInputFilter.onDraw(i11, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    public Size getOutputSize() {
        return new Size(this.mOutFrameWidth, this.mOutFrameHeight);
    }

    public void renderFrame(PixelFrame pixelFrame, GLConstants.GLScaleType gLScaleType, GLTexture gLTexture) {
        if (pixelFrame == null || !pixelFrame.isFrameDataValid()) {
            LiteavLog.m76093w(TAG, "renderFrame: pixelFrame is not valid");
            return;
        }
        if (gLTexture != null) {
            gLTexture.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        }
        if (this.mFrameParams == null || isIncompatible(pixelFrame, gLScaleType)) {
            this.mScaleType = gLScaleType;
            this.mFrameParams = new PixelFrame(pixelFrame);
            destroyGLComponents();
            recalcCubeAndTextureCoordinates();
        }
        if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
            clearTexture(gLTexture);
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_BUFFER) {
            if (this.mFrameParams.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                renderYuvData(this.mFrameParams.getPixelFormatType(), gLTexture, pixelFrame.getBuffer(), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                renderRgbaData(gLTexture, pixelFrame.getBuffer());
                return;
            }
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_ARRAY) {
            if (this.mFrameParams.getPixelFormatType() != GLConstants.PixelFormatType.RGBA) {
                renderYuvData(this.mFrameParams.getPixelFormatType(), gLTexture, ByteBuffer.wrap(pixelFrame.getData()), pixelFrame.getColorRange(), pixelFrame.getColorSpace());
                return;
            } else {
                renderRgbaData(gLTexture, ByteBuffer.wrap(pixelFrame.getData()));
                return;
            }
        }
        if (this.mFrameParams.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES) {
            renderTextureOesInput(gLTexture, pixelFrame.getTextureId(), pixelFrame.getMatrix());
        } else if (this.mFrameParams.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D) {
            renderTexture2DInput(gLTexture, pixelFrame.getTextureId());
        }
    }

    public void setOutputSize(int i11, int i12) {
        if (this.mOutFrameWidth == i11 && this.mOutFrameHeight == i12) {
            return;
        }
        this.mOutFrameWidth = i11;
        this.mOutFrameHeight = i12;
        recalcCubeAndTextureCoordinates();
    }

    public PixelFrameRenderer(int i11, int i12) {
        this.mOutFrameWidth = i11;
        this.mOutFrameHeight = i12;
        float[] fArr = GLConstants.f74126d;
        this.mCubeVerticesBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr);
        this.mInputTextureCoordsBuffer = OpenGlUtils.createTextureCoordsBuffer(EnumC34747l.NORMAL, false, false);
    }

    private void renderTexture2DInput(GLTexture gLTexture, int i11) {
        initNormalFilter();
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        this.mNormalFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        this.mNormalFilter.onDraw(i11, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }

    private void renderYuvData(GLConstants.PixelFormatType pixelFormatType, GLTexture gLTexture, ByteBuffer byteBuffer, GLConstants.ColorRange colorRange, GLConstants.ColorSpace colorSpace) {
        int iOrdinal = pixelFormatType.ordinal();
        TXCGPUImageFilter[] tXCGPUImageFilterArr = this.mRawDataInputFilter;
        if (tXCGPUImageFilterArr[iOrdinal] == null) {
            if (pixelFormatType == GLConstants.PixelFormatType.I420) {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageI420InputFilter();
            } else if (pixelFormatType == GLConstants.PixelFormatType.NV21) {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageNV21InputFilter();
            } else {
                tXCGPUImageFilterArr[iOrdinal] = new TXCGPUImageNV12InputFilter();
            }
            this.mRawDataInputFilter[iOrdinal].setColorFormat(colorRange, colorSpace);
            this.mRawDataInputFilter[iOrdinal].initialize(null);
        }
        TXCGPUImageYUVInputFilter tXCGPUImageYUVInputFilter = (TXCGPUImageYUVInputFilter) this.mRawDataInputFilter[iOrdinal];
        tXCGPUImageYUVInputFilter.onOutputSizeChanged(this.mOutFrameWidth, this.mOutFrameHeight);
        OpenGlUtils.glViewport(0, 0, this.mOutFrameWidth, this.mOutFrameHeight);
        if (this.mFrameParams.getRotation() != EnumC34747l.ROTATION_90 && this.mFrameParams.getRotation() != EnumC34747l.ROTATION_270) {
            tXCGPUImageYUVInputFilter.loadYuvDataToTexture(byteBuffer, this.mFrameParams.getWidth(), this.mFrameParams.getHeight());
        } else {
            tXCGPUImageYUVInputFilter.loadYuvDataToTexture(byteBuffer, this.mFrameParams.getHeight(), this.mFrameParams.getWidth());
        }
        tXCGPUImageYUVInputFilter.onDraw(-1, gLTexture, this.mCubeVerticesBuffer, this.mInputTextureCoordsBuffer);
    }
}
