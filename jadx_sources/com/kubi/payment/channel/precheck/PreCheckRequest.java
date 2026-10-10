package com.kubi.payment.channel.precheck;

import androidx.annotation.Keep;
import androidx.fragment.app.FragmentManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PreCheckRequest.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "paymentMethodCode", "", "channelId", "fiatCurrency", "tradeType", "<init>", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getPaymentMethodCode", "()Ljava/lang/String;", "getChannelId", "getFiatCurrency", "getTradeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PreCheckRequest {

    @Nullable
    private final String channelId;

    @Nullable
    private final String fiatCurrency;

    @NotNull
    private final FragmentManager fragmentManager;

    @Nullable
    private final String paymentMethodCode;

    @Nullable
    private final String tradeType;

    public PreCheckRequest(@NotNull FragmentManager fragmentManager, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.fragmentManager = fragmentManager;
        this.paymentMethodCode = str;
        this.channelId = str2;
        this.fiatCurrency = str3;
        this.tradeType = str4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreCheckRequest)) {
            return false;
        }
        PreCheckRequest preCheckRequest = (PreCheckRequest) other;
        return Intrinsics.areEqual(this.fragmentManager, preCheckRequest.fragmentManager) && Intrinsics.areEqual(this.paymentMethodCode, preCheckRequest.paymentMethodCode) && Intrinsics.areEqual(this.channelId, preCheckRequest.channelId) && Intrinsics.areEqual(this.fiatCurrency, preCheckRequest.fiatCurrency) && Intrinsics.areEqual(this.tradeType, preCheckRequest.tradeType);
    }

    public static /* synthetic */ PreCheckRequest copy$default(PreCheckRequest preCheckRequest, FragmentManager fragmentManager, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fragmentManager = preCheckRequest.fragmentManager;
        }
        if ((i11 & 2) != 0) {
            str = preCheckRequest.paymentMethodCode;
        }
        if ((i11 & 4) != 0) {
            str2 = preCheckRequest.channelId;
        }
        if ((i11 & 8) != 0) {
            str3 = preCheckRequest.fiatCurrency;
        }
        if ((i11 & 16) != 0) {
            str4 = preCheckRequest.tradeType;
        }
        String str5 = str4;
        String str6 = str2;
        return preCheckRequest.copy(fragmentManager, str, str6, str3, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTradeType() {
        return this.tradeType;
    }

    @NotNull
    public final PreCheckRequest copy(@NotNull FragmentManager fragmentManager, @Nullable String paymentMethodCode, @Nullable String channelId, @Nullable String fiatCurrency, @Nullable String tradeType) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        return new PreCheckRequest(fragmentManager, paymentMethodCode, channelId, fiatCurrency, tradeType);
    }

    @Nullable
    public final String getChannelId() {
        return this.channelId;
    }

    @Nullable
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    @NotNull
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    @Nullable
    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    @Nullable
    public final String getTradeType() {
        return this.tradeType;
    }

    public int hashCode() {
        int iHashCode = this.fragmentManager.hashCode() * 31;
        String str = this.paymentMethodCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.channelId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fiatCurrency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tradeType;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PreCheckRequest(fragmentManager=" + this.fragmentManager + ", paymentMethodCode=" + this.paymentMethodCode + ", channelId=" + this.channelId + ", fiatCurrency=" + this.fiatCurrency + ", tradeType=" + this.tradeType + ')';
    }

    public /* synthetic */ PreCheckRequest(FragmentManager fragmentManager, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentManager, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }
}
