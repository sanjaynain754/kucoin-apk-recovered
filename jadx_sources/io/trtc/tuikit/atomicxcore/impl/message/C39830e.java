package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMMessageReactionUserResult;
import com.tencent.imsdk.p128v2.V2TIMUserInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.List;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.e */
/* JADX INFO: loaded from: classes61.dex */
public final class C39830e implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39850o f88495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88496b;

    public C39830e(C39850o c39850o, CompletionHandler completionHandler) {
        this.f88495a = c39850o;
        this.f88496b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88496b;
        if (completionHandler != null) {
            if (str == null) {
                str = "";
            }
            completionHandler.onFailure(i11, str);
        }
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onSuccess(Object obj) {
        Unit unit;
        V2TIMMessageReactionUserResult v2TIMMessageReactionUserResult = (V2TIMMessageReactionUserResult) obj;
        if (v2TIMMessageReactionUserResult != null) {
            C39850o c39850o = this.f88495a;
            CompletionHandler completionHandler = this.f88496b;
            c39850o.f88566g = v2TIMMessageReactionUserResult.getNextSeq();
            ArrayList arrayList = new ArrayList();
            List<V2TIMUserInfo> userInfoList = v2TIMMessageReactionUserResult.getUserInfoList();
            if (userInfoList != null) {
                Intrinsics.checkNotNull(userInfoList);
                for (V2TIMUserInfo v2UserInfo : userInfoList) {
                    Intrinsics.checkNotNull(v2UserInfo);
                    Intrinsics.checkNotNullParameter(v2UserInfo, "v2UserInfo");
                    String userID = v2UserInfo.getUserID();
                    if (userID == null) {
                        userID = "";
                    }
                    UserProfile userProfile = new UserProfile(userID, v2UserInfo.getNickName(), v2UserInfo.getFaceUrl(), null, null, null, null, null, null, null, 1016, null);
                    userProfile.setBirthday(Long.valueOf(v2UserInfo.getBirthday()));
                    arrayList.add(userProfile);
                }
            }
            c39850o.f88573n.setValue(arrayList);
            c39850o.f88574o.setValue(Boolean.valueOf(!v2TIMMessageReactionUserResult.getIsFinished()));
            if (completionHandler != null) {
                completionHandler.onSuccess();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        CompletionHandler completionHandler2 = this.f88496b;
        if (completionHandler2 != null) {
            completionHandler2.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Result is null");
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
