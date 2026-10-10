package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawAccountsParams;", "Landroid/os/Parcelable;", "paymentMethodCode", "", FirebaseAnalytics.Param.CURRENCY, "currentSelectId", "accounts", "", "Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPaymentMethodCode", "()Ljava/lang/String;", "getCurrency", "getCurrentSelectId", "getAccounts", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawAccountsParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FiatWithdrawAccountsParams> CREATOR = new Creator();

    @Nullable
    private final List<FiatWithdrawAccountInfo> accounts;

    @Nullable
    private final String currency;

    @Nullable
    private final String currentSelectId;

    @Nullable
    private final String paymentMethodCode;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatWithdrawAccountsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawAccountsParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(FiatWithdrawAccountInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new FiatWithdrawAccountsParams(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawAccountsParams[] newArray(int i11) {
            return new FiatWithdrawAccountsParams[i11];
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
        if (!(other instanceof FiatWithdrawAccountsParams)) {
            return false;
        }
        FiatWithdrawAccountsParams fiatWithdrawAccountsParams = (FiatWithdrawAccountsParams) other;
        return Intrinsics.areEqual(this.paymentMethodCode, fiatWithdrawAccountsParams.paymentMethodCode) && Intrinsics.areEqual(this.currency, fiatWithdrawAccountsParams.currency) && Intrinsics.areEqual(this.currentSelectId, fiatWithdrawAccountsParams.currentSelectId) && Intrinsics.areEqual(this.accounts, fiatWithdrawAccountsParams.accounts);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatWithdrawAccountsParams copy$default(FiatWithdrawAccountsParams fiatWithdrawAccountsParams, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatWithdrawAccountsParams.paymentMethodCode;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatWithdrawAccountsParams.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatWithdrawAccountsParams.currentSelectId;
        }
        if ((i11 & 8) != 0) {
            list = fiatWithdrawAccountsParams.accounts;
        }
        return fiatWithdrawAccountsParams.copy(str, str2, str3, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrentSelectId() {
        return this.currentSelectId;
    }

    @Nullable
    public final List<FiatWithdrawAccountInfo> component4() {
        return this.accounts;
    }

    @NotNull
    public final FiatWithdrawAccountsParams copy(@Nullable String paymentMethodCode, @Nullable String currency, @Nullable String currentSelectId, @Nullable List<FiatWithdrawAccountInfo> accounts) {
        return new FiatWithdrawAccountsParams(paymentMethodCode, currency, currentSelectId, accounts);
    }

    @Nullable
    public final List<FiatWithdrawAccountInfo> getAccounts() {
        return this.accounts;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrentSelectId() {
        return this.currentSelectId;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    public int hashCode() {
        String str = this.paymentMethodCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currentSelectId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<FiatWithdrawAccountInfo> list = this.accounts;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawAccountsParams(paymentMethodCode=" + this.paymentMethodCode + ", currency=" + this.currency + ", currentSelectId=" + this.currentSelectId + ", accounts=" + this.accounts + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.paymentMethodCode);
        dest.writeString(this.currency);
        dest.writeString(this.currentSelectId);
        List<FiatWithdrawAccountInfo> list = this.accounts;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<FiatWithdrawAccountInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public FiatWithdrawAccountsParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<FiatWithdrawAccountInfo> list) {
        this.paymentMethodCode = str;
        this.currency = str2;
        this.currentSelectId = str3;
        this.accounts = list;
    }
}
