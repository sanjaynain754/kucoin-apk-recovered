package com.kubi.quotefacade.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.kumex.entity.ContractEntityOpenData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FutureTradeItemBean.kt */
/* JADX INFO: loaded from: classes37.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/quotefacade/entity/FutureTradeItemBean;", "Lcom/kubi/data/entity/TradeItemBean;", "contract", "Lcom/kubi/kumex/entity/ContractEntityOpenData;", "statusIcon", "", "<init>", "(Lcom/kubi/kumex/entity/ContractEntityOpenData;Ljava/lang/String;)V", "getContract", "()Lcom/kubi/kumex/entity/ContractEntityOpenData;", "getStatusIcon", "()Ljava/lang/String;", "setStatusIcon", "(Ljava/lang/String;)V", "isForeverContract", "", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FutureTradeItemBean extends TradeItemBean {

    @NotNull
    public static final Parcelable.Creator<FutureTradeItemBean> CREATOR = new C21889a();

    @NotNull
    private final ContractEntityOpenData contract;

    @NotNull
    private String statusIcon;

    /* JADX INFO: renamed from: com.kubi.quotefacade.entity.FutureTradeItemBean$a */
    /* JADX INFO: compiled from: FutureTradeItemBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21889a implements Parcelable.Creator<FutureTradeItemBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FutureTradeItemBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FutureTradeItemBean((ContractEntityOpenData) parcel.readParcelable(FutureTradeItemBean.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FutureTradeItemBean[] newArray(int i11) {
            return new FutureTradeItemBean[i11];
        }
    }

    public FutureTradeItemBean(@NotNull ContractEntityOpenData contract, @NotNull String statusIcon) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
        this.contract = contract;
        this.statusIcon = statusIcon;
    }

    @Override // com.kubi.data.entity.TradeItemBean
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FutureTradeItemBean)) {
            return false;
        }
        FutureTradeItemBean futureTradeItemBean = (FutureTradeItemBean) other;
        return Intrinsics.areEqual(this.contract, futureTradeItemBean.contract) && Intrinsics.areEqual(this.statusIcon, futureTradeItemBean.statusIcon);
    }

    public /* synthetic */ FutureTradeItemBean(ContractEntityOpenData contractEntityOpenData, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(contractEntityOpenData, (i11 & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ FutureTradeItemBean copy$default(FutureTradeItemBean futureTradeItemBean, ContractEntityOpenData contractEntityOpenData, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            contractEntityOpenData = futureTradeItemBean.contract;
        }
        if ((i11 & 2) != 0) {
            str = futureTradeItemBean.statusIcon;
        }
        return futureTradeItemBean.copy(contractEntityOpenData, str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContractEntityOpenData getContract() {
        return this.contract;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    @NotNull
    public final FutureTradeItemBean copy(@NotNull ContractEntityOpenData contract, @NotNull String statusIcon) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(statusIcon, "statusIcon");
        return new FutureTradeItemBean(contract, statusIcon);
    }

    @NotNull
    public final ContractEntityOpenData getContract() {
        return this.contract;
    }

    @NotNull
    public final String getStatusIcon() {
        return this.statusIcon;
    }

    public int hashCode() {
        return (this.contract.hashCode() * 31) + this.statusIcon.hashCode();
    }

    public final boolean isForeverContract() {
        return Intrinsics.areEqual(this.contract.getType(), "FFWCSX");
    }

    public final void setStatusIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.statusIcon = str;
    }

    @NotNull
    public String toString() {
        return "FutureTradeItemBean(contract=" + this.contract + ", statusIcon=" + this.statusIcon + ')';
    }

    @Override // com.kubi.data.entity.TradeItemBean, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.contract, flags);
        dest.writeString(this.statusIcon);
    }
}
