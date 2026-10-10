package com.kubi.otc.fiat.recharge.advcash;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$color;
import com.kubi.otc.R$id;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatAdvCashInfo;
import com.kubi.otc.entity.FiatAdvCashParams;
import com.kubi.otc.entity.FiatAdvcashRechargeMode;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.fiat.recharge.FiatRechargeOrderDetailFragment;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
import et.InterfaceC37240b;
import ht.C38346y;
import io.chad.library.adapter.base.BaseViewHolder;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Map;
import lt.C42296a;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p270ft.C37676r;
import p402kf.C41014a;
import p778xy.C46338a;
import p778xy.C46340c;
import p778xy.C46341d;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45681e;

/* JADX INFO: compiled from: FiatRechargeAdvCashConfirmFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u001c\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u0011H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u001bH\u0002J\b\u0010/\u001a\u00020\u001bH\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u00061"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "rechargeData", "Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "getRechargeData", "()Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "rechargeData$delegate", "orderId", "", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashConfirmBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashConfirmBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showFeeDialog", "showOrderTipDialog", "rechargeAdvCash", "getRechargeForm", "fiatInfo", "Lcom/kubi/otc/entity/FiatAdvCashInfo;", "trackResult", "isSuccess", "", "errorMsg", "trackCheckAdvcashRecharge", "exception", "Lcom/kubi/network/retrofit/exception/ApiException;", "trackCheckAdvcashId", "trackCheckRechargeSuccess", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatRechargeAdvCashConfirmFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatRechargeAdvCashConfirmFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,269:1\n147#2,16:270\n216#3,2:286\n*S KotlinDebug\n*F\n+ 1 FiatRechargeAdvCashConfirmFragment.kt\ncom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment\n*L\n51#1:270,16\n211#1:286,2\n*E\n"})
public final class FiatRechargeAdvCashConfirmFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37308U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeAdvCashConfirmFragment.m44129w3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37309V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatRechargeAdvCashConfirmFragment.m44111H3(this.f37322b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public String f37310W = "";

    /* JADX INFO: renamed from: X */
    @NotNull
    public final InterfaceC24293a f37311X = C45681e.m100799e(this, new Function1<FiatRechargeAdvCashConfirmFragment, C37676r>() { // from class: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashConfirmFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37676r invoke(@NotNull FiatRechargeAdvCashConfirmFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37676r.m84940a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37676r, Unit>() { // from class: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashConfirmFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37676r it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37676r c37676r) {
            invoke(c37676r);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ KProperty<Object>[] f37307Z = {Reflection.property1(new PropertyReference1Impl(FiatRechargeAdvCashConfirmFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatRechargeAdvcashConfirmBinding;", 0))};

    /* JADX INFO: renamed from: Y */
    @NotNull
    public static final Companion f37306Y = new Companion(null);

    /* JADX INFO: compiled from: FiatRechargeAdvCashConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "recharge", "Lcom/kubi/otc/entity/FiatAdvcashRechargeMode;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @Nullable FiatAdvcashRechargeMode recharge) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, context.getString(R$string.legal_account_deposit_currency, C27041f.m66668h(recharge != null ? recharge.getFiatCurrency() : null)), FiatRechargeAdvCashConfirmFragment.class.getName(), new C27051h().m66721e("data", recharge).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.advcash.FiatRechargeAdvCashConfirmFragment$a */
    /* JADX INFO: compiled from: FiatRechargeAdvCashConfirmFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m90084d2 = {"com/kubi/otc/fiat/recharge/advcash/FiatRechargeAdvCashConfirmFragment$rechargeAdvCash$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "accept", "", "e", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19687a extends C24223c1 {
        public C19687a() {
            super(FiatRechargeAdvCashConfirmFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1, io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: b */
        public void accept(Throwable e11) throws JSONException {
            Intrinsics.checkNotNullParameter(e11, "e");
            super.accept(e11);
            if (e11 instanceof ApiException) {
                FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment = FiatRechargeAdvCashConfirmFragment.this;
                StringBuilder sb2 = new StringBuilder();
                ApiException apiException = (ApiException) e11;
                sb2.append(apiException.code);
                sb2.append('-');
                sb2.append(e11.getMessage());
                fiatRechargeAdvCashConfirmFragment.m44137Q3(false, sb2.toString());
                FiatRechargeAdvCashConfirmFragment.this.m44135O3(apiException);
            }
        }
    }

    /* JADX INFO: renamed from: I3 */
    private final void m44112I3() {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.fiat_fee_detail).m54148E4(R$layout.botc_view_fast_fee, new DialogFragmentHelper.InterfaceC22882b() { // from class: com.kubi.otc.fiat.recharge.advcash.j
            @Override // com.kubi.resources.dialog.DialogFragmentHelper.InterfaceC22882b
            /* JADX INFO: renamed from: b3 */
            public final void mo16191b3(BaseViewHolder baseViewHolder, DialogFragmentHelper dialogFragmentHelper) {
                FiatRechargeAdvCashConfirmFragment.m44113J3(this.f37330b, baseViewHolder, dialogFragmentHelper);
            }
        }).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "otcDialog");
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m44113J3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, BaseViewHolder helper, DialogFragmentHelper dialogFragmentHelper) {
        FiatFee fee;
        FiatFee fee2;
        FiatFee fee3;
        FiatFee fee4;
        FiatFee fee5;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(dialogFragmentHelper, "<unused var>");
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        String strM66669i = C27041f.m66669i(C41014a.m89946t(C38346y.m86490A((fiatAdvcashRechargeModeM44139z3 == null || (fee5 = fiatAdvcashRechargeModeM44139z3.getFee()) == null) ? null : fee5.getFeeAmount()), null, 0, false, true, false, false, false, null, 0, 503, null), "0.00");
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        boolean z11 = (((fiatAdvcashRechargeModeM44139z4 == null || (fee4 = fiatAdvcashRechargeModeM44139z4.getFee()) == null) ? null : fee4.getMinFee()) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z5 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        boolean z12 = (((fiatAdvcashRechargeModeM44139z5 == null || (fee3 = fiatAdvcashRechargeModeM44139z5.getFee()) == null) ? null : fee3.getMaxFee()) == null || Intrinsics.areEqual(strM66669i, "0.00")) ? false : true;
        int i11 = R$id.tv_fee_rate;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z6 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        BaseViewHolder text = helper.setText(i11, C27041f.m66669i(fiatAdvcashRechargeModeM44139z6 != null ? fiatAdvcashRechargeModeM44139z6.getFeeMsg() : null, "0.00%")).setText(R$id.tv_fee, strM66669i);
        int i12 = R$id.tv_fee_unit;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z7 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        BaseViewHolder text2 = text.setText(i12, C27041f.m66668h(fiatAdvcashRechargeModeM44139z7 != null ? fiatAdvcashRechargeModeM44139z7.getFiatCurrency() : null));
        int i13 = R$id.tv_min_fee;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(fiatRechargeAdvCashConfirmFragment.getString(R$string.fiat_low_fee));
        sb2.append(' ');
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z8 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        sb2.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A((fiatAdvcashRechargeModeM44139z8 == null || (fee2 = fiatAdvcashRechargeModeM44139z8.getFee()) == null) ? null : fee2.getMinFee())).toPlainString(), "0.00"));
        sb2.append(' ');
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z9 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        sb2.append(C27041f.m66668h(fiatAdvcashRechargeModeM44139z9 != null ? fiatAdvcashRechargeModeM44139z9.getFiatCurrency() : null));
        BaseViewHolder text3 = text2.setText(i13, sb2.toString());
        int i14 = R$id.tv_max_fee;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(fiatRechargeAdvCashConfirmFragment.getString(R$string.fiat_high_fee));
        sb3.append(' ');
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z10 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        sb3.append(C27041f.m66669i(C6447a.m11724a(C38346y.m86490A((fiatAdvcashRechargeModeM44139z10 == null || (fee = fiatAdvcashRechargeModeM44139z10.getFee()) == null) ? null : fee.getMaxFee())).toPlainString(), "0.00"));
        sb3.append(' ');
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z11 = fiatRechargeAdvCashConfirmFragment.m44139z3();
        sb3.append(C27041f.m66668h(fiatAdvcashRechargeModeM44139z11 != null ? fiatAdvcashRechargeModeM44139z11.getFiatCurrency() : null));
        text3.setText(i14, sb3.toString()).setGone(i13, z11).setGone(i14, z12).setGone(R$id.view_line, z11 || z12);
    }

    /* JADX INFO: renamed from: M3 */
    public static final void m44115M3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, DialogInterface dialogInterface, int i11) {
        FiatRechargeOrderDetailFragment.Companion.startFragment$default(FiatRechargeOrderDetailFragment.f37301X, fiatRechargeAdvCashConfirmFragment.f37310W, null, 2, null);
        fiatRechargeAdvCashConfirmFragment.preformBackPressed();
        FiatRechargeAdvCashInputFragment.f37313Z.setClear(true);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m44116R3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, boolean z11, String str, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = "";
        }
        fiatRechargeAdvCashConfirmFragment.m44137Q3(z11, str);
    }

    /* JADX INFO: renamed from: y3 */
    private final InterfaceC37240b m44130y3() {
        return (InterfaceC37240b) this.f37308U.getValue();
    }

    /* JADX INFO: renamed from: A3 */
    public final String m44131A3(FiatAdvCashInfo fiatAdvCashInfo) {
        StringBuilder sb2 = new StringBuilder();
        Map<String, String> channelInfo = fiatAdvCashInfo.getChannelInfo();
        if (channelInfo != null) {
            for (Map.Entry<String, String> entry : channelInfo.entrySet()) {
                sb2.append("<input type='hidden' name='" + entry.getKey() + "' value='" + entry.getValue() + "'>");
            }
        }
        return "<html><head><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'/><title>KuCoin</title></head><body onload=\"document.getElementById('advcash_form').submit();\"><form id='advcash_form' target='_self' method='post' action='" + C27041f.m66668h(fiatAdvCashInfo.getRedirectUrl()) + "'>" + ((Object) sb2) + "</form></body></html>";
    }

    /* JADX INFO: renamed from: K3 */
    public final void m44133K3() {
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.pay_advcash_deposit_alert_title).m54156M4(getString(R$string.pay_advcash_deposit_alert_msg)).m54162S4(R$string.pay_advcash_deposit_alert_redo, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.advcash.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FiatRechargeAdvCashConfirmFragment.m44114L3(this.f37323b, dialogInterface, i11);
            }
        }).m54159P4(R$string.pay_advcash_deposit_alert_view_detail, new DialogInterface.OnClickListener() { // from class: com.kubi.otc.fiat.recharge.advcash.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                FiatRechargeAdvCashConfirmFragment.m44115M3(this.f37324b, dialogInterface, i11);
            }
        }).m54172c5(getChildFragmentManager());
    }

    /* JADX INFO: renamed from: N3 */
    public final void m44134N3() {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(fiatAdvcashRechargeModeM44139z3 != null ? fiatAdvcashRechargeModeM44139z3.getChannelId() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
        rechargeTrackData.setFiatCurrency(fiatAdvcashRechargeModeM44139z4 != null ? fiatAdvcashRechargeModeM44139z4.getFiatCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_ADVCASH_ID", false, "-10004:CHECK_ADVCASH_ID", rechargeTrackData, 2, null);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m44135O3(ApiException apiException) {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        String str = apiException.code + ':' + apiException.getMessage();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(fiatAdvcashRechargeModeM44139z3 != null ? fiatAdvcashRechargeModeM44139z3.getChannelId() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
        rechargeTrackData.setFiatCurrency(fiatAdvcashRechargeModeM44139z4 != null ? fiatAdvcashRechargeModeM44139z4.getFiatCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_ADVCASH_RECHARGE", false, str, rechargeTrackData, 2, null);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m44136P3() {
        IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
        RechargeTrackData rechargeTrackData = new RechargeTrackData(fiatAdvcashRechargeModeM44139z3 != null ? fiatAdvcashRechargeModeM44139z3.getChannelId() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
        rechargeTrackData.setFiatCurrency(fiatAdvcashRechargeModeM44139z4 != null ? fiatAdvcashRechargeModeM44139z4.getFiatCurrency() : null);
        Unit unit = Unit.INSTANCE;
        IPaymentTrack.m49794e(track, "CHECK_RECHAGE_SUCCESS", true, null, rechargeTrackData, 4, null);
    }

    /* JADX INFO: renamed from: Q3 */
    public final void m44137Q3(boolean z11, String str) throws JSONException {
        C42296a c42296a = C42296a.f93790a;
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
        String strM66668h = C27041f.m66668h(fiatAdvcashRechargeModeM44139z3 != null ? fiatAdvcashRechargeModeM44139z3.getFiatCurrency() : null);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
        C42296a.m92834b(c42296a, z11, str, null, strM66668h, "pay_fiat_recharge", null, null, null, C27041f.m66668h(fiatAdvcashRechargeModeM44139z4 != null ? fiatAdvcashRechargeModeM44139z4.getChannelId() : null), null, null, 1764, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_recharge_advcash_confirm;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        ImageView imageView;
        BaseTextView baseTextView3;
        FiatFee fee;
        BaseTextView baseTextView4;
        String paymentName;
        BaseTextView baseTextView5;
        String amount;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        C37676r c37676rM44138x3 = m44138x3();
        if (c37676rM44138x3 != null && (baseTextView5 = c37676rM44138x3.f84481l) != null) {
            StringBuilder sb2 = new StringBuilder();
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
            sb2.append((fiatAdvcashRechargeModeM44139z3 == null || (amount = fiatAdvcashRechargeModeM44139z3.getAmount()) == null) ? null : C41014a.m89945s(amount, null, 0, false, true, false, false, false, null, TPCodecParamers.TP_PROFILE_MJPEG_JPEG_LS, null));
            sb2.append(' ');
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
            sb2.append(C27041f.m66668h(fiatAdvcashRechargeModeM44139z4 != null ? fiatAdvcashRechargeModeM44139z4.getFiatCurrency() : null));
            baseTextView5.setText(sb2.toString());
        }
        C37676r c37676rM44138x4 = m44138x3();
        if (c37676rM44138x4 != null && (baseTextView4 = c37676rM44138x4.f84477h) != null) {
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z5 = m44139z3();
            baseTextView4.setText((fiatAdvcashRechargeModeM44139z5 == null || (paymentName = fiatAdvcashRechargeModeM44139z5.getPaymentName()) == null) ? null : C27041f.m66668h(paymentName));
        }
        C37676r c37676rM44138x5 = m44138x3();
        if (c37676rM44138x5 != null && (baseTextView3 = c37676rM44138x5.f84475f) != null) {
            C27096v0 c27096v0 = new C27096v0();
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z6 = m44139z3();
            C27096v0 c27096v0M66905e = c27096v0.m66905e(C27041f.m66669i((fiatAdvcashRechargeModeM44139z6 == null || (fee = fiatAdvcashRechargeModeM44139z6.getFee()) == null) ? null : fee.getFeeAmount(), "--"), getColorRes(R$color.emphasis));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(' ');
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z7 = m44139z3();
            sb3.append(C27041f.m66668h(fiatAdvcashRechargeModeM44139z7 != null ? fiatAdvcashRechargeModeM44139z7.getFiatCurrency() : null));
            baseTextView3.setText(c27096v0M66905e.append(sb3.toString()));
        }
        C37676r c37676rM44138x6 = m44138x3();
        if (c37676rM44138x6 != null && (imageView = c37676rM44138x6.f84471b) != null) {
            C46341d c46341dM102151a = C46338a.m102151a(this.mContext);
            FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z8 = m44139z3();
            C46340c<Drawable> c46340cMo6634v = c46341dM102151a.mo6634v(C27041f.m66668h(fiatAdvcashRechargeModeM44139z8 != null ? fiatAdvcashRechargeModeM44139z8.getPaymentIcon() : null));
            int i11 = R$mipmap.kucoin_icon_default_icon;
            c46340cMo6634v.mo92188b0(i11).mo92208m(i11).m6594E0(imageView);
        }
        C37676r c37676rM44138x7 = m44138x3();
        if (c37676rM44138x7 != null && (baseTextView2 = c37676rM44138x7.f84476g) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatRechargeAdvCashConfirmFragment.m44106B3(this.f37325b);
                }
            }, 1, null);
        }
        C37676r c37676rM44138x8 = m44138x3();
        if (c37676rM44138x8 == null || (baseTextView = c37676rM44138x8.f84474e) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.advcash.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatRechargeAdvCashConfirmFragment.m44107C3(this.f37326b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: x3 */
    public final C37676r m44138x3() {
        return (C37676r) this.f37311X.getValue(this, f37307Z[0]);
    }

    /* JADX INFO: renamed from: z3 */
    public final FiatAdvcashRechargeMode m44139z3() {
        return (FiatAdvcashRechargeMode) this.f37309V.getValue();
    }

    /* JADX INFO: renamed from: B3 */
    public static final Unit m44106B3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment) {
        fiatRechargeAdvCashConfirmFragment.m44112I3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m44107C3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment) {
        fiatRechargeAdvCashConfirmFragment.m44132D3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E3 */
    public static final void m44108E3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: F3 */
    public static final void m44109F3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, FiatAdvCashInfo fiatAdvCashInfo) throws JSONException {
        fiatRechargeAdvCashConfirmFragment.hideDialogLoading();
        String strM66668h = C27041f.m66668h(fiatAdvCashInfo.getPaymentOrderId());
        fiatRechargeAdvCashConfirmFragment.f37310W = strM66668h;
        if (strM66668h.length() == 0) {
            fiatRechargeAdvCashConfirmFragment.m44134N3();
            ToastCompat.m66437C(R$string.system_error);
            return;
        }
        PaymentWebActivity.Companion companion = PaymentWebActivity.f37079t;
        Context context = fiatRechargeAdvCashConfirmFragment.getContext();
        Intrinsics.checkNotNull(fiatAdvCashInfo);
        PaymentWebActivity.Companion.openHtml$default(companion, context, fiatRechargeAdvCashConfirmFragment.m44131A3(fiatAdvCashInfo), null, fiatAdvCashInfo.getRedirectUrl(), null, false, 52, null);
        m44116R3(fiatRechargeAdvCashConfirmFragment, false, null, 3, null);
        fiatRechargeAdvCashConfirmFragment.m44136P3();
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m44110G3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, Disposable disposable) {
        fiatRechargeAdvCashConfirmFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final FiatAdvcashRechargeMode m44111H3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment) {
        Bundle arguments = fiatRechargeAdvCashConfirmFragment.getArguments();
        if (arguments != null) {
            return (FiatAdvcashRechargeMode) arguments.getParcelable("data");
        }
        return null;
    }

    /* JADX INFO: renamed from: L3 */
    public static final void m44114L3(FiatRechargeAdvCashConfirmFragment fiatRechargeAdvCashConfirmFragment, DialogInterface dialogInterface, int i11) {
        fiatRechargeAdvCashConfirmFragment.preformBackPressed();
        FiatRechargeAdvCashInputFragment.f37313Z.setClear(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public static final InterfaceC37240b m44129w3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: D3 */
    public final void m44132D3() {
        String channelId;
        String amount;
        InterfaceC37240b interfaceC37240bM44130y3 = m44130y3();
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z3 = m44139z3();
        String fiatCurrency = null;
        if (fiatAdvcashRechargeModeM44139z3 != null) {
            channelId = fiatAdvcashRechargeModeM44139z3.getChannelId();
        } else {
            channelId = null;
        }
        String strM66668h = C27041f.m66668h(channelId);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z4 = m44139z3();
        if (fiatAdvcashRechargeModeM44139z4 != null) {
            amount = fiatAdvcashRechargeModeM44139z4.getAmount();
        } else {
            amount = null;
        }
        String strM66668h2 = C27041f.m66668h(amount);
        FiatAdvcashRechargeMode fiatAdvcashRechargeModeM44139z5 = m44139z3();
        if (fiatAdvcashRechargeModeM44139z5 != null) {
            fiatCurrency = fiatAdvcashRechargeModeM44139z5.getFiatCurrency();
        }
        Observable<R> observableCompose = interfaceC37240bM44130y3.m83297j(new FiatAdvCashParams(strM66668h, strM66668h2, fiatCurrency, null, null, 24, null)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.advcash.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatRechargeAdvCashConfirmFragment.m44110G3(this.f37327b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.advcash.h
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatRechargeAdvCashConfirmFragment.m44108E3(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.advcash.i
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws JSONException {
                FiatRechargeAdvCashConfirmFragment.m44109F3(this.f37329b, (FiatAdvCashInfo) obj);
            }
        }, new C19687a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f37310W.length() > 0) {
            m44133K3();
        }
    }
}
