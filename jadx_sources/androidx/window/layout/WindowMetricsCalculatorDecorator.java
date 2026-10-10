package androidx.window.layout;

import androidx.annotation.RestrictTo;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m90084d2 = {"Landroidx/window/layout/WindowMetricsCalculatorDecorator;", "", "decorate", "Landroidx/window/layout/WindowMetricsCalculator;", "calculator", "window_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface WindowMetricsCalculatorDecorator {
    @NotNull
    WindowMetricsCalculator decorate(@NotNull WindowMetricsCalculator calculator);
}
