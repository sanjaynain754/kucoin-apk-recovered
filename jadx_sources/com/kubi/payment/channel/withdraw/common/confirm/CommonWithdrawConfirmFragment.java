package com.kubi.payment.channel.withdraw.common.confirm;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.kubi.otc.R$string;
import com.kubi.payment.base.BasePaymentFragment;
import com.kubi.payment.channel.data.entities.PreviewWithdrawOrder;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.channel.withdraw.common.confirm.CommonWithDrawConfirmVM;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.utils.extensions.C27041f;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p513ot.C43328a;
import p513ot.C43329b;
import p569qq.C43852m;
import p852kotlin.Function;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.FunctionAdapter;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonWithdrawConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 #*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH&J\u001c\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u001cH\u0004J\b\u0010!\u001a\u00020\u000eH\u0004J\b\u0010\"\u001a\u00020\u000eH\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006$"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithdrawConfirmFragment;", "VM", "Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithDrawConfirmVM;", "Lcom/kubi/payment/base/BasePaymentFragment;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "<init>", "()V", "extraParams", "Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;", "getExtraParams", "()Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;", "setExtraParams", "(Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "observeData", "onPreviewOrderReady", "previewOrder", "Lcom/kubi/payment/channel/data/entities/PreviewWithdrawOrder$Response;", "launchResultPage", "orderId", "", "showFeeDialog", "fee", "Lcom/kubi/payment/data/entities/Fee$Response;", "feeCurrency", "showEstimatedDialog", "retry", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class CommonWithdrawConfirmFragment<VM extends CommonWithDrawConfirmVM> extends BasePaymentFragment<VM, IChannelRepository> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f38384X = new Companion(null);

    /* JADX INFO: renamed from: W */
    @Nullable
    public WithdrawConfirmExtraParams f38385W;

    /* JADX INFO: compiled from: CommonWithdrawConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/common/confirm/CommonWithdrawConfirmFragment$Companion;", "", "<init>", "()V", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/channel/withdraw/common/confirm/WithdrawConfirmExtraParams;", "fragmentClass", "Ljava/lang/Class;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable WithdrawConfirmExtraParams extraParams, @NotNull Class<?> fragmentClass) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
            BaseActivity.Companion companion = BaseActivity.INSTANCE;
            Bundle bundle = new Bundle();
            bundle.putString("title", context.getString(R$string.fiat_withdraw_title, extraParams != null ? extraParams.getFiatCurrency() : null));
            bundle.putParcelable("data", extraParams);
            Unit unit = Unit.INSTANCE;
            companion.launch(context, fragmentClass, bundle);
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.channel.withdraw.common.confirm.CommonWithdrawConfirmFragment$a */
    /* JADX INFO: compiled from: CommonWithdrawConfirmFragment.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C20392a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1 f38386b;

        public C20392a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f38386b = function;
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
            return this.f38386b;
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38386b.invoke(obj);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: E3 */
    public abstract void mo46029E3(@NotNull String str);

    /* JADX INFO: renamed from: H3 */
    public abstract void mo46030H3(@NotNull PreviewWithdrawOrder.Response response);

    @Override // com.kubi.payment.base.BasePaymentFragment
    @NotNull
    /* JADX INFO: renamed from: A3 */
    public ViewModelProvider.Factory mo45645A3() {
        return new C43329b(C43328a.f95644a.m95366d());
    }

    @Nullable
    /* JADX INFO: renamed from: D3, reason: from getter */
    public final WithdrawConfirmExtraParams getF38385W() {
        return this.f38385W;
    }

    /* JADX INFO: renamed from: I3 */
    public final void m46031I3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.payment_cj_estimated_amount_title).m54153J4(R$string.payment_cj_estimated_amount_tip).m54162S4(R$string.payment_cj_estimated_amount_understand, null).m54172c5(getChildFragmentManager());
    }

    @Override // com.kubi.payment.base.BasePaymentFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m45647o3().m46019H(this.f38385W);
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m46026F3(CommonWithdrawConfirmFragment commonWithdrawConfirmFragment, PreviewWithdrawOrder.Response response) {
        Intrinsics.checkNotNull(response);
        commonWithdrawConfirmFragment.mo46030H3(response);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m46027G3(CommonWithdrawConfirmFragment commonWithdrawConfirmFragment, String str) {
        Intrinsics.checkNotNull(str);
        commonWithdrawConfirmFragment.mo46029E3(str);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) throws JSONException {
        String paymentMethodCode;
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f38385W = (WithdrawConfirmExtraParams) RouteExKt.m56274t(arguments, "data");
        }
        JSONObject jSONObject = new JSONObject();
        WithdrawConfirmExtraParams withdrawConfirmExtraParams = this.f38385W;
        String channelId = null;
        if (withdrawConfirmExtraParams != null) {
            paymentMethodCode = withdrawConfirmExtraParams.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        jSONObject.put("paymentMethodCode", C27041f.m66668h(paymentMethodCode));
        WithdrawConfirmExtraParams withdrawConfirmExtraParams2 = this.f38385W;
        if (withdrawConfirmExtraParams2 != null) {
            channelId = withdrawConfirmExtraParams2.getChannelId();
        }
        jSONObject.put("channelId", C27041f.m66668h(channelId));
        Unit unit = Unit.INSTANCE;
        C43852m.m96595g("B7WithdrawConfirm", "confirm", null, jSONObject, 4, null);
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: r3 */
    public void mo45650r3() {
        super.mo45650r3();
        m45647o3().m46017F().observe(getViewLifecycleOwner(), new C20392a(new Function1() { // from class: com.kubi.payment.channel.withdraw.common.confirm.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommonWithdrawConfirmFragment.m46026F3(this.f38391b, (PreviewWithdrawOrder.Response) obj);
            }
        }));
        m45647o3().m46016E().observe(getViewLifecycleOwner(), new C20392a(new Function1() { // from class: com.kubi.payment.channel.withdraw.common.confirm.e
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CommonWithdrawConfirmFragment.m46027G3(this.f38392b, (String) obj);
            }
        }));
    }

    @Override // com.kubi.payment.base.BasePaymentFragment
    /* JADX INFO: renamed from: w3 */
    public void mo45651w3() {
        super.mo45651w3();
        m45647o3().m46019H(this.f38385W);
    }
}
