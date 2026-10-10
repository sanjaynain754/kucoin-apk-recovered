package com.kubi.payment.fasttrade;

import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.payment.fasttrade.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FastTradeChannelHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/FastTradeChannelHelper;", "", "<init>", "()V", "equalsIgnoreCase", "", "str1", "", "str2", AppsFlyerProperties.CHANNEL, "Lcom/kubi/payment/fasttrade/FastTradeChannel;", "paymentMethodCode", "channelId", "channel$PaymentLib_googleRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FastTradeChannelHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FastTradeChannelHelper f38726a = new FastTradeChannelHelper();

    /* JADX INFO: renamed from: b */
    public final boolean m46725b(String str, String str2) {
        return StringsKt.equals(str, str2, true);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FastTradeChannel m46724a(@NotNull String paymentMethodCode, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        if (m46725b(paymentMethodCode, "checkout_pci") && m46725b(channelId, "checkout_pci")) {
            return new FastTradeChannel.BankCard(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "checkout_pci_au") && m46725b(channelId, "checkout_pci_au")) {
            return new FastTradeChannel.BankCard(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "checkout_pci_eu") && m46725b(channelId, "checkout_pci_eu")) {
            return new FastTradeChannel.BankCard(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "google_pay") && m46725b(channelId, "checkout_pci")) {
            return new FastTradeChannel.GooglePay(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "google_pay_au") && m46725b(channelId, "checkout_pci_au")) {
            return new FastTradeChannel.GooglePay(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "google_pay_eu") && m46725b(channelId, "checkout_pci_eu")) {
            return new FastTradeChannel.GooglePay(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "balance") && m46725b(channelId, "balance")) {
            return new FastTradeChannel.Balance(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "balance_eu") && m46725b(channelId, "balance_eu")) {
            return new FastTradeChannel.Balance(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "balance_au") && m46725b(channelId, "balance_au")) {
            return new FastTradeChannel.Balance(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "revolut") && m46725b(channelId, "revolut")) {
            return new FastTradeChannel.Revolut(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "blik") && m46725b(channelId, "zen")) {
            return new FastTradeChannel.Blik(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "p2p_express") && m46725b(channelId, "p2p")) {
            return new FastTradeChannel.P2P(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "third_party") && m46725b(channelId, "third_party")) {
            return new FastTradeChannel.ThirdParty(paymentMethodCode, channelId);
        }
        if (m46725b(paymentMethodCode, "third_party") && m46725b(channelId, "PayID")) {
            return new FastTradeChannel.ThirdPartyPayID(paymentMethodCode, channelId);
        }
        if ((m46725b(paymentMethodCode, "pm_ivy_eu") && m46725b(channelId, "ivy_eu")) || (m46725b(paymentMethodCode, "pm_ivy") && m46725b(channelId, "ivy"))) {
            return new FastTradeChannel.Ivy(paymentMethodCode, channelId);
        }
        return ((m46725b(paymentMethodCode, "pm_zenpay") && m46725b(channelId, "zenpay")) || (m46725b(paymentMethodCode, "pm_zenpay_eu") && m46725b(channelId, "zenpay_eu"))) ? new FastTradeChannel.ZenPay(paymentMethodCode, channelId) : new FastTradeChannel.UnSupportedChannel(paymentMethodCode, channelId);
    }
}
