package bg0;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: bg0.b, reason: from toString */
/* JADX INFO: compiled from: FontTokens.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lio/trtc/tuikit/atomicx/theme/tokens/Font;", "", "size", "", "weight", "", "<init>", "(FI)V", "getSize", "()F", "getWeight", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "atomic_x_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Font {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final float size;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int weight;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Font)) {
            return false;
        }
        Font font = (Font) other;
        return Float.compare(this.size, font.size) == 0 && this.weight == font.weight;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (Float.hashCode(this.size) * 31) + Integer.hashCode(this.weight);
    }

    @NotNull
    public String toString() {
        return "Font(size=" + this.size + ", weight=" + this.weight + ')';
    }

    public Font(float f11, int i11) {
        this.size = f11;
        this.weight = i11;
    }
}
