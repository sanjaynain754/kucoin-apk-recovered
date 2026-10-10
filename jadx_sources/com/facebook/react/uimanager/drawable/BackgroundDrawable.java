package com.facebook.react.uimanager.drawable;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.math.MathKt;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BackgroundDrawable.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020.2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u00020.2\u0006\u00103\u001a\u00020\u001bH\u0016J\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\u001bH\u0017J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020\u0015H\u0002J\n\u0010<\u001a\u0004\u0018\u00010=H\u0002J!\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010\u00132\b\u0010@\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0002\u0010AJ\b\u0010B\u001a\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R4\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "borderRadius", "Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "borderInsets", "Lcom/facebook/react/uimanager/style/BorderInsets;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/uimanager/style/BorderRadiusStyle;Lcom/facebook/react/uimanager/style/BorderInsets;)V", "getBorderRadius", "()Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", "setBorderRadius", "(Lcom/facebook/react/uimanager/style/BorderRadiusStyle;)V", "getBorderInsets", "()Lcom/facebook/react/uimanager/style/BorderInsets;", "setBorderInsets", "(Lcom/facebook/react/uimanager/style/BorderInsets;)V", "gapBetweenPaths", "", "computedBorderInsets", "Landroid/graphics/RectF;", "computedBorderRadius", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "needUpdatePath", "", "value", "", "backgroundColor", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "paddingBoxRect", "paddingBoxRenderPath", "Landroid/graphics/Path;", "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "backgroundImageLayers", "getBackgroundImageLayers", "()Ljava/util/List;", "setBackgroundImageLayers", "(Ljava/util/List;)V", "backgroundPaint", "Landroid/graphics/Paint;", "invalidateSelf", "", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "draw", "canvas", "Landroid/graphics/Canvas;", "computeBorderInsets", "getBackgroundImageShader", "Landroid/graphics/Shader;", "getInnerBorderRadius", "computedRadius", ViewProps.BORDER_WIDTH, "(Ljava/lang/Float;Ljava/lang/Float;)F", "updatePath", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BackgroundDrawable extends Drawable {
    private int backgroundColor;

    @Nullable
    private List<BackgroundImageLayer> backgroundImageLayers;

    @NotNull
    private final Paint backgroundPaint;

    @Nullable
    private BorderInsets borderInsets;

    @Nullable
    private BorderRadiusStyle borderRadius;

    @Nullable
    private RectF computedBorderInsets;

    @Nullable
    private ComputedBorderRadius computedBorderRadius;

    @NotNull
    private final Context context;
    private final float gapBetweenPaths;
    private boolean needUpdatePath;

    @NotNull
    private RectF paddingBoxRect;

    @Nullable
    private Path paddingBoxRenderPath;

    public /* synthetic */ BackgroundDrawable(Context context, BorderRadiusStyle borderRadiusStyle, BorderInsets borderInsets, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : borderRadiusStyle, (i11 & 4) != 0 ? null : borderInsets);
    }

    private final float getInnerBorderRadius(Float computedRadius, Float borderWidth) {
        return RangesKt.coerceAtLeast((computedRadius != null ? computedRadius.floatValue() : 0.0f) - (borderWidth != null ? borderWidth.floatValue() : 0.0f), 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    private final void updatePath() {
        ComputedBorderRadius computedBorderRadiusResolve;
        float f11;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        ComputedBorderRadius computedBorderRadius;
        if (this.needUpdatePath) {
            this.needUpdatePath = false;
            this.computedBorderInsets = computeBorderInsets();
            BorderRadiusStyle borderRadiusStyle = this.borderRadius;
            if (borderRadiusStyle != null) {
                int layoutDirection = getLayoutDirection();
                Context context = this.context;
                PixelUtil pixelUtil = PixelUtil.INSTANCE;
                computedBorderRadiusResolve = borderRadiusStyle.resolve(layoutDirection, context, pixelUtil.pxToDp(getBounds().width()), pixelUtil.pxToDp(getBounds().height()));
            } else {
                computedBorderRadiusResolve = null;
            }
            this.computedBorderRadius = computedBorderRadiusResolve;
            if (computedBorderRadiusResolve != null && computedBorderRadiusResolve.hasRoundedBorders() && (computedBorderRadius = this.computedBorderRadius) != null && !computedBorderRadius.isUniform()) {
                Path path = this.paddingBoxRenderPath;
                if (path == null) {
                    path = new Path();
                }
                this.paddingBoxRenderPath = path;
                path.reset();
            }
            RectF rectF = this.computedBorderInsets;
            if (rectF == null) {
                f11 = 0.0f;
            } else {
                if (Intrinsics.areEqual(rectF != null ? Float.valueOf(rectF.left) : null, 0.0f)) {
                    RectF rectF2 = this.computedBorderInsets;
                    if (Intrinsics.areEqual(rectF2 != null ? Float.valueOf(rectF2.top) : null, 0.0f)) {
                        RectF rectF3 = this.computedBorderInsets;
                        if (Intrinsics.areEqual(rectF3 != null ? Float.valueOf(rectF3.right) : null, 0.0f)) {
                            RectF rectF4 = this.computedBorderInsets;
                            if (Intrinsics.areEqual(rectF4 != null ? Float.valueOf(rectF4.bottom) : null, 0.0f)) {
                                f11 = 0.0f;
                            }
                        }
                    }
                }
                f11 = this.gapBetweenPaths;
            }
            RectF rectF5 = this.paddingBoxRect;
            float f12 = getBounds().left;
            RectF rectF6 = this.computedBorderInsets;
            rectF5.left = (f12 + (rectF6 != null ? rectF6.left : 0.0f)) - f11;
            RectF rectF7 = this.paddingBoxRect;
            float f13 = getBounds().top;
            RectF rectF8 = this.computedBorderInsets;
            rectF7.top = (f13 + (rectF8 != null ? rectF8.top : 0.0f)) - f11;
            RectF rectF9 = this.paddingBoxRect;
            float f14 = getBounds().right;
            RectF rectF10 = this.computedBorderInsets;
            rectF9.right = (f14 - (rectF10 != null ? rectF10.right : 0.0f)) + f11;
            RectF rectF11 = this.paddingBoxRect;
            float f15 = getBounds().bottom;
            RectF rectF12 = this.computedBorderInsets;
            rectF11.bottom = (f15 - (rectF12 != null ? rectF12.bottom : 0.0f)) + f11;
            BorderRadiusStyle borderRadiusStyle2 = this.borderRadius;
            if (borderRadiusStyle2 == null || !borderRadiusStyle2.hasRoundedBorders()) {
                return;
            }
            ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
            if (computedBorderRadius2 == null || !computedBorderRadius2.isUniform()) {
                ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                Float fValueOf = (computedBorderRadius3 == null || (topLeft2 = computedBorderRadius3.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal()));
                RectF rectF13 = this.computedBorderInsets;
                float innerBorderRadius = getInnerBorderRadius(fValueOf, rectF13 != null ? Float.valueOf(rectF13.left) : null);
                ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
                Float fValueOf2 = (computedBorderRadius4 == null || (topLeft = computedBorderRadius4.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft.getVertical()));
                RectF rectF14 = this.computedBorderInsets;
                float innerBorderRadius2 = getInnerBorderRadius(fValueOf2, rectF14 != null ? Float.valueOf(rectF14.top) : null);
                ComputedBorderRadius computedBorderRadius5 = this.computedBorderRadius;
                Float fValueOf3 = (computedBorderRadius5 == null || (topRight2 = computedBorderRadius5.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal()));
                RectF rectF15 = this.computedBorderInsets;
                float innerBorderRadius3 = getInnerBorderRadius(fValueOf3, rectF15 != null ? Float.valueOf(rectF15.right) : null);
                ComputedBorderRadius computedBorderRadius6 = this.computedBorderRadius;
                Float fValueOf4 = (computedBorderRadius6 == null || (topRight = computedBorderRadius6.getTopRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight.getVertical()));
                RectF rectF16 = this.computedBorderInsets;
                float innerBorderRadius4 = getInnerBorderRadius(fValueOf4, rectF16 != null ? Float.valueOf(rectF16.top) : null);
                ComputedBorderRadius computedBorderRadius7 = this.computedBorderRadius;
                Float fValueOf5 = (computedBorderRadius7 == null || (bottomRight2 = computedBorderRadius7.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal()));
                RectF rectF17 = this.computedBorderInsets;
                float innerBorderRadius5 = getInnerBorderRadius(fValueOf5, rectF17 != null ? Float.valueOf(rectF17.right) : null);
                ComputedBorderRadius computedBorderRadius8 = this.computedBorderRadius;
                Float fValueOf6 = (computedBorderRadius8 == null || (bottomRight = computedBorderRadius8.getBottomRight()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical()));
                RectF rectF18 = this.computedBorderInsets;
                float innerBorderRadius6 = getInnerBorderRadius(fValueOf6, rectF18 != null ? Float.valueOf(rectF18.bottom) : null);
                ComputedBorderRadius computedBorderRadius9 = this.computedBorderRadius;
                Float fValueOf7 = (computedBorderRadius9 == null || (bottomLeft2 = computedBorderRadius9.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal()));
                RectF rectF19 = this.computedBorderInsets;
                float innerBorderRadius7 = getInnerBorderRadius(fValueOf7, rectF19 != null ? Float.valueOf(rectF19.left) : null);
                ComputedBorderRadius computedBorderRadius10 = this.computedBorderRadius;
                Float fValueOf8 = (computedBorderRadius10 == null || (bottomLeft = computedBorderRadius10.getBottomLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical()));
                RectF rectF20 = this.computedBorderInsets;
                float innerBorderRadius8 = getInnerBorderRadius(fValueOf8, rectF20 != null ? Float.valueOf(rectF20.bottom) : null);
                Path path2 = this.paddingBoxRenderPath;
                if (path2 != null) {
                    path2.addRoundRect(this.paddingBoxRect, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, innerBorderRadius8}, Path.Direction.CW);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.needUpdatePath = true;
        super.invalidateSelf();
    }

    public BackgroundDrawable(@NotNull Context context, @Nullable BorderRadiusStyle borderRadiusStyle, @Nullable BorderInsets borderInsets) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.borderRadius = borderRadiusStyle;
        this.borderInsets = borderInsets;
        this.gapBetweenPaths = 0.8f;
        this.needUpdatePath = true;
        this.paddingBoxRect = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.backgroundColor);
        this.backgroundPaint = paint;
    }

    private final RectF computeBorderInsets() {
        float fDpToPx;
        float fDpToPx2;
        float fDpToPx3;
        BorderInsets borderInsets = this.borderInsets;
        RectF rectFResolve = borderInsets != null ? borderInsets.resolve(getLayoutDirection(), this.context) : null;
        float fDpToPx4 = 0.0f;
        if (rectFResolve != null) {
            fDpToPx = PixelUtil.INSTANCE.dpToPx(rectFResolve.left);
        } else {
            fDpToPx = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx2 = PixelUtil.INSTANCE.dpToPx(rectFResolve.top);
        } else {
            fDpToPx2 = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx3 = PixelUtil.INSTANCE.dpToPx(rectFResolve.right);
        } else {
            fDpToPx3 = 0.0f;
        }
        if (rectFResolve != null) {
            fDpToPx4 = PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom);
        }
        return new RectF(fDpToPx, fDpToPx2, fDpToPx3, fDpToPx4);
    }

    private final Shader getBackgroundImageShader() {
        List<BackgroundImageLayer> list = this.backgroundImageLayers;
        Shader composeShader = null;
        if (list != null) {
            for (BackgroundImageLayer backgroundImageLayer : list) {
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                Shader shader = backgroundImageLayer.getShader(bounds);
                if (shader != null) {
                    composeShader = composeShader == null ? shader : new ComposeShader(shader, composeShader, PorterDuff.Mode.SRC_OVER);
                }
            }
        }
        return composeShader;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        float innerBorderRadius;
        float innerBorderRadius2;
        BorderRadiusStyle borderRadiusStyle;
        BorderRadiusStyle borderRadiusStyle2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        updatePath();
        canvas.save();
        if (this.backgroundPaint.getAlpha() == 0) {
            innerBorderRadius = 0.0f;
            innerBorderRadius2 = 0.0f;
        } else {
            ComputedBorderRadius computedBorderRadius = this.computedBorderRadius;
            if (computedBorderRadius == null || !computedBorderRadius.isUniform() || (borderRadiusStyle2 = this.borderRadius) == null || !borderRadiusStyle2.hasRoundedBorders()) {
                BorderRadiusStyle borderRadiusStyle3 = this.borderRadius;
                if (borderRadiusStyle3 == null || !borderRadiusStyle3.hasRoundedBorders()) {
                    canvas.drawRect(getBounds(), this.backgroundPaint);
                } else {
                    Path path = this.paddingBoxRenderPath;
                    if (path == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path, this.backgroundPaint);
                }
                innerBorderRadius = 0.0f;
                innerBorderRadius2 = 0.0f;
            } else {
                ComputedBorderRadius computedBorderRadius2 = this.computedBorderRadius;
                Float fValueOf = (computedBorderRadius2 == null || (topLeft2 = computedBorderRadius2.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal()));
                RectF rectF = this.computedBorderInsets;
                innerBorderRadius = getInnerBorderRadius(fValueOf, rectF != null ? Float.valueOf(rectF.left) : null);
                ComputedBorderRadius computedBorderRadius3 = this.computedBorderRadius;
                Float fValueOf2 = (computedBorderRadius3 == null || (topLeft = computedBorderRadius3.getTopLeft()) == null) ? null : Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft.getVertical()));
                RectF rectF2 = this.computedBorderInsets;
                innerBorderRadius2 = getInnerBorderRadius(fValueOf2, rectF2 != null ? Float.valueOf(rectF2.top) : null);
                canvas.drawRoundRect(this.paddingBoxRect, innerBorderRadius, innerBorderRadius2, this.backgroundPaint);
            }
        }
        List<BackgroundImageLayer> list = this.backgroundImageLayers;
        if (list != null && list != null && (!list.isEmpty())) {
            this.backgroundPaint.setShader(getBackgroundImageShader());
            ComputedBorderRadius computedBorderRadius4 = this.computedBorderRadius;
            if (computedBorderRadius4 == null || !computedBorderRadius4.isUniform() || (borderRadiusStyle = this.borderRadius) == null || !borderRadiusStyle.hasRoundedBorders()) {
                BorderRadiusStyle borderRadiusStyle4 = this.borderRadius;
                if (borderRadiusStyle4 == null || !borderRadiusStyle4.hasRoundedBorders()) {
                    canvas.drawRect(this.paddingBoxRect, this.backgroundPaint);
                } else {
                    Path path2 = this.paddingBoxRenderPath;
                    if (path2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.drawPath(path2, this.backgroundPaint);
                }
            } else {
                canvas.drawRoundRect(this.paddingBoxRect, innerBorderRadius, innerBorderRadius2, this.backgroundPaint);
            }
            this.backgroundPaint.setShader(null);
        }
        canvas.restore();
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final List<BackgroundImageLayer> getBackgroundImageLayers() {
        return this.backgroundImageLayers;
    }

    @Nullable
    public final BorderInsets getBorderInsets() {
        return this.borderInsets;
    }

    @Nullable
    public final BorderRadiusStyle getBorderRadius() {
        return this.borderRadius;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        int alpha = this.backgroundPaint.getAlpha();
        if (alpha == 255) {
            return -1;
        }
        return (1 > alpha || alpha >= 255) ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.needUpdatePath = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(MathKt.roundToInt((alpha / 255.0f) * (Color.alpha(this.backgroundColor) / 255.0f) * 255.0f));
        invalidateSelf();
    }

    public final void setBackgroundColor(int i11) {
        if (this.backgroundColor != i11) {
            this.backgroundColor = i11;
            this.backgroundPaint.setColor(i11);
            invalidateSelf();
        }
    }

    public final void setBackgroundImageLayers(@Nullable List<BackgroundImageLayer> list) {
        if (Intrinsics.areEqual(this.backgroundImageLayers, list)) {
            return;
        }
        this.backgroundImageLayers = list;
        invalidateSelf();
    }

    public final void setBorderInsets(@Nullable BorderInsets borderInsets) {
        this.borderInsets = borderInsets;
    }

    public final void setBorderRadius(@Nullable BorderRadiusStyle borderRadiusStyle) {
        this.borderRadius = borderRadiusStyle;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
