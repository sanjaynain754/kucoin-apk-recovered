package com.facebook.react.uimanager.drawable;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Preconditions;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.LengthPercentageType;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes45.dex */
@UnstableReactNativeAPI
public class CSSBackgroundDrawable extends Drawable {
    private static final int ALL_BITS_SET = -1;
    private static final int ALL_BITS_UNSET = 0;
    private static final int DEFAULT_BORDER_ALPHA = 255;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final int DEFAULT_BORDER_RGB = 0;

    @Nullable
    private Path mBackgroundColorRenderPath;

    @Nullable
    private Spacing mBorderAlpha;

    @Nullable
    private Spacing mBorderRGB;

    @Nullable
    private BorderStyle mBorderStyle;

    @Nullable
    private Spacing mBorderWidth;

    @Nullable
    private Path mCenterDrawPath;
    private final Context mContext;

    @Nullable
    private PointF mInnerBottomLeftCorner;

    @Nullable
    private PointF mInnerBottomRightCorner;

    @Nullable
    private Path mInnerClipPathForBorderRadius;

    @Nullable
    private RectF mInnerClipTempRectForBorderRadius;

    @Nullable
    private PointF mInnerTopLeftCorner;

    @Nullable
    private PointF mInnerTopRightCorner;

    @Nullable
    private Path mOuterClipPathForBorderRadius;

    @Nullable
    private RectF mOuterClipTempRectForBorderRadius;

    @Nullable
    private Path mPathForBorder;

    @Nullable
    private Path mPathForBorderRadiusOutline;

    @Nullable
    private RectF mTempRectForBorderRadiusOutline;

    @Nullable
    private RectF mTempRectForCenterDrawPath;
    private final Path mPathForSingleBorder = new Path();
    private boolean mNeedUpdatePathForBorderRadius = false;
    private final Paint mPaint = new Paint(1);
    private int mColor = 0;

    @Nullable
    private List<BackgroundImageLayer> mBackgroundImageLayers = null;
    private int mAlpha = 255;
    private final float mGapBetweenPaths = 0.8f;
    private BorderRadiusStyle mBorderRadius = new BorderRadiusStyle();
    private ComputedBorderRadius mComputedBorderRadius = new ComputedBorderRadius();
    private int mLayoutDirectionOverride = -1;

    private static int fastBorderCompatibleColorOrZero(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = (i14 > 0 ? i18 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1) & (i13 > 0 ? i17 : -1);
        if (i11 <= 0) {
            i15 = 0;
        }
        if (i12 <= 0) {
            i16 = 0;
        }
        int i21 = i15 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        int i22 = i21 | i17;
        if (i14 <= 0) {
            i18 = 0;
        }
        if (i19 == (i22 | i18)) {
            return i19;
        }
        return 0;
    }

    @Nullable
    private static PathEffect getPathEffect(BorderStyle borderStyle, float f11) {
        int i11 = C61231.$SwitchMap$com$facebook$react$uimanager$style$BorderStyle[borderStyle.ordinal()];
        if (i11 == 2) {
            float f12 = f11 * 3.0f;
            return new DashPathEffect(new float[]{f12, f12, f12, f12}, 0.0f);
        }
        if (i11 != 3) {
            return null;
        }
        return new DashPathEffect(new float[]{f11, f11, f11, f11}, 0.0f);
    }

