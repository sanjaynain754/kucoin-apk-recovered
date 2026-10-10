package com.swmansion.rnscreens.bottomsheet;

import android.view.View;
import com.swmansion.rnscreens.Screen;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SheetUtils.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006¨\u0006\u0007"}, m90084d2 = {"isSheetFitToContents", "", "Lcom/swmansion/rnscreens/Screen;", "usesFormSheetPresentation", "requiresEnterTransitionPostponing", "isLaidOutOrHasCachedLayout", "Landroid/view/View;", "react-native-screens_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class SheetUtilsKt {
    public static final boolean isLaidOutOrHasCachedLayout(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.isLaidOut() || view.getHeight() > 0 || view.getWidth() > 0;
    }

    public static final boolean isSheetFitToContents(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == Screen.StackPresentation.FORM_SHEET && screen.getSheetDetents().size() == 1 && ((Number) CollectionsKt.first((List) screen.getSheetDetents())).doubleValue() == -1.0d;
    }

    public static final boolean requiresEnterTransitionPostponing(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return false;
    }

    public static final boolean usesFormSheetPresentation(@NotNull Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "<this>");
        return screen.getStackPresentation() == Screen.StackPresentation.FORM_SHEET;
    }
}
