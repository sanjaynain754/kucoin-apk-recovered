package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0013\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001bHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006'"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatAccountExtraInfo;", "Landroid/os/Parcelable;", "accountType", "", "keyType", JAnalysisConstants.Account.KEY_ACCOUNT, FiatAccountExtraInfo.PIX_CPF, "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountType", "()Ljava/lang/String;", "getKeyType", "getAccount", "getCpf", "getReason", "isPixCPFType", "", "isPixBankType", "isTexType", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatAccountExtraInfo implements Parcelable {

    @NotNull
    public static final String ACCOUNT_PIX = "PIX";

    @NotNull
    public static final String ACCOUNT_TED = "TED";

    @NotNull
    public static final String PIX_BANK = "bankaccount";

    @NotNull
    public static final String PIX_CPF = "cpf";

    @Nullable
    private final String account;

    @Nullable
    private final String accountType;

    @Nullable
    private final String cpf;

    @Nullable
    private final String keyType;

    @SerializedName("reason")
    @Nullable
    private final String reason;

    @NotNull
    public static final Parcelable.Creator<FiatAccountExtraInfo> CREATOR = new Creator();

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<FiatAccountExtraInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAccountExtraInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FiatAccountExtraInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FiatAccountExtraInfo[] newArray(int i11) {
            return new FiatAccountExtraInfo[i11];
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
        if (!(other instanceof FiatAccountExtraInfo)) {
            return false;
        }
        FiatAccountExtraInfo fiatAccountExtraInfo = (FiatAccountExtraInfo) other;
        return Intrinsics.areEqual(this.accountType, fiatAccountExtraInfo.accountType) && Intrinsics.areEqual(this.keyType, fiatAccountExtraInfo.keyType) && Intrinsics.areEqual(this.account, fiatAccountExtraInfo.account) && Intrinsics.areEqual(this.cpf, fiatAccountExtraInfo.cpf) && Intrinsics.areEqual(this.reason, fiatAccountExtraInfo.reason);
    }

    public static /* synthetic */ FiatAccountExtraInfo copy$default(FiatAccountExtraInfo fiatAccountExtraInfo, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatAccountExtraInfo.accountType;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatAccountExtraInfo.keyType;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatAccountExtraInfo.account;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatAccountExtraInfo.cpf;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatAccountExtraInfo.reason;
        }
        String str6 = str5;
        String str7 = str3;
        return fiatAccountExtraInfo.copy(str, str2, str7, str4, str6);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCpf() {
        return this.cpf;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final FiatAccountExtraInfo copy(@Nullable String accountType, @Nullable String keyType, @Nullable String account, @Nullable String cpf, @Nullable String reason) {
        return new FiatAccountExtraInfo(accountType, keyType, account, cpf, reason);
    }

    @Nullable
    public final String getAccount() {
        return this.account;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getCpf() {
        return this.cpf;
    }

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        String str = this.accountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.keyType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.account;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cpf;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reason;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean isPixBankType() {
        return Intrinsics.areEqual(this.accountType, ACCOUNT_PIX) && Intrinsics.areEqual(this.keyType, PIX_BANK);
    }

    public final boolean isPixCPFType() {
        return Intrinsics.areEqual(this.accountType, ACCOUNT_PIX) && Intrinsics.areEqual(this.keyType, PIX_CPF);
    }

    public final boolean isTexType() {
        return Intrinsics.areEqual(this.accountType, ACCOUNT_TED);
    }

    @NotNull
    public String toString() {
        return "FiatAccountExtraInfo(accountType=" + this.accountType + ", keyType=" + this.keyType + ", account=" + this.account + ", cpf=" + this.cpf + ", reason=" + this.reason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType);
        dest.writeString(this.keyType);
        dest.writeString(this.account);
        dest.writeString(this.cpf);
        dest.writeString(this.reason);
    }

    public FiatAccountExtraInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.accountType = str;
        this.keyType = str2;
        this.account = str3;
        this.cpf = str4;
        this.reason = str5;
    }
}
