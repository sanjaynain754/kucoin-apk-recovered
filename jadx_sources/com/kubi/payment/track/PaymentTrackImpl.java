package com.kubi.payment.track;

import com.kubi.otc.entity.FastQuoteModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentTrackImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J,\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u000eH\u0016J,\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016J,\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012H\u0016J,\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0014H\u0016J,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/payment/track/PaymentTrackImpl;", "Lcom/kubi/payment/track/IPaymentTrack;", "<init>", "()V", "trackP2P", "", "category", "", "isSuccessful", "", "reason", "data", "Lcom/kubi/payment/track/P2PTrackData;", "trackFast", "Lcom/kubi/payment/track/FastTrackData;", "trackRecharge", "Lcom/kubi/payment/track/RechargeTrackData;", "trackWithdraw", "Lcom/kubi/payment/track/WithdrawTrackData;", "trackThirdBuy", "Lcom/kubi/payment/track/ThirdBuyTrackData;", "provideJsonObject", "Lorg/json/JSONObject;", "Lcom/kubi/payment/track/PaymentTrackData;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentTrackImpl implements IPaymentTrack {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f40349b = new Companion(null);

    /* JADX INFO: compiled from: PaymentTrackImpl.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/track/PaymentTrackImpl$Companion;", "", "<init>", "()V", FastQuoteModel.PAY_P2P, "", "FAST", FastQuoteModel.PAY_RECHARGE, "WITHDRAW", "THIRD_BUY", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.payment.track.IPaymentTrack
    /* JADX INFO: renamed from: a */
    public void mo49798a(@NotNull String category, boolean z11, @Nullable String str, @Nullable RechargeTrackData rechargeTrackData) throws JSONException {
        String payChannel;
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectM49805k = m49805k(z11, category, str, rechargeTrackData);
        if (rechargeTrackData != null && (payChannel = rechargeTrackData.getPayChannel()) != null && payChannel.length() != 0) {
            jSONObjectM49805k.put("pay_channel", rechargeTrackData.getPayChannel());
        }
        C43852m.m96605q("payment_recharge_result", jSONObjectM49805k);
    }

    @Override // com.kubi.payment.track.IPaymentTrack
    /* JADX INFO: renamed from: c */
    public void mo49799c(@NotNull String category, boolean z11, @Nullable String str, @Nullable ThirdBuyTrackData thirdBuyTrackData) throws JSONException {
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectM49805k = m49805k(z11, category, str, thirdBuyTrackData);
        if (thirdBuyTrackData != null) {
            String payChannel = thirdBuyTrackData.getPayChannel();
            if (payChannel != null && payChannel.length() != 0) {
                jSONObjectM49805k.put("pay_channel", thirdBuyTrackData.getPayChannel());
            }
            String payMethod = thirdBuyTrackData.getPayMethod();
            if (payMethod != null && payMethod.length() != 0) {
                jSONObjectM49805k.put("pay_method", thirdBuyTrackData.getPayMethod());
            }
        }
        C43852m.m96605q("payment_third_buy_result", jSONObjectM49805k);
    }

    @Override // com.kubi.payment.track.IPaymentTrack
    /* JADX INFO: renamed from: d */
    public void mo49800d(@NotNull String category, boolean z11, @Nullable String str, @Nullable WithdrawTrackData withdrawTrackData) throws JSONException {
        String payChannel;
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectM49805k = m49805k(z11, category, str, withdrawTrackData);
        if (withdrawTrackData != null && (payChannel = withdrawTrackData.getPayChannel()) != null && payChannel.length() != 0) {
            jSONObjectM49805k.put("pay_channel", withdrawTrackData.getPayChannel());
        }
        C43852m.m96605q("payment_withdraw_result", jSONObjectM49805k);
    }

    @Override // com.kubi.payment.track.IPaymentTrack
    /* JADX INFO: renamed from: g */
    public void mo49801g(@NotNull String category, boolean z11, @Nullable String str, @Nullable P2PTrackData p2PTrackData) throws JSONException {
        String side;
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectM49805k = m49805k(z11, category, str, p2PTrackData);
        if (p2PTrackData != null && (side = p2PTrackData.getSide()) != null && side.length() != 0) {
            jSONObjectM49805k.put("pay_side", p2PTrackData.getSide());
        }
        C43852m.m96605q("payment_p2p_result", jSONObjectM49805k);
    }

    @Override // com.kubi.payment.track.IPaymentTrack
    /* JADX INFO: renamed from: j */
    public void mo49802j(@NotNull String category, boolean z11, @Nullable String str, @Nullable FastTrackData fastTrackData) throws JSONException {
        Intrinsics.checkNotNullParameter(category, "category");
        JSONObject jSONObjectM49805k = m49805k(z11, category, str, fastTrackData);
        if (fastTrackData != null) {
            String side = fastTrackData.getSide();
            if (side != null && side.length() != 0) {
                jSONObjectM49805k.put("pay_side", fastTrackData.getSide());
            }
            String payType = fastTrackData.getPayType();
            if (payType != null && payType.length() != 0) {
                jSONObjectM49805k.put("pay_type", fastTrackData.getPayType());
            }
        }
        C43852m.m96605q("payment_fast_trade_result", jSONObjectM49805k);
    }

    /* JADX INFO: renamed from: k */
    public final JSONObject m49805k(boolean z11, String str, String str2, PaymentTrackData paymentTrackData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_success", z11);
        jSONObject.put("category", str);
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("fail_reason", str2);
        }
        if (paymentTrackData == null) {
            return jSONObject;
        }
        String fiatCurrency = paymentTrackData.getFiatCurrency();
        if (fiatCurrency != null && fiatCurrency.length() != 0) {
            jSONObject.put("pay_fiat_currency", paymentTrackData.getFiatCurrency());
        }
        String cryptoCurrency = paymentTrackData.getCryptoCurrency();
        if (cryptoCurrency != null && cryptoCurrency.length() != 0) {
            jSONObject.put("pay_crypto_currency", paymentTrackData.getCryptoCurrency());
        }
        return jSONObject;
    }
}
