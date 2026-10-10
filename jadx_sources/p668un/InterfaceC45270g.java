package p668un;

import com.google.firebase.messaging.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p705vx.InterfaceC45661b;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: un.g */
/* JADX INFO: compiled from: IUserCenterSPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC45661b
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u0005H&J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/launch/spi/IUserCenterSPI;", "", "everydayFirstLogin", "", "hasLockState", "", "setLockState", "", "state", "isLockAb", "isSiteAb", "logout", "success", "Ljava/lang/Runnable;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "isNeedChangeSite", "LAppFacade_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC45270g {
    /* JADX INFO: renamed from: a */
    void mo65779a(@NotNull String str);

    /* JADX INFO: renamed from: b */
    void mo65780b(@NotNull Runnable runnable, @NotNull Runnable runnable2, boolean z11);

    /* JADX INFO: renamed from: c */
    boolean mo65781c();

    @Nullable
    /* JADX INFO: renamed from: d */
    String mo65782d();

    /* JADX INFO: renamed from: e */
    boolean mo65783e();

    /* JADX INFO: renamed from: h */
    boolean mo65784h();
}
