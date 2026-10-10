package com.google.android.material.resources;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0467R;
import androidx.core.C1533R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C7090R;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private Typeface font;

    @Nullable
    public final String fontFamily;

    @FontRes
    private final int fontFamilyResourceId;

    @Nullable
    public String fontVariationSettings;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;

    @Nullable
    public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;

    @Nullable
    private ColorStateList textColor;

    @Nullable
    public final ColorStateList textColorHint;

    @Nullable
    public final ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;
    private boolean fontResolved = false;
    private boolean systemFontLoadAttempted = false;

    public void getFontAsync(@NonNull Context context, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        if (!maybeLoadFontSynchronously(context)) {
            createFallbackFont();
        }
        int i11 = this.fontFamilyResourceId;
        if (i11 == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i11, new ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrievalFailed(int i12) {
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i12);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                public void onFontRetrieved(@NonNull Typeface typeface) {
                    TextAppearance textAppearance = TextAppearance.this;
                    textAppearance.font = Typeface.create(typeface, textAppearance.textStyle);
                    TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrieved(TextAppearance.this.font, false);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (Exception e11) {
            Log.d(TAG, "Error loading font " + this.fontFamily, e11);
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    private void createFallbackFont() {
        String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i11 = this.typeface;
            if (i11 == 1) {
                this.font = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.font = Typeface.SERIF;
            } else if (i11 != 3) {
                this.font = Typeface.DEFAULT;
            } else {
                this.font = Typeface.MONOSPACE;
            }
            this.font = Typeface.create(this.font, this.textStyle);
        }
    }

    @Nullable
    private Typeface getSystemTypeface(Context context) {
        Typeface typefaceCreate;
        if (this.systemFontLoadAttempted) {
            return null;
        }
        this.systemFontLoadAttempted = true;
        String fontProviderSystemFontFamily = readFontProviderSystemFontFamily(context, this.fontFamilyResourceId);
        if (fontProviderSystemFontFamily == null || (typefaceCreate = Typeface.create(fontProviderSystemFontFamily, 0)) == Typeface.DEFAULT) {
            return null;
        }
        return Typeface.create(typefaceCreate, this.textStyle);
    }

    @NonNull
    @VisibleForTesting
    public Typeface getFont(@NonNull Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.fontFamilyResourceId);
                this.font = font;
                if (font != null) {
                    this.font = Typeface.create(font, this.textStyle);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e11) {
                Log.d(TAG, "Error loading font " + this.fontFamily, e11);
            }
        }
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    @Nullable
    @RequiresApi(26)
    public String getFontVariationSettings() {
        return this.fontVariationSettings;
    }

    @Nullable
    public ColorStateList getTextColor() {
        return this.textColor;
    }

    public float getTextSize() {
        return this.textSize;
    }

    @RequiresApi(26)
    public void setFontVariationSettings(@Nullable String str) {
        this.fontVariationSettings = str;
    }

    public void setTextColor(@Nullable ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public void setTextSize(float f11) {
        this.textSize = f11;
    }

    public TextAppearance(@NonNull Context context, @StyleRes int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, C0467R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(C0467R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C0467R.styleable.TextAppearance_android_textColor));
        this.textColorHint = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C0467R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C0467R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(C0467R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(C0467R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = MaterialResources.getIndexWithValue(typedArrayObtainStyledAttributes, C0467R.styleable.TextAppearance_fontFamily, C0467R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = typedArrayObtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(C0467R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, C0467R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(C0467R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i11, C7090R.styleable.MaterialTextAppearance);
        int i12 = C7090R.styleable.MaterialTextAppearance_android_letterSpacing;
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(i12);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(i12, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.fontVariationSettings = typedArrayObtainStyledAttributes2.getString(MaterialResources.getIndexWithValue(typedArrayObtainStyledAttributes2, C7090R.styleable.MaterialTextAppearance_fontVariationSettings, C7090R.styleable.MaterialTextAppearance_android_fontVariationSettings));
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    private boolean maybeLoadFontSynchronously(Context context) {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            getFont(context);
            return true;
        }
        if (this.fontResolved) {
            return true;
        }
        int i11 = this.fontFamilyResourceId;
        if (i11 == 0) {
            return false;
        }
        Typeface cachedFont = ResourcesCompat.getCachedFont(context, i11);
        if (cachedFont != null) {
            this.font = cachedFont;
            this.fontResolved = true;
            return true;
        }
        Typeface systemTypeface = getSystemTypeface(context);
        if (systemTypeface == null) {
            return false;
        }
        this.font = systemTypeface;
        this.fontResolved = true;
        return true;
    }

    @Nullable
    @SuppressLint({"ResourceType"})
    private static String readFontProviderSystemFontFamily(Context context, @FontRes int i11) {
        Resources resources = context.getResources();
        if (i11 != 0 && resources.getResourceTypeName(i11).equals("font")) {
            try {
                XmlResourceParser xml = resources.getXml(i11);
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), C1533R.styleable.FontFamily);
                        String string = typedArrayObtainAttributes.getString(C1533R.styleable.FontFamily_fontProviderSystemFontFamily);
                        typedArrayObtainAttributes.recycle();
                        return string;
                    }
                    xml.next();
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    public void updateDrawState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        int colorForState;
        int colorForState2;
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        ColorStateList colorStateList = this.textColor;
        if (colorStateList != null) {
            colorForState = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            colorForState = ViewCompat.MEASURED_STATE_MASK;
        }
        textPaint.setColor(colorForState);
        float f11 = this.shadowRadius;
        float f12 = this.shadowDx;
        float f13 = this.shadowDy;
        ColorStateList colorStateList2 = this.shadowColor;
        if (colorStateList2 != null) {
            colorForState2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            colorForState2 = 0;
        }
        textPaint.setShadowLayer(f11, f12, f13, colorForState2);
    }

    public void updateMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull TextAppearanceFontCallback textAppearanceFontCallback) {
        Typeface typeface;
        if (maybeLoadFontSynchronously(context) && this.fontResolved && (typeface = this.font) != null) {
            updateTextPaintMeasureState(context, textPaint, typeface);
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        boolean z11;
        float f11;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i11 = this.textStyle & (~typeface.getStyle());
        if ((i11 & 1) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        textPaint.setFakeBoldText(z11);
        if ((i11 & 2) != 0) {
            f11 = -0.25f;
        } else {
            f11 = 0.0f;
        }
        textPaint.setTextSkewX(f11);
        textPaint.setTextSize(this.textSize);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.fontVariationSettings);
        }
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public void getFontAsync(@NonNull final Context context, @NonNull final TextPaint textPaint, @NonNull final TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i11) {
                textAppearanceFontCallback.onFontRetrievalFailed(i11);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(@NonNull Typeface typeface, boolean z11) {
                TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z11);
            }
        });
    }
}
