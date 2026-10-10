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
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/quotefacade/rank/config/RankSubTabItemConfig;", "Landroid/os/Parcelable;", "tabNameStringID", "", "type", "", "<init>", "(ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "getTabName", "isRankCoinSubTab", "", "isRankSpotSubTab", "isRankFutureSubTab", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankSubTabItemConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RankSubTabItemConfig> CREATOR = new C22437a();
    private final int tabNameStringID;

    @NotNull
    private final String type;

    /* JADX INFO: renamed from: com.kubi.quotefacade.rank.config.RankSubTabItemConfig$a */
    /* JADX INFO: compiled from: RankConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C22437a implements Parcelable.Creator<RankSubTabItemConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RankSubTabItemConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RankSubTabItemConfig(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RankSubTabItemConfig[] newArray(int i11) {
            return new RankSubTabItemConfig[i11];
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
        if (!(other instanceof RankSubTabItemConfig)) {
            return false;
        }
        RankSubTabItemConfig rankSubTabItemConfig = (RankSubTabItemConfig) other;
        return this.tabNameStringID == rankSubTabItemConfig.tabNameStringID && Intrinsics.areEqual(this.type, rankSubTabItemConfig.type);
    }

    public RankSubTabItemConfig(int i11, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.tabNameStringID = i11;
        this.type = type;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final int getTabNameStringID() {
        return this.tabNameStringID;
    }

    public static /* synthetic */ RankSubTabItemConfig copy$default(RankSubTabItemConfig rankSubTabItemConfig, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = rankSubTabItemConfig.tabNameStringID;
        }
        if ((i12 & 2) != 0) {
            str = rankSubTabItemConfig.type;
        }
        return rankSubTabItemConfig.copy(i11, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final RankSubTabItemConfig copy(int tabNameStringID, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new RankSubTabItemConfig(tabNameStringID, type);
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

    public final boolean isRankCoinSubTab() {
        return Intrinsics.areEqual(this.type, "COIN");
    }

    public final boolean isRankFutureSubTab() {
        return Intrinsics.areEqual(this.type, "CONTRACT");
    }

    public final boolean isRankSpotSubTab() {
        return Intrinsics.areEqual(this.type, "SPOT");
    }

    @NotNull
    public String toString() {
        return "RankSubTabItemConfig(tabNameStringID=" + this.tabNameStringID + ", type=" + this.type + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.tabNameStringID);
        dest.writeString(this.type);
    }
}
