package com.kubi.kumex.data.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserMaxLeverageEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntityOfSymbol;", "Landroid/os/Parcelable;", "leverageEntity", "Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "symbol", "", "isTrial", "", "<init>", "(Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;Ljava/lang/String;Z)V", "getLeverageEntity", "()Lcom/kubi/kumex/data/platform/model/UserMaxLeverageEntity;", "getSymbol", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UserMaxLeverageEntityOfSymbol implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserMaxLeverageEntityOfSymbol> CREATOR = new C15830a();
    private final boolean isTrial;

    @NotNull
    private final UserMaxLeverageEntity leverageEntity;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.kumex.data.platform.model.UserMaxLeverageEntityOfSymbol$a */
    /* JADX INFO: compiled from: UserMaxLeverageEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15830a implements Parcelable.Creator<UserMaxLeverageEntityOfSymbol> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UserMaxLeverageEntityOfSymbol createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserMaxLeverageEntityOfSymbol(UserMaxLeverageEntity.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UserMaxLeverageEntityOfSymbol[] newArray(int i11) {
            return new UserMaxLeverageEntityOfSymbol[i11];
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
        if (!(other instanceof UserMaxLeverageEntityOfSymbol)) {
            return false;
        }
        UserMaxLeverageEntityOfSymbol userMaxLeverageEntityOfSymbol = (UserMaxLeverageEntityOfSymbol) other;
        return Intrinsics.areEqual(this.leverageEntity, userMaxLeverageEntityOfSymbol.leverageEntity) && Intrinsics.areEqual(this.symbol, userMaxLeverageEntityOfSymbol.symbol) && this.isTrial == userMaxLeverageEntityOfSymbol.isTrial;
    }

    public UserMaxLeverageEntityOfSymbol(@NotNull UserMaxLeverageEntity leverageEntity, @NotNull String symbol, boolean z11) {
        Intrinsics.checkNotNullParameter(leverageEntity, "leverageEntity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.leverageEntity = leverageEntity;
        this.symbol = symbol;
        this.isTrial = z11;
    }

    public static /* synthetic */ UserMaxLeverageEntityOfSymbol copy$default(UserMaxLeverageEntityOfSymbol userMaxLeverageEntityOfSymbol, UserMaxLeverageEntity userMaxLeverageEntity, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            userMaxLeverageEntity = userMaxLeverageEntityOfSymbol.leverageEntity;
        }
        if ((i11 & 2) != 0) {
            str = userMaxLeverageEntityOfSymbol.symbol;
        }
        if ((i11 & 4) != 0) {
            z11 = userMaxLeverageEntityOfSymbol.isTrial;
        }
        return userMaxLeverageEntityOfSymbol.copy(userMaxLeverageEntity, str, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserMaxLeverageEntity getLeverageEntity() {
        return this.leverageEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsTrial() {
        return this.isTrial;
    }

    @NotNull
    public final UserMaxLeverageEntityOfSymbol copy(@NotNull UserMaxLeverageEntity leverageEntity, @NotNull String symbol, boolean isTrial) {
        Intrinsics.checkNotNullParameter(leverageEntity, "leverageEntity");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new UserMaxLeverageEntityOfSymbol(leverageEntity, symbol, isTrial);
    }

    @NotNull
    public final UserMaxLeverageEntity getLeverageEntity() {
        return this.leverageEntity;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((this.leverageEntity.hashCode() * 31) + this.symbol.hashCode()) * 31) + Boolean.hashCode(this.isTrial);
    }

    public final boolean isTrial() {
        return this.isTrial;
    }

    @NotNull
    public String toString() {
        return "UserMaxLeverageEntityOfSymbol(leverageEntity=" + this.leverageEntity + ", symbol=" + this.symbol + ", isTrial=" + this.isTrial + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.leverageEntity.writeToParcel(dest, flags);
        dest.writeString(this.symbol);
        dest.writeInt(this.isTrial ? 1 : 0);
    }
}
