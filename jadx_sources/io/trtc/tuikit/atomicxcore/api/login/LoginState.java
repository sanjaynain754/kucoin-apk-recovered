package io.trtc.tuikit.atomicxcore.api.login;

import io.trtc.tuikit.atomicxcore.api.barrage.AbstractC39393c;
import kotlinx.coroutines.flow.InterfaceC41678w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ2\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, m90084d2 = {"Lio/trtc/tuikit/atomicxcore/api/login/LoginState;", "", "Lkotlinx/coroutines/flow/w;", "Lio/trtc/tuikit/atomicxcore/api/login/LoginStatus;", "loginStatus", "Lio/trtc/tuikit/atomicxcore/api/login/UserProfile;", "loginUserInfo", "<init>", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)V", "component1", "()Lkotlinx/coroutines/flow/w;", "component2", "copy", "(Lkotlinx/coroutines/flow/w;Lkotlinx/coroutines/flow/w;)Lio/trtc/tuikit/atomicxcore/api/login/LoginState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/w;", "getLoginStatus", "getLoginUserInfo", "atomicxcore_release"}, m90085k = 1, m90086mv = {1, 9, 0}, m90088xi = 48)
public final /* data */ class LoginState {

    @NotNull
    private final InterfaceC41678w<LoginStatus> loginStatus;

    @NotNull
    private final InterfaceC41678w<UserProfile> loginUserInfo;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginState)) {
            return false;
        }
        LoginState loginState = (LoginState) other;
        return Intrinsics.areEqual(this.loginStatus, loginState.loginStatus) && Intrinsics.areEqual(this.loginUserInfo, loginState.loginUserInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginState(@NotNull InterfaceC41678w<? extends LoginStatus> loginStatus, @NotNull InterfaceC41678w<UserProfile> loginUserInfo) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        this.loginStatus = loginStatus;
        this.loginUserInfo = loginUserInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginState copy$default(LoginState loginState, InterfaceC41678w interfaceC41678w, InterfaceC41678w interfaceC41678w2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC41678w = loginState.loginStatus;
        }
        if ((i11 & 2) != 0) {
            interfaceC41678w2 = loginState.loginUserInfo;
        }
        return loginState.copy(interfaceC41678w, interfaceC41678w2);
    }

    @NotNull
    public final InterfaceC41678w<LoginStatus> component1() {
        return this.loginStatus;
    }

    @NotNull
    public final InterfaceC41678w<UserProfile> component2() {
        return this.loginUserInfo;
    }

    @NotNull
    public final LoginState copy(@NotNull InterfaceC41678w<? extends LoginStatus> loginStatus, @NotNull InterfaceC41678w<UserProfile> loginUserInfo) {
        Intrinsics.checkNotNullParameter(loginStatus, "loginStatus");
        Intrinsics.checkNotNullParameter(loginUserInfo, "loginUserInfo");
        return new LoginState(loginStatus, loginUserInfo);
    }

    @NotNull
    public final InterfaceC41678w<LoginStatus> getLoginStatus() {
        return this.loginStatus;
    }

    @NotNull
    public final InterfaceC41678w<UserProfile> getLoginUserInfo() {
        return this.loginUserInfo;
    }

    public int hashCode() {
        return this.loginUserInfo.hashCode() + (this.loginStatus.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LoginState(loginStatus=");
        sb2.append(this.loginStatus);
        sb2.append(", loginUserInfo=");
        return AbstractC39393c.m88222a(sb2, this.loginUserInfo, ')');
    }
}
