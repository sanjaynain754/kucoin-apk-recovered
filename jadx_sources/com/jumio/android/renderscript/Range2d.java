package com.jumio.android.renderscript;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: Toolkit.kt */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"}, m90084d2 = {"Lcom/jumio/android/renderscript/Range2d;", "", "startX", "", "endX", "startY", "endY", "<init>", "(IIII)V", "()V", "getStartX", "()I", "getEndX", "getStartY", "getEndY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "jumio-toolkit_release"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final /* data */ class Range2d {
    private final int endX;
    private final int endY;
    private final int startX;
    private final int startY;

    public Range2d(int i11, int i12, int i13, int i14) {
        this.startX = i11;
        this.endX = i12;
        this.startY = i13;
        this.endY = i14;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Range2d)) {
            return false;
        }
        Range2d range2d = (Range2d) other;
        return this.startX == range2d.startX && this.endX == range2d.endX && this.startY == range2d.startY && this.endY == range2d.endY;
    }

    public static /* synthetic */ Range2d copy$default(Range2d range2d, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = range2d.startX;
        }
        if ((i15 & 2) != 0) {
            i12 = range2d.endX;
        }
        if ((i15 & 4) != 0) {
            i13 = range2d.startY;
        }
        if ((i15 & 8) != 0) {
            i14 = range2d.endY;
        }
        return range2d.copy(i11, i12, i13, i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStartX() {
        return this.startX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEndX() {
        return this.endX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartY() {
        return this.startY;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndY() {
        return this.endY;
    }

    @NotNull
    public final Range2d copy(int startX, int endX, int startY, int endY) {
        return new Range2d(startX, endX, startY, endY);
    }

    public final int getEndX() {
        return this.endX;
    }

    public final int getEndY() {
        return this.endY;
    }

    public final int getStartX() {
        return this.startX;
    }

    public final int getStartY() {
        return this.startY;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.startX) * 31) + Integer.hashCode(this.endX)) * 31) + Integer.hashCode(this.startY)) * 31) + Integer.hashCode(this.endY);
    }

    @NotNull
    public String toString() {
        return "Range2d(startX=" + this.startX + ", endX=" + this.endX + ", startY=" + this.startY + ", endY=" + this.endY + ")";
    }

    public Range2d() {
        this(0, 0, 0, 0);
    }
}
