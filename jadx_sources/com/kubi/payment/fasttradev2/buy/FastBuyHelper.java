package com.kubi.payment.fasttradev2.buy;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.credentials.provider.CredentialEntry;
import androidx.fragment.app.FragmentManager;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.host.HostManager;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$color;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.balance.BuyBalanceConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.bankcard.BuyBankCardConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.blik.BuyBlikConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.ivy.BuyIvyConfirmActivity;
import com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmFragment;
import com.kubi.payment.fasttradev2.buy.confirm.revolut.BuyRevolutConfirmActivity;
import com.kubi.payment.fasttradev2.buy.confirm.zenpay.BuyZenPayConfirmFragment;
import com.kubi.payment.third.quote.ThirdQuoteFragment;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.flutter.KCFlutterRouteManager;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import f00.C37304a;
import g00.InterfaceC37758j;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.lang.reflect.Type;
import java.util.Map;
import lt.C42305j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p026ay.C4400a;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.j0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FastBuyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016J>\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J6\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J>\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J,\u0010\u001d\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u001e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J$\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010$\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J,\u0010%\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J$\u0010&\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002J2\u0010'\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\u001e\u0010(\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010,\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010-\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010.\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u0010/\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u00100\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u00101\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u00102\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0018\u00103\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/FastBuyHelper;", "", "<init>", "()V", "KEY_PURCHASE_TYPE", "", "ONE_TIME_PURCHASE", "RECURRING_PURCHASE", "PAY_WITH_NEW_BANK_CARD_URL", "UPDATE_BANK_CARD_URL", "fastBuy", "", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/BuyPaymentMethod$Response$PaymentMethod;", "fiatAmount", "isRecurring", "", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "handleBankCard", "showSwitchFiatCurrencyDialog", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "handleGooglePay", "handleBalance", "checkBalance", "showBalanceNotEnoughDialog", "fiatCurrency", "launchRecharge", "handleRevolut", "handleBlik", "handleZenPay", "handleIvy", "handleP2P", "handleThirdParty", "buildBuyCommonConfirmExtraParams", "launchBuyConfirmPage", "postcard", "Lcom/kubi/router/model/Postcard;", "launchBuyBalanceConfirmPage", "launchBuyBankCardConfirmPage", "launchBuyGooglePayConfirmPage", "launchBuyRevolutConfirmPage", "launchBuyBlikConfirmPage", "launchBuyZenPayConfirmPage", "launchBuyIvyConfirmPage", "launchBuyP2PConfirmPage", "launchBuyThirdConfirmPage", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFastBuyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastBuyHelper.kt\ncom/kubi/payment/fasttradev2/buy/FastBuyHelper\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 6 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,779:1\n44#2,2:780\n44#2,2:782\n44#2,2:784\n44#2,2:786\n44#2,2:788\n44#2,2:790\n44#2,2:792\n44#2,2:803\n29#3:794\n29#3:805\n136#4:795\n35#5,4:796\n39#5:802\n44#6,2:800\n*S KotlinDebug\n*F\n+ 1 FastBuyHelper.kt\ncom/kubi/payment/fasttradev2/buy/FastBuyHelper\n*L\n144#1:780,2\n159#1:782,2\n175#1:784,2\n191#1:786,2\n203#1:788,2\n220#1:790,2\n232#1:792,2\n705#1:803,2\n257#1:794\n279#1:805\n522#1:795\n682#1:796,4\n682#1:802\n682#1:800,2\n*E\n"})
public final class FastBuyHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FastBuyHelper f39263a = new FastBuyHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f39264b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final String f39265c;

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.j0$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m47775s(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, Map map) {
        Object obj = map != null ? map.get(DbParams.KEY_CHANNEL_RESULT) : null;
        if (Intrinsics.areEqual(obj instanceof Boolean ? (Boolean) obj : null, Boolean.TRUE)) {
            f39263a.m47782E(context, buyCommonConfirmExtraParams);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public final BuyCommonConfirmExtraParams m47790i(BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, boolean z11, RecurringFrequency recurringFrequency) {
        BuyPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo;
        BuyPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo2;
        BuyPaymentMethod.Response.PaymentMethod.CardInfo cardInfo;
        String payTypeCode = null;
        String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodName() : null);
        String strM66668h2 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
        String strM66668h3 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getChannelId() : null);
        String strM66668h4 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatCurrency() : null);
        String strM66668h5 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null);
        String cardId = (paymentMethod == null || (cardInfo = paymentMethod.getCardInfo()) == null) ? null : cardInfo.getCardId();
        String adId = (paymentMethod == null || (p2pInfo2 = paymentMethod.getP2pInfo()) == null) ? null : p2pInfo2.getAdId();
        if (paymentMethod != null && (p2pInfo = paymentMethod.getP2pInfo()) != null) {
            payTypeCode = p2pInfo.getPayTypeCode();
        }
        return new BuyCommonConfirmExtraParams(strM66668h, strM66668h2, strM66668h3, strM66668h4, null, strM66668h5, str, cardId, adId, payTypeCode, z11, recurringFrequency, null, 4112, null);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m47791k(Context context, FragmentManager fragmentManager, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        BuyPaymentMethod.Response.PaymentMethod.BalanceInfo balanceInfo;
        boolean z11 = DowngradeExKt.m66535e((paymentMethod == null || (balanceInfo = paymentMethod.getBalanceInfo()) == null) ? null : balanceInfo.getAvailableBalance(), null, 1, null).compareTo(DowngradeExKt.m66535e(str, null, 1, null)) >= 0;
        if (!z11) {
            m47788K(context, fragmentManager, C27041f.m66668h(paymentMethod != null ? paymentMethod.getFiatCurrency() : null));
        }
        return z11;
    }

    /* JADX INFO: renamed from: n */
    public final void m47794n(final Context context, FragmentManager fragmentManager, final BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, boolean z11, RecurringFrequency recurringFrequency) {
        if ((paymentMethod != null ? paymentMethod.getCardInfo() : null) == null) {
            String strM66919i = C27099x.m66919i(m47790i(paymentMethod, str, z11, recurringFrequency), false, 2, null);
            C4400a c4400aM4038a = new C4400a(Uri.parse(f39264b), null, 2, null).m4038a("purchaseType", z11 ? "recurringPurchase" : "oneTimePurchase").m4038a("side", "BUY");
            Boolean bool = Boolean.TRUE;
            PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, context, c4400aM4038a.m4038a("appNeedLang", bool).m4038a("needLogin", bool).m4038a("extraParams", Uri.encode(strM66919i)).m4045h(), null, null, false, false, 60, null);
            return;
        }
        if (C27025c.m66566d(paymentMethod.getCardInfo().getHasExpired())) {
            AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54167X4(R$string.payment_update_card_title).m54169Z4(true).m54153J4(R$string.payment_update_card_content).m54157N4(true).m54161R4(0).m54159P4(R$string.payment_cancel, null).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.c0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    FastBuyHelper.m47774o(context, paymentMethod, dialogInterface, i11);
                }
            }).show(fragmentManager, "payment_fast_buy_bankcard_expired");
            return;
        }
        String strM66668h = C27041f.m66668h(paymentMethod.getCardInfo().getCardCurrency());
        String strM66668h2 = C27041f.m66668h(paymentMethod.getFiatCurrency());
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParamsM47790i = m47790i(paymentMethod, str, z11, recurringFrequency);
        if (strM66668h.length() == 0 || Intrinsics.areEqual(strM66668h, strM66668h2)) {
            m47778A(context, buyCommonConfirmExtraParamsM47790i);
        } else {
            m47789M(context, fragmentManager, paymentMethod, buyCommonConfirmExtraParamsM47790i);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m47798t(final Context context, FragmentManager fragmentManager, final BuyPaymentMethod.Response.PaymentMethod paymentMethod, final String str) {
        BuyPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo;
        final String strM66668h = C27041f.m66668h((paymentMethod == null || (p2pInfo = paymentMethod.getP2pInfo()) == null) ? null : p2pInfo.getHedgeMidCurrency());
        if (!StringsKt.isBlank(strM66668h)) {
            C43852m.m96597i("B7PaymentMethodContinueGuide", C43852m.m96602n("B7PaymentMethod", "submitButton", null, 4, null));
            DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_fast_p2p, true).m54237f4(new Function2() { // from class: com.kubi.payment.fasttradev2.buy.b0
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FastBuyHelper.m47776u(context, paymentMethod, strM66668h, str, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            }).show(fragmentManager, "payment_fast_buy_p2p_express");
        } else {
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParamsM47773j = m47773j(this, paymentMethod, str, false, null, 12, null);
            buyCommonConfirmExtraParamsM47773j.setP2pBusinessType("FAST_TRADE_BUY");
            m47783F(context, buyCommonConfirmExtraParamsM47773j);
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.e());
        sb2.append("/express/pay-with-new-card");
        f39264b = sb2.toString();
        f39265c = hostManager.e() + "/express/payment-method/bank-card/update";
    }

    /* JADX INFO: renamed from: L */
    public static final void m47761L(String str, DialogInterface dialogInterface, int i11) {
        f39263a.m47787J(str);
    }

    /* JADX INFO: renamed from: N */
    public static final Unit m47762N(final String str, BuyPaymentMethod.Response.PaymentMethod paymentMethod, final Context context, final String str2, final BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_description);
        textView.setText(C27017c.f54310a.m66516f(R$string.payment_switch_currency_description, str, paymentMethod.getFiatCurrency()));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text))));
        ImageView imageView = (ImageView) viewHolder.getView(R$id.iv_matched);
        C37890n c37890n = C37890n.f85269a;
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(str);
        C24277v.m58540e(context, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, imageView);
        ((TextView) viewHolder.getView(R$id.tv_matched_fiat_currency)).setText(str);
        ImageView imageView2 = (ImageView) viewHolder.getView(R$id.iv_other);
        CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(str2);
        C24277v.m58540e(context, coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null, imageView2);
        ((TextView) viewHolder.getView(R$id.tv_other_fiat_currency)).setText(str2);
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_matched);
        textView2.setText(context.getString(R$string.payment_switch_currency_buy, str));
        Intrinsics.checkNotNull(textView2);
        C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.h0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyHelper.m47763O(context, buyCommonConfirmExtraParams, str, str2, helper);
            }
        }, 1, null);
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_other);
        textView3.setText(context.getString(R$string.payment_continue_currency_buy, str2));
        Intrinsics.checkNotNull(textView3);
        C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyHelper.m47764P(context, buyCommonConfirmExtraParams, str, str2, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: O */
    public static final Unit m47763O(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, String str2, DialogFragmentHelper dialogFragmentHelper) {
        f39263a.m47778A(context, BuyCommonConfirmExtraParams.copy$default(buyCommonConfirmExtraParams, null, null, null, str, CollectionsKt.listOf((Object[]) new String[]{str, str2}), null, null, null, null, null, false, null, null, 8167, null));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P */
    public static final Unit m47764P(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams, String str, String str2, DialogFragmentHelper dialogFragmentHelper) {
        f39263a.m47778A(context, BuyCommonConfirmExtraParams.copy$default(buyCommonConfirmExtraParams, null, null, null, null, CollectionsKt.listOf((Object[]) new String[]{str, str2}), null, null, null, null, null, false, null, null, 8175, null));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ BuyCommonConfirmExtraParams m47773j(FastBuyHelper fastBuyHelper, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, boolean z11, RecurringFrequency recurringFrequency, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            recurringFrequency = null;
        }
        return fastBuyHelper.m47790i(paymentMethod, str, z11, recurringFrequency);
    }

    /* JADX INFO: renamed from: o */
    public static final void m47774o(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, DialogInterface dialogInterface, int i11) {
        PaymentWebActivity.Companion companion = PaymentWebActivity.f37079t;
        C4400a c4400aM4038a = new C4400a(Uri.parse(f39265c), null, 2, null).m4038a("cardId", paymentMethod.getCardInfo().getCardId());
        Boolean bool = Boolean.TRUE;
        PaymentWebActivity.Companion.openUrl$default(companion, context, c4400aM4038a.m4038a("needLogin", bool).m4038a("appNeedLang", bool).m4045h(), null, null, false, false, 60, null);
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m47776u(final Context context, final BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, final String str2, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewHolder.getView(R$id.iv_fiat_currency);
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null));
        C24277v.m58540e(context, coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, appCompatImageView);
        ((TextView) viewHolder.getView(R$id.tv_title)).setText(context.getString(R$string.payment_fast_p2p_express_title, C27041f.m66669i(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null, "--")));
        ((TextView) viewHolder.getView(R$id.tv_step_1_title)).setText(context.getString(R$string.payment_fast_convert_title, C27041f.m66669i(paymentMethod != null ? paymentMethod.getFiatCurrency() : null, "--"), str));
        ((TextView) viewHolder.getView(R$id.tv_step_1_description)).setText(context.getString(R$string.payment_fast_transfer_description, C27041f.m66669i(paymentMethod != null ? paymentMethod.getFiatCurrency() : null, "--"), str));
        ((TextView) viewHolder.getView(R$id.tv_step_2_title)).setText(context.getString(R$string.payment_fast_automatic_transfer_title, str, C27041f.m66669i(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null, "--")));
        ((TextView) viewHolder.getView(R$id.tv_step_2_description)).setText(context.getString(R$string.payment_fast_automatic_transfer_description, str, C27041f.m66669i(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null, "--")));
        TextView textView = (TextView) viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.g0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FastBuyHelper.m47777v(paymentMethod, str2, context, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m47777v(BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, Context context, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        FastBuyHelper fastBuyHelper = f39263a;
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParamsM47773j = m47773j(fastBuyHelper, paymentMethod, str, false, null, 12, null);
        buyCommonConfirmExtraParamsM47773j.setP2pBusinessType("FAST_TRADE_BUY");
        fastBuyHelper.m47783F(context, buyCommonConfirmExtraParamsM47773j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_fiat_currency", String.valueOf(paymentMethod != null ? paymentMethod.getFiatCurrency() : null));
        jSONObject.put("pay_crypto_currency", String.valueOf(paymentMethod != null ? paymentMethod.getCryptoCurrency() : null));
        jSONObject.put("pay_side", "buy");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B7PaymentMethodContinueGuide", "continueGuide", null, jSONObject, 4, null);
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m47778A(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyBankCardConfirmFragment.f39096Z.launch(context, buyCommonConfirmExtraParams, C43852m.m96601m("B7FastBuy", "submitbutton", "1"));
    }

    /* JADX INFO: renamed from: B */
    public final void m47779B(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyBlikConfirmFragment.Companion.launch$default(BuyBlikConfirmFragment.f39111Z, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: C */
    public final void m47780C(@NotNull Context context, @NotNull BuyCommonConfirmExtraParams extraParams, @NotNull C4400a postcard) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        Intrinsics.checkNotNullParameter(postcard, "postcard");
        FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(extraParams.getPaymentMethodCode()), C27041f.m66668h(extraParams.getChannelId()));
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
            m47802z(context, extraParams);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
            m47778A(context, extraParams);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Blik) {
            m47779B(context, extraParams);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.GooglePay) {
            m47781D(context, extraParams);
            return;
        }
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
                C42305j.m92852a(postcard, "payment/fastTrade/buy/confirm");
                return;
            } else {
                m47783F(context, extraParams);
                return;
            }
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Revolut) {
            m47784G(context, extraParams);
            return;
        }
        if ((fastTradeChannelM46724a instanceof FastTradeChannel.ThirdParty) || (fastTradeChannelM46724a instanceof FastTradeChannel.ThirdPartyPayID)) {
            m47785H(context, extraParams);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.ZenPay) {
            m47786I(context, extraParams);
            return;
        }
        C43846g.m96568c(new OtcException(new Exception("payment fast buy unsupported channel:" + extraParams), "FastBuyHelper", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: D */
    public final void m47781D(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyGooglePayConfirmFragment.Companion.launch$default(BuyGooglePayConfirmFragment.f39126a0, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: E */
    public final void m47782E(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyIvyConfirmActivity.Companion.launch$default(BuyIvyConfirmActivity.f39142l, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: F */
    public final void m47783F(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyP2PConfirmFragment.Companion.launch$default(BuyP2PConfirmFragment.f39170Z, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m47784G(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyRevolutConfirmActivity.Companion.launch$default(BuyRevolutConfirmActivity.f39196k, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: H */
    public final void m47785H(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        ThirdQuoteFragment.f40268b0.startFragment(context, C27041f.m66668h(buyCommonConfirmExtraParams.getFiatCurrency()), C27041f.m66668h(buyCommonConfirmExtraParams.getCryptoCurrency()), C27041f.m66668h(buyCommonConfirmExtraParams.getFiatAmount()), C27041f.m66668h(buyCommonConfirmExtraParams.getChannelId()));
    }

    /* JADX INFO: renamed from: I */
    public final void m47786I(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyZenPayConfirmFragment.Companion.launch$default(BuyZenPayConfirmFragment.f39223Z, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: J */
    public final void m47787J(@Nullable String str) {
        InterfaceC37758j.a.m85157f(C37304a.f82764a, str, null, null, null, null, 30, null);
        C12572a.m23695d("com.kubi.payment.event.PaymentEvent:fastBuyRefreshPaymentMethodForBalance", Boolean.TRUE, 0L, 4, null);
    }

    /* JADX INFO: renamed from: K */
    public final void m47788K(Context context, FragmentManager fragmentManager, final String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54157N4(true).m54165V4(R$drawable.ic2_common_warning).m54156M4(context.getString(R$string.payment_fast_buy_insufficient, str, str)).m54161R4(1).m54163T4(context.getString(R$string.payment_fast_buy_deposit_coin, str), new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.d0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FastBuyHelper.m47761L(str, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_fast_buy_deposit_later, null).show(fragmentManager, "payment_fast_buy_balance_not_enough");
    }

    /* JADX INFO: renamed from: l */
    public final void m47792l(@NotNull Context context, @NotNull FragmentManager fragmentManager, @Nullable BuyPaymentMethod.Response.PaymentMethod paymentMethod, @Nullable String str, boolean z11, @Nullable RecurringFrequency recurringFrequency) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null), C27041f.m66668h(paymentMethod != null ? paymentMethod.getChannelId() : null));
        C44128b.m97265i("fastBuy isRecurring:" + z11 + ",channel:" + fastTradeChannelM46724a);
        if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
            m47794n(context, fragmentManager, paymentMethod, str, z11, recurringFrequency);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.GooglePay) {
            m47796q(context, paymentMethod, str, z11, recurringFrequency);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
            m47793m(context, fragmentManager, paymentMethod, str, z11, recurringFrequency);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Revolut) {
            if (!z11) {
                m47799w(context, paymentMethod, str);
                return;
            }
            C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Blik) {
            if (!z11) {
                m47795p(context, paymentMethod, str);
                return;
            }
            C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.ZenPay) {
            if (!z11) {
                m47801y(context, paymentMethod, str);
                return;
            }
            C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.Ivy) {
            if (!z11) {
                m47797r(context, paymentMethod, str);
                return;
            }
            C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (fastTradeChannelM46724a instanceof FastTradeChannel.P2P) {
            if (!z11) {
                m47798t(context, fragmentManager, paymentMethod, str);
                return;
            }
            C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (!(fastTradeChannelM46724a instanceof FastTradeChannel.ThirdParty) && !(fastTradeChannelM46724a instanceof FastTradeChannel.ThirdPartyPayID)) {
            C43846g.m96568c(new OtcException(new Exception("payment fast buy unsupported channel:" + fastTradeChannelM46724a + ",isRecurring:" + z11), "FastBuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (!z11) {
            m47800x(context, paymentMethod, str);
            return;
        }
        C43846g.m96568c(new OtcException(new Exception("payment fast recurring buy unsupported channel:" + fastTradeChannelM46724a), "FastBuyHelper", false, null, 8, null), null, 2, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m47795p(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        m47779B(context, m47773j(this, paymentMethod, str, false, null, 12, null));
    }

    /* JADX INFO: renamed from: r */
    public final void m47797r(final Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        final BuyCommonConfirmExtraParams buyCommonConfirmExtraParamsM47773j = m47773j(this, paymentMethod, str, false, null, 12, null);
        String strM66668h = C27041f.m66668h(paymentMethod != null ? paymentMethod.getPaymentMethodCode() : null);
        String strM66668h2 = C27041f.m66668h(paymentMethod != null ? paymentMethod.getChannelId() : null);
        if (!C46392a.m102322d(new StorageId("flutter_payment", "channel_recharge_risk_tip_" + strM66668h + '_' + strM66668h2 + '-' + OtcDepend.f38138a.m45463l(), null, false, 12, null), true)) {
            m47782E(context, buyCommonConfirmExtraParamsM47773j);
            return;
        }
        String string = new Uri.Builder().path("payment/recharge/risk/tip").appendQueryParameter("isTransparent", CredentialEntry.TRUE_STRING).appendQueryParameter("paymentMethodCode", strM66668h).appendQueryParameter("channelId", strM66668h2).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        KCFlutterRouteManager.f46704a.m56851l(string, new Function1() { // from class: com.kubi.payment.fasttradev2.buy.e0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FastBuyHelper.m47775s(context, buyCommonConfirmExtraParamsM47773j, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m47799w(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        m47784G(context, m47773j(this, paymentMethod, str, false, null, 12, null));
    }

    /* JADX INFO: renamed from: x */
    public final void m47800x(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        m47785H(context, m47773j(this, paymentMethod, str, false, null, 12, null));
    }

    /* JADX INFO: renamed from: y */
    public final void m47801y(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str) {
        m47786I(context, m47773j(this, paymentMethod, str, false, null, 12, null));
    }

    /* JADX INFO: renamed from: z */
    public final void m47802z(Context context, BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        BuyBalanceConfirmFragment.Companion.launch$default(BuyBalanceConfirmFragment.f39084a0, context, buyCommonConfirmExtraParams, null, 4, null);
    }

    /* JADX INFO: renamed from: M */
    public final void m47789M(final Context context, FragmentManager fragmentManager, final BuyPaymentMethod.Response.PaymentMethod paymentMethod, final BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        String cardCurrency;
        BuyPaymentMethod.Response.PaymentMethod.CardInfo cardInfo = paymentMethod.getCardInfo();
        if (cardInfo != null) {
            cardCurrency = cardInfo.getCardCurrency();
        } else {
            cardCurrency = null;
        }
        final String strM66668h = C27041f.m66668h(cardCurrency);
        final String strM66668h2 = C27041f.m66668h(paymentMethod.getFiatCurrency());
        DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_credit_card_fiat_currency, true).m54237f4(new Function2() { // from class: com.kubi.payment.fasttradev2.buy.f0
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FastBuyHelper.m47762N(strM66668h, paymentMethod, context, strM66668h2, buyCommonConfirmExtraParams, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        }).show(fragmentManager, "payment_fast_buy_switch_fiat_currency");
    }

    /* JADX INFO: renamed from: m */
    public final void m47793m(Context context, FragmentManager fragmentManager, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, boolean z11, RecurringFrequency recurringFrequency) {
        if (m47791k(context, fragmentManager, paymentMethod, str)) {
            m47802z(context, m47790i(paymentMethod, str, z11, recurringFrequency));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m47796q(Context context, BuyPaymentMethod.Response.PaymentMethod paymentMethod, String str, boolean z11, RecurringFrequency recurringFrequency) {
        m47781D(context, m47790i(paymentMethod, str, z11, recurringFrequency));
    }
}
