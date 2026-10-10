package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserMaxLeverageEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "Landroid/os/Parcelable;", "isolatedMaxLeverage", "Ljava/math/BigDecimal;", "crossMaxLeverage", "trialCrossMaxLeverageFlag", "", "trialIsolatedMaxLeverageFlag", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getIsolatedMaxLeverage", "()Ljava/math/BigDecimal;", "getCrossMaxLeverage", "getTrialCrossMaxLeverageFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTrialIsolatedMaxLeverageFlag", "component1", "component2", "component3", "component4", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserMaxLeverageEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserMaxLeverageEntity> CREATOR = new C15829a();

    @Nullable
    private final BigDecimal crossMaxLeverage;

    @Nullable
    private final BigDecimal isolatedMaxLeverage;

    @Nullable
    private final Boolean trialCrossMaxLeverageFlag;

    @Nullable
    private final Boolean trialIsolatedMaxLeverageFlag;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.UserMaxLeverageEntity$a */
    /* JADX INFO: compiled from: UserMaxLeverageEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15829a implements Parcelable.Creator<UserMaxLeverageEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserMaxLeverageEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserMaxLeverageEntity(bigDecimal, bigDecimal2, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserMaxLeverageEntity[] newArray(int i11) {
            return new UserMaxLeverageEntity[i11];
        }
    }

    public UserMaxLeverageEntity() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMaxLeverageEntity)) {
            return false;
        }
        UserMaxLeverageEntity userMaxLeverageEntity = (UserMaxLeverageEntity) other;
        return Intrinsics.areEqual(this.isolatedMaxLeverage, userMaxLeverageEntity.isolatedMaxLeverage) && Intrinsics.areEqual(this.crossMaxLeverage, userMaxLeverageEntity.crossMaxLeverage) && Intrinsics.areEqual(this.trialCrossMaxLeverageFlag, userMaxLeverageEntity.trialCrossMaxLeverageFlag) && Intrinsics.areEqual(this.trialIsolatedMaxLeverageFlag, userMaxLeverageEntity.trialIsolatedMaxLeverageFlag);
    }

    public UserMaxLeverageEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.isolatedMaxLeverage = bigDecimal;
        this.crossMaxLeverage = bigDecimal2;
        this.trialCrossMaxLeverageFlag = bool;
        this.trialIsolatedMaxLeverageFlag = bool2;
    }

    public static /* synthetic */ UserMaxLeverageEntity copy$default(UserMaxLeverageEntity userMaxLeverageEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = userMaxLeverageEntity.isolatedMaxLeverage;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = userMaxLeverageEntity.crossMaxLeverage;
        }
        if ((i11 & 4) != 0) {
            bool = userMaxLeverageEntity.trialCrossMaxLeverageFlag;
        }
        if ((i11 & 8) != 0) {
            bool2 = userMaxLeverageEntity.trialIsolatedMaxLeverageFlag;
        }
        return userMaxLeverageEntity.copy(bigDecimal, bigDecimal2, bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getIsolatedMaxLeverage() {
        return this.isolatedMaxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getCrossMaxLeverage() {
        return this.crossMaxLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getTrialCrossMaxLeverageFlag() {
        return this.trialCrossMaxLeverageFlag;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getTrialIsolatedMaxLeverageFlag() {
        return this.trialIsolatedMaxLeverageFlag;
    }

    @NotNull
    public final UserMaxLeverageEntity copy(@Nullable BigDecimal isolatedMaxLeverage, @Nullable BigDecimal crossMaxLeverage, @Nullable Boolean trialCrossMaxLeverageFlag, @Nullable Boolean trialIsolatedMaxLeverageFlag) {
        return new UserMaxLeverageEntity(isolatedMaxLeverage, crossMaxLeverage, trialCrossMaxLeverageFlag, trialIsolatedMaxLeverageFlag);
    }

    @Nullable
    public final BigDecimal getCrossMaxLeverage() {
        return this.crossMaxLeverage;
    }

    @Nullable
    public final BigDecimal getIsolatedMaxLeverage() {
        return this.isolatedMaxLeverage;
    }

    @Nullable
    public final Boolean getTrialCrossMaxLeverageFlag() {
        return this.trialCrossMaxLeverageFlag;
    }

    @Nullable
    public final Boolean getTrialIsolatedMaxLeverageFlag() {
        return this.trialIsolatedMaxLeverageFlag;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.isolatedMaxLeverage;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.crossMaxLeverage;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Boolean bool = this.trialCrossMaxLeverageFlag;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.trialIsolatedMaxLeverageFlag;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UserMaxLeverageEntity(isolatedMaxLeverage=" + this.isolatedMaxLeverage + ", crossMaxLeverage=" + this.crossMaxLeverage + ", trialCrossMaxLeverageFlag=" + this.trialCrossMaxLeverageFlag + ", trialIsolatedMaxLeverageFlag=" + this.trialIsolatedMaxLeverageFlag + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.isolatedMaxLeverage);
        dest.writeSerializable(this.crossMaxLeverage);
        Boolean bool = this.trialCrossMaxLeverageFlag;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.trialIsolatedMaxLeverageFlag;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ UserMaxLeverageEntity(BigDecimal bigDecimal, BigDecimal bigDecimal2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : bool2);
    }
}
