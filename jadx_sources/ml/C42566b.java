package ml;

import android.app.Activity;
import android.os.Bundle;
import com.blankj.utilcode.util.C5258a;
import com.kubi.kucoin.api.IKuFacadeService;
import com.kubi.lite.api.ILiteService;
import com.kubi.sdk.mode.AppMode;
import com.kubi.wallet.api.IWalletService;
import org.jetbrains.annotations.NotNull;
import p569qq.C43852m;
import p742wz.C45960a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: renamed from: ml.b */
/* JADX INFO: compiled from: LaunchAppModeHelp.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\"\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\r"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/LaunchAppModeHelp;", "", "<init>", "()V", "launcherProMode", "", "isAnimation", "", "launcherLiteMode", "bundle", "Landroid/os/Bundle;", "isForceNoAnim", "launcherWalletMode", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42566b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42566b f94258a = new C42566b();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m93334d(C42566b c42566b, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        c42566b.m93337c(z11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m93333b(C42566b c42566b, Bundle bundle, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        c42566b.m93336a(bundle, z11, z12);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m93335f(C42566b c42566b, Bundle bundle, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        c42566b.m93338e(bundle, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m93336a(@NotNull Bundle bundle, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        C44128b.m97266j("LiteTag", "launchAppMode lite");
        ILiteService.Companion companion = ILiteService.f32003a;
        companion.get().mo37532c();
        bundle.putString("flutterInitialRoute", "lite/home");
        AppMode.Companion companion2 = AppMode.INSTANCE;
        bundle.putString("from", companion2.getCurrentBizMode(AppMode.Pro).name());
        companion2.updateCurrentMode(AppMode.Lite);
        companion.get().mo37531b(bundle, z11, z12);
        C43852m.m96591c("B1ModeSwitchPopup", "liteBtn", null, null, 12, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m93337c(boolean z11) {
        C44128b.m97266j("LiteTag", "launchAppMode Pro");
        AppMode.Companion companion = AppMode.INSTANCE;
        AppMode appMode = AppMode.Pro;
        AppMode currentBizMode = companion.getCurrentBizMode(appMode);
        companion.updateCurrentMode(appMode);
        Activity activityM6125h = C5258a.m6125h();
        if (activityM6125h != null) {
            C45960a.f103398a.m101393h(activityM6125h, IKuFacadeService.f27711a.get().mo31925d(), currentBizMode, z11);
        }
        C43852m.m96591c("B1ModeSwitchPopup", "proBtn", null, null, 12, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m93338e(@NotNull Bundle bundle, boolean z11) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        C44128b.m97266j("LiteTag", "launchAppMode wallet");
        bundle.putString("flutterInitialRoute", "wallet/splash");
        AppMode.Companion companion = AppMode.INSTANCE;
        bundle.putString("from", companion.getCurrentBizMode(AppMode.Pro).name());
        companion.updateCurrentMode(AppMode.Web3);
        IWalletService.f54542a.get().mo66944d(bundle, z11);
        C43852m.m96591c("B1ModeSwitchPopup", "web3Btn", null, null, 12, null);
    }
}
