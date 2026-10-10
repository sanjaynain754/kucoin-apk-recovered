package com.kubi.payment.p106rn;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.kubi.payment.fast.data.entities.FiatCouponInfo;
import com.kubi.payment.fasttradev2.FastTradeViewModel;
import com.kubi.payment.fasttradev2.coupon.MarketingCouponDisplayDialog;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.C27099x;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tt.C45070a;
import tt.C45071b;

/* JADX INFO: compiled from: KCRNBridgePaymentCallImpl.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1", m90122f = "KCRNBridgePaymentCallImpl.kt", m90123i = {0, 0, 0, 0, 0}, m90124l = {636}, m90125m = "invokeSuspend", m90126n = {"viewModelFactory", "viewModel$delegate", "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
@SourceDebugExtension({"SMAP\nKCRNBridgePaymentCallImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 GsonUtils.kt\ncom/kubi/utils/GsonUtils\n*L\n1#1,620:1\n75#2,13:621\n196#3,3:634\n*S KotlinDebug\n*F\n+ 1 KCRNBridgePaymentCallImpl.kt\ncom/kubi/payment/rn/KCRNBridgePaymentCallImpl$showCouponPopup$1$1\n*L\n380#1:621,13\n381#1:634,3\n*E\n"})
public final class KCRNBridgePaymentCallImpl$showCouponPopup$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    final /* synthetic */ String $data;
    final /* synthetic */ FragmentActivity $this_run;
    final /* synthetic */ Activity $topActivity;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRNBridgePaymentCallImpl$showCouponPopup$1$1(FragmentActivity fragmentActivity, String str, Activity activity, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCRNBridgePaymentCallImpl$showCouponPopup$1$1> continuation) {
        super(2, continuation);
        this.$this_run = fragmentActivity;
        this.$data = str;
        this.$topActivity = activity;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRNBridgePaymentCallImpl$showCouponPopup$1$1(this.$this_run, this.$data, this.$topActivity, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRNBridgePaymentCallImpl$showCouponPopup$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: g */
    public static final FastTradeViewModel m49500g(Lazy<FastTradeViewModel> lazy) {
        return lazy.getValue();
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Lazy lazy;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        final Function0 function0 = null;
        if (i11 != 0) {
            if (i11 == 1) {
                lazy = (Lazy) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final C45071b c45071b = new C45071b(C45070a.m99667d(), BaseApplication.INSTANCE.get());
            final FragmentActivity fragmentActivity = this.$this_run;
            ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FastTradeViewModel.class), new Function0<ViewModelStore>() { // from class: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final ViewModelStore invoke() {
                    return fragmentActivity.getMViewModelStore();
                }

                {
                    super(0);
                }
            }, new Function0() { // from class: com.kubi.payment.rn.u
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KCRNBridgePaymentCallImpl$showCouponPopup$1$1.m49499f(c45071b);
                }
            }, new Function0<CreationExtras>() { // from class: com.kubi.payment.rn.KCRNBridgePaymentCallImpl$showCouponPopup$1$1$invokeSuspend$$inlined$viewModels$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // p852kotlin.jvm.functions.Function0
                @NotNull
                public final CreationExtras invoke() {
                    CreationExtras creationExtras;
                    Function0 function1 = function0;
                    return (function1 == null || (creationExtras = (CreationExtras) function1.invoke()) == null) ? fragmentActivity.getDefaultViewModelCreationExtras() : creationExtras;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            });
            C27099x c27099x = C27099x.f54458a;
            String str = this.$data;
            InterfaceC41634e interfaceC41634eM90890N = C41636g.m90890N(C41636g.m90887K(new C21353xf9af55e8(str, null)), C42911a.m94120b());
            this.L$0 = SpillingKt.nullOutSpilledVariable(c45071b);
            this.L$1 = viewModelLazy;
            this.L$2 = SpillingKt.nullOutSpilledVariable(c27099x);
            this.L$3 = SpillingKt.nullOutSpilledVariable(str);
            this.I$0 = 0;
            this.label = 1;
            obj = C41636g.m90914f0(interfaceC41634eM90890N, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            lazy = viewModelLazy;
        }
        FiatCouponInfo.Response response = (FiatCouponInfo.Response) obj;
        if (response != null) {
            m49500g(lazy).m47292S0(response);
        }
        new MarketingCouponDisplayDialog().m54194t3((FragmentActivity) this.$topActivity, "FastTradeMarketingCouponDialog");
        this.$callback.invoke(Boxing.boxBoolean(true), null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final ViewModelProvider.Factory m49499f(C45071b c45071b) {
        return c45071b;
    }
}
