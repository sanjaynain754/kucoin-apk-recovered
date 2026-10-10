package io.trtc.tuikit.atomicxcore.impl.call;

import io.trtc.tuikit.atomicxcore.api.call.CallParticipantInfo;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import kotlinx.coroutines.flow.InterfaceC41635f;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.call.r */
/* JADX INFO: loaded from: classes61.dex */
public final class C39486r implements InterfaceC41635f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39491w f87660a;

    public C39486r(C39491w c39491w) {
        this.f87660a = c39491w;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC41635f
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        CallParticipantInfo callParticipantInfo;
        String userID;
        String nickname;
        String avatarURL;
        UserProfile userProfile = (UserProfile) obj;
        if (userProfile == null) {
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(((CallParticipantInfo) this.f87660a.f87673f.getValue()).getId(), userProfile.getUserID()) || !Intrinsics.areEqual(((CallParticipantInfo) this.f87660a.f87673f.getValue()).getName(), userProfile.getNickname()) || !Intrinsics.areEqual(((CallParticipantInfo) this.f87660a.f87673f.getValue()).getAvatarUrl(), userProfile.getAvatarURL())) {
            String message = "self info changed, id:" + userProfile.getUserID() + " name:" + userProfile.getNickname() + " avatar:" + userProfile.getAvatarURL();
            Intrinsics.checkNotNullParameter(message, "message");
            AbstractC39492x.m88243a(0, message);
            InterfaceC41669n interfaceC41669n = this.f87660a.f87673f;
            do {
                value = interfaceC41669n.getValue();
                callParticipantInfo = (CallParticipantInfo) value;
                userID = userProfile.getUserID();
                nickname = userProfile.getNickname();
                if (nickname == null) {
                    nickname = userProfile.getUserID();
                }
                avatarURL = userProfile.getAvatarURL();
                if (avatarURL == null) {
                    avatarURL = "";
                }
            } while (!interfaceC41669n.compareAndSet(value, CallParticipantInfo.copy$default(callParticipantInfo, userID, nickname, avatarURL, null, null, false, false, 120, null)));
        }
        return Unit.INSTANCE;
    }
}
