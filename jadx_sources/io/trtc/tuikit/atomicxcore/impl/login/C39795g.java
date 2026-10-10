package io.trtc.tuikit.atomicxcore.impl.login;

import com.tencent.imsdk.p128v2.V2TIMCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.AllowType;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import io.trtc.tuikit.atomicxcore.impl.barrage.AbstractC39465b;
import io.trtc.tuikit.atomicxcore.impl.common.C39510r;
import java.util.Map;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.g */
/* JADX INFO: loaded from: classes61.dex */
public final class C39795g implements V2TIMCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39796h f88425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ UserProfile f88426b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CompletionHandler f88427c;

    public C39795g(C39796h c39796h, UserProfile userProfile, CompletionHandler completionHandler) {
        this.f88425a = c39796h;
        this.f88426b = userProfile;
        this.f88427c = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onError(int i11, String str) {
        C39510r c39510r = this.f88425a.f88428a;
        String message = "Response: setSelfInfo failed code=" + i11 + ", desc=" + str;
        c39510r.getClass();
        Intrinsics.checkNotNullParameter(message, "message");
        c39510r.m88251a(2, message);
        CompletionHandler completionHandler = this.f88427c;
        if (completionHandler != null) {
            if (str == null) {
                str = "Unknown error";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMCallback
    public final void onSuccess() {
        String userID;
        AllowType allowType;
        Map<String, byte[]> customInfo;
        UserProfile userProfile = (UserProfile) this.f88425a.f88431d.getValue();
        InterfaceC41669n interfaceC41669n = this.f88425a.f88431d;
        if (userProfile == null || (userID = userProfile.getUserID()) == null) {
            userID = "";
        }
        String nickname = this.f88426b.getNickname();
        if (nickname == null) {
            nickname = userProfile != null ? userProfile.getNickname() : null;
        }
        String avatarURL = this.f88426b.getAvatarURL();
        if (avatarURL == null) {
            avatarURL = userProfile != null ? userProfile.getAvatarURL() : null;
        }
        String selfSignature = this.f88426b.getSelfSignature();
        if (selfSignature == null) {
            selfSignature = userProfile != null ? userProfile.getSelfSignature() : null;
        }
        Gender gender = this.f88426b.getGender();
        if (gender == null) {
            gender = userProfile != null ? userProfile.getGender() : null;
        }
        Integer role = this.f88426b.getRole();
        if (role == null) {
            role = userProfile != null ? userProfile.getRole() : null;
        }
        Integer level = this.f88426b.getLevel();
        if (level == null) {
            level = userProfile != null ? userProfile.getLevel() : null;
        }
        Long birthday = this.f88426b.getBirthday();
        if (birthday == null) {
            birthday = userProfile != null ? userProfile.getBirthday() : null;
        }
        AllowType allowType2 = this.f88426b.getAllowType();
        if (allowType2 == null) {
            allowType2 = userProfile != null ? userProfile.getAllowType() : null;
        }
        Map<String, byte[]> customInfo2 = this.f88426b.getCustomInfo();
        if (customInfo2 == null) {
            AllowType allowType3 = allowType2;
            customInfo = userProfile != null ? userProfile.getCustomInfo() : null;
            allowType = allowType3;
        } else {
            allowType = allowType2;
            customInfo = customInfo2;
        }
        interfaceC41669n.setValue(new UserProfile(userID, nickname, avatarURL, selfSignature, gender, role, level, birthday, allowType, customInfo));
        AbstractC39465b.m88232a(this.f88425a.f88428a, "Response: setSelfInfo success", "message", 0, "Response: setSelfInfo success");
        CompletionHandler completionHandler = this.f88427c;
        if (completionHandler != null) {
            completionHandler.onSuccess();
        }
    }
}
