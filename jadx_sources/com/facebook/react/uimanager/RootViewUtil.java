package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.UiThread;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p302h6.C38115a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RootViewUtil.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007¨\u0006\u000b"}, m90084d2 = {"Lcom/facebook/react/uimanager/RootViewUtil;", "", "<init>", "()V", "getRootView", "Lcom/facebook/react/uimanager/RootView;", "reactView", "Landroid/view/View;", "getViewportOffset", "Landroid/graphics/Point;", "v", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class RootViewUtil {

    @NotNull
    public static final RootViewUtil INSTANCE = new RootViewUtil();

    private RootViewUtil() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final RootView getRootView(@NotNull View reactView) {
        Intrinsics.checkNotNullParameter(reactView, "reactView");
        View view = reactView;
        while (!(view instanceof RootView)) {
            Object parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C38115a.m86045a(parent instanceof View);
            view = (View) parent;
        }
        return (RootView) view;
    }

    @JvmStatic
    @UiThread
    @NotNull
    public static final Point getViewportOffset(@NotNull View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        int[] iArr = new int[2];
        v11.getLocationInWindow(iArr);
        Rect rect = new Rect();
        v11.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        return new Point(iArr[0], iArr[1]);
    }
}
