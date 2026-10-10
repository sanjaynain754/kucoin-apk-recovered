package p439lw;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.resources.widget.chart.data.DataPoint;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p479nw.Frame;
import p516ow.C43333a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: lw.c */
/* JADX INFO: compiled from: ChartContract.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0007H&J\b\u0010\u0011\u001a\u00020\u0007H&J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H&J#\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0002\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "", "preDraw", "", "configuration", "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;", "draw", "", "innerFrame", "Lcom/kubi/resources/widget/chart/data/Frame;", "hidePointTip", "postInvalidate", "showPointTip", "selectPoint", "dataPoint", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "unSelectPoint", "stopAnimation", "render", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "getDataPointList", "processTouch", "x", "", "y", "(Ljava/lang/Float;Ljava/lang/Float;)Lcom/kubi/resources/widget/chart/data/DataPoint;", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC42321c {
    /* JADX INFO: renamed from: a */
    void mo92857a(@NotNull DataPoint dataPoint);

    /* JADX INFO: renamed from: b */
    void mo92858b();

    /* JADX INFO: renamed from: c */
    boolean mo92859c(@NotNull C43333a c43333a);

    @NotNull
    /* JADX INFO: renamed from: d */
    Frame mo92860d();

    /* JADX INFO: renamed from: e */
    void mo92861e(@NotNull List<DataPoint> list);

    @Nullable
    /* JADX INFO: renamed from: f */
    DataPoint mo92862f(@Nullable Float f11, @Nullable Float f12);

    /* JADX INFO: renamed from: g */
    void mo92863g();

    /* JADX INFO: renamed from: h */
    void mo92864h();

    /* JADX INFO: renamed from: i */
    void mo92865i();

    void postInvalidate();

    void stopAnimation();
}
