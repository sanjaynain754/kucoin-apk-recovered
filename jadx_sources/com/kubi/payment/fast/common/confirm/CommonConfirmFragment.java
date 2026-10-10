package com.kubi.payment.fast.common.confirm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.google.firebase.messaging.Constants;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19331c;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.common.BaseFastFragment;
import com.kubi.payment.fast.common.confirm.CommonConfirmVM;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.payment.helper.H5Helper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Deprecated;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import tt.C45070a;

/* JADX INFO: compiled from: CommonConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Deprecated(message = "废弃")
@Metadata(m90083d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 0*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u00010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H&J\u0014\u0010#\u001a\u00020\u00152\n\u0010$\u001a\u00060%j\u0002`&H\u0007J\u0010\u0010'\u001a\u00020\u00152\u0006\u0010$\u001a\u00020(H&J\b\u0010)\u001a\u00020\u0015H\u0014J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020\u0015H\u0002R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u00061"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment;", "VM", "Lcom/kubi/payment/fast/common/confirm/CommonConfirmVM;", "Lcom/kubi/payment/fast/common/BaseFastFragment;", "<init>", "()V", "needForceRefreshPrice", "", "getNeedForceRefreshPrice", "()Z", "setNeedForceRefreshPrice", "(Z)V", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "getExtraParams", "()Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "setExtraParams", "(Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "onPreviewOrderResponseReady", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "observeData", "onCountDownTimeUpdated", "countDownTime", "", "isFinished", "handleOrderError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Ljava/lang/Exception;", "Lkotlin/Exception;", "trackOrderError", "Lcom/kubi/network/retrofit/exception/ApiException;", "trackRiskError", "showRetryAlertTip", "message", "showRefreshPriceDialog", "showDobErrorDialog", "errorMessage", "showAddressErrorDialog", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CommonConfirmFragment<VM extends CommonConfirmVM> extends BaseFastFragment<VM> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f38535X = new Companion(null);

    /* JADX INFO: renamed from: W */
    @Nullable
    public ConfirmExtraParams f38536W;

    /* JADX INFO: compiled from: CommonConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/payment/fast/common/confirm/CommonConfirmFragment$Companion;", "", "<init>", "()V", "ORDER_TRADE_RISK_CODE", "", "ORDER_TRADE_RETRY", "ORDER_TRADE_REFRESH_PRICE", "DOB_INFORMATION_MISSED", "ADDRESS_MISSED", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.fast.common.confirm.CommonConfirmFragment$a */
    /* JADX INFO: compiled from: CommonConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20474a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38537b;

        public C20474a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38537b = function;
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
            return this.f38537b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38537b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: N3 */
    public abstract void mo46284N3(@NotNull String str, boolean z11);

    /* JADX INFO: renamed from: O3 */
    public abstract void mo46285O3(@NotNull PreviewOrder.Response response);

    /* JADX INFO: renamed from: X3 */
    public abstract void mo46312X3(@NotNull ApiException apiException);

    /* JADX INFO: renamed from: Q3 */
    public static final void m46302Q3(CommonConfirmFragment commonConfirmFragment, DialogInterface dialogInterface, int i11) {
        H5Helper h5Helper = H5Helper.f39544a;
        ConfirmExtraParams confirmExtraParams = commonConfirmFragment.f38536W;
        h5Helper.m48246b(C27041f.m66668h(confirmExtraParams != null ? confirmExtraParams.getCardId() : null));
    }

    /* JADX INFO: renamed from: S3 */
    public static final void m46303S3(DialogInterface dialogInterface, int i11) {
        InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83357j(), null, null, null, null, null, null, 126, null);
    }

    @Nullable
    /* JADX INFO: renamed from: I3, reason: from getter */
    public final ConfirmExtraParams getF38536W() {
        return this.f38536W;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    @VisibleForTesting
    /* JADX INFO: renamed from: J3 */
    public final void m46307J3(@NotNull Exception error) throws JSONException {
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
                    m46311V3(C27041f.m66668h(error.getMessage()));
                    break;
                case "3004":
                    String string = getString(R$string.payment_rfq_price_exception_desc);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    m46311V3(string);
                    mo46313Y3();
                    break;
                case "800103":
                    m46310T3(C27041f.m66668h(error.getMessage()));
                    break;
                case "800107":
                    m46309R3(C27041f.m66668h(error.getMessage()));
                    break;
                case "800110":
                    m46308P3();
                    break;
                default:
                    C19331c.m42836c(error, null, 2, null);
                    break;
            }
        } else {
            C19331c.m42836c(error, null, 2, null);
        }
        mo46312X3(apiException);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m46308P3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_personal_info).m54153J4(R$string.payment_update_address_desc).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fast.common.confirm.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CommonConfirmFragment.m46302Q3(this.f38558b, dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: R3 */
    public final void m46309R3(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_update_kyc_title).m54156M4(str).m54162S4(R$string.payment_update_kyc_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fast.common.confirm.e
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CommonConfirmFragment.m46303S3(dialogInterface, i11);
            }
        }).m54159P4(R$string.payment_update_kyc_cancel, null).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m46310T3(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_fast_trade_confirm_refresh_price, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fast.common.confirm.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CommonConfirmFragment.m46304U3(this.f38556b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: V3 */
    public final void m46311V3(String str) {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_rfq_price_exception_title).m54156M4(str).m54162S4(R$string.pay_advcash_withdraw_result_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fast.common.confirm.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                CommonConfirmFragment.m46305W3(this.f38557b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m45647o3().m46331K(true);
    }

    /* JADX INFO: renamed from: K3 */
    public static final Unit m46299K3(CommonConfirmFragment commonConfirmFragment, PreviewOrder.Response response) {
        Intrinsics.checkNotNull(response);
        commonConfirmFragment.mo46285O3(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m46300L3(CommonConfirmFragment commonConfirmFragment, String str) {
        Intrinsics.checkNotNull(str);
        commonConfirmFragment.mo46284N3(str, Intrinsics.areEqual(str, "0"));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m46301M3(CommonConfirmFragment commonConfirmFragment, Exception exc) throws JSONException {
        Intrinsics.checkNotNull(exc);
        commonConfirmFragment.m46307J3(exc);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public static final void m46304U3(CommonConfirmFragment commonConfirmFragment, DialogInterface dialogInterface, int i11) {
        ((CommonConfirmVM) commonConfirmFragment.m45647o3()).m46331K(false);
    }

    /* JADX INFO: renamed from: W3 */
    public static final void m46305W3(CommonConfirmFragment commonConfirmFragment, DialogInterface dialogInterface, int i11) {
        commonConfirmFragment.preformBackPressed();
    }

    @Override // com.kubi.payment.fast.common.BaseFastFragment, com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        ConfirmExtraParams confirmExtraParams;
        Bundle arguments = getArguments();
        if (arguments != null) {
            confirmExtraParams = (ConfirmExtraParams) RouteExKt.m56274t(arguments, "data");
        } else {
            confirmExtraParams = null;
        }
        this.f38536W = confirmExtraParams;
        return new ConfirmViewModelFactory(C45070a.m99667d(), BaseApplication.INSTANCE.get(), this.f38536W);
    }

    /* JADX INFO: renamed from: Y3 */
    public void mo46313Y3() throws JSONException {
        String paymentMethodCode;
        String fiatCurrency;
        String strM66668h = C27041f.m66668h(getF16323V());
        JSONObject jSONObject = new JSONObject();
        ConfirmExtraParams confirmExtraParams = this.f38536W;
        String cryptoCurrency = null;
        if (confirmExtraParams != null) {
            paymentMethodCode = confirmExtraParams.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("PaymentMethod", paymentMethodCode);
        ConfirmExtraParams confirmExtraParams2 = this.f38536W;
        if (confirmExtraParams2 != null) {
            fiatCurrency = confirmExtraParams2.getFiatCurrency();
        } else {
            fiatCurrency = null;
        }
        jSONObject.put("fiat", fiatCurrency);
        ConfirmExtraParams confirmExtraParams3 = this.f38536W;
        if (confirmExtraParams3 != null) {
            cryptoCurrency = confirmExtraParams3.getCryptoCurrency();
        }
        jSONObject.put("crypto", cryptoCurrency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g(strM66668h, "dialog", null, jSONObject, 4, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.f38536W == null) {
            preformBackPressed();
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m46327G().observe(getViewLifecycleOwner(), new C20474a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommonConfirmFragment.m46299K3(this.f38550b, (PreviewOrder.Response) obj);
            }
        }));
        m45647o3().m46324D().observe(getViewLifecycleOwner(), new C20474a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommonConfirmFragment.m46300L3(this.f38554b, (String) obj);
            }
        }));
        m45647o3().m46326F().observe(getViewLifecycleOwner(), new C20474a(new Function1() { // from class: com.kubi.payment.fast.common.confirm.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommonConfirmFragment.m46301M3(this.f38555b, (Exception) obj);
            }
        }));
    }
}
