package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.RequiresApi;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SafeAreaUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0003\u001a\u0018\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¨\u0006\f"}, m90084d2 = {"getRootWindowInsetsCompatR", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "rootView", "Landroid/view/View;", "getRootWindowInsetsCompatM", "getRootWindowInsetsCompatBase", "getRootWindowInsetsCompat", "getSafeAreaInsets", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "getFrame", "Lcom/th3rdwave/safeareacontext/Rect;", "Landroid/view/ViewGroup;", "react-native-safe-area-context_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SafeAreaUtilsKt {
    @Nullable
    public static final Rect getFrame(@NotNull ViewGroup rootView, @NotNull View view) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getDrawingRect(rect);
        try {
            rootView.offsetDescendantRectToMyCoords(view, rect);
            return new Rect(rect.left, rect.top, view.getWidth(), view.getHeight());
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static final EdgeInsets getRootWindowInsetsCompat(View view) {
        return Build.VERSION.SDK_INT >= 30 ? getRootWindowInsetsCompatR(view) : getRootWindowInsetsCompatM(view);
    }

    private static final EdgeInsets getRootWindowInsetsCompatBase(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return new EdgeInsets(rect.top, view.getWidth() - rect.right, view.getHeight() - rect.bottom, rect.left);
    }

    @Nullable
    public static final EdgeInsets getSafeAreaInsets(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        Intrinsics.checkNotNull(rootView);
        EdgeInsets rootWindowInsetsCompat = getRootWindowInsetsCompat(rootView);
        if (rootWindowInsetsCompat == null) {
            return null;
        }
        float width = rootView.getWidth();
        float height = rootView.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return new EdgeInsets(Math.max(rootWindowInsetsCompat.getTop() - rect.top, 0.0f), Math.max(Math.min((rect.left + view.getWidth()) - width, 0.0f) + rootWindowInsetsCompat.getRight(), 0.0f), Math.max(Math.min((rect.top + view.getHeight()) - height, 0.0f) + rootWindowInsetsCompat.getBottom(), 0.0f), Math.max(rootWindowInsetsCompat.getLeft() - rect.left, 0.0f));
    }

    @RequiresApi(23)
    private static final EdgeInsets getRootWindowInsetsCompatM(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new EdgeInsets(rootWindowInsets.getSystemWindowInsetTop(), rootWindowInsets.getSystemWindowInsetRight(), Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), rootWindowInsets.getSystemWindowInsetLeft());
    }

    @RequiresApi(30)
    private static final EdgeInsets getRootWindowInsetsCompatR(View view) {
        Insets insets;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null && (insets = rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar())) != null) {
            return new EdgeInsets(insets.top, insets.right, insets.bottom, insets.left);
        }
        return null;
    }
}
