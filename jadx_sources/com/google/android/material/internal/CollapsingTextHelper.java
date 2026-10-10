package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;

    @Nullable
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final String ELLIPSIS_NORMAL = "…";
    private static final float FADE_MODE_THRESHOLD_FRACTION_RELATIVE = 0.5f;
    private static final int ONE_LINE = 1;
    public static final int SEMITRANSPARENT_MAGENTA = 1090453759;
    private static final String TAG = "CollapsingTextHelper";
    private boolean alignBaselineAtBottom;
    private boolean boundsChanged;

    @NonNull
    private final Rect collapsedBounds;

    @Nullable
    private Rect collapsedBoundsForPlacement;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private CancelableFontCallback collapsedFontCallback;
    private float collapsedLetterSpacing;
    private ColorStateList collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private float collapsedTextBlend;
    private ColorStateList collapsedTextColor;
    private float collapsedTextWidth;
    private Typeface collapsedTypeface;
    private Typeface collapsedTypefaceBold;
    private Typeface collapsedTypefaceDefault;

    @NonNull
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentLetterSpacing;
    private int currentMaxLines;
    private int currentOffsetY;
    private int currentShadowColor;
    private float currentShadowDx;
    private float currentShadowDy;
    private float currentShadowRadius;
    private float currentTextSize;
    private Typeface currentTypeface;

    @NonNull
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private CancelableFontCallback expandedFontCallback;
    private float expandedFraction;
    private float expandedLetterSpacing;
    private int expandedLineCount;
    private ColorStateList expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private float expandedTextBlend;
    private ColorStateList expandedTextColor;
    private Typeface expandedTypeface;
    private Typeface expandedTypefaceBold;
    private Typeface expandedTypefaceDefault;
    private boolean fadeModeEnabled;
    private float fadeModeStartFraction;
    private float fadeModeThresholdFraction;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;

    @Nullable
    private StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;

    @Nullable
    private CharSequence text;
    private StaticLayout textLayout;

    @NonNull
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;

    @Nullable
    private CharSequence textToDraw;
    private CharSequence textToDrawCollapsed;

    @NonNull
    private final TextPaint tmpPaint;
    private final View view;
    private int expandedTextGravity = 16;
    private int collapsedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private float collapsedTextSize = 15.0f;
    private TextUtils.TruncateAt titleTextEllipsize = TextUtils.TruncateAt.END;
    private boolean isRtlTextDirectionHeuristicsEnabled = true;
    private int expandedMaxLines = 1;
    private int collapsedMaxLines = 1;
    private float lineSpacingAdd = 0.0f;
    private float lineSpacingMultiplier = 1.0f;
    private int hyphenationFrequency = StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY;
    private int collapsedHeight = -1;
    private int expandedHeight = -1;

    private void calculateUsingTextSize(float f11) {
        calculateUsingTextSize(f11, false);
    }

    private StaticLayout createStaticLayout(int i11, TextPaint textPaint, CharSequence charSequence, float f11, boolean z11) {
        StaticLayout staticLayoutBuild;
        try {
            staticLayoutBuild = StaticLayoutBuilderCompat.obtain(charSequence, textPaint, (int) f11).setEllipsize(this.titleTextEllipsize).setIsRtl(z11).setAlignment(i11 == 1 ? Layout.Alignment.ALIGN_NORMAL : getMultilineTextLayoutAlignment()).setIncludePad(false).setMaxLines(i11).setLineSpacing(this.lineSpacingAdd, this.lineSpacingMultiplier).setHyphenationFrequency(this.hyphenationFrequency).setStaticLayoutBuilderConfigurer(this.staticLayoutBuilderConfigurer).build();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e11) {
            Log.e(TAG, e11.getCause().getMessage(), e11);
            staticLayoutBuild = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayoutBuild);
    }

    @ColorInt
    private int getCurrentColor(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.state;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private static boolean isClose(float f11, float f12) {
        return Math.abs(f11 - f12) < 1.0E-5f;
    }

    public void recalculate() {
        recalculate(false);
    }

    public void setCollapsedBounds(int i11, int i12, int i13, int i14) {
        if (rectEquals(this.collapsedBounds, i11, i12, i13, i14)) {
            return;
        }
        this.collapsedBounds.set(i11, i12, i13, i14);
        this.boundsChanged = true;
    }

    public void setExpandedBounds(int i11, int i12, int i13, int i14, boolean z11) {
        if (rectEquals(this.expandedBounds, i11, i12, i13, i14) && z11 == this.alignBaselineAtBottom) {
            return;
        }
        this.expandedBounds.set(i11, i12, i13, i14);
        this.boundsChanged = true;
        this.alignBaselineAtBottom = z11;
    }

    public void setExpansionFraction(float f11) {
        float fClamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        if (fClamp != this.expandedFraction) {
            this.expandedFraction = fClamp;
            calculateCurrentOffsets();
        }
    }

    @ColorInt
    private static int blendARGB(@ColorInt int i11, @ColorInt int i12, @FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        float f12 = 1.0f - f11;
        return Color.argb(Math.round((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), Math.round((Color.red(i11) * f12) + (Color.red(i12) * f11)), Math.round((Color.green(i11) * f12) + (Color.green(i12) * f11)), Math.round((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    private void calculateBaseOffsets(boolean z11) {
        float fMeasureTextWidth;
        calculateUsingTextSize(1.0f, z11);
        if (this.textToDraw != null && this.textLayout != null) {
            this.textToDrawCollapsed = shouldTruncateCollapsedToSingleLine() ? TextUtils.ellipsize(this.textToDraw, this.textPaint, this.textLayout.getWidth(), this.titleTextEllipsize) : this.textToDraw;
        }
        CharSequence charSequence = this.textToDrawCollapsed;
        if (charSequence != null) {
            this.collapsedTextWidth = measureTextWidth(this.textPaint, charSequence);
        } else {
            this.collapsedTextWidth = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        Rect rect = this.collapsedBoundsForPlacement;
        if (rect == null) {
            rect = this.collapsedBounds;
        }
        int i11 = absoluteGravity & 112;
        if (i11 == 48) {
            this.collapsedDrawY = rect.top;
        } else if (i11 != 80) {
            this.collapsedDrawY = rect.centerY() - ((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f);
        } else {
            this.collapsedDrawY = rect.bottom + this.textPaint.ascent();
        }
        int i12 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i12 == 1) {
            this.collapsedDrawX = rect.centerX() - (this.collapsedTextWidth / 2.0f);
        } else if (i12 != 5) {
            this.collapsedDrawX = rect.left;
        } else {
            this.collapsedDrawX = rect.right - this.collapsedTextWidth;
        }
        if (this.collapsedTextWidth <= this.collapsedBounds.width()) {
            float f11 = this.collapsedDrawX;
            float fMax = f11 + Math.max(0.0f, this.collapsedBounds.left - f11);
            this.collapsedDrawX = fMax;
            this.collapsedDrawX = fMax + Math.min(0.0f, this.collapsedBounds.right - (this.collapsedTextWidth + fMax));
        }
        if (getCollapsedFullSingleLineHeight() <= this.collapsedBounds.height()) {
            float f12 = this.collapsedDrawY;
            float fMax2 = f12 + Math.max(0.0f, this.collapsedBounds.top - f12);
            this.collapsedDrawY = fMax2;
            this.collapsedDrawY = fMax2 + Math.min(0.0f, this.collapsedBounds.bottom - (getCollapsedTextHeight() + fMax2));
        }
        calculateUsingTextSize(0.0f, z11);
        StaticLayout staticLayout = this.textLayout;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.textLayout;
        if (staticLayout2 == null || this.expandedMaxLines <= 1) {
            CharSequence charSequence2 = this.textToDraw;
            fMeasureTextWidth = charSequence2 != null ? measureTextWidth(this.textPaint, charSequence2) : 0.0f;
        } else {
            fMeasureTextWidth = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.textLayout;
        this.expandedLineCount = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i13 = absoluteGravity2 & 112;
        if (i13 == 48) {
            this.expandedDrawY = this.expandedBounds.top;
        } else if (i13 != 80) {
            this.expandedDrawY = this.expandedBounds.centerY() - (height / 2.0f);
        } else {
            this.expandedDrawY = (this.expandedBounds.bottom - height) + (this.alignBaselineAtBottom ? this.textPaint.descent() : 0.0f);
        }
        int i14 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i14 == 1) {
            this.expandedDrawX = this.expandedBounds.centerX() - (fMeasureTextWidth / 2.0f);
        } else if (i14 != 5) {
            this.expandedDrawX = this.expandedBounds.left;
        } else {
            this.expandedDrawX = this.expandedBounds.right - fMeasureTextWidth;
        }
        setInterpolatedTextSize(this.expandedFraction);
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    private float calculateFadeModeTextAlpha(@FloatRange(from = 0.0d, m1552to = 1.0d) float f11) {
        float f12 = this.fadeModeThresholdFraction;
        return f11 <= f12 ? AnimationUtils.lerp(1.0f, 0.0f, this.fadeModeStartFraction, f12, f11) : AnimationUtils.lerp(0.0f, 1.0f, f12, 1.0f, f11);
    }

    private float calculateFadeModeThresholdFraction() {
        float f11 = this.fadeModeStartFraction;
        return f11 + ((1.0f - f11) * 0.5f);
    }

    private void calculateUsingTextSize(float f11, boolean z11) {
        Typeface typeface;
        float f12;
        float f13;
        if (this.text == null) {
            return;
        }
        float fWidth = this.collapsedBounds.width();
        float fWidth2 = this.expandedBounds.width();
        if (isClose(f11, 1.0f)) {
            f12 = shouldTruncateCollapsedToSingleLine() ? this.collapsedTextSize : this.expandedTextSize;
            f13 = shouldTruncateCollapsedToSingleLine() ? this.collapsedLetterSpacing : this.expandedLetterSpacing;
            this.scale = shouldTruncateCollapsedToSingleLine() ? 1.0f : lerp(this.expandedTextSize, this.collapsedTextSize, f11, this.textSizeInterpolator) / this.expandedTextSize;
            if (!shouldTruncateCollapsedToSingleLine()) {
                fWidth = fWidth2;
            }
            typeface = this.collapsedTypeface;
            fWidth2 = fWidth;
        } else {
            float f14 = this.expandedTextSize;
            float f15 = this.expandedLetterSpacing;
            typeface = this.expandedTypeface;
            if (isClose(f11, 0.0f)) {
                this.scale = 1.0f;
            } else {
                this.scale = lerp(this.expandedTextSize, this.collapsedTextSize, f11, this.textSizeInterpolator) / this.expandedTextSize;
            }
            float f16 = this.collapsedTextSize / this.expandedTextSize;
            float f17 = fWidth2 * f16;
            if (!z11 && !this.fadeModeEnabled && f17 > fWidth && shouldTruncateCollapsedToSingleLine()) {
                fWidth2 = Math.min(fWidth / f16, fWidth2);
            }
            f12 = f14;
            f13 = f15;
        }
        int i11 = f11 < 0.5f ? this.expandedMaxLines : this.collapsedMaxLines;
        boolean z12 = false;
        if (fWidth2 > 0.0f) {
            boolean z13 = this.currentTextSize != f12;
            boolean z14 = this.currentLetterSpacing != f13;
            boolean z15 = this.currentTypeface != typeface;
            StaticLayout staticLayout = this.textLayout;
            boolean z16 = z13 || z14 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z15 || (this.currentMaxLines != i11) || this.boundsChanged;
            this.currentTextSize = f12;
            this.currentLetterSpacing = f13;
            this.currentTypeface = typeface;
            this.boundsChanged = false;
            this.currentMaxLines = i11;
            this.textPaint.setLinearText(this.scale != 1.0f);
            z12 = z16;
        }
        if (this.textToDraw == null || z12) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            this.textPaint.setLetterSpacing(this.currentLetterSpacing);
            this.isRtl = calculateIsRtl(this.text);
            StaticLayout staticLayoutCreateStaticLayout = createStaticLayout(shouldDrawMultiline() ? i11 : 1, this.textPaint, this.text, fWidth2 * (shouldTruncateCollapsedToSingleLine() ? 1.0f : this.scale), this.isRtl);
            this.textLayout = staticLayoutCreateStaticLayout;
            this.textToDraw = staticLayoutCreateStaticLayout.getText();
        }
    }

    private void drawMultilineTransition(@NonNull Canvas canvas, float f11, float f12) {
        int alpha = this.textPaint.getAlpha();
        canvas.translate(f11, f12);
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.expandedTextBlend * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
            this.textLayout.draw(canvas);
        }
        if (!this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (this.collapsedTextBlend * alpha));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            TextPaint textPaint2 = this.textPaint;
            textPaint2.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint2.getAlpha()));
        }
        int lineBaseline = this.textLayout.getLineBaseline(0);
        CharSequence charSequence = this.textToDrawCollapsed;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.textPaint);
        if (i11 >= 31) {
            this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, this.currentShadowColor);
        }
        if (this.fadeModeEnabled) {
            return;
        }
        String strTrim = this.textToDrawCollapsed.toString().trim();
        if (strTrim.endsWith(ELLIPSIS_NORMAL)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.textPaint.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.textLayout.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.textPaint);
    }

    private float getCollapsedTextLeftBound(int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) - (this.collapsedTextWidth / 2.0f);
        }
        if ((i12 & GravityCompat.END) == 8388613 || (i12 & 5) == 5) {
            return this.isRtl ? this.collapsedBounds.left : this.collapsedBounds.right - this.collapsedTextWidth;
        }
        return this.isRtl ? this.collapsedBounds.right - this.collapsedTextWidth : this.collapsedBounds.left;
    }

    private float getCollapsedTextRightBound(@NonNull RectF rectF, int i11, int i12) {
        if (i12 == 17 || (i12 & 7) == 1) {
            return (i11 / 2.0f) + (this.collapsedTextWidth / 2.0f);
        }
        if ((i12 & GravityCompat.END) == 8388613 || (i12 & 5) == 5) {
            return this.isRtl ? rectF.left + this.collapsedTextWidth : this.collapsedBounds.right;
        }
        return this.isRtl ? this.collapsedBounds.right : rectF.left + this.collapsedTextWidth;
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
        return getCurrentColor(this.expandedTextColor);
    }

    private Layout.Alignment getMultilineTextLayoutAlignment() {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0) & 7;
        if (absoluteGravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (absoluteGravity != 5) {
            return this.isRtl ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.isRtl ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    private void getTextPaintCollapsed(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.collapsedTextSize);
        textPaint.setTypeface(this.collapsedTypeface);
        textPaint.setLetterSpacing(this.collapsedLetterSpacing);
    }

    private void getTextPaintExpanded(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.expandedTextSize);
        textPaint.setTypeface(this.expandedTypeface);
        textPaint.setLetterSpacing(this.expandedLetterSpacing);
    }

    private void interpolateBounds(float f11) {
        if (this.fadeModeEnabled) {
            this.currentBounds.set(f11 < this.fadeModeThresholdFraction ? this.expandedBounds : this.collapsedBounds);
            return;
        }
        this.currentBounds.left = lerp(this.expandedBounds.left, this.collapsedBounds.left, f11, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f11, this.positionInterpolator);
        this.currentBounds.right = lerp(this.expandedBounds.right, this.collapsedBounds.right, f11, this.positionInterpolator);
        this.currentBounds.bottom = lerp(this.expandedBounds.bottom, this.collapsedBounds.bottom, f11, this.positionInterpolator);
    }

    private boolean isDefaultIsRtl() {
        return this.view.getLayoutDirection() == 1;
    }

    private boolean isTextDirectionHeuristicsIsRtl(@NonNull CharSequence charSequence, boolean z11) {
        return (z11 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    private static float lerp(float f11, float f12, float f13, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return AnimationUtils.lerp(f11, f12, f13);
    }

    private static boolean rectEquals(@NonNull Rect rect, int i11, int i12, int i13, int i14) {
        return rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14;
    }

    private void setCollapsedTextBlend(float f11) {
        this.collapsedTextBlend = f11;
        this.view.postInvalidateOnAnimation();
    }

    private boolean setCollapsedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.collapsedTypefaceDefault == typeface) {
            return false;
        }
        this.collapsedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.collapsedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.collapsedTypefaceDefault;
        }
        this.collapsedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private void setExpandedTextBlend(float f11) {
        this.expandedTextBlend = f11;
        this.view.postInvalidateOnAnimation();
    }

    private boolean setExpandedTypefaceInternal(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        if (this.expandedTypefaceDefault == typeface) {
            return false;
        }
        this.expandedTypefaceDefault = typeface;
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = TypefaceUtils.maybeCopyWithFontWeightAdjustment(this.view.getContext().getResources().getConfiguration(), typeface);
        this.expandedTypefaceBold = typefaceMaybeCopyWithFontWeightAdjustment;
        if (typefaceMaybeCopyWithFontWeightAdjustment == null) {
            typefaceMaybeCopyWithFontWeightAdjustment = this.expandedTypefaceDefault;
        }
        this.expandedTypeface = typefaceMaybeCopyWithFontWeightAdjustment;
        return true;
    }

    private boolean shouldDrawMultiline() {
        if (this.expandedMaxLines > 1 || this.collapsedMaxLines > 1) {
            return !this.isRtl || this.fadeModeEnabled;
        }
        return false;
    }

    private boolean shouldTruncateCollapsedToSingleLine() {
        return this.collapsedMaxLines == 1;
    }

    public float getCollapsedFullSingleLineHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public float getCollapsedSingleLineHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public void getCollapsedTextBottomTextBounds(@NonNull RectF rectF, int i11, int i12) {
        this.isRtl = calculateIsRtl(this.text);
        rectF.left = Math.max(getCollapsedTextLeftBound(i11, i12), this.collapsedBounds.left);
        rectF.top = this.collapsedBounds.top;
        rectF.right = Math.min(getCollapsedTextRightBound(rectF, i11, i12), this.collapsedBounds.right);
        rectF.bottom = this.collapsedBounds.top + getCollapsedTextHeight();
        if (this.textLayout == null || shouldTruncateCollapsedToSingleLine()) {
            return;
        }
        StaticLayout staticLayout = this.textLayout;
        float lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (this.collapsedTextSize / this.expandedTextSize);
        if (this.isRtl) {
            rectF.left = rectF.right - lineWidth;
        } else {
            rectF.right = rectF.left + lineWidth;
        }
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        int i11 = this.collapsedHeight;
        return i11 != -1 ? i11 : getCollapsedSingleLineHeight();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface typeface = this.collapsedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @ColorInt
    public int getCurrentCollapsedTextColor() {
        return getCurrentColor(this.collapsedTextColor);
    }

    public int getExpandedLineCount() {
        return this.expandedLineCount;
    }

    public int getExpandedMaxLines() {
        return this.expandedMaxLines;
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public float getExpandedTextFullSingleLineHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return (-this.tmpPaint.ascent()) + this.tmpPaint.descent();
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextHeight() {
        int i11 = this.expandedHeight;
        return i11 != -1 ? i11 : getExpandedTextSingleLineHeight();
    }

    public float getExpandedTextSingleLineHeight() {
        getTextPaintExpanded(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface typeface = this.expandedTypeface;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public float getFadeModeThresholdFraction() {
        return this.fadeModeThresholdFraction;
    }

    @RequiresApi(23)
    public int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.textLayout;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @RequiresApi(23)
    public float getLineSpacingAdd() {
        return this.textLayout.getSpacingAdd();
    }

    @RequiresApi(23)
    public float getLineSpacingMultiplier() {
        return this.textLayout.getSpacingMultiplier();
    }

    @Nullable
    public TimeInterpolator getPositionInterpolator() {
        return this.positionInterpolator;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @NonNull
    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.titleTextEllipsize;
    }

    public boolean isRtlTextDirectionHeuristicsEnabled() {
        return this.isRtlTextDirectionHeuristicsEnabled;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList = this.collapsedTextColor;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.expandedTextColor;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public void maybeUpdateFontWeightAdjustment(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.collapsedTypefaceDefault;
            if (typeface != null) {
                this.collapsedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface);
            }
            Typeface typeface2 = this.expandedTypefaceDefault;
            if (typeface2 != null) {
                this.expandedTypefaceBold = TypefaceUtils.maybeCopyWithFontWeightAdjustment(configuration, typeface2);
            }
            Typeface typeface3 = this.collapsedTypefaceBold;
            if (typeface3 == null) {
                typeface3 = this.collapsedTypefaceDefault;
            }
            this.collapsedTypeface = typeface3;
            Typeface typeface4 = this.expandedTypefaceBold;
            if (typeface4 == null) {
                typeface4 = this.expandedTypefaceDefault;
            }
            this.expandedTypeface = typeface4;
            recalculate(true);
        }
    }

    public void recalculate(boolean z11) {
        if ((this.view.getHeight() <= 0 || this.view.getWidth() <= 0) && !z11) {
            return;
        }
        calculateBaseOffsets(z11);
        calculateCurrentOffsets();
    }

    public void setCollapsedAndExpandedTextColor(@Nullable ColorStateList colorStateList) {
        if (this.collapsedTextColor == colorStateList && this.expandedTextColor == colorStateList) {
            return;
        }
        this.collapsedTextColor = colorStateList;
        this.expandedTextColor = colorStateList;
        recalculate();
    }

    public void setCollapsedBoundsForOffsets(int i11, int i12, int i13, int i14) {
        if (this.collapsedBoundsForPlacement == null) {
            this.collapsedBoundsForPlacement = new Rect(i11, i12, i13, i14);
            this.boundsChanged = true;
        }
        if (rectEquals(this.collapsedBoundsForPlacement, i11, i12, i13, i14)) {
            return;
        }
        this.collapsedBoundsForPlacement.set(i11, i12, i13, i14);
        this.boundsChanged = true;
    }

    public void setCollapsedMaxLines(int i11) {
        if (i11 != this.collapsedMaxLines) {
            this.collapsedMaxLines = i11;
            recalculate();
        }
    }

    public void setCollapsedTextAppearance(int i11) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i11);
        if (textAppearance.getTextColor() != null) {
            this.collapsedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.collapsedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.collapsedShadowColor = colorStateList;
        }
        this.collapsedShadowDx = textAppearance.shadowDx;
        this.collapsedShadowDy = textAppearance.shadowDy;
        this.collapsedShadowRadius = textAppearance.shadowRadius;
        this.collapsedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.collapsedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.collapsedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setCollapsedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.collapsedFontCallback);
        recalculate();
    }

    public void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setCollapsedTextGravity(int i11) {
        if (this.collapsedTextGravity != i11) {
            this.collapsedTextGravity = i11;
            recalculate();
        }
    }

    public void setCollapsedTextSize(float f11) {
        if (this.collapsedTextSize != f11) {
            this.collapsedTextSize = f11;
            recalculate();
        }
    }

    public void setCurrentOffsetY(int i11) {
        this.currentOffsetY = i11;
    }

    public void setExpandedLetterSpacing(float f11) {
        if (this.expandedLetterSpacing != f11) {
            this.expandedLetterSpacing = f11;
            recalculate();
        }
    }

    public void setExpandedMaxLines(int i11) {
        if (i11 != this.expandedMaxLines) {
            this.expandedMaxLines = i11;
            recalculate();
        }
    }

    public void setExpandedTextAppearance(int i11) {
        TextAppearance textAppearance = new TextAppearance(this.view.getContext(), i11);
        if (textAppearance.getTextColor() != null) {
            this.expandedTextColor = textAppearance.getTextColor();
        }
        if (textAppearance.getTextSize() != 0.0f) {
            this.expandedTextSize = textAppearance.getTextSize();
        }
        ColorStateList colorStateList = textAppearance.shadowColor;
        if (colorStateList != null) {
            this.expandedShadowColor = colorStateList;
        }
        this.expandedShadowDx = textAppearance.shadowDx;
        this.expandedShadowDy = textAppearance.shadowDy;
        this.expandedShadowRadius = textAppearance.shadowRadius;
        this.expandedLetterSpacing = textAppearance.letterSpacing;
        CancelableFontCallback cancelableFontCallback = this.expandedFontCallback;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.cancel();
        }
        this.expandedFontCallback = new CancelableFontCallback(new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public void apply(Typeface typeface) {
                CollapsingTextHelper.this.setExpandedTypeface(typeface);
            }
        }, textAppearance.getFallbackFont());
        textAppearance.getFontAsync(this.view.getContext(), this.expandedFontCallback);
        recalculate();
    }

    public void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public void setExpandedTextGravity(int i11) {
        if (this.expandedTextGravity != i11) {
            this.expandedTextGravity = i11;
            recalculate();
        }
    }

    public void setExpandedTextSize(float f11) {
        if (this.expandedTextSize != f11) {
            this.expandedTextSize = f11;
            recalculate();
        }
    }

    public void setFadeModeEnabled(boolean z11) {
        this.fadeModeEnabled = z11;
    }

    public void setFadeModeStartFraction(float f11) {
        this.fadeModeStartFraction = f11;
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
    }

    @RequiresApi(23)
    public void setHyphenationFrequency(int i11) {
        this.hyphenationFrequency = i11;
    }

    @RequiresApi(23)
    public void setLineSpacingAdd(float f11) {
        this.lineSpacingAdd = f11;
    }

    @RequiresApi(23)
    public void setLineSpacingMultiplier(@FloatRange(from = 0.0d) float f11) {
        this.lineSpacingMultiplier = f11;
    }

    public void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z11) {
        this.isRtlTextDirectionHeuristicsEnabled = z11;
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    @RequiresApi(23)
    public void setStaticLayoutBuilderConfigurer(@Nullable StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer) {
        if (this.staticLayoutBuilderConfigurer != staticLayoutBuilderConfigurer) {
            this.staticLayoutBuilderConfigurer = staticLayoutBuilderConfigurer;
            recalculate(true);
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.text, charSequence)) {
            this.text = charSequence;
            this.textToDraw = null;
            recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public void setTitleTextEllipsize(@NonNull TextUtils.TruncateAt truncateAt) {
        this.titleTextEllipsize = truncateAt;
        recalculate();
    }

    public void updateTextHeights(int i11) {
        getTextPaintCollapsed(this.tmpPaint);
        float f11 = i11;
        this.collapsedHeight = createStaticLayout(this.collapsedMaxLines, this.tmpPaint, this.text, f11 * (this.collapsedTextSize / this.expandedTextSize), this.isRtl).getHeight();
        getTextPaintExpanded(this.tmpPaint);
        this.expandedHeight = createStaticLayout(this.expandedMaxLines, this.tmpPaint, this.text, f11, this.isRtl).getHeight();
    }

    public CollapsingTextHelper(View view) {
        this.view = view;
        TextPaint textPaint = new TextPaint(129);
        this.textPaint = textPaint;
        this.tmpPaint = new TextPaint(textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
        this.fadeModeThresholdFraction = calculateFadeModeThresholdFraction();
        maybeUpdateFontWeightAdjustment(view.getContext().getResources().getConfiguration());
    }

    private boolean calculateIsRtl(@NonNull CharSequence charSequence) {
        boolean zIsDefaultIsRtl = isDefaultIsRtl();
        if (this.isRtlTextDirectionHeuristicsEnabled) {
            return isTextDirectionHeuristicsIsRtl(charSequence, zIsDefaultIsRtl);
        }
        return zIsDefaultIsRtl;
    }

    private void calculateOffsets(float f11) {
        float f12;
        interpolateBounds(f11);
        if (this.fadeModeEnabled) {
            if (f11 < this.fadeModeThresholdFraction) {
                this.currentDrawX = this.expandedDrawX;
                this.currentDrawY = this.expandedDrawY;
                setInterpolatedTextSize(0.0f);
                f12 = 0.0f;
            } else {
                this.currentDrawX = this.collapsedDrawX;
                this.currentDrawY = this.collapsedDrawY - Math.max(0, this.currentOffsetY);
                setInterpolatedTextSize(1.0f);
                f12 = 1.0f;
            }
        } else {
            this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f11, this.positionInterpolator);
            this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f11, this.positionInterpolator);
            setInterpolatedTextSize(f11);
            f12 = f11;
        }
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        setCollapsedTextBlend(1.0f - lerp(0.0f, 1.0f, 1.0f - f11, timeInterpolator));
        setExpandedTextBlend(lerp(1.0f, 0.0f, f11, timeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendARGB(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f12));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        float f13 = this.collapsedLetterSpacing;
        float f14 = this.expandedLetterSpacing;
        if (f13 != f14) {
            this.textPaint.setLetterSpacing(lerp(f14, f13, f11, timeInterpolator));
        } else {
            this.textPaint.setLetterSpacing(f13);
        }
        this.currentShadowRadius = lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f11, null);
        this.currentShadowDx = lerp(this.expandedShadowDx, this.collapsedShadowDx, f11, null);
        this.currentShadowDy = lerp(this.expandedShadowDy, this.collapsedShadowDy, f11, null);
        int iBlendARGB = blendARGB(getCurrentColor(this.expandedShadowColor), getCurrentColor(this.collapsedShadowColor), f11);
        this.currentShadowColor = iBlendARGB;
        this.textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, iBlendARGB);
        if (this.fadeModeEnabled) {
            this.textPaint.setAlpha((int) (calculateFadeModeTextAlpha(f11) * this.textPaint.getAlpha()));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.textPaint;
                textPaint.setShadowLayer(this.currentShadowRadius, this.currentShadowDx, this.currentShadowDy, MaterialColors.compositeARGBWithAlpha(this.currentShadowColor, textPaint.getAlpha()));
            }
        }
        this.view.postInvalidateOnAnimation();
    }

    private float measureTextWidth(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private void setInterpolatedTextSize(float f11) {
        calculateUsingTextSize(f11);
        this.view.postInvalidateOnAnimation();
    }

    public void draw(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.textToDraw != null && this.currentBounds.width() > 0.0f && this.currentBounds.height() > 0.0f) {
            this.textPaint.setTextSize(this.currentTextSize);
            float f11 = this.currentDrawX;
            float f12 = this.currentDrawY;
            float f13 = this.scale;
            if (f13 != 1.0f && !this.fadeModeEnabled) {
                canvas.scale(f13, f13, f11, f12);
            }
            if (shouldDrawMultiline() && shouldTruncateCollapsedToSingleLine() && (!this.fadeModeEnabled || this.expandedFraction > this.fadeModeThresholdFraction)) {
                drawMultilineTransition(canvas, this.currentDrawX - this.textLayout.getLineStart(0), f12);
            } else {
                canvas.translate(f11, f12);
                this.textLayout.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public void setCollapsedTypeface(Typeface typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setExpandedTypeface(Typeface typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate();
        }
    }

    public void setTypefaces(Typeface typeface) {
        boolean collapsedTypefaceInternal = setCollapsedTypefaceInternal(typeface);
        boolean expandedTypefaceInternal = setExpandedTypefaceInternal(typeface);
        if (!collapsedTypefaceInternal && !expandedTypefaceInternal) {
            return;
        }
        recalculate();
    }

    public void setCollapsedBounds(@NonNull Rect rect) {
        setCollapsedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void setExpandedBounds(int i11, int i12, int i13, int i14) {
        setExpandedBounds(i11, i12, i13, i14, true);
    }

    public void setExpandedBounds(@NonNull Rect rect) {
        setExpandedBounds(rect.left, rect.top, rect.right, rect.bottom);
    }
}
