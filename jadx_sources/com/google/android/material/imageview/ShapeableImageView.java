package com.google.android.material.imageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.C7090R;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class ShapeableImageView extends AppCompatImageView implements Shapeable {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_MaterialComponents_ShapeableImageView;
    private static final int UNDEFINED_PADDING = Integer.MIN_VALUE;
    private final Paint borderPaint;

    @Dimension
    private int bottomContentPadding;
    private final Paint clearPaint;
    private final RectF destination;

    @Dimension
    private int endContentPadding;
    private boolean hasAdjustedPaddingAfterLayoutDirectionResolved;

    @Dimension
    private int leftContentPadding;
    private Path maskPath;
    private final RectF maskRect;
    private final Path path;
    private final ShapeAppearancePathProvider pathProvider;

    @Dimension
    private int rightContentPadding;

    @Nullable
    private MaterialShapeDrawable shadowDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;

    @Dimension
    private int startContentPadding;

    @Nullable
    private ColorStateList strokeColor;

    @Dimension
    private float strokeWidth;

    @Dimension
    private int topContentPadding;

    public class OutlineProvider extends ViewOutlineProvider {
        private final Rect rect = new Rect();

        public OutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.shapeAppearanceModel == null) {
                return;
            }
            if (ShapeableImageView.this.shadowDrawable == null) {
                ShapeableImageView.this.shadowDrawable = new MaterialShapeDrawable(ShapeableImageView.this.shapeAppearanceModel);
            }
            ShapeableImageView.this.destination.round(this.rect);
            ShapeableImageView.this.shadowDrawable.setBounds(this.rect);
            ShapeableImageView.this.shadowDrawable.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void drawStroke(Canvas canvas) {
        if (this.strokeColor == null) {
            return;
        }
        this.borderPaint.setStrokeWidth(this.strokeWidth);
        int colorForState = this.strokeColor.getColorForState(getDrawableState(), this.strokeColor.getDefaultColor());
        if (this.strokeWidth <= 0.0f || colorForState == 0) {
            return;
        }
        this.borderPaint.setColor(colorForState);
        canvas.drawPath(this.path, this.borderPaint);
    }

    private boolean isContentPaddingRelative() {
        return (this.startContentPadding == Integer.MIN_VALUE && this.endContentPadding == Integer.MIN_VALUE) ? false : true;
    }

    private void updateShapeMask(int i11, int i12) {
        this.destination.set(getPaddingLeft(), getPaddingTop(), i11 - getPaddingRight(), i12 - getPaddingBottom());
        this.pathProvider.calculatePath(this.shapeAppearanceModel, 1.0f, this.destination, this.path);
        this.maskPath.rewind();
        this.maskPath.addPath(this.path);
        this.maskRect.set(0.0f, 0.0f, i11, i12);
        this.maskPath.addRect(this.maskRect, Path.Direction.CCW);
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.bottomContentPadding;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i11 = this.endContentPadding;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return isRtl() ? this.leftContentPadding : this.rightContentPadding;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i11 = this.startContentPadding;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return isRtl() ? this.rightContentPadding : this.leftContentPadding;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.topContentPadding;
    }

    @Override // com.google.android.material.shape.Shapeable
    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setContentPadding(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        this.startContentPadding = Integer.MIN_VALUE;
        this.endContentPadding = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.leftContentPadding) + i11, (super.getPaddingTop() - this.topContentPadding) + i12, (super.getPaddingRight() - this.rightContentPadding) + i13, (super.getPaddingBottom() - this.bottomContentPadding) + i14);
        this.leftContentPadding = i11;
        this.topContentPadding = i12;
        this.rightContentPadding = i13;
        this.bottomContentPadding = i14;
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.shadowDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        updateShapeMask(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.strokeColor = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(@Dimension float f11) {
        if (this.strokeWidth != f11) {
            this.strokeWidth = f11;
            invalidate();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.pathProvider = ShapeAppearancePathProvider.getInstance();
        this.path = new Path();
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.clearPaint = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.destination = new RectF();
        this.maskRect = new RectF();
        this.maskPath = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7090R.styleable.ShapeableImageView, i11, i12);
        setLayerType(2, null);
        this.strokeColor = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C7090R.styleable.ShapeableImageView_strokeColor);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPadding, 0);
        this.leftContentPadding = dimensionPixelSize;
        this.topContentPadding = dimensionPixelSize;
        this.rightContentPadding = dimensionPixelSize;
        this.bottomContentPadding = dimensionPixelSize;
        this.leftContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.topContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.rightContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.bottomContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.startContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.endContentPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7090R.styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.borderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build();
        setOutlineProvider(new OutlineProvider());
    }

    private boolean isRtl() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i11;
        int i12;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i12 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!isRtl() && (i11 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.leftContentPadding;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i11;
        int i12;
        if (isContentPaddingRelative()) {
            if (isRtl() && (i12 = this.startContentPadding) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!isRtl() && (i11 = this.endContentPadding) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.rightContentPadding;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.maskPath, this.clearPaint);
        drawStroke(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.hasAdjustedPaddingAfterLayoutDirectionResolved || !isLayoutDirectionResolved()) {
            return;
        }
        this.hasAdjustedPaddingAfterLayoutDirectionResolved = true;
        if (!isPaddingRelative() && !isContentPaddingRelative()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        updateShapeMask(i11, i12);
    }

    public void setContentPaddingRelative(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        int i15;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i11, (super.getPaddingTop() - this.topContentPadding) + i12, (super.getPaddingEnd() - getContentPaddingEnd()) + i13, (super.getPaddingBottom() - this.bottomContentPadding) + i14);
        if (isRtl()) {
            i15 = i13;
        } else {
            i15 = i11;
        }
        this.leftContentPadding = i15;
        this.topContentPadding = i12;
        if (!isRtl()) {
            i11 = i13;
        }
        this.rightContentPadding = i11;
        this.bottomContentPadding = i14;
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        super.setPadding(i11 + getContentPaddingLeft(), i12 + getContentPaddingTop(), i13 + getContentPaddingRight(), i14 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        super.setPaddingRelative(i11 + getContentPaddingStart(), i12 + getContentPaddingTop(), i13 + getContentPaddingEnd(), i14 + getContentPaddingBottom());
    }

    public void setStrokeColorResource(@ColorRes int i11) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
    }

    public void setStrokeWidthResource(@DimenRes int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }
}
