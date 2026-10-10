package com.kubi.wallet.service;

import android.content.Intent;
import android.os.Bundle;
import com.kubi.router.core.Router;
import com.kubi.router.utils.RouteExKt;
import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.utils.C27017c;
import com.kubi.wallet.R$string;
import com.kubi.wallet.api.IWalletService;
import com.kubi.wallet.p119ui.WalletFlutterActivity;
import com.kubi.wallet.utils.WalletState;
import com.kubi.wallet.utils.WalletUtils;
import e80.InterfaceC37098a;
import org.jetbrains.annotations.NotNull;
import p742wz.C45960a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: renamed from: com.kubi.wallet.service.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: WalletService.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/wallet/service/WalletService;", "Lcom/kubi/wallet/api/IWalletService;", "<init>", "()V", "web3WalletInUse", "", "isWalletAvailable", "checkTransition", "mainActivity", "Lcom/kubi/sdk/BaseActivity;", "getTabWidth", "", "getExchangeTabText", "", "launchWalletFlutterActivity", "", "bundle", "Landroid/os/Bundle;", "animation", "WalletLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nWalletService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletService.kt\ncom/kubi/wallet/service/WalletService\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,58:1\n17#2,2:59\n*S KotlinDebug\n*F\n+ 1 WalletService.kt\ncom/kubi/wallet/service/WalletService\n*L\n48#1:59,2\n*E\n"})
public final class WalletService implements IWalletService {
    @Override // com.kubi.wallet.api.IWalletService
    /* JADX INFO: renamed from: a */
    public boolean mo66941a() {
        return WalletUtils.f54640a.m67007e();
    }

    @Override // com.kubi.wallet.api.IWalletService
    /* JADX INFO: renamed from: b */
    public boolean mo66942b() {
        return WalletState.f54638a.m67000c();
    }

    @Override // com.kubi.wallet.api.IWalletService
    @NotNull
    /* JADX INFO: renamed from: c */
    public String mo66943c() {
        String strMo83026a;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC37098a.class, SiteInfoManager.f47913a.m58109c());
        return (objM56186h == null || (strMo83026a = ((InterfaceC37098a) objM56186h).mo83026a()) == null) ? C27017c.f54310a.m66516f(R$string.tab_exchange, new Object[0]) : strMo83026a;
    }

    @Override // com.kubi.wallet.api.IWalletService
    /* JADX INFO: renamed from: d */
    public void mo66944d(@NotNull Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        WalletFlutterActivity.f54625n.launch(bundle, z11);
    }

    @Override // com.kubi.wallet.api.IWalletService
    /* JADX INFO: renamed from: e */
    public int mo66945e() {
        return WalletUtils.f54640a.m67009i();
    }

    @Override // com.kubi.wallet.api.IWalletService
    /* JADX INFO: renamed from: f */
    public boolean mo66946f(@NotNull BaseActivity mainActivity) {
        Intrinsics.checkNotNullParameter(mainActivity, "mainActivity");
        Intent intent = mainActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        boolean zM56248g = RouteExKt.m56248g(intent, "wallet_animation", false);
        C44128b.m97266j("LiteTag", "WalletService checkTransition，showAnime=" + zM56248g);
        if (!zM56248g) {
            return false;
        }
        mainActivity.getIntent().removeExtra("wallet_animation");
        C45960a.f103398a.m101392g(mainActivity);
        return true;
    }
}
