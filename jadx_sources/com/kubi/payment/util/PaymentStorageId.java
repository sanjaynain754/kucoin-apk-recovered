package com.kubi.payment.util;

import com.kubi.payment.fast.data.entities.FastTradeCryptoCurrency;
import com.kubi.payment.fast.data.entities.FastTradeFiatCurrency;
import com.kubi.utils.storage.StorageType;
import com.tencent.bugly.proguard.C33641f4;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.payment.util.i, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentStorageId.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u0010\u0013\u001a\u00020\nH\u0000¢\u0006\u0002\b\u0016J\u001b\u00107\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0006\u00108\u001a\u00020\nH\u0000¢\u0006\u0002\b9J#\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0000¢\u0006\u0002\bAJ#\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010C\u001a\u00020\n2\u0006\u0010D\u001a\u00020(H\u0000¢\u0006\u0002\bER\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\bR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\bR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\bR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\bR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR \u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR \u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\"0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\bR\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010\bR\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\bR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010\bR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010\b¨\u0006J"}, m90084d2 = {"Lcom/kubi/payment/util/PaymentStorageId;", "", "<init>", "()V", "KYC_EXPIRED_KEY", "Lcom/kubi/utils/storage/StorageId;", "", "getKYC_EXPIRED_KEY$PaymentLib_googleRelease", "()Lcom/kubi/utils/storage/StorageId;", "P2P_USER_KEY", "", "getP2P_USER_KEY$PaymentLib_googleRelease", "P2P_PAY_TYPES_KEY", "getP2P_PAY_TYPES_KEY$PaymentLib_googleRelease", "P2P_PAY_TEMPLATES_KEY", "getP2P_PAY_TEMPLATES_KEY$PaymentLib_googleRelease", "P2P_EXPRESS_FOLDED_KEY", "getP2P_EXPRESS_FOLDED_KEY$PaymentLib_googleRelease", "p2pT1Limit", "fiatCurrency", "p2pT1Limit$PaymentLib_googleRelease", "p2pSymbolsKey", "p2pSymbolsKey$PaymentLib_googleRelease", "P2P_PAY_TEMPLATES_LANGUAGE_KEY", "getP2P_PAY_TEMPLATES_LANGUAGE_KEY$PaymentLib_googleRelease", "P2P_MERCHANT_TIMEZONE_KEY", "getP2P_MERCHANT_TIMEZONE_KEY$PaymentLib_googleRelease", "P2P_TAX_ALERT_KEY", "getP2P_TAX_ALERT_KEY$PaymentLib_googleRelease", "P2P_SELECT_FIAT_CURRENCY_KEY", "getP2P_SELECT_FIAT_CURRENCY_KEY$PaymentLib_googleRelease", "P2P_PAYMENT_METHOD_ICONS_KEY", "getP2P_PAYMENT_METHOD_ICONS_KEY$PaymentLib_googleRelease", "FAST_FIAT_LIST_KEY", "", "Lcom/kubi/payment/fast/data/entities/FastTradeFiatCurrency$Response;", "getFAST_FIAT_LIST_KEY$PaymentLib_googleRelease", "FAST_TRADING_PAIR_INFO_KEY", "getFAST_TRADING_PAIR_INFO_KEY$PaymentLib_googleRelease", "FAST_BUSINESS_TYPE_KEY", "", "getFAST_BUSINESS_TYPE_KEY$PaymentLib_googleRelease", "FAST_SELECT_FIAT_CURRENCY_KEY", "getFAST_SELECT_FIAT_CURRENCY_KEY$PaymentLib_googleRelease", "FAST_SELECT_CRYPTO_CURRENCY_KEY", "getFAST_SELECT_CRYPTO_CURRENCY_KEY$PaymentLib_googleRelease", "FAST_BUY_SELECT_CRYPTO_CURRENCY_KEY", "getFAST_BUY_SELECT_CRYPTO_CURRENCY_KEY$PaymentLib_googleRelease", "FAST_SELL_SELECT_CRYPTO_CURRENCY_KEY", "getFAST_SELL_SELECT_CRYPTO_CURRENCY_KEY$PaymentLib_googleRelease", "FAST_SELECTED_HISTORY_FIAT_CURRENCY_KEY", "getFAST_SELECTED_HISTORY_FIAT_CURRENCY_KEY$PaymentLib_googleRelease", "FAST_SELECTED_HISTORY_CRYPTO_CURRENCY_KEY", "Lcom/kubi/payment/fast/data/entities/FastTradeCryptoCurrency$Response;", "getFAST_SELECTED_HISTORY_CRYPTO_CURRENCY_KEY$PaymentLib_googleRelease", "historyFiatListKey", "tradeType", "historyFiatListKey$PaymentLib_googleRelease", "CHANNEL_CAPITUAL_REMIND_RECHARGE_KEY", "getCHANNEL_CAPITUAL_REMIND_RECHARGE_KEY$PaymentLib_googleRelease", "CHANNEL_SEPA_REMIND_RECHARGE_KEY", "getCHANNEL_SEPA_REMIND_RECHARGE_KEY$PaymentLib_googleRelease", "channelWithdrawRemindKey", "paymentMethodCode", "channelId", "channelWithdrawRemindKey$PaymentLib_googleRelease", "p2pOrderWarningKey", "orderId", "sceneType", "p2pOrderWarningKey$PaymentLib_googleRelease", "KUCARD_GUIDE_KEY", "getKUCARD_GUIDE_KEY$PaymentLib_googleRelease", "COUPON_DIALOG_FREQUENCY_KEY", "getCOUPON_DIALOG_FREQUENCY_KEY$PaymentLib_googleRelease", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentStorageId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentStorageId.kt\ncom/kubi/payment/util/PaymentStorageId\n+ 2 StorageId.kt\ncom/kubi/utils/storage/StorageIdKt\n*L\n1#1,195:1\n67#2:196\n*S KotlinDebug\n*F\n+ 1 PaymentStorageId.kt\ncom/kubi/payment/util/PaymentStorageId\n*L\n172#1:196\n*E\n"})
public final class PaymentStorageId {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PaymentStorageId f40364a = new PaymentStorageId();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final StorageId<Boolean> f40365b = new StorageId<>("payment", "kyc_expired_alert", null, false, 12, null);

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final StorageId<String> f40366c = new StorageId<>("payment", "p2p_user", null, false, 12, null);

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final StorageId<String> f40367d = new StorageId<>("payment", "p2p_pay_types", null, false, 12, null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final StorageId<String> f40368e = new StorageId<>("payment", "p2p_pay_templates", null, false, 12, null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final StorageId<Boolean> f40369f = new StorageId<>("payment", "p2p_express_folded", null, false, 12, null);

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final StorageId<String> f40370g = new StorageId<>("payment", "p2p_pay_templates_language", null, false, 12, null);

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final StorageId<String> f40371h = new StorageId<>("payment", "p2p_merchant_timezone", StorageType.Shared, false, 8, null);

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final StorageId<Boolean> f40372i = new StorageId<>("payment", "p2p_tax_alert", null, false, 12, null);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final StorageId<String> f40373j = new StorageId<>("payment", "p2p_select_fiat_currency", null, false, 12, null);

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final StorageId<String> f40374k = new StorageId<>("payment", "p2p_payment_method_icons", null, false, 12, null);

    /* JADX INFO: renamed from: l */
    @NotNull
    public static final StorageId<List<FastTradeFiatCurrency.Response>> f40375l = new StorageId<>("payment", "fast_fiat_list", null, false, 12, null);

    /* JADX INFO: renamed from: m */
    @NotNull
    public static final StorageId<String> f40376m = new StorageId<>("payment", "fast_trading_pair_info", null, false, 12, null);

    /* JADX INFO: renamed from: n */
    @NotNull
    public static final StorageId<Integer> f40377n = new StorageId<>("payment", "fast_business_type", null, false, 12, null);

    /* JADX INFO: renamed from: o */
    @NotNull
    public static final StorageId<String> f40378o = new StorageId<>("payment", "fast_select_fiat_currency", null, false, 12, null);

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final StorageId<String> f40379p = new StorageId<>("payment", "fast_select_crypto_currency", null, false, 12, null);

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final StorageId<String> f40380q = new StorageId<>("payment", "fast_buy_select_crypto_currency", null, false, 12, null);

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final StorageId<String> f40381r = new StorageId<>("payment", "fast_sell_select_crypto_currency", null, false, 12, null);

    /* JADX INFO: renamed from: s */
    @NotNull
    public static final StorageId<List<FastTradeFiatCurrency.Response>> f40382s = new StorageId<>("payment", "fast_selected_history_fiat_currency", null, false, 12, null);

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final StorageId<List<FastTradeCryptoCurrency.Response>> f40383t = new StorageId<>("payment", "fast_selected_history_crypto_currency", null, false, 12, null);

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final StorageId<Boolean> f40384u = new StorageId<>("payment", "channel_recharge_capitual_remind", null, false, 12, null);

    /* JADX INFO: renamed from: v */
    @NotNull
    public static final StorageId<Boolean> f40385v = new StorageId<>("payment", "channel_recharge_sepa_remind", null, false, 12, null);

    /* JADX INFO: renamed from: w */
    @NotNull
    public static final StorageId<Boolean> f40386w = new StorageId<>("payment", "kucard_guide", null, false, 12, null);

    /* JADX INFO: renamed from: x */
    @NotNull
    public static final StorageId<String> f40387x = new StorageId<>("payment", "coupon_dialog_frequency", null, false, 12, null);

    @NotNull
    /* JADX INFO: renamed from: A */
    public final StorageId<Boolean> m49822A(@NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        return new StorageId<>("payment", "p2p_t1_limit_" + fiatCurrency, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final StorageId<Boolean> m49823a(@NotNull String paymentMethodCode, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(paymentMethodCode, "paymentMethodCode");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        return new StorageId<>("flutter_payment", "channel_withdraw_remind_" + paymentMethodCode + '_' + channelId, StorageType.LocalSite, false);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final StorageId<Boolean> m49824b() {
        return f40384u;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final StorageId<String> m49825c() {
        return f40387x;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final StorageId<Integer> m49826d() {
        return f40377n;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final StorageId<String> m49827e() {
        return f40380q;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final StorageId<List<FastTradeFiatCurrency.Response>> m49828f() {
        return f40375l;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final StorageId<List<FastTradeCryptoCurrency.Response>> m49829g() {
        return f40383t;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final StorageId<List<FastTradeFiatCurrency.Response>> m49830h() {
        return f40382s;
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final StorageId<String> m49831i() {
        return f40379p;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final StorageId<String> m49832j() {
        return f40378o;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final StorageId<String> m49833k() {
        return f40381r;
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final StorageId<String> m49834l() {
        return f40376m;
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final StorageId<Boolean> m49835m() {
        return f40386w;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final StorageId<Boolean> m49836n() {
        return f40365b;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final StorageId<Boolean> m49837o() {
        return f40369f;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final StorageId<String> m49838p() {
        return f40371h;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final StorageId<String> m49839q() {
        return f40374k;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final StorageId<String> m49840r() {
        return f40368e;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final StorageId<String> m49841s() {
        return f40370g;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final StorageId<String> m49842t() {
        return f40367d;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final StorageId<String> m49843u() {
        return f40373j;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final StorageId<Boolean> m49844v() {
        return f40372i;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final StorageId<String> m49845w() {
        return f40366c;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final StorageId<String> m49846x(@NotNull String tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "tradeType");
        return new StorageId<>("payment", "channel_select_history_currency_cache_" + tradeType + C33641f4.f69838y, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final StorageId<Boolean> m49847y(@NotNull String orderId, int i11) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        return new StorageId<>("payment", "p2p_order_warning_" + i11 + '_' + orderId, null, false, 12, null);
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final StorageId<String> m49848z(@NotNull String fiatCurrency) {
        Intrinsics.checkNotNullParameter(fiatCurrency, "fiatCurrency");
        return new StorageId<>("payment", "p2p_symbols_type_" + fiatCurrency, null, false, 12, null);
    }
}
