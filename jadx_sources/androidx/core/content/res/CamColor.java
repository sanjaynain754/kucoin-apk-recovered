package androidx.core.content.res;

import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.core.graphics.ColorUtils;
import p852kotlin.jvm.internal.DoubleCompanionObject;

/* JADX INFO: loaded from: classes23.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class CamColor {
    private static final float CHROMA_SEARCH_ENDPOINT = 0.4f;
    private static final float DE_MAX = 1.0f;
    private static final float DL_MAX = 0.2f;
    private static final float LIGHTNESS_SEARCH_ENDPOINT = 0.01f;
    private final float mAstar;
    private final float mBstar;
    private final float mChroma;
    private final float mHue;

    /* JADX INFO: renamed from: mJ */
    private final float f2234mJ;
    private final float mJstar;

    /* JADX INFO: renamed from: mM */
    private final float f2235mM;

    /* JADX INFO: renamed from: mQ */
    private final float f2236mQ;

    /* JADX INFO: renamed from: mS */
    private final float f2237mS;

    @Nullable
    private static CamColor findCamByJ(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, m1552to = 100.0d) float f13) {
        float f14 = 100.0f;
        float f15 = 1000.0f;
        float f16 = 0.0f;
        CamColor camColor = null;
        float f17 = 1000.0f;
        while (Math.abs(f16 - f14) > LIGHTNESS_SEARCH_ENDPOINT) {
            float f18 = ((f14 - f16) / 2.0f) + f16;
            int iViewedInSrgb = fromJch(f18, f12, f11).viewedInSrgb();
            float fLStarFromInt = CamUtils.lStarFromInt(iViewedInSrgb);
            float fAbs = Math.abs(f13 - fLStarFromInt);
            if (fAbs < 0.2f) {
                CamColor camColorFromColor = fromColor(iViewedInSrgb);
                float fDistance = camColorFromColor.distance(fromJch(camColorFromColor.getJ(), camColorFromColor.getChroma(), f11));
                if (fDistance <= 1.0f) {
                    camColor = camColorFromColor;
                    f15 = fAbs;
                    f17 = fDistance;
                }
            }
            if (f15 == 0.0f && f17 == 0.0f) {
                return camColor;
            }
            if (fLStarFromInt < f13) {
                f16 = f18;
            } else {
                f14 = f18;
            }
        }
        return camColor;
    }

    @NonNull
    public static CamColor fromColor(@ColorInt int i11) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        fromColorInViewingConditions(i11, ViewingConditions.DEFAULT, fArr, fArr2);
        return new CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static int toColor(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, m1552to = 100.0d) float f13) {
        return toColor(f11, f12, f13, ViewingConditions.DEFAULT);
    }

    public static void fromColorInViewingConditions(@ColorInt int i11, @NonNull ViewingConditions viewingConditions, @Nullable @Size(7) float[] fArr, @NonNull @Size(3) float[] fArr2) {
        CamUtils.xyzFromInt(i11, fArr2);
        float[][] fArr3 = CamUtils.XYZ_TO_CAM16RGB;
        float f11 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f12 = fArr4[0] * f11;
        float f13 = fArr2[1];
        float f14 = f12 + (fArr4[1] * f13);
        float f15 = fArr2[2];
        float f16 = f14 + (fArr4[2] * f15);
        float[] fArr5 = fArr3[1];
        float f17 = (fArr5[0] * f11) + (fArr5[1] * f13) + (fArr5[2] * f15);
        float[] fArr6 = fArr3[2];
        float f18 = (f11 * fArr6[0]) + (f13 * fArr6[1]) + (f15 * fArr6[2]);
        float f19 = viewingConditions.getRgbD()[0] * f16;
        float f21 = viewingConditions.getRgbD()[1] * f17;
        float f22 = viewingConditions.getRgbD()[2] * f18;
        float fPow = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f19))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f21))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (viewingConditions.getFl() * Math.abs(f22))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f19) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f21) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f22) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d11 = fSignum3;
        float f23 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d11)) / 11.0f;
        float f24 = ((float) (((double) (fSignum + fSignum2)) - (d11 * 2.0d))) / 9.0f;
        float f25 = fSignum2 * 20.0f;
        float f26 = (((fSignum * 20.0f) + f25) + (21.0f * fSignum3)) / 20.0f;
        float f27 = (((fSignum * 40.0f) + f25) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f24, f23)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f28 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f27 * viewingConditions.getNbb()) / viewingConditions.getAw(), viewingConditions.getC() * viewingConditions.getZ())) * 100.0f;
        float c11 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getNc()) * viewingConditions.getNcb()) * ((float) Math.sqrt((f23 * f23) + (f24 * f24)))) / (f26 + 0.305f), 0.9d));
        float fSqrt = ((float) Math.sqrt(((double) fPow4) / 100.0d)) * fPow5;
        float flRoot = viewingConditions.getFlRoot() * fSqrt;
        float fSqrt2 = ((float) Math.sqrt((fPow5 * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * flRoot) + 1.0f)) * 43.85965f;
        double d12 = f28;
        float fCos = ((float) Math.cos(d12)) * fLog;
        float fSin = fLog * ((float) Math.sin(d12));
        fArr2[0] = fAtan2;
        fArr2[1] = fSqrt;
        if (fArr != null) {
            fArr[0] = fPow4;
            fArr[1] = c11;
            fArr[2] = flRoot;
            fArr[3] = fSqrt2;
            fArr[4] = f29;
            fArr[5] = fCos;
            fArr[6] = fSin;
        }
    }

    @NonNull
    private static CamColor fromJch(@FloatRange(from = 0.0d, m1552to = 100.0d) float f11, @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, m1552to = 360.0d) float f13) {
        return fromJchInFrame(f11, f12, f13, ViewingConditions.DEFAULT);
    }

    public static void getM3HCTfromColor(@ColorInt int i11, @NonNull @Size(3) float[] fArr) {
        fromColorInViewingConditions(i11, ViewingConditions.DEFAULT, null, fArr);
        fArr[2] = CamUtils.lStarFromInt(i11);
    }

    @ColorInt
    public static int toColor(@FloatRange(from = 0.0d, m1552to = 360.0d) float f11, @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, m1552to = 100.0d) float f13, @NonNull ViewingConditions viewingConditions) {
        if (f12 < 1.0d || Math.round(f13) <= 0.0d || Math.round(f13) >= 100.0d) {
            return CamUtils.intFromLStar(f13);
        }
        float fMin = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
        CamColor camColor = null;
        boolean z11 = true;
        float f14 = 0.0f;
        float f15 = f12;
        while (Math.abs(f14 - f12) >= CHROMA_SEARCH_ENDPOINT) {
            CamColor camColorFindCamByJ = findCamByJ(fMin, f15, f13);
            if (!z11) {
                if (camColorFindCamByJ == null) {
                    f12 = f15;
                } else {
                    f14 = f15;
                    camColor = camColorFindCamByJ;
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
            } else {
                if (camColorFindCamByJ != null) {
                    return camColorFindCamByJ.viewed(viewingConditions);
                }
                f15 = ((f12 - f14) / 2.0f) + f14;
                z11 = false;
            }
        }
        return camColor == null ? CamUtils.intFromLStar(f13) : camColor.viewed(viewingConditions);
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getAStar() {
        return this.mAstar;
    }

    @FloatRange(from = DoubleCompanionObject.NEGATIVE_INFINITY, fromInclusive = false, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getBStar() {
        return this.mBstar;
    }

    @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getChroma() {
        return this.mChroma;
    }

    @FloatRange(from = 0.0d, m1552to = 360.0d, toInclusive = false)
    public float getHue() {
        return this.mHue;
    }

    @FloatRange(from = 0.0d, m1552to = 100.0d)
    public float getJ() {
        return this.f2234mJ;
    }

    @FloatRange(from = 0.0d, m1552to = 100.0d)
    public float getJStar() {
        return this.mJstar;
    }

    @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getM() {
        return this.f2235mM;
    }

    @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getQ() {
        return this.f2236mQ;
    }

    @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false)
    public float getS() {
        return this.f2237mS;
    }

    @ColorInt
    public int viewedInSrgb() {
        return viewed(ViewingConditions.DEFAULT);
    }

    public CamColor(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.mHue = f11;
        this.mChroma = f12;
        this.f2234mJ = f13;
        this.f2236mQ = f14;
        this.f2235mM = f15;
        this.f2237mS = f16;
        this.mJstar = f17;
        this.mAstar = f18;
        this.mBstar = f19;
    }

    @NonNull
    private static CamColor fromJchInFrame(@FloatRange(from = 0.0d, m1552to = 100.0d) float f11, @FloatRange(from = 0.0d, m1552to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f12, @FloatRange(from = 0.0d, m1552to = 360.0d) float f13, ViewingConditions viewingConditions) {
        double d11 = ((double) f11) / 100.0d;
        float c11 = (4.0f / viewingConditions.getC()) * ((float) Math.sqrt(d11)) * (viewingConditions.getAw() + 4.0f) * viewingConditions.getFlRoot();
        float flRoot = viewingConditions.getFlRoot() * f12;
        float fSqrt = ((float) Math.sqrt(((f12 / ((float) Math.sqrt(d11))) * viewingConditions.getC()) / (viewingConditions.getAw() + 4.0f))) * 50.0f;
        float f14 = (1.7f * f11) / ((0.007f * f11) + 1.0f);
        float fLog = ((float) Math.log((((double) flRoot) * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (3.1415927f * f13) / 180.0f;
        return new CamColor(f13, f12, f11, c11, flRoot, fSqrt, f14, ((float) Math.cos(d12)) * fLog, fLog * ((float) Math.sin(d12)));
    }

    public float distance(@NonNull CamColor camColor) {
        float jStar = getJStar() - camColor.getJStar();
        float aStar = getAStar() - camColor.getAStar();
        float bStar = getBStar() - camColor.getBStar();
        return (float) (Math.pow(Math.sqrt((jStar * jStar) + (aStar * aStar) + (bStar * bStar)), 0.63d) * 1.41d);
    }

    @ColorInt
    public int viewed(@NonNull ViewingConditions viewingConditions) {
        float chroma;
        if (getChroma() != 0.0d && getJ() != 0.0d) {
            chroma = getChroma() / ((float) Math.sqrt(((double) getJ()) / 100.0d));
        } else {
            chroma = 0.0f;
        }
        float fPow = (float) Math.pow(((double) chroma) / Math.pow(1.64d - Math.pow(0.29d, viewingConditions.getN()), 0.73d), 1.1111111111111112d);
        double hue = (getHue() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + hue) + 3.8d)) * 0.25f;
        float aw2 = viewingConditions.getAw() * ((float) Math.pow(((double) getJ()) / 100.0d, (1.0d / ((double) viewingConditions.getC())) / ((double) viewingConditions.getZ())));
        float nc2 = fCos * 3846.1538f * viewingConditions.getNc() * viewingConditions.getNcb();
        float nbb = aw2 / viewingConditions.getNbb();
        float fSin = (float) Math.sin(hue);
        float fCos2 = (float) Math.cos(hue);
        float f11 = (((0.305f + nbb) * 23.0f) * fPow) / (((nc2 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f12 = fCos2 * f11;
        float f13 = f11 * fSin;
        float f14 = nbb * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float fSignum = Math.signum(f15) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f16) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f17) * (100.0f / viewingConditions.getFl()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float f18 = fSignum / viewingConditions.getRgbD()[0];
        float f19 = fSignum2 / viewingConditions.getRgbD()[1];
        float f21 = fSignum3 / viewingConditions.getRgbD()[2];
        float[][] fArr = CamUtils.CAM16RGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f22 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f21);
        float[] fArr3 = fArr[1];
        float f23 = (fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f21);
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f22, f23, (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f21 * fArr4[2]));
    }
}
