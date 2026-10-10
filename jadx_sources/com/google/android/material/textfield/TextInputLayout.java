package com.google.android.material.textfield;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0467R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.C7090R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.StaticLayoutBuilderConfigurer;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.CornerTreatment;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEFAULT_PLACEHOLDER_FADE_DURATION = 87;
    private static final int DEF_STYLE_RES = C7090R.style.Widget_Design_TextInputLayout;
    private static final int[][] EDIT_TEXT_BACKGROUND_RIPPLE_STATE = {new int[]{R.attr.state_pressed}, new int[0]};
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final int PLACEHOLDER_START_DELAY = 67;
    private static final String TAG = "TextInputLayout";
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;

    @Nullable
    private MaterialShapeDrawable boxBackground;
    private boolean boxBackgroundApplied;

    @ColorInt
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;

    @ColorInt
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;

    @Nullable
    private MaterialShapeDrawable boxUnderlineDefault;

    @Nullable
    private MaterialShapeDrawable boxUnderlineFocused;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;

    @Nullable
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;

    @Nullable
    private ColorStateList counterTextColor;

    @Nullable
    private TextView counterView;

    @Nullable
    private ColorStateList cursorColor;

    @Nullable
    private ColorStateList cursorErrorColor;

    @ColorInt
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;

    @ColorInt
    private int defaultStrokeColor;

    @ColorInt
    private int disabledColor;

    @ColorInt
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;

    @Nullable
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;

    @NonNull
    private final EndCompoundLayout endLayout;
    private boolean expandedHintEnabled;
    private final int extraSpaceBetweenPlaceholderAndHint;
    private StateListDrawable filledDropDownMenuBackground;

    @ColorInt
    private int focusedFilledBackgroundColor;

    @ColorInt
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean globalLayoutListenerAdded;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;

    @ColorInt
    private int hoveredFilledBackgroundColor;

    @ColorInt
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;

    @NonNull
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;

    @NonNull
    private LengthCounter lengthCounter;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    int originalEditTextMinimumHeight;
    private CharSequence originalHint;
    private MaterialShapeDrawable outlinedDropDownMenuBackground;
    private boolean placeholderEnabled;

    @Nullable
    private Fade placeholderFadeIn;

    @Nullable
    private Fade placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;

    @Nullable
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;

    @NonNull
    private ShapeAppearanceModel shapeAppearanceModel;

    @Nullable
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;

    @NonNull
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    /* JADX INFO: loaded from: classes45.dex */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface EndIconMode {
    }

    public interface LengthCounter {
        int countLength(@Nullable Editable editable);
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(@NonNull TextInputLayout textInputLayout);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public interface OnEndIconChangedListener {
        void onEndIconChanged(@NonNull TextInputLayout textInputLayout, int i11);
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @Nullable
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @Nullable
        CharSequence error;
        boolean isEndIconChecked;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.error) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.error, parcel, i11);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
        }
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? null : editText.getText());
        }
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? null : editText.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public void setEndIconContentDescription(@StringRes int i11) {
        this.endLayout.setEndIconContentDescription(i11);
    }

    public void setEndIconDrawable(@DrawableRes int i11) {
        this.endLayout.setEndIconDrawable(i11);
    }

    public void setErrorIconDrawable(@DrawableRes int i11) {
        this.endLayout.setErrorIconDrawable(i11);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i11) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i11) {
        this.endLayout.setPasswordVisibilityToggleDrawable(i11);
    }

    public void setStartIconContentDescription(@StringRes int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i11) {
        setStartIconDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void updateLabelState(boolean z11) {
        updateLabelState(z11, false);
    }

    public static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final TextInputLayout layout;

        public AccessibilityDelegate(@NonNull TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence text;
            boolean z11;
            String string;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.layout.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zIsHintExpanded = this.layout.isHintExpanded();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            if (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!zIsEmpty2) {
                string = hint.toString();
            } else {
                string = "";
            }
            this.layout.startLayout.setupAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            if (!zIsEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfoCompat.setText(string);
                if (!zIsHintExpanded && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    accessibilityNodeInfoCompat.setText(string);
                }
                accessibilityNodeInfoCompat.setShowingHintText(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                accessibilityNodeInfoCompat.setLabelFor(helperTextView);
            }
            this.layout.endLayout.getEndIconDelegate().onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.layout.endLayout.getEndIconDelegate().onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C7090R.attr.textInputStyle);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (!isHintTextSingleLine()) {
            EditText editText = this.editText;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.collapsingTextHelper.getCollapsedTextHeight() + this.extraSpaceBetweenPlaceholderAndHint), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(C7090R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            EditText editText2 = this.editText;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C7090R.dimen.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(C7090R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            EditText editText3 = this.editText;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(C7090R.dimen.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(C7090R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        applyBoxUnderlineAttributes();
        updateEditTextBoxBackgroundIfNeeded();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.setFillColor(this.editText.isFocused() ? ColorStateList.valueOf(this.defaultStrokeColor) : ColorStateList.valueOf(this.boxStrokeColor));
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(@NonNull RectF rectF) {
        float f11 = rectF.left;
        int i11 = this.boxLabelCutoutPaddingPx;
        rectF.left = f11 - i11;
        rectF.right += i11;
    }

    private void assignBoxBackgroundByMode() {
        int i11 = this.boxBackgroundMode;
        if (i11 == 0) {
            this.boxBackground = null;
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
            return;
        }
        if (i11 == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) {
                this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            } else {
                this.boxBackground = CutoutDrawable.create(this.shapeAppearanceModel);
            }
            this.boxUnderlineDefault = null;
            this.boxUnderlineFocused = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m13196c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? MaterialColors.layer(MaterialColors.getColor(this, C7090R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    @NonNull
    private Rect calculateCollapsedTextBounds(@NonNull Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i11 = this.boxBackgroundMode;
        if (i11 == 1) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = getLabelLeftBoundAlignedWithPrefixAndSuffix(rect.left, zIsLayoutRtl);
            rect2.top = getPaddingTop();
            rect2.right = getLabelRightBoundAlignedWithPrefixAndSuffix(rect.right, zIsLayoutRtl);
            return rect2;
        }
        rect2.left = rect.left + this.editText.getPaddingLeft();
        rect2.top = rect.top - calculateLabelMarginTop();
        rect2.right = rect.right - this.editText.getPaddingRight();
        return rect2;
    }

    @NonNull
    private Rect calculateExpandedTextBounds(@NonNull Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextSingleLineHeight = isHintTextSingleLine() ? this.collapsingTextHelper.getExpandedTextSingleLineHeight() : this.collapsingTextHelper.getExpandedTextFullSingleLineHeight() * this.collapsingTextHelper.getExpandedLineCount();
        rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
        rect2.top = calculateExpandedLabelTop(rect, expandedTextSingleLineHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextSingleLineHeight);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        if (!this.hintEnabled) {
            return 0;
        }
        int i11 = this.boxBackgroundMode;
        if (i11 == 0) {
            return (int) this.collapsingTextHelper.getCollapsedTextHeight();
        }
        if (i11 != 2) {
            return 0;
        }
        return isHintTextSingleLine() ? (int) (this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f) : Math.max(0, (int) (this.collapsingTextHelper.getCollapsedTextHeight() - (this.collapsingTextHelper.getCollapsedSingleLineHeight() / 2.0f)));
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void collapseHint(boolean z11) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z11 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        this.endLayout.onHintStateChanged(false);
    }

    private Fade createPlaceholderFadeTransition() {
        Fade fade = new Fade();
        fade.setDuration(MotionUtils.resolveThemeDuration(getContext(), C7090R.attr.motionDurationShort2, 87));
        fade.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C7090R.attr.motionEasingLinearInterpolator, AnimationUtils.LINEAR_INTERPOLATOR));
        return fade;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(@NonNull Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z11) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z11 && this.hintAnimationEnabled) {
            animateToExpansionFraction(0.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        this.endLayout.onHintStateChanged(true);
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.editText;
        if (!(editText instanceof AutoCompleteTextView) || EditTextUtils.isEditable(editText)) {
            return this.boxBackground;
        }
        int color = MaterialColors.getColor(this.editText, C0467R.attr.colorControlHighlight);
        int i11 = this.boxBackgroundMode;
        if (i11 == 2) {
            return getOutlinedBoxBackgroundWithRipple(getContext(), this.boxBackground, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        if (i11 == 1) {
            return getFilledBoxBackgroundWithRipple(this.boxBackground, this.boxBackgroundColor, color, EDIT_TEXT_BACKGROUND_RIPPLE_STATE);
        }
        return null;
    }

    private int getLabelLeftBoundAlignedWithPrefixAndSuffix(int i11, boolean z11) {
        int compoundPaddingLeft;
        if (z11 || getPrefixText() == null) {
            compoundPaddingLeft = (!z11 || getSuffixText() == null) ? this.editText.getCompoundPaddingLeft() : this.endLayout.getSuffixTextEndOffset();
        } else {
            compoundPaddingLeft = this.startLayout.getPrefixTextStartOffset();
        }
        return i11 + compoundPaddingLeft;
    }

    private int getLabelRightBoundAlignedWithPrefixAndSuffix(int i11, boolean z11) {
        int compoundPaddingRight;
        if (z11 || getSuffixText() == null) {
            compoundPaddingRight = (!z11 || getPrefixText() == null) ? this.editText.getCompoundPaddingRight() : this.startLayout.getPrefixTextStartOffset();
        } else {
            compoundPaddingRight = this.endLayout.getSuffixTextEndOffset();
        }
        return i11 - compoundPaddingRight;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.filledDropDownMenuBackground == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.filledDropDownMenuBackground = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.filledDropDownMenuBackground.addState(new int[0], getDropDownMaterialShapeDrawable(false));
        }
        return this.filledDropDownMenuBackground;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.outlinedDropDownMenuBackground == null) {
            this.outlinedDropDownMenuBackground = getDropDownMaterialShapeDrawable(true);
        }
        return this.outlinedDropDownMenuBackground;
    }

    private static Drawable getOutlinedBoxBackgroundWithRipple(Context context, MaterialShapeDrawable materialShapeDrawable, int i11, int[][] iArr) {
        int color = MaterialColors.getColor(context, C7090R.attr.colorSurface, "TextInputLayout");
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        int iLayer = MaterialColors.layer(i11, color, 0.1f);
        materialShapeDrawable2.setFillColor(new ColorStateList(iArr, new int[]{iLayer, 0}));
        materialShapeDrawable2.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLayer, color});
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(materialShapeDrawable.getShapeAppearanceModel());
        materialShapeDrawable3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, materialShapeDrawable2, materialShapeDrawable3), materialShapeDrawable});
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setDropDownMenuBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.boxBackgroundMode;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i11 = this.minEms;
        if (i11 != -1) {
            setMinEms(i11);
        } else {
            setMinWidth(this.minWidth);
        }
        int i12 = this.maxEms;
        if (i12 != -1) {
            setMaxEms(i12);
        } else {
            setMaxWidth(this.maxWidth);
        }
        this.boxBackgroundApplied = false;
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.originalEditTextMinimumHeight = editText.getMinimumHeight();
        this.editText.addTextChangedListener(new TextWatcher(editText) { // from class: com.google.android.material.textfield.TextInputLayout.1
            int previousLineCount;
            final /* synthetic */ EditText val$editText;

            {
                this.val$editText = editText;
                this.previousLineCount = editText.getLineCount();
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(@NonNull Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
                TextInputLayout textInputLayout2 = TextInputLayout.this;
                if (textInputLayout2.counterEnabled) {
                    textInputLayout2.updateCounter(editable);
                }
                if (TextInputLayout.this.placeholderEnabled) {
                    TextInputLayout.this.updatePlaceholderText(editable);
                }
                int lineCount = this.val$editText.getLineCount();
                int i13 = this.previousLineCount;
                if (lineCount != i13) {
                    if (lineCount < i13) {
                        int minimumHeight = this.val$editText.getMinimumHeight();
                        int i14 = TextInputLayout.this.originalEditTextMinimumHeight;
                        if (minimumHeight != i14) {
                            this.val$editText.setMinimumHeight(i14);
                        }
                    }
                    this.previousLineCount = lineCount;
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        dispatchOnEditTextAttached();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.placeholderEnabled == z11) {
            return;
        }
        if (z11) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z11;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.endLayout.isErrorIconVisible() || ((this.endLayout.hasEndIcon() && isEndIconVisible()) || this.endLayout.getSuffixText() != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        TransitionManager.beginDelayedTransition(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C7090R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(C7090R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    private void updateBoxUnderlineBounds(@NonNull Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i11 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i11 - this.boxStrokeWidthDefaultPx, rect.right, i11);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i12 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i12 - this.boxStrokeWidthFocusedPx, rect.right, i12);
        }
    }

    private void updateCollapsingTextDimens(int i11) {
        this.collapsingTextHelper.updateTextHeights(i11);
        Rect rect = this.tmpRect;
        DescendantOffsetUtils.getDescendantRect(this, this.editText, rect);
        this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
        updateInputLayoutMargins();
        adjustFilledEditTextPaddingForLargeFont();
        updateEditTextHeight(i11);
    }

    private static void updateCounterContentDescription(@NonNull Context context, @NonNull TextView textView, int i11, int i12, boolean z11) {
        textView.setContentDescription(context.getString(z11 ? C7090R.string.character_counter_overflowed_content_description : C7090R.string.character_counter_content_description, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    @RequiresApi(29)
    private void updateCursorColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateListOrNull = this.cursorColor;
        if (colorStateListOrNull == null) {
            colorStateListOrNull = MaterialColors.getColorStateListOrNull(getContext(), C0467R.attr.colorControlActivated);
        }
        EditText editText = this.editText;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = DrawableCompat.wrap(this.editText.getTextCursorDrawable()).mutate();
        if (isOnError() && (colorStateList = this.cursorErrorColor) != null) {
            colorStateListOrNull = colorStateList;
        }
        drawableMutate.setTintList(colorStateListOrNull);
    }

    private void updateEditTextHeight(int i11) {
        if (this.editText == null) {
            return;
        }
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        float height = 0.0f;
        if (this.placeholderText != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.placeholderTextView.getPaint());
            textPaint.setTextSize(this.placeholderTextView.getTextSize());
            textPaint.setTypeface(this.placeholderTextView.getTypeface());
            textPaint.setLetterSpacing(this.placeholderTextView.getLetterSpacing());
            try {
                height = StaticLayoutBuilderCompat.obtain(this.placeholderText, textPaint, i11).setIsRtl(getLayoutDirection() == 1).setIncludePad(true).setLineSpacing(this.placeholderTextView.getLineSpacingExtra(), this.placeholderTextView.getLineSpacingMultiplier()).setStaticLayoutBuilderConfigurer(new StaticLayoutBuilderConfigurer() { // from class: com.google.android.material.textfield.x
                    @Override // com.google.android.material.internal.StaticLayoutBuilderConfigurer
                    public final void configure(StaticLayout.Builder builder) {
                        builder.setBreakStrategy(this.f11935a.placeholderTextView.getBreakStrategy());
                    }
                }).build().getHeight() + (this.boxBackgroundMode == 1 ? this.collapsingTextHelper.getCollapsedTextHeight() + this.boxCollapsedPaddingTopPx + this.extraSpaceBetweenPlaceholderAndHint : 0.0f);
            } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e11) {
                Log.e("TextInputLayout", e11.getCause().getMessage(), e11);
            }
        }
        float fMax = Math.max(expandedTextHeight, height);
        if (this.editText.getMeasuredHeight() < fMax) {
            this.editText.setMinimumHeight(Math.round(fMax));
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updateLabelState(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z13 = false;
        boolean z14 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor));
        } else if (shouldShowError()) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.setCollapsedAndExpandedTextColor(textView.getTextColors());
        } else if (z13 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
        }
        if (z14 || !this.expandedHintEnabled || (isEnabled() && z13)) {
            if (z12 || this.hintExpanded) {
                collapseHint(z11);
                return;
            }
            return;
        }
        if (z12 || !this.hintExpanded) {
            expandHint(z11);
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(@Nullable Editable editable) {
        if (this.lengthCounter.countLength(editable) != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    private void updateStrokeErrorColor(boolean z11, boolean z12) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.boxStrokeColor = colorForState2;
        } else if (z12) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    public void addOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.addOnEndIconChangedListener(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    @VisibleForTesting
    public void animateToExpansionFraction(float f11) {
        if (this.collapsingTextHelper.getExpansionFraction() == f11) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), C7090R.attr.motionEasingEmphasizedInterpolator, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            this.animator.setDuration(MotionUtils.resolveThemeDuration(getContext(), C7090R.attr.motionDurationMedium4, 167));
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f11);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endLayout.clearOnEndIconChangedListeners();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i11) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.originalHint != null) {
            boolean z11 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i12 = 0; i12 < this.inputFrame.getChildCount(); i12++) {
            View childAt = this.inputFrame.getChildAt(i12);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i11);
            if (childAt == this.editText) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) : false;
        if (this.editText != null) {
            updateLabelState(isLaidOut() && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        return editText != null ? editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop() : super.getBaseline();
    }

    @NonNull
    public MaterialShapeDrawable getBoxBackground() {
        int i11 = this.boxBackgroundMode;
        if (i11 == 1 || i11 == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.counterOverflowTextColor;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.cursorColor;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.cursorErrorColor;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @Nullable
    public EditText getEditText() {
        return this.editText;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.endLayout.getEndIconContentDescription();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.endLayout.getEndIconDrawable();
    }

    public int getEndIconMinSize() {
        return this.endLayout.getEndIconMinSize();
    }

    public int getEndIconMode() {
        return this.endLayout.getEndIconMode();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.endLayout.getEndIconScaleType();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.endLayout.getEndIconView();
    }

    @Nullable
    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.indicatorViewController.getErrorAccessibilityLiveRegion();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.endLayout.getErrorIconDrawable();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    public int getHintMaxLines() {
        return this.collapsingTextHelper.getExpandedMaxLines();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @NonNull
    public LengthCounter getLengthCounter() {
        return this.lengthCounter;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    @Px
    public int getMinWidth() {
        return this.minWidth;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endLayout.getPasswordVisibilityToggleContentDescription();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endLayout.getPasswordVisibilityToggleDrawable();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    @NonNull
    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public int getStartIconMinSize() {
        return this.startLayout.getStartIconMinSize();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.startLayout.getStartIconScaleType();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.endLayout.getSuffixText();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.endLayout.getSuffixTextColor();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.endLayout.getSuffixTextView();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endLayout.isEndIconCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endLayout.isEndIconVisible();
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    @VisibleForTesting
    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endLayout.isPasswordVisibilityToggleEnabled();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.endLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.globalLayoutListenerAdded = false;
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new Runnable() { // from class: com.google.android.material.textfield.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11934b.editText.requestLayout();
                }
            });
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.endLayout.checkEndIcon();
                }
            });
        }
        requestLayout();
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z11) {
        this.endLayout.togglePasswordVisibilityToggle(z11);
    }

    public void refreshEndIconDrawableState() {
        this.endLayout.refreshEndIconDrawableState();
    }

    public void refreshErrorIconDrawableState() {
        this.endLayout.refreshErrorIconDrawableState();
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(@NonNull OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(@NonNull OnEndIconChangedListener onEndIconChangedListener) {
        this.endLayout.removeOnEndIconChangedListener(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(@ColorInt int i11) {
        if (this.boxBackgroundColor != i11) {
            this.boxBackgroundColor = i11;
            this.defaultFilledBackgroundColor = i11;
            this.focusedFilledBackgroundColor = i11;
            this.hoveredFilledBackgroundColor = i11;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i11;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.boxCollapsedPaddingTopPx = i11;
    }

    public void setBoxCornerFamily(int i11) {
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCorner(i11, this.shapeAppearanceModel.getTopLeftCornerSize()).setTopRightCorner(i11, this.shapeAppearanceModel.getTopRightCornerSize()).setBottomLeftCorner(i11, this.shapeAppearanceModel.getBottomLeftCornerSize()).setBottomRightCorner(i11, this.shapeAppearanceModel.getBottomRightCornerSize()).build();
        applyBoxAttributes();
    }

    public void setBoxStrokeColor(@ColorInt int i11) {
        if (this.focusedStrokeColor != i11) {
            this.focusedStrokeColor = i11;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.boxStrokeWidthDefaultPx = i11;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.boxStrokeWidthFocusedPx = i11;
        updateTextInputBoxState();
    }

    public void setCounterEnabled(boolean z11) {
        if (this.counterEnabled != z11) {
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(C7090R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C7090R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.counterMaxLength != i11) {
            if (i11 > 0) {
                this.counterMaxLength = i11;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.counterOverflowTextAppearance != i11) {
            this.counterOverflowTextAppearance = i11;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.counterTextAppearance != i11) {
            this.counterTextAppearance = i11;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.cursorColor != colorStateList) {
            this.cursorColor = colorStateList;
            updateCursorColor();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.cursorErrorColor != colorStateList) {
            this.cursorErrorColor = colorStateList;
            if (isOnError()) {
                updateCursorColor();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public void setEndIconActivated(boolean z11) {
        this.endLayout.setEndIconActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.endLayout.setEndIconCheckable(z11);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.endLayout.setEndIconContentDescription(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.endLayout.setEndIconDrawable(drawable);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i11) {
        this.endLayout.setEndIconMinSize(i11);
    }

    public void setEndIconMode(int i11) {
        this.endLayout.setEndIconMode(i11);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.endLayout.setEndIconOnClickListener(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endLayout.setEndIconOnLongClickListener(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.endLayout.setEndIconScaleType(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setEndIconTintList(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setEndIconTintMode(mode);
    }

    public void setEndIconVisible(boolean z11) {
        this.endLayout.setEndIconVisible(z11);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.hideError();
        } else {
            this.indicatorViewController.showError(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i11) {
        this.indicatorViewController.setErrorAccessibilityLiveRegion(i11);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public void setErrorEnabled(boolean z11) {
        this.indicatorViewController.setErrorEnabled(z11);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.endLayout.setErrorIconDrawable(drawable);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.endLayout.setErrorIconOnClickListener(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.endLayout.setErrorIconOnLongClickListener(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setErrorIconTintList(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setErrorIconTintMode(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i11) {
        this.indicatorViewController.setErrorTextAppearance(i11);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.expandedHintEnabled != z11) {
            this.expandedHintEnabled = z11;
            updateLabelState(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        this.indicatorViewController.setHelperTextEnabled(z11);
    }

    public void setHelperTextTextAppearance(@StyleRes int i11) {
        this.indicatorViewController.setHelperTextAppearance(i11);
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.hintAnimationEnabled = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.hintEnabled) {
            this.hintEnabled = z11;
            if (z11) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintMaxLines(int i11) {
        this.collapsingTextHelper.setCollapsedMaxLines(i11);
        this.collapsingTextHelper.setExpandedMaxLines(i11);
        requestLayout();
    }

    public void setHintTextAppearance(@StyleRes int i11) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i11);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setLengthCounter(@NonNull LengthCounter lengthCounter) {
        this.lengthCounter = lengthCounter;
    }

    public void setMaxEms(int i11) {
        this.maxEms = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxEms(i11);
    }

    public void setMaxWidth(@Px int i11) {
        this.maxWidth = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMinEms(int i11) {
        this.minEms = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinEms(i11);
    }

    public void setMinWidth(@Px int i11) {
        this.minWidth = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.endLayout.setPasswordVisibilityToggleContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.endLayout.setPasswordVisibilityToggleDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        this.endLayout.setPasswordVisibilityToggleEnabled(z11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.endLayout.setPasswordVisibilityToggleTintList(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.endLayout.setPasswordVisibilityToggleTintMode(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(C7090R.id.textinput_placeholder);
            this.placeholderTextView.setImportantForAccessibility(1);
            this.placeholderTextView.setAccessibilityLiveRegion(1);
            Fade fadeCreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = fadeCreatePlaceholderFadeTransition;
            fadeCreatePlaceholderFadeTransition.setStartDelay(67L);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
            ViewCompat.setAccessibilityDelegate(this.placeholderTextView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setVisibleToUser(false);
                }
            });
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i11) {
        this.placeholderTextAppearance = i11;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i11);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i11) {
        this.startLayout.setPrefixTextAppearance(i11);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null || materialShapeDrawable.getShapeAppearanceModel() == shapeAppearanceModel) {
            return;
        }
        this.shapeAppearanceModel = shapeAppearanceModel;
        applyBoxAttributes();
    }

    public void setStartIconCheckable(boolean z11) {
        this.startLayout.setStartIconCheckable(z11);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i11) {
        this.startLayout.setStartIconMinSize(i11);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.startLayout.setStartIconScaleType(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z11) {
        this.startLayout.setStartIconVisible(z11);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.endLayout.setSuffixText(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i11) {
        this.endLayout.setSuffixTextAppearance(i11);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.endLayout.setSuffixTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public boolean shouldShowError() {
        return this.indicatorViewController.errorShouldBeShown();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public boolean updateDummyDrawables() {
        boolean z11;
        if (this.editText == null) {
            return false;
        }
        boolean z12 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.editText.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                this.editText.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (this.startDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative2 = this.editText.getCompoundDrawablesRelative();
            this.editText.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.startDummyDrawable = null;
            z11 = true;
        } else {
            z11 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.endLayout.getSuffixTextView().getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton currentEndIconView = this.endLayout.getCurrentEndIconView();
            if (currentEndIconView != null) {
                measuredWidth2 = measuredWidth2 + currentEndIconView.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) currentEndIconView.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.editText.getCompoundDrawablesRelative();
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.endDummyDrawable, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.endDummyDrawable = colorDrawable2;
                this.endDummyDrawableWidth = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.endDummyDrawable;
            if (drawable4 != drawable5) {
                this.originalEditTextEndDrawable = drawable4;
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.endDummyDrawable != null) {
            Drawable[] compoundDrawablesRelative4 = this.editText.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.endDummyDrawable) {
                this.editText.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.originalEditTextEndDrawable, compoundDrawablesRelative4[3]);
            } else {
                z12 = z11;
            }
            this.endDummyDrawable = null;
            return z12;
        }
        return z11;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (shouldShowError()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.editText.refreshDrawableState();
        }
    }

    public void updateEditTextBoxBackgroundIfNeeded() {
        EditText editText = this.editText;
        if (editText == null || this.boxBackground == null) {
            return;
        }
        if ((this.boxBackgroundApplied || editText.getBackground() == null) && this.boxBackgroundMode != 0) {
            updateEditTextBoxBackground();
            this.boxBackgroundApplied = true;
        }
    }

    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z11 = true;
        }
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (shouldShowError()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z12, z11);
            } else {
                this.boxStrokeColor = getErrorCurrentTextColors();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z12) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z11) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z12, z11);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            updateCursorColor();
        }
        this.endLayout.onTextInputBoxStateUpdated();
        refreshStartIconDrawableState();
        if (this.boxBackgroundMode == 2) {
            int i11 = this.boxStrokeWidthPx;
            if (z12 && isEnabled()) {
                this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
            } else {
                this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
            }
            if (this.boxStrokeWidthPx != i11) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z11 && !z12) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z12) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i11, i12), attributeSet, i11);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new IndicatorViewController(this);
        this.lengthCounter = new LengthCounter() { // from class: com.google.android.material.textfield.w
            @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
            public final int countLength(Editable editable) {
                return TextInputLayout.m13196c(editable);
            }
        };
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        this.globalLayoutListenerAdded = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        int[] iArr = C7090R.styleable.TextInputLayout;
        int i13 = C7090R.styleable.TextInputLayout_counterTextAppearance;
        int i14 = C7090R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i15 = C7090R.styleable.TextInputLayout_errorTextAppearance;
        int i16 = C7090R.styleable.TextInputLayout_helperTextTextAppearance;
        int i17 = C7090R.styleable.TextInputLayout_hintTextAppearance;
        TintTypedArray tintTypedArrayObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i11, i12, i13, i14, i15, i16, i17);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_hintEnabled, true);
        setHint(tintTypedArrayObtainTintedStyledAttributes.getText(C7090R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i18 = C7090R.styleable.TextInputLayout_android_minEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i18)) {
            setMinEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i18, -1));
        } else {
            int i19 = C7090R.styleable.TextInputLayout_android_minWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i19)) {
                setMinWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i19, -1));
            }
        }
        int i21 = C7090R.styleable.TextInputLayout_android_maxEms;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i21)) {
            setMaxEms(tintTypedArrayObtainTintedStyledAttributes.getInt(i21, -1));
        } else {
            int i22 = C7090R.styleable.TextInputLayout_android_maxWidth;
            if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i22)) {
                setMaxWidth(tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(i22, -1));
            }
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i11, i12).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(C7090R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelOffset(C7090R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.extraSpaceBetweenPlaceholderAndHint = getResources().getDimensionPixelSize(C7090R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.boxStrokeWidthDefaultPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C7090R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = tintTypedArrayObtainTintedStyledAttributes.getDimensionPixelSize(C7090R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(C7090R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float dimension = tintTypedArrayObtainTintedStyledAttributes.getDimension(C7090R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = tintTypedArrayObtainTintedStyledAttributes.getDimension(C7090R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = tintTypedArrayObtainTintedStyledAttributes.getDimension(C7090R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = tintTypedArrayObtainTintedStyledAttributes.getDimension(C7090R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (dimension >= 0.0f) {
            builder.setTopLeftCornerSize(dimension);
        }
        if (dimension2 >= 0.0f) {
            builder.setTopRightCornerSize(dimension2);
        }
        if (dimension3 >= 0.0f) {
            builder.setBottomRightCornerSize(dimension3);
        }
        if (dimension4 >= 0.0f) {
            builder.setBottomLeftCornerSize(dimension4);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, C7090R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateList2 = AppCompatResources.getColorStateList(context2, C7090R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateList2.getColorForState(new int[]{-16842910}, -1);
                this.hoveredFilledBackgroundColor = colorStateList2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        int i23 = C7090R.styleable.TextInputLayout_android_textColorHint;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i23)) {
            ColorStateList colorStateList3 = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i23);
            this.focusedTextColor = colorStateList3;
            this.defaultHintTextColor = colorStateList3;
        }
        int i24 = C7090R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateList4 = MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i24);
        this.focusedStrokeColor = tintTypedArrayObtainTintedStyledAttributes.getColor(i24, 0);
        this.defaultStrokeColor = ContextCompat.getColor(context2, C7090R.color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = ContextCompat.getColor(context2, C7090R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = ContextCompat.getColor(context2, C7090R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList4 != null) {
            setBoxStrokeColorStateList(colorStateList4);
        }
        int i25 = C7090R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i25)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, tintTypedArrayObtainTintedStyledAttributes, i25));
        }
        if (tintTypedArrayObtainTintedStyledAttributes.getResourceId(i17, -1) != -1) {
            setHintTextAppearance(tintTypedArrayObtainTintedStyledAttributes.getResourceId(i17, 0));
        }
        this.cursorColor = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C7090R.styleable.TextInputLayout_cursorColor);
        this.cursorErrorColor = tintTypedArrayObtainTintedStyledAttributes.getColorStateList(C7090R.styleable.TextInputLayout_cursorErrorColor);
        int resourceId = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i15, 0);
        CharSequence text = tintTypedArrayObtainTintedStyledAttributes.getText(C7090R.styleable.TextInputLayout_errorContentDescription);
        int i26 = tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z11 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i16, 0);
        boolean z12 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = tintTypedArrayObtainTintedStyledAttributes.getText(C7090R.styleable.TextInputLayout_helperText);
        int resourceId3 = tintTypedArrayObtainTintedStyledAttributes.getResourceId(C7090R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = tintTypedArrayObtainTintedStyledAttributes.getText(C7090R.styleable.TextInputLayout_placeholderText);
        boolean z13 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i13, 0);
        this.counterOverflowTextAppearance = tintTypedArrayObtainTintedStyledAttributes.getResourceId(i14, 0);
        setBoxBackgroundMode(tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i26);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        int i27 = C7090R.styleable.TextInputLayout_errorTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i27)) {
            setErrorTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i27));
        }
        int i28 = C7090R.styleable.TextInputLayout_helperTextTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i28)) {
            setHelperTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i28));
        }
        int i29 = C7090R.styleable.TextInputLayout_hintTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i29)) {
            setHintTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i29));
        }
        int i31 = C7090R.styleable.TextInputLayout_counterTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i31)) {
            setCounterTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i31));
        }
        int i32 = C7090R.styleable.TextInputLayout_counterOverflowTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i32)) {
            setCounterOverflowTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i32));
        }
        int i33 = C7090R.styleable.TextInputLayout_placeholderTextColor;
        if (tintTypedArrayObtainTintedStyledAttributes.hasValue(i33)) {
            setPlaceholderTextColor(tintTypedArrayObtainTintedStyledAttributes.getColorStateList(i33));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, tintTypedArrayObtainTintedStyledAttributes);
        this.endLayout = endCompoundLayout;
        boolean z14 = tintTypedArrayObtainTintedStyledAttributes.getBoolean(C7090R.styleable.TextInputLayout_android_enabled, true);
        setHintMaxLines(tintTypedArrayObtainTintedStyledAttributes.getInt(C7090R.styleable.TextInputLayout_hintMaxLines, 1));
        tintTypedArrayObtainTintedStyledAttributes.recycle();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(z14);
        setHelperTextEnabled(z12);
        setErrorEnabled(z11);
        setCounterEnabled(z13);
        setHelperText(text2);
    }

    private int calculateExpandedLabelBottom(@NonNull Rect rect, @NonNull Rect rect2, float f11) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect2.top + f11);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(@NonNull Rect rect, float f11) {
        int expandedTextSingleLineHeight;
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f11 / 2.0f));
        }
        if (this.boxBackgroundMode == 0 && !isHintTextSingleLine()) {
            expandedTextSingleLineHeight = (int) (this.collapsingTextHelper.getExpandedTextSingleLineHeight() / 2.0f);
        } else {
            expandedTextSingleLineHeight = 0;
        }
        return (rect.top + this.editText.getCompoundPaddingTop()) - expandedTextSingleLineHeight;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private MaterialShapeDrawable getDropDownMaterialShapeDrawable(boolean z11) {
        float f11;
        float dimensionPixelOffset;
        ColorStateList dropDownBackgroundTintList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C7090R.dimen.mtrl_shape_corner_size_small_component);
        if (z11) {
            f11 = dimensionPixelOffset2;
        } else {
            f11 = 0.0f;
        }
        EditText editText = this.editText;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C7090R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(C7090R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCornerSize(f11).setTopRightCornerSize(f11).setBottomLeftCornerSize(dimensionPixelOffset2).setBottomRightCornerSize(dimensionPixelOffset2).build();
        EditText editText2 = this.editText;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            dropDownBackgroundTintList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        } else {
            dropDownBackgroundTintList = null;
        }
        MaterialShapeDrawable materialShapeDrawableCreateWithElevationOverlay = MaterialShapeDrawable.createWithElevationOverlay(getContext(), dimensionPixelOffset, dropDownBackgroundTintList);
        materialShapeDrawableCreateWithElevationOverlay.setShapeAppearanceModel(shapeAppearanceModelBuild);
        materialShapeDrawableCreateWithElevationOverlay.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return materialShapeDrawableCreateWithElevationOverlay;
    }

    private static Drawable getFilledBoxBackgroundWithRipple(MaterialShapeDrawable materialShapeDrawable, int i11, int i12, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{MaterialColors.layer(i12, i11, 0.1f), i11}), materialShapeDrawable, materialShapeDrawable);
    }

    private boolean isHintTextSingleLine() {
        if (getHintMaxLines() == 1) {
            return true;
        }
        return false;
    }

    private boolean isOnError() {
        if (!shouldShowError()) {
            if (this.counterView == null || !this.counterOverflowed) {
                return false;
            }
            return true;
        }
        return true;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        updateEditTextBoxBackgroundIfNeeded();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
        setDropDownMenuBackgroundIfNeeded();
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextBottomTextBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                applyCutoutPadding(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
                rectF.top = 0.0f;
                ((CutoutDrawable) this.boxBackground).setCutout(rectF);
            }
        }
    }

    private void recalculateCutout() {
        if (cutoutEnabled() && !this.hintExpanded) {
            closeCutout();
            openCutout();
        }
    }

    private static void recursiveSetEnabled(@NonNull ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z11);
            }
        }
    }

    private boolean shouldUpdateStartDummyDrawable() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void updateEditTextBoxBackground() {
        this.editText.setBackground(getEditTextBoxBackground());
    }

    @VisibleForTesting
    public boolean cutoutIsOpen() {
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        if (ViewUtils.isLayoutRtl(this)) {
            return this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
        }
        return this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.globalLayoutListenerAdded) {
            this.endLayout.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.globalLayoutListenerAdded = true;
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        this.endLayout.updateSuffixTextViewPadding();
        if (!isHintTextSingleLine()) {
            updateCollapsingTextDimens((this.editText.getMeasuredWidth() - this.editText.getCompoundPaddingLeft()) - this.editText.getCompoundPaddingRight());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = true;
        if (i11 != 1) {
            z11 = false;
        }
        if (z11 != this.areCornerRadiiRtl) {
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            CornerTreatment topLeftCorner = this.shapeAppearanceModel.getTopLeftCorner();
            CornerTreatment topRightCorner = this.shapeAppearanceModel.getTopRightCorner();
            ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder().setTopLeftCorner(topRightCorner).setTopRightCorner(topLeftCorner).setBottomLeftCorner(this.shapeAppearanceModel.getBottomRightCorner()).setBottomRightCorner(this.shapeAppearanceModel.getBottomLeftCorner()).setTopLeftCornerSize(cornerSize2).setTopRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize4).setBottomRightCornerSize(cornerSize3).build();
            this.areCornerRadiiRtl = z11;
            setShapeAppearanceModel(shapeAppearanceModelBuild);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (shouldShowError()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = this.endLayout.isEndIconChecked();
        return savedState;
    }

    public void setBoxBackgroundColorResource(@ColorRes int i11) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i11));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxCornerRadii(float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = zIsLayoutRtl;
        if (zIsLayoutRtl) {
            f15 = f12;
        } else {
            f15 = f11;
        }
        if (!zIsLayoutRtl) {
            f11 = f12;
        }
        if (zIsLayoutRtl) {
            f16 = f14;
        } else {
            f16 = f13;
        }
        if (!zIsLayoutRtl) {
            f13 = f14;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f15 && this.boxBackground.getTopRightCornerResolvedSize() == f11 && this.boxBackground.getBottomLeftCornerResolvedSize() == f16 && this.boxBackground.getBottomRightCornerResolvedSize() == f13) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f15).setTopRightCornerSize(f11).setBottomLeftCornerSize(f16).setBottomRightCornerSize(f13).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(@DimenRes int i11, @DimenRes int i12, @DimenRes int i13, @DimenRes int i14) {
        setBoxCornerRadii(getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i12), getContext().getResources().getDimension(i14), getContext().getResources().getDimension(i13));
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        recursiveSetEnabled(this, z11);
        super.setEnabled(z11);
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public void setMaxWidthResource(@DimenRes int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinWidthResource(@DimenRes int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setTextAppearanceCompatWithErrorFallback(@NonNull TextView textView, @StyleRes int i11) {
        try {
            TextViewCompat.setTextAppearance(textView, i11);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(textView, C0467R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(ContextCompat.getColor(getContext(), C7090R.color.design_error));
    }

    public void updateCounter(@Nullable Editable editable) {
        int iCountLength = this.lengthCounter.countLength(editable);
        boolean z11 = this.counterOverflowed;
        int i11 = this.counterMaxLength;
        if (i11 == -1) {
            this.counterView.setText(String.valueOf(iCountLength));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = iCountLength > i11;
            updateCounterContentDescription(getContext(), this.counterView, iCountLength, this.counterMaxLength, this.counterOverflowed);
            if (z11 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(C7090R.string.character_counter_pattern, Integer.valueOf(iCountLength), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z11 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(@StringRes int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }
}
