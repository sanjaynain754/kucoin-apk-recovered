package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0467R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.mView;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.mView.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.mView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView2 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i11, int i12, int i13, int i14) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i11) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
        }

        @DoNotInline
        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static Typeface create(Typeface typeface, int i11, boolean z11) {
            return Typeface.create(typeface, i11, z11);
        }
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i11, float f11) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i11, f11);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        this.mStyle = tintTypedArray.getInt(C0467R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            int i12 = tintTypedArray.getInt(C0467R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i12;
            if (i12 != -1) {
                this.mStyle &= 2;
            }
        }
        int i13 = C0467R.styleable.TextAppearance_android_fontFamily;
        if (!tintTypedArray.hasValue(i13) && !tintTypedArray.hasValue(C0467R.styleable.TextAppearance_fontFamily)) {
            int i14 = C0467R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i14)) {
                this.mAsyncFontPending = false;
                int i15 = tintTypedArray.getInt(i14, 1);
                if (i15 == 1) {
                    this.mFontTypeface = Typeface.SANS_SERIF;
                    return;
                } else if (i15 == 2) {
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                } else {
                    if (i15 != 3) {
                        return;
                    }
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.mFontTypeface = null;
        int i16 = C0467R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i16)) {
            i13 = i16;
        }
        final int i17 = this.mFontWeight;
        final int i18 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i13, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void onFontRetrieved(@NonNull Typeface typeface) {
                        int i19;
                        if (Build.VERSION.SDK_INT >= 28 && (i19 = i17) != -1) {
                            typeface = Api28Impl.create(typeface, i19, (i18 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface);
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void onFontRetrievalFailed(int i19) {
                    }
                });
                if (font != null) {
                    if (i11 < 28 || this.mFontWeight == -1) {
                        this.mFontTypeface = font;
                    } else {
                        this.mFontTypeface = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
            this.mFontTypeface = Typeface.create(string, this.mStyle);
        } else {
            this.mFontTypeface = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        }
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.mView.getCompoundDrawablesRelative();
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    @SuppressLint({"NewApi"})
    public void loadFromAttributes(@Nullable AttributeSet attributeSet, int i11) {
        boolean z11;
        boolean z12;
        String string;
        String string2;
        boolean z13;
        int unitFromComplexDimension;
        float dimensionPixelSize;
        Context context = this.mView.getContext();
        AppCompatDrawableManager appCompatDrawableManager = AppCompatDrawableManager.get();
        int[] iArr = C0467R.styleable.AppCompatTextHelper;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i11, 0);
        TextView textView = this.mView;
        ViewCompat.saveAttributeDataForStyleable(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i11, 0);
        int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(C0467R.styleable.AppCompatTextHelper_android_textAppearance, -1);
        int i12 = C0467R.styleable.AppCompatTextHelper_android_drawableLeft;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            this.mDrawableLeftTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0));
        }
        int i13 = C0467R.styleable.AppCompatTextHelper_android_drawableTop;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
            this.mDrawableTopTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        int i14 = C0467R.styleable.AppCompatTextHelper_android_drawableRight;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
            this.mDrawableRightTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i14, 0));
        }
        int i15 = C0467R.styleable.AppCompatTextHelper_android_drawableBottom;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i15)) {
            this.mDrawableBottomTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i15, 0));
        }
        int i16 = C0467R.styleable.AppCompatTextHelper_android_drawableStart;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i16)) {
            this.mDrawableStartTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i16, 0));
        }
        int i17 = C0467R.styleable.AppCompatTextHelper_android_drawableEnd;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i17)) {
            this.mDrawableEndTint = createTintInfo(context, appCompatDrawableManager, tintTypedArrayObtainStyledAttributes.getResourceId(i17, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        boolean z14 = this.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (resourceId != -1) {
            TintTypedArray tintTypedArrayObtainStyledAttributes2 = TintTypedArray.obtainStyledAttributes(context, resourceId, C0467R.styleable.TextAppearance);
            if (z14) {
                z11 = false;
                z12 = false;
            } else {
                int i18 = C0467R.styleable.TextAppearance_textAllCaps;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i18)) {
                    z11 = tintTypedArrayObtainStyledAttributes2.getBoolean(i18, false);
                    z12 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
            }
            updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes2);
            int i19 = Build.VERSION.SDK_INT;
            int i21 = C0467R.styleable.TextAppearance_textLocale;
            string2 = tintTypedArrayObtainStyledAttributes2.hasValue(i21) ? tintTypedArrayObtainStyledAttributes2.getString(i21) : null;
            if (i19 >= 26) {
                int i22 = C0467R.styleable.TextAppearance_fontVariationSettings;
                if (tintTypedArrayObtainStyledAttributes2.hasValue(i22)) {
                    string = tintTypedArrayObtainStyledAttributes2.getString(i22);
                } else {
                    string = null;
                }
            } else {
                string = null;
            }
            tintTypedArrayObtainStyledAttributes2.recycle();
        } else {
            z11 = false;
            z12 = false;
            string = null;
            string2 = null;
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes3 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0467R.styleable.TextAppearance, i11, 0);
        if (z14) {
            z13 = z12;
        } else {
            int i23 = C0467R.styleable.TextAppearance_textAllCaps;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i23)) {
                z11 = tintTypedArrayObtainStyledAttributes3.getBoolean(i23, false);
                z13 = true;
            } else {
                z13 = z12;
            }
        }
        int i24 = Build.VERSION.SDK_INT;
        int i25 = C0467R.styleable.TextAppearance_textLocale;
        if (tintTypedArrayObtainStyledAttributes3.hasValue(i25)) {
            string2 = tintTypedArrayObtainStyledAttributes3.getString(i25);
        }
        if (i24 >= 26) {
            int i26 = C0467R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i26)) {
                string = tintTypedArrayObtainStyledAttributes3.getString(i26);
            }
        }
        if (i24 >= 28) {
            int i27 = C0467R.styleable.TextAppearance_android_textSize;
            if (tintTypedArrayObtainStyledAttributes3.hasValue(i27) && tintTypedArrayObtainStyledAttributes3.getDimensionPixelSize(i27, -1) == 0) {
                this.mView.setTextSize(0, 0.0f);
            }
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes3);
        tintTypedArrayObtainStyledAttributes3.recycle();
        if (!z14 && z13) {
            setAllCaps(z11);
        }
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            if (this.mFontWeight == -1) {
                this.mView.setTypeface(typeface, this.mStyle);
            } else {
                this.mView.setTypeface(typeface);
            }
        }
        if (string != null) {
            Api26Impl.setFontVariationSettings(this.mView, string);
        }
        if (string2 != null) {
            Api24Impl.setTextLocales(this.mView, Api24Impl.forLanguageTags(string2));
        }
        this.mAutoSizeTextHelper.loadFromAttributes(attributeSet, i11);
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE && this.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] autoSizeTextAvailableSizes = this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if (autoSizeTextAvailableSizes.length > 0) {
                if (Api26Impl.getAutoSizeStepGranularity(this.mView) != -1.0f) {
                    Api26Impl.setAutoSizeTextTypeUniformWithConfiguration(this.mView, this.mAutoSizeTextHelper.getAutoSizeMinTextSize(), this.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), this.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                } else {
                    Api26Impl.setAutoSizeTextTypeUniformWithPresetSizes(this.mView, autoSizeTextAvailableSizes, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayObtainStyledAttributes4 = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0467R.styleable.AppCompatTextView);
        int resourceId2 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableLeftCompat, -1);
        Drawable drawable = resourceId2 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId2) : null;
        int resourceId3 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableTopCompat, -1);
        Drawable drawable2 = resourceId3 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId3) : null;
        int resourceId4 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableRightCompat, -1);
        Drawable drawable3 = resourceId4 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId4) : null;
        int resourceId5 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableBottomCompat, -1);
        Drawable drawable4 = resourceId5 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId5) : null;
        int resourceId6 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableStartCompat, -1);
        Drawable drawable5 = resourceId6 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId6) : null;
        int resourceId7 = tintTypedArrayObtainStyledAttributes4.getResourceId(C0467R.styleable.AppCompatTextView_drawableEndCompat, -1);
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4, drawable5, resourceId7 != -1 ? appCompatDrawableManager.getDrawable(context, resourceId7) : null);
        int i28 = C0467R.styleable.AppCompatTextView_drawableTint;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i28)) {
            TextViewCompat.setCompoundDrawableTintList(this.mView, tintTypedArrayObtainStyledAttributes4.getColorStateList(i28));
        }
        int i29 = C0467R.styleable.AppCompatTextView_drawableTintMode;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i29)) {
            TextViewCompat.setCompoundDrawableTintMode(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes4.getInt(i29, -1), null));
        }
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(C0467R.styleable.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize3 = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(C0467R.styleable.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int i31 = C0467R.styleable.AppCompatTextView_lineHeight;
        if (tintTypedArrayObtainStyledAttributes4.hasValue(i31)) {
            TypedValue typedValuePeekValue = tintTypedArrayObtainStyledAttributes4.peekValue(i31);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = tintTypedArrayObtainStyledAttributes4.getDimensionPixelSize(i31, -1);
                unitFromComplexDimension = -1;
            } else {
                unitFromComplexDimension = TypedValueCompat.getUnitFromComplexDimension(typedValuePeekValue.data);
                dimensionPixelSize = TypedValue.complexToFloat(typedValuePeekValue.data);
            }
        } else {
            unitFromComplexDimension = -1;
            dimensionPixelSize = -1.0f;
        }
        tintTypedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(this.mView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(this.mView, dimensionPixelSize3);
        }
        if (dimensionPixelSize != -1.0f) {
            if (unitFromComplexDimension == -1) {
                TextViewCompat.setLineHeight(this.mView, (int) dimensionPixelSize);
            } else {
                TextViewCompat.setLineHeight(this.mView, unitFromComplexDimension, dimensionPixelSize);
            }
        }
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!textView.isAttachedToWindow()) {
                    textView.setTypeface(typeface, this.mStyle);
                } else {
                    final int i11 = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i11);
                        }
                    });
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetTextAppearance(Context context, int i11) {
        String string;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i11, C0467R.styleable.TextAppearance);
        int i12 = C0467R.styleable.TextAppearance_textAllCaps;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            setAllCaps(tintTypedArrayObtainStyledAttributes.getBoolean(i12, false));
        }
        int i13 = Build.VERSION.SDK_INT;
        int i14 = C0467R.styleable.TextAppearance_android_textSize;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i14) && tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(i14, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, tintTypedArrayObtainStyledAttributes);
        if (i13 >= 26) {
            int i15 = C0467R.styleable.TextAppearance_fontVariationSettings;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i15) && (string = tintTypedArrayObtainStyledAttributes.getString(i15)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z11) {
        this.mView.setAllCaps(z11);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
    }

    public void setAutoSizeTextTypeWithDefaults(int i11) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i11);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i11, float f11) {
        if (ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i11, f11);
    }

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i11) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i11);
        if (tintList != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.mHasTintList = true;
            tintInfo.mTintList = tintList;
            return tintInfo;
        }
        return null;
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }
}
