package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAssetEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/data/entity/UnifiedAssetEntity;", "Landroid/os/Parcelable;", "totalBalance", "Ljava/math/BigDecimal;", "execute", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;)V", "getTotalBalance", "()Ljava/math/BigDecimal;", "setTotalBalance", "(Ljava/math/BigDecimal;)V", "getExecute", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Boolean;)Lcom/kubi/data/entity/UnifiedAssetEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAssetEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedAssetEntity> CREATOR = new Creator();

    @Nullable
    private final Boolean execute;

    @Nullable
    private BigDecimal totalBalance;

    /* JADX INFO: compiled from: UnifiedAssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UnifiedAssetEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UnifiedAssetEntity(bigDecimal, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAssetEntity[] newArray(int i11) {
            return new UnifiedAssetEntity[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnifiedAssetEntity() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedAssetEntity)) {
            return false;
        }
        UnifiedAssetEntity unifiedAssetEntity = (UnifiedAssetEntity) other;
        return Intrinsics.areEqual(this.totalBalance, unifiedAssetEntity.totalBalance) && Intrinsics.areEqual(this.execute, unifiedAssetEntity.execute);
    }

    public UnifiedAssetEntity(@Nullable BigDecimal bigDecimal, @Nullable Boolean bool) {
        this.totalBalance = bigDecimal;
        this.execute = bool;
    }

    public static /* synthetic */ UnifiedAssetEntity copy$default(UnifiedAssetEntity unifiedAssetEntity, BigDecimal bigDecimal, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = unifiedAssetEntity.totalBalance;
        }
        if ((i11 & 2) != 0) {
            bool = unifiedAssetEntity.execute;
        }
        return unifiedAssetEntity.copy(bigDecimal, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getExecute() {
        return this.execute;
    }

    @NotNull
    public final UnifiedAssetEntity copy(@Nullable BigDecimal totalBalance, @Nullable Boolean execute) {
        return new UnifiedAssetEntity(totalBalance, execute);
    }

    @Nullable
    public final Boolean getExecute() {
        return this.execute;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.execute;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final void setTotalBalance(@Nullable BigDecimal bigDecimal) {
        this.totalBalance = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "UnifiedAssetEntity(totalBalance=" + this.totalBalance + ", execute=" + this.execute + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.totalBalance);
        Boolean bool = this.execute;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ UnifiedAssetEntity(BigDecimal bigDecimal, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 2) != 0 ? Boolean.TRUE : bool);
    }
}
