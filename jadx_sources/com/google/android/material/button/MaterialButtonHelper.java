package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.C7090R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;

/* JADX INFO: loaded from: classes45.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
class MaterialButtonHelper {

    @Nullable
    private ColorStateList backgroundTint;

    @Nullable
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;

    @Nullable
    private SpringForce cornerSpringForce;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;

    @Nullable
    private Drawable maskDrawable;
    private final MaterialButton materialButton;

    @Nullable
    private MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener;

    @Nullable
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private StateListShapeAppearanceModel stateListShapeAppearanceModel;

    @Nullable
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;
    private boolean toggleCheckedStateOnClick = true;

    private Drawable createBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        StateListShapeAppearanceModel stateListShapeAppearanceModel = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel != null) {
            materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
        }
        SpringForce springForce = this.cornerSpringForce;
        if (springForce != null) {
            materialShapeDrawable.setCornerSpringForce(springForce);
        }
        MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener = this.onCornerSizeChangeListener;
        if (onCornerSizeChangeListener != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
        materialShapeDrawable.initializeElevationOverlay(this.materialButton.getContext());
        materialShapeDrawable.setTintList(this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel2 != null) {
            materialShapeDrawable2.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
        }
        SpringForce springForce2 = this.cornerSpringForce;
        if (springForce2 != null) {
            materialShapeDrawable2.setCornerSpringForce(springForce2);
        }
        materialShapeDrawable2.setTint(0);
        materialShapeDrawable2.setStroke(this.strokeWidth, this.shouldDrawSurfaceColorStroke ? MaterialColors.getColor(this.materialButton, C7090R.attr.colorSurface) : 0);
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearanceModel);
        this.maskDrawable = materialShapeDrawable3;
        StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.stateListShapeAppearanceModel;
        if (stateListShapeAppearanceModel3 != null) {
            materialShapeDrawable3.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
        }
        SpringForce springForce3 = this.cornerSpringForce;
        if (springForce3 != null) {
            ((MaterialShapeDrawable) this.maskDrawable).setCornerSpringForce(springForce3);
        }
        this.maskDrawable.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable})), this.maskDrawable);
        this.rippleDrawable = rippleDrawable;
        return rippleDrawable;
    }

    @Nullable
    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z11) {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0);
    }

    @Nullable
    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    private void setVerticalInsets(@Dimension int i11, @Dimension int i12) {
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        int i13 = this.insetTop;
        int i14 = this.insetBottom;
        this.insetBottom = i12;
        this.insetTop = i11;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        this.materialButton.setPaddingRelative(paddingStart, (paddingTop + i11) - i13, paddingEnd, (paddingBottom + i12) - i14);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
            materialShapeDrawable.setState(this.materialButton.getDrawableState());
        }
    }

    @NonNull
    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    public int getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable
    public SpringForce getCornerSpringForce() {
        return this.cornerSpringForce;
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public int getInsetTop() {
        return this.insetTop;
    }

    @Nullable
    public Shapeable getMaskDrawable() {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.rippleDrawable.getNumberOfLayers() > 2 ? (Shapeable) this.rippleDrawable.getDrawable(2) : (Shapeable) this.rippleDrawable.getDrawable(1);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Nullable
    public StateListShapeAppearanceModel getStateListShapeAppearanceModel() {
        return this.stateListShapeAppearanceModel;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isToggleCheckedStateOnClick() {
        return this.toggleCheckedStateOnClick;
    }

    public void loadFromAttributes(@NonNull TypedArray typedArray) {
        this.insetLeft = typedArray.getDimensionPixelOffset(C7090R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(C7090R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(C7090R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(C7090R.styleable.MaterialButton_android_insetBottom, 0);
        int i11 = C7090R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i11)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = typedArray.getDimensionPixelSize(C7090R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArray.getInt(C7090R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C7090R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C7090R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, C7090R.styleable.MaterialButton_rippleColor);
        this.checkable = typedArray.getBoolean(C7090R.styleable.MaterialButton_android_checkable, false);
        this.elevation = typedArray.getDimensionPixelSize(C7090R.styleable.MaterialButton_elevation, 0);
        this.toggleCheckedStateOnClick = typedArray.getBoolean(C7090R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = this.materialButton.getPaddingStart();
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = this.materialButton.getPaddingEnd();
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (typedArray.hasValue(C7090R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        this.materialButton.setPaddingRelative(paddingStart + this.insetLeft, paddingTop + this.insetTop, paddingEnd + this.insetRight, paddingBottom + this.insetBottom);
    }

    public void setCheckable(boolean z11) {
        this.checkable = z11;
    }

    public void setCornerRadius(int i11) {
        if (this.cornerRadiusSet && this.cornerRadius == i11) {
            return;
        }
        this.cornerRadius = i11;
        this.cornerRadiusSet = true;
        setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(i11));
    }

    public void setCornerSizeChangeListener(@Nullable MaterialShapeDrawable.OnCornerSizeChangeListener onCornerSizeChangeListener) {
        this.onCornerSizeChangeListener = onCornerSizeChangeListener;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setOnCornerSizeChangeListener(onCornerSizeChangeListener);
        }
    }

    public void setCornerSpringForce(@NonNull SpringForce springForce) {
        this.cornerSpringForce = springForce;
        if (this.stateListShapeAppearanceModel != null) {
            updateButtonShape();
        }
    }

    public void setInsetBottom(@Dimension int i11) {
        setVerticalInsets(this.insetTop, i11);
    }

    public void setInsetTop(@Dimension int i11) {
        setVerticalInsets(i11, this.insetBottom);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            if (this.materialButton.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
            }
        }
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        this.stateListShapeAppearanceModel = null;
        updateButtonShape();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        this.shouldDrawSurfaceColorStroke = z11;
        updateStroke();
    }

    public void setStateListShapeAppearanceModel(@NonNull StateListShapeAppearanceModel stateListShapeAppearanceModel) {
        this.stateListShapeAppearanceModel = stateListShapeAppearanceModel;
        updateButtonShape();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            updateStroke();
        }
    }

    public void setStrokeWidth(int i11) {
        if (this.strokeWidth != i11) {
            this.strokeWidth = i11;
            updateStroke();
        }
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (getMaterialShapeDrawable() != null) {
                getMaterialShapeDrawable().setTintList(this.backgroundTint);
            }
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() == null || this.backgroundTintMode == null) {
                return;
            }
            getMaterialShapeDrawable().setTintMode(this.backgroundTintMode);
        }
    }

    public void setToggleCheckedStateOnClick(boolean z11) {
        this.toggleCheckedStateOnClick = z11;
    }

    public void updateMaskBounds(int i11, int i12) {
        Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, i12 - this.insetRight, i11 - this.insetBottom);
        }
    }

    public MaterialButtonHelper(MaterialButton materialButton, @NonNull ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = materialButton;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    private void updateButtonShape() {
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel = this.stateListShapeAppearanceModel;
            if (stateListShapeAppearanceModel != null) {
                materialShapeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel);
            } else {
                materialShapeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            }
            SpringForce springForce = this.cornerSpringForce;
            if (springForce != null) {
                materialShapeDrawable.setCornerSpringForce(springForce);
            }
        }
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (surfaceColorStrokeDrawable != null) {
            StateListShapeAppearanceModel stateListShapeAppearanceModel2 = this.stateListShapeAppearanceModel;
            if (stateListShapeAppearanceModel2 != null) {
                surfaceColorStrokeDrawable.setStateListShapeAppearanceModel(stateListShapeAppearanceModel2);
            } else {
                surfaceColorStrokeDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            }
            SpringForce springForce2 = this.cornerSpringForce;
            if (springForce2 != null) {
                surfaceColorStrokeDrawable.setCornerSpringForce(springForce2);
            }
        }
        Shapeable maskDrawable = getMaskDrawable();
        if (maskDrawable != null) {
            maskDrawable.setShapeAppearanceModel(this.shapeAppearanceModel);
            if (maskDrawable instanceof MaterialShapeDrawable) {
                MaterialShapeDrawable materialShapeDrawable2 = (MaterialShapeDrawable) maskDrawable;
                StateListShapeAppearanceModel stateListShapeAppearanceModel3 = this.stateListShapeAppearanceModel;
                if (stateListShapeAppearanceModel3 != null) {
                    materialShapeDrawable2.setStateListShapeAppearanceModel(stateListShapeAppearanceModel3);
                }
                SpringForce springForce3 = this.cornerSpringForce;
                if (springForce3 != null) {
                    materialShapeDrawable2.setCornerSpringForce(springForce3);
                }
            }
        }
    }

    private void updateStroke() {
        int color;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                float f11 = this.strokeWidth;
                if (this.shouldDrawSurfaceColorStroke) {
                    color = MaterialColors.getColor(this.materialButton, C7090R.attr.colorSurface);
                } else {
                    color = 0;
                }
                surfaceColorStrokeDrawable.setStroke(f11, color);
            }
        }
    }

    public void setBackgroundColor(int i11) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(i11);
        }
    }

    @Nullable
    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }
}
