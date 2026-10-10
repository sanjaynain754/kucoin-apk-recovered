package com.kubi.home.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.user.protocol.entity.SignTermItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecommendNewCoinEntity.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010+\u001a\u0004\u0018\u00010\u0000J\u0017\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0002\u0010/J\u0006\u00100\u001a\u00020-J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÈ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010AJ\u0006\u0010B\u001a\u00020CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020CHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001J\u0016\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020CR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010$R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006O"}, m90084d2 = {"Lcom/kubi/home/entity/RecommendNewCoinEntity;", "Landroid/os/Parcelable;", "recommendedId", "", FirebaseAnalytics.Param.CURRENCY, "fullName", "highlights", "", "iconUrl", SignTermItem.LINK, "name", "openDay", "", "openingPrice", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "symbol", "type", "changeRate", "activityContent", "activityLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)V", "getRecommendedId", "()Ljava/lang/String;", "getCurrency", "getFullName", "getHighlights", "()Ljava/util/List;", "getIconUrl", "getLink", "getName", "getOpenDay", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpeningPrice", "()Ljava/math/BigDecimal;", "getPrice", "getSymbol", "getType", "getChangeRate", "getActivityContent", "getActivityLink", "filtered", "changeRateSinceList", "", "lastDealPrice", "(Ljava/lang/Double;)D", "changeRate24h", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/home/entity/RecommendNewCoinEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RecommendNewCoinEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecommendNewCoinEntity> CREATOR = new C14556a();

    @Nullable
    private final String activityContent;

    @Nullable
    private final String activityLink;

    @Nullable
    private final BigDecimal changeRate;

    @Nullable
    private final String currency;

    @Nullable
    private final String fullName;

    @Nullable
    private final List<String> highlights;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String link;

    @Nullable
    private final String name;

    @Nullable
    private final Long openDay;

    @Nullable
    private final BigDecimal openingPrice;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final String recommendedId;

    @Nullable
    private final String symbol;

    @Nullable
    private final String type;

    /* JADX INFO: renamed from: com.kubi.home.entity.RecommendNewCoinEntity$a */
    /* JADX INFO: compiled from: RecommendNewCoinEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C14556a implements Parcelable.Creator<RecommendNewCoinEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecommendNewCoinEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecommendNewCoinEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecommendNewCoinEntity[] newArray(int i11) {
            return new RecommendNewCoinEntity[i11];
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
        if (!(other instanceof RecommendNewCoinEntity)) {
            return false;
        }
        RecommendNewCoinEntity recommendNewCoinEntity = (RecommendNewCoinEntity) other;
        return Intrinsics.areEqual(this.recommendedId, recommendNewCoinEntity.recommendedId) && Intrinsics.areEqual(this.currency, recommendNewCoinEntity.currency) && Intrinsics.areEqual(this.fullName, recommendNewCoinEntity.fullName) && Intrinsics.areEqual(this.highlights, recommendNewCoinEntity.highlights) && Intrinsics.areEqual(this.iconUrl, recommendNewCoinEntity.iconUrl) && Intrinsics.areEqual(this.link, recommendNewCoinEntity.link) && Intrinsics.areEqual(this.name, recommendNewCoinEntity.name) && Intrinsics.areEqual(this.openDay, recommendNewCoinEntity.openDay) && Intrinsics.areEqual(this.openingPrice, recommendNewCoinEntity.openingPrice) && Intrinsics.areEqual(this.price, recommendNewCoinEntity.price) && Intrinsics.areEqual(this.symbol, recommendNewCoinEntity.symbol) && Intrinsics.areEqual(this.type, recommendNewCoinEntity.type) && Intrinsics.areEqual(this.changeRate, recommendNewCoinEntity.changeRate) && Intrinsics.areEqual(this.activityContent, recommendNewCoinEntity.activityContent) && Intrinsics.areEqual(this.activityLink, recommendNewCoinEntity.activityLink);
    }

    public static /* synthetic */ double changeRateSinceList$default(RecommendNewCoinEntity recommendNewCoinEntity, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = null;
        }
        return recommendNewCoinEntity.changeRateSinceList(d11);
    }

    public final double changeRate24h() {
        BigDecimal bigDecimal = this.changeRate;
        if (bigDecimal != null) {
            return bigDecimal.doubleValue();
        }
        return 0.0d;
    }

    public final double changeRateSinceList(@Nullable Double lastDealPrice) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2 = lastDealPrice != null ? new BigDecimal(String.valueOf(lastDealPrice.doubleValue())) : this.price;
        if (bigDecimal2 == null || (bigDecimal = this.openingPrice) == null || bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return 0.0d;
        }
        return bigDecimal2.subtract(this.openingPrice).divide(this.openingPrice, RoundingMode.HALF_UP).doubleValue();
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecommendedId() {
        return this.recommendedId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getActivityContent() {
        return this.activityContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getActivityLink() {
        return this.activityLink;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final List<String> component4() {
        return this.highlights;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getOpenDay() {
        return this.openDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getOpeningPrice() {
        return this.openingPrice;
    }

    @NotNull
    public final RecommendNewCoinEntity copy(@Nullable String recommendedId, @Nullable String currency, @Nullable String fullName, @Nullable List<String> highlights, @Nullable String iconUrl, @Nullable String link, @Nullable String name, @Nullable Long openDay, @Nullable BigDecimal openingPrice, @Nullable BigDecimal price, @Nullable String symbol, @Nullable String type, @Nullable BigDecimal changeRate, @Nullable String activityContent, @Nullable String activityLink) {
        return new RecommendNewCoinEntity(recommendedId, currency, fullName, highlights, iconUrl, link, name, openDay, openingPrice, price, symbol, type, changeRate, activityContent, activityLink);
    }

    @Nullable
    public final RecommendNewCoinEntity filtered() {
        if (Intrinsics.areEqual(this.type, "PREVIEW") || Intrinsics.areEqual(this.type, "OPEN") || Intrinsics.areEqual(this.type, "HOT_CURRENCY")) {
            return this;
        }
        return null;
    }

    @Nullable
    public final String getActivityContent() {
        return this.activityContent;
    }

    @Nullable
    public final String getActivityLink() {
        return this.activityLink;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final List<String> getHighlights() {
        return this.highlights;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Long getOpenDay() {
        return this.openDay;
    }

    @Nullable
    public final BigDecimal getOpeningPrice() {
        return this.openingPrice;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getRecommendedId() {
        return this.recommendedId;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.recommendedId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.highlights;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.link;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.openDay;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.openingPrice;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode10 = (iHashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str7 = this.symbol;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.changeRate;
        int iHashCode13 = (iHashCode12 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str9 = this.activityContent;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.activityLink;
        return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RecommendNewCoinEntity(recommendedId=" + this.recommendedId + ", currency=" + this.currency + ", fullName=" + this.fullName + ", highlights=" + this.highlights + ", iconUrl=" + this.iconUrl + ", link=" + this.link + ", name=" + this.name + ", openDay=" + this.openDay + ", openingPrice=" + this.openingPrice + ", price=" + this.price + ", symbol=" + this.symbol + ", type=" + this.type + ", changeRate=" + this.changeRate + ", activityContent=" + this.activityContent + ", activityLink=" + this.activityLink + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.recommendedId);
        dest.writeString(this.currency);
        dest.writeString(this.fullName);
        dest.writeStringList(this.highlights);
        dest.writeString(this.iconUrl);
        dest.writeString(this.link);
        dest.writeString(this.name);
        Long l11 = this.openDay;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.openingPrice);
        dest.writeSerializable(this.price);
        dest.writeString(this.symbol);
        dest.writeString(this.type);
        dest.writeSerializable(this.changeRate);
        dest.writeString(this.activityContent);
        dest.writeString(this.activityLink);
    }

    public RecommendNewCoinEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str7, @Nullable String str8, @Nullable BigDecimal bigDecimal3, @Nullable String str9, @Nullable String str10) {
        this.recommendedId = str;
        this.currency = str2;
        this.fullName = str3;
        this.highlights = list;
        this.iconUrl = str4;
        this.link = str5;
        this.name = str6;
        this.openDay = l11;
        this.openingPrice = bigDecimal;
        this.price = bigDecimal2;
        this.symbol = str7;
        this.type = str8;
        this.changeRate = bigDecimal3;
        this.activityContent = str9;
        this.activityLink = str10;
    }
}
