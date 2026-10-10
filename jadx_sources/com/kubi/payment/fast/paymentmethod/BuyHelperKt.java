package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.fast.buy.balance.BalanceBuyConfirmFragment;
import com.kubi.payment.fast.buy.bankcard.BankCardBuyConfirmFragment;
import com.kubi.payment.fast.buy.bankcard.BankCardExtraParams;
import com.kubi.payment.fast.buy.popularpay.googlepay.GooglePayConfirmFragment;
import com.kubi.payment.fast.buy.popularpay.revolut.RevolutConfirmActivity;
import com.kubi.payment.fast.buy.popularpay.zen.ZenConfirmFragment;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.p2p.BuyP2PConfirmFragment;
import com.kubi.payment.helper.PreCheckHelper;
import com.kubi.payment.third.quote.ThirdQuoteFragment;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43846g;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BuyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a.\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a.\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002\u001a$\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a\u001c\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u001a.\u0010\u0015\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0019"}, m90084d2 = {"previewOrderOneTimePurchase", "", "Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;", "context", "Landroid/content/Context;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "extraParams", "Lcom/kubi/payment/fast/paymentmethod/ExtraParams;", "handlePaymentType", "confirmExtraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "handleThird", "handleBalance", "handleBankCard", "fiatCurrencyIconUrl", "", "handlePopularPay", "handleRevolut", "handleZen", "handleGooglePay", "handleP2P", "cryptoCurrencyIconUrl", "launchP2PConfirm", "preSpmId", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyHelper.kt\ncom/kubi/payment/fast/paymentmethod/BuyHelperKt\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,394:1\n44#2,2:395\n*S KotlinDebug\n*F\n+ 1 BuyHelper.kt\ncom/kubi/payment/fast/paymentmethod/BuyHelperKt\n*L\n106#1:395,2\n*E\n"})
public final class BuyHelperKt {
    /* JADX INFO: renamed from: h */
    public static final void m46522h(final PaymentMethodFragment paymentMethodFragment, final Context context, final PaymentMethodList.PaymentMethod paymentMethod, final ConfirmExtraParams confirmExtraParams, String str) throws JSONException {
        if (PaymentMethodFragmentExtKt.m46567l(paymentMethodFragment, paymentMethod, context, confirmExtraParams, true)) {
            return;
        }
        PaymentMethodList.BankCardInfo bankCardInfo = paymentMethod.getBankCardInfo();
        final String strM66668h = C27041f.m66668h(bankCardInfo != null ? bankCardInfo.getCardFiatCurrency() : null);
        if (strM66668h.length() == 0 || Intrinsics.areEqual(strM66668h, paymentMethod.getFiatCurrency())) {
            paymentMethodFragment.m46554Q3("B7BuyCryBankCard");
            BankCardBuyConfirmFragment.Companion.launch$default(BankCardBuyConfirmFragment.c0, context, confirmExtraParams, (BankCardExtraParams) null, C43852m.m96601m("B7PaymentMethod", "submitbutton", "1"), 4, (Object) null);
            return;
        }
        PaymentMethodList.BankCardInfo bankCardInfo2 = paymentMethod.getBankCardInfo();
        final BankCardExtraParams bankCardExtraParams = new BankCardExtraParams(strM66668h, bankCardInfo2 != null ? bankCardInfo2.getCardFiatCurrencyIconUrl() : null, paymentMethod.getFiatCurrency(), str);
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_credit_card_fiat_currency, true).m54237f4(new Function2() { // from class: com.kubi.payment.fast.paymentmethod.b
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BuyHelperKt.m46523i(strM66668h, paymentMethod, context, bankCardExtraParams, paymentMethodFragment, confirmExtraParams, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_fast_switch_fiat_currency");
    }

    /* JADX INFO: renamed from: g */
    public static final void m46521g(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams) {
        if (OtcDepend.f38138a.m45461j().isWithDrawPassword()) {
            BalanceBuyConfirmFragment.b0.launch(context, paymentMethodFragment, confirmExtraParams);
            return;
        }
        SecuritySettingDialog.Companion companion = SecuritySettingDialog.f38120x0;
        FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, new SecuritySettingDialog.SecuritySetting(false, true, false, false, false, null, 61, null));
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m46523i(final String str, final PaymentMethodList.PaymentMethod paymentMethod, final Context context, final BankCardExtraParams bankCardExtraParams, final PaymentMethodFragment paymentMethodFragment, final ConfirmExtraParams confirmExtraParams, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_description);
        textView.setText(C27017c.f54310a.m66516f(R$string.payment_switch_currency_description, str, paymentMethod.getFiatCurrency()));
        HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
        Intrinsics.checkNotNull(textView);
        highlightTextHelper.m54120f(textView, new Pair(HighlightTextHelper.TextTagEnum.SPAN, new ForegroundColorSpan(ContextCompat.getColor(context, R$color.c_text))));
        C24277v.m58540e(context, bankCardExtraParams.getBestMatchedFiatCurrencyIcon(), (ImageView) viewHolder.getView(R$id.iv_matched));
        ((TextView) viewHolder.getView(R$id.tv_matched_fiat_currency)).setText(str);
        C24277v.m58540e(context, bankCardExtraParams.getOtherFiatCurrencyIcon(), (ImageView) viewHolder.getView(R$id.iv_other));
        ((TextView) viewHolder.getView(R$id.tv_other_fiat_currency)).setText(paymentMethod.getFiatCurrency());
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_matched);
        textView2.setText(context.getString(R$string.payment_switch_currency_buy, str));
        Intrinsics.checkNotNull(textView2);
        C27046k.m66711z(textView2, 0L, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyHelperKt.m46524j(paymentMethodFragment, context, confirmExtraParams, str, bankCardExtraParams, helper);
            }
        }, 1, null);
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_other);
        textView3.setText(context.getString(R$string.payment_continue_currency_buy, paymentMethod.getFiatCurrency()));
        Intrinsics.checkNotNull(textView3);
        C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyHelperKt.m46525k(paymentMethodFragment, context, confirmExtraParams, paymentMethod, bankCardExtraParams, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m46524j(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams, String str, BankCardExtraParams bankCardExtraParams, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        paymentMethodFragment.m46554Q3("B7BuyCryBankCard");
        BankCardBuyConfirmFragment.c0.launch(context, ConfirmExtraParams.copy$default(confirmExtraParams, null, FastQuoteModel.PAY_BANK_CARD, null, str, null, null, null, null, null, null, null, false, null, 8181, null), bankCardExtraParams, C43852m.m96601m("B7PaymentMethod", "submitbutton", "1"));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m46525k(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams, PaymentMethodList.PaymentMethod paymentMethod, BankCardExtraParams bankCardExtraParams, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        paymentMethodFragment.m46554Q3("B7BuyCryBankCard");
        BankCardBuyConfirmFragment.c0.launch(context, ConfirmExtraParams.copy$default(confirmExtraParams, null, FastQuoteModel.PAY_BANK_CARD, null, C27041f.m66668h(paymentMethod.getFiatCurrency()), null, null, null, null, null, null, null, false, null, 8181, null), bankCardExtraParams, C43852m.m96601m("B7PaymentMethod", "submitbutton", "1"));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m46526l(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams) {
        GooglePayConfirmFragment.Companion.launch$default(GooglePayConfirmFragment.a0, context, paymentMethodFragment, confirmExtraParams, (String) null, 8, (Object) null);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m46528n(final Context context, String str, PaymentMethodFragment paymentMethodFragment, final PaymentMethodList.PaymentMethod paymentMethod, final ConfirmExtraParams confirmExtraParams, BaseViewHolder viewHolder, final DialogFragmentHelper helper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C24277v.m58540e(context, str, (AppCompatImageView) viewHolder.getView(R$id.iv_fiat_currency));
        ((TextView) viewHolder.getView(R$id.tv_title)).setText(paymentMethodFragment.getStringRes(R$string.payment_fast_p2p_express_title, paymentMethod.getCryptoCurrency()));
        ((TextView) viewHolder.getView(R$id.tv_step_1_title)).setText(paymentMethodFragment.getStringRes(R$string.payment_fast_convert_title, paymentMethod.getFiatCurrency(), paymentMethod.getHedgeMidCurrency()));
        ((TextView) viewHolder.getView(R$id.tv_step_1_description)).setText(paymentMethodFragment.getStringRes(R$string.payment_fast_transfer_description, paymentMethod.getFiatCurrency(), paymentMethod.getHedgeMidCurrency()));
        ((TextView) viewHolder.getView(R$id.tv_step_2_title)).setText(paymentMethodFragment.getStringRes(R$string.payment_fast_automatic_transfer_title, paymentMethod.getHedgeMidCurrency(), paymentMethod.getCryptoCurrency()));
        ((TextView) viewHolder.getView(R$id.tv_step_2_description)).setText(paymentMethodFragment.getStringRes(R$string.payment_fast_automatic_transfer_description, paymentMethod.getHedgeMidCurrency(), paymentMethod.getCryptoCurrency()));
        TextView textView = (TextView) viewHolder.getView(R$id.tv_confirm);
        Intrinsics.checkNotNull(textView);
        C27046k.m66711z(textView, 0L, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyHelperKt.m46529o(context, paymentMethod, confirmExtraParams, helper);
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m46529o(Context context, PaymentMethodList.PaymentMethod paymentMethod, ConfirmExtraParams confirmExtraParams, DialogFragmentHelper dialogFragmentHelper) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pay_fiat_currency", String.valueOf(paymentMethod.getFiatCurrency()));
        jSONObject.put("pay_crypto_currency", String.valueOf(paymentMethod.getCryptoCurrency()));
        jSONObject.put("pay_side", "buy");
        jSONObject.put("norm_version", "1");
        Unit unit = Unit.INSTANCE;
        C43852m.m96591c("B7PaymentMethodContinueGuide", "continueGuide", null, jSONObject, 4, null);
        m46535u(context, paymentMethod, confirmExtraParams, C43852m.m96602n("B7PaymentMethodContinueGuide", "continueButton", null, 4, null));
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m46532r(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams) throws JSONException {
        paymentMethodFragment.m46554Q3("B7BuyCryRevolut");
        RevolutConfirmActivity.l.launch(context, paymentMethodFragment, confirmExtraParams);
    }

    /* JADX INFO: renamed from: s */
    public static final void m46533s(PaymentMethodFragment paymentMethodFragment, Context context, PaymentMethodList.PaymentMethod paymentMethod) {
        String paymentMethodCode;
        if (!C24129b.m58030b(SiteVisibleConfigKey.ThirdParty)) {
            C43846g.m96568c(new OtcException(new Exception("third party is not available"), "BuyHelper", false, null, 8, null), null, 2, null);
            return;
        }
        if (Intrinsics.areEqual(paymentMethod.getPaymentMethodCode(), "PayID")) {
            paymentMethodCode = paymentMethod.getPaymentMethodCode();
            OtcDepend otcDepend = OtcDepend.f38138a;
            if (!otcDepend.m45464m().M() || !otcDepend.m45464m().R()) {
                SecuritySettingDialog.Companion companion = SecuritySettingDialog.f38120x0;
                FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                companion.show(childFragmentManager, new SecuritySettingDialog.SecuritySetting(true, false, true, false, false, null, 58, null));
                return;
            }
        } else {
            paymentMethodCode = "";
        }
        ThirdQuoteFragment.f40268b0.startFragment(context, C27041f.m66668h(paymentMethod.getFiatCurrency()), C27041f.m66668h(paymentMethod.getCryptoCurrency()), C27041f.m66668h(paymentMethod.getFiatAmount()), paymentMethodCode);
    }

    /* JADX INFO: renamed from: t */
    public static final void m46534t(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams) throws JSONException {
        paymentMethodFragment.m46554Q3("B7BuyZenConfirm");
        PreCheckHelper preCheckHelper = PreCheckHelper.f39543a;
        FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (preCheckHelper.m48241l(childFragmentManager)) {
            ZenConfirmFragment.Z.launch(context, paymentMethodFragment, confirmExtraParams, C43852m.m96602n("B7PaymentMethod", "submitbutton", null, 4, null));
        }
    }

    /* JADX INFO: renamed from: u */
    public static final void m46535u(Context context, PaymentMethodList.PaymentMethod paymentMethod, ConfirmExtraParams confirmExtraParams, String str) {
        String strM66668h = C27041f.m66668h(paymentMethod.getName());
        String strM66668h2 = C27041f.m66668h(paymentMethod.getPaymentMethodCode());
        String strM66668h3 = C27041f.m66668h(paymentMethod.getChannelId());
        String strM66668h4 = C27041f.m66668h(paymentMethod.getFiatCurrency());
        String strM66668h5 = C27041f.m66668h(paymentMethod.getCryptoCurrency());
        String strM66668h6 = C27041f.m66668h(paymentMethod.getFiatAmount());
        PaymentMethodList.BankCardInfo bankCardInfo = paymentMethod.getBankCardInfo();
        String cardId = bankCardInfo != null ? bankCardInfo.getCardId() : null;
        PaymentMethodList.AdInfo adInfo = paymentMethod.getAdInfo();
        String adId = adInfo != null ? adInfo.getAdId() : null;
        PaymentMethodList.AdInfo adInfo2 = paymentMethod.getAdInfo();
        BuyP2PConfirmFragment.f39170Z.launch(context, new BuyCommonConfirmExtraParams(strM66668h, strM66668h2, strM66668h3, strM66668h4, null, strM66668h5, strM66668h6, cardId, adId, adInfo2 != null ? adInfo2.getPayTypeCode() : null, false, null, null, 7184, null), str);
    }

    /* JADX INFO: renamed from: v */
    public static final void m46536v(@NotNull PaymentMethodFragment paymentMethodFragment, @NotNull Context context, @Nullable PaymentMethodList.PaymentMethod paymentMethod, @Nullable ExtraParams extraParams) {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (paymentMethod == null) {
            return;
        }
        LifecycleOwnerKt.getLifecycleScope(paymentMethodFragment).launchWhenStarted(new BuyHelperKt$previewOrderOneTimePurchase$1(paymentMethodFragment, paymentMethod, context, extraParams, null));
    }

    /* JADX INFO: renamed from: m */
    public static final void m46527m(final PaymentMethodFragment paymentMethodFragment, final Context context, final PaymentMethodList.PaymentMethod paymentMethod, final ConfirmExtraParams confirmExtraParams, final String str) {
        String hedgeMidCurrency = paymentMethod.getHedgeMidCurrency();
        if (hedgeMidCurrency != null && hedgeMidCurrency.length() != 0) {
            C43852m.m96597i("B7PaymentMethodContinueGuide", C43852m.m96602n("B7PaymentMethod", "submitButton", null, 4, null));
            DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_fast_p2p, true).m54237f4(new Function2() { // from class: com.kubi.payment.fast.paymentmethod.a
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BuyHelperKt.m46528n(context, str, paymentMethodFragment, paymentMethod, confirmExtraParams, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
                }
            });
            FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_fast_p2p_express");
            return;
        }
        m46535u(context, paymentMethod, confirmExtraParams, C43852m.m96602n("B7PaymentMethod", "submitButton", null, 4, null));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: p */
    public static final void m46530p(PaymentMethodFragment paymentMethodFragment, PaymentMethodList.PaymentMethod paymentMethod, Context context, ConfirmExtraParams confirmExtraParams, ExtraParams extraParams) throws JSONException {
        String paymentType = paymentMethod.getPaymentType();
        if (paymentType != null) {
            String cryptoCurrencyIconUrl = null;
            switch (paymentType.hashCode()) {
                case -786382386:
                    if (paymentType.equals("THIRD_PARTY")) {
                        m46533s(paymentMethodFragment, context, paymentMethod);
                        break;
                    }
                    break;
                case -448995838:
                    if (paymentType.equals("POPULAR_PAY")) {
                        m46531q(paymentMethodFragment, context, paymentMethod, confirmExtraParams);
                        break;
                    }
                    break;
                case -58169665:
                    if (paymentType.equals("P2P_EXPRESS")) {
                        if (extraParams != null) {
                            cryptoCurrencyIconUrl = extraParams.getCryptoCurrencyIconUrl();
                        }
                        m46527m(paymentMethodFragment, context, paymentMethod, confirmExtraParams, cryptoCurrencyIconUrl);
                        break;
                    }
                    break;
                case 378796732:
                    if (paymentType.equals(FastQuoteModel.PAY_BALANCE)) {
                        m46521g(paymentMethodFragment, context, confirmExtraParams);
                        break;
                    }
                    break;
                case 1028436787:
                    if (paymentType.equals(FastQuoteModel.PAY_BANK_CARD)) {
                        if (extraParams != null) {
                            cryptoCurrencyIconUrl = extraParams.getFiatCurrencyIconUrl();
                        }
                        m46522h(paymentMethodFragment, context, paymentMethod, confirmExtraParams, cryptoCurrencyIconUrl);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    public static final void m46531q(PaymentMethodFragment paymentMethodFragment, Context context, PaymentMethodList.PaymentMethod paymentMethod, ConfirmExtraParams confirmExtraParams) throws JSONException {
        String paymentMethodCode = paymentMethod.getPaymentMethodCode();
        if (paymentMethodCode != null) {
            switch (paymentMethodCode.hashCode()) {
                case -1534821982:
                    if (!paymentMethodCode.equals("google_pay")) {
                        return;
                    }
                    break;
                case 3026668:
                    if (paymentMethodCode.equals("blik")) {
                        m46534t(paymentMethodFragment, context, confirmExtraParams);
                        return;
                    }
                    return;
                case 340261873:
                    if (!paymentMethodCode.equals("google_pay_au")) {
                        return;
                    }
                    break;
                case 340261997:
                    if (!paymentMethodCode.equals("google_pay_eu")) {
                        return;
                    }
                    break;
                case 1100138591:
                    if (paymentMethodCode.equals("revolut")) {
                        m46532r(paymentMethodFragment, context, confirmExtraParams);
                        return;
                    }
                    return;
                default:
                    return;
            }
            m46526l(paymentMethodFragment, context, confirmExtraParams);
        }
    }
}
