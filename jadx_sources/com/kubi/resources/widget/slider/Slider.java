package com.kubi.resources.widget.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes13.dex */
public class Slider extends BaseSlider<Slider, Object, Object> {
    public Slider(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public void setCustomThumbDrawable(@DrawableRes int i11) {
        super.setCustomThumbDrawable(i11);
    }

    public Slider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.sliderStyle);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    public Slider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    /* JADX INFO: renamed from: G */
    public /* bridge */ /* synthetic */ boolean mo55496G() {
        return super.mo55496G();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnChangeListener(@NonNull InterfaceC23147a interfaceC23147a) {
        super.addOnChangeListener(interfaceC23147a);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void addOnSliderTouchListener(@NonNull InterfaceC23148b interfaceC23148b) {
        super.addOnSliderTouchListener(interfaceC23148b);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    /* JADX INFO: renamed from: c0 */
    public boolean mo55517c0() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View
    @NonNull
    public /* bridge */ /* synthetic */ CharSequence getAccessibilityClassName() {
        return super.getAccessibilityClassName();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getActiveThumbIndex() {
        return super.getActiveThumbIndex();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getFocusedThumbIndex() {
        return super.getFocusedThumbIndex();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getHaloRadius() {
        return super.getHaloRadius();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getHaloTintList() {
        return super.getHaloTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getLabelBehavior() {
        return super.getLabelBehavior();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getStepSize() {
        return super.getStepSize();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbElevation() {
        return super.getThumbElevation();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getThumbHeight() {
        return super.getThumbHeight();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getThumbRadius() {
        return super.getThumbRadius();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ ColorStateList getThumbStrokeColor() {
        return super.getThumbStrokeColor();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getThumbStrokeWidth() {
        return super.getThumbStrokeWidth();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getThumbTintList() {
        return super.getThumbTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getThumbTrackGapSize() {
        return super.getThumbTrackGapSize();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getThumbWidth() {
        return super.getThumbWidth();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getTickActiveRadius() {
        return super.getTickActiveRadius();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickActiveTintList() {
        return super.getTickActiveTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getTickInactiveRadius() {
        return super.getTickInactiveRadius();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickInactiveTintList() {
        return super.getTickInactiveTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTickTintList() {
        return super.getTickTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackActiveTintList() {
        return super.getTrackActiveTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getTrackHeight() {
        return super.getTrackHeight();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackInactiveTintList() {
        return super.getTrackInactiveTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackInsideCornerSize() {
        return super.getTrackInsideCornerSize();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getTrackSidePadding() {
        return super.getTrackSidePadding();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackStopIndicatorSize() {
        return super.getTrackStopIndicatorSize();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @NonNull
    public /* bridge */ /* synthetic */ ColorStateList getTrackTintList() {
        return super.getTrackTintList();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    @Px
    public /* bridge */ /* synthetic */ int getTrackWidth() {
        return super.getTrackWidth();
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueFrom() {
        return super.getValueFrom();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ float getValueTo() {
        return super.getValueTo();
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i11, @NonNull KeyEvent keyEvent) {
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyUp(int i11, @NonNull KeyEvent keyEvent) {
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnChangeListener(@NonNull InterfaceC23147a interfaceC23147a) {
        super.removeOnChangeListener(interfaceC23147a);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void removeOnSliderTouchListener(@NonNull InterfaceC23148b interfaceC23148b) {
        super.removeOnSliderTouchListener(interfaceC23148b);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z11) {
        super.setEnabled(z11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i11) {
        super.setFocusedThumbIndex(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(@IntRange(from = 0) @Px int i11) {
        super.setHaloRadius(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadiusResource(@DimenRes int i11) {
        super.setHaloRadiusResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(@NonNull ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelAnimationEnterDuration(int i11) {
        super.setLabelAnimationEnterDuration(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelAnimationExitDuration(int i11) {
        super.setLabelAnimationExitDuration(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i11) {
        super.setLabelBehavior(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelFormatter(@Nullable InterfaceC23150d interfaceC23150d) {
        super.setLabelFormatter(interfaceC23150d);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f11) {
        super.setStepSize(f11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f11) {
        super.setThumbElevation(f11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevationResource(@DimenRes int i11) {
        super.setThumbElevationResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(@IntRange(from = 0) @Px int i11) {
        super.setThumbHeight(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeightResource(@DimenRes int i11) {
        super.setThumbHeightResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(@IntRange(from = 0) @Px int i11) {
        super.setThumbRadius(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadiusResource(@DimenRes int i11) {
        super.setThumbRadiusResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColorResource(@ColorRes int i11) {
        super.setThumbStrokeColorResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f11) {
        super.setThumbStrokeWidth(f11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidthResource(@DimenRes int i11) {
        super.setThumbStrokeWidthResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTintList(@NonNull ColorStateList colorStateList) {
        super.setThumbTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(@Px int i11) {
        super.setThumbTrackGapSize(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(@IntRange(from = 0) @Px int i11) {
        super.setThumbWidth(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidthResource(@DimenRes int i11) {
        super.setThumbWidthResource(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(@IntRange(from = 0) @Px int i11) {
        super.setTickActiveRadius(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(@IntRange(from = 0) @Px int i11) {
        super.setTickInactiveRadius(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickTintList(@NonNull ColorStateList colorStateList) {
        super.setTickTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisible(boolean z11) {
        super.setTickVisible(z11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(@IntRange(from = 0) @Px int i11) {
        super.setTrackHeight(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(@Px int i11) {
        super.setTrackInsideCornerSize(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(@Px int i11) {
        super.setTrackStopIndicatorSize(i11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackTintList(@NonNull ColorStateList colorStateList) {
        super.setTrackTintList(colorStateList);
    }

    public void setValue(float f11) {
        setValues(Float.valueOf(f11));
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueFrom(float f11) {
        super.setValueFrom(f11);
    }

    @Override // com.kubi.resources.widget.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setValueTo(float f11) {
        super.setValueTo(f11);
    }
}
