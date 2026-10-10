package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u00069"}, m90084d2 = {"Lcom/kubi/otc/entity/ReservedFileds;", "Landroid/os/Parcelable;", HintConstants.AUTOFILL_HINT_PHONE, "", "payeesAddress", "transitNumber", "institutionNumber", "swiftNumber", "bankAddress", "payTypeName", "accountType", "bankBic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "getPayeesAddress", "setPayeesAddress", "getTransitNumber", "setTransitNumber", "getInstitutionNumber", "setInstitutionNumber", "getSwiftNumber", "setSwiftNumber", "getBankAddress", "setBankAddress", "getPayTypeName", "setPayTypeName", "getAccountType", "setAccountType", "getBankBic", "setBankBic", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ReservedFileds implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ReservedFileds> CREATOR = new Creator();

    @Nullable
    private String accountType;

    @Nullable
    private String bankAddress;

    @Nullable
    private String bankBic;

    @Nullable
    private String institutionNumber;

    @Nullable
    private String payTypeName;

    @Nullable
    private String payeesAddress;

    @Nullable
    private String phone;

    @Nullable
    private String swiftNumber;

    @Nullable
    private String transitNumber;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ReservedFileds> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReservedFileds createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReservedFileds(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReservedFileds[] newArray(int i11) {
            return new ReservedFileds[i11];
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
        if (!(other instanceof ReservedFileds)) {
            return false;
        }
        ReservedFileds reservedFileds = (ReservedFileds) other;
        return Intrinsics.areEqual(this.phone, reservedFileds.phone) && Intrinsics.areEqual(this.payeesAddress, reservedFileds.payeesAddress) && Intrinsics.areEqual(this.transitNumber, reservedFileds.transitNumber) && Intrinsics.areEqual(this.institutionNumber, reservedFileds.institutionNumber) && Intrinsics.areEqual(this.swiftNumber, reservedFileds.swiftNumber) && Intrinsics.areEqual(this.bankAddress, reservedFileds.bankAddress) && Intrinsics.areEqual(this.payTypeName, reservedFileds.payTypeName) && Intrinsics.areEqual(this.accountType, reservedFileds.accountType) && Intrinsics.areEqual(this.bankBic, reservedFileds.bankBic);
    }

    public static /* synthetic */ ReservedFileds copy$default(ReservedFileds reservedFileds, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reservedFileds.phone;
        }
        if ((i11 & 2) != 0) {
            str2 = reservedFileds.payeesAddress;
        }
        if ((i11 & 4) != 0) {
            str3 = reservedFileds.transitNumber;
        }
        if ((i11 & 8) != 0) {
            str4 = reservedFileds.institutionNumber;
        }
        if ((i11 & 16) != 0) {
            str5 = reservedFileds.swiftNumber;
        }
        if ((i11 & 32) != 0) {
            str6 = reservedFileds.bankAddress;
        }
        if ((i11 & 64) != 0) {
            str7 = reservedFileds.payTypeName;
        }
        if ((i11 & 128) != 0) {
            str8 = reservedFileds.accountType;
        }
        if ((i11 & 256) != 0) {
            str9 = reservedFileds.bankBic;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return reservedFileds.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPayeesAddress() {
        return this.payeesAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransitNumber() {
        return this.transitNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInstitutionNumber() {
        return this.institutionNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSwiftNumber() {
        return this.swiftNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBankAddress() {
        return this.bankAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBankBic() {
        return this.bankBic;
    }

    @NotNull
    public final ReservedFileds copy(@Nullable String phone, @Nullable String payeesAddress, @Nullable String transitNumber, @Nullable String institutionNumber, @Nullable String swiftNumber, @Nullable String bankAddress, @Nullable String payTypeName, @Nullable String accountType, @Nullable String bankBic) {
        return new ReservedFileds(phone, payeesAddress, transitNumber, institutionNumber, swiftNumber, bankAddress, payTypeName, accountType, bankBic);
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getBankAddress() {
        return this.bankAddress;
    }

    @Nullable
    public final String getBankBic() {
        return this.bankBic;
    }

    @Nullable
    public final String getInstitutionNumber() {
        return this.institutionNumber;
    }

    @Nullable
    public final String getPayTypeName() {
        return this.payTypeName;
    }

    @Nullable
    public final String getPayeesAddress() {
        return this.payeesAddress;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final String getSwiftNumber() {
        return this.swiftNumber;
    }

    @Nullable
    public final String getTransitNumber() {
        return this.transitNumber;
    }

    public int hashCode() {
        String str = this.phone;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.payeesAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transitNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.institutionNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.swiftNumber;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bankAddress;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.payTypeName;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.accountType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.bankBic;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final void setAccountType(@Nullable String str) {
        this.accountType = str;
    }

    public final void setBankAddress(@Nullable String str) {
        this.bankAddress = str;
    }

    public final void setBankBic(@Nullable String str) {
        this.bankBic = str;
    }

    public final void setInstitutionNumber(@Nullable String str) {
        this.institutionNumber = str;
    }

    public final void setPayTypeName(@Nullable String str) {
        this.payTypeName = str;
    }

    public final void setPayeesAddress(@Nullable String str) {
        this.payeesAddress = str;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setSwiftNumber(@Nullable String str) {
        this.swiftNumber = str;
    }

    public final void setTransitNumber(@Nullable String str) {
        this.transitNumber = str;
    }

    @NotNull
    public String toString() {
        return "ReservedFileds(phone=" + this.phone + ", payeesAddress=" + this.payeesAddress + ", transitNumber=" + this.transitNumber + ", institutionNumber=" + this.institutionNumber + ", swiftNumber=" + this.swiftNumber + ", bankAddress=" + this.bankAddress + ", payTypeName=" + this.payTypeName + ", accountType=" + this.accountType + ", bankBic=" + this.bankBic + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.phone);
        dest.writeString(this.payeesAddress);
        dest.writeString(this.transitNumber);
        dest.writeString(this.institutionNumber);
        dest.writeString(this.swiftNumber);
        dest.writeString(this.bankAddress);
        dest.writeString(this.payTypeName);
        dest.writeString(this.accountType);
        dest.writeString(this.bankBic);
    }

    public ReservedFileds(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.phone = str;
        this.payeesAddress = str2;
        this.transitNumber = str3;
        this.institutionNumber = str4;
        this.swiftNumber = str5;
        this.bankAddress = str6;
        this.payTypeName = str7;
        this.accountType = str8;
        this.bankBic = str9;
    }
}
