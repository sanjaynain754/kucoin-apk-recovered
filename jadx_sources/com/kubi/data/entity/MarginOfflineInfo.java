package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginOfflineInfo.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\""}, m90084d2 = {"Lcom/kubi/data/entity/MarginOfflineInfo;", "Landroid/os/Parcelable;", SignTermItem.LINK, "", "time", "", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "getLink", "()Ljava/lang/String;", "setLink", "(Ljava/lang/String;)V", "getTime", "()Ljava/lang/Long;", "setTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/data/entity/MarginOfflineInfo;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginOfflineInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginOfflineInfo> CREATOR = new Creator();

    @Nullable
    private String link;

    @Nullable
    private Long time;

    /* JADX INFO: compiled from: MarginOfflineInfo.kt */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginOfflineInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginOfflineInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginOfflineInfo(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginOfflineInfo[] newArray(int i11) {
            return new MarginOfflineInfo[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarginOfflineInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginOfflineInfo)) {
            return false;
        }
        MarginOfflineInfo marginOfflineInfo = (MarginOfflineInfo) other;
        return Intrinsics.areEqual(this.link, marginOfflineInfo.link) && Intrinsics.areEqual(this.time, marginOfflineInfo.time);
    }

    public MarginOfflineInfo(@Nullable String str, @Nullable Long l11) {
        this.link = str;
        this.time = l11;
    }

    public static /* synthetic */ MarginOfflineInfo copy$default(MarginOfflineInfo marginOfflineInfo, String str, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginOfflineInfo.link;
        }
        if ((i11 & 2) != 0) {
            l11 = marginOfflineInfo.time;
        }
        return marginOfflineInfo.copy(str, l11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @NotNull
    public final MarginOfflineInfo copy(@Nullable String link, @Nullable Long time) {
        return new MarginOfflineInfo(link, time);
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.time;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setTime(@Nullable Long l11) {
        this.time = l11;
    }

    @NotNull
    public String toString() {
        return "MarginOfflineInfo(link=" + this.link + ", time=" + this.time + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.link);
        Long l11 = this.time;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ MarginOfflineInfo(String str, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : l11);
    }
}
