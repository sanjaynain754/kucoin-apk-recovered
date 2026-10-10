package com.kubi.payment.fast.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Balance.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/Balance;", "", "<init>", "()V", "Request", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Balance {

    /* JADX INFO: compiled from: Balance.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/Balance$Request;", "", FirebaseAnalytics.Param.CURRENCY, "", "sceneCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getSceneCode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String currency;

        @SerializedName("sceneCode")
        @Nullable
        private final String sceneCode;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.currency, request.currency) && Intrinsics.areEqual(this.sceneCode, request.sceneCode);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.currency;
            }
            if ((i11 & 2) != 0) {
                str2 = request.sceneCode;
            }
            return request.copy(str, str2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSceneCode() {
            return this.sceneCode;
        }

        @NotNull
        public final Request copy(@Nullable String currency, @Nullable String sceneCode) {
            return new Request(currency, sceneCode);
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getSceneCode() {
            return this.sceneCode;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sceneCode;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(currency=" + this.currency + ", sceneCode=" + this.sceneCode + ')';
        }

        public Request(@Nullable String str, @Nullable String str2) {
            this.currency = str;
            this.sceneCode = str2;
        }
    }

    /* JADX INFO: compiled from: Balance.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/Balance$Response;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "totalBalance", "holdBalance", "availableBalance", "availableBalanceV2", "canWithdrawBalance", "canWithdrawBalanceV2", "multiAccount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCurrency", "()Ljava/lang/String;", "getTotalBalance", "getHoldBalance", "getAvailableBalance", "getAvailableBalanceV2", "getCanWithdrawBalance", "getCanWithdrawBalanceV2", "getMultiAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/kubi/payment/fast/data/entities/Balance$Response;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Response> CREATOR = new C20499a();

        @SerializedName("availableBalance")
        @Nullable
        private final String availableBalance;

        @SerializedName("availableBalanceV2")
        @Nullable
        private final String availableBalanceV2;

        @SerializedName("payoutBalance")
        @Nullable
        private final String canWithdrawBalance;

        @SerializedName("payoutBalanceV2")
        @Nullable
        private final String canWithdrawBalanceV2;

        @SerializedName(FirebaseAnalytics.Param.CURRENCY)
        @Nullable
        private final String currency;

        @SerializedName("holdBalance")
        @Nullable
        private final String holdBalance;

        @SerializedName("multiAccount")
        @Nullable
        private final Boolean multiAccount;

        @SerializedName("totalBalance")
        @Nullable
        private final String totalBalance;

        /* JADX INFO: renamed from: com.kubi.payment.fast.data.entities.Balance$Response$a */
        /* JADX INFO: compiled from: Balance.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class C20499a implements Parcelable.Creator<Response> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Response createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Response(string, string2, string3, string4, string5, string6, string7, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Response[] newArray(int i11) {
                return new Response[i11];
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
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.currency, response.currency) && Intrinsics.areEqual(this.totalBalance, response.totalBalance) && Intrinsics.areEqual(this.holdBalance, response.holdBalance) && Intrinsics.areEqual(this.availableBalance, response.availableBalance) && Intrinsics.areEqual(this.availableBalanceV2, response.availableBalanceV2) && Intrinsics.areEqual(this.canWithdrawBalance, response.canWithdrawBalance) && Intrinsics.areEqual(this.canWithdrawBalanceV2, response.canWithdrawBalanceV2) && Intrinsics.areEqual(this.multiAccount, response.multiAccount);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.currency;
            }
            if ((i11 & 2) != 0) {
                str2 = response.totalBalance;
            }
            if ((i11 & 4) != 0) {
                str3 = response.holdBalance;
            }
            if ((i11 & 8) != 0) {
                str4 = response.availableBalance;
            }
            if ((i11 & 16) != 0) {
                str5 = response.availableBalanceV2;
            }
            if ((i11 & 32) != 0) {
                str6 = response.canWithdrawBalance;
            }
            if ((i11 & 64) != 0) {
                str7 = response.canWithdrawBalanceV2;
            }
            if ((i11 & 128) != 0) {
                bool = response.multiAccount;
            }
            String str8 = str7;
            Boolean bool2 = bool;
            String str9 = str5;
            String str10 = str6;
            return response.copy(str, str2, str3, str4, str9, str10, str8, bool2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTotalBalance() {
            return this.totalBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getHoldBalance() {
            return this.holdBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getAvailableBalanceV2() {
            return this.availableBalanceV2;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getCanWithdrawBalance() {
            return this.canWithdrawBalance;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getCanWithdrawBalanceV2() {
            return this.canWithdrawBalanceV2;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final Boolean getMultiAccount() {
            return this.multiAccount;
        }

        @NotNull
        public final Response copy(@Nullable String currency, @Nullable String totalBalance, @Nullable String holdBalance, @Nullable String availableBalance, @Nullable String availableBalanceV2, @Nullable String canWithdrawBalance, @Nullable String canWithdrawBalanceV2, @Nullable Boolean multiAccount) {
            return new Response(currency, totalBalance, holdBalance, availableBalance, availableBalanceV2, canWithdrawBalance, canWithdrawBalanceV2, multiAccount);
        }

        @Nullable
        public final String getAvailableBalance() {
            return this.availableBalance;
        }

        @Nullable
        public final String getAvailableBalanceV2() {
            return this.availableBalanceV2;
        }

        @Nullable
        public final String getCanWithdrawBalance() {
            return this.canWithdrawBalance;
        }

        @Nullable
        public final String getCanWithdrawBalanceV2() {
            return this.canWithdrawBalanceV2;
        }

        @Nullable
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        public final String getHoldBalance() {
            return this.holdBalance;
        }

        @Nullable
        public final Boolean getMultiAccount() {
            return this.multiAccount;
        }

        @Nullable
        public final String getTotalBalance() {
            return this.totalBalance;
        }

        public int hashCode() {
            String str = this.currency;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.totalBalance;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.holdBalance;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.availableBalance;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.availableBalanceV2;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.canWithdrawBalance;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.canWithdrawBalanceV2;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.multiAccount;
            return iHashCode7 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(currency=" + this.currency + ", totalBalance=" + this.totalBalance + ", holdBalance=" + this.holdBalance + ", availableBalance=" + this.availableBalance + ", availableBalanceV2=" + this.availableBalanceV2 + ", canWithdrawBalance=" + this.canWithdrawBalance + ", canWithdrawBalanceV2=" + this.canWithdrawBalanceV2 + ", multiAccount=" + this.multiAccount + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.currency);
            dest.writeString(this.totalBalance);
            dest.writeString(this.holdBalance);
            dest.writeString(this.availableBalance);
            dest.writeString(this.availableBalanceV2);
            dest.writeString(this.canWithdrawBalance);
            dest.writeString(this.canWithdrawBalanceV2);
            Boolean bool = this.multiAccount;
            if (bool == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Boolean bool) {
            this.currency = str;
            this.totalBalance = str2;
            this.holdBalance = str3;
            this.availableBalance = str4;
            this.availableBalanceV2 = str5;
            this.canWithdrawBalance = str6;
            this.canWithdrawBalanceV2 = str7;
            this.multiAccount = bool;
        }
    }
}
