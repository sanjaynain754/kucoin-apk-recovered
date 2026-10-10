package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvoiceRequestEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013Jb\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\b\u0010\u0013R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\n\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/entity/InvoiceValidateResult;", "", "amount", "", "chainId", "chainName", FirebaseAnalytics.Param.CURRENCY, "invoice", "isValid", "", "isWithdrawChainIdEnable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAmount", "()Ljava/lang/String;", "getChainId", "getChainName", "getCurrency", "getInvoice", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/assets/entity/InvoiceValidateResult;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class InvoiceValidateResult {

    @Nullable
    private final String amount;

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainName;

    @Nullable
    private final String currency;

    @Nullable
    private final String invoice;

    @Nullable
    private final Boolean isValid;

    @Nullable
    private final Boolean isWithdrawChainIdEnable;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvoiceValidateResult)) {
            return false;
        }
        InvoiceValidateResult invoiceValidateResult = (InvoiceValidateResult) other;
        return Intrinsics.areEqual(this.amount, invoiceValidateResult.amount) && Intrinsics.areEqual(this.chainId, invoiceValidateResult.chainId) && Intrinsics.areEqual(this.chainName, invoiceValidateResult.chainName) && Intrinsics.areEqual(this.currency, invoiceValidateResult.currency) && Intrinsics.areEqual(this.invoice, invoiceValidateResult.invoice) && Intrinsics.areEqual(this.isValid, invoiceValidateResult.isValid) && Intrinsics.areEqual(this.isWithdrawChainIdEnable, invoiceValidateResult.isWithdrawChainIdEnable);
    }

    public static /* synthetic */ InvoiceValidateResult copy$default(InvoiceValidateResult invoiceValidateResult, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = invoiceValidateResult.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = invoiceValidateResult.chainId;
        }
        if ((i11 & 4) != 0) {
            str3 = invoiceValidateResult.chainName;
        }
        if ((i11 & 8) != 0) {
            str4 = invoiceValidateResult.currency;
        }
        if ((i11 & 16) != 0) {
            str5 = invoiceValidateResult.invoice;
        }
        if ((i11 & 32) != 0) {
            bool = invoiceValidateResult.isValid;
        }
        if ((i11 & 64) != 0) {
            bool2 = invoiceValidateResult.isWithdrawChainIdEnable;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str6 = str5;
        String str7 = str3;
        return invoiceValidateResult.copy(str, str2, str7, str4, str6, bool3, bool4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInvoice() {
        return this.invoice;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsValid() {
        return this.isValid;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsWithdrawChainIdEnable() {
        return this.isWithdrawChainIdEnable;
    }

    @NotNull
    public final InvoiceValidateResult copy(@Nullable String amount, @Nullable String chainId, @Nullable String chainName, @Nullable String currency, @Nullable String invoice, @Nullable Boolean isValid, @Nullable Boolean isWithdrawChainIdEnable) {
        return new InvoiceValidateResult(amount, chainId, chainName, currency, invoice, isValid, isWithdrawChainIdEnable);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getInvoice() {
        return this.invoice;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.chainId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.chainName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.invoice;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isValid;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isWithdrawChainIdEnable;
        return iHashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isValid() {
        return this.isValid;
    }

    @Nullable
    public final Boolean isWithdrawChainIdEnable() {
        return this.isWithdrawChainIdEnable;
    }

    @NotNull
    public String toString() {
        return "InvoiceValidateResult(amount=" + this.amount + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", currency=" + this.currency + ", invoice=" + this.invoice + ", isValid=" + this.isValid + ", isWithdrawChainIdEnable=" + this.isWithdrawChainIdEnable + ')';
    }

    public InvoiceValidateResult(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.amount = str;
        this.chainId = str2;
        this.chainName = str3;
        this.currency = str4;
        this.invoice = str5;
        this.isValid = bool;
        this.isWithdrawChainIdEnable = bool2;
    }
}
