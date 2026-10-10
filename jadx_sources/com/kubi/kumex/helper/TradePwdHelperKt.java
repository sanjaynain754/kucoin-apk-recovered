package com.kubi.kumex.helper;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizType;
import com.kubi.data.constance.ValidationBizEnum;
import com.kubi.futures.FuturesRemote;
import com.kubi.kumex.R$string;
import com.kubi.kumex.service.KuMexDepend;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.dialog.BaseDialogFragment;
import com.kubi.safe.api.service.ITradeSecurityService;
import com.kubi.safe.api.tradesecurity.TradeSecurityScene;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.BaseFragment;
import com.kubi.user.api.IUserService;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37759k;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import p236em.C37214b;
import p244ey.C37276a;
import p244ey.InterfaceC37277b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TradePwdHelper.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000l\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001ao\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2)\u0010\u000b\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\r\u001a\u0087\u0001\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2)\u0010\u000b\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c\u001a¥\u0001\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2)\u0010\u000b\u001a%\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00060\f2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH\u0002\u001a\u0018\u0010\"\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020#H\u0002¨\u0006$"}, m90084d2 = {"checkHasSetPwd", "", TUIConstants.TUIChat.OWNER, "Landroidx/lifecycle/LifecycleOwner;", "ignoreTradePwd", "checkTradePwd", "", "fragment", "Lcom/kubi/sdk/BaseFragment;", "validationBizEnum", "Lcom/kubi/data/constance/ValidationBizEnum;", "observableFactory", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "validationToken", "Lio/reactivex/Observable;", "", "consumer", "Lio/reactivex/functions/Consumer;", "errorCallBack", "", "dataString", "checkTradePwdWithKcPrimaryButton", "Landroidx/fragment/app/Fragment;", "isShowLoadingDialog", "onCancelled", "Lkotlin/Function0;", "checkTradePwdViaGateway", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "addDisposable", "Lio/reactivex/disposables/Disposable;", "checkHasSetPwdImp", "Lcom/kubi/kumex/helper/ITradeWrapper;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TradePwdHelperKt {

    /* JADX INFO: renamed from: com.kubi.kumex.helper.TradePwdHelperKt$a */
    /* JADX INFO: compiled from: TradePwdHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/helper/TradePwdHelperKt$checkHasSetPwd$1", "Lcom/kubi/kumex/helper/ITradeWrapper;", "getSupportManager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16052a extends ITradeWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LifecycleOwner f29229a;

        public C16052a(LifecycleOwner lifecycleOwner) {
            this.f29229a = lifecycleOwner;
        }

        @Override // com.kubi.kumex.helper.ITradeWrapper
        /* JADX INFO: renamed from: a */
        public FragmentManager mo33947a() {
            FragmentManager childFragmentManager = ((BaseFragment) this.f29229a).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            return childFragmentManager;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.helper.TradePwdHelperKt$b */
    /* JADX INFO: compiled from: TradePwdHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/helper/TradePwdHelperKt$checkHasSetPwd$2", "Lcom/kubi/kumex/helper/ITradeWrapper;", "getSupportManager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16053b extends ITradeWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LifecycleOwner f29230a;

        public C16053b(LifecycleOwner lifecycleOwner) {
            this.f29230a = lifecycleOwner;
        }

        @Override // com.kubi.kumex.helper.ITradeWrapper
        /* JADX INFO: renamed from: a */
        public FragmentManager mo33947a() {
            FragmentManager supportFragmentManager = ((BaseActivity) this.f29230a).getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            return supportFragmentManager;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.helper.TradePwdHelperKt$c */
    /* JADX INFO: compiled from: TradePwdHelper.kt */
    @Metadata(m90083d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m90084d2 = {"com/kubi/kumex/helper/TradePwdHelperKt$checkHasSetPwd$3", "Lcom/kubi/kumex/helper/ITradeWrapper;", "getSupportManager", "Landroidx/fragment/app/FragmentManager;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C16054c extends ITradeWrapper {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LifecycleOwner f29231a;

        public C16054c(LifecycleOwner lifecycleOwner) {
            this.f29231a = lifecycleOwner;
        }

        @Override // com.kubi.kumex.helper.ITradeWrapper
        /* JADX INFO: renamed from: a */
        public FragmentManager mo33947a() {
            FragmentManager childFragmentManager = ((DialogFragment) this.f29231a).getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            return childFragmentManager;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m33919A(Fragment fragment, Disposable d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        DisposableKt.addTo(d11, ((BaseFragment) fragment).getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m33920B(Disposable disposable) {
        Intrinsics.checkNotNullParameter(disposable, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m33931k(@NotNull LifecycleOwner owner, boolean z11) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof BaseFragment) {
            return m33932l(z11, new C16052a(owner));
        }
        if (owner instanceof BaseActivity) {
            return m33932l(z11, new C16053b(owner));
        }
        if (owner instanceof DialogFragment) {
            return m33932l(z11, new C16054c(owner));
        }
        C37214b.m83257c("checkHasSetPwd owner is wrong", "TradePwdHelper");
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m33932l(boolean z11, ITradeWrapper iTradeWrapper) {
        if (KuMexDepend.f30378a.m35905g().d0().isWithDrawPassword()) {
            return true;
        }
        if (FuturesRemote.f23108a.m25651r() && z11) {
            return true;
        }
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.go_set_trade_pwd).m54162S4(R$string.go_set, new DialogInterface.OnClickListener() { // from class: com.kubi.kumex.helper.t0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                TradePwdHelperKt.m33933m(dialogInterface, i11);
            }
        }).m54159P4(R$string.cancel, null).show(iTradeWrapper.mo33947a(), "check_pwd_dialog");
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static final void m33933m(DialogInterface dialogInterface, int i11) {
        InterfaceC37759k.a.m85171e(C37304a.f82764a, "SET_WITHDRAWAL_PASSWORD", null, null, null, null, 30, null);
    }

    /* JADX INFO: renamed from: n */
    public static final void m33934n(@NotNull final BaseFragment fragment, @NotNull ValidationBizEnum validationBizEnum, @NotNull Function1<? super String, ? extends Observable<Object>> observableFactory, @NotNull Consumer<Object> consumer, @NotNull Consumer<Throwable> errorCallBack, boolean z11, @NotNull String dataString) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(validationBizEnum, "validationBizEnum");
        Intrinsics.checkNotNullParameter(observableFactory, "observableFactory");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(errorCallBack, "errorCallBack");
        Intrinsics.checkNotNullParameter(dataString, "dataString");
        m33938r(fragment, LifecycleOwnerKt.getLifecycleScope(fragment), true, validationBizEnum, observableFactory, consumer, errorCallBack, z11, new Function1() { // from class: com.kubi.kumex.helper.x0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TradePwdHelperKt.m33936p(fragment, (Disposable) obj);
            }
        }, dataString, null, 1024, null);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m33935o(BaseFragment baseFragment, ValidationBizEnum validationBizEnum, Function1 function1, Consumer consumer, Consumer consumer2, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 64) != 0) {
            str = "";
        }
        m33934n(baseFragment, validationBizEnum, function1, consumer, consumer2, z11, str);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m33936p(BaseFragment baseFragment, Disposable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DisposableKt.addTo(it, baseFragment.getDestroyDisposable());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final void m33937q(Fragment fragment, InterfaceC41709m0 interfaceC41709m0, boolean z11, ValidationBizEnum validationBizEnum, Function1<? super String, ? extends Observable<Object>> function1, Consumer<Object> consumer, final Consumer<Throwable> consumer2, boolean z12, Function1<? super Disposable, Unit> function2, String str, final Function0<Unit> function0) {
        C37276a c37276a;
        Fragment fragment2;
        TradeSecurityScene tradeSecurityScene;
        if (z11) {
            c37276a = null;
            fragment2 = fragment;
        } else {
            fragment2 = fragment;
            c37276a = new C37276a(fragment2);
        }
        final C37276a c37276a2 = c37276a;
        ValidationBizEnum validationBizEnum2 = ValidationBizEnum.CONTRACT_TRADE;
        if (validationBizEnum == validationBizEnum2 && BrokerConfig.f19211a.m20201d().mo4515x() == MultiBizType.UNIFIED) {
            tradeSecurityScene = TradeSecurityScene.UTA_CONTRACT_SUBMIT;
        } else {
            tradeSecurityScene = validationBizEnum == validationBizEnum2 ? TradeSecurityScene.CONTRACT_SUBMIT : TradeSecurityScene.CONTRACT_AMEND;
        }
        TradeSecurityScene tradeSecurityScene2 = tradeSecurityScene;
        ITradeSecurityService iTradeSecurityService = ITradeSecurityService.f46326a.get();
        if (iTradeSecurityService != null) {
            ITradeSecurityService.m56325b(iTradeSecurityService, tradeSecurityScene2, fragment2, interfaceC41709m0, str, c37276a2, z11, false, FuturesRemote.f23108a.m25651r() && z12, null, new Function0() { // from class: com.kubi.kumex.helper.z0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePwdHelperKt.m33940t();
                }
            }, new TradePwdHelperKt$checkTradePwdViaGateway$3(function2, function1, consumer, consumer2, null), new Function0() { // from class: com.kubi.kumex.helper.a1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TradePwdHelperKt.m33941u(c37276a2, function0);
                }
            }, new Function1() { // from class: com.kubi.kumex.helper.b1
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePwdHelperKt.m33942v(consumer2, (Throwable) obj);
                }
            }, 256, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m33938r(Fragment fragment, InterfaceC41709m0 interfaceC41709m0, boolean z11, ValidationBizEnum validationBizEnum, Function1 function1, Consumer consumer, Consumer consumer2, boolean z12, Function1 function2, String str, Function0 function0, int i11, Object obj) {
        m33937q(fragment, interfaceC41709m0, z11, validationBizEnum, function1, consumer, consumer2, z12, function2, (i11 & 512) != 0 ? "" : str, (i11 & 1024) != 0 ? new Function0() { // from class: com.kubi.kumex.helper.c1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradePwdHelperKt.m33939s();
            }
        } : function0);
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m33939s() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m33940t() {
        IUserService iUserService = IUserService.a.get();
        if (iUserService != null) {
            iUserService.B0();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m33941u(C37276a c37276a, Function0 function0) {
        if (c37276a != null) {
            InterfaceC37277b.m83449b(c37276a, false, 1, null);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m33942v(Consumer consumer, Throwable error) throws Exception {
        Intrinsics.checkNotNullParameter(error, "error");
        consumer.accept(error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final void m33943w(@NotNull final Fragment fragment, boolean z11, @NotNull ValidationBizEnum validationBizEnum, @NotNull Function1<? super String, ? extends Observable<Object>> observableFactory, @NotNull Consumer<Object> consumer, @NotNull Consumer<Throwable> errorCallBack, boolean z12, @NotNull String dataString, @NotNull Function0<Unit> onCancelled) {
        Function1 function1;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(validationBizEnum, "validationBizEnum");
        Intrinsics.checkNotNullParameter(observableFactory, "observableFactory");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(errorCallBack, "errorCallBack");
        Intrinsics.checkNotNullParameter(dataString, "dataString");
        Intrinsics.checkNotNullParameter(onCancelled, "onCancelled");
        boolean z13 = fragment instanceof BaseFragment;
        if (!z13 && !(fragment instanceof BaseDialogFragment)) {
            C37214b.m83257c("checkTradePwdWithKcPrimaryButton: unsupported fragment type", "TradePwdHelper");
            return;
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment);
        if (fragment instanceof BaseDialogFragment) {
            function1 = new Function1() { // from class: com.kubi.kumex.helper.u0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePwdHelperKt.m33946z(fragment, (Disposable) obj);
                }
            };
        } else {
            function1 = z13 ? new Function1() { // from class: com.kubi.kumex.helper.v0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePwdHelperKt.m33919A(fragment, (Disposable) obj);
                }
            } : new Function1() { // from class: com.kubi.kumex.helper.w0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TradePwdHelperKt.m33920B((Disposable) obj);
                }
            };
        }
        m33937q(fragment, lifecycleScope, z11, validationBizEnum, observableFactory, consumer, errorCallBack, z12, function1, dataString, onCancelled);
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m33945y() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m33946z(Fragment fragment, Disposable d11) {
        Intrinsics.checkNotNullParameter(d11, "d");
        ((BaseDialogFragment) fragment).m54185f3(d11);
        return Unit.INSTANCE;
    }
}
