package com.kubi.wallet.service;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.mode.SwitchConfig;
import com.kubi.sdk.mode.widget.SwitchLayout;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.kubi.wallet.R$id;
import com.kubi.wallet.R$layout;
import com.kubi.wallet.utils.WalletState;
import com.kubi.wallet.utils.WalletUtils;
import kotlinx.coroutines.C41777y;
import kotlinx.coroutines.InterfaceC41769w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p668un.InterfaceC45271h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: WalletLaunchSPI.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0013J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/wallet/service/WalletLaunchSPI;", "Lcom/kubi/launch/spi/IWalletLaunchSPI;", "<init>", "()V", "web3WalletInUse", "", "web3WalletInStack", "isWeb3Path", "path", "", "walletPath", "isWalletAvailable", "showTransition", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "viewStub", "Landroid/view/ViewStub;", "toWallet", "(Lcom/kubi/sdk/BaseActivity;Landroid/view/ViewStub;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matchWcLink", "uri", "Landroid/net/Uri;", "getWcPath", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class WalletLaunchSPI implements InterfaceC45271h {
    /* JADX INFO: renamed from: j */
    public static final Unit m66957j(InterfaceC41769w interfaceC41769w) {
        Unit unit = Unit.INSTANCE;
        interfaceC41769w.mo91370n(unit);
        return unit;
    }

    @Override // p668un.InterfaceC45271h
    /* JADX INFO: renamed from: a */
    public boolean mo66958a() {
        return WalletUtils.f54640a.m67007e();
    }

    @Override // p668un.InterfaceC45271h
    /* JADX INFO: renamed from: b */
    public boolean mo66959b() {
        return AppMode.INSTANCE.isWeb3Mode();
    }

    @Override // p668un.InterfaceC45271h
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo66961d(@NotNull BaseActivity activity) {
        Uri data;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = activity.getIntent();
        String string = (intent == null || (data = intent.getData()) == null) ? null : data.toString();
        if (string == null || string.length() == 0) {
            return "wallet/splash";
        }
        return "wallet/walletConnectwc?uri=" + Uri.encode(string);
    }

    @Override // p668un.InterfaceC45271h
    /* JADX INFO: renamed from: f */
    public boolean mo66963f(@Nullable Uri uri) {
        return Intrinsics.areEqual(uri != null ? uri.getScheme() : null, "wc");
    }

    @Override // p668un.InterfaceC45271h
    /* JADX INFO: renamed from: g */
    public boolean mo66964g() {
        return WalletState.f54638a.m66999b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // p668un.InterfaceC45271h
    @Nullable
    /* JADX INFO: renamed from: h */
    public Object mo66965h(@NotNull BaseActivity baseActivity, @NotNull ViewStub viewStub, boolean z11, @NotNull Continuation<? super Unit> continuation) {
        WalletLaunchSPI$showTransition$1 walletLaunchSPI$showTransition$1;
        if (continuation instanceof WalletLaunchSPI$showTransition$1) {
            walletLaunchSPI$showTransition$1 = (WalletLaunchSPI$showTransition$1) continuation;
            int i11 = walletLaunchSPI$showTransition$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                walletLaunchSPI$showTransition$1.label = i11 - Integer.MIN_VALUE;
            } else {
                walletLaunchSPI$showTransition$1 = new WalletLaunchSPI$showTransition$1(this, continuation);
            }
        } else {
            walletLaunchSPI$showTransition$1 = new WalletLaunchSPI$showTransition$1(this, continuation);
        }
        Object obj = walletLaunchSPI$showTransition$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = walletLaunchSPI$showTransition$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j("LiteTag", "WalletLaunchSPI showTransition");
                viewStub.setLayoutResource(R$layout.wallet_transition_viewstub);
                View viewInflate = viewStub.inflate();
                ViewExtKt.m66594y(viewStub);
                SwitchLayout switchLayout = (SwitchLayout) viewInflate.findViewById(R$id.switchLayout);
                if (switchLayout == null) {
                    return Unit.INSTANCE;
                }
                final InterfaceC41769w interfaceC41769wM91388c = C41777y.m91388c(null, 1, null);
                SwitchConfig switchConfig = new SwitchConfig(AppMode.INSTANCE.getCurrentBizMode(AppMode.Pro), AppMode.Web3, false, false, false, 0L, 0L, 0L, 0L, null, false, 2040, null);
                if (switchConfig.fromEqualTo()) {
                    C44128b.m97266j("LiteTag", "[showTransition] skip same mode");
                    return Unit.INSTANCE;
                }
                switchLayout.m57317y(switchConfig);
                switchLayout.m57312E(null, new Function0() { // from class: com.kubi.wallet.service.c
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletLaunchSPI.m66957j(interfaceC41769wM91388c);
                    }
                });
                walletLaunchSPI$showTransition$1.L$0 = SpillingKt.nullOutSpilledVariable(baseActivity);
                walletLaunchSPI$showTransition$1.L$1 = SpillingKt.nullOutSpilledVariable(viewStub);
                walletLaunchSPI$showTransition$1.L$2 = SpillingKt.nullOutSpilledVariable(viewInflate);
                walletLaunchSPI$showTransition$1.L$3 = SpillingKt.nullOutSpilledVariable(switchLayout);
                walletLaunchSPI$showTransition$1.L$4 = SpillingKt.nullOutSpilledVariable(interfaceC41769wM91388c);
                walletLaunchSPI$showTransition$1.L$5 = SpillingKt.nullOutSpilledVariable(switchConfig);
                walletLaunchSPI$showTransition$1.Z$0 = z11;
                walletLaunchSPI$showTransition$1.label = 1;
                if (interfaceC41769wM91388c.mo91198h(walletLaunchSPI$showTransition$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            C43840a.m96548b("wallet", "showTransition " + e11.getMessage());
        }
        return Unit.INSTANCE;
    }

    @Override // p668un.InterfaceC45271h
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo66960c() {
        return "wallet/splash";
    }

    @Override // p668un.InterfaceC45271h
    /* JADX INFO: renamed from: e */
    public boolean mo66962e(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return WalletUtils.f54640a.m67006d(path);
    }
}
