package p803yn;

import com.kubi.lite.utils.LiteState;
import com.kubi.lite.utils.LiteUtils;
import com.kubi.sdk.mode.AppMode;
import org.jetbrains.annotations.NotNull;
import p668un.InterfaceC45265b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: yn.a */
/* JADX INFO: compiled from: LiteLaunchSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/lite/service/LiteLaunchSPI;", "Lcom/kubi/launch/spi/ILiteLaunchSPI;", "<init>", "()V", "liteInUse", "", "liteInStack", "isLitePath", "path", "", "litePath", "isLiteAvailable", "showTransition", "", "activity", "Lcom/kubi/sdk/BaseActivity;", "viewStub", "Landroid/view/ViewStub;", "toWallet", "(Lcom/kubi/sdk/BaseActivity;Landroid/view/ViewStub;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LiteLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C46550a implements InterfaceC45265b {
    @Override // p668un.InterfaceC45265b
    /* JADX INFO: renamed from: a */
    public boolean mo100052a() {
        return LiteUtils.f32203a.m37700b();
    }

    @Override // p668un.InterfaceC45265b
    /* JADX INFO: renamed from: b */
    public boolean mo100053b() {
        return AppMode.INSTANCE.isLiteMode();
    }

    @Override // p668un.InterfaceC45265b
    /* JADX INFO: renamed from: c */
    public boolean mo100054c() {
        return LiteState.f32201a.m37696b();
    }

    @Override // p668un.InterfaceC45265b
    @NotNull
    /* JADX INFO: renamed from: d */
    public String mo100055d() {
        return "lite/home";
    }
}
