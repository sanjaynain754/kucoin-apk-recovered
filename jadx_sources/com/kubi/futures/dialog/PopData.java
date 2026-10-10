package com.kubi.futures.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FuturesAdDialog.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/futures/dialog/PopData;", "Landroid/os/Parcelable;", "closeCount", "", "lastCloseTime", "", "<init>", "(IJ)V", "getCloseCount", "()I", "getLastCloseTime", "()J", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PopData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PopData> CREATOR = new C13049a();
    private final int closeCount;
    private final long lastCloseTime;

    /* JADX INFO: renamed from: com.kubi.futures.dialog.PopData$a */
    /* JADX INFO: compiled from: FuturesAdDialog.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13049a implements Parcelable.Creator<PopData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PopData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PopData(parcel.readInt(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PopData[] newArray(int i11) {
            return new PopData[i11];
        }
    }

    public PopData() {
        this(0, 0L, 3, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopData)) {
            return false;
        }
        PopData popData = (PopData) other;
        return this.closeCount == popData.closeCount && this.lastCloseTime == popData.lastCloseTime;
    }

    public PopData(int i11, long j11) {
        this.closeCount = i11;
        this.lastCloseTime = j11;
    }

    public static /* synthetic */ PopData copy$default(PopData popData, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = popData.closeCount;
        }
        if ((i12 & 2) != 0) {
            j11 = popData.lastCloseTime;
        }
        return popData.copy(i11, j11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCloseCount() {
        return this.closeCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastCloseTime() {
        return this.lastCloseTime;
    }

    @NotNull
    public final PopData copy(int closeCount, long lastCloseTime) {
        return new PopData(closeCount, lastCloseTime);
    }

    public final int getCloseCount() {
        return this.closeCount;
    }

    public final long getLastCloseTime() {
        return this.lastCloseTime;
    }

    public int hashCode() {
        return (Integer.hashCode(this.closeCount) * 31) + Long.hashCode(this.lastCloseTime);
    }

    @NotNull
    public String toString() {
        return "PopData(closeCount=" + this.closeCount + ", lastCloseTime=" + this.lastCloseTime + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.closeCount);
        dest.writeLong(this.lastCloseTime);
    }

    public /* synthetic */ PopData(int i11, long j11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? 0L : j11);
    }
}
