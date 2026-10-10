package androidx.window.layout;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WindowMetricsCalculator.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements Function1<WindowMetricsCalculator, WindowMetricsCalculator> {
    @Override // p852kotlin.jvm.functions.Function1
    @NotNull
    public final WindowMetricsCalculator invoke(@NotNull WindowMetricsCalculator p11) {
        Intrinsics.checkNotNullParameter(p11, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p11);
    }

    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }
}
