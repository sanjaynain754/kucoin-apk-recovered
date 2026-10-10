package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.ReplaceWith;

/* JADX INFO: loaded from: classes23.dex */
@Deprecated
public final class MarginLayoutParamsCompat {
    private MarginLayoutParamsCompat() {
    }

    @Deprecated
    public static int getLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        int layoutDirection = marginLayoutParams.getLayoutDirection();
        if (layoutDirection != 0 && layoutDirection != 1) {
            return 0;
        }
        return layoutDirection;
    }

    @ReplaceWith(expression = "lp.getMarginEnd()")
    @Deprecated
    public static int getMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    @ReplaceWith(expression = "lp.getMarginStart()")
    @Deprecated
    public static int getMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    @ReplaceWith(expression = "lp.isMarginRelative()")
    @Deprecated
    public static boolean isMarginRelative(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    @ReplaceWith(expression = "lp.resolveLayoutDirection(layoutDirection)")
    @Deprecated
    public static void resolveLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.resolveLayoutDirection(i11);
    }

    @ReplaceWith(expression = "lp.setLayoutDirection(layoutDirection)")
    @Deprecated
    public static void setLayoutDirection(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setLayoutDirection(i11);
    }

    @ReplaceWith(expression = "lp.setMarginEnd(marginEnd)")
    @Deprecated
    public static void setMarginEnd(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginEnd(i11);
    }

    @ReplaceWith(expression = "lp.setMarginStart(marginStart)")
    @Deprecated
    public static void setMarginStart(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i11) {
        marginLayoutParams.setMarginStart(i11);
    }
}
