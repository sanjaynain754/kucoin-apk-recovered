package com.kubi.quotefacade.rank.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.kubi.utils.C27017c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankConfig.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u0005J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u0003J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/config/RankTabItemConfig;", "Landroid/os/Parcelable;", "tabNameStringID", "", "type", "", "<init>", "(ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTabName", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankTabItemConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RankTabItemConfig> CREATOR = new C22439a();
    private final int tabNameStringID;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.config.RankTabItemConfig$a */
    /* JADX INFO: compiled from: RankConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22439a implements Parcelable.Creator<RankTabItemConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankTabItemConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RankTabItemConfig(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RankTabItemConfig[] newArray(int i11) {
            return new RankTabItemConfig[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankTabItemConfig)) {
            return false;
        }
        RankTabItemConfig rankTabItemConfig = (RankTabItemConfig) other;
        return this.tabNameStringID == rankTabItemConfig.tabNameStringID && Intrinsics.areEqual(this.type, rankTabItemConfig.type);
    }

    public RankTabItemConfig(int i11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.tabNameStringID = i11;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getTabNameStringID() {
        return this.tabNameStringID;
    }

    public static /* synthetic */ RankTabItemConfig copy$default(RankTabItemConfig rankTabItemConfig, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rankTabItemConfig.tabNameStringID;
        }
        if ((i12 & 2) != 0) {
            str = rankTabItemConfig.type;
        }
        return rankTabItemConfig.copy(i11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final RankTabItemConfig copy(int tabNameStringID, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new RankTabItemConfig(tabNameStringID, type);
    }

    @NotNull
    public final String getTabName() {
        return C27017c.f54310a.m66516f(this.tabNameStringID, new Object[0]);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.tabNameStringID) * 31) + this.type.hashCode();
    }

    @NotNull
    public String toString() {
        return "RankTabItemConfig(tabNameStringID=" + this.tabNameStringID + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.tabNameStringID);
        dest.writeString(this.type);
    }
}
