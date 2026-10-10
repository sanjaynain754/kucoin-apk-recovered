package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;

    @Nullable
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private int startIconMinSize;
    private View.OnLongClickListener startIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType startIconScaleType;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    private void initPrefixTextView(TintTypedArray tintTypedArray) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(C7090R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.prefixTextView.setAccessibilityLiveRegion(1);
        setPrefixTextAppearance(tintTypedArray.getResourceId(C7090R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i11 = C7090R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i11)) {
            setPrefixTextColor(tintTypedArray.getColorStateList(i11));
        }
        setPrefixText(tintTypedArray.getText(C7090R.styleable.TextInputLayout_prefixText));
    }

    private void updateVisibility() {
        int i11 = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility((this.startIconView.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.prefixTextView.setVisibility(i11);
        this.textInputLayout.updateDummyDrawables();
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.startIconMinSize;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startIconScaleType;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z11) {
        this.hintExpanded = z11;
        updateVisibility();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixTextAppearance(@StyleRes int i11) {
        TextViewCompat.setTextAppearance(this.prefixTextView, i11);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z11) {
        this.startIconView.setCheckable(z11);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public void setStartIconMinSize(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i11 != this.startIconMinSize) {
            this.startIconMinSize = i11;
            IconHelper.setIconMinSize(this.startIconView, i11);
        }
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.startIconView, scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setupAccessibilityNodeInfo(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.prefixTextView.getVisibility() != 0) {
            accessibilityNodeInfoCompat.setTraversalAfter(this.startIconView);
        } else {
            accessibilityNodeInfoCompat.setLabelFor(this.prefixTextView);
            accessibilityNodeInfoCompat.setTraversalAfter(this.prefixTextView);
        }
    }

    public void updatePrefixTextViewPadding() {
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        this.prefixTextView.setPaddingRelative(isStartIconVisible() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C7090R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public StartCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C7090R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(tintTypedArray);
        initPrefixTextView(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initStartIconView(TintTypedArray tintTypedArray) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).setMarginEnd(0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i11 = C7090R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i11)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i11);
        }
        int i12 = C7090R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i12)) {
            this.startIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i12, -1), null);
        }
        int i13 = C7090R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i13)) {
            setStartIconDrawable(tintTypedArray.getDrawable(i13));
            int i14 = C7090R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i14)) {
                setStartIconContentDescription(tintTypedArray.getText(i14));
            }
            setStartIconCheckable(tintTypedArray.getBoolean(C7090R.styleable.TextInputLayout_startIconCheckable, true));
        }
        setStartIconMinSize(tintTypedArray.getDimensionPixelSize(C7090R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(C7090R.dimen.mtrl_min_touch_target_size)));
        int i15 = C7090R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i15)) {
            setStartIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(i15, -1)));
        }
    }

    public int getPrefixTextStartOffset() {
        int measuredWidth;
        if (isStartIconVisible()) {
            measuredWidth = this.startIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams()).getMarginEnd();
        } else {
            measuredWidth = 0;
        }
        return getPaddingStart() + this.prefixTextView.getPaddingStart() + measuredWidth;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        updatePrefixTextViewPadding();
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.prefixText = charSequence2;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconVisible(boolean z11) {
        int i11;
        if (isStartIconVisible() != z11) {
            CheckableImageButton checkableImageButton = this.startIconView;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            checkableImageButton.setVisibility(i11);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }
}
