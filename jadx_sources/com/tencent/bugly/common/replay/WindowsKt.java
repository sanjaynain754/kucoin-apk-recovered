package com.tencent.bugly.common.replay;

import android.view.View;
import android.view.Window;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {"phoneWindow", "Landroid/view/Window;", "Landroid/view/View;", "getPhoneWindow", "(Landroid/view/View;)Landroid/view/Window;", "bugly-pro_release"}, m90085k = 2, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class WindowsKt {
    @Nullable
    public static final Window getPhoneWindow(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WindowSpy windowSpy = WindowSpy.INSTANCE;
        View rootView = view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        return windowSpy.pullWindow(rootView);
    }
}
