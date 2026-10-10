package com.kubi.payment.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Fee.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/payment/data/entities/Fee;", "", "<init>", "()V", "Response", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Fee {

    /* JADX INFO: compiled from: Fee.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/data/entities/Fee$Response;", "", "feeId", "", "fixedFeeRate", "fixedFee", "maxFee", "minFee", "feeAmount", "feeMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeeId", "()Ljava/lang/String;", "getFixedFeeRate", "getFixedFee", "getMaxFee", "getMinFee", "getFeeAmount", "getFeeMsg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @SerializedName("feeAmount")
        @Nullable
        private final String feeAmount;

        @SerializedName("feeId")
        @Nullable
        private final String feeId;

        @Nullable
        private final String feeMsg;

        @SerializedName("fixedFee")
        @Nullable
        private final String fixedFee;

        @SerializedName("fixedFeeRate")
        @Nullable
        private final String fixedFeeRate;

        @SerializedName("maxFee")
        @Nullable
        private final String maxFee;

        @SerializedName("minFee")
        @Nullable
        private final String minFee;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.feeId, response.feeId) && Intrinsics.areEqual(this.fixedFeeRate, response.fixedFeeRate) && Intrinsics.areEqual(this.fixedFee, response.fixedFee) && Intrinsics.areEqual(this.maxFee, response.maxFee) && Intrinsics.areEqual(this.minFee, response.minFee) && Intrinsics.areEqual(this.feeAmount, response.feeAmount) && Intrinsics.areEqual(this.feeMsg, response.feeMsg);
        }

        public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = response.feeId;
            }
            if ((i11 & 2) != 0) {
                str2 = response.fixedFeeRate;
            }
            if ((i11 & 4) != 0) {
                str3 = response.fixedFee;
            }
            if ((i11 & 8) != 0) {
                str4 = response.maxFee;
            }
            if ((i11 & 16) != 0) {
                str5 = response.minFee;
            }
            if ((i11 & 32) != 0) {
                str6 = response.feeAmount;
            }
            if ((i11 & 64) != 0) {
                str7 = response.feeMsg;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return response.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFeeId() {
            return this.feeId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFixedFeeRate() {
            return this.fixedFeeRate;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFixedFee() {
            return this.fixedFee;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMaxFee() {
            return this.maxFee;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMinFee() {
            return this.minFee;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getFeeMsg() {
            return this.feeMsg;
        }

        @NotNull
        public final Response copy(@Nullable String feeId, @Nullable String fixedFeeRate, @Nullable String fixedFee, @Nullable String maxFee, @Nullable String minFee, @Nullable String feeAmount, @Nullable String feeMsg) {
            return new Response(feeId, fixedFeeRate, fixedFee, maxFee, minFee, feeAmount, feeMsg);
        }

        @Nullable
        public final String getFeeAmount() {
            return this.feeAmount;
        }

        @Nullable
        public final String getFeeId() {
            return this.feeId;
        }

        @Nullable
        public final String getFeeMsg() {
            return this.feeMsg;
        }

        @Nullable
        public final String getFixedFee() {
            return this.fixedFee;
        }

        @Nullable
        public final String getFixedFeeRate() {
            return this.fixedFeeRate;
        }

        @Nullable
        public final String getMaxFee() {
            return this.maxFee;
        }

        @Nullable
        public final String getMinFee() {
            return this.minFee;
        }

        public int hashCode() {
            String str = this.feeId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fixedFeeRate;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fixedFee;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.maxFee;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.minFee;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.feeAmount;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.feeMsg;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(feeId=" + this.feeId + ", fixedFeeRate=" + this.fixedFeeRate + ", fixedFee=" + this.fixedFee + ", maxFee=" + this.maxFee + ", minFee=" + this.minFee + ", feeAmount=" + this.feeAmount + ", feeMsg=" + this.feeMsg + ')';
        }

        public Response(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.feeId = str;
            this.fixedFeeRate = str2;
            this.fixedFee = str3;
            this.maxFee = str4;
            this.minFee = str5;
            this.feeAmount = str6;
            this.feeMsg = str7;
        }
    }
}
