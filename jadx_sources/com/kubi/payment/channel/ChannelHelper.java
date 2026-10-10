package com.kubi.payment.channel;

import com.appsflyer.AppsFlyerProperties;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.payment.channel.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChannelHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/channel/ChannelHelper;", "", "<init>", "()V", AppsFlyerProperties.CHANNEL, "Lcom/kubi/payment/channel/Channel;", "paymentMethodCode", "", "channelId", "channel$PaymentLib_googleRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChannelHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChannelHelper f38219a = new ChannelHelper();

    /* JADX INFO: renamed from: b */
    public static final boolean m45661b(String str, String str2, String str3, String str4) {
        return StringsKt.equals(str, str3, true) && StringsKt.equals(str2, str4, true);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final Channel m45662a(@NotNull String paymentMethodCode, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        if (StringsKt.equals(paymentMethodCode, "capitual", true) && StringsKt.equals(channelId, "capitual", true)) {
            return new Channel.Capitual(paymentMethodCode, channelId);
        }
        if (StringsKt.equals(paymentMethodCode, "advcash", true) && StringsKt.equals(channelId, "advcash", true)) {
            return new Channel.Advcash(paymentMethodCode, channelId);
        }
        if ((StringsKt.equals(paymentMethodCode, "bank_transfer_ziraat", true) || StringsKt.equals(paymentMethodCode, "pm_vakif_tr", true)) && StringsKt.equals(channelId, "birapi", true)) {
            return new Channel.BirApi(paymentMethodCode, channelId);
        }
        if ((StringsKt.equals(paymentMethodCode, "REGULAR_BANK_TRANSFER", true) && StringsKt.equals(channelId, "ee", true)) || ((StringsKt.equals(paymentMethodCode, "REGULAR_BANK_TRANSFER_EU", true) && StringsKt.equals(channelId, "ee_eu", true)) || ((StringsKt.equals(paymentMethodCode, "pm_ee_kyb", true) && StringsKt.equals(channelId, "ee_kyb", true)) || (StringsKt.equals(paymentMethodCode, "pm_ee_kyb_eu", true) && StringsKt.equals(channelId, "ee_kyb_eu", true))))) {
            return new Channel.EasyEuro(paymentMethodCode, channelId);
        }
        if (StringsKt.equals(paymentMethodCode, "REGULAR_BANK_TRANSFER", true) && StringsKt.equals(channelId, "bcb", true)) {
            return new Channel.Bcb(paymentMethodCode, channelId);
        }
        if (StringsKt.equals(paymentMethodCode, "easy_bank_transfer_eur", true) && StringsKt.equals(channelId, "nuvei_apm", true)) {
            return new Channel.Nuvei(paymentMethodCode, channelId);
        }
        if (StringsKt.equals(paymentMethodCode, "bank_transfer_scb_th", true) && StringsKt.equals(channelId, "scb_th", true)) {
            return new Channel.Scb(paymentMethodCode, channelId);
        }
        if ((StringsKt.equals(paymentMethodCode, "capitual", true) || StringsKt.equals(paymentMethodCode, "bank_transfer_transfero", true)) && StringsKt.equals(channelId, "transfero", true)) {
            return new Channel.Transfero(paymentMethodCode, channelId);
        }
        if ((StringsKt.equals(paymentMethodCode, "bank_transfer_payid_au", true) || StringsKt.equals(paymentMethodCode, "bank_transfer_bsb_au", true)) && StringsKt.equals(channelId, "build_au", true)) {
            return new Channel.Build(paymentMethodCode, channelId);
        }
        return (m45661b(paymentMethodCode, channelId, "pm_ivy", "ivy") || m45661b(paymentMethodCode, channelId, "pm_ivy_eu", "ivy_eu")) ? new Channel.Ivy(paymentMethodCode, channelId) : new Channel.UnSupportedChannel(paymentMethodCode, channelId);
    }
}
