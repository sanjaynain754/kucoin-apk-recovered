package io.trtc.tuikit.atomicxcore.impl.message;

import com.tencent.imsdk.BaseConstants;
import com.tencent.imsdk.p128v2.V2TIMMessageReactionUserResult;
import com.tencent.imsdk.p128v2.V2TIMUserInfo;
import com.tencent.imsdk.p128v2.V2TIMValueCallback;
import io.trtc.tuikit.atomicxcore.api.CompletionHandler;
import io.trtc.tuikit.atomicxcore.api.login.UserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: io.trtc.tuikit.atomicxcore.impl.message.i */
/* JADX INFO: loaded from: classes61.dex */
public final class C39838i implements V2TIMValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C39850o f88524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CompletionHandler f88525b;

    public C39838i(C39850o c39850o, CompletionHandler completionHandler) {
        this.f88524a = c39850o;
        this.f88525b = completionHandler;
    }

    @Override // com.tencent.imsdk.p128v2.V2TIMValueCallback
    public final void onError(int i11, String str) {
        CompletionHandler completionHandler = this.f88525b;
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
            C39850o c39850o = this.f88524a;
            CompletionHandler completionHandler = this.f88525b;
            c39850o.f88566g = v2TIMMessageReactionUserResult.getNextSeq();
            if (v2TIMMessageReactionUserResult.getUserInfoList() != null) {
                List<V2TIMUserInfo> userInfoList = v2TIMMessageReactionUserResult.getUserInfoList();
                Intrinsics.checkNotNullExpressionValue(userInfoList, "getUserInfoList(...)");
                if (!userInfoList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    List<V2TIMUserInfo> userInfoList2 = v2TIMMessageReactionUserResult.getUserInfoList();
                    Intrinsics.checkNotNullExpressionValue(userInfoList2, "getUserInfoList(...)");
                    for (V2TIMUserInfo v2UserInfo : userInfoList2) {
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
                    InterfaceC41669n interfaceC41669n = c39850o.f88573n;
                    interfaceC41669n.setValue(CollectionsKt.plus((Collection) interfaceC41669n.getValue(), (Iterable) arrayList));
                }
            }
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
        CompletionHandler completionHandler2 = this.f88525b;
        if (completionHandler2 != null) {
            completionHandler2.onFailure(BaseConstants.ERR_INVALID_PARAMETERS, "Result is null");
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
