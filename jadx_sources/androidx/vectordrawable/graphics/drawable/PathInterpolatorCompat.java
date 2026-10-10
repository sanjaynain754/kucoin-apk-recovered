package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes34.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;

    /* JADX INFO: renamed from: mX */
    private float[] f3682mX;

    /* JADX INFO: renamed from: mY */
    private float[] f3683mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 <= 0.0f) {
            return 0.0f;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f3682mX.length - 1;
        int i11 = 0;
        while (length - i11 > 1) {
            int i12 = (i11 + length) / 2;
            if (f11 < this.f3682mX[i12]) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        float[] fArr = this.f3682mX;
        float f12 = fArr[length];
        float f13 = fArr[i11];
        float f14 = f12 - f13;
        if (f14 == 0.0f) {
            return this.f3683mY[i11];
        }
        float f15 = (f11 - f13) / f14;
        float[] fArr2 = this.f3683mY;
        float f16 = fArr2[i11];
        return f16 + (f15 * (fArr2[length] - f16));
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(typedArrayObtainAttributes, xmlPullParser);
        typedArrayObtainAttributes.recycle();
    }

    private void initCubic(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f11, f12, f13, f14, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i11 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f3682mX = new float[iMin];
        this.f3683mY = new float[iMin];
        float[] fArr = new float[2];
        for (int i12 = 0; i12 < iMin; i12++) {
            pathMeasure.getPosTan((i12 * length) / (iMin - 1), fArr, null);
            this.f3682mX[i12] = fArr[0];
            this.f3683mY[i12] = fArr[1];
        }
        if (Math.abs(this.f3682mX[0]) <= 1.0E-5d && Math.abs(this.f3683mY[0]) <= 1.0E-5d) {
            int i13 = iMin - 1;
            if (Math.abs(this.f3682mX[i13] - 1.0f) <= 1.0E-5d && Math.abs(this.f3683mY[i13] - 1.0f) <= 1.0E-5d) {
                float f11 = 0.0f;
                int i14 = 0;
                while (i11 < iMin) {
                    float[] fArr2 = this.f3682mX;
                    int i15 = i14 + 1;
                    float f12 = fArr2[i14];
                    if (f12 < f11) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f12);
                    }
                    fArr2[i11] = f12;
                    i11++;
                    f11 = f12;
                    i14 = i15;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb2.append(this.f3682mX[0]);
        sb2.append(",");
        sb2.append(this.f3683mY[0]);
        sb2.append(" end:");
        int i16 = iMin - 1;
        sb2.append(this.f3682mX[i16]);
        sb2.append(",");
        sb2.append(this.f3683mY[i16]);
        throw new IllegalArgumentException(sb2.toString());
    }

    private void initQuad(float f11, float f12) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f11, f12, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path pathCreatePathFromPathData = PathParser.createPathFromPathData(namedString);
            if (pathCreatePathFromPathData != null) {
                initPath(pathCreatePathFromPathData);
                return;
            }
            throw new InflateException("The path is null, which is created from " + namedString);
        }
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
                float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
                float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
                boolean zHasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
                if (zHasAttribute == TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
                    if (!zHasAttribute) {
                        initQuad(namedFloat, namedFloat2);
                        return;
                    } else {
                        initCubic(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
                        return;
                    }
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }
}
