package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.C7090R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
class EndCompoundLayout extends LinearLayout {

    @Nullable
    private final AccessibilityManager accessibilityManager;
    private EditText editText;
    private final TextWatcher editTextWatcher;
    private final LinkedHashSet<TextInputLayout.OnEndIconChangedListener> endIconChangedListeners;
    private final EndIconDelegates endIconDelegates;

    @NonNull
    private final FrameLayout endIconFrame;
    private int endIconMinSize;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;

    @NonNull
    private ImageView.ScaleType endIconScaleType;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;

    @NonNull
    private final CheckableImageButton endIconView;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;

    @NonNull
    private final CheckableImageButton errorIconView;
    private boolean hintExpanded;
    private final TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;

    @Nullable
    private CharSequence suffixText;

    @NonNull
    private final TextView suffixTextView;
    final TextInputLayout textInputLayout;

    @Nullable
    private AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public static class EndIconDelegates {
        private final int customEndIconDrawableId;
        private final SparseArray<EndIconDelegate> delegates = new SparseArray<>();
        private final EndCompoundLayout endLayout;
        private final int passwordIconDrawableId;

        private EndIconDelegate create(int i11) {
            if (i11 == -1) {
                return new CustomEndIconDelegate(this.endLayout);
            }
            if (i11 == 0) {
                return new NoEndIconDelegate(this.endLayout);
            }
            if (i11 == 1) {
                return new PasswordToggleEndIconDelegate(this.endLayout, this.passwordIconDrawableId);
            }
            if (i11 == 2) {
                return new ClearTextEndIconDelegate(this.endLayout);
            }
            if (i11 == 3) {
                return new DropdownMenuEndIconDelegate(this.endLayout);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i11);
        }

        public EndIconDelegate get(int i11) {
            EndIconDelegate endIconDelegate = this.delegates.get(i11);
            if (endIconDelegate != null) {
                return endIconDelegate;
            }
            EndIconDelegate endIconDelegateCreate = create(i11);
            this.delegates.append(i11, endIconDelegateCreate);
            return endIconDelegateCreate;
        }

        public EndIconDelegates(EndCompoundLayout endCompoundLayout, TintTypedArray tintTypedArray) {
            this.endLayout = endCompoundLayout;
            this.customEndIconDrawableId = tintTypedArray.getResourceId(C7090R.styleable.TextInputLayout_endIconDrawable, 0);
            this.passwordIconDrawableId = tintTypedArray.getResourceId(C7090R.styleable.TextInputLayout_passwordToggleDrawable, 0);
        }
    }

    public void setEndIconContentDescription(@StringRes int i11) {
        setEndIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setEndIconDrawable(@DrawableRes int i11) {
        setEndIconDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setErrorIconDrawable(@DrawableRes int i11) {
        setErrorIconDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
        refreshErrorIconDrawableState();
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int i11) {
        setPasswordVisibilityToggleContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i11) {
        setPasswordVisibilityToggleDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTouchExplorationStateChangeListenerIfNeeded() {
        if (this.touchExplorationStateChangeListener == null || this.accessibilityManager == null || !isAttachedToWindow()) {
            return;
        }
        this.accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
    }

    private CheckableImageButton createIconView(ViewGroup viewGroup, LayoutInflater layoutInflater, @IdRes int i11) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C7090R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i11);
        IconHelper.setCompatRippleBackgroundIfNeeded(checkableImageButton);
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void dispatchOnEndIconChanged(int i11) {
        Iterator<TextInputLayout.OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this.textInputLayout, i11);
        }
    }

    private int getIconResId(EndIconDelegate endIconDelegate) {
        int i11 = this.endIconDelegates.customEndIconDrawableId;
        return i11 == 0 ? endIconDelegate.getIconDrawableResId() : i11;
    }

