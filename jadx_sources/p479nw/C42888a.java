package p479nw;

import com.kubi.resources.widget.chart.data.AxisType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nw.a */
/* JADX INFO: compiled from: AxisType.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, m90084d2 = {"shouldDisplayAxisX", "", "Lcom/kubi/resources/widget/chart/data/AxisType;", "shouldDisplayAxisY", "LComponent_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42888a {
    /* JADX INFO: renamed from: a */
    public static final boolean m94042a(@NotNull AxisType axisType) {
        Intrinsics.checkNotNullParameter(axisType, "<this>");
        return axisType == AxisType.XY || axisType == AxisType.X;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m94043b(@NotNull AxisType axisType) {
        Intrinsics.checkNotNullParameter(axisType, "<this>");
        return axisType == AxisType.XY || axisType == AxisType.Y;
    }
}
