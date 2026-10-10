package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RollbackEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00060"}, m90084d2 = {"Lcom/kubi/assets/entity/RollbackEntity;", "Landroid/os/Parcelable;", "id", "", "depositId", "walletTxId", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "amount", "arrears", "disposalSteps", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getDepositId", "getWalletTxId", "getCreatedAt", "()J", "getCurrency", "getAmount", "getArrears", "getDisposalSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RollbackEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RollbackEntity> CREATOR = new Creator();

    @NotNull
    private final String amount;

    @Nullable
    private final String arrears;
    private final long createdAt;

    @NotNull
    private final String currency;

    @NotNull
    private final String depositId;

    @Nullable
    private final List<String> disposalSteps;

    @NotNull
    private final String id;

    @NotNull
    private final String walletTxId;

    /* JADX INFO: compiled from: RollbackEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<RollbackEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RollbackEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RollbackEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RollbackEntity[] newArray(int i11) {
            return new RollbackEntity[i11];
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
        if (!(other instanceof RollbackEntity)) {
            return false;
        }
        RollbackEntity rollbackEntity = (RollbackEntity) other;
        return Intrinsics.areEqual(this.id, rollbackEntity.id) && Intrinsics.areEqual(this.depositId, rollbackEntity.depositId) && Intrinsics.areEqual(this.walletTxId, rollbackEntity.walletTxId) && this.createdAt == rollbackEntity.createdAt && Intrinsics.areEqual(this.currency, rollbackEntity.currency) && Intrinsics.areEqual(this.amount, rollbackEntity.amount) && Intrinsics.areEqual(this.arrears, rollbackEntity.arrears) && Intrinsics.areEqual(this.disposalSteps, rollbackEntity.disposalSteps);
    }

    public RollbackEntity(@NotNull String id2, @NotNull String depositId, @NotNull String walletTxId, long j11, @NotNull String currency, @NotNull String amount, @Nullable String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(depositId, "depositId");
        Intrinsics.checkNotNullParameter(walletTxId, "walletTxId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.id = id2;
        this.depositId = depositId;
        this.walletTxId = walletTxId;
        this.createdAt = j11;
        this.currency = currency;
        this.amount = amount;
        this.arrears = str;
        this.disposalSteps = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RollbackEntity copy$default(RollbackEntity rollbackEntity, String str, String str2, String str3, long j11, String str4, String str5, String str6, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rollbackEntity.id;
        }
        if ((i11 & 2) != 0) {
            str2 = rollbackEntity.depositId;
        }
        if ((i11 & 4) != 0) {
            str3 = rollbackEntity.walletTxId;
        }
        if ((i11 & 8) != 0) {
            j11 = rollbackEntity.createdAt;
        }
        if ((i11 & 16) != 0) {
            str4 = rollbackEntity.currency;
        }
        if ((i11 & 32) != 0) {
            str5 = rollbackEntity.amount;
        }
        if ((i11 & 64) != 0) {
            str6 = rollbackEntity.arrears;
        }
        if ((i11 & 128) != 0) {
            list = rollbackEntity.disposalSteps;
        }
        long j12 = j11;
        String str7 = str3;
        return rollbackEntity.copy(str, str2, str7, j12, str4, str5, str6, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDepositId() {
        return this.depositId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWalletTxId() {
        return this.walletTxId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getArrears() {
        return this.arrears;
    }

    @Nullable
    public final List<String> component8() {
        return this.disposalSteps;
    }

    @NotNull
    public final RollbackEntity copy(@NotNull String id2, @NotNull String depositId, @NotNull String walletTxId, long createdAt, @NotNull String currency, @NotNull String amount, @Nullable String arrears, @Nullable List<String> disposalSteps) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(depositId, "depositId");
        Intrinsics.checkNotNullParameter(walletTxId, "walletTxId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return new RollbackEntity(id2, depositId, walletTxId, createdAt, currency, amount, arrears, disposalSteps);
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getArrears() {
        return this.arrears;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDepositId() {
        return this.depositId;
    }

    @Nullable
    public final List<String> getDisposalSteps() {
        return this.disposalSteps;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getWalletTxId() {
        return this.walletTxId;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + this.depositId.hashCode()) * 31) + this.walletTxId.hashCode()) * 31) + Long.hashCode(this.createdAt)) * 31) + this.currency.hashCode()) * 31) + this.amount.hashCode()) * 31;
        String str = this.arrears;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.disposalSteps;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RollbackEntity(id=" + this.id + ", depositId=" + this.depositId + ", walletTxId=" + this.walletTxId + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", amount=" + this.amount + ", arrears=" + this.arrears + ", disposalSteps=" + this.disposalSteps + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.depositId);
        dest.writeString(this.walletTxId);
        dest.writeLong(this.createdAt);
        dest.writeString(this.currency);
        dest.writeString(this.amount);
        dest.writeString(this.arrears);
        dest.writeStringList(this.disposalSteps);
    }
}
