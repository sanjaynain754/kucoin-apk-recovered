package com.tencent.ugc.videobase.yuv;

/* JADX INFO: loaded from: classes2.dex */
public class TXCYUVRGBConvertMatrix {
    static final float FULL_RANGE_UV_MULTI = 0.5f;
    static final float FULL_RANGE_UV_OFFSET = 0.5019608f;
    static final float FULL_RANGE_Y_MULTI = 1.0f;
    static final float FULL_RANGE_Y_OFFSET = 0.0f;
    static final float[] TX_RGB_2_YUV_601_FULL_RANGE_MATRIX;
    static final float[] TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX;
    static final float[] TX_RGB_2_YUV_709_FULL_RANGE_MATRIX;
    static final float[] TX_RGB_2_YUV_709_VIDEO_RANGE_MATRIX;
    static final float[] T_TX_RGB_2_YUV_601_FULL_RANGE_MATRIX;
    static final float[] T_TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX;
    static final float[] T_TX_RGB_2_YUV_709_Full_RANGE_MATRIX;
    static final float[] T_TX_RGB_2_YUV_709_VIDEO_RANGE_MATRIX;
    static final float VIDEO_RANGE_UV_MULTI = 0.4392157f;
    static final float VIDEO_RANGE_UV_OFFSET = 0.5019608f;
    static final float VIDEO_RANGE_Y_MULTI = 0.85882354f;
    static final float[] TX_YUV_2_RGB_FULL_RANGE_OFFSET = {0.0f, -0.5019608f, -0.5019608f};
    static final float[] TX_YUV_2_RGB_VIDEO_RANGE_OFFSET = {-0.0627451f, -0.5019608f, -0.5019608f};
    static final float[] TX_RGB_2_YUV_FULL_RANGE_OFFSET = {0.0f, 0.5019608f, 0.5019608f};
    static final float VIDEO_RANGE_Y_OFFSET = 0.0627451f;
    static final float[] TX_RGB_2_YUV_VIDEO_RANGE_OFFSET = {VIDEO_RANGE_Y_OFFSET, 0.5019608f, 0.5019608f};
    static final float BT601_KR = 0.299f;
    static final float BT601_KB = 0.114f;
    static final float[] TX_YUV_2_RGB_601_FULL_RANGE_MATRIX = makeYUV2RGBMatrix(BT601_KR, BT601_KB, 1.0f, 2.0f);
    static final float[] TX_YUV_2_RGB_601_VIDEO_RANGE_MATRIX = makeYUV2RGBMatrix(BT601_KR, BT601_KB, 1.1643835f, 2.2767856f);
    static final float BT709_KR = 0.2126f;
    static final float BT709_KB = 0.0722f;
    static final float[] TX_YUV_2_RGB_709_FULL_RANGE_MATRIX = makeYUV2RGBMatrix(BT709_KR, BT709_KB, 1.0f, 2.0f);
    static final float[] TX_YUV_2_RGB_709_VIDEO_RANGE_MATRIX = makeYUV2RGBMatrix(BT709_KR, BT709_KB, 1.1643835f, 2.2767856f);

    static {
        float[] fArrMakeRGB2YUVMatrix = makeRGB2YUVMatrix(BT601_KR, BT601_KB, 1.0f, 0.5f);
        TX_RGB_2_YUV_601_FULL_RANGE_MATRIX = fArrMakeRGB2YUVMatrix;
        float[] fArrMakeRGB2YUVMatrix2 = makeRGB2YUVMatrix(BT601_KR, BT601_KB, VIDEO_RANGE_Y_MULTI, VIDEO_RANGE_UV_MULTI);
        TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX = fArrMakeRGB2YUVMatrix2;
        float[] fArrMakeRGB2YUVMatrix3 = makeRGB2YUVMatrix(BT709_KR, BT709_KB, 1.0f, 0.5f);
        TX_RGB_2_YUV_709_FULL_RANGE_MATRIX = fArrMakeRGB2YUVMatrix3;
        float[] fArrMakeRGB2YUVMatrix4 = makeRGB2YUVMatrix(BT709_KR, BT709_KB, VIDEO_RANGE_Y_MULTI, VIDEO_RANGE_UV_MULTI);
        TX_RGB_2_YUV_709_VIDEO_RANGE_MATRIX = fArrMakeRGB2YUVMatrix4;
        T_TX_RGB_2_YUV_601_VIDEO_RANGE_MATRIX = matrixTranspose(fArrMakeRGB2YUVMatrix2);
        T_TX_RGB_2_YUV_601_FULL_RANGE_MATRIX = matrixTranspose(fArrMakeRGB2YUVMatrix);
        T_TX_RGB_2_YUV_709_Full_RANGE_MATRIX = matrixTranspose(fArrMakeRGB2YUVMatrix3);
        T_TX_RGB_2_YUV_709_VIDEO_RANGE_MATRIX = matrixTranspose(fArrMakeRGB2YUVMatrix4);
    }

    public static float[] makeYUV2RGBMatrixInternal(float f11, float f12, float f13, float f14, float f15) {
        float f16 = -f15;
        float f17 = 1.0f - f13;
        float f18 = 1.0f - f11;
        return new float[]{f14, f14, f14, 0.0f, ((f16 * f17) * f13) / f12, f17 * f15, f15 * f18, ((f16 * f18) * f11) / f12, 0.0f};
    }

    public static float[] matrixTranspose(float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                fArr2[(i11 * 3) + i12] = fArr[(i12 * 3) + i11];
            }
        }
        return fArr2;
    }

    public static float[] makeRGB2YUVMatrix(float f11, float f12, float f13, float f14) {
        return makeRGB2YUVMatrixInternal(f11, 1.0f - (f11 + f12), f12, f13, f14);
    }

    public static float[] makeRGB2YUVMatrixInternal(float f11, float f12, float f13, float f14, float f15) {
        float f16 = -f15;
        float f17 = 1.0f - f13;
        float f18 = f14 * f12;
        float f19 = f12 * f16;
        float f21 = 1.0f - f11;
        return new float[]{f14 * f11, (f16 * f11) / f17, f15, f18, f19 / f17, f19 / f21, f14 * f13, f15, (f16 * f13) / f21};
    }

    public static float[] makeYUV2RGBMatrix(float f11, float f12, float f13, float f14) {
        return makeYUV2RGBMatrixInternal(f11, 1.0f - (f11 + f12), f12, f13, f14);
    }
}
