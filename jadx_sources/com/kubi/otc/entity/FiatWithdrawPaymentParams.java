package com.kubi.otc.entity;

import androidx.annotation.Keep;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u001f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0003Jy\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR(\u0010\n\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006'"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatWithdrawPaymentParams;", "", "amount", "", "channelId", "paymentMethodCode", FirebaseAnalytics.Param.CURRENCY, "paymentName", "payoutAccountId", "source", JAnalysisConstants.ACCOUNT_EXTRA_ATTR, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAmount", "()Ljava/lang/String;", "getChannelId", "getPaymentMethodCode", "getCurrency", "getPaymentName", "getPayoutAccountId", "getSource", "getExtra", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatWithdrawPaymentParams {

    @Nullable
    private final String amount;

    @Nullable
    private final String channelId;

    @Nullable
    private final String currency;

    @SerializedName(JAnalysisConstants.ACCOUNT_EXTRA_ATTR)
    @Nullable
    private final Map<String, Object> extra;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String paymentName;

    @Nullable
    private final String payoutAccountId;

    @Nullable
    private final String source;

    public FiatWithdrawPaymentParams(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable Map<String, ? extends Object> map) {
        this.amount = str;
        this.channelId = str2;
        this.paymentMethodCode = str3;
        this.currency = str4;
        this.paymentName = str5;
        this.payoutAccountId = str6;
        this.source = str7;
        this.extra = map;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatWithdrawPaymentParams)) {
            return false;
        }
        FiatWithdrawPaymentParams fiatWithdrawPaymentParams = (FiatWithdrawPaymentParams) other;
        return Intrinsics.areEqual(this.amount, fiatWithdrawPaymentParams.amount) && Intrinsics.areEqual(this.channelId, fiatWithdrawPaymentParams.channelId) && Intrinsics.areEqual(this.paymentMethodCode, fiatWithdrawPaymentParams.paymentMethodCode) && Intrinsics.areEqual(this.currency, fiatWithdrawPaymentParams.currency) && Intrinsics.areEqual(this.paymentName, fiatWithdrawPaymentParams.paymentName) && Intrinsics.areEqual(this.payoutAccountId, fiatWithdrawPaymentParams.payoutAccountId) && Intrinsics.areEqual(this.source, fiatWithdrawPaymentParams.source) && Intrinsics.areEqual(this.extra, fiatWithdrawPaymentParams.extra);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiatWithdrawPaymentParams copy$default(FiatWithdrawPaymentParams fiatWithdrawPaymentParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatWithdrawPaymentParams.amount;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatWithdrawPaymentParams.channelId;
        }
        if ((i11 & 4) != 0) {
            str3 = fiatWithdrawPaymentParams.paymentMethodCode;
        }
        if ((i11 & 8) != 0) {
            str4 = fiatWithdrawPaymentParams.currency;
        }
        if ((i11 & 16) != 0) {
            str5 = fiatWithdrawPaymentParams.paymentName;
        }
        if ((i11 & 32) != 0) {
            str6 = fiatWithdrawPaymentParams.payoutAccountId;
        }
        if ((i11 & 64) != 0) {
            str7 = fiatWithdrawPaymentParams.source;
        }
        if ((i11 & 128) != 0) {
            map = fiatWithdrawPaymentParams.extra;
        }
        String str8 = str7;
        Map map2 = map;
        String str9 = str5;
        String str10 = str6;
        return fiatWithdrawPaymentParams.copy(str, str2, str3, str4, str9, str10, str8, map2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPaymentName() {
        return this.paymentName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final Map<String, Object> component8() {
        return this.extra;
    }

    @NotNull
    public final FiatWithdrawPaymentParams copy(@Nullable String amount, @Nullable String channelId, @Nullable String paymentMethodCode, @Nullable String currency, @Nullable String paymentName, @Nullable String payoutAccountId, @Nullable String source, @Nullable Map<String, ? extends Object> extra) {
        return new FiatWithdrawPaymentParams(amount, channelId, paymentMethodCode, currency, paymentName, payoutAccountId, source, extra);
    }

    @Nullable
    public final String getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getPaymentName() {
        return this.paymentName;
    }

    @Nullable
    public final String getPayoutAccountId() {
        return this.payoutAccountId;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.amount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channelId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.payoutAccountId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.source;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, Object> map = this.extra;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiatWithdrawPaymentParams(amount=" + this.amount + ", channelId=" + this.channelId + ", paymentMethodCode=" + this.paymentMethodCode + ", currency=" + this.currency + ", paymentName=" + this.paymentName + ", payoutAccountId=" + this.payoutAccountId + ", source=" + this.source + ", extra=" + this.extra + ')';
    }

    public /* synthetic */ FiatWithdrawPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? "android" : str7, map);
    }
}