    private void initEndIconView(TintTypedArray tintTypedArray) {
        int i11 = C7090R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!tintTypedArray.hasValue(i11)) {
            int i12 = C7090R.styleable.TextInputLayout_endIconTint;
            if (tintTypedArray.hasValue(i12)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i12);
            }
            int i13 = C7090R.styleable.TextInputLayout_endIconTintMode;
            if (tintTypedArray.hasValue(i13)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i13, -1), null);
            }
        }
        int i14 = C7090R.styleable.TextInputLayout_endIconMode;
        if (tintTypedArray.hasValue(i14)) {
            setEndIconMode(tintTypedArray.getInt(i14, 0));
            int i15 = C7090R.styleable.TextInputLayout_endIconContentDescription;
            if (tintTypedArray.hasValue(i15)) {
                setEndIconContentDescription(tintTypedArray.getText(i15));
            }
            setEndIconCheckable(tintTypedArray.getBoolean(C7090R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (tintTypedArray.hasValue(i11)) {
            int i16 = C7090R.styleable.TextInputLayout_passwordToggleTint;
            if (tintTypedArray.hasValue(i16)) {
                this.endIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i16);
            }
            int i17 = C7090R.styleable.TextInputLayout_passwordToggleTintMode;
            if (tintTypedArray.hasValue(i17)) {
                this.endIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i17, -1), null);
            }
            setEndIconMode(tintTypedArray.getBoolean(i11, false) ? 1 : 0);
            setEndIconContentDescription(tintTypedArray.getText(C7090R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        setEndIconMinSize(tintTypedArray.getDimensionPixelSize(C7090R.styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(C7090R.dimen.mtrl_min_touch_target_size)));
        int i18 = C7090R.styleable.TextInputLayout_endIconScaleType;
        if (tintTypedArray.hasValue(i18)) {
            setEndIconScaleType(IconHelper.convertScaleType(tintTypedArray.getInt(i18, -1)));
        }
    }

    private void initErrorIconView(TintTypedArray tintTypedArray) {
        int i11 = C7090R.styleable.TextInputLayout_errorIconTint;
        if (tintTypedArray.hasValue(i11)) {
            this.errorIconTintList = MaterialResources.getColorStateList(getContext(), tintTypedArray, i11);
        }
        int i12 = C7090R.styleable.TextInputLayout_errorIconTintMode;
        if (tintTypedArray.hasValue(i12)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(tintTypedArray.getInt(i12, -1), null);
        }
        int i13 = C7090R.styleable.TextInputLayout_errorIconDrawable;
        if (tintTypedArray.hasValue(i13)) {
            setErrorIconDrawable(tintTypedArray.getDrawable(i13));
        }
        this.errorIconView.setContentDescription(getResources().getText(C7090R.string.error_icon_content_description));
        this.errorIconView.setImportantForAccessibility(2);
        this.errorIconView.setClickable(false);
        this.errorIconView.setPressable(false);
        this.errorIconView.setCheckable(false);
        this.errorIconView.setFocusable(false);
    }

    private void initSuffixTextView(TintTypedArray tintTypedArray) {
        this.suffixTextView.setVisibility(8);
        this.suffixTextView.setId(C7090R.id.textinput_suffix_text);
        this.suffixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.suffixTextView.setAccessibilityLiveRegion(1);
        setSuffixTextAppearance(tintTypedArray.getResourceId(C7090R.styleable.TextInputLayout_suffixTextAppearance, 0));
        int i11 = C7090R.styleable.TextInputLayout_suffixTextColor;
        if (tintTypedArray.hasValue(i11)) {
            setSuffixTextColor(tintTypedArray.getColorStateList(i11));
        }
        setSuffixText(tintTypedArray.getText(C7090R.styleable.TextInputLayout_suffixText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTouchExplorationStateChangeListenerIfNeeded() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.touchExplorationStateChangeListener;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.accessibilityManager) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnFocusChangeListenersIfNeeded(EndIconDelegate endIconDelegate) {
        if (this.editText == null) {
            return;
        }
        if (endIconDelegate.getOnEditTextFocusChangeListener() != null) {
            this.editText.setOnFocusChangeListener(endIconDelegate.getOnEditTextFocusChangeListener());
        }
        if (endIconDelegate.getOnIconViewFocusChangeListener() != null) {
            this.endIconView.setOnFocusChangeListener(endIconDelegate.getOnIconViewFocusChangeListener());
        }
    }

    private void tintEndIconOnError(boolean z11) {
        if (!z11 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(getEndIconDrawable()).mutate();
        drawableMutate.setTint(this.textInputLayout.getErrorCurrentTextColors());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        setVisibility((isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || this.hintExpanded) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i11 = (this.suffixText == null || this.hintExpanded) ? 8 : 0;
        if (visibility != i11) {
            getEndIconDelegate().onSuffixVisibilityChanged(i11 == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i11);
        this.textInputLayout.updateDummyDrawables();
    }

    public void addOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    public void checkEndIcon() {
        this.endIconView.performClick();
        this.endIconView.jumpDrawablesToCurrentState();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public EndIconDelegate getEndIconDelegate() {
        return this.endIconDelegates.get(this.endIconMode);
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.endIconMinSize;
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endIconScaleType;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    @Nullable
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Nullable
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public void onHintStateChanged(boolean z11) {
        this.hintExpanded = z11;
        updateSuffixTextVisibility();
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.errorIconView, this.errorIconTintList);
    }

    public void removeOnEndIconChangedListener(@NonNull TextInputLayout.OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setEndIconActivated(boolean z11) {
        this.endIconView.setActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.endIconView.setCheckable(z11);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setEndIconMinSize(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i11 != this.endIconMinSize) {
            this.endIconMinSize = i11;
            IconHelper.setIconMinSize(this.endIconView, i11);
            IconHelper.setIconMinSize(this.errorIconView, i11);
        }
    }

    public void setEndIconMode(int i11) {
        if (this.endIconMode == i11) {
            return;
        }
        tearDownDelegate(getEndIconDelegate());
        int i12 = this.endIconMode;
        this.endIconMode = i11;
        dispatchOnEndIconChanged(i12);
        setEndIconVisible(i11 != 0);
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        setEndIconDrawable(getIconResId(endIconDelegate));
        setEndIconContentDescription(endIconDelegate.getIconContentDescriptionResId());
        setEndIconCheckable(endIconDelegate.isIconCheckable());
        if (!endIconDelegate.isBoxBackgroundModeSupported(this.textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i11);
        }
        setUpDelegate(endIconDelegate);
        setEndIconOnClickListener(endIconDelegate.getOnIconClickListener());
        EditText editText = this.editText;
        if (editText != null) {
            endIconDelegate.onEditTextAttached(editText);
            setOnFocusChangeListenersIfNeeded(endIconDelegate);
        }
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, this.endIconTintMode);
        refreshIconState(true);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endIconScaleType = scaleType;
        IconHelper.setIconScaleType(this.endIconView, scaleType);
        IconHelper.setIconScaleType(this.errorIconView, scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        if (z11 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z11) {
                return;
            }
            setEndIconMode(0);
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, colorStateList, this.endIconTintMode);
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this.textInputLayout, this.endIconView, this.endIconTintList, mode);
    }

    public void setSuffixTextAppearance(@StyleRes int i11) {
        TextViewCompat.setTextAppearance(this.suffixTextView, i11);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void togglePasswordVisibilityToggle(boolean z11) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z11) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void updateSuffixTextViewPadding() {
        if (this.textInputLayout.editText == null) {
            return;
        }
        this.suffixTextView.setPaddingRelative(getContext().getResources().getDimensionPixelSize(C7090R.dimen.material_input_text_to_prefix_suffix_padding), this.textInputLayout.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : this.textInputLayout.editText.getPaddingEnd(), this.textInputLayout.editText.getPaddingBottom());
    }

    public EndCompoundLayout(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.endIconMode = 0;
        this.endIconChangedListeners = new LinkedHashSet<>();
        this.editTextWatcher = new TextWatcherAdapter() { // from class: com.google.android.material.textfield.EndCompoundLayout.1
            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                EndCompoundLayout.this.getEndIconDelegate().afterEditTextChanged(editable);
            }

            @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                EndCompoundLayout.this.getEndIconDelegate().beforeEditTextChanged(charSequence, i11, i12, i13);
            }
        };
        TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener = new TextInputLayout.OnEditTextAttachedListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.2
            @Override // com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener
            public void onEditTextAttached(@NonNull TextInputLayout textInputLayout2) {
                if (EndCompoundLayout.this.editText == textInputLayout2.getEditText()) {
                    return;
                }
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.removeTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                    if (EndCompoundLayout.this.editText.getOnFocusChangeListener() == EndCompoundLayout.this.getEndIconDelegate().getOnEditTextFocusChangeListener()) {
                        EndCompoundLayout.this.editText.setOnFocusChangeListener(null);
                    }
                }
                EndCompoundLayout.this.editText = textInputLayout2.getEditText();
                if (EndCompoundLayout.this.editText != null) {
                    EndCompoundLayout.this.editText.addTextChangedListener(EndCompoundLayout.this.editTextWatcher);
                }
                EndCompoundLayout.this.getEndIconDelegate().onEditTextAttached(EndCompoundLayout.this.editText);
                EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
                endCompoundLayout.setOnFocusChangeListenersIfNeeded(endCompoundLayout.getEndIconDelegate());
            }
        };
        this.onEditTextAttachedListener = onEditTextAttachedListener;
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.endIconFrame = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonCreateIconView = createIconView(this, layoutInflaterFrom, C7090R.id.text_input_error_icon);
        this.errorIconView = checkableImageButtonCreateIconView;
        CheckableImageButton checkableImageButtonCreateIconView2 = createIconView(frameLayout, layoutInflaterFrom, C7090R.id.text_input_end_icon);
        this.endIconView = checkableImageButtonCreateIconView2;
        this.endIconDelegates = new EndIconDelegates(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.suffixTextView = appCompatTextView;
        initErrorIconView(tintTypedArray);
        initEndIconView(tintTypedArray);
        initSuffixTextView(tintTypedArray);
        frameLayout.addView(checkableImageButtonCreateIconView2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonCreateIconView);
        textInputLayout.addOnEditTextAttachedListener(onEditTextAttachedListener);
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.textfield.EndCompoundLayout.3
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                EndCompoundLayout.this.addTouchExplorationStateChangeListenerIfNeeded();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                EndCompoundLayout.this.removeTouchExplorationStateChangeListenerIfNeeded();
            }
        });
    }

    private void setUpDelegate(@NonNull EndIconDelegate endIconDelegate) {
        endIconDelegate.setUp();
        this.touchExplorationStateChangeListener = endIconDelegate.getTouchExplorationStateChangeListener();
        addTouchExplorationStateChangeListenerIfNeeded();
    }

    private void tearDownDelegate(@NonNull EndIconDelegate endIconDelegate) {
        removeTouchExplorationStateChangeListenerIfNeeded();
        this.touchExplorationStateChangeListener = null;
        endIconDelegate.tearDown();
    }

    private void updateErrorIconVisibility() {
        boolean z11;
        int i11 = 0;
        if (getErrorIconDrawable() != null && this.textInputLayout.isErrorEnabled() && this.textInputLayout.shouldShowError()) {
            z11 = true;
        } else {
            z11 = false;
        }
        CheckableImageButton checkableImageButton = this.errorIconView;
        if (!z11) {
            i11 = 8;
        }
        checkableImageButton.setVisibility(i11);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (!hasEndIcon()) {
            this.textInputLayout.updateDummyDrawables();
        }
    }

    @Nullable
    public CheckableImageButton getCurrentEndIconView() {
        if (isErrorIconVisible()) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    public int getSuffixTextEndOffset() {
        int measuredWidth;
        if (!isEndIconVisible() && !isErrorIconVisible()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.endIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.endIconView.getLayoutParams()).getMarginStart();
        }
        return getPaddingEnd() + this.suffixTextView.getPaddingEnd() + measuredWidth;
    }

    public boolean isEndIconChecked() {
        if (hasEndIcon() && this.endIconView.isChecked()) {
            return true;
        }
        return false;
    }

    public void onTextInputBoxStateUpdated() {
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.textInputLayout.shouldShowError());
        }
    }

    public void refreshIconState(boolean z11) {
        boolean z12;
        boolean zIsActivated;
        boolean zIsChecked;
        EndIconDelegate endIconDelegate = getEndIconDelegate();
        boolean z13 = true;
        if (endIconDelegate.isIconCheckable() && (zIsChecked = this.endIconView.isChecked()) != endIconDelegate.isIconChecked()) {
            this.endIconView.setChecked(!zIsChecked);
            z12 = true;
        } else {
            z12 = false;
        }
        if (endIconDelegate.isIconActivable() && (zIsActivated = this.endIconView.isActivated()) != endIconDelegate.isIconActivated()) {
            setEndIconActivated(!zIsActivated);
        } else {
            z13 = z12;
        }
        if (!z11 && !z13) {
            return;
        }
        refreshEndIconDrawableState();
    }

    public void setEndIconVisible(boolean z11) {
        int i11;
        if (isEndIconVisible() != z11) {
            CheckableImageButton checkableImageButton = this.endIconView;
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            checkableImageButton.setVisibility(i11);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            this.textInputLayout.updateDummyDrawables();
        }
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this.textInputLayout, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.suffixText = charSequence2;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }
}
