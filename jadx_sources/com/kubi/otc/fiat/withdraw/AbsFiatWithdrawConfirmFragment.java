package com.kubi.otc.fiat.withdraw;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.entity.FiatWithdrawConfrimBundle;
import com.kubi.otc.entity.FiatWithdrawPaymentParams;
import com.kubi.otc.entity.FiatWithdrawPaymentResult;
import com.kubi.otc.exception.OtcException;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.WithdrawTrackData;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.router.model.IRedirect;
import com.kubi.router.utils.RouteExKt;
import com.kubi.safe.api.service.ISafeService;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import et.InterfaceC37240b;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.HashMap;
import java.util.Map;
import lt.C42296a;
import mr.C42597a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function7;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AbsFiatWithdrawConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001cH\u0014J\u001a\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\u001dH\u0007J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u001dH\u0016J\u001c\u0010$\u001a\u00020\u00132\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u001dH\u0002J\b\u0010'\u001a\u00020\u0013H\u0002J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020*H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "bundleData", "Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "getBundleData", "()Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "bundleData$delegate", "isShowLoading", "", "showFeeDialog", "", "createWithdrawPayment", "createWithdrawPaymentV2", "setName", "nameTv", "Landroid/widget/TextView;", "subNameTv", "onResume", "extraParams", "", "", "", ChannelKycRequest.SCENE_WITHDRAW, "url", "validationToken", "startWithdrawStatusView", "orderId", "trackResult", "isSuccess", "errorMsg", "trackCheckOrderSuccess", "trackCheckOrderFailure", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbsFiatWithdrawConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsFiatWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,249:1\n19#2,2:250\n44#3,2:252\n*S KotlinDebug\n*F\n+ 1 AbsFiatWithdrawConfirmFragment.kt\ncom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment\n*L\n122#1:250,2\n145#1:252,2\n*E\n"})
public abstract class AbsFiatWithdrawConfirmFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f37424X = new Companion(null);

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37425U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsFiatWithdrawConfirmFragment.m44296B3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37426V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbsFiatWithdrawConfirmFragment.m44314u3(this.f37491b);
        }
    });

    /* JADX INFO: renamed from: W */
    public boolean f37427W;

    /* JADX INFO: compiled from: AbsFiatWithdrawConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "data", "Lcom/kubi/otc/entity/FiatWithdrawConfrimBundle;", "fragmentName", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @NotNull FiatWithdrawConfrimBundle data, @NotNull String fragmentName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.fiat_withdraw_title, C27041f.m66668h(data.getCurrency())), fragmentName, new C27051h().m66721e("data", data).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.AbsFiatWithdrawConfirmFragment$a */
    /* JADX INFO: compiled from: AbsFiatWithdrawConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/AbsFiatWithdrawConfirmFragment$withdraw$2", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "e", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19787a extends C24223c1 {
        public C19787a() {
            super(AbsFiatWithdrawConfirmFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable th2) throws JSONException {
            super.accept(th2);
            if (th2 instanceof ApiException) {
                AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment = AbsFiatWithdrawConfirmFragment.this;
                StringBuilder sb2 = new StringBuilder();
                ApiException apiException = (ApiException) th2;
                sb2.append(apiException.code);
                sb2.append('-');
                sb2.append(apiException.getMessage());
                absFiatWithdrawConfirmFragment.m44299K3(false, sb2.toString());
                AbsFiatWithdrawConfirmFragment.this.m44323I3(apiException);
            }
        }
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m44302O3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment, FiatWithdrawPaymentResult fiatWithdrawPaymentResult) throws JSONException {
        absFiatWithdrawConfirmFragment.f37427W = false;
        absFiatWithdrawConfirmFragment.hideDialogLoading();
        absFiatWithdrawConfirmFragment.m44322H3(C27041f.m66668h(fiatWithdrawPaymentResult.getPayoutTrxnId()));
        m44300L3(absFiatWithdrawConfirmFragment, false, null, 3, null);
        absFiatWithdrawConfirmFragment.m44324J3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x3 */
    public static final void m44316x3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment) {
        m44301N3(absFiatWithdrawConfirmFragment, "payment_mobile_gateway/v3/payment/api/create_payout_transaction", null, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: A3 */
    public Map<String, Object> m44318A3() {
        return null;
    }

    /* JADX INFO: renamed from: D3 */
    private final InterfaceC37240b m44297D3() {
        return (InterfaceC37240b) this.f37425U.getValue();
    }

    /* JADX INFO: renamed from: G3 */
    public static final void m44298G3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        FiatFee fiatFee;
        FiatFee fiatFee2;
        PaymentMethod paymentMethod;
        FiatFee fiatFee3;
        FiatFee fiatFee4;
        FiatFee fiatFee5;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = absFiatWithdrawConfirmFragment.m44319C3();
        String strM66669i = C27041f.m66669i(C41014a.m89946t(C38346y.m86490A((fiatWithdrawConfrimBundleM44319C3 == null || (fiatFee5 = fiatWithdrawConfrimBundleM44319C3.getFiatFee()) == null) ? null : fiatFee5.getFeeAmount()), null, 0, false, true, false, false, false, null, 0, 503, null), "0.00");
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = absFiatWithdrawConfirmFragment.m44319C3();
        boolean z11 = (((fiatWithdrawConfrimBundleM44319C4 == null || (fiatFee4 = fiatWithdrawConfrimBundleM44319C4.getFiatFee()) == null) ? null : fiatFee4.getMinFee()) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C5 = absFiatWithdrawConfirmFragment.m44319C3();
        boolean z12 = (((fiatWithdrawConfrimBundleM44319C5 == null || (fiatFee3 = fiatWithdrawConfrimBundleM44319C5.getFiatFee()) == null) ? null : fiatFee3.getMaxFee()) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        int i11 = R$id.tv_fee_rate;
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C6 = absFiatWithdrawConfirmFragment.m44319C3();
        BaseViewHolder text = helper.setText(i11, C27041f.m66669i((fiatWithdrawConfrimBundleM44319C6 == null || (paymentMethod = fiatWithdrawConfrimBundleM44319C6.getPaymentMethod()) == null) ? null : paymentMethod.getFeeMessage(), "0.00%")).setText(R$id.tv_fee, strM66669i);
        int i12 = R$id.tv_fee_unit;
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C7 = absFiatWithdrawConfirmFragment.m44319C3();
        BaseViewHolder text2 = text.setText(i12, fiatWithdrawConfrimBundleM44319C7 != null ? fiatWithdrawConfrimBundleM44319C7.getCurrency() : null);
        int i13 = R$id.tv_min_fee;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(absFiatWithdrawConfirmFragment.getString(R$string.fiat_low_fee));
        sb2.append(' ');
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C8 = absFiatWithdrawConfirmFragment.m44319C3();
        sb2.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A((fiatWithdrawConfrimBundleM44319C8 == null || (fiatFee2 = fiatWithdrawConfrimBundleM44319C8.getFiatFee()) == null) ? null : fiatFee2.getMinFee())).toPlainString(), "0.00"));
        sb2.append(' ');
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C9 = absFiatWithdrawConfirmFragment.m44319C3();
        sb2.append(fiatWithdrawConfrimBundleM44319C9 != null ? fiatWithdrawConfrimBundleM44319C9.getCurrency() : null);
        BaseViewHolder text3 = text2.setText(i13, sb2.toString());
        int i14 = R$id.tv_max_fee;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(absFiatWithdrawConfirmFragment.getString(R$string.fiat_high_fee));
        sb3.append(' ');
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C10 = absFiatWithdrawConfirmFragment.m44319C3();
        sb3.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A((fiatWithdrawConfrimBundleM44319C10 == null || (fiatFee = fiatWithdrawConfrimBundleM44319C10.getFiatFee()) == null) ? null : fiatFee.getMaxFee())).toPlainString(), "0.00"));
        sb3.append(' ');
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C11 = absFiatWithdrawConfirmFragment.m44319C3();
        sb3.append(fiatWithdrawConfrimBundleM44319C11 != null ? fiatWithdrawConfrimBundleM44319C11.getCurrency() : null);
        text3.setText(i14, sb3.toString()).setGone(i13, z11).setGone(i14, z12).setGone(R$id.view_line, z11 || z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public final void m44299K3(boolean z11, String str) throws JSONException {
        PaymentMethod paymentMethod;
        C42296a c42296a = C42296a.f93790a;
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        String channelId = null;
        String strM66668h = C27041f.m66668h(fiatWithdrawConfrimBundleM44319C3 != null ? fiatWithdrawConfrimBundleM44319C3.getCurrency() : null);
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        if (fiatWithdrawConfrimBundleM44319C4 != null && (paymentMethod = fiatWithdrawConfrimBundleM44319C4.getPaymentMethod()) != null) {
            channelId = paymentMethod.getChannelId();
        }
        C42296a.m92834b(c42296a, z11, str, null, strM66668h, "pay_fiat_withdraw", null, null, null, C27041f.m66668h(channelId), null, null, 1764, null);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m44300L3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackResult");
        }
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        absFiatWithdrawConfirmFragment.m44299K3(z11, str);
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m44301N3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withdraw");
        }
        if ((i11 & 2) != 0) {
            str2 = "";
        }
        absFiatWithdrawConfirmFragment.m44325M3(str, str2);
    }

    /* JADX INFO: renamed from: w3 */
    public static final Unit m44315w3(final AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment) {
        C42917g.m94139e().execute(new Runnable() { // from class: com.kubi.otc.fiat.withdraw.f
            @Override // java.lang.Runnable
            public final void run() {
                AbsFiatWithdrawConfirmFragment.m44316x3(this.f37583b);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m44317z3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment, int i11, String str, String str2, Boolean bool, Boolean bool2, String str3, Map map) {
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        if (i11 == 0 && str2 != null && str2.length() != 0) {
            absFiatWithdrawConfirmFragment.m44325M3("payment_mobile_gateway/v4/payment/api/create_payout_transaction", str2);
        } else if (i11 == 78858) {
            absFiatWithdrawConfirmFragment.m44326v3();
        } else {
            Exception exc = new Exception("safe validation fallback: " + str3 + ", serverErrorCode" + map);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("payment_abs_withdraw_");
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = absFiatWithdrawConfirmFragment.m44319C3();
            sb2.append((fiatWithdrawConfrimBundleM44319C3 == null || (paymentMethod2 = fiatWithdrawConfrimBundleM44319C3.getPaymentMethod()) == null) ? null : paymentMethod2.getChannelId());
            sb2.append('_');
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = absFiatWithdrawConfirmFragment.m44319C3();
            sb2.append((fiatWithdrawConfrimBundleM44319C4 == null || (paymentMethod = fiatWithdrawConfrimBundleM44319C4.getPaymentMethod()) == null) ? null : paymentMethod.getPaymentMethodCode());
            C43846g.m96568c(new OtcException(exc, sb2.toString(), false, null, 8, null), null, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: C3 */
    public final FiatWithdrawConfrimBundle m44319C3() {
        return (FiatWithdrawConfrimBundle) this.f37426V.getValue();
    }

    /* JADX INFO: renamed from: F3 */
    public final void m44321F3() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fiat_fee_detail).m54148E4(R$layout.botc_view_fast_fee, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.otc.fiat.withdraw.c
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                AbsFiatWithdrawConfirmFragment.m44298G3(this.f37501b, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "otcDialog");
    }

    /* JADX INFO: renamed from: H3 */
    public void m44322H3(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        FiatWithdrawStatusFragment.Companion companion = FiatWithdrawStatusFragment.f37461X;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        companion.startFragment(mContext, orderId);
    }

    /* JADX INFO: renamed from: I3 */
    public final void m44323I3(ApiException apiException) {
        PaymentMethod paymentMethod;
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData((fiatWithdrawConfrimBundleM44319C3 == null || (paymentMethod = fiatWithdrawConfrimBundleM44319C3.getPaymentMethod()) == null) ? null : paymentMethod.getChannelId());
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        withdrawTrackData.setFiatCurrency(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49795f(track, "CHECK_ORDER", false, str, withdrawTrackData, 2, null);
    }

    /* JADX INFO: renamed from: J3 */
    public final void m44324J3() {
        PaymentMethod paymentMethod;
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        WithdrawTrackData withdrawTrackData = new WithdrawTrackData((fiatWithdrawConfrimBundleM44319C3 == null || (paymentMethod = fiatWithdrawConfrimBundleM44319C3.getPaymentMethod()) == null) ? null : paymentMethod.getChannelId());
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        withdrawTrackData.setFiatCurrency(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49795f(track, "CHECK_ORDER", true, null, withdrawTrackData, 4, null);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: M3 */
    public final void m44325M3(@NotNull String url, @NotNull String validationToken) {
        FiatWithdrawAccountInfo account;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        PaymentMethod paymentMethod3;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(validationToken, "validationToken");
        this.f37427W = true;
        InterfaceC37240b interfaceC37240bM44297D3 = m44297D3();
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        String payoutAccountId = null;
        String strM66668h = C27041f.m66668h(fiatWithdrawConfrimBundleM44319C3 != null ? fiatWithdrawConfrimBundleM44319C3.getAmount() : null);
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        String strM66668h2 = C27041f.m66668h((fiatWithdrawConfrimBundleM44319C4 == null || (paymentMethod3 = fiatWithdrawConfrimBundleM44319C4.getPaymentMethod()) == null) ? null : paymentMethod3.getChannelId());
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C5 = m44319C3();
        String strM66668h3 = C27041f.m66668h((fiatWithdrawConfrimBundleM44319C5 == null || (paymentMethod2 = fiatWithdrawConfrimBundleM44319C5.getPaymentMethod()) == null) ? null : paymentMethod2.getPaymentMethodCode());
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C6 = m44319C3();
        String strM66668h4 = C27041f.m66668h(fiatWithdrawConfrimBundleM44319C6 != null ? fiatWithdrawConfrimBundleM44319C6.getCurrency() : null);
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C7 = m44319C3();
        String strM66668h5 = C27041f.m66668h((fiatWithdrawConfrimBundleM44319C7 == null || (paymentMethod = fiatWithdrawConfrimBundleM44319C7.getPaymentMethod()) == null) ? null : paymentMethod.getTitle());
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C8 = m44319C3();
        if (fiatWithdrawConfrimBundleM44319C8 != null && (account = fiatWithdrawConfrimBundleM44319C8.getAccount()) != null) {
            payoutAccountId = account.getPayoutAccountId();
        }
        Observable<R> observableCompose = interfaceC37240bM44297D3.m83294g(url, new FiatWithdrawPaymentParams(strM66668h, strM66668h2, strM66668h3, strM66668h4, strM66668h5, payoutAccountId, null, m44318A3(), 64, null), validationToken).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbsFiatWithdrawConfirmFragment.m44302O3(this.f37586b, (FiatWithdrawPaymentResult) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbsFiatWithdrawConfirmFragment.m44303P3(function1, obj);
            }
        }, new C19787a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: v3 */
    public final void m44326v3() {
        OtcDepend otcDepend = OtcDepend.f38138a;
        HashMap map = new HashMap();
        map.put("validation", "FIAT_WITHDRAW");
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        map.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(fiatWithdrawConfrimBundleM44319C3 != null ? fiatWithdrawConfrimBundleM44319C3.getCurrency() : null));
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        map.put("amount", C27041f.m66668h(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getAmount() : null));
        otcDepend.m45456e(map, IRedirect.INSTANCE.obtain(new Function0() { // from class: com.kubi.otc.fiat.withdraw.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbsFiatWithdrawConfirmFragment.m44315w3(this.f37577b);
            }
        }));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m44327y3() {
        ISafeService iSafeService = ISafeService.f46324a.get();
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        JSONObject jSONObject = new JSONObject();
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        jSONObject.put(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(fiatWithdrawConfrimBundleM44319C3 != null ? fiatWithdrawConfrimBundleM44319C3.getCurrency() : null));
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
        jSONObject.put("amount", C27041f.m66668h(fiatWithdrawConfrimBundleM44319C4 != null ? fiatWithdrawConfrimBundleM44319C4.getAmount() : null));
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        ISafeService.m56306a(iSafeService, mContext, viewLifecycleOwner, "RV_FIAT_WITHDRAW", string, 0, true, new Function7() { // from class: com.kubi.otc.fiat.withdraw.e
            @Override // p852kotlin.jvm.functions.Function7
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                return AbsFiatWithdrawConfirmFragment.m44317z3(this.f37580b, ((Integer) obj).intValue(), (String) obj2, (String) obj3, (Boolean) obj4, (Boolean) obj5, (String) obj6, (Map) obj7);
            }
        }, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final InterfaceC37240b m44296B3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: P3 */
    public static final void m44303P3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: u3 */
    public static final FiatWithdrawConfrimBundle m44314u3(AbsFiatWithdrawConfirmFragment absFiatWithdrawConfirmFragment) {
        Bundle arguments = absFiatWithdrawConfirmFragment.getArguments();
        if (arguments != null) {
            return (FiatWithdrawConfrimBundle) RouteExKt.m56274t(arguments, "data");
        }
        return null;
    }

    /* JADX INFO: renamed from: E3 */
    public final void m44320E3(@Nullable TextView textView, @Nullable TextView textView2) {
        String paymentMethodCode;
        FiatWithdrawAccountInfo account;
        String name;
        FiatWithdrawAccountInfo account2;
        PaymentMethod paymentMethod;
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C3 = m44319C3();
        String subName = null;
        if (fiatWithdrawConfrimBundleM44319C3 != null && (paymentMethod = fiatWithdrawConfrimBundleM44319C3.getPaymentMethod()) != null) {
            paymentMethodCode = paymentMethod.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        if (textView != null) {
            FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C4 = m44319C3();
            if (fiatWithdrawConfrimBundleM44319C4 != null && (account2 = fiatWithdrawConfrimBundleM44319C4.getAccount()) != null) {
                Context mContext = this.mContext;
                Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
                name = account2.getName(mContext, paymentMethodCode);
            } else {
                name = null;
            }
            textView.setText(name);
        }
        FiatWithdrawConfrimBundle fiatWithdrawConfrimBundleM44319C5 = m44319C3();
        if (fiatWithdrawConfrimBundleM44319C5 != null && (account = fiatWithdrawConfrimBundleM44319C5.getAccount()) != null) {
            Context mContext2 = this.mContext;
            Intrinsics.checkNotNullExpressionValue(mContext2, "mContext");
            subName = account.getSubName(mContext2, paymentMethodCode);
        }
        if (subName != null && subName.length() != 0) {
            if (textView2 != null) {
                C27046k.m66685H(textView2);
            }
            if (textView2 != null) {
                textView2.setText(subName);
                return;
            }
            return;
        }
        if (textView2 != null) {
            C27046k.m66700o(textView2);
        }
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f37427W) {
            showDialogLoading();
        }
    }
}
