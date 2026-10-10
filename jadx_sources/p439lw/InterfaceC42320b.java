package p439lw;

import android.graphics.Path;
import com.kubi.resources.widget.chart.data.DataPoint;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p479nw.Frame;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: lw.b */
/* JADX INFO: compiled from: ChartContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH&J.\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001e\u0010\u0010\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\rH&J\u001e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/ChartContract$LineView;", "Lcom/kubi/resources/widget/chart/ChartContract$AxisView;", "drawLine", "", "path", "Landroid/graphics/Path;", "points", "", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "drawSelectLine", "dataPoint", "drawLineBackground", "innerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "alpha", "", "drawPoints", "drawBackgroundImage", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42320b extends InterfaceC42319a {
    /* JADX INFO: renamed from: a */
    void mo55118a(@NotNull List<DataPoint> list, @NotNull Frame frame);

    /* JADX INFO: renamed from: c */
    void mo55120c(@NotNull Frame frame, @NotNull List<DataPoint> list);

    /* JADX INFO: renamed from: e */
    void mo55122e(@NotNull Frame frame, @NotNull List<DataPoint> list, @NotNull Path path, int i11);

    /* JADX INFO: renamed from: f */
    void mo55123f(@NotNull Path path, @NotNull List<DataPoint> list);
}
