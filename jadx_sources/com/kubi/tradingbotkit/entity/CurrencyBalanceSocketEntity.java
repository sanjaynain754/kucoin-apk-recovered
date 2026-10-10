package com.kubi.tradingbotkit.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CurrencyBalanceSocketEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u001f\u001a\u00020 J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012¨\u00069"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/CurrencyBalanceSocketEntity;", "Landroid/os/Parcelable;", "available", "Ljava/math/BigDecimal;", "availableChange", FirebaseAnalytics.Param.CURRENCY, "", "hold", "holdChange", "relationContext", "Lcom/kubi/tradingbotkit/entity/RelationContext;", "relationEvent", "relationEventId", "time", "total", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/tradingbotkit/entity/RelationContext;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getAvailable", "()Ljava/math/BigDecimal;", "getAvailableChange", "getCurrency", "()Ljava/lang/String;", "getHold", "getHoldChange", "getRelationContext", "()Lcom/kubi/tradingbotkit/entity/RelationContext;", "getRelationEvent", "getRelationEventId", "getTime", "getTotal", "getAvailableBalance", "cover2CurrencyBalanceEntity", "Lcom/kubi/tradingbotkit/entity/CurrencyBalanceEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CurrencyBalanceSocketEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CurrencyBalanceSocketEntity> CREATOR = new C26213a();

    @Nullable
    private final BigDecimal available;

    @Nullable
    private final BigDecimal availableChange;

    @Nullable
    private final String currency;

    @Nullable
    private final BigDecimal hold;

    @Nullable
    private final BigDecimal holdChange;

    @Nullable
    private final RelationContext relationContext;

    @Nullable
    private final String relationEvent;

    @Nullable
    private final String relationEventId;

    @Nullable
    private final String time;

    @Nullable
    private final BigDecimal total;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.entity.CurrencyBalanceSocketEntity$a */
    /* JADX INFO: compiled from: CurrencyBalanceSocketEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26213a implements Parcelable.Creator<CurrencyBalanceSocketEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalanceSocketEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyBalanceSocketEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : RelationContext.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CurrencyBalanceSocketEntity[] newArray(int i11) {
            return new CurrencyBalanceSocketEntity[i11];
        }
    }

    public CurrencyBalanceSocketEntity() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrencyBalanceSocketEntity)) {
            return false;
        }
        CurrencyBalanceSocketEntity currencyBalanceSocketEntity = (CurrencyBalanceSocketEntity) other;
        return Intrinsics.areEqual(this.available, currencyBalanceSocketEntity.available) && Intrinsics.areEqual(this.availableChange, currencyBalanceSocketEntity.availableChange) && Intrinsics.areEqual(this.currency, currencyBalanceSocketEntity.currency) && Intrinsics.areEqual(this.hold, currencyBalanceSocketEntity.hold) && Intrinsics.areEqual(this.holdChange, currencyBalanceSocketEntity.holdChange) && Intrinsics.areEqual(this.relationContext, currencyBalanceSocketEntity.relationContext) && Intrinsics.areEqual(this.relationEvent, currencyBalanceSocketEntity.relationEvent) && Intrinsics.areEqual(this.relationEventId, currencyBalanceSocketEntity.relationEventId) && Intrinsics.areEqual(this.time, currencyBalanceSocketEntity.time) && Intrinsics.areEqual(this.total, currencyBalanceSocketEntity.total);
    }

    public CurrencyBalanceSocketEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable RelationContext relationContext, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal5) {
        this.available = bigDecimal;
        this.availableChange = bigDecimal2;
        this.currency = str;
        this.hold = bigDecimal3;
        this.holdChange = bigDecimal4;
        this.relationContext = relationContext;
        this.relationEvent = str2;
        this.relationEventId = str3;
        this.time = str4;
        this.total = bigDecimal5;
    }

    public static /* synthetic */ CurrencyBalanceSocketEntity copy$default(CurrencyBalanceSocketEntity currencyBalanceSocketEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, BigDecimal bigDecimal4, RelationContext relationContext, String str2, String str3, String str4, BigDecimal bigDecimal5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = currencyBalanceSocketEntity.available;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = currencyBalanceSocketEntity.availableChange;
        }
        if ((i11 & 4) != 0) {
            str = currencyBalanceSocketEntity.currency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = currencyBalanceSocketEntity.hold;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = currencyBalanceSocketEntity.holdChange;
        }
        if ((i11 & 32) != 0) {
            relationContext = currencyBalanceSocketEntity.relationContext;
        }
        if ((i11 & 64) != 0) {
            str2 = currencyBalanceSocketEntity.relationEvent;
        }
        if ((i11 & 128) != 0) {
            str3 = currencyBalanceSocketEntity.relationEventId;
        }
        if ((i11 & 256) != 0) {
            str4 = currencyBalanceSocketEntity.time;
        }
        if ((i11 & 512) != 0) {
            bigDecimal5 = currencyBalanceSocketEntity.total;
        }
        String str5 = str4;
        BigDecimal bigDecimal6 = bigDecimal5;
        String str6 = str2;
        String str7 = str3;
        BigDecimal bigDecimal7 = bigDecimal4;
        RelationContext relationContext2 = relationContext;
        return currencyBalanceSocketEntity.copy(bigDecimal, bigDecimal2, str, bigDecimal3, bigDecimal7, relationContext2, str6, str7, str5, bigDecimal6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getTotal() {
        return this.total;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAvailableChange() {
        return this.availableChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHoldChange() {
        return this.holdChange;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final RelationContext getRelationContext() {
        return this.relationContext;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRelationEvent() {
        return this.relationEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRelationEventId() {
        return this.relationEventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final CurrencyBalanceSocketEntity copy(@Nullable BigDecimal available, @Nullable BigDecimal availableChange, @Nullable String currency, @Nullable BigDecimal hold, @Nullable BigDecimal holdChange, @Nullable RelationContext relationContext, @Nullable String relationEvent, @Nullable String relationEventId, @Nullable String time, @Nullable BigDecimal total) {
        return new CurrencyBalanceSocketEntity(available, availableChange, currency, hold, holdChange, relationContext, relationEvent, relationEventId, time, total);
    }

    @NotNull
    public final CurrencyBalanceEntity cover2CurrencyBalanceEntity() {
        CurrencyBalanceEntity currencyBalanceEntity = new CurrencyBalanceEntity(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
        currencyBalanceEntity.setTotalBalance(this.total);
        currencyBalanceEntity.setHoldBalance(this.hold);
        currencyBalanceEntity.setCurrency(this.currency);
        return currencyBalanceEntity;
    }

    @Nullable
    public final BigDecimal getAvailable() {
        return this.available;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        BigDecimal bigDecimal = this.total;
        if (bigDecimal != null) {
            return bigDecimal.subtract(this.hold);
        }
        return null;
    }

    @Nullable
    public final BigDecimal getAvailableChange() {
        return this.availableChange;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    public final BigDecimal getHoldChange() {
        return this.holdChange;
    }

    @Nullable
    public final RelationContext getRelationContext() {
        return this.relationContext;
    }

    @Nullable
    public final String getRelationEvent() {
        return this.relationEvent;
    }

    @Nullable
    public final String getRelationEventId() {
        return this.relationEventId;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final BigDecimal getTotal() {
        return this.total;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.available;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.availableChange;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.hold;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.holdChange;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        RelationContext relationContext = this.relationContext;
        int iHashCode6 = (iHashCode5 + (relationContext == null ? 0 : relationContext.hashCode())) * 31;
        String str2 = this.relationEvent;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.relationEventId;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.time;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.total;
        return iHashCode9 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CurrencyBalanceSocketEntity(available=" + this.available + ", availableChange=" + this.availableChange + ", currency=" + this.currency + ", hold=" + this.hold + ", holdChange=" + this.holdChange + ", relationContext=" + this.relationContext + ", relationEvent=" + this.relationEvent + ", relationEventId=" + this.relationEventId + ", time=" + this.time + ", total=" + this.total + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.available);
        dest.writeSerializable(this.availableChange);
        dest.writeString(this.currency);
        dest.writeSerializable(this.hold);
        dest.writeSerializable(this.holdChange);
        RelationContext relationContext = this.relationContext;
        if (relationContext == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            relationContext.writeToParcel(dest, flags);
        }
        dest.writeString(this.relationEvent);
        dest.writeString(this.relationEventId);
        dest.writeString(this.time);
        dest.writeSerializable(this.total);
    }

    public /* synthetic */ CurrencyBalanceSocketEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, BigDecimal bigDecimal3, BigDecimal bigDecimal4, RelationContext relationContext, String str2, String str3, String str4, BigDecimal bigDecimal5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4, (i11 & 32) != 0 ? null : relationContext, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? null : str4, (i11 & 512) != 0 ? null : bigDecimal5);
    }
}
