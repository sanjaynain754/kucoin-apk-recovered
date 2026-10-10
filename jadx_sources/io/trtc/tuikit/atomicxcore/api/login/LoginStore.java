package io.trtc.tuikit.atomicxcore.api.login;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.impl.login.C39796h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J4\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0014\u0010\u0019\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u001c\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/login/LoginStore;", "", "()V", "loginState", "Lio/trtc/tuikit/atomicxcore/api/login/LoginState;", "getLoginState", "()Lio/trtc/tuikit/atomicxcore/api/login/LoginState;", "sdkAppID", "", "getSdkAppID", "()I", "setSdkAppID", "(I)V", "addLoginListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lio/trtc/tuikit/atomicxcore/api/login/LoginListener;", FirebaseAnalytics.Event.LOGIN, "context", "Landroid/content/Context;", "userID", "", TUIConstants.TUILive.USER_SIG, "completion", "Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;", "logout", "removeLoginListener", "setSelfInfo", "userProfile", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "Companion", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public abstract class LoginStore {

    @JvmField
    @NotNull
    public static final LoginStore shared = new C39796h();
    private int sdkAppID;

    public abstract void addLoginListener(@NotNull LoginListener listener);

    @NotNull
    public abstract LoginState getLoginState();

    public abstract void login(@NotNull Context context, int sdkAppID, @NotNull String userID, @NotNull String userSig, @Nullable CompletionHandler completion);

    public abstract void logout(@Nullable CompletionHandler completion);

    public abstract void removeLoginListener(@NotNull LoginListener listener);

    public abstract void setSelfInfo(@NotNull UserProfile userProfile, @Nullable CompletionHandler completion);

    public static /* synthetic */ void login$default(LoginStore loginStore, Context context, int i11, String str, String str2, CompletionHandler completionHandler, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
        }
        if ((i12 & 16) != 0) {
            completionHandler = null;
        }
        loginStore.login(context, i11, str, str2, completionHandler);
    }

    public static /* synthetic */ void logout$default(LoginStore loginStore, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
        }
        if ((i11 & 1) != 0) {
            completionHandler = null;
        }
        loginStore.logout(completionHandler);
    }

    public static /* synthetic */ void setSelfInfo$default(LoginStore loginStore, UserProfile userProfile, CompletionHandler completionHandler, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSelfInfo");
        }
        if ((i11 & 2) != 0) {
            completionHandler = null;
        }
        loginStore.setSelfInfo(userProfile, completionHandler);
    }

    public final int getSdkAppID() {
        return this.sdkAppID;
    }

    public final void setSdkAppID(int i11) {
        this.sdkAppID = i11;
    }
}
