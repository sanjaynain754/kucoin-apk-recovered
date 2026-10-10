package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class IconHelper {
    public static ImageView.ScaleType convertScaleType(int i11) {
        if (i11 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i11 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i11 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i11 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i11 != 5) {
            return i11 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    private IconHelper() {
    }

    public static void applyIconTint(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] mergeIconState(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    public static void refreshIconDrawableState(@NonNull TextInputLayout textInputLayout, @NonNull CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(mergeIconState(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
            drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(drawableMutate);
        }
    }

    private static void setIconClickable(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        boolean z11;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z12 = false;
        int i11 = 1;
        if (onLongClickListener != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (zHasOnClickListeners || z11) {
            z12 = true;
        }
        checkableImageButton.setFocusable(z12);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z11);
        if (!z12) {
            i11 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i11);
    }

    public static void setIconMinSize(@NonNull CheckableImageButton checkableImageButton, @Px int i11) {
        checkableImageButton.setMinimumWidth(i11);
        checkableImageButton.setMinimumHeight(i11);
    }

    public static void setIconOnClickListener(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnClickListener onClickListener, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconOnLongClickListener(@NonNull CheckableImageButton checkableImageButton, @Nullable View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    public static void setIconScaleType(@NonNull CheckableImageButton checkableImageButton, @NonNull ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }

    public static void setCompatRippleBackgroundIfNeeded(@NonNull CheckableImageButton checkableImageButton) {
    }
}
