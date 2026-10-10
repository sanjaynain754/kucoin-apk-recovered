package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: InvoiceRequestEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/entity/InvoiceResult;", "Landroid/os/Parcelable;", "chainId", "", FirebaseAnalytics.Param.CURRENCY, "endTimestamp", "", "invoice", "invoiceId", "startTimestamp", "toAccountType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "getCurrency", "getEndTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getInvoice", "getInvoiceId", "getStartTimestamp", "getToAccountType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/assets/entity/InvoiceResult;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class InvoiceResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvoiceResult> CREATOR = new Creator();

    @Nullable
    private final String chainId;

    @Nullable
    private final String currency;

    @Nullable
    private final Long endTimestamp;

    @Nullable
    private final String invoice;

    @Nullable
    private final String invoiceId;

    @Nullable
    private final Long startTimestamp;

    @Nullable
    private final String toAccountType;

    /* JADX INFO: compiled from: InvoiceRequestEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<InvoiceResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvoiceResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvoiceResult(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvoiceResult[] newArray(int i11) {
            return new InvoiceResult[i11];
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
        if (!(other instanceof InvoiceResult)) {
            return false;
        }
        InvoiceResult invoiceResult = (InvoiceResult) other;
        return Intrinsics.areEqual(this.chainId, invoiceResult.chainId) && Intrinsics.areEqual(this.currency, invoiceResult.currency) && Intrinsics.areEqual(this.endTimestamp, invoiceResult.endTimestamp) && Intrinsics.areEqual(this.invoice, invoiceResult.invoice) && Intrinsics.areEqual(this.invoiceId, invoiceResult.invoiceId) && Intrinsics.areEqual(this.startTimestamp, invoiceResult.startTimestamp) && Intrinsics.areEqual(this.toAccountType, invoiceResult.toAccountType);
    }

    public static /* synthetic */ InvoiceResult copy$default(InvoiceResult invoiceResult, String str, String str2, Long l11, String str3, String str4, Long l12, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = invoiceResult.chainId;
        }
        if ((i11 & 2) != 0) {
            str2 = invoiceResult.currency;
        }
        if ((i11 & 4) != 0) {
            l11 = invoiceResult.endTimestamp;
        }
        if ((i11 & 8) != 0) {
            str3 = invoiceResult.invoice;
        }
        if ((i11 & 16) != 0) {
            str4 = invoiceResult.invoiceId;
        }
        if ((i11 & 32) != 0) {
            l12 = invoiceResult.startTimestamp;
        }
        if ((i11 & 64) != 0) {
            str5 = invoiceResult.toAccountType;
        }
        Long l13 = l12;
        String str6 = str5;
        String str7 = str4;
        Long l14 = l11;
        return invoiceResult.copy(str, str2, l14, str3, str7, l13, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInvoice() {
        return this.invoice;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getToAccountType() {
        return this.toAccountType;
    }

    @NotNull
    public final InvoiceResult copy(@Nullable String chainId, @Nullable String currency, @Nullable Long endTimestamp, @Nullable String invoice, @Nullable String invoiceId, @Nullable Long startTimestamp, @Nullable String toAccountType) {
        return new InvoiceResult(chainId, currency, endTimestamp, invoice, invoiceId, startTimestamp, toAccountType);
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getEndTimestamp() {
        return this.endTimestamp;
    }

    @Nullable
    public final String getInvoice() {
        return this.invoice;
    }

    @Nullable
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    @Nullable
    public final Long getStartTimestamp() {
        return this.startTimestamp;
    }

    @Nullable
    public final String getToAccountType() {
        return this.toAccountType;
    }

    public int hashCode() {
        String str = this.chainId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.endTimestamp;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.invoice;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.invoiceId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.startTimestamp;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str5 = this.toAccountType;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "InvoiceResult(chainId=" + this.chainId + ", currency=" + this.currency + ", endTimestamp=" + this.endTimestamp + ", invoice=" + this.invoice + ", invoiceId=" + this.invoiceId + ", startTimestamp=" + this.startTimestamp + ", toAccountType=" + this.toAccountType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.chainId);
        dest.writeString(this.currency);
        Long l11 = this.endTimestamp;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.invoice);
        dest.writeString(this.invoiceId);
        Long l12 = this.startTimestamp;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.toAccountType);
    }

    public InvoiceResult(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable Long l12, @Nullable String str5) {
        this.chainId = str;
        this.currency = str2;
        this.endTimestamp = l11;
        this.invoice = str3;
        this.invoiceId = str4;
        this.startTimestamp = l12;
        this.toAccountType = str5;
    }
}
