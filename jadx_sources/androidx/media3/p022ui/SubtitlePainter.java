package androidx.media3.p022ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes34.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final Paint bitmapPaint;
    private Rect bitmapRect;
    private float bottomPaddingFraction;

    @Nullable
    private Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;

    @Nullable
    private CharSequence cueText;

    @Nullable
    private Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final Paint windowPaint;

    private static boolean areCharSequencesEqual(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence != charSequence2) {
            return charSequence != null && charSequence.equals(charSequence2);
        }
        return true;
    }

    private void drawBitmapLayout(Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private void drawLayout(Canvas canvas, boolean z11) {
        if (z11) {
            drawTextLayout(canvas);
            return;
        }
        Assertions.checkNotNull(this.bitmapRect);
        Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(Canvas canvas) {
        Canvas canvas2;
        StaticLayout staticLayout = this.textLayout;
        StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas2 = canvas;
            canvas2.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        } else {
            canvas2 = canvas;
        }
        int i11 = this.edgeType;
        if (i11 == 1) {
            this.textPaint.setStrokeJoin(Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else if (i11 == 2) {
            TextPaint textPaint = this.textPaint;
            float f11 = this.shadowRadius;
            float f12 = this.shadowOffset;
            textPaint.setShadowLayer(f11, f12, f12, this.edgeColor);
        } else if (i11 == 3 || i11 == 4) {
            boolean z11 = i11 == 3;
            int i12 = z11 ? -1 : this.edgeColor;
            int i13 = z11 ? this.edgeColor : -1;
            float f13 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(Paint.Style.FILL);
            float f14 = -f13;
            this.textPaint.setShadowLayer(this.shadowRadius, f14, f14, i12);
            staticLayout2.draw(canvas2);
            this.textPaint.setShadowLayer(this.shadowRadius, f13, f13, i13);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    private void setupBitmapLayout() {
        float f11;
        int i11;
        float f12;
        Bitmap bitmap = this.cueBitmap;
        int i12 = this.parentRight;
        int i13 = this.parentLeft;
        int i14 = this.parentBottom;
        int i15 = this.parentTop;
        float f13 = i12 - i13;
        float f14 = i13 + (this.cuePosition * f13);
        float f15 = i14 - i15;
        float f16 = i15 + (this.cueLine * f15);
        int iRound = Math.round(f13 * this.cueSize);
        float f17 = this.cueBitmapHeight;
        int iRound2 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Math.round(iRound * (bitmap.getHeight() / bitmap.getWidth()));
        int i16 = this.cuePositionAnchor;
        if (i16 != 2) {
            if (i16 == 1) {
                f11 = iRound / 2;
            }
            int iRound3 = Math.round(f14);
            i11 = this.cueLineAnchor;
            if (i11 == 2) {
                if (i11 == 1) {
                    f12 = iRound2 / 2;
                }
                int iRound4 = Math.round(f16);
                this.bitmapRect = new Rect(iRound3, iRound4, iRound + iRound3, iRound2 + iRound4);
            }
            f12 = iRound2;
            f16 -= f12;
            int iRound5 = Math.round(f16);
            this.bitmapRect = new Rect(iRound3, iRound5, iRound + iRound3, iRound2 + iRound5);
        }
        f11 = iRound;
        f14 -= f11;
        int iRound6 = Math.round(f14);
        i11 = this.cueLineAnchor;
        if (i11 == 2) {
            if (i11 == 1) {
                f12 = iRound2 / 2;
            }
            int iRound7 = Math.round(f16);
            this.bitmapRect = new Rect(iRound6, iRound7, iRound + iRound6, iRound2 + iRound7);
        }
        f12 = iRound2;
        f16 -= f12;
        int iRound8 = Math.round(f16);
        this.bitmapRect = new Rect(iRound6, iRound8, iRound + iRound6, iRound2 + iRound8);
    }

    private void setupTextLayout() {
        int iMax;
        int iMin;
        int iRound;
        CharSequence charSequence = this.cueText;
        SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(this.cueText);
        int i11 = this.parentRight - this.parentLeft;
        int i12 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i13 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i14 = i13 * 2;
        int i15 = i11 - i14;
        float f11 = this.cueSize;
        float f12 = -3.4028235E38f;
        if (f11 != -3.4028235E38f) {
            i15 = (int) (i15 * f11);
        }
        int i16 = i15;
        String str = TAG;
        if (i16 <= 0) {
            Log.m2961w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), ForegroundColorSpan.class);
            int length = foregroundColorSpanArr.length;
            int i17 = 0;
            while (i17 < length) {
                spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i17]);
                i17++;
                f12 = f12;
            }
        }
        float f13 = f12;
        if (Color.alpha(this.backgroundColor) > 0) {
            int i18 = this.edgeType;
            if (i18 == 0 || i18 == 2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i16, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        int i19 = 0;
        while (i19 < lineCount) {
            iMax2 = Math.max((int) Math.ceil(this.textLayout.getLineWidth(i19)), iMax2);
            i19++;
            str = str;
        }
        String str2 = str;
        if (this.cueSize == f13 || iMax2 >= i16) {
            i16 = iMax2;
        }
        int i21 = i16 + i14;
        float f14 = this.cuePosition;
        if (f14 != f13) {
            int iRound2 = Math.round(i11 * f14);
            int i22 = this.parentLeft;
            int i23 = iRound2 + i22;
            int i24 = this.cuePositionAnchor;
            if (i24 == 1) {
                i23 = ((i23 * 2) - i21) / 2;
            } else if (i24 == 2) {
                i23 -= i21;
            }
            iMax = Math.max(i23, i22);
            iMin = Math.min(i21 + iMax, this.parentRight);
        } else {
            iMax = ((i11 - i21) / 2) + this.parentLeft;
            iMin = iMax + i21;
        }
        int i25 = iMin - iMax;
        if (i25 <= 0) {
            Log.m2961w(str2, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f15 = this.cueLine;
        if (f15 != f13) {
            if (this.cueLineType == 0) {
                iRound = Math.round(i12 * f15) + this.parentTop;
                int i26 = this.cueLineAnchor;
                if (i26 == 2) {
                    iRound -= height;
                } else if (i26 == 1) {
                    iRound = ((iRound * 2) - height) / 2;
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f16 = this.cueLine;
                if (f16 >= 0.0f) {
                    iRound = Math.round(f16 * lineBottom) + this.parentTop;
                } else {
                    iRound = Math.round((f16 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                }
            }
            int i27 = iRound + height;
            int i28 = this.parentBottom;
            if (i27 > i28) {
                iRound = i28 - height;
            } else {
                int i29 = this.parentTop;
                if (iRound < i29) {
                    iRound = i29;
                }
            }
        } else {
            iRound = (this.parentBottom - height) - ((int) (i12 * this.bottomPaddingFraction));
        }
        this.textLayout = new StaticLayout(spannableStringBuilder, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new StaticLayout(spannableStringBuilder2, this.textPaint, i25, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = iRound;
        this.textPaddingX = i13;
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f11, float f12, float f13, Canvas canvas, int i11, int i12, int i13, int i14) {
        int i15;
        boolean z11 = cue.bitmap == null;
        if (!z11) {
            i15 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i15 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && Util.areEqual(Integer.valueOf(this.cueLineAnchor), Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && Util.areEqual(Integer.valueOf(this.cuePositionAnchor), Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i15 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f11 && this.cueTextSizePx == f12 && this.bottomPaddingFraction == f13 && this.parentLeft == i11 && this.parentTop == i12 && this.parentRight == i13 && this.parentBottom == i14) {
            drawLayout(canvas, z11);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i15;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f11;
        this.cueTextSizePx = f12;
        this.bottomPaddingFraction = f13;
        this.parentLeft = i11;
        this.parentTop = i12;
        this.parentRight = i13;
        this.parentBottom = i14;
        if (z11) {
            Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z11);
    }

    public SubtitlePainter(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        TextPaint textPaint = new TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }
}
