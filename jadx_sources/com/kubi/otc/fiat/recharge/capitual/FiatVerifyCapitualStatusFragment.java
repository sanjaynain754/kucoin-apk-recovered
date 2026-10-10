package com.kubi.otc.fiat.recharge.capitual;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$mipmap;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.otc.entity.FiatCapitualChannelMode;
import com.kubi.otc.entity.FiatVerifyCapitualStatus;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.OldBaseFragment;
import com.kubi.sdk.util.C24217a1;
import com.kubi.sdk.util.C24223c1;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import et.InterfaceC37240b;
import f00.C37304a;
import g00.InterfaceC37754f;
import g00.InterfaceC37758j;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37666p;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;
import w00.C45681e;

/* JADX INFO: compiled from: FiatVerifyCapitualStatusFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/otc/fiat/recharge/capitual/FiatVerifyCapitualStatusFragment;", "Lcom/kubi/sdk/base/ui/OldBaseFragment;", "<init>", "()V", "fiatApi", "Lcom/kubi/otc/api/FiatApi;", "kotlin.jvm.PlatformType", "getFiatApi", "()Lcom/kubi/otc/api/FiatApi;", "fiatApi$delegate", "Lkotlin/Lazy;", "verifyData", "Lcom/kubi/otc/entity/FiatCapitualChannelMode;", "binding", "Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualStatusBinding;", "getBinding", "()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualStatusBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "getLayout", "", "onViewCreated", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "initData", "status", "Lcom/kubi/otc/entity/FiatVerifyCapitualStatus;", "getVerifyDetails", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFiatVerifyCapitualStatusFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FiatVerifyCapitualStatusFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatVerifyCapitualStatusFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,158:1\n147#2,16:159\n*S KotlinDebug\n*F\n+ 1 FiatVerifyCapitualStatusFragment.kt\ncom/kubi/otc/fiat/recharge/capitual/FiatVerifyCapitualStatusFragment\n*L\n41#1:159,16\n*E\n"})
public final class FiatVerifyCapitualStatusFragment extends OldBaseFragment {

    /* JADX INFO: renamed from: X */
    public static final /* synthetic */ KProperty<Object>[] f37358X = {Reflection.property1(new PropertyReference1Impl(FiatVerifyCapitualStatusFragment.class, "binding", "getBinding()Lcom/kubi/otc/databinding/BotcFragmentFiatCapitualStatusBinding;", 0))};

    /* JADX INFO: renamed from: V */
    @Nullable
    public FiatCapitualChannelMode f37360V;

    /* JADX INFO: renamed from: U */
    @NotNull
    public final Lazy f37359U = LazyKt.lazy(new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.j0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FiatVerifyCapitualStatusFragment.m44289u3();
        }
    });

    /* JADX INFO: renamed from: W */
    @NotNull
    public final InterfaceC24293a f37361W = C45681e.m100799e(this, new Function1<FiatVerifyCapitualStatusFragment, C37666p>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatVerifyCapitualStatusFragment$special$$inlined$viewBindingFragment$2
        @Override // p852kotlin.jvm.functions.Function1
        @NotNull
        public final C37666p invoke(@NotNull FiatVerifyCapitualStatusFragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            return C37666p.m84917a(this.this$0.getContentView());
        }

        {
            super(1);
        }
    }, new Function1<C37666p, Unit>() { // from class: com.kubi.otc.fiat.recharge.capitual.FiatVerifyCapitualStatusFragment$special$$inlined$viewBindingFragment$1
        public final void invoke(@NotNull C37666p it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // p852kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37666p c37666p) {
            invoke(c37666p);
            return Unit.INSTANCE;
        }
    });

    /* JADX INFO: renamed from: com.kubi.otc.fiat.recharge.capitual.FiatVerifyCapitualStatusFragment$a */
    /* JADX INFO: compiled from: FiatVerifyCapitualStatusFragment.kt */
    /* JADX INFO: loaded from: classes33.dex */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/otc/fiat/recharge/capitual/FiatVerifyCapitualStatusFragment$getVerifyDetails$3", "Lcom/kubi/sdk/util/SimpleThrowableConsumer;", "onNetError", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19723a extends C24223c1 {
        public C19723a() {
            super(FiatVerifyCapitualStatusFragment.this);
        }

        @Override // com.kubi.sdk.util.C24223c1
        /* JADX INFO: renamed from: c */
        public void mo32077c() {
            super.mo32077c();
            FiatVerifyCapitualStatusFragment.this.showNetWorkError();
        }
    }

    /* JADX INFO: renamed from: z3 */
    public static final Unit m44292z3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment, Disposable disposable) {
        BaseFragment.showLoadingView$default(fiatVerifyCapitualStatusFragment, 0, 0, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B3 */
    public final void m44293B3(FiatVerifyCapitualStatus fiatVerifyCapitualStatus) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        ImageView imageView;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        BaseTextView baseTextView14;
        ImageView imageView2;
        BaseTextView baseTextView15;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        BaseTextView baseTextView18;
        BaseTextView baseTextView19;
        BaseTextView baseTextView20;
        BaseTextView baseTextView21;
        BaseTextView baseTextView22;
        BaseTextView baseTextView23;
        ImageView imageView3;
        BaseTextView baseTextView24;
        BaseTextView baseTextView25;
        String verifyStatus = fiatVerifyCapitualStatus != null ? fiatVerifyCapitualStatus.getVerifyStatus() : null;
        if (Intrinsics.areEqual(verifyStatus, "verifiedSuccess")) {
            C37666p c37666pM44294v3 = m44294v3();
            if (c37666pM44294v3 != null && (baseTextView25 = c37666pM44294v3.f84379c) != null) {
                C27046k.m66685H(baseTextView25);
            }
            C37666p c37666pM44294v4 = m44294v3();
            if (c37666pM44294v4 != null && (baseTextView24 = c37666pM44294v4.f84380d) != null) {
                C27046k.m66700o(baseTextView24);
            }
            C37666p c37666pM44294v5 = m44294v3();
            if (c37666pM44294v5 != null && (imageView3 = c37666pM44294v5.f84378b) != null) {
                imageView3.setImageResource(R$mipmap.botc_ic_fiat_withdraw_success);
            }
            C37666p c37666pM44294v6 = m44294v3();
            if (c37666pM44294v6 != null && (baseTextView23 = c37666pM44294v6.f84381e) != null) {
                baseTextView23.setText(getString(R$string.pay_fiat_capitual_kyc_success));
            }
            FiatCapitualChannelMode fiatCapitualChannelMode = this.f37360V;
            if (C27025c.m66566d(fiatCapitualChannelMode != null ? fiatCapitualChannelMode.isWithdraw() : null)) {
                C37666p c37666pM44294v7 = m44294v3();
                if (c37666pM44294v7 != null && (baseTextView22 = c37666pM44294v7.f84379c) != null) {
                    baseTextView22.setText(getString(R$string.pay_fiat_capitual_kyc_success_continue_withdraw));
                }
                C37666p c37666pM44294v8 = m44294v3();
                if (c37666pM44294v8 != null && (baseTextView21 = c37666pM44294v8.f84382f) != null) {
                    baseTextView21.setText(getString(R$string.pay_fiat_capitual_kyc_success_withdraw_info));
                }
                C37666p c37666pM44294v9 = m44294v3();
                if (c37666pM44294v9 == null || (baseTextView20 = c37666pM44294v9.f84379c) == null) {
                    return;
                }
                C27046k.m66711z(baseTextView20, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.n0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatVerifyCapitualStatusFragment.m44273C3(this.f37388b);
                    }
                }, 1, null);
                return;
            }
            C37666p c37666pM44294v10 = m44294v3();
            if (c37666pM44294v10 != null && (baseTextView19 = c37666pM44294v10.f84379c) != null) {
                baseTextView19.setText(getString(R$string.pay_fiat_capitual_kyc_success_continue_deposit));
            }
            C37666p c37666pM44294v11 = m44294v3();
            if (c37666pM44294v11 != null && (baseTextView18 = c37666pM44294v11.f84382f) != null) {
                baseTextView18.setText(getString(R$string.pay_fiat_capitual_kyc_success_deposit_info));
            }
            C37666p c37666pM44294v12 = m44294v3();
            if (c37666pM44294v12 == null || (baseTextView17 = c37666pM44294v12.f84379c) == null) {
                return;
            }
            C27046k.m66711z(baseTextView17, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.o0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatVerifyCapitualStatusFragment.m44274D3(this.f37391b);
                }
            }, 1, null);
            return;
        }
        if (Intrinsics.areEqual(verifyStatus, "verifying")) {
            C37666p c37666pM44294v13 = m44294v3();
            if (c37666pM44294v13 != null && (baseTextView16 = c37666pM44294v13.f84379c) != null) {
                C27046k.m66685H(baseTextView16);
            }
            C37666p c37666pM44294v14 = m44294v3();
            if (c37666pM44294v14 != null && (baseTextView15 = c37666pM44294v14.f84380d) != null) {
                C27046k.m66685H(baseTextView15);
            }
            C37666p c37666pM44294v15 = m44294v3();
            if (c37666pM44294v15 != null && (imageView2 = c37666pM44294v15.f84378b) != null) {
                imageView2.setImageResource(R$mipmap.botc_ic_fiat_withdraw_process);
            }
            C37666p c37666pM44294v16 = m44294v3();
            if (c37666pM44294v16 != null && (baseTextView14 = c37666pM44294v16.f84381e) != null) {
                baseTextView14.setText(getString(R$string.pay_fiat_capitual_kyc_verifying));
            }
            C37666p c37666pM44294v17 = m44294v3();
            if (c37666pM44294v17 != null && (baseTextView13 = c37666pM44294v17.f84382f) != null) {
                baseTextView13.setText(getString(R$string.pay_fiat_capitual_kyc_verifying_info));
            }
            C37666p c37666pM44294v18 = m44294v3();
            if (c37666pM44294v18 != null && (baseTextView12 = c37666pM44294v18.f84379c) != null) {
                baseTextView12.setText(getString(R$string.fast_result_refresh));
            }
            C37666p c37666pM44294v19 = m44294v3();
            if (c37666pM44294v19 != null && (baseTextView11 = c37666pM44294v19.f84380d) != null) {
                baseTextView11.setText(getString(R$string.pay_fiat_capitual_kyc_failure_back));
            }
            C37666p c37666pM44294v20 = m44294v3();
            if (c37666pM44294v20 != null && (baseTextView10 = c37666pM44294v20.f84379c) != null) {
                C27046k.m66711z(baseTextView10, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.p0
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FiatVerifyCapitualStatusFragment.m44275E3(this.f37393b);
                    }
                }, 1, null);
            }
            C37666p c37666pM44294v21 = m44294v3();
            if (c37666pM44294v21 == null || (baseTextView9 = c37666pM44294v21.f84380d) == null) {
                return;
            }
            C27046k.m66711z(baseTextView9, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.q0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatVerifyCapitualStatusFragment.m44276F3();
                }
            }, 1, null);
            return;
        }
        C37666p c37666pM44294v22 = m44294v3();
        if (c37666pM44294v22 != null && (baseTextView8 = c37666pM44294v22.f84379c) != null) {
            C27046k.m66685H(baseTextView8);
        }
        C37666p c37666pM44294v23 = m44294v3();
        if (c37666pM44294v23 != null && (baseTextView7 = c37666pM44294v23.f84380d) != null) {
            C27046k.m66685H(baseTextView7);
        }
        C37666p c37666pM44294v24 = m44294v3();
        if (c37666pM44294v24 != null && (imageView = c37666pM44294v24.f84378b) != null) {
            imageView.setImageResource(R$mipmap.botc_ic_fiat_withdraw_fail);
        }
        C37666p c37666pM44294v25 = m44294v3();
        if (c37666pM44294v25 != null && (baseTextView6 = c37666pM44294v25.f84381e) != null) {
            baseTextView6.setText(getString(R$string.pay_fiat_capitual_kyc_failure));
        }
        C37666p c37666pM44294v26 = m44294v3();
        if (c37666pM44294v26 != null && (baseTextView5 = c37666pM44294v26.f84382f) != null) {
            baseTextView5.setText(getString(R$string.pay_fiat_capitual_kyc_failure_info));
        }
        C37666p c37666pM44294v27 = m44294v3();
        if (c37666pM44294v27 != null && (baseTextView4 = c37666pM44294v27.f84379c) != null) {
            baseTextView4.setText(getString(R$string.fast_result_buy_again));
        }
        C37666p c37666pM44294v28 = m44294v3();
        if (c37666pM44294v28 != null && (baseTextView3 = c37666pM44294v28.f84380d) != null) {
            baseTextView3.setText(getString(R$string.pay_fiat_capitual_kyc_failure_back));
        }
        C37666p c37666pM44294v29 = m44294v3();
        if (c37666pM44294v29 != null && (baseTextView2 = c37666pM44294v29.f84379c) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.r0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FiatVerifyCapitualStatusFragment.m44277G3(this.f37396b);
                }
            }, 1, null);
        }
        C37666p c37666pM44294v30 = m44294v3();
        if (c37666pM44294v30 == null || (baseTextView = c37666pM44294v30.f84380d) == null) {
            return;
        }
        C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.otc.fiat.recharge.capitual.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FiatVerifyCapitualStatusFragment.m44278H3();
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: C3 */
    public static final Unit m44273C3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment) {
        C37304a c37304a = C37304a.f82764a;
        FiatCapitualChannelMode fiatCapitualChannelMode = fiatVerifyCapitualStatusFragment.f37360V;
        InterfaceC37758j.a.m85159h(c37304a, C27041f.m66668h(fiatCapitualChannelMode != null ? fiatCapitualChannelMode.getFiatCurrency() : null), 1L, null, null, null, 28, null);
        fiatVerifyCapitualStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: D3 */
    public static final Unit m44274D3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment) {
        C37304a c37304a = C37304a.f82764a;
        FiatCapitualChannelMode fiatCapitualChannelMode = fiatVerifyCapitualStatusFragment.f37360V;
        InterfaceC37758j.a.m85157f(c37304a, C27041f.m66668h(fiatCapitualChannelMode != null ? fiatCapitualChannelMode.getFiatCurrency() : null), 1L, null, null, null, 28, null);
        fiatVerifyCapitualStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: F3 */
    public static final Unit m44276F3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: G3 */
    public static final Unit m44277G3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment) {
        C37304a c37304a = C37304a.f82764a;
        FiatCapitualChannelMode fiatCapitualChannelMode = fiatVerifyCapitualStatusFragment.f37360V;
        String str = C27025c.m66566d(fiatCapitualChannelMode != null ? fiatCapitualChannelMode.isWithdraw() : null) ? "WITHDRAW" : FastQuoteModel.PAY_RECHARGE;
        FiatCapitualChannelMode fiatCapitualChannelMode2 = fiatVerifyCapitualStatusFragment.f37360V;
        String strM66668h = C27041f.m66668h(fiatCapitualChannelMode2 != null ? fiatCapitualChannelMode2.getChannelId() : null);
        FiatCapitualChannelMode fiatCapitualChannelMode3 = fiatVerifyCapitualStatusFragment.f37360V;
        InterfaceC37758j.a.m85153b(c37304a, str, "", strM66668h, C27041f.m66668h(fiatCapitualChannelMode3 != null ? fiatCapitualChannelMode3.getFiatCurrency() : null), null, null, null, 112, null);
        fiatVerifyCapitualStatusFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: H3 */
    public static final Unit m44278H3() {
        InterfaceC37754f.a.m85130b(C37304a.f82764a, null, null, null, null, 15, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w3 */
    private final InterfaceC37240b m44290w3() {
        return (InterfaceC37240b) this.f37359U.getValue();
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment
    public int getLayout() {
        return R$layout.botc_fragment_fiat_capitual_status;
    }

    @Override // com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getTitleBar().m58934f();
        Bundle arguments = getArguments();
        String strM66668h = C27041f.m66668h(arguments != null ? RouteExKt.m56284y(arguments, "channelId") : null);
        Bundle arguments2 = getArguments();
        String strM66668h2 = C27041f.m66668h(arguments2 != null ? RouteExKt.m56284y(arguments2, FirebaseAnalytics.Param.CURRENCY) : null);
        Bundle arguments3 = getArguments();
        this.f37360V = new FiatCapitualChannelMode(strM66668h, strM66668h2, null, null, Boolean.valueOf(StringsKt.equals(C27041f.m66668h(arguments3 != null ? RouteExKt.m56284y(arguments3, "from") : null), "WITHDRAW", true)), 12, null);
        m44295x3();
    }

    /* JADX INFO: renamed from: v3 */
    public final C37666p m44294v3() {
        return (C37666p) this.f37361W.getValue(this, f37358X[0]);
    }

    /* JADX INFO: renamed from: A3 */
    public static final void m44272A3(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: E3 */
    public static final Unit m44275E3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment) {
        fiatVerifyCapitualStatusFragment.m44295x3();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final InterfaceC37240b m44289u3() {
        return (InterfaceC37240b) C42597a.m93386b().create(InterfaceC37240b.class);
    }

    /* JADX INFO: renamed from: y3 */
    public static final void m44291y3(FiatVerifyCapitualStatusFragment fiatVerifyCapitualStatusFragment, FiatVerifyCapitualStatus fiatVerifyCapitualStatus) {
        fiatVerifyCapitualStatusFragment.showContent();
        fiatVerifyCapitualStatusFragment.m44293B3(fiatVerifyCapitualStatus);
    }

    /* JADX INFO: renamed from: x3 */
    public final void m44295x3() {
        String channelId;
        InterfaceC37240b interfaceC37240bM44290w3 = m44290w3();
        FiatCapitualChannelMode fiatCapitualChannelMode = this.f37360V;
        if (fiatCapitualChannelMode != null) {
            channelId = fiatCapitualChannelMode.getChannelId();
        } else {
            channelId = null;
        }
        Observable<R> observableCompose = interfaceC37240bM44290w3.m83292e(C27041f.m66668h(channelId)).compose(C24217a1.m58389m());
        final Function1 function1 = new Function1() { // from class: com.kubi.otc.fiat.recharge.capitual.k0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FiatVerifyCapitualStatusFragment.m44292z3(this.f37381b, (Disposable) obj);
            }
        };
        Disposable disposableSubscribe = observableCompose.doOnSubscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.l0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatVerifyCapitualStatusFragment.m44272A3(function1, obj);
            }
        }).subscribe(new Consumer() { // from class: com.kubi.otc.fiat.recharge.capitual.m0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                FiatVerifyCapitualStatusFragment.m44291y3(this.f37386b, (FiatVerifyCapitualStatus) obj);
            }
        }, new C19723a());
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        CompositeDisposable compositeDisposable = getCompositeDisposable();
        Intrinsics.checkNotNullExpressionValue(compositeDisposable, "getCompositeDisposable(...)");
        DisposableKt.addTo(disposableSubscribe, compositeDisposable);
    }
}
