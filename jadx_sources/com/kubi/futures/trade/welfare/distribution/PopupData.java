package com.kubi.futures.trade.welfare.distribution;

import android.os.Parcel;
import android.os.Parcelable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PopupFrequencyManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0005J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/futures/trade/welfare/distribution/PopupData;", "Landroid/os/Parcelable;", "lastCloseTimestamp", "", "consecutiveCloseCount", "", "currentCooldownDays", "<init>", "(JII)V", "getLastCloseTimestamp", "()J", "getConsecutiveCloseCount", "()I", "getCurrentCooldownDays", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PopupData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PopupData> CREATOR = new C14288a();
    private final int consecutiveCloseCount;
    private final int currentCooldownDays;
    private final long lastCloseTimestamp;

    /* JADX INFO: renamed from: com.kubi.futures.trade.welfare.distribution.PopupData$a */
    /* JADX INFO: compiled from: PopupFrequencyManager.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14288a implements Parcelable.Creator<PopupData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PopupData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PopupData(parcel.readLong(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PopupData[] newArray(int i11) {
            return new PopupData[i11];
        }
    }

    public PopupData() {
        this(0L, 0, 0, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupData)) {
            return false;
        }
        PopupData popupData = (PopupData) other;
        return this.lastCloseTimestamp == popupData.lastCloseTimestamp && this.consecutiveCloseCount == popupData.consecutiveCloseCount && this.currentCooldownDays == popupData.currentCooldownDays;
    }

    public PopupData(long j11, int i11, int i12) {
        this.lastCloseTimestamp = j11;
        this.consecutiveCloseCount = i11;
        this.currentCooldownDays = i12;
    }

    public static /* synthetic */ PopupData copy$default(PopupData popupData, long j11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = popupData.lastCloseTimestamp;
        }
        if ((i13 & 2) != 0) {
            i11 = popupData.consecutiveCloseCount;
        }
        if ((i13 & 4) != 0) {
            i12 = popupData.currentCooldownDays;
        }
        return popupData.copy(j11, i11, i12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastCloseTimestamp() {
        return this.lastCloseTimestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConsecutiveCloseCount() {
        return this.consecutiveCloseCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentCooldownDays() {
        return this.currentCooldownDays;
    }

    @NotNull
    public final PopupData copy(long lastCloseTimestamp, int consecutiveCloseCount, int currentCooldownDays) {
        return new PopupData(lastCloseTimestamp, consecutiveCloseCount, currentCooldownDays);
    }

    public final int getConsecutiveCloseCount() {
        return this.consecutiveCloseCount;
    }

    public final int getCurrentCooldownDays() {
        return this.currentCooldownDays;
    }

    public final long getLastCloseTimestamp() {
        return this.lastCloseTimestamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.lastCloseTimestamp) * 31) + Integer.hashCode(this.consecutiveCloseCount)) * 31) + Integer.hashCode(this.currentCooldownDays);
    }

    @NotNull
    public String toString() {
        return "PopupData(lastCloseTimestamp=" + this.lastCloseTimestamp + ", consecutiveCloseCount=" + this.consecutiveCloseCount + ", currentCooldownDays=" + this.currentCooldownDays + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.lastCloseTimestamp);
        dest.writeInt(this.consecutiveCloseCount);
        dest.writeInt(this.currentCooldownDays);
    }

    public /* synthetic */ PopupData(long j11, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 1 : i12);
    }
}
