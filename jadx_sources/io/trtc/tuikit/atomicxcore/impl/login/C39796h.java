package io.trtc.tuikit.atomicxcore.impl.login;

import android.content.Context;
import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMManager;
import com.tencent.imsdk.p128v2.V2TIMSDKConfig;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.AllowType;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import io.trtc.tuikit.atomicxcore.api.login.LoginListener;
import io.trtc.tuikit.atomicxcore.api.login.LoginState;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.api.login.LoginStore;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.api.view.AbstractC39398a;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39509q;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.h */
/* JADX INFO: loaded from: classes61.dex */
public final class C39796h extends LoginStore {

    /* JADX INFO: renamed from: a */
    public final C39510r f88428a = AbstractC39398a.m88229a("LoginStoreImpl", "file", "AtomicXCore-Live", "LoginStoreImpl");

    /* JADX INFO: renamed from: b */
    public C39794f f88429b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC41669n f88430c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC41669n f88431d;

    /* JADX INFO: renamed from: e */
    public final C39509q f88432e;

    /* JADX INFO: renamed from: f */
    public String f88433f;

    /* JADX INFO: renamed from: g */
    public String f88434g;

    /* JADX INFO: renamed from: h */
    public Context f88435h;

    /* JADX INFO: renamed from: i */
    public final LoginState f88436i;

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final void addLoginListener(LoginListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88432e.m88248a(listener);
    }

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final LoginState getLoginState() {
        return this.f88436i;
    }

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final void login(Context context, int i11, String userID, String userSig, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(userSig, "userSig");
        C39510r c39510r = this.f88428a;
        String message = "API: login called with sdkAppID=" + i11 + ", userID=" + userID;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        V2TIMSDKConfig v2TIMSDKConfig = new V2TIMSDKConfig();
        v2TIMSDKConfig.setLogLevel(4);
        if (!V2TIMManager.getInstance().initSDK(context, i11, v2TIMSDKConfig)) {
            AbstractC39465b.m88232a(this.f88428a, "API: login initSDK failed", "message", 2, "API: login initSDK failed");
            if (completionHandler != null) {
                completionHandler.onFailure(BaseConstants.ERR_SDK_NOT_INITIALIZED, "Initialization failed");
                return;
            }
            return;
        }
        if (this.f88429b == null) {
            C39794f c39794f = new C39794f(this);
            this.f88429b = c39794f;
            V2TIMManager.getInstance().addIMSDKListener(c39794f);
        }
        setSdkAppID(i11);
        this.f88433f = userID;
        this.f88434g = userSig;
        this.f88435h = context.getApplicationContext();
        V2TIMManager.getInstance().login(userID, userSig, new C39790b(this, completionHandler, userID));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final void logout(CompletionHandler completionHandler) {
        C39510r c39510r = this.f88428a;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter("API: logout called", "message");
        c39510r.m88251a(0, "API: logout called");
        V2TIMManager.getInstance().logout(new C39791c(this, completionHandler));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final void removeLoginListener(LoginListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f88432e.m88250b(listener);
    }

    public C39796h() {
        InterfaceC41669n interfaceC41669nM91009a = C41679x.m91009a(LoginStatus.UNLOGIN);
        this.f88430c = interfaceC41669nM91009a;
        InterfaceC41669n interfaceC41669nM91009a2 = C41679x.m91009a(null);
        this.f88431d = interfaceC41669nM91009a2;
        this.f88432e = new C39509q();
        this.f88433f = "";
        this.f88434g = "";
        this.f88436i = new LoginState(C41636g.m90907c(interfaceC41669nM91009a), C41636g.m90907c(interfaceC41669nM91009a2));
    }

    @Override // io.trtc.tuikit.atomicxcore.api.login.LoginStore
    public final void setSelfInfo(UserProfile userProfile, CompletionHandler completionHandler) {
        Intrinsics.checkNotNullParameter(userProfile, "userProfile");
        C39510r c39510r = this.f88428a;
        String message = "API: setSelfInfo called with userProfile=" + userProfile;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(0, message);
        V2TIMUserFullInfo v2TIMUserFullInfo = new V2TIMUserFullInfo();
        String nickname = userProfile.getNickname();
        if (nickname != null) {
            v2TIMUserFullInfo.setNickname(nickname);
        }
        String avatarURL = userProfile.getAvatarURL();
        if (avatarURL != null) {
            v2TIMUserFullInfo.setFaceUrl(avatarURL);
        }
        String selfSignature = userProfile.getSelfSignature();
        if (selfSignature != null) {
            v2TIMUserFullInfo.setSelfSignature(selfSignature);
        }
        Gender gender = userProfile.getGender();
        if (gender != null) {
            v2TIMUserFullInfo.setGender(gender.getValue());
        }
        Integer role = userProfile.getRole();
        if (role != null) {
            v2TIMUserFullInfo.setRole(role.intValue());
        }
        Integer level = userProfile.getLevel();
        if (level != null) {
            v2TIMUserFullInfo.setLevel(level.intValue());
        }
        Long birthday = userProfile.getBirthday();
        if (birthday != null) {
            v2TIMUserFullInfo.setBirthday(birthday.longValue());
        }
        AllowType allowType = userProfile.getAllowType();
        if (allowType != null) {
            v2TIMUserFullInfo.setAllowType(allowType.getValue());
        }
        Map<String, byte[]> customInfo = userProfile.getCustomInfo();
        if (customInfo != null) {
            v2TIMUserFullInfo.setCustomInfo(new HashMap<>(customInfo));
        }
        V2TIMManager.getInstance().setSelfInfo(v2TIMUserFullInfo, new C39795g(this, userProfile, completionHandler));
    }
}
