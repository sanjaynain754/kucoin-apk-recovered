package com.kubi.payment.flutter;

import com.kubi.router.core.Router;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.flutter.a, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FlutterNavigationHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007J*\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/payment/flutter/FlutterNavigationHelper;", "", "<init>", "()V", "launchRecurringResultPage", "", "orderId", "", "launchRecurringPlanDetailPage", "id", "launchEddPage", "tradeType", "paymentMethodCode", "channelId", "launchEEVerifyAccountPage", "fiatCurrency", "accountId", "launchP2PBlocklistPage", "launchP2PMarketPage", "waitDays", "", "launchP2PMerchantDetailsPage", "adId", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FlutterNavigationHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FlutterNavigationHelper f39477a = new FlutterNavigationHelper();

    /* JADX INFO: renamed from: a */
    public final void m48162a(@NotNull String paymentMethodCode, @NotNull String channelId, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/ee/verifyAccount", false, 2, null)).m4038a("paymentMethodCode", paymentMethodCode).m4038a("channelId", channelId).m4038a("fiatCurrency", str).m4038a("accountId", str2).m4048k();
    }

    /* JADX INFO: renamed from: b */
    public final void m48163b(@NotNull String tradeType, @NotNull String paymentMethodCode, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/channel/eddStatus", false, 2, null)).m4038a("tradeType", tradeType).m4038a("paymentMethodCode", paymentMethodCode).m4038a("channelId", channelId).m4048k();
    }

    /* JADX INFO: renamed from: c */
    public final void m48164c() {
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/p2p/blacklist", false, 2, null)).m4048k();
    }

    /* JADX INFO: renamed from: d */
    public final void m48165d(@NotNull String adId) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Router.f46192a.m56184f(FlutterUtils.f39512a.m48218a("payment/p2p/merchant/details", false)).m4038a("adId", adId).m4048k();
    }

    /* JADX INFO: renamed from: e */
    public final void m48166e(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/recurring/details", false, 2, null)).m4038a("id", id2).m4048k();
    }

    /* JADX INFO: renamed from: f */
    public final void m48167f(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/recurring/result", false, 2, null)).m4038a("orderId", orderId).m4048k();
    }
}
