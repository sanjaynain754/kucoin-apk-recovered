package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.drawable.BackgroundDrawable;
import com.facebook.react.uimanager.drawable.BorderDrawable;
import com.facebook.react.uimanager.drawable.CSSBackgroundDrawable;
import com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable;
import com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable;
import com.facebook.react.uimanager.drawable.OutlineDrawable;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawable;
import com.facebook.react.uimanager.style.BackgroundImageLayer;
import com.facebook.react.uimanager.style.BorderInsets;
import com.facebook.react.uimanager.style.BorderRadiusProp;
import com.facebook.react.uimanager.style.BorderRadiusStyle;
import com.facebook.react.uimanager.style.BorderStyle;
import com.facebook.react.uimanager.style.BoxShadow;
import com.facebook.react.uimanager.style.ComputedBorderRadius;
import com.facebook.react.uimanager.style.CornerRadii;
import com.facebook.react.uimanager.style.LogicalEdge;
import com.facebook.react.uimanager.style.OutlineStyle;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BackgroundStyleApplicator.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0007J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010J'\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0018J)\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\u001a\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0007J\u001a\u0010#\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010%H\u0007J\u0012\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J!\u0010'\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\nJ\u0017\u0010)\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0010J\u0018\u0010*\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0015H\u0007J\u0015\u0010,\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010-J\u001a\u0010.\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010/\u001a\u0004\u0018\u000100H\u0007J\u0010\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u00102\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0015\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010-J\u001e\u00104\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\rH\u0007J\u001a\u00104\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u00105\u001a\u0004\u0018\u000107H\u0007J\u001a\u00108\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010:H\u0007J\u0018\u0010;\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010<\u001a\u00020=H\u0007J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010?\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010D\u001a\u00020E2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010F\u001a\u0004\u0018\u00010C2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010G\u001a\u0004\u0018\u00010E2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010J\u001a\u00020I2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010K\u001a\u00020L2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J!\u0010N\u001a\u00020\u00152\b\u0010O\u001a\u0004\u0018\u00010\u00152\b\u0010P\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010QJ*\u0010R\u001a\u00020S2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010T\u001a\u00020@2\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010VH\u0002¨\u0006X"}, m90084d2 = {"Lcom/facebook/react/uimanager/BackgroundStyleApplicator;", "", "<init>", "()V", "setBackgroundColor", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "color", "", "(Landroid/view/View;Ljava/lang/Integer;)V", "setBackgroundImage", "backgroundImageLayers", "", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "getBackgroundColor", "(Landroid/view/View;)Ljava/lang/Integer;", "setBorderWidth", "edge", "Lcom/facebook/react/uimanager/style/LogicalEdge;", "width", "", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Float;)V", "getBorderWidth", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Float;", "setBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;Ljava/lang/Integer;)V", "getBorderColor", "(Landroid/view/View;Lcom/facebook/react/uimanager/style/LogicalEdge;)Ljava/lang/Integer;", "setBorderRadius", "corner", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "radius", "Lcom/facebook/react/uimanager/LengthPercentage;", "getBorderRadius", "setBorderStyle", "borderStyle", "Lcom/facebook/react/uimanager/style/BorderStyle;", "getBorderStyle", "setOutlineColor", ViewProps.OUTLINE_COLOR, "getOutlineColor", "setOutlineOffset", ViewProps.OUTLINE_OFFSET, "getOutlineOffset", "(Landroid/view/View;)Ljava/lang/Float;", "setOutlineStyle", ViewProps.OUTLINE_STYLE, "Lcom/facebook/react/uimanager/style/OutlineStyle;", "getOutlineStyle", "setOutlineWidth", "getOutlineWidth", "setBoxShadow", "shadows", "Lcom/facebook/react/uimanager/style/BoxShadow;", "Lcom/facebook/react/bridge/ReadableArray;", "setFeedbackUnderlay", "drawable", "Landroid/graphics/drawable/Drawable;", "clipToPaddingBox", "canvas", "Landroid/graphics/Canvas;", "reset", "ensureCompositeBackgroundDrawable", "Lcom/facebook/react/uimanager/drawable/CompositeBackgroundDrawable;", "getCompositeBackgroundDrawable", "ensureCSSBackground", "Lcom/facebook/react/uimanager/drawable/CSSBackgroundDrawable;", "ensureBackgroundDrawable", "Lcom/facebook/react/uimanager/drawable/BackgroundDrawable;", "getCSSBackground", "getBackground", "getBorder", "Lcom/facebook/react/uimanager/drawable/BorderDrawable;", "ensureBorderDrawable", "ensureOutlineDrawable", "Lcom/facebook/react/uimanager/drawable/OutlineDrawable;", "getOutlineDrawable", "getInnerBorderRadius", "computedRadius", ViewProps.BORDER_WIDTH, "(Ljava/lang/Float;Ljava/lang/Float;)F", "createPaddingBoxPath", "Landroid/graphics/Path;", "composite", "paddingBoxRect", "Landroid/graphics/RectF;", "computedBorderInsets", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class BackgroundStyleApplicator {

    @NotNull
    public static final BackgroundStyleApplicator INSTANCE = new BackgroundStyleApplicator();

    private final float getInnerBorderRadius(Float computedRadius, Float borderWidth) {
        return RangesKt.coerceAtLeast((computedRadius != null ? computedRadius.floatValue() : 0.0f) - (borderWidth != null ? borderWidth.floatValue() : 0.0f), 0.0f);
    }

    @JvmStatic
    public static final void setBoxShadow(@NotNull View view, @NotNull List<BoxShadow> shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shadows, "shadows");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = INSTANCE.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        LayerDrawable layerDrawable = null;
        LayerDrawable layerDrawable2 = null;
        for (BoxShadow boxShadow : CollectionsKt.asReversed(shadows)) {
            float offsetX = boxShadow.getOffsetX();
            float offsetY = boxShadow.getOffsetY();
            Integer color = boxShadow.getColor();
            int iIntValue = color != null ? color.intValue() : ViewCompat.MEASURED_STATE_MASK;
            Float blurRadius = boxShadow.getBlurRadius();
            float fFloatValue = blurRadius != null ? blurRadius.floatValue() : 0.0f;
            Float spreadDistance = boxShadow.getSpreadDistance();
            float fFloatValue2 = spreadDistance != null ? spreadDistance.floatValue() : 0.0f;
            Boolean inset = boxShadow.getInset();
            boolean zBooleanValue = inset != null ? inset.booleanValue() : false;
            if (zBooleanValue && Build.VERSION.SDK_INT >= 29) {
                if (layerDrawable == null) {
                    layerDrawable = new LayerDrawable(new Drawable[0]);
                }
                LayerDrawable layerDrawable3 = layerDrawable;
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                layerDrawable3.addLayer(new InsetBoxShadowDrawable(context, iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2, borderInsets, borderRadius));
                layerDrawable = layerDrawable3;
            } else if (!zBooleanValue && Build.VERSION.SDK_INT >= 28) {
                LayerDrawable layerDrawable4 = layerDrawable2 == null ? new LayerDrawable(new Drawable[0]) : layerDrawable2;
                Context context2 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                layerDrawable4.addLayer(new OutsetBoxShadowDrawable(context2, iIntValue, offsetX, offsetY, fFloatValue, fFloatValue2, borderRadius));
                layerDrawable2 = layerDrawable4;
            }
        }
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        view.setBackground(backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view).withNewOuterShadow(layerDrawable2));
        view.setBackground(backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view).withNewInnerShadow(layerDrawable));
    }

    @JvmStatic
    public static final void setBorderRadius(@NotNull View view, @NotNull BorderRadiusProp corner, @Nullable LengthPercentage radius) {
        LayerDrawable innerShadows;
        LayerDrawable outerShadows;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius == null) {
            borderRadius = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderRadius(borderRadius);
        BorderRadiusStyle borderRadius2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
        if (borderRadius2 != null) {
            borderRadius2.set(corner, radius);
        }
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            if (view instanceof ImageView) {
                backgroundStyleApplicator.ensureBackgroundDrawable(view);
            }
            BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
            if (background != null) {
                background.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
            }
            BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
            if (border != null) {
                border.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
            }
            BackgroundDrawable background2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
            if (background2 != null) {
                background2.invalidateSelf();
            }
            BorderDrawable border2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
            if (border2 != null) {
                border2.invalidateSelf();
            }
        } else {
            backgroundStyleApplicator.ensureCSSBackground(view).setBorderRadius(corner, radius);
        }
        if (Build.VERSION.SDK_INT >= 28 && (outerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOuterShadows()) != null) {
            int numberOfLayers = outerShadows.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                Drawable drawable = outerShadows.getDrawable(i11);
                if (drawable instanceof OutsetBoxShadowDrawable) {
                    OutsetBoxShadowDrawable outsetBoxShadowDrawable = (OutsetBoxShadowDrawable) drawable;
                    BorderRadiusStyle borderRadius3 = outsetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius3 == null) {
                        borderRadius3 = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    outsetBoxShadowDrawable.setBorderRadius(borderRadius3);
                    BorderRadiusStyle borderRadius4 = outsetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius4 != null) {
                        borderRadius4.set(corner, radius);
                    }
                    outsetBoxShadowDrawable.invalidateSelf();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && (innerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows()) != null) {
            int numberOfLayers2 = innerShadows.getNumberOfLayers();
            for (int i12 = 0; i12 < numberOfLayers2; i12++) {
                Drawable drawable2 = innerShadows.getDrawable(i12);
                if (drawable2 instanceof InsetBoxShadowDrawable) {
                    InsetBoxShadowDrawable insetBoxShadowDrawable = (InsetBoxShadowDrawable) drawable2;
                    BorderRadiusStyle borderRadius5 = insetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius5 == null) {
                        borderRadius5 = new BorderRadiusStyle(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
                    }
                    insetBoxShadowDrawable.setBorderRadius(borderRadius5);
                    BorderRadiusStyle borderRadius6 = insetBoxShadowDrawable.getBorderRadius();
                    if (borderRadius6 != null) {
                        borderRadius6.set(corner, radius);
                    }
                    insetBoxShadowDrawable.invalidateSelf();
                }
            }
        }
        OutlineDrawable outline = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOutline();
        if (outline != null) {
            outline.setBorderRadius(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius());
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.invalidateSelf();
    }

    private BackgroundStyleApplicator() {
    }

    @JvmStatic
    public static final void clipToPaddingBox(@NotNull View view, @NotNull Canvas canvas) {
        RectF rectFResolve;
        float fDpToPx;
        float fDpToPx2;
        float fDpToPx3;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
            CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
            RectF rectF = new RectF();
            BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
            if (borderInsets != null) {
                int layoutDirection = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getLayoutDirection();
                Context context = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                rectFResolve = borderInsets.resolve(layoutDirection, context);
            } else {
                rectFResolve = null;
            }
            float f11 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBounds().left;
            float fDpToPx4 = 0.0f;
            if (rectFResolve != null) {
                fDpToPx = PixelUtil.INSTANCE.dpToPx(rectFResolve.left);
            } else {
                fDpToPx = 0.0f;
            }
            rectF.left = f11 + fDpToPx;
            float f12 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBounds().top;
            if (rectFResolve != null) {
                fDpToPx2 = PixelUtil.INSTANCE.dpToPx(rectFResolve.top);
            } else {
                fDpToPx2 = 0.0f;
            }
            rectF.top = f12 + fDpToPx2;
            float f13 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBounds().right;
            if (rectFResolve != null) {
                fDpToPx3 = PixelUtil.INSTANCE.dpToPx(rectFResolve.right);
            } else {
                fDpToPx3 = 0.0f;
            }
            rectF.right = f13 - fDpToPx3;
            float f14 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBounds().bottom;
            if (rectFResolve != null) {
                fDpToPx4 = PixelUtil.INSTANCE.dpToPx(rectFResolve.bottom);
            }
            rectF.bottom = f14 - fDpToPx4;
            BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
            if (borderRadius != null && borderRadius.hasRoundedBorders()) {
                Path pathCreatePaddingBoxPath = backgroundStyleApplicator.createPaddingBoxPath(view, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable, rectF, rectFResolve);
                pathCreatePaddingBoxPath.offset(rect.left, rect.top);
                canvas.clipPath(pathCreatePaddingBoxPath);
                return;
            } else {
                rectF.offset(rect.left, rect.top);
                canvas.clipRect(rectF);
                return;
            }
        }
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null) {
            canvas.clipRect(rect2);
            return;
        }
        Path paddingBoxPath = cSSBackground.getPaddingBoxPath();
        if (paddingBoxPath != null) {
            paddingBoxPath.offset(rect2.left, rect2.top);
            canvas.clipPath(paddingBoxPath);
        } else {
            RectF paddingBoxRect = cSSBackground.getPaddingBoxRect();
            Intrinsics.checkNotNullExpressionValue(paddingBoxRect, "getPaddingBoxRect(...)");
            paddingBoxRect.offset(rect2.left, rect2.top);
            canvas.clipRect(paddingBoxRect);
        }
    }

    private final Path createPaddingBoxPath(View view, CompositeBackgroundDrawable composite, RectF paddingBoxRect, RectF computedBorderInsets) {
        ComputedBorderRadius computedBorderRadiusResolve;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        Float fValueOf5;
        Float fValueOf6;
        Float fValueOf7;
        Float fValueOf8;
        Float fValueOf9;
        Float fValueOf10;
        Float fValueOf11;
        Float fValueOf12;
        Float fValueOf13;
        Float fValueOf14;
        Float fValueOf15;
        CornerRadii bottomLeft;
        CornerRadii bottomLeft2;
        CornerRadii bottomRight;
        CornerRadii bottomRight2;
        CornerRadii topRight;
        CornerRadii topRight2;
        CornerRadii topLeft;
        CornerRadii topLeft2;
        BorderRadiusStyle borderRadius = composite.getBorderRadius();
        Float fValueOf16 = null;
        if (borderRadius != null) {
            int layoutDirection = composite.getLayoutDirection();
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            computedBorderRadiusResolve = borderRadius.resolve(layoutDirection, context, PixelUtil.toDIPFromPixel(composite.getBounds().width()), PixelUtil.toDIPFromPixel(composite.getBounds().height()));
        } else {
            computedBorderRadiusResolve = null;
        }
        Path path = new Path();
        if (computedBorderRadiusResolve != null && (topLeft2 = computedBorderRadiusResolve.getTopLeft()) != null) {
            fValueOf = Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft2.getHorizontal()));
        } else {
            fValueOf = null;
        }
        if (computedBorderInsets != null) {
            fValueOf2 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left));
        } else {
            fValueOf2 = null;
        }
        float innerBorderRadius = getInnerBorderRadius(fValueOf, fValueOf2);
        if (computedBorderRadiusResolve != null && (topLeft = computedBorderRadiusResolve.getTopLeft()) != null) {
            fValueOf3 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(topLeft.getVertical()));
        } else {
            fValueOf3 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf4 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top));
        } else {
            fValueOf4 = null;
        }
        float innerBorderRadius2 = getInnerBorderRadius(fValueOf3, fValueOf4);
        if (computedBorderRadiusResolve != null && (topRight2 = computedBorderRadiusResolve.getTopRight()) != null) {
            fValueOf5 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight2.getHorizontal()));
        } else {
            fValueOf5 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf6 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right));
        } else {
            fValueOf6 = null;
        }
        float innerBorderRadius3 = getInnerBorderRadius(fValueOf5, fValueOf6);
        if (computedBorderRadiusResolve != null && (topRight = computedBorderRadiusResolve.getTopRight()) != null) {
            fValueOf7 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(topRight.getVertical()));
        } else {
            fValueOf7 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf8 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.top));
        } else {
            fValueOf8 = null;
        }
        float innerBorderRadius4 = getInnerBorderRadius(fValueOf7, fValueOf8);
        if (computedBorderRadiusResolve != null && (bottomRight2 = computedBorderRadiusResolve.getBottomRight()) != null) {
            fValueOf9 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight2.getHorizontal()));
        } else {
            fValueOf9 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf10 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.right));
        } else {
            fValueOf10 = null;
        }
        float innerBorderRadius5 = getInnerBorderRadius(fValueOf9, fValueOf10);
        if (computedBorderRadiusResolve != null && (bottomRight = computedBorderRadiusResolve.getBottomRight()) != null) {
            fValueOf11 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomRight.getVertical()));
        } else {
            fValueOf11 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf12 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom));
        } else {
            fValueOf12 = null;
        }
        float innerBorderRadius6 = getInnerBorderRadius(fValueOf11, fValueOf12);
        if (computedBorderRadiusResolve != null && (bottomLeft2 = computedBorderRadiusResolve.getBottomLeft()) != null) {
            fValueOf13 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft2.getHorizontal()));
        } else {
            fValueOf13 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf14 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.left));
        } else {
            fValueOf14 = null;
        }
        float innerBorderRadius7 = getInnerBorderRadius(fValueOf13, fValueOf14);
        if (computedBorderRadiusResolve != null && (bottomLeft = computedBorderRadiusResolve.getBottomLeft()) != null) {
            fValueOf15 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(bottomLeft.getVertical()));
        } else {
            fValueOf15 = null;
        }
        if (computedBorderInsets != null) {
            fValueOf16 = Float.valueOf(PixelUtil.INSTANCE.dpToPx(computedBorderInsets.bottom));
        }
        path.addRoundRect(paddingBoxRect, new float[]{innerBorderRadius, innerBorderRadius2, innerBorderRadius3, innerBorderRadius4, innerBorderRadius5, innerBorderRadius6, innerBorderRadius7, getInnerBorderRadius(fValueOf15, fValueOf16)}, Path.Direction.CW);
        return path;
    }

    private final BackgroundDrawable ensureBackgroundDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
        if (background != null) {
            return background;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BackgroundDrawable backgroundDrawable = new BackgroundDrawable(context, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius(), compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewBackground(backgroundDrawable));
        return backgroundDrawable;
    }

    private final BorderDrawable ensureBorderDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
        if (border == null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BorderRadiusStyle borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
            BorderDrawable borderDrawable = new BorderDrawable(context, new Spacing(0.0f), borderRadius, compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets(), BorderStyle.SOLID);
            view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewBorder(borderDrawable));
            return borderDrawable;
        }
        return border;
    }

    private final CSSBackgroundDrawable ensureCSSBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        CSSBackgroundDrawable cssBackground = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getCssBackground();
        if (cssBackground != null) {
            return cssBackground;
        }
        CSSBackgroundDrawable cSSBackgroundDrawable = new CSSBackgroundDrawable(view.getContext());
        view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewCssBackground(cSSBackgroundDrawable));
        return cSSBackgroundDrawable;
    }

    private final CompositeBackgroundDrawable ensureCompositeBackgroundDrawable(View view) {
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            return (CompositeBackgroundDrawable) background;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CompositeBackgroundDrawable compositeBackgroundDrawable = new CompositeBackgroundDrawable(context, view.getBackground(), null, null, null, null, null, null, null, 508, null);
        view.setBackground(compositeBackgroundDrawable);
        return compositeBackgroundDrawable;
    }

    private final OutlineDrawable ensureOutlineDrawable(View view) {
        BorderRadiusStyle borderRadius;
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = ensureCompositeBackgroundDrawable(view);
        OutlineDrawable outline = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getOutline();
        if (outline == null) {
            if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
                borderRadius = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderRadius();
            } else {
                borderRadius = ensureCSSBackground(view).getBorderRadius();
            }
            BorderRadiusStyle borderRadiusStyle = borderRadius;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            OutlineDrawable outlineDrawable = new OutlineDrawable(context, borderRadiusStyle, ViewCompat.MEASURED_STATE_MASK, 0.0f, OutlineStyle.SOLID, 0.0f);
            view.setBackground(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.withNewOutline(outlineDrawable));
            return outlineDrawable;
        }
        return outline;
    }

    private final BackgroundDrawable getBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBackground();
        }
        return null;
    }

    @JvmStatic
    @ColorInt
    @Nullable
    public static final Integer getBackgroundColor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BackgroundDrawable background = INSTANCE.getBackground(view);
            if (background == null) {
                return null;
            }
            return Integer.valueOf(background.getBackgroundColor());
        }
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null) {
            return null;
        }
        return Integer.valueOf(cSSBackground.getColor());
    }

    private final BorderDrawable getBorder(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getBorder();
        }
        return null;
    }

    @JvmStatic
    @ColorInt
    @Nullable
    public static final Integer getBorderColor(@NotNull View view, @NotNull LogicalEdge edge) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BorderDrawable border = INSTANCE.getBorder(view);
            if (border == null) {
                return null;
            }
            return Integer.valueOf(border.getBorderColor(edge));
        }
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null) {
            return null;
        }
        return Integer.valueOf(cSSBackground.getBorderColor(edge.toSpacingType()));
    }

    @JvmStatic
    @Nullable
    public static final LengthPercentage getBorderRadius(@NotNull View view, @NotNull BorderRadiusProp corner) {
        BorderRadiusStyle borderRadius;
        BorderRadiusStyle borderRadius2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(corner, "corner");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            CompositeBackgroundDrawable compositeBackgroundDrawable = INSTANCE.getCompositeBackgroundDrawable(view);
            if (compositeBackgroundDrawable == null || (borderRadius2 = compositeBackgroundDrawable.getBorderRadius()) == null) {
                return null;
            }
            return borderRadius2.get(corner);
        }
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null || (borderRadius = cSSBackground.getBorderRadius()) == null) {
            return null;
        }
        return borderRadius.get(corner);
    }

    @JvmStatic
    @Nullable
    public static final BorderStyle getBorderStyle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BorderDrawable border = INSTANCE.getBorder(view);
            if (border == null) {
                return null;
            }
            return border.getBorderStyle();
        }
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground == null) {
            return null;
        }
        return cSSBackground.getBorderStyle();
    }

    @JvmStatic
    @Nullable
    public static final Float getBorderWidth(@NotNull View view, @NotNull LogicalEdge edge) {
        Float borderWidth;
        Float fValueOf;
        Spacing borderWidth2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BorderDrawable border = INSTANCE.getBorder(view);
            if (border != null && (borderWidth2 = border.getBorderWidth()) != null) {
                fValueOf = Float.valueOf(borderWidth2.getRaw(edge.toSpacingType()));
            } else {
                fValueOf = null;
            }
            if (fValueOf == null || Float.isNaN(fValueOf.floatValue())) {
                return null;
            }
            return Float.valueOf(PixelUtil.INSTANCE.pxToDp(fValueOf.floatValue()));
        }
        CSSBackgroundDrawable cSSBackground = INSTANCE.getCSSBackground(view);
        if (cSSBackground != null) {
            borderWidth = cSSBackground.getBorderWidth(edge.toSpacingType());
        } else {
            borderWidth = null;
        }
        if (borderWidth == null || Float.isNaN(borderWidth.floatValue())) {
            return null;
        }
        return Float.valueOf(PixelUtil.INSTANCE.pxToDp(borderWidth.floatValue()));
    }

    private final CSSBackgroundDrawable getCSSBackground(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getCssBackground();
        }
        return null;
    }

    private final CompositeBackgroundDrawable getCompositeBackgroundDrawable(View view) {
        Drawable background = view.getBackground();
        if (background instanceof CompositeBackgroundDrawable) {
            return (CompositeBackgroundDrawable) background;
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final Integer getOutlineColor(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = INSTANCE.getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Integer.valueOf(outlineDrawable.getOutlineColor());
        }
        return null;
    }

    private final OutlineDrawable getOutlineDrawable(View view) {
        CompositeBackgroundDrawable compositeBackgroundDrawable = getCompositeBackgroundDrawable(view);
        if (compositeBackgroundDrawable != null) {
            return compositeBackgroundDrawable.getOutline();
        }
        return null;
    }

    @JvmStatic
    public static final void reset(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getBackground() instanceof CompositeBackgroundDrawable) {
            Drawable background = view.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.CompositeBackgroundDrawable");
            view.setBackground(((CompositeBackgroundDrawable) background).getOriginalBackground());
        }
    }

    @JvmStatic
    public static final void setBackgroundColor(@NotNull View view, @ColorInt @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        if ((color == null || color.intValue() == 0) && !(view.getBackground() instanceof CompositeBackgroundDrawable)) {
            return;
        }
        int iIntValue = 0;
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BackgroundDrawable backgroundDrawableEnsureBackgroundDrawable = INSTANCE.ensureBackgroundDrawable(view);
            if (color != null) {
                iIntValue = color.intValue();
            }
            backgroundDrawableEnsureBackgroundDrawable.setBackgroundColor(iIntValue);
            return;
        }
        CSSBackgroundDrawable cSSBackgroundDrawableEnsureCSSBackground = INSTANCE.ensureCSSBackground(view);
        if (color != null) {
            iIntValue = color.intValue();
        }
        cSSBackgroundDrawableEnsureCSSBackground.setColor(iIntValue);
    }

    @JvmStatic
    public static final void setBackgroundImage(@NotNull View view, @Nullable List<BackgroundImageLayer> backgroundImageLayers) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            INSTANCE.ensureBackgroundDrawable(view).setBackgroundImageLayers(backgroundImageLayers);
        } else {
            INSTANCE.ensureCSSBackground(view).setBackgroundImage(backgroundImageLayers);
        }
    }

    @JvmStatic
    public static final void setBorderColor(@NotNull View view, @NotNull LogicalEdge edge, @ColorInt @Nullable Integer color) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            INSTANCE.ensureBorderDrawable(view).setBorderColor(edge, color);
        } else {
            INSTANCE.ensureCSSBackground(view).setBorderColor(edge.toSpacingType(), color);
        }
    }

    @JvmStatic
    public static final void setBorderStyle(@NotNull View view, @Nullable BorderStyle borderStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            INSTANCE.ensureBorderDrawable(view).setBorderStyle(borderStyle);
        } else {
            INSTANCE.ensureCSSBackground(view).setBorderStyle(borderStyle);
        }
    }

    @JvmStatic
    public static final void setBorderWidth(@NotNull View view, @NotNull LogicalEdge edge, @Nullable Float width) {
        LayerDrawable innerShadows;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(edge, "edge");
        BackgroundStyleApplicator backgroundStyleApplicator = INSTANCE;
        CompositeBackgroundDrawable compositeBackgroundDrawableEnsureCompositeBackgroundDrawable = backgroundStyleApplicator.ensureCompositeBackgroundDrawable(view);
        BorderInsets borderInsets = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets == null) {
            borderInsets = new BorderInsets();
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderInsets(borderInsets);
        BorderInsets borderInsets2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets2 != null) {
            borderInsets2.setBorderWidth(edge, width);
        }
        float fDpToPx = Float.NaN;
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            BorderDrawable borderDrawableEnsureBorderDrawable = backgroundStyleApplicator.ensureBorderDrawable(view);
            int spacingType = edge.toSpacingType();
            if (width != null) {
                fDpToPx = PixelUtil.INSTANCE.dpToPx(width.floatValue());
            }
            borderDrawableEnsureBorderDrawable.setBorderWidth(spacingType, fDpToPx);
            BackgroundDrawable background = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
            if (background != null) {
                background.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
            }
            BorderDrawable border = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
            if (border != null) {
                border.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
            }
            BackgroundDrawable background2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBackground();
            if (background2 != null) {
                background2.invalidateSelf();
            }
            BorderDrawable border2 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorder();
            if (border2 != null) {
                border2.invalidateSelf();
            }
        } else {
            CSSBackgroundDrawable cSSBackgroundDrawableEnsureCSSBackground = backgroundStyleApplicator.ensureCSSBackground(view);
            int spacingType2 = edge.toSpacingType();
            if (width != null) {
                fDpToPx = PixelUtil.INSTANCE.dpToPx(width.floatValue());
            }
            cSSBackgroundDrawableEnsureCSSBackground.setBorderWidth(spacingType2, fDpToPx);
        }
        BorderInsets borderInsets3 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets3 == null) {
            borderInsets3 = new BorderInsets();
        }
        compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.setBorderInsets(borderInsets3);
        BorderInsets borderInsets4 = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets();
        if (borderInsets4 != null) {
            borderInsets4.setBorderWidth(edge, width);
        }
        if (Build.VERSION.SDK_INT >= 29 && (innerShadows = compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getInnerShadows()) != null) {
            int numberOfLayers = innerShadows.getNumberOfLayers();
            for (int i11 = 0; i11 < numberOfLayers; i11++) {
                Drawable drawable = innerShadows.getDrawable(i11);
                Intrinsics.checkNotNull(drawable, "null cannot be cast to non-null type com.facebook.react.uimanager.drawable.InsetBoxShadowDrawable");
                InsetBoxShadowDrawable insetBoxShadowDrawable = (InsetBoxShadowDrawable) drawable;
                insetBoxShadowDrawable.setBorderInsets(compositeBackgroundDrawableEnsureCompositeBackgroundDrawable.getBorderInsets());
                insetBoxShadowDrawable.invalidateSelf();
            }
        }
    }

    @JvmStatic
    public static final void setFeedbackUnderlay(@NotNull View view, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ReactNativeFeatureFlags.enableNewBackgroundAndBorderDrawables()) {
            INSTANCE.ensureCompositeBackgroundDrawable(view).withNewFeedbackUnderlay(drawable);
        } else {
            view.setBackground(INSTANCE.ensureCompositeBackgroundDrawable(view).withNewFeedbackUnderlay(drawable));
        }
    }

    @JvmStatic
    public static final void setOutlineColor(@NotNull View view, @ColorInt @Nullable Integer outlineColor) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) == 2) {
            OutlineDrawable outlineDrawableEnsureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
            if (outlineColor != null) {
                outlineDrawableEnsureOutlineDrawable.setOutlineColor(outlineColor.intValue());
            }
        }
    }

    @JvmStatic
    public static final void setOutlineOffset(@NotNull View view, float outlineOffset) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineOffset(PixelUtil.INSTANCE.dpToPx(outlineOffset));
    }

    @JvmStatic
    public static final void setOutlineStyle(@NotNull View view, @Nullable OutlineStyle outlineStyle) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) == 2) {
            OutlineDrawable outlineDrawableEnsureOutlineDrawable = INSTANCE.ensureOutlineDrawable(view);
            if (outlineStyle != null) {
                outlineDrawableEnsureOutlineDrawable.setOutlineStyle(outlineStyle);
            }
        }
    }

    @JvmStatic
    public static final void setOutlineWidth(@NotNull View view, float width) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (ViewUtil.getUIManagerType(view) != 2) {
            return;
        }
        INSTANCE.ensureOutlineDrawable(view).setOutlineWidth(PixelUtil.INSTANCE.dpToPx(width));
    }

    @Nullable
    public final Float getOutlineOffset(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    @Nullable
    public final OutlineStyle getOutlineStyle(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return outlineDrawable.getOutlineStyle();
        }
        return null;
    }

    @Nullable
    public final Float getOutlineWidth(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OutlineDrawable outlineDrawable = getOutlineDrawable(view);
        if (outlineDrawable != null) {
            return Float.valueOf(outlineDrawable.getOutlineOffset());
        }
        return null;
    }

    @JvmStatic
    public static final void setBoxShadow(@NotNull View view, @Nullable ReadableArray shadows) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (shadows == null) {
            setBoxShadow(view, (List<BoxShadow>) CollectionsKt.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = shadows.size();
        for (int i11 = 0; i11 < size; i11++) {
            BoxShadow.Companion companion = BoxShadow.INSTANCE;
            ReadableMap map = shadows.getMap(i11);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BoxShadow boxShadow = companion.parse(map, context);
            if (boxShadow == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add(boxShadow);
        }
        setBoxShadow(view, arrayList);
    }
}
