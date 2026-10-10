package com.kubi.payment.fasttradev2.buy.confirm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.buy.widget.PaymentConfirmRecurringLayout;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.FiatCouponListInfo;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmHeaderView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmInfoView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyConfirmLivePriceExplainView;
import com.kubi.payment.fasttradev2.buy.confirm.widget.BuyFluctuationTermsView;
import com.kubi.payment.fasttradev2.coupon.MarketingCouponListDialog;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27024b;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import lt.C42296a;
import lt.C42300e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import tt.C45070a;

/* JADX INFO: compiled from: BuyCommonConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 I*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001IB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\b\u0010!\u001a\u00020\u0015H&J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0007H\u0014J\b\u0010(\u001a\u00020\u0007H\u0004J\b\u0010)\u001a\u00020\u0015H\u0014J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0007H\u0014J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u001fH\u0004J\u0014\u0010.\u001a\u00020\u00152\n\u0010/\u001a\u000600j\u0002`1H\u0003J\u001a\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00072\b\b\u0002\u00104\u001a\u00020\u001fH\u0004J\u0010\u00105\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u001fH\u0002J\u0010\u00107\u001a\u00020\u00152\u0006\u00106\u001a\u00020\u001fH\u0002J\u0010\u00108\u001a\u00020\u00152\u0006\u00104\u001a\u00020\u001fH\u0002J\b\u00109\u001a\u00020\u0015H\u0002J\n\u0010:\u001a\u0004\u0018\u00010;H&J\n\u0010<\u001a\u0004\u0018\u00010=H&J\n\u0010>\u001a\u0004\u0018\u00010?H&J\n\u0010@\u001a\u0004\u0018\u00010AH&J\n\u0010B\u001a\u0004\u0018\u00010CH&J\n\u0010D\u001a\u0004\u0018\u00010EH&J\n\u0010F\u001a\u0004\u0018\u00010GH&J\b\u0010H\u001a\u00020\u0007H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006J"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment;", "VM", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "<init>", "()V", "needForceRefreshPrice", "", "getNeedForceRefreshPrice", "()Z", "setNeedForceRefreshPrice", "(Z)V", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "getExtraParams", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "setExtraParams", "(Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "setupTermsView", "refreshFluctuationTermsView", "content", "", "preCheckTerms", "placeOrder", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/BuyPreviewOrder$Response;", "onCountDownTimeUpdated", "countDownTime", "isFinished", "isRecurring", "observeData", "onRefreshing", "isRefreshing", "launchFlutterResultPage", "orderId", "handlePlaceOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "trackPlaceOrderResult", "isSuccessful", "errorMessage", "showRetryAlertTip", "message", "showRefreshPriceDialog", "showDobErrorDialog", "showAddressErrorDialog", "headerView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmHeaderView;", "oneTimeInfoView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmInfoView;", "recurringInfoView", "Lcom/kubi/payment/fast/buy/widget/PaymentConfirmRecurringLayout;", "livePriceView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyConfirmLivePriceExplainView;", "fluctuationTermsView", "Lcom/kubi/payment/fasttradev2/buy/confirm/widget/BuyFluctuationTermsView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "needCoupon", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class BuyCommonConfirmFragment<VM extends BuyCommonConfirmVM> extends BaseFastFragment<VM> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f39060X = new Companion(null);

    /* JADX INFO: renamed from: W */
    @Nullable
    public BuyCommonConfirmExtraParams f39061W;

    /* JADX INFO: compiled from: BuyCommonConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmFragment$Companion;", "", "<init>", "()V", "ORDER_TRADE_RISK_CODE", "", "ORDER_TRADE_RETRY", "ORDER_TRADE_REFRESH_PRICE", "DOB_INFORMATION_MISSED", "ADDRESS_MISSED", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmFragment$a */
    /* JADX INFO: compiled from: BuyCommonConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20718a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39062b;

        public C20718a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39062b = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p852kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f39062b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39062b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: O3 */
    public abstract KcPrimaryButton mo47495O3();

    @Nullable
    /* JADX INFO: renamed from: P3 */
    public abstract BuyFluctuationTermsView mo47496P3();

    @Nullable
    /* JADX INFO: renamed from: S3 */
    public abstract BuyConfirmHeaderView mo47498S3();

    @Nullable
    /* JADX INFO: renamed from: Y3 */
    public abstract BuyConfirmLivePriceExplainView mo47501Y3();

    /* JADX INFO: renamed from: Z3 */
    public boolean mo47502Z3() {
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: j4 */
    public abstract BuyConfirmInfoView mo47506j4();

    /* JADX INFO: renamed from: k4 */
    public abstract void mo47507k4();

    @Nullable
    /* JADX INFO: renamed from: m4 */
    public abstract PaymentConfirmRecurringLayout mo47508m4();

    @Nullable
    /* JADX INFO: renamed from: x4 */
    public abstract PaymentTermView mo47510x4();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    @VisibleForTesting
    /* JADX INFO: renamed from: R3 */
    private final void m47474R3(Exception exc) throws JSONException {
        if (!(exc instanceof ApiException)) {
            C19331c.m42836c(exc, null, 2, null);
            return;
        }
        ApiException apiException = (ApiException) exc;
        String str = apiException.code;
        if (str != null) {
            switch (str) {
                case "1999":
                    m47492v4(C27041f.m66668h(exc.getMessage()));
                    break;
                case "3004":
                    String string = getString(R$string.payment_rfq_price_exception_desc);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    m47492v4(string);
                    String strM66668h = C27041f.m66668h(getF18762X());
                    JSONObject jSONObject = new JSONObject();
                    BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39061W;
                    jSONObject.put("paymentMethodCode", buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getPaymentMethodCode() : null);
                    BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.f39061W;
                    jSONObject.put("channelId", buyCommonConfirmExtraParams2 != null ? buyCommonConfirmExtraParams2.getChannelId() : null);
                    BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = this.f39061W;
                    jSONObject.put("fiatCurrency", buyCommonConfirmExtraParams3 != null ? buyCommonConfirmExtraParams3.getFiatCurrency() : null);
                    BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = this.f39061W;
                    jSONObject.put("cryptoCurrency", buyCommonConfirmExtraParams4 != null ? buyCommonConfirmExtraParams4.getCryptoCurrency() : null);
                    Unit unit = Unit.INSTANCE;
                    C43852m.m96595g(strM66668h, "dialog", null, jSONObject, 4, null);
                    break;
                case "800103":
                    m47490t4(C27041f.m66668h(exc.getMessage()));
                    break;
                case "800107":
                    m47488r4(C27041f.m66668h(exc.getMessage()));
                    break;
                case "800110":
                    m47486p4();
                    break;
                default:
                    C19331c.m42836c(exc, null, 2, null);
                    break;
            }
        } else {
            C19331c.m42836c(exc, null, 2, null);
        }
        m47511y4(false, apiException.code + ':' + exc.getMessage());
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m47478a4(BuyCommonConfirmFragment buyCommonConfirmFragment, FiatCouponListInfo.Response response) {
        MarketingCouponListDialog.Companion companion = MarketingCouponListDialog.f39329x0;
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = buyCommonConfirmFragment.f39061W;
        companion.show(buyCommonConfirmFragment, buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getFiatCurrency() : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p4 */
    private final void m47486p4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_personal_info).m54153J4(R$string.payment_update_address_desc).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyCommonConfirmFragment.m47487q4(this.f39122b, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: q4 */
    public static final void m47487q4(BuyCommonConfirmFragment buyCommonConfirmFragment, DialogInterface dialogInterface, int i11) {
        H5Helper h5Helper = H5Helper.f39544a;
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = buyCommonConfirmFragment.f39061W;
        h5Helper.m48246b(C27041f.m66668h(buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getCardId() : null));
    }

    /* JADX INFO: renamed from: r4 */
    private final void m47488r4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_kyc_title).m54156M4(str).m54162S4(R$string.payment_update_kyc_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyCommonConfirmFragment.m47489s4(dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_update_kyc_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: s4 */
    public static final void m47489s4(DialogInterface dialogInterface, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83357j(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: t4 */
    private final void m47490t4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_fast_trade_confirm_refresh_price, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyCommonConfirmFragment.m47491u4(this.f39163b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: v4 */
    private final void m47492v4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_advcash_withdraw_result_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttradev2.buy.confirm.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BuyCommonConfirmFragment.m47493w4(this.f39121b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: z4 */
    public static /* synthetic */ void m47494z4(BuyCommonConfirmFragment buyCommonConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPlaceOrderResult");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        buyCommonConfirmFragment.m47511y4(z11, str);
    }

    @Nullable
    /* JADX INFO: renamed from: Q3, reason: from getter */
    public final BuyCommonConfirmExtraParams getF39061W() {
        return this.f39061W;
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m47499W3() {
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39061W;
        return C27025c.m66566d(buyCommonConfirmExtraParams != null ? Boolean.valueOf(buyCommonConfirmExtraParams.isRecurring()) : null);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m47500X3(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/fast/order/result", false, 2, null)).m4038a("orderId", orderId).m4038a("spm", C43852m.m96602n(C27041f.m66668h(getF18762X()), "confirmOrderButton", null, 4, null)).m4048k();
    }

    /* JADX INFO: renamed from: g4 */
    public void mo47503g4(@NotNull String countDownTime, boolean z11) {
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null) {
            buyConfirmInfoViewMo47506j4.m47735f(countDownTime);
        }
        if (z11) {
            if (!m45647o3().getF39070f0()) {
                BuyCommonConfirmVM.m47519U(m45647o3(), false, false, 2, null);
                return;
            }
            KcPrimaryButton kcPrimaryButtonMo47495O3 = mo47495O3();
            if (kcPrimaryButtonMo47495O3 != null) {
                kcPrimaryButtonMo47495O3.setText(getStringRes(R$string.pay_fast_trade_confirm_refresh_price, new Object[0]));
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void mo47504h4(@NotNull BuyPreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        BuyConfirmHeaderView buyConfirmHeaderViewMo47498S3 = mo47498S3();
        if (buyConfirmHeaderViewMo47498S3 != null) {
            buyConfirmHeaderViewMo47498S3.m47729a(C27041f.m66668h(previewOrder.getFiatAmount()), C27041f.m66668h(previewOrder.getFiatCurrency()));
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null) {
            buyConfirmInfoViewMo47506j4.m47734e(previewOrder);
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j5 = mo47506j4();
        if (buyConfirmInfoViewMo47506j5 != null) {
            buyConfirmInfoViewMo47506j5.m47733d(previewOrder.getRewardInfo(), !m45647o3().m47535N().isInitialized());
        }
        if (m47499W3()) {
            PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutMo47508m4 = mo47508m4();
            if (paymentConfirmRecurringLayoutMo47508m4 != null) {
                paymentConfirmRecurringLayoutMo47508m4.e(previewOrder.getRecurringInfo());
            }
            PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutMo47508m5 = mo47508m4();
            if (paymentConfirmRecurringLayoutMo47508m5 != null) {
                C27046k.m66685H(paymentConfirmRecurringLayoutMo47508m5);
            }
        } else {
            PaymentConfirmRecurringLayout paymentConfirmRecurringLayoutMo47508m6 = mo47508m4();
            if (paymentConfirmRecurringLayoutMo47508m6 != null) {
                C27046k.m66700o(paymentConfirmRecurringLayoutMo47508m6);
            }
        }
        if (C27025c.m66566d(previewOrder.isProtected())) {
            BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainViewMo47501Y3 = mo47501Y3();
            if (buyConfirmLivePriceExplainViewMo47501Y3 != null) {
                C27046k.m66700o(buyConfirmLivePriceExplainViewMo47501Y3);
            }
        } else {
            BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainViewMo47501Y4 = mo47501Y3();
            if (buyConfirmLivePriceExplainViewMo47501Y4 != null) {
                String fiatCurrency = previewOrder.getFiatCurrency();
                String cryptoCurrency = previewOrder.getCryptoCurrency();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                buyConfirmLivePriceExplainViewMo47501Y4.m47740c(fiatCurrency, cryptoCurrency, childFragmentManager);
            }
            BuyConfirmLivePriceExplainView buyConfirmLivePriceExplainViewMo47501Y5 = mo47501Y3();
            if (buyConfirmLivePriceExplainViewMo47501Y5 != null) {
                C27046k.m66685H(buyConfirmLivePriceExplainViewMo47501Y5);
            }
        }
        m47509n4(previewOrder.getFloatPriceTip());
        KcPrimaryButton kcPrimaryButtonMo47495O3 = mo47495O3();
        if (kcPrimaryButtonMo47495O3 != null) {
            kcPrimaryButtonMo47495O3.mo28851l();
        }
        KcPrimaryButton kcPrimaryButtonMo47495O4 = mo47495O3();
        if (kcPrimaryButtonMo47495O4 != null) {
            kcPrimaryButtonMo47495O4.setText(getStringRes(R$string.payment_confirm_order, new Object[0]));
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BuyCommonConfirmVM.m47519U(m45647o3(), true, false, 2, null);
    }

    /* JADX INFO: renamed from: y4 */
    public final void m47511y4(boolean z11, @NotNull String errorMessage) throws JSONException {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("buy", null, 2, null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39061W;
        fastTrackData.setFiatCurrency(buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getFiatCurrency() : null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.f39061W;
        fastTrackData.setCryptoCurrency(buyCommonConfirmExtraParams2 != null ? buyCommonConfirmExtraParams2.getCryptoCurrency() : null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = this.f39061W;
        fastTrackData.setPaymentMethodCode(buyCommonConfirmExtraParams3 != null ? buyCommonConfirmExtraParams3.getPaymentMethodCode() : null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = this.f39061W;
        fastTrackData.setChannelId(buyCommonConfirmExtraParams4 != null ? buyCommonConfirmExtraParams4.getChannelId() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("PLACE_ORDER", z11, errorMessage, fastTrackData);
        C42296a c42296a = C42296a.f93790a;
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams5 = this.f39061W;
        String strM66668h = C27041f.m66668h(buyCommonConfirmExtraParams5 != null ? buyCommonConfirmExtraParams5.getCryptoCurrency() : null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams6 = this.f39061W;
        String strM66668h2 = C27041f.m66668h(buyCommonConfirmExtraParams6 != null ? buyCommonConfirmExtraParams6.getFiatCurrency() : null);
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams7 = this.f39061W;
        String paymentMethodCode = buyCommonConfirmExtraParams7 != null ? buyCommonConfirmExtraParams7.getPaymentMethodCode() : null;
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams8 = this.f39061W;
        C42296a.m92834b(c42296a, z11, errorMessage, strM66668h, strM66668h2, "pay_fast_buy", null, null, null, null, paymentMethodCode, buyCommonConfirmExtraParams8 != null ? buyCommonConfirmExtraParams8.getChannelId() : null, TXVodDownloadDataSource.QUALITY_480P, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public static final Unit m47475T3(BuyCommonConfirmFragment buyCommonConfirmFragment) {
        if (buyCommonConfirmFragment.m47499W3()) {
            C42300e c42300e = C42300e.f93799a;
            FragmentManager childFragmentManager = buyCommonConfirmFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            C42300e.m92839e(c42300e, childFragmentManager, "payment_dialog_fast_buy_fee_explain", buyCommonConfirmFragment.getStringRes(R$string.payment_investmentorder_fee_title, new Object[0]), buyCommonConfirmFragment.getStringRes(R$string.payment_investmentorder_fee_content, new Object[0]), null, null, null, 112, null);
        } else {
            BuyPreviewOrder.Response value = ((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3()).m47534M().getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            FastBuyConfirmFeeDialog.Companion companion = FastBuyConfirmFeeDialog.f39078t0;
            FragmentManager childFragmentManager2 = buyCommonConfirmFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
            companion.show(childFragmentManager2, (BuyPreviewOrder.Response.BuyFeeInfo) CollectionsKt.firstOrNull(C27024b.m66560c(value.getFeeInfoList())));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public static final Unit m47476U3(BuyCommonConfirmFragment buyCommonConfirmFragment, KcPrimaryButton kcPrimaryButton) throws JSONException {
        String paymentMethodCode;
        String channelId;
        String fiatCurrency;
        String cryptoCurrency;
        String strM66668h = C27041f.m66668h(buyCommonConfirmFragment.getF18762X());
        JSONObject jSONObject = new JSONObject();
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = buyCommonConfirmFragment.f39061W;
        if (buyCommonConfirmExtraParams != null) {
            paymentMethodCode = buyCommonConfirmExtraParams.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("paymentMethodCode", C27041f.m66668h(paymentMethodCode));
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = buyCommonConfirmFragment.f39061W;
        if (buyCommonConfirmExtraParams2 != null) {
            channelId = buyCommonConfirmExtraParams2.getChannelId();
        } else {
            channelId = null;
        }
        jSONObject.put("channelId", C27041f.m66668h(channelId));
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = buyCommonConfirmFragment.f39061W;
        if (buyCommonConfirmExtraParams3 != null) {
            fiatCurrency = buyCommonConfirmExtraParams3.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        jSONObject.put("pay_fiat_currency", C27041f.m66668h(fiatCurrency));
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = buyCommonConfirmFragment.f39061W;
        if (buyCommonConfirmExtraParams4 != null) {
            cryptoCurrency = buyCommonConfirmExtraParams4.getCryptoCurrency();
        } else {
            cryptoCurrency = null;
        }
        jSONObject.put("pay_crypto_currency", C27041f.m66668h(cryptoCurrency));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM66668h, "confirm", "1", jSONObject);
        if (((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3()).getF39071g0()) {
            if (kcPrimaryButton.getF44406k()) {
                return Unit.INSTANCE;
            }
            kcPrimaryButton.m55043o();
            BuyCommonConfirmVM.m47519U((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3(), false, false, 2, null);
        } else if (buyCommonConfirmFragment.m47484l4()) {
            buyCommonConfirmFragment.mo47507k4();
        } else {
            ToastCompat.m66437C(R$string.payment_please_agree_terms);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public static final Unit m47477V3(BuyCommonConfirmFragment buyCommonConfirmFragment) {
        ((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3()).m47540S();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m47479b4(BuyCommonConfirmFragment buyCommonConfirmFragment, Boolean bool) {
        Intrinsics.checkNotNull(bool);
        buyCommonConfirmFragment.mo47505i4(bool.booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c4 */
    public static final Unit m47480c4(BuyCommonConfirmFragment buyCommonConfirmFragment, BuyPreviewOrder.Response response) {
        Intrinsics.checkNotNull(response);
        buyCommonConfirmFragment.mo47504h4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d4 */
    public static final Unit m47481d4(BuyCommonConfirmFragment buyCommonConfirmFragment, String str) {
        Intrinsics.checkNotNull(str);
        buyCommonConfirmFragment.mo47503g4(str, Intrinsics.areEqual(str, "0"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e4 */
    public static final Unit m47482e4(BuyCommonConfirmFragment buyCommonConfirmFragment, Exception exc) throws JSONException {
        Intrinsics.checkNotNull(exc);
        buyCommonConfirmFragment.m47474R3(exc);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public static final Unit m47483f4(BuyCommonConfirmFragment buyCommonConfirmFragment, String str) {
        ((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3()).m47541T(false, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l4 */
    private final boolean m47484l4() {
        boolean zM66566d;
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (mo47496P3() != null) {
            BuyFluctuationTermsView buyFluctuationTermsViewMo47496P3 = mo47496P3();
            if (buyFluctuationTermsViewMo47496P3 != null) {
                boolValueOf = Boolean.valueOf(buyFluctuationTermsViewMo47496P3.m47746c());
            } else {
                boolValueOf = null;
            }
            zM66566d = C27025c.m66566d(boolValueOf);
        } else {
            zM66566d = true;
        }
        if (mo47510x4() != null) {
            if (zM66566d) {
                PaymentTermView paymentTermViewMo47510x4 = mo47510x4();
                if (paymentTermViewMo47510x4 != null) {
                    boolValueOf2 = Boolean.valueOf(paymentTermViewMo47510x4.m49900b());
                }
                if (C27025c.m66566d(boolValueOf2)) {
                    return true;
                }
            }
            return false;
        }
        return zM66566d;
    }

    /* JADX INFO: renamed from: o4 */
    private final void m47485o4() {
        String paymentMethodCode;
        PaymentTermView paymentTermViewMo47510x4 = mo47510x4();
        if (paymentTermViewMo47510x4 != null) {
            C27046k.m66685H(paymentTermViewMo47510x4);
        }
        PaymentTermView paymentTermViewMo47510x5 = mo47510x4();
        if (paymentTermViewMo47510x5 != null) {
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39061W;
            String channelId = null;
            if (buyCommonConfirmExtraParams != null) {
                paymentMethodCode = buyCommonConfirmExtraParams.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.f39061W;
            if (buyCommonConfirmExtraParams2 != null) {
                channelId = buyCommonConfirmExtraParams2.getChannelId();
            }
            paymentTermViewMo47510x5.m49903e("fastBuy", paymentMethodCode, channelId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public static final void m47491u4(BuyCommonConfirmFragment buyCommonConfirmFragment, DialogInterface dialogInterface, int i11) {
        BuyCommonConfirmVM.m47519U((BuyCommonConfirmVM) buyCommonConfirmFragment.m45647o3(), false, false, 2, null);
    }

    /* JADX INFO: renamed from: w4 */
    public static final void m47493w4(BuyCommonConfirmFragment buyCommonConfirmFragment, DialogInterface dialogInterface, int i11) {
        buyCommonConfirmFragment.preformBackPressed();
    }

    @Override // com.kubi.payment.fast.common.BaseFastFragment, com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams;
        Bundle arguments = getArguments();
        if (arguments != null) {
            buyCommonConfirmExtraParams = (BuyCommonConfirmExtraParams) RouteExKt.m56274t(arguments, "data");
        } else {
            buyCommonConfirmExtraParams = null;
        }
        this.f39061W = buyCommonConfirmExtraParams;
        return new BuyConfirmVMFactory(C45070a.m99667d(), BaseApplication.INSTANCE.get(), this.f39061W);
    }

    /* JADX INFO: renamed from: i4 */
    public void mo47505i4(boolean z11) {
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null) {
            buyConfirmInfoViewMo47506j4.setRefreshing(z11);
        }
    }

    /* JADX INFO: renamed from: n4 */
    public final void m47509n4(String str) {
        BuyFluctuationTermsView buyFluctuationTermsViewMo47496P3 = mo47496P3();
        if (buyFluctuationTermsViewMo47496P3 != null) {
            buyFluctuationTermsViewMo47496P3.m47747d(str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.f39061W == null) {
            preformBackPressed();
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        BuyConfirmInfoView buyConfirmInfoViewMo47506j4 = mo47506j4();
        if (buyConfirmInfoViewMo47506j4 != null) {
            buyConfirmInfoViewMo47506j4.setOnFeeClickListener(new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuyCommonConfirmFragment.m47475T3(this.f39159b);
                }
            });
        }
        m47485o4();
        final KcPrimaryButton kcPrimaryButtonMo47495O3 = mo47495O3();
        if (kcPrimaryButtonMo47495O3 != null) {
            C27046k.m66711z(kcPrimaryButtonMo47495O3, 0L, new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuyCommonConfirmFragment.m47476U3(this.f39160b, kcPrimaryButtonMo47495O3);
                }
            }, 1, null);
        }
        BuyConfirmInfoView buyConfirmInfoViewMo47506j5 = mo47506j4();
        if (buyConfirmInfoViewMo47506j5 != null) {
            buyConfirmInfoViewMo47506j5.m47732b(mo47502Z3(), new Function0() { // from class: com.kubi.payment.fasttradev2.buy.confirm.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BuyCommonConfirmFragment.m47477V3(this.f39162b);
                }
            });
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m47538Q().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47479b4(this.f39083b, (Boolean) obj);
            }
        }));
        m45647o3().m47534M().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47480c4(this.f39123b, (BuyPreviewOrder.Response) obj);
            }
        }));
        m45647o3().m47529H().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47481d4(this.f39124b, (String) obj);
            }
        }));
        m45647o3().m47533L().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47482e4(this.f39125b, (Exception) obj);
            }
        }));
        m45647o3().m47535N().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.h
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47483f4(this.f39140b, (String) obj);
            }
        }));
        m45647o3().m47531J().observe(getViewLifecycleOwner(), new C20718a(new Function1() { // from class: com.kubi.payment.fasttradev2.buy.confirm.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BuyCommonConfirmFragment.m47478a4(this.f39141b, (FiatCouponListInfo.Response) obj);
            }
        }));
    }
}
