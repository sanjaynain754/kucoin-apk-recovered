package com.kubi.payment.fasttrade.sell.confirm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fasttrade.sell.confirm.SellCommonConfirmVM;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmHeaderView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellLivePriceExplainView;
import com.kubi.payment.helper.H5Helper;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.widget.PaymentTermView;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.button.KcPrimaryButton;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import io.chad.library.adapter.base.BaseViewHolder;
import lt.C42296a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;
import tt.C45070a;

/* JADX INFO: compiled from: SellCommonConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 @*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0007H\u0002J\b\u0010\u001e\u001a\u00020\u0015H&J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0014J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007H\u0004J\b\u0010&\u001a\u00020\u0015H\u0014J\u0014\u0010'\u001a\u00020\u00152\n\u0010(\u001a\u00060)j\u0002`*H\u0007J\u001a\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00072\b\b\u0002\u0010-\u001a\u00020$H\u0004J\u0012\u0010.\u001a\u00020\u00152\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\u0010\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020$H\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u00020$H\u0002J\u0010\u00104\u001a\u00020\u00152\u0006\u0010-\u001a\u00020$H\u0002J\b\u00105\u001a\u00020\u0015H\u0002J\n\u00106\u001a\u0004\u0018\u000107H&J\n\u00108\u001a\u0004\u0018\u000109H&J\n\u0010:\u001a\u0004\u0018\u00010;H&J\n\u0010<\u001a\u0004\u0018\u00010=H&J\n\u0010>\u001a\u0004\u0018\u00010?H&R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006A"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmFragment;", "VM", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmVM;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "<init>", "()V", "needForceRefreshPrice", "", "getNeedForceRefreshPrice", "()Z", "setNeedForceRefreshPrice", "(Z)V", "extraParams", "Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "getExtraParams", "()Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;", "setExtraParams", "(Lcom/kubi/payment/fasttrade/sell/confirm/SellCommonConfirmExtraParams;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "initViews", "setupTermsView", "preCheckTerms", "placeOrder", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "onCountDownTimeUpdated", "countDownTime", "", "isFinished", "observeData", "handlePlaceOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "trackPlaceOrderResult", "isSuccessful", "errorMessage", "showTaxExplainDialog", "taxInfo", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response$TaxInfo;", "showRetryAlertTip", "message", "showRefreshPriceDialog", "showDobErrorDialog", "showAddressErrorDialog", "headerView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmHeaderView;", "confirmInfoView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView;", "livePriceView", "Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellLivePriceExplainView;", "termsView", "Lcom/kubi/payment/widget/PaymentTermView;", "confirmView", "Lcom/kubi/resources/widget/button/KcPrimaryButton;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class SellConfirmFragment<VM extends SellCommonConfirmVM> extends BaseFastFragment<VM> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f38840X = new Companion(null);

    /* JADX INFO: renamed from: W */
    @Nullable
    public SellCommonConfirmExtraParams f38841W;

    /* JADX INFO: compiled from: SellCommonConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/SellConfirmFragment$Companion;", "", "<init>", "()V", "ORDER_TRADE_RISK_CODE", "", "ORDER_TRADE_RETRY", "ORDER_TRADE_REFRESH_PRICE", "DOB_INFORMATION_MISSED", "ADDRESS_MISSED", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.confirm.SellConfirmFragment$a */
    /* JADX INFO: compiled from: SellCommonConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20601a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38842b;

        public C20601a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38842b = function;
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
            return this.f38842b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38842b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: P3 */
    public abstract SellConfirmInfoView mo46998P3();

    @Nullable
    /* JADX INFO: renamed from: Q3 */
    public abstract KcPrimaryButton mo46999Q3();

    @Nullable
    /* JADX INFO: renamed from: T3 */
    public abstract SellConfirmHeaderView mo47002T3();

    @Nullable
    /* JADX INFO: renamed from: X3 */
    public abstract SellLivePriceExplainView mo47003X3();

    /* JADX INFO: renamed from: e4 */
    public abstract void mo47006e4();

    @Nullable
    /* JADX INFO: renamed from: t4 */
    public abstract PaymentTermView mo47008t4();

    /* JADX INFO: renamed from: h4 */
    private final void m46986h4() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_personal_info).m54153J4(R$string.payment_update_address_desc).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SellConfirmFragment.m46987i4(this.f38870b, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: i4 */
    public static final void m46987i4(SellConfirmFragment sellConfirmFragment, DialogInterface dialogInterface, int i11) {
        H5Helper h5Helper = H5Helper.f39544a;
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams = sellConfirmFragment.f38841W;
        h5Helper.m48246b(C27041f.m66668h(sellCommonConfirmExtraParams != null ? sellCommonConfirmExtraParams.getCardId() : null));
    }

    /* JADX INFO: renamed from: j4 */
    private final void m46988j4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_kyc_title).m54156M4(str).m54162S4(R$string.payment_update_kyc_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SellConfirmFragment.m46989k4(dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_update_kyc_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: k4 */
    public static final void m46989k4(DialogInterface dialogInterface, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83357j(), null, null, null, null, null, null, 126, null);
    }

    /* JADX INFO: renamed from: l4 */
    private final void m46990l4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_fast_trade_confirm_refresh_price, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SellConfirmFragment.m46991m4(this.f38881b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: n4 */
    private final void m46992n4(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_advcash_withdraw_result_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.confirm.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                SellConfirmFragment.m46993o4(this.f38880b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: q4 */
    public static final Unit m46994q4(final SellPreviewOrder.Response.TaxInfo taxInfo, BaseViewHolder viewHolder, final DialogFragmentHelper dialogFragmentHelper) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "dialogFragmentHelper");
        TextView textView = (TextView) viewHolder.getView(R$id.tv_title);
        if (textView != null) {
            textView.setText(C27041f.m66668h(taxInfo.getTitle()));
        }
        TextView textView2 = (TextView) viewHolder.getView(R$id.tv_content);
        if (textView2 != null) {
            textView2.setText(C27041f.m66668h(taxInfo.getDescription()));
        }
        TextView textView3 = (TextView) viewHolder.getView(R$id.tv_learn_more);
        if (textView3 != null) {
            textView3.getPaint().setFlags(8);
            textView3.getPaint().setAntiAlias(true);
            C27046k.m66711z(textView3, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmFragment.m46995r4(taxInfo);
                }
            }, 1, null);
        }
        TextView textView4 = (TextView) viewHolder.getView(R$id.tv_confirm);
        if (textView4 != null) {
            C27046k.m66711z(textView4, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmFragment.m46996s4(dialogFragmentHelper);
                }
            }, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v4 */
    public static /* synthetic */ void m46997v4(SellConfirmFragment sellConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPlaceOrderResult");
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        sellConfirmFragment.m47009u4(z11, str);
    }

    @Nullable
    /* JADX INFO: renamed from: R3, reason: from getter */
    public final SellCommonConfirmExtraParams getF38841W() {
        return this.f38841W;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    @VisibleForTesting
    /* JADX INFO: renamed from: S3 */
    public final void m47001S3(@NotNull Exception error) throws JSONException {
        Intrinsics.checkNotNullParameter(error, "error");
        if (!(error instanceof ApiException)) {
            C19331c.m42836c(error, null, 2, null);
            return;
        }
        ApiException apiException = (ApiException) error;
        String str = apiException.code;
        if (str != null) {
            switch (str) {
                case "1999":
                    m46992n4(C27041f.m66668h(error.getMessage()));
                    break;
                case "3004":
                    String string = getString(R$string.payment_rfq_price_exception_desc);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    m46992n4(string);
                    String strM66668h = C27041f.m66668h(getF34288V());
                    JSONObject jSONObject = new JSONObject();
                    SellCommonConfirmExtraParams sellCommonConfirmExtraParams = this.f38841W;
                    jSONObject.put("paymentMethodCode", sellCommonConfirmExtraParams != null ? sellCommonConfirmExtraParams.getPaymentMethodCode() : null);
                    SellCommonConfirmExtraParams sellCommonConfirmExtraParams2 = this.f38841W;
                    jSONObject.put("channelId", sellCommonConfirmExtraParams2 != null ? sellCommonConfirmExtraParams2.getChannelId() : null);
                    SellCommonConfirmExtraParams sellCommonConfirmExtraParams3 = this.f38841W;
                    jSONObject.put("fiatCurrency", sellCommonConfirmExtraParams3 != null ? sellCommonConfirmExtraParams3.getFiatCurrency() : null);
                    SellCommonConfirmExtraParams sellCommonConfirmExtraParams4 = this.f38841W;
                    jSONObject.put("cryptoCurrency", sellCommonConfirmExtraParams4 != null ? sellCommonConfirmExtraParams4.getCryptoCurrency() : null);
                    Unit unit = Unit.INSTANCE;
                    C43852m.m96595g(strM66668h, "dialog", null, jSONObject, 4, null);
                    break;
                case "800103":
                    m46990l4(C27041f.m66668h(error.getMessage()));
                    break;
                case "800107":
                    m46988j4(C27041f.m66668h(error.getMessage()));
                    break;
                case "800110":
                    m46986h4();
                    break;
                default:
                    C19331c.m42836c(error, null, 2, null);
                    break;
            }
        } else {
            C19331c.m42836c(error, null, 2, null);
        }
        m47009u4(false, apiException.code + ':' + error.getMessage());
    }

    /* JADX INFO: renamed from: c4 */
    public final void m47004c4(@NotNull String countDownTime, boolean z11) {
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null) {
            sellConfirmInfoViewMo46998P3.m47095g(countDownTime);
        }
        if (z11) {
            if (!m45647o3().getF38836f0()) {
                m45647o3().m46962L(false);
                return;
            }
            KcPrimaryButton kcPrimaryButtonMo46999Q3 = mo46999Q3();
            if (kcPrimaryButtonMo46999Q3 != null) {
                kcPrimaryButtonMo46999Q3.setText(getStringRes(R$string.pay_fast_trade_confirm_refresh_price, new Object[0]));
            }
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void mo47005d4(@NotNull SellPreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        SellConfirmHeaderView sellConfirmHeaderViewMo47002T3 = mo47002T3();
        if (sellConfirmHeaderViewMo47002T3 != null) {
            sellConfirmHeaderViewMo47002T3.m47088a(C27041f.m66668h(previewOrder.getCryptoAmount()), C27041f.m66668h(previewOrder.getCryptoCurrency()));
        }
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null) {
            sellConfirmInfoViewMo46998P3.m47093e(previewOrder);
        }
        if (C27025c.m66566d(previewOrder.isProtected())) {
            SellLivePriceExplainView sellLivePriceExplainViewMo47003X3 = mo47003X3();
            if (sellLivePriceExplainViewMo47003X3 != null) {
                C27046k.m66700o(sellLivePriceExplainViewMo47003X3);
            }
        } else {
            SellLivePriceExplainView sellLivePriceExplainViewMo47003X4 = mo47003X3();
            if (sellLivePriceExplainViewMo47003X4 != null) {
                String fiatCurrency = previewOrder.getFiatCurrency();
                String cryptoCurrency = previewOrder.getCryptoCurrency();
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                sellLivePriceExplainViewMo47003X4.m47104c(fiatCurrency, cryptoCurrency, childFragmentManager);
            }
            SellLivePriceExplainView sellLivePriceExplainViewMo47003X5 = mo47003X3();
            if (sellLivePriceExplainViewMo47003X5 != null) {
                C27046k.m66685H(sellLivePriceExplainViewMo47003X5);
            }
        }
        KcPrimaryButton kcPrimaryButtonMo46999Q3 = mo46999Q3();
        if (kcPrimaryButtonMo46999Q3 != null) {
            kcPrimaryButtonMo46999Q3.mo28851l();
        }
        KcPrimaryButton kcPrimaryButtonMo46999Q4 = mo46999Q3();
        if (kcPrimaryButtonMo46999Q4 != null) {
            kcPrimaryButtonMo46999Q4.setText(getStringRes(R$string.payment_confirm_order, new Object[0]));
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m45647o3().m46962L(true);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m47007p4(final SellPreviewOrder.Response.TaxInfo taxInfo) {
        if (taxInfo == null) {
            C44128b.m97265i("fast sell showTaxExplainDialog taxInfo is null");
            return;
        }
        DialogFragmentHelper dialogFragmentHelperM54237f4 = DialogFragmentHelper.f43568p0.newInstance(R$layout.payment_dialog_tax_explain, true).m54237f4(new Function2() { // from class: com.kubi.payment.fasttrade.sell.confirm.c
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SellConfirmFragment.m46994q4(taxInfo, (BaseViewHolder) obj, (DialogFragmentHelper) obj2);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        dialogFragmentHelperM54237f4.show(childFragmentManager, "payment_fast_sell_p2p_tax_dialog");
    }

    /* JADX INFO: renamed from: u4 */
    public final void m47009u4(boolean z11, @NotNull String errorMessage) throws JSONException {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FastTrackData fastTrackData = new FastTrackData("sell", null, 2, null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams = this.f38841W;
        fastTrackData.setFiatCurrency(sellCommonConfirmExtraParams != null ? sellCommonConfirmExtraParams.getFiatCurrency() : null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams2 = this.f38841W;
        fastTrackData.setCryptoCurrency(sellCommonConfirmExtraParams2 != null ? sellCommonConfirmExtraParams2.getCryptoCurrency() : null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams3 = this.f38841W;
        fastTrackData.setPaymentMethodCode(sellCommonConfirmExtraParams3 != null ? sellCommonConfirmExtraParams3.getPaymentMethodCode() : null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams4 = this.f38841W;
        fastTrackData.setChannelId(sellCommonConfirmExtraParams4 != null ? sellCommonConfirmExtraParams4.getChannelId() : null);
        Unit unit = Unit.INSTANCE;
        track.mo49802j("PLACE_ORDER", z11, errorMessage, fastTrackData);
        C42296a c42296a = C42296a.f93790a;
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams5 = this.f38841W;
        String strM66668h = C27041f.m66668h(sellCommonConfirmExtraParams5 != null ? sellCommonConfirmExtraParams5.getCryptoCurrency() : null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams6 = this.f38841W;
        String strM66668h2 = C27041f.m66668h(sellCommonConfirmExtraParams6 != null ? sellCommonConfirmExtraParams6.getFiatCurrency() : null);
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams7 = this.f38841W;
        String paymentMethodCode = sellCommonConfirmExtraParams7 != null ? sellCommonConfirmExtraParams7.getPaymentMethodCode() : null;
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams8 = this.f38841W;
        C42296a.m92834b(c42296a, z11, errorMessage, strM66668h, strM66668h2, "pay_fast_sell", null, null, null, null, paymentMethodCode, sellCommonConfirmExtraParams8 != null ? sellCommonConfirmExtraParams8.getChannelId() : null, TXVodDownloadDataSource.QUALITY_480P, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public static final Unit m46977U3(SellConfirmFragment sellConfirmFragment) {
        SellPreviewOrder.Response value = ((SellCommonConfirmVM) sellConfirmFragment.m45647o3()).m46957G().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        FastSellConfirmFeeDialog.Companion companion = FastSellConfirmFeeDialog.f38824t0;
        FragmentManager childFragmentManager = sellConfirmFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, value.getFeeInfo());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public static final Unit m46978V3(SellConfirmFragment sellConfirmFragment) {
        SellPreviewOrder.Response value = ((SellCommonConfirmVM) sellConfirmFragment.m45647o3()).m46957G().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        sellConfirmFragment.m47007p4(value.getTaxInfo());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public static final Unit m46979W3(SellConfirmFragment sellConfirmFragment, KcPrimaryButton kcPrimaryButton) throws JSONException {
        String paymentMethodCode;
        String channelId;
        String fiatCurrency;
        String strM66668h = C27041f.m66668h(sellConfirmFragment.getF34288V());
        JSONObject jSONObject = new JSONObject();
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams = sellConfirmFragment.f38841W;
        String cryptoCurrency = null;
        if (sellCommonConfirmExtraParams != null) {
            paymentMethodCode = sellCommonConfirmExtraParams.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("paymentMethodCode", C27041f.m66668h(paymentMethodCode));
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams2 = sellConfirmFragment.f38841W;
        if (sellCommonConfirmExtraParams2 != null) {
            channelId = sellCommonConfirmExtraParams2.getChannelId();
        } else {
            channelId = null;
        }
        jSONObject.put("channelId", C27041f.m66668h(channelId));
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams3 = sellConfirmFragment.f38841W;
        if (sellCommonConfirmExtraParams3 != null) {
            fiatCurrency = sellCommonConfirmExtraParams3.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        jSONObject.put("pay_fiat_currency", C27041f.m66668h(fiatCurrency));
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams4 = sellConfirmFragment.f38841W;
        if (sellCommonConfirmExtraParams4 != null) {
            cryptoCurrency = sellCommonConfirmExtraParams4.getCryptoCurrency();
        }
        jSONObject.put("pay_crypto_currency", C27041f.m66668h(cryptoCurrency));
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a(strM66668h, "confirm", "1", jSONObject);
        if (((SellCommonConfirmVM) sellConfirmFragment.m45647o3()).getF38837g0()) {
            if (kcPrimaryButton.getF44406k()) {
                return Unit.INSTANCE;
            }
            kcPrimaryButton.m55043o();
            ((SellCommonConfirmVM) sellConfirmFragment.m45647o3()).m46962L(false);
        } else if (sellConfirmFragment.m46984f4()) {
            sellConfirmFragment.mo47006e4();
        } else {
            ToastCompat.m66437C(R$string.payment_please_agree_terms);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Y3 */
    public static final Unit m46980Y3(SellConfirmFragment sellConfirmFragment, Boolean bool) {
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = sellConfirmFragment.mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null) {
            Intrinsics.checkNotNull(bool);
            sellConfirmInfoViewMo46998P3.setRefreshing(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Z3 */
    public static final Unit m46981Z3(SellConfirmFragment sellConfirmFragment, SellPreviewOrder.Response response) {
        Intrinsics.checkNotNull(response);
        sellConfirmFragment.mo47005d4(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a4 */
    public static final Unit m46982a4(SellConfirmFragment sellConfirmFragment, String str) {
        Intrinsics.checkNotNull(str);
        sellConfirmFragment.m47004c4(str, Intrinsics.areEqual(str, "0"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b4 */
    public static final Unit m46983b4(SellConfirmFragment sellConfirmFragment, Exception exc) throws JSONException {
        Intrinsics.checkNotNull(exc);
        sellConfirmFragment.m47001S3(exc);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f4 */
    private final boolean m46984f4() {
        Boolean boolValueOf;
        if (mo47008t4() == null) {
            return true;
        }
        PaymentTermView paymentTermViewMo47008t4 = mo47008t4();
        if (paymentTermViewMo47008t4 != null) {
            boolValueOf = Boolean.valueOf(paymentTermViewMo47008t4.m49900b());
        } else {
            boolValueOf = null;
        }
        return C27025c.m66566d(boolValueOf);
    }

    /* JADX INFO: renamed from: g4 */
    private final void m46985g4() {
        String paymentMethodCode;
        PaymentTermView paymentTermViewMo47008t4 = mo47008t4();
        if (paymentTermViewMo47008t4 != null) {
            C27046k.m66685H(paymentTermViewMo47008t4);
        }
        PaymentTermView paymentTermViewMo47008t5 = mo47008t4();
        if (paymentTermViewMo47008t5 != null) {
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams = this.f38841W;
            String channelId = null;
            if (sellCommonConfirmExtraParams != null) {
                paymentMethodCode = sellCommonConfirmExtraParams.getPaymentMethodCode();
            } else {
                paymentMethodCode = null;
            }
            SellCommonConfirmExtraParams sellCommonConfirmExtraParams2 = this.f38841W;
            if (sellCommonConfirmExtraParams2 != null) {
                channelId = sellCommonConfirmExtraParams2.getChannelId();
            }
            paymentTermViewMo47008t5.m49903e("fastSell", paymentMethodCode, channelId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m4 */
    public static final void m46991m4(SellConfirmFragment sellConfirmFragment, DialogInterface dialogInterface, int i11) {
        ((SellCommonConfirmVM) sellConfirmFragment.m45647o3()).m46962L(false);
    }

    /* JADX INFO: renamed from: o4 */
    public static final void m46993o4(SellConfirmFragment sellConfirmFragment, DialogInterface dialogInterface, int i11) {
        sellConfirmFragment.preformBackPressed();
    }

    /* JADX INFO: renamed from: r4 */
    public static final Unit m46995r4(SellPreviewOrder.Response.TaxInfo taxInfo) {
        String strM66668h = C27041f.m66668h(taxInfo.getLinkUrl());
        if (strM66668h.length() > 0) {
            Router.f46192a.m56184f(strM66668h).m4048k();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s4 */
    public static final Unit m46996s4(DialogFragmentHelper dialogFragmentHelper) {
        dialogFragmentHelper.dismiss();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.payment.fast.common.BaseFastFragment, com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        SellCommonConfirmExtraParams sellCommonConfirmExtraParams;
        Bundle arguments = getArguments();
        if (arguments != null) {
            sellCommonConfirmExtraParams = (SellCommonConfirmExtraParams) RouteExKt.m56274t(arguments, "data");
        } else {
            sellCommonConfirmExtraParams = null;
        }
        this.f38841W = sellCommonConfirmExtraParams;
        return new SellConfirmVMFactory(C45070a.m99667d(), BaseApplication.INSTANCE.get(), this.f38841W);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.f38841W == null) {
            preformBackPressed();
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
        SellConfirmInfoView sellConfirmInfoViewMo46998P3 = mo46998P3();
        if (sellConfirmInfoViewMo46998P3 != null) {
            sellConfirmInfoViewMo46998P3.setOnFeeClickListener(new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmFragment.m46977U3(this.f38844b);
                }
            });
        }
        SellConfirmInfoView sellConfirmInfoViewMo46998P4 = mo46998P3();
        if (sellConfirmInfoViewMo46998P4 != null) {
            sellConfirmInfoViewMo46998P4.setOnTaxClickListener(new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmFragment.m46978V3(this.f38873b);
                }
            });
        }
        m46985g4();
        final KcPrimaryButton kcPrimaryButtonMo46999Q3 = mo46999Q3();
        if (kcPrimaryButtonMo46999Q3 != null) {
            C27046k.m66711z(kcPrimaryButtonMo46999Q3, 0L, new Function0() { // from class: com.kubi.payment.fasttrade.sell.confirm.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmFragment.m46979W3(this.f38874b, kcPrimaryButtonMo46999Q3);
                }
            }, 1, null);
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m46960J().observe(getViewLifecycleOwner(), new C20601a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellConfirmFragment.m46980Y3(this.f38876b, (Boolean) obj);
            }
        }));
        m45647o3().m46957G().observe(getViewLifecycleOwner(), new C20601a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.j
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellConfirmFragment.m46981Z3(this.f38877b, (SellPreviewOrder.Response) obj);
            }
        }));
        m45647o3().m46954D().observe(getViewLifecycleOwner(), new C20601a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.k
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellConfirmFragment.m46982a4(this.f38878b, (String) obj);
            }
        }));
        m45647o3().m46956F().observe(getViewLifecycleOwner(), new C20601a(new Function1() { // from class: com.kubi.payment.fasttrade.sell.confirm.l
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SellConfirmFragment.m46983b4(this.f38879b, (Exception) obj);
            }
        }));
    }
}
