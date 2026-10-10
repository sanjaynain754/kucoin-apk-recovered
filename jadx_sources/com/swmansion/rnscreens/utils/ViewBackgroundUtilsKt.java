package com.swmansion.rnscreens.utils;

import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.views.view.ReactViewGroup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewBackgroundUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"resolveBackgroundColor", "", "Lcom/facebook/react/views/view/ReactViewGroup;", "(Lcom/facebook/react/views/view/ReactViewGroup;)Ljava/lang/Integer;", "react-native-screens_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class ViewBackgroundUtilsKt {
    @Nullable
    public static final Integer resolveBackgroundColor(@NotNull ReactViewGroup reactViewGroup) {
        Intrinsics.checkNotNullParameter(reactViewGroup, "<this>");
        return BackgroundStyleApplicator.getBackgroundColor(reactViewGroup);
    }
}
