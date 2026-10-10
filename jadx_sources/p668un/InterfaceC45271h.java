package p668un;

import android.net.Uri;
import android.view.ViewStub;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: un.h */
/* JADX INFO: compiled from: IWalletLaunchSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H&J&\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0003H&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/launch/spi/IWalletLaunchSPI;", "", "web3WalletInUse", "", "web3WalletInStack", "isWeb3Path", "path", "", "walletPath", "showTransition", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "viewStub", "Landroid/view/ViewStub;", "toWallet", "(Lcom/kubi/sdk/BaseActivity;Landroid/view/ViewStub;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isWalletAvailable", "matchWcLink", "uri", "Landroid/net/Uri;", "getWcPath", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45271h {
    /* JADX INFO: renamed from: a */
    boolean mo66958a();

    /* JADX INFO: renamed from: b */
    boolean mo66959b();

    @Nullable
    /* JADX INFO: renamed from: c */
    String mo66960c();

    @NotNull
    /* JADX INFO: renamed from: d */
    String mo66961d(@NotNull BaseActivity baseActivity);

    /* JADX INFO: renamed from: e */
    boolean mo66962e(@NotNull String str);

    /* JADX INFO: renamed from: f */
    boolean mo66963f(@Nullable Uri uri);

    /* JADX INFO: renamed from: g */
    boolean mo66964g();

    @Nullable
    /* JADX INFO: renamed from: h */
    Object mo66965h(@NotNull BaseActivity baseActivity, @NotNull ViewStub viewStub, boolean z11, @NotNull Continuation<? super Unit> continuation);
}
