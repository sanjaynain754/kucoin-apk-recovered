package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jc\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/entity/OptionsAssetPushEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "totalBalance", "Ljava/math/BigDecimal;", "unrealizedProfitAndLossAmount", "unrealizedProfitAndLossRate", "availableBalance", "assetBalance", "positions", "", "Lcom/kubi/assets/entity/OptionsPositionEntity;", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/List;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getUnrealizedProfitAndLossAmount", "setUnrealizedProfitAndLossAmount", "getUnrealizedProfitAndLossRate", "setUnrealizedProfitAndLossRate", "getAvailableBalance", "setAvailableBalance", "getAssetBalance", "setAssetBalance", "getPositions", "()Ljava/util/List;", "setPositions", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OptionsAssetPushEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionsAssetPushEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal assetBalance;

    @Nullable
    private BigDecimal availableBalance;

    @Nullable
    private String currency;

    @Nullable
    private List<OptionsPositionEntity> positions;

    @Nullable
    private BigDecimal totalBalance;

    @Nullable
    private BigDecimal unrealizedProfitAndLossAmount;

    @Nullable
    private BigDecimal unrealizedProfitAndLossRate;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionsAssetPushEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsAssetPushEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(OptionsPositionEntity.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OptionsAssetPushEntity(string, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsAssetPushEntity[] newArray(int i11) {
            return new OptionsAssetPushEntity[i11];
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
        if (!(other instanceof OptionsAssetPushEntity)) {
            return false;
        }
        OptionsAssetPushEntity optionsAssetPushEntity = (OptionsAssetPushEntity) other;
        return Intrinsics.areEqual(this.currency, optionsAssetPushEntity.currency) && Intrinsics.areEqual(this.totalBalance, optionsAssetPushEntity.totalBalance) && Intrinsics.areEqual(this.unrealizedProfitAndLossAmount, optionsAssetPushEntity.unrealizedProfitAndLossAmount) && Intrinsics.areEqual(this.unrealizedProfitAndLossRate, optionsAssetPushEntity.unrealizedProfitAndLossRate) && Intrinsics.areEqual(this.availableBalance, optionsAssetPushEntity.availableBalance) && Intrinsics.areEqual(this.assetBalance, optionsAssetPushEntity.assetBalance) && Intrinsics.areEqual(this.positions, optionsAssetPushEntity.positions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsAssetPushEntity copy$default(OptionsAssetPushEntity optionsAssetPushEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = optionsAssetPushEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = optionsAssetPushEntity.totalBalance;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = optionsAssetPushEntity.unrealizedProfitAndLossAmount;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = optionsAssetPushEntity.unrealizedProfitAndLossRate;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = optionsAssetPushEntity.availableBalance;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = optionsAssetPushEntity.assetBalance;
        }
        if ((i11 & 64) != 0) {
            list = optionsAssetPushEntity.positions;
        }
        BigDecimal bigDecimal6 = bigDecimal5;
        List list2 = list;
        BigDecimal bigDecimal7 = bigDecimal4;
        BigDecimal bigDecimal8 = bigDecimal2;
        return optionsAssetPushEntity.copy(str, bigDecimal, bigDecimal8, bigDecimal3, bigDecimal7, bigDecimal6, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getUnrealizedProfitAndLossAmount() {
        return this.unrealizedProfitAndLossAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getUnrealizedProfitAndLossRate() {
        return this.unrealizedProfitAndLossRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getAssetBalance() {
        return this.assetBalance;
    }

    @Nullable
    public final List<OptionsPositionEntity> component7() {
        return this.positions;
    }

    @NotNull
    public final OptionsAssetPushEntity copy(@Nullable String currency, @Nullable BigDecimal totalBalance, @Nullable BigDecimal unrealizedProfitAndLossAmount, @Nullable BigDecimal unrealizedProfitAndLossRate, @Nullable BigDecimal availableBalance, @Nullable BigDecimal assetBalance, @Nullable List<OptionsPositionEntity> positions) {
        return new OptionsAssetPushEntity(currency, totalBalance, unrealizedProfitAndLossAmount, unrealizedProfitAndLossRate, availableBalance, assetBalance, positions);
    }

    @Nullable
    public final BigDecimal getAssetBalance() {
        return this.assetBalance;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final List<OptionsPositionEntity> getPositions() {
        return this.positions;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getUnrealizedProfitAndLossAmount() {
        return this.unrealizedProfitAndLossAmount;
    }

    @Nullable
    public final BigDecimal getUnrealizedProfitAndLossRate() {
        return this.unrealizedProfitAndLossRate;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.unrealizedProfitAndLossAmount;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.unrealizedProfitAndLossRate;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.availableBalance;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.assetBalance;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        List<OptionsPositionEntity> list = this.positions;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final void setAssetBalance(@Nullable BigDecimal bigDecimal) {
        this.assetBalance = bigDecimal;
    }

    public final void setAvailableBalance(@Nullable BigDecimal bigDecimal) {
        this.availableBalance = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setPositions(@Nullable List<OptionsPositionEntity> list) {
        this.positions = list;
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    public final void setUnrealizedProfitAndLossAmount(@Nullable BigDecimal bigDecimal) {
        this.unrealizedProfitAndLossAmount = bigDecimal;
    }

    public final void setUnrealizedProfitAndLossRate(@Nullable BigDecimal bigDecimal) {
        this.unrealizedProfitAndLossRate = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "OptionsAssetPushEntity(currency=" + this.currency + ", totalBalance=" + this.totalBalance + ", unrealizedProfitAndLossAmount=" + this.unrealizedProfitAndLossAmount + ", unrealizedProfitAndLossRate=" + this.unrealizedProfitAndLossRate + ", availableBalance=" + this.availableBalance + ", assetBalance=" + this.assetBalance + ", positions=" + this.positions + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.unrealizedProfitAndLossAmount);
        dest.writeSerializable(this.unrealizedProfitAndLossRate);
        dest.writeSerializable(this.availableBalance);
        dest.writeSerializable(this.assetBalance);
        List<OptionsPositionEntity> list = this.positions;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<OptionsPositionEntity> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public OptionsAssetPushEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable List<OptionsPositionEntity> list) {
        this.currency = str;
        this.totalBalance = bigDecimal;
        this.unrealizedProfitAndLossAmount = bigDecimal2;
        this.unrealizedProfitAndLossRate = bigDecimal3;
        this.availableBalance = bigDecimal4;
        this.assetBalance = bigDecimal5;
        this.positions = list;
    }
}
