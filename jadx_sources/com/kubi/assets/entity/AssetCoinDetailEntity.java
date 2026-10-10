package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "Landroid/os/Parcelable;", "distributionItems", "", "Lcom/kubi/assets/entity/CurrencyDistributionItemResponse;", "spotTradingInfo", "Lcom/kubi/assets/entity/CurrencySpotTradingInfoResponse;", "overallCostInfo", "Lcom/kubi/assets/entity/CurrencyOverallCostInfoResponse;", "<init>", "(Ljava/util/List;Lcom/kubi/assets/entity/CurrencySpotTradingInfoResponse;Lcom/kubi/assets/entity/CurrencyOverallCostInfoResponse;)V", "getDistributionItems", "()Ljava/util/List;", "getSpotTradingInfo", "()Lcom/kubi/assets/entity/CurrencySpotTradingInfoResponse;", "getOverallCostInfo", "()Lcom/kubi/assets/entity/CurrencyOverallCostInfoResponse;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetCoinDetailEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetCoinDetailEntity> CREATOR = new Creator();

    @Nullable
    private final List<CurrencyDistributionItemResponse> distributionItems;

    @Nullable
    private final CurrencyOverallCostInfoResponse overallCostInfo;

    @Nullable
    private final CurrencySpotTradingInfoResponse spotTradingInfo;

    /* JADX INFO: compiled from: AssetCoinDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetCoinDetailEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetCoinDetailEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(CurrencyDistributionItemResponse.CREATOR.createFromParcel(parcel));
                }
            }
            return new AssetCoinDetailEntity(arrayList, parcel.readInt() == 0 ? null : CurrencySpotTradingInfoResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CurrencyOverallCostInfoResponse.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetCoinDetailEntity[] newArray(int i11) {
            return new AssetCoinDetailEntity[i11];
        }
    }

    public AssetCoinDetailEntity() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetCoinDetailEntity)) {
            return false;
        }
        AssetCoinDetailEntity assetCoinDetailEntity = (AssetCoinDetailEntity) other;
        return Intrinsics.areEqual(this.distributionItems, assetCoinDetailEntity.distributionItems) && Intrinsics.areEqual(this.spotTradingInfo, assetCoinDetailEntity.spotTradingInfo) && Intrinsics.areEqual(this.overallCostInfo, assetCoinDetailEntity.overallCostInfo);
    }

    public AssetCoinDetailEntity(@Nullable List<CurrencyDistributionItemResponse> list, @Nullable CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse, @Nullable CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse) {
        this.distributionItems = list;
        this.spotTradingInfo = currencySpotTradingInfoResponse;
        this.overallCostInfo = currencyOverallCostInfoResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetCoinDetailEntity copy$default(AssetCoinDetailEntity assetCoinDetailEntity, List list, CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse, CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = assetCoinDetailEntity.distributionItems;
        }
        if ((i11 & 2) != 0) {
            currencySpotTradingInfoResponse = assetCoinDetailEntity.spotTradingInfo;
        }
        if ((i11 & 4) != 0) {
            currencyOverallCostInfoResponse = assetCoinDetailEntity.overallCostInfo;
        }
        return assetCoinDetailEntity.copy(list, currencySpotTradingInfoResponse, currencyOverallCostInfoResponse);
    }

    @Nullable
    public final List<CurrencyDistributionItemResponse> component1() {
        return this.distributionItems;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CurrencySpotTradingInfoResponse getSpotTradingInfo() {
        return this.spotTradingInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CurrencyOverallCostInfoResponse getOverallCostInfo() {
        return this.overallCostInfo;
    }

    @NotNull
    public final AssetCoinDetailEntity copy(@Nullable List<CurrencyDistributionItemResponse> distributionItems, @Nullable CurrencySpotTradingInfoResponse spotTradingInfo, @Nullable CurrencyOverallCostInfoResponse overallCostInfo) {
        return new AssetCoinDetailEntity(distributionItems, spotTradingInfo, overallCostInfo);
    }

    @Nullable
    public final List<CurrencyDistributionItemResponse> getDistributionItems() {
        return this.distributionItems;
    }

    @Nullable
    public final CurrencyOverallCostInfoResponse getOverallCostInfo() {
        return this.overallCostInfo;
    }

    @Nullable
    public final CurrencySpotTradingInfoResponse getSpotTradingInfo() {
        return this.spotTradingInfo;
    }

    public int hashCode() {
        List<CurrencyDistributionItemResponse> list = this.distributionItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse = this.spotTradingInfo;
        int iHashCode2 = (iHashCode + (currencySpotTradingInfoResponse == null ? 0 : currencySpotTradingInfoResponse.hashCode())) * 31;
        CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse = this.overallCostInfo;
        return iHashCode2 + (currencyOverallCostInfoResponse != null ? currencyOverallCostInfoResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AssetCoinDetailEntity(distributionItems=" + this.distributionItems + ", spotTradingInfo=" + this.spotTradingInfo + ", overallCostInfo=" + this.overallCostInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CurrencyDistributionItemResponse> list = this.distributionItems;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CurrencyDistributionItemResponse> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse = this.spotTradingInfo;
        if (currencySpotTradingInfoResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currencySpotTradingInfoResponse.writeToParcel(dest, flags);
        }
        CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse = this.overallCostInfo;
        if (currencyOverallCostInfoResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            currencyOverallCostInfoResponse.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ AssetCoinDetailEntity(List list, CurrencySpotTradingInfoResponse currencySpotTradingInfoResponse, CurrencyOverallCostInfoResponse currencyOverallCostInfoResponse, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : currencySpotTradingInfoResponse, (i11 & 4) != 0 ? null : currencyOverallCostInfoResponse);
    }
}
