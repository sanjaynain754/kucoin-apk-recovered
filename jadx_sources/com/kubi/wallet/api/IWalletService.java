package com.kubi.wallet.api;

import android.os.Bundle;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: IWalletService.kt */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/wallet/api/IWalletService;", "", "web3WalletInUse", "", "isWalletAvailable", "checkTransition", "mainActivity", "Lcom/kubi/sdk/BaseActivity;", "getTabWidth", "", "getExchangeTabText", "", "launchWalletFlutterActivity", "", "bundle", "Landroid/os/Bundle;", "animation", "Companion", "WalletApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IWalletService {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Companion f54542a = Companion.f54543a;

    /* JADX INFO: compiled from: IWalletService.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/wallet/api/IWalletService$Companion;", "", "<init>", "()V", "get", "Lcom/kubi/wallet/api/IWalletService;", "WalletApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f54543a = new Companion();

        @NotNull
        public final IWalletService get() {
            return (IWalletService) Router.f46192a.m56192n(IWalletService.class);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo66941a();

    /* JADX INFO: renamed from: b */
    boolean mo66942b();

    @NotNull
    /* JADX INFO: renamed from: c */
    String mo66943c();

    /* JADX INFO: renamed from: d */
    void mo66944d(@NotNull Bundle bundle, boolean z11);

    /* JADX INFO: renamed from: e */
    int mo66945e();

    /* JADX INFO: renamed from: f */
    boolean mo66946f(@NotNull BaseActivity baseActivity);
}
