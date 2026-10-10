package com.jumio.core.overlay;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import com.jumio.core.C9301R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u0005\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\u001e\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0005H\u0002\u001a\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m90084d2 = {"OVERLAY_PERCENTAGE_FAR", "", "OVERLAY_PERCENTAGE_NEAR", "OVERLAY_PERCENTAGE_INITIAL", "OVAL_FILL_ALPHA", "", "animatedDrawable", "Landroid/graphics/drawable/AnimatedVectorDrawable;", "Landroid/widget/ImageView;", "layerId", "setColor", "", "Landroid/graphics/drawable/Drawable;", "color", "layerDrawable", "resetAnyLayerDrawableAnimation", "reset", "defaultOverlayColor", "jumio-core_release"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class BaseLivenessOverlayKt {
    public static final float OVERLAY_PERCENTAGE_FAR = 0.625f;
    public static final float OVERLAY_PERCENTAGE_INITIAL = 0.7125f;
    public static final float OVERLAY_PERCENTAGE_NEAR = 0.8f;

    @Nullable
    public static final AnimatedVectorDrawable animatedDrawable(@NotNull ImageView imageView, int i11) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Drawable drawable = imageView.getDrawable();
        LayerDrawable layerDrawable = drawable instanceof LayerDrawable ? (LayerDrawable) drawable : null;
        Drawable drawableFindDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(i11) : null;
        if (drawableFindDrawableByLayerId instanceof AnimatedVectorDrawable) {
            return (AnimatedVectorDrawable) drawableFindDrawableByLayerId;
        }
        return null;
    }

    public static final void setColor(@NotNull Drawable drawable, @ColorInt int i11) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
    }

    public static final Drawable access$layerDrawable(ImageView imageView, int i11) {
        LayerDrawable layerDrawable;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) drawable;
        } else {
            layerDrawable = null;
        }
        if (layerDrawable == null) {
            return null;
        }
        return layerDrawable.findDrawableByLayerId(i11);
    }

    public static final void access$reset(ImageView imageView, int i11) {
        LayerDrawable layerDrawable;
        imageView.requestLayout();
        Drawable drawableFindDrawableByLayerId = null;
        imageView.setImageBitmap(null);
        imageView.setImageResource(C9301R.drawable.jumio_liveness_overlay_layer_list);
        imageView.getDrawable().invalidateSelf();
        int i12 = C9301R.id.liveness_overlay_outer;
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof LayerDrawable) {
            layerDrawable = (LayerDrawable) drawable;
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null) {
            drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(i12);
        }
        if (drawableFindDrawableByLayerId != null) {
            setColor(drawableFindDrawableByLayerId, i11);
        }
    }

    public static final void access$resetAnyLayerDrawableAnimation(ImageView imageView, int i11, int i12) {
        AnimatedVectorDrawable animatedVectorDrawableAnimatedDrawable = animatedDrawable(imageView, i11);
        if (animatedVectorDrawableAnimatedDrawable == null) {
            return;
        }
        animatedVectorDrawableAnimatedDrawable.reset();
        setColor(animatedVectorDrawableAnimatedDrawable, i12);
    }
}
