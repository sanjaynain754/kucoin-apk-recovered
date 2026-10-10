package com.kubi.kumex.data.welfare;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AirdropBonusEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u000eHÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001f\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00068"}, m90084d2 = {"Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "Landroid/os/Parcelable;", "symbol", "", "marginMode", "leverage", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "priceChgPct", "trialAmount", "expireTime", "", "contractIcon", "klineData", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V", "getSymbol", "()Ljava/lang/String;", "getMarginMode", "getLeverage", "()Ljava/math/BigDecimal;", "getPrice", "getPriceChgPct", "getTrialAmount", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContractIcon", "getKlineData", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)Lcom/kubi/kumex/data/welfare/AirdropBonusEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AirdropBonusEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AirdropBonusEntity> CREATOR = new C15843a();

    @Nullable
    private final String contractIcon;

    @Nullable
    private final Long expireTime;

    @Nullable
    private final List<List<Double>> klineData;

    @Nullable
    private final BigDecimal leverage;

    @Nullable
    private final String marginMode;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final BigDecimal priceChgPct;

    @Nullable
    private final String symbol;

    @Nullable
    private final BigDecimal trialAmount;

    /* JADX INFO: renamed from: com.kubi.kumex.data.welfare.AirdropBonusEntity$a */
    /* JADX INFO: compiled from: AirdropBonusEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15843a implements Parcelable.Creator<AirdropBonusEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AirdropBonusEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    int i13 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList2.add(Double.valueOf(parcel.readDouble()));
                    }
                    arrayList.add(arrayList2);
                }
            }
            return new AirdropBonusEntity(string, string2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, lValueOf, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AirdropBonusEntity[] newArray(int i11) {
            return new AirdropBonusEntity[i11];
        }
    }

    public AirdropBonusEntity() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AirdropBonusEntity)) {
            return false;
        }
        AirdropBonusEntity airdropBonusEntity = (AirdropBonusEntity) other;
        return Intrinsics.areEqual(this.symbol, airdropBonusEntity.symbol) && Intrinsics.areEqual(this.marginMode, airdropBonusEntity.marginMode) && Intrinsics.areEqual(this.leverage, airdropBonusEntity.leverage) && Intrinsics.areEqual(this.price, airdropBonusEntity.price) && Intrinsics.areEqual(this.priceChgPct, airdropBonusEntity.priceChgPct) && Intrinsics.areEqual(this.trialAmount, airdropBonusEntity.trialAmount) && Intrinsics.areEqual(this.expireTime, airdropBonusEntity.expireTime) && Intrinsics.areEqual(this.contractIcon, airdropBonusEntity.contractIcon) && Intrinsics.areEqual(this.klineData, airdropBonusEntity.klineData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AirdropBonusEntity(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable Long l11, @Nullable String str3, @Nullable List<? extends List<Double>> list) {
        this.symbol = str;
        this.marginMode = str2;
        this.leverage = bigDecimal;
        this.price = bigDecimal2;
        this.priceChgPct = bigDecimal3;
        this.trialAmount = bigDecimal4;
        this.expireTime = l11;
        this.contractIcon = str3;
        this.klineData = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AirdropBonusEntity copy$default(AirdropBonusEntity airdropBonusEntity, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l11, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = airdropBonusEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = airdropBonusEntity.marginMode;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = airdropBonusEntity.leverage;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = airdropBonusEntity.price;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = airdropBonusEntity.priceChgPct;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = airdropBonusEntity.trialAmount;
        }
        if ((i11 & 64) != 0) {
            l11 = airdropBonusEntity.expireTime;
        }
        if ((i11 & 128) != 0) {
            str3 = airdropBonusEntity.contractIcon;
        }
        if ((i11 & 256) != 0) {
            list = airdropBonusEntity.klineData;
        }
        String str4 = str3;
        List list2 = list;
        BigDecimal bigDecimal5 = bigDecimal4;
        Long l12 = l11;
        BigDecimal bigDecimal6 = bigDecimal3;
        BigDecimal bigDecimal7 = bigDecimal;
        return airdropBonusEntity.copy(str, str2, bigDecimal7, bigDecimal2, bigDecimal6, bigDecimal5, l12, str4, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getTrialAmount() {
        return this.trialAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getContractIcon() {
        return this.contractIcon;
    }

    @Nullable
    public final List<List<Double>> component9() {
        return this.klineData;
    }

    @NotNull
    public final AirdropBonusEntity copy(@Nullable String symbol, @Nullable String marginMode, @Nullable BigDecimal leverage, @Nullable BigDecimal price, @Nullable BigDecimal priceChgPct, @Nullable BigDecimal trialAmount, @Nullable Long expireTime, @Nullable String contractIcon, @Nullable List<? extends List<Double>> klineData) {
        return new AirdropBonusEntity(symbol, marginMode, leverage, price, priceChgPct, trialAmount, expireTime, contractIcon, klineData);
    }

    @Nullable
    public final String getContractIcon() {
        return this.contractIcon;
    }

    @Nullable
    public final Long getExpireTime() {
        return this.expireTime;
    }

    @Nullable
    public final List<List<Double>> getKlineData() {
        return this.klineData;
    }

    @Nullable
    public final BigDecimal getLeverage() {
        return this.leverage;
    }

    @Nullable
    public final String getMarginMode() {
        return this.marginMode;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final BigDecimal getPriceChgPct() {
        return this.priceChgPct;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTrialAmount() {
        return this.trialAmount;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marginMode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.leverage;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.priceChgPct;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.trialAmount;
        int iHashCode6 = (iHashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        Long l11 = this.expireTime;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.contractIcon;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<List<Double>> list = this.klineData;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AirdropBonusEntity(symbol=" + this.symbol + ", marginMode=" + this.marginMode + ", leverage=" + this.leverage + ", price=" + this.price + ", priceChgPct=" + this.priceChgPct + ", trialAmount=" + this.trialAmount + ", expireTime=" + this.expireTime + ", contractIcon=" + this.contractIcon + ", klineData=" + this.klineData + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.marginMode);
        dest.writeSerializable(this.leverage);
        dest.writeSerializable(this.price);
        dest.writeSerializable(this.priceChgPct);
        dest.writeSerializable(this.trialAmount);
        Long l11 = this.expireTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.contractIcon);
        List<List<Double>> list = this.klineData;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        for (List<Double> list2 : list) {
            dest.writeInt(list2.size());
            Iterator<Double> it = list2.iterator();
            while (it.hasNext()) {
                dest.writeDouble(it.next().doubleValue());
            }
        }
    }

    public /* synthetic */ AirdropBonusEntity(String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, Long l11, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? null : bigDecimal2, (i11 & 16) != 0 ? null : bigDecimal3, (i11 & 32) != 0 ? null : bigDecimal4, (i11 & 64) != 0 ? null : l11, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : list);
    }
}