    private void updatePathEffect() {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, getFullBorderWidth()) : null);
    }

    public RectF getDirectionAwareBorderInsets() {
        float borderWidthOrDefaultTo = getBorderWidthOrDefaultTo(0.0f, 8);
        float borderWidthOrDefaultTo2 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 1);
        float borderWidthOrDefaultTo3 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 3);
        float borderWidthOrDefaultTo4 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 0);
        float borderWidthOrDefaultTo5 = getBorderWidthOrDefaultTo(borderWidthOrDefaultTo, 2);
        if (this.mBorderWidth != null) {
            boolean z11 = getLayoutDirection() == 1;
            float raw = this.mBorderWidth.getRaw(4);
            float raw2 = this.mBorderWidth.getRaw(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo4 = raw;
                }
                if (!Float.isNaN(raw2)) {
                    borderWidthOrDefaultTo5 = raw2;
                }
                float f11 = z11 ? borderWidthOrDefaultTo5 : borderWidthOrDefaultTo4;
                if (z11) {
                    borderWidthOrDefaultTo5 = borderWidthOrDefaultTo4;
                }
                borderWidthOrDefaultTo4 = f11;
            } else {
                float f12 = z11 ? raw2 : raw;
                if (!z11) {
                    raw = raw2;
                }
                if (!Float.isNaN(f12)) {
                    borderWidthOrDefaultTo4 = f12;
                }
                if (!Float.isNaN(raw)) {
                    borderWidthOrDefaultTo5 = raw;
                }
            }
        }
        return new RectF(borderWidthOrDefaultTo4, borderWidthOrDefaultTo2, borderWidthOrDefaultTo5, borderWidthOrDefaultTo3);
    }

    public float getInnerBorderRadius(float f11, float f12) {
        return Math.max(f11 - f12, 0.0f);
    }

    public void setBorderRadius(BorderRadiusProp borderRadiusProp, @Nullable LengthPercentage lengthPercentage) {
        if (Objects.equals(lengthPercentage, this.mBorderRadius.get(borderRadiusProp))) {
            return;
        }
        this.mBorderRadius.set(borderRadiusProp, lengthPercentage);
        this.mNeedUpdatePathForBorderRadius = true;
        invalidateSelf();
    }

    public void setBorderStyle(@Nullable String str) {
        setBorderStyle(str == null ? null : BorderStyle.valueOf(str.toUpperCase(Locale.US)));
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f11) {
        Float fValueOf = Float.isNaN(f11) ? null : Float.valueOf(f11);
        if (fValueOf == null) {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, null);
        } else {
            setBorderRadius(BorderRadiusProp.BORDER_RADIUS, new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.drawable.CSSBackgroundDrawable$1 */
    public static /* synthetic */ class C61231 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$style$BorderStyle;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            $SwitchMap$com$facebook$react$uimanager$style$BorderStyle = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$style$BorderStyle[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void drawQuadrilateral(Canvas canvas, int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (i11 == 0) {
            return;
        }
        if (this.mPathForBorder == null) {
            this.mPathForBorder = new Path();
        }
        this.mPaint.setColor(i11);
        this.mPathForBorder.reset();
        this.mPathForBorder.moveTo(f11, f12);
        this.mPathForBorder.lineTo(f13, f14);
        this.mPathForBorder.lineTo(f15, f16);
        this.mPathForBorder.lineTo(f17, f18);
        this.mPathForBorder.lineTo(f11, f12);
        canvas.drawPath(this.mPathForBorder, this.mPaint);
    }

    private void drawRectangularBackgroundWithBorders(Canvas canvas) {
        int i11;
        CSSBackgroundDrawable cSSBackgroundDrawable;
        this.mPaint.setStyle(Paint.Style.FILL);
        int iMultiplyColorAlpha = multiplyColorAlpha(this.mColor, this.mAlpha);
        if (Color.alpha(iMultiplyColorAlpha) != 0) {
            this.mPaint.setColor(iMultiplyColorAlpha);
            canvas.drawRect(getBounds(), this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            canvas.drawRect(getBounds(), this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int iRound = Math.round(directionAwareBorderInsets.left);
        int iRound2 = Math.round(directionAwareBorderInsets.top);
        int iRound3 = Math.round(directionAwareBorderInsets.right);
        int iRound4 = Math.round(directionAwareBorderInsets.bottom);
        if (iRound > 0 || iRound3 > 0 || iRound2 > 0 || iRound4 > 0) {
            Rect bounds = getBounds();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(9);
            int borderColor6 = getBorderColor(11);
            int borderColor7 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor5;
                borderColor4 = borderColor2;
            }
            if (isBorderColorDefined(10)) {
                borderColor4 = borderColor7;
            }
            if (isBorderColorDefined(11)) {
                borderColor2 = borderColor6;
            }
            boolean z11 = getLayoutDirection() == 1;
            int borderColor8 = getBorderColor(4);
            int borderColor9 = getBorderColor(5);
            if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                if (isBorderColorDefined(4)) {
                    borderColor = borderColor8;
                }
                if (isBorderColorDefined(5)) {
                    borderColor3 = borderColor9;
                }
                int i12 = z11 ? borderColor3 : borderColor;
                if (z11) {
                    borderColor3 = borderColor;
                }
                i11 = iRound;
                borderColor = i12;
            } else {
                int i13 = z11 ? borderColor9 : borderColor8;
                if (!z11) {
                    borderColor8 = borderColor9;
                }
                boolean zIsBorderColorDefined = isBorderColorDefined(4);
                i11 = iRound;
                boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                boolean z12 = z11 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                if (!z11) {
                    zIsBorderColorDefined = zIsBorderColorDefined2;
                }
                if (z12) {
                    borderColor = i13;
                }
                if (zIsBorderColorDefined) {
                    borderColor3 = borderColor8;
                }
            }
            int i14 = bounds.left;
            int i15 = bounds.top;
            int iFastBorderCompatibleColorOrZero = fastBorderCompatibleColorOrZero(i11, iRound2, iRound3, iRound4, borderColor, borderColor2, borderColor3, borderColor4);
            int i16 = borderColor2;
            int i17 = borderColor3;
            int i18 = borderColor4;
            if (iFastBorderCompatibleColorOrZero == 0) {
                this.mPaint.setAntiAlias(false);
                int iWidth = bounds.width();
                int iHeight = bounds.height();
                if (i11 > 0) {
                    float f11 = i14;
                    float f12 = i14 + i11;
                    int i19 = i15 + iHeight;
                    drawQuadrilateral(canvas, borderColor, f11, i15, f12, i15 + iRound2, f12, i19 - iRound4, f11, i19);
                }
                if (iRound2 > 0) {
                    float f13 = i15;
                    float f14 = i15 + iRound2;
                    int i21 = i14 + iWidth;
                    drawQuadrilateral(canvas, i16, i14, f13, i14 + i11, f14, i21 - iRound3, f14, i21, f13);
                }
                if (iRound3 > 0) {
                    int i22 = i14 + iWidth;
                    float f15 = i22;
                    int i23 = i15 + iHeight;
                    float f16 = i22 - iRound3;
                    drawQuadrilateral(canvas, i17, f15, i15, f15, i23, f16, i23 - iRound4, f16, i15 + iRound2);
                }
                if (iRound4 > 0) {
                    int i24 = i15 + iHeight;
                    float f17 = i24;
                    int i25 = iWidth + i14;
                    float f18 = i24 - iRound4;
                    cSSBackgroundDrawable = this;
                    cSSBackgroundDrawable.drawQuadrilateral(canvas, i18, i14, f17, i25, f17, i25 - iRound3, f18, i14 + i11, f18);
                } else {
                    cSSBackgroundDrawable = this;
                }
                cSSBackgroundDrawable.mPaint.setAntiAlias(true);
                return;
            }
            if (Color.alpha(iFastBorderCompatibleColorOrZero) != 0) {
                int i26 = bounds.right;
                int i27 = bounds.bottom;
                this.mPaint.setColor(iFastBorderCompatibleColorOrZero);
                this.mPaint.setStyle(Paint.Style.STROKE);
                if (i11 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound5 = Math.round(directionAwareBorderInsets.left);
                    updatePathEffect(iRound5);
                    this.mPaint.setStrokeWidth(iRound5);
                    float f19 = (iRound5 / 2) + i14;
                    this.mPathForSingleBorder.moveTo(f19, i15);
                    this.mPathForSingleBorder.lineTo(f19, i27);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound2 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound6 = Math.round(directionAwareBorderInsets.top);
                    updatePathEffect(iRound6);
                    this.mPaint.setStrokeWidth(iRound6);
                    float f21 = (iRound6 / 2) + i15;
                    this.mPathForSingleBorder.moveTo(i14, f21);
                    this.mPathForSingleBorder.lineTo(i26, f21);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound3 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound7 = Math.round(directionAwareBorderInsets.right);
                    updatePathEffect(iRound7);
                    this.mPaint.setStrokeWidth(iRound7);
                    float f22 = i26 - (iRound7 / 2);
                    this.mPathForSingleBorder.moveTo(f22, i15);
                    this.mPathForSingleBorder.lineTo(f22, i27);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
                if (iRound4 > 0) {
                    this.mPathForSingleBorder.reset();
                    int iRound8 = Math.round(directionAwareBorderInsets.bottom);
                    updatePathEffect(iRound8);
                    this.mPaint.setStrokeWidth(iRound8);
                    float f23 = i27 - (iRound8 / 2);
                    this.mPathForSingleBorder.moveTo(i14, f23);
                    this.mPathForSingleBorder.lineTo(i26, f23);
                    canvas.drawPath(this.mPathForSingleBorder, this.mPaint);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    private void drawRoundedBackgroundWithBorders(Canvas canvas) {
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        PointF pointF4;
        float f15;
        float f16;
        PointF pointF5;
        PointF pointF6;
        PointF pointF7;
        updatePath();
        canvas.save();
        canvas.clipPath((Path) Preconditions.checkNotNull(this.mOuterClipPathForBorderRadius), Region.Op.INTERSECT);
        int i13 = this.mColor;
        int alphaComponent = ColorUtils.setAlphaComponent(i13, (Color.alpha(i13) * this.mAlpha) >> 8);
        if (Color.alpha(alphaComponent) != 0) {
            this.mPaint.setColor(alphaComponent);
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) Preconditions.checkNotNull(this.mBackgroundColorRenderPath), this.mPaint);
        }
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        if (list != null && !list.isEmpty()) {
            this.mPaint.setShader(getBackgroundImageShader());
            this.mPaint.setStyle(Paint.Style.FILL);
            canvas.drawPath((Path) Preconditions.checkNotNull(this.mBackgroundColorRenderPath), this.mPaint);
            this.mPaint.setShader(null);
        }
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        int borderColor = getBorderColor(0);
        int borderColor2 = getBorderColor(1);
        int borderColor3 = getBorderColor(2);
        int borderColor4 = getBorderColor(3);
        int borderColor5 = getBorderColor(9);
        int borderColor6 = getBorderColor(11);
        int borderColor7 = getBorderColor(10);
        if (isBorderColorDefined(9)) {
            borderColor2 = borderColor5;
            borderColor4 = borderColor2;
        }
        if (!isBorderColorDefined(10)) {
            borderColor7 = borderColor4;
        }
        if (!isBorderColorDefined(11)) {
            borderColor6 = borderColor2;
        }
        if (directionAwareBorderInsets.top > 0.0f || directionAwareBorderInsets.bottom > 0.0f || directionAwareBorderInsets.left > 0.0f || directionAwareBorderInsets.right > 0.0f) {
            float fullBorderWidth = getFullBorderWidth();
            int borderColor8 = getBorderColor(8);
            if (directionAwareBorderInsets.top != fullBorderWidth || directionAwareBorderInsets.bottom != fullBorderWidth || directionAwareBorderInsets.left != fullBorderWidth || directionAwareBorderInsets.right != fullBorderWidth || borderColor != borderColor8 || borderColor6 != borderColor8 || borderColor3 != borderColor8 || borderColor7 != borderColor8) {
                this.mPaint.setStyle(Paint.Style.FILL);
                canvas.clipPath((Path) Preconditions.checkNotNull(this.mInnerClipPathForBorderRadius), Region.Op.DIFFERENCE);
                boolean z11 = getLayoutDirection() == 1;
                int borderColor9 = getBorderColor(4);
                int borderColor10 = getBorderColor(5);
                if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(this.mContext)) {
                    if (isBorderColorDefined(4)) {
                        borderColor = borderColor9;
                    }
                    if (isBorderColorDefined(5)) {
                        borderColor3 = borderColor10;
                    }
                    int i14 = z11 ? borderColor3 : borderColor;
                    if (z11) {
                        borderColor3 = borderColor;
                    }
                    i11 = i14;
                } else {
                    int i15 = z11 ? borderColor10 : borderColor9;
                    if (!z11) {
                        borderColor9 = borderColor10;
                    }
                    boolean zIsBorderColorDefined = isBorderColorDefined(4);
                    boolean zIsBorderColorDefined2 = isBorderColorDefined(5);
                    boolean z12 = z11 ? zIsBorderColorDefined2 : zIsBorderColorDefined;
                    if (!z11) {
                        zIsBorderColorDefined = zIsBorderColorDefined2;
                    }
                    if (z12) {
                        borderColor = i15;
                    }
                    i11 = borderColor;
                    if (zIsBorderColorDefined) {
                        i12 = borderColor9;
                    }
                    RectF rectF = (RectF) Preconditions.checkNotNull(this.mOuterClipTempRectForBorderRadius);
                    f11 = rectF.left;
                    f12 = rectF.right;
                    f13 = rectF.top;
                    f14 = rectF.bottom;
                    pointF = (PointF) Preconditions.checkNotNull(this.mInnerTopLeftCorner);
                    pointF2 = (PointF) Preconditions.checkNotNull(this.mInnerTopRightCorner);
                    pointF3 = (PointF) Preconditions.checkNotNull(this.mInnerBottomLeftCorner);
                    pointF4 = (PointF) Preconditions.checkNotNull(this.mInnerBottomRightCorner);
                    if (directionAwareBorderInsets.left > 0.0f) {
                        f15 = f14;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                        drawQuadrilateral(canvas, i11, f11, f13 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f11, f14 + 0.8f);
                        f16 = f11;
                    } else {
                        f15 = f14;
                        f16 = f11;
                        pointF5 = pointF;
                        pointF6 = pointF3;
                        pointF7 = pointF4;
                    }
                    if (directionAwareBorderInsets.top > 0.0f) {
                        drawQuadrilateral(canvas, borderColor6, f16 - 0.8f, f13, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f12 + 0.8f, f13);
                    }
                    if (directionAwareBorderInsets.right > 0.0f) {
                        drawQuadrilateral(canvas, i12, f12, f13 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f12, f15 + 0.8f);
                    }
                    if (directionAwareBorderInsets.bottom > 0.0f) {
                        drawQuadrilateral(canvas, borderColor7, f16 - 0.8f, f15, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f12 + 0.8f, f15);
                    }
                }
                i12 = borderColor3;
                RectF rectF2 = (RectF) Preconditions.checkNotNull(this.mOuterClipTempRectForBorderRadius);
                f11 = rectF2.left;
                f12 = rectF2.right;
                f13 = rectF2.top;
                f14 = rectF2.bottom;
                pointF = (PointF) Preconditions.checkNotNull(this.mInnerTopLeftCorner);
                pointF2 = (PointF) Preconditions.checkNotNull(this.mInnerTopRightCorner);
                pointF3 = (PointF) Preconditions.checkNotNull(this.mInnerBottomLeftCorner);
                pointF4 = (PointF) Preconditions.checkNotNull(this.mInnerBottomRightCorner);
                if (directionAwareBorderInsets.left > 0.0f) {
                    f15 = f14;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                    drawQuadrilateral(canvas, i11, f11, f13 - 0.8f, pointF.x, pointF.y - 0.8f, pointF3.x, pointF3.y + 0.8f, f11, f14 + 0.8f);
                    f16 = f11;
                } else {
                    f15 = f14;
                    f16 = f11;
                    pointF5 = pointF;
                    pointF6 = pointF3;
                    pointF7 = pointF4;
                }
                if (directionAwareBorderInsets.top > 0.0f) {
                    drawQuadrilateral(canvas, borderColor6, f16 - 0.8f, f13, pointF5.x - 0.8f, pointF5.y, pointF2.x + 0.8f, pointF2.y, f12 + 0.8f, f13);
                }
                if (directionAwareBorderInsets.right > 0.0f) {
                    drawQuadrilateral(canvas, i12, f12, f13 - 0.8f, pointF2.x, pointF2.y - 0.8f, pointF7.x, pointF7.y + 0.8f, f12, f15 + 0.8f);
                }
                if (directionAwareBorderInsets.bottom > 0.0f) {
                    drawQuadrilateral(canvas, borderColor7, f16 - 0.8f, f15, pointF6.x - 0.8f, pointF6.y, pointF7.x + 0.8f, pointF7.y, f12 + 0.8f, f15);
                }
            } else if (fullBorderWidth > 0.0f) {
                this.mPaint.setColor(multiplyColorAlpha(borderColor8, this.mAlpha));
                this.mPaint.setStyle(Paint.Style.STROKE);
                this.mPaint.setStrokeWidth(fullBorderWidth);
                canvas.drawPath((Path) Preconditions.checkNotNull(this.mCenterDrawPath), this.mPaint);
            }
        }
        canvas.restore();
    }

    @Nullable
    private Shader getBackgroundImageShader() {
        List<BackgroundImageLayer> list = this.mBackgroundImageLayers;
        Shader composeShader = null;
        if (list == null) {
            return null;
        }
        Iterator<BackgroundImageLayer> it = list.iterator();
        while (it.hasNext()) {
            Shader shader = it.next().getShader(getBounds());
            if (shader != null) {
                composeShader = composeShader == null ? shader : new ComposeShader(shader, composeShader, PorterDuff.Mode.SRC_OVER);
            }
        }
        return composeShader;
    }

    private static void getEllipseIntersectionWithLine(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, PointF pointF) {
        double d19 = (d11 + d13) / 2.0d;
        double d21 = (d12 + d14) / 2.0d;
        double d22 = d15 - d19;
        double d23 = d16 - d21;
        double dAbs = Math.abs(d13 - d11) / 2.0d;
        double dAbs2 = Math.abs(d14 - d12) / 2.0d;
        double d24 = ((d18 - d21) - d23) / ((d17 - d19) - d22);
        double d25 = d23 - (d22 * d24);
        double d26 = dAbs2 * dAbs2;
        double d27 = dAbs * dAbs;
        double d28 = d26 + (d27 * d24 * d24);
        double d29 = dAbs * 2.0d * dAbs * d25 * d24;
        double d31 = (-(d27 * ((d25 * d25) - d26))) / d28;
        double d32 = d28 * 2.0d;
        double dSqrt = ((-d29) / d32) - Math.sqrt(d31 + Math.pow(d29 / d32, 2.0d));
        double d33 = (d24 * dSqrt) + d25;
        double d34 = dSqrt + d19;
        double d35 = d33 + d21;
        if (Double.isNaN(d34) || Double.isNaN(d35)) {
            return;
        }
        pointF.x = (float) d34;
        pointF.y = (float) d35;
    }

    private boolean isBorderColorDefined(int i11) {
        Spacing spacing = this.mBorderRGB;
        float f11 = spacing != null ? spacing.get(i11) : Float.NaN;
        Spacing spacing2 = this.mBorderAlpha;
        return (Float.isNaN(f11) || Float.isNaN(spacing2 != null ? spacing2.get(i11) : Float.NaN)) ? false : true;
    }

    private static int multiplyColorAlpha(int i11, int i12) {
        if (i12 == 255) {
            return i11;
        }
        if (i12 == 0) {
            return i11 & 16777215;
        }
        return (i11 & 16777215) | ((((i11 >>> 24) * (i12 + (i12 >> 7))) >> 8) << 24);
    }

    private void setBorderAlpha(int i11, float f11) {
        if (this.mBorderAlpha == null) {
            this.mBorderAlpha = new Spacing(255.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderAlpha.getRaw(i11), f11)) {
            return;
        }
        this.mBorderAlpha.set(i11, f11);
        invalidateSelf();
    }

    private void setBorderRGB(int i11, float f11) {
        if (this.mBorderRGB == null) {
            this.mBorderRGB = new Spacing(0.0f);
        }
        if (FloatUtil.floatsEqual(this.mBorderRGB.getRaw(i11), f11)) {
            return;
        }
        this.mBorderRGB.set(i11, f11);
        invalidateSelf();
    }

    private void updatePath() {
        float f11;
        if (this.mNeedUpdatePathForBorderRadius) {
            this.mNeedUpdatePathForBorderRadius = false;
            if (this.mInnerClipPathForBorderRadius == null) {
                this.mInnerClipPathForBorderRadius = new Path();
            }
            if (this.mBackgroundColorRenderPath == null) {
                this.mBackgroundColorRenderPath = new Path();
            }
            if (this.mOuterClipPathForBorderRadius == null) {
                this.mOuterClipPathForBorderRadius = new Path();
            }
            if (this.mPathForBorderRadiusOutline == null) {
                this.mPathForBorderRadiusOutline = new Path();
            }
            if (this.mCenterDrawPath == null) {
                this.mCenterDrawPath = new Path();
            }
            if (this.mInnerClipTempRectForBorderRadius == null) {
                this.mInnerClipTempRectForBorderRadius = new RectF();
            }
            if (this.mOuterClipTempRectForBorderRadius == null) {
                this.mOuterClipTempRectForBorderRadius = new RectF();
            }
            if (this.mTempRectForBorderRadiusOutline == null) {
                this.mTempRectForBorderRadiusOutline = new RectF();
            }
            if (this.mTempRectForCenterDrawPath == null) {
                this.mTempRectForCenterDrawPath = new RectF();
            }
            this.mInnerClipPathForBorderRadius.reset();
            this.mBackgroundColorRenderPath.reset();
            this.mOuterClipPathForBorderRadius.reset();
            this.mPathForBorderRadiusOutline.reset();
            this.mCenterDrawPath.reset();
            this.mInnerClipTempRectForBorderRadius.set(getBounds());
            this.mOuterClipTempRectForBorderRadius.set(getBounds());
            this.mTempRectForBorderRadiusOutline.set(getBounds());
            this.mTempRectForCenterDrawPath.set(getBounds());
            RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
            int borderColor = getBorderColor(0);
            int borderColor2 = getBorderColor(1);
            int borderColor3 = getBorderColor(2);
            int borderColor4 = getBorderColor(3);
            int borderColor5 = getBorderColor(8);
            int borderColor6 = getBorderColor(9);
            int borderColor7 = getBorderColor(11);
            int borderColor8 = getBorderColor(10);
            if (isBorderColorDefined(9)) {
                borderColor2 = borderColor6;
                borderColor4 = borderColor2;
            }
            if (!isBorderColorDefined(10)) {
                borderColor8 = borderColor4;
            }
            if (!isBorderColorDefined(11)) {
                borderColor7 = borderColor2;
            }
            if (Color.alpha(borderColor) == 0 || Color.alpha(borderColor7) == 0 || Color.alpha(borderColor3) == 0 || Color.alpha(borderColor8) == 0 || Color.alpha(borderColor5) == 0) {
                f11 = 0.0f;
            } else {
                RectF rectF = this.mInnerClipTempRectForBorderRadius;
                rectF.top += directionAwareBorderInsets.top;
                rectF.bottom -= directionAwareBorderInsets.bottom;
                rectF.left += directionAwareBorderInsets.left;
                rectF.right -= directionAwareBorderInsets.right;
                f11 = 0.8f;
            }
            RectF rectF2 = this.mTempRectForCenterDrawPath;
            rectF2.top += directionAwareBorderInsets.top * 0.5f;
            rectF2.bottom -= directionAwareBorderInsets.bottom * 0.5f;
            rectF2.left += directionAwareBorderInsets.left * 0.5f;
            rectF2.right -= directionAwareBorderInsets.right * 0.5f;
            ComputedBorderRadius computedBorderRadiusResolve = this.mBorderRadius.resolve(getLayoutDirection(), this.mContext, PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.width()), PixelUtil.toDIPFromPixel(this.mOuterClipTempRectForBorderRadius.height()));
            this.mComputedBorderRadius = computedBorderRadiusResolve;
            CornerRadii pixelFromDIP = computedBorderRadiusResolve.getTopLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP2 = this.mComputedBorderRadius.getTopRight().toPixelFromDIP();
            CornerRadii pixelFromDIP3 = this.mComputedBorderRadius.getBottomLeft().toPixelFromDIP();
            CornerRadii pixelFromDIP4 = this.mComputedBorderRadius.getBottomRight().toPixelFromDIP();
            float innerBorderRadius = getInnerBorderRadius(pixelFromDIP.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius2 = getInnerBorderRadius(pixelFromDIP.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius3 = getInnerBorderRadius(pixelFromDIP2.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius4 = getInnerBorderRadius(pixelFromDIP2.getVertical(), directionAwareBorderInsets.top);
            float innerBorderRadius5 = getInnerBorderRadius(pixelFromDIP4.getHorizontal(), directionAwareBorderInsets.right);
            float innerBorderRadius6 = getInnerBorderRadius(pixelFromDIP4.getVertical(), directionAwareBorderInsets.bottom);
            float innerBorderRadius7 = getInnerBorderRadius(pixelFromDIP3.getHorizontal(), directionAwareBorderInsets.left);
            float innerBorderRadius8 = getInnerBorderRadius(pixelFromDIP3.getVertical(), directionAwareBorderInsets.bottom);
            Path path = this.mInnerClipPathForBorderRadius;
            float f12 = f11;
            RectF rectF3 = this.mInnerClipTempRectForBorderRadius;
            float[] fArr = {innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8};
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF3, fArr, direction);
            Path path2 = this.mBackgroundColorRenderPath;
            RectF rectF4 = this.mInnerClipTempRectForBorderRadius;
            path2.addRoundRect(rectF4.left - f12, rectF4.top - f12, rectF4.right + f12, rectF4.bottom + f12, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, direction);
            this.mOuterClipPathForBorderRadius.addRoundRect(this.mOuterClipTempRectForBorderRadius, new float[]{pixelFromDIP.getHorizontal(), pixelFromDIP.getVertical(), pixelFromDIP2.getHorizontal(), pixelFromDIP2.getVertical(), pixelFromDIP4.getHorizontal(), pixelFromDIP4.getVertical(), pixelFromDIP3.getHorizontal(), pixelFromDIP3.getVertical()}, direction);
            Spacing spacing = this.mBorderWidth;
            float f13 = spacing != null ? spacing.get(8) / 2.0f : 0.0f;
            this.mPathForBorderRadiusOutline.addRoundRect(this.mTempRectForBorderRadiusOutline, new float[]{pixelFromDIP.getHorizontal() + f13, pixelFromDIP.getVertical() + f13, pixelFromDIP2.getHorizontal() + f13, pixelFromDIP2.getVertical() + f13, pixelFromDIP4.getHorizontal() + f13, pixelFromDIP4.getVertical() + f13, pixelFromDIP3.getHorizontal() + f13, pixelFromDIP3.getVertical() + f13}, direction);
            this.mCenterDrawPath.addRoundRect(this.mTempRectForCenterDrawPath, new float[]{pixelFromDIP.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP2.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP2.getVertical() - (directionAwareBorderInsets.top * 0.5f), pixelFromDIP4.getHorizontal() - (directionAwareBorderInsets.right * 0.5f), pixelFromDIP4.getVertical() - (directionAwareBorderInsets.bottom * 0.5f), pixelFromDIP3.getHorizontal() - (directionAwareBorderInsets.left * 0.5f), pixelFromDIP3.getVertical() - (directionAwareBorderInsets.bottom * 0.5f)}, direction);
            if (this.mInnerTopLeftCorner == null) {
                this.mInnerTopLeftCorner = new PointF();
            }
            PointF pointF = this.mInnerTopLeftCorner;
            RectF rectF5 = this.mInnerClipTempRectForBorderRadius;
            float f14 = rectF5.left;
            pointF.x = f14;
            float f15 = rectF5.top;
            pointF.y = f15;
            RectF rectF6 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f14, f15, (innerBorderRadius * 2.0f) + f14, (innerBorderRadius2 * 2.0f) + f15, rectF6.left, rectF6.top, f14, f15, pointF);
            if (this.mInnerBottomLeftCorner == null) {
                this.mInnerBottomLeftCorner = new PointF();
            }
            PointF pointF2 = this.mInnerBottomLeftCorner;
            RectF rectF7 = this.mInnerClipTempRectForBorderRadius;
            float f16 = rectF7.left;
            pointF2.x = f16;
            float f17 = rectF7.bottom;
            pointF2.y = f17;
            RectF rectF8 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f16, f17 - (innerBorderRadius8 * 2.0f), (innerBorderRadius7 * 2.0f) + f16, f17, rectF8.left, rectF8.bottom, f16, f17, pointF2);
            if (this.mInnerTopRightCorner == null) {
                this.mInnerTopRightCorner = new PointF();
            }
            PointF pointF3 = this.mInnerTopRightCorner;
            RectF rectF9 = this.mInnerClipTempRectForBorderRadius;
            float f18 = rectF9.right;
            pointF3.x = f18;
            float f19 = rectF9.top;
            pointF3.y = f19;
            RectF rectF10 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f18 - (innerBorderRadius3 * 2.0f), f19, f18, (innerBorderRadius4 * 2.0f) + f19, rectF10.right, rectF10.top, f18, f19, pointF3);
            if (this.mInnerBottomRightCorner == null) {
                this.mInnerBottomRightCorner = new PointF();
            }
            PointF pointF4 = this.mInnerBottomRightCorner;
            RectF rectF11 = this.mInnerClipTempRectForBorderRadius;
            float f21 = rectF11.right;
            pointF4.x = f21;
            float f22 = rectF11.bottom;
            pointF4.y = f22;
            RectF rectF12 = this.mOuterClipTempRectForBorderRadius;
            getEllipseIntersectionWithLine(f21 - (innerBorderRadius5 * 2.0f), f22 - (innerBorderRadius6 * 2.0f), f21, f22, rectF12.right, rectF12.bottom, f21, f22, pointF4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public RectF getBorderBoxRect() {
        return new RectF(getBounds());
    }

    public int getBorderColor(int i11) {
        Spacing spacing = this.mBorderRGB;
        float f11 = spacing != null ? spacing.get(i11) : 0.0f;
        Spacing spacing2 = this.mBorderAlpha;
        return colorFromAlphaAndRGBComponents(spacing2 != null ? spacing2.get(i11) : 255.0f, f11);
    }

    public BorderRadiusStyle getBorderRadius() {
        return this.mBorderRadius;
    }

    @Nullable
    public BorderStyle getBorderStyle() {
        return this.mBorderStyle;
    }

    @Nullable
    public Float getBorderWidth(int i11) {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null) {
            return null;
        }
        float raw = spacing.getRaw(i11);
        if (Float.isNaN(raw)) {
            return null;
        }
        return Float.valueOf(raw);
    }

    @VisibleForTesting
    public int getColor() {
        return this.mColor;
    }

    public float getFullBorderWidth() {
        Spacing spacing = this.mBorderWidth;
        if (spacing == null || Float.isNaN(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.mBorderWidth.getRaw(8);
    }

    @Override // android.graphics.drawable.Drawable
    @SuppressLint({"WrongConstant"})
    public int getLayoutDirection() {
        int i11 = this.mLayoutDirectionOverride;
        return i11 == -1 ? super.getLayoutDirection() : i11;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        int iAlpha = (Color.alpha(this.mColor) * this.mAlpha) >> 8;
        if (iAlpha != 0) {
            return iAlpha != 255 ? -3 : -1;
        }
        return -2;
    }

    public boolean hasRoundedBorders() {
        return this.mBorderRadius.hasRoundedBorders();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.mAlpha) {
            this.mAlpha = i11;
            invalidateSelf();
        }
    }

    public void setBackgroundImage(@Nullable List<BackgroundImageLayer> list) {
        this.mBackgroundImageLayers = list;
        invalidateSelf();
    }

    public void setBorderColor(int i11, @Nullable Integer num) {
        float fIntValue = num == null ? Float.NaN : num.intValue() & 16777215;
        float fIntValue2 = num != null ? num.intValue() >>> 24 : Float.NaN;
        setBorderRGB(i11, fIntValue);
        setBorderAlpha(i11, fIntValue2);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderWidth(int i11, float f11) {
        if (this.mBorderWidth == null) {
            this.mBorderWidth = new Spacing();
        }
        if (FloatUtil.floatsEqual(this.mBorderWidth.getRaw(i11), f11)) {
            return;
        }
        this.mBorderWidth.set(i11, f11);
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) {
            this.mNeedUpdatePathForBorderRadius = true;
        }
        invalidateSelf();
    }

    public void setColor(int i11) {
        this.mColor = i11;
        invalidateSelf();
    }

    @Deprecated
    public void setLayoutDirectionOverride(int i11) {
        if (this.mLayoutDirectionOverride != i11) {
            this.mLayoutDirectionOverride = i11;
        }
    }

    public CSSBackgroundDrawable(Context context) {
        this.mContext = context;
    }

    private static int colorFromAlphaAndRGBComponents(float f11, float f12) {
        return ((((int) f11) << 24) & (-16777216)) | (((int) f12) & 16777215);
    }

    private void updatePathEffect(int i11) {
        BorderStyle borderStyle = this.mBorderStyle;
        this.mPaint.setPathEffect(borderStyle != null ? getPathEffect(borderStyle, i11) : null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        updatePathEffect();
        if (!hasRoundedBorders()) {
            drawRectangularBackgroundWithBorders(canvas);
        } else {
            drawRoundedBackgroundWithBorders(canvas);
        }
    }

    @Nullable
    public Path getBorderBoxPath() {
        if (hasRoundedBorders()) {
            updatePath();
            return new Path((Path) Preconditions.checkNotNull(this.mOuterClipPathForBorderRadius));
        }
        return null;
    }

    public float getBorderWidthOrDefaultTo(float f11, int i11) {
        Float borderWidth = getBorderWidth(i11);
        if (borderWidth == null) {
            return f11;
        }
        return borderWidth.floatValue();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (hasRoundedBorders()) {
            updatePath();
            outline.setConvexPath((Path) Preconditions.checkNotNull(this.mPathForBorderRadiusOutline));
        } else {
            outline.setRect(getBounds());
        }
    }

    @Nullable
    public Path getPaddingBoxPath() {
        if (hasRoundedBorders()) {
            updatePath();
            return new Path((Path) Preconditions.checkNotNull(this.mInnerClipPathForBorderRadius));
        }
        return null;
    }

    public RectF getPaddingBoxRect() {
        RectF directionAwareBorderInsets = getDirectionAwareBorderInsets();
        if (directionAwareBorderInsets == null) {
            return new RectF(0.0f, 0.0f, getBounds().width(), getBounds().height());
        }
        return new RectF(directionAwareBorderInsets.left, directionAwareBorderInsets.top, getBounds().width() - directionAwareBorderInsets.right, getBounds().height() - directionAwareBorderInsets.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mNeedUpdatePathForBorderRadius = true;
    }

    public void setBorderStyle(@Nullable BorderStyle borderStyle) {
        if (this.mBorderStyle != borderStyle) {
            this.mBorderStyle = borderStyle;
            this.mNeedUpdatePathForBorderRadius = true;
            invalidateSelf();
        }
    }

    public void setBorderRadius(BorderRadiusStyle borderRadiusStyle) {
        this.mBorderRadius = borderRadiusStyle;
    }

    @Deprecated(forRemoval = true, since = "0.75.0")
    public void setRadius(float f11, int i11) {
        Float fValueOf = Float.isNaN(f11) ? null : Float.valueOf(f11);
        if (fValueOf == null) {
            this.mBorderRadius.set(BorderRadiusProp.values()[i11], null);
            invalidateSelf();
        } else {
            setBorderRadius(BorderRadiusProp.values()[i11], new LengthPercentage(fValueOf.floatValue(), LengthPercentageType.POINT));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
