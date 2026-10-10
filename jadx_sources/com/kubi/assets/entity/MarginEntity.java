package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.margin.api.entity.IsolateMarginPosition;
import com.kubi.margin.api.entity.LeverBalance;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJb\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, m90084d2 = {"Lcom/kubi/assets/entity/MarginEntity;", "Landroid/os/Parcelable;", "liabilityRate", "Ljava/math/BigDecimal;", "status", "", "totalBalance", "totalLiability", "marginIsolated", "Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "loan", "Lcom/kubi/margin/api/entity/LeverBalance;", "execute", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/margin/api/entity/IsolateMarginPosition;Lcom/kubi/margin/api/entity/LeverBalance;Ljava/lang/Boolean;)V", "getLiabilityRate", "()Ljava/math/BigDecimal;", "setLiabilityRate", "(Ljava/math/BigDecimal;)V", "getStatus", "()Ljava/lang/String;", "getTotalBalance", "getTotalLiability", "getMarginIsolated", "()Lcom/kubi/margin/api/entity/IsolateMarginPosition;", "getLoan", "()Lcom/kubi/margin/api/entity/LeverBalance;", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTotalBalanceIfExecuted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/margin/api/entity/IsolateMarginPosition;Lcom/kubi/margin/api/entity/LeverBalance;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/MarginEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAssetv2OverviewEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Assetv2OverviewEntity.kt\ncom/kubi/assets/entity/MarginEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1#2:245\n*E\n"})
public final /* data */ class MarginEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginEntity> CREATOR = new Creator();

    @Nullable
    private final Boolean execute;

    @Nullable
    private BigDecimal liabilityRate;

    @Nullable
    private final LeverBalance loan;

    @Nullable
    private final IsolateMarginPosition marginIsolated;

    @Nullable
    private final String status;

    @Nullable
    private final BigDecimal totalBalance;

    @Nullable
    private final BigDecimal totalLiability;

    /* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            IsolateMarginPosition isolateMarginPosition = (IsolateMarginPosition) parcel.readParcelable(MarginEntity.class.getClassLoader());
            LeverBalance leverBalance = (LeverBalance) parcel.readParcelable(MarginEntity.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MarginEntity(bigDecimal, string, bigDecimal2, bigDecimal3, isolateMarginPosition, leverBalance, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginEntity[] newArray(int i11) {
            return new MarginEntity[i11];
        }
    }

    public MarginEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable IsolateMarginPosition isolateMarginPosition, @Nullable LeverBalance leverBalance, @Nullable Boolean bool) {
        this.liabilityRate = bigDecimal;
        this.status = str;
        this.totalBalance = bigDecimal2;
        this.totalLiability = bigDecimal3;
        this.marginIsolated = isolateMarginPosition;
        this.loan = leverBalance;
        this.execute = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginEntity)) {
            return false;
        }
        MarginEntity marginEntity = (MarginEntity) other;
        return Intrinsics.areEqual(this.liabilityRate, marginEntity.liabilityRate) && Intrinsics.areEqual(this.status, marginEntity.status) && Intrinsics.areEqual(this.totalBalance, marginEntity.totalBalance) && Intrinsics.areEqual(this.totalLiability, marginEntity.totalLiability) && Intrinsics.areEqual(this.marginIsolated, marginEntity.marginIsolated) && Intrinsics.areEqual(this.loan, marginEntity.loan) && Intrinsics.areEqual(this.execute, marginEntity.execute);
    }

    public static /* synthetic */ MarginEntity copy$default(MarginEntity marginEntity, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, IsolateMarginPosition isolateMarginPosition, LeverBalance leverBalance, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = marginEntity.liabilityRate;
        }
        if ((i11 & 2) != 0) {
            str = marginEntity.status;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = marginEntity.totalBalance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = marginEntity.totalLiability;
        }
        if ((i11 & 16) != 0) {
            isolateMarginPosition = marginEntity.marginIsolated;
        }
        if ((i11 & 32) != 0) {
            leverBalance = marginEntity.loan;
        }
        if ((i11 & 64) != 0) {
            bool = marginEntity.execute;
        }
        LeverBalance leverBalance2 = leverBalance;
        Boolean bool2 = bool;
        IsolateMarginPosition isolateMarginPosition2 = isolateMarginPosition;
        BigDecimal bigDecimal4 = bigDecimal2;
        return marginEntity.copy(bigDecimal, str, bigDecimal4, bigDecimal3, isolateMarginPosition2, leverBalance2, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final IsolateMarginPosition getMarginIsolated() {
        return this.marginIsolated;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LeverBalance getLoan() {
        return this.loan;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final MarginEntity copy(@Nullable BigDecimal liabilityRate, @Nullable String status, @Nullable BigDecimal totalBalance, @Nullable BigDecimal totalLiability, @Nullable IsolateMarginPosition marginIsolated, @Nullable LeverBalance loan, @Nullable Boolean execute) {
        return new MarginEntity(liabilityRate, status, totalBalance, totalLiability, marginIsolated, loan, execute);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final LeverBalance getLoan() {
        return this.loan;
    }

    @Nullable
    public final IsolateMarginPosition getMarginIsolated() {
        return this.marginIsolated;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalanceIfExecuted() {
        BigDecimal bigDecimal = this.totalBalance;
        if (Intrinsics.areEqual(this.execute, Boolean.FALSE)) {
            return null;
        }
        return bigDecimal;
    }

    @Nullable
    public final BigDecimal getTotalLiability() {
        return this.totalLiability;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.liabilityRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.status;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalLiability;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        IsolateMarginPosition isolateMarginPosition = this.marginIsolated;
        int iHashCode5 = (iHashCode4 + (isolateMarginPosition == null ? 0 : isolateMarginPosition.hashCode())) * 31;
        LeverBalance leverBalance = this.loan;
        int iHashCode6 = (iHashCode5 + (leverBalance == null ? 0 : leverBalance.hashCode())) * 31;
        Boolean bool = this.execute;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setLiabilityRate(@Nullable BigDecimal bigDecimal) {
        this.liabilityRate = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "MarginEntity(liabilityRate=" + this.liabilityRate + ", status=" + this.status + ", totalBalance=" + this.totalBalance + ", totalLiability=" + this.totalLiability + ", marginIsolated=" + this.marginIsolated + ", loan=" + this.loan + ", execute=" + this.execute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.liabilityRate);
        dest.writeString(this.status);
        dest.writeSerializable(this.totalBalance);
        dest.writeSerializable(this.totalLiability);
        dest.writeParcelable(this.marginIsolated, flags);
        dest.writeParcelable(this.loan, flags);
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ MarginEntity(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3, IsolateMarginPosition isolateMarginPosition, LeverBalance leverBalance, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, str, bigDecimal2, bigDecimal3, isolateMarginPosition, leverBalance, (i11 & 64) != 0 ? Boolean.TRUE : bool);
    }
}
