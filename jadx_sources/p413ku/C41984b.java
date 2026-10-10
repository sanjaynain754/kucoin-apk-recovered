package p413ku;

import android.content.Context;
import android.util.Base64;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$string;
import com.kubi.payment.third.data.entities.MobilumOrder;
import com.kubi.payment.third.data.entities.ThirdOrder;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.ThirdBuyTrackData;
import com.kubi.router.core.Router;
import com.kubi.user.protocol.entity.SignTermItem;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.sumsub.sns.BuildConfig;
import et.C37242d;
import java.math.BigDecimal;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026ay.C4400a;
import p694vk.C45590s;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Charsets;

/* JADX INFO: renamed from: ku.b */
/* JADX INFO: compiled from: ChannelHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J'\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000fJ\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0007\u0010\t¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/payment/third/channel/ChannelHelper;", "", "<init>", "()V", "SANDBOX", "", "PRODUCTION", "isSandbox", "", "()Z", "isSandbox$delegate", "Lkotlin/Lazy;", "launchLegendChannel", "", "order", "Lcom/kubi/payment/third/data/entities/ThirdOrder;", "needRedirect", "(Lcom/kubi/payment/third/data/entities/ThirdOrder;Ljava/lang/Boolean;)V", "launchSimplexChannel", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/kubi/payment/third/data/entities/ThirdOrder;Ljava/lang/Boolean;)V", "launchMobilumChannel", "launchOtherChannel", "getSimplexPayForm", "trackCheckChannelJump", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41984b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C41984b f92193a = new C41984b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f92194b = LazyKt.lazy(new Function0() { // from class: ku.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(C41984b.m92049d());
        }
    });

    /* JADX INFO: renamed from: d */
    public static final boolean m92049d() {
        C45590s c45590s = C45590s.f102687a;
        return !c45590s.m100680e0() && c45590s.m100666Q();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m92050f(C41984b c41984b, ThirdOrder thirdOrder, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        c41984b.m92055e(thirdOrder, bool);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m92051i(C41984b c41984b, ThirdOrder thirdOrder, Boolean bool, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bool = Boolean.TRUE;
        }
        c41984b.m92057h(thirdOrder, bool);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m92052k(C41984b c41984b, Context context, ThirdOrder thirdOrder, Boolean bool, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            bool = Boolean.TRUE;
        }
        c41984b.m92058j(context, thirdOrder, bool);
    }

    /* JADX INFO: renamed from: b */
    public final String m92053b(ThirdOrder thirdOrder) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<html><head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><title>KuCoin</title></head><body onload=\"document.getElementById('simplex_form').submit();\"><form id='simplex_form' target='_self' method='post' action='");
        sb2.append(m92054c() ? "https://sandbox.test-simplexcc.com/payments/new" : "https://checkout.simplexcc.com/payments/new");
        sb2.append("'><input type='hidden' name='version' value='1'><input type='hidden' name='partner' value='kucoin'><input type='hidden' name='payment_flow_type' value='wallet'><input type='hidden' name='return_url' value='");
        sb2.append(C37242d.f82569a.m83356i());
        sb2.append("'><input type='hidden' name='quote_id' value='");
        sb2.append(thirdOrder.getQuoteId());
        sb2.append("'><input type='hidden' name='payment_id' value='");
        sb2.append(thirdOrder.getPaymentId());
        sb2.append("'><input type='hidden' name='user_id' value='");
        sb2.append(thirdOrder.getLocalUserId());
        sb2.append("'><input type='hidden' name='destination_wallet[address]' value='");
        sb2.append(thirdOrder.getWalletAddress());
        sb2.append("'><input type='hidden' name='destination_wallet[currency]' value='");
        sb2.append(thirdOrder.getDigitalCurrency());
        sb2.append("'><input type='hidden' name='fiat_total_amount[amount]' value='");
        BigDecimal fiatAmount = thirdOrder.getFiatAmount();
        sb2.append(fiatAmount != null ? fiatAmount.toPlainString() : null);
        sb2.append("'><input type='hidden' name='fiat_total_amount[currency]' value='");
        sb2.append(thirdOrder.getFiatCurrency());
        sb2.append("'><input type='hidden' name='digital_total_amount[amount]' value='");
        BigDecimal digitalAmount = thirdOrder.getDigitalAmount();
        sb2.append(digitalAmount != null ? digitalAmount.toPlainString() : null);
        sb2.append("'><input type='hidden' name='digital_total_amount[currency]' value='");
        sb2.append(thirdOrder.getDigitalCurrency());
        sb2.append("'></form></body></html>");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92054c() {
        return ((Boolean) f92194b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m92055e(@NotNull ThirdOrder order, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(order, "order");
        String redirectUrl = order.getRedirectUrl();
        if (redirectUrl == null || redirectUrl.length() == 0) {
            ToastCompat.m66437C(R$string.system_error);
            m92059l(order);
            return;
        }
        String str = m92054c() ? "sandbox" : BuildConfig.SENTRY_ENVIRONMENT;
        C4400a c4400aM4038a = Router.f46192a.m56184f(SignTermItem.LINK).m4038a("url", order.getRedirectUrl() + "mode=" + str);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            c4400aM4038a.m4050m("otc/orderList?index=2&channel=" + order.getChannel());
        }
        c4400aM4038a.m4048k();
    }

    /* JADX INFO: renamed from: g */
    public final void m92056g(@NotNull Context context, @NotNull ThirdOrder order) {
        String upperCase;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(order, "order");
        MobilumOrder mobilumOrder = order.getMobilumOrder();
        String widgetBase64Html = mobilumOrder != null ? mobilumOrder.getWidgetBase64Html() : null;
        if (widgetBase64Html == null || widgetBase64Html.length() == 0) {
            ToastCompat.m66437C(R$string.system_error);
            m92059l(order);
            return;
        }
        String channel = order.getChannel();
        if (channel != null) {
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            upperCase = channel.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        String strM66668h = C27041f.m66668h(upperCase);
        MobilumOrder mobilumOrder2 = order.getMobilumOrder();
        byte[] bArrDecode = Base64.decode(C27041f.m66668h(mobilumOrder2 != null ? mobilumOrder2.getWidgetBase64Html() : null), 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        PaymentWebActivity.Companion.openHtml$default(PaymentWebActivity.f37079t, context, new String(bArrDecode, Charsets.UTF_8), strM66668h, null, null, false, 56, null);
    }

    /* JADX INFO: renamed from: h */
    public final void m92057h(@NotNull ThirdOrder order, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(order, "order");
        String redirectUrl = order.getRedirectUrl();
        if (redirectUrl == null || redirectUrl.length() == 0) {
            ToastCompat.m66437C(R$string.system_error);
            m92059l(order);
            return;
        }
        C4400a c4400aM4038a = Router.f46192a.m56184f(SignTermItem.LINK).m4038a("url", order.getRedirectUrl());
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            c4400aM4038a.m4050m("otc/orderList?index=2&channel=" + order.getChannel());
        }
        c4400aM4038a.m4048k();
    }

    /* JADX INFO: renamed from: j */
    public final void m92058j(@NotNull Context context, @NotNull ThirdOrder order, @Nullable Boolean bool) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(order, "order");
        String quoteId = order.getQuoteId();
        if (quoteId == null || quoteId.length() == 0) {
            ToastCompat.m66437C(R$string.system_error);
            m92059l(order);
            return;
        }
        String strM92053b = m92053b(order);
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            str = "otc/orderList?index=2&channel=" + order.getChannel();
        } else {
            str = null;
        }
        PaymentWebActivity.Companion.openHtml$default(PaymentWebActivity.f37079t, context, strM92053b, null, null, str, false, 44, null);
    }

    /* JADX INFO: renamed from: l */
    public final void m92059l(ThirdOrder thirdOrder) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        ThirdBuyTrackData thirdBuyTrackData = new ThirdBuyTrackData(thirdOrder.getChannel(), thirdOrder.getPaymentId());
        thirdBuyTrackData.setFiatCurrency(thirdOrder.getFiatCurrency());
        thirdBuyTrackData.setCryptoCurrency(thirdOrder.getCurrency());
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49797i(track, "CHECK_CHANNEL_JUMP", false, "-10001:CHECK_CHANNEL_JUMP", thirdBuyTrackData, 2, null);
    }
}
