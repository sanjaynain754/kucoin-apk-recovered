package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SymbolPreviewEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010!\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u001aJ\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0086\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010-J\u0006\u0010.\u001a\u00020\u0006J\u0013\u0010/\u001a\u00020\u00032\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u000bHÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u000e\u0010\u0013R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u000f\u0010\u0013¨\u00069"}, m90084d2 = {"Lcom/kubi/data/entity/SymbolPreviewEntity;", "Landroid/os/Parcelable;", "previewEnableShow", "", "tradeEnableShow", "previewRemainSecond", "", "previewTime", "", "openingTime", "intro", "", "enableTrading", "currencyName", "isEnableAuctionTrade", "isAuctionEnabled", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPreviewEnableShow", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTradeEnableShow", "getPreviewRemainSecond", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPreviewTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOpeningTime", "getIntro", "()Ljava/lang/String;", "getEnableTrading", "getCurrencyName", "getCountDownTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/data/entity/SymbolPreviewEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolPreviewEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SymbolPreviewEntity> CREATOR = new Creator();

    @Nullable
    private final String currencyName;

    @Nullable
    private final Boolean enableTrading;

    @Nullable
    private final String intro;

    @Nullable
    private final Boolean isAuctionEnabled;

    @Nullable
    private final Boolean isEnableAuctionTrade;

    @Nullable
    private final Long openingTime;

    @Nullable
    private final Boolean previewEnableShow;

    @Nullable
    private final Integer previewRemainSecond;

    @Nullable
    private final Long previewTime;

    @Nullable
    private final Boolean tradeEnableShow;

    /* JADX INFO: compiled from: SymbolPreviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<SymbolPreviewEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SymbolPreviewEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf5 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Boolean bool = boolValueOf2;
            Long l11 = lValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SymbolPreviewEntity(boolValueOf, bool, numValueOf, l11, lValueOf2, string, boolValueOf3, string2, boolValueOf4, boolValueOf5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SymbolPreviewEntity[] newArray(int i11) {
            return new SymbolPreviewEntity[i11];
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
        if (!(other instanceof SymbolPreviewEntity)) {
            return false;
        }
        SymbolPreviewEntity symbolPreviewEntity = (SymbolPreviewEntity) other;
        return Intrinsics.areEqual(this.previewEnableShow, symbolPreviewEntity.previewEnableShow) && Intrinsics.areEqual(this.tradeEnableShow, symbolPreviewEntity.tradeEnableShow) && Intrinsics.areEqual(this.previewRemainSecond, symbolPreviewEntity.previewRemainSecond) && Intrinsics.areEqual(this.previewTime, symbolPreviewEntity.previewTime) && Intrinsics.areEqual(this.openingTime, symbolPreviewEntity.openingTime) && Intrinsics.areEqual(this.intro, symbolPreviewEntity.intro) && Intrinsics.areEqual(this.enableTrading, symbolPreviewEntity.enableTrading) && Intrinsics.areEqual(this.currencyName, symbolPreviewEntity.currencyName) && Intrinsics.areEqual(this.isEnableAuctionTrade, symbolPreviewEntity.isEnableAuctionTrade) && Intrinsics.areEqual(this.isAuctionEnabled, symbolPreviewEntity.isAuctionEnabled);
    }

    public static /* synthetic */ SymbolPreviewEntity copy$default(SymbolPreviewEntity symbolPreviewEntity, Boolean bool, Boolean bool2, Integer num, Long l11, Long l12, String str, Boolean bool3, String str2, Boolean bool4, Boolean bool5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = symbolPreviewEntity.previewEnableShow;
        }
        if ((i11 & 2) != 0) {
            bool2 = symbolPreviewEntity.tradeEnableShow;
        }
        if ((i11 & 4) != 0) {
            num = symbolPreviewEntity.previewRemainSecond;
        }
        if ((i11 & 8) != 0) {
            l11 = symbolPreviewEntity.previewTime;
        }
        if ((i11 & 16) != 0) {
            l12 = symbolPreviewEntity.openingTime;
        }
        if ((i11 & 32) != 0) {
            str = symbolPreviewEntity.intro;
        }
        if ((i11 & 64) != 0) {
            bool3 = symbolPreviewEntity.enableTrading;
        }
        if ((i11 & 128) != 0) {
            str2 = symbolPreviewEntity.currencyName;
        }
        if ((i11 & 256) != 0) {
            bool4 = symbolPreviewEntity.isEnableAuctionTrade;
        }
        if ((i11 & 512) != 0) {
            bool5 = symbolPreviewEntity.isAuctionEnabled;
        }
        Boolean bool6 = bool4;
        Boolean bool7 = bool5;
        Boolean bool8 = bool3;
        String str3 = str2;
        Long l13 = l12;
        String str4 = str;
        return symbolPreviewEntity.copy(bool, bool2, num, l11, l13, str4, bool8, str3, bool6, bool7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPreviewEnableShow() {
        return this.previewEnableShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getIsAuctionEnabled() {
        return this.isAuctionEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getTradeEnableShow() {
        return this.tradeEnableShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getPreviewRemainSecond() {
        return this.previewRemainSecond;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getPreviewTime() {
        return this.previewTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIntro() {
        return this.intro;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getEnableTrading() {
        return this.enableTrading;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @NotNull
    public final SymbolPreviewEntity copy(@Nullable Boolean previewEnableShow, @Nullable Boolean tradeEnableShow, @Nullable Integer previewRemainSecond, @Nullable Long previewTime, @Nullable Long openingTime, @Nullable String intro, @Nullable Boolean enableTrading, @Nullable String currencyName, @Nullable Boolean isEnableAuctionTrade, @Nullable Boolean isAuctionEnabled) {
        return new SymbolPreviewEntity(previewEnableShow, tradeEnableShow, previewRemainSecond, previewTime, openingTime, intro, enableTrading, currencyName, isEnableAuctionTrade, isAuctionEnabled);
    }

    @Nullable
    public final Long getCountDownTime() {
        return this.previewTime;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final Boolean getEnableTrading() {
        return this.enableTrading;
    }

    @Nullable
    public final String getIntro() {
        return this.intro;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Boolean getPreviewEnableShow() {
        return this.previewEnableShow;
    }

    @Nullable
    public final Integer getPreviewRemainSecond() {
        return this.previewRemainSecond;
    }

    @Nullable
    public final Long getPreviewTime() {
        return this.previewTime;
    }

    @Nullable
    public final Boolean getTradeEnableShow() {
        return this.tradeEnableShow;
    }

    public int hashCode() {
        Boolean bool = this.previewEnableShow;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.tradeEnableShow;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.previewRemainSecond;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.previewTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.openingTime;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.intro;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.enableTrading;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.currencyName;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.isEnableAuctionTrade;
        int iHashCode9 = (iHashCode8 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isAuctionEnabled;
        return iHashCode9 + (bool5 != null ? bool5.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAuctionEnabled() {
        return this.isAuctionEnabled;
    }

    @Nullable
    public final Boolean isEnableAuctionTrade() {
        return this.isEnableAuctionTrade;
    }

    @NotNull
    public String toString() {
        return "SymbolPreviewEntity(previewEnableShow=" + this.previewEnableShow + ", tradeEnableShow=" + this.tradeEnableShow + ", previewRemainSecond=" + this.previewRemainSecond + ", previewTime=" + this.previewTime + ", openingTime=" + this.openingTime + ", intro=" + this.intro + ", enableTrading=" + this.enableTrading + ", currencyName=" + this.currencyName + ", isEnableAuctionTrade=" + this.isEnableAuctionTrade + ", isAuctionEnabled=" + this.isAuctionEnabled + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.previewEnableShow;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.tradeEnableShow;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Integer num = this.previewRemainSecond;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l11 = this.previewTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.openingTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.intro);
        Boolean bool3 = this.enableTrading;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.currencyName);
        Boolean bool4 = this.isEnableAuctionTrade;
        if (bool4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        Boolean bool5 = this.isAuctionEnabled;
        if (bool5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool5.booleanValue() ? 1 : 0);
        }
    }

    public SymbolPreviewEntity(@Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Long l11, @Nullable Long l12, @Nullable String str, @Nullable Boolean bool3, @Nullable String str2, @Nullable Boolean bool4, @Nullable Boolean bool5) {
        this.previewEnableShow = bool;
        this.tradeEnableShow = bool2;
        this.previewRemainSecond = num;
        this.previewTime = l11;
        this.openingTime = l12;
        this.intro = str;
        this.enableTrading = bool3;
        this.currencyName = str2;
        this.isEnableAuctionTrade = bool4;
        this.isAuctionEnabled = bool5;
    }
}
