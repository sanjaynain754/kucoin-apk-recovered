package com.google.android.material.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    @Nullable
    public static Drawable createTintableDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @Nullable
    public static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    @NonNull
    public static int[] getCheckedState(@NonNull int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            int i12 = iArr[i11];
            if (i12 == 16842912) {
                return iArr;
            }
            if (i12 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i11] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    @NonNull
    public static int[] getUncheckedState(@NonNull int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != 16842912) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: loaded from: classes45.dex */
    public static class OutlineCompatL {
        private OutlineCompatL() {
        }

        @DoNotInline
        public static void setConvexPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setConvexPath(path);
        }
    }

    /* JADX INFO: loaded from: classes45.dex */
    @RequiresApi(30)
    public static class OutlineCompatR {
        private OutlineCompatR() {
        }

        @DoNotInline
        public static void setPath(@NonNull Outline outline, @NonNull Path path) {
            outline.setPath(path);
        }
    }

    @Nullable
    public static Drawable compositeTwoLayeredDrawable(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Px int i11, @Px int i12) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i11 == -1) {
            i11 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i12 == -1) {
            i12 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i11 > drawable.getIntrinsicWidth() || i12 > drawable.getIntrinsicHeight()) {
            float f11 = i11 / i12;
            if (f11 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i12 = (int) (intrinsicWidth / f11);
                i11 = intrinsicWidth;
            } else {
                i12 = drawable.getIntrinsicHeight();
                i11 = (int) (f11 * i12);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i11, i12);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    @Nullable
    private static Drawable createTintableMutatedDrawableIfNeeded(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, boolean z11) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList == null) {
            if (z11) {
                drawable.mutate();
            }
            return drawable;
        }
        Drawable drawableMutate = DrawableCompat.wrap(drawable).mutate();
        if (mode != null) {
            drawableMutate.setTintMode(mode);
        }
        return drawableMutate;
    }

    @Nullable
    public static ColorStateList getColorStateListOrNull(@Nullable Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !C7406a.m13121a(drawable)) {
            return null;
        }
        return C7407b.m13122a(drawable).getColorStateList();
    }

    public static void setOutlineToPath(@NonNull Outline outline, @NonNull Path path) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            OutlineCompatR.setPath(outline, path);
            return;
        }
        if (i11 >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    public static void setTint(@NonNull Drawable drawable, @ColorInt int i11) {
        if (i11 != 0) {
            drawable.setTint(i11);
        } else {
            drawable.setTintList(null);
        }
    }

    @Nullable
    public static PorterDuffColorFilter updateTintFilter(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    private DrawableUtils() {
    }

    private static int getTopLayerIntrinsicHeight(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight != -1) {
            return intrinsicHeight;
        }
        return drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        if (intrinsicWidth != -1) {
            return intrinsicWidth;
        }
        return drawable.getIntrinsicWidth();
    }

    @NonNull
    public static AttributeSet parseDrawableXml(@NonNull Context context, @XmlRes int i11, @NonNull CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i11);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (TextUtils.equals(xml.getName(), charSequence)) {
                    return Xml.asAttributeSet(xml);
                }
                throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e11) {
            e = e11;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e12) {
            e = e12;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i11));
            notFoundException2.initCause(e);
            throw notFoundException2;
        }
    }

    public static void setRippleDrawableRadius(@Nullable RippleDrawable rippleDrawable, int i11) {
        rippleDrawable.setRadius(i11);
    }
}
