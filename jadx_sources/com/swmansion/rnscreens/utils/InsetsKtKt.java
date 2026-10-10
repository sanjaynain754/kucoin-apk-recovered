package com.swmansion.rnscreens.utils;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InsetsKt.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a.\u0010\u0004\u001a\u00060\u0001j\u0002`\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001*\n\u0010\u0002\"\u00020\u00032\u00020\u0003¨\u0006\r"}, m90084d2 = {"InsetsCompat", "Landroidx/core/graphics/Insets;", "InsetsPlatform", "Landroid/graphics/Insets;", "resolveInsetsOrZero", "Lcom/swmansion/rnscreens/utils/InsetsCompat;", "Landroid/view/View;", "insetType", "", "sourceWindowInsets", "Landroid/view/WindowInsets;", "ignoreVisibility", "", "react-native-screens_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class InsetsKtKt {
    @NotNull
    public static final Insets resolveInsetsOrZero(@NotNull View view, int i11, @Nullable WindowInsets windowInsets, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (windowInsets == null) {
            Insets NONE = Insets.NONE;
            Intrinsics.checkNotNullExpressionValue(NONE, "NONE");
            return NONE;
        }
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        if (z11) {
            Insets insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(i11);
            Intrinsics.checkNotNull(insetsIgnoringVisibility);
            return insetsIgnoringVisibility;
        }
        Insets insets = windowInsetsCompat.getInsets(i11);
        Intrinsics.checkNotNull(insets);
        return insets;
    }

    public static /* synthetic */ Insets resolveInsetsOrZero$default(View view, int i11, WindowInsets windowInsets, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            windowInsets = view.getRootWindowInsets();
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        return resolveInsetsOrZero(view, i11, windowInsets, z11);
    }
}
