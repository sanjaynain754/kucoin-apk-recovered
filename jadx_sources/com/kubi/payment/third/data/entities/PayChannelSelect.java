package com.kubi.payment.third.data.entities;

import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ThirdQuote.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0001=B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J¨\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u001e\u0010\u0011\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010$\"\u0004\b%\u0010&¨\u0006>"}, m90084d2 = {"Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "", AppsFlyerProperties.CHANNEL, "", FirebaseAnalytics.Param.CURRENCY, "currencyAmount", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "selected", "payDetail", "Lcom/kubi/payment/third/data/entities/PayDetail;", "activityMessage", "iconUrl", "disclaimer", "secondIconUrl", "secondActivityMessage", "secondActivityMessageUrl", "isChecked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/payment/third/data/entities/PayDetail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getChannel", "()Ljava/lang/String;", "getCurrency", "getCurrencyAmount", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSelected", "getPayDetail", "()Lcom/kubi/payment/third/data/entities/PayDetail;", "getActivityMessage", "getIconUrl", "getDisclaimer", "getSecondIconUrl", "getSecondActivityMessage", "getSecondActivityMessageUrl", "()Z", "setChecked", "(Z)V", "isSimplex", "getChannelName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/kubi/payment/third/data/entities/PayDetail;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/kubi/payment/third/data/entities/PayChannelSelect;", "equals", "other", "hashCode", "", "toString", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PayChannelSelect {

    @NotNull
    public static final String BANXA = "banxa";

    @NotNull
    public static final String BANXA_AU = "banxa_au";

    @NotNull
    public static final String BTCDIRECT = "btcdirect";

    @NotNull
    public static final String COINTR = "cointr";

    @NotNull
    public static final String LEGEND_TRADE = "legendtrading";

    @NotNull
    public static final String MERCURYO = "mercuryo";

    @NotNull
    public static final String MOBILUM = "mobilum";

    @NotNull
    public static final String SIMPLEX = "simplex";

    @Nullable
    private final String activityMessage;

    @Nullable
    private final String channel;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyAmount;

    @Nullable
    private final String disclaimer;

    @Nullable
    private final Boolean enable;

    @Nullable
    private final String iconUrl;

    @Expose(deserialize = false, serialize = false)
    private boolean isChecked;

    @Nullable
    private final PayDetail payDetail;

    @Nullable
    private final String secondActivityMessage;

    @Nullable
    private final String secondActivityMessageUrl;

    @Nullable
    private final String secondIconUrl;

    @Nullable
    private final Boolean selected;

    public PayChannelSelect(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable PayDetail payDetail, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, boolean z11) {
        this.channel = str;
        this.currency = str2;
        this.currencyAmount = str3;
        this.enable = bool;
        this.selected = bool2;
        this.payDetail = payDetail;
        this.activityMessage = str4;
        this.iconUrl = str5;
        this.disclaimer = str6;
        this.secondIconUrl = str7;
        this.secondActivityMessage = str8;
        this.secondActivityMessageUrl = str9;
        this.isChecked = z11;
    }

    public static /* synthetic */ PayChannelSelect copy$default(PayChannelSelect payChannelSelect, String str, String str2, String str3, Boolean bool, Boolean bool2, PayDetail payDetail, String str4, String str5, String str6, String str7, String str8, String str9, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = payChannelSelect.channel;
        }
        return payChannelSelect.copy(str, (i11 & 2) != 0 ? payChannelSelect.currency : str2, (i11 & 4) != 0 ? payChannelSelect.currencyAmount : str3, (i11 & 8) != 0 ? payChannelSelect.enable : bool, (i11 & 16) != 0 ? payChannelSelect.selected : bool2, (i11 & 32) != 0 ? payChannelSelect.payDetail : payDetail, (i11 & 64) != 0 ? payChannelSelect.activityMessage : str4, (i11 & 128) != 0 ? payChannelSelect.iconUrl : str5, (i11 & 256) != 0 ? payChannelSelect.disclaimer : str6, (i11 & 512) != 0 ? payChannelSelect.secondIconUrl : str7, (i11 & 1024) != 0 ? payChannelSelect.secondActivityMessage : str8, (i11 & 2048) != 0 ? payChannelSelect.secondActivityMessageUrl : str9, (i11 & 4096) != 0 ? payChannelSelect.isChecked : z11);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayChannelSelect)) {
            return false;
        }
        PayChannelSelect payChannelSelect = (PayChannelSelect) other;
        return Intrinsics.areEqual(this.channel, payChannelSelect.channel) && Intrinsics.areEqual(this.currency, payChannelSelect.currency) && Intrinsics.areEqual(this.currencyAmount, payChannelSelect.currencyAmount) && Intrinsics.areEqual(this.enable, payChannelSelect.enable) && Intrinsics.areEqual(this.selected, payChannelSelect.selected) && Intrinsics.areEqual(this.payDetail, payChannelSelect.payDetail) && Intrinsics.areEqual(this.activityMessage, payChannelSelect.activityMessage) && Intrinsics.areEqual(this.iconUrl, payChannelSelect.iconUrl) && Intrinsics.areEqual(this.disclaimer, payChannelSelect.disclaimer) && Intrinsics.areEqual(this.secondIconUrl, payChannelSelect.secondIconUrl) && Intrinsics.areEqual(this.secondActivityMessage, payChannelSelect.secondActivityMessage) && Intrinsics.areEqual(this.secondActivityMessageUrl, payChannelSelect.secondActivityMessageUrl) && this.isChecked == payChannelSelect.isChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSecondIconUrl() {
        return this.secondIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSecondActivityMessage() {
        return this.secondActivityMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSecondActivityMessageUrl() {
        return this.secondActivityMessageUrl;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PayDetail getPayDetail() {
        return this.payDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActivityMessage() {
        return this.activityMessage;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final PayChannelSelect copy(@Nullable String channel, @Nullable String currency, @Nullable String currencyAmount, @Nullable Boolean enable, @Nullable Boolean selected, @Nullable PayDetail payDetail, @Nullable String activityMessage, @Nullable String iconUrl, @Nullable String disclaimer, @Nullable String secondIconUrl, @Nullable String secondActivityMessage, @Nullable String secondActivityMessageUrl, boolean isChecked) {
        return new PayChannelSelect(channel, currency, currencyAmount, enable, selected, payDetail, activityMessage, iconUrl, disclaimer, secondIconUrl, secondActivityMessage, secondActivityMessageUrl, isChecked);
    }

    @Nullable
    public final String getActivityMessage() {
        return this.activityMessage;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @NotNull
    public final String getChannelName() {
        String str = this.channel;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (Intrinsics.areEqual(this.channel, LEGEND_TRADE)) {
            return "Legend Trading";
        }
        if (Intrinsics.areEqual(this.channel, BANXA_AU)) {
            return "Banxa";
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            String strSubstring = this.channel.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String upperCase = strSubstring.toUpperCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb2.append(upperCase);
            String strSubstring2 = this.channel.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            sb2.append(strSubstring2);
            return sb2.toString();
        } catch (Exception unused) {
            return this.channel;
        }
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    @Nullable
    public final String getDisclaimer() {
        return this.disclaimer;
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final PayDetail getPayDetail() {
        return this.payDetail;
    }

    @Nullable
    public final String getSecondActivityMessage() {
        return this.secondActivityMessage;
    }

    @Nullable
    public final String getSecondActivityMessageUrl() {
        return this.secondActivityMessageUrl;
    }

    @Nullable
    public final String getSecondIconUrl() {
        return this.secondIconUrl;
    }

    @Nullable
    public final Boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        String str = this.channel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyAmount;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        PayDetail payDetail = this.payDetail;
        int iHashCode6 = (iHashCode5 + (payDetail == null ? 0 : payDetail.hashCode())) * 31;
        String str4 = this.activityMessage;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.disclaimer;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.secondIconUrl;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.secondActivityMessage;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.secondActivityMessageUrl;
        return ((iHashCode11 + (str9 != null ? str9.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final boolean isSimplex() {
        return Intrinsics.areEqual(this.channel, SIMPLEX);
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    @NotNull
    public String toString() {
        return "PayChannelSelect(channel=" + this.channel + ", currency=" + this.currency + ", currencyAmount=" + this.currencyAmount + ", enable=" + this.enable + ", selected=" + this.selected + ", payDetail=" + this.payDetail + ", activityMessage=" + this.activityMessage + ", iconUrl=" + this.iconUrl + ", disclaimer=" + this.disclaimer + ", secondIconUrl=" + this.secondIconUrl + ", secondActivityMessage=" + this.secondActivityMessage + ", secondActivityMessageUrl=" + this.secondActivityMessageUrl + ", isChecked=" + this.isChecked + ')';
    }

    public /* synthetic */ PayChannelSelect(String str, String str2, String str3, Boolean bool, Boolean bool2, PayDetail payDetail, String str4, String str5, String str6, String str7, String str8, String str9, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bool, bool2, payDetail, str4, str5, str6, str7, str8, str9, (i11 & 4096) != 0 ? false : z11);
    }
}
