package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserFeeRateEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/UserFeeRateEntity;", "Landroid/os/Parcelable;", "holdFeeRate", "Ljava/math/BigDecimal;", "holdFixFee", "takerFeeRate", "makerFeeRate", "fixTakerFee", "fixMakerFee", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getHoldFeeRate", "()Ljava/math/BigDecimal;", "getHoldFixFee", "getTakerFeeRate", "getMakerFeeRate", "getFixTakerFee", "getFixMakerFee", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserFeeRateEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserFeeRateEntity> CREATOR = new C15828a();

    @Nullable
    private final BigDecimal fixMakerFee;

    @Nullable
    private final BigDecimal fixTakerFee;

    @Nullable
    private final BigDecimal holdFeeRate;

    @Nullable
    private final BigDecimal holdFixFee;

    @Nullable
    private final BigDecimal makerFeeRate;

    @Nullable
    private final BigDecimal takerFeeRate;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.UserFeeRateEntity$a */
    /* JADX INFO: compiled from: UserFeeRateEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15828a implements Parcelable.Creator<UserFeeRateEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserFeeRateEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserFeeRateEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserFeeRateEntity[] newArray(int i11) {
            return new UserFeeRateEntity[i11];
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
        if (!(other instanceof UserFeeRateEntity)) {
            return false;
        }
        UserFeeRateEntity userFeeRateEntity = (UserFeeRateEntity) other;
        return Intrinsics.areEqual(this.holdFeeRate, userFeeRateEntity.holdFeeRate) && Intrinsics.areEqual(this.holdFixFee, userFeeRateEntity.holdFixFee) && Intrinsics.areEqual(this.takerFeeRate, userFeeRateEntity.takerFeeRate) && Intrinsics.areEqual(this.makerFeeRate, userFeeRateEntity.makerFeeRate) && Intrinsics.areEqual(this.fixTakerFee, userFeeRateEntity.fixTakerFee) && Intrinsics.areEqual(this.fixMakerFee, userFeeRateEntity.fixMakerFee);
    }

    public static /* synthetic */ UserFeeRateEntity copy$default(UserFeeRateEntity userFeeRateEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = userFeeRateEntity.holdFeeRate;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = userFeeRateEntity.holdFixFee;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = userFeeRateEntity.takerFeeRate;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = userFeeRateEntity.makerFeeRate;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = userFeeRateEntity.fixTakerFee;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = userFeeRateEntity.fixMakerFee;
        }
        BigDecimal bigDecimal7 = bigDecimal5;
        BigDecimal bigDecimal8 = bigDecimal6;
        return userFeeRateEntity.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal7, bigDecimal8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getHoldFeeRate() {
        return this.holdFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getHoldFixFee() {
        return this.holdFixFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFixTakerFee() {
        return this.fixTakerFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getFixMakerFee() {
        return this.fixMakerFee;
    }

    @NotNull
    public final UserFeeRateEntity copy(@Nullable BigDecimal holdFeeRate, @Nullable BigDecimal holdFixFee, @Nullable BigDecimal takerFeeRate, @Nullable BigDecimal makerFeeRate, @Nullable BigDecimal fixTakerFee, @Nullable BigDecimal fixMakerFee) {
        return new UserFeeRateEntity(holdFeeRate, holdFixFee, takerFeeRate, makerFeeRate, fixTakerFee, fixMakerFee);
    }

    @Nullable
    public final BigDecimal getFixMakerFee() {
        return this.fixMakerFee;
    }

    @Nullable
    public final BigDecimal getFixTakerFee() {
        return this.fixTakerFee;
    }

    @Nullable
    public final BigDecimal getHoldFeeRate() {
        return this.holdFeeRate;
    }

    @Nullable
    public final BigDecimal getHoldFixFee() {
        return this.holdFixFee;
    }

    @Nullable
    public final BigDecimal getMakerFeeRate() {
        return this.makerFeeRate;
    }

    @Nullable
    public final BigDecimal getTakerFeeRate() {
        return this.takerFeeRate;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.holdFeeRate;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.holdFixFee;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.takerFeeRate;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.makerFeeRate;
        int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.fixTakerFee;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.fixMakerFee;
        return iHashCode5 + (bigDecimal6 != null ? bigDecimal6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserFeeRateEntity(holdFeeRate=" + this.holdFeeRate + ", holdFixFee=" + this.holdFixFee + ", takerFeeRate=" + this.takerFeeRate + ", makerFeeRate=" + this.makerFeeRate + ", fixTakerFee=" + this.fixTakerFee + ", fixMakerFee=" + this.fixMakerFee + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.holdFeeRate);
        dest.writeSerializable(this.holdFixFee);
        dest.writeSerializable(this.takerFeeRate);
        dest.writeSerializable(this.makerFeeRate);
        dest.writeSerializable(this.fixTakerFee);
        dest.writeSerializable(this.fixMakerFee);
    }

    public UserFeeRateEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6) {
        this.holdFeeRate = bigDecimal;
        this.holdFixFee = bigDecimal2;
        this.takerFeeRate = bigDecimal3;
        this.makerFeeRate = bigDecimal4;
        this.fixTakerFee = bigDecimal5;
        this.fixMakerFee = bigDecimal6;
    }
}
