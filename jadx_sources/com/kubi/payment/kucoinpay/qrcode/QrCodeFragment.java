package com.kubi.payment.kucoinpay.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$layout;
import com.kubi.payment.base.BasePaymentFragment;
import com.kubi.payment.kucoinpay.KuCoinPayServiceLocator;
import com.kubi.payment.kucoinpay.KuCoinPayVMFactory;
import com.kubi.payment.kucoinpay.data.entities.QrCode;
import com.kubi.payment.kucoinpay.data.source.IKuCoinPayRepository;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.util.C24271s1;
import com.kubi.utils.extensions.C27041f;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.reflect.KClass;
import ro.C44128b;

/* JADX INFO: compiled from: QrCodeFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrcode/QrCodeFragment;", "Lcom/kubi/payment/base/BasePaymentFragment;", "Lcom/kubi/payment/kucoinpay/qrcode/QrCodeVM;", "Lcom/kubi/payment/kucoinpay/data/source/IKuCoinPayRepository;", "<init>", "()V", "content", "", "preSpmId", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "observeData", "onBackPressed", "", "initViews", "viewModelClass", "Lkotlin/reflect/KClass;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", TtmlNode.TAG_LAYOUT, "", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class QrCodeFragment extends BasePaymentFragment<QrCodeVM, IKuCoinPayRepository> {

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f39589Y = new Companion(null);

    /* JADX INFO: renamed from: W */
    @Nullable
    public String f39590W;

    /* JADX INFO: renamed from: X */
    @Nullable
    public String f39591X;

    /* JADX INFO: compiled from: QrCodeFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/kucoinpay/qrcode/QrCodeFragment$Companion;", "", "<init>", "()V", "KEY_CONTENT", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.kucoinpay.qrcode.QrCodeFragment$a */
    /* JADX INFO: compiled from: QrCodeFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C21037a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f39592b;

        public C21037a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f39592b = function;
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
            return this.f39592b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f39592b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        return new KuCoinPayVMFactory(KuCoinPayServiceLocator.f39583a.m48308c());
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        String str = this.f39590W;
        if (str == null || str.length() == 0) {
            return;
        }
        QrCodeVM qrCodeVMM45647o3 = m45647o3();
        String strM66668h = C27041f.m66668h(this.f39590W);
        Bundle arguments = getArguments();
        qrCodeVMM45647o3.m48324y(strM66668h, arguments != null ? RouteExKt.m56284y(arguments, "source") : null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: q3 */
    public int mo45649q3() {
        return R$layout.payment_fragment_kucoin_pay_qr_code;
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: z3 */
    public KClass<QrCodeVM> mo45654z3() {
        return Reflection.getOrCreateKotlinClass(QrCodeVM.class);
    }

    public QrCodeFragment() {
        setPageId("B7kucoinpay_loding_page");
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m48318C3(QrCodeFragment qrCodeFragment, QrCode.Response response) throws JSONException {
        String appPayUrl;
        String rnJumpUrl = response.getRnJumpUrl();
        if ((rnJumpUrl != null && rnJumpUrl.length() != 0) || ((appPayUrl = response.getAppPayUrl()) != null && appPayUrl.length() != 0)) {
            if (rnJumpUrl != null && rnJumpUrl.length() != 0) {
                C24271s1.m58531c(Router.f46192a.m56184f(rnJumpUrl), C27041f.m66668h(qrCodeFragment.f39591X)).m4048k();
            } else {
                String strM48322w = qrCodeFragment.m45647o3().m48322w(response.getAppPayUrl(), C27041f.m66668h(qrCodeFragment.f39591X));
                if (strM48322w != null) {
                    PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, qrCodeFragment.m45646n3(), strM48322w, null, null, false, false, 60, null);
                }
            }
            String strM66668h = C27041f.m66668h(qrCodeFragment.getF23018V());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pre_spm_id", qrCodeFragment.f39591X);
            jSONObject.put("norm_version", "1");
            Unit unit = Unit.INSTANCE;
            C43852m.m96593e(strM66668h, "loading", "1", jSONObject);
            FragmentActivity activity = qrCodeFragment.getActivity();
            if (activity != null) {
                Intent intent = new Intent();
                intent.putExtra("data", true);
                activity.setResult(-1, intent);
            }
        } else {
            FragmentActivity activity2 = qrCodeFragment.getActivity();
            if (activity2 != null) {
                activity2.setResult(0);
            }
        }
        FragmentActivity activity3 = qrCodeFragment.getActivity();
        if (activity3 != null) {
            activity3.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.BaseFragment, com.kubi.sdk.IBackCallback
    public boolean onBackPressed() {
        C43852m.m96591c(C27041f.m66668h(getF23018V()), "close", "1", null, 8, null);
        return super.onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        String strM56284y;
        String str;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        String strM56284y2 = null;
        if (arguments != null) {
            strM56284y = RouteExKt.m56284y(arguments, "content");
        } else {
            strM56284y = null;
        }
        this.f39590W = strM56284y;
        if (strM56284y != null && strM56284y.length() != 0) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                strM56284y2 = RouteExKt.m56284y(arguments2, "spm");
            }
            if (strM56284y2 != null && strM56284y2.length() != 0) {
                str = "kcApp.B1homepage.scan.1";
            } else {
                str = "KucoinPay.H5KuCoinPayUser.scanButton.1";
            }
            this.f39591X = str;
            C44128b.m97266j("KuCoinPay", "QrCode preSpmId:" + this.f39591X);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m48323x().observe(getViewLifecycleOwner(), new C21037a(new Function1() { // from class: com.kubi.payment.kucoinpay.qrcode.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QrCodeFragment.m48318C3(this.f39595b, (QrCode.Response) obj);
            }
        }));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: p3 */
    public void mo45648p3() {
    }
}
