package com.kubi.otc.entity;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.kubi.otc.R$string;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0001;Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006<"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawAccountInfo;", "Landroid/os/Parcelable;", "bankName", "", FirebaseAnalytics.Param.CURRENCY, "discription", "ibanLast4", "iban", "payoutAccountId", "payeeEmail", "status", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "Lcom/kubi/otc/entity/FiatAccountExtraInfo;", "iconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/otc/entity/FiatAccountExtraInfo;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getCurrency", "getDiscription", "getIbanLast4", "getIban", "getPayoutAccountId", "setPayoutAccountId", "(Ljava/lang/String;)V", "getPayeeEmail", "getStatus", "getExtra", "()Lcom/kubi/otc/entity/FiatAccountExtraInfo;", "getIconUrl", "getName", "context", "Landroid/content/Context;", "paymentMethodCode", "getSubName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawAccountInfo implements Parcelable {

    @NotNull
    private static final String WITHDRAW_ADVCASH = "advcash";

    @NotNull
    private static final String WITHDRAW_CAPITUAL = "capitual";

    @Nullable
    private final String bankName;

    @Nullable
    private final String currency;

    @Nullable
    private final String discription;

    @Nullable
    private final FiatAccountExtraInfo extra;

    @Nullable
    private final String iban;

    @Nullable
    private final String ibanLast4;

    @SerializedName("bankLogo")
    @Nullable
    private final String iconUrl;

    @Nullable
    private final String payeeEmail;

    @Nullable
    private String payoutAccountId;

    @Nullable
    private final String status;

    @NotNull
    public static final Parcelable.Creator<FiatWithdrawAccountInfo> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatWithdrawAccountInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawAccountInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatWithdrawAccountInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FiatAccountExtraInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatWithdrawAccountInfo[] newArray(int i11) {
            return new FiatWithdrawAccountInfo[i11];
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
        if (!(other instanceof FiatWithdrawAccountInfo)) {
            return false;
        }
        FiatWithdrawAccountInfo fiatWithdrawAccountInfo = (FiatWithdrawAccountInfo) other;
        return Intrinsics.areEqual(this.bankName, fiatWithdrawAccountInfo.bankName) && Intrinsics.areEqual(this.currency, fiatWithdrawAccountInfo.currency) && Intrinsics.areEqual(this.discription, fiatWithdrawAccountInfo.discription) && Intrinsics.areEqual(this.ibanLast4, fiatWithdrawAccountInfo.ibanLast4) && Intrinsics.areEqual(this.iban, fiatWithdrawAccountInfo.iban) && Intrinsics.areEqual(this.payoutAccountId, fiatWithdrawAccountInfo.payoutAccountId) && Intrinsics.areEqual(this.payeeEmail, fiatWithdrawAccountInfo.payeeEmail) && Intrinsics.areEqual(this.status, fiatWithdrawAccountInfo.status) && Intrinsics.areEqual(this.extra, fiatWithdrawAccountInfo.extra) && Intrinsics.areEqual(this.iconUrl, fiatWithdrawAccountInfo.iconUrl);
    }

    public static /* synthetic */ FiatWithdrawAccountInfo copy$default(FiatWithdrawAccountInfo fiatWithdrawAccountInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, FiatAccountExtraInfo fiatAccountExtraInfo, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatWithdrawAccountInfo.bankName;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatWithdrawAccountInfo.currency;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatWithdrawAccountInfo.discription;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatWithdrawAccountInfo.ibanLast4;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatWithdrawAccountInfo.iban;
        }
        if ((i11 & 32) != 0) {
            str6 = fiatWithdrawAccountInfo.payoutAccountId;
        }
        if ((i11 & 64) != 0) {
            str7 = fiatWithdrawAccountInfo.payeeEmail;
        }
        if ((i11 & 128) != 0) {
            str8 = fiatWithdrawAccountInfo.status;
        }
        if ((i11 & 256) != 0) {
            fiatAccountExtraInfo = fiatWithdrawAccountInfo.extra;
        }
        if ((i11 & 512) != 0) {
            str9 = fiatWithdrawAccountInfo.iconUrl;
        }
        FiatAccountExtraInfo fiatAccountExtraInfo2 = fiatAccountExtraInfo;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return fiatWithdrawAccountInfo.copy(str, str2, str3, str4, str13, str14, str11, str12, fiatAccountExtraInfo2, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIbanLast4() {
        return this.ibanLast4;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FiatAccountExtraInfo getExtra() {
        return this.extra;
    }

    @NotNull
    public final FiatWithdrawAccountInfo copy(@Nullable String bankName, @Nullable String currency, @Nullable String discription, @Nullable String ibanLast4, @Nullable String iban, @Nullable String payoutAccountId, @Nullable String payeeEmail, @Nullable String status, @Nullable FiatAccountExtraInfo extra, @Nullable String iconUrl) {
        return new FiatWithdrawAccountInfo(bankName, currency, discription, ibanLast4, iban, payoutAccountId, payeeEmail, status, extra, iconUrl);
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDiscription() {
        return this.discription;
    }

    @Nullable
    public final FiatAccountExtraInfo getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getIban() {
        return this.iban;
    }

    @Nullable
    public final String getIbanLast4() {
        return this.ibanLast4;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getName(@NotNull Context context, @Nullable String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(paymentMethodCode, WITHDRAW_CAPITUAL)) {
            if (Intrinsics.areEqual(paymentMethodCode, WITHDRAW_ADVCASH)) {
                String str = this.discription;
                return (str == null || str.length() == 0) ? C27041f.m66668h(this.payeeEmail) : C27041f.m66668h(this.discription);
            }
            String str2 = this.discription;
            return (str2 == null || str2.length() == 0) ? C27041f.m66668h(this.bankName) : C27041f.m66668h(this.discription);
        }
        FiatAccountExtraInfo fiatAccountExtraInfo = this.extra;
        if (C27025c.m66566d(fiatAccountExtraInfo != null ? Boolean.valueOf(fiatAccountExtraInfo.isPixCPFType()) : null)) {
            String str3 = this.discription;
            return (str3 == null || str3.length() == 0) ? "CPF" : C27041f.m66668h(this.discription);
        }
        FiatAccountExtraInfo fiatAccountExtraInfo2 = this.extra;
        if (!C27025c.m66566d(fiatAccountExtraInfo2 != null ? Boolean.valueOf(fiatAccountExtraInfo2.isPixBankType()) : null)) {
            FiatAccountExtraInfo fiatAccountExtraInfo3 = this.extra;
            if (!C27025c.m66566d(fiatAccountExtraInfo3 != null ? Boolean.valueOf(fiatAccountExtraInfo3.isTexType()) : null)) {
                return "";
            }
        }
        String str4 = this.discription;
        return (str4 == null || str4.length() == 0) ? C27041f.m66668h(this.bankName) : C27041f.m66668h(this.discription);
    }

    @Nullable
    public final String getPayeeEmail() {
        return this.payeeEmail;
    }

    @Nullable
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getSubName(@NotNull Context context, @Nullable String paymentMethodCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!Intrinsics.areEqual(paymentMethodCode, WITHDRAW_CAPITUAL)) {
            if (Intrinsics.areEqual(paymentMethodCode, WITHDRAW_ADVCASH)) {
                String str = this.discription;
                return (str == null || str.length() == 0) ? "" : C27041f.m66668h(this.payeeEmail);
            }
            String string = context.getString(R$string.pay_plaid_ending_in, this.ibanLast4);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        FiatAccountExtraInfo fiatAccountExtraInfo = this.extra;
        if (C27025c.m66566d(fiatAccountExtraInfo != null ? Boolean.valueOf(fiatAccountExtraInfo.isPixCPFType()) : null)) {
            return C27041f.m66668h(this.iban);
        }
        FiatAccountExtraInfo fiatAccountExtraInfo2 = this.extra;
        if (!C27025c.m66566d(fiatAccountExtraInfo2 != null ? Boolean.valueOf(fiatAccountExtraInfo2.isPixBankType()) : null)) {
            FiatAccountExtraInfo fiatAccountExtraInfo3 = this.extra;
            if (!C27025c.m66566d(fiatAccountExtraInfo3 != null ? Boolean.valueOf(fiatAccountExtraInfo3.isTexType()) : null)) {
                return "";
            }
        }
        String string2 = context.getString(R$string.pay_plaid_ending_in, this.ibanLast4);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public int hashCode() {
        String str = this.bankName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discription;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ibanLast4;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iban;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payoutAccountId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payeeEmail;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.status;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        FiatAccountExtraInfo fiatAccountExtraInfo = this.extra;
        int iHashCode9 = (iHashCode8 + (fiatAccountExtraInfo == null ? 0 : fiatAccountExtraInfo.hashCode())) * 31;
        String str9 = this.iconUrl;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setPayoutAccountId(@Nullable String str) {
        this.payoutAccountId = str;
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawAccountInfo(bankName=" + this.bankName + ", currency=" + this.currency + ", discription=" + this.discription + ", ibanLast4=" + this.ibanLast4 + ", iban=" + this.iban + ", payoutAccountId=" + this.payoutAccountId + ", payeeEmail=" + this.payeeEmail + ", status=" + this.status + ", extra=" + this.extra + ", iconUrl=" + this.iconUrl + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.bankName);
        dest.writeString(this.currency);
        dest.writeString(this.discription);
        dest.writeString(this.ibanLast4);
        dest.writeString(this.iban);
        dest.writeString(this.payoutAccountId);
        dest.writeString(this.payeeEmail);
        dest.writeString(this.status);
        FiatAccountExtraInfo fiatAccountExtraInfo = this.extra;
        if (fiatAccountExtraInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            fiatAccountExtraInfo.writeToParcel(dest, flags);
        }
        dest.writeString(this.iconUrl);
    }

    public FiatWithdrawAccountInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable FiatAccountExtraInfo fiatAccountExtraInfo, @Nullable String str9) {
        this.bankName = str;
        this.currency = str2;
        this.discription = str3;
        this.ibanLast4 = str4;
        this.iban = str5;
        this.payoutAccountId = str6;
        this.payeeEmail = str7;
        this.status = str8;
        this.extra = fiatAccountExtraInfo;
        this.iconUrl = str9;
    }
}
