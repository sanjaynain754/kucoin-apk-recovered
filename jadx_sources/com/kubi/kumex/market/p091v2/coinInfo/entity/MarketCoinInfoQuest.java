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
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u00060"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoQuest;", "Landroid/os/Parcelable;", "title", "", "subtitle", SignTermItem.LINK, "signUpNum", "", "startTime", "endTime", "totalAmount", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getLink", "getSignUpNum", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStartTime", "getEndTime", "getTotalAmount", "getId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfoQuest;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarketCoinInfoQuest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarketCoinInfoQuest> CREATOR = new C16399a();

    @Nullable
    private final Long endTime;

    @Nullable
    private final String id;

    @Nullable
    private final String link;

    @Nullable
    private final Long signUpNum;

    @Nullable
    private final Long startTime;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    @Nullable
    private final String totalAmount;

    /* JADX INFO: renamed from: com.kubi.kumex.market.v2.coinInfo.entity.MarketCoinInfoQuest$a */
    /* JADX INFO: compiled from: MarketCoinInfoEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16399a implements Parcelable.Creator<MarketCoinInfoQuest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoQuest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarketCoinInfoQuest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketCoinInfoQuest[] newArray(int i11) {
            return new MarketCoinInfoQuest[i11];
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
        if (!(other instanceof MarketCoinInfoQuest)) {
            return false;
        }
        MarketCoinInfoQuest marketCoinInfoQuest = (MarketCoinInfoQuest) other;
        return Intrinsics.areEqual(this.title, marketCoinInfoQuest.title) && Intrinsics.areEqual(this.subtitle, marketCoinInfoQuest.subtitle) && Intrinsics.areEqual(this.link, marketCoinInfoQuest.link) && Intrinsics.areEqual(this.signUpNum, marketCoinInfoQuest.signUpNum) && Intrinsics.areEqual(this.startTime, marketCoinInfoQuest.startTime) && Intrinsics.areEqual(this.endTime, marketCoinInfoQuest.endTime) && Intrinsics.areEqual(this.totalAmount, marketCoinInfoQuest.totalAmount) && Intrinsics.areEqual(this.id, marketCoinInfoQuest.id);
    }

    public static /* synthetic */ MarketCoinInfoQuest copy$default(MarketCoinInfoQuest marketCoinInfoQuest, String str, String str2, String str3, Long l11, Long l12, Long l13, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marketCoinInfoQuest.title;
        }
        if ((i11 & 2) != 0) {
            str2 = marketCoinInfoQuest.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = marketCoinInfoQuest.link;
        }
        if ((i11 & 8) != 0) {
            l11 = marketCoinInfoQuest.signUpNum;
        }
        if ((i11 & 16) != 0) {
            l12 = marketCoinInfoQuest.startTime;
        }
        if ((i11 & 32) != 0) {
            l13 = marketCoinInfoQuest.endTime;
        }
        if ((i11 & 64) != 0) {
            str4 = marketCoinInfoQuest.totalAmount;
        }
        if ((i11 & 128) != 0) {
            str5 = marketCoinInfoQuest.id;
        }
        String str6 = str4;
        String str7 = str5;
        Long l14 = l12;
        Long l15 = l13;
        return marketCoinInfoQuest.copy(str, str2, str3, l11, l14, l15, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSignUpNum() {
        return this.signUpNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getEndTime() {
        return this.endTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final MarketCoinInfoQuest copy(@Nullable String title, @Nullable String subtitle, @Nullable String link, @Nullable Long signUpNum, @Nullable Long startTime, @Nullable Long endTime, @Nullable String totalAmount, @Nullable String id2) {
        return new MarketCoinInfoQuest(title, subtitle, link, signUpNum, startTime, endTime, totalAmount, id2);
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
    public final Long getSignUpNum() {
        return this.signUpNum;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.signUpNum;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.startTime;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.endTime;
        int iHashCode6 = (iHashCode5 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.totalAmount;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MarketCoinInfoQuest(title=" + this.title + ", subtitle=" + this.subtitle + ", link=" + this.link + ", signUpNum=" + this.signUpNum + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", totalAmount=" + this.totalAmount + ", id=" + this.id + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.link);
        Long l11 = this.signUpNum;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.startTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.endTime;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.totalAmount);
        dest.writeString(this.id);
    }

    public MarketCoinInfoQuest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str4, @Nullable String str5) {
        this.title = str;
        this.subtitle = str2;
        this.link = str3;
        this.signUpNum = l11;
        this.startTime = l12;
        this.endTime = l13;
        this.totalAmount = str4;
        this.id = str5;
    }
}
