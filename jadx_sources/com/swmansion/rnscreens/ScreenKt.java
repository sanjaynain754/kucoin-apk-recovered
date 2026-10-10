package com.swmansion.rnscreens;

import android.view.View;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Screen.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m90084d2 = {"asScreen", "Lcom/swmansion/rnscreens/Screen;", "Landroid/view/View;", "react-native-screens_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ScreenKt {
    @NotNull
    public static final Screen asScreen(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (Screen) view;
    }
}
