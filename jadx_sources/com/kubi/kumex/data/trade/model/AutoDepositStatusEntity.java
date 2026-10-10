package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AutoDepositStatusEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006 "}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "Landroid/os/Parcelable;", "symbol", "", "positionSide", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getPositionSide", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/trade/model/AutoDepositStatusEntity;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AutoDepositStatusEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoDepositStatusEntity> CREATOR = new C15831a();

    @Nullable
    private final String positionSide;

    @Nullable
    private final Boolean status;

    @Nullable
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.AutoDepositStatusEntity$a */
    /* JADX INFO: compiled from: AutoDepositStatusEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15831a implements Parcelable.Creator<AutoDepositStatusEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoDepositStatusEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AutoDepositStatusEntity(string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AutoDepositStatusEntity[] newArray(int i11) {
            return new AutoDepositStatusEntity[i11];
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
        if (!(other instanceof AutoDepositStatusEntity)) {
            return false;
        }
        AutoDepositStatusEntity autoDepositStatusEntity = (AutoDepositStatusEntity) other;
        return Intrinsics.areEqual(this.symbol, autoDepositStatusEntity.symbol) && Intrinsics.areEqual(this.positionSide, autoDepositStatusEntity.positionSide) && Intrinsics.areEqual(this.status, autoDepositStatusEntity.status);
    }

    public static /* synthetic */ AutoDepositStatusEntity copy$default(AutoDepositStatusEntity autoDepositStatusEntity, String str, String str2, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = autoDepositStatusEntity.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = autoDepositStatusEntity.positionSide;
        }
        if ((i11 & 4) != 0) {
            bool = autoDepositStatusEntity.status;
        }
        return autoDepositStatusEntity.copy(str, str2, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final AutoDepositStatusEntity copy(@Nullable String symbol, @Nullable String positionSide, @Nullable Boolean status) {
        return new AutoDepositStatusEntity(symbol, positionSide, status);
    }

    @Nullable
    public final String getPositionSide() {
        return this.positionSide;
    }

    @Nullable
    public final Boolean getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.positionSide;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.status;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AutoDepositStatusEntity(symbol=" + this.symbol + ", positionSide=" + this.positionSide + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.symbol);
        dest.writeString(this.positionSide);
        Boolean bool = this.status;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public AutoDepositStatusEntity(@Nullable String str, @Nullable String str2, @Nullable Boolean bool) {
        this.symbol = str;
        this.positionSide = str2;
        this.status = bool;
    }
}
