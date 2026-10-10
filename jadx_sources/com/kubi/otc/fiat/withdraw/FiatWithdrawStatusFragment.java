package com.kubi.otc.fiat.withdraw;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatWithdrawOrderInfo;
import com.kubi.otc.entity.WithdrawAmount;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.NavigationBar;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.C27051h;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import f00.C37304a;
import g00.InterfaceC37753e;
import g00.InterfaceC37754f;
import ht.C38346y;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37713z;
import p402kf.C41014a;
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

/* JADX INFO: compiled from: FiatWithdrawStatusFragment.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u00192\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "orderId", "", "getOrderId", "()Ljava/lang/String;", "orderId$delegate", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initData", "data", "Lcom/kubi/otc/entity/FiatWithdrawOrderInfo;", "getWithdrawOrderDetails", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatWithdrawStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatWithdrawStatusFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,223:1\n147#2,16:224\n*S KotlinDebug\n*F\n+ 1 FiatWithdrawStatusFragment.kt\ncom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment\n*L\n41#1:224,16\n*E\n"})
public final class FiatWithdrawStatusFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37463U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.t1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawStatusFragment.m44483C3();
        }
    });

    /* JADX INFO: renamed from: V */
    @NotNull
    public final Lazy f37464V = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.withdraw.u1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatWithdrawStatusFragment.m44502X3(this.f37629b);
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37465W = C45681e.m100799e(this, new Function1<FiatWithdrawStatusFragment, C37713z>() { // from class: com.kubi.otc.fiat.withdraw.FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37713z invoke(@NotNull FiatWithdrawStatusFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37713z.m85011a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37713z, Unit>() { // from class: com.kubi.otc.fiat.withdraw.FiatWithdrawStatusFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37713z it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37713z c37713z) {
            invoke(c37713z);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ KProperty<Object>[] f37462Y = {Reflection.property1(new PropertyReference1Impl(FiatWithdrawStatusFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatWithdrawStatusBinding;", 0))};

    /* JADX INFO: renamed from: X */
    @NotNull
    public static final Companion f37461X = new Companion(null);

    /* JADX INFO: compiled from: FiatWithdrawStatusFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, m90084d2 = {"Lcom/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$Companion;", "", "<init>", "()V", "startFragment", "", "context", "Landroid/content/Context;", "orderId", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void startFragment(@NotNull Context context, @Nullable String orderId) {
            Intrinsics.checkNotNullParameter(context, "context");
            BaseFragmentActivity.m56574n0(context, "", FiatWithdrawStatusFragment.class.getName(), new C27051h().m66724h("data", C27041f.m66668h(orderId)).m66717a());
        }
    }

    /* JADX INFO: renamed from: com.kubi.otc.fiat.withdraw.FiatWithdrawStatusFragment$a */
    /* JADX INFO: compiled from: FiatWithdrawStatusFragment.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/otc/fiat/withdraw/FiatWithdrawStatusFragment$getWithdrawOrderDetails$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "onNetError", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19795a extends C24223c1 {
        public C19795a() {
            super(FiatWithdrawStatusFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            super.mo32077c();
            FiatWithdrawStatusFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: E3 */
    private final InterfaceC37240b m44484E3() {
        return (InterfaceC37240b) this.f37463U.getValue();
    }

    /* JADX INFO: renamed from: L3 */
    public static final Unit m44490L3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: M3 */
    public static final Unit m44491M3() {
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: N3 */
    public static final Unit m44492N3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        FiatWithdrawOrderDetailFragment.f37456X.startFragment(fiatWithdrawStatusFragment.getOrderId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: P3 */
    public static final Unit m44494P3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: Q3 */
    public static final Unit m44495Q3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        FiatWithdrawOrderDetailFragment.f37456X.startFragment(fiatWithdrawStatusFragment.getOrderId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: R3 */
    public static final Unit m44496R3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: T3 */
    public static final Unit m44498T3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: V3 */
    public static final Unit m44500V3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: W3 */
    public static final Unit m44501W3() {
        InterfaceC37753e.a.m85128a(C37304a.f82764a, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    private final String getOrderId() {
        return (String) this.f37464V.getValue();
    }

    /* JADX INFO: renamed from: D3 */
    public final C37713z m44519D3() {
        return (C37713z) this.f37465W.getValue(this, f37462Y[0]);
    }

    /* JADX INFO: renamed from: K3 */
    public final void m44520K3(FiatWithdrawOrderInfo fiatWithdrawOrderInfo) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        ImageView imageView;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        ImageView imageView2;
        BaseTextView baseTextView13;
        WithdrawAmount withdrawAmount;
        WithdrawAmount withdrawAmount2;
        BaseTextView baseTextView14;
        BaseTextView baseTextView15;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        BaseTextView baseTextView18;
        BaseTextView baseTextView19;
        ImageView imageView3;
        BaseTextView baseTextView20;
        BaseTextView baseTextView21;
        BaseTextView baseTextView22;
        BaseTextView baseTextView23;
        BaseTextView baseTextView24;
        BaseTextView baseTextView25;
        BaseTextView baseTextView26;
        BaseTextView baseTextView27;
        BaseTextView baseTextView28;
        BaseTextView baseTextView29;
        ImageView imageView4;
        BaseTextView baseTextView30;
        BaseTextView baseTextView31;
        BaseTextView baseTextView32;
        ImageView imageView5;
        BaseTextView baseTextView33;
        BaseTextView baseTextView34;
        BaseTextView baseTextView35;
        BaseTextView baseTextView36;
        BaseTextView baseTextView37;
        BaseTextView baseTextView38;
        ImageView imageView6;
        ImageView imageView7;
        BaseTextView baseTextView39;
        BaseTextView baseTextView40;
        BaseTextView baseTextView41;
        ImageView imageView8;
        BaseTextView baseTextView42;
        BaseTextView baseTextView43;
        BaseTextView baseTextView44;
        BaseTextView baseTextView45;
        ImageView imageView9;
        ImageView imageView10;
        BaseTextView baseTextView46;
        BaseTextView baseTextView47;
        BaseTextView baseTextView48;
        String currency = null;
        String status = fiatWithdrawOrderInfo != null ? fiatWithdrawOrderInfo.getStatus() : null;
        if (status != null) {
            switch (status.hashCode()) {
                case 49:
                    if (status.equals("1")) {
                        C37713z c37713zM44519D3 = m44519D3();
                        if (c37713zM44519D3 != null && (baseTextView23 = c37713zM44519D3.f84954d) != null) {
                            C27046k.m66685H(baseTextView23);
                        }
                        C37713z c37713zM44519D4 = m44519D3();
                        if (c37713zM44519D4 != null && (baseTextView22 = c37713zM44519D4.f84955e) != null) {
                            C27046k.m66685H(baseTextView22);
                        }
                        C37713z c37713zM44519D5 = m44519D3();
                        if (c37713zM44519D5 != null && (baseTextView21 = c37713zM44519D5.f84956f) != null) {
                            C27046k.m66685H(baseTextView21);
                        }
                        C37713z c37713zM44519D6 = m44519D3();
                        if (c37713zM44519D6 != null && (baseTextView20 = c37713zM44519D6.f84956f) != null) {
                            StringBuilder sb2 = new StringBuilder();
                            WithdrawAmount withdrawAmount3 = fiatWithdrawOrderInfo.getWithdrawAmount();
                            sb2.append(C41014a.m89946t(C38346y.m86490A(withdrawAmount3 != null ? withdrawAmount3.getAmount() : null), null, 0, false, true, false, false, false, null, 0, 503, null));
                            sb2.append(' ');
                            WithdrawAmount withdrawAmount4 = fiatWithdrawOrderInfo.getWithdrawAmount();
                            sb2.append(C27041f.m66668h(withdrawAmount4 != null ? withdrawAmount4.getCurrency() : null));
                            baseTextView20.setText(sb2.toString());
                        }
                        C37713z c37713zM44519D7 = m44519D3();
                        if (c37713zM44519D7 != null && (imageView3 = c37713zM44519D7.f84953c) != null) {
                            imageView3.setImageResource(R$mipmap.botc_ic_fiat_withdraw_success);
                        }
                        C37713z c37713zM44519D8 = m44519D3();
                        if (c37713zM44519D8 != null && (baseTextView19 = c37713zM44519D8.f84954d) != null) {
                            baseTextView19.setText(getString(R$string.pay_fiat_withdraw_result_view_details));
                        }
                        C37713z c37713zM44519D9 = m44519D3();
                        if (c37713zM44519D9 != null && (baseTextView18 = c37713zM44519D9.f84955e) != null) {
                            baseTextView18.setText(getString(R$string.pay_fiat_withdraw_result_back_to_assets));
                        }
                        C37713z c37713zM44519D10 = m44519D3();
                        if (c37713zM44519D10 != null && (baseTextView17 = c37713zM44519D10.f84957g) != null) {
                            baseTextView17.setText(getString(R$string.pay_fiat_withdraw_result_success_title));
                        }
                        C37713z c37713zM44519D11 = m44519D3();
                        if (c37713zM44519D11 != null && (baseTextView16 = c37713zM44519D11.f84954d) != null) {
                            C27046k.m66711z(baseTextView16, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.v1
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FiatWithdrawStatusFragment.m44495Q3(this.f37635b);
                                }
                            }, 1, null);
                        }
                        C37713z c37713zM44519D12 = m44519D3();
                        if (c37713zM44519D12 == null || (baseTextView15 = c37713zM44519D12.f84955e) == null) {
                            return;
                        }
                        C27046k.m66711z(baseTextView15, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.y1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatWithdrawStatusFragment.m44496R3();
                            }
                        }, 1, null);
                        return;
                    }
                    break;
                case 50:
                    if (status.equals("2")) {
                        C37713z c37713zM44519D13 = m44519D3();
                        if (c37713zM44519D13 != null && (baseTextView32 = c37713zM44519D13.f84954d) != null) {
                            C27046k.m66685H(baseTextView32);
                        }
                        C37713z c37713zM44519D14 = m44519D3();
                        if (c37713zM44519D14 != null && (baseTextView31 = c37713zM44519D14.f84955e) != null) {
                            C27046k.m66685H(baseTextView31);
                        }
                        C37713z c37713zM44519D15 = m44519D3();
                        if (c37713zM44519D15 != null && (baseTextView30 = c37713zM44519D15.f84956f) != null) {
                            C27046k.m66700o(baseTextView30);
                        }
                        C37713z c37713zM44519D16 = m44519D3();
                        if (c37713zM44519D16 != null && (imageView4 = c37713zM44519D16.f84953c) != null) {
                            imageView4.setImageResource(R$mipmap.botc_ic_fiat_withdraw_fail);
                        }
                        C37713z c37713zM44519D17 = m44519D3();
                        if (c37713zM44519D17 != null && (baseTextView29 = c37713zM44519D17.f84954d) != null) {
                            baseTextView29.setText(getString(R$string.fast_result_buy_again));
                        }
                        C37713z c37713zM44519D18 = m44519D3();
                        if (c37713zM44519D18 != null && (baseTextView28 = c37713zM44519D18.f84955e) != null) {
                            baseTextView28.setText(getString(R$string.pay_fiat_withdraw_result_back_to_assets));
                        }
                        String strM66668h = C27041f.m66668h(fiatWithdrawOrderInfo.getStatusMessage());
                        C37713z c37713zM44519D19 = m44519D3();
                        if (c37713zM44519D19 != null && (baseTextView27 = c37713zM44519D19.f84957g) != null) {
                            baseTextView27.setText(getString(R$string.pay_fiat_withdraw_result_failed_title));
                        }
                        C37713z c37713zM44519D20 = m44519D3();
                        if (c37713zM44519D20 != null && (baseTextView26 = c37713zM44519D20.f84958h) != null) {
                            if (strM66668h.length() <= 0) {
                                strM66668h = getString(R$string.pay_fiat_withdraw_result_failed_subtitle);
                                Intrinsics.checkNotNull(strM66668h);
                            }
                            baseTextView26.setText(strM66668h);
                        }
                        C37713z c37713zM44519D21 = m44519D3();
                        if (c37713zM44519D21 != null && (baseTextView25 = c37713zM44519D21.f84954d) != null) {
                            C27046k.m66711z(baseTextView25, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.i1
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FiatWithdrawStatusFragment.m44497S3(this.f37596b);
                                }
                            }, 1, null);
                        }
                        C37713z c37713zM44519D22 = m44519D3();
                        if (c37713zM44519D22 == null || (baseTextView24 = c37713zM44519D22.f84955e) == null) {
                            return;
                        }
                        C27046k.m66711z(baseTextView24, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.j1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatWithdrawStatusFragment.m44498T3();
                            }
                        }, 1, null);
                        return;
                    }
                    break;
                case 52:
                    if (status.equals("4")) {
                        C37713z c37713zM44519D23 = m44519D3();
                        if (c37713zM44519D23 != null && (baseTextView41 = c37713zM44519D23.f84954d) != null) {
                            C27046k.m66685H(baseTextView41);
                        }
                        C37713z c37713zM44519D24 = m44519D3();
                        if (c37713zM44519D24 != null && (baseTextView40 = c37713zM44519D24.f84955e) != null) {
                            C27046k.m66685H(baseTextView40);
                        }
                        C37713z c37713zM44519D25 = m44519D3();
                        if (c37713zM44519D25 != null && (baseTextView39 = c37713zM44519D25.f84956f) != null) {
                            C27046k.m66700o(baseTextView39);
                        }
                        C37713z c37713zM44519D26 = m44519D3();
                        if (c37713zM44519D26 != null && (imageView7 = c37713zM44519D26.f84952b) != null) {
                            C27046k.m66685H(imageView7);
                        }
                        C37713z c37713zM44519D27 = m44519D3();
                        if (c37713zM44519D27 != null && (imageView6 = c37713zM44519D27.f84953c) != null) {
                            imageView6.setImageResource(R$mipmap.botc_ic_fiat_withdraw_fail);
                        }
                        C37713z c37713zM44519D28 = m44519D3();
                        if (c37713zM44519D28 != null && (baseTextView38 = c37713zM44519D28.f84954d) != null) {
                            baseTextView38.setText(getString(R$string.fast_result_buy_again));
                        }
                        C37713z c37713zM44519D29 = m44519D3();
                        if (c37713zM44519D29 != null && (baseTextView37 = c37713zM44519D29.f84955e) != null) {
                            baseTextView37.setText(getString(R$string.pay_fiat_withdraw_result_back_to_assets));
                        }
                        String strM66668h2 = C27041f.m66668h(fiatWithdrawOrderInfo.getStatusMessage());
                        C37713z c37713zM44519D30 = m44519D3();
                        if (c37713zM44519D30 != null && (baseTextView36 = c37713zM44519D30.f84957g) != null) {
                            baseTextView36.setText(getString(R$string.pay_capitual_withdraw_result_rejected_title));
                        }
                        C37713z c37713zM44519D31 = m44519D3();
                        if (c37713zM44519D31 != null && (baseTextView35 = c37713zM44519D31.f84958h) != null) {
                            if (strM66668h2.length() <= 0) {
                                strM66668h2 = getString(R$string.pay_capitual_withdraw_result_rejected_subtitle);
                                Intrinsics.checkNotNull(strM66668h2);
                            }
                            baseTextView35.setText(strM66668h2);
                        }
                        C37713z c37713zM44519D32 = m44519D3();
                        if (c37713zM44519D32 != null && (baseTextView34 = c37713zM44519D32.f84954d) != null) {
                            C27046k.m66711z(baseTextView34, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.k1
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FiatWithdrawStatusFragment.m44499U3(this.f37602b);
                                }
                            }, 1, null);
                        }
                        C37713z c37713zM44519D33 = m44519D3();
                        if (c37713zM44519D33 != null && (baseTextView33 = c37713zM44519D33.f84955e) != null) {
                            C27046k.m66711z(baseTextView33, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.l1
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FiatWithdrawStatusFragment.m44500V3();
                                }
                            }, 1, null);
                        }
                        C37713z c37713zM44519D34 = m44519D3();
                        if (c37713zM44519D34 == null || (imageView5 = c37713zM44519D34.f84952b) == null) {
                            return;
                        }
                        C27046k.m66711z(imageView5, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.m1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatWithdrawStatusFragment.m44501W3();
                            }
                        }, 1, null);
                        return;
                    }
                    break;
                case 53:
                    if (status.equals("5")) {
                        C37713z c37713zM44519D35 = m44519D3();
                        if (c37713zM44519D35 != null && (baseTextView48 = c37713zM44519D35.f84954d) != null) {
                            C27046k.m66685H(baseTextView48);
                        }
                        C37713z c37713zM44519D36 = m44519D3();
                        if (c37713zM44519D36 != null && (baseTextView47 = c37713zM44519D36.f84955e) != null) {
                            C27046k.m66700o(baseTextView47);
                        }
                        C37713z c37713zM44519D37 = m44519D3();
                        if (c37713zM44519D37 != null && (baseTextView46 = c37713zM44519D37.f84956f) != null) {
                            C27046k.m66700o(baseTextView46);
                        }
                        C37713z c37713zM44519D38 = m44519D3();
                        if (c37713zM44519D38 != null && (imageView10 = c37713zM44519D38.f84952b) != null) {
                            C27046k.m66685H(imageView10);
                        }
                        C37713z c37713zM44519D39 = m44519D3();
                        if (c37713zM44519D39 != null && (imageView9 = c37713zM44519D39.f84953c) != null) {
                            imageView9.setImageResource(R$mipmap.botc_ic_fiat_withdraw_process);
                        }
                        C37713z c37713zM44519D40 = m44519D3();
                        if (c37713zM44519D40 != null && (baseTextView45 = c37713zM44519D40.f84954d) != null) {
                            baseTextView45.setText(getString(R$string.pay_fiat_withdraw_result_back_to_assets));
                        }
                        C37713z c37713zM44519D41 = m44519D3();
                        if (c37713zM44519D41 != null && (baseTextView44 = c37713zM44519D41.f84957g) != null) {
                            baseTextView44.setText(getString(R$string.pay_fiat_capitual_detail_processing));
                        }
                        C37713z c37713zM44519D42 = m44519D3();
                        if (c37713zM44519D42 != null && (baseTextView43 = c37713zM44519D42.f84958h) != null) {
                            baseTextView43.setText(C27041f.m66668h(fiatWithdrawOrderInfo.getStatusMessage()));
                        }
                        C37713z c37713zM44519D43 = m44519D3();
                        if (c37713zM44519D43 != null && (baseTextView42 = c37713zM44519D43.f84954d) != null) {
                            C27046k.m66711z(baseTextView42, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.n1
                                @Override // p852kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return FiatWithdrawStatusFragment.m44490L3();
                                }
                            }, 1, null);
                        }
                        C37713z c37713zM44519D44 = m44519D3();
                        if (c37713zM44519D44 == null || (imageView8 = c37713zM44519D44.f84952b) == null) {
                            return;
                        }
                        C27046k.m66711z(imageView8, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.o1
                            @Override // p852kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FiatWithdrawStatusFragment.m44491M3();
                            }
                        }, 1, null);
                        return;
                    }
                    break;
            }
        }
        if (C27025c.m66566d(fiatWithdrawOrderInfo != null ? fiatWithdrawOrderInfo.isShowProSuccess() : null)) {
            C37713z c37713zM44519D45 = m44519D3();
            if (c37713zM44519D45 != null && (baseTextView14 = c37713zM44519D45.f84956f) != null) {
                C27046k.m66685H(baseTextView14);
            }
            C37713z c37713zM44519D46 = m44519D3();
            if (c37713zM44519D46 != null && (baseTextView13 = c37713zM44519D46.f84956f) != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(C41014a.m89946t(C38346y.m86490A((fiatWithdrawOrderInfo == null || (withdrawAmount2 = fiatWithdrawOrderInfo.getWithdrawAmount()) == null) ? null : withdrawAmount2.getAmount()), null, 0, false, true, false, false, false, null, 0, 503, null));
                sb3.append(' ');
                if (fiatWithdrawOrderInfo != null && (withdrawAmount = fiatWithdrawOrderInfo.getWithdrawAmount()) != null) {
                    currency = withdrawAmount.getCurrency();
                }
                sb3.append(C27041f.m66668h(currency));
                baseTextView13.setText(sb3.toString());
            }
            C37713z c37713zM44519D47 = m44519D3();
            if (c37713zM44519D47 != null && (imageView2 = c37713zM44519D47.f84953c) != null) {
                imageView2.setImageResource(R$mipmap.botc_ic_fiat_withdraw_success);
            }
            C37713z c37713zM44519D48 = m44519D3();
            if (c37713zM44519D48 != null && (baseTextView12 = c37713zM44519D48.f84954d) != null) {
                baseTextView12.setText(getString(R$string.pay_fiat_withdraw_result_view_details));
            }
            C37713z c37713zM44519D49 = m44519D3();
            if (c37713zM44519D49 != null && (baseTextView11 = c37713zM44519D49.f84957g) != null) {
                baseTextView11.setText(getString(R$string.pay_capitual_withdraw_result_processing_title));
            }
            C37713z c37713zM44519D50 = m44519D3();
            if (c37713zM44519D50 != null && (baseTextView10 = c37713zM44519D50.f84958h) != null) {
                baseTextView10.setText(getString(R$string.pay_capitual_withdraw_result_processing_subtitle));
            }
            C37713z c37713zM44519D51 = m44519D3();
            if (c37713zM44519D51 != null && (baseTextView9 = c37713zM44519D51.f84954d) != null) {
                C27046k.m66711z(baseTextView9, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.p1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatWithdrawStatusFragment.m44492N3(this.f37613b);
                    }
                }, 1, null);
            }
        } else {
            C37713z c37713zM44519D52 = m44519D3();
            if (c37713zM44519D52 != null && (baseTextView4 = c37713zM44519D52.f84956f) != null) {
                C27046k.m66700o(baseTextView4);
            }
            C37713z c37713zM44519D53 = m44519D3();
            if (c37713zM44519D53 != null && (imageView = c37713zM44519D53.f84953c) != null) {
                imageView.setImageResource(R$mipmap.botc_ic_fiat_withdraw_process);
            }
            C37713z c37713zM44519D54 = m44519D3();
            if (c37713zM44519D54 != null && (baseTextView3 = c37713zM44519D54.f84957g) != null) {
                baseTextView3.setText(C27041f.m66668h(fiatWithdrawOrderInfo != null ? fiatWithdrawOrderInfo.getStatusMessage() : null));
            }
            C37713z c37713zM44519D55 = m44519D3();
            if (c37713zM44519D55 != null && (baseTextView2 = c37713zM44519D55.f84954d) != null) {
                baseTextView2.setText(getString(R$string.fast_result_refresh));
            }
            C37713z c37713zM44519D56 = m44519D3();
            if (c37713zM44519D56 != null && (baseTextView = c37713zM44519D56.f84954d) != null) {
                C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.w1
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatWithdrawStatusFragment.m44493O3(this.f37640b);
                    }
                }, 1, null);
            }
        }
        C37713z c37713zM44519D57 = m44519D3();
        if (c37713zM44519D57 != null && (baseTextView8 = c37713zM44519D57.f84954d) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37713z c37713zM44519D58 = m44519D3();
        if (c37713zM44519D58 != null && (baseTextView7 = c37713zM44519D58.f84955e) != null) {
            C27046k.m66685H(baseTextView7);
        }
        C37713z c37713zM44519D59 = m44519D3();
        if (c37713zM44519D59 != null && (baseTextView6 = c37713zM44519D59.f84955e) != null) {
            baseTextView6.setText(getString(R$string.pay_fiat_withdraw_result_back_to_assets));
        }
        C37713z c37713zM44519D60 = m44519D3();
        if (c37713zM44519D60 == null || (baseTextView5 = c37713zM44519D60.f84955e) == null) {
            return;
        }
        C27046k.m66711z(baseTextView5, 0L, new Function0() { // from class: com.kubi.otc.fiat.withdraw.x1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatWithdrawStatusFragment.m44494P3();
            }
        }, 1, null);
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_withdraw_status;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        NavigationBar navigationBar = getNavigationBar();
        if (navigationBar != null) {
            navigationBar.m54692c();
        }
        m44485F3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final InterfaceC37240b m44483C3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: F3 */
    private final void m44485F3() {
        Observable<R> observableCompose = m44484E3().m83291d(getOrderId()).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.h1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawStatusFragment.m44486G3(this.f37592b, (Disposable) obj);
            }
        };
        Observable observableDoOnSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.q1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawStatusFragment.m44487H3(function1, obj);
            }
        });
        final Function1 function2 = new Function1() { // from class: com.kubi.otc.fiat.withdraw.r1
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatWithdrawStatusFragment.m44488I3(this.f37621b, (FiatWithdrawOrderInfo) obj);
            }
        };
        Disposable disposableSubscribe = observableDoOnSubscribe.subscribe(new Consumer() { // from class: com.kubi.otc.fiat.withdraw.s1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatWithdrawStatusFragment.m44489J3(function2, obj);
            }
        }, new C19795a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m44486G3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment, Disposable disposable) {
        fiatWithdrawStatusFragment.showDialogLoading();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final void m44487H3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: I3 */
    public static final Unit m44488I3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment, FiatWithdrawOrderInfo fiatWithdrawOrderInfo) {
        fiatWithdrawStatusFragment.hideDialogLoading();
        if (fiatWithdrawOrderInfo.isShowProcess()) {
            fiatWithdrawOrderInfo.setShowProSuccess(Boolean.TRUE);
        }
        fiatWithdrawStatusFragment.m44520K3(fiatWithdrawOrderInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: J3 */
    public static final void m44489J3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: O3 */
    public static final Unit m44493O3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        fiatWithdrawStatusFragment.m44485F3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: S3 */
    public static final Unit m44497S3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        fiatWithdrawStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: U3 */
    public static final Unit m44499U3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        fiatWithdrawStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: X3 */
    public static final String m44502X3(FiatWithdrawStatusFragment fiatWithdrawStatusFragment) {
        String string;
        Bundle arguments = fiatWithdrawStatusFragment.getArguments();
        if (arguments != null) {
            string = arguments.getString("data");
        } else {
            string = null;
        }
        return C27041f.m66668h(string);
    }
}
