package p479nw;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: nw.i, reason: from toString */
/* JADX INFO: compiled from: Scale.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/resources/widget/chart/data/Scale;", "", "min", "", "max", "<init>", "(DD)V", "getMin", "()D", "getMax", "size", "getSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Scale {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final double min;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final double max;

    /* JADX INFO: renamed from: c */
    public final double f94976c;

    public Scale() {
        this(0.0d, 0.0d, 3, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) other;
        return Double.compare(this.min, scale.min) == 0 && Double.compare(this.max, scale.max) == 0;
    }

    public Scale(double d11, double d12) {
        this.min = d11;
        this.max = d12;
        this.f94976c = d12 - d11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getF94976c() {
        return this.f94976c;
    }

    public int hashCode() {
        return (Double.hashCode(this.min) * 31) + Double.hashCode(this.max);
    }

    @NotNull
    public String toString() {
        return "Scale(min=" + this.min + ", max=" + this.max + ')';
    }

    public /* synthetic */ Scale(double d11, double d12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1.0d : d11, (i11 & 2) != 0 ? -1.0d : d12);
    }
}
