package p439lw;

import com.jumio.core.extraction.ProcessingTimesRecorderKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p479nw.Frame;
import p479nw.Label;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: lw.a */
/* JADX INFO: compiled from: ChartContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J,\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006H&J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/ChartContract$AxisView;", "", "postInvalidate", "", "drawLabels", "xLabels", "", "Lcom/kubi/resources/widget/chart/data/Label;", "drawGrid", "innerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "xLabelsPositions", "", "yLabelsPositions", "drawDebugFrame", ProcessingTimesRecorderKt.DEFAULT_RECORDS_LABEL, "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42319a {
    /* JADX INFO: renamed from: b */
    void mo55119b(@NotNull List<Label> list);

    /* JADX INFO: renamed from: d */
    void mo55121d(@NotNull Frame frame, @NotNull List<Float> list, @NotNull List<Float> list2);

    void postInvalidate();
}
