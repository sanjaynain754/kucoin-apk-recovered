package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.math.MathUtils;
import com.google.android.material.shadow.ShadowRenderer;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable, Shapeable {
    private static final SpringAnimatedCornerSizeProperty[] CORNER_SIZES_IN_PX;
    static final ShapeAppearanceModel DEFAULT_INTERPOLATION_START_SHAPE_APPEARANCE_MODEL = ShapeAppearanceModel.builder().setAllCorners(0, 0.0f).build();
    public static final int SHADOW_COMPAT_MODE_ALWAYS = 2;
    public static final int SHADOW_COMPAT_MODE_DEFAULT = 0;
    public static final int SHADOW_COMPAT_MODE_NEVER = 1;
    private static final float SHADOW_OFFSET_MULTIPLIER = 0.25f;
    private static final float SHADOW_RADIUS_MULTIPLIER = 0.75f;
    private static final String TAG = "MaterialShapeDrawable";
    private static final Paint clearPaint;
    private boolean boundsIsEmpty;
    private final BitSet containsIncompatibleShadowOp;
    private final ShapePath.ShadowCompatOperation[] cornerShadowOperation;

    @NonNull
    SpringAnimation[] cornerSpringAnimations;

    @Nullable
    private SpringForce cornerSpringForce;
    private MaterialShapeDrawableState drawableState;
    private final ShapePath.ShadowCompatOperation[] edgeShadowOperation;
    private final Paint fillPaint;
    private final RectF insetRectF;
    private final Matrix matrix;

    @Nullable
    private OnCornerSizeChangeListener onCornerSizeChangeListener;
    private final Path path;

    @NonNull
    private final RectF pathBounds;
    private boolean pathDirty;
    private final Path pathInsetByStroke;
    private final ShapeAppearancePathProvider pathProvider;

    @NonNull
    private final ShapeAppearancePathProvider.PathListener pathShadowListener;
    private final RectF rectF;
    private int resolvedTintColor;
    private final Region scratchRegion;
    private boolean shadowBitmapDrawingEnable;
    private final ShadowRenderer shadowRenderer;

    @Nullable
    private float[] springAnimatedCornerSizes;

    @Nullable
    private float[] springAnimatedStrokeCornerSizes;
    private final ShapeAppearanceModel.CornerSizeUnaryOperator strokeInsetCornerSizeUnaryOperator;
    private final Paint strokePaint;
    private boolean strokePathDirty;

    @NonNull
    private ShapeAppearanceModel strokeShapeAppearanceModel;

    @Nullable
    private PorterDuffColorFilter strokeTintFilter;

    @Nullable
    private PorterDuffColorFilter tintFilter;
    private final Region transparentRegion;

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class MaterialShapeDrawableState extends Drawable.ConstantState {
        int alpha;

        @Nullable
        ColorFilter colorFilter;
        float elevation;

        @Nullable
        ElevationOverlayProvider elevationOverlayProvider;

        @Nullable
        ColorStateList fillColor;
        float interpolation;

        @Nullable
        Rect padding;
        Paint.Style paintStyle;
        float parentAbsoluteElevation;
        float scale;
        int shadowCompatMode;
        int shadowCompatOffset;
        int shadowCompatRadius;
        int shadowCompatRotation;

        @NonNull
        ShapeAppearanceModel shapeAppearanceModel;

        @Nullable
        StateListShapeAppearanceModel stateListShapeAppearanceModel;

        @Nullable
        ColorStateList strokeColor;

        @Nullable
        ColorStateList strokeTintList;
        float strokeWidth;

        @Nullable
        ColorStateList tintList;

        @Nullable
        PorterDuff.Mode tintMode;
        float translationZ;
        boolean useTintColorForShadow;

        public MaterialShapeDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable ElevationOverlayProvider elevationOverlayProvider) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = shapeAppearanceModel;
            this.elevationOverlayProvider = elevationOverlayProvider;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.pathDirty = true;
            materialShapeDrawable.strokePathDirty = true;
            return materialShapeDrawable;
        }

        public MaterialShapeDrawableState(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
            this.fillColor = null;
            this.strokeColor = null;
            this.strokeTintList = null;
            this.tintList = null;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.padding = null;
            this.scale = 1.0f;
            this.interpolation = 1.0f;
            this.alpha = 255;
            this.parentAbsoluteElevation = 0.0f;
            this.elevation = 0.0f;
            this.translationZ = 0.0f;
            this.shadowCompatMode = 0;
            this.shadowCompatRadius = 0;
            this.shadowCompatOffset = 0;
            this.shadowCompatRotation = 0;
            this.useTintColorForShadow = false;
            this.paintStyle = Paint.Style.FILL_AND_STROKE;
            this.shapeAppearanceModel = materialShapeDrawableState.shapeAppearanceModel;
            this.stateListShapeAppearanceModel = materialShapeDrawableState.stateListShapeAppearanceModel;
            this.elevationOverlayProvider = materialShapeDrawableState.elevationOverlayProvider;
            this.strokeWidth = materialShapeDrawableState.strokeWidth;
            this.colorFilter = materialShapeDrawableState.colorFilter;
            this.fillColor = materialShapeDrawableState.fillColor;
            this.strokeColor = materialShapeDrawableState.strokeColor;
            this.tintMode = materialShapeDrawableState.tintMode;
            this.tintList = materialShapeDrawableState.tintList;
            this.alpha = materialShapeDrawableState.alpha;
            this.scale = materialShapeDrawableState.scale;
            this.shadowCompatOffset = materialShapeDrawableState.shadowCompatOffset;
            this.shadowCompatMode = materialShapeDrawableState.shadowCompatMode;
            this.useTintColorForShadow = materialShapeDrawableState.useTintColorForShadow;
            this.interpolation = materialShapeDrawableState.interpolation;
            this.parentAbsoluteElevation = materialShapeDrawableState.parentAbsoluteElevation;
            this.elevation = materialShapeDrawableState.elevation;
            this.translationZ = materialShapeDrawableState.translationZ;
            this.shadowCompatRadius = materialShapeDrawableState.shadowCompatRadius;
            this.shadowCompatRotation = materialShapeDrawableState.shadowCompatRotation;
            this.strokeTintList = materialShapeDrawableState.strokeTintList;
            this.paintStyle = materialShapeDrawableState.paintStyle;
            if (materialShapeDrawableState.padding != null) {
                this.padding = new Rect(materialShapeDrawableState.padding);
            }
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface OnCornerSizeChangeListener {
        void onCornerSizeChange(float f11);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class SpringAnimatedCornerSizeProperty extends FloatPropertyCompat<MaterialShapeDrawable> {
        private final int index;

        public SpringAnimatedCornerSizeProperty(int i11) {
            super("cornerSizeAtIndex" + i11);
            this.index = i11;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public float getValue(@NonNull MaterialShapeDrawable materialShapeDrawable) {
            if (materialShapeDrawable.springAnimatedCornerSizes != null) {
                return materialShapeDrawable.springAnimatedCornerSizes[this.index];
            }
            return 0.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public void setValue(@NonNull MaterialShapeDrawable materialShapeDrawable, float f11) {
            if (materialShapeDrawable.springAnimatedCornerSizes == null || materialShapeDrawable.springAnimatedCornerSizes[this.index] == f11) {
                return;
            }
            materialShapeDrawable.springAnimatedCornerSizes[this.index] = f11;
            if (materialShapeDrawable.onCornerSizeChangeListener != null) {
                materialShapeDrawable.onCornerSizeChangeListener.onCornerSizeChange(materialShapeDrawable.getCornerSizeDiffX());
            }
            materialShapeDrawable.invalidateSelf();
        }
    }

    public MaterialShapeDrawable() {
        this(new ShapeAppearanceModel());
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    private void updateShape(int[] iArr) {
        updateShape(iArr, false);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        drawShape(canvas, paint, path, this.drawableState.shapeAppearanceModel, this.springAnimatedCornerSizes, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.pathDirty = true;
        this.strokePathDirty = true;
        super.onBoundsChange(rect);
        if (this.drawableState.stateListShapeAppearanceModel != null && !rect.isEmpty()) {
            updateShape(getState(), this.boundsIsEmpty);
        }
        this.boundsIsEmpty = rect.isEmpty();
    }

    public void setCornerSize(float f11) {
        setShapeAppearanceModel(this.drawableState.shapeAppearanceModel.withCornerSize(f11));
    }

    @Deprecated
    public void setShadowElevation(int i11) {
        setElevation(i11);
    }

    public void setStroke(float f11, @ColorInt int i11) {
        setStrokeWidth(f11);
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.drawableState.strokeTintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        this(ShapeAppearanceModel.builder(context, attributeSet, i11, i12).build());
    }

    @Nullable
    private PorterDuffColorFilter calculatePaintColorTintFilter(@NonNull Paint paint, boolean z11) {
        if (!z11) {
            return null;
        }
        int color = paint.getColor();
        int iCompositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(color);
        this.resolvedTintColor = iCompositeElevationOverlayIfNeeded;
        if (iCompositeElevationOverlayIfNeeded != color) {
            return new PorterDuffColorFilter(iCompositeElevationOverlayIfNeeded, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private float calculateRoundRectCornerSize(@NonNull RectF rectF, @NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr) {
        if (fArr == null) {
            if (shapeAppearanceModel.isRoundRect(rectF)) {
                return shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF);
            }
            return -1.0f;
        }
        if (MathUtils.areAllElementsEqual(fArr) && shapeAppearanceModel.hasRoundedCorners()) {
            return fArr[0];
        }
        return -1.0f;
    }

    @NonNull
    private PorterDuffColorFilter calculateTintFilter(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z11) {
        return (colorStateList == null || mode == null) ? calculatePaintColorTintFilter(paint, z11) : calculateTintColorTintFilter(colorStateList, mode, z11);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f11) {
        return createWithElevationOverlay(context, f11, null);
    }

    private void drawCompatShadow(@NonNull Canvas canvas) {
        if (this.containsIncompatibleShadowOp.cardinality() > 0) {
            Log.w(TAG, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.drawableState.shadowCompatOffset != 0) {
            canvas.drawPath(this.path, this.shadowRenderer.getShadowPaint());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.cornerShadowOperation[i11].draw(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
            this.edgeShadowOperation[i11].draw(this.shadowRenderer, this.drawableState.shadowCompatRadius, canvas);
        }
        if (this.shadowBitmapDrawingEnable) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(this.path, clearPaint);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    private void drawFillShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.fillPaint, this.path, this.drawableState.shapeAppearanceModel, this.springAnimatedCornerSizes, getBoundsAsRectF());
    }

    private void drawShape(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull ShapeAppearanceModel shapeAppearanceModel, @Nullable float[] fArr, @NonNull RectF rectF) {
        float fCalculateRoundRectCornerSize = calculateRoundRectCornerSize(rectF, shapeAppearanceModel, fArr);
        if (fCalculateRoundRectCornerSize < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f11 = fCalculateRoundRectCornerSize * this.drawableState.interpolation;
            canvas.drawRoundRect(rectF, f11, f11, paint);
        }
    }

    @NonNull
    private RectF getBoundsInsetByStroke() {
        this.insetRectF.set(getBoundsAsRectF());
        float strokeInsetLength = getStrokeInsetLength();
        this.insetRectF.inset(strokeInsetLength, strokeInsetLength);
        return this.insetRectF;
    }

    private boolean hasCompatShadow() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        int i11 = materialShapeDrawableState.shadowCompatMode;
        if (i11 == 1 || materialShapeDrawableState.shadowCompatRadius <= 0) {
            return false;
        }
        return i11 == 2 || requiresCompatShadow();
    }

    private boolean hasFill() {
        Paint.Style style = this.drawableState.paintStyle;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean hasStroke() {
        Paint.Style style = this.drawableState.paintStyle;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.strokePaint.getStrokeWidth() > 0.0f;
    }

    private static int modulateAlpha(int i11, int i12) {
        return (i11 * (i12 + (i12 >>> 7))) >>> 8;
    }

    private boolean updateColorsForState(int[] iArr) {
        boolean z11;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.drawableState.fillColor == null || color2 == (colorForState2 = this.drawableState.fillColor.getColorForState(iArr, (color2 = this.fillPaint.getColor())))) {
            z11 = false;
        } else {
            this.fillPaint.setColor(colorForState2);
            z11 = true;
        }
        if (this.drawableState.strokeColor == null || color == (colorForState = this.drawableState.strokeColor.getColorForState(iArr, (color = this.strokePaint.getColor())))) {
            return z11;
        }
        this.strokePaint.setColor(colorForState);
        return true;
    }

    private void updateShape(int[] iArr, boolean z11) {
        RectF boundsAsRectF = getBoundsAsRectF();
        if (this.drawableState.stateListShapeAppearanceModel == null || boundsAsRectF.isEmpty()) {
            return;
        }
        boolean z12 = z11 | (this.cornerSpringForce == null);
        if (this.springAnimatedCornerSizes == null) {
            this.springAnimatedCornerSizes = new float[4];
        }
        ShapeAppearanceModel shapeForState = this.drawableState.stateListShapeAppearanceModel.getShapeForState(iArr);
        for (int i11 = 0; i11 < 4; i11++) {
            float cornerSize = this.pathProvider.getCornerSizeForIndex(i11, shapeForState).getCornerSize(boundsAsRectF);
            if (z12) {
                this.springAnimatedCornerSizes[i11] = cornerSize;
            }
            SpringAnimation springAnimation = this.cornerSpringAnimations[i11];
            if (springAnimation != null) {
                springAnimation.animateToFinalPosition(cornerSize);
                if (z12) {
                    this.cornerSpringAnimations[i11].skipToEnd();
                }
            }
        }
        if (z12) {
            invalidateSelf();
        }
    }

    private boolean updateTintFilter() {
        PorterDuffColorFilter porterDuffColorFilter = this.tintFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.strokeTintFilter;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        this.tintFilter = calculateTintFilter(materialShapeDrawableState.tintList, materialShapeDrawableState.tintMode, this.fillPaint, true);
        MaterialShapeDrawableState materialShapeDrawableState2 = this.drawableState;
        this.strokeTintFilter = calculateTintFilter(materialShapeDrawableState2.strokeTintList, materialShapeDrawableState2.tintMode, this.strokePaint, false);
        MaterialShapeDrawableState materialShapeDrawableState3 = this.drawableState;
        if (materialShapeDrawableState3.useTintColorForShadow) {
            this.shadowRenderer.setShadowColor(materialShapeDrawableState3.tintList.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.tintFilter) && ObjectsCompat.equals(porterDuffColorFilter2, this.strokeTintFilter)) ? false : true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void calculatePathForSize(@NonNull RectF rectF, @NonNull Path path) {
        ShapeAppearancePathProvider shapeAppearancePathProvider = this.pathProvider;
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        shapeAppearancePathProvider.calculatePath(materialShapeDrawableState.shapeAppearanceModel, this.springAnimatedCornerSizes, materialShapeDrawableState.interpolation, rectF, this.pathShadowListener, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.fillPaint.setColorFilter(this.tintFilter);
        int alpha = this.fillPaint.getAlpha();
        this.fillPaint.setAlpha(modulateAlpha(alpha, this.drawableState.alpha));
        this.strokePaint.setColorFilter(this.strokeTintFilter);
        this.strokePaint.setStrokeWidth(this.drawableState.strokeWidth);
        int alpha2 = this.strokePaint.getAlpha();
        this.strokePaint.setAlpha(modulateAlpha(alpha2, this.drawableState.alpha));
        if (hasFill()) {
            if (this.pathDirty) {
                calculatePath(getBoundsAsRectF(), this.path);
                this.pathDirty = false;
            }
            maybeDrawCompatShadow(canvas);
            drawFillShape(canvas);
        }
        if (hasStroke()) {
            if (this.strokePathDirty) {
                calculateStrokePath();
                this.strokePathDirty = false;
            }
            drawStrokeShape(canvas);
        }
        this.fillPaint.setAlpha(alpha);
        this.strokePaint.setAlpha(alpha2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void drawStrokeShape(@NonNull Canvas canvas) {
        drawShape(canvas, this.strokePaint, this.pathInsetByStroke, this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, getBoundsInsetByStroke());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.drawableState.alpha;
    }

    public float getBottomLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[2] : this.drawableState.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getBottomRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[1] : this.drawableState.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    @NonNull
    public RectF getBoundsAsRectF() {
        this.rectF.set(getBounds());
        return this.rectF;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.drawableState;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public float getCornerSizeDiffX() {
        float cornerSize;
        float cornerSize2;
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr != null) {
            cornerSize = (fArr[3] + fArr[2]) - fArr[1];
            cornerSize2 = fArr[0];
        } else {
            RectF boundsAsRectF = getBoundsAsRectF();
            cornerSize = (this.pathProvider.getCornerSizeForIndex(3, getShapeAppearanceModel()).getCornerSize(boundsAsRectF) + this.pathProvider.getCornerSizeForIndex(2, getShapeAppearanceModel()).getCornerSize(boundsAsRectF)) - this.pathProvider.getCornerSizeForIndex(1, getShapeAppearanceModel()).getCornerSize(boundsAsRectF);
            cornerSize2 = this.pathProvider.getCornerSizeForIndex(0, getShapeAppearanceModel()).getCornerSize(boundsAsRectF);
        }
        return (cornerSize - cornerSize2) / 2.0f;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public SpringForce getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    public float getElevation() {
        return this.drawableState.elevation;
    }

    @Nullable
    public ColorStateList getFillColor() {
        return this.drawableState.fillColor;
    }

    public float getInterpolation() {
        return this.drawableState.interpolation;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        if (this.drawableState.shadowCompatMode == 2) {
            return;
        }
        RectF boundsAsRectF = getBoundsAsRectF();
        if (boundsAsRectF.isEmpty()) {
            return;
        }
        float fCalculateRoundRectCornerSize = calculateRoundRectCornerSize(boundsAsRectF, this.drawableState.shapeAppearanceModel, this.springAnimatedCornerSizes);
        if (fCalculateRoundRectCornerSize >= 0.0f) {
            outline.setRoundRect(getBounds(), fCalculateRoundRectCornerSize * this.drawableState.interpolation);
            return;
        }
        if (this.pathDirty) {
            calculatePath(boundsAsRectF, this.path);
            this.pathDirty = false;
        }
        DrawableUtils.setOutlineToPath(outline, this.path);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.drawableState.padding;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.drawableState.paintStyle;
    }

    public float getParentAbsoluteElevation() {
        return this.drawableState.parentAbsoluteElevation;
    }

    @Deprecated
    public void getPathForSize(int i11, int i12, @NonNull Path path) {
        calculatePathForSize(new RectF(0.0f, 0.0f, i11, i12), path);
    }

    @ColorInt
    public int getResolvedTintColor() {
        return this.resolvedTintColor;
    }

    public float getScale() {
        return this.drawableState.scale;
    }

    public int getShadowCompatRotation() {
        return this.drawableState.shadowCompatRotation;
    }

    public int getShadowCompatibilityMode() {
        return this.drawableState.shadowCompatMode;
    }

    public int getShadowOffsetX() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (((double) materialShapeDrawableState.shadowCompatOffset) * Math.sin(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)));
    }

    public int getShadowOffsetY() {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        return (int) (((double) materialShapeDrawableState.shadowCompatOffset) * Math.cos(Math.toRadians(materialShapeDrawableState.shadowCompatRotation)));
    }

    public int getShadowRadius() {
        return this.drawableState.shadowCompatRadius;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getShadowVerticalOffset() {
        return this.drawableState.shadowCompatOffset;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.drawableState.shapeAppearanceModel;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        return this.drawableState.stateListShapeAppearanceModel;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.drawableState.strokeColor;
    }

    @Nullable
    public ColorStateList getStrokeTintList() {
        return this.drawableState.strokeTintList;
    }

    public float getStrokeWidth() {
        return this.drawableState.strokeWidth;
    }

    @Nullable
    public ColorStateList getTintList() {
        return this.drawableState.tintList;
    }

    public float getTopLeftCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[3] : this.drawableState.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTopRightCornerResolvedSize() {
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null ? fArr[0] : this.drawableState.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(getBoundsAsRectF());
    }

    public float getTranslationZ() {
        return this.drawableState.translationZ;
    }

    public void initializeElevationOverlay(Context context) {
        this.drawableState.elevationOverlayProvider = new ElevationOverlayProvider(context);
        updateZ();
    }

    public boolean isElevationOverlayEnabled() {
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        return elevationOverlayProvider != null && elevationOverlayProvider.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.drawableState.elevationOverlayProvider != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect() {
        if (this.drawableState.shapeAppearanceModel.isRoundRect(getBoundsAsRectF())) {
            return true;
        }
        float[] fArr = this.springAnimatedCornerSizes;
        return fArr != null && MathUtils.areAllElementsEqual(fArr) && this.drawableState.shapeAppearanceModel.hasRoundedCorners();
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i11 = this.drawableState.shadowCompatMode;
        return i11 == 0 || i11 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.drawableState = new MaterialShapeDrawableState(this.drawableState);
        return this;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        if (this.drawableState.stateListShapeAppearanceModel != null) {
            updateShape(iArr);
        }
        boolean z11 = updateColorsForState(iArr) || updateTintFilter();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m1553to = 255) int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.alpha != i11) {
            materialShapeDrawableState.alpha = i11;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawableState.colorFilter = colorFilter;
        invalidateSelfIgnoreShape();
    }

    public void setCornerSize(@NonNull CornerSize cornerSize) {
        setShapeAppearanceModel(this.drawableState.shapeAppearanceModel.withCornerSize(cornerSize));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        if (this.cornerSpringForce == springForce) {
            return;
        }
        this.cornerSpringForce = springForce;
        int i11 = 0;
        while (true) {
            SpringAnimation[] springAnimationArr = this.cornerSpringAnimations;
            if (i11 >= springAnimationArr.length) {
                updateShape(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (springAnimationArr[i11] == null) {
                    springAnimationArr[i11] = new SpringAnimation(this, CORNER_SIZES_IN_PX[i11]);
                }
                this.cornerSpringAnimations[i11].setSpring(new SpringForce().setDampingRatio(springForce.getDampingRatio()).setStiffness(springForce.getStiffness()));
                i11++;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setEdgeIntersectionCheckEnable(boolean z11) {
        this.pathProvider.setEdgeIntersectionCheckEnable(z11);
    }

    public void setElevation(float f11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.elevation != f11) {
            materialShapeDrawableState.elevation = f11;
            updateZ();
        }
    }

    public void setFillColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.fillColor != colorStateList) {
            materialShapeDrawableState.fillColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.interpolation != f11) {
            materialShapeDrawableState.interpolation = f11;
            this.pathDirty = true;
            this.strokePathDirty = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setOnCornerSizeChangeListener(@Nullable OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.onCornerSizeChangeListener = onCornerSizeChangeListener;
    }

    public void setPadding(int i11, int i12, int i13, int i14) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.padding == null) {
            materialShapeDrawableState.padding = new Rect();
        }
        this.drawableState.padding.set(i11, i12, i13, i14);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.drawableState.paintStyle = style;
        invalidateSelfIgnoreShape();
    }

    public void setParentAbsoluteElevation(float f11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.parentAbsoluteElevation != f11) {
            materialShapeDrawableState.parentAbsoluteElevation = f11;
            updateZ();
        }
    }

    public void setScale(float f11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.scale != f11) {
            materialShapeDrawableState.scale = f11;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowBitmapDrawingEnable(boolean z11) {
        this.shadowBitmapDrawingEnable = z11;
    }

    public void setShadowColor(int i11) {
        this.shadowRenderer.setShadowColor(i11);
        this.drawableState.useTintColorForShadow = false;
        invalidateSelfIgnoreShape();
    }

    public void setShadowCompatRotation(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatRotation != i11) {
            materialShapeDrawableState.shadowCompatRotation = i11;
            invalidateSelfIgnoreShape();
        }
    }

    public void setShadowCompatibilityMode(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatMode != i11) {
            materialShapeDrawableState.shadowCompatMode = i11;
            invalidateSelfIgnoreShape();
        }
    }

    @Deprecated
    public void setShadowEnabled(boolean z11) {
        setShadowCompatibilityMode(!z11 ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i11) {
        this.drawableState.shadowCompatRadius = i11;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setShadowVerticalOffset(int i11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.shadowCompatOffset != i11) {
            materialShapeDrawableState.shadowCompatOffset = i11;
            invalidateSelfIgnoreShape();
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        materialShapeDrawableState.shapeAppearanceModel = shapeAppearanceModel;
        materialShapeDrawableState.stateListShapeAppearanceModel = null;
        this.springAnimatedCornerSizes = null;
        this.springAnimatedStrokeCornerSizes = null;
        invalidateSelf();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.stateListShapeAppearanceModel != stateListShapeAppearanceModel) {
            materialShapeDrawableState.stateListShapeAppearanceModel = stateListShapeAppearanceModel;
            updateShape(getState(), true);
            invalidateSelf();
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.strokeColor != colorStateList) {
            materialShapeDrawableState.strokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeWidth(float f11) {
        this.drawableState.strokeWidth = f11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.drawableState.tintList = colorStateList;
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.tintMode != mode) {
            materialShapeDrawableState.tintMode = mode;
            updateTintFilter();
            invalidateSelfIgnoreShape();
        }
    }

    public void setTranslationZ(float f11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.translationZ != f11) {
            materialShapeDrawableState.translationZ = f11;
            updateZ();
        }
    }

    public void setUseTintColorForShadow(boolean z11) {
        MaterialShapeDrawableState materialShapeDrawableState = this.drawableState;
        if (materialShapeDrawableState.useTintColorForShadow != z11) {
            materialShapeDrawableState.useTintColorForShadow = z11;
            invalidateSelf();
        }
    }

    static {
        int i11 = 0;
        Paint paint = new Paint(1);
        clearPaint = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        CORNER_SIZES_IN_PX = new SpringAnimatedCornerSizeProperty[4];
        while (true) {
            SpringAnimatedCornerSizeProperty[] springAnimatedCornerSizePropertyArr = CORNER_SIZES_IN_PX;
            if (i11 < springAnimatedCornerSizePropertyArr.length) {
                springAnimatedCornerSizePropertyArr[i11] = new SpringAnimatedCornerSizeProperty(i11);
                i11++;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public MaterialShapeDrawable(@NonNull ShapePathModel shapePathModel) {
        this((ShapeAppearanceModel) shapePathModel);
    }

    private void calculatePath(@NonNull RectF rectF, @NonNull Path path) {
        calculatePathForSize(rectF, path);
        if (this.drawableState.scale != 1.0f) {
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f11 = this.drawableState.scale;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.matrix);
        }
        path.computeBounds(this.pathBounds, true);
    }

    private void calculateStrokePath() {
        updateStrokeShapeAppearanceModels();
        this.pathProvider.calculatePath(this.strokeShapeAppearanceModel, this.springAnimatedStrokeCornerSizes, this.drawableState.interpolation, getBoundsInsetByStroke(), null, this.pathInsetByStroke);
    }

    @NonNull
    private PorterDuffColorFilter calculateTintColorTintFilter(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z11) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z11) {
            colorForState = compositeElevationOverlayIfNeeded(colorForState);
        }
        this.resolvedTintColor = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @NonNull
    public static MaterialShapeDrawable createWithElevationOverlay(@NonNull Context context, float f11, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(MaterialColors.getColor(context, C7090R.attr.colorSurface, MaterialShapeDrawable.class.getSimpleName()));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(colorStateList);
        materialShapeDrawable.setElevation(f11);
        return materialShapeDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getStrokeInsetLength() {
        if (hasStroke()) {
            return this.strokePaint.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void invalidateSelfIgnoreShape() {
        super.invalidateSelf();
    }

    private void maybeDrawCompatShadow(@NonNull Canvas canvas) {
        if (!hasCompatShadow()) {
            return;
        }
        canvas.save();
        prepareCanvasForShadow(canvas);
        if (!this.shadowBitmapDrawingEnable) {
            drawCompatShadow(canvas);
            canvas.restore();
            return;
        }
        int iWidth = (int) (this.pathBounds.width() - getBounds().width());
        int iHeight = (int) (this.pathBounds.height() - getBounds().height());
        if (iWidth >= 0 && iHeight >= 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.pathBounds.width()) + (this.drawableState.shadowCompatRadius * 2) + iWidth, ((int) this.pathBounds.height()) + (this.drawableState.shadowCompatRadius * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f11 = (getBounds().left - this.drawableState.shadowCompatRadius) - iWidth;
            float f12 = (getBounds().top - this.drawableState.shadowCompatRadius) - iHeight;
            canvas2.translate(-f11, -f12);
            drawCompatShadow(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
            bitmapCreateBitmap.recycle();
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private void prepareCanvasForShadow(@NonNull Canvas canvas) {
        canvas.translate(getShadowOffsetX(), getShadowOffsetY());
    }

    private void updateStrokeShapeAppearanceModels() {
        this.strokeShapeAppearanceModel = getShapeAppearanceModel().withTransformedCornerSizes(this.strokeInsetCornerSizeUnaryOperator);
        float[] fArr = this.springAnimatedCornerSizes;
        if (fArr == null) {
            this.springAnimatedStrokeCornerSizes = null;
            return;
        }
        if (this.springAnimatedStrokeCornerSizes == null) {
            this.springAnimatedStrokeCornerSizes = new float[fArr.length];
        }
        float strokeInsetLength = getStrokeInsetLength();
        int i11 = 0;
        while (true) {
            float[] fArr2 = this.springAnimatedCornerSizes;
            if (i11 < fArr2.length) {
                this.springAnimatedStrokeCornerSizes[i11] = Math.max(0.0f, fArr2[i11] - strokeInsetLength);
                i11++;
            } else {
                return;
            }
        }
    }

    private void updateZ() {
        float z11 = getZ();
        this.drawableState.shadowCompatRadius = (int) Math.ceil(0.75f * z11);
        this.drawableState.shadowCompatOffset = (int) Math.ceil(z11 * SHADOW_OFFSET_MULTIPLIER);
        updateTintFilter();
        invalidateSelfIgnoreShape();
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int compositeElevationOverlayIfNeeded(@ColorInt int i11) {
        float z11 = getZ() + getParentAbsoluteElevation();
        ElevationOverlayProvider elevationOverlayProvider = this.drawableState.elevationOverlayProvider;
        if (elevationOverlayProvider != null) {
            return elevationOverlayProvider.compositeOverlayIfNeeded(i11, z11);
        }
        return i11;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    @Nullable
    @Deprecated
    public ShapePathModel getShapedViewModel() {
        ShapeAppearanceModel shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof ShapePathModel) {
            return (ShapePathModel) shapeAppearanceModel;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.transparentRegion.set(getBounds());
        calculatePath(getBoundsAsRectF(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region.Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public float getZ() {
        return getElevation() + getTranslationZ();
    }

    public boolean isPointInTransparentRegion(int i11, int i12) {
        return getTransparentRegion().contains(i11, i12);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.drawableState.tintList;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.drawableState.strokeTintList;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.drawableState.strokeColor;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.drawableState.fillColor;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            StateListShapeAppearanceModel stateListShapeAppearanceModel = this.drawableState.stateListShapeAppearanceModel;
                            if (stateListShapeAppearanceModel == null || !stateListShapeAppearanceModel.isStateful()) {
                                return false;
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean requiresCompatShadow() {
        if (!isRoundRect() && !this.path.isConvex() && Build.VERSION.SDK_INT < 29) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setShapedViewModel(@NonNull ShapePathModel shapePathModel) {
        setShapeAppearanceModel(shapePathModel);
    }

    public void setStroke(float f11, @Nullable ColorStateList colorStateList) {
        setStrokeWidth(f11);
        setStrokeColor(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    public void setZ(float f11) {
        setTranslationZ(f11 - getElevation());
    }

    public MaterialShapeDrawable(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this(new MaterialShapeDrawableState(shapeAppearanceModel, null));
    }

    public void setStrokeTint(@ColorInt int i11) {
        setStrokeTint(ColorStateList.valueOf(i11));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull MaterialShapeDrawableState materialShapeDrawableState) {
        ShapeAppearancePathProvider shapeAppearancePathProvider;
        this.strokeInsetCornerSizeUnaryOperator = new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.shape.MaterialShapeDrawable.1
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            @NonNull
            public CornerSize apply(@NonNull CornerSize cornerSize) {
                return cornerSize instanceof RelativeCornerSize ? cornerSize : new AdjustedCornerSize(-MaterialShapeDrawable.this.getStrokeInsetLength(), cornerSize);
            }
        };
        this.cornerShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.edgeShadowOperation = new ShapePath.ShadowCompatOperation[4];
        this.containsIncompatibleShadowOp = new BitSet(8);
        this.matrix = new Matrix();
        this.path = new Path();
        this.pathInsetByStroke = new Path();
        this.rectF = new RectF();
        this.insetRectF = new RectF();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        Paint paint = new Paint(1);
        this.fillPaint = paint;
        Paint paint2 = new Paint(1);
        this.strokePaint = paint2;
        this.shadowRenderer = new ShadowRenderer();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            shapeAppearancePathProvider = ShapeAppearancePathProvider.getInstance();
        } else {
            shapeAppearancePathProvider = new ShapeAppearancePathProvider();
        }
        this.pathProvider = shapeAppearancePathProvider;
        this.pathBounds = new RectF();
        this.shadowBitmapDrawingEnable = true;
        this.boundsIsEmpty = true;
        this.cornerSpringAnimations = new SpringAnimation[4];
        this.drawableState = materialShapeDrawableState;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        updateTintFilter();
        updateColorsForState(getState());
        this.pathShadowListener = new ShapeAppearancePathProvider.PathListener() { // from class: com.google.android.material.shape.MaterialShapeDrawable.2
            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onCornerPathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i11) {
                MaterialShapeDrawable.this.containsIncompatibleShadowOp.set(i11, shapePath.containsIncompatibleShadowOp());
                MaterialShapeDrawable.this.cornerShadowOperation[i11] = shapePath.createShadowCompatOperation(matrix);
            }

            @Override // com.google.android.material.shape.ShapeAppearancePathProvider.PathListener
            public void onEdgePathCreated(@NonNull ShapePath shapePath, Matrix matrix, int i11) {
                MaterialShapeDrawable.this.containsIncompatibleShadowOp.set(i11 + 4, shapePath.containsIncompatibleShadowOp());
                MaterialShapeDrawable.this.edgeShadowOperation[i11] = shapePath.createShadowCompatOperation(matrix);
            }
        };
    }
}
