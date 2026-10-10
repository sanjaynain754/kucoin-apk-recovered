package io.trtc.tuikit.atomicxcore.impl.login;

import com.tencent.imsdk.p128v2.V2TIMSDKListener;
import com.tencent.imsdk.p128v2.V2TIMUserFullInfo;
import io.trtc.tuikit.atomicxcore.api.login.AllowType;
import io.trtc.tuikit.atomicxcore.api.login.Gender;
import io.trtc.tuikit.atomicxcore.api.login.LoginStatus;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.login.f */
/* JADX INFO: loaded from: classes61.dex */
public final class C39794f extends V2TIMSDKListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39796h f88424a;

    public C39794f(C39796h c39796h) {
        this.f88424a = c39796h;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
    public final void onKickedOffline() {
        Object value;
        InterfaceC41669n interfaceC41669n = this.f88424a.f88430c;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, LoginStatus.UNLOGIN));
        this.f88424a.f88432e.m88249a((Function1) C39792d.f88422a);
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
    public final void onSelfInfoUpdated(V2TIMUserFullInfo v2TIMUserFullInfo) {
        if (v2TIMUserFullInfo == null) {
            return;
        }
        InterfaceC41669n interfaceC41669n = this.f88424a.f88431d;
        String userID = v2TIMUserFullInfo.getUserID();
        Intrinsics.checkNotNullExpressionValue(userID, "getUserID(...)");
        interfaceC41669n.setValue(new UserProfile(userID, v2TIMUserFullInfo.getNickName(), v2TIMUserFullInfo.getFaceUrl(), v2TIMUserFullInfo.getSelfSignature(), Gender.INSTANCE.parse(v2TIMUserFullInfo.getGender()), Integer.valueOf(v2TIMUserFullInfo.getRole()), Integer.valueOf(v2TIMUserFullInfo.getLevel()), Long.valueOf(v2TIMUserFullInfo.getBirthday()), AllowType.INSTANCE.parse(v2TIMUserFullInfo.getAllowType()), v2TIMUserFullInfo.getCustomInfo()));
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMSDKListener
    public final void onUserSigExpired() {
        Object value;
        InterfaceC41669n interfaceC41669n = this.f88424a.f88430c;
        do {
            value = interfaceC41669n.getValue();
        } while (!interfaceC41669n.compareAndSet(value, LoginStatus.UNLOGIN));
        this.f88424a.f88432e.m88249a((Function1) C39793e.f88423a);
    }
}
