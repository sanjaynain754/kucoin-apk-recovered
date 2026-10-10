package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/assets/entity/AssetTrackEntity;", "Landroid/os/Parcelable;", "balance", "Ljava/math/BigDecimal;", JAnalysisConstants.Account.KEY_ACCOUNT, "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;)V", "getBalance", "()Ljava/math/BigDecimal;", "getAccount", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AssetTrackEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AssetTrackEntity> CREATOR = new Creator();

    @NotNull
    private final String account;

    @Nullable
    private final BigDecimal balance;

    /* JADX INFO: compiled from: Assetv2OverviewEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AssetTrackEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTrackEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AssetTrackEntity((BigDecimal) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetTrackEntity[] newArray(int i11) {
            return new AssetTrackEntity[i11];
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
        if (!(other instanceof AssetTrackEntity)) {
            return false;
        }
        AssetTrackEntity assetTrackEntity = (AssetTrackEntity) other;
        return Intrinsics.areEqual(this.balance, assetTrackEntity.balance) && Intrinsics.areEqual(this.account, assetTrackEntity.account);
    }

    public AssetTrackEntity(@Nullable BigDecimal bigDecimal, @NotNull String account) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.balance = bigDecimal;
        this.account = account;
    }

    public static /* synthetic */ AssetTrackEntity copy$default(AssetTrackEntity assetTrackEntity, BigDecimal bigDecimal, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = assetTrackEntity.balance;
        }
        if ((i11 & 2) != 0) {
            str = assetTrackEntity.account;
        }
        return assetTrackEntity.copy(bigDecimal, str);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @NotNull
    public final AssetTrackEntity copy(@Nullable BigDecimal balance, @NotNull String account) {
        Intrinsics.checkNotNullParameter(account, "account");
        return new AssetTrackEntity(balance, account);
    }

    @NotNull
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.balance;
        return ((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + this.account.hashCode();
    }

    @NotNull
    public String toString() {
        return "AssetTrackEntity(balance=" + this.balance + ", account=" + this.account + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.balance);
        dest.writeString(this.account);
    }
}
