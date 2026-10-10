package wa0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wa0.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C45784e {
    /* JADX INFO: renamed from: a */
    public static final void m101110a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: b */
    public static final void m101111b(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z11 ? 0 : 8);
    }

    /* JADX INFO: renamed from: c */
    public static final void m101112c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object systemService = view.getContext().getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(view, 1);
    }
}
