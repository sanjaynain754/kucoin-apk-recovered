package androidx.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes34.dex */
public class PatternPathMotion extends PathMotion {
    private Path mOriginalPatternPath;

    @NonNull
    private final Path mPatternPath;
    private final Matrix mTempMatrix;

    public PatternPathMotion() {
        Path path = new Path();
        this.mPatternPath = path;
        this.mTempMatrix = new Matrix();
        path.lineTo(1.0f, 0.0f);
        this.mOriginalPatternPath = path;
    }

    private static float distance(float f11, float f12) {
        return (float) Math.sqrt((f11 * f11) + (f12 * f12));
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f11, float f12, float f13, float f14) {
        float f15 = f13 - f11;
        float f16 = f14 - f12;
        float fDistance = distance(f15, f16);
        double dAtan2 = Math.atan2(f16, f15);
        this.mTempMatrix.setScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(dAtan2));
        this.mTempMatrix.postTranslate(f11, f12);
        Path path = new Path();
        this.mPatternPath.transform(this.mTempMatrix, path);
        return path;
    }

    @NonNull
    public Path getPatternPath() {
        return this.mOriginalPatternPath;
    }

    public void setPatternPath(@NonNull Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f13 = fArr[0];
        float f14 = fArr[1];
        if (f13 == f11 && f14 == f12) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.mTempMatrix.setTranslate(-f13, -f14);
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float fDistance = 1.0f / distance(f15, f16);
        this.mTempMatrix.postScale(fDistance, fDistance);
        this.mTempMatrix.postRotate((float) Math.toDegrees(-Math.atan2(f16, f15)));
        path.transform(this.mTempMatrix, this.mPatternPath);
        this.mOriginalPatternPath = path;
    }

    public PatternPathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.PATTERN_PATH_MOTION);
        try {
            String namedString = TypedArrayUtils.getNamedString(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (namedString != null) {
                setPatternPath(PathParser.createPathFromPathData(namedString));
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            throw new RuntimeException("pathData must be supplied for patternPathMotion");
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public PatternPathMotion(@NonNull Path path) {
        this.mPatternPath = new Path();
        this.mTempMatrix = new Matrix();
        setPatternPath(path);
    }
}
