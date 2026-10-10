package tw;

import com.kubi.resources.widget.chart.data.AxisType;
import com.kubi.utils.extensions.C27040e;
import org.jetbrains.annotations.NotNull;
import p479nw.C42888a;
import p479nw.C42894g;
import p479nw.Paddings;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tw.a */
/* JADX INFO: compiled from: MeasureLineChartPaddings.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\u0002J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002J(\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/renderer/executor/MeasureLineChartPaddings;", "", "<init>", "()V", "invoke", "Lcom/kubi/resources/widget/chart/data/Paddings;", "axisType", "Lcom/kubi/resources/widget/chart/data/AxisType;", "labelsHeight", "", "longestLabelWidth", "labelsPaddingToInnerChart", "lineThickness", "pointsDrawableWidth", "", "pointsDrawableHeight", "offsetPaddings", "measureLabelsPaddingsX", "measureLabelsPaddingsY", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45076a {
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Paddings m99679a(@NotNull AxisType axisType, float f11, float f12, float f13, float f14, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(axisType, "axisType");
        Paddings paddingsM94066a = C42894g.m94066a(m99680b(axisType, f11, f13), m99681c(axisType, f11, f12, f13));
        float f15 = 2;
        float f16 = f14 / f15;
        float f17 = i11 / f15;
        float f18 = i12 / f15;
        return paddingsM94066a.m94061a(paddingsM94066a.getLeft() + f16 + f17, paddingsM94066a.getTop() + f14 + f18 + C27040e.m66658b(i13), paddingsM94066a.getRight() + f16 + f17, paddingsM94066a.getBottom() + f14 + f18 + C27040e.m66658b(i13));
    }

    /* JADX INFO: renamed from: b */
    public final Paddings m99680b(AxisType axisType, float f11, float f12) {
        return new Paddings(0.0f, 0.0f, 0.0f, C42888a.m94042a(axisType) ? f11 + f12 : 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Paddings m99681c(AxisType axisType, float f11, float f12, float f13) {
        if (!C42888a.m94043b(axisType)) {
            return new Paddings(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float f14 = f11 / 2;
        return new Paddings(f12 + f13, f14, 0.0f, f14);
    }
}
