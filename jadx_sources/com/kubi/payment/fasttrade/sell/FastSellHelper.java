package com.kubi.payment.fasttrade.sell;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.internal.ViewUtils;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fast.sell.balance.BalanceSellConfirmFragment;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmExtraParams;
import com.kubi.payment.fasttrade.sell.confirm.balance.SellBalanceConfirmFragment;
import com.kubi.payment.fasttrade.sell.confirm.bankcard.SellBankCardConfirmFragment;
import com.kubi.payment.fasttrade.sell.confirm.p2p.SellP2PConfirmFragment;
import com.kubi.payment.helper.RemoteConfigHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import java.lang.reflect.Type;
import lt.C42305j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FastSellHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005J,\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002J\u001e\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/FastSellHelper;", "", "<init>", "()V", "PAY_WITH_NEW_BANK_CARD_URL", "", "UPDATE_BANK_CARD_URL", "fastSell", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/SellPaymentMethod$Response$PaymentMethod;", "cryptoAmount", "handleBankCard", "handleBalance", "handleP2P", "buildSellCommonConfirmExtraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "launchSellConfirmPage", "extraParams", "postcard", "Lcom/kubi/router/model/Postcard;", "launchSellP2PConfirmPage", "launchSellBalanceConfirmPage", "launchSellBankCardConfirmPage", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastSellHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastSellHelper.kt\ncom/kubi/payment/fasttrade/sell/FastSellHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 5 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,242:1\n44#2,2:243\n44#2,2:253\n29#3:245\n29#3:255\n35#4,4:246\n39#4:252\n44#5,2:250\n*S KotlinDebug\n*F\n+ 1 FastSellHelper.kt\ncom/kubi/payment/fasttrade/sell/FastSellHelper\n*L\n80#1:243,2\n208#1:253,2\n98#1:245\n113#1:255\n190#1:246,4\n190#1:252\n190#1:250,2\n*E\n"})
public final class FastSellHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FastSellHelper f38946a = new FastSellHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f38947b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f38948c;

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.s$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: e */
    public final void m47143e(final Context context, FragmentManager fragmentManager, final SellPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        if ((paymentMethod != null ? paymentMethod.getCardInfo() : null) == null) {
            String strM66919i = C27099x.m66919i(m47140b(paymentMethod, str), false, 2, null);
            C4400a c4400aM4038a = new C4400a(Uri.parse(f38947b), null, 2, null).m4038a("side", "SELL");
            Boolean bool = Boolean.TRUE;
            PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, context, c4400aM4038a.m4038a("appNeedLang", bool).m4038a("needLogin", bool).m4038a("extraParams", Uri.encode(strM66919i)).m4045h(), null, null, false, false, 60, null);
            return;
        }
        if (C27025c.m66566d(paymentMethod.getCardInfo().getHasExpired())) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54167X4(R$string.payment_update_card_title).m54169Z4(true).m54153J4(R$string.payment_update_card_content).m54157N4(true).m54161R4(0).m54159P4(R$string.payment_cancel, null).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.r
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FastSellHelper.m47139f(context, paymentMethod, dialogInterface, i11);
                }
            }).show(fragmentManager, "payment_fast_sell_bankcard_expired");
        } else {
            m47146i(context, m47140b(paymentMethod, str));
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.e());
        sb2.append("/express/pay-with-new-card");
        f38947b = sb2.toString();
        f38948c = hostManager.e() + "/express/payment-method/bank-card/update";
    }

    /* JADX INFO: renamed from: f */
    public static final void m47139f(Context context, SellPaymentMethod.Response.PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        PaymentWebActivity.Companion companion = PaymentWebActivity.f37079t;
        C4400a c4400aM4038a = new C4400a(Uri.parse(f38948c), null, 2, null).m4038a("cardId", paymentMethod.getCardInfo().getCardId());
        Boolean bool = Boolean.TRUE;
        PaymentWebActivity.Companion.openUrl$default(companion, context, c4400aM4038a.m4038a("needLogin", bool).m4038a("appNeedLang", bool).m4045h(), null, null, false, false, 60, null);
    }

    /* JADX INFO: renamed from: b */
    public final SellCommonConfirmExtraParams m47140b(SellPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        SellPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo;
        SellPaymentMethod.Response.PaymentMethod.CardInfo cardInfo;
        String adId = null;
        String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodName() : null);
        String strM66668h2 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
        String strM66668h3 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getChannelId() : null);
        String strM66668h4 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatCurrency() : null);
        String strM66668h5 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null);
        String cardId = (paymentMethod == null || (cardInfo = paymentMethod.getCardInfo()) == null) ? null : cardInfo.getCardId();
        if (paymentMethod != null && (p2pInfo = paymentMethod.getP2pInfo()) != null) {
            adId = p2pInfo.getAdId();
        }
        return new SellCommonConfirmExtraParams(strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, str, cardId, adId, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m47141c(@NotNull Context context, @NotNull FragmentManager fragmentManager, @Nullable SellPaymentMethod.Response.PaymentMethod paymentMethod, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null), C27041f.m66668h(paymentMethod != null ? paymentMethod.getChannelId() : null));
        if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
            m47143e(context, fragmentManager, paymentMethod, str);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
            m47142d(context, paymentMethod, str);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.P2P) {
            m47144g(context, paymentMethod, str);
            return;
        }
        C43846g.m96568c(new OtcException(new Exception("payment fast sell unsupported channel:" + fastTradeChannelM46724a), "FastSellHelper", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m47142d(Context context, SellPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        if (RemoteConfigHelper.f39546a.m48249a()) {
            m47145h(context, m47140b(paymentMethod, str));
        } else {
            BalanceSellConfirmFragment.f38668b0.launch(context, new ConfirmExtraParams("SELL", FastQuoteModel.PAY_BALANCE, C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null), C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatCurrency() : null), null, C27041f.m66668h(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null), str, null, null, C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodName() : null), null, false, null, 7568, null));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m47145h(Context context, SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        SellBalanceConfirmFragment.Companion.launch$default(SellBalanceConfirmFragment.f38845a0, context, sellCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m47146i(Context context, SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        SellBankCardConfirmFragment.Companion.launch$default(SellBankCardConfirmFragment.f38857Z, context, sellCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m47147j(@NotNull Context context, @NotNull SellCommonConfirmExtraParams extraParams, @NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(extraParams.getPaymentMethodCode()), C27041f.m66668h(extraParams.getChannelId()));
        Object objM20457a = null;
        if (fastTradeChannelM46724a instanceof FastTradeChannel.P2P) {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("payment_android_p2p_rn", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            }
            if (C27025c.m66567e((Boolean) objM20457a, false)) {
                C42305j.m92852a(postcard, "payment/fastTrade/sell/confirm");
                return;
            } else {
                m47148k(context, extraParams);
                return;
            }
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
            m47145h(context, extraParams);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
            m47146i(context, extraParams);
            return;
        }
        C43846g.m96568c(new OtcException(new Exception("payment fast sell unsupported channel:" + fastTradeChannelM46724a), "FastSellHelper", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: k */
    public final void m47148k(Context context, SellCommonConfirmExtraParams sellCommonConfirmExtraParams) {
        SellP2PConfirmFragment.Companion.launch$default(SellP2PConfirmFragment.f38885a0, context, sellCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m47144g(Context context, SellPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        String payTypeCode;
        SellPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo;
        SellCommonConfirmExtraParams sellCommonConfirmExtraParamsM47140b = m47140b(paymentMethod, str);
        if (paymentMethod != null && (p2pInfo = paymentMethod.getP2pInfo()) != null) {
            payTypeCode = p2pInfo.getPayTypeCode();
        } else {
            payTypeCode = null;
        }
        sellCommonConfirmExtraParamsM47140b.setPayTypeCode(payTypeCode);
        sellCommonConfirmExtraParamsM47140b.setP2pBusinessType("FAST_TRADE_SELL");
        m47148k(context, sellCommonConfirmExtraParamsM47140b);
    }
}
