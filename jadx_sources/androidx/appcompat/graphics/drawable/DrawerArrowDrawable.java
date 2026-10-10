package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.core.graphics.drawable.DrawableCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public class DrawerArrowDrawable extends Drawable {
    public static final int ARROW_DIRECTION_END = 3;
    public static final int ARROW_DIRECTION_LEFT = 0;
    public static final int ARROW_DIRECTION_RIGHT = 1;
    public static final int ARROW_DIRECTION_START = 2;
    private static final float ARROW_HEAD_ANGLE = (float) Math.toRadians(45.0d);
    private float mArrowHeadLength;
    private float mArrowShaftLength;
    private float mBarGap;
    private float mBarLength;
    private int mDirection;
    private float mMaxCutForBarSize;
    private final Paint mPaint;
    private final Path mPath;
    private float mProgress;
    private final int mSize;
    private boolean mSpin;
    private boolean mVerticalMirror;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ArrowDirection {
    }

    private static float lerp(float f11, float f12, float f13) {
        return f11 + ((f12 - f11) * f13);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i11 = this.mDirection;
        boolean z11 = false;
        if (i11 != 0 && (i11 == 1 || (i11 == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z11 = true;
        }
        float f11 = this.mArrowHeadLength;
        float fLerp = lerp(this.mBarLength, (float) Math.sqrt(f11 * f11 * 2.0f), this.mProgress);
        float fLerp2 = lerp(this.mBarLength, this.mArrowShaftLength, this.mProgress);
        float fRound = Math.round(lerp(0.0f, this.mMaxCutForBarSize, this.mProgress));
        float fLerp3 = lerp(0.0f, ARROW_HEAD_ANGLE, this.mProgress);
        float fLerp4 = lerp(z11 ? 0.0f : -180.0f, z11 ? 180.0f : 0.0f, this.mProgress);
        double d11 = fLerp;
        double d12 = fLerp3;
        boolean z12 = z11;
        float fRound2 = Math.round(Math.cos(d12) * d11);
        float fRound3 = Math.round(d11 * Math.sin(d12));
        this.mPath.rewind();
        float fLerp5 = lerp(this.mBarGap + this.mPaint.getStrokeWidth(), -this.mMaxCutForBarSize, this.mProgress);
        float f12 = (-fLerp2) / 2.0f;
        this.mPath.moveTo(f12 + fRound, 0.0f);
        this.mPath.rLineTo(fLerp2 - (fRound * 2.0f), 0.0f);
        this.mPath.moveTo(f12, fLerp5);
        this.mPath.rLineTo(fRound2, fRound3);
        this.mPath.moveTo(f12, -fLerp5);
        this.mPath.rLineTo(fRound2, -fRound3);
        this.mPath.close();
        canvas.save();
        float strokeWidth = this.mPaint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f13 = this.mBarGap;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f13 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f13);
        if (this.mSpin) {
            canvas.rotate(fLerp4 * (this.mVerticalMirror ^ z12 ? -1 : 1));
        } else if (z12) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.mArrowHeadLength;
    }

    public float getArrowShaftLength() {
        return this.mArrowShaftLength;
    }

    public float getBarLength() {
        return this.mBarLength;
    }

    public float getBarThickness() {
        return this.mPaint.getStrokeWidth();
    }

    @ColorInt
    public int getColor() {
        return this.mPaint.getColor();
    }

    public int getDirection() {
        return this.mDirection;
    }

    public float getGapSize() {
        return this.mBarGap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mSize;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mSize;
    }

    public final Paint getPaint() {
        return this.mPaint;
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public float getProgress() {
        return this.mProgress;
    }

    public boolean isSpinEnabled() {
        return this.mSpin;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.mPaint.getAlpha()) {
            this.mPaint.setAlpha(i11);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f11) {
        if (this.mArrowHeadLength != f11) {
            this.mArrowHeadLength = f11;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f11) {
        if (this.mArrowShaftLength != f11) {
            this.mArrowShaftLength = f11;
            invalidateSelf();
        }
    }

    public void setBarLength(float f11) {
        if (this.mBarLength != f11) {
            this.mBarLength = f11;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f11) {
        if (this.mPaint.getStrokeWidth() != f11) {
            this.mPaint.setStrokeWidth(f11);
            this.mMaxCutForBarSize = (float) (((double) (f11 / 2.0f)) * Math.cos(ARROW_HEAD_ANGLE));
            invalidateSelf();
        }
    }

    public void setColor(@ColorInt int i11) {
        if (i11 != this.mPaint.getColor()) {
            this.mPaint.setColor(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i11) {
        if (i11 != this.mDirection) {
            this.mDirection = i11;
            invalidateSelf();
        }
    }

    public void setGapSize(float f11) {
        if (f11 != this.mBarGap) {
            this.mBarGap = f11;
            invalidateSelf();
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        if (this.mProgress != f11) {
            this.mProgress = f11;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z11) {
        if (this.mSpin != z11) {
            this.mSpin = z11;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z11) {
        if (this.mVerticalMirror != z11) {
            this.mVerticalMirror = z11;
            invalidateSelf();
        }
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mPath = new Path();
        this.mVerticalMirror = false;
        this.mDirection = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0467R.styleable.DrawerArrowToggle, C0467R.attr.drawerArrowStyle, C0467R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(typedArrayObtainStyledAttributes.getColor(C0467R.styleable.DrawerArrowToggle_color, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.DrawerArrowToggle_thickness, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(C0467R.styleable.DrawerArrowToggle_spinBars, true));
        setGapSize(Math.round(typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.mSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C0467R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.mBarLength = Math.round(typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.mArrowHeadLength = Math.round(typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.mArrowShaftLength = typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }
}
