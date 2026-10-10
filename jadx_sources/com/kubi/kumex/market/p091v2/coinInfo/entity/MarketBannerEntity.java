package com.kubi.kumex.market.p091v2.coinInfo.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketBannerEntity;", "Landroid/os/Parcelable;", "id", "", "bizType", "bizName", "startTime", "", "endTime", "title", SignTermItem.LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getBizType", "getBizName", "getStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndTime", "getTitle", "getLink", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketBannerEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketBannerEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketBannerEntity> CREATOR = new C16393a();

    @Nullable
    private final String bizName;

    @Nullable
    private final String bizType;

    @Nullable
    private final Long endTime;

    @Nullable
    private final String id;

    @Nullable
    private final String link;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.MarketBannerEntity$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16393a implements Parcelable.Creator<MarketBannerEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketBannerEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketBannerEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketBannerEntity[] newArray(int i11) {
            return new MarketBannerEntity[i11];
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
        if (!(other instanceof MarketBannerEntity)) {
            return false;
        }
        MarketBannerEntity marketBannerEntity = (MarketBannerEntity) other;
        return Intrinsics.areEqual(this.id, marketBannerEntity.id) && Intrinsics.areEqual(this.bizType, marketBannerEntity.bizType) && Intrinsics.areEqual(this.bizName, marketBannerEntity.bizName) && Intrinsics.areEqual(this.startTime, marketBannerEntity.startTime) && Intrinsics.areEqual(this.endTime, marketBannerEntity.endTime) && Intrinsics.areEqual(this.title, marketBannerEntity.title) && Intrinsics.areEqual(this.link, marketBannerEntity.link);
    }

    public static /* synthetic */ MarketBannerEntity copy$default(MarketBannerEntity marketBannerEntity, String str, String str2, String str3, Long l11, Long l12, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketBannerEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = marketBannerEntity.bizType;
        }
        if ((i11 & 4) != 0) {
            str3 = marketBannerEntity.bizName;
        }
        if ((i11 & 8) != 0) {
            l11 = marketBannerEntity.startTime;
        }
        if ((i11 & 16) != 0) {
            l12 = marketBannerEntity.endTime;
        }
        if ((i11 & 32) != 0) {
            str4 = marketBannerEntity.title;
        }
        if ((i11 & 64) != 0) {
            str5 = marketBannerEntity.link;
        }
        String str6 = str4;
        String str7 = str5;
        Long l13 = l12;
        String str8 = str3;
        return marketBannerEntity.copy(str, str2, str8, l11, l13, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizName() {
        return this.bizName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final MarketBannerEntity copy(@Nullable String id2, @Nullable String bizType, @Nullable String bizName, @Nullable Long startTime, @Nullable Long endTime, @Nullable String title, @Nullable String link) {
        return new MarketBannerEntity(id2, bizType, bizName, startTime, endTime, title, link);
    }

    @Nullable
    public final String getBizName() {
        return this.bizName;
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bizType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.startTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.endTime;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.link;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketBannerEntity(id=" + this.id + ", bizType=" + this.bizType + ", bizName=" + this.bizName + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", title=" + this.title + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.bizType);
        dest.writeString(this.bizName);
        Long l11 = this.startTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.endTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.title);
        dest.writeString(this.link);
    }

    public MarketBannerEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Long l12, @Nullable String str4, @Nullable String str5) {
        this.id = str;
        this.bizType = str2;
        this.bizName = str3;
        this.startTime = l11;
        this.endTime = l12;
        this.title = str4;
        this.link = str5;
    }
}
