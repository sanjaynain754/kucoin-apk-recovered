package p479nw;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.kubi.resources.widget.chart.data.DataPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nw.h, reason: from toString */
/* JADX INFO: compiled from: Frame.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/PointFrame;", "", "dataPoint", "Lcom/kubi/resources/widget/chart/data/DataPoint;", TypedValues.AttributesType.S_FRAME, "Lcom/kubi/resources/widget/chart/data/Frame;", "<init>", "(Lcom/kubi/resources/widget/chart/data/DataPoint;Lcom/kubi/resources/widget/chart/data/Frame;)V", "getDataPoint", "()Lcom/kubi/resources/widget/chart/data/DataPoint;", "getFrame", "()Lcom/kubi/resources/widget/chart/data/Frame;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PointFrame {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final DataPoint dataPoint;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final Frame frame;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PointFrame)) {
            return false;
        }
        PointFrame pointFrame = (PointFrame) other;
        return Intrinsics.areEqual(this.dataPoint, pointFrame.dataPoint) && Intrinsics.areEqual(this.frame, pointFrame.frame);
    }

    public PointFrame(@NotNull DataPoint dataPoint, @NotNull Frame frame) {
        Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
        Intrinsics.checkNotNullParameter(frame, "frame");
        this.dataPoint = dataPoint;
        this.frame = frame;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataPoint getDataPoint() {
        return this.dataPoint;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Frame getFrame() {
        return this.frame;
    }

    public int hashCode() {
        return (this.dataPoint.hashCode() * 31) + this.frame.hashCode();
    }

    @NotNull
    public String toString() {
        return "PointFrame(dataPoint=" + this.dataPoint + ", frame=" + this.frame + ')';
    }
}
