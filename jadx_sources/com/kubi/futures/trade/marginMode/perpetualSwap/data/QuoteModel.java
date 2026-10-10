package com.kubi.futures.trade.marginMode.perpetualSwap.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.kumex.data.platform.model.ContractEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QuoteEntity.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\r\"\u0004\b\u0013\u0010\u0014¨\u0006'"}, m90084d2 = {"Lcom/kubi/futures/trade/marginMode/perpetualSwap/data/QuoteModel;", "Landroid/os/Parcelable;", "switchable", "", "marginMode", "", "symbol", "contractEntity", "Lcom/kubi/kumex/data/platform/model/ContractEntity;", "isSelected", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/kubi/kumex/data/platform/model/ContractEntity;Z)V", "getSwitchable", "()Z", "getMarginMode", "()Ljava/lang/String;", "getSymbol", "getContractEntity", "()Lcom/kubi/kumex/data/platform/model/ContractEntity;", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class QuoteModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<QuoteModel> CREATOR = new C13750a();

    @Nullable
    private final ContractEntity contractEntity;
    private boolean isSelected;

    @NotNull
    private final String marginMode;
    private final boolean switchable;

    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: com.kubi.futures.trade.marginMode.perpetualSwap.data.QuoteModel$a */
    /* JADX INFO: compiled from: QuoteEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C13750a implements Parcelable.Creator<QuoteModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QuoteModel createFromParcel(Parcel parcel) {
            boolean z11;
            ContractEntity contractEntity;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z13 = false;
            if (parcel.readInt() != 0) {
                z13 = true;
                z11 = true;
            } else {
                z11 = true;
            }
            String string = parcel.readString();
            boolean z14 = z11;
            String string2 = parcel.readString();
            ContractEntity contractEntity2 = (ContractEntity) parcel.readParcelable(QuoteModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z12 = z14;
                contractEntity = contractEntity2;
            } else {
                contractEntity = contractEntity2;
                z12 = false;
            }
            return new QuoteModel(z13, string, string2, contractEntity, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final QuoteModel[] newArray(int i11) {
            return new QuoteModel[i11];
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
        if (!(other instanceof QuoteModel)) {
            return false;
        }
        QuoteModel quoteModel = (QuoteModel) other;
        return this.switchable == quoteModel.switchable && Intrinsics.areEqual(this.marginMode, quoteModel.marginMode) && Intrinsics.areEqual(this.symbol, quoteModel.symbol) && Intrinsics.areEqual(this.contractEntity, quoteModel.contractEntity) && this.isSelected == quoteModel.isSelected;
    }

    public QuoteModel(boolean z11, @NotNull String marginMode, @NotNull String symbol, @Nullable ContractEntity contractEntity, boolean z12) {
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.switchable = z11;
        this.marginMode = marginMode;
        this.symbol = symbol;
        this.contractEntity = contractEntity;
        this.isSelected = z12;
    }

    public static /* synthetic */ QuoteModel copy$default(QuoteModel quoteModel, boolean z11, String str, String str2, ContractEntity contractEntity, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = quoteModel.switchable;
        }
        if ((i11 & 2) != 0) {
            str = quoteModel.marginMode;
        }
        if ((i11 & 4) != 0) {
            str2 = quoteModel.symbol;
        }
        if ((i11 & 8) != 0) {
            contractEntity = quoteModel.contractEntity;
        }
        if ((i11 & 16) != 0) {
            z12 = quoteModel.isSelected;
        }
        boolean z13 = z12;
        String str3 = str2;
        return quoteModel.copy(z11, str, str3, contractEntity, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSwitchable() {
        return this.switchable;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarginMode() {
        return this.marginMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContractEntity getContractEntity() {
        return this.contractEntity;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public final QuoteModel copy(boolean switchable, @NotNull String marginMode, @NotNull String symbol, @Nullable ContractEntity contractEntity, boolean isSelected) {
        Intrinsics.checkNotNullParameter(marginMode, "marginMode");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new QuoteModel(switchable, marginMode, symbol, contractEntity, isSelected);
    }

    @Nullable
    public final ContractEntity getContractEntity() {
        return this.contractEntity;
    }

    @NotNull
    public final String getMarginMode() {
        return this.marginMode;
    }

    public final boolean getSwitchable() {
        return this.switchable;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.switchable) * 31) + this.marginMode.hashCode()) * 31) + this.symbol.hashCode()) * 31;
        ContractEntity contractEntity = this.contractEntity;
        return ((iHashCode + (contractEntity == null ? 0 : contractEntity.hashCode())) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        return "QuoteModel(switchable=" + this.switchable + ", marginMode=" + this.marginMode + ", symbol=" + this.symbol + ", contractEntity=" + this.contractEntity + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.switchable ? 1 : 0);
        dest.writeString(this.marginMode);
        dest.writeString(this.symbol);
        dest.writeParcelable(this.contractEntity, flags);
        dest.writeInt(this.isSelected ? 1 : 0);
    }
}
