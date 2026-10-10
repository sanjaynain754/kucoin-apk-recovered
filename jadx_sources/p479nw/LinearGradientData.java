package p479nw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nw.e, reason: from toString */
/* JADX INFO: compiled from: LinearGradientData.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/LinearGradientData;", "", "showFill", "", "fillColor", "", "startColor", "endColor", "<init>", "(ZIII)V", "getShowFill", "()Z", "getFillColor", "()I", "getStartColor", "getEndColor", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LinearGradientData {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean showFill;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int fillColor;

    /* JADX INFO: renamed from: c, reason: from toString */
    public final int startColor;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final int endColor;

    public LinearGradientData() {
        this(false, 0, 0, 0, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinearGradientData)) {
            return false;
        }
        LinearGradientData linearGradientData = (LinearGradientData) other;
        return this.showFill == linearGradientData.showFill && this.fillColor == linearGradientData.fillColor && this.startColor == linearGradientData.startColor && this.endColor == linearGradientData.endColor;
    }

    public LinearGradientData(boolean z11, int i11, int i12, int i13) {
        this.showFill = z11;
        this.fillColor = i11;
        this.startColor = i12;
        this.endColor = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEndColor() {
        return this.endColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getFillColor() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowFill() {
        return this.showFill;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getStartColor() {
        return this.startColor;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.showFill) * 31) + Integer.hashCode(this.fillColor)) * 31) + Integer.hashCode(this.startColor)) * 31) + Integer.hashCode(this.endColor);
    }

    @NotNull
    public String toString() {
        return "LinearGradientData(showFill=" + this.showFill + ", fillColor=" + this.fillColor + ", startColor=" + this.startColor + ", endColor=" + this.endColor + ')';
    }

    public /* synthetic */ LinearGradientData(boolean z11, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? true : z11, (i14 & 2) != 0 ? -16777216 : i11, (i14 & 4) != 0 ? -16777216 : i12, (i14 & 8) != 0 ? 0 : i13);
    }
}
