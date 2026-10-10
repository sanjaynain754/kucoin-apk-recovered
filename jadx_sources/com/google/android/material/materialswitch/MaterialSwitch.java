package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.C7090R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* JADX INFO: loaded from: classes45.dex */
public class MaterialSwitch extends SwitchCompat {
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Material3_CompoundButton_MaterialSwitch;
    private static final int[] STATE_SET_WITH_ICON = {C7090R.attr.state_with_icon};
    private int[] currentStateChecked;
    private int[] currentStateUnchecked;

    @Nullable
    private Drawable thumbDrawable;

    @Nullable
    private Drawable thumbIconDrawable;

    @Px
    private int thumbIconSize;

    @Nullable
    private ColorStateList thumbIconTintList;

    @NonNull
    private PorterDuff.Mode thumbIconTintMode;

    @Nullable
    private ColorStateList thumbTintList;

    @Nullable
    private Drawable trackDecorationDrawable;

    @Nullable
    private ColorStateList trackDecorationTintList;

    @NonNull
    private PorterDuff.Mode trackDecorationTintMode;

    @Nullable
    private Drawable trackDrawable;

    @Nullable
    private ColorStateList trackTintList;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.materialSwitchStyle);
    }

    private void refreshThumbDrawable() {
        this.thumbDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbDrawable, this.thumbTintList, getThumbTintMode());
        this.thumbIconDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        Drawable drawable = this.thumbDrawable;
        Drawable drawable2 = this.thumbIconDrawable;
        int i11 = this.thumbIconSize;
        super.setThumbDrawable(DrawableUtils.compositeTwoLayeredDrawable(drawable, drawable2, i11, i11));
        refreshDrawableState();
    }

    private void refreshTrackDrawable() {
        this.trackDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDrawable, this.trackTintList, getTrackTintMode());
        this.trackDecorationDrawable = DrawableUtils.createTintableDrawableIfNeeded(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable layerDrawable = this.trackDrawable;
        if (layerDrawable != null && this.trackDecorationDrawable != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (layerDrawable == null) {
            layerDrawable = this.trackDecorationDrawable;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    private static void setInterpolatedDrawableTintIfPossible(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f11) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f11));
    }

    private void updateDrawableTints() {
        if (this.thumbTintList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
        ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.thumbDrawable;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.thumbIconDrawable;
    }

    @Px
    public int getThumbIconSize() {
        return this.thumbIconSize;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.thumbIconTintList;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.thumbIconTintMode;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.thumbTintList;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.trackDecorationDrawable;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.trackDecorationTintList;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.trackDecorationTintMode;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.trackDrawable;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.trackTintList;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, STATE_SET_WITH_ICON);
        }
        this.currentStateUnchecked = DrawableUtils.getUncheckedState(iArrOnCreateDrawableState);
        this.currentStateChecked = DrawableUtils.getCheckedState(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconSize(@Px int i11) {
        if (this.thumbIconSize != i11) {
            this.thumbIconSize = i11;
            refreshThumbDrawable();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.thumbIconSize = -1;
        Context context2 = getContext();
        this.thumbDrawable = super.getThumbDrawable();
        this.thumbTintList = super.getThumbTintList();
        super.setThumbTintList(null);
        this.trackDrawable = super.getTrackDrawable();
        this.trackTintList = super.getTrackTintList();
        super.setTrackTintList(null);
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C7090R.styleable.MaterialSwitch, i11, i12, new int[0]);
        this.thumbIconDrawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(C7090R.styleable.MaterialSwitch_thumbIcon);
        this.thumbIconSize = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C7090R.styleable.MaterialSwitch_thumbIconSize, -1);
        this.thumbIconTintList = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C7090R.styleable.MaterialSwitch_thumbIconTint);
        int i13 = tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.thumbIconTintMode = ViewUtils.parseTintMode(i13, mode);
        this.trackDecorationDrawable = tintTypedArrayObtainTintedStyledAttributes.getDrawable(C7090R.styleable.MaterialSwitch_trackDecoration);
        this.trackDecorationTintList = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C7090R.styleable.MaterialSwitch_trackDecorationTint);
        this.trackDecorationTintMode = ViewUtils.parseTintMode(tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.MaterialSwitch_trackDecorationTintMode, -1), mode);
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setEnforceSwitchWidth(false);
        refreshThumbDrawable();
        refreshTrackDrawable();
    }

    @Override // android.view.View
    public void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    public void setThumbIconResource(@DrawableRes int i11) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setTrackDecorationResource(@DrawableRes int i11) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }
}
